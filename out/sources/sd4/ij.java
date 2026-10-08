package sd4;

import android.net.Uri;
import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lsd4/ij;", "Lj00/b;", "<init>", "()V", "Lf00/s;", "destinationNavigator", "Loq/i0;", "g2", "(Lf00/s;)V", "Landroid/os/Bundle;", "savedInstanceState", "x0", "(Landroid/os/Bundle;)V", "S1", "(Lm2/r;I)V", "Lrh2/a;", "L0", "Lrh2/a;", "f2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Landroid/net/Uri;", "M0", "Landroid/net/Uri;", "deeplink", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ij extends la {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private Uri deeplink;

    /* JADX INFO: renamed from: sd4.ij$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lsd4/ij$a;", "", "<init>", "()V", "Landroid/net/Uri;", "deeplink", "Lsd4/ij;", "a", "(Landroid/net/Uri;)Lsd4/ij;", "", "KEY_DEEP_LINK", "Ljava/lang/String;", "TAG_SAFE_BUS", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ ij b(Companion companion, Uri uri, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                uri = null;
            }
            return companion.a(uri);
        }

        public final ij a(Uri deeplink) {
            ij ijVar = new ij();
            Bundle bundle = new Bundle();
            if (deeplink != null) {
                bundle.putParcelable("deepLinkUri", deeplink);
            }
            ijVar.F1(bundle);
            return ijVar;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<f00.s, oq.i0> {
        b(Object obj) {
            super(1, obj, ij.class, "onNavGraphReady", "onNavGraphReady(Lpl/gov/coi/common/navigation/DestinationNavigator;)V", 0);
        }

        public final void E(f00.s sVar) {
            ((ij) this.f66391b).g2(sVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(f00.s sVar) {
            E(sVar);
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(s03.a aVar, final ij ijVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1687865300, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.SafeBusFeatureFragment.GetContent.<anonymous> (SafeBusFeatureFragment.kt:41)");
            }
            boolean zG = rVar.G(ijVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new b(ijVar);
                rVar.v(objE);
            }
            er.l lVar = (er.l) ((mr.g) objE);
            boolean zG2 = rVar.G(ijVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: sd4.hj
                    @Override // er.a
                    public final Object a() {
                        return ij.c2(this.f180654a);
                    }
                };
                rVar.v(objE2);
            }
            r03.m0.z(aVar, lVar, (er.a) objE2, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(ij ijVar) {
        ijVar.f2().c("SafeBusFragment");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(ij ijVar, int i15, p076m2.r rVar, int i16) {
        ijVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(f00.s destinationNavigator) {
        Uri uri = this.deeplink;
        if (uri != null) {
            destinationNavigator.getNavController().F(uri);
        }
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        Object obj;
        p076m2.r rVarH = rVar.h(1241531776);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1241531776, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.SafeBusFeatureFragment.GetContent (SafeBusFeatureFragment.kt:32)");
            }
            boolean zA = w0.h0.a(rVarH, 0);
            boolean zA2 = rVarH.a(zA);
            Object objE = rVarH.E();
            if (zA2 || objE == p076m2.r.INSTANCE.a()) {
                if (zA) {
                    obj = s03.d.f177175a;
                } else {
                    if (zA) {
                        throw new oq.p();
                    }
                    obj = s03.e.f177177a;
                }
                objE = obj;
                rVarH.v(objE);
            }
            final s03.a aVar = (s03.a) objE;
            mc4.d.d(false, y2.m.d(1687865300, true, new er.p() { // from class: sd4.fj
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return ij.b2(aVar, this, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.gj
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return ij.d2(this.f180638a, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
        super.x0(savedInstanceState);
        Bundle bundleV = v();
        this.deeplink = bundleV != null ? (Uri) bundleV.getParcelable("deepLinkUri") : null;
    }
}
