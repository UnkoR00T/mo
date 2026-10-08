package bi;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends kg.a {
    public static final Parcelable.Creator<d> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final PendingIntent f19767a;

    public d(PendingIntent pendingIntent) {
        this.f19767a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f19767a, i15, false);
        kg.c.b(parcel, iA);
    }
}
