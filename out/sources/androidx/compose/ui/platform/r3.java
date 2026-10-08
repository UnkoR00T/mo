package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import p071kotlin.Metadata;
import p076m2.p4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/r3;", "", "<init>", "()V", "Landroid/view/View;", "rootView", "Lm2/p4;", "a", "(Landroid/view/View;)Lm2/p4;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/q3;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "factory", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r3 f10740a = new r3();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AtomicReference<q3> factory = new AtomicReference<>(q3.INSTANCE.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10742c = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/r3$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Loq/i0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.d2 f10743a;

        a(ju.d2 d2Var) {
            this.f10743a = d2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v15) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v15) {
            v15.removeOnAttachStateChangeListener(this);
            ju.d2.a.a(this.f10743a, null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p4 f10745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f10746g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p4 p4Var, View view, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f10745f = p4Var;
            this.f10746g = view;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f10744e;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    p4 p4Var = this.f10745f;
                    this.f10744e = 1;
                    if (p4Var.B0(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                if (s3.g(this.f10746g) == this.f10745f) {
                    s3.k(this.f10746g, null);
                }
                return oq.i0.f148189a;
            } catch (Throwable th4) {
                if (s3.g(this.f10746g) == this.f10745f) {
                    s3.k(this.f10746g, null);
                }
                throw th4;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f10745f, this.f10746g, eVar);
        }
    }

    private r3() {
    }

    public final p4 a(View rootView) {
        p4 p4VarA = factory.get().a(rootView);
        s3.k(rootView, p4VarA);
        rootView.addOnAttachStateChangeListener(new a(ju.k.d(ju.w1.f105795a, ku.i.g(rootView.getHandler(), "windowRecomposer cleanup").j2(), null, new b(p4VarA, rootView, null), 2, null)));
        return p4VarA;
    }
}
