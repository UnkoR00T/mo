package p069kd0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import od0.a0;
import od0.e;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import pe0.VerificationDocumentData;
import q7.d;
import xw.b;
import y2.m;

/* JADX INFO: renamed from: kd0.l, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aE\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onClose", "Lkotlin/Function1;", "Lpe0/d;", "goToVerification", "", "goToDocumentLoader", "i", "(Ler/a;Ler/l;Ler/l;Lm2/r;I)V", "schoolcard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void i(final a<i0> aVar, final l<? super VerificationDocumentData, i0> lVar, final l<? super String, i0> lVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(281367157);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar2) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(281367157, i16, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.SchoolCardNavContent (SchoolCardNavContent.kt:21)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            b bVar = b.f110127a;
            boolean zG = ((i16 & 14) == 4) | rVarH.G(sVarJ) | ((i16 & 112) == 32) | ((i16 & 896) == 256);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: kd0.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.j(sVarJ, aVar, lVar, lVar2, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, bVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: kd0.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.q(aVar, lVar, lVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(final s sVar, final a aVar, final l lVar, final l lVar2, d1 d1Var) {
        f00.r.u(d1Var, b.f110127a, null, m.b(-569116652, true, new er.r() { // from class: kd0.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.k(sVar, aVar, lVar, lVar2, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, a.f110125a, new g0.Dialog(null, 1, null), m.b(30737675, true, new er.r() { // from class: kd0.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.n(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final s sVar, final a aVar, final l lVar, final l lVar2, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-569116652, i15, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.SchoolCardNavContent.<anonymous>.<anonymous>.<anonymous> (SchoolCardNavContent.kt:28)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: kd0.h
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.l(sVar, (a0.a) obj);
                }
            };
            rVar.v(objE);
        }
        a0 a0Var = (a0) d.c(q0.c(a0.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        b<e> bVarY1 = a0Var.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: kd0.i
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.m(aVar, sVar, lVar, lVar2, (e) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, b.f221619c);
        od0.p.l(a0Var, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 l(s sVar, a0.a aVar) {
        return aVar.a(new a0.a.SetupData((String) sVar.g(c.f110129a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(a aVar, s sVar, l lVar, l lVar2, e eVar) {
        if (fr.t.c(eVar, e.a.f144909a)) {
            aVar.a();
        } else if (eVar instanceof e.ShowDialog) {
            s.l(sVar, a.f110125a, ((e.ShowDialog) eVar).getData(), null, 4, null);
        } else if (eVar instanceof e.GoToVerification) {
            lVar.b(((e.GoToVerification) eVar).getDocumentData());
        } else {
            if (!(eVar instanceof e.ShowDocumentLoader)) {
                throw new oq.p();
            }
            lVar2.b(((e.ShowDocumentLoader) eVar).getId());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(30737675, i15, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.SchoolCardNavContent.<anonymous>.<anonymous>.<anonymous> (SchoolCardNavContent.kt:59)");
        }
        a aVar = a.f110125a;
        f00.r.r(wVar, aVar, sVar.g(aVar), m.d(-1011974122, true, new q() { // from class: kd0.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.o(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1011974122, i15, -1, "pl.gov.coi.mjunior.feature.schoolcard.presentation.SchoolCardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchoolCardNavContent.kt:63)");
        }
        b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: kd0.k
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.p(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(a aVar, l lVar, l lVar2, int i15, r rVar, int i16) {
        i(aVar, lVar, lVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
