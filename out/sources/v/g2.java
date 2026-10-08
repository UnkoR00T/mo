package v;

import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface g2 {

    public interface a {
        void a(g2 g2Var);
    }

    int a();

    androidx.camera.core.o c();

    void close();

    int d();

    void e();

    void f(a aVar, Executor executor);

    androidx.camera.core.o g();

    int getHeight();

    Surface getSurface();

    int l();
}
