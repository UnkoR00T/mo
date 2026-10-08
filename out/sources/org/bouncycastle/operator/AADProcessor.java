package org.bouncycastle.operator;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public interface AADProcessor {
    OutputStream getAADStream();

    byte[] getMAC();
}
