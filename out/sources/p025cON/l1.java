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
