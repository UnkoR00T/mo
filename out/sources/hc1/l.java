package hc1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lhc1/l;", "", "b", "a", "Lhc1/l$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {

    /* JADX INFO: renamed from: hc1.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lhc1/l$a;", "T", "", "Lhz/b;", "validationState", "value", "<init>", "(Lhz/b;Ljava/lang/Object;)V", "a", "(Lhz/b;Ljava/lang/Object;)Lhc1/l$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Field<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f83196c = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final T value;

        public Field(hz.b bVar, T t15) {
            this.validationState = bVar;
            this.value = t15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Field b(Field field, hz.b bVar, Object obj, int i15, Object obj2) {
            if ((i15 & 1) != 0) {
                bVar = field.validationState;
            }
            if ((i15 & 2) != 0) {
                obj = field.value;
            }
            return field.a(bVar, obj);
        }

        public final Field<T> a(hz.b validationState, T value) {
            return new Field<>(validationState, value);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public final T d() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return fr.t.c(this.validationState, field.validationState) && fr.t.c(this.value, field.value);
        }

        public int hashCode() {
            int iHashCode = this.validationState.hashCode() * 31;
            T t15 = this.value;
            return iHashCode + (t15 == null ? 0 : t15.hashCode());
        }

        public String toString() {
            return "Field(validationState=" + this.validationState + ", value=" + this.value + ')';
        }

        public /* synthetic */ Field(hz.b bVar, Object obj, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, obj);
        }
    }

    /* JADX INFO: renamed from: hc1.l$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J¤\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b(\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b)\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b*\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lhc1/l$b;", "Lhc1/l;", "", "isCompanyNewContactEnabled", "Lhc1/l$a;", "", "email", "phoneNumber", "countryCode", "website", "ceidgConsent", "emailConsent", "phoneNumberConsent", "websiteConsent", "Lhz/b;", "validation", "<init>", "(ZLhc1/l$a;Lhc1/l$a;Lhc1/l$a;Lhc1/l$a;Lhc1/l$a;Lhc1/l$a;Lhc1/l$a;Lhc1/l$a;Lhz/b;)V", "a", "(ZLhc1/l$a;Lhc1/l$a;Lhc1/l$a;Lhc1/l$a;Lhc1/l$a;Lhc1/l$a;Lhc1/l$a;Lhc1/l$a;Lhz/b;)Lhc1/l$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "k", "()Z", "b", "Lhc1/l$a;", "e", "()Lhc1/l$a;", "c", "g", "d", "i", "f", "h", "j", "Lhz/b;", "getValidation", "()Lhz/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FormDisplayed implements l {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f83199k = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCompanyNewContactEnabled;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field<String> email;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field<String> phoneNumber;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field<String> countryCode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field<String> website;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field<Boolean> ceidgConsent;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field<Boolean> emailConsent;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field<Boolean> phoneNumberConsent;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field<Boolean> websiteConsent;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validation;

        public FormDisplayed(boolean z15, Field<String> field, Field<String> field2, Field<String> field3, Field<String> field4, Field<Boolean> field5, Field<Boolean> field6, Field<Boolean> field7, Field<Boolean> field8, hz.b bVar) {
            this.isCompanyNewContactEnabled = z15;
            this.email = field;
            this.phoneNumber = field2;
            this.countryCode = field3;
            this.website = field4;
            this.ceidgConsent = field5;
            this.emailConsent = field6;
            this.phoneNumberConsent = field7;
            this.websiteConsent = field8;
            this.validation = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FormDisplayed b(FormDisplayed formDisplayed, boolean z15, Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, hz.b bVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = formDisplayed.isCompanyNewContactEnabled;
            }
            if ((i15 & 2) != 0) {
                field = formDisplayed.email;
            }
            if ((i15 & 4) != 0) {
                field2 = formDisplayed.phoneNumber;
            }
            if ((i15 & 8) != 0) {
                field3 = formDisplayed.countryCode;
            }
            if ((i15 & 16) != 0) {
                field4 = formDisplayed.website;
            }
            if ((i15 & 32) != 0) {
                field5 = formDisplayed.ceidgConsent;
            }
            if ((i15 & 64) != 0) {
                field6 = formDisplayed.emailConsent;
            }
            if ((i15 & 128) != 0) {
                field7 = formDisplayed.phoneNumberConsent;
            }
            if ((i15 & 256) != 0) {
                field8 = formDisplayed.websiteConsent;
            }
            if ((i15 & 512) != 0) {
                bVar = formDisplayed.validation;
            }
            Field field9 = field8;
            hz.b bVar2 = bVar;
            Field field10 = field6;
            Field field11 = field7;
            Field field12 = field4;
            Field field13 = field5;
            return formDisplayed.a(z15, field, field2, field3, field12, field13, field10, field11, field9, bVar2);
        }

        public final FormDisplayed a(boolean isCompanyNewContactEnabled, Field<String> email, Field<String> phoneNumber, Field<String> countryCode, Field<String> website, Field<Boolean> ceidgConsent, Field<Boolean> emailConsent, Field<Boolean> phoneNumberConsent, Field<Boolean> websiteConsent, hz.b validation) {
            return new FormDisplayed(isCompanyNewContactEnabled, email, phoneNumber, countryCode, website, ceidgConsent, emailConsent, phoneNumberConsent, websiteConsent, validation);
        }

        public final Field<Boolean> c() {
            return this.ceidgConsent;
        }

        public final Field<String> d() {
            return this.countryCode;
        }

        public final Field<String> e() {
            return this.email;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormDisplayed)) {
                return false;
            }
            FormDisplayed formDisplayed = (FormDisplayed) other;
            return this.isCompanyNewContactEnabled == formDisplayed.isCompanyNewContactEnabled && fr.t.c(this.email, formDisplayed.email) && fr.t.c(this.phoneNumber, formDisplayed.phoneNumber) && fr.t.c(this.countryCode, formDisplayed.countryCode) && fr.t.c(this.website, formDisplayed.website) && fr.t.c(this.ceidgConsent, formDisplayed.ceidgConsent) && fr.t.c(this.emailConsent, formDisplayed.emailConsent) && fr.t.c(this.phoneNumberConsent, formDisplayed.phoneNumberConsent) && fr.t.c(this.websiteConsent, formDisplayed.websiteConsent) && fr.t.c(this.validation, formDisplayed.validation);
        }

        public final Field<Boolean> f() {
            return this.emailConsent;
        }

        public final Field<String> g() {
            return this.phoneNumber;
        }

        public final Field<Boolean> h() {
            return this.phoneNumberConsent;
        }

        public int hashCode() {
            return (((((((((((((((((Boolean.hashCode(this.isCompanyNewContactEnabled) * 31) + this.email.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.website.hashCode()) * 31) + this.ceidgConsent.hashCode()) * 31) + this.emailConsent.hashCode()) * 31) + this.phoneNumberConsent.hashCode()) * 31) + this.websiteConsent.hashCode()) * 31) + this.validation.hashCode();
        }

        public final Field<String> i() {
            return this.website;
        }

        public final Field<Boolean> j() {
            return this.websiteConsent;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsCompanyNewContactEnabled() {
            return this.isCompanyNewContactEnabled;
        }

        public String toString() {
            return "FormDisplayed(isCompanyNewContactEnabled=" + this.isCompanyNewContactEnabled + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", countryCode=" + this.countryCode + ", website=" + this.website + ", ceidgConsent=" + this.ceidgConsent + ", emailConsent=" + this.emailConsent + ", phoneNumberConsent=" + this.phoneNumberConsent + ", websiteConsent=" + this.websiteConsent + ", validation=" + this.validation + ')';
        }

        public /* synthetic */ FormDisplayed(boolean z15, Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, hz.b bVar, int i15, fr.k kVar) {
            this(z15, field, field2, field3, field4, field5, field6, field7, field8, (i15 & 512) != 0 ? hz.b.C2039b.f86846c : bVar);
        }
    }
}
