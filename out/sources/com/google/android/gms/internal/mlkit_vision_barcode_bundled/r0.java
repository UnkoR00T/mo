package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 extends b0 implements s0 {
    public r0() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static s0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new q0(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.b0
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        rg.b bVarM3 = rg.b.a.m3(parcel.readStrongBinder());
        c0 c0Var = (c0) c1.a(parcel, c0.CREATOR);
        c1.b(parcel);
        p0 p0VarNewBarcodeScanner = newBarcodeScanner(bVarM3, c0Var);
        parcel2.writeNoException();
        if (p0VarNewBarcodeScanner == null) {
            parcel2.writeStrongBinder(null);
        } else {
            parcel2.writeStrongBinder(p0VarNewBarcodeScanner.asBinder());
        }
        return true;
    }
}
