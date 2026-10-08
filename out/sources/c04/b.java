package c04;

import ay.Challenge;
import iy.b0;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import th0.GenerateCertResponse;
import th0.GenerateCertificateSignedRequest;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096B¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lc04/b;", "Lwz3/b;", "Luh0/h;", "generateIdCardCertificateUseCase", "Luh0/i;", "generateRefugeeCertificateUseCase", "Lwz3/c;", "decryptNewCertificateUseCase", "Lwz3/e;", "getChallengeUC", "Lax0/a;", "afterUserActivationProcessUseCase", "Lwz3/d;", "getBase64SignedValueUseCase", "Lzz3/b;", "notificationsInteractor", "Lb04/a;", "autoCertificateRenewalCache", "Lwy/b;", "networkSessionManager", "<init>", "(Luh0/h;Luh0/i;Lwz3/c;Lwz3/e;Lax0/a;Lwz3/d;Lzz3/b;Lb04/a;Lwy/b;)V", "Lwz3/b$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lwz3/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Luh0/h;", "b", "Luh0/i;", "c", "Lwz3/c;", "Lwz3/e;", "e", "Lax0/a;", "f", "Lwz3/d;", "g", "Lzz3/b;", "h", "Lb04/a;", "i", "Lwy/b;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements wz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uh0.h generateIdCardCertificateUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uh0.i generateRefugeeCertificateUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wz3.c decryptNewCertificateUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wz3.e getChallengeUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ax0.a afterUserActivationProcessUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wz3.d getBase64SignedValueUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final zz3.b notificationsInteractor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final b04.a autoCertificateRenewalCache;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final wy.b networkSessionManager;

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
        Object f22357d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f22359f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f22360g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f22361h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f22362j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f22363k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f22364l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f22365m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f22366n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f22367p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22368q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f22369r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f22370s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f22371t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f22372v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f22373w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f22374x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f22375y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f22376z;

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

    public b(uh0.h hVar, uh0.i iVar, wz3.c cVar, wz3.e eVar, ax0.a aVar, wz3.d dVar, zz3.b bVar, b04.a aVar2, wy.b bVar2) {
        this.generateIdCardCertificateUseCase = hVar;
        this.generateRefugeeCertificateUseCase = iVar;
        this.decryptNewCertificateUseCase = cVar;
        this.getChallengeUC = eVar;
        this.afterUserActivationProcessUseCase = aVar;
        this.getBase64SignedValueUseCase = dVar;
        this.notificationsInteractor = bVar;
        this.autoCertificateRenewalCache = aVar2;
        this.networkSessionManager = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03fd A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x044d  */
    /* JADX WARN: Code duplicated, block: B:103:0x044f  */
    /* JADX WARN: Code duplicated, block: B:107:0x046c  */
    /* JADX WARN: Code duplicated, block: B:108:0x046e A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0472 A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:113:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:116:0x0503  */
    /* JADX WARN: Code duplicated, block: B:117:0x0505 A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0509 A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0586  */
    /* JADX WARN: Code duplicated, block: B:122:0x0589  */
    /* JADX WARN: Code duplicated, block: B:127:0x062e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0641 A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TRY_ENTER, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0647 A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x064d A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0664 A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x066a A[Catch: Exception -> 0x02ac, c -> 0x02b0, CancellationException -> 0x02b4, TRY_ENTER, TryCatch #17 {c -> 0x02b0, CancellationException -> 0x02b4, Exception -> 0x02ac, blocks: (B:63:0x02a0, B:76:0x02f7, B:79:0x0300, B:81:0x0304, B:140:0x066a, B:141:0x066f), top: B:169:0x02a0 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0690  */
    /* JADX WARN: Code duplicated, block: B:157:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:158:0x06af  */
    /* JADX WARN: Code duplicated, block: B:160:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:163:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:79:0x0300 A[Catch: Exception -> 0x02ac, c -> 0x02b0, CancellationException -> 0x02b4, TryCatch #17 {c -> 0x02b0, CancellationException -> 0x02b4, Exception -> 0x02ac, blocks: (B:63:0x02a0, B:76:0x02f7, B:79:0x0300, B:81:0x0304, B:140:0x066a, B:141:0x066f), top: B:169:0x02a0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0304 A[Catch: Exception -> 0x02ac, c -> 0x02b0, CancellationException -> 0x02b4, TRY_LEAVE, TryCatch #17 {c -> 0x02b0, CancellationException -> 0x02b4, Exception -> 0x02ac, blocks: (B:63:0x02a0, B:76:0x02f7, B:79:0x0300, B:81:0x0304, B:140:0x066a, B:141:0x066f), top: B:169:0x02a0 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x034c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0364  */
    /* JADX WARN: Code duplicated, block: B:88:0x0366 A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x036a A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0383 A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:95:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:98:0x03f7 A[Catch: Exception -> 0x027a, c -> 0x027e, CancellationException -> 0x0282, TryCatch #11 {c -> 0x027e, CancellationException -> 0x0282, Exception -> 0x027a, blocks: (B:123:0x05a7, B:114:0x04fb, B:117:0x0505, B:119:0x0509, B:132:0x0641, B:133:0x0646, B:104:0x0465, B:105:0x0468, B:108:0x046e, B:110:0x0472, B:134:0x0647, B:135:0x064c, B:96:0x03ed, B:54:0x0266, B:85:0x035c, B:88:0x0366, B:90:0x036a, B:92:0x0383, B:98:0x03f7, B:100:0x03fd, B:136:0x064d, B:137:0x0663, B:138:0x0664, B:139:0x0669), top: B:174:0x0266 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x01df: MOVE (r3 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:44:0x01df */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x01e4: MOVE (r3 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:46:0x01e4 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x01e9: MOVE (r3 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:48:0x01e9 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(wz3.b.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        Object obj;
        String message;
        dx.i iVarA;
        Object objB;
        wz3.b.Params params2;
        dx.j<dx.b> jVar;
        ex.b bVar;
        ex.b bVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        Object obj2;
        int i19;
        dx.i iVar;
        Challenge challenge;
        Object objC;
        int i25;
        wz3.b.Params params3;
        int i26;
        dx.j<dx.b> jVar2;
        ex.b bVar3;
        Challenge challenge2;
        dx.i iVar2;
        int i27;
        ex.b bVar4;
        int i28;
        int i29;
        int i35;
        int i36;
        dx.i iVar3;
        dx.i iVar4;
        b0 data;
        rq0.b documentType;
        ex.b bVar5;
        ex.b bVar6;
        Object objC2;
        dx.i iVar5;
        ex.b bVar7;
        int i37;
        b0 b0Var;
        Challenge challenge3;
        int i38;
        int i39;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i55;
        ex.b bVar8;
        Object objC3;
        dx.i iVar6;
        dx.i iVar7;
        dx.i iVar8;
        int i56;
        b0 b0Var2;
        GenerateCertResponse generateCertResponse;
        Object objC4;
        ?? r15;
        dx.i iVar9;
        dx.i iVar10;
        Challenge challenge4;
        dx.i iVar11;
        int i57;
        GenerateCertResponse generateCertResponse2;
        int i58;
        int i59;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i75;
        int i76;
        ?? r16;
        dx.i iVar12;
        ?? r25;
        i0 i0Var;
        int i77;
        b bVar9;
        zz3.b bVar10;
        wz3.b.Params params4;
        int i78;
        dx.i iVar13;
        dx.i iVar14;
        dx.i iVar15;
        int i79;
        int i85;
        int i86;
        int i87;
        ?? r26;
        int i88;
        wz3.b.Params params5;
        int i89;
        int i95;
        int i96;
        int i97;
        int i98;
        int i99;
        int i100;
        Object objC5;
        ?? r17;
        dx.j<dx.b> jVar3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i101 = aVar.H;
            if ((i101 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.H = i101 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj3 = aVar.F;
        ?? E = uq.b.e();
        try {
            try {
                try {
                    switch (aVar.H) {
                        case 0:
                            u.b(obj3);
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar2 = new ex.a();
                                wz3.e eVar2 = this.getChallengeUC;
                                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                params2 = params;
                                aVar.f22357d = params2;
                                aVar.f22358e = jVarA;
                                aVar.f22359f = vq.j.a(aVar2);
                                aVar.f22360g = aVar2;
                                aVar.f22369r = 0;
                                aVar.f22370s = 0;
                                aVar.f22371t = 0;
                                aVar.f22372v = 0;
                                aVar.f22373w = 0;
                                aVar.H = 1;
                                Object objC6 = eVar2.c(c1792a, aVar);
                                if (objC6 == E) {
                                    return E;
                                }
                                jVar = jVarA;
                                bVar = aVar2;
                                bVar2 = bVar;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                obj2 = objC6;
                                i19 = 0;
                                iVar = (dx.i) obj2;
                                if (!(iVar instanceof dx.i.Left)) {
                                    if (iVar instanceof dx.i.Right) {
                                        throw new p();
                                    }
                                    challenge = (Challenge) ((dx.i.Right) iVar).b();
                                    wz3.d dVar = this.getBase64SignedValueUseCase;
                                    wz3.d.Params params6 = new wz3.d.Params(challenge.getChallenge());
                                    aVar.f22357d = params2;
                                    aVar.f22358e = jVar;
                                    aVar.f22359f = vq.j.a(bVar2);
                                    aVar.f22360g = bVar;
                                    aVar.f22361h = vq.j.a(iVar);
                                    aVar.f22362j = vq.j.a(challenge);
                                    aVar.f22369r = i18;
                                    aVar.f22370s = i17;
                                    aVar.f22371t = i19;
                                    aVar.f22372v = i16;
                                    aVar.f22373w = i15;
                                    aVar.f22374x = 0;
                                    aVar.f22375y = 0;
                                    aVar.H = 2;
                                    objC = dVar.c(params6, aVar);
                                    if (objC == E) {
                                        return E;
                                    }
                                    int i102 = i18;
                                    i25 = i15;
                                    params3 = params2;
                                    i26 = i102;
                                    jVar2 = jVar;
                                    bVar3 = bVar2;
                                    challenge2 = challenge;
                                    iVar2 = iVar;
                                    i27 = i17;
                                    bVar4 = bVar;
                                    i28 = i19;
                                    i29 = i16;
                                    i35 = 0;
                                    i36 = 0;
                                    iVar3 = (dx.i) objC;
                                    iVar4 = iVar2;
                                    if (!(iVar3 instanceof dx.i.Left)) {
                                        if (!(iVar3 instanceof dx.i.Right)) {
                                            throw new p();
                                        }
                                        data = ((ry.a) ((dx.i.Right) iVar3).b()).getData();
                                        documentType = params3.getDocumentType();
                                        bVar5 = bVar3;
                                        if (documentType == rq0.b.d.ID_CARD) {
                                            uh0.h hVar = this.generateIdCardCertificateUseCase;
                                            bVar8 = bVar4;
                                            uh0.h.Params params7 = new uh0.h.Params(new GenerateCertificateSignedRequest(data));
                                            aVar.f22357d = params3;
                                            aVar.f22358e = jVar2;
                                            aVar.f22359f = vq.j.a(bVar5);
                                            aVar.f22360g = vq.j.a(bVar8);
                                            aVar.f22361h = vq.j.a(iVar4);
                                            aVar.f22362j = vq.j.a(challenge2);
                                            aVar.f22363k = vq.j.a(iVar3);
                                            aVar.f22364l = vq.j.a(data);
                                            aVar.f22369r = i26;
                                            aVar.f22370s = i27;
                                            aVar.f22371t = i28;
                                            aVar.f22372v = i29;
                                            aVar.f22373w = i25;
                                            aVar.f22374x = i36;
                                            aVar.f22375y = i35;
                                            aVar.f22376z = 0;
                                            aVar.A = 0;
                                            aVar.H = 3;
                                            objC3 = hVar.c(params7, aVar);
                                            if (objC3 == E) {
                                                return E;
                                            }
                                            iVar5 = iVar3;
                                            bVar7 = bVar8;
                                            i37 = i26;
                                            b0Var = data;
                                            challenge3 = challenge2;
                                            i38 = 0;
                                            i39 = i27;
                                            i45 = i28;
                                            i46 = i29;
                                            i47 = i35;
                                            obj3 = objC3;
                                            i48 = i25;
                                            i49 = i36;
                                            i55 = 0;
                                            iVar6 = iVar4;
                                            iVar7 = (dx.i) obj3;
                                            iVar8 = iVar6;
                                            i56 = i38;
                                            b0Var2 = b0Var;
                                            if (!(iVar7 instanceof dx.i.Left)) {
                                                if (iVar7 instanceof dx.i.Right) {
                                                    throw new p();
                                                }
                                                generateCertResponse = (GenerateCertResponse) ((dx.i.Right) iVar7).b();
                                                wz3.c cVar = this.decryptNewCertificateUseCase;
                                                wz3.c.Params params8 = new wz3.c.Params(generateCertResponse, params3.getDocumentType());
                                                aVar.f22357d = params3;
                                                aVar.f22358e = jVar2;
                                                aVar.f22359f = vq.j.a(bVar5);
                                                aVar.f22360g = vq.j.a(bVar7);
                                                aVar.f22361h = vq.j.a(iVar8);
                                                aVar.f22362j = vq.j.a(challenge3);
                                                aVar.f22363k = vq.j.a(iVar5);
                                                aVar.f22364l = vq.j.a(b0Var2);
                                                aVar.f22365m = vq.j.a(iVar7);
                                                aVar.f22366n = vq.j.a(generateCertResponse);
                                                aVar.f22369r = i37;
                                                aVar.f22370s = i39;
                                                aVar.f22371t = i45;
                                                aVar.f22372v = i46;
                                                aVar.f22373w = i48;
                                                aVar.f22374x = i49;
                                                aVar.f22375y = i47;
                                                aVar.f22376z = i55;
                                                aVar.A = i56;
                                                aVar.B = 0;
                                                aVar.C = 0;
                                                aVar.H = 5;
                                                objC4 = cVar.c(params8, aVar);
                                                if (objC4 == r15) {
                                                    r15 = E;
                                                    return r15;
                                                }
                                                r15 = E;
                                                Challenge challenge5 = challenge3;
                                                iVar9 = iVar8;
                                                iVar10 = iVar5;
                                                challenge4 = challenge5;
                                                iVar11 = iVar7;
                                                obj3 = objC4;
                                                i57 = i46;
                                                generateCertResponse2 = generateCertResponse;
                                                i58 = i47;
                                                i59 = i39;
                                                i65 = 0;
                                                i66 = i48;
                                                i67 = i55;
                                                i68 = i45;
                                                i69 = i49;
                                                i75 = i56;
                                                i76 = 0;
                                                r16 = r15;
                                                iVar12 = (dx.i) obj3;
                                                r25 = r16;
                                                if (!(iVar12 instanceof dx.i.Left)) {
                                                    if (!(iVar12 instanceof dx.i.Right)) {
                                                        throw new p();
                                                    }
                                                    i0Var = (i0) ((dx.i.Right) iVar12).b();
                                                    i77 = i76;
                                                    bVar9 = this;
                                                    bVar10 = bVar9.notificationsInteractor;
                                                    aVar.f22357d = params3;
                                                    aVar.f22358e = jVar2;
                                                    params4 = params3;
                                                    aVar.f22359f = vq.j.a(bVar5);
                                                    aVar.f22360g = vq.j.a(bVar7);
                                                    aVar.f22361h = vq.j.a(iVar9);
                                                    aVar.f22362j = vq.j.a(challenge4);
                                                    aVar.f22363k = vq.j.a(iVar10);
                                                    aVar.f22364l = vq.j.a(b0Var2);
                                                    aVar.f22365m = vq.j.a(iVar11);
                                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                                    aVar.f22367p = vq.j.a(iVar12);
                                                    aVar.f22368q = vq.j.a(i0Var);
                                                    aVar.f22369r = i37;
                                                    aVar.f22370s = i59;
                                                    aVar.f22371t = i68;
                                                    aVar.f22372v = i57;
                                                    aVar.f22373w = i66;
                                                    aVar.f22374x = i69;
                                                    aVar.f22375y = i58;
                                                    aVar.f22376z = i67;
                                                    aVar.A = i75;
                                                    aVar.B = i65;
                                                    aVar.C = i77;
                                                    i78 = i57;
                                                    aVar.D = 0;
                                                    aVar.E = 0;
                                                    aVar.H = 6;
                                                    if (bVar10.a(aVar) == r25) {
                                                        return r25;
                                                    }
                                                    dx.i iVar16 = iVar11;
                                                    iVar13 = iVar10;
                                                    iVar14 = iVar12;
                                                    iVar15 = iVar16;
                                                    int i103 = i67;
                                                    i79 = i65;
                                                    i85 = i59;
                                                    i86 = i69;
                                                    i87 = i103;
                                                    r26 = r25;
                                                    i88 = i66;
                                                    params5 = params4;
                                                    i89 = 0;
                                                    i95 = i68;
                                                    i96 = i58;
                                                    i97 = i75;
                                                    i98 = i77;
                                                    i99 = i78;
                                                    i100 = 0;
                                                    bVar9.autoCertificateRenewalCache.v();
                                                    bVar9.networkSessionManager.R();
                                                    ax0.a aVar3 = bVar9.afterUserActivationProcessUseCase;
                                                    ax0.a.Params params9 = new ax0.a.Params(params5.getDocumentType());
                                                    aVar.f22357d = vq.j.a(params5);
                                                    aVar.f22358e = jVar2;
                                                    aVar.f22359f = vq.j.a(bVar5);
                                                    aVar.f22360g = vq.j.a(bVar7);
                                                    aVar.f22361h = vq.j.a(iVar9);
                                                    aVar.f22362j = vq.j.a(challenge4);
                                                    aVar.f22363k = vq.j.a(iVar13);
                                                    aVar.f22364l = vq.j.a(b0Var2);
                                                    aVar.f22365m = vq.j.a(iVar15);
                                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                                    aVar.f22367p = vq.j.a(iVar14);
                                                    aVar.f22368q = vq.j.a(i0Var);
                                                    aVar.f22369r = i37;
                                                    aVar.f22370s = i85;
                                                    aVar.f22371t = i95;
                                                    aVar.f22372v = i99;
                                                    aVar.f22373w = i88;
                                                    aVar.f22374x = i86;
                                                    aVar.f22375y = i96;
                                                    aVar.f22376z = i87;
                                                    aVar.A = i97;
                                                    aVar.B = i79;
                                                    aVar.C = i98;
                                                    aVar.D = i89;
                                                    aVar.E = i100;
                                                    aVar.H = 7;
                                                    objC5 = aVar3.c(params9, aVar);
                                                    r17 = r26;
                                                    if (objC5 == r17) {
                                                        return r17;
                                                    }
                                                    jVar3 = jVar2;
                                                    new dx.i.Right(i0.f148189a);
                                                    jVar2 = jVar3;
                                                }
                                            }
                                        } else {
                                            bVar6 = bVar4;
                                            if (documentType != rq0.b.d.DIIA_REFUGEE_CARD) {
                                                bVar6.b(new dx.b.Generic(new UnsupportedOperationException("Unsupported document type for certificate generation")));
                                                throw new oq.g();
                                            }
                                            uh0.i iVar17 = this.generateRefugeeCertificateUseCase;
                                            uh0.i.Params params10 = new uh0.i.Params(new GenerateCertificateSignedRequest(data));
                                            aVar.f22357d = params3;
                                            aVar.f22358e = jVar2;
                                            aVar.f22359f = vq.j.a(bVar5);
                                            aVar.f22360g = vq.j.a(bVar6);
                                            aVar.f22361h = vq.j.a(iVar4);
                                            aVar.f22362j = vq.j.a(challenge2);
                                            aVar.f22363k = vq.j.a(iVar3);
                                            aVar.f22364l = vq.j.a(data);
                                            aVar.f22369r = i26;
                                            aVar.f22370s = i27;
                                            aVar.f22371t = i28;
                                            aVar.f22372v = i29;
                                            aVar.f22373w = i25;
                                            aVar.f22374x = i36;
                                            aVar.f22375y = i35;
                                            aVar.f22376z = 0;
                                            aVar.A = 0;
                                            aVar.H = 4;
                                            objC2 = iVar17.c(params10, aVar);
                                            if (objC2 == E) {
                                                return E;
                                            }
                                            iVar5 = iVar3;
                                            bVar7 = bVar6;
                                            i37 = i26;
                                            b0Var = data;
                                            challenge3 = challenge2;
                                            i38 = 0;
                                            i39 = i27;
                                            i45 = i28;
                                            i46 = i29;
                                            i47 = i35;
                                            obj3 = objC2;
                                            i48 = i25;
                                            i49 = i36;
                                            i55 = 0;
                                            iVar6 = iVar4;
                                            iVar7 = (dx.i) obj3;
                                            iVar8 = iVar6;
                                            i56 = i38;
                                            b0Var2 = b0Var;
                                            if (!(iVar7 instanceof dx.i.Left)) {
                                                if (iVar7 instanceof dx.i.Right) {
                                                    throw new p();
                                                }
                                                generateCertResponse = (GenerateCertResponse) ((dx.i.Right) iVar7).b();
                                                wz3.c cVar2 = this.decryptNewCertificateUseCase;
                                                wz3.c.Params params11 = new wz3.c.Params(generateCertResponse, params3.getDocumentType());
                                                aVar.f22357d = params3;
                                                aVar.f22358e = jVar2;
                                                aVar.f22359f = vq.j.a(bVar5);
                                                aVar.f22360g = vq.j.a(bVar7);
                                                aVar.f22361h = vq.j.a(iVar8);
                                                aVar.f22362j = vq.j.a(challenge3);
                                                aVar.f22363k = vq.j.a(iVar5);
                                                aVar.f22364l = vq.j.a(b0Var2);
                                                aVar.f22365m = vq.j.a(iVar7);
                                                aVar.f22366n = vq.j.a(generateCertResponse);
                                                aVar.f22369r = i37;
                                                aVar.f22370s = i39;
                                                aVar.f22371t = i45;
                                                aVar.f22372v = i46;
                                                aVar.f22373w = i48;
                                                aVar.f22374x = i49;
                                                aVar.f22375y = i47;
                                                aVar.f22376z = i55;
                                                aVar.A = i56;
                                                aVar.B = 0;
                                                aVar.C = 0;
                                                aVar.H = 5;
                                                objC4 = cVar2.c(params11, aVar);
                                                if (objC4 == r15) {
                                                    r15 = E;
                                                    return r15;
                                                }
                                                r15 = E;
                                                Challenge challenge6 = challenge3;
                                                iVar9 = iVar8;
                                                iVar10 = iVar5;
                                                challenge4 = challenge6;
                                                iVar11 = iVar7;
                                                obj3 = objC4;
                                                i57 = i46;
                                                generateCertResponse2 = generateCertResponse;
                                                i58 = i47;
                                                i59 = i39;
                                                i65 = 0;
                                                i66 = i48;
                                                i67 = i55;
                                                i68 = i45;
                                                i69 = i49;
                                                i75 = i56;
                                                i76 = 0;
                                                r16 = r15;
                                                iVar12 = (dx.i) obj3;
                                                r25 = r16;
                                                if (!(iVar12 instanceof dx.i.Left)) {
                                                    if (!(iVar12 instanceof dx.i.Right)) {
                                                        throw new p();
                                                    }
                                                    i0Var = (i0) ((dx.i.Right) iVar12).b();
                                                    i77 = i76;
                                                    bVar9 = this;
                                                    bVar10 = bVar9.notificationsInteractor;
                                                    aVar.f22357d = params3;
                                                    aVar.f22358e = jVar2;
                                                    params4 = params3;
                                                    aVar.f22359f = vq.j.a(bVar5);
                                                    aVar.f22360g = vq.j.a(bVar7);
                                                    aVar.f22361h = vq.j.a(iVar9);
                                                    aVar.f22362j = vq.j.a(challenge4);
                                                    aVar.f22363k = vq.j.a(iVar10);
                                                    aVar.f22364l = vq.j.a(b0Var2);
                                                    aVar.f22365m = vq.j.a(iVar11);
                                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                                    aVar.f22367p = vq.j.a(iVar12);
                                                    aVar.f22368q = vq.j.a(i0Var);
                                                    aVar.f22369r = i37;
                                                    aVar.f22370s = i59;
                                                    aVar.f22371t = i68;
                                                    aVar.f22372v = i57;
                                                    aVar.f22373w = i66;
                                                    aVar.f22374x = i69;
                                                    aVar.f22375y = i58;
                                                    aVar.f22376z = i67;
                                                    aVar.A = i75;
                                                    aVar.B = i65;
                                                    aVar.C = i77;
                                                    i78 = i57;
                                                    aVar.D = 0;
                                                    aVar.E = 0;
                                                    aVar.H = 6;
                                                    if (bVar10.a(aVar) == r25) {
                                                        return r25;
                                                    }
                                                    dx.i iVar18 = iVar11;
                                                    iVar13 = iVar10;
                                                    iVar14 = iVar12;
                                                    iVar15 = iVar18;
                                                    int i104 = i67;
                                                    i79 = i65;
                                                    i85 = i59;
                                                    i86 = i69;
                                                    i87 = i104;
                                                    r26 = r25;
                                                    i88 = i66;
                                                    params5 = params4;
                                                    i89 = 0;
                                                    i95 = i68;
                                                    i96 = i58;
                                                    i97 = i75;
                                                    i98 = i77;
                                                    i99 = i78;
                                                    i100 = 0;
                                                    bVar9.autoCertificateRenewalCache.v();
                                                    bVar9.networkSessionManager.R();
                                                    ax0.a aVar4 = bVar9.afterUserActivationProcessUseCase;
                                                    ax0.a.Params params12 = new ax0.a.Params(params5.getDocumentType());
                                                    aVar.f22357d = vq.j.a(params5);
                                                    aVar.f22358e = jVar2;
                                                    aVar.f22359f = vq.j.a(bVar5);
                                                    aVar.f22360g = vq.j.a(bVar7);
                                                    aVar.f22361h = vq.j.a(iVar9);
                                                    aVar.f22362j = vq.j.a(challenge4);
                                                    aVar.f22363k = vq.j.a(iVar13);
                                                    aVar.f22364l = vq.j.a(b0Var2);
                                                    aVar.f22365m = vq.j.a(iVar15);
                                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                                    aVar.f22367p = vq.j.a(iVar14);
                                                    aVar.f22368q = vq.j.a(i0Var);
                                                    aVar.f22369r = i37;
                                                    aVar.f22370s = i85;
                                                    aVar.f22371t = i95;
                                                    aVar.f22372v = i99;
                                                    aVar.f22373w = i88;
                                                    aVar.f22374x = i86;
                                                    aVar.f22375y = i96;
                                                    aVar.f22376z = i87;
                                                    aVar.A = i97;
                                                    aVar.B = i79;
                                                    aVar.C = i98;
                                                    aVar.D = i89;
                                                    aVar.E = i100;
                                                    aVar.H = 7;
                                                    objC5 = aVar4.c(params12, aVar);
                                                    r17 = r26;
                                                    if (objC5 == r17) {
                                                        return r17;
                                                    }
                                                    jVar3 = jVar2;
                                                    new dx.i.Right(i0.f148189a);
                                                    jVar2 = jVar3;
                                                }
                                            }
                                        }
                                    }
                                }
                                return new dx.i.Right(i0.f148189a);
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                E = jVarA;
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
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        case 1:
                            i15 = aVar.f22373w;
                            i16 = aVar.f22372v;
                            int i105 = aVar.f22371t;
                            i17 = aVar.f22370s;
                            i18 = aVar.f22369r;
                            ex.b bVar11 = (ex.b) aVar.f22360g;
                            ex.b bVar12 = (ex.b) aVar.f22359f;
                            jVar = (dx.j) aVar.f22358e;
                            wz3.b.Params params13 = (wz3.b.Params) aVar.f22357d;
                            try {
                                u.b(obj3);
                                obj2 = obj3;
                                i19 = i105;
                                params2 = params13;
                                bVar2 = bVar12;
                                bVar = bVar11;
                                iVar = (dx.i) obj2;
                                if (!(iVar instanceof dx.i.Left)) {
                                    if (iVar instanceof dx.i.Right) {
                                        throw new p();
                                    }
                                    challenge = (Challenge) ((dx.i.Right) iVar).b();
                                    wz3.d dVar2 = this.getBase64SignedValueUseCase;
                                    wz3.d.Params params14 = new wz3.d.Params(challenge.getChallenge());
                                    aVar.f22357d = params2;
                                    aVar.f22358e = jVar;
                                    aVar.f22359f = vq.j.a(bVar2);
                                    aVar.f22360g = bVar;
                                    aVar.f22361h = vq.j.a(iVar);
                                    aVar.f22362j = vq.j.a(challenge);
                                    aVar.f22369r = i18;
                                    aVar.f22370s = i17;
                                    aVar.f22371t = i19;
                                    aVar.f22372v = i16;
                                    aVar.f22373w = i15;
                                    aVar.f22374x = 0;
                                    aVar.f22375y = 0;
                                    aVar.H = 2;
                                    objC = dVar2.c(params14, aVar);
                                    if (objC == E) {
                                        return E;
                                    }
                                    int i106 = i18;
                                    i25 = i15;
                                    params3 = params2;
                                    i26 = i106;
                                    jVar2 = jVar;
                                    bVar3 = bVar2;
                                    challenge2 = challenge;
                                    iVar2 = iVar;
                                    i27 = i17;
                                    bVar4 = bVar;
                                    i28 = i19;
                                    i29 = i16;
                                    i35 = 0;
                                    i36 = 0;
                                    iVar3 = (dx.i) objC;
                                    iVar4 = iVar2;
                                    if (!(iVar3 instanceof dx.i.Left)) {
                                        if (!(iVar3 instanceof dx.i.Right)) {
                                            throw new p();
                                        }
                                        data = ((ry.a) ((dx.i.Right) iVar3).b()).getData();
                                        documentType = params3.getDocumentType();
                                        bVar5 = bVar3;
                                        if (documentType == rq0.b.d.ID_CARD) {
                                            uh0.h hVar2 = this.generateIdCardCertificateUseCase;
                                            bVar8 = bVar4;
                                            uh0.h.Params params15 = new uh0.h.Params(new GenerateCertificateSignedRequest(data));
                                            aVar.f22357d = params3;
                                            aVar.f22358e = jVar2;
                                            aVar.f22359f = vq.j.a(bVar5);
                                            aVar.f22360g = vq.j.a(bVar8);
                                            aVar.f22361h = vq.j.a(iVar4);
                                            aVar.f22362j = vq.j.a(challenge2);
                                            aVar.f22363k = vq.j.a(iVar3);
                                            aVar.f22364l = vq.j.a(data);
                                            aVar.f22369r = i26;
                                            aVar.f22370s = i27;
                                            aVar.f22371t = i28;
                                            aVar.f22372v = i29;
                                            aVar.f22373w = i25;
                                            aVar.f22374x = i36;
                                            aVar.f22375y = i35;
                                            aVar.f22376z = 0;
                                            aVar.A = 0;
                                            aVar.H = 3;
                                            objC3 = hVar2.c(params15, aVar);
                                            if (objC3 == E) {
                                                return E;
                                            }
                                            iVar5 = iVar3;
                                            bVar7 = bVar8;
                                            i37 = i26;
                                            b0Var = data;
                                            challenge3 = challenge2;
                                            i38 = 0;
                                            i39 = i27;
                                            i45 = i28;
                                            i46 = i29;
                                            i47 = i35;
                                            obj3 = objC3;
                                            i48 = i25;
                                            i49 = i36;
                                            i55 = 0;
                                            iVar6 = iVar4;
                                            iVar7 = (dx.i) obj3;
                                            iVar8 = iVar6;
                                            i56 = i38;
                                            b0Var2 = b0Var;
                                            if (!(iVar7 instanceof dx.i.Left)) {
                                                if (iVar7 instanceof dx.i.Right) {
                                                    throw new p();
                                                }
                                                generateCertResponse = (GenerateCertResponse) ((dx.i.Right) iVar7).b();
                                                wz3.c cVar3 = this.decryptNewCertificateUseCase;
                                                wz3.c.Params params16 = new wz3.c.Params(generateCertResponse, params3.getDocumentType());
                                                aVar.f22357d = params3;
                                                aVar.f22358e = jVar2;
                                                aVar.f22359f = vq.j.a(bVar5);
                                                aVar.f22360g = vq.j.a(bVar7);
                                                aVar.f22361h = vq.j.a(iVar8);
                                                aVar.f22362j = vq.j.a(challenge3);
                                                aVar.f22363k = vq.j.a(iVar5);
                                                aVar.f22364l = vq.j.a(b0Var2);
                                                aVar.f22365m = vq.j.a(iVar7);
                                                aVar.f22366n = vq.j.a(generateCertResponse);
                                                aVar.f22369r = i37;
                                                aVar.f22370s = i39;
                                                aVar.f22371t = i45;
                                                aVar.f22372v = i46;
                                                aVar.f22373w = i48;
                                                aVar.f22374x = i49;
                                                aVar.f22375y = i47;
                                                aVar.f22376z = i55;
                                                aVar.A = i56;
                                                aVar.B = 0;
                                                aVar.C = 0;
                                                aVar.H = 5;
                                                objC4 = cVar3.c(params16, aVar);
                                                if (objC4 == r15) {
                                                    r15 = E;
                                                    return r15;
                                                }
                                                r15 = E;
                                                Challenge challenge7 = challenge3;
                                                iVar9 = iVar8;
                                                iVar10 = iVar5;
                                                challenge4 = challenge7;
                                                iVar11 = iVar7;
                                                obj3 = objC4;
                                                i57 = i46;
                                                generateCertResponse2 = generateCertResponse;
                                                i58 = i47;
                                                i59 = i39;
                                                i65 = 0;
                                                i66 = i48;
                                                i67 = i55;
                                                i68 = i45;
                                                i69 = i49;
                                                i75 = i56;
                                                i76 = 0;
                                                r16 = r15;
                                                iVar12 = (dx.i) obj3;
                                                r25 = r16;
                                                if (!(iVar12 instanceof dx.i.Left)) {
                                                    if (!(iVar12 instanceof dx.i.Right)) {
                                                        throw new p();
                                                    }
                                                    i0Var = (i0) ((dx.i.Right) iVar12).b();
                                                    i77 = i76;
                                                    bVar9 = this;
                                                    bVar10 = bVar9.notificationsInteractor;
                                                    aVar.f22357d = params3;
                                                    aVar.f22358e = jVar2;
                                                    params4 = params3;
                                                    aVar.f22359f = vq.j.a(bVar5);
                                                    aVar.f22360g = vq.j.a(bVar7);
                                                    aVar.f22361h = vq.j.a(iVar9);
                                                    aVar.f22362j = vq.j.a(challenge4);
                                                    aVar.f22363k = vq.j.a(iVar10);
                                                    aVar.f22364l = vq.j.a(b0Var2);
                                                    aVar.f22365m = vq.j.a(iVar11);
                                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                                    aVar.f22367p = vq.j.a(iVar12);
                                                    aVar.f22368q = vq.j.a(i0Var);
                                                    aVar.f22369r = i37;
                                                    aVar.f22370s = i59;
                                                    aVar.f22371t = i68;
                                                    aVar.f22372v = i57;
                                                    aVar.f22373w = i66;
                                                    aVar.f22374x = i69;
                                                    aVar.f22375y = i58;
                                                    aVar.f22376z = i67;
                                                    aVar.A = i75;
                                                    aVar.B = i65;
                                                    aVar.C = i77;
                                                    i78 = i57;
                                                    aVar.D = 0;
                                                    aVar.E = 0;
                                                    aVar.H = 6;
                                                    if (bVar10.a(aVar) == r25) {
                                                        return r25;
                                                    }
                                                    dx.i iVar19 = iVar11;
                                                    iVar13 = iVar10;
                                                    iVar14 = iVar12;
                                                    iVar15 = iVar19;
                                                    int i107 = i67;
                                                    i79 = i65;
                                                    i85 = i59;
                                                    i86 = i69;
                                                    i87 = i107;
                                                    r26 = r25;
                                                    i88 = i66;
                                                    params5 = params4;
                                                    i89 = 0;
                                                    i95 = i68;
                                                    i96 = i58;
                                                    i97 = i75;
                                                    i98 = i77;
                                                    i99 = i78;
                                                    i100 = 0;
                                                    bVar9.autoCertificateRenewalCache.v();
                                                    bVar9.networkSessionManager.R();
                                                    ax0.a aVar5 = bVar9.afterUserActivationProcessUseCase;
                                                    ax0.a.Params params17 = new ax0.a.Params(params5.getDocumentType());
                                                    aVar.f22357d = vq.j.a(params5);
                                                    aVar.f22358e = jVar2;
                                                    aVar.f22359f = vq.j.a(bVar5);
                                                    aVar.f22360g = vq.j.a(bVar7);
                                                    aVar.f22361h = vq.j.a(iVar9);
                                                    aVar.f22362j = vq.j.a(challenge4);
                                                    aVar.f22363k = vq.j.a(iVar13);
                                                    aVar.f22364l = vq.j.a(b0Var2);
                                                    aVar.f22365m = vq.j.a(iVar15);
                                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                                    aVar.f22367p = vq.j.a(iVar14);
                                                    aVar.f22368q = vq.j.a(i0Var);
                                                    aVar.f22369r = i37;
                                                    aVar.f22370s = i85;
                                                    aVar.f22371t = i95;
                                                    aVar.f22372v = i99;
                                                    aVar.f22373w = i88;
                                                    aVar.f22374x = i86;
                                                    aVar.f22375y = i96;
                                                    aVar.f22376z = i87;
                                                    aVar.A = i97;
                                                    aVar.B = i79;
                                                    aVar.C = i98;
                                                    aVar.D = i89;
                                                    aVar.E = i100;
                                                    aVar.H = 7;
                                                    objC5 = aVar5.c(params17, aVar);
                                                    r17 = r26;
                                                    if (objC5 == r17) {
                                                        return r17;
                                                    }
                                                    jVar3 = jVar2;
                                                    new dx.i.Right(i0.f148189a);
                                                    jVar2 = jVar3;
                                                }
                                            }
                                        } else {
                                            bVar6 = bVar4;
                                            if (documentType != rq0.b.d.DIIA_REFUGEE_CARD) {
                                                bVar6.b(new dx.b.Generic(new UnsupportedOperationException("Unsupported document type for certificate generation")));
                                                throw new oq.g();
                                            }
                                            uh0.i iVar110 = this.generateRefugeeCertificateUseCase;
                                            uh0.i.Params params18 = new uh0.i.Params(new GenerateCertificateSignedRequest(data));
                                            aVar.f22357d = params3;
                                            aVar.f22358e = jVar2;
                                            aVar.f22359f = vq.j.a(bVar5);
                                            aVar.f22360g = vq.j.a(bVar6);
                                            aVar.f22361h = vq.j.a(iVar4);
                                            aVar.f22362j = vq.j.a(challenge2);
                                            aVar.f22363k = vq.j.a(iVar3);
                                            aVar.f22364l = vq.j.a(data);
                                            aVar.f22369r = i26;
                                            aVar.f22370s = i27;
                                            aVar.f22371t = i28;
                                            aVar.f22372v = i29;
                                            aVar.f22373w = i25;
                                            aVar.f22374x = i36;
                                            aVar.f22375y = i35;
                                            aVar.f22376z = 0;
                                            aVar.A = 0;
                                            aVar.H = 4;
                                            objC2 = iVar110.c(params18, aVar);
                                            if (objC2 == E) {
                                                return E;
                                            }
                                            iVar5 = iVar3;
                                            bVar7 = bVar6;
                                            i37 = i26;
                                            b0Var = data;
                                            challenge3 = challenge2;
                                            i38 = 0;
                                            i39 = i27;
                                            i45 = i28;
                                            i46 = i29;
                                            i47 = i35;
                                            obj3 = objC2;
                                            i48 = i25;
                                            i49 = i36;
                                            i55 = 0;
                                            iVar6 = iVar4;
                                            iVar7 = (dx.i) obj3;
                                            iVar8 = iVar6;
                                            i56 = i38;
                                            b0Var2 = b0Var;
                                            if (!(iVar7 instanceof dx.i.Left)) {
                                                if (iVar7 instanceof dx.i.Right) {
                                                    throw new p();
                                                }
                                                generateCertResponse = (GenerateCertResponse) ((dx.i.Right) iVar7).b();
                                                wz3.c cVar4 = this.decryptNewCertificateUseCase;
                                                wz3.c.Params params19 = new wz3.c.Params(generateCertResponse, params3.getDocumentType());
                                                aVar.f22357d = params3;
                                                aVar.f22358e = jVar2;
                                                aVar.f22359f = vq.j.a(bVar5);
                                                aVar.f22360g = vq.j.a(bVar7);
                                                aVar.f22361h = vq.j.a(iVar8);
                                                aVar.f22362j = vq.j.a(challenge3);
                                                aVar.f22363k = vq.j.a(iVar5);
                                                aVar.f22364l = vq.j.a(b0Var2);
                                                aVar.f22365m = vq.j.a(iVar7);
                                                aVar.f22366n = vq.j.a(generateCertResponse);
                                                aVar.f22369r = i37;
                                                aVar.f22370s = i39;
                                                aVar.f22371t = i45;
                                                aVar.f22372v = i46;
                                                aVar.f22373w = i48;
                                                aVar.f22374x = i49;
                                                aVar.f22375y = i47;
                                                aVar.f22376z = i55;
                                                aVar.A = i56;
                                                aVar.B = 0;
                                                aVar.C = 0;
                                                aVar.H = 5;
                                                objC4 = cVar4.c(params19, aVar);
                                                if (objC4 == r15) {
                                                    r15 = E;
                                                    return r15;
                                                }
                                                r15 = E;
                                                Challenge challenge8 = challenge3;
                                                iVar9 = iVar8;
                                                iVar10 = iVar5;
                                                challenge4 = challenge8;
                                                iVar11 = iVar7;
                                                obj3 = objC4;
                                                i57 = i46;
                                                generateCertResponse2 = generateCertResponse;
                                                i58 = i47;
                                                i59 = i39;
                                                i65 = 0;
                                                i66 = i48;
                                                i67 = i55;
                                                i68 = i45;
                                                i69 = i49;
                                                i75 = i56;
                                                i76 = 0;
                                                r16 = r15;
                                                iVar12 = (dx.i) obj3;
                                                r25 = r16;
                                                if (!(iVar12 instanceof dx.i.Left)) {
                                                    if (!(iVar12 instanceof dx.i.Right)) {
                                                        throw new p();
                                                    }
                                                    i0Var = (i0) ((dx.i.Right) iVar12).b();
                                                    i77 = i76;
                                                    bVar9 = this;
                                                    bVar10 = bVar9.notificationsInteractor;
                                                    aVar.f22357d = params3;
                                                    aVar.f22358e = jVar2;
                                                    params4 = params3;
                                                    aVar.f22359f = vq.j.a(bVar5);
                                                    aVar.f22360g = vq.j.a(bVar7);
                                                    aVar.f22361h = vq.j.a(iVar9);
                                                    aVar.f22362j = vq.j.a(challenge4);
                                                    aVar.f22363k = vq.j.a(iVar10);
                                                    aVar.f22364l = vq.j.a(b0Var2);
                                                    aVar.f22365m = vq.j.a(iVar11);
                                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                                    aVar.f22367p = vq.j.a(iVar12);
                                                    aVar.f22368q = vq.j.a(i0Var);
                                                    aVar.f22369r = i37;
                                                    aVar.f22370s = i59;
                                                    aVar.f22371t = i68;
                                                    aVar.f22372v = i57;
                                                    aVar.f22373w = i66;
                                                    aVar.f22374x = i69;
                                                    aVar.f22375y = i58;
                                                    aVar.f22376z = i67;
                                                    aVar.A = i75;
                                                    aVar.B = i65;
                                                    aVar.C = i77;
                                                    i78 = i57;
                                                    aVar.D = 0;
                                                    aVar.E = 0;
                                                    aVar.H = 6;
                                                    if (bVar10.a(aVar) == r25) {
                                                        return r25;
                                                    }
                                                    dx.i iVar111 = iVar11;
                                                    iVar13 = iVar10;
                                                    iVar14 = iVar12;
                                                    iVar15 = iVar111;
                                                    int i108 = i67;
                                                    i79 = i65;
                                                    i85 = i59;
                                                    i86 = i69;
                                                    i87 = i108;
                                                    r26 = r25;
                                                    i88 = i66;
                                                    params5 = params4;
                                                    i89 = 0;
                                                    i95 = i68;
                                                    i96 = i58;
                                                    i97 = i75;
                                                    i98 = i77;
                                                    i99 = i78;
                                                    i100 = 0;
                                                    bVar9.autoCertificateRenewalCache.v();
                                                    bVar9.networkSessionManager.R();
                                                    ax0.a aVar6 = bVar9.afterUserActivationProcessUseCase;
                                                    ax0.a.Params params110 = new ax0.a.Params(params5.getDocumentType());
                                                    aVar.f22357d = vq.j.a(params5);
                                                    aVar.f22358e = jVar2;
                                                    aVar.f22359f = vq.j.a(bVar5);
                                                    aVar.f22360g = vq.j.a(bVar7);
                                                    aVar.f22361h = vq.j.a(iVar9);
                                                    aVar.f22362j = vq.j.a(challenge4);
                                                    aVar.f22363k = vq.j.a(iVar13);
                                                    aVar.f22364l = vq.j.a(b0Var2);
                                                    aVar.f22365m = vq.j.a(iVar15);
                                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                                    aVar.f22367p = vq.j.a(iVar14);
                                                    aVar.f22368q = vq.j.a(i0Var);
                                                    aVar.f22369r = i37;
                                                    aVar.f22370s = i85;
                                                    aVar.f22371t = i95;
                                                    aVar.f22372v = i99;
                                                    aVar.f22373w = i88;
                                                    aVar.f22374x = i86;
                                                    aVar.f22375y = i96;
                                                    aVar.f22376z = i87;
                                                    aVar.A = i97;
                                                    aVar.B = i79;
                                                    aVar.C = i98;
                                                    aVar.D = i89;
                                                    aVar.E = i100;
                                                    aVar.H = 7;
                                                    objC5 = aVar6.c(params110, aVar);
                                                    r17 = r26;
                                                    if (objC5 == r17) {
                                                        return r17;
                                                    }
                                                    jVar3 = jVar2;
                                                    new dx.i.Right(i0.f148189a);
                                                    jVar2 = jVar3;
                                                }
                                            }
                                        }
                                    }
                                }
                                return new dx.i.Right(i0.f148189a);
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
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
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        case 2:
                            int i109 = aVar.f22375y;
                            i36 = aVar.f22374x;
                            int i110 = aVar.f22373w;
                            i29 = aVar.f22372v;
                            int i111 = aVar.f22371t;
                            int i112 = aVar.f22370s;
                            int i113 = aVar.f22369r;
                            Challenge challenge9 = (Challenge) aVar.f22362j;
                            iVar2 = (dx.i) aVar.f22361h;
                            bVar4 = (ex.b) aVar.f22360g;
                            bVar3 = (ex.b) aVar.f22359f;
                            jVar2 = (dx.j) aVar.f22358e;
                            params3 = (wz3.b.Params) aVar.f22357d;
                            try {
                                u.b(obj3);
                                objC = obj3;
                                i35 = i109;
                                challenge2 = challenge9;
                                i27 = i112;
                                i25 = i110;
                                i26 = i113;
                                i28 = i111;
                                iVar3 = (dx.i) objC;
                                iVar4 = iVar2;
                                if (!(iVar3 instanceof dx.i.Left)) {
                                    if (!(iVar3 instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    data = ((ry.a) ((dx.i.Right) iVar3).b()).getData();
                                    documentType = params3.getDocumentType();
                                    bVar5 = bVar3;
                                    if (documentType == rq0.b.d.ID_CARD) {
                                        uh0.h hVar3 = this.generateIdCardCertificateUseCase;
                                        bVar8 = bVar4;
                                        uh0.h.Params params111 = new uh0.h.Params(new GenerateCertificateSignedRequest(data));
                                        aVar.f22357d = params3;
                                        aVar.f22358e = jVar2;
                                        aVar.f22359f = vq.j.a(bVar5);
                                        aVar.f22360g = vq.j.a(bVar8);
                                        aVar.f22361h = vq.j.a(iVar4);
                                        aVar.f22362j = vq.j.a(challenge2);
                                        aVar.f22363k = vq.j.a(iVar3);
                                        aVar.f22364l = vq.j.a(data);
                                        aVar.f22369r = i26;
                                        aVar.f22370s = i27;
                                        aVar.f22371t = i28;
                                        aVar.f22372v = i29;
                                        aVar.f22373w = i25;
                                        aVar.f22374x = i36;
                                        aVar.f22375y = i35;
                                        aVar.f22376z = 0;
                                        aVar.A = 0;
                                        aVar.H = 3;
                                        objC3 = hVar3.c(params111, aVar);
                                        if (objC3 == E) {
                                            return E;
                                        }
                                        iVar5 = iVar3;
                                        bVar7 = bVar8;
                                        i37 = i26;
                                        b0Var = data;
                                        challenge3 = challenge2;
                                        i38 = 0;
                                        i39 = i27;
                                        i45 = i28;
                                        i46 = i29;
                                        i47 = i35;
                                        obj3 = objC3;
                                        i48 = i25;
                                        i49 = i36;
                                        i55 = 0;
                                        iVar6 = iVar4;
                                        iVar7 = (dx.i) obj3;
                                        iVar8 = iVar6;
                                        i56 = i38;
                                        b0Var2 = b0Var;
                                        if (!(iVar7 instanceof dx.i.Left)) {
                                            if (iVar7 instanceof dx.i.Right) {
                                                throw new p();
                                            }
                                            generateCertResponse = (GenerateCertResponse) ((dx.i.Right) iVar7).b();
                                            wz3.c cVar5 = this.decryptNewCertificateUseCase;
                                            wz3.c.Params params112 = new wz3.c.Params(generateCertResponse, params3.getDocumentType());
                                            aVar.f22357d = params3;
                                            aVar.f22358e = jVar2;
                                            aVar.f22359f = vq.j.a(bVar5);
                                            aVar.f22360g = vq.j.a(bVar7);
                                            aVar.f22361h = vq.j.a(iVar8);
                                            aVar.f22362j = vq.j.a(challenge3);
                                            aVar.f22363k = vq.j.a(iVar5);
                                            aVar.f22364l = vq.j.a(b0Var2);
                                            aVar.f22365m = vq.j.a(iVar7);
                                            aVar.f22366n = vq.j.a(generateCertResponse);
                                            aVar.f22369r = i37;
                                            aVar.f22370s = i39;
                                            aVar.f22371t = i45;
                                            aVar.f22372v = i46;
                                            aVar.f22373w = i48;
                                            aVar.f22374x = i49;
                                            aVar.f22375y = i47;
                                            aVar.f22376z = i55;
                                            aVar.A = i56;
                                            aVar.B = 0;
                                            aVar.C = 0;
                                            aVar.H = 5;
                                            objC4 = cVar5.c(params112, aVar);
                                            if (objC4 == r15) {
                                                r15 = E;
                                                return r15;
                                            }
                                            r15 = E;
                                            Challenge challenge10 = challenge3;
                                            iVar9 = iVar8;
                                            iVar10 = iVar5;
                                            challenge4 = challenge10;
                                            iVar11 = iVar7;
                                            obj3 = objC4;
                                            i57 = i46;
                                            generateCertResponse2 = generateCertResponse;
                                            i58 = i47;
                                            i59 = i39;
                                            i65 = 0;
                                            i66 = i48;
                                            i67 = i55;
                                            i68 = i45;
                                            i69 = i49;
                                            i75 = i56;
                                            i76 = 0;
                                            r16 = r15;
                                            iVar12 = (dx.i) obj3;
                                            r25 = r16;
                                            if (!(iVar12 instanceof dx.i.Left)) {
                                                if (!(iVar12 instanceof dx.i.Right)) {
                                                    throw new p();
                                                }
                                                i0Var = (i0) ((dx.i.Right) iVar12).b();
                                                i77 = i76;
                                                bVar9 = this;
                                                bVar10 = bVar9.notificationsInteractor;
                                                aVar.f22357d = params3;
                                                aVar.f22358e = jVar2;
                                                params4 = params3;
                                                aVar.f22359f = vq.j.a(bVar5);
                                                aVar.f22360g = vq.j.a(bVar7);
                                                aVar.f22361h = vq.j.a(iVar9);
                                                aVar.f22362j = vq.j.a(challenge4);
                                                aVar.f22363k = vq.j.a(iVar10);
                                                aVar.f22364l = vq.j.a(b0Var2);
                                                aVar.f22365m = vq.j.a(iVar11);
                                                aVar.f22366n = vq.j.a(generateCertResponse2);
                                                aVar.f22367p = vq.j.a(iVar12);
                                                aVar.f22368q = vq.j.a(i0Var);
                                                aVar.f22369r = i37;
                                                aVar.f22370s = i59;
                                                aVar.f22371t = i68;
                                                aVar.f22372v = i57;
                                                aVar.f22373w = i66;
                                                aVar.f22374x = i69;
                                                aVar.f22375y = i58;
                                                aVar.f22376z = i67;
                                                aVar.A = i75;
                                                aVar.B = i65;
                                                aVar.C = i77;
                                                i78 = i57;
                                                aVar.D = 0;
                                                aVar.E = 0;
                                                aVar.H = 6;
                                                if (bVar10.a(aVar) == r25) {
                                                    return r25;
                                                }
                                                dx.i iVar112 = iVar11;
                                                iVar13 = iVar10;
                                                iVar14 = iVar12;
                                                iVar15 = iVar112;
                                                int i1010 = i67;
                                                i79 = i65;
                                                i85 = i59;
                                                i86 = i69;
                                                i87 = i1010;
                                                r26 = r25;
                                                i88 = i66;
                                                params5 = params4;
                                                i89 = 0;
                                                i95 = i68;
                                                i96 = i58;
                                                i97 = i75;
                                                i98 = i77;
                                                i99 = i78;
                                                i100 = 0;
                                                bVar9.autoCertificateRenewalCache.v();
                                                bVar9.networkSessionManager.R();
                                                ax0.a aVar7 = bVar9.afterUserActivationProcessUseCase;
                                                ax0.a.Params params113 = new ax0.a.Params(params5.getDocumentType());
                                                aVar.f22357d = vq.j.a(params5);
                                                aVar.f22358e = jVar2;
                                                aVar.f22359f = vq.j.a(bVar5);
                                                aVar.f22360g = vq.j.a(bVar7);
                                                aVar.f22361h = vq.j.a(iVar9);
                                                aVar.f22362j = vq.j.a(challenge4);
                                                aVar.f22363k = vq.j.a(iVar13);
                                                aVar.f22364l = vq.j.a(b0Var2);
                                                aVar.f22365m = vq.j.a(iVar15);
                                                aVar.f22366n = vq.j.a(generateCertResponse2);
                                                aVar.f22367p = vq.j.a(iVar14);
                                                aVar.f22368q = vq.j.a(i0Var);
                                                aVar.f22369r = i37;
                                                aVar.f22370s = i85;
                                                aVar.f22371t = i95;
                                                aVar.f22372v = i99;
                                                aVar.f22373w = i88;
                                                aVar.f22374x = i86;
                                                aVar.f22375y = i96;
                                                aVar.f22376z = i87;
                                                aVar.A = i97;
                                                aVar.B = i79;
                                                aVar.C = i98;
                                                aVar.D = i89;
                                                aVar.E = i100;
                                                aVar.H = 7;
                                                objC5 = aVar7.c(params113, aVar);
                                                r17 = r26;
                                                if (objC5 == r17) {
                                                    return r17;
                                                }
                                                jVar3 = jVar2;
                                                new dx.i.Right(i0.f148189a);
                                                jVar2 = jVar3;
                                            }
                                        }
                                    } else {
                                        bVar6 = bVar4;
                                        if (documentType != rq0.b.d.DIIA_REFUGEE_CARD) {
                                            bVar6.b(new dx.b.Generic(new UnsupportedOperationException("Unsupported document type for certificate generation")));
                                            throw new oq.g();
                                        }
                                        uh0.i iVar113 = this.generateRefugeeCertificateUseCase;
                                        uh0.i.Params params114 = new uh0.i.Params(new GenerateCertificateSignedRequest(data));
                                        aVar.f22357d = params3;
                                        aVar.f22358e = jVar2;
                                        aVar.f22359f = vq.j.a(bVar5);
                                        aVar.f22360g = vq.j.a(bVar6);
                                        aVar.f22361h = vq.j.a(iVar4);
                                        aVar.f22362j = vq.j.a(challenge2);
                                        aVar.f22363k = vq.j.a(iVar3);
                                        aVar.f22364l = vq.j.a(data);
                                        aVar.f22369r = i26;
                                        aVar.f22370s = i27;
                                        aVar.f22371t = i28;
                                        aVar.f22372v = i29;
                                        aVar.f22373w = i25;
                                        aVar.f22374x = i36;
                                        aVar.f22375y = i35;
                                        aVar.f22376z = 0;
                                        aVar.A = 0;
                                        aVar.H = 4;
                                        objC2 = iVar113.c(params114, aVar);
                                        if (objC2 == E) {
                                            return E;
                                        }
                                        iVar5 = iVar3;
                                        bVar7 = bVar6;
                                        i37 = i26;
                                        b0Var = data;
                                        challenge3 = challenge2;
                                        i38 = 0;
                                        i39 = i27;
                                        i45 = i28;
                                        i46 = i29;
                                        i47 = i35;
                                        obj3 = objC2;
                                        i48 = i25;
                                        i49 = i36;
                                        i55 = 0;
                                        iVar6 = iVar4;
                                        iVar7 = (dx.i) obj3;
                                        iVar8 = iVar6;
                                        i56 = i38;
                                        b0Var2 = b0Var;
                                        if (!(iVar7 instanceof dx.i.Left)) {
                                            if (iVar7 instanceof dx.i.Right) {
                                                throw new p();
                                            }
                                            generateCertResponse = (GenerateCertResponse) ((dx.i.Right) iVar7).b();
                                            wz3.c cVar6 = this.decryptNewCertificateUseCase;
                                            wz3.c.Params params115 = new wz3.c.Params(generateCertResponse, params3.getDocumentType());
                                            aVar.f22357d = params3;
                                            aVar.f22358e = jVar2;
                                            aVar.f22359f = vq.j.a(bVar5);
                                            aVar.f22360g = vq.j.a(bVar7);
                                            aVar.f22361h = vq.j.a(iVar8);
                                            aVar.f22362j = vq.j.a(challenge3);
                                            aVar.f22363k = vq.j.a(iVar5);
                                            aVar.f22364l = vq.j.a(b0Var2);
                                            aVar.f22365m = vq.j.a(iVar7);
                                            aVar.f22366n = vq.j.a(generateCertResponse);
                                            aVar.f22369r = i37;
                                            aVar.f22370s = i39;
                                            aVar.f22371t = i45;
                                            aVar.f22372v = i46;
                                            aVar.f22373w = i48;
                                            aVar.f22374x = i49;
                                            aVar.f22375y = i47;
                                            aVar.f22376z = i55;
                                            aVar.A = i56;
                                            aVar.B = 0;
                                            aVar.C = 0;
                                            aVar.H = 5;
                                            objC4 = cVar6.c(params115, aVar);
                                            if (objC4 == r15) {
                                                r15 = E;
                                                return r15;
                                            }
                                            r15 = E;
                                            Challenge challenge11 = challenge3;
                                            iVar9 = iVar8;
                                            iVar10 = iVar5;
                                            challenge4 = challenge11;
                                            iVar11 = iVar7;
                                            obj3 = objC4;
                                            i57 = i46;
                                            generateCertResponse2 = generateCertResponse;
                                            i58 = i47;
                                            i59 = i39;
                                            i65 = 0;
                                            i66 = i48;
                                            i67 = i55;
                                            i68 = i45;
                                            i69 = i49;
                                            i75 = i56;
                                            i76 = 0;
                                            r16 = r15;
                                            iVar12 = (dx.i) obj3;
                                            r25 = r16;
                                            if (!(iVar12 instanceof dx.i.Left)) {
                                                if (!(iVar12 instanceof dx.i.Right)) {
                                                    throw new p();
                                                }
                                                i0Var = (i0) ((dx.i.Right) iVar12).b();
                                                i77 = i76;
                                                bVar9 = this;
                                                bVar10 = bVar9.notificationsInteractor;
                                                aVar.f22357d = params3;
                                                aVar.f22358e = jVar2;
                                                params4 = params3;
                                                aVar.f22359f = vq.j.a(bVar5);
                                                aVar.f22360g = vq.j.a(bVar7);
                                                aVar.f22361h = vq.j.a(iVar9);
                                                aVar.f22362j = vq.j.a(challenge4);
                                                aVar.f22363k = vq.j.a(iVar10);
                                                aVar.f22364l = vq.j.a(b0Var2);
                                                aVar.f22365m = vq.j.a(iVar11);
                                                aVar.f22366n = vq.j.a(generateCertResponse2);
                                                aVar.f22367p = vq.j.a(iVar12);
                                                aVar.f22368q = vq.j.a(i0Var);
                                                aVar.f22369r = i37;
                                                aVar.f22370s = i59;
                                                aVar.f22371t = i68;
                                                aVar.f22372v = i57;
                                                aVar.f22373w = i66;
                                                aVar.f22374x = i69;
                                                aVar.f22375y = i58;
                                                aVar.f22376z = i67;
                                                aVar.A = i75;
                                                aVar.B = i65;
                                                aVar.C = i77;
                                                i78 = i57;
                                                aVar.D = 0;
                                                aVar.E = 0;
                                                aVar.H = 6;
                                                if (bVar10.a(aVar) == r25) {
                                                    return r25;
                                                }
                                                dx.i iVar114 = iVar11;
                                                iVar13 = iVar10;
                                                iVar14 = iVar12;
                                                iVar15 = iVar114;
                                                int i1011 = i67;
                                                i79 = i65;
                                                i85 = i59;
                                                i86 = i69;
                                                i87 = i1011;
                                                r26 = r25;
                                                i88 = i66;
                                                params5 = params4;
                                                i89 = 0;
                                                i95 = i68;
                                                i96 = i58;
                                                i97 = i75;
                                                i98 = i77;
                                                i99 = i78;
                                                i100 = 0;
                                                bVar9.autoCertificateRenewalCache.v();
                                                bVar9.networkSessionManager.R();
                                                ax0.a aVar8 = bVar9.afterUserActivationProcessUseCase;
                                                ax0.a.Params params116 = new ax0.a.Params(params5.getDocumentType());
                                                aVar.f22357d = vq.j.a(params5);
                                                aVar.f22358e = jVar2;
                                                aVar.f22359f = vq.j.a(bVar5);
                                                aVar.f22360g = vq.j.a(bVar7);
                                                aVar.f22361h = vq.j.a(iVar9);
                                                aVar.f22362j = vq.j.a(challenge4);
                                                aVar.f22363k = vq.j.a(iVar13);
                                                aVar.f22364l = vq.j.a(b0Var2);
                                                aVar.f22365m = vq.j.a(iVar15);
                                                aVar.f22366n = vq.j.a(generateCertResponse2);
                                                aVar.f22367p = vq.j.a(iVar14);
                                                aVar.f22368q = vq.j.a(i0Var);
                                                aVar.f22369r = i37;
                                                aVar.f22370s = i85;
                                                aVar.f22371t = i95;
                                                aVar.f22372v = i99;
                                                aVar.f22373w = i88;
                                                aVar.f22374x = i86;
                                                aVar.f22375y = i96;
                                                aVar.f22376z = i87;
                                                aVar.A = i97;
                                                aVar.B = i79;
                                                aVar.C = i98;
                                                aVar.D = i89;
                                                aVar.E = i100;
                                                aVar.H = 7;
                                                objC5 = aVar8.c(params116, aVar);
                                                r17 = r26;
                                                if (objC5 == r17) {
                                                    return r17;
                                                }
                                                jVar3 = jVar2;
                                                new dx.i.Right(i0.f148189a);
                                                jVar2 = jVar3;
                                            }
                                        }
                                    }
                                }
                                return new dx.i.Right(i0.f148189a);
                            } catch (ex.c e26) {
                                e = e26;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e27) {
                                throw e27;
                            } catch (Exception e28) {
                                e = e28;
                                E = jVar2;
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
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        case 3:
                            int i114 = aVar.A;
                            i55 = aVar.f22376z;
                            int i115 = aVar.f22375y;
                            int i116 = aVar.f22374x;
                            int i117 = aVar.f22373w;
                            int i118 = aVar.f22372v;
                            int i119 = aVar.f22371t;
                            int i120 = aVar.f22370s;
                            int i121 = aVar.f22369r;
                            b0 b0Var3 = (b0) aVar.f22364l;
                            dx.i iVar20 = (dx.i) aVar.f22363k;
                            Challenge challenge12 = (Challenge) aVar.f22362j;
                            i38 = i114;
                            iVar4 = (dx.i) aVar.f22361h;
                            bVar7 = (ex.b) aVar.f22360g;
                            bVar5 = (ex.b) aVar.f22359f;
                            dx.j<dx.b> jVar4 = (dx.j) aVar.f22358e;
                            params3 = (wz3.b.Params) aVar.f22357d;
                            u.b(obj3);
                            challenge3 = challenge12;
                            jVar2 = jVar4;
                            iVar5 = iVar20;
                            b0Var = b0Var3;
                            i37 = i121;
                            i39 = i120;
                            i45 = i119;
                            i46 = i118;
                            i48 = i117;
                            i49 = i116;
                            i47 = i115;
                            iVar6 = iVar4;
                            iVar7 = (dx.i) obj3;
                            iVar8 = iVar6;
                            i56 = i38;
                            b0Var2 = b0Var;
                            if (!(iVar7 instanceof dx.i.Left)) {
                                if (iVar7 instanceof dx.i.Right) {
                                    throw new p();
                                }
                                generateCertResponse = (GenerateCertResponse) ((dx.i.Right) iVar7).b();
                                wz3.c cVar7 = this.decryptNewCertificateUseCase;
                                wz3.c.Params params117 = new wz3.c.Params(generateCertResponse, params3.getDocumentType());
                                aVar.f22357d = params3;
                                aVar.f22358e = jVar2;
                                aVar.f22359f = vq.j.a(bVar5);
                                aVar.f22360g = vq.j.a(bVar7);
                                aVar.f22361h = vq.j.a(iVar8);
                                aVar.f22362j = vq.j.a(challenge3);
                                aVar.f22363k = vq.j.a(iVar5);
                                aVar.f22364l = vq.j.a(b0Var2);
                                aVar.f22365m = vq.j.a(iVar7);
                                aVar.f22366n = vq.j.a(generateCertResponse);
                                aVar.f22369r = i37;
                                aVar.f22370s = i39;
                                aVar.f22371t = i45;
                                aVar.f22372v = i46;
                                aVar.f22373w = i48;
                                aVar.f22374x = i49;
                                aVar.f22375y = i47;
                                aVar.f22376z = i55;
                                aVar.A = i56;
                                aVar.B = 0;
                                aVar.C = 0;
                                aVar.H = 5;
                                objC4 = cVar7.c(params117, aVar);
                                if (objC4 == r15) {
                                    r15 = E;
                                    return r15;
                                }
                                r15 = E;
                                Challenge challenge13 = challenge3;
                                iVar9 = iVar8;
                                iVar10 = iVar5;
                                challenge4 = challenge13;
                                iVar11 = iVar7;
                                obj3 = objC4;
                                i57 = i46;
                                generateCertResponse2 = generateCertResponse;
                                i58 = i47;
                                i59 = i39;
                                i65 = 0;
                                i66 = i48;
                                i67 = i55;
                                i68 = i45;
                                i69 = i49;
                                i75 = i56;
                                i76 = 0;
                                r16 = r15;
                                iVar12 = (dx.i) obj3;
                                r25 = r16;
                                if (!(iVar12 instanceof dx.i.Left)) {
                                    if (!(iVar12 instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    i0Var = (i0) ((dx.i.Right) iVar12).b();
                                    i77 = i76;
                                    bVar9 = this;
                                    bVar10 = bVar9.notificationsInteractor;
                                    aVar.f22357d = params3;
                                    aVar.f22358e = jVar2;
                                    params4 = params3;
                                    aVar.f22359f = vq.j.a(bVar5);
                                    aVar.f22360g = vq.j.a(bVar7);
                                    aVar.f22361h = vq.j.a(iVar9);
                                    aVar.f22362j = vq.j.a(challenge4);
                                    aVar.f22363k = vq.j.a(iVar10);
                                    aVar.f22364l = vq.j.a(b0Var2);
                                    aVar.f22365m = vq.j.a(iVar11);
                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                    aVar.f22367p = vq.j.a(iVar12);
                                    aVar.f22368q = vq.j.a(i0Var);
                                    aVar.f22369r = i37;
                                    aVar.f22370s = i59;
                                    aVar.f22371t = i68;
                                    aVar.f22372v = i57;
                                    aVar.f22373w = i66;
                                    aVar.f22374x = i69;
                                    aVar.f22375y = i58;
                                    aVar.f22376z = i67;
                                    aVar.A = i75;
                                    aVar.B = i65;
                                    aVar.C = i77;
                                    i78 = i57;
                                    aVar.D = 0;
                                    aVar.E = 0;
                                    aVar.H = 6;
                                    if (bVar10.a(aVar) == r25) {
                                        return r25;
                                    }
                                    dx.i iVar115 = iVar11;
                                    iVar13 = iVar10;
                                    iVar14 = iVar12;
                                    iVar15 = iVar115;
                                    int i1012 = i67;
                                    i79 = i65;
                                    i85 = i59;
                                    i86 = i69;
                                    i87 = i1012;
                                    r26 = r25;
                                    i88 = i66;
                                    params5 = params4;
                                    i89 = 0;
                                    i95 = i68;
                                    i96 = i58;
                                    i97 = i75;
                                    i98 = i77;
                                    i99 = i78;
                                    i100 = 0;
                                    bVar9.autoCertificateRenewalCache.v();
                                    bVar9.networkSessionManager.R();
                                    ax0.a aVar9 = bVar9.afterUserActivationProcessUseCase;
                                    ax0.a.Params params118 = new ax0.a.Params(params5.getDocumentType());
                                    aVar.f22357d = vq.j.a(params5);
                                    aVar.f22358e = jVar2;
                                    aVar.f22359f = vq.j.a(bVar5);
                                    aVar.f22360g = vq.j.a(bVar7);
                                    aVar.f22361h = vq.j.a(iVar9);
                                    aVar.f22362j = vq.j.a(challenge4);
                                    aVar.f22363k = vq.j.a(iVar13);
                                    aVar.f22364l = vq.j.a(b0Var2);
                                    aVar.f22365m = vq.j.a(iVar15);
                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                    aVar.f22367p = vq.j.a(iVar14);
                                    aVar.f22368q = vq.j.a(i0Var);
                                    aVar.f22369r = i37;
                                    aVar.f22370s = i85;
                                    aVar.f22371t = i95;
                                    aVar.f22372v = i99;
                                    aVar.f22373w = i88;
                                    aVar.f22374x = i86;
                                    aVar.f22375y = i96;
                                    aVar.f22376z = i87;
                                    aVar.A = i97;
                                    aVar.B = i79;
                                    aVar.C = i98;
                                    aVar.D = i89;
                                    aVar.E = i100;
                                    aVar.H = 7;
                                    objC5 = aVar9.c(params118, aVar);
                                    r17 = r26;
                                    if (objC5 == r17) {
                                        return r17;
                                    }
                                    jVar3 = jVar2;
                                    new dx.i.Right(i0.f148189a);
                                    jVar2 = jVar3;
                                }
                            }
                            return new dx.i.Right(i0.f148189a);
                        case 4:
                            int i122 = aVar.A;
                            i55 = aVar.f22376z;
                            int i123 = aVar.f22375y;
                            int i124 = aVar.f22374x;
                            int i125 = aVar.f22373w;
                            int i126 = aVar.f22372v;
                            int i127 = aVar.f22371t;
                            int i128 = aVar.f22370s;
                            int i129 = aVar.f22369r;
                            b0 b0Var4 = (b0) aVar.f22364l;
                            dx.i iVar21 = (dx.i) aVar.f22363k;
                            Challenge challenge14 = (Challenge) aVar.f22362j;
                            i38 = i122;
                            iVar4 = (dx.i) aVar.f22361h;
                            bVar7 = (ex.b) aVar.f22360g;
                            bVar5 = (ex.b) aVar.f22359f;
                            dx.j<dx.b> jVar5 = (dx.j) aVar.f22358e;
                            params3 = (wz3.b.Params) aVar.f22357d;
                            u.b(obj3);
                            challenge3 = challenge14;
                            jVar2 = jVar5;
                            iVar5 = iVar21;
                            b0Var = b0Var4;
                            i37 = i129;
                            i39 = i128;
                            i45 = i127;
                            i46 = i126;
                            i48 = i125;
                            i49 = i124;
                            i47 = i123;
                            iVar6 = iVar4;
                            iVar7 = (dx.i) obj3;
                            iVar8 = iVar6;
                            i56 = i38;
                            b0Var2 = b0Var;
                            if (!(iVar7 instanceof dx.i.Left)) {
                                if (iVar7 instanceof dx.i.Right) {
                                    throw new p();
                                }
                                generateCertResponse = (GenerateCertResponse) ((dx.i.Right) iVar7).b();
                                wz3.c cVar8 = this.decryptNewCertificateUseCase;
                                wz3.c.Params params119 = new wz3.c.Params(generateCertResponse, params3.getDocumentType());
                                aVar.f22357d = params3;
                                aVar.f22358e = jVar2;
                                aVar.f22359f = vq.j.a(bVar5);
                                aVar.f22360g = vq.j.a(bVar7);
                                aVar.f22361h = vq.j.a(iVar8);
                                aVar.f22362j = vq.j.a(challenge3);
                                aVar.f22363k = vq.j.a(iVar5);
                                aVar.f22364l = vq.j.a(b0Var2);
                                aVar.f22365m = vq.j.a(iVar7);
                                aVar.f22366n = vq.j.a(generateCertResponse);
                                aVar.f22369r = i37;
                                aVar.f22370s = i39;
                                aVar.f22371t = i45;
                                aVar.f22372v = i46;
                                aVar.f22373w = i48;
                                aVar.f22374x = i49;
                                aVar.f22375y = i47;
                                aVar.f22376z = i55;
                                aVar.A = i56;
                                aVar.B = 0;
                                aVar.C = 0;
                                aVar.H = 5;
                                objC4 = cVar8.c(params119, aVar);
                                if (objC4 == r15) {
                                    r15 = E;
                                    return r15;
                                }
                                r15 = E;
                                Challenge challenge15 = challenge3;
                                iVar9 = iVar8;
                                iVar10 = iVar5;
                                challenge4 = challenge15;
                                iVar11 = iVar7;
                                obj3 = objC4;
                                i57 = i46;
                                generateCertResponse2 = generateCertResponse;
                                i58 = i47;
                                i59 = i39;
                                i65 = 0;
                                i66 = i48;
                                i67 = i55;
                                i68 = i45;
                                i69 = i49;
                                i75 = i56;
                                i76 = 0;
                                r16 = r15;
                                iVar12 = (dx.i) obj3;
                                r25 = r16;
                                if (!(iVar12 instanceof dx.i.Left)) {
                                    if (!(iVar12 instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    i0Var = (i0) ((dx.i.Right) iVar12).b();
                                    i77 = i76;
                                    bVar9 = this;
                                    bVar10 = bVar9.notificationsInteractor;
                                    aVar.f22357d = params3;
                                    aVar.f22358e = jVar2;
                                    params4 = params3;
                                    aVar.f22359f = vq.j.a(bVar5);
                                    aVar.f22360g = vq.j.a(bVar7);
                                    aVar.f22361h = vq.j.a(iVar9);
                                    aVar.f22362j = vq.j.a(challenge4);
                                    aVar.f22363k = vq.j.a(iVar10);
                                    aVar.f22364l = vq.j.a(b0Var2);
                                    aVar.f22365m = vq.j.a(iVar11);
                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                    aVar.f22367p = vq.j.a(iVar12);
                                    aVar.f22368q = vq.j.a(i0Var);
                                    aVar.f22369r = i37;
                                    aVar.f22370s = i59;
                                    aVar.f22371t = i68;
                                    aVar.f22372v = i57;
                                    aVar.f22373w = i66;
                                    aVar.f22374x = i69;
                                    aVar.f22375y = i58;
                                    aVar.f22376z = i67;
                                    aVar.A = i75;
                                    aVar.B = i65;
                                    aVar.C = i77;
                                    i78 = i57;
                                    aVar.D = 0;
                                    aVar.E = 0;
                                    aVar.H = 6;
                                    if (bVar10.a(aVar) == r25) {
                                        return r25;
                                    }
                                    dx.i iVar116 = iVar11;
                                    iVar13 = iVar10;
                                    iVar14 = iVar12;
                                    iVar15 = iVar116;
                                    int i1013 = i67;
                                    i79 = i65;
                                    i85 = i59;
                                    i86 = i69;
                                    i87 = i1013;
                                    r26 = r25;
                                    i88 = i66;
                                    params5 = params4;
                                    i89 = 0;
                                    i95 = i68;
                                    i96 = i58;
                                    i97 = i75;
                                    i98 = i77;
                                    i99 = i78;
                                    i100 = 0;
                                    bVar9.autoCertificateRenewalCache.v();
                                    bVar9.networkSessionManager.R();
                                    ax0.a aVar10 = bVar9.afterUserActivationProcessUseCase;
                                    ax0.a.Params params1110 = new ax0.a.Params(params5.getDocumentType());
                                    aVar.f22357d = vq.j.a(params5);
                                    aVar.f22358e = jVar2;
                                    aVar.f22359f = vq.j.a(bVar5);
                                    aVar.f22360g = vq.j.a(bVar7);
                                    aVar.f22361h = vq.j.a(iVar9);
                                    aVar.f22362j = vq.j.a(challenge4);
                                    aVar.f22363k = vq.j.a(iVar13);
                                    aVar.f22364l = vq.j.a(b0Var2);
                                    aVar.f22365m = vq.j.a(iVar15);
                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                    aVar.f22367p = vq.j.a(iVar14);
                                    aVar.f22368q = vq.j.a(i0Var);
                                    aVar.f22369r = i37;
                                    aVar.f22370s = i85;
                                    aVar.f22371t = i95;
                                    aVar.f22372v = i99;
                                    aVar.f22373w = i88;
                                    aVar.f22374x = i86;
                                    aVar.f22375y = i96;
                                    aVar.f22376z = i87;
                                    aVar.A = i97;
                                    aVar.B = i79;
                                    aVar.C = i98;
                                    aVar.D = i89;
                                    aVar.E = i100;
                                    aVar.H = 7;
                                    objC5 = aVar10.c(params1110, aVar);
                                    r17 = r26;
                                    if (objC5 == r17) {
                                        return r17;
                                    }
                                    jVar3 = jVar2;
                                    new dx.i.Right(i0.f148189a);
                                    jVar2 = jVar3;
                                }
                            }
                            return new dx.i.Right(i0.f148189a);
                        case 5:
                            int i130 = aVar.C;
                            int i131 = aVar.B;
                            int i132 = aVar.A;
                            int i133 = aVar.f22376z;
                            int i134 = aVar.f22375y;
                            int i135 = aVar.f22374x;
                            int i136 = aVar.f22373w;
                            int i137 = aVar.f22372v;
                            int i138 = aVar.f22371t;
                            i59 = aVar.f22370s;
                            int i139 = aVar.f22369r;
                            GenerateCertResponse generateCertResponse3 = (GenerateCertResponse) aVar.f22366n;
                            dx.i iVar22 = (dx.i) aVar.f22365m;
                            b0 b0Var5 = (b0) aVar.f22364l;
                            dx.i iVar23 = (dx.i) aVar.f22363k;
                            challenge4 = (Challenge) aVar.f22362j;
                            iVar9 = (dx.i) aVar.f22361h;
                            ex.b bVar13 = (ex.b) aVar.f22360g;
                            ex.b bVar14 = (ex.b) aVar.f22359f;
                            dx.j<dx.b> jVar6 = (dx.j) aVar.f22358e;
                            params3 = (wz3.b.Params) aVar.f22357d;
                            try {
                                u.b(obj3);
                                i57 = i137;
                                i66 = i136;
                                i69 = i135;
                                i58 = i134;
                                i67 = i133;
                                i75 = i132;
                                i65 = i131;
                                i76 = i130;
                                b0Var2 = b0Var5;
                                bVar7 = bVar13;
                                iVar11 = iVar22;
                                iVar10 = iVar23;
                                bVar5 = bVar14;
                                generateCertResponse2 = generateCertResponse3;
                                i68 = i138;
                                i37 = i139;
                                jVar2 = jVar6;
                                r16 = E;
                                iVar12 = (dx.i) obj3;
                                r25 = r16;
                                if (!(iVar12 instanceof dx.i.Left)) {
                                    if (!(iVar12 instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    i0Var = (i0) ((dx.i.Right) iVar12).b();
                                    i77 = i76;
                                    bVar9 = this;
                                    bVar10 = bVar9.notificationsInteractor;
                                    aVar.f22357d = params3;
                                    aVar.f22358e = jVar2;
                                    params4 = params3;
                                    aVar.f22359f = vq.j.a(bVar5);
                                    aVar.f22360g = vq.j.a(bVar7);
                                    aVar.f22361h = vq.j.a(iVar9);
                                    aVar.f22362j = vq.j.a(challenge4);
                                    aVar.f22363k = vq.j.a(iVar10);
                                    aVar.f22364l = vq.j.a(b0Var2);
                                    aVar.f22365m = vq.j.a(iVar11);
                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                    aVar.f22367p = vq.j.a(iVar12);
                                    aVar.f22368q = vq.j.a(i0Var);
                                    aVar.f22369r = i37;
                                    aVar.f22370s = i59;
                                    aVar.f22371t = i68;
                                    aVar.f22372v = i57;
                                    aVar.f22373w = i66;
                                    aVar.f22374x = i69;
                                    aVar.f22375y = i58;
                                    aVar.f22376z = i67;
                                    aVar.A = i75;
                                    aVar.B = i65;
                                    aVar.C = i77;
                                    i78 = i57;
                                    aVar.D = 0;
                                    aVar.E = 0;
                                    aVar.H = 6;
                                    if (bVar10.a(aVar) == r25) {
                                        return r25;
                                    }
                                    dx.i iVar117 = iVar11;
                                    iVar13 = iVar10;
                                    iVar14 = iVar12;
                                    iVar15 = iVar117;
                                    int i1014 = i67;
                                    i79 = i65;
                                    i85 = i59;
                                    i86 = i69;
                                    i87 = i1014;
                                    r26 = r25;
                                    i88 = i66;
                                    params5 = params4;
                                    i89 = 0;
                                    i95 = i68;
                                    i96 = i58;
                                    i97 = i75;
                                    i98 = i77;
                                    i99 = i78;
                                    i100 = 0;
                                    bVar9.autoCertificateRenewalCache.v();
                                    bVar9.networkSessionManager.R();
                                    ax0.a aVar11 = bVar9.afterUserActivationProcessUseCase;
                                    ax0.a.Params params1111 = new ax0.a.Params(params5.getDocumentType());
                                    aVar.f22357d = vq.j.a(params5);
                                    aVar.f22358e = jVar2;
                                    aVar.f22359f = vq.j.a(bVar5);
                                    aVar.f22360g = vq.j.a(bVar7);
                                    aVar.f22361h = vq.j.a(iVar9);
                                    aVar.f22362j = vq.j.a(challenge4);
                                    aVar.f22363k = vq.j.a(iVar13);
                                    aVar.f22364l = vq.j.a(b0Var2);
                                    aVar.f22365m = vq.j.a(iVar15);
                                    aVar.f22366n = vq.j.a(generateCertResponse2);
                                    aVar.f22367p = vq.j.a(iVar14);
                                    aVar.f22368q = vq.j.a(i0Var);
                                    aVar.f22369r = i37;
                                    aVar.f22370s = i85;
                                    aVar.f22371t = i95;
                                    aVar.f22372v = i99;
                                    aVar.f22373w = i88;
                                    aVar.f22374x = i86;
                                    aVar.f22375y = i96;
                                    aVar.f22376z = i87;
                                    aVar.A = i97;
                                    aVar.B = i79;
                                    aVar.C = i98;
                                    aVar.D = i89;
                                    aVar.E = i100;
                                    aVar.H = 7;
                                    objC5 = aVar11.c(params1111, aVar);
                                    r17 = r26;
                                    if (objC5 == r17) {
                                        return r17;
                                    }
                                    jVar3 = jVar2;
                                    new dx.i.Right(i0.f148189a);
                                    jVar2 = jVar3;
                                }
                                return new dx.i.Right(i0.f148189a);
                            } catch (ex.c e29) {
                                e = e29;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e35) {
                                throw e35;
                            } catch (Exception e36) {
                                e = e36;
                                E = jVar6;
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
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        case 6:
                            int i140 = aVar.E;
                            int i141 = aVar.D;
                            int i142 = aVar.C;
                            int i143 = aVar.B;
                            int i144 = aVar.A;
                            int i145 = aVar.f22376z;
                            int i146 = aVar.f22375y;
                            int i147 = aVar.f22374x;
                            int i148 = aVar.f22373w;
                            int i149 = aVar.f22372v;
                            int i150 = aVar.f22371t;
                            int i151 = aVar.f22370s;
                            int i152 = aVar.f22369r;
                            i0 i0Var2 = (i0) aVar.f22368q;
                            dx.i iVar24 = (dx.i) aVar.f22367p;
                            GenerateCertResponse generateCertResponse4 = (GenerateCertResponse) aVar.f22366n;
                            dx.i iVar25 = (dx.i) aVar.f22365m;
                            b0 b0Var6 = (b0) aVar.f22364l;
                            iVar13 = (dx.i) aVar.f22363k;
                            Challenge challenge16 = (Challenge) aVar.f22362j;
                            dx.i iVar26 = (dx.i) aVar.f22361h;
                            ex.b bVar15 = (ex.b) aVar.f22360g;
                            ex.b bVar16 = (ex.b) aVar.f22359f;
                            dx.j<dx.b> jVar7 = (dx.j) aVar.f22358e;
                            wz3.b.Params params20 = (wz3.b.Params) aVar.f22357d;
                            try {
                                u.b(obj3);
                                i89 = i141;
                                iVar14 = iVar24;
                                bVar7 = bVar15;
                                i0Var = i0Var2;
                                b0Var2 = b0Var6;
                                iVar9 = iVar26;
                                r26 = E;
                                bVar9 = this;
                                i88 = i148;
                                i96 = i146;
                                i97 = i144;
                                i98 = i142;
                                i95 = i150;
                                i86 = i147;
                                i87 = i145;
                                i79 = i143;
                                i85 = i151;
                                jVar2 = jVar7;
                                i37 = i152;
                                params5 = params20;
                                i99 = i149;
                                iVar15 = iVar25;
                                challenge4 = challenge16;
                                generateCertResponse2 = generateCertResponse4;
                                bVar5 = bVar16;
                                i100 = i140;
                                bVar9.autoCertificateRenewalCache.v();
                                bVar9.networkSessionManager.R();
                                ax0.a aVar12 = bVar9.afterUserActivationProcessUseCase;
                                ax0.a.Params params1112 = new ax0.a.Params(params5.getDocumentType());
                                aVar.f22357d = vq.j.a(params5);
                                aVar.f22358e = jVar2;
                                aVar.f22359f = vq.j.a(bVar5);
                                aVar.f22360g = vq.j.a(bVar7);
                                aVar.f22361h = vq.j.a(iVar9);
                                aVar.f22362j = vq.j.a(challenge4);
                                aVar.f22363k = vq.j.a(iVar13);
                                aVar.f22364l = vq.j.a(b0Var2);
                                aVar.f22365m = vq.j.a(iVar15);
                                aVar.f22366n = vq.j.a(generateCertResponse2);
                                aVar.f22367p = vq.j.a(iVar14);
                                aVar.f22368q = vq.j.a(i0Var);
                                aVar.f22369r = i37;
                                aVar.f22370s = i85;
                                aVar.f22371t = i95;
                                aVar.f22372v = i99;
                                aVar.f22373w = i88;
                                aVar.f22374x = i86;
                                aVar.f22375y = i96;
                                aVar.f22376z = i87;
                                aVar.A = i97;
                                aVar.B = i79;
                                aVar.C = i98;
                                aVar.D = i89;
                                aVar.E = i100;
                                aVar.H = 7;
                                objC5 = aVar12.c(params1112, aVar);
                                r17 = r26;
                                if (objC5 == r17) {
                                    return r17;
                                }
                                jVar3 = jVar2;
                                new dx.i.Right(i0.f148189a);
                                jVar2 = jVar3;
                                return new dx.i.Right(i0.f148189a);
                            } catch (ex.c e37) {
                                e = e37;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e38) {
                                throw e38;
                            } catch (Exception e39) {
                                e = e39;
                                E = jVar7;
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
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        case 7:
                            jVar3 = (dx.j) aVar.f22358e;
                            try {
                                u.b(obj3);
                                new dx.i.Right(i0.f148189a);
                                jVar2 = jVar3;
                                return new dx.i.Right(i0.f148189a);
                            } catch (ex.c e45) {
                                e = e45;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e46) {
                                throw e46;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Exception e47) {
                    e = e47;
                }
            } catch (CancellationException e48) {
                throw e48;
            }
        } catch (ex.c e49) {
            e = e49;
        } catch (CancellationException e55) {
            throw e55;
        } catch (Exception e56) {
            e = e56;
            E = obj;
        }
    }
}
