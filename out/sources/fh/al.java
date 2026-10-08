package fh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class al extends kg.a {
    public static final Parcelable.Creator<al> CREATOR = new bl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f62939b;

    public al(String str, List list) {
        this.f62938a = str;
        this.f62939b = list;
    }

    public final String h() {
        return this.f62938a;
    }

    public final List m() {
        return this.f62939b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f62938a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.y(parcel, 2, this.f62939b, false);
        kg.c.b(parcel, iA);
    }
}
