package p047f5;

import c5.c;
import c5.d;
import c5.h;
import c5.t;
import k5.g;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010!\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lf5/d0;", "Lk5/g;", "Landroidx/constraintlayout/compose/SolverState;", "Lc5/d;", "density", "<init>", "(Lc5/d;)V", "", "value", "", "e", "(Ljava/lang/Object;)I", "l", "Lc5/d;", "getDensity", "()Lc5/d;", "Lc5/b;", "m", "J", "F", "()J", "G", "(J)V", "rootIncomingConstraints", "Lc5/t;", "n", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "setLayoutDirection", "(Lc5/t;)V", "getLayoutDirection$annotations", "()V", "layoutDirection", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final d density;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long rootIncomingConstraints = c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection = t.Ltr;

    public d0(d dVar) {
        this.density = dVar;
        v(new k5.c() { // from class: f5.c0
            @Override // k5.c
            public final float a(float f15) {
                return d0.E(this.f59161a, f15);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float E(d0 d0Var, float f15) {
        return d0Var.density.getDensity() * f15;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final long getRootIncomingConstraints() {
        return this.rootIncomingConstraints;
    }

    public final void G(long j15) {
        this.rootIncomingConstraints = j15;
    }

    @Override // k5.g
    public int e(Object value) {
        return value instanceof h ? this.density.X0(((h) value).getValue()) : super.e(value);
    }
}
