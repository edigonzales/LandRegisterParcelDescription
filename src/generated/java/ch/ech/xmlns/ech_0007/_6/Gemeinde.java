
package ch.ech.xmlns.ech_0007._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for swissMunicipalityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="swissMunicipalityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="municipalityId" type="{http://www.ech.ch/xmlns/eCH-0007/6}municipalityIdType" minOccurs="0"/&gt;
 *         &lt;element name="municipalityName" type="{http://www.ech.ch/xmlns/eCH-0007/6}municipalityNameType"/&gt;
 *         &lt;element name="cantonAbbreviation" type="{http://www.ech.ch/xmlns/eCH-0007/6}cantonAbbreviationType" minOccurs="0"/&gt;
 *         &lt;element name="historyMunicipalityId" type="{http://www.ech.ch/xmlns/eCH-0007/6}historyMunicipalityId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "swissMunicipalityType", propOrder = {
    "municipalityId",
    "municipalityName",
    "cantonAbbreviation",
    "historyMunicipalityId"
})
@XmlRootElement(name = "Gemeinde", namespace = "http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1")
public class Gemeinde {

    protected Integer municipalityId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String municipalityName;
    @XmlSchemaType(name = "token")
    protected CantonAbbreviationType cantonAbbreviation;
    protected Integer historyMunicipalityId;

    /**
     * Gets the value of the municipalityId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMunicipalityId() {
        return municipalityId;
    }

    /**
     * Sets the value of the municipalityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMunicipalityId(Integer value) {
        this.municipalityId = value;
    }

    /**
     * Gets the value of the municipalityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityName() {
        return municipalityName;
    }

    /**
     * Sets the value of the municipalityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityName(String value) {
        this.municipalityName = value;
    }

    /**
     * Gets the value of the cantonAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link CantonAbbreviationType }
     *     
     */
    public CantonAbbreviationType getCantonAbbreviation() {
        return cantonAbbreviation;
    }

    /**
     * Sets the value of the cantonAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAbbreviationType }
     *     
     */
    public void setCantonAbbreviation(CantonAbbreviationType value) {
        this.cantonAbbreviation = value;
    }

    /**
     * Gets the value of the historyMunicipalityId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHistoryMunicipalityId() {
        return historyMunicipalityId;
    }

    /**
     * Sets the value of the historyMunicipalityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHistoryMunicipalityId(Integer value) {
        this.historyMunicipalityId = value;
    }

}
