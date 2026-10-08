package w24;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096B¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lw24/m;", "Lk24/a;", "Lv24/b;", "documentsContainerRepository", "Lv24/a;", "certificateRepository", "Lkr0/e;", "notifyAboutDocumentRemovalUC", "Luh0/f;", "beRevokeUserCertificateUC", "Ls24/c;", "containersLocalNotificationsInteractor", "Ls24/b;", "containersInteractor", "Lw24/e;", "clearMainDocumentsFilesUC", "Lw24/c;", "clearMainDocumentsDatabasesUC", "Lpx/d;", "remoteLogger", "<init>", "(Lv24/b;Lv24/a;Lkr0/e;Luh0/f;Ls24/c;Ls24/b;Lw24/e;Lw24/c;Lpx/d;)V", "Lf24/i;", "", "f", "(Lf24/i;Ltq/e;)Ljava/lang/Object;", "Lk24/a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "e", "(Lk24/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/b;", "b", "Lv24/a;", "c", "Lkr0/e;", "d", "Luh0/f;", "Ls24/c;", "Ls24/b;", "g", "Lw24/e;", "h", "Lw24/c;", "i", "Lpx/d;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements k24.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v24.a certificateRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kr0.e notifyAboutDocumentRemovalUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final uh0.f beRevokeUserCertificateUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s24.c containersLocalNotificationsInteractor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final s24.b containersInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e clearMainDocumentsFilesUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final w24.c clearMainDocumentsDatabasesUC;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f209803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f209804b;

        static {
            int[] iArr = new int[f24.b.values().length];
            try {
                iArr[f24.b.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f209803a = iArr;
            int[] iArr2 = new int[f24.i.values().length];
            try {
                iArr2[f24.i.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[f24.i.REFUGEE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[f24.i.STUDENT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f24.i.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            f209804b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {
        int A;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209805d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209808g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209809h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209810j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f209811k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f209812l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f209813m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f209814n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f209815p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f209816q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f209817r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f209818s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f209819t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f209820v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f209821w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f209822x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f209823y;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209823y = obj;
            this.A |= PKIFailureInfo.systemUnavail;
            return m.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209825d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209826e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209827f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f209828g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f209830j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209828g = obj;
            this.f209830j |= PKIFailureInfo.systemUnavail;
            return m.this.f(null, this);
        }
    }

    public m(v24.b bVar, v24.a aVar, kr0.e eVar, uh0.f fVar, s24.c cVar, s24.b bVar2, e eVar2, w24.c cVar2, px.d dVar) {
        this.documentsContainerRepository = bVar;
        this.certificateRepository = aVar;
        this.notifyAboutDocumentRemovalUC = eVar;
        this.beRevokeUserCertificateUC = fVar;
        this.containersLocalNotificationsInteractor = cVar;
        this.containersInteractor = bVar2;
        this.clearMainDocumentsFilesUC = eVar2;
        this.clearMainDocumentsDatabasesUC = cVar2;
        this.remoteLogger = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(f24.i iVar, tq.e<? super Boolean> eVar) throws Throwable {
        c cVar;
        f24.c cVar2;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f209830j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f209830j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f209828g;
        Object objE = uq.b.e();
        int i16 = cVar.f209830j;
        if (i16 == 0) {
            oq.u.b(obj);
            f24.c cVarA = t24.a.a(iVar).a();
            if (cVarA != null) {
                v24.a aVar = this.certificateRepository;
                cVar.f209825d = vq.j.a(iVar);
                cVar.f209826e = vq.j.a(cVarA);
                cVar.f209827f = cVarA;
                cVar.f209830j = 1;
                Object objE2 = aVar.e(true, cVar);
                if (objE2 == objE) {
                    return objE;
                }
                obj = objE2;
                cVar2 = cVarA;
            }
            return vq.b.a(z);
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar2 = (f24.c) cVar.f209827f;
        oq.u.b(obj);
        boolean z15 = cVar2 == ((dx.i) obj).a();
        return vq.b.a(z15);
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0696 A[Catch: Exception -> 0x04c4, c -> 0x04c8, CancellationException -> 0x04cc, TryCatch #15 {c -> 0x04c8, CancellationException -> 0x04cc, Exception -> 0x04c4, blocks: (B:210:0x09fb, B:204:0x09c2, B:206:0x09ca, B:200:0x0956, B:196:0x08e9, B:192:0x08ad, B:182:0x0810, B:184:0x0848, B:186:0x0859, B:191:0x08a6, B:178:0x07ab, B:172:0x075a, B:174:0x0775, B:153:0x0690, B:155:0x0696, B:157:0x06a4, B:159:0x06b2, B:168:0x071d, B:152:0x067c, B:148:0x0638, B:110:0x04b3, B:123:0x0511, B:124:0x0521, B:126:0x0527, B:131:0x054d, B:133:0x0553, B:134:0x0579, B:140:0x05b9, B:144:0x05f7), top: B:280:0x04b3 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x06a4 A[Catch: Exception -> 0x04c4, c -> 0x04c8, CancellationException -> 0x04cc, TryCatch #15 {c -> 0x04c8, CancellationException -> 0x04cc, Exception -> 0x04c4, blocks: (B:210:0x09fb, B:204:0x09c2, B:206:0x09ca, B:200:0x0956, B:196:0x08e9, B:192:0x08ad, B:182:0x0810, B:184:0x0848, B:186:0x0859, B:191:0x08a6, B:178:0x07ab, B:172:0x075a, B:174:0x0775, B:153:0x0690, B:155:0x0696, B:157:0x06a4, B:159:0x06b2, B:168:0x071d, B:152:0x067c, B:148:0x0638, B:110:0x04b3, B:123:0x0511, B:124:0x0521, B:126:0x0527, B:131:0x054d, B:133:0x0553, B:134:0x0579, B:140:0x05b9, B:144:0x05f7), top: B:280:0x04b3 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x06b2 A[Catch: Exception -> 0x04c4, c -> 0x04c8, CancellationException -> 0x04cc, TryCatch #15 {c -> 0x04c8, CancellationException -> 0x04cc, Exception -> 0x04c4, blocks: (B:210:0x09fb, B:204:0x09c2, B:206:0x09ca, B:200:0x0956, B:196:0x08e9, B:192:0x08ad, B:182:0x0810, B:184:0x0848, B:186:0x0859, B:191:0x08a6, B:178:0x07ab, B:172:0x075a, B:174:0x0775, B:153:0x0690, B:155:0x0696, B:157:0x06a4, B:159:0x06b2, B:168:0x071d, B:152:0x067c, B:148:0x0638, B:110:0x04b3, B:123:0x0511, B:124:0x0521, B:126:0x0527, B:131:0x054d, B:133:0x0553, B:134:0x0579, B:140:0x05b9, B:144:0x05f7), top: B:280:0x04b3 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0701  */
    /* JADX WARN: Code duplicated, block: B:162:0x0703  */
    /* JADX WARN: Code duplicated, block: B:165:0x0710  */
    /* JADX WARN: Code duplicated, block: B:166:0x0714  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0151: MOVE (r4 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:46:0x0151 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0156: MOVE (r4 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:48:0x0156 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x015b: MOVE (r4 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:50:0x015b */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x02e9: MOVE (r4 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:77:0x02e9 */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x02ee: MOVE (r4 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:79:0x02ee */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x02f3: MOVE (r4 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:81:0x02f3 */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.Object, w24.m] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v172 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v181 */
    /* JADX WARN: Type inference failed for: r4v184 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x0703 -> B:163:0x0709). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(k24.a.Params r29, tq.e<? super dx.i<? extends dx.b, oq.i0>> r30) {
        /*
            Method dump skipped, instruction units count: 3150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w24.m.c(k24.a$a, tq.e):java.lang.Object");
    }
}
