# Paczka 208 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ua/k.java`

## ua/k.java

```java
package ua;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u000b\"\b\b\u0000\u0010\u001a*\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\n\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001f¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f¢\u0006\u0004\b\"\u0010!J-\u0010#\u001a\u00020\u000b\"\b\b\u0000\u0010\u001a*\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b#\u0010!J\u001d\u0010%\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020*¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020-¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000700¢\u0006\u0004\b1\u00102J!\u00103\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u00020\u000b2\n\u00105\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b8\u0010\u0018\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u00069"}, d2 = {"Lua/k;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", "a", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "key", "", "value", "Loq/i0;", "c", "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "", "e", "(Landroid/os/Bundle;Ljava/lang/String;F)V", "", "g", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "", "i", "(Landroid/os/Bundle;Ljava/lang/String;J)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)V", "Landroid/os/Parcelable;", "T", "l", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V", "p", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "", "o", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "r", "m", "", "d", "(Landroid/os/Bundle;Ljava/lang/String;[Z)V", "", "f", "(Landroid/os/Bundle;Ljava/lang/String;[F)V", "", "h", "(Landroid/os/Bundle;Ljava/lang/String;[I)V", "", "j", "(Landroid/os/Bundle;Ljava/lang/String;[J)V", "", "q", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V", "from", "b", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "s", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {
    public static Bundle a(Bundle bundle) {
        return bundle;
    }

    public static final void b(Bundle bundle, Bundle bundle2) {
        bundle.putAll(bundle2);
    }

    public static final void c(Bundle bundle, String str, boolean z15) {
        bundle.putBoolean(str, z15);
    }

    public static final void d(Bundle bundle, String str, boolean[] zArr) {
        bundle.putBooleanArray(str, zArr);
    }

    public static final void e(Bundle bundle, String str, float f15) {
        bundle.putFloat(str, f15);
    }

    public static final void f(Bundle bundle, String str, float[] fArr) {
        bundle.putFloatArray(str, fArr);
    }

    public static final void g(Bundle bundle, String str, int i15) {
        bundle.putInt(str, i15);
    }

    public static final void h(Bundle bundle, String str, int[] iArr) {
        bundle.putIntArray(str, iArr);
    }

    public static final void i(Bundle bundle, String str, long j15) {
        bundle.putLong(str, j15);
    }

    public static final void j(Bundle bundle, String str, long[] jArr) {
        bundle.putLongArray(str, jArr);
    }

    public static final void k(Bundle bundle, String str) {
        bundle.putString(str, null);
    }

    public static final <T extends Parcelable> void l(Bundle bundle, String str, T t15) {
        bundle.putParcelable(str, t15);
    }

    public static final <T extends Parcelable> void m(Bundle bundle, String str, List<? extends T> list) {
        bundle.putParcelableArrayList(str, l.a(list));
    }

    public static final void n(Bundle bundle, String str, Bundle bundle2) {
        bundle.putBundle(str, bundle2);
    }

    public static final void o(Bundle bundle, String str, List<Bundle> list) {
        m(bundle, str, list);
    }

    public static final void p(Bundle bundle, String str, String str2) {
        bundle.putString(str, str2);
    }

    public static final void q(Bundle bundle, String str, String[] strArr) {
        bundle.putStringArray(str, strArr);
    }

    public static final void r(Bundle bundle, String str, List<String> list) {
        bundle.putStringArrayList(str, l.a(list));
    }

    public static final void s(Bundle bundle, String str) {
        bundle.remove(str);
    }
}

```
