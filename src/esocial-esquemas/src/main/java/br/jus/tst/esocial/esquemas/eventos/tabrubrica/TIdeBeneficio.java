//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.24 at 06:40:17 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabrubrica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHAVE_GRUPO: {cpfBenef*}, {nrBeneficio*}
 * 
 * <p>Java class for T_ideBeneficio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_ideBeneficio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_cpf"/>
 *         &lt;element name="nrBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_nrBeneficio"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideBeneficio", propOrder = {
    "cpfBenef",
    "nrBeneficio"
})
public class TIdeBeneficio {

    @XmlElement(required = true)
    protected String cpfBenef;
    @XmlElement(required = true)
    protected String nrBeneficio;

    /**
     * Gets the value of the cpfBenef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfBenef() {
        return cpfBenef;
    }

    /**
     * Sets the value of the cpfBenef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfBenef(String value) {
        this.cpfBenef = value;
    }

    /**
     * Gets the value of the nrBeneficio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrBeneficio() {
        return nrBeneficio;
    }

    /**
     * Sets the value of the nrBeneficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrBeneficio(String value) {
        this.nrBeneficio = value;
    }

}
