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

package org.key_project.util.thread;

import org.eclipse.jface.operation.IRunnableWithProgress;

/**
 * Extended functionality of an {@link IRunnableWithProgress} that 
 * returns also one single result available via {@link #getResult()}.
 * @author Martin Hentschel
 */
public interface IRunnableWithProgressAndResult<T> extends IRunnableWithProgress {
    /**
     * Returns the result.
     * @return The single result.
     */
    public T getResult();
}