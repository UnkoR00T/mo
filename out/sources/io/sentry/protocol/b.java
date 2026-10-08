package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f95333c;

    public static final class a implements t1<b> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("name")) {
                    bVar.f95331a = k3Var.O2();
                } else if (strH1.equals("version")) {
                    bVar.f95332b = k3Var.O2();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    k3Var.U2(v0Var, concurrentHashMap, strH1);
                }
            }
            bVar.c(concurrentHashMap);
            k3Var.h0();
            return bVar;
        }
    }

    public b() {
    }

    public void c(Map<String, Object> map) {
        this.f95333c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (io.sentry.util.v.a(this.f95331a, bVar.f95331a) && io.sentry.util.v.a(this.f95332b, bVar.f95332b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f95331a, this.f95332b);
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95331a != null) {
            l3Var.f("name").h(this.f95331a);
        }
        if (this.f95332b != null) {
            l3Var.f("version").h(this.f95332b);
        }
        Map<String, Object> map = this.f95333c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95333c.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    b(b bVar) {
        this.f95331a = bVar.f95331a;
        this.f95332b = bVar.f95332b;
        this.f95333c = io.sentry.util.c.c(bVar.f95333c);
    }
}
