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


package com.sap.ndb.bimodeldatafoundation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data foundation serves as basis for the mapping of logical objects to physical tables. It contains tableProxies,
 * which link to physical data base	tables. You can define joins between these tables and in additions specify
 * more semantics like which column of the table represents the client	column.
 * Constraints:
 * 1. no loops are allowed among the joins
 * 2. joins are only allowed between compatible data types
 * 3. Each table referred to in a join must be contained in a tableProxy element
 * 4. Attributes having key="true" also need to have	displayAttribute=false
 * 5. join type = 'textTable' if and only if text column is filled	(should)
 *
 *
 * <p>Java class for DataFoundation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DataFoundation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}BIResource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tableProxies" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}TableProxies"/&gt;
 *         &lt;element name="joins" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}Joins" minOccurs="0"/&gt;
 *         &lt;element name="layout" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}Layout" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataFoundation", propOrder = {
    "tableProxies",
    "joins",
    "layout"
})
public class DataFoundation
    extends BIResource {

  @XmlElement(required = true)
  protected TableProxies tableProxies;
  protected Joins joins;
  protected Layout layout;

  /**
   * Gets the value of the tableProxies property.
   *
   * @return possible object is
   * {@link TableProxies }
   */
  public TableProxies getTableProxies() {
    return tableProxies;
  }

  /**
   * Sets the value of the tableProxies property.
   *
   * @param value allowed object is
   *              {@link TableProxies }
   */
  public void setTableProxies(TableProxies value) {
    this.tableProxies = value;
  }

  /**
   * Gets the value of the joins property.
   *
   * @return possible object is
   * {@link Joins }
   */
  public Joins getJoins() {
    return joins;
  }

  /**
   * Sets the value of the joins property.
   *
   * @param value allowed object is
   *              {@link Joins }
   */
  public void setJoins(Joins value) {
    this.joins = value;
  }

  /**
   * Gets the value of the layout property.
   *
   * @return possible object is
   * {@link Layout }
   */
  public Layout getLayout() {
    return layout;
  }

  /**
   * Sets the value of the layout property.
   *
   * @param value allowed object is
   *              {@link Layout }
   */
  public void setLayout(Layout value) {
    this.layout = value;
  }

}
