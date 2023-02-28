package com.example.cittamobi;

public class Message {
    private String text;
    private long ts;
    private int companyId;
    private String companyType;
    private String companyName;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public long getTs() {
		return ts;
	}
	public void setTs(long ts) {
		this.ts = ts;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

    // getters e setters
    
}
