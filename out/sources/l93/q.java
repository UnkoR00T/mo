package l93;

import a14.b0;
import android.os.Build;
import fr.q0;
import i93.MalwareDataPayload;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Ll93/q;", "Ll00/g;", "Ll93/e;", "Ll93/d;", "Ll93/f;", "", "Ln93/a;", "screenMapper", "La14/w;", "openUrlIntentUseCase", "La14/b0;", "sendMailIntentUseCase", "Lmx/c;", "labelProvider", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lyy/a;", "stateMachineFactory", "<init>", "(Ln93/a;La14/w;La14/b0;Lmx/c;Lhb4/d;Lib4/c;Lyy/a;)V", "state", "Ll93/f$a;", "r9", "(Ll93/e;)Ll93/f$a;", "", "appName", "packageName", "s9", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Li93/a;", "malwareDataPayload", "Loq/i0;", "t9", "(Li93/a;)V", "b", "Ln93/a;", "c", "La14/w;", "d", "La14/b0;", "e", "Lmx/c;", "f", "Lhb4/d;", "g", "Lib4/c;", "Ll93/e$b;", "h", "Ll93/e$b;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ll93/d$b;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<l93.e, l93.d> implements l93.f, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n93.a screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b0 sendMailIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l93.e.Initialized initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<l93.e, l93.d> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l93.d.b> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<l93.f.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<l93.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f117338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f117339b;

        /* JADX INFO: renamed from: l93.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2843a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f117340a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f117341b;

            /* JADX INFO: renamed from: l93.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2844a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f117342d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f117343e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f117344f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f117346h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f117347j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f117348k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f117349l;

                public C2844a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f117342d = obj;
                    this.f117343e |= PKIFailureInfo.systemUnavail;
                    return C2843a.this.F(null, this);
                }
            }

            public C2843a(mu.h hVar, q qVar) {
                this.f117340a = hVar;
                this.f117341b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2844a c2844a;
                if (eVar instanceof C2844a) {
                    c2844a = (C2844a) eVar;
                    int i15 = c2844a.f117343e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2844a.f117343e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2844a = new C2844a(eVar);
                    }
                } else {
                    c2844a = new C2844a(eVar);
                }
                Object obj2 = c2844a.f117342d;
                Object objE = uq.b.e();
                int i16 = c2844a.f117343e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f117340a;
                    l93.f.a aVarR9 = this.f117341b.r9((l93.e) obj);
                    c2844a.f117344f = vq.j.a(obj);
                    c2844a.f117346h = vq.j.a(c2844a);
                    c2844a.f117347j = vq.j.a(obj);
                    c2844a.f117348k = vq.j.a(hVar);
                    c2844a.f117349l = 0;
                    c2844a.f117343e = 1;
                    if (hVar.F(aVarR9, c2844a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f117338a = gVar;
            this.f117339b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super l93.f.a> hVar, tq.e eVar) {
            Object objA = this.f117338a.a(new C2843a(hVar, this.f117339b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll93/d$e;", "action", "Lk10/c0;", "Ll93/e$b;", "state", "Lk10/l;", "Ll93/e;", "<anonymous>", "(Ll93/d$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<l93.d.Setup, c0<l93.e.Initialized>, tq.e<? super k10.l<? extends l93.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117351f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f117352g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l93.e.Initialized O(l93.d.Setup setup, l93.e.Initialized initialized) {
            return initialized.a(setup.getMalwareDataPayload());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final l93.d.Setup setup = (l93.d.Setup) this.f117351f;
            c0 c0Var = (c0) this.f117352g;
            uq.b.e();
            if (this.f117350e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: l93.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.b.O(setup, (e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l93.d.Setup setup, c0<l93.e.Initialized> c0Var, tq.e<? super k10.l<? extends l93.e>> eVar) {
            b bVar = new b(eVar);
            bVar.f117351f = setup;
            bVar.f117352g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll93/d$b;", "action", "Ll93/e$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ll93/d$b;Ll93/e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<l93.d.b, l93.e.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117354f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l93.d.b bVar = (l93.d.b) this.f117354f;
            Object objE = uq.b.e();
            int i15 = this.f117353e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<l93.d.b> bVarY1 = q.this.Y1();
                this.f117354f = vq.j.a(bVar);
                this.f117353e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(l93.d.b bVar, l93.e.Initialized initialized, tq.e<? super i0> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f117354f = bVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll93/d$c;", "<unused var>", "Lk10/c0;", "Ll93/e$b;", "state", "Lk10/l;", "Ll93/e;", "<anonymous>", "(Ll93/d$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<l93.d.c, c0<l93.e.Initialized>, tq.e<? super k10.l<? extends l93.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117357f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l93.e.Error V(c0 c0Var, final q qVar, dx.b.Business business, l93.e.Initialized initialized) {
            return new l93.e.Error(((l93.e.Initialized) c0Var.a()).getMalwareDataPayload(), qVar.errorVMSFactory.a(qVar.errorMapper.b(new ib4.c.Params(business, false, new er.l() { // from class: l93.t
                @Override // er.l
                public final Object b(Object obj) {
                    return q.d.X(qVar, (ib4.c.b) obj);
                }
            }))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(q qVar, ib4.c.b bVar) {
            qVar.d9(l93.d.a.f117306a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f117357f;
            Object objE = uq.b.e();
            int i15 = this.f117356e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = q.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params("https://www.gov.pl/web/mobywatel-w-aplikacji/potencjalne", false, 2, null);
                this.f117357f = c0Var;
                this.f117356e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            final q qVar = q.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: l93.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.d.V(c0Var, qVar, business, (e.Initialized) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(l93.d.c cVar, c0<l93.e.Initialized> c0Var, tq.e<? super k10.l<? extends l93.e>> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f117357f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll93/d$d;", "<unused var>", "Lk10/c0;", "Ll93/e$b;", "state", "Lk10/l;", "Ll93/e;", "<anonymous>", "(Ll93/d$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<l93.d.C2841d, c0<l93.e.Initialized>, tq.e<? super k10.l<? extends l93.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117360f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l93.e.Error V(c0 c0Var, final q qVar, dx.b bVar, l93.e.Initialized initialized) {
            return new l93.e.Error(((l93.e.Initialized) c0Var.a()).getMalwareDataPayload(), qVar.errorVMSFactory.a(qVar.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: l93.v
                @Override // er.l
                public final Object b(Object obj) {
                    return q.e.X(qVar, (ib4.c.b) obj);
                }
            }))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(q qVar, ib4.c.b bVar) {
            qVar.d9(l93.d.a.f117306a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f117360f;
            Object objE = uq.b.e();
            int i15 = this.f117359e;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 b0Var = q.this.sendMailIntentUseCase;
                b0.Params params = new b0.Params(q.this.s9((String) pq.v.l0(((l93.e.Initialized) c0Var.a()).getMalwareDataPayload().a()), (String) pq.v.l0(((l93.e.Initialized) c0Var.a()).getMalwareDataPayload().b())), q.this.labelProvider.c(d93.a.f40532p).getText(), q.this.labelProvider.c(d93.a.f40527k).getText(), null, 8, null);
                this.f117360f = c0Var;
                this.f117359e = 1;
                obj = b0Var.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            final q qVar = q.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: l93.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.e.V(c0Var, qVar, bVar, (e.Initialized) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(l93.d.C2841d c2841d, c0<l93.e.Initialized> c0Var, tq.e<? super k10.l<? extends l93.e>> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f117360f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll93/d$a;", "<unused var>", "Lk10/c0;", "Ll93/e$a;", "state", "Lk10/l;", "Ll93/e;", "<anonymous>", "(Ll93/d$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<l93.d.a, c0<l93.e.Error>, tq.e<? super k10.l<? extends l93.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f117363f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l93.e.Initialized O(c0 c0Var, l93.e.Error error) {
            return new l93.e.Initialized(((l93.e.Error) c0Var.a()).getMalwareDataPayload());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f117363f;
            uq.b.e();
            if (this.f117362e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: l93.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O(c0Var, (e.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l93.d.a aVar, c0<l93.e.Error> c0Var, tq.e<? super k10.l<? extends l93.e>> eVar) {
            f fVar = new f(eVar);
            fVar.f117363f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public q(n93.a aVar, a14.w wVar, b0 b0Var, mx.c cVar, hb4.d dVar, ib4.c cVar2, yy.a aVar2) {
        this.screenMapper = aVar;
        this.openUrlIntentUseCase = wVar;
        this.sendMailIntentUseCase = b0Var;
        this.labelProvider = cVar;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar2;
        l93.e.Initialized initialized = new l93.e.Initialized(new MalwareDataPayload(pq.v.n(), pq.v.n()));
        this.initialState = initialized;
        this.stateMachine = aVar2.a(initialized, new er.l() { // from class: l93.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.v9(this.f117326a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), r9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l93.f.a r9(l93.e state) {
        return this.screenMapper.b(new n93.a.Params(state, b9(l93.d.b.a.f117307a), b9(l93.d.C2841d.f117309a), b9(l93.d.c.f117308a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String s9(String appName, String packageName) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.labelProvider.c(d93.a.f40523g).getText());
        sb5.append("\n");
        sb5.append(this.labelProvider.c(d93.a.f40524h).getText());
        sb5.append("\n");
        sb5.append(this.labelProvider.c(d93.a.f40525i).getText());
        sb5.append("\n");
        sb5.append(this.labelProvider.c(d93.a.f40526j).getText());
        sb5.append("\n");
        sb5.append(this.labelProvider.c(d93.a.f40522f).getText() + ' ' + appName + '/' + packageName);
        sb5.append("\n");
        sb5.append(this.labelProvider.c(d93.a.f40520d).getText());
        sb5.append("\n");
        sb5.append(this.labelProvider.c(d93.a.f40521e).getText() + ' ' + Build.VERSION.RELEASE);
        sb5.append("\n");
        sb5.append(this.labelProvider.c(d93.a.f40519c).getText());
        return sb5.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(l93.e.Initialized.class), new er.l() { // from class: l93.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.w9(this.f117327a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(l93.e.Error.class), new er.l() { // from class: l93.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.x9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(q qVar, k10.z zVar) {
        b bVar = new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(l93.d.Setup.class), oVar, bVar);
        zVar.x(q0.c(l93.d.b.class), oVar, qVar.new c(null));
        zVar.v(q0.c(l93.d.c.class), oVar, qVar.new d(null));
        zVar.v(q0.c(l93.d.C2841d.class), oVar, qVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(k10.z zVar) {
        f fVar = new f(null);
        zVar.v(q0.c(l93.d.a.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<l93.d.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<l93.e, l93.d> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<l93.f.a> getState() {
        return this.state;
    }

    public final void t9(MalwareDataPayload malwareDataPayload) {
        d9(new l93.d.Setup(malwareDataPayload));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
