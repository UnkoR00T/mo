package t73;

import fp0.h;
import fr.k;
import fr.t;
import hz.g;
import iy.b0;
import oq.p;
import p071kotlin.Metadata;
import q73.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lt73/b;", "Lgz/a;", "Lt73/b$a;", "Lhz/b;", "Lq73/b;", "validator", "Lq73/e;", "validatorWithDashes", "<init>", "(Lq73/b;Lq73/e;)V", "params", "b", "(Lt73/b$a;)Lhz/b;", "a", "Lq73/b;", "Lq73/e;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.a<Params, hz.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q73.b validator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e validatorWithDashes;

    /* JADX INFO: renamed from: t73.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lt73/b$a;", "Lgz/b$a;", "Lfp0/h;", "qrCode", "", "withDashesPattern", "<init>", "(Liy/b0;ZLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Z", "()Z", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f188822c = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 qrCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean withDashesPattern;

        public /* synthetic */ Params(b0 b0Var, boolean z15, k kVar) {
            this(b0Var, z15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getQrCode() {
            return this.qrCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getWithDashesPattern() {
            return this.withDashesPattern;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return h.d(this.qrCode, params.qrCode) && this.withDashesPattern == params.withDashesPattern;
        }

        public int hashCode() {
            return (h.f(this.qrCode) * 31) + Boolean.hashCode(this.withDashesPattern);
        }

        public String toString() {
            return "Params(qrCode=" + ((Object) h.h(this.qrCode)) + ", withDashesPattern=" + this.withDashesPattern + ')';
        }

        private Params(b0 b0Var, boolean z15) {
            this.qrCode = b0Var;
            this.withDashesPattern = z15;
        }
    }

    public b(q73.b bVar, e eVar) {
        this.validator = bVar;
        this.validatorWithDashes = eVar;
    }

    public hz.b b(Params params) {
        g gVarG = params.getWithDashesPattern() ? this.validatorWithDashes.g(params.getQrCode()) : this.validator.c(params.getQrCode());
        if (gVarG instanceof g.Invalid) {
            return new hz.b.Invalid(((g.Invalid) gVarG).b().getErrorMessage());
        }
        if (t.c(gVarG, g.b.f86853b)) {
            return hz.b.d.f86848c;
        }
        throw new p();
    }
}
