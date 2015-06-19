/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionFragment;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.Message;
import ModalSequenceDiagram.MessageEnd;
import ModalSequenceDiagram.MessageKind;
import ModalSequenceDiagram.MessageOccurrenceSpecification;
import ModalSequenceDiagram.MessageSort;
import ModalSequenceDiagram.ModalSequenceDiagramFactory;

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

import UseCaseDSL.Actor;
import UseCaseDSL.BasicFlow;
import UseCaseDSL.Flow;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.StepType;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLFactory;

import UseCaseToModalSequenceDiagramIntegration.ActorToLifeline;
import UseCaseToModalSequenceDiagramIntegration.FlowToInteractionFragment;

import UseCaseToModalSequenceDiagramIntegration.Rules.RulesPackage;
import UseCaseToModalSequenceDiagramIntegration.Rules.UserStepBFMessageRule;

import UseCaseToModalSequenceDiagramIntegration.UseCaseToInteraction;

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
 * An implementation of the model object '<em><b>User Step BF Message Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UserStepBFMessageRuleImpl extends AbstractRuleImpl implements
		UserStepBFMessageRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserStepBFMessageRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUserStepBFMessageRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Actor actor, Actor sysActor,
			PackageDeclaration packageDeclaration, BasicFlow flow,
			NormalStep step, UseCase useCase) {
		// initial bindings
		Object[] result1_black = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_0_1_blackBBBBBBBB(this, match,
						actor, sysActor, packageDeclaration, flow, step,
						useCase);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = "
							+ this
							+ ", "
							+ "[match] = "
							+ match
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[sysActor] = "
							+ sysActor
							+ ", "
							+ "[packageDeclaration] = "
							+ packageDeclaration
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[useCase] = "
							+ useCase + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_0_2_bindingAndBlackFBBBBBBBB(
						this, match, actor, sysActor, packageDeclaration, flow,
						step, useCase);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = "
							+ this
							+ ", "
							+ "[match] = "
							+ match
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[sysActor] = "
							+ sysActor
							+ ", "
							+ "[packageDeclaration] = "
							+ packageDeclaration
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[useCase] = "
							+ useCase + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_0_4_blackBBBBBBB(match,
							actor, sysActor, packageDeclaration, flow, step,
							useCase);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[actor] = " + actor + ", " + "[sysActor] = "
								+ sysActor + ", " + "[packageDeclaration] = "
								+ packageDeclaration + ", " + "[flow] = "
								+ flow + ", " + "[step] = " + step + ", "
								+ "[useCase] = " + useCase + ".");
			}
			UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_0_4_greenBBBBFF(match,
							actor, flow, step);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[4];
			// EMoflonEdge step__actor____actor = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_0_5_blackBBBBBBB(match,
							actor, sysActor, packageDeclaration, flow, step,
							useCase);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[actor] = " + actor + ", " + "[sysActor] = "
								+ sysActor + ", " + "[packageDeclaration] = "
								+ packageDeclaration + ", " + "[flow] = "
								+ flow + ", " + "[step] = " + step + ", "
								+ "[useCase] = " + useCase + ".");
			}
			UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_0_5_greenBBBBBBFFFF(match,
							actor, sysActor, packageDeclaration, flow, useCase);
			// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result5_green[6];
			// EMoflonEdge packageDeclaration__sysActor____actors = (EMoflonEdge) result5_green[7];
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[8];
			// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result5_green[9];

			// register objects to match
			UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_0_6_expressionBBBBBBBB(this,
							match, actor, sysActor, packageDeclaration, flow,
							step, useCase);
			return UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_0_7_expressionF();
		} else {
			return UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_1_1_bindingAndBlackFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		Actor sysActor = (Actor) result1_bindingAndBlack[1];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[2];
		Lifeline sysLine = (Lifeline) result1_bindingAndBlack[3];
		ActorToLifeline sysActorToSysLine = (ActorToLifeline) result1_bindingAndBlack[4];
		Interaction interaction = (Interaction) result1_bindingAndBlack[5];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[6];
		FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result1_bindingAndBlack[7];
		NormalStep step = (NormalStep) result1_bindingAndBlack[8];
		Lifeline line = (Lifeline) result1_bindingAndBlack[9];
		UseCase useCase = (UseCase) result1_bindingAndBlack[10];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[11];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[12];
		CSP csp = (CSP) result1_bindingAndBlack[13];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_1_1_greenBFBFFBB(sysLine,
						interaction, line, csp);
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_green[1];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_green[3];
		Message message = (Message) result1_green[4];

		// collect translated elements
		Object[] result2_black = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_1_2_blackBBBB(messageSend,
						messageReceive, step, message);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[messageSend] = " + messageSend
							+ ", " + "[messageReceive] = " + messageReceive
							+ ", " + "[step] = " + step + ", " + "[message] = "
							+ message + ".");
		}
		Object[] result2_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_1_2_greenFBBBB(messageSend,
						messageReceive, step, message);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_1_3_blackBBBBBBBBBBBBBBBBB(
						ruleresult, actor, sysActor, packageDeclaration,
						sysLine, sysActorToSysLine, messageSend, interaction,
						messageReceive, flow, flowToInteraction, step, message,
						line, useCase, useCaseToInteraction, actorToLine);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[sysActor] = "
							+ sysActor
							+ ", "
							+ "[packageDeclaration] = "
							+ packageDeclaration
							+ ", "
							+ "[sysLine] = "
							+ sysLine
							+ ", "
							+ "[sysActorToSysLine] = "
							+ sysActorToSysLine
							+ ", "
							+ "[messageSend] = "
							+ messageSend
							+ ", "
							+ "[interaction] = "
							+ interaction
							+ ", "
							+ "[messageReceive] = "
							+ messageReceive
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[flowToInteraction] = "
							+ flowToInteraction
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[message] = "
							+ message
							+ ", "
							+ "[line] = "
							+ line
							+ ", "
							+ "[useCase] = "
							+ useCase
							+ ", "
							+ "[useCaseToInteraction] = "
							+ useCaseToInteraction
							+ ", "
							+ "[actorToLine] = "
							+ actorToLine + ".");
		}
		UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_1_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
						ruleresult, actor, sysLine, messageSend, interaction,
						messageReceive, flow, step, message, line);
		// EMoflonEdge sysLine__messageSend____coveredBy = (EMoflonEdge) result3_green[10];
		// EMoflonEdge messageSend__sysLine____covered = (EMoflonEdge) result3_green[11];
		// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result3_green[12];
		// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result3_green[13];
		// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[14];
		// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[15];
		// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[16];
		// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[17];
		// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[18];
		// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[19];
		// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result3_green[20];
		// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result3_green[21];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[22];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[23];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[24];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[25];

		// perform postprocessing story node is empty
		// register objects
		UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_1_5_expressionBBBBBBBBBBBBBBBBBB(
						this, ruleresult, actor, sysActor, packageDeclaration,
						sysLine, sysActorToSysLine, messageSend, interaction,
						messageReceive, flow, flowToInteraction, step, message,
						line, useCase, useCaseToInteraction, actorToLine);
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_2_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		Actor actor = (Actor) result2_binding[0];
		Actor sysActor = (Actor) result2_binding[1];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result2_binding[2];
		BasicFlow flow = (BasicFlow) result2_binding[3];
		NormalStep step = (NormalStep) result2_binding[4];
		UseCase useCase = (UseCase) result2_binding[5];
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_2_2_blackBBBFFFBFBFBFFB(actor,
						sysActor, packageDeclaration, flow, step, useCase,
						match)) {
			Lifeline sysLine = (Lifeline) result2_black[3];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result2_black[4];
			Interaction interaction = (Interaction) result2_black[5];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result2_black[7];
			Lifeline line = (Lifeline) result2_black[9];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[11];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[12];
			// ForEach find context
			for (Object[] result3_black : UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_2_3_blackBBBBBBBBBBBBB(
							actor, sysActor, packageDeclaration, sysLine,
							sysActorToSysLine, interaction, flow,
							flowToInteraction, step, line, useCase,
							useCaseToInteraction, actorToLine)) {
				Object[] result3_green = UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_2_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
								actor, sysActor, packageDeclaration, sysLine,
								sysActorToSysLine, interaction, flow,
								flowToInteraction, step, line, useCase,
								useCaseToInteraction, actorToLine);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[13];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[14];
				// EMoflonEdge packageDeclaration__sysActor____actors = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sysActorToSysLine__sysActor____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sysActorToSysLine__sysLine____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge flowToInteraction__flow____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge flowToInteraction__interaction____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[20];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[21];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[22];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[25];
				// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[26];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[27];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[28];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[29];

				// solve CSP
				Object[] result4_bindingAndBlack = UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBB(
								this, isApplicableMatch, actor, sysActor,
								packageDeclaration, sysLine, sysActorToSysLine,
								interaction, flow, flowToInteraction, step,
								line, useCase, useCaseToInteraction,
								actorToLine);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[actor] = "
									+ actor
									+ ", "
									+ "[sysActor] = "
									+ sysActor
									+ ", "
									+ "[packageDeclaration] = "
									+ packageDeclaration
									+ ", "
									+ "[sysLine] = "
									+ sysLine
									+ ", "
									+ "[sysActorToSysLine] = "
									+ sysActorToSysLine
									+ ", "
									+ "[interaction] = "
									+ interaction
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[flowToInteraction] = "
									+ flowToInteraction
									+ ", "
									+ "[step] = "
									+ step
									+ ", "
									+ "[line] = "
									+ line
									+ ", "
									+ "[useCase] = "
									+ useCase
									+ ", "
									+ "[useCaseToInteraction] = "
									+ useCaseToInteraction
									+ ", "
									+ "[actorToLine] = " + actorToLine + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_2_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_2_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_2_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Actor actor,
			Actor sysActor, PackageDeclaration packageDeclaration,
			BasicFlow flow, NormalStep step, UseCase useCase) {
		match.registerObject("actor", actor);
		match.registerObject("sysActor", sysActor);
		match.registerObject("packageDeclaration", packageDeclaration);
		match.registerObject("flow", flow);
		match.registerObject("step", step);
		match.registerObject("useCase", useCase);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Actor actor,
			Actor sysActor, PackageDeclaration packageDeclaration,
			BasicFlow flow, NormalStep step, UseCase useCase) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("person");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("system");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal2", true, csp);
		literal2.setValue("PERFORM");
		literal2.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");
		Variable var_sysActor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"sysActor.type", true, csp);
		var_sysActor_type.setValue(sysActor.getType());
		var_sysActor_type.setType("UseCaseDSL.ActorType");
		Variable var_step_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.type", true, csp);
		var_step_type.setValue(step.getType());
		var_step_type.setType("UseCaseDSL.StepType");

		// Create unbound variables

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		EqActorType eqActorType_0 = new EqActorType();
		EqStepType eqStepType = new EqStepType();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqActorType_0);
		csp.getConstraints().add(eqStepType);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqActorType_0.setRuleName("");
		eqActorType_0.solve(var_sysActor_type, literal1);
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal2);
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
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, NormalStep step,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ASYNCH_CALL");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("COMPLETE");
		literal1.setType("");

		// Create attribute variables
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", true, csp);
		var_step_name.setValue(step.getName());
		var_step_name.setType("String");
		Variable var_step_label = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.label", true, csp);
		var_step_label.setValue(step.getLabel());
		var_step_label.setType("String");

		// Create unbound variables
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", csp);
		var_message_messageSort.setType("ModalSequenceDiagram.MessageSort");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", csp);
		var_message_messageKind.setType("ModalSequenceDiagram.MessageKind");
		Variable var_message__id = CSPFactoryHelper.eINSTANCE.createVariable(
				"message._id", csp);
		var_message__id.setType("String");
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("String");

		// Create constraints
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal0);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal1);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message__id);
		eq_0.setRuleName("");
		eq_0.solve(var_step_label, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
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
			EObject actor, EObject sysActor, EObject packageDeclaration,
			EObject sysLine, EObject sysActorToSysLine, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject step, EObject message,
			EObject line, EObject useCase, EObject useCaseToInteraction,
			EObject actorToLine) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("sysActor", sysActor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("sysLine", sysLine);
		ruleresult.registerObject("sysActorToSysLine", sysActorToSysLine);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("actorToLine", actorToLine);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("step").eClass()
				.equals(UseCaseDSL.UseCaseDSLPackage.eINSTANCE.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		// initial bindings
		Object[] result1_black = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_10_1_blackBBBBBBBB(this, match,
						sysLine, messageSend, interaction, messageReceive,
						message, line);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = "
							+ this
							+ ", "
							+ "[match] = "
							+ match
							+ ", "
							+ "[sysLine] = "
							+ sysLine
							+ ", "
							+ "[messageSend] = "
							+ messageSend
							+ ", "
							+ "[interaction] = "
							+ interaction
							+ ", "
							+ "[messageReceive] = "
							+ messageReceive
							+ ", "
							+ "[message] = "
							+ message
							+ ", "
							+ "[line] = "
							+ line + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_10_2_bindingAndBlackFBBBBBBBB(
						this, match, sysLine, messageSend, interaction,
						messageReceive, message, line);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = "
							+ this
							+ ", "
							+ "[match] = "
							+ match
							+ ", "
							+ "[sysLine] = "
							+ sysLine
							+ ", "
							+ "[messageSend] = "
							+ messageSend
							+ ", "
							+ "[interaction] = "
							+ interaction
							+ ", "
							+ "[messageReceive] = "
							+ messageReceive
							+ ", "
							+ "[message] = "
							+ message
							+ ", "
							+ "[line] = "
							+ line + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_10_4_blackBBBBBBB(match,
							sysLine, messageSend, interaction, messageReceive,
							message, line);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[sysLine] = " + sysLine + ", "
								+ "[messageSend] = " + messageSend + ", "
								+ "[interaction] = " + interaction + ", "
								+ "[messageReceive] = " + messageReceive + ", "
								+ "[message] = " + message + ", " + "[line] = "
								+ line + ".");
			}
			UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_10_4_greenBBBBBBBFFFFFFFFFFFFFF(
							match, sysLine, messageSend, interaction,
							messageReceive, message, line);
			// EMoflonEdge sysLine__messageSend____coveredBy = (EMoflonEdge) result4_green[7];
			// EMoflonEdge messageSend__sysLine____covered = (EMoflonEdge) result4_green[8];
			// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result4_green[9];
			// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result4_green[10];
			// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result4_green[11];
			// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result4_green[12];
			// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result4_green[13];
			// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result4_green[14];
			// EMoflonEdge messageSend__message____message = (EMoflonEdge) result4_green[15];
			// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result4_green[16];
			// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result4_green[17];
			// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result4_green[18];
			// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result4_green[19];
			// EMoflonEdge interaction__message____message = (EMoflonEdge) result4_green[20];

			// collect context elements
			Object[] result5_black = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_10_5_blackBBBBBBB(match,
							sysLine, messageSend, interaction, messageReceive,
							message, line);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[sysLine] = " + sysLine + ", "
								+ "[messageSend] = " + messageSend + ", "
								+ "[interaction] = " + interaction + ", "
								+ "[messageReceive] = " + messageReceive + ", "
								+ "[message] = " + message + ", " + "[line] = "
								+ line + ".");
			}
			UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_10_5_greenBBBBFF(match,
							sysLine, interaction, line);
			// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result5_green[4];
			// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result5_green[5];

			// register objects to match
			UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_10_6_expressionBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line);
			return UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_10_7_expressionF();
		} else {
			return UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_11_1_bindingAndBlackFFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		Actor actor = (Actor) result1_bindingAndBlack[0];
		Actor sysActor = (Actor) result1_bindingAndBlack[1];
		PackageDeclaration packageDeclaration = (PackageDeclaration) result1_bindingAndBlack[2];
		Lifeline sysLine = (Lifeline) result1_bindingAndBlack[3];
		ActorToLifeline sysActorToSysLine = (ActorToLifeline) result1_bindingAndBlack[4];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result1_bindingAndBlack[5];
		Interaction interaction = (Interaction) result1_bindingAndBlack[6];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result1_bindingAndBlack[7];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[8];
		FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result1_bindingAndBlack[9];
		Message message = (Message) result1_bindingAndBlack[10];
		Lifeline line = (Lifeline) result1_bindingAndBlack[11];
		UseCase useCase = (UseCase) result1_bindingAndBlack[12];
		UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result1_bindingAndBlack[13];
		ActorToLifeline actorToLine = (ActorToLifeline) result1_bindingAndBlack[14];
		CSP csp = (CSP) result1_bindingAndBlack[15];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_11_1_greenBBFB(actor, flow, csp);
		NormalStep step = (NormalStep) result1_green[2];

		// collect translated elements
		Object[] result2_black = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_11_2_blackBBBB(messageSend,
						messageReceive, step, message);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[messageSend] = " + messageSend
							+ ", " + "[messageReceive] = " + messageReceive
							+ ", " + "[step] = " + step + ", " + "[message] = "
							+ message + ".");
		}
		Object[] result2_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_11_2_greenFBBBB(messageSend,
						messageReceive, step, message);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_11_3_blackBBBBBBBBBBBBBBBBB(
						ruleresult, actor, sysActor, packageDeclaration,
						sysLine, sysActorToSysLine, messageSend, interaction,
						messageReceive, flow, flowToInteraction, step, message,
						line, useCase, useCaseToInteraction, actorToLine);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[actor] = "
							+ actor
							+ ", "
							+ "[sysActor] = "
							+ sysActor
							+ ", "
							+ "[packageDeclaration] = "
							+ packageDeclaration
							+ ", "
							+ "[sysLine] = "
							+ sysLine
							+ ", "
							+ "[sysActorToSysLine] = "
							+ sysActorToSysLine
							+ ", "
							+ "[messageSend] = "
							+ messageSend
							+ ", "
							+ "[interaction] = "
							+ interaction
							+ ", "
							+ "[messageReceive] = "
							+ messageReceive
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[flowToInteraction] = "
							+ flowToInteraction
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[message] = "
							+ message
							+ ", "
							+ "[line] = "
							+ line
							+ ", "
							+ "[useCase] = "
							+ useCase
							+ ", "
							+ "[useCaseToInteraction] = "
							+ useCaseToInteraction
							+ ", "
							+ "[actorToLine] = "
							+ actorToLine + ".");
		}
		UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_11_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
						ruleresult, actor, sysLine, messageSend, interaction,
						messageReceive, flow, step, message, line);
		// EMoflonEdge sysLine__messageSend____coveredBy = (EMoflonEdge) result3_green[10];
		// EMoflonEdge messageSend__sysLine____covered = (EMoflonEdge) result3_green[11];
		// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result3_green[12];
		// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result3_green[13];
		// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[14];
		// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[15];
		// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[16];
		// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[17];
		// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[18];
		// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[19];
		// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result3_green[20];
		// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result3_green[21];
		// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[22];
		// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[23];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[24];
		// EMoflonEdge step__actor____actor = (EMoflonEdge) result3_green[25];

		// perform postprocessing story node is empty
		// register objects
		UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_11_5_expressionBBBBBBBBBBBBBBBBBB(
						this, ruleresult, actor, sysActor, packageDeclaration,
						sysLine, sysActorToSysLine, messageSend, interaction,
						messageReceive, flow, flowToInteraction, step, message,
						line, useCase, useCaseToInteraction, actorToLine);
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_12_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		Lifeline sysLine = (Lifeline) result2_binding[0];
		MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_binding[1];
		Interaction interaction = (Interaction) result2_binding[2];
		MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_binding[3];
		Message message = (Message) result2_binding[4];
		Lifeline line = (Lifeline) result2_binding[5];
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_12_2_blackFFBFBBBFFBBFFFB(
						sysLine, messageSend, interaction, messageReceive,
						message, line, match)) {
			Actor actor = (Actor) result2_black[0];
			Actor sysActor = (Actor) result2_black[1];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result2_black[3];
			BasicFlow flow = (BasicFlow) result2_black[7];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result2_black[8];
			UseCase useCase = (UseCase) result2_black[11];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[12];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[13];
			// ForEach find context
			for (Object[] result3_black : UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_12_3_blackBBFBBBBBBBBBBBB(
							actor, sysActor, sysLine, sysActorToSysLine,
							messageSend, interaction, messageReceive, flow,
							flowToInteraction, message, line, useCase,
							useCaseToInteraction, actorToLine)) {
				PackageDeclaration packageDeclaration = (PackageDeclaration) result3_black[2];
				Object[] result3_green = UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_12_3_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
								actor, sysActor, packageDeclaration, sysLine,
								sysActorToSysLine, messageSend, interaction,
								messageReceive, flow, flowToInteraction,
								message, line, useCase, useCaseToInteraction,
								actorToLine);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[15];
				// EMoflonEdge packageDeclaration__actor____actors = (EMoflonEdge) result3_green[16];
				// EMoflonEdge packageDeclaration__sysActor____actors = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sysLine__messageSend____coveredBy = (EMoflonEdge) result3_green[18];
				// EMoflonEdge messageSend__sysLine____covered = (EMoflonEdge) result3_green[19];
				// EMoflonEdge sysActorToSysLine__sysActor____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge sysActorToSysLine__sysLine____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge messageSend__interaction____enclosingInteraction = (EMoflonEdge) result3_green[22];
				// EMoflonEdge interaction__messageSend____fragment = (EMoflonEdge) result3_green[23];
				// EMoflonEdge messageReceive__interaction____enclosingInteraction = (EMoflonEdge) result3_green[24];
				// EMoflonEdge interaction__messageReceive____fragment = (EMoflonEdge) result3_green[25];
				// EMoflonEdge flowToInteraction__flow____source = (EMoflonEdge) result3_green[26];
				// EMoflonEdge flowToInteraction__interaction____target = (EMoflonEdge) result3_green[27];
				// EMoflonEdge message__messageSend____sendEvent = (EMoflonEdge) result3_green[28];
				// EMoflonEdge message__messageReceive____receiveEvent = (EMoflonEdge) result3_green[29];
				// EMoflonEdge messageSend__message____message = (EMoflonEdge) result3_green[30];
				// EMoflonEdge messageReceive__message____message = (EMoflonEdge) result3_green[31];
				// EMoflonEdge line__messageReceive____coveredBy = (EMoflonEdge) result3_green[32];
				// EMoflonEdge messageReceive__line____covered = (EMoflonEdge) result3_green[33];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[34];
				// EMoflonEdge line__interaction____interaction = (EMoflonEdge) result3_green[35];
				// EMoflonEdge interaction__line____lifeline = (EMoflonEdge) result3_green[36];
				// EMoflonEdge message__interaction____interaction = (EMoflonEdge) result3_green[37];
				// EMoflonEdge interaction__message____message = (EMoflonEdge) result3_green[38];
				// EMoflonEdge useCaseToInteraction__useCase____source = (EMoflonEdge) result3_green[39];
				// EMoflonEdge useCaseToInteraction__interaction____target = (EMoflonEdge) result3_green[40];
				// EMoflonEdge actorToLine__actor____source = (EMoflonEdge) result3_green[41];
				// EMoflonEdge actorToLine__line____target = (EMoflonEdge) result3_green[42];
				// EMoflonEdge packageDeclaration__useCase____useCases = (EMoflonEdge) result3_green[43];

				// solve CSP
				Object[] result4_bindingAndBlack = UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, actor, sysActor,
								packageDeclaration, sysLine, sysActorToSysLine,
								messageSend, interaction, messageReceive, flow,
								flowToInteraction, message, line, useCase,
								useCaseToInteraction, actorToLine);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[actor] = "
									+ actor
									+ ", "
									+ "[sysActor] = "
									+ sysActor
									+ ", "
									+ "[packageDeclaration] = "
									+ packageDeclaration
									+ ", "
									+ "[sysLine] = "
									+ sysLine
									+ ", "
									+ "[sysActorToSysLine] = "
									+ sysActorToSysLine
									+ ", "
									+ "[messageSend] = "
									+ messageSend
									+ ", "
									+ "[interaction] = "
									+ interaction
									+ ", "
									+ "[messageReceive] = "
									+ messageReceive
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[flowToInteraction] = "
									+ flowToInteraction
									+ ", "
									+ "[message] = "
									+ message
									+ ", "
									+ "[line] = "
									+ line
									+ ", "
									+ "[useCase] = "
									+ useCase
									+ ", "
									+ "[useCaseToInteraction] = "
									+ useCaseToInteraction
									+ ", "
									+ "[actorToLine] = " + actorToLine + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		match.registerObject("sysLine", sysLine);
		match.registerObject("messageSend", messageSend);
		match.registerObject("interaction", interaction);
		match.registerObject("messageReceive", messageReceive);
		match.registerObject("message", message);
		match.registerObject("line", line);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("ASYNCH_CALL");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("COMPLETE");
		literal1.setType("");

		// Create attribute variables
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", true, csp);
		var_message_messageSort.setValue(message.getMessageSort());
		var_message_messageSort.setType("ModalSequenceDiagram.MessageSort");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", true, csp);
		var_message_messageKind.setValue(message.getMessageKind());
		var_message_messageKind.setType("ModalSequenceDiagram.MessageKind");

		// Create unbound variables

		// Create constraints
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();

		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);

		// Solve CSP
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal0);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal1);
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
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("person");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("system");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal2", true, csp);
		literal2.setValue("PERFORM");
		literal2.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");
		Variable var_sysActor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"sysActor.type", true, csp);
		var_sysActor_type.setValue(sysActor.getType());
		var_sysActor_type.setType("UseCaseDSL.ActorType");
		Variable var_message__id = CSPFactoryHelper.eINSTANCE.createVariable(
				"message._id", true, csp);
		var_message__id.setValue(message.get_id());
		var_message__id.setType("String");
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", true, csp);
		var_message_name.setValue(message.getName());
		var_message_name.setType("String");

		// Create unbound variables
		Variable var_step_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.type", csp);
		var_step_type.setType("UseCaseDSL.StepType");
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", csp);
		var_step_name.setType("String");
		Variable var_step_label = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.label", csp);
		var_step_label.setType("String");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		EqActorType eqActorType_0 = new EqActorType();
		EqStepType eqStepType = new EqStepType();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqActorType_0);
		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqActorType_0.setRuleName("");
		eqActorType_0.solve(var_sysActor_type, literal1);
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal2);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message__id);
		eq_0.setRuleName("");
		eq_0.solve(var_step_label, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("messageSend", messageSend);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("messageReceive", messageReceive);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("message", message);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
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
			EObject actor, EObject sysActor, EObject packageDeclaration,
			EObject sysLine, EObject sysActorToSysLine, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject step, EObject message,
			EObject line, EObject useCase, EObject useCaseToInteraction,
			EObject actorToLine) {
		ruleresult.registerObject("actor", actor);
		ruleresult.registerObject("sysActor", sysActor);
		ruleresult.registerObject("packageDeclaration", packageDeclaration);
		ruleresult.registerObject("sysLine", sysLine);
		ruleresult.registerObject("sysActorToSysLine", sysActorToSysLine);
		ruleresult.registerObject("messageSend", messageSend);
		ruleresult.registerObject("interaction", interaction);
		ruleresult.registerObject("messageReceive", messageReceive);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("flowToInteraction", flowToInteraction);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("message", message);
		ruleresult.registerObject("line", line);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("useCaseToInteraction", useCaseToInteraction);
		ruleresult.registerObject("actorToLine", actorToLine);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("messageSend")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
				&& match.getObject("messageReceive")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessageOccurrenceSpecification())
				&& match.getObject("message")
						.eClass()
						.equals(ModalSequenceDiagram.ModalSequenceDiagramPackage.eINSTANCE
								.getMessage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_921(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_20_2_blackFFFFFFB(_edge_coveredBy)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_20_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_922(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_21_2_blackFFFFFFB(_edge_covered)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_21_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_923(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_22_2_blackFFFFFFB(_edge_enclosingInteraction)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_22_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_22_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_22_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_924(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_23_2_blackFFFFFFB(_edge_fragment)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_23_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_23_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_23_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_925(
			EMoflonEdge _edge_enclosingInteraction) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_24_2_blackFFFFFFB(_edge_enclosingInteraction)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_24_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_24_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_24_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_24_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_926(
			EMoflonEdge _edge_fragment) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_25_2_blackFFFFFFB(_edge_fragment)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_25_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_25_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_25_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_25_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_927(
			EMoflonEdge _edge_sendEvent) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_26_2_blackFFFFFFB(_edge_sendEvent)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_26_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_26_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_26_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_26_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_928(
			EMoflonEdge _edge_receiveEvent) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_27_2_blackFFFFFFB(_edge_receiveEvent)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_27_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_27_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_27_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_27_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_929(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_28_2_blackFFFFFFB(_edge_message)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_28_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_28_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_28_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_28_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_930(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_29_2_blackFFFFFFB(_edge_message)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_29_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_29_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_29_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_29_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_931(
			EMoflonEdge _edge_coveredBy) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_30_2_blackFFFFFFB(_edge_coveredBy)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_30_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_30_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_30_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_30_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_932(
			EMoflonEdge _edge_covered) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_31_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_31_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_31_2_blackFFFFFFB(_edge_covered)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_31_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_31_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_31_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_31_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_31_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_31_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_933(
			EMoflonEdge _edge_interaction) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_32_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_32_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_32_2_blackFFFFFFB(_edge_interaction)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_32_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_32_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_32_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_32_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_32_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_32_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_934(
			EMoflonEdge _edge_message) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_33_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_33_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_33_2_blackFFFFFFB(_edge_message)) {
			Lifeline sysLine = (Lifeline) result2_black[0];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result2_black[1];
			Interaction interaction = (Interaction) result2_black[2];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result2_black[3];
			Message message = (Message) result2_black[4];
			Lifeline line = (Lifeline) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_33_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_33_3_expressionFBBBBBBBB(
							this, match, sysLine, messageSend, interaction,
							messageReceive, message, line)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_33_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_33_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_33_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_33_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_443(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_34_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_34_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_34_2_blackFFFFFFB(_edge_steps)) {
			Actor actor = (Actor) result2_black[0];
			Actor sysActor = (Actor) result2_black[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[2];
			BasicFlow flow = (BasicFlow) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			UseCase useCase = (UseCase) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_34_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_34_3_expressionFBBBBBBBB(
							this, match, actor, sysActor, packageDeclaration,
							flow, step, useCase)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_34_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_34_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_34_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_34_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_444(
			EMoflonEdge _edge_actor) {
		// prepare return value
		Object[] result1_bindingAndBlack = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_35_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_35_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_35_2_blackFFFFFFB(_edge_actor)) {
			Actor actor = (Actor) result2_black[0];
			Actor sysActor = (Actor) result2_black[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[2];
			BasicFlow flow = (BasicFlow) result2_black[3];
			NormalStep step = (NormalStep) result2_black[4];
			UseCase useCase = (UseCase) result2_black[5];
			Object[] result2_green = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_35_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_35_3_expressionFBBBBBBBB(
							this, match, actor, sysActor, packageDeclaration,
							flow, step, useCase)) {
				// Ensure that the correct types of elements are matched
				if (UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_35_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_35_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_35_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_35_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_FWD(TripleMatch tripleMatch) {
		throw new UnsupportedOperationException(
				"developments on attribute synchronization with eMoflon not yet completed");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_BWD(TripleMatch tripleMatch) {
		throw new UnsupportedOperationException(
				"developments on attribute synchronization with eMoflon not yet completed");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer,
			ActorToLifeline sysActorToSysLineParameter) {
		// create result
		Object[] result1_black = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_38_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_38_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_38_2_blackFFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList sysActorToSysLineList = (RuleEntryList) result2_black[0];
			Actor actor = (Actor) result2_black[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result2_black[2];
			Actor sysActor = (Actor) result2_black[3];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result2_black[4];
			Lifeline sysLine = (Lifeline) result2_black[5];
			UseCase useCase = (UseCase) result2_black[6];
			BasicFlow flow = (BasicFlow) result2_black[7];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result2_black[8];
			Interaction interaction = (Interaction) result2_black[9];
			Lifeline line = (Lifeline) result2_black[10];
			ActorToLifeline actorToLine = (ActorToLifeline) result2_black[11];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result2_black[12];

			// solve CSP
			Object[] result3_bindingAndBlack = UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_38_3_bindingAndBlackFBBBBBBBBBBBBBBB(
							this, isApplicableMatch, actor, sysActor,
							packageDeclaration, sysLine, sysActorToSysLine,
							interaction, flow, flowToInteraction, line,
							useCase, useCaseToInteraction, actorToLine,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = "
								+ this
								+ ", "
								+ "[isApplicableMatch] = "
								+ isApplicableMatch
								+ ", "
								+ "[actor] = "
								+ actor
								+ ", "
								+ "[sysActor] = "
								+ sysActor
								+ ", "
								+ "[packageDeclaration] = "
								+ packageDeclaration
								+ ", "
								+ "[sysLine] = "
								+ sysLine
								+ ", "
								+ "[sysActorToSysLine] = "
								+ sysActorToSysLine
								+ ", "
								+ "[interaction] = "
								+ interaction
								+ ", "
								+ "[flow] = "
								+ flow
								+ ", "
								+ "[flowToInteraction] = "
								+ flowToInteraction
								+ ", "
								+ "[line] = "
								+ line
								+ ", "
								+ "[useCase] = "
								+ useCase
								+ ", "
								+ "[useCaseToInteraction] = "
								+ useCaseToInteraction
								+ ", "
								+ "[actorToLine] = "
								+ actorToLine
								+ ", "
								+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (UserStepBFMessageRuleImpl
					.pattern_UserStepBFMessageRule_38_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = UserStepBFMessageRuleImpl
						.pattern_UserStepBFMessageRule_38_5_blackBBBBBBBBBBBB(
								actor, sysActor, packageDeclaration, sysLine,
								sysActorToSysLine, interaction, flow,
								flowToInteraction, line, useCase,
								useCaseToInteraction, actorToLine);
				if (result5_black != null) {

					// perform
					Object[] result6_black = UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_38_6_blackBBBBBBBBBBBBB(
									actor, sysActor, packageDeclaration,
									sysLine, sysActorToSysLine, interaction,
									flow, flowToInteraction, line, useCase,
									useCaseToInteraction, actorToLine,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[actor] = "
										+ actor
										+ ", "
										+ "[sysActor] = "
										+ sysActor
										+ ", "
										+ "[packageDeclaration] = "
										+ packageDeclaration
										+ ", "
										+ "[sysLine] = "
										+ sysLine
										+ ", "
										+ "[sysActorToSysLine] = "
										+ sysActorToSysLine
										+ ", "
										+ "[interaction] = "
										+ interaction
										+ ", "
										+ "[flow] = "
										+ flow
										+ ", "
										+ "[flowToInteraction] = "
										+ flowToInteraction
										+ ", "
										+ "[line] = "
										+ line
										+ ", "
										+ "[useCase] = "
										+ useCase
										+ ", "
										+ "[useCaseToInteraction] = "
										+ useCaseToInteraction
										+ ", "
										+ "[actorToLine] = "
										+ actorToLine
										+ ", "
										+ "[ruleResult] = "
										+ ruleResult
										+ ".");
					}
					UserStepBFMessageRuleImpl
							.pattern_UserStepBFMessageRule_38_6_greenBBFBFBFFBBB(
									actor, sysLine, interaction, flow, line,
									ruleResult, csp);
					// MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result6_green[2];
					// MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result6_green[4];
					// NormalStep step = (NormalStep) result6_green[6];
					// Message message = (Message) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return UserStepBFMessageRuleImpl
				.pattern_UserStepBFMessageRule_38_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal0", true, csp);
		literal0.setValue("person");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal1", true, csp);
		literal1.setValue("system");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal2", true, csp);
		literal2.setValue("PERFORM");
		literal2.setType("");
		Variable literal3 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal3", true, csp);
		literal3.setValue("ASYNCH_CALL");
		literal3.setType("");
		Variable literal4 = CSPFactoryHelper.eINSTANCE.createVariable(
				"literal4", true, csp);
		literal4.setValue("COMPLETE");
		literal4.setType("");

		// Create attribute variables
		Variable var_actor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"actor.type", true, csp);
		var_actor_type.setValue(actor.getType());
		var_actor_type.setType("UseCaseDSL.ActorType");
		Variable var_sysActor_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"sysActor.type", true, csp);
		var_sysActor_type.setValue(sysActor.getType());
		var_sysActor_type.setType("UseCaseDSL.ActorType");

		// Create unbound variables
		Variable var_step_type = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.type", csp);
		var_step_type.setType("UseCaseDSL.StepType");
		Variable var_message_messageSort = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageSort", csp);
		var_message_messageSort.setType("ModalSequenceDiagram.MessageSort");
		Variable var_message_messageKind = CSPFactoryHelper.eINSTANCE
				.createVariable("message.messageKind", csp);
		var_message_messageKind.setType("ModalSequenceDiagram.MessageKind");
		Variable var_step_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.name", csp);
		var_step_name.setType("String");
		Variable var_message__id = CSPFactoryHelper.eINSTANCE.createVariable(
				"message._id", csp);
		var_message__id.setType("String");
		Variable var_step_label = CSPFactoryHelper.eINSTANCE.createVariable(
				"step.label", csp);
		var_step_label.setType("String");
		Variable var_message_name = CSPFactoryHelper.eINSTANCE.createVariable(
				"message.name", csp);
		var_message_name.setType("String");

		// Create constraints
		EqActorType eqActorType = new EqActorType();
		EqActorType eqActorType_0 = new EqActorType();
		EqStepType eqStepType = new EqStepType();
		EqMessageSort eqMessageSort = new EqMessageSort();
		EqMessageKind eqMessageKind = new EqMessageKind();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eqActorType);
		csp.getConstraints().add(eqActorType_0);
		csp.getConstraints().add(eqStepType);
		csp.getConstraints().add(eqMessageSort);
		csp.getConstraints().add(eqMessageKind);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eqActorType.setRuleName("");
		eqActorType.solve(var_actor_type, literal0);
		eqActorType_0.setRuleName("");
		eqActorType_0.solve(var_sysActor_type, literal1);
		eqStepType.setRuleName("");
		eqStepType.solve(var_step_type, literal2);
		eqMessageSort.setRuleName("");
		eqMessageSort.solve(var_message_messageSort, literal3);
		eqMessageKind.setRuleName("");
		eqMessageKind.solve(var_message_messageKind, literal4);
		eq.setRuleName("");
		eq.solve(var_step_name, var_message__id);
		eq_0.setRuleName("");
		eq_0.solve(var_step_label, var_message_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("actor", actor);
		isApplicableMatch.registerObject("sysActor", sysActor);
		isApplicableMatch.registerObject("packageDeclaration",
				packageDeclaration);
		isApplicableMatch.registerObject("sysLine", sysLine);
		isApplicableMatch
				.registerObject("sysActorToSysLine", sysActorToSysLine);
		isApplicableMatch.registerObject("interaction", interaction);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch
				.registerObject("flowToInteraction", flowToInteraction);
		isApplicableMatch.registerObject("line", line);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("useCaseToInteraction",
				useCaseToInteraction);
		isApplicableMatch.registerObject("actorToLine", actorToLine);
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
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD__MATCH_ACTOR_ACTOR_PACKAGEDECLARATION_BASICFLOW_NORMALSTEP_USECASE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(BasicFlow) arguments.get(4),
					(NormalStep) arguments.get(5), (UseCase) arguments.get(6));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ACTOR_ACTOR_PACKAGEDECLARATION_BASICFLOW_NORMALSTEP_USECASE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(BasicFlow) arguments.get(4),
					(NormalStep) arguments.get(5), (UseCase) arguments.get(6));
			return null;
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ACTOR_ACTOR_PACKAGEDECLARATION_BASICFLOW_NORMALSTEP_USECASE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Actor) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(BasicFlow) arguments.get(4),
					(NormalStep) arguments.get(5), (UseCase) arguments.get(6));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ACTOR_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_NORMALSTEP_LIFELINE_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(Interaction) arguments.get(6),
					(BasicFlow) arguments.get(7),
					(FlowToInteractionFragment) arguments.get(8),
					(NormalStep) arguments.get(9),
					(Lifeline) arguments.get(10), (UseCase) arguments.get(11),
					(UseCaseToInteraction) arguments.get(12),
					(ActorToLifeline) arguments.get(13));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Message) arguments.get(5), (Lifeline) arguments.get(6));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Message) arguments.get(5), (Lifeline) arguments.get(6));
			return null;
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_LIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_MESSAGE_LIFELINE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Lifeline) arguments.get(1),
					(MessageOccurrenceSpecification) arguments.get(2),
					(Interaction) arguments.get(3),
					(MessageOccurrenceSpecification) arguments.get(4),
					(Message) arguments.get(5), (Lifeline) arguments.get(6));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_MESSAGEOCCURRENCESPECIFICATION_INTERACTION_MESSAGEOCCURRENCESPECIFICATION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_MESSAGE_LIFELINE_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(MessageOccurrenceSpecification) arguments.get(6),
					(Interaction) arguments.get(7),
					(MessageOccurrenceSpecification) arguments.get(8),
					(BasicFlow) arguments.get(9),
					(FlowToInteractionFragment) arguments.get(10),
					(Message) arguments.get(11), (Lifeline) arguments.get(12),
					(UseCase) arguments.get(13),
					(UseCaseToInteraction) arguments.get(14),
					(ActorToLifeline) arguments.get(15));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12),
					(EObject) arguments.get(13), (EObject) arguments.get(14),
					(EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_921__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_921((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_922__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_922((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_923__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_923((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_924__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_924((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_925__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_925((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_926__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_926((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_927__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_927((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_928__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_928((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_929__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_929((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_930__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_930((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_931__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_931((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_932__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_932((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_933__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_933((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_934__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_934((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_443__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_443((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_444__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_444((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_ACTORTOLIFELINE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(ActorToLifeline) arguments.get(1));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ACTOR_ACTOR_PACKAGEDECLARATION_LIFELINE_ACTORTOLIFELINE_INTERACTION_BASICFLOW_FLOWTOINTERACTIONFRAGMENT_LIFELINE_USECASE_USECASETOINTERACTION_ACTORTOLIFELINE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Actor) arguments.get(1), (Actor) arguments.get(2),
					(PackageDeclaration) arguments.get(3),
					(Lifeline) arguments.get(4),
					(ActorToLifeline) arguments.get(5),
					(Interaction) arguments.get(6),
					(BasicFlow) arguments.get(7),
					(FlowToInteractionFragment) arguments.get(8),
					(Lifeline) arguments.get(9), (UseCase) arguments.get(10),
					(UseCaseToInteraction) arguments.get(11),
					(ActorToLifeline) arguments.get(12),
					(ModelgeneratorRuleResult) arguments.get(13));
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UserStepBFMessageRule_0_1_blackBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Actor actor,
			Actor sysActor, PackageDeclaration packageDeclaration,
			BasicFlow flow, NormalStep step, UseCase useCase) {
		if (!actor.equals(sysActor)) {
			return new Object[] { _this, match, actor, sysActor,
					packageDeclaration, flow, step, useCase };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_0_2_bindingFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Actor actor,
			Actor sysActor, PackageDeclaration packageDeclaration,
			BasicFlow flow, NormalStep step, UseCase useCase) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, actor,
				sysActor, packageDeclaration, flow, step, useCase);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, actor, sysActor,
					packageDeclaration, flow, step, useCase };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_0_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserStepBFMessageRule_0_2_bindingAndBlackFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Actor actor,
			Actor sysActor, PackageDeclaration packageDeclaration,
			BasicFlow flow, NormalStep step, UseCase useCase) {
		Object[] result_pattern_UserStepBFMessageRule_0_2_binding = pattern_UserStepBFMessageRule_0_2_bindingFBBBBBBBB(
				_this, match, actor, sysActor, packageDeclaration, flow, step,
				useCase);
		if (result_pattern_UserStepBFMessageRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_UserStepBFMessageRule_0_2_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_0_2_black = pattern_UserStepBFMessageRule_0_2_blackB(csp);
			if (result_pattern_UserStepBFMessageRule_0_2_black != null) {

				return new Object[] { csp, _this, match, actor, sysActor,
						packageDeclaration, flow, step, useCase };
			}
		}
		return null;
	}

	public static final boolean pattern_UserStepBFMessageRule_0_3_expressionFBB(
			UserStepBFMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_0_4_blackBBBBBBB(
			Match match, Actor actor, Actor sysActor,
			PackageDeclaration packageDeclaration, BasicFlow flow,
			NormalStep step, UseCase useCase) {
		if (!actor.equals(sysActor)) {
			return new Object[] { match, actor, sysActor, packageDeclaration,
					flow, step, useCase };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_0_4_greenBBBBFF(
			Match match, Actor actor, BasicFlow flow, NormalStep step) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		match.getToBeTranslatedEdges().add(step__actor____actor);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		return new Object[] { match, actor, flow, step, flow__step____steps,
				step__actor____actor };
	}

	public static final Object[] pattern_UserStepBFMessageRule_0_5_blackBBBBBBB(
			Match match, Actor actor, Actor sysActor,
			PackageDeclaration packageDeclaration, BasicFlow flow,
			NormalStep step, UseCase useCase) {
		if (!actor.equals(sysActor)) {
			return new Object[] { match, actor, sysActor, packageDeclaration,
					flow, step, useCase };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_0_5_greenBBBBBBFFFF(
			Match match, Actor actor, Actor sysActor,
			PackageDeclaration packageDeclaration, BasicFlow flow,
			UseCase useCase) {
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__sysActor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(actor);
		match.getContextNodes().add(sysActor);
		match.getContextNodes().add(packageDeclaration);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(useCase);
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__sysActor____actors_name_prime = "actors";
		String useCase__flow____flows_name_prime = "flows";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		match.getContextEdges().add(packageDeclaration__actor____actors);
		packageDeclaration__sysActor____actors.setSrc(packageDeclaration);
		packageDeclaration__sysActor____actors.setTrg(sysActor);
		match.getContextEdges().add(packageDeclaration__sysActor____actors);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		match.getContextEdges().add(packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__sysActor____actors
				.setName(packageDeclaration__sysActor____actors_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { match, actor, sysActor, packageDeclaration, flow,
				useCase, packageDeclaration__actor____actors,
				packageDeclaration__sysActor____actors, useCase__flow____flows,
				packageDeclaration__useCase____useCases };
	}

	public static final void pattern_UserStepBFMessageRule_0_6_expressionBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Actor actor,
			Actor sysActor, PackageDeclaration packageDeclaration,
			BasicFlow flow, NormalStep step, UseCase useCase) {
		_this.registerObjectsToMatch_FWD(match, actor, sysActor,
				packageDeclaration, flow, step, useCase);

	}

	public static final boolean pattern_UserStepBFMessageRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_1_1_bindingFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch.getObject("sysActor");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("sysLine");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("sysActorToSysLine");
		EObject _localVariable_5 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_6 = isApplicableMatch.getObject("flow");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("flowToInteraction");
		EObject _localVariable_8 = isApplicableMatch.getObject("step");
		EObject _localVariable_9 = isApplicableMatch.getObject("line");
		EObject _localVariable_10 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_11 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_12 = isApplicableMatch.getObject("actorToLine");
		EObject tmpActor = _localVariable_0;
		EObject tmpSysActor = _localVariable_1;
		EObject tmpPackageDeclaration = _localVariable_2;
		EObject tmpSysLine = _localVariable_3;
		EObject tmpSysActorToSysLine = _localVariable_4;
		EObject tmpInteraction = _localVariable_5;
		EObject tmpFlow = _localVariable_6;
		EObject tmpFlowToInteraction = _localVariable_7;
		EObject tmpStep = _localVariable_8;
		EObject tmpLine = _localVariable_9;
		EObject tmpUseCase = _localVariable_10;
		EObject tmpUseCaseToInteraction = _localVariable_11;
		EObject tmpActorToLine = _localVariable_12;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpSysActor instanceof Actor) {
				Actor sysActor = (Actor) tmpSysActor;
				if (tmpPackageDeclaration instanceof PackageDeclaration) {
					PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
					if (tmpSysLine instanceof Lifeline) {
						Lifeline sysLine = (Lifeline) tmpSysLine;
						if (tmpSysActorToSysLine instanceof ActorToLifeline) {
							ActorToLifeline sysActorToSysLine = (ActorToLifeline) tmpSysActorToSysLine;
							if (tmpInteraction instanceof Interaction) {
								Interaction interaction = (Interaction) tmpInteraction;
								if (tmpFlow instanceof BasicFlow) {
									BasicFlow flow = (BasicFlow) tmpFlow;
									if (tmpFlowToInteraction instanceof FlowToInteractionFragment) {
										FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) tmpFlowToInteraction;
										if (tmpStep instanceof NormalStep) {
											NormalStep step = (NormalStep) tmpStep;
											if (tmpLine instanceof Lifeline) {
												Lifeline line = (Lifeline) tmpLine;
												if (tmpUseCase instanceof UseCase) {
													UseCase useCase = (UseCase) tmpUseCase;
													if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
														UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
														if (tmpActorToLine instanceof ActorToLifeline) {
															ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
															return new Object[] {
																	actor,
																	sysActor,
																	packageDeclaration,
																	sysLine,
																	sysActorToSysLine,
																	interaction,
																	flow,
																	flowToInteraction,
																	step,
																	line,
																	useCase,
																	useCaseToInteraction,
																	actorToLine,
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
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_1_1_blackBBBBBBBBBBBBBFBB(
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, NormalStep step,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, UserStepBFMessageRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!actor.equals(sysActor)) {
			if (!line.equals(sysLine)) {
				if (!actorToLine.equals(sysActorToSysLine)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { actor, sysActor,
									packageDeclaration, sysLine,
									sysActorToSysLine, interaction, flow,
									flowToInteraction, step, line, useCase,
									useCaseToInteraction, actorToLine, csp,
									_this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_1_1_bindingAndBlackFFFFFFFFFFFFFFBB(
			UserStepBFMessageRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UserStepBFMessageRule_1_1_binding = pattern_UserStepBFMessageRule_1_1_bindingFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_UserStepBFMessageRule_1_1_binding != null) {
			Actor actor = (Actor) result_pattern_UserStepBFMessageRule_1_1_binding[0];
			Actor sysActor = (Actor) result_pattern_UserStepBFMessageRule_1_1_binding[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UserStepBFMessageRule_1_1_binding[2];
			Lifeline sysLine = (Lifeline) result_pattern_UserStepBFMessageRule_1_1_binding[3];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result_pattern_UserStepBFMessageRule_1_1_binding[4];
			Interaction interaction = (Interaction) result_pattern_UserStepBFMessageRule_1_1_binding[5];
			BasicFlow flow = (BasicFlow) result_pattern_UserStepBFMessageRule_1_1_binding[6];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result_pattern_UserStepBFMessageRule_1_1_binding[7];
			NormalStep step = (NormalStep) result_pattern_UserStepBFMessageRule_1_1_binding[8];
			Lifeline line = (Lifeline) result_pattern_UserStepBFMessageRule_1_1_binding[9];
			UseCase useCase = (UseCase) result_pattern_UserStepBFMessageRule_1_1_binding[10];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_UserStepBFMessageRule_1_1_binding[11];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_UserStepBFMessageRule_1_1_binding[12];

			Object[] result_pattern_UserStepBFMessageRule_1_1_black = pattern_UserStepBFMessageRule_1_1_blackBBBBBBBBBBBBBFBB(
					actor, sysActor, packageDeclaration, sysLine,
					sysActorToSysLine, interaction, flow, flowToInteraction,
					step, line, useCase, useCaseToInteraction, actorToLine,
					_this, isApplicableMatch);
			if (result_pattern_UserStepBFMessageRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_UserStepBFMessageRule_1_1_black[13];

				return new Object[] { actor, sysActor, packageDeclaration,
						sysLine, sysActorToSysLine, interaction, flow,
						flowToInteraction, step, line, useCase,
						useCaseToInteraction, actorToLine, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_1_1_greenBFBFFBB(
			Lifeline sysLine, Interaction interaction, Lifeline line, CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		Object _localVariable_0 = csp.getValue("message", "messageSort");
		Object _localVariable_1 = csp.getValue("message", "messageKind");
		Object _localVariable_2 = csp.getValue("message", "_id");
		Object _localVariable_3 = csp.getValue("message", "name");
		sysLine.getCoveredBy().add(messageSend);
		messageSend.setEnclosingInteraction(interaction);
		messageReceive.setEnclosingInteraction(interaction);
		line.getCoveredBy().add(messageReceive);
		message.setSendEvent(messageSend);
		message.setReceiveEvent(messageReceive);
		messageSend.setMessage(message);
		messageReceive.setMessage(message);
		message.setInteraction(interaction);
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_0;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_1;
		String message__id_prime = (String) _localVariable_2;
		String message_name_prime = (String) _localVariable_3;
		message.setMessageSort(message_messageSort_prime);
		message.setMessageKind(message_messageKind_prime);
		message.set_id(message__id_prime);
		message.setName(message_name_prime);
		return new Object[] { sysLine, messageSend, interaction,
				messageReceive, message, line, csp };
	}

	public static final Object[] pattern_UserStepBFMessageRule_1_2_blackBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, messageReceive, step, message };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_1_2_greenFBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(messageSend);
		ruleresult.getCreatedElements().add(messageReceive);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(message);
		return new Object[] { ruleresult, messageSend, messageReceive, step,
				message };
	}

	public static final Object[] pattern_UserStepBFMessageRule_1_3_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject actor, EObject sysActor,
			EObject packageDeclaration, EObject sysLine,
			EObject sysActorToSysLine, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject step, EObject message,
			EObject line, EObject useCase, EObject useCaseToInteraction,
			EObject actorToLine) {
		if (!actor.equals(sysActor)) {
			if (!actor.equals(packageDeclaration)) {
				if (!actor.equals(sysLine)) {
					if (!actor.equals(sysActorToSysLine)) {
						if (!actor.equals(messageSend)) {
							if (!actor.equals(interaction)) {
								if (!actor.equals(messageReceive)) {
									if (!actor.equals(flow)) {
										if (!actor.equals(flowToInteraction)) {
											if (!actor.equals(step)) {
												if (!actor.equals(message)) {
													if (!actor.equals(line)) {
														if (!actor
																.equals(useCase)) {
															if (!actor
																	.equals(useCaseToInteraction)) {
																if (!actor
																		.equals(actorToLine)) {
																	if (!sysActor
																			.equals(sysLine)) {
																		if (!sysActor
																				.equals(sysActorToSysLine)) {
																			if (!sysActor
																					.equals(useCase)) {
																				if (!sysActor
																						.equals(useCaseToInteraction)) {
																					if (!packageDeclaration
																							.equals(sysActor)) {
																						if (!packageDeclaration
																								.equals(sysLine)) {
																							if (!packageDeclaration
																									.equals(sysActorToSysLine)) {
																								if (!packageDeclaration
																										.equals(step)) {
																									if (!packageDeclaration
																											.equals(useCase)) {
																										if (!packageDeclaration
																												.equals(useCaseToInteraction)) {
																											if (!sysLine
																													.equals(useCase)) {
																												if (!sysLine
																														.equals(useCaseToInteraction)) {
																													if (!sysActorToSysLine
																															.equals(sysLine)) {
																														if (!sysActorToSysLine
																																.equals(useCase)) {
																															if (!sysActorToSysLine
																																	.equals(useCaseToInteraction)) {
																																if (!messageSend
																																		.equals(sysActor)) {
																																	if (!messageSend
																																			.equals(packageDeclaration)) {
																																		if (!messageSend
																																				.equals(sysLine)) {
																																			if (!messageSend
																																					.equals(sysActorToSysLine)) {
																																				if (!messageSend
																																						.equals(step)) {
																																					if (!messageSend
																																							.equals(useCase)) {
																																						if (!messageSend
																																								.equals(useCaseToInteraction)) {
																																							if (!interaction
																																									.equals(sysActor)) {
																																								if (!interaction
																																										.equals(packageDeclaration)) {
																																									if (!interaction
																																											.equals(sysLine)) {
																																										if (!interaction
																																												.equals(sysActorToSysLine)) {
																																											if (!interaction
																																													.equals(messageSend)) {
																																												if (!interaction
																																														.equals(messageReceive)) {
																																													if (!interaction
																																															.equals(step)) {
																																														if (!interaction
																																																.equals(message)) {
																																															if (!interaction
																																																	.equals(line)) {
																																																if (!interaction
																																																		.equals(useCase)) {
																																																	if (!interaction
																																																			.equals(useCaseToInteraction)) {
																																																		if (!messageReceive
																																																				.equals(sysActor)) {
																																																			if (!messageReceive
																																																					.equals(packageDeclaration)) {
																																																				if (!messageReceive
																																																						.equals(sysLine)) {
																																																					if (!messageReceive
																																																							.equals(sysActorToSysLine)) {
																																																						if (!messageReceive
																																																								.equals(messageSend)) {
																																																							if (!messageReceive
																																																									.equals(step)) {
																																																								if (!messageReceive
																																																										.equals(useCase)) {
																																																									if (!messageReceive
																																																											.equals(useCaseToInteraction)) {
																																																										if (!flow
																																																												.equals(sysActor)) {
																																																											if (!flow
																																																													.equals(packageDeclaration)) {
																																																												if (!flow
																																																														.equals(sysLine)) {
																																																													if (!flow
																																																															.equals(sysActorToSysLine)) {
																																																														if (!flow
																																																																.equals(messageSend)) {
																																																															if (!flow
																																																																	.equals(interaction)) {
																																																																if (!flow
																																																																		.equals(messageReceive)) {
																																																																	if (!flow
																																																																			.equals(flowToInteraction)) {
																																																																		if (!flow
																																																																				.equals(step)) {
																																																																			if (!flow
																																																																					.equals(message)) {
																																																																				if (!flow
																																																																						.equals(line)) {
																																																																					if (!flow
																																																																							.equals(useCase)) {
																																																																						if (!flow
																																																																								.equals(useCaseToInteraction)) {
																																																																							if (!flowToInteraction
																																																																									.equals(sysActor)) {
																																																																								if (!flowToInteraction
																																																																										.equals(packageDeclaration)) {
																																																																									if (!flowToInteraction
																																																																											.equals(sysLine)) {
																																																																										if (!flowToInteraction
																																																																												.equals(sysActorToSysLine)) {
																																																																											if (!flowToInteraction
																																																																													.equals(messageSend)) {
																																																																												if (!flowToInteraction
																																																																														.equals(interaction)) {
																																																																													if (!flowToInteraction
																																																																															.equals(messageReceive)) {
																																																																														if (!flowToInteraction
																																																																																.equals(step)) {
																																																																															if (!flowToInteraction
																																																																																	.equals(message)) {
																																																																																if (!flowToInteraction
																																																																																		.equals(line)) {
																																																																																	if (!flowToInteraction
																																																																																			.equals(useCase)) {
																																																																																		if (!flowToInteraction
																																																																																				.equals(useCaseToInteraction)) {
																																																																																			if (!step
																																																																																					.equals(sysActor)) {
																																																																																				if (!step
																																																																																						.equals(sysLine)) {
																																																																																					if (!step
																																																																																							.equals(sysActorToSysLine)) {
																																																																																						if (!step
																																																																																								.equals(useCase)) {
																																																																																							if (!step
																																																																																									.equals(useCaseToInteraction)) {
																																																																																								if (!message
																																																																																										.equals(sysActor)) {
																																																																																									if (!message
																																																																																											.equals(packageDeclaration)) {
																																																																																										if (!message
																																																																																												.equals(sysLine)) {
																																																																																											if (!message
																																																																																													.equals(sysActorToSysLine)) {
																																																																																												if (!message
																																																																																														.equals(messageSend)) {
																																																																																													if (!message
																																																																																															.equals(messageReceive)) {
																																																																																														if (!message
																																																																																																.equals(step)) {
																																																																																															if (!message
																																																																																																	.equals(useCase)) {
																																																																																																if (!message
																																																																																																		.equals(useCaseToInteraction)) {
																																																																																																	if (!line
																																																																																																			.equals(sysActor)) {
																																																																																																		if (!line
																																																																																																				.equals(packageDeclaration)) {
																																																																																																			if (!line
																																																																																																					.equals(sysLine)) {
																																																																																																				if (!line
																																																																																																						.equals(sysActorToSysLine)) {
																																																																																																					if (!line
																																																																																																							.equals(messageSend)) {
																																																																																																						if (!line
																																																																																																								.equals(messageReceive)) {
																																																																																																							if (!line
																																																																																																									.equals(step)) {
																																																																																																								if (!line
																																																																																																										.equals(message)) {
																																																																																																									if (!line
																																																																																																											.equals(useCase)) {
																																																																																																										if (!line
																																																																																																												.equals(useCaseToInteraction)) {
																																																																																																											if (!useCase
																																																																																																													.equals(useCaseToInteraction)) {
																																																																																																												if (!actorToLine
																																																																																																														.equals(sysActor)) {
																																																																																																													if (!actorToLine
																																																																																																															.equals(packageDeclaration)) {
																																																																																																														if (!actorToLine
																																																																																																																.equals(sysLine)) {
																																																																																																															if (!actorToLine
																																																																																																																	.equals(sysActorToSysLine)) {
																																																																																																																if (!actorToLine
																																																																																																																		.equals(messageSend)) {
																																																																																																																	if (!actorToLine
																																																																																																																			.equals(interaction)) {
																																																																																																																		if (!actorToLine
																																																																																																																				.equals(messageReceive)) {
																																																																																																																			if (!actorToLine
																																																																																																																					.equals(flow)) {
																																																																																																																				if (!actorToLine
																																																																																																																						.equals(flowToInteraction)) {
																																																																																																																					if (!actorToLine
																																																																																																																							.equals(step)) {
																																																																																																																						if (!actorToLine
																																																																																																																								.equals(message)) {
																																																																																																																							if (!actorToLine
																																																																																																																									.equals(line)) {
																																																																																																																								if (!actorToLine
																																																																																																																										.equals(useCase)) {
																																																																																																																									if (!actorToLine
																																																																																																																											.equals(useCaseToInteraction)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												actor,
																																																																																																																												sysActor,
																																																																																																																												packageDeclaration,
																																																																																																																												sysLine,
																																																																																																																												sysActorToSysLine,
																																																																																																																												messageSend,
																																																																																																																												interaction,
																																																																																																																												messageReceive,
																																																																																																																												flow,
																																																																																																																												flowToInteraction,
																																																																																																																												step,
																																																																																																																												message,
																																																																																																																												line,
																																																																																																																												useCase,
																																																																																																																												useCaseToInteraction,
																																																																																																																												actorToLine };
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_1_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject sysLine,
			EObject messageSend, EObject interaction, EObject messageReceive,
			EObject flow, EObject step, EObject message, EObject line) {
		EMoflonEdge sysLine__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UserStepBFMessageRule";
		String sysLine__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__sysLine____covered_name_prime = "covered";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		sysLine__messageSend____coveredBy.setSrc(sysLine);
		sysLine__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(sysLine__messageSend____coveredBy);
		messageSend__sysLine____covered.setSrc(messageSend);
		messageSend__sysLine____covered.setTrg(sysLine);
		ruleresult.getCreatedEdges().add(messageSend__sysLine____covered);
		messageSend__interaction____enclosingInteraction.setSrc(messageSend);
		messageSend__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				messageSend__interaction____enclosingInteraction);
		interaction__messageSend____fragment.setSrc(interaction);
		interaction__messageSend____fragment.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(interaction__messageSend____fragment);
		messageReceive__interaction____enclosingInteraction
				.setSrc(messageReceive);
		messageReceive__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getCreatedEdges().add(
				messageReceive__interaction____enclosingInteraction);
		interaction__messageReceive____fragment.setSrc(interaction);
		interaction__messageReceive____fragment.setTrg(messageReceive);
		ruleresult.getCreatedEdges().add(
				interaction__messageReceive____fragment);
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		ruleresult.getCreatedEdges().add(message__messageSend____sendEvent);
		message__messageReceive____receiveEvent.setSrc(message);
		message__messageReceive____receiveEvent.setTrg(messageReceive);
		ruleresult.getCreatedEdges().add(
				message__messageReceive____receiveEvent);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		ruleresult.getCreatedEdges().add(messageSend__message____message);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		ruleresult.getCreatedEdges().add(messageReceive__message____message);
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		ruleresult.getCreatedEdges().add(line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		ruleresult.getCreatedEdges().add(messageReceive__line____covered);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		ruleresult.getCreatedEdges().add(message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		ruleresult.getCreatedEdges().add(interaction__message____message);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		ruleresult.getTranslatedEdges().add(step__actor____actor);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sysLine__messageSend____coveredBy
				.setName(sysLine__messageSend____coveredBy_name_prime);
		messageSend__sysLine____covered
				.setName(messageSend__sysLine____covered_name_prime);
		messageSend__interaction____enclosingInteraction
				.setName(messageSend__interaction____enclosingInteraction_name_prime);
		interaction__messageSend____fragment
				.setName(interaction__messageSend____fragment_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		return new Object[] { ruleresult, actor, sysLine, messageSend,
				interaction, messageReceive, flow, step, message, line,
				sysLine__messageSend____coveredBy,
				messageSend__sysLine____covered,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				messageSend__message____message,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered,
				message__interaction____interaction,
				interaction__message____message, flow__step____steps,
				step__actor____actor };
	}

	public static final void pattern_UserStepBFMessageRule_1_5_expressionBBBBBBBBBBBBBBBBBB(
			UserStepBFMessageRule _this, PerformRuleResult ruleresult,
			EObject actor, EObject sysActor, EObject packageDeclaration,
			EObject sysLine, EObject sysActorToSysLine, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject step, EObject message,
			EObject line, EObject useCase, EObject useCaseToInteraction,
			EObject actorToLine) {
		_this.registerObjects_FWD(ruleresult, actor, sysActor,
				packageDeclaration, sysLine, sysActorToSysLine, messageSend,
				interaction, messageReceive, flow, flowToInteraction, step,
				message, line, useCase, useCaseToInteraction, actorToLine);

	}

	public static final PerformRuleResult pattern_UserStepBFMessageRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_2_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_2_1_blackFBB(
			EClass eClass, UserStepBFMessageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_2_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_2_1_binding = pattern_UserStepBFMessageRule_2_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UserStepBFMessageRule_2_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_2_1_black = pattern_UserStepBFMessageRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_UserStepBFMessageRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UserStepBFMessageRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UserStepBFMessageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UserStepBFMessageRule_2_2_bindingFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("actor");
		EObject _localVariable_1 = match.getObject("sysActor");
		EObject _localVariable_2 = match.getObject("packageDeclaration");
		EObject _localVariable_3 = match.getObject("flow");
		EObject _localVariable_4 = match.getObject("step");
		EObject _localVariable_5 = match.getObject("useCase");
		EObject tmpActor = _localVariable_0;
		EObject tmpSysActor = _localVariable_1;
		EObject tmpPackageDeclaration = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpStep = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpSysActor instanceof Actor) {
				Actor sysActor = (Actor) tmpSysActor;
				if (tmpPackageDeclaration instanceof PackageDeclaration) {
					PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
					if (tmpFlow instanceof BasicFlow) {
						BasicFlow flow = (BasicFlow) tmpFlow;
						if (tmpStep instanceof NormalStep) {
							NormalStep step = (NormalStep) tmpStep;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								return new Object[] { actor, sysActor,
										packageDeclaration, flow, step,
										useCase, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_2_2_blackBBBFFFBFBFBFFB(
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			BasicFlow flow, NormalStep step, UseCase useCase, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!actor.equals(sysActor)) {
			for (ActorToLifeline sysActorToSysLine : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sysActor, ActorToLifeline.class,
							"source")) {
				Lifeline sysLine = sysActorToSysLine.getTarget();
				if (sysLine != null) {
					for (FlowToInteractionFragment flowToInteraction : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(flow,
									FlowToInteractionFragment.class, "source")) {
						InteractionFragment tmpInteraction = flowToInteraction
								.getTarget();
						if (tmpInteraction instanceof Interaction) {
							Interaction interaction = (Interaction) tmpInteraction;
							for (UseCaseToInteraction useCaseToInteraction : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(useCase,
											UseCaseToInteraction.class,
											"source")) {
								if (interaction.equals(useCaseToInteraction
										.getTarget())) {
									for (ActorToLifeline actorToLine : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(actor,
													ActorToLifeline.class,
													"source")) {
										if (!actorToLine
												.equals(sysActorToSysLine)) {
											Lifeline line = actorToLine
													.getTarget();
											if (line != null) {
												if (!line.equals(sysLine)) {
													_result.add(new Object[] {
															actor,
															sysActor,
															packageDeclaration,
															sysLine,
															sysActorToSysLine,
															interaction,
															flow,
															flowToInteraction,
															step,
															line,
															useCase,
															useCaseToInteraction,
															actorToLine, match });
												}
											}

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

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_2_3_blackBBBBBBBBBBBBB(
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, NormalStep step,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!actor.equals(sysActor)) {
			if (!line.equals(sysLine)) {
				if (!actorToLine.equals(sysActorToSysLine)) {
					if (packageDeclaration.getActors().contains(actor)) {
						if (packageDeclaration.getActors().contains(sysActor)) {
							if (sysActor.equals(sysActorToSysLine.getSource())) {
								if (sysLine.equals(sysActorToSysLine
										.getTarget())) {
									if (flow.equals(flowToInteraction
											.getSource())) {
										if (interaction
												.equals(flowToInteraction
														.getTarget())) {
											if (useCase.getFlows().contains(
													flow)) {
												if (interaction.equals(line
														.getInteraction())) {
													if (useCase
															.equals(useCaseToInteraction
																	.getSource())) {
														if (interaction
																.equals(useCaseToInteraction
																		.getTarget())) {
															if (flow.getSteps()
																	.contains(
																			step)) {
																if (actor
																		.equals(step
																				.getActor())) {
																	if (actor
																			.equals(actorToLine
																					.getSource())) {
																		if (line.equals(actorToLine
																				.getTarget())) {
																			if (packageDeclaration
																					.getUseCases()
																					.contains(
																							useCase)) {
																				_result.add(new Object[] {
																						actor,
																						sysActor,
																						packageDeclaration,
																						sysLine,
																						sysActorToSysLine,
																						interaction,
																						flow,
																						flowToInteraction,
																						step,
																						line,
																						useCase,
																						useCaseToInteraction,
																						actorToLine });
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_2_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFF(
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, NormalStep step,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__sysActor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysActorToSysLine__sysActor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysActorToSysLine__sysLine____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToInteraction__flow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__sysActor____actors_name_prime = "actors";
		String sysActorToSysLine__sysActor____source_name_prime = "source";
		String sysActorToSysLine__sysLine____target_name_prime = "target";
		String flowToInteraction__flow____source_name_prime = "source";
		String flowToInteraction__interaction____target_name_prime = "target";
		String useCase__flow____flows_name_prime = "flows";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(sysActor);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(sysLine);
		isApplicableMatch.getAllContextElements().add(sysActorToSysLine);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(flowToInteraction);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		packageDeclaration__sysActor____actors.setSrc(packageDeclaration);
		packageDeclaration__sysActor____actors.setTrg(sysActor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__sysActor____actors);
		sysActorToSysLine__sysActor____source.setSrc(sysActorToSysLine);
		sysActorToSysLine__sysActor____source.setTrg(sysActor);
		isApplicableMatch.getAllContextElements().add(
				sysActorToSysLine__sysActor____source);
		sysActorToSysLine__sysLine____target.setSrc(sysActorToSysLine);
		sysActorToSysLine__sysLine____target.setTrg(sysLine);
		isApplicableMatch.getAllContextElements().add(
				sysActorToSysLine__sysLine____target);
		flowToInteraction__flow____source.setSrc(flowToInteraction);
		flowToInteraction__flow____source.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				flowToInteraction__flow____source);
		flowToInteraction__interaction____target.setSrc(flowToInteraction);
		flowToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				flowToInteraction__interaction____target);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				interaction__line____lifeline);
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__interaction____target);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(step__actor____actor);
		actorToLine__actor____source.setSrc(actorToLine);
		actorToLine__actor____source.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__actor____source);
		actorToLine__line____target.setSrc(actorToLine);
		actorToLine__line____target.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__line____target);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__sysActor____actors
				.setName(packageDeclaration__sysActor____actors_name_prime);
		sysActorToSysLine__sysActor____source
				.setName(sysActorToSysLine__sysActor____source_name_prime);
		sysActorToSysLine__sysLine____target
				.setName(sysActorToSysLine__sysLine____target_name_prime);
		flowToInteraction__flow____source
				.setName(flowToInteraction__flow____source_name_prime);
		flowToInteraction__interaction____target
				.setName(flowToInteraction__interaction____target_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { actor, sysActor, packageDeclaration, sysLine,
				sysActorToSysLine, interaction, flow, flowToInteraction, step,
				line, useCase, useCaseToInteraction, actorToLine,
				isApplicableMatch, packageDeclaration__actor____actors,
				packageDeclaration__sysActor____actors,
				sysActorToSysLine__sysActor____source,
				sysActorToSysLine__sysLine____target,
				flowToInteraction__flow____source,
				flowToInteraction__interaction____target,
				useCase__flow____flows, line__interaction____interaction,
				interaction__line____lifeline,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				flow__step____steps, step__actor____actor,
				actorToLine__actor____source, actorToLine__line____target,
				packageDeclaration__useCase____useCases };
	}

	public static final Object[] pattern_UserStepBFMessageRule_2_4_bindingFBBBBBBBBBBBBBBB(
			UserStepBFMessageRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, NormalStep step,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, actor, sysActor, packageDeclaration,
				sysLine, sysActorToSysLine, interaction, flow,
				flowToInteraction, step, line, useCase, useCaseToInteraction,
				actorToLine);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor,
					sysActor, packageDeclaration, sysLine, sysActorToSysLine,
					interaction, flow, flowToInteraction, step, line, useCase,
					useCaseToInteraction, actorToLine };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_2_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserStepBFMessageRule_2_4_bindingAndBlackFBBBBBBBBBBBBBBB(
			UserStepBFMessageRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, NormalStep step,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		Object[] result_pattern_UserStepBFMessageRule_2_4_binding = pattern_UserStepBFMessageRule_2_4_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, sysActor, packageDeclaration,
				sysLine, sysActorToSysLine, interaction, flow,
				flowToInteraction, step, line, useCase, useCaseToInteraction,
				actorToLine);
		if (result_pattern_UserStepBFMessageRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_UserStepBFMessageRule_2_4_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_2_4_black = pattern_UserStepBFMessageRule_2_4_blackB(csp);
			if (result_pattern_UserStepBFMessageRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						sysActor, packageDeclaration, sysLine,
						sysActorToSysLine, interaction, flow,
						flowToInteraction, step, line, useCase,
						useCaseToInteraction, actorToLine };
			}
		}
		return null;
	}

	public static final boolean pattern_UserStepBFMessageRule_2_5_expressionFBB(
			UserStepBFMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UserStepBFMessageRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UserStepBFMessageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UserStepBFMessageRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_10_1_blackBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		if (!messageReceive.equals(messageSend)) {
			if (!line.equals(sysLine)) {
				return new Object[] { _this, match, sysLine, messageSend,
						interaction, messageReceive, message, line };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_10_2_bindingFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, sysLine, messageSend,
					interaction, messageReceive, message, line };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_10_2_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserStepBFMessageRule_10_2_bindingAndBlackFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		Object[] result_pattern_UserStepBFMessageRule_10_2_binding = pattern_UserStepBFMessageRule_10_2_bindingFBBBBBBBB(
				_this, match, sysLine, messageSend, interaction,
				messageReceive, message, line);
		if (result_pattern_UserStepBFMessageRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_UserStepBFMessageRule_10_2_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_10_2_black = pattern_UserStepBFMessageRule_10_2_blackB(csp);
			if (result_pattern_UserStepBFMessageRule_10_2_black != null) {

				return new Object[] { csp, _this, match, sysLine, messageSend,
						interaction, messageReceive, message, line };
			}
		}
		return null;
	}

	public static final boolean pattern_UserStepBFMessageRule_10_3_expressionFBB(
			UserStepBFMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_10_4_blackBBBBBBB(
			Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		if (!messageReceive.equals(messageSend)) {
			if (!line.equals(sysLine)) {
				return new Object[] { match, sysLine, messageSend, interaction,
						messageReceive, message, line };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_10_4_greenBBBBBBBFFFFFFFFFFFFFF(
			Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		EMoflonEdge sysLine__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(messageSend);
		match.getToBeTranslatedNodes().add(messageReceive);
		match.getToBeTranslatedNodes().add(message);
		String sysLine__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__sysLine____covered_name_prime = "covered";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		sysLine__messageSend____coveredBy.setSrc(sysLine);
		sysLine__messageSend____coveredBy.setTrg(messageSend);
		match.getToBeTranslatedEdges().add(sysLine__messageSend____coveredBy);
		messageSend__sysLine____covered.setSrc(messageSend);
		messageSend__sysLine____covered.setTrg(sysLine);
		match.getToBeTranslatedEdges().add(messageSend__sysLine____covered);
		messageSend__interaction____enclosingInteraction.setSrc(messageSend);
		messageSend__interaction____enclosingInteraction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(
				messageSend__interaction____enclosingInteraction);
		interaction__messageSend____fragment.setSrc(interaction);
		interaction__messageSend____fragment.setTrg(messageSend);
		match.getToBeTranslatedEdges()
				.add(interaction__messageSend____fragment);
		messageReceive__interaction____enclosingInteraction
				.setSrc(messageReceive);
		messageReceive__interaction____enclosingInteraction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(
				messageReceive__interaction____enclosingInteraction);
		interaction__messageReceive____fragment.setSrc(interaction);
		interaction__messageReceive____fragment.setTrg(messageReceive);
		match.getToBeTranslatedEdges().add(
				interaction__messageReceive____fragment);
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		match.getToBeTranslatedEdges().add(message__messageSend____sendEvent);
		message__messageReceive____receiveEvent.setSrc(message);
		message__messageReceive____receiveEvent.setTrg(messageReceive);
		match.getToBeTranslatedEdges().add(
				message__messageReceive____receiveEvent);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(messageSend__message____message);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(messageReceive__message____message);
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		match.getToBeTranslatedEdges().add(line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		match.getToBeTranslatedEdges().add(messageReceive__line____covered);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		match.getToBeTranslatedEdges().add(message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		match.getToBeTranslatedEdges().add(interaction__message____message);
		sysLine__messageSend____coveredBy
				.setName(sysLine__messageSend____coveredBy_name_prime);
		messageSend__sysLine____covered
				.setName(messageSend__sysLine____covered_name_prime);
		messageSend__interaction____enclosingInteraction
				.setName(messageSend__interaction____enclosingInteraction_name_prime);
		interaction__messageSend____fragment
				.setName(interaction__messageSend____fragment_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		return new Object[] { match, sysLine, messageSend, interaction,
				messageReceive, message, line,
				sysLine__messageSend____coveredBy,
				messageSend__sysLine____covered,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				messageSend__message____message,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered,
				message__interaction____interaction,
				interaction__message____message };
	}

	public static final Object[] pattern_UserStepBFMessageRule_10_5_blackBBBBBBB(
			Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		if (!messageReceive.equals(messageSend)) {
			if (!line.equals(sysLine)) {
				return new Object[] { match, sysLine, messageSend, interaction,
						messageReceive, message, line };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_10_5_greenBBBBFF(
			Match match, Lifeline sysLine, Interaction interaction,
			Lifeline line) {
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(sysLine);
		match.getContextNodes().add(interaction);
		match.getContextNodes().add(line);
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		match.getContextEdges().add(line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		match.getContextEdges().add(interaction__line____lifeline);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		return new Object[] { match, sysLine, interaction, line,
				line__interaction____interaction, interaction__line____lifeline };
	}

	public static final void pattern_UserStepBFMessageRule_10_6_expressionBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		_this.registerObjectsToMatch_BWD(match, sysLine, messageSend,
				interaction, messageReceive, message, line);

	}

	public static final boolean pattern_UserStepBFMessageRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_11_1_bindingFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("actor");
		EObject _localVariable_1 = isApplicableMatch.getObject("sysActor");
		EObject _localVariable_2 = isApplicableMatch
				.getObject("packageDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("sysLine");
		EObject _localVariable_4 = isApplicableMatch
				.getObject("sysActorToSysLine");
		EObject _localVariable_5 = isApplicableMatch.getObject("messageSend");
		EObject _localVariable_6 = isApplicableMatch.getObject("interaction");
		EObject _localVariable_7 = isApplicableMatch
				.getObject("messageReceive");
		EObject _localVariable_8 = isApplicableMatch.getObject("flow");
		EObject _localVariable_9 = isApplicableMatch
				.getObject("flowToInteraction");
		EObject _localVariable_10 = isApplicableMatch.getObject("message");
		EObject _localVariable_11 = isApplicableMatch.getObject("line");
		EObject _localVariable_12 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_13 = isApplicableMatch
				.getObject("useCaseToInteraction");
		EObject _localVariable_14 = isApplicableMatch.getObject("actorToLine");
		EObject tmpActor = _localVariable_0;
		EObject tmpSysActor = _localVariable_1;
		EObject tmpPackageDeclaration = _localVariable_2;
		EObject tmpSysLine = _localVariable_3;
		EObject tmpSysActorToSysLine = _localVariable_4;
		EObject tmpMessageSend = _localVariable_5;
		EObject tmpInteraction = _localVariable_6;
		EObject tmpMessageReceive = _localVariable_7;
		EObject tmpFlow = _localVariable_8;
		EObject tmpFlowToInteraction = _localVariable_9;
		EObject tmpMessage = _localVariable_10;
		EObject tmpLine = _localVariable_11;
		EObject tmpUseCase = _localVariable_12;
		EObject tmpUseCaseToInteraction = _localVariable_13;
		EObject tmpActorToLine = _localVariable_14;
		if (tmpActor instanceof Actor) {
			Actor actor = (Actor) tmpActor;
			if (tmpSysActor instanceof Actor) {
				Actor sysActor = (Actor) tmpSysActor;
				if (tmpPackageDeclaration instanceof PackageDeclaration) {
					PackageDeclaration packageDeclaration = (PackageDeclaration) tmpPackageDeclaration;
					if (tmpSysLine instanceof Lifeline) {
						Lifeline sysLine = (Lifeline) tmpSysLine;
						if (tmpSysActorToSysLine instanceof ActorToLifeline) {
							ActorToLifeline sysActorToSysLine = (ActorToLifeline) tmpSysActorToSysLine;
							if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
								MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
								if (tmpInteraction instanceof Interaction) {
									Interaction interaction = (Interaction) tmpInteraction;
									if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
										if (tmpFlow instanceof BasicFlow) {
											BasicFlow flow = (BasicFlow) tmpFlow;
											if (tmpFlowToInteraction instanceof FlowToInteractionFragment) {
												FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) tmpFlowToInteraction;
												if (tmpMessage instanceof Message) {
													Message message = (Message) tmpMessage;
													if (tmpLine instanceof Lifeline) {
														Lifeline line = (Lifeline) tmpLine;
														if (tmpUseCase instanceof UseCase) {
															UseCase useCase = (UseCase) tmpUseCase;
															if (tmpUseCaseToInteraction instanceof UseCaseToInteraction) {
																UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) tmpUseCaseToInteraction;
																if (tmpActorToLine instanceof ActorToLifeline) {
																	ActorToLifeline actorToLine = (ActorToLifeline) tmpActorToLine;
																	return new Object[] {
																			actor,
																			sysActor,
																			packageDeclaration,
																			sysLine,
																			sysActorToSysLine,
																			messageSend,
																			interaction,
																			messageReceive,
																			flow,
																			flowToInteraction,
																			message,
																			line,
																			useCase,
																			useCaseToInteraction,
																			actorToLine,
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
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_11_1_blackBBBBBBBBBBBBBBBFBB(
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, UserStepBFMessageRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!actor.equals(sysActor)) {
			if (!messageReceive.equals(messageSend)) {
				if (!line.equals(sysLine)) {
					if (!actorToLine.equals(sysActorToSysLine)) {
						for (EObject tmpCsp : isApplicableMatch
								.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { actor, sysActor,
										packageDeclaration, sysLine,
										sysActorToSysLine, messageSend,
										interaction, messageReceive, flow,
										flowToInteraction, message, line,
										useCase, useCaseToInteraction,
										actorToLine, csp, _this,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_11_1_bindingAndBlackFFFFFFFFFFFFFFFFBB(
			UserStepBFMessageRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UserStepBFMessageRule_11_1_binding = pattern_UserStepBFMessageRule_11_1_bindingFFFFFFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_UserStepBFMessageRule_11_1_binding != null) {
			Actor actor = (Actor) result_pattern_UserStepBFMessageRule_11_1_binding[0];
			Actor sysActor = (Actor) result_pattern_UserStepBFMessageRule_11_1_binding[1];
			PackageDeclaration packageDeclaration = (PackageDeclaration) result_pattern_UserStepBFMessageRule_11_1_binding[2];
			Lifeline sysLine = (Lifeline) result_pattern_UserStepBFMessageRule_11_1_binding[3];
			ActorToLifeline sysActorToSysLine = (ActorToLifeline) result_pattern_UserStepBFMessageRule_11_1_binding[4];
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) result_pattern_UserStepBFMessageRule_11_1_binding[5];
			Interaction interaction = (Interaction) result_pattern_UserStepBFMessageRule_11_1_binding[6];
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) result_pattern_UserStepBFMessageRule_11_1_binding[7];
			BasicFlow flow = (BasicFlow) result_pattern_UserStepBFMessageRule_11_1_binding[8];
			FlowToInteractionFragment flowToInteraction = (FlowToInteractionFragment) result_pattern_UserStepBFMessageRule_11_1_binding[9];
			Message message = (Message) result_pattern_UserStepBFMessageRule_11_1_binding[10];
			Lifeline line = (Lifeline) result_pattern_UserStepBFMessageRule_11_1_binding[11];
			UseCase useCase = (UseCase) result_pattern_UserStepBFMessageRule_11_1_binding[12];
			UseCaseToInteraction useCaseToInteraction = (UseCaseToInteraction) result_pattern_UserStepBFMessageRule_11_1_binding[13];
			ActorToLifeline actorToLine = (ActorToLifeline) result_pattern_UserStepBFMessageRule_11_1_binding[14];

			Object[] result_pattern_UserStepBFMessageRule_11_1_black = pattern_UserStepBFMessageRule_11_1_blackBBBBBBBBBBBBBBBFBB(
					actor, sysActor, packageDeclaration, sysLine,
					sysActorToSysLine, messageSend, interaction,
					messageReceive, flow, flowToInteraction, message, line,
					useCase, useCaseToInteraction, actorToLine, _this,
					isApplicableMatch);
			if (result_pattern_UserStepBFMessageRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_UserStepBFMessageRule_11_1_black[15];

				return new Object[] { actor, sysActor, packageDeclaration,
						sysLine, sysActorToSysLine, messageSend, interaction,
						messageReceive, flow, flowToInteraction, message, line,
						useCase, useCaseToInteraction, actorToLine, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_11_1_greenBBFB(
			Actor actor, BasicFlow flow, CSP csp) {
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		Object _localVariable_0 = csp.getValue("step", "type");
		Object _localVariable_1 = csp.getValue("step", "name");
		Object _localVariable_2 = csp.getValue("step", "label");
		flow.getSteps().add(step);
		step.setActor(actor);
		StepType step_type_prime = (StepType) _localVariable_0;
		String step_name_prime = (String) _localVariable_1;
		String step_label_prime = (String) _localVariable_2;
		step.setType(step_type_prime);
		step.setName(step_name_prime);
		step.setLabel(step_label_prime);
		return new Object[] { actor, flow, step, csp };
	}

	public static final Object[] pattern_UserStepBFMessageRule_11_2_blackBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message) {
		if (!messageReceive.equals(messageSend)) {
			return new Object[] { messageSend, messageReceive, step, message };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_11_2_greenFBBBB(
			MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive, NormalStep step,
			Message message) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(messageSend);
		ruleresult.getTranslatedElements().add(messageReceive);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(message);
		return new Object[] { ruleresult, messageSend, messageReceive, step,
				message };
	}

	public static final Object[] pattern_UserStepBFMessageRule_11_3_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject actor, EObject sysActor,
			EObject packageDeclaration, EObject sysLine,
			EObject sysActorToSysLine, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject step, EObject message,
			EObject line, EObject useCase, EObject useCaseToInteraction,
			EObject actorToLine) {
		if (!actor.equals(sysActor)) {
			if (!actor.equals(packageDeclaration)) {
				if (!actor.equals(sysLine)) {
					if (!actor.equals(sysActorToSysLine)) {
						if (!actor.equals(messageSend)) {
							if (!actor.equals(interaction)) {
								if (!actor.equals(messageReceive)) {
									if (!actor.equals(flow)) {
										if (!actor.equals(flowToInteraction)) {
											if (!actor.equals(step)) {
												if (!actor.equals(message)) {
													if (!actor.equals(line)) {
														if (!actor
																.equals(useCase)) {
															if (!actor
																	.equals(useCaseToInteraction)) {
																if (!actor
																		.equals(actorToLine)) {
																	if (!sysActor
																			.equals(sysLine)) {
																		if (!sysActor
																				.equals(sysActorToSysLine)) {
																			if (!sysActor
																					.equals(useCase)) {
																				if (!sysActor
																						.equals(useCaseToInteraction)) {
																					if (!packageDeclaration
																							.equals(sysActor)) {
																						if (!packageDeclaration
																								.equals(sysLine)) {
																							if (!packageDeclaration
																									.equals(sysActorToSysLine)) {
																								if (!packageDeclaration
																										.equals(step)) {
																									if (!packageDeclaration
																											.equals(useCase)) {
																										if (!packageDeclaration
																												.equals(useCaseToInteraction)) {
																											if (!sysLine
																													.equals(useCase)) {
																												if (!sysLine
																														.equals(useCaseToInteraction)) {
																													if (!sysActorToSysLine
																															.equals(sysLine)) {
																														if (!sysActorToSysLine
																																.equals(useCase)) {
																															if (!sysActorToSysLine
																																	.equals(useCaseToInteraction)) {
																																if (!messageSend
																																		.equals(sysActor)) {
																																	if (!messageSend
																																			.equals(packageDeclaration)) {
																																		if (!messageSend
																																				.equals(sysLine)) {
																																			if (!messageSend
																																					.equals(sysActorToSysLine)) {
																																				if (!messageSend
																																						.equals(step)) {
																																					if (!messageSend
																																							.equals(useCase)) {
																																						if (!messageSend
																																								.equals(useCaseToInteraction)) {
																																							if (!interaction
																																									.equals(sysActor)) {
																																								if (!interaction
																																										.equals(packageDeclaration)) {
																																									if (!interaction
																																											.equals(sysLine)) {
																																										if (!interaction
																																												.equals(sysActorToSysLine)) {
																																											if (!interaction
																																													.equals(messageSend)) {
																																												if (!interaction
																																														.equals(messageReceive)) {
																																													if (!interaction
																																															.equals(step)) {
																																														if (!interaction
																																																.equals(message)) {
																																															if (!interaction
																																																	.equals(line)) {
																																																if (!interaction
																																																		.equals(useCase)) {
																																																	if (!interaction
																																																			.equals(useCaseToInteraction)) {
																																																		if (!messageReceive
																																																				.equals(sysActor)) {
																																																			if (!messageReceive
																																																					.equals(packageDeclaration)) {
																																																				if (!messageReceive
																																																						.equals(sysLine)) {
																																																					if (!messageReceive
																																																							.equals(sysActorToSysLine)) {
																																																						if (!messageReceive
																																																								.equals(messageSend)) {
																																																							if (!messageReceive
																																																									.equals(step)) {
																																																								if (!messageReceive
																																																										.equals(useCase)) {
																																																									if (!messageReceive
																																																											.equals(useCaseToInteraction)) {
																																																										if (!flow
																																																												.equals(sysActor)) {
																																																											if (!flow
																																																													.equals(packageDeclaration)) {
																																																												if (!flow
																																																														.equals(sysLine)) {
																																																													if (!flow
																																																															.equals(sysActorToSysLine)) {
																																																														if (!flow
																																																																.equals(messageSend)) {
																																																															if (!flow
																																																																	.equals(interaction)) {
																																																																if (!flow
																																																																		.equals(messageReceive)) {
																																																																	if (!flow
																																																																			.equals(flowToInteraction)) {
																																																																		if (!flow
																																																																				.equals(step)) {
																																																																			if (!flow
																																																																					.equals(message)) {
																																																																				if (!flow
																																																																						.equals(line)) {
																																																																					if (!flow
																																																																							.equals(useCase)) {
																																																																						if (!flow
																																																																								.equals(useCaseToInteraction)) {
																																																																							if (!flowToInteraction
																																																																									.equals(sysActor)) {
																																																																								if (!flowToInteraction
																																																																										.equals(packageDeclaration)) {
																																																																									if (!flowToInteraction
																																																																											.equals(sysLine)) {
																																																																										if (!flowToInteraction
																																																																												.equals(sysActorToSysLine)) {
																																																																											if (!flowToInteraction
																																																																													.equals(messageSend)) {
																																																																												if (!flowToInteraction
																																																																														.equals(interaction)) {
																																																																													if (!flowToInteraction
																																																																															.equals(messageReceive)) {
																																																																														if (!flowToInteraction
																																																																																.equals(step)) {
																																																																															if (!flowToInteraction
																																																																																	.equals(message)) {
																																																																																if (!flowToInteraction
																																																																																		.equals(line)) {
																																																																																	if (!flowToInteraction
																																																																																			.equals(useCase)) {
																																																																																		if (!flowToInteraction
																																																																																				.equals(useCaseToInteraction)) {
																																																																																			if (!step
																																																																																					.equals(sysActor)) {
																																																																																				if (!step
																																																																																						.equals(sysLine)) {
																																																																																					if (!step
																																																																																							.equals(sysActorToSysLine)) {
																																																																																						if (!step
																																																																																								.equals(useCase)) {
																																																																																							if (!step
																																																																																									.equals(useCaseToInteraction)) {
																																																																																								if (!message
																																																																																										.equals(sysActor)) {
																																																																																									if (!message
																																																																																											.equals(packageDeclaration)) {
																																																																																										if (!message
																																																																																												.equals(sysLine)) {
																																																																																											if (!message
																																																																																													.equals(sysActorToSysLine)) {
																																																																																												if (!message
																																																																																														.equals(messageSend)) {
																																																																																													if (!message
																																																																																															.equals(messageReceive)) {
																																																																																														if (!message
																																																																																																.equals(step)) {
																																																																																															if (!message
																																																																																																	.equals(useCase)) {
																																																																																																if (!message
																																																																																																		.equals(useCaseToInteraction)) {
																																																																																																	if (!line
																																																																																																			.equals(sysActor)) {
																																																																																																		if (!line
																																																																																																				.equals(packageDeclaration)) {
																																																																																																			if (!line
																																																																																																					.equals(sysLine)) {
																																																																																																				if (!line
																																																																																																						.equals(sysActorToSysLine)) {
																																																																																																					if (!line
																																																																																																							.equals(messageSend)) {
																																																																																																						if (!line
																																																																																																								.equals(messageReceive)) {
																																																																																																							if (!line
																																																																																																									.equals(step)) {
																																																																																																								if (!line
																																																																																																										.equals(message)) {
																																																																																																									if (!line
																																																																																																											.equals(useCase)) {
																																																																																																										if (!line
																																																																																																												.equals(useCaseToInteraction)) {
																																																																																																											if (!useCase
																																																																																																													.equals(useCaseToInteraction)) {
																																																																																																												if (!actorToLine
																																																																																																														.equals(sysActor)) {
																																																																																																													if (!actorToLine
																																																																																																															.equals(packageDeclaration)) {
																																																																																																														if (!actorToLine
																																																																																																																.equals(sysLine)) {
																																																																																																															if (!actorToLine
																																																																																																																	.equals(sysActorToSysLine)) {
																																																																																																																if (!actorToLine
																																																																																																																		.equals(messageSend)) {
																																																																																																																	if (!actorToLine
																																																																																																																			.equals(interaction)) {
																																																																																																																		if (!actorToLine
																																																																																																																				.equals(messageReceive)) {
																																																																																																																			if (!actorToLine
																																																																																																																					.equals(flow)) {
																																																																																																																				if (!actorToLine
																																																																																																																						.equals(flowToInteraction)) {
																																																																																																																					if (!actorToLine
																																																																																																																							.equals(step)) {
																																																																																																																						if (!actorToLine
																																																																																																																								.equals(message)) {
																																																																																																																							if (!actorToLine
																																																																																																																									.equals(line)) {
																																																																																																																								if (!actorToLine
																																																																																																																										.equals(useCase)) {
																																																																																																																									if (!actorToLine
																																																																																																																											.equals(useCaseToInteraction)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												actor,
																																																																																																																												sysActor,
																																																																																																																												packageDeclaration,
																																																																																																																												sysLine,
																																																																																																																												sysActorToSysLine,
																																																																																																																												messageSend,
																																																																																																																												interaction,
																																																																																																																												messageReceive,
																																																																																																																												flow,
																																																																																																																												flowToInteraction,
																																																																																																																												step,
																																																																																																																												message,
																																																																																																																												line,
																																																																																																																												useCase,
																																																																																																																												useCaseToInteraction,
																																																																																																																												actorToLine };
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_11_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject actor, EObject sysLine,
			EObject messageSend, EObject interaction, EObject messageReceive,
			EObject flow, EObject step, EObject message, EObject line) {
		EMoflonEdge sysLine__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge step__actor____actor = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UserStepBFMessageRule";
		String sysLine__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__sysLine____covered_name_prime = "covered";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String flow__step____steps_name_prime = "steps";
		String step__actor____actor_name_prime = "actor";
		sysLine__messageSend____coveredBy.setSrc(sysLine);
		sysLine__messageSend____coveredBy.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(sysLine__messageSend____coveredBy);
		messageSend__sysLine____covered.setSrc(messageSend);
		messageSend__sysLine____covered.setTrg(sysLine);
		ruleresult.getTranslatedEdges().add(messageSend__sysLine____covered);
		messageSend__interaction____enclosingInteraction.setSrc(messageSend);
		messageSend__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getTranslatedEdges().add(
				messageSend__interaction____enclosingInteraction);
		interaction__messageSend____fragment.setSrc(interaction);
		interaction__messageSend____fragment.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(
				interaction__messageSend____fragment);
		messageReceive__interaction____enclosingInteraction
				.setSrc(messageReceive);
		messageReceive__interaction____enclosingInteraction.setTrg(interaction);
		ruleresult.getTranslatedEdges().add(
				messageReceive__interaction____enclosingInteraction);
		interaction__messageReceive____fragment.setSrc(interaction);
		interaction__messageReceive____fragment.setTrg(messageReceive);
		ruleresult.getTranslatedEdges().add(
				interaction__messageReceive____fragment);
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		ruleresult.getTranslatedEdges().add(message__messageSend____sendEvent);
		message__messageReceive____receiveEvent.setSrc(message);
		message__messageReceive____receiveEvent.setTrg(messageReceive);
		ruleresult.getTranslatedEdges().add(
				message__messageReceive____receiveEvent);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		ruleresult.getTranslatedEdges().add(messageSend__message____message);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		ruleresult.getTranslatedEdges().add(messageReceive__message____message);
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		ruleresult.getTranslatedEdges().add(line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		ruleresult.getTranslatedEdges().add(messageReceive__line____covered);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		ruleresult.getTranslatedEdges()
				.add(message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		ruleresult.getTranslatedEdges().add(interaction__message____message);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		step__actor____actor.setSrc(step);
		step__actor____actor.setTrg(actor);
		ruleresult.getCreatedEdges().add(step__actor____actor);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sysLine__messageSend____coveredBy
				.setName(sysLine__messageSend____coveredBy_name_prime);
		messageSend__sysLine____covered
				.setName(messageSend__sysLine____covered_name_prime);
		messageSend__interaction____enclosingInteraction
				.setName(messageSend__interaction____enclosingInteraction_name_prime);
		interaction__messageSend____fragment
				.setName(interaction__messageSend____fragment_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		step__actor____actor.setName(step__actor____actor_name_prime);
		return new Object[] { ruleresult, actor, sysLine, messageSend,
				interaction, messageReceive, flow, step, message, line,
				sysLine__messageSend____coveredBy,
				messageSend__sysLine____covered,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				messageSend__message____message,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered,
				message__interaction____interaction,
				interaction__message____message, flow__step____steps,
				step__actor____actor };
	}

	public static final void pattern_UserStepBFMessageRule_11_5_expressionBBBBBBBBBBBBBBBBBB(
			UserStepBFMessageRule _this, PerformRuleResult ruleresult,
			EObject actor, EObject sysActor, EObject packageDeclaration,
			EObject sysLine, EObject sysActorToSysLine, EObject messageSend,
			EObject interaction, EObject messageReceive, EObject flow,
			EObject flowToInteraction, EObject step, EObject message,
			EObject line, EObject useCase, EObject useCaseToInteraction,
			EObject actorToLine) {
		_this.registerObjects_BWD(ruleresult, actor, sysActor,
				packageDeclaration, sysLine, sysActorToSysLine, messageSend,
				interaction, messageReceive, flow, flowToInteraction, step,
				message, line, useCase, useCaseToInteraction, actorToLine);

	}

	public static final PerformRuleResult pattern_UserStepBFMessageRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_12_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_12_1_blackFBB(
			EClass eClass, UserStepBFMessageRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_12_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_12_1_binding = pattern_UserStepBFMessageRule_12_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_UserStepBFMessageRule_12_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_12_1_black = pattern_UserStepBFMessageRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_UserStepBFMessageRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UserStepBFMessageRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "UserStepBFMessageRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UserStepBFMessageRule_12_2_bindingFFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("sysLine");
		EObject _localVariable_1 = match.getObject("messageSend");
		EObject _localVariable_2 = match.getObject("interaction");
		EObject _localVariable_3 = match.getObject("messageReceive");
		EObject _localVariable_4 = match.getObject("message");
		EObject _localVariable_5 = match.getObject("line");
		EObject tmpSysLine = _localVariable_0;
		EObject tmpMessageSend = _localVariable_1;
		EObject tmpInteraction = _localVariable_2;
		EObject tmpMessageReceive = _localVariable_3;
		EObject tmpMessage = _localVariable_4;
		EObject tmpLine = _localVariable_5;
		if (tmpSysLine instanceof Lifeline) {
			Lifeline sysLine = (Lifeline) tmpSysLine;
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (tmpInteraction instanceof Interaction) {
					Interaction interaction = (Interaction) tmpInteraction;
					if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
						MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
						if (tmpMessage instanceof Message) {
							Message message = (Message) tmpMessage;
							if (tmpLine instanceof Lifeline) {
								Lifeline line = (Lifeline) tmpLine;
								return new Object[] { sysLine, messageSend,
										interaction, messageReceive, message,
										line, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_12_2_blackFFBFBBBFFBBFFFB(
			Lifeline sysLine, MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!messageReceive.equals(messageSend)) {
			if (!line.equals(sysLine)) {
				for (ActorToLifeline sysActorToSysLine : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(sysLine,
								ActorToLifeline.class, "target")) {
					Actor sysActor = sysActorToSysLine.getSource();
					if (sysActor != null) {
						for (FlowToInteractionFragment flowToInteraction : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(interaction,
										FlowToInteractionFragment.class,
										"target")) {
							Flow tmpFlow = flowToInteraction.getSource();
							if (tmpFlow instanceof BasicFlow) {
								BasicFlow flow = (BasicFlow) tmpFlow;
								for (UseCaseToInteraction useCaseToInteraction : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(interaction,
												UseCaseToInteraction.class,
												"target")) {
									UseCase useCase = useCaseToInteraction
											.getSource();
									if (useCase != null) {
										for (ActorToLifeline actorToLine : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														line,
														ActorToLifeline.class,
														"target")) {
											if (!actorToLine
													.equals(sysActorToSysLine)) {
												Actor actor = actorToLine
														.getSource();
												if (actor != null) {
													if (!actor.equals(sysActor)) {
														_result.add(new Object[] {
																actor,
																sysActor,
																sysLine,
																sysActorToSysLine,
																messageSend,
																interaction,
																messageReceive,
																flow,
																flowToInteraction,
																message,
																line,
																useCase,
																useCaseToInteraction,
																actorToLine,
																match });
													}
												}

											}
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

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_12_3_blackBBFBBBBBBBBBBBB(
			Actor actor, Actor sysActor, Lifeline sysLine,
			ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!actor.equals(sysActor)) {
			if (!messageReceive.equals(messageSend)) {
				if (!line.equals(sysLine)) {
					if (!actorToLine.equals(sysActorToSysLine)) {
						if (sysLine.getCoveredBy().contains(messageSend)) {
							if (sysActor.equals(sysActorToSysLine.getSource())) {
								if (sysLine.equals(sysActorToSysLine
										.getTarget())) {
									if (interaction.equals(messageSend
											.getEnclosingInteraction())) {
										if (interaction.equals(messageReceive
												.getEnclosingInteraction())) {
											if (flow.equals(flowToInteraction
													.getSource())) {
												if (interaction
														.equals(flowToInteraction
																.getTarget())) {
													if (messageSend
															.equals(message
																	.getSendEvent())) {
														if (messageReceive
																.equals(message
																		.getReceiveEvent())) {
															if (message
																	.equals(messageSend
																			.getMessage())) {
																if (message
																		.equals(messageReceive
																				.getMessage())) {
																	if (line.getCoveredBy()
																			.contains(
																					messageReceive)) {
																		if (useCase
																				.getFlows()
																				.contains(
																						flow)) {
																			if (interaction
																					.equals(line
																							.getInteraction())) {
																				if (interaction
																						.equals(message
																								.getInteraction())) {
																					if (useCase
																							.equals(useCaseToInteraction
																									.getSource())) {
																						if (interaction
																								.equals(useCaseToInteraction
																										.getTarget())) {
																							if (actor
																									.equals(actorToLine
																											.getSource())) {
																								if (line.equals(actorToLine
																										.getTarget())) {
																									for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
																											.getOppositeReferenceTyped(
																													actor,
																													PackageDeclaration.class,
																													"actors")) {
																										if (packageDeclaration
																												.getActors()
																												.contains(
																														sysActor)) {
																											if (packageDeclaration
																													.getUseCases()
																													.contains(
																															useCase)) {
																												_result.add(new Object[] {
																														actor,
																														sysActor,
																														packageDeclaration,
																														sysLine,
																														sysActorToSysLine,
																														messageSend,
																														interaction,
																														messageReceive,
																														flow,
																														flowToInteraction,
																														message,
																														line,
																														useCase,
																														useCaseToInteraction,
																														actorToLine });
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_12_3_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge packageDeclaration__actor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__sysActor____actors = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysLine__messageSend____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__sysLine____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysActorToSysLine__sysActor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sysActorToSysLine__sysLine____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageSend____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__interaction____enclosingInteraction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__messageReceive____fragment = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToInteraction__flow____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flowToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageSend____sendEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__messageReceive____receiveEvent = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageSend__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__messageReceive____coveredBy = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge messageReceive__line____covered = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge line__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__line____lifeline = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge message__interaction____interaction = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interaction__message____message = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__useCase____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge useCaseToInteraction__interaction____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__actor____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge actorToLine__line____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge packageDeclaration__useCase____useCases = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String packageDeclaration__actor____actors_name_prime = "actors";
		String packageDeclaration__sysActor____actors_name_prime = "actors";
		String sysLine__messageSend____coveredBy_name_prime = "coveredBy";
		String messageSend__sysLine____covered_name_prime = "covered";
		String sysActorToSysLine__sysActor____source_name_prime = "source";
		String sysActorToSysLine__sysLine____target_name_prime = "target";
		String messageSend__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageSend____fragment_name_prime = "fragment";
		String messageReceive__interaction____enclosingInteraction_name_prime = "enclosingInteraction";
		String interaction__messageReceive____fragment_name_prime = "fragment";
		String flowToInteraction__flow____source_name_prime = "source";
		String flowToInteraction__interaction____target_name_prime = "target";
		String message__messageSend____sendEvent_name_prime = "sendEvent";
		String message__messageReceive____receiveEvent_name_prime = "receiveEvent";
		String messageSend__message____message_name_prime = "message";
		String messageReceive__message____message_name_prime = "message";
		String line__messageReceive____coveredBy_name_prime = "coveredBy";
		String messageReceive__line____covered_name_prime = "covered";
		String useCase__flow____flows_name_prime = "flows";
		String line__interaction____interaction_name_prime = "interaction";
		String interaction__line____lifeline_name_prime = "lifeline";
		String message__interaction____interaction_name_prime = "interaction";
		String interaction__message____message_name_prime = "message";
		String useCaseToInteraction__useCase____source_name_prime = "source";
		String useCaseToInteraction__interaction____target_name_prime = "target";
		String actorToLine__actor____source_name_prime = "source";
		String actorToLine__line____target_name_prime = "target";
		String packageDeclaration__useCase____useCases_name_prime = "useCases";
		isApplicableMatch.getAllContextElements().add(actor);
		isApplicableMatch.getAllContextElements().add(sysActor);
		isApplicableMatch.getAllContextElements().add(packageDeclaration);
		isApplicableMatch.getAllContextElements().add(sysLine);
		isApplicableMatch.getAllContextElements().add(sysActorToSysLine);
		isApplicableMatch.getAllContextElements().add(messageSend);
		isApplicableMatch.getAllContextElements().add(interaction);
		isApplicableMatch.getAllContextElements().add(messageReceive);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(flowToInteraction);
		isApplicableMatch.getAllContextElements().add(message);
		isApplicableMatch.getAllContextElements().add(line);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(useCaseToInteraction);
		isApplicableMatch.getAllContextElements().add(actorToLine);
		packageDeclaration__actor____actors.setSrc(packageDeclaration);
		packageDeclaration__actor____actors.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__actor____actors);
		packageDeclaration__sysActor____actors.setSrc(packageDeclaration);
		packageDeclaration__sysActor____actors.setTrg(sysActor);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__sysActor____actors);
		sysLine__messageSend____coveredBy.setSrc(sysLine);
		sysLine__messageSend____coveredBy.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				sysLine__messageSend____coveredBy);
		messageSend__sysLine____covered.setSrc(messageSend);
		messageSend__sysLine____covered.setTrg(sysLine);
		isApplicableMatch.getAllContextElements().add(
				messageSend__sysLine____covered);
		sysActorToSysLine__sysActor____source.setSrc(sysActorToSysLine);
		sysActorToSysLine__sysActor____source.setTrg(sysActor);
		isApplicableMatch.getAllContextElements().add(
				sysActorToSysLine__sysActor____source);
		sysActorToSysLine__sysLine____target.setSrc(sysActorToSysLine);
		sysActorToSysLine__sysLine____target.setTrg(sysLine);
		isApplicableMatch.getAllContextElements().add(
				sysActorToSysLine__sysLine____target);
		messageSend__interaction____enclosingInteraction.setSrc(messageSend);
		messageSend__interaction____enclosingInteraction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				messageSend__interaction____enclosingInteraction);
		interaction__messageSend____fragment.setSrc(interaction);
		interaction__messageSend____fragment.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				interaction__messageSend____fragment);
		messageReceive__interaction____enclosingInteraction
				.setSrc(messageReceive);
		messageReceive__interaction____enclosingInteraction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__interaction____enclosingInteraction);
		interaction__messageReceive____fragment.setSrc(interaction);
		interaction__messageReceive____fragment.setTrg(messageReceive);
		isApplicableMatch.getAllContextElements().add(
				interaction__messageReceive____fragment);
		flowToInteraction__flow____source.setSrc(flowToInteraction);
		flowToInteraction__flow____source.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(
				flowToInteraction__flow____source);
		flowToInteraction__interaction____target.setSrc(flowToInteraction);
		flowToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				flowToInteraction__interaction____target);
		message__messageSend____sendEvent.setSrc(message);
		message__messageSend____sendEvent.setTrg(messageSend);
		isApplicableMatch.getAllContextElements().add(
				message__messageSend____sendEvent);
		message__messageReceive____receiveEvent.setSrc(message);
		message__messageReceive____receiveEvent.setTrg(messageReceive);
		isApplicableMatch.getAllContextElements().add(
				message__messageReceive____receiveEvent);
		messageSend__message____message.setSrc(messageSend);
		messageSend__message____message.setTrg(message);
		isApplicableMatch.getAllContextElements().add(
				messageSend__message____message);
		messageReceive__message____message.setSrc(messageReceive);
		messageReceive__message____message.setTrg(message);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__message____message);
		line__messageReceive____coveredBy.setSrc(line);
		line__messageReceive____coveredBy.setTrg(messageReceive);
		isApplicableMatch.getAllContextElements().add(
				line__messageReceive____coveredBy);
		messageReceive__line____covered.setSrc(messageReceive);
		messageReceive__line____covered.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				messageReceive__line____covered);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		line__interaction____interaction.setSrc(line);
		line__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				line__interaction____interaction);
		interaction__line____lifeline.setSrc(interaction);
		interaction__line____lifeline.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				interaction__line____lifeline);
		message__interaction____interaction.setSrc(message);
		message__interaction____interaction.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				message__interaction____interaction);
		interaction__message____message.setSrc(interaction);
		interaction__message____message.setTrg(message);
		isApplicableMatch.getAllContextElements().add(
				interaction__message____message);
		useCaseToInteraction__useCase____source.setSrc(useCaseToInteraction);
		useCaseToInteraction__useCase____source.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__useCase____source);
		useCaseToInteraction__interaction____target
				.setSrc(useCaseToInteraction);
		useCaseToInteraction__interaction____target.setTrg(interaction);
		isApplicableMatch.getAllContextElements().add(
				useCaseToInteraction__interaction____target);
		actorToLine__actor____source.setSrc(actorToLine);
		actorToLine__actor____source.setTrg(actor);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__actor____source);
		actorToLine__line____target.setSrc(actorToLine);
		actorToLine__line____target.setTrg(line);
		isApplicableMatch.getAllContextElements().add(
				actorToLine__line____target);
		packageDeclaration__useCase____useCases.setSrc(packageDeclaration);
		packageDeclaration__useCase____useCases.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(
				packageDeclaration__useCase____useCases);
		packageDeclaration__actor____actors
				.setName(packageDeclaration__actor____actors_name_prime);
		packageDeclaration__sysActor____actors
				.setName(packageDeclaration__sysActor____actors_name_prime);
		sysLine__messageSend____coveredBy
				.setName(sysLine__messageSend____coveredBy_name_prime);
		messageSend__sysLine____covered
				.setName(messageSend__sysLine____covered_name_prime);
		sysActorToSysLine__sysActor____source
				.setName(sysActorToSysLine__sysActor____source_name_prime);
		sysActorToSysLine__sysLine____target
				.setName(sysActorToSysLine__sysLine____target_name_prime);
		messageSend__interaction____enclosingInteraction
				.setName(messageSend__interaction____enclosingInteraction_name_prime);
		interaction__messageSend____fragment
				.setName(interaction__messageSend____fragment_name_prime);
		messageReceive__interaction____enclosingInteraction
				.setName(messageReceive__interaction____enclosingInteraction_name_prime);
		interaction__messageReceive____fragment
				.setName(interaction__messageReceive____fragment_name_prime);
		flowToInteraction__flow____source
				.setName(flowToInteraction__flow____source_name_prime);
		flowToInteraction__interaction____target
				.setName(flowToInteraction__interaction____target_name_prime);
		message__messageSend____sendEvent
				.setName(message__messageSend____sendEvent_name_prime);
		message__messageReceive____receiveEvent
				.setName(message__messageReceive____receiveEvent_name_prime);
		messageSend__message____message
				.setName(messageSend__message____message_name_prime);
		messageReceive__message____message
				.setName(messageReceive__message____message_name_prime);
		line__messageReceive____coveredBy
				.setName(line__messageReceive____coveredBy_name_prime);
		messageReceive__line____covered
				.setName(messageReceive__line____covered_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		line__interaction____interaction
				.setName(line__interaction____interaction_name_prime);
		interaction__line____lifeline
				.setName(interaction__line____lifeline_name_prime);
		message__interaction____interaction
				.setName(message__interaction____interaction_name_prime);
		interaction__message____message
				.setName(interaction__message____message_name_prime);
		useCaseToInteraction__useCase____source
				.setName(useCaseToInteraction__useCase____source_name_prime);
		useCaseToInteraction__interaction____target
				.setName(useCaseToInteraction__interaction____target_name_prime);
		actorToLine__actor____source
				.setName(actorToLine__actor____source_name_prime);
		actorToLine__line____target
				.setName(actorToLine__line____target_name_prime);
		packageDeclaration__useCase____useCases
				.setName(packageDeclaration__useCase____useCases_name_prime);
		return new Object[] { actor, sysActor, packageDeclaration, sysLine,
				sysActorToSysLine, messageSend, interaction, messageReceive,
				flow, flowToInteraction, message, line, useCase,
				useCaseToInteraction, actorToLine, isApplicableMatch,
				packageDeclaration__actor____actors,
				packageDeclaration__sysActor____actors,
				sysLine__messageSend____coveredBy,
				messageSend__sysLine____covered,
				sysActorToSysLine__sysActor____source,
				sysActorToSysLine__sysLine____target,
				messageSend__interaction____enclosingInteraction,
				interaction__messageSend____fragment,
				messageReceive__interaction____enclosingInteraction,
				interaction__messageReceive____fragment,
				flowToInteraction__flow____source,
				flowToInteraction__interaction____target,
				message__messageSend____sendEvent,
				message__messageReceive____receiveEvent,
				messageSend__message____message,
				messageReceive__message____message,
				line__messageReceive____coveredBy,
				messageReceive__line____covered, useCase__flow____flows,
				line__interaction____interaction,
				interaction__line____lifeline,
				message__interaction____interaction,
				interaction__message____message,
				useCaseToInteraction__useCase____source,
				useCaseToInteraction__interaction____target,
				actorToLine__actor____source, actorToLine__line____target,
				packageDeclaration__useCase____useCases };
	}

	public static final Object[] pattern_UserStepBFMessageRule_12_4_bindingFBBBBBBBBBBBBBBBBB(
			UserStepBFMessageRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, actor, sysActor, packageDeclaration,
				sysLine, sysActorToSysLine, messageSend, interaction,
				messageReceive, flow, flowToInteraction, message, line,
				useCase, useCaseToInteraction, actorToLine);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor,
					sysActor, packageDeclaration, sysLine, sysActorToSysLine,
					messageSend, interaction, messageReceive, flow,
					flowToInteraction, message, line, useCase,
					useCaseToInteraction, actorToLine };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_12_4_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserStepBFMessageRule_12_4_bindingAndBlackFBBBBBBBBBBBBBBBBB(
			UserStepBFMessageRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Message message,
			Lifeline line, UseCase useCase,
			UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		Object[] result_pattern_UserStepBFMessageRule_12_4_binding = pattern_UserStepBFMessageRule_12_4_bindingFBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, sysActor, packageDeclaration,
				sysLine, sysActorToSysLine, messageSend, interaction,
				messageReceive, flow, flowToInteraction, message, line,
				useCase, useCaseToInteraction, actorToLine);
		if (result_pattern_UserStepBFMessageRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_UserStepBFMessageRule_12_4_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_12_4_black = pattern_UserStepBFMessageRule_12_4_blackB(csp);
			if (result_pattern_UserStepBFMessageRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						sysActor, packageDeclaration, sysLine,
						sysActorToSysLine, messageSend, interaction,
						messageReceive, flow, flowToInteraction, message, line,
						useCase, useCaseToInteraction, actorToLine };
			}
		}
		return null;
	}

	public static final boolean pattern_UserStepBFMessageRule_12_5_expressionFBB(
			UserStepBFMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UserStepBFMessageRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UserStepBFMessageRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UserStepBFMessageRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_20_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_20_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_20_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_20_1_binding = pattern_UserStepBFMessageRule_20_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_20_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_20_1_black = pattern_UserStepBFMessageRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_20_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_261624 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_261624)) {
					if (!messageReceive.equals(__DEC_message_message_261624)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_20_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_20_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_20_2_blackFFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSysLine = _edge_coveredBy.getSrc();
		if (tmpSysLine instanceof Lifeline) {
			Lifeline sysLine = (Lifeline) tmpSysLine;
			EObject tmpMessageSend = _edge_coveredBy.getTrg();
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (sysLine.getCoveredBy().contains(messageSend)) {
					Interaction interaction = messageSend
							.getEnclosingInteraction();
					if (interaction != null) {
						Message message = messageSend.getMessage();
						if (message != null) {
							if (messageSend.equals(message.getSendEvent())) {
								if (interaction
										.equals(message.getInteraction())) {
									MessageEnd tmpMessageReceive = message
											.getReceiveEvent();
									if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
										if (!messageReceive.equals(messageSend)) {
											if (interaction
													.equals(messageReceive
															.getEnclosingInteraction())) {
												if (message
														.equals(messageReceive
																.getMessage())) {
													if (pattern_UserStepBFMessageRule_20_2_black_nac_1BB(
															message,
															messageSend) == null) {
														if (pattern_UserStepBFMessageRule_20_2_black_nac_0BBB(
																message,
																messageSend,
																messageReceive) == null) {
															if (pattern_UserStepBFMessageRule_20_2_black_nac_2BB(
																	message,
																	messageReceive) == null) {
																for (Lifeline line : interaction
																		.getLifeline()) {
																	if (!line
																			.equals(sysLine)) {
																		if (line.getCoveredBy()
																				.contains(
																						messageReceive)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_coveredBy });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_20_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_20_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_21_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_21_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_21_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_21_1_binding = pattern_UserStepBFMessageRule_21_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_21_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_21_1_black = pattern_UserStepBFMessageRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_21_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_344507 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_344507)) {
					if (!messageReceive.equals(__DEC_message_message_344507)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_21_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_21_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_21_2_blackFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_covered.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpSysLine = _edge_covered.getTrg();
			if (tmpSysLine instanceof Lifeline) {
				Lifeline sysLine = (Lifeline) tmpSysLine;
				if (sysLine.getCoveredBy().contains(messageSend)) {
					Interaction interaction = messageSend
							.getEnclosingInteraction();
					if (interaction != null) {
						Message message = messageSend.getMessage();
						if (message != null) {
							if (messageSend.equals(message.getSendEvent())) {
								if (interaction
										.equals(message.getInteraction())) {
									MessageEnd tmpMessageReceive = message
											.getReceiveEvent();
									if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
										MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
										if (!messageReceive.equals(messageSend)) {
											if (interaction
													.equals(messageReceive
															.getEnclosingInteraction())) {
												if (message
														.equals(messageReceive
																.getMessage())) {
													if (pattern_UserStepBFMessageRule_21_2_black_nac_1BB(
															message,
															messageSend) == null) {
														if (pattern_UserStepBFMessageRule_21_2_black_nac_0BBB(
																message,
																messageSend,
																messageReceive) == null) {
															if (pattern_UserStepBFMessageRule_21_2_black_nac_2BB(
																	message,
																	messageReceive) == null) {
																for (Lifeline line : interaction
																		.getLifeline()) {
																	if (!line
																			.equals(sysLine)) {
																		if (line.getCoveredBy()
																				.contains(
																						messageReceive)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_covered });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_21_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_21_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_22_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_22_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_22_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_22_1_binding = pattern_UserStepBFMessageRule_22_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_22_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_22_1_black = pattern_UserStepBFMessageRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_22_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_343878 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_343878)) {
					if (!messageReceive.equals(__DEC_message_message_343878)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_22_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_22_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_22_2_blackFFFFFFB(
			EMoflonEdge _edge_enclosingInteraction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_enclosingInteraction.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpInteraction = _edge_enclosingInteraction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(messageSend.getEnclosingInteraction())) {
					Message message = messageSend.getMessage();
					if (message != null) {
						if (messageSend.equals(message.getSendEvent())) {
							if (interaction.equals(message.getInteraction())) {
								MessageEnd tmpMessageReceive = message
										.getReceiveEvent();
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageReceive
												.getEnclosingInteraction())) {
											if (message.equals(messageReceive
													.getMessage())) {
												if (pattern_UserStepBFMessageRule_22_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_UserStepBFMessageRule_22_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_UserStepBFMessageRule_22_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															for (Lifeline sysLine : messageSend
																	.getCovered()) {
																for (Lifeline line : interaction
																		.getLifeline()) {
																	if (!line
																			.equals(sysLine)) {
																		if (line.getCoveredBy()
																				.contains(
																						messageReceive)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_enclosingInteraction });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_22_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_22_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_23_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_23_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_23_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_23_1_binding = pattern_UserStepBFMessageRule_23_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_23_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_23_1_black = pattern_UserStepBFMessageRule_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_23_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_187299 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_187299)) {
					if (!messageReceive.equals(__DEC_message_message_187299)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_23_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_23_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_23_2_blackFFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_fragment.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpMessageSend = _edge_fragment.getTrg();
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (interaction.equals(messageSend.getEnclosingInteraction())) {
					Message message = messageSend.getMessage();
					if (message != null) {
						if (messageSend.equals(message.getSendEvent())) {
							if (interaction.equals(message.getInteraction())) {
								MessageEnd tmpMessageReceive = message
										.getReceiveEvent();
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageReceive
												.getEnclosingInteraction())) {
											if (message.equals(messageReceive
													.getMessage())) {
												if (pattern_UserStepBFMessageRule_23_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_UserStepBFMessageRule_23_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_UserStepBFMessageRule_23_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															for (Lifeline line : interaction
																	.getLifeline()) {
																if (line.getCoveredBy()
																		.contains(
																				messageReceive)) {
																	for (Lifeline sysLine : messageSend
																			.getCovered()) {
																		if (!line
																				.equals(sysLine)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_fragment });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_23_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_23_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_24_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_24_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_24_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_24_1_binding = pattern_UserStepBFMessageRule_24_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_24_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_24_1_black = pattern_UserStepBFMessageRule_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_24_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_490066 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_490066)) {
					if (!messageReceive.equals(__DEC_message_message_490066)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_24_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_24_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_24_2_blackFFFFFFB(
			EMoflonEdge _edge_enclosingInteraction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageReceive = _edge_enclosingInteraction.getSrc();
		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
			EObject tmpInteraction = _edge_enclosingInteraction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction
						.equals(messageReceive.getEnclosingInteraction())) {
					Message message = messageReceive.getMessage();
					if (message != null) {
						if (messageReceive.equals(message.getReceiveEvent())) {
							if (interaction.equals(message.getInteraction())) {
								MessageEnd tmpMessageSend = message
										.getSendEvent();
								if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageSend
												.getEnclosingInteraction())) {
											if (message.equals(messageSend
													.getMessage())) {
												if (pattern_UserStepBFMessageRule_24_2_black_nac_2BB(
														message, messageReceive) == null) {
													if (pattern_UserStepBFMessageRule_24_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_UserStepBFMessageRule_24_2_black_nac_1BB(
																message,
																messageSend) == null) {
															for (Lifeline line : messageReceive
																	.getCovered()) {
																if (interaction
																		.equals(line
																				.getInteraction())) {
																	for (Lifeline sysLine : messageSend
																			.getCovered()) {
																		if (!line
																				.equals(sysLine)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_enclosingInteraction });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_24_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_24_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_25_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_25_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_25_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_25_1_binding = pattern_UserStepBFMessageRule_25_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_25_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_25_1_black = pattern_UserStepBFMessageRule_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_25_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_501947 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_501947)) {
					if (!messageReceive.equals(__DEC_message_message_501947)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_25_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_25_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_25_2_blackFFFFFFB(
			EMoflonEdge _edge_fragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_fragment.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpMessageReceive = _edge_fragment.getTrg();
			if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
				if (interaction
						.equals(messageReceive.getEnclosingInteraction())) {
					Message message = messageReceive.getMessage();
					if (message != null) {
						if (messageReceive.equals(message.getReceiveEvent())) {
							if (interaction.equals(message.getInteraction())) {
								MessageEnd tmpMessageSend = message
										.getSendEvent();
								if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageSend
												.getEnclosingInteraction())) {
											if (message.equals(messageSend
													.getMessage())) {
												if (pattern_UserStepBFMessageRule_25_2_black_nac_2BB(
														message, messageReceive) == null) {
													if (pattern_UserStepBFMessageRule_25_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_UserStepBFMessageRule_25_2_black_nac_1BB(
																message,
																messageSend) == null) {
															for (Lifeline line : interaction
																	.getLifeline()) {
																if (line.getCoveredBy()
																		.contains(
																				messageReceive)) {
																	for (Lifeline sysLine : messageSend
																			.getCovered()) {
																		if (!line
																				.equals(sysLine)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_fragment });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_25_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_25_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_26_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_26_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_26_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_26_1_binding = pattern_UserStepBFMessageRule_26_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_26_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_26_1_black = pattern_UserStepBFMessageRule_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_26_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_602063 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_602063)) {
					if (!messageReceive.equals(__DEC_message_message_602063)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_26_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_26_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_26_2_blackFFFFFFB(
			EMoflonEdge _edge_sendEvent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessage = _edge_sendEvent.getSrc();
		if (tmpMessage instanceof Message) {
			Message message = (Message) tmpMessage;
			EObject tmpMessageSend = _edge_sendEvent.getTrg();
			if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
				if (messageSend.equals(message.getSendEvent())) {
					if (message.equals(messageSend.getMessage())) {
						MessageEnd tmpMessageReceive = message
								.getReceiveEvent();
						if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
							if (!messageReceive.equals(messageSend)) {
								if (message.equals(messageReceive.getMessage())) {
									Interaction interaction = message
											.getInteraction();
									if (interaction != null) {
										if (interaction.equals(messageSend
												.getEnclosingInteraction())) {
											if (interaction
													.equals(messageReceive
															.getEnclosingInteraction())) {
												if (pattern_UserStepBFMessageRule_26_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_UserStepBFMessageRule_26_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_UserStepBFMessageRule_26_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															for (Lifeline sysLine : messageSend
																	.getCovered()) {
																for (Lifeline line : messageReceive
																		.getCovered()) {
																	if (!line
																			.equals(sysLine)) {
																		if (interaction
																				.equals(line
																						.getInteraction())) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_sendEvent });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_26_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_26_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_27_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_27_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_27_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_27_1_binding = pattern_UserStepBFMessageRule_27_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_27_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_27_1_black = pattern_UserStepBFMessageRule_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_27_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_105958 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_105958)) {
					if (!messageReceive.equals(__DEC_message_message_105958)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_27_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_27_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_27_2_blackFFFFFFB(
			EMoflonEdge _edge_receiveEvent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessage = _edge_receiveEvent.getSrc();
		if (tmpMessage instanceof Message) {
			Message message = (Message) tmpMessage;
			EObject tmpMessageReceive = _edge_receiveEvent.getTrg();
			if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
				if (messageReceive.equals(message.getReceiveEvent())) {
					if (message.equals(messageReceive.getMessage())) {
						MessageEnd tmpMessageSend = message.getSendEvent();
						if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
							MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
							if (!messageReceive.equals(messageSend)) {
								if (message.equals(messageSend.getMessage())) {
									Interaction interaction = message
											.getInteraction();
									if (interaction != null) {
										if (interaction.equals(messageSend
												.getEnclosingInteraction())) {
											if (interaction
													.equals(messageReceive
															.getEnclosingInteraction())) {
												if (pattern_UserStepBFMessageRule_27_2_black_nac_2BB(
														message, messageReceive) == null) {
													if (pattern_UserStepBFMessageRule_27_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_UserStepBFMessageRule_27_2_black_nac_1BB(
																message,
																messageSend) == null) {
															for (Lifeline line : messageReceive
																	.getCovered()) {
																if (interaction
																		.equals(line
																				.getInteraction())) {
																	for (Lifeline sysLine : messageSend
																			.getCovered()) {
																		if (!line
																				.equals(sysLine)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_receiveEvent });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_27_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_27_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_28_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_28_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_28_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_28_1_binding = pattern_UserStepBFMessageRule_28_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_28_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_28_1_black = pattern_UserStepBFMessageRule_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_28_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_357421 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_357421)) {
					if (!messageReceive.equals(__DEC_message_message_357421)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_28_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_28_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_28_2_blackFFFFFFB(
			EMoflonEdge _edge_message) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageSend = _edge_message.getSrc();
		if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
			EObject tmpMessage = _edge_message.getTrg();
			if (tmpMessage instanceof Message) {
				Message message = (Message) tmpMessage;
				if (messageSend.equals(message.getSendEvent())) {
					if (message.equals(messageSend.getMessage())) {
						Interaction interaction = messageSend
								.getEnclosingInteraction();
						if (interaction != null) {
							if (interaction.equals(message.getInteraction())) {
								MessageEnd tmpMessageReceive = message
										.getReceiveEvent();
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageReceive
												.getEnclosingInteraction())) {
											if (message.equals(messageReceive
													.getMessage())) {
												if (pattern_UserStepBFMessageRule_28_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_UserStepBFMessageRule_28_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_UserStepBFMessageRule_28_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															for (Lifeline sysLine : messageSend
																	.getCovered()) {
																for (Lifeline line : interaction
																		.getLifeline()) {
																	if (!line
																			.equals(sysLine)) {
																		if (line.getCoveredBy()
																				.contains(
																						messageReceive)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_message });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_28_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_28_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_28_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_28_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_28_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_28_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_29_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_29_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_29_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_29_1_binding = pattern_UserStepBFMessageRule_29_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_29_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_29_1_black = pattern_UserStepBFMessageRule_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_29_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_190806 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_190806)) {
					if (!messageReceive.equals(__DEC_message_message_190806)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_29_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_29_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_29_2_blackFFFFFFB(
			EMoflonEdge _edge_message) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageReceive = _edge_message.getSrc();
		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
			EObject tmpMessage = _edge_message.getTrg();
			if (tmpMessage instanceof Message) {
				Message message = (Message) tmpMessage;
				if (messageReceive.equals(message.getReceiveEvent())) {
					if (message.equals(messageReceive.getMessage())) {
						Interaction interaction = messageReceive
								.getEnclosingInteraction();
						if (interaction != null) {
							if (interaction.equals(message.getInteraction())) {
								MessageEnd tmpMessageSend = message
										.getSendEvent();
								if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageSend
												.getEnclosingInteraction())) {
											if (message.equals(messageSend
													.getMessage())) {
												if (pattern_UserStepBFMessageRule_29_2_black_nac_2BB(
														message, messageReceive) == null) {
													if (pattern_UserStepBFMessageRule_29_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_UserStepBFMessageRule_29_2_black_nac_1BB(
																message,
																messageSend) == null) {
															for (Lifeline line : messageReceive
																	.getCovered()) {
																if (interaction
																		.equals(line
																				.getInteraction())) {
																	for (Lifeline sysLine : messageSend
																			.getCovered()) {
																		if (!line
																				.equals(sysLine)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_message });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_29_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_29_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_29_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_29_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_29_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_29_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_30_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_30_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_30_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_30_1_binding = pattern_UserStepBFMessageRule_30_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_30_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_30_1_black = pattern_UserStepBFMessageRule_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_30_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_790820 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_790820)) {
					if (!messageReceive.equals(__DEC_message_message_790820)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_30_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_30_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_30_2_blackFFFFFFB(
			EMoflonEdge _edge_coveredBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLine = _edge_coveredBy.getSrc();
		if (tmpLine instanceof Lifeline) {
			Lifeline line = (Lifeline) tmpLine;
			EObject tmpMessageReceive = _edge_coveredBy.getTrg();
			if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
				if (line.getCoveredBy().contains(messageReceive)) {
					Interaction interaction = line.getInteraction();
					if (interaction != null) {
						if (interaction.equals(messageReceive
								.getEnclosingInteraction())) {
							Message message = messageReceive.getMessage();
							if (message != null) {
								if (messageReceive.equals(message
										.getReceiveEvent())) {
									if (interaction.equals(message
											.getInteraction())) {
										MessageEnd tmpMessageSend = message
												.getSendEvent();
										if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
											MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
											if (!messageReceive
													.equals(messageSend)) {
												if (interaction
														.equals(messageSend
																.getEnclosingInteraction())) {
													if (message
															.equals(messageSend
																	.getMessage())) {
														if (pattern_UserStepBFMessageRule_30_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															if (pattern_UserStepBFMessageRule_30_2_black_nac_0BBB(
																	message,
																	messageSend,
																	messageReceive) == null) {
																if (pattern_UserStepBFMessageRule_30_2_black_nac_1BB(
																		message,
																		messageSend) == null) {
																	for (Lifeline sysLine : messageSend
																			.getCovered()) {
																		if (!line
																				.equals(sysLine)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_coveredBy });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_30_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_30_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_30_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_30_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_30_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_30_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_31_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_31_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_31_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_31_1_binding = pattern_UserStepBFMessageRule_31_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_31_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_31_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_31_1_black = pattern_UserStepBFMessageRule_31_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_31_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_31_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_31_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_31_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_44525 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_44525)) {
					if (!messageReceive.equals(__DEC_message_message_44525)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_31_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_31_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_31_2_blackFFFFFFB(
			EMoflonEdge _edge_covered) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessageReceive = _edge_covered.getSrc();
		if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
			MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
			EObject tmpLine = _edge_covered.getTrg();
			if (tmpLine instanceof Lifeline) {
				Lifeline line = (Lifeline) tmpLine;
				if (line.getCoveredBy().contains(messageReceive)) {
					Interaction interaction = messageReceive
							.getEnclosingInteraction();
					if (interaction != null) {
						if (interaction.equals(line.getInteraction())) {
							Message message = messageReceive.getMessage();
							if (message != null) {
								if (messageReceive.equals(message
										.getReceiveEvent())) {
									if (interaction.equals(message
											.getInteraction())) {
										MessageEnd tmpMessageSend = message
												.getSendEvent();
										if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
											MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
											if (!messageReceive
													.equals(messageSend)) {
												if (interaction
														.equals(messageSend
																.getEnclosingInteraction())) {
													if (message
															.equals(messageSend
																	.getMessage())) {
														if (pattern_UserStepBFMessageRule_31_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															if (pattern_UserStepBFMessageRule_31_2_black_nac_0BBB(
																	message,
																	messageSend,
																	messageReceive) == null) {
																if (pattern_UserStepBFMessageRule_31_2_black_nac_1BB(
																		message,
																		messageSend) == null) {
																	for (Lifeline sysLine : messageSend
																			.getCovered()) {
																		if (!line
																				.equals(sysLine)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_covered });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_31_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_31_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_31_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_31_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_31_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_31_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_32_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_32_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_32_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_32_1_binding = pattern_UserStepBFMessageRule_32_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_32_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_32_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_32_1_black = pattern_UserStepBFMessageRule_32_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_32_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_32_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_32_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_32_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_644586 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_644586)) {
					if (!messageReceive.equals(__DEC_message_message_644586)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_32_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_32_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_32_2_blackFFFFFFB(
			EMoflonEdge _edge_interaction) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMessage = _edge_interaction.getSrc();
		if (tmpMessage instanceof Message) {
			Message message = (Message) tmpMessage;
			EObject tmpInteraction = _edge_interaction.getTrg();
			if (tmpInteraction instanceof Interaction) {
				Interaction interaction = (Interaction) tmpInteraction;
				if (interaction.equals(message.getInteraction())) {
					MessageEnd tmpMessageSend = message.getSendEvent();
					if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
						MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
						if (interaction.equals(messageSend
								.getEnclosingInteraction())) {
							if (message.equals(messageSend.getMessage())) {
								MessageEnd tmpMessageReceive = message
										.getReceiveEvent();
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageReceive
												.getEnclosingInteraction())) {
											if (message.equals(messageReceive
													.getMessage())) {
												if (pattern_UserStepBFMessageRule_32_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_UserStepBFMessageRule_32_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_UserStepBFMessageRule_32_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															for (Lifeline line : interaction
																	.getLifeline()) {
																if (line.getCoveredBy()
																		.contains(
																				messageReceive)) {
																	for (Lifeline sysLine : messageSend
																			.getCovered()) {
																		if (!line
																				.equals(sysLine)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_interaction });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_32_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_32_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_32_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_32_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_32_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_32_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_33_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_33_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_33_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_33_1_binding = pattern_UserStepBFMessageRule_33_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_33_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_33_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_33_1_black = pattern_UserStepBFMessageRule_33_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_33_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_33_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_33_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_33_2_black_nac_0BBB(
			Message message, MessageOccurrenceSpecification messageSend,
			MessageOccurrenceSpecification messageReceive) {
		if (!messageReceive.equals(messageSend)) {
			for (MessageEnd __DEC_message_message_747818 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(message, MessageEnd.class,
							"message")) {
				if (!messageSend.equals(__DEC_message_message_747818)) {
					if (!messageReceive.equals(__DEC_message_message_747818)) {
						return new Object[] { message, messageSend,
								messageReceive };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_33_2_black_nac_1BB(
			Message message, MessageOccurrenceSpecification messageSend) {
		if (messageSend.equals(message.getReceiveEvent())) {
			return new Object[] { message, messageSend };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_33_2_black_nac_2BB(
			Message message, MessageOccurrenceSpecification messageReceive) {
		if (messageReceive.equals(message.getSendEvent())) {
			return new Object[] { message, messageReceive };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_33_2_blackFFFFFFB(
			EMoflonEdge _edge_message) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInteraction = _edge_message.getSrc();
		if (tmpInteraction instanceof Interaction) {
			Interaction interaction = (Interaction) tmpInteraction;
			EObject tmpMessage = _edge_message.getTrg();
			if (tmpMessage instanceof Message) {
				Message message = (Message) tmpMessage;
				if (interaction.equals(message.getInteraction())) {
					MessageEnd tmpMessageSend = message.getSendEvent();
					if (tmpMessageSend instanceof MessageOccurrenceSpecification) {
						MessageOccurrenceSpecification messageSend = (MessageOccurrenceSpecification) tmpMessageSend;
						if (interaction.equals(messageSend
								.getEnclosingInteraction())) {
							if (message.equals(messageSend.getMessage())) {
								MessageEnd tmpMessageReceive = message
										.getReceiveEvent();
								if (tmpMessageReceive instanceof MessageOccurrenceSpecification) {
									MessageOccurrenceSpecification messageReceive = (MessageOccurrenceSpecification) tmpMessageReceive;
									if (!messageReceive.equals(messageSend)) {
										if (interaction.equals(messageReceive
												.getEnclosingInteraction())) {
											if (message.equals(messageReceive
													.getMessage())) {
												if (pattern_UserStepBFMessageRule_33_2_black_nac_1BB(
														message, messageSend) == null) {
													if (pattern_UserStepBFMessageRule_33_2_black_nac_0BBB(
															message,
															messageSend,
															messageReceive) == null) {
														if (pattern_UserStepBFMessageRule_33_2_black_nac_2BB(
																message,
																messageReceive) == null) {
															for (Lifeline line : interaction
																	.getLifeline()) {
																if (line.getCoveredBy()
																		.contains(
																				messageReceive)) {
																	for (Lifeline sysLine : messageSend
																			.getCovered()) {
																		if (!line
																				.equals(sysLine)) {
																			_result.add(new Object[] {
																					sysLine,
																					messageSend,
																					interaction,
																					messageReceive,
																					message,
																					line,
																					_edge_message });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_33_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_33_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Lifeline sysLine,
			MessageOccurrenceSpecification messageSend,
			Interaction interaction,
			MessageOccurrenceSpecification messageReceive, Message message,
			Lifeline line) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sysLine,
				messageSend, interaction, messageReceive, message, line);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_33_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_33_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_33_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_33_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_34_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_34_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_34_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_34_1_binding = pattern_UserStepBFMessageRule_34_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_34_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_34_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_34_1_black = pattern_UserStepBFMessageRule_34_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_34_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_34_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_34_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_34_2_blackFFFFFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof BasicFlow) {
			BasicFlow flow = (BasicFlow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					Actor actor = step.getActor();
					if (actor != null) {
						for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(flow, UseCase.class,
										"flows")) {
							for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(actor,
											PackageDeclaration.class, "actors")) {
								if (packageDeclaration.getUseCases().contains(
										useCase)) {
									for (Actor sysActor : packageDeclaration
											.getActors()) {
										if (!actor.equals(sysActor)) {
											_result.add(new Object[] { actor,
													sysActor,
													packageDeclaration, flow,
													step, useCase, _edge_steps });
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

	public static final Object[] pattern_UserStepBFMessageRule_34_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_34_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Actor actor,
			Actor sysActor, PackageDeclaration packageDeclaration,
			BasicFlow flow, NormalStep step, UseCase useCase) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor,
				sysActor, packageDeclaration, flow, step, useCase);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_34_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_34_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_34_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_34_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_35_1_bindingFB(
			UserStepBFMessageRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_35_1_blackFBB(
			EClass __eClass, UserStepBFMessageRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_35_1_bindingAndBlackFFB(
			UserStepBFMessageRule _this) {
		Object[] result_pattern_UserStepBFMessageRule_35_1_binding = pattern_UserStepBFMessageRule_35_1_bindingFB(_this);
		if (result_pattern_UserStepBFMessageRule_35_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_UserStepBFMessageRule_35_1_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_35_1_black = pattern_UserStepBFMessageRule_35_1_blackFBB(
					__eClass, _this);
			if (result_pattern_UserStepBFMessageRule_35_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UserStepBFMessageRule_35_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_35_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_35_2_blackFFFFFFB(
			EMoflonEdge _edge_actor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStep = _edge_actor.getSrc();
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			EObject tmpActor = _edge_actor.getTrg();
			if (tmpActor instanceof Actor) {
				Actor actor = (Actor) tmpActor;
				if (actor.equals(step.getActor())) {
					for (Flow tmpFlow : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(step, Flow.class,
									"steps")) {
						if (tmpFlow instanceof BasicFlow) {
							BasicFlow flow = (BasicFlow) tmpFlow;
							for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(actor,
											PackageDeclaration.class, "actors")) {
								for (Actor sysActor : packageDeclaration
										.getActors()) {
									if (!actor.equals(sysActor)) {
										for (UseCase useCase : packageDeclaration
												.getUseCases()) {
											if (useCase.getFlows().contains(
													flow)) {
												_result.add(new Object[] {
														actor, sysActor,
														packageDeclaration,
														flow, step, useCase,
														_edge_actor });
											}
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

	public static final Object[] pattern_UserStepBFMessageRule_35_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UserStepBFMessageRule_35_3_expressionFBBBBBBBB(
			UserStepBFMessageRule _this, Match match, Actor actor,
			Actor sysActor, PackageDeclaration packageDeclaration,
			BasicFlow flow, NormalStep step, UseCase useCase) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, actor,
				sysActor, packageDeclaration, flow, step, useCase);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UserStepBFMessageRule_35_4_expressionFBB(
			UserStepBFMessageRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_35_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_UserStepBFMessageRule_35_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_UserStepBFMessageRule_35_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_1_blackB(
			UserStepBFMessageRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Actor actor) {
		if (ruleResult.getSourceObjects().contains(actor)) {
			return new Object[] { ruleResult, actor };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult,
			PackageDeclaration packageDeclaration) {
		if (ruleResult.getSourceObjects().contains(packageDeclaration)) {
			return new Object[] { ruleResult, packageDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Actor sysActor) {
		if (ruleResult.getSourceObjects().contains(sysActor)) {
			return new Object[] { ruleResult, sysActor };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult,
			ActorToLifeline sysActorToSysLine) {
		if (ruleResult.getCorrObjects().contains(sysActorToSysLine)) {
			return new Object[] { ruleResult, sysActorToSysLine };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Lifeline sysLine) {
		if (ruleResult.getTargetObjects().contains(sysLine)) {
			return new Object[] { ruleResult, sysLine };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, UseCase useCase) {
		if (ruleResult.getSourceObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, BasicFlow flow) {
		if (ruleResult.getSourceObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult,
			FlowToInteractionFragment flowToInteraction) {
		if (ruleResult.getCorrObjects().contains(flowToInteraction)) {
			return new Object[] { ruleResult, flowToInteraction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, Interaction interaction) {
		if (ruleResult.getTargetObjects().contains(interaction)) {
			return new Object[] { ruleResult, interaction };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_2_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, Lifeline line) {
		if (ruleResult.getTargetObjects().contains(line)) {
			return new Object[] { ruleResult, line };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_2_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult, ActorToLifeline actorToLine) {
		if (ruleResult.getCorrObjects().contains(actorToLine)) {
			return new Object[] { ruleResult, actorToLine };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_2_black_nac_11BB(
			ModelgeneratorRuleResult ruleResult,
			UseCaseToInteraction useCaseToInteraction) {
		if (ruleResult.getCorrObjects().contains(useCaseToInteraction)) {
			return new Object[] { ruleResult, useCaseToInteraction };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UserStepBFMessageRule_38_2_blackFFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList sysActorToSysLineList : ruleEntryContainer
				.getRuleEntryList()) {
			for (EObject tmpSysActorToSysLine : sysActorToSysLineList
					.getEntryObjects()) {
				if (tmpSysActorToSysLine instanceof ActorToLifeline) {
					ActorToLifeline sysActorToSysLine = (ActorToLifeline) tmpSysActorToSysLine;
					Actor sysActor = sysActorToSysLine.getSource();
					if (sysActor != null) {
						Lifeline sysLine = sysActorToSysLine.getTarget();
						if (sysLine != null) {
							if (pattern_UserStepBFMessageRule_38_2_black_nac_3BB(
									ruleResult, sysActorToSysLine) == null) {
								if (pattern_UserStepBFMessageRule_38_2_black_nac_2BB(
										ruleResult, sysActor) == null) {
									if (pattern_UserStepBFMessageRule_38_2_black_nac_4BB(
											ruleResult, sysLine) == null) {
										for (PackageDeclaration packageDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														sysActor,
														PackageDeclaration.class,
														"actors")) {
											if (pattern_UserStepBFMessageRule_38_2_black_nac_1BB(
													ruleResult,
													packageDeclaration) == null) {
												for (Actor actor : packageDeclaration
														.getActors()) {
													if (!actor.equals(sysActor)) {
														if (pattern_UserStepBFMessageRule_38_2_black_nac_0BB(
																ruleResult,
																actor) == null) {
															for (UseCase useCase : packageDeclaration
																	.getUseCases()) {
																if (pattern_UserStepBFMessageRule_38_2_black_nac_5BB(
																		ruleResult,
																		useCase) == null) {
																	for (Flow tmpFlow : useCase
																			.getFlows()) {
																		if (tmpFlow instanceof BasicFlow) {
																			BasicFlow flow = (BasicFlow) tmpFlow;
																			if (pattern_UserStepBFMessageRule_38_2_black_nac_6BB(
																					ruleResult,
																					flow) == null) {
																				for (ActorToLifeline actorToLine : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(
																								actor,
																								ActorToLifeline.class,
																								"source")) {
																					if (!actorToLine
																							.equals(sysActorToSysLine)) {
																						Lifeline line = actorToLine
																								.getTarget();
																						if (line != null) {
																							if (!line
																									.equals(sysLine)) {
																								Interaction interaction = line
																										.getInteraction();
																								if (interaction != null) {
																									if (pattern_UserStepBFMessageRule_38_2_black_nac_10BB(
																											ruleResult,
																											actorToLine) == null) {
																										if (pattern_UserStepBFMessageRule_38_2_black_nac_9BB(
																												ruleResult,
																												line) == null) {
																											if (pattern_UserStepBFMessageRule_38_2_black_nac_8BB(
																													ruleResult,
																													interaction) == null) {
																												for (UseCaseToInteraction useCaseToInteraction : org.moflon.core.utilities.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																useCase,
																																UseCaseToInteraction.class,
																																"source")) {
																													if (interaction
																															.equals(useCaseToInteraction
																																	.getTarget())) {
																														if (pattern_UserStepBFMessageRule_38_2_black_nac_11BB(
																																ruleResult,
																																useCaseToInteraction) == null) {
																															for (FlowToInteractionFragment flowToInteraction : org.moflon.core.utilities.eMoflonEMFUtil
																																	.getOppositeReferenceTyped(
																																			flow,
																																			FlowToInteractionFragment.class,
																																			"source")) {
																																if (interaction
																																		.equals(flowToInteraction
																																				.getTarget())) {
																																	if (pattern_UserStepBFMessageRule_38_2_black_nac_7BB(
																																			ruleResult,
																																			flowToInteraction) == null) {
																																		_result.add(new Object[] {
																																				sysActorToSysLineList,
																																				actor,
																																				packageDeclaration,
																																				sysActor,
																																				sysActorToSysLine,
																																				sysLine,
																																				useCase,
																																				flow,
																																				flowToInteraction,
																																				interaction,
																																				line,
																																				actorToLine,
																																				useCaseToInteraction,
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
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_3_bindingFBBBBBBBBBBBBBBB(
			UserStepBFMessageRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, actor, sysActor, packageDeclaration,
				sysLine, sysActorToSysLine, interaction, flow,
				flowToInteraction, line, useCase, useCaseToInteraction,
				actorToLine, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, actor,
					sysActor, packageDeclaration, sysLine, sysActorToSysLine,
					interaction, flow, flowToInteraction, line, useCase,
					useCaseToInteraction, actorToLine, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_3_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_3_bindingAndBlackFBBBBBBBBBBBBBBB(
			UserStepBFMessageRule _this, IsApplicableMatch isApplicableMatch,
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UserStepBFMessageRule_38_3_binding = pattern_UserStepBFMessageRule_38_3_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, actor, sysActor, packageDeclaration,
				sysLine, sysActorToSysLine, interaction, flow,
				flowToInteraction, line, useCase, useCaseToInteraction,
				actorToLine, ruleResult);
		if (result_pattern_UserStepBFMessageRule_38_3_binding != null) {
			CSP csp = (CSP) result_pattern_UserStepBFMessageRule_38_3_binding[0];

			Object[] result_pattern_UserStepBFMessageRule_38_3_black = pattern_UserStepBFMessageRule_38_3_blackB(csp);
			if (result_pattern_UserStepBFMessageRule_38_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, actor,
						sysActor, packageDeclaration, sysLine,
						sysActorToSysLine, interaction, flow,
						flowToInteraction, line, useCase, useCaseToInteraction,
						actorToLine, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UserStepBFMessageRule_38_4_expressionFBB(
			UserStepBFMessageRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_5_blackBBBBBBBBBBBB(
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine) {
		if (!actor.equals(sysActor)) {
			if (!line.equals(sysLine)) {
				if (!actorToLine.equals(sysActorToSysLine)) {
					return new Object[] { actor, sysActor, packageDeclaration,
							sysLine, sysActorToSysLine, interaction, flow,
							flowToInteraction, line, useCase,
							useCaseToInteraction, actorToLine };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_6_blackBBBBBBBBBBBBB(
			Actor actor, Actor sysActor, PackageDeclaration packageDeclaration,
			Lifeline sysLine, ActorToLifeline sysActorToSysLine,
			Interaction interaction, BasicFlow flow,
			FlowToInteractionFragment flowToInteraction, Lifeline line,
			UseCase useCase, UseCaseToInteraction useCaseToInteraction,
			ActorToLifeline actorToLine, ModelgeneratorRuleResult ruleResult) {
		if (!actor.equals(sysActor)) {
			if (!line.equals(sysLine)) {
				if (!actorToLine.equals(sysActorToSysLine)) {
					return new Object[] { actor, sysActor, packageDeclaration,
							sysLine, sysActorToSysLine, interaction, flow,
							flowToInteraction, line, useCase,
							useCaseToInteraction, actorToLine, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UserStepBFMessageRule_38_6_greenBBFBFBFFBBB(
			Actor actor, Lifeline sysLine, Interaction interaction,
			BasicFlow flow, Lifeline line, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		MessageOccurrenceSpecification messageSend = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		MessageOccurrenceSpecification messageReceive = ModalSequenceDiagramFactory.eINSTANCE
				.createMessageOccurrenceSpecification();
		NormalStep step = UseCaseDSLFactory.eINSTANCE.createNormalStep();
		Message message = ModalSequenceDiagramFactory.eINSTANCE.createMessage();
		Object _localVariable_0 = csp.getValue("step", "type");
		Object _localVariable_1 = csp.getValue("step", "name");
		Object _localVariable_2 = csp.getValue("step", "label");
		Object _localVariable_3 = csp.getValue("message", "messageSort");
		Object _localVariable_4 = csp.getValue("message", "messageKind");
		Object _localVariable_5 = csp.getValue("message", "_id");
		Object _localVariable_6 = csp.getValue("message", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_7 = ruleResult.getIncrementedPerformCount();
		sysLine.getCoveredBy().add(messageSend);
		messageSend.setEnclosingInteraction(interaction);
		ruleResult.getTargetObjects().add(messageSend);
		messageReceive.setEnclosingInteraction(interaction);
		line.getCoveredBy().add(messageReceive);
		ruleResult.getTargetObjects().add(messageReceive);
		flow.getSteps().add(step);
		step.setActor(actor);
		ruleResult.getSourceObjects().add(step);
		message.setSendEvent(messageSend);
		message.setReceiveEvent(messageReceive);
		messageSend.setMessage(message);
		messageReceive.setMessage(message);
		message.setInteraction(interaction);
		ruleResult.getTargetObjects().add(message);
		StepType step_type_prime = (StepType) _localVariable_0;
		String step_name_prime = (String) _localVariable_1;
		String step_label_prime = (String) _localVariable_2;
		MessageSort message_messageSort_prime = (MessageSort) _localVariable_3;
		MessageKind message_messageKind_prime = (MessageKind) _localVariable_4;
		String message__id_prime = (String) _localVariable_5;
		String message_name_prime = (String) _localVariable_6;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_7);
		step.setType(step_type_prime);
		step.setName(step_name_prime);
		step.setLabel(step_label_prime);
		message.setMessageSort(message_messageSort_prime);
		message.setMessageKind(message_messageKind_prime);
		message.set_id(message__id_prime);
		message.setName(message_name_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { actor, sysLine, messageSend, interaction,
				messageReceive, flow, step, message, line, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UserStepBFMessageRule_38_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UserStepBFMessageRuleImpl
