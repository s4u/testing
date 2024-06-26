/*
 * Copyright 2021 Slawomir Jaranowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.simplify4u.test;

import java.util.logging.Logger;

/**
 * Test app
 */
public class TestApp {

    private static final Logger LOGGER = Logger.getAnonymousLogger();

    @SuppressWarnings("squid:S1176")
    public static void main(String[] args) {
        new TestApp().run();
    }

    void run() {
        LOGGER.info("Test App is running");
    }
}
