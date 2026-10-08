package z01;

import dx.i;
import fr.t;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.j;
import y01.TrustedProfileAuthorizationStatusResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lz01/c;", "", "Lz01/c$a;", "Lz01/c$b;", "Lw01/b;", "trustedProfileAuthorizationRepository", "Lmx/c;", "labelProvider", "<init>", "(Lw01/b;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lz01/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lw01/b;", "b", "Lmx/c;", "Ldx/b$c;", "c", "Ldx/b$c;", "defaultError", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w01.b trustedProfileAuthorizationRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business defaultError;

    /* JADX INFO: renamed from: z01.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lz01/c$a;", "Lgz/b$a;", "", "authId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authId;

        public Params(String str) {
            this.authId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAuthId() {
            return this.authId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.authId, ((Params) other).authId);
        }

        public int hashCode() {
            return this.authId.hashCode();
        }

        public String toString() {
            return "Params(authId=" + this.authId + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lz01/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        ACTIVE,
        CONFIRMED,
        REJECTED,
        EXPIRED;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f231878f = wq.b.a(b());
    }

    /* JADX INFO: renamed from: z01.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C6227c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f231879a;

        static {
            int[] iArr = new int[y01.d.values().length];
            try {
                iArr[y01.d.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y01.d.CONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y01.d.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y01.d.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[y01.d.NOT_PRESENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[y01.d.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f231879a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f231881e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231883g;

        d(e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231881e = obj;
            this.f231883g |= PKIFailureInfo.systemUnavail;
            return c.this.d(null, this);
        }
    }

    public c(w01.b bVar, mx.c cVar) {
        this.trustedProfileAuthorizationRepository = bVar;
        this.labelProvider = cVar;
        this.defaultError = new dx.b.Business(null, null, cVar.c(do2.a.f43581c), cVar.c(do2.a.f43584f), null, cVar.c(do2.a.f43579a), null, 83, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, e<? super i<? extends dx.b, ? extends b>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f231883g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f231883g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objB = dVar.f231881e;
        Object objE = uq.b.e();
        int i16 = dVar.f231883g;
        if (i16 == 0) {
            u.b(objB);
            w01.b bVar = this.trustedProfileAuthorizationRepository;
            String authId = params.getAuthId();
            dVar.f231880d = j.a(params);
            dVar.f231883g = 1;
            objB = bVar.b(authId, dVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        switch (C6227c.f231879a[((TrustedProfileAuthorizationStatusResponse) ((i.Right) iVar).b()).getStatus().ordinal()]) {
            case 1:
                return new i.Right(b.ACTIVE);
            case 2:
                return new i.Right(b.CONFIRMED);
            case 3:
                return new i.Right(b.REJECTED);
            case 4:
                return new i.Right(b.EXPIRED);
            case 5:
            case 6:
                return new i.Left(this.defaultError);
            default:
                throw new p();
        }
    }
}
