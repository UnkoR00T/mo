# Paczka 158 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `kg/c.java`, `kg/d.java`, `kg/e.java`

## kg/c.java

```java
package kg;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    private static int A(Parcel parcel, int i15) {
        parcel.writeInt(i15 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void B(Parcel parcel, int i15) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i15 - 4);
        parcel.writeInt(iDataPosition - i15);
        parcel.setDataPosition(iDataPosition);
    }

    private static void C(Parcel parcel, Parcelable parcelable, int i15) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i15);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static int a(Parcel parcel) {
        return A(parcel, 20293);
    }

    public static void b(Parcel parcel, int i15) {
        B(parcel, i15);
    }

    public static void c(Parcel parcel, int i15, boolean z15) {
        z(parcel, i15, 4);
        parcel.writeInt(z15 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i15, Bundle bundle, boolean z15) {
        if (bundle == null) {
            if (z15) {
                z(parcel, i15, 0);
            }
        } else {
            int iA = A(parcel, i15);
            parcel.writeBundle(bundle);
            B(parcel, iA);
        }
    }

    public static void e(Parcel parcel, int i15, byte b15) {
        z(parcel, i15, 4);
        parcel.writeInt(b15);
    }

    public static void f(Parcel parcel, int i15, byte[] bArr, boolean z15) {
        if (bArr == null) {
            if (z15) {
                z(parcel, i15, 0);
            }
        } else {
            int iA = A(parcel, i15);
            parcel.writeByteArray(bArr);
            B(parcel, iA);
        }
    }

    public static void g(Parcel parcel, int i15, byte[][] bArr, boolean z15) {
        if (bArr == null) {
            if (z15) {
                z(parcel, i15, 0);
                return;
            }
            return;
        }
        int iA = A(parcel, i15);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        B(parcel, iA);
    }

    public static void h(Parcel parcel, int i15, double d15) {
        z(parcel, i15, 8);
        parcel.writeDouble(d15);
    }

    public static void i(Parcel parcel, int i15, float f15) {
        z(parcel, i15, 4);
        parcel.writeFloat(f15);
    }

    public static void j(Parcel parcel, int i15, float[] fArr, boolean z15) {
        if (fArr == null) {
            if (z15) {
                z(parcel, i15, 0);
            }
        } else {
            int iA = A(parcel, i15);
            parcel.writeFloatArray(fArr);
            B(parcel, iA);
        }
    }

    public static void k(Parcel parcel, int i15, Float f15, boolean z15) {
        if (f15 != null) {
            z(parcel, i15, 4);
            parcel.writeFloat(f15.floatValue());
        } else if (z15) {
            z(parcel, i15, 0);
        }
    }

    public static void l(Parcel parcel, int i15, IBinder iBinder, boolean z15) {
        if (iBinder == null) {
            if (z15) {
                z(parcel, i15, 0);
            }
        } else {
            int iA = A(parcel, i15);
            parcel.writeStrongBinder(iBinder);
            B(parcel, iA);
        }
    }

    public static void m(Parcel parcel, int i15, int i16) {
        z(parcel, i15, 4);
        parcel.writeInt(i16);
    }

    public static void n(Parcel parcel, int i15, int[] iArr, boolean z15) {
        if (iArr == null) {
            if (z15) {
                z(parcel, i15, 0);
            }
        } else {
            int iA = A(parcel, i15);
            parcel.writeIntArray(iArr);
            B(parcel, iA);
        }
    }

    public static void o(Parcel parcel, int i15, List<Integer> list, boolean z15) {
        if (list == null) {
            if (z15) {
                z(parcel, i15, 0);
                return;
            }
            return;
        }
        int iA = A(parcel, i15);
        int size = list.size();
        parcel.writeInt(size);
        for (int i16 = 0; i16 < size; i16++) {
            parcel.writeInt(list.get(i16).intValue());
        }
        B(parcel, iA);
    }

    public static void p(Parcel parcel, int i15, Integer num, boolean z15) {
        if (num != null) {
            z(parcel, i15, 4);
            parcel.writeInt(num.intValue());
        } else if (z15) {
            z(parcel, i15, 0);
        }
    }

    public static void q(Parcel parcel, int i15, List list, boolean z15) {
        if (list == null) {
            if (z15) {
                z(parcel, i15, 0);
            }
        } else {
            int iA = A(parcel, i15);
            parcel.writeList(list);
            B(parcel, iA);
        }
    }

    public static void r(Parcel parcel, int i15, long j15) {
        z(parcel, i15, 8);
        parcel.writeLong(j15);
    }

    public static void s(Parcel parcel, int i15, Long l15, boolean z15) {
        if (l15 != null) {
            z(parcel, i15, 8);
            parcel.writeLong(l15.longValue());
        } else if (z15) {
            z(parcel, i15, 0);
        }
    }

    public static void t(Parcel parcel, int i15, Parcelable parcelable, int i16, boolean z15) {
        if (parcelable == null) {
            if (z15) {
                z(parcel, i15, 0);
            }
        } else {
            int iA = A(parcel, i15);
            parcelable.writeToParcel(parcel, i16);
            B(parcel, iA);
        }
    }

    public static void u(Parcel parcel, int i15, String str, boolean z15) {
        if (str == null) {
            if (z15) {
                z(parcel, i15, 0);
            }
        } else {
            int iA = A(parcel, i15);
            parcel.writeString(str);
            B(parcel, iA);
        }
    }

    public static void v(Parcel parcel, int i15, String[] strArr, boolean z15) {
        if (strArr == null) {
            if (z15) {
                z(parcel, i15, 0);
            }
        } else {
            int iA = A(parcel, i15);
            parcel.writeStringArray(strArr);
            B(parcel, iA);
        }
    }

    public static void w(Parcel parcel, int i15, List<String> list, boolean z15) {
        if (list == null) {
            if (z15) {
                z(parcel, i15, 0);
            }
        } else {
            int iA = A(parcel, i15);
            parcel.writeStringList(list);
            B(parcel, iA);
        }
    }

    public static <T extends Parcelable> void x(Parcel parcel, int i15, T[] tArr, int i16, boolean z15) {
        if (tArr == null) {
            if (z15) {
                z(parcel, i15, 0);
                return;
            }
            return;
        }
        int iA = A(parcel, i15);
        parcel.writeInt(tArr.length);
        for (T t15 : tArr) {
            if (t15 == null) {
                parcel.writeInt(0);
            } else {
                C(parcel, t15, i16);
            }
        }
        B(parcel, iA);
    }

    public static <T extends Parcelable> void y(Parcel parcel, int i15, List<T> list, boolean z15) {
        if (list == null) {
            if (z15) {
                z(parcel, i15, 0);
                return;
            }
            return;
        }
        int iA = A(parcel, i15);
        int size = list.size();
        parcel.writeInt(size);
        for (int i16 = 0; i16 < size; i16++) {
            T t15 = list.get(i16);
            if (t15 == null) {
                parcel.writeInt(0);
            } else {
                C(parcel, t15, 0);
            }
        }
        B(parcel, iA);
    }

    private static void z(Parcel parcel, int i15, int i16) {
        parcel.writeInt(i15 | (i16 << 16));
    }
}

```

## kg/d.java

```java
package kg;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public interface d extends Parcelable {
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";
}

```

## kg/e.java

```java
package kg;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static <T extends d> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        s.l(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    public static <T extends d> T b(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) a(byteArrayExtra, creator);
    }
}

```
