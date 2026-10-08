package ob1;

import fr.t;
import fu.r;
import hz.h;
import hz.i;
import oq.k;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u0017B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lob1/d;", "Lgz/b;", "Lob1/d$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "Lhz/d;", "validatorCondition", "<init>", "(Lmx/c;Lhz/i;Lhz/d;)V", "params", "i", "(Lob1/d$b;)Lhz/g;", "h", "", "numberOfEmployees", "", "g", "(Ljava/lang/String;)Z", "f", "(Lob1/d$b;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lhz/i;", "c", "Lhz/d;", "Lhz/h;", "d", "Loq/k;", "e", "()Lhz/h;", "textValidator", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b<Params, hz.g> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f144229e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f144230f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hz.d validatorCondition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k textValidator = l.a(new er.a() { // from class: ob1.c
        @Override // er.a
        public final Object a() {
            return d.j(this.f144228a);
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lob1/d$a;", "", "<init>", "()V", "", "MAX_LENGTH", "I", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ob1.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lob1/d$b;", "Lgz/b$a;", "", "numberOfEmployees", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String numberOfEmployees;

        public Params(String str) {
            this.numberOfEmployees = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNumberOfEmployees() {
            return this.numberOfEmployees;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.numberOfEmployees, ((Params) other).numberOfEmployees);
        }

        public int hashCode() {
            return this.numberOfEmployees.hashCode();
        }

        public String toString() {
            return "Params(numberOfEmployees=" + this.numberOfEmployees + ')';
        }
    }

    public d(mx.c cVar, i iVar, hz.d dVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
        this.validatorCondition = dVar;
    }

    private final h e() {
        return (h) this.textValidator.getValue();
    }

    private final boolean g(String numberOfEmployees) {
        Integer numU = r.u(numberOfEmployees);
        return numU != null && numU.intValue() > 0;
    }

    private final hz.g h(Params params) {
        return this.validatorCondition.e(this.labelProvider.c(ha1.a.Y0)).a(Boolean.valueOf(g(params.getNumberOfEmployees())));
    }

    private final hz.g i(Params params) {
        return e().M(this.labelProvider.c(ha1.a.X0)).y(4, this.labelProvider.c(ha1.a.f82487r0)).a(params.getNumberOfEmployees());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h j(d dVar) {
        return dVar.validatorTextFactory.a();
    }

    public Object f(Params params, tq.e<? super hz.g> eVar) {
        hz.g gVarI = i(params);
        hz.g gVarH = h(params);
        if (gVarI instanceof hz.g.Invalid) {
            return gVarI;
        }
        return gVarH instanceof hz.g.Invalid ? gVarH : hz.g.b.f86853b;
    }
}
