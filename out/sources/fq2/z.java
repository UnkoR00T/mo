package fq2;

import hq2.CheckBoxState;
import java.util.List;
import jl0.PassportChildAgreementApplicant;
import jl0.PassportChildAgreementAttachmentConfigOutputModel;
import jl0.PassportChildAgreementAttachments;
import jl0.PassportChildAgreementXmlRequest;
import jl0.SubmitPassportChildAgreementRequest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J!\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010,\u001a\u00020+*\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u00100\u001a\u00020/*\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010P\u001a\b\u0012\u0004\u0012\u00020K0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030U8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u00102\u001a\b\u0012\u0004\u0012\u0002030[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_¨\u0006`"}, d2 = {"Lfq2/z;", "Ll00/g;", "Lfq2/d;", "Lfq2/c;", "Lfq2/e;", "", "Lyy/a;", "stateMachineFactory", "Lgq2/b;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lep2/g;", "generateXmlWithTokenUC", "Lwz3/j;", "signBase64XmlUC", "Ltl0/g;", "submitXmlUC", "Lac4/a;", "callActionWithLoaderUseCase", "Ltl0/d;", "getAttachmentsConfigUC", "Lp04/b;", "uploadFileToCloudUC", "Lhq2/c;", "contract", "<init>", "(Lyy/a;Lgq2/b;Lhb4/d;Lib4/c;Lep2/g;Lwz3/j;Ltl0/g;Lac4/a;Ltl0/d;Lp04/b;Lhq2/c;)V", "Ldx/b;", "domainError", "Lhb4/c;", "G9", "(Ldx/b;)Lhb4/c;", "Lhq2/c$a;", "contractData", "Ljl0/u;", "passportChildAgreementAttachments", "Ljl0/x;", "I9", "(Lhq2/c$a;Ljl0/u;)Ljl0/x;", "Lnq2/c;", "Ljl0/p;", "Y9", "(Lnq2/c;)Ljl0/p;", "Lhq2/b;", "", "J9", "(Lhq2/b;)Z", "state", "Lfq2/e$a;", "K9", "(Lfq2/d;)Lfq2/e$a;", "b", "Lgq2/b;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Lep2/g;", "f", "Lwz3/j;", "g", "Ltl0/g;", "h", "Lac4/a;", "j", "Ltl0/d;", "k", "Lp04/b;", "l", "Lhq2/c;", "Lxw/b;", "Lfq2/c$c;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lfq2/d$a$b;", "n", "Lfq2/d$a$b;", "initialState", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<fq2.d, fq2.c> implements fq2.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gq2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ep2.g generateXmlWithTokenUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wz3.j signBase64XmlUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final tl0.g submitXmlUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final tl0.d getAttachmentsConfigUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p04.b uploadFileToCloudUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final hq2.c contract;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fq2.c.InterfaceC1467c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final fq2.d.a.b initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<fq2.d, fq2.c> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<fq2.e.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f66285b;

        static {
            int[] iArr = new int[eq2.b.values().length];
            try {
                iArr[eq2.b.PICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eq2.b.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66284a = iArr;
            int[] iArr2 = new int[nq2.c.values().length];
            try {
                iArr2[nq2.c.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[nq2.c.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[nq2.c.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f66285b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<fq2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f66286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f66287b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f66288a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f66289b;

            /* JADX INFO: renamed from: fq2.z$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1475a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f66290d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f66291e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f66292f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f66294h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f66295j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f66296k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f66297l;

                public C1475a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f66290d = obj;
                    this.f66291e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f66288a = hVar;
                this.f66289b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1475a c1475a;
                if (eVar instanceof C1475a) {
                    c1475a = (C1475a) eVar;
                    int i15 = c1475a.f66291e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1475a.f66291e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1475a = new C1475a(eVar);
                    }
                } else {
                    c1475a = new C1475a(eVar);
                }
                Object obj2 = c1475a.f66290d;
                Object objE = uq.b.e();
                int i16 = c1475a.f66291e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f66288a;
                    fq2.e.a aVarK9 = this.f66289b.K9((fq2.d) obj);
                    c1475a.f66292f = vq.j.a(obj);
                    c1475a.f66294h = vq.j.a(c1475a);
                    c1475a.f66295j = vq.j.a(obj);
                    c1475a.f66296k = vq.j.a(hVar);
                    c1475a.f66297l = 0;
                    c1475a.f66291e = 1;
                    if (hVar.F(aVarK9, c1475a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, z zVar) {
            this.f66286a = gVar;
            this.f66287b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fq2.e.a> hVar, tq.e eVar) {
            Object objA = this.f66286a.a(new a(hVar, this.f66287b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfq2/c$c;", "action", "Lfq2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfq2/c$c;Lfq2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<fq2.c.InterfaceC1467c, fq2.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66299f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fq2.c.InterfaceC1467c interfaceC1467c = (fq2.c.InterfaceC1467c) this.f66299f;
            Object objE = uq.b.e();
            int i15 = this.f66298e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                this.f66299f = vq.j.a(interfaceC1467c);
                this.f66298e = 1;
                if (zVar.F(interfaceC1467c, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fq2.c.InterfaceC1467c interfaceC1467c, fq2.d dVar, tq.e<? super oq.i0> eVar) {
            c cVar = z.this.new c(eVar);
            cVar.f66299f = interfaceC1467c;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfq2/d$b$b$b;", "it", "Loq/i0;", "<anonymous>", "(Lfq2/d$b$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<fq2.d.b.InterfaceC1470b.MissingToken, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66301e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(z zVar, iy.b0 b0Var) {
            zVar.d9(fq2.c.d.f66157a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f66301e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z zVar = z.this;
            final z zVar2 = z.this;
            zVar.d9(new fq2.c.InterfaceC1467c.ToEdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: fq2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.d.O(zVar2, (iy.b0) obj2);
                }
            }, null, 2, null)));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(fq2.d.b.InterfaceC1470b.MissingToken missingToken, tq.e<? super oq.i0> eVar) {
            return ((d) v(missingToken, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfq2/c$d;", "<unused var>", "Lk10/c0;", "Lfq2/d$b$b$b;", "state", "Lk10/l;", "Lfq2/d;", "<anonymous>", "(Lfq2/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<fq2.c.d, k10.c0<fq2.d.b.InterfaceC1470b.MissingToken>, tq.e<? super k10.l<? extends fq2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66304f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fq2.d.b.InterfaceC1470b.Generating O(k10.c0 c0Var, fq2.d.b.InterfaceC1470b.MissingToken missingToken) {
            return new fq2.d.b.InterfaceC1470b.Generating(((fq2.d.b.InterfaceC1470b.MissingToken) c0Var.a()).getData(), ((fq2.d.b.InterfaceC1470b.MissingToken) c0Var.a()).getPassportChildAgreementAttachments(), ((fq2.d.b.InterfaceC1470b.MissingToken) c0Var.a()).getScrollToStatementCheckBox());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f66304f;
            uq.b.e();
            if (this.f66303e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fq2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.e.O(c0Var, (d.b.InterfaceC1470b.MissingToken) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fq2.c.d dVar, k10.c0<fq2.d.b.InterfaceC1470b.MissingToken> c0Var, tq.e<? super k10.l<? extends fq2.d>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f66304f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfq2/c$a;", "<unused var>", "Lfq2/d$a$a;", "Loq/i0;", "<anonymous>", "(Lfq2/c$a;Lfq2/d$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<fq2.c.a, fq2.d.a.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66305e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f66305e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(fq2.c.InterfaceC1467c.a.f66153a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fq2.c.a aVar, fq2.d.a.Error error, tq.e<? super oq.i0> eVar) {
            return z.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfq2/c$b;", "<unused var>", "Lfq2/d$a$a;", "Loq/i0;", "<anonymous>", "(Lfq2/c$b;Lfq2/d$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<fq2.c.b, fq2.d.a.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66307e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f66307e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(fq2.c.InterfaceC1467c.a.f66153a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fq2.c.b bVar, fq2.d.a.Error error, tq.e<? super oq.i0> eVar) {
            return z.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lfq2/d$a$b;", "state", "Lk10/l;", "Lfq2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<fq2.d.a.b>, tq.e<? super k10.l<? extends fq2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66310f;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fq2.d.a.Error V(z zVar, dx.b bVar, fq2.d.a.b bVar2) {
            return new fq2.d.a.Error(zVar.G9(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fq2.d.b.Presenting X(hq2.c.SummaryContractData summaryContractData, fq2.d.a.b bVar) {
            return new fq2.d.b.Presenting(new fq2.d.b.Data(summaryContractData, new CheckBoxState(null, false, 3, null)), false);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f66310f;
            uq.b.e();
            if (this.f66309e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<dx.b, hq2.c.SummaryContractData> iVarM0 = z.this.contract.m0();
            final z zVar = z.this;
            if (iVarM0 instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVarM0).b();
                return c0Var.d(new er.l() { // from class: fq2.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.h.V(zVar, bVar, (d.a.b) obj2);
                    }
                });
            }
            if (!(iVarM0 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final hq2.c.SummaryContractData summaryContractData = (hq2.c.SummaryContractData) ((dx.i.Right) iVarM0).b();
            return c0Var.d(new er.l() { // from class: fq2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.h.X(summaryContractData, (d.a.b) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<fq2.d.a.b> c0Var, tq.e<? super k10.l<? extends fq2.d>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = z.this.new h(eVar);
            hVar.f66310f = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfq2/c$b;", "<unused var>", "Lk10/c0;", "Lfq2/d$c;", "state", "Lk10/l;", "Lfq2/d;", "<anonymous>", "(Lfq2/c$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<fq2.c.b, k10.c0<fq2.d.InitializedError>, tq.e<? super k10.l<? extends fq2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66313f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fq2.d.b O(k10.c0 c0Var, fq2.d.InitializedError initializedError) {
            return ((fq2.d.InitializedError) c0Var.a()).getInitializedState();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f66313f;
            uq.b.e();
            if (this.f66312e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fq2.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.i.O(c0Var, (d.InitializedError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fq2.c.b bVar, k10.c0<fq2.d.InitializedError> c0Var, tq.e<? super k10.l<? extends fq2.d>> eVar) {
            i iVar = new i(eVar);
            iVar.f66313f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfq2/c$a;", "<unused var>", "Lk10/c0;", "Lfq2/d$c;", "state", "Lk10/l;", "Lfq2/d;", "<anonymous>", "(Lfq2/c$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<fq2.c.a, k10.c0<fq2.d.InitializedError>, tq.e<? super k10.l<? extends fq2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66315f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fq2.d.b.Presenting O(k10.c0 c0Var, fq2.d.InitializedError initializedError) {
            return new fq2.d.b.Presenting(((fq2.d.InitializedError) c0Var.a()).getInitializedState().getData(), false);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f66315f;
            uq.b.e();
            if (this.f66314e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            fq2.d.b initializedState = ((fq2.d.InitializedError) c0Var.a()).getInitializedState();
            if ((initializedState instanceof fq2.d.b.InterfaceC1470b) || (initializedState instanceof fq2.d.b.PreparingFiles) || (initializedState instanceof fq2.d.b.Presenting) || (initializedState instanceof fq2.d.b.SubmitXml) || (initializedState instanceof fq2.d.b.UploadingFiles)) {
                return c0Var.d(new er.l() { // from class: fq2.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.j.O(c0Var, (d.InitializedError) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fq2.c.a aVar, k10.c0<fq2.d.InitializedError> c0Var, tq.e<? super k10.l<? extends fq2.d>> eVar) {
            j jVar = new j(eVar);
            jVar.f66315f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfq2/c$f;", "action", "Lk10/c0;", "Lfq2/d$b$d;", "state", "Lk10/l;", "Lfq2/d;", "<anonymous>", "(Lfq2/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<fq2.c.SetStatementStateValue, k10.c0<fq2.d.b.Presenting>, tq.e<? super k10.l<? extends fq2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66317f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f66318g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fq2.d.b.Presenting O(k10.c0 c0Var, fq2.c.SetStatementStateValue setStatementStateValue, fq2.d.b.Presenting presenting) {
            return fq2.d.b.Presenting.c(presenting, fq2.d.b.Data.b(((fq2.d.b.Presenting) c0Var.a()).getData(), null, new CheckBoxState(null, setStatementStateValue.getValue(), 1, null), 1, null), false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fq2.c.SetStatementStateValue setStatementStateValue = (fq2.c.SetStatementStateValue) this.f66317f;
            final k10.c0 c0Var = (k10.c0) this.f66318g;
            uq.b.e();
            if (this.f66316e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fq2.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.k.O(c0Var, setStatementStateValue, (d.b.Presenting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fq2.c.SetStatementStateValue setStatementStateValue, k10.c0<fq2.d.b.Presenting> c0Var, tq.e<? super k10.l<? extends fq2.d>> eVar) {
            k kVar = new k(eVar);
            kVar.f66317f = setStatementStateValue;
            kVar.f66318g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfq2/c$g;", "<unused var>", "Lk10/c0;", "Lfq2/d$b$d;", "state", "Lk10/l;", "Lfq2/d;", "<anonymous>", "(Lfq2/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<fq2.c.g, k10.c0<fq2.d.b.Presenting>, tq.e<? super k10.l<? extends fq2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66320f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lfq2/d$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends fq2.d.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f66322e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k10.c0<fq2.d.b.Presenting> f66323f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ z f66324g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k10.c0<fq2.d.b.Presenting> c0Var, z zVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f66323f = c0Var;
                this.f66324g = zVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fq2.d.b X(z zVar, fq2.d.b.Presenting presenting) {
                boolean zIsEmpty = zVar.contract.q0().isEmpty();
                if (zIsEmpty) {
                    return new fq2.d.b.InterfaceC1470b.Generating(presenting.getData(), null, false);
                }
                if (zIsEmpty) {
                    throw new oq.p();
                }
                return new fq2.d.b.PreparingFiles(presenting.getData(), false);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fq2.d.b.Presenting Y(k10.c0 c0Var, CheckBoxState checkBoxState, fq2.d.b.Presenting presenting) {
                return presenting.b(fq2.d.b.Data.b(((fq2.d.b.Presenting) c0Var.a()).getData(), null, checkBoxState, 1, null), true);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f66322e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                final CheckBoxState statementState = this.f66323f.a().getData().getStatementState();
                k10.c0<fq2.d.b.Presenting> c0Var = this.f66323f;
                if (!statementState.getValue() && c0Var.a().getData().getSummaryContractData().getChildData().getEntryType() == eq2.b.PICKER) {
                    statementState = new CheckBoxState(new hz.b.Invalid(null, 1, null), false, 2, null);
                }
                if (!this.f66324g.J9(statementState)) {
                    final k10.c0<fq2.d.b.Presenting> c0Var2 = this.f66323f;
                    return c0Var2.b(new er.l() { // from class: fq2.i0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.l.a.Y(c0Var2, statementState, (d.b.Presenting) obj2);
                        }
                    });
                }
                k10.c0<fq2.d.b.Presenting> c0Var3 = this.f66323f;
                final z zVar = this.f66324g;
                return c0Var3.d(new er.l() { // from class: fq2.h0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.l.a.X(zVar, (d.b.Presenting) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f66323f, this.f66324g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends fq2.d.b>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f66320f;
            Object objE = uq.b.e();
            int i15 = this.f66319e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUseCase;
            a aVar2 = new a(c0Var, z.this, null);
            this.f66320f = vq.j.a(c0Var);
            this.f66319e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fq2.c.g gVar, k10.c0<fq2.d.b.Presenting> c0Var, tq.e<? super k10.l<? extends fq2.d>> eVar) {
            l lVar = z.this.new l(eVar);
            lVar.f66320f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfq2/c$e;", "<unused var>", "Lk10/c0;", "Lfq2/d$b$d;", "state", "Lk10/l;", "Lfq2/d;", "<anonymous>", "(Lfq2/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<fq2.c.e, k10.c0<fq2.d.b.Presenting>, tq.e<? super k10.l<? extends fq2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66326f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fq2.d.b.Presenting O(fq2.d.b.Presenting presenting) {
            return fq2.d.b.Presenting.c(presenting, null, false, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f66326f;
            uq.b.e();
            if (this.f66325e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fq2.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.m.O((d.b.Presenting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fq2.c.e eVar, k10.c0<fq2.d.b.Presenting> c0Var, tq.e<? super k10.l<? extends fq2.d>> eVar2) {
            m mVar = new m(eVar2);
            mVar.f66326f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lfq2/d$b$b$a;", "state", "Lk10/l;", "Lfq2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<k10.c0<fq2.d.b.InterfaceC1470b.Generating>, tq.e<? super k10.l<? extends fq2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66328f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lfq2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends fq2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f66330e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ z f66331f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<fq2.d.b.InterfaceC1470b.Generating> f66332g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, k10.c0<fq2.d.b.InterfaceC1470b.Generating> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f66331f = zVar;
                this.f66332g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fq2.d.InitializedError Y(z zVar, k44.a aVar, k10.c0 c0Var, fq2.d.b.InterfaceC1470b.Generating generating) {
                return new fq2.d.InitializedError(zVar.G9(((k44.a.Domain) aVar).getDomain()), (fq2.d.b) c0Var.a());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fq2.d.b.InterfaceC1470b.MissingToken Z(k10.c0 c0Var, fq2.d.b.InterfaceC1470b.Generating generating) {
                return new fq2.d.b.InterfaceC1470b.MissingToken(((fq2.d.b.InterfaceC1470b.Generating) c0Var.a()).getData(), ((fq2.d.b.InterfaceC1470b.Generating) c0Var.a()).getPassportChildAgreementAttachments(), ((fq2.d.b.InterfaceC1470b.Generating) c0Var.a()).getScrollToStatementCheckBox());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fq2.d.b.SubmitXml a0(k10.c0 c0Var, iy.b0 b0Var, fq2.d.b.InterfaceC1470b.Generating generating) {
                return new fq2.d.b.SubmitXml(((fq2.d.b.InterfaceC1470b.Generating) c0Var.a()).getData(), b0Var, false, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f66330e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ep2.g gVar = this.f66331f.generateXmlWithTokenUC;
                    ep2.g.Params params = new ep2.g.Params(this.f66331f.I9(this.f66332g.a().getData().getSummaryContractData(), this.f66332g.a().getPassportChildAgreementAttachments()));
                    this.f66330e = 1;
                    obj = gVar.e(params, this);
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
                final k10.c0<fq2.d.b.InterfaceC1470b.Generating> c0Var = this.f66332g;
                final z zVar = this.f66331f;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final iy.b0 data = ((ry.a) ((dx.i.Right) iVar).b()).getData();
                    return c0Var.d(new er.l() { // from class: fq2.m0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.n.a.a0(c0Var, data, (d.b.InterfaceC1470b.Generating) obj2);
                        }
                    });
                }
                final k44.a aVar = (k44.a) ((dx.i.Left) iVar).b();
                if (aVar instanceof k44.a.Domain) {
                    return c0Var.d(new er.l() { // from class: fq2.k0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.n.a.Y(zVar, aVar, c0Var, (d.b.InterfaceC1470b.Generating) obj2);
                        }
                    });
                }
                if (fr.t.c(aVar, k44.a.b.f108417a)) {
                    return c0Var.d(new er.l() { // from class: fq2.l0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.n.a.Z(c0Var, (d.b.InterfaceC1470b.Generating) obj2);
                        }
                    });
                }
                throw new oq.p();
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f66331f, this.f66332g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends fq2.d>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f66328f;
            Object objE = uq.b.e();
            int i15 = this.f66327e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUseCase;
            a aVar2 = new a(z.this, c0Var, null);
            this.f66328f = vq.j.a(c0Var);
            this.f66327e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<fq2.d.b.InterfaceC1470b.Generating> c0Var, tq.e<? super k10.l<? extends fq2.d>> eVar) {
            return ((n) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            n nVar = z.this.new n(eVar);
            nVar.f66328f = obj;
            return nVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lfq2/d$b$e;", "state", "Lk10/l;", "Lfq2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.p<k10.c0<fq2.d.b.SubmitXml>, tq.e<? super k10.l<? extends fq2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66334f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lfq2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends fq2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f66336e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f66337f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f66338g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f66339h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f66340j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f66341k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f66342l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ z f66343m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ k10.c0<fq2.d.b.SubmitXml> f66344n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, k10.c0<fq2.d.b.SubmitXml> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f66343m = zVar;
                this.f66344n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fq2.d.InitializedError Y(z zVar, dx.b bVar, k10.c0 c0Var, fq2.d.b.SubmitXml submitXml) {
                return new fq2.d.InitializedError(zVar.G9(bVar), (fq2.d.b) c0Var.a());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fq2.d.InitializedError Z(z zVar, dx.b bVar, k10.c0 c0Var, fq2.d.b.SubmitXml submitXml) {
                return new fq2.d.InitializedError(zVar.G9(bVar), (fq2.d.b) c0Var.a());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fq2.d.C1473d a0(fq2.d.b.SubmitXml submitXml) {
                return fq2.d.C1473d.f66185a;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
            /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
            /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final k10.c0<fq2.d.b.SubmitXml> c0Var;
                final z zVar;
                dx.i iVar;
                Object objE = uq.b.e();
                int i15 = this.f66342l;
                if (i15 == 0) {
                    oq.u.b(obj);
                    wz3.j jVar = this.f66343m.signBase64XmlUC;
                    wz3.j.Params params = new wz3.j.Params(this.f66344n.a().getBase64xml(), null);
                    this.f66342l = 1;
                    obj = jVar.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f66338g;
                    zVar = (z) this.f66337f;
                    oq.u.b(obj);
                }
                iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: fq2.o0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.o.a.Z(zVar, bVar, c0Var, (d.b.SubmitXml) obj2);
                        }
                    });
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                return c0Var.d(new er.l() { // from class: fq2.p0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.o.a.a0((d.b.SubmitXml) obj2);
                    }
                });
                dx.i iVar2 = (dx.i) obj;
                final k10.c0<fq2.d.b.SubmitXml> c0Var2 = this.f66344n;
                final z zVar2 = this.f66343m;
                if (iVar2 instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar2).b();
                    return c0Var2.d(new er.l() { // from class: fq2.n0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.o.a.Y(zVar2, bVar2, c0Var2, (d.b.SubmitXml) obj2);
                        }
                    });
                }
                if (!(iVar2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                iy.b0 value = ((u04.d) ((dx.i.Right) iVar2).b()).getValue();
                tl0.g gVar = zVar2.submitXmlUC;
                tl0.g.Params params2 = new tl0.g.Params(new SubmitPassportChildAgreementRequest(ry.a.b(value), null));
                this.f66336e = vq.j.a(iVar2);
                this.f66337f = zVar2;
                this.f66338g = c0Var2;
                this.f66339h = vq.j.a(value);
                this.f66340j = 0;
                this.f66341k = 0;
                this.f66342l = 2;
                obj = gVar.c(params2, this);
                if (obj != objE) {
                    c0Var = c0Var2;
                    zVar = zVar2;
                    iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Left) {
                        final dx.b bVar3 = (dx.b) ((dx.i.Left) iVar).b();
                        return c0Var.d(new er.l() { // from class: fq2.o0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return z.o.a.Z(zVar, bVar3, c0Var, (d.b.SubmitXml) obj2);
                            }
                        });
                    }
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    return c0Var.d(new er.l() { // from class: fq2.p0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.o.a.a0((d.b.SubmitXml) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f66343m, this.f66344n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends fq2.d>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        o(tq.e<? super o> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f66334f;
            Object objE = uq.b.e();
            int i15 = this.f66333e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUseCase;
            a aVar2 = new a(z.this, c0Var, null);
            this.f66334f = vq.j.a(c0Var);
            this.f66333e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<fq2.d.b.SubmitXml> c0Var, tq.e<? super k10.l<? extends fq2.d>> eVar) {
            return ((o) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            o oVar = z.this.new o(eVar);
            oVar.f66334f = obj;
            return oVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lfq2/d$b$c;", "state", "Lk10/l;", "Lfq2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<k10.c0<fq2.d.b.PreparingFiles>, tq.e<? super k10.l<? extends fq2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66346f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lfq2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends fq2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f66348e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ z f66349f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<fq2.d.b.PreparingFiles> f66350g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, k10.c0<fq2.d.b.PreparingFiles> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f66349f = zVar;
                this.f66350g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fq2.d.InitializedError X(z zVar, dx.b bVar, k10.c0 c0Var, fq2.d.b.PreparingFiles preparingFiles) {
                return new fq2.d.InitializedError(zVar.G9(bVar), (fq2.d.b) c0Var.a());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fq2.d.b.UploadingFiles Y(k10.c0 c0Var, PassportChildAgreementAttachmentConfigOutputModel passportChildAgreementAttachmentConfigOutputModel, fq2.d.b.PreparingFiles preparingFiles) {
                return new fq2.d.b.UploadingFiles(((fq2.d.b.PreparingFiles) c0Var.a()).getData(), passportChildAgreementAttachmentConfigOutputModel, false);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f66348e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    tl0.d dVar = this.f66349f.getAttachmentsConfigUC;
                    tl0.d.Params params = new tl0.d.Params(this.f66350g.a().getData().getSummaryContractData().getPassportType());
                    this.f66348e = 1;
                    obj = dVar.c(params, this);
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
                final k10.c0<fq2.d.b.PreparingFiles> c0Var = this.f66350g;
                final z zVar = this.f66349f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: fq2.q0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.p.a.X(zVar, bVar, c0Var, (d.b.PreparingFiles) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final PassportChildAgreementAttachmentConfigOutputModel passportChildAgreementAttachmentConfigOutputModel = (PassportChildAgreementAttachmentConfigOutputModel) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: fq2.r0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.p.a.Y(c0Var, passportChildAgreementAttachmentConfigOutputModel, (d.b.PreparingFiles) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f66349f, this.f66350g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends fq2.d>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f66346f;
            Object objE = uq.b.e();
            int i15 = this.f66345e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUseCase;
            a aVar2 = new a(z.this, c0Var, null);
            this.f66346f = vq.j.a(c0Var);
            this.f66345e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<fq2.d.b.PreparingFiles> c0Var, tq.e<? super k10.l<? extends fq2.d>> eVar) {
            return ((p) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            p pVar = z.this.new p(eVar);
            pVar.f66346f = obj;
            return pVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lfq2/d$b$f;", "state", "Lk10/l;", "Lfq2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.p<k10.c0<fq2.d.b.UploadingFiles>, tq.e<? super k10.l<? extends fq2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66352f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lfq2/d$b$b$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends fq2.d.b.InterfaceC1470b.Generating>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f66354e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f66355f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f66356g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f66357h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f66358j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f66359k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f66360l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f66361m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f66362n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f66363p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f66364q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f66365r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f66366s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f66367t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ k10.c0<fq2.d.b.UploadingFiles> f66368v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ z f66369w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k10.c0<fq2.d.b.UploadingFiles> c0Var, z zVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f66368v = c0Var;
                this.f66369w = zVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fq2.d.InitializedError X(z zVar, dx.b bVar, k10.c0 c0Var, fq2.d.b.UploadingFiles uploadingFiles) {
                return new fq2.d.InitializedError(zVar.G9(bVar), (fq2.d.b) c0Var.a());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fq2.d.b.InterfaceC1470b.Generating Y(k10.c0 c0Var, PassportChildAgreementAttachmentConfigOutputModel passportChildAgreementAttachmentConfigOutputModel, List list, fq2.d.b.UploadingFiles uploadingFiles) {
                return new fq2.d.b.InterfaceC1470b.Generating(((fq2.d.b.UploadingFiles) c0Var.a()).getData(), new PassportChildAgreementAttachments(passportChildAgreementAttachmentConfigOutputModel.getFileEncryptionKey(), list, null), false);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x007c  */
            /* JADX WARN: Code duplicated, block: B:13:0x00e6 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:14:0x00e7  */
            /* JADX WARN: Code duplicated, block: B:17:0x00ef  */
            /* JADX WARN: Code duplicated, block: B:18:0x0100  */
            /* JADX WARN: Code duplicated, block: B:20:0x0104  */
            /* JADX WARN: Code duplicated, block: B:22:0x012c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00e7 -> B:15:0x00e9). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 320
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fq2.z.q.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f66368v, this.f66369w, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<fq2.d.b.InterfaceC1470b.Generating>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        q(tq.e<? super q> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f66352f;
            Object objE = uq.b.e();
            int i15 = this.f66351e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUseCase;
            a aVar2 = new a(c0Var, z.this, null);
            this.f66352f = vq.j.a(c0Var);
            this.f66351e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<fq2.d.b.UploadingFiles> c0Var, tq.e<? super k10.l<? extends fq2.d>> eVar) {
            return ((q) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            q qVar = z.this.new q(eVar);
            qVar.f66352f = obj;
            return qVar;
        }
    }

    public z(yy.a aVar, gq2.b bVar, hb4.d dVar, ib4.c cVar, ep2.g gVar, wz3.j jVar, tl0.g gVar2, ac4.a aVar2, tl0.d dVar2, p04.b bVar2, hq2.c cVar2) {
        this.mapper = bVar;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.generateXmlWithTokenUC = gVar;
        this.signBase64XmlUC = jVar;
        this.submitXmlUC = gVar2;
        this.callActionWithLoaderUseCase = aVar2;
        this.getAttachmentsConfigUC = dVar2;
        this.uploadFileToCloudUC = bVar2;
        this.contract = cVar2;
        fq2.d.a.b bVar3 = fq2.d.a.b.f66164a;
        this.initialState = bVar3;
        this.stateMachine = aVar.a(bVar3, new er.l() { // from class: fq2.p
            @Override // er.l
            public final Object b(Object obj) {
                return z.N9(this.f66248a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), K9(bVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c G9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: fq2.o
            @Override // er.l
            public final Object b(Object obj) {
                return z.H9(this.f66244a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(z zVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            zVar.d9(fq2.c.b.f66152a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            zVar.d9(fq2.c.a.f66151a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PassportChildAgreementXmlRequest I9(hq2.c.SummaryContractData contractData, PassportChildAgreementAttachments passportChildAgreementAttachments) {
        jl0.n nVar;
        Boolean bool;
        PassportChildAgreementApplicant passportChildAgreementApplicant = new PassportChildAgreementApplicant(contractData.getYourDataValidatedData().getFirstName(), contractData.getYourDataValidatedData().getSecondName(), contractData.getYourDataValidatedData().getSurname(), contractData.getYourDataValidatedData().getPesel(), contractData.getYourDataValidatedData().getDateOfBirth(), contractData.getYourDataValidatedData().getPlaceOfBirth(), contractData.getYourDataValidatedData().getIdCardSeriesAndNumber(), Y9(contractData.getYourDataValidatedData().getDocumentType()), contractData.getYourDataValidatedData().getIdCardNameFieldValue(), contractData.getYourDataValidatedData().getChecksum(), null);
        jl0.v vVar = new jl0.v(contractData.getChildData().getFirstName(), contractData.getChildData().getSecondName(), contractData.getChildData().getOtherName(), contractData.getChildData().getLastName(), contractData.getChildData().getPesel(), contractData.getChildData().getBirthDate(), contractData.getChildData().getBirthPlace(), contractData.getChildData().getChecksum(), null);
        eq2.b entryType = contractData.getChildData().getEntryType();
        int[] iArr = a.f66284a;
        int i15 = iArr[entryType.ordinal()];
        if (i15 == 1) {
            nVar = jl0.n.CHILD_WITH_PARENTIZATION;
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            nVar = jl0.n.CHILD_WITHOUT_PARENTIZATION;
        }
        List<String> listB = contractData.b();
        if (listB != null && !listB.isEmpty()) {
            nVar = null;
        }
        if (nVar == null) {
            nVar = jl0.n.OTHER;
        }
        al0.s0 passportType = contractData.getPassportType();
        int i16 = iArr[contractData.getChildData().getEntryType().ordinal()];
        if (i16 == 1) {
            bool = Boolean.TRUE;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            bool = null;
        }
        List<String> listB2 = contractData.b();
        return new PassportChildAgreementXmlRequest(passportChildAgreementApplicant, vVar, nVar, passportType, passportChildAgreementAttachments, (listB2 == null || listB2.isEmpty()) ? bool : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean J9(CheckBoxState checkBoxState) {
        return !(checkBoxState.getValidationState() instanceof hz.b.Invalid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fq2.e.a K9(fq2.d state) {
        gq2.b bVar = this.mapper;
        er.a<oq.i0> aVarB9 = b9(fq2.c.InterfaceC1467c.b.f66154a);
        er.a<oq.i0> aVarB10 = b9(fq2.c.InterfaceC1467c.C1468c.f66155a);
        return bVar.b(new gq2.b.Params(state, b9(fq2.c.InterfaceC1467c.a.f66153a), aVarB9, aVarB10, new er.l() { // from class: fq2.n
            @Override // er.l
            public final Object b(Object obj) {
                return z.L9(this.f66240a, ((Boolean) obj).booleanValue());
            }
        }, b9(fq2.c.g.f66160a), b9(fq2.c.e.f66158a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(z zVar, boolean z15) {
        zVar.d9(new fq2.c.SetStatementStateValue(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(final z zVar, k10.v vVar) {
        vVar.c(fr.q0.c(fq2.d.class), new er.l() { // from class: fq2.m
            @Override // er.l
            public final Object b(Object obj) {
                return z.O9(this.f66237a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(fq2.d.a.Error.class), new er.l() { // from class: fq2.q
            @Override // er.l
            public final Object b(Object obj) {
                return z.P9(this.f66249a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(fq2.d.a.b.class), new er.l() { // from class: fq2.r
            @Override // er.l
            public final Object b(Object obj) {
                return z.Q9(this.f66253a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(fq2.d.InitializedError.class), new er.l() { // from class: fq2.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.R9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(fq2.d.b.Presenting.class), new er.l() { // from class: fq2.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.S9(this.f66259a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(fq2.d.b.InterfaceC1470b.Generating.class), new er.l() { // from class: fq2.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.T9(this.f66263a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(fq2.d.b.SubmitXml.class), new er.l() { // from class: fq2.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.U9(this.f66264a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(fq2.d.b.PreparingFiles.class), new er.l() { // from class: fq2.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.V9(this.f66266a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(fq2.d.b.UploadingFiles.class), new er.l() { // from class: fq2.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.W9(this.f66268a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(fq2.d.b.InterfaceC1470b.MissingToken.class), new er.l() { // from class: fq2.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.X9(this.f66269a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(z zVar, k10.z zVar2) {
        c cVar = zVar.new c(null);
        zVar2.x(fr.q0.c(fq2.c.InterfaceC1467c.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(z zVar, k10.z zVar2) {
        f fVar = zVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(fr.q0.c(fq2.c.a.class), oVar, fVar);
        zVar2.x(fr.q0.c(fq2.c.b.class), oVar, zVar.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(k10.z zVar) {
        i iVar = new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(fq2.c.b.class), oVar, iVar);
        zVar.v(fr.q0.c(fq2.c.a.class), oVar, new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(z zVar, k10.z zVar2) {
        k kVar = new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(fr.q0.c(fq2.c.SetStatementStateValue.class), oVar, kVar);
        zVar2.v(fr.q0.c(fq2.c.g.class), oVar, zVar.new l(null));
        zVar2.v(fr.q0.c(fq2.c.e.class), oVar, new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(z zVar, k10.z zVar2) {
        zVar2.C(zVar.new d(null));
        e eVar = new e(null);
        zVar2.v(fr.q0.c(fq2.c.d.class), k10.o.CANCEL_PREVIOUS, eVar);
        return oq.i0.f148189a;
    }

    private final jl0.p Y9(nq2.c cVar) {
        int i15 = a.f66285b[cVar.ordinal()];
        if (i15 == 1) {
            return jl0.p.PHYSICAL_ID_CARD;
        }
        if (i15 == 2) {
            return jl0.p.PASSPORT;
        }
        if (i15 == 3) {
            return jl0.p.OTHER;
        }
        throw new oq.p();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(fq2.c.InterfaceC1467c interfaceC1467c, tq.e<? super oq.i0> eVar) {
        return super.F(interfaceC1467c, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(hq2.c cVar) {
        super.P5(cVar);
    }

    @Override // zx.b
    public xw.b<fq2.c.InterfaceC1467c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<fq2.d, fq2.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<fq2.e.a> getState() {
        return this.state;
    }
}
