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

import com.sap.ndb.basemodelbase.FeaturedHierarchyReference;
import com.sap.ndb.basemodelbase.TemporalJoinProperties;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Models the join betweeb two logical objects - e.g. the measure group of a cube and a shared dimension
 *
 *
 * <p>Java class for LogicalJoin complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LogicalJoin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributes" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}AttributeRefs"/&gt;
 *         &lt;element name="associatedAttributeNames" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}AttributeNames"/&gt;
 *         &lt;element name="properties" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}JoinProperties"/&gt;
 *         &lt;element name="temporalJoinProperties" type="{http://www.sap.com/ndb/BaseModelBase.ecore}TemporalJoinProperties" minOccurs="0"/&gt;
 *         &lt;element name="associatedAttributeFeatures" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}FeaturedAttributeReferences" minOccurs="0"/&gt;
 *         &lt;element name="associatedHierarchyFeature" type="{http://www.sap.com/ndb/BaseModelBase.ecore}FeaturedHierarchyReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="associatedObjectUri" use="required" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}RepositoryUri" /&gt;
 *       &lt;attribute name="languageAttributeName" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}AlphanumericName" /&gt;
 *       &lt;attribute name="useDimensionViewHierarchies" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalJoin", propOrder = {
    "attributes",
    "associatedAttributeNames",
    "properties",
    "temporalJoinProperties",
    "associatedAttributeFeatures",
    "associatedHierarchyFeature"
})
public class LogicalJoin {

  @XmlElement(required = true)
  protected AttributeRefs attributes;
  @XmlElement(required = true)
  protected AttributeNames associatedAttributeNames;
  @XmlElement(required = true)
  protected JoinProperties properties;
  protected TemporalJoinProperties temporalJoinProperties;
  protected FeaturedAttributeReferences associatedAttributeFeatures;
  protected List<FeaturedHierarchyReference> associatedHierarchyFeature;
  @XmlAttribute(name = "associatedObjectUri", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String associatedObjectUri;
  @XmlAttribute(name = "languageAttributeName")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String languageAttributeName;
  @XmlAttribute(name = "useDimensionViewHierarchies")
  protected Boolean useDimensionViewHierarchies;

  /**
   * Gets the value of the attributes property.
   *
   * @return possible object is
   * {@link AttributeRefs }
   */
  public AttributeRefs getAttributes() {
    return attributes;
  }

  /**
   * Sets the value of the attributes property.
   *
   * @param value allowed object is
   *              {@link AttributeRefs }
   */
  public void setAttributes(AttributeRefs value) {
    this.attributes = value;
  }

  /**
   * Gets the value of the associatedAttributeNames property.
   *
   * @return possible object is
   * {@link AttributeNames }
   */
  public AttributeNames getAssociatedAttributeNames() {
    return associatedAttributeNames;
  }

  /**
   * Sets the value of the associatedAttributeNames property.
   *
   * @param value allowed object is
   *              {@link AttributeNames }
   */
  public void setAssociatedAttributeNames(AttributeNames value) {
    this.associatedAttributeNames = value;
  }

  /**
   * Gets the value of the properties property.
   *
   * @return possible object is
   * {@link JoinProperties }
   */
  public JoinProperties getProperties() {
    return properties;
  }

  /**
   * Sets the value of the properties property.
   *
   * @param value allowed object is
   *              {@link JoinProperties }
   */
  public void setProperties(JoinProperties value) {
    this.properties = value;
  }

  /**
   * Gets the value of the temporalJoinProperties property.
   *
   * @return possible object is
   * {@link TemporalJoinProperties }
   */
  public TemporalJoinProperties getTemporalJoinProperties() {
    return temporalJoinProperties;
  }

  /**
   * Sets the value of the temporalJoinProperties property.
   *
   * @param value allowed object is
   *              {@link TemporalJoinProperties }
   */
  public void setTemporalJoinProperties(TemporalJoinProperties value) {
    this.temporalJoinProperties = value;
  }

  /**
   * Gets the value of the associatedAttributeFeatures property.
   *
   * @return possible object is
   * {@link FeaturedAttributeReferences }
   */
  public FeaturedAttributeReferences getAssociatedAttributeFeatures() {
    return associatedAttributeFeatures;
  }

  /**
   * Sets the value of the associatedAttributeFeatures property.
   *
   * @param value allowed object is
   *              {@link FeaturedAttributeReferences }
   */
  public void setAssociatedAttributeFeatures(FeaturedAttributeReferences value) {
    this.associatedAttributeFeatures = value;
  }

  /**
   * Gets the value of the associatedHierarchyFeature property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the associatedHierarchyFeature property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAssociatedHierarchyFeature().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link FeaturedHierarchyReference }
   */
  public List<FeaturedHierarchyReference> getAssociatedHierarchyFeature() {
    if (associatedHierarchyFeature == null) {
      associatedHierarchyFeature = new ArrayList<FeaturedHierarchyReference>();
    }
    return this.associatedHierarchyFeature;
  }

  /**
   * Gets the value of the associatedObjectUri property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getAssociatedObjectUri() {
    return associatedObjectUri;
  }

  /**
   * Sets the value of the associatedObjectUri property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setAssociatedObjectUri(String value) {
    this.associatedObjectUri = value;
  }

  /**
   * Gets the value of the languageAttributeName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getLanguageAttributeName() {
    return languageAttributeName;
  }

  /**
   * Sets the value of the languageAttributeName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setLanguageAttributeName(String value) {
    this.languageAttributeName = value;
  }

  /**
   * Gets the value of the useDimensionViewHierarchies property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isUseDimensionViewHierarchies() {
    return useDimensionViewHierarchies;
  }

  /**
   * Sets the value of the useDimensionViewHierarchies property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setUseDimensionViewHierarchies(Boolean value) {
    this.useDimensionViewHierarchies = value;
  }

}
