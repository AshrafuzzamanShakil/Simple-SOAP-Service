
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
 *         &lt;element name="InvertCaseFirstAdjustStringToPreviousResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "invertCaseFirstAdjustStringToPreviousResult"
})
@XmlRootElement(name = "InvertCaseFirstAdjustStringToPreviousResponse")
public class InvertCaseFirstAdjustStringToPreviousResponse {

    @XmlElement(name = "InvertCaseFirstAdjustStringToPreviousResult", required = true)
    protected String invertCaseFirstAdjustStringToPreviousResult;

    /**
     * Gets the value of the invertCaseFirstAdjustStringToPreviousResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvertCaseFirstAdjustStringToPreviousResult() {
        return invertCaseFirstAdjustStringToPreviousResult;
    }

    /**
     * Sets the value of the invertCaseFirstAdjustStringToPreviousResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvertCaseFirstAdjustStringToPreviousResult(String value) {
        this.invertCaseFirstAdjustStringToPreviousResult = value;
    }

}
