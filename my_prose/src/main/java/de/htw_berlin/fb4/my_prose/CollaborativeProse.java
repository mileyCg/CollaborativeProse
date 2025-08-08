package de.htw_berlin.fb4.my_prose;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

public class CollaborativeProse {
	
	private Prosebuilder proseBuilder;
	
	public CollaborativeProse(){
	this.proseBuilder = new ProseBuilder();
	com.example.SimpleSentence simpleSentence = new SimpleSentence();
	com.example.SimpleProse simpleProse = newSimpleProse();
	
	proseBuilder.register(simpleSentence);
	proseBuilder.register(simpleProse);
	}

	
