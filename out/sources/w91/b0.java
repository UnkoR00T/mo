package w91;

import cl0.BEPassportChildApplicationAttachmentConfigResponse;
import cl0.BEPassportChildApplicationAttachments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import y91.CheckBoxState;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B{\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010+\u001a\u00020**\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020301*\b\u0012\u0004\u0012\u00020201H\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010V\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR&\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030[8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R \u0010-\u001a\b\u0012\u0004\u0012\u00020.0a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e¨\u0006f"}, d2 = {"Lw91/b0;", "Ll00/g;", "Lw91/c;", "Lw91/a;", "Lw91/d;", "", "Lyy/a;", "stateMachineFactory", "Lx91/b;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Ll61/g;", "generateXmlWithTokenUC", "Lol0/e;", "getChildPassportApplicationAttachmentsConfigUC", "Lp04/b;", "uploadFileToCloudUC", "Lwz3/j;", "signBase64XmlUC", "Ll61/i;", "childPassportApplicationSubmitXmlWithTokenUC", "Ll61/h;", "childPassportApplicationSubmitXmlWithOnlinePaymentWithTokenUC", "Ll61/k;", "clearChildPassportApplicationDraftUC", "Ly51/a;", "clearChildPassportApplicationDraftTimestampUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lw91/b;", "setupData", "<init>", "(Lyy/a;Lx91/b;Lhb4/d;Lib4/c;Ll61/g;Lol0/e;Lp04/b;Lwz3/j;Ll61/i;Ll61/h;Ll61/k;Ly51/a;Lac4/a;Lw91/b;)V", "Ldx/b;", "domainError", "Lhb4/c;", "L9", "(Ldx/b;)Lhb4/c;", "Ly91/a;", "", "N9", "(Ly91/a;)Z", "state", "Lw91/d$a;", "O9", "(Lw91/c;)Lw91/d$a;", "", "Lcl0/a;", "Lqx3/a;", "ea", "(Ljava/util/List;)Ljava/util/List;", "b", "Lx91/b;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Ll61/g;", "f", "Lol0/e;", "g", "Lp04/b;", "h", "Lwz3/j;", "j", "Ll61/i;", "k", "Ll61/h;", "l", "Ll61/k;", "m", "Ly51/a;", "n", "Lac4/a;", "p", "Lw91/b;", "Lxw/b;", "Lw91/a$d;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lw91/c$a$b;", "r", "Lw91/c$a$b;", "initialState", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 extends l00.g<w91.c, w91.a> implements w91.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x91.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l61.g generateXmlWithTokenUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ol0.e getChildPassportApplicationAttachmentsConfigUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p04.b uploadFileToCloudUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wz3.j signBase64XmlUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l61.i childPassportApplicationSubmitXmlWithTokenUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l61.h childPassportApplicationSubmitXmlWithOnlinePaymentWithTokenUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final l61.k clearChildPassportApplicationDraftUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final y51.a clearChildPassportApplicationDraftTimestampUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<w91.a.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final w91.c.a.b initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<w91.c, w91.a> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<w91.d.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f211194a;

        static {
            int[] iArr = new int[cl0.a.values().length];
            try {
                iArr[cl0.a.BLIK_T6_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cl0.a.BLIK_ONE_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cl0.a.CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[cl0.a.WALLET_GP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[cl0.a.WALLET_AP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[cl0.a.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f211194a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<w91.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f211195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f211196b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f211197a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f211198b;

            /* JADX INFO: renamed from: w91.b0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5551a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f211199d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f211200e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f211201f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f211203h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f211204j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f211205k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f211206l;

                public C5551a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f211199d = obj;
                    this.f211200e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, b0 b0Var) {
                this.f211197a = hVar;
                this.f211198b = b0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5551a c5551a;
                if (eVar instanceof C5551a) {
                    c5551a = (C5551a) eVar;
                    int i15 = c5551a.f211200e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5551a.f211200e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5551a = new C5551a(eVar);
                    }
                } else {
                    c5551a = new C5551a(eVar);
                }
                Object obj2 = c5551a.f211199d;
                Object objE = uq.b.e();
                int i16 = c5551a.f211200e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f211197a;
                    w91.d.a aVarO9 = this.f211198b.O9((w91.c) obj);
                    c5551a.f211201f = vq.j.a(obj);
                    c5551a.f211203h = vq.j.a(c5551a);
                    c5551a.f211204j = vq.j.a(obj);
                    c5551a.f211205k = vq.j.a(hVar);
                    c5551a.f211206l = 0;
                    c5551a.f211200e = 1;
                    if (hVar.F(aVarO9, c5551a) == objE) {
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

        public b(mu.g gVar, b0 b0Var) {
            this.f211195a = gVar;
            this.f211196b = b0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super w91.d.a> hVar, tq.e eVar) {
            Object objA = this.f211195a.a(new a(hVar, this.f211196b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw91/a$d;", "action", "Lw91/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lw91/a$d;Lw91/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<w91.a.d, w91.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211208f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            w91.a.d dVar = (w91.a.d) this.f211208f;
            Object objE = uq.b.e();
            int i15 = this.f211207e;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 b0Var = b0.this;
                this.f211208f = vq.j.a(dVar);
                this.f211207e = 1;
                if (b0Var.F(dVar, this) == objE) {
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
        public final Object w(w91.a.d dVar, w91.c cVar, tq.e<? super oq.i0> eVar) {
            c cVar2 = b0.this.new c(eVar);
            cVar2.f211208f = dVar;
            return cVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw91/c$b$e$a;", "it", "Loq/i0;", "<anonymous>", "(Lw91/c$b$e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<w91.c.b.e.MissingToken, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211210e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(b0 b0Var, iy.b0 b0Var2) {
            b0Var.d9(w91.a.e.f211165a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f211210e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0 b0Var = b0.this;
            final b0 b0Var2 = b0.this;
            b0Var.d9(new w91.a.d.ToEdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: w91.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.d.O(b0Var2, (iy.b0) obj2);
                }
            }, null, 2, null)));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(w91.c.b.e.MissingToken missingToken, tq.e<? super oq.i0> eVar) {
            return ((d) v(missingToken, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b0.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw91/a$e;", "<unused var>", "Lk10/c0;", "Lw91/c$b$e$a;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lw91/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<w91.a.e, k10.c0<w91.c.b.e.MissingToken>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211213f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.b.e.Submitting O(k10.c0 c0Var, w91.c.b.e.MissingToken missingToken) {
            return new w91.c.b.e.Submitting(((w91.c.b.e.MissingToken) c0Var.a()).getData(), ((w91.c.b.e.MissingToken) c0Var.a()).getBase64xml(), ((w91.c.b.e.MissingToken) c0Var.a()).getScrollToStatementCheckBox(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f211213f;
            uq.b.e();
            if (this.f211212e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: w91.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.e.O(c0Var, (c.b.e.MissingToken) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w91.a.e eVar, k10.c0<w91.c.b.e.MissingToken> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar2) {
            e eVar3 = new e(eVar2);
            eVar3.f211213f = c0Var;
            return eVar3.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lw91/c$b$c;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<w91.c.b.PreparingFiles>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211214e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211215f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lw91/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends w91.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f211217e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b0 f211218f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<w91.c.b.PreparingFiles> f211219g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, k10.c0<w91.c.b.PreparingFiles> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f211218f = b0Var;
                this.f211219g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final w91.c.InitializedError X(b0 b0Var, dx.b bVar, k10.c0 c0Var, w91.c.b.PreparingFiles preparingFiles) {
                return new w91.c.InitializedError(b0Var.L9(bVar), (w91.c.b) c0Var.a());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final w91.c.b.UploadingFiles Y(k10.c0 c0Var, BEPassportChildApplicationAttachmentConfigResponse bEPassportChildApplicationAttachmentConfigResponse, w91.c.b.PreparingFiles preparingFiles) {
                return new w91.c.b.UploadingFiles(((w91.c.b.PreparingFiles) c0Var.a()).getData(), bEPassportChildApplicationAttachmentConfigResponse, false, 4, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f211217e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ol0.e eVar = this.f211218f.getChildPassportApplicationAttachmentsConfigUC;
                    ol0.e.Params params = new ol0.e.Params(this.f211219g.a().getData().getSummaryContractData().getPassportType());
                    this.f211217e = 1;
                    obj = eVar.c(params, this);
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
                final k10.c0<w91.c.b.PreparingFiles> c0Var = this.f211219g;
                final b0 b0Var = this.f211218f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: w91.e0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.f.a.X(b0Var, bVar, c0Var, (c.b.PreparingFiles) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BEPassportChildApplicationAttachmentConfigResponse bEPassportChildApplicationAttachmentConfigResponse = (BEPassportChildApplicationAttachmentConfigResponse) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: w91.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.f.a.Y(c0Var, bEPassportChildApplicationAttachmentConfigResponse, (c.b.PreparingFiles) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f211218f, this.f211219g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends w91.c>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f211215f;
            Object objE = uq.b.e();
            int i15 = this.f211214e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = b0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(b0.this, c0Var, null);
            this.f211215f = vq.j.a(c0Var);
            this.f211214e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<w91.c.b.PreparingFiles> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar) {
            return ((f) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = b0.this.new f(eVar);
            fVar.f211215f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lw91/c$b$f;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<w91.c.b.UploadingFiles>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211221f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lw91/c$b$b$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends w91.c.b.InterfaceC5553b.Generating>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f211223e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f211224f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f211225g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f211226h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f211227j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f211228k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f211229l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f211230m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f211231n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f211232p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f211233q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f211234r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f211235s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f211236t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ k10.c0<w91.c.b.UploadingFiles> f211237v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ b0 f211238w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k10.c0<w91.c.b.UploadingFiles> c0Var, b0 b0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f211237v = c0Var;
                this.f211238w = b0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final w91.c.InitializedError X(b0 b0Var, dx.b bVar, k10.c0 c0Var, w91.c.b.UploadingFiles uploadingFiles) {
                return new w91.c.InitializedError(b0Var.L9(bVar), (w91.c.b) c0Var.a());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final w91.c.b.InterfaceC5553b.Generating Y(k10.c0 c0Var, BEPassportChildApplicationAttachmentConfigResponse bEPassportChildApplicationAttachmentConfigResponse, List list, w91.c.b.UploadingFiles uploadingFiles) {
                return new w91.c.b.InterfaceC5553b.Generating(((w91.c.b.UploadingFiles) c0Var.a()).getData(), new BEPassportChildApplicationAttachments(bEPassportChildApplicationAttachmentConfigResponse.getFileEncryptionKey(), list), false, 4, null);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0080  */
            /* JADX WARN: Code duplicated, block: B:13:0x00f6 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:14:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:17:0x00ff  */
            /* JADX WARN: Code duplicated, block: B:18:0x0110  */
            /* JADX WARN: Code duplicated, block: B:20:0x0114  */
            /* JADX WARN: Code duplicated, block: B:22:0x013c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00f7 -> B:15:0x00f9). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 336
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: w91.b0.g.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f211237v, this.f211238w, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<w91.c.b.InterfaceC5553b.Generating>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f211221f;
            Object objE = uq.b.e();
            int i15 = this.f211220e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = b0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(c0Var, b0.this, null);
            this.f211221f = vq.j.a(c0Var);
            this.f211220e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<w91.c.b.UploadingFiles> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = b0.this.new g(eVar);
            gVar.f211221f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw91/a$b;", "<unused var>", "Lw91/c$a$a;", "Loq/i0;", "<anonymous>", "(Lw91/a$b;Lw91/c$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<w91.a.b, w91.c.a.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211239e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f211239e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(w91.a.d.C5549a.f211160a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(w91.a.b bVar, w91.c.a.Error error, tq.e<? super oq.i0> eVar) {
            return b0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lw91/c$a$b;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<k10.c0<w91.c.a.b>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f211242f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f211243g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f211244h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f211245j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f211246k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f211247l;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.a.Error X(b0 b0Var, dx.b bVar, w91.c.a.b bVar2) {
            return new w91.c.a.Error(b0Var.L9(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.Success Y(y91.c.SummaryContractData summaryContractData, w91.c.a.b bVar) {
            return new w91.c.Success(summaryContractData.getApplicationNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.b.Presenting Z(y91.c.SummaryContractData summaryContractData, w91.c.a.b bVar) {
            return new w91.c.b.Presenting(new w91.c.b.Data(summaryContractData, new CheckBoxState(null, summaryContractData.getIsStatementChecked(), 1, null)), false);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i<dx.b, y91.c.SummaryContractData> iVarM0;
            final b0 b0Var;
            final y91.c.SummaryContractData summaryContractData;
            int i15;
            int i16;
            final y91.c.SummaryContractData summaryContractData2;
            k10.c0 c0Var = (k10.c0) this.f211247l;
            Object objE = uq.b.e();
            int i17 = this.f211246k;
            if (i17 != 0) {
                if (i17 == 1) {
                    i15 = this.f211245j;
                    i16 = this.f211244h;
                    y91.c.SummaryContractData summaryContractData3 = (y91.c.SummaryContractData) this.f211243g;
                    b0Var = (b0) this.f211242f;
                    iVarM0 = (dx.i) this.f211241e;
                    oq.u.b(obj);
                    summaryContractData = summaryContractData3;
                } else {
                    if (i17 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    summaryContractData2 = (y91.c.SummaryContractData) this.f211242f;
                    oq.u.b(obj);
                }
                return c0Var.d(new er.l() { // from class: w91.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.i.Y(summaryContractData2, (c.a.b) obj2);
                    }
                });
            }
            oq.u.b(obj);
            iVarM0 = b0.this.setupData.getContract().m0();
            b0Var = b0.this;
            if (iVarM0 instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVarM0).b();
                return c0Var.d(new er.l() { // from class: w91.i0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.i.X(b0Var, bVar, (c.a.b) obj2);
                    }
                });
            }
            if (!(iVarM0 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            summaryContractData = (y91.c.SummaryContractData) ((dx.i.Right) iVarM0).b();
            String applicationNumber = summaryContractData.getApplicationNumber();
            if (applicationNumber == null || fu.r.t0(applicationNumber)) {
                return c0Var.d(new er.l() { // from class: w91.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.i.Z(summaryContractData, (c.a.b) obj2);
                    }
                });
            }
            l61.k kVar = b0Var.clearChildPassportApplicationDraftUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            this.f211247l = c0Var;
            this.f211241e = vq.j.a(iVarM0);
            this.f211242f = b0Var;
            this.f211243g = summaryContractData;
            this.f211244h = 0;
            this.f211245j = 0;
            this.f211246k = 1;
            if (kVar.a(c1792a, this) != objE) {
                i15 = 0;
                i16 = 0;
            }
            return objE;
            y51.a aVar = b0Var.clearChildPassportApplicationDraftTimestampUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            this.f211247l = c0Var;
            this.f211241e = vq.j.a(iVarM0);
            this.f211242f = summaryContractData;
            this.f211243g = null;
            this.f211244h = i16;
            this.f211245j = i15;
            this.f211246k = 2;
            if (aVar.c(c1792a2, this) != objE) {
                summaryContractData2 = summaryContractData;
                return c0Var.d(new er.l() { // from class: w91.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.i.Y(summaryContractData2, (c.a.b) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<w91.c.a.b> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar) {
            return ((i) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = b0.this.new i(eVar);
            iVar.f211247l = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw91/a$c;", "<unused var>", "Lk10/c0;", "Lw91/c$c;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lw91/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<w91.a.c, k10.c0<w91.c.InitializedError>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211250f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.b O(k10.c0 c0Var, w91.c.InitializedError initializedError) {
            return ((w91.c.InitializedError) c0Var.a()).getInitializedState();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f211250f;
            uq.b.e();
            if (this.f211249e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: w91.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.j.O(c0Var, (c.InitializedError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w91.a.c cVar, k10.c0<w91.c.InitializedError> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar) {
            j jVar = new j(eVar);
            jVar.f211250f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw91/a$b;", "<unused var>", "Lk10/c0;", "Lw91/c$c;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lw91/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<w91.a.b, k10.c0<w91.c.InitializedError>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211252f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.b.Presenting O(k10.c0 c0Var, w91.c.InitializedError initializedError) {
            return new w91.c.b.Presenting(((w91.c.InitializedError) c0Var.a()).getInitializedState().getData(), false);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f211252f;
            uq.b.e();
            if (this.f211251e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            w91.c.b initializedState = ((w91.c.InitializedError) c0Var.a()).getInitializedState();
            if ((initializedState instanceof w91.c.b.InterfaceC5553b) || (initializedState instanceof w91.c.b.PreparingFiles) || (initializedState instanceof w91.c.b.Presenting) || (initializedState instanceof w91.c.b.e) || (initializedState instanceof w91.c.b.UploadingFiles)) {
                return c0Var.d(new er.l() { // from class: w91.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.k.O(c0Var, (c.InitializedError) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w91.a.b bVar, k10.c0<w91.c.InitializedError> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar) {
            k kVar = new k(eVar);
            kVar.f211252f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw91/a$a;", "<unused var>", "Lw91/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lw91/a$a;Lw91/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<w91.a.C5548a, w91.c.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211254f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            w91.c.b bVar = (w91.c.b) this.f211254f;
            uq.b.e();
            if (this.f211253e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.setupData.getContract().A3(new y91.c.SummaryData(bVar.getData().getStatementState().getValue()));
            b0.this.d9(w91.a.d.b.f211161a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(w91.a.C5548a c5548a, w91.c.b bVar, tq.e<? super oq.i0> eVar) {
            l lVar = b0.this.new l(eVar);
            lVar.f211254f = bVar;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw91/a$g;", "action", "Lk10/c0;", "Lw91/c$b$d;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lw91/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<w91.a.SetStatementStateValue, k10.c0<w91.c.b.Presenting>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211257f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f211258g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.b.Presenting O(k10.c0 c0Var, w91.a.SetStatementStateValue setStatementStateValue, w91.c.b.Presenting presenting) {
            return w91.c.b.Presenting.c(presenting, w91.c.b.Data.b(((w91.c.b.Presenting) c0Var.a()).getData(), null, new CheckBoxState(null, setStatementStateValue.getValue(), 1, null), 1, null), false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final w91.a.SetStatementStateValue setStatementStateValue = (w91.a.SetStatementStateValue) this.f211257f;
            final k10.c0 c0Var = (k10.c0) this.f211258g;
            uq.b.e();
            if (this.f211256e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: w91.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.m.O(c0Var, setStatementStateValue, (c.b.Presenting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w91.a.SetStatementStateValue setStatementStateValue, k10.c0<w91.c.b.Presenting> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar) {
            m mVar = new m(eVar);
            mVar.f211257f = setStatementStateValue;
            mVar.f211258g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw91/a$j;", "<unused var>", "Lk10/c0;", "Lw91/c$b$d;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lw91/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<w91.a.j, k10.c0<w91.c.b.Presenting>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211259e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211260f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.b.PreparingFiles V(w91.c.b.Presenting presenting) {
            return new w91.c.b.PreparingFiles(presenting.getData(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.b.Presenting X(k10.c0 c0Var, CheckBoxState checkBoxState, w91.c.b.Presenting presenting) {
            return presenting.b(w91.c.b.Data.b(((w91.c.b.Presenting) c0Var.a()).getData(), null, checkBoxState, 1, null), true);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f211260f;
            uq.b.e();
            if (this.f211259e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final CheckBoxState statementState = ((w91.c.b.Presenting) c0Var.a()).getData().getStatementState();
            if (!statementState.getValue() && ((w91.c.b.Presenting) c0Var.a()).getData().getSummaryContractData().getChildData().getEntryType() == cl0.j0.PICKER) {
                statementState = new CheckBoxState(new hz.b.Invalid(null, 1, null), false, 2, null);
            }
            return b0.this.N9(statementState) ? c0Var.d(new er.l() { // from class: w91.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.n.V((c.b.Presenting) obj2);
                }
            }) : c0Var.b(new er.l() { // from class: w91.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.n.X(c0Var, statementState, (c.b.Presenting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(w91.a.j jVar, k10.c0<w91.c.b.Presenting> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar) {
            n nVar = b0.this.new n(eVar);
            nVar.f211260f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw91/a$f;", "<unused var>", "Lk10/c0;", "Lw91/c$b$d;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lw91/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<w91.a.f, k10.c0<w91.c.b.Presenting>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211263f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.b.Presenting O(w91.c.b.Presenting presenting) {
            return w91.c.b.Presenting.c(presenting, null, false, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f211263f;
            uq.b.e();
            if (this.f211262e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: w91.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.o.O((c.b.Presenting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w91.a.f fVar, k10.c0<w91.c.b.Presenting> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar) {
            o oVar = new o(eVar);
            oVar.f211263f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lw91/c$b$b$a;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<k10.c0<w91.c.b.InterfaceC5553b.Generating>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211265f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lw91/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends w91.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f211267e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b0 f211268f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<w91.c.b.InterfaceC5553b.Generating> f211269g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, k10.c0<w91.c.b.InterfaceC5553b.Generating> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f211268f = b0Var;
                this.f211269g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final w91.c.InitializedError Y(b0 b0Var, k44.a aVar, k10.c0 c0Var, w91.c.b.InterfaceC5553b.Generating generating) {
                return new w91.c.InitializedError(b0Var.L9(((k44.a.Domain) aVar).getDomain()), (w91.c.b) c0Var.a());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final w91.c.b.InterfaceC5553b.MissingToken Z(k10.c0 c0Var, w91.c.b.InterfaceC5553b.Generating generating) {
                return new w91.c.b.InterfaceC5553b.MissingToken(((w91.c.b.InterfaceC5553b.Generating) c0Var.a()).getData(), ((w91.c.b.InterfaceC5553b.Generating) c0Var.a()).getPassportChildApplicationAttachments(), ((w91.c.b.InterfaceC5553b.Generating) c0Var.a()).getScrollToStatementCheckBox());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final w91.c.b.e.Submitting a0(k10.c0 c0Var, iy.b0 b0Var, w91.c.b.InterfaceC5553b.Generating generating) {
                return new w91.c.b.e.Submitting(((w91.c.b.InterfaceC5553b.Generating) c0Var.a()).getData(), b0Var, false, 4, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f211267e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    l61.g gVar = this.f211268f.generateXmlWithTokenUC;
                    l61.g.Params params = new l61.g.Params(this.f211269g.a().getData().getSummaryContractData(), this.f211269g.a().getPassportChildApplicationAttachments());
                    this.f211267e = 1;
                    obj = gVar.h(params, this);
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
                final k10.c0<w91.c.b.InterfaceC5553b.Generating> c0Var = this.f211269g;
                final b0 b0Var = this.f211268f;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final iy.b0 data = ((ry.a) ((dx.i.Right) iVar).b()).getData();
                    return c0Var.d(new er.l() { // from class: w91.t0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.p.a.a0(c0Var, data, (c.b.InterfaceC5553b.Generating) obj2);
                        }
                    });
                }
                final k44.a aVar = (k44.a) ((dx.i.Left) iVar).b();
                if (aVar instanceof k44.a.Domain) {
                    return c0Var.d(new er.l() { // from class: w91.r0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.p.a.Y(b0Var, aVar, c0Var, (c.b.InterfaceC5553b.Generating) obj2);
                        }
                    });
                }
                if (fr.t.c(aVar, k44.a.b.f108417a)) {
                    return c0Var.d(new er.l() { // from class: w91.s0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.p.a.Z(c0Var, (c.b.InterfaceC5553b.Generating) obj2);
                        }
                    });
                }
                throw new oq.p();
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f211268f, this.f211269g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends w91.c>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f211265f;
            Object objE = uq.b.e();
            int i15 = this.f211264e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = b0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(b0.this, c0Var, null);
            this.f211265f = vq.j.a(c0Var);
            this.f211264e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<w91.c.b.InterfaceC5553b.Generating> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar) {
            return ((p) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            p pVar = b0.this.new p(eVar);
            pVar.f211265f = obj;
            return pVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lw91/c$b$e$b;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.p<k10.c0<w91.c.b.e.Submitting>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211271f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lw91/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends w91.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f211273e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b0 f211274f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<w91.c.b.e.Submitting> f211275g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, k10.c0<w91.c.b.e.Submitting> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f211274f = b0Var;
                this.f211275g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final w91.c.InitializedError V(b0 b0Var, dx.b bVar, k10.c0 c0Var, w91.c.b.e.Submitting submitting) {
                return new w91.c.InitializedError(b0Var.L9(bVar), (w91.c.b) c0Var.a());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f211273e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    wz3.j jVar = this.f211274f.signBase64XmlUC;
                    wz3.j.Params params = new wz3.j.Params(this.f211275g.a().getBase64xml(), null);
                    this.f211273e = 1;
                    obj = jVar.c(params, this);
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
                final k10.c0<w91.c.b.e.Submitting> c0Var = this.f211275g;
                final b0 b0Var = this.f211274f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: w91.u0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.q.a.V(b0Var, bVar, c0Var, (c.b.e.Submitting) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                iy.b0 value = ((u04.d) ((dx.i.Right) iVar).b()).getValue();
                if (fr.t.c(c0Var.a().getData().getSummaryContractData().getPaymentType(), i61.q.a.f89801a)) {
                    b0Var.d9(new w91.a.SubmitXmlWithOnlinePaymentWithTokenUC(ry.a.b(value), null));
                } else {
                    b0Var.d9(new w91.a.SubmitXmlWithTokenUC(ry.a.b(value), null));
                }
                return c0Var.c();
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f211274f, this.f211275g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends w91.c>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        q(tq.e<? super q> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f211271f;
            Object objE = uq.b.e();
            int i15 = this.f211270e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = b0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(b0.this, c0Var, null);
            this.f211271f = vq.j.a(c0Var);
            this.f211270e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<w91.c.b.e.Submitting> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar) {
            return ((q) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            q qVar = b0.this.new q(eVar);
            qVar.f211271f = obj;
            return qVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw91/a$i;", "action", "Lk10/c0;", "Lw91/c$b$e$b;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lw91/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<w91.a.SubmitXmlWithTokenUC, k10.c0<w91.c.b.e.Submitting>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f211277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f211278g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f211279h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f211280j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f211281k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f211282l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f211283m;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.InitializedError X(b0 b0Var, k44.a aVar, k10.c0 c0Var, w91.c.b.e.Submitting submitting) {
            return new w91.c.InitializedError(b0Var.L9(((k44.a.Domain) aVar).getDomain()), (w91.c.b) c0Var.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.b.e.MissingToken Y(k10.c0 c0Var, w91.c.b.e.Submitting submitting) {
            return new w91.c.b.e.MissingToken(((w91.c.b.e.Submitting) c0Var.a()).getData(), ((w91.c.b.e.Submitting) c0Var.a()).getBase64xml(), ((w91.c.b.e.Submitting) c0Var.a()).getScrollToStatementCheckBox(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.Success Z(String str, w91.c.b.e.Submitting submitting) {
            return new w91.c.Success(str);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00fe  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar;
            final b0 b0Var;
            String str;
            int i15;
            int i16;
            y51.a aVar;
            gz.b.a.C1792a c1792a;
            final String str2;
            w91.a.SubmitXmlWithTokenUC submitXmlWithTokenUC = (w91.a.SubmitXmlWithTokenUC) this.f211282l;
            final k10.c0 c0Var = (k10.c0) this.f211283m;
            Object objE = uq.b.e();
            int i17 = this.f211281k;
            if (i17 == 0) {
                oq.u.b(obj);
                l61.i iVar2 = b0.this.childPassportApplicationSubmitXmlWithTokenUC;
                l61.i.Params params = new l61.i.Params(submitXmlWithTokenUC.getBase64Data(), null);
                this.f211282l = vq.j.a(submitXmlWithTokenUC);
                this.f211283m = c0Var;
                this.f211281k = 1;
                obj = iVar2.e(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i17 == 1) {
                oq.u.b(obj);
            } else {
                if (i17 == 2) {
                    i15 = this.f211280j;
                    i16 = this.f211279h;
                    String str3 = (String) this.f211278g;
                    b0Var = (b0) this.f211277f;
                    iVar = (dx.i) this.f211276e;
                    oq.u.b(obj);
                    str = str3;
                    aVar = b0Var.clearChildPassportApplicationDraftTimestampUC;
                    c1792a = gz.b.a.C1792a.f78542a;
                    this.f211282l = vq.j.a(submitXmlWithTokenUC);
                    this.f211283m = c0Var;
                    this.f211276e = vq.j.a(iVar);
                    this.f211277f = str;
                    this.f211278g = null;
                    this.f211279h = i16;
                    this.f211280j = i15;
                    this.f211281k = 3;
                    if (aVar.c(c1792a, this) != objE) {
                        str2 = str;
                    }
                    return objE;
                }
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.f211277f;
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: w91.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.r.Z(str2, (c.b.e.Submitting) obj2);
                }
            });
            iVar = (dx.i) obj;
            b0Var = b0.this;
            if (iVar instanceof dx.i.Left) {
                final k44.a aVar2 = (k44.a) ((dx.i.Left) iVar).b();
                if (aVar2 instanceof k44.a.Domain) {
                    return c0Var.d(new er.l() { // from class: w91.v0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.r.X(b0Var, aVar2, c0Var, (c.b.e.Submitting) obj2);
                        }
                    });
                }
                if (fr.t.c(aVar2, k44.a.b.f108417a)) {
                    return c0Var.d(new er.l() { // from class: w91.w0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.r.Y(c0Var, (c.b.e.Submitting) obj2);
                        }
                    });
                }
                throw new oq.p();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            str = (String) ((dx.i.Right) iVar).b();
            l61.k kVar = b0Var.clearChildPassportApplicationDraftUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            this.f211282l = vq.j.a(submitXmlWithTokenUC);
            this.f211283m = c0Var;
            this.f211276e = vq.j.a(iVar);
            this.f211277f = b0Var;
            this.f211278g = str;
            this.f211279h = 0;
            this.f211280j = 0;
            this.f211281k = 2;
            if (kVar.a(c1792a2, this) != objE) {
                i15 = 0;
                i16 = 0;
                aVar = b0Var.clearChildPassportApplicationDraftTimestampUC;
                c1792a = gz.b.a.C1792a.f78542a;
                this.f211282l = vq.j.a(submitXmlWithTokenUC);
                this.f211283m = c0Var;
                this.f211276e = vq.j.a(iVar);
                this.f211277f = str;
                this.f211278g = null;
                this.f211279h = i16;
                this.f211280j = i15;
                this.f211281k = 3;
                if (aVar.c(c1792a, this) != objE) {
                    str2 = str;
                    return c0Var.d(new er.l() { // from class: w91.x0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.r.Z(str2, (c.b.e.Submitting) obj2);
                        }
                    });
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(w91.a.SubmitXmlWithTokenUC submitXmlWithTokenUC, k10.c0<w91.c.b.e.Submitting> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar) {
            r rVar = b0.this.new r(eVar);
            rVar.f211282l = submitXmlWithTokenUC;
            rVar.f211283m = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw91/a$h;", "action", "Lk10/c0;", "Lw91/c$b$e$b;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lw91/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<w91.a.SubmitXmlWithOnlinePaymentWithTokenUC, k10.c0<w91.c.b.e.Submitting>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f211286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f211287g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f211288h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f211289j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f211290k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f211291l;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.InitializedError X(b0 b0Var, k44.a aVar, k10.c0 c0Var, w91.c.b.e.Submitting submitting) {
            return new w91.c.InitializedError(b0Var.L9(((k44.a.Domain) aVar).getDomain()), (w91.c.b) c0Var.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.b.e.MissingToken Y(k10.c0 c0Var, w91.c.b.e.Submitting submitting) {
            return new w91.c.b.e.MissingToken(((w91.c.b.e.Submitting) c0Var.a()).getData(), ((w91.c.b.e.Submitting) c0Var.a()).getBase64xml(), ((w91.c.b.e.Submitting) c0Var.a()).getScrollToStatementCheckBox(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.b.Presenting Z(k10.c0 c0Var, w91.c.b.e.Submitting submitting) {
            return new w91.c.b.Presenting(((w91.c.b.e.Submitting) c0Var.a()).getData(), false, 2, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0127, code lost:
        
            if (r6.F(r8, r21) == r3) goto L29;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 314
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: w91.b0.s.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(w91.a.SubmitXmlWithOnlinePaymentWithTokenUC submitXmlWithOnlinePaymentWithTokenUC, k10.c0<w91.c.b.e.Submitting> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar) {
            s sVar = b0.this.new s(eVar);
            sVar.f211290k = submitXmlWithOnlinePaymentWithTokenUC;
            sVar.f211291l = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw91/c$b$b$b;", "it", "Loq/i0;", "<anonymous>", "(Lw91/c$b$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.p<w91.c.b.InterfaceC5553b.MissingToken, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211293e;

        t(tq.e<? super t> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(b0 b0Var, iy.b0 b0Var2) {
            b0Var.d9(w91.a.e.f211165a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f211293e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0 b0Var = b0.this;
            final b0 b0Var2 = b0.this;
            b0Var.d9(new w91.a.d.ToEdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: w91.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.t.O(b0Var2, (iy.b0) obj2);
                }
            }, null, 2, null)));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(w91.c.b.InterfaceC5553b.MissingToken missingToken, tq.e<? super oq.i0> eVar) {
            return ((t) v(missingToken, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b0.this.new t(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw91/a$e;", "<unused var>", "Lk10/c0;", "Lw91/c$b$b$b;", "state", "Lk10/l;", "Lw91/c;", "<anonymous>", "(Lw91/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<w91.a.e, k10.c0<w91.c.b.InterfaceC5553b.MissingToken>, tq.e<? super k10.l<? extends w91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211296f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w91.c.b.InterfaceC5553b.Generating O(k10.c0 c0Var, w91.c.b.InterfaceC5553b.MissingToken missingToken) {
            return new w91.c.b.InterfaceC5553b.Generating(((w91.c.b.InterfaceC5553b.MissingToken) c0Var.a()).getData(), ((w91.c.b.InterfaceC5553b.MissingToken) c0Var.a()).getPassportChildApplicationAttachments(), ((w91.c.b.InterfaceC5553b.MissingToken) c0Var.a()).getScrollToStatementCheckBox());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f211296f;
            uq.b.e();
            if (this.f211295e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: w91.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.u.O(c0Var, (c.b.InterfaceC5553b.MissingToken) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w91.a.e eVar, k10.c0<w91.c.b.InterfaceC5553b.MissingToken> c0Var, tq.e<? super k10.l<? extends w91.c>> eVar2) {
            u uVar = new u(eVar2);
            uVar.f211296f = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    public b0(yy.a aVar, x91.b bVar, hb4.d dVar, ib4.c cVar, l61.g gVar, ol0.e eVar, p04.b bVar2, wz3.j jVar, l61.i iVar, l61.h hVar, l61.k kVar, y51.a aVar2, ac4.a aVar3, SetupData setupData) {
        this.mapper = bVar;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.generateXmlWithTokenUC = gVar;
        this.getChildPassportApplicationAttachmentsConfigUC = eVar;
        this.uploadFileToCloudUC = bVar2;
        this.signBase64XmlUC = jVar;
        this.childPassportApplicationSubmitXmlWithTokenUC = iVar;
        this.childPassportApplicationSubmitXmlWithOnlinePaymentWithTokenUC = hVar;
        this.clearChildPassportApplicationDraftUC = kVar;
        this.clearChildPassportApplicationDraftTimestampUC = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.setupData = setupData;
        w91.c.a.b bVar3 = w91.c.a.b.f211299a;
        this.initialState = bVar3;
        this.stateMachine = aVar.a(bVar3, new er.l() { // from class: w91.r
            @Override // er.l
            public final Object b(Object obj) {
                return b0.R9(this.f211407a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), O9(bVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c L9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: w91.q
            @Override // er.l
            public final Object b(Object obj) {
                return b0.M9(this.f211406a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(b0 b0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            b0Var.d9(w91.a.c.f211159a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            b0Var.d9(w91.a.b.f211158a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean N9(CheckBoxState checkBoxState) {
        return !(checkBoxState.getValidationState() instanceof hz.b.Invalid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w91.d.a O9(w91.c state) {
        x91.b bVar = this.mapper;
        er.a<oq.i0> aVarB9 = b9(w91.a.C5548a.f211157a);
        er.a<oq.i0> aVarB10 = b9(w91.a.d.c.f211162a);
        return bVar.b(new x91.b.Params(state, b9(w91.a.d.C5549a.f211160a), aVarB9, aVarB10, new er.l() { // from class: w91.m
            @Override // er.l
            public final Object b(Object obj) {
                return b0.P9(this.f211397a, ((Boolean) obj).booleanValue());
            }
        }, b9(w91.a.j.f211172a), b9(w91.a.f.f211166a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(b0 b0Var, boolean z15) {
        b0Var.d9(new w91.a.SetStatementStateValue(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(final b0 b0Var, k10.v vVar) {
        vVar.c(fr.q0.c(w91.c.class), new er.l() { // from class: w91.s
            @Override // er.l
            public final Object b(Object obj) {
                return b0.S9(this.f211411a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(w91.c.a.Error.class), new er.l() { // from class: w91.v
            @Override // er.l
            public final Object b(Object obj) {
                return b0.T9(this.f211420a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(w91.c.a.b.class), new er.l() { // from class: w91.w
            @Override // er.l
            public final Object b(Object obj) {
                return b0.W9(this.f211424a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(w91.c.InitializedError.class), new er.l() { // from class: w91.x
            @Override // er.l
            public final Object b(Object obj) {
                return b0.X9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(w91.c.b.class), new er.l() { // from class: w91.y
            @Override // er.l
            public final Object b(Object obj) {
                return b0.Y9(this.f211427a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(w91.c.b.Presenting.class), new er.l() { // from class: w91.z
            @Override // er.l
            public final Object b(Object obj) {
                return b0.Z9(this.f211431a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(w91.c.b.InterfaceC5553b.Generating.class), new er.l() { // from class: w91.a0
            @Override // er.l
            public final Object b(Object obj) {
                return b0.aa(this.f211173a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(w91.c.b.e.Submitting.class), new er.l() { // from class: w91.n
            @Override // er.l
            public final Object b(Object obj) {
                return b0.ba(this.f211399a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(w91.c.b.InterfaceC5553b.MissingToken.class), new er.l() { // from class: w91.o
            @Override // er.l
            public final Object b(Object obj) {
                return b0.ca(this.f211402a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(w91.c.b.e.MissingToken.class), new er.l() { // from class: w91.p
            @Override // er.l
            public final Object b(Object obj) {
                return b0.da(this.f211403a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(w91.c.b.PreparingFiles.class), new er.l() { // from class: w91.t
            @Override // er.l
            public final Object b(Object obj) {
                return b0.U9(this.f211413a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(w91.c.b.UploadingFiles.class), new er.l() { // from class: w91.u
            @Override // er.l
            public final Object b(Object obj) {
                return b0.V9(this.f211416a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(b0 b0Var, k10.z zVar) {
        c cVar = b0Var.new c(null);
        zVar.x(fr.q0.c(w91.a.d.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(b0 b0Var, k10.z zVar) {
        h hVar = b0Var.new h(null);
        zVar.x(fr.q0.c(w91.a.b.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(k10.z zVar) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(w91.a.c.class), oVar, jVar);
        zVar.v(fr.q0.c(w91.a.b.class), oVar, new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(b0 b0Var, k10.z zVar) {
        l lVar = b0Var.new l(null);
        zVar.x(fr.q0.c(w91.a.C5548a.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(b0 b0Var, k10.z zVar) {
        m mVar = new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(w91.a.SetStatementStateValue.class), oVar, mVar);
        zVar.v(fr.q0.c(w91.a.j.class), oVar, b0Var.new n(null));
        zVar.v(fr.q0.c(w91.a.f.class), oVar, new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new q(null));
        r rVar = b0Var.new r(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(w91.a.SubmitXmlWithTokenUC.class), oVar, rVar);
        zVar.v(fr.q0.c(w91.a.SubmitXmlWithOnlinePaymentWithTokenUC.class), oVar, b0Var.new s(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(b0 b0Var, k10.z zVar) {
        zVar.C(b0Var.new t(null));
        u uVar = new u(null);
        zVar.v(fr.q0.c(w91.a.e.class), k10.o.CANCEL_PREVIOUS, uVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(b0 b0Var, k10.z zVar) {
        zVar.C(b0Var.new d(null));
        e eVar = new e(null);
        zVar.v(fr.q0.c(w91.a.e.class), k10.o.CANCEL_PREVIOUS, eVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<qx3.a> ea(List<? extends cl0.a> list) {
        qx3.a aVar;
        List<? extends cl0.a> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            switch (a.f211194a[((cl0.a) it.next()).ordinal()]) {
                case 1:
                    aVar = qx3.a.BLIK_T6_CODE;
                    break;
                case 2:
                    aVar = qx3.a.BLIK_ONE_CLICK;
                    break;
                case 3:
                    aVar = qx3.a.CARD;
                    break;
                case 4:
                    aVar = qx3.a.WALLET_GP;
                    break;
                case 5:
                case 6:
                    aVar = qx3.a.UNKNOWN;
                    break;
                default:
                    throw new oq.p();
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(w91.a.d dVar, tq.e<? super oq.i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<w91.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<w91.c, w91.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<w91.d.a> getState() {
        return this.state;
    }
}
