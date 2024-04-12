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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LombokDataTest {

    @Test
    void test1() {
        LombokData test = LombokData.builder()
                .test1("test1")
                .build();
        assertNotNull(test);
        assertEquals("test1", test.getTest1());
        assertTrue(test.toString().contains("test1"));


        LombokData test2 = LombokData.builder()
                .test2("test2")
                .build();

        assertNotEquals(test, test2);
    }

}