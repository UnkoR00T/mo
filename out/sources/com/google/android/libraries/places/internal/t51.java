package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class t51 implements Parcelable {
    public static final Parcelable.Creator<t51> CREATOR = new s51();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f33755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f33756e;

    public t51(boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.f33752a = z15;
        this.f33753b = z16;
        this.f33754c = z17;
        this.f33755d = z18;
        this.f33756e = z19;
    }

    public final boolean a() {
        return this.f33752a;
    }

    public final boolean b() {
        return this.f33753b;
    }

    public final boolean c() {
        return this.f33754c;
    }

    public final boolean d() {
        return this.f33755d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f33756e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t51)) {
            return false;
        }
        t51 t51Var = (t51) obj;
        return this.f33752a == t51Var.f33752a && this.f33753b == t51Var.f33753b && this.f33754c == t51Var.f33754c && this.f33755d == t51Var.f33755d && this.f33756e == t51Var.f33756e;
    }

    public final int hashCode() {
        return (((((((Boolean.hashCode(this.f33752a) * 31) + Boolean.hashCode(this.f33753b)) * 31) + Boolean.hashCode(this.f33754c)) * 31) + Boolean.hashCode(this.f33755d)) * 31) + Boolean.hashCode(this.f33756e);
    }

    public final String toString() {
        boolean z15 = this.f33752a;
        int length = String.valueOf(z15).length();
        boolean z16 = this.f33753b;
        int length2 = String.valueOf(z16).length();
        boolean z17 = this.f33754c;
        int length3 = String.valueOf(z17).length();
        boolean z18 = this.f33755d;
        int length4 = String.valueOf(z18).length();
        boolean z19 = this.f33756e;
        StringBuilder sb5 = new StringBuilder(length + 80 + length2 + 29 + length3 + 23 + length4 + 29 + String.valueOf(z19).length() + 1);
        sb5.append("AutocompleteThemeCustomization(isCustomColorApplied=");
        sb5.append(z15);
        sb5.append(", isCustomTypographyApplied=");
        sb5.append(z16);
        sb5.append(", isCustomMeasurementApplied=");
        sb5.append(z17);
        sb5.append(", isCustomShapeApplied=");
        sb5.append(z18);
        sb5.append(", isCustomAttributionApplied=");
        sb5.append(z19);
        sb5.append(")");
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(this.f33752a ? 1 : 0);
        parcel.writeInt(this.f33753b ? 1 : 0);
        parcel.writeInt(this.f33754c ? 1 : 0);
        parcel.writeInt(this.f33755d ? 1 : 0);
        parcel.writeInt(this.f33756e ? 1 : 0);
    }

    public t51() {
        this(false, false, false, false, false);
    }
}
