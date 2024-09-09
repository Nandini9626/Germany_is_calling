package ExecutingPack;

import java.io.IOException;

import org.testng.annotations.Test;

import BasePack.BaseClass;

public class ExecutingClass extends BaseClass {
  @Test(priority=1)
  public void valid() throws InterruptedException, IOException {
	  ScriptingClass S= new ScriptingClass();
	  S.ValidLogin();
	 
  }
  @Test (priority=2)
  public void Invalid1() throws InterruptedException, IOException {
	  ScriptingClass S= new ScriptingClass();
	  S.InValidLogin1();
  }
  @Test (priority=3)
  public void Invalid2() throws InterruptedException, IOException {
	  ScriptingClass S= new ScriptingClass();
	  S.InValidLogin2();
  }
  @Test (priority=3)
  public void Invalid3() throws InterruptedException, IOException {
	  ScriptingClass S= new ScriptingClass();
	  S.InValidLogin3();
  }
}
