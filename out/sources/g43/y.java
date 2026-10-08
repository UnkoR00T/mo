package g43;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.y0;
import fr.q0;
import l43.SetupData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÉ\u0001\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\t2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aÕ\u0001\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\t2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\t2 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lh43/a;", "colorScheme", "Lkotlin/Function1;", "", "Loq/i0;", "onNavigateToGrades", "onNavigateToAttendance", "onNavigateToSchedule", "onNavigateToBehavior", "Lkotlin/Function2;", "onNavigateToGradeDetails", "onNavigateToLessonDetails", "Lkotlin/Function3;", "Lf43/e;", "onNavigateToAbsenceDetails", "Lkotlin/Function0;", "navResult", "t", "(Lh43/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/p;Ler/p;Ler/q;Ler/a;Lm2/r;I)V", "Lg43/c0;", "sharedVM", "w", "(Lg43/c0;Ler/l;Ler/l;Ler/l;Ler/l;Ler/p;Ler/p;Ler/q;Ler/a;Lm2/r;II)V", "schooldashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(String str, String str2) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(String str, String str2) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(String str, String str2, f43.e eVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(final c0 c0Var, final er.a aVar, final f00.s sVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.l lVar4, final er.p pVar, final er.q qVar, final er.p pVar2, d1 d1Var) {
        f00.r.u(d1Var, d.f70530a, null, y2.m.b(-194554026, true, new er.r() { // from class: g43.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return y.E(c0Var, aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.f70528a, null, y2.m.b(8622591, true, new er.r() { // from class: g43.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return y.H(c0Var, sVar, lVar, lVar2, lVar3, lVar4, pVar, qVar, pVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e.f70532a, null, y2.m.b(-1993688738, true, new er.r() { // from class: g43.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return y.K(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(final c0 c0Var, final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-194554026, i15, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavGraph.<anonymous>.<anonymous>.<anonymous> (SchoolDashboardNavContent.kt:87)");
        }
        boolean zG = rVar.G(c0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: g43.k
                @Override // er.l
                public final Object b(Object obj) {
                    return y.F(c0Var, (n43.q.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        n43.q qVar = (n43.q) q7.d.c(q0.c(n43.q.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<n43.a.InterfaceC3266a> bVarY1 = qVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: g43.l
                @Override // er.l
                public final Object b(Object obj) {
                    return y.G(aVar, sVar, (n43.a.InterfaceC3266a) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        n43.j.o(qVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n43.q F(c0 c0Var, n43.q.a aVar) {
        return aVar.a(c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(er.a aVar, f00.s sVar, n43.a.InterfaceC3266a interfaceC3266a) {
        if (fr.t.c(interfaceC3266a, n43.a.InterfaceC3266a.C3267a.f131726a)) {
            aVar.a();
        } else {
            if (!(interfaceC3266a instanceof n43.a.InterfaceC3266a.ToChildDashboard)) {
                throw new oq.p();
            }
            f00.s.m(sVar, c.f70528a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(final c0 c0Var, final f00.s sVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.l lVar4, final er.p pVar, final er.q qVar, final er.p pVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(8622591, i15, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavGraph.<anonymous>.<anonymous>.<anonymous> (SchoolDashboardNavContent.kt:104)");
        }
        boolean zG = rVar.G(c0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: g43.m
                @Override // er.l
                public final Object b(Object obj) {
                    return y.I(c0Var, (i43.r.a) obj);
                }
            };
            rVar.v(objE);
        }
        i43.r rVar2 = (i43.r) q7.d.c(q0.c(i43.r.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<i43.a.b> bVarY1 = rVar2.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(lVar) | rVar.W(lVar2) | rVar.W(lVar3) | rVar.W(lVar4) | rVar.W(pVar) | rVar.W(qVar) | rVar.W(pVar2);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            er.l lVar5 = new er.l() { // from class: g43.n
                @Override // er.l
                public final Object b(Object obj) {
                    return y.J(sVar, lVar, lVar2, lVar3, lVar4, pVar, qVar, pVar2, (i43.a.b) obj);
                }
            };
            rVar.v(lVar5);
            objE2 = lVar5;
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        i43.i.k(rVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i43.r I(c0 c0Var, i43.r.a aVar) {
        return aVar.a(c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(f00.s sVar, er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, er.p pVar, er.q qVar, er.p pVar2, i43.a.b bVar) {
        if (fr.t.c(bVar, i43.a.b.C2105a.f89199a)) {
            sVar.c();
        } else if (bVar instanceof i43.a.b.ToGrades) {
            lVar.b(((i43.a.b.ToGrades) bVar).getStudentId());
        } else if (bVar instanceof i43.a.b.ToAttendance) {
            lVar2.b(((i43.a.b.ToAttendance) bVar).getStudentId());
        } else if (bVar instanceof i43.a.b.ToSchedule) {
            lVar3.b(((i43.a.b.ToSchedule) bVar).getStudentId());
        } else if (bVar instanceof i43.a.b.ToBehavior) {
            lVar4.b(((i43.a.b.ToBehavior) bVar).getStudentId());
        } else if (bVar instanceof i43.a.b.ToGradeDetails) {
            i43.a.b.ToGradeDetails toGradeDetails = (i43.a.b.ToGradeDetails) bVar;
            pVar.B(toGradeDetails.getGradeId(), toGradeDetails.getStudentId());
        } else if (bVar instanceof i43.a.b.ToAbsenceDetails) {
            i43.a.b.ToAbsenceDetails toAbsenceDetails = (i43.a.b.ToAbsenceDetails) bVar;
            qVar.w(toAbsenceDetails.getStudentId(), toAbsenceDetails.getSemesterId(), toAbsenceDetails.getAbsenceType());
        } else if (bVar instanceof i43.a.b.ToLessonDetails) {
            i43.a.b.ToLessonDetails toLessonDetails = (i43.a.b.ToLessonDetails) bVar;
            pVar2.B(toLessonDetails.getStudentId(), toLessonDetails.getLessonId());
        } else {
            if (!(bVar instanceof i43.a.b.GoToMoreShortcuts)) {
                throw new oq.p();
            }
            f00.s.l(sVar, e.f70532a, new SetupData(((i43.a.b.GoToMoreShortcuts) bVar).a()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1993688738, i15, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavGraph.<anonymous>.<anonymous>.<anonymous> (SchoolDashboardNavContent.kt:138)");
        }
        f00.r.o(wVar, q0.c(l43.l.class), sVar.g(e.f70532a), y2.m.d(-1278013107, true, new er.q() { // from class: g43.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y.L(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b.f70524a.b(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1278013107, i15, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SchoolDashboardNavContent.kt:142)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: g43.f
                @Override // er.l
                public final Object b(Object obj) {
                    return y.M(sVar, (l43.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(f00.s sVar, l43.b bVar) {
        if (!fr.t.c(bVar, l43.b.a.f115986a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(c0 c0Var, er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, er.p pVar, er.p pVar2, er.q qVar, er.a aVar, int i15, int i16, p076m2.r rVar, int i17) {
        w(c0Var, lVar, lVar2, lVar3, lVar4, pVar, pVar2, qVar, aVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final void t(final h43.a aVar, final er.l<? super String, oq.i0> lVar, final er.l<? super String, oq.i0> lVar2, final er.l<? super String, oq.i0> lVar3, final er.l<? super String, oq.i0> lVar4, final er.p<? super String, ? super String, oq.i0> pVar, final er.p<? super String, ? super String, oq.i0> pVar2, final er.q<? super String, ? super String, ? super f43.e, oq.i0> qVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1504929990);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(lVar3) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(lVar4) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.G(pVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.G(pVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.G(qVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i16 |= rVarH.G(aVar2) ? 67108864 : 33554432;
        }
        if (rVarH.r((38347923 & i16) != 38347922, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1504929990, i16, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavContent (SchoolDashboardNavContent.kt:43)");
            }
            p076m2.d0.c(h43.c.c().d(aVar), y2.m.d(1091665286, true, new er.p() { // from class: g43.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.u(lVar, lVar2, lVar3, lVar4, pVar, pVar2, qVar, aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: g43.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.v(aVar, lVar, lVar2, lVar3, lVar4, pVar, pVar2, qVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, er.p pVar, er.p pVar2, er.q qVar, er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1091665286, i15, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavContent.<anonymous> (SchoolDashboardNavContent.kt:47)");
            }
            y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
            if (y0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            w((g0) q7.d.c(q0.c(g0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0), lVar, lVar2, lVar3, lVar4, pVar, pVar2, qVar, aVar, rVar, 0, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(h43.a aVar, er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, er.p pVar, er.p pVar2, er.q qVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        t(aVar, lVar, lVar2, lVar3, lVar4, pVar, pVar2, qVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:103:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0153  */
    /* JADX WARN: Code duplicated, block: B:111:0x015f  */
    /* JADX WARN: Code duplicated, block: B:113:0x016b  */
    /* JADX WARN: Code duplicated, block: B:115:0x016e  */
    /* JADX WARN: Code duplicated, block: B:117:0x017a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0187  */
    /* JADX WARN: Code duplicated, block: B:122:0x0193  */
    /* JADX WARN: Code duplicated, block: B:124:0x019f  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:149:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:153:0x0206  */
    /* JADX WARN: Code duplicated, block: B:154:0x0208  */
    /* JADX WARN: Code duplicated, block: B:157:0x0210  */
    /* JADX WARN: Code duplicated, block: B:158:0x0212  */
    /* JADX WARN: Code duplicated, block: B:161:0x021c  */
    /* JADX WARN: Code duplicated, block: B:162:0x021e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0227  */
    /* JADX WARN: Code duplicated, block: B:166:0x0229  */
    /* JADX WARN: Code duplicated, block: B:169:0x0232  */
    /* JADX WARN: Code duplicated, block: B:170:0x0234  */
    /* JADX WARN: Code duplicated, block: B:173:0x023d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0240  */
    /* JADX WARN: Code duplicated, block: B:177:0x024a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0252  */
    /* JADX WARN: Code duplicated, block: B:184:0x0275  */
    /* JADX WARN: Code duplicated, block: B:186:0x027f  */
    /* JADX WARN: Code duplicated, block: B:189:0x028f  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    public static final void w(final c0 c0Var, er.l<? super String, oq.i0> lVar, final er.l<? super String, oq.i0> lVar2, er.l<? super String, oq.i0> lVar3, er.l<? super String, oq.i0> lVar4, er.p<? super String, ? super String, oq.i0> pVar, er.p<? super String, ? super String, oq.i0> pVar2, er.q<? super String, ? super String, ? super f43.e, oq.i0> qVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        er.l<? super String, oq.i0> lVar5;
        int i18;
        er.l<? super String, oq.i0> lVar6;
        int i19;
        int i25;
        er.l<? super String, oq.i0> lVar7;
        int i26;
        int i27;
        final er.p<? super String, ? super String, oq.i0> pVar3;
        int i28;
        int i29;
        er.p<? super String, ? super String, oq.i0> pVar4;
        int i35;
        int i36;
        int i37;
        boolean z15;
        final er.p<? super String, ? super String, oq.i0> pVar5;
        final er.l<? super String, oq.i0> lVar8;
        final er.p<? super String, ? super String, oq.i0> pVar6;
        final er.l<? super String, oq.i0> lVar9;
        final er.l<? super String, oq.i0> lVar10;
        final er.q<? super String, ? super String, ? super f43.e, oq.i0> qVar2;
        d5 d5VarM;
        er.l<? super String, oq.i0> lVar11;
        final er.l<? super String, oq.i0> lVar12;
        final er.l<? super String, oq.i0> lVar13;
        final er.p<? super String, ? super String, oq.i0> pVar7;
        final er.q<? super String, ? super String, ? super f43.e, oq.i0> qVar3;
        final f00.s sVarJ;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z35;
        final er.l<? super String, oq.i0> lVar14;
        Object obj;
        Object objE;
        Object objE2;
        Object objE3;
        Object objE4;
        Object objE5;
        Object objE6;
        int i38;
        int i39;
        p076m2.r rVarH = rVar.h(298970709);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(c0Var) : rVarH.G(c0Var) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i45 = i16 & 2;
        if (i45 == 0) {
            if ((i15 & 48) == 0) {
                lVar5 = lVar;
                i17 |= rVarH.G(lVar5) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) != 0) {
                if (rVarH.G(lVar2)) {
                    i39 = 256;
                } else {
                    i39 = 128;
                }
                i17 |= i39;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    lVar6 = lVar3;
                    if (rVarH.G(lVar6)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 16;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        lVar7 = lVar4;
                        if (rVarH.G(lVar7)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 32;
                    if (i27 != 0) {
                        i17 |= 196608;
                        pVar3 = pVar;
                    } else {
                        pVar3 = pVar;
                        if ((i15 & 196608) == 0) {
                            if (rVarH.G(pVar3)) {
                                i28 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i28 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i28;
                        }
                    }
                    i29 = i16 & 64;
                    if (i29 != 0) {
                        i17 |= 1572864;
                        pVar4 = pVar2;
                    } else {
                        pVar4 = pVar2;
                        if ((i15 & 1572864) == 0) {
                            if (rVarH.G(pVar4)) {
                                i35 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i35 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i35;
                        }
                    }
                    i36 = i16 & 128;
                    if (i36 != 0) {
                        i17 |= 12582912;
                    } else if ((i15 & 12582912) == 0) {
                        if (rVarH.G(qVar)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i17 |= i37;
                    }
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.G(aVar)) {
                            i38 = 67108864;
                        } else {
                            i38 = 33554432;
                        }
                        i17 |= i38;
                    }
                    if ((i17 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i45 != 0) {
                            objE6 = rVarH.E();
                            if (objE6 == p076m2.r.INSTANCE.a()) {
                                objE6 = new er.l() { // from class: g43.r
                                    @Override // er.l
                                    public final Object b(Object obj2) {
                                        return y.x((String) obj2);
                                    }
                                };
                                rVarH.v(objE6);
                            }
                            lVar5 = (er.l) objE6;
                        }
                        if (i18 != 0) {
                            objE5 = rVarH.E();
                            if (objE5 == p076m2.r.INSTANCE.a()) {
                                objE5 = new er.l() { // from class: g43.s
                                    @Override // er.l
                                    public final Object b(Object obj2) {
                                        return y.y((String) obj2);
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            er.l<? super String, oq.i0> lVar15 = lVar5;
                            lVar12 = (er.l) objE5;
                            lVar11 = lVar15;
                        } else {
                            lVar11 = lVar5;
                            lVar12 = lVar6;
                        }
                        if (i25 != 0) {
                            objE4 = rVarH.E();
                            if (objE4 == p076m2.r.INSTANCE.a()) {
                                objE4 = new er.l() { // from class: g43.t
                                    @Override // er.l
                                    public final Object b(Object obj2) {
                                        return y.z((String) obj2);
                                    }
                                };
                                rVarH.v(objE4);
                            }
                            lVar13 = (er.l) objE4;
                        } else {
                            lVar13 = lVar7;
                        }
                        if (i27 != 0) {
                            objE3 = rVarH.E();
                            if (objE3 == p076m2.r.INSTANCE.a()) {
                                objE3 = new er.p() { // from class: g43.u
                                    @Override // er.p
                                    public final Object B(Object obj2, Object obj3) {
                                        return y.A((String) obj2, (String) obj3);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            pVar3 = (er.p) objE3;
                        }
                        if (i29 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == p076m2.r.INSTANCE.a()) {
                                objE2 = new er.p() { // from class: g43.v
                                    @Override // er.p
                                    public final Object B(Object obj2, Object obj3) {
                                        return y.B((String) obj2, (String) obj3);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            pVar7 = (er.p) objE2;
                        } else {
                            pVar7 = pVar4;
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new er.q() { // from class: g43.w
                                    @Override // er.q
                                    public final Object w(Object obj2, Object obj3, Object obj4) {
                                        return y.C((String) obj2, (String) obj3, (f43.e) obj4);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            qVar3 = (er.q) objE;
                        } else {
                            qVar3 = qVar;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(298970709, i17, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavGraph (SchoolDashboardNavContent.kt:79)");
                        }
                        sVarJ = f00.r.J(null, rVarH, 0, 1);
                        d dVar = d.f70530a;
                        if ((i17 & 14) != 4 || ((i17 & 8) != 0 && rVarH.G(c0Var))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((234881024 & i17) == 67108864) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zG = z16 | z17 | rVarH.G(sVarJ);
                        if ((i17 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean z36 = zG | z18;
                        if ((i17 & 896) == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z37 = z36 | z19;
                        if ((i17 & 7168) == 2048) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z38 = z37 | z25;
                        if ((57344 & i17) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        boolean z39 = z38 | z26;
                        if ((458752 & i17) == 131072) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        boolean z45 = z39 | z27;
                        if ((29360128 & i17) == 8388608) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean z46 = z45 | z28;
                        if ((i17 & 3670016) == 1048576) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z35 = z46 | z29;
                        Object objE7 = rVarH.E();
                        if (!z35 || objE7 == p076m2.r.INSTANCE.a()) {
                            lVar14 = lVar11;
                            obj = new er.l() { // from class: g43.x
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                                }
                            };
                            rVarH.v(obj);
                        } else {
                            lVar14 = lVar11;
                            obj = objE7;
                        }
                        f00.d0.j(sVarJ, dVar, (er.l) obj, rVarH, f00.s.f54562e | 48);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        lVar8 = lVar14;
                        lVar10 = lVar12;
                        lVar9 = lVar13;
                        pVar6 = pVar3;
                        qVar2 = qVar3;
                        pVar5 = pVar7;
                    } else {
                        rVarH.O();
                        pVar5 = pVar4;
                        lVar8 = lVar5;
                        pVar6 = pVar3;
                        lVar9 = lVar7;
                        lVar10 = lVar6;
                        qVar2 = qVar;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: g43.g
                            @Override // er.p
                            public final Object B(Object obj2, Object obj3) {
                                return y.N(c0Var, lVar8, lVar2, lVar10, lVar9, pVar6, pVar5, qVar2, aVar, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                lVar7 = lVar4;
                i27 = i16 & 32;
                if (i27 != 0) {
                    i17 |= 196608;
                    pVar3 = pVar;
                } else {
                    pVar3 = pVar;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.G(pVar3)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                    pVar4 = pVar2;
                } else {
                    pVar4 = pVar2;
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.G(pVar4)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                }
                i36 = i16 & 128;
                if (i36 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.G(qVar)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i17 |= i37;
                }
                if ((i15 & 100663296) == 0) {
                    if (rVarH.G(aVar)) {
                        i38 = 67108864;
                    } else {
                        i38 = 33554432;
                    }
                    i17 |= i38;
                }
                if ((i17 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i45 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == p076m2.r.INSTANCE.a()) {
                            objE6 = new er.l() { // from class: g43.r
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return y.x((String) obj2);
                                }
                            };
                            rVarH.v(objE6);
                        }
                        lVar5 = (er.l) objE6;
                    }
                    if (i18 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == p076m2.r.INSTANCE.a()) {
                            objE5 = new er.l() { // from class: g43.s
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return y.y((String) obj2);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        er.l<? super String, oq.i0> lVar16 = lVar5;
                        lVar12 = (er.l) objE5;
                        lVar11 = lVar16;
                    } else {
                        lVar11 = lVar5;
                        lVar12 = lVar6;
                    }
                    if (i25 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == p076m2.r.INSTANCE.a()) {
                            objE4 = new er.l() { // from class: g43.t
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return y.z((String) obj2);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        lVar13 = (er.l) objE4;
                    } else {
                        lVar13 = lVar7;
                    }
                    if (i27 != 0) {
                        objE3 = rVarH.E();
                        if (objE3 == p076m2.r.INSTANCE.a()) {
                            objE3 = new er.p() { // from class: g43.u
                                @Override // er.p
                                public final Object B(Object obj2, Object obj3) {
                                    return y.A((String) obj2, (String) obj3);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        pVar3 = (er.p) objE3;
                    }
                    if (i29 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new er.p() { // from class: g43.v
                                @Override // er.p
                                public final Object B(Object obj2, Object obj3) {
                                    return y.B((String) obj2, (String) obj3);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        pVar7 = (er.p) objE2;
                    } else {
                        pVar7 = pVar4;
                    }
                    if (i36 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new er.q() { // from class: g43.w
                                @Override // er.q
                                public final Object w(Object obj2, Object obj3, Object obj4) {
                                    return y.C((String) obj2, (String) obj3, (f43.e) obj4);
                                }
                            };
                            rVarH.v(objE);
                        }
                        qVar3 = (er.q) objE;
                    } else {
                        qVar3 = qVar;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(298970709, i17, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavGraph (SchoolDashboardNavContent.kt:79)");
                    }
                    sVarJ = f00.r.J(null, rVarH, 0, 1);
                    d dVar2 = d.f70530a;
                    if ((i17 & 14) != 4) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if ((234881024 & i17) == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zG2 = z16 | z17 | rVarH.G(sVarJ);
                    if ((i17 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z310 = zG2 | z18;
                    if ((i17 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z311 = z310 | z19;
                    if ((i17 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z312 = z311 | z25;
                    if ((57344 & i17) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z313 = z312 | z26;
                    if ((458752 & i17) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z47 = z313 | z27;
                    if ((29360128 & i17) == 8388608) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z48 = z47 | z28;
                    if ((i17 & 3670016) == 1048576) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z35 = z48 | z29;
                    Object objE8 = rVarH.E();
                    if (z35) {
                        lVar14 = lVar11;
                        obj = new er.l() { // from class: g43.x
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                            }
                        };
                        rVarH.v(obj);
                    } else {
                        lVar14 = lVar11;
                        obj = new er.l() { // from class: g43.x
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                            }
                        };
                        rVarH.v(obj);
                    }
                    f00.d0.j(sVarJ, dVar2, (er.l) obj, rVarH, f00.s.f54562e | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    lVar8 = lVar14;
                    lVar10 = lVar12;
                    lVar9 = lVar13;
                    pVar6 = pVar3;
                    qVar2 = qVar3;
                    pVar5 = pVar7;
                } else {
                    rVarH.O();
                    pVar5 = pVar4;
                    lVar8 = lVar5;
                    pVar6 = pVar3;
                    lVar9 = lVar7;
                    lVar10 = lVar6;
                    qVar2 = qVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g43.g
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return y.N(c0Var, lVar8, lVar2, lVar10, lVar9, pVar6, pVar5, qVar2, aVar, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            lVar6 = lVar3;
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar7 = lVar4;
                    if (rVarH.G(lVar7)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 32;
                if (i27 != 0) {
                    i17 |= 196608;
                    pVar3 = pVar;
                } else {
                    pVar3 = pVar;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.G(pVar3)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                    pVar4 = pVar2;
                } else {
                    pVar4 = pVar2;
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.G(pVar4)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                }
                i36 = i16 & 128;
                if (i36 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.G(qVar)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i17 |= i37;
                }
                if ((i15 & 100663296) == 0) {
                    if (rVarH.G(aVar)) {
                        i38 = 67108864;
                    } else {
                        i38 = 33554432;
                    }
                    i17 |= i38;
                }
                if ((i17 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i45 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == p076m2.r.INSTANCE.a()) {
                            objE6 = new er.l() { // from class: g43.r
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return y.x((String) obj2);
                                }
                            };
                            rVarH.v(objE6);
                        }
                        lVar5 = (er.l) objE6;
                    }
                    if (i18 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == p076m2.r.INSTANCE.a()) {
                            objE5 = new er.l() { // from class: g43.s
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return y.y((String) obj2);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        er.l<? super String, oq.i0> lVar17 = lVar5;
                        lVar12 = (er.l) objE5;
                        lVar11 = lVar17;
                    } else {
                        lVar11 = lVar5;
                        lVar12 = lVar6;
                    }
                    if (i25 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == p076m2.r.INSTANCE.a()) {
                            objE4 = new er.l() { // from class: g43.t
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return y.z((String) obj2);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        lVar13 = (er.l) objE4;
                    } else {
                        lVar13 = lVar7;
                    }
                    if (i27 != 0) {
                        objE3 = rVarH.E();
                        if (objE3 == p076m2.r.INSTANCE.a()) {
                            objE3 = new er.p() { // from class: g43.u
                                @Override // er.p
                                public final Object B(Object obj2, Object obj3) {
                                    return y.A((String) obj2, (String) obj3);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        pVar3 = (er.p) objE3;
                    }
                    if (i29 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new er.p() { // from class: g43.v
                                @Override // er.p
                                public final Object B(Object obj2, Object obj3) {
                                    return y.B((String) obj2, (String) obj3);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        pVar7 = (er.p) objE2;
                    } else {
                        pVar7 = pVar4;
                    }
                    if (i36 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new er.q() { // from class: g43.w
                                @Override // er.q
                                public final Object w(Object obj2, Object obj3, Object obj4) {
                                    return y.C((String) obj2, (String) obj3, (f43.e) obj4);
                                }
                            };
                            rVarH.v(objE);
                        }
                        qVar3 = (er.q) objE;
                    } else {
                        qVar3 = qVar;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(298970709, i17, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavGraph (SchoolDashboardNavContent.kt:79)");
                    }
                    sVarJ = f00.r.J(null, rVarH, 0, 1);
                    d dVar3 = d.f70530a;
                    if ((i17 & 14) != 4) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if ((234881024 & i17) == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zG3 = z16 | z17 | rVarH.G(sVarJ);
                    if ((i17 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z314 = zG3 | z18;
                    if ((i17 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z315 = z314 | z19;
                    if ((i17 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z316 = z315 | z25;
                    if ((57344 & i17) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z317 = z316 | z26;
                    if ((458752 & i17) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z49 = z317 | z27;
                    if ((29360128 & i17) == 8388608) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z410 = z49 | z28;
                    if ((i17 & 3670016) == 1048576) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z35 = z410 | z29;
                    Object objE9 = rVarH.E();
                    if (z35) {
                        lVar14 = lVar11;
                        obj = new er.l() { // from class: g43.x
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                            }
                        };
                        rVarH.v(obj);
                    } else {
                        lVar14 = lVar11;
                        obj = new er.l() { // from class: g43.x
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                            }
                        };
                        rVarH.v(obj);
                    }
                    f00.d0.j(sVarJ, dVar3, (er.l) obj, rVarH, f00.s.f54562e | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    lVar8 = lVar14;
                    lVar10 = lVar12;
                    lVar9 = lVar13;
                    pVar6 = pVar3;
                    qVar2 = qVar3;
                    pVar5 = pVar7;
                } else {
                    rVarH.O();
                    pVar5 = pVar4;
                    lVar8 = lVar5;
                    pVar6 = pVar3;
                    lVar9 = lVar7;
                    lVar10 = lVar6;
                    qVar2 = qVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g43.g
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return y.N(c0Var, lVar8, lVar2, lVar10, lVar9, pVar6, pVar5, qVar2, aVar, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            lVar7 = lVar4;
            i27 = i16 & 32;
            if (i27 != 0) {
                i17 |= 196608;
                pVar3 = pVar;
            } else {
                pVar3 = pVar;
                if ((i15 & 196608) == 0) {
                    if (rVarH.G(pVar3)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
            }
            i29 = i16 & 64;
            if (i29 != 0) {
                i17 |= 1572864;
                pVar4 = pVar2;
            } else {
                pVar4 = pVar2;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(pVar4)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
            }
            i36 = i16 & 128;
            if (i36 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.G(qVar)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i17 |= i37;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.G(aVar)) {
                    i38 = 67108864;
                } else {
                    i38 = 33554432;
                }
                i17 |= i38;
            }
            if ((i17 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i45 != 0) {
                    objE6 = rVarH.E();
                    if (objE6 == p076m2.r.INSTANCE.a()) {
                        objE6 = new er.l() { // from class: g43.r
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.x((String) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    }
                    lVar5 = (er.l) objE6;
                }
                if (i18 != 0) {
                    objE5 = rVarH.E();
                    if (objE5 == p076m2.r.INSTANCE.a()) {
                        objE5 = new er.l() { // from class: g43.s
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.y((String) obj2);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    er.l<? super String, oq.i0> lVar18 = lVar5;
                    lVar12 = (er.l) objE5;
                    lVar11 = lVar18;
                } else {
                    lVar11 = lVar5;
                    lVar12 = lVar6;
                }
                if (i25 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == p076m2.r.INSTANCE.a()) {
                        objE4 = new er.l() { // from class: g43.t
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.z((String) obj2);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    lVar13 = (er.l) objE4;
                } else {
                    lVar13 = lVar7;
                }
                if (i27 != 0) {
                    objE3 = rVarH.E();
                    if (objE3 == p076m2.r.INSTANCE.a()) {
                        objE3 = new er.p() { // from class: g43.u
                            @Override // er.p
                            public final Object B(Object obj2, Object obj3) {
                                return y.A((String) obj2, (String) obj3);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    pVar3 = (er.p) objE3;
                }
                if (i29 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new er.p() { // from class: g43.v
                            @Override // er.p
                            public final Object B(Object obj2, Object obj3) {
                                return y.B((String) obj2, (String) obj3);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    pVar7 = (er.p) objE2;
                } else {
                    pVar7 = pVar4;
                }
                if (i36 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.q() { // from class: g43.w
                            @Override // er.q
                            public final Object w(Object obj2, Object obj3, Object obj4) {
                                return y.C((String) obj2, (String) obj3, (f43.e) obj4);
                            }
                        };
                        rVarH.v(objE);
                    }
                    qVar3 = (er.q) objE;
                } else {
                    qVar3 = qVar;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(298970709, i17, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavGraph (SchoolDashboardNavContent.kt:79)");
                }
                sVarJ = f00.r.J(null, rVarH, 0, 1);
                d dVar4 = d.f70530a;
                if ((i17 & 14) != 4) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if ((234881024 & i17) == 67108864) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zG4 = z16 | z17 | rVarH.G(sVarJ);
                if ((i17 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z318 = zG4 | z18;
                if ((i17 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z319 = z318 | z19;
                if ((i17 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z3110 = z319 | z25;
                if ((57344 & i17) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z3111 = z3110 | z26;
                if ((458752 & i17) == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z411 = z3111 | z27;
                if ((29360128 & i17) == 8388608) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z412 = z411 | z28;
                if ((i17 & 3670016) == 1048576) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z35 = z412 | z29;
                Object objE10 = rVarH.E();
                if (z35) {
                    lVar14 = lVar11;
                    obj = new er.l() { // from class: g43.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                        }
                    };
                    rVarH.v(obj);
                } else {
                    lVar14 = lVar11;
                    obj = new er.l() { // from class: g43.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                        }
                    };
                    rVarH.v(obj);
                }
                f00.d0.j(sVarJ, dVar4, (er.l) obj, rVarH, f00.s.f54562e | 48);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                lVar8 = lVar14;
                lVar10 = lVar12;
                lVar9 = lVar13;
                pVar6 = pVar3;
                qVar2 = qVar3;
                pVar5 = pVar7;
            } else {
                rVarH.O();
                pVar5 = pVar4;
                lVar8 = lVar5;
                pVar6 = pVar3;
                lVar9 = lVar7;
                lVar10 = lVar6;
                qVar2 = qVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g43.g
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return y.N(c0Var, lVar8, lVar2, lVar10, lVar9, pVar6, pVar5, qVar2, aVar, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        lVar5 = lVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) != 0) {
            if (rVarH.G(lVar2)) {
                i39 = 256;
            } else {
                i39 = 128;
            }
            i17 |= i39;
        }
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                lVar6 = lVar3;
                if (rVarH.G(lVar6)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar7 = lVar4;
                    if (rVarH.G(lVar7)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 32;
                if (i27 != 0) {
                    i17 |= 196608;
                    pVar3 = pVar;
                } else {
                    pVar3 = pVar;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.G(pVar3)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                }
                i29 = i16 & 64;
                if (i29 != 0) {
                    i17 |= 1572864;
                    pVar4 = pVar2;
                } else {
                    pVar4 = pVar2;
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.G(pVar4)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    }
                }
                i36 = i16 & 128;
                if (i36 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.G(qVar)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i17 |= i37;
                }
                if ((i15 & 100663296) == 0) {
                    if (rVarH.G(aVar)) {
                        i38 = 67108864;
                    } else {
                        i38 = 33554432;
                    }
                    i17 |= i38;
                }
                if ((i17 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i45 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == p076m2.r.INSTANCE.a()) {
                            objE6 = new er.l() { // from class: g43.r
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return y.x((String) obj2);
                                }
                            };
                            rVarH.v(objE6);
                        }
                        lVar5 = (er.l) objE6;
                    }
                    if (i18 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == p076m2.r.INSTANCE.a()) {
                            objE5 = new er.l() { // from class: g43.s
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return y.y((String) obj2);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        er.l<? super String, oq.i0> lVar19 = lVar5;
                        lVar12 = (er.l) objE5;
                        lVar11 = lVar19;
                    } else {
                        lVar11 = lVar5;
                        lVar12 = lVar6;
                    }
                    if (i25 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == p076m2.r.INSTANCE.a()) {
                            objE4 = new er.l() { // from class: g43.t
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return y.z((String) obj2);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        lVar13 = (er.l) objE4;
                    } else {
                        lVar13 = lVar7;
                    }
                    if (i27 != 0) {
                        objE3 = rVarH.E();
                        if (objE3 == p076m2.r.INSTANCE.a()) {
                            objE3 = new er.p() { // from class: g43.u
                                @Override // er.p
                                public final Object B(Object obj2, Object obj3) {
                                    return y.A((String) obj2, (String) obj3);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        pVar3 = (er.p) objE3;
                    }
                    if (i29 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new er.p() { // from class: g43.v
                                @Override // er.p
                                public final Object B(Object obj2, Object obj3) {
                                    return y.B((String) obj2, (String) obj3);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        pVar7 = (er.p) objE2;
                    } else {
                        pVar7 = pVar4;
                    }
                    if (i36 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new er.q() { // from class: g43.w
                                @Override // er.q
                                public final Object w(Object obj2, Object obj3, Object obj4) {
                                    return y.C((String) obj2, (String) obj3, (f43.e) obj4);
                                }
                            };
                            rVarH.v(objE);
                        }
                        qVar3 = (er.q) objE;
                    } else {
                        qVar3 = qVar;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(298970709, i17, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavGraph (SchoolDashboardNavContent.kt:79)");
                    }
                    sVarJ = f00.r.J(null, rVarH, 0, 1);
                    d dVar5 = d.f70530a;
                    if ((i17 & 14) != 4) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if ((234881024 & i17) == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zG5 = z16 | z17 | rVarH.G(sVarJ);
                    if ((i17 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z3112 = zG5 | z18;
                    if ((i17 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z3113 = z3112 | z19;
                    if ((i17 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z3114 = z3113 | z25;
                    if ((57344 & i17) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z3115 = z3114 | z26;
                    if ((458752 & i17) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z413 = z3115 | z27;
                    if ((29360128 & i17) == 8388608) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z414 = z413 | z28;
                    if ((i17 & 3670016) == 1048576) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z35 = z414 | z29;
                    Object objE11 = rVarH.E();
                    if (z35) {
                        lVar14 = lVar11;
                        obj = new er.l() { // from class: g43.x
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                            }
                        };
                        rVarH.v(obj);
                    } else {
                        lVar14 = lVar11;
                        obj = new er.l() { // from class: g43.x
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                            }
                        };
                        rVarH.v(obj);
                    }
                    f00.d0.j(sVarJ, dVar5, (er.l) obj, rVarH, f00.s.f54562e | 48);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    lVar8 = lVar14;
                    lVar10 = lVar12;
                    lVar9 = lVar13;
                    pVar6 = pVar3;
                    qVar2 = qVar3;
                    pVar5 = pVar7;
                } else {
                    rVarH.O();
                    pVar5 = pVar4;
                    lVar8 = lVar5;
                    pVar6 = pVar3;
                    lVar9 = lVar7;
                    lVar10 = lVar6;
                    qVar2 = qVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g43.g
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return y.N(c0Var, lVar8, lVar2, lVar10, lVar9, pVar6, pVar5, qVar2, aVar, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            lVar7 = lVar4;
            i27 = i16 & 32;
            if (i27 != 0) {
                i17 |= 196608;
                pVar3 = pVar;
            } else {
                pVar3 = pVar;
                if ((i15 & 196608) == 0) {
                    if (rVarH.G(pVar3)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
            }
            i29 = i16 & 64;
            if (i29 != 0) {
                i17 |= 1572864;
                pVar4 = pVar2;
            } else {
                pVar4 = pVar2;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(pVar4)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
            }
            i36 = i16 & 128;
            if (i36 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.G(qVar)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i17 |= i37;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.G(aVar)) {
                    i38 = 67108864;
                } else {
                    i38 = 33554432;
                }
                i17 |= i38;
            }
            if ((i17 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i45 != 0) {
                    objE6 = rVarH.E();
                    if (objE6 == p076m2.r.INSTANCE.a()) {
                        objE6 = new er.l() { // from class: g43.r
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.x((String) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    }
                    lVar5 = (er.l) objE6;
                }
                if (i18 != 0) {
                    objE5 = rVarH.E();
                    if (objE5 == p076m2.r.INSTANCE.a()) {
                        objE5 = new er.l() { // from class: g43.s
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.y((String) obj2);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    er.l<? super String, oq.i0> lVar110 = lVar5;
                    lVar12 = (er.l) objE5;
                    lVar11 = lVar110;
                } else {
                    lVar11 = lVar5;
                    lVar12 = lVar6;
                }
                if (i25 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == p076m2.r.INSTANCE.a()) {
                        objE4 = new er.l() { // from class: g43.t
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.z((String) obj2);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    lVar13 = (er.l) objE4;
                } else {
                    lVar13 = lVar7;
                }
                if (i27 != 0) {
                    objE3 = rVarH.E();
                    if (objE3 == p076m2.r.INSTANCE.a()) {
                        objE3 = new er.p() { // from class: g43.u
                            @Override // er.p
                            public final Object B(Object obj2, Object obj3) {
                                return y.A((String) obj2, (String) obj3);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    pVar3 = (er.p) objE3;
                }
                if (i29 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new er.p() { // from class: g43.v
                            @Override // er.p
                            public final Object B(Object obj2, Object obj3) {
                                return y.B((String) obj2, (String) obj3);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    pVar7 = (er.p) objE2;
                } else {
                    pVar7 = pVar4;
                }
                if (i36 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.q() { // from class: g43.w
                            @Override // er.q
                            public final Object w(Object obj2, Object obj3, Object obj4) {
                                return y.C((String) obj2, (String) obj3, (f43.e) obj4);
                            }
                        };
                        rVarH.v(objE);
                    }
                    qVar3 = (er.q) objE;
                } else {
                    qVar3 = qVar;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(298970709, i17, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavGraph (SchoolDashboardNavContent.kt:79)");
                }
                sVarJ = f00.r.J(null, rVarH, 0, 1);
                d dVar6 = d.f70530a;
                if ((i17 & 14) != 4) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if ((234881024 & i17) == 67108864) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zG6 = z16 | z17 | rVarH.G(sVarJ);
                if ((i17 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z3116 = zG6 | z18;
                if ((i17 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z3117 = z3116 | z19;
                if ((i17 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z3118 = z3117 | z25;
                if ((57344 & i17) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z3119 = z3118 | z26;
                if ((458752 & i17) == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z415 = z3119 | z27;
                if ((29360128 & i17) == 8388608) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z416 = z415 | z28;
                if ((i17 & 3670016) == 1048576) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z35 = z416 | z29;
                Object objE12 = rVarH.E();
                if (z35) {
                    lVar14 = lVar11;
                    obj = new er.l() { // from class: g43.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                        }
                    };
                    rVarH.v(obj);
                } else {
                    lVar14 = lVar11;
                    obj = new er.l() { // from class: g43.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                        }
                    };
                    rVarH.v(obj);
                }
                f00.d0.j(sVarJ, dVar6, (er.l) obj, rVarH, f00.s.f54562e | 48);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                lVar8 = lVar14;
                lVar10 = lVar12;
                lVar9 = lVar13;
                pVar6 = pVar3;
                qVar2 = qVar3;
                pVar5 = pVar7;
            } else {
                rVarH.O();
                pVar5 = pVar4;
                lVar8 = lVar5;
                pVar6 = pVar3;
                lVar9 = lVar7;
                lVar10 = lVar6;
                qVar2 = qVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g43.g
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return y.N(c0Var, lVar8, lVar2, lVar10, lVar9, pVar6, pVar5, qVar2, aVar, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        lVar6 = lVar3;
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                lVar7 = lVar4;
                if (rVarH.G(lVar7)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            i27 = i16 & 32;
            if (i27 != 0) {
                i17 |= 196608;
                pVar3 = pVar;
            } else {
                pVar3 = pVar;
                if ((i15 & 196608) == 0) {
                    if (rVarH.G(pVar3)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
            }
            i29 = i16 & 64;
            if (i29 != 0) {
                i17 |= 1572864;
                pVar4 = pVar2;
            } else {
                pVar4 = pVar2;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(pVar4)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                }
            }
            i36 = i16 & 128;
            if (i36 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.G(qVar)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i17 |= i37;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.G(aVar)) {
                    i38 = 67108864;
                } else {
                    i38 = 33554432;
                }
                i17 |= i38;
            }
            if ((i17 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i45 != 0) {
                    objE6 = rVarH.E();
                    if (objE6 == p076m2.r.INSTANCE.a()) {
                        objE6 = new er.l() { // from class: g43.r
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.x((String) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    }
                    lVar5 = (er.l) objE6;
                }
                if (i18 != 0) {
                    objE5 = rVarH.E();
                    if (objE5 == p076m2.r.INSTANCE.a()) {
                        objE5 = new er.l() { // from class: g43.s
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.y((String) obj2);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    er.l<? super String, oq.i0> lVar111 = lVar5;
                    lVar12 = (er.l) objE5;
                    lVar11 = lVar111;
                } else {
                    lVar11 = lVar5;
                    lVar12 = lVar6;
                }
                if (i25 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == p076m2.r.INSTANCE.a()) {
                        objE4 = new er.l() { // from class: g43.t
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.z((String) obj2);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    lVar13 = (er.l) objE4;
                } else {
                    lVar13 = lVar7;
                }
                if (i27 != 0) {
                    objE3 = rVarH.E();
                    if (objE3 == p076m2.r.INSTANCE.a()) {
                        objE3 = new er.p() { // from class: g43.u
                            @Override // er.p
                            public final Object B(Object obj2, Object obj3) {
                                return y.A((String) obj2, (String) obj3);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    pVar3 = (er.p) objE3;
                }
                if (i29 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new er.p() { // from class: g43.v
                            @Override // er.p
                            public final Object B(Object obj2, Object obj3) {
                                return y.B((String) obj2, (String) obj3);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    pVar7 = (er.p) objE2;
                } else {
                    pVar7 = pVar4;
                }
                if (i36 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.q() { // from class: g43.w
                            @Override // er.q
                            public final Object w(Object obj2, Object obj3, Object obj4) {
                                return y.C((String) obj2, (String) obj3, (f43.e) obj4);
                            }
                        };
                        rVarH.v(objE);
                    }
                    qVar3 = (er.q) objE;
                } else {
                    qVar3 = qVar;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(298970709, i17, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavGraph (SchoolDashboardNavContent.kt:79)");
                }
                sVarJ = f00.r.J(null, rVarH, 0, 1);
                d dVar7 = d.f70530a;
                if ((i17 & 14) != 4) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                if ((234881024 & i17) == 67108864) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zG7 = z16 | z17 | rVarH.G(sVarJ);
                if ((i17 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z31110 = zG7 | z18;
                if ((i17 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z31111 = z31110 | z19;
                if ((i17 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z31112 = z31111 | z25;
                if ((57344 & i17) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z31113 = z31112 | z26;
                if ((458752 & i17) == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z417 = z31113 | z27;
                if ((29360128 & i17) == 8388608) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z418 = z417 | z28;
                if ((i17 & 3670016) == 1048576) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z35 = z418 | z29;
                Object objE13 = rVarH.E();
                if (z35) {
                    lVar14 = lVar11;
                    obj = new er.l() { // from class: g43.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                        }
                    };
                    rVarH.v(obj);
                } else {
                    lVar14 = lVar11;
                    obj = new er.l() { // from class: g43.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                        }
                    };
                    rVarH.v(obj);
                }
                f00.d0.j(sVarJ, dVar7, (er.l) obj, rVarH, f00.s.f54562e | 48);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                lVar8 = lVar14;
                lVar10 = lVar12;
                lVar9 = lVar13;
                pVar6 = pVar3;
                qVar2 = qVar3;
                pVar5 = pVar7;
            } else {
                rVarH.O();
                pVar5 = pVar4;
                lVar8 = lVar5;
                pVar6 = pVar3;
                lVar9 = lVar7;
                lVar10 = lVar6;
                qVar2 = qVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g43.g
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return y.N(c0Var, lVar8, lVar2, lVar10, lVar9, pVar6, pVar5, qVar2, aVar, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        lVar7 = lVar4;
        i27 = i16 & 32;
        if (i27 != 0) {
            i17 |= 196608;
            pVar3 = pVar;
        } else {
            pVar3 = pVar;
            if ((i15 & 196608) == 0) {
                if (rVarH.G(pVar3)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i28;
            }
        }
        i29 = i16 & 64;
        if (i29 != 0) {
            i17 |= 1572864;
            pVar4 = pVar2;
        } else {
            pVar4 = pVar2;
            if ((i15 & 1572864) == 0) {
                if (rVarH.G(pVar4)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            }
        }
        i36 = i16 & 128;
        if (i36 != 0) {
            i17 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            if (rVarH.G(qVar)) {
                i37 = 8388608;
            } else {
                i37 = 4194304;
            }
            i17 |= i37;
        }
        if ((i15 & 100663296) == 0) {
            if (rVarH.G(aVar)) {
                i38 = 67108864;
            } else {
                i38 = 33554432;
            }
            i17 |= i38;
        }
        if ((i17 & 38347923) != 38347922) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i45 != 0) {
                objE6 = rVarH.E();
                if (objE6 == p076m2.r.INSTANCE.a()) {
                    objE6 = new er.l() { // from class: g43.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.x((String) obj2);
                        }
                    };
                    rVarH.v(objE6);
                }
                lVar5 = (er.l) objE6;
            }
            if (i18 != 0) {
                objE5 = rVarH.E();
                if (objE5 == p076m2.r.INSTANCE.a()) {
                    objE5 = new er.l() { // from class: g43.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.y((String) obj2);
                        }
                    };
                    rVarH.v(objE5);
                }
                er.l<? super String, oq.i0> lVar112 = lVar5;
                lVar12 = (er.l) objE5;
                lVar11 = lVar112;
            } else {
                lVar11 = lVar5;
                lVar12 = lVar6;
            }
            if (i25 != 0) {
                objE4 = rVarH.E();
                if (objE4 == p076m2.r.INSTANCE.a()) {
                    objE4 = new er.l() { // from class: g43.t
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.z((String) obj2);
                        }
                    };
                    rVarH.v(objE4);
                }
                lVar13 = (er.l) objE4;
            } else {
                lVar13 = lVar7;
            }
            if (i27 != 0) {
                objE3 = rVarH.E();
                if (objE3 == p076m2.r.INSTANCE.a()) {
                    objE3 = new er.p() { // from class: g43.u
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return y.A((String) obj2, (String) obj3);
                        }
                    };
                    rVarH.v(objE3);
                }
                pVar3 = (er.p) objE3;
            }
            if (i29 != 0) {
                objE2 = rVarH.E();
                if (objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new er.p() { // from class: g43.v
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return y.B((String) obj2, (String) obj3);
                        }
                    };
                    rVarH.v(objE2);
                }
                pVar7 = (er.p) objE2;
            } else {
                pVar7 = pVar4;
            }
            if (i36 != 0) {
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.q() { // from class: g43.w
                        @Override // er.q
                        public final Object w(Object obj2, Object obj3, Object obj4) {
                            return y.C((String) obj2, (String) obj3, (f43.e) obj4);
                        }
                    };
                    rVarH.v(objE);
                }
                qVar3 = (er.q) objE;
            } else {
                qVar3 = qVar;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(298970709, i17, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.SchoolDashboardNavGraph (SchoolDashboardNavContent.kt:79)");
            }
            sVarJ = f00.r.J(null, rVarH, 0, 1);
            d dVar8 = d.f70530a;
            if ((i17 & 14) != 4) {
                z16 = true;
            } else {
                z16 = true;
            }
            if ((234881024 & i17) == 67108864) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zG8 = z16 | z17 | rVarH.G(sVarJ);
            if ((i17 & 112) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z31114 = zG8 | z18;
            if ((i17 & 896) == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z31115 = z31114 | z19;
            if ((i17 & 7168) == 2048) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z31116 = z31115 | z25;
            if ((57344 & i17) == 16384) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z31117 = z31116 | z26;
            if ((458752 & i17) == 131072) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean z419 = z31117 | z27;
            if ((29360128 & i17) == 8388608) {
                z28 = true;
            } else {
                z28 = false;
            }
            boolean z4110 = z419 | z28;
            if ((i17 & 3670016) == 1048576) {
                z29 = true;
            } else {
                z29 = false;
            }
            z35 = z4110 | z29;
            Object objE14 = rVarH.E();
            if (z35) {
                lVar14 = lVar11;
                obj = new er.l() { // from class: g43.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                    }
                };
                rVarH.v(obj);
            } else {
                lVar14 = lVar11;
                obj = new er.l() { // from class: g43.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.D(c0Var, aVar, sVarJ, lVar14, lVar2, lVar12, lVar13, pVar3, qVar3, pVar7, (d1) obj2);
                    }
                };
                rVarH.v(obj);
            }
            f00.d0.j(sVarJ, dVar8, (er.l) obj, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            lVar8 = lVar14;
            lVar10 = lVar12;
            lVar9 = lVar13;
            pVar6 = pVar3;
            qVar2 = qVar3;
            pVar5 = pVar7;
        } else {
            rVarH.O();
            pVar5 = pVar4;
            lVar8 = lVar5;
            pVar6 = pVar3;
            lVar9 = lVar7;
            lVar10 = lVar6;
            qVar2 = qVar;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g43.g
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return y.N(c0Var, lVar8, lVar2, lVar10, lVar9, pVar6, pVar5, qVar2, aVar, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(String str) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(String str) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(String str) {
        return oq.i0.f148189a;
    }
}
