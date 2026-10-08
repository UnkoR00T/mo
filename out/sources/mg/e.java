package mg;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class e extends kg.a {
    public static final Parcelable.Creator<e> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f126324a;

    public e(PendingIntent pendingIntent) {
        this.f126324a = pendingIntent;
    }

    public PendingIntent h() {
        return this.f126324a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, h(), i15, false);
        kg.c.b(parcel, iA);
    }
}
