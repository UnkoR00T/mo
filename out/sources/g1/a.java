package g1;

import p056h1.l1;
import p056h1.r2;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\n*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0016\u0010)\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010(¨\u0006*"}, d2 = {"Lg1/a;", "Lg1/r0;", "", "initialNestedPrefetchItemCount", "<init>", "(I)V", "Lg1/d0;", "currentPrefetchingLineIndex", "", "scrollingForward", "Loq/i0;", "g", "(Lg1/d0;IZ)V", "f", "(Lg1/d0;Z)I", "e", "h", "()V", "Lg1/q0;", "", "delta", "layoutInfo", "d", "(Lg1/q0;FLg1/d0;)V", "c", "(Lg1/q0;Lg1/d0;)V", "Lh1/r2;", "firstVisibleItemIndex", "b", "(Lh1/r2;I)V", "a", "I", "lineToPrefetch", "Ln2/c;", "Lh1/l1$b;", "Ln2/c;", "currentLinePrefetchHandles", "Z", "wasScrollingForward", "previousPassItemCount", "F", "previousPassDelta", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int initialNestedPrefetchItemCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean wasScrollingForward;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float previousPassDelta;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int lineToPrefetch = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n2.c<l1.b> currentLinePrefetchHandles = new n2.c<>(new l1.b[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int previousPassItemCount = -1;

    public a(int i15) {
        this.initialNestedPrefetchItemCount = i15;
    }

    private final int e(d0 d0Var, boolean z15) {
        return z15 ? ((m) pq.v.x0(d0Var.j())).getIndex() + 1 : ((m) pq.v.l0(d0Var.j())).getIndex() - 1;
    }

    private final int f(d0 d0Var, boolean z15) {
        if (z15) {
            m mVar = (m) pq.v.x0(d0Var.j());
            return (d0Var.a() == a2.Vertical ? mVar.g() : mVar.i()) + 1;
        }
        m mVar2 = (m) pq.v.l0(d0Var.j());
        return (d0Var.a() == a2.Vertical ? mVar2.g() : mVar2.i()) - 1;
    }

    private final void g(d0 d0Var, int i15, boolean z15) {
        if (i15 == -1 || d0Var.j().isEmpty() || i15 == f(d0Var, z15)) {
            return;
        }
        h();
    }

    private final void h() {
        this.lineToPrefetch = -1;
        n2.c<l1.b> cVar = this.currentLinePrefetchHandles;
        l1.b[] bVarArr = cVar.content;
        int size = cVar.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            bVarArr[i15].cancel();
        }
        this.currentLinePrefetchHandles.j();
    }

    @Override // g1.r0
    public void b(r2 r2Var, int i15) {
        int nestedPrefetchItemCount = r2Var.getNestedPrefetchItemCount() == -1 ? this.initialNestedPrefetchItemCount : r2Var.getNestedPrefetchItemCount();
        for (int i16 = 0; i16 < nestedPrefetchItemCount; i16++) {
            r2Var.a(i15 + i16);
        }
    }

    @Override // g1.r0
    public void c(q0 q0Var, d0 d0Var) {
        g(d0Var, this.lineToPrefetch, this.wasScrollingForward);
        int iE = d0Var.e();
        int i15 = this.previousPassItemCount;
        if (i15 != -1 && this.previousPassDelta != 0.0f && i15 != iE && !d0Var.j().isEmpty()) {
            int iF = f(d0Var, this.previousPassDelta < 0.0f);
            int iE2 = e(d0Var, this.previousPassDelta < 0.0f);
            if (iE2 >= 0 && iE2 < d0Var.e() && iF != this.lineToPrefetch && iF >= 0) {
                this.lineToPrefetch = iF;
                this.currentLinePrefetchHandles.j();
                n2.c<l1.b> cVar = this.currentLinePrefetchHandles;
                cVar.f(cVar.getSize(), q0Var.a(iF));
            }
        }
        this.previousPassItemCount = iE;
    }

    @Override // g1.r0
    public void d(q0 q0Var, float f15, d0 d0Var) {
        if (!d0Var.j().isEmpty()) {
            int i15 = 0;
            boolean z15 = f15 < 0.0f;
            int iF = f(d0Var, z15);
            int iE = e(d0Var, z15);
            if (iE >= 0 && iE < d0Var.e()) {
                if (iF != this.lineToPrefetch && iF >= 0) {
                    if (this.wasScrollingForward != z15) {
                        n2.c<l1.b> cVar = this.currentLinePrefetchHandles;
                        l1.b[] bVarArr = cVar.content;
                        int size = cVar.getSize();
                        for (int i16 = 0; i16 < size; i16++) {
                            bVarArr[i16].cancel();
                        }
                    }
                    this.wasScrollingForward = z15;
                    this.lineToPrefetch = iF;
                    this.currentLinePrefetchHandles.j();
                    n2.c<l1.b> cVar2 = this.currentLinePrefetchHandles;
                    cVar2.f(cVar2.getSize(), q0Var.a(iF));
                }
                if (z15) {
                    m mVar = (m) pq.v.x0(d0Var.j());
                    if (((a1.e.b(mVar, d0Var.a()) + a1.e.c(mVar, d0Var.a())) + d0Var.h()) - d0Var.d() < (-f15)) {
                        n2.c<l1.b> cVar3 = this.currentLinePrefetchHandles;
                        l1.b[] bVarArr2 = cVar3.content;
                        int size2 = cVar3.getSize();
                        while (i15 < size2) {
                            bVarArr2[i15].a();
                            i15++;
                        }
                    }
                } else if (d0Var.g() - a1.e.b((m) pq.v.l0(d0Var.j()), d0Var.a()) < f15) {
                    n2.c<l1.b> cVar4 = this.currentLinePrefetchHandles;
                    l1.b[] bVarArr3 = cVar4.content;
                    int size3 = cVar4.getSize();
                    while (i15 < size3) {
                        bVarArr3[i15].a();
                        i15++;
                    }
                }
            }
        }
        this.previousPassDelta = f15;
    }
}
