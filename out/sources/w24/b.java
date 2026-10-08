package w24;

import i24.StudentCardData;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.cms.CMSSignedData;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import u24.StudentPackageData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J$\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'2\u0006\u0010&\u001a\u00020%H\u0096B¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lw24/b;", "Lw24/a;", "Liy/a;", "baseCoder", "Lay/j;", "jsonSerializer", "Lpx/d;", "remoteLogger", "Lv24/b;", "documentsContainerRepository", "Lpy/b;", "aesKeyGenerator", "Liy/g;", "cipherAes", "Lk24/o;", "saveUserCertificateUC", "Liy/c;", "bytesConverter", "Liy/e;", "bytesManager", "Lw24/c2;", "isCurrentUserPeselUC", "Liy/v;", "pkcs12Manager", "Ls24/a;", "containersErrorInteractor", "Lk24/h;", "getStudentCardDataUC", "Ls24/b;", "containersInteractor", "Lez/c;", "dateConverter", "<init>", "(Liy/a;Lay/j;Lpx/d;Lv24/b;Lpy/b;Liy/g;Lk24/o;Liy/c;Liy/e;Lw24/c2;Liy/v;Ls24/a;Lk24/h;Ls24/b;Lez/c;)V", "Liy/a0;", "d", "()Liy/a0;", "Lw24/a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "e", "(Lw24/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/a;", "b", "Lay/j;", "c", "Lpx/d;", "Lv24/b;", "Lpy/b;", "f", "Liy/g;", "g", "Lk24/o;", "h", "Liy/c;", "i", "Liy/e;", "j", "Lw24/c2;", "k", "Liy/v;", "l", "Ls24/a;", "m", "Lk24/h;", "n", "Ls24/b;", "o", "Lez/c;", "", "p", "[B", "saltStudentID", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements w24.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.a baseCoder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final py.b aesKeyGenerator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k24.o saveUserCertificateUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final iy.e bytesManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c2 isCurrentUserPeselUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final iy.v pkcs12Manager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final s24.a containersErrorInteractor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k24.h getStudentCardDataUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final s24.b containersInteractor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final byte[] saltStudentID = {-73, 116, 33, -84, 127, -116, -18, -103};

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        int A;
        int B;
        int C;
        int D;
        int E;
        /* synthetic */ Object F;
        int H;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209498f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209499g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209500h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209501j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f209502k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f209503l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f209504m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f209505n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f209506p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f209507q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f209508r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f209509s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f209510t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f209511v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f209512w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f209513x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f209514y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f209515z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.F = obj;
            this.H |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(iy.a aVar, ay.j jVar, px.d dVar, v24.b bVar, py.b bVar2, iy.g gVar, k24.o oVar, iy.c cVar, iy.e eVar, c2 c2Var, iy.v vVar, s24.a aVar2, k24.h hVar, s24.b bVar3, ez.c cVar2) {
        this.baseCoder = aVar;
        this.jsonSerializer = jVar;
        this.remoteLogger = dVar;
        this.documentsContainerRepository = bVar;
        this.aesKeyGenerator = bVar2;
        this.cipherAes = gVar;
        this.saveUserCertificateUC = oVar;
        this.bytesConverter = cVar;
        this.bytesManager = eVar;
        this.isCurrentUserPeselUC = c2Var;
        this.pkcs12Manager = vVar;
        this.containersErrorInteractor = aVar2;
        this.getStudentCardDataUC = hVar;
        this.containersInteractor = bVar3;
        this.dateConverter = cVar2;
    }

    private final iy.a0 d() {
        iy.e eVar = this.bytesManager;
        byte[] bArr = this.saltStudentID;
        return iy.c0.f(eVar.c(eVar.c(bArr, bArr), this.saltStudentID));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:103:0x06da  */
    /* JADX WARN: Code duplicated, block: B:108:0x0769  */
    /* JADX WARN: Code duplicated, block: B:109:0x076b  */
    /* JADX WARN: Code duplicated, block: B:115:0x07b9 A[Catch: Exception -> 0x07f2, c -> 0x07f6, CancellationException -> 0x07fa, LOOP:0: B:113:0x07b3->B:115:0x07b9, LOOP_END, TryCatch #21 {c -> 0x07f6, CancellationException -> 0x07fa, Exception -> 0x07f2, blocks: (B:137:0x0a57, B:134:0x09c3, B:130:0x0914, B:126:0x0894, B:112:0x078a, B:113:0x07b3, B:115:0x07b9, B:122:0x07fe), top: B:189:0x078a }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0884  */
    /* JADX WARN: Code duplicated, block: B:125:0x0886  */
    /* JADX WARN: Code duplicated, block: B:128:0x090a  */
    /* JADX WARN: Code duplicated, block: B:129:0x090c  */
    /* JADX WARN: Code duplicated, block: B:132:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:133:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x0a97  */
    /* JADX WARN: Code duplicated, block: B:172:0x0ae3  */
    /* JADX WARN: Code duplicated, block: B:175:0x0af4  */
    /* JADX WARN: Code duplicated, block: B:176:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:178:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:181:0x0b12  */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0511  */
    /* JADX WARN: Code duplicated, block: B:89:0x0514  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0634  */
    /* JADX WARN: Code duplicated, block: B:95:0x0637  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 24, insn: 0x02e0: MOVE (r2 I:??[OBJECT, ARRAY]) = (r24 I:??[OBJECT, ARRAY]), block:B:49:0x02e0 */
    /* JADX WARN: Not initialized variable reg: 24, insn: 0x02e5: MOVE (r2 I:??[OBJECT, ARRAY]) = (r24 I:??[OBJECT, ARRAY]), block:B:51:0x02e5 */
    /* JADX WARN: Not initialized variable reg: 24, insn: 0x02ea: MOVE (r2 I:??[OBJECT, ARRAY]) = (r24 I:??[OBJECT, ARRAY]), block:B:53:0x02ea */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x01c4: MOVE (r2 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:35:0x01c4 */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x01c9: MOVE (r2 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:37:0x01c9 */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x01ce: MOVE (r2 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:39:0x01ce */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v6, types: [dx.j] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Class<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v180 */
    /* JADX WARN: Type inference failed for: r2v184 */
    /* JADX WARN: Type inference failed for: r2v187 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v190 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v229, types: [java.lang.Class<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v230 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7, types: [dx.j, java.lang.Object] */
    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(w24.a.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        a aVar;
        Object obj;
        Object obj2;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        w24.a.Params params2;
        byte[] bArr;
        ex.b bVar;
        ex.b bVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        SecretKey secretKey;
        ex.b bVar3;
        w24.a.Params params3;
        Object objD;
        ex.b bVar4;
        ?? r15;
        int i25;
        ex.b bVar5;
        SecretKey secretKey2;
        ?? r19;
        byte[] bArr2;
        SecretKey secretKey3;
        byte[] bArr3;
        StudentPackageData studentPackageData;
        ex.b bVar6;
        byte[] bArr4;
        byte[] bArr5;
        int i26;
        byte[] bArr6;
        int i27;
        Map map;
        char[] cArr;
        int i28;
        ex.b bVar7;
        Object objA;
        Object obj3;
        byte[] bArr7;
        int i29;
        ex.b bVar8;
        int i35;
        byte[] bArr8;
        int i36;
        ex.b bVar9;
        int i37;
        ?? r16;
        CertKeyPair certKeyPair;
        byte[] bArr9;
        String string;
        Object objC;
        Object obj4;
        String str;
        ex.b bVar10;
        Map map2;
        char[] cArr2;
        int i38;
        int i39;
        byte[] bArr10;
        CertKeyPair certKeyPair2;
        SecretKey secretKey4;
        SecretKey secretKey5;
        byte[] bArr11;
        byte[] bArr12;
        CertKeyPair certKeyPair3;
        ex.b bVar11;
        int i45;
        int i46;
        int i47;
        StudentPackageData studentPackageData2;
        int i48;
        char[] cArr3;
        byte[] bArr13;
        SecretKey secretKey6;
        String str2;
        int i49;
        b bVar12;
        Map map3;
        int iIntValue;
        ArrayList arrayList;
        Iterator it;
        Map<String, ? extends CMSSignedData> mapS;
        int i55;
        int i56;
        Object objQ;
        Object obj5;
        int i57;
        Map<String, ? extends CMSSignedData> map4;
        int i58;
        int i59;
        Map map5;
        byte[] bArr14;
        String str3;
        int i65;
        ex.b bVar13;
        ?? r17;
        int i66;
        Map<String, ? extends CMSSignedData> map6;
        ex.b bVar14;
        Map map7;
        String str4;
        char[] cArr4;
        CertKeyPair certKeyPair4;
        ?? r18;
        StudentCardData studentCardData;
        fz.b.LocalDate localDate;
        CertKeyPair certKeyPair5;
        char[] cArr5;
        Object objI;
        StudentCardData studentCardData2;
        Map<String, ? extends CMSSignedData> map8;
        Map map9;
        char[] cArr6;
        String str5;
        fz.b.LocalDate localDate2;
        byte[] bArr15;
        ex.b bVar15;
        ?? r110;
        s24.b bVar16;
        f24.i iVar;
        b bVar17 = this;
        ?? r25 = String.class;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i67 = aVar.H;
            if ((i67 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.H = i67 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = bVar17.new a(eVar);
            }
        } else {
            aVar = bVar17.new a(eVar);
        }
        a aVar3 = aVar;
        Object objC2 = aVar3.F;
        Object objE = uq.b.e();
        try {
            try {
                try {
                    try {
                        try {
                            switch (aVar3.H) {
                                case 0:
                                    oq.u.b(objC2);
                                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                    aVar2 = new ex.a();
                                    byte[] bArr16 = (byte[]) aVar2.a(iy.a.c(bVar17.baseCoder, params.getPackageData(), null, 2, null));
                                    py.b bVar18 = bVar17.aesKeyGenerator;
                                    py.d.PBEKeySpec pBEKeySpec = new py.d.PBEKeySpec(0, bVar17.d(), params.getPassword(), 1, null);
                                    aVar3.f209496d = vq.j.a(params);
                                    aVar3.f209497e = jVarA;
                                    aVar3.f209498f = vq.j.a(aVar2);
                                    aVar3.f209499g = aVar2;
                                    aVar3.f209500h = bArr16;
                                    aVar3.f209501j = aVar2;
                                    aVar3.f209515z = 0;
                                    aVar3.A = 0;
                                    aVar3.B = 0;
                                    aVar3.C = 0;
                                    aVar3.D = 0;
                                    aVar3.H = 1;
                                    Object objA2 = bVar18.a(pBEKeySpec, aVar3);
                                    if (objA2 != objE) {
                                        params2 = params;
                                        bArr = bArr16;
                                        objC2 = objA2;
                                        bVar = aVar2;
                                        bVar2 = bVar;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        i19 = 0;
                                        r25 = jVarA;
                                        secretKey = (SecretKey) aVar2.a((dx.i) objC2);
                                        bVar3 = bVar2;
                                        bVar17.remoteLogger.F8("Student card package AES secret key generated successfully", px.d.a.GENERAL);
                                        iy.g gVar = bVar17.cipherAes;
                                        params3 = params2;
                                        try {
                                            iy.h.a.C2298a c2298a = new iy.h.a.C2298a(new iy.r.c(16, iy.q.Suffix), 17);
                                            aVar3.f209496d = vq.j.a(params3);
                                            aVar3.f209497e = r25;
                                            aVar3.f209498f = vq.j.a(bVar3);
                                            aVar3.f209499g = bVar;
                                            aVar3.f209500h = vq.j.a(bArr);
                                            aVar3.f209501j = bVar;
                                            aVar3.f209502k = vq.j.a(secretKey);
                                            aVar3.f209515z = i19;
                                            aVar3.A = i18;
                                            aVar3.B = i17;
                                            aVar3.C = i16;
                                            aVar3.D = i15;
                                            aVar3.H = 2;
                                            objD = gVar.d(bArr, secretKey, c2298a, aVar3);
                                            if (objD != objE) {
                                                bVar4 = bVar3;
                                                r15 = r25;
                                                i25 = i19;
                                                bVar5 = bVar;
                                                secretKey2 = secretKey;
                                                objC2 = objD;
                                                r19 = r25;
                                                try {
                                                    bArr2 = (byte[]) bVar.a((dx.i) objC2);
                                                    bVar17 = this;
                                                    px.d dVar = bVar17.remoteLogger;
                                                    secretKey3 = secretKey2;
                                                    px.d.a aVar4 = px.d.a.GENERAL;
                                                    dVar.F8("Student card package decrypted successfully", aVar4);
                                                    bArr3 = bArr;
                                                    StudentPackageData studentPackageData3 = (StudentPackageData) bVar17.jsonSerializer.a(new String(bArr2, StandardCharsets.UTF_8), fr.q0.n(StudentPackageData.class));
                                                    studentPackageData = studentPackageData3;
                                                    bVar6 = bVar4;
                                                    bArr4 = (byte[]) bVar5.a(iy.a.c(bVar17.baseCoder, studentPackageData3.getPkcs12Data(), null, 2, null));
                                                    bArr5 = (byte[]) bVar5.a(iy.a.c(bVar17.baseCoder, studentPackageData.getPkcs12Pass(), null, 2, null));
                                                    i26 = i15;
                                                    byte[] bArr17 = (byte[]) bVar5.a(iy.a.c(bVar17.baseCoder, studentPackageData.getSignedDataList(), null, 2, null));
                                                    ay.j jVar = bVar17.jsonSerializer;
                                                    String str6 = new String(bArr17, fu.d.UTF_8);
                                                    bArr6 = bArr17;
                                                    mr.r.Companion companion = mr.r.INSTANCE;
                                                    i27 = i16;
                                                    int i68 = i17;
                                                    map = (Map) jVar.a(str6, fr.q0.p(Map.class, companion.d(fr.q0.n(r19)), companion.d(fr.q0.g(r19))));
                                                    bVar17.remoteLogger.F8("Student card package data and certificate decoded successfully", aVar4);
                                                    cArr = (char[]) bVar5.a(bVar17.bytesConverter.c(bArr5, iy.b.a.f97723a));
                                                    bVar17.remoteLogger.F8("PKCS12 data and password decoded successfully", aVar4);
                                                    iy.v vVar = bVar17.pkcs12Manager;
                                                    iy.a0 a0VarF = iy.c0.f(bArr4);
                                                    iy.b0 b0Var = new iy.b0(cArr);
                                                    aVar3.f209496d = vq.j.a(params3);
                                                    aVar3.f209497e = r15;
                                                    aVar3.f209498f = vq.j.a(bVar6);
                                                    aVar3.f209499g = bVar5;
                                                    aVar3.f209500h = vq.j.a(bArr3);
                                                    aVar3.f209501j = bVar5;
                                                    aVar3.f209502k = vq.j.a(secretKey3);
                                                    aVar3.f209503l = vq.j.a(bArr2);
                                                    aVar3.f209504m = bArr4;
                                                    aVar3.f209505n = vq.j.a(bArr5);
                                                    aVar3.f209506p = vq.j.a(bArr6);
                                                    aVar3.f209507q = vq.j.a(studentPackageData);
                                                    aVar3.f209508r = cArr;
                                                    aVar3.f209509s = map;
                                                    aVar3.f209515z = i25;
                                                    aVar3.A = i18;
                                                    i28 = i68;
                                                    aVar3.B = i28;
                                                    bVar7 = bVar5;
                                                    aVar3.C = i27;
                                                    aVar3.D = i26;
                                                    aVar3.H = 3;
                                                    objA = vVar.a("mlWork", a0VarF, b0Var, aVar3);
                                                    obj3 = objE;
                                                    if (objA == obj3) {
                                                        return obj3;
                                                    }
                                                    bArr7 = bArr5;
                                                    i29 = i25;
                                                    bVar8 = bVar7;
                                                    i35 = i26;
                                                    bArr8 = bArr2;
                                                    objC2 = objA;
                                                    i36 = i18;
                                                    bVar9 = bVar8;
                                                    i37 = i27;
                                                    r16 = r15;
                                                    certKeyPair = (CertKeyPair) bVar9.a((dx.i) objC2);
                                                    bArr9 = bArr7;
                                                    string = certKeyPair.getCertificate().getSerialNumber().toString(16);
                                                    c2 c2Var = bVar17.isCurrentUserPeselUC;
                                                    c2.Params params4 = new c2.Params(certKeyPair.getCertificate());
                                                    aVar3.f209496d = vq.j.a(params3);
                                                    aVar3.f209497e = r16;
                                                    aVar3.f209498f = vq.j.a(bVar6);
                                                    aVar3.f209499g = bVar8;
                                                    aVar3.f209500h = vq.j.a(bArr3);
                                                    aVar3.f209501j = vq.j.a(secretKey3);
                                                    aVar3.f209502k = vq.j.a(bArr8);
                                                    aVar3.f209503l = bArr4;
                                                    aVar3.f209504m = vq.j.a(bArr9);
                                                    aVar3.f209505n = vq.j.a(bArr6);
                                                    aVar3.f209506p = vq.j.a(studentPackageData);
                                                    aVar3.f209507q = cArr;
                                                    aVar3.f209508r = vq.j.a(certKeyPair);
                                                    aVar3.f209509s = string;
                                                    aVar3.f209510t = map;
                                                    aVar3.f209515z = i29;
                                                    aVar3.A = i36;
                                                    aVar3.B = i28;
                                                    aVar3.C = i37;
                                                    aVar3.D = i35;
                                                    aVar3.H = 4;
                                                    objC = c2Var.c(params4, aVar3);
                                                    obj4 = obj3;
                                                    if (objC != obj4) {
                                                        ex.b bVar19 = bVar8;
                                                        str = string;
                                                        bVar10 = bVar19;
                                                        map2 = map;
                                                        cArr2 = cArr;
                                                        i38 = i37;
                                                        i39 = i28;
                                                        bArr10 = bArr9;
                                                        certKeyPair2 = certKeyPair;
                                                        objC2 = objC;
                                                        secretKey4 = secretKey3;
                                                        r15 = r16;
                                                        if (!((Boolean) objC2).booleanValue()) {
                                                            this.remoteLogger.F8("Pesel from new certificate does not match current user's pesel", px.d.a.ERROR);
                                                            bVar10.b(this.containersErrorInteractor.b());
                                                            throw new oq.g();
                                                        }
                                                        secretKey5 = secretKey4;
                                                        try {
                                                            bArr11 = bArr10;
                                                            bArr12 = bArr4;
                                                            this.remoteLogger.F8("Pesel from new certificate matches current user's pesel", px.d.a.GENERAL);
                                                            k24.o oVar = this.saveUserCertificateUC;
                                                            certKeyPair3 = certKeyPair2;
                                                            try {
                                                                k24.o.Params params5 = new k24.o.Params(f24.c.UNIVERSITY, new iy.b0(new char[0]), iy.c0.f(bArr12), iy.c0.h(cArr2));
                                                                aVar3.f209496d = vq.j.a(params3);
                                                                aVar3.f209497e = r15;
                                                                aVar3.f209498f = vq.j.a(bVar6);
                                                                aVar3.f209499g = bVar10;
                                                                aVar3.f209500h = vq.j.a(bArr3);
                                                                aVar3.f209501j = bVar10;
                                                                aVar3.f209502k = vq.j.a(secretKey5);
                                                                aVar3.f209503l = vq.j.a(bArr8);
                                                                aVar3.f209504m = vq.j.a(bArr12);
                                                                aVar3.f209505n = vq.j.a(bArr11);
                                                                aVar3.f209506p = vq.j.a(bArr6);
                                                                aVar3.f209507q = vq.j.a(studentPackageData);
                                                                aVar3.f209508r = vq.j.a(cArr2);
                                                                aVar3.f209509s = vq.j.a(certKeyPair3);
                                                                aVar3.f209510t = str;
                                                                aVar3.f209511v = map2;
                                                                aVar3.f209515z = i29;
                                                                aVar3.A = i36;
                                                                aVar3.B = i39;
                                                                aVar3.C = i38;
                                                                aVar3.D = i35;
                                                                aVar3.H = 5;
                                                                objC2 = oVar.c(params5, aVar3);
                                                                obj4 = obj4;
                                                                if (objC2 == obj4) {
                                                                    bVar11 = bVar10;
                                                                    i45 = i38;
                                                                    i46 = i36;
                                                                    i47 = i29;
                                                                    studentPackageData2 = studentPackageData;
                                                                    i48 = i39;
                                                                    cArr3 = cArr2;
                                                                    bArr13 = bArr8;
                                                                    secretKey6 = secretKey5;
                                                                    str2 = str;
                                                                    i49 = i35;
                                                                    r15 = r15;
                                                                    map3 = map2;
                                                                    iIntValue = ((Number) bVar10.a((dx.i) objC2)).intValue();
                                                                    bVar12 = this;
                                                                    try {
                                                                        bVar12.remoteLogger.F8("New certificate saved with id: " + iIntValue, px.d.a.GENERAL);
                                                                        arrayList = new ArrayList(map3.size());
                                                                        it = map3.entrySet().iterator();
                                                                        while (it.hasNext()) {
                                                                            Map.Entry entry = (Map.Entry) it.next();
                                                                            arrayList.add(oq.y.a((String) entry.getKey(), new CMSSignedData((byte[]) bVar11.a(iy.a.c(bVar12.baseCoder, (String) entry.getValue(), null, 2, null)))));
                                                                            it = it;
                                                                            iIntValue = iIntValue;
                                                                            obj4 = obj4;
                                                                        }
                                                                        int i69 = iIntValue;
                                                                        mapS = pq.v0.s(arrayList);
                                                                        v24.b bVar20 = bVar12.documentsContainerRepository;
                                                                        f24.i iVar2 = f24.i.STUDENT_CARD;
                                                                        aVar3.f209496d = vq.j.a(params3);
                                                                        aVar3.f209497e = r15;
                                                                        aVar3.f209498f = vq.j.a(bVar6);
                                                                        aVar3.f209499g = bVar11;
                                                                        aVar3.f209500h = vq.j.a(bArr3);
                                                                        aVar3.f209501j = bVar11;
                                                                        aVar3.f209502k = vq.j.a(secretKey6);
                                                                        aVar3.f209503l = vq.j.a(bArr13);
                                                                        aVar3.f209504m = vq.j.a(bArr12);
                                                                        aVar3.f209505n = vq.j.a(bArr11);
                                                                        aVar3.f209506p = vq.j.a(bArr6);
                                                                        aVar3.f209507q = vq.j.a(studentPackageData2);
                                                                        aVar3.f209508r = vq.j.a(cArr3);
                                                                        aVar3.f209509s = vq.j.a(certKeyPair3);
                                                                        aVar3.f209510t = str2;
                                                                        aVar3.f209511v = vq.j.a(map3);
                                                                        aVar3.f209512w = vq.j.a(mapS);
                                                                        aVar3.f209515z = i47;
                                                                        aVar3.A = i46;
                                                                        aVar3.B = i48;
                                                                        aVar3.C = i45;
                                                                        aVar3.D = i49;
                                                                        aVar3.E = i69;
                                                                        aVar3.H = 6;
                                                                        i55 = i69;
                                                                        i56 = i47;
                                                                        objQ = bVar20.q(str2, i55, mapS, null, iVar2, aVar3);
                                                                        aVar3 = aVar3;
                                                                        obj5 = obj4;
                                                                        if (objQ == obj5) {
                                                                            return obj5;
                                                                        }
                                                                        i57 = i56;
                                                                        objC2 = objQ;
                                                                        map4 = mapS;
                                                                        i58 = i48;
                                                                        i59 = i46;
                                                                        map5 = map3;
                                                                        bArr14 = bArr11;
                                                                        str3 = str2;
                                                                        i65 = i49;
                                                                        bVar13 = bVar11;
                                                                        r17 = r15;
                                                                        i66 = i55;
                                                                        bVar11.a((dx.i) objC2);
                                                                        k24.h hVar = bVar12.getStudentCardDataUC;
                                                                        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                                                        map6 = map4;
                                                                        aVar3.f209496d = vq.j.a(params3);
                                                                        aVar3.f209497e = r17;
                                                                        aVar3.f209498f = vq.j.a(bVar6);
                                                                        aVar3.f209499g = bVar13;
                                                                        aVar3.f209500h = vq.j.a(bArr3);
                                                                        aVar3.f209501j = bVar13;
                                                                        aVar3.f209502k = vq.j.a(secretKey6);
                                                                        aVar3.f209503l = vq.j.a(bArr13);
                                                                        aVar3.f209504m = vq.j.a(bArr12);
                                                                        aVar3.f209505n = vq.j.a(bArr14);
                                                                        aVar3.f209506p = vq.j.a(bArr6);
                                                                        aVar3.f209507q = vq.j.a(studentPackageData2);
                                                                        aVar3.f209508r = vq.j.a(cArr3);
                                                                        aVar3.f209509s = vq.j.a(certKeyPair3);
                                                                        aVar3.f209510t = str3;
                                                                        aVar3.f209511v = vq.j.a(map5);
                                                                        aVar3.f209512w = vq.j.a(map6);
                                                                        aVar3.f209515z = i57;
                                                                        aVar3.A = i59;
                                                                        aVar3.B = i58;
                                                                        aVar3.C = i45;
                                                                        aVar3.D = i65;
                                                                        aVar3.E = i66;
                                                                        aVar3.H = 7;
                                                                        objC2 = hVar.c(c1792a, aVar3);
                                                                        if (objC2 == obj5) {
                                                                            return obj5;
                                                                        }
                                                                        bVar14 = bVar13;
                                                                        map7 = map5;
                                                                        str4 = str3;
                                                                        cArr4 = cArr3;
                                                                        certKeyPair4 = certKeyPair3;
                                                                        r18 = r17;
                                                                        studentCardData = (StudentCardData) bVar13.a((dx.i) objC2);
                                                                        certKeyPair5 = certKeyPair4;
                                                                        cArr5 = cArr4;
                                                                        localDate = new fz.b.LocalDate(bVar12.dateConverter.l(studentCardData.getScope().getData().getExpireDate()));
                                                                        v24.b bVar21 = bVar12.documentsContainerRepository;
                                                                        aVar3.f209496d = vq.j.a(params3);
                                                                        aVar3.f209497e = r18;
                                                                        aVar3.f209498f = vq.j.a(bVar6);
                                                                        aVar3.f209499g = vq.j.a(bVar14);
                                                                        aVar3.f209500h = vq.j.a(bArr3);
                                                                        aVar3.f209501j = bVar14;
                                                                        aVar3.f209502k = vq.j.a(secretKey6);
                                                                        aVar3.f209503l = vq.j.a(bArr13);
                                                                        aVar3.f209504m = vq.j.a(bArr12);
                                                                        aVar3.f209505n = vq.j.a(bArr14);
                                                                        aVar3.f209506p = vq.j.a(bArr6);
                                                                        aVar3.f209507q = vq.j.a(studentPackageData2);
                                                                        aVar3.f209508r = vq.j.a(cArr5);
                                                                        aVar3.f209509s = vq.j.a(certKeyPair5);
                                                                        aVar3.f209510t = str4;
                                                                        aVar3.f209511v = vq.j.a(map7);
                                                                        aVar3.f209512w = vq.j.a(map6);
                                                                        aVar3.f209513x = vq.j.a(studentCardData);
                                                                        aVar3.f209514y = localDate;
                                                                        aVar3.f209515z = i57;
                                                                        aVar3.A = i59;
                                                                        aVar3.B = i58;
                                                                        aVar3.C = i45;
                                                                        aVar3.D = i65;
                                                                        aVar3.E = i66;
                                                                        aVar3.H = 8;
                                                                        objI = bVar21.i(str4, localDate, aVar3);
                                                                        if (objI == obj5) {
                                                                            return obj5;
                                                                        }
                                                                        studentCardData2 = studentCardData;
                                                                        objC2 = objI;
                                                                        map8 = map6;
                                                                        map9 = map7;
                                                                        cArr6 = cArr5;
                                                                        str5 = str4;
                                                                        localDate2 = localDate;
                                                                        bArr15 = bArr12;
                                                                        bVar15 = bVar14;
                                                                        r110 = r18;
                                                                        bVar14.a((dx.i) objC2);
                                                                        bVar16 = bVar12.containersInteractor;
                                                                        iVar = f24.i.STUDENT_CARD;
                                                                        aVar3.f209496d = vq.j.a(params3);
                                                                        aVar3.f209497e = r110;
                                                                        aVar3.f209498f = vq.j.a(bVar6);
                                                                        aVar3.f209499g = vq.j.a(bVar15);
                                                                        aVar3.f209500h = vq.j.a(bArr3);
                                                                        aVar3.f209501j = vq.j.a(secretKey6);
                                                                        aVar3.f209502k = vq.j.a(bArr13);
                                                                        aVar3.f209503l = vq.j.a(bArr15);
                                                                        aVar3.f209504m = vq.j.a(bArr14);
                                                                        aVar3.f209505n = vq.j.a(bArr6);
                                                                        aVar3.f209506p = vq.j.a(studentPackageData2);
                                                                        aVar3.f209507q = vq.j.a(cArr6);
                                                                        aVar3.f209508r = vq.j.a(certKeyPair5);
                                                                        aVar3.f209509s = vq.j.a(str5);
                                                                        aVar3.f209510t = vq.j.a(map9);
                                                                        aVar3.f209511v = vq.j.a(map8);
                                                                        aVar3.f209512w = vq.j.a(studentCardData2);
                                                                        aVar3.f209513x = vq.j.a(localDate2);
                                                                        aVar3.f209514y = null;
                                                                        aVar3.f209515z = i57;
                                                                        aVar3.A = i59;
                                                                        aVar3.B = i58;
                                                                        aVar3.C = i45;
                                                                        aVar3.D = i65;
                                                                        aVar3.E = i66;
                                                                        aVar3.H = 9;
                                                                        r15 = r110;
                                                                        if (bVar16.c(iVar, str5, localDate2, true, aVar3) == obj5) {
                                                                            return obj5;
                                                                        }
                                                                        bVar12.remoteLogger.F8("Saved document data for " + f24.i.STUDENT_CARD, px.d.a.GENERAL);
                                                                        return new dx.i.Right(oq.i0.f148189a);
                                                                    } catch (ex.c e15) {
                                                                        e = e15;
                                                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                                                    } catch (CancellationException e16) {
                                                                        e = e16;
                                                                        throw e;
                                                                    } catch (Exception e17) {
                                                                        e = e17;
                                                                        r25 = r15;
                                                                        px.f fVar = px.f.f163100a;
                                                                        message = e.getMessage();
                                                                        if (message == null) {
                                                                            message = "";
                                                                        }
                                                                        fVar.d(message, e, px.c.a(r25));
                                                                        iVarA = r25.a(e);
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
                                                            } catch (ex.c e18) {
                                                                e = e18;
                                                                bVar12 = this;
                                                                return new dx.i.Left((dx.b) ex.d.a(e));
                                                            } catch (CancellationException e19) {
                                                                e = e19;
                                                                bVar12 = this;
                                                                throw e;
                                                            } catch (Exception e25) {
                                                                e = e25;
                                                                bVar12 = this;
                                                                r25 = r15;
                                                                px.f fVar2 = px.f.f163100a;
                                                                message = e.getMessage();
                                                                if (message == null) {
                                                                    message = "";
                                                                }
                                                                fVar2.d(message, e, px.c.a(r25));
                                                                iVarA = r25.a(e);
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
                                                        } catch (ex.c e26) {
                                                            e = e26;
                                                            return new dx.i.Left((dx.b) ex.d.a(e));
                                                        } catch (CancellationException e27) {
                                                            e = e27;
                                                            throw e;
                                                        } catch (Exception e28) {
                                                            e = e28;
                                                            r25 = r15;
                                                            px.f fVar3 = px.f.f163100a;
                                                            message = e.getMessage();
                                                            if (message == null) {
                                                                message = "";
                                                            }
                                                            fVar3.d(message, e, px.c.a(r25));
                                                            iVarA = r25.a(e);
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
                                                    return obj4;
                                                } catch (ex.c e29) {
                                                    e = e29;
                                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                                } catch (CancellationException e35) {
                                                    e = e35;
                                                    throw e;
                                                } catch (Exception e36) {
                                                    e = e36;
                                                    r25 = r15;
                                                    px.f fVar4 = px.f.f163100a;
                                                    message = e.getMessage();
                                                    if (message == null) {
                                                        message = "";
                                                    }
                                                    fVar4.d(message, e, px.c.a(r25));
                                                    iVarA = r25.a(e);
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
                                        } catch (ex.c e37) {
                                            e = e37;
                                            return new dx.i.Left((dx.b) ex.d.a(e));
                                        } catch (CancellationException e38) {
                                            throw e38;
                                        } catch (Exception e39) {
                                            e = e39;
                                            px.f fVar5 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            fVar5.d(message, e, px.c.a(r25));
                                            iVarA = r25.a(e);
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
                                    return objE;
                                case 1:
                                    int i75 = aVar3.D;
                                    int i76 = aVar3.C;
                                    int i77 = aVar3.B;
                                    int i78 = aVar3.A;
                                    int i79 = aVar3.f209515z;
                                    aVar2 = (ex.b) aVar3.f209501j;
                                    byte[] bArr18 = (byte[]) aVar3.f209500h;
                                    bVar = (ex.b) aVar3.f209499g;
                                    ex.b bVar22 = (ex.b) aVar3.f209498f;
                                    dx.j jVar2 = (dx.j) aVar3.f209497e;
                                    params2 = (w24.a.Params) aVar3.f209496d;
                                    try {
                                        oq.u.b(objC2);
                                        i15 = i75;
                                        r25 = jVar2;
                                        bVar2 = bVar22;
                                        bArr = bArr18;
                                        i19 = i79;
                                        i18 = i78;
                                        i17 = i77;
                                        i16 = i76;
                                        secretKey = (SecretKey) aVar2.a((dx.i) objC2);
                                        bVar3 = bVar2;
                                        bVar17.remoteLogger.F8("Student card package AES secret key generated successfully", px.d.a.GENERAL);
                                        iy.g gVar2 = bVar17.cipherAes;
                                        params3 = params2;
                                        iy.h.a.C2298a c2298a2 = new iy.h.a.C2298a(new iy.r.c(16, iy.q.Suffix), 17);
                                        aVar3.f209496d = vq.j.a(params3);
                                        aVar3.f209497e = r25;
                                        aVar3.f209498f = vq.j.a(bVar3);
                                        aVar3.f209499g = bVar;
                                        aVar3.f209500h = vq.j.a(bArr);
                                        aVar3.f209501j = bVar;
                                        aVar3.f209502k = vq.j.a(secretKey);
                                        aVar3.f209515z = i19;
                                        aVar3.A = i18;
                                        aVar3.B = i17;
                                        aVar3.C = i16;
                                        aVar3.D = i15;
                                        aVar3.H = 2;
                                        objD = gVar2.d(bArr, secretKey, c2298a2, aVar3);
                                        if (objD != objE) {
                                            return objE;
                                        }
                                        bVar4 = bVar3;
                                        r15 = r25;
                                        i25 = i19;
                                        bVar5 = bVar;
                                        secretKey2 = secretKey;
                                        objC2 = objD;
                                        r19 = r25;
                                        bArr2 = (byte[]) bVar.a((dx.i) objC2);
                                        bVar17 = this;
                                        px.d dVar2 = bVar17.remoteLogger;
                                        secretKey3 = secretKey2;
                                        px.d.a aVar5 = px.d.a.GENERAL;
                                        dVar2.F8("Student card package decrypted successfully", aVar5);
                                        bArr3 = bArr;
                                        StudentPackageData studentPackageData4 = (StudentPackageData) bVar17.jsonSerializer.a(new String(bArr2, StandardCharsets.UTF_8), fr.q0.n(StudentPackageData.class));
                                        studentPackageData = studentPackageData4;
                                        bVar6 = bVar4;
                                        bArr4 = (byte[]) bVar5.a(iy.a.c(bVar17.baseCoder, studentPackageData4.getPkcs12Data(), null, 2, null));
                                        bArr5 = (byte[]) bVar5.a(iy.a.c(bVar17.baseCoder, studentPackageData.getPkcs12Pass(), null, 2, null));
                                        i26 = i15;
                                        byte[] bArr19 = (byte[]) bVar5.a(iy.a.c(bVar17.baseCoder, studentPackageData.getSignedDataList(), null, 2, null));
                                        ay.j jVar3 = bVar17.jsonSerializer;
                                        String str7 = new String(bArr19, fu.d.UTF_8);
                                        bArr6 = bArr19;
                                        mr.r.Companion companion2 = mr.r.INSTANCE;
                                        i27 = i16;
                                        int i610 = i17;
                                        map = (Map) jVar3.a(str7, fr.q0.p(Map.class, companion2.d(fr.q0.n(r19)), companion2.d(fr.q0.g(r19))));
                                        bVar17.remoteLogger.F8("Student card package data and certificate decoded successfully", aVar5);
                                        cArr = (char[]) bVar5.a(bVar17.bytesConverter.c(bArr5, iy.b.a.f97723a));
                                        bVar17.remoteLogger.F8("PKCS12 data and password decoded successfully", aVar5);
                                        iy.v vVar2 = bVar17.pkcs12Manager;
                                        iy.a0 a0VarF2 = iy.c0.f(bArr4);
                                        iy.b0 b0Var2 = new iy.b0(cArr);
                                        aVar3.f209496d = vq.j.a(params3);
                                        aVar3.f209497e = r15;
                                        aVar3.f209498f = vq.j.a(bVar6);
                                        aVar3.f209499g = bVar5;
                                        aVar3.f209500h = vq.j.a(bArr3);
                                        aVar3.f209501j = bVar5;
                                        aVar3.f209502k = vq.j.a(secretKey3);
                                        aVar3.f209503l = vq.j.a(bArr2);
                                        aVar3.f209504m = bArr4;
                                        aVar3.f209505n = vq.j.a(bArr5);
                                        aVar3.f209506p = vq.j.a(bArr6);
                                        aVar3.f209507q = vq.j.a(studentPackageData);
                                        aVar3.f209508r = cArr;
                                        aVar3.f209509s = map;
                                        aVar3.f209515z = i25;
                                        aVar3.A = i18;
                                        i28 = i610;
                                        aVar3.B = i28;
                                        bVar7 = bVar5;
                                        aVar3.C = i27;
                                        aVar3.D = i26;
                                        aVar3.H = 3;
                                        objA = vVar2.a("mlWork", a0VarF2, b0Var2, aVar3);
                                        obj3 = objE;
                                        if (objA == obj3) {
                                            return obj3;
                                        }
                                        bArr7 = bArr5;
                                        i29 = i25;
                                        bVar8 = bVar7;
                                        i35 = i26;
                                        bArr8 = bArr2;
                                        objC2 = objA;
                                        i36 = i18;
                                        bVar9 = bVar8;
                                        i37 = i27;
                                        r16 = r15;
                                        certKeyPair = (CertKeyPair) bVar9.a((dx.i) objC2);
                                        bArr9 = bArr7;
                                        string = certKeyPair.getCertificate().getSerialNumber().toString(16);
                                        c2 c2Var2 = bVar17.isCurrentUserPeselUC;
                                        c2.Params params6 = new c2.Params(certKeyPair.getCertificate());
                                        aVar3.f209496d = vq.j.a(params3);
                                        aVar3.f209497e = r16;
                                        aVar3.f209498f = vq.j.a(bVar6);
                                        aVar3.f209499g = bVar8;
                                        aVar3.f209500h = vq.j.a(bArr3);
                                        aVar3.f209501j = vq.j.a(secretKey3);
                                        aVar3.f209502k = vq.j.a(bArr8);
                                        aVar3.f209503l = bArr4;
                                        aVar3.f209504m = vq.j.a(bArr9);
                                        aVar3.f209505n = vq.j.a(bArr6);
                                        aVar3.f209506p = vq.j.a(studentPackageData);
                                        aVar3.f209507q = cArr;
                                        aVar3.f209508r = vq.j.a(certKeyPair);
                                        aVar3.f209509s = string;
                                        aVar3.f209510t = map;
                                        aVar3.f209515z = i29;
                                        aVar3.A = i36;
                                        aVar3.B = i28;
                                        aVar3.C = i37;
                                        aVar3.D = i35;
                                        aVar3.H = 4;
                                        objC = c2Var2.c(params6, aVar3);
                                        obj4 = obj3;
                                        if (objC != obj4) {
                                            ex.b bVar110 = bVar8;
                                            str = string;
                                            bVar10 = bVar110;
                                            map2 = map;
                                            cArr2 = cArr;
                                            i38 = i37;
                                            i39 = i28;
                                            bArr10 = bArr9;
                                            certKeyPair2 = certKeyPair;
                                            objC2 = objC;
                                            secretKey4 = secretKey3;
                                            r15 = r16;
                                            if (!((Boolean) objC2).booleanValue()) {
                                                this.remoteLogger.F8("Pesel from new certificate does not match current user's pesel", px.d.a.ERROR);
                                                bVar10.b(this.containersErrorInteractor.b());
                                                throw new oq.g();
                                            }
                                            secretKey5 = secretKey4;
                                            bArr11 = bArr10;
                                            bArr12 = bArr4;
                                            this.remoteLogger.F8("Pesel from new certificate matches current user's pesel", px.d.a.GENERAL);
                                            k24.o oVar2 = this.saveUserCertificateUC;
                                            certKeyPair3 = certKeyPair2;
                                            k24.o.Params params7 = new k24.o.Params(f24.c.UNIVERSITY, new iy.b0(new char[0]), iy.c0.f(bArr12), iy.c0.h(cArr2));
                                            aVar3.f209496d = vq.j.a(params3);
                                            aVar3.f209497e = r15;
                                            aVar3.f209498f = vq.j.a(bVar6);
                                            aVar3.f209499g = bVar10;
                                            aVar3.f209500h = vq.j.a(bArr3);
                                            aVar3.f209501j = bVar10;
                                            aVar3.f209502k = vq.j.a(secretKey5);
                                            aVar3.f209503l = vq.j.a(bArr8);
                                            aVar3.f209504m = vq.j.a(bArr12);
                                            aVar3.f209505n = vq.j.a(bArr11);
                                            aVar3.f209506p = vq.j.a(bArr6);
                                            aVar3.f209507q = vq.j.a(studentPackageData);
                                            aVar3.f209508r = vq.j.a(cArr2);
                                            aVar3.f209509s = vq.j.a(certKeyPair3);
                                            aVar3.f209510t = str;
                                            aVar3.f209511v = map2;
                                            aVar3.f209515z = i29;
                                            aVar3.A = i36;
                                            aVar3.B = i39;
                                            aVar3.C = i38;
                                            aVar3.D = i35;
                                            aVar3.H = 5;
                                            objC2 = oVar2.c(params7, aVar3);
                                            obj4 = obj4;
                                            if (objC2 == obj4) {
                                                bVar11 = bVar10;
                                                i45 = i38;
                                                i46 = i36;
                                                i47 = i29;
                                                studentPackageData2 = studentPackageData;
                                                i48 = i39;
                                                cArr3 = cArr2;
                                                bArr13 = bArr8;
                                                secretKey6 = secretKey5;
                                                str2 = str;
                                                i49 = i35;
                                                r15 = r15;
                                                map3 = map2;
                                                iIntValue = ((Number) bVar10.a((dx.i) objC2)).intValue();
                                                bVar12 = this;
                                                bVar12.remoteLogger.F8("New certificate saved with id: " + iIntValue, px.d.a.GENERAL);
                                                arrayList = new ArrayList(map3.size());
                                                it = map3.entrySet().iterator();
                                                while (it.hasNext()) {
                                                    Map.Entry entry2 = (Map.Entry) it.next();
                                                    arrayList.add(oq.y.a((String) entry2.getKey(), new CMSSignedData((byte[]) bVar11.a(iy.a.c(bVar12.baseCoder, (String) entry2.getValue(), null, 2, null)))));
                                                    it = it;
                                                    iIntValue = iIntValue;
                                                    obj4 = obj4;
                                                }
                                                int i611 = iIntValue;
                                                mapS = pq.v0.s(arrayList);
                                                v24.b bVar23 = bVar12.documentsContainerRepository;
                                                f24.i iVar3 = f24.i.STUDENT_CARD;
                                                aVar3.f209496d = vq.j.a(params3);
                                                aVar3.f209497e = r15;
                                                aVar3.f209498f = vq.j.a(bVar6);
                                                aVar3.f209499g = bVar11;
                                                aVar3.f209500h = vq.j.a(bArr3);
                                                aVar3.f209501j = bVar11;
                                                aVar3.f209502k = vq.j.a(secretKey6);
                                                aVar3.f209503l = vq.j.a(bArr13);
                                                aVar3.f209504m = vq.j.a(bArr12);
                                                aVar3.f209505n = vq.j.a(bArr11);
                                                aVar3.f209506p = vq.j.a(bArr6);
                                                aVar3.f209507q = vq.j.a(studentPackageData2);
                                                aVar3.f209508r = vq.j.a(cArr3);
                                                aVar3.f209509s = vq.j.a(certKeyPair3);
                                                aVar3.f209510t = str2;
                                                aVar3.f209511v = vq.j.a(map3);
                                                aVar3.f209512w = vq.j.a(mapS);
                                                aVar3.f209515z = i47;
                                                aVar3.A = i46;
                                                aVar3.B = i48;
                                                aVar3.C = i45;
                                                aVar3.D = i49;
                                                aVar3.E = i611;
                                                aVar3.H = 6;
                                                i55 = i611;
                                                i56 = i47;
                                                objQ = bVar23.q(str2, i55, mapS, null, iVar3, aVar3);
                                                aVar3 = aVar3;
                                                obj5 = obj4;
                                                if (objQ == obj5) {
                                                    return obj5;
                                                }
                                                i57 = i56;
                                                objC2 = objQ;
                                                map4 = mapS;
                                                i58 = i48;
                                                i59 = i46;
                                                map5 = map3;
                                                bArr14 = bArr11;
                                                str3 = str2;
                                                i65 = i49;
                                                bVar13 = bVar11;
                                                r17 = r15;
                                                i66 = i55;
                                                bVar11.a((dx.i) objC2);
                                                k24.h hVar2 = bVar12.getStudentCardDataUC;
                                                gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                                map6 = map4;
                                                aVar3.f209496d = vq.j.a(params3);
                                                aVar3.f209497e = r17;
                                                aVar3.f209498f = vq.j.a(bVar6);
                                                aVar3.f209499g = bVar13;
                                                aVar3.f209500h = vq.j.a(bArr3);
                                                aVar3.f209501j = bVar13;
                                                aVar3.f209502k = vq.j.a(secretKey6);
                                                aVar3.f209503l = vq.j.a(bArr13);
                                                aVar3.f209504m = vq.j.a(bArr12);
                                                aVar3.f209505n = vq.j.a(bArr14);
                                                aVar3.f209506p = vq.j.a(bArr6);
                                                aVar3.f209507q = vq.j.a(studentPackageData2);
                                                aVar3.f209508r = vq.j.a(cArr3);
                                                aVar3.f209509s = vq.j.a(certKeyPair3);
                                                aVar3.f209510t = str3;
                                                aVar3.f209511v = vq.j.a(map5);
                                                aVar3.f209512w = vq.j.a(map6);
                                                aVar3.f209515z = i57;
                                                aVar3.A = i59;
                                                aVar3.B = i58;
                                                aVar3.C = i45;
                                                aVar3.D = i65;
                                                aVar3.E = i66;
                                                aVar3.H = 7;
                                                objC2 = hVar2.c(c1792a2, aVar3);
                                                if (objC2 == obj5) {
                                                    return obj5;
                                                }
                                                bVar14 = bVar13;
                                                map7 = map5;
                                                str4 = str3;
                                                cArr4 = cArr3;
                                                certKeyPair4 = certKeyPair3;
                                                r18 = r17;
                                                studentCardData = (StudentCardData) bVar13.a((dx.i) objC2);
                                                certKeyPair5 = certKeyPair4;
                                                cArr5 = cArr4;
                                                localDate = new fz.b.LocalDate(bVar12.dateConverter.l(studentCardData.getScope().getData().getExpireDate()));
                                                v24.b bVar24 = bVar12.documentsContainerRepository;
                                                aVar3.f209496d = vq.j.a(params3);
                                                aVar3.f209497e = r18;
                                                aVar3.f209498f = vq.j.a(bVar6);
                                                aVar3.f209499g = vq.j.a(bVar14);
                                                aVar3.f209500h = vq.j.a(bArr3);
                                                aVar3.f209501j = bVar14;
                                                aVar3.f209502k = vq.j.a(secretKey6);
                                                aVar3.f209503l = vq.j.a(bArr13);
                                                aVar3.f209504m = vq.j.a(bArr12);
                                                aVar3.f209505n = vq.j.a(bArr14);
                                                aVar3.f209506p = vq.j.a(bArr6);
                                                aVar3.f209507q = vq.j.a(studentPackageData2);
                                                aVar3.f209508r = vq.j.a(cArr5);
                                                aVar3.f209509s = vq.j.a(certKeyPair5);
                                                aVar3.f209510t = str4;
                                                aVar3.f209511v = vq.j.a(map7);
                                                aVar3.f209512w = vq.j.a(map6);
                                                aVar3.f209513x = vq.j.a(studentCardData);
                                                aVar3.f209514y = localDate;
                                                aVar3.f209515z = i57;
                                                aVar3.A = i59;
                                                aVar3.B = i58;
                                                aVar3.C = i45;
                                                aVar3.D = i65;
                                                aVar3.E = i66;
                                                aVar3.H = 8;
                                                objI = bVar24.i(str4, localDate, aVar3);
                                                if (objI == obj5) {
                                                    return obj5;
                                                }
                                                studentCardData2 = studentCardData;
                                                objC2 = objI;
                                                map8 = map6;
                                                map9 = map7;
                                                cArr6 = cArr5;
                                                str5 = str4;
                                                localDate2 = localDate;
                                                bArr15 = bArr12;
                                                bVar15 = bVar14;
                                                r110 = r18;
                                                bVar14.a((dx.i) objC2);
                                                bVar16 = bVar12.containersInteractor;
                                                iVar = f24.i.STUDENT_CARD;
                                                aVar3.f209496d = vq.j.a(params3);
                                                aVar3.f209497e = r110;
                                                aVar3.f209498f = vq.j.a(bVar6);
                                                aVar3.f209499g = vq.j.a(bVar15);
                                                aVar3.f209500h = vq.j.a(bArr3);
                                                aVar3.f209501j = vq.j.a(secretKey6);
                                                aVar3.f209502k = vq.j.a(bArr13);
                                                aVar3.f209503l = vq.j.a(bArr15);
                                                aVar3.f209504m = vq.j.a(bArr14);
                                                aVar3.f209505n = vq.j.a(bArr6);
                                                aVar3.f209506p = vq.j.a(studentPackageData2);
                                                aVar3.f209507q = vq.j.a(cArr6);
                                                aVar3.f209508r = vq.j.a(certKeyPair5);
                                                aVar3.f209509s = vq.j.a(str5);
                                                aVar3.f209510t = vq.j.a(map9);
                                                aVar3.f209511v = vq.j.a(map8);
                                                aVar3.f209512w = vq.j.a(studentCardData2);
                                                aVar3.f209513x = vq.j.a(localDate2);
                                                aVar3.f209514y = null;
                                                aVar3.f209515z = i57;
                                                aVar3.A = i59;
                                                aVar3.B = i58;
                                                aVar3.C = i45;
                                                aVar3.D = i65;
                                                aVar3.E = i66;
                                                aVar3.H = 9;
                                                r15 = r110;
                                                if (bVar16.c(iVar, str5, localDate2, true, aVar3) == obj5) {
                                                    return obj5;
                                                }
                                                bVar12.remoteLogger.F8("Saved document data for " + f24.i.STUDENT_CARD, px.d.a.GENERAL);
                                                return new dx.i.Right(oq.i0.f148189a);
                                            }
                                        }
                                        return obj4;
                                    } catch (ex.c e45) {
                                        e = e45;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e46) {
                                        throw e46;
                                    } catch (Exception e47) {
                                        e = e47;
                                        r25 = jVar2;
                                        px.f fVar6 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar6.d(message, e, px.c.a(r25));
                                        iVarA = r25.a(e);
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
                                    i15 = aVar3.D;
                                    i16 = aVar3.C;
                                    i17 = aVar3.B;
                                    i18 = aVar3.A;
                                    i25 = aVar3.f209515z;
                                    secretKey2 = (SecretKey) aVar3.f209502k;
                                    bVar = (ex.b) aVar3.f209501j;
                                    bArr = (byte[]) aVar3.f209500h;
                                    ex.b bVar25 = (ex.b) aVar3.f209499g;
                                    bVar4 = (ex.b) aVar3.f209498f;
                                    r15 = (dx.j) aVar3.f209497e;
                                    r19 = r25;
                                    w24.a.Params params8 = (w24.a.Params) aVar3.f209496d;
                                    try {
                                        oq.u.b(objC2);
                                        params3 = params8;
                                        bVar5 = bVar25;
                                        r15 = r15;
                                        bArr2 = (byte[]) bVar.a((dx.i) objC2);
                                        bVar17 = this;
                                        px.d dVar3 = bVar17.remoteLogger;
                                        secretKey3 = secretKey2;
                                        px.d.a aVar6 = px.d.a.GENERAL;
                                        dVar3.F8("Student card package decrypted successfully", aVar6);
                                        bArr3 = bArr;
                                        StudentPackageData studentPackageData5 = (StudentPackageData) bVar17.jsonSerializer.a(new String(bArr2, StandardCharsets.UTF_8), fr.q0.n(StudentPackageData.class));
                                        studentPackageData = studentPackageData5;
                                        bVar6 = bVar4;
                                        bArr4 = (byte[]) bVar5.a(iy.a.c(bVar17.baseCoder, studentPackageData5.getPkcs12Data(), null, 2, null));
                                        bArr5 = (byte[]) bVar5.a(iy.a.c(bVar17.baseCoder, studentPackageData.getPkcs12Pass(), null, 2, null));
                                        i26 = i15;
                                        byte[] bArr110 = (byte[]) bVar5.a(iy.a.c(bVar17.baseCoder, studentPackageData.getSignedDataList(), null, 2, null));
                                        ay.j jVar4 = bVar17.jsonSerializer;
                                        String str8 = new String(bArr110, fu.d.UTF_8);
                                        bArr6 = bArr110;
                                        mr.r.Companion companion3 = mr.r.INSTANCE;
                                        i27 = i16;
                                        int i612 = i17;
                                        map = (Map) jVar4.a(str8, fr.q0.p(Map.class, companion3.d(fr.q0.n(r19)), companion3.d(fr.q0.g(r19))));
                                        bVar17.remoteLogger.F8("Student card package data and certificate decoded successfully", aVar6);
                                        cArr = (char[]) bVar5.a(bVar17.bytesConverter.c(bArr5, iy.b.a.f97723a));
                                        bVar17.remoteLogger.F8("PKCS12 data and password decoded successfully", aVar6);
                                        iy.v vVar3 = bVar17.pkcs12Manager;
                                        iy.a0 a0VarF3 = iy.c0.f(bArr4);
                                        iy.b0 b0Var3 = new iy.b0(cArr);
                                        aVar3.f209496d = vq.j.a(params3);
                                        aVar3.f209497e = r15;
                                        aVar3.f209498f = vq.j.a(bVar6);
                                        aVar3.f209499g = bVar5;
                                        aVar3.f209500h = vq.j.a(bArr3);
                                        aVar3.f209501j = bVar5;
                                        aVar3.f209502k = vq.j.a(secretKey3);
                                        aVar3.f209503l = vq.j.a(bArr2);
                                        aVar3.f209504m = bArr4;
                                        aVar3.f209505n = vq.j.a(bArr5);
                                        aVar3.f209506p = vq.j.a(bArr6);
                                        aVar3.f209507q = vq.j.a(studentPackageData);
                                        aVar3.f209508r = cArr;
                                        aVar3.f209509s = map;
                                        aVar3.f209515z = i25;
                                        aVar3.A = i18;
                                        i28 = i612;
                                        aVar3.B = i28;
                                        bVar7 = bVar5;
                                        aVar3.C = i27;
                                        aVar3.D = i26;
                                        aVar3.H = 3;
                                        objA = vVar3.a("mlWork", a0VarF3, b0Var3, aVar3);
                                        obj3 = objE;
                                        if (objA == obj3) {
                                            return obj3;
                                        }
                                        bArr7 = bArr5;
                                        i29 = i25;
                                        bVar8 = bVar7;
                                        i35 = i26;
                                        bArr8 = bArr2;
                                        objC2 = objA;
                                        i36 = i18;
                                        bVar9 = bVar8;
                                        i37 = i27;
                                        r16 = r15;
                                        certKeyPair = (CertKeyPair) bVar9.a((dx.i) objC2);
                                        bArr9 = bArr7;
                                        string = certKeyPair.getCertificate().getSerialNumber().toString(16);
                                        c2 c2Var3 = bVar17.isCurrentUserPeselUC;
                                        c2.Params params9 = new c2.Params(certKeyPair.getCertificate());
                                        aVar3.f209496d = vq.j.a(params3);
                                        aVar3.f209497e = r16;
                                        aVar3.f209498f = vq.j.a(bVar6);
                                        aVar3.f209499g = bVar8;
                                        aVar3.f209500h = vq.j.a(bArr3);
                                        aVar3.f209501j = vq.j.a(secretKey3);
                                        aVar3.f209502k = vq.j.a(bArr8);
                                        aVar3.f209503l = bArr4;
                                        aVar3.f209504m = vq.j.a(bArr9);
                                        aVar3.f209505n = vq.j.a(bArr6);
                                        aVar3.f209506p = vq.j.a(studentPackageData);
                                        aVar3.f209507q = cArr;
                                        aVar3.f209508r = vq.j.a(certKeyPair);
                                        aVar3.f209509s = string;
                                        aVar3.f209510t = map;
                                        aVar3.f209515z = i29;
                                        aVar3.A = i36;
                                        aVar3.B = i28;
                                        aVar3.C = i37;
                                        aVar3.D = i35;
                                        aVar3.H = 4;
                                        objC = c2Var3.c(params9, aVar3);
                                        obj4 = obj3;
                                        if (objC != obj4) {
                                            ex.b bVar111 = bVar8;
                                            str = string;
                                            bVar10 = bVar111;
                                            map2 = map;
                                            cArr2 = cArr;
                                            i38 = i37;
                                            i39 = i28;
                                            bArr10 = bArr9;
                                            certKeyPair2 = certKeyPair;
                                            objC2 = objC;
                                            secretKey4 = secretKey3;
                                            r15 = r16;
                                            if (!((Boolean) objC2).booleanValue()) {
                                                this.remoteLogger.F8("Pesel from new certificate does not match current user's pesel", px.d.a.ERROR);
                                                bVar10.b(this.containersErrorInteractor.b());
                                                throw new oq.g();
                                            }
                                            secretKey5 = secretKey4;
                                            bArr11 = bArr10;
                                            bArr12 = bArr4;
                                            this.remoteLogger.F8("Pesel from new certificate matches current user's pesel", px.d.a.GENERAL);
                                            k24.o oVar3 = this.saveUserCertificateUC;
                                            certKeyPair3 = certKeyPair2;
                                            k24.o.Params params10 = new k24.o.Params(f24.c.UNIVERSITY, new iy.b0(new char[0]), iy.c0.f(bArr12), iy.c0.h(cArr2));
                                            aVar3.f209496d = vq.j.a(params3);
                                            aVar3.f209497e = r15;
                                            aVar3.f209498f = vq.j.a(bVar6);
                                            aVar3.f209499g = bVar10;
                                            aVar3.f209500h = vq.j.a(bArr3);
                                            aVar3.f209501j = bVar10;
                                            aVar3.f209502k = vq.j.a(secretKey5);
                                            aVar3.f209503l = vq.j.a(bArr8);
                                            aVar3.f209504m = vq.j.a(bArr12);
                                            aVar3.f209505n = vq.j.a(bArr11);
                                            aVar3.f209506p = vq.j.a(bArr6);
                                            aVar3.f209507q = vq.j.a(studentPackageData);
                                            aVar3.f209508r = vq.j.a(cArr2);
                                            aVar3.f209509s = vq.j.a(certKeyPair3);
                                            aVar3.f209510t = str;
                                            aVar3.f209511v = map2;
                                            aVar3.f209515z = i29;
                                            aVar3.A = i36;
                                            aVar3.B = i39;
                                            aVar3.C = i38;
                                            aVar3.D = i35;
                                            aVar3.H = 5;
                                            objC2 = oVar3.c(params10, aVar3);
                                            obj4 = obj4;
                                            if (objC2 == obj4) {
                                                bVar11 = bVar10;
                                                i45 = i38;
                                                i46 = i36;
                                                i47 = i29;
                                                studentPackageData2 = studentPackageData;
                                                i48 = i39;
                                                cArr3 = cArr2;
                                                bArr13 = bArr8;
                                                secretKey6 = secretKey5;
                                                str2 = str;
                                                i49 = i35;
                                                r15 = r15;
                                                map3 = map2;
                                                iIntValue = ((Number) bVar10.a((dx.i) objC2)).intValue();
                                                bVar12 = this;
                                                bVar12.remoteLogger.F8("New certificate saved with id: " + iIntValue, px.d.a.GENERAL);
                                                arrayList = new ArrayList(map3.size());
                                                it = map3.entrySet().iterator();
                                                while (it.hasNext()) {
                                                    Map.Entry entry3 = (Map.Entry) it.next();
                                                    arrayList.add(oq.y.a((String) entry3.getKey(), new CMSSignedData((byte[]) bVar11.a(iy.a.c(bVar12.baseCoder, (String) entry3.getValue(), null, 2, null)))));
                                                    it = it;
                                                    iIntValue = iIntValue;
                                                    obj4 = obj4;
                                                }
                                                int i613 = iIntValue;
                                                mapS = pq.v0.s(arrayList);
                                                v24.b bVar26 = bVar12.documentsContainerRepository;
                                                f24.i iVar4 = f24.i.STUDENT_CARD;
                                                aVar3.f209496d = vq.j.a(params3);
                                                aVar3.f209497e = r15;
                                                aVar3.f209498f = vq.j.a(bVar6);
                                                aVar3.f209499g = bVar11;
                                                aVar3.f209500h = vq.j.a(bArr3);
                                                aVar3.f209501j = bVar11;
                                                aVar3.f209502k = vq.j.a(secretKey6);
                                                aVar3.f209503l = vq.j.a(bArr13);
                                                aVar3.f209504m = vq.j.a(bArr12);
                                                aVar3.f209505n = vq.j.a(bArr11);
                                                aVar3.f209506p = vq.j.a(bArr6);
                                                aVar3.f209507q = vq.j.a(studentPackageData2);
                                                aVar3.f209508r = vq.j.a(cArr3);
                                                aVar3.f209509s = vq.j.a(certKeyPair3);
                                                aVar3.f209510t = str2;
                                                aVar3.f209511v = vq.j.a(map3);
                                                aVar3.f209512w = vq.j.a(mapS);
                                                aVar3.f209515z = i47;
                                                aVar3.A = i46;
                                                aVar3.B = i48;
                                                aVar3.C = i45;
                                                aVar3.D = i49;
                                                aVar3.E = i613;
                                                aVar3.H = 6;
                                                i55 = i613;
                                                i56 = i47;
                                                objQ = bVar26.q(str2, i55, mapS, null, iVar4, aVar3);
                                                aVar3 = aVar3;
                                                obj5 = obj4;
                                                if (objQ == obj5) {
                                                    return obj5;
                                                }
                                                i57 = i56;
                                                objC2 = objQ;
                                                map4 = mapS;
                                                i58 = i48;
                                                i59 = i46;
                                                map5 = map3;
                                                bArr14 = bArr11;
                                                str3 = str2;
                                                i65 = i49;
                                                bVar13 = bVar11;
                                                r17 = r15;
                                                i66 = i55;
                                                bVar11.a((dx.i) objC2);
                                                k24.h hVar3 = bVar12.getStudentCardDataUC;
                                                gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                                                map6 = map4;
                                                aVar3.f209496d = vq.j.a(params3);
                                                aVar3.f209497e = r17;
                                                aVar3.f209498f = vq.j.a(bVar6);
                                                aVar3.f209499g = bVar13;
                                                aVar3.f209500h = vq.j.a(bArr3);
                                                aVar3.f209501j = bVar13;
                                                aVar3.f209502k = vq.j.a(secretKey6);
                                                aVar3.f209503l = vq.j.a(bArr13);
                                                aVar3.f209504m = vq.j.a(bArr12);
                                                aVar3.f209505n = vq.j.a(bArr14);
                                                aVar3.f209506p = vq.j.a(bArr6);
                                                aVar3.f209507q = vq.j.a(studentPackageData2);
                                                aVar3.f209508r = vq.j.a(cArr3);
                                                aVar3.f209509s = vq.j.a(certKeyPair3);
                                                aVar3.f209510t = str3;
                                                aVar3.f209511v = vq.j.a(map5);
                                                aVar3.f209512w = vq.j.a(map6);
                                                aVar3.f209515z = i57;
                                                aVar3.A = i59;
                                                aVar3.B = i58;
                                                aVar3.C = i45;
                                                aVar3.D = i65;
                                                aVar3.E = i66;
                                                aVar3.H = 7;
                                                objC2 = hVar3.c(c1792a3, aVar3);
                                                if (objC2 == obj5) {
                                                    return obj5;
                                                }
                                                bVar14 = bVar13;
                                                map7 = map5;
                                                str4 = str3;
                                                cArr4 = cArr3;
                                                certKeyPair4 = certKeyPair3;
                                                r18 = r17;
                                                studentCardData = (StudentCardData) bVar13.a((dx.i) objC2);
                                                certKeyPair5 = certKeyPair4;
                                                cArr5 = cArr4;
                                                localDate = new fz.b.LocalDate(bVar12.dateConverter.l(studentCardData.getScope().getData().getExpireDate()));
                                                v24.b bVar27 = bVar12.documentsContainerRepository;
                                                aVar3.f209496d = vq.j.a(params3);
                                                aVar3.f209497e = r18;
                                                aVar3.f209498f = vq.j.a(bVar6);
                                                aVar3.f209499g = vq.j.a(bVar14);
                                                aVar3.f209500h = vq.j.a(bArr3);
                                                aVar3.f209501j = bVar14;
                                                aVar3.f209502k = vq.j.a(secretKey6);
                                                aVar3.f209503l = vq.j.a(bArr13);
                                                aVar3.f209504m = vq.j.a(bArr12);
                                                aVar3.f209505n = vq.j.a(bArr14);
                                                aVar3.f209506p = vq.j.a(bArr6);
                                                aVar3.f209507q = vq.j.a(studentPackageData2);
                                                aVar3.f209508r = vq.j.a(cArr5);
                                                aVar3.f209509s = vq.j.a(certKeyPair5);
                                                aVar3.f209510t = str4;
                                                aVar3.f209511v = vq.j.a(map7);
                                                aVar3.f209512w = vq.j.a(map6);
                                                aVar3.f209513x = vq.j.a(studentCardData);
                                                aVar3.f209514y = localDate;
                                                aVar3.f209515z = i57;
                                                aVar3.A = i59;
                                                aVar3.B = i58;
                                                aVar3.C = i45;
                                                aVar3.D = i65;
                                                aVar3.E = i66;
                                                aVar3.H = 8;
                                                objI = bVar27.i(str4, localDate, aVar3);
                                                if (objI == obj5) {
                                                    return obj5;
                                                }
                                                studentCardData2 = studentCardData;
                                                objC2 = objI;
                                                map8 = map6;
                                                map9 = map7;
                                                cArr6 = cArr5;
                                                str5 = str4;
                                                localDate2 = localDate;
                                                bArr15 = bArr12;
                                                bVar15 = bVar14;
                                                r110 = r18;
                                                bVar14.a((dx.i) objC2);
                                                bVar16 = bVar12.containersInteractor;
                                                iVar = f24.i.STUDENT_CARD;
                                                aVar3.f209496d = vq.j.a(params3);
                                                aVar3.f209497e = r110;
                                                aVar3.f209498f = vq.j.a(bVar6);
                                                aVar3.f209499g = vq.j.a(bVar15);
                                                aVar3.f209500h = vq.j.a(bArr3);
                                                aVar3.f209501j = vq.j.a(secretKey6);
                                                aVar3.f209502k = vq.j.a(bArr13);
                                                aVar3.f209503l = vq.j.a(bArr15);
                                                aVar3.f209504m = vq.j.a(bArr14);
                                                aVar3.f209505n = vq.j.a(bArr6);
                                                aVar3.f209506p = vq.j.a(studentPackageData2);
                                                aVar3.f209507q = vq.j.a(cArr6);
                                                aVar3.f209508r = vq.j.a(certKeyPair5);
                                                aVar3.f209509s = vq.j.a(str5);
                                                aVar3.f209510t = vq.j.a(map9);
                                                aVar3.f209511v = vq.j.a(map8);
                                                aVar3.f209512w = vq.j.a(studentCardData2);
                                                aVar3.f209513x = vq.j.a(localDate2);
                                                aVar3.f209514y = null;
                                                aVar3.f209515z = i57;
                                                aVar3.A = i59;
                                                aVar3.B = i58;
                                                aVar3.C = i45;
                                                aVar3.D = i65;
                                                aVar3.E = i66;
                                                aVar3.H = 9;
                                                r15 = r110;
                                                if (bVar16.c(iVar, str5, localDate2, true, aVar3) == obj5) {
                                                    return obj5;
                                                }
                                                bVar12.remoteLogger.F8("Saved document data for " + f24.i.STUDENT_CARD, px.d.a.GENERAL);
                                                return new dx.i.Right(oq.i0.f148189a);
                                            }
                                        }
                                        return obj4;
                                    } catch (ex.c e48) {
                                        e = e48;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e49) {
                                        e = e49;
                                        throw e;
                                    } catch (Exception e55) {
                                        e = e55;
                                        r25 = r15;
                                        px.f fVar7 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar7.d(message, e, px.c.a(r25));
                                        iVarA = r25.a(e);
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
                                case 3:
                                    int i85 = aVar3.D;
                                    int i86 = aVar3.C;
                                    int i87 = aVar3.B;
                                    int i88 = aVar3.A;
                                    int i89 = aVar3.f209515z;
                                    Map map10 = (Map) aVar3.f209509s;
                                    char[] cArr7 = (char[]) aVar3.f209508r;
                                    StudentPackageData studentPackageData6 = (StudentPackageData) aVar3.f209507q;
                                    byte[] bArr20 = (byte[]) aVar3.f209506p;
                                    byte[] bArr21 = (byte[]) aVar3.f209505n;
                                    byte[] bArr22 = (byte[]) aVar3.f209504m;
                                    byte[] bArr23 = (byte[]) aVar3.f209503l;
                                    secretKey3 = (SecretKey) aVar3.f209502k;
                                    ex.b bVar28 = (ex.b) aVar3.f209501j;
                                    bArr3 = (byte[]) aVar3.f209500h;
                                    ex.b bVar29 = (ex.b) aVar3.f209499g;
                                    bVar6 = (ex.b) aVar3.f209498f;
                                    dx.j jVar5 = (dx.j) aVar3.f209497e;
                                    w24.a.Params params11 = (w24.a.Params) aVar3.f209496d;
                                    oq.u.b(objC2);
                                    params3 = params11;
                                    bVar9 = bVar28;
                                    bArr6 = bArr20;
                                    i29 = i89;
                                    i36 = i88;
                                    i37 = i86;
                                    map = map10;
                                    bArr7 = bArr21;
                                    i28 = i87;
                                    i35 = i85;
                                    bArr8 = bArr23;
                                    cArr = cArr7;
                                    obj3 = objE;
                                    bVar8 = bVar29;
                                    studentPackageData = studentPackageData6;
                                    bArr4 = bArr22;
                                    r16 = jVar5;
                                    certKeyPair = (CertKeyPair) bVar9.a((dx.i) objC2);
                                    bArr9 = bArr7;
                                    string = certKeyPair.getCertificate().getSerialNumber().toString(16);
                                    c2 c2Var4 = bVar17.isCurrentUserPeselUC;
                                    c2.Params params12 = new c2.Params(certKeyPair.getCertificate());
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r16;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = bVar8;
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = vq.j.a(secretKey3);
                                    aVar3.f209502k = vq.j.a(bArr8);
                                    aVar3.f209503l = bArr4;
                                    aVar3.f209504m = vq.j.a(bArr9);
                                    aVar3.f209505n = vq.j.a(bArr6);
                                    aVar3.f209506p = vq.j.a(studentPackageData);
                                    aVar3.f209507q = cArr;
                                    aVar3.f209508r = vq.j.a(certKeyPair);
                                    aVar3.f209509s = string;
                                    aVar3.f209510t = map;
                                    aVar3.f209515z = i29;
                                    aVar3.A = i36;
                                    aVar3.B = i28;
                                    aVar3.C = i37;
                                    aVar3.D = i35;
                                    aVar3.H = 4;
                                    objC = c2Var4.c(params12, aVar3);
                                    obj4 = obj3;
                                    if (objC != obj4) {
                                        ex.b bVar112 = bVar8;
                                        str = string;
                                        bVar10 = bVar112;
                                        map2 = map;
                                        cArr2 = cArr;
                                        i38 = i37;
                                        i39 = i28;
                                        bArr10 = bArr9;
                                        certKeyPair2 = certKeyPair;
                                        objC2 = objC;
                                        secretKey4 = secretKey3;
                                        r15 = r16;
                                        if (!((Boolean) objC2).booleanValue()) {
                                            this.remoteLogger.F8("Pesel from new certificate does not match current user's pesel", px.d.a.ERROR);
                                            bVar10.b(this.containersErrorInteractor.b());
                                            throw new oq.g();
                                        }
                                        secretKey5 = secretKey4;
                                        bArr11 = bArr10;
                                        bArr12 = bArr4;
                                        this.remoteLogger.F8("Pesel from new certificate matches current user's pesel", px.d.a.GENERAL);
                                        k24.o oVar4 = this.saveUserCertificateUC;
                                        certKeyPair3 = certKeyPair2;
                                        k24.o.Params params13 = new k24.o.Params(f24.c.UNIVERSITY, new iy.b0(new char[0]), iy.c0.f(bArr12), iy.c0.h(cArr2));
                                        aVar3.f209496d = vq.j.a(params3);
                                        aVar3.f209497e = r15;
                                        aVar3.f209498f = vq.j.a(bVar6);
                                        aVar3.f209499g = bVar10;
                                        aVar3.f209500h = vq.j.a(bArr3);
                                        aVar3.f209501j = bVar10;
                                        aVar3.f209502k = vq.j.a(secretKey5);
                                        aVar3.f209503l = vq.j.a(bArr8);
                                        aVar3.f209504m = vq.j.a(bArr12);
                                        aVar3.f209505n = vq.j.a(bArr11);
                                        aVar3.f209506p = vq.j.a(bArr6);
                                        aVar3.f209507q = vq.j.a(studentPackageData);
                                        aVar3.f209508r = vq.j.a(cArr2);
                                        aVar3.f209509s = vq.j.a(certKeyPair3);
                                        aVar3.f209510t = str;
                                        aVar3.f209511v = map2;
                                        aVar3.f209515z = i29;
                                        aVar3.A = i36;
                                        aVar3.B = i39;
                                        aVar3.C = i38;
                                        aVar3.D = i35;
                                        aVar3.H = 5;
                                        objC2 = oVar4.c(params13, aVar3);
                                        obj4 = obj4;
                                        if (objC2 == obj4) {
                                            bVar11 = bVar10;
                                            i45 = i38;
                                            i46 = i36;
                                            i47 = i29;
                                            studentPackageData2 = studentPackageData;
                                            i48 = i39;
                                            cArr3 = cArr2;
                                            bArr13 = bArr8;
                                            secretKey6 = secretKey5;
                                            str2 = str;
                                            i49 = i35;
                                            r15 = r15;
                                            map3 = map2;
                                            iIntValue = ((Number) bVar10.a((dx.i) objC2)).intValue();
                                            bVar12 = this;
                                            bVar12.remoteLogger.F8("New certificate saved with id: " + iIntValue, px.d.a.GENERAL);
                                            arrayList = new ArrayList(map3.size());
                                            it = map3.entrySet().iterator();
                                            while (it.hasNext()) {
                                                Map.Entry entry4 = (Map.Entry) it.next();
                                                arrayList.add(oq.y.a((String) entry4.getKey(), new CMSSignedData((byte[]) bVar11.a(iy.a.c(bVar12.baseCoder, (String) entry4.getValue(), null, 2, null)))));
                                                it = it;
                                                iIntValue = iIntValue;
                                                obj4 = obj4;
                                            }
                                            int i614 = iIntValue;
                                            mapS = pq.v0.s(arrayList);
                                            v24.b bVar210 = bVar12.documentsContainerRepository;
                                            f24.i iVar5 = f24.i.STUDENT_CARD;
                                            aVar3.f209496d = vq.j.a(params3);
                                            aVar3.f209497e = r15;
                                            aVar3.f209498f = vq.j.a(bVar6);
                                            aVar3.f209499g = bVar11;
                                            aVar3.f209500h = vq.j.a(bArr3);
                                            aVar3.f209501j = bVar11;
                                            aVar3.f209502k = vq.j.a(secretKey6);
                                            aVar3.f209503l = vq.j.a(bArr13);
                                            aVar3.f209504m = vq.j.a(bArr12);
                                            aVar3.f209505n = vq.j.a(bArr11);
                                            aVar3.f209506p = vq.j.a(bArr6);
                                            aVar3.f209507q = vq.j.a(studentPackageData2);
                                            aVar3.f209508r = vq.j.a(cArr3);
                                            aVar3.f209509s = vq.j.a(certKeyPair3);
                                            aVar3.f209510t = str2;
                                            aVar3.f209511v = vq.j.a(map3);
                                            aVar3.f209512w = vq.j.a(mapS);
                                            aVar3.f209515z = i47;
                                            aVar3.A = i46;
                                            aVar3.B = i48;
                                            aVar3.C = i45;
                                            aVar3.D = i49;
                                            aVar3.E = i614;
                                            aVar3.H = 6;
                                            i55 = i614;
                                            i56 = i47;
                                            objQ = bVar210.q(str2, i55, mapS, null, iVar5, aVar3);
                                            aVar3 = aVar3;
                                            obj5 = obj4;
                                            if (objQ == obj5) {
                                                return obj5;
                                            }
                                            i57 = i56;
                                            objC2 = objQ;
                                            map4 = mapS;
                                            i58 = i48;
                                            i59 = i46;
                                            map5 = map3;
                                            bArr14 = bArr11;
                                            str3 = str2;
                                            i65 = i49;
                                            bVar13 = bVar11;
                                            r17 = r15;
                                            i66 = i55;
                                            bVar11.a((dx.i) objC2);
                                            k24.h hVar4 = bVar12.getStudentCardDataUC;
                                            gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                                            map6 = map4;
                                            aVar3.f209496d = vq.j.a(params3);
                                            aVar3.f209497e = r17;
                                            aVar3.f209498f = vq.j.a(bVar6);
                                            aVar3.f209499g = bVar13;
                                            aVar3.f209500h = vq.j.a(bArr3);
                                            aVar3.f209501j = bVar13;
                                            aVar3.f209502k = vq.j.a(secretKey6);
                                            aVar3.f209503l = vq.j.a(bArr13);
                                            aVar3.f209504m = vq.j.a(bArr12);
                                            aVar3.f209505n = vq.j.a(bArr14);
                                            aVar3.f209506p = vq.j.a(bArr6);
                                            aVar3.f209507q = vq.j.a(studentPackageData2);
                                            aVar3.f209508r = vq.j.a(cArr3);
                                            aVar3.f209509s = vq.j.a(certKeyPair3);
                                            aVar3.f209510t = str3;
                                            aVar3.f209511v = vq.j.a(map5);
                                            aVar3.f209512w = vq.j.a(map6);
                                            aVar3.f209515z = i57;
                                            aVar3.A = i59;
                                            aVar3.B = i58;
                                            aVar3.C = i45;
                                            aVar3.D = i65;
                                            aVar3.E = i66;
                                            aVar3.H = 7;
                                            objC2 = hVar4.c(c1792a4, aVar3);
                                            if (objC2 == obj5) {
                                                return obj5;
                                            }
                                            bVar14 = bVar13;
                                            map7 = map5;
                                            str4 = str3;
                                            cArr4 = cArr3;
                                            certKeyPair4 = certKeyPair3;
                                            r18 = r17;
                                            studentCardData = (StudentCardData) bVar13.a((dx.i) objC2);
                                            certKeyPair5 = certKeyPair4;
                                            cArr5 = cArr4;
                                            localDate = new fz.b.LocalDate(bVar12.dateConverter.l(studentCardData.getScope().getData().getExpireDate()));
                                            v24.b bVar211 = bVar12.documentsContainerRepository;
                                            aVar3.f209496d = vq.j.a(params3);
                                            aVar3.f209497e = r18;
                                            aVar3.f209498f = vq.j.a(bVar6);
                                            aVar3.f209499g = vq.j.a(bVar14);
                                            aVar3.f209500h = vq.j.a(bArr3);
                                            aVar3.f209501j = bVar14;
                                            aVar3.f209502k = vq.j.a(secretKey6);
                                            aVar3.f209503l = vq.j.a(bArr13);
                                            aVar3.f209504m = vq.j.a(bArr12);
                                            aVar3.f209505n = vq.j.a(bArr14);
                                            aVar3.f209506p = vq.j.a(bArr6);
                                            aVar3.f209507q = vq.j.a(studentPackageData2);
                                            aVar3.f209508r = vq.j.a(cArr5);
                                            aVar3.f209509s = vq.j.a(certKeyPair5);
                                            aVar3.f209510t = str4;
                                            aVar3.f209511v = vq.j.a(map7);
                                            aVar3.f209512w = vq.j.a(map6);
                                            aVar3.f209513x = vq.j.a(studentCardData);
                                            aVar3.f209514y = localDate;
                                            aVar3.f209515z = i57;
                                            aVar3.A = i59;
                                            aVar3.B = i58;
                                            aVar3.C = i45;
                                            aVar3.D = i65;
                                            aVar3.E = i66;
                                            aVar3.H = 8;
                                            objI = bVar211.i(str4, localDate, aVar3);
                                            if (objI == obj5) {
                                                return obj5;
                                            }
                                            studentCardData2 = studentCardData;
                                            objC2 = objI;
                                            map8 = map6;
                                            map9 = map7;
                                            cArr6 = cArr5;
                                            str5 = str4;
                                            localDate2 = localDate;
                                            bArr15 = bArr12;
                                            bVar15 = bVar14;
                                            r110 = r18;
                                            bVar14.a((dx.i) objC2);
                                            bVar16 = bVar12.containersInteractor;
                                            iVar = f24.i.STUDENT_CARD;
                                            aVar3.f209496d = vq.j.a(params3);
                                            aVar3.f209497e = r110;
                                            aVar3.f209498f = vq.j.a(bVar6);
                                            aVar3.f209499g = vq.j.a(bVar15);
                                            aVar3.f209500h = vq.j.a(bArr3);
                                            aVar3.f209501j = vq.j.a(secretKey6);
                                            aVar3.f209502k = vq.j.a(bArr13);
                                            aVar3.f209503l = vq.j.a(bArr15);
                                            aVar3.f209504m = vq.j.a(bArr14);
                                            aVar3.f209505n = vq.j.a(bArr6);
                                            aVar3.f209506p = vq.j.a(studentPackageData2);
                                            aVar3.f209507q = vq.j.a(cArr6);
                                            aVar3.f209508r = vq.j.a(certKeyPair5);
                                            aVar3.f209509s = vq.j.a(str5);
                                            aVar3.f209510t = vq.j.a(map9);
                                            aVar3.f209511v = vq.j.a(map8);
                                            aVar3.f209512w = vq.j.a(studentCardData2);
                                            aVar3.f209513x = vq.j.a(localDate2);
                                            aVar3.f209514y = null;
                                            aVar3.f209515z = i57;
                                            aVar3.A = i59;
                                            aVar3.B = i58;
                                            aVar3.C = i45;
                                            aVar3.D = i65;
                                            aVar3.E = i66;
                                            aVar3.H = 9;
                                            r15 = r110;
                                            if (bVar16.c(iVar, str5, localDate2, true, aVar3) == obj5) {
                                                return obj5;
                                            }
                                            bVar12.remoteLogger.F8("Saved document data for " + f24.i.STUDENT_CARD, px.d.a.GENERAL);
                                            return new dx.i.Right(oq.i0.f148189a);
                                        }
                                    }
                                    return obj4;
                                case 4:
                                    int i95 = aVar3.D;
                                    i38 = aVar3.C;
                                    i39 = aVar3.B;
                                    int i96 = aVar3.A;
                                    int i97 = aVar3.f209515z;
                                    map2 = (Map) aVar3.f209510t;
                                    String str9 = (String) aVar3.f209509s;
                                    CertKeyPair certKeyPair6 = (CertKeyPair) aVar3.f209508r;
                                    char[] cArr8 = (char[]) aVar3.f209507q;
                                    StudentPackageData studentPackageData7 = (StudentPackageData) aVar3.f209506p;
                                    byte[] bArr24 = (byte[]) aVar3.f209505n;
                                    bArr10 = (byte[]) aVar3.f209504m;
                                    byte[] bArr25 = (byte[]) aVar3.f209503l;
                                    bArr8 = (byte[]) aVar3.f209502k;
                                    SecretKey secretKey7 = (SecretKey) aVar3.f209501j;
                                    bArr3 = (byte[]) aVar3.f209500h;
                                    ex.b bVar30 = (ex.b) aVar3.f209499g;
                                    bVar6 = (ex.b) aVar3.f209498f;
                                    dx.j jVar6 = (dx.j) aVar3.f209497e;
                                    w24.a.Params params14 = (w24.a.Params) aVar3.f209496d;
                                    oq.u.b(objC2);
                                    obj4 = objE;
                                    str = str9;
                                    i36 = i96;
                                    i35 = i95;
                                    cArr2 = cArr8;
                                    i29 = i97;
                                    bArr6 = bArr24;
                                    secretKey4 = secretKey7;
                                    r15 = jVar6;
                                    params3 = params14;
                                    bVar10 = bVar30;
                                    studentPackageData = studentPackageData7;
                                    certKeyPair2 = certKeyPair6;
                                    bArr4 = bArr25;
                                    if (!((Boolean) objC2).booleanValue()) {
                                        this.remoteLogger.F8("Pesel from new certificate does not match current user's pesel", px.d.a.ERROR);
                                        bVar10.b(this.containersErrorInteractor.b());
                                        throw new oq.g();
                                    }
                                    secretKey5 = secretKey4;
                                    bArr11 = bArr10;
                                    bArr12 = bArr4;
                                    this.remoteLogger.F8("Pesel from new certificate matches current user's pesel", px.d.a.GENERAL);
                                    k24.o oVar5 = this.saveUserCertificateUC;
                                    certKeyPair3 = certKeyPair2;
                                    k24.o.Params params15 = new k24.o.Params(f24.c.UNIVERSITY, new iy.b0(new char[0]), iy.c0.f(bArr12), iy.c0.h(cArr2));
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r15;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = bVar10;
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = bVar10;
                                    aVar3.f209502k = vq.j.a(secretKey5);
                                    aVar3.f209503l = vq.j.a(bArr8);
                                    aVar3.f209504m = vq.j.a(bArr12);
                                    aVar3.f209505n = vq.j.a(bArr11);
                                    aVar3.f209506p = vq.j.a(bArr6);
                                    aVar3.f209507q = vq.j.a(studentPackageData);
                                    aVar3.f209508r = vq.j.a(cArr2);
                                    aVar3.f209509s = vq.j.a(certKeyPair3);
                                    aVar3.f209510t = str;
                                    aVar3.f209511v = map2;
                                    aVar3.f209515z = i29;
                                    aVar3.A = i36;
                                    aVar3.B = i39;
                                    aVar3.C = i38;
                                    aVar3.D = i35;
                                    aVar3.H = 5;
                                    objC2 = oVar5.c(params15, aVar3);
                                    obj4 = obj4;
                                    if (objC2 == obj4) {
                                        return obj4;
                                    }
                                    bVar11 = bVar10;
                                    i45 = i38;
                                    i46 = i36;
                                    i47 = i29;
                                    studentPackageData2 = studentPackageData;
                                    i48 = i39;
                                    cArr3 = cArr2;
                                    bArr13 = bArr8;
                                    secretKey6 = secretKey5;
                                    str2 = str;
                                    i49 = i35;
                                    r15 = r15;
                                    map3 = map2;
                                    iIntValue = ((Number) bVar10.a((dx.i) objC2)).intValue();
                                    bVar12 = this;
                                    bVar12.remoteLogger.F8("New certificate saved with id: " + iIntValue, px.d.a.GENERAL);
                                    arrayList = new ArrayList(map3.size());
                                    it = map3.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Map.Entry entry5 = (Map.Entry) it.next();
                                        arrayList.add(oq.y.a((String) entry5.getKey(), new CMSSignedData((byte[]) bVar11.a(iy.a.c(bVar12.baseCoder, (String) entry5.getValue(), null, 2, null)))));
                                        it = it;
                                        iIntValue = iIntValue;
                                        obj4 = obj4;
                                    }
                                    int i615 = iIntValue;
                                    mapS = pq.v0.s(arrayList);
                                    v24.b bVar212 = bVar12.documentsContainerRepository;
                                    f24.i iVar6 = f24.i.STUDENT_CARD;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r15;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = bVar11;
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = bVar11;
                                    aVar3.f209502k = vq.j.a(secretKey6);
                                    aVar3.f209503l = vq.j.a(bArr13);
                                    aVar3.f209504m = vq.j.a(bArr12);
                                    aVar3.f209505n = vq.j.a(bArr11);
                                    aVar3.f209506p = vq.j.a(bArr6);
                                    aVar3.f209507q = vq.j.a(studentPackageData2);
                                    aVar3.f209508r = vq.j.a(cArr3);
                                    aVar3.f209509s = vq.j.a(certKeyPair3);
                                    aVar3.f209510t = str2;
                                    aVar3.f209511v = vq.j.a(map3);
                                    aVar3.f209512w = vq.j.a(mapS);
                                    aVar3.f209515z = i47;
                                    aVar3.A = i46;
                                    aVar3.B = i48;
                                    aVar3.C = i45;
                                    aVar3.D = i49;
                                    aVar3.E = i615;
                                    aVar3.H = 6;
                                    i55 = i615;
                                    i56 = i47;
                                    objQ = bVar212.q(str2, i55, mapS, null, iVar6, aVar3);
                                    aVar3 = aVar3;
                                    obj5 = obj4;
                                    if (objQ == obj5) {
                                        return obj5;
                                    }
                                    i57 = i56;
                                    objC2 = objQ;
                                    map4 = mapS;
                                    i58 = i48;
                                    i59 = i46;
                                    map5 = map3;
                                    bArr14 = bArr11;
                                    str3 = str2;
                                    i65 = i49;
                                    bVar13 = bVar11;
                                    r17 = r15;
                                    i66 = i55;
                                    bVar11.a((dx.i) objC2);
                                    k24.h hVar5 = bVar12.getStudentCardDataUC;
                                    gz.b.a.C1792a c1792a5 = gz.b.a.C1792a.f78542a;
                                    map6 = map4;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r17;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = bVar13;
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = bVar13;
                                    aVar3.f209502k = vq.j.a(secretKey6);
                                    aVar3.f209503l = vq.j.a(bArr13);
                                    aVar3.f209504m = vq.j.a(bArr12);
                                    aVar3.f209505n = vq.j.a(bArr14);
                                    aVar3.f209506p = vq.j.a(bArr6);
                                    aVar3.f209507q = vq.j.a(studentPackageData2);
                                    aVar3.f209508r = vq.j.a(cArr3);
                                    aVar3.f209509s = vq.j.a(certKeyPair3);
                                    aVar3.f209510t = str3;
                                    aVar3.f209511v = vq.j.a(map5);
                                    aVar3.f209512w = vq.j.a(map6);
                                    aVar3.f209515z = i57;
                                    aVar3.A = i59;
                                    aVar3.B = i58;
                                    aVar3.C = i45;
                                    aVar3.D = i65;
                                    aVar3.E = i66;
                                    aVar3.H = 7;
                                    objC2 = hVar5.c(c1792a5, aVar3);
                                    if (objC2 == obj5) {
                                        return obj5;
                                    }
                                    bVar14 = bVar13;
                                    map7 = map5;
                                    str4 = str3;
                                    cArr4 = cArr3;
                                    certKeyPair4 = certKeyPair3;
                                    r18 = r17;
                                    studentCardData = (StudentCardData) bVar13.a((dx.i) objC2);
                                    certKeyPair5 = certKeyPair4;
                                    cArr5 = cArr4;
                                    localDate = new fz.b.LocalDate(bVar12.dateConverter.l(studentCardData.getScope().getData().getExpireDate()));
                                    v24.b bVar213 = bVar12.documentsContainerRepository;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r18;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = vq.j.a(bVar14);
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = bVar14;
                                    aVar3.f209502k = vq.j.a(secretKey6);
                                    aVar3.f209503l = vq.j.a(bArr13);
                                    aVar3.f209504m = vq.j.a(bArr12);
                                    aVar3.f209505n = vq.j.a(bArr14);
                                    aVar3.f209506p = vq.j.a(bArr6);
                                    aVar3.f209507q = vq.j.a(studentPackageData2);
                                    aVar3.f209508r = vq.j.a(cArr5);
                                    aVar3.f209509s = vq.j.a(certKeyPair5);
                                    aVar3.f209510t = str4;
                                    aVar3.f209511v = vq.j.a(map7);
                                    aVar3.f209512w = vq.j.a(map6);
                                    aVar3.f209513x = vq.j.a(studentCardData);
                                    aVar3.f209514y = localDate;
                                    aVar3.f209515z = i57;
                                    aVar3.A = i59;
                                    aVar3.B = i58;
                                    aVar3.C = i45;
                                    aVar3.D = i65;
                                    aVar3.E = i66;
                                    aVar3.H = 8;
                                    objI = bVar213.i(str4, localDate, aVar3);
                                    if (objI == obj5) {
                                        return obj5;
                                    }
                                    studentCardData2 = studentCardData;
                                    objC2 = objI;
                                    map8 = map6;
                                    map9 = map7;
                                    cArr6 = cArr5;
                                    str5 = str4;
                                    localDate2 = localDate;
                                    bArr15 = bArr12;
                                    bVar15 = bVar14;
                                    r110 = r18;
                                    bVar14.a((dx.i) objC2);
                                    bVar16 = bVar12.containersInteractor;
                                    iVar = f24.i.STUDENT_CARD;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r110;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = vq.j.a(bVar15);
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = vq.j.a(secretKey6);
                                    aVar3.f209502k = vq.j.a(bArr13);
                                    aVar3.f209503l = vq.j.a(bArr15);
                                    aVar3.f209504m = vq.j.a(bArr14);
                                    aVar3.f209505n = vq.j.a(bArr6);
                                    aVar3.f209506p = vq.j.a(studentPackageData2);
                                    aVar3.f209507q = vq.j.a(cArr6);
                                    aVar3.f209508r = vq.j.a(certKeyPair5);
                                    aVar3.f209509s = vq.j.a(str5);
                                    aVar3.f209510t = vq.j.a(map9);
                                    aVar3.f209511v = vq.j.a(map8);
                                    aVar3.f209512w = vq.j.a(studentCardData2);
                                    aVar3.f209513x = vq.j.a(localDate2);
                                    aVar3.f209514y = null;
                                    aVar3.f209515z = i57;
                                    aVar3.A = i59;
                                    aVar3.B = i58;
                                    aVar3.C = i45;
                                    aVar3.D = i65;
                                    aVar3.E = i66;
                                    aVar3.H = 9;
                                    r15 = r110;
                                    if (bVar16.c(iVar, str5, localDate2, true, aVar3) == obj5) {
                                        return obj5;
                                    }
                                    bVar12.remoteLogger.F8("Saved document data for " + f24.i.STUDENT_CARD, px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 5:
                                    int i98 = aVar3.D;
                                    int i99 = aVar3.C;
                                    int i100 = aVar3.B;
                                    int i101 = aVar3.A;
                                    int i102 = aVar3.f209515z;
                                    map2 = (Map) aVar3.f209511v;
                                    String str10 = (String) aVar3.f209510t;
                                    CertKeyPair certKeyPair7 = (CertKeyPair) aVar3.f209509s;
                                    char[] cArr9 = (char[]) aVar3.f209508r;
                                    StudentPackageData studentPackageData8 = (StudentPackageData) aVar3.f209507q;
                                    byte[] bArr26 = (byte[]) aVar3.f209506p;
                                    byte[] bArr27 = (byte[]) aVar3.f209505n;
                                    byte[] bArr28 = (byte[]) aVar3.f209504m;
                                    bArr13 = (byte[]) aVar3.f209503l;
                                    secretKey6 = (SecretKey) aVar3.f209502k;
                                    ex.b bVar31 = (ex.b) aVar3.f209501j;
                                    bArr3 = (byte[]) aVar3.f209500h;
                                    ex.b bVar32 = (ex.b) aVar3.f209499g;
                                    bVar6 = (ex.b) aVar3.f209498f;
                                    dx.j jVar7 = (dx.j) aVar3.f209497e;
                                    w24.a.Params params16 = (w24.a.Params) aVar3.f209496d;
                                    oq.u.b(objC2);
                                    params3 = params16;
                                    bVar10 = bVar31;
                                    bArr12 = bArr28;
                                    certKeyPair3 = certKeyPair7;
                                    studentPackageData2 = studentPackageData8;
                                    bArr6 = bArr26;
                                    bVar11 = bVar32;
                                    r15 = jVar7;
                                    i45 = i99;
                                    bArr11 = bArr27;
                                    i46 = i101;
                                    i47 = i102;
                                    cArr3 = cArr9;
                                    i48 = i100;
                                    str2 = str10;
                                    obj4 = objE;
                                    i49 = i98;
                                    map3 = map2;
                                    iIntValue = ((Number) bVar10.a((dx.i) objC2)).intValue();
                                    bVar12 = this;
                                    bVar12.remoteLogger.F8("New certificate saved with id: " + iIntValue, px.d.a.GENERAL);
                                    arrayList = new ArrayList(map3.size());
                                    it = map3.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Map.Entry entry6 = (Map.Entry) it.next();
                                        arrayList.add(oq.y.a((String) entry6.getKey(), new CMSSignedData((byte[]) bVar11.a(iy.a.c(bVar12.baseCoder, (String) entry6.getValue(), null, 2, null)))));
                                        it = it;
                                        iIntValue = iIntValue;
                                        obj4 = obj4;
                                    }
                                    int i616 = iIntValue;
                                    mapS = pq.v0.s(arrayList);
                                    v24.b bVar214 = bVar12.documentsContainerRepository;
                                    f24.i iVar7 = f24.i.STUDENT_CARD;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r15;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = bVar11;
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = bVar11;
                                    aVar3.f209502k = vq.j.a(secretKey6);
                                    aVar3.f209503l = vq.j.a(bArr13);
                                    aVar3.f209504m = vq.j.a(bArr12);
                                    aVar3.f209505n = vq.j.a(bArr11);
                                    aVar3.f209506p = vq.j.a(bArr6);
                                    aVar3.f209507q = vq.j.a(studentPackageData2);
                                    aVar3.f209508r = vq.j.a(cArr3);
                                    aVar3.f209509s = vq.j.a(certKeyPair3);
                                    aVar3.f209510t = str2;
                                    aVar3.f209511v = vq.j.a(map3);
                                    aVar3.f209512w = vq.j.a(mapS);
                                    aVar3.f209515z = i47;
                                    aVar3.A = i46;
                                    aVar3.B = i48;
                                    aVar3.C = i45;
                                    aVar3.D = i49;
                                    aVar3.E = i616;
                                    aVar3.H = 6;
                                    i55 = i616;
                                    i56 = i47;
                                    objQ = bVar214.q(str2, i55, mapS, null, iVar7, aVar3);
                                    aVar3 = aVar3;
                                    obj5 = obj4;
                                    if (objQ == obj5) {
                                        return obj5;
                                    }
                                    i57 = i56;
                                    objC2 = objQ;
                                    map4 = mapS;
                                    i58 = i48;
                                    i59 = i46;
                                    map5 = map3;
                                    bArr14 = bArr11;
                                    str3 = str2;
                                    i65 = i49;
                                    bVar13 = bVar11;
                                    r17 = r15;
                                    i66 = i55;
                                    bVar11.a((dx.i) objC2);
                                    k24.h hVar6 = bVar12.getStudentCardDataUC;
                                    gz.b.a.C1792a c1792a6 = gz.b.a.C1792a.f78542a;
                                    map6 = map4;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r17;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = bVar13;
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = bVar13;
                                    aVar3.f209502k = vq.j.a(secretKey6);
                                    aVar3.f209503l = vq.j.a(bArr13);
                                    aVar3.f209504m = vq.j.a(bArr12);
                                    aVar3.f209505n = vq.j.a(bArr14);
                                    aVar3.f209506p = vq.j.a(bArr6);
                                    aVar3.f209507q = vq.j.a(studentPackageData2);
                                    aVar3.f209508r = vq.j.a(cArr3);
                                    aVar3.f209509s = vq.j.a(certKeyPair3);
                                    aVar3.f209510t = str3;
                                    aVar3.f209511v = vq.j.a(map5);
                                    aVar3.f209512w = vq.j.a(map6);
                                    aVar3.f209515z = i57;
                                    aVar3.A = i59;
                                    aVar3.B = i58;
                                    aVar3.C = i45;
                                    aVar3.D = i65;
                                    aVar3.E = i66;
                                    aVar3.H = 7;
                                    objC2 = hVar6.c(c1792a6, aVar3);
                                    if (objC2 == obj5) {
                                        return obj5;
                                    }
                                    bVar14 = bVar13;
                                    map7 = map5;
                                    str4 = str3;
                                    cArr4 = cArr3;
                                    certKeyPair4 = certKeyPair3;
                                    r18 = r17;
                                    studentCardData = (StudentCardData) bVar13.a((dx.i) objC2);
                                    certKeyPair5 = certKeyPair4;
                                    cArr5 = cArr4;
                                    localDate = new fz.b.LocalDate(bVar12.dateConverter.l(studentCardData.getScope().getData().getExpireDate()));
                                    v24.b bVar215 = bVar12.documentsContainerRepository;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r18;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = vq.j.a(bVar14);
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = bVar14;
                                    aVar3.f209502k = vq.j.a(secretKey6);
                                    aVar3.f209503l = vq.j.a(bArr13);
                                    aVar3.f209504m = vq.j.a(bArr12);
                                    aVar3.f209505n = vq.j.a(bArr14);
                                    aVar3.f209506p = vq.j.a(bArr6);
                                    aVar3.f209507q = vq.j.a(studentPackageData2);
                                    aVar3.f209508r = vq.j.a(cArr5);
                                    aVar3.f209509s = vq.j.a(certKeyPair5);
                                    aVar3.f209510t = str4;
                                    aVar3.f209511v = vq.j.a(map7);
                                    aVar3.f209512w = vq.j.a(map6);
                                    aVar3.f209513x = vq.j.a(studentCardData);
                                    aVar3.f209514y = localDate;
                                    aVar3.f209515z = i57;
                                    aVar3.A = i59;
                                    aVar3.B = i58;
                                    aVar3.C = i45;
                                    aVar3.D = i65;
                                    aVar3.E = i66;
                                    aVar3.H = 8;
                                    objI = bVar215.i(str4, localDate, aVar3);
                                    if (objI == obj5) {
                                        return obj5;
                                    }
                                    studentCardData2 = studentCardData;
                                    objC2 = objI;
                                    map8 = map6;
                                    map9 = map7;
                                    cArr6 = cArr5;
                                    str5 = str4;
                                    localDate2 = localDate;
                                    bArr15 = bArr12;
                                    bVar15 = bVar14;
                                    r110 = r18;
                                    bVar14.a((dx.i) objC2);
                                    bVar16 = bVar12.containersInteractor;
                                    iVar = f24.i.STUDENT_CARD;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r110;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = vq.j.a(bVar15);
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = vq.j.a(secretKey6);
                                    aVar3.f209502k = vq.j.a(bArr13);
                                    aVar3.f209503l = vq.j.a(bArr15);
                                    aVar3.f209504m = vq.j.a(bArr14);
                                    aVar3.f209505n = vq.j.a(bArr6);
                                    aVar3.f209506p = vq.j.a(studentPackageData2);
                                    aVar3.f209507q = vq.j.a(cArr6);
                                    aVar3.f209508r = vq.j.a(certKeyPair5);
                                    aVar3.f209509s = vq.j.a(str5);
                                    aVar3.f209510t = vq.j.a(map9);
                                    aVar3.f209511v = vq.j.a(map8);
                                    aVar3.f209512w = vq.j.a(studentCardData2);
                                    aVar3.f209513x = vq.j.a(localDate2);
                                    aVar3.f209514y = null;
                                    aVar3.f209515z = i57;
                                    aVar3.A = i59;
                                    aVar3.B = i58;
                                    aVar3.C = i45;
                                    aVar3.D = i65;
                                    aVar3.E = i66;
                                    aVar3.H = 9;
                                    r15 = r110;
                                    if (bVar16.c(iVar, str5, localDate2, true, aVar3) == obj5) {
                                        return obj5;
                                    }
                                    bVar12.remoteLogger.F8("Saved document data for " + f24.i.STUDENT_CARD, px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 6:
                                    int i103 = aVar3.E;
                                    int i104 = aVar3.D;
                                    int i105 = aVar3.C;
                                    i58 = aVar3.B;
                                    i59 = aVar3.A;
                                    i57 = aVar3.f209515z;
                                    map4 = (Map) aVar3.f209512w;
                                    Map map11 = (Map) aVar3.f209511v;
                                    String str11 = (String) aVar3.f209510t;
                                    CertKeyPair certKeyPair8 = (CertKeyPair) aVar3.f209509s;
                                    char[] cArr10 = (char[]) aVar3.f209508r;
                                    StudentPackageData studentPackageData9 = (StudentPackageData) aVar3.f209507q;
                                    i55 = i103;
                                    byte[] bArr29 = (byte[]) aVar3.f209506p;
                                    bArr14 = (byte[]) aVar3.f209505n;
                                    byte[] bArr30 = (byte[]) aVar3.f209504m;
                                    byte[] bArr31 = (byte[]) aVar3.f209503l;
                                    SecretKey secretKey8 = (SecretKey) aVar3.f209502k;
                                    ex.b bVar33 = (ex.b) aVar3.f209501j;
                                    byte[] bArr32 = (byte[]) aVar3.f209500h;
                                    ex.b bVar34 = (ex.b) aVar3.f209499g;
                                    ex.b bVar35 = (ex.b) aVar3.f209498f;
                                    dx.j jVar8 = (dx.j) aVar3.f209497e;
                                    w24.a.Params params17 = (w24.a.Params) aVar3.f209496d;
                                    oq.u.b(objC2);
                                    bArr6 = bArr29;
                                    certKeyPair3 = certKeyPair8;
                                    studentPackageData2 = studentPackageData9;
                                    r17 = jVar8;
                                    map5 = map11;
                                    bArr12 = bArr30;
                                    bArr13 = bArr31;
                                    secretKey6 = secretKey8;
                                    params3 = params17;
                                    obj5 = objE;
                                    bVar13 = bVar34;
                                    bVar6 = bVar35;
                                    bVar12 = bVar17;
                                    bVar11 = bVar33;
                                    bArr3 = bArr32;
                                    cArr3 = cArr10;
                                    str3 = str11;
                                    i45 = i105;
                                    i65 = i104;
                                    i66 = i55;
                                    bVar11.a((dx.i) objC2);
                                    k24.h hVar7 = bVar12.getStudentCardDataUC;
                                    gz.b.a.C1792a c1792a7 = gz.b.a.C1792a.f78542a;
                                    map6 = map4;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r17;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = bVar13;
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = bVar13;
                                    aVar3.f209502k = vq.j.a(secretKey6);
                                    aVar3.f209503l = vq.j.a(bArr13);
                                    aVar3.f209504m = vq.j.a(bArr12);
                                    aVar3.f209505n = vq.j.a(bArr14);
                                    aVar3.f209506p = vq.j.a(bArr6);
                                    aVar3.f209507q = vq.j.a(studentPackageData2);
                                    aVar3.f209508r = vq.j.a(cArr3);
                                    aVar3.f209509s = vq.j.a(certKeyPair3);
                                    aVar3.f209510t = str3;
                                    aVar3.f209511v = vq.j.a(map5);
                                    aVar3.f209512w = vq.j.a(map6);
                                    aVar3.f209515z = i57;
                                    aVar3.A = i59;
                                    aVar3.B = i58;
                                    aVar3.C = i45;
                                    aVar3.D = i65;
                                    aVar3.E = i66;
                                    aVar3.H = 7;
                                    objC2 = hVar7.c(c1792a7, aVar3);
                                    if (objC2 == obj5) {
                                        return obj5;
                                    }
                                    bVar14 = bVar13;
                                    map7 = map5;
                                    str4 = str3;
                                    cArr4 = cArr3;
                                    certKeyPair4 = certKeyPair3;
                                    r18 = r17;
                                    studentCardData = (StudentCardData) bVar13.a((dx.i) objC2);
                                    certKeyPair5 = certKeyPair4;
                                    cArr5 = cArr4;
                                    localDate = new fz.b.LocalDate(bVar12.dateConverter.l(studentCardData.getScope().getData().getExpireDate()));
                                    v24.b bVar216 = bVar12.documentsContainerRepository;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r18;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = vq.j.a(bVar14);
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = bVar14;
                                    aVar3.f209502k = vq.j.a(secretKey6);
                                    aVar3.f209503l = vq.j.a(bArr13);
                                    aVar3.f209504m = vq.j.a(bArr12);
                                    aVar3.f209505n = vq.j.a(bArr14);
                                    aVar3.f209506p = vq.j.a(bArr6);
                                    aVar3.f209507q = vq.j.a(studentPackageData2);
                                    aVar3.f209508r = vq.j.a(cArr5);
                                    aVar3.f209509s = vq.j.a(certKeyPair5);
                                    aVar3.f209510t = str4;
                                    aVar3.f209511v = vq.j.a(map7);
                                    aVar3.f209512w = vq.j.a(map6);
                                    aVar3.f209513x = vq.j.a(studentCardData);
                                    aVar3.f209514y = localDate;
                                    aVar3.f209515z = i57;
                                    aVar3.A = i59;
                                    aVar3.B = i58;
                                    aVar3.C = i45;
                                    aVar3.D = i65;
                                    aVar3.E = i66;
                                    aVar3.H = 8;
                                    objI = bVar216.i(str4, localDate, aVar3);
                                    if (objI == obj5) {
                                        return obj5;
                                    }
                                    studentCardData2 = studentCardData;
                                    objC2 = objI;
                                    map8 = map6;
                                    map9 = map7;
                                    cArr6 = cArr5;
                                    str5 = str4;
                                    localDate2 = localDate;
                                    bArr15 = bArr12;
                                    bVar15 = bVar14;
                                    r110 = r18;
                                    bVar14.a((dx.i) objC2);
                                    bVar16 = bVar12.containersInteractor;
                                    iVar = f24.i.STUDENT_CARD;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r110;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = vq.j.a(bVar15);
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = vq.j.a(secretKey6);
                                    aVar3.f209502k = vq.j.a(bArr13);
                                    aVar3.f209503l = vq.j.a(bArr15);
                                    aVar3.f209504m = vq.j.a(bArr14);
                                    aVar3.f209505n = vq.j.a(bArr6);
                                    aVar3.f209506p = vq.j.a(studentPackageData2);
                                    aVar3.f209507q = vq.j.a(cArr6);
                                    aVar3.f209508r = vq.j.a(certKeyPair5);
                                    aVar3.f209509s = vq.j.a(str5);
                                    aVar3.f209510t = vq.j.a(map9);
                                    aVar3.f209511v = vq.j.a(map8);
                                    aVar3.f209512w = vq.j.a(studentCardData2);
                                    aVar3.f209513x = vq.j.a(localDate2);
                                    aVar3.f209514y = null;
                                    aVar3.f209515z = i57;
                                    aVar3.A = i59;
                                    aVar3.B = i58;
                                    aVar3.C = i45;
                                    aVar3.D = i65;
                                    aVar3.E = i66;
                                    aVar3.H = 9;
                                    r15 = r110;
                                    if (bVar16.c(iVar, str5, localDate2, true, aVar3) == obj5) {
                                        return obj5;
                                    }
                                    bVar12.remoteLogger.F8("Saved document data for " + f24.i.STUDENT_CARD, px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 7:
                                    int i106 = aVar3.E;
                                    int i107 = aVar3.D;
                                    int i108 = aVar3.C;
                                    i58 = aVar3.B;
                                    i59 = aVar3.A;
                                    i57 = aVar3.f209515z;
                                    Map<String, ? extends CMSSignedData> map12 = (Map) aVar3.f209512w;
                                    Map map13 = (Map) aVar3.f209511v;
                                    String str12 = (String) aVar3.f209510t;
                                    certKeyPair4 = (CertKeyPair) aVar3.f209509s;
                                    cArr4 = (char[]) aVar3.f209508r;
                                    StudentPackageData studentPackageData10 = (StudentPackageData) aVar3.f209507q;
                                    byte[] bArr33 = (byte[]) aVar3.f209506p;
                                    bArr14 = (byte[]) aVar3.f209505n;
                                    byte[] bArr34 = (byte[]) aVar3.f209504m;
                                    byte[] bArr35 = (byte[]) aVar3.f209503l;
                                    SecretKey secretKey9 = (SecretKey) aVar3.f209502k;
                                    ex.b bVar36 = (ex.b) aVar3.f209501j;
                                    byte[] bArr36 = (byte[]) aVar3.f209500h;
                                    ex.b bVar37 = (ex.b) aVar3.f209499g;
                                    ex.b bVar38 = (ex.b) aVar3.f209498f;
                                    dx.j jVar9 = (dx.j) aVar3.f209497e;
                                    w24.a.Params params18 = (w24.a.Params) aVar3.f209496d;
                                    oq.u.b(objC2);
                                    bArr6 = bArr33;
                                    map6 = map12;
                                    str4 = str12;
                                    studentPackageData2 = studentPackageData10;
                                    r18 = jVar9;
                                    i45 = i108;
                                    bArr12 = bArr34;
                                    bArr13 = bArr35;
                                    secretKey6 = secretKey9;
                                    params3 = params18;
                                    i65 = i107;
                                    i66 = i106;
                                    bVar12 = bVar17;
                                    map7 = map13;
                                    bVar14 = bVar37;
                                    bVar6 = bVar38;
                                    obj5 = objE;
                                    bVar13 = bVar36;
                                    bArr3 = bArr36;
                                    studentCardData = (StudentCardData) bVar13.a((dx.i) objC2);
                                    certKeyPair5 = certKeyPair4;
                                    cArr5 = cArr4;
                                    localDate = new fz.b.LocalDate(bVar12.dateConverter.l(studentCardData.getScope().getData().getExpireDate()));
                                    v24.b bVar217 = bVar12.documentsContainerRepository;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r18;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = vq.j.a(bVar14);
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = bVar14;
                                    aVar3.f209502k = vq.j.a(secretKey6);
                                    aVar3.f209503l = vq.j.a(bArr13);
                                    aVar3.f209504m = vq.j.a(bArr12);
                                    aVar3.f209505n = vq.j.a(bArr14);
                                    aVar3.f209506p = vq.j.a(bArr6);
                                    aVar3.f209507q = vq.j.a(studentPackageData2);
                                    aVar3.f209508r = vq.j.a(cArr5);
                                    aVar3.f209509s = vq.j.a(certKeyPair5);
                                    aVar3.f209510t = str4;
                                    aVar3.f209511v = vq.j.a(map7);
                                    aVar3.f209512w = vq.j.a(map6);
                                    aVar3.f209513x = vq.j.a(studentCardData);
                                    aVar3.f209514y = localDate;
                                    aVar3.f209515z = i57;
                                    aVar3.A = i59;
                                    aVar3.B = i58;
                                    aVar3.C = i45;
                                    aVar3.D = i65;
                                    aVar3.E = i66;
                                    aVar3.H = 8;
                                    objI = bVar217.i(str4, localDate, aVar3);
                                    if (objI == obj5) {
                                        return obj5;
                                    }
                                    studentCardData2 = studentCardData;
                                    objC2 = objI;
                                    map8 = map6;
                                    map9 = map7;
                                    cArr6 = cArr5;
                                    str5 = str4;
                                    localDate2 = localDate;
                                    bArr15 = bArr12;
                                    bVar15 = bVar14;
                                    r110 = r18;
                                    bVar14.a((dx.i) objC2);
                                    bVar16 = bVar12.containersInteractor;
                                    iVar = f24.i.STUDENT_CARD;
                                    aVar3.f209496d = vq.j.a(params3);
                                    aVar3.f209497e = r110;
                                    aVar3.f209498f = vq.j.a(bVar6);
                                    aVar3.f209499g = vq.j.a(bVar15);
                                    aVar3.f209500h = vq.j.a(bArr3);
                                    aVar3.f209501j = vq.j.a(secretKey6);
                                    aVar3.f209502k = vq.j.a(bArr13);
                                    aVar3.f209503l = vq.j.a(bArr15);
                                    aVar3.f209504m = vq.j.a(bArr14);
                                    aVar3.f209505n = vq.j.a(bArr6);
                                    aVar3.f209506p = vq.j.a(studentPackageData2);
                                    aVar3.f209507q = vq.j.a(cArr6);
                                    aVar3.f209508r = vq.j.a(certKeyPair5);
                                    aVar3.f209509s = vq.j.a(str5);
                                    aVar3.f209510t = vq.j.a(map9);
                                    aVar3.f209511v = vq.j.a(map8);
                                    aVar3.f209512w = vq.j.a(studentCardData2);
                                    aVar3.f209513x = vq.j.a(localDate2);
                                    aVar3.f209514y = null;
                                    aVar3.f209515z = i57;
                                    aVar3.A = i59;
                                    aVar3.B = i58;
                                    aVar3.C = i45;
                                    aVar3.D = i65;
                                    aVar3.E = i66;
                                    aVar3.H = 9;
                                    r15 = r110;
                                    if (bVar16.c(iVar, str5, localDate2, true, aVar3) == obj5) {
                                        return obj5;
                                    }
                                    bVar12.remoteLogger.F8("Saved document data for " + f24.i.STUDENT_CARD, px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 8:
                                    int i109 = aVar3.E;
                                    int i110 = aVar3.D;
                                    int i111 = aVar3.C;
                                    i58 = aVar3.B;
                                    i59 = aVar3.A;
                                    i57 = aVar3.f209515z;
                                    localDate2 = (fz.b.LocalDate) aVar3.f209514y;
                                    StudentCardData studentCardData3 = (StudentCardData) aVar3.f209513x;
                                    Map<String, ? extends CMSSignedData> map14 = (Map) aVar3.f209512w;
                                    Map map15 = (Map) aVar3.f209511v;
                                    String str13 = (String) aVar3.f209510t;
                                    CertKeyPair certKeyPair9 = (CertKeyPair) aVar3.f209509s;
                                    cArr6 = (char[]) aVar3.f209508r;
                                    StudentPackageData studentPackageData11 = (StudentPackageData) aVar3.f209507q;
                                    byte[] bArr37 = (byte[]) aVar3.f209506p;
                                    byte[] bArr38 = (byte[]) aVar3.f209505n;
                                    byte[] bArr39 = (byte[]) aVar3.f209504m;
                                    byte[] bArr40 = (byte[]) aVar3.f209503l;
                                    SecretKey secretKey10 = (SecretKey) aVar3.f209502k;
                                    ex.b bVar39 = (ex.b) aVar3.f209501j;
                                    byte[] bArr41 = (byte[]) aVar3.f209500h;
                                    bVar15 = (ex.b) aVar3.f209499g;
                                    ex.b bVar40 = (ex.b) aVar3.f209498f;
                                    dx.j jVar10 = (dx.j) aVar3.f209497e;
                                    w24.a.Params params19 = (w24.a.Params) aVar3.f209496d;
                                    try {
                                        oq.u.b(objC2);
                                        str5 = str13;
                                        r110 = jVar10;
                                        studentPackageData2 = studentPackageData11;
                                        bArr14 = bArr38;
                                        secretKey6 = secretKey10;
                                        certKeyPair5 = certKeyPair9;
                                        obj5 = objE;
                                        bArr15 = bArr39;
                                        params3 = params19;
                                        bVar12 = bVar17;
                                        bVar14 = bVar39;
                                        bVar6 = bVar40;
                                        bArr6 = bArr37;
                                        bArr13 = bArr40;
                                        bArr3 = bArr41;
                                        map9 = map15;
                                        map8 = map14;
                                        studentCardData2 = studentCardData3;
                                        i45 = i111;
                                        i65 = i110;
                                        i66 = i109;
                                        bVar14.a((dx.i) objC2);
                                        bVar16 = bVar12.containersInteractor;
                                        iVar = f24.i.STUDENT_CARD;
                                        aVar3.f209496d = vq.j.a(params3);
                                        aVar3.f209497e = r110;
                                        aVar3.f209498f = vq.j.a(bVar6);
                                        aVar3.f209499g = vq.j.a(bVar15);
                                        aVar3.f209500h = vq.j.a(bArr3);
                                        aVar3.f209501j = vq.j.a(secretKey6);
                                        aVar3.f209502k = vq.j.a(bArr13);
                                        aVar3.f209503l = vq.j.a(bArr15);
                                        aVar3.f209504m = vq.j.a(bArr14);
                                        aVar3.f209505n = vq.j.a(bArr6);
                                        aVar3.f209506p = vq.j.a(studentPackageData2);
                                        aVar3.f209507q = vq.j.a(cArr6);
                                        aVar3.f209508r = vq.j.a(certKeyPair5);
                                        aVar3.f209509s = vq.j.a(str5);
                                        aVar3.f209510t = vq.j.a(map9);
                                        aVar3.f209511v = vq.j.a(map8);
                                        aVar3.f209512w = vq.j.a(studentCardData2);
                                        aVar3.f209513x = vq.j.a(localDate2);
                                        aVar3.f209514y = null;
                                        aVar3.f209515z = i57;
                                        aVar3.A = i59;
                                        aVar3.B = i58;
                                        aVar3.C = i45;
                                        aVar3.D = i65;
                                        aVar3.E = i66;
                                        aVar3.H = 9;
                                        r15 = r110;
                                        if (bVar16.c(iVar, str5, localDate2, true, aVar3) == obj5) {
                                            return obj5;
                                        }
                                        bVar12.remoteLogger.F8("Saved document data for " + f24.i.STUDENT_CARD, px.d.a.GENERAL);
                                        return new dx.i.Right(oq.i0.f148189a);
                                    } catch (ex.c e56) {
                                        e = e56;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e57) {
                                        throw e57;
                                    } catch (Exception e58) {
                                        e = e58;
                                        r25 = jVar10;
                                        px.f fVar8 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar8.d(message, e, px.c.a(r25));
                                        iVarA = r25.a(e);
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
                                case 9:
                                    dx.j jVar11 = (dx.j) aVar3.f209497e;
                                    oq.u.b(objC2);
                                    r15 = jVar11;
                                    bVar12 = bVar17;
                                    bVar12.remoteLogger.F8("Saved document data for " + f24.i.STUDENT_CARD, px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (CancellationException e59) {
                            throw e59;
                        }
                    } catch (Exception e65) {
                        e = e65;
                    }
                } catch (ex.c e66) {
                    e = e66;
                } catch (CancellationException e67) {
                    throw e67;
                }
            } catch (ex.c e68) {
                e = e68;
            } catch (CancellationException e69) {
                throw e69;
            } catch (Exception e75) {
                e = e75;
                r25 = obj2;
            }
        } catch (ex.c e76) {
            e = e76;
        } catch (CancellationException e77) {
            throw e77;
        } catch (Exception e78) {
            e = e78;
            r25 = obj;
        }
    }
}
