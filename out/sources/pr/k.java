package pr;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpr/k;", "Lyr/o;", "Lpr/c0;", "Loq/i0;", "Lpr/g1;", "container", "<init>", "(Lpr/g1;)V", "Lvr/z0;", "descriptor", "data", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Loq/i0;)Lpr/c0;", "Lvr/z;", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Loq/i0;)Lpr/c0;", "a", "Lpr/g1;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class k extends yr.o<c0<?>, oq.i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g1 container;

    public k(g1 g1Var) {
        this.container = g1Var;
    }

    @Override // yr.o, vr.o
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public c0<?> f(vr.z zVar, oq.i0 i0Var) {
        return new l1(this.container, zVar);
    }

    @Override // vr.o
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public c0<?> l(vr.z0 z0Var, oq.i0 i0Var) {
        int i15;
        if (z0Var.B0().isEmpty()) {
            i15 = (z0Var.N() != null ? 1 : 0) + (z0Var.R() != null ? 1 : 0);
        } else {
            i15 = -1;
        }
        if (z0Var.Q()) {
            if (i15 == -1) {
                return new t1(this.container, z0Var);
            }
            if (i15 == 0) {
                return new n1(this.container, z0Var);
            }
            if (i15 == 1) {
                return new p1(this.container, z0Var);
            }
            if (i15 == 2) {
                return new r1(this.container, z0Var);
            }
        } else {
            if (i15 == -1) {
                return new x2(this.container, z0Var);
            }
            if (i15 == 0) {
                return new h2(this.container, z0Var);
            }
            if (i15 == 1) {
                return new k2(this.container, z0Var);
            }
            if (i15 == 2) {
                return new n2(this.container, z0Var);
            }
        }
        throw new i3("Unsupported property: " + z0Var);
    }
}
