package io.sentry.clientreport;

import io.sentry.b7;
import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f94787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f94788d;

    public static final class a implements t1<g> {
        private Exception c(String str, v0 v0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            v0Var.b(b7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(k3 k3Var, v0 v0Var) throws Exception {
            k3Var.Y();
            String strO2 = null;
            String strO3 = null;
            Long lE2 = null;
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "quantity":
                        lE2 = k3Var.E2();
                        break;
                    case "reason":
                        strO2 = k3Var.O2();
                        break;
                    case "category":
                        strO3 = k3Var.O2();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        k3Var.U2(v0Var, map, strH1);
                        break;
                }
            }
            k3Var.h0();
            if (strO2 == null) {
                throw c("reason", v0Var);
            }
            if (strO3 == null) {
                throw c("category", v0Var);
            }
            if (lE2 == null) {
                throw c("quantity", v0Var);
            }
            g gVar = new g(strO2, strO3, lE2);
            gVar.d(map);
            return gVar;
        }
    }

    public g(String str, String str2, Long l15) {
        this.f94785a = str;
        this.f94786b = str2;
        this.f94787c = l15;
    }

    public String a() {
        return this.f94786b;
    }

    public Long b() {
        return this.f94787c;
    }

    public String c() {
        return this.f94785a;
    }

    public void d(Map<String, Object> map) {
        this.f94788d = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("reason").h(this.f94785a);
        l3Var.f("category").h(this.f94786b);
        l3Var.f("quantity").k(this.f94787c);
        Map<String, Object> map = this.f94788d;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f94788d.get(str));
            }
        }
        l3Var.h0();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f94785a + "', category='" + this.f94786b + "', quantity=" + this.f94787c + '}';
    }
}
