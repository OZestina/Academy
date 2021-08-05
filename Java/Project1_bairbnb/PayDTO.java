// 2021.07.28 updated
// getter & setter 정리 예정

package pay;

public class PayDTO {

	private int payid;
	private String paydate;		//YYYY-MM-DD
	private String buyerid;
	private int proid;
	private String checkin;	//YYYY-MM-DD 
	private String checkout;	//YYYY-MM-DD
	private int payprice;
	
	public PayDTO(int payid, String paydate, String buyerid, int proid, 
			String checkin, String checkout, int payprice) {
		this.payid = payid;
		this.paydate = paydate;
		this.buyerid = buyerid;
		this.proid = proid;
		this.checkin = checkin;
		this.checkout = checkout;
		this.payprice = payprice;
	}

	public int getPayid() {
		return payid;
	}

	public void setPayid(int payid) {
		this.payid = payid;
	}

	public String getPaydate() {
		return paydate;
	}

	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}

	public String getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(String buyerid) {
		this.buyerid = buyerid;
	}

	public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public int getPayprice() {
		return payprice;
	}

	public void setPayprice(int payprice) {
		this.payprice = payprice;
	}

	@Override
	public String toString() {
		return "PayDTO [payid=" + payid + ", paydate=" + paydate + ", buyerid=" + buyerid + ", proid=" + proid
				+ ", checkin=" + checkin + ", checkout=" + checkout + ", payprice=" + payprice + "]";
	}
	
	
}