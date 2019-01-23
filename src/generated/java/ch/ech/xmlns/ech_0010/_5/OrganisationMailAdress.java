
package ch.ech.xmlns.ech_0010._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organisationMailAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organisationMailAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organisation" type="{http://www.ech.ch/xmlns/eCH-0010/5}organisationMailAddressInfoType"/&gt;
 *         &lt;element name="addressInformation" type="{http://www.ech.ch/xmlns/eCH-0010/5}addressInformationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationMailAddressType", propOrder = {
    "organisation",
    "addressInformation"
})
@XmlRootElement(name = "organisationMailAdress")
public class OrganisationMailAdress {

    @XmlElement(required = true)
    protected OrganisationMailAddressInfoType organisation;
    @XmlElement(required = true)
    protected AddressInformationType addressInformation;

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationMailAddressInfoType }
     *     
     */
    public OrganisationMailAddressInfoType getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationMailAddressInfoType }
     *     
     */
    public void setOrganisation(OrganisationMailAddressInfoType value) {
        this.organisation = value;
    }

    /**
     * Gets the value of the addressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInformationType }
     *     
     */
    public AddressInformationType getAddressInformation() {
        return addressInformation;
    }

    /**
     * Sets the value of the addressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInformationType }
     *     
     */
    public void setAddressInformation(AddressInformationType value) {
        this.addressInformation = value;
    }

}
