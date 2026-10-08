package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
abstract class c21 extends y11 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Locale f31843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u41 f31845d;

    protected c21(c41 c41Var, Locale locale, String str, u41 u41Var) {
        super(c41Var);
        this.f31843b = locale;
        this.f31844c = str;
        this.f31845d = u41Var;
    }

    protected static void g(Map map, String str, Object obj, Object obj2) {
        String string = obj != null ? obj.toString() : null;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        map.put(str, string);
    }

    @Override // com.google.android.libraries.places.internal.y11
    protected final Map c() {
        HashMap map = new HashMap();
        map.putAll(this.f31845d.a());
        map.put("X-Places-Android-Sdk", "5.2.0");
        return map;
    }

    @Override // com.google.android.libraries.places.internal.y11
    protected final String d() {
        p21 p21Var = new p21(f(), this.f31844c);
        p21Var.a(this.f31843b);
        p21Var.b(e());
        return p21Var.c();
    }

    protected abstract Map e();

    protected abstract String f();
}
