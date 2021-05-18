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


package com.sap.ndb.bimodeldimension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A derived dimension is reusing an existing dimension (the "baseDimension") completely but
 * defines an alias and an alias description for the base dimension.
 *
 *
 * <p>Java class for DerivedDimension complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DerivedDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/BiModelDimension.ecore}Dimension"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baseDimensionUri" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}RepositoryUri"/&gt;
 *         &lt;element name="baseDimension" type="{http://www.sap.com/ndb/BiModelDimension.ecore}Dimension"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedDimension", propOrder = {
    "baseDimensionUri",
    "baseDimension"
})
public class DerivedDimension
    extends Dimension {

  @XmlElement(required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String baseDimensionUri;
  @XmlElement(required = true)
  protected Dimension baseDimension;

  /**
   * Gets the value of the baseDimensionUri property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getBaseDimensionUri() {
    return baseDimensionUri;
  }

  /**
   * Sets the value of the baseDimensionUri property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setBaseDimensionUri(String value) {
    this.baseDimensionUri = value;
  }

  /**
   * Gets the value of the baseDimension property.
   *
   * @return possible object is
   * {@link Dimension }
   */
  public Dimension getBaseDimension() {
    return baseDimension;
  }

  /**
   * Sets the value of the baseDimension property.
   *
   * @param value allowed object is
   *              {@link Dimension }
   */
  public void setBaseDimension(Dimension value) {
    this.baseDimension = value;
  }

}