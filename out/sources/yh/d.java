package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends kg.a {
    public static final Parcelable.Creator<d> CREATOR = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f226817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f226818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f226819c;

    private d() {
    }

    public int h() {
        int i15 = this.f226819c;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            return i15;
        }
        return 0;
    }

    public String m() {
        return this.f226818b;
    }

    public String p() {
        return this.f226817a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, p(), false);
        kg.c.u(parcel, 3, m(), false);
        kg.c.m(parcel, 4, h());
        kg.c.b(parcel, iA);
    }

    public d(String str, String str2, int i15) {
        this.f226817a = str;
        this.f226818b = str2;
        this.f226819c = i15;
    }
}
