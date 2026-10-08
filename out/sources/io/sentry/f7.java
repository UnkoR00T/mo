package io.sentry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f7 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<d7> f94932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f94933b;

    public static final class a implements t1<f7> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f7 a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            List listT3 = null;
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("items")) {
                    listT3 = k3Var.T3(v0Var, new d7.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            k3Var.h0();
            if (listT3 != null) {
                f7 f7Var = new f7(listT3);
                f7Var.b(map);
                return f7Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"items\"");
            v0Var.b(b7.ERROR, "Missing required field \"items\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public f7(List<d7> list) {
        this.f94932a = list;
    }

    public List<d7> a() {
        return this.f94932a;
    }

    public void b(Map<String, Object> map) {
        this.f94933b = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("items").l(v0Var, this.f94932a);
        Map<String, Object> map = this.f94933b;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f94933b.get(str));
            }
        }
        l3Var.h0();
    }
}
