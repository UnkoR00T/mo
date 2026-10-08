package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xl f30719a;

    private zl(xl xlVar) {
        ol olVar = nl.f30523b;
        this.f30719a = xlVar;
    }

    public static zl a(String str) {
        return new zl(new xl("#vk "));
    }

    public final List b(CharSequence charSequence) {
        charSequence.getClass();
        wl wlVar = new wl(this.f30719a, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (wlVar.hasNext()) {
            arrayList.add((String) wlVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
