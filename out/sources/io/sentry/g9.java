package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class g9 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.v f94996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f94997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f94998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f94999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f95000e;

    public static final class a implements t1<g9> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g9 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            io.sentry.protocol.v vVarA = null;
            String strO2 = null;
            String strO3 = null;
            String strO4 = null;
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "comments":
                        strO4 = k3Var.O2();
                        break;
                    case "name":
                        strO2 = k3Var.O2();
                        break;
                    case "email":
                        strO3 = k3Var.O2();
                        break;
                    case "event_id":
                        vVarA = new io.sentry.protocol.v.a().a(k3Var, v0Var);
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
            if (vVarA != null) {
                g9 g9Var = new g9(vVarA, strO2, strO3, strO4);
                g9Var.a(map);
                return g9Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            v0Var.b(b7.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public g9(io.sentry.protocol.v vVar, String str, String str2, String str3) {
        this.f94996a = vVar;
        this.f94997b = str;
        this.f94998c = str2;
        this.f94999d = str3;
    }

    public void a(Map<String, Object> map) {
        this.f95000e = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("event_id");
        this.f94996a.serialize(l3Var, v0Var);
        if (this.f94997b != null) {
            l3Var.f("name").h(this.f94997b);
        }
        if (this.f94998c != null) {
            l3Var.f("email").h(this.f94998c);
        }
        if (this.f94999d != null) {
            l3Var.f("comments").h(this.f94999d);
        }
        Map<String, Object> map = this.f95000e;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95000e.get(str));
            }
        }
        l3Var.h0();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f94996a + ", name='" + this.f94997b + "', email='" + this.f94998c + "', comments='" + this.f94999d + "'}";
    }
}
