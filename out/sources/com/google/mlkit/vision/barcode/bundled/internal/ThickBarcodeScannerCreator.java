package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.c0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.p0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0;
import rg.b;
import rg.d;

/* JADX INFO: loaded from: classes4.dex */
@DynamiteApi
public class ThickBarcodeScannerCreator extends r0 {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s0
    public p0 newBarcodeScanner(b bVar, c0 c0Var) {
        return new a((Context) d.n3(bVar), c0Var);
    }
}
