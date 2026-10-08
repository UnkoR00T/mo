package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class de extends kg.a {
    public static final Parcelable.Creator<de> CREATOR = new ee();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f50475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f50476e;

    public de(int i15, int i16, int i17, int i18, long j15) {
        this.f50472a = i15;
        this.f50473b = i16;
        this.f50474c = i17;
        this.f50475d = i18;
        this.f50476e = j15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50472a);
        kg.c.m(parcel, 2, this.f50473b);
        kg.c.m(parcel, 3, this.f50474c);
        kg.c.m(parcel, 4, this.f50475d);
        kg.c.r(parcel, 5, this.f50476e);
        kg.c.b(parcel, iA);
    }
}
