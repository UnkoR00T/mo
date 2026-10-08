package h3;

import java.util.HashMap;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0080\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Ljava/util/HashMap;", "Lh3/q;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidAutofillTypes", "(Lh3/q;)Ljava/lang/String;", "getAndroidType$annotations", "(Lh3/q;)V", "androidType", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<q, String> f80234a = v0.k(oq.y.a(q.EmailAddress, "emailAddress"), oq.y.a(q.Username, "username"), oq.y.a(q.Password, "password"), oq.y.a(q.NewUsername, "newUsername"), oq.y.a(q.NewPassword, "newPassword"), oq.y.a(q.PostalAddress, "postalAddress"), oq.y.a(q.PostalCode, "postalCode"), oq.y.a(q.CreditCardNumber, "creditCardNumber"), oq.y.a(q.CreditCardSecurityCode, "creditCardSecurityCode"), oq.y.a(q.CreditCardExpirationDate, "creditCardExpirationDate"), oq.y.a(q.CreditCardExpirationMonth, "creditCardExpirationMonth"), oq.y.a(q.CreditCardExpirationYear, "creditCardExpirationYear"), oq.y.a(q.CreditCardExpirationDay, "creditCardExpirationDay"), oq.y.a(q.AddressCountry, "addressCountry"), oq.y.a(q.AddressRegion, "addressRegion"), oq.y.a(q.AddressLocality, "addressLocality"), oq.y.a(q.AddressStreet, "streetAddress"), oq.y.a(q.AddressAuxiliaryDetails, "extendedAddress"), oq.y.a(q.PostalCodeExtended, "extendedPostalCode"), oq.y.a(q.PersonFullName, "personName"), oq.y.a(q.PersonFirstName, "personGivenName"), oq.y.a(q.PersonLastName, "personFamilyName"), oq.y.a(q.PersonMiddleName, "personMiddleName"), oq.y.a(q.PersonMiddleInitial, "personMiddleInitial"), oq.y.a(q.PersonNamePrefix, "personNamePrefix"), oq.y.a(q.PersonNameSuffix, "personNameSuffix"), oq.y.a(q.PhoneNumber, "phoneNumber"), oq.y.a(q.PhoneNumberDevice, "phoneNumberDevice"), oq.y.a(q.PhoneCountryCode, "phoneCountryCode"), oq.y.a(q.PhoneNumberNational, "phoneNational"), oq.y.a(q.Gender, "gender"), oq.y.a(q.BirthDateFull, "birthDateFull"), oq.y.a(q.BirthDateDay, "birthDateDay"), oq.y.a(q.BirthDateMonth, "birthDateMonth"), oq.y.a(q.BirthDateYear, "birthDateYear"), oq.y.a(q.SmsOtpCode, "smsOTPCode"));

    public static final String a(q qVar) {
        String str = f80234a.get(qVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}
