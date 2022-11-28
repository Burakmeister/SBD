package pl.projekt;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Uzytkownik")
public class Uzytkownik {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUzytkownika", unique = true, nullable = false)
	private int idUzytkownika;

	@Column(name = "imie", unique = false, nullable = false)
	private String imie;

	@Column(name = "nazwisko", unique = false, nullable = false)
	private String nazwisko;

	@Column(name = "nickname", unique = false, nullable = false)
	private String nickname;

	@Column(name = "dataZalozeniaKonta", unique = false, nullable = false)
	private Date dataZalozeniaKonta;

	@Column(name = "uprawnieniaAdministratora", unique = false, nullable = false)
	private boolean uprawnieniaAdministratora;

	@OneToOne
	@JoinColumn(name = "Koszyk")
	private Koszyk koszyk;

	public Uzytkownik() {
	}

	public Uzytkownik(String imie, String nazwisko, String nickname, Date dataZalozeniaKonta,
			boolean uprawnieniaAdministratora) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nickname = nickname;
		this.dataZalozeniaKonta = dataZalozeniaKonta;
		this.uprawnieniaAdministratora = uprawnieniaAdministratora;
	}

	public int getIdUzytkownika() {
		return idUzytkownika;
	}

	public void setIdUzytkownika(int idUzytkownika) {
		this.idUzytkownika = idUzytkownika;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getDataZalozeniaKonta() {
		return dataZalozeniaKonta;
	}

	public void setDataZalozeniaKonta(Date dataZalozeniaKonta) {
		this.dataZalozeniaKonta = dataZalozeniaKonta;
	}

	public boolean isUprawnieniaAdministratora() {
		return uprawnieniaAdministratora;
	}

	public void setUprawnieniaAdministratora(boolean uprawnieniaAdministratora) {
		this.uprawnieniaAdministratora = uprawnieniaAdministratora;
	}

	public Koszyk getKoszyk() {
		return koszyk;
	}

	public void setKoszyk(Koszyk koszyk) {
		this.koszyk = koszyk;
	}

}
