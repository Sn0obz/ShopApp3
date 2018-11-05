/*
 * Copyright (c) 2011 - 2018, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.salesmodule3;


import com.apiomat.nativemodule.basics.*;
import com.apiomat.nativemodule.salesmodule3.*;
/**
* Generated default class representing a user in your app
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "SalesModule3",
    hooksClassNameTransient = "com.apiomat.nativemodule.salesmodule3.SalesmanHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.salesmodule3.SalesmanHooksNonTransient", 
    isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.Guest, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={}, 
    roleClassesMap={})
public class Salesman extends com.apiomat.nativemodule.basics.User
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "SalesModule3";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Salesman";

    /** class specific attributes */
    private java.util.List<com.apiomat.nativemodule.salesmodule3.Lead> listOfLeads = new java.util.ArrayList<com.apiomat.nativemodule.salesmodule3.Lead>();
    private double[] salesArea;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Salesman ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public java.util.List<com.apiomat.nativemodule.salesmodule3.Lead> getListOfLeads() 
    {
        if(this.listOfLeads == null || this.listOfLeads.size() == 0)
        {
            /* do this by reflection to be backward compatible */
            try
            {
                java.lang.reflect.Method m = com.apiomat.nativemodule.AbstractClientDataModel.class.getMethod( "loadReferences", String.class,  Class.class );
                this.listOfLeads =  ( java.util.List<com.apiomat.nativemodule.salesmodule3.Lead> ) m.invoke( this, "listOfLeads", com.apiomat.nativemodule.salesmodule3.Lead.class );
            }
            catch ( java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e )
            {
                //silently ignored
            }
        }   
        return this.listOfLeads;
    }

    public void postListOfLeads( final com.apiomat.nativemodule.salesmodule3.Lead refData )
    {
        addReference( "listOfLeads", refData );
        this.listOfLeads.add( refData );
    }

    public void removeListOfLeads( final com.apiomat.nativemodule.salesmodule3.Lead refData )
    {
        removeReference( "listOfLeads", refData );
        this.listOfLeads.remove( refData );
    }

    public double getSalesAreaLatitude( )
    {
         return this.salesArea !=null && this.salesArea.length > 0 ? this.salesArea[0] : 0;
    }

    public double getSalesAreaLongitude( )
    {
         return this.salesArea !=null && this.salesArea.length > 1 ? this.salesArea[1] : 0;
    }

    public void setSalesAreaLatitude( double latitude )
    {
        if( this.salesArea == null )
        {
            this.salesArea = new double[]{};
        }

        if ( this.salesArea.length < 2 )
        {
            this.salesArea = new double[]{ latitude, 0 };
        }
        else
        {
            this.salesArea[0] = latitude;
        }
    }

    public void setSalesAreaLongitude( double longitude )
    {
        if( this.salesArea == null )
        {
            this.salesArea = new double[]{};
        }

        if ( this.salesArea.length < 2 )
        {
            this.salesArea = new double[]{ 0, longitude };
        }
        else
        {
            this.salesArea[1] = longitude;
        }
    }

}
