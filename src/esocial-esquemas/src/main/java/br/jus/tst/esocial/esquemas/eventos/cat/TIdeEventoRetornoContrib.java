//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.15 at 02:18:15 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHAVE_GRUPO: {indApuracao*}, {perApur*}
 * 
 * <p>Java class for T_ideEvento_retorno_contrib complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_ideEvento_retorno_contrib">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_indApuracao"/>
 *         &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_perApur"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEvento_retorno_contrib", propOrder = {
    "indApuracao",
    "perApur"
})
public class TIdeEventoRetornoContrib {

    protected byte indApuracao;
    @XmlElement(required = true)
    protected String perApur;

    /**
     * Gets the value of the indApuracao property.
     * 
     */
    public byte getIndApuracao() {
        return indApuracao;
    }

    /**
     * Sets the value of the indApuracao property.
     * 
     */
    public void setIndApuracao(byte value) {
        this.indApuracao = value;
    }

    /**
     * Gets the value of the perApur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerApur() {
        return perApur;
    }

    /**
     * Sets the value of the perApur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerApur(String value) {
        this.perApur = value;
    }

}
