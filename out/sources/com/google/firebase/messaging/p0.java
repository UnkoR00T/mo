package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends kg.a {
    public static final Parcelable.Creator<p0> CREATOR = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bundle f36580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f36581b;

    public p0(Bundle bundle) {
        this.f36580a = bundle;
    }

    public Map<String, String> h() {
        if (this.f36581b == null) {
            this.f36581b = d.a.a(this.f36580a);
        }
        return this.f36581b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        q0.c(this, parcel, i15);
    }
}
