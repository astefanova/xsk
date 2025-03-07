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
package com.sap.xsk.hdbti.api;

public class XSKTableImportException extends Exception {

  public XSKTableImportException() {
  }

  public XSKTableImportException(String message) {
    super(message);
  }

  public XSKTableImportException(String message, Throwable cause) {
    super(message, cause);
  }

  public XSKTableImportException(Throwable cause) {
    super(cause);
  }
}