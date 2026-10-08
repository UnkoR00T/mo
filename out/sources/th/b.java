package th;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kg.a implements hg.l {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f190190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f190191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f190192c;

    public b() {
        this(2, 0, null);
    }

    @Override // hg.l
    public final Status b() {
        return this.f190191b == 0 ? Status.f29007f : Status.f29011k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f190190a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, this.f190191b);
        kg.c.t(parcel, 3, this.f190192c, i15, false);
        kg.c.b(parcel, iA);
    }

    b(int i15, int i16, Intent intent) {
        this.f190190a = i15;
        this.f190191b = i16;
        this.f190192c = intent;
    }
}
