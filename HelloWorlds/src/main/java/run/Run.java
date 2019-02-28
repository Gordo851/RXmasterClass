package run;

import HelloWorld.HelloWorlds.BestestHelloWorld;
import HelloWorld.HelloWorlds.BetterHelloWorld;
import HelloWorld.HelloWorlds.HelloWorldBasic;
import guiExample.*;
public class Run {
	public static void main( String[] args )
    {
    	HelloWorldBasic a = new HelloWorldBasic();
    	a.helloWorldBasic();
    	BetterHelloWorld b = new BetterHelloWorld();
    	b.betterHelloWorld();
    	BestestHelloWorld c = new BestestHelloWorld();
    	c.bettestHelloWorld();
    	ActionListenerExample d = new ActionListenerExample();
    	d.gui();
    }
}
