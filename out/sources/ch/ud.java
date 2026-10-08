package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ud extends kg.a {
    public static final Parcelable.Creator<ud> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26405b;

    public ud() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f26404a);
        kg.c.u(parcel, 3, this.f26405b, false);
        kg.c.b(parcel, iA);
    }

    public ud(int i15, String str) {
        this.f26404a = i15;
        this.f26405b = str;
    }
}
