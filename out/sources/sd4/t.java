package sd4;

import android.os.Bundle;
import o73.StudentCardActivated;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lsd4/t;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "g2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Lgx/d;", "M0", "Lgx/d;", "h2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends x7 {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: sd4.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lsd4/t$a;", "", "<init>", "()V", "", "fromAddDocument", "clearProcess", "Lsd4/t;", "a", "(ZZ)Lsd4/t;", "", "TAG_ACTIVATE_STUDENT_CARD", "Ljava/lang/String;", "FROM_ADD_DOCUMENT", "CLEAR_PROCESS", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ t b(Companion companion, boolean z15, boolean z16, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                z16 = false;
            }
            return companion.a(z15, z16);
        }

        public final t a(boolean fromAddDocument, boolean clearProcess) {
            t tVar = new t();
            Bundle bundle = new Bundle();
            bundle.putBoolean("FROM_ADD_DOCUMENT", fromAddDocument);
            bundle.putBoolean("CLEAR_PROCESS", clearProcess);
            tVar.F1(bundle);
            return tVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(z73.a aVar, final t tVar, p076m2.r rVar, int i15) {
        k83.a aVar2;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1075643444, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.ActivateStudentCardFeatureFragment.GetContent.<anonymous> (ActivateStudentCardFeatureFragment.kt:37)");
            }
            boolean zG = rVar.G(tVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sd4.r
                    @Override // er.a
                    public final Object a() {
                        return t.d2(this.f180828a);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar3 = (er.a) objE;
            Bundle bundleV = tVar.v();
            boolean z15 = bundleV != null ? bundleV.getBoolean("FROM_ADD_DOCUMENT", true) : true;
            if (z15) {
                aVar2 = k83.a.b.C2602a.f109186a;
            } else {
                if (z15) {
                    throw new oq.p();
                }
                aVar2 = k83.a.b.C2603b.f109187a;
            }
            k83.a aVar4 = aVar2;
            boolean zG2 = rVar.G(tVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: sd4.s
                    @Override // er.a
                    public final Object a() {
                        return t.e2(this.f180847a);
                    }
                };
                rVar.v(objE2);
            }
            u73.x.w(aVar, aVar3, aVar4, (er.a) objE2, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(t tVar) {
        tVar.g2().c("TAG_ACTIVATE_STUDENT_CARD");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e2(t tVar) {
        tVar.g2().c("TAG_ACTIVATE_STUDENT_CARD");
        gx.d dVarH2 = tVar.h2();
        Bundle bundleV = tVar.v();
        dVarH2.c(new StudentCardActivated(bundleV != null ? bundleV.getBoolean("CLEAR_PROCESS") : false));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f2(t tVar, int i15, p076m2.r rVar, int i16) {
        tVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        Object obj;
        p076m2.r rVarH = rVar.h(-326156832);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-326156832, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.ActivateStudentCardFeatureFragment.GetContent (ActivateStudentCardFeatureFragment.kt:28)");
            }
            boolean zA = w0.h0.a(rVarH, 0);
            boolean zA2 = rVarH.a(zA);
            Object objE = rVarH.E();
            if (zA2 || objE == p076m2.r.INSTANCE.a()) {
                if (zA) {
                    obj = z73.d.f233307a;
                } else {
                    if (zA) {
                        throw new oq.p();
                    }
                    obj = z73.e.f233310a;
                }
                objE = obj;
                rVarH.v(objE);
            }
            final z73.a aVar = (z73.a) objE;
            mc4.d.d(false, y2.m.d(1075643444, true, new er.p() { // from class: sd4.p
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return t.c2(aVar, this, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.q
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return t.f2(this.f180808a, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public final rh2.a g2() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final gx.d h2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }
}
