# Paczka 196 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `sd4/rf.java (część 2/2)`

## sd4/rf.java (część 2/2)

```java
package sd4;

import android.net.Uri;
import android.os.Bundle;
import j84.NotificationsHistoryRecord;
import j84.NotificationsHistoryRecordParameters;
import p071kotlin.Metadata;
import r74.DefaultNotificationDetailsData;
import s93.ToCountryDetails;
import v32.InstantPaymentNotificationDetailsData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R+\u0010,\u001a\u00020$2\u0006\u0010%\u001a\u00020$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lsd4/rf;", "Lj00/b;", "<init>", "()V", "Lj84/c;", "record", "Loq/i0;", "m2", "(Lj84/c;)V", "l2", "Landroid/os/Bundle;", "savedInstanceState", "x0", "(Landroid/os/Bundle;)V", "S1", "(Lm2/r;I)V", "Lgx/d;", "L0", "Lgx/d;", "k2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "Lrh2/a;", "M0", "Lrh2/a;", "j2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Landroid/net/Uri;", "N0", "Landroid/net/Uri;", "deeplink", "Lgo2/a$a$a;", "<set-?>", "O0", "Lir/e;", "i2", "()Lgo2/a$a$a;", "n2", "(Lgo2/a$a$a;)V", "entryPoint", "P0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class rf extends w9 {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public gx.d globalEvent
    public final rh2.a j2() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final gx.d k2() {
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
        n2((go2.a.ToNotification.EnumC1705a) (bundleV2 != null ? bundleV2.getSerializable("KEY_DESTINATION") : null));
    }
}
```
