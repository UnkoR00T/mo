package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<z> f95327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f95328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f95329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f95330d;

    public static final class a implements t1<a0> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0 a(k3 k3Var, v0 v0Var) {
            a0 a0Var = new a0();
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "frames":
                        a0Var.f95327a = k3Var.T3(v0Var, new z.a());
                        break;
                    case "registers":
                        a0Var.f95328b = io.sentry.util.c.c((Map) k3Var.K3());
                        break;
                    case "snapshot":
                        a0Var.f95329c = k3Var.u1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            a0Var.f(concurrentHashMap);
            k3Var.h0();
            return a0Var;
        }
    }

    public a0() {
    }

    public List<z> d() {
        return this.f95327a;
    }

    public void e(Boolean bool) {
        this.f95329c = bool;
    }

    public void f(Map<String, Object> map) {
        this.f95330d = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95327a != null) {
            l3Var.f("frames").l(v0Var, this.f95327a);
        }
        if (this.f95328b != null) {
            l3Var.f("registers").l(v0Var, this.f95328b);
        }
        if (this.f95329c != null) {
            l3Var.f("snapshot").m(this.f95329c);
        }
        Map<String, Object> map = this.f95330d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95330d.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public a0(List<z> list) {
        this.f95327a = list;
    }
}
