package p047f5;

import p036e4.f0;
import p036e4.v0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Le4/v0;", "", "a", "(Le4/v0;)Ljava/lang/String;", "anyOrNullId", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b0 {
    public static final String a(v0 v0Var) {
        String string;
        Object objA = f0.a(v0Var);
        if (objA == null) {
            objA = m.a(v0Var);
        }
        return (objA == null || (string = objA.toString()) == null) ? "null" : string;
    }
}
