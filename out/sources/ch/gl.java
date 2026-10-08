package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class gl extends kg.a {
    public static final Parcelable.Creator<gl> CREATOR = new wl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f25916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f25917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25918h;

    public gl(int i15, int i16, int i17, int i18, int i19, int i25, boolean z15, String str) {
        this.f25911a = i15;
        this.f25912b = i16;
        this.f25913c = i17;
        this.f25914d = i18;
        this.f25915e = i19;
        this.f25916f = i25;
        this.f25917g = z15;
        this.f25918h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f25911a);
        kg.c.m(parcel, 2, this.f25912b);
        kg.c.m(parcel, 3, this.f25913c);
        kg.c.m(parcel, 4, this.f25914d);
        kg.c.m(parcel, 5, this.f25915e);
        kg.c.m(parcel, 6, this.f25916f);
        kg.c.c(parcel, 7, this.f25917g);
        kg.c.u(parcel, 8, this.f25918h, false);
        kg.c.b(parcel, iA);
    }
}
