package com.google.android.libraries.places.api.net.kotlin;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class k extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f31543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f31544e;

    k(tq.e eVar) {
        super(eVar);
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f31543d = obj;
        this.f31544e |= PKIFailureInfo.systemUnavail;
        return PlacesClientKt.awaitSearchByText(null, null, null, null, this);
    }
}
