package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 extends b0 implements p0 {
    public o0() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.b0
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 1) {
            c();
            parcel2.writeNoException();
        } else if (i15 == 2) {
            f();
            parcel2.writeNoException();
        } else if (i15 == 3) {
            rg.b bVarM3 = rg.b.a.m3(parcel.readStrongBinder());
            f1 f1Var = (f1) c1.a(parcel, f1.CREATOR);
            c1.b(parcel);
            List listJ0 = J0(bVarM3, f1Var);
            parcel2.writeNoException();
            parcel2.writeTypedList(listJ0);
        } else if (i15 == 4) {
            rg.b bVarM4 = rg.b.a.m3(parcel.readStrongBinder());
            f1 f1Var2 = (f1) c1.a(parcel, f1.CREATOR);
            e0 e0Var = (e0) c1.a(parcel, e0.CREATOR);
            c1.b(parcel);
            List listX0 = X0(bVarM4, f1Var2, e0Var);
            parcel2.writeNoException();
            parcel2.writeTypedList(listX0);
        } else {
            if (i15 != 5) {
                return false;
            }
            g0 g0Var = (g0) c1.a(parcel, g0.CREATOR);
            c1.b(parcel);
            B0(g0Var);
            parcel2.writeNoException();
        }
        return true;
    }
}
