/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.coverage;

/*
No coverage in idea 13

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.InnerTestClasses;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

@SuppressWarnings("all")
@TestMetadata("idea/testData/coverage/outputFiles")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinCoverageOutputFilesTestGenerated extends AbstractKotlinCoverageOutputFilesTest {
    public void testAllFilesPresentInOutputFiles() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/coverage/outputFiles"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("NotInlinedLambda.kt")
    public void testNotInlinedLambda() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/coverage/outputFiles/NotInlinedLambda.kt");
        doTest(fileName);
    }
}

*/
