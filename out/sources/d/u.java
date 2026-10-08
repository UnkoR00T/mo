package d;

import PRN.r0;
import PRN.x0;
import android.hardware.camera2.params.StreamConfigurationMap;
import c.h0;
import c.j0;
import c.l0;
import c.m0;
import c.q0;
import e.a1;
import e.d2;
import e.f1;
import e.g1;
import e.i1;
import e.j2;
import e.l2;
import e.p2;
import e.r1;
import e.r2;
import e.t1;
import e.u0;
import e.u2;
import e.v2;
import e.w0;
import e.x1;
import e.y1;
import e.y2;
import e.z0;
import e.z1;
import java.util.Set;
import org.bouncycastle.asn1.BERTags;
import v.l3;
import v.n0;
import v.w1;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    private static final class b implements d.a.InterfaceC0840a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d.b f38868a;

        private b() {
        }

        @Override // d.a.InterfaceC0840a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(d.b bVar) {
            this.f38868a = (d.b) mq.d.b(bVar);
            return this;
        }

        @Override // d.a.InterfaceC0840a
        public d.a build() {
            mq.d.a(this.f38868a, d.b.class);
            return new c(this.f38868a);
        }
    }

    private static final class c implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d.b f38869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f38870b = this;

        c(d.b bVar) {
            this.f38869a = bVar;
        }

        @Override // d.a
        public h.z a() {
            return d.e.a(this.f38869a);
        }

        @Override // d.a
        public h.p b() {
            return k.a(d.e.a(this.f38869a));
        }

        @Override // d.a
        public l.a c() {
            return new d(this.f38870b);
        }

        z0 e() {
            d.b bVar = this.f38869a;
            return i.a(bVar, h.a(bVar));
        }
    }

    private static final class d implements l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f38871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m f38872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b0.m f38873c;

        @Override // d.l.a
        public l build() {
            mq.d.a(this.f38872b, m.class);
            mq.d.a(this.f38873c, b0.m.class);
            return new e(this.f38871a, this.f38872b, this.f38873c);
        }

        @Override // d.l.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d b(m mVar) {
            this.f38872b = (m) mq.d.b(mVar);
            return this;
        }

        @Override // d.l.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d a(b0.m mVar) {
            this.f38873c = (b0.m) mq.d.b(mVar);
            return this;
        }

        private d(c cVar) {
            this.f38871a = cVar;
        }
    }

    private static final class e implements l {
        mq.e<PRN.l> A;
        mq.e<PRN.b> B;
        mq.e<e.v> C;
        mq.e<String> D;
        mq.e<w1> E;
        mq.e<f.k> F;
        mq.e<PRN.k> G;
        mq.e<e.x> H;
        mq.e<p2> I;
        mq.e<PRN.a> J;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f38874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0.m f38875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f38876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e f38877d = this;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        mq.e<h.x> f38878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        mq.e<e.a0> f38879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        mq.e<x0> f38880g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        mq.e<StreamConfigurationMap> f38881h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        mq.e<c.a0> f38882i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        mq.e<a.u> f38883j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        mq.e<androidx.camera.camera2.compat.quirk.a> f38884k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        mq.e<u2> f38885l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        mq.e<r1> f38886m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        mq.e<u0> f38887n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        mq.e<i1> f38888o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        mq.e<a.s> f38889p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        mq.e<a1> f38890q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        mq.e<x1> f38891r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        mq.e<f1> f38892s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        mq.e<g1> f38893t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        mq.e<t1> f38894u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        mq.e<v2> f38895v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        mq.e<y2> f38896w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        mq.e<a.i> f38897x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        mq.e<g.a> f38898y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        mq.e<PRN.o> f38899z;

        private static final class a<T> implements mq.e<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c f38900a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final e f38901b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f38902c;

            a(c cVar, e eVar, int i15) {
                this.f38900a = cVar;
                this.f38901b = eVar;
                this.f38902c = i15;
            }

            @Override // nq.a
            public T get() {
                switch (this.f38902c) {
                    case 0:
                        return (T) new PRN.l(n.a(this.f38901b.f38874a), this.f38901b.I.get(), this.f38901b.G.get(), this.f38901b.J.get(), this.f38901b.f38885l.get(), this.f38901b.f38899z.get());
                    case 1:
                        h.z zVarA = d.e.a(this.f38900a.f38869a);
                        p.a aVarA = d.d.a(this.f38900a.f38869a);
                        f fVar = new f(this.f38900a, this.f38901b);
                        x0 x0Var = this.f38901b.f38880g.get();
                        i1 i1Var = this.f38901b.f38888o.get();
                        Set<z1> setI = this.f38901b.i();
                        g.a aVar = this.f38901b.f38898y.get();
                        PRN.o oVar = this.f38901b.f38899z.get();
                        e eVar = this.f38901b;
                        return (T) new p2(zVarA, aVarA, fVar, x0Var, i1Var, setI, aVar, oVar, eVar.A, eVar.f38885l, eVar.G, eVar.E.get(), this.f38901b.f38879f.get(), d.g.a(this.f38900a.f38869a), this.f38901b.H.get(), h.a(this.f38900a.f38869a), this.f38900a.e());
                    case 2:
                        return (T) t.a(this.f38901b.f38879f.get());
                    case 3:
                        return (T) new e.a0(n.a(this.f38901b.f38874a), this.f38901b.f38878e.get());
                    case 4:
                        return (T) o.INSTANCE.c(d.e.a(this.f38900a.f38869a), n.a(this.f38901b.f38874a));
                    case 5:
                        return (T) new i1(this.f38901b.f38878e.get(), this.f38901b.f38886m.get(), this.f38901b.f38885l.get(), this.f38901b.f38887n.get());
                    case 6:
                        return (T) new r1(this.f38901b.f38879f.get(), this.f38901b.d(), this.f38901b.f38885l.get());
                    case 7:
                        return (T) new androidx.camera.camera2.compat.quirk.a(this.f38901b.f38878e.get(), this.f38901b.f38883j.get());
                    case 8:
                        return (T) new a.u(this.f38901b.f38881h.get(), this.f38901b.f38882i.get());
                    case 9:
                        return (T) o.INSTANCE.e(this.f38901b.f38878e.get());
                    case 10:
                        return (T) new c.a0(this.f38901b.f38878e.get(), this.f38901b.f38881h.get());
                    case 11:
                        return (T) s.a(n.a(this.f38901b.f38874a), d.f.a(this.f38900a.f38869a));
                    case 12:
                        return (T) new u0();
                    case 13:
                        return (T) new a1(this.f38901b.f38889p.get());
                    case 14:
                        return (T) new a.s(this.f38901b.f38879f.get(), this.f38901b.f38885l.get(), this.f38901b.f38887n.get());
                    case 15:
                        return (T) new f1(this.f38901b.f38879f.get(), this.f38901b.f38886m.get(), this.f38901b.f38885l.get(), this.f38901b.f38891r.get(), this.f38901b.l());
                    case 16:
                        return (T) new x1(this.f38901b.f38879f.get(), this.f38901b.f38886m.get(), this.f38901b.f38885l.get());
                    case 17:
                        return (T) new g1(this.f38901b.f38879f.get(), this.f38901b.h(), this.f38901b.f38886m.get(), this.f38901b.f38885l.get(), this.f38901b.n());
                    case 18:
                        return (T) new t1(this.f38901b.f38892s.get(), this.f38901b.f38885l.get());
                    case 19:
                        return (T) new v2();
                    case 20:
                        return (T) new y2(this.f38901b.n());
                    case 21:
                        return (T) p.a(this.f38901b.f38897x.get(), this.f38901b.f38885l.get(), this.f38901b.f38887n.get());
                    case 22:
                        return (T) new a.i();
                    case 23:
                        return (T) new PRN.o();
                    case 24:
                        return (T) new PRN.k(this.f38901b.f38879f.get(), n.a(this.f38901b.f38874a), this.f38901b.f38899z.get(), this.f38901b.B.get(), this.f38901b.C.get(), this.f38901b.f38893t.get(), this.f38901b.f38884k.get(), this.f38901b.E.get(), this.f38901b.f38883j.get(), this.f38901b.F.get(), this.f38901b.f38875b);
                    case 25:
                        return (T) new PRN.b(this.f38901b.f38896w.get(), this.f38901b.f38890q.get(), this.f38901b.f38891r.get(), this.f38901b.f38888o.get());
                    case 26:
                        return (T) new e.v();
                    case 27:
                        return (T) r.a(this.f38901b.D.get(), this.f38901b.f38884k.get());
                    case 28:
                        return (T) q.a(n.a(this.f38901b.f38874a));
                    case 29:
                        return (T) new f.k(this.f38900a.b());
                    case 30:
                        return (T) new e.x(this.f38901b.C.get(), this.f38901b.f38887n.get(), n.a(this.f38901b.f38874a), this.f38901b.f38884k.get(), this.f38901b.f38880g.get(), this.f38901b.k(), this.f38901b.f38878e.get(), d.g.a(this.f38900a.f38869a), d.c.a(this.f38900a.f38869a));
                    case BERTags.DATE /* 31 */:
                        return (T) new PRN.a(this.f38901b.f38879f.get(), this.f38901b.f38890q.get(), this.f38901b.f38892s.get(), this.f38901b.f38893t.get(), this.f38901b.f38894u.get(), this.f38901b.f38891r.get(), this.f38901b.f38888o.get(), this.f38901b.f38896w.get(), this.f38901b.f38880g.get(), this.f38901b.f38898y.get(), this.f38901b.I.get(), this.f38901b.f38885l.get(), this.f38901b.f38895v.get());
                    default:
                        throw new AssertionError(this.f38902c);
                }
            }
        }

        e(c cVar, m mVar, b0.m mVar2) {
            this.f38876c = cVar;
            this.f38874a = mVar;
            this.f38875b = mVar2;
            f(mVar, mVar2);
            g(mVar, mVar2);
        }

        private void f(m mVar, b0.m mVar2) {
            this.f38878e = mq.b.c(new a(this.f38876c, this.f38877d, 4));
            this.f38879f = mq.b.c(new a(this.f38876c, this.f38877d, 3));
            this.f38880g = mq.b.c(new a(this.f38876c, this.f38877d, 2));
            this.f38881h = mq.b.c(new a(this.f38876c, this.f38877d, 9));
            this.f38882i = mq.b.c(new a(this.f38876c, this.f38877d, 10));
            this.f38883j = mq.b.c(new a(this.f38876c, this.f38877d, 8));
            this.f38884k = mq.b.c(new a(this.f38876c, this.f38877d, 7));
            this.f38885l = mq.b.c(new a(this.f38876c, this.f38877d, 11));
            this.f38886m = mq.b.c(new a(this.f38876c, this.f38877d, 6));
            this.f38887n = mq.b.c(new a(this.f38876c, this.f38877d, 12));
            this.f38888o = mq.b.c(new a(this.f38876c, this.f38877d, 5));
            this.f38889p = mq.b.c(new a(this.f38876c, this.f38877d, 14));
            this.f38890q = mq.b.c(new a(this.f38876c, this.f38877d, 13));
            this.f38891r = mq.b.c(new a(this.f38876c, this.f38877d, 16));
            this.f38892s = mq.b.c(new a(this.f38876c, this.f38877d, 15));
            this.f38893t = mq.b.c(new a(this.f38876c, this.f38877d, 17));
            this.f38894u = mq.b.c(new a(this.f38876c, this.f38877d, 18));
            this.f38895v = mq.b.c(new a(this.f38876c, this.f38877d, 19));
            this.f38896w = mq.b.c(new a(this.f38876c, this.f38877d, 20));
            this.f38897x = mq.b.c(new a(this.f38876c, this.f38877d, 22));
            this.f38898y = mq.b.c(new a(this.f38876c, this.f38877d, 21));
            this.f38899z = mq.b.c(new a(this.f38876c, this.f38877d, 23));
            this.A = new mq.a();
            this.B = mq.b.c(new a(this.f38876c, this.f38877d, 25));
            this.C = mq.b.c(new a(this.f38876c, this.f38877d, 26));
        }

        private void g(m mVar, b0.m mVar2) {
            this.D = mq.b.c(new a(this.f38876c, this.f38877d, 28));
            this.E = mq.b.c(new a(this.f38876c, this.f38877d, 27));
            this.F = mq.b.c(new a(this.f38876c, this.f38877d, 29));
            this.G = mq.b.c(new a(this.f38876c, this.f38877d, 24));
            this.H = mq.b.c(new a(this.f38876c, this.f38877d, 30));
            this.I = mq.b.c(new a(this.f38876c, this.f38877d, 1));
            this.J = mq.b.c(new a(this.f38876c, this.f38877d, 31));
            mq.a.a(this.A, mq.b.c(new a(this.f38876c, this.f38877d, 0)));
        }

        @Override // d.l
        public n0 a() {
            return this.A.get();
        }

        c.a d() {
            return c.c.a(this.f38884k.get());
        }

        c.n e() {
            return c.p.a(this.f38884k.get());
        }

        c.r h() {
            return c.s.a(this.f38884k.get());
        }

        Set<z1> i() {
            return j();
        }

        Set j() {
            mq.f fVarC = mq.f.c(9);
            fVarC.a(this.f38890q.get());
            fVarC.a(this.f38892s.get());
            fVarC.a(this.f38893t.get());
            fVarC.a(this.f38886m.get());
            fVarC.a(this.f38894u.get());
            fVarC.a(this.f38891r.get());
            fVarC.a(this.f38888o.get());
            fVarC.a(this.f38895v.get());
            fVarC.a(this.f38896w.get());
            return fVarC.b();
        }

        c.g0 k() {
            return h0.a(this.f38884k.get());
        }

        j0 l() {
            return l0.a(this.f38884k.get());
        }

        m0 m() {
            return q0.a(this.f38884k.get(), this.f38876c.b(), this.F.get());
        }

        a.x n() {
            return a.y.a(this.f38879f.get());
        }
    }

    private static final class f implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f38903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f38904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private UseCaseCameraConfig f38905c;

        @Override // d.v.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(UseCaseCameraConfig useCaseCameraConfig) {
            this.f38905c = (UseCaseCameraConfig) mq.d.b(useCaseCameraConfig);
            return this;
        }

        @Override // d.v.a
        public v build() {
            mq.d.a(this.f38905c, UseCaseCameraConfig.class);
            return new g(this.f38903a, this.f38904b, this.f38905c);
        }

        private f(c cVar, e eVar) {
            this.f38903a = cVar;
            this.f38904b = eVar;
        }
    }

    private static final class g implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final UseCaseCameraConfig f38906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f38907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f38908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final g f38909d = this;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        mq.e<g0> f38910e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        mq.e<l3> f38911f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        mq.e<PRN.r> f38912g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        mq.e<l2> f38913h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        mq.e<e.h0> f38914i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        mq.e<c.h> f38915j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        mq.e<e.c0> f38916k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        mq.e<r0> f38917l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        mq.e<r2> f38918m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        mq.e<j2> f38919n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        mq.e<w0> f38920o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        mq.e<d2> f38921p;

        private static final class a<T> implements mq.e<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c f38922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final e f38923b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final g f38924c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final int f38925d;

            a(c cVar, e eVar, g gVar, int i15) {
                this.f38922a = cVar;
                this.f38923b = eVar;
                this.f38924c = gVar;
                this.f38925d = i15;
            }

            @Override // nq.a
            public T get() {
                switch (this.f38925d) {
                    case 0:
                        g0 g0Var = this.f38924c.f38910e.get();
                        u2 u2Var = this.f38923b.f38885l.get();
                        l3 l3Var = this.f38924c.f38911f.get();
                        w0 w0Var = this.f38924c.f38920o.get();
                        g gVar = this.f38924c;
                        return (T) new d2(g0Var, u2Var, l3Var, w0Var, gVar.f38918m, gVar.f38917l, gVar.f38916k);
                    case 1:
                        return (T) b0.a(this.f38924c.f38906a, this.f38923b.f38899z.get());
                    case 2:
                        return (T) this.f38924c.f38906a.getSessionProcessor();
                    case 3:
                        return (T) new w0(this.f38924c.f38919n, this.f38923b.f38885l.get());
                    case 4:
                        g gVar2 = this.f38924c;
                        return (T) new j2(gVar2.f38916k, gVar2.f38913h, gVar2.f38910e.get(), this.f38924c.f38918m, this.f38923b.f38885l.get(), d.g.a(this.f38922a.f38869a));
                    case 5:
                        g gVar3 = this.f38924c;
                        return (T) d0.a(gVar3.f38914i, gVar3.f38915j);
                    case 6:
                        PRN.r rVar = this.f38924c.f38912g.get();
                        f1 f1Var = this.f38923b.f38892s.get();
                        x1 x1Var = this.f38923b.f38891r.get();
                        v2 v2Var = this.f38923b.f38895v.get();
                        u2 u2Var2 = this.f38923b.f38885l.get();
                        u0 u0Var = this.f38923b.f38887n.get();
                        m0 m0VarM = this.f38923b.m();
                        e.a0 a0Var = this.f38923b.f38879f.get();
                        g gVar4 = this.f38924c;
                        return (T) new e.h0(rVar, f1Var, x1Var, v2Var, u2Var2, u0Var, m0VarM, a0Var, gVar4.f38913h, gVar4.f38910e.get());
                    case 7:
                        return (T) new PRN.r(this.f38923b.f38879f.get(), this.f38924c.f38910e.get(), this.f38923b.f38880g.get(), this.f38923b.f38885l.get(), this.f38923b.k());
                    case 8:
                        return (T) new l2(this.f38924c.f38910e.get(), this.f38923b.k());
                    case 9:
                        return (T) new c.h(this.f38923b.f38879f.get(), this.f38924c.f38914i, this.f38923b.f38885l.get(), this.f38923b.f38891r.get());
                    case 10:
                        return (T) new r2(this.f38923b.f38885l.get(), d.e.a(this.f38922a.f38869a), this.f38923b.e(), this.f38924c.f38917l.get());
                    case 11:
                        return (T) a0.a(this.f38924c.f38906a);
                    default:
                        throw new AssertionError(this.f38925d);
                }
            }
        }

        g(c cVar, e eVar, UseCaseCameraConfig useCaseCameraConfig) {
            this.f38907b = cVar;
            this.f38908c = eVar;
            this.f38906a = useCaseCameraConfig;
            c(useCaseCameraConfig);
        }

        private void c(UseCaseCameraConfig useCaseCameraConfig) {
            this.f38910e = mq.b.c(new a(this.f38907b, this.f38908c, this.f38909d, 1));
            this.f38911f = mq.b.c(new a(this.f38907b, this.f38908c, this.f38909d, 2));
            this.f38912g = mq.b.c(new a(this.f38907b, this.f38908c, this.f38909d, 7));
            this.f38913h = mq.b.c(new a(this.f38907b, this.f38908c, this.f38909d, 8));
            this.f38914i = mq.b.c(new a(this.f38907b, this.f38908c, this.f38909d, 6));
            this.f38915j = mq.b.c(new a(this.f38907b, this.f38908c, this.f38909d, 9));
            this.f38916k = mq.b.c(new a(this.f38907b, this.f38908c, this.f38909d, 5));
            this.f38917l = mq.b.c(new a(this.f38907b, this.f38908c, this.f38909d, 11));
            this.f38918m = mq.b.c(new a(this.f38907b, this.f38908c, this.f38909d, 10));
            this.f38919n = mq.b.c(new a(this.f38907b, this.f38908c, this.f38909d, 4));
            this.f38920o = mq.b.c(new a(this.f38907b, this.f38908c, this.f38909d, 3));
            this.f38921p = mq.b.c(new a(this.f38907b, this.f38908c, this.f38909d, 0));
        }

        @Override // d.v
        public y1 a() {
            return this.f38921p.get();
        }
    }

    public static d.a.InterfaceC0840a a() {
        return new b();
    }
}
