package lu;

import ju.n0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Llu/v;", "E", "Llu/h;", "Llu/w;", "Ltq/i;", "parentContext", "Llu/g;", "channel", "<init>", "(Ltq/i;Llu/g;)V", "Loq/i0;", "value", "r1", "(Loq/i0;)V", "", "cause", "", "handled", "l1", "(Ljava/lang/Throwable;Z)V", "h", "()Z", "isActive", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class v<E> extends h<E> implements w<E> {
    public v(tq.i iVar, g<E> gVar) {
        super(iVar, gVar, true, true);
    }

    @Override // lu.w
    public /* bridge */ /* synthetic */ z H() {
        return p1();
    }

    @Override // ju.a, ju.j2, ju.d2
    public boolean h() {
        return super.h();
    }

    @Override // ju.a
    protected void l1(Throwable cause, boolean handled) {
        if (q1().n(cause) || handled) {
            return;
        }
        n0.a(getContext(), cause);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ju.a
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public void m1(i0 value) {
        z.a.a(q1(), null, 1, null);
    }
}
