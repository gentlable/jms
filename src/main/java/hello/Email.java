package hello;

public class Email {
	private String to;
	private String body;

	public Email() {

	}

	public Email(String to, String body) {
		super();
		this.to = to;
		this.body = body;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return String.format("Email{to=%s,body=%s}", getTo(), getBody());
	}

}
