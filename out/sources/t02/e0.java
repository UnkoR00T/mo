package t02;

import java.io.IOException;
import mx.Label;
import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\r\u0014\u000b\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Lt02/e0;", "Lgz/a;", "Lt02/e0$a;", "Lt02/e0$d;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "b", "(Lt02/e0$a;)Lt02/e0$d;", "a", "Lmx/c;", "Lhz/h;", "Lhz/h;", "phonePrefixValidator", "c", "phoneNumberPolishValidator", "d", "phoneNumberGenericValidator", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 implements gz.a<Params, Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.h phonePrefixValidator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hz.h phoneNumberPolishValidator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hz.h phoneNumberGenericValidator;

    /* JADX INFO: renamed from: t02.e0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lt02/e0$a;", "Lgz/b$a;", "Lxw/h;", "phoneNumber", "<init>", "(Lxw/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxw/h;", "()Lxw/h;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f186596b = PhoneNumber.f221634d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PhoneNumber phoneNumber;

        public Params(PhoneNumber phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PhoneNumber getPhoneNumber() {
            return this.phoneNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.phoneNumber, ((Params) other).phoneNumber);
        }

        public int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public String toString() {
            return "Params(phoneNumber=" + this.phoneNumber + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lt02/e0$b;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "a", "Lmx/a;", "()Lmx/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public b(Label label) {
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
            if (value.length() == 0) {
                return true;
            }
            if (value.length() > 5) {
                return false;
            }
            return value.length() <= 4 || fu.r.C1(value) == '+';
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lt02/e0$c;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "a", "Lmx/a;", "()Lmx/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public c(Label label) {
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
            if (value.length() > 1) {
                if (!Character.isDigit(fu.r.C1(value)) && fu.r.C1(value) != '+') {
                    return false;
                }
                int i15 = 0;
                for (int i16 = 0; i16 < value.length(); i16++) {
                    if (value.charAt(i16) == '+') {
                        i15++;
                    }
                }
                if (i15 > 1) {
                    return false;
                }
                if (Character.isDigit(fu.r.C1(value)) && fu.r.c0(value, '+', false, 2, null)) {
                    return false;
                }
                String strA1 = fu.r.A1(value, 1);
                for (int i17 = 0; i17 < strA1.length(); i17++) {
                    if (!Character.isDigit(strA1.charAt(i17))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: t02.e0$d, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lt02/e0$d;", "", "Lhz/g;", "prefixValidatorResponse", "numberValidatorResponse", "<init>", "(Lhz/g;Lhz/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhz/g;", "b", "()Lhz/g;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f186600c = hz.g.f86851a;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.g prefixValidatorResponse;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.g numberValidatorResponse;

        public Result(hz.g gVar, hz.g gVar2) {
            this.prefixValidatorResponse = gVar;
            this.numberValidatorResponse = gVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hz.g getNumberValidatorResponse() {
            return this.numberValidatorResponse;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hz.g getPrefixValidatorResponse() {
            return this.prefixValidatorResponse;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return fr.t.c(this.prefixValidatorResponse, result.prefixValidatorResponse) && fr.t.c(this.numberValidatorResponse, result.numberValidatorResponse);
        }

        public int hashCode() {
            return (this.prefixValidatorResponse.hashCode() * 31) + this.numberValidatorResponse.hashCode();
        }

        public String toString() {
            return "Result(prefixValidatorResponse=" + this.prefixValidatorResponse + ", numberValidatorResponse=" + this.numberValidatorResponse + ')';
        }
    }

    public e0(mx.c cVar, hz.i iVar) {
        this.labelProvider = cVar;
        hz.h hVarA = iVar.a();
        hVarA.g(new b(cVar.c(e02.a.f46583o2)));
        hVarA.g(new c(cVar.c(e02.a.H0)));
        this.phonePrefixValidator = hVarA;
        this.phoneNumberPolishValidator = iVar.a().y(9, cVar.c(e02.a.f46589p2)).u(cVar.c(e02.a.P0));
        this.phoneNumberGenericValidator = iVar.a().y(16, cVar.c(e02.a.f46577n2)).u(cVar.c(e02.a.P0));
    }

    public Result b(Params params) throws IOException {
        String strE = iy.c0.e(params.getPhoneNumber().h());
        hz.g gVarA = this.phonePrefixValidator.a(iy.c0.e(params.getPhoneNumber().h()));
        hz.h hVar = fr.t.c(strE, iy.c0.e(PhoneNumber.c.INSTANCE.a())) ? this.phoneNumberPolishValidator : this.phoneNumberGenericValidator;
        String strE2 = iy.c0.e(params.getPhoneNumber().g());
        if (strE2.length() > 0 && Character.isDigit(fu.r.C1(strE2)) && Character.isDigit(fu.r.F1(strE2))) {
            StringBuilder sb5 = new StringBuilder();
            int length = strE2.length();
            for (int i15 = 0; i15 < length; i15++) {
                char cCharAt = strE2.charAt(i15);
                if (!pq.v.q('-', ' ').contains(Character.valueOf(cCharAt))) {
                    sb5.append(cCharAt);
                }
            }
            strE2 = sb5.toString();
        }
        return new Result(gVarA, hVar.a(strE2));
    }
}
