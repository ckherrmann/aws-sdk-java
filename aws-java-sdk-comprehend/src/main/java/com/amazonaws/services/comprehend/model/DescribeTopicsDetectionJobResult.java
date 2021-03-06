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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeTopicsDetectionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTopicsDetectionJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of properties for the requested job.
     * </p>
     */
    private TopicsDetectionJobProperties topicsDetectionJobProperties;

    /**
     * <p>
     * The list of properties for the requested job.
     * </p>
     * 
     * @param topicsDetectionJobProperties
     *        The list of properties for the requested job.
     */

    public void setTopicsDetectionJobProperties(TopicsDetectionJobProperties topicsDetectionJobProperties) {
        this.topicsDetectionJobProperties = topicsDetectionJobProperties;
    }

    /**
     * <p>
     * The list of properties for the requested job.
     * </p>
     * 
     * @return The list of properties for the requested job.
     */

    public TopicsDetectionJobProperties getTopicsDetectionJobProperties() {
        return this.topicsDetectionJobProperties;
    }

    /**
     * <p>
     * The list of properties for the requested job.
     * </p>
     * 
     * @param topicsDetectionJobProperties
     *        The list of properties for the requested job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTopicsDetectionJobResult withTopicsDetectionJobProperties(TopicsDetectionJobProperties topicsDetectionJobProperties) {
        setTopicsDetectionJobProperties(topicsDetectionJobProperties);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTopicsDetectionJobProperties() != null)
            sb.append("TopicsDetectionJobProperties: ").append(getTopicsDetectionJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTopicsDetectionJobResult == false)
            return false;
        DescribeTopicsDetectionJobResult other = (DescribeTopicsDetectionJobResult) obj;
        if (other.getTopicsDetectionJobProperties() == null ^ this.getTopicsDetectionJobProperties() == null)
            return false;
        if (other.getTopicsDetectionJobProperties() != null && other.getTopicsDetectionJobProperties().equals(this.getTopicsDetectionJobProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicsDetectionJobProperties() == null) ? 0 : getTopicsDetectionJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTopicsDetectionJobResult clone() {
        try {
            return (DescribeTopicsDetectionJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
