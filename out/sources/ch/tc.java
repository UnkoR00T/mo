package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class tc extends kg.a {
    public static final Parcelable.Creator<tc> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26369g;

    public tc() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f26363a, false);
        kg.c.u(parcel, 3, this.f26364b, false);
        kg.c.u(parcel, 4, this.f26365c, false);
        kg.c.u(parcel, 5, this.f26366d, false);
        kg.c.u(parcel, 6, this.f26367e, false);
        kg.c.u(parcel, 7, this.f26368f, false);
        kg.c.u(parcel, 8, this.f26369g, false);
        kg.c.b(parcel, iA);
    }

    public tc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f26363a = str;
        this.f26364b = str2;
        this.f26365c = str3;
        this.f26366d = str4;
        this.f26367e = str5;
        this.f26368f = str6;
        this.f26369g = str7;
    }
}
