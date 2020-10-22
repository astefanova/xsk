package com.sap.xsk.hdbti.synchronizer;

import org.eclipse.dirigible.commons.config.Configuration;
import org.eclipse.dirigible.core.scheduler.api.IJobDefinitionProvider;
import org.eclipse.dirigible.core.scheduler.api.ISchedulerCoreService;
import org.eclipse.dirigible.core.scheduler.service.definition.JobDefinition;

public class XSKTableImportSynchronizerJobDefinitionProvider implements IJobDefinitionProvider {

    private static final String DIRIGIBLE_JOB_EXPRESSION_XSK_TABLE_IMPORT = "DIRIGIBLE_JOB_EXPRESSION_XSK_TABLE_IMPORT";
	private static final String XSK_TABLE_IMPORT_SYNCHRONIZER_JOB = "XSK Table Import Synchronizer Job";
	private static final String DIRIGIBLE_INTERNAL_XSK_TABLE_IMPORT_SYNCHRONIZER_JOB = "dirigible-internal-xsc-table-import-synchronizer-job";

	@Override
    public JobDefinition getJobDefinition() {
        JobDefinition jobDefinition = new JobDefinition();
        jobDefinition.setName(DIRIGIBLE_INTERNAL_XSK_TABLE_IMPORT_SYNCHRONIZER_JOB);
        jobDefinition.setGroup(ISchedulerCoreService.JOB_GROUP_INTERNAL);
        jobDefinition.setClazz(XSKTableImportSynchronizerJob.class.getCanonicalName());
        jobDefinition.setDescription(XSK_TABLE_IMPORT_SYNCHRONIZER_JOB);
        jobDefinition.setExpression(Configuration.get(DIRIGIBLE_JOB_EXPRESSION_XSK_TABLE_IMPORT, "0/45 * * * * ?"));
        jobDefinition.setSingleton(true);
        return jobDefinition;
    }
}
