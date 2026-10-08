package i9;

import java.util.ArrayList;
import o8.p0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ek.f f90334b;

    public a0(int i15, int[] iArr) {
        this.f90333a = i15;
        this.f90334b = iArr != null ? ek.f.a(iArr) : ek.f.e();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(this.f90334b.d());
        for (int i15 = 0; i15 < this.f90334b.d(); i15++) {
            arrayList.add(o0.c1(this.f90334b.b(i15)));
        }
        return "UnsupportedBrands{major=" + o0.c1(this.f90333a) + ", compatible=" + arrayList + "}";
    }
}
