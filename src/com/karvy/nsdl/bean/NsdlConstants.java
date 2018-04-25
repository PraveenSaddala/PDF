package com.karvy.nsdl.bean;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NsdlConstants {
	@Autowired
	ServletContext servletContext;
	
	@Value("${pdfReadServerPath}")
	private String pdfReadServerPath;
	@Value("${aspId}")
	private String aspId;
	@Value("${authMode}")
	private String authMode;
	@Value("${responseUrl}")
	private String responseUrl;
	@Value("${uidaiCertificatePath}")
	private String uidaiCertificatePath;
	@Value("${p12CertificatePath}")
	private String p12CertificatePath;
	@Value("${p12CertiPwd}")
	private String p12CertiPwd;
	@Value("${tickImagePath}")
	private String tickImagePath;
	@Value("${xCo_ordinates}")
	private String xCo_ordinates;
	@Value("${yCo_ordinates}")
	private String yCo_ordinates;

	public String getPdfReadServerPath() {
		return pdfReadServerPath;
	}

	public void setPdfReadServerPath(String pdfReadServerPath) {
		this.pdfReadServerPath = pdfReadServerPath;
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

	public String getResponseUrl() {
		return responseUrl;
	}

	public void setResponseUrl(String responseUrl) {
		this.responseUrl = responseUrl;
	}

	public String getUidaiCertificatePath() {
		return getPath(uidaiCertificatePath);
	}

	public void setUidaiCertificatePath(String uidaiCertificatePath) {
		this.uidaiCertificatePath = uidaiCertificatePath;
	}

	public String getP12CertificatePath() {
		return getPath(p12CertificatePath);
	}

	public void setP12CertificatePath(String p12CertificatePath) {
		this.p12CertificatePath = p12CertificatePath;
	}

	public String getP12CertiPwd() {
		return p12CertiPwd;
	}

	public void setP12CertiPwd(String p12CertiPwd) {
		this.p12CertiPwd = p12CertiPwd;
	}

	public String getTickImagePath() {
		return getPath(tickImagePath);
	}

	public void setTickImagePath(String tickImagePath) {
		this.tickImagePath = tickImagePath;
	}

	public String getxCo_ordinates() {
		return xCo_ordinates;
	}

	public void setxCo_ordinates(String xCo_ordinates) {
		this.xCo_ordinates = xCo_ordinates;
	}

	public String getyCo_ordinates() {
		return yCo_ordinates;
	}

	public void setyCo_ordinates(String yCo_ordinates) {
		this.yCo_ordinates = yCo_ordinates;
	}

	@Override
	public String toString() {
		return "NsdlConstants [pdfReadServerPath=" + pdfReadServerPath + ", aspId=" + aspId + ", authMode=" + authMode
				+ ", responseUrl=" + responseUrl + ", uidaiCertificatePath=" + uidaiCertificatePath
				+ ", p12CertificatePath=" + p12CertificatePath + ", p12CertiPwd=" + p12CertiPwd + ", tickImagePath="
				+ tickImagePath + ", xCo_ordinates=" + xCo_ordinates + ", yCo_ordinates=" + yCo_ordinates + "]";
	}


	private String getPath(String value){
		return servletContext.getRealPath(value);
	}
}
