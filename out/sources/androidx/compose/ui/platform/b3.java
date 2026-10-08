package androidx.compose.ui.platform;

import android.view.View;
import androidx.p016lifecycle.C6451z0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\b\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/b3;", "", "Landroidx/compose/ui/platform/b;", "view", "Lkotlin/Function0;", "Loq/i0;", "a", "(Landroidx/compose/ui/platform/b;)Ler/a;", "b", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f10411a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.b3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/b3$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/b3;", "a", "()Landroidx/compose/ui/platform/b3;", "Default", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f10411a = new Companion();

        private Companion() {
        }

        public final b3 a() {
            return b.f10412b;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/b3$b;", "Landroidx/compose/ui/platform/b3;", "<init>", "()V", "Landroidx/compose/ui/platform/b;", "view", "Lkotlin/Function0;", "Loq/i0;", "a", "(Landroidx/compose/ui/platform/b;)Ler/a;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements b3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f10412b = new b();

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
        static final class a extends fr.w implements er.a<oq.i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.b f10413b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0223b f10414c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ q6.b f10415d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.b bVar, ViewOnAttachStateChangeListenerC0223b viewOnAttachStateChangeListenerC0223b, q6.b bVar2) {
                super(0);
                this.f10413b = bVar;
                this.f10414c = viewOnAttachStateChangeListenerC0223b;
                this.f10415d = bVar2;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ oq.i0 a() {
                c();
                return oq.i0.f148189a;
            }

            public final void c() {
                this.f10413b.removeOnAttachStateChangeListener(this.f10414c);
                q6.a.g(this.f10413b, this.f10415d);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.b3$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/b3$b$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Loq/i0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ViewOnAttachStateChangeListenerC0223b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.b f10416a;

            ViewOnAttachStateChangeListenerC0223b(androidx.compose.ui.platform.b bVar) {
                this.f10416a = bVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v15) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v15) {
                if (q6.a.f(this.f10416a)) {
                    return;
                }
                this.f10416a.h();
            }
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(androidx.compose.ui.platform.b bVar) {
            bVar.h();
        }

        @Override // androidx.compose.ui.platform.b3
        public er.a<oq.i0> a(final androidx.compose.ui.platform.b view) {
            ViewOnAttachStateChangeListenerC0223b viewOnAttachStateChangeListenerC0223b = new ViewOnAttachStateChangeListenerC0223b(view);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0223b);
            q6.b bVar = new q6.b() { // from class: androidx.compose.ui.platform.c3
                @Override // q6.b
                public final void a() {
                    b3.b.c(view);
                }
            };
            q6.a.a(view, bVar);
            return new a(view, viewOnAttachStateChangeListenerC0223b, bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/b3$c;", "Landroidx/compose/ui/platform/b3;", "<init>", "()V", "Landroidx/compose/ui/platform/b;", "view", "Lkotlin/Function0;", "Loq/i0;", "a", "(Landroidx/compose/ui/platform/b;)Ler/a;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements b3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f10417b = new c();

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
        static final class a extends fr.w implements er.a<oq.i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.b f10418b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0224c f10419c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.b bVar, ViewOnAttachStateChangeListenerC0224c viewOnAttachStateChangeListenerC0224c) {
                super(0);
                this.f10418b = bVar;
                this.f10419c = viewOnAttachStateChangeListenerC0224c;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ oq.i0 a() {
                c();
                return oq.i0.f148189a;
            }

            public final void c() {
                this.f10418b.removeOnAttachStateChangeListener(this.f10419c);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
        static final class b extends fr.w implements er.a<oq.i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ fr.p0<er.a<oq.i0>> f10420b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(fr.p0<er.a<oq.i0>> p0Var) {
                super(0);
                this.f10420b = p0Var;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ oq.i0 a() {
                c();
                return oq.i0.f148189a;
            }

            public final void c() {
                this.f10420b.f66410a.a();
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.b3$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/b3$c$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Loq/i0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ViewOnAttachStateChangeListenerC0224c implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.b f10421a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ fr.p0<er.a<oq.i0>> f10422b;

            ViewOnAttachStateChangeListenerC0224c(androidx.compose.ui.platform.b bVar, fr.p0<er.a<oq.i0>> p0Var) {
                this.f10421a = bVar;
                this.f10422b = p0Var;
            }

            /* JADX WARN: Type inference failed for: r3v7, types: [T, er.a] */
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v15) {
                androidx.p016lifecycle.q qVarA = C6451z0.a(this.f10421a);
                androidx.compose.ui.platform.b bVar = this.f10421a;
                if (qVarA != null) {
                    this.f10422b.f66410a = e3.c(bVar, qVarA.getLifecycleRegistry());
                    this.f10421a.removeOnAttachStateChangeListener(this);
                } else {
                    d4.a.d("View tree for " + bVar + " has no ViewTreeLifecycleOwner");
                    throw new oq.g();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v15) {
            }
        }

        private c() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.b3$c$a] */
        @Override // androidx.compose.ui.platform.b3
        public er.a<oq.i0> a(androidx.compose.ui.platform.b view) {
            if (!view.isAttachedToWindow()) {
                fr.p0 p0Var = new fr.p0();
                ViewOnAttachStateChangeListenerC0224c viewOnAttachStateChangeListenerC0224c = new ViewOnAttachStateChangeListenerC0224c(view, p0Var);
                view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0224c);
                p0Var.f66410a = new a(view, viewOnAttachStateChangeListenerC0224c);
                return new b(p0Var);
            }
            androidx.p016lifecycle.q qVarA = C6451z0.a(view);
            if (qVarA != null) {
                return e3.c(view, qVarA.getLifecycleRegistry());
            }
            d4.a.d("View tree for " + view + " has no ViewTreeLifecycleOwner");
            throw new oq.g();
        }
    }

    er.a<oq.i0> a(androidx.compose.ui.platform.b view);
}
