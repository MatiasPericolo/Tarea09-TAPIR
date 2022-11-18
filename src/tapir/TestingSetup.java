package tapir;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import main.Cine;

public class TestingSetup {
	public static void setup() {
		HashMap<Integer, String> mapObjectsToCallSequence = null; 
		HashMap<String, String> mapMethodsToSymbols = null; 
		Pattern regularExpression = null; 
		Matcher matcher = null;
		
		//Specification of the test class\
		TestingCore.mapClassToTestingInformation = new HashMap<>();
			
		// Testing setup for Cine class
		//Definition of the methods and their corresponding symbols
		mapObjectsToCallSequence = new HashMap<>(); 
		mapMethodsToSymbols = new HashMap<String, String>();
		mapMethodsToSymbols.put("main.Cine.<init>", "c");
		mapMethodsToSymbols.put("main.Cine.openCine", "o");
		mapMethodsToSymbols.put("main.Cine.selectFilm", "f");
		mapMethodsToSymbols.put("main.Cine.sellTicket", "t");
		mapMethodsToSymbols.put("main.Cine.buyFilm", "b");
		mapMethodsToSymbols.put("main.Cine.closeCine", "x");
		//Definition of the regular expression
		regularExpression = Pattern.compile("cof(f|t|b)*x");
		//Initializing the regular expressions controller
		matcher = regularExpression.matcher("");	
		// All information related to how the Cine class is testing is store in a TestingInformation instance
		//Abort if error
		//TestingInformation ti = new TestingInformation(Cine.class.toString(), mapObjectsToCallSequence, mapMethodsToSymbols, regularExpression, matcher, true);
		//Continue if error
		TestingInformation ti = new TestingInformation(Cine.class.toString(), mapObjectsToCallSequence, mapMethodsToSymbols, regularExpression, matcher, false);
		TestingCore.mapClassToTestingInformation.put(Cine.class.toString(), ti);
		
	}
	
}
