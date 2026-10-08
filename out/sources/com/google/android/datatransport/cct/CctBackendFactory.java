package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import bf.h;
import bf.m;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class CctBackendFactory implements bf.d {
    @Override // bf.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
