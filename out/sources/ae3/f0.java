package ae3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000b\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lae3/f0;", "Lgz/a;", "Lae3/f0$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "b", "(Lae3/f0$b;)Lhz/g;", "Lhz/h;", "a", "Lhz/h;", "validator", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 implements gz.a<Params, hz.g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5737c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f5738d = md3.b.f125773m1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f5739e = md3.b.f125781n1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hz.h validator;

    /* JADX INFO: renamed from: ae3.f0$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lae3/f0$b;", "Lgz/b$a;", "Liy/b0;", "registrationNumber", "<init>", "(Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5741b = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 registrationNumber;

        public Params(iy.b0 b0Var) {
            this.registrationNumber = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iy.b0 getRegistrationNumber() {
            return this.registrationNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.registrationNumber, ((Params) other).registrationNumber);
        }

        public int hashCode() {
            return this.registrationNumber.hashCode();
        }

        public String toString() {
            return "Params(registrationNumber=" + this.registrationNumber + ')';
        }
    }

    public f0(mx.c cVar, hz.i iVar) {
        hz.h hVarM = iVar.a().M(cVar.c(f5738d));
        int i15 = f5739e;
        this.validator = hVarM.O(4, cVar.c(i15)).y(9, cVar.c(i15)).B(cVar.c(i15)).J(cVar.c(i15));
    }

    public hz.g b(Params params) {
        return this.validator.a(iy.c0.e(params.getRegistrationNumber()));
    }
}
