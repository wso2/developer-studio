/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.developerstudio.eclipse.swttests.testcase;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wso2.developerstudio.eclipse.swtfunctionalframework.util.AbstractClass;
import org.wso2.developerstudio.eclipse.swtfunctionalframework.util.Setup;

@RunWith(SWTBotJunit4ClassRunner.class)
public class GadgetTest extends Setup {

    @Test
    public void createANewGadget(){

        String projectName = "NewGadget";
        try {
            AbstractClass.openProjectFromMenu("Gadget");
            AbstractClass.createGadgetProject(projectName);

            bot.editorByTitle("gadget.xml").show();
            bot.editorByTitle("gadget.xml").close();

            AbstractClass.openPerspective("Plug-in Development");

            bot.tree().getTreeItem("NewGadget").select();
            bot.tree().getTreeItem("NewGadget").expand();
        } catch (Exception e) {

        }

    }

}
