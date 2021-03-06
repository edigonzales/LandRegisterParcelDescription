
package ch.so.geo.schema.agi.landregisterparceldescription._1_0.extract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Extract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Extract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CantonalLogo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ResponsibleOffice" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}Office"/&gt;
 *         &lt;element name="RealEstate" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}RealEstate_DPR" minOccurs="0"/&gt;
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extract", propOrder = {
    "cantonalLogo",
    "responsibleOffice",
    "realEstate",
    "creationDate"
})
public class Extract {

    @XmlElement(name = "CantonalLogo")
    protected byte[] cantonalLogo;
    @XmlElement(name = "ResponsibleOffice", required = true)
    protected Office responsibleOffice;
    @XmlElement(name = "RealEstate")
    protected RealEstateDPR realEstate;
    @XmlElement(name = "CreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;

    /**
     * Gets the value of the cantonalLogo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCantonalLogo() {
        return cantonalLogo;
    }

    /**
     * Sets the value of the cantonalLogo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCantonalLogo(byte[] value) {
        this.cantonalLogo = value;
    }

    /**
     * Gets the value of the responsibleOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getResponsibleOffice() {
        return responsibleOffice;
    }

    /**
     * Sets the value of the responsibleOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setResponsibleOffice(Office value) {
        this.responsibleOffice = value;
    }

    /**
     * Gets the value of the realEstate property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateDPR }
     *     
     */
    public RealEstateDPR getRealEstate() {
        return realEstate;
    }

    /**
     * Sets the value of the realEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateDPR }
     *     
     */
    public void setRealEstate(RealEstateDPR value) {
        this.realEstate = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

}
