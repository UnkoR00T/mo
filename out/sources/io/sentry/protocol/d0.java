package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f95358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f95359b;

    public static final class a implements t1<d0> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d0 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            d0 d0Var = new d0();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("active_profiles")) {
                    List list = (List) k3Var.K3();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        d0Var.f95358a = strArr;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    k3Var.U2(v0Var, concurrentHashMap, strH1);
                }
            }
            d0Var.b(concurrentHashMap);
            k3Var.h0();
            return d0Var;
        }
    }

    public d0() {
    }

    public void b(Map<String, Object> map) {
        this.f95359b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f95358a, ((d0) obj).f95358a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f95358a);
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95358a != null) {
            l3Var.f("active_profiles").l(v0Var, this.f95358a);
        }
        Map<String, Object> map = this.f95359b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95359b.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public d0(d0 d0Var) {
        this.f95358a = d0Var.f95358a;
        this.f95359b = io.sentry.util.c.c(d0Var.f95359b);
    }
}
