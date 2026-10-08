package org.bouncycastle.util.test;

import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class SimpleTestResult implements TestResult {
    private static final String SEPARATOR = Strings.lineSeparator();
    private Throwable exception;
    private String message;
    private boolean success;

    public SimpleTestResult(boolean z15, String str) {
        this.success = z15;
        this.message = str;
    }

    public static TestResult failed(Test test, String str) {
        return new SimpleTestResult(false, test.getName() + ": " + str);
    }

    public static String failedMessage(String str, String str2, String str3, String str4) {
        StringBuilder sb5 = new StringBuilder(str);
        sb5.append(" failing ");
        sb5.append(str2);
        String str5 = SEPARATOR;
        sb5.append(str5);
        sb5.append("    expected: ");
        sb5.append(str3);
        sb5.append(str5);
        sb5.append("    got     : ");
        sb5.append(str4);
        return sb5.toString();
    }

    public static TestResult successful(Test test, String str) {
        return new SimpleTestResult(true, test.getName() + ": " + str);
    }

    @Override // org.bouncycastle.util.test.TestResult
    public Throwable getException() {
        return this.exception;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public boolean isSuccessful() {
        return this.success;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public String toString() {
        return this.message;
    }

    public SimpleTestResult(boolean z15, String str, Throwable th4) {
        this.success = z15;
        this.message = str;
        this.exception = th4;
    }

    public static TestResult failed(Test test, String str, Object obj, Object obj2) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        String str2 = SEPARATOR;
        sb5.append(str2);
        sb5.append("Expected: ");
        sb5.append(obj);
        sb5.append(str2);
        sb5.append("Found   : ");
        sb5.append(obj2);
        return failed(test, sb5.toString());
    }

    public static TestResult failed(Test test, String str, Throwable th4) {
        return new SimpleTestResult(false, test.getName() + ": " + str, th4);
    }
}
