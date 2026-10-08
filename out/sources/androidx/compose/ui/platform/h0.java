package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/ui/platform/h0;", "Landroidx/compose/ui/platform/m2;", "Lju/p0;", "Landroid/view/View;", "view", "Lv4/v0;", "textInputService", "coroutineScope", "<init>", "(Landroid/view/View;Lv4/v0;Lju/p0;)V", "Landroidx/compose/ui/platform/i2;", "request", "", "a", "(Landroidx/compose/ui/platform/i2;Ltq/e;)Ljava/lang/Object;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "d", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Landroid/view/View;", "m", "()Landroid/view/View;", "b", "Lv4/v0;", "c", "Lju/p0;", "Lf3/s;", "Landroidx/compose/ui/platform/s1;", "Ljava/util/concurrent/atomic/AtomicReference;", "methodSessionMutex", "", "e", "()Z", "isReadyForConnection", "Ltq/i;", "getCoroutineContext", "()Ltq/i;", "coroutineContext", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 implements m2, ju.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v4.v0 textInputService;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<f3.s.a<s1>> methodSessionMutex = f3.s.a();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f10596d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10598f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f10596d = obj;
            this.f10598f |= PKIFailureInfo.systemUnavail;
            return h0.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "it", "Landroidx/compose/ui/platform/s1;", "c", "(Lju/p0;)Landroidx/compose/ui/platform/s1;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<ju.p0, s1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i2 f10599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f10600c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
        static final class a extends fr.w implements er.a<oq.i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f10601b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var) {
                super(0);
                this.f10601b = h0Var;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ oq.i0 a() {
                c();
                return oq.i0.f148189a;
            }

            public final void c() {
                ju.q0.d(this.f10601b.coroutineScope, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i2 i2Var, h0 h0Var) {
            super(1);
            this.f10599b = i2Var;
            this.f10600c = h0Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final s1 b(ju.p0 p0Var) {
            return new s1(this.f10599b, new a(this.f10600c));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/s1;", "methodSession", "", "<anonymous>", "(Landroidx/compose/ui/platform/s1;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<s1, tq.e<?>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f10602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10603f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f10604g;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loq/i0;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends fr.w implements er.l<Throwable, oq.i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s1 f10606b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h0 f10607c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s1 s1Var, h0 h0Var) {
                super(1);
                this.f10606b = s1Var;
                this.f10607c = h0Var;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ oq.i0 b(Throwable th4) {
                c(th4);
                return oq.i0.f148189a;
            }

            public final void c(Throwable th4) {
                this.f10606b.d();
                this.f10607c.textInputService.f();
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f10603f;
            if (i15 == 0) {
                oq.u.b(obj);
                s1 s1Var = (s1) this.f10604g;
                h0 h0Var = h0.this;
                this.f10604g = s1Var;
                this.f10602e = h0Var;
                this.f10603f = 1;
                ju.p pVar = new ju.p(uq.b.c(this), 1);
                pVar.D();
                h0Var.textInputService.e();
                pVar.E(new a(s1Var, h0Var));
                Object objX = pVar.x();
                if (objX == uq.b.e()) {
                    vq.g.c(this);
                }
                if (objX == objE) {
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
        public final Object B(s1 s1Var, tq.e<?> eVar) {
            return ((c) v(s1Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = h0.this.new c(eVar);
            cVar.f10604g = obj;
            return cVar;
        }
    }

    public h0(View view, v4.v0 v0Var, ju.p0 p0Var) {
        this.view = view;
        this.textInputService = v0Var;
        this.coroutineScope = p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.l2
    public Object a(i2 i2Var, tq.e<?> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f10598f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f10598f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f10596d;
        Object objE = uq.b.e();
        int i16 = aVar.f10598f;
        if (i16 == 0) {
            oq.u.b(obj);
            AtomicReference<f3.s.a<s1>> atomicReference = this.methodSessionMutex;
            b bVar = new b(i2Var, this);
            c cVar = new c(null);
            aVar.f10598f = 1;
            if (f3.s.d(atomicReference, bVar, cVar, aVar) == objE) {
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

    public final InputConnection d(EditorInfo outAttrs) {
        s1 s1Var = (s1) f3.s.c(this.methodSessionMutex);
        if (s1Var != null) {
            return s1Var.c(outAttrs);
        }
        return null;
    }

    public final boolean e() {
        s1 s1Var = (s1) f3.s.c(this.methodSessionMutex);
        return s1Var != null && s1Var.e();
    }

    @Override // ju.p0
    public tq.i getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.l2
    /* JADX INFO: renamed from: m, reason: from getter */
    public View getView() {
        return this.view;
    }
}
