package vc;

import oq.i0;
import p071kotlin.Metadata;
import vv.b0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006 "}, d2 = {"Lvc/u;", "Lvc/t;", "Lvv/g;", "source", "m", "(Lvv/g;)Lvv/g;", "Lvv/f;", "sink", "Loq/i0;", "C", "(Lvv/g;Lvv/f;Ltq/e;)Ljava/lang/Object;", "Lvv/k;", "fileSystem", "Lvv/b0;", "path", "E", "(Lvv/g;Lvv/k;Lvv/b0;Ltq/e;)Ljava/lang/Object;", "h", "(Lvv/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvv/g;", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vv.g source;

    private /* synthetic */ u(vv.g gVar) {
        this.source = gVar;
    }

    public static Object C(vv.g gVar, vv.f fVar, tq.e<? super i0> eVar) {
        gVar.A0(fVar);
        return i0.f148189a;
    }

    public static Object E(vv.g gVar, vv.k kVar, b0 b0Var, tq.e<? super i0> eVar) throws Throwable {
        vv.f fVarB = vv.v.b(kVar.N(b0Var, false));
        try {
            vq.b.f(gVar.A0(fVarB));
            if (fVarB != null) {
                try {
                    fVarB.close();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            th = null;
        } catch (Throwable th5) {
            th = th5;
            if (fVarB != null) {
                try {
                    fVarB.close();
                } catch (Throwable th6) {
                    oq.c.a(th, th6);
                }
            }
        }
        if (th == null) {
            return i0.f148189a;
        }
        throw th;
    }

    public static final /* synthetic */ u b(vv.g gVar) {
        return new u(gVar);
    }

    public static void h(vv.g gVar) {
        gVar.close();
    }

    public static vv.g m(vv.g gVar) {
        return gVar;
    }

    public static boolean p(vv.g gVar, Object obj) {
        return (obj instanceof u) && fr.t.c(gVar, ((u) obj).getSource());
    }

    public static int r(vv.g gVar) {
        return gVar.hashCode();
    }

    public static String u(vv.g gVar) {
        return "SourceResponseBody(source=" + gVar + ")";
    }

    @Override // vc.t
    public Object U(vv.f fVar, tq.e<? super i0> eVar) {
        return C(this.source, fVar, eVar);
    }

    @Override // vc.t
    public Object X2(vv.k kVar, b0 b0Var, tq.e<? super i0> eVar) {
        return E(this.source, kVar, b0Var, eVar);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        h(this.source);
    }

    public boolean equals(Object other) {
        return p(this.source, other);
    }

    public int hashCode() {
        return r(this.source);
    }

    public String toString() {
        return u(this.source);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final /* synthetic */ vv.g getSource() {
        return this.source;
    }
}
