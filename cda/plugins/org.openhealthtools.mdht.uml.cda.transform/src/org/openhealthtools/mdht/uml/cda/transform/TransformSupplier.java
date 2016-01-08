/*******************************************************************************
 * Copyright (c) 2015 AlexSkillender.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     AlexSkillender (NEHTA) - initial API and implementation
 *
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.cda.core.util.TransformProvider;
import org.openhealthtools.mdht.uml.transform.IBaseModelReflection;

/**
 * Abstracts access to CDA Transform properties with out a dependency
 */
public class TransformSupplier implements TransformProvider {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.core.util.TransformProvider#GetTransform()
	 */
	public Property GetTransform(Property property) {

		IBaseModelReflection ibmr = new CDABaseModelReflection();
		return ibmr.getBaseProperty((Classifier) property.getOwner(), property);

	}

}
