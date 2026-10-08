package ae3;

import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lae3/a;", "Lgz/b;", "Lae3/a$a;", "Loq/i0;", "Lz04/a;", "fileStorageRepository", "Lzd3/a;", "collisionStorageRepository", "Lvd3/a;", "vehicleCollisionContainersInteractor", "<init>", "(Lz04/a;Lzd3/a;Lvd3/a;)V", "params", "d", "(Lae3/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lz04/a;", "b", "Lzd3/a;", "c", "Lvd3/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z04.a fileStorageRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zd3.a collisionStorageRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vd3.a vehicleCollisionContainersInteractor;

    /* JADX INFO: renamed from: ae3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lae3/a$a;", "Lgz/b$a;", "Lsv0/y;", "processId", "<init>", "(Lsv0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "()Lsv0/y;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        public Params(ProcessId processId) {
            this.processId = processId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.processId, ((Params) other).processId);
        }

        public int hashCode() {
            return this.processId.hashCode();
        }

        public String toString() {
            return "Params(processId=" + this.processId + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5634g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5635h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5636j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5637k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f5638l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f5639m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5640n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5641p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5642q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f5643r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f5645t;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5643r = obj;
            this.f5645t |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(z04.a aVar, zd3.a aVar2, vd3.a aVar3) {
        this.fileStorageRepository = aVar;
        this.collisionStorageRepository = aVar2;
        this.vehicleCollisionContainersInteractor = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[LOOP:0: B:86:0x023c->B:116:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:79:0x0203  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:85:0x0219  */
    /* JADX WARN: Code duplicated, block: B:88:0x0242  */
    /* JADX WARN: Code duplicated, block: B:92:0x0289 A[PHI: r15
      0x0289: PHI (r15v3 ae3.a$a) = (r15v2 ae3.a$a), (r15v4 ae3.a$a) binds: [B:84:0x0217, B:91:0x0288] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0292  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b7  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02d6, code lost:
    
        if (r0.d(r5, r3) == r4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02b1, code lost:
    
        if (r0.d(r5, r3) == r4) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0086: MOVE (r2 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:19:0x0086 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x008a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:21:0x008a */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x008e: MOVE (r2 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:23:0x008e */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(ae3.a.Params r18, tq.e<? super oq.i0> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae3.a.d(ae3.a$a, tq.e):java.lang.Object");
    }
}
