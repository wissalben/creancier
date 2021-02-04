package web.service.ListCreancier.api;


import web.ensapay.xml.creancier.Creancier;
import web.ensapay.xml.creancier.GetCreancierRequest;
import web.ensapay.xml.creancier.GetCreanciersResponse;
import web.service.ListCreancier.entities.Categorie;
import web.service.ListCreancier.services.CreancierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class CreancierListEndpoint {
    private static final String NAMESPACE_URI = "http://www.ensapay.com/xml/Creancier";

    @Autowired
    private CreancierService cService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCrRequest")
    @ResponsePayload
    public GetCreanciersResponse getBalance(@RequestPayload GetCreancierRequest getCrRequest) {
        GetCreanciersResponse getCreditorsResponse = new GetCreanciersResponse();

        
        List<Creancier> creditors = new ArrayList<>();
        for (web.service.ListCreancier.entities.Creancier c: cService.getCreanciers()
             ) {
            Creancier cr = new Creancier();
            cr.setName(c.getName());
            Categorie categorie = c.getCategorie();
            web.ensapay.xml.creancier.Categorie xmlCategorie = new  web.ensapay.xml.creancier.Categorie();
            xmlCategorie.setName(categorie.getName());
            cr.setCategorie(xmlCategorie);
            cr.setCode(c.getCode());

            creditors.add(cr);

        }

      getCreditorsResponse.setCreditors(creditors);

        return getCreditorsResponse;
    }
}
