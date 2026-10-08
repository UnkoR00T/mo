package org.bouncycastle.cms;

/* JADX INFO: loaded from: classes5.dex */
interface MACProvider {
    byte[] getMAC();

    void init();
}
