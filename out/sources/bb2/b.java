package bb2;

import fr.t;
import fu.r;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;
import pq.v;
import tq.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lbb2/b;", "Lgz/b;", "Lbb2/b$a;", "Liy/b0;", "<init>", "()V", "params", "d", "(Lbb2/b$a;Ltq/e;)Ljava/lang/Object;", "a", "idcardcollecting_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, b0> {

    /* JADX INFO: renamed from: bb2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbb2/b$a;", "Lgz/b$a;", "Liy/b0;", "applicationNumber", "<init>", "(Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "idcardcollecting_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f18061b = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 applicationNumber;

        public Params(b0 b0Var) {
            this.applicationNumber = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getApplicationNumber() {
            return this.applicationNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.applicationNumber, ((Params) other).applicationNumber);
        }

        public int hashCode() {
            return this.applicationNumber.hashCode();
        }

        public String toString() {
            return "Params(applicationNumber=" + this.applicationNumber + ')';
        }
    }

    public Object d(Params params, e<? super b0> eVar) {
        String strE = c0.e(params.getApplicationNumber());
        return c0.g(v.v0(v.q(r.H1(strE, 7), r.A1(r.H1(strE, 11), 7), r.A1(r.H1(strE, 18), 11), r.A1(r.H1(strE, 20), 18)), "/", null, null, 0, null, null, 62, null));
    }
}
