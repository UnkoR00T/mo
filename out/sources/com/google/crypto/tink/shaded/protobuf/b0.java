package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class b0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r0 f36006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36007b;

    public static class a extends b0 {
        public a(String str) {
            super(str);
        }
    }

    public b0(String str) {
        super(str);
        this.f36006a = null;
    }

    static b0 b() {
        return new b0("Protocol message end-group tag did not match expected tag.");
    }

    static b0 c() {
        return new b0("Protocol message contained an invalid tag (zero).");
    }

    static b0 d() {
        return new b0("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static b0 f() {
        return new b0("CodedInputStream encountered a malformed varint.");
    }

    static b0 g() {
        return new b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static b0 h() {
        return new b0("Failed to parse the message.");
    }

    static b0 i() {
        return new b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static b0 m() {
        return new b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static b0 n() {
        return new b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f36007b;
    }

    void j() {
        this.f36007b = true;
    }

    public b0 k(r0 r0Var) {
        this.f36006a = r0Var;
        return this;
    }

    public b0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f36006a = null;
    }
}
