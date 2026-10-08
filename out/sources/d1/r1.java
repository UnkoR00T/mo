package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0004R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ld1/r1;", "Lf3/m$c;", "Lg4/q1;", "<init>", "()V", "Ld1/c4;", "ancestorConsumedInsets", "Loq/i0;", "w3", "(Ld1/c4;)V", "t3", "p3", "(Ld1/c4;)Ld1/c4;", "W2", "X2", "Y2", "s3", "value", "r", "Ld1/c4;", "q3", "()Ld1/c4;", "s", "r3", "consumedInsets", "", "T", "()Ljava/lang/Object;", "traverseKey", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class r1 extends f3.m.c implements g4.q1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private c4 ancestorConsumedInsets = f4.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private c4 consumedInsets = f4.a();

    private final void t3() {
        g4.r1.e(this, T(), new er.l() { // from class: d1.p1
            @Override // er.l
            public final Object b(Object obj) {
                return r1.u3(this.f39249a, (g4.q1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g4.p1 u3(r1 r1Var, g4.q1 q1Var) {
        ((r1) q1Var).w3(r1Var.consumedInsets);
        return g4.p1.SkipSubtreeAndContinueTraversal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v3(r1 r1Var, g4.q1 q1Var) {
        r1Var.ancestorConsumedInsets = ((r1) q1Var).consumedInsets;
        return false;
    }

    private final void w3(c4 ancestorConsumedInsets) {
        if (fr.t.c(this.ancestorConsumedInsets, ancestorConsumedInsets)) {
            return;
        }
        this.ancestorConsumedInsets = ancestorConsumedInsets;
        s3();
    }

    @Override // g4.q1
    public Object T() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // f3.m.c
    public void W2() {
        g4.r1.c(this, T(), new er.l() { // from class: d1.q1
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(r1.v3(this.f39256a, (g4.q1) obj));
            }
        });
        s3();
        super.W2();
    }

    @Override // f3.m.c
    public void X2() {
        this.consumedInsets = this.ancestorConsumedInsets;
        t3();
        super.X2();
    }

    @Override // f3.m.c
    public void Y2() {
        super.Y2();
        this.ancestorConsumedInsets = f4.a();
    }

    public abstract c4 p3(c4 ancestorConsumedInsets);

    /* JADX INFO: renamed from: q3, reason: from getter */
    public final c4 getAncestorConsumedInsets() {
        return this.ancestorConsumedInsets;
    }

    /* JADX INFO: renamed from: r3, reason: from getter */
    public final c4 getConsumedInsets() {
        return this.consumedInsets;
    }

    public void s3() {
        this.consumedInsets = p3(this.ancestorConsumedInsets);
        t3();
    }
}
