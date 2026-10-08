package sd4;

import android.os.Bundle;
import i93.MalwareDataPayload;
import p057h93.Function0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lsd4/hm;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "L0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class hm extends wa {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int M0 = j00.b.F0;

    /* JADX INFO: renamed from: sd4.hm$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lsd4/hm$a;", "", "<init>", "()V", "Lwd4/a;", "threatType", "Lsd4/hm;", "a", "(Lwd4/a;)Lsd4/hm;", "", "TAG_SECURITY_ALERT", "Ljava/lang/String;", "TAG_THREAT_TYPE", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final hm a(wd4.a threatType) {
            hm hmVar = new hm();
            Bundle bundle = new Bundle();
            bundle.putParcelable("TAG_THREAT_TYPE", threatType);
            hmVar.F1(bundle);
            return hmVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(final hm hmVar, p076m2.r rVar, int i15) {
        Object obj;
        p057h93.a aVar;
        MalwareDataPayload malwareDataPayload;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(479948500, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.ThreatDetectionFeatureFragment.GetContent.<anonymous> (ThreatDetectionFeatureFragment.kt:18)");
            }
            Bundle bundleV = hmVar.v();
            if (bundleV == null || (obj = (wd4.a) bundleV.getParcelable("TAG_THREAT_TYPE")) == null) {
                obj = wd4.a.c.f212542a;
            }
            boolean zG = rVar.G(hmVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sd4.gm
                    @Override // er.a
                    public final Object a() {
                        return hm.c2(this.f180642a);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar2 = (er.a) objE;
            wd4.a.c cVar = wd4.a.c.f212542a;
            if (fr.t.c(obj, cVar)) {
                aVar = p057h93.a.C1892a.f82200b;
            } else if (obj instanceof wd4.a.MalwareDetection) {
                aVar = h93.a.b.f82202b;
            } else {
                if (!fr.t.c(obj, wd4.a.b.f212540a)) {
                    throw new oq.p();
                }
                aVar = h93.a.c.f82204b;
            }
            if (fr.t.c(obj, cVar) || fr.t.c(obj, wd4.a.b.f212540a)) {
                malwareDataPayload = null;
            } else {
                if (!(obj instanceof wd4.a.MalwareDetection)) {
                    throw new oq.p();
                }
                wd4.a.MalwareDetection malwareDetection = (wd4.a.MalwareDetection) obj;
                malwareDataPayload = new MalwareDataPayload(pq.v.e(malwareDetection.getDangerousToolsName()), pq.v.e(malwareDetection.getDangerousToolsPackage()));
            }
            Function0.i(aVar2, aVar, malwareDataPayload, rVar, (p057h93.a.f82199a << 3) | (MalwareDataPayload.f90537c << 6));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(hm hmVar) {
        androidx.fragment.app.p pVarR = hmVar.r();
        if (pVarR != null) {
            pVarR.finishAndRemoveTask();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(hm hmVar, int i15, p076m2.r rVar, int i16) {
        hmVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1148709760);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(this) : rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1148709760, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.ThreatDetectionFeatureFragment.GetContent (ThreatDetectionFeatureFragment.kt:16)");
            }
            mc4.d.d(false, y2.m.d(479948500, true, new er.p() { // from class: sd4.em
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return hm.b2(this.f180608a, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.fm
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return hm.d2(this.f180625a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
