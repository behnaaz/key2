/*******************************************************************************
 * Copyright (c) 2014 Karlsruhe Institute of Technology, Germany
 *                    Technical University Darmstadt, Germany
 *                    Chalmers University of Technology, Sweden
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Technical University Darmstadt - initial API and implementation and/or initial documentation
 *******************************************************************************/

package org.key_project.util.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.key_project.util.collection.TestImmutables;
import org.key_project.util.testcase.collection.TestLeftistHeapOfInteger;
import org.key_project.util.testcase.collection.TestMapAsListFromIntegerToString;
import org.key_project.util.testcase.collection.TestSLListOfString;
import org.key_project.util.testcase.collection.TestSetAsListOfString;

/**
 * Run all contained JUnit 4 test cases.
 * @author Martin Hentschel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestLeftistHeapOfInteger.class,
    TestMapAsListFromIntegerToString.class,
    TestSetAsListOfString.class,
    TestSLListOfString.class,
    TestImmutables.class
})
public class AllCollectionTests {
}