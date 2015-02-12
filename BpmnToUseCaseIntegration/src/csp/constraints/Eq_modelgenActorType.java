package csp.constraints;

import TGGLanguage.csp.Variable;
import TGGLanguage.csp.impl.TGGConstraintImpl;
import UseCaseDSL.ActorType;

public class Eq_modelgenActorType extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1){
		ActorType attributeValue = (ActorType) var_0.getValue();
		ActorType literalValue = ActorType.valueOf(var_1.toString());
		
    	String bindingStates = getBindingStates(var_0, var_1);
    	
    	switch(bindingStates){
    	case "BB":
    		setSatisfied(attributeValue.equals(literalValue));
    		break;
    	case "BF":
    		// Cannot assign new value to enum literal
    		setSatisfied(true);
    	case "FB":
    		var_0.setValue(literalValue);
    		setSatisfied(true);
    	}
    	
  	}	  
}