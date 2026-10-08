package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class a0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r0 f11906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11907b;

    public static class a extends a0 {
        public a(String str) {
            super(str);
        }
    }

    public a0(String str) {
        super(str);
        this.f11906a = null;
    }

    static a0 b() {
        return new a0("Protocol message end-group tag did not match expected tag.");
    }

    static a0 c() {
        return new a0("Protocol message contained an invalid tag (zero).");
    }

    static a0 d() {
        return new a0("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static a0 f() {
        return new a0("CodedInputStream encountered a malformed varint.");
    }

    static a0 g() {
        return new a0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static a0 h() {
        return new a0("Failed to parse the message.");
    }

    static a0 i() {
        return new a0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static a0 m() {
        return new a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static a0 n() {
        return new a0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f11907b;
    }

    void j() {
        this.f11907b = true;
    }

    public a0 k(r0 r0Var) {
        this.f11906a = r0Var;
        return this;
    }

    public a0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f11906a = null;
    }
}
