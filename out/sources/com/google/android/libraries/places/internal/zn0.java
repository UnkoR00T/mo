package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zn0 extends LinkedHashMap {
    private zn0() {
        throw null;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 100;
    }

    /* synthetic */ zn0(byte[] bArr) {
    }
}
