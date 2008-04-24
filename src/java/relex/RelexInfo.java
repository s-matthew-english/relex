/*
 * Copyright 2008 Novamente LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * @author miross
 * Created on Mar 29, 2005
 */
package relex;

import java.util.ArrayList;
import relex.output.SimpleView;

/**
 * This class encapsulates information about an input sentence
 * which is generated by Relex.  
 */
public class RelexInfo
{
	public String originalSentence;
	public ArrayList<ParsedSentence> parsedSentences;
	
	public RelexInfo(String _originalSentence, 
	                 ArrayList<ParsedSentence> _parsedSentences)
	{
		originalSentence = _originalSentence;
		parsedSentences = _parsedSentences;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		int numParses = 0;
		for (ParsedSentence parse: parsedSentences)
		{
			sb.append("Parse " + ((numParses++)+1) + 
			          " of " + parsedSentences.size()).append("\n");
			sb.append(SimpleView.printRelations(parse)).append("\n");
		}
		return sb.toString();
	}
}

