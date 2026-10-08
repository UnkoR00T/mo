package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class g91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32378a = new HashMap();

    /* synthetic */ g91(byte[] bArr) {
    }

    public final g91 a(char c15, String str) {
        zj.p.q(str);
        this.f32378a.put(Character.valueOf(c15), str);
        return this;
    }

    public final d91 b() {
        return new f91(this, this.f32378a, (char) 0, (char) 65535);
    }
}
