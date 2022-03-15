//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.15 at 02:19:01 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabrubrica;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TS_tpAcConv_FGTS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TS_tpAcConv_FGTS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="H"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TS_tpAcConv_FGTS")
@XmlEnum
public enum TSTpAcConvFGTS {


    /**
     * Conversão de licença saúde em acidente de trabalho
     * 
     */
    E,

    /**
     * Recolhimento mensal de FGTS anterior ao início de obrigatoriedade dos eventos periódicos
     * 
     */
    H;

    public String value() {
        return name();
    }

    public static TSTpAcConvFGTS fromValue(String v) {
        return valueOf(v);
    }

}
