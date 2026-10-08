package com.google.android.libraries.places.api.net.kotlin;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class d extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f31529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f31530e;

    d(tq.e eVar) {
        super(eVar);
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f31529d = obj;
        this.f31530e |= PKIFailureInfo.systemUnavail;
        return PlacesClientKt.awaitFetchPhoto(null, null, null, this);
    }
}
