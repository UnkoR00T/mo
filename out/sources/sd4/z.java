package sd4;

import android.os.Bundle;
import java.io.Serializable;
import o73.ToAddJuniorSchoolCard;
import p071kotlin.Metadata;
import zw0.EIdActivationData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lsd4/z;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lgx/d;", "L0", "Lgx/d;", "f2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "Lrh2/a;", "M0", "Lrh2/a;", "e2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends y7 {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: sd4.z$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lsd4/z$a;", "", "<init>", "()V", "", "canNavigateBack", "Lzw0/a$a$a;", "destination", "isCertUpdate", "Lzw0/b;", "eIdActivationData", "Lsd4/z;", "a", "(ZLzw0/a$a$a;ZLzw0/b;)Lsd4/z;", "", "TAG", "Ljava/lang/String;", "KEY_CAN_NAVIGATE_BACK", "KEY_IS_CERT_UPDATE", "KEY_DESTINATION", "KEY_E_ID_ACTIVATION_DATA", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ z b(Companion companion, boolean z15, zw0.a.ToAddDocument.EnumC6430a enumC6430a, boolean z16, EIdActivationData eIdActivationData, int i15, Object obj) {
            if ((i15 & 4) != 0) {
                z16 = false;
            }
            if ((i15 & 8) != 0) {
                eIdActivationData = null;
            }
            return companion.a(z15, enumC6430a, z16, eIdActivationData);
        }

        public final z a(boolean canNavigateBack, zw0.a.ToAddDocument.EnumC6430a destination, boolean isCertUpdate, EIdActivationData eIdActivationData) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_CAN_NAVIGATE_BACK", canNavigateBack);
            bundle.putSerializable("KEY_DESTINATION", destination);
            bundle.putBoolean("KEY_IS_CERT_UPDATE", isCertUpdate);
            bundle.putSerializable("KEY_E_ID_ACTIVATION_DATA", eIdActivationData);
            z zVar = new z();
            zVar.F1(bundle);
            return zVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(final z zVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1527963468, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.AddDocumentFeatureFragment.GetContent.<anonymous> (AddDocumentFeatureFragment.kt:34)");
            }
            Bundle bundleV = zVar.v();
            Serializable serializable = bundleV != null ? bundleV.getSerializable("KEY_DESTINATION") : null;
            zw0.a.ToAddDocument.EnumC6430a enumC6430a = serializable instanceof zw0.a.ToAddDocument.EnumC6430a ? (zw0.a.ToAddDocument.EnumC6430a) serializable : null;
            Bundle bundleV2 = zVar.v();
            boolean z15 = bundleV2 != null ? bundleV2.getBoolean("KEY_CAN_NAVIGATE_BACK", false) : false;
            if (enumC6430a == null) {
                enumC6430a = zw0.a.ToAddDocument.EnumC6430a.ASYNC_MAIN_DOCUMENTS_LIST;
            }
            zw0.a.ToAddDocument.EnumC6430a enumC6430a2 = enumC6430a;
            Bundle bundleV3 = zVar.v();
            boolean z16 = bundleV3 != null ? bundleV3.getBoolean("KEY_IS_CERT_UPDATE", false) : false;
            Bundle bundleV4 = zVar.v();
            Serializable serializable2 = bundleV4 != null ? bundleV4.getSerializable("KEY_E_ID_ACTIVATION_DATA") : null;
            EIdActivationData eIdActivationData = serializable2 instanceof EIdActivationData ? (EIdActivationData) serializable2 : null;
            boolean zG = rVar.G(zVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: sd4.y
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z.c2(this.f180946a, (ex0.b) obj);
                    }
                };
                rVar.v(objE);
            }
            ex0.p0.I(z15, (er.l) objE, enumC6430a2, z16, eIdActivationData, rVar, 0, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(z zVar, ex0.b bVar) {
        if (fr.t.c(bVar, ex0.b.c.f53918a)) {
            zVar.e2().c("FRAGMENT_TAG_FEATURE_ADD_DOCUMENT");
        } else if (fr.t.c(bVar, ex0.b.a.f53916a)) {
            zVar.f2().c(gx.a.b.f78191a);
        } else if (fr.t.c(bVar, ex0.b.e.f53920a)) {
            zVar.f2().c(o73.c.f142932a);
        } else if (fr.t.c(bVar, ex0.b.d.f53919a)) {
            zVar.f2().c(new ToAddJuniorSchoolCard(false));
        } else if (fr.t.c(bVar, ex0.b.g.f53922a)) {
            ij2.a.b(false);
            Bundle bundleV = zVar.v();
            if (bundleV != null && bundleV.getBoolean("KEY_IS_CERT_UPDATE", false)) {
                zVar.f2().c(tg1.a.C4953a.f190065a);
            }
            zVar.f2().c(new tg1.a.ToDashboard(true));
        } else if (bVar instanceof ex0.b.GoToDashboard) {
            zVar.f2().c(new tg1.a.ToDashboard(((ex0.b.GoToDashboard) bVar).getClearProcesses()));
        } else if (fr.t.c(bVar, ex0.b.C1275b.f53917a)) {
            zVar.f2().c(tg1.a.c.f190067a);
            zVar.f2().c(new tg1.a.ToDashboard(false, 1, null));
        } else if (fr.t.c(bVar, ex0.b.h.f53923a)) {
            zVar.f2().c(hx1.a.c.f86825a);
        } else {
            if (!fr.t.c(bVar, ex0.b.i.f53924a)) {
                throw new oq.p();
            }
            zVar.f2().c(new po2.a.ToOnboarding(false, true, false, 5, null));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(z zVar, int i15, p076m2.r rVar, int i16) {
        zVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1568682592);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1568682592, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.AddDocumentFeatureFragment.GetContent (AddDocumentFeatureFragment.kt:33)");
            }
            mc4.d.d(false, y2.m.d(-1527963468, true, new er.p() { // from class: sd4.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.b2(this.f180913a, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.d2(this.f180929a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final rh2.a e2() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final gx.d f2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }
}
