package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ c f29287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c cVar, Handler handler) {
        super(null);
        this.f29287a = cVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z15) {
        this.f29287a.d();
        this.f29287a.f();
    }
}
