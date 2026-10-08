package ek;

import java.io.Serializable;
import java.util.Arrays;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f f51757d = new f(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f51758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f51759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51760c;

    private f(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static f a(int[] iArr) {
        return iArr.length == 0 ? f51757d : new f(Arrays.copyOf(iArr, iArr.length));
    }

    public static f e() {
        return f51757d;
    }

    public int b(int i15) {
        p.o(i15, d());
        return this.f51758a[this.f51759b + i15];
    }

    public boolean c() {
        return this.f51760c == this.f51759b;
    }

    public int d() {
        return this.f51760c - this.f51759b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (d() != fVar.d()) {
            return false;
        }
        for (int i15 = 0; i15 < d(); i15++) {
            if (b(i15) != fVar.b(i15)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iJ = 1;
        for (int i15 = this.f51759b; i15 < this.f51760c; i15++) {
            iJ = (iJ * 31) + g.j(this.f51758a[i15]);
        }
        return iJ;
    }

    public String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb5 = new StringBuilder(d() * 5);
        sb5.append('[');
        sb5.append(this.f51758a[this.f51759b]);
        int i15 = this.f51759b;
        while (true) {
            i15++;
            if (i15 >= this.f51760c) {
                sb5.append(']');
                return sb5.toString();
            }
            sb5.append(", ");
            sb5.append(this.f51758a[i15]);
        }
    }

    private f(int[] iArr, int i15, int i16) {
        this.f51758a = iArr;
        this.f51759b = i15;
        this.f51760c = i16;
    }
}
