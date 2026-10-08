package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s5 extends y implements r5 {
    public s5() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // com.google.android.gms.internal.clearcut.y
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        switch (i15) {
            case 1:
                g1((Status) y0.a(parcel, Status.CREATOR));
                return true;
            case 2:
                s1((Status) y0.a(parcel, Status.CREATOR));
                return true;
            case 3:
                I((Status) y0.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 4:
                A1((Status) y0.a(parcel, Status.CREATOR));
                return true;
            case 5:
                B1((Status) y0.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 6:
                z0((Status) y0.a(parcel, Status.CREATOR), (eg.f[]) parcel.createTypedArray(eg.f.CREATOR));
                return true;
            case 7:
                R((DataHolder) y0.a(parcel, DataHolder.CREATOR));
                return true;
            case 8:
                b3((Status) y0.a(parcel, Status.CREATOR), (eg.d) y0.a(parcel, eg.d.CREATOR));
                return true;
            case 9:
                j3((Status) y0.a(parcel, Status.CREATOR), (eg.d) y0.a(parcel, eg.d.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
