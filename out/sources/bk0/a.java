package bk0;

import ck0.CompanyActivityCategoriesDto;
import ck0.CompanyActivityCategoryDto;
import ck0.CompanyAddressesDto;
import ck0.CompanyApplicationAddressDto;
import ck0.CompanyApplicationAttachmentInputDto;
import ck0.CompanyApplicationCompanyDetailsInputDto;
import ck0.CompanyApplicationCompanyDetailsInputV2Dto;
import ck0.CompanyApplicationContactDetailsInputDto;
import ck0.CompanyApplicationContactDetailsInputV2Dto;
import ck0.CompanyApplicationCorrespondenceInputDto;
import ck0.CompanyApplicationElectronicDeliveryInputDto;
import ck0.CompanyApplicationInsuranceInputDto;
import ck0.CompanyApplicationKrusInputDto;
import ck0.CompanyApplicationManagementAccountingInputDto;
import ck0.CompanyApplicationManagementApplicantDetailsInputDto;
import ck0.CompanyApplicationManagementCompanyDetailsInputDto;
import ck0.CompanyApplicationManagementCompanyDetailsInputV2Dto;
import ck0.CompanyApplicationManagementDetailsDto;
import ck0.CompanyApplicationManagementEmailInputDto;
import ck0.CompanyApplicationManagementInsuranceInputDto;
import ck0.CompanyApplicationResumptionRequest;
import ck0.CompanyApplicationResumptionV2Request;
import ck0.CompanyApplicationSetupAccountingInputDto;
import ck0.CompanyApplicationSetupApplicantDetailsInputDto;
import ck0.CompanyApplicationSetupCitizenAddressDto;
import ck0.CompanyApplicationSetupCitizenDataDto;
import ck0.CompanyApplicationSetupPostOfficeBoxAddressDto;
import ck0.CompanyApplicationSuspensionPeriodDto;
import ck0.CompanyApplicationSuspensionRequest;
import ck0.CompanyApplicationSuspensionV2Request;
import ck0.CompanyApplicationTaxOfficeInputDto;
import ck0.CompanyApplicationZusInputDto;
import ck0.CompanyCategoryDto;
import ck0.CompanyCategoryEditionAlertDto;
import ck0.CompanyDataAlertDto;
import ck0.CompanyDataDto;
import ck0.CompanyDetailsResponseDto;
import ck0.CompanyInfoDto;
import ck0.CompanyOwnerDto;
import ck0.CompanyPrintoutDto;
import ck0.CompanyRepresentativeDto;
import ck0.CompanyRepresentativesResponseDto;
import ck0.CompanySuspensionOptionsDto;
import ck0.CompanySuspensionRangeDto;
import ck0.ElectronicDeliveryNonPublicSupplierDto;
import ck0.ElectronicDeliveryNonPublicSuppliersDto;
import ck0.GenerateApplicationResponse;
import ck0.GenerateApplicationSetupRequest;
import ck0.GenerateApplicationSetupV2Request;
import ck0.LinkDto;
import ck0.ModifyCompanyRepresentativeRequestDto;
import ck0.NonPublicSupplierInputDto;
import ck0.OrderApplicationRequest;
import ck0.OrderApplicationResponse;
import ck0.PublicSupplierInputDto;
import ck0.RepresentativeRemovalStatementResponseDto;
import ck0.SocialInsuranceFundDto;
import ck0.SocialInsuranceFundsDto;
import ck0.TaxOfficeDto;
import ck0.TaxOfficesDto;
import ck0.c;
import ck0.i0;
import ck0.l;
import ck0.n0;
import ck0.r0;
import ck0.w;
import ck0.w0;
import ck0.x0;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fk0.BEApplicationAccounting;
import fk0.BEApplicationAddress;
import fk0.BEApplicationApplicantDetails;
import fk0.BEApplicationAttachment;
import fk0.BEApplicationCompanyDetails;
import fk0.BEApplicationContactDetails;
import fk0.BEApplicationCorrespondence;
import fk0.BEApplicationElectronicDelivery;
import fk0.BEApplicationInsurance;
import fk0.BEApplicationKrusInput;
import fk0.BEApplicationPostOfficeBox;
import fk0.BEApplicationTaxOfficeInput;
import fk0.BEApplicationZusInput;
import fk0.BECategoryEditionAlert;
import fk0.BECitizenAddress;
import fk0.BECitizenData;
import fk0.BECompanyActivityCategories;
import fk0.BECompanyActivityCategory;
import fk0.BECompanyAddresses;
import fk0.BECompanyCategory;
import fk0.BECompanyData;
import fk0.BECompanyDataAlert;
import fk0.BECompanyDetails;
import fk0.BECompanyInfo;
import fk0.BECompanyManagementEmail;
import fk0.BECompanyOwner;
import fk0.BECompanyPrintout;
import fk0.BECompanyRepresentative;
import fk0.BECompanyRepresentatives;
import fk0.BECompanySuspensionOptions;
import fk0.BECompanySuspensionRange;
import fk0.BEElectronicDeliveryNonPublicSupplier;
import fk0.BEElectronicDeliveryNonPublicSuppliers;
import fk0.BEGenerateApplicationRequest;
import fk0.BEGenerateApplicationResponse;
import fk0.BELink;
import fk0.BEManagementAccounting;
import fk0.BEManagementApplicantDetails;
import fk0.BEManagementCompanyDetails;
import fk0.BEManagementCompanyDetailsV2;
import fk0.BEManagementDetails;
import fk0.BEManagementInsurance;
import fk0.BENonPublicSupplierInput;
import fk0.BEOrderApplicationResponse;
import fk0.BEPublicSupplierInput;
import fk0.BERepresentativeRemovalStatement;
import fk0.BEResumptionRequest;
import fk0.BEResumptionRequestV2;
import fk0.BESocialInsuranceFund;
import fk0.BESocialInsuranceFunds;
import fk0.BESuspensionPeriod;
import fk0.BESuspensionRequest;
import fk0.BESuspensionRequestV2;
import fk0.BETaxOffice;
import fk0.BETaxOffices;
import fk0.c0;
import fk0.h;
import fk0.j0;
import fk0.n;
import fk0.u;
import fk0.z;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010>\u001a\u00020=*\u00020<¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010B\u001a\u00020A*\u00020@¢\u0006\u0004\bB\u0010C\u001a\u0011\u0010F\u001a\u00020E*\u00020D¢\u0006\u0004\bF\u0010G\u001a\u0011\u0010J\u001a\u00020I*\u00020H¢\u0006\u0004\bJ\u0010K\u001a\u0011\u0010N\u001a\u00020M*\u00020L¢\u0006\u0004\bN\u0010O\u001a\u0011\u0010R\u001a\u00020Q*\u00020P¢\u0006\u0004\bR\u0010S\u001a\u0011\u0010V\u001a\u00020U*\u00020T¢\u0006\u0004\bV\u0010W\u001a\u0011\u0010Z\u001a\u00020Y*\u00020X¢\u0006\u0004\bZ\u0010[\u001a\u0011\u0010^\u001a\u00020]*\u00020\\¢\u0006\u0004\b^\u0010_\u001a\u0011\u0010b\u001a\u00020a*\u00020`¢\u0006\u0004\bb\u0010c\u001a\u0011\u0010f\u001a\u00020e*\u00020d¢\u0006\u0004\bf\u0010g\u001a\u0011\u0010j\u001a\u00020i*\u00020h¢\u0006\u0004\bj\u0010k\u001a\u0011\u0010n\u001a\u00020m*\u00020l¢\u0006\u0004\bn\u0010o\u001a\u0011\u0010r\u001a\u00020q*\u00020p¢\u0006\u0004\br\u0010s\u001a\u0011\u0010v\u001a\u00020u*\u00020t¢\u0006\u0004\bv\u0010w\u001a\u0011\u0010z\u001a\u00020y*\u00020x¢\u0006\u0004\bz\u0010{\u001a\u0011\u0010~\u001a\u00020}*\u00020|¢\u0006\u0004\b~\u0010\u007f\u001a\u0016\u0010\u0082\u0001\u001a\u00030\u0081\u0001*\u00030\u0080\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0016\u0010\u0086\u0001\u001a\u00030\u0085\u0001*\u00030\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0016\u0010\u008a\u0001\u001a\u00030\u0089\u0001*\u00030\u0088\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0016\u0010\u008e\u0001\u001a\u00030\u008d\u0001*\u00030\u008c\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0016\u0010\u0092\u0001\u001a\u00030\u0091\u0001*\u00030\u0090\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0016\u0010\u0096\u0001\u001a\u00030\u0095\u0001*\u00030\u0094\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0016\u0010\u009a\u0001\u001a\u00030\u0099\u0001*\u00030\u0098\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0016\u0010\u009e\u0001\u001a\u00030\u009d\u0001*\u00030\u009c\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0016\u0010¢\u0001\u001a\u00030¡\u0001*\u00030 \u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001\u001a\u0016\u0010¦\u0001\u001a\u00030¥\u0001*\u00030¤\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001\u001a\u0016\u0010ª\u0001\u001a\u00030©\u0001*\u00030¨\u0001¢\u0006\u0006\bª\u0001\u0010«\u0001\u001a\u0016\u0010®\u0001\u001a\u00030\u00ad\u0001*\u00030¬\u0001¢\u0006\u0006\b®\u0001\u0010¯\u0001\u001a\u0016\u0010±\u0001\u001a\u00030°\u0001*\u00030¬\u0001¢\u0006\u0006\b±\u0001\u0010²\u0001\u001a\u0016\u0010µ\u0001\u001a\u00030´\u0001*\u00030³\u0001¢\u0006\u0006\bµ\u0001\u0010¶\u0001\u001a\u0016\u0010¹\u0001\u001a\u00030¸\u0001*\u00030·\u0001¢\u0006\u0006\b¹\u0001\u0010º\u0001\u001a\u0016\u0010½\u0001\u001a\u00030¼\u0001*\u00030»\u0001¢\u0006\u0006\b½\u0001\u0010¾\u0001\u001a\u0016\u0010Á\u0001\u001a\u00030À\u0001*\u00030¿\u0001¢\u0006\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0016\u0010Ä\u0001\u001a\u00030Ã\u0001*\u00030¿\u0001¢\u0006\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0016\u0010È\u0001\u001a\u00030Ç\u0001*\u00030Æ\u0001¢\u0006\u0006\bÈ\u0001\u0010É\u0001\u001a\u0016\u0010Ì\u0001\u001a\u00030Ë\u0001*\u00030Ê\u0001¢\u0006\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0016\u0010Ï\u0001\u001a\u00030Î\u0001*\u00030Ê\u0001¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0016\u0010Ó\u0001\u001a\u00030Ò\u0001*\u00030Ñ\u0001¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0016\u0010×\u0001\u001a\u00030Ö\u0001*\u00030Õ\u0001¢\u0006\u0006\b×\u0001\u0010Ø\u0001\u001a\u0016\u0010Û\u0001\u001a\u00030Ú\u0001*\u00030Ù\u0001¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0016\u0010ß\u0001\u001a\u00030Þ\u0001*\u00030Ý\u0001¢\u0006\u0006\bß\u0001\u0010à\u0001\u001a\u0016\u0010ã\u0001\u001a\u00030â\u0001*\u00030á\u0001¢\u0006\u0006\bã\u0001\u0010ä\u0001\u001a\u0016\u0010ç\u0001\u001a\u00030æ\u0001*\u00030å\u0001¢\u0006\u0006\bç\u0001\u0010è\u0001\u001a\u0016\u0010ë\u0001\u001a\u00030ê\u0001*\u00030é\u0001¢\u0006\u0006\bë\u0001\u0010ì\u0001\u001a\u0016\u0010ï\u0001\u001a\u00030î\u0001*\u00030í\u0001¢\u0006\u0006\bï\u0001\u0010ð\u0001\u001a\u0016\u0010ó\u0001\u001a\u00030ò\u0001*\u00030ñ\u0001¢\u0006\u0006\bó\u0001\u0010ô\u0001\u001a\u0016\u0010÷\u0001\u001a\u00030ö\u0001*\u00030õ\u0001¢\u0006\u0006\b÷\u0001\u0010ø\u0001\u001a\u0016\u0010û\u0001\u001a\u00030ú\u0001*\u00030ù\u0001¢\u0006\u0006\bû\u0001\u0010ü\u0001\u001a\u0016\u0010ÿ\u0001\u001a\u00030þ\u0001*\u00030ý\u0001¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002\u001a\u0016\u0010\u0083\u0002\u001a\u00030\u0082\u0002*\u00030\u0081\u0002¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002\u001a\u0016\u0010\u0087\u0002\u001a\u00030\u0086\u0002*\u00030\u0085\u0002¢\u0006\u0006\b\u0087\u0002\u0010\u0088\u0002\u001a\u0016\u0010\u008a\u0002\u001a\u00030\u0089\u0002*\u00030\u0085\u0002¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002¨\u0006\u008c\u0002"}, d2 = {"Lck0/b0;", "Lfk0/q;", "b", "(Lck0/b0;)Lfk0/q;", "Lck0/c0;", "Lfk0/r;", "c", "(Lck0/c0;)Lfk0/r;", "Lck0/c1;", "Lfk0/p0;", "y", "(Lck0/c1;)Lfk0/p0;", "Lck0/j1;", "Lfk0/z0;", "A", "(Lck0/j1;)Lfk0/z0;", "Lck0/f1;", "Lfk0/q0;", "z", "(Lck0/f1;)Lfk0/q0;", "Lck0/l0;", "Lfk0/p;", "a", "(Lck0/l0;)Lfk0/p;", "Lck0/n0;", "Lfk0/z;", "k", "(Lck0/n0;)Lfk0/z;", "Lck0/m0;", "Lfk0/y;", "j", "(Lck0/m0;)Lfk0/y;", "Lck0/s0;", "Lfk0/e0;", "o", "(Lck0/s0;)Lfk0/e0;", "Lck0/k0;", "Lfk0/w;", "h", "(Lck0/k0;)Lfk0/w;", "Lck0/d;", "Lfk0/v;", "g", "(Lck0/d;)Lfk0/v;", "Lck0/w0;", "Lfk0/i0;", "s", "(Lck0/w0;)Lfk0/i0;", "Lck0/c;", "Lfk0/u;", "f", "(Lck0/c;)Lfk0/u;", "Lck0/x0;", "Lfk0/j0;", "t", "(Lck0/x0;)Lfk0/j0;", "Lck0/z0;", "Lfk0/l0;", "v", "(Lck0/z0;)Lfk0/l0;", "Lck0/y0;", "Lfk0/k0;", "u", "(Lck0/y0;)Lfk0/k0;", "Lck0/r0;", "Lfk0/c0;", "n", "(Lck0/r0;)Lfk0/c0;", "Lck0/q0;", "Lfk0/b0;", "m", "(Lck0/q0;)Lfk0/b0;", "Lck0/o0;", "Lfk0/x;", "i", "(Lck0/o0;)Lfk0/x;", "Lck0/p0;", "Lfk0/a0;", "l", "(Lck0/p0;)Lfk0/a0;", "Lck0/t0;", "Lfk0/f0;", "p", "(Lck0/t0;)Lfk0/f0;", "Lck0/u0;", "Lfk0/g0;", "q", "(Lck0/u0;)Lfk0/g0;", "Lck0/v0;", "Lfk0/h0;", "r", "(Lck0/v0;)Lfk0/h0;", "Lck0/l1;", "Lfk0/b1;", "B", "(Lck0/l1;)Lfk0/b1;", "Lck0/m1;", "Lfk0/e1;", "C", "(Lck0/m1;)Lfk0/e1;", "Lck0/n1;", "Lfk0/f1;", ip.a.f96138c, "(Lck0/n1;)Lfk0/f1;", "Lck0/a1;", "Lfk0/m0;", "w", "(Lck0/a1;)Lfk0/m0;", "Lck0/b1;", "Lfk0/n0;", "x", "(Lck0/b1;)Lfk0/n0;", "Lck0/b;", "Lfk0/t;", "e", "(Lck0/b;)Lfk0/t;", "Lck0/a;", "Lfk0/s;", "d", "(Lck0/a;)Lfk0/s;", "Lck0/o1;", "Lfk0/j1;", "E", "(Lck0/o1;)Lfk0/j1;", "Lck0/p1;", "Lfk0/k1;", "F", "(Lck0/p1;)Lfk0/k1;", "Lfk0/b;", "Lck0/e;", "G", "(Lfk0/b;)Lck0/e;", "Lfk0/d;", "Lck0/f;", i.f37087n, "(Lfk0/d;)Lck0/f;", "Lfk0/n;", "Lck0/i0;", "g0", "(Lfk0/n;)Lck0/i0;", "Lfk0/h;", "Lck0/l;", i.f37094u, "(Lfk0/h;)Lck0/l;", "Lfk0/m;", "Lck0/h0;", "f0", "(Lfk0/m;)Lck0/h0;", "Lfk0/k;", "Lck0/o;", "O", "(Lfk0/k;)Lck0/o;", "Lfk0/o;", "Lck0/j0;", "h0", "(Lfk0/o;)Lck0/j0;", "Lfk0/j;", "Lck0/n;", "N", "(Lfk0/j;)Lck0/n;", "Lfk0/y0;", "Lck0/h1;", "j0", "(Lfk0/y0;)Lck0/h1;", "Lfk0/a1;", "Lck0/k1;", "k0", "(Lfk0/a1;)Lck0/k1;", "Lfk0/i;", "Lck0/m;", "M", "(Lfk0/i;)Lck0/m;", "Lfk0/f;", "Lck0/i;", "J", "(Lfk0/f;)Lck0/i;", "Lck0/j;", "o0", "(Lfk0/f;)Lck0/j;", "Lfk0/l;", "Lck0/d0;", "b0", "(Lfk0/l;)Lck0/d0;", "Lfk0/g;", "Lck0/k;", "K", "(Lfk0/g;)Lck0/k;", "Lfk0/a;", "Lck0/z;", "Z", "(Lfk0/a;)Lck0/z;", "Lfk0/e;", "Lck0/g;", "I", "(Lfk0/e;)Lck0/g;", "Lck0/h;", "n0", "(Lfk0/e;)Lck0/h;", "Lfk0/c;", "Lck0/a0;", "a0", "(Lfk0/c;)Lck0/a0;", "Lfk0/o0;", "Lck0/d1;", "i0", "(Lfk0/o0;)Lck0/d1;", "Lck0/e1;", "p0", "(Lfk0/o0;)Lck0/e1;", "Lfk0/s0;", "Lck0/q;", "Q", "(Lfk0/s0;)Lck0/q;", "Lfk0/g1;", "Lck0/e0;", "c0", "(Lfk0/g1;)Lck0/e0;", "Lfk0/v0;", "Lck0/t;", "T", "(Lfk0/v0;)Lck0/t;", "Lfk0/r0;", "Lck0/p;", i.f37086m, "(Lfk0/r0;)Lck0/p;", "Lfk0/x0;", "Lck0/w;", "W", "(Lfk0/x0;)Lck0/w;", "Lfk0/w0;", "Lck0/v;", "V", "(Lfk0/w0;)Lck0/v;", "Lfk0/t0;", "Lck0/r;", "R", "(Lfk0/t0;)Lck0/r;", "Lfk0/u0;", "Lck0/s;", ip.a.f96137b, "(Lfk0/u0;)Lck0/s;", "Lfk0/c1;", "Lck0/x;", "X", "(Lfk0/c1;)Lck0/x;", "Lfk0/d1;", "Lck0/y;", "Y", "(Lfk0/d1;)Lck0/y;", "Lfk0/h1;", "Lck0/f0;", "d0", "(Lfk0/h1;)Lck0/f0;", "Lfk0/i1;", "Lck0/g0;", "e0", "(Lfk0/i1;)Lck0/g0;", "Lfk0/d0;", "Lck0/u;", "U", "(Lfk0/d0;)Lck0/u;", "", "Lck0/i1;", "m0", "(Ljava/lang/String;)Lck0/i1;", "Lck0/g1;", "l0", "(Ljava/lang/String;)Lck0/g1;", "companyservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: bk0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0514a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f19885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f19886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f19887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f19888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f19889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f19890h;

        static {
            int[] iArr = new int[n0.values().length];
            try {
                iArr[n0.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n0.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n0.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n0.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19883a = iArr;
            int[] iArr2 = new int[w0.values().length];
            try {
                iArr2[w0.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[w0.SUSPENDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[w0.PENDING_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[w0.PARTNERSHIP_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[w0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f19884b = iArr2;
            int[] iArr3 = new int[c.values().length];
            try {
                iArr3[c.EDITION_2007.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[c.EDITION_2025.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[c.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f19885c = iArr3;
            int[] iArr4 = new int[x0.values().length];
            try {
                iArr4[x0.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[x0.RESUME_WITH_DATA_ADJUSTMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[x0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[x0.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            f19886d = iArr4;
            int[] iArr5 = new int[r0.values().length];
            try {
                iArr5[r0.COMPANY_EXISTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[r0.COMPANY_APPLICATION_ORDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[r0.COMPANY_APPLICATION_REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[r0.COMPANY_APPLICATION_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[r0.COMPANY_UNAVAILABLE_BECAUSE_OF_AGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[r0.COMPANY_UNAVAILABLE_BECAUSE_OF_MISSING_TRUSTED_PROFILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[r0.COMPANY_UNAVAILABLE_BECAUSE_OF_UNSUPPORTED_MAIN_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[r0.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            f19887e = iArr5;
            int[] iArr6 = new int[n.values().length];
            try {
                iArr6[n.ON_GENERAL_TERMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[n.FLAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[n.LUMP_SUM_FROM_RECORDED_REVENUES.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[n.NOT_DEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[n.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            f19888f = iArr6;
            int[] iArr7 = new int[h.values().length];
            try {
                iArr7[h.ALREADY_DECLARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[h.ATTACHED_DECLARATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[h.WILL_BE_DECLARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[h.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f19889g = iArr7;
            int[] iArr8 = new int[fk0.x0.values().length];
            try {
                iArr8[fk0.x0.ZUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[fk0.x0.KRUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[fk0.x0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f19890h = iArr8;
        }
    }

    public static final BEOrderApplicationResponse A(OrderApplicationResponse orderApplicationResponse) {
        return new BEOrderApplicationResponse(orderApplicationResponse.getExternalApplicationId());
    }

    public static final BERepresentativeRemovalStatement B(RepresentativeRemovalStatementResponseDto representativeRemovalStatementResponseDto) {
        return new BERepresentativeRemovalStatement(representativeRemovalStatementResponseDto.getStatementXml());
    }

    public static final BESocialInsuranceFund C(SocialInsuranceFundDto socialInsuranceFundDto) {
        return new BESocialInsuranceFund(socialInsuranceFundDto.getBuildingNumber(), socialInsuranceFundDto.getCity(), socialInsuranceFundDto.getDescription(), socialInsuranceFundDto.getName(), socialInsuranceFundDto.getPostalCode(), socialInsuranceFundDto.getStreetName());
    }

    public static final BESocialInsuranceFunds D(SocialInsuranceFundsDto socialInsuranceFundsDto) {
        List<SocialInsuranceFundDto> listA = socialInsuranceFundsDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(C((SocialInsuranceFundDto) it.next()));
        }
        return new BESocialInsuranceFunds(arrayList);
    }

    public static final BETaxOffice E(TaxOfficeDto taxOfficeDto) {
        return new BETaxOffice(taxOfficeDto.getBuildingNumber(), taxOfficeDto.getCity(), taxOfficeDto.getHeadName(), taxOfficeDto.getName(), taxOfficeDto.getPostalCode(), taxOfficeDto.getStreetName());
    }

    public static final BETaxOffices F(TaxOfficesDto taxOfficesDto) {
        List<TaxOfficeDto> listA = taxOfficesDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(E((TaxOfficeDto) it.next()));
        }
        return new BETaxOffices(arrayList);
    }

    public static final CompanyApplicationAddressDto G(BEApplicationAddress bEApplicationAddress) {
        return new CompanyApplicationAddressDto(bEApplicationAddress.getBuildingNumber(), bEApplicationAddress.getCity(), bEApplicationAddress.getCommune(), bEApplicationAddress.getCounty(), bEApplicationAddress.getPostalCode(), bEApplicationAddress.getSimc(), bEApplicationAddress.getTerc(), bEApplicationAddress.getVoivodeship(), bEApplicationAddress.getApartmentNumber(), bEApplicationAddress.getStreetName(), bEApplicationAddress.getStreetPrefix(), bEApplicationAddress.getUlic());
    }

    public static final CompanyApplicationAttachmentInputDto H(BEApplicationAttachment bEApplicationAttachment) {
        return new CompanyApplicationAttachmentInputDto(bEApplicationAttachment.getContentBase64(), bEApplicationAttachment.getFileName(), bEApplicationAttachment.getFormat());
    }

    public static final CompanyApplicationCompanyDetailsInputDto I(BEApplicationCompanyDetails bEApplicationCompanyDetails) {
        String abbreviatedName = bEApplicationCompanyDetails.getAbbreviatedName();
        CompanyApplicationSetupAccountingInputDto companyApplicationSetupAccountingInputDtoZ = Z(bEApplicationCompanyDetails.getAccounting());
        List<String> listC = bEApplicationCompanyDetails.c();
        LocalDate activityCommencementDate = bEApplicationCompanyDetails.getActivityCommencementDate();
        CompanyApplicationContactDetailsInputDto companyApplicationContactDetailsInputDtoJ = J(bEApplicationCompanyDetails.getContactDetails());
        CompanyApplicationCorrespondenceInputDto companyApplicationCorrespondenceInputDtoK = K(bEApplicationCompanyDetails.getCorrespondenceData());
        CompanyApplicationElectronicDeliveryInputDto companyApplicationElectronicDeliveryInputDtoM = M(bEApplicationCompanyDetails.getElectronicDelivery());
        String fullName = bEApplicationCompanyDetails.getFullName();
        CompanyApplicationInsuranceInputDto companyApplicationInsuranceInputDtoN = N(bEApplicationCompanyDetails.getInsurance());
        String mainActivityCategoryCode = bEApplicationCompanyDetails.getMainActivityCategoryCode();
        int plannedNumberOfEmployees = bEApplicationCompanyDetails.getPlannedNumberOfEmployees();
        BEApplicationAddress companyActivityAddress = bEApplicationCompanyDetails.getCompanyActivityAddress();
        return new CompanyApplicationCompanyDetailsInputDto(abbreviatedName, companyApplicationSetupAccountingInputDtoZ, listC, activityCommencementDate, companyApplicationContactDetailsInputDtoJ, companyApplicationCorrespondenceInputDtoK, companyApplicationElectronicDeliveryInputDtoM, fullName, companyApplicationInsuranceInputDtoN, mainActivityCategoryCode, plannedNumberOfEmployees, companyActivityAddress != null ? G(companyActivityAddress) : null);
    }

    public static final CompanyApplicationContactDetailsInputDto J(BEApplicationContactDetails bEApplicationContactDetails) {
        return new CompanyApplicationContactDetailsInputDto(bEApplicationContactDetails.getConsentToPublishData(), bEApplicationContactDetails.getEmail(), bEApplicationContactDetails.getPhoneNumber(), bEApplicationContactDetails.getWebAddress());
    }

    public static final CompanyApplicationCorrespondenceInputDto K(BEApplicationCorrespondence bEApplicationCorrespondence) {
        BEApplicationAddress correspondenceAddress = bEApplicationCorrespondence.getCorrespondenceAddress();
        CompanyApplicationAddressDto companyApplicationAddressDtoG = correspondenceAddress != null ? G(correspondenceAddress) : null;
        BEApplicationPostOfficeBox postOfficeBoxAddress = bEApplicationCorrespondence.getPostOfficeBoxAddress();
        return new CompanyApplicationCorrespondenceInputDto(companyApplicationAddressDtoG, postOfficeBoxAddress != null ? b0(postOfficeBoxAddress) : null, bEApplicationCorrespondence.getRecipientName());
    }

    public static final l L(h hVar) {
        int i15 = C0514a.f19889g[hVar.ordinal()];
        if (i15 == 1) {
            return l.ALREADY_DECLARED;
        }
        if (i15 == 2) {
            return l.ATTACHED_DECLARATION;
        }
        if (i15 == 3) {
            return l.WILL_BE_DECLARED;
        }
        if (i15 == 4) {
            return l.UNKNOWN;
        }
        throw new p();
    }

    public static final CompanyApplicationElectronicDeliveryInputDto M(BEApplicationElectronicDelivery bEApplicationElectronicDelivery) {
        BENonPublicSupplierInput nonPublicSupplierInput = bEApplicationElectronicDelivery.getNonPublicSupplierInput();
        NonPublicSupplierInputDto nonPublicSupplierInputDtoJ0 = nonPublicSupplierInput != null ? j0(nonPublicSupplierInput) : null;
        BEPublicSupplierInput publicSupplierInput = bEApplicationElectronicDelivery.getPublicSupplierInput();
        return new CompanyApplicationElectronicDeliveryInputDto(nonPublicSupplierInputDtoJ0, publicSupplierInput != null ? k0(publicSupplierInput) : null);
    }

    public static final CompanyApplicationInsuranceInputDto N(BEApplicationInsurance bEApplicationInsurance) {
        BEApplicationKrusInput krusInput = bEApplicationInsurance.getKrusInput();
        CompanyApplicationKrusInputDto companyApplicationKrusInputDtoO = krusInput != null ? O(krusInput) : null;
        BEApplicationZusInput zusInput = bEApplicationInsurance.getZusInput();
        return new CompanyApplicationInsuranceInputDto(companyApplicationKrusInputDtoO, zusInput != null ? h0(zusInput) : null);
    }

    public static final CompanyApplicationKrusInputDto O(BEApplicationKrusInput bEApplicationKrusInput) {
        boolean conductedNonAgriculturalBusiness = bEApplicationKrusInput.getConductedNonAgriculturalBusiness();
        boolean farmer = bEApplicationKrusInput.getFarmer();
        boolean insuranceContinued = bEApplicationKrusInput.getInsuranceContinued();
        String name = bEApplicationKrusInput.getName();
        Boolean incomeTaxExceeded = bEApplicationKrusInput.getIncomeTaxExceeded();
        h incomeTaxExceededDeclarationType = bEApplicationKrusInput.getIncomeTaxExceededDeclarationType();
        l lVarL = incomeTaxExceededDeclarationType != null ? L(incomeTaxExceededDeclarationType) : null;
        BEApplicationTaxOfficeInput taxOffice = bEApplicationKrusInput.getTaxOffice();
        return new CompanyApplicationKrusInputDto(conductedNonAgriculturalBusiness, farmer, insuranceContinued, name, null, incomeTaxExceeded, lVarL, taxOffice != null ? f0(taxOffice) : null, 16, null);
    }

    public static final CompanyApplicationManagementAccountingInputDto P(BEManagementAccounting bEManagementAccounting) {
        return new CompanyApplicationManagementAccountingInputDto(bEManagementAccounting.getTaxOfficeHeadName());
    }

    public static final CompanyApplicationManagementApplicantDetailsInputDto Q(BEManagementApplicantDetails bEManagementApplicantDetails) {
        return new CompanyApplicationManagementApplicantDetailsInputDto(bEManagementApplicantDetails.getFirstName(), bEManagementApplicantDetails.getPesel(), G(bEManagementApplicantDetails.getResidentialAddress()), bEManagementApplicantDetails.getSurname(), bEManagementApplicantDetails.getBirthDate(), bEManagementApplicantDetails.getGender(), bEManagementApplicantDetails.getNip(), bEManagementApplicantDetails.getRegon(), bEManagementApplicantDetails.getSecondName());
    }

    public static final CompanyApplicationManagementCompanyDetailsInputDto R(BEManagementCompanyDetails bEManagementCompanyDetails) {
        CompanyApplicationManagementAccountingInputDto companyApplicationManagementAccountingInputDtoP = P(bEManagementCompanyDetails.getAccounting());
        String entryId = bEManagementCompanyDetails.getEntryId();
        String fullName = bEManagementCompanyDetails.getFullName();
        CompanyApplicationManagementInsuranceInputDto companyApplicationManagementInsuranceInputDtoV = V(bEManagementCompanyDetails.getInsurance());
        String abbreviatedName = bEManagementCompanyDetails.getAbbreviatedName();
        List<String> listC = bEManagementCompanyDetails.c();
        BEApplicationElectronicDelivery electronicDelivery = bEManagementCompanyDetails.getElectronicDelivery();
        return new CompanyApplicationManagementCompanyDetailsInputDto(companyApplicationManagementAccountingInputDtoP, entryId, fullName, companyApplicationManagementInsuranceInputDtoV, abbreviatedName, listC, electronicDelivery != null ? M(electronicDelivery) : null, bEManagementCompanyDetails.getMainActivityCategoryCode());
    }

    public static final CompanyApplicationManagementCompanyDetailsInputV2Dto S(BEManagementCompanyDetailsV2 bEManagementCompanyDetailsV2) {
        CompanyApplicationManagementAccountingInputDto companyApplicationManagementAccountingInputDtoP = P(bEManagementCompanyDetailsV2.getAccounting());
        String entryId = bEManagementCompanyDetailsV2.getEntryId();
        String fullName = bEManagementCompanyDetailsV2.getFullName();
        CompanyApplicationManagementInsuranceInputDto companyApplicationManagementInsuranceInputDtoV = V(bEManagementCompanyDetailsV2.getInsurance());
        String abbreviatedName = bEManagementCompanyDetailsV2.getAbbreviatedName();
        List<String> listC = bEManagementCompanyDetailsV2.c();
        BECompanyManagementEmail contactDetailsEmail = bEManagementCompanyDetailsV2.getContactDetailsEmail();
        CompanyApplicationManagementEmailInputDto companyApplicationManagementEmailInputDtoU = contactDetailsEmail != null ? U(contactDetailsEmail) : null;
        BEApplicationElectronicDelivery electronicDelivery = bEManagementCompanyDetailsV2.getElectronicDelivery();
        return new CompanyApplicationManagementCompanyDetailsInputV2Dto(companyApplicationManagementAccountingInputDtoP, entryId, fullName, companyApplicationManagementInsuranceInputDtoV, abbreviatedName, listC, companyApplicationManagementEmailInputDtoU, electronicDelivery != null ? M(electronicDelivery) : null, bEManagementCompanyDetailsV2.getMainActivityCategoryCode());
    }

    public static final CompanyApplicationManagementDetailsDto T(BEManagementDetails bEManagementDetails) {
        CompanyApplicationSuspensionPeriodDto companyApplicationSuspensionPeriodDtoC0 = c0(bEManagementDetails.getChangePeriod());
        BESuspensionPeriod currentSuspensionPeriod = bEManagementDetails.getCurrentSuspensionPeriod();
        return new CompanyApplicationManagementDetailsDto(companyApplicationSuspensionPeriodDtoC0, currentSuspensionPeriod != null ? c0(currentSuspensionPeriod) : null);
    }

    public static final CompanyApplicationManagementEmailInputDto U(BECompanyManagementEmail bECompanyManagementEmail) {
        return new CompanyApplicationManagementEmailInputDto(bECompanyManagementEmail.getNoAddress(), bECompanyManagementEmail.getPublishConsent(), bECompanyManagementEmail.getEmail());
    }

    public static final CompanyApplicationManagementInsuranceInputDto V(BEManagementInsurance bEManagementInsurance) {
        w wVarW = W(bEManagementInsurance.getType());
        BEApplicationKrusInput krusInput = bEManagementInsurance.getKrusInput();
        return new CompanyApplicationManagementInsuranceInputDto(wVarW, krusInput != null ? O(krusInput) : null);
    }

    public static final w W(fk0.x0 x0Var) {
        int i15 = C0514a.f19890h[x0Var.ordinal()];
        if (i15 == 1) {
            return w.ZUS;
        }
        if (i15 == 2) {
            return w.KRUS;
        }
        if (i15 == 3) {
            return w.UNKNOWN;
        }
        throw new p();
    }

    public static final CompanyApplicationResumptionRequest X(BEResumptionRequest bEResumptionRequest) {
        ArrayList arrayList;
        CompanyApplicationManagementApplicantDetailsInputDto companyApplicationManagementApplicantDetailsInputDtoQ = Q(bEResumptionRequest.getApplicant());
        CompanyApplicationManagementDetailsDto companyApplicationManagementDetailsDtoT = T(bEResumptionRequest.getApplicationManagement());
        CompanyApplicationManagementCompanyDetailsInputDto companyApplicationManagementCompanyDetailsInputDtoR = R(bEResumptionRequest.getCompany());
        List<BEApplicationAttachment> listC = bEResumptionRequest.c();
        if (listC != null) {
            List<BEApplicationAttachment> list = listC;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(H((BEApplicationAttachment) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new CompanyApplicationResumptionRequest(companyApplicationManagementApplicantDetailsInputDtoQ, companyApplicationManagementDetailsDtoT, companyApplicationManagementCompanyDetailsInputDtoR, arrayList);
    }

    public static final CompanyApplicationResumptionV2Request Y(BEResumptionRequestV2 bEResumptionRequestV2) {
        ArrayList arrayList;
        CompanyApplicationManagementApplicantDetailsInputDto companyApplicationManagementApplicantDetailsInputDtoQ = Q(bEResumptionRequestV2.getApplicant());
        CompanyApplicationManagementDetailsDto companyApplicationManagementDetailsDtoT = T(bEResumptionRequestV2.getApplicationManagement());
        CompanyApplicationManagementCompanyDetailsInputV2Dto companyApplicationManagementCompanyDetailsInputV2DtoS = S(bEResumptionRequestV2.getCompany());
        List<BEApplicationAttachment> listC = bEResumptionRequestV2.c();
        if (listC != null) {
            List<BEApplicationAttachment> list = listC;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(H((BEApplicationAttachment) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new CompanyApplicationResumptionV2Request(companyApplicationManagementApplicantDetailsInputDtoQ, companyApplicationManagementDetailsDtoT, companyApplicationManagementCompanyDetailsInputV2DtoS, arrayList);
    }

    public static final CompanyApplicationSetupAccountingInputDto Z(BEApplicationAccounting bEApplicationAccounting) {
        return new CompanyApplicationSetupAccountingInputDto(G(bEApplicationAccounting.getDocumentationStorageAddress()), bEApplicationAccounting.getTaxOfficeHeadName(), g0(bEApplicationAccounting.getTaxType()), bEApplicationAccounting.getExternalOperatorName(), bEApplicationAccounting.getExternalOperatorNip());
    }

    public static final BECategoryEditionAlert a(CompanyCategoryEditionAlertDto companyCategoryEditionAlertDto) {
        return new BECategoryEditionAlert(companyCategoryEditionAlertDto.getLinkName(), companyCategoryEditionAlertDto.getMessage(), companyCategoryEditionAlertDto.getUrl());
    }

    public static final CompanyApplicationSetupApplicantDetailsInputDto a0(BEApplicationApplicantDetails bEApplicationApplicantDetails) {
        return new CompanyApplicationSetupApplicantDetailsInputDto(bEApplicationApplicantDetails.getBirthPlace(), bEApplicationApplicantDetails.getFirstName(), bEApplicationApplicantDetails.getMobileIdCardNumber(), bEApplicationApplicantDetails.getPesel(), G(bEApplicationApplicantDetails.getResidentialAddress()), bEApplicationApplicantDetails.getSurname(), bEApplicationApplicantDetails.getBirthDate(), bEApplicationApplicantDetails.getFamilyName(), bEApplicationApplicantDetails.getFatherName(), bEApplicationApplicantDetails.getGender(), bEApplicationApplicantDetails.getMotherName(), bEApplicationApplicantDetails.getSecondName());
    }

    public static final BECitizenAddress b(CompanyApplicationSetupCitizenAddressDto companyApplicationSetupCitizenAddressDto) {
        return new BECitizenAddress(companyApplicationSetupCitizenAddressDto.getSimc(), companyApplicationSetupCitizenAddressDto.getTerc(), companyApplicationSetupCitizenAddressDto.getApartmentNumber(), companyApplicationSetupCitizenAddressDto.getCity(), companyApplicationSetupCitizenAddressDto.getCommune(), companyApplicationSetupCitizenAddressDto.getCounty(), companyApplicationSetupCitizenAddressDto.getHouseNumber(), companyApplicationSetupCitizenAddressDto.getPostalCode(), companyApplicationSetupCitizenAddressDto.getStreetName(), companyApplicationSetupCitizenAddressDto.getStreetPrefix(), companyApplicationSetupCitizenAddressDto.getUlic(), companyApplicationSetupCitizenAddressDto.getVoivodeship());
    }

    public static final CompanyApplicationSetupPostOfficeBoxAddressDto b0(BEApplicationPostOfficeBox bEApplicationPostOfficeBox) {
        return new CompanyApplicationSetupPostOfficeBoxAddressDto(bEApplicationPostOfficeBox.getCity(), bEApplicationPostOfficeBox.getNumber(), bEApplicationPostOfficeBox.getPostalCode(), bEApplicationPostOfficeBox.getPostOfficeName());
    }

    public static final BECitizenData c(CompanyApplicationSetupCitizenDataDto companyApplicationSetupCitizenDataDto) {
        String firstName = companyApplicationSetupCitizenDataDto.getFirstName();
        String pesel = companyApplicationSetupCitizenDataDto.getPesel();
        String physicalIdSerialNumber = companyApplicationSetupCitizenDataDto.getPhysicalIdSerialNumber();
        String surname = companyApplicationSetupCitizenDataDto.getSurname();
        String birthDate = companyApplicationSetupCitizenDataDto.getBirthDate();
        String birthPlace = companyApplicationSetupCitizenDataDto.getBirthPlace();
        String citizenship = companyApplicationSetupCitizenDataDto.getCitizenship();
        String familyName = companyApplicationSetupCitizenDataDto.getFamilyName();
        String fatherName = companyApplicationSetupCitizenDataDto.getFatherName();
        String gender = companyApplicationSetupCitizenDataDto.getGender();
        String motherName = companyApplicationSetupCitizenDataDto.getMotherName();
        CompanyApplicationSetupCitizenAddressDto permanentAddress = companyApplicationSetupCitizenDataDto.getPermanentAddress();
        return new BECitizenData(firstName, pesel, physicalIdSerialNumber, surname, birthDate, birthPlace, citizenship, familyName, fatherName, gender, motherName, permanentAddress != null ? b(permanentAddress) : null, companyApplicationSetupCitizenDataDto.getSecondName());
    }

    public static final CompanyApplicationSuspensionPeriodDto c0(BESuspensionPeriod bESuspensionPeriod) {
        return new CompanyApplicationSuspensionPeriodDto(bESuspensionPeriod.getFrom(), bESuspensionPeriod.getTo());
    }

    public static final BECompanyActivityCategories d(CompanyActivityCategoriesDto companyActivityCategoriesDto) {
        List<CompanyActivityCategoryDto> listA = companyActivityCategoriesDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(e((CompanyActivityCategoryDto) it.next()));
        }
        return new BECompanyActivityCategories(arrayList);
    }

    public static final CompanyApplicationSuspensionRequest d0(BESuspensionRequest bESuspensionRequest) {
        ArrayList arrayList;
        CompanyApplicationManagementApplicantDetailsInputDto companyApplicationManagementApplicantDetailsInputDtoQ = Q(bESuspensionRequest.getApplicant());
        CompanyApplicationManagementDetailsDto companyApplicationManagementDetailsDtoT = T(bESuspensionRequest.getApplicationManagement());
        CompanyApplicationManagementCompanyDetailsInputDto companyApplicationManagementCompanyDetailsInputDtoR = R(bESuspensionRequest.getCompany());
        List<BEApplicationAttachment> listC = bESuspensionRequest.c();
        if (listC != null) {
            List<BEApplicationAttachment> list = listC;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(H((BEApplicationAttachment) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new CompanyApplicationSuspensionRequest(companyApplicationManagementApplicantDetailsInputDtoQ, companyApplicationManagementDetailsDtoT, companyApplicationManagementCompanyDetailsInputDtoR, arrayList);
    }

    public static final BECompanyActivityCategory e(CompanyActivityCategoryDto companyActivityCategoryDto) {
        return new BECompanyActivityCategory(companyActivityCategoryDto.getCode(), companyActivityCategoryDto.getName(), companyActivityCategoryDto.getSectionCode(), companyActivityCategoryDto.getDescription());
    }

    public static final CompanyApplicationSuspensionV2Request e0(BESuspensionRequestV2 bESuspensionRequestV2) {
        ArrayList arrayList;
        CompanyApplicationManagementApplicantDetailsInputDto companyApplicationManagementApplicantDetailsInputDtoQ = Q(bESuspensionRequestV2.getApplicant());
        CompanyApplicationManagementDetailsDto companyApplicationManagementDetailsDtoT = T(bESuspensionRequestV2.getApplicationManagement());
        CompanyApplicationManagementCompanyDetailsInputV2Dto companyApplicationManagementCompanyDetailsInputV2DtoS = S(bESuspensionRequestV2.getCompany());
        List<BEApplicationAttachment> listC = bESuspensionRequestV2.c();
        if (listC != null) {
            List<BEApplicationAttachment> list = listC;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(H((BEApplicationAttachment) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new CompanyApplicationSuspensionV2Request(companyApplicationManagementApplicantDetailsInputDtoQ, companyApplicationManagementDetailsDtoT, companyApplicationManagementCompanyDetailsInputV2DtoS, arrayList);
    }

    public static final u f(c cVar) {
        int i15 = C0514a.f19885c[cVar.ordinal()];
        if (i15 == 1) {
            return u.EDITION_2007;
        }
        if (i15 == 2) {
            return u.EDITION_2025;
        }
        if (i15 == 3) {
            return u.UNKNOWN;
        }
        throw new p();
    }

    public static final CompanyApplicationTaxOfficeInputDto f0(BEApplicationTaxOfficeInput bEApplicationTaxOfficeInput) {
        return new CompanyApplicationTaxOfficeInputDto(bEApplicationTaxOfficeInput.getBuildingNumber(), bEApplicationTaxOfficeInput.getCity(), bEApplicationTaxOfficeInput.getName(), bEApplicationTaxOfficeInput.getPostalCode(), bEApplicationTaxOfficeInput.getStreetName());
    }

    public static final BECompanyAddresses g(CompanyAddressesDto companyAddressesDto) {
        return new BECompanyAddresses(companyAddressesDto.a(), companyAddressesDto.getCorrespondenceAddress(), companyAddressesDto.getElectronicDeliveryAddressV2(), companyAddressesDto.getMainAddress());
    }

    public static final i0 g0(n nVar) {
        int i15 = C0514a.f19888f[nVar.ordinal()];
        if (i15 == 1) {
            return i0.ON_GENERAL_TERMS;
        }
        if (i15 == 2) {
            return i0.FLAT;
        }
        if (i15 == 3) {
            return i0.LUMP_SUM_FROM_RECORDED_REVENUES;
        }
        if (i15 == 4) {
            return i0.NOT_DEFINED;
        }
        if (i15 == 5) {
            return i0.UNKNOWN;
        }
        throw new p();
    }

    public static final BECompanyCategory h(CompanyCategoryDto companyCategoryDto) {
        return new BECompanyCategory(companyCategoryDto.getCode(), companyCategoryDto.getName());
    }

    public static final CompanyApplicationZusInputDto h0(BEApplicationZusInput bEApplicationZusInput) {
        return new CompanyApplicationZusInputDto(bEApplicationZusInput.getPaymentStartDate());
    }

    public static final BECompanyData i(CompanyDataDto companyDataDto) {
        BECompanyAddresses bECompanyAddressesG = g(companyDataDto.getAddresses());
        u uVarF = f(companyDataDto.getCategoryEdition());
        String categoryLabelPostfix = companyDataDto.getCategoryLabelPostfix();
        String companyName = companyDataDto.getCompanyName();
        fk0.i0 i0VarS = s(companyDataDto.getCompanyStatus());
        String companyStatusDescription = companyDataDto.getCompanyStatusDescription();
        boolean hasNoEmail = companyDataDto.getHasNoEmail();
        String entryId = companyDataDto.getEntryId();
        List<CompanyDataAlertDto> listM = companyDataDto.m();
        ArrayList arrayList = new ArrayList(v.y(listM, 10));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(j((CompanyDataAlertDto) it.next()));
        }
        List<CompanyCategoryDto> listP = companyDataDto.p();
        ArrayList arrayList2 = new ArrayList(v.y(listP, 10));
        Iterator<T> it4 = listP.iterator();
        while (it4.hasNext()) {
            arrayList2.add(h((CompanyCategoryDto) it4.next()));
        }
        BECompanyOwner bECompanyOwnerO = o(companyDataDto.getOwner());
        String startDate = companyDataDto.getStartDate();
        CompanyCategoryEditionAlertDto categoryEditionAlert = companyDataDto.getCategoryEditionAlert();
        BECategoryEditionAlert bECategoryEditionAlertA = categoryEditionAlert != null ? a(categoryEditionAlert) : null;
        String companyAbbreviatedName = companyDataDto.getCompanyAbbreviatedName();
        String email = companyDataDto.getEmail();
        String endDate = companyDataDto.getEndDate();
        CompanyCategoryDto mainCategory = companyDataDto.getMainCategory();
        return new BECompanyData(bECompanyAddressesG, uVarF, categoryLabelPostfix, companyName, i0VarS, companyStatusDescription, hasNoEmail, entryId, arrayList, arrayList2, bECompanyOwnerO, startDate, bECategoryEditionAlertA, companyAbbreviatedName, email, endDate, mainCategory != null ? h(mainCategory) : null, companyDataDto.getNip(), companyDataDto.getPhoneNumber(), companyDataDto.getRegon(), companyDataDto.getResumptionDate(), companyDataDto.getSuspensionFromDate(), companyDataDto.getSuspensionToDate(), companyDataDto.getWebsiteUrl());
    }

    public static final GenerateApplicationSetupRequest i0(BEGenerateApplicationRequest bEGenerateApplicationRequest) {
        ArrayList arrayList;
        CompanyApplicationSetupApplicantDetailsInputDto companyApplicationSetupApplicantDetailsInputDtoA0 = a0(bEGenerateApplicationRequest.getApplicant());
        CompanyApplicationCompanyDetailsInputDto companyApplicationCompanyDetailsInputDtoI = I(bEGenerateApplicationRequest.getCompany());
        List<BEApplicationAttachment> listB = bEGenerateApplicationRequest.b();
        if (listB != null) {
            List<BEApplicationAttachment> list = listB;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(H((BEApplicationAttachment) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new GenerateApplicationSetupRequest(companyApplicationSetupApplicantDetailsInputDtoA0, companyApplicationCompanyDetailsInputDtoI, arrayList);
    }

    public static final BECompanyDataAlert j(CompanyDataAlertDto companyDataAlertDto) {
        String message = companyDataAlertDto.getMessage();
        z zVarK = k(companyDataAlertDto.getType());
        LinkDto link = companyDataAlertDto.getLink();
        return new BECompanyDataAlert(message, zVarK, link != null ? z(link) : null);
    }

    public static final NonPublicSupplierInputDto j0(BENonPublicSupplierInput bENonPublicSupplierInput) {
        return new NonPublicSupplierInputDto(bENonPublicSupplierInput.getElectronicDeliveryAddress(), bENonPublicSupplierInput.getName());
    }

    public static final z k(n0 n0Var) {
        int i15 = C0514a.f19883a[n0Var.ordinal()];
        if (i15 == 1) {
            return z.INFO;
        }
        if (i15 == 2) {
            return z.WARNING;
        }
        if (i15 == 3) {
            return z.ERROR;
        }
        if (i15 == 4) {
            return z.SUCCESS;
        }
        if (i15 == 5) {
            return z.UNKNOWN;
        }
        throw new p();
    }

    public static final PublicSupplierInputDto k0(BEPublicSupplierInput bEPublicSupplierInput) {
        return new PublicSupplierInputDto(bEPublicSupplierInput.getEmail());
    }

    public static final BECompanyDetails l(CompanyDetailsResponseDto companyDetailsResponseDto) {
        BECompanyInfo bECompanyInfoM = m(companyDetailsResponseDto.getInfo());
        boolean ownerAdult = companyDetailsResponseDto.getOwnerAdult();
        CompanyDataDto companyData = companyDetailsResponseDto.getCompanyData();
        BECompanyData bECompanyDataI = companyData != null ? i(companyData) : null;
        CompanySuspensionOptionsDto suspensionOptions = companyDetailsResponseDto.getSuspensionOptions();
        return new BECompanyDetails(bECompanyInfoM, ownerAdult, bECompanyDataI, suspensionOptions != null ? u(suspensionOptions) : null);
    }

    public static final ModifyCompanyRepresentativeRequestDto l0(String str) {
        return new ModifyCompanyRepresentativeRequestDto(str);
    }

    public static final BECompanyInfo m(CompanyInfoDto companyInfoDto) {
        return new BECompanyInfo(n(companyInfoDto.getStatus()), companyInfoDto.getMessage(), companyInfoDto.getTitle());
    }

    public static final OrderApplicationRequest m0(String str) {
        return new OrderApplicationRequest(str);
    }

    public static final c0 n(r0 r0Var) {
        switch (C0514a.f19887e[r0Var.ordinal()]) {
            case 1:
                return c0.COMPANY_EXISTS;
            case 2:
                return c0.COMPANY_APPLICATION_ORDERED;
            case 3:
                return c0.COMPANY_APPLICATION_REJECTED;
            case 4:
                return c0.COMPANY_APPLICATION_AVAILABLE;
            case 5:
                return c0.COMPANY_UNAVAILABLE_BECAUSE_OF_AGE;
            case 6:
                return c0.COMPANY_UNAVAILABLE_BECAUSE_OF_MISSING_TRUSTED_PROFILE;
            case 7:
                return c0.COMPANY_UNAVAILABLE_BECAUSE_OF_UNSUPPORTED_MAIN_DOCUMENT;
            case 8:
                return c0.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final CompanyApplicationCompanyDetailsInputV2Dto n0(BEApplicationCompanyDetails bEApplicationCompanyDetails) {
        String abbreviatedName = bEApplicationCompanyDetails.getAbbreviatedName();
        CompanyApplicationSetupAccountingInputDto companyApplicationSetupAccountingInputDtoZ = Z(bEApplicationCompanyDetails.getAccounting());
        List<String> listC = bEApplicationCompanyDetails.c();
        LocalDate activityCommencementDate = bEApplicationCompanyDetails.getActivityCommencementDate();
        CompanyApplicationContactDetailsInputV2Dto companyApplicationContactDetailsInputV2DtoO0 = o0(bEApplicationCompanyDetails.getContactDetails());
        CompanyApplicationCorrespondenceInputDto companyApplicationCorrespondenceInputDtoK = K(bEApplicationCompanyDetails.getCorrespondenceData());
        CompanyApplicationElectronicDeliveryInputDto companyApplicationElectronicDeliveryInputDtoM = M(bEApplicationCompanyDetails.getElectronicDelivery());
        String fullName = bEApplicationCompanyDetails.getFullName();
        CompanyApplicationInsuranceInputDto companyApplicationInsuranceInputDtoN = N(bEApplicationCompanyDetails.getInsurance());
        String mainActivityCategoryCode = bEApplicationCompanyDetails.getMainActivityCategoryCode();
        int plannedNumberOfEmployees = bEApplicationCompanyDetails.getPlannedNumberOfEmployees();
        BEApplicationAddress companyActivityAddress = bEApplicationCompanyDetails.getCompanyActivityAddress();
        return new CompanyApplicationCompanyDetailsInputV2Dto(abbreviatedName, companyApplicationSetupAccountingInputDtoZ, listC, activityCommencementDate, companyApplicationContactDetailsInputV2DtoO0, companyApplicationCorrespondenceInputDtoK, companyApplicationElectronicDeliveryInputDtoM, fullName, companyApplicationInsuranceInputDtoN, mainActivityCategoryCode, plannedNumberOfEmployees, companyActivityAddress != null ? G(companyActivityAddress) : null);
    }

    public static final BECompanyOwner o(CompanyOwnerDto companyOwnerDto) {
        return new BECompanyOwner(companyOwnerDto.getFirstName(), companyOwnerDto.getLastName(), companyOwnerDto.getPesel());
    }

    public static final CompanyApplicationContactDetailsInputV2Dto o0(BEApplicationContactDetails bEApplicationContactDetails) {
        return new CompanyApplicationContactDetailsInputV2Dto(bEApplicationContactDetails.getEmail(), bEApplicationContactDetails.getPublishEmailConsent(), bEApplicationContactDetails.getPublishPhoneNumberConsent(), bEApplicationContactDetails.getPublishWebAddressConsent(), bEApplicationContactDetails.getPhoneNumber(), bEApplicationContactDetails.getWebAddress());
    }

    public static final BECompanyPrintout p(CompanyPrintoutDto companyPrintoutDto) {
        return new BECompanyPrintout(companyPrintoutDto.getDocumentBase64());
    }

    public static final GenerateApplicationSetupV2Request p0(BEGenerateApplicationRequest bEGenerateApplicationRequest) {
        ArrayList arrayList;
        CompanyApplicationSetupApplicantDetailsInputDto companyApplicationSetupApplicantDetailsInputDtoA0 = a0(bEGenerateApplicationRequest.getApplicant());
        CompanyApplicationCompanyDetailsInputV2Dto companyApplicationCompanyDetailsInputV2DtoN0 = n0(bEGenerateApplicationRequest.getCompany());
        List<BEApplicationAttachment> listB = bEGenerateApplicationRequest.b();
        if (listB != null) {
            List<BEApplicationAttachment> list = listB;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(H((BEApplicationAttachment) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new GenerateApplicationSetupV2Request(companyApplicationSetupApplicantDetailsInputDtoA0, companyApplicationCompanyDetailsInputV2DtoN0, arrayList);
    }

    public static final BECompanyRepresentative q(CompanyRepresentativeDto companyRepresentativeDto) {
        return new BECompanyRepresentative(companyRepresentativeDto.getId(), companyRepresentativeDto.getName(), companyRepresentativeDto.getRole(), companyRepresentativeDto.getKrs());
    }

    public static final BECompanyRepresentatives r(CompanyRepresentativesResponseDto companyRepresentativesResponseDto) {
        List<CompanyRepresentativeDto> listA = companyRepresentativesResponseDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(q((CompanyRepresentativeDto) it.next()));
        }
        return new BECompanyRepresentatives(arrayList);
    }

    public static final fk0.i0 s(w0 w0Var) {
        int i15 = C0514a.f19884b[w0Var.ordinal()];
        if (i15 == 1) {
            return fk0.i0.ACTIVE;
        }
        if (i15 == 2) {
            return fk0.i0.SUSPENDED;
        }
        if (i15 == 3) {
            return fk0.i0.PENDING_START;
        }
        if (i15 == 4) {
            return fk0.i0.PARTNERSHIP_ONLY;
        }
        if (i15 == 5) {
            return fk0.i0.UNKNOWN;
        }
        throw new p();
    }

    public static final j0 t(x0 x0Var) {
        int i15 = C0514a.f19886d[x0Var.ordinal()];
        if (i15 == 1) {
            return j0.SUSPEND;
        }
        if (i15 == 2) {
            return j0.RESUME_WITH_DATA_ADJUSTMENT;
        }
        if (i15 == 3) {
            return j0.NONE;
        }
        if (i15 == 4) {
            return j0.UNKNOWN;
        }
        throw new p();
    }

    public static final BECompanySuspensionOptions u(CompanySuspensionOptionsDto companySuspensionOptionsDto) {
        boolean actionBlocked = companySuspensionOptionsDto.getActionBlocked();
        j0 j0VarT = t(companySuspensionOptionsDto.getAvailableAction());
        int minSuspensionDays = companySuspensionOptionsDto.getMinSuspensionDays();
        CompanySuspensionRangeDto endRange = companySuspensionOptionsDto.getEndRange();
        BECompanySuspensionRange bECompanySuspensionRangeV = endRange != null ? v(endRange) : null;
        CompanySuspensionRangeDto startRange = companySuspensionOptionsDto.getStartRange();
        return new BECompanySuspensionOptions(actionBlocked, j0VarT, minSuspensionDays, bECompanySuspensionRangeV, startRange != null ? v(startRange) : null);
    }

    public static final BECompanySuspensionRange v(CompanySuspensionRangeDto companySuspensionRangeDto) {
        return new BECompanySuspensionRange(companySuspensionRangeDto.getMax(), companySuspensionRangeDto.getMin());
    }

    public static final BEElectronicDeliveryNonPublicSupplier w(ElectronicDeliveryNonPublicSupplierDto electronicDeliveryNonPublicSupplierDto) {
        return new BEElectronicDeliveryNonPublicSupplier(electronicDeliveryNonPublicSupplierDto.getName());
    }

    public static final BEElectronicDeliveryNonPublicSuppliers x(ElectronicDeliveryNonPublicSuppliersDto electronicDeliveryNonPublicSuppliersDto) {
        List<ElectronicDeliveryNonPublicSupplierDto> listA = electronicDeliveryNonPublicSuppliersDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(w((ElectronicDeliveryNonPublicSupplierDto) it.next()));
        }
        return new BEElectronicDeliveryNonPublicSuppliers(arrayList);
    }

    public static final BEGenerateApplicationResponse y(GenerateApplicationResponse generateApplicationResponse) {
        return new BEGenerateApplicationResponse(generateApplicationResponse.getApplicationXml());
    }

    public static final BELink z(LinkDto linkDto) {
        return new BELink(linkDto.getName(), linkDto.getUrl());
    }
}
