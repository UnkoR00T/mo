package k3;

import n3.x1;
import p071kotlin.Metadata;
import r0.b1;
import r0.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\rR.\u0010\u0016\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u001a"}, d2 = {"Lk3/s;", "Ln3/x1;", "<init>", "()V", "Lq3/c;", "c", "()Lq3/c;", "layer", "Loq/i0;", "a", "(Lq3/c;)V", "e", "Lr0/q0;", "Lr0/q0;", "allocatedGraphicsLayers", "value", "b", "Ln3/x1;", "d", "()Ln3/x1;", "f", "(Ln3/x1;)V", "graphicsContext", "Ls3/h;", "()Ls3/h;", "shadowContext", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private q0<q3.c> allocatedGraphicsLayers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private x1 graphicsContext;

    @Override // n3.x1
    public void a(q3.c layer) {
        x1 x1Var = this.graphicsContext;
        if (x1Var != null) {
            x1Var.a(layer);
        }
    }

    @Override // n3.x1
    public s3.h b() {
        x1 x1Var = this.graphicsContext;
        if (!(x1Var != null)) {
            d4.a.c("GraphicsContext not provided");
        }
        return x1Var.b();
    }

    @Override // n3.x1
    public q3.c c() {
        x1 x1Var = this.graphicsContext;
        if (!(x1Var != null)) {
            d4.a.c("GraphicsContext not provided");
        }
        q3.c cVarC = x1Var.c();
        q0<q3.c> q0Var = this.allocatedGraphicsLayers;
        if (q0Var == null) {
            this.allocatedGraphicsLayers = b1.g(cVarC);
            return cVarC;
        }
        q0Var.n(cVarC);
        return cVarC;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final x1 getGraphicsContext() {
        return this.graphicsContext;
    }

    public final void e() {
        q0<q3.c> q0Var = this.allocatedGraphicsLayers;
        if (q0Var != null) {
            Object[] objArr = q0Var.content;
            int i15 = q0Var._size;
            for (int i16 = 0; i16 < i15; i16++) {
                a((q3.c) objArr[i16]);
            }
            q0Var.u();
        }
    }

    public final void f(x1 x1Var) {
        e();
        this.graphicsContext = x1Var;
    }
}
