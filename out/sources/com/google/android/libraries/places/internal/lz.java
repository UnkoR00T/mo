package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class lz extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32889a;

    public lz(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.f32889a = true;
    }

    final boolean b() {
        return this.f32889a;
    }

    public lz(String str) {
        super(str);
    }

    public lz(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
