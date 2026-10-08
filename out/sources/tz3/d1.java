package tz3;

import java.util.concurrent.CancellationException;
import lz3.AsyncDocumentGenerationResponse;
import lz3.DocumentToGenerate;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!¨\u0006\""}, d2 = {"Ltz3/d1;", "Lmz3/z;", "Lmz3/j;", "generateDocumentsAsyncUseCase", "Lmz3/k;", "generateMainDocumentsAsyncUC", "Ltz3/d0;", "getTaskIdAssociatedWithDocumentTypeUC", "Lqz3/a;", "asyncDocumentUpdateInteractor", "<init>", "(Lmz3/j;Lmz3/k;Ltz3/d0;Lqz3/a;)V", "Lrq0/b;", "documentType", "Llz3/d;", "methodType", "", "documentIID", "d", "(Lrq0/b;Llz3/d;Ljava/lang/String;)Ljava/lang/String;", "Lmz3/z$a;", "params", "Ldx/i;", "Ldx/b;", "Lmz3/z$c;", "e", "(Lmz3/z$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmz3/j;", "b", "Lmz3/k;", "c", "Ltz3/d0;", "Lqz3/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d1 implements mz3.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.j generateDocumentsAsyncUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz3.k generateMainDocumentsAsyncUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d0 getTaskIdAssociatedWithDocumentTypeUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final qz3.a asyncDocumentUpdateInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f193026a;

        static {
            int[] iArr = new int[mz3.z.b.values().length];
            try {
                iArr[mz3.z.b.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mz3.z.b.DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f193026a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f193030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f193031h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f193032j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f193033k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f193034l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f193035m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f193036n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f193037p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f193038q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f193039r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f193040s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f193042v;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193040s = obj;
            this.f193042v |= PKIFailureInfo.systemUnavail;
            return d1.this.c(null, this);
        }
    }

    public d1(mz3.j jVar, mz3.k kVar, d0 d0Var, qz3.a aVar) {
        this.generateDocumentsAsyncUseCase = jVar;
        this.generateMainDocumentsAsyncUC = kVar;
        this.getTaskIdAssociatedWithDocumentTypeUC = d0Var;
        this.asyncDocumentUpdateInteractor = aVar;
    }

    private final String d(rq0.b documentType, lz3.d methodType, String documentIID) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(documentType.getReferenceName());
        sb5.append(methodType.name());
        if (documentIID == null) {
            documentIID = "";
        }
        sb5.append(documentIID);
        return sb5.toString();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x029f  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a8 A[Catch: Exception -> 0x005a, c -> 0x005d, CancellationException -> 0x0060, TryCatch #10 {Exception -> 0x005a, blocks: (B:16:0x0055, B:116:0x031a, B:122:0x0349, B:119:0x0321, B:121:0x0325, B:123:0x0356, B:124:0x035b, B:131:0x03c1, B:134:0x03cf, B:27:0x0087, B:103:0x02a0, B:106:0x02a8, B:108:0x02ac, B:109:0x02c8, B:110:0x02cd, B:85:0x0219, B:67:0x01a2, B:69:0x01ac, B:73:0x01be, B:78:0x01cb, B:81:0x01d9, B:75:0x01c2, B:76:0x01c7, B:77:0x01c8, B:127:0x0362, B:128:0x036a), top: B:149:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02ac A[Catch: Exception -> 0x005a, c -> 0x005d, CancellationException -> 0x0060, TryCatch #10 {Exception -> 0x005a, blocks: (B:16:0x0055, B:116:0x031a, B:122:0x0349, B:119:0x0321, B:121:0x0325, B:123:0x0356, B:124:0x035b, B:131:0x03c1, B:134:0x03cf, B:27:0x0087, B:103:0x02a0, B:106:0x02a8, B:108:0x02ac, B:109:0x02c8, B:110:0x02cd, B:85:0x0219, B:67:0x01a2, B:69:0x01ac, B:73:0x01be, B:78:0x01cb, B:81:0x01d9, B:75:0x01c2, B:76:0x01c7, B:77:0x01c8, B:127:0x0362, B:128:0x036a), top: B:149:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c8 A[Catch: Exception -> 0x005a, c -> 0x005d, CancellationException -> 0x0060, TryCatch #10 {Exception -> 0x005a, blocks: (B:16:0x0055, B:116:0x031a, B:122:0x0349, B:119:0x0321, B:121:0x0325, B:123:0x0356, B:124:0x035b, B:131:0x03c1, B:134:0x03cf, B:27:0x0087, B:103:0x02a0, B:106:0x02a8, B:108:0x02ac, B:109:0x02c8, B:110:0x02cd, B:85:0x0219, B:67:0x01a2, B:69:0x01ac, B:73:0x01be, B:78:0x01cb, B:81:0x01d9, B:75:0x01c2, B:76:0x01c7, B:77:0x01c8, B:127:0x0362, B:128:0x036a), top: B:149:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:115:0x0319  */
    /* JADX WARN: Code duplicated, block: B:118:0x0320  */
    /* JADX WARN: Code duplicated, block: B:119:0x0321 A[Catch: Exception -> 0x005a, c -> 0x005d, CancellationException -> 0x0060, TryCatch #10 {Exception -> 0x005a, blocks: (B:16:0x0055, B:116:0x031a, B:122:0x0349, B:119:0x0321, B:121:0x0325, B:123:0x0356, B:124:0x035b, B:131:0x03c1, B:134:0x03cf, B:27:0x0087, B:103:0x02a0, B:106:0x02a8, B:108:0x02ac, B:109:0x02c8, B:110:0x02cd, B:85:0x0219, B:67:0x01a2, B:69:0x01ac, B:73:0x01be, B:78:0x01cb, B:81:0x01d9, B:75:0x01c2, B:76:0x01c7, B:77:0x01c8, B:127:0x0362, B:128:0x036a), top: B:149:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0325 A[Catch: Exception -> 0x005a, c -> 0x005d, CancellationException -> 0x0060, TryCatch #10 {Exception -> 0x005a, blocks: (B:16:0x0055, B:116:0x031a, B:122:0x0349, B:119:0x0321, B:121:0x0325, B:123:0x0356, B:124:0x035b, B:131:0x03c1, B:134:0x03cf, B:27:0x0087, B:103:0x02a0, B:106:0x02a8, B:108:0x02ac, B:109:0x02c8, B:110:0x02cd, B:85:0x0219, B:67:0x01a2, B:69:0x01ac, B:73:0x01be, B:78:0x01cb, B:81:0x01d9, B:75:0x01c2, B:76:0x01c7, B:77:0x01c8, B:127:0x0362, B:128:0x036a), top: B:149:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0356 A[Catch: Exception -> 0x005a, c -> 0x005d, CancellationException -> 0x0060, TryCatch #10 {Exception -> 0x005a, blocks: (B:16:0x0055, B:116:0x031a, B:122:0x0349, B:119:0x0321, B:121:0x0325, B:123:0x0356, B:124:0x035b, B:131:0x03c1, B:134:0x03cf, B:27:0x0087, B:103:0x02a0, B:106:0x02a8, B:108:0x02ac, B:109:0x02c8, B:110:0x02cd, B:85:0x0219, B:67:0x01a2, B:69:0x01ac, B:73:0x01be, B:78:0x01cb, B:81:0x01d9, B:75:0x01c2, B:76:0x01c7, B:77:0x01c8, B:127:0x0362, B:128:0x036a), top: B:149:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:125:0x035c A[Catch: Exception -> 0x023a, c -> 0x023e, CancellationException -> 0x0242, TRY_ENTER, TryCatch #9 {c -> 0x023e, CancellationException -> 0x0242, Exception -> 0x023a, blocks: (B:88:0x0230, B:97:0x0249, B:99:0x0253, B:112:0x02d2, B:125:0x035c, B:126:0x0361, B:57:0x0134), top: B:153:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0362 A[Catch: Exception -> 0x005a, c -> 0x005d, CancellationException -> 0x0060, TRY_ENTER, TryCatch #10 {Exception -> 0x005a, blocks: (B:16:0x0055, B:116:0x031a, B:122:0x0349, B:119:0x0321, B:121:0x0325, B:123:0x0356, B:124:0x035b, B:131:0x03c1, B:134:0x03cf, B:27:0x0087, B:103:0x02a0, B:106:0x02a8, B:108:0x02ac, B:109:0x02c8, B:110:0x02cd, B:85:0x0219, B:67:0x01a2, B:69:0x01ac, B:73:0x01be, B:78:0x01cb, B:81:0x01d9, B:75:0x01c2, B:76:0x01c7, B:77:0x01c8, B:127:0x0362, B:128:0x036a), top: B:149:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:129:0x036b A[Catch: Exception -> 0x011f, c -> 0x0123, CancellationException -> 0x0127, TRY_ENTER, TryCatch #10 {c -> 0x0123, CancellationException -> 0x0127, Exception -> 0x011f, blocks: (B:48:0x0116, B:61:0x016e, B:63:0x0174, B:129:0x036b, B:130:0x03c0), top: B:152:0x0116 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:140:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:141:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:143:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:146:0x0408  */
    /* JADX WARN: Code duplicated, block: B:63:0x0174 A[Catch: Exception -> 0x011f, c -> 0x0123, CancellationException -> 0x0127, TRY_LEAVE, TryCatch #10 {c -> 0x0123, CancellationException -> 0x0127, Exception -> 0x011f, blocks: (B:48:0x0116, B:61:0x016e, B:63:0x0174, B:129:0x036b, B:130:0x03c0), top: B:152:0x0116 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x019b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ac A[Catch: Exception -> 0x005a, c -> 0x005d, CancellationException -> 0x0060, TryCatch #10 {Exception -> 0x005a, blocks: (B:16:0x0055, B:116:0x031a, B:122:0x0349, B:119:0x0321, B:121:0x0325, B:123:0x0356, B:124:0x035b, B:131:0x03c1, B:134:0x03cf, B:27:0x0087, B:103:0x02a0, B:106:0x02a8, B:108:0x02ac, B:109:0x02c8, B:110:0x02cd, B:85:0x0219, B:67:0x01a2, B:69:0x01ac, B:73:0x01be, B:78:0x01cb, B:81:0x01d9, B:75:0x01c2, B:76:0x01c7, B:77:0x01c8, B:127:0x0362, B:128:0x036a), top: B:149:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01be A[Catch: Exception -> 0x005a, c -> 0x005d, CancellationException -> 0x0060, TryCatch #10 {Exception -> 0x005a, blocks: (B:16:0x0055, B:116:0x031a, B:122:0x0349, B:119:0x0321, B:121:0x0325, B:123:0x0356, B:124:0x035b, B:131:0x03c1, B:134:0x03cf, B:27:0x0087, B:103:0x02a0, B:106:0x02a8, B:108:0x02ac, B:109:0x02c8, B:110:0x02cd, B:85:0x0219, B:67:0x01a2, B:69:0x01ac, B:73:0x01be, B:78:0x01cb, B:81:0x01d9, B:75:0x01c2, B:76:0x01c7, B:77:0x01c8, B:127:0x0362, B:128:0x036a), top: B:149:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01c2 A[Catch: Exception -> 0x005a, c -> 0x005d, CancellationException -> 0x0060, TryCatch #10 {Exception -> 0x005a, blocks: (B:16:0x0055, B:116:0x031a, B:122:0x0349, B:119:0x0321, B:121:0x0325, B:123:0x0356, B:124:0x035b, B:131:0x03c1, B:134:0x03cf, B:27:0x0087, B:103:0x02a0, B:106:0x02a8, B:108:0x02ac, B:109:0x02c8, B:110:0x02cd, B:85:0x0219, B:67:0x01a2, B:69:0x01ac, B:73:0x01be, B:78:0x01cb, B:81:0x01d9, B:75:0x01c2, B:76:0x01c7, B:77:0x01c8, B:127:0x0362, B:128:0x036a), top: B:149:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01c8 A[Catch: Exception -> 0x005a, c -> 0x005d, CancellationException -> 0x0060, TryCatch #10 {Exception -> 0x005a, blocks: (B:16:0x0055, B:116:0x031a, B:122:0x0349, B:119:0x0321, B:121:0x0325, B:123:0x0356, B:124:0x035b, B:131:0x03c1, B:134:0x03cf, B:27:0x0087, B:103:0x02a0, B:106:0x02a8, B:108:0x02ac, B:109:0x02c8, B:110:0x02cd, B:85:0x0219, B:67:0x01a2, B:69:0x01ac, B:73:0x01be, B:78:0x01cb, B:81:0x01d9, B:75:0x01c2, B:76:0x01c7, B:77:0x01c8, B:127:0x0362, B:128:0x036a), top: B:149:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9 A[Catch: Exception -> 0x005a, c -> 0x005d, CancellationException -> 0x0060, TryCatch #10 {Exception -> 0x005a, blocks: (B:16:0x0055, B:116:0x031a, B:122:0x0349, B:119:0x0321, B:121:0x0325, B:123:0x0356, B:124:0x035b, B:131:0x03c1, B:134:0x03cf, B:27:0x0087, B:103:0x02a0, B:106:0x02a8, B:108:0x02ac, B:109:0x02c8, B:110:0x02cd, B:85:0x0219, B:67:0x01a2, B:69:0x01ac, B:73:0x01be, B:78:0x01cb, B:81:0x01d9, B:75:0x01c2, B:76:0x01c7, B:77:0x01c8, B:127:0x0362, B:128:0x036a), top: B:149:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0212  */
    /* JADX WARN: Code duplicated, block: B:84:0x0214  */
    /* JADX WARN: Code duplicated, block: B:88:0x0230 A[Catch: Exception -> 0x023a, c -> 0x023e, CancellationException -> 0x0242, TRY_ENTER, TryCatch #9 {c -> 0x023e, CancellationException -> 0x0242, Exception -> 0x023a, blocks: (B:88:0x0230, B:97:0x0249, B:99:0x0253, B:112:0x02d2, B:125:0x035c, B:126:0x0361, B:57:0x0134), top: B:153:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0246  */
    /* JADX WARN: Code duplicated, block: B:97:0x0249 A[Catch: Exception -> 0x023a, c -> 0x023e, CancellationException -> 0x0242, TryCatch #9 {c -> 0x023e, CancellationException -> 0x0242, Exception -> 0x023a, blocks: (B:88:0x0230, B:97:0x0249, B:99:0x0253, B:112:0x02d2, B:125:0x035c, B:126:0x0361, B:57:0x0134), top: B:153:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0253 A[Catch: Exception -> 0x023a, c -> 0x023e, CancellationException -> 0x0242, TRY_LEAVE, TryCatch #9 {c -> 0x023e, CancellationException -> 0x0242, Exception -> 0x023a, blocks: (B:88:0x0230, B:97:0x0249, B:99:0x0253, B:112:0x02d2, B:125:0x035c, B:126:0x0361, B:57:0x0134), top: B:153:0x0134 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x036b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v27 */
    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(mz3.z.Params params, tq.e<? super dx.i<? extends dx.b, ? extends mz3.z.c>> eVar) throws Throwable {
        b bVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        mz3.z.Params params2;
        int i15;
        dx.j<dx.b> jVar;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar2;
        dx.i iVar;
        int i25;
        int i26;
        int i27;
        int i28;
        ex.b bVar3;
        dx.j<dx.b> jVar2;
        mz3.z.Params params3;
        dx.b.Business business;
        int i29;
        lz3.d dVar;
        lz3.d dVar2;
        ex.b bVar4;
        Object objB2;
        dx.b.Business business2;
        ex.b bVar5;
        ex.b bVar6;
        int i35;
        int i36;
        dx.j<dx.b> jVar3;
        int i37;
        ex.b bVar7;
        mz3.z.Params params4;
        ?? r15;
        dx.i right;
        ?? r16 = "Document: ";
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i38 = bVar.f193042v;
            if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f193042v = i38 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f193040s;
        Object objE = uq.b.e();
        int i39 = bVar.f193042v;
        try {
            try {
                try {
                    if (i39 == 0) {
                        oq.u.b(objC);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            aVar = new ex.a();
                            d0 d0Var = this.getTaskIdAssociatedWithDocumentTypeUC;
                            d0.Params params5 = new d0.Params(params.getDocumentType());
                            params2 = params;
                            bVar.f193027d = params2;
                            bVar.f193028e = jVarA;
                            bVar.f193029f = vq.j.a(aVar);
                            bVar.f193030g = aVar;
                            i15 = 0;
                            bVar.f193034l = 0;
                            bVar.f193035m = 0;
                            bVar.f193036n = 0;
                            bVar.f193037p = 0;
                            bVar.f193038q = 0;
                            bVar.f193042v = 1;
                            objC = d0Var.c(params5, bVar);
                            if (objC != objE) {
                                jVar = jVarA;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                bVar2 = aVar;
                                iVar = (dx.i) objC;
                                if (!(iVar instanceof dx.i.Right)) {
                                    String str = (String) ((dx.i.Right) iVar).b();
                                    px.f.f163100a.g("Document: " + params2.getDocumentType() + " is already updating by task: " + str, px.c.a(this));
                                    aVar.b(new dx.b.Generic(new IllegalStateException("Document: " + params2.getDocumentType() + " is already updating by task: " + str)));
                                    throw new oq.g();
                                }
                                qz3.a aVar2 = this.asyncDocumentUpdateInteractor;
                                rq0.b documentType = params2.getDocumentType();
                                bVar.f193027d = params2;
                                bVar.f193028e = jVar;
                                bVar.f193029f = vq.j.a(bVar2);
                                bVar.f193030g = aVar;
                                bVar.f193034l = i19;
                                bVar.f193035m = i18;
                                bVar.f193036n = i15;
                                bVar.f193037p = i17;
                                bVar.f193038q = i16;
                                bVar.f193042v = 2;
                                objC = aVar2.a(documentType, bVar);
                                if (objC != objE) {
                                    i25 = i16;
                                    i26 = i15;
                                    i27 = i18;
                                    i28 = i19;
                                    bVar3 = aVar;
                                    jVar2 = jVar;
                                    params3 = params2;
                                    business = (dx.b.Business) ((dx.i) objC).a();
                                    if (business != null) {
                                        bVar3.b(business);
                                        throw new oq.g();
                                    }
                                    i29 = a.f193026a[params3.getUpdateMethodType().ordinal()];
                                    if (i29 == 1) {
                                        dVar = lz3.d.DOCUMENT_UPDATE;
                                    } else {
                                        if (i29 != 2) {
                                            throw new oq.p();
                                        }
                                        dVar = lz3.d.DOCUMENT_REDOWNLOAD;
                                    }
                                    dVar2 = dVar;
                                    if (params3.getIgnoreCooldown()) {
                                        i35 = i17;
                                        i36 = i26;
                                        jVar3 = jVar2;
                                        i37 = i25;
                                        bVar7 = bVar3;
                                        params4 = params3;
                                        r15 = 1;
                                        if (r15 != 0) {
                                            right = new dx.i.Right(mz3.z.c.a.f129731a);
                                        } else {
                                            if (r15 != 1) {
                                                throw new oq.p();
                                            }
                                            if (params4.getDocumentType().e()) {
                                                mz3.k kVar = this.generateMainDocumentsAsyncUC;
                                                mz3.z.Params params6 = params4;
                                                mz3.k.Params params7 = new mz3.k.Params(params6.getDocumentType(), dVar2, params6.getDocumentIID());
                                                bVar.f193027d = vq.j.a(params6);
                                                bVar.f193028e = jVar3;
                                                bVar.f193029f = vq.j.a(bVar2);
                                                bVar.f193030g = vq.j.a(bVar7);
                                                bVar.f193031h = vq.j.a(business);
                                                bVar.f193032j = vq.j.a(dVar2);
                                                bVar.f193033k = bVar7;
                                                bVar.f193034l = i28;
                                                bVar.f193035m = i27;
                                                bVar.f193036n = i36;
                                                bVar.f193037p = i35;
                                                bVar.f193038q = i37;
                                                bVar.f193039r = r15;
                                                bVar.f193042v = 4;
                                                objC = kVar.c(params7, bVar);
                                                if (objC != objE) {
                                                    right = (dx.i) objC;
                                                    if (!(right instanceof dx.i.Left)) {
                                                        if (right instanceof dx.i.Right) {
                                                            throw new oq.p();
                                                        }
                                                        mz3.k.Result result = (mz3.k.Result) ((dx.i.Right) right).b();
                                                        right = new dx.i.Right(new mz3.z.c.UpdateStarted(result.getTaskID(), result.getDocumentID()));
                                                    }
                                                }
                                            } else {
                                                mz3.z.Params params8 = params4;
                                                ex.b bVar8 = bVar2;
                                                mz3.j jVar4 = this.generateDocumentsAsyncUseCase;
                                                mz3.j.a.UpdateDocument updateDocument = new mz3.j.a.UpdateDocument(dVar2, params8.getDocumentType(), params8.getDocumentIID());
                                                bVar.f193027d = vq.j.a(params8);
                                                bVar.f193028e = jVar3;
                                                bVar.f193029f = vq.j.a(bVar8);
                                                bVar.f193030g = vq.j.a(bVar7);
                                                bVar.f193031h = vq.j.a(business);
                                                bVar.f193032j = vq.j.a(dVar2);
                                                bVar.f193033k = bVar7;
                                                bVar.f193034l = i28;
                                                bVar.f193035m = i27;
                                                bVar.f193036n = i36;
                                                bVar.f193037p = i35;
                                                bVar.f193038q = i37;
                                                bVar.f193039r = r15;
                                                bVar.f193042v = 5;
                                                objC = jVar4.c(updateDocument, bVar);
                                                if (objC != objE) {
                                                    right = (dx.i) objC;
                                                    if (!(right instanceof dx.i.Left)) {
                                                        if (right instanceof dx.i.Right) {
                                                            throw new oq.p();
                                                        }
                                                        AsyncDocumentGenerationResponse asyncDocumentGenerationResponse = (AsyncDocumentGenerationResponse) ((dx.i.Right) right).b();
                                                        right = new dx.i.Right(new mz3.z.c.UpdateStarted(asyncDocumentGenerationResponse.getTaskId(), ((DocumentToGenerate) pq.v.l0(asyncDocumentGenerationResponse.a())).getDocumentId()));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        qz3.a aVar3 = this.asyncDocumentUpdateInteractor;
                                        bVar4 = bVar2;
                                        String strD = d(params3.getDocumentType(), dVar2, params3.getDocumentIID());
                                        bVar.f193027d = params3;
                                        bVar.f193028e = jVar2;
                                        bVar.f193029f = vq.j.a(bVar4);
                                        bVar.f193030g = bVar3;
                                        bVar.f193031h = vq.j.a(business);
                                        bVar.f193032j = dVar2;
                                        bVar.f193033k = bVar3;
                                        bVar.f193034l = i28;
                                        bVar.f193035m = i27;
                                        bVar.f193036n = i26;
                                        bVar.f193037p = i17;
                                        bVar.f193038q = i25;
                                        bVar.f193042v = 3;
                                        objB2 = aVar3.b(strD, bVar);
                                        if (objB2 != objE) {
                                            business2 = business;
                                            objC = objB2;
                                            bVar5 = bVar3;
                                            bVar6 = bVar4;
                                            boolean zBooleanValue = ((Boolean) bVar3.a((dx.i) objC)).booleanValue();
                                            params4 = params3;
                                            r15 = zBooleanValue;
                                            business = business2;
                                            bVar2 = bVar6;
                                            i35 = i17;
                                            i36 = i26;
                                            jVar3 = jVar2;
                                            i37 = i25;
                                            bVar7 = bVar5;
                                            if (r15 != 0) {
                                                right = new dx.i.Right(mz3.z.c.a.f129731a);
                                            } else {
                                                if (r15 != 1) {
                                                    throw new oq.p();
                                                }
                                                if (params4.getDocumentType().e()) {
                                                    mz3.k kVar2 = this.generateMainDocumentsAsyncUC;
                                                    mz3.z.Params params9 = params4;
                                                    mz3.k.Params params10 = new mz3.k.Params(params9.getDocumentType(), dVar2, params9.getDocumentIID());
                                                    bVar.f193027d = vq.j.a(params9);
                                                    bVar.f193028e = jVar3;
                                                    bVar.f193029f = vq.j.a(bVar2);
                                                    bVar.f193030g = vq.j.a(bVar7);
                                                    bVar.f193031h = vq.j.a(business);
                                                    bVar.f193032j = vq.j.a(dVar2);
                                                    bVar.f193033k = bVar7;
                                                    bVar.f193034l = i28;
                                                    bVar.f193035m = i27;
                                                    bVar.f193036n = i36;
                                                    bVar.f193037p = i35;
                                                    bVar.f193038q = i37;
                                                    bVar.f193039r = r15;
                                                    bVar.f193042v = 4;
                                                    objC = kVar2.c(params10, bVar);
                                                    if (objC != objE) {
                                                        right = (dx.i) objC;
                                                        if (!(right instanceof dx.i.Left)) {
                                                            if (right instanceof dx.i.Right) {
                                                                throw new oq.p();
                                                            }
                                                            mz3.k.Result result2 = (mz3.k.Result) ((dx.i.Right) right).b();
                                                            right = new dx.i.Right(new mz3.z.c.UpdateStarted(result2.getTaskID(), result2.getDocumentID()));
                                                        }
                                                    }
                                                } else {
                                                    mz3.z.Params params11 = params4;
                                                    ex.b bVar9 = bVar2;
                                                    mz3.j jVar5 = this.generateDocumentsAsyncUseCase;
                                                    mz3.j.a.UpdateDocument updateDocument2 = new mz3.j.a.UpdateDocument(dVar2, params11.getDocumentType(), params11.getDocumentIID());
                                                    bVar.f193027d = vq.j.a(params11);
                                                    bVar.f193028e = jVar3;
                                                    bVar.f193029f = vq.j.a(bVar9);
                                                    bVar.f193030g = vq.j.a(bVar7);
                                                    bVar.f193031h = vq.j.a(business);
                                                    bVar.f193032j = vq.j.a(dVar2);
                                                    bVar.f193033k = bVar7;
                                                    bVar.f193034l = i28;
                                                    bVar.f193035m = i27;
                                                    bVar.f193036n = i36;
                                                    bVar.f193037p = i35;
                                                    bVar.f193038q = i37;
                                                    bVar.f193039r = r15;
                                                    bVar.f193042v = 5;
                                                    objC = jVar5.c(updateDocument2, bVar);
                                                    if (objC != objE) {
                                                        right = (dx.i) objC;
                                                        if (!(right instanceof dx.i.Left)) {
                                                            if (right instanceof dx.i.Right) {
                                                                throw new oq.p();
                                                            }
                                                            AsyncDocumentGenerationResponse asyncDocumentGenerationResponse2 = (AsyncDocumentGenerationResponse) ((dx.i.Right) right).b();
                                                            right = new dx.i.Right(new mz3.z.c.UpdateStarted(asyncDocumentGenerationResponse2.getTaskId(), ((DocumentToGenerate) pq.v.l0(asyncDocumentGenerationResponse2.a())).getDocumentId()));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
                            r16 = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r16));
                            iVarA = r16.a(e);
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
                    if (i39 == 1) {
                        i16 = bVar.f193038q;
                        i17 = bVar.f193037p;
                        int i45 = bVar.f193036n;
                        i18 = bVar.f193035m;
                        i19 = bVar.f193034l;
                        aVar = (ex.b) bVar.f193030g;
                        bVar2 = (ex.b) bVar.f193029f;
                        jVar = (dx.j) bVar.f193028e;
                        mz3.z.Params params12 = (mz3.z.Params) bVar.f193027d;
                        try {
                            oq.u.b(objC);
                            i15 = i45;
                            params2 = params12;
                            iVar = (dx.i) objC;
                            if (!(iVar instanceof dx.i.Right)) {
                                String str2 = (String) ((dx.i.Right) iVar).b();
                                px.f.f163100a.g("Document: " + params2.getDocumentType() + " is already updating by task: " + str2, px.c.a(this));
                                aVar.b(new dx.b.Generic(new IllegalStateException("Document: " + params2.getDocumentType() + " is already updating by task: " + str2)));
                                throw new oq.g();
                            }
                            qz3.a aVar4 = this.asyncDocumentUpdateInteractor;
                            rq0.b documentType2 = params2.getDocumentType();
                            bVar.f193027d = params2;
                            bVar.f193028e = jVar;
                            bVar.f193029f = vq.j.a(bVar2);
                            bVar.f193030g = aVar;
                            bVar.f193034l = i19;
                            bVar.f193035m = i18;
                            bVar.f193036n = i15;
                            bVar.f193037p = i17;
                            bVar.f193038q = i16;
                            bVar.f193042v = 2;
                            objC = aVar4.a(documentType2, bVar);
                            if (objC != objE) {
                                i25 = i16;
                                i26 = i15;
                                i27 = i18;
                                i28 = i19;
                                bVar3 = aVar;
                                jVar2 = jVar;
                                params3 = params2;
                                business = (dx.b.Business) ((dx.i) objC).a();
                                if (business != null) {
                                    bVar3.b(business);
                                    throw new oq.g();
                                }
                                i29 = a.f193026a[params3.getUpdateMethodType().ordinal()];
                                if (i29 == 1) {
                                    dVar = lz3.d.DOCUMENT_UPDATE;
                                } else {
                                    if (i29 != 2) {
                                        throw new oq.p();
                                    }
                                    dVar = lz3.d.DOCUMENT_REDOWNLOAD;
                                }
                                dVar2 = dVar;
                                if (params3.getIgnoreCooldown()) {
                                    i35 = i17;
                                    i36 = i26;
                                    jVar3 = jVar2;
                                    i37 = i25;
                                    bVar7 = bVar3;
                                    params4 = params3;
                                    r15 = 1;
                                    if (r15 != 0) {
                                        right = new dx.i.Right(mz3.z.c.a.f129731a);
                                    } else {
                                        if (r15 != 1) {
                                            throw new oq.p();
                                        }
                                        if (params4.getDocumentType().e()) {
                                            mz3.k kVar3 = this.generateMainDocumentsAsyncUC;
                                            mz3.z.Params params13 = params4;
                                            mz3.k.Params params14 = new mz3.k.Params(params13.getDocumentType(), dVar2, params13.getDocumentIID());
                                            bVar.f193027d = vq.j.a(params13);
                                            bVar.f193028e = jVar3;
                                            bVar.f193029f = vq.j.a(bVar2);
                                            bVar.f193030g = vq.j.a(bVar7);
                                            bVar.f193031h = vq.j.a(business);
                                            bVar.f193032j = vq.j.a(dVar2);
                                            bVar.f193033k = bVar7;
                                            bVar.f193034l = i28;
                                            bVar.f193035m = i27;
                                            bVar.f193036n = i36;
                                            bVar.f193037p = i35;
                                            bVar.f193038q = i37;
                                            bVar.f193039r = r15;
                                            bVar.f193042v = 4;
                                            objC = kVar3.c(params14, bVar);
                                            if (objC != objE) {
                                                right = (dx.i) objC;
                                                if (!(right instanceof dx.i.Left)) {
                                                    if (right instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    mz3.k.Result result3 = (mz3.k.Result) ((dx.i.Right) right).b();
                                                    right = new dx.i.Right(new mz3.z.c.UpdateStarted(result3.getTaskID(), result3.getDocumentID()));
                                                }
                                            }
                                        } else {
                                            mz3.z.Params params15 = params4;
                                            ex.b bVar10 = bVar2;
                                            mz3.j jVar6 = this.generateDocumentsAsyncUseCase;
                                            mz3.j.a.UpdateDocument updateDocument3 = new mz3.j.a.UpdateDocument(dVar2, params15.getDocumentType(), params15.getDocumentIID());
                                            bVar.f193027d = vq.j.a(params15);
                                            bVar.f193028e = jVar3;
                                            bVar.f193029f = vq.j.a(bVar10);
                                            bVar.f193030g = vq.j.a(bVar7);
                                            bVar.f193031h = vq.j.a(business);
                                            bVar.f193032j = vq.j.a(dVar2);
                                            bVar.f193033k = bVar7;
                                            bVar.f193034l = i28;
                                            bVar.f193035m = i27;
                                            bVar.f193036n = i36;
                                            bVar.f193037p = i35;
                                            bVar.f193038q = i37;
                                            bVar.f193039r = r15;
                                            bVar.f193042v = 5;
                                            objC = jVar6.c(updateDocument3, bVar);
                                            if (objC != objE) {
                                                right = (dx.i) objC;
                                                if (!(right instanceof dx.i.Left)) {
                                                    if (right instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    AsyncDocumentGenerationResponse asyncDocumentGenerationResponse3 = (AsyncDocumentGenerationResponse) ((dx.i.Right) right).b();
                                                    right = new dx.i.Right(new mz3.z.c.UpdateStarted(asyncDocumentGenerationResponse3.getTaskId(), ((DocumentToGenerate) pq.v.l0(asyncDocumentGenerationResponse3.a())).getDocumentId()));
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    qz3.a aVar5 = this.asyncDocumentUpdateInteractor;
                                    bVar4 = bVar2;
                                    String strD2 = d(params3.getDocumentType(), dVar2, params3.getDocumentIID());
                                    bVar.f193027d = params3;
                                    bVar.f193028e = jVar2;
                                    bVar.f193029f = vq.j.a(bVar4);
                                    bVar.f193030g = bVar3;
                                    bVar.f193031h = vq.j.a(business);
                                    bVar.f193032j = dVar2;
                                    bVar.f193033k = bVar3;
                                    bVar.f193034l = i28;
                                    bVar.f193035m = i27;
                                    bVar.f193036n = i26;
                                    bVar.f193037p = i17;
                                    bVar.f193038q = i25;
                                    bVar.f193042v = 3;
                                    objB2 = aVar5.b(strD2, bVar);
                                    if (objB2 != objE) {
                                        business2 = business;
                                        objC = objB2;
                                        bVar5 = bVar3;
                                        bVar6 = bVar4;
                                        boolean zBooleanValue2 = ((Boolean) bVar3.a((dx.i) objC)).booleanValue();
                                        params4 = params3;
                                        r15 = zBooleanValue2;
                                        business = business2;
                                        bVar2 = bVar6;
                                        i35 = i17;
                                        i36 = i26;
                                        jVar3 = jVar2;
                                        i37 = i25;
                                        bVar7 = bVar5;
                                        if (r15 != 0) {
                                            right = new dx.i.Right(mz3.z.c.a.f129731a);
                                        } else {
                                            if (r15 != 1) {
                                                throw new oq.p();
                                            }
                                            if (params4.getDocumentType().e()) {
                                                mz3.k kVar4 = this.generateMainDocumentsAsyncUC;
                                                mz3.z.Params params16 = params4;
                                                mz3.k.Params params17 = new mz3.k.Params(params16.getDocumentType(), dVar2, params16.getDocumentIID());
                                                bVar.f193027d = vq.j.a(params16);
                                                bVar.f193028e = jVar3;
                                                bVar.f193029f = vq.j.a(bVar2);
                                                bVar.f193030g = vq.j.a(bVar7);
                                                bVar.f193031h = vq.j.a(business);
                                                bVar.f193032j = vq.j.a(dVar2);
                                                bVar.f193033k = bVar7;
                                                bVar.f193034l = i28;
                                                bVar.f193035m = i27;
                                                bVar.f193036n = i36;
                                                bVar.f193037p = i35;
                                                bVar.f193038q = i37;
                                                bVar.f193039r = r15;
                                                bVar.f193042v = 4;
                                                objC = kVar4.c(params17, bVar);
                                                if (objC != objE) {
                                                    right = (dx.i) objC;
                                                    if (!(right instanceof dx.i.Left)) {
                                                        if (right instanceof dx.i.Right) {
                                                            throw new oq.p();
                                                        }
                                                        mz3.k.Result result4 = (mz3.k.Result) ((dx.i.Right) right).b();
                                                        right = new dx.i.Right(new mz3.z.c.UpdateStarted(result4.getTaskID(), result4.getDocumentID()));
                                                    }
                                                }
                                            } else {
                                                mz3.z.Params params18 = params4;
                                                ex.b bVar11 = bVar2;
                                                mz3.j jVar7 = this.generateDocumentsAsyncUseCase;
                                                mz3.j.a.UpdateDocument updateDocument4 = new mz3.j.a.UpdateDocument(dVar2, params18.getDocumentType(), params18.getDocumentIID());
                                                bVar.f193027d = vq.j.a(params18);
                                                bVar.f193028e = jVar3;
                                                bVar.f193029f = vq.j.a(bVar11);
                                                bVar.f193030g = vq.j.a(bVar7);
                                                bVar.f193031h = vq.j.a(business);
                                                bVar.f193032j = vq.j.a(dVar2);
                                                bVar.f193033k = bVar7;
                                                bVar.f193034l = i28;
                                                bVar.f193035m = i27;
                                                bVar.f193036n = i36;
                                                bVar.f193037p = i35;
                                                bVar.f193038q = i37;
                                                bVar.f193039r = r15;
                                                bVar.f193042v = 5;
                                                objC = jVar7.c(updateDocument4, bVar);
                                                if (objC != objE) {
                                                    right = (dx.i) objC;
                                                    if (!(right instanceof dx.i.Left)) {
                                                        if (right instanceof dx.i.Right) {
                                                            throw new oq.p();
                                                        }
                                                        AsyncDocumentGenerationResponse asyncDocumentGenerationResponse4 = (AsyncDocumentGenerationResponse) ((dx.i.Right) right).b();
                                                        right = new dx.i.Right(new mz3.z.c.UpdateStarted(asyncDocumentGenerationResponse4.getTaskId(), ((DocumentToGenerate) pq.v.l0(asyncDocumentGenerationResponse4.a())).getDocumentId()));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return objE;
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            r16 = jVar;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(r16));
                            iVarA = r16.a(e);
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
                    if (i39 == 2) {
                        i25 = bVar.f193038q;
                        int i46 = bVar.f193037p;
                        i26 = bVar.f193036n;
                        int i47 = bVar.f193035m;
                        int i48 = bVar.f193034l;
                        ex.b bVar12 = (ex.b) bVar.f193030g;
                        ex.b bVar13 = (ex.b) bVar.f193029f;
                        dx.j<dx.b> jVar8 = (dx.j) bVar.f193028e;
                        mz3.z.Params params19 = (mz3.z.Params) bVar.f193027d;
                        try {
                            oq.u.b(objC);
                            bVar3 = bVar12;
                            params3 = params19;
                            bVar2 = bVar13;
                            i27 = i47;
                            i28 = i48;
                            i17 = i46;
                            jVar2 = jVar8;
                            business = (dx.b.Business) ((dx.i) objC).a();
                            if (business != null) {
                                bVar3.b(business);
                                throw new oq.g();
                            }
                            i29 = a.f193026a[params3.getUpdateMethodType().ordinal()];
                            if (i29 == 1) {
                                dVar = lz3.d.DOCUMENT_UPDATE;
                            } else {
                                if (i29 != 2) {
                                    throw new oq.p();
                                }
                                dVar = lz3.d.DOCUMENT_REDOWNLOAD;
                            }
                            dVar2 = dVar;
                            if (params3.getIgnoreCooldown()) {
                                i35 = i17;
                                i36 = i26;
                                jVar3 = jVar2;
                                i37 = i25;
                                bVar7 = bVar3;
                                params4 = params3;
                                r15 = 1;
                                if (r15 != 0) {
                                    right = new dx.i.Right(mz3.z.c.a.f129731a);
                                } else {
                                    if (r15 != 1) {
                                        throw new oq.p();
                                    }
                                    if (params4.getDocumentType().e()) {
                                        mz3.k kVar5 = this.generateMainDocumentsAsyncUC;
                                        mz3.z.Params params110 = params4;
                                        mz3.k.Params params111 = new mz3.k.Params(params110.getDocumentType(), dVar2, params110.getDocumentIID());
                                        bVar.f193027d = vq.j.a(params110);
                                        bVar.f193028e = jVar3;
                                        bVar.f193029f = vq.j.a(bVar2);
                                        bVar.f193030g = vq.j.a(bVar7);
                                        bVar.f193031h = vq.j.a(business);
                                        bVar.f193032j = vq.j.a(dVar2);
                                        bVar.f193033k = bVar7;
                                        bVar.f193034l = i28;
                                        bVar.f193035m = i27;
                                        bVar.f193036n = i36;
                                        bVar.f193037p = i35;
                                        bVar.f193038q = i37;
                                        bVar.f193039r = r15;
                                        bVar.f193042v = 4;
                                        objC = kVar5.c(params111, bVar);
                                        if (objC != objE) {
                                            right = (dx.i) objC;
                                            if (!(right instanceof dx.i.Left)) {
                                                if (right instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                mz3.k.Result result5 = (mz3.k.Result) ((dx.i.Right) right).b();
                                                right = new dx.i.Right(new mz3.z.c.UpdateStarted(result5.getTaskID(), result5.getDocumentID()));
                                            }
                                        }
                                    } else {
                                        mz3.z.Params params112 = params4;
                                        ex.b bVar14 = bVar2;
                                        mz3.j jVar9 = this.generateDocumentsAsyncUseCase;
                                        mz3.j.a.UpdateDocument updateDocument5 = new mz3.j.a.UpdateDocument(dVar2, params112.getDocumentType(), params112.getDocumentIID());
                                        bVar.f193027d = vq.j.a(params112);
                                        bVar.f193028e = jVar3;
                                        bVar.f193029f = vq.j.a(bVar14);
                                        bVar.f193030g = vq.j.a(bVar7);
                                        bVar.f193031h = vq.j.a(business);
                                        bVar.f193032j = vq.j.a(dVar2);
                                        bVar.f193033k = bVar7;
                                        bVar.f193034l = i28;
                                        bVar.f193035m = i27;
                                        bVar.f193036n = i36;
                                        bVar.f193037p = i35;
                                        bVar.f193038q = i37;
                                        bVar.f193039r = r15;
                                        bVar.f193042v = 5;
                                        objC = jVar9.c(updateDocument5, bVar);
                                        if (objC != objE) {
                                            right = (dx.i) objC;
                                            if (!(right instanceof dx.i.Left)) {
                                                if (right instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                AsyncDocumentGenerationResponse asyncDocumentGenerationResponse5 = (AsyncDocumentGenerationResponse) ((dx.i.Right) right).b();
                                                right = new dx.i.Right(new mz3.z.c.UpdateStarted(asyncDocumentGenerationResponse5.getTaskId(), ((DocumentToGenerate) pq.v.l0(asyncDocumentGenerationResponse5.a())).getDocumentId()));
                                            }
                                        }
                                    }
                                }
                            } else {
                                qz3.a aVar6 = this.asyncDocumentUpdateInteractor;
                                bVar4 = bVar2;
                                String strD3 = d(params3.getDocumentType(), dVar2, params3.getDocumentIID());
                                bVar.f193027d = params3;
                                bVar.f193028e = jVar2;
                                bVar.f193029f = vq.j.a(bVar4);
                                bVar.f193030g = bVar3;
                                bVar.f193031h = vq.j.a(business);
                                bVar.f193032j = dVar2;
                                bVar.f193033k = bVar3;
                                bVar.f193034l = i28;
                                bVar.f193035m = i27;
                                bVar.f193036n = i26;
                                bVar.f193037p = i17;
                                bVar.f193038q = i25;
                                bVar.f193042v = 3;
                                objB2 = aVar6.b(strD3, bVar);
                                if (objB2 != objE) {
                                    business2 = business;
                                    objC = objB2;
                                    bVar5 = bVar3;
                                    bVar6 = bVar4;
                                    boolean zBooleanValue3 = ((Boolean) bVar3.a((dx.i) objC)).booleanValue();
                                    params4 = params3;
                                    r15 = zBooleanValue3;
                                    business = business2;
                                    bVar2 = bVar6;
                                    i35 = i17;
                                    i36 = i26;
                                    jVar3 = jVar2;
                                    i37 = i25;
                                    bVar7 = bVar5;
                                    if (r15 != 0) {
                                        right = new dx.i.Right(mz3.z.c.a.f129731a);
                                    } else {
                                        if (r15 != 1) {
                                            throw new oq.p();
                                        }
                                        if (params4.getDocumentType().e()) {
                                            mz3.k kVar6 = this.generateMainDocumentsAsyncUC;
                                            mz3.z.Params params113 = params4;
                                            mz3.k.Params params114 = new mz3.k.Params(params113.getDocumentType(), dVar2, params113.getDocumentIID());
                                            bVar.f193027d = vq.j.a(params113);
                                            bVar.f193028e = jVar3;
                                            bVar.f193029f = vq.j.a(bVar2);
                                            bVar.f193030g = vq.j.a(bVar7);
                                            bVar.f193031h = vq.j.a(business);
                                            bVar.f193032j = vq.j.a(dVar2);
                                            bVar.f193033k = bVar7;
                                            bVar.f193034l = i28;
                                            bVar.f193035m = i27;
                                            bVar.f193036n = i36;
                                            bVar.f193037p = i35;
                                            bVar.f193038q = i37;
                                            bVar.f193039r = r15;
                                            bVar.f193042v = 4;
                                            objC = kVar6.c(params114, bVar);
                                            if (objC != objE) {
                                                right = (dx.i) objC;
                                                if (!(right instanceof dx.i.Left)) {
                                                    if (right instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    mz3.k.Result result6 = (mz3.k.Result) ((dx.i.Right) right).b();
                                                    right = new dx.i.Right(new mz3.z.c.UpdateStarted(result6.getTaskID(), result6.getDocumentID()));
                                                }
                                            }
                                        } else {
                                            mz3.z.Params params115 = params4;
                                            ex.b bVar15 = bVar2;
                                            mz3.j jVar10 = this.generateDocumentsAsyncUseCase;
                                            mz3.j.a.UpdateDocument updateDocument6 = new mz3.j.a.UpdateDocument(dVar2, params115.getDocumentType(), params115.getDocumentIID());
                                            bVar.f193027d = vq.j.a(params115);
                                            bVar.f193028e = jVar3;
                                            bVar.f193029f = vq.j.a(bVar15);
                                            bVar.f193030g = vq.j.a(bVar7);
                                            bVar.f193031h = vq.j.a(business);
                                            bVar.f193032j = vq.j.a(dVar2);
                                            bVar.f193033k = bVar7;
                                            bVar.f193034l = i28;
                                            bVar.f193035m = i27;
                                            bVar.f193036n = i36;
                                            bVar.f193037p = i35;
                                            bVar.f193038q = i37;
                                            bVar.f193039r = r15;
                                            bVar.f193042v = 5;
                                            objC = jVar10.c(updateDocument6, bVar);
                                            if (objC != objE) {
                                                right = (dx.i) objC;
                                                if (!(right instanceof dx.i.Left)) {
                                                    if (right instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    AsyncDocumentGenerationResponse asyncDocumentGenerationResponse6 = (AsyncDocumentGenerationResponse) ((dx.i.Right) right).b();
                                                    right = new dx.i.Right(new mz3.z.c.UpdateStarted(asyncDocumentGenerationResponse6.getTaskId(), ((DocumentToGenerate) pq.v.l0(asyncDocumentGenerationResponse6.a())).getDocumentId()));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return objE;
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        } catch (Exception e28) {
                            e = e28;
                            r16 = jVar8;
                            px.f fVar3 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar3.d(message, e, px.c.a(r16));
                            iVarA = r16.a(e);
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
                    if (i39 == 3) {
                        i25 = bVar.f193038q;
                        int i49 = bVar.f193037p;
                        i26 = bVar.f193036n;
                        i27 = bVar.f193035m;
                        i28 = bVar.f193034l;
                        bVar3 = (ex.b) bVar.f193033k;
                        dVar2 = (lz3.d) bVar.f193032j;
                        business2 = (dx.b.Business) bVar.f193031h;
                        bVar5 = (ex.b) bVar.f193030g;
                        ex.b bVar16 = (ex.b) bVar.f193029f;
                        dx.j<dx.b> jVar11 = (dx.j) bVar.f193028e;
                        params3 = (mz3.z.Params) bVar.f193027d;
                        try {
                            oq.u.b(objC);
                            i17 = i49;
                            jVar2 = jVar11;
                            bVar6 = bVar16;
                            boolean zBooleanValue4 = ((Boolean) bVar3.a((dx.i) objC)).booleanValue();
                            params4 = params3;
                            r15 = zBooleanValue4;
                            business = business2;
                            bVar2 = bVar6;
                            i35 = i17;
                            i36 = i26;
                            jVar3 = jVar2;
                            i37 = i25;
                            bVar7 = bVar5;
                            if (r15 != 0) {
                                if (r15 != 1) {
                                    throw new oq.p();
                                }
                                if (params4.getDocumentType().e()) {
                                    mz3.k kVar7 = this.generateMainDocumentsAsyncUC;
                                    mz3.z.Params params116 = params4;
                                    mz3.k.Params params117 = new mz3.k.Params(params116.getDocumentType(), dVar2, params116.getDocumentIID());
                                    bVar.f193027d = vq.j.a(params116);
                                    bVar.f193028e = jVar3;
                                    bVar.f193029f = vq.j.a(bVar2);
                                    bVar.f193030g = vq.j.a(bVar7);
                                    bVar.f193031h = vq.j.a(business);
                                    bVar.f193032j = vq.j.a(dVar2);
                                    bVar.f193033k = bVar7;
                                    bVar.f193034l = i28;
                                    bVar.f193035m = i27;
                                    bVar.f193036n = i36;
                                    bVar.f193037p = i35;
                                    bVar.f193038q = i37;
                                    bVar.f193039r = r15;
                                    bVar.f193042v = 4;
                                    objC = kVar7.c(params117, bVar);
                                    if (objC != objE) {
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            mz3.k.Result result7 = (mz3.k.Result) ((dx.i.Right) right).b();
                                            right = new dx.i.Right(new mz3.z.c.UpdateStarted(result7.getTaskID(), result7.getDocumentID()));
                                        }
                                    }
                                } else {
                                    mz3.z.Params params118 = params4;
                                    ex.b bVar17 = bVar2;
                                    mz3.j jVar12 = this.generateDocumentsAsyncUseCase;
                                    mz3.j.a.UpdateDocument updateDocument7 = new mz3.j.a.UpdateDocument(dVar2, params118.getDocumentType(), params118.getDocumentIID());
                                    bVar.f193027d = vq.j.a(params118);
                                    bVar.f193028e = jVar3;
                                    bVar.f193029f = vq.j.a(bVar17);
                                    bVar.f193030g = vq.j.a(bVar7);
                                    bVar.f193031h = vq.j.a(business);
                                    bVar.f193032j = vq.j.a(dVar2);
                                    bVar.f193033k = bVar7;
                                    bVar.f193034l = i28;
                                    bVar.f193035m = i27;
                                    bVar.f193036n = i36;
                                    bVar.f193037p = i35;
                                    bVar.f193038q = i37;
                                    bVar.f193039r = r15;
                                    bVar.f193042v = 5;
                                    objC = jVar12.c(updateDocument7, bVar);
                                    if (objC != objE) {
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            AsyncDocumentGenerationResponse asyncDocumentGenerationResponse7 = (AsyncDocumentGenerationResponse) ((dx.i.Right) right).b();
                                            right = new dx.i.Right(new mz3.z.c.UpdateStarted(asyncDocumentGenerationResponse7.getTaskId(), ((DocumentToGenerate) pq.v.l0(asyncDocumentGenerationResponse7.a())).getDocumentId()));
                                        }
                                    }
                                }
                                return objE;
                            }
                            right = new dx.i.Right(mz3.z.c.a.f129731a);
                        } catch (ex.c e29) {
                            e = e29;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e35) {
                            throw e35;
                        } catch (Exception e36) {
                            e = e36;
                            r16 = jVar11;
                            px.f fVar4 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar4.d(message, e, px.c.a(r16));
                            iVarA = r16.a(e);
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
                    } else if (i39 == 4) {
                        bVar7 = (ex.b) bVar.f193033k;
                        oq.u.b(objC);
                        right = (dx.i) objC;
                        if (!(right instanceof dx.i.Left)) {
                            if (right instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            mz3.k.Result result8 = (mz3.k.Result) ((dx.i.Right) right).b();
                            right = new dx.i.Right(new mz3.z.c.UpdateStarted(result8.getTaskID(), result8.getDocumentID()));
                        }
                    } else {
                        if (i39 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar7 = (ex.b) bVar.f193033k;
                        oq.u.b(objC);
                        right = (dx.i) objC;
                        if (!(right instanceof dx.i.Left)) {
                            if (right instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            AsyncDocumentGenerationResponse asyncDocumentGenerationResponse8 = (AsyncDocumentGenerationResponse) ((dx.i.Right) right).b();
                            right = new dx.i.Right(new mz3.z.c.UpdateStarted(asyncDocumentGenerationResponse8.getTaskId(), ((DocumentToGenerate) pq.v.l0(asyncDocumentGenerationResponse8.a())).getDocumentId()));
                        }
                    }
                    return new dx.i.Right((mz3.z.c) bVar7.a(right));
                } catch (CancellationException e37) {
                    throw e37;
                }
            } catch (Exception e38) {
                e = e38;
            }
        } catch (ex.c e39) {
            e = e39;
        } catch (CancellationException e45) {
            throw e45;
        }
    }
}
