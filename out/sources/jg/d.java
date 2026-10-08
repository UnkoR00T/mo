package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class d extends kg.a {
    public static final Parcelable.Creator<d> CREATOR = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102438b;

    public d(int i15, String str) {
        this.f102437a = i15;
        this.f102438b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f102437a == this.f102437a && r.a(dVar.f102438b, this.f102438b);
    }

    public final int hashCode() {
        return this.f102437a;
    }

    public final String toString() {
        int i15 = this.f102437a;
        int length = String.valueOf(i15).length();
        String str = this.f102438b;
        StringBuilder sb5 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb5.append(i15);
        sb5.append(":");
        sb5.append(str);
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f102437a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.u(parcel, 2, this.f102438b, false);
        kg.c.b(parcel, iA);
    }
}
