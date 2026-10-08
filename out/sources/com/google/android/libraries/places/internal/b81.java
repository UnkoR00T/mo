package com.google.android.libraries.places.internal;

import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public final class b81 extends o71 implements n81 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final r71 f31769e = new s71();

    private b81(UUID uuid, String str, Exception exc, boolean z15, l81 l81Var) {
        super("<missing root>", uuid, str, l81Var);
    }

    public static b81 h(l81 l81Var) {
        final UUID uuidC = z71.a().c();
        String strB = o71.b(uuidC);
        ak.u0 u0VarA = y71.a();
        if (!u0VarA.isEmpty()) {
            final Exception exc = null;
            u0VarA.forEach(new Consumer(uuidC, exc) { // from class: com.google.android.libraries.places.internal.a81
                @Override // java.util.function.Consumer
                public final /* synthetic */ void accept(Object obj) {
                    r71 r71Var = b81.f31769e;
                    ((p81) obj).zza();
                }
            });
        }
        return new b81(uuidC, strB, f31769e, false, l81Var);
    }

    @Override // com.google.android.libraries.places.internal.n81
    public final f81 i() {
        return e81.f32170e;
    }

    @Override // com.google.android.libraries.places.internal.n81
    public final long o() {
        return -1L;
    }
}
