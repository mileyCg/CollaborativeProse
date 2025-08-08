/*
 * Diese Datei ist Teil von My-Prose Anwendung.
 * 
 * Copyright (c) [2025] [https://github/mileyCg]
 * 
 * Lizenziert unter der Open Software License Version 3.0 (OSL-3.0);
 * diese Datei darf nur in Übereinstimmung mit der Lizenz verwendet werden.
 * 
 * Eine Kopie der Lizenz ist verfügbar unter:
 *   https://opensource.org/licenses/OSL-3.0 
 *   
 * Sofern nicht gesetzlich vorgeschrieben oder schriftlich vereinbart,
 * wird die Software unter der Lizenz "WIE BESEHEN" bereitgestellt –  
 * OHNE JEGLICHE GEWÄHRLEISTUNG, weder ausdrücklich noch stillschweigend.
 * Siehe die Lizenz für spezifische Regelungen zu Rechten und 
Einschränkungen.
 * 
 * SPDX-License-Identifier: OSL-3.0
 */


package de.htw_berlin.fb4.my_prose;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //class from my repo
	com.example.SimpleSentence simpleSentence = new SimpleSentence();
	
	com.example.SimpleProse simpleProse = new 
SimpleProse(List.of(simpleSentence,simpleSentence));
	System.out.println(simpleProse.getText());

	ProseBuilder proseBuilder = new ProseBuilder();
	proseBuilder.register(simpleSentence);
	proseBuilder.register(simpleSentence);
	System.out.println(proseBuilder.get());
	
	CollaborativeProse collaborativeProse = new CollaborativeProse();
	collaborativeProse.print();

	

    }
}
