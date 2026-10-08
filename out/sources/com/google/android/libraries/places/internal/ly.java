package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ly {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ly f32886b = new ly(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32887a = Collections.EMPTY_MAP;

    ly(boolean z15) {
    }

    public static ly a() {
        int i15 = kx.f32765a;
        return f32886b;
    }

    public final zy b(g00 g00Var, int i15) {
        return (zy) this.f32887a.get(new ky(g00Var, i15));
    }
}
