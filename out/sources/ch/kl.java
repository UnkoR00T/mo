package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class kl extends kg.a {
    public static final Parcelable.Creator<kl> CREATOR = new am();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26106d;

    public kl(int i15, String str, String str2, String str3) {
        this.f26103a = i15;
        this.f26104b = str;
        this.f26105c = str2;
        this.f26106d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f26103a);
        kg.c.u(parcel, 2, this.f26104b, false);
        kg.c.u(parcel, 3, this.f26105c, false);
        kg.c.u(parcel, 4, this.f26106d, false);
        kg.c.b(parcel, iA);
    }
}
