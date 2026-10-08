package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ra extends kg.a {
    public static final Parcelable.Creator<ra> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26316d;

    public ra() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f26313a);
        kg.c.u(parcel, 3, this.f26314b, false);
        kg.c.u(parcel, 4, this.f26315c, false);
        kg.c.u(parcel, 5, this.f26316d, false);
        kg.c.b(parcel, iA);
    }

    public ra(int i15, String str, String str2, String str3) {
        this.f26313a = i15;
        this.f26314b = str;
        this.f26315c = str2;
        this.f26316d = str3;
    }
}
