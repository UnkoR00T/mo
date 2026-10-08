# Paczka 119 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `fg/d.java`, `fg/j.java`, `fg/l.java`, `fh/al.java`, `fh/b1.java`, `fh/bl.java`, `fh/c2.java`, `fh/cl.java`, `fh/d3.java`, `fh/dl.java`

## fg/d.java

```java
package fg;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 1) {
                kg.b.B(parcel, iT);
            } else {
                intent = (Intent) kg.b.g(parcel, iT, Intent.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new a[i15];
    }
}

```

## fg/j.java

```java
package fg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
final class j implements Parcelable.Creator {
    j() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new l(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new l[i15];
    }
}

```

## fg/l.java

```java
package fg;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Messenger f62293a;

    public l(IBinder iBinder) {
        this.f62293a = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f62293a;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f62293a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((l) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        Messenger messenger = this.f62293a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}

```

## fh/al.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class al extends kg.a {
    public static final Parcelable.Creator<al> CREATOR = new bl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f62939b;

    public al(String str, List list) {
        this.f62938a = str;
        this.f62939b = list;
    }

    public final String h() {
        return this.f62938a;
    }

    public final List m() {
        return this.f62939b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f62938a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.y(parcel, 2, this.f62939b, false);
        kg.c.b(parcel, iA);
    }
}

```

## fh/b1.java

```java
package fh;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 {
    static {
        b1.class.getClassLoader();
    }

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

## fh/bl.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class bl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        ArrayList arrayListL = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                strH = kg.b.h(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                arrayListL = kg.b.l(parcel, iT, tk.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new al(strH, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new al[i15];
    }
}

```

## fh/c2.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c2 extends kg.a {
    public static final Parcelable.Creator<c2> CREATOR = new d3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f62973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62974e;

    public c2(int i15, int i16, int i17, long j15, int i18) {
        this.f62970a = i15;
        this.f62971b = i16;
        this.f62972c = i17;
        this.f62973d = j15;
        this.f62974e = i18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f62970a);
        kg.c.m(parcel, 3, this.f62971b);
        kg.c.m(parcel, 4, this.f62972c);
        kg.c.r(parcel, 5, this.f62973d);
        kg.c.m(parcel, 6, this.f62974e);
        kg.c.b(parcel, iA);
    }
}

```

## fh/cl.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class cl extends kg.a {
    public static final Parcelable.Creator<cl> CREATOR = new dl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f62986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f62987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f62988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f62989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f62990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f62991g;

    public cl(String str, String str2, String str3, boolean z15, int i15, String str4, boolean z16) {
        this.f62985a = str;
        this.f62986b = str2;
        this.f62987c = str3;
        this.f62990f = str4;
        this.f62989e = i15;
        this.f62988d = z15;
        this.f62991g = z16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f62985a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f62986b, false);
        kg.c.u(parcel, 3, this.f62987c, false);
        kg.c.c(parcel, 4, this.f62988d);
        kg.c.m(parcel, 5, this.f62989e);
        kg.c.u(parcel, 6, this.f62990f, false);
        kg.c.c(parcel, 7, this.f62991g);
        kg.c.b(parcel, iA);
    }
}

```

## fh/d3.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        long jY = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 3) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN == 4) {
                iV3 = kg.b.v(parcel, iT);
            } else if (iN == 5) {
                jY = kg.b.y(parcel, iT);
            } else if (iN != 6) {
                kg.b.B(parcel, iT);
            } else {
                iV4 = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new c2(iV, iV2, iV3, jY, iV4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new c2[i15];
    }
}

```

## fh/dl.java

```java
package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class dl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        boolean zO = false;
        int iV = 0;
        boolean zO2 = false;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 2:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 5:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 6:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new cl(strH, strH2, strH3, zO, iV, strH4, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new cl[i15];
    }
}

```
