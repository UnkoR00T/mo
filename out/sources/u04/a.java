package u04;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b^\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0004R\u0014\u0010+\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0004R\u0014\u0010-\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0004R\u0014\u0010/\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0004R\u0014\u00101\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0004R\u0014\u00103\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0004R\u0014\u00105\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0004R\u0014\u00107\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0004R\u0014\u00109\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0004R\u0014\u0010;\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0004R\u0014\u0010=\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0004R\u0014\u0010?\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0004R\u0014\u0010A\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0004R\u0014\u0010C\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0004R\u0014\u0010E\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0004R\u0014\u0010G\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0004R\u0014\u0010I\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0004R\u0014\u0010K\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0004R\u0014\u0010M\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0004R\u0014\u0010O\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0004R\u0014\u0010Q\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0004R\u0014\u0010S\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u0004R\u0014\u0010U\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u0004R\u0014\u0010W\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0004R\u0014\u0010Y\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0004R\u0014\u0010[\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0004R\u0014\u0010]\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u0004R\u0014\u0010_\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u0004¨\u0006`À\u0006\u0003"}, d2 = {"Lu04/a;", "", "", "l0", "()Ljava/lang/String;", "govURL", "I", "appPzGovURL", "f", "mObywatelApplicationInfo", "Q", "mObywatelApplicationDevelopmentInfo", i.f37094u, "gdprRegulationUrlContactDetails", "G", "faqAboutPhoto", "d0", "physicalIdCardApplicationFaqIsDocumentReady", "O", "physicalIdCardApplicationPersonalSignature", "Z", "physicalIdCardApplicationCheckYourDataReportDiscrepancy", "o0", "accessibilityDeclaration", "T", "legalInformationAppRegulation", "p0", "legalInformationPrivacyPolicy", "t0", "legalInformationNewsletter", "E", "driverLicense", "z", "googleDocsViewer", "R", "naskPrivacyPolicyPdf", i.f37086m, "naskReportIllegalContent", "k0", "naskIllegalContentPrivacyPolicyPdf", "j0", "naskEmailExportInstructions", "j", "paymentsInfo", ip.a.f96138c, "penaltyPointsInfoLink", "q", "medicalPrescriptionInfoLink", "n0", "pwzMoreInfo", "B", "zpeWeb", "i", "refugeeMoreInfo", "d", "registeredAddressCheckDataOnEpuap", "a", "electoralRegisterChangeVotingPlace", "o", "electoralRegisterAddressRegistration", "a0", "electoralRegisterSignToCrw", "M", "electronicDelivery", "W", "electronicDeliveryWeb", "s", "zusRodo", "F", "zusFaq", "s0", "technicalSupportQA", "J", "dependentIdSuspensionMoreInfoLink", "l", "identityCardSuspensionInfo", "b", "familyCard", "y", "familyCardPartners", "n", "advocate", "x", "nurseAndMidwife", "u", "dentist", "e", "heatingSupplementInfo", "X", "heatingSupplementApplication", "U", "travelAbroadInfoUrl", "g0", "sanitaryInterventionAbout", "k", "sanitaryInterventionInformationClause", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    String B();

    String D();

    String E();

    String F();

    String G();

    String I();

    String J();

    String L();

    String M();

    String O();

    String P();

    String Q();

    String R();

    String T();

    String U();

    String W();

    String X();

    String Z();

    String a();

    String a0();

    String b();

    String d();

    String d0();

    String e();

    String f();

    String g0();

    String i();

    String j();

    String j0();

    String k();

    String k0();

    String l();

    String l0();

    String n();

    String n0();

    String o();

    String o0();

    String p0();

    String q();

    String s();

    String s0();

    String t0();

    String u();

    String x();

    String y();

    String z();
}
