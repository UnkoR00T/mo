package p143z0;

import a4.PointerInputChange;
import a4.o;
import a4.q;
import a4.s;
import android.view.KeyEvent;
import c5.y;
import er.l;
import er.p;
import g4.i1;
import g4.j1;
import java.util.List;
import ju.p0;
import l3.n0;
import l3.o0;
import l3.t0;
import n4.f0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import vq.k;
import w0.g0;
import w0.g2;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010\u001aJ@\u0010+\u001a\u00020\u00182.\u0010*\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00180&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180(\u0012\u0006\u0012\u0004\u0018\u00010)0%H\u0096@¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\"H\u0016¢\u0006\u0004\b.\u0010\u001aJ\u0017\u00101\u001a\u00020\u00182\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\rH\u0016¢\u0006\u0004\b3\u00104JU\u00105\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0018H\u0016¢\u0006\u0004\b7\u0010\u001dJ\u000f\u00108\u001a\u00020\u0018H\u0016¢\u0006\u0004\b8\u0010\u001dJ\u0017\u0010:\u001a\u00020\r2\u0006\u00100\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\r2\u0006\u00100\u001a\u000209H\u0016¢\u0006\u0004\b<\u0010;J'\u0010C\u001a\u00020\u00182\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0013\u0010F\u001a\u00020\u0018*\u00020EH\u0016¢\u0006\u0004\bF\u0010GR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010JR\u001a\u0010M\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\bK\u0010K\u001a\u0004\bL\u00104R\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR*\u0010i\u001a\u0016\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020\r\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR4\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0(\u0012\u0006\u0012\u0004\u0018\u00010)\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010hR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lz0/u2;", "Lz0/t0;", "Ly3/g;", "Lg4/i1;", "Lz0/z1;", "Lz0/v2;", "state", "Lw0/g2;", "overscrollEffect", "Lz0/e1;", "flingBehavior", "Lz0/a2;", "orientation", "", "enabled", "reverseDirection", "Lb1/l;", "interactionSource", "Lz0/y;", "bringIntoViewSpec", "<init>", "(Lz0/v2;Lw0/g2;Lz0/e1;Lz0/a2;ZZLb1/l;Lz0/y;)V", "Lc5/y;", "velocity", "Loq/i0;", "z4", "(J)V", "y4", "u4", "()V", "w4", "E4", "B4", "s4", "Lm3/e;", "delta", "C0", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lz0/m0$b;", "Ltq/e;", "", "forEachDelta", "A3", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "startedPosition", "Q3", "Lz0/m0$d;", "event", "R3", "(Lz0/m0$d;)V", "i4", "()Z", "D4", "(Lz0/v2;Lz0/a2;Lw0/g2;ZZLz0/e1;Lb1/l;Lz0/y;)V", "W2", "I", "Ly3/b;", "W1", "(Landroid/view/KeyEvent;)Z", "v1", "La4/o;", "pointerEvent", "La4/q;", "pass", "Lc5/r;", "bounds", "Y", "(La4/o;La4/q;J)V", "Ln4/i0;", "E2", "(Ln4/i0;)V", "X", "Lw0/g2;", "Lz0/e1;", "Z", "R2", "shouldAutoInvalidate", "Lz3/b;", "h0", "Lz3/b;", "nestedScrollDispatcher", "Lz0/j2;", "q0", "Lz0/j2;", "defaultFlingBehavior", "Lz0/a3;", "r0", "Lz0/a3;", "scrollingLogic", "Lz0/p2;", "s0", "Lz0/p2;", "nestedScrollConnection", "Ll3/n0;", "t0", "Ll3/n0;", "focusTargetModifierNode", "Lz0/b0;", "u0", "Lz0/b0;", "contentInViewNode", "", "v0", "Ler/p;", "scrollByAction", "w0", "scrollByOffsetAction", "Lz0/p1;", "x0", "Lz0/p1;", "mouseWheelScrollingLogic", "Lz0/i3;", "y0", "Lz0/i3;", "trackpadScrollingLogic", "Lz0/i2;", "z0", "Lz0/i2;", "scrollableContainerNode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u2 extends t0 implements y3.g, i1, z1 {

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private g2 overscrollEffect;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private e1 flingBehavior;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private final z3.b nestedScrollDispatcher;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private final j2 defaultFlingBehavior;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private final a3 scrollingLogic;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private final p2 nestedScrollConnection;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private final n0 focusTargetModifierNode;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private final b0 contentInViewNode;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private p<? super Float, ? super Float, Boolean> scrollByAction;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private p<? super m3.e, ? super tq.e<? super m3.e>, ? extends Object> scrollByOffsetAction;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private p1 mouseWheelScrollingLogic;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private i3 trackpadScrollingLogic;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private i2 scrollableContainerNode;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/s1;", "Loq/i0;", "<anonymous>", "(Lz0/s1;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<s1, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<l<? super m0.b, i0>, tq.e<? super i0>, Object> f231735g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a3 f231736h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l<? super m0.b, i0>, ? super tq.e<? super i0>, ? extends Object> pVar, a3 a3Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f231735g = pVar;
            this.f231736h = a3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(s1 s1Var, a3 a3Var, m0.b bVar) {
            s1Var.a(m3.e.r(a3Var.D(bVar.getDelta()), bVar.getIsIndirectPointerEvent() ? -1.0f : 1.0f), z3.g.INSTANCE.b());
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231733e;
            if (i15 == 0) {
                u.b(obj);
                final s1 s1Var = (s1) this.f231734f;
                p<l<? super m0.b, i0>, tq.e<? super i0>, Object> pVar = this.f231735g;
                final a3 a3Var = this.f231736h;
                l<? super m0.b, i0> lVar = new l() { // from class: z0.t2
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u2.a.O(s1Var, a3Var, (m0.b) obj2);
                    }
                };
                this.f231733e = 1;
                if (pVar.B(lVar, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(s1 s1Var, tq.e<? super i0> eVar) {
            return ((a) v(s1Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f231735g, this.f231736h, eVar);
            aVar.f231734f = obj;
            return aVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.a implements p<y, tq.e<? super i0>, Object> {
        b(Object obj) {
            super(2, obj, u2.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(y yVar, tq.e<? super i0> eVar) {
            return c(yVar.getPackedValue(), eVar);
        }

        public final Object c(long j15, tq.e<? super i0> eVar) {
            return u2.v4((u2) this.f66376a, j15, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.a implements p<y, tq.e<? super i0>, Object> {
        c(Object obj) {
            super(2, obj, u2.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(y yVar, tq.e<? super i0> eVar) {
            return c(yVar.getPackedValue(), eVar);
        }

        public final Object c(long j15, tq.e<? super i0> eVar) {
            return u2.x4((u2) this.f66376a, j15, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m0.d f231738f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u2 f231739g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m0.d dVar, u2 u2Var, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f231738f = dVar;
            this.f231739g = u2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231737e;
            if (i15 == 0) {
                u.b(obj);
                float f15 = this.f231738f.getIsIndirectPointerEvent() ? -1.0f : 1.0f;
                a3 a3Var = this.f231739g.scrollingLogic;
                long jM = y.m(this.f231738f.getVelocity(), f15);
                this.f231737e = 1;
                if (a3Var.w(jM, false, this) == objE) {
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
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f231738f, this.f231739g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231740e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f231742g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/s1;", "Loq/i0;", "<anonymous>", "(Lz0/s1;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends k implements p<s1, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f231743e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f231744f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f231745g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j15, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f231745g = j15;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f231743e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                ((s1) this.f231744f).b(this.f231745g, z3.g.INSTANCE.b());
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(s1 s1Var, tq.e<? super i0> eVar) {
                return ((a) v(s1Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f231745g, eVar);
                aVar.f231744f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j15, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f231742g = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231740e;
            if (i15 == 0) {
                u.b(obj);
                a3 a3Var = u2.this.scrollingLogic;
                z1 z1Var = z1.UserInput;
                a aVar = new a(this.f231742g, null);
                this.f231740e = 1;
                if (a3Var.B(z1Var, aVar, this) == objE) {
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
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u2.this.new e(this.f231742g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231746e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f231748g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j15, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f231748g = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231746e;
            if (i15 == 0) {
                u.b(obj);
                a3 a3Var = u2.this.scrollingLogic;
                long j15 = this.f231748g;
                this.f231746e = 1;
                if (a3Var.w(j15, false, this) == objE) {
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
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u2.this.new f(this.f231748g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231749e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f231751g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j15, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f231751g = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231749e;
            if (i15 == 0) {
                u.b(obj);
                a3 a3Var = u2.this.scrollingLogic;
                long j15 = this.f231751g;
                this.f231749e = 1;
                if (a3Var.w(j15, true, this) == objE) {
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
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u2.this.new g(this.f231751g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class h extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231752e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f231754g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f231755h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f15, float f16, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f231754g = f15;
            this.f231755h = f16;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231752e;
            if (i15 == 0) {
                u.b(obj);
                a3 a3Var = u2.this.scrollingLogic;
                float f15 = this.f231754g;
                float f16 = this.f231755h;
                long jE = m3.e.e((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax));
                this.f231752e = 1;
                if (n2.l(a3Var, jE, this) == objE) {
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
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u2.this.new h(this.f231754g, this.f231755h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/e;", "offset", "<anonymous>", "(Lm3/e;)Lm3/e;"}, k = 3, mv = {2, 1, 0})
    static final class i extends k implements p<m3.e, tq.e<? super m3.e>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231756e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ long f231757f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(m3.e eVar, tq.e<? super m3.e> eVar2) {
            return M(eVar.getPackedValue(), eVar2);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231756e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            long j15 = this.f231757f;
            a3 a3Var = u2.this.scrollingLogic;
            this.f231756e = 1;
            Object objL = n2.l(a3Var, j15, this);
            return objL == objE ? objE : objL;
        }

        public final Object M(long j15, tq.e<? super m3.e> eVar) {
            return ((i) v(m3.e.d(j15), eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            i iVar = u2.this.new i(eVar);
            iVar.f231757f = ((m3.e) obj).getPackedValue();
            return iVar;
        }
    }

    public u2(v2 v2Var, g2 g2Var, e1 e1Var, a2 a2Var, boolean z15, boolean z16, b1.l lVar, y yVar) {
        super(n2.f(), z15, lVar, a2Var);
        this.overscrollEffect = g2Var;
        this.flingBehavior = e1Var;
        z3.b bVar = new z3.b();
        this.nestedScrollDispatcher = bVar;
        j2 j2VarA = y2.a();
        this.defaultFlingBehavior = j2VarA;
        g2 g2Var2 = this.overscrollEffect;
        e1 e1Var2 = this.flingBehavior;
        a3 a3Var = new a3(v2Var, g2Var2, e1Var2 == null ? j2VarA : e1Var2, a2Var, z16, bVar, this, new er.a() { // from class: z0.q2
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(u2.A4(this.f231633a));
            }
        });
        this.scrollingLogic = a3Var;
        p2 p2Var = new p2(a3Var, z15);
        this.nestedScrollConnection = p2Var;
        this.focusTargetModifierNode = (n0) n3(o0.b(t0.INSTANCE.b(), null, 2, null));
        b0 b0Var = (b0) n3(new b0(a2Var, a3Var, z16, yVar, new er.a() { // from class: z0.r2
            @Override // er.a
            public final Object a() {
                return u2.t4(this.f231675a);
            }
        }));
        this.contentInViewNode = b0Var;
        n3(z3.f.c(p2Var, bVar));
        n3(new j1.k(b0Var));
        if (g0.isDelayPressesUsingGestureConsumptionEnabled) {
            return;
        }
        this.scrollableContainerNode = (i2) n3(new i2(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A4(u2 u2Var) {
        return u2Var.getIsAttached();
    }

    private final void B4() {
        this.scrollByAction = new p() { // from class: z0.s2
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Boolean.valueOf(u2.C4(this.f231678a, ((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            }
        };
        this.scrollByOffsetAction = new i(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C4(u2 u2Var, float f15, float f16) {
        ju.k.d(u2Var.M2(), null, null, u2Var.new h(f15, f16, null), 3, null);
        return true;
    }

    private final void E4() {
        if (getIsAttached()) {
            this.defaultFlingBehavior.d(g4.h.o(this));
        }
    }

    private final void s4() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.g t4(u2 u2Var) {
        return o0.c(u2Var.focusTargetModifierNode);
    }

    private final void u4() {
        if (this.mouseWheelScrollingLogic == null) {
            this.mouseWheelScrollingLogic = new p1(this.scrollingLogic, v.a(this), new b(this), g4.h.o(this));
        }
        p1 p1Var = this.mouseWheelScrollingLogic;
        if (p1Var != null) {
            p1Var.A(M2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object v4(u2 u2Var, long j15, tq.e eVar) {
        u2Var.z4(j15);
        return i0.f148189a;
    }

    private final void w4() {
        if (this.trackpadScrollingLogic == null) {
            this.trackpadScrollingLogic = new i3(this.scrollingLogic, new c(this), g4.h.o(this));
        }
        i3 i3Var = this.trackpadScrollingLogic;
        if (i3Var != null) {
            i3Var.u(M2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object x4(u2 u2Var, long j15, tq.e eVar) {
        u2Var.y4(j15);
        return i0.f148189a;
    }

    private final void y4(long velocity) {
        ju.k.d(this.nestedScrollDispatcher.e(), null, null, new f(velocity, null), 3, null);
    }

    private final void z4(long velocity) {
        ju.k.d(this.nestedScrollDispatcher.e(), null, null, new g(velocity, null), 3, null);
    }

    @Override // p143z0.t0
    public Object A3(p<? super l<? super m0.b, i0>, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super i0> eVar) {
        a3 a3Var = this.scrollingLogic;
        Object objB = a3Var.B(z1.UserInput, new a(pVar, a3Var, null), eVar);
        return objB == uq.b.e() ? objB : i0.f148189a;
    }

    @Override // p143z0.z1
    public void C0(long delta) {
        if (getIsAttached()) {
            g4.h.e(this, delta);
        }
    }

    public final void D4(v2 state, a2 orientation, g2 overscrollEffect, boolean enabled, boolean reverseDirection, e1 flingBehavior, b1.l interactionSource, y bringIntoViewSpec) {
        boolean z15;
        if (getEnabled() != enabled) {
            this.nestedScrollConnection.a(enabled);
            i2 i2Var = this.scrollableContainerNode;
            if (i2Var != null) {
                i2Var.o3(enabled);
            }
            z15 = true;
        } else {
            z15 = false;
        }
        boolean z16 = z15;
        boolean zK = this.scrollingLogic.K(state, orientation, overscrollEffect, reverseDirection, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.I3(orientation, reverseDirection, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        k4(n2.f(), enabled, interactionSource, this.scrollingLogic.v() ? a2.Vertical : a2.Horizontal, zK);
        if (z16) {
            s4();
            j1.d(this);
        }
    }

    @Override // g4.i1
    public void E2(n4.i0 i0Var) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            B4();
        }
        p<? super Float, ? super Float, Boolean> pVar = this.scrollByAction;
        if (pVar != null) {
            f0.U(i0Var, null, pVar, 1, null);
        }
        p<? super m3.e, ? super tq.e<? super m3.e>, ? extends Object> pVar2 = this.scrollByOffsetAction;
        if (pVar2 != null) {
            f0.V(i0Var, pVar2);
        }
    }

    @Override // g4.g, g4.f1
    public void I() {
        Z1();
        E4();
        p1 p1Var = this.mouseWheelScrollingLogic;
        if (p1Var != null) {
            p1Var.g(g4.h.o(this));
        }
        i3 i3Var = this.trackpadScrollingLogic;
        if (i3Var != null) {
            i3Var.g(g4.h.o(this));
        }
    }

    @Override // p143z0.t0
    public void Q3(long startedPosition) {
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // p143z0.t0
    public void R3(m0.d event) {
        ju.k.d(this.nestedScrollDispatcher.e(), null, null, new d(event, this, null), 3, null);
    }

    @Override // y3.g
    public boolean W1(KeyEvent event) {
        long jE;
        if (!getEnabled()) {
            return false;
        }
        long jA = y3.d.a(event);
        y3.a.Companion companion = y3.a.INSTANCE;
        if ((!y3.a.R(jA, companion.F()) && !y3.a.R(y3.d.a(event), companion.G())) || !y3.c.e(y3.d.b(event), y3.c.INSTANCE.a()) || y3.d.e(event)) {
            return false;
        }
        if (this.scrollingLogic.v()) {
            int iB3 = (int) (this.contentInViewNode.B3() & BodyPartID.bodyIdMax);
            jE = m3.e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(y3.a.R(y3.d.a(event), companion.G()) ? iB3 : -iB3)) & BodyPartID.bodyIdMax));
        } else {
            int iB4 = (int) (this.contentInViewNode.B3() >> 32);
            jE = m3.e.e((((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(y3.a.R(y3.d.a(event), companion.G()) ? iB4 : -iB4)) << 32));
        }
        ju.k.d(M2(), null, null, new e(jE, null), 3, null);
        return true;
    }

    @Override // f3.m.c
    public void W2() {
        E4();
        p1 p1Var = this.mouseWheelScrollingLogic;
        if (p1Var != null) {
            p1Var.g(g4.h.o(this));
        }
        i3 i3Var = this.trackpadScrollingLogic;
        if (i3Var != null) {
            i3Var.g(g4.h.o(this));
        }
    }

    @Override // p143z0.t0, g4.f1
    public void Y(o pointerEvent, q pass, long bounds) {
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (E3().b(a4.p0.f(listC.get(i15).getType())).booleanValue()) {
                super.Y(pointerEvent, pass, bounds);
                break;
            }
        }
        I3();
        if (getEnabled()) {
            q qVar = q.Initial;
            if (pass == qVar && s.o(pointerEvent.getType(), s.INSTANCE.l())) {
                u4();
            }
            p1 p1Var = this.mouseWheelScrollingLogic;
            if (p1Var != null) {
                p1Var.z(pointerEvent, pass, bounds);
            }
            if (pass == qVar) {
                int type = pointerEvent.getType();
                s.Companion companion = s.INSTANCE;
                if (s.o(type, companion.f()) || s.o(pointerEvent.getType(), companion.e()) || s.o(pointerEvent.getType(), companion.d())) {
                    w4();
                }
            }
            i3 i3Var = this.trackpadScrollingLogic;
            if (i3Var != null) {
                i3Var.t(pointerEvent, pass, bounds);
            }
        }
    }

    @Override // p143z0.t0
    /* JADX INFO: renamed from: i4 */
    public boolean getStartDragImmediately() {
        return this.scrollingLogic.C();
    }

    @Override // y3.g
    public boolean v1(KeyEvent event) {
        return false;
    }
}
