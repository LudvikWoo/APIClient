/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.guoyasoft.commodity.beans.C0001.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;

import org.exolab.castor.xml.*;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class Request implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _operatorId;

    private java.lang.String _province;

    private java.lang.String _city;

    private java.lang.String _district;

    private java.lang.String _channelId;

    private java.lang.String _channelType;

    private java.lang.String _promotionType;

    private CommodityList _commodityList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.guoyasoft.commodity.beans.C0001.request.Request()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'channelId'.
     * 
     * @return the value of field 'channelId'.
    **/
    public java.lang.String getChannelId()
    {
        return this._channelId;
    } //-- java.lang.String getChannelId() 

    /**
     * Returns the value of field 'channelType'.
     * 
     * @return the value of field 'channelType'.
    **/
    public java.lang.String getChannelType()
    {
        return this._channelType;
    } //-- java.lang.String getChannelType() 

    /**
     * Returns the value of field 'city'.
     * 
     * @return the value of field 'city'.
    **/
    public java.lang.String getCity()
    {
        return this._city;
    } //-- java.lang.String getCity() 

    /**
     * Returns the value of field 'commodityList'.
     * 
     * @return the value of field 'commodityList'.
    **/
    public CommodityList getCommodityList()
    {
        return this._commodityList;
    } //-- CommodityList getCommodityList() 

    /**
     * Returns the value of field 'district'.
     * 
     * @return the value of field 'district'.
    **/
    public java.lang.String getDistrict()
    {
        return this._district;
    } //-- java.lang.String getDistrict() 

    /**
     * Returns the value of field 'operatorId'.
     * 
     * @return the value of field 'operatorId'.
    **/
    public java.lang.String getOperatorId()
    {
        return this._operatorId;
    } //-- java.lang.String getOperatorId() 

    /**
     * Returns the value of field 'promotionType'.
     * 
     * @return the value of field 'promotionType'.
    **/
    public java.lang.String getPromotionType()
    {
        return this._promotionType;
    } //-- java.lang.String getPromotionType() 

    /**
     * Returns the value of field 'province'.
     * 
     * @return the value of field 'province'.
    **/
    public java.lang.String getProvince()
    {
        return this._province;
    } //-- java.lang.String getProvince() 

    /**
    **/
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * 
     * 
     * @param out
    **/
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * 
     * 
     * @param handler
    **/
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'channelId'.
     * 
     * @param channelId the value of field 'channelId'.
    **/
    public void setChannelId(java.lang.String channelId)
    {
        this._channelId = channelId;
    } //-- void setChannelId(java.lang.String) 

    /**
     * Sets the value of field 'channelType'.
     * 
     * @param channelType the value of field 'channelType'.
    **/
    public void setChannelType(java.lang.String channelType)
    {
        this._channelType = channelType;
    } //-- void setChannelType(java.lang.String) 

    /**
     * Sets the value of field 'city'.
     * 
     * @param city the value of field 'city'.
    **/
    public void setCity(java.lang.String city)
    {
        this._city = city;
    } //-- void setCity(java.lang.String) 

    /**
     * Sets the value of field 'commodityList'.
     * 
     * @param commodityList the value of field 'commodityList'.
    **/
    public void setCommodityList(CommodityList commodityList)
    {
        this._commodityList = commodityList;
    } //-- void setCommodityList(CommodityList) 

    /**
     * Sets the value of field 'district'.
     * 
     * @param district the value of field 'district'.
    **/
    public void setDistrict(java.lang.String district)
    {
        this._district = district;
    } //-- void setDistrict(java.lang.String) 

    /**
     * Sets the value of field 'operatorId'.
     * 
     * @param operatorId the value of field 'operatorId'.
    **/
    public void setOperatorId(java.lang.String operatorId)
    {
        this._operatorId = operatorId;
    } //-- void setOperatorId(java.lang.String) 

    /**
     * Sets the value of field 'promotionType'.
     * 
     * @param promotionType the value of field 'promotionType'.
    **/
    public void setPromotionType(java.lang.String promotionType)
    {
        this._promotionType = promotionType;
    } //-- void setPromotionType(java.lang.String) 

    /**
     * Sets the value of field 'province'.
     * 
     * @param province the value of field 'province'.
    **/
    public void setProvince(java.lang.String province)
    {
        this._province = province;
    } //-- void setProvince(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.commodity.beans.C0001.request.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.commodity.beans.C0001.request.Request) Unmarshaller.unmarshal(com.guoyasoft.commodity.beans.C0001.request.Request.class, reader);
    } //-- com.guoyasoft.commodity.beans.C0001.request.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 
    public String toXMLString(){
 		try{
 	    	StringWriter out = new StringWriter();
 	    	this.marshal(out);
 			return out.toString(); 
 		}catch(Exception ex){
 			ex.printStackTrace();
 			return "";
 		}		
     } 
}
