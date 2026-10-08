package j74;

import c74.WKAuthSigningParams;
import dx.i;
import dx.j;
import iy.b0;
import iy.c0;
import java.time.OffsetDateTime;
import java.util.concurrent.CancellationException;
import k34.u;
import my.JWSHeaderData;
import my.JWSPayloadData;
import ny.JWSETokenPair;
import oq.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import q34.z0;
import qp0.JWSSigningParams;
import ry.CertKeyPair;
import ry.n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lj74/b;", "Ld74/b;", "Lrp0/a;", "getJWSSigningParamsUC", "Lj74/f;", "parseJwseForMIDUC", "Liy/a;", "base64Coder", "Lac4/d;", "getCurrentServerTimeUseCase", "Lq34/z0;", "getPeselFromPersonalIdCertificate", "Lez/c;", "dateConverter", "Lh74/a;", "wkContainersInteractor", "<init>", "(Lrp0/a;Lj74/f;Liy/a;Lac4/d;Lq34/z0;Lez/c;Lh74/a;)V", "Ld74/b$a;", "params", "Ldx/i;", "Ldx/b;", "Lny/b;", "d", "(Ld74/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lrp0/a;", "b", "Lj74/f;", "c", "Liy/a;", "Lac4/d;", "e", "Lq34/z0;", "f", "Lez/c;", "g", "Lh74/a;", "wk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements d74.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rp0.a getJWSSigningParamsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f parseJwseForMIDUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.d getCurrentServerTimeUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z0 getPeselFromPersonalIdCertificate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h74.a wkContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        int A;
        int B;
        int C;
        int D;
        int E;
        int F;
        int G;
        int H;
        /* synthetic */ Object I;
        int L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f99928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f99929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f99930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f99931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f99932h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f99933j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f99934k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f99935l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f99936m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f99937n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f99938p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f99939q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f99940r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f99941s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f99942t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f99943v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f99944w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f99945x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f99946y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f99947z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.I = obj;
            this.L |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(rp0.a aVar, f fVar, iy.a aVar2, ac4.d dVar, z0 z0Var, ez.c cVar, h74.a aVar3) {
        this.getJWSSigningParamsUC = aVar;
        this.parseJwseForMIDUC = fVar;
        this.base64Coder = aVar2;
        this.getCurrentServerTimeUseCase = dVar;
        this.getPeselFromPersonalIdCertificate = z0Var;
        this.dateConverter = cVar;
        this.wkContainersInteractor = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0327 A[Catch: Exception -> 0x0079, c -> 0x007d, CancellationException -> 0x0081, TRY_LEAVE, TryCatch #18 {c -> 0x007d, CancellationException -> 0x0081, Exception -> 0x0079, blocks: (B:16:0x0073, B:95:0x0315, B:99:0x0323, B:101:0x0327, B:71:0x0274, B:74:0x027b, B:76:0x027f, B:78:0x0293, B:79:0x0298, B:64:0x0228, B:66:0x0231, B:80:0x0299, B:82:0x029d), top: B:211:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0376  */
    /* JADX WARN: Code duplicated, block: B:105:0x037a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0395  */
    /* JADX WARN: Code duplicated, block: B:109:0x0399 A[Catch: Exception -> 0x05db, c -> 0x05e0, CancellationException -> 0x05e4, TryCatch #16 {c -> 0x05e0, CancellationException -> 0x05e4, Exception -> 0x05db, blocks: (B:106:0x038b, B:109:0x0399, B:111:0x039d, B:102:0x0334), top: B:223:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x039d A[Catch: Exception -> 0x05db, c -> 0x05e0, CancellationException -> 0x05e4, TRY_LEAVE, TryCatch #16 {c -> 0x05e0, CancellationException -> 0x05e4, Exception -> 0x05db, blocks: (B:106:0x038b, B:109:0x0399, B:111:0x039d, B:102:0x0334), top: B:223:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0431  */
    /* JADX WARN: Code duplicated, block: B:120:0x045f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0463 A[Catch: Exception -> 0x05c9, c -> 0x05cd, CancellationException -> 0x05d1, TryCatch #21 {c -> 0x05cd, CancellationException -> 0x05d1, Exception -> 0x05c9, blocks: (B:118:0x0455, B:122:0x0463, B:124:0x0467, B:153:0x05d5, B:154:0x05da), top: B:216:0x0455 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0467 A[Catch: Exception -> 0x05c9, c -> 0x05cd, CancellationException -> 0x05d1, TRY_LEAVE, TryCatch #21 {c -> 0x05cd, CancellationException -> 0x05d1, Exception -> 0x05c9, blocks: (B:118:0x0455, B:122:0x0463, B:124:0x0467, B:153:0x05d5, B:154:0x05da), top: B:216:0x0455 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0571  */
    /* JADX WARN: Code duplicated, block: B:133:0x057f A[Catch: Exception -> 0x059d, c -> 0x05a0, CancellationException -> 0x05a3, TryCatch #7 {Exception -> 0x059d, blocks: (B:129:0x0573, B:131:0x057b, B:133:0x057f, B:135:0x0583, B:136:0x0590, B:143:0x05a6, B:144:0x05ab, B:145:0x05ac, B:146:0x05c8, B:193:0x062c, B:196:0x063a, B:113:0x03ac, B:162:0x05eb, B:163:0x05f0, B:164:0x05f1, B:165:0x05f7, B:191:0x0626, B:192:0x062b), top: B:211:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0583 A[Catch: Exception -> 0x059d, c -> 0x05a0, CancellationException -> 0x05a3, TryCatch #7 {Exception -> 0x059d, blocks: (B:129:0x0573, B:131:0x057b, B:133:0x057f, B:135:0x0583, B:136:0x0590, B:143:0x05a6, B:144:0x05ab, B:145:0x05ac, B:146:0x05c8, B:193:0x062c, B:196:0x063a, B:113:0x03ac, B:162:0x05eb, B:163:0x05f0, B:164:0x05f1, B:165:0x05f7, B:191:0x0626, B:192:0x062b), top: B:211:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:143:0x05a6 A[Catch: Exception -> 0x059d, c -> 0x05a0, CancellationException -> 0x05a3, TryCatch #7 {Exception -> 0x059d, blocks: (B:129:0x0573, B:131:0x057b, B:133:0x057f, B:135:0x0583, B:136:0x0590, B:143:0x05a6, B:144:0x05ab, B:145:0x05ac, B:146:0x05c8, B:193:0x062c, B:196:0x063a, B:113:0x03ac, B:162:0x05eb, B:163:0x05f0, B:164:0x05f1, B:165:0x05f7, B:191:0x0626, B:192:0x062b), top: B:211:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:145:0x05ac A[Catch: Exception -> 0x059d, c -> 0x05a0, CancellationException -> 0x05a3, TryCatch #7 {Exception -> 0x059d, blocks: (B:129:0x0573, B:131:0x057b, B:133:0x057f, B:135:0x0583, B:136:0x0590, B:143:0x05a6, B:144:0x05ab, B:145:0x05ac, B:146:0x05c8, B:193:0x062c, B:196:0x063a, B:113:0x03ac, B:162:0x05eb, B:163:0x05f0, B:164:0x05f1, B:165:0x05f7, B:191:0x0626, B:192:0x062b), top: B:211:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:153:0x05d5 A[Catch: Exception -> 0x05c9, c -> 0x05cd, CancellationException -> 0x05d1, TRY_ENTER, TryCatch #21 {c -> 0x05cd, CancellationException -> 0x05d1, Exception -> 0x05c9, blocks: (B:118:0x0455, B:122:0x0463, B:124:0x0467, B:153:0x05d5, B:154:0x05da), top: B:216:0x0455 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:164:0x05f1 A[Catch: Exception -> 0x059d, c -> 0x05a0, CancellationException -> 0x05a3, TryCatch #7 {Exception -> 0x059d, blocks: (B:129:0x0573, B:131:0x057b, B:133:0x057f, B:135:0x0583, B:136:0x0590, B:143:0x05a6, B:144:0x05ab, B:145:0x05ac, B:146:0x05c8, B:193:0x062c, B:196:0x063a, B:113:0x03ac, B:162:0x05eb, B:163:0x05f0, B:164:0x05f1, B:165:0x05f7, B:191:0x0626, B:192:0x062b), top: B:211:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0616  */
    /* JADX WARN: Code duplicated, block: B:199:0x0643  */
    /* JADX WARN: Code duplicated, block: B:202:0x0654  */
    /* JADX WARN: Code duplicated, block: B:203:0x0662  */
    /* JADX WARN: Code duplicated, block: B:205:0x0666  */
    /* JADX WARN: Code duplicated, block: B:208:0x0673  */
    /* JADX WARN: Code duplicated, block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b8 A[Catch: Exception -> 0x0607, c -> 0x060c, CancellationException -> 0x0611, TryCatch #17 {c -> 0x060c, CancellationException -> 0x0611, Exception -> 0x0607, blocks: (B:84:0x02b1, B:87:0x02b8, B:89:0x02bc), top: B:221:0x02b1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x02bc A[Catch: Exception -> 0x0607, c -> 0x060c, CancellationException -> 0x0611, TRY_LEAVE, TryCatch #17 {c -> 0x060c, CancellationException -> 0x0611, Exception -> 0x0607, blocks: (B:84:0x02b1, B:87:0x02b8, B:89:0x02bc), top: B:221:0x02b1 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0304  */
    /* JADX WARN: Code duplicated, block: B:97:0x031f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0323 A[Catch: Exception -> 0x0079, c -> 0x007d, CancellationException -> 0x0081, TryCatch #18 {c -> 0x007d, CancellationException -> 0x0081, Exception -> 0x0079, blocks: (B:16:0x0073, B:95:0x0315, B:99:0x0323, B:101:0x0327, B:71:0x0274, B:74:0x027b, B:76:0x027f, B:78:0x0293, B:79:0x0298, B:64:0x0228, B:66:0x0231, B:80:0x0299, B:82:0x029d), top: B:211:0x002b }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(d74.b.a aVar, tq.e<? super i<? extends dx.b, JWSETokenPair>> eVar) throws Throwable {
        a aVar2;
        ?? r15;
        String message;
        i iVarA;
        Object objB;
        ex.b aVar3;
        i right;
        d74.b.a aVar4;
        ex.b bVar;
        ex.b bVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Object objC;
        ex.b bVar3;
        j<dx.b> jVar;
        j<dx.b> jVar2;
        WKAuthSigningParams wKAuthSigningParams;
        i iVar;
        int i25;
        Object objC2;
        Object obj;
        WKAuthSigningParams wKAuthSigningParams2;
        int i26;
        j<dx.b> jVar3;
        int i27;
        int i28;
        ex.b bVar4;
        d74.b.a aVar5;
        int i29;
        int i35;
        int i36;
        ex.b bVar5;
        int i37;
        j<dx.b> jVar4;
        i iVar2;
        ex.b bVar6;
        u uVar;
        Object objB2;
        int i38;
        int i39;
        i iVar3;
        int i45;
        ex.b bVar7;
        Object obj2;
        int i46;
        int i47;
        int i48;
        WKAuthSigningParams wKAuthSigningParams3;
        int i49;
        int i55;
        u uVar2;
        i iVar4;
        CertKeyPair certKeyPair;
        int i56;
        b bVar8;
        int i57;
        int i58;
        int i59;
        b0 b0VarG;
        int i65;
        Object objC3;
        i iVar5;
        CertKeyPair certKeyPair2;
        int i66;
        int i67;
        d74.b.a aVar6;
        i iVar6;
        Object obj3;
        j<dx.b> jVar5;
        WKAuthSigningParams wKAuthSigningParams4;
        int i68;
        int i69;
        u uVar3;
        int i75;
        int i76;
        ex.b bVar9;
        b0 b0Var;
        int i77;
        int i78;
        int i79;
        Object obj4;
        int i85;
        int i86;
        i iVar7;
        int i87;
        Object obj5;
        ex.b bVar10;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i88 = aVar2.L;
            if ((i88 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.L = i88 - PKIFailureInfo.systemUnavail;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        Object objG = aVar2.I;
        Object objE = uq.b.e();
        int i89 = aVar2.L;
        try {
            try {
                try {
                    try {
                        try {
                            if (i89 == 0) {
                                oq.u.b(objG);
                                j<dx.b> jVarA = xw.c.f221622a.a();
                                aVar3 = new ex.a();
                                if (aVar instanceof d74.b.a.Default) {
                                    rp0.a aVar7 = this.getJWSSigningParamsUC;
                                    rp0.a.Params params = new rp0.a.Params(i74.a.a(((d74.b.a.Default) aVar).getProcessType()));
                                    aVar2.f99928d = vq.j.a(aVar);
                                    aVar2.f99929e = jVarA;
                                    aVar2.f99930f = vq.j.a(aVar3);
                                    aVar2.f99931g = aVar3;
                                    aVar2.f99932h = aVar3;
                                    aVar2.f99943v = 0;
                                    aVar2.f99944w = 0;
                                    aVar2.f99945x = 0;
                                    aVar2.f99946y = 0;
                                    aVar2.f99947z = 0;
                                    aVar2.L = 1;
                                    objC = aVar7.c(params, aVar2);
                                    if (objC != objE) {
                                        aVar4 = aVar;
                                        bVar = aVar3;
                                        bVar3 = bVar;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        i19 = 0;
                                        jVar4 = jVarA;
                                    }
                                    return objE;
                                }
                                if (!(aVar instanceof d74.b.a.QualifiedSignature)) {
                                    throw new p();
                                }
                                right = new i.Right(((d74.b.a.QualifiedSignature) aVar).getSigningParams());
                                aVar4 = aVar;
                                bVar = aVar3;
                                bVar2 = bVar;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                jVar = jVarA;
                                if (!(right instanceof i.Left)) {
                                    if (right instanceof i.Right) {
                                        jVar2 = jVar;
                                        try {
                                            throw new p();
                                        } catch (ex.c e15) {
                                            e = e15;
                                            return new i.Left((dx.b) ex.d.a(e));
                                        } catch (CancellationException e16) {
                                            e = e16;
                                            throw e;
                                        } catch (Exception e17) {
                                            e = e17;
                                            r15 = jVar2;
                                            px.f fVar = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            fVar.d(message, e, px.c.a(r15));
                                            iVarA = r15.a(e);
                                            if (iVarA instanceof i.Left) {
                                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                            } else {
                                                if (iVarA instanceof i.Right) {
                                                    throw new p();
                                                }
                                                objB = ((i.Right) iVarA).b();
                                            }
                                            return new i.Left(objB);
                                        }
                                    }
                                    wKAuthSigningParams = (WKAuthSigningParams) ((i.Right) right).b();
                                    h74.a aVar8 = this.wkContainersInteractor;
                                    iVar = right;
                                    aVar2.f99928d = vq.j.a(aVar4);
                                    aVar2.f99929e = jVar;
                                    aVar2.f99930f = vq.j.a(bVar2);
                                    aVar2.f99931g = bVar;
                                    aVar2.f99932h = vq.j.a(iVar);
                                    aVar2.f99933j = aVar3;
                                    aVar2.f99934k = wKAuthSigningParams;
                                    aVar2.f99943v = i17;
                                    aVar2.f99944w = i16;
                                    aVar2.f99945x = i15;
                                    aVar2.f99946y = i18;
                                    aVar2.f99947z = i19;
                                    aVar2.A = 0;
                                    aVar2.B = 0;
                                    aVar2.L = 2;
                                    jVar2 = jVar;
                                    i25 = i16;
                                    try {
                                        objC2 = h74.a.c(aVar8, false, aVar2, 1, null);
                                        if (objC2 == objE) {
                                            obj = objC2;
                                            wKAuthSigningParams2 = wKAuthSigningParams;
                                            i26 = i18;
                                            jVar3 = jVar2;
                                            i27 = 0;
                                            i28 = 0;
                                            bVar4 = aVar3;
                                            aVar5 = aVar4;
                                            i29 = i17;
                                            i35 = i15;
                                            i36 = i19;
                                            bVar5 = bVar;
                                            i37 = i25;
                                            iVar2 = (i) obj;
                                            bVar6 = bVar2;
                                            if (!(iVar2 instanceof i.Left)) {
                                                if (!(iVar2 instanceof i.Right)) {
                                                    throw new p();
                                                }
                                                uVar = (u) ((i.Right) iVar2).b();
                                                h74.a aVar9 = this.wkContainersInteractor;
                                                aVar2.f99928d = vq.j.a(aVar5);
                                                aVar2.f99929e = jVar3;
                                                aVar2.f99930f = vq.j.a(bVar6);
                                                aVar2.f99931g = bVar5;
                                                aVar2.f99932h = vq.j.a(iVar);
                                                aVar2.f99933j = bVar4;
                                                aVar2.f99934k = wKAuthSigningParams2;
                                                aVar2.f99935l = vq.j.a(iVar2);
                                                aVar2.f99936m = vq.j.a(uVar);
                                                aVar2.f99943v = i29;
                                                aVar2.f99944w = i37;
                                                aVar2.f99945x = i35;
                                                aVar2.f99946y = i26;
                                                aVar2.f99947z = i36;
                                                aVar2.A = i28;
                                                aVar2.B = i27;
                                                aVar2.C = 0;
                                                aVar2.D = 0;
                                                aVar2.L = 3;
                                                objB2 = aVar9.b(uVar, aVar2);
                                                if (objB2 == objE) {
                                                    i38 = i26;
                                                    i39 = i29;
                                                    iVar3 = iVar2;
                                                    i45 = 0;
                                                    bVar7 = bVar6;
                                                    obj2 = objB2;
                                                    i46 = i27;
                                                    i47 = i35;
                                                    i48 = i37;
                                                    wKAuthSigningParams3 = wKAuthSigningParams2;
                                                    i49 = i36;
                                                    i55 = 0;
                                                    jVar3 = jVar3;
                                                    uVar2 = uVar;
                                                    iVar4 = (i) obj2;
                                                    if (iVar4 instanceof i.Left) {
                                                        iVar2 = iVar4;
                                                    } else {
                                                        if (iVar4 instanceof i.Right) {
                                                            throw new p();
                                                        }
                                                        certKeyPair = (CertKeyPair) ((i.Right) iVar4).b();
                                                        i56 = i45;
                                                        bVar8 = this;
                                                        i57 = i46;
                                                        i58 = i49;
                                                        i59 = i28;
                                                        b0VarG = c0.g(iy.a.e(bVar8.base64Coder, certKeyPair.getCertificate().getEncoded(), null, 2, null));
                                                        z0 z0Var = bVar8.getPeselFromPersonalIdCertificate;
                                                        z0.a.CertC509CertString certC509CertString = new z0.a.CertC509CertString(b0VarG);
                                                        aVar2.f99928d = vq.j.a(aVar5);
                                                        aVar2.f99929e = jVar3;
                                                        aVar2.f99930f = vq.j.a(bVar7);
                                                        aVar2.f99931g = bVar5;
                                                        aVar2.f99932h = vq.j.a(iVar);
                                                        aVar2.f99933j = bVar4;
                                                        aVar2.f99934k = wKAuthSigningParams3;
                                                        aVar2.f99935l = vq.j.a(iVar3);
                                                        aVar2.f99936m = vq.j.a(uVar2);
                                                        aVar2.f99937n = vq.j.a(iVar4);
                                                        aVar2.f99938p = certKeyPair;
                                                        aVar2.f99939q = b0VarG;
                                                        aVar2.f99943v = i39;
                                                        aVar2.f99944w = i48;
                                                        aVar2.f99945x = i47;
                                                        aVar2.f99946y = i38;
                                                        aVar2.f99947z = i58;
                                                        i65 = i47;
                                                        aVar2.A = i59;
                                                        aVar2.B = i57;
                                                        aVar2.C = i56;
                                                        aVar2.D = i55;
                                                        aVar2.E = 0;
                                                        aVar2.F = 0;
                                                        aVar2.L = 4;
                                                        objC3 = z0Var.c(certC509CertString, aVar2);
                                                        if (objC3 == objE) {
                                                            return objE;
                                                        }
                                                        iVar5 = iVar4;
                                                        certKeyPair2 = certKeyPair;
                                                        i66 = i39;
                                                        i67 = i38;
                                                        aVar6 = aVar5;
                                                        iVar6 = iVar3;
                                                        obj3 = objC3;
                                                        jVar5 = jVar3;
                                                        wKAuthSigningParams4 = wKAuthSigningParams3;
                                                        i68 = i58;
                                                        i69 = i65;
                                                        uVar3 = uVar2;
                                                        i75 = i57;
                                                        i76 = i55;
                                                        bVar9 = bVar4;
                                                        b0Var = b0VarG;
                                                        i77 = i56;
                                                        i78 = i59;
                                                        i79 = 0;
                                                        obj4 = objE;
                                                        i85 = i48;
                                                        i86 = 0;
                                                        iVar7 = (i) obj3;
                                                        i87 = i86;
                                                        if (!(iVar7 instanceof i.Left)) {
                                                            if (!(iVar7 instanceof i.Right)) {
                                                                throw new p();
                                                            }
                                                            z0.Result result = (z0.Result) ((i.Right) iVar7).b();
                                                            OffsetDateTime offsetDateTimeA = bVar8.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                                                            f fVar2 = bVar8.parseJwseForMIDUC;
                                                            f.Params aVar10 = new f.Params(new JWSHeaderData(n.b.C4515b.f176854d, null, v.e(c0.e(b0Var)), null, 10, null), new JWSPayloadData("mObywatel", c0.e(result.getPesel()), bVar8.dateConverter.d(offsetDateTimeA.plusSeconds(gu.b.F(wKAuthSigningParams4.getTokenTtlInSeconds()))), bVar8.dateConverter.d(offsetDateTimeA), new JWSPayloadData.a.Multiple(wKAuthSigningParams4.f()), null, null, wKAuthSigningParams4.c(), 96, null), wKAuthSigningParams4.getEncryptionKeyId(), wKAuthSigningParams4.getEncryptionKey(), certKeyPair2.getPrivateKey());
                                                            aVar2.f99928d = vq.j.a(aVar6);
                                                            aVar2.f99929e = jVar5;
                                                            aVar2.f99930f = vq.j.a(bVar7);
                                                            aVar2.f99931g = bVar5;
                                                            aVar2.f99932h = vq.j.a(iVar);
                                                            aVar2.f99933j = bVar9;
                                                            aVar2.f99934k = vq.j.a(wKAuthSigningParams4);
                                                            aVar2.f99935l = vq.j.a(iVar6);
                                                            aVar2.f99936m = vq.j.a(uVar3);
                                                            aVar2.f99937n = vq.j.a(iVar5);
                                                            aVar2.f99938p = vq.j.a(certKeyPair2);
                                                            aVar2.f99939q = vq.j.a(iVar7);
                                                            aVar2.f99940r = vq.j.a(b0Var);
                                                            aVar2.f99941s = vq.j.a(result);
                                                            aVar2.f99942t = vq.j.a(offsetDateTimeA);
                                                            aVar2.f99943v = i66;
                                                            aVar2.f99944w = i85;
                                                            aVar2.f99945x = i69;
                                                            aVar2.f99946y = i67;
                                                            aVar2.f99947z = i68;
                                                            aVar2.A = i78;
                                                            aVar2.B = i75;
                                                            aVar2.C = i77;
                                                            aVar2.D = i76;
                                                            aVar2.E = i87;
                                                            aVar2.F = i79;
                                                            aVar2.G = 0;
                                                            aVar2.H = 0;
                                                            aVar2.L = 5;
                                                            objG = fVar2.g(aVar10, aVar2);
                                                            obj5 = obj4;
                                                            if (objG == obj5) {
                                                                return obj5;
                                                            }
                                                            bVar10 = bVar5;
                                                            iVar7 = (i) objG;
                                                            bVar5 = bVar10;
                                                        }
                                                        bVar4 = bVar9;
                                                        iVar2 = iVar7;
                                                    }
                                                }
                                            }
                                            aVar3 = bVar4;
                                            if (!(iVar2 instanceof i.Left)) {
                                                bVar5.b(new dx.b.Generic(new Exception("IdentityType for main identity is null")));
                                                throw new oq.g();
                                            }
                                            if (iVar2 instanceof i.Right) {
                                                throw new p();
                                            }
                                            right = new i.Right((JWSETokenPair) ((i.Right) iVar2).b());
                                        }
                                        return objE;
                                    } catch (ex.c e18) {
                                        e = e18;
                                    } catch (CancellationException e19) {
                                        e = e19;
                                        throw e;
                                    } catch (Exception e25) {
                                        e = e25;
                                        r15 = jVar2;
                                        px.f fVar3 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar3.d(message, e, px.c.a(r15));
                                        iVarA = r15.a(e);
                                        if (iVarA instanceof i.Left) {
                                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof i.Right) {
                                                throw new p();
                                            }
                                            objB = ((i.Right) iVarA).b();
                                        }
                                        return new i.Left(objB);
                                    }
                                    return new i.Left((dx.b) ex.d.a(e));
                                }
                                return new i.Right((JWSETokenPair) aVar3.a(right));
                                return objE;
                            }
                            if (i89 == 1) {
                                int i95 = aVar2.f99947z;
                                int i96 = aVar2.f99946y;
                                int i97 = aVar2.f99945x;
                                i16 = aVar2.f99944w;
                                i17 = aVar2.f99943v;
                                aVar3 = (ex.b) aVar2.f99932h;
                                bVar = (ex.b) aVar2.f99931g;
                                bVar3 = (ex.b) aVar2.f99930f;
                                j<dx.b> jVar6 = (j) aVar2.f99929e;
                                aVar4 = (d74.b.a) aVar2.f99928d;
                                try {
                                    oq.u.b(objG);
                                    i19 = i95;
                                    i15 = i97;
                                    jVar4 = jVar6;
                                    i18 = i96;
                                    objC = objG;
                                } catch (ex.c e26) {
                                    e = e26;
                                } catch (CancellationException e27) {
                                    throw e27;
                                } catch (Exception e28) {
                                    e = e28;
                                    r15 = jVar6;
                                    px.f fVar4 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar4.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
                                    if (iVarA instanceof i.Left) {
                                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof i.Right) {
                                            throw new p();
                                        }
                                        objB = ((i.Right) iVarA).b();
                                    }
                                    return new i.Left(objB);
                                }
                            } else if (i89 == 2) {
                                int i98 = aVar2.B;
                                int i99 = aVar2.A;
                                int i100 = aVar2.f99947z;
                                i26 = aVar2.f99946y;
                                i35 = aVar2.f99945x;
                                i37 = aVar2.f99944w;
                                int i101 = aVar2.f99943v;
                                wKAuthSigningParams2 = (WKAuthSigningParams) aVar2.f99934k;
                                ex.b bVar11 = (ex.b) aVar2.f99933j;
                                i iVar8 = (i) aVar2.f99932h;
                                bVar5 = (ex.b) aVar2.f99931g;
                                bVar2 = (ex.b) aVar2.f99930f;
                                j<dx.b> jVar7 = (j) aVar2.f99929e;
                                d74.b.a aVar11 = (d74.b.a) aVar2.f99928d;
                                try {
                                    oq.u.b(objG);
                                    obj = objG;
                                    aVar5 = aVar11;
                                    i27 = i98;
                                    i36 = i100;
                                    jVar3 = jVar7;
                                    i29 = i101;
                                    bVar4 = bVar11;
                                    i28 = i99;
                                    iVar = iVar8;
                                    iVar2 = (i) obj;
                                    bVar6 = bVar2;
                                    if (!(iVar2 instanceof i.Left)) {
                                        if (!(iVar2 instanceof i.Right)) {
                                            throw new p();
                                        }
                                        uVar = (u) ((i.Right) iVar2).b();
                                        h74.a aVar12 = this.wkContainersInteractor;
                                        try {
                                            aVar2.f99928d = vq.j.a(aVar5);
                                            aVar2.f99929e = jVar3;
                                            aVar2.f99930f = vq.j.a(bVar6);
                                            aVar2.f99931g = bVar5;
                                            aVar2.f99932h = vq.j.a(iVar);
                                            aVar2.f99933j = bVar4;
                                            aVar2.f99934k = wKAuthSigningParams2;
                                            aVar2.f99935l = vq.j.a(iVar2);
                                            aVar2.f99936m = vq.j.a(uVar);
                                            aVar2.f99943v = i29;
                                            aVar2.f99944w = i37;
                                            aVar2.f99945x = i35;
                                            aVar2.f99946y = i26;
                                            aVar2.f99947z = i36;
                                            aVar2.A = i28;
                                            aVar2.B = i27;
                                            aVar2.C = 0;
                                            aVar2.D = 0;
                                            aVar2.L = 3;
                                            objB2 = aVar12.b(uVar, aVar2);
                                            if (objB2 == objE) {
                                                return objE;
                                            }
                                            i38 = i26;
                                            i39 = i29;
                                            iVar3 = iVar2;
                                            i45 = 0;
                                            bVar7 = bVar6;
                                            obj2 = objB2;
                                            i46 = i27;
                                            i47 = i35;
                                            i48 = i37;
                                            wKAuthSigningParams3 = wKAuthSigningParams2;
                                            i49 = i36;
                                            i55 = 0;
                                            jVar3 = jVar3;
                                            uVar2 = uVar;
                                            iVar4 = (i) obj2;
                                            if (iVar4 instanceof i.Left) {
                                                iVar2 = iVar4;
                                            } else {
                                                if (iVar4 instanceof i.Right) {
                                                    throw new p();
                                                }
                                                certKeyPair = (CertKeyPair) ((i.Right) iVar4).b();
                                                i56 = i45;
                                                bVar8 = this;
                                                i57 = i46;
                                                i58 = i49;
                                                i59 = i28;
                                                b0VarG = c0.g(iy.a.e(bVar8.base64Coder, certKeyPair.getCertificate().getEncoded(), null, 2, null));
                                                z0 z0Var2 = bVar8.getPeselFromPersonalIdCertificate;
                                                z0.a.CertC509CertString certC509CertString2 = new z0.a.CertC509CertString(b0VarG);
                                                aVar2.f99928d = vq.j.a(aVar5);
                                                aVar2.f99929e = jVar3;
                                                aVar2.f99930f = vq.j.a(bVar7);
                                                aVar2.f99931g = bVar5;
                                                aVar2.f99932h = vq.j.a(iVar);
                                                aVar2.f99933j = bVar4;
                                                aVar2.f99934k = wKAuthSigningParams3;
                                                aVar2.f99935l = vq.j.a(iVar3);
                                                aVar2.f99936m = vq.j.a(uVar2);
                                                aVar2.f99937n = vq.j.a(iVar4);
                                                aVar2.f99938p = certKeyPair;
                                                aVar2.f99939q = b0VarG;
                                                aVar2.f99943v = i39;
                                                aVar2.f99944w = i48;
                                                aVar2.f99945x = i47;
                                                aVar2.f99946y = i38;
                                                aVar2.f99947z = i58;
                                                i65 = i47;
                                                aVar2.A = i59;
                                                aVar2.B = i57;
                                                aVar2.C = i56;
                                                aVar2.D = i55;
                                                aVar2.E = 0;
                                                aVar2.F = 0;
                                                aVar2.L = 4;
                                                objC3 = z0Var2.c(certC509CertString2, aVar2);
                                                if (objC3 == objE) {
                                                    return objE;
                                                }
                                                iVar5 = iVar4;
                                                certKeyPair2 = certKeyPair;
                                                i66 = i39;
                                                i67 = i38;
                                                aVar6 = aVar5;
                                                iVar6 = iVar3;
                                                obj3 = objC3;
                                                jVar5 = jVar3;
                                                wKAuthSigningParams4 = wKAuthSigningParams3;
                                                i68 = i58;
                                                i69 = i65;
                                                uVar3 = uVar2;
                                                i75 = i57;
                                                i76 = i55;
                                                bVar9 = bVar4;
                                                b0Var = b0VarG;
                                                i77 = i56;
                                                i78 = i59;
                                                i79 = 0;
                                                obj4 = objE;
                                                i85 = i48;
                                                i86 = 0;
                                                iVar7 = (i) obj3;
                                                i87 = i86;
                                                if (!(iVar7 instanceof i.Left)) {
                                                    if (!(iVar7 instanceof i.Right)) {
                                                        throw new p();
                                                    }
                                                    z0.Result result2 = (z0.Result) ((i.Right) iVar7).b();
                                                    OffsetDateTime offsetDateTimeA2 = bVar8.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                                                    f fVar5 = bVar8.parseJwseForMIDUC;
                                                    f.Params aVar13 = new f.Params(new JWSHeaderData(n.b.C4515b.f176854d, null, v.e(c0.e(b0Var)), null, 10, null), new JWSPayloadData("mObywatel", c0.e(result2.getPesel()), bVar8.dateConverter.d(offsetDateTimeA2.plusSeconds(gu.b.F(wKAuthSigningParams4.getTokenTtlInSeconds()))), bVar8.dateConverter.d(offsetDateTimeA2), new JWSPayloadData.a.Multiple(wKAuthSigningParams4.f()), null, null, wKAuthSigningParams4.c(), 96, null), wKAuthSigningParams4.getEncryptionKeyId(), wKAuthSigningParams4.getEncryptionKey(), certKeyPair2.getPrivateKey());
                                                    aVar2.f99928d = vq.j.a(aVar6);
                                                    aVar2.f99929e = jVar5;
                                                    aVar2.f99930f = vq.j.a(bVar7);
                                                    aVar2.f99931g = bVar5;
                                                    aVar2.f99932h = vq.j.a(iVar);
                                                    aVar2.f99933j = bVar9;
                                                    aVar2.f99934k = vq.j.a(wKAuthSigningParams4);
                                                    aVar2.f99935l = vq.j.a(iVar6);
                                                    aVar2.f99936m = vq.j.a(uVar3);
                                                    aVar2.f99937n = vq.j.a(iVar5);
                                                    aVar2.f99938p = vq.j.a(certKeyPair2);
                                                    aVar2.f99939q = vq.j.a(iVar7);
                                                    aVar2.f99940r = vq.j.a(b0Var);
                                                    aVar2.f99941s = vq.j.a(result2);
                                                    aVar2.f99942t = vq.j.a(offsetDateTimeA2);
                                                    aVar2.f99943v = i66;
                                                    aVar2.f99944w = i85;
                                                    aVar2.f99945x = i69;
                                                    aVar2.f99946y = i67;
                                                    aVar2.f99947z = i68;
                                                    aVar2.A = i78;
                                                    aVar2.B = i75;
                                                    aVar2.C = i77;
                                                    aVar2.D = i76;
                                                    aVar2.E = i87;
                                                    aVar2.F = i79;
                                                    aVar2.G = 0;
                                                    aVar2.H = 0;
                                                    aVar2.L = 5;
                                                    objG = fVar5.g(aVar13, aVar2);
                                                    obj5 = obj4;
                                                    if (objG == obj5) {
                                                        return obj5;
                                                    }
                                                    bVar10 = bVar5;
                                                    iVar7 = (i) objG;
                                                    bVar5 = bVar10;
                                                }
                                                bVar4 = bVar9;
                                                iVar2 = iVar7;
                                            }
                                        } catch (ex.c e29) {
                                            e = e29;
                                        } catch (CancellationException e35) {
                                            throw e35;
                                        } catch (Exception e36) {
                                            e = e36;
                                            r15 = jVar3;
                                            px.f fVar6 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            fVar6.d(message, e, px.c.a(r15));
                                            iVarA = r15.a(e);
                                            if (iVarA instanceof i.Left) {
                                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                            } else {
                                                if (iVarA instanceof i.Right) {
                                                    throw new p();
                                                }
                                                objB = ((i.Right) iVarA).b();
                                            }
                                            return new i.Left(objB);
                                        }
                                    }
                                    aVar3 = bVar4;
                                    if (!(iVar2 instanceof i.Left)) {
                                        bVar5.b(new dx.b.Generic(new Exception("IdentityType for main identity is null")));
                                        throw new oq.g();
                                    }
                                    if (iVar2 instanceof i.Right) {
                                        throw new p();
                                    }
                                    right = new i.Right((JWSETokenPair) ((i.Right) iVar2).b());
                                    return new i.Right((JWSETokenPair) aVar3.a(right));
                                } catch (ex.c e37) {
                                    e = e37;
                                } catch (CancellationException e38) {
                                    throw e38;
                                } catch (Exception e39) {
                                    e = e39;
                                    r15 = jVar7;
                                    px.f fVar7 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar7.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
                                    if (iVarA instanceof i.Left) {
                                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof i.Right) {
                                            throw new p();
                                        }
                                        objB = ((i.Right) iVarA).b();
                                    }
                                    return new i.Left(objB);
                                }
                            } else {
                                if (i89 != 3) {
                                    if (i89 == 4) {
                                        int i102 = aVar2.F;
                                        int i103 = aVar2.E;
                                        int i104 = aVar2.D;
                                        int i105 = aVar2.C;
                                        int i106 = aVar2.B;
                                        int i107 = aVar2.A;
                                        int i108 = aVar2.f99947z;
                                        int i109 = aVar2.f99946y;
                                        int i110 = aVar2.f99945x;
                                        int i111 = aVar2.f99944w;
                                        int i112 = aVar2.f99943v;
                                        b0 b0Var2 = (b0) aVar2.f99939q;
                                        obj3 = objG;
                                        certKeyPair2 = (CertKeyPair) aVar2.f99938p;
                                        iVar5 = (i) aVar2.f99937n;
                                        uVar3 = (u) aVar2.f99936m;
                                        iVar6 = (i) aVar2.f99935l;
                                        wKAuthSigningParams4 = (WKAuthSigningParams) aVar2.f99934k;
                                        ex.b bVar12 = (ex.b) aVar2.f99933j;
                                        i iVar9 = (i) aVar2.f99932h;
                                        ex.b bVar13 = (ex.b) aVar2.f99931g;
                                        ex.b bVar14 = (ex.b) aVar2.f99930f;
                                        j<dx.b> jVar8 = (j) aVar2.f99929e;
                                        d74.b.a aVar14 = (d74.b.a) aVar2.f99928d;
                                        try {
                                            oq.u.b(obj3);
                                            bVar8 = this;
                                            i85 = i111;
                                            obj4 = objE;
                                            i67 = i109;
                                            i68 = i108;
                                            i75 = i106;
                                            i76 = i104;
                                            i86 = i103;
                                            i69 = i110;
                                            bVar5 = bVar13;
                                            b0Var = b0Var2;
                                            i78 = i107;
                                            i77 = i105;
                                            i66 = i112;
                                            jVar5 = jVar8;
                                            i79 = i102;
                                            bVar9 = bVar12;
                                            iVar = iVar9;
                                            bVar7 = bVar14;
                                            aVar6 = aVar14;
                                            try {
                                                iVar7 = (i) obj3;
                                                i87 = i86;
                                                if (!(iVar7 instanceof i.Left)) {
                                                    if (!(iVar7 instanceof i.Right)) {
                                                        throw new p();
                                                    }
                                                    z0.Result result3 = (z0.Result) ((i.Right) iVar7).b();
                                                    OffsetDateTime offsetDateTimeA3 = bVar8.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                                                    f fVar8 = bVar8.parseJwseForMIDUC;
                                                    f.Params aVar15 = new f.Params(new JWSHeaderData(n.b.C4515b.f176854d, null, v.e(c0.e(b0Var)), null, 10, null), new JWSPayloadData("mObywatel", c0.e(result3.getPesel()), bVar8.dateConverter.d(offsetDateTimeA3.plusSeconds(gu.b.F(wKAuthSigningParams4.getTokenTtlInSeconds()))), bVar8.dateConverter.d(offsetDateTimeA3), new JWSPayloadData.a.Multiple(wKAuthSigningParams4.f()), null, null, wKAuthSigningParams4.c(), 96, null), wKAuthSigningParams4.getEncryptionKeyId(), wKAuthSigningParams4.getEncryptionKey(), certKeyPair2.getPrivateKey());
                                                    aVar2.f99928d = vq.j.a(aVar6);
                                                    aVar2.f99929e = jVar5;
                                                    aVar2.f99930f = vq.j.a(bVar7);
                                                    aVar2.f99931g = bVar5;
                                                    aVar2.f99932h = vq.j.a(iVar);
                                                    aVar2.f99933j = bVar9;
                                                    aVar2.f99934k = vq.j.a(wKAuthSigningParams4);
                                                    aVar2.f99935l = vq.j.a(iVar6);
                                                    aVar2.f99936m = vq.j.a(uVar3);
                                                    aVar2.f99937n = vq.j.a(iVar5);
                                                    aVar2.f99938p = vq.j.a(certKeyPair2);
                                                    aVar2.f99939q = vq.j.a(iVar7);
                                                    aVar2.f99940r = vq.j.a(b0Var);
                                                    aVar2.f99941s = vq.j.a(result3);
                                                    aVar2.f99942t = vq.j.a(offsetDateTimeA3);
                                                    aVar2.f99943v = i66;
                                                    aVar2.f99944w = i85;
                                                    aVar2.f99945x = i69;
                                                    aVar2.f99946y = i67;
                                                    aVar2.f99947z = i68;
                                                    aVar2.A = i78;
                                                    aVar2.B = i75;
                                                    aVar2.C = i77;
                                                    aVar2.D = i76;
                                                    aVar2.E = i87;
                                                    aVar2.F = i79;
                                                    aVar2.G = 0;
                                                    aVar2.H = 0;
                                                    aVar2.L = 5;
                                                    objG = fVar8.g(aVar15, aVar2);
                                                    obj5 = obj4;
                                                    if (objG == obj5) {
                                                        return obj5;
                                                    }
                                                    bVar10 = bVar5;
                                                }
                                                bVar4 = bVar9;
                                                iVar2 = iVar7;
                                                aVar3 = bVar4;
                                                if (!(iVar2 instanceof i.Left)) {
                                                    bVar5.b(new dx.b.Generic(new Exception("IdentityType for main identity is null")));
                                                    throw new oq.g();
                                                }
                                                if (iVar2 instanceof i.Right) {
                                                    throw new p();
                                                }
                                                right = new i.Right((JWSETokenPair) ((i.Right) iVar2).b());
                                                return new i.Right((JWSETokenPair) aVar3.a(right));
                                            } catch (ex.c e45) {
                                                e = e45;
                                            } catch (CancellationException e46) {
                                                throw e46;
                                            } catch (Exception e47) {
                                                e = e47;
                                                r15 = jVar5;
                                                px.f fVar9 = px.f.f163100a;
                                                message = e.getMessage();
                                                if (message == null) {
                                                    message = "";
                                                }
                                                fVar9.d(message, e, px.c.a(r15));
                                                iVarA = r15.a(e);
                                                if (iVarA instanceof i.Left) {
                                                    objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                                } else {
                                                    if (iVarA instanceof i.Right) {
                                                        throw new p();
                                                    }
                                                    objB = ((i.Right) iVarA).b();
                                                }
                                                return new i.Left(objB);
                                            }
                                        } catch (ex.c e48) {
                                            e = e48;
                                        } catch (CancellationException e49) {
                                            throw e49;
                                        } catch (Exception e55) {
                                            e = e55;
                                            r15 = jVar8;
                                            px.f fVar10 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            fVar10.d(message, e, px.c.a(r15));
                                            iVarA = r15.a(e);
                                            if (iVarA instanceof i.Left) {
                                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                            } else {
                                                if (iVarA instanceof i.Right) {
                                                    throw new p();
                                                }
                                                objB = ((i.Right) iVarA).b();
                                            }
                                            return new i.Left(objB);
                                        }
                                    } else {
                                        if (i89 != 5) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        bVar9 = (ex.b) aVar2.f99933j;
                                        bVar10 = (ex.b) aVar2.f99931g;
                                        oq.u.b(objG);
                                    }
                                    iVar7 = (i) objG;
                                    bVar5 = bVar10;
                                    bVar4 = bVar9;
                                    iVar2 = iVar7;
                                    aVar3 = bVar4;
                                    if (!(iVar2 instanceof i.Left)) {
                                        bVar5.b(new dx.b.Generic(new Exception("IdentityType for main identity is null")));
                                        throw new oq.g();
                                    }
                                    if (iVar2 instanceof i.Right) {
                                        throw new p();
                                    }
                                    right = new i.Right((JWSETokenPair) ((i.Right) iVar2).b());
                                    return new i.Right((JWSETokenPair) aVar3.a(right));
                                }
                                i55 = aVar2.D;
                                int i113 = aVar2.C;
                                int i114 = aVar2.B;
                                int i115 = aVar2.A;
                                int i116 = aVar2.f99947z;
                                int i117 = aVar2.f99946y;
                                int i118 = aVar2.f99945x;
                                int i119 = aVar2.f99944w;
                                int i120 = aVar2.f99943v;
                                uVar = (u) aVar2.f99936m;
                                i iVar10 = (i) aVar2.f99935l;
                                wKAuthSigningParams3 = (WKAuthSigningParams) aVar2.f99934k;
                                bVar4 = (ex.b) aVar2.f99933j;
                                i iVar11 = (i) aVar2.f99932h;
                                ex.b bVar15 = (ex.b) aVar2.f99931g;
                                bVar7 = (ex.b) aVar2.f99930f;
                                j<dx.b> jVar9 = (j) aVar2.f99929e;
                                d74.b.a aVar16 = (d74.b.a) aVar2.f99928d;
                                try {
                                    oq.u.b(objG);
                                    iVar = iVar11;
                                    obj2 = objG;
                                    aVar5 = aVar16;
                                    i47 = i118;
                                    i28 = i115;
                                    i39 = i120;
                                    bVar5 = bVar15;
                                    iVar3 = iVar10;
                                    i48 = i119;
                                    i38 = i117;
                                    i49 = i116;
                                    i45 = i113;
                                    i46 = i114;
                                    jVar3 = jVar9;
                                    uVar2 = uVar;
                                    iVar4 = (i) obj2;
                                    if (iVar4 instanceof i.Left) {
                                        iVar2 = iVar4;
                                    } else {
                                        if (iVar4 instanceof i.Right) {
                                            throw new p();
                                        }
                                        certKeyPair = (CertKeyPair) ((i.Right) iVar4).b();
                                        i56 = i45;
                                        bVar8 = this;
                                        i57 = i46;
                                        i58 = i49;
                                        i59 = i28;
                                        b0VarG = c0.g(iy.a.e(bVar8.base64Coder, certKeyPair.getCertificate().getEncoded(), null, 2, null));
                                        z0 z0Var3 = bVar8.getPeselFromPersonalIdCertificate;
                                        z0.a.CertC509CertString certC509CertString3 = new z0.a.CertC509CertString(b0VarG);
                                        aVar2.f99928d = vq.j.a(aVar5);
                                        aVar2.f99929e = jVar3;
                                        aVar2.f99930f = vq.j.a(bVar7);
                                        aVar2.f99931g = bVar5;
                                        aVar2.f99932h = vq.j.a(iVar);
                                        aVar2.f99933j = bVar4;
                                        aVar2.f99934k = wKAuthSigningParams3;
                                        aVar2.f99935l = vq.j.a(iVar3);
                                        aVar2.f99936m = vq.j.a(uVar2);
                                        aVar2.f99937n = vq.j.a(iVar4);
                                        aVar2.f99938p = certKeyPair;
                                        aVar2.f99939q = b0VarG;
                                        aVar2.f99943v = i39;
                                        aVar2.f99944w = i48;
                                        aVar2.f99945x = i47;
                                        aVar2.f99946y = i38;
                                        aVar2.f99947z = i58;
                                        i65 = i47;
                                        aVar2.A = i59;
                                        aVar2.B = i57;
                                        aVar2.C = i56;
                                        aVar2.D = i55;
                                        aVar2.E = 0;
                                        aVar2.F = 0;
                                        aVar2.L = 4;
                                        objC3 = z0Var3.c(certC509CertString3, aVar2);
                                        if (objC3 == objE) {
                                            return objE;
                                        }
                                        iVar5 = iVar4;
                                        certKeyPair2 = certKeyPair;
                                        i66 = i39;
                                        i67 = i38;
                                        aVar6 = aVar5;
                                        iVar6 = iVar3;
                                        obj3 = objC3;
                                        jVar5 = jVar3;
                                        wKAuthSigningParams4 = wKAuthSigningParams3;
                                        i68 = i58;
                                        i69 = i65;
                                        uVar3 = uVar2;
                                        i75 = i57;
                                        i76 = i55;
                                        bVar9 = bVar4;
                                        b0Var = b0VarG;
                                        i77 = i56;
                                        i78 = i59;
                                        i79 = 0;
                                        obj4 = objE;
                                        i85 = i48;
                                        i86 = 0;
                                        iVar7 = (i) obj3;
                                        i87 = i86;
                                        if (!(iVar7 instanceof i.Left)) {
                                            if (!(iVar7 instanceof i.Right)) {
                                                throw new p();
                                            }
                                            z0.Result result4 = (z0.Result) ((i.Right) iVar7).b();
                                            OffsetDateTime offsetDateTimeA4 = bVar8.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                                            f fVar11 = bVar8.parseJwseForMIDUC;
                                            f.Params aVar17 = new f.Params(new JWSHeaderData(n.b.C4515b.f176854d, null, v.e(c0.e(b0Var)), null, 10, null), new JWSPayloadData("mObywatel", c0.e(result4.getPesel()), bVar8.dateConverter.d(offsetDateTimeA4.plusSeconds(gu.b.F(wKAuthSigningParams4.getTokenTtlInSeconds()))), bVar8.dateConverter.d(offsetDateTimeA4), new JWSPayloadData.a.Multiple(wKAuthSigningParams4.f()), null, null, wKAuthSigningParams4.c(), 96, null), wKAuthSigningParams4.getEncryptionKeyId(), wKAuthSigningParams4.getEncryptionKey(), certKeyPair2.getPrivateKey());
                                            aVar2.f99928d = vq.j.a(aVar6);
                                            aVar2.f99929e = jVar5;
                                            aVar2.f99930f = vq.j.a(bVar7);
                                            aVar2.f99931g = bVar5;
                                            aVar2.f99932h = vq.j.a(iVar);
                                            aVar2.f99933j = bVar9;
                                            aVar2.f99934k = vq.j.a(wKAuthSigningParams4);
                                            aVar2.f99935l = vq.j.a(iVar6);
                                            aVar2.f99936m = vq.j.a(uVar3);
                                            aVar2.f99937n = vq.j.a(iVar5);
                                            aVar2.f99938p = vq.j.a(certKeyPair2);
                                            aVar2.f99939q = vq.j.a(iVar7);
                                            aVar2.f99940r = vq.j.a(b0Var);
                                            aVar2.f99941s = vq.j.a(result4);
                                            aVar2.f99942t = vq.j.a(offsetDateTimeA4);
                                            aVar2.f99943v = i66;
                                            aVar2.f99944w = i85;
                                            aVar2.f99945x = i69;
                                            aVar2.f99946y = i67;
                                            aVar2.f99947z = i68;
                                            aVar2.A = i78;
                                            aVar2.B = i75;
                                            aVar2.C = i77;
                                            aVar2.D = i76;
                                            aVar2.E = i87;
                                            aVar2.F = i79;
                                            aVar2.G = 0;
                                            aVar2.H = 0;
                                            aVar2.L = 5;
                                            objG = fVar11.g(aVar17, aVar2);
                                            obj5 = obj4;
                                            if (objG == obj5) {
                                                return obj5;
                                            }
                                            bVar10 = bVar5;
                                            iVar7 = (i) objG;
                                            bVar5 = bVar10;
                                        }
                                        bVar4 = bVar9;
                                        iVar2 = iVar7;
                                    }
                                    aVar3 = bVar4;
                                    if (!(iVar2 instanceof i.Left)) {
                                        bVar5.b(new dx.b.Generic(new Exception("IdentityType for main identity is null")));
                                        throw new oq.g();
                                    }
                                    if (iVar2 instanceof i.Right) {
                                        throw new p();
                                    }
                                    right = new i.Right((JWSETokenPair) ((i.Right) iVar2).b());
                                    return new i.Right((JWSETokenPair) aVar3.a(right));
                                } catch (ex.c e56) {
                                    e = e56;
                                } catch (CancellationException e57) {
                                    throw e57;
                                } catch (Exception e58) {
                                    e = e58;
                                    r15 = jVar9;
                                    px.f fVar12 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar12.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
                                    if (iVarA instanceof i.Left) {
                                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof i.Right) {
                                            throw new p();
                                        }
                                        objB = ((i.Right) iVarA).b();
                                    }
                                    return new i.Left(objB);
                                }
                            }
                            if (!(right instanceof i.Left)) {
                                if (right instanceof i.Right) {
                                    jVar2 = jVar;
                                    throw new p();
                                }
                                wKAuthSigningParams = (WKAuthSigningParams) ((i.Right) right).b();
                                h74.a aVar18 = this.wkContainersInteractor;
                                iVar = right;
                                aVar2.f99928d = vq.j.a(aVar4);
                                aVar2.f99929e = jVar;
                                aVar2.f99930f = vq.j.a(bVar2);
                                aVar2.f99931g = bVar;
                                aVar2.f99932h = vq.j.a(iVar);
                                aVar2.f99933j = aVar3;
                                aVar2.f99934k = wKAuthSigningParams;
                                aVar2.f99943v = i17;
                                aVar2.f99944w = i16;
                                aVar2.f99945x = i15;
                                aVar2.f99946y = i18;
                                aVar2.f99947z = i19;
                                aVar2.A = 0;
                                aVar2.B = 0;
                                aVar2.L = 2;
                                jVar2 = jVar;
                                i25 = i16;
                                objC2 = h74.a.c(aVar18, false, aVar2, 1, null);
                                if (objC2 == objE) {
                                    obj = objC2;
                                    wKAuthSigningParams2 = wKAuthSigningParams;
                                    i26 = i18;
                                    jVar3 = jVar2;
                                    i27 = 0;
                                    i28 = 0;
                                    bVar4 = aVar3;
                                    aVar5 = aVar4;
                                    i29 = i17;
                                    i35 = i15;
                                    i36 = i19;
                                    bVar5 = bVar;
                                    i37 = i25;
                                    iVar2 = (i) obj;
                                    bVar6 = bVar2;
                                    if (!(iVar2 instanceof i.Left)) {
                                        if (!(iVar2 instanceof i.Right)) {
                                            throw new p();
                                        }
                                        uVar = (u) ((i.Right) iVar2).b();
                                        h74.a aVar19 = this.wkContainersInteractor;
                                        aVar2.f99928d = vq.j.a(aVar5);
                                        aVar2.f99929e = jVar3;
                                        aVar2.f99930f = vq.j.a(bVar6);
                                        aVar2.f99931g = bVar5;
                                        aVar2.f99932h = vq.j.a(iVar);
                                        aVar2.f99933j = bVar4;
                                        aVar2.f99934k = wKAuthSigningParams2;
                                        aVar2.f99935l = vq.j.a(iVar2);
                                        aVar2.f99936m = vq.j.a(uVar);
                                        aVar2.f99943v = i29;
                                        aVar2.f99944w = i37;
                                        aVar2.f99945x = i35;
                                        aVar2.f99946y = i26;
                                        aVar2.f99947z = i36;
                                        aVar2.A = i28;
                                        aVar2.B = i27;
                                        aVar2.C = 0;
                                        aVar2.D = 0;
                                        aVar2.L = 3;
                                        objB2 = aVar19.b(uVar, aVar2);
                                        if (objB2 == objE) {
                                            i38 = i26;
                                            i39 = i29;
                                            iVar3 = iVar2;
                                            i45 = 0;
                                            bVar7 = bVar6;
                                            obj2 = objB2;
                                            i46 = i27;
                                            i47 = i35;
                                            i48 = i37;
                                            wKAuthSigningParams3 = wKAuthSigningParams2;
                                            i49 = i36;
                                            i55 = 0;
                                            jVar3 = jVar3;
                                            uVar2 = uVar;
                                            iVar4 = (i) obj2;
                                            if (iVar4 instanceof i.Left) {
                                                iVar2 = iVar4;
                                            } else {
                                                if (iVar4 instanceof i.Right) {
                                                    throw new p();
                                                }
                                                certKeyPair = (CertKeyPair) ((i.Right) iVar4).b();
                                                i56 = i45;
                                                bVar8 = this;
                                                i57 = i46;
                                                i58 = i49;
                                                i59 = i28;
                                                b0VarG = c0.g(iy.a.e(bVar8.base64Coder, certKeyPair.getCertificate().getEncoded(), null, 2, null));
                                                z0 z0Var4 = bVar8.getPeselFromPersonalIdCertificate;
                                                z0.a.CertC509CertString certC509CertString4 = new z0.a.CertC509CertString(b0VarG);
                                                aVar2.f99928d = vq.j.a(aVar5);
                                                aVar2.f99929e = jVar3;
                                                aVar2.f99930f = vq.j.a(bVar7);
                                                aVar2.f99931g = bVar5;
                                                aVar2.f99932h = vq.j.a(iVar);
                                                aVar2.f99933j = bVar4;
                                                aVar2.f99934k = wKAuthSigningParams3;
                                                aVar2.f99935l = vq.j.a(iVar3);
                                                aVar2.f99936m = vq.j.a(uVar2);
                                                aVar2.f99937n = vq.j.a(iVar4);
                                                aVar2.f99938p = certKeyPair;
                                                aVar2.f99939q = b0VarG;
                                                aVar2.f99943v = i39;
                                                aVar2.f99944w = i48;
                                                aVar2.f99945x = i47;
                                                aVar2.f99946y = i38;
                                                aVar2.f99947z = i58;
                                                i65 = i47;
                                                aVar2.A = i59;
                                                aVar2.B = i57;
                                                aVar2.C = i56;
                                                aVar2.D = i55;
                                                aVar2.E = 0;
                                                aVar2.F = 0;
                                                aVar2.L = 4;
                                                objC3 = z0Var4.c(certC509CertString4, aVar2);
                                                if (objC3 == objE) {
                                                    return objE;
                                                }
                                                iVar5 = iVar4;
                                                certKeyPair2 = certKeyPair;
                                                i66 = i39;
                                                i67 = i38;
                                                aVar6 = aVar5;
                                                iVar6 = iVar3;
                                                obj3 = objC3;
                                                jVar5 = jVar3;
                                                wKAuthSigningParams4 = wKAuthSigningParams3;
                                                i68 = i58;
                                                i69 = i65;
                                                uVar3 = uVar2;
                                                i75 = i57;
                                                i76 = i55;
                                                bVar9 = bVar4;
                                                b0Var = b0VarG;
                                                i77 = i56;
                                                i78 = i59;
                                                i79 = 0;
                                                obj4 = objE;
                                                i85 = i48;
                                                i86 = 0;
                                                iVar7 = (i) obj3;
                                                i87 = i86;
                                                if (!(iVar7 instanceof i.Left)) {
                                                    if (!(iVar7 instanceof i.Right)) {
                                                        throw new p();
                                                    }
                                                    z0.Result result5 = (z0.Result) ((i.Right) iVar7).b();
                                                    OffsetDateTime offsetDateTimeA5 = bVar8.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                                                    f fVar13 = bVar8.parseJwseForMIDUC;
                                                    f.Params aVar110 = new f.Params(new JWSHeaderData(n.b.C4515b.f176854d, null, v.e(c0.e(b0Var)), null, 10, null), new JWSPayloadData("mObywatel", c0.e(result5.getPesel()), bVar8.dateConverter.d(offsetDateTimeA5.plusSeconds(gu.b.F(wKAuthSigningParams4.getTokenTtlInSeconds()))), bVar8.dateConverter.d(offsetDateTimeA5), new JWSPayloadData.a.Multiple(wKAuthSigningParams4.f()), null, null, wKAuthSigningParams4.c(), 96, null), wKAuthSigningParams4.getEncryptionKeyId(), wKAuthSigningParams4.getEncryptionKey(), certKeyPair2.getPrivateKey());
                                                    aVar2.f99928d = vq.j.a(aVar6);
                                                    aVar2.f99929e = jVar5;
                                                    aVar2.f99930f = vq.j.a(bVar7);
                                                    aVar2.f99931g = bVar5;
                                                    aVar2.f99932h = vq.j.a(iVar);
                                                    aVar2.f99933j = bVar9;
                                                    aVar2.f99934k = vq.j.a(wKAuthSigningParams4);
                                                    aVar2.f99935l = vq.j.a(iVar6);
                                                    aVar2.f99936m = vq.j.a(uVar3);
                                                    aVar2.f99937n = vq.j.a(iVar5);
                                                    aVar2.f99938p = vq.j.a(certKeyPair2);
                                                    aVar2.f99939q = vq.j.a(iVar7);
                                                    aVar2.f99940r = vq.j.a(b0Var);
                                                    aVar2.f99941s = vq.j.a(result5);
                                                    aVar2.f99942t = vq.j.a(offsetDateTimeA5);
                                                    aVar2.f99943v = i66;
                                                    aVar2.f99944w = i85;
                                                    aVar2.f99945x = i69;
                                                    aVar2.f99946y = i67;
                                                    aVar2.f99947z = i68;
                                                    aVar2.A = i78;
                                                    aVar2.B = i75;
                                                    aVar2.C = i77;
                                                    aVar2.D = i76;
                                                    aVar2.E = i87;
                                                    aVar2.F = i79;
                                                    aVar2.G = 0;
                                                    aVar2.H = 0;
                                                    aVar2.L = 5;
                                                    objG = fVar13.g(aVar110, aVar2);
                                                    obj5 = obj4;
                                                    if (objG == obj5) {
                                                        return obj5;
                                                    }
                                                    bVar10 = bVar5;
                                                    iVar7 = (i) objG;
                                                    bVar5 = bVar10;
                                                }
                                                bVar4 = bVar9;
                                                iVar2 = iVar7;
                                            }
                                        }
                                    }
                                    aVar3 = bVar4;
                                    if (!(iVar2 instanceof i.Left)) {
                                        bVar5.b(new dx.b.Generic(new Exception("IdentityType for main identity is null")));
                                        throw new oq.g();
                                    }
                                    if (iVar2 instanceof i.Right) {
                                        throw new p();
                                    }
                                    right = new i.Right((JWSETokenPair) ((i.Right) iVar2).b());
                                }
                                return objE;
                                return new i.Left((dx.b) ex.d.a(e));
                            }
                            return new i.Right((JWSETokenPair) aVar3.a(right));
                        } catch (ex.c e59) {
                            e = e59;
                        } catch (CancellationException e65) {
                            throw e65;
                        } catch (Exception e66) {
                            e = e66;
                            r15 = jVar;
                        }
                        right = (i) objC;
                        if (!(right instanceof i.Left)) {
                            if (!(right instanceof i.Right)) {
                                throw new p();
                            }
                            right = new i.Right(c.b((JWSSigningParams) ((i.Right) right).b()));
                        }
                        bVar2 = bVar3;
                        jVar = jVar4;
                    } catch (Exception e67) {
                        e = e67;
                        r15 = i89;
                    }
                } catch (CancellationException e68) {
                    throw e68;
                }
            } catch (ex.c e69) {
                e = e69;
            } catch (CancellationException e75) {
                throw e75;
            }
        } catch (ex.c e76) {
            e = e76;
        } catch (CancellationException e77) {
            throw e77;
        } catch (Exception e78) {
            e = e78;
            r15 = i89;
        }
    }
}
