package com.google.android.libraries.places.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k70 extends x60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m80 f32708a = m80.a(new j70());

    public abstract boolean b();

    public abstract int c();

    public abstract String d();

    public m80 e(Map map) {
        return f32708a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        return zj.j.c(this).d("policy", d()).b("priority", 5).e("available", true).toString();
    }
}
