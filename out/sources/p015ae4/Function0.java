package p015ae4;

import be4.SetupData;
import be4.n;
import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import xw.b;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: ae4.r, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "l", "(Ler/a;Lm2/r;I)V", "passportagreementmanagement_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void l(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1395347007);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1395347007, i16, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.PassportAgreementManagementNavContent (PassportAgreementManagementNavContent.kt:19)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            e eVar = e.f6050a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: ae4.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.m(aVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, eVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: ae4.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.w(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 m(final a aVar, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, e.f6050a, null, m.b(-1501994752, true, new er.r() { // from class: ae4.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.n(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.f6048a, null, m.b(-2063766679, true, new er.r() { // from class: ae4.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.q(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, f.f6052a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(851415304, true, new er.r() { // from class: ae4.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.t(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1501994752, i15, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.PassportAgreementManagementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementManagementNavContent.kt:27)");
        }
        f00.r.n(wVar, q0.c(ee4.s.class), m.d(-2001675474, true, new q() { // from class: ae4.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.o(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c.f6045a.c(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2001675474, i15, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.PassportAgreementManagementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementManagementNavContent.kt:30)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ae4.p
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.p(aVar, sVar, (ee4.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(a aVar, s sVar, ee4.a.b bVar) {
        if (fr.t.c(bVar, ee4.a.b.C1183a.f49686a)) {
            aVar.a();
        } else {
            if (!(bVar instanceof ee4.a.b.OnAgreementOpen)) {
                throw new oq.p();
            }
            s.l(sVar, d.f6048a, new SetupData(((ee4.a.b.OnAgreementOpen) bVar).getPassportAgreementId()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2063766679, i15, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.PassportAgreementManagementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementManagementNavContent.kt:46)");
        }
        f00.r.o(wVar, q0.c(n.class), sVar.g(d.f6048a), m.d(-1202176616, true, new q() { // from class: ae4.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.r(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c.f6045a.d(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1202176616, i15, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.PassportAgreementManagementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementManagementNavContent.kt:52)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ae4.q
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.s(sVar, (be4.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(s sVar, be4.a.b bVar) {
        if (fr.t.c(bVar, be4.a.b.C0476a.f19002a)) {
            sVar.c();
        } else if (bVar instanceof be4.a.b.ShowDialog) {
            s.l(sVar, f.f6052a, ((be4.a.b.ShowDialog) bVar).getDialogData(), null, 4, null);
        } else {
            if (!fr.t.c(bVar, be4.a.b.C0477b.f19003a)) {
                throw new oq.p();
            }
            e eVar = e.f6050a;
            sVar.k(eVar, eVar);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(851415304, i15, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.PassportAgreementManagementNavContent.<anonymous>.<anonymous>.<anonymous> (PassportAgreementManagementNavContent.kt:74)");
        }
        f fVar2 = f.f6052a;
        f00.r.r(wVar, fVar2, sVar.g(fVar2), m.d(-1989716515, true, new q() { // from class: ae4.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.u(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1989716515, i15, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.PassportAgreementManagementNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementManagementNavContent.kt:80)");
        }
        b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ae4.h
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.v(sVar, (cb4.f.a) obj);
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
    public static final i0 v(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(a aVar, int i15, r rVar, int i16) {
        l(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
