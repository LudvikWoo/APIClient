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
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class CommodityList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.util.Vector _commoditItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CommodityList() {
        super();
        _commoditItemList = new Vector();
    } //-- com.guoyasoft.commodity.beans.C0001.response.CommodityList()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCommoditItem
    **/
    public void addCommoditItem(CommoditItem vCommoditItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _commoditItemList.addElement(vCommoditItem);
    } //-- void addCommoditItem(CommoditItem) 

    /**
     * 
     * 
     * @param index
     * @param vCommoditItem
    **/
    public void addCommoditItem(int index, CommoditItem vCommoditItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _commoditItemList.insertElementAt(vCommoditItem, index);
    } //-- void addCommoditItem(int, CommoditItem) 

    /**
    **/
    public java.util.Enumeration enumerateCommoditItem()
    {
        return _commoditItemList.elements();
    } //-- java.util.Enumeration enumerateCommoditItem() 

    /**
     * 
     * 
     * @param index
    **/
    public CommoditItem getCommoditItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _commoditItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (CommoditItem) _commoditItemList.elementAt(index);
    } //-- CommoditItem getCommoditItem(int) 

    /**
    **/
    public CommoditItem[] getCommoditItem()
    {
        int size = _commoditItemList.size();
        CommoditItem[] mArray = new CommoditItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (CommoditItem) _commoditItemList.elementAt(index);
        }
        return mArray;
    } //-- CommoditItem[] getCommoditItem() 

    /**
    **/
    public int getCommoditItemCount()
    {
        return _commoditItemList.size();
    } //-- int getCommoditItemCount() 

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
    **/
    public void removeAllCommoditItem()
    {
        _commoditItemList.removeAllElements();
    } //-- void removeAllCommoditItem() 

    /**
     * 
     * 
     * @param index
    **/
    public CommoditItem removeCommoditItem(int index)
    {
        java.lang.Object obj = _commoditItemList.elementAt(index);
        _commoditItemList.removeElementAt(index);
        return (CommoditItem) obj;
    } //-- CommoditItem removeCommoditItem(int) 

    /**
     * 
     * 
     * @param index
     * @param vCommoditItem
    **/
    public void setCommoditItem(int index, CommoditItem vCommoditItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _commoditItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _commoditItemList.setElementAt(vCommoditItem, index);
    } //-- void setCommoditItem(int, CommoditItem) 

    /**
     * 
     * 
     * @param commoditItemArray
    **/
    public void setCommoditItem(CommoditItem[] commoditItemArray)
    {
        //-- copy array
        _commoditItemList.removeAllElements();
        for (int i = 0; i < commoditItemArray.length; i++) {
            _commoditItemList.addElement(commoditItemArray[i]);
        }
    } //-- void setCommoditItem(CommoditItem) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.commodity.beans.C0001.response.CommodityList unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.commodity.beans.C0001.response.CommodityList) Unmarshaller.unmarshal(com.guoyasoft.commodity.beans.C0001.response.CommodityList.class, reader);
    } //-- com.guoyasoft.commodity.beans.C0001.response.CommodityList unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
