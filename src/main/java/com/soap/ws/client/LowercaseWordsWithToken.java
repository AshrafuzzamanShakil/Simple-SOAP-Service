
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
 *         &lt;element name="sAString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "saString",
    "sToken"
})
@XmlRootElement(name = "LowercaseWordsWithToken")
public class LowercaseWordsWithToken {

    @XmlElement(name = "sAString", required = true)
    protected String saString;
    @XmlElement(required = true)
    protected String sToken;

    /**
     * Gets the value of the saString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAString() {
        return saString;
    }

    /**
     * Sets the value of the saString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAString(String value) {
        this.saString = value;
    }

    /**
     * Gets the value of the sToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSToken() {
        return sToken;
    }

    /**
     * Sets the value of the sToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSToken(String value) {
        this.sToken = value;
    }

}
