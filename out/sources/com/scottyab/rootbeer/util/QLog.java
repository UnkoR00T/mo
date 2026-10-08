package com.scottyab.rootbeer.util;

import io.sentry.android.core.c2;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes4.dex */
public final class QLog {
    public static final int ALL = 5;
    public static final int ERRORS_ONLY = 1;
    public static final int ERRORS_WARNINGS = 2;
    public static final int ERRORS_WARNINGS_INFO = 3;
    public static final int ERRORS_WARNINGS_INFO_DEBUG = 4;
    public static int LOGGING_LEVEL = 5;
    public static final int NONE = 0;
    private static final String TAG = "RootBeer";
    private static final String TAG_GENERAL_OUTPUT = "QLog";

    private QLog() {
    }

    public static void d(Object obj) {
        if (isDLoggable()) {
            getTrace();
            String.valueOf(obj);
        }
    }

    public static void e(Object obj, Throwable th4) {
        if (isELoggable()) {
            c2.e(TAG, getTrace() + String.valueOf(obj));
            c2.e(TAG, getThrowableTrace(th4));
            c2.e(TAG_GENERAL_OUTPUT, getTrace() + String.valueOf(obj));
            c2.e(TAG_GENERAL_OUTPUT, getThrowableTrace(th4));
        }
    }

    private static String getThrowableTrace(Throwable th4) {
        StringWriter stringWriter = new StringWriter();
        th4.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static String getTrace() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    public static void i(Object obj) {
        if (isILoggable()) {
            getTrace();
            String.valueOf(obj);
        }
    }

    public static boolean isDLoggable() {
        return LOGGING_LEVEL > 3;
    }

    public static boolean isELoggable() {
        return LOGGING_LEVEL > 0;
    }

    public static boolean isILoggable() {
        return LOGGING_LEVEL > 2;
    }

    public static boolean isVLoggable() {
        return LOGGING_LEVEL > 4;
    }

    public static boolean isWLoggable() {
        return LOGGING_LEVEL > 1;
    }

    public static void v(Object obj) {
        if (isVLoggable()) {
            getTrace();
            String.valueOf(obj);
        }
    }

    public static void w(Object obj, Throwable th4) {
        if (isWLoggable()) {
            c2.g(TAG, getTrace() + String.valueOf(obj));
            c2.g(TAG, getThrowableTrace(th4));
            c2.g(TAG_GENERAL_OUTPUT, getTrace() + String.valueOf(obj));
            c2.g(TAG_GENERAL_OUTPUT, getThrowableTrace(th4));
        }
    }

    public static void e(Object obj) {
        if (isELoggable()) {
            c2.e(TAG, getTrace() + String.valueOf(obj));
            c2.e(TAG_GENERAL_OUTPUT, getTrace() + String.valueOf(obj));
        }
    }

    public static void w(Object obj) {
        if (isWLoggable()) {
            c2.g(TAG, getTrace() + String.valueOf(obj));
            c2.g(TAG_GENERAL_OUTPUT, getTrace() + String.valueOf(obj));
        }
    }

    public static void e(Exception exc) {
        if (isELoggable()) {
            exc.printStackTrace();
        }
    }
}
