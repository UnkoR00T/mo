package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public interface p0 extends Closeable {

    public enum a {
        UNKNOWN,
        CONNECTED,
        DISCONNECTED,
        NO_PERMISSION
    }

    public interface b {
        void h(a aVar);
    }

    String J0();

    void M3(b bVar);

    a w1();

    boolean w3(b bVar);
}
