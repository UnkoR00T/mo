package l;

import h.z0;
import java.util.Collection;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a)\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00018\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u00020\u0003*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u0003*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u0003*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a\u0015\u0010\f\u001a\u00020\u0003*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\f\u0010\b\u001a\u0015\u0010\r\u001a\u00020\u0003*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"T", "", "collection", "", "b", "(Ljava/lang/Object;Ljava/util/Collection;)Z", "Lh/z0;", "c", "(Lh/z0;)Z", "d", "e", "f", "h", "g", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean b(T t15, Collection<? extends T> collection) {
        if (t15 != null) {
            return collection.contains(t15);
        }
        return true;
    }

    public static final boolean c(z0 z0Var) {
        int iB = z0.INSTANCE.b();
        if (z0Var == null) {
            return false;
        }
        return z0.g(z0Var.getValue(), iB);
    }

    public static final boolean d(z0 z0Var) {
        int iB = z0.INSTANCE.b();
        if (z0Var == null) {
            return false;
        }
        return z0.g(z0Var.getValue(), iB);
    }

    public static final boolean e(z0 z0Var) {
        int iB = z0.INSTANCE.b();
        if (z0Var == null) {
            return false;
        }
        return z0.g(z0Var.getValue(), iB);
    }

    public static final boolean f(z0 z0Var) {
        if (z0Var != null) {
            return !z0.g(z0Var.getValue(), z0.INSTANCE.c());
        }
        return false;
    }

    public static final boolean g(z0 z0Var) {
        if (z0Var != null) {
            return !z0.g(z0Var.getValue(), z0.INSTANCE.c());
        }
        return false;
    }

    public static final boolean h(z0 z0Var) {
        if (z0Var != null) {
            return !z0.g(z0Var.getValue(), z0.INSTANCE.c());
        }
        return false;
    }
}
