# Paczka 193 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `sd4/ol.java`

## sd4/ol.java

Powiązane klasy (możesz dosłać): `p037e73/Function1.java`

```java
package sd4;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import p037e73.Function1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 V2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR+\u0010Q\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006X"}, d2 = {"Lsd4/ol;", "Lj00/b;", "<init>", "()V", "Landroid/os/Bundle;", "Le73/p0;", "i2", "(Landroid/os/Bundle;)Le73/p0;", "Ly9/g1;", "navController", "Loq/i0;", "q2", "(Ly9/g1;)Loq/i0;", "savedInstanceState", "x0", "(Landroid/os/Bundle;)V", "S1", "(Lm2/r;I)V", "Lgx/d;", "L0", "Lgx/d;", "l2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "Lrh2/a;", "M0", "Lrh2/a;", "k2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Lud4/a;", "N0", "Lud4/a;", "j2", "()Lud4/a;", "setEntryPointMapper", "(Lud4/a;)V", "entryPointMapper", "Lg73/f;", "O0", "Lg73/f;", "p2", "()Lg73/f;", "setSettingsSetPasswordDataMapper", "(Lg73/f;)V", "settingsSetPasswordDataMapper", "Lg73/d;", "P0", "Lg73/d;", "o2", "()Lg73/d;", "setSettingsNavigationDialogMapper", "(Lg73/d;)V", "settingsNavigationDialogMapper", "Li70/e;", "Q0", "Li70/e;", "m2", "()Li70/e;", "setGlobalSnackBarMapper", "(Li70/e;)V", "globalSnackBarMapper", "Lmx/c;", "R0", "Lmx/c;", "n2", "()Lmx/c;", "setLabelProvider", "(Lmx/c;)V", "labelProvider", "<set-?>", "S0", "Lir/e;", "h2", "()Le73/p0;", "r2", "(Le73/p0;)V", "entryPoint", "Landroid/net/Uri;", "T0", "Landroid/net/Uri;", "deeplink", "U0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ol extends ta {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public ud4.a entryPointMapper;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public g73.f settingsSetPasswordDataMapper;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public g73.d settingsNavigationDialogMapper;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public i70.e globalSnackBarMapper;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public mx.c labelProvider;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private final ir.e entryPoint = ir.a.f96711a.a();

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private Uri deeplink;
    static final /* synthetic */ mr.l<Object>[] V0 = {fr.q0.f(new fr.b0(ol.class, "entryPoint", "getEntryPoint()Lpl/gov/coi/mobywatel/feature/settings/presentation/navigation/SettingsEntryPoint;", 0))};

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int W0 = 8;

    /* JADX INFO: renamed from: sd4.ol$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lsd4/ol$a;", "", "<init>", "()V", "Lud4/b;", "entryPoint", "Landroid/net/Uri;", "deeplink", "Lsd4/ol;", "a", "(Lud4/b;Landroid/net/Uri;)Lsd4/ol;", "", "TAG_FEATURE_SETTINGS", "Ljava/lang/String;", "KEY_DEEP_LINK", "KEY_ENTRY_POINT", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final ol a(ud4.b entryPoint, Uri deeplink) {
            ol olVar = new ol();
            Bundle bundle = new Bundle();
            bundle.putParcelable("deepLinkUri", deeplink);
            bundle.putParcelable("key_entry_point", entryPoint);
            olVar.F1(bundle);
            return olVar;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.a implements er.l<p136y9.g1, oq.i0> {
        b(Object obj) {
            super(1, obj, ol.class, "navigateToDeepLink", "navigateToDeepLink(Landroidx/navigation/NavHostController;)Lkotlin/Unit;", 8);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(p136y9.g1 g1Var) {
            c(g1Var);
            return oq.i0.f148189a;
        }

        public final void c(p136y9.g1 g1Var) {
            ((ol) this.f66376a).q2(g1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(final ol olVar, p076m2.r rVar, int i15) {
        f00.a aVar;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1583607976, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.SettingsFeatureFragment.GetContent.<anonymous> (SettingsFeatureFragment.kt:70)");
            }
            boolean zG = rVar.G(olVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new b(olVar);
                rVar.v(objE);
            }
            er.l lVar = (er.l) objE;
            p037e73.p0 p0VarH2 = olVar.h2();
            if (fr.t.c(p0VarH2, e73.p0.b.f48223a)) {
                aVar = p037e73.j0.f48187a;
            } else if (fr.t.c(p0VarH2, e73.p0.a.f48222a)) {
                aVar = p037e73.v.f48267a;
            } else if (fr.t.c(p0VarH2, e73.p0.e.f48226a)) {
                aVar = p037e73.o0.f48217a;
            } else if (fr.t.c(p0VarH2, e73.p0.c.f48224a)) {
                aVar = p037e73.a0.f48113a;
            } else {
                if (!fr.t.c(p0VarH2, e73.p0.d.f48225a)) {
                    throw new oq.p();
                }
                aVar = p037e73.f0.f48157a;
            }
            f00.a aVar2 = aVar;
            boolean zG2 = rVar.G(olVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: sd4.ml
                    @Override // er.a
                    public final Object a() {
                        return ol.d2(this.f180752a);
                    }
                };
                rVar.v(objE2);
            }
            er.a aVar3 = (er.a) objE2;
            boolean zG3 = rVar.G(olVar);
            Object objE3 = rVar.E();
            if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new er.l() { // from class: sd4.nl
                    @Override // er.l
                    public final Object b(Object obj) {
                        return ol.e2(this.f180768a, (gx.b) obj);
                    }
                };
                rVar.v(objE3);
            }
            Function1.e0(lVar, aVar2, aVar3, (er.l) objE3, olVar.p2(), olVar.o2(), olVar.m2(), olVar.n2(), rVar, g73.f.f71164c << 12);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(ol olVar) {
        olVar.k2().c("TAG_SETTINGS");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e2(ol olVar, gx.b bVar) {
        olVar.l2().c(bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f2(ol olVar, int i15, p076m2.r rVar, int i16) {
        olVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private final p037e73.p0 h2() {
        return (p037e73.p0) this.entryPoint.a(this, V0[0]);
    }

    private final p037e73.p0 i2(Bundle bundle) {
        return j2().b(Build.VERSION.SDK_INT >= 33 ? (ud4.b) bundle.getParcelable("key_entry_point", ud4.b.class) : (ud4.b) bundle.getParcelable("key_entry_point"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oq.i0 q2(p136y9.g1 navController) {
        Uri uri = this.deeplink;
        if (uri == null) {
            return null;
        }
        navController.F(uri);
        return oq.i0.f148189a;
    }

    private final void r2(p037e73.p0 p0Var) {
        this.entryPoint.b(this, V0[0], p0Var);
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1013394940);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1013394940, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.SettingsFeatureFragment.GetContent (SettingsFeatureFragment.kt:69)");
            }
            mc4.d.d(false, y2.m.d(-1583607976, true, new er.p() { // from class: sd4.kl
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ol.c2(this.f180711a, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.ll
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ol.f2(this.f180733a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final ud4.a j2() {
        ud4.a aVar = this.entryPointMapper;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final rh2.a k2() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final gx.d l2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    public final i70.e m2() {
        i70.e eVar = this.globalSnackBarMapper;
        if (eVar != null) {
            return eVar;
        }
        return null;
    }

    public final mx.c n2() {
        mx.c cVar = this.labelProvider;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final g73.d o2() {
        g73.d dVar = this.settingsNavigationDialogMapper;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    public final g73.f p2() {
        g73.f fVar = this.settingsSetPasswordDataMapper;
        if (fVar != null) {
            return fVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.o
    public void x0(Bundle savedInstanceState) {
        super.x0(savedInstanceState);
        Bundle bundleV = v();
        this.deeplink = bundleV != null ? (Uri) bundleV.getParcelable("deepLinkUri") : null;
        Bundle bundleV2 = v();
        r2(bundleV2 != null ? i2(bundleV2) : null);
    }
}

```
