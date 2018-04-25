package com.karvy.nsdl.controller;

import java.io.StringReader;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.karvy.nsdl.bean.EsignRespDTO;
import com.nsdl.esign.controller.EsignApplication;

@Controller
@RequestMapping("/esign")
public class ProcessController {

	@RequestMapping(value = "/resp", method = RequestMethod.POST)
	public String processRequest(HttpServletRequest req) {
		System.out.println("Vinod   ");
		
		/*byte[] bytesEncoded = Base64.encodeBase64(request.getParameter("msg").getBytes());*/
		String msg=(String) req.getParameter("msg");
		String obj=(String) req.getParameter("obj");
		
		System.out.println("esign Main ");

		  System.out.println("request  "+req.getParameter("msg"));  
	/*	  System.out.println("bytesEncoded   "+new String(bytesEncoded));*/
		  System.out.println("request   "+req.getParameter("obj"));
		  
		  
		  
		 /* StringBuffer outBuffer = new StringBuffer(request.getParameter("msg"));
		  String out =replacer(outBuffer);*/

		  System.out.println("Praveen Out   ----->   "+msg);
		  String parsh = msg+"";
		  
		  JAXBContext jaxbContext;
		  EsignRespDTO car = null;
		try {
			jaxbContext = JAXBContext.newInstance(EsignRespDTO.class);
		
		  Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		  StringReader reader = new StringReader(parsh);
		  car = (EsignRespDTO) jaxbUnmarshaller.unmarshal(reader);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		  //System.out.println(""+car.getErrCode());
		  System.out.println(""+car.getTs());
		  System.out.println(""+car.getTxn());
		  //System.out.println(""+car.getErrMsg());
		EsignApplication app = new EsignApplication();
		 // String m = app.getSignOnDocument(msg, "821932403485", "D:\\test\\nsdl\\files", "D:\\NSDL_Project\\NSDL\\tick.jpg", 420, 420);
		String m = app.getSignOnDocument(msg, "D:\\test\\nsdl\\files", "D:\\NSDL_Project\\NSDL\\tick.jpg", 420, 420, 5) ; 
		System.out.println("m    "+m);
		
		
		return null;
	}
}
