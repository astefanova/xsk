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
package com.sap.xsk.parser.xsodata.model;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class XSKHDBXSODATAService {

    private String namespace;
    private boolean enableOData4SAPAnnotations;
    private XSKHDBXSODATASetting setting;
    private ArrayList<XSKHDBXSODATAEntity> entities = new ArrayList<>();
    private ArrayList<XSKHDBXSODATAAssociation> associations = new ArrayList<>();
}
