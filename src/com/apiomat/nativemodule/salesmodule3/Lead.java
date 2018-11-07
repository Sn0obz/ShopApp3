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


import com.apiomat.nativemodule.Level;
import com.apiomat.nativemodule.basics.*;
import com.apiomat.nativemodule.salesmodule3.*;
/**
* Generated class for your Lead data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "SalesModule3",
    hooksClassNameTransient = "com.apiomat.nativemodule.salesmodule3.LeadHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.salesmodule3.LeadHooksNonTransient", 
    isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={}, 
    roleClassesMap={})
public class Lead extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.salesmodule3.Lead> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.salesmodule3.Lead>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "SalesModule3";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Lead";

    /** class specific attributes */
    private java.util.List<com.apiomat.nativemodule.salesmodule3.ContactProtocol> contactAttempts = new java.util.ArrayList<com.apiomat.nativemodule.salesmodule3.ContactProtocol>();
    private String email = null;
    private String firstName = null;
    private String lastName = null;
    private java.util.Date lastVisit = null;
    @com.apiomat.nativemodule.StaticData( type = com.apiomat.nativemodule.StaticData.Type.Image )
    private String profilePicURL;
    private double[] regPlace;
    private Long score = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Lead ()
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

    public java.util.List<com.apiomat.nativemodule.salesmodule3.ContactProtocol> getContactAttempts() 
    {
        if(this.contactAttempts == null || this.contactAttempts.size() == 0)
        {
            /* do this by reflection to be backward compatible */
            try
            {
                java.lang.reflect.Method m = com.apiomat.nativemodule.AbstractClientDataModel.class.getMethod( "loadReferences", String.class,  Class.class );
                this.contactAttempts =  ( java.util.List<com.apiomat.nativemodule.salesmodule3.ContactProtocol> ) m.invoke( this, "contactAttempts", com.apiomat.nativemodule.salesmodule3.ContactProtocol.class );
            }
            catch ( java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e )
            {
                //silently ignored
            }
        }   
        return this.contactAttempts;
    }

    public void postContactAttempts( final com.apiomat.nativemodule.salesmodule3.ContactProtocol refData )
    {
        addReference( "contactAttempts", refData );
        this.contactAttempts.add( refData );
    }

    public void removeContactAttempts( final com.apiomat.nativemodule.salesmodule3.ContactProtocol refData )
    {
        removeReference( "contactAttempts", refData );
        this.contactAttempts.remove( refData );
    }

    public String getEmail()
    {
         return this.email;
    }

    public void setEmail( String arg )
    {
        this.email = arg;
    }

    public String getFirstName()
    {
         return this.firstName;
    }

    public void setFirstName( String arg )
    {
        this.firstName = arg;
    }

    public String getLastName()
    {
         return this.lastName;
    }

    public void setLastName( String arg )
    {
        this.lastName = arg;
    }

    public java.util.Date getLastVisit()
    {
         return this.lastVisit;
    }

    public void setLastVisit( java.util.Date arg )
    {
        this.lastVisit = arg;
    }

    public String getProfilePicURL( )
    {
        return this.profilePicURL;
    }

    public byte[] loadProfilePic( )
    {
        final String resUrl = getProfilePicURL();
        return getData( com.apiomat.nativemodule.IResourceMethods.ResourceType.IMAGE, resUrl);
    }

    public java.io.InputStream loadProfilePicAsStream( )
    {
        final String resUrl = getProfilePicURL();
        return getDataAsStream( com.apiomat.nativemodule.IResourceMethods.ResourceType.IMAGE, resUrl);
    }

    public String getProfilePicURL( String apiKey, String system, int width, int height, 
        String backgroundColorAsHex, Double alpha, String format )
    {
        final java.lang.StringBuilder additionalParameters = new java.lang.StringBuilder();
        additionalParameters.append( ".img?apiKey=" );
        additionalParameters.append( apiKey );
        additionalParameters.append( "&system=" );
        additionalParameters.append( system );
        additionalParameters.append( "&width=" );
        additionalParameters.append( width );
        additionalParameters.append( "&height=" );
        additionalParameters.append( height );
        
        if(backgroundColorAsHex != null) 
        {
            additionalParameters.append( "&bgcolor=" );
            additionalParameters.append( backgroundColorAsHex );
        }
        if(alpha != null)
        {
            additionalParameters.append( "&alpha=" );
            additionalParameters.append( alpha );
        }
        if(format != null)
        {
            additionalParameters.append( "&format=" );
            additionalParameters.append( format );
        }
        return getProfilePicURL( ) + additionalParameters;
    }

    public byte[] loadProfilePic( String apiKey, String system, int width, int height, 
        String backgroundColorAsHex, Double alpha, String format )
    {
        final String resUrl = getProfilePicURL( apiKey, system, width, height, 
            backgroundColorAsHex, alpha, format );
        return loadResource(resUrl);
    }

    public void setProfilePicURL( String url ) 
    {
        this.profilePicURL = url;
    }

    /**
     * @deprecated Use {@link #postProfilePic( java.io.InputStream data , String fileName, String format )}
     */
    @Deprecated
    public String postProfilePic( byte[] data , String fileName, String format )
    {
        String url = saveResource( data, true, fileName, format );
        setProfilePicURL( url );
        return url;
    }

    public String postProfilePic( java.io.InputStream data , String fileName, String format )
    {
        String url = saveResource( data, true, fileName, format );
        setProfilePicURL( url );
        return url;
    }

    public double getRegPlaceLatitude( )
    {
         return this.regPlace !=null && this.regPlace.length > 0 ? this.regPlace[0] : 0;
    }

    public double getRegPlaceLongitude( )
    {
         return this.regPlace !=null && this.regPlace.length > 1 ? this.regPlace[1] : 0;
    }

    public void setRegPlaceLatitude( double latitude )
    {
        if( this.regPlace == null )
        {
            this.regPlace = new double[]{};
        }

        if ( this.regPlace.length < 2 )
        {
            this.regPlace = new double[]{ latitude, 0 };
        }
        else
        {
            this.regPlace[0] = latitude;
        }
    }

    public void setRegPlaceLongitude( double longitude )
    {
        if( this.regPlace == null )
        {
            this.regPlace = new double[]{};
        }

        if ( this.regPlace.length < 2 )
        {
            this.regPlace = new double[]{ 0, longitude };
        }
        else
        {
            this.regPlace[1] = longitude;
        }
    }

    public Long getScore()
    {
         return this.score;
    }

    public void setScore( Long arg )
    {
        this.score = arg;
    }

}
