package th;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends kg.a implements hg.l {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f190193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f190194b;

    public h(List list, String str) {
        this.f190193a = list;
        this.f190194b = str;
    }

    @Override // hg.l
    public final Status b() {
        return this.f190194b != null ? Status.f29007f : Status.f29011k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        List list = this.f190193a;
        int iA = kg.c.a(parcel);
        kg.c.w(parcel, 1, list, false);
        kg.c.u(parcel, 2, this.f190194b, false);
        kg.c.b(parcel, iA);
    }
}
