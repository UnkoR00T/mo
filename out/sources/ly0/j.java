package ly0;

import fr.t;
import java.util.List;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lly0/j;", "", "Lly0/j$a;", "Loq/i0;", "Llh0/i;", "saveFavouritePointsUC", "<init>", "(Llh0/i;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lly0/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Llh0/i;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lh0.i saveFavouritePointsUC;

    /* JADX INFO: renamed from: ly0.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lly0/j$a;", "Lgz/b$a;", "", "", "favouritePointsIdList", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> favouritePointsIdList;

        public Params(List<String> list) {
            this.favouritePointsIdList = list;
        }

        public final List<String> a() {
            return this.favouritePointsIdList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.favouritePointsIdList, ((Params) other).favouritePointsIdList);
        }

        public int hashCode() {
            return this.favouritePointsIdList.hashCode();
        }

        public String toString() {
            return "Params(favouritePointsIdList=" + this.favouritePointsIdList + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f121438e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f121440g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121438e = obj;
            this.f121440g |= PKIFailureInfo.systemUnavail;
            return j.this.d(null, this);
        }
    }

    public j(lh0.i iVar) {
        this.saveFavouritePointsUC = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f121440g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f121440g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f121438e;
        Object objE = uq.b.e();
        int i16 = bVar.f121440g;
        if (i16 == 0) {
            u.b(objC);
            lh0.i iVar = this.saveFavouritePointsUC;
            lh0.i.Params params2 = new lh0.i.Params(params.a());
            bVar.f121437d = vq.j.a(params);
            bVar.f121440g = 1;
            objC = iVar.c(params2, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar2 = (dx.i) objC;
        if (iVar2 instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
        }
        if (iVar2 instanceof dx.i.Right) {
            return iVar2;
        }
        throw new p();
    }
}
