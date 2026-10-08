package sd4;

import android.os.Bundle;
import java.io.Serializable;
import p039en3.Function0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lsd4/fo;", "Lj00/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Loq/i0;", "x0", "(Landroid/os/Bundle;)V", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "g2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Lgx/d;", "M0", "Lgx/d;", "h2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "Lwm3/a;", "N0", "Lwm3/a;", "vehicleDestination", "O0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fo extends eb {

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int P0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private wm3.a vehicleDestination = wm3.a.b.f214154a;

    /* JADX INFO: renamed from: sd4.fo$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lsd4/fo$a;", "", "<init>", "()V", "Lwm3/a;", "destination", "Lsd4/fo;", "a", "(Lwm3/a;)Lsd4/fo;", "", "TAG_VEHICLES", "Ljava/lang/String;", "KEY_VEHICLE_DESTINATION", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final fo a(wm3.a destination) {
            fo foVar = new fo();
            Bundle bundle = new Bundle();
            bundle.putSerializable("vehicleDestination", destination);
            foVar.F1(bundle);
            return foVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(final fo foVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1848846496, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.VehiclesFeatureFragment.GetContent.<anonymous> (VehiclesFeatureFragment.kt:33)");
            }
            boolean zG = rVar.G(foVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sd4.co
                    @Override // er.a
                    public final Object a() {
                        return fo.d2(this.f180572a);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar = (er.a) objE;
            boolean zG2 = rVar.G(foVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: sd4.eo
                    @Override // er.l
                    public final Object b(Object obj) {
                        return fo.e2(this.f180610a, (gx.b) obj);
                    }
                };
                rVar.v(objE2);
            }
            Function0.x(aVar, (er.l) objE2, foVar.vehicleDestination, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(fo foVar) {
        foVar.g2().c("TAG_VEHICLES");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e2(fo foVar, gx.b bVar) {
        foVar.h2().c(bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f2(fo foVar, int i15, p076m2.r rVar, int i16) {
        foVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1875907764);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1875907764, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.VehiclesFeatureFragment.GetContent (VehiclesFeatureFragment.kt:31)");
            }
            mc4.d.d(false, y2.m.d(1848846496, true, new er.p() { // from class: sd4.ao
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return fo.c2(this.f180541a, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.bo
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return fo.f2(this.f180556a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
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

    @Override // androidx.fragment.app.o
    public void x0(Bundle savedInstanceState) {
        super.x0(savedInstanceState);
        Bundle bundleV = v();
        Serializable serializable = bundleV != null ? bundleV.getSerializable("vehicleDestination") : null;
        wm3.a aVar = serializable instanceof wm3.a ? (wm3.a) serializable : null;
        if (aVar == null) {
            aVar = wm3.a.b.f214154a;
        }
        this.vehicleDestination = aVar;
    }
}
