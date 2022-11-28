import javax.persistence.*;

@Entity
@Table(name = "Produkt")
public class Produkt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProduktu", unique = true, nullable = false)
	private int idProduktu;

	@Column(name = "nazwaProduktu", unique = true, nullable = false)
	private String nazwaProduktu;

	@Column(name = "cena", unique = false, nullable = false)
	private float cena;

	@Column(name = "opis", unique = false, nullable = false)
	private String opis;

	@Column(name = "masa", unique = false, nullable = true)
	private float masa;

	@ManyToOne(fetch = FetchType.LAZY)
	private Kategoria kategoria;

	@ManyToOne(fetch = FetchType.LAZY)
	private Producent producent;

	public Produkt() {
	}

	public Produkt(String nazwaProduktu, float cena,
			String opis, float masa, int iloscNaStanie, Kategoria kategoria, Producent producent) {
		this.nazwaProduktu = nazwaProduktu;
		this.cena = cena;
		this.opis = opis;
		this.masa = masa;
		this.kategoria = kategoria;
		this.producent = producent;
	}

	public int getIdaProduktu() {
		return idProduktu;
	}

	public void setIdProduktu(int idProduktu) {
		this.idProduktu = idProduktu;
	}

	public String getNazwaProduktu() {
		return nazwaProduktu;
	}

	public void setNazwaProduktu(String nazwaProduktu) {
		this.nazwaProduktu = nazwaProduktu;
	}

	public float getCena() {
		return cena;
	}

	public void setCena(float cena) {
		this.cena = cena;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public float getMasa() {
		return masa;
	}

	public void setMasa(float masa) {
		this.masa = masa;
	}

	public Kategoria getKategoria() {
		return kategoria;
	}

	public void setKategoria(Kategoria kategoria) {
		this.kategoria = kategoria;
	}

	public Producent getProducent() {
		return producent;
	}

	public void setProducent(Producent producent) {
		this.producent = producent;
	}
}
