# Paczka 130 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/h5.java`, `ii/h6.java`, `ii/i.java`, `ii/i0.java`, `ii/i3.java`, `ii/i4.java`, `ii/i5.java`, `ii/i6.java`, `ii/j.java`, `ii/j0.java`, `ii/j3.java`, `ii/j4.java`, `ii/j5.java`, `ii/j6.java`

## ii/h5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class h5 implements Parcelable.Creator {
    h5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new i5(parcel.readString(), Long.valueOf(parcel.readLong()), Integer.valueOf(parcel.readInt()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new i5[i15];
    }
}

```

## ii/h6.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class h6 extends u2 {
    public static final Parcelable.Creator<h6> CREATOR = new g6();

    h6(String str, String str2, String str3, String str4, String str5, Double d15, f fVar, String str6, String str7, Uri uri, a0 a0Var) {
        super(str, str2, str3, str4, str5, d15, fVar, str6, str7, uri, a0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        if (i() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(i());
        }
        if (j() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(j());
        }
        if (k() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(k());
        }
        if (e() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(e());
        }
        if (f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(f());
        }
        parcel.writeDouble(h().doubleValue());
        parcel.writeParcelable(c(), i15);
        parcel.writeString(b());
        if (g() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(g());
        }
        parcel.writeParcelable(d(), i15);
        parcel.writeParcelable(l(), i15);
    }
}

```

## ii/i.java

```java
package ii;

import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i implements Parcelable {
    @RecentlyNonNull
    public static i a() {
        return new b4(new ParcelUuid(UUID.randomUUID()));
    }

    abstract ParcelUuid b();

    @RecentlyNonNull
    public final String toString() {
        return b().toString();
    }
}

```

## ii/i0.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract i0 a();

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract a d(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull l0.a aVar);
    }

    @RecentlyNonNull
    public static a a() {
        e2 e2Var = new e2();
        l0.a aVar = l0.a.UNKNOWN;
        e2Var.c(aVar);
        e2Var.d(aVar);
        e2Var.b(aVar);
        e2Var.e(aVar);
        return e2Var;
    }

    @RecentlyNonNull
    public abstract l0.a b();

    @RecentlyNonNull
    public abstract l0.a c();

    @RecentlyNonNull
    public abstract l0.a d();

    @RecentlyNonNull
    public abstract l0.a e();
}

```

## ii/i3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class i3 extends x1 {
    public static final Parcelable.Creator<i3> CREATOR = new h3();

    i3(l0.a aVar, l0.a aVar2, l0.a aVar3, l0.a aVar4) {
        super(aVar, aVar2, aVar3, aVar4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(c(), i15);
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(d(), i15);
        parcel.writeParcelable(e(), i15);
    }
}

```

## ii/i4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class i4 implements Parcelable.Creator {
    i4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new j4(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new j4[i15];
    }
}

```

## ii/i5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class i5 extends w1 {
    public static final Parcelable.Creator<i5> CREATOR = new h5();

    i5(String str, Long l15, Integer num) {
        super(str, l15, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(a());
        parcel.writeLong(c().longValue());
        parcel.writeInt(b().intValue());
    }
}

```

## ii/i6.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class i6 implements Parcelable.Creator {
    i6() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new j6(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Uri) parcel.readParcelable(s0.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Uri) parcel.readParcelable(s0.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new j6[i15];
    }
}

```

## ii/j.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j implements c0, d0, Parcelable {
    @RecentlyNonNull
    public abstract LatLng a();

    public abstract double b();
}

```

## ii/j0.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract j0 a();

        @RecentlyNonNull
        public abstract a b(y0 y0Var);

        @RecentlyNonNull
        public abstract a c(y0 y0Var);
    }

    @RecentlyNonNull
    public static a a() {
        return new g2();
    }

    @RecentlyNullable
    public abstract y0 b();

    @RecentlyNullable
    public abstract y0 c();
}

```

## ii/j3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class j3 implements Parcelable.Creator {
    j3() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new k3(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(b.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new k3[i15];
    }
}

```

## ii/j4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class j4 extends x7 {
    public static final Parcelable.Creator<j4> CREATOR = new i4();

    j4(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(c());
        parcel.writeString(b());
    }
}

```

## ii/j5.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class j5 implements Parcelable.Creator {
    j5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new k5((o) parcel.readParcelable(f0.class.getClassLoader()), (o) parcel.readParcelable(f0.class.getClassLoader()), (Uri) parcel.readParcelable(f0.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new k5[i15];
    }
}

```

## ii/j6.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class j6 extends x2 {
    public static final Parcelable.Creator<j6> CREATOR = new i6();

    j6(String str, String str2, Uri uri, String str3, String str4, Uri uri2) {
        super(str, str2, uri, str3, str4, uri2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        if (f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(f());
        }
        if (g() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(g());
        }
        parcel.writeParcelable(d(), i15);
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(b());
        }
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c());
        }
        parcel.writeParcelable(e(), i15);
    }
}

```
