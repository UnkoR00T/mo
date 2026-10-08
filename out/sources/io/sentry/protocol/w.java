package io.sentry.protocol;

import io.sentry.b7;
import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f95499c;

    public static final class a implements t1<w> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            String strQ2 = null;
            String strQ3 = null;
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("name")) {
                    strQ2 = k3Var.q2();
                } else if (strH1.equals("version")) {
                    strQ3 = k3Var.q2();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            k3Var.h0();
            if (strQ2 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                v0Var.b(b7.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strQ3 != null) {
                w wVar = new w(strQ2, strQ3);
                wVar.c(map);
                return wVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            v0Var.b(b7.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public w(String str, String str2) {
        this.f95497a = (String) io.sentry.util.v.c(str, "name is required.");
        this.f95498b = (String) io.sentry.util.v.c(str2, "version is required.");
    }

    public String a() {
        return this.f95497a;
    }

    public String b() {
        return this.f95498b;
    }

    public void c(Map<String, Object> map) {
        this.f95499c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.f95497a, wVar.f95497a) && Objects.equals(this.f95498b, wVar.f95498b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f95497a, this.f95498b);
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("name").h(this.f95497a);
        l3Var.f("version").h(this.f95498b);
        Map<String, Object> map = this.f95499c;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95499c.get(str));
            }
        }
        l3Var.h0();
    }
}
