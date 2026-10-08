package dp3;

import android.graphics.Bitmap;
import co3.s;
import dn0.VerificationResponse;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001JBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010B\u001a\b\u0012\u0004\u0012\u00020=0<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010!\u001a\b\u0012\u0004\u0012\u00020D0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Ldp3/n;", "Ll00/g;", "Ldp3/b;", "Ldp3/a;", "Ldp3/c;", "", "Lyy/a;", "stateMachineFactory", "Lfp3/o;", "verificationDetailsScreenMapper", "Lgo3/f;", "getDecryptedVerifiedPersonDataUseCase", "Lib4/c;", "domainErrorMapper", "Lb00/c;", "imageConverter", "Lf01/b;", "launchNativeRatingUC", "Ldn0/d;", "verificationResponse", "<init>", "(Lyy/a;Lfp3/o;Lgo3/f;Lib4/c;Lb00/c;Lf01/b;Ldn0/d;)V", "Lmu/g;", "", "r9", "()Lmu/g;", "Ldx/b;", "domainError", "Loq/i0;", "u9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lk10/c0;", "Ldp3/b$a;", "state", "Lk10/l;", "s9", "(Ldn0/d;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "counterStepValue", "leftTime", "w9", "(II)V", "b", "Lgo3/f;", "c", "Lib4/c;", "d", "Lb00/c;", "e", "Lf01/b;", "f", "Ldn0/d;", "g", "Ldp3/b$a;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ldp3/a$b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Ldp3/c$a;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "l", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<dp3.b, dp3.a> implements dp3.c, zx.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f43753l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f43754m = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final go3.f getDecryptedVerifiedPersonDataUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f01.b launchNativeRatingUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final VerificationResponse verificationResponse;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final dp3.b.a initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<dp3.b, dp3.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<dp3.a.b> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<dp3.c.a> state;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Ldp3/n$a;", "", "<init>", "()V", "", "MAX_TIME_SEC", "I", "", "COUNTER_DELAY_VALUE", "J", "COUNTER_STEP_VALUE", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<mu.h<? super Integer>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f43765f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        /* JADX WARN: Code duplicated, block: B:13:0x002c  */
        /* JADX WARN: Code duplicated, block: B:16:0x0039  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0045 -> B:11:0x0022). Please report as a decompilation issue!!! */
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
                java.lang.Object r0 = r7.f43765f
                mu.h r0 = (mu.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f43764e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1f
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                oq.u.b(r8)
                goto L39
            L1f:
                oq.u.b(r8)
            L22:
                tq.i r8 = r7.getContext()
                boolean r8 = ju.g2.n(r8)
                if (r8 == 0) goto L48
                r7.f43765f = r0
                r7.f43764e = r4
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = ju.z0.b(r5, r7)
                if (r8 != r1) goto L39
                goto L47
            L39:
                java.lang.Integer r8 = vq.b.e(r4)
                r7.f43765f = r0
                r7.f43764e = r3
                java.lang.Object r8 = r0.F(r8, r7)
                if (r8 != r1) goto L22
            L47:
                return r1
            L48:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: dp3.n.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super Integer> hVar, tq.e<? super i0> eVar) {
            return ((b) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f43765f = obj;
            return bVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43766d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f43767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f43768f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f43769g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f43770h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f43771j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f43772k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f43773l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f43774m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f43776p;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43774m = obj;
            this.f43776p |= PKIFailureInfo.systemUnavail;
            return n.this.s9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<dp3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f43777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fp3.o f43778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f43779c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f43780a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ fp3.o f43781b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ n f43782c;

            /* JADX INFO: renamed from: dp3.n$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0986a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f43783d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f43784e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f43785f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f43787h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f43788j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f43789k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f43790l;

                public C0986a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f43783d = obj;
                    this.f43784e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, fp3.o oVar, n nVar) {
                this.f43780a = hVar;
                this.f43781b = oVar;
                this.f43782c = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0986a c0986a;
                if (eVar instanceof C0986a) {
                    c0986a = (C0986a) eVar;
                    int i15 = c0986a.f43784e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0986a.f43784e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0986a = new C0986a(eVar);
                    }
                } else {
                    c0986a = new C0986a(eVar);
                }
                Object obj2 = c0986a.f43783d;
                Object objE = uq.b.e();
                int i16 = c0986a.f43784e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f43780a;
                    dp3.c.a aVarB = this.f43781b.b(new fp3.o.Params((dp3.b) obj, this.f43782c.b9(dp3.a.C0980a.f43697a)));
                    c0986a.f43785f = vq.j.a(obj);
                    c0986a.f43787h = vq.j.a(c0986a);
                    c0986a.f43788j = vq.j.a(obj);
                    c0986a.f43789k = vq.j.a(hVar);
                    c0986a.f43790l = 0;
                    c0986a.f43784e = 1;
                    if (hVar.F(aVarB, c0986a) == objE) {
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

        public d(mu.g gVar, fp3.o oVar, n nVar) {
            this.f43777a = gVar;
            this.f43778b = oVar;
            this.f43779c = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super dp3.c.a> hVar, tq.e eVar) {
            Object objA = this.f43777a.a(new a(hVar, this.f43778b, this.f43779c), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldp3/a$a;", "<unused var>", "Ldp3/b;", "Loq/i0;", "<anonymous>", "(Ldp3/a$a;Ldp3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<dp3.a.C0980a, dp3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43791e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.c(r1, r4) == r0) goto L15;
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
                int r1 = r4.f43791e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                dp3.n r5 = dp3.n.this
                xw.b r5 = r5.Y1()
                dp3.a$b$a r1 = dp3.a.b.C0981a.f43698a
                r4.f43791e = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                dp3.n r5 = dp3.n.this
                f01.b r5 = dp3.n.o9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f43791e = r2
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: dp3.n.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dp3.a.C0980a c0980a, dp3.b bVar, tq.e<? super i0> eVar) {
            return n.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ldp3/b$a;", "state", "Lk10/l;", "Ldp3/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<dp3.b.a>, tq.e<? super k10.l<? extends dp3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f43794f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f43794f;
            Object objE = uq.b.e();
            int i15 = this.f43793e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            n nVar = n.this;
            VerificationResponse verificationResponse = nVar.verificationResponse;
            this.f43794f = vq.j.a(c0Var);
            this.f43793e = 1;
            Object objS9 = nVar.s9(verificationResponse, c0Var, this);
            return objS9 == objE ? objE : objS9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<dp3.b.a> c0Var, tq.e<? super k10.l<? extends dp3.b>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = n.this.new f(eVar);
            fVar.f43794f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "counterStepValue", "Ldp3/b$b;", "state", "Loq/i0;", "<anonymous>", "(ILdp3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<Integer, dp3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ int f43797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f43798g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            int i15 = this.f43797f;
            dp3.b.Initialized initialized = (dp3.b.Initialized) this.f43798g;
            uq.b.e();
            if (this.f43796e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            n.this.w9(i15, initialized.getLeftTime());
            return i0.f148189a;
        }

        public final Object M(int i15, dp3.b.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = n.this.new g(eVar);
            gVar.f43797f = i15;
            gVar.f43798g = initialized;
            return gVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Integer num, dp3.b.Initialized initialized, tq.e<? super i0> eVar) {
            return M(num.intValue(), initialized, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldp3/a$c;", "action", "Lk10/c0;", "Ldp3/b$b;", "state", "Lk10/l;", "Ldp3/b;", "<anonymous>", "(Ldp3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<dp3.a.UpdateLeftTime, c0<dp3.b.Initialized>, tq.e<? super k10.l<? extends dp3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f43801f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f43802g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dp3.b.Initialized O(dp3.a.UpdateLeftTime updateLeftTime, dp3.b.Initialized initialized) {
            return dp3.b.Initialized.b(initialized, null, null, 0, initialized.getLeftTime() - updateLeftTime.getCounterStepValue(), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dp3.a.UpdateLeftTime updateLeftTime = (dp3.a.UpdateLeftTime) this.f43801f;
            c0 c0Var = (c0) this.f43802g;
            uq.b.e();
            if (this.f43800e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: dp3.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.h.O(updateLeftTime, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dp3.a.UpdateLeftTime updateLeftTime, c0<dp3.b.Initialized> c0Var, tq.e<? super k10.l<? extends dp3.b>> eVar) {
            h hVar = new h(eVar);
            hVar.f43801f = updateLeftTime;
            hVar.f43802g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, fp3.o oVar, go3.f fVar, ib4.c cVar, b00.c cVar2, f01.b bVar, VerificationResponse verificationResponse) {
        this.getDecryptedVerifiedPersonDataUseCase = fVar;
        this.domainErrorMapper = cVar;
        this.imageConverter = cVar2;
        this.launchNativeRatingUC = bVar;
        this.verificationResponse = verificationResponse;
        dp3.b.a aVar2 = dp3.b.a.f43701a;
        this.initialState = aVar2;
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: dp3.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f43752a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), oVar, this), dp3.c.a.C0984a.f43706a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(n nVar, z zVar) {
        zVar.A(nVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(n nVar, z zVar) {
        k10.k.s(zVar, nVar.r9(), null, nVar.new g(null), 2, null);
        h hVar = new h(null);
        zVar.v(q0.c(dp3.a.UpdateLeftTime.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    private final mu.g<Integer> r9() {
        return mu.i.I(new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s9(VerificationResponse verificationResponse, c0<dp3.b.a> c0Var, tq.e<? super k10.l<? extends dp3.b>> eVar) throws Throwable {
        c cVar;
        final s sVar;
        final Bitmap bitmap;
        s sVar2;
        c0<dp3.b.a> c0Var2;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f43776p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f43776p = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD = cVar.f43774m;
        Object objE = uq.b.e();
        int i16 = cVar.f43776p;
        if (i16 == 0) {
            u.b(objD);
            go3.f fVar = this.getDecryptedVerifiedPersonDataUseCase;
            go3.f.Params params = new go3.f.Params(verificationResponse);
            cVar.f43766d = vq.j.a(verificationResponse);
            cVar.f43767e = c0Var;
            cVar.f43776p = 1;
            objD = fVar.d(params, cVar);
            if (objD != objE) {
            }
            return objE;
        }
        if (i16 != 1) {
            if (i16 == 2) {
                c0Var2 = (c0) cVar.f43767e;
                u.b(objD);
                return c0Var2.c();
            }
            if (i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar2 = (s) cVar.f43769g;
            c0Var = (c0) cVar.f43767e;
            u.b(objD);
            bitmap = (Bitmap) ((dx.i) objD).a();
            sVar = sVar2;
            return c0Var.d(new er.l() { // from class: dp3.k
                @Override // er.l
                public final Object b(Object obj) {
                    return n.t9(sVar, bitmap, (b.a) obj);
                }
            });
        }
        c0Var = (c0) cVar.f43767e;
        verificationResponse = (VerificationResponse) cVar.f43766d;
        u.b(objD);
        dx.i iVar = (dx.i) objD;
        if (!(iVar instanceof dx.i.Left)) {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            sVar = (s) ((dx.i.Right) iVar).b();
            String picture = sVar.getPicture();
            if (picture != null) {
                b00.c cVar2 = this.imageConverter;
                cVar.f43766d = vq.j.a(verificationResponse);
                cVar.f43767e = c0Var;
                cVar.f43768f = vq.j.a(iVar);
                cVar.f43769g = sVar;
                cVar.f43770h = vq.j.a(picture);
                cVar.f43771j = 0;
                cVar.f43772k = 0;
                cVar.f43773l = 0;
                cVar.f43776p = 3;
                objD = cVar2.b(picture, cVar);
                if (objD != objE) {
                    sVar2 = sVar;
                    bitmap = (Bitmap) ((dx.i) objD).a();
                    sVar = sVar2;
                }
            } else {
                bitmap = null;
            }
            return c0Var.d(new er.l() { // from class: dp3.k
                @Override // er.l
                public final Object b(Object obj) {
                    return n.t9(sVar, bitmap, (b.a) obj);
                }
            });
        }
        dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
        cVar.f43766d = vq.j.a(verificationResponse);
        cVar.f43767e = c0Var;
        cVar.f43768f = vq.j.a(iVar);
        cVar.f43769g = vq.j.a(bVar);
        cVar.f43771j = 0;
        cVar.f43772k = 0;
        cVar.f43776p = 2;
        if (u9(bVar, cVar) != objE) {
            c0Var2 = c0Var;
            return c0Var2.c();
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dp3.b.Initialized t9(s sVar, Bitmap bitmap, dp3.b.a aVar) {
        return new dp3.b.Initialized(sVar, bitmap, 180, 180);
    }

    private final Object u9(dx.b bVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new dp3.a.b.Error(this.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: dp3.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.v9(this.f43751a, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(n nVar, ib4.c.b bVar) {
        nVar.d9(dp3.a.C0980a.f43697a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w9(int counterStepValue, int leftTime) {
        if (leftTime > 0) {
            d9(new dp3.a.UpdateLeftTime(counterStepValue));
        } else {
            d9(dp3.a.C0980a.f43697a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final n nVar, v vVar) {
        vVar.c(q0.c(dp3.b.class), new er.l() { // from class: dp3.h
            @Override // er.l
            public final Object b(Object obj) {
                return n.z9(this.f43746a, (z) obj);
            }
        });
        vVar.c(q0.c(dp3.b.a.class), new er.l() { // from class: dp3.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.A9(this.f43747a, (z) obj);
            }
        });
        vVar.c(q0.c(dp3.b.Initialized.class), new er.l() { // from class: dp3.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.B9(this.f43748a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(n nVar, z zVar) {
        e eVar = nVar.new e(null);
        zVar.x(q0.c(dp3.a.C0980a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<dp3.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<dp3.b, dp3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<dp3.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(VerificationResponse verificationResponse) {
        super.P5(verificationResponse);
    }
}
