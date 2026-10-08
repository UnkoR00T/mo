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
public final class k implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f95446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f95447d;

    public static final class a implements t1<k> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            k kVar = new k();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "params":
                        List list = (List) k3Var.K3();
                        if (list == null) {
                            break;
                        } else {
                            kVar.f95446c = list;
                            break;
                        }
                        break;
                    case "message":
                        kVar.f95445b = k3Var.O2();
                        break;
                    case "formatted":
                        kVar.f95444a = k3Var.O2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            kVar.g(concurrentHashMap);
            k3Var.h0();
            return kVar;
        }
    }

    public String d() {
        return this.f95444a;
    }

    public String e() {
        return this.f95445b;
    }

    public void f(String str) {
        this.f95444a = str;
    }

    public void g(Map<String, Object> map) {
        this.f95447d = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f95444a != null) {
            l3Var.f("formatted").h(this.f95444a);
        }
        if (this.f95445b != null) {
            l3Var.f("message").h(this.f95445b);
        }
        List<String> list = this.f95446c;
        if (list != null && !list.isEmpty()) {
            l3Var.f("params").l(v0Var, this.f95446c);
        }
        Map<String, Object> map = this.f95447d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95447d.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }
}
