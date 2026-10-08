package zg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends kg.a implements hg.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f235078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f235077b = new g1(Status.f29007f);
    public static final Parcelable.Creator<g1> CREATOR = new h1();

    public g1(Status status) {
        this.f235078a = status;
    }

    @Override // hg.l
    public final Status b() {
        return this.f235078a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f235078a, i15, false);
        kg.c.b(parcel, iA);
    }
}
