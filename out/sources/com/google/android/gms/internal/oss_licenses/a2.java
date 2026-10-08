package com.google.android.gms.internal.oss_licenses;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w1 f30735a = new y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v1 f30736b = new z1();

    public static t1 a(Set set) {
        t1 t1Var = new t1(f30735a, null);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            t1Var.a((m1) it.next());
        }
        return t1Var;
    }
}
