package entity;

public class Feedback {

	private String name;
	private String email;
	private String comments;
	
	@Override
	public String toString() {
		return "Feedback [name=" + name + ", email=" + email + ", comments=" + comments + "]";
	}
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
