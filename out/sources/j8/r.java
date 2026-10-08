package j8;

import h8.c0;
import t7.e0;
import t7.f0;

/* JADX INFO: loaded from: classes3.dex */
public interface r extends v {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f100135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f100136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f100137c;

        public a(f0 f0Var, int... iArr) {
            this(f0Var, iArr, 0);
        }

        public a(f0 f0Var, int[] iArr, int i15) {
            if (iArr.length == 0) {
                w7.t.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f100135a = f0Var;
            this.f100136b = iArr;
            this.f100137c = i15;
        }
    }

    public interface b {
        r[] a(a[] aVarArr, k8.d dVar, c0.b bVar, e0 e0Var);
    }

    void a();

    int b();

    void c();

    void f(float f15);

    default void g() {
    }

    default void j(boolean z15) {
    }

    int k();

    t7.p l();

    default void m() {
    }
}
