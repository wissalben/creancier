//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.02.04 à 03:04:05 PM CET 
//


package web.ensapay.xml.creancier;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ensapay.xml.creancier package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ensapay.xml.creancier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCreancierRequest }
     * 
     */
    public GetCreancierRequest createGetCreancierRequest() {
        return new GetCreancierRequest();
    }

    /**
     * Create an instance of {@link GetCreanciersResponse }
     * 
     */
    public GetCreanciersResponse createGetCreanciersResponse() {
        return new GetCreanciersResponse();
    }

    /**
     * Create an instance of {@link Creancier }
     * 
     */
    public Creancier createCreancier() {
        return new Creancier();
    }

    /**
     * Create an instance of {@link Categorie }
     * 
     */
    public Categorie createCategorie() {
        return new Categorie();
    }

}
