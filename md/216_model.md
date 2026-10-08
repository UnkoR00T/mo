# Paczka 216 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `vh2/a.java`, `vh2/c.java`, `vj/b.java`, `vj/f.java`, `wd/j.java`

## vh2/a.java

```java
package vh2;

import android.os.Parcel;
import android.os.Parcelable;
import fr.k;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0017\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lvh2/a;", "Landroid/os/Parcelable;", "", "cardRelation", "holderType", "batch", "number", "firstName", "secondName", "lastName", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getCardRelation", "()Ljava/lang/String;", "b", "getHolderType", "c", "getBatch", "d", "getNumber", "e", "getFirstName", "f", "getSecondName", "g", "getLastName", "h", "I", "getId", "setId", "(I)V", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C5413a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final transient String cardRelation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final transient String holderType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final transient String batch;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final transient String number;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final transient String firstName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final transient String secondName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final transient String lastName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private transient int id;

    /* JADX INFO: renamed from: vh2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C5413a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i15) {
            return new a[i15];
        }
    }

    public a() {
        this(null, null, null, null, null, null, null, 0, GF2Field.MASK, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cardRelation);
        dest.writeString(this.holderType);
        dest.writeString(this.batch);
        dest.writeString(this.number);
        dest.writeString(this.firstName);
        dest.writeString(this.secondName);
        dest.writeString(this.lastName);
        dest.writeInt(this.id);
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i15) {
        this.cardRelation = str;
        this.holderType = str2;
        this.batch = str3;
        this.number = str4;
        this.firstName = str5;
        this.secondName = str6;
        this.lastName = str7;
        this.id = i15;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i15, int i16, k kVar) {
        this((i16 & 1) != 0 ? new String() : str, (i16 & 2) != 0 ? new String() : str2, (i16 & 4) != 0 ? new String() : str3, (i16 & 8) != 0 ? new String() : str4, (i16 & 16) != 0 ? new String() : str5, (i16 & 32) != 0 ? new String() : str6, (i16 & 64) != 0 ? new String() : str7, (i16 & 128) != 0 ? 0 : i15);
    }
}

```

## vh2/c.java

```java
package vh2;

import android.os.Parcel;
import android.os.Parcelable;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0005¨\u0006\u0014"}, d2 = {"Lvh2/c;", "Landroid/os/Parcelable;", "", "timestamp", "<init>", "(J)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "J", "getTimestamp", "()J", "setTimestamp", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private transient long timestamp;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i15) {
            return new c[i15];
        }
    }

    public c(long j15) {
        this.timestamp = j15;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.timestamp);
    }
}

```

## vj/b.java

```java
package vj;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"RestrictedApi"})
public abstract class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new f();

    abstract PendingIntent a();

    abstract boolean b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(a(), 0);
        parcel.writeInt(b() ? 1 : 0);
    }
}

```

## vj/f.java

```java
package vj;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class f implements Parcelable.Creator {
    f() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new e((PendingIntent) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new b[i15];
    }
}

```

## wd/j.java

```java
package wd;

import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
import vd.p;

/* JADX INFO: loaded from: classes3.dex */
public class j extends k<JSONObject> {
    public j(int i15, String str, JSONObject jSONObject, p.b<JSONObject> bVar, p.a aVar) {
        super(i15, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    @Override // vd.n
    protected p<JSONObject> R(vd.k kVar) {
        try {
            return p.c(new JSONObject(new String(kVar.f206177b, e.f(kVar.f206178c, "utf-8"))), e.e(kVar));
        } catch (UnsupportedEncodingException e15) {
            return p.a(new vd.m(e15));
        } catch (JSONException e16) {
            return p.a(new vd.m(e16));
        }
    }
}

```
