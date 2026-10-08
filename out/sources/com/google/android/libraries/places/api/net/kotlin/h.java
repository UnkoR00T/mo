package com.google.android.libraries.places.api.net.kotlin;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class h extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f31537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f31538e;

    h(tq.e eVar) {
        super(eVar);
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f31537d = obj;
        this.f31538e |= PKIFailureInfo.systemUnavail;
        return PlacesClientKt.awaitFindCurrentPlace(null, null, this);
    }
}
