package p076m2;

import p071kotlin.Metadata;
import y2.q;
import y2.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lm2/v3;", "Lm2/z;", "key", "", "a", "(Lm2/v3;Lm2/z;)Z", "b", "(Lm2/v3;Lm2/z;)Ljava/lang/Object;", "", "Lm2/c4;", "values", "parentScope", "previous", "c", "([Lm2/c4;Lm2/v3;Lm2/v3;)Lm2/v3;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f0 {
    public static final <T> boolean a(v3 v3Var, z<T> zVar) {
        return v3Var.containsKey(zVar);
    }

    public static final <T> T b(v3 v3Var, z<T> zVar) {
        o6<T> o6VarA = (o6<T>) v3Var.get(zVar);
        if (o6VarA == null) {
            o6VarA = zVar.a();
        }
        return (T) o6VarA.a(v3Var);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [m2.v3] */
    public static final v3 c(c4<?>[] c4VarArr, v3 v3Var, v3 v3Var2) {
        q.a aVarU = r.a().builder();
        for (c4<?> c4Var : c4VarArr) {
            b4 b4Var = (b4) c4Var.b();
            if (c4Var.getCanOverride() || !a(v3Var, b4Var)) {
                aVarU.put(b4Var, b4Var.b(c4Var, (o6) v3Var2.get(b4Var)));
            }
        }
        return aVarU.build2();
    }

    public static /* synthetic */ v3 d(c4[] c4VarArr, v3 v3Var, v3 v3Var2, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            v3Var2 = r.a();
        }
        return c(c4VarArr, v3Var, v3Var2);
    }
}
