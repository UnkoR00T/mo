package zj;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m<T> implements Serializable {
    m() {
    }

    public static <T> m<T> a() {
        return a.e();
    }

    public static <T> m<T> c(T t15) {
        return new s(p.q(t15));
    }

    public abstract boolean b();

    public abstract T d(T t15);
}
