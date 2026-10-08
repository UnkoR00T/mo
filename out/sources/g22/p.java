package g22;

import cb4.DialogData;
import eo0.y0;
import fr.q0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import ju.g3;
import k10.c0;
import m02.PersonalData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import pq.v0;
import xi0.ContactDetails;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bs\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0014\u0010$\u001a\u00020#*\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020&*\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020#*\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010P\u001a\b\u0012\u0004\u0012\u00020K0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR&\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030Q8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR \u0010+\u001a\b\u0012\u0004\u0012\u00020,0W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lg22/p;", "Ll00/g;", "Lg22/c;", "Lg22/a;", "Lg22/d;", "", "Lyy/a;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Lh22/g;", "mapper", "Lt02/a;", "formValidationUC", "Lfj0/g;", "getContactDetailsUseCase", "Lc12/g;", "dialogMapper", "Lh22/b;", "errorMapper", "Lp02/a0;", "getRdkPhonePrefixUC", "Lp02/z;", "getRdkPhoneNumberUC", "Lp02/y;", "getRdkEmailUC", "Lx02/d;", "getMessageServiceTypeUC", "Lk02/a;", "electronicDeliveryContainersInteractor", "Lm22/h;", "contract", "<init>", "(Lyy/a;Lac4/a;Lh22/g;Lt02/a;Lfj0/g;Lc12/g;Lh22/b;Lp02/a0;Lp02/z;Lp02/y;Lx02/d;Lk02/a;Lm22/h;)V", "Ldx/b;", "Loq/i0;", "B9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lo02/b$c;", "A9", "(Lg22/c;)Lo02/b$c;", "F9", "(Lo02/b$c;)V", "state", "Lg22/d$a;", "C9", "(Lg22/c;)Lg22/d$a;", "b", "Lac4/a;", "c", "Lh22/g;", "d", "Lt02/a;", "e", "Lfj0/g;", "f", "Lc12/g;", "g", "Lh22/b;", "h", "Lp02/a0;", "j", "Lp02/z;", "k", "Lp02/y;", "l", "Lx02/d;", "m", "Lk02/a;", "n", "Lm22/h;", "p", "Lg22/c;", "initialState", "Lxw/b;", "Lg22/a$d;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "r", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, g22.a> implements g22.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h22.g mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t02.a formValidationUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fj0.g getContactDetailsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c12.g dialogMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h22.b errorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p02.a0 getRdkPhonePrefixUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p02.z getRdkPhoneNumberUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p02.y getRdkEmailUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final x02.d getMessageServiceTypeUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k02.a electronicDeliveryContainersInteractor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final m22.h contract;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<g22.a.d> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, g22.a> stateMachine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p0<g22.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g22.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f69930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f69931b;

        /* JADX INFO: renamed from: g22.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1579a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f69932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f69933b;

            /* JADX INFO: renamed from: g22.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1580a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f69934d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f69935e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f69936f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f69938h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f69939j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f69940k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f69941l;

                public C1580a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f69934d = obj;
                    this.f69935e |= PKIFailureInfo.systemUnavail;
                    return C1579a.this.F(null, this);
                }
            }

            public C1579a(mu.h hVar, p pVar) {
                this.f69932a = hVar;
                this.f69933b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1580a c1580a;
                if (eVar instanceof C1580a) {
                    c1580a = (C1580a) eVar;
                    int i15 = c1580a.f69935e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1580a.f69935e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1580a = new C1580a(eVar);
                    }
                } else {
                    c1580a = new C1580a(eVar);
                }
                Object obj2 = c1580a.f69934d;
                Object objE = uq.b.e();
                int i16 = c1580a.f69935e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f69932a;
                    g22.d.Data dataC9 = this.f69933b.C9((State) obj);
                    c1580a.f69936f = vq.j.a(obj);
                    c1580a.f69938h = vq.j.a(c1580a);
                    c1580a.f69939j = vq.j.a(obj);
                    c1580a.f69940k = vq.j.a(hVar);
                    c1580a.f69941l = 0;
                    c1580a.f69935e = 1;
                    if (hVar.F(dataC9, c1580a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f69930a = gVar;
            this.f69931b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g22.d.Data> hVar, tq.e eVar) {
            Object objA = this.f69930a.a(new C1579a(hVar, this.f69931b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg22/c;", "it", "Loq/i0;", "<anonymous>", "(Lg22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69942e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f69944e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f69945f;

            /* JADX INFO: renamed from: g22.p$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
            static final class C1581a extends vq.k implements er.l<tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f69946e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ p f69947f;

                /* JADX INFO: renamed from: g22.p$b$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
                static final class C1582a extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f69948e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ p f69949f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1582a(p pVar, tq.e<? super C1582a> eVar) {
                        super(2, eVar);
                        this.f69949f = pVar;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) throws Throwable {
                        Object objE = uq.b.e();
                        int i15 = this.f69948e;
                        if (i15 == 0) {
                            oq.u.b(obj);
                            fj0.g gVar = this.f69949f.getContactDetailsUseCase;
                            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                            this.f69948e = 1;
                            obj = gVar.c(c1792a, this);
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
                        p pVar = this.f69949f;
                        if (iVar instanceof dx.i.Right) {
                            pVar.d9(new g22.a.OnRdkDataDownloaded((ContactDetails) ((dx.i.Right) iVar).b()));
                        }
                        return i0.f148189a;
                    }

                    @Override // er.p
                    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                    public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
                        return ((C1582a) v(p0Var, eVar)).J(i0.f148189a);
                    }

                    @Override // vq.a
                    public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                        return new C1582a(this.f69949f, eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1581a(p pVar, tq.e<? super C1581a> eVar) {
                    super(1, eVar);
                    this.f69947f = pVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f69946e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        gu.b.Companion companion = gu.b.INSTANCE;
                        long jQ = gu.d.q(5, gu.e.SECONDS);
                        C1582a c1582a = new C1582a(this.f69947f, null);
                        this.f69946e = 1;
                        if (g3.d(jQ, c1582a, this) == objE) {
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

                public final tq.e<i0> M(tq.e<?> eVar) {
                    return new C1581a(this.f69947f, eVar);
                }

                @Override // er.l
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public final Object b(tq.e<? super i0> eVar) {
                    return ((C1581a) M(eVar)).J(i0.f148189a);
                }
            }

            /* JADX INFO: renamed from: g22.p$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
            static final class C1583b extends vq.k implements er.l<tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f69950e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f69951f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                int f69952g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                int f69953h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                int f69954j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                final /* synthetic */ p f69955k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1583b(p pVar, tq.e<? super C1583b> eVar) {
                    super(1, eVar);
                    this.f69955k = pVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
                
                    if (r1.B9(r3, r4) == r0) goto L17;
                 */
                @Override // vq.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        java.lang.Object r0 = uq.b.e()
                        int r1 = r4.f69954j
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L26
                        if (r1 == r3) goto L22
                        if (r1 != r2) goto L1a
                        java.lang.Object r0 = r4.f69951f
                        dx.b r0 = (dx.b) r0
                        java.lang.Object r0 = r4.f69950e
                        dx.i r0 = (dx.i) r0
                        oq.u.b(r5)
                        goto L77
                    L1a:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L22:
                        oq.u.b(r5)
                        goto L38
                    L26:
                        oq.u.b(r5)
                        g22.p r5 = r4.f69955k
                        k02.a r5 = g22.p.p9(r5)
                        r4.f69954j = r3
                        java.lang.Object r5 = r5.d(r4)
                        if (r5 != r0) goto L38
                        goto L62
                    L38:
                        dx.i r5 = (dx.i) r5
                        g22.p r1 = r4.f69955k
                        boolean r3 = r5 instanceof dx.i.Left
                        if (r3 == 0) goto L63
                        r3 = r5
                        dx.i$b r3 = (dx.i.Left) r3
                        java.lang.Object r3 = r3.b()
                        dx.b r3 = (dx.b) r3
                        java.lang.Object r5 = vq.j.a(r5)
                        r4.f69950e = r5
                        java.lang.Object r5 = vq.j.a(r3)
                        r4.f69951f = r5
                        r5 = 0
                        r4.f69952g = r5
                        r4.f69953h = r5
                        r4.f69954j = r2
                        java.lang.Object r5 = g22.p.x9(r1, r3, r4)
                        if (r5 != r0) goto L77
                    L62:
                        return r0
                    L63:
                        boolean r0 = r5 instanceof dx.i.Right
                        if (r0 == 0) goto L7a
                        dx.i$c r5 = (dx.i.Right) r5
                        java.lang.Object r5 = r5.b()
                        m02.g r5 = (m02.PersonalData) r5
                        g22.a$g r0 = new g22.a$g
                        r0.<init>(r5)
                        g22.p.l9(r1, r0)
                    L77:
                        oq.i0 r5 = oq.i0.f148189a
                        return r5
                    L7a:
                        oq.p r5 = new oq.p
                        r5.<init>()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: g22.p.b.a.C1583b.J(java.lang.Object):java.lang.Object");
                }

                public final tq.e<i0> M(tq.e<?> eVar) {
                    return new C1583b(this.f69955k, eVar);
                }

                @Override // er.l
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public final Object b(tq.e<? super i0> eVar) {
                    return ((C1583b) M(eVar)).J(i0.f148189a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f69945f = pVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f69944e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                p pVar = this.f69945f;
                i00.a.a(pVar, new C1581a(pVar, null));
                p pVar2 = this.f69945f;
                i00.a.a(pVar2, new C1583b(pVar2, null));
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f69945f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f69942e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (p.this.contract.a7() == null) {
                    ac4.a aVar = p.this.callActionWithLoaderUseCase;
                    a aVar2 = new a(p.this, null);
                    this.f69942e = 1;
                    if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((b) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg22/a$f;", "action", "Lg22/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lg22/a$f;Lg22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<g22.a.OnFocusChanged, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69957f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f69959a;

            static {
                int[] iArr = new int[g22.b.values().length];
                try {
                    iArr[g22.b.PHONE_NUMBER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g22.b.PHONE_PREFIX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g22.b.EMAIL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f69959a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g22.a.OnFocusChanged onFocusChanged = (g22.a.OnFocusChanged) this.f69957f;
            uq.b.e();
            if (this.f69956e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (!onFocusChanged.getFocused()) {
                g22.b field = onFocusChanged.getField();
                int i15 = field == null ? -1 : a.f69959a[field.ordinal()];
                if (i15 != -1) {
                    if (i15 == 1 || i15 == 2) {
                        p.this.d9(g22.a.n.f69862a);
                    } else {
                        if (i15 != 3) {
                            throw new oq.p();
                        }
                        p.this.d9(g22.a.l.f69860a);
                    }
                }
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(g22.a.OnFocusChanged onFocusChanged, State state, tq.e<? super i0> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f69957f = onFocusChanged;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg22/a$e;", "action", "Lk10/c0;", "Lg22/c;", "state", "Lk10/l;", "<anonymous>", "(Lg22/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<g22.a.OnFieldValueChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69960e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69961f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f69962g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f69963a;

            static {
                int[] iArr = new int[g22.b.values().length];
                try {
                    iArr[g22.b.PHONE_NUMBER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g22.b.PHONE_PREFIX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g22.b.EMAIL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f69963a = iArr;
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(g22.a.OnFieldValueChanged onFieldValueChanged, State state) {
            return State.b(state, null, null, null, state.g().a(PhoneNumber.b.b(PhoneNumber.b.c(iy.c0.g(onFieldValueChanged.getValue()))), hz.b.C2039b.f86846c), null, null, 55, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State Y(g22.a.OnFieldValueChanged onFieldValueChanged, State state) {
            return State.b(state, null, null, state.h().a(PhoneNumber.c.b(PhoneNumber.c.c(iy.c0.g(onFieldValueChanged.getValue()))), hz.b.C2039b.f86846c), null, null, null, 59, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State Z(g22.a.OnFieldValueChanged onFieldValueChanged, State state) {
            return State.b(state, null, null, null, null, state.c().a(iy.c0.g(onFieldValueChanged.getValue()), hz.b.C2039b.f86846c), null, 47, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final g22.a.OnFieldValueChanged onFieldValueChanged = (g22.a.OnFieldValueChanged) this.f69961f;
            c0 c0Var = (c0) this.f69962g;
            uq.b.e();
            if (this.f69960e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f69963a[onFieldValueChanged.getField().ordinal()];
            if (i15 == 1) {
                return c0Var.b(new er.l() { // from class: g22.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.d.X(onFieldValueChanged, (State) obj2);
                    }
                });
            }
            if (i15 == 2) {
                return c0Var.b(new er.l() { // from class: g22.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.d.Y(onFieldValueChanged, (State) obj2);
                    }
                });
            }
            if (i15 == 3) {
                return c0Var.b(new er.l() { // from class: g22.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.d.Z(onFieldValueChanged, (State) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(g22.a.OnFieldValueChanged onFieldValueChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f69961f = onFieldValueChanged;
            dVar.f69962g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg22/a$n;", "<unused var>", "Lk10/c0;", "Lg22/c;", "state", "Lk10/l;", "<anonymous>", "(Lg22/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<g22.a.n, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69965f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(p pVar, c0 c0Var, State state) {
            State.Field<PhoneNumber.b> fieldG = state.g();
            for (t02.a.Results.InterfaceC4830a interfaceC4830a : pVar.formValidationUC.b(new t02.a.Params(e1.d(new t02.a.Params.InterfaceC4828a.b(new PhoneNumber(((State) c0Var.a()).h().d().getValue(), ((State) c0Var.a()).g().d().getValue(), null))))).a()) {
                if (interfaceC4830a instanceof t02.a.Results.InterfaceC4830a.C4832b) {
                    State.Field fieldB = State.Field.b(fieldG, null, interfaceC4830a.getValue(), 1, null);
                    State.Field<PhoneNumber.c> fieldH = state.h();
                    for (t02.a.Results.InterfaceC4830a interfaceC4830a2 : pVar.formValidationUC.b(new t02.a.Params(e1.d(new t02.a.Params.InterfaceC4828a.b(new PhoneNumber(((State) c0Var.a()).h().d().getValue(), ((State) c0Var.a()).g().d().getValue(), null))))).a()) {
                        if (interfaceC4830a2 instanceof t02.a.Results.InterfaceC4830a.c) {
                            return State.b(state, null, null, State.Field.b(fieldH, null, interfaceC4830a2.getValue(), 1, null), fieldB, null, null, 51, null);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f69965f;
            uq.b.e();
            if (this.f69964e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p pVar = p.this;
            return c0Var.b(new er.l() { // from class: g22.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O(pVar, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g22.a.n nVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f69965f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg22/a$l;", "<unused var>", "Lk10/c0;", "Lg22/c;", "state", "Lk10/l;", "<anonymous>", "(Lg22/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<g22.a.l, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69968f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(p pVar, c0 c0Var, State state) {
            State.Field<iy.b0> fieldC = state.c();
            for (t02.a.Results.InterfaceC4830a interfaceC4830a : pVar.formValidationUC.b(new t02.a.Params(e1.d(new t02.a.Params.InterfaceC4828a.C4829a(((State) c0Var.a()).c().d())))).a()) {
                if (interfaceC4830a instanceof t02.a.Results.InterfaceC4830a.C4831a) {
                    return State.b(state, null, null, null, null, State.Field.b(fieldC, null, interfaceC4830a.getValue(), 1, null), null, 47, null);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f69968f;
            uq.b.e();
            if (this.f69967e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p pVar = p.this;
            return c0Var.b(new er.l() { // from class: g22.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.f.O(pVar, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g22.a.l lVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f69968f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg22/a$m;", "<unused var>", "Lk10/c0;", "Lg22/c;", "state", "Lk10/l;", "<anonymous>", "(Lg22/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<g22.a.m, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69971f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Map map, Map.Entry entry, State state) {
            State.Field<PhoneNumber.c> fieldH;
            State.Field<PhoneNumber.b> fieldG;
            State.Field<iy.b0> fieldC;
            hz.b bVar = (hz.b) map.get(g22.b.PHONE_PREFIX);
            if (bVar == null || (fieldH = State.Field.b(state.h(), null, bVar, 1, null)) == null) {
                fieldH = state.h();
            }
            State.Field<PhoneNumber.c> field = fieldH;
            hz.b bVar2 = (hz.b) map.get(g22.b.PHONE_NUMBER);
            if (bVar2 == null || (fieldG = State.Field.b(state.g(), null, bVar2, 1, null)) == null) {
                fieldG = state.g();
            }
            State.Field<PhoneNumber.b> field2 = fieldG;
            hz.b bVar3 = (hz.b) map.get(g22.b.EMAIL);
            if (bVar3 == null || (fieldC = State.Field.b(state.c(), null, bVar3, 1, null)) == null) {
                fieldC = state.c();
            }
            return State.b(state, null, null, field, field2, fieldC, entry != null ? (g22.b) entry.getKey() : null, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oq.r rVarA;
            c0 c0Var = (c0) this.f69971f;
            uq.b.e();
            if (this.f69970e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Object obj2 = null;
            List<t02.a.Results.InterfaceC4830a> listA = p.this.formValidationUC.b(new t02.a.Params(e1.i(new t02.a.Params.InterfaceC4828a.b(new PhoneNumber(((State) c0Var.a()).h().d().getValue(), ((State) c0Var.a()).g().d().getValue(), null)), new t02.a.Params.InterfaceC4828a.C4829a(((State) c0Var.a()).c().d())))).a();
            final LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(listA, 10)), 16));
            for (t02.a.Results.InterfaceC4830a interfaceC4830a : listA) {
                if (interfaceC4830a instanceof t02.a.Results.InterfaceC4830a.c) {
                    rVarA = oq.y.a(g22.b.PHONE_PREFIX, ((t02.a.Results.InterfaceC4830a.c) interfaceC4830a).getValue());
                } else if (interfaceC4830a instanceof t02.a.Results.InterfaceC4830a.C4832b) {
                    rVarA = oq.y.a(g22.b.PHONE_NUMBER, ((t02.a.Results.InterfaceC4830a.C4832b) interfaceC4830a).getValue());
                } else {
                    if (!(interfaceC4830a instanceof t02.a.Results.InterfaceC4830a.C4831a)) {
                        throw new oq.p();
                    }
                    rVarA = oq.y.a(g22.b.EMAIL, ((t02.a.Results.InterfaceC4830a.C4831a) interfaceC4830a).getValue());
                }
                linkedHashMap.put(rVarA.c(), rVarA.d());
            }
            for (Object obj3 : linkedHashMap.entrySet()) {
                if (((Map.Entry) obj3).getValue() instanceof hz.b.Invalid) {
                    obj2 = obj3;
                    break;
                }
            }
            final Map.Entry entry = (Map.Entry) obj2;
            if (entry == null) {
                p.this.d9(g22.a.c.f69844a);
            }
            return c0Var.b(new er.l() { // from class: g22.v
                @Override // er.l
                public final Object b(Object obj4) {
                    return p.g.O(linkedHashMap, entry, (State) obj4);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g22.a.m mVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f69971f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg22/a$b;", "<unused var>", "Lg22/c;", "state", "Loq/i0;", "<anonymous>", "(Lg22/a$b;Lg22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<g22.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69974f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f69974f;
            Object objE = uq.b.e();
            int i15 = this.f69973e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                pVar.F9(pVar.A9(state));
                xw.b<g22.a.d> bVarY1 = p.this.Y1();
                g22.a.d.C1575a c1575a = g22.a.d.C1575a.f69845a;
                this.f69974f = vq.j.a(state);
                this.f69973e = 1;
                if (bVarY1.F(c1575a, this) == objE) {
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
        public final Object w(g22.a.b bVar, State state, tq.e<? super i0> eVar) {
            h hVar = p.this.new h(eVar);
            hVar.f69974f = state;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg22/a$a;", "<unused var>", "Lg22/c;", "Loq/i0;", "<anonymous>", "(Lg22/a$a;Lg22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<g22.a.C1574a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69976e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f69976e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<g22.a.d> bVarY1 = p.this.Y1();
                g22.a.d.C1575a c1575a = g22.a.d.C1575a.f69845a;
                this.f69976e = 1;
                if (bVarY1.F(c1575a, this) == objE) {
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
        public final Object w(g22.a.C1574a c1574a, State state, tq.e<? super i0> eVar) {
            return p.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg22/a$i;", "<unused var>", "Lk10/c0;", "Lg22/c;", "state", "Lk10/l;", "<anonymous>", "(Lg22/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<g22.a.i, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69979f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f69979f;
            uq.b.e();
            if (this.f69978e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: g22.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.j.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g22.a.i iVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = new j(eVar);
            jVar.f69979f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg22/a$g;", "action", "Lk10/c0;", "Lg22/c;", "state", "Lk10/l;", "<anonymous>", "(Lg22/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<g22.a.OnMIdCardDataLoaded, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69981f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f69982g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(PersonalData personalData, State state) {
            iy.b0 b0VarA;
            StringBuilder sb5 = new StringBuilder();
            iy.b0 name = personalData.getName();
            sb5.append(name != null ? iy.c0.e(name) : null);
            iy.b0 secondName = personalData.getSecondName();
            if (secondName != null) {
                sb5.append(' ' + iy.c0.e(secondName));
            }
            sb5.append(" ");
            iy.b0 surname = personalData.getSurname();
            sb5.append(surname != null ? iy.c0.e(surname) : null);
            String string = sb5.toString();
            String str = fu.r.t0(string) ? null : string;
            if (str == null || (b0VarA = iy.c0.g(str)) == null) {
                b0VarA = iy.b0.INSTANCE.a();
            }
            iy.b0 b0Var = b0VarA;
            iy.b0 pesel = personalData.getPesel();
            return State.b(state, b0Var, pesel != null ? xw.g.c(pesel) : xw.g.INSTANCE.a(), null, null, null, null, 60, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g22.a.OnMIdCardDataLoaded onMIdCardDataLoaded = (g22.a.OnMIdCardDataLoaded) this.f69981f;
            c0 c0Var = (c0) this.f69982g;
            uq.b.e();
            if (this.f69980e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final PersonalData value = onMIdCardDataLoaded.getValue();
            return c0Var.b(new er.l() { // from class: g22.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.k.O(value, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g22.a.OnMIdCardDataLoaded onMIdCardDataLoaded, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = new k(eVar);
            kVar.f69981f = onMIdCardDataLoaded;
            kVar.f69982g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg22/a$h;", "action", "Lk10/c0;", "Lg22/c;", "state", "Lk10/l;", "<anonymous>", "(Lg22/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<g22.a.OnRdkDataDownloaded, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69983e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69984f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f69985g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(p pVar, g22.a.OnRdkDataDownloaded onRdkDataDownloaded, c0 c0Var, State state) {
            State.Field<PhoneNumber.c> fieldH;
            State.Field<PhoneNumber.b> fieldG;
            State.Field<iy.b0> fieldC;
            iy.b0 b0VarB = pVar.getRdkPhonePrefixUC.b(new p02.a0.Params(onRdkDataDownloaded.getValue()));
            if (b0VarB == null || (fieldH = State.Field.b(((State) c0Var.a()).h(), PhoneNumber.c.b(b0VarB), null, 2, null)) == null) {
                fieldH = ((State) c0Var.a()).h();
            }
            State.Field<PhoneNumber.c> field = fieldH;
            iy.b0 b0VarB2 = pVar.getRdkPhoneNumberUC.b(new p02.z.Params(onRdkDataDownloaded.getValue()));
            if (b0VarB2 == null || (fieldG = State.Field.b(((State) c0Var.a()).g(), PhoneNumber.b.b(b0VarB2), null, 2, null)) == null) {
                fieldG = ((State) c0Var.a()).g();
            }
            State.Field<PhoneNumber.b> field2 = fieldG;
            iy.b0 b0VarB3 = pVar.getRdkEmailUC.b(new p02.y.Params(onRdkDataDownloaded.getValue()));
            if (b0VarB3 == null || (fieldC = State.Field.b(((State) c0Var.a()).c(), b0VarB3, null, 2, null)) == null) {
                fieldC = ((State) c0Var.a()).c();
            }
            return State.b(state, null, null, field, field2, fieldC, null, 35, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final g22.a.OnRdkDataDownloaded onRdkDataDownloaded = (g22.a.OnRdkDataDownloaded) this.f69984f;
            final c0 c0Var = (c0) this.f69985g;
            uq.b.e();
            if (this.f69983e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p pVar = p.this;
            return c0Var.b(new er.l() { // from class: g22.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.l.O(pVar, onRdkDataDownloaded, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g22.a.OnRdkDataDownloaded onRdkDataDownloaded, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = p.this.new l(eVar);
            lVar.f69984f = onRdkDataDownloaded;
            lVar.f69985g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg22/a$j;", "<unused var>", "Lg22/c;", "Loq/i0;", "<anonymous>", "(Lg22/a$j;Lg22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<g22.a.j, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69987e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f69987e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<g22.a.d> bVarY1 = p.this.Y1();
                g22.a.d.c cVar = g22.a.d.c.f69847a;
                this.f69987e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(g22.a.j jVar, State state, tq.e<? super i0> eVar) {
            return p.this.new m(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg22/a$c;", "<unused var>", "Lg22/c;", "state", "Loq/i0;", "<anonymous>", "(Lg22/a$c;Lg22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<g22.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69990f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f69990f;
            Object objE = uq.b.e();
            int i15 = this.f69989e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                pVar.F9(pVar.A9(state));
                xw.b<g22.a.d> bVarY1 = p.this.Y1();
                g22.a.d.b bVar = g22.a.d.b.f69846a;
                this.f69990f = vq.j.a(state);
                this.f69989e = 1;
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
        public final Object w(g22.a.c cVar, State state, tq.e<? super i0> eVar) {
            n nVar = p.this.new n(eVar);
            nVar.f69990f = state;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg22/a$k;", "<unused var>", "Lg22/c;", "Loq/i0;", "<anonymous>", "(Lg22/a$k;Lg22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<g22.a.k, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f69992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f69993f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f69994g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f69995h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f69996j;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f69996j;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0VarB = p.this.getMessageServiceTypeUC.b(new x02.d.Params(p.this.contract, p.this.contract));
                p pVar = p.this;
                DialogData dialogDataB = pVar.dialogMapper.b(new c12.g.Params(pVar.b9(g22.a.j.f69858a), y0VarB, null, 4, null));
                xw.b<g22.a.d> bVarY1 = pVar.Y1();
                g22.a.d.ShowDialog showDialog = new g22.a.d.ShowDialog(dialogDataB);
                this.f69992e = vq.j.a(y0VarB);
                this.f69993f = vq.j.a(dialogDataB);
                this.f69994g = 0;
                this.f69995h = 0;
                this.f69996j = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        public final Object w(g22.a.k kVar, State state, tq.e<? super i0> eVar) {
            return p.this.new o(eVar).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ac4.a aVar2, h22.g gVar, t02.a aVar3, fj0.g gVar2, c12.g gVar3, h22.b bVar, p02.a0 a0Var, p02.z zVar, p02.y yVar, x02.d dVar, k02.a aVar4, m22.h hVar) {
        PhoneNumber phoneNumber;
        PhoneNumber phoneNumber2;
        iy.b0 nameAndSurname;
        this.callActionWithLoaderUseCase = aVar2;
        this.mapper = gVar;
        this.formValidationUC = aVar3;
        this.getContactDetailsUseCase = gVar2;
        this.dialogMapper = gVar3;
        this.errorMapper = bVar;
        this.getRdkPhonePrefixUC = a0Var;
        this.getRdkPhoneNumberUC = zVar;
        this.getRdkEmailUC = yVar;
        this.getMessageServiceTypeUC = dVar;
        this.electronicDeliveryContainersInteractor = aVar4;
        this.contract = hVar;
        o02.b.ContactDetails contactDetailsA7 = hVar.a7();
        String strE = (contactDetailsA7 == null || (nameAndSurname = contactDetailsA7.getNameAndSurname()) == null) ? null : iy.c0.e(nameAndSurname);
        iy.b0 b0VarG = iy.c0.g(strE == null ? "" : strE);
        iy.b0 pesel = contactDetailsA7 != null ? contactDetailsA7.getPesel() : xw.g.INSTANCE.a();
        iy.b0 b0VarH = (contactDetailsA7 == null || (phoneNumber2 = contactDetailsA7.getPhoneNumber()) == null) ? null : phoneNumber2.h();
        PhoneNumber.c cVarB = b0VarH != null ? PhoneNumber.c.b(b0VarH) : null;
        iy.b0 value = cVarB != null ? cVarB.getValue() : null;
        State.Field field = new State.Field(PhoneNumber.c.b(value == null ? PhoneNumber.c.INSTANCE.a() : value), null, 2, null);
        iy.b0 b0VarG2 = (contactDetailsA7 == null || (phoneNumber = contactDetailsA7.getPhoneNumber()) == null) ? null : phoneNumber.g();
        PhoneNumber.b bVarB = b0VarG2 != null ? PhoneNumber.b.b(b0VarG2) : null;
        iy.b0 value2 = bVarB != null ? bVarB.getValue() : null;
        State.Field field2 = new State.Field(PhoneNumber.b.b(value2 == null ? PhoneNumber.b.INSTANCE.a() : value2), null, 2, null);
        iy.b0 email = contactDetailsA7 != null ? contactDetailsA7.getEmail() : null;
        State state = new State(b0VarG, pesel, field, field2, new State.Field(email == null ? iy.b0.INSTANCE.a() : email, null, 2, null), null, 32, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: g22.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.H9(this.f69913a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), C9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o02.b.ContactDetails A9(State state) {
        return new o02.b.ContactDetails(state.getNameAndSurname(), state.getPesel(), new PhoneNumber(state.h().d().getValue(), state.g().d().getValue(), null), state.c().d(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B9(dx.b bVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new g22.a.d.ShowError(this.errorMapper.b(new h22.b.Params(bVar, b9(g22.a.C1574a.f69842a)))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g22.d.Data C9(State state) {
        h22.g gVar = this.mapper;
        er.a<i0> aVarB9 = b9(g22.a.m.f69861a);
        return gVar.b(new h22.g.Params(state, b9(g22.a.b.f69843a), b9(g22.a.k.f69859a), new er.p() { // from class: g22.l
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.D9(this.f69910a, (b) obj, (String) obj2);
            }
        }, aVarB9, b9(g22.a.i.f69857a), new er.p() { // from class: g22.m
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.E9(this.f69911a, (b) obj, ((Boolean) obj2).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(p pVar, g22.b bVar, String str) {
        pVar.d9(new g22.a.OnFieldValueChanged(bVar, str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(p pVar, g22.b bVar, boolean z15) {
        pVar.d9(new g22.a.OnFocusChanged(bVar, z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F9(o02.b.ContactDetails contactDetails) {
        this.contract.F7(contactDetails);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: g22.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.I9(this.f69912a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(p pVar, k10.z zVar) {
        zVar.C(pVar.new b(null));
        h hVar = pVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(g22.a.b.class), oVar, hVar);
        zVar.x(q0.c(g22.a.C1574a.class), oVar, pVar.new i(null));
        zVar.v(q0.c(g22.a.i.class), oVar, new j(null));
        zVar.v(q0.c(g22.a.OnMIdCardDataLoaded.class), oVar, new k(null));
        zVar.v(q0.c(g22.a.OnRdkDataDownloaded.class), oVar, pVar.new l(null));
        zVar.x(q0.c(g22.a.j.class), oVar, pVar.new m(null));
        zVar.x(q0.c(g22.a.c.class), oVar, pVar.new n(null));
        zVar.x(q0.c(g22.a.k.class), oVar, pVar.new o(null));
        zVar.x(q0.c(g22.a.OnFocusChanged.class), oVar, pVar.new c(null));
        zVar.v(q0.c(g22.a.OnFieldValueChanged.class), oVar, new d(null));
        zVar.v(q0.c(g22.a.n.class), oVar, pVar.new e(null));
        zVar.v(q0.c(g22.a.l.class), oVar, pVar.new f(null));
        zVar.v(q0.c(g22.a.m.class), oVar, pVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(m22.h hVar) {
        super.P5(hVar);
    }

    @Override // zx.b
    public xw.b<g22.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, g22.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g22.d.Data> getState() {
        return this.state;
    }
}
