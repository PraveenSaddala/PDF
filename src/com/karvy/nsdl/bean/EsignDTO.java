package com.karvy.nsdl.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Esign")
@XmlAccessorType(XmlAccessType.FIELD)

public class EsignDTO {

	@XmlAttribute(name = "ekycId", required = true)
	protected String ekycId;
	@XmlAttribute(name = "ver", required = true)
	protected String ver;
	@XmlAttribute(name = "sc", required = true)
	protected String sc;
	@XmlAttribute(name = "ts", required = true)
	protected String ts;
	@XmlAttribute(name = "txn", required = true)
	protected String txn;
	@XmlAttribute(name = "aspId", required = true)
	protected String aspId;
	@XmlAttribute(name = "AuthMode", required = true)
	protected String authMode;

	public String getEkycId() {
		return ekycId;
	}

	public void setEkycId(String ekycId) {
		this.ekycId = ekycId;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getSc() {
		return sc;
	}

	public void setSc(String sc) {
		this.sc = sc;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getTxn() {
		return txn;
	}

	public void setTxn(String txn) {
		this.txn = txn;
	}

	public String getAspId() {
		return aspId;
	}

	public void setAspId(String aspId) {
		this.aspId = aspId;
	}

	public String getAuthMode() {
		return authMode;
	}

	public void setAuthMode(String authMode) {
		this.authMode = authMode;
	}

}
