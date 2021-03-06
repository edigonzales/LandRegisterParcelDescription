
package ch.so.geo.schema.agi.landregisterparceldescription._1_0.extract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RealEstate_DPR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstate_DPR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Number" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;minLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IdentND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;minLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EGRID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;minLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LocalNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LandCoverShare" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}LandCoverShareType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SurveyorOffice" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}Office"/&gt;
 *         &lt;element name="LandRegisterOffice" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}Office"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *         &lt;element name="SubunitOfLandRegister" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *         &lt;element name="LandRegistryArea"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minExclusive value="0"/&gt;
 *               &lt;maxExclusive value="999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Map" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Owner" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}PersonLR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceWMS" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="Building" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}BuildingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstate_DPR", propOrder = {
    "number",
    "identND",
    "egrid",
    "localNames",
    "landCoverShares",
    "surveyorOffice",
    "landRegisterOffice",
    "type",
    "municipality",
    "subunitOfLandRegister",
    "landRegistryArea",
    "map",
    "owners",
    "referenceWMS",
    "buildings"
})
public class RealEstateDPR {

    @XmlElement(name = "Number")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String number;
    @XmlElement(name = "IdentND")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String identND;
    @XmlElement(name = "EGRID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String egrid;
    @XmlElement(name = "LocalNames")
    protected String localNames;
    @XmlElement(name = "LandCoverShare")
    protected List<LandCoverShareType> landCoverShares;
    @XmlElement(name = "SurveyorOffice", required = true)
    protected Office surveyorOffice;
    @XmlElement(name = "LandRegisterOffice", required = true)
    protected Office landRegisterOffice;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Municipality")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String municipality;
    @XmlElement(name = "SubunitOfLandRegister")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subunitOfLandRegister;
    @XmlElement(name = "LandRegistryArea")
    protected int landRegistryArea;
    @XmlElement(name = "Map")
    protected byte[] map;
    @XmlElement(name = "Owner")
    protected List<PersonLR> owners;
    @XmlElement(name = "ReferenceWMS")
    @XmlSchemaType(name = "anyURI")
    protected String referenceWMS;
    @XmlElement(name = "Building")
    protected List<BuildingType> buildings;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the identND property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentND() {
        return identND;
    }

    /**
     * Sets the value of the identND property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentND(String value) {
        this.identND = value;
    }

    /**
     * Gets the value of the egrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEGRID() {
        return egrid;
    }

    /**
     * Sets the value of the egrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEGRID(String value) {
        this.egrid = value;
    }

    /**
     * Gets the value of the localNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalNames() {
        return localNames;
    }

    /**
     * Sets the value of the localNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalNames(String value) {
        this.localNames = value;
    }

    /**
     * Gets the value of the landCoverShares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landCoverShares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandCoverShares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandCoverShareType }
     * 
     * 
     */
    public List<LandCoverShareType> getLandCoverShares() {
        if (landCoverShares == null) {
            landCoverShares = new ArrayList<LandCoverShareType>();
        }
        return this.landCoverShares;
    }

    /**
     * Gets the value of the surveyorOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getSurveyorOffice() {
        return surveyorOffice;
    }

    /**
     * Sets the value of the surveyorOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setSurveyorOffice(Office value) {
        this.surveyorOffice = value;
    }

    /**
     * Gets the value of the landRegisterOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getLandRegisterOffice() {
        return landRegisterOffice;
    }

    /**
     * Sets the value of the landRegisterOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setLandRegisterOffice(Office value) {
        this.landRegisterOffice = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the municipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * Sets the value of the municipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipality(String value) {
        this.municipality = value;
    }

    /**
     * Gets the value of the subunitOfLandRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubunitOfLandRegister() {
        return subunitOfLandRegister;
    }

    /**
     * Sets the value of the subunitOfLandRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubunitOfLandRegister(String value) {
        this.subunitOfLandRegister = value;
    }

    /**
     * Gets the value of the landRegistryArea property.
     * 
     */
    public int getLandRegistryArea() {
        return landRegistryArea;
    }

    /**
     * Sets the value of the landRegistryArea property.
     * 
     */
    public void setLandRegistryArea(int value) {
        this.landRegistryArea = value;
    }

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMap(byte[] value) {
        this.map = value;
    }

    /**
     * Gets the value of the owners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the owners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonLR }
     * 
     * 
     */
    public List<PersonLR> getOwners() {
        if (owners == null) {
            owners = new ArrayList<PersonLR>();
        }
        return this.owners;
    }

    /**
     * Gets the value of the referenceWMS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceWMS() {
        return referenceWMS;
    }

    /**
     * Sets the value of the referenceWMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceWMS(String value) {
        this.referenceWMS = value;
    }

    /**
     * Gets the value of the buildings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buildings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuildings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuildingType }
     * 
     * 
     */
    public List<BuildingType> getBuildings() {
        if (buildings == null) {
            buildings = new ArrayList<BuildingType>();
        }
        return this.buildings;
    }

}
