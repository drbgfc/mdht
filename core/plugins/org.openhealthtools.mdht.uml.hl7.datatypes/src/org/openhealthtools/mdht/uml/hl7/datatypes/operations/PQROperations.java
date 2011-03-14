/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import java.math.BigDecimal;

import org.openhealthtools.mdht.uml.hl7.datatypes.PQR;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PQR</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQR#setValue(java.lang.Double) <em>Set Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PQROperations extends CVOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PQROperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  void setValue(PQR pqr, Double newValue) {
		if (newValue != null){
			pqr.setValue(BigDecimal.valueOf(newValue.doubleValue()));
		} else {
			pqr.setValue((BigDecimal) null);
		}
	}

} // PQROperations