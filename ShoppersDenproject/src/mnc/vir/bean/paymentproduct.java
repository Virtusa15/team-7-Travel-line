package mnc.vir.bean;

public class paymentproduct {
	String uid;
	String name;
	int cost;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "paymentproduct [uid=" + uid + ", name=" + name + ", cost=" + cost + "]";
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

}
