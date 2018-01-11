/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.guoyasoft.commodity.beans.C0001.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class PromotionItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _promotionCode;

    private java.lang.String _promotionType;

    private java.lang.String _promotionRule;


      //----------------/
     //- Constructors -/
    //----------------/

    public PromotionItem() {
        super();
    } //-- com.guoyasoft.commodity.beans.C0001.response.PromotionItem()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'promotionCode'.
     * 
     * @return the value of field 'promotionCode'.
    **/
    public java.lang.String getPromotionCode()
    {
        return this._promotionCode;
    } //-- java.lang.String getPromotionCode() 

    /**
     * Returns the value of field 'promotionRule'.
     * 
     * @return the value of field 'promotionRule'.
    **/
    public java.lang.String getPromotionRule()
    {
        return this._promotionRule;
    } //-- java.lang.String getPromotionRule() 

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
     * Sets the value of field 'promotionCode'.
     * 
     * @param promotionCode the value of field 'promotionCode'.
    **/
    public void setPromotionCode(java.lang.String promotionCode)
    {
        this._promotionCode = promotionCode;
    } //-- void setPromotionCode(java.lang.String) 

    /**
     * Sets the value of field 'promotionRule'.
     * 
     * @param promotionRule the value of field 'promotionRule'.
    **/
    public void setPromotionRule(java.lang.String promotionRule)
    {
        this._promotionRule = promotionRule;
    } //-- void setPromotionRule(java.lang.String) 

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
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.commodity.beans.C0001.response.PromotionItem unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.commodity.beans.C0001.response.PromotionItem) Unmarshaller.unmarshal(com.guoyasoft.commodity.beans.C0001.response.PromotionItem.class, reader);
    } //-- com.guoyasoft.commodity.beans.C0001.response.PromotionItem unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
