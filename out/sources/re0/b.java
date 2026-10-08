package re0;

import dx.i;
import fr.t;
import k80.k;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lre0/b;", "", "Lre0/b$a;", "Loq/i0;", "Ll80/c;", "getVerificationSessionStatusUC", "Lmx/c;", "labelProvider", "<init>", "(Ll80/c;Lmx/c;)V", "", "sessionUuid", "", "maxRetries", "", "delayMillis", "Ldx/i;", "Ldx/b;", "e", "(Ljava/lang/String;IJLtq/e;)Ljava/lang/Object;", "params", "g", "(Lre0/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Ll80/c;", "Ldx/b$c;", "b", "Ldx/b$c;", "verificationStatusLimitExceeded", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l80.c getVerificationSessionStatusUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business verificationStatusLimitExceeded;

    /* JADX INFO: renamed from: re0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lre0/b$a;", "Lgz/b$a;", "", "sessionUuid", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: re0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4426b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173367a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.VERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f173367a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f173368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f173369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f173370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f173371g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f173372h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f173374k;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173372h = obj;
            this.f173374k |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, 0, 0L, this);
        }
    }

    public b(l80.c cVar, mx.c cVar2) {
        this.getVerificationSessionStatusUC = cVar;
        this.verificationStatusLimitExceeded = new dx.b.Business(qe0.a.VERIFICATION_STATUS_LIMIT_EXCEEDED, null, cVar2.c(oe0.a.f145021b), cVar2.c(oe0.a.A), null, cVar2.c(oe0.a.f145028i), cVar2.c(oe0.a.f145020a), 18, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        if (ju.z0.b(r10, r0) == r1) goto L43;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e1 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r10, int r11, long r12, tq.e<? super dx.i<? extends dx.b, oq.i0>> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: re0.b.e(java.lang.String, int, long, tq.e):java.lang.Object");
    }

    static /* synthetic */ Object f(b bVar, String str, int i15, long j15, tq.e eVar, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = 10;
        }
        int i17 = i15;
        if ((i16 & 4) != 0) {
            j15 = 1000;
        }
        return bVar.e(str, i17, j15, eVar);
    }

    public Object g(Params params, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return f(this, params.getSessionUuid(), 0, 0L, eVar, 6, null);
    }
}
