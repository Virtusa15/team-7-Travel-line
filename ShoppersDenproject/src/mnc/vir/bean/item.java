package mnc.vir.bean;

import java.io.Serializable;

public class item implements Serializable
{
	private String iname;
	private int cost;
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "item [iname=" + iname + ", cost=" + cost + "]";
	}
	
	
}
