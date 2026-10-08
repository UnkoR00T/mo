package org.bouncycastle.pqc.crypto.sphincsplus;

/* JADX INFO: loaded from: classes5.dex */
class IndexedDigest {
    final byte[] digest;
    final int idx_leaf;
    final long idx_tree;

    IndexedDigest(long j15, int i15, byte[] bArr) {
        this.idx_tree = j15;
        this.idx_leaf = i15;
        this.digest = bArr;
    }
}
