package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.node.Owner;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001J<\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/z0;", "", "Landroidx/compose/ui/node/Owner;", "owner", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/m2;", "Ltq/e;", "", "session", "c", "(Landroidx/compose/ui/node/Owner;Ler/p;Ltq/e;)Ljava/lang/Object;", "a", "Landroidx/compose/ui/platform/z0;", "parent", "Landroidx/compose/ui/platform/h2;", "<set-?>", "b", "Lm2/a3;", "()Landroidx/compose/ui/platform/h2;", "setInterceptor", "(Landroidx/compose/ui/platform/h2;)V", "interceptor", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z0 parent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 interceptor;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f10879d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10881f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f10879d = obj;
            this.f10881f |= PKIFailureInfo.systemUnavail;
            return z0.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/m2;", "", "<anonymous>", "(Landroidx/compose/ui/platform/m2;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<m2, tq.e<?>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f10883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.p<m2, tq.e<?>, Object> f10884g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ z0 f10885h;

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/compose/ui/platform/z0$b$a", "Landroidx/compose/ui/platform/m2;", "Landroidx/compose/ui/platform/i2;", "request", "", "a", "(Landroidx/compose/ui/platform/i2;Ltq/e;)Ljava/lang/Object;", "Landroid/view/View;", "m", "()Landroid/view/View;", "view", "Ltq/i;", "getCoroutineContext", "()Ltq/i;", "coroutineContext", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements m2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ m2 f10886a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m2 f10887b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AtomicReference<f3.s.a<oq.i0>> f10888c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ z0 f10889d;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.z0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class C0231a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f10890d;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f10892f;

                C0231a(tq.e<? super C0231a> eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f10890d = obj;
                    this.f10892f |= PKIFailureInfo.systemUnavail;
                    return a.this.a(null, this);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.z0$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "it", "Loq/i0;", "c", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C0232b extends fr.w implements er.l<ju.p0, oq.i0> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final C0232b f10893b = new C0232b();

                C0232b() {
                    super(1);
                }

                @Override // er.l
                public /* bridge */ /* synthetic */ oq.i0 b(ju.p0 p0Var) {
                    c(p0Var);
                    return oq.i0.f148189a;
                }

                public final void c(ju.p0 p0Var) {
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loq/i0;", "it", "", "<anonymous>", "(V)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
            static final class c extends vq.k implements er.p<oq.i0, tq.e<?>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f10894e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ z0 f10895f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ i2 f10896g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ m2 f10897h;

                /* JADX INFO: renamed from: androidx.compose.ui.platform.z0$b$a$c$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/h2;", "c", "()Landroidx/compose/ui/platform/h2;"}, k = 3, mv = {2, 1, 0})
                static final class C0233a extends fr.w implements er.a<h2> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ z0 f10898b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0233a(z0 z0Var) {
                        super(0);
                        this.f10898b = z0Var;
                    }

                    @Override // er.a
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final h2 a() {
                        return this.f10898b.b();
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.ui.platform.z0$b$a$c$b, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/h2;", "interceptor", "Loq/i0;", "<anonymous>", "(Landroidx/compose/ui/platform/h2;)V"}, k = 3, mv = {2, 1, 0})
                static final class C0234b extends vq.k implements er.p<h2, tq.e<? super oq.i0>, Object> {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f10899e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    /* synthetic */ Object f10900f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ i2 f10901g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    final /* synthetic */ m2 f10902h;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0234b(i2 i2Var, m2 m2Var, tq.e<? super C0234b> eVar) {
                        super(2, eVar);
                        this.f10901g = i2Var;
                        this.f10902h = m2Var;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) throws Throwable {
                        Object objE = uq.b.e();
                        int i15 = this.f10899e;
                        if (i15 == 0) {
                            oq.u.b(obj);
                            h2 h2Var = (h2) this.f10900f;
                            i2 i2Var = this.f10901g;
                            m2 m2Var = this.f10902h;
                            this.f10899e = 1;
                            if (h2Var.a(i2Var, m2Var, this) == objE) {
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
                    public final Object B(h2 h2Var, tq.e<? super oq.i0> eVar) {
                        return ((C0234b) v(h2Var, eVar)).J(oq.i0.f148189a);
                    }

                    @Override // vq.a
                    public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                        C0234b c0234b = new C0234b(this.f10901g, this.f10902h, eVar);
                        c0234b.f10900f = obj;
                        return c0234b;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(z0 z0Var, i2 i2Var, m2 m2Var, tq.e<? super c> eVar) {
                    super(2, eVar);
                    this.f10895f = z0Var;
                    this.f10896g = i2Var;
                    this.f10897h = m2Var;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f10894e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        mu.g gVarQ = x5.q(new C0233a(this.f10895f));
                        C0234b c0234b = new C0234b(this.f10896g, this.f10897h, null);
                        this.f10894e = 1;
                        if (mu.i.j(gVarQ, c0234b, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                    }
                    throw new IllegalStateException("Interceptors flow should never terminate.");
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(oq.i0 i0Var, tq.e<?> eVar) {
                    return ((c) v(i0Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    return new c(this.f10895f, this.f10896g, this.f10897h, eVar);
                }
            }

            a(m2 m2Var, AtomicReference<f3.s.a<oq.i0>> atomicReference, z0 z0Var) {
                this.f10887b = m2Var;
                this.f10888c = atomicReference;
                this.f10889d = z0Var;
                this.f10886a = m2Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // androidx.compose.ui.platform.l2
            public Object a(i2 i2Var, tq.e<?> eVar) throws Throwable {
                C0231a c0231a;
                if (eVar instanceof C0231a) {
                    c0231a = (C0231a) eVar;
                    int i15 = c0231a.f10892f;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0231a.f10892f = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0231a = new C0231a(eVar);
                    }
                } else {
                    c0231a = new C0231a(eVar);
                }
                Object obj = c0231a.f10890d;
                Object objE = uq.b.e();
                int i16 = c0231a.f10892f;
                if (i16 == 0) {
                    oq.u.b(obj);
                    AtomicReference<f3.s.a<oq.i0>> atomicReference = this.f10888c;
                    C0232b c0232b = C0232b.f10893b;
                    c cVar = new c(this.f10889d, i2Var, this.f10887b, null);
                    c0231a.f10892f = 1;
                    if (f3.s.d(atomicReference, c0232b, cVar, c0231a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                throw new oq.g();
            }

            @Override // ju.p0
            public tq.i getCoroutineContext() {
                return this.f10886a.getCoroutineContext();
            }

            @Override // androidx.compose.ui.platform.l2
            /* JADX INFO: renamed from: m */
            public View getView() {
                return this.f10886a.getView();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.p<? super m2, ? super tq.e<?>, ? extends Object> pVar, z0 z0Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f10884g = pVar;
            this.f10885h = z0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f10882e;
            if (i15 == 0) {
                oq.u.b(obj);
                a aVar = new a((m2) this.f10883f, f3.s.a(), this.f10885h);
                er.p<m2, tq.e<?>, Object> pVar = this.f10884g;
                this.f10882e = 1;
                if (pVar.B(aVar, this) == objE) {
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
        public final Object B(m2 m2Var, tq.e<?> eVar) {
            return ((b) v(m2Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f10884g, this.f10885h, eVar);
            bVar.f10883f = obj;
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h2 b() {
        return (h2) this.interceptor.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Owner owner, er.p<? super m2, ? super tq.e<?>, ? extends Object> pVar, tq.e<?> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f10881f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f10881f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f10879d;
        Object objE = uq.b.e();
        int i16 = aVar.f10881f;
        if (i16 == 0) {
            oq.u.b(obj);
            z0 z0Var = this.parent;
            b bVar = new b(pVar, this, null);
            aVar.f10881f = 1;
            if (k2.c(owner, z0Var, bVar, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        throw new oq.g();
    }
}
