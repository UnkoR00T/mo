# Paczka 207 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ua/c.java`

## ua/c.java

```java
package ua;

import android.os.Bundle;
import android.os.Parcelable;
import fr.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00192\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00192\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ3\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\b\b\u0000\u0010\u001f*\u00020\u001e2\u0006\u0010\b\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b.\u0010/J\u001b\u00101\u001a\b\u0012\u0004\u0012\u00020\u0007002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b5\u00104J\r\u00106\u001a\u00020\u0011¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\t¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b:\u0010\u000bJ\u0018\u0010;\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b;\u0010\u000bJ\u0019\u0010=\u001a\u00020\t2\n\u0010<\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0011¢\u0006\u0004\b?\u00107J\u001b\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010@¢\u0006\u0004\bA\u0010B\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006C"}, d2 = {"Lua/c;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", "a", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "key", "", "e", "(Landroid/os/Bundle;Ljava/lang/String;)Z", "g", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "", "h", "(Landroid/os/Bundle;Ljava/lang/String;)F", "", "j", "(Landroid/os/Bundle;Ljava/lang/String;)I", "", "l", "(Landroid/os/Bundle;Ljava/lang/String;)J", "r", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "", "p", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "t", "u", "Landroid/os/Parcelable;", "T", "Lmr/c;", "parcelableClass", "n", "(Landroid/os/Bundle;Ljava/lang/String;Lmr/c;)Ljava/util/List;", "", "f", "(Landroid/os/Bundle;Ljava/lang/String;)[Z", "", "i", "(Landroid/os/Bundle;Ljava/lang/String;)[F", "", "k", "(Landroid/os/Bundle;Ljava/lang/String;)[I", "", "m", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "", "s", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "o", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;", "q", "x", "(Landroid/os/Bundle;)I", "v", "(Landroid/os/Bundle;)Z", "w", "b", "other", "c", "(Landroid/os/Bundle;Landroid/os/Bundle;)Z", "d", "", "y", "(Landroid/os/Bundle;)Ljava/util/Map;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static Bundle a(Bundle bundle) {
        return bundle;
    }

    public static final boolean b(Bundle bundle, String str) {
        return bundle.containsKey(str);
    }

    public static final boolean c(Bundle bundle, Bundle bundle2) {
        return f.c(bundle, bundle2);
    }

    public static final int d(Bundle bundle) {
        return f.d(bundle);
    }

    public static final boolean e(Bundle bundle, String str) {
        boolean z15 = bundle.getBoolean(str, false);
        if (z15 || !bundle.getBoolean(str, true)) {
            return z15;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final boolean[] f(Bundle bundle, String str) {
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final Boolean g(Bundle bundle, String str) {
        boolean z15 = bundle.getBoolean(str, false);
        if (z15 || !bundle.getBoolean(str, true)) {
            return Boolean.valueOf(z15);
        }
        return null;
    }

    public static final float h(Bundle bundle, String str) {
        float f15 = bundle.getFloat(str, Float.MIN_VALUE);
        if (f15 != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f15;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final float[] i(Bundle bundle, String str) {
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final int j(Bundle bundle, String str) {
        int i15 = bundle.getInt(str, PKIFailureInfo.systemUnavail);
        if (i15 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i15;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final int[] k(Bundle bundle, String str) {
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final long l(Bundle bundle, String str) {
        long j15 = bundle.getLong(str, Long.MIN_VALUE);
        if (j15 != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j15;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final long[] m(Bundle bundle, String str) {
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final <T extends Parcelable> List<T> n(Bundle bundle, String str, mr.c<T> cVar) {
        ArrayList arrayListB = e6.b.b(bundle, str, dr.a.b(cVar));
        if (arrayListB != null) {
            return arrayListB;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final Bundle o(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final List<Bundle> p(Bundle bundle, String str) {
        return n(bundle, str, q0.c(Bundle.class));
    }

    public static final Bundle q(Bundle bundle, String str) {
        return bundle.getBundle(str);
    }

    public static final String r(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final String[] s(Bundle bundle, String str) {
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final List<String> t(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        d.a(str);
        throw new oq.g();
    }

    public static final List<String> u(Bundle bundle, String str) {
        return bundle.getStringArrayList(str);
    }

    public static final boolean v(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final boolean w(Bundle bundle, String str) {
        return b(bundle, str) && bundle.get(str) == null;
    }

    public static final int x(Bundle bundle) {
        return bundle.size();
    }

    public static final Map<String, Object> y(Bundle bundle) {
        Map mapD = v0.d(bundle.size());
        for (String str : bundle.keySet()) {
            mapD.put(str, bundle.get(str));
        }
        return v0.b(mapD);
    }
}

```
