package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class op extends ac implements qp {
    public op() {
        super("com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ac
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 1) {
            r();
            parcel2.writeNoException();
        } else if (i15 == 2) {
            Z();
            parcel2.writeNoException();
        } else if (i15 == 3) {
            rg.b bVarM3 = rg.b.a.m3(parcel.readStrongBinder());
            mp mpVar = (mp) bd.a(parcel, mp.CREATOR);
            bd.b(parcel);
            aq aqVarA0 = a0(bVarM3, mpVar);
            parcel2.writeNoException();
            parcel2.writeInt(1);
            aqVarA0.writeToParcel(parcel2, 1);
        } else {
            if (i15 != 4) {
                return false;
            }
            rg.b bVarM4 = rg.b.a.m3(parcel.readStrongBinder());
            mp mpVar2 = (mp) bd.a(parcel, mp.CREATOR);
            bd.b(parcel);
            fg[] fgVarArrJ2 = J2(bVarM4, mpVar2);
            parcel2.writeNoException();
            parcel2.writeTypedArray(fgVarArrJ2, 1);
        }
        return true;
    }
}
