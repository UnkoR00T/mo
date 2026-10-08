package p044er3;

import er.a;
import er.l;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import fr3.y;
import gv3.b;
import hr3.LicenceCode;
import mu.g;
import oq.i0;
import oq.p;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import wn3.FromWru;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: er3.u, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgx/b;", "Loq/i0;", "navigateToGlobalDestination", "Lkotlin/Function0;", "navResult", "", "licenceCode", "o", "(Ler/l;Ler/a;ILm2/r;I)V", "wru_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final a aVar, final s sVar, final int i15, b bVar, r rVar, int i16) {
        if (t.k()) {
            t.o(1499395259, i16, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.WruNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WruNavContent.kt:105)");
        }
        xw.b<b.a> bVarY1 = bVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.c(i15);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: er3.i
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.B(aVar, sVar, i15, (b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(a aVar, s sVar, int i15, b.a aVar2) {
        if (aVar2 instanceof b.a.Close) {
            aVar.a();
        } else if (aVar2 instanceof b.a.LoadDocument) {
            sVar.j(f.f52968a, new LicenceCode(i15), d.f52964a);
        } else if (aVar2 instanceof b.a.Error) {
            s.l(sVar, e.f52966a, ((b.a.Error) aVar2).getError(), null, 4, null);
        } else {
            if (!(aVar2 instanceof b.a.ShowDialog)) {
                throw new p();
            }
            s.l(sVar, c.f52962a, ((b.a.ShowDialog) aVar2).getModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(l lVar, a aVar, int i15, int i16, r rVar, int i17) {
        o(lVar, aVar, i15, rVar, g4.a(i16 | 1));
        return i0.f148189a;
    }

    public static final void o(final l<? super gx.b, i0> lVar, final a<i0> aVar, final int i15, r rVar, final int i16) {
        int i17;
        r rVarH = rVar.h(548754307);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.G(lVar) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.c(i15) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (t.k()) {
                t.o(548754307, i17, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.WruNavContent (WruNavContent.kt:25)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            f fVar = f.f52968a;
            boolean zG = ((i17 & 112) == 32) | ((i17 & 896) == 256) | rVarH.G(sVarJ) | ((i17 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: er3.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.p(i15, aVar, sVarJ, lVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, fVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: er3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.C(lVar, aVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 p(final int i15, final a aVar, final s sVar, final l lVar, d1 d1Var) {
        f00.r.u(d1Var, f.f52968a, null, m.b(-1217646332, true, new er.r() { // from class: er3.m
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.q(i15, aVar, sVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e.f52966a, null, m.b(-1264135123, true, new er.r() { // from class: er3.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.t(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, c.f52962a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(-502253812, true, new er.r() { // from class: er3.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.w(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, d.f52964a, null, m.b(259627499, true, new er.r() { // from class: er3.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.z(sVar, aVar, i15, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(int i15, final a aVar, final s sVar, final l lVar, f fVar, w wVar, r rVar, int i16) {
        if (t.k()) {
            t.o(-1217646332, i16, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.WruNavContent.<anonymous>.<anonymous>.<anonymous> (WruNavContent.kt:33)");
        }
        f00.r.o(wVar, q0.c(y.class), new LicenceCode(i15), m.d(756440115, true, new q() { // from class: er3.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.r(aVar, sVar, lVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b.f52960a.b(), rVar, ((i16 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final a aVar, final s sVar, final l lVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(756440115, i15, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.WruNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WruNavContent.kt:37)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: er3.h
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.s(aVar, sVar, lVar, (fr3.a.g) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(a aVar, s sVar, l lVar, fr3.a.g gVar) {
        if (gVar instanceof fr3.a.g.C1486a) {
            aVar.a();
        } else if (gVar instanceof fr3.a.g.Error) {
            s.l(sVar, e.f52966a, ((fr3.a.g.Error) gVar).getErrorData(), null, 4, null);
        } else if (gVar instanceof fr3.a.g.GotToVerification) {
            lVar.b(new FromWru(((fr3.a.g.GotToVerification) gVar).getLicenceType()));
        } else if (gVar instanceof fr3.a.g.ShowDialog) {
            s.l(sVar, c.f52962a, ((fr3.a.g.ShowDialog) gVar).getDialogData(), null, 4, null);
        } else {
            if (!(gVar instanceof fr3.a.g.ShowAsyncDownloadLoader)) {
                throw new p();
            }
            sVar.j(d.f52964a, ((fr3.a.g.ShowAsyncDownloadLoader) gVar).getSetupData(), f.f52968a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1264135123, i15, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.WruNavContent.<anonymous>.<anonymous>.<anonymous> (WruNavContent.kt:70)");
        }
        e eVar = e.f52966a;
        f00.r.r(wVar, eVar, sVar.g(eVar), m.d(450474540, true, new q() { // from class: er3.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.u(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(450474540, i15, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.WruNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WruNavContent.kt:74)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: er3.k
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.v(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-502253812, i15, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.WruNavContent.<anonymous>.<anonymous>.<anonymous> (WruNavContent.kt:87)");
        }
        c cVar = c.f52962a;
        f00.r.r(wVar, cVar, sVar.g(cVar), m.d(920313249, true, new q() { // from class: er3.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.x(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(920313249, i15, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.WruNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WruNavContent.kt:91)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: er3.j
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.y(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final s sVar, final a aVar, final int i15, f fVar, w wVar, r rVar, int i16) {
        if (t.k()) {
            t.o(259627499, i16, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.WruNavContent.<anonymous>.<anonymous>.<anonymous> (WruNavContent.kt:101)");
        }
        d dVar = d.f52964a;
        f00.r.r(wVar, dVar, sVar.g(dVar), m.d(1499395259, true, new q() { // from class: er3.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.A(aVar, sVar, i15, (b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i16 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }
}
