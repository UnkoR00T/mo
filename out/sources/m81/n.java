package m81;

import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u0017078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lm81/n;", "Ll00/g;", "Lm81/c;", "Lm81/a;", "Lm81/d;", "", "Lyy/a;", "stateMachineFactory", "Lo81/b;", "mapper", "Lo81/a;", "errorMapper", "Liv2/a;", "isDocumentPhotoFeatureFlagActiveUC", "Lhb4/d;", "errorVMSFactory", "Ll61/m;", "getFaceDetectionInstallationStateUC", "Lm81/b;", "setupData", "<init>", "(Lyy/a;Lo81/b;Lo81/a;Liv2/a;Lhb4/d;Ll61/m;Lm81/b;)V", "state", "Lm81/d$a;", "t9", "(Lm81/c;)Lm81/d$a;", "b", "Lo81/b;", "c", "Lo81/a;", "d", "Liv2/a;", "e", "Lhb4/d;", "f", "Ll61/m;", "g", "Lm81/b;", "Lm81/c$c;", "h", "Lm81/c$c;", "initialState", "Lxw/b;", "Lm81/a$a;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<m81.c, m81.a> implements m81.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o81.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o81.a errorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iv2.a isDocumentPhotoFeatureFlagActiveUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l61.m getFaceDetectionInstallationStateUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final m81.c.C3055c initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<m81.a.InterfaceC3053a> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<m81.c, m81.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<m81.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<m81.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f124542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f124543b;

        /* JADX INFO: renamed from: m81.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3057a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f124544a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f124545b;

            /* JADX INFO: renamed from: m81.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3058a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f124546d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f124547e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f124548f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f124550h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f124551j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f124552k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f124553l;

                public C3058a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f124546d = obj;
                    this.f124547e |= PKIFailureInfo.systemUnavail;
                    return C3057a.this.F(null, this);
                }
            }

            public C3057a(mu.h hVar, n nVar) {
                this.f124544a = hVar;
                this.f124545b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3058a c3058a;
                if (eVar instanceof C3058a) {
                    c3058a = (C3058a) eVar;
                    int i15 = c3058a.f124547e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3058a.f124547e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3058a = new C3058a(eVar);
                    }
                } else {
                    c3058a = new C3058a(eVar);
                }
                Object obj2 = c3058a.f124546d;
                Object objE = uq.b.e();
                int i16 = c3058a.f124547e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f124544a;
                    m81.d.a aVarT9 = this.f124545b.t9((m81.c) obj);
                    c3058a.f124548f = vq.j.a(obj);
                    c3058a.f124550h = vq.j.a(c3058a);
                    c3058a.f124551j = vq.j.a(obj);
                    c3058a.f124552k = vq.j.a(hVar);
                    c3058a.f124553l = 0;
                    c3058a.f124547e = 1;
                    if (hVar.F(aVarT9, c3058a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f124542a = gVar;
            this.f124543b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super m81.d.a> hVar, tq.e eVar) {
            Object objA = this.f124542a.a(new C3057a(hVar, this.f124543b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm81/a$c;", "action", "Lm81/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lm81/a$c;Lm81/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<m81.a.OnNext, m81.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124555f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m81.a.OnNext onNext = (m81.a.OnNext) this.f124555f;
            Object objE = uq.b.e();
            int i15 = this.f124554e;
            if (i15 == 0) {
                oq.u.b(obj);
                n.this.setupData.getContract().k2(new n81.a.FaceDetectionData(onNext.getIdentityPhotoEnabled()));
                n nVar = n.this;
                m81.a.InterfaceC3053a.c cVar = m81.a.InterfaceC3053a.c.f124508a;
                this.f124555f = vq.j.a(onNext);
                this.f124554e = 1;
                if (nVar.F(cVar, this) == objE) {
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
        public final Object w(m81.a.OnNext onNext, m81.c cVar, tq.e<? super i0> eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f124555f = onNext;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lm81/c$c;", "state", "Lk10/l;", "Lm81/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<m81.c.C3055c>, tq.e<? super k10.l<? extends m81.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124558f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m81.c.b O(m81.c.C3055c c3055c) {
            return m81.c.b.f124515a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f124558f;
            uq.b.e();
            if (this.f124557e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (n.this.isDocumentPhotoFeatureFlagActiveUC.a(gz.b.a.C1792a.f78542a).booleanValue()) {
                return c0Var.d(new er.l() { // from class: m81.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.c.O((c.C3055c) obj2);
                    }
                });
            }
            k10.l lVarC = c0Var.c();
            n.this.d9(new m81.a.OnNext(false));
            return lVarC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<m81.c.C3055c> c0Var, tq.e<? super k10.l<? extends m81.c>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f124558f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm81/a$e;", "<unused var>", "Lm81/c$b;", "Loq/i0;", "<anonymous>", "(Lm81/a$e;Lm81/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<m81.a.e, m81.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124560e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f124560e;
            if (i15 == 0) {
                oq.u.b(obj);
                n nVar = n.this;
                m81.a.InterfaceC3053a.C3054a c3054a = m81.a.InterfaceC3053a.C3054a.f124506a;
                this.f124560e = 1;
                if (nVar.F(c3054a, this) == objE) {
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
        public final Object w(m81.a.e eVar, m81.c.b bVar, tq.e<? super i0> eVar2) {
            return n.this.new d(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li61/a;", "installationState", "Lm81/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Li61/a;Lm81/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<i61.a, m81.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124562e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124563f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i61.a aVar = (i61.a) this.f124563f;
            uq.b.e();
            if (this.f124562e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == i61.a.SUCCESS) {
                n.this.d9(new m81.a.OnNext(true));
            }
            if (aVar == i61.a.FAILURE) {
                n.this.d9(m81.a.b.f124509a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i61.a aVar, m81.c.b bVar, tq.e<? super i0> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f124563f = aVar;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm81/a$b;", "<unused var>", "Lk10/c0;", "Lm81/c$b;", "state", "Lk10/l;", "Lm81/c;", "<anonymous>", "(Lm81/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<m81.a.b, c0<m81.c.b>, tq.e<? super k10.l<? extends m81.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124566f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m81.c.Error V(final n nVar, m81.c.b bVar) {
            return new m81.c.Error(nVar.errorVMSFactory.a(nVar.errorMapper.b(new o81.a.Params(nVar.b9(m81.a.d.f124511a), new er.a() { // from class: m81.q
                @Override // er.a
                public final Object a() {
                    return n.f.X(nVar);
                }
            }))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(n nVar) {
            nVar.d9(new m81.a.OnNext(false));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f124566f;
            uq.b.e();
            if (this.f124565e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final n nVar = n.this;
            return c0Var.d(new er.l() { // from class: m81.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.f.V(nVar, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(m81.a.b bVar, c0<m81.c.b> c0Var, tq.e<? super k10.l<? extends m81.c>> eVar) {
            f fVar = n.this.new f(eVar);
            fVar.f124566f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm81/a$d;", "<unused var>", "Lk10/c0;", "Lm81/c$a;", "state", "Lk10/l;", "Lm81/c;", "<anonymous>", "(Lm81/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<m81.a.d, c0<m81.c.Error>, tq.e<? super k10.l<? extends m81.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124568e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124569f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m81.c.b O(m81.c.Error error) {
            return m81.c.b.f124515a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f124569f;
            Object objE = uq.b.e();
            int i15 = this.f124568e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<m81.a.InterfaceC3053a> bVarY1 = n.this.Y1();
                m81.a.InterfaceC3053a.b bVar = m81.a.InterfaceC3053a.b.f124507a;
                this.f124569f = c0Var;
                this.f124568e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: m81.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.g.O((c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m81.a.d dVar, c0<m81.c.Error> c0Var, tq.e<? super k10.l<? extends m81.c>> eVar) {
            g gVar = n.this.new g(eVar);
            gVar.f124569f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, o81.b bVar, o81.a aVar2, iv2.a aVar3, hb4.d dVar, l61.m mVar, SetupData setupData) {
        this.mapper = bVar;
        this.errorMapper = aVar2;
        this.isDocumentPhotoFeatureFlagActiveUC = aVar3;
        this.errorVMSFactory = dVar;
        this.getFaceDetectionInstallationStateUC = mVar;
        this.setupData = setupData;
        m81.c.C3055c c3055c = m81.c.C3055c.f124516a;
        this.initialState = c3055c;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(c3055c, new er.l() { // from class: m81.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.v9(this.f124531a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), t9(c3055c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m81.d.a t9(m81.c state) {
        return this.mapper.b(new o81.b.Params(state, b9(m81.a.e.f124512a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final n nVar, v vVar) {
        vVar.c(q0.c(m81.c.class), new er.l() { // from class: m81.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.w9(this.f124527a, (z) obj);
            }
        });
        vVar.c(q0.c(m81.c.C3055c.class), new er.l() { // from class: m81.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.x9(this.f124528a, (z) obj);
            }
        });
        vVar.c(q0.c(m81.c.b.class), new er.l() { // from class: m81.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f124529a, (z) obj);
            }
        });
        vVar.c(q0.c(m81.c.Error.class), new er.l() { // from class: m81.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.z9(this.f124530a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(m81.a.OnNext.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(n nVar, z zVar) {
        zVar.A(nVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(n nVar, z zVar) {
        d dVar = nVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(m81.a.e.class), oVar, dVar);
        k10.k.s(zVar, nVar.getFaceDetectionInstallationStateUC.b(gz.b.a.C1792a.f78542a), null, nVar.new e(null), 2, null);
        zVar.v(q0.c(m81.a.b.class), oVar, nVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(n nVar, z zVar) {
        g gVar = nVar.new g(null);
        zVar.v(q0.c(m81.a.d.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<m81.a.InterfaceC3053a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<m81.c, m81.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<m81.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(m81.a.InterfaceC3053a interfaceC3053a, tq.e<? super i0> eVar) {
        return super.F(interfaceC3053a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
