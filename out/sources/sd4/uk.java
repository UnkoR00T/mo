package sd4;

import h94.ToSchoolBehavior;
import ma4.ToSchoolLessonDetails;
import ma4.ToSchoolTimetable;
import p071kotlin.Metadata;
import q84.ToAbsenceStatusDetails;
import q84.ToSchoolAttendance;
import u94.ToGradeDetails;
import u94.ToSchoolGrades;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lsd4/uk;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "t2", "()Lrh2/a;", "setNavigator", "(Lrh2/a;)V", "navigator", "Lgx/d;", "M0", "Lgx/d;", "s2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class uk extends qa {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a navigator;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: sd4.uk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsd4/uk$a;", "", "<init>", "()V", "Lsd4/uk;", "a", "()Lsd4/uk;", "", "TAG", "Ljava/lang/String;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final uk a() {
            return new uk();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i2(h43.a aVar, final uk ukVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(775703988, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.SchoolDashboardFeatureFragment.GetContent.<anonymous> (SchoolDashboardFeatureFragment.kt:42)");
            }
            boolean zG = rVar.G(ukVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: sd4.mk
                    @Override // er.l
                    public final Object b(Object obj) {
                        return uk.j2(this.f180751a, (String) obj);
                    }
                };
                rVar.v(objE);
            }
            er.l lVar = (er.l) objE;
            boolean zG2 = rVar.G(ukVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: sd4.nk
                    @Override // er.l
                    public final Object b(Object obj) {
                        return uk.k2(this.f180767a, (String) obj);
                    }
                };
                rVar.v(objE2);
            }
            er.l lVar2 = (er.l) objE2;
            boolean zG3 = rVar.G(ukVar);
            Object objE3 = rVar.E();
            if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new er.l() { // from class: sd4.ok
                    @Override // er.l
                    public final Object b(Object obj) {
                        return uk.l2(this.f180780a, (String) obj);
                    }
                };
                rVar.v(objE3);
            }
            er.l lVar3 = (er.l) objE3;
            boolean zG4 = rVar.G(ukVar);
            Object objE4 = rVar.E();
            if (zG4 || objE4 == p076m2.r.INSTANCE.a()) {
                objE4 = new er.l() { // from class: sd4.pk
                    @Override // er.l
                    public final Object b(Object obj) {
                        return uk.m2(this.f180802a, (String) obj);
                    }
                };
                rVar.v(objE4);
            }
            er.l lVar4 = (er.l) objE4;
            boolean zG5 = rVar.G(ukVar);
            Object objE5 = rVar.E();
            if (zG5 || objE5 == p076m2.r.INSTANCE.a()) {
                objE5 = new er.p() { // from class: sd4.qk
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return uk.n2(this.f180823a, (String) obj, (String) obj2);
                    }
                };
                rVar.v(objE5);
            }
            er.p pVar = (er.p) objE5;
            boolean zG6 = rVar.G(ukVar);
            Object objE6 = rVar.E();
            if (zG6 || objE6 == p076m2.r.INSTANCE.a()) {
                objE6 = new er.p() { // from class: sd4.rk
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return uk.o2(this.f180844a, (String) obj, (String) obj2);
                    }
                };
                rVar.v(objE6);
            }
            er.p pVar2 = (er.p) objE6;
            boolean zG7 = rVar.G(ukVar);
            Object objE7 = rVar.E();
            if (zG7 || objE7 == p076m2.r.INSTANCE.a()) {
                objE7 = new er.q() { // from class: sd4.sk
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return uk.p2(this.f180860a, (String) obj, (String) obj2, (f43.e) obj3);
                    }
                };
                rVar.v(objE7);
            }
            er.q qVar = (er.q) objE7;
            boolean zG8 = rVar.G(ukVar);
            Object objE8 = rVar.E();
            if (zG8 || objE8 == p076m2.r.INSTANCE.a()) {
                objE8 = new er.a() { // from class: sd4.tk
                    @Override // er.a
                    public final Object a() {
                        return uk.q2(this.f180877a);
                    }
                };
                rVar.v(objE8);
            }
            g43.y.t(aVar, lVar, lVar2, lVar3, lVar4, pVar, pVar2, qVar, (er.a) objE8, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j2(uk ukVar, String str) {
        ukVar.s2().c(new ToSchoolGrades(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k2(uk ukVar, String str) {
        ukVar.s2().c(new ToSchoolAttendance(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l2(uk ukVar, String str) {
        ukVar.s2().c(new ToSchoolTimetable(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m2(uk ukVar, String str) {
        ukVar.s2().c(new ToSchoolBehavior(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n2(uk ukVar, String str, String str2) {
        ukVar.s2().c(new ToGradeDetails(str2, str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o2(uk ukVar, String str, String str2) {
        ukVar.s2().c(new ToSchoolLessonDetails(str, str2));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p2(uk ukVar, String str, String str2, f43.e eVar) {
        s84.h hVarB = vk.b(eVar);
        if (hVarB != null) {
            ukVar.s2().c(new ToAbsenceStatusDetails(str, str2, hVarB));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q2(uk ukVar) {
        ukVar.t2().c("SCHOOL_DASHBOARD_TAG");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r2(uk ukVar, int i15, p076m2.r rVar, int i16) {
        ukVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        Object obj;
        p076m2.r rVarH = rVar.h(-852954272);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-852954272, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.SchoolDashboardFeatureFragment.GetContent (SchoolDashboardFeatureFragment.kt:33)");
            }
            boolean zA = w0.h0.a(rVarH, 0);
            boolean zA2 = rVarH.a(zA);
            Object objE = rVarH.E();
            if (zA2 || objE == p076m2.r.INSTANCE.a()) {
                if (zA) {
                    obj = h43.d.f80986a;
                } else {
                    if (zA) {
                        throw new oq.p();
                    }
                    obj = h43.e.f80988a;
                }
                objE = obj;
                rVarH.v(objE);
            }
            final h43.a aVar = (h43.a) objE;
            mc4.d.d(false, y2.m.d(775703988, true, new er.p() { // from class: sd4.kk
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return uk.i2(aVar, this, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        p076m2.d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sd4.lk
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return uk.r2(this.f180731a, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public final gx.d s2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    public final rh2.a t2() {
        rh2.a aVar = this.navigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }
}
