package qb1;

import fr.t;
import fu.o;
import hz.g;
import hz.h;
import hz.i;
import iy.c0;
import java.util.Map;
import mx.Label;
import mx.c;
import nc1.g0;
import oq.k;
import oq.l;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import tq.e;
import u70.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001b2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0003\u0014\u0017\u0011B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, d2 = {"Lqb1/b;", "Lgz/b;", "Lqb1/b$c;", "", "Lnc1/g0;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "Lj14/o;", "checkPolishPostalCodeCorrectUC", "<init>", "(Lmx/c;Lhz/i;Lj14/o;)V", "params", "f", "(Lqb1/b$c;Ltq/e;)Ljava/lang/Object;", "a", "Lj14/o;", "Lhz/h;", "b", "Lhz/h;", "cityValidator", "c", "postOfficeNameValidator", "d", "boxNumber", "e", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, Map<g0, ? extends g>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f165879f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final k<o> f165880g = l.a(new er.a() { // from class: qb1.a
        @Override // er.a
        public final Object a() {
            return b.g();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j14.o checkPolishPostalCodeCorrectUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h cityValidator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h postOfficeNameValidator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h boxNumber;

    /* JADX INFO: renamed from: qb1.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqb1/b$a;", "", "<init>", "()V", "Lfu/o;", "noSpecialCharExceptDashRegex$delegate", "Loq/k;", "b", "()Lfu/o;", "noSpecialCharExceptDashRegex", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final o b() {
            return (o) b.f165880g.getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: qb1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqb1/b$b;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "b", "Lmx/a;", "a", "()Lmx/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C4142b implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l0 f165885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public C4142b(Label label) {
            this.f165885a = new l0(label, b.INSTANCE.b());
            this.errorMessage = label;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getErrorMessage() {
            return this.errorMessage;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(String value) {
            return this.f165885a.b(value);
        }
    }

    /* JADX INFO: renamed from: qb1.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0018"}, d2 = {"Lqb1/b$c;", "Lgz/b$a;", "", "city", "postalCode", "postOfficeName", "boxNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String city;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String postalCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String postOfficeName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String boxNumber;

        public Params(String str, String str2, String str3, String str4) {
            this.city = str;
            this.postalCode = str2;
            this.postOfficeName = str3;
            this.boxNumber = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBoxNumber() {
            return this.boxNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPostOfficeName() {
            return this.postOfficeName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.city, params.city) && t.c(this.postalCode, params.postalCode) && t.c(this.postOfficeName, params.postOfficeName) && t.c(this.boxNumber, params.boxNumber);
        }

        public int hashCode() {
            return (((((this.city.hashCode() * 31) + this.postalCode.hashCode()) * 31) + this.postOfficeName.hashCode()) * 31) + this.boxNumber.hashCode();
        }

        public String toString() {
            return "Params(city=" + this.city + ", postalCode=" + this.postalCode + ", postOfficeName=" + this.postOfficeName + ", boxNumber=" + this.boxNumber + ')';
        }
    }

    public b(c cVar, i iVar, j14.o oVar) {
        this.checkPolishPostalCodeCorrectUC = oVar;
        hz.c.Companion companion = hz.c.INSTANCE;
        this.cityValidator = (h) companion.a(iVar.a().M(cVar.c(ha1.a.f82435k0)).y(50, cVar.c(ha1.a.f82487r0)), new C4142b(cVar.c(ha1.a.f82473p0)));
        this.postOfficeNameValidator = (h) companion.a(iVar.a().M(cVar.c(ha1.a.f82437k2)).O(3, cVar.c(ha1.a.f82494s0)).y(50, cVar.c(ha1.a.f82487r0)), new C4142b(cVar.c(ha1.a.f82473p0)));
        this.boxNumber = iVar.a().M(cVar.c(ha1.a.f82397f2)).y(4, cVar.c(ha1.a.f82405g2)).O(1, cVar.c(ha1.a.f82405g2)).u(cVar.c(ha1.a.f82405g2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o g() {
        return new o("^(?!.*[~!@#$%^&*()_=+|\\[{\\]}€;:'\"/,<.>\\\\?]).*$");
    }

    public Object f(Params params, e<? super Map<g0, ? extends g>> eVar) {
        return v0.l(y.a(g0.CITY, this.cityValidator.a(params.getCity())), y.a(g0.POST_OFFICE, this.postOfficeNameValidator.a(params.getPostOfficeName())), y.a(g0.POSTAL_CODE, this.checkPolishPostalCodeCorrectUC.a(new j14.o.Params(c0.g(params.getPostalCode()), false, 2, null))), y.a(g0.BOX_NUMBER, this.boxNumber.a(params.getBoxNumber())));
    }
}
