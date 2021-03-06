
package ch.so.geo.schema.agi.landregisterparceldescription._1_0.extract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetExtractByIdResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetExtractByIdResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Extract" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}Extract"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetExtractByIdResponseType", propOrder = {
    "extract"
})
@XmlRootElement(name = "GetExtractByIdResponse")
public class GetExtractByIdResponse {

    @XmlElement(name = "Extract", required = true)
    protected Extract extract;

    /**
     * Gets the value of the extract property.
     * 
     * @return
     *     possible object is
     *     {@link Extract }
     *     
     */
    public Extract getExtract() {
        return extract;
    }

    /**
     * Sets the value of the extract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extract }
     *     
     */
    public void setExtract(Extract value) {
        this.extract = value;
    }

}
