package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ol extends kg.a {
    public static final Parcelable.Creator<ol> CREATOR = new im();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26238b;

    public ol(String str, String str2) {
        this.f26237a = str;
        this.f26238b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f26237a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f26238b, false);
        kg.c.b(parcel, iA);
    }
}
