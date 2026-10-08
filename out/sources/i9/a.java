package i9;

import o8.p0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f90331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90332c;

    public a(int i15, long j15, int i16) {
        this.f90330a = i15;
        this.f90331b = j15;
        this.f90332c = i16;
    }

    public String toString() {
        return "AtomSizeTooSmall{type=" + o0.c1(this.f90330a) + ", size=" + this.f90331b + ", minHeaderSize=" + this.f90332c + "}";
    }
}
