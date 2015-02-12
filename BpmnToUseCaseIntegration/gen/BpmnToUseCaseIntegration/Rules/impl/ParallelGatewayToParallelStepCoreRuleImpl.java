/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration;
import BpmnToUseCaseIntegration.DocumentRootToUseCasesModel;
import BpmnToUseCaseIntegration.EndEventToFlow;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow;
import BpmnToUseCaseIntegration.LaneToActor;
import BpmnToUseCaseIntegration.ProcessToActor;
import BpmnToUseCaseIntegration.ProcessToUseCase;

import BpmnToUseCaseIntegration.Rules.ParallelGatewayToParallelStepCoreRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative;
import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;
import BpmnToUseCaseIntegration.StartEventToBasicFlow;

import TGGLanguage.modelgenerator.RuleEntryContainer;
import TGGLanguage.modelgenerator.RuleEntryList;

import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.ModelgeneratorRuleResult;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.RuleResult;
import TGGRuntime.TGGRuntimeFactory;
import TGGRuntime.TripleMatch;

import TGGRuntime.impl.AbstractRuleImpl;

import UseCaseDSL.Actor;
import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.BasicFlow;
import UseCaseDSL.Flow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.Step;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;
import UseCaseDSL.UseCasesModel;

import bpmn2.Bpmn2Factory;
import bpmn2.Definitions;
import bpmn2.DocumentRoot;
import bpmn2.EndEvent;
import bpmn2.EventBasedGateway;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElementsContainer;
import bpmn2.IntermediateCatchEvent;
import bpmn2.IntermediateThrowEvent;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.ParallelGateway;
import bpmn2.SequenceFlow;
import bpmn2.ServiceTask;
import bpmn2.StartEvent;
import bpmn2.UserTask;
import bpmn2.Process;

import de.upb.tools.sdm.*;

import java.lang.reflect.InvocationTargetException;

import java.util.*;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.csp.CSPFactoryHelper;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Gateway To Parallel Step Core Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelGatewayToParallelStepCoreRuleImpl extends AbstractRuleImpl
		implements ParallelGatewayToParallelStepCoreRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelGatewayToParallelStepCoreRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE
				.getParallelGatewayToParallelStepCoreRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelGateway) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __parallelGateway_incoming_inFlow = null;
		EMoflonEdge __inFlow_targetRef_parallelGateway = null;
		EMoflonEdge __process_flowElements_parallelGateway = null;
		EMoflonEdge __process_flowElements_inFlow = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_FWD(match, process,
					inFlow, parallelGateway));

			// ensure correct type and really bound of object csp
			JavaSDM.ensure(_TmpObject instanceof CSP);
			csp = (CSP) _TmpObject;
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'Check CSP'
		fujaba__Success = this.isAppropriate_checkCsp_FWD(csp);
		if (fujaba__Success) {
			// story node 'collect elements to be translated'
			try {
				fujaba__Success = false;

				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object parallelGateway is really bound
				JavaSDM.ensure(parallelGateway != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __parallelGateway_incoming_inFlow
				__parallelGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __inFlow_targetRef_parallelGateway
				__inFlow_targetRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// create object __process_flowElements_parallelGateway
				__process_flowElements_parallelGateway = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_parallelGateway
				__process_flowElements_parallelGateway.setName("flowElements");
				// assign attribute __inFlow_targetRef_parallelGateway
				__inFlow_targetRef_parallelGateway.setName("targetRef");
				// assign attribute __parallelGateway_incoming_inFlow
				__parallelGateway_incoming_inFlow.setName("incoming");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__parallelGateway_incoming_inFlow,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						parallelGateway, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__inFlow_targetRef_parallelGateway,
						"toBeTranslatedEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_parallelGateway,
						"toBeTranslatedEdges");

				// create link
				__process_flowElements_parallelGateway.setSrc(process);

				// create link
				__inFlow_targetRef_parallelGateway.setSrc(inFlow);

				// create link
				__parallelGateway_incoming_inFlow.setTrg(inFlow);

				// create link
				__parallelGateway_incoming_inFlow.setSrc(parallelGateway);

				// create link
				__inFlow_targetRef_parallelGateway.setTrg(parallelGateway);

				// create link
				__process_flowElements_parallelGateway.setTrg(parallelGateway);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object parallelGateway is really bound
				JavaSDM.ensure(parallelGateway != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// create object __process_flowElements_inFlow
				__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __process_flowElements_inFlow
				__process_flowElements_inFlow.setName("flowElements");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						process, "contextNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__process_flowElements_inFlow, "contextEdges");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						inFlow, "contextNodes");

				// create link
				__process_flowElements_inFlow.setSrc(process);

				// create link
				__process_flowElements_inFlow.setTrg(inFlow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_FWD(match, process, inFlow,
					parallelGateway);
			return true;

		} else {
			return false;

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		ParallelGateway parallelGateway = null;
		Process process = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		FlowNodeToStep parallelGatewayToParallelStep = null;
		ParallelStep parallelStep = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge flow__steps__parallelStep = null;
		EMoflonEdge parallelGatewayToParallelStep__target__parallelStep = null;
		EMoflonEdge __inFlow_targetRef_parallelGateway = null;
		EMoflonEdge parallelGatewayToParallelStep__source__parallelGateway = null;
		EMoflonEdge __process_flowElements_parallelGateway = null;
		EMoflonEdge __parallelGateway_incoming_inFlow = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToFlow"));

			// ensure correct type and really bound of object inFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("parallelGateway"));

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// iterate to-many link attributeInfo from isApplicableMatch to csp
			fujaba__Success = false;

			fujaba__IterIsApplicableMatchToCsp = isApplicableMatch
					.getAttributeInfo().iterator();

			while (!(fujaba__Success)
					&& fujaba__IterIsApplicableMatchToCsp.hasNext()) {
				try {
					_TmpObject = fujaba__IterIsApplicableMatchToCsp.next();

					// ensure correct type and really bound of object csp
					JavaSDM.ensure(_TmpObject instanceof CSP);
					csp = (CSP) _TmpObject;

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			if (!fujaba__Success) {
				fujaba__Success = true;
				csp = null;
			}
			// create object parallelGatewayToParallelStep
			parallelGatewayToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// create object parallelStep
			parallelStep = UseCaseDSLFactory.eINSTANCE.createParallelStep();

			// assign attribute parallelStep
			parallelStep.setName((java.lang.String) csp.getAttributeVariable(
					"parallelStep", "name").getValue());
			// assign attribute parallelStep
			parallelStep.setLabel((java.lang.String) csp.getAttributeVariable(
					"parallelStep", "label").getValue());

			// create link
			parallelGatewayToParallelStep.setSource(parallelGateway);

			// create link
			flow.getSteps().add(parallelStep);

			// create link
			parallelGatewayToParallelStep.setTarget(parallelStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
			// check object parallelGatewayToParallelStep is really bound
			JavaSDM.ensure(parallelGatewayToParallelStep != null);
			// check object parallelStep is really bound
			JavaSDM.ensure(parallelStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGatewayToParallelStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelStep, "createdElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGateway, "translatedElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
			// check object parallelGatewayToParallelStep is really bound
			JavaSDM.ensure(parallelGatewayToParallelStep != null);
			// check object parallelStep is really bound
			JavaSDM.ensure(parallelStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects parallelGateway and flow 
			JavaSDM.ensure(!parallelGateway.equals(flow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and flow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(flow));

			// check isomorphic binding between objects parallelStep and flow 
			JavaSDM.ensure(!parallelStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects parallelGateway and inFlow 
			JavaSDM.ensure(!parallelGateway.equals(inFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and inFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(inFlow));

			// check isomorphic binding between objects parallelStep and inFlow 
			JavaSDM.ensure(!parallelStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects parallelGateway and inFlowToFlow 
			JavaSDM.ensure(!parallelGateway.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and inFlowToFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelStep and inFlowToFlow 
			JavaSDM.ensure(!parallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and parallelGateway 
			JavaSDM.ensure(!parallelGatewayToParallelStep
					.equals(parallelGateway));

			// check isomorphic binding between objects parallelStep and parallelGateway 
			JavaSDM.ensure(!parallelStep.equals(parallelGateway));

			// check isomorphic binding between objects process and parallelGateway 
			JavaSDM.ensure(!process.equals(parallelGateway));

			// check isomorphic binding between objects parallelStep and parallelGatewayToParallelStep 
			JavaSDM.ensure(!parallelStep.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects process and parallelGatewayToParallelStep 
			JavaSDM.ensure(!process.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects process and parallelStep 
			JavaSDM.ensure(!process.equals(parallelStep));

			// create object flow__steps__parallelStep
			flow__steps__parallelStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parallelGatewayToParallelStep__target__parallelStep
			parallelGatewayToParallelStep__target__parallelStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __inFlow_targetRef_parallelGateway
			__inFlow_targetRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parallelGatewayToParallelStep__source__parallelGateway
			parallelGatewayToParallelStep__source__parallelGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __process_flowElements_parallelGateway
			__process_flowElements_parallelGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __parallelGateway_incoming_inFlow
			__parallelGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ParallelGatewayToParallelStepCoreRule");
			// assign attribute __process_flowElements_parallelGateway
			__process_flowElements_parallelGateway.setName("flowElements");
			// assign attribute __inFlow_targetRef_parallelGateway
			__inFlow_targetRef_parallelGateway.setName("targetRef");
			// assign attribute __parallelGateway_incoming_inFlow
			__parallelGateway_incoming_inFlow.setName("incoming");
			// assign attribute flow__steps__parallelStep
			flow__steps__parallelStep.setName("steps");
			// assign attribute parallelGatewayToParallelStep__source__parallelGateway
			parallelGatewayToParallelStep__source__parallelGateway
					.setName("source");
			// assign attribute parallelGatewayToParallelStep__target__parallelStep
			parallelGatewayToParallelStep__target__parallelStep
					.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					flow__steps__parallelStep, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGatewayToParallelStep__target__parallelStep,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__inFlow_targetRef_parallelGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGatewayToParallelStep__source__parallelGateway,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__process_flowElements_parallelGateway, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__parallelGateway_incoming_inFlow, "translatedEdges");

			// create link
			__process_flowElements_parallelGateway.setSrc(process);

			// create link
			__parallelGateway_incoming_inFlow.setTrg(inFlow);

			// create link
			__inFlow_targetRef_parallelGateway.setSrc(inFlow);

			// create link
			parallelGatewayToParallelStep__source__parallelGateway
					.setTrg(parallelGateway);

			// create link
			__process_flowElements_parallelGateway.setTrg(parallelGateway);

			// create link
			__parallelGateway_incoming_inFlow.setSrc(parallelGateway);

			// create link
			__inFlow_targetRef_parallelGateway.setTrg(parallelGateway);

			// create link
			flow__steps__parallelStep.setTrg(parallelStep);

			// create link
			parallelGatewayToParallelStep__target__parallelStep
					.setTrg(parallelStep);

			// create link
			flow__steps__parallelStep.setSrc(flow);

			// create link
			parallelGatewayToParallelStep__source__parallelGateway
					.setSrc(parallelGatewayToParallelStep);

			// create link
			parallelGatewayToParallelStep__target__parallelStep
					.setSrc(parallelGatewayToParallelStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_FWD(ruleresult, process, inFlow, parallelGateway,
				parallelStep, flow, parallelGatewayToParallelStep, inFlowToFlow);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass eClass = null;
		Iterator fujaba__IterEClassToPerformOperation = null;
		EOperation performOperation = null;
		IsApplicableRuleResult ruleresult = null;
		SequenceFlow inFlow = null;
		ParallelGateway parallelGateway = null;
		Process process = null;
		EMoflonEdge __process_flowElements_parallelGateway = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __parallelGateway_incoming_inFlow = null;
		EMoflonEdge __inFlow_targetRef_parallelGateway = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		CSP csp = null;
		Flow flow = null;
		Iterator fujaba__IterInFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from eClass to performOperation
			fujaba__Success = false;

			fujaba__IterEClassToPerformOperation = eClass.getEOperations()
					.iterator();

			while (!(fujaba__Success)
					&& fujaba__IterEClassToPerformOperation.hasNext()) {
				try {
					performOperation = (EOperation) fujaba__IterEClassToPerformOperation
							.next();

					// check object performOperation is really bound
					JavaSDM.ensure(performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							performOperation.getName(), "perform_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE
					.createIsApplicableRuleResult();

			// assign attribute ruleresult
			ruleresult.setSuccess(false);
			// assign attribute ruleresult
			ruleresult.setRule("ParallelGatewayToParallelStepCoreRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (match.getObject("parallelGateway"));

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;
			_TmpObject = (match.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link source from inFlow to inFlowToFlow
			fujaba__Success = false;

			fujaba__IterInFlowToInFlowToFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(inFlow,
							SequenceFlowToUCFlow.class, "source")).iterator();

			while (fujaba__IterInFlowToInFlowToFlow.hasNext()) {
				try {
					inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterInFlowToInFlowToFlow
							.next();

					// check object inFlowToFlow is really bound
					JavaSDM.ensure(inFlowToFlow != null);
					// bind object
					flow = inFlowToFlow.getTarget();

					// check object flow is really bound
					JavaSDM.ensure(flow != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object inFlowToFlow is really bound
						JavaSDM.ensure(inFlowToFlow != null);
						// check object parallelGateway is really bound
						JavaSDM.ensure(parallelGateway != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from parallelGateway to process
						JavaSDM.ensure(process.equals(parallelGateway
								.eContainer()));

						// check link incoming from inFlow to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(inFlow
								.getTargetRef()));

						// check link source from inFlowToFlow to inFlow
						JavaSDM.ensure(inFlow.equals(inFlowToFlow.getSource()));

						// check link target from inFlowToFlow to flow
						JavaSDM.ensure(flow.equals(inFlowToFlow.getTarget()));

						// create object __process_flowElements_parallelGateway
						__process_flowElements_parallelGateway = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __process_flowElements_inFlow
						__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __parallelGateway_incoming_inFlow
						__parallelGateway_incoming_inFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __inFlow_targetRef_parallelGateway
						__inFlow_targetRef_parallelGateway = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __inFlowToFlow_source_inFlow
						__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __inFlowToFlow_target_flow
						__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __process_flowElements_inFlow
						__process_flowElements_inFlow.setName("flowElements");
						// assign attribute __process_flowElements_parallelGateway
						__process_flowElements_parallelGateway
								.setName("flowElements");
						// assign attribute __inFlow_targetRef_parallelGateway
						__inFlow_targetRef_parallelGateway.setName("targetRef");
						// assign attribute __parallelGateway_incoming_inFlow
						__parallelGateway_incoming_inFlow.setName("incoming");
						// assign attribute __inFlowToFlow_source_inFlow
						__inFlowToFlow_source_inFlow.setName("source");
						// assign attribute __inFlowToFlow_target_flow
						__inFlowToFlow_target_flow.setName("target");

						// create link
						__process_flowElements_parallelGateway.setSrc(process);

						// create link
						__process_flowElements_inFlow.setSrc(process);

						// create link
						isApplicableMatch.getAllContextElements().add(process);

						// create link
						__parallelGateway_incoming_inFlow.setTrg(inFlow);

						// create link
						__inFlow_targetRef_parallelGateway.setSrc(inFlow);

						// create link
						__inFlowToFlow_source_inFlow.setTrg(inFlow);

						// create link
						isApplicableMatch.getAllContextElements().add(inFlow);

						// create link
						__process_flowElements_inFlow.setTrg(inFlow);

						// create link
						isApplicableMatch.getAllContextElements().add(
								parallelGateway);

						// create link
						__inFlow_targetRef_parallelGateway
								.setTrg(parallelGateway);

						// create link
						__process_flowElements_parallelGateway
								.setTrg(parallelGateway);

						// create link
						__parallelGateway_incoming_inFlow
								.setSrc(parallelGateway);

						// create link
						isApplicableMatch.getAllContextElements().add(flow);

						// create link
						__inFlowToFlow_target_flow.setTrg(flow);

						// create link
						isApplicableMatch.getAllContextElements().add(
								inFlowToFlow);

						// create link
						__inFlowToFlow_source_inFlow.setSrc(inFlowToFlow);

						// create link
						__inFlowToFlow_target_flow.setSrc(inFlowToFlow);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__process_flowElements_inFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__parallelGateway_incoming_inFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__process_flowElements_parallelGateway,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__inFlowToFlow_source_inFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __inFlowToFlow_target_flow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__inFlow_targetRef_parallelGateway,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_FWD(
									isApplicableMatch, process, inFlow,
									parallelGateway, flow, inFlowToFlow));

							// ensure correct type and really bound of object csp
							JavaSDM.ensure(_TmpObject instanceof CSP);
							csp = (CSP) _TmpObject;
							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						// statement node 'check CSP'
						fujaba__Success = this.isApplicable_checkCsp_FWD(csp);
						if (fujaba__Success) {
							// story node 'add match to rule result'
							try {
								fujaba__Success = false;

								// check object isApplicableMatch is really bound
								JavaSDM.ensure(isApplicableMatch != null);
								// check object ruleresult is really bound
								JavaSDM.ensure(ruleresult != null);
								// assign attribute ruleresult
								ruleresult.setSuccess(true);
								// assign attribute isApplicableMatch
								isApplicableMatch
										.setRuleName("ParallelGatewayToParallelStepCoreRule");

								// create link
								isApplicableMatch
										.setIsApplicableRuleResult(ruleresult);

								fujaba__Success = true;
							} catch (JavaSDMException fujaba__InternalException) {
								fujaba__Success = false;
							}

						} else {

						}
						fujaba__Success = true;
					} catch (JavaSDMException fujaba__InternalException) {
						fujaba__Success = false;
					}

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelGateway) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("parallelGateway", parallelGateway);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, bpmn2.Process process,
			SequenceFlow inFlow, ParallelGateway parallelGateway) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", true, csp);
		var_parallelGateway_gatewayDirection.setValue(parallelGateway
				.getGatewayDirection());

		// Create explicit parameters

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelGateway, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_parallelGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.id", true, csp);
		var_parallelGateway_id.setValue(parallelGateway.getId());
		Variable var_parallelGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.name", true, csp);
		var_parallelGateway_name.setValue(parallelGateway.getName());

		// Create explicit parameters

		// Create unbound variables
		Variable var_parallelStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.name", csp);
		Variable var_parallelStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.label", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_parallelGateway_id, var_parallelStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_parallelGateway_name, var_parallelStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("parallelGateway", parallelGateway);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject parallelGateway,
			EObject parallelStep, EObject flow,
			EObject parallelGatewayToParallelStep, EObject inFlowToFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("parallelGateway").eClass()
				.equals(bpmn2.Bpmn2Package.eINSTANCE.getParallelGateway());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, ParallelStep parallelStep,
			Flow flow) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		CSP csp = null;
		EMoflonEdge __flow_steps_parallelStep = null;

		// story node 'initial bindings'
		try {
			fujaba__Success = false;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// check object parallelStep is really bound
			JavaSDM.ensure(parallelStep != null);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'Solve CSP'
		try {
			fujaba__Success = false;

			_TmpObject = (this.isAppropriate_solveCsp_BWD(match, parallelStep,
					flow));

			// ensure correct type and really bound of object csp
			JavaSDM.ensure(_TmpObject instanceof CSP);
			csp = (CSP) _TmpObject;
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'Check CSP'
		fujaba__Success = this.isAppropriate_checkCsp_BWD(csp);
		if (fujaba__Success) {
			// story node 'collect elements to be translated'
			try {
				fujaba__Success = false;

				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object parallelStep is really bound
				JavaSDM.ensure(parallelStep != null);
				// create object __flow_steps_parallelStep
				__flow_steps_parallelStep = TGGRuntimeFactory.eINSTANCE
						.createEMoflonEdge();

				// assign attribute __flow_steps_parallelStep
				__flow_steps_parallelStep.setName("steps");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						parallelStep, "toBeTranslatedNodes");

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						__flow_steps_parallelStep, "toBeTranslatedEdges");

				// create link
				__flow_steps_parallelStep.setTrg(parallelStep);

				// create link
				__flow_steps_parallelStep.setSrc(flow);

				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// story node 'collect context elements'
			try {
				fujaba__Success = false;

				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object match is really bound
				JavaSDM.ensure(match != null);
				// check object parallelStep is really bound
				JavaSDM.ensure(parallelStep != null);

				// create link
				org.moflon.util.eMoflonEMFUtil.addOppositeReference(match,
						flow, "contextNodes");
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			// statement node 'register objects to match'
			this.registerObjectsToMatch_BWD(match, parallelStep, flow);
			return true;

		} else {
			return false;

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		Flow flow = null;
		SequenceFlow inFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		ParallelStep parallelStep = null;
		Process process = null;
		Iterator fujaba__IterIsApplicableMatchToCsp = null;
		CSP csp = null;
		ParallelGateway parallelGateway = null;
		FlowNodeToStep parallelGatewayToParallelStep = null;
		PerformRuleResult ruleresult = null;
		EMoflonEdge inFlow__targetRef__parallelGateway = null;
		EMoflonEdge __flow_steps_parallelStep = null;
		EMoflonEdge process__flowElements__parallelGateway = null;
		EMoflonEdge parallelGateway__incoming__inFlow = null;
		EMoflonEdge parallelGatewayToParallelStep__target__parallelStep = null;
		EMoflonEdge parallelGatewayToParallelStep__source__parallelGateway = null;

		// story node 'perform transformation'
		try {
			fujaba__Success = false;

			_TmpObject = (isApplicableMatch.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlow"));

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("inFlowToFlow"));

			// ensure correct type and really bound of object inFlowToFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
			inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("parallelStep"));

			// ensure correct type and really bound of object parallelStep
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			parallelStep = (ParallelStep) _TmpObject;
			_TmpObject = (isApplicableMatch.getObject("process"));

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;
			// check object isApplicableMatch is really bound
			JavaSDM.ensure(isApplicableMatch != null);
			// iterate to-many link attributeInfo from isApplicableMatch to csp
			fujaba__Success = false;

			fujaba__IterIsApplicableMatchToCsp = isApplicableMatch
					.getAttributeInfo().iterator();

			while (!(fujaba__Success)
					&& fujaba__IterIsApplicableMatchToCsp.hasNext()) {
				try {
					_TmpObject = fujaba__IterIsApplicableMatchToCsp.next();

					// ensure correct type and really bound of object csp
					JavaSDM.ensure(_TmpObject instanceof CSP);
					csp = (CSP) _TmpObject;

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			if (!fujaba__Success) {
				fujaba__Success = true;
				csp = null;
			}
			// create object parallelGateway
			parallelGateway = Bpmn2Factory.eINSTANCE.createParallelGateway();

			// create object parallelGatewayToParallelStep
			parallelGatewayToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
					.createFlowNodeToStep();

			// assign attribute parallelGateway
			parallelGateway.setId((java.lang.String) csp.getAttributeVariable(
					"parallelGateway", "id").getValue());
			// assign attribute parallelGateway
			parallelGateway
					.setName((java.lang.String) csp.getAttributeVariable(
							"parallelGateway", "name").getValue());
			// assign attribute parallelGateway
			parallelGateway
					.setGatewayDirection((bpmn2.GatewayDirection) csp
							.getAttributeVariable("parallelGateway",
									"gatewayDirection").getValue());

			// create link
			parallelGatewayToParallelStep.setTarget(parallelStep);

			// create link
			process.getFlowElements().add(parallelGateway); // add link

			// create link
			parallelGateway.getIncoming().add(inFlow);

			// create link
			parallelGatewayToParallelStep.setSource(parallelGateway);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'collect translated elements'
		try {
			fujaba__Success = false;

			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
			// check object parallelGatewayToParallelStep is really bound
			JavaSDM.ensure(parallelGatewayToParallelStep != null);
			// check object parallelStep is really bound
			JavaSDM.ensure(parallelStep != null);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelStep, "translatedElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGatewayToParallelStep, "createdLinkElements");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGateway, "createdElements");
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'bookkeeping for edges'
		try {
			fujaba__Success = false;

			// check object flow is really bound
			JavaSDM.ensure(flow != null);
			// check object inFlow is really bound
			JavaSDM.ensure(inFlow != null);
			// check object inFlowToFlow is really bound
			JavaSDM.ensure(inFlowToFlow != null);
			// check object parallelGateway is really bound
			JavaSDM.ensure(parallelGateway != null);
			// check object parallelGatewayToParallelStep is really bound
			JavaSDM.ensure(parallelGatewayToParallelStep != null);
			// check object parallelStep is really bound
			JavaSDM.ensure(parallelStep != null);
			// check object process is really bound
			JavaSDM.ensure(process != null);
			// check object ruleresult is really bound
			JavaSDM.ensure(ruleresult != null);
			// check isomorphic binding between objects inFlow and flow 
			JavaSDM.ensure(!inFlow.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and flow 
			JavaSDM.ensure(!inFlowToFlow.equals(flow));

			// check isomorphic binding between objects parallelGateway and flow 
			JavaSDM.ensure(!parallelGateway.equals(flow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and flow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(flow));

			// check isomorphic binding between objects parallelStep and flow 
			JavaSDM.ensure(!parallelStep.equals(flow));

			// check isomorphic binding between objects process and flow 
			JavaSDM.ensure(!process.equals(flow));

			// check isomorphic binding between objects inFlowToFlow and inFlow 
			JavaSDM.ensure(!inFlowToFlow.equals(inFlow));

			// check isomorphic binding between objects parallelGateway and inFlow 
			JavaSDM.ensure(!parallelGateway.equals(inFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and inFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(inFlow));

			// check isomorphic binding between objects parallelStep and inFlow 
			JavaSDM.ensure(!parallelStep.equals(inFlow));

			// check isomorphic binding between objects process and inFlow 
			JavaSDM.ensure(!process.equals(inFlow));

			// check isomorphic binding between objects parallelGateway and inFlowToFlow 
			JavaSDM.ensure(!parallelGateway.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and inFlowToFlow 
			JavaSDM.ensure(!parallelGatewayToParallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelStep and inFlowToFlow 
			JavaSDM.ensure(!parallelStep.equals(inFlowToFlow));

			// check isomorphic binding between objects process and inFlowToFlow 
			JavaSDM.ensure(!process.equals(inFlowToFlow));

			// check isomorphic binding between objects parallelGatewayToParallelStep and parallelGateway 
			JavaSDM.ensure(!parallelGatewayToParallelStep
					.equals(parallelGateway));

			// check isomorphic binding between objects parallelStep and parallelGateway 
			JavaSDM.ensure(!parallelStep.equals(parallelGateway));

			// check isomorphic binding between objects process and parallelGateway 
			JavaSDM.ensure(!process.equals(parallelGateway));

			// check isomorphic binding between objects parallelStep and parallelGatewayToParallelStep 
			JavaSDM.ensure(!parallelStep.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects process and parallelGatewayToParallelStep 
			JavaSDM.ensure(!process.equals(parallelGatewayToParallelStep));

			// check isomorphic binding between objects process and parallelStep 
			JavaSDM.ensure(!process.equals(parallelStep));

			// create object inFlow__targetRef__parallelGateway
			inFlow__targetRef__parallelGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object __flow_steps_parallelStep
			__flow_steps_parallelStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object process__flowElements__parallelGateway
			process__flowElements__parallelGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parallelGateway__incoming__inFlow
			parallelGateway__incoming__inFlow = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parallelGatewayToParallelStep__target__parallelStep
			parallelGatewayToParallelStep__target__parallelStep = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// create object parallelGatewayToParallelStep__source__parallelGateway
			parallelGatewayToParallelStep__source__parallelGateway = TGGRuntimeFactory.eINSTANCE
					.createEMoflonEdge();

			// assign attribute ruleresult
			ruleresult.setRuleName("ParallelGatewayToParallelStepCoreRule");
			// assign attribute process__flowElements__parallelGateway
			process__flowElements__parallelGateway.setName("flowElements");
			// assign attribute inFlow__targetRef__parallelGateway
			inFlow__targetRef__parallelGateway.setName("targetRef");
			// assign attribute parallelGateway__incoming__inFlow
			parallelGateway__incoming__inFlow.setName("incoming");
			// assign attribute __flow_steps_parallelStep
			__flow_steps_parallelStep.setName("steps");
			// assign attribute parallelGatewayToParallelStep__source__parallelGateway
			parallelGatewayToParallelStep__source__parallelGateway
					.setName("source");
			// assign attribute parallelGatewayToParallelStep__target__parallelStep
			parallelGatewayToParallelStep__target__parallelStep
					.setName("target");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					inFlow__targetRef__parallelGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					__flow_steps_parallelStep, "translatedEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					process__flowElements__parallelGateway, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGateway__incoming__inFlow, "createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGatewayToParallelStep__target__parallelStep,
					"createdEdges");

			// create link
			org.moflon.util.eMoflonEMFUtil.addOppositeReference(ruleresult,
					parallelGatewayToParallelStep__source__parallelGateway,
					"createdEdges");

			// create link
			process__flowElements__parallelGateway.setSrc(process);

			// create link
			parallelGateway__incoming__inFlow.setTrg(inFlow);

			// create link
			inFlow__targetRef__parallelGateway.setSrc(inFlow);

			// create link
			parallelGatewayToParallelStep__source__parallelGateway
					.setTrg(parallelGateway);

			// create link
			inFlow__targetRef__parallelGateway.setTrg(parallelGateway);

			// create link
			parallelGateway__incoming__inFlow.setSrc(parallelGateway);

			// create link
			process__flowElements__parallelGateway.setTrg(parallelGateway);

			// create link
			__flow_steps_parallelStep.setTrg(parallelStep);

			// create link
			parallelGatewayToParallelStep__target__parallelStep
					.setTrg(parallelStep);

			// create link
			__flow_steps_parallelStep.setSrc(flow);

			// create link
			parallelGatewayToParallelStep__target__parallelStep
					.setSrc(parallelGatewayToParallelStep);

			// create link
			parallelGatewayToParallelStep__source__parallelGateway
					.setSrc(parallelGatewayToParallelStep);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// statement node 'perform postprocessing'
		// No post processing method found
		// statement node 'register objects'
		this.registerObjects_BWD(ruleresult, process, inFlow, parallelGateway,
				parallelStep, flow, parallelGatewayToParallelStep, inFlowToFlow);
		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass eClass = null;
		Iterator fujaba__IterEClassToPerformOperation = null;
		EOperation performOperation = null;
		IsApplicableRuleResult ruleresult = null;
		Flow flow = null;
		ParallelStep parallelStep = null;
		EMoflonEdge __process_flowElements_inFlow = null;
		IsApplicableMatch isApplicableMatch = null;
		EMoflonEdge __inFlowToFlow_source_inFlow = null;
		EMoflonEdge __flow_steps_parallelStep = null;
		EMoflonEdge __inFlowToFlow_target_flow = null;
		CSP csp = null;
		Process process = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterFlowToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from eClass to performOperation
			fujaba__Success = false;

			fujaba__IterEClassToPerformOperation = eClass.getEOperations()
					.iterator();

			while (!(fujaba__Success)
					&& fujaba__IterEClassToPerformOperation.hasNext()) {
				try {
					performOperation = (EOperation) fujaba__IterEClassToPerformOperation
							.next();

					// check object performOperation is really bound
					JavaSDM.ensure(performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							performOperation.getName(), "perform_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object ruleresult
			ruleresult = TGGRuntimeFactory.eINSTANCE
					.createIsApplicableRuleResult();

			// assign attribute ruleresult
			ruleresult.setSuccess(false);
			// assign attribute ruleresult
			ruleresult.setRule("ParallelGatewayToParallelStepCoreRule");

			// create link
			ruleresult.setPerformOperation(performOperation);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'core match'
		try {
			fujaba__Success = false;

			_TmpObject = (match.getObject("flow"));

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;
			_TmpObject = (match.getObject("parallelStep"));

			// ensure correct type and really bound of object parallelStep
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			parallelStep = (ParallelStep) _TmpObject;
			// check object match is really bound
			JavaSDM.ensure(match != null);
			// iterate to-many link target from flow to inFlowToFlow
			fujaba__Success = false;

			fujaba__IterFlowToInFlowToFlow = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(flow,
							SequenceFlowToUCFlow.class, "target")).iterator();

			while (fujaba__IterFlowToInFlowToFlow.hasNext()) {
				try {
					inFlowToFlow = (SequenceFlowToUCFlow) fujaba__IterFlowToInFlowToFlow
							.next();

					// check object inFlowToFlow is really bound
					JavaSDM.ensure(inFlowToFlow != null);
					// bind object
					inFlow = inFlowToFlow.getSource();

					// check object inFlow is really bound
					JavaSDM.ensure(inFlow != null);

					// story node 'find context'
					try {
						fujaba__Success = false;

						// check object flow is really bound
						JavaSDM.ensure(flow != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object inFlowToFlow is really bound
						JavaSDM.ensure(inFlowToFlow != null);
						// check object parallelStep is really bound
						JavaSDM.ensure(parallelStep != null);
						// bind object
						_TmpObject = inFlow.eContainer() instanceof Process ? (Process) inFlow
								.eContainer() : null;

						// ensure correct type and really bound of object process
						JavaSDM.ensure(_TmpObject instanceof Process);
						process = (Process) _TmpObject;

						// check if contained via correct reference
						JavaSDM.ensure(process.getFlowElements().contains(
								inFlow));

						// check link source from inFlowToFlow to inFlow
						JavaSDM.ensure(inFlow.equals(inFlowToFlow.getSource()));

						// check link steps from parallelStep to flow
						JavaSDM.ensure(flow.equals(parallelStep.eContainer()));

						// check link target from inFlowToFlow to flow
						JavaSDM.ensure(flow.equals(inFlowToFlow.getTarget()));

						// create object __process_flowElements_inFlow
						__process_flowElements_inFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object isApplicableMatch
						isApplicableMatch = TGGRuntimeFactory.eINSTANCE
								.createIsApplicableMatch();

						// create object __inFlowToFlow_source_inFlow
						__inFlowToFlow_source_inFlow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __flow_steps_parallelStep
						__flow_steps_parallelStep = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// create object __inFlowToFlow_target_flow
						__inFlowToFlow_target_flow = TGGRuntimeFactory.eINSTANCE
								.createEMoflonEdge();

						// assign attribute __process_flowElements_inFlow
						__process_flowElements_inFlow.setName("flowElements");
						// assign attribute __flow_steps_parallelStep
						__flow_steps_parallelStep.setName("steps");
						// assign attribute __inFlowToFlow_source_inFlow
						__inFlowToFlow_source_inFlow.setName("source");
						// assign attribute __inFlowToFlow_target_flow
						__inFlowToFlow_target_flow.setName("target");

						// create link
						__process_flowElements_inFlow.setSrc(process);

						// create link
						isApplicableMatch.getAllContextElements().add(process);

						// create link
						isApplicableMatch.getAllContextElements().add(inFlow);

						// create link
						__inFlowToFlow_source_inFlow.setTrg(inFlow);

						// create link
						__process_flowElements_inFlow.setTrg(inFlow);

						// create link
						isApplicableMatch.getAllContextElements().add(
								parallelStep);

						// create link
						__flow_steps_parallelStep.setTrg(parallelStep);

						// create link
						__flow_steps_parallelStep.setSrc(flow);

						// create link
						isApplicableMatch.getAllContextElements().add(flow);

						// create link
						__inFlowToFlow_target_flow.setTrg(flow);

						// create link
						__inFlowToFlow_target_flow.setSrc(inFlowToFlow);

						// create link
						isApplicableMatch.getAllContextElements().add(
								inFlowToFlow);

						// create link
						__inFlowToFlow_source_inFlow.setSrc(inFlowToFlow);

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__process_flowElements_inFlow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __flow_steps_parallelStep,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch, __inFlowToFlow_target_flow,
								"allContextElements");

						// create link
						org.moflon.util.eMoflonEMFUtil.addOppositeReference(
								isApplicableMatch,
								__inFlowToFlow_source_inFlow,
								"allContextElements");
						// story node 'solve CSP'
						try {
							fujaba__Success = false;

							_TmpObject = (this.isApplicable_solveCsp_BWD(
									isApplicableMatch, process, inFlow,
									parallelStep, flow, inFlowToFlow));

							// ensure correct type and really bound of object csp
							JavaSDM.ensure(_TmpObject instanceof CSP);
							csp = (CSP) _TmpObject;
							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						// statement node 'check CSP'
						fujaba__Success = this.isApplicable_checkCsp_BWD(csp);
						if (fujaba__Success) {
							// story node 'add match to rule result'
							try {
								fujaba__Success = false;

								// check object isApplicableMatch is really bound
								JavaSDM.ensure(isApplicableMatch != null);
								// check object ruleresult is really bound
								JavaSDM.ensure(ruleresult != null);
								// assign attribute ruleresult
								ruleresult.setSuccess(true);
								// assign attribute isApplicableMatch
								isApplicableMatch
										.setRuleName("ParallelGatewayToParallelStepCoreRule");

								// create link
								isApplicableMatch
										.setIsApplicableRuleResult(ruleresult);

								fujaba__Success = true;
							} catch (JavaSDMException fujaba__InternalException) {
								fujaba__Success = false;
							}

						} else {

						}

						fujaba__Success = true;
					} catch (JavaSDMException fujaba__InternalException) {
						fujaba__Success = false;
					}

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return ruleresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match,
			ParallelStep parallelStep, Flow flow) {
		match.registerObject("parallelStep", parallelStep);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match,
			ParallelStep parallelStep, Flow flow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelStep parallelStep, Flow flow,
			SequenceFlowToUCFlow inFlowToFlow) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables
		Variable var_parallelStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.name", true, csp);
		var_parallelStep_name.setValue(parallelStep.getName());
		Variable var_parallelStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.label", true, csp);
		var_parallelStep_label.setValue(parallelStep.getLabel());

		// Create explicit parameters

		// Create unbound variables
		Variable var_parallelGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.id", csp);
		Variable var_parallelGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.name", csp);
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", csp);

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_parallelGateway_id, var_parallelStep_name);
		eq_0.setRuleName("");
		eq_0.solve(var_parallelGateway_name, var_parallelStep_label);
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection
				.solve(var_parallelGateway_gatewayDirection, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("parallelStep", parallelStep);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject parallelGateway,
			EObject parallelStep, EObject flow,
			EObject parallelGatewayToParallelStep, EObject inFlowToFlow) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("parallelGateway", parallelGateway);
		ruleresult.registerObject("parallelStep", parallelStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("parallelGatewayToParallelStep",
				parallelGatewayToParallelStep);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("parallelStep")
				.eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE
						.getParallelStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_175(
			EMoflonEdge _edge_flowElements) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_parallelGateway_flowElements_586377 = null;
		Iterator fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_112432 = null;
		SequenceFlow __DEC_parallelGateway_targetRef_112432 = null;
		Match match = null;
		Iterator fujaba__IterProcessToInFlow = null;
		SequenceFlow inFlow = null;
		ParallelGateway parallelGateway = null;
		Process process = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_flowElements is really bound
			JavaSDM.ensure(_edge_flowElements != null);
			// bind object
			_TmpObject = _edge_flowElements.getSrc();

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// bind object
			_TmpObject = _edge_flowElements.getTrg();

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;

			// check link flowElements from parallelGateway to process
			JavaSDM.ensure(process.equals(parallelGateway.eContainer()));

			// iterate to-many link flowElements from process to inFlow
			fujaba__Success = false;

			fujaba__IterProcessToInFlow = new ArrayList(
					process.getFlowElements()).iterator();

			while (fujaba__IterProcessToInFlow.hasNext()) {
				try {
					_TmpObject = fujaba__IterProcessToInFlow.next();

					// ensure correct type and really bound of object inFlow
					JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
					inFlow = (SequenceFlow) _TmpObject;
					// check link incoming from inFlow to parallelGateway
					JavaSDM.ensure(parallelGateway.equals(inFlow.getTargetRef()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_parallelGateway_flowElements_586377 = parallelGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelGateway
									.eContainer() : null;

							// check object __DEC_parallelGateway_flowElements_586377 is really bound
							JavaSDM.ensure(__DEC_parallelGateway_flowElements_586377 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_parallelGateway_flowElements_586377
									.getFlowElements()
									.contains(parallelGateway));

							// check isomorphic binding between objects __DEC_parallelGateway_flowElements_586377 and process 
							JavaSDM.ensure(!__DEC_parallelGateway_flowElements_586377
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from parallelGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(parallelGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link incoming from parallelGateway to __DEC_parallelGateway_targetRef_112432
							fujaba__Success = false;

							fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_112432 = new ArrayList(
									parallelGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_112432
											.hasNext()) {
								try {
									__DEC_parallelGateway_targetRef_112432 = (SequenceFlow) fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_112432
											.next();

									// check object __DEC_parallelGateway_targetRef_112432 is really bound
									JavaSDM.ensure(__DEC_parallelGateway_targetRef_112432 != null);
									// check isomorphic binding between objects __DEC_parallelGateway_targetRef_112432 and inFlow 
									JavaSDM.ensure(!__DEC_parallelGateway_targetRef_112432
											.equals(inFlow));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_flowElements is really bound
						JavaSDM.ensure(_edge_flowElements != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object parallelGateway is really bound
						JavaSDM.ensure(parallelGateway != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from parallelGateway to process
						JavaSDM.ensure(process.equals(parallelGateway
								.eContainer()));

						// check link incoming from inFlow to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(inFlow
								.getTargetRef()));

						// check link src from _edge_flowElements to process
						JavaSDM.ensure(process.equals(_edge_flowElements
								.getSrc()));

						// check link trg from _edge_flowElements to parallelGateway
						JavaSDM.ensure(parallelGateway
								.equals(_edge_flowElements.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, parallelGateway);
						if (fujaba__Success) {
							// statement node ''
							fujaba__Success = this.checkTypes_FWD(match);
							if (fujaba__Success) {
								// story node 'Add match to rule result'
								try {
									fujaba__Success = false;

									// check object __performOperation is really bound
									JavaSDM.ensure(__performOperation != null);
									// check object __result is really bound
									JavaSDM.ensure(__result != null);
									// check object match is really bound
									JavaSDM.ensure(match != null);

									// create link
									org.moflon.util.eMoflonEMFUtil
											.addOppositeReference(match,
													__performOperation,
													"isApplicableOperation");

									// create link
									__result.getContents().add(match);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

							} else {

							}

						} else {

						}
						fujaba__Success = true;
					} catch (JavaSDMException fujaba__InternalException) {
						fujaba__Success = false;
					}

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_176(
			EMoflonEdge _edge_targetRef) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_parallelGateway_flowElements_79946 = null;
		Iterator fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_799052 = null;
		SequenceFlow __DEC_parallelGateway_targetRef_799052 = null;
		Match match = null;
		Process process = null;
		SequenceFlow inFlow = null;
		ParallelGateway parallelGateway = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_targetRef is really bound
			JavaSDM.ensure(_edge_targetRef != null);
			// bind object
			_TmpObject = _edge_targetRef.getTrg();

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_targetRef.getSrc();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = inFlow.eContainer() instanceof Process ? (Process) inFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(inFlow));

			// check link flowElements from parallelGateway to process
			JavaSDM.ensure(process.equals(parallelGateway.eContainer()));

			// check link incoming from inFlow to parallelGateway
			JavaSDM.ensure(parallelGateway.equals(inFlow.getTargetRef()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_parallelGateway_flowElements_79946 = parallelGateway
							.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelGateway
							.eContainer() : null;

					// check object __DEC_parallelGateway_flowElements_79946 is really bound
					JavaSDM.ensure(__DEC_parallelGateway_flowElements_79946 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_parallelGateway_flowElements_79946
							.getFlowElements().contains(parallelGateway));

					// check isomorphic binding between objects __DEC_parallelGateway_flowElements_79946 and process 
					JavaSDM.ensure(!__DEC_parallelGateway_flowElements_79946
							.equals(process));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// negative check for link flowNodeRefs from parallelGateway
				JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(parallelGateway, Lane.class,
								"flowNodeRefs").size() == 0);
				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link incoming from parallelGateway to __DEC_parallelGateway_targetRef_799052
					fujaba__Success = false;

					fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_799052 = new ArrayList(
							parallelGateway.getIncoming()).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_799052
									.hasNext()) {
						try {
							__DEC_parallelGateway_targetRef_799052 = (SequenceFlow) fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_799052
									.next();

							// check object __DEC_parallelGateway_targetRef_799052 is really bound
							JavaSDM.ensure(__DEC_parallelGateway_targetRef_799052 != null);
							// check isomorphic binding between objects __DEC_parallelGateway_targetRef_799052 and inFlow 
							JavaSDM.ensure(!__DEC_parallelGateway_targetRef_799052
									.equals(inFlow));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check object _edge_targetRef is really bound
				JavaSDM.ensure(_edge_targetRef != null);
				// check object inFlow is really bound
				JavaSDM.ensure(inFlow != null);
				// check object parallelGateway is really bound
				JavaSDM.ensure(parallelGateway != null);
				// check object process is really bound
				JavaSDM.ensure(process != null);
				// check link flowElements from inFlow to process
				JavaSDM.ensure(process.equals(inFlow.eContainer()));

				// check link flowElements from parallelGateway to process
				JavaSDM.ensure(process.equals(parallelGateway.eContainer()));

				// check link incoming from inFlow to parallelGateway
				JavaSDM.ensure(parallelGateway.equals(inFlow.getTargetRef()));

				// check link src from _edge_targetRef to inFlow
				JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

				// check link trg from _edge_targetRef to parallelGateway
				JavaSDM.ensure(parallelGateway.equals(_edge_targetRef.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_FWD(match, process,
						inFlow, parallelGateway);
				if (fujaba__Success) {
					// statement node ''
					fujaba__Success = this.checkTypes_FWD(match);
					if (fujaba__Success) {
						// story node 'Add match to rule result'
						try {
							fujaba__Success = false;

							// check object __performOperation is really bound
							JavaSDM.ensure(__performOperation != null);
							// check object __result is really bound
							JavaSDM.ensure(__result != null);
							// check object match is really bound
							JavaSDM.ensure(match != null);

							// create link
							org.moflon.util.eMoflonEMFUtil
									.addOppositeReference(match,
											__performOperation,
											"isApplicableOperation");

							// create link
							__result.getContents().add(match);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

					} else {

					}

				} else {

				}
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_177(
			EMoflonEdge _edge_incoming) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		FlowElementsContainer __DEC_parallelGateway_flowElements_421405 = null;
		Iterator fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_235914 = null;
		SequenceFlow __DEC_parallelGateway_targetRef_235914 = null;
		Match match = null;
		Iterator fujaba__IterInFlowTo_edge_targetRef = null;
		EMoflonEdge _edge_targetRef = null;
		Process process = null;
		SequenceFlow inFlow = null;
		ParallelGateway parallelGateway = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_FWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_incoming is really bound
			JavaSDM.ensure(_edge_incoming != null);
			// bind object
			_TmpObject = _edge_incoming.getSrc();

			// ensure correct type and really bound of object parallelGateway
			JavaSDM.ensure(_TmpObject instanceof ParallelGateway);
			parallelGateway = (ParallelGateway) _TmpObject;

			// bind object
			_TmpObject = _edge_incoming.getTrg();

			// ensure correct type and really bound of object inFlow
			JavaSDM.ensure(_TmpObject instanceof SequenceFlow);
			inFlow = (SequenceFlow) _TmpObject;

			// bind object
			_TmpObject = inFlow.eContainer() instanceof Process ? (Process) inFlow
					.eContainer() : null;

			// ensure correct type and really bound of object process
			JavaSDM.ensure(_TmpObject instanceof Process);
			process = (Process) _TmpObject;

			// check if contained via correct reference
			JavaSDM.ensure(process.getFlowElements().contains(inFlow));

			// check link flowElements from parallelGateway to process
			JavaSDM.ensure(process.equals(parallelGateway.eContainer()));

			// check link incoming from inFlow to parallelGateway
			JavaSDM.ensure(parallelGateway.equals(inFlow.getTargetRef()));

			// iterate to-many link src from inFlow to _edge_targetRef
			fujaba__Success = false;

			fujaba__IterInFlowTo_edge_targetRef = new ArrayList(
					org.moflon.util.eMoflonEMFUtil.getOppositeReference(inFlow,
							EMoflonEdge.class, "src")).iterator();

			while (fujaba__IterInFlowTo_edge_targetRef.hasNext()) {
				try {
					_edge_targetRef = (EMoflonEdge) fujaba__IterInFlowTo_edge_targetRef
							.next();

					// check object _edge_targetRef is really bound
					JavaSDM.ensure(_edge_targetRef != null);
					// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
					JavaSDM.ensure(!_edge_targetRef.equals(_edge_incoming));

					// check link trg from _edge_targetRef to parallelGateway
					JavaSDM.ensure(parallelGateway.equals(_edge_targetRef
							.getTrg()));

					// story node 'test core match and DECs'
					try {
						fujaba__Success = false;

						// check negative bindings
						try {
							fujaba__Success = false;

							// bind object
							__DEC_parallelGateway_flowElements_421405 = parallelGateway
									.eContainer() instanceof FlowElementsContainer ? (FlowElementsContainer) parallelGateway
									.eContainer() : null;

							// check object __DEC_parallelGateway_flowElements_421405 is really bound
							JavaSDM.ensure(__DEC_parallelGateway_flowElements_421405 != null);

							// check if contained via correct reference
							JavaSDM.ensure(__DEC_parallelGateway_flowElements_421405
									.getFlowElements()
									.contains(parallelGateway));

							// check isomorphic binding between objects __DEC_parallelGateway_flowElements_421405 and process 
							JavaSDM.ensure(!__DEC_parallelGateway_flowElements_421405
									.equals(process));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// negative check for link flowNodeRefs from parallelGateway
						JavaSDM.ensure(org.moflon.util.eMoflonEMFUtil
								.getOppositeReference(parallelGateway,
										Lane.class, "flowNodeRefs").size() == 0);
						// check negative bindings
						try {
							fujaba__Success = false;

							// iterate to-many link incoming from parallelGateway to __DEC_parallelGateway_targetRef_235914
							fujaba__Success = false;

							fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_235914 = new ArrayList(
									parallelGateway.getIncoming()).iterator();

							while (!(fujaba__Success)
									&& fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_235914
											.hasNext()) {
								try {
									__DEC_parallelGateway_targetRef_235914 = (SequenceFlow) fujaba__IterParallelGatewayTo__DEC_parallelGateway_targetRef_235914
											.next();

									// check object __DEC_parallelGateway_targetRef_235914 is really bound
									JavaSDM.ensure(__DEC_parallelGateway_targetRef_235914 != null);
									// check isomorphic binding between objects __DEC_parallelGateway_targetRef_235914 and inFlow 
									JavaSDM.ensure(!__DEC_parallelGateway_targetRef_235914
											.equals(inFlow));

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}
							}
							JavaSDM.ensure(fujaba__Success);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

						fujaba__Success = !(fujaba__Success);

						JavaSDM.ensure(fujaba__Success);

						// check object _edge_incoming is really bound
						JavaSDM.ensure(_edge_incoming != null);
						// check object _edge_targetRef is really bound
						JavaSDM.ensure(_edge_targetRef != null);
						// check object inFlow is really bound
						JavaSDM.ensure(inFlow != null);
						// check object parallelGateway is really bound
						JavaSDM.ensure(parallelGateway != null);
						// check object process is really bound
						JavaSDM.ensure(process != null);
						// check isomorphic binding between objects _edge_targetRef and _edge_incoming 
						JavaSDM.ensure(!_edge_targetRef.equals(_edge_incoming));

						// check link flowElements from inFlow to process
						JavaSDM.ensure(process.equals(inFlow.eContainer()));

						// check link flowElements from parallelGateway to process
						JavaSDM.ensure(process.equals(parallelGateway
								.eContainer()));

						// check link incoming from inFlow to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(inFlow
								.getTargetRef()));

						// check link src from _edge_incoming to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(_edge_incoming
								.getSrc()));

						// check link src from _edge_targetRef to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_targetRef.getSrc()));

						// check link trg from _edge_incoming to inFlow
						JavaSDM.ensure(inFlow.equals(_edge_incoming.getTrg()));

						// check link trg from _edge_targetRef to parallelGateway
						JavaSDM.ensure(parallelGateway.equals(_edge_targetRef
								.getTrg()));

						// create object match
						match = TGGRuntimeFactory.eINSTANCE.createMatch();

						// assign attribute match
						match.setRuleName(__eClass.getName());
						// statement node 'bookkeeping with generic isAppropriate method'
						fujaba__Success = this.isAppropriate_FWD(match,
								process, inFlow, parallelGateway);
						if (fujaba__Success) {
							// statement node ''
							fujaba__Success = this.checkTypes_FWD(match);
							if (fujaba__Success) {
								// story node 'Add match to rule result'
								try {
									fujaba__Success = false;

									// check object __performOperation is really bound
									JavaSDM.ensure(__performOperation != null);
									// check object __result is really bound
									JavaSDM.ensure(__result != null);
									// check object match is really bound
									JavaSDM.ensure(match != null);

									// create link
									org.moflon.util.eMoflonEMFUtil
											.addOppositeReference(match,
													__performOperation,
													"isApplicableOperation");

									// create link
									__result.getContents().add(match);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

							} else {

							}

						} else {

						}
						fujaba__Success = true;
					} catch (JavaSDMException fujaba__InternalException) {
						fujaba__Success = false;
					}

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_73(
			EMoflonEdge _edge_steps) {
		boolean fujaba__Success = false;
		Object _TmpObject = null;
		EClass __eClass = null;
		Iterator fujaba__Iter__eClassTo__performOperation = null;
		EOperation __performOperation = null;
		EObjectContainer __result = null;
		Flow __DEC_parallelStep_steps_134954 = null;
		Iterator fujaba__IterParallelStepTo__DEC_parallelStep_next_9369 = null;
		Step __DEC_parallelStep_next_9369 = null;
		Match match = null;
		ParallelStep parallelStep = null;
		Flow flow = null;

		// story node 'prepare return value'
		try {
			fujaba__Success = false;

			_TmpObject = (this.eClass());

			// ensure correct type and really bound of object __eClass
			JavaSDM.ensure(_TmpObject instanceof EClass);
			__eClass = (EClass) _TmpObject;
			// iterate to-many link eOperations from __eClass to __performOperation
			fujaba__Success = false;

			fujaba__Iter__eClassTo__performOperation = __eClass
					.getEOperations().iterator();

			while (!(fujaba__Success)
					&& fujaba__Iter__eClassTo__performOperation.hasNext()) {
				try {
					__performOperation = (EOperation) fujaba__Iter__eClassTo__performOperation
							.next();

					// check object __performOperation is really bound
					JavaSDM.ensure(__performOperation != null);
					// attribute condition
					JavaSDM.ensure(JavaSDM.stringCompare(
							__performOperation.getName(), "isApplicable_BWD") == 0);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			// create object __result
			__result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'test core match kernel'
		try {
			fujaba__Success = false;

			// check object _edge_steps is really bound
			JavaSDM.ensure(_edge_steps != null);
			// bind object
			_TmpObject = _edge_steps.getSrc();

			// ensure correct type and really bound of object flow
			JavaSDM.ensure(_TmpObject instanceof Flow);
			flow = (Flow) _TmpObject;

			// bind object
			_TmpObject = _edge_steps.getTrg();

			// ensure correct type and really bound of object parallelStep
			JavaSDM.ensure(_TmpObject instanceof ParallelStep);
			parallelStep = (ParallelStep) _TmpObject;

			// check link steps from parallelStep to flow
			JavaSDM.ensure(flow.equals(parallelStep.eContainer()));

			// story node 'test core match and DECs'
			try {
				fujaba__Success = false;

				// check negative bindings
				try {
					fujaba__Success = false;

					// bind object
					__DEC_parallelStep_steps_134954 = parallelStep.eContainer() instanceof Flow ? (Flow) parallelStep
							.eContainer() : null;

					// check object __DEC_parallelStep_steps_134954 is really bound
					JavaSDM.ensure(__DEC_parallelStep_steps_134954 != null);

					// check if contained via correct reference
					JavaSDM.ensure(__DEC_parallelStep_steps_134954.getSteps()
							.contains(parallelStep));

					// check isomorphic binding between objects __DEC_parallelStep_steps_134954 and flow 
					JavaSDM.ensure(!__DEC_parallelStep_steps_134954
							.equals(flow));

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check negative bindings
				try {
					fujaba__Success = false;

					// iterate to-many link next from parallelStep to __DEC_parallelStep_next_9369
					fujaba__Success = false;

					fujaba__IterParallelStepTo__DEC_parallelStep_next_9369 = new ArrayList(
							org.moflon.util.eMoflonEMFUtil
									.getOppositeReference(parallelStep,
											Step.class, "next")).iterator();

					while (!(fujaba__Success)
							&& fujaba__IterParallelStepTo__DEC_parallelStep_next_9369
									.hasNext()) {
						try {
							__DEC_parallelStep_next_9369 = (Step) fujaba__IterParallelStepTo__DEC_parallelStep_next_9369
									.next();

							// check object __DEC_parallelStep_next_9369 is really bound
							JavaSDM.ensure(__DEC_parallelStep_next_9369 != null);
							// check isomorphic binding between objects __DEC_parallelStep_next_9369 and parallelStep 
							JavaSDM.ensure(!__DEC_parallelStep_next_9369
									.equals(parallelStep));

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}

				fujaba__Success = !(fujaba__Success);

				JavaSDM.ensure(fujaba__Success);

				// check link next from parallelStep to parallelStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(parallelStep, ParallelStep.class,
								"next").contains(parallelStep)));

				// check link next from parallelStep to parallelStep
				JavaSDM.ensure(!(org.moflon.util.eMoflonEMFUtil
						.getOppositeReference(parallelStep, ParallelStep.class,
								"next").contains(parallelStep)));

				// check object _edge_steps is really bound
				JavaSDM.ensure(_edge_steps != null);
				// check object flow is really bound
				JavaSDM.ensure(flow != null);
				// check object parallelStep is really bound
				JavaSDM.ensure(parallelStep != null);
				// check link src from _edge_steps to flow
				JavaSDM.ensure(flow.equals(_edge_steps.getSrc()));

				// check link steps from parallelStep to flow
				JavaSDM.ensure(flow.equals(parallelStep.eContainer()));

				// check link trg from _edge_steps to parallelStep
				JavaSDM.ensure(parallelStep.equals(_edge_steps.getTrg()));

				// create object match
				match = TGGRuntimeFactory.eINSTANCE.createMatch();

				// assign attribute match
				match.setRuleName(__eClass.getName());
				// statement node 'bookkeeping with generic isAppropriate method'
				fujaba__Success = this.isAppropriate_BWD(match, parallelStep,
						flow);
				if (fujaba__Success) {
					// statement node ''
					fujaba__Success = this.checkTypes_BWD(match);
					if (fujaba__Success) {
						// story node 'Add match to rule result'
						try {
							fujaba__Success = false;

							// check object __performOperation is really bound
							JavaSDM.ensure(__performOperation != null);
							// check object __result is really bound
							JavaSDM.ensure(__result != null);
							// check object match is really bound
							JavaSDM.ensure(match != null);

							// create link
							org.moflon.util.eMoflonEMFUtil
									.addOppositeReference(match,
											__performOperation,
											"isApplicableOperation");

							// create link
							__result.getContents().add(match);

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}

					} else {

					}

				} else {

				}
				fujaba__Success = true;
			} catch (JavaSDMException fujaba__InternalException) {
				fujaba__Success = false;
			}

			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return __result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_FWD(TripleMatch tripleMatch) {

		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_BWD(TripleMatch tripleMatch) {

		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			SequenceFlowToUCFlow inFlowToFlowDummyParameter) {
		boolean fujaba__Success = false;
		ModelgeneratorRuleResult ruleResult = null;
		IsApplicableMatch isApplicableMatch = null;
		Object _TmpObject = null;
		CSP csp = null;
		ParallelGateway parallelGateway = null;
		FlowNodeToStep parallelGatewayToParallelStep = null;
		ParallelStep parallelStep = null;
		Flow flow = null;
		Process process = null;
		SequenceFlow inFlow = null;
		Iterator fujaba__IterInFlowToFlowListToInFlowToFlow = null;
		SequenceFlowToUCFlow inFlowToFlow = null;
		Iterator fujaba__IterRuleEntryContainerToInFlowToFlowList = null;
		RuleEntryList inFlowToFlowList = null;

		// story node 'create result'
		try {
			fujaba__Success = false;

			// create object ruleResult
			ruleResult = TGGRuntimeFactory.eINSTANCE
					.createModelgeneratorRuleResult();

			// create object isApplicableMatch
			isApplicableMatch = TGGRuntimeFactory.eINSTANCE
					.createIsApplicableMatch();

			// assign attribute ruleResult
			ruleResult.setSuccess(false);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		// story node 'is applicable core'
		try {
			fujaba__Success = false;

			// check object ruleEntryContainer is really bound
			JavaSDM.ensure(ruleEntryContainer != null);
			// iterate to-many link ruleEntryList from ruleEntryContainer to inFlowToFlowList
			fujaba__Success = false;

			fujaba__IterRuleEntryContainerToInFlowToFlowList = new ArrayList(
					ruleEntryContainer.getRuleEntryList()).iterator();

			while (fujaba__IterRuleEntryContainerToInFlowToFlowList.hasNext()) {
				try {
					inFlowToFlowList = (RuleEntryList) fujaba__IterRuleEntryContainerToInFlowToFlowList
							.next();

					// check object inFlowToFlowList is really bound
					JavaSDM.ensure(inFlowToFlowList != null);
					// iterate to-many link entryObjects from inFlowToFlowList to inFlowToFlow
					fujaba__Success = false;

					fujaba__IterInFlowToFlowListToInFlowToFlow = new ArrayList(
							inFlowToFlowList.getEntryObjects()).iterator();

					while (fujaba__IterInFlowToFlowListToInFlowToFlow.hasNext()) {
						try {
							_TmpObject = fujaba__IterInFlowToFlowListToInFlowToFlow
									.next();

							// ensure correct type and really bound of object inFlowToFlow
							JavaSDM.ensure(_TmpObject instanceof SequenceFlowToUCFlow);
							inFlowToFlow = (SequenceFlowToUCFlow) _TmpObject;
							// bind object
							inFlow = inFlowToFlow.getSource();

							// check object inFlow is really bound
							JavaSDM.ensure(inFlow != null);

							// bind object
							_TmpObject = inFlow.eContainer() instanceof Process ? (Process) inFlow
									.eContainer() : null;

							// ensure correct type and really bound of object process
							JavaSDM.ensure(_TmpObject instanceof Process);
							process = (Process) _TmpObject;

							// check if contained via correct reference
							JavaSDM.ensure(process.getFlowElements().contains(
									inFlow));

							// bind object
							flow = inFlowToFlow.getTarget();

							// check object flow is really bound
							JavaSDM.ensure(flow != null);

							// story node 'solve CSP'
							try {
								fujaba__Success = false;

								_TmpObject = (this.generateModel_solveCsp_BWD(
										isApplicableMatch, process, inFlow,
										parallelGateway, parallelStep, flow,
										parallelGatewayToParallelStep,
										inFlowToFlow, ruleResult));

								// ensure correct type and really bound of object csp
								JavaSDM.ensure(_TmpObject instanceof CSP);
								csp = (CSP) _TmpObject;
								fujaba__Success = true;
							} catch (JavaSDMException fujaba__InternalException) {
								fujaba__Success = false;
							}

							// statement node 'check CSP'
							fujaba__Success = this
									.generateModel_checkCsp_BWD(csp);
							if (fujaba__Success) {
								// story node 'perform'
								try {
									fujaba__Success = false;

									// check object flow is really bound
									JavaSDM.ensure(flow != null);
									// check object inFlow is really bound
									JavaSDM.ensure(inFlow != null);
									// check object inFlowToFlow is really bound
									JavaSDM.ensure(inFlowToFlow != null);
									// check object process is really bound
									JavaSDM.ensure(process != null);
									// check object ruleResult is really bound
									JavaSDM.ensure(ruleResult != null);
									// create object parallelGateway
									parallelGateway = Bpmn2Factory.eINSTANCE
											.createParallelGateway();

									// create object parallelGatewayToParallelStep
									parallelGatewayToParallelStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
											.createFlowNodeToStep();

									// create object parallelStep
									parallelStep = UseCaseDSLFactory.eINSTANCE
											.createParallelStep();

									// assign attribute parallelGateway
									parallelGateway
											.setId((java.lang.String) csp
													.getAttributeVariable(
															"parallelGateway",
															"id").getValue());
									// assign attribute parallelGateway
									parallelGateway
											.setName((java.lang.String) csp
													.getAttributeVariable(
															"parallelGateway",
															"name").getValue());
									// assign attribute parallelGateway
									parallelGateway
											.setGatewayDirection((bpmn2.GatewayDirection) csp
													.getAttributeVariable(
															"parallelGateway",
															"gatewayDirection")
													.getValue());
									// assign attribute parallelStep
									parallelStep.setName((java.lang.String) csp
											.getAttributeVariable(
													"parallelStep", "name")
											.getValue());
									// assign attribute parallelStep
									parallelStep
											.setLabel((java.lang.String) csp
													.getAttributeVariable(
															"parallelStep",
															"label").getValue());
									// assign attribute ruleResult
									ruleResult.setSuccess(true);

									// create link
									process.getFlowElements().add(
											parallelGateway); // add link

									// create link
									parallelGateway.getIncoming().add(inFlow);

									// create link
									ruleResult.getSourceObjects().add(
											parallelGateway);

									// create link
									parallelGatewayToParallelStep
											.setSource(parallelGateway);

									// create link
									ruleResult.getTargetObjects().add(
											parallelStep);

									// create link
									flow.getSteps().add(parallelStep);

									// create link
									parallelGatewayToParallelStep
											.setTarget(parallelStep);

									// create link
									ruleResult.getCorrObjects().add(
											parallelGatewayToParallelStep);

									fujaba__Success = true;
								} catch (JavaSDMException fujaba__InternalException) {
									fujaba__Success = false;
								}

								return ruleResult;

							}

							fujaba__Success = true;
						} catch (JavaSDMException fujaba__InternalException) {
							fujaba__Success = false;
						}
					}
					JavaSDM.ensure(fujaba__Success);

					fujaba__Success = true;
				} catch (JavaSDMException fujaba__InternalException) {
					fujaba__Success = false;
				}
			}
			JavaSDM.ensure(fujaba__Success);
			fujaba__Success = true;
		} catch (JavaSDMException fujaba__InternalException) {
			fujaba__Success = false;
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			bpmn2.Process process, SequenceFlow inFlow,
			ParallelGateway parallelGateway, ParallelStep parallelStep,
			Flow flow, FlowNodeToStep parallelGatewayToParallelStep,
			SequenceFlowToUCFlow inFlowToFlow,
			ModelgeneratorRuleResult ruleResult) {
		// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Diverging");

		// Create attribute variables

		// Create explicit parameters

		// Create unbound variables
		Variable var_parallelGateway_id = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.id", csp);
		Variable var_parallelStep_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.name", csp);
		Variable var_parallelGateway_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.name", csp);
		Variable var_parallelStep_label = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelStep.label", csp);
		Variable var_parallelGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("parallelGateway.gatewayDirection", csp);

		// Create constraints
		Eq_modelgenGatewayDirection eq_modelgenGatewayDirection = new Eq_modelgenGatewayDirection();
		Eq_modelgen eq_modelgen = new Eq_modelgen();
		Eq_modelgen eq_modelgen_0 = new Eq_modelgen();

		csp.getConstraints().add(eq_modelgenGatewayDirection);
		csp.getConstraints().add(eq_modelgen);
		csp.getConstraints().add(eq_modelgen_0);

		// Solve CSP
		eq_modelgenGatewayDirection.setRuleName("");
		eq_modelgenGatewayDirection.solve(var_parallelGateway_gatewayDirection,
				literal0);
		eq_modelgen.setRuleName("");
		eq_modelgen.solve(var_parallelGateway_id, var_parallelStep_name);
		eq_modelgen_0.setRuleName("");
		eq_modelgen_0.solve(var_parallelGateway_name, var_parallelStep_label);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3));
			return null;
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_FLOW_SEQUENCEFLOWTOUCFLOW:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7));
			return null;
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(ParallelStep) arguments.get(1), (Flow) arguments.get(2));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(ParallelStep) arguments.get(1), (Flow) arguments.get(2));
			return null;
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(ParallelStep) arguments.get(1), (Flow) arguments.get(2));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELSTEP_FLOW_SEQUENCEFLOWTOUCFLOW:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelStep) arguments.get(3), (Flow) arguments.get(4),
					(SequenceFlowToUCFlow) arguments.get(5));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7));
			return null;
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_175__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_175((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_176__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_176((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_177__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_177((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_73__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_73((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SEQUENCEFLOWTOUCFLOW:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SequenceFlowToUCFlow) arguments.get(1));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELSTEP_FLOW_FLOWNODETOSTEP_SEQUENCEFLOWTOUCFLOW_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(bpmn2.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(ParallelGateway) arguments.get(3),
					(ParallelStep) arguments.get(4), (Flow) arguments.get(5),
					(FlowNodeToStep) arguments.get(6),
					(SequenceFlowToUCFlow) arguments.get(7),
					(ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.PARALLEL_GATEWAY_TO_PARALLEL_STEP_CORE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelGatewayToParallelStepCoreRuleImpl
