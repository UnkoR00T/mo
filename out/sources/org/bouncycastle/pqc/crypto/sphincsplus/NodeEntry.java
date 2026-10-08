package org.bouncycastle.pqc.crypto.sphincsplus;

/* JADX INFO: loaded from: classes5.dex */
class NodeEntry {
    final int nodeHeight;
    final byte[] nodeValue;

    NodeEntry(byte[] bArr, int i15) {
        this.nodeValue = bArr;
        this.nodeHeight = i15;
    }
}
