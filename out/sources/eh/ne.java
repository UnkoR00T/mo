package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ne extends kg.a {
    public static final Parcelable.Creator<ne> CREATOR = new se();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f50864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50865e;

    public ne(int i15, int i16, int i17, long j15, int i18) {
        this.f50861a = i15;
        this.f50862b = i16;
        this.f50863c = i17;
        this.f50864d = j15;
        this.f50865e = i18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f50861a);
        kg.c.m(parcel, 3, this.f50862b);
        kg.c.m(parcel, 4, this.f50863c);
        kg.c.r(parcel, 5, this.f50864d);
        kg.c.m(parcel, 6, this.f50865e);
        kg.c.b(parcel, iA);
    }
}
