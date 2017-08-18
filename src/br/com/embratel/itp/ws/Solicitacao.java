package br.com.embratel.itp.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "Solicitacao", targetNamespace = "http://solicitacao/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Solicitacao {
	@WebMethod
	@WebResult(name = "responseCode")
	String solicitacao();
}
