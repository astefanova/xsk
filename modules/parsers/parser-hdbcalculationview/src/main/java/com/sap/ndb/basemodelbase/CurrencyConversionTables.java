/*
 * Copyright (c) 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.basemodelbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Root class for specifying tables for conversion (currency conversion and unit conversion)
 *
 *
 * <p>Java class for CurrencyConversionTables complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CurrencyConversionTables"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="rates" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *       &lt;attribute name="configuration" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *       &lt;attribute name="prefactors" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *       &lt;attribute name="notations" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *       &lt;attribute name="precisions" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversionTables")
public class CurrencyConversionTables {

  @XmlAttribute(name = "rates", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String rates;
  @XmlAttribute(name = "configuration", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String configuration;
  @XmlAttribute(name = "prefactors", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String prefactors;
  @XmlAttribute(name = "notations", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String notations;
  @XmlAttribute(name = "precisions", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String precisions;

  /**
   * Gets the value of the rates property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getRates() {
    return rates;
  }

  /**
   * Sets the value of the rates property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setRates(String value) {
    this.rates = value;
  }

  /**
   * Gets the value of the configuration property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getConfiguration() {
    return configuration;
  }

  /**
   * Sets the value of the configuration property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setConfiguration(String value) {
    this.configuration = value;
  }

  /**
   * Gets the value of the prefactors property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getPrefactors() {
    return prefactors;
  }

  /**
   * Sets the value of the prefactors property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setPrefactors(String value) {
    this.prefactors = value;
  }

  /**
   * Gets the value of the notations property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getNotations() {
    return notations;
  }

  /**
   * Sets the value of the notations property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setNotations(String value) {
    this.notations = value;
  }

  /**
   * Gets the value of the precisions property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getPrecisions() {
    return precisions;
  }

  /**
   * Sets the value of the precisions property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setPrecisions(String value) {
    this.precisions = value;
  }

}
