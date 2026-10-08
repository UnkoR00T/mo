package p056h1;

import fr.t;
import p036e4.t2;
import p071kotlin.Metadata;
import r0.p0;
import r0.r0;
import r0.z0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lh1/q0;", "Le4/t2;", "Lh1/k0;", "factory", "<init>", "(Lh1/k0;)V", "Le4/t2$a;", "slotIds", "Loq/i0;", "a", "(Le4/t2$a;)V", "", "slotId", "reusableSlotId", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lh1/k0;", "Lr0/p0;", "Lr0/p0;", "countPerType", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q0 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k0 factory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0<Object> countPerType = z0.b();

    public q0(k0 k0Var) {
        this.factory = k0Var;
    }

    @Override // p036e4.t2
    public void a(t2.a slotIds) {
        this.countPerType.j();
        r0<Object> r0VarF = slotIds.f();
        Object[] objArr = r0VarF.elements;
        long[] jArr = r0VarF.nodes;
        int i15 = r0VarF.tail;
        while (i15 != Integer.MAX_VALUE) {
            int i16 = (int) ((jArr[i15] >> 31) & 2147483647L);
            Object obj = objArr[i15];
            Object objC = this.factory.c(obj);
            int iE = this.countPerType.e(objC, 0);
            if (iE == 7) {
                slotIds.remove(obj);
            } else {
                this.countPerType.u(objC, iE + 1);
            }
            i15 = i16;
        }
    }

    @Override // p036e4.t2
    public boolean b(Object slotId, Object reusableSlotId) {
        return t.c(this.factory.c(slotId), this.factory.c(reusableSlotId));
    }
}
