package io.sentry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class p6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f95299d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q6 f95300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Callable<byte[]> f95301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f95302c;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f95303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callable<byte[]> f95304b;

        public a(Callable<byte[]> callable) {
            this.f95304b = callable;
        }

        private static byte[] b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] a() {
            Callable<byte[]> callable;
            if (this.f95303a == null && (callable = this.f95304b) != null) {
                this.f95303a = callable.call();
            }
            return b(this.f95303a);
        }
    }

    p6(q6 q6Var, byte[] bArr) {
        this.f95300a = (q6) io.sentry.util.v.c(q6Var, "SentryEnvelopeItemHeader is required.");
        this.f95302c = bArr;
        this.f95301b = null;
    }

    public static p6 A(final h1 h1Var, final io.sentry.clientreport.c cVar) {
        io.sentry.util.v.c(h1Var, "ISerializer is required.");
        io.sentry.util.v.c(cVar, "ClientReport is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.e6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.d(h1Var, cVar);
            }
        });
        return new p6(new q6(a7.resolve(cVar), new Callable() { // from class: io.sentry.f6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.g6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static p6 B(final h1 h1Var, final i5 i5Var) {
        io.sentry.util.v.c(h1Var, "ISerializer is required.");
        io.sentry.util.v.c(i5Var, "SentryEvent is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.a6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.o(h1Var, i5Var);
            }
        });
        return new p6(new q6(a7.resolve(i5Var), new Callable() { // from class: io.sentry.b6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.d6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static p6 C(final h1 h1Var, final f7 f7Var) {
        io.sentry.util.v.c(h1Var, "ISerializer is required.");
        io.sentry.util.v.c(f7Var, "SentryLogEvents is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.o6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.t(h1Var, f7Var);
            }
        });
        return new p6(new q6(a7.Log, (Callable<Integer>) new Callable() { // from class: io.sentry.s5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(f7Var.a().size())), (Callable<byte[]>) new Callable() { // from class: io.sentry.t5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static p6 D(final s3 s3Var, final h1 h1Var) {
        final File fileO = s3Var.o();
        final a aVar = new a(new Callable() { // from class: io.sentry.l6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.m(fileO, s3Var, h1Var);
            }
        });
        return new p6(new q6(a7.ProfileChunk, (Callable<Integer>) new Callable() { // from class: io.sentry.m6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application-json", fileO.getName(), (String) null, s3Var.n(), (Integer) null), (Callable<byte[]>) new Callable() { // from class: io.sentry.n6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static p6 E(final w3 w3Var, final long j15, final h1 h1Var) {
        final File fileC = w3Var.C();
        final a aVar = new a(new Callable() { // from class: io.sentry.x5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.p(fileC, j15, w3Var, h1Var);
            }
        });
        return new p6(new q6(a7.Profile, new Callable() { // from class: io.sentry.y5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application-json", fileC.getName()), (Callable<byte[]>) new Callable() { // from class: io.sentry.z5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static p6 F(final h1 h1Var, final v0 v0Var, final r7 r7Var, final b4 b4Var, final boolean z15) {
        final File fileH0 = r7Var.h0();
        final a aVar = new a(new Callable() { // from class: io.sentry.r5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.c(h1Var, r7Var, b4Var, fileH0, v0Var, z15);
            }
        });
        return new p6(new q6(a7.ReplayVideo, new Callable() { // from class: io.sentry.c6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, null, null), (Callable<byte[]>) new Callable() { // from class: io.sentry.h6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static p6 G(final h1 h1Var, final i8 i8Var) {
        io.sentry.util.v.c(h1Var, "ISerializer is required.");
        io.sentry.util.v.c(i8Var, "Session is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.i6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.u(h1Var, i8Var);
            }
        });
        return new p6(new q6(a7.Session, new Callable() { // from class: io.sentry.j6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.k6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    private static byte[] L(Map<String, byte[]> map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                byte[] bytes = entry.getKey().getBytes(f95299d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] value = entry.getValue();
                int length2 = value.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(value);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static /* synthetic */ byte[] c(h1 h1Var, r7 r7Var, b4 b4Var, File file, v0 v0Var, boolean z15) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f95299d));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    h1Var.a(r7Var, bufferedWriter);
                    linkedHashMap.put(a7.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (b4Var != null) {
                        h1Var.a(b4Var, bufferedWriter);
                        linkedHashMap.put(a7.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bArrB = io.sentry.util.h.b(file.getPath(), 10485760L);
                        if (bArrB.length > 0) {
                            linkedHashMap.put(a7.ReplayVideo.getItemType(), bArrB);
                        }
                    }
                    byte[] bArrL = L(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z15) {
                            io.sentry.util.h.a(file.getParentFile());
                            return bArrL;
                        }
                        file.delete();
                    }
                    return bArrL;
                } catch (Throwable th4) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (Throwable th8) {
            try {
                v0Var.b(b7.ERROR, "Could not serialize replay recording", th8);
                return null;
            } finally {
                if (file != null) {
                    if (z15) {
                        io.sentry.util.h.a(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    public static /* synthetic */ byte[] d(h1 h1Var, io.sentry.clientreport.c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f95299d));
            try {
                h1Var.a(cVar, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th4) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    public static /* synthetic */ byte[] m(File file, s3 s3Var, h1 h1Var) throws io.sentry.exception.b {
        if (!file.exists()) {
            throw new io.sentry.exception.b(String.format("Dropping profile chunk, because the file '%s' doesn't exists", file.getName()));
        }
        String strC = io.sentry.vendor.a.c(io.sentry.util.h.b(file.getPath(), 52428800L), 3);
        if (strC.isEmpty()) {
            throw new io.sentry.exception.b("Profiling trace file is empty");
        }
        s3Var.q(strC);
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f95299d));
                    try {
                        h1Var.a(s3Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (Throwable th4) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                file.delete();
                throw th8;
            }
        } catch (IOException e15) {
            throw new io.sentry.exception.b(String.format("Failed to serialize profile chunk\n%s", e15.getMessage()));
        }
    }

    public static /* synthetic */ byte[] o(h1 h1Var, i5 i5Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f95299d));
            try {
                h1Var.a(i5Var, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th4) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    public static /* synthetic */ byte[] p(File file, long j15, w3 w3Var, h1 h1Var) throws io.sentry.exception.b {
        if (!file.exists()) {
            throw new io.sentry.exception.b(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String strC = io.sentry.vendor.a.c(io.sentry.util.h.b(file.getPath(), j15), 3);
        if (strC.isEmpty()) {
            throw new io.sentry.exception.b("Profiling trace file is empty");
        }
        w3Var.F(strC);
        w3Var.E();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f95299d));
                    try {
                        h1Var.a(w3Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (Throwable th4) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                file.delete();
                throw th8;
            }
        } catch (IOException e15) {
            throw new io.sentry.exception.b(String.format("Failed to serialize profiling trace data\n%s", e15.getMessage()));
        }
    }

    public static /* synthetic */ byte[] t(h1 h1Var, f7 f7Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f95299d));
            try {
                h1Var.a(f7Var, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th4) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    public static /* synthetic */ byte[] u(h1 h1Var, i8 i8Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f95299d));
            try {
                h1Var.a(i8Var, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th4) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    public static /* synthetic */ byte[] x(b bVar, long j15, h1 h1Var, v0 v0Var) throws io.sentry.exception.b {
        byte[] bArrCall;
        if (bVar.f() != null) {
            byte[] bArrF = bVar.f();
            y(bArrF.length, j15, bVar.h());
            return bArrF;
        }
        if (bVar.j() != null) {
            byte[] bArrB = io.sentry.util.q.b(h1Var, v0Var, bVar.j());
            if (bArrB != null) {
                y(bArrB.length, j15, bVar.h());
                return bArrB;
            }
        } else {
            if (bVar.i() != null) {
                return io.sentry.util.h.b(bVar.i(), j15);
            }
            if (bVar.e() != null && (bArrCall = bVar.e().call()) != null) {
                y(bArrCall.length, j15, bVar.h());
                return bArrCall;
            }
        }
        throw new io.sentry.exception.b(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable, path or provider is set.", bVar.h()));
    }

    private static void y(long j15, long j16, String str) throws io.sentry.exception.b {
        if (j15 > j16) {
            throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j15), Long.valueOf(j16)));
        }
    }

    public static p6 z(final h1 h1Var, final v0 v0Var, final b bVar, final long j15) {
        final a aVar = new a(new Callable() { // from class: io.sentry.u5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.x(bVar, j15, h1Var, v0Var);
            }
        });
        return new p6(new q6(a7.Attachment, new Callable() { // from class: io.sentry.v5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, bVar.g(), bVar.h(), bVar.d()), (Callable<byte[]>) new Callable() { // from class: io.sentry.w5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public io.sentry.clientreport.c H(h1 h1Var) throws IOException {
        q6 q6Var = this.f95300a;
        if (q6Var == null || q6Var.b() != a7.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(I()), f95299d));
        try {
            io.sentry.clientreport.c cVar = (io.sentry.clientreport.c) h1Var.c(bufferedReader, io.sentry.clientreport.c.class);
            bufferedReader.close();
            return cVar;
        } catch (Throwable th4) {
            try {
                bufferedReader.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public byte[] I() {
        Callable<byte[]> callable;
        if (this.f95302c == null && (callable = this.f95301b) != null) {
            this.f95302c = callable.call();
        }
        return this.f95302c;
    }

    public q6 J() {
        return this.f95300a;
    }

    public io.sentry.protocol.c0 K(h1 h1Var) throws IOException {
        q6 q6Var = this.f95300a;
        if (q6Var == null || q6Var.b() != a7.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(I()), f95299d));
        try {
            io.sentry.protocol.c0 c0Var = (io.sentry.protocol.c0) h1Var.c(bufferedReader, io.sentry.protocol.c0.class);
            bufferedReader.close();
            return c0Var;
        } catch (Throwable th4) {
            try {
                bufferedReader.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    p6(q6 q6Var, Callable<byte[]> callable) {
        this.f95300a = (q6) io.sentry.util.v.c(q6Var, "SentryEnvelopeItemHeader is required.");
        this.f95301b = (Callable) io.sentry.util.v.c(callable, "DataFactory is required.");
        this.f95302c = null;
    }
}
