package com.karvy.nsdl.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.karvy.nsdl.bean.FileBean;
import com.karvy.nsdl.bean.NsdlConstants;
import com.karvy.nsdl.service.NsdlService;
//This is the testing comment for git
@Controller
@Scope()
@RequestMapping("/nsdl")
public class NsdlController {
	@Autowired
	private NsdlService nsdlService;
	@Autowired
	NsdlConstants nsdlConstants;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView showHome() {
		return new ModelAndView("file-upload");
	}

	@RequestMapping(value = "/fileupload", method = RequestMethod.POST)
	public ModelAndView uploadFile(@ModelAttribute("fileBean") FileBean fileBean, Model model) {
		InputStream inputStream = null;
		OutputStream outputStream = null;

		MultipartFile file = fileBean.getMultipartFile();
		String fileName = file.getOriginalFilename();
		String fileDir = nsdlConstants.getPdfReadServerPath();

		try {
			inputStream = file.getInputStream();
			System.out.println(fileBean.getUid());
			File newFile = new File(fileDir + File.separator + fileBean.getUid());
			if (!newFile.exists()) {
				newFile.mkdir();
			} else {
				
			}
			System.out.println(newFile.toString());
			File uploadFile = new File(newFile + File.separator + fileName);
			if (!uploadFile.exists()) {
				uploadFile.createNewFile();
				System.out.println("Creating file..." + uploadFile);
			}
			outputStream = new FileOutputStream(uploadFile);
			int read = 0;
			byte[] bytes = new byte[1024];

			while ((read = inputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String requestXml = nsdlService.getRequestXml(fileBean);
		model.addAttribute("requestXml", requestXml);
		return new ModelAndView("request-form");
	}
	
}
