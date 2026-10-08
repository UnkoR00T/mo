package sd4;

import android.os.Build;
import android.os.Bundle;
import p071kotlin.Metadata;
import p091o83.Function0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lsd4/bm;", "Lj00/b;", "<init>", "()V", "Lvd4/a;", "Lr83/a;", "g2", "(Lvd4/a;)Lr83/a;", "Landroid/os/Bundle;", "e2", "(Landroid/os/Bundle;)Lvd4/a;", "savedInstanceState", "Loq/i0;", "x0", "(Landroid/os/Bundle;)V", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "f2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "M0", "Lr83/a;", "entryPoint", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bm extends va {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private r83.a entryPoint = r83.a.C4394a.f172348b;

    /* JADX INFO: renamed from: sd4.bm$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lsd4/bm$a;", "", "<init>", "()V", "Lvd4/a;", "entryPoint", "Lsd4/bm;", "a", "(Lvd4/a;)Lsd4/bm;", "", "TAG_TECHNICAL_SUPPORT", "Ljava/lang/String;", "TECHNICAL_SUPPORT_ENTRY_POINT", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final bm a(vd4.a entryPoint) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("TECHNICAL_SUPPORT_ENTRY_POINT", entryPoint);
            bm bmVar = new bm();
            bmVar.F1(bundle);
            return bmVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(final bm bmVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1957241738, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.TechnicalSupportFeatureFragment.GetContent.<anonymous> (TechnicalSupportFeatureFragment.kt:44)");
            }
            boolean zG = rVar.G(bmVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sd4.am
                    @Override // er.a
                    public final Object a() {
                        return bm.c2(this.f180540a);
                    }
                };
                rVar.v(objE);
            }
            Function0.x((er.a) objE, bmVar.entryPoint, rVar, r83.a.f172347a << 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(bm bmVar) {
        bmVar.f2().c("TAG_TECHNICAL_SUPPORT");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(bm bmVar, int i15, p076m2.r rVar, int i16) {
        bmVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private final vd4.a e2(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? (vd4.a) bundle.getParcelable("TECHNICAL_SUPPORT_ENTRY_POINT", vd4.a.class) : (vd4.a) bundle.getParcelable("TECHNICAL_SUPPORT_ENTRY_POINT");
    }

    private final r83.a g2(vd4.a aVar) {
        if (fr.t.c(aVar, vd4.a.b.f206267a)) {
            return r83.a.b.f172349b;
        }
        if (fr.t.c(aVar, vd4.a.C5389a.f206265a)) {
            return r83.a.C4394a.f172348b;
        }
        throw new oq.p();
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(565233442);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(565233442, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.TechnicalSupportFeatureFragment.GetContent (TechnicalSupportFeatureFragment.kt:42)");
            }
            mc4.d.d(false, y2.m.d(-1957241738, true, new er.p() { // from class: sd4.yl
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return bm.b2(this.f180962a, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.zl
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return bm.d2(this.f180982a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final rh2.a f2() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.o
    public void x0(Bundle savedInstanceState) {
        vd4.a aVarE2;
        super.x0(savedInstanceState);
        Bundle bundleV = v();
        if (bundleV == null || (aVarE2 = e2(bundleV)) == null) {
            return;
        }
        this.entryPoint = g2(aVarE2);
    }
}
