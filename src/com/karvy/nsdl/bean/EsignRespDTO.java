package com.karvy.nsdl.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EsignResp")
@XmlAccessorType(XmlAccessType.FIELD)
public class EsignRespDTO {

	/*     */ @XmlAttribute(name = "status")
	/*     */ protected String status;
	/*     */ @XmlAttribute(name = "ts")
	/*     */ protected String ts;
	/*     */ @XmlAttribute(name = "txn")
	/*     */ protected String txn;
	/*     */ @XmlAttribute(name = "resCode")
	/*     */ protected String resCode;
	/*     */ @XmlAttribute(name = "errCode")
	/*     */ protected String errCode;
	/*     */ @XmlAttribute(name = "errMsg")
	/*     */ protected String errMsg;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getResCode() {
		return resCode;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
