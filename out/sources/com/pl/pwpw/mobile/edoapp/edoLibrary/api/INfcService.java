package com.pl.pwpw.mobile.edoapp.edoLibrary.api;

import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/INfcService;", "", "Loq/i0;", "startListening", "()V", "stopListening", "connect", "(Ltq/e;)Ljava/lang/Object;", "", "request", "transreceive", "([BLtq/e;)Ljava/lang/Object;", "disconnect", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/ITagDetected;", "listener", "addListener", "(Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/ITagDetected;)V", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface INfcService {
    void addListener(ITagDetected listener);

    Object connect(e<? super i0> eVar);

    void disconnect();

    void startListening();

    void stopListening();

    Object transreceive(byte[] bArr, e<? super byte[]> eVar);
}
