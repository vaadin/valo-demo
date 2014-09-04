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

import com.vaadin.server.FontIcon;
import com.vaadin.server.Resource;

/**
 * 
 * @since
 * @author Vaadin Ltd
 */
public enum SamplerIcon implements FontIcon {
    BUTTON(0xE02C), //
    LABEL(0XE03B); //

    private static final String fontFamily = "sampler";
    private int codepoint;

    SamplerIcon(int codepoint) {
        this.codepoint = codepoint;
    }

    /**
     * Unsupported: {@link FontIcon} does not have a MIME type and is not a
     * {@link Resource} that can be used in a context where a MIME type would be
     * needed.
     */
    @Override
    public String getMIMEType() {
        throw new UnsupportedOperationException(FontIcon.class.getSimpleName()
                + " should not be used where a MIME type is needed.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.vaadin.ui.FontIcon#getFontFamily()
     */
    @Override
    public String getFontFamily() {
        return fontFamily;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.vaadin.ui.FontIcon#getCodepoint()
     */
    @Override
    public int getCodepoint() {
        return codepoint;
    }

    @Override
    public String getHtml() {
        return "<span class=\"v-icon\" style=\"font-family: " + fontFamily
                + ";\">&#x" + Integer.toHexString(codepoint) + ";</span>";
    }

}
