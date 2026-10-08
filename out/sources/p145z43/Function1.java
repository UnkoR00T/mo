package p145z43;

import a53.k;
import a53.u;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import er.a;
import er.l;
import er.p;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import gx.b;
import oq.i0;
import oq.y;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import q7.d;
import w43.c;
import y2.m;

/* JADX INFO: renamed from: z43.k, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgx/b;", "Loq/i0;", "navigateToGlobalDestination", "Lz43/m;", "servicesEntryPointData", "Lkotlin/Function0;", "navResult", "k", "(Ler/l;Lz43/m;Ler/a;Lm2/r;I)V", "services_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {
    public static final void k(final l<? super b, i0> lVar, final m mVar, final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1243232122);
        if ((i15 & 48) == 0) {
            i16 = ((i15 & 64) == 0 ? rVarH.W(mVar) : rVarH.G(mVar) ? 32 : 16) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 145) != 144, i16 & 1)) {
            if (t.k()) {
                t.o(1243232122, i16, -1, "pl.gov.coi.mobywatel.feature.services.presentation.ServiceNavContent (ServiceNavContent.kt:20)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            l.b bVar = l.b.f232876a;
            boolean zG = ((i16 & 112) == 32 || ((i16 & 64) != 0 && rVarH.G(mVar))) | rVarH.G(sVarJ) | ((i16 & 896) == 256);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: z43.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.o(mVar, sVarJ, aVar, (d1) obj);
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
            d5VarM.a(new p() { // from class: z43.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.v(lVar, mVar, aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void l(final s sVar, final a<i0> aVar, final l lVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1564004282, i15, -1, "pl.gov.coi.mobywatel.feature.services.presentation.ServiceNavContent.OnlineServiceDestination (ServiceNavContent.kt:24)");
        }
        boolean zG = rVar.G(sVar) | ((((i15 & 14) ^ 6) > 4 && rVar.W(lVar)) || (i15 & 6) == 4);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: z43.i
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.m(sVar, lVar, (u.a) obj);
                }
            };
            rVar.v(objE);
        }
        u uVar = (u) d.c(q0.c(u.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<a53.a.j> bVarY1 = uVar.Y1();
        boolean zW = rVar.W(aVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: z43.j
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.n(aVar, (a53.a.j) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, xw.b.f221619c);
        k.m(uVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u m(s sVar, l lVar, u.a aVar) {
        c eVar = (c) sVar.e(lVar);
        if (eVar == null) {
            eVar = new c.e();
        }
        return aVar.a(new u.a.SetupData(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(a aVar, a53.a.j jVar) {
        if (!fr.t.c(jVar, a53.a.j.C0065a.f3700a)) {
            throw new oq.p();
        }
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final m mVar, final s sVar, final a aVar, d1 d1Var) {
        f00.r.u(d1Var, l.b.f232876a, null, m.b(802345211, true, new er.r() { // from class: z43.c
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.p(mVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.a.e.f232874a, null, m.b(1229885476, true, new er.r() { // from class: z43.d
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.q(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.a.c.f232870a, null, m.b(-946030845, true, new er.r() { // from class: z43.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.r(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.a.C6256a.f232866a, null, m.b(1173020130, true, new er.r() { // from class: z43.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.s(sVar, aVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.a.b.f232868a, null, m.b(-1002896191, true, new er.r() { // from class: z43.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.t(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.a.d.f232872a, null, m.b(1116154784, true, new er.r() { // from class: z43.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.u(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(m mVar, s sVar, f fVar, w wVar, r rVar, int i15) {
        oq.r rVarA;
        if (t.k()) {
            t.o(802345211, i15, -1, "pl.gov.coi.mobywatel.feature.services.presentation.ServiceNavContent.<anonymous>.<anonymous>.<anonymous> (ServiceNavContent.kt:49)");
        }
        if (fr.t.c(mVar, m.a.f232878a)) {
            rVarA = y.a(l.a.C6256a.f232866a, new c.a());
        } else if (fr.t.c(mVar, m.c.f232880a)) {
            rVarA = y.a(l.a.c.f232870a, new c.C5527c());
        } else if (fr.t.c(mVar, m.e.f232882a)) {
            rVarA = y.a(l.a.e.f232874a, new c.e());
        } else if (fr.t.c(mVar, m.b.f232879a)) {
            rVarA = y.a(l.a.b.f232868a, new c.b());
        } else {
            if (!(mVar instanceof m.MakeProposalService)) {
                throw new oq.p();
            }
            rVarA = y.a(l.a.d.f232872a, new c.d(((m.MakeProposalService) mVar).getOriginSupplement()));
        }
        s.i(sVar, (l.a) rVarA.a(), (c) rVarA.b(), null, 4, null);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(s sVar, a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1229885476, i15, -1, "pl.gov.coi.mobywatel.feature.services.presentation.ServiceNavContent.<anonymous>.<anonymous>.<anonymous> (ServiceNavContent.kt:68)");
        }
        l(sVar, aVar, l.a.e.f232874a, wVar, rVar, (i15 & 112) | 6);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(s sVar, a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-946030845, i15, -1, "pl.gov.coi.mobywatel.feature.services.presentation.ServiceNavContent.<anonymous>.<anonymous>.<anonymous> (ServiceNavContent.kt:75)");
        }
        l(sVar, aVar, l.a.c.f232870a, wVar, rVar, (i15 & 112) | 6);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(s sVar, a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1173020130, i15, -1, "pl.gov.coi.mobywatel.feature.services.presentation.ServiceNavContent.<anonymous>.<anonymous>.<anonymous> (ServiceNavContent.kt:79)");
        }
        l(sVar, aVar, l.a.C6256a.f232866a, wVar, rVar, (i15 & 112) | 6);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(s sVar, a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1002896191, i15, -1, "pl.gov.coi.mobywatel.feature.services.presentation.ServiceNavContent.<anonymous>.<anonymous>.<anonymous> (ServiceNavContent.kt:83)");
        }
        l(sVar, aVar, l.a.b.f232868a, wVar, rVar, (i15 & 112) | 6);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(s sVar, a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1116154784, i15, -1, "pl.gov.coi.mobywatel.feature.services.presentation.ServiceNavContent.<anonymous>.<anonymous>.<anonymous> (ServiceNavContent.kt:87)");
        }
        l(sVar, aVar, l.a.d.f232872a, wVar, rVar, (i15 & 112) | 6);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(l lVar, m mVar, a aVar, int i15, r rVar, int i16) {
        k(lVar, mVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
