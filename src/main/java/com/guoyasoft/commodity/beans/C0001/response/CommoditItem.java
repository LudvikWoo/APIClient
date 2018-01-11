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
public class CommoditItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _commodityType;

    private java.lang.String _commodityCode;


      //----------------/
     //- Constructors -/
    //----------------/

    public CommoditItem() {
        super();
    } //-- com.guoyasoft.commodity.beans.C0001.response.CommoditItem()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'commodityCode'.
     * 
     * @return the value of field 'commodityCode'.
    **/
    public java.lang.String getCommodityCode()
    {
        return this._commodityCode;
    } //-- java.lang.String getCommodityCode() 

    /**
     * Returns the value of field 'commodityType'.
     * 
     * @return the value of field 'commodityType'.
    **/
    public java.lang.String getCommodityType()
    {
        return this._commodityType;
    } //-- java.lang.String getCommodityType() 

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
     * Sets the value of field 'commodityCode'.
     * 
     * @param commodityCode the value of field 'commodityCode'.
    **/
    public void setCommodityCode(java.lang.String commodityCode)
    {
        this._commodityCode = commodityCode;
    } //-- void setCommodityCode(java.lang.String) 

    /**
     * Sets the value of field 'commodityType'.
     * 
     * @param commodityType the value of field 'commodityType'.
    **/
    public void setCommodityType(java.lang.String commodityType)
    {
        this._commodityType = commodityType;
    } //-- void setCommodityType(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.commodity.beans.C0001.response.CommoditItem unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.commodity.beans.C0001.response.CommoditItem) Unmarshaller.unmarshal(com.guoyasoft.commodity.beans.C0001.response.CommoditItem.class, reader);
    } //-- com.guoyasoft.commodity.beans.C0001.response.CommoditItem unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
