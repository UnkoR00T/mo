package org.bouncycastle.pqc.crypto.picnic;

/* JADX INFO: loaded from: classes5.dex */
class View {
    final byte[] communicatedBits;
    final int[] inputShare;
    final int[] outputShare;

    public View(PicnicEngine picnicEngine) {
        int i15 = picnicEngine.stateSizeWords;
        this.inputShare = new int[i15];
        this.communicatedBits = new byte[picnicEngine.andSizeBytes];
        this.outputShare = new int[i15];
    }
}
