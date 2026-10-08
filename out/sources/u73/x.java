package u73;

import f00.f0;
import fr.q0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\n\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lz73/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "Lk83/a;", "activationProcessType", "onProcessFinished", "w", "(Lz73/a;Ler/a;Lk83/a;Ler/a;Lm2/r;I)V", "z", "(Ler/a;Lk83/a;Ler/a;Lm2/r;I)V", "studentschoolcardactivation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final k83.a aVar, final er.a aVar2, final f00.s sVar, final er.a aVar3, d1 d1Var) {
        f00.r.u(d1Var, a.f.f196178a, null, y2.m.b(-68894745, true, new er.r() { // from class: u73.c
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return x.B(aVar, aVar2, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.e.f196176a, null, y2.m.b(-540217328, true, new er.r() { // from class: u73.d
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return x.E(aVar, sVar, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.c.f196172a, null, y2.m.b(-781914641, true, new er.r() { // from class: u73.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return x.H(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.d.f196174a, null, y2.m.b(-1023611954, true, new er.r() { // from class: u73.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return x.K(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.C5105a.f196168a, null, y2.m.b(-1265309267, true, new er.r() { // from class: u73.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return x.N(sVar, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.b.f196170a, null, y2.m.b(-1507006580, true, new er.r() { // from class: u73.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return x.Q(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(k83.a aVar, final er.a aVar2, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-68894745, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph.<anonymous>.<anonymous>.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:60)");
        }
        f00.r.o(wVar, q0.c(i83.o.class), aVar, y2.m.d(1511200278, true, new er.q() { // from class: u73.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return x.C(aVar2, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d0.f196188a.g(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1511200278, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:64)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u73.m
                @Override // er.l
                public final Object b(Object obj) {
                    return x.D(aVar, sVar, (i83.d) obj);
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
    public static final i0 D(er.a aVar, f00.s sVar, i83.d dVar) {
        if (fr.t.c(dVar, i83.d.a.f90276a)) {
            aVar.a();
        } else if (fr.t.c(dVar, i83.d.C2138d.f90279a)) {
            f00.s.m(sVar, a.e.f196176a, null, 2, null);
        } else if (fr.t.c(dVar, i83.d.b.f90277a)) {
            f00.s.m(sVar, a.c.f196172a, null, 2, null);
        } else {
            if (!fr.t.c(dVar, i83.d.c.f90278a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, a.d.f196174a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(k83.a aVar, final f00.s sVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-540217328, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph.<anonymous>.<anonymous>.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:87)");
        }
        f00.r.o(wVar, q0.c(f83.o.class), aVar, y2.m.d(1807644287, true, new er.q() { // from class: u73.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return x.F(sVar, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d0.f196188a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1807644287, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:91)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u73.b
                @Override // er.l
                public final Object b(Object obj) {
                    return x.G(sVar, aVar, (f83.a.l) obj);
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
    public static final i0 G(f00.s sVar, er.a aVar, f83.a.l lVar) {
        if (fr.t.c(lVar, f83.a.l.b.f60149a)) {
            sVar.c();
        } else if (lVar instanceof f83.a.l.GoToActivationCode) {
            f00.s.l(sVar, a.C5105a.f196168a, ((f83.a.l.GoToActivationCode) lVar).getSetupData(), null, 4, null);
        } else if (lVar instanceof f83.a.l.C1357a) {
            aVar.a();
        } else {
            if (!(lVar instanceof f83.a.l.GoToError)) {
                throw new oq.p();
            }
            f00.s.l(sVar, a.b.f196170a, ((f83.a.l.GoToError) lVar).getError(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-781914641, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph.<anonymous>.<anonymous>.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:113)");
        }
        f00.r.n(wVar, q0.c(a83.l.class), y2.m.d(-1492162275, true, new er.q() { // from class: u73.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return x.I(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d0.f196188a.j(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1492162275, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:116)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u73.p
                @Override // er.l
                public final Object b(Object obj) {
                    return x.J(sVar, (a83.b) obj);
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
    public static final i0 J(f00.s sVar, a83.b bVar) {
        if (!fr.t.c(bVar, a83.b.a.f4821a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1023611954, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph.<anonymous>.<anonymous>.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:127)");
        }
        f00.r.n(wVar, q0.c(d83.l.class), y2.m.d(-1733859588, true, new er.q() { // from class: u73.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return x.L(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d0.f196188a.h(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1733859588, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:130)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u73.r
                @Override // er.l
                public final Object b(Object obj) {
                    return x.M(sVar, (d83.b) obj);
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
    public static final i0 M(f00.s sVar, d83.b bVar) {
        if (!fr.t.c(bVar, d83.b.a.f40344a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1265309267, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph.<anonymous>.<anonymous>.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:141)");
        }
        f00.r.o(wVar, q0.c(v73.n.class), sVar.g(a.C5105a.f196168a), y2.m.d(1082552348, true, new er.q() { // from class: u73.i
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return x.O(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), d0.f196188a.f(), rVar, ((i15 >> 3) & 14) | 27648 | (iy.b0.f97726c << 6));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1082552348, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:147)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u73.s
                @Override // er.l
                public final Object b(Object obj) {
                    return x.P(sVar, aVar, (v73.a.d) obj);
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
    public static final i0 P(f00.s sVar, er.a aVar, v73.a.d dVar) {
        if (fr.t.c(dVar, v73.a.d.C5330a.f204320a)) {
            sVar.c();
        } else if (dVar instanceof v73.a.d.GoToError) {
            f00.s.l(sVar, a.b.f196170a, ((v73.a.d.GoToError) dVar).getErrorData(), null, 4, null);
        } else {
            if (!fr.t.c(dVar, v73.a.d.b.f204321a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1507006580, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph.<anonymous>.<anonymous>.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:164)");
        }
        a.b bVar = a.b.f196170a;
        f00.r.r(wVar, bVar, sVar.g(bVar), y2.m.d(1512964235, true, new er.q() { // from class: u73.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return x.R(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1512964235, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:168)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u73.q
                @Override // er.l
                public final Object b(Object obj) {
                    return x.S(sVar, (hb4.b.a) obj);
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
    public static final i0 S(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(er.a aVar, k83.a aVar2, er.a aVar3, int i15, p076m2.r rVar, int i16) {
        z(aVar, aVar2, aVar3, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void w(final z73.a aVar, final er.a<i0> aVar2, final k83.a aVar3, final er.a<i0> aVar4, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-991526907);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(aVar3) : rVarH.G(aVar3) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar4) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-991526907, i16, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavContent (ActivateStudentOrSchoolCardNavContent.kt:36)");
            }
            p076m2.d0.c(z73.c.c().d(aVar), y2.m.d(1293051077, true, new er.p() { // from class: u73.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.x(aVar2, aVar3, aVar4, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: u73.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.y(aVar, aVar2, aVar3, aVar4, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(er.a aVar, k83.a aVar2, er.a aVar3, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1293051077, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavContent.<anonymous> (ActivateStudentOrSchoolCardNavContent.kt:40)");
            }
            z(aVar, aVar2, aVar3, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(z73.a aVar, er.a aVar2, k83.a aVar3, er.a aVar4, int i15, p076m2.r rVar, int i16) {
        w(aVar, aVar2, aVar3, aVar4, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void z(final er.a<i0> aVar, final k83.a aVar2, final er.a<i0> aVar3, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(892509542);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar2) : rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar3) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(892509542, i16, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.ActivateStudentOrSchoolCardNavGraph (ActivateStudentOrSchoolCardNavContent.kt:53)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            a.f fVar = a.f.f196178a;
            boolean zG = ((i16 & 14) == 4) | ((i16 & 112) == 32 || ((i16 & 64) != 0 && rVarH.G(aVar2))) | rVarH.G(sVarJ) | ((i16 & 896) == 256);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: u73.v
                    @Override // er.l
                    public final Object b(Object obj) {
                        return x.A(aVar2, aVar, sVarJ, aVar3, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, fVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u73.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.T(aVar, aVar2, aVar3, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
