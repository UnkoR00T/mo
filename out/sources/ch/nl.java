package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class nl extends kg.a {
    public static final Parcelable.Creator<nl> CREATOR = new hm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26200b;

    public nl(int i15, String str) {
        this.f26199a = i15;
        this.f26200b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f26199a);
        kg.c.u(parcel, 2, this.f26200b, false);
        kg.c.b(parcel, iA);
    }
}
