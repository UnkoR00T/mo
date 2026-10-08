package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public enum e61 implements Parcelable {
    PABLO,
    ONE_PLATFORM,
    JWT_AND_ONE_PLATFORM;

    public static final Parcelable.Creator<e61> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.internal.d61
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return (e61) Enum.valueOf(e61.class, (String) zj.p.q(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i15) {
            return new e61[i15];
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
