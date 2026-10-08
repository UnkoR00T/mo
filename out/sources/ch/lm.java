package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class lm extends kg.a {
    public static final Parcelable.Creator<lm> CREATOR = new mm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f26149e;

    public lm(int i15, int i16, int i17, int i18, long j15) {
        this.f26145a = i15;
        this.f26146b = i16;
        this.f26147c = i17;
        this.f26148d = i18;
        this.f26149e = j15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f26145a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, this.f26146b);
        kg.c.m(parcel, 3, this.f26147c);
        kg.c.m(parcel, 4, this.f26148d);
        kg.c.r(parcel, 5, this.f26149e);
        kg.c.b(parcel, iA);
    }
}
