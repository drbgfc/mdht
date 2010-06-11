/**
 * Copyright (c) 2010 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings({ "nls", "serial" })
public class ReactionObservationOperationsTest extends StructuralAttributeValidationTest {

	protected static final String REACTION_OBSERVATION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.54";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(CLASS_CODE_ATTRIBUTE_NAME, ActClassObservation.OBS);
			put(MOOD_CODE_ATTRIBUTE_NAME, x_ActMoodDocumentObservation.EVN);
		}
	};

	protected static final String STATUS_CODE = "completed";
	protected static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDCCDValidationTest(REACTION_OBSERVATION_TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ReactionObservationOperations
				.validateReactionObservationTemplateId(
						(ReactionObservation) eObjectToTest,
						diagnostician, map);
			}

		},

		// Status Code
		// -------------------------------------------------------------
		new StatusCodeCCDValidationTest(STATUS_CODE,
				STATUS_CODE_CODE_SYSTEM) {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ReactionObservationOperations
				.validateReactionObservationStatusCode(
						(ReactionObservation) eObjectToTest,
						diagnostician, map);
			}
		},

		// Entry Relationship
		// -------------------------------------------------------------
		new EntryRelationshipCCDValidationTest() {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ReactionObservationOperations
				.validateReactionObservationSeverityObservation(
						(ReactionObservation) eObjectToTest,
						diagnostician, map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<EntryRelationship> retValue = new BasicEList<EntryRelationship>();
				final EntryRelationship er = CDAFactory.eINSTANCE
				.createEntryRelationship();
				//er.setTypeCode(x_ActRelationshipEntryRelationship.SAS);
				er.setObservation(CCDFactory.eINSTANCE
						.createSeverityObservation());
				retValue.add(er);
				return retValue;
			}
		}

	}; // TEST_CASE_ARRAY

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		return new ArrayList<CDATestCase>(Arrays.asList(TEST_CASE_ARRAY));
	}

	@Override
	protected EObject getEObjectToValidate() {
		return CCDFactory.eINSTANCE.createReactionObservation();
	}

	@Override
	protected EObject getEObjectInitToValidate() {
		return CCDFactory.eINSTANCE.createReactionObservation().init();
	}

	@Override
	protected Enumerator doGetValidStructuralAttributeValue(
			final String structuralAttributeName) {
		return VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP
		.get(structuralAttributeName);
	}

	@Override
	protected boolean doValidateStructuralAttributeValues(
			final EObject eObjectToValidate,
			final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
		return ReactionObservationOperations
		.validateReactionObservationClassCode(
				(ReactionObservation) eObjectToValidate,
				diagnostician, map)
				&& ReactionObservationOperations
				.validateReactionObservationMoodCode(
						(ReactionObservation) eObjectToValidate,
						diagnostician, map);
	}

} // ReactionObservationOperationsTest