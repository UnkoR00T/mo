package vr;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1 f208094a = new w1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<x1, Integer> f208095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f208096c;

    public static final class a extends x1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f208097c = new a();

        private a() {
            super("inherited", false);
        }
    }

    public static final class b extends x1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f208098c = new b();

        private b() {
            super("internal", false);
        }
    }

    public static final class c extends x1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f208099c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    public static final class d extends x1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f208100c = new d();

        private d() {
            super("local", false);
        }
    }

    public static final class e extends x1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f208101c = new e();

        private e() {
            super("private", false);
        }
    }

    public static final class f extends x1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f208102c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // vr.x1
        public String b() {
            return "private/*private to this*/";
        }
    }

    public static final class g extends x1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f208103c = new g();

        private g() {
            super("protected", true);
        }
    }

    public static final class h extends x1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f208104c = new h();

        private h() {
            super("public", true);
        }
    }

    public static final class i extends x1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f208105c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map mapC = pq.v0.c();
        mapC.put(f.f208102c, 0);
        mapC.put(e.f208101c, 0);
        mapC.put(b.f208098c, 1);
        mapC.put(g.f208103c, 1);
        h hVar = h.f208104c;
        mapC.put(hVar, 2);
        f208095b = pq.v0.b(mapC);
        f208096c = hVar;
    }

    private w1() {
    }

    public final Integer a(x1 x1Var, x1 x1Var2) {
        if (x1Var == x1Var2) {
            return 0;
        }
        Map<x1, Integer> map = f208095b;
        Integer num = map.get(x1Var);
        Integer num2 = map.get(x1Var2);
        if (num == null || num2 == null || fr.t.c(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(x1 x1Var) {
        return x1Var == e.f208101c || x1Var == f.f208102c;
    }
}
