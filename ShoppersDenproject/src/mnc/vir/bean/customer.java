package mnc.vir.bean;

public class customer {
private String name;
private String email;	
private Double mobile;
private String addr;
private String userid;

private String password;


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}





public Double getMobile() {
	return mobile;
}


public void setMobile(Double mobile) {
	this.mobile = mobile;
}


public String getAddr() {
	return addr;
}


public void setAddr(String addr) {
	this.addr = addr;
}


public String getUserid() {
	return userid;
}


public void setUserid(String userid) {
	this.userid = userid;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "customer [name=" + name + ", email=" + email + ", mobile=" + mobile
			+ ", addr=" + addr + ", userid=" + userid + ", password="
			+ password + "]";
}

}
