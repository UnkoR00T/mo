# Paczka 191 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `sd4/ih.java`

## sd4/ih.java

```java
package sd4;

import android.net.Uri;
import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lsd4/ih;", "Lj00/b;", "<init>", "()V", "Lf00/s;", "destinationNavigator", "Loq/i0;", "h2", "(Lf00/s;)V", "g2", "Landroid/os/Bundle;", "savedInstanceState", "x0", "(Landroid/os/Bundle;)V", "S1", "(Lm2/r;I)V", "Lgx/d;", "L0", "Lgx/d;", "f2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "Lrh2/a;", "M0", "Lrh2/a;", "e2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Landroid/net/Uri;", "N0", "Landroid/net/Uri;", "deeplink", "", "O0", "Ljava/lang/String;", "paymentId", "", "P0", "Z", "navigateBackToDashboard", "Lc42/e3;", "Q0", "Lc42/e3;", "paymentsEntryPointData", "R0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ih extends da {

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int S0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private Uri deeplink;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private String paymentId;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private boolean navigateBackToDashboard;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private p024c42.e3 paymentsEntryPointData;

    /* JADX INFO: renamed from: sd4.ih$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lsd4/ih$a;", "", "<init>", "()V", "", "paymentId", "Landroid/net/Uri;", "deeplink", "", "navigateBackToDashboard", "Lc42/e3;", "paymentsEntryPointData", "Lsd4/ih;", "a", "(Ljava/lang/String;Landroid/net/Uri;ZLc42/e3;)Lsd4/ih;", "TAG_FEATURE_PAYMENTS", "Ljava/lang/String;", "KEY_DEEP_LINK", "KEY_PAYMENT_ID", "KEY_NAVIGATE_BACK_TO_DASHBOARD", "KEY_PAYMENTS_ENTRY_POINT", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ ih b(Companion companion, String str, Uri uri, boolean z15, p024c42.e3 e3Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = null;
            }
            if ((i15 & 2) != 0) {
                uri = null;
            }
            if ((i15 & 4) != 0) {
                z15 = false;
            }
            return companion.a(str, uri, z15, e3Var);
        }

        public final ih a(String paymentId, Uri deeplink, boolean navigateBackToDashboard, p024c42.e3 paymentsEntryPointData) {
            ih ihVar = new ih();
            Bundle bundle = new Bundle();
            if (paymentId != null) {
                bundle.putString("paymentId", paymentId);
            }
            if (deeplink != null) {
                bundle.putParcelable("deepLinkUri", deeplink);
            }
            bundle.putBoolean("navigateBackToDashboard", navigateBackToDashboard);
            bundle.putParcelable("paymentsEntryPoint", paymentsEntryPointData);
            ihVar.F1(bundle);
            return ihVar;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<f00.s, oq.i0> {
        b(Object obj) {
            super(1, obj, ih.class, "onNavGraphReady", "onNavGraphReady(Lpl/gov/coi/common/navigation/DestinationNavigator;)V", 0);
        }

        public final void E(f00.s sVar) {
            ((ih) this.f66391b).h2(sVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(f00.s sVar) {
            E(sVar);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.a<oq.i0> {
        c(Object obj) {
            super(0, obj, ih.class, "getNavResult", "getNavResult()V", 0);
        }

        public final void E() {
            ((ih) this.f66391b).g2();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a2(f42.a aVar, ih ihVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1149049076, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.PaymentFeatureFragment.GetContent.<anonymous> (PaymentFeatureFragment.kt:52)");
            }
            boolean zG = rVar.G(ihVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new b(ihVar);
                rVar.v(objE);
            }
            er.l lVar = (er.l) ((mr.g) objE);
            p024c42.e3 e3Var = ihVar.paymentsEntryPointData;
            if (e3Var == null) {
                e3Var = c42.e3.b.f23168a;
            }
            p024c42.e3 e3Var2 = e3Var;
            boolean zG2 = rVar.G(ihVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new c(ihVar);
                rVar.v(objE2);
            }
            p024c42.c2.f0(aVar, lVar, e3Var2, (er.a) ((mr.g) objE2), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(ih ihVar, int i15, p076m2.r rVar, int i16) {
        ihVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2() {
        if (this.navigateBackToDashboard) {
            f2().c(new tg1.a.ToDashboard(true));
        } else {
            e2().c("TAG_PAYMENTS");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(f00.s destinationNavigator) {
        Uri uri = this.deeplink;
        if (uri != null) {
            destinationNavigator.getNavController().F(uri);
        }
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        Object obj;
        p076m2.r rVarH = rVar.h(702715552);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(702715552, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.PaymentFeatureFragment.GetContent (PaymentFeatureFragment.kt:43)");
            }
            boolean zA = w0.h0.a(rVarH, 0);
            boolean zA2 = rVarH.a(zA);
            Object objE = rVarH.E();
            if (zA2 || objE == p076m2.r.INSTANCE.a()) {
                if (zA) {
                    obj = f42.d.f59076a;
                } else {
                    if (zA) {
                        throw new oq.p();
                    }
                    obj = f42.e.f59078a;
                }
                objE = obj;
                rVarH.v(objE);
            }
            final f42.a aVar = (f42.a) objE;
            mc4.d.d(false, y2.m.d(1149049076, true, new er.p() { // from class: sd4.gh
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return ih.a2(aVar, this, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.hh
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return ih.b2(this.f180652a, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
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

    @Override // androidx.fragment.app.o
    public void x0(Bundle savedInstanceState) {
        super.x0(savedInstanceState);
        Bundle bundleV = v();
        this.deeplink = bundleV != null ? (Uri) bundleV.getParcelable("deepLinkUri") : null;
        Bundle bundleV2 = v();
        this.paymentId = bundleV2 != null ? bundleV2.getString("paymentId") : null;
        Bundle bundleV3 = v();
        this.navigateBackToDashboard = bundleV3 != null ? bundleV3.getBoolean("navigateBackToDashboard", false) : false;
        Bundle bundleV4 = v();
        this.paymentsEntryPointData = bundleV4 != null ? (p024c42.e3) bundleV4.getParcelable("paymentsEntryPoint") : null;
    }
}

```
