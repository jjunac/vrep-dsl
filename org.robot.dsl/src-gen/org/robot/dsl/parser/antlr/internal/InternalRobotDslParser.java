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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'connect_to'", "'scenarii'", "'}'", "'global'", "'initial'", "':'", "'Scenario'", "'ball_ahead'", "'forward'", "'print'", "'execute'", "'until'"
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
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalRobotDsl.g:71:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'connect_to' ( (lv_connection_4_0= ruleConnection ) ) )? (otherlv_5= 'scenarii' otherlv_6= '{' ( (lv_scenarii_7_0= ruleScenario ) ) ( (lv_scenarii_8_0= ruleScenario ) )* otherlv_9= '}' )? otherlv_10= 'global' ( (lv_global_11_0= ruleScenario ) ) otherlv_12= 'initial' ( ( ruleEString ) ) otherlv_14= '}' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_connection_4_0 = null;

        EObject lv_scenarii_7_0 = null;

        EObject lv_scenarii_8_0 = null;

        EObject lv_global_11_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:77:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'connect_to' ( (lv_connection_4_0= ruleConnection ) ) )? (otherlv_5= 'scenarii' otherlv_6= '{' ( (lv_scenarii_7_0= ruleScenario ) ) ( (lv_scenarii_8_0= ruleScenario ) )* otherlv_9= '}' )? otherlv_10= 'global' ( (lv_global_11_0= ruleScenario ) ) otherlv_12= 'initial' ( ( ruleEString ) ) otherlv_14= '}' ) )
            // InternalRobotDsl.g:78:2: (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'connect_to' ( (lv_connection_4_0= ruleConnection ) ) )? (otherlv_5= 'scenarii' otherlv_6= '{' ( (lv_scenarii_7_0= ruleScenario ) ) ( (lv_scenarii_8_0= ruleScenario ) )* otherlv_9= '}' )? otherlv_10= 'global' ( (lv_global_11_0= ruleScenario ) ) otherlv_12= 'initial' ( ( ruleEString ) ) otherlv_14= '}' )
            {
            // InternalRobotDsl.g:78:2: (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'connect_to' ( (lv_connection_4_0= ruleConnection ) ) )? (otherlv_5= 'scenarii' otherlv_6= '{' ( (lv_scenarii_7_0= ruleScenario ) ) ( (lv_scenarii_8_0= ruleScenario ) )* otherlv_9= '}' )? otherlv_10= 'global' ( (lv_global_11_0= ruleScenario ) ) otherlv_12= 'initial' ( ( ruleEString ) ) otherlv_14= '}' )
            // InternalRobotDsl.g:79:3: otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'connect_to' ( (lv_connection_4_0= ruleConnection ) ) )? (otherlv_5= 'scenarii' otherlv_6= '{' ( (lv_scenarii_7_0= ruleScenario ) ) ( (lv_scenarii_8_0= ruleScenario ) )* otherlv_9= '}' )? otherlv_10= 'global' ( (lv_global_11_0= ruleScenario ) ) otherlv_12= 'initial' ( ( ruleEString ) ) otherlv_14= '}'
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
            		
            // InternalRobotDsl.g:106:3: (otherlv_3= 'connect_to' ( (lv_connection_4_0= ruleConnection ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRobotDsl.g:107:4: otherlv_3= 'connect_to' ( (lv_connection_4_0= ruleConnection ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getConnect_toKeyword_3_0());
                    			
                    // InternalRobotDsl.g:111:4: ( (lv_connection_4_0= ruleConnection ) )
                    // InternalRobotDsl.g:112:5: (lv_connection_4_0= ruleConnection )
                    {
                    // InternalRobotDsl.g:112:5: (lv_connection_4_0= ruleConnection )
                    // InternalRobotDsl.g:113:6: lv_connection_4_0= ruleConnection
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getConnectionConnectionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_connection_4_0=ruleConnection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						set(
                    							current,
                    							"connection",
                    							lv_connection_4_0,
                    							"org.robot.dsl.RobotDsl.Connection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRobotDsl.g:131:3: (otherlv_5= 'scenarii' otherlv_6= '{' ( (lv_scenarii_7_0= ruleScenario ) ) ( (lv_scenarii_8_0= ruleScenario ) )* otherlv_9= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRobotDsl.g:132:4: otherlv_5= 'scenarii' otherlv_6= '{' ( (lv_scenarii_7_0= ruleScenario ) ) ( (lv_scenarii_8_0= ruleScenario ) )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getScenariiKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRobotDsl.g:140:4: ( (lv_scenarii_7_0= ruleScenario ) )
                    // InternalRobotDsl.g:141:5: (lv_scenarii_7_0= ruleScenario )
                    {
                    // InternalRobotDsl.g:141:5: (lv_scenarii_7_0= ruleScenario )
                    // InternalRobotDsl.g:142:6: lv_scenarii_7_0= ruleScenario
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getScenariiScenarioParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalRobotDsl.g:159:4: ( (lv_scenarii_8_0= ruleScenario ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==19) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRobotDsl.g:160:5: (lv_scenarii_8_0= ruleScenario )
                    	    {
                    	    // InternalRobotDsl.g:160:5: (lv_scenarii_8_0= ruleScenario )
                    	    // InternalRobotDsl.g:161:6: lv_scenarii_8_0= ruleScenario
                    	    {

                    	    						newCompositeNode(grammarAccess.getRobotAccess().getScenariiScenarioParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_scenarii_8_0=ruleScenario();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"scenarii",
                    	    							lv_scenarii_8_0,
                    	    							"org.robot.dsl.RobotDsl.Scenario");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getRobotAccess().getGlobalKeyword_5());
            		
            // InternalRobotDsl.g:187:3: ( (lv_global_11_0= ruleScenario ) )
            // InternalRobotDsl.g:188:4: (lv_global_11_0= ruleScenario )
            {
            // InternalRobotDsl.g:188:4: (lv_global_11_0= ruleScenario )
            // InternalRobotDsl.g:189:5: lv_global_11_0= ruleScenario
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getGlobalScenarioParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_global_11_0=ruleScenario();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"global",
            						lv_global_11_0,
            						"org.robot.dsl.RobotDsl.Scenario");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getRobotAccess().getInitialKeyword_7());
            		
            // InternalRobotDsl.g:210:3: ( ( ruleEString ) )
            // InternalRobotDsl.g:211:4: ( ruleEString )
            {
            // InternalRobotDsl.g:211:4: ( ruleEString )
            // InternalRobotDsl.g:212:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRobotAccess().getInitialScenarioCrossReference_8_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalRobotDsl.g:234:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRobotDsl.g:234:47: (iv_ruleEString= ruleEString EOF )
            // InternalRobotDsl.g:235:2: iv_ruleEString= ruleEString EOF
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
    // InternalRobotDsl.g:241:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:247:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRobotDsl.g:248:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRobotDsl.g:248:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalRobotDsl.g:249:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDsl.g:257:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleConnection"
    // InternalRobotDsl.g:268:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalRobotDsl.g:268:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalRobotDsl.g:269:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalRobotDsl.g:275:1: ruleConnection returns [EObject current=null] : ( () ( (lv_ip_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_port_3_0= RULE_INT ) ) ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_port_3_0=null;
        AntlrDatatypeRuleToken lv_ip_1_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:281:2: ( ( () ( (lv_ip_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_port_3_0= RULE_INT ) ) ) )
            // InternalRobotDsl.g:282:2: ( () ( (lv_ip_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_port_3_0= RULE_INT ) ) )
            {
            // InternalRobotDsl.g:282:2: ( () ( (lv_ip_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_port_3_0= RULE_INT ) ) )
            // InternalRobotDsl.g:283:3: () ( (lv_ip_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_port_3_0= RULE_INT ) )
            {
            // InternalRobotDsl.g:283:3: ()
            // InternalRobotDsl.g:284:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectionAccess().getConnectionAction_0(),
            					current);
            			

            }

            // InternalRobotDsl.g:290:3: ( (lv_ip_1_0= ruleEString ) )
            // InternalRobotDsl.g:291:4: (lv_ip_1_0= ruleEString )
            {
            // InternalRobotDsl.g:291:4: (lv_ip_1_0= ruleEString )
            // InternalRobotDsl.g:292:5: lv_ip_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getIpEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_ip_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionRule());
            					}
            					set(
            						current,
            						"ip",
            						lv_ip_1_0,
            						"org.robot.dsl.RobotDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getColonKeyword_2());
            		
            // InternalRobotDsl.g:313:3: ( (lv_port_3_0= RULE_INT ) )
            // InternalRobotDsl.g:314:4: (lv_port_3_0= RULE_INT )
            {
            // InternalRobotDsl.g:314:4: (lv_port_3_0= RULE_INT )
            // InternalRobotDsl.g:315:5: lv_port_3_0= RULE_INT
            {
            lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_port_3_0, grammarAccess.getConnectionAccess().getPortINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleScenario"
    // InternalRobotDsl.g:335:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalRobotDsl.g:335:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalRobotDsl.g:336:2: iv_ruleScenario= ruleScenario EOF
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
    // InternalRobotDsl.g:342:1: ruleScenario returns [EObject current=null] : ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_statements_4_0= ruleStatement ) ) ( (lv_statements_5_0= ruleStatement ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_5_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:348:2: ( ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_statements_4_0= ruleStatement ) ) ( (lv_statements_5_0= ruleStatement ) )* )? otherlv_6= '}' ) )
            // InternalRobotDsl.g:349:2: ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_statements_4_0= ruleStatement ) ) ( (lv_statements_5_0= ruleStatement ) )* )? otherlv_6= '}' )
            {
            // InternalRobotDsl.g:349:2: ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_statements_4_0= ruleStatement ) ) ( (lv_statements_5_0= ruleStatement ) )* )? otherlv_6= '}' )
            // InternalRobotDsl.g:350:3: () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_statements_4_0= ruleStatement ) ) ( (lv_statements_5_0= ruleStatement ) )* )? otherlv_6= '}'
            {
            // InternalRobotDsl.g:350:3: ()
            // InternalRobotDsl.g:351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenarioAccess().getScenarioAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
            		
            // InternalRobotDsl.g:361:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRobotDsl.g:362:4: (lv_name_2_0= ruleEString )
            {
            // InternalRobotDsl.g:362:4: (lv_name_2_0= ruleEString )
            // InternalRobotDsl.g:363:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotDsl.g:384:3: ( ( (lv_statements_4_0= ruleStatement ) ) ( (lv_statements_5_0= ruleStatement ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=21 && LA6_0<=24)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRobotDsl.g:385:4: ( (lv_statements_4_0= ruleStatement ) ) ( (lv_statements_5_0= ruleStatement ) )*
                    {
                    // InternalRobotDsl.g:385:4: ( (lv_statements_4_0= ruleStatement ) )
                    // InternalRobotDsl.g:386:5: (lv_statements_4_0= ruleStatement )
                    {
                    // InternalRobotDsl.g:386:5: (lv_statements_4_0= ruleStatement )
                    // InternalRobotDsl.g:387:6: lv_statements_4_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_statements_4_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenarioRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_4_0,
                    							"org.robot.dsl.RobotDsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDsl.g:404:4: ( (lv_statements_5_0= ruleStatement ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=21 && LA5_0<=24)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRobotDsl.g:405:5: (lv_statements_5_0= ruleStatement )
                    	    {
                    	    // InternalRobotDsl.g:405:5: (lv_statements_5_0= ruleStatement )
                    	    // InternalRobotDsl.g:406:6: lv_statements_5_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_statements_5_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"statements",
                    	    							lv_statements_5_0,
                    	    							"org.robot.dsl.RobotDsl.Statement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleCondition"
    // InternalRobotDsl.g:432:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalRobotDsl.g:432:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalRobotDsl.g:433:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalRobotDsl.g:439:1: ruleCondition returns [EObject current=null] : this_BallAheadCondition_0= ruleBallAheadCondition ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BallAheadCondition_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:445:2: (this_BallAheadCondition_0= ruleBallAheadCondition )
            // InternalRobotDsl.g:446:2: this_BallAheadCondition_0= ruleBallAheadCondition
            {

            		newCompositeNode(grammarAccess.getConditionAccess().getBallAheadConditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BallAheadCondition_0=ruleBallAheadCondition();

            state._fsp--;


            		current = this_BallAheadCondition_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleBallAheadCondition"
    // InternalRobotDsl.g:457:1: entryRuleBallAheadCondition returns [EObject current=null] : iv_ruleBallAheadCondition= ruleBallAheadCondition EOF ;
    public final EObject entryRuleBallAheadCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBallAheadCondition = null;


        try {
            // InternalRobotDsl.g:457:59: (iv_ruleBallAheadCondition= ruleBallAheadCondition EOF )
            // InternalRobotDsl.g:458:2: iv_ruleBallAheadCondition= ruleBallAheadCondition EOF
            {
             newCompositeNode(grammarAccess.getBallAheadConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBallAheadCondition=ruleBallAheadCondition();

            state._fsp--;

             current =iv_ruleBallAheadCondition; 
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
    // $ANTLR end "entryRuleBallAheadCondition"


    // $ANTLR start "ruleBallAheadCondition"
    // InternalRobotDsl.g:464:1: ruleBallAheadCondition returns [EObject current=null] : ( () otherlv_1= 'ball_ahead' ) ;
    public final EObject ruleBallAheadCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:470:2: ( ( () otherlv_1= 'ball_ahead' ) )
            // InternalRobotDsl.g:471:2: ( () otherlv_1= 'ball_ahead' )
            {
            // InternalRobotDsl.g:471:2: ( () otherlv_1= 'ball_ahead' )
            // InternalRobotDsl.g:472:3: () otherlv_1= 'ball_ahead'
            {
            // InternalRobotDsl.g:472:3: ()
            // InternalRobotDsl.g:473:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBallAheadConditionAccess().getBallAheadConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBallAheadConditionAccess().getBall_aheadKeyword_1());
            		

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
    // $ANTLR end "ruleBallAheadCondition"


    // $ANTLR start "entryRuleStatement"
    // InternalRobotDsl.g:487:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRobotDsl.g:487:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRobotDsl.g:488:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalRobotDsl.g:494:1: ruleStatement returns [EObject current=null] : (this_ForwardStatement_0= ruleForwardStatement | this_ExecuteStatement_1= ruleExecuteStatement | this_PrintStatement_2= rulePrintStatement | this_ConditionalStatement_3= ruleConditionalStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ForwardStatement_0 = null;

        EObject this_ExecuteStatement_1 = null;

        EObject this_PrintStatement_2 = null;

        EObject this_ConditionalStatement_3 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:500:2: ( (this_ForwardStatement_0= ruleForwardStatement | this_ExecuteStatement_1= ruleExecuteStatement | this_PrintStatement_2= rulePrintStatement | this_ConditionalStatement_3= ruleConditionalStatement ) )
            // InternalRobotDsl.g:501:2: (this_ForwardStatement_0= ruleForwardStatement | this_ExecuteStatement_1= ruleExecuteStatement | this_PrintStatement_2= rulePrintStatement | this_ConditionalStatement_3= ruleConditionalStatement )
            {
            // InternalRobotDsl.g:501:2: (this_ForwardStatement_0= ruleForwardStatement | this_ExecuteStatement_1= ruleExecuteStatement | this_PrintStatement_2= rulePrintStatement | this_ConditionalStatement_3= ruleConditionalStatement )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRobotDsl.g:502:3: this_ForwardStatement_0= ruleForwardStatement
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
                    // InternalRobotDsl.g:511:3: this_ExecuteStatement_1= ruleExecuteStatement
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
                    // InternalRobotDsl.g:520:3: this_PrintStatement_2= rulePrintStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintStatement_2=rulePrintStatement();

                    state._fsp--;


                    			current = this_PrintStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRobotDsl.g:529:3: this_ConditionalStatement_3= ruleConditionalStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getConditionalStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalStatement_3=ruleConditionalStatement();

                    state._fsp--;


                    			current = this_ConditionalStatement_3;
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


    // $ANTLR start "entryRuleForwardStatement"
    // InternalRobotDsl.g:541:1: entryRuleForwardStatement returns [EObject current=null] : iv_ruleForwardStatement= ruleForwardStatement EOF ;
    public final EObject entryRuleForwardStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardStatement = null;


        try {
            // InternalRobotDsl.g:541:57: (iv_ruleForwardStatement= ruleForwardStatement EOF )
            // InternalRobotDsl.g:542:2: iv_ruleForwardStatement= ruleForwardStatement EOF
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
    // InternalRobotDsl.g:548:1: ruleForwardStatement returns [EObject current=null] : ( () otherlv_1= 'forward' ) ;
    public final EObject ruleForwardStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:554:2: ( ( () otherlv_1= 'forward' ) )
            // InternalRobotDsl.g:555:2: ( () otherlv_1= 'forward' )
            {
            // InternalRobotDsl.g:555:2: ( () otherlv_1= 'forward' )
            // InternalRobotDsl.g:556:3: () otherlv_1= 'forward'
            {
            // InternalRobotDsl.g:556:3: ()
            // InternalRobotDsl.g:557:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForwardStatementAccess().getForwardStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRobotDsl.g:571:1: entryRulePrintStatement returns [EObject current=null] : iv_rulePrintStatement= rulePrintStatement EOF ;
    public final EObject entryRulePrintStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStatement = null;


        try {
            // InternalRobotDsl.g:571:55: (iv_rulePrintStatement= rulePrintStatement EOF )
            // InternalRobotDsl.g:572:2: iv_rulePrintStatement= rulePrintStatement EOF
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
    // InternalRobotDsl.g:578:1: rulePrintStatement returns [EObject current=null] : ( () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) ) ) ;
    public final EObject rulePrintStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:584:2: ( ( () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) ) ) )
            // InternalRobotDsl.g:585:2: ( () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) ) )
            {
            // InternalRobotDsl.g:585:2: ( () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) ) )
            // InternalRobotDsl.g:586:3: () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) )
            {
            // InternalRobotDsl.g:586:3: ()
            // InternalRobotDsl.g:587:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintStatementAccess().getPrintStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintStatementAccess().getPrintKeyword_1());
            		
            // InternalRobotDsl.g:597:3: ( (lv_text_2_0= ruleEString ) )
            // InternalRobotDsl.g:598:4: (lv_text_2_0= ruleEString )
            {
            // InternalRobotDsl.g:598:4: (lv_text_2_0= ruleEString )
            // InternalRobotDsl.g:599:5: lv_text_2_0= ruleEString
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
    // InternalRobotDsl.g:620:1: entryRuleExecuteStatement returns [EObject current=null] : iv_ruleExecuteStatement= ruleExecuteStatement EOF ;
    public final EObject entryRuleExecuteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecuteStatement = null;


        try {
            // InternalRobotDsl.g:620:57: (iv_ruleExecuteStatement= ruleExecuteStatement EOF )
            // InternalRobotDsl.g:621:2: iv_ruleExecuteStatement= ruleExecuteStatement EOF
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
    // InternalRobotDsl.g:627:1: ruleExecuteStatement returns [EObject current=null] : ( () otherlv_1= 'execute' ( ( ruleEString ) ) ) ;
    public final EObject ruleExecuteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:633:2: ( ( () otherlv_1= 'execute' ( ( ruleEString ) ) ) )
            // InternalRobotDsl.g:634:2: ( () otherlv_1= 'execute' ( ( ruleEString ) ) )
            {
            // InternalRobotDsl.g:634:2: ( () otherlv_1= 'execute' ( ( ruleEString ) ) )
            // InternalRobotDsl.g:635:3: () otherlv_1= 'execute' ( ( ruleEString ) )
            {
            // InternalRobotDsl.g:635:3: ()
            // InternalRobotDsl.g:636:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExecuteStatementAccess().getExecuteStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExecuteStatementAccess().getExecuteKeyword_1());
            		
            // InternalRobotDsl.g:646:3: ( ( ruleEString ) )
            // InternalRobotDsl.g:647:4: ( ruleEString )
            {
            // InternalRobotDsl.g:647:4: ( ruleEString )
            // InternalRobotDsl.g:648:5: ruleEString
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


    // $ANTLR start "entryRuleConditionalStatement"
    // InternalRobotDsl.g:666:1: entryRuleConditionalStatement returns [EObject current=null] : iv_ruleConditionalStatement= ruleConditionalStatement EOF ;
    public final EObject entryRuleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStatement = null;


        try {
            // InternalRobotDsl.g:666:61: (iv_ruleConditionalStatement= ruleConditionalStatement EOF )
            // InternalRobotDsl.g:667:2: iv_ruleConditionalStatement= ruleConditionalStatement EOF
            {
             newCompositeNode(grammarAccess.getConditionalStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalStatement=ruleConditionalStatement();

            state._fsp--;

             current =iv_ruleConditionalStatement; 
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
    // $ANTLR end "entryRuleConditionalStatement"


    // $ANTLR start "ruleConditionalStatement"
    // InternalRobotDsl.g:673:1: ruleConditionalStatement returns [EObject current=null] : this_UntilStatement_0= ruleUntilStatement ;
    public final EObject ruleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject this_UntilStatement_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:679:2: (this_UntilStatement_0= ruleUntilStatement )
            // InternalRobotDsl.g:680:2: this_UntilStatement_0= ruleUntilStatement
            {

            		newCompositeNode(grammarAccess.getConditionalStatementAccess().getUntilStatementParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_UntilStatement_0=ruleUntilStatement();

            state._fsp--;


            		current = this_UntilStatement_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleConditionalStatement"


    // $ANTLR start "entryRuleUntilStatement"
    // InternalRobotDsl.g:691:1: entryRuleUntilStatement returns [EObject current=null] : iv_ruleUntilStatement= ruleUntilStatement EOF ;
    public final EObject entryRuleUntilStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntilStatement = null;


        try {
            // InternalRobotDsl.g:691:55: (iv_ruleUntilStatement= ruleUntilStatement EOF )
            // InternalRobotDsl.g:692:2: iv_ruleUntilStatement= ruleUntilStatement EOF
            {
             newCompositeNode(grammarAccess.getUntilStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUntilStatement=ruleUntilStatement();

            state._fsp--;

             current =iv_ruleUntilStatement; 
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
    // $ANTLR end "entryRuleUntilStatement"


    // $ANTLR start "ruleUntilStatement"
    // InternalRobotDsl.g:698:1: ruleUntilStatement returns [EObject current=null] : ( () otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) ;
    public final EObject ruleUntilStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statements_4_0 = null;

        EObject lv_statements_5_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:704:2: ( ( () otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            // InternalRobotDsl.g:705:2: ( () otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )
            {
            // InternalRobotDsl.g:705:2: ( () otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )
            // InternalRobotDsl.g:706:3: () otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= '{' ( (lv_statements_4_0= ruleStatement ) ) ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}'
            {
            // InternalRobotDsl.g:706:3: ()
            // InternalRobotDsl.g:707:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUntilStatementAccess().getUntilStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getUntilStatementAccess().getUntilKeyword_1());
            		
            // InternalRobotDsl.g:717:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalRobotDsl.g:718:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalRobotDsl.g:718:4: (lv_condition_2_0= ruleCondition )
            // InternalRobotDsl.g:719:5: lv_condition_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getUntilStatementAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUntilStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.robot.dsl.RobotDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getUntilStatementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRobotDsl.g:740:3: ( (lv_statements_4_0= ruleStatement ) )
            // InternalRobotDsl.g:741:4: (lv_statements_4_0= ruleStatement )
            {
            // InternalRobotDsl.g:741:4: (lv_statements_4_0= ruleStatement )
            // InternalRobotDsl.g:742:5: lv_statements_4_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getUntilStatementAccess().getStatementsStatementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_statements_4_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUntilStatementRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_4_0,
            						"org.robot.dsl.RobotDsl.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotDsl.g:759:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=21 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRobotDsl.g:760:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalRobotDsl.g:760:4: (lv_statements_5_0= ruleStatement )
            	    // InternalRobotDsl.g:761:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getUntilStatementAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUntilStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.robot.dsl.RobotDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getUntilStatementAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleUntilStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001E08000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001E00000L});

}