package oc4;

import android.content.res.Resources;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import p071kotlin.Metadata;
import pl.gov.mc.fringers.mobywatel.f0;
import ri0.k;
import z70.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0003\b\u0093\u0001\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010!\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0014\u0010#\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0018R\u0014\u0010%\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0018R\u0014\u0010'\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0018R\u0014\u0010)\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0014\u0010+\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0018R\u0014\u0010-\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0018R\u0014\u0010/\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0014\u00101\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0018R\u0014\u00103\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0018R\u0014\u00105\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0018R\u0014\u00107\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0018R\u0014\u00109\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0018R\u0014\u0010;\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0018R\u0014\u0010=\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0018R\u0014\u0010?\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0018R\u0014\u0010A\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0018R\u0014\u0010C\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0018R\u0014\u0010E\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0018R\u0014\u0010G\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0018R\u0014\u0010I\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0018R\u0014\u0010K\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0018R\u0014\u0010L\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0018R\u0014\u0010N\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0018R\u0014\u0010P\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0018R\u0014\u0010R\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0018R\u0014\u0010T\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0018R\u0014\u0010V\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0018R\u0014\u0010X\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0018R\u0014\u0010Z\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u0018R\u0014\u0010\\\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0018R\u0014\u0010^\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\u0018R\u0014\u0010`\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u0018R\u0014\u0010b\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u0018R\u0014\u0010d\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\u0018R\u0014\u0010f\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010\u0018R\u0014\u0010h\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010\u0018R\u0014\u0010j\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u0018R\u0014\u0010l\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u0018R\u0014\u0010n\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\u0018R\u0014\u0010p\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u0018R\u0014\u0010r\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010\u0018R\u0014\u0010t\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010\u0018R\u0014\u0010v\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u0018R\u0014\u0010x\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010\u0018R\u0014\u0010z\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010\u0018R\u0014\u0010|\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010\u0018R\u0014\u0010~\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u0018R\u0015\u0010\u0080\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u0018R\u0016\u0010\u0082\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u0018R\u0016\u0010\u0084\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u0018R\u0016\u0010\u0086\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\u0018R\u0016\u0010\u0088\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010\u0018R\u0016\u0010\u008a\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010\u0018R\u0016\u0010\u008c\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010\u0018R\u0016\u0010\u008e\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010\u0018R\u0016\u0010\u0090\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010\u0018R\u0016\u0010\u0092\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010\u0018R\u0016\u0010\u0094\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u0018R\u0016\u0010\u0096\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010\u0018R\u0016\u0010\u0098\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010\u0018R\u0016\u0010\u009a\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010\u0018R\u0016\u0010\u009c\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010\u0018R\u0016\u0010\u009e\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\u0018R\u0016\u0010 \u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010\u0018R\u0016\u0010¢\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010\u0018R\u0016\u0010¤\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010\u0018R\u0016\u0010¦\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010\u0018R\u0016\u0010¨\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010\u0018¨\u0006©\u0001"}, d2 = {"Loc4/b;", "Lu04/a;", "Lia1/a;", "Lb72/a;", "Lib2/a;", "Lz24/b;", "Lri0/k;", "Lz70/h;", "Ler0/a;", "Lov0/a;", "Ltz0/b;", "Lhk1/a;", "Lh13/a;", "Lpr2/a;", "Lyf2/b;", "Lsi1/a;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "a", "Landroid/content/res/Resources;", "", "l0", "()Ljava/lang/String;", "govURL", "I", "appPzGovURL", "f", "mObywatelApplicationInfo", "Q", "mObywatelApplicationDevelopmentInfo", i.f37094u, "gdprRegulationUrlContactDetails", "G", "faqAboutPhoto", "d0", "physicalIdCardApplicationFaqIsDocumentReady", "O", "physicalIdCardApplicationPersonalSignature", "Z", "physicalIdCardApplicationCheckYourDataReportDiscrepancy", "o0", "accessibilityDeclaration", "T", "legalInformationAppRegulation", "p0", "legalInformationPrivacyPolicy", "t0", "legalInformationNewsletter", "E", "driverLicense", "z", "googleDocsViewer", "R", "naskPrivacyPolicyPdf", i.f37086m, "naskReportIllegalContent", "k0", "naskIllegalContentPrivacyPolicyPdf", "j0", "naskEmailExportInstructions", "j", "paymentsInfo", ip.a.f96138c, "penaltyPointsInfoLink", "q", "medicalPrescriptionInfoLink", "n0", "pwzMoreInfo", "B", "zpeWeb", "i", "refugeeMoreInfo", "d", "registeredAddressCheckDataOnEpuap", "electoralRegisterChangeVotingPlace", "o", "electoralRegisterAddressRegistration", "a0", "electoralRegisterSignToCrw", "M", "electronicDelivery", "W", "electronicDeliveryWeb", "s", "zusRodo", "F", "zusFaq", "s0", "technicalSupportQA", "J", "dependentIdSuspensionMoreInfoLink", "l", "identityCardSuspensionInfo", "b", "familyCard", "y", "familyCardPartners", "n", "advocate", "x", "nurseAndMidwife", "u", "dentist", "e", "heatingSupplementInfo", "X", "heatingSupplementApplication", "U", "travelAbroadInfoUrl", "h0", "chatbotStreamingSse", "r0", "asyncGetDocuments", "m", "asyncGetMainDocument", "f0", "mJuniorAsyncGetMainDocument", "V", "mJuniorAsyncGetDocuments", "w", "companyCeidgChangeData", "t", "companySocialInsuranceKrusLink", "m0", "companyElectronicDeliveryLink", i.f37087n, "companySuspensionCeidgLink", "u0", "companyRegisterKnowHowLink", "i0", "floodAlertMaterialSupportAlert", "h", "floodAlertHowToProceedAlert", "A", "identityCardInvalidationDamageOrLossInfo", "N", "identityCardInvalidationIdentityTheftInfo", "Y", "gstaticCtLogZip", "c", "vehicleCollisionReadyStatementStatusSSE", "v", "childPassportSupport", "K", "dependentIdInvalidationDamageOrLossInfo", "C", "safetyGuideRSOAppAlert", "r", "safetyGuideWorkshopsUrl", "c0", "confirmPassportPickup", ip.a.f96137b, "ciEkwMs", "g0", "sanitaryInterventionAbout", "k", "sanitaryInterventionInformationClause", "b0", "defenceTrainingStatementToDownload", "g", "defenceTrainingStatement", "p", "defenceTrainingReadinessGroup", "q0", "defenceTrainingReadinessTraining", "e0", "defenceTrainingGroupTraining", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements u04.a, ia1.a, b72.a, ib2.a, z24.b, k, h, er0.a, ov0.a, tz0.b, hk1.a, h13.a, pr2.a, yf2.b, si1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Resources resources;

    public b(Resources resources) {
        this.resources = resources;
    }

    @Override // ib2.a
    public String A() {
        return this.resources.getString(f0.f160705d0);
    }

    @Override // u04.a
    public String B() {
        return this.resources.getString(f0.I0);
    }

    @Override // h13.a
    public String C() {
        return this.resources.getString(f0.A0);
    }

    @Override // u04.a
    public String D() {
        return this.resources.getString(f0.f160735s0);
    }

    @Override // u04.a
    public String E() {
        return this.resources.getString(f0.E);
    }

    @Override // u04.a
    public String F() {
        return this.resources.getString(f0.J0);
    }

    @Override // u04.a
    public String G() {
        return this.resources.getString(f0.f160739u0);
    }

    @Override // ia1.a
    public String H() {
        return this.resources.getString(f0.f160734s);
    }

    @Override // u04.a
    public String I() {
        return this.resources.getString(f0.f160704d);
    }

    @Override // u04.a
    public String J() {
        return this.resources.getString(f0.C);
    }

    @Override // hk1.a
    public String K() {
        return this.resources.getString(f0.B);
    }

    @Override // u04.a
    public String L() {
        return this.resources.getString(f0.W);
    }

    @Override // u04.a
    public String M() {
        return this.resources.getString(f0.I);
    }

    @Override // ib2.a
    public String N() {
        return this.resources.getString(f0.f160707e0);
    }

    @Override // u04.a
    public String O() {
        return this.resources.getString(f0.f160743w0);
    }

    @Override // u04.a
    public String P() {
        return this.resources.getString(f0.f160729p0);
    }

    @Override // u04.a
    public String Q() {
        return this.resources.getString(f0.f160717j0);
    }

    @Override // u04.a
    public String R() {
        return this.resources.getString(f0.f160727o0);
    }

    @Override // yf2.b
    public String S() {
        return this.resources.getString(f0.f160714i);
    }

    @Override // u04.a
    public String T() {
        return this.resources.getString(f0.f160711g0);
    }

    @Override // u04.a
    public String U() {
        return this.resources.getString(f0.G0);
    }

    @Override // z70.h
    public String V() {
        return this.resources.getString(f0.f160706e);
    }

    @Override // u04.a
    public String W() {
        return this.resources.getString(f0.J);
    }

    @Override // u04.a
    public String X() {
        return this.resources.getString(f0.f160701b0);
    }

    @Override // z24.b
    public String Y() {
        return this.resources.getString(f0.f160699a0);
    }

    @Override // u04.a
    public String Z() {
        return this.resources.getString(f0.f160737t0);
    }

    @Override // u04.a
    public String a() {
        return this.resources.getString(f0.G);
    }

    @Override // u04.a
    public String a0() {
        return this.resources.getString(f0.H);
    }

    @Override // u04.a
    public String b() {
        return this.resources.getString(f0.S);
    }

    @Override // si1.a
    public String b0() {
        return this.resources.getString(f0.f160748z);
    }

    @Override // ov0.a
    public String c() {
        return this.resources.getString(f0.H0);
    }

    @Override // pr2.a
    public String c0() {
        return this.resources.getString(f0.f160736t);
    }

    @Override // u04.a
    public String d() {
        return this.resources.getString(f0.f160749z0);
    }

    @Override // u04.a
    public String d0() {
        return this.resources.getString(f0.f160741v0);
    }

    @Override // u04.a
    public String e() {
        return this.resources.getString(f0.f160703c0);
    }

    @Override // si1.a
    public String e0() {
        return this.resources.getString(f0.f160740v);
    }

    @Override // u04.a
    public String f() {
        return this.resources.getString(f0.f160719k0);
    }

    @Override // z70.h
    public String f0() {
        return this.resources.getString(f0.f160708f);
    }

    @Override // si1.a
    public String g() {
        return this.resources.getString(f0.f160746y);
    }

    @Override // u04.a
    public String g0() {
        return this.resources.getString(f0.C0);
    }

    @Override // b72.a
    public String h() {
        return this.resources.getString(f0.U);
    }

    @Override // ri0.k
    public String h0() {
        return this.resources.getString(f0.f160710g);
    }

    @Override // u04.a
    public String i() {
        return this.resources.getString(f0.f160747y0);
    }

    @Override // b72.a
    public String i0() {
        return this.resources.getString(f0.V);
    }

    @Override // u04.a
    public String j() {
        return this.resources.getString(f0.f160733r0);
    }

    @Override // u04.a
    public String j0() {
        return this.resources.getString(f0.f160723m0);
    }

    @Override // u04.a
    public String k() {
        return this.resources.getString(f0.D0);
    }

    @Override // u04.a
    public String k0() {
        return this.resources.getString(f0.f160725n0);
    }

    @Override // u04.a
    public String l() {
        return this.resources.getString(f0.f160709f0);
    }

    @Override // u04.a
    public String l0() {
        return this.resources.getString(f0.Z);
    }

    @Override // er0.a
    public String m() {
        return this.resources.getString(f0.f160708f);
    }

    @Override // ia1.a
    public String m0() {
        return this.resources.getString(f0.f160728p);
    }

    @Override // u04.a
    public String n() {
        return this.resources.getString(f0.f160702c);
    }

    @Override // u04.a
    public String n0() {
        return this.resources.getString(f0.f160745x0);
    }

    @Override // u04.a
    public String o() {
        return this.resources.getString(f0.F);
    }

    @Override // u04.a
    public String o0() {
        return this.resources.getString(f0.f160698a);
    }

    @Override // si1.a
    public String p() {
        return this.resources.getString(f0.f160742w);
    }

    @Override // u04.a
    public String p0() {
        return this.resources.getString(f0.f160715i0);
    }

    @Override // u04.a
    public String q() {
        return this.resources.getString(f0.f160721l0);
    }

    @Override // si1.a
    public String q0() {
        return this.resources.getString(f0.f160744x);
    }

    @Override // h13.a
    public String r() {
        return this.resources.getString(f0.B0);
    }

    @Override // er0.a
    public String r0() {
        return this.resources.getString(f0.f160706e);
    }

    @Override // u04.a
    public String s() {
        return this.resources.getString(f0.K0);
    }

    @Override // u04.a
    public String s0() {
        return this.resources.getString(f0.F0);
    }

    @Override // ia1.a
    public String t() {
        return this.resources.getString(f0.f160732r);
    }

    @Override // u04.a
    public String t0() {
        return this.resources.getString(f0.f160713h0);
    }

    @Override // u04.a
    public String u() {
        return this.resources.getString(f0.A);
    }

    @Override // ia1.a
    public String u0() {
        return this.resources.getString(f0.f160730q);
    }

    @Override // tz0.b
    public String v() {
        return this.resources.getString(f0.f160712h);
    }

    @Override // ia1.a
    public String w() {
        return this.resources.getString(f0.f160726o);
    }

    @Override // u04.a
    public String x() {
        return this.resources.getString(f0.f160731q0);
    }

    @Override // u04.a
    public String y() {
        return this.resources.getString(f0.T);
    }

    @Override // u04.a
    public String z() {
        return this.resources.getString(f0.X);
    }
}
