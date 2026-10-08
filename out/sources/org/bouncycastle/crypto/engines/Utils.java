package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CryptoServicePurpose;

/* JADX INFO: loaded from: classes5.dex */
class Utils {
    Utils() {
    }

    static CryptoServicePurpose getPurpose(boolean z15) {
        return z15 ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }
}
