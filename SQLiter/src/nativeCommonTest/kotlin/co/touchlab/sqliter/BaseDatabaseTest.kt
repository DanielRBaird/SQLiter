/*
 * Copyright (C) 2018 Touchlab, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package co.touchlab.sqliter

import co.touchlab.sqliter.NativeFileContext.deleteDatabase
import kotlin.test.AfterEach
import kotlin.test.BeforeEach

abstract class BaseDatabaseTest{
    @BeforeEach
    fun before(){
        deleteDatabase(TEST_DB_NAME)
    }

    @AfterEach
    fun after(){
        deleteDatabase(TEST_DB_NAME)
    }
}