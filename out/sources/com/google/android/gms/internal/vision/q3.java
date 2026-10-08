package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class q3 implements r3 {
    q3() {
    }

    @Override // com.google.android.gms.internal.vision.r3
    public final Map<?, ?> a(Object obj) {
        return (o3) obj;
    }

    @Override // com.google.android.gms.internal.vision.r3
    public final Map<?, ?> b(Object obj) {
        return (o3) obj;
    }

    @Override // com.google.android.gms.internal.vision.r3
    public final p3<?, ?> c(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.vision.r3
    public final Object d(Object obj) {
        ((o3) obj).i();
        return obj;
    }

    @Override // com.google.android.gms.internal.vision.r3
    public final boolean f(Object obj) {
        return !((o3) obj).m();
    }

    @Override // com.google.android.gms.internal.vision.r3
    public final Object g(Object obj, Object obj2) {
        o3 o3VarG = (o3) obj;
        o3 o3Var = (o3) obj2;
        if (!o3Var.isEmpty()) {
            if (!o3VarG.m()) {
                o3VarG = o3VarG.g();
            }
            o3VarG.e(o3Var);
        }
        return o3VarG;
    }

    @Override // com.google.android.gms.internal.vision.r3
    public final int h(int i15, Object obj, Object obj2) {
        o3 o3Var = (o3) obj;
        if (o3Var.isEmpty()) {
            return 0;
        }
        Iterator it = o3Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.vision.r3
    public final Object u(Object obj) {
        return o3.c().g();
    }
}
