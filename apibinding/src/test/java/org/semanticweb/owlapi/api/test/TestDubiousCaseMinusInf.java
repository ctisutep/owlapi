/*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2011, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2011, University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.semanticweb.owlapi.api.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
@SuppressWarnings("javadoc")
public class TestDubiousCaseMinusInf extends TestCase{
@Test
    public void testMinusInf() throws Exception{
	String input="Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)\n"+
"Prefix(owl:=<http://www.w3.org/2002/07/owl#>)\n"+
"Prefix(:=<http://test.org/test#>)\n"+
"Ontology(\nDeclaration(NamedIndividual(:a))\n" +
"Declaration(DataProperty(:dp))\n"+
"Declaration(Class(:A))\n" +
"SubClassOf(:A DataAllValuesFrom(:dp owl:real))" +
"\nSubClassOf(:A \n" +
"DataSomeValuesFrom(:dp DataOneOf(\"-INF\"^^xsd:float \"-0\"^^xsd:integer))" +
"\n)" +
"\n" +
"ClassAssertion(:A :a)" +
"\n)";
	StringDocumentSource in=new StringDocumentSource(input);
	OWLOntologyManager m=Factory.getManager();
	OWLOntology o=m.loadOntologyFromOntologyDocument(in);
	StringDocumentTarget t=new StringDocumentTarget();
	m.saveOntology(o, t);
	assertTrue(t.toString()+" should contain -INF", t.toString().contains("-INF"));
	OWLOntology o1=m.loadOntologyFromOntologyDocument(new StringDocumentSource(t.toString()));
	assertEquals("Obtologies were supposed to be the same",o.getLogicalAxioms(), o1.getLogicalAxioms());
}
}