package org.bouncycastle.est;

/* JADX INFO: loaded from: classes5.dex */
public interface ESTSourceConnectionListener<T, I> {
    ESTRequest onConnection(Source<T> source, ESTRequest eSTRequest);
}
