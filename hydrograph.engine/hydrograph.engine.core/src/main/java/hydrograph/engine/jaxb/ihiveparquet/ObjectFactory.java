
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
 * limitations under the License.
 ******************************************************************************/

package hydrograph.engine.jaxb.ihiveparquet;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * The Class ObjectFactory .
 *
 * @author Bitwise
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hydrograph.engine.jaxb.ihiveparquet
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HivePartitionFieldsType }
     * 
     */
    public HivePartitionFieldsType createHivePartitionFieldsType() {
        return new HivePartitionFieldsType();
    }

    /**
     * Create an instance of {@link HivePathType }
     * 
     */
    public HivePathType createHivePathType() {
        return new HivePathType();
    }

    /**
     * Create an instance of {@link TypeInputDelimitedOutSocket }
     * 
     */
    public TypeInputDelimitedOutSocket createTypeInputDelimitedOutSocket() {
        return new TypeInputDelimitedOutSocket();
    }

    /**
     * Create an instance of {@link TypeInputFileDelimitedBase }
     * 
     */
    public TypeInputFileDelimitedBase createTypeInputFileDelimitedBase() {
        return new TypeInputFileDelimitedBase();
    }

    /**
     * Create an instance of {@link FieldBasicType }
     * 
     */
    public FieldBasicType createFieldBasicType() {
        return new FieldBasicType();
    }

    /**
     * Create an instance of {@link HivePartitionFilterType }
     * 
     */
    public HivePartitionFilterType createHivePartitionFilterType() {
        return new HivePartitionFilterType();
    }

    /**
     * Create an instance of {@link PartitionColumn }
     * 
     */
    public PartitionColumn createPartitionColumn() {
        return new PartitionColumn();
    }

    /**
     * Create an instance of {@link HiveType }
     * 
     */
    public HiveType createHiveType() {
        return new HiveType();
    }

    /**
     * Create an instance of {@link PartitionFieldBasicType }
     * 
     */
    public PartitionFieldBasicType createPartitionFieldBasicType() {
        return new PartitionFieldBasicType();
    }

}
