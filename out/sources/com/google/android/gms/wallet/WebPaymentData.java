package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class WebPaymentData extends kg.a implements ReflectedParcelable {
    public static final Parcelable.Creator<WebPaymentData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f31502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Bundle f31503b;

    private WebPaymentData() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f31502a, false);
        kg.c.d(parcel, 3, this.f31503b, false);
        kg.c.b(parcel, iA);
    }

    WebPaymentData(String str, Bundle bundle) {
        this.f31502a = str;
        this.f31503b = bundle;
    }
}
