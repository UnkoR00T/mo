package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.EncodableService;

/* JADX INFO: loaded from: classes5.dex */
public interface EncodableDigest extends EncodableService {
    @Override // org.bouncycastle.crypto.EncodableService
    byte[] getEncodedState();
}
