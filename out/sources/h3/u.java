package h3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lh3/u;", "", "a", "Lh3/g;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f80278a;

    /* JADX INFO: renamed from: h3.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bm\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\bR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00108\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010>\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010D\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010J\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010P\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u0017\u0010U\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010X\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010\u0006\u001a\u0004\bW\u0010\bR\u0017\u0010[\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u0017\u0010^\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\b]\u0010\bR\u0017\u0010a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR\u0017\u0010d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bb\u0010\u0006\u001a\u0004\bc\u0010\bR\u0017\u0010g\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\bR\u0017\u0010j\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bh\u0010\u0006\u001a\u0004\bi\u0010\bR\u0017\u0010m\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\bl\u0010\bR\u0017\u0010p\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bn\u0010\u0006\u001a\u0004\bo\u0010\b¨\u0006q"}, d2 = {"Lh3/u$a;", "", "<init>", "()V", "Lh3/u;", "b", "Lh3/u;", "getUsername", "()Lh3/u;", "Username", "c", "Password", "d", "a", "EmailAddress", "e", "getNewUsername", "NewUsername", "f", "getNewPassword", "NewPassword", "g", "getPostalAddress", "PostalAddress", "h", "getPostalCode", "PostalCode", "i", "getCreditCardNumber", "CreditCardNumber", "j", "getCreditCardSecurityCode", "CreditCardSecurityCode", "k", "getCreditCardExpirationDate", "CreditCardExpirationDate", "l", "getCreditCardExpirationMonth", "CreditCardExpirationMonth", "m", "getCreditCardExpirationYear", "CreditCardExpirationYear", "n", "getCreditCardExpirationDay", "CreditCardExpirationDay", "o", "getAddressCountry", "AddressCountry", "p", "getAddressRegion", "AddressRegion", "q", "getAddressLocality", "AddressLocality", "r", "getAddressStreet", "AddressStreet", "s", "getAddressAuxiliaryDetails", "AddressAuxiliaryDetails", "t", "getPostalCodeExtended", "PostalCodeExtended", "u", "getPersonFullName", "PersonFullName", "v", "getPersonFirstName", "PersonFirstName", "w", "getPersonLastName", "PersonLastName", "x", "getPersonMiddleName", "PersonMiddleName", "y", "getPersonMiddleInitial", "PersonMiddleInitial", "z", "getPersonNamePrefix", "PersonNamePrefix", "A", "getPersonNameSuffix", "PersonNameSuffix", "B", "PhoneNumber", "C", "getPhoneNumberDevice", "PhoneNumberDevice", ip.a.f96138c, "getPhoneCountryCode", "PhoneCountryCode", "E", "getPhoneNumberNational", "PhoneNumberNational", "F", "getGender", "Gender", "G", "getBirthDateFull", "BirthDateFull", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "getBirthDateDay", "BirthDateDay", "I", "getBirthDateMonth", "BirthDateMonth", "J", "getBirthDateYear", "BirthDateYear", "K", "getSmsOtpCode", "SmsOtpCode", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f80278a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final u Username = v.a("username");

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final u Password = v.a("password");

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final u EmailAddress = v.a("emailAddress");

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final u NewUsername = v.a("newUsername");

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final u NewPassword = v.a("newPassword");

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final u PostalAddress = v.a("postalAddress");

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final u PostalCode = v.a("postalCode");

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final u CreditCardNumber = v.a("creditCardNumber");

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final u CreditCardSecurityCode = v.a("creditCardSecurityCode");

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private static final u CreditCardExpirationDate = v.a("creditCardExpirationDate");

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private static final u CreditCardExpirationMonth = v.a("creditCardExpirationMonth");

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private static final u CreditCardExpirationYear = v.a("creditCardExpirationYear");

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private static final u CreditCardExpirationDay = v.a("creditCardExpirationDay");

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private static final u AddressCountry = v.a("addressCountry");

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private static final u AddressRegion = v.a("addressRegion");

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private static final u AddressLocality = v.a("addressLocality");

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private static final u AddressStreet = v.a("streetAddress");

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private static final u AddressAuxiliaryDetails = v.a("extendedAddress");

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final u PostalCodeExtended = v.a("extendedPostalCode");

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private static final u PersonFullName = v.a("personName");

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private static final u PersonFirstName = v.a("personGivenName");

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private static final u PersonLastName = v.a("personFamilyName");

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private static final u PersonMiddleName = v.a("personMiddleName");

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        private static final u PersonMiddleInitial = v.a("personMiddleInitial");

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        private static final u PersonNamePrefix = v.a("personNamePrefix");

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private static final u PersonNameSuffix = v.a("personNameSuffix");

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private static final u PhoneNumber = v.a("phoneNumber");

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private static final u PhoneNumberDevice = v.a("phoneNumberDevice");

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        private static final u PhoneCountryCode = v.a("phoneCountryCode");

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        private static final u PhoneNumberNational = v.a("phoneNational");

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private static final u Gender = v.a("gender");

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private static final u BirthDateFull = v.a("birthDateFull");

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        private static final u BirthDateDay = v.a("birthDateDay");

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        private static final u BirthDateMonth = v.a("birthDateMonth");

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        private static final u BirthDateYear = v.a("birthDateYear");

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        private static final u SmsOtpCode = v.a("smsOTPCode");

        private Companion() {
        }

        public final u a() {
            return EmailAddress;
        }

        public final u b() {
            return Password;
        }

        public final u c() {
            return PhoneNumber;
        }
    }
}
