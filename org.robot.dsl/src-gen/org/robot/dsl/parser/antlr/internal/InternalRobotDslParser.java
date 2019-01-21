package org.robot.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.robot.dsl.services.RobotDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRobotDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'scenario'", "'}'", "'Scenario'", "'states'", "','", "'State'", "'destination'", "'actions'", "'Action'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRobotDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRobotDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRobotDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRobotDsl.g"; }



     	private RobotDslGrammarAccess grammarAccess;

        public InternalRobotDslParser(TokenStream input, RobotDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected RobotDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalRobotDsl.g:64:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalRobotDsl.g:64:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalRobotDsl.g:65:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalRobotDsl.g:71:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'scenario' ( (lv_scenario_5_0= ruleScenario ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_scenario_5_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:77:2: ( ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'scenario' ( (lv_scenario_5_0= ruleScenario ) ) )? otherlv_6= '}' ) )
            // InternalRobotDsl.g:78:2: ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'scenario' ( (lv_scenario_5_0= ruleScenario ) ) )? otherlv_6= '}' )
            {
            // InternalRobotDsl.g:78:2: ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'scenario' ( (lv_scenario_5_0= ruleScenario ) ) )? otherlv_6= '}' )
            // InternalRobotDsl.g:79:3: () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'scenario' ( (lv_scenario_5_0= ruleScenario ) ) )? otherlv_6= '}'
            {
            // InternalRobotDsl.g:79:3: ()
            // InternalRobotDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
            		
            // InternalRobotDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRobotDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalRobotDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalRobotDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.robot.dsl.RobotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotDsl.g:113:3: (otherlv_4= 'scenario' ( (lv_scenario_5_0= ruleScenario ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRobotDsl.g:114:4: otherlv_4= 'scenario' ( (lv_scenario_5_0= ruleScenario ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getScenarioKeyword_4_0());
                    			
                    // InternalRobotDsl.g:118:4: ( (lv_scenario_5_0= ruleScenario ) )
                    // InternalRobotDsl.g:119:5: (lv_scenario_5_0= ruleScenario )
                    {
                    // InternalRobotDsl.g:119:5: (lv_scenario_5_0= ruleScenario )
                    // InternalRobotDsl.g:120:6: lv_scenario_5_0= ruleScenario
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getScenarioScenarioParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_scenario_5_0=ruleScenario();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						set(
                    							current,
                    							"scenario",
                    							lv_scenario_5_0,
                    							"org.robot.dsl.RobotDsl.Scenario");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleEString"
    // InternalRobotDsl.g:146:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRobotDsl.g:146:47: (iv_ruleEString= ruleEString EOF )
            // InternalRobotDsl.g:147:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRobotDsl.g:153:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:159:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRobotDsl.g:160:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRobotDsl.g:160:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRobotDsl.g:161:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDsl.g:169:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleScenario"
    // InternalRobotDsl.g:180:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalRobotDsl.g:180:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalRobotDsl.g:181:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalRobotDsl.g:187:1: ruleScenario returns [EObject current=null] : ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_states_6_0 = null;

        EObject lv_states_8_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:193:2: ( ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRobotDsl.g:194:2: ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRobotDsl.g:194:2: ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRobotDsl.g:195:3: () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalRobotDsl.g:195:3: ()
            // InternalRobotDsl.g:196:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenarioAccess().getScenarioAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
            		
            // InternalRobotDsl.g:206:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRobotDsl.g:207:4: (lv_name_2_0= ruleEString )
            {
            // InternalRobotDsl.g:207:4: (lv_name_2_0= ruleEString )
            // InternalRobotDsl.g:208:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.robot.dsl.RobotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotDsl.g:229:3: (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRobotDsl.g:230:4: otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getStatesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRobotDsl.g:238:4: ( (lv_states_6_0= ruleState ) )
                    // InternalRobotDsl.g:239:5: (lv_states_6_0= ruleState )
                    {
                    // InternalRobotDsl.g:239:5: (lv_states_6_0= ruleState )
                    // InternalRobotDsl.g:240:6: lv_states_6_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getScenarioAccess().getStatesStateParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_states_6_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenarioRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_6_0,
                    							"org.robot.dsl.RobotDsl.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDsl.g:257:4: (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRobotDsl.g:258:5: otherlv_7= ',' ( (lv_states_8_0= ruleState ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRobotDsl.g:262:5: ( (lv_states_8_0= ruleState ) )
                    	    // InternalRobotDsl.g:263:6: (lv_states_8_0= ruleState )
                    	    {
                    	    // InternalRobotDsl.g:263:6: (lv_states_8_0= ruleState )
                    	    // InternalRobotDsl.g:264:7: lv_states_8_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getScenarioAccess().getStatesStateParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_states_8_0=ruleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"states",
                    	    								lv_states_8_0,
                    	    								"org.robot.dsl.RobotDsl.State");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleState"
    // InternalRobotDsl.g:295:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalRobotDsl.g:295:46: (iv_ruleState= ruleState EOF )
            // InternalRobotDsl.g:296:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalRobotDsl.g:302:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'destination' ( ( ruleEString ) ) )? (otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleAction ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actions_8_0 = null;

        EObject lv_actions_10_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:308:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'destination' ( ( ruleEString ) ) )? (otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleAction ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalRobotDsl.g:309:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'destination' ( ( ruleEString ) ) )? (otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleAction ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalRobotDsl.g:309:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'destination' ( ( ruleEString ) ) )? (otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleAction ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalRobotDsl.g:310:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'destination' ( ( ruleEString ) ) )? (otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleAction ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalRobotDsl.g:310:3: ()
            // InternalRobotDsl.g:311:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalRobotDsl.g:321:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRobotDsl.g:322:4: (lv_name_2_0= ruleEString )
            {
            // InternalRobotDsl.g:322:4: (lv_name_2_0= ruleEString )
            // InternalRobotDsl.g:323:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.robot.dsl.RobotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotDsl.g:344:3: (otherlv_4= 'destination' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRobotDsl.g:345:4: otherlv_4= 'destination' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getDestinationKeyword_4_0());
                    			
                    // InternalRobotDsl.g:349:4: ( ( ruleEString ) )
                    // InternalRobotDsl.g:350:5: ( ruleEString )
                    {
                    // InternalRobotDsl.g:350:5: ( ruleEString )
                    // InternalRobotDsl.g:351:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStateAccess().getDestinationActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRobotDsl.g:366:3: (otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleAction ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )* otherlv_11= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRobotDsl.g:367:4: otherlv_6= 'actions' otherlv_7= '{' ( (lv_actions_8_0= ruleAction ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getActionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRobotDsl.g:375:4: ( (lv_actions_8_0= ruleAction ) )
                    // InternalRobotDsl.g:376:5: (lv_actions_8_0= ruleAction )
                    {
                    // InternalRobotDsl.g:376:5: (lv_actions_8_0= ruleAction )
                    // InternalRobotDsl.g:377:6: lv_actions_8_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_actions_8_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_8_0,
                    							"org.robot.dsl.RobotDsl.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDsl.g:394:4: (otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRobotDsl.g:395:5: otherlv_9= ',' ( (lv_actions_10_0= ruleAction ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FOLLOW_13); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRobotDsl.g:399:5: ( (lv_actions_10_0= ruleAction ) )
                    	    // InternalRobotDsl.g:400:6: (lv_actions_10_0= ruleAction )
                    	    {
                    	    // InternalRobotDsl.g:400:6: (lv_actions_10_0= ruleAction )
                    	    // InternalRobotDsl.g:401:7: lv_actions_10_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_actions_10_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_10_0,
                    	    								"org.robot.dsl.RobotDsl.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAction"
    // InternalRobotDsl.g:432:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRobotDsl.g:432:47: (iv_ruleAction= ruleAction EOF )
            // InternalRobotDsl.g:433:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalRobotDsl.g:439:1: ruleAction returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:445:2: ( ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRobotDsl.g:446:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRobotDsl.g:446:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRobotDsl.g:447:3: () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRobotDsl.g:447:3: ()
            // InternalRobotDsl.g:448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
            		
            // InternalRobotDsl.g:458:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRobotDsl.g:459:4: (lv_name_2_0= ruleEString )
            {
            // InternalRobotDsl.g:459:4: (lv_name_2_0= ruleEString )
            // InternalRobotDsl.g:460:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.robot.dsl.RobotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000184000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}