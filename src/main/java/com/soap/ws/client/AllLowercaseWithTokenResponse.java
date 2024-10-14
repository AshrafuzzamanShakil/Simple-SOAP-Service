
package com.soap.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllLowercaseWithTokenResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allLowercaseWithTokenResult"
})
@XmlRootElement(name = "AllLowercaseWithTokenResponse")
public class AllLowercaseWithTokenResponse {

    @XmlElement(name = "AllLowercaseWithTokenResult", required = true)
    protected String allLowercaseWithTokenResult;

    /**
     * Gets the value of the allLowercaseWithTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllLowercaseWithTokenResult() {
        return allLowercaseWithTokenResult;
    }

    /**
     * Sets the value of the allLowercaseWithTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllLowercaseWithTokenResult(String value) {
        this.allLowercaseWithTokenResult = value;
    }

}
