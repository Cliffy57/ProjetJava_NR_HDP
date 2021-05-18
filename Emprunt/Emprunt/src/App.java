import java.util.Date;

public class Emprunt {

	private Date Datedeb;
  private Date DateFin;
	
	public int getDateDeb() {
		return Datedeb;
	}
	public void setDateDeb(Date DateDeb) {
		this.DateDeb = DateDeb;
	}
	public String getDateFin() {
		return DateFin;
	}
	public void setDateFin(Date DateFin) {
		this.DateFin = DateFin;
	}
	
}
