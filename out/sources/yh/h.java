package yh;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class h extends kg.a {
    public static final Parcelable.Creator<h> CREATOR = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    PendingIntent f226853a;

    h() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f226853a, i15, false);
        kg.c.b(parcel, iA);
    }

    h(PendingIntent pendingIntent) {
        this.f226853a = pendingIntent;
    }
}
