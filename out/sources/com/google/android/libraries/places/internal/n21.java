package com.google.android.libraries.places.internal;

import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class n21 implements q01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u41 f33019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q11 f33020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w11 f33021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a41 f33022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xu0 f33023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b11 f33024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k11 f33025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b41 f33026h;

    n21(b41 b41Var, u41 u41Var, q11 q11Var, w11 w11Var, a41 a41Var, xu0 xu0Var, x01 x01Var, b11 b11Var, g11 g11Var, k11 k11Var) {
        this.f33026h = b41Var;
        this.f33019a = u41Var;
        this.f33020b = q11Var;
        this.f33021c = w11Var;
        this.f33022d = a41Var;
        this.f33023e = xu0Var;
        this.f33024f = b11Var;
        this.f33025g = k11Var;
    }

    static final /* synthetic */ ji.d i(vh.l lVar) throws hg.b {
        a11 a11Var = (a11) lVar.m();
        int iA = f31.a(a11Var.f31554a);
        if (ji.o.b(iA)) {
            throw new hg.b(new Status(iA, f31.b(a11Var.f31554a, a11Var.f31555b)));
        }
        e31 e31Var = a11Var.f31556c;
        String[] strArr = a11Var.f31557d;
        return ji.d.b(q21.f(e31Var, strArr != null ? ak.n0.w(strArr) : null));
    }

    static final /* synthetic */ ji.j j(vh.l lVar) throws hg.b {
        j11 j11Var = (j11) lVar.m();
        int iA = f31.a(j11Var.f32629a);
        if (ji.o.b(iA)) {
            throw new hg.b(new Status(iA, f31.b(j11Var.f32629a, j11Var.f32630b)));
        }
        ArrayList arrayList = new ArrayList();
        s21[] s21VarArr = j11Var.f32632d;
        if (s21VarArr != null) {
            for (s21 s21Var : s21VarArr) {
                if (s21Var.b() == null) {
                    throw new hg.b(new Status(8, "Unexpected server error: PlaceLikelihood returned without a Place value"));
                }
                Double dA = s21Var.a();
                if (dA == null) {
                    throw new hg.b(new Status(8, "Unexpected server error: PlaceLikelihood returned without a likelihood value"));
                }
                e31 e31VarB = s21Var.b();
                String[] strArr = j11Var.f32631c;
                arrayList.add(ii.m0.c(q21.f(e31VarB, strArr != null ? ak.n0.w(strArr) : null), dA.doubleValue()));
            }
        }
        return ji.j.b(arrayList);
    }

    final /* synthetic */ ji.h a(long j15, k41 k41Var, vh.l lVar) {
        this.f33022d.b(lVar, j15, this.f33023e.zzb(), 2, k41Var, hi.c.f84783a);
        return (ji.h) lVar.m();
    }

    @Override // com.google.android.libraries.places.internal.q01
    public final vh.l b(ji.g gVar, final k41 k41Var) {
        String strH = gVar.h();
        if (strH == null || TextUtils.isEmpty(strH.trim())) {
            return vh.o.f(ji.h.b(ak.n0.C()));
        }
        b41 b41Var = this.f33026h;
        d11 d11Var = new d11(gVar, b41Var.d(), b41Var.c(), this.f33019a);
        xu0 xu0Var = this.f33023e;
        q11 q11Var = this.f33020b;
        final long jZzb = xu0Var.zzb();
        return q11Var.a(d11Var, f11.class).i(new vh.c(this) { // from class: com.google.android.libraries.places.internal.m21
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                return g11.a((f11) lVar.m());
            }
        }).i(new vh.c() { // from class: com.google.android.libraries.places.internal.e21
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                return this.f32127a.a(jZzb, k41Var, lVar);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.q01
    public final vh.l c(ji.a aVar, final k41 k41Var) {
        Integer numD = aVar.d();
        Integer numC = aVar.c();
        if (numD == null && numC == null) {
            return vh.o.e(new hg.b(new Status(9012, "Must include max width or max height in request.")));
        }
        if (numD != null && numD.intValue() <= 0) {
            return vh.o.e(new hg.b(new Status(9012, String.format("Max Width must not be < 1, but was: %d.", numD))));
        }
        if (numC != null && numC.intValue() <= 0) {
            return vh.o.e(new hg.b(new Status(9012, String.format("Max Height must not be < 1, but was: %d.", numC))));
        }
        b41 b41Var = this.f33026h;
        u01 u01Var = new u01(aVar, b41Var.c(), this.f33019a);
        xu0 xu0Var = this.f33023e;
        w11 w11Var = this.f33021c;
        final long jZzb = xu0Var.zzb();
        return w11Var.b(u01Var, new v01()).i(new vh.c(this) { // from class: com.google.android.libraries.places.internal.g21
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                return ji.b.b(((w01) lVar.m()).f34099a);
            }
        }).i(new vh.c() { // from class: com.google.android.libraries.places.internal.h21
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                return this.f32432a.f(jZzb, k41Var, lVar);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.q01
    public final vh.l d(ji.c cVar, final k41 k41Var) {
        if (TextUtils.isEmpty(cVar.d())) {
            return vh.o.e(new hg.b(new Status(9012, "Place ID must not be empty.")));
        }
        if (cVar.c().isEmpty()) {
            return vh.o.e(new hg.b(new Status(9012, "Place Fields must not be empty.")));
        }
        b41 b41Var = this.f33026h;
        z01 z01Var = new z01(cVar, b41Var.d(), b41Var.c(), this.f33019a);
        xu0 xu0Var = this.f33023e;
        q11 q11Var = this.f33020b;
        final long jZzb = xu0Var.zzb();
        return q11Var.a(z01Var, a11.class).i(new vh.c() { // from class: com.google.android.libraries.places.internal.i21
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                return n21.i(lVar);
            }
        }).i(new vh.c() { // from class: com.google.android.libraries.places.internal.j21
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                return this.f32633a.g(jZzb, k41Var, lVar);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.q01
    public final vh.l e(ji.i iVar, Location location, ak.n0 n0Var, final k41 k41Var) {
        if (iVar.c().isEmpty()) {
            return vh.o.e(new hg.b(new Status(9012, "Place Fields must not be empty.")));
        }
        b41 b41Var = this.f33026h;
        i11 i11Var = new i11(iVar, location, n0Var, b41Var.d(), b41Var.c(), this.f33019a);
        xu0 xu0Var = this.f33023e;
        q11 q11Var = this.f33020b;
        final long jZzb = xu0Var.zzb();
        return q11Var.a(i11Var, j11.class).i(new vh.c() { // from class: com.google.android.libraries.places.internal.k21
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                return n21.j(lVar);
            }
        }).i(new vh.c() { // from class: com.google.android.libraries.places.internal.l21
            @Override // vh.c
            public final /* synthetic */ Object a(vh.l lVar) {
                return this.f32782a.h(jZzb, k41Var, lVar);
            }
        });
    }

    final /* synthetic */ ji.b f(long j15, k41 k41Var, vh.l lVar) {
        this.f33022d.c(lVar, j15, this.f33023e.zzb(), k41Var);
        return (ji.b) lVar.m();
    }

    final /* synthetic */ ji.d g(long j15, k41 k41Var, vh.l lVar) {
        this.f33022d.e(lVar, j15, this.f33023e.zzb(), 2, k41Var, hi.c.f84783a);
        return (ji.d) lVar.m();
    }

    final /* synthetic */ ji.j h(long j15, k41 k41Var, vh.l lVar) {
        this.f33022d.d(lVar, j15, this.f33023e.zzb(), k41Var);
        return (ji.j) lVar.m();
    }
}
