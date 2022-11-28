package pl.projekt;

import javax.persistence.*;

@Entity
@Table(name = "Producent")
public class Producent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProducenta", unique = true, nullable = false)
	private int idProducent;

	@Column(name = "nazwaProducenta", unique = true, nullable = false)
	private String nazwaProducenta;

	@Column(name = "kraj", unique = false, nullable = true)
	private String kraj;

	@Column(name = "opisProducenta", unique = false, nullable = true)
	private String opisProducenta;

	@ManyToOne(fetch = FetchType.LAZY)
	private List<Produkt> produkt;

	public Producent() {
	}

	public Producent(String nazwaProducenta,
			String kraj, String opisProducenta) {
		this.nazwaProducenta = nazwaProducenta;
		this.kraj = kraj;
		this.opisProducenta = opisProducenta;
	}

	public int getIdProducent() {
		return idProducent;
	}

	public void setIdProducent(int idProducent) {
		this.idProducent = idProducent;
	}

	public String getNazwaProducenta() {
		return nazwaProducenta;
	}

	public void setNazwaProducenta(String nazwaProducenta) {
		this.nazwaProducenta = nazwaProducenta;
	}

	public String getKraj() {
		return kraj;
	}

	public void setKraj(String kraj) {
		this.kraj = kraj;
	}

	public String getOpisProducenta() {
		return opisProducenta;
	}

	public void setOpisProducenta(String opisProducenta) {
		this.opisProducenta = opisProducenta;
	}

}
