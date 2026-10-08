package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tl<T> implements Serializable {
    tl() {
    }

    public static tl d() {
        return il.f30452a;
    }

    public static tl e(Object obj) {
        obj.getClass();
        return new vl(obj);
    }

    public abstract Object a();

    public abstract Object b(Object obj);

    public abstract boolean c();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}
