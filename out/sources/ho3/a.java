package ho3;

import dx.i;
import fr.t;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lho3/a;", "", "Lho3/a$b;", "Loq/i0;", "Len0/d;", "fetchVerificationSessionStatusUC", "Lmx/c;", "labelProvider", "<init>", "(Len0/d;Lmx/c;)V", "", "sessionUuid", "", "timeStep", "", "maxAttempts", "Ldx/i;", "Ldx/b;", "e", "(Ljava/lang/String;JILtq/e;)Ljava/lang/Object;", "params", "g", "(Lho3/a$b;Ltq/e;)Ljava/lang/Object;", "a", "Len0/d;", "Ldx/b$c;", "b", "Ldx/b$c;", "verificationStatusLimitExceeded", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f85990d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final en0.d fetchVerificationSessionStatusUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business verificationStatusLimitExceeded;

    /* JADX INFO: renamed from: ho3.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lho3/a$b;", "Lgz/b$a;", "", "sessionUuid", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionUuid;

        public Params(String str) {
            this.sessionUuid = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSessionUuid() {
            return this.sessionUuid;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.sessionUuid, ((Params) other).sessionUuid);
        }

        public int hashCode() {
            return this.sessionUuid.hashCode();
        }

        public String toString() {
            return "Params(sessionUuid=" + this.sessionUuid + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85994a;

        static {
            int[] iArr = new int[dn0.f.values().length];
            try {
                iArr[dn0.f.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dn0.f.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dn0.f.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f85994a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85996e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f85997f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f85998g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f85999h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f86000j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f86001k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f86002l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f86003m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f86005p;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86003m = obj;
            this.f86005p |= PKIFailureInfo.systemUnavail;
            return a.this.e(null, 0L, 0, this);
        }
    }

    public a(en0.d dVar, mx.c cVar) {
        this.fetchVerificationSessionStatusUC = dVar;
        this.verificationStatusLimitExceeded = new dx.b.Business(co3.a.VERIFICATION_STATUS_LIMIT_EXCEEDED, null, cVar.c(un3.b.M), cVar.c(un3.b.f199448l1), null, cVar.c(un3.b.f199476r), cVar.c(un3.b.f199406d), 18, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0104, code lost:
    
        if (ju.z0.b(r12, r0) == r1) goto L45;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0104 -> B:13:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r11, long r12, int r14, tq.e<? super dx.i<? extends dx.b, oq.i0>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ho3.a.e(java.lang.String, long, int, tq.e):java.lang.Object");
    }

    static /* synthetic */ Object f(a aVar, String str, long j15, int i15, tq.e eVar, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            j15 = 1000;
        }
        long j16 = j15;
        if ((i16 & 4) != 0) {
            i15 = 10;
        }
        return aVar.e(str, j16, i15, eVar);
    }

    public Object g(Params params, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return f(this, params.getSessionUuid(), 0L, 0, eVar, 6, null);
    }
}
