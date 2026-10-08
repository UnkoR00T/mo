package fg;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Intent f62256a;

    public a(Intent intent) {
        this.f62256a = intent;
    }

    public Intent h() {
        return this.f62256a;
    }

    public String m() {
        String stringExtra = this.f62256a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f62256a.getStringExtra("message_id") : stringExtra;
    }

    final Integer p() {
        if (this.f62256a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f62256a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f62256a, i15, false);
        kg.c.b(parcel, iA);
    }
}
