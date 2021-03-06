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
package com.amazonaws.services.kinesisvideo.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisvideo.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FragmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FragmentMarshaller {

    private static final MarshallingInfo<String> FRAGMENTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FragmentNumber").build();
    private static final MarshallingInfo<Long> FRAGMENTSIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FragmentSizeInBytes").build();
    private static final MarshallingInfo<java.util.Date> PRODUCERTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProducerTimestamp").build();
    private static final MarshallingInfo<java.util.Date> SERVERTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerTimestamp").build();
    private static final MarshallingInfo<Long> FRAGMENTLENGTHINMILLISECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FragmentLengthInMilliseconds").build();

    private static final FragmentMarshaller instance = new FragmentMarshaller();

    public static FragmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Fragment fragment, ProtocolMarshaller protocolMarshaller) {

        if (fragment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fragment.getFragmentNumber(), FRAGMENTNUMBER_BINDING);
            protocolMarshaller.marshall(fragment.getFragmentSizeInBytes(), FRAGMENTSIZEINBYTES_BINDING);
            protocolMarshaller.marshall(fragment.getProducerTimestamp(), PRODUCERTIMESTAMP_BINDING);
            protocolMarshaller.marshall(fragment.getServerTimestamp(), SERVERTIMESTAMP_BINDING);
            protocolMarshaller.marshall(fragment.getFragmentLengthInMilliseconds(), FRAGMENTLENGTHINMILLISECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
