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


import de.htw_berlin.fb4.ossd.prose.Sentence;

import java.util.ArrayList;
import java.util.List;

public class SimpleSentence implements Sentence {
    @Override
    public String get() {
        return null;
    }

    public List<String> getWords(String sentence) {
        List<String> list = new ArrayList<>();
        String[] array = sentence.split(" ");

        for (String word : array) {
            list.add(word);
        }

        return list;
    }
}
