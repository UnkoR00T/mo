package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class fl extends kg.a {
    public static final Parcelable.Creator<fl> CREATOR = new el();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f25882b;

    public fl(int i15, String[] strArr) {
        this.f25881a = i15;
        this.f25882b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f25881a);
        kg.c.v(parcel, 2, this.f25882b, false);
        kg.c.b(parcel, iA);
    }
}
