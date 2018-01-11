/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.guoyasoft.commodity.beans.head;

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
public class HEAD implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _busiCode;

    private java.lang.String _requestor;

    private java.lang.String _svcContent;


      //----------------/
     //- Constructors -/
    //----------------/

    public HEAD() {
        super();
    } //-- com.guoyasoft.commodity.beans.head.HEAD()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'busiCode'.
     * 
     * @return the value of field 'busiCode'.
    **/
    public java.lang.String getBusiCode()
    {
        return this._busiCode;
    } //-- java.lang.String getBusiCode() 

    /**
     * Returns the value of field 'requestor'.
     * 
     * @return the value of field 'requestor'.
    **/
    public java.lang.String getRequestor()
    {
        return this._requestor;
    } //-- java.lang.String getRequestor() 

    /**
     * Returns the value of field 'svcContent'.
     * 
     * @return the value of field 'svcContent'.
    **/
    public java.lang.String getSvcContent()
    {
        return this._svcContent;
    } //-- java.lang.String getSvcContent() 

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
     * Sets the value of field 'busiCode'.
     * 
     * @param busiCode the value of field 'busiCode'.
    **/
    public void setBusiCode(java.lang.String busiCode)
    {
        this._busiCode = busiCode;
    } //-- void setBusiCode(java.lang.String) 

    /**
     * Sets the value of field 'requestor'.
     * 
     * @param requestor the value of field 'requestor'.
    **/
    public void setRequestor(java.lang.String requestor)
    {
        this._requestor = requestor;
    } //-- void setRequestor(java.lang.String) 

    /**
     * Sets the value of field 'svcContent'.
     * 
     * @param svcContent the value of field 'svcContent'.
    **/
    public void setSvcContent(java.lang.String svcContent)
    {
        this._svcContent = svcContent;
    } //-- void setSvcContent(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.commodity.beans.head.HEAD unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.commodity.beans.head.HEAD) Unmarshaller.unmarshal(com.guoyasoft.commodity.beans.head.HEAD.class, reader);
    } //-- com.guoyasoft.commodity.beans.head.HEAD unmarshal(java.io.Reader) 

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
