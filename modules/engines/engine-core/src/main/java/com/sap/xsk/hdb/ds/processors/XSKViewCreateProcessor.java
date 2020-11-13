/**
 * Copyright (c) 2010-2019 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   SAP - initial API and implementation
 */
package com.sap.xsk.hdb.ds.processors;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.eclipse.dirigible.commons.config.Configuration;
import org.eclipse.dirigible.database.ds.model.IDataStructureModel;
import org.eclipse.dirigible.database.sql.SqlFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.xsk.hdb.ds.model.hdbview.XSKDataStructureHDBViewModel;

/**
 * The View Create Processor.
 */
public class XSKViewCreateProcessor {

	private static final Logger logger = LoggerFactory.getLogger(XSKViewCreateProcessor.class);

	/**
	 * Execute the corresponding statement.
	 *
	 * @param connection the connection
	 * @param viewModel the view model
	 * @throws SQLException the SQL exception
	 */
	public static void execute(Connection connection, XSKDataStructureHDBViewModel viewModel) throws SQLException {
		boolean caseSensitive = Boolean.parseBoolean(Configuration.get(IDataStructureModel.DIRIGIBLE_DATABASE_NAMES_CASE_SENSITIVE, "false"));
		String viewName = viewModel.getName();
		if (caseSensitive) {
			viewName = "\"" + viewName + "\"";
		}
		logger.info("Processing Create View: " + viewName);
		if (!SqlFactory.getNative(connection).exists(connection, viewName)) {
			String sql = SqlFactory.getNative(connection).create().view(viewName).asSelect(viewModel.getQuery()).build();
			PreparedStatement statement = null;
			try {
				statement = connection.prepareStatement(sql);
				logger.info(sql);
				statement.executeUpdate();
			} catch (SQLException e) {
				logger.error(sql);
				logger.error(e.getMessage(), e);
			} finally {
				if (statement != null) {
					statement.close();
				}
			}
		}
	}

}
