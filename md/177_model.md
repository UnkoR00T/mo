# Paczka 177 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `p025cON/k1.java`, `p025cON/l1.java`, `p056h1/DefaultLazyKey.java`

## p025cON/k1.java

```java
package p025cON;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface k1 extends IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f24716c = "android$support$v4$os$IResultReceiver".replace('$', '.');

    public static abstract class a extends Binder implements k1 {

        /* JADX INFO: renamed from: cON.k1$a$a, reason: collision with other inner class name */
        private static class C0660a implements k1 {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private IBinder f24717d;

            C0660a(IBinder iBinder) {
                this.f24717d = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24717d;
            }
        }

        public a() {
            attachInterface(this, k1.f24716c);
        }

        public static k1 l3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(k1.f24716c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof k1)) ? new C0660a(iBinder) : (k1) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i15, Parcel parcel, Parcel parcel2, int i16) {
            String str = k1.f24716c;
            if (i15 >= 1 && i15 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i15 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i15 != 1) {
                return super.onTransact(i15, parcel, parcel2, i16);
            }
            D1(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void D1(int i15, Bundle bundle);
}

```

## p025cON/l1.java

```java
package p025cON;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class l1 implements Parcelable {
    public static final Parcelable.Creator<l1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f24718a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f24719b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    k1 f24720c;

    class a implements Parcelable.Creator<l1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l1 createFromParcel(Parcel parcel) {
            return new l1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l1[] newArray(int i15) {
            return new l1[i15];
        }
    }

    class b extends k1.a {
        b() {
        }

        @Override // p025cON.k1
        public void D1(int i15, Bundle bundle) {
            l1 l1Var = l1.this;
            Handler handler = l1Var.f24719b;
            if (handler != null) {
                handler.post(l1Var.new c(i15, bundle));
            } else {
                l1Var.a(i15, bundle);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f24722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Bundle f24723b;

        c(int i15, Bundle bundle) {
            this.f24722a = i15;
            this.f24723b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            l1.this.a(this.f24722a, this.f24723b);
        }
    }

    l1(Parcel parcel) {
        this.f24720c = k1.a.l3(parcel.readStrongBinder());
    }

    protected void a(int i15, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        synchronized (this) {
            try {
                if (this.f24720c == null) {
                    this.f24720c = new b();
                }
                parcel.writeStrongBinder(this.f24720c.asBinder());
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}

```

## p056h1/DefaultLazyKey.java

```java
package p056h1;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: h1.l, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lh1/l;", "Landroid/os/Parcelable;", "", "index", "<init>", "(I)V", "Landroid/os/Parcel;", "parcel", "flags", "Loq/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
final /* data */ class DefaultLazyKey implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new a();

    /* JADX INFO: renamed from: h1.l$a */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"h1/l$a", "Landroid/os/Parcelable$Creator;", "Lh1/l;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lh1/l;", "", "size", "", "b", "(I)[Lh1/l;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DefaultLazyKey> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DefaultLazyKey createFromParcel(Parcel parcel) {
            return new DefaultLazyKey(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DefaultLazyKey[] newArray(int size) {
            return new DefaultLazyKey[size];
        }
    }

    public DefaultLazyKey(int i15) {
        this.index = i15;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DefaultLazyKey) && this.index == ((DefaultLazyKey) other).index;
    }

    public int hashCode() {
        return Integer.hashCode(this.index);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.index + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(this.index);
    }
}

```
