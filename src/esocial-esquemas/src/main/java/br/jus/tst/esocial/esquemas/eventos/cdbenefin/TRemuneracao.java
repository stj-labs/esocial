//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.24 at 06:39:28 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenefin;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T_remuneracao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_remuneracao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefIn/v_S_01_00_00}TS_vrSalFx"/>
 *         &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefIn/v_S_01_00_00}TS_undSalFixo"/>
 *         &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefIn/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_remuneracao", propOrder = {
    "vrSalFx",
    "undSalFixo",
    "dscSalVar"
})
public class TRemuneracao {

    @XmlElement(required = true)
    protected BigDecimal vrSalFx;
    protected byte undSalFixo;
    protected String dscSalVar;

    /**
     * Gets the value of the vrSalFx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrSalFx() {
        return vrSalFx;
    }

    /**
     * Sets the value of the vrSalFx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrSalFx(BigDecimal value) {
        this.vrSalFx = value;
    }

    /**
     * Gets the value of the undSalFixo property.
     * 
     */
    public byte getUndSalFixo() {
        return undSalFixo;
    }

    /**
     * Sets the value of the undSalFixo property.
     * 
     */
    public void setUndSalFixo(byte value) {
        this.undSalFixo = value;
    }

    /**
     * Gets the value of the dscSalVar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscSalVar() {
        return dscSalVar;
    }

    /**
     * Sets the value of the dscSalVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscSalVar(String value) {
        this.dscSalVar = value;
    }

}
