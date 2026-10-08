package p068kc0;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import er.a;
import er.l;
import er.p;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import mc0.i;
import oc0.c;
import oc0.q;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import q7.b;
import q7.d;
import y2.m;

/* JADX INFO: renamed from: kc0.j, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aU\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onClose", "goToDashboard", "goToDocumentLoader", "goToLoginLockScreen", "onDeactivate", "g", "(Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Lm2/r;I)V", "login_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void g(final a<i0> aVar, final a<i0> aVar2, final a<i0> aVar3, final a<i0> aVar4, final a<i0> aVar5, r rVar, final int i15) {
        int i16;
        a<i0> aVar6;
        final s sVar;
        r rVarH = rVar.h(1023335160);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar3) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar4) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            aVar6 = aVar5;
            i16 |= rVarH.G(aVar6) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            aVar6 = aVar5;
        }
        if (rVarH.r((i16 & 9363) != 9362, i16 & 1)) {
            if (t.k()) {
                t.o(1023335160, i16, -1, "pl.gov.coi.mjunior.feature.login.presentation.LoginNavContent (LoginNavContent.kt:22)");
            }
            s sVarJ = f00.r.J(null, rVarH, 0, 1);
            a aVar7 = a.f109889a;
            boolean zG = ((i16 & 14) == 4) | ((i16 & 112) == 32) | rVarH.G(sVarJ) | ((i16 & 896) == 256) | ((i16 & 7168) == 2048) | ((i16 & 57344) == 16384);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                sVar = sVarJ;
                final a<i0> aVar8 = aVar6;
                l lVar = new l() { // from class: kc0.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.h(aVar, aVar2, sVar, aVar3, aVar4, aVar8, (d1) obj);
                    }
                };
                rVarH.v(lVar);
                objE = lVar;
            } else {
                sVar = sVarJ;
            }
            d0.j(sVar, aVar7, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: kc0.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.m(aVar, aVar2, aVar3, aVar4, aVar5, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final a aVar, final a aVar2, final s sVar, final a aVar3, final a aVar4, final a aVar5, d1 d1Var) {
        f00.r.u(d1Var, a.f109889a, null, m.b(794943673, true, new er.r() { // from class: kc0.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.i(aVar, aVar2, sVar, aVar3, aVar4, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b.f109891a, null, m.b(1541756450, true, new er.r() { // from class: kc0.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.k(sVar, aVar5, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final a aVar, final a aVar2, final s sVar, final a aVar3, final a aVar4, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(794943673, i15, -1, "pl.gov.coi.mjunior.feature.login.presentation.LoginNavContent.<anonymous>.<anonymous>.<anonymous> (LoginNavContent.kt:29)");
        }
        y0 y0VarC = b.f165175a.c(rVar, b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        mc0.t tVar = (mc0.t) d.c(q0.c(mc0.t.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<i.d> bVarY1 = tVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.G(sVar) | rVar.W(aVar3) | rVar.W(aVar4);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            l lVar = new l() { // from class: kc0.h
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.j(aVar, aVar2, sVar, aVar3, aVar4, (i.d) obj);
                }
            };
            rVar.v(lVar);
            objE = lVar;
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        mc0.h.p(tVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(a aVar, a aVar2, s sVar, a aVar3, a aVar4, i.d dVar) {
        if (fr.t.c(dVar, i.d.a.f125388a)) {
            aVar.a();
        } else if (fr.t.c(dVar, i.d.c.f125390a)) {
            aVar2.a();
        } else if (fr.t.c(dVar, i.d.e.f125392a)) {
            s.i(sVar, b.f109891a, null, null, 6, null);
        } else if (fr.t.c(dVar, i.d.b.f125389a)) {
            aVar3.a();
        } else {
            if (!fr.t.c(dVar, i.d.C3085d.f125391a)) {
                throw new oq.p();
            }
            aVar4.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1541756450, i15, -1, "pl.gov.coi.mjunior.feature.login.presentation.LoginNavContent.<anonymous>.<anonymous>.<anonymous> (LoginNavContent.kt:47)");
        }
        y0 y0VarC = b.f165175a.c(rVar, b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        q qVar = (q) d.c(q0.c(q.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<c> bVarY1 = qVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: kc0.i
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.l(sVar, aVar, (c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        oc0.l.f(qVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(s sVar, a aVar, c cVar) {
        if (fr.t.c(cVar, c.a.f144579a)) {
            sVar.c();
        } else {
            if (!fr.t.c(cVar, c.b.f144580a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, int i15, r rVar, int i16) {
        g(aVar, aVar2, aVar3, aVar4, aVar5, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
