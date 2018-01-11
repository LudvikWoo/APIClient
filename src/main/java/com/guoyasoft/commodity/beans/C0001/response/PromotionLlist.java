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
public class PromotionLlist implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.util.Vector _promotionItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PromotionLlist() {
        super();
        _promotionItemList = new Vector();
    } //-- com.guoyasoft.commodity.beans.C0001.response.PromotionLlist()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPromotionItem
    **/
    public void addPromotionItem(PromotionItem vPromotionItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _promotionItemList.addElement(vPromotionItem);
    } //-- void addPromotionItem(PromotionItem) 

    /**
     * 
     * 
     * @param index
     * @param vPromotionItem
    **/
    public void addPromotionItem(int index, PromotionItem vPromotionItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _promotionItemList.insertElementAt(vPromotionItem, index);
    } //-- void addPromotionItem(int, PromotionItem) 

    /**
    **/
    public java.util.Enumeration enumeratePromotionItem()
    {
        return _promotionItemList.elements();
    } //-- java.util.Enumeration enumeratePromotionItem() 

    /**
     * 
     * 
     * @param index
    **/
    public PromotionItem getPromotionItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _promotionItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (PromotionItem) _promotionItemList.elementAt(index);
    } //-- PromotionItem getPromotionItem(int) 

    /**
    **/
    public PromotionItem[] getPromotionItem()
    {
        int size = _promotionItemList.size();
        PromotionItem[] mArray = new PromotionItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (PromotionItem) _promotionItemList.elementAt(index);
        }
        return mArray;
    } //-- PromotionItem[] getPromotionItem() 

    /**
    **/
    public int getPromotionItemCount()
    {
        return _promotionItemList.size();
    } //-- int getPromotionItemCount() 

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
    public void removeAllPromotionItem()
    {
        _promotionItemList.removeAllElements();
    } //-- void removeAllPromotionItem() 

    /**
     * 
     * 
     * @param index
    **/
    public PromotionItem removePromotionItem(int index)
    {
        java.lang.Object obj = _promotionItemList.elementAt(index);
        _promotionItemList.removeElementAt(index);
        return (PromotionItem) obj;
    } //-- PromotionItem removePromotionItem(int) 

    /**
     * 
     * 
     * @param index
     * @param vPromotionItem
    **/
    public void setPromotionItem(int index, PromotionItem vPromotionItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _promotionItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _promotionItemList.setElementAt(vPromotionItem, index);
    } //-- void setPromotionItem(int, PromotionItem) 

    /**
     * 
     * 
     * @param promotionItemArray
    **/
    public void setPromotionItem(PromotionItem[] promotionItemArray)
    {
        //-- copy array
        _promotionItemList.removeAllElements();
        for (int i = 0; i < promotionItemArray.length; i++) {
            _promotionItemList.addElement(promotionItemArray[i]);
        }
    } //-- void setPromotionItem(PromotionItem) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.commodity.beans.C0001.response.PromotionLlist unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.commodity.beans.C0001.response.PromotionLlist) Unmarshaller.unmarshal(com.guoyasoft.commodity.beans.C0001.response.PromotionLlist.class, reader);
    } //-- com.guoyasoft.commodity.beans.C0001.response.PromotionLlist unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
