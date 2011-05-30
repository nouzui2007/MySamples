package jp.ccube.MySamples;

import java.io.Serializable;

public class MyEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int property1;
	private String property2;
	
	public MyEntity() {
		this.property1 = 0;
		this.property2 = null;
	}
	
	public MyEntity(int property1, String property2) {
		this.property1 = property1;
		this.property2 = property2;
	}
	
	public void setProperty1(int property1) {
		this.property1 = property1;
	}
	public int getProperty1() {
		return this.property1;
	}
	public void setProperty2(String property2) {
		this.property2 = property2;
	}
	public String getProperty2() {
		return this.property2;
	}
}
