package yl3;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import kk3.Dictionary;
import kk3.DictionaryResponse;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001ABC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lyl3/r;", "Ll00/g;", "Lyl3/f;", "Lyl3/a;", "Lyl3/g;", "", "Lyy/a;", "stateMachineFactory", "Lam3/b;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Ljk3/b;", "interactor", "Lzl3/a;", "contract", "<init>", "(Lyy/a;Lam3/b;Lhb4/d;Lib4/c;Lac4/a;Ljk3/b;Lzl3/a;)V", "Ldx/b;", "Lhb4/c;", "A9", "(Ldx/b;)Lhb4/c;", "state", "Lyl3/g$a;", "t9", "(Lyl3/f;)Lyl3/g$a;", "b", "Lam3/b;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Lac4/a;", "f", "Ljk3/b;", "g", "Lzl3/a;", "Lyl3/e;", "h", "Lyl3/e;", "initialState", "Lxw/b;", "Lyl3/a$b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "m", "a", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<yl3.f, yl3.a> implements yl3.g, zx.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a f227829m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f227830n = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final am3.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final jk3.b interactor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final zl3.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final yl3.e initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yl3.a.b> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<yl3.f, yl3.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<yl3.g.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyl3/r$a;", "", "<init>", "()V", "", "DICTIONARY_ID", "Ljava/lang/String;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<kk3.b, i0> {
        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(kk3.b bVar) {
            c(bVar.getValue());
            return i0.f148189a;
        }

        public final void c(String str) {
            r.this.d9(new yl3.a.OnCardClick(str, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<yl3.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f227842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f227843b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f227844a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f227845b;

            /* JADX INFO: renamed from: yl3.r$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6119a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f227846d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f227847e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f227848f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f227850h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f227851j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f227852k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f227853l;

                public C6119a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f227846d = obj;
                    this.f227847e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f227844a = hVar;
                this.f227845b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6119a c6119a;
                if (eVar instanceof C6119a) {
                    c6119a = (C6119a) eVar;
                    int i15 = c6119a.f227847e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6119a.f227847e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6119a = new C6119a(eVar);
                    }
                } else {
                    c6119a = new C6119a(eVar);
                }
                Object obj2 = c6119a.f227846d;
                Object objE = uq.b.e();
                int i16 = c6119a.f227847e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f227844a;
                    yl3.g.a aVarT9 = this.f227845b.t9((yl3.f) obj);
                    c6119a.f227848f = vq.j.a(obj);
                    c6119a.f227850h = vq.j.a(c6119a);
                    c6119a.f227851j = vq.j.a(obj);
                    c6119a.f227852k = vq.j.a(hVar);
                    c6119a.f227853l = 0;
                    c6119a.f227847e = 1;
                    if (hVar.F(aVarT9, c6119a) == objE) {
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

        public c(mu.g gVar, r rVar) {
            this.f227842a = gVar;
            this.f227843b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super yl3.g.a> hVar, tq.e eVar) {
            Object objA = this.f227842a.a(new a(hVar, this.f227843b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyl3/a$c;", "<unused var>", "Lyl3/f;", "Loq/i0;", "<anonymous>", "(Lyl3/a$c;Lyl3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<yl3.a.c, yl3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227854e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227854e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                yl3.a.b.C6116a c6116a = yl3.a.b.C6116a.f227800a;
                this.f227854e = 1;
                if (rVar.F(c6116a, this) == objE) {
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
        public final Object w(yl3.a.c cVar, yl3.f fVar, tq.e<? super i0> eVar) {
            return r.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyl3/a$a;", "<unused var>", "Lyl3/f;", "Loq/i0;", "<anonymous>", "(Lyl3/a$a;Lyl3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<yl3.a.C6115a, yl3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227856e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227856e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                yl3.a.b.C6117b c6117b = yl3.a.b.C6117b.f227801a;
                this.f227856e = 1;
                if (rVar.F(c6117b, this) == objE) {
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
        public final Object w(yl3.a.C6115a c6115a, yl3.f fVar, tq.e<? super i0> eVar) {
            return r.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyl3/e;", "state", "Lk10/l;", "Lyl3/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<yl3.e>, tq.e<? super k10.l<? extends yl3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227858e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227859f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lyl3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends yl3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f227861e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f227862f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<yl3.e> f227863g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, c0<yl3.e> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f227862f = rVar;
                this.f227863g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(r rVar, dx.b bVar, yl3.e eVar) {
                return new Error(rVar.A9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final yl3.f Y(List list, r rVar, yl3.e eVar) {
                return list.isEmpty() ? new Error(rVar.A9(new dx.b.Generic(null, 1, null))) : new yl3.f.Initialized(rVar.contract.a(), list);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f227861e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    jk3.b bVar = this.f227862f.interactor;
                    this.f227861e = 1;
                    obj = bVar.a("DICT_662", this);
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
                c0<yl3.e> c0Var = this.f227863g;
                final r rVar = this.f227862f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: yl3.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.f.a.X(rVar, bVar2, (e) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List<Dictionary> listA = ((DictionaryResponse) ((dx.i.Right) iVar).b()).a();
                return c0Var.d(new er.l() { // from class: yl3.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.f.a.Y(listA, rVar, (e) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f227862f, this.f227863g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends yl3.f>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f227859f;
            Object objE = uq.b.e();
            int i15 = this.f227858e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r.this, c0Var, null);
            this.f227859f = vq.j.a(c0Var);
            this.f227858e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<yl3.e> c0Var, tq.e<? super k10.l<? extends yl3.f>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f227859f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyl3/c;", "<unused var>", "Lk10/c0;", "Lyl3/d;", "state", "Lk10/l;", "Lyl3/f;", "<anonymous>", "(Lyl3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<yl3.c, c0<Error>, tq.e<? super k10.l<? extends yl3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227865f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yl3.e O(Error error) {
            return yl3.e.f227809a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f227865f;
            uq.b.e();
            if (this.f227864e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yl3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.g.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yl3.c cVar, c0<Error> c0Var, tq.e<? super k10.l<? extends yl3.f>> eVar) {
            g gVar = new g(eVar);
            gVar.f227865f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyl3/b;", "<unused var>", "Lyl3/d;", "Loq/i0;", "<anonymous>", "(Lyl3/b;Lyl3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<yl3.b, Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227866e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227866e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                yl3.a.b.d dVar = yl3.a.b.d.f227803a;
                this.f227866e = 1;
                if (rVar.F(dVar, this) == objE) {
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
        public final Object w(yl3.b bVar, Error error, tq.e<? super i0> eVar) {
            return r.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyl3/a$d;", "action", "Lyl3/f$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyl3/a$d;Lyl3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<yl3.a.OnCardClick, yl3.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227869f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yl3.a.OnCardClick onCardClick = (yl3.a.OnCardClick) this.f227869f;
            Object objE = uq.b.e();
            int i15 = this.f227868e;
            if (i15 == 0) {
                oq.u.b(obj);
                r.this.contract.e(onCardClick.getCode());
                r rVar = r.this;
                yl3.a.b.c cVar = yl3.a.b.c.f227802a;
                this.f227869f = vq.j.a(onCardClick);
                this.f227868e = 1;
                if (rVar.F(cVar, this) == objE) {
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
        public final Object w(yl3.a.OnCardClick onCardClick, yl3.f.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f227869f = onCardClick;
            return iVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, am3.b bVar, hb4.d dVar, ib4.c cVar, ac4.a aVar2, jk3.b bVar2, zl3.a aVar3) {
        this.mapper = bVar;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.interactor = bVar2;
        this.contract = aVar3;
        yl3.e eVar = yl3.e.f227809a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: yl3.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.v9(this.f227828a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), t9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c A9(dx.b bVar) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: yl3.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f227827a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            rVar.d9(yl3.c.f227807a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            rVar.d9(yl3.b.f227806a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yl3.g.a t9(yl3.f state) {
        return this.mapper.b(new am3.b.Params(state, b9(yl3.a.c.f227804a), b9(yl3.a.C6115a.f227799a), new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(yl3.f.class), new er.l() { // from class: yl3.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.w9(this.f227823a, (z) obj);
            }
        });
        vVar.c(q0.c(yl3.e.class), new er.l() { // from class: yl3.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.x9(this.f227824a, (z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: yl3.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f227825a, (z) obj);
            }
        });
        vVar.c(q0.c(yl3.f.Initialized.class), new er.l() { // from class: yl3.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(this.f227826a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(r rVar, z zVar) {
        d dVar = rVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(yl3.a.c.class), oVar, dVar);
        zVar.x(q0.c(yl3.a.C6115a.class), oVar, rVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(r rVar, z zVar) {
        zVar.A(rVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(r rVar, z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(yl3.c.class), oVar, gVar);
        zVar.x(q0.c(yl3.b.class), oVar, rVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(r rVar, z zVar) {
        i iVar = rVar.new i(null);
        zVar.x(q0.c(yl3.a.OnCardClick.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<yl3.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<yl3.f, yl3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<yl3.g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(yl3.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(zl3.a aVar) {
        super.P5(aVar);
    }
}
