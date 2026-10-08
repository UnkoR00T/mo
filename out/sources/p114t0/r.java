package p114t0;

import c5.n;
import c5.o;
import er.p;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import ju.r0;
import m3.g;
import m3.h;
import oq.i0;
import oq.u;
import p036e4.a2;
import p036e4.b0;
import p036e4.c0;
import p036e4.s0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import tq.e;
import u0.c;
import u0.j0;
import u0.s;
import u0.s3;
import uq.b;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\bJ\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R$\u0010(\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010+\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u0016\u0010.\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R$\u00105\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b0\u00102\"\u0004\b3\u00104R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\"\u00108\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010%\u001a\u0004\b,\u0010'\"\u0004\b7\u0010\bR/\u0010?\u001a\u0004\u0018\u00010\r2\b\u00109\u001a\u0004\u0018\u00010\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b$\u0010<\"\u0004\b=\u0010>R\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010%R\u0013\u0010F\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b)\u0010<R\u0011\u0010H\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bB\u0010GR\u0013\u0010#\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b:\u0010<¨\u0006I"}, d2 = {"Lt0/r;", "", "<init>", "()V", "Lm3/e;", "offset", "Loq/i0;", "m", "(J)V", "Lju/p0;", "coroutineScope", "Lt0/q;", "boundsTransform", "Lm3/g;", "a", "(Lju/p0;Lt0/q;)Lm3/g;", "Lm3/k;", "size", "o", "position", "l", "(JJ)V", "Le4/s0;", "lookaheadScope", "Le4/a2$a;", "placementScope", "", "directManipulationParentsDirty", "includeMotionFrameOfReference", "n", "(Le4/s0;Le4/a2$a;Lju/p0;ZZLt0/q;)V", "Lu0/c;", "Lu0/s;", "Lu0/c;", "animatable", "value", "b", "J", "g", "()J", "targetSize", "c", "f", "targetOffset", "d", "Z", "isPending", "Lt0/n0;", "e", "Lt0/n0;", "()Lt0/n0;", "k", "(Lt0/n0;)V", "lookaheadAnimationVisualDebugHelper", "currentPosition", "setCurrentSize-uvyYCjk", "currentSize", "<set-?>", "h", "Lm2/a3;", "()Lm3/g;", "j", "(Lm3/g;)V", "animatedValue", "", "Le4/b0;", "i", "Ljava/util/List;", "directManipulationParents", "additionalOffset", "currentBounds", "()Z", "isIdle", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private c<g, s> animatable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long targetSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long targetOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isPending;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private n0 lookaheadAnimationVisualDebugHelper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long currentPosition;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long currentSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a3 animatedValue;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private List<b0> directManipulationParents;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long additionalOffset;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c<g, s> f186440f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g f186441g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q f186442h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ r f186443j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<g, s> cVar, g gVar, q qVar, r rVar, e<? super a> eVar) {
            super(2, eVar);
            this.f186440f = cVar;
            this.f186441g = gVar;
            this.f186442h = qVar;
            this.f186443j = rVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f186439e;
            if (i15 == 0) {
                u.b(obj);
                c<g, s> cVar = this.f186440f;
                g gVar = this.f186441g;
                j0<g> j0VarA = this.f186442h.a(this.f186443j.c(), this.f186441g);
                this.f186439e = 1;
                if (c.f(cVar, gVar, j0VarA, null, null, this, 12, null) == objE) {
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
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f186440f, this.f186441g, this.f186442h, this.f186443j, eVar);
        }
    }

    public r() {
        m3.k.Companion companion = m3.k.INSTANCE;
        this.targetSize = companion.a();
        m3.e.Companion companion2 = m3.e.INSTANCE;
        this.targetOffset = companion2.b();
        this.currentPosition = companion2.b();
        this.currentSize = companion.a();
        this.animatedValue = c6.e(null, null, 2, null);
        this.additionalOffset = companion2.c();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    private final g a(p0 coroutineScope, q boundsTransform) {
        r rVar;
        g gVarM;
        n0 n0Var;
        long j15 = this.targetOffset;
        if ((9223372034707292159L & j15) != 9205357640488583168L) {
            long j16 = this.targetSize;
            if (j16 != 9205357640488583168L) {
                g gVarC = h.c(j15, j16);
                c<g, s> cVar = this.animatable;
                if (cVar == null) {
                    cVar = new c<>(gVarC, s3.S(g.INSTANCE), null, null, 12, null);
                }
                this.animatable = cVar;
                if (this.isPending) {
                    this.isPending = false;
                    if (k0.a() && (n0Var = this.lookaheadAnimationVisualDebugHelper) != null) {
                        n0Var.a(boundsTransform.a(c(), gVarC), c(), gVarC, cVar.n());
                    }
                    r0 r0Var = r0.UNDISPATCHED;
                    a aVar = new a(cVar, gVarC, boundsTransform, this, null);
                    rVar = this;
                    ju.k.d(coroutineScope, null, r0Var, aVar, 1, null);
                } else {
                    rVar = this;
                }
            } else {
                rVar = this;
            }
        } else {
            rVar = this;
        }
        c<g, s> cVar2 = rVar.animatable;
        return (cVar2 == null || (gVarM = cVar2.m()) == null) ? g.INSTANCE.a() : gVarM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final g b() {
        return (g) this.animatedValue.getValue();
    }

    private final void j(g gVar) {
        this.animatedValue.setValue(gVar);
    }

    private final void m(long offset) {
        if ((this.targetOffset & 9223372034707292159L) != 9205357640488583168L && !n.h(o.d(offset), o.d(this.targetOffset))) {
            this.isPending = true;
        }
        this.targetOffset = offset;
        if ((this.currentPosition & 9223372034707292159L) == 9205357640488583168L) {
            this.currentPosition = offset;
        }
    }

    public final g c() {
        long j15 = this.currentSize;
        long j16 = this.currentPosition;
        if ((9223372034707292159L & j16) == 9205357640488583168L || j15 == 9205357640488583168L) {
            return null;
        }
        return h.c(j16, j15);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCurrentSize() {
        return this.currentSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n0 getLookaheadAnimationVisualDebugHelper() {
        return this.lookaheadAnimationVisualDebugHelper;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTargetOffset() {
        return this.targetOffset;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTargetSize() {
        return this.targetSize;
    }

    public final g h() {
        if (i()) {
            return null;
        }
        return b();
    }

    public final boolean i() {
        if (this.isPending) {
            return false;
        }
        c<g, s> cVar = this.animatable;
        return cVar == null || !cVar.p();
    }

    public final void k(n0 n0Var) {
        this.lookaheadAnimationVisualDebugHelper = n0Var;
    }

    public final void l(long position, long size) {
        this.currentPosition = position;
        this.currentSize = size;
    }

    public final void n(s0 lookaheadScope, a2.a placementScope, p0 coroutineScope, boolean directManipulationParentsDirty, boolean includeMotionFrameOfReference, q boundsTransform) {
        b0 b0VarM = placementScope.m();
        if (b0VarM != null) {
            b0 b0VarI = lookaheadScope.i(placementScope);
            long jC = m3.e.INSTANCE.c();
            if (!includeMotionFrameOfReference && directManipulationParentsDirty) {
                List<b0> arrayList = this.directManipulationParents;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                int i15 = 0;
                b0 b0VarG = b0VarM;
                while (!t.c(lookaheadScope.e(b0VarG), b0VarI)) {
                    if (b0VarG.E()) {
                        if (arrayList.size() == i15) {
                            arrayList.add(b0VarG);
                            jC = m3.e.q(jC, c0.f(b0VarG));
                        } else if (!t.c(arrayList.get(i15), b0VarG)) {
                            long jP = m3.e.p(jC, c0.f(arrayList.get(i15)));
                            arrayList.set(i15, b0VarG);
                            jC = m3.e.q(jP, c0.f(b0VarG));
                        }
                        i15++;
                    }
                    b0VarG = b0VarG.G();
                    if (b0VarG == null) {
                        break;
                    }
                }
                int size = arrayList.size() - 1;
                if (i15 <= size) {
                    while (true) {
                        jC = m3.e.p(jC, c0.f(arrayList.get(size)));
                        arrayList.remove(arrayList.size() - 1);
                        if (size == i15) {
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                this.directManipulationParents = arrayList;
            }
            this.additionalOffset = m3.e.q(this.additionalOffset, jC);
            m(m3.e.q(s0.y(lookaheadScope, b0VarI, b0VarM, 0L, includeMotionFrameOfReference, 2, null), this.additionalOffset));
            j(a(coroutineScope, boundsTransform).u(m3.e.e(this.additionalOffset ^ (-9223372034707292160L))));
        }
    }

    public final void o(long size) {
        if (this.targetSize != 9205357640488583168L && !c5.r.e(c5.s.c(size), c5.s.c(this.targetSize))) {
            this.isPending = true;
        }
        this.targetSize = size;
        if (this.currentSize == 9205357640488583168L) {
            this.currentSize = size;
        }
    }
}
