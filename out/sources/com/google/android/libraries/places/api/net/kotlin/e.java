package com.google.android.libraries.places.api.net.kotlin;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class e extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f31531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f31532e;

    e(tq.e eVar) {
        super(eVar);
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f31531d = obj;
        this.f31532e |= PKIFailureInfo.systemUnavail;
        return PlacesClientKt.awaitFetchPlace(null, null, null, null, this);
    }
}
