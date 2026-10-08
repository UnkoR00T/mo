package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c1 f95834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f95835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f95836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue<String> f95837d;

    private static final class a implements io.sentry.hints.e, io.sentry.hints.k, io.sentry.hints.p, io.sentry.hints.i, io.sentry.hints.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f95838a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f95839b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CountDownLatch f95840c = new CountDownLatch(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f95841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final v0 f95842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f95843f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Queue<String> f95844g;

        public a(long j15, v0 v0Var, String str, Queue<String> queue) {
            this.f95841d = j15;
            this.f95843f = str;
            this.f95844g = queue;
            this.f95842e = v0Var;
        }

        @Override // io.sentry.hints.k
        public boolean a() {
            return this.f95838a;
        }

        @Override // io.sentry.hints.g
        public void b() {
            this.f95844g.add(this.f95843f);
        }

        @Override // io.sentry.hints.p
        public void c(boolean z15) {
            this.f95839b = z15;
            this.f95840c.countDown();
        }

        @Override // io.sentry.hints.k
        public void d(boolean z15) {
            this.f95838a = z15;
        }

        @Override // io.sentry.hints.p
        public boolean e() {
            return this.f95839b;
        }

        @Override // io.sentry.hints.i
        public boolean g() {
            try {
                return this.f95840c.await(this.f95841d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e15) {
                Thread.currentThread().interrupt();
                this.f95842e.b(b7.ERROR, "Exception while awaiting on lock.", e15);
                return false;
            }
        }
    }

    v(c1 c1Var, v0 v0Var, long j15, int i15) {
        this.f95834a = c1Var;
        this.f95835b = v0Var;
        this.f95836c = j15;
        this.f95837d = x8.g(new g(i15));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c(String str);

    public void d(File file) {
        try {
            v0 v0Var = this.f95835b;
            b7 b7Var = b7.DEBUG;
            v0Var.c(b7Var, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                this.f95835b.c(b7.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
                return;
            }
            if (!file.isDirectory()) {
                this.f95835b.c(b7.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                this.f95835b.c(b7.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles2 = file.listFiles(new FilenameFilter() { // from class: io.sentry.u
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return this.f95786a.c(str);
                }
            });
            this.f95835b.c(b7Var, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles2 != null ? fileArrListFiles2.length : 0), file.getAbsolutePath());
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    if (this.f95837d.contains(absolutePath)) {
                        this.f95835b.c(b7.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                    } else {
                        io.sentry.transport.a0 a0VarF = this.f95834a.F();
                        if (a0VarF != null && a0VarF.E(l.All)) {
                            this.f95835b.c(b7.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                            return;
                        } else {
                            this.f95835b.c(b7.DEBUG, "Processing file: %s", absolutePath);
                            e(file2, io.sentry.util.m.e(new a(this.f95836c, this.f95835b, absolutePath, this.f95837d)));
                            Thread.sleep(100L);
                        }
                    }
                } else {
                    this.f95835b.c(b7.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th4) {
            this.f95835b.a(b7.ERROR, th4, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    protected abstract void e(File file, j0 j0Var);
}
