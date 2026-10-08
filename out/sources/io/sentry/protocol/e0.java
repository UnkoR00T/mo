package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f95384b;

    public static final class a implements t1<e0> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e0 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            String strO2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("source")) {
                    strO2 = k3Var.O2();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    k3Var.U2(v0Var, concurrentHashMap, strH1);
                }
            }
            e0 e0Var = new e0(strO2);
            e0Var.a(concurrentHashMap);
            k3Var.h0();
            return e0Var;
        }
    }

    public e0(String str) {
        this.f95383a = str;
    }

    public void a(Map<String, Object> map) {
        this.f95384b = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95383a != null) {
            l3Var.f("source").l(v0Var, this.f95383a);
        }
        Map<String, Object> map = this.f95384b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95384b.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }
}
