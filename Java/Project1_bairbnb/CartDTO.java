// 2021.07.28 updated
// setter&getter 정리 필요

package cart;

public class CartDTO {
	
	private int cartidx;
	private String buyerid;
	private int proid;
	private String ccheckin;	//YYYY-MM-DD 
	private String ccheckout;	//YYYY-MM-DD
	private int cartprice;
	
	//장바구니 create
	public CartDTO(String buyerid, int proid, String ccheckin, String ccheckout, int cartprice) {
		this.buyerid = buyerid;
		this.proid = proid;
		this.ccheckin = ccheckin;
		this.ccheckout = ccheckout;
		this.cartprice = cartprice;
	}
	
	//장바구니 read&update*delete
	public CartDTO(int cartidx, String buyerid, int proid, String ccheckin, String ccheckout, int cartprice) {
		this.cartidx = cartidx;
		this.buyerid = buyerid;
		this.proid = proid;
		this.ccheckin = ccheckin;
		this.ccheckout = ccheckout;
		this.cartprice = cartprice;
	}
	
	public int getCartidx() {
		return cartidx;
	}
	
	public String getBuyerid() {
		return buyerid;
	}

	public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public String getCcheckin() {
		return ccheckin;
	}

	public void setCcheckin(String ccheckin) {
		this.ccheckin = ccheckin;
	}

	public String getCcheckout() {
		return ccheckout;
	}

	public void setCcheckout(String ccheckout) {
		this.ccheckout = ccheckout;
	}

	public int getCartprice() {
		return cartprice;
	}

	public void setCartprice(int cartprice) {
		this.cartprice = cartprice;
	}

	@Override
	public String toString() {
		return "CartDTO [cartidx=" + cartidx + ", buyerid=" + buyerid + ", proid=" + proid + ", ccheckin=" + ccheckin
				+ ", ccheckout=" + ccheckout + ", cartprice=" + cartprice + "]";
	}

	
	
	
}
