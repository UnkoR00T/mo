package androidx.compose.material.ripple;

import androidx.compose.ui.graphics.Color;
import b1.g;
import b1.h;
import b1.i;
import e2.RippleAlpha;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import n3.m1;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p3.f;
import pq.v;
import tq.e;
import u0.c;
import u0.d;
import u0.l;
import u0.p;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0015\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/material/ripple/b;", "", "", "bounded", "Lkotlin/Function0;", "Le2/b;", "rippleAlpha", "<init>", "(ZLer/a;)V", "Lb1/i;", "interaction", "Lju/p0;", "scope", "Loq/i0;", "c", "(Lb1/i;Lju/p0;)V", "Lp3/f;", "", "radius", "Landroidx/compose/ui/graphics/Color;", "color", "b", "(Lp3/f;FJ)V", "a", "Z", "Ler/a;", "Lu0/c;", "Lu0/p;", "Lu0/c;", "animatedAlpha", "", "d", "Ljava/util/List;", "interactions", "e", "Lb1/i;", "currentInteraction", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.a<RippleAlpha> rippleAlpha;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c<Float, p> animatedAlpha = d.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<i> interactions = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private i currentInteraction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements er.p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9782e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f9784g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l<Float> f9785h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f15, l<Float> lVar, e<? super a> eVar) {
            super(2, eVar);
            this.f9784g = f15;
            this.f9785h = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9782e;
            if (i15 == 0) {
                u.b(obj);
                c cVar = b.this.animatedAlpha;
                Float fD = vq.b.d(this.f9784g);
                l<Float> lVar = this.f9785h;
                this.f9782e = 1;
                if (c.f(cVar, fD, lVar, null, null, this, 12, null) == objE) {
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
            return b.this.new a(this.f9784g, this.f9785h, eVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.ripple.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class C0200b extends k implements er.p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9786e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l<Float> f9788g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0200b(l<Float> lVar, e<? super C0200b> eVar) {
            super(2, eVar);
            this.f9788g = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9786e;
            if (i15 == 0) {
                u.b(obj);
                c cVar = b.this.animatedAlpha;
                Float fD = vq.b.d(0.0f);
                l<Float> lVar = this.f9788g;
                this.f9786e = 1;
                if (c.f(cVar, fD, lVar, null, null, this, 12, null) == objE) {
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
            return ((C0200b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return b.this.new C0200b(this.f9788g, eVar);
        }
    }

    public b(boolean z15, er.a<RippleAlpha> aVar) {
        this.bounded = z15;
        this.rippleAlpha = aVar;
    }

    public final void b(f fVar, float f15, long j15) throws Throwable {
        long j16;
        float fFloatValue = this.animatedAlpha.m().floatValue();
        if (fFloatValue <= 0.0f) {
            return;
        }
        long jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(j15, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            f.x2(fVar, jM9copywmQWz5c$default, f15, 0L, 0.0f, null, null, 0, 124, null);
            return;
        }
        float fI = m3.k.i(fVar.a());
        float fG = m3.k.g(fVar.a());
        int iB = m1.INSTANCE.b();
        p3.d drawContext = fVar.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            drawContext.getTransform().c(0.0f, 0.0f, fI, fG, iB);
            j16 = jA;
            try {
                f.x2(fVar, jM9copywmQWz5c$default, f15, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.f().j();
                drawContext.g(j16);
            } catch (Throwable th4) {
                th = th4;
                drawContext.f().j();
                drawContext.g(j16);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            j16 = jA;
        }
    }

    public final void c(i interaction, p0 scope) {
        float draggedAlpha;
        if (interaction instanceof g) {
            this.interactions.add(interaction);
        } else if (interaction instanceof h) {
            this.interactions.remove(((h) interaction).getEnter());
        } else if (interaction instanceof b1.d) {
            this.interactions.add(interaction);
        } else if (interaction instanceof b1.e) {
            this.interactions.remove(((b1.e) interaction).getFocus());
        } else if (interaction instanceof b1.b) {
            this.interactions.add(interaction);
        } else if (interaction instanceof b1.c) {
            this.interactions.remove(((b1.c) interaction).getStart());
        } else if (!(interaction instanceof b1.a)) {
            return;
        } else {
            this.interactions.remove(((b1.a) interaction).getStart());
        }
        i iVar = (i) v.z0(this.interactions);
        if (t.c(this.currentInteraction, iVar)) {
            return;
        }
        if (iVar != null) {
            RippleAlpha rippleAlphaA = this.rippleAlpha.a();
            if (iVar instanceof g) {
                draggedAlpha = rippleAlphaA.getHoveredAlpha();
            } else if (iVar instanceof b1.d) {
                draggedAlpha = rippleAlphaA.getFocusedAlpha();
            } else {
                draggedAlpha = iVar instanceof b1.b ? rippleAlphaA.getDraggedAlpha() : 0.0f;
            }
            ju.k.d(scope, null, null, new a(draggedAlpha, e2.i.d(iVar), null), 3, null);
        } else {
            ju.k.d(scope, null, null, new C0200b(e2.i.e(this.currentInteraction), null), 3, null);
        }
        this.currentInteraction = iVar;
    }
}
