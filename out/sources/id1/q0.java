package id1;

import af1.PkdCodeMainSelectionContractData;
import cc1.BusinessAddressAvailabilityContractData;
import cc1.BusinessAddressAvailabilityStepResult;
import de1.IncomeTaxExceededAddFileModel;
import de1.KrusData;
import de1.SocialInsuranceQuestions;
import df1.SocialInsuranceSelectionContractData;
import ed1.StatementStepResult;
import fc1.CompanyNameContractData;
import fc1.CompanyNameStepResult;
import gf1.StatementContractData;
import ic1.ContactInfoStepResult;
import jd1.OpenCompanyWizardData;
import lc1.CorrespondenceAddressSelectionContractData;
import lc1.CorrespondenceAddressSelectionStepResult;
import ld1.KnownUserDataModel;
import ld1.KrusOfficeModel;
import ld1.TaxOfficeModel;
import lf1.TaxOfficeContractData;
import oc1.CorrespondencePostOfficeBoxContractData;
import oc1.CorrespondencePostOfficeBoxStepResult;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qc1.EdorSectionStepResult;
import rc1.HomeAddressStepResult;
import rd1.EdorAddressData;
import sb1.AccountingDocumentAddressSelectionContractData;
import tc1.IncomeTaxFormSelectionContractData;
import tc1.IncomeTaxFormSelectionStepResult;
import wb1.AccountingDocumentSelectionContractData;
import wc1.KnownUserDataStepResult;
import xe1.PkdCodeContractData;
import yc1.KrusSectionStepResult;
import zb1.BusinessAddressSelectionContractData;
import zb1.BusinessAddressSelectionStepResult;
import zd1.HomeAddressContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0016H\u0016¢\u0006\u0004\b0\u0010\u0018J\u0017\u00102\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00162\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020SH\u0016¢\u0006\u0004\bT\u0010UJ\u0019\u0010W\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bW\u0010XJ\u0019\u0010Z\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010YH\u0016¢\u0006\u0004\bZ\u0010[J\u0019\u0010]\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\\H\u0016¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010_H\u0016¢\u0006\u0004\b`\u0010aJ\u0019\u0010c\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010bH\u0016¢\u0006\u0004\bc\u0010dJ\u0019\u0010f\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020hH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010l\u001a\u00020kH\u0016¢\u0006\u0004\bl\u0010mR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0017\u0010z\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001c\u0010\u0080\u0001\u001a\u00020{8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR3\u0010\u0087\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0081\u00018\u0014X\u0094\u0004¢\u0006\u0017\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u0012\u0005\b\u0086\u0001\u0010\u0018\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R'\u0010\u008e\u0001\u001a\n\u0012\u0005\u0012\u00030\u0089\u00010\u0088\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R&\u0010\u0091\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u0088\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010\u008b\u0001\u001a\u0005\b|\u0010\u008d\u0001R,\u0010\u0012\u001a\t\u0012\u0004\u0012\u00020\u00130\u0092\u00018\u0016X\u0096\u0004¢\u0006\u0017\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u0012\u0005\b\u0097\u0001\u0010\u0018\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u009d\u0001\u001a\u00030\u0098\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010 \u0001\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0016\u0010¢\u0001\u001a\u00020{8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010\u007fR\u0019\u0010¥\u0001\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010¨\u0001\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010«\u0001\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010®\u0001\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010±\u0001\u001a\u0004\u0018\u00010@8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0019\u0010´\u0001\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R\u0019\u0010¶\u0001\u001a\u0004\u0018\u00010C8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010µ\u0001R\u0019\u0010¹\u0001\u001a\u0004\u0018\u00010F8VX\u0096\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010¼\u0001\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R\u0019\u0010¿\u0001\u001a\u0004\u0018\u0001048VX\u0096\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0019\u0010Â\u0001\u001a\u0004\u0018\u0001078VX\u0096\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u0010Å\u0001\u001a\u0004\u0018\u00010:8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0019\u0010È\u0001\u001a\u0004\u0018\u00010I8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0019\u0010Ë\u0001\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0019\u0010Î\u0001\u001a\u0004\u0018\u00010S8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0019\u0010Ñ\u0001\u001a\u0004\u0018\u00010=8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u001a\u0010Õ\u0001\u001a\u0005\u0018\u00010Ò\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001¨\u0006Ö\u0001"}, d2 = {"Lid1/q0;", "Ll00/g;", "Lid1/h0;", "", "Lid1/i0;", "Lid1/g0;", "Lyy/a;", "stateMachineFactory", "Lkd1/b;", "nestedContainerMapper", "Ljd1/b;", "nestedWizardDataSource", "Lse1/b;", "dialogMapper", "Loa1/b;", "isCompanyEmailCollectingFFActiveUC", "<init>", "(Lyy/a;Lkd1/b;Ljd1/b;Lse1/b;Loa1/b;)V", "state", "Lid1/i0$a;", "q9", "(Lid1/h0;)Lid1/i0$a;", "Loq/i0;", "s9", "()V", "Lfb1/c;", "destination", "v3", "(Lfb1/c;)V", "Lld1/h;", "data", "N2", "(Lld1/h;)V", "Lic1/b;", "M6", "(Lic1/b;)V", "Lzd1/b;", "T2", "(Lzd1/b;)V", "Lfc1/b;", "L6", "(Lfc1/b;)V", "Lcc1/b;", "i4", "(Lcc1/b;)V", "Lxe1/b;", "P1", "(Lxe1/b;)V", "w4", "Laf1/b;", "f0", "(Laf1/b;)V", "Ldf1/b;", "p6", "(Ldf1/b;)V", "Lwb1/b;", "T1", "(Lwb1/b;)V", "Lsb1/b;", "x7", "(Lsb1/b;)V", "Ltc1/b;", "H8", "(Ltc1/b;)V", "Lzb1/b;", "u0", "(Lzb1/b;)V", "Llc1/b;", "m2", "(Llc1/b;)V", "Loc1/b;", "E8", "(Loc1/b;)V", "Llf1/b;", "j8", "(Llf1/b;)V", "Lgf1/b;", "l2", "(Lgf1/b;)V", "Lrd1/c;", "answer", "y4", "(Lrd1/c;)V", "Lrd1/b;", "e6", "(Lrd1/b;)V", "Lde1/f;", "K8", "(Lde1/f;)V", "Lld1/i;", "c8", "(Lld1/i;)V", "Lld1/r;", "F4", "(Lld1/r;)V", "Lde1/d;", "V3", "(Lde1/d;)V", "Lde1/b;", "Q3", "(Lde1/b;)V", "Lde1/c;", "M8", "(Lde1/c;)V", "Lde1/a;", "p4", "(Lde1/a;)V", "Ljd1/a;", "Q0", "()Ljd1/a;", "b", "Lkd1/b;", "c", "Ljd1/b;", "d", "Lse1/b;", "e", "Loa1/b;", "f", "Lid1/h0;", "getInitialState", "()Lid1/h0;", "initialState", "", "g", "Loq/k;", "o9", "()Z", "companyNewContactEnabled", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lg00/a;", "Lid1/b;", "j", "Lg00/a;", "p9", "()Lg00/a;", "navAction", "Lid1/c;", "k", "nestedNavAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "Lld1/l;", "m", "Lld1/l;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Lld1/l;", "processType", "N0", "()Lic1/b;", "contactInfoData", "z4", "isCompanyNewContactEnabled", "q", "()Lld1/h;", "knownUserData", "r", "()Lzd1/b;", "homeAddressData", "X4", "()Lfc1/b;", "companyNameForm", "A4", "()Lcc1/b;", "businessAddressAvailabilityData", "E", "()Lzb1/b;", "businessAddressData", "j0", "()Lxe1/b;", "pkdCodeContractData", "()Llc1/b;", "correspondenceAddressData", "E0", "()Loc1/b;", "postOfficeBoxData", "k4", "()Laf1/b;", "pkdCodeMainSelectionContractData", "C4", "()Ldf1/b;", "selectedSocialInsurance", "m4", "()Lwb1/b;", "accountingDocumentSelection", "n2", "()Lsb1/b;", "accountingDocumentAddress", "I6", "()Llf1/b;", "taxOfficeData", "i5", "()Lgf1/b;", "statement", "E1", "()Lrd1/b;", "edorAddressData", "k7", "()Ltc1/b;", "incomeTaxFormSelectionData", "Lde1/e;", "m3", "()Lde1/e;", "krusData", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 extends l00.g<State, Object> implements i0, g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kd1.b nestedContainerMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jd1.b nestedWizardDataSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final se1.b dialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oa1.b isCompanyEmailCollectingFFActiveUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oq.k companyNewContactEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g00.a<id1.b> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final g00.a<id1.c> nestedNavAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<i0.Data> state;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ld1.l processType;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<i0.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f91086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q0 f91087b;

        /* JADX INFO: renamed from: id1.q0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2170a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f91088a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q0 f91089b;

            /* JADX INFO: renamed from: id1.q0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2171a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f91090d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f91091e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f91092f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f91094h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f91095j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f91096k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f91097l;

                public C2171a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f91090d = obj;
                    this.f91091e |= PKIFailureInfo.systemUnavail;
                    return C2170a.this.F(null, this);
                }
            }

            public C2170a(mu.h hVar, q0 q0Var) {
                this.f91088a = hVar;
                this.f91089b = q0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2171a c2171a;
                if (eVar instanceof C2171a) {
                    c2171a = (C2171a) eVar;
                    int i15 = c2171a.f91091e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2171a.f91091e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2171a = new C2171a(eVar);
                    }
                } else {
                    c2171a = new C2171a(eVar);
                }
                Object obj2 = c2171a.f91090d;
                Object objE = uq.b.e();
                int i16 = c2171a.f91091e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f91088a;
                    i0.Data dataQ9 = this.f91089b.q9((State) obj);
                    c2171a.f91092f = vq.j.a(obj);
                    c2171a.f91094h = vq.j.a(c2171a);
                    c2171a.f91095j = vq.j.a(obj);
                    c2171a.f91096k = vq.j.a(hVar);
                    c2171a.f91097l = 0;
                    c2171a.f91091e = 1;
                    if (hVar.F(dataQ9, c2171a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, q0 q0Var) {
            this.f91086a = gVar;
            this.f91087b = q0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super i0.Data> hVar, tq.e eVar) {
            Object objA = this.f91086a.a(new C2170a(hVar, this.f91087b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/o;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/o;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<SaveHomeAddress, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91099f;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveHomeAddress saveHomeAddress = (SaveHomeAddress) this.f91099f;
            uq.b.e();
            if (this.f91098e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.q.f60797a, new HomeAddressStepResult(saveHomeAddress.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveHomeAddress saveHomeAddress, State state, tq.e<? super oq.i0> eVar) {
            a0 a0Var = q0.this.new a0(eVar);
            a0Var.f91099f = saveHomeAddress;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/l;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/l;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<SaveCorrespondencePostOfficeBox, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91102f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveCorrespondencePostOfficeBox saveCorrespondencePostOfficeBox = (SaveCorrespondencePostOfficeBox) this.f91102f;
            uq.b.e();
            if (this.f91101e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.i.f60781a, new CorrespondencePostOfficeBoxStepResult(saveCorrespondencePostOfficeBox.getData()));
            q0.this.nestedWizardDataSource.a(fb1.c.h.f60779a, new CorrespondenceAddressSelectionStepResult(new CorrespondenceAddressSelectionContractData(null)));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveCorrespondencePostOfficeBox saveCorrespondencePostOfficeBox, State state, tq.e<? super oq.i0> eVar) {
            b bVar = q0.this.new b(eVar);
            bVar.f91102f = saveCorrespondencePostOfficeBox;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/j;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/j;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<SaveContactInfo, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91105f;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveContactInfo saveContactInfo = (SaveContactInfo) this.f91105f;
            uq.b.e();
            if (this.f91104e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.g.f60777a, new ContactInfoStepResult(saveContactInfo.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveContactInfo saveContactInfo, State state, tq.e<? super oq.i0> eVar) {
            b0 b0Var = q0.this.new b0(eVar);
            b0Var.f91105f = saveContactInfo;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/z;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/z;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<SavePkdCodes, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91108f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SavePkdCodes savePkdCodes = (SavePkdCodes) this.f91108f;
            uq.b.e();
            if (this.f91107e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.u.f60805a, new zc1.a(savePkdCodes.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SavePkdCodes savePkdCodes, State state, tq.e<? super oq.i0> eVar) {
            c cVar = q0.this.new c(eVar);
            cVar.f91108f = savePkdCodes;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/i;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/i;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<SaveCompanyName, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91111f;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveCompanyName saveCompanyName = (SaveCompanyName) this.f91111f;
            uq.b.e();
            if (this.f91110e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.m.f60789a, new CompanyNameStepResult(saveCompanyName.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveCompanyName saveCompanyName, State state, tq.e<? super oq.i0> eVar) {
            c0 c0Var = q0.this.new c0(eVar);
            c0Var.f91111f = saveCompanyName;
            return c0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lid1/d;", "<unused var>", "Lid1/h0;", "Loq/i0;", "<anonymous>", "(Lid1/d;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<id1.d, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91113e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f91113e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.d(fb1.c.v.f60807a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id1.d dVar, State state, tq.e<? super oq.i0> eVar) {
            return q0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/h;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/h;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<SaveBusinessAddressAvailability, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91116f;

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveBusinessAddressAvailability saveBusinessAddressAvailability = (SaveBusinessAddressAvailability) this.f91116f;
            uq.b.e();
            if (this.f91115e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.C1372c.f60769a, new BusinessAddressAvailabilityStepResult(saveBusinessAddressAvailability.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveBusinessAddressAvailability saveBusinessAddressAvailability, State state, tq.e<? super oq.i0> eVar) {
            d0 d0Var = q0.this.new d0(eVar);
            d0Var.f91116f = saveBusinessAddressAvailability;
            return d0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/y;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/y;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SavePkdCodeMainSelection, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91119f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SavePkdCodeMainSelection savePkdCodeMainSelection = (SavePkdCodeMainSelection) this.f91119f;
            uq.b.e();
            if (this.f91118e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.v.f60807a, new ad1.a(savePkdCodeMainSelection.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SavePkdCodeMainSelection savePkdCodeMainSelection, State state, tq.e<? super oq.i0> eVar) {
            e eVar2 = q0.this.new e(eVar);
            eVar2.f91119f = savePkdCodeMainSelection;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/g;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/g;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.q<SaveBusinessAddress, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91122f;

        e0(tq.e<? super e0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveBusinessAddress saveBusinessAddress = (SaveBusinessAddress) this.f91122f;
            uq.b.e();
            if (this.f91121e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.d.f60771a, new BusinessAddressSelectionStepResult(saveBusinessAddress.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveBusinessAddress saveBusinessAddress, State state, tq.e<? super oq.i0> eVar) {
            e0 e0Var = q0.this.new e0(eVar);
            e0Var.f91122f = saveBusinessAddress;
            return e0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/a0;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/a0;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<SaveSocialInsuranceSelection, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91124e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91125f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveSocialInsuranceSelection saveSocialInsuranceSelection = (SaveSocialInsuranceSelection) this.f91125f;
            uq.b.e();
            if (this.f91124e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.p.f60795a, new dd1.a(saveSocialInsuranceSelection.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveSocialInsuranceSelection saveSocialInsuranceSelection, State state, tq.e<? super oq.i0> eVar) {
            f fVar = q0.this.new f(eVar);
            fVar.f91125f = saveSocialInsuranceSelection;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/k;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/k;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<SaveCorrespondenceAddress, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91128f;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveCorrespondenceAddress saveCorrespondenceAddress = (SaveCorrespondenceAddress) this.f91128f;
            uq.b.e();
            if (this.f91127e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.h.f60779a, new CorrespondenceAddressSelectionStepResult(saveCorrespondenceAddress.getData()));
            q0.this.nestedWizardDataSource.a(fb1.c.i.f60781a, new CorrespondencePostOfficeBoxStepResult(new CorrespondencePostOfficeBoxContractData(null)));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveCorrespondenceAddress saveCorrespondenceAddress, State state, tq.e<? super oq.i0> eVar) {
            f0 f0Var = q0.this.new f0(eVar);
            f0Var.f91128f = saveCorrespondenceAddress;
            return f0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/f;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/f;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<SaveAccountingDocumentSelection, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91131f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveAccountingDocumentSelection saveAccountingDocumentSelection = (SaveAccountingDocumentSelection) this.f91131f;
            uq.b.e();
            if (this.f91130e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.a.f60765a, new wb1.c(saveAccountingDocumentSelection.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveAccountingDocumentSelection saveAccountingDocumentSelection, State state, tq.e<? super oq.i0> eVar) {
            g gVar = q0.this.new g(eVar);
            gVar.f91131f = saveAccountingDocumentSelection;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/e;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/e;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<SaveAccountingDocumentAddressSelection, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91134f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveAccountingDocumentAddressSelection saveAccountingDocumentAddressSelection = (SaveAccountingDocumentAddressSelection) this.f91134f;
            uq.b.e();
            if (this.f91133e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.b.f60767a, new sb1.c(saveAccountingDocumentAddressSelection.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveAccountingDocumentAddressSelection saveAccountingDocumentAddressSelection, State state, tq.e<? super oq.i0> eVar) {
            h hVar = q0.this.new h(eVar);
            hVar.f91134f = saveAccountingDocumentAddressSelection;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/c0;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/c0;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<SaveTaxOffice, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91137f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveTaxOffice saveTaxOffice = (SaveTaxOffice) this.f91137f;
            uq.b.e();
            if (this.f91136e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.e.f60773a, new hd1.a(saveTaxOffice.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveTaxOffice saveTaxOffice, State state, tq.e<? super oq.i0> eVar) {
            i iVar = q0.this.new i(eVar);
            iVar.f91137f = saveTaxOffice;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/m;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/m;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<SaveEdorAddressData, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91140f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveEdorAddressData saveEdorAddressData = (SaveEdorAddressData) this.f91140f;
            uq.b.e();
            if (this.f91139e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.j.f60783a, new EdorSectionStepResult(saveEdorAddressData.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveEdorAddressData saveEdorAddressData, State state, tq.e<? super oq.i0> eVar) {
            j jVar = q0.this.new j(eVar);
            jVar.f91140f = saveEdorAddressData;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/n;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/n;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<SaveEdorAddressSelectionAnswer, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91143f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            EdorAddressData edorAddressData;
            SaveEdorAddressSelectionAnswer saveEdorAddressSelectionAnswer = (SaveEdorAddressSelectionAnswer) this.f91143f;
            uq.b.e();
            if (this.f91142e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            jd1.b bVar = q0.this.nestedWizardDataSource;
            fb1.c.j jVar = fb1.c.j.f60783a;
            EdorAddressData edorAddressData2 = (EdorAddressData) bVar.b(jVar);
            jd1.b bVar2 = q0.this.nestedWizardDataSource;
            if (edorAddressData2 == null || (edorAddressData = EdorAddressData.b(edorAddressData2, saveEdorAddressSelectionAnswer.getData(), null, null, 6, null)) == null) {
                edorAddressData = new EdorAddressData(saveEdorAddressSelectionAnswer.getData(), null, null, 6, null);
            }
            bVar2.a(jVar, new EdorSectionStepResult(edorAddressData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveEdorAddressSelectionAnswer saveEdorAddressSelectionAnswer, State state, tq.e<? super oq.i0> eVar) {
            k kVar = q0.this.new k(eVar);
            kVar.f91143f = saveEdorAddressSelectionAnswer;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lid1/f0;", "action", "Lk10/c0;", "Lid1/h0;", "state", "Lk10/l;", "<anonymous>", "(Lid1/f0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<StepChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f91147g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(StepChanged stepChanged, State state) {
            return state.a(stepChanged.getDestination());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final StepChanged stepChanged = (StepChanged) this.f91146f;
            k10.c0 c0Var = (k10.c0) this.f91147g;
            uq.b.e();
            if (this.f91145e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: id1.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return q0.l.O(stepChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(StepChanged stepChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = new l(eVar);
            lVar.f91146f = stepChanged;
            lVar.f91147g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/p;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/p;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<SaveIncomeTaxFormSelection, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91149f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveIncomeTaxFormSelection saveIncomeTaxFormSelection = (SaveIncomeTaxFormSelection) this.f91149f;
            uq.b.e();
            if (this.f91148e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.r.f60799a, new IncomeTaxFormSelectionStepResult(saveIncomeTaxFormSelection.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveIncomeTaxFormSelection saveIncomeTaxFormSelection, State state, tq.e<? super oq.i0> eVar) {
            m mVar = q0.this.new m(eVar);
            mVar.f91149f = saveIncomeTaxFormSelection;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/w;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/w;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<SaveKrusOfficeSelection, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91152f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveKrusOfficeSelection saveKrusOfficeSelection = (SaveKrusOfficeSelection) this.f91152f;
            uq.b.e();
            if (this.f91151e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            jd1.b bVar = q0.this.nestedWizardDataSource;
            fb1.c.t tVar = fb1.c.t.f60803a;
            KrusData krusData2 = (KrusData) bVar.b(tVar);
            jd1.b bVar2 = q0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, null, null, saveKrusOfficeSelection.getData(), null, null, null, null, 123, null)) == null) {
                krusData = new KrusData(null, null, saveKrusOfficeSelection.getData(), null, null, null, null, 123, null);
            }
            bVar2.a(tVar, new KrusSectionStepResult(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusOfficeSelection saveKrusOfficeSelection, State state, tq.e<? super oq.i0> eVar) {
            n nVar = q0.this.new n(eVar);
            nVar.f91152f = saveKrusOfficeSelection;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/d0;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/d0;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<SaveTaxOfficeSelection, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91155f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveTaxOfficeSelection saveTaxOfficeSelection = (SaveTaxOfficeSelection) this.f91155f;
            uq.b.e();
            if (this.f91154e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            jd1.b bVar = q0.this.nestedWizardDataSource;
            fb1.c.t tVar = fb1.c.t.f60803a;
            KrusData krusData2 = (KrusData) bVar.b(tVar);
            jd1.b bVar2 = q0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, null, null, null, saveTaxOfficeSelection.getData(), null, null, null, 119, null)) == null) {
                krusData = new KrusData(null, null, null, saveTaxOfficeSelection.getData(), null, null, null, 119, null);
            }
            bVar2.a(tVar, new KrusSectionStepResult(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveTaxOfficeSelection saveTaxOfficeSelection, State state, tq.e<? super oq.i0> eVar) {
            o oVar = q0.this.new o(eVar);
            oVar.f91155f = saveTaxOfficeSelection;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/v;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/v;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<SaveKrusIncomeTaxExceededInfo, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91158f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveKrusIncomeTaxExceededInfo saveKrusIncomeTaxExceededInfo = (SaveKrusIncomeTaxExceededInfo) this.f91158f;
            uq.b.e();
            if (this.f91157e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            jd1.b bVar = q0.this.nestedWizardDataSource;
            fb1.c.t tVar = fb1.c.t.f60803a;
            KrusData krusData2 = (KrusData) bVar.b(tVar);
            jd1.b bVar2 = q0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, null, saveKrusIncomeTaxExceededInfo.getData(), null, null, null, null, null, 125, null)) == null) {
                krusData = new KrusData(null, saveKrusIncomeTaxExceededInfo.getData(), null, null, null, null, null, 125, null);
            }
            bVar2.a(tVar, new KrusSectionStepResult(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusIncomeTaxExceededInfo saveKrusIncomeTaxExceededInfo, State state, tq.e<? super oq.i0> eVar) {
            p pVar = q0.this.new p(eVar);
            pVar.f91158f = saveKrusIncomeTaxExceededInfo;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/t;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/t;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<SaveKrusIncomeTaxExceededCertificate, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91161f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveKrusIncomeTaxExceededCertificate saveKrusIncomeTaxExceededCertificate = (SaveKrusIncomeTaxExceededCertificate) this.f91161f;
            uq.b.e();
            if (this.f91160e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            jd1.b bVar = q0.this.nestedWizardDataSource;
            fb1.c.t tVar = fb1.c.t.f60803a;
            KrusData krusData2 = (KrusData) bVar.b(tVar);
            jd1.b bVar2 = q0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, null, null, null, null, saveKrusIncomeTaxExceededCertificate.getData(), null, null, 111, null)) == null) {
                krusData = new KrusData(null, null, null, null, saveKrusIncomeTaxExceededCertificate.getData(), null, null, 111, null);
            }
            bVar2.a(tVar, new KrusSectionStepResult(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusIncomeTaxExceededCertificate saveKrusIncomeTaxExceededCertificate, State state, tq.e<? super oq.i0> eVar) {
            q qVar = q0.this.new q(eVar);
            qVar.f91161f = saveKrusIncomeTaxExceededCertificate;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/u;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/u;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<SaveKrusIncomeTaxExceededCertificateInfo, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91164f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveKrusIncomeTaxExceededCertificateInfo saveKrusIncomeTaxExceededCertificateInfo = (SaveKrusIncomeTaxExceededCertificateInfo) this.f91164f;
            uq.b.e();
            if (this.f91163e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            jd1.b bVar = q0.this.nestedWizardDataSource;
            fb1.c.t tVar = fb1.c.t.f60803a;
            KrusData krusData2 = (KrusData) bVar.b(tVar);
            jd1.b bVar2 = q0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, null, null, null, null, null, saveKrusIncomeTaxExceededCertificateInfo.getData(), null, 95, null)) == null) {
                krusData = new KrusData(null, null, null, null, null, saveKrusIncomeTaxExceededCertificateInfo.getData(), null, 95, null);
            }
            bVar2.a(tVar, new KrusSectionStepResult(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusIncomeTaxExceededCertificateInfo saveKrusIncomeTaxExceededCertificateInfo, State state, tq.e<? super oq.i0> eVar) {
            r rVar = q0.this.new r(eVar);
            rVar.f91164f = saveKrusIncomeTaxExceededCertificateInfo;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/x;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/x;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<SaveKrusQuestionsAnswers, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91166e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91167f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveKrusQuestionsAnswers saveKrusQuestionsAnswers = (SaveKrusQuestionsAnswers) this.f91167f;
            uq.b.e();
            if (this.f91166e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            jd1.b bVar = q0.this.nestedWizardDataSource;
            fb1.c.t tVar = fb1.c.t.f60803a;
            KrusData krusData2 = (KrusData) bVar.b(tVar);
            jd1.b bVar2 = q0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, saveKrusQuestionsAnswers.getData(), null, null, null, null, null, null, 126, null)) == null) {
                krusData = new KrusData(saveKrusQuestionsAnswers.getData(), null, null, null, null, null, null, 126, null);
            }
            bVar2.a(tVar, new KrusSectionStepResult(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusQuestionsAnswers saveKrusQuestionsAnswers, State state, tq.e<? super oq.i0> eVar) {
            s sVar = q0.this.new s(eVar);
            sVar.f91167f = saveKrusQuestionsAnswers;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/s;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/s;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<SaveKrusIncomeTaxExceededAddFile, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91169e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91170f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            KrusData krusData;
            SaveKrusIncomeTaxExceededAddFile saveKrusIncomeTaxExceededAddFile = (SaveKrusIncomeTaxExceededAddFile) this.f91170f;
            uq.b.e();
            if (this.f91169e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            jd1.b bVar = q0.this.nestedWizardDataSource;
            fb1.c.t tVar = fb1.c.t.f60803a;
            KrusData krusData2 = (KrusData) bVar.b(tVar);
            jd1.b bVar2 = q0.this.nestedWizardDataSource;
            if (krusData2 == null || (krusData = KrusData.b(krusData2, null, null, null, null, null, null, saveKrusIncomeTaxExceededAddFile.getData(), 63, null)) == null) {
                krusData = new KrusData(null, null, null, null, null, null, saveKrusIncomeTaxExceededAddFile.getData(), 63, null);
            }
            bVar2.a(tVar, new KrusSectionStepResult(krusData));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusIncomeTaxExceededAddFile saveKrusIncomeTaxExceededAddFile, State state, tq.e<? super oq.i0> eVar) {
            t tVar = q0.this.new t(eVar);
            tVar.f91170f = saveKrusIncomeTaxExceededAddFile;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/r;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/r;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<SaveKrusData, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91173f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveKrusData saveKrusData = (SaveKrusData) this.f91173f;
            uq.b.e();
            if (this.f91172e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.t.f60803a, new KrusSectionStepResult(saveKrusData.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKrusData saveKrusData, State state, tq.e<? super oq.i0> eVar) {
            u uVar = q0.this.new u(eVar);
            uVar.f91173f = saveKrusData;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/b0;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/b0;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<SaveStatement, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91176f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveStatement saveStatement = (SaveStatement) this.f91176f;
            uq.b.e();
            if (this.f91175e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.x.f60811a, new StatementStepResult(saveStatement.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveStatement saveStatement, State state, tq.e<? super oq.i0> eVar) {
            v vVar = q0.this.new v(eVar);
            vVar.f91176f = saveStatement;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/b;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/b;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<id1.b, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91179f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            id1.b bVar = (id1.b) this.f91179f;
            Object objE = uq.b.e();
            int i15 = this.f91178e;
            if (i15 == 0) {
                oq.u.b(obj);
                g00.a<id1.b> aVarP9 = q0.this.p9();
                this.f91179f = vq.j.a(bVar);
                this.f91178e = 1;
                if (aVarP9.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id1.b bVar, State state, tq.e<? super oq.i0> eVar) {
            w wVar = q0.this.new w(eVar);
            wVar.f91179f = bVar;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/e0;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/e0;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<ShowDialog, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91181e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91182f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowDialog showDialog = (ShowDialog) this.f91182f;
            Object objE = uq.b.e();
            int i15 = this.f91181e;
            if (i15 == 0) {
                oq.u.b(obj);
                g00.a<id1.b> aVarP9 = q0.this.p9();
                id1.b.ShowDialog showDialog2 = new id1.b.ShowDialog(q0.this.dialogMapper.b(showDialog.getDialogType()));
                this.f91182f = vq.j.a(showDialog);
                this.f91181e = 1;
                if (aVarP9.F(showDialog2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDialog showDialog, State state, tq.e<? super oq.i0> eVar) {
            x xVar = q0.this.new x(eVar);
            xVar.f91182f = showDialog;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/a;", "<unused var>", "Lid1/h0;", "state", "Loq/i0;", "<anonymous>", "(Lid1/a;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<id1.a, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91184e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91185f;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f91185f
                id1.h0 r0 = (id1.State) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f91184e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                oq.u.b(r6)
                goto L5c
            L1f:
                oq.u.b(r6)
                fb1.c r6 = r0.getCurrentStep()
                fb1.c$s r2 = fb1.c.s.f60801a
                boolean r6 = fr.t.c(r6, r2)
                if (r6 == 0) goto L45
                id1.q0 r6 = id1.q0.this
                g00.a r6 = r6.p9()
                id1.b$a r2 = id1.b.a.f91041a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f91185f = r0
                r5.f91184e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L5c
                goto L5b
            L45:
                id1.q0 r6 = id1.q0.this
                g00.a r6 = r6.g()
                id1.c$a r2 = id1.c.a.f91045a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f91185f = r0
                r5.f91184e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L5c
            L5b:
                return r1
            L5c:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: id1.q0.y.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(id1.a aVar, State state, tq.e<? super oq.i0> eVar) {
            y yVar = q0.this.new y(eVar);
            yVar.f91185f = state;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lid1/q;", "action", "Lid1/h0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lid1/q;Lid1/h0;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<SaveKnownUserData, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f91187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f91188f;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveKnownUserData saveKnownUserData = (SaveKnownUserData) this.f91188f;
            uq.b.e();
            if (this.f91187e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q0.this.nestedWizardDataSource.a(fb1.c.s.f60801a, new KnownUserDataStepResult(saveKnownUserData.getData()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveKnownUserData saveKnownUserData, State state, tq.e<? super oq.i0> eVar) {
            z zVar = q0.this.new z(eVar);
            zVar.f91188f = saveKnownUserData;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public q0(yy.a aVar, kd1.b bVar, jd1.b bVar2, se1.b bVar3, oa1.b bVar4) {
        this.nestedContainerMapper = bVar;
        this.nestedWizardDataSource = bVar2;
        this.dialogMapper = bVar3;
        this.isCompanyEmailCollectingFFActiveUC = bVar4;
        State state = new State(fb1.c.s.f60801a);
        this.initialState = state;
        this.companyNewContactEnabled = oq.l.a(new er.a() { // from class: id1.m0
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(q0.n9(this.f91067a));
            }
        });
        this.stateMachine = aVar.a(state, new er.l() { // from class: id1.n0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.t9(this.f91069a, (k10.v) obj);
            }
        });
        this.navAction = new g00.a<>();
        this.nestedNavAction = new g00.a<>();
        this.state = a9(new a(e9().getState(), this), q9(state));
        this.processType = ld1.l.APPLICATION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n9(q0 q0Var) {
        return q0Var.isCompanyEmailCollectingFFActiveUC.b(gz.b.a.C1792a.f78542a).booleanValue();
    }

    private final boolean o9() {
        return ((Boolean) this.companyNewContactEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i0.Data q9(State state) {
        return this.nestedContainerMapper.b(new kd1.b.Params(state, b9(id1.a.f91039a), b9(id1.b.C2169b.f91042a), new er.l() { // from class: id1.o0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.r9(this.f91071a, (se1.c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r9(q0 q0Var, se1.c cVar) {
        q0Var.d9(new ShowDialog(cVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t9(final q0 q0Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: id1.p0
            @Override // er.l
            public final Object b(Object obj) {
                return q0.u9(this.f91073a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u9(q0 q0Var, k10.z zVar) {
        l lVar = new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(StepChanged.class), oVar, lVar);
        zVar.x(fr.q0.c(id1.b.class), oVar, q0Var.new w(null));
        zVar.x(fr.q0.c(SaveKnownUserData.class), oVar, q0Var.new z(null));
        zVar.x(fr.q0.c(SaveHomeAddress.class), oVar, q0Var.new a0(null));
        zVar.x(fr.q0.c(SaveContactInfo.class), oVar, q0Var.new b0(null));
        zVar.x(fr.q0.c(SaveCompanyName.class), oVar, q0Var.new c0(null));
        zVar.x(fr.q0.c(SaveBusinessAddressAvailability.class), oVar, q0Var.new d0(null));
        zVar.x(fr.q0.c(SaveBusinessAddress.class), oVar, q0Var.new e0(null));
        zVar.x(fr.q0.c(SaveCorrespondenceAddress.class), oVar, q0Var.new f0(null));
        zVar.x(fr.q0.c(SaveCorrespondencePostOfficeBox.class), oVar, q0Var.new b(null));
        zVar.x(fr.q0.c(SavePkdCodes.class), oVar, q0Var.new c(null));
        zVar.x(fr.q0.c(id1.d.class), oVar, q0Var.new d(null));
        zVar.x(fr.q0.c(SavePkdCodeMainSelection.class), oVar, q0Var.new e(null));
        zVar.x(fr.q0.c(SaveSocialInsuranceSelection.class), oVar, q0Var.new f(null));
        zVar.x(fr.q0.c(SaveAccountingDocumentSelection.class), oVar, q0Var.new g(null));
        zVar.x(fr.q0.c(SaveAccountingDocumentAddressSelection.class), oVar, q0Var.new h(null));
        zVar.x(fr.q0.c(SaveTaxOffice.class), oVar, q0Var.new i(null));
        zVar.x(fr.q0.c(SaveEdorAddressData.class), oVar, q0Var.new j(null));
        zVar.x(fr.q0.c(SaveEdorAddressSelectionAnswer.class), oVar, q0Var.new k(null));
        zVar.x(fr.q0.c(SaveIncomeTaxFormSelection.class), oVar, q0Var.new m(null));
        zVar.x(fr.q0.c(SaveKrusOfficeSelection.class), oVar, q0Var.new n(null));
        zVar.x(fr.q0.c(SaveTaxOfficeSelection.class), oVar, q0Var.new o(null));
        zVar.x(fr.q0.c(SaveKrusIncomeTaxExceededInfo.class), oVar, q0Var.new p(null));
        zVar.x(fr.q0.c(SaveKrusIncomeTaxExceededCertificate.class), oVar, q0Var.new q(null));
        zVar.x(fr.q0.c(SaveKrusIncomeTaxExceededCertificateInfo.class), oVar, q0Var.new r(null));
        zVar.x(fr.q0.c(SaveKrusQuestionsAnswers.class), oVar, q0Var.new s(null));
        zVar.x(fr.q0.c(SaveKrusIncomeTaxExceededAddFile.class), oVar, q0Var.new t(null));
        zVar.x(fr.q0.c(SaveKrusData.class), oVar, q0Var.new u(null));
        zVar.x(fr.q0.c(SaveStatement.class), oVar, q0Var.new v(null));
        zVar.x(fr.q0.c(ShowDialog.class), oVar, q0Var.new x(null));
        zVar.x(fr.q0.c(id1.a.class), oVar, q0Var.new y(null));
        return oq.i0.f148189a;
    }

    @Override // cc1.a
    public BusinessAddressAvailabilityContractData A4() {
        return (BusinessAddressAvailabilityContractData) this.nestedWizardDataSource.b(fb1.c.C1372c.f60769a);
    }

    @Override // df1.a
    public SocialInsuranceSelectionContractData C4() {
        return (SocialInsuranceSelectionContractData) this.nestedWizardDataSource.b(fb1.c.p.f60795a);
    }

    @Override // zb1.a, lc1.a, sb1.a
    public BusinessAddressSelectionContractData E() {
        return (BusinessAddressSelectionContractData) this.nestedWizardDataSource.b(fb1.c.d.f60771a);
    }

    @Override // lc1.a, oc1.a
    public CorrespondencePostOfficeBoxContractData E0() {
        return (CorrespondencePostOfficeBoxContractData) this.nestedWizardDataSource.b(fb1.c.i.f60781a);
    }

    @Override // od1.a
    public EdorAddressData E1() {
        return (EdorAddressData) this.nestedWizardDataSource.b(fb1.c.j.f60783a);
    }

    @Override // oc1.a
    public void E8(CorrespondencePostOfficeBoxContractData data) {
        d9(new SaveCorrespondencePostOfficeBox(data));
    }

    @Override // ce1.a
    public void F4(TaxOfficeModel data) {
        d9(new SaveTaxOfficeSelection(data));
    }

    @Override // xe1.a, df1.a, od1.a
    /* JADX INFO: renamed from: H, reason: from getter */
    public ld1.l getProcessType() {
        return this.processType;
    }

    @Override // tc1.a
    public void H8(IncomeTaxFormSelectionContractData data) {
        d9(new SaveIncomeTaxFormSelection(data));
    }

    @Override // lf1.a
    public TaxOfficeContractData I6() {
        return (TaxOfficeContractData) this.nestedWizardDataSource.b(fb1.c.e.f60773a);
    }

    @Override // ce1.a
    public void K8(SocialInsuranceQuestions data) {
        d9(new SaveKrusQuestionsAnswers(data));
    }

    @Override // fc1.a
    public void L6(CompanyNameContractData data) {
        d9(new SaveCompanyName(data));
    }

    @Override // ic1.a
    public void M6(ic1.b data) {
        d9(new SaveContactInfo(data));
    }

    @Override // ce1.a
    public void M8(de1.c data) {
        d9(new SaveKrusIncomeTaxExceededCertificateInfo(data));
    }

    @Override // ic1.a
    public ic1.b N0() {
        return (ic1.b) this.nestedWizardDataSource.b(fb1.c.g.f60777a);
    }

    @Override // wc1.a
    public void N2(KnownUserDataModel data) {
        d9(new SaveKnownUserData(data));
    }

    @Override // xe1.a
    public void P1(PkdCodeContractData data) {
        d9(new SavePkdCodes(data));
    }

    @Override // id1.g0
    public OpenCompanyWizardData Q0() {
        return OpenCompanyWizardData.b(this.nestedWizardDataSource.e(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, o9(), 131071, null);
    }

    @Override // ce1.a
    public void Q3(de1.b data) {
        d9(new SaveKrusIncomeTaxExceededCertificate(data));
    }

    @Override // wb1.a
    public void T1(AccountingDocumentSelectionContractData data) {
        d9(new SaveAccountingDocumentSelection(data));
    }

    @Override // zd1.a
    public void T2(HomeAddressContractData data) {
        d9(new SaveHomeAddress(data));
    }

    @Override // ce1.a
    public void V3(de1.d data) {
        d9(new SaveKrusIncomeTaxExceededInfo(data));
    }

    @Override // fc1.a
    public CompanyNameContractData X4() {
        return (CompanyNameContractData) this.nestedWizardDataSource.b(fb1.c.m.f60789a);
    }

    @Override // ce1.a
    public void c8(KrusOfficeModel data) {
        d9(new SaveKrusOfficeSelection(data));
    }

    @Override // od1.a
    public void e6(EdorAddressData data) {
        d9(new SaveEdorAddressData(data));
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // xe1.a, af1.a
    public void f0(PkdCodeMainSelectionContractData data) {
        d9(new SavePkdCodeMainSelection(data));
    }

    @Override // id1.g0
    public g00.a<id1.c> g() {
        return this.nestedNavAction;
    }

    @Override // l00.e
    public mu.p0<i0.Data> getState() {
        return this.state;
    }

    @Override // cc1.a
    public void i4(BusinessAddressAvailabilityContractData data) {
        d9(new SaveBusinessAddressAvailability(data));
    }

    @Override // gf1.a
    public StatementContractData i5() {
        return (StatementContractData) this.nestedWizardDataSource.b(fb1.c.x.f60811a);
    }

    @Override // xe1.a, af1.a
    public PkdCodeContractData j0() {
        return (PkdCodeContractData) this.nestedWizardDataSource.b(fb1.c.u.f60805a);
    }

    @Override // lf1.a
    public void j8(TaxOfficeContractData data) {
        d9(new SaveTaxOffice(data));
    }

    @Override // lc1.a, sb1.a
    public CorrespondenceAddressSelectionContractData k() {
        return (CorrespondenceAddressSelectionContractData) this.nestedWizardDataSource.b(fb1.c.h.f60779a);
    }

    @Override // af1.a
    public PkdCodeMainSelectionContractData k4() {
        return (PkdCodeMainSelectionContractData) this.nestedWizardDataSource.b(fb1.c.v.f60807a);
    }

    @Override // tc1.a
    public IncomeTaxFormSelectionContractData k7() {
        return (IncomeTaxFormSelectionContractData) this.nestedWizardDataSource.b(fb1.c.r.f60799a);
    }

    @Override // gf1.a
    public void l2(StatementContractData data) {
        d9(new SaveStatement(data));
    }

    @Override // lc1.a
    public void m2(CorrespondenceAddressSelectionContractData data) {
        d9(new SaveCorrespondenceAddress(data));
    }

    @Override // ce1.a
    public KrusData m3() {
        return (KrusData) this.nestedWizardDataSource.b(fb1.c.t.f60803a);
    }

    @Override // wb1.a
    public AccountingDocumentSelectionContractData m4() {
        return (AccountingDocumentSelectionContractData) this.nestedWizardDataSource.b(fb1.c.a.f60765a);
    }

    @Override // sb1.a
    public AccountingDocumentAddressSelectionContractData n2() {
        return (AccountingDocumentAddressSelectionContractData) this.nestedWizardDataSource.b(fb1.c.b.f60767a);
    }

    @Override // ce1.a
    public void p4(IncomeTaxExceededAddFileModel data) {
        d9(new SaveKrusIncomeTaxExceededAddFile(data));
    }

    @Override // df1.a
    public void p6(SocialInsuranceSelectionContractData data) {
        d9(new SaveSocialInsuranceSelection(data));
    }

    public g00.a<id1.b> p9() {
        return this.navAction;
    }

    @Override // zd1.a, fc1.a, zb1.a, lc1.a, sb1.a
    public KnownUserDataModel q() {
        return (KnownUserDataModel) this.nestedWizardDataSource.b(fb1.c.s.f60801a);
    }

    @Override // zd1.a, cc1.a, zb1.a, lc1.a, sb1.a
    public HomeAddressContractData r() {
        return (HomeAddressContractData) this.nestedWizardDataSource.b(fb1.c.q.f60797a);
    }

    public void s9() {
        d9(new ShowDialog(new se1.c.Close(b9(id1.b.C2169b.f91042a))));
    }

    @Override // cc1.a, zb1.a
    public void u0(BusinessAddressSelectionContractData data) {
        d9(new SaveBusinessAddress(data));
    }

    @Override // id1.g0
    public void v3(fb1.c destination) {
        d9(new StepChanged(destination));
    }

    @Override // xe1.a
    public void w4() {
        d9(id1.d.f91047a);
    }

    @Override // sb1.a
    public void x7(AccountingDocumentAddressSelectionContractData data) {
        d9(new SaveAccountingDocumentAddressSelection(data));
    }

    @Override // od1.a
    public void y4(rd1.c answer) {
        d9(new SaveEdorAddressSelectionAnswer(answer));
    }

    @Override // ic1.a
    public boolean z4() {
        return o9();
    }
}
