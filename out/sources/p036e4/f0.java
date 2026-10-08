package p036e4;

import f3.m;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf3/m;", "", "layoutId", "b", "(Lf3/m;Ljava/lang/Object;)Lf3/m;", "Le4/v0;", "a", "(Le4/v0;)Ljava/lang/Object;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f0 {
    public static final Object a(v0 v0Var) {
        Object objE = v0Var.e();
        h0 h0Var = objE instanceof h0 ? (h0) objE : null;
        if (h0Var != null) {
            return h0Var.J1();
        }
        return null;
    }

    public static final m b(m mVar, Object obj) {
        return mVar.u(new LayoutIdElement(obj));
    }
}
