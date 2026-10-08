package io.sentry.protocol;

import io.sentry.b7;
import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Number f95417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f95419c;

    public static final class a implements t1<i> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            Number number = null;
            String strO2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("unit")) {
                    strO2 = k3Var.O2();
                } else if (strH1.equals("value")) {
                    number = (Number) k3Var.K3();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    k3Var.U2(v0Var, concurrentHashMap, strH1);
                }
            }
            k3Var.h0();
            if (number != null) {
                i iVar = new i(number, strO2);
                iVar.a(concurrentHashMap);
                return iVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            v0Var.b(b7.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public i(Number number, String str) {
        this.f95417a = number;
        this.f95418b = str;
    }

    public void a(Map<String, Object> map) {
        this.f95419c = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("value").k(this.f95417a);
        if (this.f95418b != null) {
            l3Var.f("unit").h(this.f95418b);
        }
        Map<String, Object> map = this.f95419c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95419c.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }
}
