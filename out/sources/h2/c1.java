package h2;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p046f2.g4;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JO\u0010\u0019\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u000fJ#\u0010\u001f\u001a\u00020\u001e*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&RF\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lh2/c1;", "T", "Lf3/m$c;", "Lg4/z;", "Lh2/q1;", "state", "Lkotlin/Function2;", "Lc5/r;", "Lc5/b;", "Loq/r;", "Lz0/v0;", "anchors", "Lz0/a2;", "orientation", "<init>", "(Lh2/q1;Ler/p;Lz0/a2;)V", "", "offset", "", "isLookingAhead", "Loq/i0;", "p3", "(FZ)V", "X2", "()V", "t3", "Le4/y0;", "Le4/v0;", "measurable", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "r", "Lh2/q1;", "getState", "()Lh2/q1;", "setState", "(Lh2/q1;)V", "s", "Ler/p;", "getAnchors", "()Ler/p;", "setAnchors", "(Ler/p;)V", "t", "Lz0/a2;", "getOrientation", "()Lz0/a2;", "setOrientation", "(Lz0/a2;)V", "v", "Z", "didInitializeAnchors", "q3", "()Z", "isReverseDirection", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c1<T> extends f3.m.c implements g4.z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private q1<T> state;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private er.p<? super c5.r, ? super c5.b, ? extends oq.r<? extends p143z0.v0<T>, ? extends T>> anchors;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private p143z0.a2 orientation;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean didInitializeAnchors;

    public c1(q1<T> q1Var, er.p<? super c5.r, ? super c5.b, ? extends oq.r<? extends p143z0.v0<T>, ? extends T>> pVar, p143z0.a2 a2Var) {
        this.state = q1Var;
        this.anchors = pVar;
        this.orientation = a2Var;
    }

    private final void p3(float offset, boolean isLookingAhead) throws r {
        if (Float.isNaN(offset)) {
            throw new r(isLookingAhead, this.didInitializeAnchors, this.state.i(), this.state.m());
        }
    }

    private final boolean q3() {
        return g4.h.r(this) == c5.t.Rtl && this.orientation == p143z0.a2.Horizontal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r3(p036e4.y0 y0Var, c1 c1Var, final p036e4.a2 a2Var, e4.a2.a aVar) throws r {
        final float fC = y0Var.J0() ? c1Var.state.i().c(c1Var.state.m()) : c1Var.state.l();
        if (g4.isAnchoredDraggableComponentsStrictOffsetCheckEnabled) {
            c1Var.p3(fC, y0Var.J0());
        } else if (Float.isNaN(fC)) {
            return oq.i0.f148189a;
        }
        float f15 = c1Var.q3() ? -1.0f : 1.0f;
        p143z0.a2 a2Var2 = c1Var.orientation;
        final float f16 = a2Var2 == p143z0.a2.Horizontal ? f15 * fC : 0.0f;
        if (a2Var2 != p143z0.a2.Vertical) {
            fC = 0.0f;
        }
        aVar.r0(new er.l() { // from class: h2.b1
            @Override // er.l
            public final Object b(Object obj) {
                return c1.s3(a2Var, f16, fC, (e4.a2.a) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s3(p036e4.a2 a2Var, float f15, float f16, e4.a2.a aVar) {
        e4.a2.a.E(aVar, a2Var, hr.a.d(f15), hr.a.d(f16), 0.0f, 4, null);
        return oq.i0.f148189a;
    }

    @Override // f3.m.c
    public void X2() {
        this.didInitializeAnchors = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // g4.z
    public p036e4.x0 c(final p036e4.y0 y0Var, p036e4.v0 v0Var, long j15) {
        Object objF;
        final p036e4.a2 a2VarO0 = v0Var.o0(j15);
        boolean z15 = true;
        if (!y0Var.J0() || !this.didInitializeAnchors) {
            oq.r<? extends p143z0.v0<T>, ? extends T> rVarB = this.anchors.B(c5.r.b(c5.r.c((((long) a2VarO0.getWidth()) << 32) | (((long) a2VarO0.getHeight()) & BodyPartID.bodyIdMax))), c5.b.a(j15));
            p143z0.v0<T> v0VarA = rVarB.a();
            Object objB = rVarB.b();
            if (g4.isAnchoredDraggableComponentsAnchorRecoveryEnabled) {
                if (!v0VarA.d(objB) && (objF = v0VarA.f(0)) != null) {
                    objB = objF;
                }
                this.state.r(v0VarA, objB);
            } else {
                this.state.r(v0VarA, objB);
            }
            this.didInitializeAnchors = true;
        }
        if (!y0Var.J0() && !this.didInitializeAnchors) {
            z15 = false;
        }
        this.didInitializeAnchors = z15;
        return p036e4.y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: h2.a1
            @Override // er.l
            public final Object b(Object obj) {
                return c1.r3(y0Var, this, a2VarO0, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    public final void t3(q1<T> state, er.p<? super c5.r, ? super c5.b, ? extends oq.r<? extends p143z0.v0<T>, ? extends T>> anchors, p143z0.a2 orientation) {
        boolean z15 = g4.isAnchoredDraggableComponentsInvalidationFixEnabled && !fr.t.c(this.state, state);
        this.state = state;
        this.anchors = anchors;
        this.orientation = orientation;
        if (z15) {
            this.didInitializeAnchors = false;
            g4.b0.b(this);
        }
    }
}
