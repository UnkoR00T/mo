package az2;

import androidx.p016lifecycle.y0;
import dz2.b0;
import f00.f0;
import f00.g0;
import fr.q0;
import gz2.DeeplinkSharedData;
import iy.c0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lbz2/a;", "colorScheme", "Lcz2/a;", "startDestination", "Lkotlin/Function0;", "Loq/i0;", "navigateToDashboard", "navResult", "n", "(Lbz2/a;Lcz2/a;Ler/a;Ler/a;Lm2/r;I)V", "q", "(Lcz2/a;Ler/a;Ler/a;Lm2/r;I)V", "qualifiedsignature_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(cz2.a aVar, er.a aVar2, er.a aVar3, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1787212698, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.QualifiedSignatureNavGraph.<anonymous>.<anonymous>.<anonymous> (QualifiedSignatureNavContent.kt:120)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        b0 b0Var = (b0) q7.d.c(q0.c(b0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        if (aVar instanceof cz2.a.Deeplink) {
            b0Var.i9(new DeeplinkSharedData(c0.g(((cz2.a.Deeplink) aVar).getToken())));
        } else if (!fr.t.c(aVar, cz2.a.b.f38819a) && !fr.t.c(aVar, cz2.a.c.f38820a)) {
            throw new oq.p();
        }
        dz2.r.r(b0Var, aVar, aVar2, aVar3, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(cz2.a aVar, er.a aVar2, er.a aVar3, int i15, p076m2.r rVar, int i16) {
        q(aVar, aVar2, aVar3, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final bz2.a aVar, final cz2.a aVar2, final er.a<i0> aVar3, final er.a<i0> aVar4, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-17770531);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar2) : rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar3) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar4) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-17770531, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.QualifiedSignatureNavContent (QualifiedSignatureNavContent.kt:33)");
            }
            d0.c(bz2.c.c().d(aVar), y2.m.d(-1735390435, true, new er.p() { // from class: az2.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.o(aVar2, aVar3, aVar4, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: az2.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.p(aVar, aVar2, aVar3, aVar4, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(cz2.a aVar, er.a aVar2, er.a aVar3, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1735390435, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.QualifiedSignatureNavContent.<anonymous> (QualifiedSignatureNavContent.kt:37)");
            }
            q(aVar, aVar2, aVar3, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(bz2.a aVar, cz2.a aVar2, er.a aVar3, er.a aVar4, int i15, p076m2.r rVar, int i16) {
        n(aVar, aVar2, aVar3, aVar4, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void q(final cz2.a aVar, final er.a<i0> aVar2, final er.a<i0> aVar3, p076m2.r rVar, final int i15) {
        int i16;
        zx.a aVar4;
        p076m2.r rVarH = rVar.h(-1571778766);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar3) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1571778766, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.QualifiedSignatureNavGraph (QualifiedSignatureNavContent.kt:50)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            if ((aVar instanceof cz2.a.Deeplink) || fr.t.c(aVar, cz2.a.c.f38820a)) {
                aVar4 = e.f15480a;
            } else {
                if (!fr.t.c(aVar, cz2.a.b.f38819a)) {
                    throw new oq.p();
                }
                aVar4 = g.f15484a;
            }
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(aVar))) | ((i16 & 896) == 256) | rVarH.G(sVarJ) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: az2.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.r(aVar3, sVarJ, aVar, aVar2, (d1) obj);
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
            d5VarM.a(new er.p() { // from class: az2.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.B(aVar, aVar2, aVar3, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 r(final er.a aVar, final f00.s sVar, final cz2.a aVar2, final er.a aVar3, d1 d1Var) {
        f00.r.u(d1Var, g.f15484a, null, y2.m.b(-2093828237, true, new er.r() { // from class: az2.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return u.s(aVar, sVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f.f15482a, null, y2.m.b(470446940, true, new er.r() { // from class: az2.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return u.u(sVar, aVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, c.f15473a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(1128829819, true, new er.r() { // from class: az2.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return u.x(sVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, e.f15480a, null, y2.m.b(1787212698, true, new er.r() { // from class: az2.t
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return u.A(aVar2, aVar3, aVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final er.a aVar, final f00.s sVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2093828237, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.QualifiedSignatureNavGraph.<anonymous>.<anonymous>.<anonymous> (QualifiedSignatureNavContent.kt:62)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        qz2.u uVar = (qz2.u) q7.d.c(q0.c(qz2.u.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<qz2.l.d> bVarY1 = uVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: az2.i
                @Override // er.l
                public final Object b(Object obj) {
                    return u.t(aVar, sVar, (qz2.l.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        qz2.k.r(uVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(er.a aVar, f00.s sVar, qz2.l.d dVar) {
        if (fr.t.c(dVar, qz2.l.d.a.f169698a)) {
            aVar.a();
        } else {
            if (!(dVar instanceof qz2.l.d.ToProviderList)) {
                throw new oq.p();
            }
            f00.s.l(sVar, f.f15482a, ((qz2.l.d.ToProviderList) dVar).getQualifiedSignatureInfo(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final f00.s sVar, final er.a aVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(470446940, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.QualifiedSignatureNavGraph.<anonymous>.<anonymous>.<anonymous> (QualifiedSignatureNavContent.kt:79)");
        }
        f00.r.o(wVar, q0.c(tz2.t.class), sVar.g(f.f15482a), y2.m.d(-404924405, true, new er.q() { // from class: az2.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return u.v(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b.f15471a.b(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-404924405, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.QualifiedSignatureNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QualifiedSignatureNavContent.kt:85)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: az2.h
                @Override // er.l
                public final Object b(Object obj) {
                    return u.w(sVar, aVar, (tz2.i.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(f00.s sVar, er.a aVar, tz2.i.c cVar) {
        if (fr.t.c(cVar, tz2.i.c.a.f192785a)) {
            sVar.c();
        } else if (fr.t.c(cVar, tz2.i.c.b.f192786a)) {
            aVar.a();
        } else {
            if (!(cVar instanceof tz2.i.c.ShowNavigationDialog)) {
                throw new oq.p();
            }
            f00.s.l(sVar, c.f15473a, ((tz2.i.c.ShowNavigationDialog) cVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final f00.s sVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1128829819, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.QualifiedSignatureNavGraph.<anonymous>.<anonymous>.<anonymous> (QualifiedSignatureNavContent.kt:106)");
        }
        c cVar = c.f15473a;
        f00.r.r(wVar, cVar, sVar.g(cVar), y2.m.d(1470798800, true, new er.q() { // from class: az2.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return u.y(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1470798800, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.QualifiedSignatureNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QualifiedSignatureNavContent.kt:110)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: az2.l
                @Override // er.l
                public final Object b(Object obj) {
                    return u.z(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }
}
