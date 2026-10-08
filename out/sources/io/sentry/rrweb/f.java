package io.sentry.rrweb;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends d implements d2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f95633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<b> f95634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f95635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f95636g;

    public static final class a implements t1<f> {
        private void c(f fVar, k3 k3Var, v0 v0Var) {
            d.a aVar = new d.a();
            k3Var.Y();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("pointerId")) {
                    fVar.f95633d = k3Var.nextInt();
                } else if (strH1.equals("positions")) {
                    fVar.f95634e = k3Var.T3(v0Var, new b.a());
                } else if (!aVar.a(fVar, strH1, k3Var, v0Var)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            fVar.l(map);
            k3Var.h0();
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            f fVar = new f();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("data")) {
                    c(fVar, k3Var, v0Var);
                } else if (!aVar.a(fVar, strH1, k3Var, v0Var)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            fVar.o(map);
            k3Var.h0();
            return fVar;
        }
    }

    public static final class b implements d2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f95637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f95638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f95639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f95640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, Object> f95641e;

        public static final class a implements t1<b> {
            @Override // io.sentry.t1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(k3 k3Var, v0 v0Var) {
                k3Var.Y();
                b bVar = new b();
                HashMap map = null;
                while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strH1 = k3Var.h1();
                    strH1.getClass();
                    switch (strH1) {
                        case "x":
                            bVar.f95638b = k3Var.nextFloat();
                            break;
                        case "y":
                            bVar.f95639c = k3Var.nextFloat();
                            break;
                        case "id":
                            bVar.f95637a = k3Var.nextInt();
                            break;
                        case "timeOffset":
                            bVar.f95640d = k3Var.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            k3Var.U2(v0Var, map, strH1);
                            break;
                    }
                }
                bVar.h(map);
                k3Var.h0();
                return bVar;
            }
        }

        public long e() {
            return this.f95640d;
        }

        public void f(int i15) {
            this.f95637a = i15;
        }

        public void g(long j15) {
            this.f95640d = j15;
        }

        public void h(Map<String, Object> map) {
            this.f95641e = map;
        }

        public void i(float f15) {
            this.f95638b = f15;
        }

        public void j(float f15) {
            this.f95639c = f15;
        }

        @Override // io.sentry.d2
        public void serialize(l3 l3Var, v0 v0Var) {
            l3Var.Y();
            l3Var.f("id").b(this.f95637a);
            l3Var.f("x").c(this.f95638b);
            l3Var.f("y").c(this.f95639c);
            l3Var.f("timeOffset").b(this.f95640d);
            Map<String, Object> map = this.f95641e;
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = this.f95641e.get(str);
                    l3Var.f(str);
                    l3Var.l(v0Var, obj);
                }
            }
            l3Var.h0();
        }
    }

    public f() {
        super(d.b.TouchMove);
    }

    private void k(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        new d.c().a(this, l3Var, v0Var);
        List<b> list = this.f95634e;
        if (list != null && !list.isEmpty()) {
            l3Var.f("positions").l(v0Var, this.f95634e);
        }
        l3Var.f("pointerId").b(this.f95633d);
        Map<String, Object> map = this.f95636g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95636g.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public void l(Map<String, Object> map) {
        this.f95636g = map;
    }

    public void m(int i15) {
        this.f95633d = i15;
    }

    public void n(List<b> list) {
        this.f95634e = list;
    }

    public void o(Map<String, Object> map) {
        this.f95635f = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        new io.sentry.rrweb.b.C2242b().a(this, l3Var, v0Var);
        l3Var.f("data");
        k(l3Var, v0Var);
        Map<String, Object> map = this.f95635f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95635f.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }
}
