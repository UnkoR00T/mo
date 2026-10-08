package fk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import sk.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f64351a;

    private b(InputStream inputStream) {
        this.f64351a = inputStream;
    }

    public static p b(byte[] bArr) {
        return new b(new ByteArrayInputStream(bArr));
    }

    @Override // fk.p
    public sk.t a() throws IOException {
        try {
            return sk.t.a0(this.f64351a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f64351a.close();
        }
    }

    @Override // fk.p
    public c0 read() throws IOException {
        try {
            return c0.f0(this.f64351a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f64351a.close();
        }
    }
}
