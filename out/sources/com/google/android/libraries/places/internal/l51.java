package com.google.android.libraries.places.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class l51 implements f51 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ak.n0 f32786g = ak.n0.F(ii.l0.d.ID, ii.l0.d.TYPES);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f32787h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ji.n f32788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y41 f32789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ii.i f32790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k41 f32791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i51 f32792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j51 f32793f;

    public l51(ji.n nVar, y41 y41Var, ii.i iVar, k41 k41Var) {
        this.f32788a = nVar;
        this.f32789b = y41Var;
        this.f32790c = iVar;
        this.f32791d = k41Var;
    }

    @Override // com.google.android.libraries.places.internal.f51
    public final void a() {
        i51 i51Var = this.f32792e;
        if (i51Var != null) {
            i51Var.a().a();
        }
        j51 j51Var = this.f32793f;
        if (j51Var != null) {
            j51Var.a().a();
        }
        this.f32792e = null;
        this.f32793f = null;
    }

    @Override // com.google.android.libraries.places.internal.f51
    public final vh.l b(String str, int i15) {
        zj.p.d(!TextUtils.isEmpty(str));
        i51 i51Var = this.f32792e;
        if (i51Var != null) {
            if (i51Var.d().equals(str)) {
                return (vh.l) zj.p.q(i51Var.b());
            }
            i51Var.a().a();
        }
        final d51 d51Var = new d51(new vh.b(), str);
        this.f32792e = d51Var;
        ji.n nVar = this.f32788a;
        ji.g.a aVarB = ji.g.b();
        aVarB.k(str);
        y41 y41Var = this.f32789b;
        aVarB.g(y41Var.h());
        aVarB.h(y41Var.i());
        aVarB.e(y41Var.j());
        aVarB.l(y41Var.n());
        aVarB.f(Integer.valueOf(i15));
        aVarB.n(y41Var.k());
        aVarB.m(this.f32790c);
        aVarB.d(d51Var.a().b());
        aVarB.i(y41Var.e());
        aVarB.j(y41Var.p());
        vh.l lVarK = nVar.b(aVarB.a(), this.f32791d).k(new vh.c() { // from class: com.google.android.libraries.places.internal.h51
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                int i16 = l51.f32787h;
                return d51Var.a().b().a() ? vh.o.d() : lVar;
            }
        });
        d51Var.c(lVarK);
        return lVarK;
    }

    @Override // com.google.android.libraries.places.internal.f51
    public final void c() {
        this.f32788a.k();
    }

    @Override // com.google.android.libraries.places.internal.f51
    public final void d() {
        this.f32788a.h();
    }

    @Override // com.google.android.libraries.places.internal.f51
    public final vh.l e(ii.h hVar) {
        ak.n0 n0Var = f32786g;
        y41 y41Var = this.f32789b;
        if (n0Var.containsAll(y41Var.c())) {
            ii.l0.b bVarA = ii.l0.a();
            bVarA.F(hVar.c());
            bVarA.R(hVar.f().isEmpty() ? null : hVar.f());
            return vh.o.f(ji.d.b(bVarA.a()));
        }
        j51 j51Var = this.f32793f;
        if (j51Var != null) {
            if (j51Var.d().equals(hVar.c())) {
                return (vh.l) zj.p.q(j51Var.b());
            }
            j51Var.a().a();
        }
        final e51 e51Var = new e51(new vh.b(), hVar.c());
        this.f32793f = e51Var;
        ji.n nVar = this.f32788a;
        ji.c.a aVarB = ji.c.b(hVar.c(), y41Var.c());
        aVarB.c(this.f32790c);
        aVarB.b(e51Var.a().b());
        vh.l lVarK = nVar.e(aVarB.a(), k41.AUTOCOMPLETE_WIDGET).k(new vh.c() { // from class: com.google.android.libraries.places.internal.g51
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                int i15 = l51.f32787h;
                return e51Var.a().b().a() ? vh.o.d() : lVar;
            }
        });
        e51Var.c(lVarK);
        return lVarK;
    }

    @Override // com.google.android.libraries.places.internal.f51
    public final k41 f() {
        return this.f32791d;
    }
}
