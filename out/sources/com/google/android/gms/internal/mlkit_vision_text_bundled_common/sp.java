package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sp extends ac implements tp {
    public sp() {
        super("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
    }

    public static tp asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        return iInterfaceQueryLocalInterface instanceof tp ? (tp) iInterfaceQueryLocalInterface : new rp(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ac
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 1) {
            rg.b bVarM3 = rg.b.a.m3(parcel.readStrongBinder());
            bd.b(parcel);
            qp qpVarNewTextRecognizer = newTextRecognizer(bVarM3);
            parcel2.writeNoException();
            bd.c(parcel2, qpVarNewTextRecognizer);
        } else {
            if (i15 != 2) {
                return false;
            }
            rg.b bVarM4 = rg.b.a.m3(parcel.readStrongBinder());
            cq cqVar = (cq) bd.a(parcel, cq.CREATOR);
            bd.b(parcel);
            qp qpVarNewTextRecognizerWithOptions = newTextRecognizerWithOptions(bVarM4, cqVar);
            parcel2.writeNoException();
            bd.c(parcel2, qpVarNewTextRecognizerWithOptions);
        }
        return true;
    }
}
