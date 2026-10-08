package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class sm0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final qm0 f33697h = new qm0(nm0.f33069a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nm0 f33698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f33700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f33701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f33702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ig0 f33703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile long f33704g;

    public sm0() {
        this.f33703f = jg0.a();
        this.f33698a = nm0.f33069a;
    }

    public static qm0 e() {
        return f33697h;
    }

    public final void a() {
        this.f33699b++;
        this.f33698a.zza();
    }

    public final void b(boolean z15) {
        if (z15) {
            this.f33700c++;
        } else {
            this.f33701d++;
        }
    }

    public final void c(int i15) {
        if (i15 == 0) {
            return;
        }
        this.f33702e += (long) i15;
        this.f33698a.zza();
    }

    public final void d() {
        this.f33703f.a(1L);
        this.f33704g = this.f33698a.zza();
    }

    /* synthetic */ sm0(nm0 nm0Var, byte[] bArr) {
        this.f33703f = jg0.a();
        this.f33698a = nm0Var;
    }
}
