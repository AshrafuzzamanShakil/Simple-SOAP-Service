
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
 *         &lt;element name="UppercaseWordsWithTokenResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "uppercaseWordsWithTokenResult"
})
@XmlRootElement(name = "UppercaseWordsWithTokenResponse")
public class UppercaseWordsWithTokenResponse {

    @XmlElement(name = "UppercaseWordsWithTokenResult", required = true)
    protected String uppercaseWordsWithTokenResult;

    /**
     * Gets the value of the uppercaseWordsWithTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUppercaseWordsWithTokenResult() {
        return uppercaseWordsWithTokenResult;
    }

    /**
     * Sets the value of the uppercaseWordsWithTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUppercaseWordsWithTokenResult(String value) {
        this.uppercaseWordsWithTokenResult = value;
    }

}
