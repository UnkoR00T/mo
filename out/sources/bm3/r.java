package bm3;

import fr.q0;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001CBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lbm3/r;", "Ll00/g;", "Lbm3/f;", "Lbm3/a;", "Lbm3/g;", "", "Lyy/a;", "stateMachineFactory", "Ldm3/b;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Ljk3/b;", "interactor", "Lcm3/a;", "contract", "<init>", "(Lyy/a;Ldm3/b;Lhb4/d;Lib4/c;Lac4/a;Ljk3/b;Lcm3/a;)V", "Ldx/b;", "Lhb4/c;", "A9", "(Ldx/b;)Lhb4/c;", "state", "Lbm3/g$a;", "t9", "(Lbm3/f;)Lbm3/g$a;", "b", "Ldm3/b;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Lac4/a;", "f", "Ljk3/b;", "g", "Lcm3/a;", "s9", "()Lcm3/a;", "Lbm3/e;", "h", "Lbm3/e;", "initialState", "Lxw/b;", "Lbm3/a$b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "m", "a", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<bm3.f, bm3.a> implements bm3.g, zx.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a f20271m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f20272n = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dm3.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final jk3.b interactor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final cm3.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final bm3.e initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bm3.a.b> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<bm3.f, bm3.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<bm3.g.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbm3/r$a;", "", "<init>", "()V", "", "DICTIONARY_ID", "Ljava/lang/String;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            r.this.d9(new bm3.a.OnCardClick(str, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<bm3.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f20284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f20285b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f20286a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f20287b;

            /* JADX INFO: renamed from: bm3.r$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0530a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f20288d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f20289e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f20290f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f20292h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f20293j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f20294k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f20295l;

                public C0530a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f20288d = obj;
                    this.f20289e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f20286a = hVar;
                this.f20287b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0530a c0530a;
                if (eVar instanceof C0530a) {
                    c0530a = (C0530a) eVar;
                    int i15 = c0530a.f20289e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0530a.f20289e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0530a = new C0530a(eVar);
                    }
                } else {
                    c0530a = new C0530a(eVar);
                }
                Object obj2 = c0530a.f20288d;
                Object objE = uq.b.e();
                int i16 = c0530a.f20289e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f20286a;
                    bm3.g.a aVarT9 = this.f20287b.t9((bm3.f) obj);
                    c0530a.f20290f = vq.j.a(obj);
                    c0530a.f20292h = vq.j.a(c0530a);
                    c0530a.f20293j = vq.j.a(obj);
                    c0530a.f20294k = vq.j.a(hVar);
                    c0530a.f20295l = 0;
                    c0530a.f20289e = 1;
                    if (hVar.F(aVarT9, c0530a) == objE) {
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
            this.f20284a = gVar;
            this.f20285b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super bm3.g.a> hVar, tq.e eVar) {
            Object objA = this.f20284a.a(new a(hVar, this.f20285b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbm3/a$c;", "<unused var>", "Lbm3/f;", "Loq/i0;", "<anonymous>", "(Lbm3/a$c;Lbm3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<bm3.a.c, bm3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20296e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f20296e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                bm3.a.b.C0527a c0527a = bm3.a.b.C0527a.f20242a;
                this.f20296e = 1;
                if (rVar.F(c0527a, this) == objE) {
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
        public final Object w(bm3.a.c cVar, bm3.f fVar, tq.e<? super i0> eVar) {
            return r.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbm3/a$a;", "<unused var>", "Lbm3/f;", "Loq/i0;", "<anonymous>", "(Lbm3/a$a;Lbm3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<bm3.a.C0526a, bm3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20298e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f20298e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                bm3.a.b.C0528b c0528b = bm3.a.b.C0528b.f20243a;
                this.f20298e = 1;
                if (rVar.F(c0528b, this) == objE) {
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
        public final Object w(bm3.a.C0526a c0526a, bm3.f fVar, tq.e<? super i0> eVar) {
            return r.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lbm3/e;", "state", "Lk10/l;", "Lbm3/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<bm3.e>, tq.e<? super k10.l<? extends bm3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20301f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lbm3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends bm3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f20303e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f20304f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<bm3.e> f20305g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, c0<bm3.e> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f20304f = rVar;
                this.f20305g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(r rVar, dx.b bVar, bm3.e eVar) {
                return new Error(rVar.A9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final bm3.f Y(List list, r rVar, bm3.e eVar) {
                return list.isEmpty() ? new Error(rVar.A9(new dx.b.Generic(null, 1, null))) : new bm3.f.Initialized(rVar.getContract().a(), list);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f20303e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    jk3.b bVar = this.f20304f.interactor;
                    this.f20303e = 1;
                    obj = bVar.a("DICT_652", this);
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
                c0<bm3.e> c0Var = this.f20305g;
                final r rVar = this.f20304f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: bm3.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.f.a.X(rVar, bVar2, (e) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                List<Dictionary> listA = ((DictionaryResponse) ((dx.i.Right) iVar).b()).a();
                final ArrayList arrayList = new ArrayList();
                for (Object obj2 : listA) {
                    if (fu.r.d0(((Dictionary) obj2).getCode(), nk3.a.INSTANCE.b(rVar.getContract().a()), false, 2, null)) {
                        arrayList.add(obj2);
                    }
                }
                return c0Var.d(new er.l() { // from class: bm3.t
                    @Override // er.l
                    public final Object b(Object obj3) {
                        return r.f.a.Y(arrayList, rVar, (e) obj3);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f20304f, this.f20305g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends bm3.f>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f20301f;
            Object objE = uq.b.e();
            int i15 = this.f20300e;
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
            this.f20301f = vq.j.a(c0Var);
            this.f20300e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<bm3.e> c0Var, tq.e<? super k10.l<? extends bm3.f>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f20301f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbm3/c;", "<unused var>", "Lk10/c0;", "Lbm3/d;", "state", "Lk10/l;", "Lbm3/f;", "<anonymous>", "(Lbm3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<bm3.c, c0<Error>, tq.e<? super k10.l<? extends bm3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20307f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bm3.e O(Error error) {
            return bm3.e.f20251a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f20307f;
            uq.b.e();
            if (this.f20306e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: bm3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.g.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bm3.c cVar, c0<Error> c0Var, tq.e<? super k10.l<? extends bm3.f>> eVar) {
            g gVar = new g(eVar);
            gVar.f20307f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbm3/b;", "<unused var>", "Lbm3/d;", "Loq/i0;", "<anonymous>", "(Lbm3/b;Lbm3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<bm3.b, Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20308e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f20308e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                bm3.a.b.d dVar = bm3.a.b.d.f20245a;
                this.f20308e = 1;
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
        public final Object w(bm3.b bVar, Error error, tq.e<? super i0> eVar) {
            return r.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbm3/a$d;", "action", "Lbm3/f$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbm3/a$d;Lbm3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<bm3.a.OnCardClick, bm3.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20311f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bm3.a.OnCardClick onCardClick = (bm3.a.OnCardClick) this.f20311f;
            Object objE = uq.b.e();
            int i15 = this.f20310e;
            if (i15 == 0) {
                oq.u.b(obj);
                r.this.getContract().b(onCardClick.getCode());
                r rVar = r.this;
                bm3.a.b.c cVar = bm3.a.b.c.f20244a;
                this.f20311f = vq.j.a(onCardClick);
                this.f20310e = 1;
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
        public final Object w(bm3.a.OnCardClick onCardClick, bm3.f.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f20311f = onCardClick;
            return iVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, dm3.b bVar, hb4.d dVar, ib4.c cVar, ac4.a aVar2, jk3.b bVar2, cm3.a aVar3) {
        this.mapper = bVar;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.interactor = bVar2;
        this.contract = aVar3;
        bm3.e eVar = bm3.e.f20251a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: bm3.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.v9(this.f20270a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), t9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c A9(dx.b bVar) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: bm3.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f20269a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            rVar.d9(bm3.c.f20249a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            rVar.d9(bm3.b.f20248a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bm3.g.a t9(bm3.f state) {
        return this.mapper.b(new dm3.b.Params(state, b9(bm3.a.c.f20246a), b9(bm3.a.C0526a.f20241a), new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(bm3.f.class), new er.l() { // from class: bm3.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.w9(this.f20265a, (z) obj);
            }
        });
        vVar.c(q0.c(bm3.e.class), new er.l() { // from class: bm3.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.x9(this.f20266a, (z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: bm3.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f20267a, (z) obj);
            }
        });
        vVar.c(q0.c(bm3.f.Initialized.class), new er.l() { // from class: bm3.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(this.f20268a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(r rVar, z zVar) {
        d dVar = rVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bm3.a.c.class), oVar, dVar);
        zVar.x(q0.c(bm3.a.C0526a.class), oVar, rVar.new e(null));
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
        zVar.v(q0.c(bm3.c.class), oVar, gVar);
        zVar.x(q0.c(bm3.b.class), oVar, rVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(r rVar, z zVar) {
        i iVar = rVar.new i(null);
        zVar.x(q0.c(bm3.a.OnCardClick.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<bm3.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<bm3.f, bm3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bm3.g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(bm3.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    /* JADX INFO: renamed from: s9, reason: from getter */
    public final cm3.a getContract() {
        return this.contract;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(cm3.a aVar) {
        super.P5(aVar);
    }
}
