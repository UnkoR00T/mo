package tz3;

import gr0.DocumentSchema;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0015\u0010\u0014J(\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u001e\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ltz3/c1;", "Ltz3/b1;", "Lsz3/a;", "downloadDocumentRepository", "Lc54/b;", "isFeatureEnabledUseCase", "Lpx/d;", "remoteLogger", "Lmz3/a0;", "updateDocumentDownloadStatusUseCase", "Lqz3/b;", "asyncDownloadInteractor", "<init>", "(Lsz3/a;Lc54/b;Lpx/d;Lmz3/a0;Lqz3/b;)V", "Ltz3/b1$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "g", "(Ltz3/b1$a;Ltq/e;)Ljava/lang/Object;", "h", "Lrq0/b;", "documentType", "Llz3/d;", "methodType", "", "documentIID", "i", "(Lrq0/b;Llz3/d;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "j", "a", "Lsz3/a;", "b", "Lc54/b;", "c", "Lpx/d;", "d", "Lmz3/a0;", "e", "Lqz3/b;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sz3.a downloadDocumentRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mz3.a0 updateDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final qz3.b asyncDownloadInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f192956b;

        static {
            int[] iArr = new int[fr0.i.values().length];
            try {
                iArr[fr0.i.BY_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f192955a = iArr;
            int[] iArr2 = new int[lz3.d.values().length];
            try {
                iArr2[lz3.d.DOCUMENT_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[lz3.d.DOCUMENT_REDOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[lz3.d.FIRST_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f192956b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f192960g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f192961h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f192962j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f192963k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f192964l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f192965m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f192966n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f192967p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f192968q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f192969r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f192970s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f192971t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f192973w;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f192971t = obj;
            this.f192973w |= PKIFailureInfo.systemUnavail;
            return c1.this.g(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192976f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f192977g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f192978h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f192979j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f192980k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f192981l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f192982m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f192983n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f192984p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f192985q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f192986r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f192987s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f192989v;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f192987s = obj;
            this.f192989v |= PKIFailureInfo.systemUnavail;
            return c1.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f192993g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f192995j;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f192993g = obj;
            this.f192995j |= PKIFailureInfo.systemUnavail;
            return c1.this.i(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f192999g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f193000h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f193001j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f193002k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f193003l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f193004m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f193005n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f193007q;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193005n = obj;
            this.f193007q |= PKIFailureInfo.systemUnavail;
            return c1.this.c(null, this);
        }
    }

    public c1(sz3.a aVar, c54.b bVar, px.d dVar, mz3.a0 a0Var, qz3.b bVar2) {
        this.downloadDocumentRepository = aVar;
        this.isFeatureEnabledUseCase = bVar;
        this.remoteLogger = dVar;
        this.updateDocumentDownloadStatusUseCase = a0Var;
        this.asyncDownloadInteractor = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:125:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:126:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:133:0x041d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0459  */
    /* JADX WARN: Code duplicated, block: B:172:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:175:0x04d0 A[Catch: Exception -> 0x008c, c -> 0x0090, CancellationException -> 0x0094, TryCatch #19 {c -> 0x0090, CancellationException -> 0x0094, Exception -> 0x008c, blocks: (B:23:0x007f, B:196:0x0573, B:198:0x057d, B:200:0x0581, B:202:0x0585, B:205:0x058a, B:206:0x0590, B:173:0x04cb, B:175:0x04d0, B:177:0x04ff, B:180:0x0506, B:182:0x050c, B:184:0x0517, B:187:0x051d, B:189:0x0521, B:192:0x0529, B:212:0x05dd, B:214:0x05e6, B:219:0x05f4, B:220:0x05f9, B:128:0x03d4, B:123:0x038b, B:62:0x01c1, B:113:0x032b, B:114:0x0334, B:115:0x0339, B:119:0x0375, B:164:0x049d), top: B:239:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x04ff A[Catch: Exception -> 0x008c, c -> 0x0090, CancellationException -> 0x0094, TryCatch #19 {c -> 0x0090, CancellationException -> 0x0094, Exception -> 0x008c, blocks: (B:23:0x007f, B:196:0x0573, B:198:0x057d, B:200:0x0581, B:202:0x0585, B:205:0x058a, B:206:0x0590, B:173:0x04cb, B:175:0x04d0, B:177:0x04ff, B:180:0x0506, B:182:0x050c, B:184:0x0517, B:187:0x051d, B:189:0x0521, B:192:0x0529, B:212:0x05dd, B:214:0x05e6, B:219:0x05f4, B:220:0x05f9, B:128:0x03d4, B:123:0x038b, B:62:0x01c1, B:113:0x032b, B:114:0x0334, B:115:0x0339, B:119:0x0375, B:164:0x049d), top: B:239:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0503  */
    /* JADX WARN: Code duplicated, block: B:180:0x0506 A[Catch: Exception -> 0x008c, c -> 0x0090, CancellationException -> 0x0094, TryCatch #19 {c -> 0x0090, CancellationException -> 0x0094, Exception -> 0x008c, blocks: (B:23:0x007f, B:196:0x0573, B:198:0x057d, B:200:0x0581, B:202:0x0585, B:205:0x058a, B:206:0x0590, B:173:0x04cb, B:175:0x04d0, B:177:0x04ff, B:180:0x0506, B:182:0x050c, B:184:0x0517, B:187:0x051d, B:189:0x0521, B:192:0x0529, B:212:0x05dd, B:214:0x05e6, B:219:0x05f4, B:220:0x05f9, B:128:0x03d4, B:123:0x038b, B:62:0x01c1, B:113:0x032b, B:114:0x0334, B:115:0x0339, B:119:0x0375, B:164:0x049d), top: B:239:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x050b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0517 A[Catch: Exception -> 0x008c, c -> 0x0090, CancellationException -> 0x0094, TryCatch #19 {c -> 0x0090, CancellationException -> 0x0094, Exception -> 0x008c, blocks: (B:23:0x007f, B:196:0x0573, B:198:0x057d, B:200:0x0581, B:202:0x0585, B:205:0x058a, B:206:0x0590, B:173:0x04cb, B:175:0x04d0, B:177:0x04ff, B:180:0x0506, B:182:0x050c, B:184:0x0517, B:187:0x051d, B:189:0x0521, B:192:0x0529, B:212:0x05dd, B:214:0x05e6, B:219:0x05f4, B:220:0x05f9, B:128:0x03d4, B:123:0x038b, B:62:0x01c1, B:113:0x032b, B:114:0x0334, B:115:0x0339, B:119:0x0375, B:164:0x049d), top: B:239:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:214:0x05e6 A[Catch: Exception -> 0x008c, c -> 0x0090, CancellationException -> 0x0094, TRY_LEAVE, TryCatch #19 {c -> 0x0090, CancellationException -> 0x0094, Exception -> 0x008c, blocks: (B:23:0x007f, B:196:0x0573, B:198:0x057d, B:200:0x0581, B:202:0x0585, B:205:0x058a, B:206:0x0590, B:173:0x04cb, B:175:0x04d0, B:177:0x04ff, B:180:0x0506, B:182:0x050c, B:184:0x0517, B:187:0x051d, B:189:0x0521, B:192:0x0529, B:212:0x05dd, B:214:0x05e6, B:219:0x05f4, B:220:0x05f9, B:128:0x03d4, B:123:0x038b, B:62:0x01c1, B:113:0x032b, B:114:0x0334, B:115:0x0339, B:119:0x0375, B:164:0x049d), top: B:239:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x05f4 A[Catch: Exception -> 0x008c, c -> 0x0090, CancellationException -> 0x0094, TRY_ENTER, TryCatch #19 {c -> 0x0090, CancellationException -> 0x0094, Exception -> 0x008c, blocks: (B:23:0x007f, B:196:0x0573, B:198:0x057d, B:200:0x0581, B:202:0x0585, B:205:0x058a, B:206:0x0590, B:173:0x04cb, B:175:0x04d0, B:177:0x04ff, B:180:0x0506, B:182:0x050c, B:184:0x0517, B:187:0x051d, B:189:0x0521, B:192:0x0529, B:212:0x05dd, B:214:0x05e6, B:219:0x05f4, B:220:0x05f9, B:128:0x03d4, B:123:0x038b, B:62:0x01c1, B:113:0x032b, B:114:0x0334, B:115:0x0339, B:119:0x0375, B:164:0x049d), top: B:239:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x0611  */
    /* JADX WARN: Code duplicated, block: B:230:0x0622  */
    /* JADX WARN: Code duplicated, block: B:231:0x0630  */
    /* JADX WARN: Code duplicated, block: B:233:0x0634  */
    /* JADX WARN: Code duplicated, block: B:236:0x0641  */
    /* JADX WARN: Code duplicated, block: B:246:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0294  */
    /* JADX WARN: Code duplicated, block: B:85:0x029e A[Catch: Exception -> 0x04b1, c -> 0x04b5, CancellationException -> 0x04b9, TryCatch #21 {c -> 0x04b5, CancellationException -> 0x04b9, Exception -> 0x04b1, blocks: (B:81:0x0272, B:89:0x02af, B:88:0x02ab, B:85:0x029e), top: B:246:0x0272 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ab A[Catch: Exception -> 0x04b1, c -> 0x04b5, CancellationException -> 0x04b9, TryCatch #21 {c -> 0x04b5, CancellationException -> 0x04b9, Exception -> 0x04b1, blocks: (B:81:0x0272, B:89:0x02af, B:88:0x02ab, B:85:0x029e), top: B:246:0x0272 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02fb A[Catch: Exception -> 0x0491, c -> 0x0495, CancellationException -> 0x0499, TryCatch #18 {c -> 0x0495, CancellationException -> 0x0499, Exception -> 0x0491, blocks: (B:93:0x02f1, B:95:0x02fb, B:97:0x02ff, B:99:0x0303, B:101:0x0307, B:103:0x030b, B:106:0x0316, B:116:0x033a), top: B:248:0x02f1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x04d0, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00c6: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:35:0x00c6 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00ca: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:37:0x00ca */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00ce: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:39:0x00ce */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0110: MOVE (r2 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:44:0x0110 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0114: MOVE (r2 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:46:0x0114 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0118: MOVE (r2 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:48:0x0118 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v57 */
    public final Object g(b1.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        b bVar;
        Object obj;
        Object obj2;
        dx.j<dx.b> jVar;
        dx.j<dx.b> jVar2;
        dx.j<dx.b> jVar3;
        String message;
        dx.i iVarA;
        Object objB;
        b1.Params params2;
        ex.b bVar2;
        dx.j<dx.b> jVar4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar3;
        dx.i iVar;
        oq.i0 i0Var;
        qz3.b bVar4;
        rq0.b documentType;
        String documentId;
        fz.b.LocalDate documentExpirationDate;
        fr0.i documentStoringMode;
        int i25;
        boolean documentTypeFirstEvent;
        ex.b bVar5;
        int i26;
        int i27;
        int i28;
        int i29;
        ex.b bVar6;
        int i35;
        dx.i iVar2;
        dx.j<dx.b> jVar5;
        oq.i0 i0Var2;
        int i36;
        ?? r15;
        c1 c1Var;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        ex.b bVar7;
        ?? r16;
        dx.i iVar3;
        rq0.b documentType2;
        oq.i0 i0Var3;
        ?? r17;
        b1.Params params3;
        c1 c1Var2;
        int i47;
        int i48;
        ex.b bVar8;
        qz3.b bVar9;
        c1 c1Var3;
        int i49;
        ex.b bVar10;
        int i55;
        dx.i iVar4;
        int i56;
        int i57;
        int i58;
        int i59;
        b1.Params params4;
        b1.Params params5;
        oq.i0 i0Var4;
        ?? r18;
        dx.j<dx.b> jVar6;
        ?? r19;
        b1.Params params6;
        ex.b bVar11;
        dx.i iVar5;
        b1.Params params7;
        dx.j<dx.b> jVar7;
        ex.b bVar12;
        ?? r25;
        oq.i0 i0Var5;
        Object objC;
        ?? r110;
        ex.b bVar13;
        b1.Params params8;
        ?? r26;
        ?? r111;
        ?? r112;
        qz3.b bVar14;
        ex.b bVar15;
        rq0.b documentType3;
        ?? r113;
        ?? r114;
        dx.b bVar16;
        dx.b.Generic generic;
        Throwable e15;
        rq0.b documentType4;
        dx.i iVar6;
        int i65;
        ex.b bVar17;
        int i66;
        int i67;
        dx.i iVar7;
        ?? r115;
        ?? r27;
        rq0.b documentType5;
        sz3.a aVar;
        String taskId;
        String documentId2;
        ?? r28;
        ?? r116;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i68 = bVar.f192973w;
            if ((i68 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f192973w = i68 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        b bVar18 = bVar;
        Object obj3 = bVar18.f192971t;
        ?? E = uq.b.e();
        try {
            try {
                try {
                    try {
                        try {
                            switch (bVar18.f192973w) {
                                case 0:
                                    oq.u.b(obj3);
                                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                    ex.a aVar2 = new ex.a();
                                    qz3.b bVar19 = this.asyncDownloadInteractor;
                                    boolean documentTypeFirstEvent2 = params.getDocumentTypeFirstEvent();
                                    String documentId3 = params.getDocumentId();
                                    String parentDocumentId = params.getParentDocumentId();
                                    fz.b.LocalDate documentExpirationDate2 = params.getDocumentExpirationDate();
                                    String documentScope = params.getDocumentScope();
                                    rq0.b documentType6 = params.getDocumentType();
                                    DocumentSchema documentSchema = params.getDocumentSchema();
                                    params2 = params;
                                    bVar18.f192957d = params2;
                                    bVar18.f192958e = jVarA;
                                    bVar18.f192959f = vq.j.a(aVar2);
                                    bVar18.f192960g = aVar2;
                                    bVar18.f192964l = 0;
                                    bVar18.f192965m = 0;
                                    bVar18.f192966n = 0;
                                    bVar18.f192967p = 0;
                                    bVar18.f192968q = 0;
                                    bVar18.f192973w = 1;
                                    Object objG = bVar19.g(documentSchema, documentTypeFirstEvent2, documentId3, parentDocumentId, documentExpirationDate2, documentScope, documentType6, bVar18);
                                    bVar18 = bVar18;
                                    r18 = E;
                                    if (objG != E) {
                                        bVar2 = aVar2;
                                        jVar4 = jVarA;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        i19 = 0;
                                        obj3 = objG;
                                        bVar3 = bVar2;
                                        iVar = (dx.i) obj3;
                                        if (iVar instanceof dx.i.Right) {
                                            try {
                                                i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                                                bVar4 = this.asyncDownloadInteractor;
                                                documentType = params2.getDocumentType();
                                                documentId = params2.getDocumentId();
                                                documentExpirationDate = params2.getDocumentExpirationDate();
                                                documentStoringMode = params2.getDocumentStoringMode();
                                                if (documentStoringMode == null) {
                                                    i25 = -1;
                                                } else {
                                                    i25 = a.f192955a[documentStoringMode.ordinal()];
                                                }
                                                if (i25 == 1) {
                                                    documentTypeFirstEvent = false;
                                                } else {
                                                    documentTypeFirstEvent = params2.getDocumentTypeFirstEvent();
                                                }
                                                bVar18.f192957d = params2;
                                                bVar18.f192958e = jVar4;
                                                bVar18.f192959f = vq.j.a(bVar2);
                                                bVar18.f192960g = bVar3;
                                                bVar18.f192961h = iVar;
                                                bVar18.f192962j = vq.j.a(i0Var);
                                                bVar18.f192964l = i19;
                                                bVar18.f192965m = i18;
                                                bVar18.f192966n = i17;
                                                bVar18.f192967p = i16;
                                                bVar18.f192968q = i15;
                                                bVar18.f192969r = 0;
                                                bVar18.f192970s = 0;
                                                bVar18.f192973w = 2;
                                                bVar5 = bVar3;
                                                r18 = E;
                                                if (bVar4.k(documentType, documentId, documentExpirationDate, documentTypeFirstEvent, bVar18) != E) {
                                                    i26 = i15;
                                                    i27 = i16;
                                                    i28 = i17;
                                                    i29 = i18;
                                                    bVar6 = bVar5;
                                                    i35 = 0;
                                                    iVar2 = iVar;
                                                    jVar5 = jVar4;
                                                    i0Var2 = i0Var;
                                                    i36 = 0;
                                                    try {
                                                        documentType2 = params2.getDocumentType();
                                                        i0Var3 = i0Var2;
                                                        if (documentType2 == rq0.b.d.DIIA_REFUGEE_CHILD_CARD && documentType2 != rq0.b.d.VEHICLE_CARD && documentType2 != rq0.b.d.FAMILY_CARD && documentType2 != rq0.b.d.DRIVING_LICENCE && documentType2 != rq0.b.d.RAILWAY_CARD && !(documentType2 instanceof rq0.b.c)) {
                                                            int i69 = a.f192956b[params2.getDownloadMethod().ordinal()];
                                                            if (i69 != 1 && i69 != 2) {
                                                                if (i69 != 3) {
                                                                    throw new oq.p();
                                                                }
                                                                oq.i0 i0Var6 = oq.i0.f148189a;
                                                                b1.Params params9 = params2;
                                                                c1Var3 = this;
                                                                params5 = params9;
                                                                i0Var4 = i0Var3;
                                                                r25 = E;
                                                                jVar5 = jVar5;
                                                                mz3.a0 a0Var = c1Var3.updateDocumentDownloadStatusUseCase;
                                                                i0Var5 = i0Var4;
                                                                ?? r117 = r25;
                                                                mz3.a0.Params params10 = new mz3.a0.Params(params5.getDocumentType(), lz3.h.ALREADY_DOWNLOADED, params5.getDocumentId());
                                                                bVar18.f192957d = params5;
                                                                bVar18.f192958e = jVar5;
                                                                bVar18.f192959f = vq.j.a(bVar2);
                                                                bVar18.f192960g = bVar6;
                                                                bVar18.f192961h = iVar2;
                                                                bVar18.f192962j = vq.j.a(i0Var5);
                                                                bVar18.f192964l = i19;
                                                                bVar18.f192965m = i29;
                                                                bVar18.f192966n = i28;
                                                                bVar18.f192967p = i27;
                                                                bVar18.f192968q = i26;
                                                                bVar18.f192969r = i35;
                                                                bVar18.f192970s = i36;
                                                                bVar18.f192973w = 5;
                                                                objC = a0Var.c(params10, bVar18);
                                                                r110 = r117;
                                                                r111 = r110;
                                                                if (objC != r110) {
                                                                    c1Var2 = this;
                                                                    E = jVar5;
                                                                    bVar13 = bVar2;
                                                                    params8 = params5;
                                                                    r112 = r110;
                                                                    bVar14 = c1Var2.asyncDownloadInteractor;
                                                                    bVar15 = bVar13;
                                                                    documentType3 = params8.getDocumentType();
                                                                    bVar18.f192957d = params8;
                                                                    bVar18.f192958e = E;
                                                                    r113 = E;
                                                                    bVar18.f192959f = vq.j.a(bVar15);
                                                                    bVar18.f192960g = bVar6;
                                                                    bVar18.f192961h = iVar2;
                                                                    bVar18.f192962j = vq.j.a(i0Var5);
                                                                    bVar18.f192964l = i19;
                                                                    bVar18.f192965m = i29;
                                                                    bVar18.f192966n = i28;
                                                                    bVar18.f192967p = i27;
                                                                    bVar18.f192968q = i26;
                                                                    bVar18.f192969r = i35;
                                                                    bVar18.f192970s = i36;
                                                                    bVar18.f192973w = 6;
                                                                    r111 = r112;
                                                                    if (bVar14.f(documentType3, bVar18) != r112) {
                                                                        params3 = params8;
                                                                        r114 = r113;
                                                                        i47 = i28;
                                                                        i48 = i19;
                                                                        bVar8 = bVar15;
                                                                        r17 = r112;
                                                                    }
                                                                }
                                                                return r111;
                                                            }
                                                            bVar9 = this.asyncDownloadInteractor;
                                                            rq0.b documentType7 = params2.getDocumentType();
                                                            String documentId4 = params2.getDocumentId();
                                                            try {
                                                                lz3.d downloadMethod = params2.getDownloadMethod();
                                                                bVar18.f192957d = params2;
                                                                bVar18.f192958e = jVar5;
                                                                b1.Params params11 = params2;
                                                                bVar18.f192959f = vq.j.a(bVar2);
                                                                bVar18.f192960g = bVar6;
                                                                bVar18.f192961h = iVar2;
                                                                bVar18.f192962j = vq.j.a(i0Var3);
                                                                bVar18.f192963k = bVar9;
                                                                bVar18.f192964l = i19;
                                                                bVar18.f192965m = i29;
                                                                bVar18.f192966n = i28;
                                                                bVar18.f192967p = i27;
                                                                bVar18.f192968q = i26;
                                                                bVar18.f192969r = i35;
                                                                bVar18.f192970s = i36;
                                                                bVar18.f192973w = 3;
                                                                c1Var3 = this;
                                                                Object objI = c1Var3.i(documentType7, downloadMethod, documentId4, bVar18);
                                                                ?? r29 = E;
                                                                if (objI == r29) {
                                                                    r18 = r29;
                                                                } else {
                                                                    i49 = i36;
                                                                    obj3 = objI;
                                                                    bVar10 = bVar6;
                                                                    i55 = i19;
                                                                    iVar4 = iVar2;
                                                                    i56 = i29;
                                                                    i57 = i27;
                                                                    i58 = i35;
                                                                    i59 = i26;
                                                                    params4 = params11;
                                                                    r19 = r29;
                                                                    jVar6 = jVar5;
                                                                    bVar18.f192957d = params4;
                                                                    bVar18.f192958e = jVar6;
                                                                    params6 = params4;
                                                                    bVar18.f192959f = vq.j.a(bVar2);
                                                                    bVar18.f192960g = bVar10;
                                                                    bVar18.f192961h = iVar4;
                                                                    bVar18.f192962j = vq.j.a(i0Var3);
                                                                    bVar18.f192963k = null;
                                                                    bVar18.f192964l = i55;
                                                                    bVar18.f192965m = i56;
                                                                    bVar18.f192966n = i28;
                                                                    bVar18.f192967p = i57;
                                                                    bVar18.f192968q = i59;
                                                                    bVar18.f192969r = i58;
                                                                    bVar18.f192970s = i49;
                                                                    bVar18.f192973w = 4;
                                                                    if (bVar9.o((String) obj3, bVar18) != r19) {
                                                                        i0Var4 = i0Var3;
                                                                        bVar11 = bVar10;
                                                                        iVar5 = iVar4;
                                                                        params7 = params6;
                                                                        jVar7 = jVar6;
                                                                        bVar12 = bVar2;
                                                                        r26 = r19;
                                                                        bVar2 = bVar12;
                                                                        jVar5 = jVar7;
                                                                        i19 = i55;
                                                                        bVar6 = bVar11;
                                                                        i36 = i49;
                                                                        params5 = params7;
                                                                        i26 = i59;
                                                                        i35 = i58;
                                                                        i27 = i57;
                                                                        i29 = i56;
                                                                        iVar2 = iVar5;
                                                                        r25 = r26;
                                                                        mz3.a0 a0Var2 = c1Var3.updateDocumentDownloadStatusUseCase;
                                                                        i0Var5 = i0Var4;
                                                                        ?? r118 = r25;
                                                                        mz3.a0.Params params12 = new mz3.a0.Params(params5.getDocumentType(), lz3.h.ALREADY_DOWNLOADED, params5.getDocumentId());
                                                                        bVar18.f192957d = params5;
                                                                        bVar18.f192958e = jVar5;
                                                                        bVar18.f192959f = vq.j.a(bVar2);
                                                                        bVar18.f192960g = bVar6;
                                                                        bVar18.f192961h = iVar2;
                                                                        bVar18.f192962j = vq.j.a(i0Var5);
                                                                        bVar18.f192964l = i19;
                                                                        bVar18.f192965m = i29;
                                                                        bVar18.f192966n = i28;
                                                                        bVar18.f192967p = i27;
                                                                        bVar18.f192968q = i26;
                                                                        bVar18.f192969r = i35;
                                                                        bVar18.f192970s = i36;
                                                                        bVar18.f192973w = 5;
                                                                        objC = a0Var2.c(params12, bVar18);
                                                                        r110 = r118;
                                                                        r111 = r110;
                                                                        if (objC != r110) {
                                                                            c1Var2 = this;
                                                                            E = jVar5;
                                                                            bVar13 = bVar2;
                                                                            params8 = params5;
                                                                            r112 = r110;
                                                                            try {
                                                                                bVar14 = c1Var2.asyncDownloadInteractor;
                                                                                bVar15 = bVar13;
                                                                                documentType3 = params8.getDocumentType();
                                                                                bVar18.f192957d = params8;
                                                                                bVar18.f192958e = E;
                                                                                r113 = E;
                                                                                try {
                                                                                    bVar18.f192959f = vq.j.a(bVar15);
                                                                                    bVar18.f192960g = bVar6;
                                                                                    bVar18.f192961h = iVar2;
                                                                                    bVar18.f192962j = vq.j.a(i0Var5);
                                                                                    bVar18.f192964l = i19;
                                                                                    bVar18.f192965m = i29;
                                                                                    bVar18.f192966n = i28;
                                                                                    bVar18.f192967p = i27;
                                                                                    bVar18.f192968q = i26;
                                                                                    bVar18.f192969r = i35;
                                                                                    bVar18.f192970s = i36;
                                                                                    bVar18.f192973w = 6;
                                                                                    r111 = r112;
                                                                                    if (bVar14.f(documentType3, bVar18) != r112) {
                                                                                        params3 = params8;
                                                                                        r114 = r113;
                                                                                        i47 = i28;
                                                                                        i48 = i19;
                                                                                        bVar8 = bVar15;
                                                                                        r17 = r112;
                                                                                    }
                                                                                } catch (ex.c e16) {
                                                                                    e = e16;
                                                                                } catch (CancellationException e17) {
                                                                                    throw e17;
                                                                                } catch (Exception e18) {
                                                                                    e = e18;
                                                                                    E = r113;
                                                                                    px.f fVar = px.f.f163100a;
                                                                                    message = e.getMessage();
                                                                                    if (message == null) {
                                                                                        message = "";
                                                                                    }
                                                                                    fVar.d(message, e, px.c.a(E));
                                                                                    iVarA = E.a(e);
                                                                                    if (iVarA instanceof dx.i.Left) {
                                                                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                                                    } else {
                                                                                        if (iVarA instanceof dx.i.Right) {
                                                                                            throw new oq.p();
                                                                                        }
                                                                                        objB = ((dx.i.Right) iVarA).b();
                                                                                    }
                                                                                    return new dx.i.Left(objB);
                                                                                }
                                                                            } catch (ex.c e19) {
                                                                                e = e19;
                                                                            } catch (CancellationException e25) {
                                                                                throw e25;
                                                                            } catch (Exception e26) {
                                                                                e = e26;
                                                                            }
                                                                        }
                                                                        return r111;
                                                                    }
                                                                    r18 = r19;
                                                                }
                                                            } catch (ex.c e27) {
                                                                e = e27;
                                                                jVar3 = jVar5;
                                                            } catch (CancellationException e28) {
                                                                e = e28;
                                                                jVar2 = jVar5;
                                                                throw e;
                                                            } catch (Exception e29) {
                                                                e = e29;
                                                                jVar = jVar5;
                                                                E = jVar;
                                                                px.f fVar2 = px.f.f163100a;
                                                                message = e.getMessage();
                                                                if (message == null) {
                                                                    message = "";
                                                                }
                                                                fVar2.d(message, e, px.c.a(E));
                                                                iVarA = E.a(e);
                                                                if (iVarA instanceof dx.i.Left) {
                                                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                                } else {
                                                                    if (iVarA instanceof dx.i.Right) {
                                                                        throw new oq.p();
                                                                    }
                                                                    objB = ((dx.i.Right) iVarA).b();
                                                                }
                                                                return new dx.i.Left(objB);
                                                            }
                                                            return new dx.i.Left((dx.b) ex.d.a(e));
                                                        }
                                                        r17 = E;
                                                        params3 = params2;
                                                        c1Var2 = this;
                                                        oq.i0 i0Var7 = oq.i0.f148189a;
                                                        i47 = i28;
                                                        i48 = i19;
                                                        bVar8 = bVar2;
                                                        r114 = jVar5;
                                                        bVar2 = bVar8;
                                                        c1Var = c1Var2;
                                                        params2 = params3;
                                                        iVar3 = iVar2;
                                                        i46 = i48;
                                                        i45 = i29;
                                                        i39 = i47;
                                                        i38 = i27;
                                                        i37 = i26;
                                                        r15 = r17;
                                                        bVar7 = bVar6;
                                                        r16 = r114;
                                                    } catch (ex.c e35) {
                                                        e = e35;
                                                        jVar3 = jVar5;
                                                    } catch (CancellationException e36) {
                                                        e = e36;
                                                        jVar2 = jVar5;
                                                        throw e;
                                                    } catch (Exception e37) {
                                                        e = e37;
                                                        jVar = jVar5;
                                                        E = jVar;
                                                        px.f fVar3 = px.f.f163100a;
                                                        message = e.getMessage();
                                                        if (message == null) {
                                                            message = "";
                                                        }
                                                        fVar3.d(message, e, px.c.a(E));
                                                        iVarA = E.a(e);
                                                        if (iVarA instanceof dx.i.Left) {
                                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                        } else {
                                                            if (iVarA instanceof dx.i.Right) {
                                                                throw new oq.p();
                                                            }
                                                            objB = ((dx.i.Right) iVarA).b();
                                                        }
                                                        return new dx.i.Left(objB);
                                                    }
                                                }
                                            } catch (ex.c e38) {
                                                e = e38;
                                            } catch (CancellationException e39) {
                                                e = e39;
                                                throw e;
                                            } catch (Exception e45) {
                                                e = e45;
                                                E = jVar4;
                                                px.f fVar4 = px.f.f163100a;
                                                message = e.getMessage();
                                                if (message == null) {
                                                    message = "";
                                                }
                                                fVar4.d(message, e, px.c.a(E));
                                                iVarA = E.a(e);
                                                if (iVarA instanceof dx.i.Left) {
                                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                } else {
                                                    if (iVarA instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    objB = ((dx.i.Right) iVarA).b();
                                                }
                                                return new dx.i.Left(objB);
                                            }
                                        } else {
                                            ex.b bVar20 = bVar3;
                                            r15 = E;
                                            c1Var = this;
                                            i37 = i15;
                                            i38 = i16;
                                            i39 = i17;
                                            i45 = i18;
                                            i46 = i19;
                                            bVar7 = bVar20;
                                            r16 = jVar4;
                                            iVar3 = iVar;
                                        }
                                        if (iVar3 instanceof dx.i.Left) {
                                            bVar16 = (dx.b) ((dx.i.Left) iVar3).b();
                                            px.d dVar = c1Var.remoteLogger;
                                            String str = "Document data containers saving error for " + params2.getDocumentType().getReferenceName();
                                            List<px.a.Class> listA = px.c.a(bVar7);
                                            ex.b bVar21 = bVar7;
                                            if (bVar16 instanceof dx.b.Generic) {
                                                generic = (dx.b.Generic) bVar16;
                                            } else {
                                                generic = null;
                                            }
                                            if (generic != null) {
                                                e15 = generic.getE();
                                            } else {
                                                e15 = null;
                                            }
                                            dVar.T6(str, e15, listA);
                                            documentType4 = params2.getDocumentType();
                                            if (documentType4 != rq0.b.d.ID_CARD || documentType4 == rq0.b.d.DIIA_REFUGEE_CARD) {
                                                new dx.i.Right(oq.i0.f148189a);
                                                r116 = r16;
                                            } else {
                                                if (documentType4 == rq0.b.d.DIIA_REFUGEE_CHILD_CARD || documentType4 == rq0.b.d.VEHICLE_CARD) {
                                                    iVar6 = iVar3;
                                                    i65 = 0;
                                                } else {
                                                    mz3.a0 a0Var3 = c1Var.updateDocumentDownloadStatusUseCase;
                                                    iVar6 = iVar3;
                                                    mz3.a0.Params params13 = new mz3.a0.Params(params2.getDocumentType(), lz3.h.CREATING_ERROR, params2.getDocumentId());
                                                    bVar18.f192957d = params2;
                                                    bVar18.f192958e = r16;
                                                    bVar18.f192959f = vq.j.a(bVar2);
                                                    bVar18.f192960g = vq.j.a(bVar21);
                                                    bVar18.f192961h = vq.j.a(iVar6);
                                                    bVar18.f192962j = bVar16;
                                                    bVar18.f192964l = i46;
                                                    bVar18.f192965m = i45;
                                                    bVar18.f192966n = i39;
                                                    bVar18.f192967p = i38;
                                                    bVar18.f192968q = i37;
                                                    i65 = 0;
                                                    bVar18.f192969r = 0;
                                                    bVar18.f192970s = 0;
                                                    bVar18.f192973w = 7;
                                                    if (a0Var3.c(params13, bVar18) == r15) {
                                                        return r15;
                                                    }
                                                }
                                                bVar17 = bVar21;
                                                i66 = i65;
                                                i67 = i66;
                                                iVar7 = iVar6;
                                                r27 = r15;
                                                r115 = r16;
                                                documentType5 = params2.getDocumentType();
                                                dx.i iVar8 = iVar7;
                                                if (documentType5 != rq0.b.d.FAMILY_CARD || documentType5 == rq0.b.d.DRIVING_LICENCE || documentType5 == rq0.b.d.RAILWAY_CARD || (documentType5 instanceof rq0.b.c)) {
                                                    aVar = c1Var.downloadDocumentRepository;
                                                    taskId = params2.getTaskId();
                                                    documentId2 = params2.getDocumentId();
                                                    bVar18.f192957d = vq.j.a(params2);
                                                    bVar18.f192958e = r115;
                                                    bVar18.f192959f = vq.j.a(bVar2);
                                                    bVar18.f192960g = vq.j.a(bVar17);
                                                    bVar18.f192961h = vq.j.a(iVar8);
                                                    bVar18.f192962j = vq.j.a(bVar16);
                                                    bVar18.f192964l = i46;
                                                    bVar18.f192965m = i45;
                                                    bVar18.f192966n = i39;
                                                    bVar18.f192967p = i38;
                                                    bVar18.f192968q = i37;
                                                    bVar18.f192969r = i67;
                                                    bVar18.f192970s = i66;
                                                    bVar18.f192973w = 8;
                                                    if (aVar.b(taskId, documentId2, bVar18) == r27) {
                                                        return r27;
                                                    }
                                                    r28 = r115;
                                                    new dx.i.Right(oq.i0.f148189a);
                                                    r116 = r28;
                                                } else {
                                                    new dx.i.Left(bVar16);
                                                    r116 = r115;
                                                }
                                            }
                                        } else if (!(iVar3 instanceof dx.i.Right)) {
                                            r116 = r16;
                                            throw new oq.p();
                                        }
                                        r116 = r16;
                                        return new dx.i.Right(oq.i0.f148189a);
                                    }
                                    return r18;
                                case 1:
                                    int i75 = bVar18.f192968q;
                                    int i76 = bVar18.f192967p;
                                    int i77 = bVar18.f192966n;
                                    int i78 = bVar18.f192965m;
                                    int i79 = bVar18.f192964l;
                                    ex.b bVar22 = (ex.b) bVar18.f192960g;
                                    ex.b bVar23 = (ex.b) bVar18.f192959f;
                                    jVar4 = (dx.j) bVar18.f192958e;
                                    b1.Params params14 = (b1.Params) bVar18.f192957d;
                                    try {
                                        oq.u.b(obj3);
                                        i15 = i75;
                                        bVar3 = bVar22;
                                        i18 = i78;
                                        i19 = i79;
                                        bVar2 = bVar23;
                                        params2 = params14;
                                        i16 = i76;
                                        i17 = i77;
                                        iVar = (dx.i) obj3;
                                        if (iVar instanceof dx.i.Right) {
                                            i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                                            bVar4 = this.asyncDownloadInteractor;
                                            documentType = params2.getDocumentType();
                                            documentId = params2.getDocumentId();
                                            documentExpirationDate = params2.getDocumentExpirationDate();
                                            documentStoringMode = params2.getDocumentStoringMode();
                                            if (documentStoringMode == null) {
                                                i25 = -1;
                                            } else {
                                                i25 = a.f192955a[documentStoringMode.ordinal()];
                                            }
                                            if (i25 == 1) {
                                                documentTypeFirstEvent = false;
                                            } else {
                                                documentTypeFirstEvent = params2.getDocumentTypeFirstEvent();
                                            }
                                            bVar18.f192957d = params2;
                                            bVar18.f192958e = jVar4;
                                            bVar18.f192959f = vq.j.a(bVar2);
                                            bVar18.f192960g = bVar3;
                                            bVar18.f192961h = iVar;
                                            bVar18.f192962j = vq.j.a(i0Var);
                                            bVar18.f192964l = i19;
                                            bVar18.f192965m = i18;
                                            bVar18.f192966n = i17;
                                            bVar18.f192967p = i16;
                                            bVar18.f192968q = i15;
                                            bVar18.f192969r = 0;
                                            bVar18.f192970s = 0;
                                            bVar18.f192973w = 2;
                                            bVar5 = bVar3;
                                            r18 = E;
                                            if (bVar4.k(documentType, documentId, documentExpirationDate, documentTypeFirstEvent, bVar18) != E) {
                                                i26 = i15;
                                                i27 = i16;
                                                i28 = i17;
                                                i29 = i18;
                                                bVar6 = bVar5;
                                                i35 = 0;
                                                iVar2 = iVar;
                                                jVar5 = jVar4;
                                                i0Var2 = i0Var;
                                                i36 = 0;
                                                documentType2 = params2.getDocumentType();
                                                i0Var3 = i0Var2;
                                                if (documentType2 == rq0.b.d.DIIA_REFUGEE_CHILD_CARD) {
                                                }
                                                r17 = E;
                                                params3 = params2;
                                                c1Var2 = this;
                                                oq.i0 i0Var8 = oq.i0.f148189a;
                                                i47 = i28;
                                                i48 = i19;
                                                bVar8 = bVar2;
                                                r114 = jVar5;
                                                bVar2 = bVar8;
                                                c1Var = c1Var2;
                                                params2 = params3;
                                                iVar3 = iVar2;
                                                i46 = i48;
                                                i45 = i29;
                                                i39 = i47;
                                                i38 = i27;
                                                i37 = i26;
                                                r15 = r17;
                                                bVar7 = bVar6;
                                                r16 = r114;
                                                break;
                                            }
                                            return r18;
                                        }
                                        ex.b bVar24 = bVar3;
                                        r15 = E;
                                        c1Var = this;
                                        i37 = i15;
                                        i38 = i16;
                                        i39 = i17;
                                        i45 = i18;
                                        i46 = i19;
                                        bVar7 = bVar24;
                                        r16 = jVar4;
                                        iVar3 = iVar;
                                        if (iVar3 instanceof dx.i.Left) {
                                            bVar16 = (dx.b) ((dx.i.Left) iVar3).b();
                                            px.d dVar2 = c1Var.remoteLogger;
                                            String str2 = "Document data containers saving error for " + params2.getDocumentType().getReferenceName();
                                            List<px.a.Class> listA2 = px.c.a(bVar7);
                                            ex.b bVar25 = bVar7;
                                            if (bVar16 instanceof dx.b.Generic) {
                                                generic = (dx.b.Generic) bVar16;
                                            } else {
                                                generic = null;
                                            }
                                            if (generic != null) {
                                                e15 = generic.getE();
                                            } else {
                                                e15 = null;
                                            }
                                            dVar2.T6(str2, e15, listA2);
                                            documentType4 = params2.getDocumentType();
                                            if (documentType4 != rq0.b.d.ID_CARD) {
                                            }
                                            new dx.i.Right(oq.i0.f148189a);
                                            r116 = r16;
                                        } else if (!(iVar3 instanceof dx.i.Right)) {
                                            r116 = r16;
                                            throw new oq.p();
                                        }
                                        r116 = r16;
                                        return new dx.i.Right(oq.i0.f148189a);
                                    } catch (ex.c e46) {
                                        e = e46;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e47) {
                                        e = e47;
                                        throw e;
                                    } catch (Exception e48) {
                                        e = e48;
                                        E = jVar4;
                                        px.f fVar5 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar5.d(message, e, px.c.a(E));
                                        iVarA = E.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                case 2:
                                    int i85 = bVar18.f192970s;
                                    int i86 = bVar18.f192969r;
                                    int i87 = bVar18.f192968q;
                                    int i88 = bVar18.f192967p;
                                    i28 = bVar18.f192966n;
                                    int i89 = bVar18.f192965m;
                                    int i95 = bVar18.f192964l;
                                    i0Var2 = (oq.i0) bVar18.f192962j;
                                    dx.i iVar9 = (dx.i) bVar18.f192961h;
                                    ex.b bVar26 = (ex.b) bVar18.f192960g;
                                    ex.b bVar27 = (ex.b) bVar18.f192959f;
                                    dx.j<dx.b> jVar8 = (dx.j) bVar18.f192958e;
                                    b1.Params params15 = (b1.Params) bVar18.f192957d;
                                    oq.u.b(obj3);
                                    params2 = params15;
                                    i26 = i87;
                                    i35 = i86;
                                    i27 = i88;
                                    i29 = i89;
                                    iVar2 = iVar9;
                                    i19 = i95;
                                    bVar6 = bVar26;
                                    i36 = i85;
                                    bVar2 = bVar27;
                                    jVar5 = jVar8;
                                    documentType2 = params2.getDocumentType();
                                    i0Var3 = i0Var2;
                                    if (documentType2 == rq0.b.d.DIIA_REFUGEE_CHILD_CARD) {
                                        break;
                                    }
                                    r17 = E;
                                    params3 = params2;
                                    c1Var2 = this;
                                    oq.i0 i0Var9 = oq.i0.f148189a;
                                    i47 = i28;
                                    i48 = i19;
                                    bVar8 = bVar2;
                                    r114 = jVar5;
                                    bVar2 = bVar8;
                                    c1Var = c1Var2;
                                    params2 = params3;
                                    iVar3 = iVar2;
                                    i46 = i48;
                                    i45 = i29;
                                    i39 = i47;
                                    i38 = i27;
                                    i37 = i26;
                                    r15 = r17;
                                    bVar7 = bVar6;
                                    r16 = r114;
                                    if (iVar3 instanceof dx.i.Left) {
                                        bVar16 = (dx.b) ((dx.i.Left) iVar3).b();
                                        px.d dVar3 = c1Var.remoteLogger;
                                        String str3 = "Document data containers saving error for " + params2.getDocumentType().getReferenceName();
                                        List<px.a.Class> listA3 = px.c.a(bVar7);
                                        ex.b bVar28 = bVar7;
                                        if (bVar16 instanceof dx.b.Generic) {
                                            generic = (dx.b.Generic) bVar16;
                                        } else {
                                            generic = null;
                                        }
                                        if (generic != null) {
                                            e15 = generic.getE();
                                        } else {
                                            e15 = null;
                                        }
                                        dVar3.T6(str3, e15, listA3);
                                        documentType4 = params2.getDocumentType();
                                        if (documentType4 != rq0.b.d.ID_CARD) {
                                        }
                                        new dx.i.Right(oq.i0.f148189a);
                                        r116 = r16;
                                    } else if (!(iVar3 instanceof dx.i.Right)) {
                                        r116 = r16;
                                        throw new oq.p();
                                    }
                                    r116 = r16;
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 3:
                                    int i96 = bVar18.f192970s;
                                    i58 = bVar18.f192969r;
                                    i59 = bVar18.f192968q;
                                    i57 = bVar18.f192967p;
                                    i28 = bVar18.f192966n;
                                    i56 = bVar18.f192965m;
                                    i55 = bVar18.f192964l;
                                    bVar9 = (qz3.b) bVar18.f192963k;
                                    oq.i0 i0Var10 = (oq.i0) bVar18.f192962j;
                                    dx.i iVar10 = (dx.i) bVar18.f192961h;
                                    ex.b bVar29 = (ex.b) bVar18.f192960g;
                                    ex.b bVar30 = (ex.b) bVar18.f192959f;
                                    dx.j<dx.b> jVar9 = (dx.j) bVar18.f192958e;
                                    params4 = (b1.Params) bVar18.f192957d;
                                    try {
                                        oq.u.b(obj3);
                                        bVar2 = bVar30;
                                        iVar4 = iVar10;
                                        c1Var3 = this;
                                        i49 = i96;
                                        i0Var3 = i0Var10;
                                        bVar10 = bVar29;
                                        jVar6 = jVar9;
                                        r19 = E;
                                        bVar18.f192957d = params4;
                                        bVar18.f192958e = jVar6;
                                        params6 = params4;
                                        bVar18.f192959f = vq.j.a(bVar2);
                                        bVar18.f192960g = bVar10;
                                        bVar18.f192961h = iVar4;
                                        bVar18.f192962j = vq.j.a(i0Var3);
                                        bVar18.f192963k = null;
                                        bVar18.f192964l = i55;
                                        bVar18.f192965m = i56;
                                        bVar18.f192966n = i28;
                                        bVar18.f192967p = i57;
                                        bVar18.f192968q = i59;
                                        bVar18.f192969r = i58;
                                        bVar18.f192970s = i49;
                                        bVar18.f192973w = 4;
                                        if (bVar9.o((String) obj3, bVar18) != r19) {
                                            r18 = r19;
                                            return r18;
                                        }
                                        i0Var4 = i0Var3;
                                        bVar11 = bVar10;
                                        iVar5 = iVar4;
                                        params7 = params6;
                                        jVar7 = jVar6;
                                        bVar12 = bVar2;
                                        r26 = r19;
                                        bVar2 = bVar12;
                                        jVar5 = jVar7;
                                        i19 = i55;
                                        bVar6 = bVar11;
                                        i36 = i49;
                                        params5 = params7;
                                        i26 = i59;
                                        i35 = i58;
                                        i27 = i57;
                                        i29 = i56;
                                        iVar2 = iVar5;
                                        r25 = r26;
                                        mz3.a0 a0Var4 = c1Var3.updateDocumentDownloadStatusUseCase;
                                        i0Var5 = i0Var4;
                                        ?? r119 = r25;
                                        mz3.a0.Params params16 = new mz3.a0.Params(params5.getDocumentType(), lz3.h.ALREADY_DOWNLOADED, params5.getDocumentId());
                                        bVar18.f192957d = params5;
                                        bVar18.f192958e = jVar5;
                                        bVar18.f192959f = vq.j.a(bVar2);
                                        bVar18.f192960g = bVar6;
                                        bVar18.f192961h = iVar2;
                                        bVar18.f192962j = vq.j.a(i0Var5);
                                        bVar18.f192964l = i19;
                                        bVar18.f192965m = i29;
                                        bVar18.f192966n = i28;
                                        bVar18.f192967p = i27;
                                        bVar18.f192968q = i26;
                                        bVar18.f192969r = i35;
                                        bVar18.f192970s = i36;
                                        bVar18.f192973w = 5;
                                        objC = a0Var4.c(params16, bVar18);
                                        r110 = r119;
                                        r111 = r110;
                                        if (objC != r110) {
                                            c1Var2 = this;
                                            E = jVar5;
                                            bVar13 = bVar2;
                                            params8 = params5;
                                            r112 = r110;
                                            bVar14 = c1Var2.asyncDownloadInteractor;
                                            bVar15 = bVar13;
                                            documentType3 = params8.getDocumentType();
                                            bVar18.f192957d = params8;
                                            bVar18.f192958e = E;
                                            r113 = E;
                                            bVar18.f192959f = vq.j.a(bVar15);
                                            bVar18.f192960g = bVar6;
                                            bVar18.f192961h = iVar2;
                                            bVar18.f192962j = vq.j.a(i0Var5);
                                            bVar18.f192964l = i19;
                                            bVar18.f192965m = i29;
                                            bVar18.f192966n = i28;
                                            bVar18.f192967p = i27;
                                            bVar18.f192968q = i26;
                                            bVar18.f192969r = i35;
                                            bVar18.f192970s = i36;
                                            bVar18.f192973w = 6;
                                            r111 = r112;
                                            if (bVar14.f(documentType3, bVar18) != r112) {
                                                params3 = params8;
                                                r114 = r113;
                                                i47 = i28;
                                                i48 = i19;
                                                bVar8 = bVar15;
                                                r17 = r112;
                                                bVar2 = bVar8;
                                                c1Var = c1Var2;
                                                params2 = params3;
                                                iVar3 = iVar2;
                                                i46 = i48;
                                                i45 = i29;
                                                i39 = i47;
                                                i38 = i27;
                                                i37 = i26;
                                                r15 = r17;
                                                bVar7 = bVar6;
                                                r16 = r114;
                                                if (iVar3 instanceof dx.i.Left) {
                                                    bVar16 = (dx.b) ((dx.i.Left) iVar3).b();
                                                    px.d dVar4 = c1Var.remoteLogger;
                                                    String str4 = "Document data containers saving error for " + params2.getDocumentType().getReferenceName();
                                                    List<px.a.Class> listA4 = px.c.a(bVar7);
                                                    ex.b bVar210 = bVar7;
                                                    if (bVar16 instanceof dx.b.Generic) {
                                                        generic = (dx.b.Generic) bVar16;
                                                    } else {
                                                        generic = null;
                                                    }
                                                    if (generic != null) {
                                                        e15 = generic.getE();
                                                    } else {
                                                        e15 = null;
                                                    }
                                                    dVar4.T6(str4, e15, listA4);
                                                    documentType4 = params2.getDocumentType();
                                                    if (documentType4 != rq0.b.d.ID_CARD) {
                                                    }
                                                    new dx.i.Right(oq.i0.f148189a);
                                                    r116 = r16;
                                                } else if (!(iVar3 instanceof dx.i.Right)) {
                                                    r116 = r16;
                                                    throw new oq.p();
                                                }
                                                r116 = r16;
                                                return new dx.i.Right(oq.i0.f148189a);
                                            }
                                        }
                                        return r111;
                                    } catch (ex.c e49) {
                                        e = e49;
                                    } catch (CancellationException e55) {
                                        throw e55;
                                    } catch (Exception e56) {
                                        e = e56;
                                        E = jVar9;
                                        px.f fVar6 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar6.d(message, e, px.c.a(E));
                                        iVarA = E.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                    break;
                                case 4:
                                    int i97 = bVar18.f192970s;
                                    i58 = bVar18.f192969r;
                                    i59 = bVar18.f192968q;
                                    i57 = bVar18.f192967p;
                                    i28 = bVar18.f192966n;
                                    i56 = bVar18.f192965m;
                                    i55 = bVar18.f192964l;
                                    i0Var4 = (oq.i0) bVar18.f192962j;
                                    iVar5 = (dx.i) bVar18.f192961h;
                                    ex.b bVar31 = (ex.b) bVar18.f192960g;
                                    bVar12 = (ex.b) bVar18.f192959f;
                                    dx.j<dx.b> jVar10 = (dx.j) bVar18.f192958e;
                                    params7 = (b1.Params) bVar18.f192957d;
                                    oq.u.b(obj3);
                                    bVar11 = bVar31;
                                    c1Var3 = this;
                                    i49 = i97;
                                    r26 = E;
                                    jVar7 = jVar10;
                                    bVar2 = bVar12;
                                    jVar5 = jVar7;
                                    i19 = i55;
                                    bVar6 = bVar11;
                                    i36 = i49;
                                    params5 = params7;
                                    i26 = i59;
                                    i35 = i58;
                                    i27 = i57;
                                    i29 = i56;
                                    iVar2 = iVar5;
                                    r25 = r26;
                                    mz3.a0 a0Var5 = c1Var3.updateDocumentDownloadStatusUseCase;
                                    i0Var5 = i0Var4;
                                    ?? r1110 = r25;
                                    mz3.a0.Params params17 = new mz3.a0.Params(params5.getDocumentType(), lz3.h.ALREADY_DOWNLOADED, params5.getDocumentId());
                                    bVar18.f192957d = params5;
                                    bVar18.f192958e = jVar5;
                                    bVar18.f192959f = vq.j.a(bVar2);
                                    bVar18.f192960g = bVar6;
                                    bVar18.f192961h = iVar2;
                                    bVar18.f192962j = vq.j.a(i0Var5);
                                    bVar18.f192964l = i19;
                                    bVar18.f192965m = i29;
                                    bVar18.f192966n = i28;
                                    bVar18.f192967p = i27;
                                    bVar18.f192968q = i26;
                                    bVar18.f192969r = i35;
                                    bVar18.f192970s = i36;
                                    bVar18.f192973w = 5;
                                    objC = a0Var5.c(params17, bVar18);
                                    r110 = r1110;
                                    r111 = r110;
                                    if (objC != r110) {
                                        c1Var2 = this;
                                        E = jVar5;
                                        bVar13 = bVar2;
                                        params8 = params5;
                                        r112 = r110;
                                        bVar14 = c1Var2.asyncDownloadInteractor;
                                        bVar15 = bVar13;
                                        documentType3 = params8.getDocumentType();
                                        bVar18.f192957d = params8;
                                        bVar18.f192958e = E;
                                        r113 = E;
                                        bVar18.f192959f = vq.j.a(bVar15);
                                        bVar18.f192960g = bVar6;
                                        bVar18.f192961h = iVar2;
                                        bVar18.f192962j = vq.j.a(i0Var5);
                                        bVar18.f192964l = i19;
                                        bVar18.f192965m = i29;
                                        bVar18.f192966n = i28;
                                        bVar18.f192967p = i27;
                                        bVar18.f192968q = i26;
                                        bVar18.f192969r = i35;
                                        bVar18.f192970s = i36;
                                        bVar18.f192973w = 6;
                                        r111 = r112;
                                        if (bVar14.f(documentType3, bVar18) != r112) {
                                            params3 = params8;
                                            r114 = r113;
                                            i47 = i28;
                                            i48 = i19;
                                            bVar8 = bVar15;
                                            r17 = r112;
                                            bVar2 = bVar8;
                                            c1Var = c1Var2;
                                            params2 = params3;
                                            iVar3 = iVar2;
                                            i46 = i48;
                                            i45 = i29;
                                            i39 = i47;
                                            i38 = i27;
                                            i37 = i26;
                                            r15 = r17;
                                            bVar7 = bVar6;
                                            r16 = r114;
                                            if (iVar3 instanceof dx.i.Left) {
                                                bVar16 = (dx.b) ((dx.i.Left) iVar3).b();
                                                px.d dVar5 = c1Var.remoteLogger;
                                                String str5 = "Document data containers saving error for " + params2.getDocumentType().getReferenceName();
                                                List<px.a.Class> listA5 = px.c.a(bVar7);
                                                ex.b bVar211 = bVar7;
                                                if (bVar16 instanceof dx.b.Generic) {
                                                    generic = (dx.b.Generic) bVar16;
                                                } else {
                                                    generic = null;
                                                }
                                                if (generic != null) {
                                                    e15 = generic.getE();
                                                } else {
                                                    e15 = null;
                                                }
                                                dVar5.T6(str5, e15, listA5);
                                                documentType4 = params2.getDocumentType();
                                                if (documentType4 != rq0.b.d.ID_CARD) {
                                                }
                                                new dx.i.Right(oq.i0.f148189a);
                                                r116 = r16;
                                            } else if (!(iVar3 instanceof dx.i.Right)) {
                                                r116 = r16;
                                                throw new oq.p();
                                            }
                                            r116 = r16;
                                            return new dx.i.Right(oq.i0.f148189a);
                                        }
                                    }
                                    return r111;
                                case 5:
                                    int i98 = bVar18.f192970s;
                                    int i99 = bVar18.f192969r;
                                    int i100 = bVar18.f192968q;
                                    int i101 = bVar18.f192967p;
                                    i28 = bVar18.f192966n;
                                    int i102 = bVar18.f192965m;
                                    int i103 = bVar18.f192964l;
                                    oq.i0 i0Var11 = (oq.i0) bVar18.f192962j;
                                    dx.i iVar11 = (dx.i) bVar18.f192961h;
                                    ex.b bVar32 = (ex.b) bVar18.f192960g;
                                    ex.b bVar33 = (ex.b) bVar18.f192959f;
                                    dx.j jVar11 = (dx.j) bVar18.f192958e;
                                    b1.Params params18 = (b1.Params) bVar18.f192957d;
                                    oq.u.b(obj3);
                                    r112 = E;
                                    E = jVar11;
                                    i19 = i103;
                                    bVar6 = bVar32;
                                    params8 = params18;
                                    i26 = i100;
                                    i35 = i99;
                                    i27 = i101;
                                    i29 = i102;
                                    iVar2 = iVar11;
                                    i36 = i98;
                                    i0Var5 = i0Var11;
                                    bVar13 = bVar33;
                                    c1Var2 = this;
                                    bVar14 = c1Var2.asyncDownloadInteractor;
                                    bVar15 = bVar13;
                                    documentType3 = params8.getDocumentType();
                                    bVar18.f192957d = params8;
                                    bVar18.f192958e = E;
                                    r113 = E;
                                    bVar18.f192959f = vq.j.a(bVar15);
                                    bVar18.f192960g = bVar6;
                                    bVar18.f192961h = iVar2;
                                    bVar18.f192962j = vq.j.a(i0Var5);
                                    bVar18.f192964l = i19;
                                    bVar18.f192965m = i29;
                                    bVar18.f192966n = i28;
                                    bVar18.f192967p = i27;
                                    bVar18.f192968q = i26;
                                    bVar18.f192969r = i35;
                                    bVar18.f192970s = i36;
                                    bVar18.f192973w = 6;
                                    r111 = r112;
                                    if (bVar14.f(documentType3, bVar18) != r112) {
                                        params3 = params8;
                                        r114 = r113;
                                        i47 = i28;
                                        i48 = i19;
                                        bVar8 = bVar15;
                                        r17 = r112;
                                        bVar2 = bVar8;
                                        c1Var = c1Var2;
                                        params2 = params3;
                                        iVar3 = iVar2;
                                        i46 = i48;
                                        i45 = i29;
                                        i39 = i47;
                                        i38 = i27;
                                        i37 = i26;
                                        r15 = r17;
                                        bVar7 = bVar6;
                                        r16 = r114;
                                        if (iVar3 instanceof dx.i.Left) {
                                            bVar16 = (dx.b) ((dx.i.Left) iVar3).b();
                                            px.d dVar6 = c1Var.remoteLogger;
                                            String str6 = "Document data containers saving error for " + params2.getDocumentType().getReferenceName();
                                            List<px.a.Class> listA6 = px.c.a(bVar7);
                                            ex.b bVar212 = bVar7;
                                            if (bVar16 instanceof dx.b.Generic) {
                                                generic = (dx.b.Generic) bVar16;
                                            } else {
                                                generic = null;
                                            }
                                            if (generic != null) {
                                                e15 = generic.getE();
                                            } else {
                                                e15 = null;
                                            }
                                            dVar6.T6(str6, e15, listA6);
                                            documentType4 = params2.getDocumentType();
                                            if (documentType4 != rq0.b.d.ID_CARD) {
                                            }
                                            new dx.i.Right(oq.i0.f148189a);
                                            r116 = r16;
                                        } else if (!(iVar3 instanceof dx.i.Right)) {
                                            r116 = r16;
                                            throw new oq.p();
                                        }
                                        r116 = r16;
                                        return new dx.i.Right(oq.i0.f148189a);
                                    }
                                    return r111;
                                case 6:
                                    i26 = bVar18.f192968q;
                                    i27 = bVar18.f192967p;
                                    i47 = bVar18.f192966n;
                                    i29 = bVar18.f192965m;
                                    i48 = bVar18.f192964l;
                                    iVar2 = (dx.i) bVar18.f192961h;
                                    bVar6 = (ex.b) bVar18.f192960g;
                                    bVar8 = (ex.b) bVar18.f192959f;
                                    dx.j jVar12 = (dx.j) bVar18.f192958e;
                                    b1.Params params19 = (b1.Params) bVar18.f192957d;
                                    oq.u.b(obj3);
                                    c1Var2 = this;
                                    params3 = params19;
                                    r114 = jVar12;
                                    r17 = E;
                                    bVar2 = bVar8;
                                    c1Var = c1Var2;
                                    params2 = params3;
                                    iVar3 = iVar2;
                                    i46 = i48;
                                    i45 = i29;
                                    i39 = i47;
                                    i38 = i27;
                                    i37 = i26;
                                    r15 = r17;
                                    bVar7 = bVar6;
                                    r16 = r114;
                                    if (iVar3 instanceof dx.i.Left) {
                                        bVar16 = (dx.b) ((dx.i.Left) iVar3).b();
                                        px.d dVar7 = c1Var.remoteLogger;
                                        String str7 = "Document data containers saving error for " + params2.getDocumentType().getReferenceName();
                                        List<px.a.Class> listA7 = px.c.a(bVar7);
                                        ex.b bVar213 = bVar7;
                                        if (bVar16 instanceof dx.b.Generic) {
                                            generic = (dx.b.Generic) bVar16;
                                        } else {
                                            generic = null;
                                        }
                                        if (generic != null) {
                                            e15 = generic.getE();
                                        } else {
                                            e15 = null;
                                        }
                                        dVar7.T6(str7, e15, listA7);
                                        documentType4 = params2.getDocumentType();
                                        if (documentType4 != rq0.b.d.ID_CARD) {
                                        }
                                        new dx.i.Right(oq.i0.f148189a);
                                        r116 = r16;
                                    } else if (!(iVar3 instanceof dx.i.Right)) {
                                        r116 = r16;
                                        throw new oq.p();
                                    }
                                    r116 = r16;
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 7:
                                    int i104 = bVar18.f192970s;
                                    int i105 = bVar18.f192969r;
                                    i37 = bVar18.f192968q;
                                    i38 = bVar18.f192967p;
                                    i39 = bVar18.f192966n;
                                    i45 = bVar18.f192965m;
                                    i46 = bVar18.f192964l;
                                    bVar16 = (dx.b) bVar18.f192962j;
                                    iVar7 = (dx.i) bVar18.f192961h;
                                    bVar17 = (ex.b) bVar18.f192960g;
                                    ex.b bVar34 = (ex.b) bVar18.f192959f;
                                    dx.j jVar13 = (dx.j) bVar18.f192958e;
                                    b1.Params params20 = (b1.Params) bVar18.f192957d;
                                    oq.u.b(obj3);
                                    bVar2 = bVar34;
                                    i66 = i104;
                                    i67 = i105;
                                    params2 = params20;
                                    r27 = E;
                                    c1Var = this;
                                    r115 = jVar13;
                                    documentType5 = params2.getDocumentType();
                                    dx.i iVar12 = iVar7;
                                    if (documentType5 != rq0.b.d.FAMILY_CARD) {
                                        break;
                                    }
                                    aVar = c1Var.downloadDocumentRepository;
                                    taskId = params2.getTaskId();
                                    documentId2 = params2.getDocumentId();
                                    bVar18.f192957d = vq.j.a(params2);
                                    bVar18.f192958e = r115;
                                    bVar18.f192959f = vq.j.a(bVar2);
                                    bVar18.f192960g = vq.j.a(bVar17);
                                    bVar18.f192961h = vq.j.a(iVar12);
                                    bVar18.f192962j = vq.j.a(bVar16);
                                    bVar18.f192964l = i46;
                                    bVar18.f192965m = i45;
                                    bVar18.f192966n = i39;
                                    bVar18.f192967p = i38;
                                    bVar18.f192968q = i37;
                                    bVar18.f192969r = i67;
                                    bVar18.f192970s = i66;
                                    bVar18.f192973w = 8;
                                    if (aVar.b(taskId, documentId2, bVar18) == r27) {
                                        return r27;
                                    }
                                    r28 = r115;
                                    new dx.i.Right(oq.i0.f148189a);
                                    r116 = r28;
                                    r116 = r16;
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 8:
                                    dx.j jVar14 = (dx.j) bVar18.f192958e;
                                    try {
                                        oq.u.b(obj3);
                                        r28 = jVar14;
                                        new dx.i.Right(oq.i0.f148189a);
                                        r116 = r28;
                                        r116 = r16;
                                        return new dx.i.Right(oq.i0.f148189a);
                                    } catch (ex.c e57) {
                                        e = e57;
                                    } catch (CancellationException e58) {
                                        throw e58;
                                    }
                                    break;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Exception e59) {
                            e = e59;
                        }
                    } catch (CancellationException e65) {
                        throw e65;
                    }
                } catch (ex.c e66) {
                    e = e66;
                } catch (CancellationException e67) {
                    throw e67;
                } catch (Exception e68) {
                    e = e68;
                    E = obj2;
                }
            } catch (ex.c e69) {
                e = e69;
            } catch (CancellationException e75) {
                e = e75;
            } catch (Exception e76) {
                e = e76;
            }
        } catch (ex.c e77) {
            e = e77;
        } catch (CancellationException e78) {
            throw e78;
        } catch (Exception e79) {
            e = e79;
            E = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x0105 A[Catch: Exception -> 0x007d, c -> 0x0081, CancellationException -> 0x0085, TryCatch #8 {c -> 0x0081, CancellationException -> 0x0085, Exception -> 0x007d, blocks: (B:25:0x0077, B:40:0x00ff, B:42:0x0105, B:44:0x0116, B:46:0x011a, B:48:0x011e, B:51:0x0123, B:52:0x0129, B:59:0x0177, B:64:0x0185, B:65:0x018a), top: B:101:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x016c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0177 A[Catch: Exception -> 0x007d, c -> 0x0081, CancellationException -> 0x0085, TRY_ENTER, TRY_LEAVE, TryCatch #8 {c -> 0x0081, CancellationException -> 0x0085, Exception -> 0x007d, blocks: (B:25:0x0077, B:40:0x00ff, B:42:0x0105, B:44:0x0116, B:46:0x011a, B:48:0x011e, B:51:0x0123, B:52:0x0129, B:59:0x0177, B:64:0x0185, B:65:0x018a), top: B:101:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0185 A[Catch: Exception -> 0x007d, c -> 0x0081, CancellationException -> 0x0085, TRY_ENTER, TryCatch #8 {c -> 0x0081, CancellationException -> 0x0085, Exception -> 0x007d, blocks: (B:25:0x0077, B:40:0x00ff, B:42:0x0105, B:44:0x0116, B:46:0x011a, B:48:0x011e, B:51:0x0123, B:52:0x0129, B:59:0x0177, B:64:0x0185, B:65:0x018a), top: B:101:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final Object h(b1.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        c cVar;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j<dx.b> jVar;
        b1.Params params2;
        ex.b bVar;
        ex.b bVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        dx.j<dx.b> jVar2;
        dx.i iVar;
        dx.b bVar3;
        rq0.b documentType;
        sz3.a aVar;
        String taskId;
        String documentId;
        dx.j<dx.b> jVar3;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i25 = cVar.f192989v;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f192989v = i25 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f192987s;
        ?? E = uq.b.e();
        int i26 = cVar2.f192989v;
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        qz3.b bVar4 = this.asyncDownloadInteractor;
                        DocumentSchema documentSchema = params.getDocumentSchema();
                        boolean documentTypeFirstEvent = params.getDocumentTypeFirstEvent();
                        rq0.b documentType2 = params.getDocumentType();
                        String documentScope = params.getDocumentScope();
                        String documentId2 = params.getDocumentId();
                        String taskId2 = params.getTaskId();
                        fz.b.LocalDate documentExpirationDate = params.getDocumentExpirationDate();
                        lz3.d downloadMethod = params.getDownloadMethod();
                        fr0.i documentStoringMode = params.getDocumentStoringMode();
                        params2 = params;
                        cVar2.f192974d = params2;
                        cVar2.f192975e = jVarA;
                        cVar2.f192976f = vq.j.a(aVar2);
                        cVar2.f192977g = vq.j.a(aVar2);
                        cVar2.f192980k = 0;
                        cVar2.f192981l = 0;
                        cVar2.f192982m = 0;
                        cVar2.f192983n = 0;
                        cVar2.f192984p = 0;
                        cVar2.f192989v = 1;
                        jVar = jVarA;
                        try {
                            Object objD = bVar4.d(documentSchema, documentTypeFirstEvent, documentType2, documentScope, documentId2, taskId2, documentExpirationDate, downloadMethod, documentStoringMode, cVar2);
                            if (objD != E) {
                                bVar = aVar2;
                                bVar2 = bVar;
                                obj = objD;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                jVar2 = jVar;
                                iVar = (dx.i) obj;
                                if (iVar instanceof dx.i.Left) {
                                    bVar3 = (dx.b) ((dx.i.Left) iVar).b();
                                    documentType = params2.getDocumentType();
                                    if (documentType != rq0.b.d.FAMILY_CARD) {
                                    }
                                    aVar = this.downloadDocumentRepository;
                                    taskId = params2.getTaskId();
                                    documentId = params2.getDocumentId();
                                    cVar2.f192974d = vq.j.a(params2);
                                    cVar2.f192975e = jVar2;
                                    cVar2.f192976f = vq.j.a(bVar2);
                                    cVar2.f192977g = vq.j.a(bVar);
                                    cVar2.f192978h = vq.j.a(iVar);
                                    cVar2.f192979j = vq.j.a(bVar3);
                                    cVar2.f192980k = i19;
                                    cVar2.f192981l = i18;
                                    cVar2.f192982m = i17;
                                    cVar2.f192983n = i16;
                                    cVar2.f192984p = i15;
                                    cVar2.f192985q = 0;
                                    cVar2.f192986r = 0;
                                    cVar2.f192989v = 2;
                                    if (aVar.b(taskId, documentId, cVar2) != E) {
                                        jVar3 = jVar2;
                                        new dx.i.Right(oq.i0.f148189a);
                                        jVar2 = jVar3;
                                    }
                                } else if (!(iVar instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                            }
                            return E;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            e = e16;
                            throw e;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVar;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } catch (ex.c e18) {
                        e = e18;
                        jVar = jVarA;
                    } catch (CancellationException e19) {
                        e = e19;
                        jVar = jVarA;
                    } catch (Exception e25) {
                        e = e25;
                        jVar = jVarA;
                    }
                } else if (i26 == 1) {
                    i15 = cVar2.f192984p;
                    i16 = cVar2.f192983n;
                    i17 = cVar2.f192982m;
                    i18 = cVar2.f192981l;
                    i19 = cVar2.f192980k;
                    bVar = (ex.b) cVar2.f192977g;
                    bVar2 = (ex.b) cVar2.f192976f;
                    jVar2 = (dx.j) cVar2.f192975e;
                    b1.Params params3 = (b1.Params) cVar2.f192974d;
                    try {
                        oq.u.b(obj);
                        params2 = params3;
                        iVar = (dx.i) obj;
                        if (iVar instanceof dx.i.Left) {
                            bVar3 = (dx.b) ((dx.i.Left) iVar).b();
                            documentType = params2.getDocumentType();
                            if (documentType != rq0.b.d.FAMILY_CARD || documentType == rq0.b.d.DRIVING_LICENCE || documentType == rq0.b.d.RAILWAY_CARD || (documentType instanceof rq0.b.c)) {
                                aVar = this.downloadDocumentRepository;
                                taskId = params2.getTaskId();
                                documentId = params2.getDocumentId();
                                cVar2.f192974d = vq.j.a(params2);
                                cVar2.f192975e = jVar2;
                                cVar2.f192976f = vq.j.a(bVar2);
                                cVar2.f192977g = vq.j.a(bVar);
                                cVar2.f192978h = vq.j.a(iVar);
                                cVar2.f192979j = vq.j.a(bVar3);
                                cVar2.f192980k = i19;
                                cVar2.f192981l = i18;
                                cVar2.f192982m = i17;
                                cVar2.f192983n = i16;
                                cVar2.f192984p = i15;
                                cVar2.f192985q = 0;
                                cVar2.f192986r = 0;
                                cVar2.f192989v = 2;
                                if (aVar.b(taskId, documentId, cVar2) != E) {
                                    jVar3 = jVar2;
                                    new dx.i.Right(oq.i0.f148189a);
                                    jVar2 = jVar3;
                                }
                                return E;
                            }
                            new dx.i.Left(bVar3);
                        } else if (!(iVar instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                    } catch (ex.c e26) {
                        e = e26;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e27) {
                        throw e27;
                    } catch (Exception e28) {
                        e = e28;
                        E = jVar2;
                        px.f fVar2 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar3 = (dx.j) cVar2.f192975e;
                    try {
                        oq.u.b(obj);
                        new dx.i.Right(oq.i0.f148189a);
                        jVar2 = jVar3;
                    } catch (ex.c e29) {
                        e = e29;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e35) {
                        throw e35;
                    }
                }
                return new dx.i.Right(oq.i0.f148189a);
            } catch (CancellationException e36) {
                throw e36;
            }
        } catch (Exception e37) {
            e = e37;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(rq0.b bVar, lz3.d dVar, String str, tq.e<? super String> eVar) throws Throwable {
        d dVar2;
        Object objB;
        if (eVar instanceof d) {
            dVar2 = (d) eVar;
            int i15 = dVar2.f192995j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar2.f192995j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar2 = new d(eVar);
            }
        } else {
            dVar2 = new d(eVar);
        }
        Object objE = dVar2.f192993g;
        Object objE2 = uq.b.e();
        int i16 = dVar2.f192995j;
        if (i16 == 0) {
            oq.u.b(objE);
            qz3.b bVar2 = this.asyncDownloadInteractor;
            dVar2.f192990d = bVar;
            dVar2.f192991e = dVar;
            dVar2.f192992f = str;
            dVar2.f192995j = 1;
            objE = bVar2.e(bVar, dVar2);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) dVar2.f192992f;
            dVar = (lz3.d) dVar2.f192991e;
            bVar = (rq0.b) dVar2.f192990d;
            oq.u.b(objE);
        }
        dx.i iVar = (dx.i) objE;
        if (iVar instanceof dx.i.Left) {
            objB = vq.b.a(false);
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB = ((dx.i.Right) iVar).b();
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        if (zBooleanValue) {
            return bVar.getReferenceName() + dVar.name() + str;
        }
        if (zBooleanValue) {
            throw new oq.p();
        }
        return bVar.getReferenceName() + dVar.name();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [tz3.c1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, tz3.b1$a] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // gz.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Object c(b1.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        e eVar2;
        Object objB;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f193007q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f193007q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f193005n;
        Object objE = uq.b.e();
        int i16 = eVar2.f193007q;
        try {
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue = this.isFeatureEnabledUseCase.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                eVar2.f192996d = vq.j.a(params);
                                eVar2.f192997e = jVarA;
                                eVar2.f192998f = vq.j.a(aVar);
                                eVar2.f192999g = vq.j.a(aVar);
                                eVar2.f193000h = 0;
                                eVar2.f193001j = 0;
                                eVar2.f193002k = 0;
                                eVar2.f193003l = 0;
                                eVar2.f193004m = 0;
                                eVar2.f193007q = 1;
                                Object objG = g(params, eVar2);
                                if (objG != objE) {
                                    obj = objG;
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                eVar2.f192996d = vq.j.a(params);
                                eVar2.f192997e = jVarA;
                                eVar2.f192998f = vq.j.a(aVar);
                                eVar2.f192999g = vq.j.a(aVar);
                                eVar2.f193000h = 0;
                                eVar2.f193001j = 0;
                                eVar2.f193002k = 0;
                                eVar2.f193003l = 0;
                                eVar2.f193004m = 0;
                                eVar2.f193007q = 2;
                                Object objH = h(params, eVar2);
                                if (objH != objE) {
                                    obj = objH;
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            params = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(params));
                            dx.i iVarA = params.a(e);
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
                    }
                    if (i16 == 1) {
                        oq.u.b(obj);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e18) {
                    e = e18;
                }
            } catch (CancellationException e19) {
                throw e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
