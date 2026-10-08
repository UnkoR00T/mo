package p091o83;

import a93.z;
import er.a;
import er.l;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import mr.c;
import mu.g;
import oo0.Topic;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p83.k;
import v83.x;
import xw.b;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: o83.k0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "Lr83/a;", "entryPoint", "x", "(Ler/a;Lr83/a;Lm2/r;I)V", "technicalsupport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1259246212, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:49)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: o83.u
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.B(aVar, sVar, (p83.a.d) obj);
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
    public static final i0 B(a aVar, s sVar, p83.a.d dVar) {
        if (fr.t.c(dVar, p83.a.d.C3789a.f153468a)) {
            aVar.a();
        } else if (fr.t.c(dVar, p83.a.d.b.f153469a)) {
            s.l(sVar, j.f143311a, Topic.INSTANCE.a(), null, 4, null);
        } else {
            if (!(dVar instanceof p83.a.d.OnError)) {
                throw new p();
            }
            s.l(sVar, g.f143302a, ((p83.a.d.OnError) dVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(final s sVar, final r83.a aVar, final a aVar2, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-763438687, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:69)");
        }
        c cVarC = q0.c(x.class);
        Topic topicA = (Topic) sVar.g(j.f143311a);
        if (topicA == null) {
            topicA = Topic.INSTANCE.a();
        }
        f00.r.o(wVar, cVarC, topicA, m.d(723619410, true, new q() { // from class: o83.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.D(aVar, sVar, aVar2, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f143295a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(final r83.a aVar, final s sVar, final a aVar2, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(723619410, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:73)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: o83.w
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.E(aVar, sVar, aVar2, (v83.a.g) obj);
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
    public static final i0 E(r83.a aVar, s sVar, a aVar2, v83.a.g gVar) {
        if (fr.t.c(gVar, v83.a.g.C5337a.f204501a)) {
            if (fr.t.c(aVar, r83.a.C4394a.f172348b)) {
                sVar.c();
            } else {
                if (!fr.t.c(aVar, r83.a.b.f172349b)) {
                    throw new p();
                }
                aVar2.a();
            }
        } else if (gVar instanceof v83.a.g.Error) {
            s.l(sVar, g.f143302a, ((v83.a.g.Error) gVar).getErrorData(), null, 4, null);
        } else if (gVar instanceof v83.a.g.ShowNavigationDialog) {
            s.l(sVar, h.f143305a, ((v83.a.g.ShowNavigationDialog) gVar).getNavigationDialogModel(), null, 4, null);
        } else if (gVar instanceof v83.a.g.ShowTopicList) {
            s.l(sVar, m.f143319a, ((v83.a.g.ShowTopicList) gVar).getSetupData(), null, 4, null);
        } else if (gVar instanceof v83.a.g.ShowVehicleCardReasonList) {
            s.l(sVar, i.f143308a, ((v83.a.g.ShowVehicleCardReasonList) gVar).getReasonListSetupData(), null, 4, null);
        } else if (gVar instanceof v83.a.g.GoToInfoPage) {
            s.l(sVar, k.f143315a, ((v83.a.g.GoToInfoPage) gVar).getTopic(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1399863522, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:111)");
        }
        f00.r.o(wVar, q0.c(z.class), sVar.g(m.f143319a), m.d(-1408045677, true, new q() { // from class: o83.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.G(sVar, (d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f143295a.f(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1408045677, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:115)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: o83.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.H(sVar, (a93.c) obj);
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
    public static final i0 H(s sVar, a93.c cVar) {
        if (fr.t.c(cVar, a93.c.a.f5041a)) {
            sVar.c();
        } else {
            if (!(cVar instanceof a93.c.GoBackAndSelectTopic)) {
                throw new p();
            }
            s.l(sVar, j.f143311a, ((a93.c.GoBackAndSelectTopic) cVar).getTopic(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-731801565, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:131)");
        }
        g gVar = g.f143302a;
        f00.r.r(wVar, gVar, sVar.g(gVar), m.d(-897296316, true, new q() { // from class: o83.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.J(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-897296316, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:135)");
        }
        b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: o83.v
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.K(sVar, (hb4.b.a) obj);
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
    public static final i0 K(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1431500644, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:148)");
        }
        h hVar = h.f143305a;
        f00.r.r(wVar, hVar, sVar.g(hVar), m.d(1127204911, true, new q() { // from class: o83.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.M(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1127204911, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:152)");
        }
        b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: o83.x
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.N(sVar, (cb4.f.a) obj);
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
    public static final i0 N(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-700164443, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:162)");
        }
        f00.r.o(wVar, q0.c(s83.l.class), sVar.g(i.f143308a), m.d(786893654, true, new q() { // from class: o83.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.P(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f143295a.g(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(786893654, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:166)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: o83.z
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Q(sVar, (s83.b) obj);
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
    public static final i0 Q(s sVar, s83.b bVar) {
        if (!fr.t.c(bVar, s83.b.a.f179256a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1463137766, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:177)");
        }
        f00.r.o(wVar, q0.c(y83.l.class), sVar.g(k.f143315a), m.d(-1344771433, true, new q() { // from class: o83.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.S(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f143295a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1344771433, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:181)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: o83.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.T(sVar, (y83.b) obj);
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
    public static final i0 T(s sVar, y83.b bVar) {
        if (!fr.t.c(bVar, y83.b.a.f225320a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(a aVar, r83.a aVar2, int i15, r rVar, int i16) {
        x(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void x(final a<i0> aVar, final r83.a aVar2, r rVar, final int i15) {
        int i16;
        zx.a aVar3;
        r rVarH = rVar.h(-1324295285);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1324295285, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent (TechnicalSupportNavContent.kt:36)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            if (fr.t.c(aVar2, r83.a.b.f172349b)) {
                aVar3 = j.f143311a;
            } else {
                if (!fr.t.c(aVar2, r83.a.C4394a.f172348b)) {
                    throw new p();
                }
                aVar3 = l.f143317a;
            }
            boolean zG = ((i16 & 14) == 4) | rVarH.G(sVarJ) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: o83.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.y(aVar, sVarJ, aVar2, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, aVar3, (l) objE, rVarH, s.f54562e);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o83.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.U(aVar, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 y(final a aVar, final s sVar, final r83.a aVar2, d1 d1Var) {
        f00.r.u(d1Var, l.f143317a, null, m.b(2087972842, true, new er.r() { // from class: o83.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.z(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j.f143311a, null, m.b(-763438687, true, new er.r() { // from class: o83.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.C(sVar, aVar2, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f143319a, null, m.b(1399863522, true, new er.r() { // from class: o83.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.F(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g.f143302a, null, m.b(-731801565, true, new er.r() { // from class: o83.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.I(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, h.f143305a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(1431500644, true, new er.r() { // from class: o83.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.L(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, i.f143308a, null, m.b(-700164443, true, new er.r() { // from class: o83.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.O(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.f143315a, null, m.b(1463137766, true, new er.r() { // from class: o83.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.R(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2087972842, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.TechnicalSupportNavContent.<anonymous>.<anonymous>.<anonymous> (TechnicalSupportNavContent.kt:46)");
        }
        f00.r.n(wVar, q0.c(k.class), m.d(-1259246212, true, new q() { // from class: o83.j0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.A(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f143295a.h(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }
}
