package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class ko0 implements xm0 {
    ko0() {
    }

    @Override // com.google.android.libraries.places.internal.xm0
    public final wm0 b(int i15) {
        return new jo0(new nr0(), Math.min(PKIFailureInfo.badCertTemplate, ((i15 + 8191) / PKIFailureInfo.certRevoked) * PKIFailureInfo.certRevoked));
    }
}
