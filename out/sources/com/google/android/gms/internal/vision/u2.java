package com.google.android.gms.internal.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class u2 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u3 f31289a;

    public u2(String str) {
        super(str);
        this.f31289a = null;
    }

    static u2 a() {
        return new u2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static u2 b() {
        return new u2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static u2 c() {
        return new u2("Protocol message contained an invalid tag (zero).");
    }

    static x2 d() {
        return new x2("Protocol message tag had invalid wire type.");
    }

    static u2 e() {
        return new u2("Failed to parse the message.");
    }

    static u2 f() {
        return new u2("Protocol message had invalid UTF-8.");
    }
}
