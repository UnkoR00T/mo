package org.bouncycastle.its.operator;

import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.operator.ContentVerifier;

/* JADX INFO: loaded from: classes5.dex */
public interface ITSContentVerifierProvider {
    ContentVerifier get(int i15);

    ITSCertificate getAssociatedCertificate();

    boolean hasAssociatedCertificate();
}
