package com.google.android.libraries.places.api.net.kotlin;

import ii.l0;
import ji.n;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class j extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f31541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f31542e;

    j(tq.e eVar) {
        super(eVar);
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f31541d = obj;
        this.f31542e |= PKIFailureInfo.systemUnavail;
        return PlacesClientKt.awaitIsOpen((n) null, (l0) null, (Long) null, this);
    }
}
