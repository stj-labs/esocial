//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.24 at 06:40:12 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabestab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * DESCRICAO_COMPLETA:Detalhamento das informações do estabelecimento, obra de construção civil ou unidade de órgão público.
 * 
 * <p>Java class for T_dadosEstab complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_dadosEstab">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cnaePrep" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_cnae"/>
 *         &lt;element name="cnpjResp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_cnpj" minOccurs="0"/>
 *         &lt;element name="aliqGilrat" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_aliqRat" minOccurs="0"/>
 *                   &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_fap" minOccurs="0"/>
 *                   &lt;element name="procAdmJudRat" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_tpProc_1_2"/>
 *                             &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProc_17_20_21"/>
 *                             &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_codSusp"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="procAdmJudFap" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_tpProc_1_2_4"/>
 *                             &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProc_16_17_20_21"/>
 *                             &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_codSusp"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoCaepf" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpCaepf">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoObra" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="indSubstPatrObra" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_indSubstPatrObra"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoTrab" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="infoApr" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
 *                             &lt;element name="infoEntEduc" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_cnpj"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoPCD" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProcJud"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_dadosEstab", propOrder = {
    "cnaePrep",
    "cnpjResp",
    "aliqGilrat",
    "infoCaepf",
    "infoObra",
    "infoTrab"
})
public class TDadosEstab {

    @XmlElement(required = true)
    protected BigInteger cnaePrep;
    protected String cnpjResp;
    protected TDadosEstab.AliqGilrat aliqGilrat;
    protected TDadosEstab.InfoCaepf infoCaepf;
    protected TDadosEstab.InfoObra infoObra;
    protected TDadosEstab.InfoTrab infoTrab;

    /**
     * Gets the value of the cnaePrep property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCnaePrep() {
        return cnaePrep;
    }

    /**
     * Sets the value of the cnaePrep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCnaePrep(BigInteger value) {
        this.cnaePrep = value;
    }

    /**
     * Gets the value of the cnpjResp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjResp() {
        return cnpjResp;
    }

    /**
     * Sets the value of the cnpjResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjResp(String value) {
        this.cnpjResp = value;
    }

    /**
     * Gets the value of the aliqGilrat property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosEstab.AliqGilrat }
     *     
     */
    public TDadosEstab.AliqGilrat getAliqGilrat() {
        return aliqGilrat;
    }

    /**
     * Sets the value of the aliqGilrat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosEstab.AliqGilrat }
     *     
     */
    public void setAliqGilrat(TDadosEstab.AliqGilrat value) {
        this.aliqGilrat = value;
    }

    /**
     * Gets the value of the infoCaepf property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosEstab.InfoCaepf }
     *     
     */
    public TDadosEstab.InfoCaepf getInfoCaepf() {
        return infoCaepf;
    }

    /**
     * Sets the value of the infoCaepf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosEstab.InfoCaepf }
     *     
     */
    public void setInfoCaepf(TDadosEstab.InfoCaepf value) {
        this.infoCaepf = value;
    }

    /**
     * Gets the value of the infoObra property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosEstab.InfoObra }
     *     
     */
    public TDadosEstab.InfoObra getInfoObra() {
        return infoObra;
    }

    /**
     * Sets the value of the infoObra property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosEstab.InfoObra }
     *     
     */
    public void setInfoObra(TDadosEstab.InfoObra value) {
        this.infoObra = value;
    }

    /**
     * Gets the value of the infoTrab property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosEstab.InfoTrab }
     *     
     */
    public TDadosEstab.InfoTrab getInfoTrab() {
        return infoTrab;
    }

    /**
     * Sets the value of the infoTrab property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosEstab.InfoTrab }
     *     
     */
    public void setInfoTrab(TDadosEstab.InfoTrab value) {
        this.infoTrab = value;
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
     *         &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_aliqRat" minOccurs="0"/>
     *         &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_fap" minOccurs="0"/>
     *         &lt;element name="procAdmJudRat" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_tpProc_1_2"/>
     *                   &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProc_17_20_21"/>
     *                   &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_codSusp"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="procAdmJudFap" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_tpProc_1_2_4"/>
     *                   &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProc_16_17_20_21"/>
     *                   &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_codSusp"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "aliqRat",
        "fap",
        "procAdmJudRat",
        "procAdmJudFap"
    })
    public static class AliqGilrat {

        protected Byte aliqRat;
        protected BigDecimal fap;
        protected TDadosEstab.AliqGilrat.ProcAdmJudRat procAdmJudRat;
        protected TDadosEstab.AliqGilrat.ProcAdmJudFap procAdmJudFap;

        /**
         * Gets the value of the aliqRat property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getAliqRat() {
            return aliqRat;
        }

        /**
         * Sets the value of the aliqRat property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setAliqRat(Byte value) {
            this.aliqRat = value;
        }

        /**
         * Gets the value of the fap property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFap() {
            return fap;
        }

        /**
         * Sets the value of the fap property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFap(BigDecimal value) {
            this.fap = value;
        }

        /**
         * Gets the value of the procAdmJudRat property.
         * 
         * @return
         *     possible object is
         *     {@link TDadosEstab.AliqGilrat.ProcAdmJudRat }
         *     
         */
        public TDadosEstab.AliqGilrat.ProcAdmJudRat getProcAdmJudRat() {
            return procAdmJudRat;
        }

        /**
         * Sets the value of the procAdmJudRat property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosEstab.AliqGilrat.ProcAdmJudRat }
         *     
         */
        public void setProcAdmJudRat(TDadosEstab.AliqGilrat.ProcAdmJudRat value) {
            this.procAdmJudRat = value;
        }

        /**
         * Gets the value of the procAdmJudFap property.
         * 
         * @return
         *     possible object is
         *     {@link TDadosEstab.AliqGilrat.ProcAdmJudFap }
         *     
         */
        public TDadosEstab.AliqGilrat.ProcAdmJudFap getProcAdmJudFap() {
            return procAdmJudFap;
        }

        /**
         * Sets the value of the procAdmJudFap property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosEstab.AliqGilrat.ProcAdmJudFap }
         *     
         */
        public void setProcAdmJudFap(TDadosEstab.AliqGilrat.ProcAdmJudFap value) {
            this.procAdmJudFap = value;
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
         *         &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_tpProc_1_2_4"/>
         *         &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProc_16_17_20_21"/>
         *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_codSusp"/>
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
            "tpProc",
            "nrProc",
            "codSusp"
        })
        public static class ProcAdmJudFap {

            protected byte tpProc;
            @XmlElement(required = true)
            protected String nrProc;
            @XmlElement(required = true)
            protected BigInteger codSusp;

            /**
             * Gets the value of the tpProc property.
             * 
             */
            public byte getTpProc() {
                return tpProc;
            }

            /**
             * Sets the value of the tpProc property.
             * 
             */
            public void setTpProc(byte value) {
                this.tpProc = value;
            }

            /**
             * Gets the value of the nrProc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrProc() {
                return nrProc;
            }

            /**
             * Sets the value of the nrProc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrProc(String value) {
                this.nrProc = value;
            }

            /**
             * Gets the value of the codSusp property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCodSusp() {
                return codSusp;
            }

            /**
             * Sets the value of the codSusp property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCodSusp(BigInteger value) {
                this.codSusp = value;
            }

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
         *         &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_tpProc_1_2"/>
         *         &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProc_17_20_21"/>
         *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_codSusp"/>
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
            "tpProc",
            "nrProc",
            "codSusp"
        })
        public static class ProcAdmJudRat {

            protected byte tpProc;
            @XmlElement(required = true)
            protected String nrProc;
            @XmlElement(required = true)
            protected BigInteger codSusp;

            /**
             * Gets the value of the tpProc property.
             * 
             */
            public byte getTpProc() {
                return tpProc;
            }

            /**
             * Sets the value of the tpProc property.
             * 
             */
            public void setTpProc(byte value) {
                this.tpProc = value;
            }

            /**
             * Gets the value of the nrProc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrProc() {
                return nrProc;
            }

            /**
             * Sets the value of the nrProc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrProc(String value) {
                this.nrProc = value;
            }

            /**
             * Gets the value of the codSusp property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCodSusp() {
                return codSusp;
            }

            /**
             * Sets the value of the codSusp property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCodSusp(BigInteger value) {
                this.codSusp = value;
            }

        }

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
     *         &lt;element name="tpCaepf">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *               &lt;enumeration value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "tpCaepf"
    })
    public static class InfoCaepf {

        protected byte tpCaepf;

        /**
         * Gets the value of the tpCaepf property.
         * 
         */
        public byte getTpCaepf() {
            return tpCaepf;
        }

        /**
         * Sets the value of the tpCaepf property.
         * 
         */
        public void setTpCaepf(byte value) {
            this.tpCaepf = value;
        }

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
     *         &lt;element name="indSubstPatrObra" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_indSubstPatrObra"/>
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
        "indSubstPatrObra"
    })
    public static class InfoObra {

        protected byte indSubstPatrObra;

        /**
         * Gets the value of the indSubstPatrObra property.
         * 
         */
        public byte getIndSubstPatrObra() {
            return indSubstPatrObra;
        }

        /**
         * Sets the value of the indSubstPatrObra property.
         * 
         */
        public void setIndSubstPatrObra(byte value) {
            this.indSubstPatrObra = value;
        }

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
     *         &lt;element name="infoApr" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
     *                   &lt;element name="infoEntEduc" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_cnpj"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoPCD" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProcJud"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "infoApr",
        "infoPCD"
    })
    public static class InfoTrab {

        protected TDadosEstab.InfoTrab.InfoApr infoApr;
        protected TDadosEstab.InfoTrab.InfoPCD infoPCD;

        /**
         * Gets the value of the infoApr property.
         * 
         * @return
         *     possible object is
         *     {@link TDadosEstab.InfoTrab.InfoApr }
         *     
         */
        public TDadosEstab.InfoTrab.InfoApr getInfoApr() {
            return infoApr;
        }

        /**
         * Sets the value of the infoApr property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosEstab.InfoTrab.InfoApr }
         *     
         */
        public void setInfoApr(TDadosEstab.InfoTrab.InfoApr value) {
            this.infoApr = value;
        }

        /**
         * Gets the value of the infoPCD property.
         * 
         * @return
         *     possible object is
         *     {@link TDadosEstab.InfoTrab.InfoPCD }
         *     
         */
        public TDadosEstab.InfoTrab.InfoPCD getInfoPCD() {
            return infoPCD;
        }

        /**
         * Sets the value of the infoPCD property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosEstab.InfoTrab.InfoPCD }
         *     
         */
        public void setInfoPCD(TDadosEstab.InfoTrab.InfoPCD value) {
            this.infoPCD = value;
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
         *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
         *         &lt;element name="infoEntEduc" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_cnpj"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "nrProcJud",
            "infoEntEduc"
        })
        public static class InfoApr {

            protected String nrProcJud;
            protected List<TDadosEstab.InfoTrab.InfoApr.InfoEntEduc> infoEntEduc;

            /**
             * Gets the value of the nrProcJud property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrProcJud() {
                return nrProcJud;
            }

            /**
             * Sets the value of the nrProcJud property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrProcJud(String value) {
                this.nrProcJud = value;
            }

            /**
             * Gets the value of the infoEntEduc property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoEntEduc property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoEntEduc().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TDadosEstab.InfoTrab.InfoApr.InfoEntEduc }
             * 
             * 
             */
            public List<TDadosEstab.InfoTrab.InfoApr.InfoEntEduc> getInfoEntEduc() {
                if (infoEntEduc == null) {
                    infoEntEduc = new ArrayList<TDadosEstab.InfoTrab.InfoApr.InfoEntEduc>();
                }
                return this.infoEntEduc;
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
             *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_cnpj"/>
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
                "nrInsc"
            })
            public static class InfoEntEduc {

                @XmlElement(required = true)
                protected String nrInsc;

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

            }

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
         *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProcJud"/>
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
            "nrProcJud"
        })
        public static class InfoPCD {

            @XmlElement(required = true)
            protected String nrProcJud;

            /**
             * Gets the value of the nrProcJud property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrProcJud() {
                return nrProcJud;
            }

            /**
             * Sets the value of the nrProcJud property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrProcJud(String value) {
                this.nrProcJud = value;
            }

        }

    }

}
