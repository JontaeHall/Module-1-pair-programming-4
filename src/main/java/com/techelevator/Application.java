package com.techelevator;


import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.TElog;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		try {

			// Step Two: Create TELog, and log the start of the application.
			//
			TElog.log("Search application started");
			
			
			
			// Step Four: Instantiate a Search Domain
			//
			SearchDomain  domainSearch= new SearchDomain("data");
			TElog.log(domainSearch.toString());
			
			
			
			// Step Six: Single word search
			//
			SearchEngine engine = new SearchEngine(domainSearch);
			engine.indexFiles();
			//engine.search("squirrel");
			List<String> engineSearch = new ArrayList<>();
			for (String gene: engine.search("squirrel")) {

			}
			for(int i = 0; i< engineSearch.size(); i++){
				System.out.println(engineSearch.get(i));
				if(engineSearch.isEmpty()){
					System.out.println("Word not found");
				}
			}
			
			// Step Seven: Multiple word search
			//
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
