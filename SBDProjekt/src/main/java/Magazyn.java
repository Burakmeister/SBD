import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Magazyn")
public class Magazyn {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMagazynu", unique = true, nullable = false)
	private int idMagazynu;

	@Column(name = "pojemnosc", unique = false, nullable = false)
	private int pojemnosc;

	@OneToOne
	@JoinColumn(name = "magazyn")
	private Adres adres;

	@OneToMany(mappedBy = "magazyn")
	private List<SztukiProduktu> sztukiProduktu = new ArrayList<SztukiProduktu>();

	@OneToMany(mappedBy = "magazyn")
	private List<Zamowienie> zamowienie = new ArrayList<Zamowienie>();

	public Magazyn() {
	}

	public Magazyn(int pojemnosc, Adres adres) {
		this.pojemnosc = pojemnosc;
		this.adres = adres;
	}

	public int getIdMagazynu() {
		return idMagazynu;
	}

	public void setIdMagazynu(int idMagazynu) {
		this.idMagazynu = idMagazynu;
	}

	public int getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(int pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public List<SztukiProduktu> getSztukiProduktu() {
		return sztukiProduktu;
	}

	public void setSztukiProduktu(List<SztukiProduktu> sztukiProduktu) {
		this.sztukiProduktu = sztukiProduktu;
	}

}
