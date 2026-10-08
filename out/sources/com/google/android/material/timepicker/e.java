package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f35873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f35874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f35875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f35876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f35877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f35878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f35879g;

    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i15) {
            return new e[i15];
        }
    }

    public e(int i15, int i16, int i17, int i18) {
        this.f35876d = i15;
        this.f35877e = i16;
        this.f35878f = i17;
        this.f35875c = i18;
        this.f35879g = c(i15);
        this.f35873a = new b(59);
        this.f35874b = new b(i18 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i15) {
        return i15 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f35876d == eVar.f35876d && this.f35877e == eVar.f35877e && this.f35875c == eVar.f35875c && this.f35878f == eVar.f35878f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f35875c), Integer.valueOf(this.f35876d), Integer.valueOf(this.f35877e), Integer.valueOf(this.f35878f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(this.f35876d);
        parcel.writeInt(this.f35877e);
        parcel.writeInt(this.f35878f);
        parcel.writeInt(this.f35875c);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
