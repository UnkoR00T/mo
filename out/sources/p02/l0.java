package p02;

import eo0.OwnerAddress;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lp02/l0;", "Lgz/b;", "Lp02/l0$a;", "Loq/i0;", "Lj02/a;", "dataSource", "<init>", "(Lj02/a;)V", "params", "d", "(Lp02/l0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lj02/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 implements gz.b<Params, oq.i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j02.a dataSource;

    /* JADX INFO: renamed from: p02.l0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp02/l0$a;", "Lgz/b$a;", "Leo0/j0;", "address", "<init>", "(Leo0/j0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/j0;", "()Leo0/j0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OwnerAddress address;

        public Params(OwnerAddress ownerAddress) {
            this.address = ownerAddress;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final OwnerAddress getAddress() {
            return this.address;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.address, ((Params) other).address);
        }

        public int hashCode() {
            OwnerAddress ownerAddress = this.address;
            if (ownerAddress == null) {
                return 0;
            }
            return ownerAddress.hashCode();
        }

        public String toString() {
            return "Params(address=" + this.address + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f151212e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f151214g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151212e = obj;
            this.f151214g |= PKIFailureInfo.systemUnavail;
            return l0.this.d(null, this);
        }
    }

    public l0(j02.a aVar) {
        this.dataSource = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super oq.i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f151214g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f151214g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f151212e;
        Object objE = uq.b.e();
        int i16 = bVar.f151214g;
        if (i16 == 0) {
            oq.u.b(obj);
            j02.a aVar = this.dataSource;
            OwnerAddress address = params.getAddress();
            bVar.f151211d = vq.j.a(params);
            bVar.f151214g = 1;
            if (aVar.m(address, bVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return oq.i0.f148189a;
    }
}
