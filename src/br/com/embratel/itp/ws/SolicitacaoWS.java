package br.com.embratel.itp.ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(endpointInterface = "br.com.embratel.itp.ws.Solicitacao")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SolicitacaoWS implements Solicitacao {

	@Override
	public String solicitacao() {
		return null;
	}

}
