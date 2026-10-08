package io.sentry.android.ndk;

import io.sentry.a1;
import io.sentry.b7;
import io.sentry.i4;
import io.sentry.m;
import io.sentry.n8;
import io.sentry.ndk.NativeScope;
import io.sentry.q7;
import io.sentry.util.v;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f94242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.ndk.a f94243b;

    public f(q7 q7Var) {
        this(q7Var, new NativeScope());
    }

    public static /* synthetic */ void h(f fVar, io.sentry.f fVar2) {
        fVar.getClass();
        String strF = null;
        String lowerCase = fVar2.q() != null ? fVar2.q().name().toLowerCase(Locale.ROOT) : null;
        String strH = m.h(fVar2.s());
        try {
            Map<String, Object> mapP = fVar2.p();
            if (!mapP.isEmpty()) {
                strF = fVar.f94242a.getSerializer().f(mapP);
            }
        } catch (Throwable th4) {
            fVar.f94242a.getLogger().a(b7.ERROR, th4, "Breadcrumb data is not serializable.", new Object[0]);
        }
        fVar.f94243b.a(lowerCase, fVar2.r(), fVar2.o(), fVar2.t(), strH, strF);
    }

    @Override // io.sentry.i4, io.sentry.b1
    public void b(final String str) {
        try {
            this.f94242a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94235a.f94243b.b(str);
                }
            });
        } catch (Throwable th4) {
            this.f94242a.getLogger().a(b7.ERROR, th4, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.b1
    public void c(final io.sentry.f fVar) {
        try {
            this.f94242a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.b
                @Override // java.lang.Runnable
                public final void run() {
                    f.h(this.f94233a, fVar);
                }
            });
        } catch (Throwable th4) {
            this.f94242a.getLogger().a(b7.ERROR, th4, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.b1
    public void e(final n8 n8Var, a1 a1Var) {
        if (n8Var == null) {
            return;
        }
        try {
            this.f94242a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.e
                @Override // java.lang.Runnable
                public final void run() {
                    f fVar = this.f94240a;
                    n8 n8Var2 = n8Var;
                    fVar.f94243b.c(n8Var2.n().toString(), n8Var2.k().toString());
                }
            });
        } catch (Throwable th4) {
            this.f94242a.getLogger().a(b7.ERROR, th4, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    @Override // io.sentry.i4, io.sentry.b1
    public void p(final String str, final String str2) {
        try {
            this.f94242a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94237a.f94243b.p(str, str2);
                }
            });
        } catch (Throwable th4) {
            this.f94242a.getLogger().a(b7.ERROR, th4, "Scope sync setTag(%s) has an error.", str);
        }
    }

    f(q7 q7Var, io.sentry.ndk.a aVar) {
        this.f94242a = (q7) v.c(q7Var, "The SentryOptions object is required.");
        this.f94243b = (io.sentry.ndk.a) v.c(aVar, "The NativeScope object is required.");
    }
}
