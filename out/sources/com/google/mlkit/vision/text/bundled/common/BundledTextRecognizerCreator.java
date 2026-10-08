package com.google.mlkit.vision.text.bundled.common;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.cq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.sp;
import jg.s;
import rg.b;
import rg.d;

/* JADX INFO: loaded from: classes4.dex */
@DynamiteApi
public class BundledTextRecognizerCreator extends sp {
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.tp
    public a newTextRecognizer(b bVar) throws RemoteException {
        throw new RemoteException("Please use newTextRecognizerWithOptions instead.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.tp
    public a newTextRecognizerWithOptions(b bVar, cq cqVar) {
        return new a((Context) s.l((Context) d.n3(bVar)), cqVar.h(), cqVar.p(), cqVar.m(), cqVar.r());
    }
}
