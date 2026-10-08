package x21;

import fr.t;
import hz.g;
import iy.b0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lx21/d;", "Lgz/a;", "Lx21/d$a;", "Lhz/g;", "Lx21/b;", "isPlateCorrectUC", "Lx21/c;", "isVinCorrectUC", "Lx21/a;", "isInsuranceCorrectUC", "<init>", "(Lx21/b;Lx21/c;Lx21/a;)V", "params", "b", "(Lx21/d$a;)Lhz/g;", "a", "Lx21/b;", "Lx21/c;", "c", "Lx21/a;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.a<Params, g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x21.b isPlateCorrectUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c isVinCorrectUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a isInsuranceCorrectUC;

    /* JADX INFO: renamed from: x21.d$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lx21/d$a;", "Lgz/b$a;", "Lw21/a;", "type", "Liy/b0;", "value", "<init>", "(Lw21/a;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw21/a;", "()Lw21/a;", "b", "Liy/b0;", "()Liy/b0;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f216596c = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final w21.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 value;

        public Params(w21.a aVar, b0 b0Var) {
            this.type = aVar;
            this.value = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final w21.a getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.type == params.type && t.c(this.value, params.value);
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Params(type=" + this.type + ", value=" + this.value + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f216599a;

        static {
            int[] iArr = new int[w21.a.values().length];
            try {
                iArr[w21.a.PLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w21.a.VIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w21.a.INSURANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f216599a = iArr;
        }
    }

    public d(x21.b bVar, c cVar, a aVar) {
        this.isPlateCorrectUC = bVar;
        this.isVinCorrectUC = cVar;
        this.isInsuranceCorrectUC = aVar;
    }

    public g b(Params params) {
        int i15 = b.f216599a[params.getType().ordinal()];
        if (i15 == 1) {
            return this.isPlateCorrectUC.b(new x21.b.Params(params.getValue()));
        }
        if (i15 == 2) {
            return this.isVinCorrectUC.b(new c.Params(params.getValue()));
        }
        if (i15 == 3) {
            return this.isInsuranceCorrectUC.c(new a.Params(params.getValue()));
        }
        throw new p();
    }
}
