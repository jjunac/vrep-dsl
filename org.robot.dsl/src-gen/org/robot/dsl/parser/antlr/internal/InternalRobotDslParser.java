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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'{'", "'connect_to'", "'scenarii'", "'}'", "'global'", "'initial'", "':'", "'Scenario'", "'object_ahead'", "'true'", "'right'", "'forward'", "'print'", "'execute'", "'while'", "'until'", "'if'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalRobotDsl.g:71:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'connect_to' ( (lv_connection_4_0= ruleConnection ) ) )? (otherlv_5= 'scenarii' otherlv_6= '{' ( (lv_scenarii_7_0= ruleScenario ) ) ( (lv_scenarii_8_0= ruleScenario ) )* otherlv_9= '}' )? otherlv_10= 'global' ( (lv_global_11_0= ruleStatementBlock ) ) otherlv_12= 'initial' ( ( ruleEString ) ) otherlv_14= '}' ) ;
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
            // InternalRobotDsl.g:77:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'connect_to' ( (lv_connection_4_0= ruleConnection ) ) )? (otherlv_5= 'scenarii' otherlv_6= '{' ( (lv_scenarii_7_0= ruleScenario ) ) ( (lv_scenarii_8_0= ruleScenario ) )* otherlv_9= '}' )? otherlv_10= 'global' ( (lv_global_11_0= ruleStatementBlock ) ) otherlv_12= 'initial' ( ( ruleEString ) ) otherlv_14= '}' ) )
            // InternalRobotDsl.g:78:2: (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'connect_to' ( (lv_connection_4_0= ruleConnection ) ) )? (otherlv_5= 'scenarii' otherlv_6= '{' ( (lv_scenarii_7_0= ruleScenario ) ) ( (lv_scenarii_8_0= ruleScenario ) )* otherlv_9= '}' )? otherlv_10= 'global' ( (lv_global_11_0= ruleStatementBlock ) ) otherlv_12= 'initial' ( ( ruleEString ) ) otherlv_14= '}' )
            {
            // InternalRobotDsl.g:78:2: (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'connect_to' ( (lv_connection_4_0= ruleConnection ) ) )? (otherlv_5= 'scenarii' otherlv_6= '{' ( (lv_scenarii_7_0= ruleScenario ) ) ( (lv_scenarii_8_0= ruleScenario ) )* otherlv_9= '}' )? otherlv_10= 'global' ( (lv_global_11_0= ruleStatementBlock ) ) otherlv_12= 'initial' ( ( ruleEString ) ) otherlv_14= '}' )
            // InternalRobotDsl.g:79:3: otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'connect_to' ( (lv_connection_4_0= ruleConnection ) ) )? (otherlv_5= 'scenarii' otherlv_6= '{' ( (lv_scenarii_7_0= ruleScenario ) ) ( (lv_scenarii_8_0= ruleScenario ) )* otherlv_9= '}' )? otherlv_10= 'global' ( (lv_global_11_0= ruleStatementBlock ) ) otherlv_12= 'initial' ( ( ruleEString ) ) otherlv_14= '}'
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

            otherlv_10=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getRobotAccess().getGlobalKeyword_5());
            		
            // InternalRobotDsl.g:187:3: ( (lv_global_11_0= ruleStatementBlock ) )
            // InternalRobotDsl.g:188:4: (lv_global_11_0= ruleStatementBlock )
            {
            // InternalRobotDsl.g:188:4: (lv_global_11_0= ruleStatementBlock )
            // InternalRobotDsl.g:189:5: lv_global_11_0= ruleStatementBlock
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getGlobalStatementBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_global_11_0=ruleStatementBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"global",
            						lv_global_11_0,
            						"org.robot.dsl.RobotDsl.StatementBlock");
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
    // InternalRobotDsl.g:342:1: ruleScenario returns [EObject current=null] : ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statementBlock_3_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:348:2: ( ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) ) )
            // InternalRobotDsl.g:349:2: ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) )
            {
            // InternalRobotDsl.g:349:2: ( () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) )
            // InternalRobotDsl.g:350:3: () otherlv_1= 'Scenario' ( (lv_name_2_0= ruleEString ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) )
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

            // InternalRobotDsl.g:380:3: ( (lv_statementBlock_3_0= ruleStatementBlock ) )
            // InternalRobotDsl.g:381:4: (lv_statementBlock_3_0= ruleStatementBlock )
            {
            // InternalRobotDsl.g:381:4: (lv_statementBlock_3_0= ruleStatementBlock )
            // InternalRobotDsl.g:382:5: lv_statementBlock_3_0= ruleStatementBlock
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getStatementBlockStatementBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_statementBlock_3_0=ruleStatementBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"statementBlock",
            						lv_statementBlock_3_0,
            						"org.robot.dsl.RobotDsl.StatementBlock");
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleStatementBlock"
    // InternalRobotDsl.g:403:1: entryRuleStatementBlock returns [EObject current=null] : iv_ruleStatementBlock= ruleStatementBlock EOF ;
    public final EObject entryRuleStatementBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementBlock = null;


        try {
            // InternalRobotDsl.g:403:55: (iv_ruleStatementBlock= ruleStatementBlock EOF )
            // InternalRobotDsl.g:404:2: iv_ruleStatementBlock= ruleStatementBlock EOF
            {
             newCompositeNode(grammarAccess.getStatementBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatementBlock=ruleStatementBlock();

            state._fsp--;

             current =iv_ruleStatementBlock; 
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
    // $ANTLR end "entryRuleStatementBlock"


    // $ANTLR start "ruleStatementBlock"
    // InternalRobotDsl.g:410:1: ruleStatementBlock returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleStatementBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_statements_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:416:2: ( ( () otherlv_1= '{' ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' ) )
            // InternalRobotDsl.g:417:2: ( () otherlv_1= '{' ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            {
            // InternalRobotDsl.g:417:2: ( () otherlv_1= '{' ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}' )
            // InternalRobotDsl.g:418:3: () otherlv_1= '{' ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )? otherlv_4= '}'
            {
            // InternalRobotDsl.g:418:3: ()
            // InternalRobotDsl.g:419:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatementBlockAccess().getStatementBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRobotDsl.g:429:3: ( ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=28)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRobotDsl.g:430:4: ( (lv_statements_2_0= ruleStatement ) ) ( (lv_statements_3_0= ruleStatement ) )*
                    {
                    // InternalRobotDsl.g:430:4: ( (lv_statements_2_0= ruleStatement ) )
                    // InternalRobotDsl.g:431:5: (lv_statements_2_0= ruleStatement )
                    {
                    // InternalRobotDsl.g:431:5: (lv_statements_2_0= ruleStatement )
                    // InternalRobotDsl.g:432:6: lv_statements_2_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_statements_2_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementBlockRule());
                    						}
                    						add(
                    							current,
                    							"statements",
                    							lv_statements_2_0,
                    							"org.robot.dsl.RobotDsl.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobotDsl.g:449:4: ( (lv_statements_3_0= ruleStatement ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=22 && LA5_0<=28)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRobotDsl.g:450:5: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // InternalRobotDsl.g:450:5: (lv_statements_3_0= ruleStatement )
                    	    // InternalRobotDsl.g:451:6: lv_statements_3_0= ruleStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_statements_3_0=ruleStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStatementBlockRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"statements",
                    	    							lv_statements_3_0,
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleStatementBlock"


    // $ANTLR start "entryRuleCondition"
    // InternalRobotDsl.g:477:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalRobotDsl.g:477:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalRobotDsl.g:478:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalRobotDsl.g:484:1: ruleCondition returns [EObject current=null] : (this_ObjectAheadCondition_0= ruleObjectAheadCondition | this_TrueCondition_1= ruleTrueCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectAheadCondition_0 = null;

        EObject this_TrueCondition_1 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:490:2: ( (this_ObjectAheadCondition_0= ruleObjectAheadCondition | this_TrueCondition_1= ruleTrueCondition ) )
            // InternalRobotDsl.g:491:2: (this_ObjectAheadCondition_0= ruleObjectAheadCondition | this_TrueCondition_1= ruleTrueCondition )
            {
            // InternalRobotDsl.g:491:2: (this_ObjectAheadCondition_0= ruleObjectAheadCondition | this_TrueCondition_1= ruleTrueCondition )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRobotDsl.g:492:3: this_ObjectAheadCondition_0= ruleObjectAheadCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getObjectAheadConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectAheadCondition_0=ruleObjectAheadCondition();

                    state._fsp--;


                    			current = this_ObjectAheadCondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDsl.g:501:3: this_TrueCondition_1= ruleTrueCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getTrueConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrueCondition_1=ruleTrueCondition();

                    state._fsp--;


                    			current = this_TrueCondition_1;
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleObjectAheadCondition"
    // InternalRobotDsl.g:513:1: entryRuleObjectAheadCondition returns [EObject current=null] : iv_ruleObjectAheadCondition= ruleObjectAheadCondition EOF ;
    public final EObject entryRuleObjectAheadCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAheadCondition = null;


        try {
            // InternalRobotDsl.g:513:61: (iv_ruleObjectAheadCondition= ruleObjectAheadCondition EOF )
            // InternalRobotDsl.g:514:2: iv_ruleObjectAheadCondition= ruleObjectAheadCondition EOF
            {
             newCompositeNode(grammarAccess.getObjectAheadConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectAheadCondition=ruleObjectAheadCondition();

            state._fsp--;

             current =iv_ruleObjectAheadCondition; 
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
    // $ANTLR end "entryRuleObjectAheadCondition"


    // $ANTLR start "ruleObjectAheadCondition"
    // InternalRobotDsl.g:520:1: ruleObjectAheadCondition returns [EObject current=null] : ( () otherlv_1= 'object_ahead' ) ;
    public final EObject ruleObjectAheadCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:526:2: ( ( () otherlv_1= 'object_ahead' ) )
            // InternalRobotDsl.g:527:2: ( () otherlv_1= 'object_ahead' )
            {
            // InternalRobotDsl.g:527:2: ( () otherlv_1= 'object_ahead' )
            // InternalRobotDsl.g:528:3: () otherlv_1= 'object_ahead'
            {
            // InternalRobotDsl.g:528:3: ()
            // InternalRobotDsl.g:529:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectAheadConditionAccess().getObjectAheadConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAheadConditionAccess().getObject_aheadKeyword_1());
            		

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
    // $ANTLR end "ruleObjectAheadCondition"


    // $ANTLR start "entryRuleTrueCondition"
    // InternalRobotDsl.g:543:1: entryRuleTrueCondition returns [EObject current=null] : iv_ruleTrueCondition= ruleTrueCondition EOF ;
    public final EObject entryRuleTrueCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueCondition = null;


        try {
            // InternalRobotDsl.g:543:54: (iv_ruleTrueCondition= ruleTrueCondition EOF )
            // InternalRobotDsl.g:544:2: iv_ruleTrueCondition= ruleTrueCondition EOF
            {
             newCompositeNode(grammarAccess.getTrueConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrueCondition=ruleTrueCondition();

            state._fsp--;

             current =iv_ruleTrueCondition; 
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
    // $ANTLR end "entryRuleTrueCondition"


    // $ANTLR start "ruleTrueCondition"
    // InternalRobotDsl.g:550:1: ruleTrueCondition returns [EObject current=null] : ( () otherlv_1= 'true' ) ;
    public final EObject ruleTrueCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:556:2: ( ( () otherlv_1= 'true' ) )
            // InternalRobotDsl.g:557:2: ( () otherlv_1= 'true' )
            {
            // InternalRobotDsl.g:557:2: ( () otherlv_1= 'true' )
            // InternalRobotDsl.g:558:3: () otherlv_1= 'true'
            {
            // InternalRobotDsl.g:558:3: ()
            // InternalRobotDsl.g:559:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueConditionAccess().getTrueConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTrueConditionAccess().getTrueKeyword_1());
            		

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
    // $ANTLR end "ruleTrueCondition"


    // $ANTLR start "entryRuleStatement"
    // InternalRobotDsl.g:573:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRobotDsl.g:573:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRobotDsl.g:574:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalRobotDsl.g:580:1: ruleStatement returns [EObject current=null] : (this_ControlStatement_0= ruleControlStatement | this_ExecuteStatement_1= ruleExecuteStatement | this_PrintStatement_2= rulePrintStatement | this_ConditionalStatement_3= ruleConditionalStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ControlStatement_0 = null;

        EObject this_ExecuteStatement_1 = null;

        EObject this_PrintStatement_2 = null;

        EObject this_ConditionalStatement_3 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:586:2: ( (this_ControlStatement_0= ruleControlStatement | this_ExecuteStatement_1= ruleExecuteStatement | this_PrintStatement_2= rulePrintStatement | this_ConditionalStatement_3= ruleConditionalStatement ) )
            // InternalRobotDsl.g:587:2: (this_ControlStatement_0= ruleControlStatement | this_ExecuteStatement_1= ruleExecuteStatement | this_PrintStatement_2= rulePrintStatement | this_ConditionalStatement_3= ruleConditionalStatement )
            {
            // InternalRobotDsl.g:587:2: (this_ControlStatement_0= ruleControlStatement | this_ExecuteStatement_1= ruleExecuteStatement | this_PrintStatement_2= rulePrintStatement | this_ConditionalStatement_3= ruleConditionalStatement )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 26:
            case 27:
            case 28:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRobotDsl.g:588:3: this_ControlStatement_0= ruleControlStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getControlStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ControlStatement_0=ruleControlStatement();

                    state._fsp--;


                    			current = this_ControlStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDsl.g:597:3: this_ExecuteStatement_1= ruleExecuteStatement
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
                    // InternalRobotDsl.g:606:3: this_PrintStatement_2= rulePrintStatement
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
                    // InternalRobotDsl.g:615:3: this_ConditionalStatement_3= ruleConditionalStatement
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


    // $ANTLR start "entryRuleControlStatement"
    // InternalRobotDsl.g:627:1: entryRuleControlStatement returns [EObject current=null] : iv_ruleControlStatement= ruleControlStatement EOF ;
    public final EObject entryRuleControlStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlStatement = null;


        try {
            // InternalRobotDsl.g:627:57: (iv_ruleControlStatement= ruleControlStatement EOF )
            // InternalRobotDsl.g:628:2: iv_ruleControlStatement= ruleControlStatement EOF
            {
             newCompositeNode(grammarAccess.getControlStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlStatement=ruleControlStatement();

            state._fsp--;

             current =iv_ruleControlStatement; 
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
    // $ANTLR end "entryRuleControlStatement"


    // $ANTLR start "ruleControlStatement"
    // InternalRobotDsl.g:634:1: ruleControlStatement returns [EObject current=null] : ( (this_RightStatement_0= ruleRightStatement | this_ForwardStatement_1= ruleForwardStatement ) ( (lv_value_2_0= RULE_INT ) )? ) ;
    public final EObject ruleControlStatement() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        EObject this_RightStatement_0 = null;

        EObject this_ForwardStatement_1 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:640:2: ( ( (this_RightStatement_0= ruleRightStatement | this_ForwardStatement_1= ruleForwardStatement ) ( (lv_value_2_0= RULE_INT ) )? ) )
            // InternalRobotDsl.g:641:2: ( (this_RightStatement_0= ruleRightStatement | this_ForwardStatement_1= ruleForwardStatement ) ( (lv_value_2_0= RULE_INT ) )? )
            {
            // InternalRobotDsl.g:641:2: ( (this_RightStatement_0= ruleRightStatement | this_ForwardStatement_1= ruleForwardStatement ) ( (lv_value_2_0= RULE_INT ) )? )
            // InternalRobotDsl.g:642:3: (this_RightStatement_0= ruleRightStatement | this_ForwardStatement_1= ruleForwardStatement ) ( (lv_value_2_0= RULE_INT ) )?
            {
            // InternalRobotDsl.g:642:3: (this_RightStatement_0= ruleRightStatement | this_ForwardStatement_1= ruleForwardStatement )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRobotDsl.g:643:4: this_RightStatement_0= ruleRightStatement
                    {

                    				newCompositeNode(grammarAccess.getControlStatementAccess().getRightStatementParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_15);
                    this_RightStatement_0=ruleRightStatement();

                    state._fsp--;


                    				current = this_RightStatement_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalRobotDsl.g:652:4: this_ForwardStatement_1= ruleForwardStatement
                    {

                    				newCompositeNode(grammarAccess.getControlStatementAccess().getForwardStatementParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_ForwardStatement_1=ruleForwardStatement();

                    state._fsp--;


                    				current = this_ForwardStatement_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRobotDsl.g:661:3: ( (lv_value_2_0= RULE_INT ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRobotDsl.g:662:4: (lv_value_2_0= RULE_INT )
                    {
                    // InternalRobotDsl.g:662:4: (lv_value_2_0= RULE_INT )
                    // InternalRobotDsl.g:663:5: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_value_2_0, grammarAccess.getControlStatementAccess().getValueINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getControlStatementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleControlStatement"


    // $ANTLR start "entryRuleRightStatement"
    // InternalRobotDsl.g:683:1: entryRuleRightStatement returns [EObject current=null] : iv_ruleRightStatement= ruleRightStatement EOF ;
    public final EObject entryRuleRightStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightStatement = null;


        try {
            // InternalRobotDsl.g:683:55: (iv_ruleRightStatement= ruleRightStatement EOF )
            // InternalRobotDsl.g:684:2: iv_ruleRightStatement= ruleRightStatement EOF
            {
             newCompositeNode(grammarAccess.getRightStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightStatement=ruleRightStatement();

            state._fsp--;

             current =iv_ruleRightStatement; 
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
    // $ANTLR end "entryRuleRightStatement"


    // $ANTLR start "ruleRightStatement"
    // InternalRobotDsl.g:690:1: ruleRightStatement returns [EObject current=null] : ( () otherlv_1= 'right' ) ;
    public final EObject ruleRightStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:696:2: ( ( () otherlv_1= 'right' ) )
            // InternalRobotDsl.g:697:2: ( () otherlv_1= 'right' )
            {
            // InternalRobotDsl.g:697:2: ( () otherlv_1= 'right' )
            // InternalRobotDsl.g:698:3: () otherlv_1= 'right'
            {
            // InternalRobotDsl.g:698:3: ()
            // InternalRobotDsl.g:699:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightStatementAccess().getRightStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRightStatementAccess().getRightKeyword_1());
            		

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
    // $ANTLR end "ruleRightStatement"


    // $ANTLR start "entryRuleForwardStatement"
    // InternalRobotDsl.g:713:1: entryRuleForwardStatement returns [EObject current=null] : iv_ruleForwardStatement= ruleForwardStatement EOF ;
    public final EObject entryRuleForwardStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardStatement = null;


        try {
            // InternalRobotDsl.g:713:57: (iv_ruleForwardStatement= ruleForwardStatement EOF )
            // InternalRobotDsl.g:714:2: iv_ruleForwardStatement= ruleForwardStatement EOF
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
    // InternalRobotDsl.g:720:1: ruleForwardStatement returns [EObject current=null] : ( () otherlv_1= 'forward' ) ;
    public final EObject ruleForwardStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:726:2: ( ( () otherlv_1= 'forward' ) )
            // InternalRobotDsl.g:727:2: ( () otherlv_1= 'forward' )
            {
            // InternalRobotDsl.g:727:2: ( () otherlv_1= 'forward' )
            // InternalRobotDsl.g:728:3: () otherlv_1= 'forward'
            {
            // InternalRobotDsl.g:728:3: ()
            // InternalRobotDsl.g:729:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForwardStatementAccess().getForwardStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

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
    // InternalRobotDsl.g:743:1: entryRulePrintStatement returns [EObject current=null] : iv_rulePrintStatement= rulePrintStatement EOF ;
    public final EObject entryRulePrintStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStatement = null;


        try {
            // InternalRobotDsl.g:743:55: (iv_rulePrintStatement= rulePrintStatement EOF )
            // InternalRobotDsl.g:744:2: iv_rulePrintStatement= rulePrintStatement EOF
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
    // InternalRobotDsl.g:750:1: rulePrintStatement returns [EObject current=null] : ( () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) ) ) ;
    public final EObject rulePrintStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:756:2: ( ( () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) ) ) )
            // InternalRobotDsl.g:757:2: ( () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) ) )
            {
            // InternalRobotDsl.g:757:2: ( () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) ) )
            // InternalRobotDsl.g:758:3: () otherlv_1= 'print' ( (lv_text_2_0= ruleEString ) )
            {
            // InternalRobotDsl.g:758:3: ()
            // InternalRobotDsl.g:759:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintStatementAccess().getPrintStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintStatementAccess().getPrintKeyword_1());
            		
            // InternalRobotDsl.g:769:3: ( (lv_text_2_0= ruleEString ) )
            // InternalRobotDsl.g:770:4: (lv_text_2_0= ruleEString )
            {
            // InternalRobotDsl.g:770:4: (lv_text_2_0= ruleEString )
            // InternalRobotDsl.g:771:5: lv_text_2_0= ruleEString
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
    // InternalRobotDsl.g:792:1: entryRuleExecuteStatement returns [EObject current=null] : iv_ruleExecuteStatement= ruleExecuteStatement EOF ;
    public final EObject entryRuleExecuteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecuteStatement = null;


        try {
            // InternalRobotDsl.g:792:57: (iv_ruleExecuteStatement= ruleExecuteStatement EOF )
            // InternalRobotDsl.g:793:2: iv_ruleExecuteStatement= ruleExecuteStatement EOF
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
    // InternalRobotDsl.g:799:1: ruleExecuteStatement returns [EObject current=null] : ( () otherlv_1= 'execute' ( ( ruleEString ) ) ) ;
    public final EObject ruleExecuteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRobotDsl.g:805:2: ( ( () otherlv_1= 'execute' ( ( ruleEString ) ) ) )
            // InternalRobotDsl.g:806:2: ( () otherlv_1= 'execute' ( ( ruleEString ) ) )
            {
            // InternalRobotDsl.g:806:2: ( () otherlv_1= 'execute' ( ( ruleEString ) ) )
            // InternalRobotDsl.g:807:3: () otherlv_1= 'execute' ( ( ruleEString ) )
            {
            // InternalRobotDsl.g:807:3: ()
            // InternalRobotDsl.g:808:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExecuteStatementAccess().getExecuteStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExecuteStatementAccess().getExecuteKeyword_1());
            		
            // InternalRobotDsl.g:818:3: ( ( ruleEString ) )
            // InternalRobotDsl.g:819:4: ( ruleEString )
            {
            // InternalRobotDsl.g:819:4: ( ruleEString )
            // InternalRobotDsl.g:820:5: ruleEString
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
    // InternalRobotDsl.g:838:1: entryRuleConditionalStatement returns [EObject current=null] : iv_ruleConditionalStatement= ruleConditionalStatement EOF ;
    public final EObject entryRuleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStatement = null;


        try {
            // InternalRobotDsl.g:838:61: (iv_ruleConditionalStatement= ruleConditionalStatement EOF )
            // InternalRobotDsl.g:839:2: iv_ruleConditionalStatement= ruleConditionalStatement EOF
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
    // InternalRobotDsl.g:845:1: ruleConditionalStatement returns [EObject current=null] : (this_UntilStatement_0= ruleUntilStatement | this_WhileStatement_1= ruleWhileStatement | this_IfStatement_2= ruleIfStatement ) ;
    public final EObject ruleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject this_UntilStatement_0 = null;

        EObject this_WhileStatement_1 = null;

        EObject this_IfStatement_2 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:851:2: ( (this_UntilStatement_0= ruleUntilStatement | this_WhileStatement_1= ruleWhileStatement | this_IfStatement_2= ruleIfStatement ) )
            // InternalRobotDsl.g:852:2: (this_UntilStatement_0= ruleUntilStatement | this_WhileStatement_1= ruleWhileStatement | this_IfStatement_2= ruleIfStatement )
            {
            // InternalRobotDsl.g:852:2: (this_UntilStatement_0= ruleUntilStatement | this_WhileStatement_1= ruleWhileStatement | this_IfStatement_2= ruleIfStatement )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRobotDsl.g:853:3: this_UntilStatement_0= ruleUntilStatement
                    {

                    			newCompositeNode(grammarAccess.getConditionalStatementAccess().getUntilStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UntilStatement_0=ruleUntilStatement();

                    state._fsp--;


                    			current = this_UntilStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRobotDsl.g:862:3: this_WhileStatement_1= ruleWhileStatement
                    {

                    			newCompositeNode(grammarAccess.getConditionalStatementAccess().getWhileStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_1=ruleWhileStatement();

                    state._fsp--;


                    			current = this_WhileStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRobotDsl.g:871:3: this_IfStatement_2= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getConditionalStatementAccess().getIfStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_2=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_2;
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
    // $ANTLR end "ruleConditionalStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalRobotDsl.g:883:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalRobotDsl.g:883:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalRobotDsl.g:884:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;

             current =iv_ruleWhileStatement; 
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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalRobotDsl.g:890:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statementBlock_3_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:896:2: ( ( () otherlv_1= 'while' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) ) )
            // InternalRobotDsl.g:897:2: ( () otherlv_1= 'while' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) )
            {
            // InternalRobotDsl.g:897:2: ( () otherlv_1= 'while' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) )
            // InternalRobotDsl.g:898:3: () otherlv_1= 'while' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) )
            {
            // InternalRobotDsl.g:898:3: ()
            // InternalRobotDsl.g:899:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileStatementAccess().getWhileStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
            		
            // InternalRobotDsl.g:909:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalRobotDsl.g:910:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalRobotDsl.g:910:4: (lv_condition_2_0= ruleCondition )
            // InternalRobotDsl.g:911:5: lv_condition_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.robot.dsl.RobotDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotDsl.g:928:3: ( (lv_statementBlock_3_0= ruleStatementBlock ) )
            // InternalRobotDsl.g:929:4: (lv_statementBlock_3_0= ruleStatementBlock )
            {
            // InternalRobotDsl.g:929:4: (lv_statementBlock_3_0= ruleStatementBlock )
            // InternalRobotDsl.g:930:5: lv_statementBlock_3_0= ruleStatementBlock
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getStatementBlockStatementBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_statementBlock_3_0=ruleStatementBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"statementBlock",
            						lv_statementBlock_3_0,
            						"org.robot.dsl.RobotDsl.StatementBlock");
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
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleUntilStatement"
    // InternalRobotDsl.g:951:1: entryRuleUntilStatement returns [EObject current=null] : iv_ruleUntilStatement= ruleUntilStatement EOF ;
    public final EObject entryRuleUntilStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntilStatement = null;


        try {
            // InternalRobotDsl.g:951:55: (iv_ruleUntilStatement= ruleUntilStatement EOF )
            // InternalRobotDsl.g:952:2: iv_ruleUntilStatement= ruleUntilStatement EOF
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
    // InternalRobotDsl.g:958:1: ruleUntilStatement returns [EObject current=null] : ( () otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) ) ;
    public final EObject ruleUntilStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statementBlock_3_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:964:2: ( ( () otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) ) )
            // InternalRobotDsl.g:965:2: ( () otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) )
            {
            // InternalRobotDsl.g:965:2: ( () otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) )
            // InternalRobotDsl.g:966:3: () otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) )
            {
            // InternalRobotDsl.g:966:3: ()
            // InternalRobotDsl.g:967:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUntilStatementAccess().getUntilStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getUntilStatementAccess().getUntilKeyword_1());
            		
            // InternalRobotDsl.g:977:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalRobotDsl.g:978:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalRobotDsl.g:978:4: (lv_condition_2_0= ruleCondition )
            // InternalRobotDsl.g:979:5: lv_condition_2_0= ruleCondition
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

            // InternalRobotDsl.g:996:3: ( (lv_statementBlock_3_0= ruleStatementBlock ) )
            // InternalRobotDsl.g:997:4: (lv_statementBlock_3_0= ruleStatementBlock )
            {
            // InternalRobotDsl.g:997:4: (lv_statementBlock_3_0= ruleStatementBlock )
            // InternalRobotDsl.g:998:5: lv_statementBlock_3_0= ruleStatementBlock
            {

            					newCompositeNode(grammarAccess.getUntilStatementAccess().getStatementBlockStatementBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_statementBlock_3_0=ruleStatementBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUntilStatementRule());
            					}
            					set(
            						current,
            						"statementBlock",
            						lv_statementBlock_3_0,
            						"org.robot.dsl.RobotDsl.StatementBlock");
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
    // $ANTLR end "ruleUntilStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalRobotDsl.g:1019:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalRobotDsl.g:1019:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalRobotDsl.g:1020:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalRobotDsl.g:1026:1: ruleIfStatement returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statementBlock_3_0 = null;



        	enterRule();

        try {
            // InternalRobotDsl.g:1032:2: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) ) )
            // InternalRobotDsl.g:1033:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) )
            {
            // InternalRobotDsl.g:1033:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) ) )
            // InternalRobotDsl.g:1034:3: () otherlv_1= 'if' ( (lv_condition_2_0= ruleCondition ) ) ( (lv_statementBlock_3_0= ruleStatementBlock ) )
            {
            // InternalRobotDsl.g:1034:3: ()
            // InternalRobotDsl.g:1035:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfStatementAccess().getIfStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getIfKeyword_1());
            		
            // InternalRobotDsl.g:1045:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalRobotDsl.g:1046:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalRobotDsl.g:1046:4: (lv_condition_2_0= ruleCondition )
            // InternalRobotDsl.g:1047:5: lv_condition_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.robot.dsl.RobotDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobotDsl.g:1064:3: ( (lv_statementBlock_3_0= ruleStatementBlock ) )
            // InternalRobotDsl.g:1065:4: (lv_statementBlock_3_0= ruleStatementBlock )
            {
            // InternalRobotDsl.g:1065:4: (lv_statementBlock_3_0= ruleStatementBlock )
            // InternalRobotDsl.g:1066:5: lv_statementBlock_3_0= ruleStatementBlock
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getStatementBlockStatementBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_statementBlock_3_0=ruleStatementBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"statementBlock",
            						lv_statementBlock_3_0,
            						"org.robot.dsl.RobotDsl.StatementBlock");
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
    // $ANTLR end "ruleIfStatement"

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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001FC08000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300000L});

}