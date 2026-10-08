package org.bouncycastle.est.jcajce;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes5.dex */
public interface SSLSocketFactoryCreator {
    SSLSocketFactory createFactory();

    boolean isTrusted();
}
