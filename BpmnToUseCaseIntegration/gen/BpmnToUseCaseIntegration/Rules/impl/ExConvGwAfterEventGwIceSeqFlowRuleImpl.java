/**
 */
package BpmnToUseCaseIntegration.Rules.impl;

import BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationFactory;
import BpmnToUseCaseIntegration.FlowNodeToStep;
import BpmnToUseCaseIntegration.ICEToAltFlow;

import BpmnToUseCaseIntegration.Rules.ExConvGwAfterEventGwIceSeqFlowRule;
import BpmnToUseCaseIntegration.Rules.RulesPackage;

import BpmnToUseCaseIntegration.SeqFlowToAltFlowAlt;
import BpmnToUseCaseIntegration.SequenceFlowToStep;
import BpmnToUseCaseIntegration.SequenceFlowToUCFlow;

import TGGLanguage.csp.CSP;

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

import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.Flow;
import UseCaseDSL.NamedFlow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.Step;
import UseCaseDSL.StepAlternative;

import bpmn2.Bpmn2Factory;
import bpmn2.EventBasedGateway;
import bpmn2.ExclusiveGateway;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
import bpmn2.GatewayDirection;
import bpmn2.IntermediateCatchEvent;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.SequenceFlow;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ex Conv Gw After Event Gw Ice Seq Flow Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExConvGwAfterEventGwIceSeqFlowRuleImpl extends AbstractRuleImpl
		implements ExConvGwAfterEventGwIceSeqFlowRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExConvGwAfterEventGwIceSeqFlowRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getExConvGwAfterEventGwIceSeqFlowRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, IntermediateCatchEvent ice,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventGw, SequenceFlow divergeFlow,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane,
			LaneSet laneSet) {
		// initial bindings
		Object[] result1_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_1_blackBBBBBBBBBBB(
						this, match, ice, inFlow, process, eventGw,
						divergeFlow, exConvGateway, outFlow, lane, laneSet);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_2_bindingAndBlackFBBBBBBBBBBB(
						this, match, ice, inFlow, process, eventGw,
						divergeFlow, exConvGateway, outFlow, lane, laneSet);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_3_expressionFBB(
						this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_4_blackBBBBBBBBBB(
							match, ice, inFlow, process, eventGw, divergeFlow,
							exConvGateway, outFlow, lane, laneSet);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed");
			}
			ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_4_greenBBBBBBFFFFFFF(
							match, inFlow, process, exConvGateway, outFlow,
							lane);
			// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge process__exConvGateway____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge inFlow__exConvGateway____targetRef = (EMoflonEdge) result4_green[8];
			// EMoflonEdge exConvGateway__inFlow____incoming = (EMoflonEdge) result4_green[9];
			// EMoflonEdge outFlow__exConvGateway____sourceRef = (EMoflonEdge) result4_green[10];
			// EMoflonEdge exConvGateway__outFlow____outgoing = (EMoflonEdge) result4_green[11];
			// EMoflonEdge lane__exConvGateway____flowNodeRefs = (EMoflonEdge) result4_green[12];

			// collect context elements
			Object[] result5_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_5_blackBBBBBBBBBB(
							match, ice, inFlow, process, eventGw, divergeFlow,
							exConvGateway, outFlow, lane, laneSet);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed");
			}
			ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_5_greenBBBBBBBBFFFFFFFFFFFF(
							match, ice, inFlow, process, eventGw, divergeFlow,
							lane, laneSet);
			// EMoflonEdge inFlow__ice____sourceRef = (EMoflonEdge) result5_green[8];
			// EMoflonEdge ice__inFlow____outgoing = (EMoflonEdge) result5_green[9];
			// EMoflonEdge process__eventGw____flowElements = (EMoflonEdge) result5_green[10];
			// EMoflonEdge process__divergeFlow____flowElements = (EMoflonEdge) result5_green[11];
			// EMoflonEdge process__ice____flowElements = (EMoflonEdge) result5_green[12];
			// EMoflonEdge divergeFlow__eventGw____sourceRef = (EMoflonEdge) result5_green[13];
			// EMoflonEdge eventGw__divergeFlow____outgoing = (EMoflonEdge) result5_green[14];
			// EMoflonEdge divergeFlow__ice____targetRef = (EMoflonEdge) result5_green[15];
			// EMoflonEdge ice__divergeFlow____incoming = (EMoflonEdge) result5_green[16];
			// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result5_green[17];
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[18];
			// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result5_green[19];

			// register objects to match
			ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_6_expressionBBBBBBBBBBB(
							this, match, ice, inFlow, process, eventGw,
							divergeFlow, exConvGateway, outFlow, lane, laneSet);
			return ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_7_expressionF();
		} else {
			return ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed");
		}
		IntermediateCatchEvent ice = (IntermediateCatchEvent) result1_bindingAndBlack[0];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[1];
		bpmn2.Process process = (bpmn2.Process) result1_bindingAndBlack[2];
		EventBasedGateway eventGw = (EventBasedGateway) result1_bindingAndBlack[3];
		SequenceFlow divergeFlow = (SequenceFlow) result1_bindingAndBlack[4];
		NormalStep normalStep = (NormalStep) result1_bindingAndBlack[5];
		FlowNodeToStep eventGwToNormalStep = (FlowNodeToStep) result1_bindingAndBlack[6];
		AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result1_bindingAndBlack[7];
		SeqFlowToAltFlowAlt divergeFlowToAlt = (SeqFlowToAltFlowAlt) result1_bindingAndBlack[8];
		AlternativeFlow flow = (AlternativeFlow) result1_bindingAndBlack[9];
		ICEToAltFlow iceToFlow = (ICEToAltFlow) result1_bindingAndBlack[10];
		ExclusiveGateway exConvGateway = (ExclusiveGateway) result1_bindingAndBlack[11];
		SequenceFlow outFlow = (SequenceFlow) result1_bindingAndBlack[12];
		SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result1_bindingAndBlack[13];
		Flow initFlow = (Flow) result1_bindingAndBlack[14];
		Lane lane = (Lane) result1_bindingAndBlack[15];
		LaneSet laneSet = (LaneSet) result1_bindingAndBlack[16];
		// CSP csp = (CSP) result1_bindingAndBlack[17];
		Object[] result1_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_greenBBBFBFF(
						normalStep, exConvGateway, outFlow, initFlow);
		FlowNodeToStep ecgwToStep = (FlowNodeToStep) result1_green[3];
		SequenceFlowToUCFlow outFlowToInitFlow = (SequenceFlowToUCFlow) result1_green[5];
		SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result1_green[6];

		// collect translated elements
		Object[] result2_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_2_blackBBBBB(
						exConvGateway, outFlow, ecgwToStep, outFlowToInitFlow,
						outFlowToNormalStep);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed");
		}
		Object[] result2_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_2_greenFBBBBB(
						exConvGateway, outFlow, ecgwToStep, outFlowToInitFlow,
						outFlowToNormalStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_3_blackBBBBBBBBBBBBBBBBBBBBB(
						ruleresult, ice, inFlow, process, eventGw, divergeFlow,
						normalStep, eventGwToNormalStep, alt, divergeFlowToAlt,
						flow, iceToFlow, exConvGateway, outFlow, inFlowToFlow,
						ecgwToStep, initFlow, outFlowToInitFlow,
						outFlowToNormalStep, lane, laneSet);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed");
		}
		ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
						ruleresult, inFlow, process, normalStep, exConvGateway,
						outFlow, ecgwToStep, initFlow, outFlowToInitFlow,
						outFlowToNormalStep, lane);
		// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[11];
		// EMoflonEdge process__exConvGateway____flowElements = (EMoflonEdge) result3_green[12];
		// EMoflonEdge inFlow__exConvGateway____targetRef = (EMoflonEdge) result3_green[13];
		// EMoflonEdge exConvGateway__inFlow____incoming = (EMoflonEdge) result3_green[14];
		// EMoflonEdge outFlow__exConvGateway____sourceRef = (EMoflonEdge) result3_green[15];
		// EMoflonEdge exConvGateway__outFlow____outgoing = (EMoflonEdge) result3_green[16];
		// EMoflonEdge ecgwToStep__exConvGateway____source = (EMoflonEdge) result3_green[17];
		// EMoflonEdge ecgwToStep__normalStep____target = (EMoflonEdge) result3_green[18];
		// EMoflonEdge outFlowToInitFlow__outFlow____source = (EMoflonEdge) result3_green[19];
		// EMoflonEdge outFlowToInitFlow__initFlow____target = (EMoflonEdge) result3_green[20];
		// EMoflonEdge outFlowToNormalStep__outFlow____source = (EMoflonEdge) result3_green[21];
		// EMoflonEdge outFlowToNormalStep__normalStep____target = (EMoflonEdge) result3_green[22];
		// EMoflonEdge lane__exConvGateway____flowNodeRefs = (EMoflonEdge) result3_green[23];

		// perform postprocessing story node is empty
		// register objects
		ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBBB(
						this, ruleresult, ice, inFlow, process, eventGw,
						divergeFlow, normalStep, eventGwToNormalStep, alt,
						divergeFlowToAlt, flow, iceToFlow, exConvGateway,
						outFlow, inFlowToFlow, ecgwToStep, initFlow,
						outFlowToInitFlow, outFlowToNormalStep, lane, laneSet);
		return ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_2_bindingFFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed");
		}
		IntermediateCatchEvent ice = (IntermediateCatchEvent) result2_binding[0];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[1];
		bpmn2.Process process = (bpmn2.Process) result2_binding[2];
		EventBasedGateway eventGw = (EventBasedGateway) result2_binding[3];
		SequenceFlow divergeFlow = (SequenceFlow) result2_binding[4];
		ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_binding[5];
		SequenceFlow outFlow = (SequenceFlow) result2_binding[6];
		Lane lane = (Lane) result2_binding[7];
		LaneSet laneSet = (LaneSet) result2_binding[8];
		for (Object[] result2_black : ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_2_blackBBBBBFFFFFFBBFBBB(
						ice, inFlow, process, eventGw, divergeFlow,
						exConvGateway, outFlow, lane, laneSet, match)) {
			NormalStep normalStep = (NormalStep) result2_black[5];
			FlowNodeToStep eventGwToNormalStep = (FlowNodeToStep) result2_black[6];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[7];
			SeqFlowToAltFlowAlt divergeFlowToAlt = (SeqFlowToAltFlowAlt) result2_black[8];
			AlternativeFlow flow = (AlternativeFlow) result2_black[9];
			ICEToAltFlow iceToFlow = (ICEToAltFlow) result2_black[10];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[13];
			// ForEach find context
			for (Object[] result3_black : ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_3_blackBBBBBBBBBBBBBBFBB(
							ice, inFlow, process, eventGw, divergeFlow,
							normalStep, eventGwToNormalStep, alt,
							divergeFlowToAlt, flow, iceToFlow, exConvGateway,
							outFlow, inFlowToFlow, lane, laneSet)) {
				Flow initFlow = (Flow) result3_black[14];
				Object[] result3_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
						.pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_3_greenBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
								ice, inFlow, process, eventGw, divergeFlow,
								normalStep, eventGwToNormalStep, alt,
								divergeFlowToAlt, flow, iceToFlow,
								exConvGateway, outFlow, inFlowToFlow, initFlow,
								lane, laneSet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[17];
				// EMoflonEdge inFlow__ice____sourceRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge ice__inFlow____outgoing = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__eventGw____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge process__divergeFlow____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge process__ice____flowElements = (EMoflonEdge) result3_green[22];
				// EMoflonEdge divergeFlow__eventGw____sourceRef = (EMoflonEdge) result3_green[23];
				// EMoflonEdge eventGw__divergeFlow____outgoing = (EMoflonEdge) result3_green[24];
				// EMoflonEdge divergeFlow__ice____targetRef = (EMoflonEdge) result3_green[25];
				// EMoflonEdge ice__divergeFlow____incoming = (EMoflonEdge) result3_green[26];
				// EMoflonEdge normalStep__alt____stepAlternative = (EMoflonEdge) result3_green[27];
				// EMoflonEdge eventGwToNormalStep__eventGw____source = (EMoflonEdge) result3_green[28];
				// EMoflonEdge eventGwToNormalStep__normalStep____target = (EMoflonEdge) result3_green[29];
				// EMoflonEdge alt__flow____ref = (EMoflonEdge) result3_green[30];
				// EMoflonEdge divergeFlowToAlt__divergeFlow____source = (EMoflonEdge) result3_green[31];
				// EMoflonEdge divergeFlowToAlt__alt____target = (EMoflonEdge) result3_green[32];
				// EMoflonEdge iceToFlow__ice____source = (EMoflonEdge) result3_green[33];
				// EMoflonEdge iceToFlow__flow____target = (EMoflonEdge) result3_green[34];
				// EMoflonEdge process__outFlow____flowElements = (EMoflonEdge) result3_green[35];
				// EMoflonEdge process__laneSet____laneSets = (EMoflonEdge) result3_green[36];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[37];
				// EMoflonEdge process__exConvGateway____flowElements = (EMoflonEdge) result3_green[38];
				// EMoflonEdge inFlow__exConvGateway____targetRef = (EMoflonEdge) result3_green[39];
				// EMoflonEdge exConvGateway__inFlow____incoming = (EMoflonEdge) result3_green[40];
				// EMoflonEdge outFlow__exConvGateway____sourceRef = (EMoflonEdge) result3_green[41];
				// EMoflonEdge exConvGateway__outFlow____outgoing = (EMoflonEdge) result3_green[42];
				// EMoflonEdge inFlowToFlow__inFlow____source = (EMoflonEdge) result3_green[43];
				// EMoflonEdge inFlowToFlow__flow____target = (EMoflonEdge) result3_green[44];
				// EMoflonEdge initFlow__normalStep____steps = (EMoflonEdge) result3_green[45];
				// EMoflonEdge lane__exConvGateway____flowNodeRefs = (EMoflonEdge) result3_green[46];
				// EMoflonEdge laneSet__lane____lanes = (EMoflonEdge) result3_green[47];

				// solve CSP
				Object[] result4_bindingAndBlack = ExConvGwAfterEventGwIceSeqFlowRuleImpl
						.pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, ice, inFlow, process,
								eventGw, divergeFlow, normalStep,
								eventGwToNormalStep, alt, divergeFlowToAlt,
								flow, iceToFlow, exConvGateway, outFlow,
								inFlowToFlow, initFlow, lane, laneSet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
						.pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_5_expressionFBB(
								this, csp)) {

					// add match to rule result
					Object[] result6_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed");
					}
					ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		match.registerObject("ice", ice);
		match.registerObject("inFlow", inFlow);
		match.registerObject("process", process);
		match.registerObject("eventGw", eventGw);
		match.registerObject("divergeFlow", divergeFlow);
		match.registerObject("exConvGateway", exConvGateway);
		match.registerObject("outFlow", outFlow);
		match.registerObject("lane", lane);
		match.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("");

		// Create attribute variables
		Variable var_exConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exConvGateway.gatewayDirection", true, csp);
		var_exConvGateway_gatewayDirection.setValue(exConvGateway
				.getGatewayDirection());
		var_exConvGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create unbound variables

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exConvGateway_gatewayDirection, literal0);
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
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, NormalStep normalStep,
			FlowNodeToStep eventGwToNormalStep, AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, SequenceFlowToUCFlow inFlowToFlow,
			Flow initFlow, Lane lane, LaneSet laneSet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("ice", ice);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("eventGw", eventGw);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("eventGwToNormalStep",
				eventGwToNormalStep);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("divergeFlowToAlt", divergeFlowToAlt);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("iceToFlow", iceToFlow);
		isApplicableMatch.registerObject("exConvGateway", exConvGateway);
		isApplicableMatch.registerObject("outFlow", outFlow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject ice,
			EObject inFlow, EObject process, EObject eventGw,
			EObject divergeFlow, EObject normalStep,
			EObject eventGwToNormalStep, EObject alt, EObject divergeFlowToAlt,
			EObject flow, EObject iceToFlow, EObject exConvGateway,
			EObject outFlow, EObject inFlowToFlow, EObject ecgwToStep,
			EObject initFlow, EObject outFlowToInitFlow,
			EObject outFlowToNormalStep, EObject lane, EObject laneSet) {
		ruleresult.registerObject("ice", ice);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("eventGw", eventGw);
		ruleresult.registerObject("divergeFlow", divergeFlow);
		ruleresult.registerObject("normalStep", normalStep);
		ruleresult.registerObject("eventGwToNormalStep", eventGwToNormalStep);
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("divergeFlowToAlt", divergeFlowToAlt);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("iceToFlow", iceToFlow);
		ruleresult.registerObject("exConvGateway", exConvGateway);
		ruleresult.registerObject("outFlow", outFlow);
		ruleresult.registerObject("inFlowToFlow", inFlowToFlow);
		ruleresult.registerObject("ecgwToStep", ecgwToStep);
		ruleresult.registerObject("initFlow", initFlow);
		ruleresult.registerObject("outFlowToInitFlow", outFlowToInitFlow);
		ruleresult.registerObject("outFlowToNormalStep", outFlowToNormalStep);
		ruleresult.registerObject("lane", lane);
		ruleresult.registerObject("laneSet", laneSet);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("exConvGateway")
						.eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE
								.getExclusiveGateway())
				&& match.getObject("outFlow").eClass()
						.equals(bpmn2.Bpmn2Package.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_116(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_blackFFFFFFFFFB(_edge_flowElements)) {
			IntermediateCatchEvent ice = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			EventBasedGateway eventGw = (EventBasedGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_3_expressionFBBBBBBBBBBB(
							this, match, ice, inFlow, process, eventGw,
							divergeFlow, exConvGateway, outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
						.pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_117(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_blackFFFFFFFFFB(_edge_flowElements)) {
			IntermediateCatchEvent ice = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			EventBasedGateway eventGw = (EventBasedGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_3_expressionFBBBBBBBBBBB(
							this, match, ice, inFlow, process, eventGw,
							divergeFlow, exConvGateway, outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
						.pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_118(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_blackFFFFFFFFFB(_edge_targetRef)) {
			IntermediateCatchEvent ice = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			EventBasedGateway eventGw = (EventBasedGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_3_expressionFBBBBBBBBBBB(
							this, match, ice, inFlow, process, eventGw,
							divergeFlow, exConvGateway, outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
						.pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_119(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_blackFFFFFFFFFB(_edge_incoming)) {
			IntermediateCatchEvent ice = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			EventBasedGateway eventGw = (EventBasedGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_3_expressionFBBBBBBBBBBB(
							this, match, ice, inFlow, process, eventGw,
							divergeFlow, exConvGateway, outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
						.pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_120(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_blackFFFFFFFFFB(_edge_sourceRef)) {
			IntermediateCatchEvent ice = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			EventBasedGateway eventGw = (EventBasedGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_3_expressionFBBBBBBBBBBB(
							this, match, ice, inFlow, process, eventGw,
							divergeFlow, exConvGateway, outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
						.pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_121(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_blackFFFFFFFFFB(_edge_outgoing)) {
			IntermediateCatchEvent ice = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			EventBasedGateway eventGw = (EventBasedGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_3_expressionFBBBBBBBBBBB(
							this, match, ice, inFlow, process, eventGw,
							divergeFlow, exConvGateway, outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
						.pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_122(
			EMoflonEdge _edge_flowNodeRefs) {
		// prepare return value
		Object[] result1_bindingAndBlack = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_blackFFFFFFFFFB(_edge_flowNodeRefs)) {
			IntermediateCatchEvent ice = (IntermediateCatchEvent) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			bpmn2.Process process = (bpmn2.Process) result2_black[2];
			EventBasedGateway eventGw = (EventBasedGateway) result2_black[3];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[4];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result2_black[5];
			SequenceFlow outFlow = (SequenceFlow) result2_black[6];
			Lane lane = (Lane) result2_black[7];
			LaneSet laneSet = (LaneSet) result2_black[8];
			Object[] result2_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_3_expressionFBBBBBBBBBBB(
							this, match, ice, inFlow, process, eventGw,
							divergeFlow, exConvGateway, outFlow, lane, laneSet)) {
				// Ensure that the correct types of elements are matched
				if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
						.pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_4_expressionFBB(
								this, match)) {

					// Add match to rule result
					Object[] result5_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_5_blackBBB(
									match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed");
					}
					ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_5_greenBBB(
									match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_FWD(TripleMatch tripleMatch) {// TODO: NICO!!!
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			FlowNodeToStep eventGwToNormalStepParameter) {
		// create result
		Object[] result1_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed");
		}
		Object[] result1_green = ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_blackFFFFFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList eventGwToNormalStepList = (RuleEntryList) result2_black[0];
			IntermediateCatchEvent ice = (IntermediateCatchEvent) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			bpmn2.Process process = (bpmn2.Process) result2_black[3];
			EventBasedGateway eventGw = (EventBasedGateway) result2_black[4];
			FlowNodeToStep eventGwToNormalStep = (FlowNodeToStep) result2_black[5];
			NormalStep normalStep = (NormalStep) result2_black[6];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result2_black[7];
			AlternativeFlow flow = (AlternativeFlow) result2_black[8];
			ICEToAltFlow iceToFlow = (ICEToAltFlow) result2_black[9];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result2_black[10];
			SeqFlowToAltFlowAlt divergeFlowToAlt = (SeqFlowToAltFlowAlt) result2_black[11];
			SequenceFlow divergeFlow = (SequenceFlow) result2_black[12];
			Flow initFlow = (Flow) result2_black[13];
			LaneSet laneSet = (LaneSet) result2_black[14];
			Lane lane = (Lane) result2_black[15];

			// solve CSP
			Object[] result3_bindingAndBlack = ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_3_bindingAndBlackFBBBBBBBBBBBBBBBBBB(
							this, isApplicableMatch, ice, inFlow, process,
							eventGw, divergeFlow, normalStep,
							eventGwToNormalStep, alt, divergeFlowToAlt, flow,
							iceToFlow, inFlowToFlow, initFlow, lane, laneSet,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ExConvGwAfterEventGwIceSeqFlowRuleImpl
					.pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_4_expressionFBB(
							this, csp)) {
				// check nacs
				Object[] result5_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
						.pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_5_blackBBBBBBBBBBBBBBB(
								ice, inFlow, process, eventGw, divergeFlow,
								normalStep, eventGwToNormalStep, alt,
								divergeFlowToAlt, flow, iceToFlow,
								inFlowToFlow, initFlow, lane, laneSet);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_6_blackBBBBBBBBBBBBBBBB(
									ice, inFlow, process, eventGw, divergeFlow,
									normalStep, eventGwToNormalStep, alt,
									divergeFlowToAlt, flow, iceToFlow,
									inFlowToFlow, initFlow, lane, laneSet,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed");
					}
					ExConvGwAfterEventGwIceSeqFlowRuleImpl
							.pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_6_greenBBBFFFBFFBBB(
									inFlow, process, normalStep, initFlow,
									lane, ruleResult, csp);
					// ExclusiveGateway exConvGateway = (ExclusiveGateway) result6_green[3];
					// SequenceFlow outFlow = (SequenceFlow) result6_green[4];
					// FlowNodeToStep ecgwToStep = (FlowNodeToStep) result6_green[5];
					// SequenceFlowToUCFlow outFlowToInitFlow = (SequenceFlowToUCFlow) result6_green[7];
					// SequenceFlowToStep outFlowToNormalStep = (SequenceFlowToStep) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return ExConvGwAfterEventGwIceSeqFlowRuleImpl
				.pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, NormalStep normalStep,
			FlowNodeToStep eventGwToNormalStep, AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, SequenceFlowToUCFlow inFlowToFlow,
			Flow initFlow, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("Converging");
		literal0.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_exConvGateway_gatewayDirection = CSPFactoryHelper.eINSTANCE
				.createVariable("exConvGateway.gatewayDirection", csp);
		var_exConvGateway_gatewayDirection.setType("bpmn2.GatewayDirection");

		// Create constraints
		EqGatewayDirection eqGatewayDirection = new EqGatewayDirection();

		csp.getConstraints().add(eqGatewayDirection);

		// Solve CSP
		eqGatewayDirection.setRuleName("");
		eqGatewayDirection.solve(var_exConvGateway_gatewayDirection, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("ice", ice);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("eventGw", eventGw);
		isApplicableMatch.registerObject("divergeFlow", divergeFlow);
		isApplicableMatch.registerObject("normalStep", normalStep);
		isApplicableMatch.registerObject("eventGwToNormalStep",
				eventGwToNormalStep);
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("divergeFlowToAlt", divergeFlowToAlt);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("iceToFlow", iceToFlow);
		isApplicableMatch.registerObject("inFlowToFlow", inFlowToFlow);
		isApplicableMatch.registerObject("initFlow", initFlow);
		isApplicableMatch.registerObject("lane", lane);
		isApplicableMatch.registerObject("laneSet", laneSet);
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
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPROPRIATE_FWD__MATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_FWD((Match) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(EventBasedGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(EventBasedGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
			return null;
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_LANE_LANESET:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(EventBasedGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Lane) arguments.get(8),
					(LaneSet) arguments.get(9));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY_SEQUENCEFLOW_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOWALTERNATIVE_SEQFLOWTOALTFLOWALT_ALTERNATIVEFLOW_ICETOALTFLOW_EXCLUSIVEGATEWAY_SEQUENCEFLOW_SEQUENCEFLOWTOUCFLOW_FLOW_LANE_LANESET:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(EventBasedGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(NormalStep) arguments.get(6),
					(FlowNodeToStep) arguments.get(7),
					(AlternativeFlowAlternative) arguments.get(8),
					(SeqFlowToAltFlowAlt) arguments.get(9),
					(AlternativeFlow) arguments.get(10),
					(ICEToAltFlow) arguments.get(11),
					(ExclusiveGateway) arguments.get(12),
					(SequenceFlow) arguments.get(13),
					(SequenceFlowToUCFlow) arguments.get(14),
					(Flow) arguments.get(15), (Lane) arguments.get(16),
					(LaneSet) arguments.get(17));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18),
					(EObject) arguments.get(19), (EObject) arguments.get(20));
			return null;
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_116__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_116((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_117__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_117((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_118__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_118((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_119__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_119((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_120__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_120((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_121__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_121((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_122__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_122((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_FLOWNODETOSTEP:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(FlowNodeToStep) arguments.get(1));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERMEDIATECATCHEVENT_SEQUENCEFLOW_PROCESS_EVENTBASEDGATEWAY_SEQUENCEFLOW_NORMALSTEP_FLOWNODETOSTEP_ALTERNATIVEFLOWALTERNATIVE_SEQFLOWTOALTFLOWALT_ALTERNATIVEFLOW_ICETOALTFLOW_SEQUENCEFLOWTOUCFLOW_FLOW_LANE_LANESET_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(IntermediateCatchEvent) arguments.get(1),
					(SequenceFlow) arguments.get(2),
					(bpmn2.Process) arguments.get(3),
					(EventBasedGateway) arguments.get(4),
					(SequenceFlow) arguments.get(5),
					(NormalStep) arguments.get(6),
					(FlowNodeToStep) arguments.get(7),
					(AlternativeFlowAlternative) arguments.get(8),
					(SeqFlowToAltFlowAlt) arguments.get(9),
					(AlternativeFlow) arguments.get(10),
					(ICEToAltFlow) arguments.get(11),
					(SequenceFlowToUCFlow) arguments.get(12),
					(Flow) arguments.get(13), (Lane) arguments.get(14),
					(LaneSet) arguments.get(15),
					(ModelgeneratorRuleResult) arguments.get(16));
		case RulesPackage.EX_CONV_GW_AFTER_EVENT_GW_ICE_SEQ_FLOW_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_1_blackBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					return new Object[] { _this, match, ice, inFlow, process,
							eventGw, divergeFlow, exConvGateway, outFlow, lane,
							laneSet };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_2_bindingFBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, ice,
				inFlow, process, eventGw, divergeFlow, exConvGateway, outFlow,
				lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, ice, inFlow, process,
					eventGw, divergeFlow, exConvGateway, outFlow, lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_2_bindingAndBlackFBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_2_binding = pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_2_bindingFBBBBBBBBBBB(
				_this, match, ice, inFlow, process, eventGw, divergeFlow,
				exConvGateway, outFlow, lane, laneSet);
		if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_2_binding[0];

			Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_2_black = pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_2_blackB(csp);
			if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_2_black != null) {

				return new Object[] { csp, _this, match, ice, inFlow, process,
						eventGw, divergeFlow, exConvGateway, outFlow, lane,
						laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_3_expressionFBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_4_blackBBBBBBBBBB(
			Match match, IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					return new Object[] { match, ice, inFlow, process, eventGw,
							divergeFlow, exConvGateway, outFlow, lane, laneSet };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_4_greenBBBBBBFFFFFFF(
			Match match, SequenceFlow inFlow, bpmn2.Process process,
			ExclusiveGateway exConvGateway, SequenceFlow outFlow, Lane lane) {
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exConvGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exConvGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exConvGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exConvGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exConvGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(exConvGateway);
		match.getToBeTranslatedNodes().add(outFlow);
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__exConvGateway____flowElements_name_prime = "flowElements";
		String inFlow__exConvGateway____targetRef_name_prime = "targetRef";
		String exConvGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exConvGateway____sourceRef_name_prime = "sourceRef";
		String exConvGateway__outFlow____outgoing_name_prime = "outgoing";
		String lane__exConvGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(process__outFlow____flowElements);
		process__exConvGateway____flowElements.setSrc(process);
		process__exConvGateway____flowElements.setTrg(exConvGateway);
		match.getToBeTranslatedEdges().add(
				process__exConvGateway____flowElements);
		inFlow__exConvGateway____targetRef.setSrc(inFlow);
		inFlow__exConvGateway____targetRef.setTrg(exConvGateway);
		match.getToBeTranslatedEdges().add(inFlow__exConvGateway____targetRef);
		exConvGateway__inFlow____incoming.setSrc(exConvGateway);
		exConvGateway__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(exConvGateway__inFlow____incoming);
		outFlow__exConvGateway____sourceRef.setSrc(outFlow);
		outFlow__exConvGateway____sourceRef.setTrg(exConvGateway);
		match.getToBeTranslatedEdges().add(outFlow__exConvGateway____sourceRef);
		exConvGateway__outFlow____outgoing.setSrc(exConvGateway);
		exConvGateway__outFlow____outgoing.setTrg(outFlow);
		match.getToBeTranslatedEdges().add(exConvGateway__outFlow____outgoing);
		lane__exConvGateway____flowNodeRefs.setSrc(lane);
		lane__exConvGateway____flowNodeRefs.setTrg(exConvGateway);
		match.getToBeTranslatedEdges().add(lane__exConvGateway____flowNodeRefs);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__exConvGateway____flowElements
				.setName(process__exConvGateway____flowElements_name_prime);
		inFlow__exConvGateway____targetRef
				.setName(inFlow__exConvGateway____targetRef_name_prime);
		exConvGateway__inFlow____incoming
				.setName(exConvGateway__inFlow____incoming_name_prime);
		outFlow__exConvGateway____sourceRef
				.setName(outFlow__exConvGateway____sourceRef_name_prime);
		exConvGateway__outFlow____outgoing
				.setName(exConvGateway__outFlow____outgoing_name_prime);
		lane__exConvGateway____flowNodeRefs
				.setName(lane__exConvGateway____flowNodeRefs_name_prime);
		return new Object[] { match, inFlow, process, exConvGateway, outFlow,
				lane, process__outFlow____flowElements,
				process__exConvGateway____flowElements,
				inFlow__exConvGateway____targetRef,
				exConvGateway__inFlow____incoming,
				outFlow__exConvGateway____sourceRef,
				exConvGateway__outFlow____outgoing,
				lane__exConvGateway____flowNodeRefs };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_5_blackBBBBBBBBBB(
			Match match, IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					return new Object[] { match, ice, inFlow, process, eventGw,
							divergeFlow, exConvGateway, outFlow, lane, laneSet };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_5_greenBBBBBBBBFFFFFFFFFFFF(
			Match match, IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, Lane lane, LaneSet laneSet) {
		EMoflonEdge inFlow__ice____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ice__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__eventGw____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__divergeFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__ice____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow__eventGw____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventGw__divergeFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow__ice____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ice__divergeFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(ice);
		match.getContextNodes().add(inFlow);
		match.getContextNodes().add(process);
		match.getContextNodes().add(eventGw);
		match.getContextNodes().add(divergeFlow);
		match.getContextNodes().add(lane);
		match.getContextNodes().add(laneSet);
		String inFlow__ice____sourceRef_name_prime = "sourceRef";
		String ice__inFlow____outgoing_name_prime = "outgoing";
		String process__eventGw____flowElements_name_prime = "flowElements";
		String process__divergeFlow____flowElements_name_prime = "flowElements";
		String process__ice____flowElements_name_prime = "flowElements";
		String divergeFlow__eventGw____sourceRef_name_prime = "sourceRef";
		String eventGw__divergeFlow____outgoing_name_prime = "outgoing";
		String divergeFlow__ice____targetRef_name_prime = "targetRef";
		String ice__divergeFlow____incoming_name_prime = "incoming";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String laneSet__lane____lanes_name_prime = "lanes";
		inFlow__ice____sourceRef.setSrc(inFlow);
		inFlow__ice____sourceRef.setTrg(ice);
		match.getContextEdges().add(inFlow__ice____sourceRef);
		ice__inFlow____outgoing.setSrc(ice);
		ice__inFlow____outgoing.setTrg(inFlow);
		match.getContextEdges().add(ice__inFlow____outgoing);
		process__eventGw____flowElements.setSrc(process);
		process__eventGw____flowElements.setTrg(eventGw);
		match.getContextEdges().add(process__eventGw____flowElements);
		process__divergeFlow____flowElements.setSrc(process);
		process__divergeFlow____flowElements.setTrg(divergeFlow);
		match.getContextEdges().add(process__divergeFlow____flowElements);
		process__ice____flowElements.setSrc(process);
		process__ice____flowElements.setTrg(ice);
		match.getContextEdges().add(process__ice____flowElements);
		divergeFlow__eventGw____sourceRef.setSrc(divergeFlow);
		divergeFlow__eventGw____sourceRef.setTrg(eventGw);
		match.getContextEdges().add(divergeFlow__eventGw____sourceRef);
		eventGw__divergeFlow____outgoing.setSrc(eventGw);
		eventGw__divergeFlow____outgoing.setTrg(divergeFlow);
		match.getContextEdges().add(eventGw__divergeFlow____outgoing);
		divergeFlow__ice____targetRef.setSrc(divergeFlow);
		divergeFlow__ice____targetRef.setTrg(ice);
		match.getContextEdges().add(divergeFlow__ice____targetRef);
		ice__divergeFlow____incoming.setSrc(ice);
		ice__divergeFlow____incoming.setTrg(divergeFlow);
		match.getContextEdges().add(ice__divergeFlow____incoming);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		match.getContextEdges().add(process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getContextEdges().add(process__inFlow____flowElements);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		match.getContextEdges().add(laneSet__lane____lanes);
		inFlow__ice____sourceRef.setName(inFlow__ice____sourceRef_name_prime);
		ice__inFlow____outgoing.setName(ice__inFlow____outgoing_name_prime);
		process__eventGw____flowElements
				.setName(process__eventGw____flowElements_name_prime);
		process__divergeFlow____flowElements
				.setName(process__divergeFlow____flowElements_name_prime);
		process__ice____flowElements
				.setName(process__ice____flowElements_name_prime);
		divergeFlow__eventGw____sourceRef
				.setName(divergeFlow__eventGw____sourceRef_name_prime);
		eventGw__divergeFlow____outgoing
				.setName(eventGw__divergeFlow____outgoing_name_prime);
		divergeFlow__ice____targetRef
				.setName(divergeFlow__ice____targetRef_name_prime);
		ice__divergeFlow____incoming
				.setName(ice__divergeFlow____incoming_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { match, ice, inFlow, process, eventGw,
				divergeFlow, lane, laneSet, inFlow__ice____sourceRef,
				ice__inFlow____outgoing, process__eventGw____flowElements,
				process__divergeFlow____flowElements,
				process__ice____flowElements,
				divergeFlow__eventGw____sourceRef,
				eventGw__divergeFlow____outgoing,
				divergeFlow__ice____targetRef, ice__divergeFlow____incoming,
				process__laneSet____laneSets, process__inFlow____flowElements,
				laneSet__lane____lanes };
	}

	public static final void pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_6_expressionBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		_this.registerObjectsToMatch_FWD(match, ice, inFlow, process, eventGw,
				divergeFlow, exConvGateway, outFlow, lane, laneSet);

	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_bindingFFFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("ice");
		EObject _localVariable_1 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_2 = isApplicableMatch.getObject("process");
		EObject _localVariable_3 = isApplicableMatch.getObject("eventGw");
		EObject _localVariable_4 = isApplicableMatch.getObject("divergeFlow");
		EObject _localVariable_5 = isApplicableMatch.getObject("normalStep");
		EObject _localVariable_6 = isApplicableMatch
				.getObject("eventGwToNormalStep");
		EObject _localVariable_7 = isApplicableMatch.getObject("alt");
		EObject _localVariable_8 = isApplicableMatch
				.getObject("divergeFlowToAlt");
		EObject _localVariable_9 = isApplicableMatch.getObject("flow");
		EObject _localVariable_10 = isApplicableMatch.getObject("iceToFlow");
		EObject _localVariable_11 = isApplicableMatch
				.getObject("exConvGateway");
		EObject _localVariable_12 = isApplicableMatch.getObject("outFlow");
		EObject _localVariable_13 = isApplicableMatch.getObject("inFlowToFlow");
		EObject _localVariable_14 = isApplicableMatch.getObject("initFlow");
		EObject _localVariable_15 = isApplicableMatch.getObject("lane");
		EObject _localVariable_16 = isApplicableMatch.getObject("laneSet");
		EObject tmpIce = _localVariable_0;
		EObject tmpInFlow = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpEventGw = _localVariable_3;
		EObject tmpDivergeFlow = _localVariable_4;
		EObject tmpNormalStep = _localVariable_5;
		EObject tmpEventGwToNormalStep = _localVariable_6;
		EObject tmpAlt = _localVariable_7;
		EObject tmpDivergeFlowToAlt = _localVariable_8;
		EObject tmpFlow = _localVariable_9;
		EObject tmpIceToFlow = _localVariable_10;
		EObject tmpExConvGateway = _localVariable_11;
		EObject tmpOutFlow = _localVariable_12;
		EObject tmpInFlowToFlow = _localVariable_13;
		EObject tmpInitFlow = _localVariable_14;
		EObject tmpLane = _localVariable_15;
		EObject tmpLaneSet = _localVariable_16;
		if (tmpIce instanceof IntermediateCatchEvent) {
			IntermediateCatchEvent ice = (IntermediateCatchEvent) tmpIce;
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (tmpProcess instanceof bpmn2.Process) {
					bpmn2.Process process = (bpmn2.Process) tmpProcess;
					if (tmpEventGw instanceof EventBasedGateway) {
						EventBasedGateway eventGw = (EventBasedGateway) tmpEventGw;
						if (tmpDivergeFlow instanceof SequenceFlow) {
							SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
							if (tmpNormalStep instanceof NormalStep) {
								NormalStep normalStep = (NormalStep) tmpNormalStep;
								if (tmpEventGwToNormalStep instanceof FlowNodeToStep) {
									FlowNodeToStep eventGwToNormalStep = (FlowNodeToStep) tmpEventGwToNormalStep;
									if (tmpAlt instanceof AlternativeFlowAlternative) {
										AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
										if (tmpDivergeFlowToAlt instanceof SeqFlowToAltFlowAlt) {
											SeqFlowToAltFlowAlt divergeFlowToAlt = (SeqFlowToAltFlowAlt) tmpDivergeFlowToAlt;
											if (tmpFlow instanceof AlternativeFlow) {
												AlternativeFlow flow = (AlternativeFlow) tmpFlow;
												if (tmpIceToFlow instanceof ICEToAltFlow) {
													ICEToAltFlow iceToFlow = (ICEToAltFlow) tmpIceToFlow;
													if (tmpExConvGateway instanceof ExclusiveGateway) {
														ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
														if (tmpOutFlow instanceof SequenceFlow) {
															SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
															if (tmpInFlowToFlow instanceof SequenceFlowToUCFlow) {
																SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) tmpInFlowToFlow;
																if (tmpInitFlow instanceof Flow) {
																	Flow initFlow = (Flow) tmpInitFlow;
																	if (tmpLane instanceof Lane) {
																		Lane lane = (Lane) tmpLane;
																		if (tmpLaneSet instanceof LaneSet) {
																			LaneSet laneSet = (LaneSet) tmpLaneSet;
																			return new Object[] {
																					ice,
																					inFlow,
																					process,
																					eventGw,
																					divergeFlow,
																					normalStep,
																					eventGwToNormalStep,
																					alt,
																					divergeFlowToAlt,
																					flow,
																					iceToFlow,
																					exConvGateway,
																					outFlow,
																					inFlowToFlow,
																					initFlow,
																					lane,
																					laneSet,
																					isApplicableMatch };
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_blackBBBBBBBBBBBBBBBBBFBB(
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, NormalStep normalStep,
			FlowNodeToStep eventGwToNormalStep, AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, SequenceFlowToUCFlow inFlowToFlow,
			Flow initFlow, Lane lane, LaneSet laneSet,
			ExConvGwAfterEventGwIceSeqFlowRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					if (!flow.equals(initFlow)) {
						for (EObject tmpCsp : isApplicableMatch
								.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { ice, inFlow, process,
										eventGw, divergeFlow, normalStep,
										eventGwToNormalStep, alt,
										divergeFlowToAlt, flow, iceToFlow,
										exConvGateway, outFlow, inFlowToFlow,
										initFlow, lane, laneSet, csp, _this,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_bindingAndBlackFFFFFFFFFFFFFFFFFFBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding = pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_bindingFFFFFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding != null) {
			IntermediateCatchEvent ice = (IntermediateCatchEvent) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[0];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[1];
			bpmn2.Process process = (bpmn2.Process) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[2];
			EventBasedGateway eventGw = (EventBasedGateway) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[3];
			SequenceFlow divergeFlow = (SequenceFlow) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[4];
			NormalStep normalStep = (NormalStep) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[5];
			FlowNodeToStep eventGwToNormalStep = (FlowNodeToStep) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[6];
			AlternativeFlowAlternative alt = (AlternativeFlowAlternative) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[7];
			SeqFlowToAltFlowAlt divergeFlowToAlt = (SeqFlowToAltFlowAlt) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[8];
			AlternativeFlow flow = (AlternativeFlow) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[9];
			ICEToAltFlow iceToFlow = (ICEToAltFlow) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[10];
			ExclusiveGateway exConvGateway = (ExclusiveGateway) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[11];
			SequenceFlow outFlow = (SequenceFlow) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[12];
			SequenceFlowToUCFlow inFlowToFlow = (SequenceFlowToUCFlow) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[13];
			Flow initFlow = (Flow) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[14];
			Lane lane = (Lane) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[15];
			LaneSet laneSet = (LaneSet) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_binding[16];

			Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_black = pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_blackBBBBBBBBBBBBBBBBBFBB(
					ice, inFlow, process, eventGw, divergeFlow, normalStep,
					eventGwToNormalStep, alt, divergeFlowToAlt, flow,
					iceToFlow, exConvGateway, outFlow, inFlowToFlow, initFlow,
					lane, laneSet, _this, isApplicableMatch);
			if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_black[17];

				return new Object[] { ice, inFlow, process, eventGw,
						divergeFlow, normalStep, eventGwToNormalStep, alt,
						divergeFlowToAlt, flow, iceToFlow, exConvGateway,
						outFlow, inFlowToFlow, initFlow, lane, laneSet, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_1_greenBBBFBFF(
			NormalStep normalStep, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Flow initFlow) {
		FlowNodeToStep ecgwToStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToUCFlow outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		ecgwToStep.setSource(exConvGateway);
		ecgwToStep.setTarget(normalStep);
		outFlowToInitFlow.setSource(outFlow);
		outFlowToInitFlow.setTarget(initFlow);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		return new Object[] { normalStep, exConvGateway, outFlow, ecgwToStep,
				initFlow, outFlowToInitFlow, outFlowToNormalStep };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_2_blackBBBBB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow,
			FlowNodeToStep ecgwToStep, SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToNormalStep) {
		return new Object[] { exConvGateway, outFlow, ecgwToStep,
				outFlowToInitFlow, outFlowToNormalStep };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_2_greenFBBBBB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow,
			FlowNodeToStep ecgwToStep, SequenceFlowToUCFlow outFlowToInitFlow,
			SequenceFlowToStep outFlowToNormalStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(exConvGateway);
		ruleresult.getTranslatedElements().add(outFlow);
		ruleresult.getCreatedLinkElements().add(ecgwToStep);
		ruleresult.getCreatedLinkElements().add(outFlowToInitFlow);
		ruleresult.getCreatedLinkElements().add(outFlowToNormalStep);
		return new Object[] { ruleresult, exConvGateway, outFlow, ecgwToStep,
				outFlowToInitFlow, outFlowToNormalStep };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_3_blackBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ice, EObject inFlow,
			EObject process, EObject eventGw, EObject divergeFlow,
			EObject normalStep, EObject eventGwToNormalStep, EObject alt,
			EObject divergeFlowToAlt, EObject flow, EObject iceToFlow,
			EObject exConvGateway, EObject outFlow, EObject inFlowToFlow,
			EObject ecgwToStep, EObject initFlow, EObject outFlowToInitFlow,
			EObject outFlowToNormalStep, EObject lane, EObject laneSet) {
		if (!ice.equals(inFlow)) {
			if (!ice.equals(process)) {
				if (!ice.equals(normalStep)) {
					if (!ice.equals(iceToFlow)) {
						if (!ice.equals(outFlow)) {
							if (!ice.equals(inFlowToFlow)) {
								if (!ice.equals(initFlow)) {
									if (!ice.equals(outFlowToInitFlow)) {
										if (!ice.equals(outFlowToNormalStep)) {
											if (!ice.equals(lane)) {
												if (!ice.equals(laneSet)) {
													if (!inFlow.equals(process)) {
														if (!inFlow
																.equals(normalStep)) {
															if (!inFlow
																	.equals(outFlow)) {
																if (!inFlow
																		.equals(inFlowToFlow)) {
																	if (!inFlow
																			.equals(initFlow)) {
																		if (!inFlow
																				.equals(outFlowToInitFlow)) {
																			if (!inFlow
																					.equals(outFlowToNormalStep)) {
																				if (!inFlow
																						.equals(lane)) {
																					if (!inFlow
																							.equals(laneSet)) {
																						if (!eventGw
																								.equals(ice)) {
																							if (!eventGw
																									.equals(inFlow)) {
																								if (!eventGw
																										.equals(process)) {
																									if (!eventGw
																											.equals(normalStep)) {
																										if (!eventGw
																												.equals(eventGwToNormalStep)) {
																											if (!eventGw
																													.equals(flow)) {
																												if (!eventGw
																														.equals(iceToFlow)) {
																													if (!eventGw
																															.equals(exConvGateway)) {
																														if (!eventGw
																																.equals(outFlow)) {
																															if (!eventGw
																																	.equals(inFlowToFlow)) {
																																if (!eventGw
																																		.equals(initFlow)) {
																																	if (!eventGw
																																			.equals(outFlowToInitFlow)) {
																																		if (!eventGw
																																				.equals(outFlowToNormalStep)) {
																																			if (!eventGw
																																					.equals(lane)) {
																																				if (!eventGw
																																						.equals(laneSet)) {
																																					if (!divergeFlow
																																							.equals(ice)) {
																																						if (!divergeFlow
																																								.equals(inFlow)) {
																																							if (!divergeFlow
																																									.equals(process)) {
																																								if (!divergeFlow
																																										.equals(eventGw)) {
																																									if (!divergeFlow
																																											.equals(normalStep)) {
																																										if (!divergeFlow
																																												.equals(eventGwToNormalStep)) {
																																											if (!divergeFlow
																																													.equals(divergeFlowToAlt)) {
																																												if (!divergeFlow
																																														.equals(flow)) {
																																													if (!divergeFlow
																																															.equals(iceToFlow)) {
																																														if (!divergeFlow
																																																.equals(exConvGateway)) {
																																															if (!divergeFlow
																																																	.equals(outFlow)) {
																																																if (!divergeFlow
																																																		.equals(inFlowToFlow)) {
																																																	if (!divergeFlow
																																																			.equals(ecgwToStep)) {
																																																		if (!divergeFlow
																																																				.equals(initFlow)) {
																																																			if (!divergeFlow
																																																					.equals(outFlowToInitFlow)) {
																																																				if (!divergeFlow
																																																						.equals(outFlowToNormalStep)) {
																																																					if (!divergeFlow
																																																							.equals(lane)) {
																																																						if (!divergeFlow
																																																								.equals(laneSet)) {
																																																							if (!normalStep
																																																									.equals(process)) {
																																																								if (!normalStep
																																																										.equals(outFlow)) {
																																																									if (!normalStep
																																																											.equals(outFlowToInitFlow)) {
																																																										if (!normalStep
																																																												.equals(outFlowToNormalStep)) {
																																																											if (!eventGwToNormalStep
																																																													.equals(ice)) {
																																																												if (!eventGwToNormalStep
																																																														.equals(inFlow)) {
																																																													if (!eventGwToNormalStep
																																																															.equals(process)) {
																																																														if (!eventGwToNormalStep
																																																																.equals(normalStep)) {
																																																															if (!eventGwToNormalStep
																																																																	.equals(flow)) {
																																																																if (!eventGwToNormalStep
																																																																		.equals(iceToFlow)) {
																																																																	if (!eventGwToNormalStep
																																																																			.equals(exConvGateway)) {
																																																																		if (!eventGwToNormalStep
																																																																				.equals(outFlow)) {
																																																																			if (!eventGwToNormalStep
																																																																					.equals(inFlowToFlow)) {
																																																																				if (!eventGwToNormalStep
																																																																						.equals(initFlow)) {
																																																																					if (!eventGwToNormalStep
																																																																							.equals(outFlowToInitFlow)) {
																																																																						if (!eventGwToNormalStep
																																																																								.equals(outFlowToNormalStep)) {
																																																																							if (!eventGwToNormalStep
																																																																									.equals(lane)) {
																																																																								if (!eventGwToNormalStep
																																																																										.equals(laneSet)) {
																																																																									if (!alt.equals(ice)) {
																																																																										if (!alt.equals(inFlow)) {
																																																																											if (!alt.equals(process)) {
																																																																												if (!alt.equals(eventGw)) {
																																																																													if (!alt.equals(divergeFlow)) {
																																																																														if (!alt.equals(normalStep)) {
																																																																															if (!alt.equals(eventGwToNormalStep)) {
																																																																																if (!alt.equals(divergeFlowToAlt)) {
																																																																																	if (!alt.equals(flow)) {
																																																																																		if (!alt.equals(iceToFlow)) {
																																																																																			if (!alt.equals(exConvGateway)) {
																																																																																				if (!alt.equals(outFlow)) {
																																																																																					if (!alt.equals(inFlowToFlow)) {
																																																																																						if (!alt.equals(ecgwToStep)) {
																																																																																							if (!alt.equals(initFlow)) {
																																																																																								if (!alt.equals(outFlowToInitFlow)) {
																																																																																									if (!alt.equals(outFlowToNormalStep)) {
																																																																																										if (!alt.equals(lane)) {
																																																																																											if (!alt.equals(laneSet)) {
																																																																																												if (!divergeFlowToAlt
																																																																																														.equals(ice)) {
																																																																																													if (!divergeFlowToAlt
																																																																																															.equals(inFlow)) {
																																																																																														if (!divergeFlowToAlt
																																																																																																.equals(process)) {
																																																																																															if (!divergeFlowToAlt
																																																																																																	.equals(eventGw)) {
																																																																																																if (!divergeFlowToAlt
																																																																																																		.equals(normalStep)) {
																																																																																																	if (!divergeFlowToAlt
																																																																																																			.equals(eventGwToNormalStep)) {
																																																																																																		if (!divergeFlowToAlt
																																																																																																				.equals(flow)) {
																																																																																																			if (!divergeFlowToAlt
																																																																																																					.equals(iceToFlow)) {
																																																																																																				if (!divergeFlowToAlt
																																																																																																						.equals(exConvGateway)) {
																																																																																																					if (!divergeFlowToAlt
																																																																																																							.equals(outFlow)) {
																																																																																																						if (!divergeFlowToAlt
																																																																																																								.equals(inFlowToFlow)) {
																																																																																																							if (!divergeFlowToAlt
																																																																																																									.equals(ecgwToStep)) {
																																																																																																								if (!divergeFlowToAlt
																																																																																																										.equals(initFlow)) {
																																																																																																									if (!divergeFlowToAlt
																																																																																																											.equals(outFlowToInitFlow)) {
																																																																																																										if (!divergeFlowToAlt
																																																																																																												.equals(outFlowToNormalStep)) {
																																																																																																											if (!divergeFlowToAlt
																																																																																																													.equals(lane)) {
																																																																																																												if (!divergeFlowToAlt
																																																																																																														.equals(laneSet)) {
																																																																																																													if (!flow
																																																																																																															.equals(ice)) {
																																																																																																														if (!flow
																																																																																																																.equals(inFlow)) {
																																																																																																															if (!flow
																																																																																																																	.equals(process)) {
																																																																																																																if (!flow
																																																																																																																		.equals(normalStep)) {
																																																																																																																	if (!flow
																																																																																																																			.equals(iceToFlow)) {
																																																																																																																		if (!flow
																																																																																																																				.equals(outFlow)) {
																																																																																																																			if (!flow
																																																																																																																					.equals(inFlowToFlow)) {
																																																																																																																				if (!flow
																																																																																																																						.equals(initFlow)) {
																																																																																																																					if (!flow
																																																																																																																							.equals(outFlowToInitFlow)) {
																																																																																																																						if (!flow
																																																																																																																								.equals(outFlowToNormalStep)) {
																																																																																																																							if (!flow
																																																																																																																									.equals(lane)) {
																																																																																																																								if (!flow
																																																																																																																										.equals(laneSet)) {
																																																																																																																									if (!iceToFlow
																																																																																																																											.equals(inFlow)) {
																																																																																																																										if (!iceToFlow
																																																																																																																												.equals(process)) {
																																																																																																																											if (!iceToFlow
																																																																																																																													.equals(normalStep)) {
																																																																																																																												if (!iceToFlow
																																																																																																																														.equals(outFlow)) {
																																																																																																																													if (!iceToFlow
																																																																																																																															.equals(inFlowToFlow)) {
																																																																																																																														if (!iceToFlow
																																																																																																																																.equals(initFlow)) {
																																																																																																																															if (!iceToFlow
																																																																																																																																	.equals(outFlowToInitFlow)) {
																																																																																																																																if (!iceToFlow
																																																																																																																																		.equals(outFlowToNormalStep)) {
																																																																																																																																	if (!iceToFlow
																																																																																																																																			.equals(lane)) {
																																																																																																																																		if (!iceToFlow
																																																																																																																																				.equals(laneSet)) {
																																																																																																																																			if (!exConvGateway
																																																																																																																																					.equals(ice)) {
																																																																																																																																				if (!exConvGateway
																																																																																																																																						.equals(inFlow)) {
																																																																																																																																					if (!exConvGateway
																																																																																																																																							.equals(process)) {
																																																																																																																																						if (!exConvGateway
																																																																																																																																								.equals(normalStep)) {
																																																																																																																																							if (!exConvGateway
																																																																																																																																									.equals(flow)) {
																																																																																																																																								if (!exConvGateway
																																																																																																																																										.equals(iceToFlow)) {
																																																																																																																																									if (!exConvGateway
																																																																																																																																											.equals(outFlow)) {
																																																																																																																																										if (!exConvGateway
																																																																																																																																												.equals(inFlowToFlow)) {
																																																																																																																																											if (!exConvGateway
																																																																																																																																													.equals(initFlow)) {
																																																																																																																																												if (!exConvGateway
																																																																																																																																														.equals(outFlowToInitFlow)) {
																																																																																																																																													if (!exConvGateway
																																																																																																																																															.equals(outFlowToNormalStep)) {
																																																																																																																																														if (!exConvGateway
																																																																																																																																																.equals(lane)) {
																																																																																																																																															if (!exConvGateway
																																																																																																																																																	.equals(laneSet)) {
																																																																																																																																																if (!outFlow
																																																																																																																																																		.equals(process)) {
																																																																																																																																																	if (!outFlow
																																																																																																																																																			.equals(outFlowToInitFlow)) {
																																																																																																																																																		if (!outFlow
																																																																																																																																																				.equals(outFlowToNormalStep)) {
																																																																																																																																																			if (!inFlowToFlow
																																																																																																																																																					.equals(process)) {
																																																																																																																																																				if (!inFlowToFlow
																																																																																																																																																						.equals(normalStep)) {
																																																																																																																																																					if (!inFlowToFlow
																																																																																																																																																							.equals(outFlow)) {
																																																																																																																																																						if (!inFlowToFlow
																																																																																																																																																								.equals(initFlow)) {
																																																																																																																																																							if (!inFlowToFlow
																																																																																																																																																									.equals(outFlowToInitFlow)) {
																																																																																																																																																								if (!inFlowToFlow
																																																																																																																																																										.equals(outFlowToNormalStep)) {
																																																																																																																																																									if (!inFlowToFlow
																																																																																																																																																											.equals(lane)) {
																																																																																																																																																										if (!inFlowToFlow
																																																																																																																																																												.equals(laneSet)) {
																																																																																																																																																											if (!ecgwToStep
																																																																																																																																																													.equals(ice)) {
																																																																																																																																																												if (!ecgwToStep
																																																																																																																																																														.equals(inFlow)) {
																																																																																																																																																													if (!ecgwToStep
																																																																																																																																																															.equals(process)) {
																																																																																																																																																														if (!ecgwToStep
																																																																																																																																																																.equals(eventGw)) {
																																																																																																																																																															if (!ecgwToStep
																																																																																																																																																																	.equals(normalStep)) {
																																																																																																																																																																if (!ecgwToStep
																																																																																																																																																																		.equals(eventGwToNormalStep)) {
																																																																																																																																																																	if (!ecgwToStep
																																																																																																																																																																			.equals(flow)) {
																																																																																																																																																																		if (!ecgwToStep
																																																																																																																																																																				.equals(iceToFlow)) {
																																																																																																																																																																			if (!ecgwToStep
																																																																																																																																																																					.equals(exConvGateway)) {
																																																																																																																																																																				if (!ecgwToStep
																																																																																																																																																																						.equals(outFlow)) {
																																																																																																																																																																					if (!ecgwToStep
																																																																																																																																																																							.equals(inFlowToFlow)) {
																																																																																																																																																																						if (!ecgwToStep
																																																																																																																																																																								.equals(initFlow)) {
																																																																																																																																																																							if (!ecgwToStep
																																																																																																																																																																									.equals(outFlowToInitFlow)) {
																																																																																																																																																																								if (!ecgwToStep
																																																																																																																																																																										.equals(outFlowToNormalStep)) {
																																																																																																																																																																									if (!ecgwToStep
																																																																																																																																																																											.equals(lane)) {
																																																																																																																																																																										if (!ecgwToStep
																																																																																																																																																																												.equals(laneSet)) {
																																																																																																																																																																											if (!initFlow
																																																																																																																																																																													.equals(process)) {
																																																																																																																																																																												if (!initFlow
																																																																																																																																																																														.equals(normalStep)) {
																																																																																																																																																																													if (!initFlow
																																																																																																																																																																															.equals(outFlow)) {
																																																																																																																																																																														if (!initFlow
																																																																																																																																																																																.equals(outFlowToInitFlow)) {
																																																																																																																																																																															if (!initFlow
																																																																																																																																																																																	.equals(outFlowToNormalStep)) {
																																																																																																																																																																																if (!initFlow
																																																																																																																																																																																		.equals(lane)) {
																																																																																																																																																																																	if (!initFlow
																																																																																																																																																																																			.equals(laneSet)) {
																																																																																																																																																																																		if (!outFlowToInitFlow
																																																																																																																																																																																				.equals(process)) {
																																																																																																																																																																																			if (!outFlowToInitFlow
																																																																																																																																																																																					.equals(outFlowToNormalStep)) {
																																																																																																																																																																																				if (!outFlowToNormalStep
																																																																																																																																																																																						.equals(process)) {
																																																																																																																																																																																					if (!lane
																																																																																																																																																																																							.equals(process)) {
																																																																																																																																																																																						if (!lane
																																																																																																																																																																																								.equals(normalStep)) {
																																																																																																																																																																																							if (!lane
																																																																																																																																																																																									.equals(outFlow)) {
																																																																																																																																																																																								if (!lane
																																																																																																																																																																																										.equals(outFlowToInitFlow)) {
																																																																																																																																																																																									if (!lane
																																																																																																																																																																																											.equals(outFlowToNormalStep)) {
																																																																																																																																																																																										if (!lane
																																																																																																																																																																																												.equals(laneSet)) {
																																																																																																																																																																																											if (!laneSet
																																																																																																																																																																																													.equals(process)) {
																																																																																																																																																																																												if (!laneSet
																																																																																																																																																																																														.equals(normalStep)) {
																																																																																																																																																																																													if (!laneSet
																																																																																																																																																																																															.equals(outFlow)) {
																																																																																																																																																																																														if (!laneSet
																																																																																																																																																																																																.equals(outFlowToInitFlow)) {
																																																																																																																																																																																															if (!laneSet
																																																																																																																																																																																																	.equals(outFlowToNormalStep)) {
																																																																																																																																																																																																return new Object[] {
																																																																																																																																																																																																		ruleresult,
																																																																																																																																																																																																		ice,
																																																																																																																																																																																																		inFlow,
																																																																																																																																																																																																		process,
																																																																																																																																																																																																		eventGw,
																																																																																																																																																																																																		divergeFlow,
																																																																																																																																																																																																		normalStep,
																																																																																																																																																																																																		eventGwToNormalStep,
																																																																																																																																																																																																		alt,
																																																																																																																																																																																																		divergeFlowToAlt,
																																																																																																																																																																																																		flow,
																																																																																																																																																																																																		iceToFlow,
																																																																																																																																																																																																		exConvGateway,
																																																																																																																																																																																																		outFlow,
																																																																																																																																																																																																		inFlowToFlow,
																																																																																																																																																																																																		ecgwToStep,
																																																																																																																																																																																																		initFlow,
																																																																																																																																																																																																		outFlowToInitFlow,
																																																																																																																																																																																																		outFlowToNormalStep,
																																																																																																																																																																																																		lane,
																																																																																																																																																																																																		laneSet };
																																																																																																																																																																																															}
																																																																																																																																																																																														}
																																																																																																																																																																																													}
																																																																																																																																																																																												}
																																																																																																																																																																																											}
																																																																																																																																																																																										}
																																																																																																																																																																																									}
																																																																																																																																																																																								}
																																																																																																																																																																																							}
																																																																																																																																																																																						}
																																																																																																																																																																																					}
																																																																																																																																																																																				}
																																																																																																																																																																																			}
																																																																																																																																																																																		}
																																																																																																																																																																																	}
																																																																																																																																																																																}
																																																																																																																																																																															}
																																																																																																																																																																														}
																																																																																																																																																																													}
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject inFlow, EObject process,
			EObject normalStep, EObject exConvGateway, EObject outFlow,
			EObject ecgwToStep, EObject initFlow, EObject outFlowToInitFlow,
			EObject outFlowToNormalStep, EObject lane) {
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exConvGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exConvGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exConvGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exConvGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ecgwToStep__exConvGateway____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ecgwToStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToInitFlow__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToInitFlow__initFlow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__outFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlowToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exConvGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ExConvGwAfterEventGwIceSeqFlowRule";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__exConvGateway____flowElements_name_prime = "flowElements";
		String inFlow__exConvGateway____targetRef_name_prime = "targetRef";
		String exConvGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exConvGateway____sourceRef_name_prime = "sourceRef";
		String exConvGateway__outFlow____outgoing_name_prime = "outgoing";
		String ecgwToStep__exConvGateway____source_name_prime = "source";
		String ecgwToStep__normalStep____target_name_prime = "target";
		String outFlowToInitFlow__outFlow____source_name_prime = "source";
		String outFlowToInitFlow__initFlow____target_name_prime = "target";
		String outFlowToNormalStep__outFlow____source_name_prime = "source";
		String outFlowToNormalStep__normalStep____target_name_prime = "target";
		String lane__exConvGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(process__outFlow____flowElements);
		process__exConvGateway____flowElements.setSrc(process);
		process__exConvGateway____flowElements.setTrg(exConvGateway);
		ruleresult.getTranslatedEdges().add(
				process__exConvGateway____flowElements);
		inFlow__exConvGateway____targetRef.setSrc(inFlow);
		inFlow__exConvGateway____targetRef.setTrg(exConvGateway);
		ruleresult.getTranslatedEdges().add(inFlow__exConvGateway____targetRef);
		exConvGateway__inFlow____incoming.setSrc(exConvGateway);
		exConvGateway__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(exConvGateway__inFlow____incoming);
		outFlow__exConvGateway____sourceRef.setSrc(outFlow);
		outFlow__exConvGateway____sourceRef.setTrg(exConvGateway);
		ruleresult.getTranslatedEdges()
				.add(outFlow__exConvGateway____sourceRef);
		exConvGateway__outFlow____outgoing.setSrc(exConvGateway);
		exConvGateway__outFlow____outgoing.setTrg(outFlow);
		ruleresult.getTranslatedEdges().add(exConvGateway__outFlow____outgoing);
		ecgwToStep__exConvGateway____source.setSrc(ecgwToStep);
		ecgwToStep__exConvGateway____source.setTrg(exConvGateway);
		ruleresult.getCreatedEdges().add(ecgwToStep__exConvGateway____source);
		ecgwToStep__normalStep____target.setSrc(ecgwToStep);
		ecgwToStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(ecgwToStep__normalStep____target);
		outFlowToInitFlow__outFlow____source.setSrc(outFlowToInitFlow);
		outFlowToInitFlow__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges().add(outFlowToInitFlow__outFlow____source);
		outFlowToInitFlow__initFlow____target.setSrc(outFlowToInitFlow);
		outFlowToInitFlow__initFlow____target.setTrg(initFlow);
		ruleresult.getCreatedEdges().add(outFlowToInitFlow__initFlow____target);
		outFlowToNormalStep__outFlow____source.setSrc(outFlowToNormalStep);
		outFlowToNormalStep__outFlow____source.setTrg(outFlow);
		ruleresult.getCreatedEdges()
				.add(outFlowToNormalStep__outFlow____source);
		outFlowToNormalStep__normalStep____target.setSrc(outFlowToNormalStep);
		outFlowToNormalStep__normalStep____target.setTrg(normalStep);
		ruleresult.getCreatedEdges().add(
				outFlowToNormalStep__normalStep____target);
		lane__exConvGateway____flowNodeRefs.setSrc(lane);
		lane__exConvGateway____flowNodeRefs.setTrg(exConvGateway);
		ruleresult.getTranslatedEdges()
				.add(lane__exConvGateway____flowNodeRefs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__exConvGateway____flowElements
				.setName(process__exConvGateway____flowElements_name_prime);
		inFlow__exConvGateway____targetRef
				.setName(inFlow__exConvGateway____targetRef_name_prime);
		exConvGateway__inFlow____incoming
				.setName(exConvGateway__inFlow____incoming_name_prime);
		outFlow__exConvGateway____sourceRef
				.setName(outFlow__exConvGateway____sourceRef_name_prime);
		exConvGateway__outFlow____outgoing
				.setName(exConvGateway__outFlow____outgoing_name_prime);
		ecgwToStep__exConvGateway____source
				.setName(ecgwToStep__exConvGateway____source_name_prime);
		ecgwToStep__normalStep____target
				.setName(ecgwToStep__normalStep____target_name_prime);
		outFlowToInitFlow__outFlow____source
				.setName(outFlowToInitFlow__outFlow____source_name_prime);
		outFlowToInitFlow__initFlow____target
				.setName(outFlowToInitFlow__initFlow____target_name_prime);
		outFlowToNormalStep__outFlow____source
				.setName(outFlowToNormalStep__outFlow____source_name_prime);
		outFlowToNormalStep__normalStep____target
				.setName(outFlowToNormalStep__normalStep____target_name_prime);
		lane__exConvGateway____flowNodeRefs
				.setName(lane__exConvGateway____flowNodeRefs_name_prime);
		return new Object[] { ruleresult, inFlow, process, normalStep,
				exConvGateway, outFlow, ecgwToStep, initFlow,
				outFlowToInitFlow, outFlowToNormalStep, lane,
				process__outFlow____flowElements,
				process__exConvGateway____flowElements,
				inFlow__exConvGateway____targetRef,
				exConvGateway__inFlow____incoming,
				outFlow__exConvGateway____sourceRef,
				exConvGateway__outFlow____outgoing,
				ecgwToStep__exConvGateway____source,
				ecgwToStep__normalStep____target,
				outFlowToInitFlow__outFlow____source,
				outFlowToInitFlow__initFlow____target,
				outFlowToNormalStep__outFlow____source,
				outFlowToNormalStep__normalStep____target,
				lane__exConvGateway____flowNodeRefs };
	}

	public static final void pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_5_expressionBBBBBBBBBBBBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this,
			PerformRuleResult ruleresult, EObject ice, EObject inFlow,
			EObject process, EObject eventGw, EObject divergeFlow,
			EObject normalStep, EObject eventGwToNormalStep, EObject alt,
			EObject divergeFlowToAlt, EObject flow, EObject iceToFlow,
			EObject exConvGateway, EObject outFlow, EObject inFlowToFlow,
			EObject ecgwToStep, EObject initFlow, EObject outFlowToInitFlow,
			EObject outFlowToNormalStep, EObject lane, EObject laneSet) {
		_this.registerObjects_FWD(ruleresult, ice, inFlow, process, eventGw,
				divergeFlow, normalStep, eventGwToNormalStep, alt,
				divergeFlowToAlt, flow, iceToFlow, exConvGateway, outFlow,
				inFlowToFlow, ecgwToStep, initFlow, outFlowToInitFlow,
				outFlowToNormalStep, lane, laneSet);

	}

	public static final PerformRuleResult pattern_ExConvGwAfterEventGwIceSeqFlowRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_bindingFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_blackFBB(
			EClass eClass, ExConvGwAfterEventGwIceSeqFlowRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_bindingAndBlackFFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_binding = pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_bindingFB(_this);
		if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_binding[0];

			Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_black = pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ExConvGwAfterEventGwIceSeqFlowRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_2_bindingFFFFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("ice");
		EObject _localVariable_1 = match.getObject("inFlow");
		EObject _localVariable_2 = match.getObject("process");
		EObject _localVariable_3 = match.getObject("eventGw");
		EObject _localVariable_4 = match.getObject("divergeFlow");
		EObject _localVariable_5 = match.getObject("exConvGateway");
		EObject _localVariable_6 = match.getObject("outFlow");
		EObject _localVariable_7 = match.getObject("lane");
		EObject _localVariable_8 = match.getObject("laneSet");
		EObject tmpIce = _localVariable_0;
		EObject tmpInFlow = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpEventGw = _localVariable_3;
		EObject tmpDivergeFlow = _localVariable_4;
		EObject tmpExConvGateway = _localVariable_5;
		EObject tmpOutFlow = _localVariable_6;
		EObject tmpLane = _localVariable_7;
		EObject tmpLaneSet = _localVariable_8;
		if (tmpIce instanceof IntermediateCatchEvent) {
			IntermediateCatchEvent ice = (IntermediateCatchEvent) tmpIce;
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (tmpProcess instanceof bpmn2.Process) {
					bpmn2.Process process = (bpmn2.Process) tmpProcess;
					if (tmpEventGw instanceof EventBasedGateway) {
						EventBasedGateway eventGw = (EventBasedGateway) tmpEventGw;
						if (tmpDivergeFlow instanceof SequenceFlow) {
							SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
							if (tmpExConvGateway instanceof ExclusiveGateway) {
								ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
								if (tmpOutFlow instanceof SequenceFlow) {
									SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
									if (tmpLane instanceof Lane) {
										Lane lane = (Lane) tmpLane;
										if (tmpLaneSet instanceof LaneSet) {
											LaneSet laneSet = (LaneSet) tmpLaneSet;
											return new Object[] { ice, inFlow,
													process, eventGw,
													divergeFlow, exConvGateway,
													outFlow, lane, laneSet,
													match };
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_2_blackBBBBBFFFFFFBBFBBB(
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					for (FlowNodeToStep eventGwToNormalStep : org.moflon.util.eMoflonEMFUtil
							.getOppositeReferenceTyped(eventGw,
									FlowNodeToStep.class, "source")) {
						Step tmpNormalStep = eventGwToNormalStep.getTarget();
						if (tmpNormalStep instanceof NormalStep) {
							NormalStep normalStep = (NormalStep) tmpNormalStep;
							for (SeqFlowToAltFlowAlt divergeFlowToAlt : org.moflon.util.eMoflonEMFUtil
									.getOppositeReferenceTyped(divergeFlow,
											SeqFlowToAltFlowAlt.class, "source")) {
								AlternativeFlowAlternative alt = divergeFlowToAlt
										.getTarget();
								if (alt != null) {
									for (ICEToAltFlow iceToFlow : org.moflon.util.eMoflonEMFUtil
											.getOppositeReferenceTyped(ice,
													ICEToAltFlow.class,
													"source")) {
										AlternativeFlow flow = iceToFlow
												.getTarget();
										if (flow != null) {
											for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
													.getOppositeReferenceTyped(
															inFlow,
															SequenceFlowToUCFlow.class,
															"source")) {
												if (flow.equals(inFlowToFlow
														.getTarget())) {
													_result.add(new Object[] {
															ice,
															inFlow,
															process,
															eventGw,
															divergeFlow,
															normalStep,
															eventGwToNormalStep,
															alt,
															divergeFlowToAlt,
															flow, iceToFlow,
															exConvGateway,
															outFlow,
															inFlowToFlow, lane,
															laneSet, match });
												}
											}
										}

									}
								}

							}
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_3_blackBBBBBBBBBBBBBBFBB(
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, NormalStep normalStep,
			FlowNodeToStep eventGwToNormalStep, AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, SequenceFlowToUCFlow inFlowToFlow, Lane lane,
			LaneSet laneSet) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					if (ice.equals(inFlow.getSourceRef())) {
						if (process.getFlowElements().contains(eventGw)) {
							if (process.getFlowElements().contains(divergeFlow)) {
								if (process.getFlowElements().contains(ice)) {
									if (eventGw.equals(divergeFlow
											.getSourceRef())) {
										if (ice.equals(divergeFlow
												.getTargetRef())) {
											if (normalStep.getStepAlternative()
													.contains(alt)) {
												if (eventGw
														.equals(eventGwToNormalStep
																.getSource())) {
													if (normalStep
															.equals(eventGwToNormalStep
																	.getTarget())) {
														if (flow.equals(alt
																.getRef())) {
															if (divergeFlow
																	.equals(divergeFlowToAlt
																			.getSource())) {
																if (alt.equals(divergeFlowToAlt
																		.getTarget())) {
																	if (ice.equals(iceToFlow
																			.getSource())) {
																		if (flow.equals(iceToFlow
																				.getTarget())) {
																			if (process
																					.getFlowElements()
																					.contains(
																							outFlow)) {
																				if (process
																						.getLaneSets()
																						.contains(
																								laneSet)) {
																					if (process
																							.getFlowElements()
																							.contains(
																									inFlow)) {
																						if (process
																								.getFlowElements()
																								.contains(
																										exConvGateway)) {
																							if (exConvGateway
																									.equals(inFlow
																											.getTargetRef())) {
																								if (exConvGateway
																										.equals(outFlow
																												.getSourceRef())) {
																									if (inFlow
																											.equals(inFlowToFlow
																													.getSource())) {
																										if (flow.equals(inFlowToFlow
																												.getTarget())) {
																											if (lane.getFlowNodeRefs()
																													.contains(
																															exConvGateway)) {
																												if (laneSet
																														.getLanes()
																														.contains(
																																lane)) {
																													for (Flow initFlow : org.moflon.util.eMoflonEMFUtil
																															.getOppositeReferenceTyped(
																																	normalStep,
																																	Flow.class,
																																	"steps")) {
																														if (!flow
																																.equals(initFlow)) {
																															_result.add(new Object[] {
																																	ice,
																																	inFlow,
																																	process,
																																	eventGw,
																																	divergeFlow,
																																	normalStep,
																																	eventGwToNormalStep,
																																	alt,
																																	divergeFlowToAlt,
																																	flow,
																																	iceToFlow,
																																	exConvGateway,
																																	outFlow,
																																	inFlowToFlow,
																																	initFlow,
																																	lane,
																																	laneSet });
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_3_greenBBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, NormalStep normalStep,
			FlowNodeToStep eventGwToNormalStep, AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, SequenceFlowToUCFlow inFlowToFlow,
			Flow initFlow, Lane lane, LaneSet laneSet) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge inFlow__ice____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ice__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__eventGw____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__divergeFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__ice____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow__eventGw____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventGw__divergeFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlow__ice____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ice__divergeFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge normalStep__alt____stepAlternative = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventGwToNormalStep__eventGw____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eventGwToNormalStep__normalStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge alt__flow____ref = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlowToAlt__divergeFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge divergeFlowToAlt__alt____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge iceToFlow__ice____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge iceToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__outFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__laneSet____laneSets = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__exConvGateway____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlow__exConvGateway____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exConvGateway__inFlow____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge outFlow__exConvGateway____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge exConvGateway__outFlow____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__inFlow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge inFlowToFlow__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge initFlow__normalStep____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge lane__exConvGateway____flowNodeRefs = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge laneSet__lane____lanes = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String inFlow__ice____sourceRef_name_prime = "sourceRef";
		String ice__inFlow____outgoing_name_prime = "outgoing";
		String process__eventGw____flowElements_name_prime = "flowElements";
		String process__divergeFlow____flowElements_name_prime = "flowElements";
		String process__ice____flowElements_name_prime = "flowElements";
		String divergeFlow__eventGw____sourceRef_name_prime = "sourceRef";
		String eventGw__divergeFlow____outgoing_name_prime = "outgoing";
		String divergeFlow__ice____targetRef_name_prime = "targetRef";
		String ice__divergeFlow____incoming_name_prime = "incoming";
		String normalStep__alt____stepAlternative_name_prime = "stepAlternative";
		String eventGwToNormalStep__eventGw____source_name_prime = "source";
		String eventGwToNormalStep__normalStep____target_name_prime = "target";
		String alt__flow____ref_name_prime = "ref";
		String divergeFlowToAlt__divergeFlow____source_name_prime = "source";
		String divergeFlowToAlt__alt____target_name_prime = "target";
		String iceToFlow__ice____source_name_prime = "source";
		String iceToFlow__flow____target_name_prime = "target";
		String process__outFlow____flowElements_name_prime = "flowElements";
		String process__laneSet____laneSets_name_prime = "laneSets";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__exConvGateway____flowElements_name_prime = "flowElements";
		String inFlow__exConvGateway____targetRef_name_prime = "targetRef";
		String exConvGateway__inFlow____incoming_name_prime = "incoming";
		String outFlow__exConvGateway____sourceRef_name_prime = "sourceRef";
		String exConvGateway__outFlow____outgoing_name_prime = "outgoing";
		String inFlowToFlow__inFlow____source_name_prime = "source";
		String inFlowToFlow__flow____target_name_prime = "target";
		String initFlow__normalStep____steps_name_prime = "steps";
		String lane__exConvGateway____flowNodeRefs_name_prime = "flowNodeRefs";
		String laneSet__lane____lanes_name_prime = "lanes";
		isApplicableMatch.getAllContextElements().add(ice);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(eventGw);
		isApplicableMatch.getAllContextElements().add(divergeFlow);
		isApplicableMatch.getAllContextElements().add(normalStep);
		isApplicableMatch.getAllContextElements().add(eventGwToNormalStep);
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(divergeFlowToAlt);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(iceToFlow);
		isApplicableMatch.getAllContextElements().add(exConvGateway);
		isApplicableMatch.getAllContextElements().add(outFlow);
		isApplicableMatch.getAllContextElements().add(inFlowToFlow);
		isApplicableMatch.getAllContextElements().add(initFlow);
		isApplicableMatch.getAllContextElements().add(lane);
		isApplicableMatch.getAllContextElements().add(laneSet);
		inFlow__ice____sourceRef.setSrc(inFlow);
		inFlow__ice____sourceRef.setTrg(ice);
		isApplicableMatch.getAllContextElements().add(inFlow__ice____sourceRef);
		ice__inFlow____outgoing.setSrc(ice);
		ice__inFlow____outgoing.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(ice__inFlow____outgoing);
		process__eventGw____flowElements.setSrc(process);
		process__eventGw____flowElements.setTrg(eventGw);
		isApplicableMatch.getAllContextElements().add(
				process__eventGw____flowElements);
		process__divergeFlow____flowElements.setSrc(process);
		process__divergeFlow____flowElements.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				process__divergeFlow____flowElements);
		process__ice____flowElements.setSrc(process);
		process__ice____flowElements.setTrg(ice);
		isApplicableMatch.getAllContextElements().add(
				process__ice____flowElements);
		divergeFlow__eventGw____sourceRef.setSrc(divergeFlow);
		divergeFlow__eventGw____sourceRef.setTrg(eventGw);
		isApplicableMatch.getAllContextElements().add(
				divergeFlow__eventGw____sourceRef);
		eventGw__divergeFlow____outgoing.setSrc(eventGw);
		eventGw__divergeFlow____outgoing.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				eventGw__divergeFlow____outgoing);
		divergeFlow__ice____targetRef.setSrc(divergeFlow);
		divergeFlow__ice____targetRef.setTrg(ice);
		isApplicableMatch.getAllContextElements().add(
				divergeFlow__ice____targetRef);
		ice__divergeFlow____incoming.setSrc(ice);
		ice__divergeFlow____incoming.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				ice__divergeFlow____incoming);
		normalStep__alt____stepAlternative.setSrc(normalStep);
		normalStep__alt____stepAlternative.setTrg(alt);
		isApplicableMatch.getAllContextElements().add(
				normalStep__alt____stepAlternative);
		eventGwToNormalStep__eventGw____source.setSrc(eventGwToNormalStep);
		eventGwToNormalStep__eventGw____source.setTrg(eventGw);
		isApplicableMatch.getAllContextElements().add(
				eventGwToNormalStep__eventGw____source);
		eventGwToNormalStep__normalStep____target.setSrc(eventGwToNormalStep);
		eventGwToNormalStep__normalStep____target.setTrg(normalStep);
		isApplicableMatch.getAllContextElements().add(
				eventGwToNormalStep__normalStep____target);
		alt__flow____ref.setSrc(alt);
		alt__flow____ref.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(alt__flow____ref);
		divergeFlowToAlt__divergeFlow____source.setSrc(divergeFlowToAlt);
		divergeFlowToAlt__divergeFlow____source.setTrg(divergeFlow);
		isApplicableMatch.getAllContextElements().add(
				divergeFlowToAlt__divergeFlow____source);
		divergeFlowToAlt__alt____target.setSrc(divergeFlowToAlt);
		divergeFlowToAlt__alt____target.setTrg(alt);
		isApplicableMatch.getAllContextElements().add(
				divergeFlowToAlt__alt____target);
		iceToFlow__ice____source.setSrc(iceToFlow);
		iceToFlow__ice____source.setTrg(ice);
		isApplicableMatch.getAllContextElements().add(iceToFlow__ice____source);
		iceToFlow__flow____target.setSrc(iceToFlow);
		iceToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements()
				.add(iceToFlow__flow____target);
		process__outFlow____flowElements.setSrc(process);
		process__outFlow____flowElements.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				process__outFlow____flowElements);
		process__laneSet____laneSets.setSrc(process);
		process__laneSet____laneSets.setTrg(laneSet);
		isApplicableMatch.getAllContextElements().add(
				process__laneSet____laneSets);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				process__inFlow____flowElements);
		process__exConvGateway____flowElements.setSrc(process);
		process__exConvGateway____flowElements.setTrg(exConvGateway);
		isApplicableMatch.getAllContextElements().add(
				process__exConvGateway____flowElements);
		inFlow__exConvGateway____targetRef.setSrc(inFlow);
		inFlow__exConvGateway____targetRef.setTrg(exConvGateway);
		isApplicableMatch.getAllContextElements().add(
				inFlow__exConvGateway____targetRef);
		exConvGateway__inFlow____incoming.setSrc(exConvGateway);
		exConvGateway__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				exConvGateway__inFlow____incoming);
		outFlow__exConvGateway____sourceRef.setSrc(outFlow);
		outFlow__exConvGateway____sourceRef.setTrg(exConvGateway);
		isApplicableMatch.getAllContextElements().add(
				outFlow__exConvGateway____sourceRef);
		exConvGateway__outFlow____outgoing.setSrc(exConvGateway);
		exConvGateway__outFlow____outgoing.setTrg(outFlow);
		isApplicableMatch.getAllContextElements().add(
				exConvGateway__outFlow____outgoing);
		inFlowToFlow__inFlow____source.setSrc(inFlowToFlow);
		inFlowToFlow__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__inFlow____source);
		inFlowToFlow__flow____target.setSrc(inFlowToFlow);
		inFlowToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				inFlowToFlow__flow____target);
		initFlow__normalStep____steps.setSrc(initFlow);
		initFlow__normalStep____steps.setTrg(normalStep);
		isApplicableMatch.getAllContextElements().add(
				initFlow__normalStep____steps);
		lane__exConvGateway____flowNodeRefs.setSrc(lane);
		lane__exConvGateway____flowNodeRefs.setTrg(exConvGateway);
		isApplicableMatch.getAllContextElements().add(
				lane__exConvGateway____flowNodeRefs);
		laneSet__lane____lanes.setSrc(laneSet);
		laneSet__lane____lanes.setTrg(lane);
		isApplicableMatch.getAllContextElements().add(laneSet__lane____lanes);
		inFlow__ice____sourceRef.setName(inFlow__ice____sourceRef_name_prime);
		ice__inFlow____outgoing.setName(ice__inFlow____outgoing_name_prime);
		process__eventGw____flowElements
				.setName(process__eventGw____flowElements_name_prime);
		process__divergeFlow____flowElements
				.setName(process__divergeFlow____flowElements_name_prime);
		process__ice____flowElements
				.setName(process__ice____flowElements_name_prime);
		divergeFlow__eventGw____sourceRef
				.setName(divergeFlow__eventGw____sourceRef_name_prime);
		eventGw__divergeFlow____outgoing
				.setName(eventGw__divergeFlow____outgoing_name_prime);
		divergeFlow__ice____targetRef
				.setName(divergeFlow__ice____targetRef_name_prime);
		ice__divergeFlow____incoming
				.setName(ice__divergeFlow____incoming_name_prime);
		normalStep__alt____stepAlternative
				.setName(normalStep__alt____stepAlternative_name_prime);
		eventGwToNormalStep__eventGw____source
				.setName(eventGwToNormalStep__eventGw____source_name_prime);
		eventGwToNormalStep__normalStep____target
				.setName(eventGwToNormalStep__normalStep____target_name_prime);
		alt__flow____ref.setName(alt__flow____ref_name_prime);
		divergeFlowToAlt__divergeFlow____source
				.setName(divergeFlowToAlt__divergeFlow____source_name_prime);
		divergeFlowToAlt__alt____target
				.setName(divergeFlowToAlt__alt____target_name_prime);
		iceToFlow__ice____source.setName(iceToFlow__ice____source_name_prime);
		iceToFlow__flow____target.setName(iceToFlow__flow____target_name_prime);
		process__outFlow____flowElements
				.setName(process__outFlow____flowElements_name_prime);
		process__laneSet____laneSets
				.setName(process__laneSet____laneSets_name_prime);
		process__inFlow____flowElements
				.setName(process__inFlow____flowElements_name_prime);
		process__exConvGateway____flowElements
				.setName(process__exConvGateway____flowElements_name_prime);
		inFlow__exConvGateway____targetRef
				.setName(inFlow__exConvGateway____targetRef_name_prime);
		exConvGateway__inFlow____incoming
				.setName(exConvGateway__inFlow____incoming_name_prime);
		outFlow__exConvGateway____sourceRef
				.setName(outFlow__exConvGateway____sourceRef_name_prime);
		exConvGateway__outFlow____outgoing
				.setName(exConvGateway__outFlow____outgoing_name_prime);
		inFlowToFlow__inFlow____source
				.setName(inFlowToFlow__inFlow____source_name_prime);
		inFlowToFlow__flow____target
				.setName(inFlowToFlow__flow____target_name_prime);
		initFlow__normalStep____steps
				.setName(initFlow__normalStep____steps_name_prime);
		lane__exConvGateway____flowNodeRefs
				.setName(lane__exConvGateway____flowNodeRefs_name_prime);
		laneSet__lane____lanes.setName(laneSet__lane____lanes_name_prime);
		return new Object[] { ice, inFlow, process, eventGw, divergeFlow,
				normalStep, eventGwToNormalStep, alt, divergeFlowToAlt, flow,
				iceToFlow, exConvGateway, outFlow, inFlowToFlow, initFlow,
				lane, laneSet, isApplicableMatch, inFlow__ice____sourceRef,
				ice__inFlow____outgoing, process__eventGw____flowElements,
				process__divergeFlow____flowElements,
				process__ice____flowElements,
				divergeFlow__eventGw____sourceRef,
				eventGw__divergeFlow____outgoing,
				divergeFlow__ice____targetRef, ice__divergeFlow____incoming,
				normalStep__alt____stepAlternative,
				eventGwToNormalStep__eventGw____source,
				eventGwToNormalStep__normalStep____target, alt__flow____ref,
				divergeFlowToAlt__divergeFlow____source,
				divergeFlowToAlt__alt____target, iceToFlow__ice____source,
				iceToFlow__flow____target, process__outFlow____flowElements,
				process__laneSet____laneSets, process__inFlow____flowElements,
				process__exConvGateway____flowElements,
				inFlow__exConvGateway____targetRef,
				exConvGateway__inFlow____incoming,
				outFlow__exConvGateway____sourceRef,
				exConvGateway__outFlow____outgoing,
				inFlowToFlow__inFlow____source, inFlowToFlow__flow____target,
				initFlow__normalStep____steps,
				lane__exConvGateway____flowNodeRefs, laneSet__lane____lanes };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_4_bindingFBBBBBBBBBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this,
			IsApplicableMatch isApplicableMatch, IntermediateCatchEvent ice,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventGw, SequenceFlow divergeFlow,
			NormalStep normalStep, FlowNodeToStep eventGwToNormalStep,
			AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, SequenceFlowToUCFlow inFlowToFlow,
			Flow initFlow, Lane lane, LaneSet laneSet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, ice, inFlow, process, eventGw, divergeFlow,
				normalStep, eventGwToNormalStep, alt, divergeFlowToAlt, flow,
				iceToFlow, exConvGateway, outFlow, inFlowToFlow, initFlow,
				lane, laneSet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ice, inFlow,
					process, eventGw, divergeFlow, normalStep,
					eventGwToNormalStep, alt, divergeFlowToAlt, flow,
					iceToFlow, exConvGateway, outFlow, inFlowToFlow, initFlow,
					lane, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this,
			IsApplicableMatch isApplicableMatch, IntermediateCatchEvent ice,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventGw, SequenceFlow divergeFlow,
			NormalStep normalStep, FlowNodeToStep eventGwToNormalStep,
			AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, SequenceFlowToUCFlow inFlowToFlow,
			Flow initFlow, Lane lane, LaneSet laneSet) {
		Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_4_binding = pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_4_bindingFBBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, ice, inFlow, process, eventGw,
				divergeFlow, normalStep, eventGwToNormalStep, alt,
				divergeFlowToAlt, flow, iceToFlow, exConvGateway, outFlow,
				inFlowToFlow, initFlow, lane, laneSet);
		if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_4_binding[0];

			Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_4_black = pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_4_blackB(csp);
			if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ice,
						inFlow, process, eventGw, divergeFlow, normalStep,
						eventGwToNormalStep, alt, divergeFlowToAlt, flow,
						iceToFlow, exConvGateway, outFlow, inFlowToFlow,
						initFlow, lane, laneSet };
			}
		}
		return null;
	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_5_expressionFBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ExConvGwAfterEventGwIceSeqFlowRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ExConvGwAfterEventGwIceSeqFlowRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_bindingFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_blackFBB(
			EClass __eClass, ExConvGwAfterEventGwIceSeqFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_bindingAndBlackFFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_binding = pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_bindingFB(_this);
		if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_binding[0];

			Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_black = pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_0BBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow divergeFlow, SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					SequenceFlow __DEC_exConvGateway_default_558199 = exConvGateway
							.getDefault();
					if (__DEC_exConvGateway_default_558199 != null) {
						if (!inFlow.equals(__DEC_exConvGateway_default_558199)) {
							if (!divergeFlow
									.equals(__DEC_exConvGateway_default_558199)) {
								if (!outFlow
										.equals(__DEC_exConvGateway_default_558199)) {
									return new Object[] { exConvGateway,
											inFlow, divergeFlow, outFlow };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_789908 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exConvGateway.equals(__DEC_outFlow_default_789908)) {
				return new Object[] { outFlow, exConvGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_5BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_6BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpOutFlow = _edge_flowElements.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (process.getFlowElements().contains(outFlow)) {
					FlowNode tmpExConvGateway = outFlow.getSourceRef();
					if (tmpExConvGateway instanceof ExclusiveGateway) {
						ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
						if (process.getFlowElements().contains(exConvGateway)) {
							if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_1BB(
									outFlow, exConvGateway) == null) {
								if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_4BB(
										exConvGateway, outFlow) == null) {
									if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_6BB(
											outFlow, exConvGateway) == null) {
										for (FlowElement tmpEventGw : process
												.getFlowElements()) {
											if (tmpEventGw instanceof EventBasedGateway) {
												EventBasedGateway eventGw = (EventBasedGateway) tmpEventGw;
												for (FlowElement tmpDivergeFlow : process
														.getFlowElements()) {
													if (tmpDivergeFlow instanceof SequenceFlow) {
														SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
														if (!divergeFlow
																.equals(outFlow)) {
															if (eventGw
																	.equals(divergeFlow
																			.getSourceRef())) {
																FlowNode tmpIce = divergeFlow
																		.getTargetRef();
																if (tmpIce instanceof IntermediateCatchEvent) {
																	IntermediateCatchEvent ice = (IntermediateCatchEvent) tmpIce;
																	if (process
																			.getFlowElements()
																			.contains(
																					ice)) {
																		if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_3BB(
																				exConvGateway,
																				divergeFlow) == null) {
																			if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_5BB(
																					divergeFlow,
																					exConvGateway) == null) {
																				for (LaneSet laneSet : process
																						.getLaneSets()) {
																					for (FlowElement tmpInFlow : process
																							.getFlowElements()) {
																						if (tmpInFlow instanceof SequenceFlow) {
																							SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
																							if (!inFlow
																									.equals(outFlow)) {
																								if (!divergeFlow
																										.equals(inFlow)) {
																									if (ice.equals(inFlow
																											.getSourceRef())) {
																										if (exConvGateway
																												.equals(inFlow
																														.getTargetRef())) {
																											if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_0BBBB(
																													exConvGateway,
																													inFlow,
																													divergeFlow,
																													outFlow) == null) {
																												if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_black_nac_2BB(
																														exConvGateway,
																														inFlow) == null) {
																													for (Lane lane : laneSet
																															.getLanes()) {
																														if (lane.getFlowNodeRefs()
																																.contains(
																																		exConvGateway)) {
																															_result.add(new Object[] {
																																	ice,
																																	inFlow,
																																	process,
																																	eventGw,
																																	divergeFlow,
																																	exConvGateway,
																																	outFlow,
																																	lane,
																																	laneSet,
																																	_edge_flowElements });
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}

															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_3_expressionFBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, ice, inFlow,
				process, eventGw, divergeFlow, exConvGateway, outFlow, lane,
				laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_4_expressionFBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExConvGwAfterEventGwIceSeqFlowRule_10_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_bindingFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_blackFBB(
			EClass __eClass, ExConvGwAfterEventGwIceSeqFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_bindingAndBlackFFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_binding = pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_bindingFB(_this);
		if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_binding[0];

			Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_black = pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_0BBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow divergeFlow, SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					SequenceFlow __DEC_exConvGateway_default_294500 = exConvGateway
							.getDefault();
					if (__DEC_exConvGateway_default_294500 != null) {
						if (!inFlow.equals(__DEC_exConvGateway_default_294500)) {
							if (!divergeFlow
									.equals(__DEC_exConvGateway_default_294500)) {
								if (!outFlow
										.equals(__DEC_exConvGateway_default_294500)) {
									return new Object[] { exConvGateway,
											inFlow, divergeFlow, outFlow };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_389593 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exConvGateway.equals(__DEC_outFlow_default_389593)) {
				return new Object[] { outFlow, exConvGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_5BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_6BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof bpmn2.Process) {
			bpmn2.Process process = (bpmn2.Process) tmpProcess;
			EObject tmpExConvGateway = _edge_flowElements.getTrg();
			if (tmpExConvGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
				if (process.getFlowElements().contains(exConvGateway)) {
					for (FlowElement tmpEventGw : process.getFlowElements()) {
						if (tmpEventGw instanceof EventBasedGateway) {
							EventBasedGateway eventGw = (EventBasedGateway) tmpEventGw;
							for (FlowElement tmpDivergeFlow : process
									.getFlowElements()) {
								if (tmpDivergeFlow instanceof SequenceFlow) {
									SequenceFlow divergeFlow = (SequenceFlow) tmpDivergeFlow;
									if (eventGw.equals(divergeFlow
											.getSourceRef())) {
										FlowNode tmpIce = divergeFlow
												.getTargetRef();
										if (tmpIce instanceof IntermediateCatchEvent) {
											IntermediateCatchEvent ice = (IntermediateCatchEvent) tmpIce;
											if (process.getFlowElements()
													.contains(ice)) {
												if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_3BB(
														exConvGateway,
														divergeFlow) == null) {
													if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_5BB(
															divergeFlow,
															exConvGateway) == null) {
														for (FlowElement tmpOutFlow : process
																.getFlowElements()) {
															if (tmpOutFlow instanceof SequenceFlow) {
																SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
																if (!divergeFlow
																		.equals(outFlow)) {
																	if (exConvGateway
																			.equals(outFlow
																					.getSourceRef())) {
																		if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_1BB(
																				outFlow,
																				exConvGateway) == null) {
																			if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_4BB(
																					exConvGateway,
																					outFlow) == null) {
																				if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_6BB(
																						outFlow,
																						exConvGateway) == null) {
																					for (LaneSet laneSet : process
																							.getLaneSets()) {
																						for (FlowElement tmpInFlow : process
																								.getFlowElements()) {
																							if (tmpInFlow instanceof SequenceFlow) {
																								SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
																								if (!inFlow
																										.equals(outFlow)) {
																									if (!divergeFlow
																											.equals(inFlow)) {
																										if (ice.equals(inFlow
																												.getSourceRef())) {
																											if (exConvGateway
																													.equals(inFlow
																															.getTargetRef())) {
																												if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_0BBBB(
																														exConvGateway,
																														inFlow,
																														divergeFlow,
																														outFlow) == null) {
																													if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_black_nac_2BB(
																															exConvGateway,
																															inFlow) == null) {
																														for (Lane lane : laneSet
																																.getLanes()) {
																															if (lane.getFlowNodeRefs()
																																	.contains(
																																			exConvGateway)) {
																																_result.add(new Object[] {
																																		ice,
																																		inFlow,
																																		process,
																																		eventGw,
																																		divergeFlow,
																																		exConvGateway,
																																		outFlow,
																																		lane,
																																		laneSet,
																																		_edge_flowElements });
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_3_expressionFBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, ice, inFlow,
				process, eventGw, divergeFlow, exConvGateway, outFlow, lane,
				laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_4_expressionFBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExConvGwAfterEventGwIceSeqFlowRule_11_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_bindingFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_blackFBB(
			EClass __eClass, ExConvGwAfterEventGwIceSeqFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_bindingAndBlackFFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_binding = pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_bindingFB(_this);
		if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_binding[0];

			Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_black = pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_0BBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow divergeFlow, SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					SequenceFlow __DEC_exConvGateway_default_829116 = exConvGateway
							.getDefault();
					if (__DEC_exConvGateway_default_829116 != null) {
						if (!inFlow.equals(__DEC_exConvGateway_default_829116)) {
							if (!divergeFlow
									.equals(__DEC_exConvGateway_default_829116)) {
								if (!outFlow
										.equals(__DEC_exConvGateway_default_829116)) {
									return new Object[] { exConvGateway,
											inFlow, divergeFlow, outFlow };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_374381 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exConvGateway.equals(__DEC_outFlow_default_374381)) {
				return new Object[] { outFlow, exConvGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_5BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_6BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpExConvGateway = _edge_targetRef.getTrg();
			if (tmpExConvGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
				if (exConvGateway.equals(inFlow.getTargetRef())) {
					FlowNode tmpIce = inFlow.getSourceRef();
					if (tmpIce instanceof IntermediateCatchEvent) {
						IntermediateCatchEvent ice = (IntermediateCatchEvent) tmpIce;
						if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_2BB(
								exConvGateway, inFlow) == null) {
							for (SequenceFlow outFlow : exConvGateway
									.getOutgoing()) {
								if (!inFlow.equals(outFlow)) {
									if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_1BB(
											outFlow, exConvGateway) == null) {
										if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_4BB(
												exConvGateway, outFlow) == null) {
											if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_6BB(
													outFlow, exConvGateway) == null) {
												for (SequenceFlow divergeFlow : ice
														.getIncoming()) {
													if (!divergeFlow
															.equals(inFlow)) {
														if (!divergeFlow
																.equals(outFlow)) {
															FlowNode tmpEventGw = divergeFlow
																	.getSourceRef();
															if (tmpEventGw instanceof EventBasedGateway) {
																EventBasedGateway eventGw = (EventBasedGateway) tmpEventGw;
																if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_0BBBB(
																		exConvGateway,
																		inFlow,
																		divergeFlow,
																		outFlow) == null) {
																	if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_3BB(
																			exConvGateway,
																			divergeFlow) == null) {
																		if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_black_nac_5BB(
																				divergeFlow,
																				exConvGateway) == null) {
																			for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							inFlow,
																							FlowElementsContainer.class,
																							"flowElements")) {
																				if (tmpProcess instanceof bpmn2.Process) {
																					bpmn2.Process process = (bpmn2.Process) tmpProcess;
																					if (process
																							.getFlowElements()
																							.contains(
																									eventGw)) {
																						if (process
																								.getFlowElements()
																								.contains(
																										divergeFlow)) {
																							if (process
																									.getFlowElements()
																									.contains(
																											ice)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												outFlow)) {
																									if (process
																											.getFlowElements()
																											.contains(
																													exConvGateway)) {
																										for (LaneSet laneSet : process
																												.getLaneSets()) {
																											for (Lane lane : laneSet
																													.getLanes()) {
																												if (lane.getFlowNodeRefs()
																														.contains(
																																exConvGateway)) {
																													_result.add(new Object[] {
																															ice,
																															inFlow,
																															process,
																															eventGw,
																															divergeFlow,
																															exConvGateway,
																															outFlow,
																															lane,
																															laneSet,
																															_edge_targetRef });
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}

														}
													}
												}
											}
										}
									}
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_3_expressionFBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, ice, inFlow,
				process, eventGw, divergeFlow, exConvGateway, outFlow, lane,
				laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_4_expressionFBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExConvGwAfterEventGwIceSeqFlowRule_12_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_bindingFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_blackFBB(
			EClass __eClass, ExConvGwAfterEventGwIceSeqFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_bindingAndBlackFFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_binding = pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_bindingFB(_this);
		if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_binding[0];

			Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_black = pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_0BBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow divergeFlow, SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					SequenceFlow __DEC_exConvGateway_default_650492 = exConvGateway
							.getDefault();
					if (__DEC_exConvGateway_default_650492 != null) {
						if (!inFlow.equals(__DEC_exConvGateway_default_650492)) {
							if (!divergeFlow
									.equals(__DEC_exConvGateway_default_650492)) {
								if (!outFlow
										.equals(__DEC_exConvGateway_default_650492)) {
									return new Object[] { exConvGateway,
											inFlow, divergeFlow, outFlow };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_379765 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exConvGateway.equals(__DEC_outFlow_default_379765)) {
				return new Object[] { outFlow, exConvGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_5BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_6BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExConvGateway = _edge_incoming.getSrc();
		if (tmpExConvGateway instanceof ExclusiveGateway) {
			ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (exConvGateway.equals(inFlow.getTargetRef())) {
					FlowNode tmpIce = inFlow.getSourceRef();
					if (tmpIce instanceof IntermediateCatchEvent) {
						IntermediateCatchEvent ice = (IntermediateCatchEvent) tmpIce;
						if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_2BB(
								exConvGateway, inFlow) == null) {
							for (SequenceFlow outFlow : exConvGateway
									.getOutgoing()) {
								if (!inFlow.equals(outFlow)) {
									if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_1BB(
											outFlow, exConvGateway) == null) {
										if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_4BB(
												exConvGateway, outFlow) == null) {
											if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_6BB(
													outFlow, exConvGateway) == null) {
												for (SequenceFlow divergeFlow : ice
														.getIncoming()) {
													if (!divergeFlow
															.equals(inFlow)) {
														if (!divergeFlow
																.equals(outFlow)) {
															FlowNode tmpEventGw = divergeFlow
																	.getSourceRef();
															if (tmpEventGw instanceof EventBasedGateway) {
																EventBasedGateway eventGw = (EventBasedGateway) tmpEventGw;
																if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_0BBBB(
																		exConvGateway,
																		inFlow,
																		divergeFlow,
																		outFlow) == null) {
																	if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_3BB(
																			exConvGateway,
																			divergeFlow) == null) {
																		if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_black_nac_5BB(
																				divergeFlow,
																				exConvGateway) == null) {
																			for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							exConvGateway,
																							FlowElementsContainer.class,
																							"flowElements")) {
																				if (tmpProcess instanceof bpmn2.Process) {
																					bpmn2.Process process = (bpmn2.Process) tmpProcess;
																					if (process
																							.getFlowElements()
																							.contains(
																									eventGw)) {
																						if (process
																								.getFlowElements()
																								.contains(
																										divergeFlow)) {
																							if (process
																									.getFlowElements()
																									.contains(
																											ice)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												outFlow)) {
																									if (process
																											.getFlowElements()
																											.contains(
																													inFlow)) {
																										for (LaneSet laneSet : process
																												.getLaneSets()) {
																											for (Lane lane : laneSet
																													.getLanes()) {
																												if (lane.getFlowNodeRefs()
																														.contains(
																																exConvGateway)) {
																													_result.add(new Object[] {
																															ice,
																															inFlow,
																															process,
																															eventGw,
																															divergeFlow,
																															exConvGateway,
																															outFlow,
																															lane,
																															laneSet,
																															_edge_incoming });
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}

														}
													}
												}
											}
										}
									}
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_3_expressionFBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, ice, inFlow,
				process, eventGw, divergeFlow, exConvGateway, outFlow, lane,
				laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_4_expressionFBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExConvGwAfterEventGwIceSeqFlowRule_13_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_bindingFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_blackFBB(
			EClass __eClass, ExConvGwAfterEventGwIceSeqFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_bindingAndBlackFFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_binding = pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_bindingFB(_this);
		if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_binding[0];

			Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_black = pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_0BBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow divergeFlow, SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					SequenceFlow __DEC_exConvGateway_default_872633 = exConvGateway
							.getDefault();
					if (__DEC_exConvGateway_default_872633 != null) {
						if (!inFlow.equals(__DEC_exConvGateway_default_872633)) {
							if (!divergeFlow
									.equals(__DEC_exConvGateway_default_872633)) {
								if (!outFlow
										.equals(__DEC_exConvGateway_default_872633)) {
									return new Object[] { exConvGateway,
											inFlow, divergeFlow, outFlow };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_751493 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exConvGateway.equals(__DEC_outFlow_default_751493)) {
				return new Object[] { outFlow, exConvGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_5BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_6BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOutFlow = _edge_sourceRef.getSrc();
		if (tmpOutFlow instanceof SequenceFlow) {
			SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
			EObject tmpExConvGateway = _edge_sourceRef.getTrg();
			if (tmpExConvGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
				if (exConvGateway.equals(outFlow.getSourceRef())) {
					if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_1BB(
							outFlow, exConvGateway) == null) {
						if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_4BB(
								exConvGateway, outFlow) == null) {
							if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_6BB(
									outFlow, exConvGateway) == null) {
								for (SequenceFlow inFlow : exConvGateway
										.getIncoming()) {
									if (!inFlow.equals(outFlow)) {
										FlowNode tmpIce = inFlow.getSourceRef();
										if (tmpIce instanceof IntermediateCatchEvent) {
											IntermediateCatchEvent ice = (IntermediateCatchEvent) tmpIce;
											if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_2BB(
													exConvGateway, inFlow) == null) {
												for (SequenceFlow divergeFlow : ice
														.getIncoming()) {
													if (!divergeFlow
															.equals(inFlow)) {
														if (!divergeFlow
																.equals(outFlow)) {
															FlowNode tmpEventGw = divergeFlow
																	.getSourceRef();
															if (tmpEventGw instanceof EventBasedGateway) {
																EventBasedGateway eventGw = (EventBasedGateway) tmpEventGw;
																if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_0BBBB(
																		exConvGateway,
																		inFlow,
																		divergeFlow,
																		outFlow) == null) {
																	if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_3BB(
																			exConvGateway,
																			divergeFlow) == null) {
																		if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_black_nac_5BB(
																				divergeFlow,
																				exConvGateway) == null) {
																			for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							outFlow,
																							FlowElementsContainer.class,
																							"flowElements")) {
																				if (tmpProcess instanceof bpmn2.Process) {
																					bpmn2.Process process = (bpmn2.Process) tmpProcess;
																					if (process
																							.getFlowElements()
																							.contains(
																									eventGw)) {
																						if (process
																								.getFlowElements()
																								.contains(
																										divergeFlow)) {
																							if (process
																									.getFlowElements()
																									.contains(
																											ice)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												inFlow)) {
																									if (process
																											.getFlowElements()
																											.contains(
																													exConvGateway)) {
																										for (LaneSet laneSet : process
																												.getLaneSets()) {
																											for (Lane lane : laneSet
																													.getLanes()) {
																												if (lane.getFlowNodeRefs()
																														.contains(
																																exConvGateway)) {
																													_result.add(new Object[] {
																															ice,
																															inFlow,
																															process,
																															eventGw,
																															divergeFlow,
																															exConvGateway,
																															outFlow,
																															lane,
																															laneSet,
																															_edge_sourceRef });
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}

														}
													}
												}
											}
										}

									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_3_expressionFBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, ice, inFlow,
				process, eventGw, divergeFlow, exConvGateway, outFlow, lane,
				laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_4_expressionFBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExConvGwAfterEventGwIceSeqFlowRule_14_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_bindingFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_blackFBB(
			EClass __eClass, ExConvGwAfterEventGwIceSeqFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_bindingAndBlackFFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_binding = pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_bindingFB(_this);
		if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_binding[0];

			Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_black = pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_0BBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow divergeFlow, SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					SequenceFlow __DEC_exConvGateway_default_734343 = exConvGateway
							.getDefault();
					if (__DEC_exConvGateway_default_734343 != null) {
						if (!inFlow.equals(__DEC_exConvGateway_default_734343)) {
							if (!divergeFlow
									.equals(__DEC_exConvGateway_default_734343)) {
								if (!outFlow
										.equals(__DEC_exConvGateway_default_734343)) {
									return new Object[] { exConvGateway,
											inFlow, divergeFlow, outFlow };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_209634 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exConvGateway.equals(__DEC_outFlow_default_209634)) {
				return new Object[] { outFlow, exConvGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_5BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_6BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExConvGateway = _edge_outgoing.getSrc();
		if (tmpExConvGateway instanceof ExclusiveGateway) {
			ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
			EObject tmpOutFlow = _edge_outgoing.getTrg();
			if (tmpOutFlow instanceof SequenceFlow) {
				SequenceFlow outFlow = (SequenceFlow) tmpOutFlow;
				if (exConvGateway.equals(outFlow.getSourceRef())) {
					if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_1BB(
							outFlow, exConvGateway) == null) {
						if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_4BB(
								exConvGateway, outFlow) == null) {
							if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_6BB(
									outFlow, exConvGateway) == null) {
								for (SequenceFlow inFlow : exConvGateway
										.getIncoming()) {
									if (!inFlow.equals(outFlow)) {
										FlowNode tmpIce = inFlow.getSourceRef();
										if (tmpIce instanceof IntermediateCatchEvent) {
											IntermediateCatchEvent ice = (IntermediateCatchEvent) tmpIce;
											if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_2BB(
													exConvGateway, inFlow) == null) {
												for (SequenceFlow divergeFlow : ice
														.getIncoming()) {
													if (!divergeFlow
															.equals(inFlow)) {
														if (!divergeFlow
																.equals(outFlow)) {
															FlowNode tmpEventGw = divergeFlow
																	.getSourceRef();
															if (tmpEventGw instanceof EventBasedGateway) {
																EventBasedGateway eventGw = (EventBasedGateway) tmpEventGw;
																if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_0BBBB(
																		exConvGateway,
																		inFlow,
																		divergeFlow,
																		outFlow) == null) {
																	if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_3BB(
																			exConvGateway,
																			divergeFlow) == null) {
																		if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_black_nac_5BB(
																				divergeFlow,
																				exConvGateway) == null) {
																			for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							exConvGateway,
																							FlowElementsContainer.class,
																							"flowElements")) {
																				if (tmpProcess instanceof bpmn2.Process) {
																					bpmn2.Process process = (bpmn2.Process) tmpProcess;
																					if (process
																							.getFlowElements()
																							.contains(
																									eventGw)) {
																						if (process
																								.getFlowElements()
																								.contains(
																										divergeFlow)) {
																							if (process
																									.getFlowElements()
																									.contains(
																											ice)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												outFlow)) {
																									if (process
																											.getFlowElements()
																											.contains(
																													inFlow)) {
																										for (LaneSet laneSet : process
																												.getLaneSets()) {
																											for (Lane lane : laneSet
																													.getLanes()) {
																												if (lane.getFlowNodeRefs()
																														.contains(
																																exConvGateway)) {
																													_result.add(new Object[] {
																															ice,
																															inFlow,
																															process,
																															eventGw,
																															divergeFlow,
																															exConvGateway,
																															outFlow,
																															lane,
																															laneSet,
																															_edge_outgoing });
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}

														}
													}
												}
											}
										}

									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_3_expressionFBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, ice, inFlow,
				process, eventGw, divergeFlow, exConvGateway, outFlow, lane,
				laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_4_expressionFBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExConvGwAfterEventGwIceSeqFlowRule_15_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_bindingFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_blackFBB(
			EClass __eClass, ExConvGwAfterEventGwIceSeqFlowRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_bindingAndBlackFFB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_binding = pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_bindingFB(_this);
		if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_binding[0];

			Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_black = pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_0BBBB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow,
			SequenceFlow divergeFlow, SequenceFlow outFlow) {
		if (!inFlow.equals(outFlow)) {
			if (!divergeFlow.equals(inFlow)) {
				if (!divergeFlow.equals(outFlow)) {
					SequenceFlow __DEC_exConvGateway_default_757528 = exConvGateway
							.getDefault();
					if (__DEC_exConvGateway_default_757528 != null) {
						if (!inFlow.equals(__DEC_exConvGateway_default_757528)) {
							if (!divergeFlow
									.equals(__DEC_exConvGateway_default_757528)) {
								if (!outFlow
										.equals(__DEC_exConvGateway_default_757528)) {
									return new Object[] { exConvGateway,
											inFlow, divergeFlow, outFlow };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_1BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		for (ExclusiveGateway __DEC_outFlow_default_462318 : org.moflon.util.eMoflonEMFUtil
				.getOppositeReferenceTyped(outFlow, ExclusiveGateway.class,
						"default")) {
			if (!exConvGateway.equals(__DEC_outFlow_default_462318)) {
				return new Object[] { outFlow, exConvGateway };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_2BB(
			ExclusiveGateway exConvGateway, SequenceFlow inFlow) {
		if (inFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_3BB(
			ExclusiveGateway exConvGateway, SequenceFlow divergeFlow) {
		if (divergeFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_4BB(
			ExclusiveGateway exConvGateway, SequenceFlow outFlow) {
		if (outFlow.equals(exConvGateway.getDefault())) {
			return new Object[] { exConvGateway, outFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_5BB(
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(divergeFlow.getTargetRef())) {
			return new Object[] { divergeFlow, exConvGateway };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_6BB(
			SequenceFlow outFlow, ExclusiveGateway exConvGateway) {
		if (exConvGateway.equals(outFlow.getTargetRef())) {
			return new Object[] { outFlow, exConvGateway };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_blackFFFFFFFFFB(
			EMoflonEdge _edge_flowNodeRefs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLane = _edge_flowNodeRefs.getSrc();
		if (tmpLane instanceof Lane) {
			Lane lane = (Lane) tmpLane;
			EObject tmpExConvGateway = _edge_flowNodeRefs.getTrg();
			if (tmpExConvGateway instanceof ExclusiveGateway) {
				ExclusiveGateway exConvGateway = (ExclusiveGateway) tmpExConvGateway;
				if (lane.getFlowNodeRefs().contains(exConvGateway)) {
					for (SequenceFlow inFlow : exConvGateway.getIncoming()) {
						FlowNode tmpIce = inFlow.getSourceRef();
						if (tmpIce instanceof IntermediateCatchEvent) {
							IntermediateCatchEvent ice = (IntermediateCatchEvent) tmpIce;
							if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_2BB(
									exConvGateway, inFlow) == null) {
								for (SequenceFlow outFlow : exConvGateway
										.getOutgoing()) {
									if (!inFlow.equals(outFlow)) {
										if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_1BB(
												outFlow, exConvGateway) == null) {
											if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_4BB(
													exConvGateway, outFlow) == null) {
												if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_6BB(
														outFlow, exConvGateway) == null) {
													for (SequenceFlow divergeFlow : ice
															.getIncoming()) {
														if (!divergeFlow
																.equals(inFlow)) {
															if (!divergeFlow
																	.equals(outFlow)) {
																FlowNode tmpEventGw = divergeFlow
																		.getSourceRef();
																if (tmpEventGw instanceof EventBasedGateway) {
																	EventBasedGateway eventGw = (EventBasedGateway) tmpEventGw;
																	if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_0BBBB(
																			exConvGateway,
																			inFlow,
																			divergeFlow,
																			outFlow) == null) {
																		if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_3BB(
																				exConvGateway,
																				divergeFlow) == null) {
																			if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_black_nac_5BB(
																					divergeFlow,
																					exConvGateway) == null) {
																				for (LaneSet laneSet : org.moflon.util.eMoflonEMFUtil
																						.getOppositeReferenceTyped(
																								lane,
																								LaneSet.class,
																								"lanes")) {
																					for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									exConvGateway,
																									FlowElementsContainer.class,
																									"flowElements")) {
																						if (tmpProcess instanceof bpmn2.Process) {
																							bpmn2.Process process = (bpmn2.Process) tmpProcess;
																							if (process
																									.getFlowElements()
																									.contains(
																											eventGw)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												divergeFlow)) {
																									if (process
																											.getFlowElements()
																											.contains(
																													ice)) {
																										if (process
																												.getFlowElements()
																												.contains(
																														outFlow)) {
																											if (process
																													.getLaneSets()
																													.contains(
																															laneSet)) {
																												if (process
																														.getFlowElements()
																														.contains(
																																inFlow)) {
																													_result.add(new Object[] {
																															ice,
																															inFlow,
																															process,
																															eventGw,
																															divergeFlow,
																															exConvGateway,
																															outFlow,
																															lane,
																															laneSet,
																															_edge_flowNodeRefs });
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}

															}
														}
													}
												}
											}
										}
									}
								}
							}
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_3_expressionFBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match,
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, ExclusiveGateway exConvGateway,
			SequenceFlow outFlow, Lane lane, LaneSet laneSet) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, ice, inFlow,
				process, eventGw, divergeFlow, exConvGateway, outFlow, lane,
				laneSet);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_4_expressionFBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ExConvGwAfterEventGwIceSeqFlowRule_16_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_1_blackB(
			ExConvGwAfterEventGwIceSeqFlowRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, IntermediateCatchEvent ice) {
		if (ruleResult.getSourceObjects().contains(ice)) {
			return new Object[] { ruleResult, ice };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, bpmn2.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, EventBasedGateway eventGw) {
		if (ruleResult.getSourceObjects().contains(eventGw)) {
			return new Object[] { ruleResult, eventGw };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult,
			FlowNodeToStep eventGwToNormalStep) {
		if (ruleResult.getCorrObjects().contains(eventGwToNormalStep)) {
			return new Object[] { ruleResult, eventGwToNormalStep };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, NormalStep normalStep) {
		if (ruleResult.getTargetObjects().contains(normalStep)) {
			return new Object[] { ruleResult, normalStep };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, AlternativeFlowAlternative alt) {
		if (ruleResult.getTargetObjects().contains(alt)) {
			return new Object[] { ruleResult, alt };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, AlternativeFlow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, ICEToAltFlow iceToFlow) {
		if (ruleResult.getCorrObjects().contains(iceToFlow)) {
			return new Object[] { ruleResult, iceToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult,
			SequenceFlowToUCFlow inFlowToFlow) {
		if (ruleResult.getCorrObjects().contains(inFlowToFlow)) {
			return new Object[] { ruleResult, inFlowToFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult,
			SeqFlowToAltFlowAlt divergeFlowToAlt) {
		if (ruleResult.getCorrObjects().contains(divergeFlowToAlt)) {
			return new Object[] { ruleResult, divergeFlowToAlt };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_11BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow divergeFlow) {
		if (ruleResult.getSourceObjects().contains(divergeFlow)) {
			return new Object[] { ruleResult, divergeFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_12BB(
			ModelgeneratorRuleResult ruleResult, Flow initFlow) {
		if (ruleResult.getTargetObjects().contains(initFlow)) {
			return new Object[] { ruleResult, initFlow };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_13BB(
			ModelgeneratorRuleResult ruleResult, LaneSet laneSet) {
		if (ruleResult.getSourceObjects().contains(laneSet)) {
			return new Object[] { ruleResult, laneSet };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_14BB(
			ModelgeneratorRuleResult ruleResult, Lane lane) {
		if (ruleResult.getSourceObjects().contains(lane)) {
			return new Object[] { ruleResult, lane };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_blackFFFFFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eventGwToNormalStepList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpEventGwToNormalStep : eventGwToNormalStepList
					.getEntryObjects()) {
				if (tmpEventGwToNormalStep instanceof FlowNodeToStep) {
					FlowNodeToStep eventGwToNormalStep = (FlowNodeToStep) tmpEventGwToNormalStep;
					FlowNode tmpEventGw = eventGwToNormalStep.getSource();
					if (tmpEventGw instanceof EventBasedGateway) {
						EventBasedGateway eventGw = (EventBasedGateway) tmpEventGw;
						Step tmpNormalStep = eventGwToNormalStep.getTarget();
						if (tmpNormalStep instanceof NormalStep) {
							NormalStep normalStep = (NormalStep) tmpNormalStep;
							if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_4BB(
									ruleResult, eventGwToNormalStep) == null) {
								if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_3BB(
										ruleResult, eventGw) == null) {
									if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_5BB(
											ruleResult, normalStep) == null) {
										for (SequenceFlow divergeFlow : eventGw
												.getOutgoing()) {
											FlowNode tmpIce = divergeFlow
													.getTargetRef();
											if (tmpIce instanceof IntermediateCatchEvent) {
												IntermediateCatchEvent ice = (IntermediateCatchEvent) tmpIce;
												if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_11BB(
														ruleResult, divergeFlow) == null) {
													if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_0BB(
															ruleResult, ice) == null) {
														for (StepAlternative tmpAlt : normalStep
																.getStepAlternative()) {
															if (tmpAlt instanceof AlternativeFlowAlternative) {
																AlternativeFlowAlternative alt = (AlternativeFlowAlternative) tmpAlt;
																NamedFlow tmpFlow = alt
																		.getRef();
																if (tmpFlow instanceof AlternativeFlow) {
																	AlternativeFlow flow = (AlternativeFlow) tmpFlow;
																	if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_6BB(
																			ruleResult,
																			alt) == null) {
																		if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_7BB(
																				ruleResult,
																				flow) == null) {
																			for (SequenceFlow inFlow : ice
																					.getOutgoing()) {
																				if (!divergeFlow
																						.equals(inFlow)) {
																					if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_1BB(
																							ruleResult,
																							inFlow) == null) {
																						for (FlowElementsContainer tmpProcess : org.moflon.util.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										eventGw,
																										FlowElementsContainer.class,
																										"flowElements")) {
																							if (tmpProcess instanceof bpmn2.Process) {
																								bpmn2.Process process = (bpmn2.Process) tmpProcess;
																								if (process
																										.getFlowElements()
																										.contains(
																												inFlow)) {
																									if (process
																											.getFlowElements()
																											.contains(
																													divergeFlow)) {
																										if (process
																												.getFlowElements()
																												.contains(
																														ice)) {
																											if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_2BB(
																													ruleResult,
																													process) == null) {
																												for (LaneSet laneSet : process
																														.getLaneSets()) {
																													if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_13BB(
																															ruleResult,
																															laneSet) == null) {
																														for (Lane lane : laneSet
																																.getLanes()) {
																															if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_14BB(
																																	ruleResult,
																																	lane) == null) {
																																for (Flow initFlow : org.moflon.util.eMoflonEMFUtil
																																		.getOppositeReferenceTyped(
																																				normalStep,
																																				Flow.class,
																																				"steps")) {
																																	if (!flow
																																			.equals(initFlow)) {
																																		if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_12BB(
																																				ruleResult,
																																				initFlow) == null) {
																																			for (SeqFlowToAltFlowAlt divergeFlowToAlt : org.moflon.util.eMoflonEMFUtil
																																					.getOppositeReferenceTyped(
																																							divergeFlow,
																																							SeqFlowToAltFlowAlt.class,
																																							"source")) {
																																				if (alt.equals(divergeFlowToAlt
																																						.getTarget())) {
																																					if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_10BB(
																																							ruleResult,
																																							divergeFlowToAlt) == null) {
																																						for (ICEToAltFlow iceToFlow : org.moflon.util.eMoflonEMFUtil
																																								.getOppositeReferenceTyped(
																																										ice,
																																										ICEToAltFlow.class,
																																										"source")) {
																																							if (flow.equals(iceToFlow
																																									.getTarget())) {
																																								if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_8BB(
																																										ruleResult,
																																										iceToFlow) == null) {
																																									for (SequenceFlowToUCFlow inFlowToFlow : org.moflon.util.eMoflonEMFUtil
																																											.getOppositeReferenceTyped(
																																													flow,
																																													SequenceFlowToUCFlow.class,
																																													"target")) {
																																										if (inFlow
																																												.equals(inFlowToFlow
																																														.getSource())) {
																																											if (pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_2_black_nac_9BB(
																																													ruleResult,
																																													inFlowToFlow) == null) {
																																												_result.add(new Object[] {
																																														eventGwToNormalStepList,
																																														ice,
																																														inFlow,
																																														process,
																																														eventGw,
																																														eventGwToNormalStep,
																																														normalStep,
																																														alt,
																																														flow,
																																														iceToFlow,
																																														inFlowToFlow,
																																														divergeFlowToAlt,
																																														divergeFlow,
																																														initFlow,
																																														laneSet,
																																														lane,
																																														ruleEntryContainer,
																																														ruleResult });
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}

															}
														}
													}
												}
											}

										}
									}
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_3_bindingFBBBBBBBBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this,
			IsApplicableMatch isApplicableMatch, IntermediateCatchEvent ice,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventGw, SequenceFlow divergeFlow,
			NormalStep normalStep, FlowNodeToStep eventGwToNormalStep,
			AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, SequenceFlowToUCFlow inFlowToFlow,
			Flow initFlow, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, ice, inFlow, process, eventGw, divergeFlow,
				normalStep, eventGwToNormalStep, alt, divergeFlowToAlt, flow,
				iceToFlow, inFlowToFlow, initFlow, lane, laneSet, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ice, inFlow,
					process, eventGw, divergeFlow, normalStep,
					eventGwToNormalStep, alt, divergeFlowToAlt, flow,
					iceToFlow, inFlowToFlow, initFlow, lane, laneSet,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_3_bindingAndBlackFBBBBBBBBBBBBBBBBBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this,
			IsApplicableMatch isApplicableMatch, IntermediateCatchEvent ice,
			SequenceFlow inFlow, bpmn2.Process process,
			EventBasedGateway eventGw, SequenceFlow divergeFlow,
			NormalStep normalStep, FlowNodeToStep eventGwToNormalStep,
			AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, SequenceFlowToUCFlow inFlowToFlow,
			Flow initFlow, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_3_binding = pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_3_bindingFBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, ice, inFlow, process, eventGw,
				divergeFlow, normalStep, eventGwToNormalStep, alt,
				divergeFlowToAlt, flow, iceToFlow, inFlowToFlow, initFlow,
				lane, laneSet, ruleResult);
		if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_3_binding != null) {
			CSP csp = (CSP) result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_3_binding[0];

			Object[] result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_3_black = pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_3_blackB(csp);
			if (result_pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ice,
						inFlow, process, eventGw, divergeFlow, normalStep,
						eventGwToNormalStep, alt, divergeFlowToAlt, flow,
						iceToFlow, inFlowToFlow, initFlow, lane, laneSet,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_4_expressionFBB(
			ExConvGwAfterEventGwIceSeqFlowRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_5_blackBBBBBBBBBBBBBBB(
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, NormalStep normalStep,
			FlowNodeToStep eventGwToNormalStep, AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, SequenceFlowToUCFlow inFlowToFlow,
			Flow initFlow, Lane lane, LaneSet laneSet) {
		if (!divergeFlow.equals(inFlow)) {
			if (!flow.equals(initFlow)) {
				return new Object[] { ice, inFlow, process, eventGw,
						divergeFlow, normalStep, eventGwToNormalStep, alt,
						divergeFlowToAlt, flow, iceToFlow, inFlowToFlow,
						initFlow, lane, laneSet };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_6_blackBBBBBBBBBBBBBBBB(
			IntermediateCatchEvent ice, SequenceFlow inFlow,
			bpmn2.Process process, EventBasedGateway eventGw,
			SequenceFlow divergeFlow, NormalStep normalStep,
			FlowNodeToStep eventGwToNormalStep, AlternativeFlowAlternative alt,
			SeqFlowToAltFlowAlt divergeFlowToAlt, AlternativeFlow flow,
			ICEToAltFlow iceToFlow, SequenceFlowToUCFlow inFlowToFlow,
			Flow initFlow, Lane lane, LaneSet laneSet,
			ModelgeneratorRuleResult ruleResult) {
		if (!divergeFlow.equals(inFlow)) {
			if (!flow.equals(initFlow)) {
				return new Object[] { ice, inFlow, process, eventGw,
						divergeFlow, normalStep, eventGwToNormalStep, alt,
						divergeFlowToAlt, flow, iceToFlow, inFlowToFlow,
						initFlow, lane, laneSet, ruleResult };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_6_greenBBBFFFBFFBBB(
			SequenceFlow inFlow, bpmn2.Process process, NormalStep normalStep,
			Flow initFlow, Lane lane, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		ExclusiveGateway exConvGateway = Bpmn2Factory.eINSTANCE
				.createExclusiveGateway();
		SequenceFlow outFlow = Bpmn2Factory.eINSTANCE.createSequenceFlow();
		FlowNodeToStep ecgwToStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createFlowNodeToStep();
		SequenceFlowToUCFlow outFlowToInitFlow = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToUCFlow();
		SequenceFlowToStep outFlowToNormalStep = BpmnToUseCaseIntegrationFactory.eINSTANCE
				.createSequenceFlowToStep();
		Object _localVariable_0 = csp.getValue("exConvGateway",
				"gatewayDirection");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(exConvGateway);
		inFlow.setTargetRef(exConvGateway);
		lane.getFlowNodeRefs().add(exConvGateway);
		ruleResult.getSourceObjects().add(exConvGateway);
		process.getFlowElements().add(outFlow);
		outFlow.setSourceRef(exConvGateway);
		ruleResult.getSourceObjects().add(outFlow);
		ecgwToStep.setSource(exConvGateway);
		ecgwToStep.setTarget(normalStep);
		ruleResult.getCorrObjects().add(ecgwToStep);
		outFlowToInitFlow.setSource(outFlow);
		outFlowToInitFlow.setTarget(initFlow);
		ruleResult.getCorrObjects().add(outFlowToInitFlow);
		outFlowToNormalStep.setSource(outFlow);
		outFlowToNormalStep.setTarget(normalStep);
		ruleResult.getCorrObjects().add(outFlowToNormalStep);
		GatewayDirection exConvGateway_gatewayDirection_prime = (GatewayDirection) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		exConvGateway.setGatewayDirection(exConvGateway_gatewayDirection_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { inFlow, process, normalStep, exConvGateway,
				outFlow, ecgwToStep, initFlow, outFlowToInitFlow,
				outFlowToNormalStep, lane, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ExConvGwAfterEventGwIceSeqFlowRule_18_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExConvGwAfterEventGwIceSeqFlowRuleImpl
