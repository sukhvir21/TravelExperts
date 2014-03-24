import java.util.ArrayList;


public class Package { 
	
	private int package_id;
	private String package_name;
	private String pkgStartDate;
	private String pkgEndDate;
	private String pkgDesc;
	private double pkgBasePrice;
	private double pkgAgencyComm;
	private ArrayList<Product> products= new ArrayList();
	
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	
	public int getPackage_id() {
		return package_id;
	}
	
	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public String getPkgStartDate() {
		return pkgStartDate;
	}
	public void setPkgStartDate(String pkgStartDate) {
		this.pkgStartDate = pkgStartDate;
	}
	public String getPkgEndDate() {
		return pkgEndDate;
	}
	public void setPkgEndDate(String pkgEndDate) {
		this.pkgEndDate = pkgEndDate;
	}
	public String getPkgDesc() {
		return pkgDesc;
	}
	public void setPkgDesc(String pkgDesc) {
		this.pkgDesc = pkgDesc;
	}
	public double getPkgBasePrice() {
		return pkgBasePrice;
	}
	public void setPkgBasePrice(double pkgBasePrice) {
		this.pkgBasePrice = pkgBasePrice;
	}
	public double getPkgAgencyComm() {
		return pkgAgencyComm;
	}
	public void setPkgAgencyComm(double pkgAgencyComm) {
		this.pkgAgencyComm = pkgAgencyComm;
	}

}
