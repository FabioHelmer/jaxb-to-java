//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2025.05.22 às 11:37:32 AM BRT 
//


package OUT.S2420;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHAVE_GRUPO: {tpInsc*}, {nrInsc*}
 * 
 * <p>Classe Java de T_ideEmpregador_cnpj complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideEmpregador_cnpj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_03_00}TS_tpInsc_1"/>
 *         &lt;element name="nrInsc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{8}|\d{14}"/>
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
@XmlType(name = "T_ideEmpregador_cnpj", propOrder = {
    "tpInsc",
    "nrInsc"
})
public class TIdeEmpregadorCnpj {

    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;

    /**
     * Obtém o valor da propriedade tpInsc.
     * 
     */
    public byte getTpInsc() {
        return tpInsc;
    }

    /**
     * Define o valor da propriedade tpInsc.
     * 
     */
    public void setTpInsc(byte value) {
        this.tpInsc = value;
    }

    /**
     * Obtém o valor da propriedade nrInsc.
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
     * Define o valor da propriedade nrInsc.
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
