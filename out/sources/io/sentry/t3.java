package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class t3 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.v f95718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f95719b;

    public static final class a implements t1<t3> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t3 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            t3 t3Var = new t3();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("profiler_id")) {
                    io.sentry.protocol.v vVar = (io.sentry.protocol.v) k3Var.M1(v0Var, new io.sentry.protocol.v.a());
                    if (vVar != null) {
                        t3Var.f95718a = vVar;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    k3Var.U2(v0Var, concurrentHashMap, strH1);
                }
            }
            t3Var.b(concurrentHashMap);
            k3Var.h0();
            return t3Var;
        }
    }

    public t3() {
        this(io.sentry.protocol.v.f95495b);
    }

    public void b(Map<String, Object> map) {
        this.f95719b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t3) {
            return this.f95718a.equals(((t3) obj).f95718a);
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f95718a);
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("profiler_id").l(v0Var, this.f95718a);
        Map<String, Object> map = this.f95719b;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95719b.get(str));
            }
        }
        l3Var.h0();
    }

    public t3(io.sentry.protocol.v vVar) {
        this.f95718a = vVar;
    }

    public t3(t3 t3Var) {
        this.f95718a = t3Var.f95718a;
        Map<String, Object> mapC = io.sentry.util.c.c(t3Var.f95719b);
        if (mapC != null) {
            this.f95719b = mapC;
        }
    }
}
