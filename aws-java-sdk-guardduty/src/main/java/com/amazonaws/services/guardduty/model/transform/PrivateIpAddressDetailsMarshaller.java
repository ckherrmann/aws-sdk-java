/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.guardduty.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PrivateIpAddressDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PrivateIpAddressDetailsMarshaller {

    private static final MarshallingInfo<String> PRIVATEDNSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateDnsName").build();
    private static final MarshallingInfo<String> PRIVATEIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("privateIpAddress").build();

    private static final PrivateIpAddressDetailsMarshaller instance = new PrivateIpAddressDetailsMarshaller();

    public static PrivateIpAddressDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PrivateIpAddressDetails privateIpAddressDetails, ProtocolMarshaller protocolMarshaller) {

        if (privateIpAddressDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(privateIpAddressDetails.getPrivateDnsName(), PRIVATEDNSNAME_BINDING);
            protocolMarshaller.marshall(privateIpAddressDetails.getPrivateIpAddress(), PRIVATEIPADDRESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
