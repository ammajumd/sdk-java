//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.18 at 01:35:18 PM IST 
//


package net.authorize.api.contract.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARBSubscriptionMaskedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARBSubscriptionMaskedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="paymentSchedule" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}paymentScheduleType" minOccurs="0"/>
 *         &lt;element name="amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0.01"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="trialAmount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0.00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="status" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}ARBSubscriptionStatusEnum" minOccurs="0"/>
 *         &lt;element name="profile" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}subscriptionCustomerProfileType" minOccurs="0"/>
 *         &lt;element name="order" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}orderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARBSubscriptionMaskedType", propOrder = {
    "name",
    "paymentSchedule",
    "amount",
    "trialAmount",
    "status",
    "profile",
    "order"
})
public class ARBSubscriptionMaskedType {

    protected String name;
    protected PaymentScheduleType paymentSchedule;
    protected BigDecimal amount;
    protected BigDecimal trialAmount;
    protected ARBSubscriptionStatusEnum status;
    protected SubscriptionCustomerProfileType profile;
    protected OrderType order;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the paymentSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentScheduleType }
     *     
     */
    public PaymentScheduleType getPaymentSchedule() {
        return paymentSchedule;
    }

    /**
     * Sets the value of the paymentSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentScheduleType }
     *     
     */
    public void setPaymentSchedule(PaymentScheduleType value) {
        this.paymentSchedule = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the trialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrialAmount() {
        return trialAmount;
    }

    /**
     * Sets the value of the trialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrialAmount(BigDecimal value) {
        this.trialAmount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ARBSubscriptionStatusEnum }
     *     
     */
    public ARBSubscriptionStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARBSubscriptionStatusEnum }
     *     
     */
    public void setStatus(ARBSubscriptionStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionCustomerProfileType }
     *     
     */
    public SubscriptionCustomerProfileType getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionCustomerProfileType }
     *     
     */
    public void setProfile(SubscriptionCustomerProfileType value) {
        this.profile = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

}
