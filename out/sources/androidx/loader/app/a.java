package androidx.loader.app;

import android.os.Bundle;
import androidx.p016lifecycle.q;
import androidx.p016lifecycle.y0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0272a<D> {
        void b(s7.b<D> bVar);

        void e(s7.b<D> bVar, D d15);

        s7.b<D> f(int i15, Bundle bundle);
    }

    public static <T extends q & y0> a c(T t15) {
        return new b(t15, t15.h());
    }

    public abstract void a(int i15);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> s7.b<D> d(int i15, Bundle bundle, InterfaceC0272a<D> interfaceC0272a);

    public abstract void e();
}
