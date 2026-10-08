package o;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface v1 extends Closeable {

    public static abstract class a {
        public static a f(Size size, Rect rect, v.n0 n0Var, int i15, boolean z15) {
            return new e(size, rect, n0Var, i15, z15);
        }

        public abstract v.n0 a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    public static abstract class b {
        b() {
        }

        public static b c(int i15, v1 v1Var) {
            return new f(i15, v1Var);
        }

        public abstract int a();

        public abstract v1 b();
    }

    default void F0(float[] fArr, float[] fArr2, boolean z15) {
    }

    Surface V2(Executor executor, i6.a<b> aVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    default int getFormat() {
        return 34;
    }

    Size getSize();

    void w2(float[] fArr, float[] fArr2);
}
