package com.google.android.libraries.places.api.net.kotlin;

import ji.n;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class i extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f31539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f31540e;

    i(tq.e eVar) {
        super(eVar);
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f31539d = obj;
        this.f31540e |= PKIFailureInfo.systemUnavail;
        return PlacesClientKt.awaitIsOpen((n) null, (String) null, (Long) null, this);
    }
}
