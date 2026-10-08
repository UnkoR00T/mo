# Paczka 184 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `qh/a.java`, `qh/g.java`, `r6/a.java`

## qh/a.java

```java
package qh;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a extends kg.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[][] f166430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f166431k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f166436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f166437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[][] f166438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[][] f166439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[][] f166440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[][] f166441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f166442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[][] f166443h;
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final InterfaceC4178a f166432l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final InterfaceC4178a f166433m = new d();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final InterfaceC4178a f166434n = new e();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final InterfaceC4178a f166435p = new f();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: qh.a$a, reason: collision with other inner class name */
    interface InterfaceC4178a {
    }

    static {
        byte[][] bArr = new byte[0][];
        f166430j = bArr;
        f166431k = new a("", null, bArr, bArr, bArr, bArr, null, null);
    }

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f166436a = str;
        this.f166437b = bArr;
        this.f166438c = bArr2;
        this.f166439d = bArr3;
        this.f166440e = bArr4;
        this.f166441f = bArr5;
        this.f166442g = iArr;
        this.f166443h = bArr6;
    }

    private static List<Integer> h(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i15 : iArr) {
            arrayList.add(Integer.valueOf(i15));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<String> m(byte[][] bArr) {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void p(StringBuilder sb5, String str, byte[][] bArr) {
        String str2;
        sb5.append(str);
        sb5.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb5.append("(");
            int length = bArr.length;
            boolean z15 = true;
            int i15 = 0;
            while (i15 < length) {
                byte[] bArr2 = bArr[i15];
                if (!z15) {
                    sb5.append(", ");
                }
                sb5.append("'");
                sb5.append(Base64.encodeToString(bArr2, 3));
                sb5.append("'");
                i15++;
                z15 = false;
            }
            str2 = ")";
        }
        sb5.append(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (j.a(this.f166436a, aVar.f166436a) && Arrays.equals(this.f166437b, aVar.f166437b) && j.a(m(this.f166438c), m(aVar.f166438c)) && j.a(m(this.f166439d), m(aVar.f166439d)) && j.a(m(this.f166440e), m(aVar.f166440e)) && j.a(m(this.f166441f), m(aVar.f166441f)) && j.a(h(this.f166442g), h(aVar.f166442g)) && j.a(m(this.f166443h), m(aVar.f166443h))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String string;
        StringBuilder sb5 = new StringBuilder("ExperimentTokens");
        sb5.append("(");
        String str = this.f166436a;
        if (str == null) {
            string = "null";
        } else {
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 2);
            sb6.append("'");
            sb6.append(str);
            sb6.append("'");
            string = sb6.toString();
        }
        sb5.append(string);
        sb5.append(", ");
        byte[] bArr = this.f166437b;
        sb5.append("direct");
        sb5.append("=");
        if (bArr == null) {
            sb5.append("null");
        } else {
            sb5.append("'");
            sb5.append(Base64.encodeToString(bArr, 3));
            sb5.append("'");
        }
        sb5.append(", ");
        p(sb5, "GAIA", this.f166438c);
        sb5.append(", ");
        p(sb5, "PSEUDO", this.f166439d);
        sb5.append(", ");
        p(sb5, "ALWAYS", this.f166440e);
        sb5.append(", ");
        p(sb5, "OTHER", this.f166441f);
        sb5.append(", ");
        int[] iArr = this.f166442g;
        sb5.append("weak");
        sb5.append("=");
        if (iArr == null) {
            sb5.append("null");
        } else {
            sb5.append("(");
            int length = iArr.length;
            boolean z15 = true;
            int i15 = 0;
            while (i15 < length) {
                int i16 = iArr[i15];
                if (!z15) {
                    sb5.append(", ");
                }
                sb5.append(i16);
                i15++;
                z15 = false;
            }
            sb5.append(")");
        }
        sb5.append(", ");
        p(sb5, "directs", this.f166443h);
        sb5.append(")");
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f166436a, false);
        kg.c.f(parcel, 3, this.f166437b, false);
        kg.c.g(parcel, 4, this.f166438c, false);
        kg.c.g(parcel, 5, this.f166439d, false);
        kg.c.g(parcel, 6, this.f166440e, false);
        kg.c.g(parcel, 7, this.f166441f, false);
        kg.c.n(parcel, 8, this.f166442g, false);
        kg.c.g(parcel, 9, this.f166443h, false);
        kg.c.b(parcel, iA);
    }
}

```

## qh/g.java

```java
package qh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        byte[] bArrB = null;
        byte[][] bArrC = null;
        byte[][] bArrC2 = null;
        byte[][] bArrC3 = null;
        byte[][] bArrC4 = null;
        int[] iArrE = null;
        byte[][] bArrC5 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    bArrB = kg.b.b(parcel, iT);
                    break;
                case 4:
                    bArrC = kg.b.c(parcel, iT);
                    break;
                case 5:
                    bArrC2 = kg.b.c(parcel, iT);
                    break;
                case 6:
                    bArrC3 = kg.b.c(parcel, iT);
                    break;
                case 7:
                    bArrC4 = kg.b.c(parcel, iT);
                    break;
                case 8:
                    iArrE = kg.b.e(parcel, iT);
                    break;
                case 9:
                    bArrC5 = kg.b.c(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new a(strH, bArrB, bArrC, bArrC2, bArrC3, bArrC4, iArrE, bArrC5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i15) {
        return new a[i15];
    }
}

```

## r6/a.java

```java
package r6;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Parcelable f171968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f171967b = new C4376a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: r6.a$a, reason: collision with other inner class name */
    class C4376a extends a {
        C4376a() {
            super((C4376a) null);
        }
    }

    class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f171967b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i15) {
            return new a[i15];
        }
    }

    /* synthetic */ a(C4376a c4376a) {
        this();
    }

    public final Parcelable a() {
        return this.f171968a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(this.f171968a, i15);
    }

    private a() {
        this.f171968a = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f171968a = parcelable == f171967b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f171968a = parcelable == null ? f171967b : parcelable;
    }
}

```
