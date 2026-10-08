package mg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class b extends kg.a {
    public static final Parcelable.Creator<b> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f126322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f126323b;

    public b(boolean z15, int i15) {
        this.f126322a = z15;
        this.f126323b = i15;
    }

    public boolean h() {
        return this.f126322a;
    }

    public int m() {
        return this.f126323b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.c(parcel, 1, h());
        kg.c.m(parcel, 2, m());
        kg.c.b(parcel, iA);
    }
}
