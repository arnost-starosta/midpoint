/**
 * Copyright (c) 2012 Evolveum
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://www.opensource.org/licenses/cddl1 or
 * CDDLv1.0.txt file in the source code distribution.
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 *
 * Portions Copyrighted 2012 [name of copyright owner]
 */
package com.evolveum.midpoint.test;

import org.apache.commons.configuration.Configuration;

import com.evolveum.midpoint.audit.api.AuditService;
import com.evolveum.midpoint.audit.api.AuditServiceFactory;
import com.evolveum.midpoint.audit.api.AuditServiceFactoryException;

/**
 * Factory for DummyAuditService. Only for test use.
 * 
 * @author semancik
 *
 */
public class DummyAuditServiceFactory implements AuditServiceFactory {

	@Override
	public AuditService getAuditService() throws AuditServiceFactoryException {
		return DummyAuditService.getInstance();
	}
	
	@Override
	public void init(Configuration config) throws AuditServiceFactoryException {
		// Nothing to do
	}

	@Override
	public void destroy() throws AuditServiceFactoryException {
		// Nothing to do
	}

	@Override
	public void destroyService(AuditService service) throws AuditServiceFactoryException {
		// Nothing to do
	}

}
