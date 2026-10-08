package com.google.android.libraries.places.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class dz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qv f32111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r70 f32112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fz0 f32113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a41 f32114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xu0 f32115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j01 f32116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l01 f32117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nz0 f32118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final uz0 f32119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c01 f32120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final m40 f32121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final zx0 f32122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b41 f32123m;

    dz0(b41 b41Var, r70 r70Var, a41 a41Var, xu0 xu0Var, l01 l01Var, j01 j01Var, fy0 fy0Var, cy0 cy0Var, sx0 sx0Var, nz0 nz0Var, g01 g01Var, n01 n01Var, fz0 fz0Var, uz0 uz0Var, c01 c01Var, m40 m40Var, zx0 zx0Var) {
        this.f32123m = b41Var;
        this.f32112b = r70Var;
        this.f32111a = rv.f(r70Var);
        this.f32113c = fz0Var;
        this.f32114d = a41Var;
        this.f32115e = xu0Var;
        this.f32117g = l01Var;
        this.f32116f = j01Var;
        this.f32118h = nz0Var;
        this.f32119i = uz0Var;
        this.f32120j = c01Var;
        this.f32121k = m40Var;
        this.f32122l = zx0Var;
    }

    private final com.google.common.util.concurrent.q u() {
        this.f32123m.f();
        return com.google.common.util.concurrent.k.c(hi.c.f84783a);
    }

    private final qv v(k41 k41Var, String str, hi.c cVar, d20 d20Var) {
        m40 m40VarA = rq0.a(k41Var == k41.PLACES_UI_KIT ? this.f32113c.b(w((d20) zj.p.q(d20Var)), str) : this.f32113c.a(this.f32123m.c(), str));
        m40 m40VarA2 = rv0.a(cVar.b());
        ak.n0 n0VarE = ak.n0.E(kv0.SOLUTION_ID);
        gq gqVarJ = sq.J();
        Iterator<E> it = n0VarE.iterator();
        while (it.hasNext()) {
            if (((kv0) it.next()).ordinal() != 0) {
                throw new oq.p();
            }
            new x10(gqVarJ.A());
            gqVarJ.D(hv0.a());
        }
        qv qvVar = this.f32111a;
        sq sqVar = (sq) gqVarJ.H0();
        a80 a80Var = new a80();
        a80Var.c(w70.c("x-goog-gmp-client-signals", a80.f31574d), Base64.getEncoder().encodeToString(sqVar.i()));
        return (qv) qvVar.d(m40VarA, m40VarA2, rq0.a(a80Var), this.f32121k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String w(d20 d20Var) {
        return d20Var == d20.PLACE_AUTOCOMPLETE ? (String) this.f32120j.b(d20Var).get() : (String) this.f32120j.a(d20Var).get();
    }

    public final vh.l a(final ji.p pVar, final k41 k41Var) {
        List<ii.l0.d> listI = pVar.i();
        if (listI.isEmpty()) {
            return vh.o.e(new hg.b(new Status(9012, "Place fields must not be empty.")));
        }
        if (pVar.o().isEmpty()) {
            return vh.o.e(new hg.b(new Status(9012, "Text query must not be an empty string.")));
        }
        String strD = pVar.d();
        if (strD != null && strD.isEmpty()) {
            return vh.o.e(new hg.b(new Status(9012, "Included type must not be an empty string.")));
        }
        String strL = pVar.l();
        if (strL != null && strL.isEmpty()) {
            return vh.o.e(new hg.b(new Status(9012, "Region code must not be an empty string.")));
        }
        final long jZzb = this.f32115e.zzb();
        ArrayList arrayList = new ArrayList();
        if (pVar.r()) {
            arrayList.add(xx0.ROUTING_SUMMARIES);
        }
        if (pVar.s()) {
            arrayList.add(xx0.SEARCH_URI);
        }
        arrayList.add(xx0.NEXT_PAGE_TOKEN);
        final String strA = yx0.a(qz0.a(listI), arrayList);
        final com.google.common.util.concurrent.q qVarU = u();
        final com.google.common.util.concurrent.q qVarE = com.google.common.util.concurrent.k.e(qVarU, new com.google.common.util.concurrent.d() { // from class: com.google.android.libraries.places.internal.cz0
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ com.google.common.util.concurrent.q apply(Object obj) {
                return this.f31945a.h(k41Var, strA, pVar, (hi.c) obj);
            }
        }, com.google.common.util.concurrent.u.a());
        vh.a aVarA = pVar.a();
        if (aVarA != null) {
            aVarA.b(new vh.i() { // from class: com.google.android.libraries.places.internal.ty0
                @Override // vh.i
                public final /* synthetic */ void b() {
                    qVarE.cancel(true);
                }
            });
        }
        return gv0.a(qVarE).s(new vh.k() { // from class: com.google.android.libraries.places.internal.iy0
            @Override // vh.k
            public final /* synthetic */ vh.l a(Object obj) {
                return this.f32620a.i(pVar, (dx) obj);
            }
        }).k(new vh.c() { // from class: com.google.android.libraries.places.internal.sy0
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                this.f33728a.j(pVar, jZzb, k41Var, qVarU, lVar);
                return lVar;
            }
        });
    }

    public final vh.l b(final ji.g gVar, final k41 k41Var) {
        String strI = gVar.i();
        if (strI != null && strI.isEmpty()) {
            return vh.o.e(new hg.b(new Status(9012, "Region code must not be an empty string.")));
        }
        String strH = gVar.h();
        if (strH == null) {
            return vh.o.e(new hg.b(new Status(9012, "Query must not be null.")));
        }
        if (TextUtils.isEmpty(strH.trim())) {
            return vh.o.f(ji.h.b(ak.n0.C()));
        }
        final long jZzb = this.f32115e.zzb();
        final com.google.common.util.concurrent.q qVarU = u();
        final com.google.common.util.concurrent.q qVarE = com.google.common.util.concurrent.k.e(qVarU, new com.google.common.util.concurrent.d() { // from class: com.google.android.libraries.places.internal.uy0
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ com.google.common.util.concurrent.q apply(Object obj) {
                return this.f33992a.k(k41Var, gVar, (hi.c) obj);
            }
        }, com.google.common.util.concurrent.u.a());
        vh.a aVarA = gVar.a();
        if (aVarA != null) {
            aVarA.b(new vh.i() { // from class: com.google.android.libraries.places.internal.xy0
                @Override // vh.i
                public final /* synthetic */ void b() {
                    qVarE.cancel(true);
                }
            });
        }
        return gv0.a(qVarE).s(new vh.k(this) { // from class: com.google.android.libraries.places.internal.vy0
            @Override // vh.k
            public final /* synthetic */ vh.l a(Object obj) {
                vh.m mVar = new vh.m();
                ArrayList arrayList = new ArrayList();
                for (ur urVar : ((vr) obj).I()) {
                    nr nrVarJ = urVar.J();
                    if (!urVar.I()) {
                        throw new IllegalArgumentException("Suggestion does not contain a PlacePrediction.");
                    }
                    ii.h.a aVarA2 = ii.h.a(nrVarJ.I());
                    aVarA2.b(nrVarJ.M() == 0 ? null : Integer.valueOf(nrVarJ.M()));
                    aVarA2.f(ak.n0.v(nrVarJ.L()));
                    aVarA2.c(nrVarJ.J().I());
                    aVarA2.h(n01.a(nrVarJ.J().J()));
                    aVarA2.d(nrVarJ.K().I().I());
                    aVarA2.i(n01.a(nrVarJ.K().I().J()));
                    aVarA2.e(nrVarJ.K().J().I());
                    aVarA2.j(n01.a(nrVarJ.K().J().J()));
                    arrayList.add(aVarA2.a());
                }
                mVar.c(ji.h.b(arrayList));
                return mVar.a();
            }
        }).k(new vh.c() { // from class: com.google.android.libraries.places.internal.wy0
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                this.f34215a.l(jZzb, k41Var, qVarU, lVar);
                return lVar;
            }
        });
    }

    public final vh.l c(final ji.c cVar, final k41 k41Var) {
        if (cVar.d().isEmpty()) {
            return vh.o.e(new hg.b(new Status(9012, "Place id must not be an empty string.")));
        }
        List<ii.l0.d> listC = cVar.c();
        if (listC.isEmpty()) {
            return vh.o.e(new hg.b(new Status(9012, "Place fields must not be empty.")));
        }
        String strE = cVar.e();
        if (strE != null && strE.isEmpty()) {
            return vh.o.e(new hg.b(new Status(9012, "Region code must not be an empty string.")));
        }
        final long jZzb = this.f32115e.zzb();
        final String strB = yx0.b(qz0.a(listC));
        final com.google.common.util.concurrent.q qVarU = u();
        final com.google.common.util.concurrent.q qVarE = com.google.common.util.concurrent.k.e(qVarU, new com.google.common.util.concurrent.d() { // from class: com.google.android.libraries.places.internal.yy0
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ com.google.common.util.concurrent.q apply(Object obj) {
                return this.f34447a.m(k41Var, strB, cVar, (hi.c) obj);
            }
        }, com.google.common.util.concurrent.u.a());
        vh.a aVarA = cVar.a();
        if (aVarA != null) {
            aVarA.b(new vh.i() { // from class: com.google.android.libraries.places.internal.jy0
                @Override // vh.i
                public final /* synthetic */ void b() {
                    qVarE.cancel(true);
                }
            });
        }
        return gv0.a(qVarE).s(new vh.k() { // from class: com.google.android.libraries.places.internal.zy0
            @Override // vh.k
            public final /* synthetic */ vh.l a(Object obj) {
                return this.f34577a.n((ov) obj);
            }
        }).k(new vh.c() { // from class: com.google.android.libraries.places.internal.bz0
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                this.f31828a.o(jZzb, k41Var, qVarU, lVar);
                return lVar;
            }
        });
    }

    public final vh.l d(final ji.e eVar, final k41 k41Var) {
        if (k41Var == k41.PLACES_UI_KIT && this.f32120j.f31840g == null) {
            return vh.o.e(new hg.b(new Status(9012, "Get Photo Media for Places UI Kit but widget type is null")));
        }
        final long jZzb = this.f32115e.zzb();
        final com.google.common.util.concurrent.q qVarU = u();
        final com.google.common.util.concurrent.q qVarE = com.google.common.util.concurrent.k.e(qVarU, new com.google.common.util.concurrent.d() { // from class: com.google.android.libraries.places.internal.ky0
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ com.google.common.util.concurrent.q apply(Object obj) {
                return this.f32772a.p(k41Var, eVar, (hi.c) obj);
            }
        }, com.google.common.util.concurrent.u.a());
        vh.a aVarA = eVar.a();
        if (aVarA != null) {
            aVarA.b(new vh.i() { // from class: com.google.android.libraries.places.internal.ny0
                @Override // vh.i
                public final /* synthetic */ void b() {
                    qVarE.cancel(true);
                }
            });
        }
        return gv0.a(qVarE).s(ly0.f32888a).k(new vh.c() { // from class: com.google.android.libraries.places.internal.my0
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                this.f33000a.q(jZzb, k41Var, qVarU, lVar);
                return lVar;
            }
        });
    }

    public final vh.l e(final ji.r rVar, final k41 k41Var) {
        List<ii.l0.d> listI = rVar.i();
        if (listI.isEmpty()) {
            return vh.o.e(new hg.b(new Status(9012, "Place fields must not be empty.")));
        }
        String strK = rVar.k();
        if (strK != null && strK.isEmpty()) {
            return vh.o.e(new hg.b(new Status(9012, "Region code must not be an empty string.")));
        }
        final long jZzb = this.f32115e.zzb();
        ArrayList arrayList = new ArrayList();
        if (rVar.m()) {
            arrayList.add(xx0.ROUTING_SUMMARIES);
        }
        final String strA = yx0.a(qz0.a(listI), arrayList);
        final com.google.common.util.concurrent.q qVarU = u();
        final com.google.common.util.concurrent.q qVarE = com.google.common.util.concurrent.k.e(qVarU, new com.google.common.util.concurrent.d() { // from class: com.google.android.libraries.places.internal.oy0
            @Override // com.google.common.util.concurrent.d
            public final /* synthetic */ com.google.common.util.concurrent.q apply(Object obj) {
                return this.f33242a.r(k41Var, strA, rVar, (hi.c) obj);
            }
        }, com.google.common.util.concurrent.u.a());
        vh.a aVarA = rVar.a();
        if (aVarA != null) {
            aVarA.b(new vh.i() { // from class: com.google.android.libraries.places.internal.ry0
                @Override // vh.i
                public final /* synthetic */ void b() {
                    qVarE.cancel(true);
                }
            });
        }
        return gv0.a(qVarE).s(new vh.k() { // from class: com.google.android.libraries.places.internal.py0
            @Override // vh.k
            public final /* synthetic */ vh.l a(Object obj) {
                return this.f33368a.s(rVar, (rw) obj);
            }
        }).k(new vh.c() { // from class: com.google.android.libraries.places.internal.qy0
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                this.f33466a.t(rVar, jZzb, k41Var, qVarU, lVar);
                return lVar;
            }
        });
    }

    public final void f() {
        this.f32112b.i();
        uz0 uz0Var = this.f32119i;
        uz0Var.f34002d.shutdownNow();
        uz0Var.f33999a.i();
        this.f32120j.c();
        this.f32122l.a();
    }

    public final void g() {
        this.f32119i.b();
    }

    final /* synthetic */ com.google.common.util.concurrent.q h(k41 k41Var, String str, ji.p pVar, hi.c cVar) {
        int i15;
        qv qvVarV = v(k41Var, str, cVar, d20.PLACE_LIST);
        Locale localeD = this.f32123m.d();
        sw swVarI = bx.I();
        String strD = pVar.d();
        if (strD != null) {
            swVarI.G(strD);
        }
        ii.c0 c0VarE = pVar.e();
        if (c0VarE != null) {
            boolean z15 = c0VarE instanceof ii.q0;
            zj.p.e(z15 || (c0VarE instanceof ii.j), "LocationBias must be of type RectangularBounds or CircularBounds.");
            vw vwVarI = ww.I();
            if (z15) {
                vwVarI.A(ux0.c((ii.q0) c0VarE));
            } else {
                vwVarI.D(ux0.b((ii.j) c0VarE));
            }
            swVarI.P((ww) vwVarI.H0());
        }
        ii.d0 d0VarF = pVar.f();
        if (d0VarF != null) {
            zj.p.e(d0VarF instanceof ii.q0, "LocationRestriction must be of type RectangularBounds.");
            xw xwVarI = yw.I();
            xwVarI.A(ux0.c((ii.q0) d0VarF));
            swVarI.Q((yw) xwVarI.H0());
        }
        Integer numG = pVar.g();
        if (numG != null) {
            swVarI.J(numG.intValue());
        }
        Double dH = pVar.h();
        if (dH != null) {
            swVarI.I(dH.doubleValue());
        }
        swVarI.H(pVar.p());
        List<Integer> listJ = pVar.j();
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = listJ.iterator();
        while (true) {
            i15 = 4;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = it.next().intValue();
            if (iIntValue == 0) {
                arrayList.add(uv.PRICE_LEVEL_FREE);
            } else if (iIntValue == 1) {
                arrayList.add(uv.PRICE_LEVEL_INEXPENSIVE);
            } else if (iIntValue == 2) {
                arrayList.add(uv.PRICE_LEVEL_MODERATE);
            } else if (iIntValue == 3) {
                arrayList.add(uv.PRICE_LEVEL_EXPENSIVE);
            } else if (iIntValue == 4) {
                arrayList.add(uv.PRICE_LEVEL_VERY_EXPENSIVE);
            }
        }
        swVarI.N(arrayList);
        ji.p.b bVarK = pVar.k();
        if (bVarK == null) {
            i15 = 2;
        } else {
            ii.r rVar = ii.r.EV_CONNECTOR_TYPE_UNSPECIFIED;
            if (bVarK.ordinal() == 0) {
                i15 = 3;
            }
        }
        swVarI.S(i15);
        String strL = pVar.l();
        if (strL != null) {
            swVarI.F(strL);
        }
        swVarI.O(pVar.t());
        swVarI.A(pVar.o());
        swVarI.D(localeD.toLanguageTag());
        pVar.c();
        pVar.n();
        pVar.m();
        if (pVar.q()) {
            swVarI.R(true);
        }
        String strU = pVar.u();
        if (strU != null) {
            swVarI.K(strU);
        }
        return oq0.a(qvVarV.b().b(rv.b(), qvVarV.c()), (bx) swVarI.H0());
    }

    final /* synthetic */ vh.l i(ji.p pVar, dx dxVar) {
        vh.m mVar = new vh.m();
        List listI = dxVar.I();
        List listJ = dxVar.J();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strK = dxVar.K();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f32118h.a((ov) it.next()));
        }
        Iterator it4 = listJ.iterator();
        while (it4.hasNext()) {
            arrayList2.add(g01.a((jw) it4.next()));
        }
        String strL = dxVar.L();
        ji.q.a aVarA = ji.q.a(arrayList);
        if (true != pVar.r()) {
            arrayList2 = null;
        }
        aVarA.g(arrayList2);
        if (true == strK.isEmpty()) {
            strK = null;
        }
        aVarA.i(strK);
        aVarA.j(pVar.v());
        aVarA.h(strL.isEmpty() ? null : Uri.parse(strL));
        mVar.c(aVarA.b());
        return mVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ vh.l j(ji.p pVar, long j15, k41 k41Var, com.google.common.util.concurrent.q qVar, vh.l lVar) {
        if (!lVar.o()) {
            this.f32114d.h(pVar, lVar, j15, this.f32115e.zzb(), k41Var, (hi.c) qVar.get());
        }
        return lVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.q k(k41 k41Var, ji.g gVar, hi.c cVar) {
        qv qvVarV = v(k41Var, "", cVar, d20.PLACE_AUTOCOMPLETE);
        Locale localeD = this.f32123m.d();
        cr crVarI = hr.I();
        crVarI.A((String) zj.p.q(gVar.h()));
        crVarI.I(localeD.toLanguageTag());
        Integer numD = gVar.d();
        if (numD != null) {
            crVarI.N(numD.intValue());
        }
        String strI = gVar.i();
        if (strI != null) {
            crVarI.J(strI);
        }
        ii.c0 c0VarE = gVar.e();
        if (c0VarE != null) {
            boolean z15 = c0VarE instanceof ii.j;
            zj.p.d(z15 || (c0VarE instanceof ii.q0));
            dr drVarI = er.I();
            if (z15) {
                drVarI.D(ux0.b((ii.j) c0VarE));
            }
            if (c0VarE instanceof ii.q0) {
                drVarI.A(ux0.c((ii.q0) c0VarE));
            }
            crVarI.D((er) drVarI.H0());
        }
        ii.d0 d0VarF = gVar.f();
        if (d0VarF != null) {
            boolean z16 = d0VarF instanceof ii.j;
            zj.p.d(z16 || (d0VarF instanceof ii.q0));
            fr frVarI = gr.I();
            if (z16) {
                frVarI.D(ux0.b((ii.j) d0VarF));
            }
            if (d0VarF instanceof ii.q0) {
                frVarI.A(ux0.c((ii.q0) d0VarF));
            }
            crVarI.F((gr) frVarI.H0());
        }
        LatLng latLngG = gVar.g();
        if (latLngG != null) {
            crVarI.K(ux0.a(latLngG));
        }
        Iterator<String> it = gVar.c().iterator();
        while (it.hasNext()) {
            crVarI.H(it.next());
        }
        ii.i iVarJ = gVar.j();
        if (iVarJ != null) {
            crVarI.O(iVarJ.toString());
        }
        Iterator<String> it4 = gVar.k().iterator();
        while (it4.hasNext()) {
            crVarI.G(it4.next());
        }
        if (gVar.l()) {
            crVarI.P(true);
        }
        return oq0.a(qvVarV.b().b(rv.e(), qvVarV.c()), (hr) crVarI.H0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ vh.l l(long j15, k41 k41Var, com.google.common.util.concurrent.q qVar, vh.l lVar) {
        if (lVar.o()) {
            return lVar;
        }
        this.f32114d.b(lVar, j15, this.f32115e.zzb(), 3, k41Var, (hi.c) qVar.get());
        return lVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.q m(k41 k41Var, String str, ji.c cVar, hi.c cVar2) {
        qv qvVarV = v(k41Var, str, cVar2, d20.PLACE_DETAILS);
        Locale localeD = this.f32123m.d();
        jt jtVarI = kt.I();
        jtVarI.A("places/".concat(String.valueOf(cVar.d())));
        String strE = cVar.e();
        if (strE != null) {
            jtVarI.F(strE);
        }
        ii.i iVarF = cVar.f();
        if (iVarF != null) {
            jtVarI.G(iVarF.toString());
        }
        jtVarI.D(localeD.toLanguageTag());
        return oq0.a(qvVarV.b().b(rv.d(), qvVarV.c()), (kt) jtVarI.H0());
    }

    final /* synthetic */ vh.l n(ov ovVar) {
        vh.m mVar = new vh.m();
        mVar.c(ji.d.b(this.f32118h.a(ovVar)));
        return mVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ vh.l o(long j15, k41 k41Var, com.google.common.util.concurrent.q qVar, vh.l lVar) {
        if (lVar.o()) {
            return lVar;
        }
        this.f32114d.e(lVar, j15, this.f32115e.zzb(), 3, k41Var, (hi.c) qVar.get());
        return lVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.q p(k41 k41Var, ji.e eVar, hi.c cVar) {
        qv qvVarV = v(k41Var, "", cVar, this.f32120j.f31840g);
        gt gtVarI = ht.I();
        gtVarI.A(String.valueOf((String) zj.p.q(eVar.e().i())).concat("/media"));
        Integer numC = eVar.c();
        if (numC != null) {
            gtVarI.F(numC.intValue());
        }
        Integer numD = eVar.d();
        if (numD != null) {
            gtVarI.D(numD.intValue());
        }
        gtVarI.G(true);
        return oq0.a(qvVarV.b().b(rv.c(), qvVarV.c()), (ht) gtVarI.H0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ vh.l q(long j15, k41 k41Var, com.google.common.util.concurrent.q qVar, vh.l lVar) {
        if (lVar.o()) {
            return lVar;
        }
        this.f32114d.f(lVar, j15, this.f32115e.zzb(), k41Var, (hi.c) qVar.get());
        return lVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.q r(k41 k41Var, String str, ji.r rVar, hi.c cVar) {
        int i15;
        qv qvVarV = v(k41Var, str, cVar, d20.PLACE_LIST);
        Locale localeD = this.f32123m.d();
        kw kwVarI = pw.I();
        kwVarI.A(localeD.toLanguageTag());
        String strK = rVar.k();
        if (strK != null) {
            kwVarI.D(strK);
        }
        List<String> listF = rVar.f();
        if (listF != null) {
            kwVarI.F(listF);
        }
        List<String> listD = rVar.d();
        if (listD != null) {
            kwVarI.G(listD);
        }
        List<String> listE = rVar.e();
        if (listE != null) {
            kwVarI.H(listE);
        }
        List<String> listC = rVar.c();
        if (listC != null) {
            kwVarI.I(listC);
        }
        Integer numH = rVar.h();
        if (numH != null) {
            kwVarI.J(numH.intValue());
        }
        rVar.l();
        nw nwVarI = ow.I();
        nwVarI.A(ux0.b((ii.j) rVar.g()));
        kwVarI.K((ow) nwVarI.H0());
        ji.r.b bVarJ = rVar.j();
        if (bVarJ == null) {
            i15 = 2;
        } else {
            i15 = bVarJ.ordinal() != 0 ? 4 : 3;
        }
        kwVarI.N(i15);
        return oq0.a(qvVarV.b().b(rv.a(), qvVarV.c()), (pw) kwVarI.H0());
    }

    final /* synthetic */ vh.l s(ji.r rVar, rw rwVar) {
        vh.m mVar = new vh.m();
        List listI = rwVar.I();
        List listJ = rwVar.J();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f32118h.a((ov) it.next()));
        }
        Iterator it4 = listJ.iterator();
        while (it4.hasNext()) {
            arrayList2.add(g01.a((jw) it4.next()));
        }
        ji.s.a aVarA = ji.s.a(arrayList);
        if (true != rVar.m()) {
            arrayList2 = null;
        }
        aVarA.f(arrayList2);
        mVar.c(aVarA.b());
        return mVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ vh.l t(ji.r rVar, long j15, k41 k41Var, com.google.common.util.concurrent.q qVar, vh.l lVar) {
        if (!lVar.o()) {
            this.f32114d.i(rVar, lVar, j15, this.f32115e.zzb(), k41Var, (hi.c) qVar.get());
        }
        return lVar;
    }
}
