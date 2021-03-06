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

package org.key_project.sed.ui.visualization.util;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.swt.graphics.RGB;

/**
 * Initializes the preferences of {@link VisualizationPreferences} when they are
 * accessed the first time. This is managed by extension point
 * {@code org.eclipse.core.runtime.preferences}.
 * @author Martin Hentschel
 * @see VisualizationPreferences
 */
public class VisualizationPreferencesInitializer extends AbstractPreferenceInitializer {
   /**
    * {@inheritDoc}
    */
   @Override
   public void initializeDefaultPreferences() {
      VisualizationPreferences.setDefaultSwitchToStateVisualizationPerspective(MessageDialogWithToggle.PROMPT);
      VisualizationPreferences.setDefaultExecutionTreeNodeFirstBackgroundColor(new RGB(212, 231, 248));
      VisualizationPreferences.setDefaultExecutionTreeNodeSecondBackgroundColor(new RGB(250, 251, 252));
      VisualizationPreferences.setDefaultExecutionTreeNodeDirectionHorizontal(true);
      VisualizationPreferences.setDefaultExecutionTreeNodeForegroundColor(new RGB(67, 106, 149));
      VisualizationPreferences.setDefaultExecutionTreeNodeTextColor(new RGB(0, 0, 0));
      VisualizationPreferences.setDefaultExecutionTreeNodeConnectionColor(new RGB(0, 0, 0));
      VisualizationPreferences.setDefaultExecutionTreeNodeLinkColor(new RGB(0, 0, 250));
   }
}