package i61;

import al0.s0;
import cl0.BEPassportChildApplicationCountryDictionary;
import cl0.BEPassportChildApplicationOfficeDictionary;
import cl0.g0;
import java.util.List;
import p071kotlin.Metadata;
import ru3.ContactDetailsData;

/* JADX INFO: renamed from: i61.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bN\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010>\u001a\u00020=HÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010B\u001a\u00020A2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bB\u0010CR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010<R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\bL\u0010]R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bF\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bc\u0010E\u001a\u0004\be\u0010GR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b_\u0010f\u001a\u0004\bg\u0010hR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010E\u001a\u0004\bn\u0010GR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bo\u0010E\u001a\u0004\bp\u0010GR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bm\u0010sR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bN\u0010t\u001a\u0004\b[\u0010uR\u001f\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bv\u0010E\u001a\u0004\bw\u0010GR\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bx\u0010E\u001a\u0004\bx\u0010GR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\bY\u0010y\u001a\u0004\bv\u0010zR\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bq\u0010GR\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\bP\u0010}R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\bk\u0010~\u001a\u0004\bW\u0010\u007fR\u001b\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\u000e\n\u0005\bp\u0010\u0080\u0001\u001a\u0005\bT\u0010\u0081\u0001R\u001c\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\u000f\n\u0005\bn\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001f\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bV\u0010E\u001a\u0004\bD\u0010GR \u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0083\u0001\u0010E\u001a\u0004\bo\u0010GR \u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bg\u0010E\u001a\u0005\b\u0085\u0001\u0010GR\u001b\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\u000e\n\u0005\bw\u0010\u0086\u0001\u001a\u0005\ba\u0010\u0087\u0001R\u001d\u00103\u001a\u0004\u0018\u0001028\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u0088\u0001\u0010\u008a\u0001R\u001c\u00105\u001a\u0004\u0018\u0001048\u0006¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u008b\u0001\u001a\u0005\bi\u0010\u008c\u0001R\u001b\u00107\u001a\u0004\u0018\u0001068\u0006¢\u0006\u000e\n\u0005\be\u0010\u008d\u0001\u001a\u0005\b{\u0010\u008e\u0001R\u0019\u00108\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bR\u0010U\u001a\u0004\bH\u0010<¨\u0006\u008f\u0001"}, d2 = {"Li61/e;", "", "", "", "destinationsBackstack", "Lal0/s0;", "passportType", "Lcl0/g0;", "officePlace", "Li61/t;", "whoAgrees", "pickedChildId", "Li61/p;", "parentFormData", "Li61/c;", "childData", "Li61/o;", "enterChildValidatedData", "Li61/m;", "enterChildCheckboxes", "Li61/g;", "temporaryPassportReasonAttachments", "Li61/h;", "reasonType", "Li61/i;", "photoData", "photoGlassesAttachment", "photoFaceCoverAttachment", "Lcl0/q;", "institutionData", "Li61/k;", "dataSplitData", "signedConsentAttachmentsData", "otherParentUnableToConsentAttachmentsData", "Li61/b;", "oldMoneyTransferAttachmentsData", "newMoneyTransferAttachmentsData", "Lru3/b;", "contactDetails", "Lcl0/o;", "correspondenceCountryData", "Li61/d;", "correspondenceAddress", "Li61/r;", "pickupMethod", "abroadTreatmentAttachmentsData", "kdrAttachmentsData", "technicalIssueAttachmentsData", "Li61/l;", "discountTypeData", "Li61/s;", "summaryCheckBox", "Li61/f;", "faceDetectionData", "Li61/q;", "paymentType", "applicationId", "<init>", "(Ljava/util/List;Lal0/s0;Lcl0/g0;Li61/t;Ljava/lang/String;Li61/p;Li61/c;Li61/o;Li61/m;Ljava/util/List;Li61/h;Li61/i;Ljava/util/List;Ljava/util/List;Lcl0/q;Li61/k;Ljava/util/List;Ljava/util/List;Li61/b;Ljava/util/List;Lru3/b;Lcl0/o;Li61/d;Li61/r;Ljava/util/List;Ljava/util/List;Ljava/util/List;Li61/l;Li61/s;Li61/f;Li61/q;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "h", "()Ljava/util/List;", "b", "Lal0/s0;", "t", "()Lal0/s0;", "c", "Lcl0/g0;", "p", "()Lcl0/g0;", "d", "Li61/t;", "F", "()Li61/t;", "e", "Ljava/lang/String;", "y", "f", "Li61/p;", "s", "()Li61/p;", "g", "Li61/c;", "()Li61/c;", "Li61/o;", "k", "()Li61/o;", "i", "Li61/m;", "j", "()Li61/m;", "E", "Li61/h;", "A", "()Li61/h;", "l", "Li61/i;", "v", "()Li61/i;", "m", "x", "n", "w", "o", "Lcl0/q;", "()Lcl0/q;", "Li61/k;", "()Li61/k;", "q", "B", "r", "Li61/b;", "()Li61/b;", "u", "Lru3/b;", "()Lru3/b;", "Lcl0/o;", "()Lcl0/o;", "Li61/d;", "()Li61/d;", "Li61/r;", "z", "()Li61/r;", ip.a.f96138c, "Li61/l;", "()Li61/l;", "C", "Li61/s;", "()Li61/s;", "Li61/f;", "()Li61/f;", "Li61/q;", "()Li61/q;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationDraft {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    private final List<ChildPassportApplicationFile> technicalIssueAttachmentsData;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    private final l discountTypeData;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    private final SummaryCheckBox summaryCheckBox;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
    private final ChildPassportApplicationFaceDetectionData faceDetectionData;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
    private final q paymentType;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
    private final String applicationId;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> destinationsBackstack;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s0 passportType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final g0 officePlace;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final t whoAgrees;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickedChildId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ParentFormData parentFormData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChildDataResult childData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnterChildValidatedData enterChildValidatedData;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnterChildCheckboxes enterChildCheckboxes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildPassportApplicationFile> temporaryPassportReasonAttachments;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final h reasonType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChildPassportApplicationStoredPhotoData photoData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildPassportApplicationFile> photoGlassesAttachment;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildPassportApplicationFile> photoFaceCoverAttachment;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPassportChildApplicationOfficeDictionary institutionData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataSplitData dataSplitData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildPassportApplicationFile> signedConsentAttachmentsData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildPassportApplicationFile> otherParentUnableToConsentAttachmentsData;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChildDataApplicationAttachmentData oldMoneyTransferAttachmentsData;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildPassportApplicationFile> newMoneyTransferAttachmentsData;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactDetailsData contactDetails;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPassportChildApplicationCountryDictionary correspondenceCountryData;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final d correspondenceAddress;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final r pickupMethod;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildPassportApplicationFile> abroadTreatmentAttachmentsData;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildPassportApplicationFile> kdrAttachmentsData;

    public ChildPassportApplicationDraft(List<String> list, s0 s0Var, g0 g0Var, t tVar, String str, ParentFormData parentFormData, ChildDataResult childDataResult, EnterChildValidatedData enterChildValidatedData, EnterChildCheckboxes enterChildCheckboxes, List<ChildPassportApplicationFile> list2, h hVar, ChildPassportApplicationStoredPhotoData childPassportApplicationStoredPhotoData, List<ChildPassportApplicationFile> list3, List<ChildPassportApplicationFile> list4, BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary, DataSplitData dataSplitData, List<ChildPassportApplicationFile> list5, List<ChildPassportApplicationFile> list6, ChildDataApplicationAttachmentData childDataApplicationAttachmentData, List<ChildPassportApplicationFile> list7, ContactDetailsData contactDetailsData, BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary, d dVar, r rVar, List<ChildPassportApplicationFile> list8, List<ChildPassportApplicationFile> list9, List<ChildPassportApplicationFile> list10, l lVar, SummaryCheckBox summaryCheckBox, ChildPassportApplicationFaceDetectionData childPassportApplicationFaceDetectionData, q qVar, String str2) {
        this.destinationsBackstack = list;
        this.passportType = s0Var;
        this.officePlace = g0Var;
        this.whoAgrees = tVar;
        this.pickedChildId = str;
        this.parentFormData = parentFormData;
        this.childData = childDataResult;
        this.enterChildValidatedData = enterChildValidatedData;
        this.enterChildCheckboxes = enterChildCheckboxes;
        this.temporaryPassportReasonAttachments = list2;
        this.reasonType = hVar;
        this.photoData = childPassportApplicationStoredPhotoData;
        this.photoGlassesAttachment = list3;
        this.photoFaceCoverAttachment = list4;
        this.institutionData = bEPassportChildApplicationOfficeDictionary;
        this.dataSplitData = dataSplitData;
        this.signedConsentAttachmentsData = list5;
        this.otherParentUnableToConsentAttachmentsData = list6;
        this.oldMoneyTransferAttachmentsData = childDataApplicationAttachmentData;
        this.newMoneyTransferAttachmentsData = list7;
        this.contactDetails = contactDetailsData;
        this.correspondenceCountryData = bEPassportChildApplicationCountryDictionary;
        this.correspondenceAddress = dVar;
        this.pickupMethod = rVar;
        this.abroadTreatmentAttachmentsData = list8;
        this.kdrAttachmentsData = list9;
        this.technicalIssueAttachmentsData = list10;
        this.discountTypeData = lVar;
        this.summaryCheckBox = summaryCheckBox;
        this.faceDetectionData = childPassportApplicationFaceDetectionData;
        this.paymentType = qVar;
        this.applicationId = str2;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final h getReasonType() {
        return this.reasonType;
    }

    public final List<ChildPassportApplicationFile> B() {
        return this.signedConsentAttachmentsData;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final SummaryCheckBox getSummaryCheckBox() {
        return this.summaryCheckBox;
    }

    public final List<ChildPassportApplicationFile> D() {
        return this.technicalIssueAttachmentsData;
    }

    public final List<ChildPassportApplicationFile> E() {
        return this.temporaryPassportReasonAttachments;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final t getWhoAgrees() {
        return this.whoAgrees;
    }

    public final List<ChildPassportApplicationFile> a() {
        return this.abroadTreatmentAttachmentsData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ChildDataResult getChildData() {
        return this.childData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ContactDetailsData getContactDetails() {
        return this.contactDetails;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getCorrespondenceAddress() {
        return this.correspondenceAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationDraft)) {
            return false;
        }
        ChildPassportApplicationDraft childPassportApplicationDraft = (ChildPassportApplicationDraft) other;
        return fr.t.c(this.destinationsBackstack, childPassportApplicationDraft.destinationsBackstack) && this.passportType == childPassportApplicationDraft.passportType && this.officePlace == childPassportApplicationDraft.officePlace && this.whoAgrees == childPassportApplicationDraft.whoAgrees && fr.t.c(this.pickedChildId, childPassportApplicationDraft.pickedChildId) && fr.t.c(this.parentFormData, childPassportApplicationDraft.parentFormData) && fr.t.c(this.childData, childPassportApplicationDraft.childData) && fr.t.c(this.enterChildValidatedData, childPassportApplicationDraft.enterChildValidatedData) && fr.t.c(this.enterChildCheckboxes, childPassportApplicationDraft.enterChildCheckboxes) && fr.t.c(this.temporaryPassportReasonAttachments, childPassportApplicationDraft.temporaryPassportReasonAttachments) && this.reasonType == childPassportApplicationDraft.reasonType && fr.t.c(this.photoData, childPassportApplicationDraft.photoData) && fr.t.c(this.photoGlassesAttachment, childPassportApplicationDraft.photoGlassesAttachment) && fr.t.c(this.photoFaceCoverAttachment, childPassportApplicationDraft.photoFaceCoverAttachment) && fr.t.c(this.institutionData, childPassportApplicationDraft.institutionData) && fr.t.c(this.dataSplitData, childPassportApplicationDraft.dataSplitData) && fr.t.c(this.signedConsentAttachmentsData, childPassportApplicationDraft.signedConsentAttachmentsData) && fr.t.c(this.otherParentUnableToConsentAttachmentsData, childPassportApplicationDraft.otherParentUnableToConsentAttachmentsData) && fr.t.c(this.oldMoneyTransferAttachmentsData, childPassportApplicationDraft.oldMoneyTransferAttachmentsData) && fr.t.c(this.newMoneyTransferAttachmentsData, childPassportApplicationDraft.newMoneyTransferAttachmentsData) && fr.t.c(this.contactDetails, childPassportApplicationDraft.contactDetails) && fr.t.c(this.correspondenceCountryData, childPassportApplicationDraft.correspondenceCountryData) && fr.t.c(this.correspondenceAddress, childPassportApplicationDraft.correspondenceAddress) && this.pickupMethod == childPassportApplicationDraft.pickupMethod && fr.t.c(this.abroadTreatmentAttachmentsData, childPassportApplicationDraft.abroadTreatmentAttachmentsData) && fr.t.c(this.kdrAttachmentsData, childPassportApplicationDraft.kdrAttachmentsData) && fr.t.c(this.technicalIssueAttachmentsData, childPassportApplicationDraft.technicalIssueAttachmentsData) && this.discountTypeData == childPassportApplicationDraft.discountTypeData && fr.t.c(this.summaryCheckBox, childPassportApplicationDraft.summaryCheckBox) && fr.t.c(this.faceDetectionData, childPassportApplicationDraft.faceDetectionData) && fr.t.c(this.paymentType, childPassportApplicationDraft.paymentType) && fr.t.c(this.applicationId, childPassportApplicationDraft.applicationId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BEPassportChildApplicationCountryDictionary getCorrespondenceCountryData() {
        return this.correspondenceCountryData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DataSplitData getDataSplitData() {
        return this.dataSplitData;
    }

    public final List<String> h() {
        return this.destinationsBackstack;
    }

    public int hashCode() {
        List<String> list = this.destinationsBackstack;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        s0 s0Var = this.passportType;
        int iHashCode2 = (iHashCode + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        g0 g0Var = this.officePlace;
        int iHashCode3 = (iHashCode2 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        t tVar = this.whoAgrees;
        int iHashCode4 = (iHashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.pickedChildId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        ParentFormData parentFormData = this.parentFormData;
        int iHashCode6 = (iHashCode5 + (parentFormData == null ? 0 : parentFormData.hashCode())) * 31;
        ChildDataResult childDataResult = this.childData;
        int iHashCode7 = (iHashCode6 + (childDataResult == null ? 0 : childDataResult.hashCode())) * 31;
        EnterChildValidatedData enterChildValidatedData = this.enterChildValidatedData;
        int iHashCode8 = (iHashCode7 + (enterChildValidatedData == null ? 0 : enterChildValidatedData.hashCode())) * 31;
        EnterChildCheckboxes enterChildCheckboxes = this.enterChildCheckboxes;
        int iHashCode9 = (iHashCode8 + (enterChildCheckboxes == null ? 0 : enterChildCheckboxes.hashCode())) * 31;
        List<ChildPassportApplicationFile> list2 = this.temporaryPassportReasonAttachments;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        h hVar = this.reasonType;
        int iHashCode11 = (iHashCode10 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        ChildPassportApplicationStoredPhotoData childPassportApplicationStoredPhotoData = this.photoData;
        int iHashCode12 = (iHashCode11 + (childPassportApplicationStoredPhotoData == null ? 0 : childPassportApplicationStoredPhotoData.hashCode())) * 31;
        List<ChildPassportApplicationFile> list3 = this.photoGlassesAttachment;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ChildPassportApplicationFile> list4 = this.photoFaceCoverAttachment;
        int iHashCode14 = (iHashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
        BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary = this.institutionData;
        int iHashCode15 = (iHashCode14 + (bEPassportChildApplicationOfficeDictionary == null ? 0 : bEPassportChildApplicationOfficeDictionary.hashCode())) * 31;
        DataSplitData dataSplitData = this.dataSplitData;
        int iHashCode16 = (iHashCode15 + (dataSplitData == null ? 0 : dataSplitData.hashCode())) * 31;
        List<ChildPassportApplicationFile> list5 = this.signedConsentAttachmentsData;
        int iHashCode17 = (iHashCode16 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<ChildPassportApplicationFile> list6 = this.otherParentUnableToConsentAttachmentsData;
        int iHashCode18 = (iHashCode17 + (list6 == null ? 0 : list6.hashCode())) * 31;
        ChildDataApplicationAttachmentData childDataApplicationAttachmentData = this.oldMoneyTransferAttachmentsData;
        int iHashCode19 = (iHashCode18 + (childDataApplicationAttachmentData == null ? 0 : childDataApplicationAttachmentData.hashCode())) * 31;
        List<ChildPassportApplicationFile> list7 = this.newMoneyTransferAttachmentsData;
        int iHashCode20 = (iHashCode19 + (list7 == null ? 0 : list7.hashCode())) * 31;
        ContactDetailsData contactDetailsData = this.contactDetails;
        int iHashCode21 = (iHashCode20 + (contactDetailsData == null ? 0 : contactDetailsData.hashCode())) * 31;
        BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary = this.correspondenceCountryData;
        int iHashCode22 = (iHashCode21 + (bEPassportChildApplicationCountryDictionary == null ? 0 : bEPassportChildApplicationCountryDictionary.hashCode())) * 31;
        d dVar = this.correspondenceAddress;
        int iHashCode23 = (iHashCode22 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        r rVar = this.pickupMethod;
        int iHashCode24 = (iHashCode23 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        List<ChildPassportApplicationFile> list8 = this.abroadTreatmentAttachmentsData;
        int iHashCode25 = (iHashCode24 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<ChildPassportApplicationFile> list9 = this.kdrAttachmentsData;
        int iHashCode26 = (iHashCode25 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<ChildPassportApplicationFile> list10 = this.technicalIssueAttachmentsData;
        int iHashCode27 = (iHashCode26 + (list10 == null ? 0 : list10.hashCode())) * 31;
        l lVar = this.discountTypeData;
        int iHashCode28 = (iHashCode27 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        SummaryCheckBox summaryCheckBox = this.summaryCheckBox;
        int iHashCode29 = (iHashCode28 + (summaryCheckBox == null ? 0 : summaryCheckBox.hashCode())) * 31;
        ChildPassportApplicationFaceDetectionData childPassportApplicationFaceDetectionData = this.faceDetectionData;
        int iHashCode30 = (iHashCode29 + (childPassportApplicationFaceDetectionData == null ? 0 : childPassportApplicationFaceDetectionData.hashCode())) * 31;
        q qVar = this.paymentType;
        int iHashCode31 = (iHashCode30 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str2 = this.applicationId;
        return iHashCode31 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final l getDiscountTypeData() {
        return this.discountTypeData;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnterChildCheckboxes getEnterChildCheckboxes() {
        return this.enterChildCheckboxes;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnterChildValidatedData getEnterChildValidatedData() {
        return this.enterChildValidatedData;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final ChildPassportApplicationFaceDetectionData getFaceDetectionData() {
        return this.faceDetectionData;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final BEPassportChildApplicationOfficeDictionary getInstitutionData() {
        return this.institutionData;
    }

    public final List<ChildPassportApplicationFile> n() {
        return this.kdrAttachmentsData;
    }

    public final List<ChildPassportApplicationFile> o() {
        return this.newMoneyTransferAttachmentsData;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final g0 getOfficePlace() {
        return this.officePlace;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final ChildDataApplicationAttachmentData getOldMoneyTransferAttachmentsData() {
        return this.oldMoneyTransferAttachmentsData;
    }

    public final List<ChildPassportApplicationFile> r() {
        return this.otherParentUnableToConsentAttachmentsData;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final ParentFormData getParentFormData() {
        return this.parentFormData;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final s0 getPassportType() {
        return this.passportType;
    }

    public String toString() {
        return "ChildPassportApplicationDraft(destinationsBackstack=" + this.destinationsBackstack + ", passportType=" + this.passportType + ", officePlace=" + this.officePlace + ", whoAgrees=" + this.whoAgrees + ", pickedChildId=" + this.pickedChildId + ", parentFormData=" + this.parentFormData + ", childData=" + this.childData + ", enterChildValidatedData=" + this.enterChildValidatedData + ", enterChildCheckboxes=" + this.enterChildCheckboxes + ", temporaryPassportReasonAttachments=" + this.temporaryPassportReasonAttachments + ", reasonType=" + this.reasonType + ", photoData=" + this.photoData + ", photoGlassesAttachment=" + this.photoGlassesAttachment + ", photoFaceCoverAttachment=" + this.photoFaceCoverAttachment + ", institutionData=" + this.institutionData + ", dataSplitData=" + this.dataSplitData + ", signedConsentAttachmentsData=" + this.signedConsentAttachmentsData + ", otherParentUnableToConsentAttachmentsData=" + this.otherParentUnableToConsentAttachmentsData + ", oldMoneyTransferAttachmentsData=" + this.oldMoneyTransferAttachmentsData + ", newMoneyTransferAttachmentsData=" + this.newMoneyTransferAttachmentsData + ", contactDetails=" + this.contactDetails + ", correspondenceCountryData=" + this.correspondenceCountryData + ", correspondenceAddress=" + this.correspondenceAddress + ", pickupMethod=" + this.pickupMethod + ", abroadTreatmentAttachmentsData=" + this.abroadTreatmentAttachmentsData + ", kdrAttachmentsData=" + this.kdrAttachmentsData + ", technicalIssueAttachmentsData=" + this.technicalIssueAttachmentsData + ", discountTypeData=" + this.discountTypeData + ", summaryCheckBox=" + this.summaryCheckBox + ", faceDetectionData=" + this.faceDetectionData + ", paymentType=" + this.paymentType + ", applicationId=" + this.applicationId + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final q getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final ChildPassportApplicationStoredPhotoData getPhotoData() {
        return this.photoData;
    }

    public final List<ChildPassportApplicationFile> w() {
        return this.photoFaceCoverAttachment;
    }

    public final List<ChildPassportApplicationFile> x() {
        return this.photoGlassesAttachment;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getPickedChildId() {
        return this.pickedChildId;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final r getPickupMethod() {
        return this.pickupMethod;
    }
}
