package oz;

import ju.p0;
import mu.a0;
import mu.h0;
import oq.i0;
import p071kotlin.Metadata;
import p087nuL.b0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0084@¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\fR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Loz/b;", "INTENT", "RESULT", "Loz/c;", "Landroidx/lifecycle/n;", "<init>", "()V", "Loq/i0;", "o", "LCON/p;", "activity", "e", "(LCON/p;)V", "Landroidx/lifecycle/q;", "source", "Landroidx/lifecycle/j$a;", "event", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "intent", "s", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "a", "LCON/p;", "q", "()LCON/p;", "setComponentActivity", "componentActivity", "LNUl/e;", "b", "LNUl/e;", "activityResultLauncher", "Lmu/a0;", "c", "Lmu/a0;", "resultEmitter", "LnuL/b0;", "r", "()LnuL/b0;", "contract", "lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b<INTENT, RESULT> implements c, androidx.p016lifecycle.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CON.p componentActivity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private p006NUl.e<INTENT> activityResultLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a0<RESULT> resultEmitter = h0.b(0, 0, null, 7, null);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150710a;

        static {
            int[] iArr = new int[androidx.lifecycle.j.a.values().length];
            try {
                iArr[androidx.lifecycle.j.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f150710a = iArr;
        }
    }

    /* JADX INFO: renamed from: oz.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class C3718b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b<INTENT, RESULT> f150712f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ RESULT f150713g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3718b(b<INTENT, RESULT> bVar, RESULT result, tq.e<? super C3718b> eVar) {
            super(2, eVar);
            this.f150712f = bVar;
            this.f150713g = result;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f150711e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = ((b) this.f150712f).resultEmitter;
                RESULT result = this.f150713g;
                this.f150711e = 1;
                if (a0Var.F(result, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((C3718b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new C3718b(this.f150712f, this.f150713g, eVar);
        }
    }

    private final void o() {
        androidx.p016lifecycle.j lifecycleRegistry;
        CON.p pVar = this.componentActivity;
        if (pVar != null && (lifecycleRegistry = pVar.getLifecycleRegistry()) != null) {
            lifecycleRegistry.d(this);
        }
        this.componentActivity = null;
        this.activityResultLauncher = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(CON.p pVar, b bVar, Object obj) {
        ju.k.d(androidx.p016lifecycle.r.a(pVar), null, null, new C3718b(bVar, obj, null), 3, null);
    }

    @Override // oz.c
    public void e(final CON.p activity) {
        o();
        this.componentActivity = activity;
        this.activityResultLauncher = activity != null ? activity.p0(r(), new p006NUl.d() { // from class: oz.a
            @Override // p006NUl.d
            public final void a(Object obj) {
                b.p(activity, this, obj);
            }
        }) : null;
        activity.getLifecycleRegistry().a(this);
    }

    @Override // androidx.p016lifecycle.n
    public void m(androidx.p016lifecycle.q source, androidx.lifecycle.j.a event) {
        if (a.f150710a[event.ordinal()] == 1) {
            o();
        }
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    protected final CON.p getComponentActivity() {
        return this.componentActivity;
    }

    public abstract b0<INTENT, RESULT> r();

    protected final Object s(INTENT intent, tq.e<? super RESULT> eVar) {
        p006NUl.e<INTENT> eVar2 = this.activityResultLauncher;
        if (eVar2 != null) {
            eVar2.a(intent);
        }
        return mu.i.z(this.resultEmitter, eVar);
    }
}
