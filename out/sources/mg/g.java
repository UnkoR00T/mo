package mg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class g extends kg.a {
    public static final Parcelable.Creator<g> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f126331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f126332b;

    public g(int i15) {
        this(i15, false);
    }

    public boolean h() {
        return this.f126331a == 0;
    }

    public int m() {
        return this.f126331a;
    }

    public final boolean p() {
        return this.f126332b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, m());
        kg.c.c(parcel, 2, this.f126332b);
        kg.c.b(parcel, iA);
    }

    public g(int i15, boolean z15) {
        this.f126331a = i15;
        this.f126332b = z15;
    }
}
