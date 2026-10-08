package kh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class l extends kg.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f110948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f110949d;

    l(int i15, int i16, long j15, long j16) {
        this.f110946a = i15;
        this.f110947b = i16;
        this.f110948c = j15;
        this.f110949d = j16;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f110946a == lVar.f110946a && this.f110947b == lVar.f110947b && this.f110948c == lVar.f110948c && this.f110949d == lVar.f110949d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return jg.r.b(Integer.valueOf(this.f110947b), Integer.valueOf(this.f110946a), Long.valueOf(this.f110949d), Long.valueOf(this.f110948c));
    }

    public final String toString() {
        int i15 = this.f110946a;
        int length = String.valueOf(i15).length();
        int i16 = this.f110947b;
        int length2 = String.valueOf(i16).length();
        long j15 = this.f110949d;
        int length3 = String.valueOf(j15).length();
        long j16 = this.f110948c;
        StringBuilder sb5 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j16).length());
        sb5.append("NetworkLocationStatus: Wifi status: ");
        sb5.append(i15);
        sb5.append(" Cell status: ");
        sb5.append(i16);
        sb5.append(" elapsed time NS: ");
        sb5.append(j15);
        sb5.append(" system time ms: ");
        sb5.append(j16);
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f110946a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, this.f110947b);
        kg.c.r(parcel, 3, this.f110948c);
        kg.c.r(parcel, 4, this.f110949d);
        kg.c.b(parcel, iA);
    }
}
