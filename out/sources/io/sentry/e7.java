package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class e7 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f94875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f94876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f94877c;

    public static final class a implements t1<e7> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e7 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            String strO2 = null;
            Object objK3 = null;
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("type")) {
                    strO2 = k3Var.O2();
                } else if (strH1.equals("value")) {
                    objK3 = k3Var.K3();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            k3Var.h0();
            if (strO2 != null) {
                e7 e7Var = new e7(strO2, objK3);
                e7Var.a(map);
                return e7Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
            v0Var.b(b7.ERROR, "Missing required field \"type\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public e7(String str, Object obj) {
        this.f94875a = str;
        if (obj == null || !str.equals("string")) {
            this.f94876b = obj;
        } else {
            this.f94876b = obj.toString();
        }
    }

    public void a(Map<String, Object> map) {
        this.f94877c = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("type").l(v0Var, this.f94875a);
        l3Var.f("value").l(v0Var, this.f94876b);
        Map<String, Object> map = this.f94877c;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f94877c.get(str));
            }
        }
        l3Var.h0();
    }

    public e7(f5 f5Var, Object obj) {
        this(f5Var.apiName(), obj);
    }
}
