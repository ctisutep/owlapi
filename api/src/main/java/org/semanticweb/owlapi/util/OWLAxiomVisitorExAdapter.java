package org.semanticweb.owlapi.util;

import java.io.Serializable;

import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLAxiomVisitorEx;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.SWRLRule;

/** adapter for axiom visitors
 * 
 * @author ignazio
 * @param <O>
 *            return type */
public class OWLAxiomVisitorExAdapter<O> implements OWLAxiomVisitorEx<O>, Serializable {
    private static final long serialVersionUID = 40000L;
    private O object;

    /** adapter with null default */
    public OWLAxiomVisitorExAdapter() {
        this(null);
    }

    /** adapter with object as default value
     * 
     * @param object
     *            default return value */
    public OWLAxiomVisitorExAdapter(O object) {
        this.object = object;
    }

    /** override to change default behaviour
     * 
     * @param axiom
     *            visited axiom
     * @return default return value; */
    protected O doDefault(@SuppressWarnings("unused") OWLAxiom axiom) {
        return object;
    }

    @Override
    public O visit(OWLSubAnnotationPropertyOfAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLAnnotationPropertyDomainAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLAnnotationPropertyRangeAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLSubClassOfAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLAsymmetricObjectPropertyAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLReflexiveObjectPropertyAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLDisjointClassesAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLDataPropertyDomainAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLObjectPropertyDomainAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLEquivalentObjectPropertiesAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLNegativeDataPropertyAssertionAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLDifferentIndividualsAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLDisjointDataPropertiesAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLDisjointObjectPropertiesAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLObjectPropertyRangeAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLObjectPropertyAssertionAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLFunctionalObjectPropertyAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLSubObjectPropertyOfAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLDisjointUnionAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLDeclarationAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLAnnotationAssertionAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLSymmetricObjectPropertyAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLDataPropertyRangeAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLFunctionalDataPropertyAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLEquivalentDataPropertiesAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLClassAssertionAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLEquivalentClassesAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLDataPropertyAssertionAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLTransitiveObjectPropertyAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLIrreflexiveObjectPropertyAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLSubDataPropertyOfAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLSameIndividualAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLSubPropertyChainOfAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLInverseObjectPropertiesAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLHasKeyAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(OWLDatatypeDefinitionAxiom axiom) {
        return doDefault(axiom);
    }

    @Override
    public O visit(SWRLRule rule) {
        return doDefault(rule);
    }
}
