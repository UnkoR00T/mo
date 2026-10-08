package x1;

import androidx.compose.ui.platform.l2;
import java.util.List;
import ju.d2;
import n3.g2;
import p071kotlin.Metadata;
import q4.TextLayoutResult;
import v4.ImeOptions;
import v4.TextFieldValue;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJM\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJK\u0010(\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0003R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00102R\u001c\u00106\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lx1/c;", "Lx1/k1;", "<init>", "()V", "Lkotlin/Function1;", "Lx1/p1;", "Loq/i0;", "initializeRequest", "r", "(Ler/l;)V", "Lv4/t0;", "value", "Lv4/u;", "imeOptions", "", "Lv4/j;", "onEditCommand", "Lv4/t;", "onImeActionPerformed", "g", "(Lv4/t0;Lv4/u;Ler/l;Ler/l;)V", "a", "b", "oldValue", "newValue", "d", "(Lv4/t0;Lv4/t0;)V", "Lm3/g;", "rect", "e", "(Lm3/g;)V", "textFieldValue", "Lv4/i0;", "offsetMapping", "Lq4/t3;", "textLayoutResult", "Ln3/g2;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "h", "(Lv4/t0;Lv4/i0;Lq4/t3;Ler/l;Lm3/g;Lm3/g;)V", "k", "Lju/d2;", "Lju/d2;", "job", "c", "Lx1/p1;", "currentRequest", "Lmu/a0;", "Lmu/a0;", "backingStylusHandwritingTrigger", "q", "()Lmu/a0;", "stylusHandwritingTrigger", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends k1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private d2 job;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private p1 currentRequest;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private mu.a0<oq.i0> backingStylusHandwritingTrigger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/l2;", "", "<anonymous>", "(Landroidx/compose/ui/platform/l2;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<l2, tq.e<?>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f216305f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.l<p1, oq.i0> f216306g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ c f216307h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k1.a f216308j;

        /* JADX INFO: renamed from: x1.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        static final class C5759a extends vq.k implements er.p<ju.p0, tq.e<?>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f216309e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f216310f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ l2 f216311g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ er.l<p1, oq.i0> f216312h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c f216313j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ k1.a f216314k;

            /* JADX INFO: renamed from: x1.c$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C5760a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f216315e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ c f216316f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ c1 f216317g;

                /* JADX INFO: renamed from: x1.c$a$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                static final class C5761a<T> implements mu.h {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ c1 f216318a;

                    C5761a(c1 c1Var) {
                        this.f216318a = c1Var;
                    }

                    @Override // mu.h
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object F(oq.i0 i0Var, tq.e<? super oq.i0> eVar) {
                        this.f216318a.c();
                        return oq.i0.f148189a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C5760a(c cVar, c1 c1Var, tq.e<? super C5760a> eVar) {
                    super(2, eVar);
                    this.f216316f = cVar;
                    this.f216317g = c1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final oq.i0 O(long j15) {
                    return oq.i0.f148189a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
                
                    if (r5.a(r1, r4) == r0) goto L17;
                 */
                @Override // vq.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        java.lang.Object r0 = uq.b.e()
                        int r1 = r4.f216315e
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 == r2) goto L16
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L16:
                        oq.u.b(r5)
                        goto L47
                    L1a:
                        oq.u.b(r5)
                        goto L2f
                    L1e:
                        oq.u.b(r5)
                        x1.b r5 = new x1.b
                        r5.<init>()
                        r4.f216315e = r3
                        java.lang.Object r5 = p076m2.n2.b(r5, r4)
                        if (r5 != r0) goto L2f
                        goto L46
                    L2f:
                        x1.c r5 = r4.f216316f
                        mu.a0 r5 = x1.c.n(r5)
                        if (r5 == 0) goto L4d
                        x1.c$a$a$a$a r1 = new x1.c$a$a$a$a
                        x1.c1 r3 = r4.f216317g
                        r1.<init>(r3)
                        r4.f216315e = r2
                        java.lang.Object r5 = r5.a(r1, r4)
                        if (r5 != r0) goto L47
                    L46:
                        return r0
                    L47:
                        oq.g r5 = new oq.g
                        r5.<init>()
                        throw r5
                    L4d:
                        oq.i0 r5 = oq.i0.f148189a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: x1.c.a.C5759a.C5760a.J(java.lang.Object):java.lang.Object");
                }

                @Override // er.p
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                    return ((C5760a) v(p0Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    return new C5760a(this.f216316f, this.f216317g, eVar);
                }
            }

            /* JADX INFO: renamed from: x1.c$a$a$b */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final /* synthetic */ class b extends fr.q implements er.l<g2, oq.i0> {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ k1.a f216319j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(k1.a aVar) {
                    super(1, fr.t.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.f216319j = aVar;
                }

                public final void E(float[] fArr) {
                    c.t(this.f216319j, fArr);
                }

                @Override // er.l
                public /* bridge */ /* synthetic */ oq.i0 b(g2 g2Var) {
                    E(g2Var.getValues());
                    return oq.i0.f148189a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C5759a(l2 l2Var, er.l<? super p1, oq.i0> lVar, c cVar, k1.a aVar, tq.e<? super C5759a> eVar) {
                super(2, eVar);
                this.f216311g = l2Var;
                this.f216312h = lVar;
                this.f216313j = cVar;
                this.f216314k = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f216309e;
                try {
                    if (i15 == 0) {
                        oq.u.b(obj);
                        ju.p0 p0Var = (ju.p0) this.f216310f;
                        c1 c1VarB = l1.c().b(this.f216311g.m());
                        p1 p1Var = new p1(this.f216311g.m(), new b(this.f216314k), c1VarB);
                        if (v1.d.a()) {
                            ju.k.d(p0Var, null, null, new C5760a(this.f216313j, c1VarB, null), 3, null);
                        }
                        er.l<p1, oq.i0> lVar = this.f216312h;
                        if (lVar != null) {
                            lVar.b(p1Var);
                        }
                        this.f216313j.currentRequest = p1Var;
                        l2 l2Var = this.f216311g;
                        this.f216309e = 1;
                        if (l2Var.a(p1Var, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                    }
                    throw new oq.g();
                } catch (Throwable th4) {
                    this.f216313j.currentRequest = null;
                    throw th4;
                }
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<?> eVar) {
                return ((C5759a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                C5759a c5759a = new C5759a(this.f216311g, this.f216312h, this.f216313j, this.f216314k, eVar);
                c5759a.f216310f = obj;
                return c5759a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.l<? super p1, oq.i0> lVar, c cVar, k1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f216306g = lVar;
            this.f216307h = cVar;
            this.f216308j = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f216304e;
            if (i15 == 0) {
                oq.u.b(obj);
                C5759a c5759a = new C5759a((l2) this.f216305f, this.f216306g, this.f216307h, this.f216308j, null);
                this.f216304e = 1;
                if (ju.q0.e(c5759a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            throw new oq.g();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(l2 l2Var, tq.e<?> eVar) {
            return ((a) v(l2Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f216306g, this.f216307h, this.f216308j, eVar);
            aVar.f216305f = obj;
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mu.a0<oq.i0> q() {
        mu.a0<oq.i0> a0Var = this.backingStylusHandwritingTrigger;
        if (a0Var != null) {
            return a0Var;
        }
        if (!v1.d.a()) {
            return null;
        }
        mu.a0<oq.i0> a0VarB = mu.h0.b(1, 0, lu.a.DROP_LATEST, 2, null);
        this.backingStylusHandwritingTrigger = a0VarB;
        return a0VarB;
    }

    private final void r(er.l<? super p1, oq.i0> initializeRequest) {
        k1.a textInputModifierNode = getTextInputModifierNode();
        if (textInputModifierNode == null) {
            return;
        }
        this.job = textInputModifierNode.C1(new a(initializeRequest, this, textInputModifierNode, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(TextFieldValue textFieldValue, c cVar, ImeOptions imeOptions, er.l lVar, er.l lVar2, p1 p1Var) {
        p1Var.q(textFieldValue, cVar.getTextInputModifierNode(), imeOptions, lVar, lVar2);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(k1.a aVar, float[] fArr) {
        p036e4.b0 b0VarP0 = aVar.P0();
        if (b0VarP0 != null) {
            if (!b0VarP0.c()) {
                b0VarP0 = null;
            }
            if (b0VarP0 == null) {
                return;
            }
            b0VarP0.d0(fArr);
        }
    }

    @Override // v4.m0
    public void a() {
        r(null);
    }

    @Override // v4.m0
    public void b() {
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.job = null;
        mu.a0<oq.i0> a0VarQ = q();
        if (a0VarQ != null) {
            a0VarQ.u();
        }
    }

    @Override // v4.m0
    public void d(TextFieldValue oldValue, TextFieldValue newValue) {
        p1 p1Var = this.currentRequest;
        if (p1Var != null) {
            p1Var.r(oldValue, newValue);
        }
    }

    @Override // v4.m0
    public void e(m3.g rect) {
        p1 p1Var = this.currentRequest;
        if (p1Var != null) {
            p1Var.m(rect);
        }
    }

    @Override // v4.m0
    public void g(final TextFieldValue value, final ImeOptions imeOptions, final er.l<? super List<? extends v4.j>, oq.i0> onEditCommand, final er.l<? super v4.t, oq.i0> onImeActionPerformed) {
        r(new er.l() { // from class: x1.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.s(value, this, imeOptions, onEditCommand, onImeActionPerformed, (p1) obj);
            }
        });
    }

    @Override // v4.m0
    public void h(TextFieldValue textFieldValue, v4.i0 offsetMapping, TextLayoutResult textLayoutResult, er.l<? super g2, oq.i0> textFieldToRootTransform, m3.g innerTextFieldBounds, m3.g decorationBoxBounds) {
        p1 p1Var = this.currentRequest;
        if (p1Var != null) {
            p1Var.s(textFieldValue, offsetMapping, textLayoutResult, innerTextFieldBounds, decorationBoxBounds);
        }
    }

    @Override // x1.k1
    public void k() {
        mu.a0<oq.i0> a0VarQ = q();
        if (a0VarQ != null) {
            a0VarQ.f(oq.i0.f148189a);
        }
    }
}
