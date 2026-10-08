package p076m2;

import c3.SnapshotStateList;
import c3.SnapshotStateMap;
import java.util.Collection;
import p071kotlin.Metadata;
import pq.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "value", "Lm2/w5;", "policy", "Lm2/a3;", "d", "(Ljava/lang/Object;Lm2/w5;)Lm2/a3;", "Lc3/f0;", "a", "()Lc3/f0;", "", "elements", "b", "([Ljava/lang/Object;)Lc3/f0;", "", "g", "(Ljava/util/Collection;)Lc3/f0;", "K", "V", "Lc3/h0;", "c", "()Lc3/h0;", "newValue", "Lm2/f6;", "f", "(Ljava/lang/Object;Lm2/r;I)Lm2/f6;", "runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class c6 {
    public static final <T> SnapshotStateList<T> a() {
        return new SnapshotStateList<>();
    }

    public static final <T> SnapshotStateList<T> b(T... tArr) {
        SnapshotStateList<T> f0Var = new SnapshotStateList<>();
        f0Var.addAll(n.n1(tArr));
        return f0Var;
    }

    public static final <K, V> SnapshotStateMap<K, V> c() {
        return new SnapshotStateMap<>();
    }

    public static final <T> a3<T> d(T t15, w5<T> w5Var) {
        return d6.a(t15, w5Var);
    }

    public static /* synthetic */ a3 e(Object obj, w5 w5Var, int i15, Object obj2) {
        if ((i15 & 2) != 0) {
            w5Var = x5.r();
        }
        return x5.i(obj, w5Var);
    }

    public static final <T> f6<T> f(T t15, r rVar, int i15) {
        if (t.k()) {
            t.o(-1058319986, i15, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:340)");
        }
        Object objE = rVar.E();
        if (objE == r.INSTANCE.a()) {
            objE = e(t15, null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var = (a3) objE;
        a3Var.setValue(t15);
        if (t.k()) {
            t.n();
        }
        return a3Var;
    }

    public static final <T> SnapshotStateList<T> g(Collection<? extends T> collection) {
        SnapshotStateList<T> f0Var = new SnapshotStateList<>();
        f0Var.addAll(collection);
        return f0Var;
    }
}
