package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class he extends kg.a {
    public static final Parcelable.Creator<he> CREATOR = new ie();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f50644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f50645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f50646f;

    public he(int i15, int i16, int i17, int i18, boolean z15, float f15) {
        this.f50641a = i15;
        this.f50642b = i16;
        this.f50643c = i17;
        this.f50644d = i18;
        this.f50645e = z15;
        this.f50646f = f15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50641a);
        kg.c.m(parcel, 2, this.f50642b);
        kg.c.m(parcel, 3, this.f50643c);
        kg.c.m(parcel, 4, this.f50644d);
        kg.c.c(parcel, 5, this.f50645e);
        kg.c.i(parcel, 6, this.f50646f);
        kg.c.b(parcel, iA);
    }
}
