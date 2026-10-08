package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public class sw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile jx f30630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile yu f30631b;

    public final int a() {
        if (this.f30631b != null) {
            return ((xu) this.f30631b).f30702c.length;
        }
        if (this.f30630a != null) {
            return this.f30630a.b();
        }
        return 0;
    }

    public final yu b() {
        if (this.f30631b != null) {
            return this.f30631b;
        }
        synchronized (this) {
            try {
                if (this.f30631b != null) {
                    return this.f30631b;
                }
                if (this.f30630a == null) {
                    this.f30631b = yu.f30716b;
                } else {
                    this.f30631b = this.f30630a.L();
                }
                return this.f30631b;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final jx c(jx jxVar) {
        jx jxVar2 = this.f30630a;
        this.f30631b = null;
        this.f30630a = jxVar;
        return jxVar2;
    }
}
