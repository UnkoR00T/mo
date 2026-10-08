package yh;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends kg.a {
    public static final Parcelable.Creator<i> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f226863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b f226864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    UserAddress f226865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    l f226866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f226867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Bundle f226868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f226869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Bundle f226870h;

    private i() {
    }

    public static i h(Intent intent) {
        return (i) kg.e.b(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    public String m() {
        return this.f226869g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, this.f226863a, false);
        kg.c.t(parcel, 2, this.f226864b, i15, false);
        kg.c.t(parcel, 3, this.f226865c, i15, false);
        kg.c.t(parcel, 4, this.f226866d, i15, false);
        kg.c.u(parcel, 5, this.f226867e, false);
        kg.c.d(parcel, 6, this.f226868f, false);
        kg.c.u(parcel, 7, this.f226869g, false);
        kg.c.d(parcel, 8, this.f226870h, false);
        kg.c.b(parcel, iA);
    }

    i(String str, b bVar, UserAddress userAddress, l lVar, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f226863a = str;
        this.f226864b = bVar;
        this.f226865c = userAddress;
        this.f226866d = lVar;
        this.f226867e = str2;
        this.f226868f = bundle;
        this.f226869g = str3;
        this.f226870h = bundle2;
    }
}
