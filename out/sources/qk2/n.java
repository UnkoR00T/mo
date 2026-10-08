package qk2;

import fr.q0;
import java.util.Date;
import k10.c0;
import k10.t;
import k10.v;
import lk2.Document;
import lk2.MIdCardData;
import mu.p0;
import mz3.z;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 [2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\\Bc\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#*\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010(\u001a\u00020 2\u0006\u0010'\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR&\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030D8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010P\u001a\b\u0012\u0004\u0012\u00020K0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR \u0010V\u001a\b\u0012\u0004\u0012\u00020#0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020X0W8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010Y¨\u0006]"}, d2 = {"Lqk2/n;", "Ll00/g;", "Lqk2/b;", "Lqk2/a;", "Lqk2/c;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lrk2/a;", "mapper", "Lmx/c;", "labelProvider", "La14/d;", "copyToClipboardUseCase", "Lez/c;", "dateConverter", "Lvk2/c;", "mIdErrorMapper", "snackBarManagerStateHolder", "Lmz3/z;", "updateDocumentAsyncUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lkk2/a;", "midCardContainersInteractor", "Llk2/c;", "setupData", "<init>", "(Lyy/a;Lrk2/a;Lmx/c;La14/d;Lez/c;Lvk2/c;Li70/n;Lmz3/z;Lac4/a;Lkk2/a;Llk2/c;)V", "Ldx/b;", "domainError", "Loq/i0;", "v9", "(Ldx/b;)V", "Lqk2/c$a;", "w9", "(Lqk2/b;)Lqk2/c$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lrk2/a;", "c", "Lmx/c;", "d", "La14/d;", "e", "Lez/c;", "f", "Lvk2/c;", "g", "Li70/n;", "h", "Lmz3/z;", "j", "Lac4/a;", "k", "Lkk2/a;", "l", "Llk2/c;", "Lqk2/b$a;", "m", "Lqk2/b$a;", "initialState", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lqk2/a$f;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "r", "a", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<qk2.b, a> implements qk2.c, zx.d, i70.n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f167085s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final rq0.b.d f167086t = rq0.b.d.ID_CARD;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rk2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final vk2.c mIdErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final kk2.a midCardContainersInteractor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final MIdCardData setupData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final qk2.b.Initialized initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final t<qk2.b, a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.f> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<qk2.c.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167101e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dx.b f167103g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(dx.b bVar, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f167103g = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(n nVar, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.AbstractC2161b.a) || (bVar instanceof ib4.c.b.a.Close)) {
                nVar.d9(a.C4200a.f167050a);
            } else if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f167101e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            vk2.c cVar = n.this.mIdErrorMapper;
            dx.b bVar = this.f167103g;
            final n nVar = n.this;
            n.this.d9(new a.Error(cVar.b(new ib4.c.Params(bVar, false, new er.l() { // from class: qk2.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.b.V(nVar, (ib4.c.b) obj2);
                }
            }, 2, null))));
            return i0.f148189a;
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return n.this.new b(this.f167103g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<qk2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f167104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f167105b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f167106a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f167107b;

            /* JADX INFO: renamed from: qk2.n$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4203a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f167108d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f167109e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f167110f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f167112h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f167113j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f167114k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f167115l;

                public C4203a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f167108d = obj;
                    this.f167109e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f167106a = hVar;
                this.f167107b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4203a c4203a;
                if (eVar instanceof C4203a) {
                    c4203a = (C4203a) eVar;
                    int i15 = c4203a.f167109e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4203a.f167109e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4203a = new C4203a(eVar);
                    }
                } else {
                    c4203a = new C4203a(eVar);
                }
                Object obj2 = c4203a.f167108d;
                Object objE = uq.b.e();
                int i16 = c4203a.f167109e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f167106a;
                    qk2.c.Data dataW9 = this.f167107b.w9((qk2.b) obj);
                    c4203a.f167110f = vq.j.a(obj);
                    c4203a.f167112h = vq.j.a(c4203a);
                    c4203a.f167113j = vq.j.a(obj);
                    c4203a.f167114k = vq.j.a(hVar);
                    c4203a.f167115l = 0;
                    c4203a.f167109e = 1;
                    if (hVar.F(dataW9, c4203a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public c(mu.g gVar, n nVar) {
            this.f167104a = gVar;
            this.f167105b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qk2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f167104a.a(new a(hVar, this.f167105b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqk2/a$a;", "<unused var>", "Lqk2/b;", "Loq/i0;", "<anonymous>", "(Lqk2/a$a;Lqk2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<a.C4200a, qk2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167116e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f167116e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a.f> bVarY1 = n.this.Y1();
                a.f.b bVar = a.f.b.f167056a;
                this.f167116e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.C4200a c4200a, qk2.b bVar, tq.e<? super i0> eVar) {
            return n.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqk2/a$c;", "action", "Lqk2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqk2/a$c;Lqk2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a.Error, qk2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167119f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.Error error = (a.Error) this.f167119f;
            Object objE = uq.b.e();
            int i15 = this.f167118e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a.f> bVarY1 = n.this.Y1();
                a.f.Error error2 = new a.f.Error(error.getError());
                this.f167119f = vq.j.a(error);
                this.f167118e = 1;
                if (bVarY1.F(error2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.Error error, qk2.b bVar, tq.e<? super i0> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f167119f = error;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqk2/a$b;", "<unused var>", "Lqk2/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lqk2/a$b;Lqk2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a.b, qk2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f167121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f167122f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f167123g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f167124h;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qk2.b.Initialized initialized = (qk2.b.Initialized) this.f167124h;
            Object objE = uq.b.e();
            int i15 = this.f167123g;
            if (i15 == 0) {
                u.b(obj);
                String number = initialized.getPersonalDataScope().getScope().getData().getPersonalIdCard().getNumber();
                if (number != null) {
                    n nVar = n.this;
                    a14.d dVar = nVar.copyToClipboardUseCase;
                    a14.d.Params params = new a14.d.Params(number, nVar.labelProvider.c(ik2.a.K));
                    this.f167124h = vq.j.a(initialized);
                    this.f167121e = vq.j.a(number);
                    this.f167122f = 0;
                    this.f167123g = 1;
                    if (dVar.c(params, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.b bVar, qk2.b.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = n.this.new f(eVar);
            fVar.f167124h = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqk2/a$g;", "action", "Lqk2/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lqk2/a$g;Lqk2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<qk2.a.g, qk2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167126e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167127f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f167129e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f167130f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ qk2.b.Initialized f167131g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, qk2.b.Initialized initialized, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f167130f = nVar;
                this.f167131g = initialized;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f167129e;
                if (i15 == 0) {
                    u.b(obj);
                    z zVar = this.f167130f.updateDocumentAsyncUC;
                    rq0.b.d dVar = n.f167086t;
                    z.b bVar = z.b.UPDATE;
                    Document document = this.f167131g.getPersonalDataScope().getDocument();
                    z.Params params = new z.Params(dVar, bVar, document != null ? document.getDocumentId() : null, false, 8, null);
                    this.f167129e = 1;
                    obj = zVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                n nVar = this.f167130f;
                if (iVar instanceof dx.i.Left) {
                    nVar.v9((dx.b) ((dx.i.Left) iVar).b());
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    z.c cVar = (z.c) ((dx.i.Right) iVar).b();
                    if (cVar instanceof z.c.a) {
                        nVar.y(new p50.a.DefaultWithIcon(nVar.labelProvider.c(ik2.a.f93216q0), false, null, null, 14, null));
                    } else {
                        if (!(cVar instanceof z.c.UpdateStarted)) {
                            throw new oq.p();
                        }
                        nVar.d9(qk2.a.C4200a.f167050a);
                    }
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f167130f, this.f167131g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qk2.b.Initialized initialized = (qk2.b.Initialized) this.f167127f;
            Object objE = uq.b.e();
            int i15 = this.f167126e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = n.this.callActionWithLoaderUseCase;
                a aVar2 = new a(n.this, initialized, null);
                this.f167127f = vq.j.a(initialized);
                this.f167126e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qk2.a.g gVar, qk2.b.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar2 = n.this.new g(eVar);
            gVar2.f167127f = initialized;
            return gVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqk2/a$d;", "<unused var>", "Lqk2/b$a;", "Loq/i0;", "<anonymous>", "(Lqk2/a$d;Lqk2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.d, qk2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167132e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f167132e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a.f> bVarY1 = n.this.Y1();
                a.f.c cVar = a.f.c.f167057a;
                this.f167132e = 1;
                if (bVarY1.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.d dVar, qk2.b.Initialized initialized, tq.e<? super i0> eVar) {
            return n.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqk2/a$e;", "<unused var>", "Lqk2/b$a;", "Loq/i0;", "<anonymous>", "(Lqk2/a$e;Lqk2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a.e, qk2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167134e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f167134e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a.f> bVarY1 = n.this.Y1();
                a.f.d dVar = a.f.d.f167058a;
                this.f167134e = 1;
                if (bVarY1.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.e eVar, qk2.b.Initialized initialized, tq.e<? super i0> eVar2) {
            return n.this.new i(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lqk2/b$b;", "state", "Lk10/l;", "Lqk2/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<c0<qk2.b.C4202b>, tq.e<? super k10.l<? extends qk2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f167136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f167137f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f167138g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f167139h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f167140j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f167141k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f167142l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f167143m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f167144n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f167145p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f167146q;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qk2.b.Initialized O(MIdCardData mIdCardData, qk2.b.C4202b c4202b) {
            return new qk2.b.Initialized(mIdCardData);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:38:0x0135  */
        /* JADX WARN: Code duplicated, block: B:41:0x013c  */
        /* JADX WARN: Code duplicated, block: B:43:0x014c  */
        /* JADX WARN: Code duplicated, block: B:45:0x0150  */
        /* JADX WARN: Code duplicated, block: B:47:0x0162  */
        /* JADX WARN: Code duplicated, block: B:49:0x0168  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objC;
            n nVar;
            Object objL;
            int i15;
            dx.i iVar;
            i0 i0Var;
            int i16;
            dx.i iVar2;
            MIdCardData mIdCardData;
            Document document;
            String documentId;
            Object objF;
            final MIdCardData mIdCardData2;
            dx.i iVar3;
            c0 c0Var = (c0) this.f167146q;
            Object objE = uq.b.e();
            int i17 = this.f167145p;
            if (i17 == 0) {
                u.b(obj);
                kk2.a aVar = n.this.midCardContainersInteractor;
                this.f167146q = c0Var;
                this.f167145p = 1;
                objC = aVar.c(this);
                if (objC != objE) {
                }
                return objE;
            }
            if (i17 == 1) {
                u.b(obj);
                objC = obj;
            } else {
                if (i17 == 2) {
                    int i18 = this.f167142l;
                    int i19 = this.f167141k;
                    i0 i0Var2 = (i0) this.f167138g;
                    n nVar2 = (n) this.f167137f;
                    dx.i iVar4 = (dx.i) this.f167136e;
                    u.b(obj);
                    iVar = iVar4;
                    i0Var = i0Var2;
                    i16 = i18;
                    nVar = nVar2;
                    i15 = i19;
                    objL = obj;
                    iVar2 = (dx.i) objL;
                    if (iVar2 instanceof dx.i.Left) {
                        nVar.v9((dx.b) ((dx.i.Left) iVar2).b());
                        return c0Var.c();
                    }
                    if (iVar2 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    mIdCardData = (MIdCardData) ((dx.i.Right) iVar2).b();
                    kk2.a aVar2 = nVar.midCardContainersInteractor;
                    document = mIdCardData.getDocument();
                    if (document != null) {
                        documentId = document.getDocumentId();
                    } else {
                        documentId = null;
                    }
                    Date dateD = nVar.dateConverter.d(mIdCardData.getScope().getData().getMobileIdCard().getValidTo().getDate());
                    this.f167146q = c0Var;
                    this.f167136e = vq.j.a(iVar);
                    this.f167137f = nVar;
                    this.f167138g = vq.j.a(i0Var);
                    this.f167139h = vq.j.a(iVar2);
                    this.f167140j = mIdCardData;
                    this.f167141k = i15;
                    this.f167142l = i16;
                    this.f167143m = 0;
                    this.f167144n = 0;
                    this.f167145p = 3;
                    objF = aVar2.f(dateD, documentId, this);
                    if (objF != objE) {
                        mIdCardData2 = mIdCardData;
                    }
                    return objE;
                }
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mIdCardData2 = (MIdCardData) this.f167140j;
                nVar = (n) this.f167137f;
                u.b(obj);
                objF = obj;
            }
            iVar3 = (dx.i) objF;
            if (iVar3 instanceof dx.i.Left) {
                nVar.v9((dx.b) ((dx.i.Left) iVar3).b());
                return c0Var.c();
            }
            if (iVar3 instanceof dx.i.Right) {
                throw new oq.p();
            }
            return c0Var.d(new er.l() { // from class: qk2.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.j.O(mIdCardData2, (b.C4202b) obj2);
                }
            });
            dx.i iVar5 = (dx.i) objC;
            nVar = n.this;
            if (iVar5 instanceof dx.i.Left) {
                nVar.v9((dx.b) ((dx.i.Left) iVar5).b());
                return c0Var.c();
            }
            if (!(iVar5 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            i0 i0Var3 = (i0) ((dx.i.Right) iVar5).b();
            kk2.a aVar3 = nVar.midCardContainersInteractor;
            this.f167146q = c0Var;
            this.f167136e = vq.j.a(iVar5);
            this.f167137f = nVar;
            this.f167138g = vq.j.a(i0Var3);
            this.f167141k = 0;
            this.f167142l = 0;
            this.f167145p = 2;
            objL = aVar3.l(this);
            if (objL != objE) {
                i15 = 0;
                iVar = iVar5;
                i0Var = i0Var3;
                i16 = 0;
                iVar2 = (dx.i) objL;
                if (iVar2 instanceof dx.i.Left) {
                    nVar.v9((dx.b) ((dx.i.Left) iVar2).b());
                    return c0Var.c();
                }
                if (iVar2 instanceof dx.i.Right) {
                    throw new oq.p();
                }
                mIdCardData = (MIdCardData) ((dx.i.Right) iVar2).b();
                kk2.a aVar4 = nVar.midCardContainersInteractor;
                document = mIdCardData.getDocument();
                if (document != null) {
                    documentId = document.getDocumentId();
                } else {
                    documentId = null;
                }
                Date dateD2 = nVar.dateConverter.d(mIdCardData.getScope().getData().getMobileIdCard().getValidTo().getDate());
                this.f167146q = c0Var;
                this.f167136e = vq.j.a(iVar);
                this.f167137f = nVar;
                this.f167138g = vq.j.a(i0Var);
                this.f167139h = vq.j.a(iVar2);
                this.f167140j = mIdCardData;
                this.f167141k = i15;
                this.f167142l = i16;
                this.f167143m = 0;
                this.f167144n = 0;
                this.f167145p = 3;
                objF = aVar4.f(dateD2, documentId, this);
                if (objF != objE) {
                    mIdCardData2 = mIdCardData;
                    iVar3 = (dx.i) objF;
                    if (iVar3 instanceof dx.i.Left) {
                        nVar.v9((dx.b) ((dx.i.Left) iVar3).b());
                        return c0Var.c();
                    }
                    if (iVar3 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    return c0Var.d(new er.l() { // from class: qk2.p
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.j.O(mIdCardData2, (b.C4202b) obj2);
                        }
                    });
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<qk2.b.C4202b> c0Var, tq.e<? super k10.l<? extends qk2.b>> eVar) {
            return ((j) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            j jVar = n.this.new j(eVar);
            jVar.f167146q = obj;
            return jVar;
        }
    }

    public n(yy.a aVar, rk2.a aVar2, mx.c cVar, a14.d dVar, ez.c cVar2, vk2.c cVar3, i70.n nVar, z zVar, ac4.a aVar3, kk2.a aVar4, MIdCardData mIdCardData) {
        this.mapper = aVar2;
        this.labelProvider = cVar;
        this.copyToClipboardUseCase = dVar;
        this.dateConverter = cVar2;
        this.mIdErrorMapper = cVar3;
        this.snackBarManagerStateHolder = nVar;
        this.updateDocumentAsyncUC = zVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.midCardContainersInteractor = aVar4;
        this.setupData = mIdCardData;
        qk2.b.Initialized initialized = new qk2.b.Initialized(mIdCardData);
        this.initialState = initialized;
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: qk2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f167083a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), w9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(n nVar, k10.z zVar) {
        f fVar = nVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.b.class), oVar, fVar);
        zVar.x(q0.c(a.g.class), oVar, nVar.new g(null));
        zVar.x(q0.c(a.d.class), oVar, nVar.new h(null));
        zVar.x(q0.c(a.e.class), oVar, nVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(n nVar, k10.z zVar) {
        zVar.A(nVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v9(dx.b domainError) {
        i00.a.a(this, new b(domainError, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qk2.c.Data w9(qk2.b bVar) {
        return this.mapper.b(new rk2.a.Params(bVar, b9(a.g.f167059a), b9(a.C4200a.f167050a), b9(a.b.f167051a), b9(a.d.f167053a), b9(a.e.f167054a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final n nVar, v vVar) {
        vVar.c(q0.c(qk2.b.class), new er.l() { // from class: qk2.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.z9(this.f167080a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(qk2.b.Initialized.class), new er.l() { // from class: qk2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.A9(this.f167081a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(qk2.b.C4202b.class), new er.l() { // from class: qk2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.B9(this.f167082a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(n nVar, k10.z zVar) {
        d dVar = nVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.C4200a.class), oVar, dVar);
        zVar.x(q0.c(a.Error.class), oVar, nVar.new e(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<qk2.b, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<qk2.c.Data> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(MIdCardData mIdCardData) {
        super.P5(mIdCardData);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
