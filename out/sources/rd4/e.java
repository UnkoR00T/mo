package rd4;

import er.p;
import oq.i0;
import p059i01.Function0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lrd4/e;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "g2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Lgx/d;", "M0", "Lgx/d;", "h2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends n {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: rd4.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrd4/e$a;", "", "<init>", "()V", "Lrd4/e;", "a", "()Lrd4/e;", "", "TAG_APP_RATING", "Ljava/lang/String;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final e a() {
            return new e();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c2(final e eVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1216043716, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.AppRatingFeatureFragment.GetContent.<anonymous> (AppRatingFeatureFragment.kt:22)");
            }
            boolean zG = rVar.G(eVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: rd4.c
                    @Override // er.a
                    public final Object a() {
                        return e.d2(this.f173276a);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar = (er.a) objE;
            boolean zG2 = rVar.G(eVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: rd4.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.e2(this.f173277a, (gx.b) obj);
                    }
                };
                rVar.v(objE2);
            }
            Function0.x(aVar, (er.l) objE2, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d2(e eVar) {
        eVar.g2().c("TAG_APP_RATING");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e2(e eVar, gx.b bVar) {
        eVar.h2().c(bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f2(e eVar, int i15, r rVar, int i16) {
        eVar.S1(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // j00.b
    public void S1(r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1011079400);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1011079400, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.AppRatingFeatureFragment.GetContent (AppRatingFeatureFragment.kt:21)");
            }
            mc4.d.d(false, y2.m.d(-1216043716, true, new p() { // from class: rd4.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.c2(this.f173273a, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: rd4.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.f2(this.f173274a, i15, (r) obj, ((Integer) obj2).intValue());
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
