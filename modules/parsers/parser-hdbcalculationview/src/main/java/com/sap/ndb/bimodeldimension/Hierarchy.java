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

import com.sap.ndb.basemodelbase.CycleHandling;
import com.sap.ndb.basemodelbase.HierarchyJoinProperties;
import com.sap.ndb.basemodelbase.OrphanedNodesHandling;
import com.sap.ndb.basemodelbase.RootNodeVisibility;
import com.sap.ndb.basemodelbase.UnassignedMemberProperties;
import com.sap.ndb.repositorymodelresource.IDObjectWithDescription;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hierarchy complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Hierarchy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/RepositoryModelResource.ecore}IDObjectWithDescription"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="joinProperties" type="{http://www.sap.com/ndb/BaseModelBase.ecore}HierarchyJoinProperties" minOccurs="0"/&gt;
 *         &lt;element name="unassignedMemberProperties" type="{http://www.sap.com/ndb/BaseModelBase.ecore}UnassignedMemberProperties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="withRootNode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="rootNodeVisibility" type="{http://www.sap.com/ndb/BaseModelBase.ecore}RootNodeVisibility" /&gt;
 *       &lt;attribute name="aggregateAllNodes" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="defaultMember" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DefaultMember" /&gt;
 *       &lt;attribute name="multipleParents" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="orphanedNodesHandling" type="{http://www.sap.com/ndb/BaseModelBase.ecore}OrphanedNodesHandling" /&gt;
 *       &lt;attribute name="cycleHandling" type="{http://www.sap.com/ndb/BaseModelBase.ecore}CycleHandling" /&gt;
 *       &lt;attribute name="cacheEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="emptyValueIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hierarchy", propOrder = {
    "joinProperties",
    "unassignedMemberProperties"
})
@XmlSeeAlso({
    ParentChildHierarchy.class,
    ExternalHierarchy.class,
    LeveledHierarchy.class
})
public abstract class Hierarchy
    extends IDObjectWithDescription {

  protected HierarchyJoinProperties joinProperties;
  protected UnassignedMemberProperties unassignedMemberProperties;
  @XmlAttribute(name = "withRootNode")
  protected Boolean withRootNode;
  @XmlAttribute(name = "rootNodeVisibility")
  protected RootNodeVisibility rootNodeVisibility;
  @XmlAttribute(name = "aggregateAllNodes")
  protected Boolean aggregateAllNodes;
  @XmlAttribute(name = "defaultMember")
  protected String defaultMember;
  @XmlAttribute(name = "multipleParents")
  protected Boolean multipleParents;
  @XmlAttribute(name = "orphanedNodesHandling")
  protected OrphanedNodesHandling orphanedNodesHandling;
  @XmlAttribute(name = "cycleHandling")
  protected CycleHandling cycleHandling;
  @XmlAttribute(name = "cacheEnabled")
  protected Boolean cacheEnabled;
  @XmlAttribute(name = "emptyValueIsNull")
  protected Boolean emptyValueIsNull;

  /**
   * Gets the value of the joinProperties property.
   *
   * @return possible object is
   * {@link HierarchyJoinProperties }
   */
  public HierarchyJoinProperties getJoinProperties() {
    return joinProperties;
  }

  /**
   * Sets the value of the joinProperties property.
   *
   * @param value allowed object is
   *              {@link HierarchyJoinProperties }
   */
  public void setJoinProperties(HierarchyJoinProperties value) {
    this.joinProperties = value;
  }

  /**
   * Gets the value of the unassignedMemberProperties property.
   *
   * @return possible object is
   * {@link UnassignedMemberProperties }
   */
  public UnassignedMemberProperties getUnassignedMemberProperties() {
    return unassignedMemberProperties;
  }

  /**
   * Sets the value of the unassignedMemberProperties property.
   *
   * @param value allowed object is
   *              {@link UnassignedMemberProperties }
   */
  public void setUnassignedMemberProperties(UnassignedMemberProperties value) {
    this.unassignedMemberProperties = value;
  }

  /**
   * Gets the value of the withRootNode property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isWithRootNode() {
    return withRootNode;
  }

  /**
   * Sets the value of the withRootNode property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setWithRootNode(Boolean value) {
    this.withRootNode = value;
  }

  /**
   * Gets the value of the rootNodeVisibility property.
   *
   * @return possible object is
   * {@link RootNodeVisibility }
   */
  public RootNodeVisibility getRootNodeVisibility() {
    return rootNodeVisibility;
  }

  /**
   * Sets the value of the rootNodeVisibility property.
   *
   * @param value allowed object is
   *              {@link RootNodeVisibility }
   */
  public void setRootNodeVisibility(RootNodeVisibility value) {
    this.rootNodeVisibility = value;
  }

  /**
   * Gets the value of the aggregateAllNodes property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isAggregateAllNodes() {
    return aggregateAllNodes;
  }

  /**
   * Sets the value of the aggregateAllNodes property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setAggregateAllNodes(Boolean value) {
    this.aggregateAllNodes = value;
  }

  /**
   * Gets the value of the defaultMember property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDefaultMember() {
    return defaultMember;
  }

  /**
   * Sets the value of the defaultMember property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDefaultMember(String value) {
    this.defaultMember = value;
  }

  /**
   * Gets the value of the multipleParents property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isMultipleParents() {
    return multipleParents;
  }

  /**
   * Sets the value of the multipleParents property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setMultipleParents(Boolean value) {
    this.multipleParents = value;
  }

  /**
   * Gets the value of the orphanedNodesHandling property.
   *
   * @return possible object is
   * {@link OrphanedNodesHandling }
   */
  public OrphanedNodesHandling getOrphanedNodesHandling() {
    return orphanedNodesHandling;
  }

  /**
   * Sets the value of the orphanedNodesHandling property.
   *
   * @param value allowed object is
   *              {@link OrphanedNodesHandling }
   */
  public void setOrphanedNodesHandling(OrphanedNodesHandling value) {
    this.orphanedNodesHandling = value;
  }

  /**
   * Gets the value of the cycleHandling property.
   *
   * @return possible object is
   * {@link CycleHandling }
   */
  public CycleHandling getCycleHandling() {
    return cycleHandling;
  }

  /**
   * Sets the value of the cycleHandling property.
   *
   * @param value allowed object is
   *              {@link CycleHandling }
   */
  public void setCycleHandling(CycleHandling value) {
    this.cycleHandling = value;
  }

  /**
   * Gets the value of the cacheEnabled property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isCacheEnabled() {
    return cacheEnabled;
  }

  /**
   * Sets the value of the cacheEnabled property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setCacheEnabled(Boolean value) {
    this.cacheEnabled = value;
  }

  /**
   * Gets the value of the emptyValueIsNull property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isEmptyValueIsNull() {
    return emptyValueIsNull;
  }

  /**
   * Sets the value of the emptyValueIsNull property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setEmptyValueIsNull(Boolean value) {
    this.emptyValueIsNull = value;
  }

}
