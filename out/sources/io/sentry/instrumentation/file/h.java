package io.sentry.instrumentation.file;

import io.sentry.c1;
import io.sentry.j1;
import io.sentry.r4;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends FileInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileInputStream f95087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.instrumentation.file.a f95088b;

    public static final class b {
        public static FileInputStream a(FileInputStream fileInputStream, File file) {
            r4 r4VarB = r4.b();
            return d(r4VarB) ? new h(h.C(file, fileInputStream, r4VarB)) : fileInputStream;
        }

        public static FileInputStream b(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
            r4 r4VarB = r4.b();
            return d(r4VarB) ? new h(h.E(fileDescriptor, fileInputStream, r4VarB), fileDescriptor) : fileInputStream;
        }

        public static FileInputStream c(FileInputStream fileInputStream, String str) {
            r4 r4VarB = r4.b();
            if (d(r4VarB)) {
                return new h(h.C(str != null ? new File(str) : null, fileInputStream, r4VarB));
            }
            return fileInputStream;
        }

        private static boolean d(c1 c1Var) {
            return c1Var.s().isTracingEnabled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.sentry.instrumentation.file.b C(File file, FileInputStream fileInputStream, c1 c1Var) {
        j1 j1VarE = io.sentry.instrumentation.file.a.e(c1Var, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new io.sentry.instrumentation.file.b(file, j1VarE, fileInputStream, c1Var.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.sentry.instrumentation.file.b E(FileDescriptor fileDescriptor, FileInputStream fileInputStream, c1 c1Var) {
        j1 j1VarE = io.sentry.instrumentation.file.a.e(c1Var, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(fileDescriptor);
        }
        return new io.sentry.instrumentation.file.b(null, j1VarE, fileInputStream, c1Var.s());
    }

    public static /* synthetic */ Integer m(h hVar, AtomicInteger atomicInteger) throws IOException {
        int i15 = hVar.f95087a.read();
        atomicInteger.set(i15);
        return Integer.valueOf(i15 != -1 ? 1 : 0);
    }

    private static FileDescriptor y(FileInputStream fileInputStream) throws FileNotFoundException {
        try {
            return fileInputStream.getFD();
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f95088b.a(this.f95087a);
        super.close();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f95088b.d(new io.sentry.instrumentation.file.a.InterfaceC2235a() { // from class: io.sentry.instrumentation.file.g
            @Override // io.sentry.instrumentation.file.a.InterfaceC2235a
            public final Object call() {
                return h.m(this.f95085a, atomicInteger);
            }
        });
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public long skip(final long j15) {
        return ((Long) this.f95088b.d(new io.sentry.instrumentation.file.a.InterfaceC2235a() { // from class: io.sentry.instrumentation.file.d
            @Override // io.sentry.instrumentation.file.a.InterfaceC2235a
            public final Object call() {
                return Long.valueOf(this.f95077a.f95087a.skip(j15));
            }
        })).longValue();
    }

    public h(String str) {
        this(str != null ? new File(str) : null, r4.b());
    }

    public h(File file) {
        this(file, r4.b());
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(final byte[] bArr) {
        return ((Integer) this.f95088b.d(new io.sentry.instrumentation.file.a.InterfaceC2235a() { // from class: io.sentry.instrumentation.file.f
            @Override // io.sentry.instrumentation.file.a.InterfaceC2235a
            public final Object call() {
                return Integer.valueOf(this.f95083a.f95087a.read(bArr));
            }
        })).intValue();
    }

    h(File file, c1 c1Var) {
        this(C(file, null, c1Var));
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(final byte[] bArr, final int i15, final int i16) {
        return ((Integer) this.f95088b.d(new io.sentry.instrumentation.file.a.InterfaceC2235a() { // from class: io.sentry.instrumentation.file.e
            @Override // io.sentry.instrumentation.file.a.InterfaceC2235a
            public final Object call() {
                return Integer.valueOf(this.f95079a.f95087a.read(bArr, i15, i16));
            }
        })).intValue();
    }

    private h(io.sentry.instrumentation.file.b bVar, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.f95088b = new io.sentry.instrumentation.file.a(bVar.f95069b, bVar.f95068a, bVar.f95071d);
        this.f95087a = bVar.f95070c;
    }

    private h(io.sentry.instrumentation.file.b bVar) {
        super(y(bVar.f95070c));
        this.f95088b = new io.sentry.instrumentation.file.a(bVar.f95069b, bVar.f95068a, bVar.f95071d);
        this.f95087a = bVar.f95070c;
    }
}
