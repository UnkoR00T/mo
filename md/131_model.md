# Paczka 131 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/k.java`, `ii/k0.java`, `ii/k3.java`, `ii/k4.java`, `ii/k5.java`, `ii/l.java`

## ii/k.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract k a();

        @RecentlyNonNull
        public abstract a b(Instant instant);

        @RecentlyNonNull
        public abstract a c(Integer num);

        @RecentlyNonNull
        public abstract a d(@RecentlyNonNull Integer num);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull Double d15);

        @RecentlyNonNull
        public abstract a f(Integer num);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull r rVar, @RecentlyNonNull Double d15, @RecentlyNonNull Integer num) {
        q7 q7Var = new q7();
        q7Var.g(rVar);
        q7Var.e(d15);
        q7Var.d(num);
        return q7Var;
    }

    @RecentlyNullable
    public abstract Instant b();

    @RecentlyNullable
    public abstract Integer c();

    @RecentlyNonNull
    public abstract Integer d();

    @RecentlyNonNull
    public abstract Double e();

    @RecentlyNullable
    public abstract Integer f();

    @RecentlyNonNull
    public abstract r g();
}

```

## ii/k0.java

```java
package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public k0 a() {
            k0 k0VarI = i();
            int iG = k0VarI.g();
            zj.p.h(iG >= 0, "Width must not be < 0, but was: %s.", iG);
            int iF = k0VarI.f();
            zj.p.h(iF >= 0, "Height must not be < 0, but was: %s.", iF);
            zj.p.e(!k0VarI.h().isEmpty(), "PhotoReference must not be empty.");
            return k0VarI;
        }

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract a c(g gVar);

        @RecentlyNonNull
        public abstract a d(Uri uri);

        @RecentlyNonNull
        public abstract a e(int i15);

        @RecentlyNonNull
        public abstract a f(int i15);

        @RecentlyNonNull
        public abstract a g(String str);

        @RecentlyNonNull
        public abstract a h(Uri uri);

        abstract k0 i();
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull String str) {
        i2 i2Var = new i2();
        i2Var.j(str);
        i2Var.f(0);
        i2Var.e(0);
        i2Var.b("");
        return i2Var;
    }

    @RecentlyNonNull
    public abstract String b();

    @RecentlyNullable
    public abstract g c();

    @RecentlyNullable
    public abstract Uri d();

    @RecentlyNullable
    public abstract Uri e();

    public abstract int f();

    public abstract int g();

    @RecentlyNonNull
    public abstract String h();

    @RecentlyNullable
    public abstract String i();
}

```

## ii/k3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class k3 extends s3 {
    public static final Parcelable.Creator<k3> CREATOR = new j3();

    k3(String str, String str2, List list) {
        super(str, str2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(b());
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c());
        }
        parcel.writeList(d());
    }
}

```

## ii/k4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class k4 implements Parcelable.Creator {
    k4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new l4(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(o.class.getClassLoader()), parcel.readArrayList(o.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new l4[i15];
    }
}

```

## ii/k5.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class k5 extends z1 {
    public static final Parcelable.Creator<k5> CREATOR = new j5();

    k5(o oVar, o oVar2, Uri uri, String str, String str2) {
        super(oVar, oVar2, uri, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(f(), i15);
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(e(), i15);
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c());
        }
        if (d() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(d());
        }
    }
}

```

## ii/l.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract l a();

        @RecentlyNonNull
        public abstract a b(m mVar);

        @RecentlyNonNull
        public abstract a c(String str);

        @RecentlyNonNull
        public abstract a d(String str);
    }

    @RecentlyNonNull
    public static a a() {
        return new s7();
    }

    @RecentlyNullable
    public abstract m b();

    @RecentlyNullable
    public abstract String c();

    @RecentlyNullable
    public abstract String d();
}

```
