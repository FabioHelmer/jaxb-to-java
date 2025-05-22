//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.22 às 11:37:27 AM BRT 
//


package OUT.S2210;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: O (se {}(1010_infoRubrica_inclusao_dadosRubrica_natRubr) em S-1010 = [9253]); N (nos demais casos)
 * 
 * <p>Classe Java de T_descFolha complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_descFolha">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpDesc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="instFinanc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nrDoc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="15"/>
 *               &lt;pattern value="[A-Za-z0-9][-_A-Za-z0-9/.//]{0,13}[A-Za-z0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_03_00}TS_observacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_descFolha", propOrder = {
    "tpDesc",
    "instFinanc",
    "nrDoc",
    "observacao"
})
public class TDescFolha {

    protected byte tpDesc;
    @XmlElement(required = true)
    protected String instFinanc;
    @XmlElement(required = true)
    protected String nrDoc;
    protected String observacao;

    /**
     * Obtém o valor da propriedade tpDesc.
     * 
     */
    public byte getTpDesc() {
        return tpDesc;
    }

    /**
     * Define o valor da propriedade tpDesc.
     * 
     */
    public void setTpDesc(byte value) {
        this.tpDesc = value;
    }

    /**
     * Obtém o valor da propriedade instFinanc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstFinanc() {
        return instFinanc;
    }

    /**
     * Define o valor da propriedade instFinanc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstFinanc(String value) {
        this.instFinanc = value;
    }

    /**
     * Obtém o valor da propriedade nrDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrDoc() {
        return nrDoc;
    }

    /**
     * Define o valor da propriedade nrDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrDoc(String value) {
        this.nrDoc = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

}
