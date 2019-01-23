
package ch.ech.xmlns.ech_0011._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0007._5.SwissMunicipalityType;


/**
 * <p>Java class for residenceDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="residenceDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reportingMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/5}swissMunicipalityType"/&gt;
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="comesFrom" type="{http://www.ech.ch/xmlns/eCH-0011/8}destinationType" minOccurs="0"/&gt;
 *         &lt;element name="dwellingAddress" type="{http://www.ech.ch/xmlns/eCH-0011/8}dwellingAddressType"/&gt;
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="goesTo" type="{http://www.ech.ch/xmlns/eCH-0011/8}destinationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "residenceDataType", propOrder = {
    "reportingMunicipality",
    "arrivalDate",
    "comesFrom",
    "dwellingAddress",
    "departureDate",
    "goesTo"
})
@XmlSeeAlso({
    ch.ech.xmlns.ech_0011._8.SecondaryResidenceType.SecondaryResidence.class,
    ch.ech.xmlns.ech_0011._8.OtherResidenceType.SecondaryResidence.class
})
public class ResidenceDataType {

    @XmlElement(required = true)
    protected SwissMunicipalityType reportingMunicipality;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar arrivalDate;
    protected DestinationType comesFrom;
    @XmlElement(required = true)
    protected DwellingAddressType dwellingAddress;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    protected DestinationType goesTo;

    /**
     * Gets the value of the reportingMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link SwissMunicipalityType }
     *     
     */
    public SwissMunicipalityType getReportingMunicipality() {
        return reportingMunicipality;
    }

    /**
     * Sets the value of the reportingMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwissMunicipalityType }
     *     
     */
    public void setReportingMunicipality(SwissMunicipalityType value) {
        this.reportingMunicipality = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the comesFrom property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType }
     *     
     */
    public DestinationType getComesFrom() {
        return comesFrom;
    }

    /**
     * Sets the value of the comesFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType }
     *     
     */
    public void setComesFrom(DestinationType value) {
        this.comesFrom = value;
    }

    /**
     * Gets the value of the dwellingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DwellingAddressType }
     *     
     */
    public DwellingAddressType getDwellingAddress() {
        return dwellingAddress;
    }

    /**
     * Sets the value of the dwellingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DwellingAddressType }
     *     
     */
    public void setDwellingAddress(DwellingAddressType value) {
        this.dwellingAddress = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the goesTo property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType }
     *     
     */
    public DestinationType getGoesTo() {
        return goesTo;
    }

    /**
     * Sets the value of the goesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType }
     *     
     */
    public void setGoesTo(DestinationType value) {
        this.goesTo = value;
    }

}
