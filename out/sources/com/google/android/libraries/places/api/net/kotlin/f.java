package com.google.android.libraries.places.api.net.kotlin;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class f extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f31533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f31534e;

    f(tq.e eVar) {
        super(eVar);
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f31533d = obj;
        this.f31534e |= PKIFailureInfo.systemUnavail;
        return PlacesClientKt.awaitFetchResolvedPhotoUri(null, null, null, this);
    }
}
