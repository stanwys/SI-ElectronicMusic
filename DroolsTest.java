package com.sample;

import javax.swing.JOptionPane;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
         //   Message message = new Message();
         //   message.setMessage("Hello World");
         //   message.setStatus(Message.HELLO);
        //    kSession.insert(message);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    public static class Pytanie
    {
    	public String question;
    	public String answer;
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
    }
    
    
    public static class Odpowiedz
    {
    	public String que;
    	public String ans;
		public String getQue() {
			return que;
		}
		public void setQue(String que) {
			this.que = que;
		}
		public String getAns() {
			return ans;
		}
		public void setAns(String ans) {
			this.ans = ans;
		}
    	
    }
    
    public static class Window
    {
    	public static void wyswietl(Pytanie p,Odpowiedz o,String[] possible)
    	{
    		String selectedValue = (String)JOptionPane.showInputDialog(null,
                	p.getQuestion(),"Electronic music",
                	JOptionPane.INFORMATION_MESSAGE, null,
                	possible, possible[0]);
   			p.setAnswer(selectedValue);
   			o.setAns(selectedValue);
    	}
    }
    
    
    
    
    
    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
