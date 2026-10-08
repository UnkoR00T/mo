package q03;

import fr.k;
import fu.r;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq03/c;", "Lgz/b;", "Lq03/c$a;", "Lm03/a;", "Ln03/a;", "checkPlateNumberCorrectUC", "<init>", "(Ln03/a;)V", "params", "d", "(Lq03/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Ln03/a;", "getCheckPlateNumberCorrectUC", "()Ln03/a;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b<Params, m03.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n03.a checkPlateNumberCorrectUC;

    /* JADX INFO: renamed from: q03.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lq03/c$a;", "Lgz/b$a;", "Luv0/d;", "plateNumber", "<init>", "(Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String plateNumber;

        public /* synthetic */ Params(String str, k kVar) {
            this(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPlateNumber() {
            return this.plateNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && uv0.d.e(this.plateNumber, ((Params) other).plateNumber);
        }

        public int hashCode() {
            return uv0.d.f(this.plateNumber);
        }

        public String toString() {
            return "Params(plateNumber=" + ((Object) uv0.d.h(this.plateNumber)) + ')';
        }

        private Params(String str) {
            this.plateNumber = str;
        }
    }

    public c(n03.a aVar) {
        this.checkPlateNumberCorrectUC = aVar;
    }

    public Object d(Params params, tq.e<? super m03.a> eVar) {
        return !d.f163531a.matcher(params.getPlateNumber()).find() ? m03.a.INCORRECT : this.checkPlateNumberCorrectUC.c(new n03.a.Params(p03.a.a(uv0.d.c(r.R(params.getPlateNumber(), " ", "", false, 4, null))), true, null), eVar);
    }
}
