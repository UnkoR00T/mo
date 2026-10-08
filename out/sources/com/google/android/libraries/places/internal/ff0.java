package com.google.android.libraries.places.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f32295a = new ArrayList();

    public final ff0 a(Object obj) {
        this.f32295a.add(String.valueOf(obj));
        return this;
    }

    public final ff0 b(String str, Object obj) {
        String strValueOf = String.valueOf(obj);
        StringBuilder sb5 = new StringBuilder(str.length() + 1 + strValueOf.length());
        sb5.append(str);
        sb5.append("=");
        sb5.append(strValueOf);
        this.f32295a.add(sb5.toString());
        return this;
    }

    public final String toString() {
        return this.f32295a.toString();
    }
}
