// This file is part of KeY - Integrated Deductive Software Design
//
// Copyright (C) 2001-2011 Universitaet Karlsruhe (TH), Germany
//                         Universitaet Koblenz-Landau, Germany
//                         Chalmers University of Technology, Sweden
// Copyright (C) 2011-2014 Karlsruhe Institute of Technology, Germany
//                         Technical University Darmstadt, Germany
//                         Chalmers University of Technology, Sweden
//
// The KeY system is protected by the GNU General
// Public License. See LICENSE.TXT for details.
//

package de.uka.ilkd.key.java.declaration.modifier;

import org.key_project.util.ExtList;

import de.uka.ilkd.key.java.declaration.Modifier;


/**
 *  The JML modifier "no_state".
 */
public class NoState extends Modifier {

    public NoState() {}


    public NoState(ExtList children) {
        super (children);
    }


    protected String getSymbol() {
        return "no_state";
    }
}