package ss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import vr.h1;
import vr.n0;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends d<wr.c, ft.g<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vr.i0 f183853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n0 f183854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ot.g f183855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ws.c f183856g;

    private abstract class a implements x.a {

        /* JADX INFO: renamed from: ss.h$a$a, reason: collision with other inner class name */
        public static final class C4737a implements x.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ x.a f183858a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x.a f183859b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f183860c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ zs.f f183861d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList<wr.c> f183862e;

            C4737a(x.a aVar, a aVar2, zs.f fVar, ArrayList<wr.c> arrayList) {
                this.f183859b = aVar;
                this.f183860c = aVar2;
                this.f183861d = fVar;
                this.f183862e = arrayList;
                this.f183858a = aVar;
            }

            @Override // ss.x.a
            public void a() {
                this.f183859b.a();
                this.f183860c.h(this.f183861d, new ft.a((wr.c) pq.v.P0(this.f183862e)));
            }

            @Override // ss.x.a
            public x.a b(zs.f fVar, zs.b bVar) {
                return this.f183858a.b(fVar, bVar);
            }

            @Override // ss.x.a
            public void c(zs.f fVar, zs.b bVar, zs.f fVar2) {
                this.f183858a.c(fVar, bVar, fVar2);
            }

            @Override // ss.x.a
            public void d(zs.f fVar, Object obj) {
                this.f183858a.d(fVar, obj);
            }

            @Override // ss.x.a
            public x.b e(zs.f fVar) {
                return this.f183858a.e(fVar);
            }

            @Override // ss.x.a
            public void f(zs.f fVar, ft.f fVar2) {
                this.f183858a.f(fVar, fVar2);
            }
        }

        public static final class b implements x.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ArrayList<ft.g<?>> f183863a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f183864b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ zs.f f183865c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f183866d;

            /* JADX INFO: renamed from: ss.h$a$b$a, reason: collision with other inner class name */
            public static final class C4738a implements x.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final /* synthetic */ x.a f183867a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ x.a f183868b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ b f183869c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ArrayList<wr.c> f183870d;

                C4738a(x.a aVar, b bVar, ArrayList<wr.c> arrayList) {
                    this.f183868b = aVar;
                    this.f183869c = bVar;
                    this.f183870d = arrayList;
                    this.f183867a = aVar;
                }

                @Override // ss.x.a
                public void a() {
                    this.f183868b.a();
                    this.f183869c.f183863a.add(new ft.a((wr.c) pq.v.P0(this.f183870d)));
                }

                @Override // ss.x.a
                public x.a b(zs.f fVar, zs.b bVar) {
                    return this.f183867a.b(fVar, bVar);
                }

                @Override // ss.x.a
                public void c(zs.f fVar, zs.b bVar, zs.f fVar2) {
                    this.f183867a.c(fVar, bVar, fVar2);
                }

                @Override // ss.x.a
                public void d(zs.f fVar, Object obj) {
                    this.f183867a.d(fVar, obj);
                }

                @Override // ss.x.a
                public x.b e(zs.f fVar) {
                    return this.f183867a.e(fVar);
                }

                @Override // ss.x.a
                public void f(zs.f fVar, ft.f fVar2) {
                    this.f183867a.f(fVar, fVar2);
                }
            }

            b(h hVar, zs.f fVar, a aVar) {
                this.f183864b = hVar;
                this.f183865c = fVar;
                this.f183866d = aVar;
            }

            @Override // ss.x.b
            public void a() {
                this.f183866d.g(this.f183865c, this.f183863a);
            }

            @Override // ss.x.b
            public void b(zs.b bVar, zs.f fVar) {
                this.f183863a.add(new ft.k(bVar, fVar));
            }

            @Override // ss.x.b
            public x.a c(zs.b bVar) {
                ArrayList arrayList = new ArrayList();
                return new C4738a(this.f183864b.z(bVar, h1.f208052a, arrayList), this, arrayList);
            }

            @Override // ss.x.b
            public void d(Object obj) {
                this.f183863a.add(this.f183864b.R(this.f183865c, obj));
            }

            @Override // ss.x.b
            public void e(ft.f fVar) {
                this.f183863a.add(new ft.t(fVar));
            }
        }

        public a() {
        }

        @Override // ss.x.a
        public x.a b(zs.f fVar, zs.b bVar) {
            ArrayList arrayList = new ArrayList();
            return new C4737a(h.this.z(bVar, h1.f208052a, arrayList), this, fVar, arrayList);
        }

        @Override // ss.x.a
        public void c(zs.f fVar, zs.b bVar, zs.f fVar2) {
            h(fVar, new ft.k(bVar, fVar2));
        }

        @Override // ss.x.a
        public void d(zs.f fVar, Object obj) {
            h(fVar, h.this.R(fVar, obj));
        }

        @Override // ss.x.a
        public x.b e(zs.f fVar) {
            return new b(h.this, fVar, this);
        }

        @Override // ss.x.a
        public void f(zs.f fVar, ft.f fVar2) {
            h(fVar, new ft.t(fVar2));
        }

        public abstract void g(zs.f fVar, ArrayList<ft.g<?>> arrayList);

        public abstract void h(zs.f fVar, ft.g<?> gVar);
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap<zs.f, ft.g<?>> f183871b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ vr.e f183873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zs.b f183874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<wr.c> f183875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h1 f183876g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(vr.e eVar, zs.b bVar, List<wr.c> list, h1 h1Var) {
            super();
            this.f183873d = eVar;
            this.f183874e = bVar;
            this.f183875f = list;
            this.f183876g = h1Var;
            this.f183871b = new HashMap<>();
        }

        @Override // ss.x.a
        public void a() {
            if (h.this.I(this.f183874e, this.f183871b) || h.this.y(this.f183874e)) {
                return;
            }
            this.f183875f.add(new wr.d(this.f183873d.t(), this.f183871b, this.f183876g));
        }

        @Override // ss.h.a
        public void g(zs.f fVar, ArrayList<ft.g<?>> arrayList) {
            if (fVar == null) {
                return;
            }
            t1 t1VarB = ks.a.b(fVar, this.f183873d);
            if (t1VarB != null) {
                this.f183871b.put(fVar, ft.i.f66956a.b(cu.a.c(arrayList), t1VarB.getType()));
                return;
            }
            if (h.this.y(this.f183874e) && fr.t.c(fVar.e(), "value")) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof ft.a) {
                        arrayList2.add(obj);
                    }
                }
                List<wr.c> list = this.f183875f;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    list.add(((ft.a) it.next()).b());
                }
            }
        }

        @Override // ss.h.a
        public void h(zs.f fVar, ft.g<?> gVar) {
            if (fVar != null) {
                this.f183871b.put(fVar, gVar);
            }
        }
    }

    public h(vr.i0 i0Var, n0 n0Var, rt.n nVar, v vVar) {
        super(nVar, vVar);
        this.f183853d = i0Var;
        this.f183854e = n0Var;
        this.f183855f = new ot.g(i0Var, n0Var);
        this.f183856g = ws.c.f214749i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ft.g<?> R(zs.f fVar, Object obj) {
        ft.g<?> gVarE = ft.i.f66956a.e(obj, this.f183853d);
        if (gVarE != null) {
            return gVarE;
        }
        return ft.l.f66959b.a("Unsupported annotation argument: " + fVar);
    }

    private final vr.e U(zs.b bVar) {
        return vr.y.d(this.f183853d, bVar, this.f183854e);
    }

    @Override // ss.e, ot.h
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public wr.c b(us.b bVar, ws.d dVar) {
        return this.f183855f.a(bVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ss.d
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public ft.g<?> L(String str, Object obj) {
        if (fu.r.d0("ZBCS", str, false, 2, null)) {
            int iIntValue = ((Integer) obj).intValue();
            int iHashCode = str.hashCode();
            if (iHashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 67) {
                if (str.equals("C")) {
                    obj = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 83) {
                if (str.equals(ip.a.f96137b)) {
                    obj = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 90 && str.equals("Z")) {
                obj = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(str);
        }
        return ft.i.f66956a.e(obj, this.f183853d);
    }

    public void V(ws.c cVar) {
        this.f183856g = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ss.d
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public ft.g<?> P(ft.g<?> gVar) {
        if (gVar instanceof ft.d) {
            return new ft.b0(((ft.d) gVar).b().byteValue());
        }
        if (gVar instanceof ft.x) {
            return new ft.e0(((ft.x) gVar).b().shortValue());
        }
        if (gVar instanceof ft.n) {
            return new ft.c0(((ft.n) gVar).b().intValue());
        }
        return gVar instanceof ft.u ? new ft.d0(((ft.u) gVar).b().longValue()) : gVar;
    }

    @Override // ss.e
    public ws.c x() {
        return this.f183856g;
    }

    @Override // ss.e
    protected x.a z(zs.b bVar, h1 h1Var, List<wr.c> list) {
        return new b(U(bVar), bVar, list, h1Var);
    }
}
