package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aq extends kg.a {
    public static final Parcelable.Creator<aq> CREATOR = new bq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f30353b;

    public aq(String str, List list) {
        this.f30352a = str;
        this.f30353b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f30352a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.y(parcel, 2, this.f30353b, false);
        kg.c.b(parcel, iA);
    }
}
