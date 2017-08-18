package br.com.embratel.itp.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "Update", targetNamespace = "http://update/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Update {
	@WebMethod
	@WebResult(name = "responseCode")
	String update();
}
