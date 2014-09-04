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

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Resource;
import com.vaadin.server.Responsive;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * 
 * @since
 * @author Vaadin Ltd
 */
public class StyleguideView extends VerticalLayout implements View {

    public StyleguideView() {
        Responsive.makeResponsive(this);
        addStyleName("styleguide-view");
        setMargin(true);
        setSpacing(true);

        Label h1 = new Label(getTitle());
        h1.addStyleName("h1");
        addComponent(h1);
    }

    @Override
    public void enter(ViewChangeEvent event) {

    }

    public String getFragment() {
        return getTitle().toLowerCase().replaceAll(" ", "-")
                .replaceAll("&", "and");
    };

    public String getTitle() {
        return this.getClass().getSimpleName();
    };

    public Resource getMenuIcon() {
        return null;
    }

}
