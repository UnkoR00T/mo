package dx0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.i0;
import q34.o1;
import q34.q1;
import q34.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ldx0/j;", "", "Lgz/b$a$a;", "", "Lhx0/a;", "Lq34/y;", "fetchDocumentsConfigsUseCase", "Lq34/o1;", "loadAllDocumentsUseCase", "Lq34/q1;", "loadCachedAddedDocumentsUC", "Lmz3/l;", "getAllDocumentsDownloadStatusesUC", "Lq34/i0;", "getDocumentInfoUC", "<init>", "(Lq34/y;Lq34/o1;Lq34/q1;Lmz3/l;Lq34/i0;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lq34/y;", "b", "Lq34/o1;", "c", "Lq34/q1;", "d", "Lmz3/l;", "e", "Lq34/i0;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y fetchDocumentsConfigsUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o1 loadAllDocumentsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q1 loadCachedAddedDocumentsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mz3.l getAllDocumentsDownloadStatusesUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i0 getDocumentInfoUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        int A;
        int B;
        /* synthetic */ Object C;
        int E;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f45214g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f45215h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f45216j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f45217k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f45218l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f45219m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f45220n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f45221p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f45222q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f45223r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f45224s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f45225t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f45226v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f45227w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f45228x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f45229y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f45230z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.C = obj;
            this.E |= PKIFailureInfo.systemUnavail;
            return j.this.a(null, this);
        }
    }

    public j(y yVar, o1 o1Var, q1 q1Var, mz3.l lVar, i0 i0Var) {
        this.fetchDocumentsConfigsUseCase = yVar;
        this.loadAllDocumentsUseCase = o1Var;
        this.loadCachedAddedDocumentsUC = q1Var;
        this.getAllDocumentsDownloadStatusesUC = lVar;
        this.getDocumentInfoUC = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x034e A[Catch: Exception -> 0x0269, c -> 0x026d, CancellationException -> 0x0271, TryCatch #11 {c -> 0x026d, CancellationException -> 0x0271, Exception -> 0x0269, blocks: (B:93:0x030f, B:94:0x031e, B:96:0x0324, B:98:0x0340, B:100:0x034e, B:103:0x0361, B:75:0x0261, B:77:0x0265, B:69:0x01d7, B:71:0x01dd, B:85:0x028a), top: B:171:0x0261 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x035e  */
    /* JADX WARN: Code duplicated, block: B:106:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:110:0x03bc A[Catch: Exception -> 0x005e, c -> 0x0061, CancellationException -> 0x0064, TryCatch #13 {Exception -> 0x005e, blocks: (B:16:0x0059, B:107:0x03b4, B:143:0x046d, B:110:0x03bc, B:112:0x03c0, B:113:0x03d3, B:115:0x03d9, B:117:0x03f0, B:119:0x03fa, B:120:0x03fe, B:121:0x0407, B:123:0x040d, B:125:0x041a, B:126:0x041e, B:127:0x0427, B:129:0x042d, B:130:0x043a, B:132:0x0440, B:136:0x0457, B:138:0x045b, B:141:0x0464, B:142:0x0468, B:144:0x0479, B:145:0x047e, B:146:0x047f, B:149:0x048d, B:89:0x02d3, B:67:0x01bc, B:63:0x0183), top: B:164:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x03c0 A[Catch: Exception -> 0x005e, c -> 0x0061, CancellationException -> 0x0064, TryCatch #13 {Exception -> 0x005e, blocks: (B:16:0x0059, B:107:0x03b4, B:143:0x046d, B:110:0x03bc, B:112:0x03c0, B:113:0x03d3, B:115:0x03d9, B:117:0x03f0, B:119:0x03fa, B:120:0x03fe, B:121:0x0407, B:123:0x040d, B:125:0x041a, B:126:0x041e, B:127:0x0427, B:129:0x042d, B:130:0x043a, B:132:0x0440, B:136:0x0457, B:138:0x045b, B:141:0x0464, B:142:0x0468, B:144:0x0479, B:145:0x047e, B:146:0x047f, B:149:0x048d, B:89:0x02d3, B:67:0x01bc, B:63:0x0183), top: B:164:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x03d9 A[Catch: Exception -> 0x005e, c -> 0x0061, CancellationException -> 0x0064, TryCatch #13 {Exception -> 0x005e, blocks: (B:16:0x0059, B:107:0x03b4, B:143:0x046d, B:110:0x03bc, B:112:0x03c0, B:113:0x03d3, B:115:0x03d9, B:117:0x03f0, B:119:0x03fa, B:120:0x03fe, B:121:0x0407, B:123:0x040d, B:125:0x041a, B:126:0x041e, B:127:0x0427, B:129:0x042d, B:130:0x043a, B:132:0x0440, B:136:0x0457, B:138:0x045b, B:141:0x0464, B:142:0x0468, B:144:0x0479, B:145:0x047e, B:146:0x047f, B:149:0x048d, B:89:0x02d3, B:67:0x01bc, B:63:0x0183), top: B:164:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x040d A[Catch: Exception -> 0x005e, c -> 0x0061, CancellationException -> 0x0064, TryCatch #13 {Exception -> 0x005e, blocks: (B:16:0x0059, B:107:0x03b4, B:143:0x046d, B:110:0x03bc, B:112:0x03c0, B:113:0x03d3, B:115:0x03d9, B:117:0x03f0, B:119:0x03fa, B:120:0x03fe, B:121:0x0407, B:123:0x040d, B:125:0x041a, B:126:0x041e, B:127:0x0427, B:129:0x042d, B:130:0x043a, B:132:0x0440, B:136:0x0457, B:138:0x045b, B:141:0x0464, B:142:0x0468, B:144:0x0479, B:145:0x047e, B:146:0x047f, B:149:0x048d, B:89:0x02d3, B:67:0x01bc, B:63:0x0183), top: B:164:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x042d A[Catch: Exception -> 0x005e, c -> 0x0061, CancellationException -> 0x0064, TryCatch #13 {Exception -> 0x005e, blocks: (B:16:0x0059, B:107:0x03b4, B:143:0x046d, B:110:0x03bc, B:112:0x03c0, B:113:0x03d3, B:115:0x03d9, B:117:0x03f0, B:119:0x03fa, B:120:0x03fe, B:121:0x0407, B:123:0x040d, B:125:0x041a, B:126:0x041e, B:127:0x0427, B:129:0x042d, B:130:0x043a, B:132:0x0440, B:136:0x0457, B:138:0x045b, B:141:0x0464, B:142:0x0468, B:144:0x0479, B:145:0x047e, B:146:0x047f, B:149:0x048d, B:89:0x02d3, B:67:0x01bc, B:63:0x0183), top: B:164:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0440 A[Catch: Exception -> 0x005e, c -> 0x0061, CancellationException -> 0x0064, TryCatch #13 {Exception -> 0x005e, blocks: (B:16:0x0059, B:107:0x03b4, B:143:0x046d, B:110:0x03bc, B:112:0x03c0, B:113:0x03d3, B:115:0x03d9, B:117:0x03f0, B:119:0x03fa, B:120:0x03fe, B:121:0x0407, B:123:0x040d, B:125:0x041a, B:126:0x041e, B:127:0x0427, B:129:0x042d, B:130:0x043a, B:132:0x0440, B:136:0x0457, B:138:0x045b, B:141:0x0464, B:142:0x0468, B:144:0x0479, B:145:0x047e, B:146:0x047f, B:149:0x048d, B:89:0x02d3, B:67:0x01bc, B:63:0x0183), top: B:164:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x045b A[Catch: Exception -> 0x005e, c -> 0x0061, CancellationException -> 0x0064, TryCatch #13 {Exception -> 0x005e, blocks: (B:16:0x0059, B:107:0x03b4, B:143:0x046d, B:110:0x03bc, B:112:0x03c0, B:113:0x03d3, B:115:0x03d9, B:117:0x03f0, B:119:0x03fa, B:120:0x03fe, B:121:0x0407, B:123:0x040d, B:125:0x041a, B:126:0x041e, B:127:0x0427, B:129:0x042d, B:130:0x043a, B:132:0x0440, B:136:0x0457, B:138:0x045b, B:141:0x0464, B:142:0x0468, B:144:0x0479, B:145:0x047e, B:146:0x047f, B:149:0x048d, B:89:0x02d3, B:67:0x01bc, B:63:0x0183), top: B:164:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0461  */
    /* JADX WARN: Code duplicated, block: B:144:0x0479 A[Catch: Exception -> 0x005e, c -> 0x0061, CancellationException -> 0x0064, TryCatch #13 {Exception -> 0x005e, blocks: (B:16:0x0059, B:107:0x03b4, B:143:0x046d, B:110:0x03bc, B:112:0x03c0, B:113:0x03d3, B:115:0x03d9, B:117:0x03f0, B:119:0x03fa, B:120:0x03fe, B:121:0x0407, B:123:0x040d, B:125:0x041a, B:126:0x041e, B:127:0x0427, B:129:0x042d, B:130:0x043a, B:132:0x0440, B:136:0x0457, B:138:0x045b, B:141:0x0464, B:142:0x0468, B:144:0x0479, B:145:0x047e, B:146:0x047f, B:149:0x048d, B:89:0x02d3, B:67:0x01bc, B:63:0x0183), top: B:164:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0456 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01dd A[Catch: Exception -> 0x0269, c -> 0x026d, CancellationException -> 0x0271, TryCatch #11 {c -> 0x026d, CancellationException -> 0x0271, Exception -> 0x0269, blocks: (B:93:0x030f, B:94:0x031e, B:96:0x0324, B:98:0x0340, B:100:0x034e, B:103:0x0361, B:75:0x0261, B:77:0x0265, B:69:0x01d7, B:71:0x01dd, B:85:0x028a), top: B:171:0x0261 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x024e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0250  */
    /* JADX WARN: Code duplicated, block: B:77:0x0265 A[Catch: Exception -> 0x0269, c -> 0x026d, CancellationException -> 0x0271, TryCatch #11 {c -> 0x026d, CancellationException -> 0x0271, Exception -> 0x0269, blocks: (B:93:0x030f, B:94:0x031e, B:96:0x0324, B:98:0x0340, B:100:0x034e, B:103:0x0361, B:75:0x0261, B:77:0x0265, B:69:0x01d7, B:71:0x01dd, B:85:0x028a), top: B:171:0x0261 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:96:0x0324 A[Catch: Exception -> 0x0269, c -> 0x026d, CancellationException -> 0x0271, TryCatch #11 {c -> 0x026d, CancellationException -> 0x0271, Exception -> 0x0269, blocks: (B:93:0x030f, B:94:0x031e, B:96:0x0324, B:98:0x0340, B:100:0x034e, B:103:0x0361, B:75:0x0261, B:77:0x0265, B:69:0x01d7, B:71:0x01dd, B:85:0x028a), top: B:171:0x0261 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0340 A[Catch: Exception -> 0x0269, c -> 0x026d, CancellationException -> 0x0271, TryCatch #11 {c -> 0x026d, CancellationException -> 0x0271, Exception -> 0x0269, blocks: (B:93:0x030f, B:94:0x031e, B:96:0x0324, B:98:0x0340, B:100:0x034e, B:103:0x0361, B:75:0x0261, B:77:0x0265, B:69:0x01d7, B:71:0x01dd, B:85:0x028a), top: B:171:0x0261 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0250 -> B:171:0x0261). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object a(gz.b.a.C1792a r29, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<hx0.AddingDocument>>> r30) {
        /*
            Method dump skipped, instruction units count: 1229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.j.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
