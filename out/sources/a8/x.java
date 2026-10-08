package a8;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public interface x extends t7.a0 {

    public interface a {
        default void F(boolean z15) {
        }

        default void H(boolean z15) {
        }
    }

    public static final class b {
        public static final int S;
        public static boolean T;
        long A;
        long B;
        z1 C;
        long D;
        long E;
        int F;
        int G;
        int H;
        int I;
        boolean J;
        boolean K;
        w2 L;
        boolean M;
        boolean N;
        String O;
        boolean P;
        n3 Q;
        boolean R;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f4745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        w7.h f4746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f4747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        zj.w<d3> f4748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        zj.w<h8.c0.a> f4749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        zj.w<j8.x> f4750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        zj.w<a2> f4751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        zj.w<k8.d> f4752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        zj.g<w7.h, b8.a> f4753i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        c8.k f4754j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Looper f4755k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f4756l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        t7.b0 f4757m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        t7.b f4758n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f4759o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f4760p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f4761q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f4762r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f4763s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f4764t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f4765u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f4766v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f4767w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        f3 f4768x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        e3 f4769y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        long f4770z;

        static {
            S = w7.o0.C0() ? 30000 : 10000;
            T = true;
        }

        public b(final Context context) {
            this(context, new zj.w() { // from class: a8.y
                @Override // zj.w
                public final Object get() {
                    return x.b.a(context);
                }
            }, new zj.w() { // from class: a8.z
                @Override // zj.w
                public final Object get() {
                    return x.b.b(context);
                }
            });
        }

        public static /* synthetic */ d3 a(Context context) {
            return new j(context);
        }

        public static /* synthetic */ h8.c0.a b(Context context) {
            return new h8.q(context, new o8.m());
        }

        public static /* synthetic */ j8.x d(Context context) {
            return new j8.o(context);
        }

        public x e() {
            zj.p.w(!this.M);
            this.M = true;
            return new c1(this, null);
        }

        private b(final Context context, zj.w<d3> wVar, zj.w<h8.c0.a> wVar2) {
            this(context, wVar, wVar2, new zj.w() { // from class: a8.a0
                @Override // zj.w
                public final Object get() {
                    return x.b.d(context);
                }
            }, new zj.w() { // from class: a8.b0
                @Override // zj.w
                public final Object get() {
                    return new h();
                }
            }, new zj.w() { // from class: a8.c0
                @Override // zj.w
                public final Object get() {
                    return k8.h.l(context);
                }
            }, new zj.g() { // from class: a8.d0
                @Override // zj.g
                public final Object apply(Object obj) {
                    return new b8.m1((w7.h) obj);
                }
            });
        }

        private b(Context context, zj.w<d3> wVar, zj.w<h8.c0.a> wVar2, zj.w<j8.x> wVar3, zj.w<a2> wVar4, zj.w<k8.d> wVar5, zj.g<w7.h, b8.a> gVar) {
            this.f4745a = (Context) zj.p.q(context);
            this.f4748d = wVar;
            this.f4749e = wVar2;
            this.f4750f = wVar3;
            this.f4751g = wVar4;
            this.f4752h = wVar5;
            this.f4753i = gVar;
            this.f4755k = w7.o0.T();
            this.f4758n = t7.b.f188093i;
            this.f4760p = 0;
            this.f4765u = 1;
            this.f4766v = 0;
            this.f4767w = true;
            this.f4768x = f3.f4413g;
            this.f4770z = 5000L;
            this.A = 15000L;
            this.B = 3000L;
            this.f4769y = e3.f4381j;
            this.C = new g.b().a();
            this.f4746b = w7.h.f210683a;
            this.D = 500L;
            this.E = 2000L;
            this.F = 600000;
            boolean z15 = T;
            this.G = z15 ? S : Integer.MAX_VALUE;
            this.H = z15 ? 60000 : Integer.MAX_VALUE;
            this.I = 600000;
            this.K = true;
            this.O = "";
            this.f4756l = -1000;
            this.Q = new k();
            this.R = true;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f4771b = new c(-9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4772a;

        public c(long j15) {
            this.f4772a = j15;
        }
    }

    void b();
}
