package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f95395d;

    public static final class a implements t1<g> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            g gVar = new g();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "region":
                        gVar.f95394c = k3Var.O2();
                        break;
                    case "city":
                        gVar.f95392a = k3Var.O2();
                        break;
                    case "country_code":
                        gVar.f95393b = k3Var.O2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            gVar.d(concurrentHashMap);
            k3Var.h0();
            return gVar;
        }
    }

    public void d(Map<String, Object> map) {
        this.f95395d = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95392a != null) {
            l3Var.f("city").h(this.f95392a);
        }
        if (this.f95393b != null) {
            l3Var.f("country_code").h(this.f95393b);
        }
        if (this.f95394c != null) {
            l3Var.f("region").h(this.f95394c);
        }
        Map<String, Object> map = this.f95395d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95395d.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }
}
