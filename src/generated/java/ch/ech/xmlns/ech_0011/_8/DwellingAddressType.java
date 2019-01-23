
package ch.ech.xmlns.ech_0011._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0010._5.SwissAddressInformationType;


/**
 * <p>Java class for dwellingAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dwellingAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EGID" type="{http://www.ech.ch/xmlns/eCH-0011/8}EGIDType" minOccurs="0"/&gt;
 *         &lt;element name="EWID" type="{http://www.ech.ch/xmlns/eCH-0011/8}EWIDType" minOccurs="0"/&gt;
 *         &lt;element name="householdID" type="{http://www.ech.ch/xmlns/eCH-0011/8}householdIDType" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.ech.ch/xmlns/eCH-0010/5}swissAddressInformationType"/&gt;
 *         &lt;element name="typeOfHousehold" type="{http://www.ech.ch/xmlns/eCH-0011/8}typeOfHouseholdType"/&gt;
 *         &lt;element name="movingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dwellingAddressType", propOrder = {
    "egid",
    "ewid",
    "householdID",
    "address",
    "typeOfHousehold",
    "movingDate"
})
public class DwellingAddressType {

    @XmlElement(name = "EGID")
    @XmlSchemaType(name = "unsignedInt")
    protected Long egid;
    @XmlElement(name = "EWID")
    @XmlSchemaType(name = "unsignedInt")
    protected Long ewid;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String householdID;
    @XmlElement(required = true)
    protected SwissAddressInformationType address;
    @XmlElement(required = true)
    protected String typeOfHousehold;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar movingDate;

    /**
     * Gets the value of the egid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEGID() {
        return egid;
    }

    /**
     * Sets the value of the egid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEGID(Long value) {
        this.egid = value;
    }

    /**
     * Gets the value of the ewid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEWID() {
        return ewid;
    }

    /**
     * Sets the value of the ewid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEWID(Long value) {
        this.ewid = value;
    }

    /**
     * Gets the value of the householdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdID() {
        return householdID;
    }

    /**
     * Sets the value of the householdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdID(String value) {
        this.householdID = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link SwissAddressInformationType }
     *     
     */
    public SwissAddressInformationType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwissAddressInformationType }
     *     
     */
    public void setAddress(SwissAddressInformationType value) {
        this.address = value;
    }

    /**
     * Gets the value of the typeOfHousehold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfHousehold() {
        return typeOfHousehold;
    }

    /**
     * Sets the value of the typeOfHousehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfHousehold(String value) {
        this.typeOfHousehold = value;
    }

    /**
     * Gets the value of the movingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMovingDate() {
        return movingDate;
    }

    /**
     * Sets the value of the movingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMovingDate(XMLGregorianCalendar value) {
        this.movingDate = value;
    }

}
