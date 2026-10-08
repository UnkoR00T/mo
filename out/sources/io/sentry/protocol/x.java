package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f95503d;

    public static final class a implements t1<x> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            x xVar = new x();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "raw_description":
                        xVar.f95502c = k3Var.O2();
                        break;
                    case "name":
                        xVar.f95500a = k3Var.O2();
                        break;
                    case "version":
                        xVar.f95501b = k3Var.O2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            xVar.g(concurrentHashMap);
            k3Var.h0();
            return xVar;
        }
    }

    public x() {
    }

    public String d() {
        return this.f95500a;
    }

    public String e() {
        return this.f95501b;
    }

    public void f(String str) {
        this.f95500a = str;
    }

    public void g(Map<String, Object> map) {
        this.f95503d = map;
    }

    public void h(String str) {
        this.f95501b = str;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95500a != null) {
            l3Var.f("name").h(this.f95500a);
        }
        if (this.f95501b != null) {
            l3Var.f("version").h(this.f95501b);
        }
        if (this.f95502c != null) {
            l3Var.f("raw_description").h(this.f95502c);
        }
        Map<String, Object> map = this.f95503d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95503d.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    x(x xVar) {
        this.f95500a = xVar.f95500a;
        this.f95501b = xVar.f95501b;
        this.f95502c = xVar.f95502c;
        this.f95503d = io.sentry.util.c.c(xVar.f95503d);
    }
}
