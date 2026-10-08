package f62;

import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import fr.q0;
import iy.a0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vr0.BECardRegistrationProcess;
import vr0.BEStartCardRegistrationResponse;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BI\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R&\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030.8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010:\u001a\b\u0012\u0004\u0012\u000205048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lf62/r;", "Ll00/g;", "Lf62/d;", "Lf62/c;", "Lf62/e;", "", "Lyy/a;", "stateMachineFactory", "Lf62/f;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lcs0/h;", "startCardRegistrationUseCase", "Liy/a;", "base64Coder", "Lz32/a;", "addCardInIntervalUseCase", "Lcs0/b;", "abortCardRegistrationUseCase", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lyy/a;Lf62/f;Lac4/a;Lcs0/h;Liy/a;Lz32/a;Lcs0/b;Lib4/c;)V", "state", "Lf62/e$a;", "t9", "(Lf62/d;)Lf62/e$a;", "b", "Lf62/f;", "c", "Lac4/a;", "d", "Lcs0/h;", "e", "Liy/a;", "f", "Lz32/a;", "g", "Lcs0/b;", "h", "Lib4/c;", "Lf62/d$a;", "j", "Lf62/d$a;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lf62/c$c;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<f62.d, f62.c> implements f62.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f62.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cs0.h startCardRegistrationUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z32.a addCardInIntervalUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final cs0.b abortCardRegistrationUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final f62.d.a initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<f62.d, f62.c> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<f62.c.InterfaceC1334c> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<f62.e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f62.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f59479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f59480b;

        /* JADX INFO: renamed from: f62.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1338a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f59481a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f59482b;

            /* JADX INFO: renamed from: f62.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1339a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f59483d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f59484e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f59485f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f59487h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f59488j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f59489k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f59490l;

                public C1339a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f59483d = obj;
                    this.f59484e |= PKIFailureInfo.systemUnavail;
                    return C1338a.this.F(null, this);
                }
            }

            public C1338a(mu.h hVar, r rVar) {
                this.f59481a = hVar;
                this.f59482b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1339a c1339a;
                if (eVar instanceof C1339a) {
                    c1339a = (C1339a) eVar;
                    int i15 = c1339a.f59484e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1339a.f59484e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1339a = new C1339a(eVar);
                    }
                } else {
                    c1339a = new C1339a(eVar);
                }
                Object obj2 = c1339a.f59483d;
                Object objE = uq.b.e();
                int i16 = c1339a.f59484e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f59481a;
                    f62.e.a aVarT9 = this.f59482b.t9((f62.d) obj);
                    c1339a.f59485f = vq.j.a(obj);
                    c1339a.f59487h = vq.j.a(c1339a);
                    c1339a.f59488j = vq.j.a(obj);
                    c1339a.f59489k = vq.j.a(hVar);
                    c1339a.f59490l = 0;
                    c1339a.f59484e = 1;
                    if (hVar.F(aVarT9, c1339a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, r rVar) {
            this.f59479a = gVar;
            this.f59480b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f62.e.a> hVar, tq.e eVar) {
            Object objA = this.f59479a.a(new C1338a(hVar, this.f59480b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf62/c$a;", "<unused var>", "Lf62/d;", "Loq/i0;", "<anonymous>", "(Lf62/c$a;Lf62/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<f62.c.a, f62.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59491e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f59491e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<f62.c.InterfaceC1334c> bVarY1 = r.this.Y1();
                f62.c.InterfaceC1334c.a aVar = f62.c.InterfaceC1334c.a.f59422a;
                this.f59491e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(f62.c.a aVar, f62.d dVar, tq.e<? super i0> eVar) {
            return r.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf62/c$f;", "<unused var>", "Lk10/c0;", "Lf62/d;", "state", "Lk10/l;", "<anonymous>", "(Lf62/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<f62.c.f, c0<f62.d>, tq.e<? super k10.l<? extends f62.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59494f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f62.d.b O(f62.d dVar) {
            return f62.d.b.f59432a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f59494f;
            uq.b.e();
            if (this.f59493e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: f62.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.c.O((d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f62.c.f fVar, c0<f62.d> c0Var, tq.e<? super k10.l<? extends f62.d>> eVar) {
            c cVar = new c(eVar);
            cVar.f59494f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf62/c$b;", "action", "Lf62/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lf62/c$b;Lf62/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<f62.c.Error, f62.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59496f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(r rVar, f62.c.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    rVar.d9(f62.c.a.f59419a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    f62.c retryAction = error.getRetryAction();
                    if (retryAction != null) {
                        rVar.d9(retryAction);
                    }
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final f62.c.Error error = (f62.c.Error) this.f59496f;
            Object objE = uq.b.e();
            int i15 = this.f59495e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<f62.c.InterfaceC1334c> bVarY1 = r.this.Y1();
                ib4.c cVar = r.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final r rVar = r.this;
                f62.c.InterfaceC1334c.Error error2 = new f62.c.InterfaceC1334c.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: f62.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.d.O(rVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f59496f = vq.j.a(error);
                this.f59495e = 1;
                if (bVarY1.F(error2, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(f62.c.Error error, f62.d dVar, tq.e<? super i0> eVar) {
            d dVar2 = r.this.new d(eVar);
            dVar2.f59496f = error;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf62/c$i;", "action", "Lf62/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lf62/c$i;Lf62/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<f62.c.WebViewSuccess, f62.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59499f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f59501e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f59502f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f59503g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f59504h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f59505j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ r f59506k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ f62.c.WebViewSuccess f59507l;

            /* JADX INFO: renamed from: f62.r$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C1340a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f59508a;

                static {
                    int[] iArr = new int[vr0.h.values().length];
                    try {
                        iArr[vr0.h.ACTIVE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[vr0.h.PENDING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[vr0.h.FAILED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[vr0.h.UNKNOWN.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f59508a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, f62.c.WebViewSuccess webViewSuccess, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f59506k = rVar;
                this.f59507l = webViewSuccess;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
            
                if (r1.F(r3, r8) == r0) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00d5, code lost:
            
                if (r1.F(r2, r8) == r0) goto L34;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 225
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: f62.r.e.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f59506k, this.f59507l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f62.c.WebViewSuccess webViewSuccess = (f62.c.WebViewSuccess) this.f59499f;
            Object objE = uq.b.e();
            int i15 = this.f59498e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = r.this.callActionWithLoaderUseCase;
                a aVar2 = new a(r.this, webViewSuccess, null);
                this.f59499f = vq.j.a(webViewSuccess);
                this.f59498e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(f62.c.WebViewSuccess webViewSuccess, f62.d dVar, tq.e<? super i0> eVar) {
            e eVar2 = r.this.new e(eVar);
            eVar2.f59499f = webViewSuccess;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf62/c$h;", "action", "Lf62/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lf62/c$h;Lf62/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<f62.c.WebViewError, f62.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59510f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f59512e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f59513f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f59514g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f59515h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f59516j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ r f59517k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ f62.c.WebViewError f59518l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, f62.c.WebViewError webViewError, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f59517k = rVar;
                this.f59518l = webViewError;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
            
                if (r1.F(r4, r7) == r0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
            
                if (r1.F(r4, r7) == r0) goto L25;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r7.f59516j
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r4) goto L2b
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r7.f59513f
                    oq.i0 r0 = (oq.i0) r0
                    goto L22
                L16:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1e:
                    java.lang.Object r0 = r7.f59513f
                    dx.b r0 = (dx.b) r0
                L22:
                    java.lang.Object r0 = r7.f59512e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r8)
                    goto Lb3
                L2b:
                    oq.u.b(r8)
                    goto L4c
                L2f:
                    oq.u.b(r8)
                    f62.r r8 = r7.f59517k
                    cs0.b r8 = f62.r.m9(r8)
                    cs0.b$a r1 = new cs0.b$a
                    f62.c$h r5 = r7.f59518l
                    java.lang.String r5 = r5.getReferenceId()
                    r1.<init>(r5)
                    r7.f59516j = r4
                    java.lang.Object r8 = r8.c(r1, r7)
                    if (r8 != r0) goto L4c
                    goto Lb2
                L4c:
                    dx.i r8 = (dx.i) r8
                    f62.r r1 = r7.f59517k
                    boolean r4 = r8 instanceof dx.i.Left
                    r5 = 0
                    if (r4 == 0) goto L82
                    r2 = r8
                    dx.i$b r2 = (dx.i.Left) r2
                    java.lang.Object r2 = r2.b()
                    dx.b r2 = (dx.b) r2
                    xw.b r1 = r1.Y1()
                    f62.c$c$c r4 = new f62.c$c$c
                    u42.a r6 = u42.a.ADD_CARD_FAILED
                    r4.<init>(r6)
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f59512e = r8
                    java.lang.Object r8 = vq.j.a(r2)
                    r7.f59513f = r8
                    r7.f59514g = r5
                    r7.f59515h = r5
                    r7.f59516j = r3
                    java.lang.Object r8 = r1.F(r4, r7)
                    if (r8 != r0) goto Lb3
                    goto Lb2
                L82:
                    boolean r3 = r8 instanceof dx.i.Right
                    if (r3 == 0) goto Lb6
                    r3 = r8
                    dx.i$c r3 = (dx.i.Right) r3
                    java.lang.Object r3 = r3.b()
                    oq.i0 r3 = (oq.i0) r3
                    xw.b r1 = r1.Y1()
                    f62.c$c$c r4 = new f62.c$c$c
                    u42.a r6 = u42.a.ADD_CARD_FAILED
                    r4.<init>(r6)
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f59512e = r8
                    java.lang.Object r8 = vq.j.a(r3)
                    r7.f59513f = r8
                    r7.f59514g = r5
                    r7.f59515h = r5
                    r7.f59516j = r2
                    java.lang.Object r8 = r1.F(r4, r7)
                    if (r8 != r0) goto Lb3
                Lb2:
                    return r0
                Lb3:
                    oq.i0 r8 = oq.i0.f148189a
                    return r8
                Lb6:
                    oq.p r8 = new oq.p
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: f62.r.f.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f59517k, this.f59518l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f62.c.WebViewError webViewError = (f62.c.WebViewError) this.f59510f;
            Object objE = uq.b.e();
            int i15 = this.f59509e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = r.this.callActionWithLoaderUseCase;
                a aVar2 = new a(r.this, webViewError, null);
                this.f59510f = vq.j.a(webViewError);
                this.f59509e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(f62.c.WebViewError webViewError, f62.d dVar, tq.e<? super i0> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f59510f = webViewError;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf62/d$a;", "it", "Loq/i0;", "<anonymous>", "(Lf62/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<f62.d.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59519e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f59519e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.d9(f62.c.g.f59428a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(f62.d.a aVar, tq.e<? super i0> eVar) {
            return ((g) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return r.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf62/c$g;", "action", "Lk10/c0;", "Lf62/d$a;", "state", "Lk10/l;", "Lf62/d;", "<anonymous>", "(Lf62/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<f62.c.g, c0<f62.d.a>, tq.e<? super k10.l<? extends f62.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59522f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f59523g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lf62/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends f62.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f59525e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f59526f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f59527g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f59528h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f59529j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f59530k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f59531l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f59532m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ r f59533n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ f62.c.g f59534p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ c0<f62.d.a> f59535q;

            /* JADX INFO: renamed from: f62.r$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C1341a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f59536a;

                static {
                    int[] iArr = new int[vr0.e.values().length];
                    try {
                        iArr[vr0.e.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[vr0.e.CARDS_LIMIT_EXCEEDED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[vr0.e.UNKNOWN.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f59536a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, f62.c.g gVar, c0<f62.d.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f59533n = rVar;
                this.f59534p = gVar;
                this.f59535q = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final f62.d.WebView V(BECardRegistrationProcess bECardRegistrationProcess, r rVar, f62.d.a aVar) {
                Object objB;
                String referenceId = bECardRegistrationProcess.getReferenceId();
                String redirectUrl = bECardRegistrationProcess.getRedirectRequest().getRedirectUrl();
                dx.i iVarC = iy.a.c(rVar.base64Coder, bECardRegistrationProcess.getRedirectRequest().getRequestBody(), null, 2, null);
                if (iVarC instanceof dx.i.Left) {
                    objB = new byte[0];
                } else {
                    if (!(iVarC instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) iVarC).b();
                }
                return new f62.d.WebView(referenceId, redirectUrl, new a0((byte[]) objB), bECardRegistrationProcess.getRedirectRequest().d(), bECardRegistrationProcess.getRedirectRequest().a());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                DisplayMetrics displayMetrics;
                final r rVar;
                f62.c.g gVar;
                c0<f62.d.a> c0Var;
                int i15;
                c0<f62.d.a> c0Var2;
                Object objE = uq.b.e();
                int i16 = this.f59532m;
                if (i16 != 0) {
                    if (i16 == 1) {
                        i15 = this.f59529j;
                        displayMetrics = (DisplayMetrics) this.f59528h;
                        c0Var = (c0) this.f59527g;
                        gVar = (f62.c.g) this.f59526f;
                        rVar = (r) this.f59525e;
                        oq.u.b(obj);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0Var2 = (c0) this.f59525e;
                        oq.u.b(obj);
                    }
                    return c0Var2.c();
                }
                oq.u.b(obj);
                displayMetrics = Resources.getSystem().getDisplayMetrics();
                rVar = this.f59533n;
                gVar = this.f59534p;
                c0<f62.d.a> c0Var3 = this.f59535q;
                cs0.h hVar = rVar.startCardRegistrationUseCase;
                cs0.h.Params params = new cs0.h.Params(g42.a.a(displayMetrics.heightPixels, displayMetrics.widthPixels));
                this.f59525e = rVar;
                this.f59526f = gVar;
                this.f59527g = c0Var3;
                this.f59528h = vq.j.a(displayMetrics);
                this.f59529j = 0;
                this.f59532m = 1;
                Object objC = hVar.c(params, this);
                if (objC != objE) {
                    c0Var = c0Var3;
                    obj = objC;
                    i15 = 0;
                }
                return objE;
                dx.i iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    rVar.d9(new f62.c.Error((dx.b) ((dx.i.Left) iVar).b(), gVar));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                BEStartCardRegistrationResponse bEStartCardRegistrationResponse = (BEStartCardRegistrationResponse) ((dx.i.Right) iVar).b();
                int i17 = C1341a.f59536a[bEStartCardRegistrationResponse.getStatus().ordinal()];
                if (i17 == 1) {
                    final BECardRegistrationProcess process = bEStartCardRegistrationResponse.getProcess();
                    if (process != null) {
                        return c0Var.d(new er.l() { // from class: f62.u
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return r.h.a.V(process, rVar, (d.a) obj2);
                            }
                        });
                    }
                    rVar.d9(new f62.c.Error(new dx.b.Parsing(null, 1, null), gVar));
                    return c0Var.c();
                }
                if (i17 != 2) {
                    if (i17 != 3) {
                        throw new oq.p();
                    }
                    rVar.d9(new f62.c.Error(new dx.b.Parsing(null, 1, null), gVar));
                    return c0Var.c();
                }
                xw.b<f62.c.InterfaceC1334c> bVarY1 = rVar.Y1();
                f62.c.InterfaceC1334c.GoToYourCards goToYourCards = new f62.c.InterfaceC1334c.GoToYourCards(u42.a.ADD_CARD_LIMIT_EXCEEDED);
                this.f59525e = c0Var;
                this.f59526f = vq.j.a(displayMetrics);
                this.f59527g = vq.j.a(iVar);
                this.f59528h = vq.j.a(bEStartCardRegistrationResponse);
                this.f59529j = i15;
                this.f59530k = 0;
                this.f59531l = 0;
                this.f59532m = 2;
                if (bVarY1.F(goToYourCards, this) != objE) {
                    c0Var2 = c0Var;
                    return c0Var2.c();
                }
                return objE;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f59533n, this.f59534p, this.f59535q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends f62.d>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f62.c.g gVar = (f62.c.g) this.f59522f;
            c0 c0Var = (c0) this.f59523g;
            Object objE = uq.b.e();
            int i15 = this.f59521e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r.this, gVar, c0Var, null);
            this.f59522f = vq.j.a(gVar);
            this.f59523g = vq.j.a(c0Var);
            this.f59521e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(f62.c.g gVar, c0<f62.d.a> c0Var, tq.e<? super k10.l<? extends f62.d>> eVar) {
            h hVar = r.this.new h(eVar);
            hVar.f59522f = gVar;
            hVar.f59523g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf62/c$d;", "<destruct>", "Lk10/c0;", "Lf62/d$c;", "state", "Lk10/l;", "Lf62/d;", "<anonymous>", "(Lf62/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<f62.c.OnResponseReceived, c0<f62.d.WebView>, tq.e<? super k10.l<? extends f62.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59538f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f59539g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f62.d.C1336d V(f62.d.WebView webView) {
            return f62.d.C1336d.f59438a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f62.d.C1336d X(f62.d.WebView webView) {
            return f62.d.C1336d.f59438a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f62.c.OnResponseReceived onResponseReceived = (f62.c.OnResponseReceived) this.f59538f;
            c0 c0Var = (c0) this.f59539g;
            uq.b.e();
            if (this.f59537e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Uri url = onResponseReceived.getUrl();
            Object objA = c0Var.a();
            r rVar = r.this;
            f62.d.WebView webView = (f62.d.WebView) objA;
            if (webView.e().contains(String.valueOf(url))) {
                rVar.d9(new f62.c.WebViewSuccess(webView.getReferenceId()));
                return c0Var.d(new er.l() { // from class: f62.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.i.V((d.WebView) obj2);
                    }
                });
            }
            if (!webView.c().contains(String.valueOf(url))) {
                return c0Var.c();
            }
            rVar.d9(new f62.c.WebViewError(webView.getReferenceId()));
            return c0Var.d(new er.l() { // from class: f62.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.i.X((d.WebView) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(f62.c.OnResponseReceived onResponseReceived, c0<f62.d.WebView> c0Var, tq.e<? super k10.l<? extends f62.d>> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f59538f = onResponseReceived;
            iVar.f59539g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf62/c$e;", "<unused var>", "Lf62/d$c;", "Loq/i0;", "<anonymous>", "(Lf62/c$e;Lf62/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<f62.c.e, f62.d.WebView, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59541e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f59541e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.d9(new f62.c.Error(new dx.b.g.SslCertificate(false), null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(f62.c.e eVar, f62.d.WebView webView, tq.e<? super i0> eVar2) {
            return r.this.new j(eVar2).J(i0.f148189a);
        }
    }

    public r(yy.a aVar, f62.f fVar, ac4.a aVar2, cs0.h hVar, iy.a aVar3, z32.a aVar4, cs0.b bVar, ib4.c cVar) {
        this.mapper = fVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.startCardRegistrationUseCase = hVar;
        this.base64Coder = aVar3;
        this.addCardInIntervalUseCase = aVar4;
        this.abortCardRegistrationUseCase = bVar;
        this.genericDomainErrorMapper = cVar;
        f62.d.a aVar5 = f62.d.a.f59431a;
        this.initialState = aVar5;
        this.stateMachine = aVar.a(aVar5, new er.l() { // from class: f62.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.w9(this.f59463a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), t9(aVar5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f62.e.a t9(f62.d state) {
        return this.mapper.b(new f62.f.Params(state, new er.l() { // from class: f62.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.u9(this.f59464a, (Uri) obj);
            }
        }, b9(f62.c.a.f59419a), b9(f62.c.e.f59426a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(r rVar, Uri uri) {
        rVar.d9(new f62.c.OnResponseReceived(uri));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(f62.d.class), new er.l() { // from class: f62.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.x9(this.f59465a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(f62.d.a.class), new er.l() { // from class: f62.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f59466a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(f62.d.WebView.class), new er.l() { // from class: f62.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(this.f59467a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(r rVar, k10.z zVar) {
        b bVar = rVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(f62.c.a.class), oVar, bVar);
        zVar.v(q0.c(f62.c.f.class), oVar, new c(null));
        zVar.x(q0.c(f62.c.Error.class), oVar, rVar.new d(null));
        zVar.x(q0.c(f62.c.WebViewSuccess.class), oVar, rVar.new e(null));
        zVar.x(q0.c(f62.c.WebViewError.class), oVar, rVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(r rVar, k10.z zVar) {
        zVar.C(rVar.new g(null));
        h hVar = rVar.new h(null);
        zVar.v(q0.c(f62.c.g.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(r rVar, k10.z zVar) {
        i iVar = rVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(f62.c.OnResponseReceived.class), oVar, iVar);
        zVar.x(q0.c(f62.c.e.class), oVar, rVar.new j(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<f62.c.InterfaceC1334c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<f62.d, f62.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f62.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
