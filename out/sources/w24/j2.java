package w24;

import f24.CertificateData;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J(\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u0019*\u00020\u0014H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!0\u00192\u0006\u0010 \u001a\u00020\u001fH\u0096B¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010/¨\u00060"}, d2 = {"Lw24/j2;", "Lk24/l;", "Lv24/a;", "certificateRepository", "Lv24/b;", "documentsContainerRepository", "Lkr0/d;", "getDocumentsStatusesUC", "Ls24/b;", "containersInteractor", "Lpx/d;", "remoteLogger", "Ld00/a;", "inMemoryCache", "Lk24/j;", "hasDocumentActiveParentCertificateUC", "Ls24/c;", "containersLocalNotificationsInteractor", "<init>", "(Lv24/a;Lv24/b;Lkr0/d;Ls24/b;Lpx/d;Ld00/a;Lk24/j;Ls24/c;)V", "Lf24/i;", "", "g", "(Lf24/i;)Z", "h", "Ldx/i;", "Ldx/b;", "", "kotlin.jvm.PlatformType", "f", "(Lf24/i;Ltq/e;)Ljava/lang/Object;", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lv24/a;", "b", "Lv24/b;", "c", "Lkr0/d;", "d", "Ls24/b;", "e", "Lpx/d;", "Ld00/a;", "Lk24/j;", "Ls24/c;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j2 implements k24.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.a certificateRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kr0.d getDocumentsStatusesUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s24.b containersInteractor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d00.a inMemoryCache;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k24.j hasDocumentActiveParentCertificateUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final s24.c containersLocalNotificationsInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f209681a;

        static {
            int[] iArr = new int[f24.i.values().length];
            try {
                iArr[f24.i.STUDENT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f24.i.VEHICLE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f24.i.REFUGEE_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f24.i.REFUGEE_CHILD_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f209681a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209684f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209685g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209686h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f209687j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f209688k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f209689l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f209690m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209691n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f209692p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f209694r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209692p = obj;
            this.f209694r |= PKIFailureInfo.systemUnavail;
            return j2.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {
        int A;
        int B;
        int C;
        int D;
        int E;
        int F;
        int G;
        /* synthetic */ Object H;
        int K;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209698g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209699h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209700j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f209701k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f209702l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f209703m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f209704n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f209705p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f209706q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f209707r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f209708s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f209709t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f209710v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f209711w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f209712x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f209713y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f209714z;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.H = obj;
            this.K |= PKIFailureInfo.systemUnavail;
            return j2.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209715e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f209715e;
            if (i15 == 0) {
                oq.u.b(obj);
                s24.b bVar = j2.this.containersInteractor;
                this.f209715e = 1;
                if (bVar.f(this) == objE) {
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

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return j2.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((d) M(eVar)).J(oq.i0.f148189a);
        }
    }

    public j2(v24.a aVar, v24.b bVar, kr0.d dVar, s24.b bVar2, px.d dVar2, d00.a aVar2, k24.j jVar, s24.c cVar) {
        this.certificateRepository = aVar;
        this.documentsContainerRepository = bVar;
        this.getDocumentsStatusesUC = dVar;
        this.containersInteractor = bVar2;
        this.remoteLogger = dVar2;
        this.inMemoryCache = aVar2;
        this.hasDocumentActiveParentCertificateUC = jVar;
        this.containersLocalNotificationsInteractor = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final Object f(f24.i iVar, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.b bVar2;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f209694r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f209694r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f209692p;
        ?? E = uq.b.e();
        int i16 = bVar.f209694r;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        v24.a aVar2 = this.certificateRepository;
                        f24.c cVar = (f24.c) aVar.a(t24.a.a(iVar));
                        bVar.f209682d = vq.j.a(iVar);
                        bVar.f209683e = jVarA;
                        bVar.f209684f = vq.j.a(aVar);
                        bVar.f209685g = vq.j.a(aVar);
                        bVar.f209686h = aVar;
                        bVar.f209687j = 0;
                        bVar.f209688k = 0;
                        bVar.f209689l = 0;
                        bVar.f209690m = 0;
                        bVar.f209691n = 0;
                        bVar.f209694r = 1;
                        Object objB2 = aVar2.b(cVar, bVar);
                        if (objB2 == E) {
                            return E;
                        }
                        obj = objB2;
                        bVar2 = aVar;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) bVar.f209686h;
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(((CertificateData) bVar2.a((dx.i) obj)).getCertKeyPair().getCertificate().getSerialNumber().toString(16));
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    private final boolean g(f24.i iVar) {
        return a.f209681a[iVar.ordinal()] == 1;
    }

    private final boolean h(f24.i iVar) {
        int i15 = a.f209681a[iVar.ordinal()];
        return (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x061b A[Catch: Exception -> 0x06cb, c -> 0x06ce, CancellationException -> 0x06d1, TRY_LEAVE, TryCatch #39 {c -> 0x06ce, CancellationException -> 0x06d1, Exception -> 0x06cb, blocks: (B:137:0x0605, B:139:0x061b), top: B:371:0x0605 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0678  */
    /* JADX WARN: Code duplicated, block: B:148:0x0698 A[Catch: Exception -> 0x06a6, c -> 0x06aa, CancellationException -> 0x06ae, TryCatch #42 {c -> 0x06aa, CancellationException -> 0x06ae, Exception -> 0x06a6, blocks: (B:333:0x0e49, B:336:0x0e67, B:307:0x0d44, B:309:0x0d4a, B:310:0x0d5a, B:312:0x0d60, B:317:0x0d8c, B:319:0x0d90, B:320:0x0d9d, B:322:0x0da3, B:327:0x0db9, B:329:0x0dbd, B:185:0x07b4, B:189:0x07ca, B:306:0x0d2a, B:184:0x0793, B:146:0x068e, B:148:0x0698, B:135:0x05ff, B:142:0x066b, B:171:0x06f0, B:173:0x0700, B:176:0x0709, B:177:0x0721, B:179:0x0727, B:180:0x0737), top: B:365:0x068e }] */
    /* JADX WARN: Code duplicated, block: B:371:0x0605 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x00a0: MOVE (r4 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:16:0x00a0 */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x00a5: MOVE (r4 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:18:0x00a5 */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x00aa: MOVE (r4 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:20:0x00aa */
    /* JADX WARN: Not initialized variable reg: 27, insn: 0x019f: MOVE (r4 I:??[OBJECT, ARRAY]) = (r27 I:??[OBJECT, ARRAY]), block:B:28:0x019f */
    /* JADX WARN: Not initialized variable reg: 27, insn: 0x01a4: MOVE (r4 I:??[OBJECT, ARRAY]) = (r27 I:??[OBJECT, ARRAY]), block:B:30:0x01a4 */
    /* JADX WARN: Not initialized variable reg: 27, insn: 0x01a9: MOVE (r4 I:??[OBJECT, ARRAY]) = (r27 I:??[OBJECT, ARRAY]), block:B:32:0x01a9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v112 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v185 */
    /* JADX WARN: Type inference failed for: r4v188 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v239 */
    /* JADX WARN: Type inference failed for: r4v267 */
    /* JADX WARN: Type inference failed for: r4v268 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v7, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v87 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0678 -> B:365:0x068e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x06d4 -> B:156:0x06bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:284:0x0ca8 -> B:285:0x0cb4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:286:0x0cc0 -> B:369:0x0cc6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:291:0x0ce1 -> B:292:0x0cf6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:332:0x0e3b -> B:333:0x0e49). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:335:0x0e5b -> B:334:0x0e58). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:338:0x0e6a -> B:339:0x0e77). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(gz.b.a.C1792a r36, tq.e<? super dx.i<? extends dx.b, oq.i0>> r37) {
        /*
            Method dump skipped, instruction units count: 3824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w24.j2.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
