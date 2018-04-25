package com.karvy.nsdl.service;

import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karvy.nsdl.bean.EsignDTO;
import com.karvy.nsdl.bean.FileBean;
import com.karvy.nsdl.bean.NsdlConstants;
import com.nsdl.esign.controller.EsignApplication;

@Service
public class NsdlService {
	@Autowired
	NsdlConstants nsdlConstants;
	EsignApplication esignApp;

	public String getRequestXml(FileBean fileBean) {
		esignApp = new EsignApplication();
		/*String reqXml = esignApp.geteSignRequestXml("821932403485", "D:\\test\\nsdl\\files", "ASPKSBLMUMTEST137", "1",
				"http://karvyekyc.com/esignResp/esign", "D:\\NSDL_Project\\NSDL\\uidai_preprod.cer",
				"D:\\NSDL_Project\\NSDL\\karvyonline_cert.pfx", "1", "D:\\NSDL_Project\\NSDL\\tick.jpg", 420, 420);*/
		String aadhaar = fileBean.getUid();
		String pdfReadServerPath = nsdlConstants.getPdfReadServerPath()+File.separator+fileBean.getUid()+File.separator+"52830.pdf";
		String aspId = nsdlConstants.getAspId();
		String authMode = nsdlConstants.getAuthMode();
		String responseUrl = nsdlConstants.getResponseUrl();
		String uidaiCertificatePath = nsdlConstants.getUidaiCertificatePath();
		String p12CertificatePath = nsdlConstants.getP12CertificatePath();
		String p12CertiPwd = nsdlConstants.getP12CertiPwd();
		String tickImagePath = nsdlConstants.getTickImagePath();
		String alias = "66177b7a5a11050516761e0445422b32_5face8bc-af25-400d-bba5-45e1c560fe61";
		int xCo_ordinates = Integer.parseInt(nsdlConstants.getxCo_ordinates());
		int yCo_ordinates = Integer.parseInt(nsdlConstants.getyCo_ordinates());

		System.out.println(nsdlConstants.toString());
		String requestXml = esignApp.geteSignRequestXml(aadhaar, pdfReadServerPath, aspId, authMode, responseUrl, p12CertificatePath, p12CertiPwd, tickImagePath, xCo_ordinates, yCo_ordinates, 5, alias);
		/*String requestXml = esignApp.geteSignRequestXml(aadhaar, pdfReadServerPath, aspId, authMode, responseUrl,
				uidaiCertificatePath, p12CertificatePath, p12CertiPwd, tickImagePath, xCo_ordinates, yCo_ordinates);*/
		System.out.println("requestXml ====> " + requestXml);
		JAXBContext jaxbContext;
		EsignDTO car =null;
		try {
			jaxbContext = JAXBContext.newInstance(EsignDTO.class);
		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		StringReader reader = new StringReader(requestXml);
		car = (EsignDTO) jaxbUnmarshaller.unmarshal(reader);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("txn    "+car.getTxn());
		return requestXml;
	}
}
