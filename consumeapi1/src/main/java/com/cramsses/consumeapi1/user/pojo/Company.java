package com.cramsses.consumeapi1.user.pojo;

public class Company {
	private String name;
	private String catchPhrase;
	private String bs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [name=");
		builder.append(name);
		builder.append(", catchPhrase=");
		builder.append(catchPhrase);
		builder.append(", bs=");
		builder.append(bs);
		builder.append("]");
		return builder.toString();
	}
}
