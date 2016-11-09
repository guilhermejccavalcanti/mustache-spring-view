/*
 * Copyright 2014 the original author or authors.
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
package org.springframework.web.servlet.view.mustache.java;

import com.github.mustachejava.Mustache;
import org.springframework.web.servlet.view.mustache.MustacheTemplate;
import org.springframework.web.servlet.view.mustache.MustacheTemplateException;

import java.io.Writer;

public class MustacheJTemplate implements MustacheTemplate {

    private final Mustache template;

    public MustacheJTemplate(Mustache template) {
        this.template = template;
    }

    public void execute(Object context, Writer out) throws MustacheTemplateException {
        template.execute(out, context);
    }

    public void execute(Object context, Object parentContext, Writer out) throws MustacheTemplateException {
        Object[] scopes = {context, parentContext};
        template.execute(out, scopes);
    }
}
