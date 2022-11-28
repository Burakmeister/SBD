import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SztukiProduktu")
public class SztukiProduktu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSztukiProduktu", unique = true, nullable = false)
	private int idSztukiProduktu;

	@Column(name = "liczbaSztuk", unique = false, nullable = false)
	private int liczbaSztuk;

	@ManyToOne(fetch = FetchType.LAZY)
	private Zamowienie zamowienie;

	@ManyToOne(fetch = FetchType.LAZY)
	private Produkt produkt;

	@ManyToOne(fetch = FetchType.LAZY)
	private Koszyk koszyk;

	@ManyToOne(fetch = FetchType.LAZY)
	private Magazyn magazyn;

	public SztukiProduktu() {
	}

	public int getIdSztukiProduktu() {
		return idSztukiProduktu;
	}

	public void setIdSztukiProduktu(int idSztukiProduktu) {
		this.idSztukiProduktu = idSztukiProduktu;
	}

	public int getLiczbaSztuk() {
		return liczbaSztuk;
	}

	public void setLiczbaSztuk(int liczbaSztuk) {
		this.liczbaSztuk = liczbaSztuk;
	}

	public Zamowienie getZamowienie() {
		return zamowienie;
	}

	public void setZamowienie(Zamowienie zamowienie) {
		this.zamowienie = zamowienie;
	}

	public Produkt getProdukt() {
		return produkt;
	}

	public void setProdukt(Produkt produkt) {
		this.produkt = produkt;
	}

	public Koszyk getKoszyk() {
		return koszyk;
	}

	public void setKoszyk(Koszyk koszyk) {
		this.koszyk = koszyk;
	}
}
