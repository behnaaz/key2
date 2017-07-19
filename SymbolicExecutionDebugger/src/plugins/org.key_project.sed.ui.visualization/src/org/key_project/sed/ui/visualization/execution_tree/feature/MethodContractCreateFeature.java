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

package org.key_project.sed.ui.visualization.execution_tree.feature;

import org.eclipse.debug.core.DebugException;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.key_project.sed.core.model.ISENode;
import org.key_project.sed.core.model.ISEDebugTarget;
import org.key_project.sed.core.model.ISEMethodContract;
import org.key_project.sed.core.model.ISEThread;
import org.key_project.sed.core.model.memory.SEMemoryMethodContract;
import org.key_project.sed.ui.visualization.execution_tree.provider.IExecutionTreeImageConstants;

/**
 * Implementation of {@link ICreateFeature} for {@link ISEMethodContract}s.
 * @author Martin Hentschel
 */
public class MethodContractCreateFeature extends AbstractDebugNodeCreateFeature {
   /**
    * Constructor.
    * @param fp The {@link IFeatureProvider} which provides this {@link IAddFeature}.
    */
   public MethodContractCreateFeature(IFeatureProvider fp) {
       super(fp, "Method Contract", "Create a new Method Contract");
   }
   
   /**
    * {@inheritDoc}
    */
   @Override
   public String getCreateImageId() {
      return IExecutionTreeImageConstants.IMG_METHOD_CONTRACT;
   }

   /**
    * {@inheritDoc}
    */   
   @Override
   public String getNodeType() {
      return "Method Contract";
   }

   /**
    * {@inheritDoc}
    */
   @Override
   protected ISENode createNewDebugNode(ISEDebugTarget target,
                                              ISENode parent,
                                              ISEThread thread,
                                              String name) throws DebugException {
      SEMemoryMethodContract result = new SEMemoryMethodContract(target, parent, thread);
      result.setName(name);
      return result;
   }
}