package r2;

import e3.ComposeStackTraceFrame;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr2/b0;", "", "Le3/d;", "a", "(Lr2/b0;)Ljava/util/List;", "", "group", "", "child", "b", "(Lr2/b0;ILjava/lang/Object;)Ljava/util/List;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0 {
    public static final List<ComposeStackTraceFrame> a(b0 b0Var) {
        return (b0Var.getIsClosed() || b0Var.M()) ? pq.v.n() : p.f(b0Var.getTable().getAddressSpace(), b0Var.getParent(), Integer.valueOf(b0Var.C()), new l(b0Var));
    }

    public static final List<ComposeStackTraceFrame> b(b0 b0Var, int i15, Object obj) {
        l lVar = new l(b0Var);
        q addressSpace = b0Var.getTable().getAddressSpace();
        int[] groups = addressSpace.getGroups();
        int i16 = i15;
        while (i16 > 0) {
            lVar.f(b0Var.F(i16), b0Var.H(i16), addressSpace.F(i16), obj);
            obj = addressSpace.d(i16);
            i16 = groups[i16 + 2];
        }
        if (!(i16 != 0)) {
            p076m2.t.b("Traversing parent of group not in the slot table: " + i15);
        }
        return lVar.i();
    }
}
