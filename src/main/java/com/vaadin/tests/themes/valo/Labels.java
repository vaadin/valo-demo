/*
 * Copyright 2000-2013 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.tests.themes.valo;

import com.vaadin.server.Resource;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 * 
 * @since
 * @author Vaadin Ltd
 */
public class Labels extends StyleguideView {
    public Labels() {

        // Headings

        DocumentationItem di = new DocumentationItem(
                "Headings",
                "<h1> <h2> <h3> and <h4> elements inside a Label will behave the same as a Label with a corresponding style name.",
                "Label label = new Label(\"Heading\");\nlabel.addStyleName(ValoTheme.LABEL_H1);\nlabel.addStyleName(ValoTheme.LABEL_H2);\nlabel.addStyleName(ValoTheme.LABEL_H3);\nlabel.addStyleName(ValoTheme.LABEL_H4);\n\n// or\n\nnew Label(\"<h1>Heading 1</h1>\", ContentMode.HTML);\nnew Label(\"<h2>Heading 2</h2>\", ContentMode.HTML);\nnew Label(\"<h3>Heading 3</h3>\", ContentMode.HTML);\nnew Label(\"<h4>Heading 4</h4>\", ContentMode.HTML);",
                null);
        di.setExample(new VerticalLayout() {
            {
                setMargin(new MarginInfo(false, true, false, true));

                Label l = new Label("Heading 1");
                l.addStyleName(ValoTheme.LABEL_H1);
                addComponent(l);
                l = new Label("Heading 2");
                l.addStyleName(ValoTheme.LABEL_H2);
                addComponent(l);
                l = new Label("Heading 3");
                l.addStyleName(ValoTheme.LABEL_H3);
                addComponent(l);
                l = new Label("Heading 4");
                l.addStyleName(ValoTheme.LABEL_H4);
                addComponent(l);
            }
        });
        addComponent(di);

        // Text sizes

        di = new DocumentationItem(
                "Text Sizes",
                "A typographic scale including five different sizes is available.",
                "Label label = new Label(\"Text\");\n"
                        + "label.addStyleName(ValoTheme.LABEL_HUGE);\n"
                        + "label.addStyleName(ValoTheme.LABEL_LARGE);\n"
                        + "label.addStyleName(ValoTheme.LABEL_SMALL);\n"
                        + "label.addStyleName(ValoTheme.LABEL_TINY);", null);
        di.setExample(new VerticalLayout() {
            {
                setMargin(new MarginInfo(false, true, false, true));
                setSpacing(true);

                Label l = new Label("Huge text.");
                l.addStyleName(ValoTheme.LABEL_HUGE);
                addComponent(l);
                l = new Label("Large text.");
                l.addStyleName(ValoTheme.LABEL_LARGE);
                addComponent(l);
                l = new Label("Normal text.");
                addComponent(l);
                l = new Label("Small text.");
                l.addStyleName(ValoTheme.LABEL_SMALL);
                addComponent(l);
                l = new Label("Tiny text.");
                l.addStyleName(ValoTheme.LABEL_TINY);
                addComponent(l);
            }
        });
        addComponent(di);

        // Additional styles

        di = new DocumentationItem(
                "Additional Styles",
                "Additional Label styles can be mixed together with any other Label styles freely to create new combinations.",
                "Label label = new Label(\"Text\");\nlabel.addStyleName(ValoTheme.LABEL_BOLD);\nlabel.addStyleName(ValoTheme.LABEL_LIGHT);\nlabel.addStyleName(ValoTheme.LABEL_COLORED);\nlabel.addStyleName(ValoTheme.LABEL_SUCCESS);\nlabel.addStyleName(ValoTheme.LABEL_FAILURE);",
                null);
        di.setExample(new VerticalLayout() {
            {
                setMargin(new MarginInfo(false, true, false, true));
                setSpacing(true);

                Label l = new Label("Bold text.");
                l.addStyleName(ValoTheme.LABEL_BOLD);
                addComponent(l);
                l = new Label("Light text.");
                l.addStyleName(ValoTheme.LABEL_LIGHT);
                addComponent(l);
                l = new Label("Colored text.");
                l.addStyleName(ValoTheme.LABEL_COLORED);
                addComponent(l);
                l = new Label("Success text.");
                l.addStyleName(ValoTheme.LABEL_SUCCESS);
                addComponent(l);
                l = new Label("Failure text.");
                l.addStyleName(ValoTheme.LABEL_FAILURE);
                addComponent(l);
                l = new Label("Colored Heading 4");
                l.addStyleName(ValoTheme.LABEL_COLORED);
                l.addStyleName(ValoTheme.LABEL_H4);
                addComponent(l);
                l = new Label("Large bold text.");
                l.addStyleName(ValoTheme.LABEL_LARGE);
                l.addStyleName(ValoTheme.LABEL_BOLD);
                addComponent(l);
                l = new Label("Tiny light text.");
                l.addStyleName(ValoTheme.LABEL_TINY);
                l.addStyleName(ValoTheme.LABEL_LIGHT);
                addComponent(l);
            }
        });
        addComponent(di);

    }

    @Override
    public Resource getMenuIcon() {
        return SamplerIcon.LABEL;
    }
}
