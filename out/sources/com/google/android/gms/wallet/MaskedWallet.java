package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import yh.d;
import yh.f;
import yh.g;
import yh.s;

/* JADX INFO: loaded from: classes3.dex */
public final class MaskedWallet extends kg.a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f31491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f31492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f31493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f31494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    s f31495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    s f31496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    f[] f31497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    g[] f31498h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    UserAddress f31499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    UserAddress f31500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    d[] f31501l;

    private MaskedWallet() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f31491a, false);
        kg.c.u(parcel, 3, this.f31492b, false);
        kg.c.v(parcel, 4, this.f31493c, false);
        kg.c.u(parcel, 5, this.f31494d, false);
        kg.c.t(parcel, 6, this.f31495e, i15, false);
        kg.c.t(parcel, 7, this.f31496f, i15, false);
        kg.c.x(parcel, 8, this.f31497g, i15, false);
        kg.c.x(parcel, 9, this.f31498h, i15, false);
        kg.c.t(parcel, 10, this.f31499j, i15, false);
        kg.c.t(parcel, 11, this.f31500k, i15, false);
        kg.c.x(parcel, 12, this.f31501l, i15, false);
        kg.c.b(parcel, iA);
    }

    MaskedWallet(String str, String str2, String[] strArr, String str3, s sVar, s sVar2, f[] fVarArr, g[] gVarArr, UserAddress userAddress, UserAddress userAddress2, d[] dVarArr) {
        this.f31491a = str;
        this.f31492b = str2;
        this.f31493c = strArr;
        this.f31494d = str3;
        this.f31495e = sVar;
        this.f31496f = sVar2;
        this.f31497g = fVarArr;
        this.f31498h = gVarArr;
        this.f31499j = userAddress;
        this.f31500k = userAddress2;
        this.f31501l = dVarArr;
    }
}
