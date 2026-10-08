package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
class h1 extends Binder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f36547d;

    interface a {
        vh.l<Void> a(Intent intent);
    }

    h1(a aVar) {
        this.f36547d = aVar;
    }

    void b(final k1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        this.f36547d.a(aVar.f36568a).b(new ma.b(), new vh.f() { // from class: com.google.firebase.messaging.g1
            @Override // vh.f
            public final void a(vh.l lVar) {
                aVar.d();
            }
        });
    }
}
