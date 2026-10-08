package com.google.android.gms.internal.oss_licenses;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class j4 implements Comparable<j4>, Parcelable {
    public static final Parcelable.Creator<j4> CREATOR = new i4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30808c;

    private j4(String str, long j15, int i15) {
        this.f30806a = str;
        this.f30807b = j15;
        this.f30808c = i15;
    }

    public static j4 b(String str, long j15, int i15) {
        return new j4(str, j15, i15);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(j4 j4Var) {
        return this.f30806a.compareTo(j4Var.f30806a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f30806a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j4) {
            return this.f30806a.equals(((j4) obj).f30806a);
        }
        return false;
    }

    public final long g() {
        return this.f30807b;
    }

    public final int hashCode() {
        return this.f30806a.hashCode();
    }

    public final int j() {
        return this.f30808c;
    }

    public final String toString() {
        return this.f30806a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(this.f30806a);
        parcel.writeLong(this.f30807b);
        parcel.writeInt(this.f30808c);
    }

    /* synthetic */ j4(Parcel parcel, byte[] bArr) {
        this.f30806a = parcel.readString();
        this.f30807b = parcel.readLong();
        this.f30808c = parcel.readInt();
    }
}
