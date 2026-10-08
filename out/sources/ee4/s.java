package ee4;

import fr.q0;
import java.util.List;
import jl0.BEPassportAgreement;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R&\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lee4/s;", "Ll00/g;", "Lee4/b;", "Lee4/a;", "Lee4/c;", "", "Lac4/a;", "callActionWithLoaderUseCase", "Ltl0/f;", "getPassportAgreementsUC", "Lfe4/b;", "mapper", "Lib4/c;", "genericErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lyy/a;", "stateMachineFactory", "<init>", "(Lac4/a;Ltl0/f;Lfe4/b;Lib4/c;Lhb4/d;Lyy/a;)V", "state", "Lee4/c$a;", "t9", "(Lee4/b;)Lee4/c$a;", "b", "Lac4/a;", "c", "Ltl0/f;", "d", "Lfe4/b;", "e", "Lib4/c;", "f", "Lhb4/d;", "Lee4/b$c;", "g", "Lee4/b$c;", "initialState", "Lxw/b;", "Lee4/a$b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreementmanagement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<ee4.b, ee4.a> implements ee4.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tl0.f getPassportAgreementsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final fe4.b mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ee4.b.c initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ee4.a.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ee4.b, ee4.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<ee4.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ee4.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f49733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f49734b;

        /* JADX INFO: renamed from: ee4.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1188a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f49735a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f49736b;

            /* JADX INFO: renamed from: ee4.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1189a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f49737d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f49738e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f49739f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f49741h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f49742j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f49743k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f49744l;

                public C1189a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f49737d = obj;
                    this.f49738e |= PKIFailureInfo.systemUnavail;
                    return C1188a.this.F(null, this);
                }
            }

            public C1188a(mu.h hVar, s sVar) {
                this.f49735a = hVar;
                this.f49736b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1189a c1189a;
                if (eVar instanceof C1189a) {
                    c1189a = (C1189a) eVar;
                    int i15 = c1189a.f49738e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1189a.f49738e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1189a = new C1189a(eVar);
                    }
                } else {
                    c1189a = new C1189a(eVar);
                }
                Object obj2 = c1189a.f49737d;
                Object objE = uq.b.e();
                int i16 = c1189a.f49738e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f49735a;
                    ee4.c.a aVarT9 = this.f49736b.t9((ee4.b) obj);
                    c1189a.f49739f = vq.j.a(obj);
                    c1189a.f49741h = vq.j.a(c1189a);
                    c1189a.f49742j = vq.j.a(obj);
                    c1189a.f49743k = vq.j.a(hVar);
                    c1189a.f49744l = 0;
                    c1189a.f49738e = 1;
                    if (hVar.F(aVarT9, c1189a) == objE) {
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

        public a(mu.g gVar, s sVar) {
            this.f49733a = gVar;
            this.f49734b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ee4.c.a> hVar, tq.e eVar) {
            Object objA = this.f49733a.a(new C1188a(hVar, this.f49734b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lee4/a$a;", "<unused var>", "Lee4/b;", "Loq/i0;", "<anonymous>", "(Lee4/a$a;Lee4/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ee4.a.C1182a, ee4.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49745e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49745e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ee4.a.b> bVarY1 = s.this.Y1();
                ee4.a.b.C1183a c1183a = ee4.a.b.C1183a.f49686a;
                this.f49745e = 1;
                if (bVarY1.F(c1183a, this) == objE) {
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
        public final Object w(ee4.a.C1182a c1182a, ee4.b bVar, tq.e<? super i0> eVar) {
            return s.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lee4/b$c;", "state", "Lk10/l;", "Lee4/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<ee4.b.c>, tq.e<? super k10.l<? extends ee4.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49748f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lee4/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ee4.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f49750e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ s f49751f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<ee4.b.c> f49752g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, c0<ee4.b.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f49751f = sVar;
                this.f49752g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ee4.b.Error Z(final s sVar, dx.b bVar, ee4.b.c cVar) {
                return new ee4.b.Error(sVar.errorVMSFactory.a(sVar.genericErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ee4.w
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.c.a.a0(sVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 a0(s sVar, ib4.c.b bVar) {
                if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                        sVar.d9(ee4.a.d.f49689a);
                    } else {
                        if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                            throw new oq.p();
                        }
                        sVar.d9(ee4.a.C1182a.f49685a);
                    }
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ee4.b.a b0(ee4.b.c cVar) {
                return ee4.b.a.f49691a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ee4.b.Initialized c0(List list, ee4.b.c cVar) {
                return new ee4.b.Initialized(list);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f49750e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    tl0.f fVar = this.f49751f.getPassportAgreementsUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f49750e = 1;
                    obj = fVar.c(c1792a, this);
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
                c0<ee4.b.c> c0Var = this.f49752g;
                final s sVar = this.f49751f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ee4.t
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s.c.a.Z(sVar, bVar, (b.c) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return list.isEmpty() ? c0Var.d(new er.l() { // from class: ee4.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.c.a.b0((b.c) obj2);
                    }
                }) : c0Var.d(new er.l() { // from class: ee4.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.c.a.c0(list, (b.c) obj2);
                    }
                });
            }

            public final tq.e<i0> X(tq.e<?> eVar) {
                return new a(this.f49751f, this.f49752g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ee4.b>> eVar) {
                return ((a) X(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f49748f;
            Object objE = uq.b.e();
            int i15 = this.f49747e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = s.this.callActionWithLoaderUseCase;
            a aVar2 = new a(s.this, c0Var, null);
            this.f49748f = vq.j.a(c0Var);
            this.f49747e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<ee4.b.c> c0Var, tq.e<? super k10.l<? extends ee4.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = s.this.new c(eVar);
            cVar.f49748f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lee4/a$c;", "action", "Lee4/b$d;", "state", "Loq/i0;", "<anonymous>", "(Lee4/a$c;Lee4/b$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ee4.a.OnAgreementOpen, ee4.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f49753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f49754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f49755g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f49756h;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ee4.a.OnAgreementOpen onAgreementOpen = (ee4.a.OnAgreementOpen) this.f49756h;
            Object objE = uq.b.e();
            int i15 = this.f49755g;
            if (i15 == 0) {
                oq.u.b(obj);
                String mobywatelAgreementId = onAgreementOpen.getPassportAgreement().getMobywatelAgreementId();
                if (mobywatelAgreementId != null) {
                    s sVar = s.this;
                    ee4.a.b.OnAgreementOpen onAgreementOpen2 = new ee4.a.b.OnAgreementOpen(mobywatelAgreementId);
                    this.f49756h = vq.j.a(onAgreementOpen);
                    this.f49753e = vq.j.a(mobywatelAgreementId);
                    this.f49754f = 0;
                    this.f49755g = 1;
                    if (sVar.F(onAgreementOpen2, this) == objE) {
                        return objE;
                    }
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
        public final Object w(ee4.a.OnAgreementOpen onAgreementOpen, ee4.b.Initialized initialized, tq.e<? super i0> eVar) {
            d dVar = s.this.new d(eVar);
            dVar.f49756h = onAgreementOpen;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lee4/a$d;", "<unused var>", "Lk10/c0;", "Lee4/b$b;", "state", "Lk10/l;", "Lee4/b;", "<anonymous>", "(Lee4/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ee4.a.d, c0<ee4.b.Error>, tq.e<? super k10.l<? extends ee4.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49759f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ee4.b.c O(ee4.b.Error error) {
            return ee4.b.c.f49693a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f49759f;
            uq.b.e();
            if (this.f49758e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ee4.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.O((b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ee4.a.d dVar, c0<ee4.b.Error> c0Var, tq.e<? super k10.l<? extends ee4.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f49759f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public s(ac4.a aVar, tl0.f fVar, fe4.b bVar, ib4.c cVar, hb4.d dVar, yy.a aVar2) {
        this.callActionWithLoaderUseCase = aVar;
        this.getPassportAgreementsUC = fVar;
        this.mapper = bVar;
        this.genericErrorMapper = cVar;
        this.errorVMSFactory = dVar;
        ee4.b.c cVar2 = ee4.b.c.f49693a;
        this.initialState = cVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar2.a(cVar2, new er.l() { // from class: ee4.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.w9(this.f49719a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), t9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(k10.z zVar) {
        e eVar = new e(null);
        zVar.v(q0.c(ee4.a.d.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ee4.c.a t9(ee4.b state) {
        return this.mapper.b(new fe4.b.Params(state, new er.l() { // from class: ee4.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.u9(this.f49723a, (BEPassportAgreement) obj);
            }
        }, b9(ee4.a.C1182a.f49685a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(s sVar, BEPassportAgreement bEPassportAgreement) {
        sVar.d9(new ee4.a.OnAgreementOpen(bEPassportAgreement));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(ee4.b.class), new er.l() { // from class: ee4.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.x9(this.f49720a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ee4.b.c.class), new er.l() { // from class: ee4.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.y9(this.f49721a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ee4.b.Initialized.class), new er.l() { // from class: ee4.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.z9(this.f49722a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ee4.b.Error.class), new er.l() { // from class: ee4.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.A9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(s sVar, k10.z zVar) {
        b bVar = sVar.new b(null);
        zVar.x(q0.c(ee4.a.C1182a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(s sVar, k10.z zVar) {
        zVar.A(sVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(s sVar, k10.z zVar) {
        d dVar = sVar.new d(null);
        zVar.x(q0.c(ee4.a.OnAgreementOpen.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ee4.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ee4.b, ee4.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ee4.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ee4.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
