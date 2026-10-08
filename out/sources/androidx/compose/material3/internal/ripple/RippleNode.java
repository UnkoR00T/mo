package androidx.compose.material3.internal.ripple;

import androidx.compose.material3.internal.ripple.RippleNode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import b1.g;
import b1.i;
import b1.j;
import b1.n;
import c5.s;
import f3.m;
import fr.t;
import g4.e;
import g4.q;
import g4.y;
import j2.h;
import j2.o;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import n3.i2;
import n3.m1;
import n3.p1;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p3.d;
import p3.f;
import pq.v;
import r0.q0;
import u0.c;
import u0.j0;
import u0.l;
import u0.p;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001iB5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0014*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\u0014*\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u0014*\u00020\u0017H&¢\u0006\u0004\b#\u0010\u0019J'\u0010)\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020&2\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H&¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010<\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00102R\"\u0010(\u001a\u00020'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b=\u00104\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010F\u001a\u00020&2\u0006\u0010B\u001a\u00020&8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b!\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00100R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR \u0010[\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010PR+\u0010a\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010]\u001a\u0004\b^\u00102\"\u0004\b_\u0010`R\u001c\u0010e\u001a\b\u0018\u00010bR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0011\u0010h\u001a\u00020f8F¢\u0006\u0006\u001a\u0004\bg\u0010E¨\u0006j"}, d2 = {"Landroidx/compose/material3/internal/ripple/RippleNode;", "Lf3/m$c;", "Lg4/e;", "Lg4/q;", "Lg4/y;", "Lb1/j;", "interactionSource", "", "bounded", "Lc5/h;", "radius", "Ln3/p1;", "color", "Lkotlin/Function0;", "Landroidx/compose/material3/internal/ripple/b;", "rippleNodeConfig", "<init>", "(Lb1/j;ZFLn3/p1;Ler/a;Lfr/k;)V", "Lb1/n;", "pressInteraction", "Loq/i0;", "O3", "(Lb1/n;)V", "Lp3/f;", "E3", "(Lp3/f;)V", "Lc5/r;", "size", "e", "(J)V", "W2", "()V", "Lp3/c;", "y", "(Lp3/c;)V", "D3", "Lb1/n$b;", "interaction", "Lm3/k;", "", "targetRadius", "C3", "(Lb1/n$b;JF)V", "Q3", "(Lb1/n$b;)V", "r", "Lb1/j;", "s", "Z", "J3", "()Z", "t", "F", "Ln3/p1;", "v", "Ler/a;", "L3", "()Ler/a;", "w", "R2", "shouldAutoInvalidate", "x", "N3", "()F", "setTargetRadius", "(F)V", "value", "J", "M3", "()J", "rippleSize", "z", "hasValidSize", "Lr0/q0;", "A", "Lr0/q0;", "pendingInteractions", "Lu0/c;", "Lu0/p;", "B", "Lu0/c;", "animatedAlpha", "", "Lb1/i;", "C", "Ljava/util/List;", "interactions", ip.a.f96138c, "Lb1/i;", "currentInteraction", "E", "animatedFocusRingInterpolation", "<set-?>", "Lm2/a3;", "P3", "R3", "(Z)V", "isFocused", "Landroidx/compose/material3/internal/ripple/RippleNode$a;", "G", "Landroidx/compose/material3/internal/ripple/RippleNode$a;", "focusedBorderLogic", "Landroidx/compose/ui/graphics/Color;", "K3", "rippleColor", "a", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class RippleNode extends m.c implements e, q, y {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final q0<n> pendingInteractions;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final c<Float, p> animatedAlpha;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final List<i> interactions;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private i currentInteraction;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final c<Float, p> animatedFocusRingInterpolation;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final a3 isFocused;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private a focusedBorderLogic;
    private final p1 color;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final j interactionSource;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final er.a<androidx.compose.material3.internal.ripple.b> rippleNodeConfig;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float targetRadius;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long rippleSize;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean hasValidSize;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/internal/ripple/RippleNode$a;", "", "<init>", "(Landroidx/compose/material3/internal/ripple/RippleNode;)V", "Lp3/f;", "drawScope", "Lkotlin/Function0;", "Lc5/h;", "width", "inset", "Landroidx/compose/ui/graphics/c;", "brush", "Ln3/i2;", "outline", "Loq/i0;", "b", "(Lp3/f;Ler/a;Ler/a;Landroidx/compose/ui/graphics/c;Ln3/i2;)V", "Lq3/c;", "d", "()Lq3/c;", "Lj2/h;", "a", "Lj2/h;", "getBorderLogic", "()Lj2/h;", "borderLogic", "Lq3/c;", "getLayer", "setLayer", "(Lq3/c;)V", "layer", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h borderLogic = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private q3.c layer;

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q3.c c(a aVar) {
            q3.c cVar = aVar.layer;
            if (cVar != null) {
                return cVar;
            }
            q3.c cVarD = aVar.d();
            aVar.layer = cVarD;
            return cVarD;
        }

        public final void b(f drawScope, er.a<c5.h> width, er.a<c5.h> inset, androidx.compose.ui.graphics.c brush, i2 outline) {
            this.borderLogic.l(drawScope, width, inset, brush, new er.a() { // from class: j2.u
                @Override // er.a
                public final Object a() {
                    return RippleNode.a.c(this.f98643a);
                }
            }, outline);
        }

        public final q3.c d() {
            return g4.h.p(RippleNode.this).c();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9858e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f9859f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RippleNode f9861a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f9862b;

            /* JADX INFO: renamed from: androidx.compose.material3.internal.ripple.RippleNode$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C0203a extends k implements er.p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f9863e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ RippleNode f9864f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ float f9865g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ l<Float> f9866h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0203a(RippleNode rippleNode, float f15, l<Float> lVar, tq.e<? super C0203a> eVar) {
                    super(2, eVar);
                    this.f9864f = rippleNode;
                    this.f9865g = f15;
                    this.f9866h = lVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f9863e;
                    if (i15 == 0) {
                        u.b(obj);
                        u0.c cVar = this.f9864f.animatedAlpha;
                        Float fD = vq.b.d(this.f9865g);
                        l<Float> lVar = this.f9866h;
                        this.f9863e = 1;
                        if (u0.c.f(cVar, fD, lVar, null, null, this, 12, null) == objE) {
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
                    return ((C0203a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C0203a(this.f9864f, this.f9865g, this.f9866h, eVar);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.material3.internal.ripple.RippleNode$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C0204b extends k implements er.p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f9867e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ RippleNode f9868f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ l<Float> f9869g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0204b(RippleNode rippleNode, l<Float> lVar, tq.e<? super C0204b> eVar) {
                    super(2, eVar);
                    this.f9868f = rippleNode;
                    this.f9869g = lVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f9867e;
                    if (i15 == 0) {
                        u.b(obj);
                        u0.c cVar = this.f9868f.animatedAlpha;
                        Float fD = vq.b.d(0.0f);
                        l<Float> lVar = this.f9869g;
                        this.f9867e = 1;
                        if (u0.c.f(cVar, fD, lVar, null, null, this, 12, null) == objE) {
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
                    return ((C0204b) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C0204b(this.f9868f, this.f9869g, eVar);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class c extends k implements er.p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f9870e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ RippleNode f9871f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ boolean f9872g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ androidx.compose.material3.internal.ripple.b f9873h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(RippleNode rippleNode, boolean z15, androidx.compose.material3.internal.ripple.b bVar, tq.e<? super c> eVar) {
                    super(2, eVar);
                    this.f9871f = rippleNode;
                    this.f9872g = z15;
                    this.f9873h = bVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f9870e;
                    if (i15 == 0) {
                        u.b(obj);
                        u0.c cVar = this.f9871f.animatedFocusRingInterpolation;
                        Float fD = vq.b.d(this.f9872g ? 1.0f : 0.0f);
                        j0<Float> j0VarA = this.f9872g ? ((androidx.compose.material3.internal.ripple.b.AbstractC0207b.a) this.f9873h.getFocus()).a() : ((androidx.compose.material3.internal.ripple.b.AbstractC0207b.a) this.f9873h.getFocus()).i();
                        this.f9870e = 1;
                        if (u0.c.f(cVar, fD, j0VarA, null, null, this, 12, null) == objE) {
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
                    return ((c) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new c(this.f9871f, this.f9872g, this.f9873h, eVar);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class d extends k implements er.p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f9874e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ RippleNode f9875f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(RippleNode rippleNode, tq.e<? super d> eVar) {
                    super(2, eVar);
                    this.f9875f = rippleNode;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f9874e;
                    if (i15 == 0) {
                        u.b(obj);
                        u0.c cVar = this.f9875f.animatedFocusRingInterpolation;
                        Float fD = vq.b.d(0.0f);
                        this.f9874e = 1;
                        if (cVar.t(fD, this) == objE) {
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
                    return new d(this.f9875f, eVar);
                }
            }

            a(RippleNode rippleNode, p0 p0Var) {
                this.f9861a = rippleNode;
                this.f9862b = p0Var;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(i iVar, tq.e<? super i0> eVar) {
                if (iVar instanceof n) {
                    if (this.f9861a.hasValidSize) {
                        this.f9861a.O3((n) iVar);
                    } else {
                        this.f9861a.pendingInteractions.n(iVar);
                    }
                }
                boolean zP3 = this.f9861a.P3();
                if (iVar instanceof g) {
                    vq.b.a(this.f9861a.interactions.add(iVar));
                } else if (iVar instanceof b1.h) {
                    vq.b.a(this.f9861a.interactions.remove(((b1.h) iVar).getEnter()));
                } else if (iVar instanceof b1.d) {
                    this.f9861a.interactions.add(iVar);
                    this.f9861a.R3(true);
                    i0 i0Var = i0.f148189a;
                } else if (iVar instanceof b1.e) {
                    this.f9861a.interactions.remove(((b1.e) iVar).getFocus());
                    List list = this.f9861a.interactions;
                    int size = list.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size) {
                            this.f9861a.R3(false);
                            break;
                        }
                        if (((i) list.get(i15)) instanceof b1.d) {
                            break;
                        }
                        i15++;
                    }
                    i0 i0Var2 = i0.f148189a;
                } else if (iVar instanceof b1.b) {
                    vq.b.a(this.f9861a.interactions.add(iVar));
                } else if (iVar instanceof b1.c) {
                    vq.b.a(this.f9861a.interactions.remove(((b1.c) iVar).getStart()));
                } else {
                    if (!(iVar instanceof b1.a)) {
                        return i0.f148189a;
                    }
                    vq.b.a(this.f9861a.interactions.remove(((b1.a) iVar).getStart()));
                }
                i iVar2 = (i) v.z0(this.f9861a.interactions);
                androidx.compose.material3.internal.ripple.b bVarA = this.f9861a.L3().a();
                if (!t.c(this.f9861a.currentInteraction, iVar2)) {
                    if (iVar2 != null) {
                        float alpha = 0.0f;
                        if (iVar2 instanceof g) {
                            if (bVarA.getHover() instanceof androidx.compose.material3.internal.ripple.b.c.C0209b) {
                                alpha = ((androidx.compose.material3.internal.ripple.b.c.C0209b) bVarA.getHover()).getAlpha();
                            }
                        } else if (iVar2 instanceof b1.d) {
                            if (bVarA.getFocus() instanceof androidx.compose.material3.internal.ripple.b.AbstractC0207b.c) {
                                alpha = ((androidx.compose.material3.internal.ripple.b.AbstractC0207b.c) bVarA.getFocus()).getAlpha();
                            }
                        } else if ((iVar2 instanceof b1.b) && (bVarA.getDrag() instanceof androidx.compose.material3.internal.ripple.b.a.C0206b)) {
                            alpha = ((androidx.compose.material3.internal.ripple.b.a.C0206b) bVarA.getDrag()).getAlpha();
                        }
                        ju.k.d(this.f9862b, null, null, new C0203a(this.f9861a, alpha, o.d(iVar2), null), 3, null);
                    } else {
                        ju.k.d(this.f9862b, null, null, new C0204b(this.f9861a, o.e(this.f9861a.currentInteraction), null), 3, null);
                    }
                    if (!(bVarA.getFocus() instanceof androidx.compose.material3.internal.ripple.b.AbstractC0207b.a)) {
                        ju.k.d(this.f9862b, null, null, new d(this.f9861a, null), 3, null);
                    } else if (zP3 != this.f9861a.P3()) {
                        ju.k.d(this.f9862b, null, null, new c(this.f9861a, iVar2 instanceof b1.d, bVarA, null), 3, null);
                    }
                    this.f9861a.currentInteraction = iVar2;
                }
                return i0.f148189a;
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9858e;
            if (i15 == 0) {
                u.b(obj);
                p0 p0Var = (p0) this.f9859f;
                mu.g<i> gVarC = RippleNode.this.interactionSource.c();
                a aVar = new a(RippleNode.this, p0Var);
                this.f9858e = 1;
                if (gVarC.a(aVar, this) == objE) {
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
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = RippleNode.this.new b(eVar);
            bVar.f9859f = obj;
            return bVar;
        }
    }

    public /* synthetic */ RippleNode(j jVar, boolean z15, float f15, p1 p1Var, er.a aVar, fr.k kVar) {
        this(jVar, z15, f15, p1Var, aVar);
    }

    private final void E3(f fVar) throws Throwable {
        long j15;
        float fFloatValue = this.animatedAlpha.m().floatValue();
        if (fFloatValue > 0.0f) {
            long jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(this.color.a(), fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (this.bounded) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.a() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax));
                int iB = m1.INSTANCE.b();
                d drawContext = fVar.getDrawContext();
                long jA = drawContext.a();
                drawContext.f().q();
                try {
                    drawContext.getTransform().c(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iB);
                    j15 = jA;
                    try {
                        f.x2(fVar, jM9copywmQWz5c$default, this.targetRadius, 0L, 0.0f, null, null, 0, 124, null);
                        drawContext.f().j();
                        drawContext.g(j15);
                    } catch (Throwable th4) {
                        th = th4;
                        drawContext.f().j();
                        drawContext.g(j15);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    j15 = jA;
                }
            } else {
                f.x2(fVar, jM9copywmQWz5c$default, this.targetRadius, 0L, 0.0f, null, null, 0, 124, null);
            }
        }
        if (this.animatedFocusRingInterpolation.m().floatValue() > 0.0f) {
            a aVar = this.focusedBorderLogic;
            if (aVar == null) {
                aVar = new a();
            }
            this.focusedBorderLogic = aVar;
            androidx.compose.material3.internal.ripple.b.AbstractC0207b focus = this.rippleNodeConfig.a().getFocus();
            final androidx.compose.material3.internal.ripple.b.AbstractC0207b.a aVar2 = focus instanceof androidx.compose.material3.internal.ripple.b.AbstractC0207b.a ? (androidx.compose.material3.internal.ripple.b.AbstractC0207b.a) focus : null;
            if (aVar2 == null) {
                return;
            }
            i2 i2VarA = aVar2.getShape().a(fVar.a(), fVar.getLayoutDirection(), fVar);
            this.focusedBorderLogic.b(fVar, new er.a() { // from class: j2.q
                @Override // er.a
                public final Object a() {
                    return RippleNode.F3(aVar2, this);
                }
            }, new er.a() { // from class: j2.r
                @Override // er.a
                public final Object a() {
                    return RippleNode.G3(aVar2, this);
                }
            }, new SolidColor(aVar2.getInnerStrokeColor().a(), null), i2VarA);
            this.focusedBorderLogic.b(fVar, new er.a() { // from class: j2.s
                @Override // er.a
                public final Object a() {
                    return RippleNode.H3(aVar2, this);
                }
            }, new er.a() { // from class: j2.t
                @Override // er.a
                public final Object a() {
                    return RippleNode.I3(aVar2, this);
                }
            }, new SolidColor(aVar2.getOuterStrokeColor().a(), null), i2VarA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.h F3(androidx.compose.material3.internal.ripple.b.AbstractC0207b.a aVar, RippleNode rippleNode) {
        return c5.h.j(c5.h.n(aVar.getInnerStrokeWidth() * rippleNode.animatedFocusRingInterpolation.m().floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.h G3(androidx.compose.material3.internal.ripple.b.AbstractC0207b.a aVar, RippleNode rippleNode) {
        return c5.h.j(c5.h.n(aVar.getInnerStrokeInset() * rippleNode.animatedFocusRingInterpolation.m().floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.h H3(androidx.compose.material3.internal.ripple.b.AbstractC0207b.a aVar, RippleNode rippleNode) {
        return c5.h.j(c5.h.n(aVar.getOuterStrokeWidth() * rippleNode.animatedFocusRingInterpolation.m().floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.h I3(androidx.compose.material3.internal.ripple.b.AbstractC0207b.a aVar, RippleNode rippleNode) {
        return c5.h.j(c5.h.n(aVar.getOuterStrokeInset() * rippleNode.animatedFocusRingInterpolation.m().floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O3(n pressInteraction) {
        if (pressInteraction instanceof n.b) {
            C3((n.b) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof n.c) {
            Q3(((n.c) pressInteraction).getPress());
        } else if (pressInteraction instanceof n.a) {
            Q3(((n.a) pressInteraction).getPress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean P3() {
        return ((Boolean) this.isFocused.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R3(boolean z15) {
        this.isFocused.setValue(Boolean.valueOf(z15));
    }

    public abstract void C3(n.b interaction, long size, float targetRadius);

    public abstract void D3(f fVar);

    /* JADX INFO: renamed from: J3, reason: from getter */
    protected final boolean getBounded() {
        return this.bounded;
    }

    public final long K3() {
        return this.color.a();
    }

    protected final er.a<androidx.compose.material3.internal.ripple.b> L3() {
        return this.rippleNodeConfig;
    }

    /* JADX INFO: renamed from: M3, reason: from getter */
    protected final long getRippleSize() {
        return this.rippleSize;
    }

    /* JADX INFO: renamed from: N3, reason: from getter */
    protected final float getTargetRadius() {
        return this.targetRadius;
    }

    public abstract void Q3(n.b interaction);

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // f3.m.c
    public void W2() {
        ju.k.d(M2(), null, null, new b(null), 3, null);
    }

    @Override // g4.y, g4.k0
    public void e(long size) {
        this.hasValidSize = true;
        c5.d dVarO = g4.h.o(this);
        this.rippleSize = s.e(size);
        this.targetRadius = Float.isNaN(this.radius) ? j2.i.a(dVarO, this.bounded, this.rippleSize) : dVarO.l2(this.radius);
        q0<n> q0Var = this.pendingInteractions;
        Object[] objArr = q0Var.content;
        int i15 = q0Var._size;
        for (int i16 = 0; i16 < i15; i16++) {
            O3((n) objArr[i16]);
        }
        this.pendingInteractions.u();
    }

    @Override // g4.q
    public void y(p3.c cVar) throws Throwable {
        cVar.H2();
        D3(cVar);
        E3(cVar);
    }

    private RippleNode(j jVar, boolean z15, float f15, p1 p1Var, er.a<androidx.compose.material3.internal.ripple.b> aVar) {
        this.interactionSource = jVar;
        this.bounded = z15;
        this.radius = f15;
        this.color = p1Var;
        this.rippleNodeConfig = aVar;
        this.rippleSize = m3.k.INSTANCE.b();
        this.pendingInteractions = new q0<>(0, 1, null);
        this.animatedAlpha = u0.d.b(0.0f, 0.0f, 2, null);
        this.interactions = new ArrayList();
        this.animatedFocusRingInterpolation = u0.d.b(0.0f, 0.0f, 2, null);
        this.isFocused = c6.e(Boolean.FALSE, null, 2, null);
    }
}
