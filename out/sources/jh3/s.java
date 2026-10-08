package jh3;

import android.graphics.Bitmap;
import fr.q0;
import java.util.concurrent.CancellationException;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.NewCollision;
import sv0.ProcessId;
import sv0.ProcessNewCollision;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 p2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001qBs\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J.\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%\"\b\b\u0000\u0010\"*\u00020\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0082@¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020%2\u0006\u0010.\u001a\u00020-2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020*2\u0006\u0010.\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0013\u0010=\u001a\u00020<*\u00020\u0002H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020*2\u0006\u0010?\u001a\u00020\u0018H\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030^8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR \u0010j\u001a\b\u0012\u0004\u0012\u00020e0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR \u0010$\u001a\b\u0012\u0004\u0012\u00020<0k8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o¨\u0006r"}, d2 = {"Ljh3/s;", "Ll00/g;", "Ljh3/b;", "Ljh3/a;", "Ljh3/c;", "", "Lyy/a;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Law0/q;", "createNewCollisionUseCase", "Law0/a;", "awaitJoinedPersonUseCase", "Lmx/c;", "labelProvider", "Lez/a;", "currentTimeProvider", "Llh3/a;", "screenMapper", "Lib4/c;", "domainErrorMapper", "Lae3/j;", "longPollUC", "Lkh3/a;", "contract", "Lpx/d;", "remoteLogger", "Lhb4/d;", "errorVMSFactory", "Lwz/a;", "barcodeGenerator", "<init>", "(Lyy/a;Lac4/a;Law0/q;Law0/a;Lmx/c;Lez/a;Llh3/a;Lib4/c;Lae3/j;Lkh3/a;Lpx/d;Lhb4/d;Lwz/a;)V", "T", "Lk10/c0;", "state", "Lk10/l;", "Ljh3/b$a;", "D9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Loq/i0;", "A9", "()Lmu/g;", "Ljh3/a$j;", "action", "M9", "(Ljh3/a$j;Lk10/c0;)Lk10/l;", "Ldx/b;", "domainError", "Lhb4/c;", "B9", "(Ldx/b;)Lhb4/c;", "Ljh3/a$b;", "F9", "(Ljh3/a$b;)V", "Ldx/b$c;", "K9", "()Ldx/b$c;", "Ljh3/c$a;", "G9", "(Ljh3/b;)Ljh3/c$a;", "data", "L9", "(Lkh3/a;)V", "b", "Lac4/a;", "c", "Law0/q;", "d", "Law0/a;", "e", "Lmx/c;", "f", "Lez/a;", "g", "Llh3/a;", "h", "Lib4/c;", "j", "Lae3/j;", "k", "Lkh3/a;", "l", "Lpx/d;", "m", "Lhb4/d;", "n", "Lwz/a;", "Ljh3/b$b;", "p", "Ljh3/b$b;", "initialState", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ljh3/a$c;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "t", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<jh3.b, a> implements jh3.c, zx.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f103072v = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final aw0.q createNewCollisionUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final aw0.a awaitJoinedPersonUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final lh3.a screenMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ae3.j longPollUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final kh3.a contract;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final wz.a barcodeGenerator;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final jh3.b.C2433b initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<jh3.b, a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.c> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p0<jh3.c.a> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmu/h;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<mu.h<? super i0>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f103091f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        /* JADX WARN: Code duplicated, block: B:13:0x002c  */
        /* JADX WARN: Code duplicated, block: B:16:0x0039  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0043 -> B:11:0x0022). Please report as a decompilation issue!!! */
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
                java.lang.Object r0 = r7.f103091f
                mu.h r0 = (mu.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f103090e
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
                if (r8 == 0) goto L46
                r7.f103091f = r0
                r7.f103090e = r4
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = ju.z0.b(r5, r7)
                if (r8 != r1) goto L39
                goto L45
            L39:
                oq.i0 r8 = oq.i0.f148189a
                r7.f103091f = r0
                r7.f103090e = r3
                java.lang.Object r8 = r0.F(r8, r7)
                if (r8 != r1) goto L22
            L45:
                return r1
            L46:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: jh3.s.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super i0> hVar, tq.e<? super i0> eVar) {
            return ((b) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f103091f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ljh3/b$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super k10.l<? extends jh3.b.Content>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f103092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f103093f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f103094g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f103095h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f103096j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f103097k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f103098l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f103099m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f103100n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f103101p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f103102q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f103103r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f103104s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ c0<T> f103106v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c0<T> c0Var, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f103106v = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh3.b.Content V(s sVar, ProcessNewCollision processNewCollision, Bitmap bitmap, jh3.b bVar) {
            gu.b.Companion companion = gu.b.INSTANCE;
            return new jh3.b.Content(gu.d.r(sVar.currentTimeProvider.a(), gu.e.MILLISECONDS), ov0.b.f150213a.c(), processNewCollision.getProcessCode(), bitmap, 1.0f, null);
        }

        /* JADX WARN: Code duplicated, block: B:48:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:57:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:60:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:61:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:63:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:67:0x0208  */
        /* JADX WARN: Code duplicated, block: B:68:0x0220  */
        /* JADX WARN: Code duplicated, block: B:70:0x0224  */
        /* JADX WARN: Code duplicated, block: B:72:0x022b  */
        /* JADX WARN: Code duplicated, block: B:74:0x0231  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v5 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String message;
            dx.i iVarA;
            Object objB;
            dx.i left;
            s sVar;
            c0 c0Var;
            ex.b aVar;
            c0 c0Var2;
            s sVar2;
            ex.b bVar;
            int i15;
            int i16;
            dx.j<dx.b> jVarA;
            ex.b bVar2;
            int i17;
            int i18;
            int i19;
            Object objC;
            ex.b bVar3;
            int i25;
            ProcessNewCollision processNewCollision;
            int i26;
            int i27;
            c0 c0Var3;
            ex.b bVar4;
            Object objA;
            final ProcessNewCollision processNewCollision2;
            final Bitmap bitmap;
            final s sVar3;
            Bitmap bitmap2;
            kh3.a aVar2;
            ProcessId processId;
            Object objE = uq.b.e();
            int i28 = this.f103104s;
            ?? r15 = 3;
            try {
                try {
                    if (i28 == 0) {
                        oq.u.b(obj);
                        sVar2 = s.this;
                        c0Var2 = this.f103106v;
                        jVarA = xw.c.f221622a.a();
                        aVar = new ex.a();
                        aw0.q qVar = sVar2.createNewCollisionUseCase;
                        kh3.a aVar3 = sVar2.contract;
                        aw0.q.Params params = new aw0.q.Params(new NewCollision(aVar3.C(), aVar3.M()));
                        this.f103092e = sVar2;
                        this.f103093f = c0Var2;
                        this.f103094g = jVarA;
                        this.f103095h = vq.j.a(aVar);
                        this.f103096j = aVar;
                        this.f103097k = aVar;
                        this.f103099m = 0;
                        this.f103100n = 0;
                        this.f103101p = 0;
                        this.f103102q = 0;
                        this.f103103r = 0;
                        this.f103104s = 1;
                        objC = qVar.c(params, this);
                        if (objC != objE) {
                            i19 = 0;
                            i18 = 0;
                            i16 = 0;
                            i17 = 0;
                            i15 = 0;
                            bVar2 = aVar;
                            bVar = bVar2;
                        }
                        return objE;
                    }
                    try {
                        if (i28 != 1) {
                            if (i28 == 2) {
                                int i29 = this.f103103r;
                                int i35 = this.f103102q;
                                int i36 = this.f103101p;
                                int i37 = this.f103100n;
                                int i38 = this.f103099m;
                                ProcessNewCollision processNewCollision3 = (ProcessNewCollision) this.f103098l;
                                bVar2 = (ex.b) this.f103097k;
                                bVar3 = (ex.b) this.f103096j;
                                ex.b bVar5 = (ex.b) this.f103095h;
                                dx.j<dx.b> jVar = (dx.j) this.f103094g;
                                c0 c0Var4 = (c0) this.f103093f;
                                s sVar4 = (s) this.f103092e;
                                try {
                                    oq.u.b(obj);
                                    i25 = i29;
                                    processNewCollision = processNewCollision3;
                                    i15 = i38;
                                    i17 = i37;
                                    i26 = i36;
                                    i27 = i35;
                                    c0Var3 = c0Var4;
                                    jVarA = jVar;
                                    bVar4 = bVar5;
                                    sVar2 = sVar4;
                                    objA = obj;
                                    bitmap2 = (Bitmap) bVar2.a((dx.i) objA);
                                    aVar2 = sVar2.contract;
                                    processId = processNewCollision.getProcessId();
                                    this.f103092e = sVar2;
                                    this.f103093f = c0Var3;
                                    this.f103094g = jVarA;
                                    this.f103095h = vq.j.a(bVar4);
                                    this.f103096j = vq.j.a(bVar3);
                                    this.f103097k = bitmap2;
                                    this.f103098l = processNewCollision;
                                    this.f103099m = i15;
                                    this.f103100n = i17;
                                    this.f103101p = i26;
                                    this.f103102q = i27;
                                    this.f103103r = i25;
                                    this.f103104s = 3;
                                    if (aVar2.D(processId, this) != objE) {
                                        processNewCollision2 = processNewCollision;
                                        bitmap = bitmap2;
                                        sVar3 = sVar2;
                                    }
                                    return objE;
                                } catch (ex.c e15) {
                                    e = e15;
                                    left = new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    throw e16;
                                } catch (Exception e17) {
                                    e = e17;
                                    r15 = jVar;
                                    px.f fVar = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    left = new dx.i.Left(objB);
                                }
                            } else {
                                if (i28 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                processNewCollision2 = (ProcessNewCollision) this.f103098l;
                                bitmap = (Bitmap) this.f103097k;
                                c0Var3 = (c0) this.f103093f;
                                sVar3 = (s) this.f103092e;
                                oq.u.b(obj);
                            }
                            left = new dx.i.Right(c0Var3.d(new er.l() { // from class: jh3.t
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return s.c.V(sVar3, processNewCollision2, bitmap, (b) obj2);
                                }
                            }));
                        } else {
                            int i39 = this.f103103r;
                            int i45 = this.f103102q;
                            int i46 = this.f103101p;
                            int i47 = this.f103100n;
                            int i48 = this.f103099m;
                            aVar = (ex.b) this.f103097k;
                            ex.b bVar6 = (ex.b) this.f103096j;
                            ex.b bVar7 = (ex.b) this.f103095h;
                            dx.j<dx.b> jVar2 = (dx.j) this.f103094g;
                            c0Var2 = (c0) this.f103093f;
                            sVar2 = (s) this.f103092e;
                            try {
                                oq.u.b(obj);
                                bVar = bVar7;
                                i15 = i48;
                                i16 = i46;
                                jVarA = jVar2;
                                bVar2 = bVar6;
                                i17 = i47;
                                i18 = i45;
                                i19 = i39;
                                objC = obj;
                            } catch (ex.c e18) {
                                e = e18;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                r15 = jVar2;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                left = new dx.i.Left(objB);
                            }
                        }
                        sVar = s.this;
                        c0Var = this.f103106v;
                        if (left instanceof dx.i.Left) {
                            sVar.d9(new a.ShowError((dx.b) ((dx.i.Left) left).b(), false, 2, null));
                            return c0Var.c();
                        }
                        if (left instanceof dx.i.Right) {
                            return ((dx.i.Right) left).b();
                        }
                        throw new oq.p();
                    } catch (CancellationException e26) {
                        throw e26;
                    }
                    processNewCollision = (ProcessNewCollision) aVar.a((dx.i) objC);
                    wz.a aVar4 = sVar2.barcodeGenerator;
                    ex.b bVar8 = bVar;
                    wz.b.QrCode qrCode = new wz.b.QrCode(processNewCollision.getProcessCode(), 0, 2, null);
                    this.f103092e = sVar2;
                    this.f103093f = c0Var2;
                    this.f103094g = jVarA;
                    this.f103095h = vq.j.a(bVar8);
                    this.f103096j = vq.j.a(bVar2);
                    this.f103097k = bVar2;
                    this.f103098l = processNewCollision;
                    this.f103099m = i15;
                    this.f103100n = i17;
                    this.f103101p = i16;
                    this.f103102q = i18;
                    i25 = i19;
                    this.f103103r = i25;
                    this.f103104s = 2;
                    objA = aVar4.a(qrCode, this);
                    if (objA != objE) {
                        bVar4 = bVar8;
                        i26 = i16;
                        i27 = i18;
                        c0Var3 = c0Var2;
                        bVar3 = bVar2;
                        bitmap2 = (Bitmap) bVar2.a((dx.i) objA);
                        aVar2 = sVar2.contract;
                        processId = processNewCollision.getProcessId();
                        this.f103092e = sVar2;
                        this.f103093f = c0Var3;
                        this.f103094g = jVarA;
                        this.f103095h = vq.j.a(bVar4);
                        this.f103096j = vq.j.a(bVar3);
                        this.f103097k = bitmap2;
                        this.f103098l = processNewCollision;
                        this.f103099m = i15;
                        this.f103100n = i17;
                        this.f103101p = i26;
                        this.f103102q = i27;
                        this.f103103r = i25;
                        this.f103104s = 3;
                        if (aVar2.D(processId, this) != objE) {
                            processNewCollision2 = processNewCollision;
                            bitmap = bitmap2;
                            sVar3 = sVar2;
                            left = new dx.i.Right(c0Var3.d(new er.l() { // from class: jh3.t
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return s.c.V(sVar3, processNewCollision2, bitmap, (b) obj2);
                                }
                            }));
                            sVar = s.this;
                            c0Var = this.f103106v;
                            if (left instanceof dx.i.Left) {
                                sVar.d9(new a.ShowError((dx.b) ((dx.i.Left) left).b(), false, 2, null));
                                return c0Var.c();
                            }
                            if (left instanceof dx.i.Right) {
                                return ((dx.i.Right) left).b();
                            }
                            throw new oq.p();
                        }
                    }
                    return objE;
                } catch (Exception e27) {
                    e = e27;
                }
            } catch (ex.c e28) {
                e = e28;
            } catch (CancellationException e29) {
                throw e29;
            }
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return s.this.new c(this.f103106v, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<jh3.b.Content>> eVar) {
            return ((c) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<jh3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f103107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f103108b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f103109a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f103110b;

            /* JADX INFO: renamed from: jh3.s$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2437a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f103111d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f103112e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f103113f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f103115h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f103116j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f103117k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f103118l;

                public C2437a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f103111d = obj;
                    this.f103112e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s sVar) {
                this.f103109a = hVar;
                this.f103110b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2437a c2437a;
                if (eVar instanceof C2437a) {
                    c2437a = (C2437a) eVar;
                    int i15 = c2437a.f103112e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2437a.f103112e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2437a = new C2437a(eVar);
                    }
                } else {
                    c2437a = new C2437a(eVar);
                }
                Object obj2 = c2437a.f103111d;
                Object objE = uq.b.e();
                int i16 = c2437a.f103112e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f103109a;
                    jh3.c.a aVarG9 = this.f103110b.G9((jh3.b) obj);
                    c2437a.f103113f = vq.j.a(obj);
                    c2437a.f103115h = vq.j.a(c2437a);
                    c2437a.f103116j = vq.j.a(obj);
                    c2437a.f103117k = vq.j.a(hVar);
                    c2437a.f103118l = 0;
                    c2437a.f103112e = 1;
                    if (hVar.F(aVarG9, c2437a) == objE) {
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

        public d(mu.g gVar, s sVar) {
            this.f103107a = gVar;
            this.f103108b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super jh3.c.a> hVar, tq.e eVar) {
            Object objA = this.f103107a.a(new a(hVar, this.f103108b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljh3/a$c;", "action", "Ljh3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljh3/a$c;Ljh3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a.c, jh3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f103120f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.c cVar = (a.c) this.f103120f;
            Object objE = uq.b.e();
            int i15 = this.f103119e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                this.f103120f = vq.j.a(cVar);
                this.f103119e = 1;
                if (sVar.F(cVar, this) == objE) {
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
        public final Object w(a.c cVar, jh3.b bVar, tq.e<? super i0> eVar) {
            e eVar2 = s.this.new e(eVar);
            eVar2.f103120f = cVar;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh3/a$f;", "<unused var>", "Ljh3/b;", "Loq/i0;", "<anonymous>", "(Ljh3/a$f;Ljh3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a.f, jh3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103122e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f103122e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                a.c.C2432c c2432c = a.c.C2432c.f103017a;
                this.f103122e = 1;
                if (sVar.F(c2432c, this) == objE) {
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
        public final Object w(a.f fVar, jh3.b bVar, tq.e<? super i0> eVar) {
            return s.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljh3/a$j;", "action", "Lk10/c0;", "Ljh3/b;", "state", "Lk10/l;", "<anonymous>", "(Ljh3/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a.ShowError, c0<jh3.b>, tq.e<? super k10.l<? extends jh3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103124e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f103125f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f103126g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.ShowError showError = (a.ShowError) this.f103125f;
            c0 c0Var = (c0) this.f103126g;
            uq.b.e();
            if (this.f103124e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return s.this.M9(showError, c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.ShowError showError, c0<jh3.b> c0Var, tq.e<? super k10.l<? extends jh3.b>> eVar) {
            g gVar = s.this.new g(eVar);
            gVar.f103125f = showError;
            gVar.f103126g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljh3/a$b;", "action", "Ljh3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljh3/a$b;Ljh3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.HandleResultError, jh3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f103129f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.HandleResultError handleResultError = (a.HandleResultError) this.f103129f;
            uq.b.e();
            if (this.f103128e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.F9(handleResultError);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.HandleResultError handleResultError, jh3.b bVar, tq.e<? super i0> eVar) {
            h hVar = s.this.new h(eVar);
            hVar.f103129f = handleResultError;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljh3/a$g;", "<unused var>", "Lk10/c0;", "Ljh3/b;", "state", "Lk10/l;", "<anonymous>", "(Ljh3/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a.g, c0<jh3.b>, tq.e<? super k10.l<? extends jh3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f103132f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f103132f;
            Object objE = uq.b.e();
            int i15 = this.f103131e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            s sVar = s.this;
            this.f103132f = vq.j.a(c0Var);
            this.f103131e = 1;
            Object objD9 = sVar.D9(c0Var, this);
            return objD9 == objE ? objE : objD9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.g gVar, c0<jh3.b> c0Var, tq.e<? super k10.l<? extends jh3.b>> eVar) {
            i iVar = s.this.new i(eVar);
            iVar.f103132f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljh3/a$h;", "<unused var>", "Lk10/c0;", "Ljh3/b;", "state", "Lk10/l;", "<anonymous>", "(Ljh3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a.h, c0<jh3.b>, tq.e<? super k10.l<? extends jh3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f103135f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh3.b.C2433b O(jh3.b bVar) {
            return jh3.b.C2433b.f103035a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f103135f;
            uq.b.e();
            if (this.f103134e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jh3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.j.O((b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.h hVar, c0<jh3.b> c0Var, tq.e<? super k10.l<? extends jh3.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f103135f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljh3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljh3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<jh3.b.C2433b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103136e;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f103136e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.d9(a.g.f103023a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(jh3.b.C2433b c2433b, tq.e<? super i0> eVar) {
            return ((k) v(c2433b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return s.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljh3/b$a;", "it", "Loq/i0;", "<anonymous>", "(Ljh3/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<jh3.b.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103138e;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f103138e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.d9(a.k.f103028a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(jh3.b.Content content, tq.e<? super i0> eVar) {
            return ((l) v(content, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return s.this.new l(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljh3/a$i;", "<unused var>", "Lk10/c0;", "Ljh3/b$a;", "state", "Lk10/l;", "Ljh3/b;", "<anonymous>", "(Ljh3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a.i, c0<jh3.b.Content>, tq.e<? super k10.l<? extends jh3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f103141f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh3.b.d O(jh3.b.Content content) {
            return jh3.b.d.f103037a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f103141f;
            uq.b.e();
            if (this.f103140e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jh3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.m.O((b.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.i iVar, c0<jh3.b.Content> c0Var, tq.e<? super k10.l<? extends jh3.b>> eVar) {
            m mVar = new m(eVar);
            mVar.f103141f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh3/a$k;", "<unused var>", "Ljh3/b$a;", "Loq/i0;", "<anonymous>", "(Ljh3/a$k;Ljh3/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<jh3.a.k, jh3.b.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103142e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f103144e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f103145f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f103146g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f103147h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f103148j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f103149k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f103150l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f103151m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f103152n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f103153p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f103154q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f103155r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ s f103156s;

            /* JADX INFO: renamed from: jh3.s$n$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C2438a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f103157a;

                static {
                    int[] iArr = new int[sv0.o.values().length];
                    try {
                        iArr[sv0.o.ME.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[sv0.o.OTHER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f103157a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f103156s = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:48:0x015f A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:49:0x0161 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #6 {Exception -> 0x0035, blocks: (B:9:0x0030, B:58:0x01da, B:60:0x01e7, B:63:0x01f5, B:46:0x0150, B:49:0x0161, B:53:0x01a2, B:54:0x01a7, B:55:0x01a8, B:42:0x0115, B:38:0x00c8), top: B:78:0x000d }] */
            /* JADX WARN: Code duplicated, block: B:51:0x019f  */
            /* JADX WARN: Code duplicated, block: B:53:0x01a2 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #6 {Exception -> 0x0035, blocks: (B:9:0x0030, B:58:0x01da, B:60:0x01e7, B:63:0x01f5, B:46:0x0150, B:49:0x0161, B:53:0x01a2, B:54:0x01a7, B:55:0x01a8, B:42:0x0115, B:38:0x00c8), top: B:78:0x000d }] */
            /* JADX WARN: Code duplicated, block: B:55:0x01a8 A[Catch: Exception -> 0x0035, c -> 0x0038, CancellationException -> 0x003b, TryCatch #6 {Exception -> 0x0035, blocks: (B:9:0x0030, B:58:0x01da, B:60:0x01e7, B:63:0x01f5, B:46:0x0150, B:49:0x0161, B:53:0x01a2, B:54:0x01a7, B:55:0x01a8, B:42:0x0115, B:38:0x00c8), top: B:78:0x000d }] */
            /* JADX WARN: Code duplicated, block: B:66:0x01fe  */
            /* JADX WARN: Code duplicated, block: B:69:0x020f  */
            /* JADX WARN: Code duplicated, block: B:70:0x021d  */
            /* JADX WARN: Code duplicated, block: B:72:0x0221  */
            /* JADX WARN: Code duplicated, block: B:75:0x022d  */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x01d7, code lost:
            
                if (r15.F(r4, r17) == r0) goto L57;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [int] */
            /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v13 */
            /* JADX WARN: Type inference failed for: r2v8 */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 564
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: jh3.s.n.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f103156s, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f103142e;
            if (i15 == 0) {
                oq.u.b(obj);
                ae3.j jVar = s.this.longPollUC;
                a aVar = new a(s.this, null);
                this.f103142e = 1;
                obj = jVar.a(aVar, this);
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
            s sVar = s.this;
            if (iVar instanceof dx.i.Left) {
                sVar.d9(new jh3.a.ShowError((dx.b) ((dx.i.Left) iVar).b(), false, 2, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jh3.a.k kVar, jh3.b.Content content, tq.e<? super i0> eVar) {
            return s.this.new n(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Loq/i0;", "<unused var>", "Lk10/c0;", "Ljh3/b$a;", "state", "Lk10/l;", "Ljh3/b;", "<anonymous>", "(VLpl/gov/coi/common/statemachine/State;)Lpl/gov/coi/common/statemachine/ChangedState;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<i0, c0<jh3.b.Content>, tq.e<? super k10.l<? extends jh3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f103159f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh3.b.Content O(long j15, jh3.b.Content content) {
            return jh3.b.Content.b(content, 0L, j15, null, null, (float) gu.b.s(j15, ov0.b.f150213a.c()), 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f103159f;
            uq.b.e();
            if (this.f103158e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            gu.b.Companion companion = gu.b.INSTANCE;
            long jA = s.this.currentTimeProvider.a();
            gu.e eVar = gu.e.MILLISECONDS;
            gu.b bVarO = gu.b.o(gu.b.U(ov0.b.f150213a.c(), gu.b.U(gu.d.r(jA, eVar), ((jh3.b.Content) c0Var.a()).getStartTime())));
            if (!gu.b.T(bVarO.getRawValue())) {
                bVarO = null;
            }
            final long rawValue = bVarO != null ? bVarO.getRawValue() : gu.d.q(0, gu.e.MINUTES);
            if (gu.b.q(rawValue, gu.d.q(0, eVar)) > 0) {
                return c0Var.b(new er.l() { // from class: jh3.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.o.O(rawValue, (b.Content) obj2);
                    }
                });
            }
            s.this.d9(new a.ShowError(new dx.b.g.Http(null, dx.b.g.Http.a.GATEWAY_TIMEOUT, "", null), false, 2, null));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i0 i0Var, c0<jh3.b.Content> c0Var, tq.e<? super k10.l<? extends jh3.b>> eVar) {
            o oVar = s.this.new o(eVar);
            oVar.f103159f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, ac4.a aVar2, aw0.q qVar, aw0.a aVar3, mx.c cVar, ez.a aVar4, lh3.a aVar5, ib4.c cVar2, ae3.j jVar, kh3.a aVar6, px.d dVar, hb4.d dVar2, wz.a aVar7) {
        this.callActionWithLoaderUseCase = aVar2;
        this.createNewCollisionUseCase = qVar;
        this.awaitJoinedPersonUseCase = aVar3;
        this.labelProvider = cVar;
        this.currentTimeProvider = aVar4;
        this.screenMapper = aVar5;
        this.domainErrorMapper = cVar2;
        this.longPollUC = jVar;
        this.contract = aVar6;
        this.remoteLogger = dVar;
        this.errorVMSFactory = dVar2;
        this.barcodeGenerator = aVar7;
        jh3.b.C2433b c2433b = jh3.b.C2433b.f103035a;
        this.initialState = c2433b;
        this.stateMachine = aVar.a(c2433b, new er.l() { // from class: jh3.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.O9(this.f103070a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), G9(c2433b));
    }

    private final mu.g<i0> A9() {
        return mu.i.I(new b(null));
    }

    private final hb4.c B9(dx.b domainError) {
        hb4.d dVar = this.errorVMSFactory;
        ib4.c cVar = this.domainErrorMapper;
        if (domainError instanceof dx.b.g.Http) {
            if (((dx.b.g.Http) domainError).getCode() == dx.b.g.Http.a.GATEWAY_TIMEOUT) {
                domainError = K9();
            }
        } else if ((domainError instanceof dx.b.g.h) || fr.t.c(domainError, dx.b.g.f.f45079a)) {
            domainError = K9();
        }
        return dVar.a(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: jh3.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.C9(this.f103069a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(s sVar, ib4.c.b bVar) {
        sVar.d9(new a.HandleResultError(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends jh3.b> Object D9(c0<T> c0Var, tq.e<? super k10.l<jh3.b.Content>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new c(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F9(a.HandleResultError action) {
        ib4.c.b resultAction = action.getResultAction();
        if ((resultAction instanceof ib4.c.b.a.Close) || (resultAction instanceof ib4.c.b.a.Secondary) || fr.t.c(resultAction, ib4.c.b.AbstractC2161b.a.f90859a)) {
            d9(a.c.C2431a.f103015a);
            return;
        }
        if (!(resultAction instanceof ib4.c.b.a.Primary)) {
            if (!fr.t.c(resultAction, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            d9(a.h.f103024a);
            return;
        }
        boolean zC = fr.t.c(((ib4.c.b.a.Primary) action.getResultAction()).getType(), Companion.C2436a.f103089a);
        if (zC) {
            d9(a.h.f103024a);
        } else {
            if (zC) {
                throw new oq.p();
            }
            d9(a.c.C2431a.f103015a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jh3.c.a G9(jh3.b bVar) {
        return this.screenMapper.b(new lh3.a.Params(bVar, new er.a() { // from class: jh3.m
            @Override // er.a
            public final Object a() {
                return s.H9(this.f103064a);
            }
        }, new er.l() { // from class: jh3.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.I9(this.f103065a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: jh3.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.J9(this.f103066a, (String) obj);
            }
        }, b9(a.e.f103021a), b9(a.C2430a.f103013a), b9(a.f.f103022a), b9(a.c.C2431a.f103015a), b9(a.c.e.f103019a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(s sVar) {
        sVar.d9(new a.UpdateCodeBottomSheet(true));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(s sVar, boolean z15) {
        sVar.d9(new a.UpdateCodeBottomSheet(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(s sVar, String str) {
        sVar.d9(new a.OnCodeChange(str));
        return i0.f148189a;
    }

    private final dx.b.Business K9() {
        mx.c cVar = this.labelProvider;
        dx.b.Business business = new dx.b.Business(Companion.C2436a.f103089a, dx.b.f.FAILURE, cVar.c(md3.b.f125820s0), null, null, cVar.c(md3.b.f125828t0), cVar.c(md3.b.f125731h), 24, null);
        px.b.y5(this.remoteLogger, "timeout error", null, px.c.a(this), 2, null);
        return business;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<jh3.b> M9(a.ShowError action, c0<jh3.b> state) {
        final dx.b error = action.getError();
        return state.d(new er.l() { // from class: jh3.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.N9(this.f103067a, error, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh3.b.Error N9(s sVar, dx.b bVar, jh3.b bVar2) {
        return new jh3.b.Error(sVar.B9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(jh3.b.class), new er.l() { // from class: jh3.j
            @Override // er.l
            public final Object b(Object obj) {
                return s.P9(this.f103061a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(jh3.b.C2433b.class), new er.l() { // from class: jh3.k
            @Override // er.l
            public final Object b(Object obj) {
                return s.Q9(this.f103062a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(jh3.b.Content.class), new er.l() { // from class: jh3.l
            @Override // er.l
            public final Object b(Object obj) {
                return s.R9(this.f103063a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(s sVar, k10.z zVar) {
        e eVar = sVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.c.class), oVar, eVar);
        zVar.x(q0.c(a.f.class), oVar, sVar.new f(null));
        zVar.v(q0.c(a.ShowError.class), oVar, sVar.new g(null));
        zVar.x(q0.c(a.HandleResultError.class), oVar, sVar.new h(null));
        zVar.v(q0.c(a.g.class), oVar, sVar.new i(null));
        zVar.v(q0.c(a.h.class), oVar, new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(s sVar, k10.z zVar) {
        zVar.C(sVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(s sVar, k10.z zVar) {
        zVar.C(sVar.new l(null));
        m mVar = new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(a.i.class), oVar, mVar);
        zVar.x(q0.c(a.k.class), oVar, sVar.new n(null));
        k10.k.m(zVar, sVar.A9(), null, sVar.new o(null), 2, null);
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: L9, reason: merged with bridge method [inline-methods] */
    public void P5(kh3.a data) {
        d9(a.h.f103024a);
    }

    @Override // zx.b
    public xw.b<a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<jh3.b, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<jh3.c.a> getState() {
        return this.state;
    }
}
