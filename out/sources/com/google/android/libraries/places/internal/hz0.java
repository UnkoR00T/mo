package com.google.android.libraries.places.internal;

import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class hz0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ hz0 f32517a = new hz0();

    private /* synthetic */ hz0() {
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        String str = (String) obj;
        return str.substring(str.lastIndexOf("places/") + 7);
    }
}
