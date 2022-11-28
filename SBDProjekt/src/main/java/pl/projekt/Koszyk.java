package pl.projekt;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Koszyk")
public class Koszyk {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idKoszyka", unique = true, nullable = false)
	private int idKoszyka;

	@OneToMany(mappedBy = "koszyk")
	private List<SztukiProduktu> sztukiProduktu = new ArrayList<SztukiProduktu>();

	public Koszyk() {
	}

	public int getIdKoszyka() {
		return idKoszyka;
	}

	public void setIdKoszyka(int idKoszyka) {
		this.idKoszyka = idKoszyka;
	}

	public List<SztukiProduktu> getSztukiProduktu() {
		return sztukiProduktu;
	}

	public void setSztukiProduktu(List<SztukiProduktu> sztukiProduktu) {
		this.sztukiProduktu = sztukiProduktu;
	}
}
