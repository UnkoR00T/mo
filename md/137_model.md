# Paczka 137 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/w.java`, `ii/w0.java`, `ii/w3.java`, `ii/w4.java`, `ii/w5.java`, `ii/x.java`, `ii/x0.java`, `ii/x3.java`

## ii/w.java

```java
package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w extends g3 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract w a();

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(Uri uri);

        @RecentlyNonNull
        public abstract a e(String str);

        @RecentlyNonNull
        public abstract a f(String str);
    }

    @RecentlyNonNull
    public static a a() {
        return new k1();
    }

    @RecentlyNullable
    public abstract String b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract Uri d();

    @RecentlyNullable
    public abstract String e();

    @RecentlyNullable
    public abstract String f();
}

```

## ii/w0.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract w0 a();

        @RecentlyNonNull
        public abstract a b(boolean z15);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull a0 a0Var) {
        a3 a3Var = new a3();
        a3Var.c(a0Var);
        a3Var.b(false);
        return a3Var;
    }

    @RecentlyNonNull
    public abstract a0 b();

    public abstract boolean c();
}

```

## ii/w3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class w3 implements Parcelable.Creator {
    w3() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new x3(parcel.readString(), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readArrayList(h.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readArrayList(h.class.getClassLoader()), parcel.readArrayList(h.class.getClassLoader()), parcel.readArrayList(h.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new x3[i15];
    }
}

```

## ii/w4.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class w4 extends l1 {
    public static final Parcelable.Creator<w4> CREATOR = new v4();

    w4(String str, String str2, Uri uri, String str3, String str4) {
        super(str, str2, uri, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
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
    }
}

```

## ii/w5.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.time.ZoneId;

/* JADX INFO: loaded from: classes4.dex */
final class w5 implements Parcelable.Creator {
    w5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new x5(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (c) parcel.readParcelable(l0.class.getClassLoader()), parcel.readArrayList(l0.class.getClassLoader()), (l0.c) parcel.readParcelable(l0.class.getClassLoader()), (l) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (g0) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (LatLng) parcel.readParcelable(l0.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (g0) parcel.readParcelable(l0.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(l0.class.getClassLoader()), parcel.readArrayList(l0.class.getClassLoader()), parcel.readArrayList(l0.class.getClassLoader()), (n0) parcel.readParcelable(l0.class.getClassLoader()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, (p0) parcel.readParcelable(l0.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null, (l0.a) parcel.readParcelable(l0.class.getClassLoader()), parcel.readArrayList(l0.class.getClassLoader()), parcel.readArrayList(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, (LatLngBounds) parcel.readParcelable(l0.class.getClassLoader()), (Uri) parcel.readParcelable(l0.class.getClassLoader()), (Uri) parcel.readParcelable(l0.class.getClassLoader()), (a) parcel.readParcelable(l0.class.getClassLoader()), (h0) parcel.readParcelable(l0.class.getClassLoader()), (i0) parcel.readParcelable(l0.class.getClassLoader()), (q) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), parcel.readArrayList(l0.class.getClassLoader()), (u) parcel.readParcelable(l0.class.getClassLoader()), (l0.a) parcel.readParcelable(l0.class.getClassLoader()), (w) parcel.readParcelable(l0.class.getClassLoader()), (t) parcel.readParcelable(l0.class.getClassLoader()), (f0) parcel.readParcelable(l0.class.getClassLoader()), (s0) parcel.readParcelable(l0.class.getClassLoader()), (x) parcel.readParcelable(l0.class.getClassLoader()), parcel.readArrayList(l0.class.getClassLoader()), parcel.readInt() == 0 ? (ZoneId) parcel.readSerializable() : null, (d) parcel.readParcelable(l0.class.getClassLoader()), (o0) parcel.readParcelable(l0.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new x5[i15];
    }
}

```

## ii/x.java

```java
package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract x a();

        @RecentlyNonNull
        public abstract a b(Uri uri);

        @RecentlyNonNull
        public abstract a c(Uri uri);

        @RecentlyNonNull
        public abstract a d(Uri uri);

        @RecentlyNonNull
        public abstract a e(Uri uri);

        @RecentlyNonNull
        public abstract a f(Uri uri);
    }

    @RecentlyNonNull
    public static a a() {
        return new m1();
    }

    @RecentlyNullable
    public abstract Uri b();

    @RecentlyNullable
    public abstract Uri c();

    @RecentlyNullable
    public abstract Uri d();

    @RecentlyNullable
    public abstract Uri e();

    @RecentlyNullable
    public abstract Uri f();
}

```

## ii/x0.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract x0 a();

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull String str);
    }

    @RecentlyNonNull
    public static x0 c(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        c3 c3Var = new c3();
        c3Var.c(str);
        c3Var.b(str2);
        return c3Var.a();
    }

    @RecentlyNonNull
    public abstract String a();

    @RecentlyNonNull
    public abstract String b();
}

```

## ii/x3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class x3 extends m7 {
    public static final Parcelable.Creator<x3> CREATOR = new w3();

    x3(String str, Integer num, List list, String str2, String str3, String str4, List list2, List list3, List list4) {
        super(str, num, list, str2, str3, str4, list2, list3, list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(c());
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(b().intValue());
        }
        parcel.writeList(f());
        parcel.writeString(g());
        parcel.writeString(h());
        parcel.writeString(i());
        parcel.writeList(j());
        parcel.writeList(k());
        parcel.writeList(l());
    }
}

```
