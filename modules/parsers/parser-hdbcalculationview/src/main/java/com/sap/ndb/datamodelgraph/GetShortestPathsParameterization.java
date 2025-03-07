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


package com.sap.ndb.datamodelgraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Parameterization for the graph action GET_SHORTEST_PATHS_ONE_TO_ALL
 * This action returns the shortest paths from the provided start vertex to all reachable vertices in the graph
 * also known as single-source shortest path (SSSP). The root of the tree is the start vertex.
 * All other vertices carry the shortest distance information.
 * The non-negative edge weights are read from the column provided in the edge table.
 * First output columns:
 * -key of the vertices table
 * -weightColumn
 * Second output columns:
 * -key of the edges table
 *
 *
 * <p>Java class for GetShortestPathsParameterization complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetShortestPathsParameterization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/DataModelGraph.ecore}GraphActionParameterization"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="startVertex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="startVertexParameter" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="inputWeightColumn" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" minOccurs="0"/&gt;
 *           &lt;element name="inputWeightColumnParameter" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="direction" type="{http://www.sap.com/ndb/DataModelGraph.ecore}Direction" minOccurs="0"/&gt;
 *           &lt;element name="directionParameter" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetShortestPathsParameterization", propOrder = {
    "startVertex",
    "startVertexParameter",
    "inputWeightColumn",
    "inputWeightColumnParameter",
    "direction",
    "directionParameter"
})
@XmlSeeAlso({
    GetShortestPathParameterization.class
})
public class GetShortestPathsParameterization
    extends GraphActionParameterization {

  protected String startVertex;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String startVertexParameter;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String inputWeightColumn;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String inputWeightColumnParameter;
  @XmlSchemaType(name = "NMTOKEN")
  protected Direction direction;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String directionParameter;

  /**
   * Gets the value of the startVertex property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getStartVertex() {
    return startVertex;
  }

  /**
   * Sets the value of the startVertex property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setStartVertex(String value) {
    this.startVertex = value;
  }

  /**
   * Gets the value of the startVertexParameter property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getStartVertexParameter() {
    return startVertexParameter;
  }

  /**
   * Sets the value of the startVertexParameter property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setStartVertexParameter(String value) {
    this.startVertexParameter = value;
  }

  /**
   * Gets the value of the inputWeightColumn property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getInputWeightColumn() {
    return inputWeightColumn;
  }

  /**
   * Sets the value of the inputWeightColumn property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setInputWeightColumn(String value) {
    this.inputWeightColumn = value;
  }

  /**
   * Gets the value of the inputWeightColumnParameter property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getInputWeightColumnParameter() {
    return inputWeightColumnParameter;
  }

  /**
   * Sets the value of the inputWeightColumnParameter property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setInputWeightColumnParameter(String value) {
    this.inputWeightColumnParameter = value;
  }

  /**
   * Gets the value of the direction property.
   *
   * @return possible object is
   * {@link Direction }
   */
  public Direction getDirection() {
    return direction;
  }

  /**
   * Sets the value of the direction property.
   *
   * @param value allowed object is
   *              {@link Direction }
   */
  public void setDirection(Direction value) {
    this.direction = value;
  }

  /**
   * Gets the value of the directionParameter property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDirectionParameter() {
    return directionParameter;
  }

  /**
   * Sets the value of the directionParameter property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDirectionParameter(String value) {
    this.directionParameter = value;
  }

}
