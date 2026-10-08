package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class lv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile lv f30485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final lv f30486c = new lv(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30487a;

    lv() {
        this.f30487a = new HashMap();
    }

    public static lv a() {
        int i15 = rx.f30613d;
        return f30486c;
    }

    public static lv b() {
        lv lvVar = f30485b;
        if (lvVar != null) {
            return lvVar;
        }
        synchronized (lv.class) {
            try {
                lv lvVar2 = f30485b;
                if (lvVar2 != null) {
                    return lvVar2;
                }
                int i15 = rx.f30613d;
                lv lvVarB = tv.b(lv.class);
                f30485b = lvVarB;
                return lvVarB;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final aw c(jx jxVar, int i15) {
        return (aw) this.f30487a.get(new kv(jxVar, i15));
    }

    lv(boolean z15) {
        this.f30487a = Collections.EMPTY_MAP;
    }
}
