package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public enum z51 implements Parcelable {
    FRAGMENT,
    INTENT;

    public static final Parcelable.Creator<z51> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.internal.y51
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return (z51) Enum.valueOf(z51.class, (String) zj.p.q(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i15) {
            return new z51[i15];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(name());
    }
}
