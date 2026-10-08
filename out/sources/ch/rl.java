package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class rl extends kg.a {
    public static final Parcelable.Creator<rl> CREATOR = new km();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26321c;

    public rl(String str, String str2, int i15) {
        this.f26319a = str;
        this.f26320b = str2;
        this.f26321c = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f26319a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f26320b, false);
        kg.c.m(parcel, 3, this.f26321c);
        kg.c.b(parcel, iA);
    }
}
