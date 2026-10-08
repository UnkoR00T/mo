package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile r4 f29650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile j2 f29651b;

    public final int a() {
        if (this.f29651b != null) {
            return ((i2) this.f29651b).f29735c.length;
        }
        if (this.f29650a != null) {
            return this.f29650a.u();
        }
        return 0;
    }

    public final j2 b() {
        if (this.f29651b != null) {
            return this.f29651b;
        }
        synchronized (this) {
            try {
                if (this.f29651b != null) {
                    return this.f29651b;
                }
                if (this.f29650a == null) {
                    this.f29651b = j2.f29738b;
                } else {
                    this.f29651b = this.f29650a.x();
                }
                return this.f29651b;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final r4 c(r4 r4Var) {
        r4 r4Var2 = this.f29650a;
        this.f29651b = null;
        this.f29650a = r4Var;
        return r4Var2;
    }
}
