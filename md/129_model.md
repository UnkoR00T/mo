# Paczka 129 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/g.java`, `ii/g0.java`, `ii/g4.java`, `ii/g5.java`, `ii/g6.java`, `ii/h.java`, `ii/h0.java`, `ii/h3.java`, `ii/h4.java`

## ii/g.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g implements Parcelable {
    @RecentlyNonNull
    public static g b(@RecentlyNonNull List<f> list) {
        return new v3(ak.n0.v(list));
    }

    @RecentlyNonNull
    public abstract List<f> a();
}

```

## ii/g0.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public g0 a() {
            g0 g0VarI = i();
            Iterator<String> it = g0VarI.e().iterator();
            while (it.hasNext()) {
                zj.p.e(!TextUtils.isEmpty(it.next()), "WeekdayText must not contain null or empty values.");
            }
            c(ak.n0.v(g0VarI.c()));
            e(ak.n0.v(g0VarI.e()));
            d(ak.n0.v(g0VarI.d()));
            return i();
        }

        @RecentlyNonNull
        public abstract a b(b bVar);

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull List<j0> list);

        @RecentlyNonNull
        public abstract a d(@RecentlyNonNull List<w0> list);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull List<String> list);

        @RecentlyNonNull
        public abstract a f(Boolean bool);

        @RecentlyNonNull
        public abstract a g(Instant instant);

        @RecentlyNonNull
        public abstract a h(Instant instant);

        abstract g0 i();
    }

    public enum b implements Parcelable {
        ACCESS,
        BREAKFAST,
        BRUNCH,
        DELIVERY,
        DINNER,
        DRIVE_THROUGH,
        HAPPY_HOUR,
        KITCHEN,
        LUNCH,
        ONLINE_SERVICE_HOURS,
        PICKUP,
        SENIOR_HOURS,
        TAKEOUT;


        @RecentlyNonNull
        public static final Parcelable.Creator<b> CREATOR = new a7();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i15) {
            parcel.writeString(name());
        }
    }

    @RecentlyNonNull
    public static a a() {
        a2 a2Var = new a2();
        a2Var.c(new ArrayList());
        a2Var.d(new ArrayList());
        a2Var.e(new ArrayList());
        return a2Var;
    }

    @RecentlyNullable
    public abstract b b();

    @RecentlyNonNull
    public abstract List<j0> c();

    @RecentlyNonNull
    public abstract List<w0> d();

    @RecentlyNonNull
    public abstract List<String> e();

    @RecentlyNullable
    public abstract Boolean f();

    @RecentlyNullable
    public abstract Instant g();

    @RecentlyNullable
    public abstract Instant h();
}

```

## ii/g4.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class g4 implements Parcelable.Creator {
    g4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new h4(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Uri) parcel.readParcelable(m.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new h4[i15];
    }
}

```

## ii/g5.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class g5 extends u1 {
    public static final Parcelable.Creator<g5> CREATOR = new f5();

    g5(int i15, int i16) {
        super(i15, i16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(e());
        parcel.writeInt(g());
    }
}

```

## ii/g6.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class g6 implements Parcelable.Creator {
    g6() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new h6(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, Double.valueOf(parcel.readDouble()), (f) parcel.readParcelable(r0.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (Uri) parcel.readParcelable(r0.class.getClassLoader()), (a0) parcel.readParcelable(r0.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new h6[i15];
    }
}

```

## ii/h.java

```java
package ii;

import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public h a() {
            h hVarK = k();
            f(ak.n0.v(hVarK.f()));
            h(ak.n0.v(hVarK.j()));
            i(ak.n0.v(hVarK.k()));
            j(ak.n0.v(hVarK.l()));
            return k();
        }

        @RecentlyNonNull
        public abstract a b(Integer num);

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract a d(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract a f(@RecentlyNonNull List<String> list);

        abstract a g(String str);

        @RecentlyNonNull
        public abstract a h(@RecentlyNonNull List list);

        @RecentlyNonNull
        public abstract a i(@RecentlyNonNull List list);

        @RecentlyNonNull
        public abstract a j(@RecentlyNonNull List list);

        abstract h k();
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull String str) {
        l7 l7Var = new l7();
        l7Var.h(new ArrayList());
        l7Var.g(str);
        l7Var.i(new ArrayList());
        l7Var.j(new ArrayList());
        l7Var.f(new ArrayList());
        l7Var.c("");
        l7Var.d("");
        l7Var.e("");
        return l7Var;
    }

    private static final SpannableString m(String str, List list, CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (str.length() != 0 && characterStyle != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u6 u6Var = (u6) it.next();
                spannableString.setSpan(CharacterStyle.wrap(characterStyle), u6Var.a(), u6Var.a() + u6Var.b(), 0);
            }
        }
        return spannableString;
    }

    @RecentlyNullable
    public abstract Integer b();

    @RecentlyNonNull
    public abstract String c();

    @RecentlyNonNull
    public SpannableString d(CharacterStyle characterStyle) {
        return m(h(), k(), characterStyle);
    }

    @RecentlyNonNull
    public SpannableString e(CharacterStyle characterStyle) {
        return m(i(), l(), characterStyle);
    }

    @RecentlyNonNull
    public abstract List<String> f();

    abstract String g();

    abstract String h();

    abstract String i();

    abstract List j();

    abstract List k();

    abstract List l();
}

```

## ii/h0.java

```java
package ii;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 implements Parcelable {

    public static abstract class a {
        @RecentlyNonNull
        public abstract h0 a();

        @RecentlyNonNull
        public abstract a b(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract a c(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract a d(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract a e(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract a f(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract a g(@RecentlyNonNull l0.a aVar);

        @RecentlyNonNull
        public abstract a h(@RecentlyNonNull l0.a aVar);
    }

    @RecentlyNonNull
    public static a a() {
        c2 c2Var = new c2();
        l0.a aVar = l0.a.UNKNOWN;
        c2Var.c(aVar);
        c2Var.f(aVar);
        c2Var.d(aVar);
        c2Var.g(aVar);
        c2Var.h(aVar);
        c2Var.b(aVar);
        c2Var.e(aVar);
        return c2Var;
    }

    @RecentlyNonNull
    public abstract l0.a b();

    @RecentlyNonNull
    public abstract l0.a c();

    @RecentlyNonNull
    public abstract l0.a d();

    @RecentlyNonNull
    public abstract l0.a e();

    @RecentlyNonNull
    public abstract l0.a f();

    @RecentlyNonNull
    public abstract l0.a g();

    @RecentlyNonNull
    public abstract l0.a h();
}

```

## ii/h3.java

```java
package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class h3 implements Parcelable.Creator {
    h3() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new i3((l0.a) parcel.readParcelable(a.class.getClassLoader()), (l0.a) parcel.readParcelable(a.class.getClassLoader()), (l0.a) parcel.readParcelable(a.class.getClassLoader()), (l0.a) parcel.readParcelable(a.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new i3[i15];
    }
}

```

## ii/h4.java

```java
package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class h4 extends v7 {
    public static final Parcelable.Creator<h4> CREATOR = new g4();

    h4(String str, String str2, String str3, Uri uri) {
        super(str, str2, str3, uri);
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
        if (d() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(d());
        }
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(b());
        }
        parcel.writeParcelable(c(), i15);
    }
}

```
