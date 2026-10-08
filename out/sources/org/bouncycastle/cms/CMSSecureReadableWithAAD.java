package org.bouncycastle.cms;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
interface CMSSecureReadableWithAAD extends CMSSecureReadable {
    OutputStream getAADStream();

    byte[] getMAC();

    void setAADStream(OutputStream outputStream);
}
