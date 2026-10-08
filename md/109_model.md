# Paczka 109 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `eg/e.java`, `eg/f.java`, `eg/g.java`, `eh/b1.java`, `eh/c2.java`, `eh/d3.java`, `eh/de.java`

## eg/e.java

```java
package eg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        boolean zO = false;
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                zO = kg.b.o(parcel, iT);
            } else if (iN == 2) {
                jY2 = kg.b.y(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                jY = kg.b.y(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new d(zO, jY, jY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i15) {
        return new d[i15];
    }
}

```

## eg/f.java

```java
package eg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.m5;
import com.google.android.gms.internal.clearcut.x5;
import java.util.Arrays;
import jg.r;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends kg.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x5 f49953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f49954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f49955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f49956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f49957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[][] f49958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private qh.a[] f49959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49960h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m5 f49961j;

    public f(x5 x5Var, m5 m5Var, a.c cVar, a.c cVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, qh.a[] aVarArr, boolean z15) {
        this.f49953a = x5Var;
        this.f49961j = m5Var;
        this.f49955c = iArr;
        this.f49956d = null;
        this.f49957e = iArr2;
        this.f49958f = null;
        this.f49959g = null;
        this.f49960h = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (r.a(this.f49953a, fVar.f49953a) && Arrays.equals(this.f49954b, fVar.f49954b) && Arrays.equals(this.f49955c, fVar.f49955c) && Arrays.equals(this.f49956d, fVar.f49956d) && r.a(this.f49961j, fVar.f49961j) && r.a(null, null) && r.a(null, null) && Arrays.equals(this.f49957e, fVar.f49957e) && Arrays.deepEquals(this.f49958f, fVar.f49958f) && Arrays.equals(this.f49959g, fVar.f49959g) && this.f49960h == fVar.f49960h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return r.b(this.f49953a, this.f49954b, this.f49955c, this.f49956d, this.f49961j, null, null, this.f49957e, this.f49958f, this.f49959g, Boolean.valueOf(this.f49960h));
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder("LogEventParcelable[");
        sb5.append(this.f49953a);
        sb5.append(", LogEventBytes: ");
        byte[] bArr = this.f49954b;
        sb5.append(bArr == null ? null : new String(bArr));
        sb5.append(", TestCodes: ");
        sb5.append(Arrays.toString(this.f49955c));
        sb5.append(", MendelPackages: ");
        sb5.append(Arrays.toString(this.f49956d));
        sb5.append(", LogEvent: ");
        sb5.append(this.f49961j);
        sb5.append(", ExtensionProducer: ");
        sb5.append((Object) null);
        sb5.append(", VeProducer: ");
        sb5.append((Object) null);
        sb5.append(", ExperimentIDs: ");
        sb5.append(Arrays.toString(this.f49957e));
        sb5.append(", ExperimentTokens: ");
        sb5.append(Arrays.toString(this.f49958f));
        sb5.append(", ExperimentTokensParcelables: ");
        sb5.append(Arrays.toString(this.f49959g));
        sb5.append(", AddPhenotypeExperimentTokens: ");
        sb5.append(this.f49960h);
        sb5.append("]");
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 2, this.f49953a, i15, false);
        kg.c.f(parcel, 3, this.f49954b, false);
        kg.c.n(parcel, 4, this.f49955c, false);
        kg.c.v(parcel, 5, this.f49956d, false);
        kg.c.n(parcel, 6, this.f49957e, false);
        kg.c.g(parcel, 7, this.f49958f, false);
        kg.c.c(parcel, 8, this.f49960h);
        kg.c.x(parcel, 9, this.f49959g, i15, false);
        kg.c.b(parcel, iA);
    }

    f(x5 x5Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z15, qh.a[] aVarArr) {
        this.f49953a = x5Var;
        this.f49954b = bArr;
        this.f49955c = iArr;
        this.f49956d = strArr;
        this.f49961j = null;
        this.f49957e = iArr2;
        this.f49958f = bArr2;
        this.f49959g = aVarArr;
        this.f49960h = z15;
    }
}

```

## eg/g.java

```java
package eg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.x5;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        x5 x5Var = null;
        byte[] bArrB = null;
        int[] iArrE = null;
        String[] strArrI = null;
        int[] iArrE2 = null;
        byte[][] bArrC = null;
        qh.a[] aVarArr = null;
        boolean zO = true;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    x5Var = (x5) kg.b.g(parcel, iT, x5.CREATOR);
                    break;
                case 3:
                    bArrB = kg.b.b(parcel, iT);
                    break;
                case 4:
                    iArrE = kg.b.e(parcel, iT);
                    break;
                case 5:
                    strArrI = kg.b.i(parcel, iT);
                    break;
                case 6:
                    iArrE2 = kg.b.e(parcel, iT);
                    break;
                case 7:
                    bArrC = kg.b.c(parcel, iT);
                    break;
                case 8:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 9:
                    aVarArr = (qh.a[]) kg.b.k(parcel, iT, qh.a.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new f(x5Var, bArrB, iArrE, strArrI, iArrE2, bArrC, zO, aVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i15) {
        return new f[i15];
    }
}

```

## eh/b1.java

```java
package eh;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ClassLoader f50257a = b1.class.getClassLoader();

    private b1() {
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}

```

## eh/c2.java

```java
package eh;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c2 extends kg.a {
    public static final Parcelable.Creator<c2> CREATOR = new d3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF[] f50293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50294b;

    public c2(PointF[] pointFArr, int i15) {
        this.f50293a = pointFArr;
        this.f50294b = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.x(parcel, 2, this.f50293a, i15, false);
        kg.c.m(parcel, 3, this.f50294b);
        kg.c.b(parcel, iA);
    }
}

```

## eh/d3.java

```java
package eh;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        PointF[] pointFArr = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                pointFArr = (PointF[]) kg.b.k(parcel, iT, PointF.CREATOR);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                iV = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new c2(pointFArr, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new c2[i15];
    }
}

```

## eh/de.java

```java
package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class de extends kg.a {
    public static final Parcelable.Creator<de> CREATOR = new ee();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f50475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f50476e;

    public de(int i15, int i16, int i17, int i18, long j15) {
        this.f50472a = i15;
        this.f50473b = i16;
        this.f50474c = i17;
        this.f50475d = i18;
        this.f50476e = j15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50472a);
        kg.c.m(parcel, 2, this.f50473b);
        kg.c.m(parcel, 3, this.f50474c);
        kg.c.m(parcel, 4, this.f50475d);
        kg.c.r(parcel, 5, this.f50476e);
        kg.c.b(parcel, iA);
    }
}

```
