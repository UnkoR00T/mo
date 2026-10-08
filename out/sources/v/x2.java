package v;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface x2<T> {

    public interface a<T> {
        void a(T t15);

        void onError(Throwable th4);
    }

    void a(Executor executor, a<? super T> aVar);

    com.google.common.util.concurrent.q<T> b();

    void c(a<? super T> aVar);
}
