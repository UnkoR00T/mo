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
import pq.v0;
import sd1.i0;
import tq.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lqd1/a;", "Lgz/b;", "Lqd1/a$a;", "", "Lsd1/i0;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "Lhz/d;", "validatorCondition", "<init>", "(Lmx/c;Lhz/i;Lhz/d;)V", "Lhz/h;", "e", "()Lhz/h;", "", "emailToCompare", "f", "(Ljava/lang/String;)Lhz/h;", "d", "()Lhz/d;", "params", "g", "(Lqd1/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lhz/i;", "c", "Lhz/d;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, Map<i0, ? extends g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d validatorCondition;

    /* JADX INFO: renamed from: qd1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lqd1/a$a;", "Lgz/b$a;", "", "email", "repeatedEmail", "", "consent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String repeatedEmail;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean consent;

        public Params(String str, String str2, boolean z15) {
            this.email = str;
            this.repeatedEmail = str2;
            this.consent = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getConsent() {
            return this.consent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRepeatedEmail() {
            return this.repeatedEmail;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.email, params.email) && t.c(this.repeatedEmail, params.repeatedEmail) && this.consent == params.consent;
        }

        public int hashCode() {
            return (((this.email.hashCode() * 31) + this.repeatedEmail.hashCode()) * 31) + Boolean.hashCode(this.consent);
        }

        public String toString() {
            return "Params(email=" + this.email + ", repeatedEmail=" + this.repeatedEmail + ", consent=" + this.consent + ')';
        }
    }

    public a(c cVar, i iVar, d dVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
        this.validatorCondition = dVar;
    }

    private final d d() {
        return this.validatorCondition.e(this.labelProvider.c(ha1.a.f82403g0));
    }

    private final h e() {
        return this.validatorTextFactory.a().y(50, this.labelProvider.e(ha1.a.f82521w, "50")).M(this.labelProvider.c(ha1.a.f82459n0)).A(this.labelProvider.c(ha1.a.f82451m0));
    }

    private final h f(String emailToCompare) {
        return this.validatorTextFactory.a().y(50, this.labelProvider.e(ha1.a.f82521w, "50")).M(this.labelProvider.c(ha1.a.f82459n0)).A(this.labelProvider.c(ha1.a.f82451m0)).i(emailToCompare, this.labelProvider.c(ha1.a.f82516v1));
    }

    public Object g(Params params, e<? super Map<i0, ? extends g>> eVar) {
        return v0.l(y.a(i0.EMAIL, e().a(params.getEmail())), y.a(i0.EMAIL_REPEATED, f(params.getEmail()).a(params.getRepeatedEmail())), y.a(i0.CONSENT, d().a(vq.b.a(params.getConsent()))));
    }
}
