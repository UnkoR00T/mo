package com.google.android.libraries.places.api.net.kotlin;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class l extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f31545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f31546e;

    l(tq.e eVar) {
        super(eVar);
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f31545d = obj;
        this.f31546e |= PKIFailureInfo.systemUnavail;
        return PlacesClientKt.awaitSearchNearby(null, null, null, null, this);
    }
}
