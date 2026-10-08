# Paczka 199 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `sd4/x4.java`, `sj/h.java`

## sd4/x4.java

```java
package sd4;

import android.net.Uri;
import android.os.Bundle;
import p071kotlin.Metadata;
import p107qu1.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lsd4/x4;", "Lj00/b;", "<init>", "()V", "Lf00/s;", "destinationNavigator", "Loq/i0;", "g2", "(Lf00/s;)V", "Landroid/os/Bundle;", "savedInstanceState", "x0", "(Landroid/os/Bundle;)V", "S1", "(Lm2/r;I)V", "Lgx/d;", "L0", "Lgx/d;", "f2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "Landroid/net/Uri;", "M0", "Landroid/net/Uri;", "deeplink", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x4 extends s8 {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private Uri deeplink;

    /* JADX INFO: renamed from: sd4.x4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lsd4/x4$a;", "", "<init>", "()V", "Landroid/net/Uri;", "deeplink", "", "showTemporaryDrivingLicence", "Lsd4/x4;", "a", "(Landroid/net/Uri;Z)Lsd4/x4;", "", "KEY_DEEP_LINK", "Ljava/lang/String;", "SHOW_TEMPORARY_DRIVING_LICENCE", "TAG_DRIVING_LICENCE", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ x4 b(Companion companion, Uri uri, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                uri = null;
            }
            if ((i15 & 2) != 0) {
                z15 = false;
            }
            return companion.a(uri, z15);
        }

        public final x4 a(Uri deeplink, boolean showTemporaryDrivingLicence) {
            x4 x4Var = new x4();
            Bundle bundle = new Bundle();
            if (deeplink != null) {
                bundle.putParcelable("deepLinkUri", deeplink);
            }
            bundle.putBoolean("showTemporaryDrivingLicence", showTemporaryDrivingLicence);
            x4Var.F1(bundle);
            return x4Var;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<f00.s, oq.i0> {
        b(Object obj) {
            super(1, obj, x4.class, "onNavGraphReady", "onNavGraphReady(Lpl/gov/coi/common/navigation/DestinationNavigator;)V", 0);
        }

        public final void E(f00.s sVar) {
            ((x4) this.f66391b).g2(sVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(f00.s sVar) {
            E(sVar);
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(final x4 x4Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1205745868, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.DrivingLicenceFragment.GetContent.<anonymous> (DrivingLicenceFragment.kt:30)");
            }
            boolean zG = rVar.G(x4Var);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new b(x4Var);
                rVar.v(objE);
            }
            er.l lVar = (er.l) ((mr.g) objE);
            boolean zG2 = rVar.G(x4Var);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: sd4.w4
                    @Override // er.l
                    public final Object b(Object obj) {
                        return x4.c2(this.f180921a, (gx.b) obj);
                    }
                };
                rVar.v(objE2);
            }
            er.l lVar2 = (er.l) objE2;
            Bundle bundleV = x4Var.v();
            Function1.y(lVar, lVar2, bundleV != null ? bundleV.getBoolean("showTemporaryDrivingLicence", false) : false, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(x4 x4Var, gx.b bVar) {
        x4Var.f2().c(bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(x4 x4Var, int i15, p076m2.r rVar, int i16) {
        x4Var.S1(rVar, p076m2.g4.a(i15 | 1));
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
        p076m2.r rVarH = rVar.h(-1652079392);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1652079392, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.DrivingLicenceFragment.GetContent (DrivingLicenceFragment.kt:29)");
            }
            mc4.d.d(false, y2.m.d(-1205745868, true, new er.p() { // from class: sd4.u4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x4.b2(this.f180880a, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: sd4.v4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x4.d2(this.f180898a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
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
    }
}

```

## sj/h.java

```java
package sj;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ClassLoader f181976a = h.class.getClassLoader();

    private h() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}

```
