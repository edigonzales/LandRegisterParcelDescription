
package ch.ech.xmlns.ech_0011._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for nameDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nameDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="officialName" type="{http://www.ech.ch/xmlns/eCH-0044/4}baseNameType"/&gt;
 *         &lt;element name="firstName" type="{http://www.ech.ch/xmlns/eCH-0044/4}baseNameType"/&gt;
 *         &lt;element name="originalName" type="{http://www.ech.ch/xmlns/eCH-0044/4}baseNameType" minOccurs="0"/&gt;
 *         &lt;element name="allianceName" type="{http://www.ech.ch/xmlns/eCH-0044/4}baseNameType" minOccurs="0"/&gt;
 *         &lt;element name="aliasName" type="{http://www.ech.ch/xmlns/eCH-0044/4}baseNameType" minOccurs="0"/&gt;
 *         &lt;element name="otherName" type="{http://www.ech.ch/xmlns/eCH-0044/4}baseNameType" minOccurs="0"/&gt;
 *         &lt;element name="callName" type="{http://www.ech.ch/xmlns/eCH-0044/4}baseNameType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="nameOnForeignPassport" type="{http://www.ech.ch/xmlns/eCH-0011/8}foreignerNameType" minOccurs="0"/&gt;
 *           &lt;element name="declaredForeignName" type="{http://www.ech.ch/xmlns/eCH-0011/8}foreignerNameType" minOccurs="0"/&gt;
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
@XmlType(name = "nameDataType", propOrder = {
    "officialName",
    "firstName",
    "originalName",
    "allianceName",
    "aliasName",
    "otherName",
    "callName",
    "declaredForeignName",
    "nameOnForeignPassport"
})
public class NameDataType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String officialName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originalName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String allianceName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String aliasName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String otherName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callName;
    protected ForeignerNameType declaredForeignName;
    protected ForeignerNameType nameOnForeignPassport;

    /**
     * Gets the value of the officialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialName() {
        return officialName;
    }

    /**
     * Sets the value of the officialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialName(String value) {
        this.officialName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the originalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalName() {
        return originalName;
    }

    /**
     * Sets the value of the originalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalName(String value) {
        this.originalName = value;
    }

    /**
     * Gets the value of the allianceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllianceName() {
        return allianceName;
    }

    /**
     * Sets the value of the allianceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllianceName(String value) {
        this.allianceName = value;
    }

    /**
     * Gets the value of the aliasName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * Sets the value of the aliasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasName(String value) {
        this.aliasName = value;
    }

    /**
     * Gets the value of the otherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherName() {
        return otherName;
    }

    /**
     * Sets the value of the otherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherName(String value) {
        this.otherName = value;
    }

    /**
     * Gets the value of the callName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallName() {
        return callName;
    }

    /**
     * Sets the value of the callName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallName(String value) {
        this.callName = value;
    }

    /**
     * Gets the value of the declaredForeignName property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignerNameType }
     *     
     */
    public ForeignerNameType getDeclaredForeignName() {
        return declaredForeignName;
    }

    /**
     * Sets the value of the declaredForeignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignerNameType }
     *     
     */
    public void setDeclaredForeignName(ForeignerNameType value) {
        this.declaredForeignName = value;
    }

    /**
     * Gets the value of the nameOnForeignPassport property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignerNameType }
     *     
     */
    public ForeignerNameType getNameOnForeignPassport() {
        return nameOnForeignPassport;
    }

    /**
     * Sets the value of the nameOnForeignPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignerNameType }
     *     
     */
    public void setNameOnForeignPassport(ForeignerNameType value) {
        this.nameOnForeignPassport = value;
    }

}
