# Paczka 231 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `yh/b.java`, `yh/b0.java`, `yh/c.java`, `yh/c0.java`, `yh/d.java`, `yh/e.java`, `yh/e0.java`

## yh/b.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kg.a {
    public static final Parcelable.Creator<b> CREATOR = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f226808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f226809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f226810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f226811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    UserAddress f226812e;

    private b() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, this.f226808a, false);
        kg.c.u(parcel, 2, this.f226809b, false);
        kg.c.u(parcel, 3, this.f226810c, false);
        kg.c.m(parcel, 4, this.f226811d);
        kg.c.t(parcel, 5, this.f226812e, i15, false);
        kg.c.b(parcel, iA);
    }

    b(String str, String str2, String str3, int i15, UserAddress userAddress) {
        this.f226808a = str;
        this.f226809b = str2;
        this.f226810c = str3;
        this.f226811d = i15;
        this.f226812e = userAddress;
    }
}

```

## yh/b0.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList<String> arrayListJ = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 1) {
                kg.b.B(parcel, iT);
            } else {
                arrayListJ = kg.b.j(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new p(arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new p[i15];
    }
}

```

## yh/c.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends kg.a {
    public static final Parcelable.Creator<c> CREATOR = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f226813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f226814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f226815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f226816d;

    private c() {
        this.f226814b = true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.o(parcel, 1, this.f226813a, false);
        kg.c.c(parcel, 2, this.f226814b);
        kg.c.c(parcel, 3, this.f226815c);
        kg.c.m(parcel, 4, this.f226816d);
        kg.c.b(parcel, iA);
    }

    c(ArrayList arrayList, boolean z15, boolean z16, int i15) {
        this.f226813a = arrayList;
        this.f226814b = z15;
        this.f226815c = z16;
        this.f226816d = i15;
    }
}

```

## yh/c0.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        int iV = 0;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                strH2 = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new q(iV, strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new q[i15];
    }
}

```

## yh/d.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends kg.a {
    public static final Parcelable.Creator<d> CREATOR = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f226817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f226818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f226819c;

    private d() {
    }

    public int h() {
        int i15 = this.f226819c;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            return i15;
        }
        return 0;
    }

    public String m() {
        return this.f226818b;
    }

    public String p() {
        return this.f226817a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, p(), false);
        kg.c.u(parcel, 3, m(), false);
        kg.c.m(parcel, 4, h());
        kg.c.b(parcel, iA);
    }

    public d(String str, String str2, int i15) {
        this.f226817a = str;
        this.f226818b = str2;
        this.f226819c = i15;
    }
}

```

## yh/e.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends kg.a {
    public static final Parcelable.Creator<e> CREATOR = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f226820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f226821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f226822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f226823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f226824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f226825f;

    @Deprecated
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f226826a;

        /* synthetic */ a(e eVar, byte[] bArr) {
            Objects.requireNonNull(eVar);
            this.f226826a = eVar;
        }

        public e a() {
            return this.f226826a;
        }
    }

    e() {
    }

    public static e h(String str) {
        a aVarM = m();
        aVarM.f226826a.f226825f = (String) jg.s.m(str, "isReadyToPayRequestJson cannot be null!");
        return aVarM.a();
    }

    @Deprecated
    public static a m() {
        return new a(new e(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.o(parcel, 2, this.f226820a, false);
        kg.c.u(parcel, 4, this.f226821b, false);
        kg.c.u(parcel, 5, this.f226822c, false);
        kg.c.o(parcel, 6, this.f226823d, false);
        kg.c.c(parcel, 7, this.f226824e);
        kg.c.u(parcel, 8, this.f226825f, false);
        kg.c.b(parcel, iA);
    }

    e(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z15, String str3) {
        this.f226820a = arrayList;
        this.f226821b = str;
        this.f226822c = str2;
        this.f226823d = arrayList2;
        this.f226824e = z15;
        this.f226825f = str3;
    }
}

```

## yh/e0.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        String strH8 = null;
        String strH9 = null;
        String strH10 = null;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    strH5 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    strH6 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    strH7 = kg.b.h(parcel, iT);
                    break;
                case 9:
                    strH8 = kg.b.h(parcel, iT);
                    break;
                case 10:
                    strH9 = kg.b.h(parcel, iT);
                    break;
                case 11:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 12:
                    strH10 = kg.b.h(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new s(strH, strH2, strH3, strH4, strH5, strH6, strH7, strH8, strH9, zO, strH10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new s[i15];
    }
}

```
