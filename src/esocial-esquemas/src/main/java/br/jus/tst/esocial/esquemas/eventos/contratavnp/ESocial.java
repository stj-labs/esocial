//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.15 at 02:18:26 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.contratavnp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evtContratAvNP">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}T_ideEvento_folha_mensal"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="remunAvNP" maxOccurs="999">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_tpInsc_1_3_4"/>
 *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_nrInsc_12_14"/>
 *                             &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_codigo_esocial"/>
 *                             &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrBcFgts" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_Id" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "evtContratAvNP",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtContratAvNP evtContratAvNP;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtContratAvNP property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtContratAvNP }
     *     
     */
    public ESocial.EvtContratAvNP getEvtContratAvNP() {
        return evtContratAvNP;
    }

    /**
     * Sets the value of the evtContratAvNP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtContratAvNP }
     *     
     */
    public void setEvtContratAvNP(ESocial.EvtContratAvNP value) {
        this.evtContratAvNP = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}T_ideEvento_folha_mensal"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="remunAvNP" maxOccurs="999">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_tpInsc_1_3_4"/>
     *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_nrInsc_12_14"/>
     *                   &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_codigo_esocial"/>
     *                   &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrBcFgts" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_Id" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador",
        "remunAvNP"
    })
    public static class EvtContratAvNP {

        @XmlElement(required = true)
        protected TIdeEventoFolhaMensal ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected List<ESocial.EvtContratAvNP.RemunAvNP> remunAvNP;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolhaMensal }
         *     
         */
        public TIdeEventoFolhaMensal getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolhaMensal }
         *     
         */
        public void setIdeEvento(TIdeEventoFolhaMensal value) {
            this.ideEvento = value;
        }

        /**
         * Gets the value of the ideEmpregador property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Sets the value of the ideEmpregador property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Gets the value of the remunAvNP property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remunAvNP property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemunAvNP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESocial.EvtContratAvNP.RemunAvNP }
         * 
         * 
         */
        public List<ESocial.EvtContratAvNP.RemunAvNP> getRemunAvNP() {
            if (remunAvNP == null) {
                remunAvNP = new ArrayList<ESocial.EvtContratAvNP.RemunAvNP>();
            }
            return this.remunAvNP;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_tpInsc_1_3_4"/>
         *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_nrInsc_12_14"/>
         *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_codigo_esocial"/>
         *         &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrBcFgts" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tpInsc",
            "nrInsc",
            "codLotacao",
            "vrBcCp00",
            "vrBcCp15",
            "vrBcCp20",
            "vrBcCp25",
            "vrBcCp13",
            "vrBcFgts",
            "vrDescCP"
        })
        public static class RemunAvNP {

            protected byte tpInsc;
            @XmlElement(required = true)
            protected String nrInsc;
            @XmlElement(required = true)
            protected String codLotacao;
            @XmlElement(required = true)
            protected BigDecimal vrBcCp00;
            @XmlElement(required = true)
            protected BigDecimal vrBcCp15;
            @XmlElement(required = true)
            protected BigDecimal vrBcCp20;
            @XmlElement(required = true)
            protected BigDecimal vrBcCp25;
            @XmlElement(required = true)
            protected BigDecimal vrBcCp13;
            @XmlElement(required = true)
            protected BigDecimal vrBcFgts;
            @XmlElement(required = true)
            protected BigDecimal vrDescCP;

            /**
             * Gets the value of the tpInsc property.
             * 
             */
            public byte getTpInsc() {
                return tpInsc;
            }

            /**
             * Sets the value of the tpInsc property.
             * 
             */
            public void setTpInsc(byte value) {
                this.tpInsc = value;
            }

            /**
             * Gets the value of the nrInsc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrInsc() {
                return nrInsc;
            }

            /**
             * Sets the value of the nrInsc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrInsc(String value) {
                this.nrInsc = value;
            }

            /**
             * Gets the value of the codLotacao property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodLotacao() {
                return codLotacao;
            }

            /**
             * Sets the value of the codLotacao property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodLotacao(String value) {
                this.codLotacao = value;
            }

            /**
             * Gets the value of the vrBcCp00 property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrBcCp00() {
                return vrBcCp00;
            }

            /**
             * Sets the value of the vrBcCp00 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrBcCp00(BigDecimal value) {
                this.vrBcCp00 = value;
            }

            /**
             * Gets the value of the vrBcCp15 property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrBcCp15() {
                return vrBcCp15;
            }

            /**
             * Sets the value of the vrBcCp15 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrBcCp15(BigDecimal value) {
                this.vrBcCp15 = value;
            }

            /**
             * Gets the value of the vrBcCp20 property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrBcCp20() {
                return vrBcCp20;
            }

            /**
             * Sets the value of the vrBcCp20 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrBcCp20(BigDecimal value) {
                this.vrBcCp20 = value;
            }

            /**
             * Gets the value of the vrBcCp25 property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrBcCp25() {
                return vrBcCp25;
            }

            /**
             * Sets the value of the vrBcCp25 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrBcCp25(BigDecimal value) {
                this.vrBcCp25 = value;
            }

            /**
             * Gets the value of the vrBcCp13 property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrBcCp13() {
                return vrBcCp13;
            }

            /**
             * Sets the value of the vrBcCp13 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrBcCp13(BigDecimal value) {
                this.vrBcCp13 = value;
            }

            /**
             * Gets the value of the vrBcFgts property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrBcFgts() {
                return vrBcFgts;
            }

            /**
             * Sets the value of the vrBcFgts property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrBcFgts(BigDecimal value) {
                this.vrBcFgts = value;
            }

            /**
             * Gets the value of the vrDescCP property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrDescCP() {
                return vrDescCP;
            }

            /**
             * Sets the value of the vrDescCP property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrDescCP(BigDecimal value) {
                this.vrDescCP = value;
            }

        }

    }

}
