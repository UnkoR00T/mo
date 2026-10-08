package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o7 extends kg.a {
    public static final Parcelable.Creator<o7> CREATOR = new yk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n6 f26218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n6 f26219g;

    public o7() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f26213a, false);
        kg.c.u(parcel, 3, this.f26214b, false);
        kg.c.u(parcel, 4, this.f26215c, false);
        kg.c.u(parcel, 5, this.f26216d, false);
        kg.c.u(parcel, 6, this.f26217e, false);
        kg.c.t(parcel, 7, this.f26218f, i15, false);
        kg.c.t(parcel, 8, this.f26219g, i15, false);
        kg.c.b(parcel, iA);
    }

    public o7(String str, String str2, String str3, String str4, String str5, n6 n6Var, n6 n6Var2) {
        this.f26213a = str;
        this.f26214b = str2;
        this.f26215c = str3;
        this.f26216d = str4;
        this.f26217e = str5;
        this.f26218f = n6Var;
        this.f26219g = n6Var2;
    }
}
