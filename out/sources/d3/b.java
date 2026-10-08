package d3;

import c3.l;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Ld3/b;", "", "Lc3/l;", "parent", "", "readonly", "Ld3/a;", "a", "(Lc3/l;Z)Ld3/a;", "snapshot", "observers", "Loq/i0;", "b", "(Lc3/l;Lc3/l;Ld3/a;)V", "d", "(Lc3/l;)V", "", "changed", "c", "(Lc3/l;Ljava/util/Set;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {
    default a a(l parent, boolean readonly) {
        return null;
    }

    default void b(l snapshot, l parent, a observers) {
    }

    default void c(l snapshot, Set<? extends Object> changed) {
    }

    default void d(l snapshot) {
    }
}
