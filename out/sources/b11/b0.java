package b11;

import jk0.ExternalQualifiedSignatureAuthorizationResponse;
import jk0.ExternalQualifiedSignatureCompleteAuthorizationRequest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001SB{\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b&\u0010'J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010E\u001a\b\u0012\u0004\u0012\u00020@0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR&\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030F8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010R\u001a\b\u0012\u0004\u0012\u00020M0L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lb11/b0;", "Ll00/g;", "Lb11/o;", "Lb11/n;", "Lb11/p;", "", "Lyy/a;", "stateMachineFactory", "Lac4/d;", "getCurrentServerTimeUseCase", "Lz01/b;", "trustedProfileAuthorizeUC", "Lz01/c;", "trustedProfileCheckAuthorizationStatusUC", "Lkk0/b;", "beCheckQualifiedSignatureAuthStatusUC", "Lkk0/c;", "beCompleteQualifiedSignatureAuthUC", "Lz01/a;", "getJWSTokenForQualifiedSignatureAuthUC", "Lc11/h;", "mapper", "Lc11/d;", "dialogMapper", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "La14/w;", "openUrlIntentUseCase", "Li70/e;", "globalSnackBarManager", "Lb11/b0$a$a;", "setupData", "<init>", "(Lyy/a;Lac4/d;Lz01/b;Lz01/c;Lkk0/b;Lkk0/c;Lz01/a;Lc11/h;Lc11/d;Lib4/c;Lac4/a;La14/w;Li70/e;Lb11/b0$a$a;)V", "Lmu/g;", "", "z9", "()Lmu/g;", "Ldx/b;", "error", "actionRetry", "Loq/i0;", "A9", "(Ldx/b;Lb11/n;Ltq/e;)Ljava/lang/Object;", "b", "Lc11/h;", "c", "Lc11/d;", "d", "Lib4/c;", "e", "Lac4/a;", "f", "La14/w;", "g", "Li70/e;", "h", "Lb11/b0$a$a;", "j", "Lb11/o;", "initialState", "Lxw/b;", "Lb11/n$f;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lb11/p$a;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "a", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 extends l00.g<b11.o, b11.n> implements b11.p, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c11.h mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c11.d dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final b11.o initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<b11.n.f> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<b11.o, b11.n> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<b11.p.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lb11/b0$a;", "Lf00/j0;", "Lb11/b0$a$a;", "Lb11/b0;", "a", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<SetupData, b0> {

        /* JADX INFO: renamed from: b11.b0$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lb11/b0$a$a;", "", "Leo2/a;", "confirmationData", "<init>", "(Leo2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo2/a;", "()Leo2/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final eo2.a confirmationData;

            public SetupData(eo2.a aVar) {
                this.confirmationData = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final eo2.a getConfirmationData() {
                return this.confirmationData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetupData) && fr.t.c(this.confirmationData, ((SetupData) other).confirmationData);
            }

            public int hashCode() {
                return this.confirmationData.hashCode();
            }

            public String toString() {
                return "SetupData(confirmationData=" + this.confirmationData + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<mu.h<? super Integer>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f15900f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f15901g;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r2
          0x002b: PHI (r2v4 int) = (r2v1 int), (r2v3 int), (r2v6 int) binds: [B:10:0x0026, B:17:0x0053, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:13:0x0035  */
        /* JADX WARN: Code duplicated, block: B:16:0x0044 A[PHI: r2
          0x0044: PHI (r2v2 int) = (r2v4 int), (r2v5 int) binds: [B:14:0x0041, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f15901g
                mu.h r0 = (mu.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f15900f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                int r2 = r7.f15899e
                oq.u.b(r8)
                goto L2b
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                int r2 = r7.f15899e
                oq.u.b(r8)
                goto L44
            L26:
                oq.u.b(r8)
                r8 = 0
                r2 = r8
            L2b:
                tq.i r8 = r7.getContext()
                boolean r8 = ju.g2.n(r8)
                if (r8 == 0) goto L56
                r7.f15901g = r0
                r7.f15899e = r2
                r7.f15900f = r4
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = ju.z0.b(r5, r7)
                if (r8 != r1) goto L44
                goto L55
            L44:
                int r2 = r2 + r4
                java.lang.Integer r8 = vq.b.e(r2)
                r7.f15901g = r0
                r7.f15899e = r2
                r7.f15900f = r3
                java.lang.Object r8 = r0.F(r8, r7)
                if (r8 != r1) goto L2b
            L55:
                return r1
            L56:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: b11.b0.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super Integer> hVar, tq.e<? super oq.i0> eVar) {
            return ((b) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f15901g = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<b11.p.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f15902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f15903b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f15904a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f15905b;

            /* JADX INFO: renamed from: b11.b0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0377a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f15906d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f15907e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f15908f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f15910h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f15911j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f15912k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f15913l;

                public C0377a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f15906d = obj;
                    this.f15907e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, b0 b0Var) {
                this.f15904a = hVar;
                this.f15905b = b0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0377a c0377a;
                if (eVar instanceof C0377a) {
                    c0377a = (C0377a) eVar;
                    int i15 = c0377a.f15907e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0377a.f15907e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0377a = new C0377a(eVar);
                    }
                } else {
                    c0377a = new C0377a(eVar);
                }
                Object obj2 = c0377a.f15906d;
                Object objE = uq.b.e();
                int i16 = c0377a.f15907e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f15904a;
                    b11.p.a aVarB = this.f15905b.mapper.b(new c11.h.Params((b11.o) obj, this.f15905b.b9(b11.n.c.f16037a), this.f15905b.b9(b11.n.h.f16045a), this.f15905b.b9(b11.n.b.f16036a), this.f15905b.new d()));
                    c0377a.f15908f = vq.j.a(obj);
                    c0377a.f15910h = vq.j.a(c0377a);
                    c0377a.f15911j = vq.j.a(obj);
                    c0377a.f15912k = vq.j.a(hVar);
                    c0377a.f15913l = 0;
                    c0377a.f15907e = 1;
                    if (hVar.F(aVarB, c0377a) == objE) {
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

        public c(mu.g gVar, b0 b0Var) {
            this.f15902a = gVar;
            this.f15903b = b0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super b11.p.a> hVar, tq.e eVar) {
            Object objA = this.f15902a.a(new a(hVar, this.f15903b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.l<String, oq.i0> {
        d() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            c(str);
            return oq.i0.f148189a;
        }

        public final void c(String str) {
            b0.this.d9(new b11.n.GoToSupplier(str));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb11/n$b;", "<unused var>", "Lb11/o;", "Loq/i0;", "<anonymous>", "(Lb11/n$b;Lb11/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<b11.n.b, b11.o, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15915e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f15915e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<b11.n.f> bVarY1 = b0.this.Y1();
                b11.n.f.a aVar = b11.n.f.a.f16040a;
                this.f15915e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(b11.n.b bVar, b11.o oVar, tq.e<? super oq.i0> eVar) {
            return b0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb11/n$e;", "action", "Lb11/o;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lb11/n$e;Lb11/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<b11.n.GoToSupplier, b11.o, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15918f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b11.n.GoToSupplier goToSupplier = (b11.n.GoToSupplier) this.f15918f;
            Object objE = uq.b.e();
            int i15 = this.f15917e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = b0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(goToSupplier.getUrl(), false, 2, null);
                this.f15918f = vq.j.a(goToSupplier);
                this.f15917e = 1;
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
            b0 b0Var = b0.this;
            if (iVar instanceof dx.i.Right) {
                b0Var.d9(b11.n.b.f16036a);
            }
            b0 b0Var2 = b0.this;
            if (iVar instanceof dx.i.Left) {
                b0Var2.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                b0Var2.d9(b11.n.b.f16036a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b11.n.GoToSupplier goToSupplier, b11.o oVar, tq.e<? super oq.i0> eVar) {
            f fVar = b0.this.new f(eVar);
            fVar.f15918f = goToSupplier;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb11/o$d;", "it", "Loq/i0;", "<anonymous>", "(Lb11/o$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<b11.o.CheckTrustedProfileAuthStatus, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15920e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f15920e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(b11.n.a.f16035a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(b11.o.CheckTrustedProfileAuthStatus checkTrustedProfileAuthStatus, tq.e<? super oq.i0> eVar) {
            return ((g) v(checkTrustedProfileAuthStatus, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b0.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb11/n$a;", "action", "Lk10/c0;", "Lb11/o$d;", "state", "Lk10/l;", "Lb11/o;", "<anonymous>", "(Lb11/n$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<b11.n.a, k10.c0<b11.o.CheckTrustedProfileAuthStatus>, tq.e<? super k10.l<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15923f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f15924g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15925h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f15926j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f15927k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f15928l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ z01.c f15929m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ b0 f15930n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ac4.d f15931p;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15932a;

            static {
                int[] iArr = new int[z01.c.b.values().length];
                try {
                    iArr[z01.c.b.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[z01.c.b.CONFIRMED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[z01.c.b.REJECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[z01.c.b.EXPIRED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f15932a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(z01.c cVar, b0 b0Var, ac4.d dVar, tq.e<? super h> eVar) {
            super(3, eVar);
            this.f15929m = cVar;
            this.f15930n = b0Var;
            this.f15931p = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.TrustedProfileAuth Z(k10.c0 c0Var, long j15, long j16, b11.o.CheckTrustedProfileAuthStatus checkTrustedProfileAuthStatus) {
            return new b11.o.TrustedProfileAuth(((b11.o.CheckTrustedProfileAuthStatus) c0Var.a()).getData(), j15, j16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.TimeExpired a0(k10.c0 c0Var, b11.o.CheckTrustedProfileAuthStatus checkTrustedProfileAuthStatus) {
            return new b11.o.TimeExpired(((b11.o.CheckTrustedProfileAuthStatus) c0Var.a()).getData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.AlreadyConfirmed b0(k10.c0 c0Var, b11.o.CheckTrustedProfileAuthStatus checkTrustedProfileAuthStatus) {
            return new b11.o.AlreadyConfirmed(((b11.o.CheckTrustedProfileAuthStatus) c0Var.a()).getData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.AlreadyRejected c0(k10.c0 c0Var, b11.o.CheckTrustedProfileAuthStatus checkTrustedProfileAuthStatus) {
            return new b11.o.AlreadyRejected(((b11.o.CheckTrustedProfileAuthStatus) c0Var.a()).getData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.TimeExpired d0(k10.c0 c0Var, b11.o.CheckTrustedProfileAuthStatus checkTrustedProfileAuthStatus) {
            return new b11.o.TimeExpired(((b11.o.CheckTrustedProfileAuthStatus) c0Var.a()).getData());
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
        
            if (r2.A9(r5, r0, r8) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b11.b0.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final Object w(b11.n.a aVar, k10.c0<b11.o.CheckTrustedProfileAuthStatus> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            h hVar = new h(this.f15929m, this.f15930n, this.f15931p, eVar);
            hVar.f15927k = aVar;
            hVar.f15928l = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb11/o$c;", "it", "Loq/i0;", "<anonymous>", "(Lb11/o$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<b11.o.CheckQualifiedSignatureAuthStatus, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15933e;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f15933e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(b11.n.a.f16035a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(b11.o.CheckQualifiedSignatureAuthStatus checkQualifiedSignatureAuthStatus, tq.e<? super oq.i0> eVar) {
            return ((i) v(checkQualifiedSignatureAuthStatus, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b0.this.new i(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb11/n$a;", "action", "Lk10/c0;", "Lb11/o$c;", "state", "Lk10/l;", "Lb11/o;", "<anonymous>", "(Lb11/n$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<b11.n.a, k10.c0<b11.o.CheckQualifiedSignatureAuthStatus>, tq.e<? super k10.l<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15936f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f15937g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15938h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f15939j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f15940k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f15941l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ kk0.b f15942m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ b0 f15943n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ac4.d f15944p;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15945a;

            static {
                int[] iArr = new int[kk0.b.EnumC2687b.values().length];
                try {
                    iArr[kk0.b.EnumC2687b.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kk0.b.EnumC2687b.CONFIRMED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kk0.b.EnumC2687b.REJECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[kk0.b.EnumC2687b.EXPIRED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f15945a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(kk0.b bVar, b0 b0Var, ac4.d dVar, tq.e<? super j> eVar) {
            super(3, eVar);
            this.f15942m = bVar;
            this.f15943n = b0Var;
            this.f15944p = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.QualifiedSignatureAuth Z(k10.c0 c0Var, long j15, long j16, b11.o.CheckQualifiedSignatureAuthStatus checkQualifiedSignatureAuthStatus) {
            return new b11.o.QualifiedSignatureAuth(((b11.o.CheckQualifiedSignatureAuthStatus) c0Var.a()).getData(), j15, j16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.TimeExpired a0(k10.c0 c0Var, b11.o.CheckQualifiedSignatureAuthStatus checkQualifiedSignatureAuthStatus) {
            return new b11.o.TimeExpired(((b11.o.CheckQualifiedSignatureAuthStatus) c0Var.a()).getData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.AlreadyConfirmed b0(k10.c0 c0Var, b11.o.CheckQualifiedSignatureAuthStatus checkQualifiedSignatureAuthStatus) {
            return new b11.o.AlreadyConfirmed(((b11.o.CheckQualifiedSignatureAuthStatus) c0Var.a()).getData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.AlreadyRejected c0(k10.c0 c0Var, b11.o.CheckQualifiedSignatureAuthStatus checkQualifiedSignatureAuthStatus) {
            return new b11.o.AlreadyRejected(((b11.o.CheckQualifiedSignatureAuthStatus) c0Var.a()).getData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.TimeExpired d0(k10.c0 c0Var, b11.o.CheckQualifiedSignatureAuthStatus checkQualifiedSignatureAuthStatus) {
            return new b11.o.TimeExpired(((b11.o.CheckQualifiedSignatureAuthStatus) c0Var.a()).getData());
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
        
            if (r2.A9(r5, r0, r8) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 338
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b11.b0.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final Object w(b11.n.a aVar, k10.c0<b11.o.CheckQualifiedSignatureAuthStatus> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            j jVar = new j(this.f15942m, this.f15943n, this.f15944p, eVar);
            jVar.f15940k = aVar;
            jVar.f15941l = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<unused var>", "Lk10/c0;", "Lb11/o$k;", "state", "Lk10/l;", "Lb11/o;", "<anonymous>", "(ILk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<Integer, k10.c0<b11.o.TrustedProfileAuth>, tq.e<? super k10.l<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15946e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15947f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.TrustedProfileAuth O(b11.o.TrustedProfileAuth trustedProfileAuth) {
            return b11.o.TrustedProfileAuth.b(trustedProfileAuth, null, trustedProfileAuth.getRemainingTimeInSeconds() - 1, 0L, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f15947f;
            uq.b.e();
            if (this.f15946e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: b11.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.k.O((o.TrustedProfileAuth) obj2);
                }
            });
        }

        public final Object N(int i15, k10.c0<b11.o.TrustedProfileAuth> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            k kVar = new k(eVar);
            kVar.f15947f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Integer num, k10.c0<b11.o.TrustedProfileAuth> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            return N(num.intValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb11/o$k;", "it", "Loq/i0;", "<anonymous>", "(Lb11/o$k;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<b11.o.TrustedProfileAuth, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15948e;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f15948e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(b11.n.i.f16046a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(b11.o.TrustedProfileAuth trustedProfileAuth, tq.e<? super oq.i0> eVar) {
            return ((l) v(trustedProfileAuth, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b0.this.new l(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb11/n$g;", "action", "Lk10/c0;", "Lb11/o$k;", "state", "Lk10/l;", "Lb11/o;", "<anonymous>", "(Lb11/n$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<b11.n.g, k10.c0<b11.o.TrustedProfileAuth>, tq.e<? super k10.l<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15951f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f15952g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15953h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f15954j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f15955k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f15956l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ z01.b f15957m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ b0 f15958n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(z01.b bVar, b0 b0Var, tq.e<? super m> eVar) {
            super(3, eVar);
            this.f15957m = bVar;
            this.f15958n = b0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.i O(b11.o.TrustedProfileAuth trustedProfileAuth) {
            return b11.o.i.f16057a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
        
            if (r3.A9(r5, r0, r8) == r2) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f15955k
                b11.n$g r0 = (b11.n.g) r0
                java.lang.Object r1 = r8.f15956l
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r8.f15954j
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2e
                if (r3 == r5) goto L2a
                if (r3 != r4) goto L22
                java.lang.Object r0 = r8.f15951f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r8.f15950e
                dx.i r0 = (dx.i) r0
                oq.u.b(r9)
                goto L88
            L22:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2a:
                oq.u.b(r9)
                goto L55
            L2e:
                oq.u.b(r9)
                z01.b r9 = r8.f15957m
                z01.b$a r3 = new z01.b$a
                y01.a r6 = y01.a.REJECT
                java.lang.Object r7 = r1.a()
                b11.o$k r7 = (b11.o.TrustedProfileAuth) r7
                eo2.a$b r7 = r7.getData()
                java.lang.String r7 = r7.getAuthorizationId()
                r3.<init>(r6, r7)
                r8.f15955k = r0
                r8.f15956l = r1
                r8.f15954j = r5
                java.lang.Object r9 = r9.h(r3, r8)
                if (r9 != r2) goto L55
                goto L87
            L55:
                dx.i r9 = (dx.i) r9
                b11.b0 r3 = r8.f15958n
                boolean r5 = r9 instanceof dx.i.Left
                if (r5 == 0) goto L8d
                r5 = r9
                dx.i$b r5 = (dx.i.Left) r5
                java.lang.Object r5 = r5.b()
                dx.b r5 = (dx.b) r5
                java.lang.Object r6 = vq.j.a(r0)
                r8.f15955k = r6
                r8.f15956l = r1
                java.lang.Object r9 = vq.j.a(r9)
                r8.f15950e = r9
                java.lang.Object r9 = vq.j.a(r5)
                r8.f15951f = r9
                r9 = 0
                r8.f15952g = r9
                r8.f15953h = r9
                r8.f15954j = r4
                java.lang.Object r9 = b11.b0.y9(r3, r5, r0, r8)
                if (r9 != r2) goto L88
            L87:
                return r2
            L88:
                k10.l r9 = r1.c()
                return r9
            L8d:
                boolean r0 = r9 instanceof dx.i.Right
                if (r0 == 0) goto La3
                dx.i$c r9 = (dx.i.Right) r9
                java.lang.Object r9 = r9.b()
                oq.i0 r9 = (oq.i0) r9
                b11.n0 r9 = new b11.n0
                r9.<init>()
                k10.l r9 = r1.d(r9)
                return r9
            La3:
                oq.p r9 = new oq.p
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: b11.b0.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(b11.n.g gVar, k10.c0<b11.o.TrustedProfileAuth> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            m mVar = new m(this.f15957m, this.f15958n, eVar);
            mVar.f15955k = gVar;
            mVar.f15956l = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb11/n$c;", "action", "Lk10/c0;", "Lb11/o$k;", "state", "Lk10/l;", "Lb11/o;", "<anonymous>", "(Lb11/n$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<b11.n.c, k10.c0<b11.o.TrustedProfileAuth>, tq.e<? super k10.l<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f15961g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15962h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f15963j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f15964k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f15965l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ z01.b f15966m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ b0 f15967n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(z01.b bVar, b0 b0Var, tq.e<? super n> eVar) {
            super(3, eVar);
            this.f15966m = bVar;
            this.f15967n = b0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.e O(b11.o.TrustedProfileAuth trustedProfileAuth) {
            return b11.o.e.f16051a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
        
            if (r3.A9(r5, r0, r8) == r2) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f15964k
                b11.n$c r0 = (b11.n.c) r0
                java.lang.Object r1 = r8.f15965l
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r8.f15963j
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2e
                if (r3 == r5) goto L2a
                if (r3 != r4) goto L22
                java.lang.Object r0 = r8.f15960f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r8.f15959e
                dx.i r0 = (dx.i) r0
                oq.u.b(r9)
                goto L88
            L22:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2a:
                oq.u.b(r9)
                goto L55
            L2e:
                oq.u.b(r9)
                z01.b r9 = r8.f15966m
                z01.b$a r3 = new z01.b$a
                y01.a r6 = y01.a.CONFIRM
                java.lang.Object r7 = r1.a()
                b11.o$k r7 = (b11.o.TrustedProfileAuth) r7
                eo2.a$b r7 = r7.getData()
                java.lang.String r7 = r7.getAuthorizationId()
                r3.<init>(r6, r7)
                r8.f15964k = r0
                r8.f15965l = r1
                r8.f15963j = r5
                java.lang.Object r9 = r9.h(r3, r8)
                if (r9 != r2) goto L55
                goto L87
            L55:
                dx.i r9 = (dx.i) r9
                b11.b0 r3 = r8.f15967n
                boolean r5 = r9 instanceof dx.i.Left
                if (r5 == 0) goto L8d
                r5 = r9
                dx.i$b r5 = (dx.i.Left) r5
                java.lang.Object r5 = r5.b()
                dx.b r5 = (dx.b) r5
                java.lang.Object r6 = vq.j.a(r0)
                r8.f15964k = r6
                r8.f15965l = r1
                java.lang.Object r9 = vq.j.a(r9)
                r8.f15959e = r9
                java.lang.Object r9 = vq.j.a(r5)
                r8.f15960f = r9
                r9 = 0
                r8.f15961g = r9
                r8.f15962h = r9
                r8.f15963j = r4
                java.lang.Object r9 = b11.b0.y9(r3, r5, r0, r8)
                if (r9 != r2) goto L88
            L87:
                return r2
            L88:
                k10.l r9 = r1.c()
                return r9
            L8d:
                boolean r0 = r9 instanceof dx.i.Right
                if (r0 == 0) goto La3
                dx.i$c r9 = (dx.i.Right) r9
                java.lang.Object r9 = r9.b()
                oq.i0 r9 = (oq.i0) r9
                b11.o0 r9 = new b11.o0
                r9.<init>()
                k10.l r9 = r1.d(r9)
                return r9
            La3:
                oq.p r9 = new oq.p
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: b11.b0.n.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(b11.n.c cVar, k10.c0<b11.o.TrustedProfileAuth> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            n nVar = new n(this.f15966m, this.f15967n, eVar);
            nVar.f15964k = cVar;
            nVar.f15965l = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb11/n$i;", "<unused var>", "Lk10/c0;", "Lb11/o$k;", "state", "Lk10/l;", "Lb11/o;", "<anonymous>", "(Lb11/n$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<b11.n.i, k10.c0<b11.o.TrustedProfileAuth>, tq.e<? super k10.l<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15969f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.TimeExpired O(k10.c0 c0Var, b11.o.TrustedProfileAuth trustedProfileAuth) {
            return new b11.o.TimeExpired(((b11.o.TrustedProfileAuth) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f15969f;
            uq.b.e();
            if (this.f15968e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: b11.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.o.O(c0Var, (o.TrustedProfileAuth) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(b11.n.i iVar, k10.c0<b11.o.TrustedProfileAuth> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            o oVar = new o(eVar);
            oVar.f15969f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb11/n$h;", "<unused var>", "Lk10/c0;", "Lb11/o$k;", "state", "Lk10/l;", "Lb11/o;", "<anonymous>", "(Lb11/n$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<b11.n.h, k10.c0<b11.o.TrustedProfileAuth>, tq.e<? super k10.l<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15971f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f15971f;
            Object objE = uq.b.e();
            int i15 = this.f15970e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<b11.n.f> bVarY1 = b0.this.Y1();
                b11.n.f.ShowNavigationDialog showNavigationDialog = new b11.n.f.ShowNavigationDialog(b0.this.dialogMapper.b(new c11.d.Params(b0.this.b9(b11.n.g.f16044a))));
                this.f15971f = c0Var;
                this.f15970e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b11.n.h hVar, k10.c0<b11.o.TrustedProfileAuth> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            p pVar = b0.this.new p(eVar);
            pVar.f15971f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<unused var>", "Lk10/c0;", "Lb11/o$f;", "state", "Lk10/l;", "Lb11/o;", "<anonymous>", "(ILk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<Integer, k10.c0<b11.o.QualifiedSignatureAuth>, tq.e<? super k10.l<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15974f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.QualifiedSignatureAuth O(b11.o.QualifiedSignatureAuth qualifiedSignatureAuth) {
            return b11.o.QualifiedSignatureAuth.b(qualifiedSignatureAuth, null, qualifiedSignatureAuth.getRemainingTimeInSeconds() - 1, 0L, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f15974f;
            uq.b.e();
            if (this.f15973e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: b11.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.q.O((o.QualifiedSignatureAuth) obj2);
                }
            });
        }

        public final Object N(int i15, k10.c0<b11.o.QualifiedSignatureAuth> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            q qVar = new q(eVar);
            qVar.f15974f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Integer num, k10.c0<b11.o.QualifiedSignatureAuth> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            return N(num.intValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb11/o$f;", "it", "Loq/i0;", "<anonymous>", "(Lb11/o$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.p<b11.o.QualifiedSignatureAuth, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15975e;

        r(tq.e<? super r> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f15975e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(b11.n.i.f16046a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(b11.o.QualifiedSignatureAuth qualifiedSignatureAuth, tq.e<? super oq.i0> eVar) {
            return ((r) v(qualifiedSignatureAuth, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b0.this.new r(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb11/n$g;", "action", "Lb11/o$f;", "state", "Loq/i0;", "<anonymous>", "(Lb11/n$g;Lb11/o$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<b11.n.g, b11.o.QualifiedSignatureAuth, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15977e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f15977e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(new b11.n.CreateJWSAndCompleteSignatureQualifiedAuth(jk0.c.REJECT));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b11.n.g gVar, b11.o.QualifiedSignatureAuth qualifiedSignatureAuth, tq.e<? super oq.i0> eVar) {
            return b0.this.new s(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb11/n$c;", "action", "Lb11/o$f;", "state", "Loq/i0;", "<anonymous>", "(Lb11/n$c;Lb11/o$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<b11.n.c, b11.o.QualifiedSignatureAuth, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15979e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f15979e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(new b11.n.CreateJWSAndCompleteSignatureQualifiedAuth(jk0.c.CONFIRM));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b11.n.c cVar, b11.o.QualifiedSignatureAuth qualifiedSignatureAuth, tq.e<? super oq.i0> eVar) {
            return b0.this.new t(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb11/n$d;", "action", "Lk10/c0;", "Lb11/o$f;", "state", "Lk10/l;", "Lb11/o;", "<anonymous>", "(Lb11/n$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<b11.n.CreateJWSAndCompleteSignatureQualifiedAuth, k10.c0<b11.o.QualifiedSignatureAuth>, tq.e<? super k10.l<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15982f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f15983g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ z01.a f15985j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ kk0.c f15986k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lb11/o;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends b11.o>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f15987e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f15988f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f15989g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f15990h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f15991j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f15992k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f15993l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f15994m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f15995n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f15996p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ z01.a f15997q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ k10.c0<b11.o.QualifiedSignatureAuth> f15998r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b11.n.CreateJWSAndCompleteSignatureQualifiedAuth f15999s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ b0 f16000t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ kk0.c f16001v;

            /* JADX INFO: renamed from: b11.b0$u$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C0378a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f16002a;

                static {
                    int[] iArr = new int[jk0.c.values().length];
                    try {
                        iArr[jk0.c.CONFIRM.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[jk0.c.REJECT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f16002a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z01.a aVar, k10.c0<b11.o.QualifiedSignatureAuth> c0Var, b11.n.CreateJWSAndCompleteSignatureQualifiedAuth createJWSAndCompleteSignatureQualifiedAuth, b0 b0Var, kk0.c cVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f15997q = aVar;
                this.f15998r = c0Var;
                this.f15999s = createJWSAndCompleteSignatureQualifiedAuth;
                this.f16000t = b0Var;
                this.f16001v = cVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final b11.o V(b11.n.CreateJWSAndCompleteSignatureQualifiedAuth createJWSAndCompleteSignatureQualifiedAuth, ExternalQualifiedSignatureAuthorizationResponse externalQualifiedSignatureAuthorizationResponse, b11.o.QualifiedSignatureAuth qualifiedSignatureAuth) {
                int i15 = C0378a.f16002a[createJWSAndCompleteSignatureQualifiedAuth.getConfirmAction().ordinal()];
                if (i15 == 1) {
                    return new b11.o.QualifiedSignatureConfirmedSuccess(externalQualifiedSignatureAuthorizationResponse.getRedirectUrl());
                }
                if (i15 == 2) {
                    return new b11.o.QualifiedSignatureRejectedSuccess(externalQualifiedSignatureAuthorizationResponse.getRedirectUrl());
                }
                throw new oq.p();
            }

            /* JADX WARN: Code duplicated, block: B:33:0x0159  */
            /* JADX WARN: Code duplicated, block: B:36:0x018d  */
            /* JADX WARN: Code duplicated, block: B:39:0x0193  */
            /* JADX WARN: Code duplicated, block: B:41:0x0197  */
            /* JADX WARN: Code duplicated, block: B:43:0x01a9  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                b0 b0Var;
                final b11.n.CreateJWSAndCompleteSignatureQualifiedAuth createJWSAndCompleteSignatureQualifiedAuth;
                iy.b0 b0Var2;
                k10.c0<b11.o.QualifiedSignatureAuth> c0Var;
                int i15;
                int i16;
                k10.c0<b11.o.QualifiedSignatureAuth> c0Var2;
                dx.i iVar2;
                dx.b bVar;
                k10.c0<b11.o.QualifiedSignatureAuth> c0Var3;
                Object objE = uq.b.e();
                int i17 = this.f15996p;
                if (i17 == 0) {
                    oq.u.b(obj);
                    z01.a aVar = this.f15997q;
                    z01.a.Params params = new z01.a.Params(pq.v0.l(oq.y.a("processId", this.f15998r.a().getData().getProcessId()), oq.y.a("authorizationId", this.f15998r.a().getData().getAuthorizationId()), oq.y.a("action", this.f15999s.getConfirmAction().name())), gu.d.r(this.f15998r.a().getData().getExpirationDateTime().toEpochSecond(), gu.e.SECONDS), null);
                    this.f15996p = 1;
                    obj = aVar.d(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i17 != 1) {
                    if (i17 == 2) {
                        c0Var2 = (k10.c0) this.f15988f;
                        oq.u.b(obj);
                        return c0Var2.c();
                    }
                    if (i17 == 3) {
                        i15 = this.f15993l;
                        i16 = this.f15992k;
                        b0Var2 = (iy.b0) this.f15991j;
                        c0Var = (k10.c0) this.f15990h;
                        b0Var = (b0) this.f15989g;
                        createJWSAndCompleteSignatureQualifiedAuth = (b11.n.CreateJWSAndCompleteSignatureQualifiedAuth) this.f15988f;
                        iVar = (dx.i) this.f15987e;
                        oq.u.b(obj);
                        iVar2 = (dx.i) obj;
                        if (iVar2 instanceof dx.i.Left) {
                            if (iVar2 instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            final ExternalQualifiedSignatureAuthorizationResponse externalQualifiedSignatureAuthorizationResponse = (ExternalQualifiedSignatureAuthorizationResponse) ((dx.i.Right) iVar2).b();
                            return c0Var.d(new er.l() { // from class: b11.r0
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return b0.u.a.V(createJWSAndCompleteSignatureQualifiedAuth, externalQualifiedSignatureAuthorizationResponse, (o.QualifiedSignatureAuth) obj2);
                                }
                            });
                        }
                        bVar = (dx.b) ((dx.i.Left) iVar2).b();
                        this.f15987e = vq.j.a(iVar);
                        this.f15988f = c0Var;
                        this.f15989g = vq.j.a(b0Var2);
                        this.f15990h = vq.j.a(iVar2);
                        this.f15991j = vq.j.a(bVar);
                        this.f15992k = i16;
                        this.f15993l = i15;
                        this.f15994m = 0;
                        this.f15995n = 0;
                        this.f15996p = 4;
                        if (b0Var.A9(bVar, createJWSAndCompleteSignatureQualifiedAuth, this) != objE) {
                            c0Var3 = c0Var;
                        }
                        return objE;
                    }
                    if (i17 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var3 = (k10.c0) this.f15988f;
                    oq.u.b(obj);
                    return c0Var3.c();
                }
                oq.u.b(obj);
                iVar = (dx.i) obj;
                b0Var = this.f16000t;
                createJWSAndCompleteSignatureQualifiedAuth = this.f15999s;
                k10.c0<b11.o.QualifiedSignatureAuth> c0Var4 = this.f15998r;
                kk0.c cVar = this.f16001v;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    this.f15987e = vq.j.a(iVar);
                    this.f15988f = c0Var4;
                    this.f15989g = vq.j.a(bVar2);
                    this.f15992k = 0;
                    this.f15993l = 0;
                    this.f15996p = 2;
                    if (b0Var.A9(bVar2, createJWSAndCompleteSignatureQualifiedAuth, this) != objE) {
                        c0Var2 = c0Var4;
                        return c0Var2.c();
                    }
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    b0Var2 = (iy.b0) ((dx.i.Right) iVar).b();
                    kk0.c.Params params2 = new kk0.c.Params(createJWSAndCompleteSignatureQualifiedAuth.getConfirmAction(), new ExternalQualifiedSignatureCompleteAuthorizationRequest(b0Var2));
                    this.f15987e = vq.j.a(iVar);
                    this.f15988f = createJWSAndCompleteSignatureQualifiedAuth;
                    this.f15989g = b0Var;
                    this.f15990h = c0Var4;
                    this.f15991j = vq.j.a(b0Var2);
                    this.f15992k = 0;
                    this.f15993l = 0;
                    this.f15996p = 3;
                    Object objC = cVar.c(params2, this);
                    if (objC != objE) {
                        c0Var = c0Var4;
                        obj = objC;
                        i15 = 0;
                        i16 = 0;
                        iVar2 = (dx.i) obj;
                        if (iVar2 instanceof dx.i.Left) {
                            if (iVar2 instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            final ExternalQualifiedSignatureAuthorizationResponse externalQualifiedSignatureAuthorizationResponse2 = (ExternalQualifiedSignatureAuthorizationResponse) ((dx.i.Right) iVar2).b();
                            return c0Var.d(new er.l() { // from class: b11.r0
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return b0.u.a.V(createJWSAndCompleteSignatureQualifiedAuth, externalQualifiedSignatureAuthorizationResponse2, (o.QualifiedSignatureAuth) obj2);
                                }
                            });
                        }
                        bVar = (dx.b) ((dx.i.Left) iVar2).b();
                        this.f15987e = vq.j.a(iVar);
                        this.f15988f = c0Var;
                        this.f15989g = vq.j.a(b0Var2);
                        this.f15990h = vq.j.a(iVar2);
                        this.f15991j = vq.j.a(bVar);
                        this.f15992k = i16;
                        this.f15993l = i15;
                        this.f15994m = 0;
                        this.f15995n = 0;
                        this.f15996p = 4;
                        if (b0Var.A9(bVar, createJWSAndCompleteSignatureQualifiedAuth, this) != objE) {
                            c0Var3 = c0Var;
                            return c0Var3.c();
                        }
                    }
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f15997q, this.f15998r, this.f15999s, this.f16000t, this.f16001v, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends b11.o>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(z01.a aVar, kk0.c cVar, tq.e<? super u> eVar) {
            super(3, eVar);
            this.f15985j = aVar;
            this.f15986k = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b11.n.CreateJWSAndCompleteSignatureQualifiedAuth createJWSAndCompleteSignatureQualifiedAuth = (b11.n.CreateJWSAndCompleteSignatureQualifiedAuth) this.f15982f;
            k10.c0 c0Var = (k10.c0) this.f15983g;
            Object objE = uq.b.e();
            int i15 = this.f15981e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = b0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(this.f15985j, c0Var, createJWSAndCompleteSignatureQualifiedAuth, b0.this, this.f15986k, null);
            this.f15982f = vq.j.a(createJWSAndCompleteSignatureQualifiedAuth);
            this.f15983g = vq.j.a(c0Var);
            this.f15981e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b11.n.CreateJWSAndCompleteSignatureQualifiedAuth createJWSAndCompleteSignatureQualifiedAuth, k10.c0<b11.o.QualifiedSignatureAuth> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            u uVar = b0.this.new u(this.f15985j, this.f15986k, eVar);
            uVar.f15982f = createJWSAndCompleteSignatureQualifiedAuth;
            uVar.f15983g = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb11/n$i;", "<unused var>", "Lk10/c0;", "Lb11/o$f;", "state", "Lk10/l;", "Lb11/o;", "<anonymous>", "(Lb11/n$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<b11.n.i, k10.c0<b11.o.QualifiedSignatureAuth>, tq.e<? super k10.l<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16004f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b11.o.TimeExpired O(k10.c0 c0Var, b11.o.QualifiedSignatureAuth qualifiedSignatureAuth) {
            return new b11.o.TimeExpired(((b11.o.QualifiedSignatureAuth) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f16004f;
            uq.b.e();
            if (this.f16003e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: b11.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.v.O(c0Var, (o.QualifiedSignatureAuth) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(b11.n.i iVar, k10.c0<b11.o.QualifiedSignatureAuth> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            v vVar = new v(eVar);
            vVar.f16004f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb11/n$h;", "<unused var>", "Lk10/c0;", "Lb11/o$f;", "state", "Lk10/l;", "Lb11/o;", "<anonymous>", "(Lb11/n$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<b11.n.h, k10.c0<b11.o.QualifiedSignatureAuth>, tq.e<? super k10.l<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16006f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f16006f;
            Object objE = uq.b.e();
            int i15 = this.f16005e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<b11.n.f> bVarY1 = b0.this.Y1();
                b11.n.f.ShowNavigationDialog showNavigationDialog = new b11.n.f.ShowNavigationDialog(b0.this.dialogMapper.b(new c11.d.Params(b0.this.b9(b11.n.g.f16044a))));
                this.f16006f = c0Var;
                this.f16005e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(b11.n.h hVar, k10.c0<b11.o.QualifiedSignatureAuth> c0Var, tq.e<? super k10.l<? extends b11.o>> eVar) {
            w wVar = b0.this.new w(eVar);
            wVar.f16006f = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    public b0(yy.a aVar, final ac4.d dVar, final z01.b bVar, final z01.c cVar, final kk0.b bVar2, final kk0.c cVar2, final z01.a aVar2, c11.h hVar, c11.d dVar2, ib4.c cVar3, ac4.a aVar3, a14.w wVar, i70.e eVar, a.SetupData setupData) {
        b11.o checkTrustedProfileAuthStatus;
        this.mapper = hVar;
        this.dialogMapper = dVar2;
        this.genericDomainErrorMapper = cVar3;
        this.callActionWithLoaderUseCase = aVar3;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.setupData = setupData;
        eo2.a confirmationData = setupData.getConfirmationData();
        if (confirmationData instanceof eo2.a.QualifiedSignatureConfirmationData) {
            checkTrustedProfileAuthStatus = new b11.o.CheckQualifiedSignatureAuthStatus((eo2.a.QualifiedSignatureConfirmationData) confirmationData);
        } else {
            if (!(confirmationData instanceof eo2.a.TrustedProfileConfirmationData)) {
                throw new oq.p();
            }
            checkTrustedProfileAuthStatus = new b11.o.CheckTrustedProfileAuthStatus((eo2.a.TrustedProfileConfirmationData) confirmationData);
        }
        b11.o oVar = checkTrustedProfileAuthStatus;
        this.initialState = oVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(oVar, new er.l() { // from class: b11.r
            @Override // er.l
            public final Object b(Object obj) {
                return b0.D9(this.f16089a, cVar, dVar, bVar2, bVar, aVar2, cVar2, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), b11.p.a.C0379a.f16062a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A9(dx.b bVar, final b11.n nVar, tq.e<? super oq.i0> eVar) {
        Object objF = Y1().F(new b11.n.f.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: b11.a0
            @Override // er.l
            public final Object b(Object obj) {
                return b0.B9(this.f15884a, nVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(b0 b0Var, b11.n nVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            b0Var.d9(b11.n.b.f16036a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            b0Var.d9(nVar);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(final b0 b0Var, final z01.c cVar, final ac4.d dVar, final kk0.b bVar, final z01.b bVar2, final z01.a aVar, final kk0.c cVar2, k10.v vVar) {
        vVar.c(fr.q0.c(b11.o.class), new er.l() { // from class: b11.q
            @Override // er.l
            public final Object b(Object obj) {
                return b0.E9(this.f16088a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(b11.o.CheckTrustedProfileAuthStatus.class), new er.l() { // from class: b11.s
            @Override // er.l
            public final Object b(Object obj) {
                return b0.F9(this.f16098a, cVar, dVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(b11.o.CheckQualifiedSignatureAuthStatus.class), new er.l() { // from class: b11.t
            @Override // er.l
            public final Object b(Object obj) {
                return b0.G9(this.f16102a, bVar, dVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(b11.o.TrustedProfileAuth.class), new er.l() { // from class: b11.u
            @Override // er.l
            public final Object b(Object obj) {
                return b0.H9(this.f16105a, bVar2, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(b11.o.QualifiedSignatureAuth.class), new er.l() { // from class: b11.v
            @Override // er.l
            public final Object b(Object obj) {
                return b0.K9(this.f16108a, aVar, cVar2, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(b0 b0Var, k10.z zVar) {
        e eVar = b0Var.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(b11.n.b.class), oVar, eVar);
        zVar.x(fr.q0.c(b11.n.GoToSupplier.class), oVar, b0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(b0 b0Var, z01.c cVar, ac4.d dVar, k10.z zVar) {
        zVar.C(b0Var.new g(null));
        h hVar = new h(cVar, b0Var, dVar, null);
        zVar.v(fr.q0.c(b11.n.a.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(b0 b0Var, kk0.b bVar, ac4.d dVar, k10.z zVar) {
        zVar.C(b0Var.new i(null));
        j jVar = new j(bVar, b0Var, dVar, null);
        zVar.v(fr.q0.c(b11.n.a.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(final b0 b0Var, z01.b bVar, k10.z zVar) {
        k10.k.m(zVar, b0Var.z9(), null, new k(null), 2, null);
        zVar.L(new er.l() { // from class: b11.y
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(b0.I9((o.TrustedProfileAuth) obj));
            }
        }, new er.l() { // from class: b11.z
            @Override // er.l
            public final Object b(Object obj) {
                return b0.J9(this.f16115a, (k10.m) obj);
            }
        });
        m mVar = new m(bVar, b0Var, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(b11.n.g.class), oVar, mVar);
        zVar.v(fr.q0.c(b11.n.c.class), oVar, new n(bVar, b0Var, null));
        zVar.v(fr.q0.c(b11.n.i.class), oVar, new o(null));
        zVar.v(fr.q0.c(b11.n.h.class), oVar, b0Var.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I9(b11.o.TrustedProfileAuth trustedProfileAuth) {
        return trustedProfileAuth.getRemainingTimeInSeconds() <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(b0 b0Var, k10.m mVar) {
        mVar.C(b0Var.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(final b0 b0Var, z01.a aVar, kk0.c cVar, k10.z zVar) {
        k10.k.m(zVar, b0Var.z9(), null, new q(null), 2, null);
        zVar.L(new er.l() { // from class: b11.w
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(b0.L9((o.QualifiedSignatureAuth) obj));
            }
        }, new er.l() { // from class: b11.x
            @Override // er.l
            public final Object b(Object obj) {
                return b0.M9(this.f16112a, (k10.m) obj);
            }
        });
        s sVar = b0Var.new s(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(b11.n.g.class), oVar, sVar);
        zVar.x(fr.q0.c(b11.n.c.class), oVar, b0Var.new t(null));
        zVar.v(fr.q0.c(b11.n.CreateJWSAndCompleteSignatureQualifiedAuth.class), oVar, b0Var.new u(aVar, cVar, null));
        zVar.v(fr.q0.c(b11.n.i.class), oVar, new v(null));
        zVar.v(fr.q0.c(b11.n.h.class), oVar, b0Var.new w(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L9(b11.o.QualifiedSignatureAuth qualifiedSignatureAuth) {
        return qualifiedSignatureAuth.getRemainingTimeInSeconds() <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(b0 b0Var, k10.m mVar) {
        mVar.C(b0Var.new r(null));
        return oq.i0.f148189a;
    }

    private final mu.g<Integer> z9() {
        return mu.i.I(new b(null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(eo2.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<b11.n.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<b11.o, b11.n> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<b11.p.a> getState() {
        return this.state;
    }
}
