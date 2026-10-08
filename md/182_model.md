# Paczka 182 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `pi/a.java`, `pi/b.java`, `pi/c.java`

## pi/a.java

```java
package pi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public enum a implements Parcelable {
    FULLSCREEN,
    OVERLAY;


    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator() { // from class: pi.e
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a.valueOf((String) p.q(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i15) {
            return new a[i15];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i15) {
        parcel.writeString(name());
    }
}

```

## pi/b.java

```java
package pi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p071kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pi.b[], still in use, count: 1, list:
  (r0v1 pi.b[]) from 0x001a: INVOKE (r0v1 pi.b[]) STATIC call: wq.b.a(java.lang.Enum[]):wq.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):wq.a<E extends java.lang.Enum<E>> (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lpi/b;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "b", "java.com.google.android.libraries.places.widget.model_autocomplete_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements Parcelable {
    TWO_LINE,
    MULTI_LINE;

    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator() { // from class: pi.f
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return b.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i15) {
            return new b[i15];
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ wq.a f157895d;

    static {
        f157895d = wq.b.a(new b[]{r0, r1});
    }

    private b() {
        super(str, i);
    }

    @RecentlyNonNull
    public static b valueOf(@RecentlyNonNull String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    @RecentlyNonNull
    public static b[] values() {
        return (b[]) f157894c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel dest, int flags) {
        dest.writeString(name());
    }
}

```

## pi/c.java

```java
package pi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001\u0014B;\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0013J\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010!J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010!R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%¨\u0006'"}, d2 = {"Lpi/c;", "Landroid/os/Parcelable;", "Lpi/b;", "listDensity", "", "noMatchingResultsMessage", "Lpi/d;", "listItemIcon", "searchBarHint", "", "theme", "<init>", "(Lpi/b;Ljava/lang/String;Lpi/d;Ljava/lang/String;Ljava/lang/Integer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "()Lpi/b;", "b", "()Lpi/d;", "c", "()Ljava/lang/Integer;", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "()Ljava/lang/String;", "Lpi/b;", "Ljava/lang/String;", "Lpi/d;", "Ljava/lang/Integer;", "f", "java.com.google.android.libraries.places.widget.model_autocomplete_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f157897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f157898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f157899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f157900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f157901e;
    public static final Parcelable.Creator<c> CREATOR = new g();

    public /* synthetic */ c(@RecentlyNonNull b bVar, @RecentlyNonNull String str, @RecentlyNonNull d dVar, @RecentlyNonNull String str2, @RecentlyNonNull Integer num, @RecentlyNonNull k kVar) {
        this.f157897a = bVar;
        this.f157898b = str;
        this.f157899c = dVar;
        this.f157900d = str2;
        this.f157901e = num;
    }

    @RecentlyNullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getF157897a() {
        return this.f157897a;
    }

    @RecentlyNullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getF157899c() {
        return this.f157899c;
    }

    @RecentlyNullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getF157901e() {
        return this.f157901e;
    }

    @RecentlyNullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF157898b() {
        return this.f157898b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @RecentlyNullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF157900d() {
        return this.f157900d;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        b f157897a = getF157897a();
        String strName = f157897a != null ? f157897a.name() : null;
        c cVar = (c) other;
        b f157897a2 = cVar.getF157897a();
        if (t.c(strName, f157897a2 != null ? f157897a2.name() : null) && t.c(this.f157898b, cVar.f157898b)) {
            d f157899c = getF157899c();
            Integer numValueOf = f157899c != null ? Integer.valueOf(f157899c.getF157904a()) : null;
            d f157899c2 = cVar.getF157899c();
            if (t.c(numValueOf, f157899c2 != null ? Integer.valueOf(f157899c2.getF157904a()) : null) && t.c(this.f157900d, cVar.f157900d) && t.c(getF157901e(), cVar.getF157901e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String strName;
        b f157897a = getF157897a();
        int iHashCode = (f157897a == null || (strName = f157897a.name()) == null) ? 0 : strName.hashCode();
        String str = this.f157898b;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i15 = iHashCode * 31;
        d f157899c = getF157899c();
        int iHashCode3 = (((i15 + iHashCode2) * 31) + (f157899c != null ? Integer.hashCode(f157899c.getF157904a()) : 0)) * 31;
        String str2 = this.f157900d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer f157901e = getF157901e();
        return iHashCode4 + (f157901e != null ? Integer.hashCode(f157901e.intValue()) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel dest, int flags) {
        b bVar = this.f157897a;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bVar.writeToParcel(dest, flags);
        }
        dest.writeString(this.f157898b);
        d dVar = this.f157899c;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dVar.writeToParcel(dest, flags);
        }
        dest.writeString(this.f157900d);
        Integer num = this.f157901e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }
}

```
