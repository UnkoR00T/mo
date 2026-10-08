package wt0;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import dx.j;
import ex.d;
import fu.r;
import fz.b;
import iy.c0;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.p;
import p071kotlin.Metadata;
import px.f;
import tt0.BEAttachments;
import tt0.BEAttachmentsConfiguration;
import tt0.BEInterventionHistoryActionDetail;
import tt0.BEReportCategoriesResponse;
import tt0.BEReportCategory;
import tt0.BEReportSubCategory;
import tt0.BEReportedAddress;
import tt0.BEReportedIntervention;
import tt0.BEReportedInterventionApplicant;
import tt0.BEReportedInterventionGroup;
import tt0.BEReportedObjectInterventionAttachments;
import tt0.BEReportedObjectInterventionDetails;
import tt0.BEReportedOtherIntervention;
import tt0.BEReportedProductInterventionBusiness;
import tt0.BEReportedProductInterventionProductData;
import tt0.BESendReportResponse;
import tt0.e;
import tt0.l;
import tt0.s;
import xt0.AttachmentsInterventionConfigurationResponse;
import xt0.GetReportedInterventionsInterventionByCreationDateDto;
import xt0.GetReportedInterventionsInterventionByOccurrenceDateInterventionDto;
import xt0.GetReportedInterventionsResponse;
import xt0.GetReportedObjectInterventionResponse;
import xt0.GetReportedObjectInterventionResponseApplicantDto;
import xt0.GetReportedObjectInterventionResponseAttachmentsDto;
import xt0.GetReportedObjectInterventionResponseObjectDetailsDto;
import xt0.GetReportedObjectInterventionResponseOtherInterventionDto;
import xt0.GetReportedProductInterventionResponse;
import xt0.GetReportedProductInterventionResponseApplicantDto;
import xt0.GetReportedProductInterventionResponseAttachmentsDto;
import xt0.GetReportedProductInterventionResponseManufacturerDataDto;
import xt0.GetReportedProductInterventionResponseOtherInterventionDto;
import xt0.GetReportedProductInterventionResponseProductDataDto;
import xt0.GetReportedProductInterventionResponsePurchaseDataDto;
import xt0.GetReportedProductInterventionResponseSellerDataDto;
import xt0.InterventionAttachmentsDto;
import xt0.InterventionAttachmentsDtoAttachmentFile;
import xt0.InterventionHistoryActionDetailDto;
import xt0.InterventionTypeCategoryResponse;
import xt0.InterventionTypeCategoryResponseCategoryDto;
import xt0.InterventionTypeCategoryResponseInterventionDto;
import xt0.PhoneNumber;
import xt0.PhoneNumberDetailsDto;
import xt0.ReportObjectInterventionRequest;
import xt0.ReportObjectInterventionRequestApplicant;
import xt0.ReportObjectInterventionRequestInterventionReportObjectDetailsRequest;
import xt0.ReportProductInterventionRequest;
import xt0.ReportProductInterventionRequestAddressRequest;
import xt0.ReportProductInterventionRequestApplicant;
import xt0.ReportProductInterventionRequestManufacturerDetails;
import xt0.ReportProductInterventionRequestOfflinePurchaseDetails;
import xt0.ReportProductInterventionRequestOnlinePurchaseDetails;
import xt0.ReportProductInterventionRequestProductDetails;
import xt0.ReportedInterventionResponse;
import xt0.a0;
import xt0.v;
import xt0.w;
import xw.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¨\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001d\u001a\u00020\u001c*\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010!\u001a\u00020 *\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010%\u001a\u00020$*\u00020#¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010)\u001a\u00020(*\u00020'¢\u0006\u0004\b)\u0010*\u001a\u0011\u0010,\u001a\u00020+*\u00020'¢\u0006\u0004\b,\u0010-\u001a\u0011\u00100\u001a\u00020/*\u00020.¢\u0006\u0004\b0\u00101\u001a\u0011\u00104\u001a\u000203*\u000202¢\u0006\u0004\b4\u00105\u001a\u0011\u00108\u001a\u000207*\u000206¢\u0006\u0004\b8\u00109\u001a\u0011\u0010<\u001a\u00020;*\u00020:¢\u0006\u0004\b<\u0010=\u001a\u0011\u0010?\u001a\u00020>*\u00020:¢\u0006\u0004\b?\u0010@\u001a\u0011\u0010C\u001a\u00020B*\u00020A¢\u0006\u0004\bC\u0010D\u001a%\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020H0\u0001*\u00020E2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bI\u0010J\u001a#\u0010N\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L0\u0001*\u00020K¢\u0006\u0004\bN\u0010O\u001a\u001d\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020Q0\u0001*\u00020P¢\u0006\u0004\bR\u0010S\u001a\u001d\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020U0\u0001*\u00020T¢\u0006\u0004\bV\u0010W\u001a\u001d\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020U0\u0001*\u00020X¢\u0006\u0004\bY\u0010Z\u001a\u001d\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\\0\u0001*\u00020[¢\u0006\u0004\b]\u0010^\u001a\u001d\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020`0\u0001*\u00020_¢\u0006\u0004\ba\u0010b\u001a\u0011\u0010e\u001a\u00020d*\u00020c¢\u0006\u0004\be\u0010f\u001a\u0013\u0010i\u001a\u00020h*\u00020gH\u0002¢\u0006\u0004\bi\u0010j\u001a\u0011\u0010l\u001a\u00020d*\u00020k¢\u0006\u0004\bl\u0010m\u001a\u0011\u0010p\u001a\u00020o*\u00020n¢\u0006\u0004\bp\u0010q\u001a\u0011\u0010t\u001a\u00020s*\u00020r¢\u0006\u0004\bt\u0010u\u001a\u0011\u0010x\u001a\u00020w*\u00020v¢\u0006\u0004\bx\u0010y\u001a\u0011\u0010{\u001a\u00020w*\u00020z¢\u0006\u0004\b{\u0010|\u001a\u0014\u0010\u007f\u001a\u00020~*\u0004\u0018\u00010}¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001a\u0017\u0010\u0082\u0001\u001a\u00020~*\u0005\u0018\u00010\u0081\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0016\u0010\u0086\u0001\u001a\u00030\u0085\u0001*\u00030\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0016\u0010\u0089\u0001\u001a\u00030\u0085\u0001*\u00030\u0088\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\"\u0010\u008d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u008c\u00010\u0001*\u00030\u008b\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u008f\u0001"}, d2 = {"Lxt0/x;", "Ldx/i;", "Ldx/b;", "Ltt0/f;", "i", "(Lxt0/x;)Ldx/i;", "Lxt0/z;", "Ltt0/g;", "j", "(Lxt0/z;)Ldx/i;", "Lxt0/a0;", "Ltt0/e;", "k", "(Lxt0/a0;)Ldx/i;", "Lxt0/y;", "Ltt0/h;", "l", "(Lxt0/y;)Ltt0/h;", "Ltt0/s$e;", "Ltt0/a;", "attachments", "Lxt0/d0;", "A", "(Ltt0/s$e;Ltt0/a;)Lxt0/d0;", "Ltt0/s$h;", "Lxt0/g0;", "C", "(Ltt0/s$h;Ltt0/a;)Lxt0/g0;", "Lxt0/s;", "y", "(Ltt0/a;)Lxt0/s;", "Ltt0/a$a;", "Lxt0/t;", "z", "(Ltt0/a$a;)Lxt0/t;", "Ltt0/s$g;", "Lxt0/m0;", "F", "(Ltt0/s$g;)Lxt0/m0;", "Ltt0/s$c;", "Lxt0/j0;", "G", "(Ltt0/s$c;)Lxt0/j0;", "Lxt0/k0;", "I", "(Ltt0/s$c;)Lxt0/k0;", "Ltt0/s$f;", "Lxt0/l0;", "E", "(Ltt0/s$f;)Lxt0/l0;", "Ltt0/s$a;", "Lxt0/h0;", ip.a.f96138c, "(Ltt0/s$a;)Lxt0/h0;", "Ltt0/s$d;", "Lxt0/f0;", "B", "(Ltt0/s$d;)Lxt0/f0;", "Ltt0/s$b;", "Lxt0/e0;", i.f37087n, "(Ltt0/s$b;)Lxt0/e0;", "Lxt0/i0;", "J", "(Ltt0/s$b;)Lxt0/i0;", "Lxt0/n0;", "Ltt0/t;", "w", "(Lxt0/n0;)Ltt0/t;", "Lxt0/a;", "Lez/a;", "currentTimeProvider", "Ltt0/b;", "a", "(Lxt0/a;Lez/a;)Ldx/i;", "Lxt0/e;", "", "Ltt0/m;", "c", "(Lxt0/e;)Ldx/i;", "Lxt0/d;", "Ltt0/j;", "b", "(Lxt0/d;)Ldx/i;", "Lxt0/w;", "Ltt0/d;", "h", "(Lxt0/w;)Ldx/i;", "Lxt0/v;", "g", "(Lxt0/v;)Ldx/i;", "Lxt0/f;", "Ltt0/l$a;", "d", "(Lxt0/f;)Ldx/i;", "Lxt0/k;", "Ltt0/l$b;", "e", "(Lxt0/k;)Ldx/i;", "Lxt0/g;", "Ltt0/k;", "m", "(Lxt0/g;)Ltt0/k;", "Lxt0/c0;", "Lxw/h;", "x", "(Lxt0/c0;)Lxw/h;", "Lxt0/l;", "n", "(Lxt0/l;)Ltt0/k;", "Lxt0/p;", "Ltt0/r;", "v", "(Lxt0/p;)Ltt0/r;", "Lxt0/i;", "Ltt0/o;", "q", "(Lxt0/i;)Ltt0/o;", "Lxt0/r;", "Ltt0/q;", "u", "(Lxt0/r;)Ltt0/q;", "Lxt0/n;", "t", "(Lxt0/n;)Ltt0/q;", "Lxt0/h;", "Ltt0/n;", "o", "(Lxt0/h;)Ltt0/n;", "Lxt0/m;", "p", "(Lxt0/m;)Ltt0/n;", "Lxt0/j;", "Ltt0/p;", "r", "(Lxt0/j;)Ltt0/p;", "Lxt0/o;", "s", "(Lxt0/o;)Ltt0/p;", "Lxt0/u;", "Ltt0/c;", "f", "(Lxt0/u;)Ldx/i;", "sanitaryinspectorservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: wt0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5709a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f215064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f215065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f215066c;

        static {
            int[] iArr = new int[a0.values().length];
            try {
                iArr[a0.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a0.PRODUCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f215064a = iArr;
            int[] iArr2 = new int[w.values().length];
            try {
                iArr2[w.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[w.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[w.SUBMITTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[w.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f215065b = iArr2;
            int[] iArr3 = new int[v.values().length];
            try {
                iArr3[v.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[v.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[v.SUBMITTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[v.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            f215066c = iArr3;
        }
    }

    public static final ReportObjectInterventionRequest A(s.ObjectRequest objectRequest, BEAttachments bEAttachments) {
        String subCategoryCode = objectRequest.getSubCategoryCode();
        String description = objectRequest.getDescription();
        b.OffsetDateTime occurrenceDate = objectRequest.getOccurrenceDate();
        OffsetDateTime date = occurrenceDate != null ? occurrenceDate.getDate() : null;
        ReportObjectInterventionRequestInterventionReportObjectDetailsRequest reportObjectInterventionRequestInterventionReportObjectDetailsRequestB = B(objectRequest.getLocationData());
        boolean wasOtherReportSentToAuthorities = objectRequest.getWasOtherReportSentToAuthorities();
        String otherReportAuthorityName = objectRequest.getOtherReportAuthorityName();
        String otherReportCaseNumber = objectRequest.getOtherReportCaseNumber();
        b.LocalDate otherReportDate = objectRequest.getOtherReportDate();
        LocalDate date2 = otherReportDate != null ? otherReportDate.getDate() : null;
        s.ApplicantData applicantData = objectRequest.getApplicantData();
        return new ReportObjectInterventionRequest(description, subCategoryCode, reportObjectInterventionRequestInterventionReportObjectDetailsRequestB, wasOtherReportSentToAuthorities, applicantData != null ? H(applicantData) : null, bEAttachments != null ? y(bEAttachments) : null, date, otherReportCaseNumber, otherReportAuthorityName, date2);
    }

    public static final ReportObjectInterventionRequestInterventionReportObjectDetailsRequest B(s.LocationData locationData) {
        boolean isCarriageRelated = locationData.getIsCarriageRelated();
        String locationName = locationData.getLocationName();
        String carriageName = locationData.getCarriageName();
        String province = locationData.getAddress().getProvince();
        String provinceId = locationData.getAddress().getProvinceId();
        String district = locationData.getAddress().getDistrict();
        String districtId = locationData.getAddress().getDistrictId();
        String community = locationData.getAddress().getCommunity();
        String communityId = locationData.getAddress().getCommunityId();
        return new ReportObjectInterventionRequestInterventionReportObjectDetailsRequest(locationData.getAddress().getCity(), locationData.getAddress().getCityId(), community, communityId, district, districtId, province, provinceId, isCarriageRelated, locationData.getAddress().getBuildingNumber(), carriageName, locationName, locationData.getAddress().getLocalNumber(), locationData.getAddress().getPostalCode(), locationData.getAddress().getStreet(), locationData.getAddress().getStreetId());
    }

    public static final ReportProductInterventionRequest C(s.ProductRequest productRequest, BEAttachments bEAttachments) {
        String subCategoryCode = productRequest.getSubCategoryCode();
        String description = productRequest.getDescription();
        b.OffsetDateTime occurrenceDate = productRequest.getOccurrenceDate();
        OffsetDateTime date = occurrenceDate != null ? occurrenceDate.getDate() : null;
        boolean wasOtherReportSentToAuthorities = productRequest.getWasOtherReportSentToAuthorities();
        String otherReportCaseNumber = productRequest.getOtherReportCaseNumber();
        String otherReportAuthorityName = productRequest.getOtherReportAuthorityName();
        b.LocalDate otherReportDate = productRequest.getOtherReportDate();
        LocalDate date2 = otherReportDate != null ? otherReportDate.getDate() : null;
        ReportProductInterventionRequestProductDetails reportProductInterventionRequestProductDetailsF = F(productRequest.getProductDetails());
        s.ApplicantData applicantData = productRequest.getApplicantData();
        return new ReportProductInterventionRequest(description, subCategoryCode, reportProductInterventionRequestProductDetailsF, wasOtherReportSentToAuthorities, applicantData != null ? J(applicantData) : null, bEAttachments != null ? y(bEAttachments) : null, date, otherReportCaseNumber, otherReportAuthorityName, date2);
    }

    public static final ReportProductInterventionRequestAddressRequest D(s.Address address) {
        String province = address.getProvince();
        String provinceId = address.getProvinceId();
        String district = address.getDistrict();
        String districtId = address.getDistrictId();
        String community = address.getCommunity();
        String communityId = address.getCommunityId();
        return new ReportProductInterventionRequestAddressRequest(address.getCity(), address.getCityId(), community, communityId, district, districtId, province, provinceId, address.getBuildingNumber(), address.getLocalNumber(), address.getPostalCode(), address.getStreet(), address.getStreetId());
    }

    public static final ReportProductInterventionRequestOnlinePurchaseDetails E(s.OnlineBusinessDetailsData onlineBusinessDetailsData) {
        String nameOrPlace = onlineBusinessDetailsData.getNameOrPlace();
        String url = onlineBusinessDetailsData.getUrl();
        if (url == null || url.length() <= 0) {
            url = null;
        }
        s.Address address = onlineBusinessDetailsData.getAddress();
        return new ReportProductInterventionRequestOnlinePurchaseDetails(address != null ? D(address) : null, url, nameOrPlace);
    }

    public static final ReportProductInterventionRequestProductDetails F(s.ProductIntervention productIntervention) {
        boolean onlinePurchase = productIntervention.getOnlinePurchase();
        String batchNumber = productIntervention.getBatchNumber();
        String expiryDate = productIntervention.getExpiryDate();
        Boolean boolValueOf = Boolean.valueOf(productIntervention.getManufacturerDetails() != null);
        s.BusinessDetailsData manufacturerDetails = productIntervention.getManufacturerDetails();
        ReportProductInterventionRequestManufacturerDetails reportProductInterventionRequestManufacturerDetailsG = manufacturerDetails != null ? G(manufacturerDetails) : null;
        s.BusinessDetailsData offlinePurchaseDetails = productIntervention.getOfflinePurchaseDetails();
        ReportProductInterventionRequestOfflinePurchaseDetails reportProductInterventionRequestOfflinePurchaseDetailsI = offlinePurchaseDetails != null ? I(offlinePurchaseDetails) : null;
        s.OnlineBusinessDetailsData onlinePurchaseDetails = productIntervention.getOnlinePurchaseDetails();
        return new ReportProductInterventionRequestProductDetails(onlinePurchase, batchNumber, expiryDate, boolValueOf, reportProductInterventionRequestManufacturerDetailsG, reportProductInterventionRequestOfflinePurchaseDetailsI, onlinePurchaseDetails != null ? E(onlinePurchaseDetails) : null, productIntervention.getTradeName());
    }

    public static final ReportProductInterventionRequestManufacturerDetails G(s.BusinessDetailsData businessDetailsData) {
        return new ReportProductInterventionRequestManufacturerDetails(D(businessDetailsData.getAddress()), businessDetailsData.getNameOrPlace());
    }

    public static final ReportObjectInterventionRequestApplicant H(s.ApplicantData applicantData) {
        PhoneNumber phoneNumber;
        String firstName = applicantData.getFirstName();
        String lastName = applicantData.getLastName();
        String edorAddress = applicantData.getEdorAddress();
        String email = applicantData.getEmail();
        xw.PhoneNumber phoneNumber2 = applicantData.getPhoneNumber();
        if (phoneNumber2 != null) {
            phoneNumber = new PhoneNumber(c0.e(phoneNumber2.g()), c0.e(phoneNumber2.h()));
        } else {
            phoneNumber = null;
        }
        return new ReportObjectInterventionRequestApplicant(firstName, lastName, edorAddress, email, phoneNumber);
    }

    public static final ReportProductInterventionRequestOfflinePurchaseDetails I(s.BusinessDetailsData businessDetailsData) {
        return new ReportProductInterventionRequestOfflinePurchaseDetails(D(businessDetailsData.getAddress()), businessDetailsData.getNameOrPlace());
    }

    public static final ReportProductInterventionRequestApplicant J(s.ApplicantData applicantData) {
        PhoneNumber phoneNumber;
        String firstName = applicantData.getFirstName();
        String lastName = applicantData.getLastName();
        String edorAddress = applicantData.getEdorAddress();
        String email = applicantData.getEmail();
        xw.PhoneNumber phoneNumber2 = applicantData.getPhoneNumber();
        if (phoneNumber2 != null) {
            phoneNumber = new PhoneNumber(c0.e(phoneNumber2.g()), c0.e(phoneNumber2.h()));
        } else {
            phoneNumber = null;
        }
        return new ReportProductInterventionRequestApplicant(firstName, lastName, edorAddress, email, phoneNumber);
    }

    public static final dx.i<dx.b, BEAttachmentsConfiguration> a(AttachmentsInterventionConfigurationResponse attachmentsInterventionConfigurationResponse, ez.a aVar) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new dx.i.Right(new BEAttachmentsConfiguration(ry.a.b(c0.g(attachmentsInterventionConfigurationResponse.getFileEncryptionKey())), ry.a.b(c0.g(attachmentsInterventionConfigurationResponse.getSslPinningCert())), attachmentsInterventionConfigurationResponse.getUrlToFileUpload(), c0.g(attachmentsInterventionConfigurationResponse.getJwtFileService().getToken()), new b.OffsetDateTime(aVar.f().plusSeconds(attachmentsInterventionConfigurationResponse.getJwtFileService().getValidityInSeconds())), attachmentsInterventionConfigurationResponse.getMaxFileAmount(), null));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final dx.i<dx.b, BEReportedIntervention> b(GetReportedInterventionsInterventionByOccurrenceDateInterventionDto getReportedInterventionsInterventionByOccurrenceDateInterventionDto) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    return new dx.i.Right(new BEReportedIntervention(getReportedInterventionsInterventionByOccurrenceDateInterventionDto.getCategory(), getReportedInterventionsInterventionByOccurrenceDateInterventionDto.getCategoryName(), getReportedInterventionsInterventionByOccurrenceDateInterventionDto.getInitiativeId(), getReportedInterventionsInterventionByOccurrenceDateInterventionDto.getInterventionTypeName(), getReportedInterventionsInterventionByOccurrenceDateInterventionDto.getNumber(), (tt0.d) aVar.a(h(getReportedInterventionsInterventionByOccurrenceDateInterventionDto.getProcessingStatus())), (e) aVar.a(k(getReportedInterventionsInterventionByOccurrenceDateInterventionDto.getType()))));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final dx.i<dx.b, List<BEReportedInterventionGroup>> c(GetReportedInterventionsResponse getReportedInterventionsResponse) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<GetReportedInterventionsInterventionByCreationDateDto> listA = getReportedInterventionsResponse.a();
                    ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
                    for (GetReportedInterventionsInterventionByCreationDateDto getReportedInterventionsInterventionByCreationDateDto : listA) {
                        b.LocalDate localDate = new b.LocalDate(getReportedInterventionsInterventionByCreationDateDto.getCreatedAt());
                        List<GetReportedInterventionsInterventionByOccurrenceDateInterventionDto> listB = getReportedInterventionsInterventionByCreationDateDto.b();
                        ArrayList arrayList2 = new ArrayList(pq.v.y(listB, 10));
                        Iterator<T> it = listB.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((BEReportedIntervention) aVar.a(b((GetReportedInterventionsInterventionByOccurrenceDateInterventionDto) it.next())));
                        }
                        arrayList.add(new BEReportedInterventionGroup(localDate, arrayList2));
                    }
                    return new dx.i.Right(arrayList);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final dx.i<dx.b, l.Location> d(GetReportedObjectInterventionResponse getReportedObjectInterventionResponse) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    BEReportedInterventionApplicant bEReportedInterventionApplicantM = m(getReportedObjectInterventionResponse.getApplicant());
                    String description = getReportedObjectInterventionResponse.getDescription();
                    List<InterventionHistoryActionDetailDto> listD = getReportedObjectInterventionResponse.d();
                    ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
                    Iterator<T> it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList.add((BEInterventionHistoryActionDetail) aVar.a(f((InterventionHistoryActionDetailDto) it.next())));
                    }
                    String initiativeNumber = getReportedObjectInterventionResponse.getInitiativeNumber();
                    String interventionCategory = getReportedObjectInterventionResponse.getInterventionCategory();
                    String interventionCategoryName = getReportedObjectInterventionResponse.getInterventionCategoryName();
                    e eVar = (e) aVar.a(k(getReportedObjectInterventionResponse.getInterventionType()));
                    String interventionTypeName = getReportedObjectInterventionResponse.getInterventionTypeName();
                    BEReportedObjectInterventionDetails bEReportedObjectInterventionDetailsQ = q(getReportedObjectInterventionResponse.getObjectDetails());
                    tt0.d dVar = (tt0.d) aVar.a(h(getReportedObjectInterventionResponse.getProcessingStatus()));
                    BEReportedObjectInterventionAttachments bEReportedObjectInterventionAttachmentsO = o(getReportedObjectInterventionResponse.getAttachments());
                    OffsetDateTime occurrenceDateTime = getReportedObjectInterventionResponse.getOccurrenceDateTime();
                    b.OffsetDateTime offsetDateTime = occurrenceDateTime != null ? new b.OffsetDateTime(occurrenceDateTime) : null;
                    GetReportedObjectInterventionResponseOtherInterventionDto otherIntervention = getReportedObjectInterventionResponse.getOtherIntervention();
                    return new dx.i.Right(new l.Location(bEReportedInterventionApplicantM, description, arrayList, initiativeNumber, interventionCategory, interventionCategoryName, eVar, interventionTypeName, bEReportedObjectInterventionDetailsQ, dVar, bEReportedObjectInterventionAttachmentsO, offsetDateTime, otherIntervention != null ? r(otherIntervention) : null));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final dx.i<dx.b, l.Product> e(GetReportedProductInterventionResponse getReportedProductInterventionResponse) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    BEReportedInterventionApplicant bEReportedInterventionApplicantN = n(getReportedProductInterventionResponse.getApplicant());
                    String description = getReportedProductInterventionResponse.getDescription();
                    List<InterventionHistoryActionDetailDto> listD = getReportedProductInterventionResponse.d();
                    ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
                    Iterator<T> it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList.add((BEInterventionHistoryActionDetail) aVar.a(f((InterventionHistoryActionDetailDto) it.next())));
                    }
                    String initiativeNumber = getReportedProductInterventionResponse.getInitiativeNumber();
                    String interventionCategory = getReportedProductInterventionResponse.getInterventionCategory();
                    String interventionCategoryName = getReportedProductInterventionResponse.getInterventionCategoryName();
                    e eVar = (e) aVar.a(k(getReportedProductInterventionResponse.getInterventionType()));
                    String interventionTypeName = getReportedProductInterventionResponse.getInterventionTypeName();
                    tt0.d dVar = (tt0.d) aVar.a(h(getReportedProductInterventionResponse.getProcessingStatus()));
                    BEReportedProductInterventionProductData bEReportedProductInterventionProductDataV = v(getReportedProductInterventionResponse.getProductData());
                    GetReportedProductInterventionResponseSellerDataDto sellerData = getReportedProductInterventionResponse.getSellerData();
                    BEReportedProductInterventionBusiness bEReportedProductInterventionBusinessU = sellerData != null ? u(sellerData) : null;
                    BEReportedObjectInterventionAttachments bEReportedObjectInterventionAttachmentsP = p(getReportedProductInterventionResponse.getAttachments());
                    GetReportedProductInterventionResponseManufacturerDataDto manufacturerData = getReportedProductInterventionResponse.getManufacturerData();
                    BEReportedProductInterventionBusiness bEReportedProductInterventionBusinessT = manufacturerData != null ? t(manufacturerData) : null;
                    OffsetDateTime occurrenceDateTime = getReportedProductInterventionResponse.getOccurrenceDateTime();
                    b.OffsetDateTime offsetDateTime = occurrenceDateTime != null ? new b.OffsetDateTime(occurrenceDateTime) : null;
                    GetReportedProductInterventionResponseOtherInterventionDto otherIntervention = getReportedProductInterventionResponse.getOtherIntervention();
                    BEReportedOtherIntervention bEReportedOtherInterventionS = otherIntervention != null ? s(otherIntervention) : null;
                    GetReportedProductInterventionResponsePurchaseDataDto purchaseData = getReportedProductInterventionResponse.getPurchaseData();
                    return new dx.i.Right(new l.Product(bEReportedInterventionApplicantN, description, arrayList, initiativeNumber, interventionCategory, interventionCategoryName, eVar, interventionTypeName, dVar, bEReportedProductInterventionProductDataV, bEReportedProductInterventionBusinessU, bEReportedObjectInterventionAttachmentsP, bEReportedProductInterventionBusinessT, offsetDateTime, bEReportedOtherInterventionS, purchaseData != null ? purchaseData.getProductUrl() : null));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final dx.i<dx.b, BEInterventionHistoryActionDetail> f(InterventionHistoryActionDetailDto interventionHistoryActionDetailDto) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(new BEInterventionHistoryActionDetail(new b.LocalDate(interventionHistoryActionDetailDto.getDate()), interventionHistoryActionDetailDto.getDescription(), interventionHistoryActionDetailDto.getSanitaryUnit(), (tt0.d) new ex.a().a(g(interventionHistoryActionDetailDto.getStatus()))));
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final dx.i<dx.b, tt0.d> g(v vVar) {
        Object objB;
        tt0.d dVar;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C5709a.f215066c[vVar.ordinal()];
                    if (i15 == 1) {
                        dVar = tt0.d.IN_PROGRESS;
                    } else if (i15 == 2) {
                        dVar = tt0.d.COMPLETED;
                    } else {
                        if (i15 != 3) {
                            if (i15 != 4) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Parsing(new Exception(w.UNKNOWN + " is not supported")));
                            throw new g();
                        }
                        dVar = tt0.d.SUBMITTED;
                    }
                    return new dx.i.Right(dVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final dx.i<dx.b, tt0.d> h(w wVar) {
        Object objB;
        tt0.d dVar;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C5709a.f215065b[wVar.ordinal()];
                    if (i15 == 1) {
                        dVar = tt0.d.IN_PROGRESS;
                    } else if (i15 == 2) {
                        dVar = tt0.d.COMPLETED;
                    } else {
                        if (i15 != 3) {
                            if (i15 != 4) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Parsing(new Exception(w.UNKNOWN + " is not supported")));
                            throw new g();
                        }
                        dVar = tt0.d.SUBMITTED;
                    }
                    return new dx.i.Right(dVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final dx.i<dx.b, BEReportCategoriesResponse> i(InterventionTypeCategoryResponse interventionTypeCategoryResponse) {
        Object objB;
        dx.i right;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<InterventionTypeCategoryResponseInterventionDto> listA = interventionTypeCategoryResponse.a();
                    ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        dx.i<dx.b, BEReportCategory> iVarJ = j((InterventionTypeCategoryResponseInterventionDto) it.next());
                        if (iVarJ instanceof dx.i.Left) {
                            right = new dx.i.Left(((dx.i.Left) iVarJ).b());
                            return new dx.i.Right(new BEReportCategoriesResponse((List) aVar.a(right)));
                        }
                        if (!(iVarJ instanceof dx.i.Right)) {
                            throw new p();
                        }
                        arrayList.add(((dx.i.Right) iVarJ).b());
                    }
                    right = new dx.i.Right(arrayList);
                    return new dx.i.Right(new BEReportCategoriesResponse((List) aVar.a(right)));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final dx.i<dx.b, BEReportCategory> j(InterventionTypeCategoryResponseInterventionDto interventionTypeCategoryResponseInterventionDto) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    e eVar = (e) new ex.a().a(k(interventionTypeCategoryResponseInterventionDto.getCode()));
                    String name = interventionTypeCategoryResponseInterventionDto.getName();
                    String additionalDescription = interventionTypeCategoryResponseInterventionDto.getAdditionalDescription();
                    if (r.t0(additionalDescription)) {
                        additionalDescription = null;
                    }
                    List<InterventionTypeCategoryResponseCategoryDto> listB = interventionTypeCategoryResponseInterventionDto.b();
                    ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(l((InterventionTypeCategoryResponseCategoryDto) it.next()));
                    }
                    return new dx.i.Right(new BEReportCategory(eVar, name, additionalDescription, arrayList));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final dx.i<dx.b, e> k(a0 a0Var) {
        Object objB;
        e eVar;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C5709a.f215064a[a0Var.ordinal()];
                    if (i15 == 1) {
                        eVar = e.LOCATION;
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Parsing(new Exception(a0.UNKNOWN + " is not supported")));
                            throw new g();
                        }
                        eVar = e.PRODUCT;
                    }
                    return new dx.i.Right(eVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final BEReportSubCategory l(InterventionTypeCategoryResponseCategoryDto interventionTypeCategoryResponseCategoryDto) {
        String code = interventionTypeCategoryResponseCategoryDto.getCode();
        String name = interventionTypeCategoryResponseCategoryDto.getName();
        String additionalDescription = interventionTypeCategoryResponseCategoryDto.getAdditionalDescription();
        if (additionalDescription == null || r.t0(additionalDescription)) {
            additionalDescription = null;
        }
        return new BEReportSubCategory(code, name, additionalDescription);
    }

    public static final BEReportedInterventionApplicant m(GetReportedObjectInterventionResponseApplicantDto getReportedObjectInterventionResponseApplicantDto) {
        String firstName = getReportedObjectInterventionResponseApplicantDto.getFirstName();
        String lastName = getReportedObjectInterventionResponseApplicantDto.getLastName();
        String eDeliveryAddress = getReportedObjectInterventionResponseApplicantDto.getEDeliveryAddress();
        String email = getReportedObjectInterventionResponseApplicantDto.getEmail();
        PhoneNumberDetailsDto phoneNumber = getReportedObjectInterventionResponseApplicantDto.getPhoneNumber();
        return new BEReportedInterventionApplicant(firstName, lastName, eDeliveryAddress, email, phoneNumber != null ? x(phoneNumber) : null);
    }

    public static final BEReportedInterventionApplicant n(GetReportedProductInterventionResponseApplicantDto getReportedProductInterventionResponseApplicantDto) {
        String firstName = getReportedProductInterventionResponseApplicantDto.getFirstName();
        String lastName = getReportedProductInterventionResponseApplicantDto.getLastName();
        String eDeliveryAddress = getReportedProductInterventionResponseApplicantDto.getEDeliveryAddress();
        String email = getReportedProductInterventionResponseApplicantDto.getEmail();
        PhoneNumberDetailsDto phoneNumber = getReportedProductInterventionResponseApplicantDto.getPhoneNumber();
        return new BEReportedInterventionApplicant(firstName, lastName, eDeliveryAddress, email, phoneNumber != null ? x(phoneNumber) : null);
    }

    public static final BEReportedObjectInterventionAttachments o(GetReportedObjectInterventionResponseAttachmentsDto getReportedObjectInterventionResponseAttachmentsDto) {
        return new BEReportedObjectInterventionAttachments(getReportedObjectInterventionResponseAttachmentsDto != null ? getReportedObjectInterventionResponseAttachmentsDto.getTotalNumber() : 0L);
    }

    public static final BEReportedObjectInterventionAttachments p(GetReportedProductInterventionResponseAttachmentsDto getReportedProductInterventionResponseAttachmentsDto) {
        return new BEReportedObjectInterventionAttachments(getReportedProductInterventionResponseAttachmentsDto != null ? getReportedProductInterventionResponseAttachmentsDto.getTotalNumber() : 0L);
    }

    public static final BEReportedObjectInterventionDetails q(GetReportedObjectInterventionResponseObjectDetailsDto getReportedObjectInterventionResponseObjectDetailsDto) {
        return new BEReportedObjectInterventionDetails(getReportedObjectInterventionResponseObjectDetailsDto.getCarrierName(), getReportedObjectInterventionResponseObjectDetailsDto.getFacilityName(), new BEReportedAddress(getReportedObjectInterventionResponseObjectDetailsDto.getCity(), getReportedObjectInterventionResponseObjectDetailsDto.getCommunity(), getReportedObjectInterventionResponseObjectDetailsDto.getDistrict(), getReportedObjectInterventionResponseObjectDetailsDto.getProvince(), getReportedObjectInterventionResponseObjectDetailsDto.getBuildingNumber(), getReportedObjectInterventionResponseObjectDetailsDto.getLocalNumber(), getReportedObjectInterventionResponseObjectDetailsDto.getPostalCode(), getReportedObjectInterventionResponseObjectDetailsDto.getStreet()));
    }

    public static final BEReportedOtherIntervention r(GetReportedObjectInterventionResponseOtherInterventionDto getReportedObjectInterventionResponseOtherInterventionDto) {
        String reportedAuthority = getReportedObjectInterventionResponseOtherInterventionDto.getReportedAuthority();
        String relatedCaseNumber = getReportedObjectInterventionResponseOtherInterventionDto.getRelatedCaseNumber();
        LocalDate reportedToAuthorityDate = getReportedObjectInterventionResponseOtherInterventionDto.getReportedToAuthorityDate();
        return new BEReportedOtherIntervention(reportedAuthority, relatedCaseNumber, reportedToAuthorityDate != null ? new b.LocalDate(reportedToAuthorityDate) : null);
    }

    public static final BEReportedOtherIntervention s(GetReportedProductInterventionResponseOtherInterventionDto getReportedProductInterventionResponseOtherInterventionDto) {
        String reportedAuthority = getReportedProductInterventionResponseOtherInterventionDto.getReportedAuthority();
        String relatedCaseNumber = getReportedProductInterventionResponseOtherInterventionDto.getRelatedCaseNumber();
        LocalDate reportedToAuthorityDate = getReportedProductInterventionResponseOtherInterventionDto.getReportedToAuthorityDate();
        return new BEReportedOtherIntervention(reportedAuthority, relatedCaseNumber, reportedToAuthorityDate != null ? new b.LocalDate(reportedToAuthorityDate) : null);
    }

    public static final BEReportedProductInterventionBusiness t(GetReportedProductInterventionResponseManufacturerDataDto getReportedProductInterventionResponseManufacturerDataDto) {
        return new BEReportedProductInterventionBusiness(getReportedProductInterventionResponseManufacturerDataDto.getName(), new BEReportedAddress(getReportedProductInterventionResponseManufacturerDataDto.getCity(), getReportedProductInterventionResponseManufacturerDataDto.getCommunity(), getReportedProductInterventionResponseManufacturerDataDto.getDistrict(), getReportedProductInterventionResponseManufacturerDataDto.getProvince(), getReportedProductInterventionResponseManufacturerDataDto.getBuildingNumber(), getReportedProductInterventionResponseManufacturerDataDto.getLocalNumber(), getReportedProductInterventionResponseManufacturerDataDto.getPostalCode(), getReportedProductInterventionResponseManufacturerDataDto.getStreet()));
    }

    public static final BEReportedProductInterventionBusiness u(GetReportedProductInterventionResponseSellerDataDto getReportedProductInterventionResponseSellerDataDto) {
        return new BEReportedProductInterventionBusiness(getReportedProductInterventionResponseSellerDataDto.getName(), new BEReportedAddress(getReportedProductInterventionResponseSellerDataDto.getCity(), getReportedProductInterventionResponseSellerDataDto.getCommunity(), getReportedProductInterventionResponseSellerDataDto.getDistrict(), getReportedProductInterventionResponseSellerDataDto.getProvince(), getReportedProductInterventionResponseSellerDataDto.getBuildingNumber(), getReportedProductInterventionResponseSellerDataDto.getLocalNumber(), getReportedProductInterventionResponseSellerDataDto.getPostalCode(), getReportedProductInterventionResponseSellerDataDto.getStreet()));
    }

    public static final BEReportedProductInterventionProductData v(GetReportedProductInterventionResponseProductDataDto getReportedProductInterventionResponseProductDataDto) {
        return new BEReportedProductInterventionProductData(getReportedProductInterventionResponseProductDataDto.getBatchNumber(), getReportedProductInterventionResponseProductDataDto.getExpiryDateDescription(), getReportedProductInterventionResponseProductDataDto.getTradeName());
    }

    public static final BESendReportResponse w(ReportedInterventionResponse reportedInterventionResponse) {
        return new BESendReportResponse(reportedInterventionResponse.getCurrentUnitName(), reportedInterventionResponse.getInitiativeNumber());
    }

    private static final xw.PhoneNumber x(PhoneNumberDetailsDto phoneNumberDetailsDto) {
        return new xw.PhoneNumber(xw.PhoneNumber.c.c(c0.g(phoneNumberDetailsDto.getPrefix())), xw.PhoneNumber.b.c(c0.g(phoneNumberDetailsDto.getNumber())), null);
    }

    public static final InterventionAttachmentsDto y(BEAttachments bEAttachments) {
        List<BEAttachments.Attachment> listA = bEAttachments.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(z((BEAttachments.Attachment) it.next()));
        }
        return new InterventionAttachmentsDto(arrayList, c0.e(bEAttachments.getEncryptionKey()));
    }

    public static final InterventionAttachmentsDtoAttachmentFile z(BEAttachments.Attachment attachment) {
        return new InterventionAttachmentsDtoAttachmentFile(c0.e(attachment.getFileEncryptionIV()), attachment.getFileName());
    }
}
