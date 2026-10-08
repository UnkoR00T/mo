package mu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "value", "Lmu/b0;", "a", "(Ljava/lang/Object;)Lmu/b0;", "Lmu/p0;", "Ltq/i;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "Lmu/g;", "d", "(Lmu/p0;Ltq/i;ILlu/a;)Lmu/g;", "Lou/e0;", "Lou/e0;", "NONE", "b", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ou.e0 f128314a = new ou.e0("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ou.e0 f128315b = new ou.e0("PENDING");

    public static final <T> b0<T> a(T t15) {
        if (t15 == null) {
            t15 = (T) p086nu.u.f138790a;
        }
        return new q0(t15);
    }

    public static final <T> g<T> d(p0<? extends T> p0Var, tq.i iVar, int i15, lu.a aVar) {
        return (((i15 < 0 || i15 >= 2) && i15 != -2) || aVar != lu.a.DROP_OLDEST) ? h0.e(p0Var, iVar, i15, aVar) : p0Var;
    }
}
