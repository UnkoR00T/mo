package p081n61;

import al0.AddPhotoData;
import b71.c;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.t;
import i61.ChildDataResult;
import i61.DataSplitData;
import i61.ParentFormData;
import i61.d;
import i61.q;
import ip.a;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import u61.b;
import x71.ChildPassportApplicationCorrespondenceCountryData;

/* JADX INFO: renamed from: n61.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bO\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010+\u001a\u00020\t\u0012\u0006\u0010,\u001a\u00020\t\u0012\u0006\u0010-\u001a\u00020\t\u0012\u0006\u0010.\u001a\u00020\t\u0012\u0006\u0010/\u001a\u00020\t\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b8\u00109Jö\u0002\u0010:\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bC\u0010DR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b:\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010=R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bX\u0010eR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bF\u0010j\u001a\u0004\bf\u0010kR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bh\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bs\u0010p\u001a\u0004\bt\u0010rR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bu\u0010wR\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bx\u0010Q\u001a\u0004\by\u0010SR\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bz\u0010Q\u001a\u0004\b{\u0010SR\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\bc\u0010~R\u001a\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\r\n\u0004\b{\u0010\u007f\u001a\u0005\b`\u0010\u0080\u0001R\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b^\u0010\u0081\u0001\u001a\u0005\b\\\u0010\u0082\u0001R\u001c\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\u000f\n\u0005\bV\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\u000e\n\u0005\bJ\u0010\u0086\u0001\u001a\u0005\bl\u0010\u0087\u0001R\u0018\u0010+\u001a\u00020\t8\u0006¢\u0006\r\n\u0005\b\u0088\u0001\u0010Q\u001a\u0004\bL\u0010SR\u0017\u0010,\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bn\u0010Q\u001a\u0004\bx\u0010SR\u0018\u0010-\u001a\u00020\t8\u0006¢\u0006\r\n\u0004\bt\u0010Q\u001a\u0005\b\u0089\u0001\u0010SR\u0017\u0010.\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bq\u0010Q\u001a\u0004\b|\u0010SR\u0017\u0010/\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bb\u0010Q\u001a\u0004\bz\u0010SR\u001d\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u00103\u001a\u0004\u0018\u0001028\u0006¢\u0006\u000e\n\u0005\bN\u0010\u008d\u0001\u001a\u0005\bs\u0010\u008e\u0001R\u001c\u00105\u001a\u0004\u0018\u0001048\u0006¢\u0006\u000f\n\u0005\by\u0010\u008f\u0001\u001a\u0006\b\u0088\u0001\u0010\u0090\u0001R\u001a\u00106\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0005\b\u008b\u0001\u0010a\u001a\u0004\bP\u0010=R\u001a\u00107\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0005\b\u0089\u0001\u0010a\u001a\u0004\bT\u0010=¨\u0006\u0091\u0001"}, d2 = {"Ln61/c;", "", "", "", "destinationsBackstack", "Lc91/a$a;", "passportTypeData", "Lt91/a$a;", "reasonData", "Lb71/c$a;", "temporaryPassportReasonAttachmentsData", "Lr91/a$a;", "passportOfficePlaceData", "Lda1/a$a;", "whoAgreesData", "Li61/p;", "parentFormData", "pickedChildId", "Li61/c;", "childData", "Lk81/a$a;", "enterChildContractData", "Li61/k;", "dataSplitData", "Lal0/b;", "photoData", "Lu61/b$a;", "photoGlassesAttachment", "photoFaceCoverAttachment", "Lu81/a$a;", "institutionData", "signedConsentAttachmentsData", "otherParentUnableToConsentAttachmentsData", "Lx71/b;", "correspondenceCountryData", "Li61/d;", "correspondenceAddress", "Lm71/a$a;", "contactDetails", "Lo91/a$a;", "pickupMethod", "Ll91/a$a;", "discountTypeData", "abroadTreatmentAttachmentsData", "kdrAttachmentsData", "technicalIssueAttachmentsData", "oldMoneyTransferAttachmentsData", "newMoneyTransferAttachmentsData", "Ly91/c$b;", "summaryData", "Ln81/a$a;", "faceDetectionData", "Li61/q;", "paymentType", "applicationId", "applicationNumber", "<init>", "(Ljava/util/List;Lc91/a$a;Lt91/a$a;Lb71/c$a;Lr91/a$a;Lda1/a$a;Li61/p;Ljava/lang/String;Li61/c;Lk81/a$a;Li61/k;Lal0/b;Lu61/b$a;Lu61/b$a;Lu81/a$a;Lb71/c$a;Lb71/c$a;Lx71/b;Li61/d;Lm71/a$a;Lo91/a$a;Ll91/a$a;Lb71/c$a;Lb71/c$a;Lb71/c$a;Lb71/c$a;Lb71/c$a;Ly91/c$b;Ln81/a$a;Li61/q;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/util/List;Lc91/a$a;Lt91/a$a;Lb71/c$a;Lr91/a$a;Lda1/a$a;Li61/p;Ljava/lang/String;Li61/c;Lk81/a$a;Li61/k;Lal0/b;Lu61/b$a;Lu61/b$a;Lu81/a$a;Lb71/c$a;Lb71/c$a;Lx71/b;Li61/d;Lm71/a$a;Lo91/a$a;Ll91/a$a;Lb71/c$a;Lb71/c$a;Lb71/c$a;Lb71/c$a;Lb71/c$a;Ly91/c$b;Ln81/a$a;Li61/q;Ljava/lang/String;Ljava/lang/String;)Ln61/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "k", "()Ljava/util/List;", "b", "Lc91/a$a;", "v", "()Lc91/a$a;", "c", "Lt91/a$a;", "C", "()Lt91/a$a;", "d", "Lb71/c$a;", "G", "()Lb71/c$a;", "e", "Lr91/a$a;", "u", "()Lr91/a$a;", "f", "Lda1/a$a;", i.f37087n, "()Lda1/a$a;", "g", "Li61/p;", "t", "()Li61/p;", "h", "Ljava/lang/String;", "A", "i", "Li61/c;", "()Li61/c;", "j", "Lk81/a$a;", "m", "()Lk81/a$a;", "Li61/k;", "()Li61/k;", "l", "Lal0/b;", "x", "()Lal0/b;", "Lu61/b$a;", "z", "()Lu61/b$a;", "n", "y", "o", "Lu81/a$a;", "()Lu81/a$a;", "p", a.f96138c, "q", "s", "r", "Lx71/b;", "()Lx71/b;", "Li61/d;", "()Li61/d;", "Lm71/a$a;", "()Lm71/a$a;", "Lo91/a$a;", "B", "()Lo91/a$a;", "Ll91/a$a;", "()Ll91/a$a;", "w", "F", "Ly91/c$b;", "E", "()Ly91/c$b;", "Ln81/a$a;", "()Ln81/a$a;", "Li61/q;", "()Li61/q;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    private final c.AttachmentsData newMoneyTransferAttachmentsData;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    private final y91.c.SummaryData summaryData;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    private final n81.a.FaceDetectionData faceDetectionData;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
    private final q paymentType;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
    private final String applicationId;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
    private final String applicationNumber;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> destinationsBackstack;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c91.a.PassportTypeData passportTypeData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final t91.a.ChildPassportApplicationReasonData reasonData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.AttachmentsData temporaryPassportReasonAttachmentsData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final r91.a.PassportOfficePlaceData passportOfficePlaceData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final da1.a.WhoAgreesData whoAgreesData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final ParentFormData parentFormData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pickedChildId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChildDataResult childData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final k81.a.EnterChildContractData enterChildContractData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataSplitData dataSplitData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddPhotoData photoData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final b.AttachmentsData photoGlassesAttachment;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final b.AttachmentsData photoFaceCoverAttachment;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final u81.a.ChildPassportApplicationInstitutionData institutionData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.AttachmentsData signedConsentAttachmentsData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.AttachmentsData otherParentUnableToConsentAttachmentsData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChildPassportApplicationCorrespondenceCountryData correspondenceCountryData;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final d correspondenceAddress;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final m71.a.ChildPassportApplicationContactDetailsData contactDetails;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final o91.a.ChildPassportApplicationPickupMethodData pickupMethod;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final l91.a.DiscountTypeData discountTypeData;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.AttachmentsData abroadTreatmentAttachmentsData;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.AttachmentsData kdrAttachmentsData;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.AttachmentsData technicalIssueAttachmentsData;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.AttachmentsData oldMoneyTransferAttachmentsData;

    public State(List<String> list, c91.a.PassportTypeData passportTypeData, t91.a.ChildPassportApplicationReasonData childPassportApplicationReasonData, c.AttachmentsData attachmentsData, r91.a.PassportOfficePlaceData passportOfficePlaceData, da1.a.WhoAgreesData whoAgreesData, ParentFormData parentFormData, String str, ChildDataResult childDataResult, k81.a.EnterChildContractData enterChildContractData, DataSplitData dataSplitData, AddPhotoData addPhotoData, b.AttachmentsData attachmentsData2, b.AttachmentsData attachmentsData3, u81.a.ChildPassportApplicationInstitutionData childPassportApplicationInstitutionData, c.AttachmentsData attachmentsData4, c.AttachmentsData attachmentsData5, ChildPassportApplicationCorrespondenceCountryData childPassportApplicationCorrespondenceCountryData, d dVar, m71.a.ChildPassportApplicationContactDetailsData childPassportApplicationContactDetailsData, o91.a.ChildPassportApplicationPickupMethodData childPassportApplicationPickupMethodData, l91.a.DiscountTypeData discountTypeData, c.AttachmentsData attachmentsData6, c.AttachmentsData attachmentsData7, c.AttachmentsData attachmentsData8, c.AttachmentsData attachmentsData9, c.AttachmentsData attachmentsData10, y91.c.SummaryData summaryData, n81.a.FaceDetectionData faceDetectionData, q qVar, String str2, String str3) {
        this.destinationsBackstack = list;
        this.passportTypeData = passportTypeData;
        this.reasonData = childPassportApplicationReasonData;
        this.temporaryPassportReasonAttachmentsData = attachmentsData;
        this.passportOfficePlaceData = passportOfficePlaceData;
        this.whoAgreesData = whoAgreesData;
        this.parentFormData = parentFormData;
        this.pickedChildId = str;
        this.childData = childDataResult;
        this.enterChildContractData = enterChildContractData;
        this.dataSplitData = dataSplitData;
        this.photoData = addPhotoData;
        this.photoGlassesAttachment = attachmentsData2;
        this.photoFaceCoverAttachment = attachmentsData3;
        this.institutionData = childPassportApplicationInstitutionData;
        this.signedConsentAttachmentsData = attachmentsData4;
        this.otherParentUnableToConsentAttachmentsData = attachmentsData5;
        this.correspondenceCountryData = childPassportApplicationCorrespondenceCountryData;
        this.correspondenceAddress = dVar;
        this.contactDetails = childPassportApplicationContactDetailsData;
        this.pickupMethod = childPassportApplicationPickupMethodData;
        this.discountTypeData = discountTypeData;
        this.abroadTreatmentAttachmentsData = attachmentsData6;
        this.kdrAttachmentsData = attachmentsData7;
        this.technicalIssueAttachmentsData = attachmentsData8;
        this.oldMoneyTransferAttachmentsData = attachmentsData9;
        this.newMoneyTransferAttachmentsData = attachmentsData10;
        this.summaryData = summaryData;
        this.faceDetectionData = faceDetectionData;
        this.paymentType = qVar;
        this.applicationId = str2;
        this.applicationNumber = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, List list, c91.a.PassportTypeData passportTypeData, t91.a.ChildPassportApplicationReasonData childPassportApplicationReasonData, c.AttachmentsData attachmentsData, r91.a.PassportOfficePlaceData passportOfficePlaceData, da1.a.WhoAgreesData whoAgreesData, ParentFormData parentFormData, String str, ChildDataResult childDataResult, k81.a.EnterChildContractData enterChildContractData, DataSplitData dataSplitData, AddPhotoData addPhotoData, b.AttachmentsData attachmentsData2, b.AttachmentsData attachmentsData3, u81.a.ChildPassportApplicationInstitutionData childPassportApplicationInstitutionData, c.AttachmentsData attachmentsData4, c.AttachmentsData attachmentsData5, ChildPassportApplicationCorrespondenceCountryData childPassportApplicationCorrespondenceCountryData, d dVar, m71.a.ChildPassportApplicationContactDetailsData childPassportApplicationContactDetailsData, o91.a.ChildPassportApplicationPickupMethodData childPassportApplicationPickupMethodData, l91.a.DiscountTypeData discountTypeData, c.AttachmentsData attachmentsData6, c.AttachmentsData attachmentsData7, c.AttachmentsData attachmentsData8, c.AttachmentsData attachmentsData9, c.AttachmentsData attachmentsData10, y91.c.SummaryData summaryData, n81.a.FaceDetectionData faceDetectionData, q qVar, String str2, String str3, int i15, Object obj) {
        String str4;
        String str5;
        List list2 = (i15 & 1) != 0 ? state.destinationsBackstack : list;
        c91.a.PassportTypeData passportTypeData2 = (i15 & 2) != 0 ? state.passportTypeData : passportTypeData;
        t91.a.ChildPassportApplicationReasonData childPassportApplicationReasonData2 = (i15 & 4) != 0 ? state.reasonData : childPassportApplicationReasonData;
        c.AttachmentsData attachmentsData11 = (i15 & 8) != 0 ? state.temporaryPassportReasonAttachmentsData : attachmentsData;
        r91.a.PassportOfficePlaceData passportOfficePlaceData2 = (i15 & 16) != 0 ? state.passportOfficePlaceData : passportOfficePlaceData;
        da1.a.WhoAgreesData whoAgreesData2 = (i15 & 32) != 0 ? state.whoAgreesData : whoAgreesData;
        ParentFormData parentFormData2 = (i15 & 64) != 0 ? state.parentFormData : parentFormData;
        String str6 = (i15 & 128) != 0 ? state.pickedChildId : str;
        ChildDataResult childDataResult2 = (i15 & 256) != 0 ? state.childData : childDataResult;
        k81.a.EnterChildContractData enterChildContractData2 = (i15 & 512) != 0 ? state.enterChildContractData : enterChildContractData;
        DataSplitData dataSplitData2 = (i15 & 1024) != 0 ? state.dataSplitData : dataSplitData;
        AddPhotoData addPhotoData2 = (i15 & 2048) != 0 ? state.photoData : addPhotoData;
        b.AttachmentsData attachmentsData12 = (i15 & PKIFailureInfo.certConfirmed) != 0 ? state.photoGlassesAttachment : attachmentsData2;
        b.AttachmentsData attachmentsData13 = (i15 & PKIFailureInfo.certRevoked) != 0 ? state.photoFaceCoverAttachment : attachmentsData3;
        List list3 = list2;
        u81.a.ChildPassportApplicationInstitutionData childPassportApplicationInstitutionData2 = (i15 & 16384) != 0 ? state.institutionData : childPassportApplicationInstitutionData;
        c.AttachmentsData attachmentsData14 = (i15 & 32768) != 0 ? state.signedConsentAttachmentsData : attachmentsData4;
        c.AttachmentsData attachmentsData15 = (i15 & PKIFailureInfo.notAuthorized) != 0 ? state.otherParentUnableToConsentAttachmentsData : attachmentsData5;
        ChildPassportApplicationCorrespondenceCountryData childPassportApplicationCorrespondenceCountryData2 = (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? state.correspondenceCountryData : childPassportApplicationCorrespondenceCountryData;
        d dVar2 = (i15 & PKIFailureInfo.transactionIdInUse) != 0 ? state.correspondenceAddress : dVar;
        m71.a.ChildPassportApplicationContactDetailsData childPassportApplicationContactDetailsData2 = (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? state.contactDetails : childPassportApplicationContactDetailsData;
        o91.a.ChildPassportApplicationPickupMethodData childPassportApplicationPickupMethodData2 = (i15 & PKIFailureInfo.badCertTemplate) != 0 ? state.pickupMethod : childPassportApplicationPickupMethodData;
        l91.a.DiscountTypeData discountTypeData2 = (i15 & PKIFailureInfo.badSenderNonce) != 0 ? state.discountTypeData : discountTypeData;
        c.AttachmentsData attachmentsData16 = (i15 & 4194304) != 0 ? state.abroadTreatmentAttachmentsData : attachmentsData6;
        c.AttachmentsData attachmentsData17 = (i15 & 8388608) != 0 ? state.kdrAttachmentsData : attachmentsData7;
        c.AttachmentsData attachmentsData18 = (i15 & 16777216) != 0 ? state.technicalIssueAttachmentsData : attachmentsData8;
        c.AttachmentsData attachmentsData19 = (i15 & 33554432) != 0 ? state.oldMoneyTransferAttachmentsData : attachmentsData9;
        c.AttachmentsData attachmentsData20 = (i15 & 67108864) != 0 ? state.newMoneyTransferAttachmentsData : attachmentsData10;
        y91.c.SummaryData summaryData2 = (i15 & 134217728) != 0 ? state.summaryData : summaryData;
        n81.a.FaceDetectionData faceDetectionData2 = (i15 & 268435456) != 0 ? state.faceDetectionData : faceDetectionData;
        q qVar2 = (i15 & PKIFailureInfo.duplicateCertReq) != 0 ? state.paymentType : qVar;
        String str7 = (i15 & 1073741824) != 0 ? state.applicationId : str2;
        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
            str5 = str7;
            str4 = state.applicationNumber;
        } else {
            str4 = str3;
            str5 = str7;
        }
        return state.a(list3, passportTypeData2, childPassportApplicationReasonData2, attachmentsData11, passportOfficePlaceData2, whoAgreesData2, parentFormData2, str6, childDataResult2, enterChildContractData2, dataSplitData2, addPhotoData2, attachmentsData12, attachmentsData13, childPassportApplicationInstitutionData2, attachmentsData14, attachmentsData15, childPassportApplicationCorrespondenceCountryData2, dVar2, childPassportApplicationContactDetailsData2, childPassportApplicationPickupMethodData2, discountTypeData2, attachmentsData16, attachmentsData17, attachmentsData18, attachmentsData19, attachmentsData20, summaryData2, faceDetectionData2, qVar2, str5, str4);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getPickedChildId() {
        return this.pickedChildId;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final o91.a.ChildPassportApplicationPickupMethodData getPickupMethod() {
        return this.pickupMethod;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final t91.a.ChildPassportApplicationReasonData getReasonData() {
        return this.reasonData;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final c.AttachmentsData getSignedConsentAttachmentsData() {
        return this.signedConsentAttachmentsData;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final y91.c.SummaryData getSummaryData() {
        return this.summaryData;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final c.AttachmentsData getTechnicalIssueAttachmentsData() {
        return this.technicalIssueAttachmentsData;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final c.AttachmentsData getTemporaryPassportReasonAttachmentsData() {
        return this.temporaryPassportReasonAttachmentsData;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final da1.a.WhoAgreesData getWhoAgreesData() {
        return this.whoAgreesData;
    }

    public final State a(List<String> destinationsBackstack, c91.a.PassportTypeData passportTypeData, t91.a.ChildPassportApplicationReasonData reasonData, c.AttachmentsData temporaryPassportReasonAttachmentsData, r91.a.PassportOfficePlaceData passportOfficePlaceData, da1.a.WhoAgreesData whoAgreesData, ParentFormData parentFormData, String pickedChildId, ChildDataResult childData, k81.a.EnterChildContractData enterChildContractData, DataSplitData dataSplitData, AddPhotoData photoData, b.AttachmentsData photoGlassesAttachment, b.AttachmentsData photoFaceCoverAttachment, u81.a.ChildPassportApplicationInstitutionData institutionData, c.AttachmentsData signedConsentAttachmentsData, c.AttachmentsData otherParentUnableToConsentAttachmentsData, ChildPassportApplicationCorrespondenceCountryData correspondenceCountryData, d correspondenceAddress, m71.a.ChildPassportApplicationContactDetailsData contactDetails, o91.a.ChildPassportApplicationPickupMethodData pickupMethod, l91.a.DiscountTypeData discountTypeData, c.AttachmentsData abroadTreatmentAttachmentsData, c.AttachmentsData kdrAttachmentsData, c.AttachmentsData technicalIssueAttachmentsData, c.AttachmentsData oldMoneyTransferAttachmentsData, c.AttachmentsData newMoneyTransferAttachmentsData, y91.c.SummaryData summaryData, n81.a.FaceDetectionData faceDetectionData, q paymentType, String applicationId, String applicationNumber) {
        return new State(destinationsBackstack, passportTypeData, reasonData, temporaryPassportReasonAttachmentsData, passportOfficePlaceData, whoAgreesData, parentFormData, pickedChildId, childData, enterChildContractData, dataSplitData, photoData, photoGlassesAttachment, photoFaceCoverAttachment, institutionData, signedConsentAttachmentsData, otherParentUnableToConsentAttachmentsData, correspondenceCountryData, correspondenceAddress, contactDetails, pickupMethod, discountTypeData, abroadTreatmentAttachmentsData, kdrAttachmentsData, technicalIssueAttachmentsData, oldMoneyTransferAttachmentsData, newMoneyTransferAttachmentsData, summaryData, faceDetectionData, paymentType, applicationId, applicationNumber);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c.AttachmentsData getAbroadTreatmentAttachmentsData() {
        return this.abroadTreatmentAttachmentsData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.destinationsBackstack, state.destinationsBackstack) && t.c(this.passportTypeData, state.passportTypeData) && t.c(this.reasonData, state.reasonData) && t.c(this.temporaryPassportReasonAttachmentsData, state.temporaryPassportReasonAttachmentsData) && t.c(this.passportOfficePlaceData, state.passportOfficePlaceData) && t.c(this.whoAgreesData, state.whoAgreesData) && t.c(this.parentFormData, state.parentFormData) && t.c(this.pickedChildId, state.pickedChildId) && t.c(this.childData, state.childData) && t.c(this.enterChildContractData, state.enterChildContractData) && t.c(this.dataSplitData, state.dataSplitData) && t.c(this.photoData, state.photoData) && t.c(this.photoGlassesAttachment, state.photoGlassesAttachment) && t.c(this.photoFaceCoverAttachment, state.photoFaceCoverAttachment) && t.c(this.institutionData, state.institutionData) && t.c(this.signedConsentAttachmentsData, state.signedConsentAttachmentsData) && t.c(this.otherParentUnableToConsentAttachmentsData, state.otherParentUnableToConsentAttachmentsData) && t.c(this.correspondenceCountryData, state.correspondenceCountryData) && t.c(this.correspondenceAddress, state.correspondenceAddress) && t.c(this.contactDetails, state.contactDetails) && t.c(this.pickupMethod, state.pickupMethod) && t.c(this.discountTypeData, state.discountTypeData) && t.c(this.abroadTreatmentAttachmentsData, state.abroadTreatmentAttachmentsData) && t.c(this.kdrAttachmentsData, state.kdrAttachmentsData) && t.c(this.technicalIssueAttachmentsData, state.technicalIssueAttachmentsData) && t.c(this.oldMoneyTransferAttachmentsData, state.oldMoneyTransferAttachmentsData) && t.c(this.newMoneyTransferAttachmentsData, state.newMoneyTransferAttachmentsData) && t.c(this.summaryData, state.summaryData) && t.c(this.faceDetectionData, state.faceDetectionData) && t.c(this.paymentType, state.paymentType) && t.c(this.applicationId, state.applicationId) && t.c(this.applicationNumber, state.applicationNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ChildDataResult getChildData() {
        return this.childData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final m71.a.ChildPassportApplicationContactDetailsData getContactDetails() {
        return this.contactDetails;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final d getCorrespondenceAddress() {
        return this.correspondenceAddress;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.destinationsBackstack.hashCode() * 31) + this.passportTypeData.hashCode()) * 31) + this.reasonData.hashCode()) * 31) + this.temporaryPassportReasonAttachmentsData.hashCode()) * 31) + this.passportOfficePlaceData.hashCode()) * 31) + this.whoAgreesData.hashCode()) * 31;
        ParentFormData parentFormData = this.parentFormData;
        int iHashCode2 = (iHashCode + (parentFormData == null ? 0 : parentFormData.hashCode())) * 31;
        String str = this.pickedChildId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ChildDataResult childDataResult = this.childData;
        int iHashCode4 = (((iHashCode3 + (childDataResult == null ? 0 : childDataResult.hashCode())) * 31) + this.enterChildContractData.hashCode()) * 31;
        DataSplitData dataSplitData = this.dataSplitData;
        int iHashCode5 = (iHashCode4 + (dataSplitData == null ? 0 : dataSplitData.hashCode())) * 31;
        AddPhotoData addPhotoData = this.photoData;
        int iHashCode6 = (((((iHashCode5 + (addPhotoData == null ? 0 : addPhotoData.hashCode())) * 31) + this.photoGlassesAttachment.hashCode()) * 31) + this.photoFaceCoverAttachment.hashCode()) * 31;
        u81.a.ChildPassportApplicationInstitutionData childPassportApplicationInstitutionData = this.institutionData;
        int iHashCode7 = (((((iHashCode6 + (childPassportApplicationInstitutionData == null ? 0 : childPassportApplicationInstitutionData.hashCode())) * 31) + this.signedConsentAttachmentsData.hashCode()) * 31) + this.otherParentUnableToConsentAttachmentsData.hashCode()) * 31;
        ChildPassportApplicationCorrespondenceCountryData childPassportApplicationCorrespondenceCountryData = this.correspondenceCountryData;
        int iHashCode8 = (iHashCode7 + (childPassportApplicationCorrespondenceCountryData == null ? 0 : childPassportApplicationCorrespondenceCountryData.hashCode())) * 31;
        d dVar = this.correspondenceAddress;
        int iHashCode9 = (iHashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        m71.a.ChildPassportApplicationContactDetailsData childPassportApplicationContactDetailsData = this.contactDetails;
        int iHashCode10 = (iHashCode9 + (childPassportApplicationContactDetailsData == null ? 0 : childPassportApplicationContactDetailsData.hashCode())) * 31;
        o91.a.ChildPassportApplicationPickupMethodData childPassportApplicationPickupMethodData = this.pickupMethod;
        int iHashCode11 = (iHashCode10 + (childPassportApplicationPickupMethodData == null ? 0 : childPassportApplicationPickupMethodData.hashCode())) * 31;
        l91.a.DiscountTypeData discountTypeData = this.discountTypeData;
        int iHashCode12 = (((((((((((iHashCode11 + (discountTypeData == null ? 0 : discountTypeData.hashCode())) * 31) + this.abroadTreatmentAttachmentsData.hashCode()) * 31) + this.kdrAttachmentsData.hashCode()) * 31) + this.technicalIssueAttachmentsData.hashCode()) * 31) + this.oldMoneyTransferAttachmentsData.hashCode()) * 31) + this.newMoneyTransferAttachmentsData.hashCode()) * 31;
        y91.c.SummaryData summaryData = this.summaryData;
        int iHashCode13 = (iHashCode12 + (summaryData == null ? 0 : summaryData.hashCode())) * 31;
        n81.a.FaceDetectionData faceDetectionData = this.faceDetectionData;
        int iHashCode14 = (iHashCode13 + (faceDetectionData == null ? 0 : faceDetectionData.hashCode())) * 31;
        q qVar = this.paymentType;
        int iHashCode15 = (iHashCode14 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str2 = this.applicationId;
        int iHashCode16 = (iHashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.applicationNumber;
        return iHashCode16 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ChildPassportApplicationCorrespondenceCountryData getCorrespondenceCountryData() {
        return this.correspondenceCountryData;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final DataSplitData getDataSplitData() {
        return this.dataSplitData;
    }

    public final List<String> k() {
        return this.destinationsBackstack;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final l91.a.DiscountTypeData getDiscountTypeData() {
        return this.discountTypeData;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final k81.a.EnterChildContractData getEnterChildContractData() {
        return this.enterChildContractData;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final n81.a.FaceDetectionData getFaceDetectionData() {
        return this.faceDetectionData;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final u81.a.ChildPassportApplicationInstitutionData getInstitutionData() {
        return this.institutionData;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final c.AttachmentsData getKdrAttachmentsData() {
        return this.kdrAttachmentsData;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final c.AttachmentsData getNewMoneyTransferAttachmentsData() {
        return this.newMoneyTransferAttachmentsData;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final c.AttachmentsData getOldMoneyTransferAttachmentsData() {
        return this.oldMoneyTransferAttachmentsData;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final c.AttachmentsData getOtherParentUnableToConsentAttachmentsData() {
        return this.otherParentUnableToConsentAttachmentsData;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final ParentFormData getParentFormData() {
        return this.parentFormData;
    }

    public String toString() {
        return "State(destinationsBackstack=" + this.destinationsBackstack + ", passportTypeData=" + this.passportTypeData + ", reasonData=" + this.reasonData + ", temporaryPassportReasonAttachmentsData=" + this.temporaryPassportReasonAttachmentsData + ", passportOfficePlaceData=" + this.passportOfficePlaceData + ", whoAgreesData=" + this.whoAgreesData + ", parentFormData=" + this.parentFormData + ", pickedChildId=" + this.pickedChildId + ", childData=" + this.childData + ", enterChildContractData=" + this.enterChildContractData + ", dataSplitData=" + this.dataSplitData + ", photoData=" + this.photoData + ", photoGlassesAttachment=" + this.photoGlassesAttachment + ", photoFaceCoverAttachment=" + this.photoFaceCoverAttachment + ", institutionData=" + this.institutionData + ", signedConsentAttachmentsData=" + this.signedConsentAttachmentsData + ", otherParentUnableToConsentAttachmentsData=" + this.otherParentUnableToConsentAttachmentsData + ", correspondenceCountryData=" + this.correspondenceCountryData + ", correspondenceAddress=" + this.correspondenceAddress + ", contactDetails=" + this.contactDetails + ", pickupMethod=" + this.pickupMethod + ", discountTypeData=" + this.discountTypeData + ", abroadTreatmentAttachmentsData=" + this.abroadTreatmentAttachmentsData + ", kdrAttachmentsData=" + this.kdrAttachmentsData + ", technicalIssueAttachmentsData=" + this.technicalIssueAttachmentsData + ", oldMoneyTransferAttachmentsData=" + this.oldMoneyTransferAttachmentsData + ", newMoneyTransferAttachmentsData=" + this.newMoneyTransferAttachmentsData + ", summaryData=" + this.summaryData + ", faceDetectionData=" + this.faceDetectionData + ", paymentType=" + this.paymentType + ", applicationId=" + this.applicationId + ", applicationNumber=" + this.applicationNumber + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final r91.a.PassportOfficePlaceData getPassportOfficePlaceData() {
        return this.passportOfficePlaceData;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final c91.a.PassportTypeData getPassportTypeData() {
        return this.passportTypeData;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final q getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final AddPhotoData getPhotoData() {
        return this.photoData;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final b.AttachmentsData getPhotoFaceCoverAttachment() {
        return this.photoFaceCoverAttachment;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final b.AttachmentsData getPhotoGlassesAttachment() {
        return this.photoGlassesAttachment;
    }
}
