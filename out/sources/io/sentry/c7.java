package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class c7 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f94704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f94705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f94706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f94707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f94708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f94709f;

    public static final class a implements t1<c7> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c7 a(k3 k3Var, v0 v0Var) {
            c7 c7Var = new c7();
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "package_name":
                        c7Var.f94706c = k3Var.O2();
                        break;
                    case "thread_id":
                        c7Var.f94708e = k3Var.E2();
                        break;
                    case "address":
                        c7Var.f94705b = k3Var.O2();
                        break;
                    case "class_name":
                        c7Var.f94707d = k3Var.O2();
                        break;
                    case "type":
                        c7Var.f94704a = k3Var.nextInt();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            c7Var.m(concurrentHashMap);
            k3Var.h0();
            return c7Var;
        }
    }

    public c7() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c7.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.v.a(this.f94705b, ((c7) obj).f94705b);
    }

    public String f() {
        return this.f94705b;
    }

    public int g() {
        return this.f94704a;
    }

    public void h(String str) {
        this.f94705b = str;
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f94705b);
    }

    public void i(String str) {
        this.f94707d = str;
    }

    public void j(String str) {
        this.f94706c = str;
    }

    public void k(Long l15) {
        this.f94708e = l15;
    }

    public void l(int i15) {
        this.f94704a = i15;
    }

    public void m(Map<String, Object> map) {
        this.f94709f = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("type").b(this.f94704a);
        if (this.f94705b != null) {
            l3Var.f("address").h(this.f94705b);
        }
        if (this.f94706c != null) {
            l3Var.f("package_name").h(this.f94706c);
        }
        if (this.f94707d != null) {
            l3Var.f("class_name").h(this.f94707d);
        }
        if (this.f94708e != null) {
            l3Var.f("thread_id").k(this.f94708e);
        }
        Map<String, Object> map = this.f94709f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f94709f.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public c7(c7 c7Var) {
        this.f94704a = c7Var.f94704a;
        this.f94705b = c7Var.f94705b;
        this.f94706c = c7Var.f94706c;
        this.f94707d = c7Var.f94707d;
        this.f94708e = c7Var.f94708e;
        this.f94709f = io.sentry.util.c.c(c7Var.f94709f);
    }
}
