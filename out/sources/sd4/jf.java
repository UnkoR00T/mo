package sd4;

import android.os.Bundle;
import java.io.Serializable;
import p071kotlin.Metadata;
import p090o74.C6463r;
import r74.DefaultNotificationDetailsData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lsd4/jf;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "e2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "M0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class jf extends v9 {

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int N0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: sd4.jf$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lsd4/jf$a;", "", "<init>", "()V", "Lr74/a;", "data", "Lsd4/jf;", "a", "(Lr74/a;)Lsd4/jf;", "", "TAG_ND_CONFIRMATION", "Ljava/lang/String;", "NOTIFICATION_DATA", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final jf a(DefaultNotificationDetailsData data) {
            jf jfVar = new jf();
            Bundle bundle = new Bundle();
            if (data != null) {
                bundle.putSerializable("NOTIFICATION_DATA", data);
            }
            jfVar.F1(bundle);
            return jfVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(final jf jfVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1216989100, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.NotificationDetailsFeatureFragment.GetContent.<anonymous> (NotificationDetailsFeatureFragment.kt:22)");
            }
            Bundle bundleV = jfVar.v();
            oq.i0 i0Var = null;
            Serializable serializable = bundleV != null ? bundleV.getSerializable("NOTIFICATION_DATA") : null;
            DefaultNotificationDetailsData defaultNotificationDetailsData = serializable instanceof DefaultNotificationDetailsData ? (DefaultNotificationDetailsData) serializable : null;
            if (defaultNotificationDetailsData == null) {
                rVar.X(-1503215228);
                rVar.R();
            } else {
                rVar.X(-1503215227);
                boolean zG = rVar.G(jfVar);
                Object objE = rVar.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: sd4.hf
                        @Override // er.a
                        public final Object a() {
                            return jf.c2(this.f180650a);
                        }
                    };
                    rVar.v(objE);
                }
                C6463r.f((er.a) objE, defaultNotificationDetailsData, rVar, 0);
                rVar.R();
                i0Var = oq.i0.f148189a;
            }
            if (i0Var == null) {
                jfVar.e2().c("NotificationDetailsFragment");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(jf jfVar) {
        jfVar.e2().c("NotificationDetailsFragment");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(jf jfVar, int i15, p076m2.r rVar, int i16) {
        jfVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1676177920);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1676177920, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.NotificationDetailsFeatureFragment.GetContent (NotificationDetailsFeatureFragment.kt:20)");
            }
            mc4.d.d(false, y2.m.d(-1216989100, true, new er.p() { // from class: sd4.ff
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return jf.b2(this.f180617a, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.gf
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return jf.d2(this.f180634a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
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
}
