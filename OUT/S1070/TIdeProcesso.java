//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.22 às 11:37:59 AM BRT 
//


package OUT.S1070;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHAVE_GRUPO: {tpProc*}, {nrProc*}, {iniValid*}, {fimValid*}
 * 
 * <p>Classe Java de T_ideProcesso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideProcesso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_03_00}TS_tpProc_1_2_4"/>
 *         &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_03_00}TS_nrProc_16_17_20_21"/>
 *         &lt;element name="iniValid" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_03_00}TS_iniValid"/>
 *         &lt;element name="fimValid" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_03_00}TS_fimValid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideProcesso", propOrder = {
    "tpProc",
    "nrProc",
    "iniValid",
    "fimValid"
})
public class TIdeProcesso {

    protected byte tpProc;
    @XmlElement(required = true)
    protected String nrProc;
    @XmlElement(required = true)
    protected String iniValid;
    protected String fimValid;

    /**
     * Obtém o valor da propriedade tpProc.
     * 
     */
    public byte getTpProc() {
        return tpProc;
    }

    /**
     * Define o valor da propriedade tpProc.
     * 
     */
    public void setTpProc(byte value) {
        this.tpProc = value;
    }

    /**
     * Obtém o valor da propriedade nrProc.
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
     * Define o valor da propriedade nrProc.
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
     * Obtém o valor da propriedade iniValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIniValid() {
        return iniValid;
    }

    /**
     * Define o valor da propriedade iniValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIniValid(String value) {
        this.iniValid = value;
    }

    /**
     * Obtém o valor da propriedade fimValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFimValid() {
        return fimValid;
    }

    /**
     * Define o valor da propriedade fimValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFimValid(String value) {
        this.fimValid = value;
    }

}
