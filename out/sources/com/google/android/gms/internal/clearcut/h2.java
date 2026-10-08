package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class h2 implements g2 {
    h2() {
    }

    @Override // com.google.android.gms.internal.clearcut.g2
    public final Object e(Object obj, Object obj2) {
        f2 f2VarG = (f2) obj;
        f2 f2Var = (f2) obj2;
        if (!f2Var.isEmpty()) {
            if (!f2VarG.b()) {
                f2VarG = f2VarG.g();
            }
            f2VarG.c(f2Var);
        }
        return f2VarG;
    }

    @Override // com.google.android.gms.internal.clearcut.g2
    public final Object f(Object obj) {
        return f2.e().g();
    }

    @Override // com.google.android.gms.internal.clearcut.g2
    public final boolean g(Object obj) {
        return !((f2) obj).b();
    }

    @Override // com.google.android.gms.internal.clearcut.g2
    public final Map<?, ?> h(Object obj) {
        return (f2) obj;
    }

    @Override // com.google.android.gms.internal.clearcut.g2
    public final int i(int i15, Object obj, Object obj2) {
        f2 f2Var = (f2) obj;
        if (f2Var.isEmpty()) {
            return 0;
        }
        Iterator it = f2Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.clearcut.g2
    public final e2<?, ?> j(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.clearcut.g2
    public final Object k(Object obj) {
        ((f2) obj).n();
        return obj;
    }

    @Override // com.google.android.gms.internal.clearcut.g2
    public final Map<?, ?> l(Object obj) {
        return (f2) obj;
    }
}
