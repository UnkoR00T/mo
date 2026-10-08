package ha3;

import dx.i;
import fr.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import z93.Place;
import z93.PlaceDetails;
import z93.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lha3/b;", "", "Lha3/b$a;", "Lz93/c;", "Lx93/c;", "placesInteractor", "<init>", "(Lx93/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lha3/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lx93/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x93.c placesInteractor;

    /* JADX INFO: renamed from: ha3.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lha3/b$a;", "Lgz/b$a;", "Lz93/e;", "placeId", "Lz93/h;", "sessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String placeId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionToken;

        public /* synthetic */ Params(String str, String str2, k kVar) {
            this(str, str2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPlaceId() {
            return this.placeId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return z93.e.b(this.placeId, params.placeId) && h.b(this.sessionToken, params.sessionToken);
        }

        public int hashCode() {
            return (z93.e.c(this.placeId) * 31) + h.c(this.sessionToken);
        }

        public String toString() {
            return "Params(placeId=" + ((Object) z93.e.d(this.placeId)) + ", sessionToken=" + ((Object) h.d(this.sessionToken)) + ')';
        }

        private Params(String str, String str2) {
            this.placeId = str;
            this.sessionToken = str2;
        }
    }

    /* JADX INFO: renamed from: ha3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1897b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f82554d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f82555e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f82557g;

        C1897b(tq.e<? super C1897b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f82555e = obj;
            this.f82557g |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    public b(x93.c cVar) {
        this.placesInteractor = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super i<? extends dx.b, Place>> eVar) throws Throwable {
        C1897b c1897b;
        if (eVar instanceof C1897b) {
            c1897b = (C1897b) eVar;
            int i15 = c1897b.f82557g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1897b.f82557g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c1897b = new C1897b(eVar);
            }
        } else {
            c1897b = new C1897b(eVar);
        }
        Object objC = c1897b.f82555e;
        Object objE = uq.b.e();
        int i16 = c1897b.f82557g;
        if (i16 == 0) {
            u.b(objC);
            x93.c cVar = this.placesInteractor;
            String placeId = params.getPlaceId();
            String sessionToken = params.getSessionToken();
            c1897b.f82554d = j.a(params);
            c1897b.f82557g = 1;
            objC = cVar.c(placeId, sessionToken, c1897b);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(fa3.b.b((PlaceDetails) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
