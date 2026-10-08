# Paczka 108 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `di/c.java`, `e6/b.java`, `e6/c.java`, `eg/d.java`

## di/c.java

Powiązane klasy (możesz dosłać): `yh/i.java`, `yh/j.java`

```java
package di;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.c2;
import vh.m;
import yh.h0;
import yh.i;
import yh.j;

/* JADX INFO: loaded from: classes3.dex */
public class c extends jg.h<a> {
    private final Context L;
    private final int M;
    private final String N;
    private final int O;
    private final boolean P;
    private final String Q;

    public c(Context context, Looper looper, jg.e eVar, hg.f.a aVar, hg.f.b bVar, int i15, int i16, boolean z15, String str) {
        super(context, looper, 4, eVar, aVar, bVar);
        this.L = context;
        this.M = i15;
        Account accountA = eVar.a();
        this.N = accountA != null ? accountA.name : null;
        this.O = i16;
        this.P = z15;
        this.Q = str;
    }

    public static Bundle j0(int i15, String str, String str2, int i16, boolean z15, String str3) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i15);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z15);
        bundle.putString("androidPackageName", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str2, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i16);
        bundle.putString("com.google.android.gms.wallet.EXTRA_WALLET_CLIENT_ID", str3);
        return bundle;
    }

    private final Bundle n0() {
        return j0(this.M, this.L.getPackageName(), this.N, this.O, this.P, this.Q);
    }

    @Override // jg.c
    protected String B() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // jg.c
    protected String C() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // jg.c
    public boolean L() {
        return true;
    }

    @Override // jg.c
    public boolean P() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jg.c
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public a p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new d(iBinder);
    }

    @Override // jg.c, hg.a.f
    public int l() {
        return 12600000;
    }

    public void l0(yh.e eVar, m<Boolean> mVar) {
        g gVar = new g(mVar);
        try {
            ((a) A()).X2(eVar, n0(), gVar);
        } catch (RemoteException e15) {
            c2.f("WalletClientImpl", "RemoteException during isReadyToPay", e15);
            gVar.u0(Status.f29009h, false, Bundle.EMPTY);
        }
    }

    public void m0(j jVar, m<i> mVar) {
        Bundle bundleN0 = n0();
        bundleN0.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        h hVar = new h(mVar);
        try {
            ((a) A()).Y0(jVar, bundleN0, hVar);
        } catch (RemoteException e15) {
            c2.f("WalletClientImpl", "RemoteException getting payment data", e15);
            hVar.s2(Status.f29009h, null, Bundle.EMPTY);
        }
    }

    @Override // jg.c
    public gg.c[] s() {
        return h0.f226862i;
    }
}

```

## e6/b.java

```java
package e6;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    static class a {
        static <T> T a(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        static <T> ArrayList<T> b(Bundle bundle, String str, Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }
    }

    public static <T> T a(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(bundle, str, cls);
        }
        T t15 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t15)) {
            return t15;
        }
        return null;
    }

    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> ArrayList<T> b(Bundle bundle, String str, Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? a.b(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }
}

```

## e6/c.java

```java
package e6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import oq.r;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Loq/r;", "", "", "pairs", "Landroid/os/Bundle;", "a", "([Loq/r;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final Bundle a(r<String, ? extends Object>... rVarArr) {
        Bundle bundle = new Bundle(rVarArr.length);
        for (r<String, ? extends Object> rVar : rVarArr) {
            String strA = rVar.a();
            Object objB = rVar.b();
            if (objB == null) {
                bundle.putString(strA, null);
            } else if (objB instanceof Boolean) {
                bundle.putBoolean(strA, ((Boolean) objB).booleanValue());
            } else if (objB instanceof Byte) {
                bundle.putByte(strA, ((Number) objB).byteValue());
            } else if (objB instanceof Character) {
                bundle.putChar(strA, ((Character) objB).charValue());
            } else if (objB instanceof Double) {
                bundle.putDouble(strA, ((Number) objB).doubleValue());
            } else if (objB instanceof Float) {
                bundle.putFloat(strA, ((Number) objB).floatValue());
            } else if (objB instanceof Integer) {
                bundle.putInt(strA, ((Number) objB).intValue());
            } else if (objB instanceof Long) {
                bundle.putLong(strA, ((Number) objB).longValue());
            } else if (objB instanceof Short) {
                bundle.putShort(strA, ((Number) objB).shortValue());
            } else if (objB instanceof Bundle) {
                bundle.putBundle(strA, (Bundle) objB);
            } else if (objB instanceof CharSequence) {
                bundle.putCharSequence(strA, (CharSequence) objB);
            } else if (objB instanceof Parcelable) {
                bundle.putParcelable(strA, (Parcelable) objB);
            } else if (objB instanceof boolean[]) {
                bundle.putBooleanArray(strA, (boolean[]) objB);
            } else if (objB instanceof byte[]) {
                bundle.putByteArray(strA, (byte[]) objB);
            } else if (objB instanceof char[]) {
                bundle.putCharArray(strA, (char[]) objB);
            } else if (objB instanceof double[]) {
                bundle.putDoubleArray(strA, (double[]) objB);
            } else if (objB instanceof float[]) {
                bundle.putFloatArray(strA, (float[]) objB);
            } else if (objB instanceof int[]) {
                bundle.putIntArray(strA, (int[]) objB);
            } else if (objB instanceof long[]) {
                bundle.putLongArray(strA, (long[]) objB);
            } else if (objB instanceof short[]) {
                bundle.putShortArray(strA, (short[]) objB);
            } else if (objB instanceof Object[]) {
                Class<?> componentType = objB.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(strA, (Parcelable[]) objB);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(strA, (String[]) objB);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(strA, (CharSequence[]) objB);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + strA + '\"');
                    }
                    bundle.putSerializable(strA, (Serializable) objB);
                }
            } else if (objB instanceof Serializable) {
                bundle.putSerializable(strA, (Serializable) objB);
            } else if (objB instanceof IBinder) {
                bundle.putBinder(strA, (IBinder) objB);
            } else if (objB instanceof Size) {
                a.a(bundle, strA, (Size) objB);
            } else {
                if (!(objB instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objB.getClass().getCanonicalName() + " for key \"" + strA + '\"');
                }
                a.b(bundle, strA, (SizeF) objB);
            }
        }
        return bundle;
    }
}

```

## eg/d.java

```java
package eg;

import android.os.Parcel;
import android.os.Parcelable;
import jg.r;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends kg.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f49950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f49951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f49952c;

    public d(boolean z15, long j15, long j16) {
        this.f49950a = z15;
        this.f49951b = j15;
        this.f49952c = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f49950a == dVar.f49950a && this.f49951b == dVar.f49951b && this.f49952c == dVar.f49952c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return r.b(Boolean.valueOf(this.f49950a), Long.valueOf(this.f49951b), Long.valueOf(this.f49952c));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f49950a + ",collectForDebugStartTimeMillis: " + this.f49951b + ",collectForDebugExpiryTimeMillis: " + this.f49952c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.c(parcel, 1, this.f49950a);
        kg.c.r(parcel, 2, this.f49952c);
        kg.c.r(parcel, 3, this.f49951b);
        kg.c.b(parcel, iA);
    }
}

```
