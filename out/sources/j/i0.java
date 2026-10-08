package j;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import h.g1;
import h.r1;
import i.Camera2CameraController;
import i.c2;
import i.c4;
import i.e3;
import i.f2;
import i.f3;
import i.h2;
import i.j1;
import i.q3;
import i.s1;
import i.w1;
import i.w2;
import i.x3;
import i.y1;
import i.y2;
import java.util.List;
import ju.d2;
import l.GraphProcessor;
import l.StreamGraph;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q f98328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private z0 f98329b;

        public p a() {
            mq.d.a(this.f98328a, q.class);
            mq.d.a(this.f98329b, z0.class);
            return new g(this.f98328a, this.f98329b);
        }

        public b b(q qVar) {
            this.f98328a = (q) mq.d.b(qVar);
            return this;
        }

        public b c(z0 z0Var) {
            this.f98329b = (z0) mq.d.b(z0Var);
            return this;
        }

        private b() {
        }
    }

    private static final class c implements j.a.InterfaceC2306a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f98330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private j.b f98331b;

        @Override // j.a.InterfaceC2306a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(j.b bVar) {
            this.f98331b = (j.b) mq.d.b(bVar);
            return this;
        }

        @Override // j.a.InterfaceC2306a
        public j.a build() {
            mq.d.a(this.f98331b, j.b.class);
            return new d(this.f98330a, this.f98331b);
        }

        private c(g gVar) {
            this.f98330a = gVar;
        }
    }

    private static final class d implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j.b f98332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f98333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f98334c = this;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        mq.e<ju.p0> f98335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        mq.e<m.h> f98336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        mq.e<i.p> f98337f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        mq.e<i.o> f98338g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        mq.e<i.q> f98339h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        mq.e<i.s> f98340i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        mq.e<i.k> f98341j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        mq.e<y2> f98342k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        mq.e<Camera2CameraController> f98343l;

        private static final class a<T> implements mq.e<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final g f98344a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final d f98345b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f98346c;

            a(g gVar, d dVar, int i15) {
                this.f98344a = gVar;
                this.f98345b = dVar;
                this.f98346c = i15;
            }

            @Override // nq.a
            public T get() {
                switch (this.f98346c) {
                    case 0:
                        return (T) new Camera2CameraController(this.f98345b.f98335d.get(), this.f98344a.f98378f.get(), this.f98344a.f98387o.get(), j.c.a(this.f98345b.f98332a), j.e.a(this.f98345b.f98332a), h.a(this.f98345b.f98332a), this.f98345b.f98336e.get(), this.f98345b.f98342k.get(), this.f98345b.d(), this.f98344a.f98393u.get(), this.f98344a.f98398z.get(), this.f98344a.f98388p.get(), this.f98344a.f98385m.get(), j.d.a(this.f98345b.f98332a), j.f.a(this.f98345b.f98332a), j.g.a(this.f98345b.f98332a), this.f98344a.A.get());
                    case 1:
                        return (T) k.a(this.f98344a.f98378f.get(), this.f98344a.f98376d.get());
                    case 2:
                        g gVar = this.f98344a;
                        return (T) j.a(gVar.f98379g, gVar.f98378f.get(), j.c.a(this.f98345b.f98332a), this.f98344a.f98376d.get());
                    case 3:
                        d dVar = this.f98345b;
                        return (T) s1.a(dVar.f98337f, dVar.f98338g, dVar.f98339h, dVar.f98340i, dVar.f98341j, j.c.a(dVar.f98332a));
                    case 4:
                        return (T) new i.p(this.f98344a.f98378f.get(), j.g.a(this.f98345b.f98332a), j.c.a(this.f98345b.f98332a));
                    case 5:
                        return (T) new i.o(j.g.a(this.f98345b.f98332a), this.f98344a.f98378f.get());
                    case 6:
                        return (T) new i.q(this.f98344a.f98378f.get(), j.g.a(this.f98345b.f98332a), j.c.a(this.f98345b.f98332a));
                    case 7:
                        return (T) new i.s(this.f98344a.f98378f.get(), j.c.a(this.f98345b.f98332a), j.g.a(this.f98345b.f98332a));
                    case 8:
                        return (T) new i.k(this.f98344a.f98378f.get(), j.c.a(this.f98345b.f98332a), j.g.a(this.f98345b.f98332a), this.f98344a.f98386n.get(), this.f98344a.f98387o.get());
                    default:
                        throw new AssertionError(this.f98346c);
                }
            }
        }

        d(g gVar, j.b bVar) {
            this.f98333b = gVar;
            this.f98332a = bVar;
            c(bVar);
        }

        private void c(j.b bVar) {
            this.f98335d = mq.b.c(new a(this.f98333b, this.f98334c, 1));
            this.f98336e = mq.b.c(new a(this.f98333b, this.f98334c, 2));
            this.f98337f = new a(this.f98333b, this.f98334c, 4);
            this.f98338g = new a(this.f98333b, this.f98334c, 5);
            this.f98339h = new a(this.f98333b, this.f98334c, 6);
            this.f98340i = new a(this.f98333b, this.f98334c, 7);
            this.f98341j = new a(this.f98333b, this.f98334c, 8);
            this.f98342k = mq.b.c(new a(this.f98333b, this.f98334c, 3));
            this.f98343l = mq.b.c(new a(this.f98333b, this.f98334c, 0));
        }

        @Override // j.a
        public h.n a() {
            return this.f98343l.get();
        }

        c4 d() {
            return new c4(this.f98333b.f98378f.get(), j.c.a(this.f98332a), j.g.a(this.f98332a), this.f98333b.f98388p.get(), this.f98333b.f98387o.get());
        }
    }

    private static final class e implements l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f98347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m f98348b;

        @Override // j.l.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(m mVar) {
            this.f98348b = (m) mq.d.b(mVar);
            return this;
        }

        @Override // j.l.a
        public l build() {
            mq.d.a(this.f98348b, m.class);
            return new f(this.f98347a, this.f98348b);
        }

        private e(g gVar) {
            this.f98347a = gVar;
        }
    }

    private static final class f implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f98349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f98350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f f98351c = this;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        mq.e<h.e> f98352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        mq.e<h.x> f98353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        mq.e<l.q> f98354f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        mq.e<GraphProcessor> f98355g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        mq.e<StreamGraph> f98356h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        mq.e<h.n> f98357i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        mq.e<l.y> f98358j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        mq.e<m.i> f98359k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        mq.e<k.v> f98360l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        mq.e<m.l> f98361m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        mq.e<List<g1.a>> f98362n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        mq.e<m.p> f98363o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        mq.e<ju.p0> f98364p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        mq.e<m.e> f98365q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        mq.e<m.f> f98366r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        mq.e<l.o> f98367s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        mq.e<l.f> f98368t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        mq.e<l.a> f98369u;

        private static final class a<T> implements mq.e<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final g f98370a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final f f98371b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f98372c;

            a(g gVar, f fVar, int i15) {
                this.f98370a = gVar;
                this.f98371b = fVar;
                this.f98372c = i15;
            }

            @Override // nq.a
            public T get() {
                switch (this.f98372c) {
                    case 0:
                        return (T) new l.a(n.a(this.f98371b.f98349a), this.f98371b.f98353e.get(), this.f98371b.f98355g.get(), this.f98371b.f98355g.get(), this.f98371b.f98356h.get(), this.f98371b.f98358j.get(), this.f98371b.f98357i.get(), this.f98371b.f98361m.get(), this.f98371b.f98359k.get(), this.f98370a.f98390r.get(), o.a(this.f98371b.f98349a), this.f98371b.f98365q.get(), this.f98371b.f98366r.get(), this.f98371b.f98363o.get(), this.f98371b.f98364p.get(), this.f98371b.f98368t.get());
                    case 1:
                        return (T) m0.a(n.a(this.f98371b.f98349a), this.f98371b.f98352d.get());
                    case 2:
                        return (T) k0.a(this.f98370a.f98395w.get(), n.a(this.f98371b.f98349a), this.f98370a.f98397y.get());
                    case 3:
                        return (T) new GraphProcessor(this.f98370a.f98378f.get(), o.a(this.f98371b.f98349a), n.a(this.f98371b.f98349a), this.f98371b.f98354f.get(), this.f98371b.f98362n.get(), this.f98370a.f98388p.get());
                    case 4:
                        return (T) new l.q();
                    case 5:
                        return (T) q0.a(n.a(this.f98371b.f98349a), this.f98371b.f98354f.get(), this.f98371b.f98361m.get());
                    case 6:
                        return (T) p0.a(this.f98371b.f98356h.get(), this.f98371b.f98359k.get(), this.f98371b.f98353e.get(), this.f98371b.f98360l.get());
                    case 7:
                        return (T) new StreamGraph(this.f98371b.f98353e.get(), n.a(this.f98371b.f98349a), this.f98370a.p(), this.f98371b.f98357i);
                    case 8:
                        return (T) l0.a(o.a(this.f98371b.f98349a), n.a(this.f98371b.f98349a), this.f98371b.f98352d.get(), this.f98370a.f98397y.get(), this.f98371b.f98355g.get(), this.f98371b.f98356h.get(), this.f98371b.f98358j.get());
                    case 9:
                        return (T) r0.a(this.f98371b.f98356h.get(), this.f98371b.f98357i, this.f98370a.f98398z.get());
                    case 10:
                        return (T) new m.i();
                    case 11:
                        return (T) s0.a();
                    case 12:
                        return (T) new m.e(this.f98371b.f98363o.get(), this.f98371b.f98355g.get(), this.f98371b.f98364p.get());
                    case 13:
                        return (T) new m.p();
                    case 14:
                        return (T) o0.a(this.f98370a.f98378f.get(), this.f98370a.f98376d.get());
                    case 15:
                        return (T) new m.f(this.f98371b.f98363o.get(), this.f98371b.f98355g.get(), this.f98371b.f98364p.get());
                    case 16:
                        return (T) new l.f(this.f98371b.f98355g.get(), this.f98371b.f98353e.get(), this.f98371b.f98367s.get(), this.f98371b.f98354f.get());
                    case 17:
                        return (T) new l.o();
                    default:
                        throw new AssertionError(this.f98372c);
                }
            }
        }

        f(g gVar, m mVar) {
            this.f98350b = gVar;
            this.f98349a = mVar;
            c(mVar);
        }

        private void c(m mVar) {
            this.f98352d = mq.b.c(new a(this.f98350b, this.f98351c, 2));
            this.f98353e = mq.b.c(new a(this.f98350b, this.f98351c, 1));
            this.f98354f = mq.b.c(new a(this.f98350b, this.f98351c, 4));
            this.f98355g = new mq.a();
            this.f98356h = new mq.a();
            this.f98357i = new mq.a();
            this.f98358j = mq.b.c(new a(this.f98350b, this.f98351c, 9));
            mq.a.a(this.f98357i, mq.b.c(new a(this.f98350b, this.f98351c, 8)));
            mq.a.a(this.f98356h, mq.b.c(new a(this.f98350b, this.f98351c, 7)));
            this.f98359k = mq.b.c(new a(this.f98350b, this.f98351c, 10));
            this.f98360l = mq.b.c(new a(this.f98350b, this.f98351c, 11));
            this.f98361m = mq.b.c(new a(this.f98350b, this.f98351c, 6));
            this.f98362n = mq.b.c(new a(this.f98350b, this.f98351c, 5));
            mq.a.a(this.f98355g, mq.b.c(new a(this.f98350b, this.f98351c, 3)));
            this.f98363o = mq.b.c(new a(this.f98350b, this.f98351c, 13));
            this.f98364p = mq.b.c(new a(this.f98350b, this.f98351c, 14));
            this.f98365q = mq.b.c(new a(this.f98350b, this.f98351c, 12));
            this.f98366r = mq.b.c(new a(this.f98350b, this.f98351c, 15));
            this.f98367s = mq.b.c(new a(this.f98350b, this.f98351c, 17));
            this.f98368t = mq.b.c(new a(this.f98350b, this.f98351c, 16));
            this.f98369u = mq.b.c(new a(this.f98350b, this.f98351c, 0));
        }

        @Override // j.l
        public h.s a() {
            return this.f98369u.get();
        }
    }

    private static final class g implements p {
        mq.e<e3> A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f98373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z0 f98374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f98375c = this;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        mq.e<d2> f98376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        mq.e<m.g> f98377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        mq.e<k.z> f98378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        mq.e<CameraManager> f98379g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        mq.e<PackageManager> f98380h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        mq.e<c2> f98381i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        mq.e<l0.e> f98382j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        mq.e<w1> f98383k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        mq.e<k.n> f98384l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        mq.e<k.w> f98385m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        mq.e<f2> f98386n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        mq.e<r1> f98387o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        mq.e<h2> f98388p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        mq.e<f3> f98389q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        mq.e<i.p0> f98390r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        mq.e<x3> f98391s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        mq.e<y1> f98392t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        mq.e<q3> f98393u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        mq.e<i.s0> f98394v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        mq.e<h.h> f98395w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        mq.e<m.c> f98396x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        mq.e<h.m> f98397y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        mq.e<h.e0> f98398z;

        private static final class a<T> implements mq.e<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final g f98399a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f98400b;

            a(g gVar, int i15) {
                this.f98399a = gVar;
                this.f98400b = i15;
            }

            @Override // nq.a
            public T get() {
                switch (this.f98400b) {
                    case 0:
                        return (T) new m.g(this.f98399a.f98376d.get());
                    case 1:
                        return (T) c0.a();
                    case 2:
                        return (T) new m.c(this.f98399a.f98395w.get());
                    case 3:
                        h.z.Config configA = s.a(this.f98399a.f98373a);
                        g gVar = this.f98399a;
                        return (T) x.a(configA, gVar.f98394v, gVar.m(), this.f98399a.f98378f.get(), this.f98399a.f98377e.get());
                    case 4:
                        return (T) new i.s0(this.f98399a.f98378f.get(), this.f98399a.f98383k.get(), this.f98399a.f98386n.get(), this.f98399a.f98393u.get(), new c(this.f98399a), this.f98399a.m());
                    case 5:
                        return (T) a1.a(this.f98399a.f98374b, this.f98399a.f98377e.get(), this.f98399a.f98376d.get());
                    case 6:
                        g gVar2 = this.f98399a;
                        mq.e<CameraManager> eVar = gVar2.f98379g;
                        k.z zVar = gVar2.f98378f.get();
                        Context contextM = this.f98399a.m();
                        PackageManager packageManager = this.f98399a.f98380h.get();
                        c2 c2Var = this.f98399a.f98381i.get();
                        g gVar3 = this.f98399a;
                        return (T) new w1(eVar, zVar, contextM, packageManager, c2Var, gVar3.f98382j, gVar3.f98377e.get(), this.f98399a.f98376d.get());
                    case 7:
                        return (T) a0.a(this.f98399a.m());
                    case 8:
                        return (T) g0.a(this.f98399a.m());
                    case 9:
                        return (T) new c2();
                    case 10:
                        return (T) z.a(this.f98399a.m());
                    case 11:
                        return (T) new f2(this.f98399a.m(), this.f98399a.f98378f.get(), this.f98399a.f98384l.get(), this.f98399a.l(), this.f98399a.f98385m.get());
                    case 12:
                        return (T) new k.n(this.f98399a.m());
                    case 13:
                        return (T) new k.w();
                    case 14:
                        return (T) new q3(this.f98399a.f98384l.get(), this.f98399a.f98391s.get(), this.f98399a.f98392t.get(), this.f98399a.f98381i.get(), this.f98399a.f98378f.get());
                    case 15:
                        return (T) new x3(this.f98399a.n(), this.f98399a.f98381i.get(), this.f98399a.i(), this.f98399a.f98385m.get(), this.f98399a.f98389q.get(), this.f98399a.f98390r.get(), this.f98399a.k(), this.f98399a.f98378f.get());
                    case 16:
                        return (T) new h2(this.f98399a.f98386n.get(), this.f98399a.f98387o.get());
                    case 17:
                        return (T) h0.a(t.a(this.f98399a.f98373a));
                    case 18:
                        return (T) f0.a(this.f98399a.m());
                    case 19:
                        return (T) new i.p0(this.f98399a.f98378f.get(), this.f98399a.f98377e.get(), this.f98399a.f98376d.get());
                    case 20:
                        return (T) new y1(this.f98399a.f98378f.get(), this.f98399a.f98388p.get(), this.f98399a.f98391s.get());
                    case 21:
                        return (T) y.a(this.f98399a.m(), this.f98399a.f98378f.get(), this.f98399a.f98395w.get());
                    case 22:
                        return (T) d0.a();
                    case 23:
                        return (T) new e3();
                    default:
                        throw new AssertionError(this.f98400b);
                }
            }
        }

        g(q qVar, z0 z0Var) {
            this.f98373a = qVar;
            this.f98374b = z0Var;
            q(qVar, z0Var);
        }

        private void q(q qVar, z0 z0Var) {
            this.f98376d = mq.b.c(new a(this.f98375c, 1));
            this.f98377e = mq.b.c(new a(this.f98375c, 0));
            this.f98378f = mq.b.c(new a(this.f98375c, 5));
            this.f98379g = mq.g.a(new a(this.f98375c, 7));
            this.f98380h = mq.b.c(new a(this.f98375c, 8));
            this.f98381i = mq.b.c(new a(this.f98375c, 9));
            this.f98382j = mq.b.c(new a(this.f98375c, 10));
            this.f98383k = mq.b.c(new a(this.f98375c, 6));
            this.f98384l = mq.b.c(new a(this.f98375c, 12));
            this.f98385m = mq.b.c(new a(this.f98375c, 13));
            this.f98386n = mq.b.c(new a(this.f98375c, 11));
            this.f98387o = mq.b.c(new a(this.f98375c, 17));
            this.f98388p = mq.b.c(new a(this.f98375c, 16));
            this.f98389q = mq.g.a(new a(this.f98375c, 18));
            this.f98390r = mq.b.c(new a(this.f98375c, 19));
            this.f98391s = mq.b.c(new a(this.f98375c, 15));
            this.f98392t = mq.b.c(new a(this.f98375c, 20));
            this.f98393u = mq.b.c(new a(this.f98375c, 14));
            this.f98394v = new a(this.f98375c, 4);
            this.f98395w = mq.b.c(new a(this.f98375c, 3));
            this.f98396x = mq.b.c(new a(this.f98375c, 2));
            this.f98397y = mq.b.c(new a(this.f98375c, 21));
            this.f98398z = mq.b.c(new a(this.f98375c, 22));
            this.A = mq.b.c(new a(this.f98375c, 23));
        }

        @Override // j.p
        public h.p a() {
            return this.f98396x.get();
        }

        @Override // j.p
        public h.e0 b() {
            return this.f98398z.get();
        }

        @Override // j.p
        public l.a c() {
            return new e(this.f98375c);
        }

        @Override // j.p
        public h.m d() {
            return this.f98397y.get();
        }

        @Override // j.p
        public h.h e() {
            return this.f98395w.get();
        }

        @Override // j.p
        public m.g f() {
            return this.f98377e.get();
        }

        i.u0 i() {
            return new i.u0(this.f98379g, this.f98378f.get(), this.f98376d.get());
        }

        j1 j() {
            return new j1(this.f98379g, this.f98378f.get());
        }

        h.z.CameraInteropConfig k() {
            q qVar = this.f98373a;
            return r.a(qVar, s.a(qVar));
        }

        h.z.c l() {
            return b0.a(s.a(this.f98373a));
        }

        Context m() {
            return e0.a(s.a(this.f98373a));
        }

        w2 n() {
            return new w2(j(), this.f98386n.get(), this.f98381i.get(), this.f98388p.get(), this.f98385m.get(), k(), this.f98378f.get());
        }

        n.j o() {
            return new n.j(this.f98378f.get(), s.a(this.f98373a));
        }

        n.n p() {
            return w.a(o(), s.a(this.f98373a));
        }
    }

    public static b a() {
        return new b();
    }
}
