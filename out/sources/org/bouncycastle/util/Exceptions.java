package org.bouncycastle.util;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class Exceptions {
    public static IllegalArgumentException illegalArgumentException(String str, Throwable th4) {
        return new IllegalArgumentException(str, th4);
    }

    public static IllegalStateException illegalStateException(String str, Throwable th4) {
        return new IllegalStateException(str, th4);
    }

    public static IOException ioException(String str, final Throwable th4) {
        return new IOException(str + "-" + th4.getMessage()) { // from class: org.bouncycastle.util.Exceptions.1
            @Override // java.lang.Throwable
            public synchronized Throwable getCause() {
                return th4;
            }
        };
    }
}
