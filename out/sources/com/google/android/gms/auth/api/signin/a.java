package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import kg.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        Uri uri = null;
        String strH5 = null;
        String strH6 = null;
        ArrayList arrayListL = null;
        String strH7 = null;
        String strH8 = null;
        long jY = 0;
        while (parcel.dataPosition() < iC) {
            int iT = b.t(parcel);
            switch (b.n(iT)) {
                case 2:
                    strH = b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = b.h(parcel, iT);
                    break;
                case 4:
                    strH3 = b.h(parcel, iT);
                    break;
                case 5:
                    strH4 = b.h(parcel, iT);
                    break;
                case 6:
                    uri = (Uri) b.g(parcel, iT, Uri.CREATOR);
                    break;
                case 7:
                    strH5 = b.h(parcel, iT);
                    break;
                case 8:
                    jY = b.y(parcel, iT);
                    break;
                case 9:
                    strH6 = b.h(parcel, iT);
                    break;
                case 10:
                    arrayListL = b.l(parcel, iT, Scope.CREATOR);
                    break;
                case 11:
                    strH7 = b.h(parcel, iT);
                    break;
                case 12:
                    strH8 = b.h(parcel, iT);
                    break;
                default:
                    b.B(parcel, iT);
                    break;
            }
        }
        b.m(parcel, iC);
        return new GoogleSignInAccount(strH, strH2, strH3, strH4, uri, strH5, jY, strH6, arrayListL, strH7, strH8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new GoogleSignInAccount[i15];
    }
}
