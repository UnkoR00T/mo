package mu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\r\u001a\u0004\u0018\u00010\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00020\u0010*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u001a8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001d"}, d2 = {"T", "", "replay", "extraBufferCapacity", "Llu/a;", "onBufferOverflow", "Lmu/a0;", "a", "(IILlu/a;)Lmu/a0;", "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "Loq/i0;", "g", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lmu/f0;", "Ltq/i;", "context", "capacity", "Lmu/g;", "e", "(Lmu/f0;Ltq/i;ILlu/a;)Lmu/g;", "Lou/e0;", "Lou/e0;", "NO_VALUE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ou.e0 f128206a = new ou.e0("NO_VALUE");

    public static final <T> a0<T> a(int i15, int i16, lu.a aVar) {
        if (i15 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i15).toString());
        }
        if (i16 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i16).toString());
        }
        if (i15 > 0 || i16 > 0 || aVar == lu.a.SUSPEND) {
            int i17 = i16 + i15;
            if (i17 < 0) {
                i17 = Integer.MAX_VALUE;
            }
            return new g0(i15, i17, aVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
    }

    public static /* synthetic */ a0 b(int i15, int i16, lu.a aVar, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i15 = 0;
        }
        if ((i17 & 2) != 0) {
            i16 = 0;
        }
        if ((i17 & 4) != 0) {
            aVar = lu.a.SUSPEND;
        }
        return a(i15, i16, aVar);
    }

    public static final <T> g<T> e(f0<? extends T> f0Var, tq.i iVar, int i15, lu.a aVar) {
        return ((i15 == 0 || i15 == -3) && aVar == lu.a.SUSPEND) ? f0Var : new p086nu.i(f0Var, iVar, i15, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j15) {
        return objArr[((int) j15) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Object[] objArr, long j15, Object obj) {
        objArr[((int) j15) & (objArr.length - 1)] = obj;
    }
}
