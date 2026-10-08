package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Object> f28761a;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, Object> f28762a = new HashMap();

        a() {
        }

        e b() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.f28761a = Collections.unmodifiableMap(new HashMap(aVar.f28762a));
    }

    public boolean a(Class<Object> cls) {
        return this.f28761a.containsKey(cls);
    }
}
