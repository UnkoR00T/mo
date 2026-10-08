package com.google.android.gms.internal.oss_licenses;

import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends d implements y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final e f30824d = new f();

    private m(UUID uuid, String str, Exception exc, boolean z15, v vVar) {
        super("<missing root>", uuid, str, vVar);
    }

    public static m h(v vVar) {
        final UUID uuidC = k.a().c();
        String strB = d.b(uuidC);
        t0 t0VarA = j.a();
        if (!t0VarA.isEmpty()) {
            final Exception exc = null;
            t0VarA.forEach(new Consumer(uuidC, exc) { // from class: com.google.android.gms.internal.oss_licenses.l
                @Override // java.util.function.Consumer
                public final /* synthetic */ void accept(Object obj) {
                    e eVar = m.f30824d;
                    ((z) obj).zza();
                }
            });
        }
        return new m(uuidC, strB, f30824d, false, vVar);
    }
}
