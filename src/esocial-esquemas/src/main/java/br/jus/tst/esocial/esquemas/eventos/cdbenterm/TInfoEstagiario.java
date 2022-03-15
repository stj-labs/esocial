//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.15 at 02:18:22 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenterm;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T_infoEstagiario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_infoEstagiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="natEstagio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="O"/>
 *               &lt;enumeration value="N"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nivEstagio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="8"/>
 *               &lt;enumeration value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="areaAtuacao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
 *         &lt;element name="nrApol" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *         &lt;element name="dtPrevTerm" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="instEnsino">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cnpjInstEnsino" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cnpj" minOccurs="0"/>
 *                   &lt;element name="nmRazao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
 *                   &lt;element name="dscLograd" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_dscLograd" minOccurs="0"/>
 *                   &lt;element name="nrLograd" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_nrLograd" minOccurs="0"/>
 *                   &lt;element name="bairro" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_bairro" minOccurs="0"/>
 *                   &lt;element name="cep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cep" minOccurs="0"/>
 *                   &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_codMunic" minOccurs="0"/>
 *                   &lt;element name="uf" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_uf" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ageIntegracao" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cnpjAgntInteg" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cnpj"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="supervisorEstagio" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cpfSupervisor" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cpf"/>
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
@XmlType(name = "T_infoEstagiario", propOrder = {
    "natEstagio",
    "nivEstagio",
    "areaAtuacao",
    "nrApol",
    "dtPrevTerm",
    "instEnsino",
    "ageIntegracao",
    "supervisorEstagio"
})
public class TInfoEstagiario {

    @XmlElement(required = true)
    protected String natEstagio;
    protected byte nivEstagio;
    protected String areaAtuacao;
    protected String nrApol;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtPrevTerm;
    @XmlElement(required = true)
    protected TInfoEstagiario.InstEnsino instEnsino;
    protected TInfoEstagiario.AgeIntegracao ageIntegracao;
    protected TInfoEstagiario.SupervisorEstagio supervisorEstagio;

    /**
     * Gets the value of the natEstagio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatEstagio() {
        return natEstagio;
    }

    /**
     * Sets the value of the natEstagio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatEstagio(String value) {
        this.natEstagio = value;
    }

    /**
     * Gets the value of the nivEstagio property.
     * 
     */
    public byte getNivEstagio() {
        return nivEstagio;
    }

    /**
     * Sets the value of the nivEstagio property.
     * 
     */
    public void setNivEstagio(byte value) {
        this.nivEstagio = value;
    }

    /**
     * Gets the value of the areaAtuacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    /**
     * Sets the value of the areaAtuacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaAtuacao(String value) {
        this.areaAtuacao = value;
    }

    /**
     * Gets the value of the nrApol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrApol() {
        return nrApol;
    }

    /**
     * Sets the value of the nrApol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrApol(String value) {
        this.nrApol = value;
    }

    /**
     * Gets the value of the dtPrevTerm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtPrevTerm() {
        return dtPrevTerm;
    }

    /**
     * Sets the value of the dtPrevTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtPrevTerm(XMLGregorianCalendar value) {
        this.dtPrevTerm = value;
    }

    /**
     * Gets the value of the instEnsino property.
     * 
     * @return
     *     possible object is
     *     {@link TInfoEstagiario.InstEnsino }
     *     
     */
    public TInfoEstagiario.InstEnsino getInstEnsino() {
        return instEnsino;
    }

    /**
     * Sets the value of the instEnsino property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoEstagiario.InstEnsino }
     *     
     */
    public void setInstEnsino(TInfoEstagiario.InstEnsino value) {
        this.instEnsino = value;
    }

    /**
     * Gets the value of the ageIntegracao property.
     * 
     * @return
     *     possible object is
     *     {@link TInfoEstagiario.AgeIntegracao }
     *     
     */
    public TInfoEstagiario.AgeIntegracao getAgeIntegracao() {
        return ageIntegracao;
    }

    /**
     * Sets the value of the ageIntegracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoEstagiario.AgeIntegracao }
     *     
     */
    public void setAgeIntegracao(TInfoEstagiario.AgeIntegracao value) {
        this.ageIntegracao = value;
    }

    /**
     * Gets the value of the supervisorEstagio property.
     * 
     * @return
     *     possible object is
     *     {@link TInfoEstagiario.SupervisorEstagio }
     *     
     */
    public TInfoEstagiario.SupervisorEstagio getSupervisorEstagio() {
        return supervisorEstagio;
    }

    /**
     * Sets the value of the supervisorEstagio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoEstagiario.SupervisorEstagio }
     *     
     */
    public void setSupervisorEstagio(TInfoEstagiario.SupervisorEstagio value) {
        this.supervisorEstagio = value;
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
     *         &lt;element name="cnpjAgntInteg" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cnpj"/>
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
        "cnpjAgntInteg"
    })
    public static class AgeIntegracao {

        @XmlElement(required = true)
        protected String cnpjAgntInteg;

        /**
         * Gets the value of the cnpjAgntInteg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjAgntInteg() {
            return cnpjAgntInteg;
        }

        /**
         * Sets the value of the cnpjAgntInteg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjAgntInteg(String value) {
            this.cnpjAgntInteg = value;
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
     *         &lt;element name="cnpjInstEnsino" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cnpj" minOccurs="0"/>
     *         &lt;element name="nmRazao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
     *         &lt;element name="dscLograd" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_dscLograd" minOccurs="0"/>
     *         &lt;element name="nrLograd" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_nrLograd" minOccurs="0"/>
     *         &lt;element name="bairro" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_bairro" minOccurs="0"/>
     *         &lt;element name="cep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cep" minOccurs="0"/>
     *         &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_codMunic" minOccurs="0"/>
     *         &lt;element name="uf" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_uf" minOccurs="0"/>
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
        "cnpjInstEnsino",
        "nmRazao",
        "dscLograd",
        "nrLograd",
        "bairro",
        "cep",
        "codMunic",
        "uf"
    })
    public static class InstEnsino {

        protected String cnpjInstEnsino;
        protected String nmRazao;
        protected String dscLograd;
        protected String nrLograd;
        protected String bairro;
        protected String cep;
        protected BigInteger codMunic;
        @XmlSchemaType(name = "string")
        protected TSUf uf;

        /**
         * Gets the value of the cnpjInstEnsino property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjInstEnsino() {
            return cnpjInstEnsino;
        }

        /**
         * Sets the value of the cnpjInstEnsino property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjInstEnsino(String value) {
            this.cnpjInstEnsino = value;
        }

        /**
         * Gets the value of the nmRazao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNmRazao() {
            return nmRazao;
        }

        /**
         * Sets the value of the nmRazao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNmRazao(String value) {
            this.nmRazao = value;
        }

        /**
         * Gets the value of the dscLograd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDscLograd() {
            return dscLograd;
        }

        /**
         * Sets the value of the dscLograd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDscLograd(String value) {
            this.dscLograd = value;
        }

        /**
         * Gets the value of the nrLograd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrLograd() {
            return nrLograd;
        }

        /**
         * Sets the value of the nrLograd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrLograd(String value) {
            this.nrLograd = value;
        }

        /**
         * Gets the value of the bairro property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBairro() {
            return bairro;
        }

        /**
         * Sets the value of the bairro property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBairro(String value) {
            this.bairro = value;
        }

        /**
         * Gets the value of the cep property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCep() {
            return cep;
        }

        /**
         * Sets the value of the cep property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCep(String value) {
            this.cep = value;
        }

        /**
         * Gets the value of the codMunic property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodMunic() {
            return codMunic;
        }

        /**
         * Sets the value of the codMunic property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodMunic(BigInteger value) {
            this.codMunic = value;
        }

        /**
         * Gets the value of the uf property.
         * 
         * @return
         *     possible object is
         *     {@link TSUf }
         *     
         */
        public TSUf getUf() {
            return uf;
        }

        /**
         * Sets the value of the uf property.
         * 
         * @param value
         *     allowed object is
         *     {@link TSUf }
         *     
         */
        public void setUf(TSUf value) {
            this.uf = value;
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
     *         &lt;element name="cpfSupervisor" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cpf"/>
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
        "cpfSupervisor"
    })
    public static class SupervisorEstagio {

        @XmlElement(required = true)
        protected String cpfSupervisor;

        /**
         * Gets the value of the cpfSupervisor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpfSupervisor() {
            return cpfSupervisor;
        }

        /**
         * Sets the value of the cpfSupervisor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpfSupervisor(String value) {
            this.cpfSupervisor = value;
        }

    }

}
