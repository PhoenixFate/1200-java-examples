package chapter05;

import java.io.Serializable;

public class Address112 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String state;
	private String province;
	private String city;
	
	public Address112(String state, String province, String city) {
		super();
		this.state = state;
		this.province = province;
		this.city = city;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		StringBuilder sb=new StringBuilder();
		sb.append("state:"+state+",");
		sb.append("province:"+province+",");
		sb.append("city:"+city+",");
		return sb.toString();
	}
	
	
}
