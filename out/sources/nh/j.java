package nh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class j extends kg.a {
    public static final Parcelable.Creator<j> CREATOR = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f136293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f136294b;

    public j(int i15, Float f15) {
        boolean z15 = true;
        if (i15 != 1 && (f15 == null || f15.floatValue() < 0.0f)) {
            z15 = false;
        }
        jg.s.b(z15, "Invalid PatternItem: type=" + i15 + " length=" + f15);
        this.f136293a = i15;
        this.f136294b = f15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f136293a == jVar.f136293a && jg.r.a(this.f136294b, jVar.f136294b);
    }

    public int hashCode() {
        return jg.r.b(Integer.valueOf(this.f136293a), this.f136294b);
    }

    public String toString() {
        return "[PatternItem: type=" + this.f136293a + " length=" + this.f136294b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f136293a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, i16);
        kg.c.k(parcel, 3, this.f136294b, false);
        kg.c.b(parcel, iA);
    }
}
