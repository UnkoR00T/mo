package io.sentry.instrumentation.file;

import io.sentry.c1;
import io.sentry.j1;
import io.sentry.q7;
import io.sentry.u8;
import io.sentry.util.d0;
import io.sentry.util.x;
import io.sentry.w7;
import io.sentry.z6;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j1 f95062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f95063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q7 f95064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u8 f95065d = u8.OK;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f95066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w7 f95067f;

    /* JADX INFO: renamed from: io.sentry.instrumentation.file.a$a, reason: collision with other inner class name */
    @FunctionalInterface
    interface InterfaceC2235a<T> {
        T call();
    }

    a(j1 j1Var, File file, q7 q7Var) {
        this.f95062a = j1Var;
        this.f95063b = file;
        this.f95064c = q7Var;
        this.f95067f = new w7(q7Var);
        z6.d().a("FileIO");
    }

    private void b() {
        if (this.f95062a != null) {
            String strA = d0.a(this.f95066e);
            File file = this.f95063b;
            if (file != null) {
                this.f95062a.h(c(file));
                if (this.f95064c.isSendDefaultPii()) {
                    this.f95062a.m("file.path", this.f95063b.getAbsolutePath());
                }
            } else {
                this.f95062a.h(strA);
            }
            this.f95062a.m("file.size", Long.valueOf(this.f95066e));
            boolean zA = this.f95064c.getThreadChecker().a();
            this.f95062a.m("blocked_main_thread", Boolean.valueOf(zA));
            if (zA) {
                this.f95062a.m("call_stack", this.f95067f.c());
            }
            this.f95062a.o(this.f95065d);
        }
    }

    private String c(File file) {
        String strA = d0.a(this.f95066e);
        if (this.f95064c.isSendDefaultPii()) {
            return file.getName() + " (" + strA + ")";
        }
        int iLastIndexOf = file.getName().lastIndexOf(46);
        if (iLastIndexOf <= 0 || iLastIndexOf >= file.getName().length() - 1) {
            return "*** (" + strA + ")";
        }
        return "***" + file.getName().substring(iLastIndexOf) + " (" + strA + ")";
    }

    static j1 e(c1 c1Var, String str) {
        j1 j1VarU = x.a() ? c1Var.u() : c1Var.a();
        if (j1VarU != null) {
            return j1VarU.j(str);
        }
        return null;
    }

    void a(Closeable closeable) {
        try {
            try {
                closeable.close();
                b();
            } catch (IOException e15) {
                this.f95065d = u8.INTERNAL_ERROR;
                if (this.f95062a != null) {
                    this.f95062a.n(e15);
                }
                throw e15;
            }
        } catch (Throwable th4) {
            b();
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> T d(InterfaceC2235a<T> interfaceC2235a) {
        try {
            T tCall = interfaceC2235a.call();
            if (tCall instanceof Integer) {
                int iIntValue = ((Integer) tCall).intValue();
                if (iIntValue != -1) {
                    this.f95066e += (long) iIntValue;
                    return tCall;
                }
            } else if (tCall instanceof Long) {
                long jLongValue = ((Long) tCall).longValue();
                if (jLongValue != -1) {
                    this.f95066e += jLongValue;
                }
            }
            return tCall;
        } catch (IOException e15) {
            this.f95065d = u8.INTERNAL_ERROR;
            j1 j1Var = this.f95062a;
            if (j1Var != null) {
                j1Var.n(e15);
            }
            throw e15;
        }
    }
}
