/*******************************************************************************
 * Copyright 2017 Capital One Services, LLC and Bitwise, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 *******************************************************************************/
package hydrograph.engine.cascading.test.customtransformclasses;

import hydrograph.engine.transformation.userfunctions.base.ReusableRow;
import hydrograph.engine.transformation.userfunctions.base.TransformBase;

import java.util.ArrayList;
import java.util.Properties;

/**
 * This custom transform class is used in {@link TransformCustomAssemblyTest}
 * unit test class
 * 
 * @author Prabodh
 * @see TransformCustomAssemblyTest
 */
public class TransformTest_RenameFields implements TransformBase {

	@Override
	public void prepare(Properties props, ArrayList<String> inputFields,
			ArrayList<String> outputFields) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transform(ReusableRow inputRow, ReusableRow outputRow) {
		outputRow.setField("new.id", inputRow.getInteger("id"));
		outputRow.setField("new.name", inputRow.getString("name"));
		outputRow.setField("new.city", inputRow.getString("city"));
	}

	@Override
	public void cleanup() {
		// TODO Auto-generated method stub

	}

}
