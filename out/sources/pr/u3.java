package pr;

import java.lang.reflect.Method;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001e\u0010#\u001a\u0004\u0018\u00010 *\u0006\u0012\u0002\b\u00030\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lpr/u3;", "", "<init>", "()V", "Lvr/z;", "descriptor", "", "b", "(Lvr/z;)Z", "Lpr/n$e;", "d", "(Lvr/z;)Lpr/n$e;", "Lvr/b;", "", "e", "(Lvr/b;)Ljava/lang/String;", "possiblySubstitutedFunction", "Lpr/n;", "g", "(Lvr/z;)Lpr/n;", "Lvr/z0;", "possiblyOverriddenProperty", "Lpr/p;", "f", "(Lvr/z0;)Lpr/p;", "Ljava/lang/Class;", "klass", "Lzs/b;", "c", "(Ljava/lang/Class;)Lzs/b;", "Lzs/b;", "JAVA_LANG_VOID", "Lsr/m;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3 f161976a = new u3();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final zs.b JAVA_LANG_VOID = zs.b.f236634d.c(new zs.c("java.lang.Void"));

    private u3() {
    }

    private final sr.m a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return jt.e.e(cls.getSimpleName()).n();
        }
        return null;
    }

    private final boolean b(vr.z descriptor) {
        if (dt.h.p(descriptor) || dt.h.q(descriptor)) {
            return true;
        }
        return fr.t.c(descriptor.getName(), ur.a.f200027e.a()) && descriptor.l().isEmpty();
    }

    private final n.e d(vr.z descriptor) {
        return new n.e(new ys.d.b(e(descriptor), ss.c0.c(descriptor, false, false, 1, null)));
    }

    private final String e(vr.b descriptor) {
        String strE = js.t0.e(descriptor);
        if (strE != null) {
            return strE;
        }
        if (descriptor instanceof vr.a1) {
            return js.i0.b(ht.e.w(descriptor).getName().e());
        }
        return descriptor instanceof vr.b1 ? js.i0.e(ht.e.w(descriptor).getName().e()) : descriptor.getName().e();
    }

    public final zs.b c(Class<?> klass) {
        zs.b bVarM;
        if (klass.isArray()) {
            sr.m mVarA = a(klass.getComponentType());
            return mVarA != null ? new zs.b(sr.p.B, mVarA.n()) : zs.b.f236634d.c(sr.p.a.f183645i.m());
        }
        if (fr.t.c(klass, Void.TYPE)) {
            return JAVA_LANG_VOID;
        }
        sr.m mVarA2 = a(klass);
        if (mVarA2 != null) {
            return new zs.b(sr.p.B, mVarA2.p());
        }
        zs.b bVarE = bs.f.e(klass);
        return (bVarE.i() || (bVarM = ur.c.f200031a.m(bVarE.a())) == null) ? bVarE : bVarM;
    }

    public final p f(vr.z0 possiblyOverriddenProperty) {
        vr.z0 z0VarA = ((vr.z0) dt.i.L(possiblyOverriddenProperty)).Q0();
        if (z0VarA instanceof qt.n0) {
            qt.n0 n0Var = (qt.n0) z0VarA;
            us.o oVarL1 = n0Var.k0();
            xs.a.d dVar = (xs.a.d) ws.f.a(oVarL1, xs.a.f220666d);
            if (dVar != null) {
                return new p.c(z0VarA, oVarL1, dVar, n0Var.L(), n0Var.I());
            }
        } else if (z0VarA instanceof ls.f) {
            ls.f fVar = (ls.f) z0VarA;
            vr.h1 h1VarM = fVar.m();
            ps.a aVar = h1VarM instanceof ps.a ? (ps.a) h1VarM : null;
            qs.l lVarC = aVar != null ? aVar.c() : null;
            if (lVarC instanceof bs.w) {
                return new p.a(((bs.w) lVarC).U());
            }
            if (lVarC instanceof bs.z) {
                Method methodU = ((bs.z) lVarC).U();
                vr.b1 b1VarJ = fVar.j();
                vr.h1 h1VarM2 = b1VarJ != null ? b1VarJ.m() : null;
                ps.a aVar2 = h1VarM2 instanceof ps.a ? (ps.a) h1VarM2 : null;
                qs.l lVarC2 = aVar2 != null ? aVar2.c() : null;
                bs.z zVar = lVarC2 instanceof bs.z ? (bs.z) lVarC2 : null;
                return new p.b(methodU, zVar != null ? zVar.U() : null);
            }
            throw new i3("Incorrect resolution sequence for Java field " + z0VarA + " (source = " + lVarC + ')');
        }
        n.e eVarD = d(z0VarA.d());
        vr.b1 b1VarJ2 = z0VarA.j();
        return new p.d(eVarD, b1VarJ2 != null ? d(b1VarJ2) : null);
    }

    public final n g(vr.z possiblySubstitutedFunction) {
        Method methodU;
        ys.d.b bVarB;
        ys.d.b bVarE;
        vr.z zVarA = ((vr.z) dt.i.L(possiblySubstitutedFunction)).Q0();
        if (zVarA instanceof qt.b) {
            qt.t tVar = (qt.t) zVarA;
            bt.q qVarK0 = tVar.k0();
            if ((qVarK0 instanceof us.j) && (bVarE = ys.h.f229107a.e((us.j) qVarK0, tVar.L(), tVar.I())) != null) {
                return new n.e(bVarE);
            }
            if (!(qVarK0 instanceof us.e) || (bVarB = ys.h.f229107a.b((us.e) qVarK0, tVar.L(), tVar.I())) == null) {
                return d(zVarA);
            }
            if (dt.k.b(possiblySubstitutedFunction.b())) {
                return new n.e(bVarB);
            }
            if (!dt.k.d(possiblySubstitutedFunction.b())) {
                return new n.d(bVarB);
            }
            vr.l lVar = (vr.l) possiblySubstitutedFunction;
            if (lVar.h0()) {
                if (!fr.t.c(bVarB.e(), "constructor-impl") || !fu.r.F(bVarB.d(), ")V", false, 2, null)) {
                    throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
                }
            } else {
                if (!fr.t.c(bVarB.e(), "constructor-impl")) {
                    throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
                }
                String strU = qr.o.u(lVar.i0());
                if (fu.r.F(bVarB.d(), ")V", false, 2, null)) {
                    bVarB = ys.d.b.c(bVarB, null, fu.r.O0(bVarB.d(), "V") + strU, 1, null);
                } else if (!fu.r.F(bVarB.d(), strU, false, 2, null)) {
                    throw new IllegalArgumentException(("Invalid signature: " + bVarB).toString());
                }
            }
            return new n.e(bVarB);
        }
        if (zVarA instanceof ls.e) {
            vr.h1 h1VarM = ((ls.e) zVarA).m();
            ps.a aVar = h1VarM instanceof ps.a ? (ps.a) h1VarM : null;
            qs.l lVarC = aVar != null ? aVar.c() : null;
            bs.z zVar = lVarC instanceof bs.z ? (bs.z) lVarC : null;
            if (zVar != null && (methodU = zVar.U()) != null) {
                return new n.c(methodU);
            }
            throw new i3("Incorrect resolution sequence for Java method " + zVarA);
        }
        if (!(zVarA instanceof ls.b)) {
            if (b(zVarA)) {
                return d(zVarA);
            }
            throw new i3("Unknown origin of " + zVarA + " (" + zVarA.getClass() + ')');
        }
        vr.h1 h1VarM2 = ((ls.b) zVarA).m();
        ps.a aVar2 = h1VarM2 instanceof ps.a ? (ps.a) h1VarM2 : null;
        qs.l lVarC2 = aVar2 != null ? aVar2.c() : null;
        if (lVarC2 instanceof bs.t) {
            return new n.b(((bs.t) lVarC2).U());
        }
        if (lVarC2 instanceof bs.q) {
            bs.q qVar = (bs.q) lVarC2;
            if (qVar.t()) {
                return new n.a(qVar.b());
            }
        }
        throw new i3("Incorrect resolution sequence for Java constructor " + zVarA + " (" + lVarC2 + ')');
    }
}
