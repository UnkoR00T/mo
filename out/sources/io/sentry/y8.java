package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes4.dex */
public final class y8 implements v0 {
    private String e(Throwable th4) {
        StringWriter stringWriter = new StringWriter();
        th4.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.v0
    public void a(b7 b7Var, Throwable th4, String str, Object... objArr) {
        if (th4 == null) {
            c(b7Var, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", b7Var, String.format(str, objArr), th4.toString(), e(th4)));
        }
    }

    @Override // io.sentry.v0
    public void b(b7 b7Var, String str, Throwable th4) {
        if (th4 == null) {
            c(b7Var, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", b7Var, String.format(str, th4.toString()), e(th4)));
        }
    }

    @Override // io.sentry.v0
    public void c(b7 b7Var, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", b7Var, String.format(str, objArr)));
    }

    @Override // io.sentry.v0
    public boolean d(b7 b7Var) {
        return true;
    }
}
