package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f95210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f95211b;

    public n0(int i15, int i16) {
        this.f95210a = i15;
        this.f95211b = i16;
    }

    public boolean a(int i15) {
        return i15 >= this.f95210a && i15 <= this.f95211b;
    }
}
