package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class qx0 implements ji.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q01 f33454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fw0 f33455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kw0 f33456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a41 f33457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xu0 f33458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dz0 f33459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final tv0 f33460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b41 f33461h;

    qx0(b41 b41Var, q01 q01Var, fw0 fw0Var, kw0 kw0Var, a41 a41Var, xu0 xu0Var, dz0 dz0Var, tv0 tv0Var) {
        this.f33461h = b41Var;
        this.f33454a = q01Var;
        this.f33455b = fw0Var;
        this.f33456c = kw0Var;
        this.f33457d = a41Var;
        this.f33458e = xu0Var;
        this.f33459f = dz0Var;
        this.f33460g = tv0Var;
        tv0Var.zza();
    }

    private static void t(cw0 cw0Var, dw0 dw0Var) {
        cw0.b(cw0Var, cw0.a("Duration"));
        dv0.a();
        dv0.a();
        cw0.b(cw0Var, cw0.a("Battery"));
        dv0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static vh.l u(vh.l lVar) {
        hg.b bVarB;
        Exception excL = lVar.l();
        if (excL == null) {
            return lVar;
        }
        if (excL instanceof hg.b) {
            bVarB = (hg.b) excL;
        } else if (excL instanceof p90) {
            bVarB = ow0.b((p90) excL);
        } else {
            bVarB = ((excL instanceof ExecutionException) && (excL.getCause() instanceof p90)) ? ow0.b((p90) excL.getCause()) : new hg.b(new Status(13, excL.toString()));
        }
        return vh.o.e(bVarB);
    }

    final /* synthetic */ ji.f B(ji.e eVar, k41 k41Var, dw0 dw0Var, vh.l lVar) {
        this.f33457d.g(eVar, k41Var);
        t(cw0.a("GetPhotoMedia"), dw0Var);
        return (ji.f) lVar.m();
    }

    final /* synthetic */ ji.d D(ji.c cVar, k41 k41Var, dw0 dw0Var, vh.l lVar) {
        this.f33457d.o(cVar, 2, k41Var);
        t(cw0.a("FetchPlace"), dw0Var);
        return (ji.d) lVar.m();
    }

    final /* synthetic */ ji.d F(ji.c cVar, k41 k41Var, dw0 dw0Var, vh.l lVar) {
        this.f33457d.o(cVar, 3, k41Var);
        t(cw0.a("GetPlace"), dw0Var);
        return (ji.d) lVar.m();
    }

    final /* synthetic */ vh.l H(ji.i iVar, String str, k41 k41Var, Location location) {
        zj.p.r(location, "Location must not be null.");
        return this.f33454a.e(iVar, location, this.f33456c.a(null), k41Var);
    }

    final /* synthetic */ ji.j I(ji.i iVar, long j15, k41 k41Var, dw0 dw0Var, vh.l lVar) {
        this.f33457d.j(iVar, lVar, j15, this.f33458e.zzb(), k41Var);
        t(cw0.a("FindCurrentPlace"), dw0Var);
        return (ji.j) lVar.m();
    }

    @Override // ji.n
    public final vh.l a(final ji.r rVar, final k41 k41Var) {
        try {
            zj.p.r(rVar, "Request must not be null.");
            dv0.a();
            final dw0 dw0VarA = dw0.a();
            return this.f33459f.e(rVar, k41Var).i(new vh.c() { // from class: com.google.android.libraries.places.internal.fx0
                @Override // vh.c
                public final /* synthetic */ Object a(vh.l lVar) {
                    return this.f32349a.r(rVar, k41Var, dw0VarA, lVar);
                }
            }).k(gx0.f32419a);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // ji.n
    public final vh.l b(final ji.g gVar, final k41 k41Var) throws Throwable {
        try {
            zj.p.r(gVar, "Request must not be null.");
            dv0.a();
            final dw0 dw0VarA = dw0.a();
            if (!k41Var.equals(k41.PLACES_UI_KIT) && !k41Var.equals(k41.ONE_PLATFORM_AUTOCOMPLETE_WIDGET) && (!this.f33461h.e() || k41Var.equals(k41.AUTOCOMPLETE_WIDGET))) {
                return this.f33454a.b(gVar, k41Var).i(new vh.c() { // from class: com.google.android.libraries.places.internal.px0
                    @Override // vh.c
                    public final /* synthetic */ Object a(vh.l lVar) {
                        return this.f33364a.v(gVar, k41Var, dw0VarA, lVar);
                    }
                }).k(qw0.f33453a);
            }
            return this.f33459f.b(gVar, k41Var).i(new vh.c() { // from class: com.google.android.libraries.places.internal.cx0
                @Override // vh.c
                public final /* synthetic */ Object a(vh.l lVar) {
                    return this.f31936a.x(gVar, k41Var, dw0VarA, lVar);
                }
            }).k(hx0.f32516a);
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }

    @Override // ji.n
    public final vh.l c(final ji.a aVar, final k41 k41Var) {
        try {
            zj.p.r(aVar, "Request must not be null.");
            dv0.a();
            final dw0 dw0VarA = dw0.a();
            return this.f33454a.c(aVar, k41Var).i(new vh.c() { // from class: com.google.android.libraries.places.internal.ix0
                @Override // vh.c
                public final /* synthetic */ Object a(vh.l lVar) {
                    return this.f32615a.z(aVar, k41Var, dw0VarA, lVar);
                }
            }).k(jx0.f32678a);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // ji.n
    public final vh.l d(final ji.p pVar, final k41 k41Var) {
        try {
            zj.p.r(pVar, "Request must not be null.");
            dv0.a();
            final dw0 dw0VarA = dw0.a();
            return this.f33459f.a(pVar, k41Var).i(new vh.c() { // from class: com.google.android.libraries.places.internal.dx0
                @Override // vh.c
                public final /* synthetic */ Object a(vh.l lVar) {
                    return this.f32103a.p(pVar, k41Var, dw0VarA, lVar);
                }
            }).k(ex0.f32238a);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // ji.n
    public final vh.l e(final ji.c cVar, final k41 k41Var) throws Throwable {
        try {
            zj.p.r(cVar, "Request must not be null.");
            dv0.a();
            final dw0 dw0VarA = dw0.a();
            return (!this.f33461h.e() || k41Var.equals(k41.AUTOCOMPLETE_WIDGET)) ? this.f33454a.d(cVar, k41Var).i(new vh.c() { // from class: com.google.android.libraries.places.internal.mx0
                @Override // vh.c
                public final /* synthetic */ Object a(vh.l lVar) {
                    return this.f32996a.D(cVar, k41Var, dw0VarA, lVar);
                }
            }).k(nx0.f33101a) : this.f33459f.c(cVar, k41Var).i(new vh.c() { // from class: com.google.android.libraries.places.internal.ox0
                @Override // vh.c
                public final /* synthetic */ Object a(vh.l lVar) {
                    return this.f33237a.F(cVar, k41Var, dw0VarA, lVar);
                }
            }).k(rw0.f33602a);
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }

    @Override // ji.n
    public final vh.l f(ji.k kVar, final k41 k41Var) throws Throwable {
        List arrayList;
        try {
            zj.p.r(kVar, "Request must not be null.");
            final ii.l0 l0VarF = kVar.f();
            String strG = kVar.g();
            final long jH = kVar.h();
            final vh.m mVar = new vh.m();
            if (l0VarF == null) {
                int i15 = ii.c7.f92393c;
                arrayList = Arrays.asList(ii.l0.d.BUSINESS_STATUS, ii.l0.d.CURRENT_OPENING_HOURS, ii.l0.d.OPENING_HOURS, ii.l0.d.UTC_OFFSET);
            } else {
                int i16 = ii.c7.f92393c;
                arrayList = new ArrayList();
                ii.l0.c cVarH = l0VarF.h();
                if (cVarH == null || cVarH == ii.l0.c.OPERATIONAL) {
                    if (cVarH == null) {
                        arrayList.add(ii.l0.d.BUSINESS_STATUS);
                    }
                    if (l0VarF.l() == null) {
                        arrayList.add(ii.l0.d.CURRENT_OPENING_HOURS);
                    }
                    if (l0VarF.M() == null) {
                        arrayList.add(ii.l0.d.OPENING_HOURS);
                    }
                    if (l0VarF.w0() == null) {
                        arrayList.add(ii.l0.d.UTC_OFFSET);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                mVar.c(ji.l.b(ii.c7.a((ii.l0) zj.p.q(l0VarF), jH)));
                return mVar.a();
            }
            if (l0VarF != null) {
                strG = l0VarF.F();
            }
            ji.c.a aVarB = ji.c.b((String) zj.p.q(strG), arrayList);
            aVarB.b(kVar.a());
            final ji.c cVarA = aVarB.a();
            dv0.a();
            final dw0 dw0VarA = dw0.a();
            return this.f33461h.e() ? this.f33459f.c(cVarA, k41Var).i(new vh.c() { // from class: com.google.android.libraries.places.internal.yw0
                @Override // vh.c
                public final /* synthetic */ Object a(vh.l lVar) {
                    return this.f34437a.n(cVarA, k41Var, dw0VarA, lVar);
                }
            }).s(new vh.k() { // from class: com.google.android.libraries.places.internal.zw0
                @Override // vh.k
                public final /* synthetic */ vh.l a(Object obj) {
                    ii.l0 l0VarA = ((ji.d) obj).a();
                    ii.l0.c cVarH2 = l0VarA.h();
                    ii.g0 g0VarL = l0VarA.l();
                    ii.g0 g0VarM = l0VarA.M();
                    Integer numW0 = l0VarA.w0();
                    ii.l0 l0Var = l0VarF;
                    if (l0Var != null) {
                        if (numW0 == null) {
                            numW0 = l0Var.w0();
                        }
                        if (cVarH2 == null) {
                            cVarH2 = l0Var.h();
                        }
                        if (g0VarL == null) {
                            g0VarL = l0Var.l();
                        }
                        if (g0VarM == null) {
                            g0VarM = l0Var.M();
                        }
                    }
                    vh.m mVar2 = mVar;
                    long j15 = jH;
                    ii.l0.b bVarA = ii.l0.a();
                    bVarA.h(cVarH2);
                    bVarA.l(g0VarL);
                    bVarA.M(g0VarM);
                    bVarA.w0(numW0);
                    mVar2.c(ji.l.b(ii.c7.a(bVarA.a(), j15)));
                    return mVar2.a();
                }
            }).k(ax0.f31718a) : this.f33454a.d(cVarA, k41Var).i(new vh.c() { // from class: com.google.android.libraries.places.internal.vw0
                @Override // vh.c
                public final /* synthetic */ Object a(vh.l lVar) {
                    return this.f34089a.l(cVarA, k41Var, dw0VarA, lVar);
                }
            }).s(new vh.k() { // from class: com.google.android.libraries.places.internal.ww0
                @Override // vh.k
                public final /* synthetic */ vh.l a(Object obj) {
                    ii.l0 l0VarA = ((ji.d) obj).a();
                    ii.l0.c cVarH2 = l0VarA.h();
                    ii.g0 g0VarL = l0VarA.l();
                    ii.g0 g0VarM = l0VarA.M();
                    Integer numW0 = l0VarA.w0();
                    ii.l0 l0Var = l0VarF;
                    if (l0Var != null) {
                        if (numW0 == null) {
                            numW0 = l0Var.w0();
                        }
                        if (cVarH2 == null) {
                            cVarH2 = l0Var.h();
                        }
                        if (g0VarL == null) {
                            g0VarL = l0Var.l();
                        }
                        if (g0VarM == null) {
                            g0VarM = l0Var.M();
                        }
                    }
                    vh.m mVar2 = mVar;
                    long j15 = jH;
                    ii.l0.b bVarA = ii.l0.a();
                    bVarA.h(cVarH2);
                    bVarA.l(g0VarL);
                    bVarA.M(g0VarM);
                    bVarA.w0(numW0);
                    mVar2.c(ji.l.b(ii.c7.a(bVarA.a(), j15)));
                    return mVar2.a();
                }
            }).k(xw0.f34314a);
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }

    @Override // ji.n
    public final vh.l g(final ji.i iVar, String str, final k41 k41Var) {
        try {
            zj.p.r(iVar, "Request must not be null.");
            final long jZzb = this.f33458e.zzb();
            dv0.a();
            final dw0 dw0VarA = dw0.a();
            final String str2 = null;
            return this.f33455b.a(iVar.a()).s(new vh.k(iVar, str2, k41Var) { // from class: com.google.android.libraries.places.internal.sw0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final /* synthetic */ ji.i f33725b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final /* synthetic */ k41 f33726c;

                {
                    this.f33726c = k41Var;
                }

                @Override // vh.k
                public final /* synthetic */ vh.l a(Object obj) {
                    return this.f33724a.H(this.f33725b, null, this.f33726c, (Location) obj);
                }
            }).i(new vh.c() { // from class: com.google.android.libraries.places.internal.tw0
                @Override // vh.c
                public final /* synthetic */ Object a(vh.l lVar) {
                    return this.f33815a.I(iVar, jZzb, k41Var, dw0VarA, lVar);
                }
            }).k(uw0.f33983a);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // ji.n
    public final void h() {
        this.f33459f.g();
    }

    @Override // ji.n
    public final vh.l i(final ji.e eVar, final k41 k41Var) {
        try {
            zj.p.r(eVar, "Request must not be null.");
            dv0.a();
            final dw0 dw0VarA = dw0.a();
            return this.f33459f.d(eVar, k41Var).i(new vh.c() { // from class: com.google.android.libraries.places.internal.kx0
                @Override // vh.c
                public final /* synthetic */ Object a(vh.l lVar) {
                    return this.f32766a.B(eVar, k41Var, dw0VarA, lVar);
                }
            }).k(lx0.f32885a);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // ji.n
    public final void k() {
        this.f33459f.f();
        this.f33460g.zzb();
    }

    final /* synthetic */ ji.d l(ji.c cVar, k41 k41Var, dw0 dw0Var, vh.l lVar) {
        this.f33457d.n(cVar, 2, k41Var);
        t(cw0.a("IsOpenFetchPlace"), dw0Var);
        return (ji.d) lVar.m();
    }

    final /* synthetic */ ji.d n(ji.c cVar, k41 k41Var, dw0 dw0Var, vh.l lVar) {
        this.f33457d.n(cVar, 3, k41Var);
        t(cw0.a("IsOpenGetPlace"), dw0Var);
        return (ji.d) lVar.m();
    }

    final /* synthetic */ ji.q p(ji.p pVar, k41 k41Var, dw0 dw0Var, vh.l lVar) {
        this.f33457d.l(pVar, k41Var);
        t(cw0.a("SearchByText"), dw0Var);
        String strF = ((ji.q) lVar.m()).f();
        ji.q.a aVarA = ji.q.a(((ji.q) lVar.m()).c());
        aVarA.e(strF == null ? null : new pw0(this, pVar, strF, k41Var, ((ji.q) lVar.m()).g() + 1));
        aVarA.i(strF);
        aVarA.g(((ji.q) lVar.m()).d());
        aVarA.h(((ji.q) lVar.m()).e());
        return aVarA.b();
    }

    final /* synthetic */ ji.s r(ji.r rVar, k41 k41Var, dw0 dw0Var, vh.l lVar) {
        this.f33457d.a(rVar, k41Var);
        t(cw0.a("SearchNearby"), dw0Var);
        return (ji.s) lVar.m();
    }

    final /* synthetic */ ji.h v(ji.g gVar, k41 k41Var, dw0 dw0Var, vh.l lVar) {
        this.f33457d.m(gVar, 2, k41Var);
        t(cw0.a("FindAutocompletePredictions"), dw0Var);
        return (ji.h) lVar.m();
    }

    final /* synthetic */ ji.h x(ji.g gVar, k41 k41Var, dw0 dw0Var, vh.l lVar) {
        this.f33457d.m(gVar, 3, k41Var);
        t(cw0.a("FindAutocompletePredictionsOnePlatform"), dw0Var);
        return (ji.h) lVar.m();
    }

    final /* synthetic */ ji.b z(ji.a aVar, k41 k41Var, dw0 dw0Var, vh.l lVar) {
        this.f33457d.k(aVar, k41Var);
        t(cw0.a("FetchPhoto"), dw0Var);
        return (ji.b) lVar.m();
    }
}
