package tr;

import fr.k;
import fr.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lr.i;
import pq.s0;
import pq.v;
import rt.n;
import sr.p;
import st.e1;
import st.f2;
import st.p2;
import st.t0;
import st.t1;
import st.w0;
import st.x1;
import vr.f0;
import vr.h1;
import vr.i0;
import vr.k1;
import vr.m1;
import vr.o0;
import vr.r1;
import vr.u;
import vr.y;
import wr.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends yr.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f191700p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final zs.b f191701q = new zs.b(p.B, zs.f.l("Function"));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final zs.b f191702r = new zs.b(p.f183627y, zs.f.l("KFunction"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n f191703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o0 f191704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f191705h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f191706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C5005b f191707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f191708l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<m1> f191709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f191710n;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: tr.b$b, reason: collision with other inner class name */
    private final class C5005b extends st.b {
        public C5005b() {
            super(b.this.f191703f);
        }

        @Override // st.w, st.x1
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public b c() {
            return b.this;
        }

        @Override // st.x1
        public boolean d() {
            return true;
        }

        @Override // st.x1
        public List<m1> getParameters() {
            return b.this.f191709m;
        }

        @Override // st.q
        protected Collection<t0> r() {
            List listQ;
            f fVarA1 = b.this.a1();
            f.a aVar = f.a.f191725f;
            if (t.c(fVarA1, aVar)) {
                listQ = v.e(b.f191701q);
            } else if (t.c(fVarA1, f.b.f191726f)) {
                listQ = v.q(b.f191702r, new zs.b(p.B, aVar.c(b.this.W0())));
            } else {
                f.d dVar = f.d.f191728f;
                if (t.c(fVarA1, dVar)) {
                    listQ = v.e(b.f191701q);
                } else {
                    if (!t.c(fVarA1, f.c.f191727f)) {
                        du.a.b(null, 1, null);
                        throw new oq.g();
                    }
                    listQ = v.q(b.f191702r, new zs.b(p.f183621s, dVar.c(b.this.W0())));
                }
            }
            i0 i0VarB = b.this.f191704g.b();
            List<zs.b> list = listQ;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            for (zs.b bVar : list) {
                vr.e eVarB = y.b(i0VarB, bVar);
                if (eVarB == null) {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
                List listY0 = v.Y0(getParameters(), eVarB.o().getParameters().size());
                ArrayList arrayList2 = new ArrayList(v.y(listY0, 10));
                Iterator it = listY0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new f2(((m1) it.next()).t()));
                }
                arrayList.add(w0.h(t1.f184126b.k(), eVarB, arrayList2));
            }
            return v.f1(arrayList);
        }

        public String toString() {
            return c().toString();
        }

        @Override // st.q
        protected k1 w() {
            return k1.a.f208057a;
        }
    }

    public b(n nVar, o0 o0Var, f fVar, int i15) {
        super(nVar, fVar.c(i15));
        this.f191703f = nVar;
        this.f191704g = o0Var;
        this.f191705h = fVar;
        this.f191706j = i15;
        this.f191707k = new C5005b();
        this.f191708l = new d(nVar, this);
        ArrayList arrayList = new ArrayList();
        i iVar = new i(1, i15);
        ArrayList arrayList2 = new ArrayList(v.y(iVar, 10));
        Iterator<Integer> it = iVar.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            p2 p2Var = p2.IN_VARIANCE;
            StringBuilder sb5 = new StringBuilder();
            sb5.append('P');
            sb5.append(iNextInt);
            Q0(arrayList, this, p2Var, sb5.toString());
            arrayList2.add(oq.i0.f148189a);
        }
        Q0(arrayList, this, p2.OUT_VARIANCE, "R");
        this.f191709m = v.f1(arrayList);
        this.f191710n = c.f191712a.a(this.f191705h);
    }

    private static final void Q0(ArrayList<m1> arrayList, b bVar, p2 p2Var, String str) {
        arrayList.add(yr.t0.X0(bVar, h.f214542p0.b(), false, p2Var, zs.f.l(str), arrayList.size(), bVar.f191703f));
    }

    @Override // vr.i
    public boolean E() {
        return false;
    }

    @Override // vr.e
    public /* bridge */ /* synthetic */ vr.d H() {
        return (vr.d) d1();
    }

    @Override // vr.e
    public boolean O0() {
        return false;
    }

    public final int W0() {
        return this.f191706j;
    }

    public Void X0() {
        return null;
    }

    @Override // vr.e
    public r1<e1> Y() {
        return null;
    }

    @Override // vr.e
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public List<vr.d> p() {
        return v.n();
    }

    @Override // vr.e, vr.n, vr.m
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public o0 b() {
        return this.f191704g;
    }

    public final f a1() {
        return this.f191705h;
    }

    @Override // vr.e0
    public boolean b0() {
        return false;
    }

    @Override // vr.e
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public lt.k.b q0() {
        return lt.k.b.f120132b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yr.z
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public d I0(tt.g gVar) {
        return this.f191708l;
    }

    @Override // vr.e0
    public boolean d0() {
        return false;
    }

    public Void d1() {
        return null;
    }

    @Override // vr.e
    public boolean e0() {
        return false;
    }

    @Override // wr.a
    public h getAnnotations() {
        return h.f214542p0.b();
    }

    @Override // vr.e, vr.e0, vr.q
    public u h() {
        return vr.t.f208080e;
    }

    @Override // vr.e
    public boolean j0() {
        return false;
    }

    @Override // vr.e
    public vr.f k() {
        return vr.f.INTERFACE;
    }

    @Override // vr.p
    public h1 m() {
        return h1.f208052a;
    }

    @Override // vr.e
    public boolean n() {
        return false;
    }

    @Override // vr.h
    public x1 o() {
        return this.f191707k;
    }

    @Override // vr.e0
    public boolean o0() {
        return false;
    }

    @Override // vr.e
    public /* bridge */ /* synthetic */ vr.e r0() {
        return (vr.e) X0();
    }

    public String toString() {
        return getName().e();
    }

    @Override // vr.e, vr.i
    public List<m1> v() {
        return this.f191709m;
    }

    @Override // vr.e, vr.e0
    public f0 w() {
        return f0.ABSTRACT;
    }

    @Override // vr.e
    public boolean x() {
        return false;
    }
}
