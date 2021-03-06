/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.google.bigquery.sql.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Google BigQuery data warehouse for analytics. BigQuery Endpoint Definition
 * Represents a table within a BigQuery dataset Contains configuration details
 * for a single table and the utility methods (such as check, create) to ease
 * operations URI Parameters: Logger ID - To ensure that logging is unified
 * under Route Logger, the logger ID can be passed on via an endpoint URI
 * parameter Partitioned - to indicate that the table needs to be partitioned -
 * every UTC day to be written into a timestamped separate table side effect:
 * Australian operational day is always split between two UTC days, and,
 * therefore, tables Another consideration is that exceptions are not handled
 * within the class. They are expected to bubble up and be handled by Camel.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.google-bigquery-sql")
public class GoogleBigQuerySQLComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the google-bigquery-sql
     * component. This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Google Cloud Project Id
     */
    private String projectId;
    /**
     * ConnectionFactory to obtain connection to Bigquery Service. If non
     * provided the default one will be used
     */
    private GoogleBigQueryConnectionFactoryNestedConfiguration connectionFactory;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public GoogleBigQueryConnectionFactoryNestedConfiguration getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(
            GoogleBigQueryConnectionFactoryNestedConfiguration connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class GoogleBigQueryConnectionFactoryNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory.class;
    }
}