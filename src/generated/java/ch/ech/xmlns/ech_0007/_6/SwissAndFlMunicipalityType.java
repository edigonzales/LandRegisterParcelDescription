
package ch.ech.xmlns.ech_0007._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for swissAndFlMunicipalityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="swissAndFlMunicipalityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="municipalityId" type="{http://www.ech.ch/xmlns/eCH-0007/6}municipalityIdType"/&gt;
 *         &lt;element name="municipalityName" type="{http://www.ech.ch/xmlns/eCH-0007/6}municipalityNameType"/&gt;
 *         &lt;element name="cantonFlAbbreviation" type="{http://www.ech.ch/xmlns/eCH-0007/6}cantonFlAbbreviationType"/&gt;
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
@XmlType(name = "swissAndFlMunicipalityType", propOrder = {
    "municipalityId",
    "municipalityName",
    "cantonFlAbbreviation",
    "historyMunicipalityId"
})
public class SwissAndFlMunicipalityType {

    protected int municipalityId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String municipalityName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected CantonFlAbbreviationType cantonFlAbbreviation;
    protected Integer historyMunicipalityId;

    /**
     * Gets the value of the municipalityId property.
     * 
     */
    public int getMunicipalityId() {
        return municipalityId;
    }

    /**
     * Sets the value of the municipalityId property.
     * 
     */
    public void setMunicipalityId(int value) {
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
     * Gets the value of the cantonFlAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link CantonFlAbbreviationType }
     *     
     */
    public CantonFlAbbreviationType getCantonFlAbbreviation() {
        return cantonFlAbbreviation;
    }

    /**
     * Sets the value of the cantonFlAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonFlAbbreviationType }
     *     
     */
    public void setCantonFlAbbreviation(CantonFlAbbreviationType value) {
        this.cantonFlAbbreviation = value;
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
