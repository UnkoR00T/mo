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

/* JADX INFO: renamed from: m2.t5, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001#B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0007R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lm2/t5;", "Lc3/v0;", "Lm2/y2;", "Lc3/b0;", "", "value", "<init>", "(I)V", "Lc3/w0;", "Loq/i0;", "l", "(Lc3/w0;)V", "previous", "current", "applied", "t", "(Lc3/w0;Lc3/w0;Lc3/w0;)Lc3/w0;", "", "toString", "()Ljava/lang/String;", "Lm2/t5$a;", "b", "Lm2/t5$a;", "next", "k", "()Lc3/w0;", "firstStateRecord", "d", "()I", "g", "intValue", "Lm2/w5;", "c", "()Lm2/w5;", "policy", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MutableIntState extends v0 implements y2, b0<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a next;

    /* JADX INFO: renamed from: m2.t5$a */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lm2/t5$a;", "Lc3/w0;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "", "value", "<init>", "(JI)V", "Loq/i0;", "c", "(Lc3/w0;)V", "d", "()Lc3/w0;", "e", "(J)Lc3/w0;", "I", "j", "()I", "k", "(I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a extends w0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int value;

        public a(long j15, int i15) {
            super(j15);
            this.value = i15;
        }

        @Override // c3.w0
        public void c(w0 value) {
            this.value = ((a) value).value;
        }

        @Override // c3.w0
        public w0 d() {
            return e(w.K().getSnapshotId());
        }

        @Override // c3.w0
        public w0 e(long snapshotId) {
            return new a(snapshotId, this.value);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final void k(int i15) {
            this.value = i15;
        }
    }

    public MutableIntState(int i15) {
        l lVarK = w.K();
        a aVar = new a(lVarK.getSnapshotId(), i15);
        if (!(lVarK instanceof b)) {
            aVar.h(new a(r.c(1), i15));
        }
        this.next = aVar;
    }

    @Override // c3.b0
    public w5<Integer> c() {
        return x5.r();
    }

    @Override // p076m2.y2, p076m2.p1
    public int d() {
        return ((a) w.c0(this.next, this)).getValue();
    }

    @Override // p076m2.y2
    public void g(int i15) {
        l lVarC;
        a aVar = (a) w.I(this.next);
        if (aVar.getValue() != i15) {
            a aVar2 = this.next;
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                ((a) w.X(aVar2, this, lVarC, aVar)).k(i15);
                i0 i0Var = i0.f148189a;
            }
            w.V(lVarC, this);
        }
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

    @Override // c3.u0
    public w0 t(w0 previous, w0 current, w0 applied) {
        if (((a) current).getValue() == ((a) applied).getValue()) {
            return current;
        }
        return null;
    }

    public String toString() {
        return "MutableIntState(value=" + ((a) w.I(this.next)).getValue() + ")@" + hashCode();
    }
}
