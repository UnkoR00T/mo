package qd1;

import fr.t;
import hz.d;
import hz.g;
import hz.h;
import hz.i;
import java.util.Map;
import mx.c;
import oq.y;
import p071kotlin.Metadata;
import pd1.NonPublicSupplier;
import pq.v0;
import tq.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lqd1/b;", "Lgz/b;", "Lqd1/b$a;", "", "Lud1/a;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "Lhz/d;", "conditionValidator", "<init>", "(Lmx/c;Lhz/i;Lhz/d;)V", "Lhz/h;", "d", "()Lhz/h;", "e", "()Lhz/d;", "params", "f", "(Lqd1/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lhz/i;", "c", "Lhz/d;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, Map<ud1.a, ? extends g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d conditionValidator;

    /* JADX INFO: renamed from: qd1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lqd1/b$a;", "Lgz/b$a;", "", "address", "Lpd1/a;", "provider", "<init>", "(Ljava/lang/String;Lpd1/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lpd1/a;", "()Lpd1/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String address;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final NonPublicSupplier provider;

        public Params(String str, NonPublicSupplier nonPublicSupplier) {
            this.address = str;
            this.provider = nonPublicSupplier;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final NonPublicSupplier getProvider() {
            return this.provider;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.address, params.address) && t.c(this.provider, params.provider);
        }

        public int hashCode() {
            int iHashCode = this.address.hashCode() * 31;
            NonPublicSupplier nonPublicSupplier = this.provider;
            return iHashCode + (nonPublicSupplier == null ? 0 : nonPublicSupplier.hashCode());
        }

        public String toString() {
            return "Params(address=" + this.address + ", provider=" + this.provider + ')';
        }
    }

    public b(c cVar, i iVar, d dVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
        this.conditionValidator = dVar;
    }

    private final h d() {
        return this.validatorTextFactory.a().M(this.labelProvider.c(ha1.a.f82436k1)).k(this.labelProvider.c(ha1.a.f82444l1));
    }

    private final d e() {
        return this.conditionValidator.e(this.labelProvider.c(ha1.a.f82418i));
    }

    public Object f(Params params, e<? super Map<ud1.a, ? extends g>> eVar) {
        return v0.l(y.a(ud1.a.ADDRESS, d().a(params.getAddress())), y.a(ud1.a.PROVIDER, e().a(vq.b.a(params.getProvider() != null))));
    }
}
