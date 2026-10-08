package net.zetetic.database.sqlcipher;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SQLiteClosable implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f135376a = 1;

    public void b() {
        synchronized (this) {
            try {
                int i15 = this.f135376a;
                if (i15 <= 0) {
                    throw new IllegalStateException("attempt to re-open an already-closed object: " + this);
                }
                this.f135376a = i15 + 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m();
    }

    protected abstract void h();

    public void m() {
        boolean z15;
        synchronized (this) {
            z15 = true;
            int i15 = this.f135376a - 1;
            this.f135376a = i15;
            if (i15 != 0) {
                z15 = false;
            }
        }
        if (z15) {
            h();
        }
    }
}
