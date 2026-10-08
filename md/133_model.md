# Paczka 133 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/l3.java`, `ii/l4.java`, `ii/l5.java`, `ii/l6.java`, `ii/m.java`, `ii/m0.java`, `ii/m3.java`, `ii/m4.java`, `ii/m5.java`, `ii/m6.java`, `ii/n.java`, `ii/n0.java`, `ii/n3.java`, `ii/n4.java`, `ii/n5.java`, `ii/n6.java`

## ii/l3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class l3 implements Parcelable.Creator {
    l3() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new m3(parcel.readArrayList(c.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new m3[i15];
    }
}

```

## ii/l4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class l4 extends b1 {
    public static final Parcelable.Creator<l4> CREATOR = new k4();

    l4(String str, String str2, List list, List list2) {
        super(str, str2, list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
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
        parcel.writeList(e());
        parcel.writeList(d());
    }
}

```

## ii/l5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class l5 implements Parcelable.Creator {
    l5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        g0.b bVar = (g0.b) parcel.readParcelable(g0.class.getClassLoader());
        ArrayList arrayList = parcel.readArrayList(g0.class.getClassLoader());
        ArrayList arrayList2 = parcel.readArrayList(g0.class.getClassLoader());
        ArrayList arrayList3 = parcel.readArrayList(g0.class.getClassLoader());
        if (parcel.readInt() == 0) {
            boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
        } else {
            boolValueOf = null;
        }
        return new m5(bVar, arrayList, arrayList2, arrayList3, boolValueOf, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new m5[i15];
    }
}

```

## ii/l6.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class l6 implements Parcelable.Creator {
    l6() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new m6(parcel.readArrayList(u0.class.getClassLoader()), (Uri) parcel.readParcelable(u0.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new m6[i15];
    }
}

```

## ii/m.java

```java
package ii;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract m a();

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(Uri uri);

        @RecentlyNonNull
        public abstract a d(String str);

        @RecentlyNonNull
        public abstract a e(String str);
    }

    @RecentlyNonNull
    public static a a() {
        return new u7();
    }

    @RecentlyNullable
    public abstract String b();

    @RecentlyNullable
    public abstract Uri c();

    @RecentlyNullable
    public abstract String d();

    @RecentlyNullable
    public abstract String e();
}

```

## ii/m0.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class m0 implements Parcelable {
    @RecentlyNonNull
    public static m0 c(@RecentlyNonNull l0 l0Var, double d15) {
        Double dValueOf = Double.valueOf(0.0d);
        Double dValueOf2 = Double.valueOf(1.0d);
        ak.q1 q1VarD = ak.q1.d(dValueOf, dValueOf2);
        Double dValueOf3 = Double.valueOf(d15);
        zj.p.n(q1VarD.g(dValueOf3), "Likelihood must not be out-of-range: %s to %s, but was: %s.", dValueOf, dValueOf2, dValueOf3);
        return new z5(l0Var, d15);
    }

    public abstract double a();

    @RecentlyNonNull
    public abstract l0 b();
}

```

## ii/m3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class m3 extends o4 {
    public static final Parcelable.Creator<m3> CREATOR = new l3();

    m3(List list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeList(a());
    }
}

```

## ii/m4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class m4 implements Parcelable.Creator {
    m4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new n4(Integer.valueOf(parcel.readInt()), parcel.readArrayList(q.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new n4[i15];
    }
}

```

## ii/m5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class m5 extends b2 {
    public static final Parcelable.Creator<m5> CREATOR = new l5();

    m5(g0.b bVar, List list, List list2, List list3, Boolean bool, Instant instant, Instant instant2) {
        super(bVar, list, list2, list3, bool, instant, instant2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
        parcel.writeList(c());
        parcel.writeList(d());
        parcel.writeList(e());
        if (f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(f().booleanValue() ? 1 : 0);
        }
        if (g() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(g());
        }
        if (h() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(h());
        }
    }
}

```

## ii/m6.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class m6 extends z2 {
    public static final Parcelable.Creator<m6> CREATOR = new l6();

    m6(List list, Uri uri) {
        super(list, uri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeList(c());
        parcel.writeParcelable(b(), i15);
    }
}

```

## ii/n.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract n a();

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull String str);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        w7 w7Var = new w7();
        w7Var.c(str);
        w7Var.b(str2);
        return w7Var;
    }

    @RecentlyNonNull
    public abstract String b();

    @RecentlyNonNull
    public abstract String c();
}

```

## ii/n0.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract n0 a();

        @RecentlyNonNull
        public abstract a b(String str);

        @RecentlyNonNull
        public abstract a c(String str);
    }

    @RecentlyNonNull
    public static a a() {
        return new n2();
    }

    @RecentlyNullable
    public abstract String b();

    @RecentlyNullable
    public abstract String c();
}

```

## ii/n3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class n3 implements Parcelable.Creator {
    n3() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new o3(parcel.readArrayList(d.class.getClassLoader()), parcel.readArrayList(d.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new o3[i15];
    }
}

```

## ii/n4.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class n4 extends d1 {
    public static final Parcelable.Creator<n4> CREATOR = new m4();

    n4(Integer num, List list) {
        super(num, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(b().intValue());
        parcel.writeList(a());
    }
}

```

## ii/n5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class n5 implements Parcelable.Creator {
    n5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new p5((l0.a) parcel.readParcelable(h0.class.getClassLoader()), (l0.a) parcel.readParcelable(h0.class.getClassLoader()), (l0.a) parcel.readParcelable(h0.class.getClassLoader()), (l0.a) parcel.readParcelable(h0.class.getClassLoader()), (l0.a) parcel.readParcelable(h0.class.getClassLoader()), (l0.a) parcel.readParcelable(h0.class.getClassLoader()), (l0.a) parcel.readParcelable(h0.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new p5[i15];
    }
}

```

## ii/n6.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class n6 implements Parcelable.Creator {
    n6() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new o6((a0) parcel.readParcelable(w0.class.getClassLoader()), parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new o6[i15];
    }
}

```
