package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends kg.a {
    public static final Parcelable.Creator<q> CREATOR = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f226894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f226895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f226896c;

    private q() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f226894a);
        kg.c.u(parcel, 2, this.f226895b, false);
        kg.c.u(parcel, 3, this.f226896c, false);
        kg.c.b(parcel, iA);
    }

    public q(int i15, String str, String str2) {
        this.f226894a = i15;
        this.f226895b = str;
        this.f226896c = str2;
    }
}
