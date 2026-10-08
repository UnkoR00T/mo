package f1;

import p056h1.l1;
import p056h1.r2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u0006*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010&¨\u0006("}, d2 = {"Lf1/a;", "Lf1/n0;", "", "initialNestedPrefetchItemCount", "<init>", "(I)V", "Loq/i0;", "g", "()V", "Lf1/b0;", "", "scrollingForward", "e", "(Lf1/b0;Z)I", "currentPrefetchingIndex", "f", "(Lf1/b0;IZ)V", "Lf1/m0;", "", "delta", "layoutInfo", "c", "(Lf1/m0;FLf1/b0;)V", "d", "(Lf1/m0;Lf1/b0;)V", "Lh1/r2;", "firstVisibleItemIndex", "b", "(Lh1/r2;I)V", "a", "I", "indexToPrefetch", "Lh1/l1$b;", "Lh1/l1$b;", "currentPrefetchHandle", "Z", "wasScrollingForward", "previousPassItemCount", "F", "previousPassDelta", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int initialNestedPrefetchItemCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private l1.b currentPrefetchHandle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean wasScrollingForward;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float previousPassDelta;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int indexToPrefetch = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int previousPassItemCount = -1;

    public a(int i15) {
        this.initialNestedPrefetchItemCount = i15;
    }

    private final int e(b0 b0Var, boolean z15) {
        return z15 ? ((q) pq.v.x0(b0Var.j())).getIndex() + 1 : ((q) pq.v.l0(b0Var.j())).getIndex() - 1;
    }

    private final void f(b0 b0Var, int i15, boolean z15) {
        if (i15 == -1 || b0Var.j().isEmpty() || i15 == e(b0Var, z15)) {
            return;
        }
        g();
    }

    private final void g() {
        this.indexToPrefetch = -1;
        l1.b bVar = this.currentPrefetchHandle;
        if (bVar != null) {
            bVar.cancel();
        }
        this.currentPrefetchHandle = null;
    }

    @Override // f1.n0
    public void b(r2 r2Var, int i15) {
        int nestedPrefetchItemCount = r2Var.getNestedPrefetchItemCount() == -1 ? this.initialNestedPrefetchItemCount : r2Var.getNestedPrefetchItemCount();
        for (int i16 = 0; i16 < nestedPrefetchItemCount; i16++) {
            r2Var.a(i15 + i16);
        }
    }

    @Override // f1.n0
    public void c(m0 m0Var, float f15, b0 b0Var) {
        l1.b bVar;
        l1.b bVar2;
        if (!b0Var.j().isEmpty()) {
            boolean z15 = f15 < 0.0f;
            int iE = e(b0Var, z15);
            if (iE >= 0 && iE < b0Var.e()) {
                if (iE != this.indexToPrefetch) {
                    if (this.wasScrollingForward != z15) {
                        g();
                    }
                    this.wasScrollingForward = z15;
                    this.indexToPrefetch = iE;
                    this.currentPrefetchHandle = m0.b(m0Var, iE, null, 2, null);
                }
                if (z15) {
                    q qVar = (q) pq.v.x0(b0Var.j());
                    if (((qVar.getOffset() + qVar.getSize()) + b0Var.h()) - b0Var.d() < (-f15) && (bVar2 = this.currentPrefetchHandle) != null) {
                        bVar2.a();
                    }
                } else if (b0Var.g() - ((q) pq.v.l0(b0Var.j())).getOffset() < f15 && (bVar = this.currentPrefetchHandle) != null) {
                    bVar.a();
                }
            }
        }
        this.previousPassDelta = f15;
    }

    @Override // f1.n0
    public void d(m0 m0Var, b0 b0Var) {
        f(b0Var, this.indexToPrefetch, this.wasScrollingForward);
        int iE = b0Var.e();
        int i15 = this.previousPassItemCount;
        if (i15 != -1 && this.previousPassDelta != 0.0f && i15 != iE && !b0Var.j().isEmpty()) {
            int iE2 = e(b0Var, this.previousPassDelta < 0.0f);
            if (iE2 >= 0 && iE2 < iE) {
                this.indexToPrefetch = iE2;
                this.currentPrefetchHandle = m0.b(m0Var, iE2, null, 2, null);
            }
        }
        this.previousPassItemCount = iE;
    }
}
