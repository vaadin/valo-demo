/*
 * Copyright 2000-2014 Vaadin Ltd.
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

import com.vaadin.server.Responsive;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.themes.ValoTheme;

/**
 * 
 * @since
 * @author Vaadin Ltd
 */
public class DocumentationItem extends Panel {

    private CssLayout root;

    public DocumentationItem(final String caption, final String description,
            final String javaExample, final String scssExample) {
        setContent(root = new CssLayout() {
            {
                Responsive.makeResponsive(this);
                addStyleName("documentation-item");
                setWidth("100%");

                Label documentation = new Label();
                documentation.setContentMode(ContentMode.HTML);
                documentation.setValue("<h3>"
                        + caption
                        + "</h3><p>"
                        + description.replaceAll("<", "&lt;").replaceAll(">",
                                "&gt;") + "</p>");
                documentation.addStyleName(ValoTheme.LABEL_SMALL);
                documentation.addStyleName(ValoTheme.LABEL_LIGHT);
                documentation.setSizeUndefined();
                documentation.addStyleName("documentation");
                addComponent(documentation);

                Label javaCode = null;
                if (javaExample != null) {
                    javaCode = new Label(javaExample, ContentMode.PREFORMATTED);
                    javaCode.addStyleName("v-scrollable");
                    javaCode.addStyleName(ValoTheme.LABEL_SMALL);
                    javaCode.setSizeUndefined();
                }

                Label scssCode = null;
                if (scssExample != null) {
                    scssCode = new Label(scssExample, ContentMode.PREFORMATTED);

                    scssCode.addStyleName("v-scrollable");
                    scssCode.addStyleName(ValoTheme.LABEL_SMALL);
                    scssCode.setSizeUndefined();
                }

                if (javaCode != null && scssCode != null) {
                    TabSheet tabs = new TabSheet();
                    tabs.addStyleName(ValoTheme.TABSHEET_PADDED_TABBAR);
                    tabs.setHeight("100%");
                    tabs.addStyleName("code-example");
                    tabs.addTab(javaCode, "Java");
                    tabs.addTab(scssCode, "SCSS");
                    addComponent(tabs);
                } else if (javaCode != null) {
                    addComponent(javaCode);
                    javaCode.addStyleName("code-example");
                } else if (scssCode != null) {
                    addComponent(scssCode);
                    scssCode.addStyleName("code-example");
                }
            }
        });
    }

    public void setExample(Component example) {
        root.addComponent(example, 1);
        example.addStyleName("example");
    }

}
