package p076m2;

import c3.b;
import c3.b0;
import c3.l;
import c3.r;
import c3.v0;
import c3.w;
import c3.w0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: m2.v5, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001%B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR*\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lm2/v5;", "T", "Lc3/v0;", "Lc3/b0;", "value", "Lm2/w5;", "policy", "<init>", "(Ljava/lang/Object;Lm2/w5;)V", "Lc3/w0;", "Loq/i0;", "l", "(Lc3/w0;)V", "previous", "current", "applied", "t", "(Lc3/w0;Lc3/w0;Lc3/w0;)Lc3/w0;", "", "toString", "()Ljava/lang/String;", "b", "Lm2/w5;", "c", "()Lm2/w5;", "Lm2/v5$a;", "Lm2/v5$a;", "next", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "k", "()Lc3/w0;", "firstStateRecord", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MutableState<T> extends v0 implements b0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w5<T> policy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a<T> next;

    /* JADX INFO: renamed from: m2.v5$a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\t\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lm2/v5$a;", "T", "Lc3/w0;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "myValue", "<init>", "(JLjava/lang/Object;)V", "value", "Loq/i0;", "c", "(Lc3/w0;)V", "j", "()Lm2/v5$a;", "k", "(J)Lm2/v5$a;", "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "m", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a<T> extends w0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private T value;

        public a(long j15, T t15) {
            super(j15);
            this.value = t15;
        }

        @Override // c3.w0
        public void c(w0 value) {
            this.value = ((a) value).value;
        }

        @Override // c3.w0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<T> d() {
            return new a<>(w.K().getSnapshotId(), this.value);
        }

        @Override // c3.w0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<T> e(long snapshotId) {
            return new a<>(w.K().getSnapshotId(), this.value);
        }

        public final T l() {
            return this.value;
        }

        public final void m(T t15) {
            this.value = t15;
        }
    }

    public MutableState(T t15, w5<T> w5Var) {
        this.policy = w5Var;
        l lVarK = w.K();
        a<T> aVar = new a<>(lVarK.getSnapshotId(), t15);
        if (!(lVarK instanceof b)) {
            aVar.h(new a(r.c(1), t15));
        }
        this.next = aVar;
    }

    @Override // c3.b0
    public w5<T> c() {
        return this.policy;
    }

    @Override // p076m2.a3, p076m2.f6
    public T getValue() {
        return (T) ((a) w.c0(this.next, this)).l();
    }

    @Override // c3.u0
    /* JADX INFO: renamed from: k */
    public w0 getFirstStateRecord() {
        return this.next;
    }

    @Override // c3.u0
    public void l(w0 value) {
        this.next = (a) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p076m2.a3
    public void setValue(T t15) {
        l lVarC;
        a aVar = (a) w.I(this.next);
        if (c().b(aVar.l(), t15)) {
            return;
        }
        a<T> aVar2 = this.next;
        synchronized (w.M()) {
            lVarC = l.INSTANCE.c();
            ((a) w.X(aVar2, this, lVarC, aVar)).m(t15);
            i0 i0Var = i0.f148189a;
        }
        w.V(lVarC, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c3.u0
    public w0 t(w0 previous, w0 current, w0 applied) {
        a aVar = (a) previous;
        a aVar2 = (a) current;
        a aVar3 = (a) applied;
        if (c().b(aVar2.l(), aVar3.l())) {
            return current;
        }
        Object objA = c().a(aVar.l(), aVar2.l(), aVar3.l());
        if (objA == null) {
            return null;
        }
        a aVarE = aVar3.e(aVar3.getSnapshotId());
        aVarE.m(objA);
        return aVarE;
    }

    public String toString() {
        return "MutableState(value=" + ((a) w.I(this.next)).l() + ")@" + hashCode();
    }
}
