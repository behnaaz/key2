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

package org.key_project.key4eclipse.starter.core.test.suite.swtbot;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.key_project.key4eclipse.starter.core.test.testcase.swtbot.SWTBotExampleTest;
import org.key_project.key4eclipse.starter.core.test.testcase.swtbot.SWTBotKeYUtilTest;
import org.key_project.key4eclipse.starter.core.test.testcase.swtbot.SWTBotMainTest;

/**
 * Run all contained JUnit 4 test cases that requires SWT Bot.
 * @author Martin Hentschel
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    SWTBotExampleTest.class,
    SWTBotKeYUtilTest.class,
    SWTBotMainTest.class
})
public class SWTBotAllStarterCoreTests {
}