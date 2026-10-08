# Paczka 240 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `zg/o0.java`, `zg/p0.java`, `zg/r.java`, `zh/a.java`

## zg/o0.java

```java
package zg;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0 extends kg.a {
    public static final Parcelable.Creator<o0> CREATOR = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f235099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0 f235100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh.x f235101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kh.u f235102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PendingIntent f235103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k1 f235104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f235105g;

    o0(int i15, m0 m0Var, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.f235099a = i15;
        this.f235100b = m0Var;
        k1 i1Var = null;
        this.f235101c = iBinder != null ? kh.w.m3(iBinder) : null;
        this.f235103e = pendingIntent;
        this.f235102d = iBinder2 != null ? kh.t.m3(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            i1Var = iInterfaceQueryLocalInterface instanceof k1 ? (k1) iInterfaceQueryLocalInterface : new i1(iBinder3);
        }
        this.f235104f = i1Var;
        this.f235105g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f235099a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.t(parcel, 2, this.f235100b, i15, false);
        kh.x xVar = this.f235101c;
        kg.c.l(parcel, 3, xVar == null ? null : xVar.asBinder(), false);
        kg.c.t(parcel, 4, this.f235103e, i15, false);
        kh.u uVar = this.f235102d;
        kg.c.l(parcel, 5, uVar == null ? null : uVar.asBinder(), false);
        k1 k1Var = this.f235104f;
        kg.c.l(parcel, 6, k1Var != null ? k1Var.asBinder() : null, false);
        kg.c.u(parcel, 8, this.f235105g, false);
        kg.c.b(parcel, iA);
    }
}

```

## zg/p0.java

```java
package zg;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        m0 m0Var = null;
        IBinder iBinderU = null;
        IBinder iBinderU2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderU3 = null;
        String strH = null;
        int iV = 1;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 2:
                    m0Var = (m0) kg.b.g(parcel, iT, m0.CREATOR);
                    break;
                case 3:
                    iBinderU = kg.b.u(parcel, iT);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) kg.b.g(parcel, iT, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderU2 = kg.b.u(parcel, iT);
                    break;
                case 6:
                    iBinderU3 = kg.b.u(parcel, iT);
                    break;
                case 7:
                default:
                    kg.b.B(parcel, iT);
                    break;
                case 8:
                    strH = kg.b.h(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new o0(iV, m0Var, iBinderU, iBinderU2, pendingIntent, iBinderU3, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new o0[i15];
    }
}

```

## zg/r.java

```java
package zg;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006Jw\u0010\u0014\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJI\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001dJ_\u0010\u0019\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006&"}, d2 = {"Lcom/google/android/gms/libs/identity/ClientIdentity$Companion;", "", "Lcom/google/android/gms/framework/logging/proto/GcoreDimensions$GCoreClientInfo$ClientType;", "clientType", "Lcom/google/android/gms/libs/identity/ClientType;", "convertClientType", "(Lcom/google/android/gms/framework/logging/proto/GcoreDimensions$GCoreClientInfo$ClientType;)Lcom/google/android/gms/libs/identity/ClientType;", "", "packageName", "", "uid", "pid", "attributionTag", "listenerId", "clientSdkVersion", "", "Lgg/c;", "clientFeatures", "Lcom/google/android/gms/libs/identity/ClientIdentity;", "impersonator", "forTest", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientType;Lcom/google/android/gms/libs/identity/ClientIdentity;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "Landroid/content/Context;", "context", "Lcom/google/android/gms/libs/identity/Impersonator;", "from", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/Impersonator;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "Ljg/g;", "request", "(Lcom/google/android/gms/framework/logging/proto/GcoreDimensions$GCoreClientInfo$ClientType;Ljg/g;IILjava/lang/String;Lcom/google/android/gms/libs/identity/Impersonator;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/Impersonator;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "MY_PID", "I", "MY_UID", "UNKNOWN_PID", "java.com.google.android.gms.libs.identity_identity"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r {
    public /* synthetic */ r(fr.k kVar) {
    }
}

```

## zh/a.java

Powiązane klasy (możesz dosłać): `kg/c.java`

```java
package zh;

import android.os.Parcel;
import android.os.Parcelable;
import kg.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f235242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f235243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f235244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f235245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f235246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f235247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f235248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f235249h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f235250j;

    private a() {
    }

    public String C() {
        return this.f235247f;
    }

    public String E() {
        return this.f235250j;
    }

    public String H() {
        return this.f235249h;
    }

    public boolean h() {
        return this.f235244c;
    }

    public int m() {
        return this.f235243b;
    }

    public String p() {
        return this.f235245d;
    }

    public String r() {
        return this.f235246e;
    }

    public String u() {
        return this.f235242a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = c.a(parcel);
        c.u(parcel, 1, u(), false);
        c.m(parcel, 2, m());
        c.c(parcel, 3, h());
        c.u(parcel, 4, p(), false);
        c.u(parcel, 5, r(), false);
        c.u(parcel, 6, C(), false);
        c.u(parcel, 7, y(), false);
        c.u(parcel, 8, H(), false);
        c.u(parcel, 9, E(), false);
        c.b(parcel, iA);
    }

    public String y() {
        return this.f235248g;
    }

    a(String str, int i15, boolean z15, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f235242a = str;
        this.f235243b = i15;
        this.f235244c = z15;
        this.f235245d = str2;
        this.f235246e = str3;
        this.f235247f = str4;
        this.f235248g = str5;
        this.f235249h = str6;
        this.f235250j = str7;
    }
}

```
