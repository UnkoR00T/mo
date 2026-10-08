package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class cl extends kg.a {
    public static final Parcelable.Creator<cl> CREATOR = new dl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f62986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f62987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f62988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f62989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f62990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f62991g;

    public cl(String str, String str2, String str3, boolean z15, int i15, String str4, boolean z16) {
        this.f62985a = str;
        this.f62986b = str2;
        this.f62987c = str3;
        this.f62990f = str4;
        this.f62989e = i15;
        this.f62988d = z15;
        this.f62991g = z16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f62985a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f62986b, false);
        kg.c.u(parcel, 3, this.f62987c, false);
        kg.c.c(parcel, 4, this.f62988d);
        kg.c.m(parcel, 5, this.f62989e);
        kg.c.u(parcel, 6, this.f62990f, false);
        kg.c.c(parcel, 7, this.f62991g);
        kg.c.b(parcel, iA);
    }
}
