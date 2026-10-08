package sd4;

import android.os.Bundle;
import p071kotlin.Metadata;
import wn3.FromDynamicMultiDocument;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lsd4/j5;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "getFragmentNavigator", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Lgx/d;", "M0", "Lgx/d;", "e2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j5 extends u8 {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: sd4.j5$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lsd4/j5$a;", "", "<init>", "()V", "Lrq0/b$c;", "dynamicMultiDocumentType", "Lsd4/j5;", "a", "(Lrq0/b$c;)Lsd4/j5;", "", "TAG_DYNAMIC_MULTI_DOCUMENT", "Ljava/lang/String;", "DYNAMIC_MULTI_DOCUMENT_TYPE", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final j5 a(rq0.b.c dynamicMultiDocumentType) {
            j5 j5Var = new j5();
            Bundle bundle = new Bundle();
            bundle.putString("DYNAMIC_MUTLI_DOCUMENT_TYPE", dynamicMultiDocumentType.getReferenceName());
            j5Var.F1(bundle);
            return j5Var;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(final j5 j5Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(322769916, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.DynamicMultiDocumentFeatureFragment.GetContent.<anonymous> (DynamicMultiDocumentFeatureFragment.kt:29)");
            }
            rq0.b.c.Companion companion = rq0.b.c.INSTANCE;
            Bundle bundleV = j5Var.v();
            rq0.b.c cVarA = companion.a(bundleV != null ? bundleV.getString("DYNAMIC_MUTLI_DOCUMENT_TYPE") : null);
            boolean zG = rVar.G(j5Var);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: sd4.i5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j5.c2(this.f180663a, (fw1.g0) obj);
                    }
                };
                rVar.v(objE);
            }
            fw1.f0.v(cVarA, (er.l) objE, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(j5 j5Var, fw1.g0 g0Var) {
        if (fr.t.c(g0Var, fw1.g0.a.f68396a)) {
            j5Var.e2().c(new tg1.a.ToDashboard(false, 1, null));
        } else if (g0Var instanceof fw1.g0.VerifyMultiDocument) {
            fw1.g0.VerifyMultiDocument verifyMultiDocument = (fw1.g0.VerifyMultiDocument) g0Var;
            j5Var.e2().c(new FromDynamicMultiDocument(verifyMultiDocument.getDocumentId(), verifyMultiDocument.getDynamicMultiDocumentType()));
        } else {
            if (!fr.t.c(g0Var, fw1.g0.b.f68397a)) {
                throw new oq.p();
            }
            j5Var.e2().c(l03.a.C2766a.f113996a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(j5 j5Var, int i15, p076m2.r rVar, int i16) {
        j5Var.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1812435624);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1812435624, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.DynamicMultiDocumentFeatureFragment.GetContent (DynamicMultiDocumentFeatureFragment.kt:28)");
            }
            mc4.d.d(false, y2.m.d(322769916, true, new er.p() { // from class: sd4.g5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j5.b2(this.f180628a, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.h5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j5.d2(this.f180643a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final gx.d e2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }
}
