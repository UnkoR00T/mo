package io.sentry.cache;

import io.sentry.q7;
import io.sentry.t1;
import io.sentry.w0;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f94727a;

    public h(q7 q7Var) {
        this.f94727a = q7Var;
    }

    private void h(String str) {
        d.a(this.f94727a, ".options-cache", str);
    }

    public static <T> T i(q7 q7Var, String str, Class<T> cls) {
        return (T) j(q7Var, str, cls, null);
    }

    public static <T, R> T j(q7 q7Var, String str, Class<T> cls, t1<R> t1Var) {
        return (T) d.c(q7Var, ".options-cache", str, cls, t1Var);
    }

    private <T> void k(T t15, String str) {
        d.d(this.f94727a, t15, ".options-cache", str);
    }

    @Override // io.sentry.w0
    public void a(Map<String, String> map) {
        k(map, "tags.json");
    }

    @Override // io.sentry.w0
    public void b(String str) {
        if (str == null) {
            h("dist.json");
        } else {
            k(str, "dist.json");
        }
    }

    @Override // io.sentry.w0
    public void c(Double d15) {
        if (d15 == null) {
            h("replay-error-sample-rate.json");
        } else {
            k(d15.toString(), "replay-error-sample-rate.json");
        }
    }

    @Override // io.sentry.w0
    public void d(String str) {
        if (str == null) {
            h("environment.json");
        } else {
            k(str, "environment.json");
        }
    }

    @Override // io.sentry.w0
    public void e(String str) {
        if (str == null) {
            h("proguard-uuid.json");
        } else {
            k(str, "proguard-uuid.json");
        }
    }

    @Override // io.sentry.w0
    public void f(io.sentry.protocol.p pVar) {
        if (pVar == null) {
            h("sdk-version.json");
        } else {
            k(pVar, "sdk-version.json");
        }
    }

    @Override // io.sentry.w0
    public void g(String str) {
        if (str == null) {
            h("release.json");
        } else {
            k(str, "release.json");
        }
    }
}
