package c04;

import ay.Challenge;
import fr.t;
import i34.IdentityDeactivateData;
import java.time.OffsetDateTime;
import java.util.concurrent.CancellationException;
import k34.u;
import oq.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import th0.Jwt;
import th0.JwtRequest;
import uh0.l;
import vz3.AutoCertificateRenewalData;
import xy.AccessToken;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0096B¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lc04/i;", "Lwz3/h;", "Lwz3/e;", "getChallengeUC", "Luh0/l;", "getJwtTokenUseCase", "Lzz3/b;", "notificationsInteractor", "Lwy/b;", "networkSessionManager", "Lb04/a;", "autoCertificateRenewalCache", "Lez/a;", "currentTimeProvider", "Ldx/a;", "deactivateDomainErrorFactory", "Lzz3/a;", "authenticationContainersInteractor", "<init>", "(Lwz3/e;Luh0/l;Lzz3/b;Lwy/b;Lb04/a;Lez/a;Ldx/a;Lzz3/a;)V", "Lay/c;", "challenge", "Ldx/i;", "Ldx/b;", "Lxy/a;", "e", "(Lay/c;Ltq/e;)Ljava/lang/Object;", "Lgz/b$a$a;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lwz3/e;", "b", "Luh0/l;", "c", "Lzz3/b;", "d", "Lwy/b;", "Lb04/a;", "f", "Lez/a;", "g", "Ldx/a;", "h", "Lzz3/a;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements wz3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wz3.e getChallengeUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l getJwtTokenUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zz3.b notificationsInteractor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wy.b networkSessionManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b04.a autoCertificateRenewalCache;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final dx.a deactivateDomainErrorFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final zz3.a authenticationContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f22452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f22454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f22455g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f22456h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f22457j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f22458k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f22459l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f22460m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f22461n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f22462p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22463q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f22464r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f22465s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f22466t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f22467v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f22468w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f22469x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f22471z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f22469x = obj;
            this.f22471z |= PKIFailureInfo.systemUnavail;
            return i.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f22472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f22474f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f22476h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f22474f = obj;
            this.f22476h |= PKIFailureInfo.systemUnavail;
            return i.this.c(null, this);
        }
    }

    public i(wz3.e eVar, l lVar, zz3.b bVar, wy.b bVar2, b04.a aVar, ez.a aVar2, dx.a aVar3, zz3.a aVar4) {
        this.getChallengeUC = eVar;
        this.getJwtTokenUseCase = lVar;
        this.notificationsInteractor = bVar;
        this.networkSessionManager = bVar2;
        this.autoCertificateRenewalCache = aVar;
        this.currentTimeProvider = aVar2;
        this.deactivateDomainErrorFactory = aVar3;
        this.authenticationContainersInteractor = aVar4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:103:0x0384  */
    /* JADX WARN: Code duplicated, block: B:104:0x0386  */
    /* JADX WARN: Code duplicated, block: B:107:0x039e A[Catch: Exception -> 0x005f, c -> 0x0062, CancellationException -> 0x0065, TryCatch #7 {Exception -> 0x005f, blocks: (B:13:0x0059, B:168:0x0559, B:171:0x0567, B:22:0x008d, B:110:0x03e6, B:105:0x0390, B:107:0x039e, B:112:0x03e9, B:101:0x0341, B:87:0x02d6, B:90:0x02dd, B:70:0x0250, B:62:0x0208, B:64:0x020e, B:66:0x0212, B:164:0x053b, B:165:0x0540, B:166:0x0541, B:167:0x0558, B:58:0x01d6), top: B:186:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:112:0x03e9 A[Catch: Exception -> 0x005f, c -> 0x0062, CancellationException -> 0x0065, TRY_LEAVE, TryCatch #7 {Exception -> 0x005f, blocks: (B:13:0x0059, B:168:0x0559, B:171:0x0567, B:22:0x008d, B:110:0x03e6, B:105:0x0390, B:107:0x039e, B:112:0x03e9, B:101:0x0341, B:87:0x02d6, B:90:0x02dd, B:70:0x0250, B:62:0x0208, B:64:0x020e, B:66:0x0212, B:164:0x053b, B:165:0x0540, B:166:0x0541, B:167:0x0558, B:58:0x01d6), top: B:186:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x043d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0443  */
    /* JADX WARN: Code duplicated, block: B:118:0x0445  */
    /* JADX WARN: Code duplicated, block: B:121:0x044c A[Catch: Exception -> 0x045b, c -> 0x045f, CancellationException -> 0x0463, TryCatch #10 {c -> 0x045f, CancellationException -> 0x0463, Exception -> 0x045b, blocks: (B:119:0x0446, B:121:0x044c, B:131:0x0471, B:128:0x0467, B:130:0x046b, B:133:0x0489, B:134:0x048e), top: B:192:0x0446 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0467 A[Catch: Exception -> 0x045b, c -> 0x045f, CancellationException -> 0x0463, TryCatch #10 {c -> 0x045f, CancellationException -> 0x0463, Exception -> 0x045b, blocks: (B:119:0x0446, B:121:0x044c, B:131:0x0471, B:128:0x0467, B:130:0x046b, B:133:0x0489, B:134:0x048e), top: B:192:0x0446 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x046b A[Catch: Exception -> 0x045b, c -> 0x045f, CancellationException -> 0x0463, TryCatch #10 {c -> 0x045f, CancellationException -> 0x0463, Exception -> 0x045b, blocks: (B:119:0x0446, B:121:0x044c, B:131:0x0471, B:128:0x0467, B:130:0x046b, B:133:0x0489, B:134:0x048e), top: B:192:0x0446 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0489 A[Catch: Exception -> 0x045b, c -> 0x045f, CancellationException -> 0x0463, TryCatch #10 {c -> 0x045f, CancellationException -> 0x0463, Exception -> 0x045b, blocks: (B:119:0x0446, B:121:0x044c, B:131:0x0471, B:128:0x0467, B:130:0x046b, B:133:0x0489, B:134:0x048e), top: B:192:0x0446 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x04cf A[Catch: Exception -> 0x048f, c -> 0x0494, CancellationException -> 0x0499, TryCatch #20 {c -> 0x0494, CancellationException -> 0x0499, Exception -> 0x048f, blocks: (B:97:0x02ef, B:148:0x04af, B:150:0x04ba, B:152:0x04c9, B:154:0x04cf, B:156:0x04d5, B:160:0x0520, B:162:0x0535, B:163:0x053a), top: B:187:0x02a6 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x04d5 A[Catch: Exception -> 0x048f, c -> 0x0494, CancellationException -> 0x0499, TryCatch #20 {c -> 0x0494, CancellationException -> 0x0499, Exception -> 0x048f, blocks: (B:97:0x02ef, B:148:0x04af, B:150:0x04ba, B:152:0x04c9, B:154:0x04cf, B:156:0x04d5, B:160:0x0520, B:162:0x0535, B:163:0x053a), top: B:187:0x02a6 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x051d  */
    /* JADX WARN: Code duplicated, block: B:159:0x051f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0535 A[Catch: Exception -> 0x048f, c -> 0x0494, CancellationException -> 0x0499, TryCatch #20 {c -> 0x0494, CancellationException -> 0x0499, Exception -> 0x048f, blocks: (B:97:0x02ef, B:148:0x04af, B:150:0x04ba, B:152:0x04c9, B:154:0x04cf, B:156:0x04d5, B:160:0x0520, B:162:0x0535, B:163:0x053a), top: B:187:0x02a6 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x053b A[Catch: Exception -> 0x005f, c -> 0x0062, CancellationException -> 0x0065, TRY_ENTER, TryCatch #7 {Exception -> 0x005f, blocks: (B:13:0x0059, B:168:0x0559, B:171:0x0567, B:22:0x008d, B:110:0x03e6, B:105:0x0390, B:107:0x039e, B:112:0x03e9, B:101:0x0341, B:87:0x02d6, B:90:0x02dd, B:70:0x0250, B:62:0x0208, B:64:0x020e, B:66:0x0212, B:164:0x053b, B:165:0x0540, B:166:0x0541, B:167:0x0558, B:58:0x01d6), top: B:186:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0541 A[Catch: Exception -> 0x005f, c -> 0x0062, CancellationException -> 0x0065, TryCatch #7 {Exception -> 0x005f, blocks: (B:13:0x0059, B:168:0x0559, B:171:0x0567, B:22:0x008d, B:110:0x03e6, B:105:0x0390, B:107:0x039e, B:112:0x03e9, B:101:0x0341, B:87:0x02d6, B:90:0x02dd, B:70:0x0250, B:62:0x0208, B:64:0x020e, B:66:0x0212, B:164:0x053b, B:165:0x0540, B:166:0x0541, B:167:0x0558, B:58:0x01d6), top: B:186:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0570  */
    /* JADX WARN: Code duplicated, block: B:177:0x0581  */
    /* JADX WARN: Code duplicated, block: B:178:0x058f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0593  */
    /* JADX WARN: Code duplicated, block: B:183:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x020e A[Catch: Exception -> 0x005f, c -> 0x0062, CancellationException -> 0x0065, TryCatch #7 {Exception -> 0x005f, blocks: (B:13:0x0059, B:168:0x0559, B:171:0x0567, B:22:0x008d, B:110:0x03e6, B:105:0x0390, B:107:0x039e, B:112:0x03e9, B:101:0x0341, B:87:0x02d6, B:90:0x02dd, B:70:0x0250, B:62:0x0208, B:64:0x020e, B:66:0x0212, B:164:0x053b, B:165:0x0540, B:166:0x0541, B:167:0x0558, B:58:0x01d6), top: B:186:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0212 A[Catch: Exception -> 0x005f, c -> 0x0062, CancellationException -> 0x0065, TryCatch #7 {Exception -> 0x005f, blocks: (B:13:0x0059, B:168:0x0559, B:171:0x0567, B:22:0x008d, B:110:0x03e6, B:105:0x0390, B:107:0x039e, B:112:0x03e9, B:101:0x0341, B:87:0x02d6, B:90:0x02dd, B:70:0x0250, B:62:0x0208, B:64:0x020e, B:66:0x0212, B:164:0x053b, B:165:0x0540, B:166:0x0541, B:167:0x0558, B:58:0x01d6), top: B:186:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0247  */
    /* JADX WARN: Code duplicated, block: B:69:0x0249  */
    /* JADX WARN: Code duplicated, block: B:73:0x029d  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a8 A[Catch: Exception -> 0x049e, c -> 0x04a3, CancellationException -> 0x04a8, TryCatch #13 {c -> 0x04a3, CancellationException -> 0x04a8, Exception -> 0x049e, blocks: (B:74:0x02a2, B:76:0x02a8, B:78:0x02b9, B:80:0x02bd, B:83:0x02c5, B:85:0x02c9, B:95:0x02e7), top: B:188:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x02b9 A[Catch: Exception -> 0x049e, c -> 0x04a3, CancellationException -> 0x04a8, TryCatch #13 {c -> 0x04a3, CancellationException -> 0x04a8, Exception -> 0x049e, blocks: (B:74:0x02a2, B:76:0x02a8, B:78:0x02b9, B:80:0x02bd, B:83:0x02c5, B:85:0x02c9, B:95:0x02e7), top: B:188:0x02a2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0160: MOVE (r5 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:40:0x0160 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0164: MOVE (r5 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:42:0x0164 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0168: MOVE (r5 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:44:0x0168 */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00d8: MOVE (r5 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:28:0x00d8 */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00dd: MOVE (r5 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:30:0x00dd */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00e2: MOVE (r5 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:32:0x00e2 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0490: MOVE (r5 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:136:0x0490 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0495: MOVE (r5 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:138:0x0495 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x049a: MOVE (r5 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:140:0x049a */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16, types: [int] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [c04.i] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r5v74 */
    /* JADX WARN: Type inference failed for: r5v75 */
    /* JADX WARN: Type inference failed for: r5v8, types: [dx.j, java.lang.Object] */
    public final Object e(Challenge challenge, tq.e<? super dx.i<? extends dx.b, AccessToken>> eVar) throws Throwable {
        a aVar;
        Object obj;
        ?? r15;
        Object obj2;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        Challenge challenge2;
        ex.b bVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        dx.j<dx.b> jVar;
        dx.i iVar;
        u uVar;
        Object objB2;
        u uVar2;
        ex.b bVar2;
        Challenge challenge3;
        int i25;
        ex.b bVar3;
        dx.j<dx.b> jVar2;
        CertKeyPair certKeyPair;
        u uVar3;
        ex.b bVar4;
        Object objC;
        CertKeyPair certKeyPair2;
        ex.b bVar5;
        u uVar4;
        dx.i iVar2;
        Object obj3;
        boolean z15;
        dx.b bVar6;
        boolean z16;
        u uVar5;
        CertKeyPair certKeyPair3;
        dx.b bVar7;
        dx.i iVar3;
        int i26;
        ex.b bVar8;
        int i27;
        Challenge challenge4;
        int i28;
        IdentityDeactivateData identityDeactivateData;
        int i29;
        int i35;
        ?? r16;
        boolean clearData;
        ?? r17;
        zz3.b bVar9;
        Challenge challenge5;
        int i36;
        u uVar6;
        ex.b bVar10;
        int i37;
        IdentityDeactivateData identityDeactivateData2;
        Challenge challenge6;
        ?? r18;
        ?? r19;
        ex.b bVar11;
        dx.i iVar4;
        IdentityDeactivateData identityDeactivateData3;
        int i38;
        ?? r25;
        boolean z17;
        dx.i iVar5;
        Object objB3;
        int i39;
        if (!(eVar instanceof a) || (r15 = (i39 = (aVar = (a) eVar).f22471z) & PKIFailureInfo.systemUnavail) == 0) {
            aVar = new a(eVar);
        } else {
            aVar.f22471z = i39 - PKIFailureInfo.systemUnavail;
        }
        Object objF = aVar.f22469x;
        Object objE = uq.b.e();
        try {
            try {
                try {
                    try {
                        try {
                            switch (aVar.f22471z) {
                                case 0:
                                    oq.u.b(objF);
                                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                    aVar2 = new ex.a();
                                    zz3.a aVar3 = this.authenticationContainersInteractor;
                                    challenge2 = challenge;
                                    aVar.f22452d = challenge2;
                                    aVar.f22453e = jVarA;
                                    aVar.f22454f = vq.j.a(aVar2);
                                    aVar.f22455g = aVar2;
                                    aVar.f22462p = 0;
                                    aVar.f22463q = 0;
                                    aVar.f22464r = 0;
                                    aVar.f22465s = 0;
                                    aVar.f22466t = 0;
                                    aVar.f22471z = 1;
                                    objF = zz3.a.f(aVar3, false, aVar, 1, null);
                                    if (objF != objE) {
                                        bVar = aVar2;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        i19 = 0;
                                        jVar = jVarA;
                                        iVar = (dx.i) objF;
                                        if (!(iVar instanceof dx.i.Left)) {
                                            bVar.b(this.deactivateDomainErrorFactory.b(false));
                                            throw new oq.g();
                                        }
                                        if (iVar instanceof dx.i.Right) {
                                            throw new p();
                                        }
                                        uVar = (u) ((dx.i.Right) iVar).b();
                                        zz3.a aVar4 = this.authenticationContainersInteractor;
                                        aVar.f22452d = challenge2;
                                        aVar.f22453e = jVar;
                                        aVar.f22454f = vq.j.a(aVar2);
                                        aVar.f22455g = vq.j.a(bVar);
                                        aVar.f22456h = vq.j.a(uVar);
                                        aVar.f22457j = bVar;
                                        aVar.f22462p = i17;
                                        aVar.f22463q = i16;
                                        aVar.f22464r = i15;
                                        aVar.f22465s = i18;
                                        aVar.f22466t = i19;
                                        aVar.f22471z = 2;
                                        objB2 = aVar4.b(uVar, aVar);
                                        if (objB2 == objE) {
                                            ex.b bVar12 = aVar2;
                                            uVar2 = uVar;
                                            objF = objB2;
                                            bVar2 = bVar12;
                                            challenge3 = challenge2;
                                            i25 = i19;
                                            bVar3 = bVar;
                                            jVar2 = jVar;
                                            certKeyPair = (CertKeyPair) bVar.a((dx.i) objF);
                                            l lVar = this.getJwtTokenUseCase;
                                            uVar3 = uVar2;
                                            bVar4 = bVar3;
                                            l.Params params = new l.Params(new JwtRequest(challenge3.getChallenge()), certKeyPair);
                                            aVar.f22452d = challenge3;
                                            aVar.f22453e = jVar2;
                                            aVar.f22454f = vq.j.a(bVar2);
                                            aVar.f22455g = vq.j.a(bVar4);
                                            aVar.f22456h = vq.j.a(certKeyPair);
                                            aVar.f22457j = vq.j.a(uVar3);
                                            aVar.f22462p = i17;
                                            aVar.f22463q = i16;
                                            aVar.f22464r = i15;
                                            aVar.f22465s = i18;
                                            aVar.f22466t = i25;
                                            aVar.f22471z = 3;
                                            objC = lVar.c(params, aVar);
                                            if (objC != objE) {
                                                certKeyPair2 = certKeyPair;
                                                objF = objC;
                                                bVar5 = bVar2;
                                                uVar4 = uVar3;
                                                r15 = jVar2;
                                                try {
                                                    iVar2 = (dx.i) objF;
                                                    try {
                                                        if (!(iVar2 instanceof dx.i.Left)) {
                                                            if (iVar2 instanceof dx.i.Right) {
                                                                throw new p();
                                                            }
                                                            AccessToken accessToken = new AccessToken(((Jwt) ((dx.i.Right) iVar2).b()).getToken(), ((Jwt) ((dx.i.Right) iVar2).b()).getValidityInSeconds(), this.currentTimeProvider.a());
                                                            b04.a aVar5 = this.autoCertificateRenewalCache;
                                                            OffsetDateTime certificateExpiryDate = ((Jwt) ((dx.i.Right) iVar2).b()).getCertificateExpiryDate();
                                                            boolean certificateRenewalRequired = ((Jwt) ((dx.i.Right) iVar2).b()).getCertificateRenewalRequired();
                                                            if (this.autoCertificateRenewalCache.getAutoRenewalData() == null) {
                                                                z15 = true;
                                                            } else {
                                                                z15 = false;
                                                            }
                                                            aVar5.e0(new AutoCertificateRenewalData(certificateRenewalRequired, z15, certificateExpiryDate));
                                                            wy.b.F(this.networkSessionManager, null, accessToken, 1, null);
                                                            return new dx.i.Right(accessToken);
                                                        }
                                                        bVar6 = (dx.b) ((dx.i.Left) iVar2).b();
                                                        if (!t.c(bVar6, dx.b.g.e.f45078a) || (bVar6 instanceof dx.b.g.SslCertificate) || (bVar6 instanceof dx.b.AppUpdateRequired)) {
                                                            return new dx.i.Left(bVar6);
                                                        }
                                                        if (!(bVar6 instanceof dx.b.Deactivate)) {
                                                            this.networkSessionManager.R();
                                                            return new dx.i.Left(dx.b.g.a.f45045a);
                                                        }
                                                        dx.b.Deactivate.a data = ((dx.b.Deactivate) bVar6).getData();
                                                        u uVar7 = uVar4;
                                                        IdentityDeactivateData identityDeactivateData4 = data instanceof IdentityDeactivateData ? (IdentityDeactivateData) data : null;
                                                        if (identityDeactivateData4 != null) {
                                                            clearData = identityDeactivateData4.getClearData();
                                                        } else {
                                                            z16 = false;
                                                        }
                                                        if (!z16) {
                                                            z16 = clearData;
                                                            this.networkSessionManager.R();
                                                            return new dx.i.Left(bVar6);
                                                        }
                                                        z16 = clearData;
                                                        CertKeyPair certKeyPair4 = certKeyPair2;
                                                        zz3.a aVar6 = this.authenticationContainersInteractor;
                                                        aVar.f22452d = challenge3;
                                                        aVar.f22453e = r15;
                                                        ?? r110 = r15;
                                                        aVar.f22454f = vq.j.a(bVar5);
                                                        aVar.f22455g = vq.j.a(bVar4);
                                                        aVar.f22456h = vq.j.a(certKeyPair4);
                                                        aVar.f22457j = vq.j.a(iVar2);
                                                        aVar.f22458k = vq.j.a(bVar6);
                                                        aVar.f22459l = identityDeactivateData4;
                                                        aVar.f22460m = vq.j.a(uVar7);
                                                        aVar.f22462p = i17;
                                                        aVar.f22463q = i16;
                                                        aVar.f22464r = i15;
                                                        aVar.f22465s = i18;
                                                        aVar.f22466t = i25;
                                                        aVar.f22467v = z16 ? 1 : 0;
                                                        aVar.f22471z = 4;
                                                        if (aVar6.e(aVar) != objE) {
                                                            ex.b bVar13 = bVar4;
                                                            uVar5 = uVar7;
                                                            certKeyPair3 = certKeyPair4;
                                                            bVar7 = bVar6;
                                                            iVar3 = iVar2;
                                                            i26 = i16;
                                                            bVar8 = bVar13;
                                                            int i45 = i17;
                                                            i27 = i25;
                                                            challenge4 = challenge3;
                                                            i28 = i45;
                                                            int i46 = i18;
                                                            identityDeactivateData = identityDeactivateData4;
                                                            i29 = i46;
                                                            i35 = i15;
                                                            r16 = r110;
                                                            r17 = z16;
                                                            bVar9 = this.notificationsInteractor;
                                                            aVar.f22452d = challenge4;
                                                            aVar.f22453e = r16;
                                                            challenge5 = challenge4;
                                                            aVar.f22454f = vq.j.a(bVar5);
                                                            aVar.f22455g = vq.j.a(bVar8);
                                                            aVar.f22456h = vq.j.a(certKeyPair3);
                                                            aVar.f22457j = vq.j.a(iVar3);
                                                            aVar.f22458k = vq.j.a(bVar7);
                                                            aVar.f22459l = identityDeactivateData;
                                                            aVar.f22460m = vq.j.a(uVar5);
                                                            aVar.f22462p = i28;
                                                            aVar.f22463q = i26;
                                                            aVar.f22464r = i35;
                                                            aVar.f22465s = i29;
                                                            aVar.f22466t = i27;
                                                            aVar.f22467v = r17 == true ? 1 : 0;
                                                            aVar.f22471z = 5;
                                                            if (bVar9.a(aVar) == objE) {
                                                                IdentityDeactivateData identityDeactivateData5 = identityDeactivateData;
                                                                i36 = i26;
                                                                uVar6 = uVar5;
                                                                bVar10 = bVar5;
                                                                i37 = i28;
                                                                identityDeactivateData2 = identityDeactivateData5;
                                                                challenge6 = challenge5;
                                                                r19 = r16;
                                                                r18 = r17;
                                                                bVar11 = bVar8;
                                                                iVar4 = iVar3;
                                                                if (wy.b.s(this.networkSessionManager, null, 1, null)) {
                                                                    aVar.f22452d = vq.j.a(challenge6);
                                                                    aVar.f22453e = r19;
                                                                    aVar.f22454f = vq.j.a(bVar10);
                                                                    aVar.f22455g = vq.j.a(bVar11);
                                                                    aVar.f22456h = vq.j.a(certKeyPair3);
                                                                    aVar.f22457j = vq.j.a(iVar4);
                                                                    aVar.f22458k = vq.j.a(bVar7);
                                                                    aVar.f22459l = vq.j.a(identityDeactivateData2);
                                                                    aVar.f22460m = vq.j.a(uVar6);
                                                                    aVar.f22462p = i37;
                                                                    aVar.f22463q = i36;
                                                                    aVar.f22464r = i35;
                                                                    aVar.f22465s = i29;
                                                                    aVar.f22466t = i27;
                                                                    aVar.f22467v = r18;
                                                                    aVar.f22471z = 6;
                                                                    objF = e(challenge6, aVar);
                                                                    if (objF == objE) {
                                                                    }
                                                                    return (dx.i) objF;
                                                                }
                                                                this.networkSessionManager.R();
                                                                zz3.a aVar7 = this.authenticationContainersInteractor;
                                                                aVar.f22452d = vq.j.a(challenge6);
                                                                aVar.f22453e = r19;
                                                                aVar.f22454f = vq.j.a(bVar10);
                                                                aVar.f22455g = vq.j.a(bVar11);
                                                                aVar.f22456h = vq.j.a(certKeyPair3);
                                                                aVar.f22457j = vq.j.a(iVar4);
                                                                aVar.f22458k = vq.j.a(bVar7);
                                                                aVar.f22459l = vq.j.a(identityDeactivateData2);
                                                                aVar.f22460m = vq.j.a(uVar6);
                                                                aVar.f22461n = identityDeactivateData2;
                                                                aVar.f22462p = i37;
                                                                aVar.f22463q = i36;
                                                                aVar.f22464r = i35;
                                                                aVar.f22465s = i29;
                                                                aVar.f22466t = i27;
                                                                aVar.f22467v = r18;
                                                                aVar.f22468w = 0;
                                                                aVar.f22471z = 7;
                                                                objF = aVar7.d(aVar);
                                                                if (objF != objE) {
                                                                    identityDeactivateData3 = identityDeactivateData2;
                                                                    i38 = 0;
                                                                    r25 = r19;
                                                                    ?? r26 = r25;
                                                                    if (i38 != 0) {
                                                                        z17 = true;
                                                                    } else {
                                                                        z17 = false;
                                                                    }
                                                                    try {
                                                                        iVar5 = (dx.i) objF;
                                                                        if (iVar5 instanceof dx.i.Left) {
                                                                            objB3 = vq.b.a(false);
                                                                        } else {
                                                                            if (iVar5 instanceof dx.i.Right) {
                                                                                throw new p();
                                                                            }
                                                                            objB3 = ((dx.i.Right) iVar5).b();
                                                                        }
                                                                        return new dx.i.Left(new dx.b.Deactivate(IdentityDeactivateData.b(identityDeactivateData3, null, z17, ((Boolean) objB3).booleanValue(), 3, null)));
                                                                    } catch (ex.c e15) {
                                                                        e = e15;
                                                                    } catch (CancellationException e16) {
                                                                        throw e16;
                                                                    } catch (Exception e17) {
                                                                        e = e17;
                                                                        r15 = r26;
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
                                                                                throw new p();
                                                                            }
                                                                            objB = ((dx.i.Right) iVarA).b();
                                                                        }
                                                                        return new dx.i.Left(objB);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (ex.c e18) {
                                                        e = e18;
                                                    } catch (CancellationException e19) {
                                                        throw e19;
                                                    } catch (Exception e25) {
                                                        e = e25;
                                                        r15 = obj3;
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
                                                                throw new p();
                                                            }
                                                            objB = ((dx.i.Right) iVarA).b();
                                                        }
                                                        return new dx.i.Left(objB);
                                                    }
                                                } catch (ex.c e26) {
                                                    e = e26;
                                                } catch (CancellationException e27) {
                                                    throw e27;
                                                } catch (Exception e28) {
                                                    e = e28;
                                                }
                                                return new dx.i.Left((dx.b) ex.d.a(e));
                                            }
                                        }
                                    }
                                    return objE;
                                case 1:
                                    int i47 = aVar.f22466t;
                                    int i48 = aVar.f22465s;
                                    i15 = aVar.f22464r;
                                    i16 = aVar.f22463q;
                                    i17 = aVar.f22462p;
                                    bVar = (ex.b) aVar.f22455g;
                                    aVar2 = (ex.b) aVar.f22454f;
                                    dx.j<dx.b> jVar3 = (dx.j) aVar.f22453e;
                                    Challenge challenge7 = (Challenge) aVar.f22452d;
                                    try {
                                        oq.u.b(objF);
                                        i19 = i47;
                                        challenge2 = challenge7;
                                        i18 = i48;
                                        jVar = jVar3;
                                        iVar = (dx.i) objF;
                                        if (!(iVar instanceof dx.i.Left)) {
                                            bVar.b(this.deactivateDomainErrorFactory.b(false));
                                            throw new oq.g();
                                        }
                                        if (iVar instanceof dx.i.Right) {
                                            throw new p();
                                        }
                                        uVar = (u) ((dx.i.Right) iVar).b();
                                        zz3.a aVar8 = this.authenticationContainersInteractor;
                                        aVar.f22452d = challenge2;
                                        aVar.f22453e = jVar;
                                        aVar.f22454f = vq.j.a(aVar2);
                                        aVar.f22455g = vq.j.a(bVar);
                                        aVar.f22456h = vq.j.a(uVar);
                                        aVar.f22457j = bVar;
                                        aVar.f22462p = i17;
                                        aVar.f22463q = i16;
                                        aVar.f22464r = i15;
                                        aVar.f22465s = i18;
                                        aVar.f22466t = i19;
                                        aVar.f22471z = 2;
                                        objB2 = aVar8.b(uVar, aVar);
                                        if (objB2 == objE) {
                                            ex.b bVar14 = aVar2;
                                            uVar2 = uVar;
                                            objF = objB2;
                                            bVar2 = bVar14;
                                            challenge3 = challenge2;
                                            i25 = i19;
                                            bVar3 = bVar;
                                            jVar2 = jVar;
                                            certKeyPair = (CertKeyPair) bVar.a((dx.i) objF);
                                            l lVar2 = this.getJwtTokenUseCase;
                                            uVar3 = uVar2;
                                            bVar4 = bVar3;
                                            l.Params params2 = new l.Params(new JwtRequest(challenge3.getChallenge()), certKeyPair);
                                            aVar.f22452d = challenge3;
                                            aVar.f22453e = jVar2;
                                            aVar.f22454f = vq.j.a(bVar2);
                                            aVar.f22455g = vq.j.a(bVar4);
                                            aVar.f22456h = vq.j.a(certKeyPair);
                                            aVar.f22457j = vq.j.a(uVar3);
                                            aVar.f22462p = i17;
                                            aVar.f22463q = i16;
                                            aVar.f22464r = i15;
                                            aVar.f22465s = i18;
                                            aVar.f22466t = i25;
                                            aVar.f22471z = 3;
                                            objC = lVar2.c(params2, aVar);
                                            if (objC != objE) {
                                                certKeyPair2 = certKeyPair;
                                                objF = objC;
                                                bVar5 = bVar2;
                                                uVar4 = uVar3;
                                                r15 = jVar2;
                                                iVar2 = (dx.i) objF;
                                                if (!(iVar2 instanceof dx.i.Left)) {
                                                    bVar6 = (dx.b) ((dx.i.Left) iVar2).b();
                                                    if (t.c(bVar6, dx.b.g.e.f45078a)) {
                                                        break;
                                                    }
                                                    return new dx.i.Left(bVar6);
                                                }
                                                if (iVar2 instanceof dx.i.Right) {
                                                    throw new p();
                                                }
                                                AccessToken accessToken2 = new AccessToken(((Jwt) ((dx.i.Right) iVar2).b()).getToken(), ((Jwt) ((dx.i.Right) iVar2).b()).getValidityInSeconds(), this.currentTimeProvider.a());
                                                b04.a aVar9 = this.autoCertificateRenewalCache;
                                                OffsetDateTime certificateExpiryDate2 = ((Jwt) ((dx.i.Right) iVar2).b()).getCertificateExpiryDate();
                                                boolean certificateRenewalRequired2 = ((Jwt) ((dx.i.Right) iVar2).b()).getCertificateRenewalRequired();
                                                if (this.autoCertificateRenewalCache.getAutoRenewalData() == null) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                aVar9.e0(new AutoCertificateRenewalData(certificateRenewalRequired2, z15, certificateExpiryDate2));
                                                wy.b.F(this.networkSessionManager, null, accessToken2, 1, null);
                                                return new dx.i.Right(accessToken2);
                                                return new dx.i.Left((dx.b) ex.d.a(e));
                                            }
                                        }
                                        return objE;
                                    } catch (ex.c e29) {
                                        e = e29;
                                    } catch (CancellationException e35) {
                                        throw e35;
                                    } catch (Exception e36) {
                                        e = e36;
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
                                                throw new p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                    break;
                                case 2:
                                    i25 = aVar.f22466t;
                                    int i49 = aVar.f22465s;
                                    i15 = aVar.f22464r;
                                    i16 = aVar.f22463q;
                                    i17 = aVar.f22462p;
                                    bVar = (ex.b) aVar.f22457j;
                                    uVar2 = (u) aVar.f22456h;
                                    ex.b bVar15 = (ex.b) aVar.f22455g;
                                    ex.b bVar16 = (ex.b) aVar.f22454f;
                                    dx.j<dx.b> jVar4 = (dx.j) aVar.f22453e;
                                    challenge3 = (Challenge) aVar.f22452d;
                                    oq.u.b(objF);
                                    i18 = i49;
                                    jVar2 = jVar4;
                                    bVar2 = bVar16;
                                    bVar3 = bVar15;
                                    certKeyPair = (CertKeyPair) bVar.a((dx.i) objF);
                                    l lVar3 = this.getJwtTokenUseCase;
                                    uVar3 = uVar2;
                                    bVar4 = bVar3;
                                    l.Params params3 = new l.Params(new JwtRequest(challenge3.getChallenge()), certKeyPair);
                                    aVar.f22452d = challenge3;
                                    aVar.f22453e = jVar2;
                                    aVar.f22454f = vq.j.a(bVar2);
                                    aVar.f22455g = vq.j.a(bVar4);
                                    aVar.f22456h = vq.j.a(certKeyPair);
                                    aVar.f22457j = vq.j.a(uVar3);
                                    aVar.f22462p = i17;
                                    aVar.f22463q = i16;
                                    aVar.f22464r = i15;
                                    aVar.f22465s = i18;
                                    aVar.f22466t = i25;
                                    aVar.f22471z = 3;
                                    objC = lVar3.c(params3, aVar);
                                    if (objC != objE) {
                                        certKeyPair2 = certKeyPair;
                                        objF = objC;
                                        bVar5 = bVar2;
                                        uVar4 = uVar3;
                                        r15 = jVar2;
                                        iVar2 = (dx.i) objF;
                                        if (!(iVar2 instanceof dx.i.Left)) {
                                            bVar6 = (dx.b) ((dx.i.Left) iVar2).b();
                                            if (t.c(bVar6, dx.b.g.e.f45078a)) {
                                                break;
                                            }
                                            return new dx.i.Left(bVar6);
                                        }
                                        if (iVar2 instanceof dx.i.Right) {
                                            throw new p();
                                        }
                                        AccessToken accessToken3 = new AccessToken(((Jwt) ((dx.i.Right) iVar2).b()).getToken(), ((Jwt) ((dx.i.Right) iVar2).b()).getValidityInSeconds(), this.currentTimeProvider.a());
                                        b04.a aVar10 = this.autoCertificateRenewalCache;
                                        OffsetDateTime certificateExpiryDate3 = ((Jwt) ((dx.i.Right) iVar2).b()).getCertificateExpiryDate();
                                        boolean certificateRenewalRequired3 = ((Jwt) ((dx.i.Right) iVar2).b()).getCertificateRenewalRequired();
                                        if (this.autoCertificateRenewalCache.getAutoRenewalData() == null) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        aVar10.e0(new AutoCertificateRenewalData(certificateRenewalRequired3, z15, certificateExpiryDate3));
                                        wy.b.F(this.networkSessionManager, null, accessToken3, 1, null);
                                        return new dx.i.Right(accessToken3);
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    }
                                    return objE;
                                case 3:
                                    i25 = aVar.f22466t;
                                    int i55 = aVar.f22465s;
                                    i15 = aVar.f22464r;
                                    i16 = aVar.f22463q;
                                    i17 = aVar.f22462p;
                                    uVar4 = (u) aVar.f22457j;
                                    certKeyPair2 = (CertKeyPair) aVar.f22456h;
                                    ex.b bVar17 = (ex.b) aVar.f22455g;
                                    bVar5 = (ex.b) aVar.f22454f;
                                    dx.j jVar5 = (dx.j) aVar.f22453e;
                                    challenge3 = (Challenge) aVar.f22452d;
                                    oq.u.b(objF);
                                    bVar4 = bVar17;
                                    i18 = i55;
                                    r15 = jVar5;
                                    iVar2 = (dx.i) objF;
                                    if (!(iVar2 instanceof dx.i.Left)) {
                                        bVar6 = (dx.b) ((dx.i.Left) iVar2).b();
                                        if (t.c(bVar6, dx.b.g.e.f45078a)) {
                                            break;
                                        }
                                        return new dx.i.Left(bVar6);
                                    }
                                    if (iVar2 instanceof dx.i.Right) {
                                        throw new p();
                                    }
                                    AccessToken accessToken4 = new AccessToken(((Jwt) ((dx.i.Right) iVar2).b()).getToken(), ((Jwt) ((dx.i.Right) iVar2).b()).getValidityInSeconds(), this.currentTimeProvider.a());
                                    b04.a aVar11 = this.autoCertificateRenewalCache;
                                    OffsetDateTime certificateExpiryDate4 = ((Jwt) ((dx.i.Right) iVar2).b()).getCertificateExpiryDate();
                                    boolean certificateRenewalRequired4 = ((Jwt) ((dx.i.Right) iVar2).b()).getCertificateRenewalRequired();
                                    if (this.autoCertificateRenewalCache.getAutoRenewalData() == null) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    aVar11.e0(new AutoCertificateRenewalData(certificateRenewalRequired4, z15, certificateExpiryDate4));
                                    wy.b.F(this.networkSessionManager, null, accessToken4, 1, null);
                                    return new dx.i.Right(accessToken4);
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                case 4:
                                    int i56 = aVar.f22467v;
                                    int i57 = aVar.f22466t;
                                    int i58 = aVar.f22465s;
                                    int i59 = aVar.f22464r;
                                    int i65 = aVar.f22463q;
                                    int i66 = aVar.f22462p;
                                    u uVar8 = (u) aVar.f22460m;
                                    identityDeactivateData = (IdentityDeactivateData) aVar.f22459l;
                                    dx.b bVar18 = (dx.b) aVar.f22458k;
                                    iVar3 = (dx.i) aVar.f22457j;
                                    CertKeyPair certKeyPair5 = (CertKeyPair) aVar.f22456h;
                                    ex.b bVar19 = (ex.b) aVar.f22455g;
                                    ex.b bVar20 = (ex.b) aVar.f22454f;
                                    dx.j jVar6 = (dx.j) aVar.f22453e;
                                    challenge4 = (Challenge) aVar.f22452d;
                                    oq.u.b(objF);
                                    i35 = i59;
                                    bVar8 = bVar19;
                                    r17 = i56;
                                    uVar5 = uVar8;
                                    i26 = i65;
                                    i27 = i57;
                                    r16 = jVar6;
                                    bVar7 = bVar18;
                                    bVar5 = bVar20;
                                    certKeyPair3 = certKeyPair5;
                                    i28 = i66;
                                    i29 = i58;
                                    bVar9 = this.notificationsInteractor;
                                    aVar.f22452d = challenge4;
                                    aVar.f22453e = r16;
                                    challenge5 = challenge4;
                                    aVar.f22454f = vq.j.a(bVar5);
                                    aVar.f22455g = vq.j.a(bVar8);
                                    aVar.f22456h = vq.j.a(certKeyPair3);
                                    aVar.f22457j = vq.j.a(iVar3);
                                    aVar.f22458k = vq.j.a(bVar7);
                                    aVar.f22459l = identityDeactivateData;
                                    aVar.f22460m = vq.j.a(uVar5);
                                    aVar.f22462p = i28;
                                    aVar.f22463q = i26;
                                    aVar.f22464r = i35;
                                    aVar.f22465s = i29;
                                    aVar.f22466t = i27;
                                    aVar.f22467v = r17 == true ? 1 : 0;
                                    aVar.f22471z = 5;
                                    if (bVar9.a(aVar) == objE) {
                                        IdentityDeactivateData identityDeactivateData6 = identityDeactivateData;
                                        i36 = i26;
                                        uVar6 = uVar5;
                                        bVar10 = bVar5;
                                        i37 = i28;
                                        identityDeactivateData2 = identityDeactivateData6;
                                        challenge6 = challenge5;
                                        r19 = r16;
                                        r18 = r17;
                                        bVar11 = bVar8;
                                        iVar4 = iVar3;
                                        if (wy.b.s(this.networkSessionManager, null, 1, null)) {
                                            aVar.f22452d = vq.j.a(challenge6);
                                            aVar.f22453e = r19;
                                            aVar.f22454f = vq.j.a(bVar10);
                                            aVar.f22455g = vq.j.a(bVar11);
                                            aVar.f22456h = vq.j.a(certKeyPair3);
                                            aVar.f22457j = vq.j.a(iVar4);
                                            aVar.f22458k = vq.j.a(bVar7);
                                            aVar.f22459l = vq.j.a(identityDeactivateData2);
                                            aVar.f22460m = vq.j.a(uVar6);
                                            aVar.f22462p = i37;
                                            aVar.f22463q = i36;
                                            aVar.f22464r = i35;
                                            aVar.f22465s = i29;
                                            aVar.f22466t = i27;
                                            aVar.f22467v = r18;
                                            aVar.f22471z = 6;
                                            objF = e(challenge6, aVar);
                                            if (objF == objE) {
                                            }
                                            return (dx.i) objF;
                                        }
                                        this.networkSessionManager.R();
                                        zz3.a aVar12 = this.authenticationContainersInteractor;
                                        aVar.f22452d = vq.j.a(challenge6);
                                        aVar.f22453e = r19;
                                        aVar.f22454f = vq.j.a(bVar10);
                                        aVar.f22455g = vq.j.a(bVar11);
                                        aVar.f22456h = vq.j.a(certKeyPair3);
                                        aVar.f22457j = vq.j.a(iVar4);
                                        aVar.f22458k = vq.j.a(bVar7);
                                        aVar.f22459l = vq.j.a(identityDeactivateData2);
                                        aVar.f22460m = vq.j.a(uVar6);
                                        aVar.f22461n = identityDeactivateData2;
                                        aVar.f22462p = i37;
                                        aVar.f22463q = i36;
                                        aVar.f22464r = i35;
                                        aVar.f22465s = i29;
                                        aVar.f22466t = i27;
                                        aVar.f22467v = r18;
                                        aVar.f22468w = 0;
                                        aVar.f22471z = 7;
                                        objF = aVar12.d(aVar);
                                        if (objF != objE) {
                                            identityDeactivateData3 = identityDeactivateData2;
                                            i38 = 0;
                                            r25 = r19;
                                            ?? r27 = r25;
                                            if (i38 != 0) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            iVar5 = (dx.i) objF;
                                            if (iVar5 instanceof dx.i.Left) {
                                                objB3 = vq.b.a(false);
                                            } else {
                                                if (iVar5 instanceof dx.i.Right) {
                                                    throw new p();
                                                }
                                                objB3 = ((dx.i.Right) iVar5).b();
                                            }
                                            return new dx.i.Left(new dx.b.Deactivate(IdentityDeactivateData.b(identityDeactivateData3, null, z17, ((Boolean) objB3).booleanValue(), 3, null)));
                                        }
                                    }
                                    return objE;
                                case 5:
                                    int i67 = aVar.f22467v;
                                    i27 = aVar.f22466t;
                                    i29 = aVar.f22465s;
                                    i35 = aVar.f22464r;
                                    i36 = aVar.f22463q;
                                    i37 = aVar.f22462p;
                                    u uVar9 = (u) aVar.f22460m;
                                    identityDeactivateData2 = (IdentityDeactivateData) aVar.f22459l;
                                    dx.b bVar21 = (dx.b) aVar.f22458k;
                                    dx.i iVar6 = (dx.i) aVar.f22457j;
                                    CertKeyPair certKeyPair6 = (CertKeyPair) aVar.f22456h;
                                    bVar8 = (ex.b) aVar.f22455g;
                                    bVar10 = (ex.b) aVar.f22454f;
                                    dx.j jVar7 = (dx.j) aVar.f22453e;
                                    challenge6 = (Challenge) aVar.f22452d;
                                    oq.u.b(objF);
                                    uVar6 = uVar9;
                                    iVar3 = iVar6;
                                    r19 = jVar7;
                                    bVar7 = bVar21;
                                    r18 = i67;
                                    certKeyPair3 = certKeyPair6;
                                    bVar11 = bVar8;
                                    iVar4 = iVar3;
                                    if (wy.b.s(this.networkSessionManager, null, 1, null)) {
                                        aVar.f22452d = vq.j.a(challenge6);
                                        aVar.f22453e = r19;
                                        aVar.f22454f = vq.j.a(bVar10);
                                        aVar.f22455g = vq.j.a(bVar11);
                                        aVar.f22456h = vq.j.a(certKeyPair3);
                                        aVar.f22457j = vq.j.a(iVar4);
                                        aVar.f22458k = vq.j.a(bVar7);
                                        aVar.f22459l = vq.j.a(identityDeactivateData2);
                                        aVar.f22460m = vq.j.a(uVar6);
                                        aVar.f22462p = i37;
                                        aVar.f22463q = i36;
                                        aVar.f22464r = i35;
                                        aVar.f22465s = i29;
                                        aVar.f22466t = i27;
                                        aVar.f22467v = r18;
                                        aVar.f22471z = 6;
                                        objF = e(challenge6, aVar);
                                        if (objF == objE) {
                                        }
                                        return (dx.i) objF;
                                    }
                                    this.networkSessionManager.R();
                                    zz3.a aVar13 = this.authenticationContainersInteractor;
                                    aVar.f22452d = vq.j.a(challenge6);
                                    aVar.f22453e = r19;
                                    aVar.f22454f = vq.j.a(bVar10);
                                    aVar.f22455g = vq.j.a(bVar11);
                                    aVar.f22456h = vq.j.a(certKeyPair3);
                                    aVar.f22457j = vq.j.a(iVar4);
                                    aVar.f22458k = vq.j.a(bVar7);
                                    aVar.f22459l = vq.j.a(identityDeactivateData2);
                                    aVar.f22460m = vq.j.a(uVar6);
                                    aVar.f22461n = identityDeactivateData2;
                                    aVar.f22462p = i37;
                                    aVar.f22463q = i36;
                                    aVar.f22464r = i35;
                                    aVar.f22465s = i29;
                                    aVar.f22466t = i27;
                                    aVar.f22467v = r18;
                                    aVar.f22468w = 0;
                                    aVar.f22471z = 7;
                                    objF = aVar13.d(aVar);
                                    if (objF != objE) {
                                        identityDeactivateData3 = identityDeactivateData2;
                                        i38 = 0;
                                        r25 = r19;
                                        ?? r28 = r25;
                                        if (i38 != 0) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        iVar5 = (dx.i) objF;
                                        if (iVar5 instanceof dx.i.Left) {
                                            objB3 = vq.b.a(false);
                                        } else {
                                            if (iVar5 instanceof dx.i.Right) {
                                                throw new p();
                                            }
                                            objB3 = ((dx.i.Right) iVar5).b();
                                        }
                                        return new dx.i.Left(new dx.b.Deactivate(IdentityDeactivateData.b(identityDeactivateData3, null, z17, ((Boolean) objB3).booleanValue(), 3, null)));
                                    }
                                    return objE;
                                case 6:
                                    oq.u.b(objF);
                                    return (dx.i) objF;
                                case 7:
                                    i38 = aVar.f22468w;
                                    identityDeactivateData3 = (IdentityDeactivateData) aVar.f22461n;
                                    dx.j jVar8 = (dx.j) aVar.f22453e;
                                    oq.u.b(objF);
                                    r25 = jVar8;
                                    ?? r29 = r25;
                                    if (i38 != 0) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    iVar5 = (dx.i) objF;
                                    if (iVar5 instanceof dx.i.Left) {
                                        objB3 = vq.b.a(false);
                                    } else {
                                        if (iVar5 instanceof dx.i.Right) {
                                            throw new p();
                                        }
                                        objB3 = ((dx.i.Right) iVar5).b();
                                    }
                                    return new dx.i.Left(new dx.b.Deactivate(IdentityDeactivateData.b(identityDeactivateData3, null, z17, ((Boolean) objB3).booleanValue(), 3, null)));
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Exception e37) {
                            e = e37;
                        }
                    } catch (CancellationException e38) {
                        throw e38;
                    }
                } catch (ex.c e39) {
                    e = e39;
                } catch (CancellationException e45) {
                    throw e45;
                } catch (Exception e46) {
                    e = e46;
                    r15 = obj2;
                }
            } catch (ex.c e47) {
                e = e47;
            } catch (CancellationException e48) {
                throw e48;
            }
        } catch (ex.c e49) {
            e = e49;
        } catch (CancellationException e55) {
            throw e55;
        } catch (Exception e56) {
            e = e56;
            r15 = obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, AccessToken>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f22476h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f22476h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f22474f;
        Object objE = uq.b.e();
        int i16 = bVar.f22476h;
        if (i16 == 0) {
            oq.u.b(objC);
            wz3.e eVar2 = this.getChallengeUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            bVar.f22472d = vq.j.a(c1792a);
            bVar.f22476h = 1;
            objC = eVar2.c(c1792a2, bVar);
            if (objC != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
            return objC;
        }
        c1792a = (gz.b.a.C1792a) bVar.f22472d;
        oq.u.b(objC);
        dx.i iVar = (dx.i) objC;
        if (!(iVar instanceof dx.i.Right)) {
            if (!(iVar instanceof dx.i.Left)) {
                throw new p();
            }
            this.networkSessionManager.R();
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            return ((bVar2 instanceof dx.b.Deactivate) || t.c(bVar2, dx.b.g.e.f45078a) || (bVar2 instanceof dx.b.g.SslCertificate) || (bVar2 instanceof dx.b.AppUpdateRequired)) ? new dx.i.Left(bVar2) : new dx.i.Left(dx.b.g.a.f45045a);
        }
        Challenge challenge = (Challenge) ((dx.i.Right) iVar).b();
        bVar.f22472d = vq.j.a(c1792a);
        bVar.f22473e = vq.j.a(iVar);
        bVar.f22476h = 2;
        Object objE2 = e(challenge, bVar);
        return objE2 == objE ? objE : objE2;
    }
}
