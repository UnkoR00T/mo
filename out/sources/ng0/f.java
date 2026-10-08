package ng0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import vf0.Document;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lng0/f;", "Leg0/d;", "Lmg0/b;", "documentsRepository", "Lmg0/a;", "certificateRepository", "La80/g;", "revokeUserCertificateUC", "Lwy/b;", "networkSessionManager", "Lg80/a;", "notifyAboutDocumentDeleteUC", "Luf0/a;", "documentDownloadInteractor", "Lkg0/a;", "containersNotificationsInteractor", "<init>", "(Lmg0/b;Lmg0/a;La80/g;Lwy/b;Lg80/a;Luf0/a;Lkg0/a;)V", "Leg0/d$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Leg0/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmg0/b;", "b", "Lmg0/a;", "c", "La80/g;", "Lwy/b;", "e", "Lg80/a;", "f", "Luf0/a;", "g", "Lkg0/a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements eg0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mg0.b documentsRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mg0.a certificateRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a80.g revokeUserCertificateUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wy.b networkSessionManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g80.a notifyAboutDocumentDeleteUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final uf0.a documentDownloadInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final kg0.a containersNotificationsInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f136013a;

        static {
            int[] iArr = new int[vf0.d.values().length];
            try {
                iArr[vf0.d.SCHOOL_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vf0.d.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vf0.d.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vf0.d.UUT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f136013a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f136014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f136015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f136016f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f136017g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f136018h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f136019j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f136020k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f136021l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f136022m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f136023n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f136024p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f136025q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f136026r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f136027s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f136028t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f136029v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f136031x;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f136029v = obj;
            this.f136031x |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, this);
        }
    }

    public f(mg0.b bVar, mg0.a aVar, a80.g gVar, wy.b bVar2, g80.a aVar2, uf0.a aVar3, kg0.a aVar4) {
        this.documentsRepository = bVar;
        this.certificateRepository = aVar;
        this.revokeUserCertificateUC = gVar;
        this.networkSessionManager = bVar2;
        this.notifyAboutDocumentDeleteUC = aVar2;
        this.documentDownloadInteractor = aVar3;
        this.containersNotificationsInteractor = aVar4;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02df  */
    /* JADX WARN: Code duplicated, block: B:103:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:115:0x032d  */
    /* JADX WARN: Code duplicated, block: B:116:0x032f  */
    /* JADX WARN: Code duplicated, block: B:119:0x033d A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #5 {Exception -> 0x0055, blocks: (B:13:0x0051, B:176:0x0622, B:179:0x0630, B:117:0x0337, B:119:0x033d, B:32:0x00b0, B:170:0x05dc, B:85:0x0293, B:86:0x02a2, B:88:0x02aa, B:93:0x02c6, B:95:0x02cc, B:111:0x02f1, B:112:0x02f6, B:113:0x02f7, B:123:0x039b, B:125:0x03a3, B:142:0x03db, B:166:0x0595, B:129:0x03af, B:130:0x03b4, B:132:0x03ba, B:134:0x03ca, B:136:0x03ce, B:174:0x061a, B:99:0x02d5, B:81:0x025f), top: B:194:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0398  */
    /* JADX WARN: Code duplicated, block: B:123:0x039b A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #5 {Exception -> 0x0055, blocks: (B:13:0x0051, B:176:0x0622, B:179:0x0630, B:117:0x0337, B:119:0x033d, B:32:0x00b0, B:170:0x05dc, B:85:0x0293, B:86:0x02a2, B:88:0x02aa, B:93:0x02c6, B:95:0x02cc, B:111:0x02f1, B:112:0x02f6, B:113:0x02f7, B:123:0x039b, B:125:0x03a3, B:142:0x03db, B:166:0x0595, B:129:0x03af, B:130:0x03b4, B:132:0x03ba, B:134:0x03ca, B:136:0x03ce, B:174:0x061a, B:99:0x02d5, B:81:0x025f), top: B:194:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x03a3 A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #5 {Exception -> 0x0055, blocks: (B:13:0x0051, B:176:0x0622, B:179:0x0630, B:117:0x0337, B:119:0x033d, B:32:0x00b0, B:170:0x05dc, B:85:0x0293, B:86:0x02a2, B:88:0x02aa, B:93:0x02c6, B:95:0x02cc, B:111:0x02f1, B:112:0x02f6, B:113:0x02f7, B:123:0x039b, B:125:0x03a3, B:142:0x03db, B:166:0x0595, B:129:0x03af, B:130:0x03b4, B:132:0x03ba, B:134:0x03ca, B:136:0x03ce, B:174:0x061a, B:99:0x02d5, B:81:0x025f), top: B:194:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x03af A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #5 {Exception -> 0x0055, blocks: (B:13:0x0051, B:176:0x0622, B:179:0x0630, B:117:0x0337, B:119:0x033d, B:32:0x00b0, B:170:0x05dc, B:85:0x0293, B:86:0x02a2, B:88:0x02aa, B:93:0x02c6, B:95:0x02cc, B:111:0x02f1, B:112:0x02f6, B:113:0x02f7, B:123:0x039b, B:125:0x03a3, B:142:0x03db, B:166:0x0595, B:129:0x03af, B:130:0x03b4, B:132:0x03ba, B:134:0x03ca, B:136:0x03ce, B:174:0x061a, B:99:0x02d5, B:81:0x025f), top: B:194:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x03ba A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #5 {Exception -> 0x0055, blocks: (B:13:0x0051, B:176:0x0622, B:179:0x0630, B:117:0x0337, B:119:0x033d, B:32:0x00b0, B:170:0x05dc, B:85:0x0293, B:86:0x02a2, B:88:0x02aa, B:93:0x02c6, B:95:0x02cc, B:111:0x02f1, B:112:0x02f6, B:113:0x02f7, B:123:0x039b, B:125:0x03a3, B:142:0x03db, B:166:0x0595, B:129:0x03af, B:130:0x03b4, B:132:0x03ba, B:134:0x03ca, B:136:0x03ce, B:174:0x061a, B:99:0x02d5, B:81:0x025f), top: B:194:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x03ca A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #5 {Exception -> 0x0055, blocks: (B:13:0x0051, B:176:0x0622, B:179:0x0630, B:117:0x0337, B:119:0x033d, B:32:0x00b0, B:170:0x05dc, B:85:0x0293, B:86:0x02a2, B:88:0x02aa, B:93:0x02c6, B:95:0x02cc, B:111:0x02f1, B:112:0x02f6, B:113:0x02f7, B:123:0x039b, B:125:0x03a3, B:142:0x03db, B:166:0x0595, B:129:0x03af, B:130:0x03b4, B:132:0x03ba, B:134:0x03ca, B:136:0x03ce, B:174:0x061a, B:99:0x02d5, B:81:0x025f), top: B:194:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:140:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:142:0x03db A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TRY_LEAVE, TryCatch #5 {Exception -> 0x0055, blocks: (B:13:0x0051, B:176:0x0622, B:179:0x0630, B:117:0x0337, B:119:0x033d, B:32:0x00b0, B:170:0x05dc, B:85:0x0293, B:86:0x02a2, B:88:0x02aa, B:93:0x02c6, B:95:0x02cc, B:111:0x02f1, B:112:0x02f6, B:113:0x02f7, B:123:0x039b, B:125:0x03a3, B:142:0x03db, B:166:0x0595, B:129:0x03af, B:130:0x03b4, B:132:0x03ba, B:134:0x03ca, B:136:0x03ce, B:174:0x061a, B:99:0x02d5, B:81:0x025f), top: B:194:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0416  */
    /* JADX WARN: Code duplicated, block: B:149:0x0471  */
    /* JADX WARN: Code duplicated, block: B:153:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:157:0x0501  */
    /* JADX WARN: Code duplicated, block: B:160:0x0551  */
    /* JADX WARN: Code duplicated, block: B:161:0x0553  */
    /* JADX WARN: Code duplicated, block: B:165:0x0594 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:166:0x0595 A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TRY_ENTER, TryCatch #5 {Exception -> 0x0055, blocks: (B:13:0x0051, B:176:0x0622, B:179:0x0630, B:117:0x0337, B:119:0x033d, B:32:0x00b0, B:170:0x05dc, B:85:0x0293, B:86:0x02a2, B:88:0x02aa, B:93:0x02c6, B:95:0x02cc, B:111:0x02f1, B:112:0x02f6, B:113:0x02f7, B:123:0x039b, B:125:0x03a3, B:142:0x03db, B:166:0x0595, B:129:0x03af, B:130:0x03b4, B:132:0x03ba, B:134:0x03ca, B:136:0x03ce, B:174:0x061a, B:99:0x02d5, B:81:0x025f), top: B:194:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:169:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:172:0x0618 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x0619 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:174:0x061a A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TRY_LEAVE, TryCatch #5 {Exception -> 0x0055, blocks: (B:13:0x0051, B:176:0x0622, B:179:0x0630, B:117:0x0337, B:119:0x033d, B:32:0x00b0, B:170:0x05dc, B:85:0x0293, B:86:0x02a2, B:88:0x02aa, B:93:0x02c6, B:95:0x02cc, B:111:0x02f1, B:112:0x02f6, B:113:0x02f7, B:123:0x039b, B:125:0x03a3, B:142:0x03db, B:166:0x0595, B:129:0x03af, B:130:0x03b4, B:132:0x03ba, B:134:0x03ca, B:136:0x03ce, B:174:0x061a, B:99:0x02d5, B:81:0x025f), top: B:194:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0639  */
    /* JADX WARN: Code duplicated, block: B:185:0x064a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0658  */
    /* JADX WARN: Code duplicated, block: B:188:0x065c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0669  */
    /* JADX WARN: Code duplicated, block: B:202:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x03d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:88:0x02aa A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #5 {Exception -> 0x0055, blocks: (B:13:0x0051, B:176:0x0622, B:179:0x0630, B:117:0x0337, B:119:0x033d, B:32:0x00b0, B:170:0x05dc, B:85:0x0293, B:86:0x02a2, B:88:0x02aa, B:93:0x02c6, B:95:0x02cc, B:111:0x02f1, B:112:0x02f6, B:113:0x02f7, B:123:0x039b, B:125:0x03a3, B:142:0x03db, B:166:0x0595, B:129:0x03af, B:130:0x03b4, B:132:0x03ba, B:134:0x03ca, B:136:0x03ce, B:174:0x061a, B:99:0x02d5, B:81:0x025f), top: B:194:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02cc A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #5 {Exception -> 0x0055, blocks: (B:13:0x0051, B:176:0x0622, B:179:0x0630, B:117:0x0337, B:119:0x033d, B:32:0x00b0, B:170:0x05dc, B:85:0x0293, B:86:0x02a2, B:88:0x02aa, B:93:0x02c6, B:95:0x02cc, B:111:0x02f1, B:112:0x02f6, B:113:0x02f7, B:123:0x039b, B:125:0x03a3, B:142:0x03db, B:166:0x0595, B:129:0x03af, B:130:0x03b4, B:132:0x03ba, B:134:0x03ca, B:136:0x03ce, B:174:0x061a, B:99:0x02d5, B:81:0x025f), top: B:194:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:99:0x02d5 A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #5 {Exception -> 0x0055, blocks: (B:13:0x0051, B:176:0x0622, B:179:0x0630, B:117:0x0337, B:119:0x033d, B:32:0x00b0, B:170:0x05dc, B:85:0x0293, B:86:0x02a2, B:88:0x02aa, B:93:0x02c6, B:95:0x02cc, B:111:0x02f1, B:112:0x02f6, B:113:0x02f7, B:123:0x039b, B:125:0x03a3, B:142:0x03db, B:166:0x0595, B:129:0x03af, B:130:0x03b4, B:132:0x03ba, B:134:0x03ca, B:136:0x03ce, B:174:0x061a, B:99:0x02d5, B:81:0x025f), top: B:194:0x0026 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x008c: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:25:0x008c */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0090: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:27:0x0090 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0094: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:29:0x0094 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v7, types: [dx.j, java.lang.Object] */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(eg0.d.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        b bVar;
        Object obj;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j<dx.b> jVarA;
        eg0.d.Params params2;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar2;
        ex.b bVar3;
        ex.b bVar4;
        int i19;
        List list;
        Iterator it;
        Object next;
        Document document;
        vf0.d documentType;
        int i25;
        List list2;
        Iterator it4;
        int i26;
        int i27;
        g80.a aVar;
        g80.a.Params params3;
        ex.b bVar5;
        ex.b bVar6;
        int i28;
        ex.b bVar7;
        List list3;
        Document document2;
        Object objF;
        Document document3;
        ex.b bVar8;
        ex.b bVar9;
        List list4;
        int i29;
        dx.j<dx.b> jVar;
        eg0.d.Params params4;
        ex.b bVar10;
        Object objN;
        List list5;
        int i35;
        Document document4;
        ex.b bVar11;
        ex.b bVar12;
        CertKeyPair certKeyPair;
        a80.g gVar;
        eg0.d.Params params5;
        a80.g.Params params6;
        Document document5;
        int i36;
        dx.j<dx.b> jVar2;
        eg0.d.Params params7;
        CertKeyPair certKeyPair2;
        ex.b bVar13;
        ex.b bVar14;
        uf0.a aVar2;
        eg0.d.Params params8;
        int i37;
        dx.j<dx.b> jVar3;
        eg0.d.Params params9;
        mg0.b bVar15;
        eg0.d.Params params10;
        dx.j<dx.b> jVar4;
        int i38;
        int i39;
        int i45;
        int i46;
        CertKeyPair certKeyPair3;
        List list6;
        ex.b bVar16;
        ex.b bVar17;
        eg0.d.Params params11;
        kg0.a aVar3;
        eg0.d.Params params12;
        eg0.d.Params params13;
        Object objJ;
        Object objB2;
        dx.i iVar;
        g80.a aVar4;
        g80.a.Params params14;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i47 = bVar.f136031x;
            if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f136031x = i47 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f136029v;
        Object objE = uq.b.e();
        ?? r15 = bVar.f136031x;
        try {
            try {
                try {
                    try {
                        try {
                            switch (r15) {
                                case 0:
                                    oq.u.b(objA);
                                    jVarA = xw.c.f221622a.a();
                                    ex.a aVar5 = new ex.a();
                                    mg0.b bVar18 = this.documentsRepository;
                                    bVar.f136014d = params;
                                    bVar.f136015e = jVarA;
                                    bVar.f136016f = vq.j.a(aVar5);
                                    bVar.f136017g = aVar5;
                                    bVar.f136018h = aVar5;
                                    bVar.f136022m = 0;
                                    bVar.f136023n = 0;
                                    bVar.f136024p = 0;
                                    bVar.f136025q = 0;
                                    bVar.f136026r = 0;
                                    bVar.f136031x = 1;
                                    objA = bVar18.a(bVar);
                                    if (objA != objE) {
                                        params2 = params;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        bVar2 = aVar5;
                                        bVar3 = bVar2;
                                        bVar4 = bVar3;
                                        i19 = 0;
                                        list = (List) bVar2.a((dx.i) objA);
                                        it = list.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            document = (Document) next;
                                            documentType = document != null ? document.getDocumentType() : null;
                                            if (documentType == null) {
                                                i25 = -1;
                                            } else {
                                                i25 = a.f136013a[documentType.ordinal()];
                                            }
                                            if (i25 != -1) {
                                                return new dx.i.Right(i0.f148189a);
                                            }
                                            if (i25 != 1) {
                                                if (i25 != 2 && i25 != 3 && i25 != 4 && i25 != 5) {
                                                    throw new oq.p();
                                                }
                                                mg0.b bVar19 = this.documentsRepository;
                                                String documentId = params2.getDocumentId();
                                                bVar.f136014d = params2;
                                                bVar.f136015e = jVarA;
                                                bVar.f136016f = vq.j.a(bVar4);
                                                bVar.f136017g = vq.j.a(bVar3);
                                                bVar.f136018h = vq.j.a(list);
                                                bVar.f136019j = vq.j.a(document);
                                                bVar.f136022m = i19;
                                                bVar.f136023n = i18;
                                                bVar.f136024p = i17;
                                                bVar.f136025q = i16;
                                                bVar.f136026r = i15;
                                                bVar.f136031x = 10;
                                                objN = bVar19.n(documentId, bVar);
                                                if (objN == objE) {
                                                    int i48 = i19;
                                                    list5 = list;
                                                    objA = objN;
                                                    i35 = i48;
                                                    document4 = document;
                                                    bVar11 = bVar3;
                                                    bVar12 = bVar4;
                                                    iVar = (dx.i) objA;
                                                    if (iVar instanceof dx.i.Right) {
                                                        i0 i0Var = (i0) ((dx.i.Right) iVar).b();
                                                        Document document6 = document4;
                                                        aVar4 = this.notifyAboutDocumentDeleteUC;
                                                        List list7 = list5;
                                                        params14 = new g80.a.Params(params2.getDocumentId());
                                                        bVar.f136014d = vq.j.a(params2);
                                                        bVar.f136015e = jVarA;
                                                        bVar.f136016f = vq.j.a(bVar12);
                                                        bVar.f136017g = vq.j.a(bVar11);
                                                        bVar.f136018h = vq.j.a(list7);
                                                        bVar.f136019j = iVar;
                                                        bVar.f136020k = vq.j.a(i0Var);
                                                        bVar.f136021l = vq.j.a(document6);
                                                        bVar.f136022m = i35;
                                                        bVar.f136023n = i18;
                                                        bVar.f136024p = i17;
                                                        bVar.f136025q = i16;
                                                        bVar.f136026r = i15;
                                                        bVar.f136027s = 0;
                                                        bVar.f136028t = 0;
                                                        bVar.f136031x = 11;
                                                        if (aVar4.c(params14, bVar) == objE) {
                                                        }
                                                    }
                                                    return iVar;
                                                }
                                            } else {
                                                list2 = list;
                                                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                                    it4 = list2.iterator();
                                                    i26 = 0;
                                                    while (it4.hasNext()) {
                                                        Iterator it5 = it4;
                                                        if (((Document) it4.next()).getDocumentType() != vf0.d.SCHOOL_CARD && (i26 = i26 + 1) < 0) {
                                                            pq.v.w();
                                                        }
                                                        it4 = it5;
                                                    }
                                                } else {
                                                    i26 = 0;
                                                }
                                                i27 = 1;
                                                if (i26 == 1) {
                                                    i27 = 0;
                                                }
                                                if (i27 != 0) {
                                                    mg0.a aVar6 = this.certificateRepository;
                                                    bVar.f136014d = vq.j.a(params2);
                                                    bVar.f136015e = jVarA;
                                                    bVar.f136016f = vq.j.a(bVar4);
                                                    bVar.f136017g = vq.j.a(bVar3);
                                                    bVar.f136018h = bVar3;
                                                    bVar.f136019j = vq.j.a(list);
                                                    bVar.f136020k = vq.j.a(document);
                                                    bVar.f136022m = i19;
                                                    bVar.f136023n = i18;
                                                    bVar.f136024p = i17;
                                                    bVar.f136025q = i16;
                                                    bVar.f136026r = i15;
                                                    bVar.f136027s = i27;
                                                    bVar.f136031x = 2;
                                                    objF = aVar6.f(bVar);
                                                    if (objF != objE) {
                                                        document3 = document;
                                                        bVar8 = bVar4;
                                                        bVar9 = bVar3;
                                                        list4 = list;
                                                        objA = objF;
                                                        i29 = i17;
                                                        jVar = jVarA;
                                                        params4 = params2;
                                                        bVar10 = bVar9;
                                                        certKeyPair = (CertKeyPair) bVar9.a((dx.i) objA);
                                                        gVar = this.revokeUserCertificateUC;
                                                        params5 = params4;
                                                        params6 = new a80.g.Params(certKeyPair);
                                                        document5 = document3;
                                                        bVar.f136014d = vq.j.a(params5);
                                                        bVar.f136015e = jVar;
                                                        bVar.f136016f = vq.j.a(bVar8);
                                                        bVar.f136017g = vq.j.a(bVar10);
                                                        bVar.f136018h = vq.j.a(list4);
                                                        bVar.f136019j = vq.j.a(certKeyPair);
                                                        bVar.f136020k = vq.j.a(document5);
                                                        bVar.f136022m = i19;
                                                        bVar.f136023n = i18;
                                                        bVar.f136024p = i29;
                                                        bVar.f136025q = i16;
                                                        bVar.f136026r = i15;
                                                        bVar.f136027s = i27;
                                                        bVar.f136031x = 3;
                                                        if (gVar.c(params6, bVar) != objE) {
                                                            dx.j<dx.b> jVar5 = jVar;
                                                            i36 = i16;
                                                            jVar2 = jVar5;
                                                            params7 = params5;
                                                            certKeyPair2 = certKeyPair;
                                                            bVar13 = bVar10;
                                                            bVar14 = bVar8;
                                                            aVar2 = this.documentDownloadInteractor;
                                                            params8 = params7;
                                                            bVar.f136014d = vq.j.a(params8);
                                                            bVar.f136015e = jVar2;
                                                            bVar.f136016f = vq.j.a(bVar14);
                                                            bVar.f136017g = vq.j.a(bVar13);
                                                            bVar.f136018h = vq.j.a(list4);
                                                            bVar.f136019j = vq.j.a(certKeyPair2);
                                                            bVar.f136020k = vq.j.a(document5);
                                                            bVar.f136022m = i19;
                                                            bVar.f136023n = i18;
                                                            bVar.f136024p = i29;
                                                            bVar.f136025q = i36;
                                                            bVar.f136026r = i15;
                                                            bVar.f136027s = i27;
                                                            bVar.f136031x = 4;
                                                            if (aVar2.b(bVar) != objE) {
                                                                dx.j<dx.b> jVar6 = jVar2;
                                                                i37 = i15;
                                                                jVar3 = jVar6;
                                                                params9 = params8;
                                                                bVar15 = this.documentsRepository;
                                                                params10 = params9;
                                                                bVar.f136014d = vq.j.a(params10);
                                                                bVar.f136015e = jVar3;
                                                                bVar.f136016f = vq.j.a(bVar14);
                                                                bVar.f136017g = vq.j.a(bVar13);
                                                                bVar.f136018h = vq.j.a(list4);
                                                                bVar.f136019j = vq.j.a(certKeyPair2);
                                                                bVar.f136020k = vq.j.a(document5);
                                                                bVar.f136022m = i19;
                                                                bVar.f136023n = i18;
                                                                bVar.f136024p = i29;
                                                                bVar.f136025q = i36;
                                                                bVar.f136026r = i37;
                                                                bVar.f136027s = i27;
                                                                bVar.f136031x = 5;
                                                                if (bVar15.e(bVar) != objE) {
                                                                    ex.b bVar20 = bVar14;
                                                                    jVar4 = jVar3;
                                                                    i38 = i37;
                                                                    i39 = i36;
                                                                    i45 = i29;
                                                                    i46 = i19;
                                                                    certKeyPair3 = certKeyPair2;
                                                                    list6 = list4;
                                                                    bVar16 = bVar13;
                                                                    bVar17 = bVar20;
                                                                    params11 = params10;
                                                                    this.networkSessionManager.R();
                                                                    aVar3 = this.containersNotificationsInteractor;
                                                                    params12 = params11;
                                                                    bVar.f136014d = vq.j.a(params12);
                                                                    bVar.f136015e = jVar4;
                                                                    bVar.f136016f = vq.j.a(bVar17);
                                                                    bVar.f136017g = vq.j.a(bVar16);
                                                                    bVar.f136018h = vq.j.a(list6);
                                                                    bVar.f136019j = vq.j.a(certKeyPair3);
                                                                    bVar.f136020k = vq.j.a(document5);
                                                                    bVar.f136022m = i46;
                                                                    bVar.f136023n = i18;
                                                                    bVar.f136024p = i45;
                                                                    bVar.f136025q = i39;
                                                                    bVar.f136026r = i38;
                                                                    bVar.f136027s = i27;
                                                                    bVar.f136031x = 6;
                                                                    if (aVar3.a(bVar) == objE) {
                                                                        params13 = params12;
                                                                        mg0.a aVar7 = this.certificateRepository;
                                                                        bVar.f136014d = vq.j.a(params13);
                                                                        bVar.f136015e = jVar4;
                                                                        bVar.f136016f = vq.j.a(bVar17);
                                                                        bVar.f136017g = vq.j.a(bVar16);
                                                                        bVar.f136018h = vq.j.a(list6);
                                                                        bVar.f136019j = vq.j.a(certKeyPair3);
                                                                        bVar.f136020k = vq.j.a(document5);
                                                                        bVar.f136022m = i46;
                                                                        bVar.f136023n = i18;
                                                                        bVar.f136024p = i45;
                                                                        bVar.f136025q = i39;
                                                                        bVar.f136026r = i38;
                                                                        bVar.f136027s = i27;
                                                                        bVar.f136031x = 7;
                                                                        objJ = aVar7.j(bVar);
                                                                        if (objJ == objE) {
                                                                            return objJ;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    aVar = this.notifyAboutDocumentDeleteUC;
                                                    bVar5 = bVar3;
                                                    params3 = new g80.a.Params(params2.getDocumentId());
                                                    bVar.f136014d = params2;
                                                    bVar.f136015e = jVarA;
                                                    bVar.f136016f = vq.j.a(bVar4);
                                                    bVar.f136017g = vq.j.a(bVar5);
                                                    bVar.f136018h = vq.j.a(list);
                                                    bVar.f136019j = vq.j.a(document);
                                                    bVar.f136022m = i19;
                                                    bVar.f136023n = i18;
                                                    bVar.f136024p = i17;
                                                    bVar.f136025q = i16;
                                                    bVar.f136026r = i15;
                                                    bVar.f136027s = i27;
                                                    bVar.f136031x = 8;
                                                    if (aVar.c(params3, bVar) == objE) {
                                                        bVar6 = bVar5;
                                                        i28 = i19;
                                                        bVar7 = bVar4;
                                                        list3 = list;
                                                        document2 = document;
                                                        mg0.b bVar21 = this.documentsRepository;
                                                        String documentId2 = params2.getDocumentId();
                                                        bVar.f136014d = vq.j.a(params2);
                                                        bVar.f136015e = jVarA;
                                                        bVar.f136016f = vq.j.a(bVar7);
                                                        bVar.f136017g = vq.j.a(bVar6);
                                                        bVar.f136018h = vq.j.a(list3);
                                                        bVar.f136019j = vq.j.a(document2);
                                                        bVar.f136022m = i28;
                                                        bVar.f136023n = i18;
                                                        bVar.f136024p = i17;
                                                        bVar.f136025q = i16;
                                                        bVar.f136026r = i15;
                                                        bVar.f136027s = i27;
                                                        bVar.f136031x = 9;
                                                        objB2 = bVar21.b(documentId2, bVar);
                                                        if (objB2 == objE) {
                                                            return objB2;
                                                        }
                                                    }
                                                }
                                            }
                                        } while (!fr.t.c(((Document) next).getDocumentId(), params2.getDocumentId()));
                                        document = (Document) next;
                                        if (document != null) {
                                        }
                                        if (documentType == null) {
                                            i25 = -1;
                                        } else {
                                            i25 = a.f136013a[documentType.ordinal()];
                                        }
                                        if (i25 != -1) {
                                            return new dx.i.Right(i0.f148189a);
                                        }
                                        if (i25 != 1) {
                                            if (i25 != 2) {
                                                throw new oq.p();
                                            }
                                            mg0.b bVar110 = this.documentsRepository;
                                            String documentId3 = params2.getDocumentId();
                                            bVar.f136014d = params2;
                                            bVar.f136015e = jVarA;
                                            bVar.f136016f = vq.j.a(bVar4);
                                            bVar.f136017g = vq.j.a(bVar3);
                                            bVar.f136018h = vq.j.a(list);
                                            bVar.f136019j = vq.j.a(document);
                                            bVar.f136022m = i19;
                                            bVar.f136023n = i18;
                                            bVar.f136024p = i17;
                                            bVar.f136025q = i16;
                                            bVar.f136026r = i15;
                                            bVar.f136031x = 10;
                                            objN = bVar110.n(documentId3, bVar);
                                            if (objN == objE) {
                                                int i49 = i19;
                                                list5 = list;
                                                objA = objN;
                                                i35 = i49;
                                                document4 = document;
                                                bVar11 = bVar3;
                                                bVar12 = bVar4;
                                                iVar = (dx.i) objA;
                                                if (iVar instanceof dx.i.Right) {
                                                    i0 i0Var2 = (i0) ((dx.i.Right) iVar).b();
                                                    Document document7 = document4;
                                                    aVar4 = this.notifyAboutDocumentDeleteUC;
                                                    List list8 = list5;
                                                    params14 = new g80.a.Params(params2.getDocumentId());
                                                    bVar.f136014d = vq.j.a(params2);
                                                    bVar.f136015e = jVarA;
                                                    bVar.f136016f = vq.j.a(bVar12);
                                                    bVar.f136017g = vq.j.a(bVar11);
                                                    bVar.f136018h = vq.j.a(list8);
                                                    bVar.f136019j = iVar;
                                                    bVar.f136020k = vq.j.a(i0Var2);
                                                    bVar.f136021l = vq.j.a(document7);
                                                    bVar.f136022m = i35;
                                                    bVar.f136023n = i18;
                                                    bVar.f136024p = i17;
                                                    bVar.f136025q = i16;
                                                    bVar.f136026r = i15;
                                                    bVar.f136027s = 0;
                                                    bVar.f136028t = 0;
                                                    bVar.f136031x = 11;
                                                    if (aVar4.c(params14, bVar) == objE) {
                                                    }
                                                }
                                                return iVar;
                                            }
                                        } else {
                                            list2 = list;
                                            if (list2 instanceof Collection) {
                                                it4 = list2.iterator();
                                                i26 = 0;
                                                while (it4.hasNext()) {
                                                    Iterator it6 = it4;
                                                    if (((Document) it4.next()).getDocumentType() != vf0.d.SCHOOL_CARD) {
                                                    }
                                                    it4 = it6;
                                                }
                                            } else {
                                                it4 = list2.iterator();
                                                i26 = 0;
                                                while (it4.hasNext()) {
                                                    Iterator it7 = it4;
                                                    if (((Document) it4.next()).getDocumentType() != vf0.d.SCHOOL_CARD) {
                                                    }
                                                    it4 = it7;
                                                }
                                            }
                                            i27 = 1;
                                            if (i26 == 1) {
                                                i27 = 0;
                                            }
                                            if (i27 != 0) {
                                                mg0.a aVar8 = this.certificateRepository;
                                                bVar.f136014d = vq.j.a(params2);
                                                bVar.f136015e = jVarA;
                                                bVar.f136016f = vq.j.a(bVar4);
                                                bVar.f136017g = vq.j.a(bVar3);
                                                bVar.f136018h = bVar3;
                                                bVar.f136019j = vq.j.a(list);
                                                bVar.f136020k = vq.j.a(document);
                                                bVar.f136022m = i19;
                                                bVar.f136023n = i18;
                                                bVar.f136024p = i17;
                                                bVar.f136025q = i16;
                                                bVar.f136026r = i15;
                                                bVar.f136027s = i27;
                                                bVar.f136031x = 2;
                                                objF = aVar8.f(bVar);
                                                if (objF != objE) {
                                                    document3 = document;
                                                    bVar8 = bVar4;
                                                    bVar9 = bVar3;
                                                    list4 = list;
                                                    objA = objF;
                                                    i29 = i17;
                                                    jVar = jVarA;
                                                    params4 = params2;
                                                    bVar10 = bVar9;
                                                    certKeyPair = (CertKeyPair) bVar9.a((dx.i) objA);
                                                    gVar = this.revokeUserCertificateUC;
                                                    params5 = params4;
                                                    params6 = new a80.g.Params(certKeyPair);
                                                    document5 = document3;
                                                    bVar.f136014d = vq.j.a(params5);
                                                    bVar.f136015e = jVar;
                                                    bVar.f136016f = vq.j.a(bVar8);
                                                    bVar.f136017g = vq.j.a(bVar10);
                                                    bVar.f136018h = vq.j.a(list4);
                                                    bVar.f136019j = vq.j.a(certKeyPair);
                                                    bVar.f136020k = vq.j.a(document5);
                                                    bVar.f136022m = i19;
                                                    bVar.f136023n = i18;
                                                    bVar.f136024p = i29;
                                                    bVar.f136025q = i16;
                                                    bVar.f136026r = i15;
                                                    bVar.f136027s = i27;
                                                    bVar.f136031x = 3;
                                                    if (gVar.c(params6, bVar) != objE) {
                                                        dx.j<dx.b> jVar7 = jVar;
                                                        i36 = i16;
                                                        jVar2 = jVar7;
                                                        params7 = params5;
                                                        certKeyPair2 = certKeyPair;
                                                        bVar13 = bVar10;
                                                        bVar14 = bVar8;
                                                        aVar2 = this.documentDownloadInteractor;
                                                        params8 = params7;
                                                        bVar.f136014d = vq.j.a(params8);
                                                        bVar.f136015e = jVar2;
                                                        bVar.f136016f = vq.j.a(bVar14);
                                                        bVar.f136017g = vq.j.a(bVar13);
                                                        bVar.f136018h = vq.j.a(list4);
                                                        bVar.f136019j = vq.j.a(certKeyPair2);
                                                        bVar.f136020k = vq.j.a(document5);
                                                        bVar.f136022m = i19;
                                                        bVar.f136023n = i18;
                                                        bVar.f136024p = i29;
                                                        bVar.f136025q = i36;
                                                        bVar.f136026r = i15;
                                                        bVar.f136027s = i27;
                                                        bVar.f136031x = 4;
                                                        if (aVar2.b(bVar) != objE) {
                                                            dx.j<dx.b> jVar8 = jVar2;
                                                            i37 = i15;
                                                            jVar3 = jVar8;
                                                            params9 = params8;
                                                            bVar15 = this.documentsRepository;
                                                            params10 = params9;
                                                            bVar.f136014d = vq.j.a(params10);
                                                            bVar.f136015e = jVar3;
                                                            bVar.f136016f = vq.j.a(bVar14);
                                                            bVar.f136017g = vq.j.a(bVar13);
                                                            bVar.f136018h = vq.j.a(list4);
                                                            bVar.f136019j = vq.j.a(certKeyPair2);
                                                            bVar.f136020k = vq.j.a(document5);
                                                            bVar.f136022m = i19;
                                                            bVar.f136023n = i18;
                                                            bVar.f136024p = i29;
                                                            bVar.f136025q = i36;
                                                            bVar.f136026r = i37;
                                                            bVar.f136027s = i27;
                                                            bVar.f136031x = 5;
                                                            if (bVar15.e(bVar) != objE) {
                                                                ex.b bVar22 = bVar14;
                                                                jVar4 = jVar3;
                                                                i38 = i37;
                                                                i39 = i36;
                                                                i45 = i29;
                                                                i46 = i19;
                                                                certKeyPair3 = certKeyPair2;
                                                                list6 = list4;
                                                                bVar16 = bVar13;
                                                                bVar17 = bVar22;
                                                                params11 = params10;
                                                                this.networkSessionManager.R();
                                                                aVar3 = this.containersNotificationsInteractor;
                                                                params12 = params11;
                                                                bVar.f136014d = vq.j.a(params12);
                                                                bVar.f136015e = jVar4;
                                                                bVar.f136016f = vq.j.a(bVar17);
                                                                bVar.f136017g = vq.j.a(bVar16);
                                                                bVar.f136018h = vq.j.a(list6);
                                                                bVar.f136019j = vq.j.a(certKeyPair3);
                                                                bVar.f136020k = vq.j.a(document5);
                                                                bVar.f136022m = i46;
                                                                bVar.f136023n = i18;
                                                                bVar.f136024p = i45;
                                                                bVar.f136025q = i39;
                                                                bVar.f136026r = i38;
                                                                bVar.f136027s = i27;
                                                                bVar.f136031x = 6;
                                                                if (aVar3.a(bVar) == objE) {
                                                                    params13 = params12;
                                                                    mg0.a aVar9 = this.certificateRepository;
                                                                    bVar.f136014d = vq.j.a(params13);
                                                                    bVar.f136015e = jVar4;
                                                                    bVar.f136016f = vq.j.a(bVar17);
                                                                    bVar.f136017g = vq.j.a(bVar16);
                                                                    bVar.f136018h = vq.j.a(list6);
                                                                    bVar.f136019j = vq.j.a(certKeyPair3);
                                                                    bVar.f136020k = vq.j.a(document5);
                                                                    bVar.f136022m = i46;
                                                                    bVar.f136023n = i18;
                                                                    bVar.f136024p = i45;
                                                                    bVar.f136025q = i39;
                                                                    bVar.f136026r = i38;
                                                                    bVar.f136027s = i27;
                                                                    bVar.f136031x = 7;
                                                                    objJ = aVar9.j(bVar);
                                                                    if (objJ == objE) {
                                                                        return objJ;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                aVar = this.notifyAboutDocumentDeleteUC;
                                                bVar5 = bVar3;
                                                params3 = new g80.a.Params(params2.getDocumentId());
                                                bVar.f136014d = params2;
                                                bVar.f136015e = jVarA;
                                                bVar.f136016f = vq.j.a(bVar4);
                                                bVar.f136017g = vq.j.a(bVar5);
                                                bVar.f136018h = vq.j.a(list);
                                                bVar.f136019j = vq.j.a(document);
                                                bVar.f136022m = i19;
                                                bVar.f136023n = i18;
                                                bVar.f136024p = i17;
                                                bVar.f136025q = i16;
                                                bVar.f136026r = i15;
                                                bVar.f136027s = i27;
                                                bVar.f136031x = 8;
                                                if (aVar.c(params3, bVar) == objE) {
                                                    bVar6 = bVar5;
                                                    i28 = i19;
                                                    bVar7 = bVar4;
                                                    list3 = list;
                                                    document2 = document;
                                                    mg0.b bVar23 = this.documentsRepository;
                                                    String documentId4 = params2.getDocumentId();
                                                    bVar.f136014d = vq.j.a(params2);
                                                    bVar.f136015e = jVarA;
                                                    bVar.f136016f = vq.j.a(bVar7);
                                                    bVar.f136017g = vq.j.a(bVar6);
                                                    bVar.f136018h = vq.j.a(list3);
                                                    bVar.f136019j = vq.j.a(document2);
                                                    bVar.f136022m = i28;
                                                    bVar.f136023n = i18;
                                                    bVar.f136024p = i17;
                                                    bVar.f136025q = i16;
                                                    bVar.f136026r = i15;
                                                    bVar.f136027s = i27;
                                                    bVar.f136031x = 9;
                                                    objB2 = bVar23.b(documentId4, bVar);
                                                    if (objB2 == objE) {
                                                        return objB2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return objE;
                                case 1:
                                    int i55 = bVar.f136026r;
                                    int i56 = bVar.f136025q;
                                    int i57 = bVar.f136024p;
                                    int i58 = bVar.f136023n;
                                    int i59 = bVar.f136022m;
                                    ex.b bVar24 = (ex.b) bVar.f136018h;
                                    ex.b bVar25 = (ex.b) bVar.f136017g;
                                    ex.b bVar26 = (ex.b) bVar.f136016f;
                                    dx.j<dx.b> jVar9 = (dx.j) bVar.f136015e;
                                    params2 = (eg0.d.Params) bVar.f136014d;
                                    oq.u.b(objA);
                                    i15 = i55;
                                    jVarA = jVar9;
                                    bVar4 = bVar26;
                                    bVar3 = bVar25;
                                    bVar2 = bVar24;
                                    i19 = i59;
                                    i18 = i58;
                                    i17 = i57;
                                    i16 = i56;
                                    list = (List) bVar2.a((dx.i) objA);
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        document = (Document) next;
                                        if (document != null) {
                                        }
                                        if (documentType == null) {
                                            i25 = -1;
                                        } else {
                                            i25 = a.f136013a[documentType.ordinal()];
                                        }
                                        if (i25 != -1) {
                                            return new dx.i.Right(i0.f148189a);
                                        }
                                        if (i25 != 1) {
                                            if (i25 != 2) {
                                                throw new oq.p();
                                            }
                                            mg0.b bVar111 = this.documentsRepository;
                                            String documentId5 = params2.getDocumentId();
                                            bVar.f136014d = params2;
                                            bVar.f136015e = jVarA;
                                            bVar.f136016f = vq.j.a(bVar4);
                                            bVar.f136017g = vq.j.a(bVar3);
                                            bVar.f136018h = vq.j.a(list);
                                            bVar.f136019j = vq.j.a(document);
                                            bVar.f136022m = i19;
                                            bVar.f136023n = i18;
                                            bVar.f136024p = i17;
                                            bVar.f136025q = i16;
                                            bVar.f136026r = i15;
                                            bVar.f136031x = 10;
                                            objN = bVar111.n(documentId5, bVar);
                                            if (objN == objE) {
                                                int i410 = i19;
                                                list5 = list;
                                                objA = objN;
                                                i35 = i410;
                                                document4 = document;
                                                bVar11 = bVar3;
                                                bVar12 = bVar4;
                                                iVar = (dx.i) objA;
                                                if (iVar instanceof dx.i.Right) {
                                                    i0 i0Var3 = (i0) ((dx.i.Right) iVar).b();
                                                    Document document8 = document4;
                                                    aVar4 = this.notifyAboutDocumentDeleteUC;
                                                    List list9 = list5;
                                                    params14 = new g80.a.Params(params2.getDocumentId());
                                                    bVar.f136014d = vq.j.a(params2);
                                                    bVar.f136015e = jVarA;
                                                    bVar.f136016f = vq.j.a(bVar12);
                                                    bVar.f136017g = vq.j.a(bVar11);
                                                    bVar.f136018h = vq.j.a(list9);
                                                    bVar.f136019j = iVar;
                                                    bVar.f136020k = vq.j.a(i0Var3);
                                                    bVar.f136021l = vq.j.a(document8);
                                                    bVar.f136022m = i35;
                                                    bVar.f136023n = i18;
                                                    bVar.f136024p = i17;
                                                    bVar.f136025q = i16;
                                                    bVar.f136026r = i15;
                                                    bVar.f136027s = 0;
                                                    bVar.f136028t = 0;
                                                    bVar.f136031x = 11;
                                                    if (aVar4.c(params14, bVar) == objE) {
                                                    }
                                                }
                                                return iVar;
                                            }
                                        } else {
                                            list2 = list;
                                            if (list2 instanceof Collection) {
                                                it4 = list2.iterator();
                                                i26 = 0;
                                                while (it4.hasNext()) {
                                                    Iterator it8 = it4;
                                                    if (((Document) it4.next()).getDocumentType() != vf0.d.SCHOOL_CARD) {
                                                    }
                                                    it4 = it8;
                                                }
                                            } else {
                                                it4 = list2.iterator();
                                                i26 = 0;
                                                while (it4.hasNext()) {
                                                    Iterator it9 = it4;
                                                    if (((Document) it4.next()).getDocumentType() != vf0.d.SCHOOL_CARD) {
                                                    }
                                                    it4 = it9;
                                                }
                                            }
                                            i27 = 1;
                                            if (i26 == 1) {
                                                i27 = 0;
                                            }
                                            if (i27 != 0) {
                                                mg0.a aVar10 = this.certificateRepository;
                                                bVar.f136014d = vq.j.a(params2);
                                                bVar.f136015e = jVarA;
                                                bVar.f136016f = vq.j.a(bVar4);
                                                bVar.f136017g = vq.j.a(bVar3);
                                                bVar.f136018h = bVar3;
                                                bVar.f136019j = vq.j.a(list);
                                                bVar.f136020k = vq.j.a(document);
                                                bVar.f136022m = i19;
                                                bVar.f136023n = i18;
                                                bVar.f136024p = i17;
                                                bVar.f136025q = i16;
                                                bVar.f136026r = i15;
                                                bVar.f136027s = i27;
                                                bVar.f136031x = 2;
                                                objF = aVar10.f(bVar);
                                                if (objF != objE) {
                                                    document3 = document;
                                                    bVar8 = bVar4;
                                                    bVar9 = bVar3;
                                                    list4 = list;
                                                    objA = objF;
                                                    i29 = i17;
                                                    jVar = jVarA;
                                                    params4 = params2;
                                                    bVar10 = bVar9;
                                                    certKeyPair = (CertKeyPair) bVar9.a((dx.i) objA);
                                                    gVar = this.revokeUserCertificateUC;
                                                    params5 = params4;
                                                    params6 = new a80.g.Params(certKeyPair);
                                                    document5 = document3;
                                                    bVar.f136014d = vq.j.a(params5);
                                                    bVar.f136015e = jVar;
                                                    bVar.f136016f = vq.j.a(bVar8);
                                                    bVar.f136017g = vq.j.a(bVar10);
                                                    bVar.f136018h = vq.j.a(list4);
                                                    bVar.f136019j = vq.j.a(certKeyPair);
                                                    bVar.f136020k = vq.j.a(document5);
                                                    bVar.f136022m = i19;
                                                    bVar.f136023n = i18;
                                                    bVar.f136024p = i29;
                                                    bVar.f136025q = i16;
                                                    bVar.f136026r = i15;
                                                    bVar.f136027s = i27;
                                                    bVar.f136031x = 3;
                                                    if (gVar.c(params6, bVar) != objE) {
                                                        dx.j<dx.b> jVar10 = jVar;
                                                        i36 = i16;
                                                        jVar2 = jVar10;
                                                        params7 = params5;
                                                        certKeyPair2 = certKeyPair;
                                                        bVar13 = bVar10;
                                                        bVar14 = bVar8;
                                                        aVar2 = this.documentDownloadInteractor;
                                                        params8 = params7;
                                                        bVar.f136014d = vq.j.a(params8);
                                                        bVar.f136015e = jVar2;
                                                        bVar.f136016f = vq.j.a(bVar14);
                                                        bVar.f136017g = vq.j.a(bVar13);
                                                        bVar.f136018h = vq.j.a(list4);
                                                        bVar.f136019j = vq.j.a(certKeyPair2);
                                                        bVar.f136020k = vq.j.a(document5);
                                                        bVar.f136022m = i19;
                                                        bVar.f136023n = i18;
                                                        bVar.f136024p = i29;
                                                        bVar.f136025q = i36;
                                                        bVar.f136026r = i15;
                                                        bVar.f136027s = i27;
                                                        bVar.f136031x = 4;
                                                        if (aVar2.b(bVar) != objE) {
                                                            dx.j<dx.b> jVar11 = jVar2;
                                                            i37 = i15;
                                                            jVar3 = jVar11;
                                                            params9 = params8;
                                                            bVar15 = this.documentsRepository;
                                                            params10 = params9;
                                                            bVar.f136014d = vq.j.a(params10);
                                                            bVar.f136015e = jVar3;
                                                            bVar.f136016f = vq.j.a(bVar14);
                                                            bVar.f136017g = vq.j.a(bVar13);
                                                            bVar.f136018h = vq.j.a(list4);
                                                            bVar.f136019j = vq.j.a(certKeyPair2);
                                                            bVar.f136020k = vq.j.a(document5);
                                                            bVar.f136022m = i19;
                                                            bVar.f136023n = i18;
                                                            bVar.f136024p = i29;
                                                            bVar.f136025q = i36;
                                                            bVar.f136026r = i37;
                                                            bVar.f136027s = i27;
                                                            bVar.f136031x = 5;
                                                            if (bVar15.e(bVar) != objE) {
                                                                ex.b bVar27 = bVar14;
                                                                jVar4 = jVar3;
                                                                i38 = i37;
                                                                i39 = i36;
                                                                i45 = i29;
                                                                i46 = i19;
                                                                certKeyPair3 = certKeyPair2;
                                                                list6 = list4;
                                                                bVar16 = bVar13;
                                                                bVar17 = bVar27;
                                                                params11 = params10;
                                                                this.networkSessionManager.R();
                                                                aVar3 = this.containersNotificationsInteractor;
                                                                params12 = params11;
                                                                bVar.f136014d = vq.j.a(params12);
                                                                bVar.f136015e = jVar4;
                                                                bVar.f136016f = vq.j.a(bVar17);
                                                                bVar.f136017g = vq.j.a(bVar16);
                                                                bVar.f136018h = vq.j.a(list6);
                                                                bVar.f136019j = vq.j.a(certKeyPair3);
                                                                bVar.f136020k = vq.j.a(document5);
                                                                bVar.f136022m = i46;
                                                                bVar.f136023n = i18;
                                                                bVar.f136024p = i45;
                                                                bVar.f136025q = i39;
                                                                bVar.f136026r = i38;
                                                                bVar.f136027s = i27;
                                                                bVar.f136031x = 6;
                                                                if (aVar3.a(bVar) == objE) {
                                                                    params13 = params12;
                                                                    mg0.a aVar11 = this.certificateRepository;
                                                                    bVar.f136014d = vq.j.a(params13);
                                                                    bVar.f136015e = jVar4;
                                                                    bVar.f136016f = vq.j.a(bVar17);
                                                                    bVar.f136017g = vq.j.a(bVar16);
                                                                    bVar.f136018h = vq.j.a(list6);
                                                                    bVar.f136019j = vq.j.a(certKeyPair3);
                                                                    bVar.f136020k = vq.j.a(document5);
                                                                    bVar.f136022m = i46;
                                                                    bVar.f136023n = i18;
                                                                    bVar.f136024p = i45;
                                                                    bVar.f136025q = i39;
                                                                    bVar.f136026r = i38;
                                                                    bVar.f136027s = i27;
                                                                    bVar.f136031x = 7;
                                                                    objJ = aVar11.j(bVar);
                                                                    if (objJ == objE) {
                                                                        return objJ;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                aVar = this.notifyAboutDocumentDeleteUC;
                                                bVar5 = bVar3;
                                                params3 = new g80.a.Params(params2.getDocumentId());
                                                bVar.f136014d = params2;
                                                bVar.f136015e = jVarA;
                                                bVar.f136016f = vq.j.a(bVar4);
                                                bVar.f136017g = vq.j.a(bVar5);
                                                bVar.f136018h = vq.j.a(list);
                                                bVar.f136019j = vq.j.a(document);
                                                bVar.f136022m = i19;
                                                bVar.f136023n = i18;
                                                bVar.f136024p = i17;
                                                bVar.f136025q = i16;
                                                bVar.f136026r = i15;
                                                bVar.f136027s = i27;
                                                bVar.f136031x = 8;
                                                if (aVar.c(params3, bVar) == objE) {
                                                    bVar6 = bVar5;
                                                    i28 = i19;
                                                    bVar7 = bVar4;
                                                    list3 = list;
                                                    document2 = document;
                                                    mg0.b bVar28 = this.documentsRepository;
                                                    String documentId6 = params2.getDocumentId();
                                                    bVar.f136014d = vq.j.a(params2);
                                                    bVar.f136015e = jVarA;
                                                    bVar.f136016f = vq.j.a(bVar7);
                                                    bVar.f136017g = vq.j.a(bVar6);
                                                    bVar.f136018h = vq.j.a(list3);
                                                    bVar.f136019j = vq.j.a(document2);
                                                    bVar.f136022m = i28;
                                                    bVar.f136023n = i18;
                                                    bVar.f136024p = i17;
                                                    bVar.f136025q = i16;
                                                    bVar.f136026r = i15;
                                                    bVar.f136027s = i27;
                                                    bVar.f136031x = 9;
                                                    objB2 = bVar28.b(documentId6, bVar);
                                                    if (objB2 == objE) {
                                                        return objB2;
                                                    }
                                                }
                                            }
                                        }
                                        return objE;
                                    } while (!fr.t.c(((Document) next).getDocumentId(), params2.getDocumentId()));
                                    document = (Document) next;
                                    if (document != null) {
                                    }
                                    if (documentType == null) {
                                        i25 = -1;
                                    } else {
                                        i25 = a.f136013a[documentType.ordinal()];
                                    }
                                    if (i25 != -1) {
                                        return new dx.i.Right(i0.f148189a);
                                    }
                                    if (i25 != 1) {
                                        if (i25 != 2) {
                                            throw new oq.p();
                                        }
                                        mg0.b bVar112 = this.documentsRepository;
                                        String documentId7 = params2.getDocumentId();
                                        bVar.f136014d = params2;
                                        bVar.f136015e = jVarA;
                                        bVar.f136016f = vq.j.a(bVar4);
                                        bVar.f136017g = vq.j.a(bVar3);
                                        bVar.f136018h = vq.j.a(list);
                                        bVar.f136019j = vq.j.a(document);
                                        bVar.f136022m = i19;
                                        bVar.f136023n = i18;
                                        bVar.f136024p = i17;
                                        bVar.f136025q = i16;
                                        bVar.f136026r = i15;
                                        bVar.f136031x = 10;
                                        objN = bVar112.n(documentId7, bVar);
                                        if (objN == objE) {
                                            int i411 = i19;
                                            list5 = list;
                                            objA = objN;
                                            i35 = i411;
                                            document4 = document;
                                            bVar11 = bVar3;
                                            bVar12 = bVar4;
                                            iVar = (dx.i) objA;
                                            if (iVar instanceof dx.i.Right) {
                                                i0 i0Var4 = (i0) ((dx.i.Right) iVar).b();
                                                Document document9 = document4;
                                                aVar4 = this.notifyAboutDocumentDeleteUC;
                                                List list10 = list5;
                                                params14 = new g80.a.Params(params2.getDocumentId());
                                                bVar.f136014d = vq.j.a(params2);
                                                bVar.f136015e = jVarA;
                                                bVar.f136016f = vq.j.a(bVar12);
                                                bVar.f136017g = vq.j.a(bVar11);
                                                bVar.f136018h = vq.j.a(list10);
                                                bVar.f136019j = iVar;
                                                bVar.f136020k = vq.j.a(i0Var4);
                                                bVar.f136021l = vq.j.a(document9);
                                                bVar.f136022m = i35;
                                                bVar.f136023n = i18;
                                                bVar.f136024p = i17;
                                                bVar.f136025q = i16;
                                                bVar.f136026r = i15;
                                                bVar.f136027s = 0;
                                                bVar.f136028t = 0;
                                                bVar.f136031x = 11;
                                                if (aVar4.c(params14, bVar) == objE) {
                                                }
                                            }
                                            return iVar;
                                        }
                                    } else {
                                        list2 = list;
                                        if (list2 instanceof Collection) {
                                            it4 = list2.iterator();
                                            i26 = 0;
                                            while (it4.hasNext()) {
                                                Iterator it10 = it4;
                                                if (((Document) it4.next()).getDocumentType() != vf0.d.SCHOOL_CARD) {
                                                }
                                                it4 = it10;
                                            }
                                        } else {
                                            it4 = list2.iterator();
                                            i26 = 0;
                                            while (it4.hasNext()) {
                                                Iterator it11 = it4;
                                                if (((Document) it4.next()).getDocumentType() != vf0.d.SCHOOL_CARD) {
                                                }
                                                it4 = it11;
                                            }
                                        }
                                        i27 = 1;
                                        if (i26 == 1) {
                                            i27 = 0;
                                        }
                                        if (i27 != 0) {
                                            mg0.a aVar12 = this.certificateRepository;
                                            bVar.f136014d = vq.j.a(params2);
                                            bVar.f136015e = jVarA;
                                            bVar.f136016f = vq.j.a(bVar4);
                                            bVar.f136017g = vq.j.a(bVar3);
                                            bVar.f136018h = bVar3;
                                            bVar.f136019j = vq.j.a(list);
                                            bVar.f136020k = vq.j.a(document);
                                            bVar.f136022m = i19;
                                            bVar.f136023n = i18;
                                            bVar.f136024p = i17;
                                            bVar.f136025q = i16;
                                            bVar.f136026r = i15;
                                            bVar.f136027s = i27;
                                            bVar.f136031x = 2;
                                            objF = aVar12.f(bVar);
                                            if (objF != objE) {
                                                document3 = document;
                                                bVar8 = bVar4;
                                                bVar9 = bVar3;
                                                list4 = list;
                                                objA = objF;
                                                i29 = i17;
                                                jVar = jVarA;
                                                params4 = params2;
                                                bVar10 = bVar9;
                                                certKeyPair = (CertKeyPair) bVar9.a((dx.i) objA);
                                                gVar = this.revokeUserCertificateUC;
                                                params5 = params4;
                                                params6 = new a80.g.Params(certKeyPair);
                                                document5 = document3;
                                                bVar.f136014d = vq.j.a(params5);
                                                bVar.f136015e = jVar;
                                                bVar.f136016f = vq.j.a(bVar8);
                                                bVar.f136017g = vq.j.a(bVar10);
                                                bVar.f136018h = vq.j.a(list4);
                                                bVar.f136019j = vq.j.a(certKeyPair);
                                                bVar.f136020k = vq.j.a(document5);
                                                bVar.f136022m = i19;
                                                bVar.f136023n = i18;
                                                bVar.f136024p = i29;
                                                bVar.f136025q = i16;
                                                bVar.f136026r = i15;
                                                bVar.f136027s = i27;
                                                bVar.f136031x = 3;
                                                if (gVar.c(params6, bVar) != objE) {
                                                    dx.j<dx.b> jVar12 = jVar;
                                                    i36 = i16;
                                                    jVar2 = jVar12;
                                                    params7 = params5;
                                                    certKeyPair2 = certKeyPair;
                                                    bVar13 = bVar10;
                                                    bVar14 = bVar8;
                                                    aVar2 = this.documentDownloadInteractor;
                                                    params8 = params7;
                                                    bVar.f136014d = vq.j.a(params8);
                                                    bVar.f136015e = jVar2;
                                                    bVar.f136016f = vq.j.a(bVar14);
                                                    bVar.f136017g = vq.j.a(bVar13);
                                                    bVar.f136018h = vq.j.a(list4);
                                                    bVar.f136019j = vq.j.a(certKeyPair2);
                                                    bVar.f136020k = vq.j.a(document5);
                                                    bVar.f136022m = i19;
                                                    bVar.f136023n = i18;
                                                    bVar.f136024p = i29;
                                                    bVar.f136025q = i36;
                                                    bVar.f136026r = i15;
                                                    bVar.f136027s = i27;
                                                    bVar.f136031x = 4;
                                                    if (aVar2.b(bVar) != objE) {
                                                        dx.j<dx.b> jVar13 = jVar2;
                                                        i37 = i15;
                                                        jVar3 = jVar13;
                                                        params9 = params8;
                                                        bVar15 = this.documentsRepository;
                                                        params10 = params9;
                                                        bVar.f136014d = vq.j.a(params10);
                                                        bVar.f136015e = jVar3;
                                                        bVar.f136016f = vq.j.a(bVar14);
                                                        bVar.f136017g = vq.j.a(bVar13);
                                                        bVar.f136018h = vq.j.a(list4);
                                                        bVar.f136019j = vq.j.a(certKeyPair2);
                                                        bVar.f136020k = vq.j.a(document5);
                                                        bVar.f136022m = i19;
                                                        bVar.f136023n = i18;
                                                        bVar.f136024p = i29;
                                                        bVar.f136025q = i36;
                                                        bVar.f136026r = i37;
                                                        bVar.f136027s = i27;
                                                        bVar.f136031x = 5;
                                                        if (bVar15.e(bVar) != objE) {
                                                            ex.b bVar29 = bVar14;
                                                            jVar4 = jVar3;
                                                            i38 = i37;
                                                            i39 = i36;
                                                            i45 = i29;
                                                            i46 = i19;
                                                            certKeyPair3 = certKeyPair2;
                                                            list6 = list4;
                                                            bVar16 = bVar13;
                                                            bVar17 = bVar29;
                                                            params11 = params10;
                                                            this.networkSessionManager.R();
                                                            aVar3 = this.containersNotificationsInteractor;
                                                            params12 = params11;
                                                            bVar.f136014d = vq.j.a(params12);
                                                            bVar.f136015e = jVar4;
                                                            bVar.f136016f = vq.j.a(bVar17);
                                                            bVar.f136017g = vq.j.a(bVar16);
                                                            bVar.f136018h = vq.j.a(list6);
                                                            bVar.f136019j = vq.j.a(certKeyPair3);
                                                            bVar.f136020k = vq.j.a(document5);
                                                            bVar.f136022m = i46;
                                                            bVar.f136023n = i18;
                                                            bVar.f136024p = i45;
                                                            bVar.f136025q = i39;
                                                            bVar.f136026r = i38;
                                                            bVar.f136027s = i27;
                                                            bVar.f136031x = 6;
                                                            if (aVar3.a(bVar) == objE) {
                                                                params13 = params12;
                                                                mg0.a aVar13 = this.certificateRepository;
                                                                bVar.f136014d = vq.j.a(params13);
                                                                bVar.f136015e = jVar4;
                                                                bVar.f136016f = vq.j.a(bVar17);
                                                                bVar.f136017g = vq.j.a(bVar16);
                                                                bVar.f136018h = vq.j.a(list6);
                                                                bVar.f136019j = vq.j.a(certKeyPair3);
                                                                bVar.f136020k = vq.j.a(document5);
                                                                bVar.f136022m = i46;
                                                                bVar.f136023n = i18;
                                                                bVar.f136024p = i45;
                                                                bVar.f136025q = i39;
                                                                bVar.f136026r = i38;
                                                                bVar.f136027s = i27;
                                                                bVar.f136031x = 7;
                                                                objJ = aVar13.j(bVar);
                                                                if (objJ == objE) {
                                                                    return objJ;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            aVar = this.notifyAboutDocumentDeleteUC;
                                            bVar5 = bVar3;
                                            params3 = new g80.a.Params(params2.getDocumentId());
                                            bVar.f136014d = params2;
                                            bVar.f136015e = jVarA;
                                            bVar.f136016f = vq.j.a(bVar4);
                                            bVar.f136017g = vq.j.a(bVar5);
                                            bVar.f136018h = vq.j.a(list);
                                            bVar.f136019j = vq.j.a(document);
                                            bVar.f136022m = i19;
                                            bVar.f136023n = i18;
                                            bVar.f136024p = i17;
                                            bVar.f136025q = i16;
                                            bVar.f136026r = i15;
                                            bVar.f136027s = i27;
                                            bVar.f136031x = 8;
                                            if (aVar.c(params3, bVar) == objE) {
                                                bVar6 = bVar5;
                                                i28 = i19;
                                                bVar7 = bVar4;
                                                list3 = list;
                                                document2 = document;
                                                mg0.b bVar210 = this.documentsRepository;
                                                String documentId8 = params2.getDocumentId();
                                                bVar.f136014d = vq.j.a(params2);
                                                bVar.f136015e = jVarA;
                                                bVar.f136016f = vq.j.a(bVar7);
                                                bVar.f136017g = vq.j.a(bVar6);
                                                bVar.f136018h = vq.j.a(list3);
                                                bVar.f136019j = vq.j.a(document2);
                                                bVar.f136022m = i28;
                                                bVar.f136023n = i18;
                                                bVar.f136024p = i17;
                                                bVar.f136025q = i16;
                                                bVar.f136026r = i15;
                                                bVar.f136027s = i27;
                                                bVar.f136031x = 9;
                                                objB2 = bVar210.b(documentId8, bVar);
                                                if (objB2 == objE) {
                                                    return objB2;
                                                }
                                            }
                                        }
                                    }
                                    return objE;
                                case 2:
                                    int i65 = bVar.f136027s;
                                    i15 = bVar.f136026r;
                                    i16 = bVar.f136025q;
                                    int i66 = bVar.f136024p;
                                    int i67 = bVar.f136023n;
                                    int i68 = bVar.f136022m;
                                    Document document10 = (Document) bVar.f136020k;
                                    List list11 = (List) bVar.f136019j;
                                    ex.b bVar30 = (ex.b) bVar.f136018h;
                                    ex.b bVar31 = (ex.b) bVar.f136017g;
                                    ex.b bVar32 = (ex.b) bVar.f136016f;
                                    jVar = (dx.j) bVar.f136015e;
                                    params4 = (eg0.d.Params) bVar.f136014d;
                                    try {
                                        oq.u.b(objA);
                                        bVar8 = bVar32;
                                        bVar10 = bVar31;
                                        bVar9 = bVar30;
                                        list4 = list11;
                                        document3 = document10;
                                        i19 = i68;
                                        i18 = i67;
                                        i29 = i66;
                                        i27 = i65;
                                        certKeyPair = (CertKeyPair) bVar9.a((dx.i) objA);
                                        gVar = this.revokeUserCertificateUC;
                                        params5 = params4;
                                        params6 = new a80.g.Params(certKeyPair);
                                        document5 = document3;
                                        bVar.f136014d = vq.j.a(params5);
                                        bVar.f136015e = jVar;
                                        bVar.f136016f = vq.j.a(bVar8);
                                        bVar.f136017g = vq.j.a(bVar10);
                                        bVar.f136018h = vq.j.a(list4);
                                        bVar.f136019j = vq.j.a(certKeyPair);
                                        bVar.f136020k = vq.j.a(document5);
                                        bVar.f136022m = i19;
                                        bVar.f136023n = i18;
                                        bVar.f136024p = i29;
                                        bVar.f136025q = i16;
                                        bVar.f136026r = i15;
                                        bVar.f136027s = i27;
                                        bVar.f136031x = 3;
                                        if (gVar.c(params6, bVar) != objE) {
                                            dx.j<dx.b> jVar14 = jVar;
                                            i36 = i16;
                                            jVar2 = jVar14;
                                            params7 = params5;
                                            certKeyPair2 = certKeyPair;
                                            bVar13 = bVar10;
                                            bVar14 = bVar8;
                                            aVar2 = this.documentDownloadInteractor;
                                            params8 = params7;
                                            bVar.f136014d = vq.j.a(params8);
                                            bVar.f136015e = jVar2;
                                            bVar.f136016f = vq.j.a(bVar14);
                                            bVar.f136017g = vq.j.a(bVar13);
                                            bVar.f136018h = vq.j.a(list4);
                                            bVar.f136019j = vq.j.a(certKeyPair2);
                                            bVar.f136020k = vq.j.a(document5);
                                            bVar.f136022m = i19;
                                            bVar.f136023n = i18;
                                            bVar.f136024p = i29;
                                            bVar.f136025q = i36;
                                            bVar.f136026r = i15;
                                            bVar.f136027s = i27;
                                            bVar.f136031x = 4;
                                            if (aVar2.b(bVar) != objE) {
                                                dx.j<dx.b> jVar15 = jVar2;
                                                i37 = i15;
                                                jVar3 = jVar15;
                                                params9 = params8;
                                                bVar15 = this.documentsRepository;
                                                params10 = params9;
                                                bVar.f136014d = vq.j.a(params10);
                                                bVar.f136015e = jVar3;
                                                bVar.f136016f = vq.j.a(bVar14);
                                                bVar.f136017g = vq.j.a(bVar13);
                                                bVar.f136018h = vq.j.a(list4);
                                                bVar.f136019j = vq.j.a(certKeyPair2);
                                                bVar.f136020k = vq.j.a(document5);
                                                bVar.f136022m = i19;
                                                bVar.f136023n = i18;
                                                bVar.f136024p = i29;
                                                bVar.f136025q = i36;
                                                bVar.f136026r = i37;
                                                bVar.f136027s = i27;
                                                bVar.f136031x = 5;
                                                if (bVar15.e(bVar) != objE) {
                                                    ex.b bVar211 = bVar14;
                                                    jVar4 = jVar3;
                                                    i38 = i37;
                                                    i39 = i36;
                                                    i45 = i29;
                                                    i46 = i19;
                                                    certKeyPair3 = certKeyPair2;
                                                    list6 = list4;
                                                    bVar16 = bVar13;
                                                    bVar17 = bVar211;
                                                    params11 = params10;
                                                    this.networkSessionManager.R();
                                                    aVar3 = this.containersNotificationsInteractor;
                                                    params12 = params11;
                                                    bVar.f136014d = vq.j.a(params12);
                                                    bVar.f136015e = jVar4;
                                                    bVar.f136016f = vq.j.a(bVar17);
                                                    bVar.f136017g = vq.j.a(bVar16);
                                                    bVar.f136018h = vq.j.a(list6);
                                                    bVar.f136019j = vq.j.a(certKeyPair3);
                                                    bVar.f136020k = vq.j.a(document5);
                                                    bVar.f136022m = i46;
                                                    bVar.f136023n = i18;
                                                    bVar.f136024p = i45;
                                                    bVar.f136025q = i39;
                                                    bVar.f136026r = i38;
                                                    bVar.f136027s = i27;
                                                    bVar.f136031x = 6;
                                                    if (aVar3.a(bVar) == objE) {
                                                        params13 = params12;
                                                        mg0.a aVar14 = this.certificateRepository;
                                                        bVar.f136014d = vq.j.a(params13);
                                                        bVar.f136015e = jVar4;
                                                        bVar.f136016f = vq.j.a(bVar17);
                                                        bVar.f136017g = vq.j.a(bVar16);
                                                        bVar.f136018h = vq.j.a(list6);
                                                        bVar.f136019j = vq.j.a(certKeyPair3);
                                                        bVar.f136020k = vq.j.a(document5);
                                                        bVar.f136022m = i46;
                                                        bVar.f136023n = i18;
                                                        bVar.f136024p = i45;
                                                        bVar.f136025q = i39;
                                                        bVar.f136026r = i38;
                                                        bVar.f136027s = i27;
                                                        bVar.f136031x = 7;
                                                        objJ = aVar14.j(bVar);
                                                        if (objJ == objE) {
                                                            return objJ;
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
                                            if (!(iVarA instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                case 3:
                                    int i69 = bVar.f136027s;
                                    i15 = bVar.f136026r;
                                    i36 = bVar.f136025q;
                                    int i75 = bVar.f136024p;
                                    int i76 = bVar.f136023n;
                                    int i77 = bVar.f136022m;
                                    Document document11 = (Document) bVar.f136020k;
                                    certKeyPair2 = (CertKeyPair) bVar.f136019j;
                                    list4 = (List) bVar.f136018h;
                                    bVar13 = (ex.b) bVar.f136017g;
                                    bVar14 = (ex.b) bVar.f136016f;
                                    jVar2 = (dx.j) bVar.f136015e;
                                    params7 = (eg0.d.Params) bVar.f136014d;
                                    try {
                                        oq.u.b(objA);
                                        document5 = document11;
                                        i19 = i77;
                                        i18 = i76;
                                        i29 = i75;
                                        i27 = i69;
                                        aVar2 = this.documentDownloadInteractor;
                                        params8 = params7;
                                        bVar.f136014d = vq.j.a(params8);
                                        bVar.f136015e = jVar2;
                                        bVar.f136016f = vq.j.a(bVar14);
                                        bVar.f136017g = vq.j.a(bVar13);
                                        bVar.f136018h = vq.j.a(list4);
                                        bVar.f136019j = vq.j.a(certKeyPair2);
                                        bVar.f136020k = vq.j.a(document5);
                                        bVar.f136022m = i19;
                                        bVar.f136023n = i18;
                                        bVar.f136024p = i29;
                                        bVar.f136025q = i36;
                                        bVar.f136026r = i15;
                                        bVar.f136027s = i27;
                                        bVar.f136031x = 4;
                                        if (aVar2.b(bVar) != objE) {
                                            dx.j<dx.b> jVar16 = jVar2;
                                            i37 = i15;
                                            jVar3 = jVar16;
                                            params9 = params8;
                                            bVar15 = this.documentsRepository;
                                            params10 = params9;
                                            bVar.f136014d = vq.j.a(params10);
                                            bVar.f136015e = jVar3;
                                            bVar.f136016f = vq.j.a(bVar14);
                                            bVar.f136017g = vq.j.a(bVar13);
                                            bVar.f136018h = vq.j.a(list4);
                                            bVar.f136019j = vq.j.a(certKeyPair2);
                                            bVar.f136020k = vq.j.a(document5);
                                            bVar.f136022m = i19;
                                            bVar.f136023n = i18;
                                            bVar.f136024p = i29;
                                            bVar.f136025q = i36;
                                            bVar.f136026r = i37;
                                            bVar.f136027s = i27;
                                            bVar.f136031x = 5;
                                            if (bVar15.e(bVar) != objE) {
                                                ex.b bVar212 = bVar14;
                                                jVar4 = jVar3;
                                                i38 = i37;
                                                i39 = i36;
                                                i45 = i29;
                                                i46 = i19;
                                                certKeyPair3 = certKeyPair2;
                                                list6 = list4;
                                                bVar16 = bVar13;
                                                bVar17 = bVar212;
                                                params11 = params10;
                                                this.networkSessionManager.R();
                                                aVar3 = this.containersNotificationsInteractor;
                                                params12 = params11;
                                                bVar.f136014d = vq.j.a(params12);
                                                bVar.f136015e = jVar4;
                                                bVar.f136016f = vq.j.a(bVar17);
                                                bVar.f136017g = vq.j.a(bVar16);
                                                bVar.f136018h = vq.j.a(list6);
                                                bVar.f136019j = vq.j.a(certKeyPair3);
                                                bVar.f136020k = vq.j.a(document5);
                                                bVar.f136022m = i46;
                                                bVar.f136023n = i18;
                                                bVar.f136024p = i45;
                                                bVar.f136025q = i39;
                                                bVar.f136026r = i38;
                                                bVar.f136027s = i27;
                                                bVar.f136031x = 6;
                                                if (aVar3.a(bVar) == objE) {
                                                    params13 = params12;
                                                    mg0.a aVar15 = this.certificateRepository;
                                                    bVar.f136014d = vq.j.a(params13);
                                                    bVar.f136015e = jVar4;
                                                    bVar.f136016f = vq.j.a(bVar17);
                                                    bVar.f136017g = vq.j.a(bVar16);
                                                    bVar.f136018h = vq.j.a(list6);
                                                    bVar.f136019j = vq.j.a(certKeyPair3);
                                                    bVar.f136020k = vq.j.a(document5);
                                                    bVar.f136022m = i46;
                                                    bVar.f136023n = i18;
                                                    bVar.f136024p = i45;
                                                    bVar.f136025q = i39;
                                                    bVar.f136026r = i38;
                                                    bVar.f136027s = i27;
                                                    bVar.f136031x = 7;
                                                    objJ = aVar15.j(bVar);
                                                    if (objJ == objE) {
                                                        return objJ;
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
                                            if (!(iVarA instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                case 4:
                                    int i78 = bVar.f136027s;
                                    i37 = bVar.f136026r;
                                    i36 = bVar.f136025q;
                                    int i79 = bVar.f136024p;
                                    int i85 = bVar.f136023n;
                                    int i86 = bVar.f136022m;
                                    Document document12 = (Document) bVar.f136020k;
                                    certKeyPair2 = (CertKeyPair) bVar.f136019j;
                                    list4 = (List) bVar.f136018h;
                                    bVar13 = (ex.b) bVar.f136017g;
                                    bVar14 = (ex.b) bVar.f136016f;
                                    jVar3 = (dx.j) bVar.f136015e;
                                    params9 = (eg0.d.Params) bVar.f136014d;
                                    try {
                                        oq.u.b(objA);
                                        document5 = document12;
                                        i19 = i86;
                                        i18 = i85;
                                        i29 = i79;
                                        i27 = i78;
                                        bVar15 = this.documentsRepository;
                                        params10 = params9;
                                        bVar.f136014d = vq.j.a(params10);
                                        bVar.f136015e = jVar3;
                                        bVar.f136016f = vq.j.a(bVar14);
                                        bVar.f136017g = vq.j.a(bVar13);
                                        bVar.f136018h = vq.j.a(list4);
                                        bVar.f136019j = vq.j.a(certKeyPair2);
                                        bVar.f136020k = vq.j.a(document5);
                                        bVar.f136022m = i19;
                                        bVar.f136023n = i18;
                                        bVar.f136024p = i29;
                                        bVar.f136025q = i36;
                                        bVar.f136026r = i37;
                                        bVar.f136027s = i27;
                                        bVar.f136031x = 5;
                                        if (bVar15.e(bVar) != objE) {
                                            ex.b bVar213 = bVar14;
                                            jVar4 = jVar3;
                                            i38 = i37;
                                            i39 = i36;
                                            i45 = i29;
                                            i46 = i19;
                                            certKeyPair3 = certKeyPair2;
                                            list6 = list4;
                                            bVar16 = bVar13;
                                            bVar17 = bVar213;
                                            params11 = params10;
                                            this.networkSessionManager.R();
                                            aVar3 = this.containersNotificationsInteractor;
                                            params12 = params11;
                                            bVar.f136014d = vq.j.a(params12);
                                            bVar.f136015e = jVar4;
                                            bVar.f136016f = vq.j.a(bVar17);
                                            bVar.f136017g = vq.j.a(bVar16);
                                            bVar.f136018h = vq.j.a(list6);
                                            bVar.f136019j = vq.j.a(certKeyPair3);
                                            bVar.f136020k = vq.j.a(document5);
                                            bVar.f136022m = i46;
                                            bVar.f136023n = i18;
                                            bVar.f136024p = i45;
                                            bVar.f136025q = i39;
                                            bVar.f136026r = i38;
                                            bVar.f136027s = i27;
                                            bVar.f136031x = 6;
                                            if (aVar3.a(bVar) == objE) {
                                                params13 = params12;
                                                mg0.a aVar16 = this.certificateRepository;
                                                bVar.f136014d = vq.j.a(params13);
                                                bVar.f136015e = jVar4;
                                                bVar.f136016f = vq.j.a(bVar17);
                                                bVar.f136017g = vq.j.a(bVar16);
                                                bVar.f136018h = vq.j.a(list6);
                                                bVar.f136019j = vq.j.a(certKeyPair3);
                                                bVar.f136020k = vq.j.a(document5);
                                                bVar.f136022m = i46;
                                                bVar.f136023n = i18;
                                                bVar.f136024p = i45;
                                                bVar.f136025q = i39;
                                                bVar.f136026r = i38;
                                                bVar.f136027s = i27;
                                                bVar.f136031x = 7;
                                                objJ = aVar16.j(bVar);
                                                if (objJ == objE) {
                                                    return objJ;
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
                                        r15 = jVar3;
                                        px.f fVar3 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar3.d(message, e, px.c.a(r15));
                                        iVarA = r15.a(e);
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
                                case 5:
                                    int i87 = bVar.f136027s;
                                    i38 = bVar.f136026r;
                                    i39 = bVar.f136025q;
                                    i45 = bVar.f136024p;
                                    int i88 = bVar.f136023n;
                                    i46 = bVar.f136022m;
                                    Document document13 = (Document) bVar.f136020k;
                                    certKeyPair3 = (CertKeyPair) bVar.f136019j;
                                    list6 = (List) bVar.f136018h;
                                    bVar16 = (ex.b) bVar.f136017g;
                                    bVar17 = (ex.b) bVar.f136016f;
                                    jVar4 = (dx.j) bVar.f136015e;
                                    params11 = (eg0.d.Params) bVar.f136014d;
                                    oq.u.b(objA);
                                    document5 = document13;
                                    i18 = i88;
                                    i27 = i87;
                                    this.networkSessionManager.R();
                                    aVar3 = this.containersNotificationsInteractor;
                                    params12 = params11;
                                    bVar.f136014d = vq.j.a(params12);
                                    bVar.f136015e = jVar4;
                                    bVar.f136016f = vq.j.a(bVar17);
                                    bVar.f136017g = vq.j.a(bVar16);
                                    bVar.f136018h = vq.j.a(list6);
                                    bVar.f136019j = vq.j.a(certKeyPair3);
                                    bVar.f136020k = vq.j.a(document5);
                                    bVar.f136022m = i46;
                                    bVar.f136023n = i18;
                                    bVar.f136024p = i45;
                                    bVar.f136025q = i39;
                                    bVar.f136026r = i38;
                                    bVar.f136027s = i27;
                                    bVar.f136031x = 6;
                                    if (aVar3.a(bVar) == objE) {
                                        params13 = params12;
                                        mg0.a aVar17 = this.certificateRepository;
                                        bVar.f136014d = vq.j.a(params13);
                                        bVar.f136015e = jVar4;
                                        bVar.f136016f = vq.j.a(bVar17);
                                        bVar.f136017g = vq.j.a(bVar16);
                                        bVar.f136018h = vq.j.a(list6);
                                        bVar.f136019j = vq.j.a(certKeyPair3);
                                        bVar.f136020k = vq.j.a(document5);
                                        bVar.f136022m = i46;
                                        bVar.f136023n = i18;
                                        bVar.f136024p = i45;
                                        bVar.f136025q = i39;
                                        bVar.f136026r = i38;
                                        bVar.f136027s = i27;
                                        bVar.f136031x = 7;
                                        objJ = aVar17.j(bVar);
                                        if (objJ == objE) {
                                            return objJ;
                                        }
                                    }
                                    return objE;
                                case 6:
                                    int i89 = bVar.f136027s;
                                    i38 = bVar.f136026r;
                                    i39 = bVar.f136025q;
                                    i45 = bVar.f136024p;
                                    int i95 = bVar.f136023n;
                                    i46 = bVar.f136022m;
                                    Document document14 = (Document) bVar.f136020k;
                                    certKeyPair3 = (CertKeyPair) bVar.f136019j;
                                    list6 = (List) bVar.f136018h;
                                    bVar16 = (ex.b) bVar.f136017g;
                                    bVar17 = (ex.b) bVar.f136016f;
                                    jVar4 = (dx.j) bVar.f136015e;
                                    params13 = (eg0.d.Params) bVar.f136014d;
                                    oq.u.b(objA);
                                    document5 = document14;
                                    i18 = i95;
                                    i27 = i89;
                                    mg0.a aVar18 = this.certificateRepository;
                                    bVar.f136014d = vq.j.a(params13);
                                    bVar.f136015e = jVar4;
                                    bVar.f136016f = vq.j.a(bVar17);
                                    bVar.f136017g = vq.j.a(bVar16);
                                    bVar.f136018h = vq.j.a(list6);
                                    bVar.f136019j = vq.j.a(certKeyPair3);
                                    bVar.f136020k = vq.j.a(document5);
                                    bVar.f136022m = i46;
                                    bVar.f136023n = i18;
                                    bVar.f136024p = i45;
                                    bVar.f136025q = i39;
                                    bVar.f136026r = i38;
                                    bVar.f136027s = i27;
                                    bVar.f136031x = 7;
                                    objJ = aVar18.j(bVar);
                                    if (objJ == objE) {
                                        return objE;
                                    }
                                    return objJ;
                                case 7:
                                    oq.u.b(objA);
                                    return objA;
                                case 8:
                                    int i96 = bVar.f136027s;
                                    i15 = bVar.f136026r;
                                    i16 = bVar.f136025q;
                                    i17 = bVar.f136024p;
                                    int i97 = bVar.f136023n;
                                    i28 = bVar.f136022m;
                                    Document document15 = (Document) bVar.f136019j;
                                    list3 = (List) bVar.f136018h;
                                    bVar6 = (ex.b) bVar.f136017g;
                                    bVar7 = (ex.b) bVar.f136016f;
                                    dx.j<dx.b> jVar17 = (dx.j) bVar.f136015e;
                                    params2 = (eg0.d.Params) bVar.f136014d;
                                    oq.u.b(objA);
                                    document2 = document15;
                                    i18 = i97;
                                    i27 = i96;
                                    jVarA = jVar17;
                                    mg0.b bVar214 = this.documentsRepository;
                                    String documentId9 = params2.getDocumentId();
                                    bVar.f136014d = vq.j.a(params2);
                                    bVar.f136015e = jVarA;
                                    bVar.f136016f = vq.j.a(bVar7);
                                    bVar.f136017g = vq.j.a(bVar6);
                                    bVar.f136018h = vq.j.a(list3);
                                    bVar.f136019j = vq.j.a(document2);
                                    bVar.f136022m = i28;
                                    bVar.f136023n = i18;
                                    bVar.f136024p = i17;
                                    bVar.f136025q = i16;
                                    bVar.f136026r = i15;
                                    bVar.f136027s = i27;
                                    bVar.f136031x = 9;
                                    objB2 = bVar214.b(documentId9, bVar);
                                    if (objB2 == objE) {
                                        return objE;
                                    }
                                    return objB2;
                                case 9:
                                    oq.u.b(objA);
                                    return objA;
                                case 10:
                                    int i98 = bVar.f136026r;
                                    int i99 = bVar.f136025q;
                                    int i100 = bVar.f136024p;
                                    int i101 = bVar.f136023n;
                                    i35 = bVar.f136022m;
                                    Document document16 = (Document) bVar.f136019j;
                                    list5 = (List) bVar.f136018h;
                                    bVar11 = (ex.b) bVar.f136017g;
                                    bVar12 = (ex.b) bVar.f136016f;
                                    dx.j<dx.b> jVar18 = (dx.j) bVar.f136015e;
                                    params2 = (eg0.d.Params) bVar.f136014d;
                                    oq.u.b(objA);
                                    document4 = document16;
                                    i18 = i101;
                                    i17 = i100;
                                    i16 = i99;
                                    i15 = i98;
                                    jVarA = jVar18;
                                    iVar = (dx.i) objA;
                                    if (iVar instanceof dx.i.Right) {
                                        i0 i0Var5 = (i0) ((dx.i.Right) iVar).b();
                                        Document document17 = document4;
                                        aVar4 = this.notifyAboutDocumentDeleteUC;
                                        List list12 = list5;
                                        params14 = new g80.a.Params(params2.getDocumentId());
                                        bVar.f136014d = vq.j.a(params2);
                                        bVar.f136015e = jVarA;
                                        bVar.f136016f = vq.j.a(bVar12);
                                        bVar.f136017g = vq.j.a(bVar11);
                                        bVar.f136018h = vq.j.a(list12);
                                        bVar.f136019j = iVar;
                                        bVar.f136020k = vq.j.a(i0Var5);
                                        bVar.f136021l = vq.j.a(document17);
                                        bVar.f136022m = i35;
                                        bVar.f136023n = i18;
                                        bVar.f136024p = i17;
                                        bVar.f136025q = i16;
                                        bVar.f136026r = i15;
                                        bVar.f136027s = 0;
                                        bVar.f136028t = 0;
                                        bVar.f136031x = 11;
                                        if (aVar4.c(params14, bVar) == objE) {
                                            return objE;
                                        }
                                    }
                                    return iVar;
                                case 11:
                                    dx.i iVar2 = (dx.i) bVar.f136019j;
                                    oq.u.b(objA);
                                    return iVar2;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Exception e29) {
                            e = e29;
                        }
                    } catch (CancellationException e35) {
                        throw e35;
                    }
                } catch (ex.c e36) {
                    e = e36;
                } catch (CancellationException e37) {
                    throw e37;
                }
            } catch (ex.c e38) {
                e = e38;
            } catch (CancellationException e39) {
                throw e39;
            } catch (Exception e45) {
                e = e45;
                r15 = obj;
            }
        } catch (ex.c e46) {
            e = e46;
        } catch (CancellationException e47) {
            throw e47;
        } catch (Exception e48) {
            e = e48;
            r15 = jVar4;
        }
    }
}
