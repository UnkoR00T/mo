package org.bouncycastle.tsp.ers;

/* JADX INFO: loaded from: classes5.dex */
class IndexedHash {
    final byte[] digest;
    final int order;

    IndexedHash(int i15, byte[] bArr) {
        this.order = i15;
        this.digest = bArr;
    }
}
