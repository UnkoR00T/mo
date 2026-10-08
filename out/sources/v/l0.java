package v;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface l0 extends p0 {

    public interface a {
        List<String> d(List<String> list);
    }

    public interface b {
        @SuppressLint({"LambdaLast"})
        l0 a(Context context, i1 i1Var, o.s sVar, long j15, o.e0 e0Var, b0.m mVar);
    }

    n0 a(String str);

    x2<List<o.p>> b();

    Set<String> c();

    Object f();

    p.a g();

    default void shutdown() {
    }
}
