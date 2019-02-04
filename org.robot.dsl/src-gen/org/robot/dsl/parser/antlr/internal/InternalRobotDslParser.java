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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'scenarii'", "','", "'}'", "'global'", "'initial'", "'Scenario'", "'statements'", "'forward'", "'print'", "'execute'"
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
    public static final int T__22=22;
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
    // InternalRobotDsl.g:71:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'scenarii' otherlv_4= '{' ( (lv_scenarii_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_scenarii_7_0= ruleScenario ) ) )* otherlv_8= '}' )? otherlv_9= 'global' ( (lv_global_10_0= ruleScenario ) ) otherlv_11= 'initial' ( ( ruleEString ) ) otherlv_13= '}' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_scenarii_5_0 = null;

        EObject lv_scenarii_7_0 = null;

        EObject lv_global_10_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:77:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'scenarii' otherlv_4= '{' ( (lv_scenarii_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_scenarii_7_0= ruleScenario ) ) )* otherlv_8= '}' )? otherlv_9= 'global' ( (lv_global_10_0= ruleScenario ) ) otherlv_11= 'initial' ( ( ruleEString ) ) otherlv_13= '}' ) )
            // InternalRobotDsl.g:78:2: (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'scenarii' otherlv_4= '{' ( (lv_scenarii_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_scenarii_7_0= ruleScenario ) ) )* otherlv_8= '}' )? otherlv_9= 'global' ( (lv_global_10_0= ruleScenario ) ) otherlv_11= 'initial' ( ( ruleEString ) ) otherlv_13= '}' )
            {
            // InternalRobotDsl.g:78:2: (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'scenarii' otherlv_4= '{' ( (lv_scenarii_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_scenarii_7_0= ruleScenario ) ) )* otherlv_8= '}' )? otherlv_9= 'global' ( (lv_global_10_0= ruleScenario ) ) otherlv_11= 'initial' ( ( ruleEString ) ) otherlv_13= '}' )
            // InternalRobotDsl.g:79:3: otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'scenarii' otherlv_4= '{' ( (lv_scenarii_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_scenarii_7_0= ruleScenario ) ) )* otherlv_8= '}' )? otherlv_9= 'global' ( (lv_global_10_0= ruleScenario ) ) otherlv_11= 'initial' ( ( ruleEString ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
            		
            // InternalRobotDsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRobotDsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalRobotDsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalRobotDsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.robot.dsl.RobotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRobotDsl.g:106:3: (otherlv_3= 'scenarii' otherlv_4= '{' ( (lv_scenarii_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_scenarii_7_0= ruleScenario ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRobotDsl.g:107:4: otherlv_3= 'scenarii' otherlv_4= '{' ( (lv_scenarii_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_scenarii_7_0= ruleScenario ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getScenariiKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRobotDsl.g:115:4: ( (lv_scenarii_5_0= ruleScenario ) )
                    // InternalRobotDsl.g:116:5: (lv_scenarii_5_0= ruleScenario )
                    {
                    // InternalRobotDsl.g:116:5: (lv_scenarii_5_0= ruleScenario )
                    // InternalRobotDsl.g:117:6: lv_scenarii_5_0= ruleScenario
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getScenariiScenarioParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_scenarii_5_0=ruleScenario();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"scenarii",
                    							lv_scenarii_5_0,
                    							"org.robot.dsl.RobotDsl.Scenario");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDsl.g:134:4: (otherlv_6= ',' ( (lv_scenarii_7_0= ruleScenario ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRobotDsl.g:135:5: otherlv_6= ',' ( (lv_scenarii_7_0= ruleScenario ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRobotAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRobotDsl.g:139:5: ( (lv_scenarii_7_0= ruleScenario ) )
                    	    // InternalRobotDsl.g:140:6: (lv_scenarii_7_0= ruleScenario )
                    	    {
                    	    // InternalRobotDsl.g:140:6: (lv_scenarii_7_0= ruleScenario )
                    	    // InternalRobotDsl.g:141:7: lv_scenarii_7_0= ruleScenario
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getScenariiScenarioParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_scenarii_7_0=ruleScenario();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"scenarii",
                    	    								lv_scenarii_7_0,
                    	    								"org.robot.dsl.RobotDsl.Scenario");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getGlobalKeyword_4());
            		
            // InternalRobotDsl.g:168:3: ( (lv_global_10_0= ruleScenario ) )
            // InternalRobotDsl.g:169:4: (lv_global_10_0= ruleScenario )
            {
            // InternalRobotDsl.g:169:4: (lv_global_10_0= ruleScenario )
            // InternalRobotDsl.g:170:5: lv_global_10_0= ruleScenario
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getGlobalScenarioParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_global_10_0=ruleScenario();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"global",
            						lv_global_10_0,
            						"org.robot.dsl.RobotDsl.Scenario");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getRobotAccess().getInitialKeyword_6());
            		
            // InternalRobotDsl.g:191:3: ( ( ruleEString ) )
            // InternalRobotDsl.g:192:4: ( ruleEString )
            {
            // InternalRobotDsl.g:192:4: ( ruleEString )
            // InternalRobotDsl.g:193:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRobotAccess().getInitialScenarioCrossReference_7_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleStatement"
    // InternalRobotDsl.g:215:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRobotDsl.g:215:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRobotDsl.g:216:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRobotDsl.g:222:1: ruleStatement returns [EObject current=null] : (this_ForwardStatement_0= ruleForwardStatement | this_ExecuteStatement_1= ruleExecuteStatement | this_PrintStatement_2= rulePrintStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ForwardStatement_0 = null;

        EObject this_ExecuteStatement_1 = null;

        EObject this_PrintStatement_2 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:228:2: ( (this_ForwardStatement_0= ruleForwardStatement | this_ExecuteStatement_1= ruleExecuteStatement | this_PrintStatement_2= rulePrintStatement ) )
            // InternalRobotDsl.g:229:2: (this_ForwardStatement_0= ruleForwardStatement | this_ExecuteStatement_1= ruleExecuteStatement | this_PrintStatement_2= rulePrintStatement )
            {
            // InternalRobotDsl.g:229:2: (this_ForwardStatement_0= ruleForwardStatement | this_ExecuteStatement_1= ruleExecuteStatement | this_PrintStatement_2= rulePrintStatement )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRobotDsl.g:230:3: this_ForwardStatement_0= ruleForwardStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getForwardStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForwardStatement_0=ruleForwardStatement();

                    state._fsp--;


                    			current = this_ForwardStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDsl.g:239:3: this_ExecuteStatement_1= ruleExecuteStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getExecuteStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExecuteStatement_1=ruleExecuteStatement();

                    state._fsp--;


                    			current = this_ExecuteStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotDsl.g:248:3: this_PrintStatement_2= rulePrintStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintStatement_2=rulePrintStatement();

                    state._fsp--;


                    			current = this_PrintStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleEString"
    // InternalRobotDsl.g:260:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRobotDsl.g:260:47: (iv_ruleEString= ruleEString EOF )
            // InternalRobotDsl.g:261:2: iv_ruleEString= ruleEString EOF
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
    // InternalRobotDsl.g:267:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:273:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRobotDsl.g:274:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRobotDsl.g:274:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRobotDsl.g:275:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDsl.g:283:3: this_ID_1= RULE_ID
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
    // InternalRobotDsl.g:294:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalRobotDsl.g:294:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalRobotDsl.g:295:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalRobotDsl.g:301:1: ruleScenario returns [EObject current=null] : ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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

        EObject lv_statements_6_0 = null;

        EObject lv_statements_8_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:307:2: ( ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRobotDsl.g:308:2: ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRobotDsl.g:308:2: ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRobotDsl.g:309:3: () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalRobotDsl.g:309:3: ()
            // InternalRobotDsl.g:310:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenarioAccess().getScenarioAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
            		
            // InternalRobotDsl.g:320:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRobotDsl.g:321:4: (lv_name_2_0= ruleEString )
            {
            // InternalRobotDsl.g:321:4: (lv_name_2_0= ruleEString )
            // InternalRobotDsl.g:322:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotDsl.g:343:3: (otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRobotDsl.g:344:4: otherlv_4= 'statements' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getStatementsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRobotDsl.g:352:4: ( (lv_statements_6_0= ruleStatement ) )
                    // InternalRobotDsl.g:353:5: (lv_statements_6_0= ruleStatement )
                    {
                    // InternalRobotDsl.g:353:5: (lv_statements_6_0= ruleStatement )
                    // InternalRobotDsl.g:354:6: lv_statements_6_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_statements_6_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenarioRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_6_0,
                    							"org.robot.dsl.RobotDsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDsl.g:371:4: (otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRobotDsl.g:372:5: otherlv_7= ',' ( (lv_statements_8_0= ruleStatement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRobotDsl.g:376:5: ( (lv_statements_8_0= ruleStatement ) )
                    	    // InternalRobotDsl.g:377:6: (lv_statements_8_0= ruleStatement )
                    	    {
                    	    // InternalRobotDsl.g:377:6: (lv_statements_8_0= ruleStatement )
                    	    // InternalRobotDsl.g:378:7: lv_statements_8_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_statements_8_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statements",
                    	    								lv_statements_8_0,
                    	    								"org.robot.dsl.RobotDsl.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleForwardStatement"
    // InternalRobotDsl.g:409:1: entryRuleForwardStatement returns [EObject current=null] : iv_ruleForwardStatement= ruleForwardStatement EOF ;
    public final EObject entryRuleForwardStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardStatement = null;


        try {
            // InternalRobotDsl.g:409:57: (iv_ruleForwardStatement= ruleForwardStatement EOF )
            // InternalRobotDsl.g:410:2: iv_ruleForwardStatement= ruleForwardStatement EOF
            {
             newCompositeNode(grammarAccess.getForwardStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForwardStatement=ruleForwardStatement();

            state._fsp--;

             current =iv_ruleForwardStatement; 
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
    // $ANTLR end "entryRuleForwardStatement"


    // $ANTLR start "ruleForwardStatement"
    // InternalRobotDsl.g:416:1: ruleForwardStatement returns [EObject current=null] : ( () otherlv_1= 'forward' ) ;
    public final EObject ruleForwardStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:422:2: ( ( () otherlv_1= 'forward' ) )
            // InternalRobotDsl.g:423:2: ( () otherlv_1= 'forward' )
            {
            // InternalRobotDsl.g:423:2: ( () otherlv_1= 'forward' )
            // InternalRobotDsl.g:424:3: () otherlv_1= 'forward'
            {
            // InternalRobotDsl.g:424:3: ()
            // InternalRobotDsl.g:425:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForwardStatementAccess().getForwardStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardStatementAccess().getForwardKeyword_1());
            		

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
    // $ANTLR end "ruleForwardStatement"


    // $ANTLR start "entryRulePrintStatement"
    // InternalRobotDsl.g:439:1: entryRulePrintStatement returns [EObject current=null] : iv_rulePrintStatement= rulePrintStatement EOF ;
    public final EObject entryRulePrintStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStatement = null;


        try {
            // InternalRobotDsl.g:439:55: (iv_rulePrintStatement= rulePrintStatement EOF )
            // InternalRobotDsl.g:440:2: iv_rulePrintStatement= rulePrintStatement EOF
            {
             newCompositeNode(grammarAccess.getPrintStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintStatement=rulePrintStatement();

            state._fsp--;

             current =iv_rulePrintStatement; 
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
    // $ANTLR end "entryRulePrintStatement"


    // $ANTLR start "rulePrintStatement"
    // InternalRobotDsl.g:446:1: rulePrintStatement returns [EObject current=null] : ( () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) ) ) ;
    public final EObject rulePrintStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:452:2: ( ( () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) ) ) )
            // InternalRobotDsl.g:453:2: ( () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) ) )
            {
            // InternalRobotDsl.g:453:2: ( () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) ) )
            // InternalRobotDsl.g:454:3: () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) )
            {
            // InternalRobotDsl.g:454:3: ()
            // InternalRobotDsl.g:455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintStatementAccess().getPrintStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintStatementAccess().getPrintKeyword_1());
            		
            // InternalRobotDsl.g:465:3: ( (lv_text_2_0= ruleEString ) )
            // InternalRobotDsl.g:466:4: (lv_text_2_0= ruleEString )
            {
            // InternalRobotDsl.g:466:4: (lv_text_2_0= ruleEString )
            // InternalRobotDsl.g:467:5: lv_text_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrintStatementAccess().getTextEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintStatementRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_2_0,
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
    // $ANTLR end "rulePrintStatement"


    // $ANTLR start "entryRuleExecuteStatement"
    // InternalRobotDsl.g:488:1: entryRuleExecuteStatement returns [EObject current=null] : iv_ruleExecuteStatement= ruleExecuteStatement EOF ;
    public final EObject entryRuleExecuteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecuteStatement = null;


        try {
            // InternalRobotDsl.g:488:57: (iv_ruleExecuteStatement= ruleExecuteStatement EOF )
            // InternalRobotDsl.g:489:2: iv_ruleExecuteStatement= ruleExecuteStatement EOF
            {
             newCompositeNode(grammarAccess.getExecuteStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecuteStatement=ruleExecuteStatement();

            state._fsp--;

             current =iv_ruleExecuteStatement; 
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
    // $ANTLR end "entryRuleExecuteStatement"


    // $ANTLR start "ruleExecuteStatement"
    // InternalRobotDsl.g:495:1: ruleExecuteStatement returns [EObject current=null] : ( () otherlv_1= 'execute' ( ( ruleEString ) ) ) ;
    public final EObject ruleExecuteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:501:2: ( ( () otherlv_1= 'execute' ( ( ruleEString ) ) ) )
            // InternalRobotDsl.g:502:2: ( () otherlv_1= 'execute' ( ( ruleEString ) ) )
            {
            // InternalRobotDsl.g:502:2: ( () otherlv_1= 'execute' ( ( ruleEString ) ) )
            // InternalRobotDsl.g:503:3: () otherlv_1= 'execute' ( ( ruleEString ) )
            {
            // InternalRobotDsl.g:503:3: ()
            // InternalRobotDsl.g:504:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExecuteStatementAccess().getExecuteStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExecuteStatementAccess().getExecuteKeyword_1());
            		
            // InternalRobotDsl.g:514:3: ( ( ruleEString ) )
            // InternalRobotDsl.g:515:4: ( ruleEString )
            {
            // InternalRobotDsl.g:515:4: ( ruleEString )
            // InternalRobotDsl.g:516:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecuteStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExecuteStatementAccess().getDestinationScenarioCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleExecuteStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000700000L});

}