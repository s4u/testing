/*
 * Copyright 2024 Slawomir Jaranowski
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

import java.util.List;

import lombok.Getter;

/**
 * Next sonar testing.
 */
@Getter
public class MyException extends RuntimeException{

    private final Integer errorCode;
    private final int httpStatus;
    private final List<String> errors;

    /**
     * Default constructor.
     *
     * @param message a message
     * @param errorCode an errorCode
     * @param errors en errors
     * @param httpStatus a status
     */
    public MyException(String message, Integer errorCode, List<String> errors, int httpStatus) {
        super(message);
        this.errorCode = errorCode;
        this.errors = errors;
        this.httpStatus = httpStatus;
    }
}
