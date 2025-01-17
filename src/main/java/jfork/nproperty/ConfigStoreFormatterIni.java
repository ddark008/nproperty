/*
 * JFork Project
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package jfork.nproperty;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Store generator for ini-files format.
 */
public class ConfigStoreFormatterIni extends ConfigStoreFormatterImpl
{
	private String comments;
	@Override
	public String generate()
	{
		String lineSeparator = System.getProperty("line.separator");
		StringBuilder builder = new StringBuilder();

		if (comments != null){
			String[] commentStrings = comments.split("\\r?\\n", -1);
			for (String comment: commentStrings) {
				if (!comment.startsWith("#")){
					builder.append("# ");
				}
				builder.append(comment);
				builder.append(lineSeparator);
			}
		}
		StringWriter sw = new StringWriter();
		try {
			pairs.store(sw, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		builder.append(lineSeparator);
		builder.append(sw);

		return builder.toString();
	}
	public ConfigStoreFormatterIni(String comments){
		this.comments = comments;
	}
	public ConfigStoreFormatterIni(){}
}
