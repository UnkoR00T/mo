package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import yh.d;
import yh.l;
import yh.o;
import yh.s;

/* JADX INFO: loaded from: classes3.dex */
public final class FullWallet extends kg.a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f31480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f31481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    o f31482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f31483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    s f31484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    s f31485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String[] f31486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    UserAddress f31487h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    UserAddress f31488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    d[] f31489k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    l f31490l;

    private FullWallet() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f31480a, false);
        kg.c.u(parcel, 3, this.f31481b, false);
        kg.c.t(parcel, 4, this.f31482c, i15, false);
        kg.c.u(parcel, 5, this.f31483d, false);
        kg.c.t(parcel, 6, this.f31484e, i15, false);
        kg.c.t(parcel, 7, this.f31485f, i15, false);
        kg.c.v(parcel, 8, this.f31486g, false);
        kg.c.t(parcel, 9, this.f31487h, i15, false);
        kg.c.t(parcel, 10, this.f31488j, i15, false);
        kg.c.x(parcel, 11, this.f31489k, i15, false);
        kg.c.t(parcel, 12, this.f31490l, i15, false);
        kg.c.b(parcel, iA);
    }

    FullWallet(String str, String str2, o oVar, String str3, s sVar, s sVar2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, d[] dVarArr, l lVar) {
        this.f31480a = str;
        this.f31481b = str2;
        this.f31482c = oVar;
        this.f31483d = str3;
        this.f31484e = sVar;
        this.f31485f = sVar2;
        this.f31486g = strArr;
        this.f31487h = userAddress;
        this.f31488j = userAddress2;
        this.f31489k = dVarArr;
        this.f31490l = lVar;
    }
}
