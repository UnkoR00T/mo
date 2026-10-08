package z44;

import fr.k;
import fr.t;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lz44/c;", "Lgz/b;", "Lgz/b$a$a;", "Lz44/c$a;", "Lgy/a;", "permissionManager", "<init>", "(Lgy/a;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lgy/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b<gz.b.a.C1792a, Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final gy.a permissionManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f232899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f232900e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f232902g;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232900e = obj;
            this.f232902g |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, this);
        }
    }

    public c(gy.a aVar) {
        this.permissionManager = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, e<? super Result> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f232902g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f232902g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objD = bVar.f232900e;
        Object objE = uq.b.e();
        int i16 = bVar.f232902g;
        k kVar = null;
        int i17 = 2;
        boolean z15 = true;
        boolean z16 = false;
        if (i16 == 0) {
            u.b(objD);
            gy.a aVar = this.permissionManager;
            gy.d dVar = gy.d.EXTERNAL_STORAGE;
            if (t.c(aVar.h(dVar), gy.c.a.f78236a)) {
                return new Result(z15, z16, i17, kVar);
            }
            gy.a aVar2 = this.permissionManager;
            bVar.f232899d = j.a(c1792a);
            bVar.f232902g = 1;
            objD = aVar2.d(dVar, bVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objD);
        }
        gy.c cVar = (gy.c) objD;
        if (t.c(cVar, gy.c.a.f78236a)) {
            return new Result(z15, z16, i17, kVar);
        }
        if (cVar instanceof gy.c.NotGranted) {
            return new Result(false, ((gy.c.NotGranted) cVar).getShouldShowRationale());
        }
        if (t.c(cVar, gy.c.C1774c.f78238a)) {
            return new Result(z16, z16, i17, kVar);
        }
        throw new p();
    }

    /* JADX INFO: renamed from: z44.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lz44/c$a;", "", "", "granted", "shouldShowRationale", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean granted;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowRationale;

        public Result(boolean z15, boolean z16) {
            this.granted = z15;
            this.shouldShowRationale = z16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getGranted() {
            return this.granted;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShouldShowRationale() {
            return this.shouldShowRationale;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return this.granted == result.granted && this.shouldShowRationale == result.shouldShowRationale;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.granted) * 31) + Boolean.hashCode(this.shouldShowRationale);
        }

        public String toString() {
            return "Result(granted=" + this.granted + ", shouldShowRationale=" + this.shouldShowRationale + ')';
        }

        public /* synthetic */ Result(boolean z15, boolean z16, int i15, k kVar) {
            this(z15, (i15 & 2) != 0 ? false : z16);
        }
    }
}
