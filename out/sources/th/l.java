package th;

import android.os.Parcel;
import android.os.Parcelable;
import jg.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends kg.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f190197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gg.a f190198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f190199c;

    l(int i15, gg.a aVar, n0 n0Var) {
        this.f190197a = i15;
        this.f190198b = aVar;
        this.f190199c = n0Var;
    }

    public final gg.a h() {
        return this.f190198b;
    }

    public final n0 m() {
        return this.f190199c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f190197a);
        kg.c.t(parcel, 2, this.f190198b, i15, false);
        kg.c.t(parcel, 3, this.f190199c, i15, false);
        kg.c.b(parcel, iA);
    }
}
