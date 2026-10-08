package io.sentry.instrumentation.file;

import io.sentry.c1;
import io.sentry.j1;
import io.sentry.r4;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends FileOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileOutputStream f95097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.instrumentation.file.a f95098b;

    public static final class b {
        public static FileOutputStream a(FileOutputStream fileOutputStream, File file) {
            return e(r4.b()) ? new l(l.y(file, false, fileOutputStream, r4.b())) : fileOutputStream;
        }

        public static FileOutputStream b(FileOutputStream fileOutputStream, File file, boolean z15) {
            return e(r4.b()) ? new l(l.y(file, z15, fileOutputStream, r4.b())) : fileOutputStream;
        }

        public static FileOutputStream c(FileOutputStream fileOutputStream, FileDescriptor fileDescriptor) {
            return e(r4.b()) ? new l(l.C(fileDescriptor, fileOutputStream, r4.b()), fileDescriptor) : fileOutputStream;
        }

        public static FileOutputStream d(FileOutputStream fileOutputStream, String str) {
            if (e(r4.b())) {
                return new l(l.y(str != null ? new File(str) : null, false, fileOutputStream, r4.b()));
            }
            return fileOutputStream;
        }

        private static boolean e(c1 c1Var) {
            return c1Var.s().isTracingEnabled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c C(FileDescriptor fileDescriptor, FileOutputStream fileOutputStream, c1 c1Var) {
        j1 j1VarE = io.sentry.instrumentation.file.a.e(c1Var, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(fileDescriptor);
        }
        return new c(null, false, j1VarE, fileOutputStream, c1Var.s());
    }

    public static /* synthetic */ Integer b(l lVar, byte[] bArr) throws IOException {
        lVar.f95097a.write(bArr);
        return Integer.valueOf(bArr.length);
    }

    public static /* synthetic */ Integer h(l lVar, byte[] bArr, int i15, int i16) throws IOException {
        lVar.f95097a.write(bArr, i15, i16);
        return Integer.valueOf(i16);
    }

    public static /* synthetic */ Integer m(l lVar, int i15) throws IOException {
        lVar.f95097a.write(i15);
        return 1;
    }

    private static FileDescriptor u(FileOutputStream fileOutputStream) throws FileNotFoundException {
        try {
            return fileOutputStream.getFD();
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c y(File file, boolean z15, FileOutputStream fileOutputStream, c1 c1Var) {
        j1 j1VarE = io.sentry.instrumentation.file.a.e(c1Var, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z15);
        }
        return new c(file, z15, j1VarE, fileOutputStream, c1Var.s());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f95098b.a(this.f95097a);
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final int i15) {
        this.f95098b.d(new io.sentry.instrumentation.file.a.InterfaceC2235a() { // from class: io.sentry.instrumentation.file.j
            @Override // io.sentry.instrumentation.file.a.InterfaceC2235a
            public final Object call() {
                return l.m(this.f95093a, i15);
            }
        });
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final byte[] bArr) {
        this.f95098b.d(new io.sentry.instrumentation.file.a.InterfaceC2235a() { // from class: io.sentry.instrumentation.file.k
            @Override // io.sentry.instrumentation.file.a.InterfaceC2235a
            public final Object call() {
                return l.b(this.f95095a, bArr);
            }
        });
    }

    public l(File file) {
        this(file, false, (c1) r4.b());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final byte[] bArr, final int i15, final int i16) {
        this.f95098b.d(new io.sentry.instrumentation.file.a.InterfaceC2235a() { // from class: io.sentry.instrumentation.file.i
            @Override // io.sentry.instrumentation.file.a.InterfaceC2235a
            public final Object call() {
                return l.h(this.f95089a, bArr, i15, i16);
            }
        });
    }

    l(File file, boolean z15, c1 c1Var) {
        this(y(file, z15, null, c1Var));
    }

    private l(c cVar, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.f95098b = new io.sentry.instrumentation.file.a(cVar.f95073b, cVar.f95072a, cVar.f95076e);
        this.f95097a = cVar.f95075d;
    }

    private l(c cVar) {
        super(u(cVar.f95075d));
        this.f95098b = new io.sentry.instrumentation.file.a(cVar.f95073b, cVar.f95072a, cVar.f95076e);
        this.f95097a = cVar.f95075d;
    }
}
