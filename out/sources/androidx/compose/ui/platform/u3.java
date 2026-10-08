package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import p071kotlin.Metadata;
import p076m2.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/ui/platform/u3;", "Lm2/u;", "Landroidx/lifecycle/n;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "original", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lm2/u;)V", "Lkotlin/Function0;", "Loq/i0;", "content", "h", "(Ler/p;)V", "j", "()V", "Landroidx/lifecycle/q;", "source", "Landroidx/lifecycle/j$a;", "event", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "F", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Lm2/u;", "E", "()Lm2/u;", "", "c", "Z", "disposed", "Landroidx/lifecycle/j;", "d", "Landroidx/lifecycle/j;", "addedToLifecycle", "e", "Ler/p;", "lastContent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u3 implements p076m2.u, androidx.p016lifecycle.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView owner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p076m2.u original;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private androidx.p016lifecycle.j addedToLifecycle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private er.p<? super p076m2.r, ? super Integer, oq.i0> lastContent = d1.f10438a.a();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/e1;", "composeViewContext", "Loq/i0;", "e", "(Landroidx/compose/ui/platform/e1;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<e1, oq.i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.p<p076m2.r, Integer, oq.i0> f10795c;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.u3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
        static final class C0229a extends fr.w implements er.p<p076m2.r, Integer, oq.i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u3 f10796b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e1 f10797c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ er.p<p076m2.r, Integer, oq.i0> f10798d;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.u3$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C0230a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f10799e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ u3 f10800f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0230a(u3 u3Var, tq.e<? super C0230a> eVar) {
                    super(2, eVar);
                    this.f10800f = u3Var;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f10799e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        AndroidComposeView owner = this.f10800f.getOwner();
                        this.f10799e = 1;
                        if (owner.w0(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                    }
                    return oq.i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                    return ((C0230a) v(p0Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    return new C0230a(this.f10800f, eVar);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.u3$a$a$b */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f10801e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ u3 f10802f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(u3 u3Var, tq.e<? super b> eVar) {
                    super(2, eVar);
                    this.f10802f = u3Var;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f10801e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        AndroidComposeView owner = this.f10802f.getOwner();
                        this.f10801e = 1;
                        if (owner.x0(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                    }
                    return oq.i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                    return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    return new b(this.f10802f, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0229a(u3 u3Var, e1 e1Var, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar) {
                super(2);
                this.f10796b = u3Var;
                this.f10797c = e1Var;
                this.f10798d = pVar;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ oq.i0 B(p076m2.r rVar, Integer num) {
                c(rVar, num.intValue());
                return oq.i0.f148189a;
            }

            public final void c(p076m2.r rVar, int i15) {
                if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                    rVar.O();
                    return;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1723985096, i15, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:126)");
                }
                AndroidComposeView owner = this.f10796b.getOwner();
                boolean zG = rVar.G(this.f10796b);
                u3 u3Var = this.f10796b;
                Object objE = rVar.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new C0230a(u3Var, null);
                    rVar.v(objE);
                }
                Function0.d(owner, (er.p) objE, rVar, 0);
                AndroidComposeView owner2 = this.f10796b.getOwner();
                boolean zG2 = rVar.G(this.f10796b);
                u3 u3Var2 = this.f10796b;
                Object objE2 = rVar.E();
                if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new b(u3Var2, null);
                    rVar.v(objE2);
                }
                Function0.d(owner2, (er.p) objE2, rVar, 0);
                this.f10797c.a(this.f10796b.getOwner(), this.f10798d, rVar, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.p<? super p076m2.r, ? super Integer, oq.i0> pVar) {
            super(1);
            this.f10795c = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(u3 u3Var, androidx.p016lifecycle.j jVar) {
            if (u3Var.disposed) {
                return;
            }
            u3Var.addedToLifecycle = jVar;
            jVar.a(u3Var);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(e1 e1Var) {
            e(e1Var);
            return oq.i0.f148189a;
        }

        public final void e(e1 e1Var) {
            if (u3.this.disposed) {
                return;
            }
            final androidx.p016lifecycle.j lifecycleRegistry = e1Var.getLifecycleOwner().getLifecycleRegistry();
            u3.this.lastContent = this.f10795c;
            if (u3.this.addedToLifecycle != null) {
                if (lifecycleRegistry.getState().e(androidx.lifecycle.j.b.CREATED)) {
                    u3.this.getOriginal().h(y2.m.b(-1723985096, true, new C0229a(u3.this, e1Var, this.f10795c)));
                }
            } else if (fr.t.c(Looper.myLooper(), e1Var.getView().getHandler().getLooper())) {
                u3.this.addedToLifecycle = lifecycleRegistry;
                lifecycleRegistry.a(u3.this);
            } else {
                View view = e1Var.getView();
                final u3 u3Var = u3.this;
                view.post(new Runnable() { // from class: androidx.compose.ui.platform.t3
                    @Override // java.lang.Runnable
                    public final void run() {
                        u3.a.f(u3Var, lifecycleRegistry);
                    }
                });
            }
        }
    }

    public u3(AndroidComposeView androidComposeView, p076m2.u uVar) {
        this.owner = androidComposeView;
        this.original = uVar;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final p076m2.u getOriginal() {
        return this.original;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // p076m2.u
    public void h(er.p<? super p076m2.r, ? super Integer, oq.i0> content) {
        this.owner.setOnReadyForComposition(new a(content));
    }

    @Override // p076m2.u
    public void j() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(f3.p.N, null);
            androidx.p016lifecycle.j jVar = this.addedToLifecycle;
            if (jVar != null) {
                jVar.d(this);
            }
            this.addedToLifecycle = null;
        }
        this.original.j();
    }

    @Override // androidx.p016lifecycle.n
    public void m(androidx.p016lifecycle.q source, androidx.lifecycle.j.a event) {
        if (event == androidx.lifecycle.j.a.ON_DESTROY) {
            j();
        } else {
            if (event != androidx.lifecycle.j.a.ON_CREATE || this.disposed) {
                return;
            }
            h(this.lastContent);
        }
    }
}
