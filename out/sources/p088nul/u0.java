package p088nul;

import CON.BackEventCompat;
import er.p;
import er.q;
import fr.l0;
import java.util.concurrent.CancellationException;
import ju.d2;
import ju.p0;
import lu.j;
import lu.z;
import mu.g;
import mu.h;
import mu.i;
import oq.i0;
import oq.u;
import p008Nul.w;
import p071kotlin.Metadata;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014RD\u0010\u001e\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010-\u001a\u00020%2\u0006\u0010)\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b&\u0010,¨\u0006."}, d2 = {"Lnul/u0;", "LNul/w;", "Lju/p0;", "scope", "Lnul/x0;", "info", "<init>", "(Lju/p0;Lnul/x0;)V", "Loq/i0;", "k", "()V", "LCON/b;", "event", "g", "(LCON/b;)V", "f", "e", "d", "Lju/p0;", "getScope", "()Lju/p0;", "Lkotlin/Function2;", "Lmu/g;", "Ltq/e;", "", "Ler/p;", "j", "()Ler/p;", "l", "(Ler/p;)V", "currentOnBack", "Llu/g;", "Llu/g;", "activeChannel", "Lju/d2;", "Lju/d2;", "activeJob", "", "h", "Z", "isPredictiveBack", "value", "c", "()Z", "(Z)V", "isBackEnabled", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class u0 extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private p<? super g<BackEventCompat>, ? super e<? super i0>, ? extends Object> currentOnBack;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private lu.g<BackEventCompat> activeChannel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private d2 activeJob;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isPredictiveBack;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmu/g;", "LCON/b;", "it", "Loq/i0;", "<anonymous>", "(Lmu/g;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends k implements p<g<? extends BackEventCompat>, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138881e;

        a(e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f138881e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(g<BackEventCompat> gVar, e<? super i0> eVar) {
            return ((a) v(gVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f138882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f138883f;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmu/h;", "LCON/b;", "", "it", "Loq/i0;", "<anonymous>", "(Lmu/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends k implements q<h<? super BackEventCompat>, Throwable, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f138885e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l0 f138886f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var, e<? super a> eVar) {
                super(3, eVar);
                this.f138886f = l0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f138885e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                this.f138886f.f66404a = true;
                return i0.f148189a;
            }

            @Override // er.q
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object w(h<? super BackEventCompat> hVar, Throwable th4, e<? super i0> eVar) {
                return new a(this.f138886f, eVar).J(i0.f148189a);
            }
        }

        b(e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l0 l0Var;
            Object objE = uq.b.e();
            int i15 = this.f138883f;
            if (i15 == 0) {
                u.b(obj);
                if (u0.this.c()) {
                    l0 l0Var2 = new l0();
                    p<g<BackEventCompat>, e<? super i0>, Object> pVarJ = u0.this.j();
                    g<BackEventCompat> gVarR = i.R(i.n(u0.this.activeChannel), new a(l0Var2, null));
                    this.f138882e = l0Var2;
                    this.f138883f = 1;
                    if (pVarJ.B(gVarR, this) == objE) {
                        return objE;
                    }
                    l0Var = l0Var2;
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l0Var = (l0) this.f138882e;
            u.b(obj);
            if (!l0Var.f66404a) {
                throw new IllegalStateException("You must collect the progress flow");
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return u0.this.new b(eVar);
        }
    }

    public u0(p0 p0Var, PredictiveBackHandlerInfo predictiveBackHandlerInfo) {
        super(predictiveBackHandlerInfo);
        this.scope = p0Var;
        this.currentOnBack = new a(null);
    }

    private final void k() {
        this.activeChannel = j.b(-2, lu.a.SUSPEND, null, 4, null);
        this.activeJob = ju.k.d(this.scope, null, null, new b(null), 3, null);
    }

    @Override // p008Nul.w
    public boolean c() {
        return super.c();
    }

    @Override // p008Nul.w
    public void d() {
        lu.g<BackEventCompat> gVar = this.activeChannel;
        if (gVar != null) {
            gVar.u(new CancellationException("onBack cancelled"));
        }
        d2 d2Var = this.activeJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.activeChannel = null;
        this.activeJob = null;
        this.isPredictiveBack = false;
    }

    @Override // p008Nul.w
    public void e() {
        if (this.activeChannel != null && !this.isPredictiveBack) {
            d();
        }
        if (this.activeChannel == null) {
            this.isPredictiveBack = false;
            k();
        }
        lu.g<BackEventCompat> gVar = this.activeChannel;
        if (gVar != null) {
            z.a.a(gVar, null, 1, null);
        }
        this.isPredictiveBack = false;
    }

    @Override // p008Nul.w
    public void f(BackEventCompat event) {
        lu.g<BackEventCompat> gVar = this.activeChannel;
        if (gVar != null) {
            lu.k.b(gVar.d(event));
        }
    }

    @Override // p008Nul.w
    public void g(BackEventCompat event) {
        d();
        if (c()) {
            this.isPredictiveBack = true;
            k();
        }
    }

    @Override // p008Nul.w
    public void h(boolean z15) {
        d2 d2Var;
        if (!z15 && super.c() && (d2Var = this.activeJob) != null && !d2Var.h()) {
            d();
        }
        super.h(z15);
    }

    public final p<g<BackEventCompat>, e<? super i0>, Object> j() {
        return this.currentOnBack;
    }

    public final void l(p<? super g<BackEventCompat>, ? super e<? super i0>, ? extends Object> pVar) {
        this.currentOnBack = pVar;
    }
}
