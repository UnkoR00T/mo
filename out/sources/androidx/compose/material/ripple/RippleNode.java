package androidx.compose.material.ripple;

import b1.i;
import b1.j;
import b1.n;
import c5.d;
import c5.s;
import e2.RippleAlpha;
import e2.c;
import er.p;
import f3.m;
import g4.e;
import g4.q;
import g4.r;
import g4.y;
import ju.p0;
import mu.g;
import mu.h;
import n3.p1;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p3.f;
import r0.q0;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\u0014*\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\u0014*\u00020&H&¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020*2\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)H&¢\u0006\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00109R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u00106R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010,\u001a\u00020+8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u00108\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010N\u001a\u00020*2\u0006\u0010I\u001a\u00020*8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00104R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00120Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0011\u0010W\u001a\u00020U8F¢\u0006\u0006\u001a\u0004\bV\u0010M¨\u0006X"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Lf3/m$c;", "Lg4/e;", "Lg4/q;", "Lg4/y;", "Lb1/j;", "interactionSource", "", "bounded", "Lc5/h;", "radius", "Ln3/p1;", "color", "Lkotlin/Function0;", "Le2/b;", "rippleAlpha", "<init>", "(Lb1/j;ZFLn3/p1;Ler/a;Lfr/k;)V", "Lb1/n;", "pressInteraction", "Loq/i0;", "z3", "(Lb1/n;)V", "Lb1/i;", "interaction", "Lju/p0;", "scope", "B3", "(Lb1/i;Lju/p0;)V", "Lc5/r;", "size", "e", "(J)V", "W2", "()V", "Lp3/c;", "y", "(Lp3/c;)V", "Lp3/f;", "t3", "(Lp3/f;)V", "Lb1/n$b;", "Lm3/k;", "", "targetRadius", "s3", "(Lb1/n$b;JF)V", "A3", "(Lb1/n$b;)V", "r", "Lb1/j;", "s", "Z", "u3", "()Z", "t", "F", "Ln3/p1;", "v", "Ler/a;", "v3", "()Ler/a;", "w", "R2", "shouldAutoInvalidate", "Landroidx/compose/material/ripple/b;", "x", "Landroidx/compose/material/ripple/b;", "stateLayer", "y3", "()F", "setTargetRadius", "(F)V", "value", "z", "J", "x3", "()J", "rippleSize", "A", "hasValidSize", "Lr0/q0;", "B", "Lr0/q0;", "pendingInteractions", "Landroidx/compose/ui/graphics/Color;", "w3", "rippleColor", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class RippleNode extends m.c implements e, q, y {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean hasValidSize;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final q0<n> pendingInteractions;
    private final p1 color;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final j interactionSource;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final er.a<RippleAlpha> rippleAlpha;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private b stateLayer;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float targetRadius;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private long rippleSize;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f9773f;

        /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleNode$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C0199a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RippleNode f9775a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f9776b;

            C0199a(RippleNode rippleNode, p0 p0Var) {
                this.f9775a = rippleNode;
                this.f9776b = p0Var;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(i iVar, tq.e<? super i0> eVar) {
                if (!(iVar instanceof n)) {
                    this.f9775a.B3(iVar, this.f9776b);
                } else if (this.f9775a.hasValidSize) {
                    this.f9775a.z3((n) iVar);
                } else {
                    this.f9775a.pendingInteractions.n(iVar);
                }
                return i0.f148189a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9772e;
            if (i15 == 0) {
                u.b(obj);
                p0 p0Var = (p0) this.f9773f;
                g<i> gVarC = RippleNode.this.interactionSource.c();
                C0199a c0199a = new C0199a(RippleNode.this, p0Var);
                this.f9772e = 1;
                if (gVarC.a(c0199a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = RippleNode.this.new a(eVar);
            aVar.f9773f = obj;
            return aVar;
        }
    }

    public /* synthetic */ RippleNode(j jVar, boolean z15, float f15, p1 p1Var, er.a aVar, fr.k kVar) {
        this(jVar, z15, f15, p1Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(i interaction, p0 scope) {
        b bVar = this.stateLayer;
        if (bVar == null) {
            bVar = new b(this.bounded, this.rippleAlpha);
            r.a(this);
            this.stateLayer = bVar;
        }
        bVar.c(interaction, scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3(n pressInteraction) {
        if (pressInteraction instanceof n.b) {
            s3((n.b) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof n.c) {
            A3(((n.c) pressInteraction).getPress());
        } else if (pressInteraction instanceof n.a) {
            A3(((n.a) pressInteraction).getPress());
        }
    }

    public abstract void A3(n.b interaction);

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // f3.m.c
    public void W2() {
        ju.k.d(M2(), null, null, new a(null), 3, null);
    }

    @Override // g4.y, g4.k0
    public void e(long size) {
        this.hasValidSize = true;
        d dVarO = g4.h.o(this);
        this.rippleSize = s.e(size);
        this.targetRadius = Float.isNaN(this.radius) ? c.a(dVarO, this.bounded, this.rippleSize) : dVarO.l2(this.radius);
        q0<n> q0Var = this.pendingInteractions;
        Object[] objArr = q0Var.content;
        int i15 = q0Var._size;
        for (int i16 = 0; i16 < i15; i16++) {
            z3((n) objArr[i16]);
        }
        this.pendingInteractions.u();
    }

    public abstract void s3(n.b interaction, long size, float targetRadius);

    public abstract void t3(f fVar);

    /* JADX INFO: renamed from: u3, reason: from getter */
    protected final boolean getBounded() {
        return this.bounded;
    }

    protected final er.a<RippleAlpha> v3() {
        return this.rippleAlpha;
    }

    public final long w3() {
        return this.color.a();
    }

    /* JADX INFO: renamed from: x3, reason: from getter */
    protected final long getRippleSize() {
        return this.rippleSize;
    }

    @Override // g4.q
    public void y(p3.c cVar) throws Throwable {
        cVar.H2();
        b bVar = this.stateLayer;
        if (bVar != null) {
            bVar.b(cVar, this.targetRadius, w3());
        }
        t3(cVar);
    }

    /* JADX INFO: renamed from: y3, reason: from getter */
    protected final float getTargetRadius() {
        return this.targetRadius;
    }

    private RippleNode(j jVar, boolean z15, float f15, p1 p1Var, er.a<RippleAlpha> aVar) {
        this.interactionSource = jVar;
        this.bounded = z15;
        this.radius = f15;
        this.color = p1Var;
        this.rippleAlpha = aVar;
        this.rippleSize = m3.k.INSTANCE.b();
        this.pendingInteractions = new q0<>(0, 1, null);
    }
}
