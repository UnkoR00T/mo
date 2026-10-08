package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<i0> f95415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f95416c;

    public static final class a implements t1<h0> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h0 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            String strO2 = null;
            List listT3 = null;
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("rendering_system")) {
                    strO2 = k3Var.O2();
                } else if (strH1.equals("windows")) {
                    listT3 = k3Var.T3(v0Var, new i0.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            k3Var.h0();
            h0 h0Var = new h0(strO2, listT3);
            h0Var.a(map);
            return h0Var;
        }
    }

    public h0(String str, List<i0> list) {
        this.f95414a = str;
        this.f95415b = list;
    }

    public void a(Map<String, Object> map) {
        this.f95416c = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95414a != null) {
            l3Var.f("rendering_system").h(this.f95414a);
        }
        if (this.f95415b != null) {
            l3Var.f("windows").l(v0Var, this.f95415b);
        }
        Map<String, Object> map = this.f95416c;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95416c.get(str));
            }
        }
        l3Var.h0();
    }
}
