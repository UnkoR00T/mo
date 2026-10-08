package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ef0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f32199a = Collections.newSetFromMap(new IdentityHashMap());

    public final void a(Object obj, boolean z15) {
        Set set = this.f32199a;
        int size = set.size();
        if (z15) {
            set.add(obj);
            if (size == 0) {
                d();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            e();
        }
    }

    public final boolean b() {
        return !this.f32199a.isEmpty();
    }

    public final boolean c(Object... objArr) {
        for (int i15 = 0; i15 < 2; i15++) {
            if (this.f32199a.contains(objArr[i15])) {
                return true;
            }
        }
        return false;
    }

    protected abstract void d();

    protected abstract void e();
}
