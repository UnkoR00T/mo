package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ka1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ga1 f32726a = new ia1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final fa1 f32727b = new ja1();

    public static da1 a(Set set) {
        da1 da1Var = new da1(f32726a, null);
        da1Var.a(f32727b);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            da1Var.b((u91) it.next());
        }
        return da1Var;
    }
}
