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
package com.sap.xsk.xsaccess.ds.synchronizer;

import com.sap.xsk.xsaccess.ds.api.IXSKAccessCoreService;
import com.sap.xsk.xsaccess.ds.api.IXSKPrivilegeCoreService;
import java.io.IOException;
import org.eclipse.dirigible.commons.api.content.AbstractClasspathContentHandler;
import org.eclipse.dirigible.commons.api.module.StaticInjector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XSKSecurityClasspathContentHandler extends AbstractClasspathContentHandler {

  private static final Logger logger = LoggerFactory.getLogger(XSKSecurityClasspathContentHandler.class);

  private XSKSecuritySynchronizer extensionsSynchronizer = StaticInjector.getInjector().getInstance(XSKSecuritySynchronizer.class);

  /*
   * (non-Javadoc)
   * @see org.eclipse.dirigible.commons.api.content.AbstractClasspathContentHandler#isValid(java.lang.String)
   */
  @Override
  protected boolean isValid(String path) {
    boolean isValid = false;

    try {
      if (path.endsWith(IXSKAccessCoreService.XSK_FILE_EXTENSION_ACCESS)) {
        isValid = true;
        extensionsSynchronizer.registerPredeliveredAccess(path);
      }
      if (path.endsWith(IXSKPrivilegeCoreService.XSK_FILE_EXTENSION_PRIVILEGE)) {
        isValid = true;
        extensionsSynchronizer.registerPredeliveredPrivileges(path);
      }
    } catch (IOException e) {
      logger.error("Predelivered Security Access or Roles artifact is not valid", e);
    }

    return isValid;
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.dirigible.commons.api.content.AbstractClasspathContentHandler#getLogger()
   */
  @Override
  protected Logger getLogger() {
    return logger;
  }
}
