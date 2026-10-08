package com.google.android.libraries.places.api.net.kotlin;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class g extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f31535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f31536e;

    g(tq.e eVar) {
        super(eVar);
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f31535d = obj;
        this.f31536e |= PKIFailureInfo.systemUnavail;
        return PlacesClientKt.awaitFindAutocompletePredictions(null, null, this);
    }
}
