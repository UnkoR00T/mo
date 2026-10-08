package dc2;

import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bk\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020&H\u0096\u0001¢\u0006\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010I\u001a\b\u0012\u0004\u0012\u00020D0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR&\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030J8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010 \u001a\b\u0012\u0004\u0012\u00020!0P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0018\u0010Y\u001a\u00020V*\u00020U8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0018\u0010^\u001a\u00020[*\u00020Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Ldc2/u;", "Ll00/g;", "Ldc2/d;", "Ldc2/c;", "Ldc2/g;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lfc2/h;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Ljj0/b;", "hasTrustedProfileUseCase", "Lfc2/b;", "errorMapper", "La14/w;", "openUrlUseCase", "globalSnackBarManager", "Ll44/e;", "getUserEdorAddressUC", "Lqb2/a;", "createOfficeSelectionDataUC", "Lhb4/d;", "errorVmsFactory", "Lrb2/a;", "isTheftFeatureFlagActiveUC", "Lec2/a;", "contract", "<init>", "(Lyy/a;Lfc2/h;Lac4/a;Ljj0/b;Lfc2/b;La14/w;Li70/e;Ll44/e;Lqb2/a;Lhb4/d;Lrb2/a;Lec2/a;)V", "state", "Ldc2/g$a;", "C9", "(Ldc2/d;)Ldc2/g$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lfc2/h;", "c", "Lac4/a;", "d", "Ljj0/b;", "e", "Lfc2/b;", "f", "La14/w;", "g", "Li70/e;", "h", "Ll44/e;", "j", "Lqb2/a;", "k", "Lhb4/d;", "l", "Lec2/a;", "Ldc2/d$b;", "m", "Ldc2/d$b;", "initialState", "Lxw/b;", "Ldc2/c$a;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "Ldx/b;", "Lfc2/b$a$a;", "A9", "(Ldx/b;)Lfc2/b$a$a;", "genericErrorParams", "Lfc2/b$a;", "Lhb4/c;", "B9", "(Lfc2/b$a;)Lhb4/c;", "vmsAdapter", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<dc2.d, dc2.c> implements dc2.g, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fc2.h mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final jj0.b hasTrustedProfileUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fc2.b errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l44.e getUserEdorAddressUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final qb2.a createOfficeSelectionDataUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVmsFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ec2.a contract;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final dc2.d.Initialized initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<dc2.c.a> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<dc2.d, dc2.c> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<dc2.g.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<dc2.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f40861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f40862b;

        /* JADX INFO: renamed from: dc2.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0904a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f40863a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f40864b;

            /* JADX INFO: renamed from: dc2.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0905a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f40865d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f40866e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f40867f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f40869h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f40870j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f40871k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f40872l;

                public C0905a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f40865d = obj;
                    this.f40866e |= PKIFailureInfo.systemUnavail;
                    return C0904a.this.F(null, this);
                }
            }

            public C0904a(mu.h hVar, u uVar) {
                this.f40863a = hVar;
                this.f40864b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0905a c0905a;
                if (eVar instanceof C0905a) {
                    c0905a = (C0905a) eVar;
                    int i15 = c0905a.f40866e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0905a.f40866e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0905a = new C0905a(eVar);
                    }
                } else {
                    c0905a = new C0905a(eVar);
                }
                Object obj2 = c0905a.f40865d;
                Object objE = uq.b.e();
                int i16 = c0905a.f40866e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f40863a;
                    dc2.g.a aVarC9 = this.f40864b.C9((dc2.d) obj);
                    c0905a.f40867f = vq.j.a(obj);
                    c0905a.f40869h = vq.j.a(c0905a);
                    c0905a.f40870j = vq.j.a(obj);
                    c0905a.f40871k = vq.j.a(hVar);
                    c0905a.f40872l = 0;
                    c0905a.f40866e = 1;
                    if (hVar.F(aVarC9, c0905a) == objE) {
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

        public a(mu.g gVar, u uVar) {
            this.f40861a = gVar;
            this.f40862b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super dc2.g.a> hVar, tq.e eVar) {
            Object objA = this.f40861a.a(new C0904a(hVar, this.f40862b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldc2/c$g;", "action", "Ldc2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldc2/c$g;Ldc2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<dc2.c.OnUrlClick, dc2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40873e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40874f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dc2.c.OnUrlClick onUrlClick = (dc2.c.OnUrlClick) this.f40874f;
            Object objE = uq.b.e();
            int i15 = this.f40873e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = u.this.openUrlUseCase;
                a14.w.Params params = new a14.w.Params(onUrlClick.getUrl(), false, 2, null);
                this.f40874f = vq.j.a(onUrlClick);
                this.f40873e = 1;
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
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                uVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dc2.c.OnUrlClick onUrlClick, dc2.d dVar, tq.e<? super i0> eVar) {
            b bVar = u.this.new b(eVar);
            bVar.f40874f = onUrlClick;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldc2/c$b;", "<unused var>", "Ldc2/d;", "Loq/i0;", "<anonymous>", "(Ldc2/c$b;Ldc2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<dc2.c.b, dc2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40876e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f40876e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                dc2.c.a.C0900c c0900c = dc2.c.a.C0900c.f40805a;
                this.f40876e = 1;
                if (uVar.F(c0900c, this) == objE) {
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
        public final Object w(dc2.c.b bVar, dc2.d dVar, tq.e<? super i0> eVar) {
            return u.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldc2/c$d;", "<unused var>", "Ldc2/d;", "Loq/i0;", "<anonymous>", "(Ldc2/c$d;Ldc2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<dc2.c.d, dc2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40878e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f40878e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                dc2.c.a.b bVar = dc2.c.a.b.f40804a;
                this.f40878e = 1;
                if (uVar.F(bVar, this) == objE) {
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
        public final Object w(dc2.c.d dVar, dc2.d dVar2, tq.e<? super i0> eVar) {
            return u.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldc2/c$f;", "action", "Lk10/c0;", "Ldc2/d$d;", "state", "Lk10/l;", "Ldc2/d;", "<anonymous>", "(Ldc2/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<dc2.c.OnSelected, k10.c0<dc2.d.InterfaceC0902d>, tq.e<? super k10.l<? extends dc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40880e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40881f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f40882g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(dc2.c.OnSelected onSelected, dc2.d.InterfaceC0902d interfaceC0902d) {
            return new Fetching(interfaceC0902d.getIsTheftEnabled(), onSelected.getReason());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dc2.c.OnSelected onSelected = (dc2.c.OnSelected) this.f40881f;
            k10.c0 c0Var = (k10.c0) this.f40882g;
            uq.b.e();
            if (this.f40880e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: dc2.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(onSelected, (d.InterfaceC0902d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dc2.c.OnSelected onSelected, k10.c0<dc2.d.InterfaceC0902d> c0Var, tq.e<? super k10.l<? extends dc2.d>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f40881f = onSelected;
            eVar2.f40882g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ldc2/f;", "state", "Lk10/l;", "Ldc2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<Fetching>, tq.e<? super k10.l<? extends dc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40884f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ldc2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends dc2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f40886e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f40887f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Fetching> f40888g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, k10.c0<Fetching> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f40887f = uVar;
                this.f40888g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error Y(u uVar, dx.b bVar, Fetching fetching) {
                return new Error(uVar.B9(uVar.A9(bVar)), fetching.getIsTheftEnabled(), fetching.getSelectedReason());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final dc2.d.InitializedWithTrustedProfile Z(Fetching fetching) {
                return new dc2.d.InitializedWithTrustedProfile(fetching.getIsTheftEnabled(), fetching.getSelectedReason());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error a0(u uVar, Fetching fetching) {
                return new Error(uVar.B9(new fc2.b.a.MissingTrustedProfile(uVar.b9(dc2.a.f40799a))), fetching.getIsTheftEnabled(), fetching.getSelectedReason());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f40886e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    jj0.b bVar = this.f40887f.hasTrustedProfileUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f40886e = 1;
                    obj = bVar.c(c1792a, this);
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
                k10.c0<Fetching> c0Var = this.f40888g;
                final u uVar = this.f40887f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: dc2.w
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.f.a.Y(uVar, bVar2, (Fetching) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                boolean zBooleanValue = ((Boolean) ((dx.i.Right) iVar).b()).booleanValue();
                if (zBooleanValue) {
                    return c0Var.d(new er.l() { // from class: dc2.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.f.a.Z((Fetching) obj2);
                        }
                    });
                }
                if (zBooleanValue) {
                    throw new oq.p();
                }
                return c0Var.d(new er.l() { // from class: dc2.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.f.a.a0(uVar, (Fetching) obj2);
                    }
                });
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f40887f, this.f40888g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends dc2.d>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f40884f;
            Object objE = uq.b.e();
            int i15 = this.f40883e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = u.this.callActionWithLoaderUseCase;
            a aVar2 = new a(u.this, c0Var, null);
            this.f40884f = vq.j.a(c0Var);
            this.f40883e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Fetching> c0Var, tq.e<? super k10.l<? extends dc2.d>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f40884f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldc2/b;", "<unused var>", "Lk10/c0;", "Ldc2/e;", "state", "Lk10/l;", "Ldc2/d;", "<anonymous>", "(Ldc2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<dc2.b, k10.c0<Error>, tq.e<? super k10.l<? extends dc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40890f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(Error error) {
            return new Fetching(error.getIsTheftEnabled(), error.getSelectedReason());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f40890f;
            uq.b.e();
            if (this.f40889e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: dc2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dc2.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends dc2.d>> eVar) {
            g gVar = new g(eVar);
            gVar.f40890f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldc2/a;", "<unused var>", "Ldc2/e;", "Loq/i0;", "<anonymous>", "(Ldc2/a;Ldc2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<dc2.a, Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40891e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f40891e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(dc2.c.d.f40811a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dc2.a aVar, Error error, tq.e<? super i0> eVar) {
            return u.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldc2/d$c;", "state", "Loq/i0;", "<anonymous>", "(Ldc2/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<dc2.d.InitializedWithTrustedProfile, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40894f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dc2.d.InitializedWithTrustedProfile initializedWithTrustedProfile = (dc2.d.InitializedWithTrustedProfile) this.f40894f;
            uq.b.e();
            if (this.f40893e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            iy.b0 b0VarA = u.this.getUserEdorAddressUC.a(gz.b.a.C1792a.f78542a);
            if (b0VarA != null) {
                u.this.d9(new dc2.c.OnNext(b0VarA, initializedWithTrustedProfile.getSelectedReason()));
            } else {
                u.this.d9(new dc2.c.OnEdorAuth(initializedWithTrustedProfile.getSelectedReason()));
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(dc2.d.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super i0> eVar) {
            return ((i) v(initializedWithTrustedProfile, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            i iVar = u.this.new i(eVar);
            iVar.f40894f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldc2/c$c;", "action", "Ldc2/d$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldc2/c$c;Ldc2/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<dc2.c.OnEdorAuth, dc2.d.InitializedWithTrustedProfile, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40897f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(u uVar, dc2.c.OnEdorAuth onEdorAuth, iy.b0 b0Var) {
            uVar.d9(new dc2.c.OnNext(b0Var, onEdorAuth.getReason()));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dc2.c.OnEdorAuth onEdorAuth = (dc2.c.OnEdorAuth) this.f40897f;
            Object objE = uq.b.e();
            int i15 = this.f40896e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                final u uVar2 = u.this;
                dc2.c.a.EdorAuth edorAuth = new dc2.c.a.EdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: dc2.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.j.O(uVar2, onEdorAuth, (iy.b0) obj2);
                    }
                }, null, 2, null));
                this.f40897f = vq.j.a(onEdorAuth);
                this.f40896e = 1;
                if (uVar.F(edorAuth, this) == objE) {
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
        public final Object w(dc2.c.OnEdorAuth onEdorAuth, dc2.d.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super i0> eVar) {
            j jVar = u.this.new j(eVar);
            jVar.f40897f = onEdorAuth;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldc2/c$e;", "action", "Ldc2/d$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldc2/c$e;Ldc2/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<dc2.c.OnNext, dc2.d.InitializedWithTrustedProfile, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40900f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40902a;

            static {
                int[] iArr = new int[hl0.c.values().length];
                try {
                    iArr[hl0.c.LOSS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[hl0.c.DAMAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[hl0.c.IDENTITY_THEFT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f40902a = iArr;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dc2.c.a officeSelection;
            dc2.c.OnNext onNext = (dc2.c.OnNext) this.f40900f;
            Object objE = uq.b.e();
            int i15 = this.f40899e;
            if (i15 == 0) {
                oq.u.b(obj);
                u.this.contract.g2(new mb2.a(onNext.getReason(), onNext.getUserEdorAddress()));
                xw.b<dc2.c.a> bVarY1 = u.this.Y1();
                int i16 = a.f40902a[onNext.getReason().ordinal()];
                if (i16 == 1) {
                    officeSelection = dc2.c.a.f.f40808a;
                } else if (i16 == 2) {
                    officeSelection = dc2.c.a.d.f40806a;
                } else {
                    if (i16 != 3) {
                        throw new oq.p();
                    }
                    officeSelection = new dc2.c.a.OfficeSelection(u.this.createOfficeSelectionDataUC.b(new qb2.a.Params(u.this.contract.u())));
                }
                this.f40900f = vq.j.a(onNext);
                this.f40899e = 1;
                if (bVarY1.F(officeSelection, this) == objE) {
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
        public final Object w(dc2.c.OnNext onNext, dc2.d.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super i0> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f40900f = onNext;
            return kVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, fc2.h hVar, ac4.a aVar2, jj0.b bVar, fc2.b bVar2, a14.w wVar, i70.e eVar, l44.e eVar2, qb2.a aVar3, hb4.d dVar, rb2.a aVar4, ec2.a aVar5) {
        this.mapper = hVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.hasTrustedProfileUseCase = bVar;
        this.errorMapper = bVar2;
        this.openUrlUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.getUserEdorAddressUC = eVar2;
        this.createOfficeSelectionDataUC = aVar3;
        this.errorVmsFactory = dVar;
        this.contract = aVar5;
        dc2.d.Initialized initialized = new dc2.d.Initialized(aVar4.b(gz.b.a.C1792a.f78542a).booleanValue());
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: dc2.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.G9(this.f40846a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), C9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fc2.b.a.Generic A9(dx.b bVar) {
        return new fc2.b.a.Generic(bVar, b9(dc2.b.f40802a), b9(dc2.a.f40799a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c B9(fc2.b.a aVar) {
        return this.errorVmsFactory.a(this.errorMapper.b(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dc2.g.a C9(dc2.d state) {
        return this.mapper.b(new fc2.h.Params(state, new er.l() { // from class: dc2.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.D9(this.f40844a, (hl0.c) obj);
            }
        }, b9(dc2.c.b.f40809a), new er.l() { // from class: dc2.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.E9(this.f40845a, (String) obj);
            }
        }, b9(dc2.c.d.f40811a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(u uVar, hl0.c cVar) {
        uVar.d9(new dc2.c.OnSelected(cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(u uVar, String str) {
        uVar.d9(new dc2.c.OnUrlClick(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(dc2.d.class), new er.l() { // from class: dc2.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.H9(this.f40840a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(dc2.d.InterfaceC0902d.class), new er.l() { // from class: dc2.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.I9((k10.z) obj);
            }
        });
        vVar.c(q0.c(Fetching.class), new er.l() { // from class: dc2.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.J9(this.f40841a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: dc2.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.K9(this.f40842a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(dc2.d.InitializedWithTrustedProfile.class), new er.l() { // from class: dc2.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.L9(this.f40843a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(u uVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(dc2.c.OnUrlClick.class), oVar, bVar);
        zVar.x(q0.c(dc2.c.b.class), oVar, uVar.new c(null));
        zVar.x(q0.c(dc2.c.d.class), oVar, uVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(k10.z zVar) {
        e eVar = new e(null);
        zVar.v(q0.c(dc2.c.OnSelected.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(u uVar, k10.z zVar) {
        zVar.A(uVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(u uVar, k10.z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(dc2.b.class), oVar, gVar);
        zVar.x(q0.c(dc2.a.class), oVar, uVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(u uVar, k10.z zVar) {
        zVar.C(uVar.new i(null));
        j jVar = uVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(dc2.c.OnEdorAuth.class), oVar, jVar);
        zVar.x(q0.c(dc2.c.OnNext.class), oVar, uVar.new k(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ec2.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<dc2.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<dc2.d, dc2.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<dc2.g.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(dc2.c.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }
}
