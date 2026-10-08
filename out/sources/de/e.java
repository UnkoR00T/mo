package de;

import android.util.Log;
import io.sentry.android.core.c2;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f41099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f41100c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private xd.a f41102e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f41101d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f41098a = new j();

    @Deprecated
    protected e(File file, long j15) {
        this.f41099b = file;
        this.f41100c = j15;
    }

    public static a c(File file, long j15) {
        return new e(file, j15);
    }

    private synchronized xd.a d() {
        try {
            if (this.f41102e == null) {
                this.f41102e = xd.a.Z(this.f41099b, 1, 1, this.f41100c);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f41102e;
    }

    @Override // de.a
    public File a(zd.f fVar) {
        String strB = this.f41098a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(fVar);
        }
        try {
            xd.a.e eVarO = d().O(strB);
            if (eVarO != null) {
                return eVarO.a(0);
            }
            return null;
        } catch (IOException e15) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            c2.h("DiskLruCacheWrapper", "Unable to get from disk cache", e15);
            return null;
        }
    }

    @Override // de.a
    public void b(zd.f fVar, a.b bVar) {
        String strB = this.f41098a.b(fVar);
        this.f41101d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(fVar);
            }
            try {
                xd.a aVarD = d();
                if (aVarD.O(strB) == null) {
                    xd.a.c cVarL = aVarD.L(strB);
                    if (cVarL == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                    }
                    try {
                        if (bVar.a(cVarL.f(0))) {
                            cVarL.e();
                        }
                        cVarL.b();
                    } catch (Throwable th4) {
                        cVarL.b();
                        throw th4;
                    }
                }
            } catch (IOException e15) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    c2.h("DiskLruCacheWrapper", "Unable to put to disk cache", e15);
                }
            }
            this.f41101d.b(strB);
        } catch (Throwable th5) {
            this.f41101d.b(strB);
            throw th5;
        }
    }
}
