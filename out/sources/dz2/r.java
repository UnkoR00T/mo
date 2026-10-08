package dz2;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.w0;
import fr.q0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldz2/x;", "sharedViewModel", "Lcz2/a;", "startDestination", "Lkotlin/Function0;", "Loq/i0;", "navigateToDashboard", "onClose", "r", "(Ldz2/x;Lcz2/a;Ler/a;Ler/a;Lm2/r;I)V", "qualifiedsignature_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ez2.n A(x xVar, ez2.n.a aVar) {
        return aVar.a(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(f00.s sVar, er.a aVar, ez2.h.e eVar) {
        if (fr.t.c(eVar, ez2.h.e.a.f54395a)) {
            sVar.c();
        } else if (fr.t.c(eVar, ez2.h.e.b.f54396a)) {
            aVar.a();
        } else {
            if (!(eVar instanceof ez2.h.e.c)) {
                throw new oq.p();
            }
            f00.s.m(sVar, az2.d.C0363d.f15479b, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(final x xVar, final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2142147990, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.IdentityConfirmationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (IdentityConfirmationSharedNavContent.kt:102)");
        }
        boolean zG = rVar.G(xVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dz2.b
                @Override // er.l
                public final Object b(Object obj) {
                    return r.D(xVar, (kz2.b0.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        kz2.b0 b0Var = (kz2.b0) q7.d.c(q0.c(kz2.b0.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<kz2.m.e> bVarY1 = b0Var.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: dz2.c
                @Override // er.l
                public final Object b(Object obj) {
                    return r.E(aVar, sVar, (kz2.m.e) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        kz2.k.p(b0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kz2.b0 D(x xVar, kz2.b0.a aVar) {
        return aVar.a(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(er.a aVar, f00.s sVar, kz2.m.e eVar) {
        if (fr.t.c(eVar, kz2.m.e.b.f113624a)) {
            aVar.a();
        } else if (fr.t.c(eVar, kz2.m.e.a.f113623a)) {
            sVar.c();
        } else if (eVar instanceof kz2.m.e.ShowDialog) {
            f00.s.l(sVar, az2.c.f15473a, ((kz2.m.e.ShowDialog) eVar).getDialogData(), null, 4, null);
        } else {
            if (!fr.t.c(eVar, kz2.m.e.d.f113626a)) {
                throw new oq.p();
            }
            az2.d.a aVar2 = az2.d.a.f15476b;
            sVar.k(aVar2, aVar2);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-486945611, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.IdentityConfirmationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (IdentityConfirmationSharedNavContent.kt:127)");
        }
        az2.c cVar = az2.c.f15473a;
        f00.r.r(wVar, cVar, sVar.g(cVar), y2.m.d(-2083859958, true, new er.q() { // from class: dz2.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r.G(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2083859958, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.IdentityConfirmationSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdentityConfirmationSharedNavContent.kt:131)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dz2.f
                @Override // er.l
                public final Object b(Object obj) {
                    return r.H(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(x xVar, cz2.a aVar, er.a aVar2, er.a aVar3, int i15, p076m2.r rVar, int i16) {
        r(xVar, aVar, aVar2, aVar3, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void r(final x xVar, final cz2.a aVar, final er.a<i0> aVar2, final er.a<i0> aVar3, p076m2.r rVar, final int i15) {
        int i16;
        zx.a aVar4;
        p076m2.r rVarH = rVar.h(-1139750610);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(xVar) : rVarH.G(xVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar3) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1139750610, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.IdentityConfirmationSharedNavContent (IdentityConfirmationSharedNavContent.kt:32)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            if (aVar instanceof cz2.a.Deeplink) {
                aVar4 = az2.d.b.f15477b;
            } else {
                if (!fr.t.c(aVar, cz2.a.b.f38819a) && !fr.t.c(aVar, cz2.a.c.f38820a)) {
                    throw new oq.p();
                }
                aVar4 = az2.d.c.f15478b;
            }
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(xVar))) | ((i16 & 7168) == 2048) | rVarH.G(sVarJ) | ((i16 & 896) == 256);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: dz2.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.s(xVar, aVar3, sVarJ, aVar2, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, aVar4, (er.l) objE, rVarH, f00.s.f54562e);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dz2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.I(xVar, aVar, aVar2, aVar3, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final x xVar, final er.a aVar, final f00.s sVar, final er.a aVar2, d1 d1Var) {
        f00.r.u(d1Var, az2.d.c.f15478b, null, y2.m.b(988887663, true, new er.r() { // from class: dz2.a
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r.t(xVar, aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, az2.d.b.f15477b, null, y2.m.b(-1189599400, true, new er.r() { // from class: dz2.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r.w(xVar, aVar2, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, az2.d.a.f15476b, null, y2.m.b(476274295, true, new er.r() { // from class: dz2.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r.z(xVar, sVar, aVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, az2.d.C0363d.f15479b, null, y2.m.b(2142147990, true, new er.r() { // from class: dz2.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r.C(xVar, aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, az2.c.f15473a, new f00.g0.Dialog(null, 1, null), y2.m.b(-486945611, true, new er.r() { // from class: dz2.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r.F(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final x xVar, final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(988887663, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.IdentityConfirmationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (IdentityConfirmationSharedNavContent.kt:44)");
        }
        boolean zG = rVar.G(xVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dz2.d
                @Override // er.l
                public final Object b(Object obj) {
                    return r.u(xVar, (iz2.x.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        iz2.x xVar2 = (iz2.x) q7.d.c(q0.c(iz2.x.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<iz2.a.g> bVarY1 = xVar2.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: dz2.e
                @Override // er.l
                public final Object b(Object obj) {
                    return r.v(aVar, sVar, (iz2.a.g) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        iz2.p.t(xVar2, false, rVar, 0, 2);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iz2.x u(x xVar, iz2.x.a aVar) {
        return aVar.a(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(er.a aVar, f00.s sVar, iz2.a.g gVar) {
        if (fr.t.c(gVar, iz2.a.g.C2302a.f98075a)) {
            aVar.a();
        } else {
            if (!(gVar instanceof iz2.a.g.b)) {
                throw new oq.p();
            }
            f00.s.m(sVar, az2.d.b.f15477b, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final x xVar, final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1189599400, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.IdentityConfirmationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (IdentityConfirmationSharedNavContent.kt:60)");
        }
        boolean zG = rVar.G(xVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dz2.p
                @Override // er.l
                public final Object b(Object obj) {
                    return r.x(xVar, (gz2.x.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        gz2.x xVar2 = (gz2.x) q7.d.c(q0.c(gz2.x.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<gz2.n.f> bVarY1 = xVar2.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: dz2.q
                @Override // er.l
                public final Object b(Object obj) {
                    return r.y(aVar, sVar, (gz2.n.f) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        gz2.l.o(xVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gz2.x x(x xVar, gz2.x.a aVar) {
        return aVar.a(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(er.a aVar, f00.s sVar, gz2.n.f fVar) {
        if (fr.t.c(fVar, gz2.n.f.a.f78587a)) {
            aVar.a();
        } else if (fr.t.c(fVar, gz2.n.f.b.f78588a)) {
            f00.s.m(sVar, az2.d.a.f15476b, null, 2, null);
        } else if (fVar instanceof gz2.n.f.ShowNavigationDialog) {
            f00.s.l(sVar, az2.c.f15473a, ((gz2.n.f.ShowNavigationDialog) fVar).getDialogData(), null, 4, null);
        } else {
            if (!fr.t.c(fVar, gz2.n.f.c.f78589a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, az2.d.c.f15478b, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final x xVar, final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(476274295, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.IdentityConfirmationSharedNavContent.<anonymous>.<anonymous>.<anonymous> (IdentityConfirmationSharedNavContent.kt:85)");
        }
        boolean zG = rVar.G(xVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: dz2.m
                @Override // er.l
                public final Object b(Object obj) {
                    return r.A(xVar, (ez2.n.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        ez2.n nVar = (ez2.n) q7.d.c(q0.c(ez2.n.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ez2.h.e> bVarY1 = nVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: dz2.n
                @Override // er.l
                public final Object b(Object obj) {
                    return r.B(sVar, aVar, (ez2.h.e) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ez2.f.e(nVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }
}
