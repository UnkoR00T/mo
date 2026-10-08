package p046f2;

import CON.BackEventCompat;
import androidx.compose.ui.platform.f3;
import androidx.compose.ui.platform.g1;
import c5.b;
import d1.c4;
import d1.e0;
import d1.g4;
import d1.h0;
import er.l;
import er.p;
import er.q;
import fr.m0;
import h2.a2;
import h2.b2;
import h2.n1;
import h2.q1;
import h2.w1;
import h2.z0;
import ju.p0;
import lr.m;
import n3.e3;
import n3.y2;
import n3.z1;
import n4.f0;
import n4.v;
import oq.i0;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p143z0.d3;
import p143z0.e1;
import p143z0.h2;
import p143z0.v0;
import p143z0.w0;
import u0.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a¹\u0001\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a·\u0001\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0016H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\u001b*\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010#\u001a\u00020\u001b*\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0000¢\u0006\u0004\b#\u0010\"\u001a#\u0010%\u001a\u00020\u0000*\u00020\u00002\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010'\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b'\u0010(\"\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*\"\u001a\u00103\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lf3/m;", "modifier", "Lf2/hj;", "state", "Lkotlin/Function0;", "Loq/i0;", "onDismissRequest", "Lc5/h;", "maxWidth", "", "gesturesEnabled", "backHandlerEnabled", "dragHandle", "Ld1/c4;", "contentWindowInsets", "Ln3/y2;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "tonalElevation", "shadowElevation", "Lkotlin/Function1;", "Ld1/h0;", "content", "x", "(Lf3/m;Lf2/hj;Ler/a;FZZLer/p;Ler/p;Ln3/y2;JJFFLer/q;Lm2/r;III)V", "", "predictiveBackProgress", "y", "(FLf3/m;Lf2/hj;Ler/a;FZLn3/y2;JJFFLer/p;Ler/p;Ler/q;Lm2/r;III)V", "Ln3/a2;", "progress", "U", "(Ln3/a2;F)F", "V", "sheetState", "Y", "(Lf3/m;Lf2/hj;F)Lf3/m;", "W", "(Lf3/m;F)Lf3/m;", "a", "F", "PredictiveBackMaxScaleXDistance", "b", "PredictiveBackMaxScaleYDistance", "Ln3/d3;", "c", "J", "getPredictiveBackChildTransformOrigin", "()J", "PredictiveBackChildTransformOrigin", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f56629a = c5.h.n(48);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f56630b = c5.h.n(24);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f56631c = e3.a(0.5f, 0.0f);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmu/g;", "LCON/b;", "Landroidx/compose/material3/internal/BackEventCompat;", "progress", "Loq/i0;", "<anonymous>", "(Lmu/g;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements p<mu.g<? extends BackEventCompat>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f56633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f56634g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ u0.c<Float, u0.p> f56635h;

        /* JADX INFO: renamed from: f2.l1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C1305a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ u0.c<Float, u0.p> f56636a;

            C1305a(u0.c<Float, u0.p> cVar) {
                this.f56636a = cVar;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(BackEventCompat backEventCompat, tq.e<? super i0> eVar) {
                Object objT = this.f56636a.t(vq.b.d(w1.f80006a.a(backEventCompat.getProgress())), eVar);
                return objT == uq.b.e() ? objT : i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(er.a<i0> aVar, u0.c<Float, u0.p> cVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f56634g = aVar;
            this.f56635h = cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            if (u0.c.f(r3, r4, null, null, null, r11, 14, null) == r0) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r11.f56632e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r12)
                goto L52
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                oq.u.b(r12)     // Catch: java.util.concurrent.CancellationException -> L3b
                goto L35
            L1e:
                oq.u.b(r12)
                java.lang.Object r12 = r11.f56633f
                mu.g r12 = (mu.g) r12
                f2.l1$a$a r1 = new f2.l1$a$a     // Catch: java.util.concurrent.CancellationException -> L3b
                u0.c<java.lang.Float, u0.p> r4 = r11.f56635h     // Catch: java.util.concurrent.CancellationException -> L3b
                r1.<init>(r4)     // Catch: java.util.concurrent.CancellationException -> L3b
                r11.f56632e = r3     // Catch: java.util.concurrent.CancellationException -> L3b
                java.lang.Object r12 = r12.a(r1, r11)     // Catch: java.util.concurrent.CancellationException -> L3b
                if (r12 != r0) goto L35
                goto L51
            L35:
                er.a<oq.i0> r12 = r11.f56634g     // Catch: java.util.concurrent.CancellationException -> L3b
                r12.a()     // Catch: java.util.concurrent.CancellationException -> L3b
                goto L52
            L3b:
                u0.c<java.lang.Float, u0.p> r3 = r11.f56635h
                r12 = 0
                java.lang.Float r4 = vq.b.d(r12)
                r11.f56632e = r2
                r5 = 0
                r6 = 0
                r7 = 0
                r9 = 14
                r10 = 0
                r8 = r11
                java.lang.Object r12 = u0.c.f(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L52
            L51:
                return r0
            L52:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.l1.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.g<BackEventCompat> gVar, tq.e<? super i0> eVar) {
            return ((a) v(gVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f56634g, this.f56635h, eVar);
            aVar.f56633f = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hj f56638f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(hj hjVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f56638f = hjVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56637e;
            if (i15 == 0) {
                u.b(obj);
                hj hjVar = this.f56638f;
                this.f56637e = 1;
                if (hjVar.n(this) == objE) {
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
            return new b(this.f56638f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u0.c<Float, u0.p> f56640f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u0.c<Float, u0.p> cVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f56640f = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56639e;
            if (i15 == 0) {
                u.b(obj);
                u0.c<Float, u0.p> cVar = this.f56640f;
                Float fD = vq.b.d(0.0f);
                this.f56639e = 1;
                if (u0.c.f(cVar, fD, null, null, null, this, 14, null) == objE) {
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
            return new c(this.f56640f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hj f56642f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(hj hjVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f56642f = hjVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56641e;
            if (i15 == 0) {
                u.b(obj);
                hj hjVar = this.f56642f;
                this.f56641e = 1;
                if (hjVar.l(this) == objE) {
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
            return new d(this.f56642f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hj f56644f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(hj hjVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f56644f = hjVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56643e;
            if (i15 == 0) {
                u.b(obj);
                hj hjVar = this.f56644f;
                this.f56643e = 1;
                if (hjVar.c(this) == objE) {
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
            return new e(this.f56644f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hj f56646f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(hj hjVar, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f56646f = hjVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56645e;
            if (i15 == 0) {
                u.b(obj);
                hj hjVar = this.f56646f;
                this.f56645e = 1;
                if (hjVar.s(this) == objE) {
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
            return new f(this.f56646f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hj f56648f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(hj hjVar, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f56648f = hjVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56647e;
            if (i15 == 0) {
                u.b(obj);
                hj hjVar = this.f56648f;
                this.f56647e = 1;
                if (hjVar.c(this) == objE) {
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
            return new g(this.f56648f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class h extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hj f56650f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(hj hjVar, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f56650f = hjVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56649e;
            if (i15 == 0) {
                u.b(obj);
                hj hjVar = this.f56650f;
                this.f56649e = 1;
                if (hjVar.n(this) == objE) {
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
            return new h(this.f56650f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class i extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hj f56652f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(hj hjVar, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f56652f = hjVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56651e;
            if (i15 == 0) {
                u.b(obj);
                hj hjVar = this.f56652f;
                this.f56651e = 1;
                if (hjVar.l(this) == objE) {
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
            return ((i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new i(this.f56652f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"f2/l1$j", "Lz0/e1;", "Lz0/h2;", "", "initialVelocity", "a", "(Lz0/h2;FLtq/e;)Ljava/lang/Object;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f3 f56653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ hj f56654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c5.d f56655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d3 f56656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f56657e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f56658d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f56660f;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f56658d = obj;
                this.f56660f |= PKIFailureInfo.systemUnavail;
                return j.this.a(null, 0.0f, this);
            }
        }

        j(f3 f3Var, hj hjVar, c5.d dVar, d3 d3Var, er.a<i0> aVar) {
            this.f56653a = f3Var;
            this.f56654b = hjVar;
            this.f56655c = dVar;
            this.f56656d = d3Var;
            this.f56657e = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p143z0.e1
        public Object a(h2 h2Var, float f15, tq.e<? super Float> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f56660f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f56660f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objA = aVar.f56658d;
            Object objE = uq.b.e();
            int i16 = aVar.f56660f;
            try {
                if (i16 == 0) {
                    u.b(objA);
                    float f16 = this.f56653a.f();
                    m0 m0Var = new m0();
                    float fM = m.m(f15, -f16, f16);
                    m0Var.f66406a = fM;
                    if (fM > 0.0f) {
                        v0<ij> v0VarI = this.f56654b.d().i();
                        ij ijVar = ij.Hidden;
                        if (v0VarI.d(ijVar)) {
                            float fMax = Math.max(0.0f, this.f56654b.d().i().c(ijVar) - this.f56654b.o());
                            c5.d dVar = this.f56655c;
                            n0 n0Var = n0.f56958a;
                            float fL2 = dVar.l2(n0Var.h());
                            if (fMax < fL2) {
                                m0Var.f66406a *= fMax / fL2;
                                float fL3 = this.f56655c.l2(n0Var.q());
                                if (f15 >= fL3) {
                                    m0Var.f66406a = Math.max(m0Var.f66406a, fL3);
                                }
                            }
                        }
                    }
                    d3 d3Var = this.f56656d;
                    float f17 = m0Var.f66406a;
                    aVar.f56660f = 1;
                    objA = d3Var.a(h2Var, f17, aVar);
                    if (objA == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(objA);
                }
                float fFloatValue = ((Number) objA).floatValue();
                if (!this.f56654b.m()) {
                    this.f56657e.a();
                }
                return vq.b.d(fFloatValue);
            } catch (Throwable th4) {
                if (!this.f56654b.m()) {
                    this.f56657e.a();
                }
                throw th4;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56661a;

        static {
            int[] iArr = new int[ij.values().length];
            try {
                iArr[ij.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ij.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ij.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f56661a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c4 A(r rVar, int i15) {
        rVar.X(2091123090);
        if (t.k()) {
            t.o(2091123090, i15, -1, "androidx.compose.material3.BottomSheetImpl.<anonymous> (BottomSheet.kt:201)");
        }
        c4 c4VarP = n0.f56958a.p(rVar, 6);
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return c4VarP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float B(hj hjVar, float f15) {
        return hjVar.i().a().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(final hj hjVar, p0 p0Var, final er.a aVar) {
        if (hjVar.e().b(ij.Hidden).booleanValue()) {
            ju.k.d(p0Var, null, null, new i(hjVar, null), 3, null).C0(new l() { // from class: f2.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return l1.D(hjVar, aVar, (Throwable) obj);
                }
            });
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(hj hjVar, er.a aVar, Throwable th4) {
        if (!hjVar.m()) {
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.r E(final hj hjVar, final c5.r rVar, c5.b bVar) {
        ij ijVar;
        final float fK = c5.b.k(bVar.getValue());
        v0 v0VarH = p143z0.j.h(new l() { // from class: f2.s0
            @Override // er.l
            public final Object b(Object obj) {
                return l1.F(fK, rVar, hjVar, (w0) obj);
            }
        });
        int i15 = k.f56661a[hjVar.k().ordinal()];
        if (i15 == 1) {
            ijVar = ij.Hidden;
        } else if (i15 == 2) {
            ijVar = ij.PartiallyExpanded;
            if (!v0VarH.d(ijVar)) {
                ijVar = ij.Expanded;
                if (!v0VarH.d(ijVar)) {
                    ijVar = ij.Hidden;
                }
            }
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            ijVar = ij.Expanded;
            if (!v0VarH.d(ijVar)) {
                ijVar = ij.Hidden;
            }
        }
        return y.a(v0VarH, ijVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(float f15, c5.r rVar, hj hjVar, w0 w0Var) {
        w0Var.a(ij.Hidden, f15);
        if (((int) (rVar.getPackedValue() & BodyPartID.bodyIdMax)) > f15 / 2 && !hjVar.getSkipPartiallyExpanded()) {
            w0Var.a(ij.PartiallyExpanded, f15 / 2.0f);
        }
        if (((int) (rVar.getPackedValue() & BodyPartID.bodyIdMax)) != 0) {
            w0Var.a(ij.Expanded, Math.max(0.0f, f15 - ((int) (rVar.getPackedValue() & BodyPartID.bodyIdMax))));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(String str, n4.i0 i0Var) {
        f0.n0(i0Var, str);
        f0.I0(i0Var, 0.0f);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(p pVar, float f15, final hj hjVar, p pVar2, final er.a aVar, final p0 p0Var, final boolean z15, q qVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1483196812, i15, -1, "androidx.compose.material3.BottomSheetImpl.<anonymous> (BottomSheet.kt:345)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarV = ej.v(W(g4.c(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), (c4) pVar.B(rVar, 0)), f15), hjVar);
            p036e4.w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarV);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            if (pVar2 != null) {
                rVar.X(-444181086);
                a2.Companion companion3 = a2.INSTANCE;
                final String strB = b2.b(a2.a(ih.f56311a), rVar, 0);
                final String strB2 = b2.b(a2.a(ih.f56312b), rVar, 0);
                final String strB3 = b2.b(a2.a(ih.f56314d), rVar, 0);
                boolean zW = rVar.W(hjVar) | rVar.W(aVar) | rVar.G(p0Var);
                Object objE = rVar.E();
                if (zW || objE == r.INSTANCE.a()) {
                    objE = new er.a() { // from class: f2.k1
                        @Override // er.a
                        public final Object a() {
                            return l1.I(hjVar, aVar, p0Var);
                        }
                    };
                    rVar.v(objE);
                }
                f3.m mVarN = androidx.compose.foundation.b.n(companion, false, null, null, null, (er.a) objE, 15, null);
                boolean zA = rVar.a(z15) | rVar.W(hjVar) | rVar.W(strB2) | rVar.W(aVar) | rVar.W(strB3) | rVar.G(p0Var) | rVar.W(strB);
                Object objE2 = rVar.E();
                if (zA || objE2 == r.INSTANCE.a()) {
                    Object obj = new l() { // from class: f2.p0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l1.J(z15, hjVar, strB2, strB3, strB, aVar, p0Var, (n4.i0) obj2);
                        }
                    };
                    rVar.v(obj);
                    objE2 = obj;
                }
                ej.k(v.c(mVarN, true, (l) objE2), pVar2, rVar, 0);
                rVar.R();
            } else {
                i0Var = i0Var;
                rVar.X(-441815104);
                rVar.R();
            }
            qVar.w(i0Var, rVar, 6);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(hj hjVar, er.a aVar, p0 p0Var) {
        int i15 = k.f56661a[hjVar.f().ordinal()];
        if (i15 == 2) {
            ju.k.d(p0Var, null, null, new e(hjVar, null), 3, null);
        } else if (i15 != 3) {
            ju.k.d(p0Var, null, null, new f(hjVar, null), 3, null);
        } else {
            aVar.a();
            i0 i0Var = i0.f148189a;
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(boolean z15, final hj hjVar, String str, String str2, String str3, final er.a aVar, final p0 p0Var, n4.i0 i0Var) {
        if (z15) {
            f0.k(i0Var, str, new er.a() { // from class: f2.t0
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(l1.K(aVar));
                }
            });
            if (hjVar.f() == ij.PartiallyExpanded) {
                f0.n(i0Var, str2, new er.a() { // from class: f2.u0
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(l1.L(hjVar, p0Var, hjVar));
                    }
                });
            } else if (hjVar.h()) {
                f0.c(i0Var, str3, new er.a() { // from class: f2.v0
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(l1.M(hjVar, p0Var));
                    }
                });
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(er.a aVar) {
        aVar.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L(hj hjVar, p0 p0Var, hj hjVar2) {
        if (!hjVar.e().b(ij.Expanded).booleanValue()) {
            return true;
        }
        ju.k.d(p0Var, null, null, new g(hjVar2, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M(hj hjVar, p0 p0Var) {
        if (!hjVar.e().b(ij.PartiallyExpanded).booleanValue()) {
            return true;
        }
        ju.k.d(p0Var, null, null, new h(hjVar, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(float f15, f3.m mVar, hj hjVar, er.a aVar, float f16, boolean z15, y2 y2Var, long j15, long j16, float f17, float f18, p pVar, p pVar2, q qVar, int i15, int i16, int i17, r rVar, int i18) {
        y(f15, mVar, hjVar, aVar, f16, z15, y2Var, j15, j16, f17, f18, pVar, pVar2, qVar, rVar, p076m2.g4.a(i15 | 1), p076m2.g4.a(i16), i17);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c4 P(r rVar, int i15) {
        rVar.X(337082878);
        if (t.k()) {
            t.o(337082878, i15, -1, "androidx.compose.material3.BottomSheet.<anonymous> (BottomSheet.kt:125)");
        }
        c4 c4VarP = n0.f56958a.p(rVar, 6);
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return c4VarP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(hj hjVar, j0 j0Var, j0 j0Var2, j0 j0Var3) {
        hjVar.r(j0Var);
        hjVar.q(j0Var2);
        hjVar.p(j0Var3);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(final hj hjVar, p0 p0Var, u0.c cVar, final er.a aVar) {
        if (hjVar.f() == ij.Expanded && hjVar.h()) {
            ju.k.d(p0Var, null, null, new b(hjVar, null), 3, null);
            ju.k.d(p0Var, null, null, new c(cVar, null), 3, null);
        } else {
            ju.k.d(p0Var, null, null, new d(hjVar, null), 3, null).C0(new l() { // from class: f2.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return l1.S(hjVar, aVar, (Throwable) obj);
                }
            });
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(hj hjVar, er.a aVar, Throwable th4) {
        if (!hjVar.m()) {
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(f3.m mVar, hj hjVar, er.a aVar, float f15, boolean z15, boolean z16, p pVar, p pVar2, y2 y2Var, long j15, long j16, float f16, float f17, q qVar, int i15, int i16, int i17, r rVar, int i18) {
        x(mVar, hjVar, aVar, f15, z15, z16, pVar, pVar2, y2Var, j15, j16, f16, f17, qVar, rVar, p076m2.g4.a(i15 | 1), p076m2.g4.a(i16), i17);
        return i0.f148189a;
    }

    public static final float U(n3.a2 a2Var, float f15) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (a2Var.getSize() >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (e5.c.b(0.0f, Math.min(a2Var.l2(f56629a), fIntBitsToFloat), f15) / fIntBitsToFloat);
    }

    public static final float V(n3.a2 a2Var, float f15) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (a2Var.getSize() & BodyPartID.bodyIdMax));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (e5.c.b(0.0f, Math.min(a2Var.l2(f56630b), fIntBitsToFloat), f15) / fIntBitsToFloat);
    }

    public static final f3.m W(f3.m mVar, final float f15) {
        return z1.c(mVar, new l() { // from class: f2.w0
            @Override // er.l
            public final Object b(Object obj) {
                return l1.X(f15, (n3.a2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(float f15, n3.a2 a2Var) {
        float fU = U(a2Var, f15);
        float fV = V(a2Var, f15);
        a2Var.D(fV == 0.0f ? 1.0f : fU / fV);
        a2Var.Y0(f56631c);
        return i0.f148189a;
    }

    public static final f3.m Y(f3.m mVar, final hj hjVar, final float f15) {
        return z1.c(mVar, new l() { // from class: f2.r0
            @Override // er.l
            public final Object b(Object obj) {
                return l1.Z(hjVar, f15, (n3.a2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(hj hjVar, float f15, n3.a2 a2Var) {
        float fL = hjVar.d().l();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (a2Var.getSize() & BodyPartID.bodyIdMax));
        if (!Float.isNaN(fL) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
            a2Var.s(U(a2Var, f15));
            a2Var.D(V(a2Var, f15));
            a2Var.Y0(e3.a(0.5f, (fL + fIntBitsToFloat) / fIntBitsToFloat));
        }
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:105:0x012b  */
    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0136  */
    /* JADX WARN: Code duplicated, block: B:112:0x013d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0145  */
    /* JADX WARN: Code duplicated, block: B:117:0x014d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0150  */
    /* JADX WARN: Code duplicated, block: B:122:0x015b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0162  */
    /* JADX WARN: Code duplicated, block: B:126:0x0166  */
    /* JADX WARN: Code duplicated, block: B:128:0x0170  */
    /* JADX WARN: Code duplicated, block: B:129:0x0173  */
    /* JADX WARN: Code duplicated, block: B:131:0x0178  */
    /* JADX WARN: Code duplicated, block: B:134:0x0182  */
    /* JADX WARN: Code duplicated, block: B:136:0x0189  */
    /* JADX WARN: Code duplicated, block: B:138:0x018f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0197  */
    /* JADX WARN: Code duplicated, block: B:141:0x019a  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:158:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:161:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:182:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0229  */
    /* JADX WARN: Code duplicated, block: B:184:0x022c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0231  */
    /* JADX WARN: Code duplicated, block: B:188:0x0239  */
    /* JADX WARN: Code duplicated, block: B:190:0x023c  */
    /* JADX WARN: Code duplicated, block: B:192:0x0248  */
    /* JADX WARN: Code duplicated, block: B:194:0x0253  */
    /* JADX WARN: Code duplicated, block: B:196:0x0257  */
    /* JADX WARN: Code duplicated, block: B:198:0x025f  */
    /* JADX WARN: Code duplicated, block: B:200:0x0262  */
    /* JADX WARN: Code duplicated, block: B:202:0x0265  */
    /* JADX WARN: Code duplicated, block: B:205:0x026f  */
    /* JADX WARN: Code duplicated, block: B:208:0x027a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0286  */
    /* JADX WARN: Code duplicated, block: B:212:0x028c  */
    /* JADX WARN: Code duplicated, block: B:213:0x029c  */
    /* JADX WARN: Code duplicated, block: B:216:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:217:0x02af  */
    /* JADX WARN: Code duplicated, block: B:219:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:223:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:225:0x02de  */
    /* JADX WARN: Code duplicated, block: B:228:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:229:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:232:0x0322  */
    /* JADX WARN: Code duplicated, block: B:236:0x032c  */
    /* JADX WARN: Code duplicated, block: B:238:0x0332 A[PHI: r38
      0x0332: PHI (r38v3 n3.y2) = (r38v1 n3.y2), (r38v4 n3.y2) binds: [B:237:0x0330, B:235:0x0329] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:239:0x0335  */
    /* JADX WARN: Code duplicated, block: B:242:0x034b  */
    /* JADX WARN: Code duplicated, block: B:244:0x0353  */
    /* JADX WARN: Code duplicated, block: B:247:0x036d  */
    /* JADX WARN: Code duplicated, block: B:250:0x0384  */
    /* JADX WARN: Code duplicated, block: B:253:0x0393  */
    /* JADX WARN: Code duplicated, block: B:255:0x0399  */
    /* JADX WARN: Code duplicated, block: B:261:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:262:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:265:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:267:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:270:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:273:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:276:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:278:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:281:0x0449  */
    /* JADX WARN: Code duplicated, block: B:283:0x045e  */
    /* JADX WARN: Code duplicated, block: B:286:0x047b  */
    /* JADX WARN: Code duplicated, block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    public static final void x(f3.m mVar, hj hjVar, er.a<i0> aVar, float f15, boolean z15, boolean z16, p<? super r, ? super Integer, i0> pVar, p<? super r, ? super Integer, ? extends c4> pVar2, y2 y2Var, long j15, long j16, float f16, float f17, final q<? super h0, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16, final int i17) {
        f3.m mVar2;
        int i18;
        hj hjVar2;
        int i19;
        float fO;
        int i25;
        int i26;
        boolean z17;
        int i27;
        int i28;
        boolean z18;
        int i29;
        int i35;
        final p<? super r, ? super Integer, i0> pVarC;
        int i36;
        p<? super r, ? super Integer, ? extends c4> pVar3;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i55;
        int i56;
        int i57;
        boolean z19;
        r rVar2;
        final er.a<i0> aVar2;
        final y2 y2Var2;
        final f3.m mVar3;
        final hj hjVar3;
        final float f18;
        final p<? super r, ? super Integer, ? extends c4> pVar4;
        final boolean z25;
        final boolean z26;
        final long j17;
        final long j18;
        final float f19;
        final float f25;
        d5 d5VarM;
        f3.m mVar4;
        hj hjVarY;
        er.a<i0> aVar3;
        y2 y2VarK;
        long jI;
        long jE;
        float fJ;
        float fN;
        int i58;
        p<? super r, ? super Integer, ? extends c4> pVar5;
        boolean z27;
        boolean z28;
        float f26;
        int i59;
        final hj hjVar4;
        final er.a<i0> aVar4;
        float f27;
        y2 y2Var3;
        long j19;
        boolean z29;
        long j25;
        Object objE;
        boolean z35;
        final j0 j0VarF;
        final j0 j0VarE;
        final j0 j0VarF2;
        int i65;
        y2 y2Var4;
        boolean z36;
        boolean zG;
        Object objE2;
        Object objE3;
        r.Companion companion;
        final u0.c cVar;
        Object objE4;
        final p0 p0Var;
        boolean z37;
        boolean z38;
        Object objE5;
        er.a aVar5;
        boolean z39;
        boolean zG2;
        Object objE6;
        int i66;
        r rVarH = rVar.h(57000307);
        int i67 = i17 & 1;
        if (i67 != 0) {
            i18 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i18 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            if ((i17 & 2) == 0) {
                hjVar2 = hjVar;
                int i68 = rVarH.W(hjVar2) ? 32 : 16;
                i18 |= i68;
            } else {
                hjVar2 = hjVar;
            }
            i18 |= i68;
        } else {
            hjVar2 = hjVar;
        }
        int i69 = i17 & 4;
        if (i69 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                i18 |= rVarH.G(aVar) ? 256 : 128;
            }
            i19 = i17 & 8;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    fO = f15;
                    if (rVarH.b(fO)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i18 |= i25;
                }
                i26 = i17 & 16;
                if (i26 != 0) {
                    if ((i15 & 24576) == 0) {
                        z17 = z15;
                        if (rVarH.a(z17)) {
                            i27 = 16384;
                        } else {
                            i27 = PKIFailureInfo.certRevoked;
                        }
                        i18 |= i27;
                    }
                    i28 = i17 & 32;
                    if (i28 != 0) {
                        i18 |= 196608;
                        z18 = z16;
                    } else {
                        z18 = z16;
                        if ((i15 & 196608) == 0) {
                            if (rVarH.a(z18)) {
                                i29 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i29 = PKIFailureInfo.notAuthorized;
                            }
                            i18 |= i29;
                        }
                    }
                    i35 = i17 & 64;
                    if (i35 != 0) {
                        i18 |= 1572864;
                        pVarC = pVar;
                    } else {
                        pVarC = pVar;
                        if ((i15 & 1572864) == 0) {
                            if (rVarH.G(pVarC)) {
                                i36 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i36 = PKIFailureInfo.signerNotTrusted;
                            }
                            i18 |= i36;
                        }
                    }
                    if ((i15 & 12582912) == 0) {
                        if ((i17 & 128) == 0) {
                            pVar3 = pVar2;
                            int i75 = rVarH.G(pVar3) ? 8388608 : 4194304;
                            i18 |= i75;
                        } else {
                            pVar3 = pVar2;
                        }
                        i18 |= i75;
                    } else {
                        pVar3 = pVar2;
                    }
                    if ((i15 & 100663296) != 0) {
                        i18 |= ((i17 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
                    }
                    if ((i15 & 805306368) == 0) {
                        if ((i17 & 512) == 0) {
                            i37 = i67;
                            int i76 = rVarH.d(j15) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            i18 |= i76;
                        } else {
                            i37 = i67;
                        }
                        i18 |= i76;
                    } else {
                        i37 = i67;
                    }
                    if ((i16 & 6) == 0) {
                        if ((i17 & 1024) == 0 || !rVarH.d(j16)) {
                            i66 = 2;
                        } else {
                            i66 = 4;
                        }
                        i38 = i66 | i16;
                    } else {
                        i38 = i16;
                    }
                    i39 = i38;
                    i45 = i17 & 2048;
                    if (i45 != 0) {
                        if ((i16 & 48) == 0) {
                            if (rVarH.b(f16)) {
                                i47 = 32;
                            } else {
                                i47 = 16;
                            }
                            i48 = i39 | i47;
                        } else {
                            i45 = i45;
                            i46 = i39;
                        }
                        i49 = i17 & PKIFailureInfo.certConfirmed;
                        if (i49 != 0) {
                            i55 = i46;
                            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                                if (rVarH.b(f17)) {
                                    i56 = 256;
                                } else {
                                    i56 = 128;
                                }
                                i55 |= i56;
                            }
                            if ((i16 & 3072) != 0) {
                                i55 |= rVarH.G(qVar) ? 2048 : 1024;
                            }
                            i57 = i55;
                            if ((i18 & 306783379) == 306783378 || (i57 & 1171) != 1170) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (rVarH.r(z19, i18 & 1)) {
                                rVarH.I();
                                if ((i15 & 1) != 0 || rVarH.Q()) {
                                    if (i37 != 0) {
                                        mVar4 = f3.m.INSTANCE;
                                    } else {
                                        mVar4 = mVar2;
                                    }
                                    if ((i17 & 2) != 0) {
                                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                        i18 &= -113;
                                    } else {
                                        hjVarY = hjVar2;
                                    }
                                    if (i69 != 0) {
                                        objE = rVarH.E();
                                        if (objE == r.INSTANCE.a()) {
                                            objE = new er.a() { // from class: f2.x0
                                                @Override // er.a
                                                public final Object a() {
                                                    return l1.O();
                                                }
                                            };
                                            rVarH.v(objE);
                                        }
                                        aVar3 = (er.a) objE;
                                    } else {
                                        aVar3 = aVar;
                                    }
                                    if (i19 != 0) {
                                        fO = n0.f56958a.o();
                                    }
                                    if (i26 != 0) {
                                        z17 = true;
                                    }
                                    if (i28 != 0) {
                                        z18 = true;
                                    }
                                    if (i35 != 0) {
                                        pVarC = k3.f56525a.c();
                                    }
                                    if ((i17 & 128) != 0) {
                                        pVar3 = new p() { // from class: f2.y0
                                            @Override // er.p
                                            public final Object B(Object obj, Object obj2) {
                                                return l1.P((r) obj, ((Integer) obj2).intValue());
                                            }
                                        };
                                        i18 &= -29360129;
                                    }
                                    if ((i17 & 256) != 0) {
                                        y2VarK = n0.f56958a.k(rVarH, 6);
                                        i18 &= -234881025;
                                    } else {
                                        y2VarK = y2Var;
                                    }
                                    if ((i17 & 512) != 0) {
                                        i18 = (-1879048193) & i18;
                                        jI = n0.f56958a.i(rVarH, 6);
                                    } else {
                                        jI = j15;
                                    }
                                    if ((i17 & 1024) != 0) {
                                        jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                        i57 &= -15;
                                    } else {
                                        jE = j16;
                                    }
                                    if (i45 != 0) {
                                        fJ = n0.f56958a.j();
                                    } else {
                                        fJ = f16;
                                    }
                                    int i77 = i57;
                                    if (i49 != 0) {
                                        fN = c5.h.n(0);
                                    } else {
                                        fN = f17;
                                    }
                                    i58 = i18;
                                    pVar5 = pVar3;
                                    z27 = z17;
                                    z28 = z18;
                                    f26 = fJ;
                                    i59 = i77;
                                    long j26 = jI;
                                    hjVar4 = hjVarY;
                                    aVar4 = aVar3;
                                    f27 = fO;
                                    y2Var3 = y2VarK;
                                    j19 = jE;
                                    z29 = true;
                                    j25 = j26;
                                } else {
                                    rVarH.O();
                                    if ((i17 & 2) != 0) {
                                        i18 &= -113;
                                    }
                                    if ((i17 & 128) != 0) {
                                        i18 &= -29360129;
                                    }
                                    if ((i17 & 256) != 0) {
                                        i18 &= -234881025;
                                    }
                                    if ((i17 & 512) != 0) {
                                        i18 &= -1879048193;
                                    }
                                    if ((i17 & 1024) != 0) {
                                        i57 &= -15;
                                    }
                                    fN = f17;
                                    i59 = i57;
                                    pVarC = pVarC;
                                    mVar4 = mVar2;
                                    i58 = i18;
                                    hjVar4 = hjVar2;
                                    f27 = fO;
                                    pVar5 = pVar3;
                                    z27 = z17;
                                    z28 = z18;
                                    z29 = true;
                                    aVar4 = aVar;
                                    y2Var3 = y2Var;
                                    j25 = j15;
                                    j19 = j16;
                                    f26 = f16;
                                }
                                rVarH.y();
                                z35 = z28;
                                if (t.k()) {
                                    t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                                }
                                androidx.compose.material3.d dVar = androidx.compose.material3.d.f9816a;
                                j0VarF = dVar.c(rVarH, 6).f();
                                float f28 = f27;
                                j0VarE = dVar.c(rVarH, 6).e();
                                j0VarF2 = dVar.c(rVarH, 6).f();
                                i65 = (i58 & 112) ^ 48;
                                boolean z45 = z27;
                                if (i65 > 32 || !rVarH.W(hjVar4)) {
                                    y2Var4 = y2Var3;
                                    if ((i58 & 48) != 32) {
                                        z36 = false;
                                    }
                                    zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                                    objE2 = rVarH.E();
                                    if (zG || objE2 == r.INSTANCE.a()) {
                                        objE2 = new er.a() { // from class: f2.a1
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                            }
                                        };
                                        rVarH.v(objE2);
                                    }
                                    Function0.g((er.a) objE2, rVarH, 0);
                                    objE3 = rVarH.E();
                                    companion = r.INSTANCE;
                                    if (objE3 == companion.a()) {
                                        objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                                        rVarH.v(objE3);
                                    }
                                    cVar = (u0.c) objE3;
                                    objE4 = rVarH.E();
                                    if (objE4 == companion.a()) {
                                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                                        rVarH.v(objE4);
                                    }
                                    p0Var = (p0) objE4;
                                    boolean zG3 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                                    if ((i58 & 896) == 256) {
                                        z37 = z29;
                                    } else {
                                        z37 = false;
                                    }
                                    z38 = zG3 | z37;
                                    objE5 = rVarH.E();
                                    if (z38 || objE5 == companion.a()) {
                                        objE5 = new er.a() { // from class: f2.b1
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                                            }
                                        };
                                        rVarH.v(objE5);
                                    }
                                    aVar5 = (er.a) objE5;
                                    if (z35 || !hjVar4.m()) {
                                        z39 = false;
                                    } else {
                                        z39 = z29;
                                    }
                                    zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                                    objE6 = rVarH.E();
                                    if (zG2 || objE6 == companion.a()) {
                                        objE6 = new a(aVar5, cVar, null);
                                        rVarH.v(objE6);
                                    }
                                    h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                                    int i78 = i58 >> 6;
                                    int i79 = ((i58 << 3) & 524272) | (3670016 & i78) | (i78 & 29360128);
                                    int i85 = i59 << 24;
                                    int i86 = i79 | (234881024 & i85) | (i85 & 1879048192);
                                    int i87 = i58 >> 15;
                                    f3.m mVar5 = mVar4;
                                    y2 y2Var5 = y2Var4;
                                    rVar2 = rVarH;
                                    y(((Number) cVar.m()).floatValue(), mVar5, hjVar4, aVar4, f28, z45, y2Var5, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i86, ((i59 >> 6) & 14) | (i87 & 112) | (i87 & 896) | (i59 & 7168), 0);
                                    if (t.k()) {
                                        t.n();
                                    }
                                    mVar3 = mVar5;
                                    hjVar3 = hjVar4;
                                    aVar2 = aVar4;
                                    f18 = f28;
                                    z25 = z45;
                                    y2Var2 = y2Var5;
                                    j17 = j25;
                                    j18 = j19;
                                    f19 = f26;
                                    f25 = fN;
                                    pVarC = pVarC;
                                    pVar4 = pVar5;
                                    z26 = z35;
                                } else {
                                    y2Var4 = y2Var3;
                                }
                                z36 = z29;
                                zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                                objE2 = rVarH.E();
                                if (zG) {
                                    objE2 = new er.a() { // from class: f2.a1
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                        }
                                    };
                                    rVarH.v(objE2);
                                } else {
                                    objE2 = new er.a() { // from class: f2.a1
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                        }
                                    };
                                    rVarH.v(objE2);
                                }
                                Function0.g((er.a) objE2, rVarH, 0);
                                objE3 = rVarH.E();
                                companion = r.INSTANCE;
                                if (objE3 == companion.a()) {
                                    objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                                    rVarH.v(objE3);
                                }
                                cVar = (u0.c) objE3;
                                objE4 = rVarH.E();
                                if (objE4 == companion.a()) {
                                    objE4 = Function0.i(tq.j.f191408a, rVarH);
                                    rVarH.v(objE4);
                                }
                                p0Var = (p0) objE4;
                                boolean zG4 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                                if ((i58 & 896) == 256) {
                                    z37 = z29;
                                } else {
                                    z37 = false;
                                }
                                z38 = zG4 | z37;
                                objE5 = rVarH.E();
                                if (z38) {
                                    objE5 = new er.a() { // from class: f2.b1
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.R(hjVar4, p0Var, cVar, aVar4);
                                        }
                                    };
                                    rVarH.v(objE5);
                                } else {
                                    objE5 = new er.a() { // from class: f2.b1
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.R(hjVar4, p0Var, cVar, aVar4);
                                        }
                                    };
                                    rVarH.v(objE5);
                                }
                                aVar5 = (er.a) objE5;
                                if (z35) {
                                    z39 = false;
                                } else {
                                    z39 = false;
                                }
                                zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                                objE6 = rVarH.E();
                                if (zG2) {
                                    objE6 = new a(aVar5, cVar, null);
                                    rVarH.v(objE6);
                                } else {
                                    objE6 = new a(aVar5, cVar, null);
                                    rVarH.v(objE6);
                                }
                                h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                                int i710 = i58 >> 6;
                                int i711 = ((i58 << 3) & 524272) | (3670016 & i710) | (i710 & 29360128);
                                int i88 = i59 << 24;
                                int i89 = i711 | (234881024 & i88) | (i88 & 1879048192);
                                int i810 = i58 >> 15;
                                f3.m mVar6 = mVar4;
                                y2 y2Var6 = y2Var4;
                                rVar2 = rVarH;
                                y(((Number) cVar.m()).floatValue(), mVar6, hjVar4, aVar4, f28, z45, y2Var6, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i89, ((i59 >> 6) & 14) | (i810 & 112) | (i810 & 896) | (i59 & 7168), 0);
                                if (t.k()) {
                                    t.n();
                                }
                                mVar3 = mVar6;
                                hjVar3 = hjVar4;
                                aVar2 = aVar4;
                                f18 = f28;
                                z25 = z45;
                                y2Var2 = y2Var6;
                                j17 = j25;
                                j18 = j19;
                                f19 = f26;
                                f25 = fN;
                                pVarC = pVarC;
                                pVar4 = pVar5;
                                z26 = z35;
                            } else {
                                rVar2 = rVarH;
                                rVar2.O();
                                aVar2 = aVar;
                                y2Var2 = y2Var;
                                mVar3 = mVar2;
                                hjVar3 = hjVar2;
                                f18 = fO;
                                pVar4 = pVar3;
                                z25 = z17;
                                z26 = z18;
                                j17 = j15;
                                j18 = j16;
                                f19 = f16;
                                f25 = f17;
                            }
                            d5VarM = rVar2.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: f2.c1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i55 = i46 | MLKEMEngine.KyberPolyBytes;
                        if ((i16 & 3072) != 0) {
                            i55 |= rVarH.G(qVar) ? 2048 : 1024;
                        }
                        i57 = i55;
                        if ((i18 & 306783379) == 306783378) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (rVarH.r(z19, i18 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i37 != 0) {
                                    mVar4 = f3.m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if ((i17 & 2) != 0) {
                                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                    i18 &= -113;
                                } else {
                                    hjVarY = hjVar2;
                                }
                                if (i69 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new er.a() { // from class: f2.x0
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.O();
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    aVar3 = (er.a) objE;
                                } else {
                                    aVar3 = aVar;
                                }
                                if (i19 != 0) {
                                    fO = n0.f56958a.o();
                                }
                                if (i26 != 0) {
                                    z17 = true;
                                }
                                if (i28 != 0) {
                                    z18 = true;
                                }
                                if (i35 != 0) {
                                    pVarC = k3.f56525a.c();
                                }
                                if ((i17 & 128) != 0) {
                                    pVar3 = new p() { // from class: f2.y0
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.P((r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                    i18 &= -29360129;
                                }
                                if ((i17 & 256) != 0) {
                                    y2VarK = n0.f56958a.k(rVarH, 6);
                                    i18 &= -234881025;
                                } else {
                                    y2VarK = y2Var;
                                }
                                if ((i17 & 512) != 0) {
                                    i18 = (-1879048193) & i18;
                                    jI = n0.f56958a.i(rVarH, 6);
                                } else {
                                    jI = j15;
                                }
                                if ((i17 & 1024) != 0) {
                                    jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                    i57 &= -15;
                                } else {
                                    jE = j16;
                                }
                                if (i45 != 0) {
                                    fJ = n0.f56958a.j();
                                } else {
                                    fJ = f16;
                                }
                                int i712 = i57;
                                if (i49 != 0) {
                                    fN = c5.h.n(0);
                                } else {
                                    fN = f17;
                                }
                                i58 = i18;
                                pVar5 = pVar3;
                                z27 = z17;
                                z28 = z18;
                                f26 = fJ;
                                i59 = i712;
                                long j27 = jI;
                                hjVar4 = hjVarY;
                                aVar4 = aVar3;
                                f27 = fO;
                                y2Var3 = y2VarK;
                                j19 = jE;
                                z29 = true;
                                j25 = j27;
                            } else {
                                if (i37 != 0) {
                                    mVar4 = f3.m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if ((i17 & 2) != 0) {
                                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                    i18 &= -113;
                                } else {
                                    hjVarY = hjVar2;
                                }
                                if (i69 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new er.a() { // from class: f2.x0
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.O();
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    aVar3 = (er.a) objE;
                                } else {
                                    aVar3 = aVar;
                                }
                                if (i19 != 0) {
                                    fO = n0.f56958a.o();
                                }
                                if (i26 != 0) {
                                    z17 = true;
                                }
                                if (i28 != 0) {
                                    z18 = true;
                                }
                                if (i35 != 0) {
                                    pVarC = k3.f56525a.c();
                                }
                                if ((i17 & 128) != 0) {
                                    pVar3 = new p() { // from class: f2.y0
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.P((r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                    i18 &= -29360129;
                                }
                                if ((i17 & 256) != 0) {
                                    y2VarK = n0.f56958a.k(rVarH, 6);
                                    i18 &= -234881025;
                                } else {
                                    y2VarK = y2Var;
                                }
                                if ((i17 & 512) != 0) {
                                    i18 = (-1879048193) & i18;
                                    jI = n0.f56958a.i(rVarH, 6);
                                } else {
                                    jI = j15;
                                }
                                if ((i17 & 1024) != 0) {
                                    jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                    i57 &= -15;
                                } else {
                                    jE = j16;
                                }
                                if (i45 != 0) {
                                    fJ = n0.f56958a.j();
                                } else {
                                    fJ = f16;
                                }
                                int i713 = i57;
                                if (i49 != 0) {
                                    fN = c5.h.n(0);
                                } else {
                                    fN = f17;
                                }
                                i58 = i18;
                                pVar5 = pVar3;
                                z27 = z17;
                                z28 = z18;
                                f26 = fJ;
                                i59 = i713;
                                long j28 = jI;
                                hjVar4 = hjVarY;
                                aVar4 = aVar3;
                                f27 = fO;
                                y2Var3 = y2VarK;
                                j19 = jE;
                                z29 = true;
                                j25 = j28;
                            }
                            rVarH.y();
                            z35 = z28;
                            if (t.k()) {
                                t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                            }
                            androidx.compose.material3.d dVar2 = androidx.compose.material3.d.f9816a;
                            j0VarF = dVar2.c(rVarH, 6).f();
                            float f29 = f27;
                            j0VarE = dVar2.c(rVarH, 6).e();
                            j0VarF2 = dVar2.c(rVarH, 6).f();
                            i65 = (i58 & 112) ^ 48;
                            boolean z46 = z27;
                            if (i65 > 32) {
                                y2Var4 = y2Var3;
                                if ((i58 & 48) != 32) {
                                    z36 = z29;
                                } else {
                                    z36 = false;
                                }
                            } else {
                                y2Var4 = y2Var3;
                                if ((i58 & 48) != 32) {
                                    z36 = z29;
                                } else {
                                    z36 = false;
                                }
                            }
                            zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                            objE2 = rVarH.E();
                            if (zG) {
                                objE2 = new er.a() { // from class: f2.a1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.a() { // from class: f2.a1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            Function0.g((er.a) objE2, rVarH, 0);
                            objE3 = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE3 == companion.a()) {
                                objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                                rVarH.v(objE3);
                            }
                            cVar = (u0.c) objE3;
                            objE4 = rVarH.E();
                            if (objE4 == companion.a()) {
                                objE4 = Function0.i(tq.j.f191408a, rVarH);
                                rVarH.v(objE4);
                            }
                            p0Var = (p0) objE4;
                            boolean zG5 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                            if ((i58 & 896) == 256) {
                                z37 = z29;
                            } else {
                                z37 = false;
                            }
                            z38 = zG5 | z37;
                            objE5 = rVarH.E();
                            if (z38) {
                                objE5 = new er.a() { // from class: f2.b1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.R(hjVar4, p0Var, cVar, aVar4);
                                    }
                                };
                                rVarH.v(objE5);
                            } else {
                                objE5 = new er.a() { // from class: f2.b1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.R(hjVar4, p0Var, cVar, aVar4);
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            aVar5 = (er.a) objE5;
                            if (z35) {
                                z39 = false;
                            } else {
                                z39 = false;
                            }
                            zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                            objE6 = rVarH.E();
                            if (zG2) {
                                objE6 = new a(aVar5, cVar, null);
                                rVarH.v(objE6);
                            } else {
                                objE6 = new a(aVar5, cVar, null);
                                rVarH.v(objE6);
                            }
                            h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                            int i714 = i58 >> 6;
                            int i715 = ((i58 << 3) & 524272) | (3670016 & i714) | (i714 & 29360128);
                            int i811 = i59 << 24;
                            int i812 = i715 | (234881024 & i811) | (i811 & 1879048192);
                            int i813 = i58 >> 15;
                            f3.m mVar7 = mVar4;
                            y2 y2Var7 = y2Var4;
                            rVar2 = rVarH;
                            y(((Number) cVar.m()).floatValue(), mVar7, hjVar4, aVar4, f29, z46, y2Var7, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i812, ((i59 >> 6) & 14) | (i813 & 112) | (i813 & 896) | (i59 & 7168), 0);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar7;
                            hjVar3 = hjVar4;
                            aVar2 = aVar4;
                            f18 = f29;
                            z25 = z46;
                            y2Var2 = y2Var7;
                            j17 = j25;
                            j18 = j19;
                            f19 = f26;
                            f25 = fN;
                            pVarC = pVarC;
                            pVar4 = pVar5;
                            z26 = z35;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            aVar2 = aVar;
                            y2Var2 = y2Var;
                            mVar3 = mVar2;
                            hjVar3 = hjVar2;
                            f18 = fO;
                            pVar4 = pVar3;
                            z25 = z17;
                            z26 = z18;
                            j17 = j15;
                            j18 = j16;
                            f19 = f16;
                            f25 = f17;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.c1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i48 = i39 | 48;
                    i46 = i48;
                    i49 = i17 & PKIFailureInfo.certConfirmed;
                    if (i49 != 0) {
                        i55 = i46;
                        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                            if (rVarH.b(f17)) {
                                i56 = 256;
                            } else {
                                i56 = 128;
                            }
                            i55 |= i56;
                        }
                        if ((i16 & 3072) != 0) {
                            i55 |= rVarH.G(qVar) ? 2048 : 1024;
                        }
                        i57 = i55;
                        if ((i18 & 306783379) == 306783378) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (rVarH.r(z19, i18 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i37 != 0) {
                                    mVar4 = f3.m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if ((i17 & 2) != 0) {
                                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                    i18 &= -113;
                                } else {
                                    hjVarY = hjVar2;
                                }
                                if (i69 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new er.a() { // from class: f2.x0
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.O();
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    aVar3 = (er.a) objE;
                                } else {
                                    aVar3 = aVar;
                                }
                                if (i19 != 0) {
                                    fO = n0.f56958a.o();
                                }
                                if (i26 != 0) {
                                    z17 = true;
                                }
                                if (i28 != 0) {
                                    z18 = true;
                                }
                                if (i35 != 0) {
                                    pVarC = k3.f56525a.c();
                                }
                                if ((i17 & 128) != 0) {
                                    pVar3 = new p() { // from class: f2.y0
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.P((r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                    i18 &= -29360129;
                                }
                                if ((i17 & 256) != 0) {
                                    y2VarK = n0.f56958a.k(rVarH, 6);
                                    i18 &= -234881025;
                                } else {
                                    y2VarK = y2Var;
                                }
                                if ((i17 & 512) != 0) {
                                    i18 = (-1879048193) & i18;
                                    jI = n0.f56958a.i(rVarH, 6);
                                } else {
                                    jI = j15;
                                }
                                if ((i17 & 1024) != 0) {
                                    jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                    i57 &= -15;
                                } else {
                                    jE = j16;
                                }
                                if (i45 != 0) {
                                    fJ = n0.f56958a.j();
                                } else {
                                    fJ = f16;
                                }
                                int i716 = i57;
                                if (i49 != 0) {
                                    fN = c5.h.n(0);
                                } else {
                                    fN = f17;
                                }
                                i58 = i18;
                                pVar5 = pVar3;
                                z27 = z17;
                                z28 = z18;
                                f26 = fJ;
                                i59 = i716;
                                long j29 = jI;
                                hjVar4 = hjVarY;
                                aVar4 = aVar3;
                                f27 = fO;
                                y2Var3 = y2VarK;
                                j19 = jE;
                                z29 = true;
                                j25 = j29;
                            } else {
                                if (i37 != 0) {
                                    mVar4 = f3.m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if ((i17 & 2) != 0) {
                                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                    i18 &= -113;
                                } else {
                                    hjVarY = hjVar2;
                                }
                                if (i69 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new er.a() { // from class: f2.x0
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.O();
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    aVar3 = (er.a) objE;
                                } else {
                                    aVar3 = aVar;
                                }
                                if (i19 != 0) {
                                    fO = n0.f56958a.o();
                                }
                                if (i26 != 0) {
                                    z17 = true;
                                }
                                if (i28 != 0) {
                                    z18 = true;
                                }
                                if (i35 != 0) {
                                    pVarC = k3.f56525a.c();
                                }
                                if ((i17 & 128) != 0) {
                                    pVar3 = new p() { // from class: f2.y0
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.P((r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                    i18 &= -29360129;
                                }
                                if ((i17 & 256) != 0) {
                                    y2VarK = n0.f56958a.k(rVarH, 6);
                                    i18 &= -234881025;
                                } else {
                                    y2VarK = y2Var;
                                }
                                if ((i17 & 512) != 0) {
                                    i18 = (-1879048193) & i18;
                                    jI = n0.f56958a.i(rVarH, 6);
                                } else {
                                    jI = j15;
                                }
                                if ((i17 & 1024) != 0) {
                                    jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                    i57 &= -15;
                                } else {
                                    jE = j16;
                                }
                                if (i45 != 0) {
                                    fJ = n0.f56958a.j();
                                } else {
                                    fJ = f16;
                                }
                                int i717 = i57;
                                if (i49 != 0) {
                                    fN = c5.h.n(0);
                                } else {
                                    fN = f17;
                                }
                                i58 = i18;
                                pVar5 = pVar3;
                                z27 = z17;
                                z28 = z18;
                                f26 = fJ;
                                i59 = i717;
                                long j210 = jI;
                                hjVar4 = hjVarY;
                                aVar4 = aVar3;
                                f27 = fO;
                                y2Var3 = y2VarK;
                                j19 = jE;
                                z29 = true;
                                j25 = j210;
                            }
                            rVarH.y();
                            z35 = z28;
                            if (t.k()) {
                                t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                            }
                            androidx.compose.material3.d dVar3 = androidx.compose.material3.d.f9816a;
                            j0VarF = dVar3.c(rVarH, 6).f();
                            float f210 = f27;
                            j0VarE = dVar3.c(rVarH, 6).e();
                            j0VarF2 = dVar3.c(rVarH, 6).f();
                            i65 = (i58 & 112) ^ 48;
                            boolean z47 = z27;
                            if (i65 > 32) {
                                y2Var4 = y2Var3;
                                if ((i58 & 48) != 32) {
                                    z36 = z29;
                                } else {
                                    z36 = false;
                                }
                            } else {
                                y2Var4 = y2Var3;
                                if ((i58 & 48) != 32) {
                                    z36 = z29;
                                } else {
                                    z36 = false;
                                }
                            }
                            zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                            objE2 = rVarH.E();
                            if (zG) {
                                objE2 = new er.a() { // from class: f2.a1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.a() { // from class: f2.a1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            Function0.g((er.a) objE2, rVarH, 0);
                            objE3 = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE3 == companion.a()) {
                                objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                                rVarH.v(objE3);
                            }
                            cVar = (u0.c) objE3;
                            objE4 = rVarH.E();
                            if (objE4 == companion.a()) {
                                objE4 = Function0.i(tq.j.f191408a, rVarH);
                                rVarH.v(objE4);
                            }
                            p0Var = (p0) objE4;
                            boolean zG6 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                            if ((i58 & 896) == 256) {
                                z37 = z29;
                            } else {
                                z37 = false;
                            }
                            z38 = zG6 | z37;
                            objE5 = rVarH.E();
                            if (z38) {
                                objE5 = new er.a() { // from class: f2.b1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.R(hjVar4, p0Var, cVar, aVar4);
                                    }
                                };
                                rVarH.v(objE5);
                            } else {
                                objE5 = new er.a() { // from class: f2.b1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.R(hjVar4, p0Var, cVar, aVar4);
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            aVar5 = (er.a) objE5;
                            if (z35) {
                                z39 = false;
                            } else {
                                z39 = false;
                            }
                            zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                            objE6 = rVarH.E();
                            if (zG2) {
                                objE6 = new a(aVar5, cVar, null);
                                rVarH.v(objE6);
                            } else {
                                objE6 = new a(aVar5, cVar, null);
                                rVarH.v(objE6);
                            }
                            h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                            int i718 = i58 >> 6;
                            int i719 = ((i58 << 3) & 524272) | (3670016 & i718) | (i718 & 29360128);
                            int i814 = i59 << 24;
                            int i815 = i719 | (234881024 & i814) | (i814 & 1879048192);
                            int i816 = i58 >> 15;
                            f3.m mVar8 = mVar4;
                            y2 y2Var8 = y2Var4;
                            rVar2 = rVarH;
                            y(((Number) cVar.m()).floatValue(), mVar8, hjVar4, aVar4, f210, z47, y2Var8, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i815, ((i59 >> 6) & 14) | (i816 & 112) | (i816 & 896) | (i59 & 7168), 0);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar8;
                            hjVar3 = hjVar4;
                            aVar2 = aVar4;
                            f18 = f210;
                            z25 = z47;
                            y2Var2 = y2Var8;
                            j17 = j25;
                            j18 = j19;
                            f19 = f26;
                            f25 = fN;
                            pVarC = pVarC;
                            pVar4 = pVar5;
                            z26 = z35;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            aVar2 = aVar;
                            y2Var2 = y2Var;
                            mVar3 = mVar2;
                            hjVar3 = hjVar2;
                            f18 = fO;
                            pVar4 = pVar3;
                            z25 = z17;
                            z26 = z18;
                            j17 = j15;
                            j18 = j16;
                            f19 = f16;
                            f25 = f17;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.c1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i55 = i46 | MLKEMEngine.KyberPolyBytes;
                    if ((i16 & 3072) != 0) {
                        i55 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i57 = i55;
                    if ((i18 & 306783379) == 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (rVarH.r(z19, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i7110 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i7110;
                            long j211 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j211;
                        } else {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i7111 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i7111;
                            long j212 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j212;
                        }
                        rVarH.y();
                        z35 = z28;
                        if (t.k()) {
                            t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                        }
                        androidx.compose.material3.d dVar4 = androidx.compose.material3.d.f9816a;
                        j0VarF = dVar4.c(rVarH, 6).f();
                        float f211 = f27;
                        j0VarE = dVar4.c(rVarH, 6).e();
                        j0VarF2 = dVar4.c(rVarH, 6).f();
                        i65 = (i58 & 112) ^ 48;
                        boolean z48 = z27;
                        if (i65 > 32) {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        } else {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        }
                        zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                        objE2 = rVarH.E();
                        if (zG) {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        objE3 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE3 == companion.a()) {
                            objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                            rVarH.v(objE3);
                        }
                        cVar = (u0.c) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        boolean zG7 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                        if ((i58 & 896) == 256) {
                            z37 = z29;
                        } else {
                            z37 = false;
                        }
                        z38 = zG7 | z37;
                        objE5 = rVarH.E();
                        if (z38) {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar5 = (er.a) objE5;
                        if (z35) {
                            z39 = false;
                        } else {
                            z39 = false;
                        }
                        zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                        objE6 = rVarH.E();
                        if (zG2) {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        }
                        h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                        int i7112 = i58 >> 6;
                        int i7113 = ((i58 << 3) & 524272) | (3670016 & i7112) | (i7112 & 29360128);
                        int i817 = i59 << 24;
                        int i818 = i7113 | (234881024 & i817) | (i817 & 1879048192);
                        int i819 = i58 >> 15;
                        f3.m mVar9 = mVar4;
                        y2 y2Var9 = y2Var4;
                        rVar2 = rVarH;
                        y(((Number) cVar.m()).floatValue(), mVar9, hjVar4, aVar4, f211, z48, y2Var9, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i818, ((i59 >> 6) & 14) | (i819 & 112) | (i819 & 896) | (i59 & 7168), 0);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar9;
                        hjVar3 = hjVar4;
                        aVar2 = aVar4;
                        f18 = f211;
                        z25 = z48;
                        y2Var2 = y2Var9;
                        j17 = j25;
                        j18 = j19;
                        f19 = f26;
                        f25 = fN;
                        pVarC = pVarC;
                        pVar4 = pVar5;
                        z26 = z35;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        aVar2 = aVar;
                        y2Var2 = y2Var;
                        mVar3 = mVar2;
                        hjVar3 = hjVar2;
                        f18 = fO;
                        pVar4 = pVar3;
                        z25 = z17;
                        z26 = z18;
                        j17 = j15;
                        j18 = j16;
                        f19 = f16;
                        f25 = f17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.c1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 24576;
                z17 = z15;
                i28 = i17 & 32;
                if (i28 != 0) {
                    i18 |= 196608;
                    z18 = z16;
                } else {
                    z18 = z16;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.a(z18)) {
                            i29 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i29 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i29;
                    }
                }
                i35 = i17 & 64;
                if (i35 != 0) {
                    i18 |= 1572864;
                    pVarC = pVar;
                } else {
                    pVarC = pVar;
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.G(pVarC)) {
                            i36 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i36 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i36;
                    }
                }
                if ((i15 & 12582912) == 0) {
                    if ((i17 & 128) == 0) {
                        pVar3 = pVar2;
                        if (rVarH.G(pVar3)) {
                        }
                        i18 |= i75;
                    } else {
                        pVar3 = pVar2;
                    }
                    i18 |= i75;
                } else {
                    pVar3 = pVar2;
                }
                if ((i15 & 100663296) != 0) {
                    i18 |= ((i17 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
                }
                if ((i15 & 805306368) == 0) {
                    if ((i17 & 512) == 0) {
                        i37 = i67;
                        if (rVarH.d(j15)) {
                        }
                        i18 |= i76;
                    } else {
                        i37 = i67;
                    }
                    i18 |= i76;
                } else {
                    i37 = i67;
                }
                if ((i16 & 6) == 0) {
                    if ((i17 & 1024) == 0) {
                        i66 = 2;
                    } else {
                        i66 = 2;
                    }
                    i38 = i66 | i16;
                } else {
                    i38 = i16;
                }
                i39 = i38;
                i45 = i17 & 2048;
                if (i45 != 0) {
                    if ((i16 & 48) == 0) {
                        if (rVarH.b(f16)) {
                            i47 = 32;
                        } else {
                            i47 = 16;
                        }
                        i48 = i39 | i47;
                    } else {
                        i45 = i45;
                        i46 = i39;
                    }
                    i49 = i17 & PKIFailureInfo.certConfirmed;
                    if (i49 != 0) {
                        i55 = i46;
                        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                            if (rVarH.b(f17)) {
                                i56 = 256;
                            } else {
                                i56 = 128;
                            }
                            i55 |= i56;
                        }
                        if ((i16 & 3072) != 0) {
                            i55 |= rVarH.G(qVar) ? 2048 : 1024;
                        }
                        i57 = i55;
                        if ((i18 & 306783379) == 306783378) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (rVarH.r(z19, i18 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i37 != 0) {
                                    mVar4 = f3.m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if ((i17 & 2) != 0) {
                                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                    i18 &= -113;
                                } else {
                                    hjVarY = hjVar2;
                                }
                                if (i69 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new er.a() { // from class: f2.x0
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.O();
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    aVar3 = (er.a) objE;
                                } else {
                                    aVar3 = aVar;
                                }
                                if (i19 != 0) {
                                    fO = n0.f56958a.o();
                                }
                                if (i26 != 0) {
                                    z17 = true;
                                }
                                if (i28 != 0) {
                                    z18 = true;
                                }
                                if (i35 != 0) {
                                    pVarC = k3.f56525a.c();
                                }
                                if ((i17 & 128) != 0) {
                                    pVar3 = new p() { // from class: f2.y0
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.P((r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                    i18 &= -29360129;
                                }
                                if ((i17 & 256) != 0) {
                                    y2VarK = n0.f56958a.k(rVarH, 6);
                                    i18 &= -234881025;
                                } else {
                                    y2VarK = y2Var;
                                }
                                if ((i17 & 512) != 0) {
                                    i18 = (-1879048193) & i18;
                                    jI = n0.f56958a.i(rVarH, 6);
                                } else {
                                    jI = j15;
                                }
                                if ((i17 & 1024) != 0) {
                                    jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                    i57 &= -15;
                                } else {
                                    jE = j16;
                                }
                                if (i45 != 0) {
                                    fJ = n0.f56958a.j();
                                } else {
                                    fJ = f16;
                                }
                                int i7114 = i57;
                                if (i49 != 0) {
                                    fN = c5.h.n(0);
                                } else {
                                    fN = f17;
                                }
                                i58 = i18;
                                pVar5 = pVar3;
                                z27 = z17;
                                z28 = z18;
                                f26 = fJ;
                                i59 = i7114;
                                long j213 = jI;
                                hjVar4 = hjVarY;
                                aVar4 = aVar3;
                                f27 = fO;
                                y2Var3 = y2VarK;
                                j19 = jE;
                                z29 = true;
                                j25 = j213;
                            } else {
                                if (i37 != 0) {
                                    mVar4 = f3.m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if ((i17 & 2) != 0) {
                                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                    i18 &= -113;
                                } else {
                                    hjVarY = hjVar2;
                                }
                                if (i69 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new er.a() { // from class: f2.x0
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.O();
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    aVar3 = (er.a) objE;
                                } else {
                                    aVar3 = aVar;
                                }
                                if (i19 != 0) {
                                    fO = n0.f56958a.o();
                                }
                                if (i26 != 0) {
                                    z17 = true;
                                }
                                if (i28 != 0) {
                                    z18 = true;
                                }
                                if (i35 != 0) {
                                    pVarC = k3.f56525a.c();
                                }
                                if ((i17 & 128) != 0) {
                                    pVar3 = new p() { // from class: f2.y0
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.P((r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                    i18 &= -29360129;
                                }
                                if ((i17 & 256) != 0) {
                                    y2VarK = n0.f56958a.k(rVarH, 6);
                                    i18 &= -234881025;
                                } else {
                                    y2VarK = y2Var;
                                }
                                if ((i17 & 512) != 0) {
                                    i18 = (-1879048193) & i18;
                                    jI = n0.f56958a.i(rVarH, 6);
                                } else {
                                    jI = j15;
                                }
                                if ((i17 & 1024) != 0) {
                                    jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                    i57 &= -15;
                                } else {
                                    jE = j16;
                                }
                                if (i45 != 0) {
                                    fJ = n0.f56958a.j();
                                } else {
                                    fJ = f16;
                                }
                                int i7115 = i57;
                                if (i49 != 0) {
                                    fN = c5.h.n(0);
                                } else {
                                    fN = f17;
                                }
                                i58 = i18;
                                pVar5 = pVar3;
                                z27 = z17;
                                z28 = z18;
                                f26 = fJ;
                                i59 = i7115;
                                long j214 = jI;
                                hjVar4 = hjVarY;
                                aVar4 = aVar3;
                                f27 = fO;
                                y2Var3 = y2VarK;
                                j19 = jE;
                                z29 = true;
                                j25 = j214;
                            }
                            rVarH.y();
                            z35 = z28;
                            if (t.k()) {
                                t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                            }
                            androidx.compose.material3.d dVar5 = androidx.compose.material3.d.f9816a;
                            j0VarF = dVar5.c(rVarH, 6).f();
                            float f212 = f27;
                            j0VarE = dVar5.c(rVarH, 6).e();
                            j0VarF2 = dVar5.c(rVarH, 6).f();
                            i65 = (i58 & 112) ^ 48;
                            boolean z49 = z27;
                            if (i65 > 32) {
                                y2Var4 = y2Var3;
                                if ((i58 & 48) != 32) {
                                    z36 = z29;
                                } else {
                                    z36 = false;
                                }
                            } else {
                                y2Var4 = y2Var3;
                                if ((i58 & 48) != 32) {
                                    z36 = z29;
                                } else {
                                    z36 = false;
                                }
                            }
                            zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                            objE2 = rVarH.E();
                            if (zG) {
                                objE2 = new er.a() { // from class: f2.a1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.a() { // from class: f2.a1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            Function0.g((er.a) objE2, rVarH, 0);
                            objE3 = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE3 == companion.a()) {
                                objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                                rVarH.v(objE3);
                            }
                            cVar = (u0.c) objE3;
                            objE4 = rVarH.E();
                            if (objE4 == companion.a()) {
                                objE4 = Function0.i(tq.j.f191408a, rVarH);
                                rVarH.v(objE4);
                            }
                            p0Var = (p0) objE4;
                            boolean zG8 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                            if ((i58 & 896) == 256) {
                                z37 = z29;
                            } else {
                                z37 = false;
                            }
                            z38 = zG8 | z37;
                            objE5 = rVarH.E();
                            if (z38) {
                                objE5 = new er.a() { // from class: f2.b1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.R(hjVar4, p0Var, cVar, aVar4);
                                    }
                                };
                                rVarH.v(objE5);
                            } else {
                                objE5 = new er.a() { // from class: f2.b1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.R(hjVar4, p0Var, cVar, aVar4);
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            aVar5 = (er.a) objE5;
                            if (z35) {
                                z39 = false;
                            } else {
                                z39 = false;
                            }
                            zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                            objE6 = rVarH.E();
                            if (zG2) {
                                objE6 = new a(aVar5, cVar, null);
                                rVarH.v(objE6);
                            } else {
                                objE6 = new a(aVar5, cVar, null);
                                rVarH.v(objE6);
                            }
                            h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                            int i7116 = i58 >> 6;
                            int i7117 = ((i58 << 3) & 524272) | (3670016 & i7116) | (i7116 & 29360128);
                            int i8110 = i59 << 24;
                            int i8111 = i7117 | (234881024 & i8110) | (i8110 & 1879048192);
                            int i8112 = i58 >> 15;
                            f3.m mVar10 = mVar4;
                            y2 y2Var10 = y2Var4;
                            rVar2 = rVarH;
                            y(((Number) cVar.m()).floatValue(), mVar10, hjVar4, aVar4, f212, z49, y2Var10, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i8111, ((i59 >> 6) & 14) | (i8112 & 112) | (i8112 & 896) | (i59 & 7168), 0);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar10;
                            hjVar3 = hjVar4;
                            aVar2 = aVar4;
                            f18 = f212;
                            z25 = z49;
                            y2Var2 = y2Var10;
                            j17 = j25;
                            j18 = j19;
                            f19 = f26;
                            f25 = fN;
                            pVarC = pVarC;
                            pVar4 = pVar5;
                            z26 = z35;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            aVar2 = aVar;
                            y2Var2 = y2Var;
                            mVar3 = mVar2;
                            hjVar3 = hjVar2;
                            f18 = fO;
                            pVar4 = pVar3;
                            z25 = z17;
                            z26 = z18;
                            j17 = j15;
                            j18 = j16;
                            f19 = f16;
                            f25 = f17;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.c1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i55 = i46 | MLKEMEngine.KyberPolyBytes;
                    if ((i16 & 3072) != 0) {
                        i55 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i57 = i55;
                    if ((i18 & 306783379) == 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (rVarH.r(z19, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i7118 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i7118;
                            long j215 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j215;
                        } else {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i7119 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i7119;
                            long j216 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j216;
                        }
                        rVarH.y();
                        z35 = z28;
                        if (t.k()) {
                            t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                        }
                        androidx.compose.material3.d dVar6 = androidx.compose.material3.d.f9816a;
                        j0VarF = dVar6.c(rVarH, 6).f();
                        float f213 = f27;
                        j0VarE = dVar6.c(rVarH, 6).e();
                        j0VarF2 = dVar6.c(rVarH, 6).f();
                        i65 = (i58 & 112) ^ 48;
                        boolean z410 = z27;
                        if (i65 > 32) {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        } else {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        }
                        zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                        objE2 = rVarH.E();
                        if (zG) {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        objE3 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE3 == companion.a()) {
                            objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                            rVarH.v(objE3);
                        }
                        cVar = (u0.c) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        boolean zG9 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                        if ((i58 & 896) == 256) {
                            z37 = z29;
                        } else {
                            z37 = false;
                        }
                        z38 = zG9 | z37;
                        objE5 = rVarH.E();
                        if (z38) {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar5 = (er.a) objE5;
                        if (z35) {
                            z39 = false;
                        } else {
                            z39 = false;
                        }
                        zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                        objE6 = rVarH.E();
                        if (zG2) {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        }
                        h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                        int i71110 = i58 >> 6;
                        int i71111 = ((i58 << 3) & 524272) | (3670016 & i71110) | (i71110 & 29360128);
                        int i8113 = i59 << 24;
                        int i8114 = i71111 | (234881024 & i8113) | (i8113 & 1879048192);
                        int i8115 = i58 >> 15;
                        f3.m mVar11 = mVar4;
                        y2 y2Var11 = y2Var4;
                        rVar2 = rVarH;
                        y(((Number) cVar.m()).floatValue(), mVar11, hjVar4, aVar4, f213, z410, y2Var11, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i8114, ((i59 >> 6) & 14) | (i8115 & 112) | (i8115 & 896) | (i59 & 7168), 0);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar11;
                        hjVar3 = hjVar4;
                        aVar2 = aVar4;
                        f18 = f213;
                        z25 = z410;
                        y2Var2 = y2Var11;
                        j17 = j25;
                        j18 = j19;
                        f19 = f26;
                        f25 = fN;
                        pVarC = pVarC;
                        pVar4 = pVar5;
                        z26 = z35;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        aVar2 = aVar;
                        y2Var2 = y2Var;
                        mVar3 = mVar2;
                        hjVar3 = hjVar2;
                        f18 = fO;
                        pVar4 = pVar3;
                        z25 = z17;
                        z26 = z18;
                        j17 = j15;
                        j18 = j16;
                        f19 = f16;
                        f25 = f17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.c1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i48 = i39 | 48;
                i46 = i48;
                i49 = i17 & PKIFailureInfo.certConfirmed;
                if (i49 != 0) {
                    i55 = i46;
                    if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.b(f17)) {
                            i56 = 256;
                        } else {
                            i56 = 128;
                        }
                        i55 |= i56;
                    }
                    if ((i16 & 3072) != 0) {
                        i55 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i57 = i55;
                    if ((i18 & 306783379) == 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (rVarH.r(z19, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i71112 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i71112;
                            long j217 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j217;
                        } else {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i71113 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i71113;
                            long j218 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j218;
                        }
                        rVarH.y();
                        z35 = z28;
                        if (t.k()) {
                            t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                        }
                        androidx.compose.material3.d dVar7 = androidx.compose.material3.d.f9816a;
                        j0VarF = dVar7.c(rVarH, 6).f();
                        float f214 = f27;
                        j0VarE = dVar7.c(rVarH, 6).e();
                        j0VarF2 = dVar7.c(rVarH, 6).f();
                        i65 = (i58 & 112) ^ 48;
                        boolean z411 = z27;
                        if (i65 > 32) {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        } else {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        }
                        zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                        objE2 = rVarH.E();
                        if (zG) {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        objE3 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE3 == companion.a()) {
                            objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                            rVarH.v(objE3);
                        }
                        cVar = (u0.c) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        boolean zG10 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                        if ((i58 & 896) == 256) {
                            z37 = z29;
                        } else {
                            z37 = false;
                        }
                        z38 = zG10 | z37;
                        objE5 = rVarH.E();
                        if (z38) {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar5 = (er.a) objE5;
                        if (z35) {
                            z39 = false;
                        } else {
                            z39 = false;
                        }
                        zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                        objE6 = rVarH.E();
                        if (zG2) {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        }
                        h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                        int i71114 = i58 >> 6;
                        int i71115 = ((i58 << 3) & 524272) | (3670016 & i71114) | (i71114 & 29360128);
                        int i8116 = i59 << 24;
                        int i8117 = i71115 | (234881024 & i8116) | (i8116 & 1879048192);
                        int i8118 = i58 >> 15;
                        f3.m mVar12 = mVar4;
                        y2 y2Var12 = y2Var4;
                        rVar2 = rVarH;
                        y(((Number) cVar.m()).floatValue(), mVar12, hjVar4, aVar4, f214, z411, y2Var12, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i8117, ((i59 >> 6) & 14) | (i8118 & 112) | (i8118 & 896) | (i59 & 7168), 0);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar12;
                        hjVar3 = hjVar4;
                        aVar2 = aVar4;
                        f18 = f214;
                        z25 = z411;
                        y2Var2 = y2Var12;
                        j17 = j25;
                        j18 = j19;
                        f19 = f26;
                        f25 = fN;
                        pVarC = pVarC;
                        pVar4 = pVar5;
                        z26 = z35;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        aVar2 = aVar;
                        y2Var2 = y2Var;
                        mVar3 = mVar2;
                        hjVar3 = hjVar2;
                        f18 = fO;
                        pVar4 = pVar3;
                        z25 = z17;
                        z26 = z18;
                        j17 = j15;
                        j18 = j16;
                        f19 = f16;
                        f25 = f17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.c1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i55 = i46 | MLKEMEngine.KyberPolyBytes;
                if ((i16 & 3072) != 0) {
                    i55 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i57 = i55;
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i71116 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i71116;
                        long j219 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j219;
                    } else {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i71117 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i71117;
                        long j2110 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j2110;
                    }
                    rVarH.y();
                    z35 = z28;
                    if (t.k()) {
                        t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                    }
                    androidx.compose.material3.d dVar8 = androidx.compose.material3.d.f9816a;
                    j0VarF = dVar8.c(rVarH, 6).f();
                    float f215 = f27;
                    j0VarE = dVar8.c(rVarH, 6).e();
                    j0VarF2 = dVar8.c(rVarH, 6).f();
                    i65 = (i58 & 112) ^ 48;
                    boolean z412 = z27;
                    if (i65 > 32) {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    } else {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    }
                    zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    objE3 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE3 == companion.a()) {
                        objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                        rVarH.v(objE3);
                    }
                    cVar = (u0.c) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    boolean zG11 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                    if ((i58 & 896) == 256) {
                        z37 = z29;
                    } else {
                        z37 = false;
                    }
                    z38 = zG11 | z37;
                    objE5 = rVarH.E();
                    if (z38) {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar5 = (er.a) objE5;
                    if (z35) {
                        z39 = false;
                    } else {
                        z39 = false;
                    }
                    zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                    objE6 = rVarH.E();
                    if (zG2) {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    }
                    h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                    int i71118 = i58 >> 6;
                    int i71119 = ((i58 << 3) & 524272) | (3670016 & i71118) | (i71118 & 29360128);
                    int i8119 = i59 << 24;
                    int i81110 = i71119 | (234881024 & i8119) | (i8119 & 1879048192);
                    int i81111 = i58 >> 15;
                    f3.m mVar13 = mVar4;
                    y2 y2Var13 = y2Var4;
                    rVar2 = rVarH;
                    y(((Number) cVar.m()).floatValue(), mVar13, hjVar4, aVar4, f215, z412, y2Var13, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i81110, ((i59 >> 6) & 14) | (i81111 & 112) | (i81111 & 896) | (i59 & 7168), 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar13;
                    hjVar3 = hjVar4;
                    aVar2 = aVar4;
                    f18 = f215;
                    z25 = z412;
                    y2Var2 = y2Var13;
                    j17 = j25;
                    j18 = j19;
                    f19 = f26;
                    f25 = fN;
                    pVarC = pVarC;
                    pVar4 = pVar5;
                    z26 = z35;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    aVar2 = aVar;
                    y2Var2 = y2Var;
                    mVar3 = mVar2;
                    hjVar3 = hjVar2;
                    f18 = fO;
                    pVar4 = pVar3;
                    z25 = z17;
                    z26 = z18;
                    j17 = j15;
                    j18 = j16;
                    f19 = f16;
                    f25 = f17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.c1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 3072;
            fO = f15;
            i26 = i17 & 16;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    z17 = z15;
                    if (rVarH.a(z17)) {
                        i27 = 16384;
                    } else {
                        i27 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i27;
                }
                i28 = i17 & 32;
                if (i28 != 0) {
                    i18 |= 196608;
                    z18 = z16;
                } else {
                    z18 = z16;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.a(z18)) {
                            i29 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i29 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i29;
                    }
                }
                i35 = i17 & 64;
                if (i35 != 0) {
                    i18 |= 1572864;
                    pVarC = pVar;
                } else {
                    pVarC = pVar;
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.G(pVarC)) {
                            i36 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i36 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i36;
                    }
                }
                if ((i15 & 12582912) == 0) {
                    if ((i17 & 128) == 0) {
                        pVar3 = pVar2;
                        if (rVarH.G(pVar3)) {
                        }
                        i18 |= i75;
                    } else {
                        pVar3 = pVar2;
                    }
                    i18 |= i75;
                } else {
                    pVar3 = pVar2;
                }
                if ((i15 & 100663296) != 0) {
                    i18 |= ((i17 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
                }
                if ((i15 & 805306368) == 0) {
                    if ((i17 & 512) == 0) {
                        i37 = i67;
                        if (rVarH.d(j15)) {
                        }
                        i18 |= i76;
                    } else {
                        i37 = i67;
                    }
                    i18 |= i76;
                } else {
                    i37 = i67;
                }
                if ((i16 & 6) == 0) {
                    if ((i17 & 1024) == 0) {
                        i66 = 2;
                    } else {
                        i66 = 2;
                    }
                    i38 = i66 | i16;
                } else {
                    i38 = i16;
                }
                i39 = i38;
                i45 = i17 & 2048;
                if (i45 != 0) {
                    if ((i16 & 48) == 0) {
                        if (rVarH.b(f16)) {
                            i47 = 32;
                        } else {
                            i47 = 16;
                        }
                        i48 = i39 | i47;
                    } else {
                        i45 = i45;
                        i46 = i39;
                    }
                    i49 = i17 & PKIFailureInfo.certConfirmed;
                    if (i49 != 0) {
                        i55 = i46;
                        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                            if (rVarH.b(f17)) {
                                i56 = 256;
                            } else {
                                i56 = 128;
                            }
                            i55 |= i56;
                        }
                        if ((i16 & 3072) != 0) {
                            i55 |= rVarH.G(qVar) ? 2048 : 1024;
                        }
                        i57 = i55;
                        if ((i18 & 306783379) == 306783378) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (rVarH.r(z19, i18 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i37 != 0) {
                                    mVar4 = f3.m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if ((i17 & 2) != 0) {
                                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                    i18 &= -113;
                                } else {
                                    hjVarY = hjVar2;
                                }
                                if (i69 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new er.a() { // from class: f2.x0
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.O();
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    aVar3 = (er.a) objE;
                                } else {
                                    aVar3 = aVar;
                                }
                                if (i19 != 0) {
                                    fO = n0.f56958a.o();
                                }
                                if (i26 != 0) {
                                    z17 = true;
                                }
                                if (i28 != 0) {
                                    z18 = true;
                                }
                                if (i35 != 0) {
                                    pVarC = k3.f56525a.c();
                                }
                                if ((i17 & 128) != 0) {
                                    pVar3 = new p() { // from class: f2.y0
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.P((r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                    i18 &= -29360129;
                                }
                                if ((i17 & 256) != 0) {
                                    y2VarK = n0.f56958a.k(rVarH, 6);
                                    i18 &= -234881025;
                                } else {
                                    y2VarK = y2Var;
                                }
                                if ((i17 & 512) != 0) {
                                    i18 = (-1879048193) & i18;
                                    jI = n0.f56958a.i(rVarH, 6);
                                } else {
                                    jI = j15;
                                }
                                if ((i17 & 1024) != 0) {
                                    jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                    i57 &= -15;
                                } else {
                                    jE = j16;
                                }
                                if (i45 != 0) {
                                    fJ = n0.f56958a.j();
                                } else {
                                    fJ = f16;
                                }
                                int i711110 = i57;
                                if (i49 != 0) {
                                    fN = c5.h.n(0);
                                } else {
                                    fN = f17;
                                }
                                i58 = i18;
                                pVar5 = pVar3;
                                z27 = z17;
                                z28 = z18;
                                f26 = fJ;
                                i59 = i711110;
                                long j2111 = jI;
                                hjVar4 = hjVarY;
                                aVar4 = aVar3;
                                f27 = fO;
                                y2Var3 = y2VarK;
                                j19 = jE;
                                z29 = true;
                                j25 = j2111;
                            } else {
                                if (i37 != 0) {
                                    mVar4 = f3.m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if ((i17 & 2) != 0) {
                                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                    i18 &= -113;
                                } else {
                                    hjVarY = hjVar2;
                                }
                                if (i69 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new er.a() { // from class: f2.x0
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.O();
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    aVar3 = (er.a) objE;
                                } else {
                                    aVar3 = aVar;
                                }
                                if (i19 != 0) {
                                    fO = n0.f56958a.o();
                                }
                                if (i26 != 0) {
                                    z17 = true;
                                }
                                if (i28 != 0) {
                                    z18 = true;
                                }
                                if (i35 != 0) {
                                    pVarC = k3.f56525a.c();
                                }
                                if ((i17 & 128) != 0) {
                                    pVar3 = new p() { // from class: f2.y0
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.P((r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                    i18 &= -29360129;
                                }
                                if ((i17 & 256) != 0) {
                                    y2VarK = n0.f56958a.k(rVarH, 6);
                                    i18 &= -234881025;
                                } else {
                                    y2VarK = y2Var;
                                }
                                if ((i17 & 512) != 0) {
                                    i18 = (-1879048193) & i18;
                                    jI = n0.f56958a.i(rVarH, 6);
                                } else {
                                    jI = j15;
                                }
                                if ((i17 & 1024) != 0) {
                                    jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                    i57 &= -15;
                                } else {
                                    jE = j16;
                                }
                                if (i45 != 0) {
                                    fJ = n0.f56958a.j();
                                } else {
                                    fJ = f16;
                                }
                                int i711111 = i57;
                                if (i49 != 0) {
                                    fN = c5.h.n(0);
                                } else {
                                    fN = f17;
                                }
                                i58 = i18;
                                pVar5 = pVar3;
                                z27 = z17;
                                z28 = z18;
                                f26 = fJ;
                                i59 = i711111;
                                long j2112 = jI;
                                hjVar4 = hjVarY;
                                aVar4 = aVar3;
                                f27 = fO;
                                y2Var3 = y2VarK;
                                j19 = jE;
                                z29 = true;
                                j25 = j2112;
                            }
                            rVarH.y();
                            z35 = z28;
                            if (t.k()) {
                                t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                            }
                            androidx.compose.material3.d dVar9 = androidx.compose.material3.d.f9816a;
                            j0VarF = dVar9.c(rVarH, 6).f();
                            float f216 = f27;
                            j0VarE = dVar9.c(rVarH, 6).e();
                            j0VarF2 = dVar9.c(rVarH, 6).f();
                            i65 = (i58 & 112) ^ 48;
                            boolean z413 = z27;
                            if (i65 > 32) {
                                y2Var4 = y2Var3;
                                if ((i58 & 48) != 32) {
                                    z36 = z29;
                                } else {
                                    z36 = false;
                                }
                            } else {
                                y2Var4 = y2Var3;
                                if ((i58 & 48) != 32) {
                                    z36 = z29;
                                } else {
                                    z36 = false;
                                }
                            }
                            zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                            objE2 = rVarH.E();
                            if (zG) {
                                objE2 = new er.a() { // from class: f2.a1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.a() { // from class: f2.a1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            Function0.g((er.a) objE2, rVarH, 0);
                            objE3 = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE3 == companion.a()) {
                                objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                                rVarH.v(objE3);
                            }
                            cVar = (u0.c) objE3;
                            objE4 = rVarH.E();
                            if (objE4 == companion.a()) {
                                objE4 = Function0.i(tq.j.f191408a, rVarH);
                                rVarH.v(objE4);
                            }
                            p0Var = (p0) objE4;
                            boolean zG12 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                            if ((i58 & 896) == 256) {
                                z37 = z29;
                            } else {
                                z37 = false;
                            }
                            z38 = zG12 | z37;
                            objE5 = rVarH.E();
                            if (z38) {
                                objE5 = new er.a() { // from class: f2.b1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.R(hjVar4, p0Var, cVar, aVar4);
                                    }
                                };
                                rVarH.v(objE5);
                            } else {
                                objE5 = new er.a() { // from class: f2.b1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.R(hjVar4, p0Var, cVar, aVar4);
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            aVar5 = (er.a) objE5;
                            if (z35) {
                                z39 = false;
                            } else {
                                z39 = false;
                            }
                            zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                            objE6 = rVarH.E();
                            if (zG2) {
                                objE6 = new a(aVar5, cVar, null);
                                rVarH.v(objE6);
                            } else {
                                objE6 = new a(aVar5, cVar, null);
                                rVarH.v(objE6);
                            }
                            h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                            int i711112 = i58 >> 6;
                            int i711113 = ((i58 << 3) & 524272) | (3670016 & i711112) | (i711112 & 29360128);
                            int i81112 = i59 << 24;
                            int i81113 = i711113 | (234881024 & i81112) | (i81112 & 1879048192);
                            int i81114 = i58 >> 15;
                            f3.m mVar14 = mVar4;
                            y2 y2Var14 = y2Var4;
                            rVar2 = rVarH;
                            y(((Number) cVar.m()).floatValue(), mVar14, hjVar4, aVar4, f216, z413, y2Var14, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i81113, ((i59 >> 6) & 14) | (i81114 & 112) | (i81114 & 896) | (i59 & 7168), 0);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar14;
                            hjVar3 = hjVar4;
                            aVar2 = aVar4;
                            f18 = f216;
                            z25 = z413;
                            y2Var2 = y2Var14;
                            j17 = j25;
                            j18 = j19;
                            f19 = f26;
                            f25 = fN;
                            pVarC = pVarC;
                            pVar4 = pVar5;
                            z26 = z35;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            aVar2 = aVar;
                            y2Var2 = y2Var;
                            mVar3 = mVar2;
                            hjVar3 = hjVar2;
                            f18 = fO;
                            pVar4 = pVar3;
                            z25 = z17;
                            z26 = z18;
                            j17 = j15;
                            j18 = j16;
                            f19 = f16;
                            f25 = f17;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.c1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i55 = i46 | MLKEMEngine.KyberPolyBytes;
                    if ((i16 & 3072) != 0) {
                        i55 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i57 = i55;
                    if ((i18 & 306783379) == 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (rVarH.r(z19, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i711114 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i711114;
                            long j2113 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j2113;
                        } else {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i711115 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i711115;
                            long j2114 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j2114;
                        }
                        rVarH.y();
                        z35 = z28;
                        if (t.k()) {
                            t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                        }
                        androidx.compose.material3.d dVar10 = androidx.compose.material3.d.f9816a;
                        j0VarF = dVar10.c(rVarH, 6).f();
                        float f217 = f27;
                        j0VarE = dVar10.c(rVarH, 6).e();
                        j0VarF2 = dVar10.c(rVarH, 6).f();
                        i65 = (i58 & 112) ^ 48;
                        boolean z414 = z27;
                        if (i65 > 32) {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        } else {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        }
                        zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                        objE2 = rVarH.E();
                        if (zG) {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        objE3 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE3 == companion.a()) {
                            objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                            rVarH.v(objE3);
                        }
                        cVar = (u0.c) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        boolean zG13 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                        if ((i58 & 896) == 256) {
                            z37 = z29;
                        } else {
                            z37 = false;
                        }
                        z38 = zG13 | z37;
                        objE5 = rVarH.E();
                        if (z38) {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar5 = (er.a) objE5;
                        if (z35) {
                            z39 = false;
                        } else {
                            z39 = false;
                        }
                        zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                        objE6 = rVarH.E();
                        if (zG2) {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        }
                        h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                        int i711116 = i58 >> 6;
                        int i711117 = ((i58 << 3) & 524272) | (3670016 & i711116) | (i711116 & 29360128);
                        int i81115 = i59 << 24;
                        int i81116 = i711117 | (234881024 & i81115) | (i81115 & 1879048192);
                        int i81117 = i58 >> 15;
                        f3.m mVar15 = mVar4;
                        y2 y2Var15 = y2Var4;
                        rVar2 = rVarH;
                        y(((Number) cVar.m()).floatValue(), mVar15, hjVar4, aVar4, f217, z414, y2Var15, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i81116, ((i59 >> 6) & 14) | (i81117 & 112) | (i81117 & 896) | (i59 & 7168), 0);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar15;
                        hjVar3 = hjVar4;
                        aVar2 = aVar4;
                        f18 = f217;
                        z25 = z414;
                        y2Var2 = y2Var15;
                        j17 = j25;
                        j18 = j19;
                        f19 = f26;
                        f25 = fN;
                        pVarC = pVarC;
                        pVar4 = pVar5;
                        z26 = z35;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        aVar2 = aVar;
                        y2Var2 = y2Var;
                        mVar3 = mVar2;
                        hjVar3 = hjVar2;
                        f18 = fO;
                        pVar4 = pVar3;
                        z25 = z17;
                        z26 = z18;
                        j17 = j15;
                        j18 = j16;
                        f19 = f16;
                        f25 = f17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.c1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i48 = i39 | 48;
                i46 = i48;
                i49 = i17 & PKIFailureInfo.certConfirmed;
                if (i49 != 0) {
                    i55 = i46;
                    if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.b(f17)) {
                            i56 = 256;
                        } else {
                            i56 = 128;
                        }
                        i55 |= i56;
                    }
                    if ((i16 & 3072) != 0) {
                        i55 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i57 = i55;
                    if ((i18 & 306783379) == 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (rVarH.r(z19, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i711118 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i711118;
                            long j2115 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j2115;
                        } else {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i711119 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i711119;
                            long j2116 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j2116;
                        }
                        rVarH.y();
                        z35 = z28;
                        if (t.k()) {
                            t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                        }
                        androidx.compose.material3.d dVar11 = androidx.compose.material3.d.f9816a;
                        j0VarF = dVar11.c(rVarH, 6).f();
                        float f218 = f27;
                        j0VarE = dVar11.c(rVarH, 6).e();
                        j0VarF2 = dVar11.c(rVarH, 6).f();
                        i65 = (i58 & 112) ^ 48;
                        boolean z415 = z27;
                        if (i65 > 32) {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        } else {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        }
                        zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                        objE2 = rVarH.E();
                        if (zG) {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        objE3 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE3 == companion.a()) {
                            objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                            rVarH.v(objE3);
                        }
                        cVar = (u0.c) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        boolean zG14 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                        if ((i58 & 896) == 256) {
                            z37 = z29;
                        } else {
                            z37 = false;
                        }
                        z38 = zG14 | z37;
                        objE5 = rVarH.E();
                        if (z38) {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar5 = (er.a) objE5;
                        if (z35) {
                            z39 = false;
                        } else {
                            z39 = false;
                        }
                        zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                        objE6 = rVarH.E();
                        if (zG2) {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        }
                        h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                        int i7111110 = i58 >> 6;
                        int i7111111 = ((i58 << 3) & 524272) | (3670016 & i7111110) | (i7111110 & 29360128);
                        int i81118 = i59 << 24;
                        int i81119 = i7111111 | (234881024 & i81118) | (i81118 & 1879048192);
                        int i811110 = i58 >> 15;
                        f3.m mVar16 = mVar4;
                        y2 y2Var16 = y2Var4;
                        rVar2 = rVarH;
                        y(((Number) cVar.m()).floatValue(), mVar16, hjVar4, aVar4, f218, z415, y2Var16, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i81119, ((i59 >> 6) & 14) | (i811110 & 112) | (i811110 & 896) | (i59 & 7168), 0);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar16;
                        hjVar3 = hjVar4;
                        aVar2 = aVar4;
                        f18 = f218;
                        z25 = z415;
                        y2Var2 = y2Var16;
                        j17 = j25;
                        j18 = j19;
                        f19 = f26;
                        f25 = fN;
                        pVarC = pVarC;
                        pVar4 = pVar5;
                        z26 = z35;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        aVar2 = aVar;
                        y2Var2 = y2Var;
                        mVar3 = mVar2;
                        hjVar3 = hjVar2;
                        f18 = fO;
                        pVar4 = pVar3;
                        z25 = z17;
                        z26 = z18;
                        j17 = j15;
                        j18 = j16;
                        f19 = f16;
                        f25 = f17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.c1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i55 = i46 | MLKEMEngine.KyberPolyBytes;
                if ((i16 & 3072) != 0) {
                    i55 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i57 = i55;
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i7111112 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i7111112;
                        long j2117 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j2117;
                    } else {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i7111113 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i7111113;
                        long j2118 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j2118;
                    }
                    rVarH.y();
                    z35 = z28;
                    if (t.k()) {
                        t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                    }
                    androidx.compose.material3.d dVar12 = androidx.compose.material3.d.f9816a;
                    j0VarF = dVar12.c(rVarH, 6).f();
                    float f219 = f27;
                    j0VarE = dVar12.c(rVarH, 6).e();
                    j0VarF2 = dVar12.c(rVarH, 6).f();
                    i65 = (i58 & 112) ^ 48;
                    boolean z416 = z27;
                    if (i65 > 32) {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    } else {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    }
                    zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    objE3 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE3 == companion.a()) {
                        objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                        rVarH.v(objE3);
                    }
                    cVar = (u0.c) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    boolean zG15 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                    if ((i58 & 896) == 256) {
                        z37 = z29;
                    } else {
                        z37 = false;
                    }
                    z38 = zG15 | z37;
                    objE5 = rVarH.E();
                    if (z38) {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar5 = (er.a) objE5;
                    if (z35) {
                        z39 = false;
                    } else {
                        z39 = false;
                    }
                    zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                    objE6 = rVarH.E();
                    if (zG2) {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    }
                    h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                    int i7111114 = i58 >> 6;
                    int i7111115 = ((i58 << 3) & 524272) | (3670016 & i7111114) | (i7111114 & 29360128);
                    int i811111 = i59 << 24;
                    int i811112 = i7111115 | (234881024 & i811111) | (i811111 & 1879048192);
                    int i811113 = i58 >> 15;
                    f3.m mVar17 = mVar4;
                    y2 y2Var17 = y2Var4;
                    rVar2 = rVarH;
                    y(((Number) cVar.m()).floatValue(), mVar17, hjVar4, aVar4, f219, z416, y2Var17, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i811112, ((i59 >> 6) & 14) | (i811113 & 112) | (i811113 & 896) | (i59 & 7168), 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar17;
                    hjVar3 = hjVar4;
                    aVar2 = aVar4;
                    f18 = f219;
                    z25 = z416;
                    y2Var2 = y2Var17;
                    j17 = j25;
                    j18 = j19;
                    f19 = f26;
                    f25 = fN;
                    pVarC = pVarC;
                    pVar4 = pVar5;
                    z26 = z35;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    aVar2 = aVar;
                    y2Var2 = y2Var;
                    mVar3 = mVar2;
                    hjVar3 = hjVar2;
                    f18 = fO;
                    pVar4 = pVar3;
                    z25 = z17;
                    z26 = z18;
                    j17 = j15;
                    j18 = j16;
                    f19 = f16;
                    f25 = f17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.c1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            z17 = z15;
            i28 = i17 & 32;
            if (i28 != 0) {
                i18 |= 196608;
                z18 = z16;
            } else {
                z18 = z16;
                if ((i15 & 196608) == 0) {
                    if (rVarH.a(z18)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i29 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i29;
                }
            }
            i35 = i17 & 64;
            if (i35 != 0) {
                i18 |= 1572864;
                pVarC = pVar;
            } else {
                pVarC = pVar;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(pVarC)) {
                        i36 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i36;
                }
            }
            if ((i15 & 12582912) == 0) {
                if ((i17 & 128) == 0) {
                    pVar3 = pVar2;
                    if (rVarH.G(pVar3)) {
                    }
                    i18 |= i75;
                } else {
                    pVar3 = pVar2;
                }
                i18 |= i75;
            } else {
                pVar3 = pVar2;
            }
            if ((i15 & 100663296) != 0) {
                i18 |= ((i17 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
            }
            if ((i15 & 805306368) == 0) {
                if ((i17 & 512) == 0) {
                    i37 = i67;
                    if (rVarH.d(j15)) {
                    }
                    i18 |= i76;
                } else {
                    i37 = i67;
                }
                i18 |= i76;
            } else {
                i37 = i67;
            }
            if ((i16 & 6) == 0) {
                if ((i17 & 1024) == 0) {
                    i66 = 2;
                } else {
                    i66 = 2;
                }
                i38 = i66 | i16;
            } else {
                i38 = i16;
            }
            i39 = i38;
            i45 = i17 & 2048;
            if (i45 != 0) {
                if ((i16 & 48) == 0) {
                    if (rVarH.b(f16)) {
                        i47 = 32;
                    } else {
                        i47 = 16;
                    }
                    i48 = i39 | i47;
                } else {
                    i45 = i45;
                    i46 = i39;
                }
                i49 = i17 & PKIFailureInfo.certConfirmed;
                if (i49 != 0) {
                    i55 = i46;
                    if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.b(f17)) {
                            i56 = 256;
                        } else {
                            i56 = 128;
                        }
                        i55 |= i56;
                    }
                    if ((i16 & 3072) != 0) {
                        i55 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i57 = i55;
                    if ((i18 & 306783379) == 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (rVarH.r(z19, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i7111116 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i7111116;
                            long j2119 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j2119;
                        } else {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i7111117 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i7111117;
                            long j21110 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j21110;
                        }
                        rVarH.y();
                        z35 = z28;
                        if (t.k()) {
                            t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                        }
                        androidx.compose.material3.d dVar13 = androidx.compose.material3.d.f9816a;
                        j0VarF = dVar13.c(rVarH, 6).f();
                        float f2110 = f27;
                        j0VarE = dVar13.c(rVarH, 6).e();
                        j0VarF2 = dVar13.c(rVarH, 6).f();
                        i65 = (i58 & 112) ^ 48;
                        boolean z417 = z27;
                        if (i65 > 32) {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        } else {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        }
                        zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                        objE2 = rVarH.E();
                        if (zG) {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        objE3 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE3 == companion.a()) {
                            objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                            rVarH.v(objE3);
                        }
                        cVar = (u0.c) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        boolean zG16 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                        if ((i58 & 896) == 256) {
                            z37 = z29;
                        } else {
                            z37 = false;
                        }
                        z38 = zG16 | z37;
                        objE5 = rVarH.E();
                        if (z38) {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar5 = (er.a) objE5;
                        if (z35) {
                            z39 = false;
                        } else {
                            z39 = false;
                        }
                        zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                        objE6 = rVarH.E();
                        if (zG2) {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        }
                        h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                        int i7111118 = i58 >> 6;
                        int i7111119 = ((i58 << 3) & 524272) | (3670016 & i7111118) | (i7111118 & 29360128);
                        int i811114 = i59 << 24;
                        int i811115 = i7111119 | (234881024 & i811114) | (i811114 & 1879048192);
                        int i811116 = i58 >> 15;
                        f3.m mVar18 = mVar4;
                        y2 y2Var18 = y2Var4;
                        rVar2 = rVarH;
                        y(((Number) cVar.m()).floatValue(), mVar18, hjVar4, aVar4, f2110, z417, y2Var18, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i811115, ((i59 >> 6) & 14) | (i811116 & 112) | (i811116 & 896) | (i59 & 7168), 0);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar18;
                        hjVar3 = hjVar4;
                        aVar2 = aVar4;
                        f18 = f2110;
                        z25 = z417;
                        y2Var2 = y2Var18;
                        j17 = j25;
                        j18 = j19;
                        f19 = f26;
                        f25 = fN;
                        pVarC = pVarC;
                        pVar4 = pVar5;
                        z26 = z35;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        aVar2 = aVar;
                        y2Var2 = y2Var;
                        mVar3 = mVar2;
                        hjVar3 = hjVar2;
                        f18 = fO;
                        pVar4 = pVar3;
                        z25 = z17;
                        z26 = z18;
                        j17 = j15;
                        j18 = j16;
                        f19 = f16;
                        f25 = f17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.c1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i55 = i46 | MLKEMEngine.KyberPolyBytes;
                if ((i16 & 3072) != 0) {
                    i55 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i57 = i55;
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i71111110 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i71111110;
                        long j21111 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j21111;
                    } else {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i71111111 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i71111111;
                        long j21112 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j21112;
                    }
                    rVarH.y();
                    z35 = z28;
                    if (t.k()) {
                        t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                    }
                    androidx.compose.material3.d dVar14 = androidx.compose.material3.d.f9816a;
                    j0VarF = dVar14.c(rVarH, 6).f();
                    float f2111 = f27;
                    j0VarE = dVar14.c(rVarH, 6).e();
                    j0VarF2 = dVar14.c(rVarH, 6).f();
                    i65 = (i58 & 112) ^ 48;
                    boolean z418 = z27;
                    if (i65 > 32) {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    } else {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    }
                    zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    objE3 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE3 == companion.a()) {
                        objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                        rVarH.v(objE3);
                    }
                    cVar = (u0.c) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    boolean zG17 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                    if ((i58 & 896) == 256) {
                        z37 = z29;
                    } else {
                        z37 = false;
                    }
                    z38 = zG17 | z37;
                    objE5 = rVarH.E();
                    if (z38) {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar5 = (er.a) objE5;
                    if (z35) {
                        z39 = false;
                    } else {
                        z39 = false;
                    }
                    zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                    objE6 = rVarH.E();
                    if (zG2) {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    }
                    h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                    int i71111112 = i58 >> 6;
                    int i71111113 = ((i58 << 3) & 524272) | (3670016 & i71111112) | (i71111112 & 29360128);
                    int i811117 = i59 << 24;
                    int i811118 = i71111113 | (234881024 & i811117) | (i811117 & 1879048192);
                    int i811119 = i58 >> 15;
                    f3.m mVar19 = mVar4;
                    y2 y2Var19 = y2Var4;
                    rVar2 = rVarH;
                    y(((Number) cVar.m()).floatValue(), mVar19, hjVar4, aVar4, f2111, z418, y2Var19, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i811118, ((i59 >> 6) & 14) | (i811119 & 112) | (i811119 & 896) | (i59 & 7168), 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar19;
                    hjVar3 = hjVar4;
                    aVar2 = aVar4;
                    f18 = f2111;
                    z25 = z418;
                    y2Var2 = y2Var19;
                    j17 = j25;
                    j18 = j19;
                    f19 = f26;
                    f25 = fN;
                    pVarC = pVarC;
                    pVar4 = pVar5;
                    z26 = z35;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    aVar2 = aVar;
                    y2Var2 = y2Var;
                    mVar3 = mVar2;
                    hjVar3 = hjVar2;
                    f18 = fO;
                    pVar4 = pVar3;
                    z25 = z17;
                    z26 = z18;
                    j17 = j15;
                    j18 = j16;
                    f19 = f16;
                    f25 = f17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.c1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i48 = i39 | 48;
            i46 = i48;
            i49 = i17 & PKIFailureInfo.certConfirmed;
            if (i49 != 0) {
                i55 = i46;
                if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.b(f17)) {
                        i56 = 256;
                    } else {
                        i56 = 128;
                    }
                    i55 |= i56;
                }
                if ((i16 & 3072) != 0) {
                    i55 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i57 = i55;
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i71111114 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i71111114;
                        long j21113 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j21113;
                    } else {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i71111115 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i71111115;
                        long j21114 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j21114;
                    }
                    rVarH.y();
                    z35 = z28;
                    if (t.k()) {
                        t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                    }
                    androidx.compose.material3.d dVar15 = androidx.compose.material3.d.f9816a;
                    j0VarF = dVar15.c(rVarH, 6).f();
                    float f2112 = f27;
                    j0VarE = dVar15.c(rVarH, 6).e();
                    j0VarF2 = dVar15.c(rVarH, 6).f();
                    i65 = (i58 & 112) ^ 48;
                    boolean z419 = z27;
                    if (i65 > 32) {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    } else {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    }
                    zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    objE3 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE3 == companion.a()) {
                        objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                        rVarH.v(objE3);
                    }
                    cVar = (u0.c) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    boolean zG18 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                    if ((i58 & 896) == 256) {
                        z37 = z29;
                    } else {
                        z37 = false;
                    }
                    z38 = zG18 | z37;
                    objE5 = rVarH.E();
                    if (z38) {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar5 = (er.a) objE5;
                    if (z35) {
                        z39 = false;
                    } else {
                        z39 = false;
                    }
                    zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                    objE6 = rVarH.E();
                    if (zG2) {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    }
                    h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                    int i71111116 = i58 >> 6;
                    int i71111117 = ((i58 << 3) & 524272) | (3670016 & i71111116) | (i71111116 & 29360128);
                    int i8111110 = i59 << 24;
                    int i8111111 = i71111117 | (234881024 & i8111110) | (i8111110 & 1879048192);
                    int i8111112 = i58 >> 15;
                    f3.m mVar110 = mVar4;
                    y2 y2Var110 = y2Var4;
                    rVar2 = rVarH;
                    y(((Number) cVar.m()).floatValue(), mVar110, hjVar4, aVar4, f2112, z419, y2Var110, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i8111111, ((i59 >> 6) & 14) | (i8111112 & 112) | (i8111112 & 896) | (i59 & 7168), 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar110;
                    hjVar3 = hjVar4;
                    aVar2 = aVar4;
                    f18 = f2112;
                    z25 = z419;
                    y2Var2 = y2Var110;
                    j17 = j25;
                    j18 = j19;
                    f19 = f26;
                    f25 = fN;
                    pVarC = pVarC;
                    pVar4 = pVar5;
                    z26 = z35;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    aVar2 = aVar;
                    y2Var2 = y2Var;
                    mVar3 = mVar2;
                    hjVar3 = hjVar2;
                    f18 = fO;
                    pVar4 = pVar3;
                    z25 = z17;
                    z26 = z18;
                    j17 = j15;
                    j18 = j16;
                    f19 = f16;
                    f25 = f17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.c1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i55 = i46 | MLKEMEngine.KyberPolyBytes;
            if ((i16 & 3072) != 0) {
                i55 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i57 = i55;
            if ((i18 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (rVarH.r(z19, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        i18 &= -113;
                    } else {
                        hjVarY = hjVar2;
                    }
                    if (i69 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.x0
                                @Override // er.a
                                public final Object a() {
                                    return l1.O();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar3 = (er.a) objE;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    }
                    if (i26 != 0) {
                        z17 = true;
                    }
                    if (i28 != 0) {
                        z18 = true;
                    }
                    if (i35 != 0) {
                        pVarC = k3.f56525a.c();
                    }
                    if ((i17 & 128) != 0) {
                        pVar3 = new p() { // from class: f2.y0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.P((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i18 &= -29360129;
                    }
                    if ((i17 & 256) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 512) != 0) {
                        i18 = (-1879048193) & i18;
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        jI = j15;
                    }
                    if ((i17 & 1024) != 0) {
                        jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                        i57 &= -15;
                    } else {
                        jE = j16;
                    }
                    if (i45 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f16;
                    }
                    int i71111118 = i57;
                    if (i49 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f17;
                    }
                    i58 = i18;
                    pVar5 = pVar3;
                    z27 = z17;
                    z28 = z18;
                    f26 = fJ;
                    i59 = i71111118;
                    long j21115 = jI;
                    hjVar4 = hjVarY;
                    aVar4 = aVar3;
                    f27 = fO;
                    y2Var3 = y2VarK;
                    j19 = jE;
                    z29 = true;
                    j25 = j21115;
                } else {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        i18 &= -113;
                    } else {
                        hjVarY = hjVar2;
                    }
                    if (i69 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.x0
                                @Override // er.a
                                public final Object a() {
                                    return l1.O();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar3 = (er.a) objE;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    }
                    if (i26 != 0) {
                        z17 = true;
                    }
                    if (i28 != 0) {
                        z18 = true;
                    }
                    if (i35 != 0) {
                        pVarC = k3.f56525a.c();
                    }
                    if ((i17 & 128) != 0) {
                        pVar3 = new p() { // from class: f2.y0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.P((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i18 &= -29360129;
                    }
                    if ((i17 & 256) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 512) != 0) {
                        i18 = (-1879048193) & i18;
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        jI = j15;
                    }
                    if ((i17 & 1024) != 0) {
                        jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                        i57 &= -15;
                    } else {
                        jE = j16;
                    }
                    if (i45 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f16;
                    }
                    int i71111119 = i57;
                    if (i49 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f17;
                    }
                    i58 = i18;
                    pVar5 = pVar3;
                    z27 = z17;
                    z28 = z18;
                    f26 = fJ;
                    i59 = i71111119;
                    long j21116 = jI;
                    hjVar4 = hjVarY;
                    aVar4 = aVar3;
                    f27 = fO;
                    y2Var3 = y2VarK;
                    j19 = jE;
                    z29 = true;
                    j25 = j21116;
                }
                rVarH.y();
                z35 = z28;
                if (t.k()) {
                    t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                }
                androidx.compose.material3.d dVar16 = androidx.compose.material3.d.f9816a;
                j0VarF = dVar16.c(rVarH, 6).f();
                float f2113 = f27;
                j0VarE = dVar16.c(rVarH, 6).e();
                j0VarF2 = dVar16.c(rVarH, 6).f();
                i65 = (i58 & 112) ^ 48;
                boolean z4110 = z27;
                if (i65 > 32) {
                    y2Var4 = y2Var3;
                    if ((i58 & 48) != 32) {
                        z36 = z29;
                    } else {
                        z36 = false;
                    }
                } else {
                    y2Var4 = y2Var3;
                    if ((i58 & 48) != 32) {
                        z36 = z29;
                    } else {
                        z36 = false;
                    }
                }
                zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                objE2 = rVarH.E();
                if (zG) {
                    objE2 = new er.a() { // from class: f2.a1
                        @Override // er.a
                        public final Object a() {
                            return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.a() { // from class: f2.a1
                        @Override // er.a
                        public final Object a() {
                            return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                        }
                    };
                    rVarH.v(objE2);
                }
                Function0.g((er.a) objE2, rVarH, 0);
                objE3 = rVarH.E();
                companion = r.INSTANCE;
                if (objE3 == companion.a()) {
                    objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                    rVarH.v(objE3);
                }
                cVar = (u0.c) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE4);
                }
                p0Var = (p0) objE4;
                boolean zG19 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                if ((i58 & 896) == 256) {
                    z37 = z29;
                } else {
                    z37 = false;
                }
                z38 = zG19 | z37;
                objE5 = rVarH.E();
                if (z38) {
                    objE5 = new er.a() { // from class: f2.b1
                        @Override // er.a
                        public final Object a() {
                            return l1.R(hjVar4, p0Var, cVar, aVar4);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new er.a() { // from class: f2.b1
                        @Override // er.a
                        public final Object a() {
                            return l1.R(hjVar4, p0Var, cVar, aVar4);
                        }
                    };
                    rVarH.v(objE5);
                }
                aVar5 = (er.a) objE5;
                if (z35) {
                    z39 = false;
                } else {
                    z39 = false;
                }
                zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                objE6 = rVarH.E();
                if (zG2) {
                    objE6 = new a(aVar5, cVar, null);
                    rVarH.v(objE6);
                } else {
                    objE6 = new a(aVar5, cVar, null);
                    rVarH.v(objE6);
                }
                h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                int i711111110 = i58 >> 6;
                int i711111111 = ((i58 << 3) & 524272) | (3670016 & i711111110) | (i711111110 & 29360128);
                int i8111113 = i59 << 24;
                int i8111114 = i711111111 | (234881024 & i8111113) | (i8111113 & 1879048192);
                int i8111115 = i58 >> 15;
                f3.m mVar111 = mVar4;
                y2 y2Var111 = y2Var4;
                rVar2 = rVarH;
                y(((Number) cVar.m()).floatValue(), mVar111, hjVar4, aVar4, f2113, z4110, y2Var111, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i8111114, ((i59 >> 6) & 14) | (i8111115 & 112) | (i8111115 & 896) | (i59 & 7168), 0);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar111;
                hjVar3 = hjVar4;
                aVar2 = aVar4;
                f18 = f2113;
                z25 = z4110;
                y2Var2 = y2Var111;
                j17 = j25;
                j18 = j19;
                f19 = f26;
                f25 = fN;
                pVarC = pVarC;
                pVar4 = pVar5;
                z26 = z35;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                aVar2 = aVar;
                y2Var2 = y2Var;
                mVar3 = mVar2;
                hjVar3 = hjVar2;
                f18 = fO;
                pVar4 = pVar3;
                z25 = z17;
                z26 = z18;
                j17 = j15;
                j18 = j16;
                f19 = f16;
                f25 = f17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.c1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= MLKEMEngine.KyberPolyBytes;
        i19 = i17 & 8;
        if (i19 != 0) {
            if ((i15 & 3072) == 0) {
                fO = f15;
                if (rVarH.b(fO)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i18 |= i25;
            }
            i26 = i17 & 16;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    z17 = z15;
                    if (rVarH.a(z17)) {
                        i27 = 16384;
                    } else {
                        i27 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i27;
                }
                i28 = i17 & 32;
                if (i28 != 0) {
                    i18 |= 196608;
                    z18 = z16;
                } else {
                    z18 = z16;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.a(z18)) {
                            i29 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i29 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i29;
                    }
                }
                i35 = i17 & 64;
                if (i35 != 0) {
                    i18 |= 1572864;
                    pVarC = pVar;
                } else {
                    pVarC = pVar;
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.G(pVarC)) {
                            i36 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i36 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i36;
                    }
                }
                if ((i15 & 12582912) == 0) {
                    if ((i17 & 128) == 0) {
                        pVar3 = pVar2;
                        if (rVarH.G(pVar3)) {
                        }
                        i18 |= i75;
                    } else {
                        pVar3 = pVar2;
                    }
                    i18 |= i75;
                } else {
                    pVar3 = pVar2;
                }
                if ((i15 & 100663296) != 0) {
                    i18 |= ((i17 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
                }
                if ((i15 & 805306368) == 0) {
                    if ((i17 & 512) == 0) {
                        i37 = i67;
                        if (rVarH.d(j15)) {
                        }
                        i18 |= i76;
                    } else {
                        i37 = i67;
                    }
                    i18 |= i76;
                } else {
                    i37 = i67;
                }
                if ((i16 & 6) == 0) {
                    if ((i17 & 1024) == 0) {
                        i66 = 2;
                    } else {
                        i66 = 2;
                    }
                    i38 = i66 | i16;
                } else {
                    i38 = i16;
                }
                i39 = i38;
                i45 = i17 & 2048;
                if (i45 != 0) {
                    if ((i16 & 48) == 0) {
                        if (rVarH.b(f16)) {
                            i47 = 32;
                        } else {
                            i47 = 16;
                        }
                        i48 = i39 | i47;
                    } else {
                        i45 = i45;
                        i46 = i39;
                    }
                    i49 = i17 & PKIFailureInfo.certConfirmed;
                    if (i49 != 0) {
                        i55 = i46;
                        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                            if (rVarH.b(f17)) {
                                i56 = 256;
                            } else {
                                i56 = 128;
                            }
                            i55 |= i56;
                        }
                        if ((i16 & 3072) != 0) {
                            i55 |= rVarH.G(qVar) ? 2048 : 1024;
                        }
                        i57 = i55;
                        if ((i18 & 306783379) == 306783378) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (rVarH.r(z19, i18 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i37 != 0) {
                                    mVar4 = f3.m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if ((i17 & 2) != 0) {
                                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                    i18 &= -113;
                                } else {
                                    hjVarY = hjVar2;
                                }
                                if (i69 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new er.a() { // from class: f2.x0
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.O();
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    aVar3 = (er.a) objE;
                                } else {
                                    aVar3 = aVar;
                                }
                                if (i19 != 0) {
                                    fO = n0.f56958a.o();
                                }
                                if (i26 != 0) {
                                    z17 = true;
                                }
                                if (i28 != 0) {
                                    z18 = true;
                                }
                                if (i35 != 0) {
                                    pVarC = k3.f56525a.c();
                                }
                                if ((i17 & 128) != 0) {
                                    pVar3 = new p() { // from class: f2.y0
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.P((r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                    i18 &= -29360129;
                                }
                                if ((i17 & 256) != 0) {
                                    y2VarK = n0.f56958a.k(rVarH, 6);
                                    i18 &= -234881025;
                                } else {
                                    y2VarK = y2Var;
                                }
                                if ((i17 & 512) != 0) {
                                    i18 = (-1879048193) & i18;
                                    jI = n0.f56958a.i(rVarH, 6);
                                } else {
                                    jI = j15;
                                }
                                if ((i17 & 1024) != 0) {
                                    jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                    i57 &= -15;
                                } else {
                                    jE = j16;
                                }
                                if (i45 != 0) {
                                    fJ = n0.f56958a.j();
                                } else {
                                    fJ = f16;
                                }
                                int i711111112 = i57;
                                if (i49 != 0) {
                                    fN = c5.h.n(0);
                                } else {
                                    fN = f17;
                                }
                                i58 = i18;
                                pVar5 = pVar3;
                                z27 = z17;
                                z28 = z18;
                                f26 = fJ;
                                i59 = i711111112;
                                long j21117 = jI;
                                hjVar4 = hjVarY;
                                aVar4 = aVar3;
                                f27 = fO;
                                y2Var3 = y2VarK;
                                j19 = jE;
                                z29 = true;
                                j25 = j21117;
                            } else {
                                if (i37 != 0) {
                                    mVar4 = f3.m.INSTANCE;
                                } else {
                                    mVar4 = mVar2;
                                }
                                if ((i17 & 2) != 0) {
                                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                    i18 &= -113;
                                } else {
                                    hjVarY = hjVar2;
                                }
                                if (i69 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new er.a() { // from class: f2.x0
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.O();
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    aVar3 = (er.a) objE;
                                } else {
                                    aVar3 = aVar;
                                }
                                if (i19 != 0) {
                                    fO = n0.f56958a.o();
                                }
                                if (i26 != 0) {
                                    z17 = true;
                                }
                                if (i28 != 0) {
                                    z18 = true;
                                }
                                if (i35 != 0) {
                                    pVarC = k3.f56525a.c();
                                }
                                if ((i17 & 128) != 0) {
                                    pVar3 = new p() { // from class: f2.y0
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.P((r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                    i18 &= -29360129;
                                }
                                if ((i17 & 256) != 0) {
                                    y2VarK = n0.f56958a.k(rVarH, 6);
                                    i18 &= -234881025;
                                } else {
                                    y2VarK = y2Var;
                                }
                                if ((i17 & 512) != 0) {
                                    i18 = (-1879048193) & i18;
                                    jI = n0.f56958a.i(rVarH, 6);
                                } else {
                                    jI = j15;
                                }
                                if ((i17 & 1024) != 0) {
                                    jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                    i57 &= -15;
                                } else {
                                    jE = j16;
                                }
                                if (i45 != 0) {
                                    fJ = n0.f56958a.j();
                                } else {
                                    fJ = f16;
                                }
                                int i711111113 = i57;
                                if (i49 != 0) {
                                    fN = c5.h.n(0);
                                } else {
                                    fN = f17;
                                }
                                i58 = i18;
                                pVar5 = pVar3;
                                z27 = z17;
                                z28 = z18;
                                f26 = fJ;
                                i59 = i711111113;
                                long j21118 = jI;
                                hjVar4 = hjVarY;
                                aVar4 = aVar3;
                                f27 = fO;
                                y2Var3 = y2VarK;
                                j19 = jE;
                                z29 = true;
                                j25 = j21118;
                            }
                            rVarH.y();
                            z35 = z28;
                            if (t.k()) {
                                t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                            }
                            androidx.compose.material3.d dVar17 = androidx.compose.material3.d.f9816a;
                            j0VarF = dVar17.c(rVarH, 6).f();
                            float f2114 = f27;
                            j0VarE = dVar17.c(rVarH, 6).e();
                            j0VarF2 = dVar17.c(rVarH, 6).f();
                            i65 = (i58 & 112) ^ 48;
                            boolean z4111 = z27;
                            if (i65 > 32) {
                                y2Var4 = y2Var3;
                                if ((i58 & 48) != 32) {
                                    z36 = z29;
                                } else {
                                    z36 = false;
                                }
                            } else {
                                y2Var4 = y2Var3;
                                if ((i58 & 48) != 32) {
                                    z36 = z29;
                                } else {
                                    z36 = false;
                                }
                            }
                            zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                            objE2 = rVarH.E();
                            if (zG) {
                                objE2 = new er.a() { // from class: f2.a1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new er.a() { // from class: f2.a1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            Function0.g((er.a) objE2, rVarH, 0);
                            objE3 = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE3 == companion.a()) {
                                objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                                rVarH.v(objE3);
                            }
                            cVar = (u0.c) objE3;
                            objE4 = rVarH.E();
                            if (objE4 == companion.a()) {
                                objE4 = Function0.i(tq.j.f191408a, rVarH);
                                rVarH.v(objE4);
                            }
                            p0Var = (p0) objE4;
                            boolean zG110 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                            if ((i58 & 896) == 256) {
                                z37 = z29;
                            } else {
                                z37 = false;
                            }
                            z38 = zG110 | z37;
                            objE5 = rVarH.E();
                            if (z38) {
                                objE5 = new er.a() { // from class: f2.b1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.R(hjVar4, p0Var, cVar, aVar4);
                                    }
                                };
                                rVarH.v(objE5);
                            } else {
                                objE5 = new er.a() { // from class: f2.b1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.R(hjVar4, p0Var, cVar, aVar4);
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            aVar5 = (er.a) objE5;
                            if (z35) {
                                z39 = false;
                            } else {
                                z39 = false;
                            }
                            zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                            objE6 = rVarH.E();
                            if (zG2) {
                                objE6 = new a(aVar5, cVar, null);
                                rVarH.v(objE6);
                            } else {
                                objE6 = new a(aVar5, cVar, null);
                                rVarH.v(objE6);
                            }
                            h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                            int i711111114 = i58 >> 6;
                            int i711111115 = ((i58 << 3) & 524272) | (3670016 & i711111114) | (i711111114 & 29360128);
                            int i8111116 = i59 << 24;
                            int i8111117 = i711111115 | (234881024 & i8111116) | (i8111116 & 1879048192);
                            int i8111118 = i58 >> 15;
                            f3.m mVar112 = mVar4;
                            y2 y2Var112 = y2Var4;
                            rVar2 = rVarH;
                            y(((Number) cVar.m()).floatValue(), mVar112, hjVar4, aVar4, f2114, z4111, y2Var112, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i8111117, ((i59 >> 6) & 14) | (i8111118 & 112) | (i8111118 & 896) | (i59 & 7168), 0);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar112;
                            hjVar3 = hjVar4;
                            aVar2 = aVar4;
                            f18 = f2114;
                            z25 = z4111;
                            y2Var2 = y2Var112;
                            j17 = j25;
                            j18 = j19;
                            f19 = f26;
                            f25 = fN;
                            pVarC = pVarC;
                            pVar4 = pVar5;
                            z26 = z35;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            aVar2 = aVar;
                            y2Var2 = y2Var;
                            mVar3 = mVar2;
                            hjVar3 = hjVar2;
                            f18 = fO;
                            pVar4 = pVar3;
                            z25 = z17;
                            z26 = z18;
                            j17 = j15;
                            j18 = j16;
                            f19 = f16;
                            f25 = f17;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.c1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i55 = i46 | MLKEMEngine.KyberPolyBytes;
                    if ((i16 & 3072) != 0) {
                        i55 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i57 = i55;
                    if ((i18 & 306783379) == 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (rVarH.r(z19, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i711111116 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i711111116;
                            long j21119 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j21119;
                        } else {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i711111117 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i711111117;
                            long j211110 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j211110;
                        }
                        rVarH.y();
                        z35 = z28;
                        if (t.k()) {
                            t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                        }
                        androidx.compose.material3.d dVar18 = androidx.compose.material3.d.f9816a;
                        j0VarF = dVar18.c(rVarH, 6).f();
                        float f2115 = f27;
                        j0VarE = dVar18.c(rVarH, 6).e();
                        j0VarF2 = dVar18.c(rVarH, 6).f();
                        i65 = (i58 & 112) ^ 48;
                        boolean z4112 = z27;
                        if (i65 > 32) {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        } else {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        }
                        zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                        objE2 = rVarH.E();
                        if (zG) {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        objE3 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE3 == companion.a()) {
                            objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                            rVarH.v(objE3);
                        }
                        cVar = (u0.c) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        boolean zG111 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                        if ((i58 & 896) == 256) {
                            z37 = z29;
                        } else {
                            z37 = false;
                        }
                        z38 = zG111 | z37;
                        objE5 = rVarH.E();
                        if (z38) {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar5 = (er.a) objE5;
                        if (z35) {
                            z39 = false;
                        } else {
                            z39 = false;
                        }
                        zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                        objE6 = rVarH.E();
                        if (zG2) {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        }
                        h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                        int i711111118 = i58 >> 6;
                        int i711111119 = ((i58 << 3) & 524272) | (3670016 & i711111118) | (i711111118 & 29360128);
                        int i8111119 = i59 << 24;
                        int i81111110 = i711111119 | (234881024 & i8111119) | (i8111119 & 1879048192);
                        int i81111111 = i58 >> 15;
                        f3.m mVar113 = mVar4;
                        y2 y2Var113 = y2Var4;
                        rVar2 = rVarH;
                        y(((Number) cVar.m()).floatValue(), mVar113, hjVar4, aVar4, f2115, z4112, y2Var113, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i81111110, ((i59 >> 6) & 14) | (i81111111 & 112) | (i81111111 & 896) | (i59 & 7168), 0);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar113;
                        hjVar3 = hjVar4;
                        aVar2 = aVar4;
                        f18 = f2115;
                        z25 = z4112;
                        y2Var2 = y2Var113;
                        j17 = j25;
                        j18 = j19;
                        f19 = f26;
                        f25 = fN;
                        pVarC = pVarC;
                        pVar4 = pVar5;
                        z26 = z35;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        aVar2 = aVar;
                        y2Var2 = y2Var;
                        mVar3 = mVar2;
                        hjVar3 = hjVar2;
                        f18 = fO;
                        pVar4 = pVar3;
                        z25 = z17;
                        z26 = z18;
                        j17 = j15;
                        j18 = j16;
                        f19 = f16;
                        f25 = f17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.c1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i48 = i39 | 48;
                i46 = i48;
                i49 = i17 & PKIFailureInfo.certConfirmed;
                if (i49 != 0) {
                    i55 = i46;
                    if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.b(f17)) {
                            i56 = 256;
                        } else {
                            i56 = 128;
                        }
                        i55 |= i56;
                    }
                    if ((i16 & 3072) != 0) {
                        i55 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i57 = i55;
                    if ((i18 & 306783379) == 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (rVarH.r(z19, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i7111111110 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i7111111110;
                            long j211111 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j211111;
                        } else {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i7111111111 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i7111111111;
                            long j211112 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j211112;
                        }
                        rVarH.y();
                        z35 = z28;
                        if (t.k()) {
                            t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                        }
                        androidx.compose.material3.d dVar19 = androidx.compose.material3.d.f9816a;
                        j0VarF = dVar19.c(rVarH, 6).f();
                        float f2116 = f27;
                        j0VarE = dVar19.c(rVarH, 6).e();
                        j0VarF2 = dVar19.c(rVarH, 6).f();
                        i65 = (i58 & 112) ^ 48;
                        boolean z4113 = z27;
                        if (i65 > 32) {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        } else {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        }
                        zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                        objE2 = rVarH.E();
                        if (zG) {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        objE3 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE3 == companion.a()) {
                            objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                            rVarH.v(objE3);
                        }
                        cVar = (u0.c) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        boolean zG112 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                        if ((i58 & 896) == 256) {
                            z37 = z29;
                        } else {
                            z37 = false;
                        }
                        z38 = zG112 | z37;
                        objE5 = rVarH.E();
                        if (z38) {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar5 = (er.a) objE5;
                        if (z35) {
                            z39 = false;
                        } else {
                            z39 = false;
                        }
                        zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                        objE6 = rVarH.E();
                        if (zG2) {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        }
                        h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                        int i7111111112 = i58 >> 6;
                        int i7111111113 = ((i58 << 3) & 524272) | (3670016 & i7111111112) | (i7111111112 & 29360128);
                        int i81111112 = i59 << 24;
                        int i81111113 = i7111111113 | (234881024 & i81111112) | (i81111112 & 1879048192);
                        int i81111114 = i58 >> 15;
                        f3.m mVar114 = mVar4;
                        y2 y2Var114 = y2Var4;
                        rVar2 = rVarH;
                        y(((Number) cVar.m()).floatValue(), mVar114, hjVar4, aVar4, f2116, z4113, y2Var114, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i81111113, ((i59 >> 6) & 14) | (i81111114 & 112) | (i81111114 & 896) | (i59 & 7168), 0);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar114;
                        hjVar3 = hjVar4;
                        aVar2 = aVar4;
                        f18 = f2116;
                        z25 = z4113;
                        y2Var2 = y2Var114;
                        j17 = j25;
                        j18 = j19;
                        f19 = f26;
                        f25 = fN;
                        pVarC = pVarC;
                        pVar4 = pVar5;
                        z26 = z35;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        aVar2 = aVar;
                        y2Var2 = y2Var;
                        mVar3 = mVar2;
                        hjVar3 = hjVar2;
                        f18 = fO;
                        pVar4 = pVar3;
                        z25 = z17;
                        z26 = z18;
                        j17 = j15;
                        j18 = j16;
                        f19 = f16;
                        f25 = f17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.c1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i55 = i46 | MLKEMEngine.KyberPolyBytes;
                if ((i16 & 3072) != 0) {
                    i55 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i57 = i55;
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i7111111114 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i7111111114;
                        long j211113 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j211113;
                    } else {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i7111111115 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i7111111115;
                        long j211114 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j211114;
                    }
                    rVarH.y();
                    z35 = z28;
                    if (t.k()) {
                        t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                    }
                    androidx.compose.material3.d dVar110 = androidx.compose.material3.d.f9816a;
                    j0VarF = dVar110.c(rVarH, 6).f();
                    float f2117 = f27;
                    j0VarE = dVar110.c(rVarH, 6).e();
                    j0VarF2 = dVar110.c(rVarH, 6).f();
                    i65 = (i58 & 112) ^ 48;
                    boolean z4114 = z27;
                    if (i65 > 32) {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    } else {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    }
                    zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    objE3 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE3 == companion.a()) {
                        objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                        rVarH.v(objE3);
                    }
                    cVar = (u0.c) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    boolean zG113 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                    if ((i58 & 896) == 256) {
                        z37 = z29;
                    } else {
                        z37 = false;
                    }
                    z38 = zG113 | z37;
                    objE5 = rVarH.E();
                    if (z38) {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar5 = (er.a) objE5;
                    if (z35) {
                        z39 = false;
                    } else {
                        z39 = false;
                    }
                    zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                    objE6 = rVarH.E();
                    if (zG2) {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    }
                    h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                    int i7111111116 = i58 >> 6;
                    int i7111111117 = ((i58 << 3) & 524272) | (3670016 & i7111111116) | (i7111111116 & 29360128);
                    int i81111115 = i59 << 24;
                    int i81111116 = i7111111117 | (234881024 & i81111115) | (i81111115 & 1879048192);
                    int i81111117 = i58 >> 15;
                    f3.m mVar115 = mVar4;
                    y2 y2Var115 = y2Var4;
                    rVar2 = rVarH;
                    y(((Number) cVar.m()).floatValue(), mVar115, hjVar4, aVar4, f2117, z4114, y2Var115, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i81111116, ((i59 >> 6) & 14) | (i81111117 & 112) | (i81111117 & 896) | (i59 & 7168), 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar115;
                    hjVar3 = hjVar4;
                    aVar2 = aVar4;
                    f18 = f2117;
                    z25 = z4114;
                    y2Var2 = y2Var115;
                    j17 = j25;
                    j18 = j19;
                    f19 = f26;
                    f25 = fN;
                    pVarC = pVarC;
                    pVar4 = pVar5;
                    z26 = z35;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    aVar2 = aVar;
                    y2Var2 = y2Var;
                    mVar3 = mVar2;
                    hjVar3 = hjVar2;
                    f18 = fO;
                    pVar4 = pVar3;
                    z25 = z17;
                    z26 = z18;
                    j17 = j15;
                    j18 = j16;
                    f19 = f16;
                    f25 = f17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.c1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            z17 = z15;
            i28 = i17 & 32;
            if (i28 != 0) {
                i18 |= 196608;
                z18 = z16;
            } else {
                z18 = z16;
                if ((i15 & 196608) == 0) {
                    if (rVarH.a(z18)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i29 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i29;
                }
            }
            i35 = i17 & 64;
            if (i35 != 0) {
                i18 |= 1572864;
                pVarC = pVar;
            } else {
                pVarC = pVar;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(pVarC)) {
                        i36 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i36;
                }
            }
            if ((i15 & 12582912) == 0) {
                if ((i17 & 128) == 0) {
                    pVar3 = pVar2;
                    if (rVarH.G(pVar3)) {
                    }
                    i18 |= i75;
                } else {
                    pVar3 = pVar2;
                }
                i18 |= i75;
            } else {
                pVar3 = pVar2;
            }
            if ((i15 & 100663296) != 0) {
                i18 |= ((i17 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
            }
            if ((i15 & 805306368) == 0) {
                if ((i17 & 512) == 0) {
                    i37 = i67;
                    if (rVarH.d(j15)) {
                    }
                    i18 |= i76;
                } else {
                    i37 = i67;
                }
                i18 |= i76;
            } else {
                i37 = i67;
            }
            if ((i16 & 6) == 0) {
                if ((i17 & 1024) == 0) {
                    i66 = 2;
                } else {
                    i66 = 2;
                }
                i38 = i66 | i16;
            } else {
                i38 = i16;
            }
            i39 = i38;
            i45 = i17 & 2048;
            if (i45 != 0) {
                if ((i16 & 48) == 0) {
                    if (rVarH.b(f16)) {
                        i47 = 32;
                    } else {
                        i47 = 16;
                    }
                    i48 = i39 | i47;
                } else {
                    i45 = i45;
                    i46 = i39;
                }
                i49 = i17 & PKIFailureInfo.certConfirmed;
                if (i49 != 0) {
                    i55 = i46;
                    if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.b(f17)) {
                            i56 = 256;
                        } else {
                            i56 = 128;
                        }
                        i55 |= i56;
                    }
                    if ((i16 & 3072) != 0) {
                        i55 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i57 = i55;
                    if ((i18 & 306783379) == 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (rVarH.r(z19, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i7111111118 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i7111111118;
                            long j211115 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j211115;
                        } else {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i7111111119 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i7111111119;
                            long j211116 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j211116;
                        }
                        rVarH.y();
                        z35 = z28;
                        if (t.k()) {
                            t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                        }
                        androidx.compose.material3.d dVar111 = androidx.compose.material3.d.f9816a;
                        j0VarF = dVar111.c(rVarH, 6).f();
                        float f2118 = f27;
                        j0VarE = dVar111.c(rVarH, 6).e();
                        j0VarF2 = dVar111.c(rVarH, 6).f();
                        i65 = (i58 & 112) ^ 48;
                        boolean z4115 = z27;
                        if (i65 > 32) {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        } else {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        }
                        zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                        objE2 = rVarH.E();
                        if (zG) {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        objE3 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE3 == companion.a()) {
                            objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                            rVarH.v(objE3);
                        }
                        cVar = (u0.c) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        boolean zG114 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                        if ((i58 & 896) == 256) {
                            z37 = z29;
                        } else {
                            z37 = false;
                        }
                        z38 = zG114 | z37;
                        objE5 = rVarH.E();
                        if (z38) {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar5 = (er.a) objE5;
                        if (z35) {
                            z39 = false;
                        } else {
                            z39 = false;
                        }
                        zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                        objE6 = rVarH.E();
                        if (zG2) {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        }
                        h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                        int i71111111110 = i58 >> 6;
                        int i71111111111 = ((i58 << 3) & 524272) | (3670016 & i71111111110) | (i71111111110 & 29360128);
                        int i81111118 = i59 << 24;
                        int i81111119 = i71111111111 | (234881024 & i81111118) | (i81111118 & 1879048192);
                        int i811111110 = i58 >> 15;
                        f3.m mVar116 = mVar4;
                        y2 y2Var116 = y2Var4;
                        rVar2 = rVarH;
                        y(((Number) cVar.m()).floatValue(), mVar116, hjVar4, aVar4, f2118, z4115, y2Var116, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i81111119, ((i59 >> 6) & 14) | (i811111110 & 112) | (i811111110 & 896) | (i59 & 7168), 0);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar116;
                        hjVar3 = hjVar4;
                        aVar2 = aVar4;
                        f18 = f2118;
                        z25 = z4115;
                        y2Var2 = y2Var116;
                        j17 = j25;
                        j18 = j19;
                        f19 = f26;
                        f25 = fN;
                        pVarC = pVarC;
                        pVar4 = pVar5;
                        z26 = z35;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        aVar2 = aVar;
                        y2Var2 = y2Var;
                        mVar3 = mVar2;
                        hjVar3 = hjVar2;
                        f18 = fO;
                        pVar4 = pVar3;
                        z25 = z17;
                        z26 = z18;
                        j17 = j15;
                        j18 = j16;
                        f19 = f16;
                        f25 = f17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.c1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i55 = i46 | MLKEMEngine.KyberPolyBytes;
                if ((i16 & 3072) != 0) {
                    i55 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i57 = i55;
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i71111111112 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i71111111112;
                        long j211117 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j211117;
                    } else {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i71111111113 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i71111111113;
                        long j211118 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j211118;
                    }
                    rVarH.y();
                    z35 = z28;
                    if (t.k()) {
                        t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                    }
                    androidx.compose.material3.d dVar112 = androidx.compose.material3.d.f9816a;
                    j0VarF = dVar112.c(rVarH, 6).f();
                    float f2119 = f27;
                    j0VarE = dVar112.c(rVarH, 6).e();
                    j0VarF2 = dVar112.c(rVarH, 6).f();
                    i65 = (i58 & 112) ^ 48;
                    boolean z4116 = z27;
                    if (i65 > 32) {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    } else {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    }
                    zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    objE3 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE3 == companion.a()) {
                        objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                        rVarH.v(objE3);
                    }
                    cVar = (u0.c) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    boolean zG115 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                    if ((i58 & 896) == 256) {
                        z37 = z29;
                    } else {
                        z37 = false;
                    }
                    z38 = zG115 | z37;
                    objE5 = rVarH.E();
                    if (z38) {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar5 = (er.a) objE5;
                    if (z35) {
                        z39 = false;
                    } else {
                        z39 = false;
                    }
                    zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                    objE6 = rVarH.E();
                    if (zG2) {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    }
                    h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                    int i71111111114 = i58 >> 6;
                    int i71111111115 = ((i58 << 3) & 524272) | (3670016 & i71111111114) | (i71111111114 & 29360128);
                    int i811111111 = i59 << 24;
                    int i811111112 = i71111111115 | (234881024 & i811111111) | (i811111111 & 1879048192);
                    int i811111113 = i58 >> 15;
                    f3.m mVar117 = mVar4;
                    y2 y2Var117 = y2Var4;
                    rVar2 = rVarH;
                    y(((Number) cVar.m()).floatValue(), mVar117, hjVar4, aVar4, f2119, z4116, y2Var117, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i811111112, ((i59 >> 6) & 14) | (i811111113 & 112) | (i811111113 & 896) | (i59 & 7168), 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar117;
                    hjVar3 = hjVar4;
                    aVar2 = aVar4;
                    f18 = f2119;
                    z25 = z4116;
                    y2Var2 = y2Var117;
                    j17 = j25;
                    j18 = j19;
                    f19 = f26;
                    f25 = fN;
                    pVarC = pVarC;
                    pVar4 = pVar5;
                    z26 = z35;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    aVar2 = aVar;
                    y2Var2 = y2Var;
                    mVar3 = mVar2;
                    hjVar3 = hjVar2;
                    f18 = fO;
                    pVar4 = pVar3;
                    z25 = z17;
                    z26 = z18;
                    j17 = j15;
                    j18 = j16;
                    f19 = f16;
                    f25 = f17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.c1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i48 = i39 | 48;
            i46 = i48;
            i49 = i17 & PKIFailureInfo.certConfirmed;
            if (i49 != 0) {
                i55 = i46;
                if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.b(f17)) {
                        i56 = 256;
                    } else {
                        i56 = 128;
                    }
                    i55 |= i56;
                }
                if ((i16 & 3072) != 0) {
                    i55 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i57 = i55;
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i71111111116 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i71111111116;
                        long j211119 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j211119;
                    } else {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i71111111117 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i71111111117;
                        long j2111110 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j2111110;
                    }
                    rVarH.y();
                    z35 = z28;
                    if (t.k()) {
                        t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                    }
                    androidx.compose.material3.d dVar113 = androidx.compose.material3.d.f9816a;
                    j0VarF = dVar113.c(rVarH, 6).f();
                    float f21110 = f27;
                    j0VarE = dVar113.c(rVarH, 6).e();
                    j0VarF2 = dVar113.c(rVarH, 6).f();
                    i65 = (i58 & 112) ^ 48;
                    boolean z4117 = z27;
                    if (i65 > 32) {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    } else {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    }
                    zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    objE3 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE3 == companion.a()) {
                        objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                        rVarH.v(objE3);
                    }
                    cVar = (u0.c) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    boolean zG116 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                    if ((i58 & 896) == 256) {
                        z37 = z29;
                    } else {
                        z37 = false;
                    }
                    z38 = zG116 | z37;
                    objE5 = rVarH.E();
                    if (z38) {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar5 = (er.a) objE5;
                    if (z35) {
                        z39 = false;
                    } else {
                        z39 = false;
                    }
                    zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                    objE6 = rVarH.E();
                    if (zG2) {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    }
                    h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                    int i71111111118 = i58 >> 6;
                    int i71111111119 = ((i58 << 3) & 524272) | (3670016 & i71111111118) | (i71111111118 & 29360128);
                    int i811111114 = i59 << 24;
                    int i811111115 = i71111111119 | (234881024 & i811111114) | (i811111114 & 1879048192);
                    int i811111116 = i58 >> 15;
                    f3.m mVar118 = mVar4;
                    y2 y2Var118 = y2Var4;
                    rVar2 = rVarH;
                    y(((Number) cVar.m()).floatValue(), mVar118, hjVar4, aVar4, f21110, z4117, y2Var118, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i811111115, ((i59 >> 6) & 14) | (i811111116 & 112) | (i811111116 & 896) | (i59 & 7168), 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar118;
                    hjVar3 = hjVar4;
                    aVar2 = aVar4;
                    f18 = f21110;
                    z25 = z4117;
                    y2Var2 = y2Var118;
                    j17 = j25;
                    j18 = j19;
                    f19 = f26;
                    f25 = fN;
                    pVarC = pVarC;
                    pVar4 = pVar5;
                    z26 = z35;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    aVar2 = aVar;
                    y2Var2 = y2Var;
                    mVar3 = mVar2;
                    hjVar3 = hjVar2;
                    f18 = fO;
                    pVar4 = pVar3;
                    z25 = z17;
                    z26 = z18;
                    j17 = j15;
                    j18 = j16;
                    f19 = f16;
                    f25 = f17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.c1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i55 = i46 | MLKEMEngine.KyberPolyBytes;
            if ((i16 & 3072) != 0) {
                i55 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i57 = i55;
            if ((i18 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (rVarH.r(z19, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        i18 &= -113;
                    } else {
                        hjVarY = hjVar2;
                    }
                    if (i69 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.x0
                                @Override // er.a
                                public final Object a() {
                                    return l1.O();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar3 = (er.a) objE;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    }
                    if (i26 != 0) {
                        z17 = true;
                    }
                    if (i28 != 0) {
                        z18 = true;
                    }
                    if (i35 != 0) {
                        pVarC = k3.f56525a.c();
                    }
                    if ((i17 & 128) != 0) {
                        pVar3 = new p() { // from class: f2.y0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.P((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i18 &= -29360129;
                    }
                    if ((i17 & 256) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 512) != 0) {
                        i18 = (-1879048193) & i18;
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        jI = j15;
                    }
                    if ((i17 & 1024) != 0) {
                        jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                        i57 &= -15;
                    } else {
                        jE = j16;
                    }
                    if (i45 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f16;
                    }
                    int i711111111110 = i57;
                    if (i49 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f17;
                    }
                    i58 = i18;
                    pVar5 = pVar3;
                    z27 = z17;
                    z28 = z18;
                    f26 = fJ;
                    i59 = i711111111110;
                    long j2111111 = jI;
                    hjVar4 = hjVarY;
                    aVar4 = aVar3;
                    f27 = fO;
                    y2Var3 = y2VarK;
                    j19 = jE;
                    z29 = true;
                    j25 = j2111111;
                } else {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        i18 &= -113;
                    } else {
                        hjVarY = hjVar2;
                    }
                    if (i69 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.x0
                                @Override // er.a
                                public final Object a() {
                                    return l1.O();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar3 = (er.a) objE;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    }
                    if (i26 != 0) {
                        z17 = true;
                    }
                    if (i28 != 0) {
                        z18 = true;
                    }
                    if (i35 != 0) {
                        pVarC = k3.f56525a.c();
                    }
                    if ((i17 & 128) != 0) {
                        pVar3 = new p() { // from class: f2.y0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.P((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i18 &= -29360129;
                    }
                    if ((i17 & 256) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 512) != 0) {
                        i18 = (-1879048193) & i18;
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        jI = j15;
                    }
                    if ((i17 & 1024) != 0) {
                        jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                        i57 &= -15;
                    } else {
                        jE = j16;
                    }
                    if (i45 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f16;
                    }
                    int i711111111111 = i57;
                    if (i49 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f17;
                    }
                    i58 = i18;
                    pVar5 = pVar3;
                    z27 = z17;
                    z28 = z18;
                    f26 = fJ;
                    i59 = i711111111111;
                    long j2111112 = jI;
                    hjVar4 = hjVarY;
                    aVar4 = aVar3;
                    f27 = fO;
                    y2Var3 = y2VarK;
                    j19 = jE;
                    z29 = true;
                    j25 = j2111112;
                }
                rVarH.y();
                z35 = z28;
                if (t.k()) {
                    t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                }
                androidx.compose.material3.d dVar114 = androidx.compose.material3.d.f9816a;
                j0VarF = dVar114.c(rVarH, 6).f();
                float f21111 = f27;
                j0VarE = dVar114.c(rVarH, 6).e();
                j0VarF2 = dVar114.c(rVarH, 6).f();
                i65 = (i58 & 112) ^ 48;
                boolean z4118 = z27;
                if (i65 > 32) {
                    y2Var4 = y2Var3;
                    if ((i58 & 48) != 32) {
                        z36 = z29;
                    } else {
                        z36 = false;
                    }
                } else {
                    y2Var4 = y2Var3;
                    if ((i58 & 48) != 32) {
                        z36 = z29;
                    } else {
                        z36 = false;
                    }
                }
                zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                objE2 = rVarH.E();
                if (zG) {
                    objE2 = new er.a() { // from class: f2.a1
                        @Override // er.a
                        public final Object a() {
                            return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.a() { // from class: f2.a1
                        @Override // er.a
                        public final Object a() {
                            return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                        }
                    };
                    rVarH.v(objE2);
                }
                Function0.g((er.a) objE2, rVarH, 0);
                objE3 = rVarH.E();
                companion = r.INSTANCE;
                if (objE3 == companion.a()) {
                    objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                    rVarH.v(objE3);
                }
                cVar = (u0.c) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE4);
                }
                p0Var = (p0) objE4;
                boolean zG117 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                if ((i58 & 896) == 256) {
                    z37 = z29;
                } else {
                    z37 = false;
                }
                z38 = zG117 | z37;
                objE5 = rVarH.E();
                if (z38) {
                    objE5 = new er.a() { // from class: f2.b1
                        @Override // er.a
                        public final Object a() {
                            return l1.R(hjVar4, p0Var, cVar, aVar4);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new er.a() { // from class: f2.b1
                        @Override // er.a
                        public final Object a() {
                            return l1.R(hjVar4, p0Var, cVar, aVar4);
                        }
                    };
                    rVarH.v(objE5);
                }
                aVar5 = (er.a) objE5;
                if (z35) {
                    z39 = false;
                } else {
                    z39 = false;
                }
                zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                objE6 = rVarH.E();
                if (zG2) {
                    objE6 = new a(aVar5, cVar, null);
                    rVarH.v(objE6);
                } else {
                    objE6 = new a(aVar5, cVar, null);
                    rVarH.v(objE6);
                }
                h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                int i711111111112 = i58 >> 6;
                int i711111111113 = ((i58 << 3) & 524272) | (3670016 & i711111111112) | (i711111111112 & 29360128);
                int i811111117 = i59 << 24;
                int i811111118 = i711111111113 | (234881024 & i811111117) | (i811111117 & 1879048192);
                int i811111119 = i58 >> 15;
                f3.m mVar119 = mVar4;
                y2 y2Var119 = y2Var4;
                rVar2 = rVarH;
                y(((Number) cVar.m()).floatValue(), mVar119, hjVar4, aVar4, f21111, z4118, y2Var119, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i811111118, ((i59 >> 6) & 14) | (i811111119 & 112) | (i811111119 & 896) | (i59 & 7168), 0);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar119;
                hjVar3 = hjVar4;
                aVar2 = aVar4;
                f18 = f21111;
                z25 = z4118;
                y2Var2 = y2Var119;
                j17 = j25;
                j18 = j19;
                f19 = f26;
                f25 = fN;
                pVarC = pVarC;
                pVar4 = pVar5;
                z26 = z35;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                aVar2 = aVar;
                y2Var2 = y2Var;
                mVar3 = mVar2;
                hjVar3 = hjVar2;
                f18 = fO;
                pVar4 = pVar3;
                z25 = z17;
                z26 = z18;
                j17 = j15;
                j18 = j16;
                f19 = f16;
                f25 = f17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.c1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 3072;
        fO = f15;
        i26 = i17 & 16;
        if (i26 != 0) {
            if ((i15 & 24576) == 0) {
                z17 = z15;
                if (rVarH.a(z17)) {
                    i27 = 16384;
                } else {
                    i27 = PKIFailureInfo.certRevoked;
                }
                i18 |= i27;
            }
            i28 = i17 & 32;
            if (i28 != 0) {
                i18 |= 196608;
                z18 = z16;
            } else {
                z18 = z16;
                if ((i15 & 196608) == 0) {
                    if (rVarH.a(z18)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i29 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i29;
                }
            }
            i35 = i17 & 64;
            if (i35 != 0) {
                i18 |= 1572864;
                pVarC = pVar;
            } else {
                pVarC = pVar;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(pVarC)) {
                        i36 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i36;
                }
            }
            if ((i15 & 12582912) == 0) {
                if ((i17 & 128) == 0) {
                    pVar3 = pVar2;
                    if (rVarH.G(pVar3)) {
                    }
                    i18 |= i75;
                } else {
                    pVar3 = pVar2;
                }
                i18 |= i75;
            } else {
                pVar3 = pVar2;
            }
            if ((i15 & 100663296) != 0) {
                i18 |= ((i17 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
            }
            if ((i15 & 805306368) == 0) {
                if ((i17 & 512) == 0) {
                    i37 = i67;
                    if (rVarH.d(j15)) {
                    }
                    i18 |= i76;
                } else {
                    i37 = i67;
                }
                i18 |= i76;
            } else {
                i37 = i67;
            }
            if ((i16 & 6) == 0) {
                if ((i17 & 1024) == 0) {
                    i66 = 2;
                } else {
                    i66 = 2;
                }
                i38 = i66 | i16;
            } else {
                i38 = i16;
            }
            i39 = i38;
            i45 = i17 & 2048;
            if (i45 != 0) {
                if ((i16 & 48) == 0) {
                    if (rVarH.b(f16)) {
                        i47 = 32;
                    } else {
                        i47 = 16;
                    }
                    i48 = i39 | i47;
                } else {
                    i45 = i45;
                    i46 = i39;
                }
                i49 = i17 & PKIFailureInfo.certConfirmed;
                if (i49 != 0) {
                    i55 = i46;
                    if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.b(f17)) {
                            i56 = 256;
                        } else {
                            i56 = 128;
                        }
                        i55 |= i56;
                    }
                    if ((i16 & 3072) != 0) {
                        i55 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i57 = i55;
                    if ((i18 & 306783379) == 306783378) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (rVarH.r(z19, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i711111111114 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i711111111114;
                            long j2111113 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j2111113;
                        } else {
                            if (i37 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i17 & 2) != 0) {
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                i18 &= -113;
                            } else {
                                hjVarY = hjVar2;
                            }
                            if (i69 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.x0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.O();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar3 = (er.a) objE;
                            } else {
                                aVar3 = aVar;
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            }
                            if (i26 != 0) {
                                z17 = true;
                            }
                            if (i28 != 0) {
                                z18 = true;
                            }
                            if (i35 != 0) {
                                pVarC = k3.f56525a.c();
                            }
                            if ((i17 & 128) != 0) {
                                pVar3 = new p() { // from class: f2.y0
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.P((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i18 &= -29360129;
                            }
                            if ((i17 & 256) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i18 &= -234881025;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 512) != 0) {
                                i18 = (-1879048193) & i18;
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                jI = j15;
                            }
                            if ((i17 & 1024) != 0) {
                                jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                                i57 &= -15;
                            } else {
                                jE = j16;
                            }
                            if (i45 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f16;
                            }
                            int i711111111115 = i57;
                            if (i49 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f17;
                            }
                            i58 = i18;
                            pVar5 = pVar3;
                            z27 = z17;
                            z28 = z18;
                            f26 = fJ;
                            i59 = i711111111115;
                            long j2111114 = jI;
                            hjVar4 = hjVarY;
                            aVar4 = aVar3;
                            f27 = fO;
                            y2Var3 = y2VarK;
                            j19 = jE;
                            z29 = true;
                            j25 = j2111114;
                        }
                        rVarH.y();
                        z35 = z28;
                        if (t.k()) {
                            t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                        }
                        androidx.compose.material3.d dVar115 = androidx.compose.material3.d.f9816a;
                        j0VarF = dVar115.c(rVarH, 6).f();
                        float f21112 = f27;
                        j0VarE = dVar115.c(rVarH, 6).e();
                        j0VarF2 = dVar115.c(rVarH, 6).f();
                        i65 = (i58 & 112) ^ 48;
                        boolean z4119 = z27;
                        if (i65 > 32) {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        } else {
                            y2Var4 = y2Var3;
                            if ((i58 & 48) != 32) {
                                z36 = z29;
                            } else {
                                z36 = false;
                            }
                        }
                        zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                        objE2 = rVarH.E();
                        if (zG) {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new er.a() { // from class: f2.a1
                                @Override // er.a
                                public final Object a() {
                                    return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        Function0.g((er.a) objE2, rVarH, 0);
                        objE3 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE3 == companion.a()) {
                            objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                            rVarH.v(objE3);
                        }
                        cVar = (u0.c) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        boolean zG118 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                        if ((i58 & 896) == 256) {
                            z37 = z29;
                        } else {
                            z37 = false;
                        }
                        z38 = zG118 | z37;
                        objE5 = rVarH.E();
                        if (z38) {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.b1
                                @Override // er.a
                                public final Object a() {
                                    return l1.R(hjVar4, p0Var, cVar, aVar4);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        aVar5 = (er.a) objE5;
                        if (z35) {
                            z39 = false;
                        } else {
                            z39 = false;
                        }
                        zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                        objE6 = rVarH.E();
                        if (zG2) {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new a(aVar5, cVar, null);
                            rVarH.v(objE6);
                        }
                        h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                        int i711111111116 = i58 >> 6;
                        int i711111111117 = ((i58 << 3) & 524272) | (3670016 & i711111111116) | (i711111111116 & 29360128);
                        int i8111111110 = i59 << 24;
                        int i8111111111 = i711111111117 | (234881024 & i8111111110) | (i8111111110 & 1879048192);
                        int i8111111112 = i58 >> 15;
                        f3.m mVar1110 = mVar4;
                        y2 y2Var1110 = y2Var4;
                        rVar2 = rVarH;
                        y(((Number) cVar.m()).floatValue(), mVar1110, hjVar4, aVar4, f21112, z4119, y2Var1110, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i8111111111, ((i59 >> 6) & 14) | (i8111111112 & 112) | (i8111111112 & 896) | (i59 & 7168), 0);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar1110;
                        hjVar3 = hjVar4;
                        aVar2 = aVar4;
                        f18 = f21112;
                        z25 = z4119;
                        y2Var2 = y2Var1110;
                        j17 = j25;
                        j18 = j19;
                        f19 = f26;
                        f25 = fN;
                        pVarC = pVarC;
                        pVar4 = pVar5;
                        z26 = z35;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        aVar2 = aVar;
                        y2Var2 = y2Var;
                        mVar3 = mVar2;
                        hjVar3 = hjVar2;
                        f18 = fO;
                        pVar4 = pVar3;
                        z25 = z17;
                        z26 = z18;
                        j17 = j15;
                        j18 = j16;
                        f19 = f16;
                        f25 = f17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.c1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i55 = i46 | MLKEMEngine.KyberPolyBytes;
                if ((i16 & 3072) != 0) {
                    i55 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i57 = i55;
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i711111111118 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i711111111118;
                        long j2111115 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j2111115;
                    } else {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i711111111119 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i711111111119;
                        long j2111116 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j2111116;
                    }
                    rVarH.y();
                    z35 = z28;
                    if (t.k()) {
                        t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                    }
                    androidx.compose.material3.d dVar116 = androidx.compose.material3.d.f9816a;
                    j0VarF = dVar116.c(rVarH, 6).f();
                    float f21113 = f27;
                    j0VarE = dVar116.c(rVarH, 6).e();
                    j0VarF2 = dVar116.c(rVarH, 6).f();
                    i65 = (i58 & 112) ^ 48;
                    boolean z41110 = z27;
                    if (i65 > 32) {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    } else {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    }
                    zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    objE3 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE3 == companion.a()) {
                        objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                        rVarH.v(objE3);
                    }
                    cVar = (u0.c) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    boolean zG119 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                    if ((i58 & 896) == 256) {
                        z37 = z29;
                    } else {
                        z37 = false;
                    }
                    z38 = zG119 | z37;
                    objE5 = rVarH.E();
                    if (z38) {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar5 = (er.a) objE5;
                    if (z35) {
                        z39 = false;
                    } else {
                        z39 = false;
                    }
                    zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                    objE6 = rVarH.E();
                    if (zG2) {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    }
                    h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                    int i7111111111110 = i58 >> 6;
                    int i7111111111111 = ((i58 << 3) & 524272) | (3670016 & i7111111111110) | (i7111111111110 & 29360128);
                    int i8111111113 = i59 << 24;
                    int i8111111114 = i7111111111111 | (234881024 & i8111111113) | (i8111111113 & 1879048192);
                    int i8111111115 = i58 >> 15;
                    f3.m mVar1111 = mVar4;
                    y2 y2Var1111 = y2Var4;
                    rVar2 = rVarH;
                    y(((Number) cVar.m()).floatValue(), mVar1111, hjVar4, aVar4, f21113, z41110, y2Var1111, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i8111111114, ((i59 >> 6) & 14) | (i8111111115 & 112) | (i8111111115 & 896) | (i59 & 7168), 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar1111;
                    hjVar3 = hjVar4;
                    aVar2 = aVar4;
                    f18 = f21113;
                    z25 = z41110;
                    y2Var2 = y2Var1111;
                    j17 = j25;
                    j18 = j19;
                    f19 = f26;
                    f25 = fN;
                    pVarC = pVarC;
                    pVar4 = pVar5;
                    z26 = z35;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    aVar2 = aVar;
                    y2Var2 = y2Var;
                    mVar3 = mVar2;
                    hjVar3 = hjVar2;
                    f18 = fO;
                    pVar4 = pVar3;
                    z25 = z17;
                    z26 = z18;
                    j17 = j15;
                    j18 = j16;
                    f19 = f16;
                    f25 = f17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.c1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i48 = i39 | 48;
            i46 = i48;
            i49 = i17 & PKIFailureInfo.certConfirmed;
            if (i49 != 0) {
                i55 = i46;
                if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.b(f17)) {
                        i56 = 256;
                    } else {
                        i56 = 128;
                    }
                    i55 |= i56;
                }
                if ((i16 & 3072) != 0) {
                    i55 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i57 = i55;
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i7111111111112 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i7111111111112;
                        long j2111117 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j2111117;
                    } else {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i7111111111113 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i7111111111113;
                        long j2111118 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j2111118;
                    }
                    rVarH.y();
                    z35 = z28;
                    if (t.k()) {
                        t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                    }
                    androidx.compose.material3.d dVar117 = androidx.compose.material3.d.f9816a;
                    j0VarF = dVar117.c(rVarH, 6).f();
                    float f21114 = f27;
                    j0VarE = dVar117.c(rVarH, 6).e();
                    j0VarF2 = dVar117.c(rVarH, 6).f();
                    i65 = (i58 & 112) ^ 48;
                    boolean z41111 = z27;
                    if (i65 > 32) {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    } else {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    }
                    zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    objE3 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE3 == companion.a()) {
                        objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                        rVarH.v(objE3);
                    }
                    cVar = (u0.c) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    boolean zG1110 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                    if ((i58 & 896) == 256) {
                        z37 = z29;
                    } else {
                        z37 = false;
                    }
                    z38 = zG1110 | z37;
                    objE5 = rVarH.E();
                    if (z38) {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar5 = (er.a) objE5;
                    if (z35) {
                        z39 = false;
                    } else {
                        z39 = false;
                    }
                    zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                    objE6 = rVarH.E();
                    if (zG2) {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    }
                    h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                    int i7111111111114 = i58 >> 6;
                    int i7111111111115 = ((i58 << 3) & 524272) | (3670016 & i7111111111114) | (i7111111111114 & 29360128);
                    int i8111111116 = i59 << 24;
                    int i8111111117 = i7111111111115 | (234881024 & i8111111116) | (i8111111116 & 1879048192);
                    int i8111111118 = i58 >> 15;
                    f3.m mVar1112 = mVar4;
                    y2 y2Var1112 = y2Var4;
                    rVar2 = rVarH;
                    y(((Number) cVar.m()).floatValue(), mVar1112, hjVar4, aVar4, f21114, z41111, y2Var1112, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i8111111117, ((i59 >> 6) & 14) | (i8111111118 & 112) | (i8111111118 & 896) | (i59 & 7168), 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar1112;
                    hjVar3 = hjVar4;
                    aVar2 = aVar4;
                    f18 = f21114;
                    z25 = z41111;
                    y2Var2 = y2Var1112;
                    j17 = j25;
                    j18 = j19;
                    f19 = f26;
                    f25 = fN;
                    pVarC = pVarC;
                    pVar4 = pVar5;
                    z26 = z35;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    aVar2 = aVar;
                    y2Var2 = y2Var;
                    mVar3 = mVar2;
                    hjVar3 = hjVar2;
                    f18 = fO;
                    pVar4 = pVar3;
                    z25 = z17;
                    z26 = z18;
                    j17 = j15;
                    j18 = j16;
                    f19 = f16;
                    f25 = f17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.c1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i55 = i46 | MLKEMEngine.KyberPolyBytes;
            if ((i16 & 3072) != 0) {
                i55 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i57 = i55;
            if ((i18 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (rVarH.r(z19, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        i18 &= -113;
                    } else {
                        hjVarY = hjVar2;
                    }
                    if (i69 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.x0
                                @Override // er.a
                                public final Object a() {
                                    return l1.O();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar3 = (er.a) objE;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    }
                    if (i26 != 0) {
                        z17 = true;
                    }
                    if (i28 != 0) {
                        z18 = true;
                    }
                    if (i35 != 0) {
                        pVarC = k3.f56525a.c();
                    }
                    if ((i17 & 128) != 0) {
                        pVar3 = new p() { // from class: f2.y0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.P((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i18 &= -29360129;
                    }
                    if ((i17 & 256) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 512) != 0) {
                        i18 = (-1879048193) & i18;
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        jI = j15;
                    }
                    if ((i17 & 1024) != 0) {
                        jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                        i57 &= -15;
                    } else {
                        jE = j16;
                    }
                    if (i45 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f16;
                    }
                    int i7111111111116 = i57;
                    if (i49 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f17;
                    }
                    i58 = i18;
                    pVar5 = pVar3;
                    z27 = z17;
                    z28 = z18;
                    f26 = fJ;
                    i59 = i7111111111116;
                    long j2111119 = jI;
                    hjVar4 = hjVarY;
                    aVar4 = aVar3;
                    f27 = fO;
                    y2Var3 = y2VarK;
                    j19 = jE;
                    z29 = true;
                    j25 = j2111119;
                } else {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        i18 &= -113;
                    } else {
                        hjVarY = hjVar2;
                    }
                    if (i69 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.x0
                                @Override // er.a
                                public final Object a() {
                                    return l1.O();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar3 = (er.a) objE;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    }
                    if (i26 != 0) {
                        z17 = true;
                    }
                    if (i28 != 0) {
                        z18 = true;
                    }
                    if (i35 != 0) {
                        pVarC = k3.f56525a.c();
                    }
                    if ((i17 & 128) != 0) {
                        pVar3 = new p() { // from class: f2.y0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.P((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i18 &= -29360129;
                    }
                    if ((i17 & 256) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 512) != 0) {
                        i18 = (-1879048193) & i18;
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        jI = j15;
                    }
                    if ((i17 & 1024) != 0) {
                        jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                        i57 &= -15;
                    } else {
                        jE = j16;
                    }
                    if (i45 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f16;
                    }
                    int i7111111111117 = i57;
                    if (i49 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f17;
                    }
                    i58 = i18;
                    pVar5 = pVar3;
                    z27 = z17;
                    z28 = z18;
                    f26 = fJ;
                    i59 = i7111111111117;
                    long j21111110 = jI;
                    hjVar4 = hjVarY;
                    aVar4 = aVar3;
                    f27 = fO;
                    y2Var3 = y2VarK;
                    j19 = jE;
                    z29 = true;
                    j25 = j21111110;
                }
                rVarH.y();
                z35 = z28;
                if (t.k()) {
                    t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                }
                androidx.compose.material3.d dVar118 = androidx.compose.material3.d.f9816a;
                j0VarF = dVar118.c(rVarH, 6).f();
                float f21115 = f27;
                j0VarE = dVar118.c(rVarH, 6).e();
                j0VarF2 = dVar118.c(rVarH, 6).f();
                i65 = (i58 & 112) ^ 48;
                boolean z41112 = z27;
                if (i65 > 32) {
                    y2Var4 = y2Var3;
                    if ((i58 & 48) != 32) {
                        z36 = z29;
                    } else {
                        z36 = false;
                    }
                } else {
                    y2Var4 = y2Var3;
                    if ((i58 & 48) != 32) {
                        z36 = z29;
                    } else {
                        z36 = false;
                    }
                }
                zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                objE2 = rVarH.E();
                if (zG) {
                    objE2 = new er.a() { // from class: f2.a1
                        @Override // er.a
                        public final Object a() {
                            return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.a() { // from class: f2.a1
                        @Override // er.a
                        public final Object a() {
                            return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                        }
                    };
                    rVarH.v(objE2);
                }
                Function0.g((er.a) objE2, rVarH, 0);
                objE3 = rVarH.E();
                companion = r.INSTANCE;
                if (objE3 == companion.a()) {
                    objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                    rVarH.v(objE3);
                }
                cVar = (u0.c) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE4);
                }
                p0Var = (p0) objE4;
                boolean zG1111 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                if ((i58 & 896) == 256) {
                    z37 = z29;
                } else {
                    z37 = false;
                }
                z38 = zG1111 | z37;
                objE5 = rVarH.E();
                if (z38) {
                    objE5 = new er.a() { // from class: f2.b1
                        @Override // er.a
                        public final Object a() {
                            return l1.R(hjVar4, p0Var, cVar, aVar4);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new er.a() { // from class: f2.b1
                        @Override // er.a
                        public final Object a() {
                            return l1.R(hjVar4, p0Var, cVar, aVar4);
                        }
                    };
                    rVarH.v(objE5);
                }
                aVar5 = (er.a) objE5;
                if (z35) {
                    z39 = false;
                } else {
                    z39 = false;
                }
                zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                objE6 = rVarH.E();
                if (zG2) {
                    objE6 = new a(aVar5, cVar, null);
                    rVarH.v(objE6);
                } else {
                    objE6 = new a(aVar5, cVar, null);
                    rVarH.v(objE6);
                }
                h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                int i7111111111118 = i58 >> 6;
                int i7111111111119 = ((i58 << 3) & 524272) | (3670016 & i7111111111118) | (i7111111111118 & 29360128);
                int i8111111119 = i59 << 24;
                int i81111111110 = i7111111111119 | (234881024 & i8111111119) | (i8111111119 & 1879048192);
                int i81111111111 = i58 >> 15;
                f3.m mVar1113 = mVar4;
                y2 y2Var1113 = y2Var4;
                rVar2 = rVarH;
                y(((Number) cVar.m()).floatValue(), mVar1113, hjVar4, aVar4, f21115, z41112, y2Var1113, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i81111111110, ((i59 >> 6) & 14) | (i81111111111 & 112) | (i81111111111 & 896) | (i59 & 7168), 0);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar1113;
                hjVar3 = hjVar4;
                aVar2 = aVar4;
                f18 = f21115;
                z25 = z41112;
                y2Var2 = y2Var1113;
                j17 = j25;
                j18 = j19;
                f19 = f26;
                f25 = fN;
                pVarC = pVarC;
                pVar4 = pVar5;
                z26 = z35;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                aVar2 = aVar;
                y2Var2 = y2Var;
                mVar3 = mVar2;
                hjVar3 = hjVar2;
                f18 = fO;
                pVar4 = pVar3;
                z25 = z17;
                z26 = z18;
                j17 = j15;
                j18 = j16;
                f19 = f16;
                f25 = f17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.c1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 24576;
        z17 = z15;
        i28 = i17 & 32;
        if (i28 != 0) {
            i18 |= 196608;
            z18 = z16;
        } else {
            z18 = z16;
            if ((i15 & 196608) == 0) {
                if (rVarH.a(z18)) {
                    i29 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i29 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i29;
            }
        }
        i35 = i17 & 64;
        if (i35 != 0) {
            i18 |= 1572864;
            pVarC = pVar;
        } else {
            pVarC = pVar;
            if ((i15 & 1572864) == 0) {
                if (rVarH.G(pVarC)) {
                    i36 = PKIFailureInfo.badCertTemplate;
                } else {
                    i36 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i36;
            }
        }
        if ((i15 & 12582912) == 0) {
            if ((i17 & 128) == 0) {
                pVar3 = pVar2;
                if (rVarH.G(pVar3)) {
                }
                i18 |= i75;
            } else {
                pVar3 = pVar2;
            }
            i18 |= i75;
        } else {
            pVar3 = pVar2;
        }
        if ((i15 & 100663296) != 0) {
            i18 |= ((i17 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
        }
        if ((i15 & 805306368) == 0) {
            if ((i17 & 512) == 0) {
                i37 = i67;
                if (rVarH.d(j15)) {
                }
                i18 |= i76;
            } else {
                i37 = i67;
            }
            i18 |= i76;
        } else {
            i37 = i67;
        }
        if ((i16 & 6) == 0) {
            if ((i17 & 1024) == 0) {
                i66 = 2;
            } else {
                i66 = 2;
            }
            i38 = i66 | i16;
        } else {
            i38 = i16;
        }
        i39 = i38;
        i45 = i17 & 2048;
        if (i45 != 0) {
            if ((i16 & 48) == 0) {
                if (rVarH.b(f16)) {
                    i47 = 32;
                } else {
                    i47 = 16;
                }
                i48 = i39 | i47;
            } else {
                i45 = i45;
                i46 = i39;
            }
            i49 = i17 & PKIFailureInfo.certConfirmed;
            if (i49 != 0) {
                i55 = i46;
                if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.b(f17)) {
                        i56 = 256;
                    } else {
                        i56 = 128;
                    }
                    i55 |= i56;
                }
                if ((i16 & 3072) != 0) {
                    i55 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i57 = i55;
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i71111111111110 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i71111111111110;
                        long j21111111 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j21111111;
                    } else {
                        if (i37 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i17 & 2) != 0) {
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            i18 &= -113;
                        } else {
                            hjVarY = hjVar2;
                        }
                        if (i69 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.x0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.O();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar3 = (er.a) objE;
                        } else {
                            aVar3 = aVar;
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        }
                        if (i26 != 0) {
                            z17 = true;
                        }
                        if (i28 != 0) {
                            z18 = true;
                        }
                        if (i35 != 0) {
                            pVarC = k3.f56525a.c();
                        }
                        if ((i17 & 128) != 0) {
                            pVar3 = new p() { // from class: f2.y0
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.P((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i18 &= -29360129;
                        }
                        if ((i17 & 256) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i18 &= -234881025;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 512) != 0) {
                            i18 = (-1879048193) & i18;
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            jI = j15;
                        }
                        if ((i17 & 1024) != 0) {
                            jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                            i57 &= -15;
                        } else {
                            jE = j16;
                        }
                        if (i45 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f16;
                        }
                        int i71111111111111 = i57;
                        if (i49 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f17;
                        }
                        i58 = i18;
                        pVar5 = pVar3;
                        z27 = z17;
                        z28 = z18;
                        f26 = fJ;
                        i59 = i71111111111111;
                        long j21111112 = jI;
                        hjVar4 = hjVarY;
                        aVar4 = aVar3;
                        f27 = fO;
                        y2Var3 = y2VarK;
                        j19 = jE;
                        z29 = true;
                        j25 = j21111112;
                    }
                    rVarH.y();
                    z35 = z28;
                    if (t.k()) {
                        t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                    }
                    androidx.compose.material3.d dVar119 = androidx.compose.material3.d.f9816a;
                    j0VarF = dVar119.c(rVarH, 6).f();
                    float f21116 = f27;
                    j0VarE = dVar119.c(rVarH, 6).e();
                    j0VarF2 = dVar119.c(rVarH, 6).f();
                    i65 = (i58 & 112) ^ 48;
                    boolean z41113 = z27;
                    if (i65 > 32) {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    } else {
                        y2Var4 = y2Var3;
                        if ((i58 & 48) != 32) {
                            z36 = z29;
                        } else {
                            z36 = false;
                        }
                    }
                    zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                    objE2 = rVarH.E();
                    if (zG) {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new er.a() { // from class: f2.a1
                            @Override // er.a
                            public final Object a() {
                                return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    Function0.g((er.a) objE2, rVarH, 0);
                    objE3 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE3 == companion.a()) {
                        objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                        rVarH.v(objE3);
                    }
                    cVar = (u0.c) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    boolean zG1112 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                    if ((i58 & 896) == 256) {
                        z37 = z29;
                    } else {
                        z37 = false;
                    }
                    z38 = zG1112 | z37;
                    objE5 = rVarH.E();
                    if (z38) {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.b1
                            @Override // er.a
                            public final Object a() {
                                return l1.R(hjVar4, p0Var, cVar, aVar4);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    aVar5 = (er.a) objE5;
                    if (z35) {
                        z39 = false;
                    } else {
                        z39 = false;
                    }
                    zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                    objE6 = rVarH.E();
                    if (zG2) {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new a(aVar5, cVar, null);
                        rVarH.v(objE6);
                    }
                    h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                    int i71111111111112 = i58 >> 6;
                    int i71111111111113 = ((i58 << 3) & 524272) | (3670016 & i71111111111112) | (i71111111111112 & 29360128);
                    int i81111111112 = i59 << 24;
                    int i81111111113 = i71111111111113 | (234881024 & i81111111112) | (i81111111112 & 1879048192);
                    int i81111111114 = i58 >> 15;
                    f3.m mVar1114 = mVar4;
                    y2 y2Var1114 = y2Var4;
                    rVar2 = rVarH;
                    y(((Number) cVar.m()).floatValue(), mVar1114, hjVar4, aVar4, f21116, z41113, y2Var1114, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i81111111113, ((i59 >> 6) & 14) | (i81111111114 & 112) | (i81111111114 & 896) | (i59 & 7168), 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar1114;
                    hjVar3 = hjVar4;
                    aVar2 = aVar4;
                    f18 = f21116;
                    z25 = z41113;
                    y2Var2 = y2Var1114;
                    j17 = j25;
                    j18 = j19;
                    f19 = f26;
                    f25 = fN;
                    pVarC = pVarC;
                    pVar4 = pVar5;
                    z26 = z35;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    aVar2 = aVar;
                    y2Var2 = y2Var;
                    mVar3 = mVar2;
                    hjVar3 = hjVar2;
                    f18 = fO;
                    pVar4 = pVar3;
                    z25 = z17;
                    z26 = z18;
                    j17 = j15;
                    j18 = j16;
                    f19 = f16;
                    f25 = f17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.c1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i55 = i46 | MLKEMEngine.KyberPolyBytes;
            if ((i16 & 3072) != 0) {
                i55 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i57 = i55;
            if ((i18 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (rVarH.r(z19, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        i18 &= -113;
                    } else {
                        hjVarY = hjVar2;
                    }
                    if (i69 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.x0
                                @Override // er.a
                                public final Object a() {
                                    return l1.O();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar3 = (er.a) objE;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    }
                    if (i26 != 0) {
                        z17 = true;
                    }
                    if (i28 != 0) {
                        z18 = true;
                    }
                    if (i35 != 0) {
                        pVarC = k3.f56525a.c();
                    }
                    if ((i17 & 128) != 0) {
                        pVar3 = new p() { // from class: f2.y0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.P((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i18 &= -29360129;
                    }
                    if ((i17 & 256) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 512) != 0) {
                        i18 = (-1879048193) & i18;
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        jI = j15;
                    }
                    if ((i17 & 1024) != 0) {
                        jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                        i57 &= -15;
                    } else {
                        jE = j16;
                    }
                    if (i45 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f16;
                    }
                    int i71111111111114 = i57;
                    if (i49 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f17;
                    }
                    i58 = i18;
                    pVar5 = pVar3;
                    z27 = z17;
                    z28 = z18;
                    f26 = fJ;
                    i59 = i71111111111114;
                    long j21111113 = jI;
                    hjVar4 = hjVarY;
                    aVar4 = aVar3;
                    f27 = fO;
                    y2Var3 = y2VarK;
                    j19 = jE;
                    z29 = true;
                    j25 = j21111113;
                } else {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        i18 &= -113;
                    } else {
                        hjVarY = hjVar2;
                    }
                    if (i69 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.x0
                                @Override // er.a
                                public final Object a() {
                                    return l1.O();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar3 = (er.a) objE;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    }
                    if (i26 != 0) {
                        z17 = true;
                    }
                    if (i28 != 0) {
                        z18 = true;
                    }
                    if (i35 != 0) {
                        pVarC = k3.f56525a.c();
                    }
                    if ((i17 & 128) != 0) {
                        pVar3 = new p() { // from class: f2.y0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.P((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i18 &= -29360129;
                    }
                    if ((i17 & 256) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 512) != 0) {
                        i18 = (-1879048193) & i18;
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        jI = j15;
                    }
                    if ((i17 & 1024) != 0) {
                        jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                        i57 &= -15;
                    } else {
                        jE = j16;
                    }
                    if (i45 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f16;
                    }
                    int i71111111111115 = i57;
                    if (i49 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f17;
                    }
                    i58 = i18;
                    pVar5 = pVar3;
                    z27 = z17;
                    z28 = z18;
                    f26 = fJ;
                    i59 = i71111111111115;
                    long j21111114 = jI;
                    hjVar4 = hjVarY;
                    aVar4 = aVar3;
                    f27 = fO;
                    y2Var3 = y2VarK;
                    j19 = jE;
                    z29 = true;
                    j25 = j21111114;
                }
                rVarH.y();
                z35 = z28;
                if (t.k()) {
                    t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                }
                androidx.compose.material3.d dVar1110 = androidx.compose.material3.d.f9816a;
                j0VarF = dVar1110.c(rVarH, 6).f();
                float f21117 = f27;
                j0VarE = dVar1110.c(rVarH, 6).e();
                j0VarF2 = dVar1110.c(rVarH, 6).f();
                i65 = (i58 & 112) ^ 48;
                boolean z41114 = z27;
                if (i65 > 32) {
                    y2Var4 = y2Var3;
                    if ((i58 & 48) != 32) {
                        z36 = z29;
                    } else {
                        z36 = false;
                    }
                } else {
                    y2Var4 = y2Var3;
                    if ((i58 & 48) != 32) {
                        z36 = z29;
                    } else {
                        z36 = false;
                    }
                }
                zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                objE2 = rVarH.E();
                if (zG) {
                    objE2 = new er.a() { // from class: f2.a1
                        @Override // er.a
                        public final Object a() {
                            return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.a() { // from class: f2.a1
                        @Override // er.a
                        public final Object a() {
                            return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                        }
                    };
                    rVarH.v(objE2);
                }
                Function0.g((er.a) objE2, rVarH, 0);
                objE3 = rVarH.E();
                companion = r.INSTANCE;
                if (objE3 == companion.a()) {
                    objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                    rVarH.v(objE3);
                }
                cVar = (u0.c) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE4);
                }
                p0Var = (p0) objE4;
                boolean zG1113 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                if ((i58 & 896) == 256) {
                    z37 = z29;
                } else {
                    z37 = false;
                }
                z38 = zG1113 | z37;
                objE5 = rVarH.E();
                if (z38) {
                    objE5 = new er.a() { // from class: f2.b1
                        @Override // er.a
                        public final Object a() {
                            return l1.R(hjVar4, p0Var, cVar, aVar4);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new er.a() { // from class: f2.b1
                        @Override // er.a
                        public final Object a() {
                            return l1.R(hjVar4, p0Var, cVar, aVar4);
                        }
                    };
                    rVarH.v(objE5);
                }
                aVar5 = (er.a) objE5;
                if (z35) {
                    z39 = false;
                } else {
                    z39 = false;
                }
                zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                objE6 = rVarH.E();
                if (zG2) {
                    objE6 = new a(aVar5, cVar, null);
                    rVarH.v(objE6);
                } else {
                    objE6 = new a(aVar5, cVar, null);
                    rVarH.v(objE6);
                }
                h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                int i71111111111116 = i58 >> 6;
                int i71111111111117 = ((i58 << 3) & 524272) | (3670016 & i71111111111116) | (i71111111111116 & 29360128);
                int i81111111115 = i59 << 24;
                int i81111111116 = i71111111111117 | (234881024 & i81111111115) | (i81111111115 & 1879048192);
                int i81111111117 = i58 >> 15;
                f3.m mVar1115 = mVar4;
                y2 y2Var1115 = y2Var4;
                rVar2 = rVarH;
                y(((Number) cVar.m()).floatValue(), mVar1115, hjVar4, aVar4, f21117, z41114, y2Var1115, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i81111111116, ((i59 >> 6) & 14) | (i81111111117 & 112) | (i81111111117 & 896) | (i59 & 7168), 0);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar1115;
                hjVar3 = hjVar4;
                aVar2 = aVar4;
                f18 = f21117;
                z25 = z41114;
                y2Var2 = y2Var1115;
                j17 = j25;
                j18 = j19;
                f19 = f26;
                f25 = fN;
                pVarC = pVarC;
                pVar4 = pVar5;
                z26 = z35;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                aVar2 = aVar;
                y2Var2 = y2Var;
                mVar3 = mVar2;
                hjVar3 = hjVar2;
                f18 = fO;
                pVar4 = pVar3;
                z25 = z17;
                z26 = z18;
                j17 = j15;
                j18 = j16;
                f19 = f16;
                f25 = f17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.c1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i48 = i39 | 48;
        i46 = i48;
        i49 = i17 & PKIFailureInfo.certConfirmed;
        if (i49 != 0) {
            i55 = i46;
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.b(f17)) {
                    i56 = 256;
                } else {
                    i56 = 128;
                }
                i55 |= i56;
            }
            if ((i16 & 3072) != 0) {
                i55 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i57 = i55;
            if ((i18 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (rVarH.r(z19, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        i18 &= -113;
                    } else {
                        hjVarY = hjVar2;
                    }
                    if (i69 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.x0
                                @Override // er.a
                                public final Object a() {
                                    return l1.O();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar3 = (er.a) objE;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    }
                    if (i26 != 0) {
                        z17 = true;
                    }
                    if (i28 != 0) {
                        z18 = true;
                    }
                    if (i35 != 0) {
                        pVarC = k3.f56525a.c();
                    }
                    if ((i17 & 128) != 0) {
                        pVar3 = new p() { // from class: f2.y0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.P((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i18 &= -29360129;
                    }
                    if ((i17 & 256) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 512) != 0) {
                        i18 = (-1879048193) & i18;
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        jI = j15;
                    }
                    if ((i17 & 1024) != 0) {
                        jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                        i57 &= -15;
                    } else {
                        jE = j16;
                    }
                    if (i45 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f16;
                    }
                    int i71111111111118 = i57;
                    if (i49 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f17;
                    }
                    i58 = i18;
                    pVar5 = pVar3;
                    z27 = z17;
                    z28 = z18;
                    f26 = fJ;
                    i59 = i71111111111118;
                    long j21111115 = jI;
                    hjVar4 = hjVarY;
                    aVar4 = aVar3;
                    f27 = fO;
                    y2Var3 = y2VarK;
                    j19 = jE;
                    z29 = true;
                    j25 = j21111115;
                } else {
                    if (i37 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i17 & 2) != 0) {
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        i18 &= -113;
                    } else {
                        hjVarY = hjVar2;
                    }
                    if (i69 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.x0
                                @Override // er.a
                                public final Object a() {
                                    return l1.O();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar3 = (er.a) objE;
                    } else {
                        aVar3 = aVar;
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    }
                    if (i26 != 0) {
                        z17 = true;
                    }
                    if (i28 != 0) {
                        z18 = true;
                    }
                    if (i35 != 0) {
                        pVarC = k3.f56525a.c();
                    }
                    if ((i17 & 128) != 0) {
                        pVar3 = new p() { // from class: f2.y0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.P((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i18 &= -29360129;
                    }
                    if ((i17 & 256) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i18 &= -234881025;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 512) != 0) {
                        i18 = (-1879048193) & i18;
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        jI = j15;
                    }
                    if ((i17 & 1024) != 0) {
                        jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                        i57 &= -15;
                    } else {
                        jE = j16;
                    }
                    if (i45 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f16;
                    }
                    int i71111111111119 = i57;
                    if (i49 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f17;
                    }
                    i58 = i18;
                    pVar5 = pVar3;
                    z27 = z17;
                    z28 = z18;
                    f26 = fJ;
                    i59 = i71111111111119;
                    long j21111116 = jI;
                    hjVar4 = hjVarY;
                    aVar4 = aVar3;
                    f27 = fO;
                    y2Var3 = y2VarK;
                    j19 = jE;
                    z29 = true;
                    j25 = j21111116;
                }
                rVarH.y();
                z35 = z28;
                if (t.k()) {
                    t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
                }
                androidx.compose.material3.d dVar1111 = androidx.compose.material3.d.f9816a;
                j0VarF = dVar1111.c(rVarH, 6).f();
                float f21118 = f27;
                j0VarE = dVar1111.c(rVarH, 6).e();
                j0VarF2 = dVar1111.c(rVarH, 6).f();
                i65 = (i58 & 112) ^ 48;
                boolean z41115 = z27;
                if (i65 > 32) {
                    y2Var4 = y2Var3;
                    if ((i58 & 48) != 32) {
                        z36 = z29;
                    } else {
                        z36 = false;
                    }
                } else {
                    y2Var4 = y2Var3;
                    if ((i58 & 48) != 32) {
                        z36 = z29;
                    } else {
                        z36 = false;
                    }
                }
                zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
                objE2 = rVarH.E();
                if (zG) {
                    objE2 = new er.a() { // from class: f2.a1
                        @Override // er.a
                        public final Object a() {
                            return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new er.a() { // from class: f2.a1
                        @Override // er.a
                        public final Object a() {
                            return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                        }
                    };
                    rVarH.v(objE2);
                }
                Function0.g((er.a) objE2, rVarH, 0);
                objE3 = rVarH.E();
                companion = r.INSTANCE;
                if (objE3 == companion.a()) {
                    objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                    rVarH.v(objE3);
                }
                cVar = (u0.c) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE4);
                }
                p0Var = (p0) objE4;
                boolean zG1114 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
                if ((i58 & 896) == 256) {
                    z37 = z29;
                } else {
                    z37 = false;
                }
                z38 = zG1114 | z37;
                objE5 = rVarH.E();
                if (z38) {
                    objE5 = new er.a() { // from class: f2.b1
                        @Override // er.a
                        public final Object a() {
                            return l1.R(hjVar4, p0Var, cVar, aVar4);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new er.a() { // from class: f2.b1
                        @Override // er.a
                        public final Object a() {
                            return l1.R(hjVar4, p0Var, cVar, aVar4);
                        }
                    };
                    rVarH.v(objE5);
                }
                aVar5 = (er.a) objE5;
                if (z35) {
                    z39 = false;
                } else {
                    z39 = false;
                }
                zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
                objE6 = rVarH.E();
                if (zG2) {
                    objE6 = new a(aVar5, cVar, null);
                    rVarH.v(objE6);
                } else {
                    objE6 = new a(aVar5, cVar, null);
                    rVarH.v(objE6);
                }
                h2.u.b(z39, (p) objE6, rVarH, 0, 0);
                int i711111111111110 = i58 >> 6;
                int i711111111111111 = ((i58 << 3) & 524272) | (3670016 & i711111111111110) | (i711111111111110 & 29360128);
                int i81111111118 = i59 << 24;
                int i81111111119 = i711111111111111 | (234881024 & i81111111118) | (i81111111118 & 1879048192);
                int i811111111110 = i58 >> 15;
                f3.m mVar1116 = mVar4;
                y2 y2Var1116 = y2Var4;
                rVar2 = rVarH;
                y(((Number) cVar.m()).floatValue(), mVar1116, hjVar4, aVar4, f21118, z41115, y2Var1116, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i81111111119, ((i59 >> 6) & 14) | (i811111111110 & 112) | (i811111111110 & 896) | (i59 & 7168), 0);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar1116;
                hjVar3 = hjVar4;
                aVar2 = aVar4;
                f18 = f21118;
                z25 = z41115;
                y2Var2 = y2Var1116;
                j17 = j25;
                j18 = j19;
                f19 = f26;
                f25 = fN;
                pVarC = pVarC;
                pVar4 = pVar5;
                z26 = z35;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                aVar2 = aVar;
                y2Var2 = y2Var;
                mVar3 = mVar2;
                hjVar3 = hjVar2;
                f18 = fO;
                pVar4 = pVar3;
                z25 = z17;
                z26 = z18;
                j17 = j15;
                j18 = j16;
                f19 = f16;
                f25 = f17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.c1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i55 = i46 | MLKEMEngine.KyberPolyBytes;
        if ((i16 & 3072) != 0) {
            i55 |= rVarH.G(qVar) ? 2048 : 1024;
        }
        i57 = i55;
        if ((i18 & 306783379) == 306783378) {
            z19 = true;
        } else {
            z19 = true;
        }
        if (rVarH.r(z19, i18 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i37 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 2) != 0) {
                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                    i18 &= -113;
                } else {
                    hjVarY = hjVar2;
                }
                if (i69 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.a() { // from class: f2.x0
                            @Override // er.a
                            public final Object a() {
                                return l1.O();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar3 = (er.a) objE;
                } else {
                    aVar3 = aVar;
                }
                if (i19 != 0) {
                    fO = n0.f56958a.o();
                }
                if (i26 != 0) {
                    z17 = true;
                }
                if (i28 != 0) {
                    z18 = true;
                }
                if (i35 != 0) {
                    pVarC = k3.f56525a.c();
                }
                if ((i17 & 128) != 0) {
                    pVar3 = new p() { // from class: f2.y0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.P((r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    i18 &= -29360129;
                }
                if ((i17 & 256) != 0) {
                    y2VarK = n0.f56958a.k(rVarH, 6);
                    i18 &= -234881025;
                } else {
                    y2VarK = y2Var;
                }
                if ((i17 & 512) != 0) {
                    i18 = (-1879048193) & i18;
                    jI = n0.f56958a.i(rVarH, 6);
                } else {
                    jI = j15;
                }
                if ((i17 & 1024) != 0) {
                    jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                    i57 &= -15;
                } else {
                    jE = j16;
                }
                if (i45 != 0) {
                    fJ = n0.f56958a.j();
                } else {
                    fJ = f16;
                }
                int i711111111111112 = i57;
                if (i49 != 0) {
                    fN = c5.h.n(0);
                } else {
                    fN = f17;
                }
                i58 = i18;
                pVar5 = pVar3;
                z27 = z17;
                z28 = z18;
                f26 = fJ;
                i59 = i711111111111112;
                long j21111117 = jI;
                hjVar4 = hjVarY;
                aVar4 = aVar3;
                f27 = fO;
                y2Var3 = y2VarK;
                j19 = jE;
                z29 = true;
                j25 = j21111117;
            } else {
                if (i37 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i17 & 2) != 0) {
                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                    i18 &= -113;
                } else {
                    hjVarY = hjVar2;
                }
                if (i69 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.a() { // from class: f2.x0
                            @Override // er.a
                            public final Object a() {
                                return l1.O();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar3 = (er.a) objE;
                } else {
                    aVar3 = aVar;
                }
                if (i19 != 0) {
                    fO = n0.f56958a.o();
                }
                if (i26 != 0) {
                    z17 = true;
                }
                if (i28 != 0) {
                    z18 = true;
                }
                if (i35 != 0) {
                    pVarC = k3.f56525a.c();
                }
                if ((i17 & 128) != 0) {
                    pVar3 = new p() { // from class: f2.y0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.P((r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    i18 &= -29360129;
                }
                if ((i17 & 256) != 0) {
                    y2VarK = n0.f56958a.k(rVarH, 6);
                    i18 &= -234881025;
                } else {
                    y2VarK = y2Var;
                }
                if ((i17 & 512) != 0) {
                    i18 = (-1879048193) & i18;
                    jI = n0.f56958a.i(rVarH, 6);
                } else {
                    jI = j15;
                }
                if ((i17 & 1024) != 0) {
                    jE = g2.e(jI, rVarH, (i18 >> 27) & 14);
                    i57 &= -15;
                } else {
                    jE = j16;
                }
                if (i45 != 0) {
                    fJ = n0.f56958a.j();
                } else {
                    fJ = f16;
                }
                int i711111111111113 = i57;
                if (i49 != 0) {
                    fN = c5.h.n(0);
                } else {
                    fN = f17;
                }
                i58 = i18;
                pVar5 = pVar3;
                z27 = z17;
                z28 = z18;
                f26 = fJ;
                i59 = i711111111111113;
                long j21111118 = jI;
                hjVar4 = hjVarY;
                aVar4 = aVar3;
                f27 = fO;
                y2Var3 = y2VarK;
                j19 = jE;
                z29 = true;
                j25 = j21111118;
            }
            rVarH.y();
            z35 = z28;
            if (t.k()) {
                t.o(57000307, i58, i59, "androidx.compose.material3.BottomSheet (BottomSheet.kt:133)");
            }
            androidx.compose.material3.d dVar1112 = androidx.compose.material3.d.f9816a;
            j0VarF = dVar1112.c(rVarH, 6).f();
            float f21119 = f27;
            j0VarE = dVar1112.c(rVarH, 6).e();
            j0VarF2 = dVar1112.c(rVarH, 6).f();
            i65 = (i58 & 112) ^ 48;
            boolean z41116 = z27;
            if (i65 > 32) {
                y2Var4 = y2Var3;
                if ((i58 & 48) != 32) {
                    z36 = z29;
                } else {
                    z36 = false;
                }
            } else {
                y2Var4 = y2Var3;
                if ((i58 & 48) != 32) {
                    z36 = z29;
                } else {
                    z36 = false;
                }
            }
            zG = z36 | rVarH.G(j0VarF) | rVarH.G(j0VarE) | rVarH.G(j0VarF2);
            objE2 = rVarH.E();
            if (zG) {
                objE2 = new er.a() { // from class: f2.a1
                    @Override // er.a
                    public final Object a() {
                        return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new er.a() { // from class: f2.a1
                    @Override // er.a
                    public final Object a() {
                        return l1.Q(hjVar4, j0VarF, j0VarE, j0VarF2);
                    }
                };
                rVarH.v(objE2);
            }
            Function0.g((er.a) objE2, rVarH, 0);
            objE3 = rVarH.E();
            companion = r.INSTANCE;
            if (objE3 == companion.a()) {
                objE3 = u0.d.b(0.0f, 0.0f, 2, null);
                rVarH.v(objE3);
            }
            cVar = (u0.c) objE3;
            objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE4);
            }
            p0Var = (p0) objE4;
            boolean zG1115 = (((i65 > 32 || !rVarH.W(hjVar4)) && (i58 & 48) != 32) ? false : z29) | rVarH.G(p0Var) | rVarH.G(cVar);
            if ((i58 & 896) == 256) {
                z37 = z29;
            } else {
                z37 = false;
            }
            z38 = zG1115 | z37;
            objE5 = rVarH.E();
            if (z38) {
                objE5 = new er.a() { // from class: f2.b1
                    @Override // er.a
                    public final Object a() {
                        return l1.R(hjVar4, p0Var, cVar, aVar4);
                    }
                };
                rVarH.v(objE5);
            } else {
                objE5 = new er.a() { // from class: f2.b1
                    @Override // er.a
                    public final Object a() {
                        return l1.R(hjVar4, p0Var, cVar, aVar4);
                    }
                };
                rVarH.v(objE5);
            }
            aVar5 = (er.a) objE5;
            if (z35) {
                z39 = false;
            } else {
                z39 = false;
            }
            zG2 = rVarH.G(cVar) | rVarH.W(aVar5);
            objE6 = rVarH.E();
            if (zG2) {
                objE6 = new a(aVar5, cVar, null);
                rVarH.v(objE6);
            } else {
                objE6 = new a(aVar5, cVar, null);
                rVarH.v(objE6);
            }
            h2.u.b(z39, (p) objE6, rVarH, 0, 0);
            int i711111111111114 = i58 >> 6;
            int i711111111111115 = ((i58 << 3) & 524272) | (3670016 & i711111111111114) | (i711111111111114 & 29360128);
            int i811111111111 = i59 << 24;
            int i811111111112 = i711111111111115 | (234881024 & i811111111111) | (i811111111111 & 1879048192);
            int i811111111113 = i58 >> 15;
            f3.m mVar1117 = mVar4;
            y2 y2Var1117 = y2Var4;
            rVar2 = rVarH;
            y(((Number) cVar.m()).floatValue(), mVar1117, hjVar4, aVar4, f21119, z41116, y2Var1117, j25, j19, f26, fN, pVarC, pVar5, qVar, rVar2, i811111111112, ((i59 >> 6) & 14) | (i811111111113 & 112) | (i811111111113 & 896) | (i59 & 7168), 0);
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar1117;
            hjVar3 = hjVar4;
            aVar2 = aVar4;
            f18 = f21119;
            z25 = z41116;
            y2Var2 = y2Var1117;
            j17 = j25;
            j18 = j19;
            f19 = f26;
            f25 = fN;
            pVarC = pVarC;
            pVar4 = pVar5;
            z26 = z35;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            aVar2 = aVar;
            y2Var2 = y2Var;
            mVar3 = mVar2;
            hjVar3 = hjVar2;
            f18 = fO;
            pVar4 = pVar3;
            z25 = z17;
            z26 = z18;
            j17 = j15;
            j18 = j16;
            f19 = f16;
            f25 = f17;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.c1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l1.T(mVar3, hjVar3, aVar2, f18, z25, z26, pVarC, pVar4, y2Var2, j17, j18, f19, f25, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0119  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:107:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:110:0x0137  */
    /* JADX WARN: Code duplicated, block: B:112:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x0144  */
    /* JADX WARN: Code duplicated, block: B:115:0x0149  */
    /* JADX WARN: Code duplicated, block: B:118:0x0153  */
    /* JADX WARN: Code duplicated, block: B:120:0x015a  */
    /* JADX WARN: Code duplicated, block: B:122:0x015e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x016b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0173  */
    /* JADX WARN: Code duplicated, block: B:131:0x0177  */
    /* JADX WARN: Code duplicated, block: B:134:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x0189  */
    /* JADX WARN: Code duplicated, block: B:140:0x018f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0197  */
    /* JADX WARN: Code duplicated, block: B:145:0x019e  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:152:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:155:0x01be  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:176:0x020b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x020d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0214  */
    /* JADX WARN: Code duplicated, block: B:182:0x021e  */
    /* JADX WARN: Code duplicated, block: B:184:0x022a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0235  */
    /* JADX WARN: Code duplicated, block: B:188:0x0238  */
    /* JADX WARN: Code duplicated, block: B:189:0x023f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0242  */
    /* JADX WARN: Code duplicated, block: B:194:0x0247  */
    /* JADX WARN: Code duplicated, block: B:195:0x0250  */
    /* JADX WARN: Code duplicated, block: B:198:0x0256  */
    /* JADX WARN: Code duplicated, block: B:199:0x0262  */
    /* JADX WARN: Code duplicated, block: B:202:0x0269  */
    /* JADX WARN: Code duplicated, block: B:203:0x0274  */
    /* JADX WARN: Code duplicated, block: B:205:0x0279  */
    /* JADX WARN: Code duplicated, block: B:206:0x0280  */
    /* JADX WARN: Code duplicated, block: B:208:0x0284  */
    /* JADX WARN: Code duplicated, block: B:209:0x028a  */
    /* JADX WARN: Code duplicated, block: B:211:0x028e  */
    /* JADX WARN: Code duplicated, block: B:212:0x0295  */
    /* JADX WARN: Code duplicated, block: B:215:0x029b  */
    /* JADX WARN: Code duplicated, block: B:216:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:219:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:222:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:224:0x0300  */
    /* JADX WARN: Code duplicated, block: B:230:0x030d  */
    /* JADX WARN: Code duplicated, block: B:232:0x0315  */
    /* JADX WARN: Code duplicated, block: B:235:0x033d  */
    /* JADX WARN: Code duplicated, block: B:239:0x0347  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:241:0x034d A[PHI: r40
      0x034d: PHI (r40v5 h2.n1) = (r40v0 h2.n1), (r40v6 h2.n1) binds: [B:240:0x034b, B:238:0x0344] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:242:0x034f  */
    /* JADX WARN: Code duplicated, block: B:245:0x0362  */
    /* JADX WARN: Code duplicated, block: B:249:0x036e  */
    /* JADX WARN: Code duplicated, block: B:252:0x0394  */
    /* JADX WARN: Code duplicated, block: B:255:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:259:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:261:0x03b3 A[PHI: r26
      0x03b3: PHI (r26v5 n3.y2) = (r26v3 n3.y2), (r26v6 n3.y2) binds: [B:260:0x03b1, B:258:0x03aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:262:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:265:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:266:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:269:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:271:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:274:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:276:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:278:0x0403  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:284:0x0410  */
    /* JADX WARN: Code duplicated, block: B:286:0x0416  */
    /* JADX WARN: Code duplicated, block: B:288:0x042d  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0448  */
    /* JADX WARN: Code duplicated, block: B:293:0x044e  */
    /* JADX WARN: Code duplicated, block: B:299:0x045b  */
    /* JADX WARN: Code duplicated, block: B:301:0x0461  */
    /* JADX WARN: Code duplicated, block: B:304:0x0475  */
    /* JADX WARN: Code duplicated, block: B:307:0x047f  */
    /* JADX WARN: Code duplicated, block: B:310:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:312:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:315:0x0527  */
    /* JADX WARN: Code duplicated, block: B:317:0x053c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:320:0x055a  */
    /* JADX WARN: Code duplicated, block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x010e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    public static final void y(final float f15, f3.m mVar, hj hjVar, er.a<i0> aVar, float f16, boolean z15, y2 y2Var, long j15, long j16, float f17, float f18, p<? super r, ? super Integer, i0> pVar, p<? super r, ? super Integer, ? extends c4> pVar2, final q<? super h0, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16, final int i17) {
        int i18;
        f3.m mVar2;
        final hj hjVarY;
        int i19;
        er.a<i0> aVar2;
        int i25;
        int i26;
        float f19;
        int i27;
        int i28;
        boolean z16;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        int i47;
        int i48;
        boolean z17;
        final long j17;
        final p<? super r, ? super Integer, ? extends c4> pVar3;
        r rVar2;
        final er.a<i0> aVar3;
        final float f25;
        final f3.m mVar3;
        final hj hjVar2;
        final boolean z18;
        final y2 y2Var2;
        final long j18;
        final float f26;
        final float f27;
        final p<? super r, ? super Integer, i0> pVar4;
        d5 d5VarM;
        er.a<i0> aVar4;
        float fO;
        y2 y2VarK;
        int i49;
        long jI;
        long jE;
        int i55;
        float fJ;
        float fN;
        p<? super r, ? super Integer, i0> pVarD;
        p<? super r, ? super Integer, ? extends c4> pVar5;
        Object objE;
        er.a<i0> aVar5;
        final String strB;
        f3 f3Var;
        c5.d dVar;
        n1 n1Var;
        int i56;
        boolean z19;
        Object objE2;
        d3 d3VarA;
        n1 n1Var2;
        boolean z25;
        boolean zW;
        Object objE3;
        final er.a<i0> aVar6;
        j jVar;
        Object objE4;
        r.Companion companion;
        final p0 p0Var;
        y2 y2Var3;
        boolean z26;
        boolean z27;
        boolean z28;
        Object objE5;
        f3.m mVarB;
        boolean z29;
        Object objE6;
        boolean z35;
        boolean zW2;
        Object objE7;
        boolean z36;
        Object objE8;
        int i57;
        int i58;
        int i59;
        r rVarH = rVar.h(-780255289);
        if ((i15 & 6) == 0) {
            i18 = (rVarH.b(f15) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        int i65 = i17 & 2;
        if (i65 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i18 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i17 & 4) == 0) {
                    hjVarY = hjVar;
                    int i66 = rVarH.W(hjVarY) ? 256 : 128;
                    i18 |= i66;
                } else {
                    hjVarY = hjVar;
                }
                i18 |= i66;
            } else {
                hjVarY = hjVar;
            }
            i19 = i17 & 8;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    aVar2 = aVar;
                    if (rVarH.G(aVar2)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i18 |= i25;
                }
                i26 = i17 & 16;
                if (i26 != 0) {
                    if ((i15 & 24576) == 0) {
                        f19 = f16;
                        if (rVarH.b(f19)) {
                            i27 = 16384;
                        } else {
                            i27 = PKIFailureInfo.certRevoked;
                        }
                        i18 |= i27;
                    }
                    i28 = i17 & 32;
                    if (i28 != 0) {
                        i18 |= 196608;
                        z16 = z15;
                    } else {
                        z16 = z15;
                        if ((i15 & 196608) == 0) {
                            if (rVarH.a(z16)) {
                                i29 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i29 = PKIFailureInfo.notAuthorized;
                            }
                            i18 |= i29;
                        }
                    }
                    if ((i15 & 1572864) != 0) {
                        if ((i17 & 64) == 0 || !rVarH.W(y2Var)) {
                            i59 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i59 = PKIFailureInfo.badCertTemplate;
                        }
                        i18 |= i59;
                    }
                    if ((i15 & 12582912) == 0) {
                        if ((i17 & 128) == 0) {
                            i58 = i18;
                            int i67 = rVarH.d(j15) ? 8388608 : 4194304;
                            i35 = i58 | i67;
                        } else {
                            i58 = i18;
                        }
                        i35 = i58 | i67;
                    } else {
                        i35 = i18;
                    }
                    if ((i15 & 100663296) != 0) {
                        if ((i17 & 256) == 0 || !rVarH.d(j16)) {
                            i57 = 33554432;
                        } else {
                            i57 = 67108864;
                        }
                        i35 |= i57;
                    }
                    i36 = i17 & 512;
                    if (i36 != 0) {
                        i35 |= 805306368;
                    } else if ((i15 & 805306368) == 0) {
                        if (rVarH.b(f17)) {
                            i37 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i37 = 268435456;
                        }
                        i35 |= i37;
                    }
                    i38 = i17 & 1024;
                    if (i38 != 0) {
                        i39 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (rVarH.b(f18)) {
                            i45 = 4;
                        } else {
                            i45 = 2;
                        }
                        i39 = i16 | i45;
                    } else {
                        i39 = i16;
                    }
                    i46 = i17 & 2048;
                    if (i46 != 0) {
                        if ((i16 & 48) == 0) {
                            if (rVarH.G(pVar)) {
                                i47 = 32;
                            } else {
                                i47 = 16;
                            }
                            i39 |= i47;
                        }
                        if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                            i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
                        }
                        if ((i16 & 3072) != 0) {
                            i39 |= rVarH.G(qVar) ? 2048 : 1024;
                        }
                        i48 = i39;
                        if ((i35 & 306783379) == 306783378 || (i48 & 1171) != 1170) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i35 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0 || rVarH.Q()) {
                                if (i65 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if ((i17 & 4) != 0) {
                                    i35 &= -897;
                                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                                }
                                if (i19 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new er.a() { // from class: f2.z0
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.z();
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    aVar4 = (er.a) objE;
                                } else {
                                    aVar4 = aVar2;
                                }
                                if (i26 != 0) {
                                    fO = n0.f56958a.o();
                                } else {
                                    fO = f19;
                                }
                                if (i28 != 0) {
                                    z16 = true;
                                }
                                if ((i17 & 64) != 0) {
                                    y2VarK = n0.f56958a.k(rVarH, 6);
                                    i35 &= -3670017;
                                } else {
                                    y2VarK = y2Var;
                                }
                                if ((i17 & 128) != 0) {
                                    i49 = i35 & (-29360129);
                                    jI = n0.f56958a.i(rVarH, 6);
                                } else {
                                    i49 = i35;
                                    jI = j15;
                                }
                                if ((i17 & 256) != 0) {
                                    jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                                    i55 = i49 & (-234881025);
                                } else {
                                    jE = j16;
                                    i55 = i49;
                                }
                                if (i36 != 0) {
                                    fJ = n0.f56958a.j();
                                } else {
                                    fJ = f17;
                                }
                                if (i38 != 0) {
                                    fN = c5.h.n(0);
                                } else {
                                    fN = f18;
                                }
                                if (i46 != 0) {
                                    pVarD = k3.f56525a.d();
                                } else {
                                    pVarD = pVar;
                                }
                                if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                                    pVar5 = new p() { // from class: f2.d1
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.A((r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                    i48 &= -897;
                                } else {
                                    pVar5 = pVar2;
                                }
                            } else {
                                rVarH.O();
                                if ((i17 & 4) != 0) {
                                    i35 &= -897;
                                }
                                if ((i17 & 64) != 0) {
                                    i35 &= -3670017;
                                }
                                if ((i17 & 128) != 0) {
                                    i35 &= -29360129;
                                }
                                if ((i17 & 256) != 0) {
                                    i35 &= -234881025;
                                }
                                if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                                    i48 &= -897;
                                }
                                jE = j16;
                                fN = f18;
                                pVarD = pVar;
                                pVar5 = pVar2;
                                i55 = i35;
                                aVar4 = aVar2;
                                fO = f19;
                                y2VarK = y2Var;
                                jI = j15;
                                fJ = f17;
                            }
                            rVarH.y();
                            aVar5 = aVar4;
                            if (t.k()) {
                                t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                            }
                            a2.Companion companion2 = a2.INSTANCE;
                            strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                            f3Var = (f3) rVarH.N(g1.u());
                            int i68 = i48;
                            final p<? super r, ? super Integer, ? extends c4> pVar6 = pVar5;
                            j0 j0VarF = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                            dVar = (c5.d) rVarH.N(g1.f());
                            n1Var = n1.f79921a;
                            q1<ij> q1VarD = hjVarY.d();
                            i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                            long j19 = jI;
                            z19 = (i56 <= 256 && rVarH.W(hjVarY)) || (i55 & MLKEMEngine.KyberPolyBytes) == 256;
                            objE2 = rVarH.E();
                            if (z19 || objE2 == r.INSTANCE.a()) {
                                objE2 = new l() { // from class: f2.e1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            d3VarA = n1Var.a(q1VarD, (l) objE2, j0VarF, rVarH, 3072);
                            boolean zW3 = rVarH.W(d3VarA);
                            if (i56 > 256 || !rVarH.W(hjVarY)) {
                                n1Var2 = n1Var;
                                if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z25 = false;
                                }
                                zW = zW3 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                                objE3 = rVarH.E();
                                if (!zW || objE3 == r.INSTANCE.a()) {
                                    objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                                    aVar6 = aVar5;
                                    rVarH.v(objE3);
                                } else {
                                    aVar6 = aVar5;
                                }
                                jVar = (j) objE3;
                                objE4 = rVarH.E();
                                companion = r.INSTANCE;
                                if (objE4 == companion.a()) {
                                    objE4 = Function0.i(tq.j.f191408a, rVarH);
                                    rVarH.v(objE4);
                                }
                                p0Var = (p0) objE4;
                                if (i56 > 256 || !rVarH.W(hjVarY)) {
                                    y2Var3 = y2VarK;
                                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                        z26 = false;
                                    }
                                    boolean zG = z26 | rVarH.G(p0Var);
                                    if ((i55 & 7168) == 2048) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    z28 = zG | z27;
                                    objE5 = rVarH.E();
                                    if (z28 || objE5 == companion.a()) {
                                        objE5 = new er.a() { // from class: f2.f1
                                            @Override // er.a
                                            public final Object a() {
                                                return l1.C(hjVarY, p0Var, aVar6);
                                            }
                                        };
                                        rVarH.v(objE5);
                                    }
                                    final er.a aVar7 = (er.a) objE5;
                                    er.a<i0> aVar8 = aVar6;
                                    f3.m mVarH = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                                    if (z16) {
                                        rVarH.X(1794077610);
                                        f3.m.Companion companion3 = f3.m.INSTANCE;
                                        z36 = (i56 <= 256 && rVarH.W(hjVarY)) || (i55 & MLKEMEngine.KyberPolyBytes) == 256;
                                        objE8 = rVarH.E();
                                        if (z36 || objE8 == companion.a()) {
                                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                            rVarH.v(objE8);
                                        }
                                        mVarB = z3.d.b(companion3, (z3.a) objE8, null, 2, null);
                                        rVarH.R();
                                    } else {
                                        rVarH.X(1794092431);
                                        rVarH.R();
                                        mVarB = f3.m.INSTANCE;
                                    }
                                    f3.m mVarU = mVarH.u(mVarB);
                                    q1<ij> q1VarD2 = hjVarY.d();
                                    p143z0.a2 a2Var = p143z0.a2.Vertical;
                                    z29 = (i56 <= 256 && rVarH.W(hjVarY)) || (i55 & MLKEMEngine.KyberPolyBytes) == 256;
                                    objE6 = rVarH.E();
                                    if (z29 || objE6 == companion.a()) {
                                        objE6 = new p() { // from class: f2.g1
                                            @Override // er.p
                                            public final Object B(Object obj, Object obj2) {
                                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                            }
                                        };
                                        rVarH.v(objE6);
                                    }
                                    f3.m mVarA = z0.a(mVarU, q1VarD2, a2Var, (p) objE6);
                                    q1<ij> q1VarD3 = hjVarY.d();
                                    if (z16 || hjVarY.f() == ij.Hidden) {
                                        z35 = false;
                                    } else {
                                        z35 = true;
                                    }
                                    f3.m mVarB2 = n1Var2.b(mVarA, q1VarD3, a2Var, z35, false, jVar, null, rVarH, 12583296, 40);
                                    zW2 = rVarH.W(strB);
                                    objE7 = rVarH.E();
                                    if (zW2 || objE7 == companion.a()) {
                                        objE7 = new l() { // from class: f2.h1
                                            @Override // er.l
                                            public final Object b(Object obj) {
                                                return l1.G(strB, (n4.i0) obj);
                                            }
                                        };
                                        rVarH.v(objE7);
                                    }
                                    final hj hjVar3 = hjVarY;
                                    final boolean z37 = z16;
                                    final p<? super r, ? super Integer, i0> pVar7 = pVarD;
                                    int i69 = i55 >> 15;
                                    androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB2, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j19, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.H(pVar6, f15, hjVar3, pVar7, aVar7, p0Var, z37, qVar, (r) obj, ((Integer) obj2).intValue());
                                        }
                                    }, rVarH, 54), rVarH, (i69 & 57344) | (i69 & 112) | 12582912 | (i69 & 896) | (i69 & 7168) | (458752 & (i68 << 15)), 64);
                                    if (t.k()) {
                                        t.n();
                                    }
                                    rVar2 = rVarH;
                                    f25 = fO;
                                    z18 = z16;
                                    pVar4 = pVarD;
                                    aVar3 = aVar8;
                                    y2Var2 = y2Var3;
                                    j17 = j19;
                                    mVar3 = mVar2;
                                    hjVar2 = hjVarY;
                                    f27 = fN;
                                    pVar3 = pVar6;
                                    f26 = fJ;
                                    j18 = jE;
                                } else {
                                    y2Var3 = y2VarK;
                                }
                                z26 = true;
                                boolean zG2 = z26 | rVarH.G(p0Var);
                                if ((i55 & 7168) == 2048) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                z28 = zG2 | z27;
                                objE5 = rVarH.E();
                                if (z28) {
                                    objE5 = new er.a() { // from class: f2.f1
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.C(hjVarY, p0Var, aVar6);
                                        }
                                    };
                                    rVarH.v(objE5);
                                } else {
                                    objE5 = new er.a() { // from class: f2.f1
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.C(hjVarY, p0Var, aVar6);
                                        }
                                    };
                                    rVarH.v(objE5);
                                }
                                final er.a aVar9 = (er.a) objE5;
                                er.a<i0> aVar10 = aVar6;
                                f3.m mVarH2 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                                if (z16) {
                                    rVarH.X(1794077610);
                                    f3.m.Companion companion4 = f3.m.INSTANCE;
                                    if (i56 <= 256) {
                                    }
                                    objE8 = rVarH.E();
                                    if (z36) {
                                        objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                        rVarH.v(objE8);
                                    } else {
                                        objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                        rVarH.v(objE8);
                                    }
                                    mVarB = z3.d.b(companion4, (z3.a) objE8, null, 2, null);
                                    rVarH.R();
                                } else {
                                    rVarH.X(1794092431);
                                    rVarH.R();
                                    mVarB = f3.m.INSTANCE;
                                }
                                f3.m mVarU2 = mVarH2.u(mVarB);
                                q1<ij> q1VarD4 = hjVarY.d();
                                p143z0.a2 a2Var2 = p143z0.a2.Vertical;
                                if (i56 <= 256) {
                                }
                                objE6 = rVarH.E();
                                if (z29) {
                                    objE6 = new p() { // from class: f2.g1
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                        }
                                    };
                                    rVarH.v(objE6);
                                } else {
                                    objE6 = new p() { // from class: f2.g1
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                        }
                                    };
                                    rVarH.v(objE6);
                                }
                                f3.m mVarA2 = z0.a(mVarU2, q1VarD4, a2Var2, (p) objE6);
                                q1<ij> q1VarD5 = hjVarY.d();
                                if (z16) {
                                    z35 = false;
                                } else {
                                    z35 = false;
                                }
                                f3.m mVarB3 = n1Var2.b(mVarA2, q1VarD5, a2Var2, z35, false, jVar, null, rVarH, 12583296, 40);
                                zW2 = rVarH.W(strB);
                                objE7 = rVarH.E();
                                if (zW2) {
                                    objE7 = new l() { // from class: f2.h1
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return l1.G(strB, (n4.i0) obj);
                                        }
                                    };
                                    rVarH.v(objE7);
                                } else {
                                    objE7 = new l() { // from class: f2.h1
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return l1.G(strB, (n4.i0) obj);
                                        }
                                    };
                                    rVarH.v(objE7);
                                }
                                final hj hjVar4 = hjVarY;
                                final boolean z38 = z16;
                                final p pVar8 = pVarD;
                                int i610 = i55 >> 15;
                                androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB3, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j19, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.H(pVar6, f15, hjVar4, pVar8, aVar9, p0Var, z38, qVar, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54), rVarH, (i610 & 57344) | (i610 & 112) | 12582912 | (i610 & 896) | (i610 & 7168) | (458752 & (i68 << 15)), 64);
                                if (t.k()) {
                                    t.n();
                                }
                                rVar2 = rVarH;
                                f25 = fO;
                                z18 = z16;
                                pVar4 = pVarD;
                                aVar3 = aVar10;
                                y2Var2 = y2Var3;
                                j17 = j19;
                                mVar3 = mVar2;
                                hjVar2 = hjVarY;
                                f27 = fN;
                                pVar3 = pVar6;
                                f26 = fJ;
                                j18 = jE;
                            } else {
                                n1Var2 = n1Var;
                            }
                            z25 = true;
                            zW = zW3 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                            objE3 = rVarH.E();
                            if (zW) {
                                objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                                aVar6 = aVar5;
                                rVarH.v(objE3);
                            } else {
                                objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                                aVar6 = aVar5;
                                rVarH.v(objE3);
                            }
                            jVar = (j) objE3;
                            objE4 = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE4 == companion.a()) {
                                objE4 = Function0.i(tq.j.f191408a, rVarH);
                                rVarH.v(objE4);
                            }
                            p0Var = (p0) objE4;
                            if (i56 > 256) {
                                y2Var3 = y2VarK;
                                if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                            } else {
                                y2Var3 = y2VarK;
                                if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                            }
                            boolean zG3 = z26 | rVarH.G(p0Var);
                            if ((i55 & 7168) == 2048) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            z28 = zG3 | z27;
                            objE5 = rVarH.E();
                            if (z28) {
                                objE5 = new er.a() { // from class: f2.f1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.C(hjVarY, p0Var, aVar6);
                                    }
                                };
                                rVarH.v(objE5);
                            } else {
                                objE5 = new er.a() { // from class: f2.f1
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.C(hjVarY, p0Var, aVar6);
                                    }
                                };
                                rVarH.v(objE5);
                            }
                            final er.a aVar11 = (er.a) objE5;
                            er.a<i0> aVar12 = aVar6;
                            f3.m mVarH3 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                            if (z16) {
                                rVarH.X(1794077610);
                                f3.m.Companion companion5 = f3.m.INSTANCE;
                                if (i56 <= 256) {
                                }
                                objE8 = rVarH.E();
                                if (z36) {
                                    objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                    rVarH.v(objE8);
                                } else {
                                    objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                    rVarH.v(objE8);
                                }
                                mVarB = z3.d.b(companion5, (z3.a) objE8, null, 2, null);
                                rVarH.R();
                            } else {
                                rVarH.X(1794092431);
                                rVarH.R();
                                mVarB = f3.m.INSTANCE;
                            }
                            f3.m mVarU3 = mVarH3.u(mVarB);
                            q1<ij> q1VarD6 = hjVarY.d();
                            p143z0.a2 a2Var3 = p143z0.a2.Vertical;
                            if (i56 <= 256) {
                            }
                            objE6 = rVarH.E();
                            if (z29) {
                                objE6 = new p() { // from class: f2.g1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                    }
                                };
                                rVarH.v(objE6);
                            } else {
                                objE6 = new p() { // from class: f2.g1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                    }
                                };
                                rVarH.v(objE6);
                            }
                            f3.m mVarA3 = z0.a(mVarU3, q1VarD6, a2Var3, (p) objE6);
                            q1<ij> q1VarD7 = hjVarY.d();
                            if (z16) {
                                z35 = false;
                            } else {
                                z35 = false;
                            }
                            f3.m mVarB4 = n1Var2.b(mVarA3, q1VarD7, a2Var3, z35, false, jVar, null, rVarH, 12583296, 40);
                            zW2 = rVarH.W(strB);
                            objE7 = rVarH.E();
                            if (zW2) {
                                objE7 = new l() { // from class: f2.h1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return l1.G(strB, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE7);
                            } else {
                                objE7 = new l() { // from class: f2.h1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return l1.G(strB, (n4.i0) obj);
                                    }
                                };
                                rVarH.v(objE7);
                            }
                            final hj hjVar5 = hjVarY;
                            final boolean z39 = z16;
                            final p pVar9 = pVarD;
                            int i611 = i55 >> 15;
                            androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB4, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j19, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.H(pVar6, f15, hjVar5, pVar9, aVar11, p0Var, z39, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, (i611 & 57344) | (i611 & 112) | 12582912 | (i611 & 896) | (i611 & 7168) | (458752 & (i68 << 15)), 64);
                            if (t.k()) {
                                t.n();
                            }
                            rVar2 = rVarH;
                            f25 = fO;
                            z18 = z16;
                            pVar4 = pVarD;
                            aVar3 = aVar12;
                            y2Var2 = y2Var3;
                            j17 = j19;
                            mVar3 = mVar2;
                            hjVar2 = hjVarY;
                            f27 = fN;
                            pVar3 = pVar6;
                            f26 = fJ;
                            j18 = jE;
                        } else {
                            rVarH.O();
                            j17 = j15;
                            pVar3 = pVar2;
                            rVar2 = rVarH;
                            aVar3 = aVar2;
                            f25 = f19;
                            mVar3 = mVar2;
                            hjVar2 = hjVarY;
                            z18 = z16;
                            y2Var2 = y2Var;
                            j18 = j16;
                            f26 = f17;
                            f27 = f18;
                            pVar4 = pVar;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.j1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i39 |= 48;
                    if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                        i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
                    }
                    if ((i16 & 3072) != 0) {
                        i39 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i48 = i39;
                    if ((i35 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i35 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i35 &= -897;
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.z0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.z();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar4 = (er.a) objE;
                            } else {
                                aVar4 = aVar2;
                            }
                            if (i26 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f19;
                            }
                            if (i28 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i35 &= -3670017;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 128) != 0) {
                                i49 = i35 & (-29360129);
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                i49 = i35;
                                jI = j15;
                            }
                            if ((i17 & 256) != 0) {
                                jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                                i55 = i49 & (-234881025);
                            } else {
                                jE = j16;
                                i55 = i49;
                            }
                            if (i36 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f17;
                            }
                            if (i38 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f18;
                            }
                            if (i46 != 0) {
                                pVarD = k3.f56525a.d();
                            } else {
                                pVarD = pVar;
                            }
                            if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                                pVar5 = new p() { // from class: f2.d1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.A((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -897;
                            } else {
                                pVar5 = pVar2;
                            }
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i35 &= -897;
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.z0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.z();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar4 = (er.a) objE;
                            } else {
                                aVar4 = aVar2;
                            }
                            if (i26 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f19;
                            }
                            if (i28 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i35 &= -3670017;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 128) != 0) {
                                i49 = i35 & (-29360129);
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                i49 = i35;
                                jI = j15;
                            }
                            if ((i17 & 256) != 0) {
                                jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                                i55 = i49 & (-234881025);
                            } else {
                                jE = j16;
                                i55 = i49;
                            }
                            if (i36 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f17;
                            }
                            if (i38 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f18;
                            }
                            if (i46 != 0) {
                                pVarD = k3.f56525a.d();
                            } else {
                                pVarD = pVar;
                            }
                            if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                                pVar5 = new p() { // from class: f2.d1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.A((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -897;
                            } else {
                                pVar5 = pVar2;
                            }
                        }
                        rVarH.y();
                        aVar5 = aVar4;
                        if (t.k()) {
                            t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                        }
                        a2.Companion companion6 = a2.INSTANCE;
                        strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                        f3Var = (f3) rVarH.N(g1.u());
                        int i612 = i48;
                        final p pVar10 = pVar5;
                        j0 j0VarF2 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                        dVar = (c5.d) rVarH.N(g1.f());
                        n1Var = n1.f79921a;
                        q1<ij> q1VarD8 = hjVarY.d();
                        i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                        long j110 = jI;
                        if (i56 <= 256) {
                        }
                        objE2 = rVarH.E();
                        if (z19) {
                            objE2 = new l() { // from class: f2.e1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.e1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                                }
                            };
                            rVarH.v(objE2);
                        }
                        d3VarA = n1Var.a(q1VarD8, (l) objE2, j0VarF2, rVarH, 3072);
                        boolean zW4 = rVarH.W(d3VarA);
                        if (i56 > 256) {
                            n1Var2 = n1Var;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                        } else {
                            n1Var2 = n1Var;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                        }
                        zW = zW4 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                            aVar6 = aVar5;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                            aVar6 = aVar5;
                            rVarH.v(objE3);
                        }
                        jVar = (j) objE3;
                        objE4 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        if (i56 > 256) {
                            y2Var3 = y2VarK;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        } else {
                            y2Var3 = y2VarK;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        }
                        boolean zG4 = z26 | rVarH.G(p0Var);
                        if ((i55 & 7168) == 2048) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = zG4 | z27;
                        objE5 = rVarH.E();
                        if (z28) {
                            objE5 = new er.a() { // from class: f2.f1
                                @Override // er.a
                                public final Object a() {
                                    return l1.C(hjVarY, p0Var, aVar6);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.f1
                                @Override // er.a
                                public final Object a() {
                                    return l1.C(hjVarY, p0Var, aVar6);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        final er.a aVar13 = (er.a) objE5;
                        er.a<i0> aVar14 = aVar6;
                        f3.m mVarH4 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                        if (z16) {
                            rVarH.X(1794077610);
                            f3.m.Companion companion7 = f3.m.INSTANCE;
                            if (i56 <= 256) {
                            }
                            objE8 = rVarH.E();
                            if (z36) {
                                objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                rVarH.v(objE8);
                            } else {
                                objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                rVarH.v(objE8);
                            }
                            mVarB = z3.d.b(companion7, (z3.a) objE8, null, 2, null);
                            rVarH.R();
                        } else {
                            rVarH.X(1794092431);
                            rVarH.R();
                            mVarB = f3.m.INSTANCE;
                        }
                        f3.m mVarU4 = mVarH4.u(mVarB);
                        q1<ij> q1VarD9 = hjVarY.d();
                        p143z0.a2 a2Var4 = p143z0.a2.Vertical;
                        if (i56 <= 256) {
                        }
                        objE6 = rVarH.E();
                        if (z29) {
                            objE6 = new p() { // from class: f2.g1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                }
                            };
                            rVarH.v(objE6);
                        } else {
                            objE6 = new p() { // from class: f2.g1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                }
                            };
                            rVarH.v(objE6);
                        }
                        f3.m mVarA4 = z0.a(mVarU4, q1VarD9, a2Var4, (p) objE6);
                        q1<ij> q1VarD10 = hjVarY.d();
                        if (z16) {
                            z35 = false;
                        } else {
                            z35 = false;
                        }
                        f3.m mVarB5 = n1Var2.b(mVarA4, q1VarD10, a2Var4, z35, false, jVar, null, rVarH, 12583296, 40);
                        zW2 = rVarH.W(strB);
                        objE7 = rVarH.E();
                        if (zW2) {
                            objE7 = new l() { // from class: f2.h1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return l1.G(strB, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE7);
                        } else {
                            objE7 = new l() { // from class: f2.h1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return l1.G(strB, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE7);
                        }
                        final hj hjVar6 = hjVarY;
                        final boolean z310 = z16;
                        final p pVar11 = pVarD;
                        int i613 = i55 >> 15;
                        androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB5, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j110, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.H(pVar10, f15, hjVar6, pVar11, aVar13, p0Var, z310, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i613 & 57344) | (i613 & 112) | 12582912 | (i613 & 896) | (i613 & 7168) | (458752 & (i612 << 15)), 64);
                        if (t.k()) {
                            t.n();
                        }
                        rVar2 = rVarH;
                        f25 = fO;
                        z18 = z16;
                        pVar4 = pVarD;
                        aVar3 = aVar14;
                        y2Var2 = y2Var3;
                        j17 = j110;
                        mVar3 = mVar2;
                        hjVar2 = hjVarY;
                        f27 = fN;
                        pVar3 = pVar10;
                        f26 = fJ;
                        j18 = jE;
                    } else {
                        rVarH.O();
                        j17 = j15;
                        pVar3 = pVar2;
                        rVar2 = rVarH;
                        aVar3 = aVar2;
                        f25 = f19;
                        mVar3 = mVar2;
                        hjVar2 = hjVarY;
                        z18 = z16;
                        y2Var2 = y2Var;
                        j18 = j16;
                        f26 = f17;
                        f27 = f18;
                        pVar4 = pVar;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.j1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 24576;
                f19 = f16;
                i28 = i17 & 32;
                if (i28 != 0) {
                    i18 |= 196608;
                    z16 = z15;
                } else {
                    z16 = z15;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.a(z16)) {
                            i29 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i29 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i29;
                    }
                }
                if ((i15 & 1572864) != 0) {
                    if ((i17 & 64) == 0) {
                        i59 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i59 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i59;
                }
                if ((i15 & 12582912) == 0) {
                    if ((i17 & 128) == 0) {
                        i58 = i18;
                        if (rVarH.d(j15)) {
                        }
                        i35 = i58 | i67;
                    } else {
                        i58 = i18;
                    }
                    i35 = i58 | i67;
                } else {
                    i35 = i18;
                }
                if ((i15 & 100663296) != 0) {
                    if ((i17 & 256) == 0) {
                        i57 = 33554432;
                    } else {
                        i57 = 33554432;
                    }
                    i35 |= i57;
                }
                i36 = i17 & 512;
                if (i36 != 0) {
                    i35 |= 805306368;
                } else if ((i15 & 805306368) == 0) {
                    if (rVarH.b(f17)) {
                        i37 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i37 = 268435456;
                    }
                    i35 |= i37;
                }
                i38 = i17 & 1024;
                if (i38 != 0) {
                    i39 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.b(f18)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i39 = i16 | i45;
                } else {
                    i39 = i16;
                }
                i46 = i17 & 2048;
                if (i46 != 0) {
                    if ((i16 & 48) == 0) {
                        if (rVarH.G(pVar)) {
                            i47 = 32;
                        } else {
                            i47 = 16;
                        }
                        i39 |= i47;
                    }
                    if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                        i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
                    }
                    if ((i16 & 3072) != 0) {
                        i39 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i48 = i39;
                    if ((i35 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i35 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i35 &= -897;
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.z0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.z();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar4 = (er.a) objE;
                            } else {
                                aVar4 = aVar2;
                            }
                            if (i26 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f19;
                            }
                            if (i28 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i35 &= -3670017;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 128) != 0) {
                                i49 = i35 & (-29360129);
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                i49 = i35;
                                jI = j15;
                            }
                            if ((i17 & 256) != 0) {
                                jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                                i55 = i49 & (-234881025);
                            } else {
                                jE = j16;
                                i55 = i49;
                            }
                            if (i36 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f17;
                            }
                            if (i38 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f18;
                            }
                            if (i46 != 0) {
                                pVarD = k3.f56525a.d();
                            } else {
                                pVarD = pVar;
                            }
                            if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                                pVar5 = new p() { // from class: f2.d1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.A((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -897;
                            } else {
                                pVar5 = pVar2;
                            }
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i35 &= -897;
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.z0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.z();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar4 = (er.a) objE;
                            } else {
                                aVar4 = aVar2;
                            }
                            if (i26 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f19;
                            }
                            if (i28 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i35 &= -3670017;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 128) != 0) {
                                i49 = i35 & (-29360129);
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                i49 = i35;
                                jI = j15;
                            }
                            if ((i17 & 256) != 0) {
                                jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                                i55 = i49 & (-234881025);
                            } else {
                                jE = j16;
                                i55 = i49;
                            }
                            if (i36 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f17;
                            }
                            if (i38 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f18;
                            }
                            if (i46 != 0) {
                                pVarD = k3.f56525a.d();
                            } else {
                                pVarD = pVar;
                            }
                            if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                                pVar5 = new p() { // from class: f2.d1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.A((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -897;
                            } else {
                                pVar5 = pVar2;
                            }
                        }
                        rVarH.y();
                        aVar5 = aVar4;
                        if (t.k()) {
                            t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                        }
                        a2.Companion companion8 = a2.INSTANCE;
                        strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                        f3Var = (f3) rVarH.N(g1.u());
                        int i614 = i48;
                        final p pVar12 = pVar5;
                        j0 j0VarF3 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                        dVar = (c5.d) rVarH.N(g1.f());
                        n1Var = n1.f79921a;
                        q1<ij> q1VarD11 = hjVarY.d();
                        i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                        long j111 = jI;
                        if (i56 <= 256) {
                        }
                        objE2 = rVarH.E();
                        if (z19) {
                            objE2 = new l() { // from class: f2.e1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.e1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                                }
                            };
                            rVarH.v(objE2);
                        }
                        d3VarA = n1Var.a(q1VarD11, (l) objE2, j0VarF3, rVarH, 3072);
                        boolean zW5 = rVarH.W(d3VarA);
                        if (i56 > 256) {
                            n1Var2 = n1Var;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                        } else {
                            n1Var2 = n1Var;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                        }
                        zW = zW5 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                            aVar6 = aVar5;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                            aVar6 = aVar5;
                            rVarH.v(objE3);
                        }
                        jVar = (j) objE3;
                        objE4 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        if (i56 > 256) {
                            y2Var3 = y2VarK;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        } else {
                            y2Var3 = y2VarK;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        }
                        boolean zG5 = z26 | rVarH.G(p0Var);
                        if ((i55 & 7168) == 2048) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = zG5 | z27;
                        objE5 = rVarH.E();
                        if (z28) {
                            objE5 = new er.a() { // from class: f2.f1
                                @Override // er.a
                                public final Object a() {
                                    return l1.C(hjVarY, p0Var, aVar6);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.f1
                                @Override // er.a
                                public final Object a() {
                                    return l1.C(hjVarY, p0Var, aVar6);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        final er.a aVar15 = (er.a) objE5;
                        er.a<i0> aVar16 = aVar6;
                        f3.m mVarH5 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                        if (z16) {
                            rVarH.X(1794077610);
                            f3.m.Companion companion9 = f3.m.INSTANCE;
                            if (i56 <= 256) {
                            }
                            objE8 = rVarH.E();
                            if (z36) {
                                objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                rVarH.v(objE8);
                            } else {
                                objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                rVarH.v(objE8);
                            }
                            mVarB = z3.d.b(companion9, (z3.a) objE8, null, 2, null);
                            rVarH.R();
                        } else {
                            rVarH.X(1794092431);
                            rVarH.R();
                            mVarB = f3.m.INSTANCE;
                        }
                        f3.m mVarU5 = mVarH5.u(mVarB);
                        q1<ij> q1VarD12 = hjVarY.d();
                        p143z0.a2 a2Var5 = p143z0.a2.Vertical;
                        if (i56 <= 256) {
                        }
                        objE6 = rVarH.E();
                        if (z29) {
                            objE6 = new p() { // from class: f2.g1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                }
                            };
                            rVarH.v(objE6);
                        } else {
                            objE6 = new p() { // from class: f2.g1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                }
                            };
                            rVarH.v(objE6);
                        }
                        f3.m mVarA5 = z0.a(mVarU5, q1VarD12, a2Var5, (p) objE6);
                        q1<ij> q1VarD13 = hjVarY.d();
                        if (z16) {
                            z35 = false;
                        } else {
                            z35 = false;
                        }
                        f3.m mVarB6 = n1Var2.b(mVarA5, q1VarD13, a2Var5, z35, false, jVar, null, rVarH, 12583296, 40);
                        zW2 = rVarH.W(strB);
                        objE7 = rVarH.E();
                        if (zW2) {
                            objE7 = new l() { // from class: f2.h1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return l1.G(strB, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE7);
                        } else {
                            objE7 = new l() { // from class: f2.h1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return l1.G(strB, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE7);
                        }
                        final hj hjVar7 = hjVarY;
                        final boolean z311 = z16;
                        final p pVar13 = pVarD;
                        int i615 = i55 >> 15;
                        androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB6, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j111, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.H(pVar12, f15, hjVar7, pVar13, aVar15, p0Var, z311, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i615 & 57344) | (i615 & 112) | 12582912 | (i615 & 896) | (i615 & 7168) | (458752 & (i614 << 15)), 64);
                        if (t.k()) {
                            t.n();
                        }
                        rVar2 = rVarH;
                        f25 = fO;
                        z18 = z16;
                        pVar4 = pVarD;
                        aVar3 = aVar16;
                        y2Var2 = y2Var3;
                        j17 = j111;
                        mVar3 = mVar2;
                        hjVar2 = hjVarY;
                        f27 = fN;
                        pVar3 = pVar12;
                        f26 = fJ;
                        j18 = jE;
                    } else {
                        rVarH.O();
                        j17 = j15;
                        pVar3 = pVar2;
                        rVar2 = rVarH;
                        aVar3 = aVar2;
                        f25 = f19;
                        mVar3 = mVar2;
                        hjVar2 = hjVarY;
                        z18 = z16;
                        y2Var2 = y2Var;
                        j18 = j16;
                        f26 = f17;
                        f27 = f18;
                        pVar4 = pVar;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.j1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i39 |= 48;
                if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                    i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
                }
                if ((i16 & 3072) != 0) {
                    i39 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i48 = i39;
                if ((i35 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i35 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i35 &= -897;
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.z0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.z();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i26 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f19;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i35 &= -3670017;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 128) != 0) {
                            i49 = i35 & (-29360129);
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            i49 = i35;
                            jI = j15;
                        }
                        if ((i17 & 256) != 0) {
                            jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                            i55 = i49 & (-234881025);
                        } else {
                            jE = j16;
                            i55 = i49;
                        }
                        if (i36 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f17;
                        }
                        if (i38 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f18;
                        }
                        if (i46 != 0) {
                            pVarD = k3.f56525a.d();
                        } else {
                            pVarD = pVar;
                        }
                        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                            pVar5 = new p() { // from class: f2.d1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.A((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -897;
                        } else {
                            pVar5 = pVar2;
                        }
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i35 &= -897;
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.z0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.z();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i26 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f19;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i35 &= -3670017;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 128) != 0) {
                            i49 = i35 & (-29360129);
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            i49 = i35;
                            jI = j15;
                        }
                        if ((i17 & 256) != 0) {
                            jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                            i55 = i49 & (-234881025);
                        } else {
                            jE = j16;
                            i55 = i49;
                        }
                        if (i36 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f17;
                        }
                        if (i38 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f18;
                        }
                        if (i46 != 0) {
                            pVarD = k3.f56525a.d();
                        } else {
                            pVarD = pVar;
                        }
                        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                            pVar5 = new p() { // from class: f2.d1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.A((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -897;
                        } else {
                            pVar5 = pVar2;
                        }
                    }
                    rVarH.y();
                    aVar5 = aVar4;
                    if (t.k()) {
                        t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                    }
                    a2.Companion companion10 = a2.INSTANCE;
                    strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                    f3Var = (f3) rVarH.N(g1.u());
                    int i616 = i48;
                    final p pVar14 = pVar5;
                    j0 j0VarF4 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                    dVar = (c5.d) rVarH.N(g1.f());
                    n1Var = n1.f79921a;
                    q1<ij> q1VarD14 = hjVarY.d();
                    i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                    long j112 = jI;
                    if (i56 <= 256) {
                    }
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new l() { // from class: f2.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                            }
                        };
                        rVarH.v(objE2);
                    }
                    d3VarA = n1Var.a(q1VarD14, (l) objE2, j0VarF4, rVarH, 3072);
                    boolean zW6 = rVarH.W(d3VarA);
                    if (i56 > 256) {
                        n1Var2 = n1Var;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    } else {
                        n1Var2 = n1Var;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    }
                    zW = zW6 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                        aVar6 = aVar5;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                        aVar6 = aVar5;
                        rVarH.v(objE3);
                    }
                    jVar = (j) objE3;
                    objE4 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    if (i56 > 256) {
                        y2Var3 = y2VarK;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        y2Var3 = y2VarK;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    }
                    boolean zG6 = z26 | rVarH.G(p0Var);
                    if ((i55 & 7168) == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = zG6 | z27;
                    objE5 = rVarH.E();
                    if (z28) {
                        objE5 = new er.a() { // from class: f2.f1
                            @Override // er.a
                            public final Object a() {
                                return l1.C(hjVarY, p0Var, aVar6);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.f1
                            @Override // er.a
                            public final Object a() {
                                return l1.C(hjVarY, p0Var, aVar6);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    final er.a aVar17 = (er.a) objE5;
                    er.a<i0> aVar18 = aVar6;
                    f3.m mVarH6 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                    if (z16) {
                        rVarH.X(1794077610);
                        f3.m.Companion companion11 = f3.m.INSTANCE;
                        if (i56 <= 256) {
                        }
                        objE8 = rVarH.E();
                        if (z36) {
                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                            rVarH.v(objE8);
                        } else {
                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                            rVarH.v(objE8);
                        }
                        mVarB = z3.d.b(companion11, (z3.a) objE8, null, 2, null);
                        rVarH.R();
                    } else {
                        rVarH.X(1794092431);
                        rVarH.R();
                        mVarB = f3.m.INSTANCE;
                    }
                    f3.m mVarU6 = mVarH6.u(mVarB);
                    q1<ij> q1VarD15 = hjVarY.d();
                    p143z0.a2 a2Var6 = p143z0.a2.Vertical;
                    if (i56 <= 256) {
                    }
                    objE6 = rVarH.E();
                    if (z29) {
                        objE6 = new p() { // from class: f2.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    } else {
                        objE6 = new p() { // from class: f2.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    }
                    f3.m mVarA6 = z0.a(mVarU6, q1VarD15, a2Var6, (p) objE6);
                    q1<ij> q1VarD16 = hjVarY.d();
                    if (z16) {
                        z35 = false;
                    } else {
                        z35 = false;
                    }
                    f3.m mVarB7 = n1Var2.b(mVarA6, q1VarD16, a2Var6, z35, false, jVar, null, rVarH, 12583296, 40);
                    zW2 = rVarH.W(strB);
                    objE7 = rVarH.E();
                    if (zW2) {
                        objE7 = new l() { // from class: f2.h1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return l1.G(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE7);
                    } else {
                        objE7 = new l() { // from class: f2.h1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return l1.G(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE7);
                    }
                    final hj hjVar8 = hjVarY;
                    final boolean z312 = z16;
                    final p pVar15 = pVarD;
                    int i617 = i55 >> 15;
                    androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB7, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j112, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.H(pVar14, f15, hjVar8, pVar15, aVar17, p0Var, z312, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i617 & 57344) | (i617 & 112) | 12582912 | (i617 & 896) | (i617 & 7168) | (458752 & (i616 << 15)), 64);
                    if (t.k()) {
                        t.n();
                    }
                    rVar2 = rVarH;
                    f25 = fO;
                    z18 = z16;
                    pVar4 = pVarD;
                    aVar3 = aVar18;
                    y2Var2 = y2Var3;
                    j17 = j112;
                    mVar3 = mVar2;
                    hjVar2 = hjVarY;
                    f27 = fN;
                    pVar3 = pVar14;
                    f26 = fJ;
                    j18 = jE;
                } else {
                    rVarH.O();
                    j17 = j15;
                    pVar3 = pVar2;
                    rVar2 = rVarH;
                    aVar3 = aVar2;
                    f25 = f19;
                    mVar3 = mVar2;
                    hjVar2 = hjVarY;
                    z18 = z16;
                    y2Var2 = y2Var;
                    j18 = j16;
                    f26 = f17;
                    f27 = f18;
                    pVar4 = pVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.j1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 3072;
            aVar2 = aVar;
            i26 = i17 & 16;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    f19 = f16;
                    if (rVarH.b(f19)) {
                        i27 = 16384;
                    } else {
                        i27 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i27;
                }
                i28 = i17 & 32;
                if (i28 != 0) {
                    i18 |= 196608;
                    z16 = z15;
                } else {
                    z16 = z15;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.a(z16)) {
                            i29 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i29 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i29;
                    }
                }
                if ((i15 & 1572864) != 0) {
                    if ((i17 & 64) == 0) {
                        i59 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i59 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i59;
                }
                if ((i15 & 12582912) == 0) {
                    if ((i17 & 128) == 0) {
                        i58 = i18;
                        if (rVarH.d(j15)) {
                        }
                        i35 = i58 | i67;
                    } else {
                        i58 = i18;
                    }
                    i35 = i58 | i67;
                } else {
                    i35 = i18;
                }
                if ((i15 & 100663296) != 0) {
                    if ((i17 & 256) == 0) {
                        i57 = 33554432;
                    } else {
                        i57 = 33554432;
                    }
                    i35 |= i57;
                }
                i36 = i17 & 512;
                if (i36 != 0) {
                    i35 |= 805306368;
                } else if ((i15 & 805306368) == 0) {
                    if (rVarH.b(f17)) {
                        i37 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i37 = 268435456;
                    }
                    i35 |= i37;
                }
                i38 = i17 & 1024;
                if (i38 != 0) {
                    i39 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.b(f18)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i39 = i16 | i45;
                } else {
                    i39 = i16;
                }
                i46 = i17 & 2048;
                if (i46 != 0) {
                    if ((i16 & 48) == 0) {
                        if (rVarH.G(pVar)) {
                            i47 = 32;
                        } else {
                            i47 = 16;
                        }
                        i39 |= i47;
                    }
                    if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                        i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
                    }
                    if ((i16 & 3072) != 0) {
                        i39 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i48 = i39;
                    if ((i35 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i35 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i35 &= -897;
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.z0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.z();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar4 = (er.a) objE;
                            } else {
                                aVar4 = aVar2;
                            }
                            if (i26 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f19;
                            }
                            if (i28 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i35 &= -3670017;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 128) != 0) {
                                i49 = i35 & (-29360129);
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                i49 = i35;
                                jI = j15;
                            }
                            if ((i17 & 256) != 0) {
                                jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                                i55 = i49 & (-234881025);
                            } else {
                                jE = j16;
                                i55 = i49;
                            }
                            if (i36 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f17;
                            }
                            if (i38 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f18;
                            }
                            if (i46 != 0) {
                                pVarD = k3.f56525a.d();
                            } else {
                                pVarD = pVar;
                            }
                            if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                                pVar5 = new p() { // from class: f2.d1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.A((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -897;
                            } else {
                                pVar5 = pVar2;
                            }
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i35 &= -897;
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.z0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.z();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar4 = (er.a) objE;
                            } else {
                                aVar4 = aVar2;
                            }
                            if (i26 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f19;
                            }
                            if (i28 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i35 &= -3670017;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 128) != 0) {
                                i49 = i35 & (-29360129);
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                i49 = i35;
                                jI = j15;
                            }
                            if ((i17 & 256) != 0) {
                                jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                                i55 = i49 & (-234881025);
                            } else {
                                jE = j16;
                                i55 = i49;
                            }
                            if (i36 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f17;
                            }
                            if (i38 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f18;
                            }
                            if (i46 != 0) {
                                pVarD = k3.f56525a.d();
                            } else {
                                pVarD = pVar;
                            }
                            if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                                pVar5 = new p() { // from class: f2.d1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.A((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -897;
                            } else {
                                pVar5 = pVar2;
                            }
                        }
                        rVarH.y();
                        aVar5 = aVar4;
                        if (t.k()) {
                            t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                        }
                        a2.Companion companion12 = a2.INSTANCE;
                        strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                        f3Var = (f3) rVarH.N(g1.u());
                        int i618 = i48;
                        final p pVar16 = pVar5;
                        j0 j0VarF5 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                        dVar = (c5.d) rVarH.N(g1.f());
                        n1Var = n1.f79921a;
                        q1<ij> q1VarD17 = hjVarY.d();
                        i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                        long j113 = jI;
                        if (i56 <= 256) {
                        }
                        objE2 = rVarH.E();
                        if (z19) {
                            objE2 = new l() { // from class: f2.e1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.e1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                                }
                            };
                            rVarH.v(objE2);
                        }
                        d3VarA = n1Var.a(q1VarD17, (l) objE2, j0VarF5, rVarH, 3072);
                        boolean zW7 = rVarH.W(d3VarA);
                        if (i56 > 256) {
                            n1Var2 = n1Var;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                        } else {
                            n1Var2 = n1Var;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                        }
                        zW = zW7 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                            aVar6 = aVar5;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                            aVar6 = aVar5;
                            rVarH.v(objE3);
                        }
                        jVar = (j) objE3;
                        objE4 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        if (i56 > 256) {
                            y2Var3 = y2VarK;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        } else {
                            y2Var3 = y2VarK;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        }
                        boolean zG7 = z26 | rVarH.G(p0Var);
                        if ((i55 & 7168) == 2048) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = zG7 | z27;
                        objE5 = rVarH.E();
                        if (z28) {
                            objE5 = new er.a() { // from class: f2.f1
                                @Override // er.a
                                public final Object a() {
                                    return l1.C(hjVarY, p0Var, aVar6);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.f1
                                @Override // er.a
                                public final Object a() {
                                    return l1.C(hjVarY, p0Var, aVar6);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        final er.a aVar19 = (er.a) objE5;
                        er.a<i0> aVar110 = aVar6;
                        f3.m mVarH7 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                        if (z16) {
                            rVarH.X(1794077610);
                            f3.m.Companion companion13 = f3.m.INSTANCE;
                            if (i56 <= 256) {
                            }
                            objE8 = rVarH.E();
                            if (z36) {
                                objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                rVarH.v(objE8);
                            } else {
                                objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                rVarH.v(objE8);
                            }
                            mVarB = z3.d.b(companion13, (z3.a) objE8, null, 2, null);
                            rVarH.R();
                        } else {
                            rVarH.X(1794092431);
                            rVarH.R();
                            mVarB = f3.m.INSTANCE;
                        }
                        f3.m mVarU7 = mVarH7.u(mVarB);
                        q1<ij> q1VarD18 = hjVarY.d();
                        p143z0.a2 a2Var7 = p143z0.a2.Vertical;
                        if (i56 <= 256) {
                        }
                        objE6 = rVarH.E();
                        if (z29) {
                            objE6 = new p() { // from class: f2.g1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                }
                            };
                            rVarH.v(objE6);
                        } else {
                            objE6 = new p() { // from class: f2.g1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                }
                            };
                            rVarH.v(objE6);
                        }
                        f3.m mVarA7 = z0.a(mVarU7, q1VarD18, a2Var7, (p) objE6);
                        q1<ij> q1VarD19 = hjVarY.d();
                        if (z16) {
                            z35 = false;
                        } else {
                            z35 = false;
                        }
                        f3.m mVarB8 = n1Var2.b(mVarA7, q1VarD19, a2Var7, z35, false, jVar, null, rVarH, 12583296, 40);
                        zW2 = rVarH.W(strB);
                        objE7 = rVarH.E();
                        if (zW2) {
                            objE7 = new l() { // from class: f2.h1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return l1.G(strB, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE7);
                        } else {
                            objE7 = new l() { // from class: f2.h1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return l1.G(strB, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE7);
                        }
                        final hj hjVar9 = hjVarY;
                        final boolean z313 = z16;
                        final p pVar17 = pVarD;
                        int i619 = i55 >> 15;
                        androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB8, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j113, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.H(pVar16, f15, hjVar9, pVar17, aVar19, p0Var, z313, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i619 & 57344) | (i619 & 112) | 12582912 | (i619 & 896) | (i619 & 7168) | (458752 & (i618 << 15)), 64);
                        if (t.k()) {
                            t.n();
                        }
                        rVar2 = rVarH;
                        f25 = fO;
                        z18 = z16;
                        pVar4 = pVarD;
                        aVar3 = aVar110;
                        y2Var2 = y2Var3;
                        j17 = j113;
                        mVar3 = mVar2;
                        hjVar2 = hjVarY;
                        f27 = fN;
                        pVar3 = pVar16;
                        f26 = fJ;
                        j18 = jE;
                    } else {
                        rVarH.O();
                        j17 = j15;
                        pVar3 = pVar2;
                        rVar2 = rVarH;
                        aVar3 = aVar2;
                        f25 = f19;
                        mVar3 = mVar2;
                        hjVar2 = hjVarY;
                        z18 = z16;
                        y2Var2 = y2Var;
                        j18 = j16;
                        f26 = f17;
                        f27 = f18;
                        pVar4 = pVar;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.j1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i39 |= 48;
                if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                    i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
                }
                if ((i16 & 3072) != 0) {
                    i39 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i48 = i39;
                if ((i35 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i35 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i35 &= -897;
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.z0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.z();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i26 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f19;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i35 &= -3670017;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 128) != 0) {
                            i49 = i35 & (-29360129);
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            i49 = i35;
                            jI = j15;
                        }
                        if ((i17 & 256) != 0) {
                            jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                            i55 = i49 & (-234881025);
                        } else {
                            jE = j16;
                            i55 = i49;
                        }
                        if (i36 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f17;
                        }
                        if (i38 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f18;
                        }
                        if (i46 != 0) {
                            pVarD = k3.f56525a.d();
                        } else {
                            pVarD = pVar;
                        }
                        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                            pVar5 = new p() { // from class: f2.d1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.A((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -897;
                        } else {
                            pVar5 = pVar2;
                        }
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i35 &= -897;
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.z0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.z();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i26 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f19;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i35 &= -3670017;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 128) != 0) {
                            i49 = i35 & (-29360129);
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            i49 = i35;
                            jI = j15;
                        }
                        if ((i17 & 256) != 0) {
                            jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                            i55 = i49 & (-234881025);
                        } else {
                            jE = j16;
                            i55 = i49;
                        }
                        if (i36 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f17;
                        }
                        if (i38 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f18;
                        }
                        if (i46 != 0) {
                            pVarD = k3.f56525a.d();
                        } else {
                            pVarD = pVar;
                        }
                        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                            pVar5 = new p() { // from class: f2.d1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.A((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -897;
                        } else {
                            pVar5 = pVar2;
                        }
                    }
                    rVarH.y();
                    aVar5 = aVar4;
                    if (t.k()) {
                        t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                    }
                    a2.Companion companion14 = a2.INSTANCE;
                    strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                    f3Var = (f3) rVarH.N(g1.u());
                    int i6110 = i48;
                    final p pVar18 = pVar5;
                    j0 j0VarF6 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                    dVar = (c5.d) rVarH.N(g1.f());
                    n1Var = n1.f79921a;
                    q1<ij> q1VarD110 = hjVarY.d();
                    i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                    long j114 = jI;
                    if (i56 <= 256) {
                    }
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new l() { // from class: f2.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                            }
                        };
                        rVarH.v(objE2);
                    }
                    d3VarA = n1Var.a(q1VarD110, (l) objE2, j0VarF6, rVarH, 3072);
                    boolean zW8 = rVarH.W(d3VarA);
                    if (i56 > 256) {
                        n1Var2 = n1Var;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    } else {
                        n1Var2 = n1Var;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    }
                    zW = zW8 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                        aVar6 = aVar5;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                        aVar6 = aVar5;
                        rVarH.v(objE3);
                    }
                    jVar = (j) objE3;
                    objE4 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    if (i56 > 256) {
                        y2Var3 = y2VarK;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        y2Var3 = y2VarK;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    }
                    boolean zG8 = z26 | rVarH.G(p0Var);
                    if ((i55 & 7168) == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = zG8 | z27;
                    objE5 = rVarH.E();
                    if (z28) {
                        objE5 = new er.a() { // from class: f2.f1
                            @Override // er.a
                            public final Object a() {
                                return l1.C(hjVarY, p0Var, aVar6);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.f1
                            @Override // er.a
                            public final Object a() {
                                return l1.C(hjVarY, p0Var, aVar6);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    final er.a aVar111 = (er.a) objE5;
                    er.a<i0> aVar112 = aVar6;
                    f3.m mVarH8 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                    if (z16) {
                        rVarH.X(1794077610);
                        f3.m.Companion companion15 = f3.m.INSTANCE;
                        if (i56 <= 256) {
                        }
                        objE8 = rVarH.E();
                        if (z36) {
                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                            rVarH.v(objE8);
                        } else {
                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                            rVarH.v(objE8);
                        }
                        mVarB = z3.d.b(companion15, (z3.a) objE8, null, 2, null);
                        rVarH.R();
                    } else {
                        rVarH.X(1794092431);
                        rVarH.R();
                        mVarB = f3.m.INSTANCE;
                    }
                    f3.m mVarU8 = mVarH8.u(mVarB);
                    q1<ij> q1VarD111 = hjVarY.d();
                    p143z0.a2 a2Var8 = p143z0.a2.Vertical;
                    if (i56 <= 256) {
                    }
                    objE6 = rVarH.E();
                    if (z29) {
                        objE6 = new p() { // from class: f2.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    } else {
                        objE6 = new p() { // from class: f2.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    }
                    f3.m mVarA8 = z0.a(mVarU8, q1VarD111, a2Var8, (p) objE6);
                    q1<ij> q1VarD112 = hjVarY.d();
                    if (z16) {
                        z35 = false;
                    } else {
                        z35 = false;
                    }
                    f3.m mVarB9 = n1Var2.b(mVarA8, q1VarD112, a2Var8, z35, false, jVar, null, rVarH, 12583296, 40);
                    zW2 = rVarH.W(strB);
                    objE7 = rVarH.E();
                    if (zW2) {
                        objE7 = new l() { // from class: f2.h1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return l1.G(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE7);
                    } else {
                        objE7 = new l() { // from class: f2.h1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return l1.G(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE7);
                    }
                    final hj hjVar10 = hjVarY;
                    final boolean z314 = z16;
                    final p pVar19 = pVarD;
                    int i6111 = i55 >> 15;
                    androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB9, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j114, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.H(pVar18, f15, hjVar10, pVar19, aVar111, p0Var, z314, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i6111 & 57344) | (i6111 & 112) | 12582912 | (i6111 & 896) | (i6111 & 7168) | (458752 & (i6110 << 15)), 64);
                    if (t.k()) {
                        t.n();
                    }
                    rVar2 = rVarH;
                    f25 = fO;
                    z18 = z16;
                    pVar4 = pVarD;
                    aVar3 = aVar112;
                    y2Var2 = y2Var3;
                    j17 = j114;
                    mVar3 = mVar2;
                    hjVar2 = hjVarY;
                    f27 = fN;
                    pVar3 = pVar18;
                    f26 = fJ;
                    j18 = jE;
                } else {
                    rVarH.O();
                    j17 = j15;
                    pVar3 = pVar2;
                    rVar2 = rVarH;
                    aVar3 = aVar2;
                    f25 = f19;
                    mVar3 = mVar2;
                    hjVar2 = hjVarY;
                    z18 = z16;
                    y2Var2 = y2Var;
                    j18 = j16;
                    f26 = f17;
                    f27 = f18;
                    pVar4 = pVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.j1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            f19 = f16;
            i28 = i17 & 32;
            if (i28 != 0) {
                i18 |= 196608;
                z16 = z15;
            } else {
                z16 = z15;
                if ((i15 & 196608) == 0) {
                    if (rVarH.a(z16)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i29 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i29;
                }
            }
            if ((i15 & 1572864) != 0) {
                if ((i17 & 64) == 0) {
                    i59 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i59 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i59;
            }
            if ((i15 & 12582912) == 0) {
                if ((i17 & 128) == 0) {
                    i58 = i18;
                    if (rVarH.d(j15)) {
                    }
                    i35 = i58 | i67;
                } else {
                    i58 = i18;
                }
                i35 = i58 | i67;
            } else {
                i35 = i18;
            }
            if ((i15 & 100663296) != 0) {
                if ((i17 & 256) == 0) {
                    i57 = 33554432;
                } else {
                    i57 = 33554432;
                }
                i35 |= i57;
            }
            i36 = i17 & 512;
            if (i36 != 0) {
                i35 |= 805306368;
            } else if ((i15 & 805306368) == 0) {
                if (rVarH.b(f17)) {
                    i37 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i37 = 268435456;
                }
                i35 |= i37;
            }
            i38 = i17 & 1024;
            if (i38 != 0) {
                i39 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.b(f18)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i39 = i16 | i45;
            } else {
                i39 = i16;
            }
            i46 = i17 & 2048;
            if (i46 != 0) {
                if ((i16 & 48) == 0) {
                    if (rVarH.G(pVar)) {
                        i47 = 32;
                    } else {
                        i47 = 16;
                    }
                    i39 |= i47;
                }
                if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                    i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
                }
                if ((i16 & 3072) != 0) {
                    i39 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i48 = i39;
                if ((i35 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i35 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i35 &= -897;
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.z0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.z();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i26 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f19;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i35 &= -3670017;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 128) != 0) {
                            i49 = i35 & (-29360129);
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            i49 = i35;
                            jI = j15;
                        }
                        if ((i17 & 256) != 0) {
                            jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                            i55 = i49 & (-234881025);
                        } else {
                            jE = j16;
                            i55 = i49;
                        }
                        if (i36 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f17;
                        }
                        if (i38 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f18;
                        }
                        if (i46 != 0) {
                            pVarD = k3.f56525a.d();
                        } else {
                            pVarD = pVar;
                        }
                        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                            pVar5 = new p() { // from class: f2.d1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.A((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -897;
                        } else {
                            pVar5 = pVar2;
                        }
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i35 &= -897;
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.z0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.z();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i26 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f19;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i35 &= -3670017;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 128) != 0) {
                            i49 = i35 & (-29360129);
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            i49 = i35;
                            jI = j15;
                        }
                        if ((i17 & 256) != 0) {
                            jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                            i55 = i49 & (-234881025);
                        } else {
                            jE = j16;
                            i55 = i49;
                        }
                        if (i36 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f17;
                        }
                        if (i38 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f18;
                        }
                        if (i46 != 0) {
                            pVarD = k3.f56525a.d();
                        } else {
                            pVarD = pVar;
                        }
                        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                            pVar5 = new p() { // from class: f2.d1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.A((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -897;
                        } else {
                            pVar5 = pVar2;
                        }
                    }
                    rVarH.y();
                    aVar5 = aVar4;
                    if (t.k()) {
                        t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                    }
                    a2.Companion companion16 = a2.INSTANCE;
                    strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                    f3Var = (f3) rVarH.N(g1.u());
                    int i6112 = i48;
                    final p pVar110 = pVar5;
                    j0 j0VarF7 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                    dVar = (c5.d) rVarH.N(g1.f());
                    n1Var = n1.f79921a;
                    q1<ij> q1VarD113 = hjVarY.d();
                    i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                    long j115 = jI;
                    if (i56 <= 256) {
                    }
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new l() { // from class: f2.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                            }
                        };
                        rVarH.v(objE2);
                    }
                    d3VarA = n1Var.a(q1VarD113, (l) objE2, j0VarF7, rVarH, 3072);
                    boolean zW9 = rVarH.W(d3VarA);
                    if (i56 > 256) {
                        n1Var2 = n1Var;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    } else {
                        n1Var2 = n1Var;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    }
                    zW = zW9 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                        aVar6 = aVar5;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                        aVar6 = aVar5;
                        rVarH.v(objE3);
                    }
                    jVar = (j) objE3;
                    objE4 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    if (i56 > 256) {
                        y2Var3 = y2VarK;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        y2Var3 = y2VarK;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    }
                    boolean zG9 = z26 | rVarH.G(p0Var);
                    if ((i55 & 7168) == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = zG9 | z27;
                    objE5 = rVarH.E();
                    if (z28) {
                        objE5 = new er.a() { // from class: f2.f1
                            @Override // er.a
                            public final Object a() {
                                return l1.C(hjVarY, p0Var, aVar6);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.f1
                            @Override // er.a
                            public final Object a() {
                                return l1.C(hjVarY, p0Var, aVar6);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    final er.a aVar113 = (er.a) objE5;
                    er.a<i0> aVar114 = aVar6;
                    f3.m mVarH9 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                    if (z16) {
                        rVarH.X(1794077610);
                        f3.m.Companion companion17 = f3.m.INSTANCE;
                        if (i56 <= 256) {
                        }
                        objE8 = rVarH.E();
                        if (z36) {
                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                            rVarH.v(objE8);
                        } else {
                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                            rVarH.v(objE8);
                        }
                        mVarB = z3.d.b(companion17, (z3.a) objE8, null, 2, null);
                        rVarH.R();
                    } else {
                        rVarH.X(1794092431);
                        rVarH.R();
                        mVarB = f3.m.INSTANCE;
                    }
                    f3.m mVarU9 = mVarH9.u(mVarB);
                    q1<ij> q1VarD114 = hjVarY.d();
                    p143z0.a2 a2Var9 = p143z0.a2.Vertical;
                    if (i56 <= 256) {
                    }
                    objE6 = rVarH.E();
                    if (z29) {
                        objE6 = new p() { // from class: f2.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    } else {
                        objE6 = new p() { // from class: f2.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    }
                    f3.m mVarA9 = z0.a(mVarU9, q1VarD114, a2Var9, (p) objE6);
                    q1<ij> q1VarD115 = hjVarY.d();
                    if (z16) {
                        z35 = false;
                    } else {
                        z35 = false;
                    }
                    f3.m mVarB10 = n1Var2.b(mVarA9, q1VarD115, a2Var9, z35, false, jVar, null, rVarH, 12583296, 40);
                    zW2 = rVarH.W(strB);
                    objE7 = rVarH.E();
                    if (zW2) {
                        objE7 = new l() { // from class: f2.h1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return l1.G(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE7);
                    } else {
                        objE7 = new l() { // from class: f2.h1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return l1.G(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE7);
                    }
                    final hj hjVar11 = hjVarY;
                    final boolean z315 = z16;
                    final p pVar111 = pVarD;
                    int i6113 = i55 >> 15;
                    androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB10, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j115, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.H(pVar110, f15, hjVar11, pVar111, aVar113, p0Var, z315, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i6113 & 57344) | (i6113 & 112) | 12582912 | (i6113 & 896) | (i6113 & 7168) | (458752 & (i6112 << 15)), 64);
                    if (t.k()) {
                        t.n();
                    }
                    rVar2 = rVarH;
                    f25 = fO;
                    z18 = z16;
                    pVar4 = pVarD;
                    aVar3 = aVar114;
                    y2Var2 = y2Var3;
                    j17 = j115;
                    mVar3 = mVar2;
                    hjVar2 = hjVarY;
                    f27 = fN;
                    pVar3 = pVar110;
                    f26 = fJ;
                    j18 = jE;
                } else {
                    rVarH.O();
                    j17 = j15;
                    pVar3 = pVar2;
                    rVar2 = rVarH;
                    aVar3 = aVar2;
                    f25 = f19;
                    mVar3 = mVar2;
                    hjVar2 = hjVarY;
                    z18 = z16;
                    y2Var2 = y2Var;
                    j18 = j16;
                    f26 = f17;
                    f27 = f18;
                    pVar4 = pVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.j1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i39 |= 48;
            if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
            }
            if ((i16 & 3072) != 0) {
                i39 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i48 = i39;
            if ((i35 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i35 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i35 &= -897;
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.z0
                                @Override // er.a
                                public final Object a() {
                                    return l1.z();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i26 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f19;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i35 &= -3670017;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 128) != 0) {
                        i49 = i35 & (-29360129);
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        i49 = i35;
                        jI = j15;
                    }
                    if ((i17 & 256) != 0) {
                        jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                        i55 = i49 & (-234881025);
                    } else {
                        jE = j16;
                        i55 = i49;
                    }
                    if (i36 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f17;
                    }
                    if (i38 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f18;
                    }
                    if (i46 != 0) {
                        pVarD = k3.f56525a.d();
                    } else {
                        pVarD = pVar;
                    }
                    if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                        pVar5 = new p() { // from class: f2.d1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.A((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -897;
                    } else {
                        pVar5 = pVar2;
                    }
                } else {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i35 &= -897;
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.z0
                                @Override // er.a
                                public final Object a() {
                                    return l1.z();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i26 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f19;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i35 &= -3670017;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 128) != 0) {
                        i49 = i35 & (-29360129);
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        i49 = i35;
                        jI = j15;
                    }
                    if ((i17 & 256) != 0) {
                        jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                        i55 = i49 & (-234881025);
                    } else {
                        jE = j16;
                        i55 = i49;
                    }
                    if (i36 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f17;
                    }
                    if (i38 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f18;
                    }
                    if (i46 != 0) {
                        pVarD = k3.f56525a.d();
                    } else {
                        pVarD = pVar;
                    }
                    if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                        pVar5 = new p() { // from class: f2.d1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.A((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -897;
                    } else {
                        pVar5 = pVar2;
                    }
                }
                rVarH.y();
                aVar5 = aVar4;
                if (t.k()) {
                    t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                }
                a2.Companion companion18 = a2.INSTANCE;
                strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                f3Var = (f3) rVarH.N(g1.u());
                int i6114 = i48;
                final p pVar112 = pVar5;
                j0 j0VarF8 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                dVar = (c5.d) rVarH.N(g1.f());
                n1Var = n1.f79921a;
                q1<ij> q1VarD116 = hjVarY.d();
                i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                long j116 = jI;
                if (i56 <= 256) {
                }
                objE2 = rVarH.E();
                if (z19) {
                    objE2 = new l() { // from class: f2.e1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: f2.e1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                        }
                    };
                    rVarH.v(objE2);
                }
                d3VarA = n1Var.a(q1VarD116, (l) objE2, j0VarF8, rVarH, 3072);
                boolean zW10 = rVarH.W(d3VarA);
                if (i56 > 256) {
                    n1Var2 = n1Var;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                } else {
                    n1Var2 = n1Var;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                }
                zW = zW10 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                    aVar6 = aVar5;
                    rVarH.v(objE3);
                } else {
                    objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                    aVar6 = aVar5;
                    rVarH.v(objE3);
                }
                jVar = (j) objE3;
                objE4 = rVarH.E();
                companion = r.INSTANCE;
                if (objE4 == companion.a()) {
                    objE4 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE4);
                }
                p0Var = (p0) objE4;
                if (i56 > 256) {
                    y2Var3 = y2VarK;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                } else {
                    y2Var3 = y2VarK;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                }
                boolean zG10 = z26 | rVarH.G(p0Var);
                if ((i55 & 7168) == 2048) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = zG10 | z27;
                objE5 = rVarH.E();
                if (z28) {
                    objE5 = new er.a() { // from class: f2.f1
                        @Override // er.a
                        public final Object a() {
                            return l1.C(hjVarY, p0Var, aVar6);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new er.a() { // from class: f2.f1
                        @Override // er.a
                        public final Object a() {
                            return l1.C(hjVarY, p0Var, aVar6);
                        }
                    };
                    rVarH.v(objE5);
                }
                final er.a aVar115 = (er.a) objE5;
                er.a<i0> aVar116 = aVar6;
                f3.m mVarH10 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                if (z16) {
                    rVarH.X(1794077610);
                    f3.m.Companion companion19 = f3.m.INSTANCE;
                    if (i56 <= 256) {
                    }
                    objE8 = rVarH.E();
                    if (z36) {
                        objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                        rVarH.v(objE8);
                    } else {
                        objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                        rVarH.v(objE8);
                    }
                    mVarB = z3.d.b(companion19, (z3.a) objE8, null, 2, null);
                    rVarH.R();
                } else {
                    rVarH.X(1794092431);
                    rVarH.R();
                    mVarB = f3.m.INSTANCE;
                }
                f3.m mVarU10 = mVarH10.u(mVarB);
                q1<ij> q1VarD117 = hjVarY.d();
                p143z0.a2 a2Var10 = p143z0.a2.Vertical;
                if (i56 <= 256) {
                }
                objE6 = rVarH.E();
                if (z29) {
                    objE6 = new p() { // from class: f2.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                        }
                    };
                    rVarH.v(objE6);
                } else {
                    objE6 = new p() { // from class: f2.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                        }
                    };
                    rVarH.v(objE6);
                }
                f3.m mVarA10 = z0.a(mVarU10, q1VarD117, a2Var10, (p) objE6);
                q1<ij> q1VarD118 = hjVarY.d();
                if (z16) {
                    z35 = false;
                } else {
                    z35 = false;
                }
                f3.m mVarB11 = n1Var2.b(mVarA10, q1VarD118, a2Var10, z35, false, jVar, null, rVarH, 12583296, 40);
                zW2 = rVarH.W(strB);
                objE7 = rVarH.E();
                if (zW2) {
                    objE7 = new l() { // from class: f2.h1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return l1.G(strB, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE7);
                } else {
                    objE7 = new l() { // from class: f2.h1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return l1.G(strB, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE7);
                }
                final hj hjVar12 = hjVarY;
                final boolean z316 = z16;
                final p pVar113 = pVarD;
                int i6115 = i55 >> 15;
                androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB11, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j116, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.H(pVar112, f15, hjVar12, pVar113, aVar115, p0Var, z316, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i6115 & 57344) | (i6115 & 112) | 12582912 | (i6115 & 896) | (i6115 & 7168) | (458752 & (i6114 << 15)), 64);
                if (t.k()) {
                    t.n();
                }
                rVar2 = rVarH;
                f25 = fO;
                z18 = z16;
                pVar4 = pVarD;
                aVar3 = aVar116;
                y2Var2 = y2Var3;
                j17 = j116;
                mVar3 = mVar2;
                hjVar2 = hjVarY;
                f27 = fN;
                pVar3 = pVar112;
                f26 = fJ;
                j18 = jE;
            } else {
                rVarH.O();
                j17 = j15;
                pVar3 = pVar2;
                rVar2 = rVarH;
                aVar3 = aVar2;
                f25 = f19;
                mVar3 = mVar2;
                hjVar2 = hjVarY;
                z18 = z16;
                y2Var2 = y2Var;
                j18 = j16;
                f26 = f17;
                f27 = f18;
                pVar4 = pVar;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.j1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 48;
        mVar2 = mVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i17 & 4) == 0) {
                hjVarY = hjVar;
                if (rVarH.W(hjVarY)) {
                }
                i18 |= i66;
            } else {
                hjVarY = hjVar;
            }
            i18 |= i66;
        } else {
            hjVarY = hjVar;
        }
        i19 = i17 & 8;
        if (i19 != 0) {
            if ((i15 & 3072) == 0) {
                aVar2 = aVar;
                if (rVarH.G(aVar2)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i18 |= i25;
            }
            i26 = i17 & 16;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    f19 = f16;
                    if (rVarH.b(f19)) {
                        i27 = 16384;
                    } else {
                        i27 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i27;
                }
                i28 = i17 & 32;
                if (i28 != 0) {
                    i18 |= 196608;
                    z16 = z15;
                } else {
                    z16 = z15;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.a(z16)) {
                            i29 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i29 = PKIFailureInfo.notAuthorized;
                        }
                        i18 |= i29;
                    }
                }
                if ((i15 & 1572864) != 0) {
                    if ((i17 & 64) == 0) {
                        i59 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i59 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i59;
                }
                if ((i15 & 12582912) == 0) {
                    if ((i17 & 128) == 0) {
                        i58 = i18;
                        if (rVarH.d(j15)) {
                        }
                        i35 = i58 | i67;
                    } else {
                        i58 = i18;
                    }
                    i35 = i58 | i67;
                } else {
                    i35 = i18;
                }
                if ((i15 & 100663296) != 0) {
                    if ((i17 & 256) == 0) {
                        i57 = 33554432;
                    } else {
                        i57 = 33554432;
                    }
                    i35 |= i57;
                }
                i36 = i17 & 512;
                if (i36 != 0) {
                    i35 |= 805306368;
                } else if ((i15 & 805306368) == 0) {
                    if (rVarH.b(f17)) {
                        i37 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i37 = 268435456;
                    }
                    i35 |= i37;
                }
                i38 = i17 & 1024;
                if (i38 != 0) {
                    i39 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.b(f18)) {
                        i45 = 4;
                    } else {
                        i45 = 2;
                    }
                    i39 = i16 | i45;
                } else {
                    i39 = i16;
                }
                i46 = i17 & 2048;
                if (i46 != 0) {
                    if ((i16 & 48) == 0) {
                        if (rVarH.G(pVar)) {
                            i47 = 32;
                        } else {
                            i47 = 16;
                        }
                        i39 |= i47;
                    }
                    if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                        i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
                    }
                    if ((i16 & 3072) != 0) {
                        i39 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i48 = i39;
                    if ((i35 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i35 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i35 &= -897;
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.z0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.z();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar4 = (er.a) objE;
                            } else {
                                aVar4 = aVar2;
                            }
                            if (i26 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f19;
                            }
                            if (i28 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i35 &= -3670017;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 128) != 0) {
                                i49 = i35 & (-29360129);
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                i49 = i35;
                                jI = j15;
                            }
                            if ((i17 & 256) != 0) {
                                jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                                i55 = i49 & (-234881025);
                            } else {
                                jE = j16;
                                i55 = i49;
                            }
                            if (i36 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f17;
                            }
                            if (i38 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f18;
                            }
                            if (i46 != 0) {
                                pVarD = k3.f56525a.d();
                            } else {
                                pVarD = pVar;
                            }
                            if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                                pVar5 = new p() { // from class: f2.d1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.A((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -897;
                            } else {
                                pVar5 = pVar2;
                            }
                        } else {
                            if (i65 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i35 &= -897;
                                hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new er.a() { // from class: f2.z0
                                        @Override // er.a
                                        public final Object a() {
                                            return l1.z();
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                aVar4 = (er.a) objE;
                            } else {
                                aVar4 = aVar2;
                            }
                            if (i26 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f19;
                            }
                            if (i28 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 64) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i35 &= -3670017;
                            } else {
                                y2VarK = y2Var;
                            }
                            if ((i17 & 128) != 0) {
                                i49 = i35 & (-29360129);
                                jI = n0.f56958a.i(rVarH, 6);
                            } else {
                                i49 = i35;
                                jI = j15;
                            }
                            if ((i17 & 256) != 0) {
                                jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                                i55 = i49 & (-234881025);
                            } else {
                                jE = j16;
                                i55 = i49;
                            }
                            if (i36 != 0) {
                                fJ = n0.f56958a.j();
                            } else {
                                fJ = f17;
                            }
                            if (i38 != 0) {
                                fN = c5.h.n(0);
                            } else {
                                fN = f18;
                            }
                            if (i46 != 0) {
                                pVarD = k3.f56525a.d();
                            } else {
                                pVarD = pVar;
                            }
                            if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                                pVar5 = new p() { // from class: f2.d1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return l1.A((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -897;
                            } else {
                                pVar5 = pVar2;
                            }
                        }
                        rVarH.y();
                        aVar5 = aVar4;
                        if (t.k()) {
                            t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                        }
                        a2.Companion companion110 = a2.INSTANCE;
                        strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                        f3Var = (f3) rVarH.N(g1.u());
                        int i6116 = i48;
                        final p pVar114 = pVar5;
                        j0 j0VarF9 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                        dVar = (c5.d) rVarH.N(g1.f());
                        n1Var = n1.f79921a;
                        q1<ij> q1VarD119 = hjVarY.d();
                        i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                        long j117 = jI;
                        if (i56 <= 256) {
                        }
                        objE2 = rVarH.E();
                        if (z19) {
                            objE2 = new l() { // from class: f2.e1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.e1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                                }
                            };
                            rVarH.v(objE2);
                        }
                        d3VarA = n1Var.a(q1VarD119, (l) objE2, j0VarF9, rVarH, 3072);
                        boolean zW11 = rVarH.W(d3VarA);
                        if (i56 > 256) {
                            n1Var2 = n1Var;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                        } else {
                            n1Var2 = n1Var;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                        }
                        zW = zW11 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                        objE3 = rVarH.E();
                        if (zW) {
                            objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                            aVar6 = aVar5;
                            rVarH.v(objE3);
                        } else {
                            objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                            aVar6 = aVar5;
                            rVarH.v(objE3);
                        }
                        jVar = (j) objE3;
                        objE4 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE4 == companion.a()) {
                            objE4 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE4);
                        }
                        p0Var = (p0) objE4;
                        if (i56 > 256) {
                            y2Var3 = y2VarK;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        } else {
                            y2Var3 = y2VarK;
                            if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        }
                        boolean zG11 = z26 | rVarH.G(p0Var);
                        if ((i55 & 7168) == 2048) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = zG11 | z27;
                        objE5 = rVarH.E();
                        if (z28) {
                            objE5 = new er.a() { // from class: f2.f1
                                @Override // er.a
                                public final Object a() {
                                    return l1.C(hjVarY, p0Var, aVar6);
                                }
                            };
                            rVarH.v(objE5);
                        } else {
                            objE5 = new er.a() { // from class: f2.f1
                                @Override // er.a
                                public final Object a() {
                                    return l1.C(hjVarY, p0Var, aVar6);
                                }
                            };
                            rVarH.v(objE5);
                        }
                        final er.a aVar117 = (er.a) objE5;
                        er.a<i0> aVar118 = aVar6;
                        f3.m mVarH11 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                        if (z16) {
                            rVarH.X(1794077610);
                            f3.m.Companion companion111 = f3.m.INSTANCE;
                            if (i56 <= 256) {
                            }
                            objE8 = rVarH.E();
                            if (z36) {
                                objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                rVarH.v(objE8);
                            } else {
                                objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                                rVarH.v(objE8);
                            }
                            mVarB = z3.d.b(companion111, (z3.a) objE8, null, 2, null);
                            rVarH.R();
                        } else {
                            rVarH.X(1794092431);
                            rVarH.R();
                            mVarB = f3.m.INSTANCE;
                        }
                        f3.m mVarU11 = mVarH11.u(mVarB);
                        q1<ij> q1VarD1110 = hjVarY.d();
                        p143z0.a2 a2Var11 = p143z0.a2.Vertical;
                        if (i56 <= 256) {
                        }
                        objE6 = rVarH.E();
                        if (z29) {
                            objE6 = new p() { // from class: f2.g1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                }
                            };
                            rVarH.v(objE6);
                        } else {
                            objE6 = new p() { // from class: f2.g1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                                }
                            };
                            rVarH.v(objE6);
                        }
                        f3.m mVarA11 = z0.a(mVarU11, q1VarD1110, a2Var11, (p) objE6);
                        q1<ij> q1VarD1111 = hjVarY.d();
                        if (z16) {
                            z35 = false;
                        } else {
                            z35 = false;
                        }
                        f3.m mVarB12 = n1Var2.b(mVarA11, q1VarD1111, a2Var11, z35, false, jVar, null, rVarH, 12583296, 40);
                        zW2 = rVarH.W(strB);
                        objE7 = rVarH.E();
                        if (zW2) {
                            objE7 = new l() { // from class: f2.h1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return l1.G(strB, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE7);
                        } else {
                            objE7 = new l() { // from class: f2.h1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return l1.G(strB, (n4.i0) obj);
                                }
                            };
                            rVarH.v(objE7);
                        }
                        final hj hjVar13 = hjVarY;
                        final boolean z317 = z16;
                        final p pVar115 = pVarD;
                        int i6117 = i55 >> 15;
                        androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB12, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j117, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.H(pVar114, f15, hjVar13, pVar115, aVar117, p0Var, z317, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, (i6117 & 57344) | (i6117 & 112) | 12582912 | (i6117 & 896) | (i6117 & 7168) | (458752 & (i6116 << 15)), 64);
                        if (t.k()) {
                            t.n();
                        }
                        rVar2 = rVarH;
                        f25 = fO;
                        z18 = z16;
                        pVar4 = pVarD;
                        aVar3 = aVar118;
                        y2Var2 = y2Var3;
                        j17 = j117;
                        mVar3 = mVar2;
                        hjVar2 = hjVarY;
                        f27 = fN;
                        pVar3 = pVar114;
                        f26 = fJ;
                        j18 = jE;
                    } else {
                        rVarH.O();
                        j17 = j15;
                        pVar3 = pVar2;
                        rVar2 = rVarH;
                        aVar3 = aVar2;
                        f25 = f19;
                        mVar3 = mVar2;
                        hjVar2 = hjVarY;
                        z18 = z16;
                        y2Var2 = y2Var;
                        j18 = j16;
                        f26 = f17;
                        f27 = f18;
                        pVar4 = pVar;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.j1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i39 |= 48;
                if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                    i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
                }
                if ((i16 & 3072) != 0) {
                    i39 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i48 = i39;
                if ((i35 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i35 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i35 &= -897;
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.z0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.z();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i26 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f19;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i35 &= -3670017;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 128) != 0) {
                            i49 = i35 & (-29360129);
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            i49 = i35;
                            jI = j15;
                        }
                        if ((i17 & 256) != 0) {
                            jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                            i55 = i49 & (-234881025);
                        } else {
                            jE = j16;
                            i55 = i49;
                        }
                        if (i36 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f17;
                        }
                        if (i38 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f18;
                        }
                        if (i46 != 0) {
                            pVarD = k3.f56525a.d();
                        } else {
                            pVarD = pVar;
                        }
                        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                            pVar5 = new p() { // from class: f2.d1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.A((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -897;
                        } else {
                            pVar5 = pVar2;
                        }
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i35 &= -897;
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.z0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.z();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i26 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f19;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i35 &= -3670017;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 128) != 0) {
                            i49 = i35 & (-29360129);
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            i49 = i35;
                            jI = j15;
                        }
                        if ((i17 & 256) != 0) {
                            jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                            i55 = i49 & (-234881025);
                        } else {
                            jE = j16;
                            i55 = i49;
                        }
                        if (i36 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f17;
                        }
                        if (i38 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f18;
                        }
                        if (i46 != 0) {
                            pVarD = k3.f56525a.d();
                        } else {
                            pVarD = pVar;
                        }
                        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                            pVar5 = new p() { // from class: f2.d1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.A((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -897;
                        } else {
                            pVar5 = pVar2;
                        }
                    }
                    rVarH.y();
                    aVar5 = aVar4;
                    if (t.k()) {
                        t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                    }
                    a2.Companion companion112 = a2.INSTANCE;
                    strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                    f3Var = (f3) rVarH.N(g1.u());
                    int i6118 = i48;
                    final p pVar116 = pVar5;
                    j0 j0VarF10 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                    dVar = (c5.d) rVarH.N(g1.f());
                    n1Var = n1.f79921a;
                    q1<ij> q1VarD1112 = hjVarY.d();
                    i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                    long j118 = jI;
                    if (i56 <= 256) {
                    }
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new l() { // from class: f2.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                            }
                        };
                        rVarH.v(objE2);
                    }
                    d3VarA = n1Var.a(q1VarD1112, (l) objE2, j0VarF10, rVarH, 3072);
                    boolean zW12 = rVarH.W(d3VarA);
                    if (i56 > 256) {
                        n1Var2 = n1Var;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    } else {
                        n1Var2 = n1Var;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    }
                    zW = zW12 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                        aVar6 = aVar5;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                        aVar6 = aVar5;
                        rVarH.v(objE3);
                    }
                    jVar = (j) objE3;
                    objE4 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    if (i56 > 256) {
                        y2Var3 = y2VarK;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        y2Var3 = y2VarK;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    }
                    boolean zG12 = z26 | rVarH.G(p0Var);
                    if ((i55 & 7168) == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = zG12 | z27;
                    objE5 = rVarH.E();
                    if (z28) {
                        objE5 = new er.a() { // from class: f2.f1
                            @Override // er.a
                            public final Object a() {
                                return l1.C(hjVarY, p0Var, aVar6);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.f1
                            @Override // er.a
                            public final Object a() {
                                return l1.C(hjVarY, p0Var, aVar6);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    final er.a aVar119 = (er.a) objE5;
                    er.a<i0> aVar1110 = aVar6;
                    f3.m mVarH12 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                    if (z16) {
                        rVarH.X(1794077610);
                        f3.m.Companion companion113 = f3.m.INSTANCE;
                        if (i56 <= 256) {
                        }
                        objE8 = rVarH.E();
                        if (z36) {
                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                            rVarH.v(objE8);
                        } else {
                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                            rVarH.v(objE8);
                        }
                        mVarB = z3.d.b(companion113, (z3.a) objE8, null, 2, null);
                        rVarH.R();
                    } else {
                        rVarH.X(1794092431);
                        rVarH.R();
                        mVarB = f3.m.INSTANCE;
                    }
                    f3.m mVarU12 = mVarH12.u(mVarB);
                    q1<ij> q1VarD1113 = hjVarY.d();
                    p143z0.a2 a2Var12 = p143z0.a2.Vertical;
                    if (i56 <= 256) {
                    }
                    objE6 = rVarH.E();
                    if (z29) {
                        objE6 = new p() { // from class: f2.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    } else {
                        objE6 = new p() { // from class: f2.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    }
                    f3.m mVarA12 = z0.a(mVarU12, q1VarD1113, a2Var12, (p) objE6);
                    q1<ij> q1VarD1114 = hjVarY.d();
                    if (z16) {
                        z35 = false;
                    } else {
                        z35 = false;
                    }
                    f3.m mVarB13 = n1Var2.b(mVarA12, q1VarD1114, a2Var12, z35, false, jVar, null, rVarH, 12583296, 40);
                    zW2 = rVarH.W(strB);
                    objE7 = rVarH.E();
                    if (zW2) {
                        objE7 = new l() { // from class: f2.h1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return l1.G(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE7);
                    } else {
                        objE7 = new l() { // from class: f2.h1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return l1.G(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE7);
                    }
                    final hj hjVar14 = hjVarY;
                    final boolean z318 = z16;
                    final p pVar117 = pVarD;
                    int i6119 = i55 >> 15;
                    androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB13, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j118, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.H(pVar116, f15, hjVar14, pVar117, aVar119, p0Var, z318, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i6119 & 57344) | (i6119 & 112) | 12582912 | (i6119 & 896) | (i6119 & 7168) | (458752 & (i6118 << 15)), 64);
                    if (t.k()) {
                        t.n();
                    }
                    rVar2 = rVarH;
                    f25 = fO;
                    z18 = z16;
                    pVar4 = pVarD;
                    aVar3 = aVar1110;
                    y2Var2 = y2Var3;
                    j17 = j118;
                    mVar3 = mVar2;
                    hjVar2 = hjVarY;
                    f27 = fN;
                    pVar3 = pVar116;
                    f26 = fJ;
                    j18 = jE;
                } else {
                    rVarH.O();
                    j17 = j15;
                    pVar3 = pVar2;
                    rVar2 = rVarH;
                    aVar3 = aVar2;
                    f25 = f19;
                    mVar3 = mVar2;
                    hjVar2 = hjVarY;
                    z18 = z16;
                    y2Var2 = y2Var;
                    j18 = j16;
                    f26 = f17;
                    f27 = f18;
                    pVar4 = pVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.j1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            f19 = f16;
            i28 = i17 & 32;
            if (i28 != 0) {
                i18 |= 196608;
                z16 = z15;
            } else {
                z16 = z15;
                if ((i15 & 196608) == 0) {
                    if (rVarH.a(z16)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i29 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i29;
                }
            }
            if ((i15 & 1572864) != 0) {
                if ((i17 & 64) == 0) {
                    i59 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i59 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i59;
            }
            if ((i15 & 12582912) == 0) {
                if ((i17 & 128) == 0) {
                    i58 = i18;
                    if (rVarH.d(j15)) {
                    }
                    i35 = i58 | i67;
                } else {
                    i58 = i18;
                }
                i35 = i58 | i67;
            } else {
                i35 = i18;
            }
            if ((i15 & 100663296) != 0) {
                if ((i17 & 256) == 0) {
                    i57 = 33554432;
                } else {
                    i57 = 33554432;
                }
                i35 |= i57;
            }
            i36 = i17 & 512;
            if (i36 != 0) {
                i35 |= 805306368;
            } else if ((i15 & 805306368) == 0) {
                if (rVarH.b(f17)) {
                    i37 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i37 = 268435456;
                }
                i35 |= i37;
            }
            i38 = i17 & 1024;
            if (i38 != 0) {
                i39 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.b(f18)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i39 = i16 | i45;
            } else {
                i39 = i16;
            }
            i46 = i17 & 2048;
            if (i46 != 0) {
                if ((i16 & 48) == 0) {
                    if (rVarH.G(pVar)) {
                        i47 = 32;
                    } else {
                        i47 = 16;
                    }
                    i39 |= i47;
                }
                if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                    i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
                }
                if ((i16 & 3072) != 0) {
                    i39 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i48 = i39;
                if ((i35 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i35 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i35 &= -897;
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.z0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.z();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i26 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f19;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i35 &= -3670017;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 128) != 0) {
                            i49 = i35 & (-29360129);
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            i49 = i35;
                            jI = j15;
                        }
                        if ((i17 & 256) != 0) {
                            jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                            i55 = i49 & (-234881025);
                        } else {
                            jE = j16;
                            i55 = i49;
                        }
                        if (i36 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f17;
                        }
                        if (i38 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f18;
                        }
                        if (i46 != 0) {
                            pVarD = k3.f56525a.d();
                        } else {
                            pVarD = pVar;
                        }
                        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                            pVar5 = new p() { // from class: f2.d1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.A((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -897;
                        } else {
                            pVar5 = pVar2;
                        }
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i35 &= -897;
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.z0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.z();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i26 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f19;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i35 &= -3670017;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 128) != 0) {
                            i49 = i35 & (-29360129);
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            i49 = i35;
                            jI = j15;
                        }
                        if ((i17 & 256) != 0) {
                            jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                            i55 = i49 & (-234881025);
                        } else {
                            jE = j16;
                            i55 = i49;
                        }
                        if (i36 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f17;
                        }
                        if (i38 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f18;
                        }
                        if (i46 != 0) {
                            pVarD = k3.f56525a.d();
                        } else {
                            pVarD = pVar;
                        }
                        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                            pVar5 = new p() { // from class: f2.d1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.A((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -897;
                        } else {
                            pVar5 = pVar2;
                        }
                    }
                    rVarH.y();
                    aVar5 = aVar4;
                    if (t.k()) {
                        t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                    }
                    a2.Companion companion114 = a2.INSTANCE;
                    strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                    f3Var = (f3) rVarH.N(g1.u());
                    int i61110 = i48;
                    final p pVar118 = pVar5;
                    j0 j0VarF11 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                    dVar = (c5.d) rVarH.N(g1.f());
                    n1Var = n1.f79921a;
                    q1<ij> q1VarD1115 = hjVarY.d();
                    i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                    long j119 = jI;
                    if (i56 <= 256) {
                    }
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new l() { // from class: f2.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                            }
                        };
                        rVarH.v(objE2);
                    }
                    d3VarA = n1Var.a(q1VarD1115, (l) objE2, j0VarF11, rVarH, 3072);
                    boolean zW13 = rVarH.W(d3VarA);
                    if (i56 > 256) {
                        n1Var2 = n1Var;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    } else {
                        n1Var2 = n1Var;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    }
                    zW = zW13 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                        aVar6 = aVar5;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                        aVar6 = aVar5;
                        rVarH.v(objE3);
                    }
                    jVar = (j) objE3;
                    objE4 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    if (i56 > 256) {
                        y2Var3 = y2VarK;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        y2Var3 = y2VarK;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    }
                    boolean zG13 = z26 | rVarH.G(p0Var);
                    if ((i55 & 7168) == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = zG13 | z27;
                    objE5 = rVarH.E();
                    if (z28) {
                        objE5 = new er.a() { // from class: f2.f1
                            @Override // er.a
                            public final Object a() {
                                return l1.C(hjVarY, p0Var, aVar6);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.f1
                            @Override // er.a
                            public final Object a() {
                                return l1.C(hjVarY, p0Var, aVar6);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    final er.a aVar1111 = (er.a) objE5;
                    er.a<i0> aVar1112 = aVar6;
                    f3.m mVarH13 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                    if (z16) {
                        rVarH.X(1794077610);
                        f3.m.Companion companion115 = f3.m.INSTANCE;
                        if (i56 <= 256) {
                        }
                        objE8 = rVarH.E();
                        if (z36) {
                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                            rVarH.v(objE8);
                        } else {
                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                            rVarH.v(objE8);
                        }
                        mVarB = z3.d.b(companion115, (z3.a) objE8, null, 2, null);
                        rVarH.R();
                    } else {
                        rVarH.X(1794092431);
                        rVarH.R();
                        mVarB = f3.m.INSTANCE;
                    }
                    f3.m mVarU13 = mVarH13.u(mVarB);
                    q1<ij> q1VarD1116 = hjVarY.d();
                    p143z0.a2 a2Var13 = p143z0.a2.Vertical;
                    if (i56 <= 256) {
                    }
                    objE6 = rVarH.E();
                    if (z29) {
                        objE6 = new p() { // from class: f2.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    } else {
                        objE6 = new p() { // from class: f2.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    }
                    f3.m mVarA13 = z0.a(mVarU13, q1VarD1116, a2Var13, (p) objE6);
                    q1<ij> q1VarD1117 = hjVarY.d();
                    if (z16) {
                        z35 = false;
                    } else {
                        z35 = false;
                    }
                    f3.m mVarB14 = n1Var2.b(mVarA13, q1VarD1117, a2Var13, z35, false, jVar, null, rVarH, 12583296, 40);
                    zW2 = rVarH.W(strB);
                    objE7 = rVarH.E();
                    if (zW2) {
                        objE7 = new l() { // from class: f2.h1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return l1.G(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE7);
                    } else {
                        objE7 = new l() { // from class: f2.h1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return l1.G(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE7);
                    }
                    final hj hjVar15 = hjVarY;
                    final boolean z319 = z16;
                    final p pVar119 = pVarD;
                    int i61111 = i55 >> 15;
                    androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB14, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j119, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.H(pVar118, f15, hjVar15, pVar119, aVar1111, p0Var, z319, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i61111 & 57344) | (i61111 & 112) | 12582912 | (i61111 & 896) | (i61111 & 7168) | (458752 & (i61110 << 15)), 64);
                    if (t.k()) {
                        t.n();
                    }
                    rVar2 = rVarH;
                    f25 = fO;
                    z18 = z16;
                    pVar4 = pVarD;
                    aVar3 = aVar1112;
                    y2Var2 = y2Var3;
                    j17 = j119;
                    mVar3 = mVar2;
                    hjVar2 = hjVarY;
                    f27 = fN;
                    pVar3 = pVar118;
                    f26 = fJ;
                    j18 = jE;
                } else {
                    rVarH.O();
                    j17 = j15;
                    pVar3 = pVar2;
                    rVar2 = rVarH;
                    aVar3 = aVar2;
                    f25 = f19;
                    mVar3 = mVar2;
                    hjVar2 = hjVarY;
                    z18 = z16;
                    y2Var2 = y2Var;
                    j18 = j16;
                    f26 = f17;
                    f27 = f18;
                    pVar4 = pVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.j1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i39 |= 48;
            if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
            }
            if ((i16 & 3072) != 0) {
                i39 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i48 = i39;
            if ((i35 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i35 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i35 &= -897;
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.z0
                                @Override // er.a
                                public final Object a() {
                                    return l1.z();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i26 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f19;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i35 &= -3670017;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 128) != 0) {
                        i49 = i35 & (-29360129);
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        i49 = i35;
                        jI = j15;
                    }
                    if ((i17 & 256) != 0) {
                        jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                        i55 = i49 & (-234881025);
                    } else {
                        jE = j16;
                        i55 = i49;
                    }
                    if (i36 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f17;
                    }
                    if (i38 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f18;
                    }
                    if (i46 != 0) {
                        pVarD = k3.f56525a.d();
                    } else {
                        pVarD = pVar;
                    }
                    if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                        pVar5 = new p() { // from class: f2.d1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.A((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -897;
                    } else {
                        pVar5 = pVar2;
                    }
                } else {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i35 &= -897;
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.z0
                                @Override // er.a
                                public final Object a() {
                                    return l1.z();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i26 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f19;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i35 &= -3670017;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 128) != 0) {
                        i49 = i35 & (-29360129);
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        i49 = i35;
                        jI = j15;
                    }
                    if ((i17 & 256) != 0) {
                        jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                        i55 = i49 & (-234881025);
                    } else {
                        jE = j16;
                        i55 = i49;
                    }
                    if (i36 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f17;
                    }
                    if (i38 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f18;
                    }
                    if (i46 != 0) {
                        pVarD = k3.f56525a.d();
                    } else {
                        pVarD = pVar;
                    }
                    if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                        pVar5 = new p() { // from class: f2.d1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.A((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -897;
                    } else {
                        pVar5 = pVar2;
                    }
                }
                rVarH.y();
                aVar5 = aVar4;
                if (t.k()) {
                    t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                }
                a2.Companion companion116 = a2.INSTANCE;
                strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                f3Var = (f3) rVarH.N(g1.u());
                int i61112 = i48;
                final p pVar1110 = pVar5;
                j0 j0VarF12 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                dVar = (c5.d) rVarH.N(g1.f());
                n1Var = n1.f79921a;
                q1<ij> q1VarD1118 = hjVarY.d();
                i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                long j1110 = jI;
                if (i56 <= 256) {
                }
                objE2 = rVarH.E();
                if (z19) {
                    objE2 = new l() { // from class: f2.e1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: f2.e1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                        }
                    };
                    rVarH.v(objE2);
                }
                d3VarA = n1Var.a(q1VarD1118, (l) objE2, j0VarF12, rVarH, 3072);
                boolean zW14 = rVarH.W(d3VarA);
                if (i56 > 256) {
                    n1Var2 = n1Var;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                } else {
                    n1Var2 = n1Var;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                }
                zW = zW14 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                    aVar6 = aVar5;
                    rVarH.v(objE3);
                } else {
                    objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                    aVar6 = aVar5;
                    rVarH.v(objE3);
                }
                jVar = (j) objE3;
                objE4 = rVarH.E();
                companion = r.INSTANCE;
                if (objE4 == companion.a()) {
                    objE4 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE4);
                }
                p0Var = (p0) objE4;
                if (i56 > 256) {
                    y2Var3 = y2VarK;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                } else {
                    y2Var3 = y2VarK;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                }
                boolean zG14 = z26 | rVarH.G(p0Var);
                if ((i55 & 7168) == 2048) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = zG14 | z27;
                objE5 = rVarH.E();
                if (z28) {
                    objE5 = new er.a() { // from class: f2.f1
                        @Override // er.a
                        public final Object a() {
                            return l1.C(hjVarY, p0Var, aVar6);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new er.a() { // from class: f2.f1
                        @Override // er.a
                        public final Object a() {
                            return l1.C(hjVarY, p0Var, aVar6);
                        }
                    };
                    rVarH.v(objE5);
                }
                final er.a aVar1113 = (er.a) objE5;
                er.a<i0> aVar1114 = aVar6;
                f3.m mVarH14 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                if (z16) {
                    rVarH.X(1794077610);
                    f3.m.Companion companion117 = f3.m.INSTANCE;
                    if (i56 <= 256) {
                    }
                    objE8 = rVarH.E();
                    if (z36) {
                        objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                        rVarH.v(objE8);
                    } else {
                        objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                        rVarH.v(objE8);
                    }
                    mVarB = z3.d.b(companion117, (z3.a) objE8, null, 2, null);
                    rVarH.R();
                } else {
                    rVarH.X(1794092431);
                    rVarH.R();
                    mVarB = f3.m.INSTANCE;
                }
                f3.m mVarU14 = mVarH14.u(mVarB);
                q1<ij> q1VarD1119 = hjVarY.d();
                p143z0.a2 a2Var14 = p143z0.a2.Vertical;
                if (i56 <= 256) {
                }
                objE6 = rVarH.E();
                if (z29) {
                    objE6 = new p() { // from class: f2.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                        }
                    };
                    rVarH.v(objE6);
                } else {
                    objE6 = new p() { // from class: f2.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                        }
                    };
                    rVarH.v(objE6);
                }
                f3.m mVarA14 = z0.a(mVarU14, q1VarD1119, a2Var14, (p) objE6);
                q1<ij> q1VarD11110 = hjVarY.d();
                if (z16) {
                    z35 = false;
                } else {
                    z35 = false;
                }
                f3.m mVarB15 = n1Var2.b(mVarA14, q1VarD11110, a2Var14, z35, false, jVar, null, rVarH, 12583296, 40);
                zW2 = rVarH.W(strB);
                objE7 = rVarH.E();
                if (zW2) {
                    objE7 = new l() { // from class: f2.h1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return l1.G(strB, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE7);
                } else {
                    objE7 = new l() { // from class: f2.h1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return l1.G(strB, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE7);
                }
                final hj hjVar16 = hjVarY;
                final boolean z3110 = z16;
                final p pVar1111 = pVarD;
                int i61113 = i55 >> 15;
                androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB15, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j1110, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.H(pVar1110, f15, hjVar16, pVar1111, aVar1113, p0Var, z3110, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i61113 & 57344) | (i61113 & 112) | 12582912 | (i61113 & 896) | (i61113 & 7168) | (458752 & (i61112 << 15)), 64);
                if (t.k()) {
                    t.n();
                }
                rVar2 = rVarH;
                f25 = fO;
                z18 = z16;
                pVar4 = pVarD;
                aVar3 = aVar1114;
                y2Var2 = y2Var3;
                j17 = j1110;
                mVar3 = mVar2;
                hjVar2 = hjVarY;
                f27 = fN;
                pVar3 = pVar1110;
                f26 = fJ;
                j18 = jE;
            } else {
                rVarH.O();
                j17 = j15;
                pVar3 = pVar2;
                rVar2 = rVarH;
                aVar3 = aVar2;
                f25 = f19;
                mVar3 = mVar2;
                hjVar2 = hjVarY;
                z18 = z16;
                y2Var2 = y2Var;
                j18 = j16;
                f26 = f17;
                f27 = f18;
                pVar4 = pVar;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.j1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 3072;
        aVar2 = aVar;
        i26 = i17 & 16;
        if (i26 != 0) {
            if ((i15 & 24576) == 0) {
                f19 = f16;
                if (rVarH.b(f19)) {
                    i27 = 16384;
                } else {
                    i27 = PKIFailureInfo.certRevoked;
                }
                i18 |= i27;
            }
            i28 = i17 & 32;
            if (i28 != 0) {
                i18 |= 196608;
                z16 = z15;
            } else {
                z16 = z15;
                if ((i15 & 196608) == 0) {
                    if (rVarH.a(z16)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i29 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i29;
                }
            }
            if ((i15 & 1572864) != 0) {
                if ((i17 & 64) == 0) {
                    i59 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i59 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i59;
            }
            if ((i15 & 12582912) == 0) {
                if ((i17 & 128) == 0) {
                    i58 = i18;
                    if (rVarH.d(j15)) {
                    }
                    i35 = i58 | i67;
                } else {
                    i58 = i18;
                }
                i35 = i58 | i67;
            } else {
                i35 = i18;
            }
            if ((i15 & 100663296) != 0) {
                if ((i17 & 256) == 0) {
                    i57 = 33554432;
                } else {
                    i57 = 33554432;
                }
                i35 |= i57;
            }
            i36 = i17 & 512;
            if (i36 != 0) {
                i35 |= 805306368;
            } else if ((i15 & 805306368) == 0) {
                if (rVarH.b(f17)) {
                    i37 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i37 = 268435456;
                }
                i35 |= i37;
            }
            i38 = i17 & 1024;
            if (i38 != 0) {
                i39 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.b(f18)) {
                    i45 = 4;
                } else {
                    i45 = 2;
                }
                i39 = i16 | i45;
            } else {
                i39 = i16;
            }
            i46 = i17 & 2048;
            if (i46 != 0) {
                if ((i16 & 48) == 0) {
                    if (rVarH.G(pVar)) {
                        i47 = 32;
                    } else {
                        i47 = 16;
                    }
                    i39 |= i47;
                }
                if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                    i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
                }
                if ((i16 & 3072) != 0) {
                    i39 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i48 = i39;
                if ((i35 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i35 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i35 &= -897;
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.z0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.z();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i26 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f19;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i35 &= -3670017;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 128) != 0) {
                            i49 = i35 & (-29360129);
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            i49 = i35;
                            jI = j15;
                        }
                        if ((i17 & 256) != 0) {
                            jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                            i55 = i49 & (-234881025);
                        } else {
                            jE = j16;
                            i55 = i49;
                        }
                        if (i36 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f17;
                        }
                        if (i38 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f18;
                        }
                        if (i46 != 0) {
                            pVarD = k3.f56525a.d();
                        } else {
                            pVarD = pVar;
                        }
                        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                            pVar5 = new p() { // from class: f2.d1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.A((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -897;
                        } else {
                            pVar5 = pVar2;
                        }
                    } else {
                        if (i65 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i35 &= -897;
                            hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new er.a() { // from class: f2.z0
                                    @Override // er.a
                                    public final Object a() {
                                        return l1.z();
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i26 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f19;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 64) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i35 &= -3670017;
                        } else {
                            y2VarK = y2Var;
                        }
                        if ((i17 & 128) != 0) {
                            i49 = i35 & (-29360129);
                            jI = n0.f56958a.i(rVarH, 6);
                        } else {
                            i49 = i35;
                            jI = j15;
                        }
                        if ((i17 & 256) != 0) {
                            jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                            i55 = i49 & (-234881025);
                        } else {
                            jE = j16;
                            i55 = i49;
                        }
                        if (i36 != 0) {
                            fJ = n0.f56958a.j();
                        } else {
                            fJ = f17;
                        }
                        if (i38 != 0) {
                            fN = c5.h.n(0);
                        } else {
                            fN = f18;
                        }
                        if (i46 != 0) {
                            pVarD = k3.f56525a.d();
                        } else {
                            pVarD = pVar;
                        }
                        if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                            pVar5 = new p() { // from class: f2.d1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return l1.A((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -897;
                        } else {
                            pVar5 = pVar2;
                        }
                    }
                    rVarH.y();
                    aVar5 = aVar4;
                    if (t.k()) {
                        t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                    }
                    a2.Companion companion118 = a2.INSTANCE;
                    strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                    f3Var = (f3) rVarH.N(g1.u());
                    int i61114 = i48;
                    final p pVar1112 = pVar5;
                    j0 j0VarF13 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                    dVar = (c5.d) rVarH.N(g1.f());
                    n1Var = n1.f79921a;
                    q1<ij> q1VarD11111 = hjVarY.d();
                    i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                    long j1111 = jI;
                    if (i56 <= 256) {
                    }
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new l() { // from class: f2.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                            }
                        };
                        rVarH.v(objE2);
                    }
                    d3VarA = n1Var.a(q1VarD11111, (l) objE2, j0VarF13, rVarH, 3072);
                    boolean zW15 = rVarH.W(d3VarA);
                    if (i56 > 256) {
                        n1Var2 = n1Var;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    } else {
                        n1Var2 = n1Var;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    }
                    zW = zW15 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                        aVar6 = aVar5;
                        rVarH.v(objE3);
                    } else {
                        objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                        aVar6 = aVar5;
                        rVarH.v(objE3);
                    }
                    jVar = (j) objE3;
                    objE4 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE4 == companion.a()) {
                        objE4 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE4);
                    }
                    p0Var = (p0) objE4;
                    if (i56 > 256) {
                        y2Var3 = y2VarK;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        y2Var3 = y2VarK;
                        if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    }
                    boolean zG15 = z26 | rVarH.G(p0Var);
                    if ((i55 & 7168) == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = zG15 | z27;
                    objE5 = rVarH.E();
                    if (z28) {
                        objE5 = new er.a() { // from class: f2.f1
                            @Override // er.a
                            public final Object a() {
                                return l1.C(hjVarY, p0Var, aVar6);
                            }
                        };
                        rVarH.v(objE5);
                    } else {
                        objE5 = new er.a() { // from class: f2.f1
                            @Override // er.a
                            public final Object a() {
                                return l1.C(hjVarY, p0Var, aVar6);
                            }
                        };
                        rVarH.v(objE5);
                    }
                    final er.a aVar1115 = (er.a) objE5;
                    er.a<i0> aVar1116 = aVar6;
                    f3.m mVarH15 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                    if (z16) {
                        rVarH.X(1794077610);
                        f3.m.Companion companion119 = f3.m.INSTANCE;
                        if (i56 <= 256) {
                        }
                        objE8 = rVarH.E();
                        if (z36) {
                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                            rVarH.v(objE8);
                        } else {
                            objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                            rVarH.v(objE8);
                        }
                        mVarB = z3.d.b(companion119, (z3.a) objE8, null, 2, null);
                        rVarH.R();
                    } else {
                        rVarH.X(1794092431);
                        rVarH.R();
                        mVarB = f3.m.INSTANCE;
                    }
                    f3.m mVarU15 = mVarH15.u(mVarB);
                    q1<ij> q1VarD11112 = hjVarY.d();
                    p143z0.a2 a2Var15 = p143z0.a2.Vertical;
                    if (i56 <= 256) {
                    }
                    objE6 = rVarH.E();
                    if (z29) {
                        objE6 = new p() { // from class: f2.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    } else {
                        objE6 = new p() { // from class: f2.g1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                            }
                        };
                        rVarH.v(objE6);
                    }
                    f3.m mVarA15 = z0.a(mVarU15, q1VarD11112, a2Var15, (p) objE6);
                    q1<ij> q1VarD11113 = hjVarY.d();
                    if (z16) {
                        z35 = false;
                    } else {
                        z35 = false;
                    }
                    f3.m mVarB16 = n1Var2.b(mVarA15, q1VarD11113, a2Var15, z35, false, jVar, null, rVarH, 12583296, 40);
                    zW2 = rVarH.W(strB);
                    objE7 = rVarH.E();
                    if (zW2) {
                        objE7 = new l() { // from class: f2.h1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return l1.G(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE7);
                    } else {
                        objE7 = new l() { // from class: f2.h1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return l1.G(strB, (n4.i0) obj);
                            }
                        };
                        rVarH.v(objE7);
                    }
                    final hj hjVar17 = hjVarY;
                    final boolean z3111 = z16;
                    final p pVar1113 = pVarD;
                    int i61115 = i55 >> 15;
                    androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB16, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j1111, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.H(pVar1112, f15, hjVar17, pVar1113, aVar1115, p0Var, z3111, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, (i61115 & 57344) | (i61115 & 112) | 12582912 | (i61115 & 896) | (i61115 & 7168) | (458752 & (i61114 << 15)), 64);
                    if (t.k()) {
                        t.n();
                    }
                    rVar2 = rVarH;
                    f25 = fO;
                    z18 = z16;
                    pVar4 = pVarD;
                    aVar3 = aVar1116;
                    y2Var2 = y2Var3;
                    j17 = j1111;
                    mVar3 = mVar2;
                    hjVar2 = hjVarY;
                    f27 = fN;
                    pVar3 = pVar1112;
                    f26 = fJ;
                    j18 = jE;
                } else {
                    rVarH.O();
                    j17 = j15;
                    pVar3 = pVar2;
                    rVar2 = rVarH;
                    aVar3 = aVar2;
                    f25 = f19;
                    mVar3 = mVar2;
                    hjVar2 = hjVarY;
                    z18 = z16;
                    y2Var2 = y2Var;
                    j18 = j16;
                    f26 = f17;
                    f27 = f18;
                    pVar4 = pVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.j1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i39 |= 48;
            if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
            }
            if ((i16 & 3072) != 0) {
                i39 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i48 = i39;
            if ((i35 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i35 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i35 &= -897;
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.z0
                                @Override // er.a
                                public final Object a() {
                                    return l1.z();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i26 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f19;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i35 &= -3670017;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 128) != 0) {
                        i49 = i35 & (-29360129);
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        i49 = i35;
                        jI = j15;
                    }
                    if ((i17 & 256) != 0) {
                        jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                        i55 = i49 & (-234881025);
                    } else {
                        jE = j16;
                        i55 = i49;
                    }
                    if (i36 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f17;
                    }
                    if (i38 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f18;
                    }
                    if (i46 != 0) {
                        pVarD = k3.f56525a.d();
                    } else {
                        pVarD = pVar;
                    }
                    if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                        pVar5 = new p() { // from class: f2.d1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.A((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -897;
                    } else {
                        pVar5 = pVar2;
                    }
                } else {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i35 &= -897;
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.z0
                                @Override // er.a
                                public final Object a() {
                                    return l1.z();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i26 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f19;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i35 &= -3670017;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 128) != 0) {
                        i49 = i35 & (-29360129);
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        i49 = i35;
                        jI = j15;
                    }
                    if ((i17 & 256) != 0) {
                        jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                        i55 = i49 & (-234881025);
                    } else {
                        jE = j16;
                        i55 = i49;
                    }
                    if (i36 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f17;
                    }
                    if (i38 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f18;
                    }
                    if (i46 != 0) {
                        pVarD = k3.f56525a.d();
                    } else {
                        pVarD = pVar;
                    }
                    if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                        pVar5 = new p() { // from class: f2.d1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.A((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -897;
                    } else {
                        pVar5 = pVar2;
                    }
                }
                rVarH.y();
                aVar5 = aVar4;
                if (t.k()) {
                    t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                }
                a2.Companion companion1110 = a2.INSTANCE;
                strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                f3Var = (f3) rVarH.N(g1.u());
                int i61116 = i48;
                final p pVar1114 = pVar5;
                j0 j0VarF14 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                dVar = (c5.d) rVarH.N(g1.f());
                n1Var = n1.f79921a;
                q1<ij> q1VarD11114 = hjVarY.d();
                i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                long j1112 = jI;
                if (i56 <= 256) {
                }
                objE2 = rVarH.E();
                if (z19) {
                    objE2 = new l() { // from class: f2.e1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: f2.e1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                        }
                    };
                    rVarH.v(objE2);
                }
                d3VarA = n1Var.a(q1VarD11114, (l) objE2, j0VarF14, rVarH, 3072);
                boolean zW16 = rVarH.W(d3VarA);
                if (i56 > 256) {
                    n1Var2 = n1Var;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                } else {
                    n1Var2 = n1Var;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                }
                zW = zW16 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                    aVar6 = aVar5;
                    rVarH.v(objE3);
                } else {
                    objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                    aVar6 = aVar5;
                    rVarH.v(objE3);
                }
                jVar = (j) objE3;
                objE4 = rVarH.E();
                companion = r.INSTANCE;
                if (objE4 == companion.a()) {
                    objE4 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE4);
                }
                p0Var = (p0) objE4;
                if (i56 > 256) {
                    y2Var3 = y2VarK;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                } else {
                    y2Var3 = y2VarK;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                }
                boolean zG16 = z26 | rVarH.G(p0Var);
                if ((i55 & 7168) == 2048) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = zG16 | z27;
                objE5 = rVarH.E();
                if (z28) {
                    objE5 = new er.a() { // from class: f2.f1
                        @Override // er.a
                        public final Object a() {
                            return l1.C(hjVarY, p0Var, aVar6);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new er.a() { // from class: f2.f1
                        @Override // er.a
                        public final Object a() {
                            return l1.C(hjVarY, p0Var, aVar6);
                        }
                    };
                    rVarH.v(objE5);
                }
                final er.a aVar1117 = (er.a) objE5;
                er.a<i0> aVar1118 = aVar6;
                f3.m mVarH16 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                if (z16) {
                    rVarH.X(1794077610);
                    f3.m.Companion companion1111 = f3.m.INSTANCE;
                    if (i56 <= 256) {
                    }
                    objE8 = rVarH.E();
                    if (z36) {
                        objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                        rVarH.v(objE8);
                    } else {
                        objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                        rVarH.v(objE8);
                    }
                    mVarB = z3.d.b(companion1111, (z3.a) objE8, null, 2, null);
                    rVarH.R();
                } else {
                    rVarH.X(1794092431);
                    rVarH.R();
                    mVarB = f3.m.INSTANCE;
                }
                f3.m mVarU16 = mVarH16.u(mVarB);
                q1<ij> q1VarD11115 = hjVarY.d();
                p143z0.a2 a2Var16 = p143z0.a2.Vertical;
                if (i56 <= 256) {
                }
                objE6 = rVarH.E();
                if (z29) {
                    objE6 = new p() { // from class: f2.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                        }
                    };
                    rVarH.v(objE6);
                } else {
                    objE6 = new p() { // from class: f2.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                        }
                    };
                    rVarH.v(objE6);
                }
                f3.m mVarA16 = z0.a(mVarU16, q1VarD11115, a2Var16, (p) objE6);
                q1<ij> q1VarD11116 = hjVarY.d();
                if (z16) {
                    z35 = false;
                } else {
                    z35 = false;
                }
                f3.m mVarB17 = n1Var2.b(mVarA16, q1VarD11116, a2Var16, z35, false, jVar, null, rVarH, 12583296, 40);
                zW2 = rVarH.W(strB);
                objE7 = rVarH.E();
                if (zW2) {
                    objE7 = new l() { // from class: f2.h1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return l1.G(strB, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE7);
                } else {
                    objE7 = new l() { // from class: f2.h1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return l1.G(strB, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE7);
                }
                final hj hjVar18 = hjVarY;
                final boolean z3112 = z16;
                final p pVar1115 = pVarD;
                int i61117 = i55 >> 15;
                androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB17, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j1112, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.H(pVar1114, f15, hjVar18, pVar1115, aVar1117, p0Var, z3112, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i61117 & 57344) | (i61117 & 112) | 12582912 | (i61117 & 896) | (i61117 & 7168) | (458752 & (i61116 << 15)), 64);
                if (t.k()) {
                    t.n();
                }
                rVar2 = rVarH;
                f25 = fO;
                z18 = z16;
                pVar4 = pVarD;
                aVar3 = aVar1118;
                y2Var2 = y2Var3;
                j17 = j1112;
                mVar3 = mVar2;
                hjVar2 = hjVarY;
                f27 = fN;
                pVar3 = pVar1114;
                f26 = fJ;
                j18 = jE;
            } else {
                rVarH.O();
                j17 = j15;
                pVar3 = pVar2;
                rVar2 = rVarH;
                aVar3 = aVar2;
                f25 = f19;
                mVar3 = mVar2;
                hjVar2 = hjVarY;
                z18 = z16;
                y2Var2 = y2Var;
                j18 = j16;
                f26 = f17;
                f27 = f18;
                pVar4 = pVar;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.j1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 24576;
        f19 = f16;
        i28 = i17 & 32;
        if (i28 != 0) {
            i18 |= 196608;
            z16 = z15;
        } else {
            z16 = z15;
            if ((i15 & 196608) == 0) {
                if (rVarH.a(z16)) {
                    i29 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i29 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i29;
            }
        }
        if ((i15 & 1572864) != 0) {
            if ((i17 & 64) == 0) {
                i59 = PKIFailureInfo.signerNotTrusted;
            } else {
                i59 = PKIFailureInfo.signerNotTrusted;
            }
            i18 |= i59;
        }
        if ((i15 & 12582912) == 0) {
            if ((i17 & 128) == 0) {
                i58 = i18;
                if (rVarH.d(j15)) {
                }
                i35 = i58 | i67;
            } else {
                i58 = i18;
            }
            i35 = i58 | i67;
        } else {
            i35 = i18;
        }
        if ((i15 & 100663296) != 0) {
            if ((i17 & 256) == 0) {
                i57 = 33554432;
            } else {
                i57 = 33554432;
            }
            i35 |= i57;
        }
        i36 = i17 & 512;
        if (i36 != 0) {
            i35 |= 805306368;
        } else if ((i15 & 805306368) == 0) {
            if (rVarH.b(f17)) {
                i37 = PKIFailureInfo.duplicateCertReq;
            } else {
                i37 = 268435456;
            }
            i35 |= i37;
        }
        i38 = i17 & 1024;
        if (i38 != 0) {
            i39 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (rVarH.b(f18)) {
                i45 = 4;
            } else {
                i45 = 2;
            }
            i39 = i16 | i45;
        } else {
            i39 = i16;
        }
        i46 = i17 & 2048;
        if (i46 != 0) {
            if ((i16 & 48) == 0) {
                if (rVarH.G(pVar)) {
                    i47 = 32;
                } else {
                    i47 = 16;
                }
                i39 |= i47;
            }
            if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
                i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
            }
            if ((i16 & 3072) != 0) {
                i39 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i48 = i39;
            if ((i35 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i35 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i35 &= -897;
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.z0
                                @Override // er.a
                                public final Object a() {
                                    return l1.z();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i26 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f19;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i35 &= -3670017;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 128) != 0) {
                        i49 = i35 & (-29360129);
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        i49 = i35;
                        jI = j15;
                    }
                    if ((i17 & 256) != 0) {
                        jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                        i55 = i49 & (-234881025);
                    } else {
                        jE = j16;
                        i55 = i49;
                    }
                    if (i36 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f17;
                    }
                    if (i38 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f18;
                    }
                    if (i46 != 0) {
                        pVarD = k3.f56525a.d();
                    } else {
                        pVarD = pVar;
                    }
                    if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                        pVar5 = new p() { // from class: f2.d1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.A((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -897;
                    } else {
                        pVar5 = pVar2;
                    }
                } else {
                    if (i65 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i35 &= -897;
                        hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.z0
                                @Override // er.a
                                public final Object a() {
                                    return l1.z();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i26 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f19;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 64) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i35 &= -3670017;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i17 & 128) != 0) {
                        i49 = i35 & (-29360129);
                        jI = n0.f56958a.i(rVarH, 6);
                    } else {
                        i49 = i35;
                        jI = j15;
                    }
                    if ((i17 & 256) != 0) {
                        jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                        i55 = i49 & (-234881025);
                    } else {
                        jE = j16;
                        i55 = i49;
                    }
                    if (i36 != 0) {
                        fJ = n0.f56958a.j();
                    } else {
                        fJ = f17;
                    }
                    if (i38 != 0) {
                        fN = c5.h.n(0);
                    } else {
                        fN = f18;
                    }
                    if (i46 != 0) {
                        pVarD = k3.f56525a.d();
                    } else {
                        pVarD = pVar;
                    }
                    if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                        pVar5 = new p() { // from class: f2.d1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return l1.A((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -897;
                    } else {
                        pVar5 = pVar2;
                    }
                }
                rVarH.y();
                aVar5 = aVar4;
                if (t.k()) {
                    t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
                }
                a2.Companion companion1112 = a2.INSTANCE;
                strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
                f3Var = (f3) rVarH.N(g1.u());
                int i61118 = i48;
                final p pVar1116 = pVar5;
                j0 j0VarF15 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
                dVar = (c5.d) rVarH.N(g1.f());
                n1Var = n1.f79921a;
                q1<ij> q1VarD11117 = hjVarY.d();
                i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
                long j1113 = jI;
                if (i56 <= 256) {
                }
                objE2 = rVarH.E();
                if (z19) {
                    objE2 = new l() { // from class: f2.e1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: f2.e1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                        }
                    };
                    rVarH.v(objE2);
                }
                d3VarA = n1Var.a(q1VarD11117, (l) objE2, j0VarF15, rVarH, 3072);
                boolean zW17 = rVarH.W(d3VarA);
                if (i56 > 256) {
                    n1Var2 = n1Var;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                } else {
                    n1Var2 = n1Var;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                }
                zW = zW17 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                    aVar6 = aVar5;
                    rVarH.v(objE3);
                } else {
                    objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                    aVar6 = aVar5;
                    rVarH.v(objE3);
                }
                jVar = (j) objE3;
                objE4 = rVarH.E();
                companion = r.INSTANCE;
                if (objE4 == companion.a()) {
                    objE4 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE4);
                }
                p0Var = (p0) objE4;
                if (i56 > 256) {
                    y2Var3 = y2VarK;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                } else {
                    y2Var3 = y2VarK;
                    if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                }
                boolean zG17 = z26 | rVarH.G(p0Var);
                if ((i55 & 7168) == 2048) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = zG17 | z27;
                objE5 = rVarH.E();
                if (z28) {
                    objE5 = new er.a() { // from class: f2.f1
                        @Override // er.a
                        public final Object a() {
                            return l1.C(hjVarY, p0Var, aVar6);
                        }
                    };
                    rVarH.v(objE5);
                } else {
                    objE5 = new er.a() { // from class: f2.f1
                        @Override // er.a
                        public final Object a() {
                            return l1.C(hjVarY, p0Var, aVar6);
                        }
                    };
                    rVarH.v(objE5);
                }
                final er.a aVar1119 = (er.a) objE5;
                er.a<i0> aVar11110 = aVar6;
                f3.m mVarH17 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
                if (z16) {
                    rVarH.X(1794077610);
                    f3.m.Companion companion1113 = f3.m.INSTANCE;
                    if (i56 <= 256) {
                    }
                    objE8 = rVarH.E();
                    if (z36) {
                        objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                        rVarH.v(objE8);
                    } else {
                        objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                        rVarH.v(objE8);
                    }
                    mVarB = z3.d.b(companion1113, (z3.a) objE8, null, 2, null);
                    rVarH.R();
                } else {
                    rVarH.X(1794092431);
                    rVarH.R();
                    mVarB = f3.m.INSTANCE;
                }
                f3.m mVarU17 = mVarH17.u(mVarB);
                q1<ij> q1VarD11118 = hjVarY.d();
                p143z0.a2 a2Var17 = p143z0.a2.Vertical;
                if (i56 <= 256) {
                }
                objE6 = rVarH.E();
                if (z29) {
                    objE6 = new p() { // from class: f2.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                        }
                    };
                    rVarH.v(objE6);
                } else {
                    objE6 = new p() { // from class: f2.g1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                        }
                    };
                    rVarH.v(objE6);
                }
                f3.m mVarA17 = z0.a(mVarU17, q1VarD11118, a2Var17, (p) objE6);
                q1<ij> q1VarD11119 = hjVarY.d();
                if (z16) {
                    z35 = false;
                } else {
                    z35 = false;
                }
                f3.m mVarB18 = n1Var2.b(mVarA17, q1VarD11119, a2Var17, z35, false, jVar, null, rVarH, 12583296, 40);
                zW2 = rVarH.W(strB);
                objE7 = rVarH.E();
                if (zW2) {
                    objE7 = new l() { // from class: f2.h1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return l1.G(strB, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE7);
                } else {
                    objE7 = new l() { // from class: f2.h1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return l1.G(strB, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE7);
                }
                final hj hjVar19 = hjVarY;
                final boolean z3113 = z16;
                final p pVar1117 = pVarD;
                int i61119 = i55 >> 15;
                androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB18, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j1113, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.H(pVar1116, f15, hjVar19, pVar1117, aVar1119, p0Var, z3113, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i61119 & 57344) | (i61119 & 112) | 12582912 | (i61119 & 896) | (i61119 & 7168) | (458752 & (i61118 << 15)), 64);
                if (t.k()) {
                    t.n();
                }
                rVar2 = rVarH;
                f25 = fO;
                z18 = z16;
                pVar4 = pVarD;
                aVar3 = aVar11110;
                y2Var2 = y2Var3;
                j17 = j1113;
                mVar3 = mVar2;
                hjVar2 = hjVarY;
                f27 = fN;
                pVar3 = pVar1116;
                f26 = fJ;
                j18 = jE;
            } else {
                rVarH.O();
                j17 = j15;
                pVar3 = pVar2;
                rVar2 = rVarH;
                aVar3 = aVar2;
                f25 = f19;
                mVar3 = mVar2;
                hjVar2 = hjVarY;
                z18 = z16;
                y2Var2 = y2Var;
                j18 = j16;
                f26 = f17;
                f27 = f18;
                pVar4 = pVar;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.j1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i39 |= 48;
        if ((i16 & MLKEMEngine.KyberPolyBytes) != 0) {
            i39 |= ((i17 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.G(pVar2)) ? 128 : 256;
        }
        if ((i16 & 3072) != 0) {
            i39 |= rVarH.G(qVar) ? 2048 : 1024;
        }
        i48 = i39;
        if ((i35 & 306783379) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (rVarH.r(z17, i35 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i65 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if ((i17 & 4) != 0) {
                    i35 &= -897;
                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                }
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.a() { // from class: f2.z0
                            @Override // er.a
                            public final Object a() {
                                return l1.z();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar4 = (er.a) objE;
                } else {
                    aVar4 = aVar2;
                }
                if (i26 != 0) {
                    fO = n0.f56958a.o();
                } else {
                    fO = f19;
                }
                if (i28 != 0) {
                    z16 = true;
                }
                if ((i17 & 64) != 0) {
                    y2VarK = n0.f56958a.k(rVarH, 6);
                    i35 &= -3670017;
                } else {
                    y2VarK = y2Var;
                }
                if ((i17 & 128) != 0) {
                    i49 = i35 & (-29360129);
                    jI = n0.f56958a.i(rVarH, 6);
                } else {
                    i49 = i35;
                    jI = j15;
                }
                if ((i17 & 256) != 0) {
                    jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                    i55 = i49 & (-234881025);
                } else {
                    jE = j16;
                    i55 = i49;
                }
                if (i36 != 0) {
                    fJ = n0.f56958a.j();
                } else {
                    fJ = f17;
                }
                if (i38 != 0) {
                    fN = c5.h.n(0);
                } else {
                    fN = f18;
                }
                if (i46 != 0) {
                    pVarD = k3.f56525a.d();
                } else {
                    pVarD = pVar;
                }
                if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                    pVar5 = new p() { // from class: f2.d1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.A((r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    i48 &= -897;
                } else {
                    pVar5 = pVar2;
                }
            } else {
                if (i65 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if ((i17 & 4) != 0) {
                    i35 &= -897;
                    hjVarY = C6454df.y(false, null, rVarH, 0, 3);
                }
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.a() { // from class: f2.z0
                            @Override // er.a
                            public final Object a() {
                                return l1.z();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar4 = (er.a) objE;
                } else {
                    aVar4 = aVar2;
                }
                if (i26 != 0) {
                    fO = n0.f56958a.o();
                } else {
                    fO = f19;
                }
                if (i28 != 0) {
                    z16 = true;
                }
                if ((i17 & 64) != 0) {
                    y2VarK = n0.f56958a.k(rVarH, 6);
                    i35 &= -3670017;
                } else {
                    y2VarK = y2Var;
                }
                if ((i17 & 128) != 0) {
                    i49 = i35 & (-29360129);
                    jI = n0.f56958a.i(rVarH, 6);
                } else {
                    i49 = i35;
                    jI = j15;
                }
                if ((i17 & 256) != 0) {
                    jE = g2.e(jI, rVarH, (i49 >> 21) & 14);
                    i55 = i49 & (-234881025);
                } else {
                    jE = j16;
                    i55 = i49;
                }
                if (i36 != 0) {
                    fJ = n0.f56958a.j();
                } else {
                    fJ = f17;
                }
                if (i38 != 0) {
                    fN = c5.h.n(0);
                } else {
                    fN = f18;
                }
                if (i46 != 0) {
                    pVarD = k3.f56525a.d();
                } else {
                    pVarD = pVar;
                }
                if ((i17 & PKIFailureInfo.certConfirmed) != 0) {
                    pVar5 = new p() { // from class: f2.d1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return l1.A((r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    i48 &= -897;
                } else {
                    pVar5 = pVar2;
                }
            }
            rVarH.y();
            aVar5 = aVar4;
            if (t.k()) {
                t.o(-780255289, i55, i48, "androidx.compose.material3.BottomSheetImpl (BottomSheet.kt:204)");
            }
            a2.Companion companion1114 = a2.INSTANCE;
            strB = b2.b(a2.a(ih.f56315e), rVarH, 0);
            f3Var = (f3) rVarH.N(g1.u());
            int i611110 = i48;
            final p pVar1118 = pVar5;
            j0 j0VarF16 = androidx.compose.material3.d.f9816a.c(rVarH, 6).f();
            dVar = (c5.d) rVarH.N(g1.f());
            n1Var = n1.f79921a;
            q1<ij> q1VarD111110 = hjVarY.d();
            i56 = (i55 & 896) ^ MLKEMEngine.KyberPolyBytes;
            long j1114 = jI;
            if (i56 <= 256) {
            }
            objE2 = rVarH.E();
            if (z19) {
                objE2 = new l() { // from class: f2.e1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new l() { // from class: f2.e1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Float.valueOf(l1.B(hjVarY, ((Float) obj).floatValue()));
                    }
                };
                rVarH.v(objE2);
            }
            d3VarA = n1Var.a(q1VarD111110, (l) objE2, j0VarF16, rVarH, 3072);
            boolean zW18 = rVarH.W(d3VarA);
            if (i56 > 256) {
                n1Var2 = n1Var;
                if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
            } else {
                n1Var2 = n1Var;
                if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
            }
            zW = zW18 | z25 | rVarH.W(f3Var) | rVarH.W(dVar);
            objE3 = rVarH.E();
            if (zW) {
                objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                aVar6 = aVar5;
                rVarH.v(objE3);
            } else {
                objE3 = new j(f3Var, hjVarY, dVar, d3VarA, aVar5);
                aVar6 = aVar5;
                rVarH.v(objE3);
            }
            jVar = (j) objE3;
            objE4 = rVarH.E();
            companion = r.INSTANCE;
            if (objE4 == companion.a()) {
                objE4 = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE4);
            }
            p0Var = (p0) objE4;
            if (i56 > 256) {
                y2Var3 = y2VarK;
                if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
            } else {
                y2Var3 = y2VarK;
                if ((i55 & MLKEMEngine.KyberPolyBytes) != 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
            }
            boolean zG18 = z26 | rVarH.G(p0Var);
            if ((i55 & 7168) == 2048) {
                z27 = true;
            } else {
                z27 = false;
            }
            z28 = zG18 | z27;
            objE5 = rVarH.E();
            if (z28) {
                objE5 = new er.a() { // from class: f2.f1
                    @Override // er.a
                    public final Object a() {
                        return l1.C(hjVarY, p0Var, aVar6);
                    }
                };
                rVarH.v(objE5);
            } else {
                objE5 = new er.a() { // from class: f2.f1
                    @Override // er.a
                    public final Object a() {
                        return l1.C(hjVarY, p0Var, aVar6);
                    }
                };
                rVarH.v(objE5);
            }
            final er.a aVar11111 = (er.a) objE5;
            er.a<i0> aVar11112 = aVar6;
            f3.m mVarH18 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.A(mVar2, 0.0f, fO, 1, null), 0.0f, 1, null);
            if (z16) {
                rVarH.X(1794077610);
                f3.m.Companion companion1115 = f3.m.INSTANCE;
                if (i56 <= 256) {
                }
                objE8 = rVarH.E();
                if (z36) {
                    objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                    rVarH.v(objE8);
                } else {
                    objE8 = ej.j(hjVarY, p143z0.a2.Vertical, jVar);
                    rVarH.v(objE8);
                }
                mVarB = z3.d.b(companion1115, (z3.a) objE8, null, 2, null);
                rVarH.R();
            } else {
                rVarH.X(1794092431);
                rVarH.R();
                mVarB = f3.m.INSTANCE;
            }
            f3.m mVarU18 = mVarH18.u(mVarB);
            q1<ij> q1VarD111111 = hjVarY.d();
            p143z0.a2 a2Var18 = p143z0.a2.Vertical;
            if (i56 <= 256) {
            }
            objE6 = rVarH.E();
            if (z29) {
                objE6 = new p() { // from class: f2.g1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                    }
                };
                rVarH.v(objE6);
            } else {
                objE6 = new p() { // from class: f2.g1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l1.E(hjVarY, (c5.r) obj, (b) obj2);
                    }
                };
                rVarH.v(objE6);
            }
            f3.m mVarA18 = z0.a(mVarU18, q1VarD111111, a2Var18, (p) objE6);
            q1<ij> q1VarD111112 = hjVarY.d();
            if (z16) {
                z35 = false;
            } else {
                z35 = false;
            }
            f3.m mVarB19 = n1Var2.b(mVarA18, q1VarD111112, a2Var18, z35, false, jVar, null, rVarH, 12583296, 40);
            zW2 = rVarH.W(strB);
            objE7 = rVarH.E();
            if (zW2) {
                objE7 = new l() { // from class: f2.h1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l1.G(strB, (n4.i0) obj);
                    }
                };
                rVarH.v(objE7);
            } else {
                objE7 = new l() { // from class: f2.h1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l1.G(strB, (n4.i0) obj);
                    }
                };
                rVarH.v(objE7);
            }
            final hj hjVar110 = hjVarY;
            final boolean z3114 = z16;
            final p pVar1119 = pVarD;
            int i611111 = i55 >> 15;
            androidx.compose.material3.l.g(ej.x(Y(v.d(mVarB19, false, (l) objE7, 1, null), hjVarY, f15), hjVarY), y2Var3, j1114, jE, fJ, fN, null, y2.m.d(1483196812, true, new p() { // from class: f2.i1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l1.H(pVar1118, f15, hjVar110, pVar1119, aVar11111, p0Var, z3114, qVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, (i611111 & 57344) | (i611111 & 112) | 12582912 | (i611111 & 896) | (i611111 & 7168) | (458752 & (i611110 << 15)), 64);
            if (t.k()) {
                t.n();
            }
            rVar2 = rVarH;
            f25 = fO;
            z18 = z16;
            pVar4 = pVarD;
            aVar3 = aVar11112;
            y2Var2 = y2Var3;
            j17 = j1114;
            mVar3 = mVar2;
            hjVar2 = hjVarY;
            f27 = fN;
            pVar3 = pVar1118;
            f26 = fJ;
            j18 = jE;
        } else {
            rVarH.O();
            j17 = j15;
            pVar3 = pVar2;
            rVar2 = rVarH;
            aVar3 = aVar2;
            f25 = f19;
            mVar3 = mVar2;
            hjVar2 = hjVarY;
            z18 = z16;
            y2Var2 = y2Var;
            j18 = j16;
            f26 = f17;
            f27 = f18;
            pVar4 = pVar;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.j1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l1.N(f15, mVar3, hjVar2, aVar3, f25, z18, y2Var2, j17, j18, f26, f27, pVar4, pVar3, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z() {
        return i0.f148189a;
    }
}
