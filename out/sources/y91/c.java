package y91;

import al0.s0;
import cl0.BEPassportChildApplicationCountryDictionary;
import cl0.BEPassportChildApplicationOfficeDictionary;
import cl0.g0;
import cl0.i0;
import dx.i;
import i61.DataSplitData;
import i61.ParentFormData;
import i61.d;
import i61.h;
import i61.l;
import i61.q;
import i61.r;
import i61.t;
import iy.b0;
import java.util.List;
import p071kotlin.Metadata;
import ru3.ContactDetailsData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\u0014\u0015J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016À\u0006\u0003"}, d2 = {"Ly91/c;", "", "Ldx/i;", "Ldx/b;", "Ly91/c$a;", "m0", "()Ldx/i;", "", "Ly91/b;", "q0", "()Ljava/util/List;", "Ly91/c$b;", "summaryData", "Loq/i0;", "A3", "(Ly91/c$b;)V", "", "applicationId", "S8", "(Ljava/lang/String;)V", "a", "b", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: y91.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\bG\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020!\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010.\u001a\u00020,\u0012\b\u0010/\u001a\u0004\u0018\u00010!\u0012\b\u00100\u001a\u0004\u0018\u00010!¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020!HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020,2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bE\u0010W\u001a\u0004\bG\u0010XR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bC\u0010[R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\bS\u0010^R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bM\u0010_\u001a\u0004\bO\u0010`R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bK\u0010cR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bY\u0010fR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bU\u0010k\u001a\u0004\bl\u0010mR\u001f\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bA\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010#\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bQ\u0010q\u001a\u0004\br\u00104R\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bs\u0010n\u001a\u0004\bt\u0010pR\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bi\u0010n\u001a\u0004\bu\u0010pR\u001f\u0010&\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006¢\u0006\f\n\u0004\br\u0010n\u001a\u0004\bd\u0010pR\u001f\u0010'\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bu\u0010n\u001a\u0004\bg\u0010pR\u001f\u0010(\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bt\u0010n\u001a\u0004\bs\u0010pR\u001f\u0010)\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bl\u0010n\u001a\u0004\bv\u0010pR\u001f\u0010*\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bI\u0010n\u001a\u0004\b;\u0010pR\u001f\u0010+\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bv\u0010n\u001a\u0004\ba\u0010pR\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bo\u0010w\u001a\u0004\b\\\u0010xR\u0017\u0010.\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b=\u0010w\u001a\u0004\by\u0010xR\u0019\u0010/\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\by\u0010q\u001a\u0004\bz\u00104R\u0019\u00100\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b{\u0010q\u001a\u0004\b?\u00104¨\u0006|"}, d2 = {"Ly91/c$a;", "", "Li61/t;", "whoAgrees", "Lcl0/g0;", "passportOfficePlace", "Li61/k;", "dataSplitData", "Li61/h;", "reasonType", "Lcl0/q;", "institutionData", "Lal0/s0;", "passportType", "Li61/p;", "parentData", "Lcl0/i0;", "childData", "Liy/b0;", "birthPlaceInput", "Lcl0/o;", "correspondenceCountry", "Li61/d;", "correspondenceAddress", "Lru3/b;", "contactData", "Li61/l;", "discountType", "Li61/q;", "paymentType", "Li61/r;", "pickUpMethod", "", "", "temporaryPassportEligibilityAttachmentsNames", "photoAttachmentName", "photoWithGlassesEligibilityAttachmentsNames", "photoWithFaceCoverEligibilityAttachmentsNames", "otherParentConsentAttachmentsNames", "otherParentNoConsentReasonAttachmentsNames", "paymentConfirmationAttachmentsNames", "technicalIssueConfirmationAttachmentsNames", "abroadTreatmentConfirmationAttachmentsNames", "kdrConfirmationAttachmentsNames", "", "firstEServiceAttempt", "isStatementChecked", "applicationId", "applicationNumber", "<init>", "(Li61/t;Lcl0/g0;Li61/k;Li61/h;Lcl0/q;Lal0/s0;Li61/p;Lcl0/i0;Liy/b0;Lcl0/o;Li61/d;Lru3/b;Li61/l;Li61/q;Li61/r;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li61/t;", "A", "()Li61/t;", "b", "Lcl0/g0;", "p", "()Lcl0/g0;", "c", "Li61/k;", "h", "()Li61/k;", "d", "Li61/h;", "x", "()Li61/h;", "e", "Lcl0/q;", "k", "()Lcl0/q;", "f", "Lal0/s0;", "q", "()Lal0/s0;", "g", "Li61/p;", "o", "()Li61/p;", "Lcl0/i0;", "()Lcl0/i0;", "i", "Liy/b0;", "()Liy/b0;", "j", "Lcl0/o;", "()Lcl0/o;", "Li61/d;", "()Li61/d;", "l", "Lru3/b;", "()Lru3/b;", "m", "Li61/l;", "()Li61/l;", "n", "Li61/q;", "s", "()Li61/q;", "Li61/r;", "w", "()Li61/r;", "Ljava/util/List;", "z", "()Ljava/util/List;", "Ljava/lang/String;", "t", "r", "v", "u", "y", "Z", "()Z", "B", "getApplicationId", "C", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SummaryContractData {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        private final boolean isStatementChecked;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        private final String applicationId;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        private final String applicationNumber;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final t whoAgrees;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final g0 passportOfficePlace;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DataSplitData dataSplitData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final h reasonType;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEPassportChildApplicationOfficeDictionary institutionData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final s0 passportType;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final ParentFormData parentData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final i0 childData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 birthPlaceInput;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEPassportChildApplicationCountryDictionary correspondenceCountry;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final d correspondenceAddress;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final ContactDetailsData contactData;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final l discountType;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final q paymentType;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final r pickUpMethod;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> temporaryPassportEligibilityAttachmentsNames;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final String photoAttachmentName;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> photoWithGlassesEligibilityAttachmentsNames;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> photoWithFaceCoverEligibilityAttachmentsNames;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> otherParentConsentAttachmentsNames;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> otherParentNoConsentReasonAttachmentsNames;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> paymentConfirmationAttachmentsNames;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> technicalIssueConfirmationAttachmentsNames;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> abroadTreatmentConfirmationAttachmentsNames;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> kdrConfirmationAttachmentsNames;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean firstEServiceAttempt;

        public SummaryContractData(t tVar, g0 g0Var, DataSplitData dataSplitData, h hVar, BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary, s0 s0Var, ParentFormData parentFormData, i0 i0Var, b0 b0Var, BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary, d dVar, ContactDetailsData contactDetailsData, l lVar, q qVar, r rVar, List<String> list, String str, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, List<String> list8, List<String> list9, boolean z15, boolean z16, String str2, String str3) {
            this.whoAgrees = tVar;
            this.passportOfficePlace = g0Var;
            this.dataSplitData = dataSplitData;
            this.reasonType = hVar;
            this.institutionData = bEPassportChildApplicationOfficeDictionary;
            this.passportType = s0Var;
            this.parentData = parentFormData;
            this.childData = i0Var;
            this.birthPlaceInput = b0Var;
            this.correspondenceCountry = bEPassportChildApplicationCountryDictionary;
            this.correspondenceAddress = dVar;
            this.contactData = contactDetailsData;
            this.discountType = lVar;
            this.paymentType = qVar;
            this.pickUpMethod = rVar;
            this.temporaryPassportEligibilityAttachmentsNames = list;
            this.photoAttachmentName = str;
            this.photoWithGlassesEligibilityAttachmentsNames = list2;
            this.photoWithFaceCoverEligibilityAttachmentsNames = list3;
            this.otherParentConsentAttachmentsNames = list4;
            this.otherParentNoConsentReasonAttachmentsNames = list5;
            this.paymentConfirmationAttachmentsNames = list6;
            this.technicalIssueConfirmationAttachmentsNames = list7;
            this.abroadTreatmentConfirmationAttachmentsNames = list8;
            this.kdrConfirmationAttachmentsNames = list9;
            this.firstEServiceAttempt = z15;
            this.isStatementChecked = z16;
            this.applicationId = str2;
            this.applicationNumber = str3;
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final t getWhoAgrees() {
            return this.whoAgrees;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final boolean getIsStatementChecked() {
            return this.isStatementChecked;
        }

        public final List<String> a() {
            return this.abroadTreatmentConfirmationAttachmentsNames;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getApplicationNumber() {
            return this.applicationNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getBirthPlaceInput() {
            return this.birthPlaceInput;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final i0 getChildData() {
            return this.childData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ContactDetailsData getContactData() {
            return this.contactData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SummaryContractData)) {
                return false;
            }
            SummaryContractData summaryContractData = (SummaryContractData) other;
            return this.whoAgrees == summaryContractData.whoAgrees && this.passportOfficePlace == summaryContractData.passportOfficePlace && fr.t.c(this.dataSplitData, summaryContractData.dataSplitData) && this.reasonType == summaryContractData.reasonType && fr.t.c(this.institutionData, summaryContractData.institutionData) && this.passportType == summaryContractData.passportType && fr.t.c(this.parentData, summaryContractData.parentData) && fr.t.c(this.childData, summaryContractData.childData) && fr.t.c(this.birthPlaceInput, summaryContractData.birthPlaceInput) && fr.t.c(this.correspondenceCountry, summaryContractData.correspondenceCountry) && fr.t.c(this.correspondenceAddress, summaryContractData.correspondenceAddress) && fr.t.c(this.contactData, summaryContractData.contactData) && this.discountType == summaryContractData.discountType && fr.t.c(this.paymentType, summaryContractData.paymentType) && this.pickUpMethod == summaryContractData.pickUpMethod && fr.t.c(this.temporaryPassportEligibilityAttachmentsNames, summaryContractData.temporaryPassportEligibilityAttachmentsNames) && fr.t.c(this.photoAttachmentName, summaryContractData.photoAttachmentName) && fr.t.c(this.photoWithGlassesEligibilityAttachmentsNames, summaryContractData.photoWithGlassesEligibilityAttachmentsNames) && fr.t.c(this.photoWithFaceCoverEligibilityAttachmentsNames, summaryContractData.photoWithFaceCoverEligibilityAttachmentsNames) && fr.t.c(this.otherParentConsentAttachmentsNames, summaryContractData.otherParentConsentAttachmentsNames) && fr.t.c(this.otherParentNoConsentReasonAttachmentsNames, summaryContractData.otherParentNoConsentReasonAttachmentsNames) && fr.t.c(this.paymentConfirmationAttachmentsNames, summaryContractData.paymentConfirmationAttachmentsNames) && fr.t.c(this.technicalIssueConfirmationAttachmentsNames, summaryContractData.technicalIssueConfirmationAttachmentsNames) && fr.t.c(this.abroadTreatmentConfirmationAttachmentsNames, summaryContractData.abroadTreatmentConfirmationAttachmentsNames) && fr.t.c(this.kdrConfirmationAttachmentsNames, summaryContractData.kdrConfirmationAttachmentsNames) && this.firstEServiceAttempt == summaryContractData.firstEServiceAttempt && this.isStatementChecked == summaryContractData.isStatementChecked && fr.t.c(this.applicationId, summaryContractData.applicationId) && fr.t.c(this.applicationNumber, summaryContractData.applicationNumber);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final d getCorrespondenceAddress() {
            return this.correspondenceAddress;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final BEPassportChildApplicationCountryDictionary getCorrespondenceCountry() {
            return this.correspondenceCountry;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final DataSplitData getDataSplitData() {
            return this.dataSplitData;
        }

        public int hashCode() {
            int iHashCode = ((this.whoAgrees.hashCode() * 31) + this.passportOfficePlace.hashCode()) * 31;
            DataSplitData dataSplitData = this.dataSplitData;
            int iHashCode2 = (iHashCode + (dataSplitData == null ? 0 : dataSplitData.hashCode())) * 31;
            h hVar = this.reasonType;
            int iHashCode3 = (((((((((iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.institutionData.hashCode()) * 31) + this.passportType.hashCode()) * 31) + this.parentData.hashCode()) * 31) + this.childData.hashCode()) * 31;
            b0 b0Var = this.birthPlaceInput;
            int iHashCode4 = (((((iHashCode3 + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + this.correspondenceCountry.hashCode()) * 31) + this.correspondenceAddress.hashCode()) * 31;
            ContactDetailsData contactDetailsData = this.contactData;
            int iHashCode5 = (((((iHashCode4 + (contactDetailsData == null ? 0 : contactDetailsData.hashCode())) * 31) + this.discountType.hashCode()) * 31) + this.paymentType.hashCode()) * 31;
            r rVar = this.pickUpMethod;
            int iHashCode6 = (iHashCode5 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            List<String> list = this.temporaryPassportEligibilityAttachmentsNames;
            int iHashCode7 = (((iHashCode6 + (list == null ? 0 : list.hashCode())) * 31) + this.photoAttachmentName.hashCode()) * 31;
            List<String> list2 = this.photoWithGlassesEligibilityAttachmentsNames;
            int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.photoWithFaceCoverEligibilityAttachmentsNames;
            int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<String> list4 = this.otherParentConsentAttachmentsNames;
            int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<String> list5 = this.otherParentNoConsentReasonAttachmentsNames;
            int iHashCode11 = (iHashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<String> list6 = this.paymentConfirmationAttachmentsNames;
            int iHashCode12 = (iHashCode11 + (list6 == null ? 0 : list6.hashCode())) * 31;
            List<String> list7 = this.technicalIssueConfirmationAttachmentsNames;
            int iHashCode13 = (iHashCode12 + (list7 == null ? 0 : list7.hashCode())) * 31;
            List<String> list8 = this.abroadTreatmentConfirmationAttachmentsNames;
            int iHashCode14 = (iHashCode13 + (list8 == null ? 0 : list8.hashCode())) * 31;
            List<String> list9 = this.kdrConfirmationAttachmentsNames;
            int iHashCode15 = (((((iHashCode14 + (list9 == null ? 0 : list9.hashCode())) * 31) + Boolean.hashCode(this.firstEServiceAttempt)) * 31) + Boolean.hashCode(this.isStatementChecked)) * 31;
            String str = this.applicationId;
            int iHashCode16 = (iHashCode15 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.applicationNumber;
            return iHashCode16 + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final l getDiscountType() {
            return this.discountType;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getFirstEServiceAttempt() {
            return this.firstEServiceAttempt;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final BEPassportChildApplicationOfficeDictionary getInstitutionData() {
            return this.institutionData;
        }

        public final List<String> l() {
            return this.kdrConfirmationAttachmentsNames;
        }

        public final List<String> m() {
            return this.otherParentConsentAttachmentsNames;
        }

        public final List<String> n() {
            return this.otherParentNoConsentReasonAttachmentsNames;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final ParentFormData getParentData() {
            return this.parentData;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final g0 getPassportOfficePlace() {
            return this.passportOfficePlace;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final s0 getPassportType() {
            return this.passportType;
        }

        public final List<String> r() {
            return this.paymentConfirmationAttachmentsNames;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final q getPaymentType() {
            return this.paymentType;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getPhotoAttachmentName() {
            return this.photoAttachmentName;
        }

        public String toString() {
            return "SummaryContractData(whoAgrees=" + this.whoAgrees + ", passportOfficePlace=" + this.passportOfficePlace + ", dataSplitData=" + this.dataSplitData + ", reasonType=" + this.reasonType + ", institutionData=" + this.institutionData + ", passportType=" + this.passportType + ", parentData=" + this.parentData + ", childData=" + this.childData + ", birthPlaceInput=" + this.birthPlaceInput + ", correspondenceCountry=" + this.correspondenceCountry + ", correspondenceAddress=" + this.correspondenceAddress + ", contactData=" + this.contactData + ", discountType=" + this.discountType + ", paymentType=" + this.paymentType + ", pickUpMethod=" + this.pickUpMethod + ", temporaryPassportEligibilityAttachmentsNames=" + this.temporaryPassportEligibilityAttachmentsNames + ", photoAttachmentName=" + this.photoAttachmentName + ", photoWithGlassesEligibilityAttachmentsNames=" + this.photoWithGlassesEligibilityAttachmentsNames + ", photoWithFaceCoverEligibilityAttachmentsNames=" + this.photoWithFaceCoverEligibilityAttachmentsNames + ", otherParentConsentAttachmentsNames=" + this.otherParentConsentAttachmentsNames + ", otherParentNoConsentReasonAttachmentsNames=" + this.otherParentNoConsentReasonAttachmentsNames + ", paymentConfirmationAttachmentsNames=" + this.paymentConfirmationAttachmentsNames + ", technicalIssueConfirmationAttachmentsNames=" + this.technicalIssueConfirmationAttachmentsNames + ", abroadTreatmentConfirmationAttachmentsNames=" + this.abroadTreatmentConfirmationAttachmentsNames + ", kdrConfirmationAttachmentsNames=" + this.kdrConfirmationAttachmentsNames + ", firstEServiceAttempt=" + this.firstEServiceAttempt + ", isStatementChecked=" + this.isStatementChecked + ", applicationId=" + this.applicationId + ", applicationNumber=" + this.applicationNumber + ')';
        }

        public final List<String> u() {
            return this.photoWithFaceCoverEligibilityAttachmentsNames;
        }

        public final List<String> v() {
            return this.photoWithGlassesEligibilityAttachmentsNames;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final r getPickUpMethod() {
            return this.pickUpMethod;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final h getReasonType() {
            return this.reasonType;
        }

        public final List<String> y() {
            return this.technicalIssueConfirmationAttachmentsNames;
        }

        public final List<String> z() {
            return this.temporaryPassportEligibilityAttachmentsNames;
        }
    }

    /* JADX INFO: renamed from: y91.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Ly91/c$b;", "", "", "isStatementChecked", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SummaryData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isStatementChecked;

        public SummaryData(boolean z15) {
            this.isStatementChecked = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsStatementChecked() {
            return this.isStatementChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SummaryData) && this.isStatementChecked == ((SummaryData) other).isStatementChecked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStatementChecked);
        }

        public String toString() {
            return "SummaryData(isStatementChecked=" + this.isStatementChecked + ')';
        }
    }

    void A3(SummaryData summaryData);

    void S8(String applicationId);

    i<dx.b, SummaryContractData> m0();

    List<ChildPassportApplicationAttachmentsToSend> q0();
}
