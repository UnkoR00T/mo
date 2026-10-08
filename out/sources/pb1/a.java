package pb1;

import fr.k;
import fr.t;
import fu.r;
import gz.b;
import hc1.t0;
import hz.g;
import hz.h;
import hz.i;
import java.util.Map;
import mx.c;
import oq.y;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import pq.v0;
import tq.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0002\u0013\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0019"}, d2 = {"Lpb1/a;", "Lgz/b;", "Lpb1/a$b;", "", "Lhc1/t0;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "d", "(Lpb1/a$b;Ltq/e;)Ljava/lang/Object;", "Lhz/h;", "a", "Lhz/h;", "emailValidator", "b", "phonePrefixValidator", "c", "phoneNumberValidator", "websiteValidator", "e", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b<Params, Map<t0, ? extends g>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C3812a f154052e = new C3812a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f154053f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h emailValidator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h phonePrefixValidator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h phoneNumberValidator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h websiteValidator;

    /* JADX INFO: renamed from: pb1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lpb1/a$a;", "", "<init>", "()V", "", "EMAIL_MAX_LENGTH", "I", "PHONE_PREFIX_MAX_LENGTH", "PHONE_NUMBER_MAX_LENGTH", "WEBSITE_MAX_LENGTH", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C3812a {
        public /* synthetic */ C3812a(k kVar) {
            this();
        }

        private C3812a() {
        }
    }

    /* JADX INFO: renamed from: pb1.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lpb1/a$b;", "Lgz/b$a;", "", "email", "countryCode", "phoneNumber", "website", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phoneNumber;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String website;

        public Params(String str, String str2, String str3, String str4) {
            this.email = str;
            this.countryCode = str2;
            this.phoneNumber = str3;
            this.website = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getWebsite() {
            return this.website;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.email, params.email) && t.c(this.countryCode, params.countryCode) && t.c(this.phoneNumber, params.phoneNumber) && t.c(this.website, params.website);
        }

        public int hashCode() {
            return (((((this.email.hashCode() * 31) + this.countryCode.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.website.hashCode();
        }

        public String toString() {
            return "Params(email=" + this.email + ", countryCode=" + this.countryCode + ", phoneNumber=" + this.phoneNumber + ", website=" + this.website + ')';
        }
    }

    public a(c cVar, i iVar) {
        this.emailValidator = iVar.a().y(50, cVar.e(ha1.a.f82521w, "50")).M(cVar.c(ha1.a.f82459n0)).A(cVar.c(ha1.a.f82451m0));
        this.phonePrefixValidator = iVar.a().C(cVar.c(ha1.a.f82443l0)).y(5, cVar.c(ha1.a.f82443l0));
        this.phoneNumberValidator = iVar.a().u(cVar.c(ha1.a.f82480q0)).m(9, cVar.c(ha1.a.f82480q0));
        this.websiteValidator = iVar.a().y(GF2Field.MASK, cVar.e(ha1.a.f82521w, "255")).q(cVar.c(ha1.a.f82412h1)).p(cVar.c(ha1.a.f82412h1));
    }

    public Object d(Params params, e<? super Map<t0, ? extends g>> eVar) {
        return v0.l(y.a(t0.EMAIL, this.emailValidator.a(params.getEmail())), y.a(t0.COUNTRY_CODE, r.t0(params.getPhoneNumber()) ? g.b.f86853b : this.phonePrefixValidator.a(params.getCountryCode())), y.a(t0.PHONE_NUMBER, r.t0(params.getPhoneNumber()) ? g.b.f86853b : this.phoneNumberValidator.a(params.getPhoneNumber())), y.a(t0.WEBSITE, r.t0(params.getWebsite()) ? g.b.f86853b : this.websiteValidator.a(params.getWebsite())));
    }
}
