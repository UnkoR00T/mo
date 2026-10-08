package ng0;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.cms.CMSSignedData;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lng0/w;", "Leg0/t;", "Lmg0/b;", "documentsRepository", "Lmg0/a;", "certificateRepository", "Lng0/c;", "decryptListOfScopesUC", "<init>", "(Lmg0/b;Lmg0/a;Lng0/c;)V", "Leg0/t$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Leg0/t$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmg0/b;", "b", "Lmg0/a;", "c", "Lng0/c;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements eg0.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mg0.b documentsRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mg0.a certificateRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c decryptListOfScopesUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f136128a;

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
            f136128a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f136129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f136130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f136131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f136132g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f136133h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f136134j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f136135k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f136136l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f136137m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f136138n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f136139p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f136140q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f136141r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f136142s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f136143t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f136145w;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f136143t = obj;
            this.f136145w |= PKIFailureInfo.systemUnavail;
            return w.this.c(null, this);
        }
    }

    public w(mg0.b bVar, mg0.a aVar, c cVar) {
        this.documentsRepository = bVar;
        this.certificateRepository = aVar;
        this.decryptListOfScopesUC = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f1 A[Catch: Exception -> 0x0198, c -> 0x019c, CancellationException -> 0x01a0, TRY_ENTER, TryCatch #12 {c -> 0x019c, CancellationException -> 0x01a0, Exception -> 0x0198, blocks: (B:112:0x0382, B:127:0x03fc, B:142:0x0476, B:80:0x0269, B:90:0x028e, B:92:0x02a0, B:94:0x02a6, B:100:0x02f1, B:101:0x0305, B:102:0x0306, B:103:0x031a, B:104:0x031b, B:105:0x0320, B:106:0x0321, B:108:0x032b, B:121:0x03a1, B:123:0x03a7, B:136:0x041c, B:138:0x0422, B:151:0x0496, B:76:0x021c, B:59:0x0194, B:72:0x01e3), top: B:176:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0306 A[Catch: Exception -> 0x0198, c -> 0x019c, CancellationException -> 0x01a0, TryCatch #12 {c -> 0x019c, CancellationException -> 0x01a0, Exception -> 0x0198, blocks: (B:112:0x0382, B:127:0x03fc, B:142:0x0476, B:80:0x0269, B:90:0x028e, B:92:0x02a0, B:94:0x02a6, B:100:0x02f1, B:101:0x0305, B:102:0x0306, B:103:0x031a, B:104:0x031b, B:105:0x0320, B:106:0x0321, B:108:0x032b, B:121:0x03a1, B:123:0x03a7, B:136:0x041c, B:138:0x0422, B:151:0x0496, B:76:0x021c, B:59:0x0194, B:72:0x01e3), top: B:176:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x031b A[Catch: Exception -> 0x0198, c -> 0x019c, CancellationException -> 0x01a0, TryCatch #12 {c -> 0x019c, CancellationException -> 0x01a0, Exception -> 0x0198, blocks: (B:112:0x0382, B:127:0x03fc, B:142:0x0476, B:80:0x0269, B:90:0x028e, B:92:0x02a0, B:94:0x02a6, B:100:0x02f1, B:101:0x0305, B:102:0x0306, B:103:0x031a, B:104:0x031b, B:105:0x0320, B:106:0x0321, B:108:0x032b, B:121:0x03a1, B:123:0x03a7, B:136:0x041c, B:138:0x0422, B:151:0x0496, B:76:0x021c, B:59:0x0194, B:72:0x01e3), top: B:176:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0321 A[Catch: Exception -> 0x0198, c -> 0x019c, CancellationException -> 0x01a0, TryCatch #12 {c -> 0x019c, CancellationException -> 0x01a0, Exception -> 0x0198, blocks: (B:112:0x0382, B:127:0x03fc, B:142:0x0476, B:80:0x0269, B:90:0x028e, B:92:0x02a0, B:94:0x02a6, B:100:0x02f1, B:101:0x0305, B:102:0x0306, B:103:0x031a, B:104:0x031b, B:105:0x0320, B:106:0x0321, B:108:0x032b, B:121:0x03a1, B:123:0x03a7, B:136:0x041c, B:138:0x0422, B:151:0x0496, B:76:0x021c, B:59:0x0194, B:72:0x01e3), top: B:176:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x032b A[Catch: Exception -> 0x0198, c -> 0x019c, CancellationException -> 0x01a0, TryCatch #12 {c -> 0x019c, CancellationException -> 0x01a0, Exception -> 0x0198, blocks: (B:112:0x0382, B:127:0x03fc, B:142:0x0476, B:80:0x0269, B:90:0x028e, B:92:0x02a0, B:94:0x02a6, B:100:0x02f1, B:101:0x0305, B:102:0x0306, B:103:0x031a, B:104:0x031b, B:105:0x0320, B:106:0x0321, B:108:0x032b, B:121:0x03a1, B:123:0x03a7, B:136:0x041c, B:138:0x0422, B:151:0x0496, B:76:0x021c, B:59:0x0194, B:72:0x01e3), top: B:176:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x037f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0381  */
    /* JADX WARN: Code duplicated, block: B:114:0x0386 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:115:0x0387  */
    /* JADX WARN: Code duplicated, block: B:117:0x038a  */
    /* JADX WARN: Code duplicated, block: B:120:0x039f  */
    /* JADX WARN: Code duplicated, block: B:123:0x03a7 A[Catch: Exception -> 0x0198, c -> 0x019c, CancellationException -> 0x01a0, TryCatch #12 {c -> 0x019c, CancellationException -> 0x01a0, Exception -> 0x0198, blocks: (B:112:0x0382, B:127:0x03fc, B:142:0x0476, B:80:0x0269, B:90:0x028e, B:92:0x02a0, B:94:0x02a6, B:100:0x02f1, B:101:0x0305, B:102:0x0306, B:103:0x031a, B:104:0x031b, B:105:0x0320, B:106:0x0321, B:108:0x032b, B:121:0x03a1, B:123:0x03a7, B:136:0x041c, B:138:0x0422, B:151:0x0496, B:76:0x021c, B:59:0x0194, B:72:0x01e3), top: B:176:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:126:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:129:0x0400 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:130:0x0401  */
    /* JADX WARN: Code duplicated, block: B:132:0x0404  */
    /* JADX WARN: Code duplicated, block: B:135:0x041a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0422 A[Catch: Exception -> 0x0198, c -> 0x019c, CancellationException -> 0x01a0, TryCatch #12 {c -> 0x019c, CancellationException -> 0x01a0, Exception -> 0x0198, blocks: (B:112:0x0382, B:127:0x03fc, B:142:0x0476, B:80:0x0269, B:90:0x028e, B:92:0x02a0, B:94:0x02a6, B:100:0x02f1, B:101:0x0305, B:102:0x0306, B:103:0x031a, B:104:0x031b, B:105:0x0320, B:106:0x0321, B:108:0x032b, B:121:0x03a1, B:123:0x03a7, B:136:0x041c, B:138:0x0422, B:151:0x0496, B:76:0x021c, B:59:0x0194, B:72:0x01e3), top: B:176:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0474  */
    /* JADX WARN: Code duplicated, block: B:141:0x0475  */
    /* JADX WARN: Code duplicated, block: B:144:0x047a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:145:0x047b  */
    /* JADX WARN: Code duplicated, block: B:147:0x047e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0494  */
    /* JADX WARN: Code duplicated, block: B:154:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:163:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:166:0x0508  */
    /* JADX WARN: Code duplicated, block: B:167:0x0516  */
    /* JADX WARN: Code duplicated, block: B:169:0x051a  */
    /* JADX WARN: Code duplicated, block: B:172:0x0527  */
    /* JADX WARN: Code duplicated, block: B:74:0x0210  */
    /* JADX WARN: Code duplicated, block: B:75:0x0212  */
    /* JADX WARN: Code duplicated, block: B:78:0x0260  */
    /* JADX WARN: Code duplicated, block: B:79:0x0262  */
    /* JADX WARN: Code duplicated, block: B:82:0x0282  */
    /* JADX WARN: Code duplicated, block: B:84:0x0285  */
    /* JADX WARN: Code duplicated, block: B:86:0x0288  */
    /* JADX WARN: Code duplicated, block: B:88:0x028b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x028e A[Catch: Exception -> 0x0198, c -> 0x019c, CancellationException -> 0x01a0, TryCatch #12 {c -> 0x019c, CancellationException -> 0x01a0, Exception -> 0x0198, blocks: (B:112:0x0382, B:127:0x03fc, B:142:0x0476, B:80:0x0269, B:90:0x028e, B:92:0x02a0, B:94:0x02a6, B:100:0x02f1, B:101:0x0305, B:102:0x0306, B:103:0x031a, B:104:0x031b, B:105:0x0320, B:106:0x0321, B:108:0x032b, B:121:0x03a1, B:123:0x03a7, B:136:0x041c, B:138:0x0422, B:151:0x0496, B:76:0x021c, B:59:0x0194, B:72:0x01e3), top: B:176:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02a0 A[Catch: Exception -> 0x0198, c -> 0x019c, CancellationException -> 0x01a0, TryCatch #12 {c -> 0x019c, CancellationException -> 0x01a0, Exception -> 0x0198, blocks: (B:112:0x0382, B:127:0x03fc, B:142:0x0476, B:80:0x0269, B:90:0x028e, B:92:0x02a0, B:94:0x02a6, B:100:0x02f1, B:101:0x0305, B:102:0x0306, B:103:0x031a, B:104:0x031b, B:105:0x0320, B:106:0x0321, B:108:0x032b, B:121:0x03a1, B:123:0x03a7, B:136:0x041c, B:138:0x0422, B:151:0x0496, B:76:0x021c, B:59:0x0194, B:72:0x01e3), top: B:176:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02a6 A[Catch: Exception -> 0x0198, c -> 0x019c, CancellationException -> 0x01a0, TRY_LEAVE, TryCatch #12 {c -> 0x019c, CancellationException -> 0x01a0, Exception -> 0x0198, blocks: (B:112:0x0382, B:127:0x03fc, B:142:0x0476, B:80:0x0269, B:90:0x028e, B:92:0x02a0, B:94:0x02a6, B:100:0x02f1, B:101:0x0305, B:102:0x0306, B:103:0x031a, B:104:0x031b, B:105:0x0320, B:106:0x0321, B:108:0x032b, B:121:0x03a1, B:123:0x03a7, B:136:0x041c, B:138:0x0422, B:151:0x0496, B:76:0x021c, B:59:0x0194, B:72:0x01e3), top: B:176:0x0194 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(eg0.t.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        b bVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        dx.j<dx.b> jVar;
        eg0.t.Params params2;
        ex.b bVar2;
        ex.b bVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        CertKeyPair certKeyPair;
        Object objH;
        CertKeyPair certKeyPair2;
        int i25;
        eg0.t.Params params3;
        int i26;
        int i27;
        ex.b bVar4;
        int i28;
        int i29;
        ex.b bVar5;
        int iIntValue;
        ex.b bVar6;
        Object objG;
        ex.b bVar7;
        int i35;
        int i36;
        ex.b bVar8;
        ex.b bVar9;
        c.Result result;
        int i37;
        eg0.t.Params params4;
        ex.b bVar10;
        String parentDocumentId;
        Object objK;
        ex.b bVar11;
        ex.b bVar12;
        String parentDocumentId2;
        Object objR;
        ex.b bVar13;
        ex.b bVar14;
        String parentDocumentId3;
        String str;
        Object objL;
        ex.b bVar15;
        mg0.b bVar16;
        String documentId;
        Map<String, CMSSignedData> mapA;
        ex.b bVar17;
        String parentDocumentId4;
        String dataSchema;
        dx.i iVar;
        dx.i iVar2;
        dx.i iVar3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i38 = bVar.f136145w;
            if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f136145w = i38 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        b bVar18 = bVar;
        Object objF = bVar18.f136143t;
        ?? E = uq.b.e();
        ?? r15 = bVar18.f136145w;
        String str2 = "ParentId can not be null";
        try {
            try {
                try {
                    try {
                        switch (r15) {
                            case 0:
                                oq.u.b(objF);
                                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                aVar = new ex.a();
                                mg0.a aVar2 = this.certificateRepository;
                                bVar18.f136129d = params;
                                bVar18.f136130e = jVarA;
                                bVar18.f136131f = vq.j.a(aVar);
                                bVar18.f136132g = aVar;
                                bVar18.f136133h = aVar;
                                bVar18.f136136l = 0;
                                bVar18.f136137m = 0;
                                bVar18.f136138n = 0;
                                bVar18.f136139p = 0;
                                bVar18.f136140q = 0;
                                bVar18.f136145w = 1;
                                objF = aVar2.f(bVar18);
                                if (objF != E) {
                                    jVar = jVarA;
                                    params2 = params;
                                    bVar2 = aVar;
                                    bVar3 = bVar2;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    i19 = 0;
                                    certKeyPair = (CertKeyPair) aVar.a((dx.i) objF);
                                    mg0.a aVar3 = this.certificateRepository;
                                    bVar18.f136129d = params2;
                                    bVar18.f136130e = jVar;
                                    bVar18.f136131f = vq.j.a(bVar3);
                                    bVar18.f136132g = bVar2;
                                    bVar18.f136133h = bVar2;
                                    bVar18.f136134j = certKeyPair;
                                    bVar18.f136136l = i19;
                                    bVar18.f136137m = i18;
                                    bVar18.f136138n = i17;
                                    bVar18.f136139p = i16;
                                    bVar18.f136140q = i15;
                                    bVar18.f136145w = 2;
                                    objH = aVar3.h(bVar18);
                                    if (objH == E) {
                                        certKeyPair2 = certKeyPair;
                                        objF = objH;
                                        i25 = i15;
                                        params3 = params2;
                                        i26 = i19;
                                        i27 = i18;
                                        bVar4 = bVar3;
                                        i28 = i17;
                                        i29 = i16;
                                        bVar5 = bVar2;
                                        iIntValue = ((Number) bVar2.a((dx.i) objF)).intValue();
                                        c cVar = this.decryptListOfScopesUC;
                                        bVar6 = bVar4;
                                        c.Params params5 = new c.Params(params3.getDataScope(), certKeyPair2);
                                        bVar18.f136129d = params3;
                                        bVar18.f136130e = jVar;
                                        bVar18.f136131f = vq.j.a(bVar6);
                                        bVar18.f136132g = bVar5;
                                        bVar18.f136133h = bVar5;
                                        bVar18.f136134j = vq.j.a(certKeyPair2);
                                        bVar18.f136136l = i26;
                                        bVar18.f136137m = i27;
                                        bVar18.f136138n = i28;
                                        bVar18.f136139p = i29;
                                        bVar18.f136140q = i25;
                                        bVar18.f136141r = iIntValue;
                                        bVar18.f136145w = 3;
                                        objG = cVar.g(params5, bVar18);
                                        if (objG != E) {
                                            bVar7 = bVar5;
                                            i35 = i29;
                                            i36 = iIntValue;
                                            bVar8 = bVar7;
                                            objF = objG;
                                            bVar9 = bVar6;
                                            result = (c.Result) bVar8.a((dx.i) objF);
                                            i37 = a.f136128a[params3.getDocumentType().ordinal()];
                                            params4 = params3;
                                            if (i37 != 1) {
                                                ex.b bVar19 = bVar9;
                                                mg0.b bVar20 = this.documentsRepository;
                                                String documentId2 = params4.getDocumentId();
                                                Map<String, CMSSignedData> mapA2 = result.a();
                                                Integer numE = vq.b.e(i36);
                                                bVar18.f136129d = vq.j.a(params4);
                                                bVar18.f136130e = jVar;
                                                bVar18.f136131f = vq.j.a(bVar19);
                                                bVar18.f136132g = vq.j.a(bVar7);
                                                bVar18.f136133h = vq.j.a(certKeyPair2);
                                                bVar18.f136134j = vq.j.a(result);
                                                bVar18.f136136l = i26;
                                                bVar18.f136137m = i27;
                                                bVar18.f136138n = i28;
                                                bVar18.f136139p = i35;
                                                bVar18.f136140q = i25;
                                                bVar18.f136141r = i36;
                                                bVar18.f136145w = 4;
                                                objF = bVar20.u(numE, documentId2, mapA2, bVar18);
                                                if (objF != E) {
                                                    return (dx.i) objF;
                                                }
                                            } else {
                                                if (i37 != 2) {
                                                    bVar10 = bVar9;
                                                    parentDocumentId = params4.getParentDocumentId();
                                                    if (parentDocumentId != null) {
                                                        mg0.b bVar21 = this.documentsRepository;
                                                        String documentId3 = params4.getDocumentId();
                                                        Map<String, CMSSignedData> mapA3 = result.a();
                                                        Integer numE2 = vq.b.e(i36);
                                                        bVar18.f136129d = vq.j.a(params4);
                                                        bVar18.f136130e = jVar;
                                                        bVar18.f136131f = vq.j.a(bVar10);
                                                        bVar18.f136132g = bVar7;
                                                        bVar18.f136133h = vq.j.a(certKeyPair2);
                                                        bVar18.f136134j = vq.j.a(result);
                                                        bVar18.f136135k = vq.j.a(parentDocumentId);
                                                        bVar18.f136136l = i26;
                                                        bVar18.f136137m = i27;
                                                        bVar18.f136138n = i28;
                                                        bVar18.f136139p = i35;
                                                        bVar18.f136140q = i25;
                                                        bVar18.f136141r = i36;
                                                        bVar18.f136142s = 0;
                                                        bVar18.f136145w = 5;
                                                        objK = bVar21.k(numE2, documentId3, parentDocumentId, mapA3, bVar18);
                                                        if (objK == E) {
                                                            bVar11 = bVar7;
                                                            iVar = (dx.i) objK;
                                                            if (iVar != null) {
                                                                return iVar;
                                                            }
                                                            bVar7 = bVar11;
                                                        }
                                                    } else {
                                                        str2 = str2;
                                                    }
                                                    bVar7.b(new dx.b.Generic(new NoSuchElementException(str2)));
                                                    throw new oq.g();
                                                }
                                                if (i37 != 3) {
                                                    bVar12 = bVar9;
                                                    parentDocumentId2 = params4.getParentDocumentId();
                                                    if (parentDocumentId2 != null) {
                                                        mg0.b bVar22 = this.documentsRepository;
                                                        String documentId4 = params4.getDocumentId();
                                                        Map<String, CMSSignedData> mapA4 = result.a();
                                                        Integer numE3 = vq.b.e(i36);
                                                        bVar18.f136129d = vq.j.a(params4);
                                                        bVar18.f136130e = jVar;
                                                        bVar18.f136131f = vq.j.a(bVar12);
                                                        bVar18.f136132g = bVar7;
                                                        bVar18.f136133h = vq.j.a(certKeyPair2);
                                                        bVar18.f136134j = vq.j.a(result);
                                                        bVar18.f136135k = vq.j.a(parentDocumentId2);
                                                        bVar18.f136136l = i26;
                                                        bVar18.f136137m = i27;
                                                        bVar18.f136138n = i28;
                                                        bVar18.f136139p = i35;
                                                        bVar18.f136140q = i25;
                                                        bVar18.f136141r = i36;
                                                        bVar18.f136142s = 0;
                                                        bVar18.f136145w = 6;
                                                        objR = bVar22.r(numE3, documentId4, parentDocumentId2, mapA4, bVar18);
                                                        if (objR == E) {
                                                            bVar13 = bVar7;
                                                            iVar2 = (dx.i) objR;
                                                            if (iVar2 != null) {
                                                                return iVar2;
                                                            }
                                                            bVar7 = bVar13;
                                                        }
                                                    } else {
                                                        str2 = str2;
                                                    }
                                                    bVar7.b(new dx.b.Generic(new NoSuchElementException(str2)));
                                                    throw new oq.g();
                                                }
                                                if (i37 != 4) {
                                                    bVar14 = bVar9;
                                                    parentDocumentId3 = params4.getParentDocumentId();
                                                    if (parentDocumentId3 != null) {
                                                        mg0.b bVar23 = this.documentsRepository;
                                                        String documentId5 = params4.getDocumentId();
                                                        Map<String, CMSSignedData> mapA5 = result.a();
                                                        Integer numE4 = vq.b.e(i36);
                                                        bVar18.f136129d = vq.j.a(params4);
                                                        bVar18.f136130e = jVar;
                                                        bVar18.f136131f = vq.j.a(bVar14);
                                                        bVar18.f136132g = bVar7;
                                                        bVar18.f136133h = vq.j.a(certKeyPair2);
                                                        bVar18.f136134j = vq.j.a(result);
                                                        bVar18.f136135k = vq.j.a(parentDocumentId3);
                                                        bVar18.f136136l = i26;
                                                        bVar18.f136137m = i27;
                                                        bVar18.f136138n = i28;
                                                        bVar18.f136139p = i35;
                                                        bVar18.f136140q = i25;
                                                        bVar18.f136141r = i36;
                                                        bVar18.f136142s = 0;
                                                        bVar18.f136145w = 7;
                                                        str = "ParentId can not be null";
                                                        objL = bVar23.l(numE4, documentId5, parentDocumentId3, mapA5, bVar18);
                                                        if (objL == E) {
                                                            bVar15 = bVar7;
                                                            iVar3 = (dx.i) objL;
                                                            if (iVar3 != null) {
                                                                return iVar3;
                                                            }
                                                            bVar7 = bVar15;
                                                        }
                                                    } else {
                                                        str = "ParentId can not be null";
                                                    }
                                                    bVar7.b(new dx.b.Generic(new NoSuchElementException(str)));
                                                    throw new oq.g();
                                                }
                                                if (i37 == 5) {
                                                    throw new oq.p();
                                                }
                                                bVar16 = this.documentsRepository;
                                                documentId = params4.getDocumentId();
                                                mapA = result.a();
                                                bVar17 = bVar9;
                                                parentDocumentId4 = params4.getParentDocumentId();
                                                if (parentDocumentId4 != null) {
                                                    bVar7.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                    throw new oq.g();
                                                }
                                                dataSchema = params4.getDataSchema();
                                                if (dataSchema != null) {
                                                    bVar7.b(new dx.b.Generic(new NoSuchElementException("DataSchema can not be null")));
                                                    throw new oq.g();
                                                }
                                                Integer numE5 = vq.b.e(i36);
                                                bVar18.f136129d = vq.j.a(params4);
                                                bVar18.f136130e = jVar;
                                                bVar18.f136131f = vq.j.a(bVar17);
                                                bVar18.f136132g = vq.j.a(bVar7);
                                                bVar18.f136133h = vq.j.a(certKeyPair2);
                                                bVar18.f136134j = vq.j.a(result);
                                                bVar18.f136136l = i26;
                                                bVar18.f136137m = i27;
                                                bVar18.f136138n = i28;
                                                bVar18.f136139p = i35;
                                                bVar18.f136140q = i25;
                                                bVar18.f136141r = i36;
                                                bVar18.f136145w = 8;
                                                objF = bVar16.s(numE5, documentId, parentDocumentId4, mapA, dataSchema, bVar18);
                                                if (objF != E) {
                                                    return (dx.i) objF;
                                                }
                                            }
                                        }
                                    }
                                }
                                return E;
                            case 1:
                                i15 = bVar18.f136140q;
                                i16 = bVar18.f136139p;
                                i17 = bVar18.f136138n;
                                i18 = bVar18.f136137m;
                                i19 = bVar18.f136136l;
                                aVar = (ex.b) bVar18.f136133h;
                                bVar2 = (ex.b) bVar18.f136132g;
                                bVar3 = (ex.b) bVar18.f136131f;
                                jVar = (dx.j) bVar18.f136130e;
                                params2 = (eg0.t.Params) bVar18.f136129d;
                                try {
                                    oq.u.b(objF);
                                    certKeyPair = (CertKeyPair) aVar.a((dx.i) objF);
                                    mg0.a aVar4 = this.certificateRepository;
                                    bVar18.f136129d = params2;
                                    bVar18.f136130e = jVar;
                                    bVar18.f136131f = vq.j.a(bVar3);
                                    bVar18.f136132g = bVar2;
                                    bVar18.f136133h = bVar2;
                                    bVar18.f136134j = certKeyPair;
                                    bVar18.f136136l = i19;
                                    bVar18.f136137m = i18;
                                    bVar18.f136138n = i17;
                                    bVar18.f136139p = i16;
                                    bVar18.f136140q = i15;
                                    bVar18.f136145w = 2;
                                    objH = aVar4.h(bVar18);
                                    if (objH == E) {
                                        certKeyPair2 = certKeyPair;
                                        objF = objH;
                                        i25 = i15;
                                        params3 = params2;
                                        i26 = i19;
                                        i27 = i18;
                                        bVar4 = bVar3;
                                        i28 = i17;
                                        i29 = i16;
                                        bVar5 = bVar2;
                                        iIntValue = ((Number) bVar2.a((dx.i) objF)).intValue();
                                        c cVar2 = this.decryptListOfScopesUC;
                                        bVar6 = bVar4;
                                        c.Params params6 = new c.Params(params3.getDataScope(), certKeyPair2);
                                        bVar18.f136129d = params3;
                                        bVar18.f136130e = jVar;
                                        bVar18.f136131f = vq.j.a(bVar6);
                                        bVar18.f136132g = bVar5;
                                        bVar18.f136133h = bVar5;
                                        bVar18.f136134j = vq.j.a(certKeyPair2);
                                        bVar18.f136136l = i26;
                                        bVar18.f136137m = i27;
                                        bVar18.f136138n = i28;
                                        bVar18.f136139p = i29;
                                        bVar18.f136140q = i25;
                                        bVar18.f136141r = iIntValue;
                                        bVar18.f136145w = 3;
                                        objG = cVar2.g(params6, bVar18);
                                        if (objG != E) {
                                            bVar7 = bVar5;
                                            i35 = i29;
                                            i36 = iIntValue;
                                            bVar8 = bVar7;
                                            objF = objG;
                                            bVar9 = bVar6;
                                            result = (c.Result) bVar8.a((dx.i) objF);
                                            i37 = a.f136128a[params3.getDocumentType().ordinal()];
                                            params4 = params3;
                                            if (i37 != 1) {
                                                ex.b bVar110 = bVar9;
                                                mg0.b bVar24 = this.documentsRepository;
                                                String documentId6 = params4.getDocumentId();
                                                Map<String, CMSSignedData> mapA6 = result.a();
                                                Integer numE6 = vq.b.e(i36);
                                                bVar18.f136129d = vq.j.a(params4);
                                                bVar18.f136130e = jVar;
                                                bVar18.f136131f = vq.j.a(bVar110);
                                                bVar18.f136132g = vq.j.a(bVar7);
                                                bVar18.f136133h = vq.j.a(certKeyPair2);
                                                bVar18.f136134j = vq.j.a(result);
                                                bVar18.f136136l = i26;
                                                bVar18.f136137m = i27;
                                                bVar18.f136138n = i28;
                                                bVar18.f136139p = i35;
                                                bVar18.f136140q = i25;
                                                bVar18.f136141r = i36;
                                                bVar18.f136145w = 4;
                                                objF = bVar24.u(numE6, documentId6, mapA6, bVar18);
                                                if (objF != E) {
                                                    return (dx.i) objF;
                                                }
                                            } else {
                                                if (i37 != 2) {
                                                    bVar10 = bVar9;
                                                    parentDocumentId = params4.getParentDocumentId();
                                                    if (parentDocumentId != null) {
                                                        mg0.b bVar25 = this.documentsRepository;
                                                        String documentId7 = params4.getDocumentId();
                                                        Map<String, CMSSignedData> mapA7 = result.a();
                                                        Integer numE7 = vq.b.e(i36);
                                                        bVar18.f136129d = vq.j.a(params4);
                                                        bVar18.f136130e = jVar;
                                                        bVar18.f136131f = vq.j.a(bVar10);
                                                        bVar18.f136132g = bVar7;
                                                        bVar18.f136133h = vq.j.a(certKeyPair2);
                                                        bVar18.f136134j = vq.j.a(result);
                                                        bVar18.f136135k = vq.j.a(parentDocumentId);
                                                        bVar18.f136136l = i26;
                                                        bVar18.f136137m = i27;
                                                        bVar18.f136138n = i28;
                                                        bVar18.f136139p = i35;
                                                        bVar18.f136140q = i25;
                                                        bVar18.f136141r = i36;
                                                        bVar18.f136142s = 0;
                                                        bVar18.f136145w = 5;
                                                        objK = bVar25.k(numE7, documentId7, parentDocumentId, mapA7, bVar18);
                                                        if (objK == E) {
                                                            bVar11 = bVar7;
                                                            iVar = (dx.i) objK;
                                                            if (iVar != null) {
                                                                return iVar;
                                                            }
                                                            bVar7 = bVar11;
                                                        }
                                                    } else {
                                                        str2 = str2;
                                                    }
                                                    bVar7.b(new dx.b.Generic(new NoSuchElementException(str2)));
                                                    throw new oq.g();
                                                }
                                                if (i37 != 3) {
                                                    bVar12 = bVar9;
                                                    parentDocumentId2 = params4.getParentDocumentId();
                                                    if (parentDocumentId2 != null) {
                                                        mg0.b bVar26 = this.documentsRepository;
                                                        String documentId8 = params4.getDocumentId();
                                                        Map<String, CMSSignedData> mapA8 = result.a();
                                                        Integer numE8 = vq.b.e(i36);
                                                        bVar18.f136129d = vq.j.a(params4);
                                                        bVar18.f136130e = jVar;
                                                        bVar18.f136131f = vq.j.a(bVar12);
                                                        bVar18.f136132g = bVar7;
                                                        bVar18.f136133h = vq.j.a(certKeyPair2);
                                                        bVar18.f136134j = vq.j.a(result);
                                                        bVar18.f136135k = vq.j.a(parentDocumentId2);
                                                        bVar18.f136136l = i26;
                                                        bVar18.f136137m = i27;
                                                        bVar18.f136138n = i28;
                                                        bVar18.f136139p = i35;
                                                        bVar18.f136140q = i25;
                                                        bVar18.f136141r = i36;
                                                        bVar18.f136142s = 0;
                                                        bVar18.f136145w = 6;
                                                        objR = bVar26.r(numE8, documentId8, parentDocumentId2, mapA8, bVar18);
                                                        if (objR == E) {
                                                            bVar13 = bVar7;
                                                            iVar2 = (dx.i) objR;
                                                            if (iVar2 != null) {
                                                                return iVar2;
                                                            }
                                                            bVar7 = bVar13;
                                                        }
                                                    } else {
                                                        str2 = str2;
                                                    }
                                                    bVar7.b(new dx.b.Generic(new NoSuchElementException(str2)));
                                                    throw new oq.g();
                                                }
                                                if (i37 != 4) {
                                                    bVar14 = bVar9;
                                                    parentDocumentId3 = params4.getParentDocumentId();
                                                    if (parentDocumentId3 != null) {
                                                        mg0.b bVar27 = this.documentsRepository;
                                                        String documentId9 = params4.getDocumentId();
                                                        Map<String, CMSSignedData> mapA9 = result.a();
                                                        Integer numE9 = vq.b.e(i36);
                                                        bVar18.f136129d = vq.j.a(params4);
                                                        bVar18.f136130e = jVar;
                                                        bVar18.f136131f = vq.j.a(bVar14);
                                                        bVar18.f136132g = bVar7;
                                                        bVar18.f136133h = vq.j.a(certKeyPair2);
                                                        bVar18.f136134j = vq.j.a(result);
                                                        bVar18.f136135k = vq.j.a(parentDocumentId3);
                                                        bVar18.f136136l = i26;
                                                        bVar18.f136137m = i27;
                                                        bVar18.f136138n = i28;
                                                        bVar18.f136139p = i35;
                                                        bVar18.f136140q = i25;
                                                        bVar18.f136141r = i36;
                                                        bVar18.f136142s = 0;
                                                        bVar18.f136145w = 7;
                                                        str = "ParentId can not be null";
                                                        objL = bVar27.l(numE9, documentId9, parentDocumentId3, mapA9, bVar18);
                                                        if (objL == E) {
                                                            bVar15 = bVar7;
                                                            iVar3 = (dx.i) objL;
                                                            if (iVar3 != null) {
                                                                return iVar3;
                                                            }
                                                            bVar7 = bVar15;
                                                        }
                                                    } else {
                                                        str = "ParentId can not be null";
                                                    }
                                                    bVar7.b(new dx.b.Generic(new NoSuchElementException(str)));
                                                    throw new oq.g();
                                                }
                                                if (i37 == 5) {
                                                    throw new oq.p();
                                                }
                                                bVar16 = this.documentsRepository;
                                                documentId = params4.getDocumentId();
                                                mapA = result.a();
                                                bVar17 = bVar9;
                                                parentDocumentId4 = params4.getParentDocumentId();
                                                if (parentDocumentId4 != null) {
                                                    bVar7.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                    throw new oq.g();
                                                }
                                                dataSchema = params4.getDataSchema();
                                                if (dataSchema != null) {
                                                    bVar7.b(new dx.b.Generic(new NoSuchElementException("DataSchema can not be null")));
                                                    throw new oq.g();
                                                }
                                                Integer numE10 = vq.b.e(i36);
                                                bVar18.f136129d = vq.j.a(params4);
                                                bVar18.f136130e = jVar;
                                                bVar18.f136131f = vq.j.a(bVar17);
                                                bVar18.f136132g = vq.j.a(bVar7);
                                                bVar18.f136133h = vq.j.a(certKeyPair2);
                                                bVar18.f136134j = vq.j.a(result);
                                                bVar18.f136136l = i26;
                                                bVar18.f136137m = i27;
                                                bVar18.f136138n = i28;
                                                bVar18.f136139p = i35;
                                                bVar18.f136140q = i25;
                                                bVar18.f136141r = i36;
                                                bVar18.f136145w = 8;
                                                objF = bVar16.s(numE10, documentId, parentDocumentId4, mapA, dataSchema, bVar18);
                                                if (objF != E) {
                                                    return (dx.i) objF;
                                                }
                                            }
                                        }
                                    }
                                    return E;
                                } catch (ex.c e15) {
                                    e = e15;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    throw e16;
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
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            case 2:
                                int i39 = bVar18.f136140q;
                                int i45 = bVar18.f136139p;
                                int i46 = bVar18.f136138n;
                                int i47 = bVar18.f136137m;
                                int i48 = bVar18.f136136l;
                                CertKeyPair certKeyPair3 = (CertKeyPair) bVar18.f136134j;
                                bVar2 = (ex.b) bVar18.f136133h;
                                ex.b bVar28 = (ex.b) bVar18.f136132g;
                                ex.b bVar29 = (ex.b) bVar18.f136131f;
                                dx.j<dx.b> jVar2 = (dx.j) bVar18.f136130e;
                                eg0.t.Params params7 = (eg0.t.Params) bVar18.f136129d;
                                try {
                                    oq.u.b(objF);
                                    i25 = i39;
                                    params3 = params7;
                                    certKeyPair2 = certKeyPair3;
                                    i29 = i45;
                                    bVar5 = bVar28;
                                    i28 = i46;
                                    i27 = i47;
                                    bVar4 = bVar29;
                                    jVar = jVar2;
                                    i26 = i48;
                                    iIntValue = ((Number) bVar2.a((dx.i) objF)).intValue();
                                    c cVar3 = this.decryptListOfScopesUC;
                                    bVar6 = bVar4;
                                    c.Params params8 = new c.Params(params3.getDataScope(), certKeyPair2);
                                    bVar18.f136129d = params3;
                                    bVar18.f136130e = jVar;
                                    bVar18.f136131f = vq.j.a(bVar6);
                                    bVar18.f136132g = bVar5;
                                    bVar18.f136133h = bVar5;
                                    bVar18.f136134j = vq.j.a(certKeyPair2);
                                    bVar18.f136136l = i26;
                                    bVar18.f136137m = i27;
                                    bVar18.f136138n = i28;
                                    bVar18.f136139p = i29;
                                    bVar18.f136140q = i25;
                                    bVar18.f136141r = iIntValue;
                                    bVar18.f136145w = 3;
                                    objG = cVar3.g(params8, bVar18);
                                    if (objG != E) {
                                        bVar7 = bVar5;
                                        i35 = i29;
                                        i36 = iIntValue;
                                        bVar8 = bVar7;
                                        objF = objG;
                                        bVar9 = bVar6;
                                        result = (c.Result) bVar8.a((dx.i) objF);
                                        i37 = a.f136128a[params3.getDocumentType().ordinal()];
                                        params4 = params3;
                                        if (i37 != 1) {
                                            ex.b bVar111 = bVar9;
                                            mg0.b bVar210 = this.documentsRepository;
                                            String documentId10 = params4.getDocumentId();
                                            Map<String, CMSSignedData> mapA10 = result.a();
                                            Integer numE11 = vq.b.e(i36);
                                            bVar18.f136129d = vq.j.a(params4);
                                            bVar18.f136130e = jVar;
                                            bVar18.f136131f = vq.j.a(bVar111);
                                            bVar18.f136132g = vq.j.a(bVar7);
                                            bVar18.f136133h = vq.j.a(certKeyPair2);
                                            bVar18.f136134j = vq.j.a(result);
                                            bVar18.f136136l = i26;
                                            bVar18.f136137m = i27;
                                            bVar18.f136138n = i28;
                                            bVar18.f136139p = i35;
                                            bVar18.f136140q = i25;
                                            bVar18.f136141r = i36;
                                            bVar18.f136145w = 4;
                                            objF = bVar210.u(numE11, documentId10, mapA10, bVar18);
                                            if (objF != E) {
                                                return (dx.i) objF;
                                            }
                                        } else {
                                            if (i37 != 2) {
                                                bVar10 = bVar9;
                                                parentDocumentId = params4.getParentDocumentId();
                                                if (parentDocumentId != null) {
                                                    mg0.b bVar211 = this.documentsRepository;
                                                    String documentId11 = params4.getDocumentId();
                                                    Map<String, CMSSignedData> mapA11 = result.a();
                                                    Integer numE12 = vq.b.e(i36);
                                                    bVar18.f136129d = vq.j.a(params4);
                                                    bVar18.f136130e = jVar;
                                                    bVar18.f136131f = vq.j.a(bVar10);
                                                    bVar18.f136132g = bVar7;
                                                    bVar18.f136133h = vq.j.a(certKeyPair2);
                                                    bVar18.f136134j = vq.j.a(result);
                                                    bVar18.f136135k = vq.j.a(parentDocumentId);
                                                    bVar18.f136136l = i26;
                                                    bVar18.f136137m = i27;
                                                    bVar18.f136138n = i28;
                                                    bVar18.f136139p = i35;
                                                    bVar18.f136140q = i25;
                                                    bVar18.f136141r = i36;
                                                    bVar18.f136142s = 0;
                                                    bVar18.f136145w = 5;
                                                    objK = bVar211.k(numE12, documentId11, parentDocumentId, mapA11, bVar18);
                                                    if (objK == E) {
                                                        bVar11 = bVar7;
                                                        iVar = (dx.i) objK;
                                                        if (iVar != null) {
                                                            return iVar;
                                                        }
                                                        bVar7 = bVar11;
                                                    }
                                                } else {
                                                    str2 = str2;
                                                }
                                                bVar7.b(new dx.b.Generic(new NoSuchElementException(str2)));
                                                throw new oq.g();
                                            }
                                            if (i37 != 3) {
                                                bVar12 = bVar9;
                                                parentDocumentId2 = params4.getParentDocumentId();
                                                if (parentDocumentId2 != null) {
                                                    mg0.b bVar212 = this.documentsRepository;
                                                    String documentId12 = params4.getDocumentId();
                                                    Map<String, CMSSignedData> mapA12 = result.a();
                                                    Integer numE13 = vq.b.e(i36);
                                                    bVar18.f136129d = vq.j.a(params4);
                                                    bVar18.f136130e = jVar;
                                                    bVar18.f136131f = vq.j.a(bVar12);
                                                    bVar18.f136132g = bVar7;
                                                    bVar18.f136133h = vq.j.a(certKeyPair2);
                                                    bVar18.f136134j = vq.j.a(result);
                                                    bVar18.f136135k = vq.j.a(parentDocumentId2);
                                                    bVar18.f136136l = i26;
                                                    bVar18.f136137m = i27;
                                                    bVar18.f136138n = i28;
                                                    bVar18.f136139p = i35;
                                                    bVar18.f136140q = i25;
                                                    bVar18.f136141r = i36;
                                                    bVar18.f136142s = 0;
                                                    bVar18.f136145w = 6;
                                                    objR = bVar212.r(numE13, documentId12, parentDocumentId2, mapA12, bVar18);
                                                    if (objR == E) {
                                                        bVar13 = bVar7;
                                                        iVar2 = (dx.i) objR;
                                                        if (iVar2 != null) {
                                                            return iVar2;
                                                        }
                                                        bVar7 = bVar13;
                                                    }
                                                } else {
                                                    str2 = str2;
                                                }
                                                bVar7.b(new dx.b.Generic(new NoSuchElementException(str2)));
                                                throw new oq.g();
                                            }
                                            if (i37 != 4) {
                                                bVar14 = bVar9;
                                                parentDocumentId3 = params4.getParentDocumentId();
                                                if (parentDocumentId3 != null) {
                                                    mg0.b bVar213 = this.documentsRepository;
                                                    String documentId13 = params4.getDocumentId();
                                                    Map<String, CMSSignedData> mapA13 = result.a();
                                                    Integer numE14 = vq.b.e(i36);
                                                    bVar18.f136129d = vq.j.a(params4);
                                                    bVar18.f136130e = jVar;
                                                    bVar18.f136131f = vq.j.a(bVar14);
                                                    bVar18.f136132g = bVar7;
                                                    bVar18.f136133h = vq.j.a(certKeyPair2);
                                                    bVar18.f136134j = vq.j.a(result);
                                                    bVar18.f136135k = vq.j.a(parentDocumentId3);
                                                    bVar18.f136136l = i26;
                                                    bVar18.f136137m = i27;
                                                    bVar18.f136138n = i28;
                                                    bVar18.f136139p = i35;
                                                    bVar18.f136140q = i25;
                                                    bVar18.f136141r = i36;
                                                    bVar18.f136142s = 0;
                                                    bVar18.f136145w = 7;
                                                    str = "ParentId can not be null";
                                                    objL = bVar213.l(numE14, documentId13, parentDocumentId3, mapA13, bVar18);
                                                    if (objL == E) {
                                                        bVar15 = bVar7;
                                                        iVar3 = (dx.i) objL;
                                                        if (iVar3 != null) {
                                                            return iVar3;
                                                        }
                                                        bVar7 = bVar15;
                                                    }
                                                } else {
                                                    str = "ParentId can not be null";
                                                }
                                                bVar7.b(new dx.b.Generic(new NoSuchElementException(str)));
                                                throw new oq.g();
                                            }
                                            if (i37 == 5) {
                                                throw new oq.p();
                                            }
                                            bVar16 = this.documentsRepository;
                                            documentId = params4.getDocumentId();
                                            mapA = result.a();
                                            bVar17 = bVar9;
                                            parentDocumentId4 = params4.getParentDocumentId();
                                            if (parentDocumentId4 != null) {
                                                bVar7.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                throw new oq.g();
                                            }
                                            dataSchema = params4.getDataSchema();
                                            if (dataSchema != null) {
                                                bVar7.b(new dx.b.Generic(new NoSuchElementException("DataSchema can not be null")));
                                                throw new oq.g();
                                            }
                                            Integer numE15 = vq.b.e(i36);
                                            bVar18.f136129d = vq.j.a(params4);
                                            bVar18.f136130e = jVar;
                                            bVar18.f136131f = vq.j.a(bVar17);
                                            bVar18.f136132g = vq.j.a(bVar7);
                                            bVar18.f136133h = vq.j.a(certKeyPair2);
                                            bVar18.f136134j = vq.j.a(result);
                                            bVar18.f136136l = i26;
                                            bVar18.f136137m = i27;
                                            bVar18.f136138n = i28;
                                            bVar18.f136139p = i35;
                                            bVar18.f136140q = i25;
                                            bVar18.f136141r = i36;
                                            bVar18.f136145w = 8;
                                            objF = bVar16.s(numE15, documentId, parentDocumentId4, mapA, dataSchema, bVar18);
                                            if (objF != E) {
                                                return (dx.i) objF;
                                            }
                                        }
                                    }
                                    return E;
                                } catch (ex.c e18) {
                                    e = e18;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                } catch (Exception e25) {
                                    e = e25;
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
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            case 3:
                                int i49 = bVar18.f136141r;
                                i25 = bVar18.f136140q;
                                i35 = bVar18.f136139p;
                                i28 = bVar18.f136138n;
                                int i55 = bVar18.f136137m;
                                i26 = bVar18.f136136l;
                                certKeyPair2 = (CertKeyPair) bVar18.f136134j;
                                ex.b bVar30 = (ex.b) bVar18.f136133h;
                                ex.b bVar31 = (ex.b) bVar18.f136132g;
                                bVar9 = (ex.b) bVar18.f136131f;
                                dx.j<dx.b> jVar3 = (dx.j) bVar18.f136130e;
                                params3 = (eg0.t.Params) bVar18.f136129d;
                                try {
                                    oq.u.b(objF);
                                    jVar = jVar3;
                                    i27 = i55;
                                    bVar7 = bVar31;
                                    bVar8 = bVar30;
                                    i36 = i49;
                                    result = (c.Result) bVar8.a((dx.i) objF);
                                    i37 = a.f136128a[params3.getDocumentType().ordinal()];
                                    params4 = params3;
                                    if (i37 != 1) {
                                        ex.b bVar112 = bVar9;
                                        mg0.b bVar214 = this.documentsRepository;
                                        String documentId14 = params4.getDocumentId();
                                        Map<String, CMSSignedData> mapA14 = result.a();
                                        Integer numE16 = vq.b.e(i36);
                                        bVar18.f136129d = vq.j.a(params4);
                                        bVar18.f136130e = jVar;
                                        bVar18.f136131f = vq.j.a(bVar112);
                                        bVar18.f136132g = vq.j.a(bVar7);
                                        bVar18.f136133h = vq.j.a(certKeyPair2);
                                        bVar18.f136134j = vq.j.a(result);
                                        bVar18.f136136l = i26;
                                        bVar18.f136137m = i27;
                                        bVar18.f136138n = i28;
                                        bVar18.f136139p = i35;
                                        bVar18.f136140q = i25;
                                        bVar18.f136141r = i36;
                                        bVar18.f136145w = 4;
                                        objF = bVar214.u(numE16, documentId14, mapA14, bVar18);
                                        if (objF != E) {
                                            return (dx.i) objF;
                                        }
                                    } else {
                                        if (i37 != 2) {
                                            bVar10 = bVar9;
                                            parentDocumentId = params4.getParentDocumentId();
                                            if (parentDocumentId != null) {
                                                mg0.b bVar215 = this.documentsRepository;
                                                String documentId15 = params4.getDocumentId();
                                                Map<String, CMSSignedData> mapA15 = result.a();
                                                Integer numE17 = vq.b.e(i36);
                                                bVar18.f136129d = vq.j.a(params4);
                                                bVar18.f136130e = jVar;
                                                bVar18.f136131f = vq.j.a(bVar10);
                                                bVar18.f136132g = bVar7;
                                                bVar18.f136133h = vq.j.a(certKeyPair2);
                                                bVar18.f136134j = vq.j.a(result);
                                                bVar18.f136135k = vq.j.a(parentDocumentId);
                                                bVar18.f136136l = i26;
                                                bVar18.f136137m = i27;
                                                bVar18.f136138n = i28;
                                                bVar18.f136139p = i35;
                                                bVar18.f136140q = i25;
                                                bVar18.f136141r = i36;
                                                bVar18.f136142s = 0;
                                                bVar18.f136145w = 5;
                                                objK = bVar215.k(numE17, documentId15, parentDocumentId, mapA15, bVar18);
                                                if (objK == E) {
                                                    bVar11 = bVar7;
                                                    iVar = (dx.i) objK;
                                                    if (iVar != null) {
                                                        return iVar;
                                                    }
                                                    bVar7 = bVar11;
                                                }
                                            } else {
                                                str2 = str2;
                                            }
                                            bVar7.b(new dx.b.Generic(new NoSuchElementException(str2)));
                                            throw new oq.g();
                                        }
                                        if (i37 != 3) {
                                            bVar12 = bVar9;
                                            parentDocumentId2 = params4.getParentDocumentId();
                                            if (parentDocumentId2 != null) {
                                                mg0.b bVar216 = this.documentsRepository;
                                                String documentId16 = params4.getDocumentId();
                                                Map<String, CMSSignedData> mapA16 = result.a();
                                                Integer numE18 = vq.b.e(i36);
                                                bVar18.f136129d = vq.j.a(params4);
                                                bVar18.f136130e = jVar;
                                                bVar18.f136131f = vq.j.a(bVar12);
                                                bVar18.f136132g = bVar7;
                                                bVar18.f136133h = vq.j.a(certKeyPair2);
                                                bVar18.f136134j = vq.j.a(result);
                                                bVar18.f136135k = vq.j.a(parentDocumentId2);
                                                bVar18.f136136l = i26;
                                                bVar18.f136137m = i27;
                                                bVar18.f136138n = i28;
                                                bVar18.f136139p = i35;
                                                bVar18.f136140q = i25;
                                                bVar18.f136141r = i36;
                                                bVar18.f136142s = 0;
                                                bVar18.f136145w = 6;
                                                objR = bVar216.r(numE18, documentId16, parentDocumentId2, mapA16, bVar18);
                                                if (objR == E) {
                                                    bVar13 = bVar7;
                                                    iVar2 = (dx.i) objR;
                                                    if (iVar2 != null) {
                                                        return iVar2;
                                                    }
                                                    bVar7 = bVar13;
                                                }
                                            } else {
                                                str2 = str2;
                                            }
                                            bVar7.b(new dx.b.Generic(new NoSuchElementException(str2)));
                                            throw new oq.g();
                                        }
                                        if (i37 != 4) {
                                            bVar14 = bVar9;
                                            parentDocumentId3 = params4.getParentDocumentId();
                                            if (parentDocumentId3 != null) {
                                                mg0.b bVar217 = this.documentsRepository;
                                                String documentId17 = params4.getDocumentId();
                                                Map<String, CMSSignedData> mapA17 = result.a();
                                                Integer numE19 = vq.b.e(i36);
                                                bVar18.f136129d = vq.j.a(params4);
                                                bVar18.f136130e = jVar;
                                                bVar18.f136131f = vq.j.a(bVar14);
                                                bVar18.f136132g = bVar7;
                                                bVar18.f136133h = vq.j.a(certKeyPair2);
                                                bVar18.f136134j = vq.j.a(result);
                                                bVar18.f136135k = vq.j.a(parentDocumentId3);
                                                bVar18.f136136l = i26;
                                                bVar18.f136137m = i27;
                                                bVar18.f136138n = i28;
                                                bVar18.f136139p = i35;
                                                bVar18.f136140q = i25;
                                                bVar18.f136141r = i36;
                                                bVar18.f136142s = 0;
                                                bVar18.f136145w = 7;
                                                str = "ParentId can not be null";
                                                objL = bVar217.l(numE19, documentId17, parentDocumentId3, mapA17, bVar18);
                                                if (objL == E) {
                                                    bVar15 = bVar7;
                                                    iVar3 = (dx.i) objL;
                                                    if (iVar3 != null) {
                                                        return iVar3;
                                                    }
                                                    bVar7 = bVar15;
                                                }
                                            } else {
                                                str = "ParentId can not be null";
                                            }
                                            bVar7.b(new dx.b.Generic(new NoSuchElementException(str)));
                                            throw new oq.g();
                                        }
                                        if (i37 == 5) {
                                            throw new oq.p();
                                        }
                                        bVar16 = this.documentsRepository;
                                        documentId = params4.getDocumentId();
                                        mapA = result.a();
                                        bVar17 = bVar9;
                                        parentDocumentId4 = params4.getParentDocumentId();
                                        if (parentDocumentId4 != null) {
                                            bVar7.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                            throw new oq.g();
                                        }
                                        dataSchema = params4.getDataSchema();
                                        if (dataSchema != null) {
                                            bVar7.b(new dx.b.Generic(new NoSuchElementException("DataSchema can not be null")));
                                            throw new oq.g();
                                        }
                                        Integer numE110 = vq.b.e(i36);
                                        bVar18.f136129d = vq.j.a(params4);
                                        bVar18.f136130e = jVar;
                                        bVar18.f136131f = vq.j.a(bVar17);
                                        bVar18.f136132g = vq.j.a(bVar7);
                                        bVar18.f136133h = vq.j.a(certKeyPair2);
                                        bVar18.f136134j = vq.j.a(result);
                                        bVar18.f136136l = i26;
                                        bVar18.f136137m = i27;
                                        bVar18.f136138n = i28;
                                        bVar18.f136139p = i35;
                                        bVar18.f136140q = i25;
                                        bVar18.f136141r = i36;
                                        bVar18.f136145w = 8;
                                        objF = bVar16.s(numE110, documentId, parentDocumentId4, mapA, dataSchema, bVar18);
                                        if (objF != E) {
                                            return (dx.i) objF;
                                        }
                                    }
                                    return E;
                                } catch (ex.c e26) {
                                    e = e26;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e27) {
                                    throw e27;
                                } catch (Exception e28) {
                                    e = e28;
                                    E = jVar3;
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
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            case 4:
                                oq.u.b(objF);
                                return (dx.i) objF;
                            case 5:
                                bVar11 = (ex.b) bVar18.f136132g;
                                dx.j<dx.b> jVar4 = (dx.j) bVar18.f136130e;
                                oq.u.b(objF);
                                jVar = jVar4;
                                objK = objF;
                                iVar = (dx.i) objK;
                                if (iVar != null) {
                                    return iVar;
                                }
                                bVar7 = bVar11;
                                bVar7.b(new dx.b.Generic(new NoSuchElementException(str2)));
                                throw new oq.g();
                            case 6:
                                bVar13 = (ex.b) bVar18.f136132g;
                                dx.j<dx.b> jVar5 = (dx.j) bVar18.f136130e;
                                oq.u.b(objF);
                                jVar = jVar5;
                                objR = objF;
                                iVar2 = (dx.i) objR;
                                if (iVar2 != null) {
                                    return iVar2;
                                }
                                bVar7 = bVar13;
                                bVar7.b(new dx.b.Generic(new NoSuchElementException(str2)));
                                throw new oq.g();
                            case 7:
                                bVar15 = (ex.b) bVar18.f136132g;
                                dx.j<dx.b> jVar6 = (dx.j) bVar18.f136130e;
                                oq.u.b(objF);
                                jVar = jVar6;
                                objL = objF;
                                str = "ParentId can not be null";
                                iVar3 = (dx.i) objL;
                                if (iVar3 != null) {
                                    return iVar3;
                                }
                                bVar7 = bVar15;
                                bVar7.b(new dx.b.Generic(new NoSuchElementException(str)));
                                throw new oq.g();
                            case 8:
                                oq.u.b(objF);
                                return (dx.i) objF;
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
            E = r15;
        }
    }
}
