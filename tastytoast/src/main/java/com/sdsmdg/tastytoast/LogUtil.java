/*
 * Copyright (c) 2020 Huawei Device Co., Ltd.
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

package com.sdsmdg.tastytoast;

import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

public class LogUtil {
    private static final String LOG_TAG = "TastyToast";

    private static final int DOMAIN_ID = 0xD000F00;

    private static final HiLogLabel LOG_LABEL = new HiLogLabel(HiLog.LOG_APP, DOMAIN_ID, LogUtil.LOG_TAG);

    private static final String LOG_FORMAT = "%{public}s: %{public}s";

    private LogUtil() {
        /* Do nothing */
    }

    /**
     * Print debug log
     *
     * @param tag log tag
     * @param msg log message
     */
    public static void debug(String tag, String msg) {
        HiLog.debug(LOG_LABEL, LOG_FORMAT, tag, msg);
    }

    /**
     * Print info log
     *
     * @param tag log tag
     * @param msg log message
     */
    public static void info(String tag, String msg) {
        HiLog.info(LOG_LABEL, LOG_FORMAT, tag, msg);
    }

    /**
     * Print warn log
     *
     * @param tag log tag
     * @param msg log message
     */
    public static void warn(String tag, String msg) {
        HiLog.warn(LOG_LABEL, LOG_FORMAT, tag, msg);
    }

    /**
     * Print error log
     *
     * @param tag log tag
     * @param msg log message
     */
    public static void error(String tag, String msg) {
        HiLog.error(LOG_LABEL, LOG_FORMAT, tag, msg);
    }

}

