package io.sentry.rrweb;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends d implements d2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f95625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f95626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f95627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f95628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95629h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f95631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f95632l;

    public static final class a implements t1<e> {
        private void c(e eVar, k3 k3Var, v0 v0Var) {
            d.a aVar = new d.a();
            k3Var.Y();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "x":
                        eVar.f95627f = k3Var.nextFloat();
                        break;
                    case "y":
                        eVar.f95628g = k3Var.nextFloat();
                        break;
                    case "id":
                        eVar.f95626e = k3Var.nextInt();
                        break;
                    case "type":
                        eVar.f95625d = (b) k3Var.M1(v0Var, new b.a());
                        break;
                    case "pointerType":
                        eVar.f95629h = k3Var.nextInt();
                        break;
                    case "pointerId":
                        eVar.f95630j = k3Var.nextInt();
                        break;
                    default:
                        if (!aVar.a(eVar, strH1, k3Var, v0Var)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            k3Var.U2(v0Var, map, strH1);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            eVar.p(map);
            k3Var.h0();
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            e eVar = new e();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("data")) {
                    c(eVar, k3Var, v0Var);
                } else if (!aVar.a(eVar, strH1, k3Var, v0Var)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            eVar.t(map);
            k3Var.h0();
            return eVar;
        }
    }

    public enum b implements d2 {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        public static final class a implements t1<b> {
            @Override // io.sentry.t1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(k3 k3Var, v0 v0Var) {
                return b.values()[k3Var.nextInt()];
            }
        }

        @Override // io.sentry.d2
        public void serialize(l3 l3Var, v0 v0Var) {
            l3Var.b(ordinal());
        }
    }

    public e() {
        super(d.b.MouseInteraction);
        this.f95629h = 2;
    }

    private void o(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        new d.c().a(this, l3Var, v0Var);
        l3Var.f("type").l(v0Var, this.f95625d);
        l3Var.f("id").b(this.f95626e);
        l3Var.f("x").c(this.f95627f);
        l3Var.f("y").c(this.f95628g);
        l3Var.f("pointerType").b(this.f95629h);
        l3Var.f("pointerId").b(this.f95630j);
        Map<String, Object> map = this.f95632l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95632l.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public void p(Map<String, Object> map) {
        this.f95632l = map;
    }

    public void q(int i15) {
        this.f95626e = i15;
    }

    public void r(b bVar) {
        this.f95625d = bVar;
    }

    public void s(int i15) {
        this.f95630j = i15;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        new io.sentry.rrweb.b.C2242b().a(this, l3Var, v0Var);
        l3Var.f("data");
        o(l3Var, v0Var);
        Map<String, Object> map = this.f95631k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95631k.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public void t(Map<String, Object> map) {
        this.f95631k = map;
    }

    public void u(float f15) {
        this.f95627f = f15;
    }

    public void v(float f15) {
        this.f95628g = f15;
    }
}
