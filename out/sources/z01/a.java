package z01;

import ac4.d;
import dx.i;
import dx.j;
import fr.k;
import fr.t;
import iy.b0;
import iy.c0;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k34.u;
import my.JWSHeaderData;
import my.JWSPayloadData;
import my.JWSSignerData;
import oq.g;
import oq.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import px.f;
import q34.z0;
import ry.CertKeyPair;
import ry.n;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u0017B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lz01/a;", "", "Lz01/a$b;", "Liy/b0;", "Liy/a;", "base64Coder", "Lac4/d;", "getCurrentServerTimeUseCase", "Lq34/z0;", "getPeselFromPersonalIdCertificate", "Lly/a;", "jwsSigner", "Lez/c;", "dateConverter", "Llo2/a;", "notificationsContainersInteractor", "<init>", "(Liy/a;Lac4/d;Lq34/z0;Lly/a;Lez/c;Llo2/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lz01/a$b;Ltq/e;)Ljava/lang/Object;", "a", "Liy/a;", "b", "Lac4/d;", "c", "Lq34/z0;", "Lly/a;", "e", "Lez/c;", "f", "Llo2/a;", "", "", "g", "Ljava/util/List;", "getDefaultAudience", "()Ljava/util/List;", "defaultAudience", "h", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C6225a f231814h = new C6225a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f231815i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final n.b.C4515b f231816j = n.b.C4515b.f176854d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d getCurrentServerTimeUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z0 getPeselFromPersonalIdCertificate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ly.a jwsSigner;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final lo2.a notificationsContainersInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<String> defaultAudience = v.e("mobywatel.gov.pl");

    /* JADX INFO: renamed from: z01.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz01/a$a;", "", "<init>", "()V", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C6225a {
        public /* synthetic */ C6225a(k kVar) {
            this();
        }

        private C6225a() {
        }
    }

    /* JADX INFO: renamed from: z01.a$b, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz01/a$b;", "Lgz/b$a;", "", "", "claimsToSign", "Lgu/b;", "tokenTtlInSeconds", "<init>", "(Ljava/util/Map;JLfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "J", "()J", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> claimsToSign;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long tokenTtlInSeconds;

        public /* synthetic */ Params(Map map, long j15, k kVar) {
            this(map, j15);
        }

        public final Map<String, String> a() {
            return this.claimsToSign;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTokenTtlInSeconds() {
            return this.tokenTtlInSeconds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.claimsToSign, params.claimsToSign) && gu.b.v(this.tokenTtlInSeconds, params.tokenTtlInSeconds);
        }

        public int hashCode() {
            return (this.claimsToSign.hashCode() * 31) + gu.b.N(this.tokenTtlInSeconds);
        }

        public String toString() {
            return "Params(claimsToSign=" + this.claimsToSign + ", tokenTtlInSeconds=" + ((Object) gu.b.d0(this.tokenTtlInSeconds)) + ')';
        }

        private Params(Map<String, String> map, long j15) {
            this.claimsToSign = map;
            this.tokenTtlInSeconds = j15;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {
        int A;
        int B;
        int C;
        int D;
        /* synthetic */ Object E;
        int G;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f231829g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f231830h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f231831j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f231832k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f231833l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f231834m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f231835n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f231836p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f231837q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f231838r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f231839s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f231840t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f231841v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f231842w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f231843x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f231844y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f231845z;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.E = obj;
            this.G |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(iy.a aVar, d dVar, z0 z0Var, ly.a aVar2, ez.c cVar, lo2.a aVar3) {
        this.base64Coder = aVar;
        this.getCurrentServerTimeUseCase = dVar;
        this.getPeselFromPersonalIdCertificate = z0Var;
        this.jwsSigner = aVar2;
        this.dateConverter = cVar;
        this.notificationsContainersInteractor = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03e8 A[Catch: Exception -> 0x03df, c -> 0x03e2, CancellationException -> 0x03e5, TRY_ENTER, TryCatch #9 {c -> 0x03e2, CancellationException -> 0x03e5, Exception -> 0x03df, blocks: (B:76:0x028e, B:79:0x0299, B:81:0x029d, B:103:0x03e8, B:104:0x03ed), top: B:132:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:105:0x03ee A[Catch: Exception -> 0x006b, c -> 0x006e, CancellationException -> 0x0071, TRY_ENTER, TryCatch #1 {Exception -> 0x006b, blocks: (B:15:0x0066, B:86:0x0391, B:88:0x03a5, B:90:0x03a9, B:92:0x03ad, B:93:0x03bc, B:94:0x03c1, B:95:0x03c2, B:96:0x03de, B:109:0x03fa, B:112:0x0408, B:66:0x01f8, B:69:0x0202, B:71:0x0206, B:105:0x03ee, B:106:0x03f3, B:57:0x01a8, B:60:0x01b0, B:62:0x01b4, B:107:0x03f4, B:108:0x03f9, B:53:0x0176), top: B:127:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0411  */
    /* JADX WARN: Code duplicated, block: B:118:0x0422  */
    /* JADX WARN: Code duplicated, block: B:119:0x0430  */
    /* JADX WARN: Code duplicated, block: B:121:0x0434  */
    /* JADX WARN: Code duplicated, block: B:124:0x0441  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0200  */
    /* JADX WARN: Code duplicated, block: B:69:0x0202 A[Catch: Exception -> 0x006b, c -> 0x006e, CancellationException -> 0x0071, TryCatch #1 {Exception -> 0x006b, blocks: (B:15:0x0066, B:86:0x0391, B:88:0x03a5, B:90:0x03a9, B:92:0x03ad, B:93:0x03bc, B:94:0x03c1, B:95:0x03c2, B:96:0x03de, B:109:0x03fa, B:112:0x0408, B:66:0x01f8, B:69:0x0202, B:71:0x0206, B:105:0x03ee, B:106:0x03f3, B:57:0x01a8, B:60:0x01b0, B:62:0x01b4, B:107:0x03f4, B:108:0x03f9, B:53:0x0176), top: B:127:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0206 A[Catch: Exception -> 0x006b, c -> 0x006e, CancellationException -> 0x0071, TRY_LEAVE, TryCatch #1 {Exception -> 0x006b, blocks: (B:15:0x0066, B:86:0x0391, B:88:0x03a5, B:90:0x03a9, B:92:0x03ad, B:93:0x03bc, B:94:0x03c1, B:95:0x03c2, B:96:0x03de, B:109:0x03fa, B:112:0x0408, B:66:0x01f8, B:69:0x0202, B:71:0x0206, B:105:0x03ee, B:106:0x03f3, B:57:0x01a8, B:60:0x01b0, B:62:0x01b4, B:107:0x03f4, B:108:0x03f9, B:53:0x0176), top: B:127:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x027c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0296  */
    /* JADX WARN: Code duplicated, block: B:79:0x0299 A[Catch: Exception -> 0x03df, c -> 0x03e2, CancellationException -> 0x03e5, TryCatch #9 {c -> 0x03e2, CancellationException -> 0x03e5, Exception -> 0x03df, blocks: (B:76:0x028e, B:79:0x0299, B:81:0x029d, B:103:0x03e8, B:104:0x03ed), top: B:132:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x029d A[Catch: Exception -> 0x03df, c -> 0x03e2, CancellationException -> 0x03e5, TRY_LEAVE, TryCatch #9 {c -> 0x03e2, CancellationException -> 0x03e5, Exception -> 0x03df, blocks: (B:76:0x028e, B:79:0x0299, B:81:0x029d, B:103:0x03e8, B:104:0x03ed), top: B:132:0x028e }] */
    /* JADX WARN: Code duplicated, block: B:85:0x038f  */
    /* JADX WARN: Code duplicated, block: B:90:0x03a9 A[Catch: Exception -> 0x006b, c -> 0x006e, CancellationException -> 0x0071, TryCatch #1 {Exception -> 0x006b, blocks: (B:15:0x0066, B:86:0x0391, B:88:0x03a5, B:90:0x03a9, B:92:0x03ad, B:93:0x03bc, B:94:0x03c1, B:95:0x03c2, B:96:0x03de, B:109:0x03fa, B:112:0x0408, B:66:0x01f8, B:69:0x0202, B:71:0x0206, B:105:0x03ee, B:106:0x03f3, B:57:0x01a8, B:60:0x01b0, B:62:0x01b4, B:107:0x03f4, B:108:0x03f9, B:53:0x0176), top: B:127:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x03ad A[Catch: Exception -> 0x006b, c -> 0x006e, CancellationException -> 0x0071, TryCatch #1 {Exception -> 0x006b, blocks: (B:15:0x0066, B:86:0x0391, B:88:0x03a5, B:90:0x03a9, B:92:0x03ad, B:93:0x03bc, B:94:0x03c1, B:95:0x03c2, B:96:0x03de, B:109:0x03fa, B:112:0x0408, B:66:0x01f8, B:69:0x0202, B:71:0x0206, B:105:0x03ee, B:106:0x03f3, B:57:0x01a8, B:60:0x01b0, B:62:0x01b4, B:107:0x03f4, B:108:0x03f9, B:53:0x0176), top: B:127:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x03bc A[Catch: Exception -> 0x006b, c -> 0x006e, CancellationException -> 0x0071, TryCatch #1 {Exception -> 0x006b, blocks: (B:15:0x0066, B:86:0x0391, B:88:0x03a5, B:90:0x03a9, B:92:0x03ad, B:93:0x03bc, B:94:0x03c1, B:95:0x03c2, B:96:0x03de, B:109:0x03fa, B:112:0x0408, B:66:0x01f8, B:69:0x0202, B:71:0x0206, B:105:0x03ee, B:106:0x03f3, B:57:0x01a8, B:60:0x01b0, B:62:0x01b4, B:107:0x03f4, B:108:0x03f9, B:53:0x0176), top: B:127:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x03c2 A[Catch: Exception -> 0x006b, c -> 0x006e, CancellationException -> 0x0071, TryCatch #1 {Exception -> 0x006b, blocks: (B:15:0x0066, B:86:0x0391, B:88:0x03a5, B:90:0x03a9, B:92:0x03ad, B:93:0x03bc, B:94:0x03c1, B:95:0x03c2, B:96:0x03de, B:109:0x03fa, B:112:0x0408, B:66:0x01f8, B:69:0x0202, B:71:0x0206, B:105:0x03ee, B:106:0x03f3, B:57:0x01a8, B:60:0x01b0, B:62:0x01b4, B:107:0x03f4, B:108:0x03f9, B:53:0x0176), top: B:127:0x0028 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public Object d(Params params, e<? super i<? extends dx.b, b0>> eVar) throws Throwable {
        c cVar;
        String message;
        i iVarA;
        Object objB;
        j<dx.b> jVarA;
        ex.b aVar;
        Params params2;
        ex.b bVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        i right;
        u uVar;
        i iVar;
        ex.b bVar2;
        int i25;
        int i26;
        int i27;
        int i28;
        u uVar2;
        CertKeyPair certKeyPair;
        i iVar2;
        int i29;
        b0 b0VarG;
        int i35;
        Params params3;
        Object objC;
        Object obj;
        b0 b0Var;
        u uVar3;
        int i36;
        ex.b bVar3;
        i iVar3;
        ex.b bVar4;
        int i37;
        j<dx.b> jVar;
        int i38;
        int i39;
        int i45;
        int i46;
        CertKeyPair certKeyPair2;
        Object obj2;
        ex.b bVar5;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i47 = cVar.G;
            if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.G = i47 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC2 = cVar.E;
        Object objE = uq.b.e();
        int i48 = cVar.G;
        ?? r15 = 4;
        try {
            try {
                try {
                    if (i48 == 0) {
                        oq.u.b(objC2);
                        jVarA = xw.c.f221622a.a();
                        aVar = new ex.a();
                        lo2.a aVar2 = this.notificationsContainersInteractor;
                        params2 = params;
                        cVar.f231826d = params2;
                        cVar.f231827e = jVarA;
                        cVar.f231828f = vq.j.a(aVar);
                        cVar.f231829g = aVar;
                        cVar.f231839s = 0;
                        cVar.f231840t = 0;
                        cVar.f231841v = 0;
                        cVar.f231842w = 0;
                        cVar.f231843x = 0;
                        cVar.G = 1;
                        objC2 = lo2.a.c(aVar2, false, cVar, 1, null);
                        if (objC2 != objE) {
                            bVar = aVar;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                        }
                        return objE;
                    }
                    if (i48 != 1) {
                        if (i48 == 2) {
                            int i49 = cVar.f231845z;
                            int i55 = cVar.f231844y;
                            int i56 = cVar.f231843x;
                            int i57 = cVar.f231842w;
                            int i58 = cVar.f231841v;
                            int i59 = cVar.f231840t;
                            int i65 = cVar.f231839s;
                            u uVar4 = (u) cVar.f231831j;
                            iVar = (i) cVar.f231830h;
                            bVar = (ex.b) cVar.f231829g;
                            ex.b bVar6 = (ex.b) cVar.f231828f;
                            j<dx.b> jVar2 = (j) cVar.f231827e;
                            params2 = (Params) cVar.f231826d;
                            try {
                                oq.u.b(objC2);
                                i18 = i57;
                                i26 = i58;
                                bVar2 = bVar6;
                                i16 = i65;
                                uVar = uVar4;
                                i25 = i59;
                                i19 = i56;
                                i28 = i55;
                                jVarA = jVar2;
                                i27 = i49;
                                right = (i) objC2;
                                uVar2 = uVar;
                                if (!(right instanceof i.Left)) {
                                    if (right instanceof i.Right) {
                                        throw new p();
                                    }
                                    certKeyPair = (CertKeyPair) ((i.Right) right).b();
                                    iVar2 = iVar;
                                    i29 = i27;
                                    b0VarG = c0.g(iy.a.e(this.base64Coder, certKeyPair.getCertificate().getEncoded(), null, 2, null));
                                    z0 z0Var = this.getPeselFromPersonalIdCertificate;
                                    z0.a.CertC509CertString certC509CertString = new z0.a.CertC509CertString(b0VarG);
                                    cVar.f231826d = params2;
                                    cVar.f231827e = jVarA;
                                    cVar.f231828f = vq.j.a(bVar2);
                                    cVar.f231829g = bVar;
                                    cVar.f231830h = vq.j.a(iVar2);
                                    cVar.f231831j = vq.j.a(uVar2);
                                    cVar.f231832k = vq.j.a(right);
                                    cVar.f231833l = certKeyPair;
                                    cVar.f231834m = b0VarG;
                                    cVar.f231839s = i16;
                                    cVar.f231840t = i25;
                                    cVar.f231841v = i26;
                                    cVar.f231842w = i18;
                                    cVar.f231843x = i19;
                                    i35 = i28;
                                    cVar.f231844y = i35;
                                    params3 = params2;
                                    cVar.f231845z = i29;
                                    cVar.A = 0;
                                    cVar.B = 0;
                                    cVar.G = 3;
                                    objC = z0Var.c(certC509CertString, cVar);
                                    obj = objE;
                                    if (objC == obj) {
                                        return obj;
                                    }
                                    b0Var = b0VarG;
                                    uVar3 = uVar2;
                                    i36 = 0;
                                    bVar3 = bVar2;
                                    iVar3 = right;
                                    objC2 = objC;
                                    bVar4 = bVar;
                                    i37 = i25;
                                    jVar = jVarA;
                                    i38 = i26;
                                    i39 = 0;
                                    i45 = i16;
                                    i46 = i29;
                                    right = (i) objC2;
                                    certKeyPair2 = certKeyPair;
                                    if (!(right instanceof i.Left)) {
                                        if (!(right instanceof i.Right)) {
                                            throw new p();
                                        }
                                        z0.Result result = (z0.Result) ((i.Right) right).b();
                                        obj2 = obj;
                                        OffsetDateTime offsetDateTimeA = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                                        ly.a aVar3 = this.jwsSigner;
                                        n.b.C4515b c4515b = f231816j;
                                        JWSHeaderData jWSHeaderData = new JWSHeaderData(c4515b, null, v.e(c0.e(b0Var)), null, 10, null);
                                        int i66 = i36;
                                        JWSPayloadData jWSPayloadData = new JWSPayloadData("mObywatel", c0.e(result.getPesel()), this.dateConverter.d(offsetDateTimeA.plusSeconds(gu.b.F(params3.getTokenTtlInSeconds()))), this.dateConverter.d(offsetDateTimeA), new JWSPayloadData.a.Multiple(this.defaultAudience), null, null, params3.a(), 96, null);
                                        JWSSignerData jWSSignerData = new JWSSignerData(certKeyPair2.getPrivateKey(), c4515b);
                                        cVar.f231826d = vq.j.a(params3);
                                        cVar.f231827e = jVar;
                                        cVar.f231828f = vq.j.a(bVar3);
                                        cVar.f231829g = bVar4;
                                        cVar.f231830h = vq.j.a(iVar2);
                                        cVar.f231831j = vq.j.a(uVar3);
                                        cVar.f231832k = vq.j.a(iVar3);
                                        cVar.f231833l = vq.j.a(certKeyPair2);
                                        cVar.f231834m = vq.j.a(right);
                                        cVar.f231835n = vq.j.a(b0Var);
                                        cVar.f231836p = vq.j.a(result);
                                        cVar.f231837q = vq.j.a(offsetDateTimeA);
                                        cVar.f231838r = bVar4;
                                        cVar.f231839s = i45;
                                        cVar.f231840t = i37;
                                        cVar.f231841v = i38;
                                        cVar.f231842w = i18;
                                        cVar.f231843x = i19;
                                        cVar.f231844y = i35;
                                        cVar.f231845z = i46;
                                        cVar.A = i66;
                                        cVar.B = i39;
                                        cVar.C = 0;
                                        cVar.D = 0;
                                        cVar.G = 4;
                                        objC2 = aVar3.a(jWSHeaderData, jWSPayloadData, jWSSignerData, cVar);
                                        if (objC2 == obj2) {
                                            return obj2;
                                        }
                                        bVar5 = bVar4;
                                        right = new i.Right(c0.g((String) bVar4.a((i) objC2)));
                                        bVar4 = bVar5;
                                    }
                                    bVar = bVar4;
                                }
                                if (right instanceof i.Left) {
                                    bVar.b(new dx.b.Generic(new Exception("Bundle id for main identity is null")));
                                    throw new g();
                                }
                                if (right instanceof i.Right) {
                                    return new i.Right((b0) ((i.Right) right).b());
                                }
                                throw new p();
                            } catch (ex.c e15) {
                                e = e15;
                                return new i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar2;
                                f fVar = f.f163100a;
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
                        if (i48 == 3) {
                            int i67 = cVar.B;
                            int i68 = cVar.A;
                            int i69 = cVar.f231845z;
                            int i75 = cVar.f231844y;
                            int i76 = cVar.f231843x;
                            i18 = cVar.f231842w;
                            int i77 = cVar.f231841v;
                            int i78 = cVar.f231840t;
                            int i79 = cVar.f231839s;
                            b0 b0Var2 = (b0) cVar.f231834m;
                            CertKeyPair certKeyPair3 = (CertKeyPair) cVar.f231833l;
                            i iVar4 = (i) cVar.f231832k;
                            uVar3 = (u) cVar.f231831j;
                            i iVar5 = (i) cVar.f231830h;
                            ex.b bVar7 = (ex.b) cVar.f231829g;
                            bVar3 = (ex.b) cVar.f231828f;
                            j<dx.b> jVar3 = (j) cVar.f231827e;
                            Params params4 = (Params) cVar.f231826d;
                            try {
                                oq.u.b(objC2);
                                i39 = i67;
                                iVar3 = iVar4;
                                i45 = i79;
                                i38 = i77;
                                i19 = i76;
                                i35 = i75;
                                i46 = i69;
                                i36 = i68;
                                jVar = jVar3;
                                iVar2 = iVar5;
                                params3 = params4;
                                obj = objE;
                                bVar4 = bVar7;
                                b0Var = b0Var2;
                                i37 = i78;
                                certKeyPair = certKeyPair3;
                                try {
                                    right = (i) objC2;
                                    certKeyPair2 = certKeyPair;
                                    if (!(right instanceof i.Left)) {
                                        if (!(right instanceof i.Right)) {
                                            throw new p();
                                        }
                                        z0.Result result2 = (z0.Result) ((i.Right) right).b();
                                        obj2 = obj;
                                        OffsetDateTime offsetDateTimeA2 = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                                        ly.a aVar4 = this.jwsSigner;
                                        n.b.C4515b c4515b2 = f231816j;
                                        JWSHeaderData jWSHeaderData2 = new JWSHeaderData(c4515b2, null, v.e(c0.e(b0Var)), null, 10, null);
                                        int i610 = i36;
                                        JWSPayloadData jWSPayloadData2 = new JWSPayloadData("mObywatel", c0.e(result2.getPesel()), this.dateConverter.d(offsetDateTimeA2.plusSeconds(gu.b.F(params3.getTokenTtlInSeconds()))), this.dateConverter.d(offsetDateTimeA2), new JWSPayloadData.a.Multiple(this.defaultAudience), null, null, params3.a(), 96, null);
                                        JWSSignerData jWSSignerData2 = new JWSSignerData(certKeyPair2.getPrivateKey(), c4515b2);
                                        cVar.f231826d = vq.j.a(params3);
                                        cVar.f231827e = jVar;
                                        cVar.f231828f = vq.j.a(bVar3);
                                        cVar.f231829g = bVar4;
                                        cVar.f231830h = vq.j.a(iVar2);
                                        cVar.f231831j = vq.j.a(uVar3);
                                        cVar.f231832k = vq.j.a(iVar3);
                                        cVar.f231833l = vq.j.a(certKeyPair2);
                                        cVar.f231834m = vq.j.a(right);
                                        cVar.f231835n = vq.j.a(b0Var);
                                        cVar.f231836p = vq.j.a(result2);
                                        cVar.f231837q = vq.j.a(offsetDateTimeA2);
                                        cVar.f231838r = bVar4;
                                        cVar.f231839s = i45;
                                        cVar.f231840t = i37;
                                        cVar.f231841v = i38;
                                        cVar.f231842w = i18;
                                        cVar.f231843x = i19;
                                        cVar.f231844y = i35;
                                        cVar.f231845z = i46;
                                        cVar.A = i610;
                                        cVar.B = i39;
                                        cVar.C = 0;
                                        cVar.D = 0;
                                        cVar.G = 4;
                                        objC2 = aVar4.a(jWSHeaderData2, jWSPayloadData2, jWSSignerData2, cVar);
                                        if (objC2 == obj2) {
                                            return obj2;
                                        }
                                        bVar5 = bVar4;
                                    }
                                    bVar = bVar4;
                                    if (right instanceof i.Left) {
                                        if (right instanceof i.Right) {
                                            return new i.Right((b0) ((i.Right) right).b());
                                        }
                                        throw new p();
                                    }
                                    bVar.b(new dx.b.Generic(new Exception("Bundle id for main identity is null")));
                                    throw new g();
                                } catch (ex.c e18) {
                                    e = e18;
                                    return new i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                } catch (Exception e25) {
                                    e = e25;
                                    r15 = jVar;
                                    f fVar2 = f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar2.d(message, e, px.c.a(r15));
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
                            } catch (ex.c e26) {
                                e = e26;
                                return new i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e27) {
                                throw e27;
                            } catch (Exception e28) {
                                e = e28;
                                r15 = jVar3;
                                f fVar3 = f.f163100a;
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
                        }
                        if (i48 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar4 = (ex.b) cVar.f231838r;
                        bVar5 = (ex.b) cVar.f231829g;
                        oq.u.b(objC2);
                        right = new i.Right(c0.g((String) bVar4.a((i) objC2)));
                        bVar4 = bVar5;
                        bVar = bVar4;
                        if (right instanceof i.Left) {
                            if (right instanceof i.Right) {
                                return new i.Right((b0) ((i.Right) right).b());
                            }
                            throw new p();
                        }
                        bVar.b(new dx.b.Generic(new Exception("Bundle id for main identity is null")));
                        throw new g();
                    }
                    int i85 = cVar.f231843x;
                    int i86 = cVar.f231842w;
                    int i87 = cVar.f231841v;
                    i15 = cVar.f231840t;
                    i16 = cVar.f231839s;
                    ex.b bVar8 = (ex.b) cVar.f231829g;
                    aVar = (ex.b) cVar.f231828f;
                    j<dx.b> jVar4 = (j) cVar.f231827e;
                    Params params5 = (Params) cVar.f231826d;
                    try {
                        oq.u.b(objC2);
                        i19 = i85;
                        params2 = params5;
                        i18 = i86;
                        jVarA = jVar4;
                        i17 = i87;
                        bVar = bVar8;
                    } catch (ex.c e29) {
                        e = e29;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e35) {
                        throw e35;
                    } catch (Exception e36) {
                        e = e36;
                        r15 = jVar4;
                        f fVar4 = f.f163100a;
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
                    right = (i) objC2;
                    if (!(right instanceof i.Left)) {
                        if (!(right instanceof i.Right)) {
                            throw new p();
                        }
                        uVar = (u) ((i.Right) right).b();
                        lo2.a aVar5 = this.notificationsContainersInteractor;
                        cVar.f231826d = params2;
                        cVar.f231827e = jVarA;
                        cVar.f231828f = vq.j.a(aVar);
                        cVar.f231829g = bVar;
                        cVar.f231830h = vq.j.a(right);
                        cVar.f231831j = vq.j.a(uVar);
                        cVar.f231839s = i16;
                        cVar.f231840t = i15;
                        cVar.f231841v = i17;
                        cVar.f231842w = i18;
                        cVar.f231843x = i19;
                        cVar.f231844y = 0;
                        cVar.f231845z = 0;
                        cVar.G = 2;
                        Object objB2 = aVar5.b(uVar, cVar);
                        if (objB2 == objE) {
                            return objE;
                        }
                        iVar = right;
                        bVar2 = aVar;
                        objC2 = objB2;
                        i25 = i15;
                        i26 = i17;
                        i27 = 0;
                        i28 = 0;
                        right = (i) objC2;
                        uVar2 = uVar;
                        if (!(right instanceof i.Left)) {
                            if (right instanceof i.Right) {
                                throw new p();
                            }
                            certKeyPair = (CertKeyPair) ((i.Right) right).b();
                            iVar2 = iVar;
                            i29 = i27;
                            b0VarG = c0.g(iy.a.e(this.base64Coder, certKeyPair.getCertificate().getEncoded(), null, 2, null));
                            z0 z0Var2 = this.getPeselFromPersonalIdCertificate;
                            z0.a.CertC509CertString certC509CertString2 = new z0.a.CertC509CertString(b0VarG);
                            cVar.f231826d = params2;
                            cVar.f231827e = jVarA;
                            cVar.f231828f = vq.j.a(bVar2);
                            cVar.f231829g = bVar;
                            cVar.f231830h = vq.j.a(iVar2);
                            cVar.f231831j = vq.j.a(uVar2);
                            cVar.f231832k = vq.j.a(right);
                            cVar.f231833l = certKeyPair;
                            cVar.f231834m = b0VarG;
                            cVar.f231839s = i16;
                            cVar.f231840t = i25;
                            cVar.f231841v = i26;
                            cVar.f231842w = i18;
                            cVar.f231843x = i19;
                            i35 = i28;
                            cVar.f231844y = i35;
                            params3 = params2;
                            cVar.f231845z = i29;
                            cVar.A = 0;
                            cVar.B = 0;
                            cVar.G = 3;
                            objC = z0Var2.c(certC509CertString2, cVar);
                            obj = objE;
                            if (objC == obj) {
                                return obj;
                            }
                            b0Var = b0VarG;
                            uVar3 = uVar2;
                            i36 = 0;
                            bVar3 = bVar2;
                            iVar3 = right;
                            objC2 = objC;
                            bVar4 = bVar;
                            i37 = i25;
                            jVar = jVarA;
                            i38 = i26;
                            i39 = 0;
                            i45 = i16;
                            i46 = i29;
                            right = (i) objC2;
                            certKeyPair2 = certKeyPair;
                            if (!(right instanceof i.Left)) {
                                if (!(right instanceof i.Right)) {
                                    throw new p();
                                }
                                z0.Result result3 = (z0.Result) ((i.Right) right).b();
                                obj2 = obj;
                                OffsetDateTime offsetDateTimeA3 = this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a);
                                ly.a aVar6 = this.jwsSigner;
                                n.b.C4515b c4515b3 = f231816j;
                                JWSHeaderData jWSHeaderData3 = new JWSHeaderData(c4515b3, null, v.e(c0.e(b0Var)), null, 10, null);
                                int i611 = i36;
                                JWSPayloadData jWSPayloadData3 = new JWSPayloadData("mObywatel", c0.e(result3.getPesel()), this.dateConverter.d(offsetDateTimeA3.plusSeconds(gu.b.F(params3.getTokenTtlInSeconds()))), this.dateConverter.d(offsetDateTimeA3), new JWSPayloadData.a.Multiple(this.defaultAudience), null, null, params3.a(), 96, null);
                                JWSSignerData jWSSignerData3 = new JWSSignerData(certKeyPair2.getPrivateKey(), c4515b3);
                                cVar.f231826d = vq.j.a(params3);
                                cVar.f231827e = jVar;
                                cVar.f231828f = vq.j.a(bVar3);
                                cVar.f231829g = bVar4;
                                cVar.f231830h = vq.j.a(iVar2);
                                cVar.f231831j = vq.j.a(uVar3);
                                cVar.f231832k = vq.j.a(iVar3);
                                cVar.f231833l = vq.j.a(certKeyPair2);
                                cVar.f231834m = vq.j.a(right);
                                cVar.f231835n = vq.j.a(b0Var);
                                cVar.f231836p = vq.j.a(result3);
                                cVar.f231837q = vq.j.a(offsetDateTimeA3);
                                cVar.f231838r = bVar4;
                                cVar.f231839s = i45;
                                cVar.f231840t = i37;
                                cVar.f231841v = i38;
                                cVar.f231842w = i18;
                                cVar.f231843x = i19;
                                cVar.f231844y = i35;
                                cVar.f231845z = i46;
                                cVar.A = i611;
                                cVar.B = i39;
                                cVar.C = 0;
                                cVar.D = 0;
                                cVar.G = 4;
                                objC2 = aVar6.a(jWSHeaderData3, jWSPayloadData3, jWSSignerData3, cVar);
                                if (objC2 == obj2) {
                                    return obj2;
                                }
                                bVar5 = bVar4;
                                right = new i.Right(c0.g((String) bVar4.a((i) objC2)));
                                bVar4 = bVar5;
                            }
                            bVar = bVar4;
                        }
                    }
                    if (right instanceof i.Left) {
                        if (right instanceof i.Right) {
                            return new i.Right((b0) ((i.Right) right).b());
                        }
                        throw new p();
                    }
                    bVar.b(new dx.b.Generic(new Exception("Bundle id for main identity is null")));
                    throw new g();
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
        }
    }
}
