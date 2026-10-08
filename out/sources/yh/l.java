package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends kg.a {
    public static final Parcelable.Creator<l> CREATOR = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f226885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f226886b;

    private l() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f226885a);
        kg.c.u(parcel, 3, this.f226886b, false);
        kg.c.b(parcel, iA);
    }

    l(int i15, String str) {
        this.f226885a = i15;
        this.f226886b = str;
    }
}
