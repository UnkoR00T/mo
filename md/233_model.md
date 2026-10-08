# Paczka 233 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `yh/i.java`, `yh/i0.java`, `yh/j.java`, `yh/j0.java`, `yh/k.java`

## yh/i.java

```java
package yh;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends kg.a {
    public static final Parcelable.Creator<i> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f226863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b f226864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    UserAddress f226865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    l f226866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f226867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Bundle f226868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f226869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Bundle f226870h;

    private i() {
    }

    public static i h(Intent intent) {
        return (i) kg.e.b(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    public String m() {
        return this.f226869g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, this.f226863a, false);
        kg.c.t(parcel, 2, this.f226864b, i15, false);
        kg.c.t(parcel, 3, this.f226865c, i15, false);
        kg.c.t(parcel, 4, this.f226866d, i15, false);
        kg.c.u(parcel, 5, this.f226867e, false);
        kg.c.d(parcel, 6, this.f226868f, false);
        kg.c.u(parcel, 7, this.f226869g, false);
        kg.c.d(parcel, 8, this.f226870h, false);
        kg.c.b(parcel, iA);
    }

    i(String str, b bVar, UserAddress userAddress, l lVar, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f226863a = str;
        this.f226864b = bVar;
        this.f226865c = userAddress;
        this.f226866d = lVar;
        this.f226867e = str2;
        this.f226868f = bundle;
        this.f226869g = str3;
        this.f226870h = bundle2;
    }
}

```

## yh/i0.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 3) {
                strH2 = kg.b.h(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                iV = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new d(strH, strH2, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new d[i15];
    }
}

```

## yh/j.java

```java
package yh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends kg.a {
    public static final Parcelable.Creator<j> CREATOR = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f226871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f226872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f226873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f226874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    p f226875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList f226876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    m f226877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    q f226878h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f226879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f226880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    byte[] f226881l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Bundle f226882m;

    @Deprecated
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f226883a;

        /* synthetic */ a(j jVar, byte[] bArr) {
            Objects.requireNonNull(jVar);
            this.f226883a = jVar;
        }

        public j a() {
            j jVar = this.f226883a;
            if (jVar.f226880k == null && jVar.f226881l == null) {
                jg.s.m(jVar.f226876f, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                jg.s.m(jVar.f226873c, "Card requirements must be set!");
                if (jVar.f226877g != null) {
                    jg.s.m(jVar.f226878h, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return jVar;
        }
    }

    private j() {
        this.f226879j = true;
    }

    public static j h(String str) {
        a aVarM = m();
        aVarM.f226883a.f226880k = (String) jg.s.m(str, "paymentDataRequestJson cannot be null!");
        return aVarM.a();
    }

    @Deprecated
    public static a m() {
        return new a(new j(), null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.c(parcel, 1, this.f226871a);
        kg.c.c(parcel, 2, this.f226872b);
        kg.c.t(parcel, 3, this.f226873c, i15, false);
        kg.c.c(parcel, 4, this.f226874d);
        kg.c.t(parcel, 5, this.f226875e, i15, false);
        kg.c.o(parcel, 6, this.f226876f, false);
        kg.c.t(parcel, 7, this.f226877g, i15, false);
        kg.c.t(parcel, 8, this.f226878h, i15, false);
        kg.c.c(parcel, 9, this.f226879j);
        kg.c.u(parcel, 10, this.f226880k, false);
        kg.c.d(parcel, 11, this.f226882m, false);
        kg.c.f(parcel, 12, this.f226881l, false);
        kg.c.b(parcel, iA);
    }

    j(boolean z15, boolean z16, c cVar, boolean z17, p pVar, ArrayList arrayList, m mVar, q qVar, boolean z18, String str, byte[] bArr, Bundle bundle) {
        this.f226871a = z15;
        this.f226872b = z16;
        this.f226873c = cVar;
        this.f226874d = z17;
        this.f226875e = pVar;
        this.f226876f = arrayList;
        this.f226877g = mVar;
        this.f226878h = qVar;
        this.f226879j = z18;
        this.f226880k = str;
        this.f226881l = bArr;
        this.f226882m = bundle;
    }
}

```

## yh/j0.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList<Integer> arrayListF = null;
        String strH = null;
        String strH2 = null;
        ArrayList<Integer> arrayListF2 = null;
        String strH3 = null;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    arrayListF = kg.b.f(parcel, iT);
                    break;
                case 3:
                default:
                    kg.b.B(parcel, iT);
                    break;
                case 4:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    arrayListF2 = kg.b.f(parcel, iT);
                    break;
                case 7:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 8:
                    strH3 = kg.b.h(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new e(arrayListF, strH, strH2, arrayListF2, zO, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new e[i15];
    }
}

```

## yh/k.java

```java
package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends kg.a {
    public static final Parcelable.Creator<k> CREATOR = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f226884a;

    k(String str) {
        this.f226884a = (String) jg.s.m(str, "responseJson cannot be null!");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        String str = this.f226884a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.b(parcel, iA);
    }
}

```
