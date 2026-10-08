package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class om {
    public static List a(List list, ql qlVar) {
        return list instanceof RandomAccess ? new km(list, qlVar) : new nm(list, qlVar);
    }
}
