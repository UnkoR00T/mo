package eh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fe extends kg.a {
    public static final Parcelable.Creator<fe> CREATOR = new ge();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f50563b;

    public fe(int i15, List list) {
        this.f50562a = i15;
        this.f50563b = list;
    }

    public final int h() {
        return this.f50562a;
    }

    public final List m() {
        return this.f50563b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f50562a);
        kg.c.y(parcel, 2, this.f50563b, false);
        kg.c.b(parcel, iA);
    }
}
