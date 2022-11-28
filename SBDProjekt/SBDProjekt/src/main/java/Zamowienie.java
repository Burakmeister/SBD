import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Zamowienie")
public class Zamowienie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idZamowienia", unique = true, nullable = false)
	private int idZamowienia;

	private Date dataGodzina;

	@Column(name = "uwagi", nullable = false)
	private String uwagiDoZamowienia;

	@ManyToOne(fetch = FetchType.LAZY)
	private Magazyn magazyn;

	@ManyToOne(fetch = FetchType.LAZY)
	private Adres adres;

	@ManyToOne(fetch = FetchType.LAZY)
	private SposobRealizacji sposobRealizacji;

	@ManyToOne(fetch = FetchType.LAZY)
	private Uzytkownik uzytkownik;

	@OneToMany(mappedBy = "zamowienie")
	private List<SztukiProduktu> sztukiProduktu = new ArrayList<SztukiProduktu>();

	public Zamowienie() {
	}

	public Zamowienie(Date dataGodzina, String uwagiDoZamowienia,
			Adres adres, SposobRealizacji sposobRealizacji, Uzytkownik uzytkownik) {
		this.dataGodzina = dataGodzina;
		this.uwagiDoZamowienia = uwagiDoZamowienia;
		this.adres = adres;
		this.sposobRealizacji = sposobRealizacji;
		this.uzytkownik = uzytkownik;
	}

	public int getIdZamowienia() {
		return idZamowienia;
	}

	public void setIdZamowienia(int idZamowienia) {
		this.idZamowienia = idZamowienia;
	}

	public Date getDataGodzina() {
		return dataGodzina;
	}

	public void setDataGodzina(Date dataGodzina) {
		this.dataGodzina = dataGodzina;
	}

	public String getUwagiDoZamowienia() {
		return uwagiDoZamowienia;
	}

	public void setUwagiDoZamowienia(String uwagiDoZamowienia) {
		this.uwagiDoZamowienia = uwagiDoZamowienia;
	}

	public Magazyn getMagazyn() {
		return magazyn;
	}

	public void setMagazyn(Magazyn magazyn) {
		this.magazyn = magazyn;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public SposobRealizacji getSposobRealizacji() {
		return sposobRealizacji;
	}

	public void setSposobRealizacji(SposobRealizacji sposobRealizacji) {
		this.sposobRealizacji = sposobRealizacji;
	}

	public Uzytkownik getUzytkownik() {
		return uzytkownik;
	}

	public void setUzytkownik(Uzytkownik uzytkownik) {
		this.uzytkownik = uzytkownik;
	}

	public List<SztukiProduktu> getSztukiProduktu() {
		return this.sztukiProduktu;
	}

	public void setSztukiProduktu(List<SztukiProduktu> sztukiProduktu) {
		this.sztukiProduktu = sztukiProduktu;
	}

}
