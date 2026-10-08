package q3;

import n3.e2;
import p071kotlin.Metadata;
import r0.i1;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lq3/a;", "", "<init>", "()V", "Lq3/c;", "graphicsLayer", "", "i", "(Lq3/c;)Z", "a", "Lq3/c;", "dependency", "b", "oldDependency", "Lr0/u0;", "c", "Lr0/u0;", "dependenciesSet", "d", "oldDependenciesSet", "e", "Z", "trackingInProgress", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private c dependency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private c oldDependency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private u0<c> dependenciesSet;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private u0<c> oldDependenciesSet;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean trackingInProgress;

    public final boolean i(c graphicsLayer) {
        if (!this.trackingInProgress) {
            e2.a("Only add dependencies during a tracking");
        }
        u0<c> u0Var = this.dependenciesSet;
        if (u0Var != null) {
            u0Var.i(graphicsLayer);
        } else if (this.dependency != null) {
            u0<c> u0VarB = i1.b();
            u0VarB.i(this.dependency);
            u0VarB.i(graphicsLayer);
            this.dependenciesSet = u0VarB;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        u0<c> u0Var2 = this.oldDependenciesSet;
        if (u0Var2 != null) {
            return !u0Var2.z(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }
}
