package hm2;

import fr.t;
import oq.p;
import p071kotlin.Metadata;
import xl2.q5;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0016\u000f\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lhm2/f;", "Lgz/b;", "Lhm2/f$c;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/h;", "validatorText", "<init>", "(Lmx/c;Lhz/h;)V", "params", "e", "(Lhm2/f$c;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lhz/h;", "Lhm2/f$b;", "", "d", "(Lhm2/f$b;)I", "emptyLabelResId", "c", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.b<Params, hz.g> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f85744d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.h validatorText;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lhm2/f$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        FRAUD,
        WEBSITE,
        OTHER;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f85751e = wq.b.a(b());
    }

    /* JADX INFO: renamed from: hm2.f$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lhm2/f$c;", "Lgz/b$a;", "", "issueDescription", "Lhm2/f$b;", "descriptionType", "<init>", "(Ljava/lang/String;Lhm2/f$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lhm2/f$b;", "()Lhm2/f$b;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String issueDescription;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b descriptionType;

        public Params(String str, b bVar) {
            this.issueDescription = str;
            this.descriptionType = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getDescriptionType() {
            return this.descriptionType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIssueDescription() {
            return this.issueDescription;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.issueDescription, params.issueDescription) && this.descriptionType == params.descriptionType;
        }

        public int hashCode() {
            return (this.issueDescription.hashCode() * 31) + this.descriptionType.hashCode();
        }

        public String toString() {
            return "Params(issueDescription=" + this.issueDescription + ", descriptionType=" + this.descriptionType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85754a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.FRAUD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.WEBSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f85754a = iArr;
        }
    }

    public f(mx.c cVar, hz.h hVar) {
        this.labelProvider = cVar;
        this.validatorText = hVar;
    }

    private final int d(b bVar) {
        int i15 = d.f85754a[bVar.ordinal()];
        if (i15 == 1) {
            return q5.f219563o0;
        }
        if (i15 == 2) {
            return q5.f219576v;
        }
        if (i15 == 3) {
            return q5.f219577v0;
        }
        throw new p();
    }

    public Object e(Params params, tq.e<? super hz.g> eVar) {
        return this.validatorText.M(this.labelProvider.c(d(params.getDescriptionType()))).O(10, this.labelProvider.e(q5.f219578w, "10")).a(params.getIssueDescription());
    }
}
