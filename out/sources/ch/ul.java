package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ul extends kg.a {
    public static final Parcelable.Creator<ul> CREATOR = new vl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26408b;

    public ul(int i15, boolean z15) {
        this.f26407a = i15;
        this.f26408b = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f26407a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.c(parcel, 2, this.f26408b);
        kg.c.b(parcel, iA);
    }
}
