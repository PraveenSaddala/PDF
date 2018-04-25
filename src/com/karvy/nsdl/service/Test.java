package com.karvy.nsdl.service;

import com.nsdl.esign.controller.EsignApplication;

public class Test {

	public static void main(String[] args) {
		EsignApplication app = new EsignApplication();

		String s = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><EsignResp resCode=\"90b4e95ca290ccbd2f48b02c9989ff03\" status=\"1\" ts=\"2018-02-07T14:54:27\" txn=\"UKC:eSign:2898:20180207145422947\"><UserX509Certificate>MIIE/TCCA+WgAwIBAgIDAXx8MA0GCSqGSIb3DQEBCwUAMHwxCzAJBgNVBAYTAklOMSowKAYDVQQKEyFOU0RMIGUtR292IEluZnJhc3RydWN0dXJlIExpbWl0ZWQxHTAbBgNVBAsTFENlcnRpZnlpbmcgQXV0aG9yaXR5MSIwIAYDVQQDExlOU0RMZUdvdklzc3VpbmdDQTIwMTZUZXN0MB4XDTE4MDIwNzA5MjcwM1oXDTE4MDIwNzA5NTYwM1owggEOMQswCQYDVQQGEwJJTjEkMCIGA1UEAxMbU2FkZGFsYSBQcmF2ZWVuIEt1bWFyIFJlZGR5MSkwJwYDVQRBEyBhODE1M2FiZjY2Y2U0N2M4YTlmNTE2ODNlZTZkM2M1ZDEiMCAGA1UECRMZVmVua2F0ZXN3YXJhIFN3YW15IFN0cmVldDFKMEgGA1UELQNBADkxZDdiMjhhM2MyMGE2N2JiNTExZmY1ZjlkZjM3NDQ3NjVkODQyOTkwM2QwMzNkM2UzZmQ5NWU4ZThkZmU5NDExDzANBgNVBBETBjUxNjM5MDEUMBIGA1UEBxMLUHVsaXZlbmR1bGExFzAVBgNVBAgTDkFuZGhyYSBQcmFkZXNoMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyPGvCXqJ83XhuZvAsKbIOIBuNwJaAtFw6b2jyoX57ULMUJbFh/Bgkx1RmUQmfGiNRu3S19Pn9qQYCbFba6nuTyAR6n0Kk76FDMir9JqOqvfj+sZ/tiQO/9elAxknz7xJIEaTmyKL60B8k6sv8Zt4T/PpZNhou8PxJFj55tcPQMpuKvxOxFkIPALPs/ieCaTQ0O0Ol5J7Cr0jvAdY7bB0CeFQvVCHoKD2tucQzTt9JOag1ZVoPoeCQvlpX7WMDOiw4Psb4mGaA0D2R0xlWNHa59B6P4yBYOGJJw577v/lM21ooBo2LSr+TpS2D7bIE2MdcuPaw776ZuSEjRYcx50rwQIDAQABo4HzMIHwMBEGA1UdDgQKBAhDiG37ysCtDzCBtQYDVR0gBIGtMIGqMIGnBgdggmRkAgQBMIGbMEEGCCsGAQUFBwIBFjVodHRwczovL25zZGwuZWdvdi1jYS5jby5pbi9yZXBvc2l0b3J5L25zZGxlZ292Y3BzLnBkZjBWBggrBgEFBQcCAjBKGkhBYWRoYWFyIGUtS1lDLU9UUCBDbGFzcyBDZXJ0aWZpY2F0ZSBJc3N1ZWQgYnkgTlNETCBlLUdvdiBJc3N1aW5nIENBIFRlc3QwEwYDVR0jBAwwCoAIQG4UkjYuohwwDgYDVR0PAQH/BAQDAgbAMA0GCSqGSIb3DQEBCwUAA4IBAQAG6lNIH2+lV1h9Vioub6rPt67fGJM/gQAy0NAY/t+poT9ulmzV0g48K0eEiJrESBJjdy0/hJNT0enjP/mVmn0aUi7bmSj1634bcuZXzzo8DZt6HzJ7lFgINPNCo+Fyurqud8uuXeH/jPuECSUSumiJTBdmZdckwniU8wEhLclu2Y9KlRbnGTC3bsKIlMAdSI1Cv2B8DbB3yxo+cdBKj0qKVfoKsOc3Nv5RgnSDCKCOQAP09lxeJk/tAid8njGxnsUL1LM7Nw0zu1ZtrR8C5DY163azdwmNp5esO2sxzMr0Iv+UZJrUKobO463/W+iBk+pS15QAMbxsIeuh/GnqNJ32</UserX509Certificate><Signatures><DocSignature hashAlgorithm=\"SHA256\" id=\"1\">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</DocSignature></Signatures><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\"/><DigestValue>o+iSQJYBX5yDHDEpKp64tLf9VbxEFD3AQ2UKLFOQVTs=</DigestValue></Reference></SignedInfo><SignatureValue>zrk5K4DRj9Ovy07c+LCR14hvT8UjcsKqplOV1MCL4GyH7B35Ugz1LN21+nLoE1JJZGEB1by6wW1MUu+KfDzVnagN9yQu1TbzLMp4vCaHiy6VBkIyGiV9A5BJKnGv6QeQT2DuXO1s0Etx2Q1SOpWg+p510xcMCKQXTT4cdf6VI3bPc+g3BqJf9TOn72zqpsnFJbD8KvWvHinJFmzehFkBjUFGsIUKzfe9oWOj8M1vWUmNx5WlYtMRnd8J48opKgnRJQZbS6iPWqNpk/+fDERtRz301/Rqx/o0CItcLRkx9ol7Jtv9IOHeeaqS1huL1DcUtMx5ZLvCYNZQZYUnRtHNLQ==</SignatureValue><KeyInfo><X509Data><X509SubjectName>CN=DS NSDL E GOVERNANCE INFRASTRUCTURE LIMITED 3,2.5.4.51=#133331535420464c4f4f522054494d455320544f574552204b414d414c41204d494c4c5320434f4d504f554e44205342204d415247,STREET=MUMBAI,ST=MAHARASHTRA,2.5.4.17=#1306343030303133,OU=PAN TIN AND UID OPERATIONS,O=NSDL E GOVERNANCE INFRASTRUCTURE LIMITED,C=IN</X509SubjectName><X509Certificate>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</X509Certificate></X509Data></KeyInfo></Signature></EsignResp>";
		String vinod = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><EsignResp errCode=\"ESP-992\" errMsg=\"Only 1 documents is allowed to sign in one request\" resCode=\"66667adcfda7d65285209dde03fef447\" status=\"0\" ts=\"2018-02-07T15:30:12\" txn=\"UKC:eSign:5971:20180207153007624\"><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\"/><DigestValue>6D96Wh00V/cZLsdxGRpQxiWv8URsEi3BYVtaIe3xtmk=</DigestValue></Reference></SignedInfo><SignatureValue>cWuqoHjapojpxjPAqnk/9EiVnNZ1z+Wo9UaOyoi00zzh7CvMwU/L4f3FdDcWGjoKYTrYsincvadNtZ0C0OaDslV3CtimJ4MfiN0n/9kNgR0r3CiB3Y9kjqFI7yvAN3hdPJO8+9XsS5kvUEJmEO5dgWHgMgcXUDWwWlXRZ7M3anH7mFRD3dcBxkLtiYwzr6WcTTvp+CfRyCQvZI1V9nlP3T0SrM/3qaiDQ9OPy2AQsInSam28OxILiJtMAdy9MC3qcsgkRJ9fCBWIxGLLuDo+niI+3c4GXRDPYvBo1ollfrsbjekKb2GYLqWAPfyWb/n0Smb1aT52rYZQ+H6kDuR82g==</SignatureValue><KeyInfo><X509Data><X509SubjectName>CN=DS NSDL E GOVERNANCE INFRASTRUCTURE LIMITED 3,2.5.4.51=#133331535420464c4f4f522054494d455320544f574552204b414d414c41204d494c4c5320434f4d504f554e44205342204d415247,STREET=MUMBAI,ST=MAHARASHTRA,2.5.4.17=#1306343030303133,OU=PAN TIN AND UID OPERATIONS,O=NSDL E GOVERNANCE INFRASTRUCTURE LIMITED,C=IN</X509SubjectName><X509Certificate>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</X509Certificate></X509Data></KeyInfo></Signature></EsignResp>";
		/*String m = app.getSignOnDocument(vinod, "821932403485", "D:\\test\\nsdl\\files",
				"D:\\NSDL_Project\\NSDL\\tick.jpg", 420, 420);
		System.out.println("m    " + m);*/
	}

}
