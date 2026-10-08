package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class l1 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l2 f29406a;

    public l1(String str) {
        super(str);
        this.f29406a = null;
    }

    static l1 a() {
        return new l1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static l1 b() {
        return new l1("Protocol message contained an invalid tag (zero).");
    }

    static m1 c() {
        return new m1("Protocol message tag had invalid wire type.");
    }

    static l1 d() {
        return new l1("Failed to parse the message.");
    }

    static l1 e() {
        return new l1("Protocol message had invalid UTF-8.");
    }

    public final l1 f(l2 l2Var) {
        this.f29406a = l2Var;
        return this;
    }
}
