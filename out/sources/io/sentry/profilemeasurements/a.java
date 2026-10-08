package io.sentry.profilemeasurements;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.util.v;
import io.sentry.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f95306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection<b> f95308c;

    /* JADX INFO: renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    public static final class C2239a implements t1<a> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("values")) {
                    List listT3 = k3Var.T3(v0Var, new b.a());
                    if (listT3 != null) {
                        aVar.f95308c = listT3;
                    }
                } else if (strH1.equals("unit")) {
                    String strO2 = k3Var.O2();
                    if (strO2 != null) {
                        aVar.f95307b = strO2;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    k3Var.U2(v0Var, concurrentHashMap, strH1);
                }
            }
            aVar.c(concurrentHashMap);
            k3Var.h0();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public void c(Map<String, Object> map) {
        this.f95306a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (v.a(this.f95306a, aVar.f95306a) && this.f95307b.equals(aVar.f95307b) && new ArrayList(this.f95308c).equals(new ArrayList(aVar.f95308c))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v.b(this.f95306a, this.f95307b, this.f95308c);
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("unit").l(v0Var, this.f95307b);
        l3Var.f("values").l(v0Var, this.f95308c);
        Map<String, Object> map = this.f95306a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95306a.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public a(String str, Collection<b> collection) {
        this.f95307b = str;
        this.f95308c = collection;
    }
}
