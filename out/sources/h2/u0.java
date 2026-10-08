package h2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lh2/u0;", "Lf3/m$c;", "Lg4/i1;", "Lkotlin/Function1;", "Ln4/i0;", "Loq/i0;", "properties", "<init>", "(Ler/l;)V", "E2", "(Ln4/i0;)V", "X2", "()V", "r", "Ler/l;", "getProperties", "()Ler/l;", "r3", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 extends f3.m.c implements g4.i1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private er.l<? super n4.i0, oq.i0> properties;

    public u0(er.l<? super n4.i0, oq.i0> lVar) {
        this.properties = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p3(n4.i0 i0Var, g4.q1 q1Var) {
        ((t1) q1Var).n3(i0Var);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q3(g4.q1 q1Var) {
        ((t1) q1Var).o3();
        return false;
    }

    @Override // g4.i1
    public void E2(final n4.i0 i0Var) {
        g4.r1.c(this, v1.f79999a, new er.l() { // from class: h2.s0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(u0.p3(i0Var, (g4.q1) obj));
            }
        });
        this.properties.b(i0Var);
    }

    @Override // f3.m.c
    public void X2() {
        super.X2();
        g4.r1.c(this, v1.f79999a, new er.l() { // from class: h2.t0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(u0.q3((g4.q1) obj));
            }
        });
    }

    public final void r3(er.l<? super n4.i0, oq.i0> lVar) {
        this.properties = lVar;
    }
}
