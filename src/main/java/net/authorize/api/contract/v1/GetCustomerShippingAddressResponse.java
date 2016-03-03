//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.03 at 05:32:06 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ANetApiResponse">
 *       &lt;sequence>
 *         &lt;element name="address" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}customerAddressExType" minOccurs="0"/>
 *         &lt;element name="subscriptionIds" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}SubscriptionIdList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "address",
    "subscriptionIds"
})
@XmlRootElement(name = "getCustomerShippingAddressResponse")
public class GetCustomerShippingAddressResponse
    extends ANetApiResponse
{

    protected CustomerAddressExType address;
    protected SubscriptionIdList subscriptionIds;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressExType }
     *     
     */
    public CustomerAddressExType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressExType }
     *     
     */
    public void setAddress(CustomerAddressExType value) {
        this.address = value;
    }

    /**
     * Gets the value of the subscriptionIds property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionIdList }
     *     
     */
    public SubscriptionIdList getSubscriptionIds() {
        return subscriptionIds;
    }

    /**
     * Sets the value of the subscriptionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionIdList }
     *     
     */
    public void setSubscriptionIds(SubscriptionIdList value) {
        this.subscriptionIds = value;
    }

}
