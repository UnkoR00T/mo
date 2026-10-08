package com.google.android.libraries.places.internal;

import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes4.dex */
public class gs0 {
    static {
        new fs0();
    }

    public void a() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
    }
}
