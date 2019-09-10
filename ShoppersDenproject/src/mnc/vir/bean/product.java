package mnc.vir.bean;

public class product {
private String pid;
private String ptype;
private int cost;
private String img;
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getPtype() {
	return ptype;
}
public void setPtype(String ptype) {
	this.ptype = ptype;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
@Override
public String toString() {
	return "product [pid=" + pid + ", ptype=" + ptype + ", cost=" + cost + ", img=" + img + "]";
}

}