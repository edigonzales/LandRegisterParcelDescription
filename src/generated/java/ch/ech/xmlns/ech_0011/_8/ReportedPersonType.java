
package ch.ech.xmlns.ech_0011._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportedPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reportedPersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="person" type="{http://www.ech.ch/xmlns/eCH-0011/8}personType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="hasMainResidence" type="{http://www.ech.ch/xmlns/eCH-0011/8}mainResidenceType"/&gt;
 *           &lt;element name="hasSecondaryResidence" type="{http://www.ech.ch/xmlns/eCH-0011/8}secondaryResidenceType"/&gt;
 *           &lt;element name="hasOtherResidence" type="{http://www.ech.ch/xmlns/eCH-0011/8}otherResidenceType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportedPersonType", propOrder = {
    "person",
    "hasOtherResidence",
    "hasSecondaryResidence",
    "hasMainResidence"
})
public class ReportedPersonType {

    @XmlElement(required = true)
    protected PersonType person;
    protected OtherResidenceType hasOtherResidence;
    protected SecondaryResidenceType hasSecondaryResidence;
    protected MainResidenceType hasMainResidence;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPerson(PersonType value) {
        this.person = value;
    }

    /**
     * Gets the value of the hasOtherResidence property.
     * 
     * @return
     *     possible object is
     *     {@link OtherResidenceType }
     *     
     */
    public OtherResidenceType getHasOtherResidence() {
        return hasOtherResidence;
    }

    /**
     * Sets the value of the hasOtherResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherResidenceType }
     *     
     */
    public void setHasOtherResidence(OtherResidenceType value) {
        this.hasOtherResidence = value;
    }

    /**
     * Gets the value of the hasSecondaryResidence property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryResidenceType }
     *     
     */
    public SecondaryResidenceType getHasSecondaryResidence() {
        return hasSecondaryResidence;
    }

    /**
     * Sets the value of the hasSecondaryResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryResidenceType }
     *     
     */
    public void setHasSecondaryResidence(SecondaryResidenceType value) {
        this.hasSecondaryResidence = value;
    }

    /**
     * Gets the value of the hasMainResidence property.
     * 
     * @return
     *     possible object is
     *     {@link MainResidenceType }
     *     
     */
    public MainResidenceType getHasMainResidence() {
        return hasMainResidence;
    }

    /**
     * Sets the value of the hasMainResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainResidenceType }
     *     
     */
    public void setHasMainResidence(MainResidenceType value) {
        this.hasMainResidence = value;
    }

}
