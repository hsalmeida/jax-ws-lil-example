package br.com.embratel.itp.ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(endpointInterface = "br.com.embratel.itp.ws.Update")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class UpdateWS implements Update {

	@Override
	public String update() {
		return null;
	}

}
