package test;

import java.util.ArrayList;

public class TestClass {
    public String balance;
    ArrayList<TestClass> classes = new ArrayList<TestClass>();
    
    public TestClass() {
    	classes.add(this);
    }
    
    /*@ normal_behavior
      @ ensures \result == classes.get(0).balance.equals("5");
      @ assignable \nothing;
      @*/
    public boolean accessBalanceFromOtherClass() {
        return classes.get(0).balance.equals("5");
        
    }
    
    
}
