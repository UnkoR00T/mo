package af;

import android.content.Context;
import hf.w;
import hf.x;
import java.util.concurrent.Executor;
import jf.m0;
import jf.n0;
import jf.v0;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    private static final class b implements u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f6122a;

        private b() {
        }

        @Override // af.u.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f6122a = (Context) cf.d.b(context);
            return this;
        }

        @Override // af.u.a
        public u build() {
            cf.d.a(this.f6122a, Context.class);
            return new c(this.f6122a);
        }
    }

    private static final class c extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f6123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private nq.a<Executor> f6124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private nq.a<Context> f6125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private nq.a f6126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private nq.a f6127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private nq.a f6128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private nq.a<String> f6129g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private nq.a<m0> f6130h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private nq.a<hf.f> f6131j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private nq.a<x> f6132k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private nq.a<gf.c> f6133l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private nq.a<hf.r> f6134m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private nq.a<hf.v> f6135n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private nq.a<t> f6136p;

        private void m(Context context) {
            this.f6124b = cf.a.a(k.a());
            cf.b bVarA = cf.c.a(context);
            this.f6125c = bVarA;
            bf.j jVarA = bf.j.a(bVarA, lf.c.a(), lf.d.a());
            this.f6126d = jVarA;
            this.f6127e = cf.a.a(bf.l.a(this.f6125c, jVarA));
            this.f6128f = v0.a(this.f6125c, jf.g.a(), jf.i.a());
            this.f6129g = cf.a.a(jf.h.a(this.f6125c));
            this.f6130h = cf.a.a(n0.a(lf.c.a(), lf.d.a(), jf.j.a(), this.f6128f, this.f6129g));
            gf.g gVarB = gf.g.b(lf.c.a());
            this.f6131j = gVarB;
            gf.i iVarA = gf.i.a(this.f6125c, this.f6130h, gVarB, lf.d.a());
            this.f6132k = iVarA;
            nq.a<Executor> aVar = this.f6124b;
            nq.a aVar2 = this.f6127e;
            nq.a<m0> aVar3 = this.f6130h;
            this.f6133l = gf.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
            nq.a<Context> aVar4 = this.f6125c;
            nq.a aVar5 = this.f6127e;
            nq.a<m0> aVar6 = this.f6130h;
            this.f6134m = hf.s.a(aVar4, aVar5, aVar6, this.f6132k, this.f6124b, aVar6, lf.c.a(), lf.d.a(), this.f6130h);
            nq.a<Executor> aVar7 = this.f6124b;
            nq.a<m0> aVar8 = this.f6130h;
            this.f6135n = w.a(aVar7, aVar8, this.f6132k, aVar8);
            this.f6136p = cf.a.a(v.a(lf.c.a(), lf.d.a(), this.f6133l, this.f6134m, this.f6135n));
        }

        @Override // af.u
        jf.d b() {
            return this.f6130h.get();
        }

        @Override // af.u
        t h() {
            return this.f6136p.get();
        }

        private c(Context context) {
            this.f6123a = this;
            m(context);
        }
    }

    public static u.a a() {
        return new b();
    }
}
