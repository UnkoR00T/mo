package io.sentry.android.core.performance;

import android.os.Looper;
import android.os.SystemClock;
import io.sentry.android.core.w;
import io.sentry.j1;
import io.sentry.n5;
import io.sentry.q1;
import io.sentry.u8;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n5 f94091b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n5 f94092c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j1 f94093d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j1 f94094e = null;

    public b(String str) {
        this.f94090a = str;
    }

    private j1 d(j1 j1Var, String str, n5 n5Var) {
        j1 j1VarQ = j1Var.q("activity.load", str, n5Var, q1.SENTRY);
        f(j1VarQ);
        return j1VarQ;
    }

    private void f(j1 j1Var) {
        j1Var.m("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        j1Var.m("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        j1Var.m("ui.contributes_to_ttid", bool);
        j1Var.m("ui.contributes_to_ttfd", bool);
    }

    public void a() {
        j1 j1Var = this.f94093d;
        if (j1Var != null && !j1Var.d()) {
            this.f94093d.o(u8.CANCELLED);
        }
        this.f94093d = null;
        j1 j1Var2 = this.f94094e;
        if (j1Var2 != null && !j1Var2.d()) {
            this.f94094e.o(u8.CANCELLED);
        }
        this.f94094e = null;
    }

    public void b(j1 j1Var) {
        if (this.f94091b == null || j1Var == null) {
            return;
        }
        j1 j1VarD = d(j1Var, this.f94090a + ".onCreate", this.f94091b);
        this.f94093d = j1VarD;
        j1VarD.g();
    }

    public void c(j1 j1Var) {
        if (this.f94092c == null || j1Var == null) {
            return;
        }
        j1 j1VarD = d(j1Var, this.f94090a + ".onStart", this.f94092c);
        this.f94094e = j1VarD;
        j1VarD.g();
    }

    public void e() {
        j1 j1Var = this.f94093d;
        if (j1Var == null || this.f94094e == null) {
            return;
        }
        n5 n5VarX = j1Var.x();
        n5 n5VarX2 = this.f94094e.x();
        if (n5VarX == null || n5VarX2 == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        n5 n5VarA = w.a();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long millis = timeUnit.toMillis(n5VarA.e(this.f94093d.A()));
        long millis2 = timeUnit.toMillis(n5VarA.e(n5VarX));
        long millis3 = timeUnit.toMillis(n5VarA.e(this.f94094e.A()));
        long millis4 = timeUnit.toMillis(n5VarA.e(n5VarX2));
        c cVar = new c();
        cVar.e().A(this.f94093d.getDescription(), timeUnit.toMillis(this.f94093d.A().l()), jUptimeMillis - millis, jUptimeMillis - millis2);
        cVar.g().A(this.f94094e.getDescription(), timeUnit.toMillis(this.f94094e.A().l()), jUptimeMillis - millis3, jUptimeMillis - millis4);
        h.p().e(cVar);
    }

    public void g(n5 n5Var) {
        this.f94091b = n5Var;
    }

    public void h(n5 n5Var) {
        this.f94092c = n5Var;
    }
}
