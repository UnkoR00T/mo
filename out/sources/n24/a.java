package n24;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import dx.j;
import ex.d;
import f24.Document;
import f24.DocumentConfigLabel;
import f24.DocumentScope;
import f24.c;
import f24.h;
import g24.AdditionalLogo;
import g24.BarcodeSchema;
import g24.DocumentActionAttribute;
import g24.DocumentBottomAnnotation;
import g24.DocumentBottomAnnotationSection;
import g24.DocumentDynamicSection;
import g24.DocumentSchema;
import g24.DocumentSchemaAttribute;
import g24.DocumentSchemaBooleanTranslation;
import g24.DocumentSchemaEnumTranslation;
import g24.DocumentSchemaForwardAttribute;
import g24.DocumentSchemaLabel;
import g24.DocumentStaticSection;
import g24.DocumentTopAnnotation;
import g24.DocumentsGroup;
import g24.MissingDocumentAttribute;
import g24.PictureSchema;
import g24.QrCodeSchema;
import g24.g;
import g24.l;
import g24.r;
import h24.MultiDocumentSchema;
import h24.MultiDocumentSelectorLabel;
import h24.MultiDocumentView;
import h24.VerificationSelector;
import i24.AdvocateCardContainerData;
import i24.AdvocateCardScope;
import i24.DeputyCardContainerData;
import i24.DeputyCardScope;
import i24.DistanceMeter;
import i24.DocumentModel;
import i24.DrivingLicenceCategory;
import i24.DrivingLicenceContainerData;
import i24.DrivingLicenceScope;
import i24.DrivingLicenceStatusChangedReason;
import i24.FamilyCardContainerData;
import i24.FamilyCardScope;
import i24.MIdCardScope;
import i24.MidCardScopeDataContainer;
import i24.MobileIdCardContainer;
import i24.NipipCardContainerData;
import i24.NipipCardScope;
import i24.PensionerCardContainerData;
import i24.PensionerCardScope;
import i24.PersonalAddressContainer;
import i24.PersonalDataContainer;
import i24.PersonalIdCardContainer;
import i24.RailwayCardContainerData;
import i24.RailwayCardScope;
import i24.RefugeeCardScope;
import i24.StudentCardContainerData;
import i24.StudentCardScope;
import i24.TimeMeter;
import i24.VehicleDocumentContainerData;
import i24.VehicleDocumentScope;
import i24.VehicleInsuranceModel;
import i24.WruDocumentItem;
import i24.WruDocumentScope;
import i24.i0;
import j24.DataHeaderStandard;
import j24.IdentityDataHeader;
import j24.MnemonicHeader;
import j24.RefugeeMnemonicHeader;
import j24.StudentCardHeader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import m24.DocumentEntity;
import m24.DocumentScopeEntity;
import mx.Label;
import o24.AdditionalLogoDto;
import o24.BarcodeSchemaDto;
import o24.CategoryContainer;
import o24.DocumentBottomAnnotationDto;
import o24.DocumentBottomAnnotationSectionDto;
import o24.DocumentDynamicSectionDto;
import o24.DocumentSchemaActionAttributeDto;
import o24.DocumentSchemaAttributeDto;
import o24.DocumentSchemaBooleanTranslationDto;
import o24.DocumentSchemaDto;
import o24.DocumentSchemaEnumTranslationDto;
import o24.DocumentSchemaForwardAttributeDto;
import o24.DocumentSchemaLabelDto;
import o24.DocumentStaticSectionDto;
import o24.DocumentTopAnnotationDto;
import o24.DocumentsGroupDto;
import o24.DrivingLicenceDataContainer;
import o24.LabelDto;
import o24.MissingDocumentAttributeDto;
import o24.MnemonicHeaderContainer;
import o24.MultiDocumentSchemaDto;
import o24.MultiDocumentSelectorLabelDto;
import o24.MultiDocumentViewDto;
import o24.NipipDataContainer;
import o24.NipipScope;
import o24.PersonalDataScope9;
import o24.PersonalDataScope9DataContainer;
import o24.PictureSchemaDto;
import o24.QrCodeSchemaDto;
import o24.StatusChangedReasonContainer;
import o24.VerificationSelectorDto;
import o24.b0;
import o24.c0;
import o24.g0;
import o24.l0;
import o24.m;
import o24.m0;
import o24.n0;
import o24.q;
import o24.u0;
import o24.v;
import o24.x0;
import o24.y;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntityStatus;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntityType;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentEntityStatus;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentEntityType;
import pl.gov.coi.mobywatel.technical.containers.data.model.AdvocateCardContainerDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.AdvocateCardDataDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.DataHeaderDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.DataHeaderStudentDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.DataHeaderVehicleDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.DeputyCardContainerDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.DeputyCardDataDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.DistanceMeterDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.FamilyCardDataDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.FamilyCardScopeDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.InsuranceDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.OtherDocumentDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.PensionerCardContainerDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.PensionerCardDataDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.RailwayCardContainerDataDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.RailwayCardScopeDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.RefugeeCardContainerDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.RefugeeCardDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.StudentCardDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.TimeMeterDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.VehicleCardDataDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.VehicleFullDocumentDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.WruLicenceDataContainerItemDto;
import pl.gov.coi.mobywatel.technical.containers.data.model.WruLicenceDataDto;
import px.f;
import xw.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ô\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010%\u001a\u00020\r*\u00020$¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010)\u001a\u00020(*\u00020'¢\u0006\u0004\b)\u0010*\u001a\u0011\u0010-\u001a\u00020,*\u00020+¢\u0006\u0004\b-\u0010.\u001a\u0011\u00101\u001a\u000200*\u00020/¢\u0006\u0004\b1\u00102\u001a\u0011\u00105\u001a\u000204*\u000203¢\u0006\u0004\b5\u00106\u001a\u0011\u00107\u001a\u000203*\u000204¢\u0006\u0004\b7\u00108\u001a\u0011\u0010;\u001a\u00020:*\u000209¢\u0006\u0004\b;\u0010<\u001a\u0011\u0010?\u001a\u00020>*\u00020=¢\u0006\u0004\b?\u0010@\u001a\u0011\u0010C\u001a\u00020B*\u00020A¢\u0006\u0004\bC\u0010D\u001a\u0011\u0010G\u001a\u00020F*\u00020E¢\u0006\u0004\bG\u0010H\u001a\u0011\u0010K\u001a\u00020J*\u00020I¢\u0006\u0004\bK\u0010L\u001a\u0011\u0010O\u001a\u00020N*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u0011\u0010S\u001a\u00020R*\u00020Q¢\u0006\u0004\bS\u0010T\u001a\u0011\u0010W\u001a\u00020V*\u00020U¢\u0006\u0004\bW\u0010X\u001a\u0011\u0010[\u001a\u00020Z*\u00020Y¢\u0006\u0004\b[\u0010\\\u001a\u0011\u0010_\u001a\u00020^*\u00020]¢\u0006\u0004\b_\u0010`\u001a\u0011\u0010c\u001a\u00020b*\u00020a¢\u0006\u0004\bc\u0010d\u001a\u0011\u0010g\u001a\u00020f*\u00020e¢\u0006\u0004\bg\u0010h\u001a\u0011\u0010k\u001a\u00020j*\u00020i¢\u0006\u0004\bk\u0010l\u001a\u0011\u0010o\u001a\u00020n*\u00020m¢\u0006\u0004\bo\u0010p\u001a\u0011\u0010s\u001a\u00020r*\u00020q¢\u0006\u0004\bs\u0010t\u001a\u0011\u0010w\u001a\u00020v*\u00020u¢\u0006\u0004\bw\u0010x\u001a\u0011\u0010{\u001a\u00020z*\u00020y¢\u0006\u0004\b{\u0010|\u001a\u0011\u0010}\u001a\u00020y*\u00020z¢\u0006\u0004\b}\u0010~\u001a\u0015\u0010\u0081\u0001\u001a\u00030\u0080\u0001*\u00020\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0015\u0010\u0083\u0001\u001a\u00020\u007f*\u00030\u0080\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0016\u0010\u0087\u0001\u001a\u00030\u0086\u0001*\u00030\u0085\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0016\u0010\u008b\u0001\u001a\u00030\u008a\u0001*\u00030\u0089\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0016\u0010\u008f\u0001\u001a\u00030\u008e\u0001*\u00030\u008d\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0016\u0010\u0091\u0001\u001a\u00030\u008d\u0001*\u00030\u008e\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a$\u0010\u0097\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u0095\u0001\u0012\u0005\u0012\u00030\u0096\u00010\u0094\u0001*\u00030\u0093\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0016\u0010\u009b\u0001\u001a\u00030\u009a\u0001*\u00030\u0099\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0016\u0010\u009f\u0001\u001a\u00030\u009e\u0001*\u00030\u009d\u0001¢\u0006\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0016\u0010£\u0001\u001a\u00030¢\u0001*\u00030¡\u0001¢\u0006\u0006\b£\u0001\u0010¤\u0001\u001a\u0016\u0010§\u0001\u001a\u00030¦\u0001*\u00030¥\u0001¢\u0006\u0006\b§\u0001\u0010¨\u0001\u001a\u0016\u0010«\u0001\u001a\u00030ª\u0001*\u00030©\u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001\u001a\u0016\u0010¯\u0001\u001a\u00030®\u0001*\u00030\u00ad\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001\u001a\u0016\u0010³\u0001\u001a\u00030²\u0001*\u00030±\u0001¢\u0006\u0006\b³\u0001\u0010´\u0001\u001a\u0016\u0010·\u0001\u001a\u00030¶\u0001*\u00030µ\u0001¢\u0006\u0006\b·\u0001\u0010¸\u0001\u001a\u0016\u0010»\u0001\u001a\u00030º\u0001*\u00030¹\u0001¢\u0006\u0006\b»\u0001\u0010¼\u0001\u001a\u0016\u0010¿\u0001\u001a\u00030¾\u0001*\u00030½\u0001¢\u0006\u0006\b¿\u0001\u0010À\u0001\u001a\u0016\u0010Á\u0001\u001a\u00030\u0089\u0001*\u00030\u008a\u0001¢\u0006\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0016\u0010Å\u0001\u001a\u00030Ä\u0001*\u00030Ã\u0001¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0016\u0010É\u0001\u001a\u00030È\u0001*\u00030Ç\u0001¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0016\u0010Í\u0001\u001a\u00030Ì\u0001*\u00030Ë\u0001¢\u0006\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0016\u0010Ñ\u0001\u001a\u00030Ð\u0001*\u00030Ï\u0001¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0016\u0010Õ\u0001\u001a\u00030Ô\u0001*\u00030Ó\u0001¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0016\u0010Ù\u0001\u001a\u00030Ø\u0001*\u00030×\u0001¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0016\u0010Ý\u0001\u001a\u00030Ü\u0001*\u00030Û\u0001¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0016\u0010á\u0001\u001a\u00030à\u0001*\u00030ß\u0001¢\u0006\u0006\bá\u0001\u0010â\u0001\u001a\u0014\u0010ã\u0001\u001a\u00020'*\u00020(¢\u0006\u0006\bã\u0001\u0010ä\u0001\u001a\u0014\u0010å\u0001\u001a\u00020+*\u00020,¢\u0006\u0006\bå\u0001\u0010æ\u0001\u001a\u0014\u0010ç\u0001\u001a\u00020/*\u000200¢\u0006\u0006\bç\u0001\u0010è\u0001\u001a\u0014\u0010é\u0001\u001a\u000209*\u00020:¢\u0006\u0006\bé\u0001\u0010ê\u0001\u001a\u0014\u0010ë\u0001\u001a\u00020\u0018*\u00020\u0019¢\u0006\u0006\bë\u0001\u0010ì\u0001\u001a\u0014\u0010í\u0001\u001a\u00020=*\u00020>¢\u0006\u0006\bí\u0001\u0010î\u0001\u001a\u0014\u0010ï\u0001\u001a\u00020I*\u00020J¢\u0006\u0006\bï\u0001\u0010ð\u0001\u001a\u0014\u0010ñ\u0001\u001a\u00020M*\u00020N¢\u0006\u0006\bñ\u0001\u0010ò\u0001\u001a\u0014\u0010ó\u0001\u001a\u00020Q*\u00020R¢\u0006\u0006\bó\u0001\u0010ô\u0001\u001a\u0014\u0010õ\u0001\u001a\u00020U*\u00020V¢\u0006\u0006\bõ\u0001\u0010ö\u0001\u001a\u0014\u0010÷\u0001\u001a\u00020Y*\u00020Z¢\u0006\u0006\b÷\u0001\u0010ø\u0001\u001a\u0014\u0010ù\u0001\u001a\u00020]*\u00020^¢\u0006\u0006\bù\u0001\u0010ú\u0001\u001a\u0014\u0010û\u0001\u001a\u00020a*\u00020b¢\u0006\u0006\bû\u0001\u0010ü\u0001\u001a\u0014\u0010ý\u0001\u001a\u00020e*\u00020f¢\u0006\u0006\bý\u0001\u0010þ\u0001\u001a\u0014\u0010ÿ\u0001\u001a\u00020i*\u00020j¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002\u001a\u0014\u0010\u0081\u0002\u001a\u00020m*\u00020n¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002\u001a\u0014\u0010\u0083\u0002\u001a\u00020\b*\u00020\t¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002\u001a\u0017\u0010\u0086\u0002\u001a\u00030\u0085\u0002*\u00020\tH\u0002¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002\u001a\u0014\u0010\u0088\u0002\u001a\u00020\f*\u00020\r¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002\u001a\u0014\u0010\u008a\u0002\u001a\u00020A*\u00020B¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002\u001a\u0014\u0010\u008c\u0002\u001a\u00020E*\u00020F¢\u0006\u0006\b\u008c\u0002\u0010\u008d\u0002\u001a\u0014\u0010\u008e\u0002\u001a\u00020q*\u00020r¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002\u001a\u0016\u0010\u0092\u0002\u001a\u00030\u0091\u0002*\u00030\u0090\u0002¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002\u001a\u0016\u0010\u0094\u0002\u001a\u00030\u0090\u0002*\u00030\u0091\u0002¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002\u001a\u0014\u0010\u0096\u0002\u001a\u00020u*\u00020v¢\u0006\u0006\b\u0096\u0002\u0010\u0097\u0002\u001a\u0014\u0010\u0098\u0002\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002\u001a\u0014\u0010\u009a\u0002\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0006\b\u009a\u0002\u0010\u009b\u0002\u001a\u0014\u0010\u009c\u0002\u001a\u00020\u0010*\u00020\u0011¢\u0006\u0006\b\u009c\u0002\u0010\u009d\u0002\u001a\u0014\u0010\u009e\u0002\u001a\u00020\u0014*\u00020\u0015¢\u0006\u0006\b\u009e\u0002\u0010\u009f\u0002\u001a\u0014\u0010 \u0002\u001a\u00020\u001c*\u00020\u001d¢\u0006\u0006\b \u0002\u0010¡\u0002\u001a\"\u0010¢\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u0095\u0001\u0012\u0004\u0012\u00020 0\u0094\u0001*\u00020!¢\u0006\u0006\b¢\u0002\u0010£\u0002\u001a\u0014\u0010¤\u0002\u001a\u00020$*\u00020\r¢\u0006\u0006\b¤\u0002\u0010¥\u0002\u001a\u0016\u0010¨\u0002\u001a\u00030§\u0002*\u00030¦\u0002¢\u0006\u0006\b¨\u0002\u0010©\u0002\u001a*\u0010°\u0002\u001a\u00030¯\u0002*\u00030ª\u00022\b\u0010¬\u0002\u001a\u00030«\u00022\b\u0010®\u0002\u001a\u00030\u00ad\u0002¢\u0006\u0006\b°\u0002\u0010±\u0002\u001a\u0016\u0010´\u0002\u001a\u00030³\u0002*\u00030²\u0002¢\u0006\u0006\b´\u0002\u0010µ\u0002\u001a\u0016\u0010¸\u0002\u001a\u00030·\u0002*\u00030¶\u0002¢\u0006\u0006\b¸\u0002\u0010¹\u0002\u001a\u0016\u0010¼\u0002\u001a\u00030»\u0002*\u00030º\u0002¢\u0006\u0006\b¼\u0002\u0010½\u0002\u001a\u0016\u0010À\u0002\u001a\u00030¿\u0002*\u00030¾\u0002¢\u0006\u0006\bÀ\u0002\u0010Á\u0002\u001a\u0016\u0010Ä\u0002\u001a\u00030Ã\u0002*\u00030Â\u0002¢\u0006\u0006\bÄ\u0002\u0010Å\u0002\u001a\u0016\u0010È\u0002\u001a\u00030Ç\u0002*\u00030Æ\u0002¢\u0006\u0006\bÈ\u0002\u0010É\u0002\u001a\u0016\u0010Ì\u0002\u001a\u00030Ë\u0002*\u00030Ê\u0002¢\u0006\u0006\bÌ\u0002\u0010Í\u0002\u001a\u0016\u0010Ð\u0002\u001a\u00030Ï\u0002*\u00030Î\u0002¢\u0006\u0006\bÐ\u0002\u0010Ñ\u0002\u001a\u0016\u0010Ô\u0002\u001a\u00030Ó\u0002*\u00030Ò\u0002¢\u0006\u0006\bÔ\u0002\u0010Õ\u0002\u001a\u0016\u0010×\u0002\u001a\u00030Ö\u0002*\u00030Ç\u0001¢\u0006\u0006\b×\u0002\u0010Ø\u0002\u001a\u0016\u0010Û\u0002\u001a\u00030Ú\u0002*\u00030Ù\u0002¢\u0006\u0006\bÛ\u0002\u0010Ü\u0002\u001a\u0016\u0010ß\u0002\u001a\u00030Þ\u0002*\u00030Ý\u0002¢\u0006\u0006\bß\u0002\u0010à\u0002\u001a\u0016\u0010ã\u0002\u001a\u00030â\u0002*\u00030á\u0002¢\u0006\u0006\bã\u0002\u0010ä\u0002\u001a\u0016\u0010ç\u0002\u001a\u00030æ\u0002*\u00030å\u0002¢\u0006\u0006\bç\u0002\u0010è\u0002\u001a\u0016\u0010ë\u0002\u001a\u00030ê\u0002*\u00030é\u0002¢\u0006\u0006\bë\u0002\u0010ì\u0002\u001a\u0016\u0010ï\u0002\u001a\u00030î\u0002*\u00030í\u0002¢\u0006\u0006\bï\u0002\u0010ð\u0002\u001a\u0016\u0010ó\u0002\u001a\u00030ò\u0002*\u00030ñ\u0002¢\u0006\u0006\bó\u0002\u0010ô\u0002\u001a\u0016\u0010÷\u0002\u001a\u00030ö\u0002*\u00030õ\u0002¢\u0006\u0006\b÷\u0002\u0010ø\u0002\u001a\u0016\u0010û\u0002\u001a\u00030ú\u0002*\u00030ù\u0002¢\u0006\u0006\bû\u0002\u0010ü\u0002\u001a\u0016\u0010ÿ\u0002\u001a\u00030þ\u0002*\u00030ý\u0002¢\u0006\u0006\bÿ\u0002\u0010\u0080\u0003\u001a\u0016\u0010\u0083\u0003\u001a\u00030\u0082\u0003*\u00030\u0081\u0003¢\u0006\u0006\b\u0083\u0003\u0010\u0084\u0003\u001a\u0016\u0010\u0087\u0003\u001a\u00030\u0086\u0003*\u00030\u0085\u0003¢\u0006\u0006\b\u0087\u0003\u0010\u0088\u0003\u001a\u0016\u0010\u008b\u0003\u001a\u00030\u008a\u0003*\u00030\u0089\u0003¢\u0006\u0006\b\u008b\u0003\u0010\u008c\u0003¨\u0006\u008d\u0003"}, d2 = {"Lo24/h0;", "Lh24/a;", "K", "(Lo24/h0;)Lh24/a;", "Lo24/u;", "Lg24/q;", ip.a.f96138c, "(Lo24/u;)Lg24/q;", "Lo24/p;", "Lg24/n;", "z", "(Lo24/p;)Lg24/n;", "Lo24/q;", "Lg24/g;", "r", "(Lo24/q;)Lg24/g;", "Lo24/v;", "Lg24/q$a;", "C", "(Lo24/v;)Lg24/q$a;", "Lo24/a1;", "Lh24/d;", "O", "(Lo24/a1;)Lh24/d;", "Lo24/f;", "Lg24/f;", "q", "(Lo24/f;)Lg24/f;", "Lo24/i0;", "Lh24/b;", i.f37094u, "(Lo24/i0;)Lh24/b;", "Lo24/a0;", "Lf24/f;", "j", "(Lo24/a0;)Lf24/f;", "Lo24/b0;", "s", "(Lo24/b0;)Lg24/g;", "Lo24/k;", "Lg24/h;", "t", "(Lo24/k;)Lg24/h;", "Lo24/g;", "Lg24/c;", "n", "(Lo24/g;)Lg24/c;", "Lo24/v0;", "Lg24/t;", i.f37087n, "(Lo24/v0;)Lg24/t;", "Lg24/a;", "Lo24/a;", "E0", "(Lg24/a;)Lo24/a;", "l", "(Lo24/a;)Lg24/a;", "Lo24/s;", "Lg24/p;", "B", "(Lo24/s;)Lg24/p;", "Lo24/r;", "Lg24/o;", "A", "(Lo24/r;)Lg24/o;", "Lo24/d;", "Lg24/d;", "o", "(Lo24/d;)Lg24/d;", "Lo24/e;", "Lg24/e;", "p", "(Lo24/e;)Lg24/e;", "Lo24/w0;", "Lg24/u;", "J", "(Lo24/w0;)Lg24/u;", "Lo24/x0;", "Lg24/u$a;", "I", "(Lo24/x0;)Lg24/u$a;", "Lo24/b;", "Lg24/b;", "m", "(Lo24/b;)Lg24/b;", "Lo24/h;", "Lg24/i;", "u", "(Lo24/h;)Lg24/i;", "Lo24/i;", "Lg24/r;", "E", "(Lo24/i;)Lg24/r;", "Lo24/d0;", "Lg24/s;", "G", "(Lo24/d0;)Lg24/s;", "Lo24/c0;", "Lg24/s$a;", "F", "(Lo24/c0;)Lg24/s$a;", "Lo24/l;", "Lg24/k;", "w", "(Lo24/l;)Lg24/k;", "Lo24/j;", "Lg24/j;", "v", "(Lo24/j;)Lg24/j;", "Lo24/m;", "Lg24/l;", "x", "(Lo24/m;)Lg24/l;", "Lo24/j0;", "Lh24/c;", "N", "(Lo24/j0;)Lh24/c;", "Lo24/g0;", "Lh24/c$a;", "M", "(Lo24/g0;)Lh24/c$a;", "Lf24/c;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;", "i1", "(Lf24/c;)Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;", "i", "(Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;)Lf24/c;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityStatus;", "Lf24/b;", "h", "(Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityStatus;)Lf24/b;", "h1", "(Lf24/b;)Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityStatus;", "Lm24/e;", "Lf24/e;", "b", "(Lm24/e;)Lf24/e;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityStatus;", "Lf24/h;", "e", "(Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityStatus;)Lf24/h;", "Lf24/i;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityType;", "d", "(Lf24/i;)Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityType;", "f", "(Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityType;)Lf24/i;", "Lo24/y;", "Ldx/i;", "Ldx/b;", "Lxw/e;", "g", "(Lo24/y;)Ldx/i;", "Lo24/e0;", "Lj24/c;", "B0", "(Lo24/e0;)Lj24/c;", "Lo24/r0;", "Li24/w;", "b0", "(Lo24/r0;)Li24/w;", "Lo24/s0;", "Li24/x;", "c0", "(Lo24/s0;)Li24/x;", "Lo24/f0;", "Li24/y;", "d0", "(Lo24/f0;)Li24/y;", "Lo24/q0;", "Li24/g0;", "m0", "(Lo24/q0;)Li24/g0;", "Lo24/t0;", "Li24/h0;", "n0", "(Lo24/t0;)Li24/h0;", "Lo24/p0;", "Li24/f0;", "l0", "(Lo24/p0;)Li24/f0;", "Lo24/u0;", "Li24/i0;", "o0", "(Lo24/u0;)Li24/i0;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderStudentDto;", "Lj24/e;", "C0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderStudentDto;)Lj24/e;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/StudentCardDto;", "Li24/t0;", "t0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/StudentCardDto;)Li24/t0;", "c", "(Lf24/h;)Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/DocumentEntityStatus;", "Lm24/i;", "Lf24/g;", "k", "(Lm24/i;)Lf24/g;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderDto;", "Lj24/d;", "k1", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderDto;)Lj24/d;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/RefugeeCardDto;", "Li24/p0;", "s0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/RefugeeCardDto;)Li24/p0;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/RefugeeCardContainerDto;", "Li24/n0;", "r0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/RefugeeCardContainerDto;)Li24/n0;", "Lo24/x;", "Li24/m;", "X", "(Lo24/x;)Li24/m;", "Lo24/w;", "Li24/j;", "W", "(Lo24/w;)Li24/j;", "Lo24/c;", "Li24/i;", "V", "(Lo24/c;)Li24/i;", "Lo24/z0;", "Li24/n;", "Y", "(Lo24/z0;)Li24/n;", "N0", "(Lg24/h;)Lo24/k;", "J0", "(Lg24/c;)Lo24/g;", "d1", "(Lg24/t;)Lo24/v0;", "U0", "(Lg24/p;)Lo24/s;", "I0", "(Lg24/f;)Lo24/f;", "T0", "(Lg24/o;)Lo24/r;", "e1", "(Lg24/u;)Lo24/w0;", "f1", "(Lg24/u$a;)Lo24/x0;", "F0", "(Lg24/b;)Lo24/b;", "K0", "(Lg24/i;)Lo24/h;", "L0", "(Lg24/r;)Lo24/i;", "Y0", "(Lg24/s;)Lo24/d0;", "X0", "(Lg24/s$a;)Lo24/c0;", "O0", "(Lg24/k;)Lo24/l;", "M0", "(Lg24/j;)Lo24/j;", "P0", "(Lg24/l;)Lo24/m;", "R0", "(Lg24/n;)Lo24/p;", "Lo24/o;", "a", "(Lg24/n;)Lo24/o;", "S0", "(Lg24/g;)Lo24/q;", "G0", "(Lg24/d;)Lo24/d;", "H0", "(Lg24/e;)Lo24/e;", "c1", "(Lh24/c;)Lo24/j0;", "Lg24/m;", "Lo24/n;", "Q0", "(Lg24/m;)Lo24/n;", "y", "(Lo24/n;)Lg24/m;", "Z0", "(Lh24/c$a;)Lo24/g0;", "a1", "(Lh24/a;)Lo24/h0;", "V0", "(Lg24/q;)Lo24/u;", "W0", "(Lg24/q$a;)Lo24/v;", "g1", "(Lh24/d;)Lo24/a1;", "b1", "(Lh24/b;)Lo24/i0;", "D0", "(Lf24/f;)Ldx/i;", "j1", "(Lg24/g;)Lo24/b0;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/WruLicenceDataDto;", "Li24/d1;", "z0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/WruLicenceDataDto;)Li24/d1;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/WruLicenceDataContainerItemDto;", "", "index", "", "isAdditional", "Li24/c1;", "y0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/WruLicenceDataContainerItemDto;IZ)Li24/c1;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleCardDataDto;", "Li24/y0;", "w0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleCardDataDto;)Li24/y0;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleFullDocumentDto;", "Li24/w0;", "v0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleFullDocumentDto;)Li24/w0;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderVehicleDto;", "Lj24/b;", "A0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderVehicleDto;)Lj24/b;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/InsuranceDto;", "Li24/a1;", "x0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/InsuranceDto;)Li24/a1;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/OtherDocumentDto;", "Li24/h;", "U", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/OtherDocumentDto;)Li24/h;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/TimeMeterDto;", "Li24/v0;", "u0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/TimeMeterDto;)Li24/v0;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/DistanceMeterDto;", "Li24/g;", "T", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/DistanceMeterDto;)Li24/g;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/FamilyCardScopeDto;", "Li24/u;", "a0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/FamilyCardScopeDto;)Li24/u;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/FamilyCardDataDto;", "Li24/r;", "Z", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/FamilyCardDataDto;)Li24/r;", "Lj24/a;", "l1", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderDto;)Lj24/a;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/RailwayCardScopeDto;", "Li24/m0;", "q0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/RailwayCardScopeDto;)Li24/m0;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/RailwayCardContainerDataDto;", "Li24/j0;", "p0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/RailwayCardContainerDataDto;)Li24/j0;", "Lo24/o0;", "Li24/b0;", "i0", "(Lo24/o0;)Li24/b0;", "Lo24/k0;", "Li24/z;", "h0", "(Lo24/k0;)Li24/z;", "Lo24/l0;", "Li24/z$a;", "e0", "(Lo24/l0;)Li24/z$a;", "Lo24/m0;", "Li24/z$b;", "f0", "(Lo24/m0;)Li24/z$b;", "Lo24/n0;", "Li24/z$c;", "g0", "(Lo24/n0;)Li24/z$c;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/AdvocateCardDataDto;", "Li24/c;", "Q", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/AdvocateCardDataDto;)Li24/c;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/AdvocateCardContainerDto;", "Li24/a;", i.f37086m, "(Lpl/gov/coi/mobywatel/technical/containers/data/model/AdvocateCardContainerDto;)Li24/a;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/PensionerCardDataDto;", "Li24/e0;", "k0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/PensionerCardDataDto;)Li24/e0;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/PensionerCardContainerDto;", "Li24/c0;", "j0", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/PensionerCardContainerDto;)Li24/c0;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/DeputyCardDataDto;", "Li24/f;", ip.a.f96137b, "(Lpl/gov/coi/mobywatel/technical/containers/data/model/DeputyCardDataDto;)Li24/f;", "Lpl/gov/coi/mobywatel/technical/containers/data/model/DeputyCardContainerDto;", "Li24/d;", "R", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/DeputyCardContainerDto;)Li24/d;", "containers_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: n24.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3251a {
        public static final /* synthetic */ int[] A;
        public static final /* synthetic */ int[] B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f130906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f130907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f130908d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f130909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f130910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f130911g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f130912h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f130913i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f130914j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int[] f130915k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int[] f130916l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ int[] f130917m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int[] f130918n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ int[] f130919o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final /* synthetic */ int[] f130920p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ int[] f130921q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final /* synthetic */ int[] f130922r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ int[] f130923s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final /* synthetic */ int[] f130924t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ int[] f130925u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final /* synthetic */ int[] f130926v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final /* synthetic */ int[] f130927w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final /* synthetic */ int[] f130928x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final /* synthetic */ int[] f130929y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final /* synthetic */ int[] f130930z;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.EN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.UK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f130905a = iArr;
            int[] iArr2 = new int[v.values().length];
            try {
                iArr2[v.DESC.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[v.ASC.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[v.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f130906b = iArr2;
            int[] iArr3 = new int[b0.values().length];
            try {
                iArr3[b0.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[b0.EN.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[b0.UK.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[b0.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            f130907c = iArr3;
            int[] iArr4 = new int[x0.values().length];
            try {
                iArr4[x0.QR_CODE_V10.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[x0.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            f130908d = iArr4;
            int[] iArr5 = new int[o24.i.values().length];
            try {
                iArr5[o24.i.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[o24.i.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[o24.i.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[o24.i.DATE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[o24.i.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[o24.i.NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[o24.i.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[o24.i.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[o24.i.MULTILINE_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[o24.i.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused23) {
            }
            f130909e = iArr5;
            int[] iArr6 = new int[c0.values().length];
            try {
                iArr6[c0.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[c0.DEFAULT_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[c0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            f130910f = iArr6;
            int[] iArr7 = new int[m.values().length];
            try {
                iArr7[m.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr7[m.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            f130911g = iArr7;
            int[] iArr8 = new int[g0.values().length];
            try {
                iArr8[g0.LEFT_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr8[g0.RIGHT_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr8[g0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            f130912h = iArr8;
            int[] iArr9 = new int[c.values().length];
            try {
                iArr9[c.CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr9[c.REFUGEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr9[c.UNIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            f130913i = iArr9;
            int[] iArr10 = new int[CertificateEntityType.values().length];
            try {
                iArr10[CertificateEntityType.CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr10[CertificateEntityType.REFUGEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr10[CertificateEntityType.UNIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f130914j = iArr10;
            int[] iArr11 = new int[CertificateEntityStatus.values().length];
            try {
                iArr11[CertificateEntityStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr11[CertificateEntityStatus.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused39) {
            }
            f130915k = iArr11;
            int[] iArr12 = new int[f24.b.values().length];
            try {
                iArr12[f24.b.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr12[f24.b.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            f130916l = iArr12;
            int[] iArr13 = new int[DocumentEntityStatus.values().length];
            try {
                iArr13[DocumentEntityStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr13[DocumentEntityStatus.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr13[DocumentEntityStatus.REVOKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr13[DocumentEntityStatus.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused45) {
            }
            f130917m = iArr13;
            int[] iArr14 = new int[f24.i.values().length];
            try {
                iArr14[f24.i.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr14[f24.i.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr14[f24.i.VEHICLE_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr14[f24.i.FAMILY_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr14[f24.i.REFUGEE_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr14[f24.i.REFUGEE_CHILD_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr14[f24.i.STUDENT_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr14[f24.i.RAILWAY_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr14[f24.i.PENSIONER_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr14[f24.i.DEPUTY_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr14[f24.i.ADVOCATE_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr14[f24.i.MIDWIFE_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr14[f24.i.NURSE_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr14[f24.i.RASKA_SENIOR_LICENCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr14[f24.i.ZDUNSKOWOLSKA_RESIDENT_LICENCE.ordinal()] = 15;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr14[f24.i.OLAWA_RESIDENT_LICENCE.ordinal()] = 16;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr14[f24.i.OLAWA_FAMILY_LICENCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr14[f24.i.OLAWA_SENIOR_LICENCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr14[f24.i.ZDUNSKOWOLSKA_FAMILY_LICENCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr14[f24.i.ZDUNSKOWOLSKA_SENIOR_LICENCE.ordinal()] = 20;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr14[f24.i.SUCHY_LAS_FAMILY_LICENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr14[f24.i.MIEJSKA_AUGUSTOW_TOURIST_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr14[f24.i.CHELM_FAMILY_LICENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr14[f24.i.CHELM_SENIOR_LICENCE.ordinal()] = 24;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr14[f24.i.CHELM_RESIDENT_LICENCE.ordinal()] = 25;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr14[f24.i.LODZ_SENIOR_LICENCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr14[f24.i.LODZ_FAMILY_LICENCE.ordinal()] = 27;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr14[f24.i.SENATOR_CARD.ordinal()] = 28;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr14[f24.i.RACIBORSKA_RESIDENT_LICENCE.ordinal()] = 29;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr14[f24.i.RACIBORSKA_SENIOR_LICENCE.ordinal()] = 30;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr14[f24.i.RACIBORSKA_FAMILY_LICENCE.ordinal()] = 31;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr14[f24.i.GIZYCKA_RESIDENT_LICENCE.ordinal()] = 32;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr14[f24.i.PZPN_LICENCE.ordinal()] = 33;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr14[f24.i.KOBYLKA_RESIDENT_LICENCE.ordinal()] = 34;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr14[f24.i.WROCLAWSKA_SENIOR_LICENCE.ordinal()] = 35;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr14[f24.i.MIEKINIA_SENIOR_LICENCE.ordinal()] = 36;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr14[f24.i.MIEKINIA_FAMILY_LICENCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr14[f24.i.TOPR_LICENCE.ordinal()] = 38;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr14[f24.i.MAZOVIA_LICENCE.ordinal()] = 39;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr14[f24.i.GENERAL_COUNSEL_LICENCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr14[f24.i.OLECKO_RESIDENT_LICENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr14[f24.i.BYDGOSZCZ_FAMILY_LICENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr14[f24.i.WODZISLAW_FAMILY_LICENCE.ordinal()] = 43;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr14[f24.i.MICHALOWICE_RESIDENT_LICENCE.ordinal()] = 44;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr14[f24.i.KOLEJE_DOLNOSLASKIE_LICENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr14[f24.i.WISLA_RESIDENT_LICENCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr14[f24.i.JASTRZEBIA_GORA_RESIDENT_LICENCE.ordinal()] = 47;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr14[f24.i.FIREFIGHTER_OSP_LICENCE.ordinal()] = 48;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr14[f24.i.DOCTOR.ordinal()] = 49;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr14[f24.i.DENTIST.ordinal()] = 50;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr14[f24.i.ATTORNEY_AT_LAW.ordinal()] = 51;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr14[f24.i.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 52;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr14[f24.i.CIVIL_ENGINEER.ordinal()] = 53;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr14[f24.i.TAX_ADVISOR.ordinal()] = 54;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr14[f24.i.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 55;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr14[f24.i.AUDITOR.ordinal()] = 56;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr14[f24.i.SOLIDARITY_CARD.ordinal()] = 57;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr14[f24.i.PHD_STUDENT.ordinal()] = 58;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr14[f24.i.PHYSIOTHERAPIST.ordinal()] = 59;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr14[f24.i.PHARMACIST.ordinal()] = 60;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr14[f24.i.SHOOTING_LICENCE.ordinal()] = 61;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr14[f24.i.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 62;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr14[f24.i.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 63;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr14[f24.i.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 64;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr14[f24.i.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 65;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr14[f24.i.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 66;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr14[f24.i.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 67;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr14[f24.i.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 68;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr14[f24.i.TEACHER.ordinal()] = 69;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr14[f24.i.BAILIFF_CARD.ordinal()] = 70;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr14[f24.i.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 71;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr14[f24.i.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 72;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr14[f24.i.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 73;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr14[f24.i.LABORATORY_DIAGNOSTICIAN.ordinal()] = 74;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr14[f24.i.PENSIONER_MSWIA.ordinal()] = 75;
            } catch (NoSuchFieldError unused120) {
            }
            f130918n = iArr14;
            int[] iArr15 = new int[DocumentEntityType.values().length];
            try {
                iArr15[DocumentEntityType.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr15[DocumentEntityType.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr15[DocumentEntityType.VEHICLE_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr15[DocumentEntityType.FAMILY_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr15[DocumentEntityType.REFUGEE_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr15[DocumentEntityType.REFUGEE_CHILD_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr15[DocumentEntityType.STUDENT_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr15[DocumentEntityType.RAILWAY_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr15[DocumentEntityType.PENSIONER_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr15[DocumentEntityType.DEPUTY_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr15[DocumentEntityType.ADVOCATE_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr15[DocumentEntityType.MIDWIFE_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr15[DocumentEntityType.NURSE_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr15[DocumentEntityType.RASKA_SENIOR_LICENCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr15[DocumentEntityType.ZDUNSKOWOLSKA_RESIDENT_LICENCE.ordinal()] = 15;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr15[DocumentEntityType.OLAWA_RESIDENT_LICENCE.ordinal()] = 16;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr15[DocumentEntityType.OLAWA_FAMILY_LICENCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr15[DocumentEntityType.OLAWA_SENIOR_LICENCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr15[DocumentEntityType.ZDUNSKOWOLSKA_FAMILY_LICENCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr15[DocumentEntityType.ZDUNSKOWOLSKA_SENIOR_LICENCE.ordinal()] = 20;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr15[DocumentEntityType.SUCHY_LAS_FAMILY_LICENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr15[DocumentEntityType.MIEJSKA_AUGUSTOW_TOURIST_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr15[DocumentEntityType.CHELM_FAMILY_LICENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr15[DocumentEntityType.CHELM_SENIOR_LICENCE.ordinal()] = 24;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr15[DocumentEntityType.CHELM_RESIDENT_LICENCE.ordinal()] = 25;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr15[DocumentEntityType.LODZ_SENIOR_LICENCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr15[DocumentEntityType.LODZ_FAMILY_LICENCE.ordinal()] = 27;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr15[DocumentEntityType.SENATOR_CARD.ordinal()] = 28;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr15[DocumentEntityType.RACIBORSKA_RESIDENT_LICENCE.ordinal()] = 29;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr15[DocumentEntityType.RACIBORSKA_SENIOR_LICENCE.ordinal()] = 30;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr15[DocumentEntityType.RACIBORSKA_FAMILY_LICENCE.ordinal()] = 31;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr15[DocumentEntityType.GIZYCKA_RESIDENT_LICENCE.ordinal()] = 32;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr15[DocumentEntityType.PZPN_LICENCE.ordinal()] = 33;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr15[DocumentEntityType.KOBYLKA_RESIDENT_LICENCE.ordinal()] = 34;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr15[DocumentEntityType.WROCLAWSKA_SENIOR_LICENCE.ordinal()] = 35;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr15[DocumentEntityType.MIEKINIA_SENIOR_LICENCE.ordinal()] = 36;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr15[DocumentEntityType.MIEKINIA_FAMILY_LICENCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr15[DocumentEntityType.TOPR_LICENCE.ordinal()] = 38;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr15[DocumentEntityType.MAZOVIA_LICENCE.ordinal()] = 39;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr15[DocumentEntityType.GENERAL_COUNSEL_LICENCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr15[DocumentEntityType.OLECKO_RESIDENT_LICENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr15[DocumentEntityType.BYDGOSZCZ_FAMILY_LICENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr15[DocumentEntityType.WODZISLAW_FAMILY_LICENCE.ordinal()] = 43;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr15[DocumentEntityType.MICHALOWICE_RESIDENT_LICENCE.ordinal()] = 44;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr15[DocumentEntityType.KOLEJE_DOLNOSLASKIE_LICENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr15[DocumentEntityType.WISLA_RESIDENT_LICENCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr15[DocumentEntityType.FIREFIGHTER_OSP_LICENCE.ordinal()] = 47;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr15[DocumentEntityType.JASTRZEBIA_GORA_RESIDENT_LICENCE.ordinal()] = 48;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr15[DocumentEntityType.DOCTOR.ordinal()] = 49;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr15[DocumentEntityType.DENTIST.ordinal()] = 50;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr15[DocumentEntityType.ATTORNEY_AT_LAW.ordinal()] = 51;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr15[DocumentEntityType.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 52;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr15[DocumentEntityType.CIVIL_ENGINEER.ordinal()] = 53;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr15[DocumentEntityType.TAX_ADVISOR.ordinal()] = 54;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr15[DocumentEntityType.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 55;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr15[DocumentEntityType.AUDITOR.ordinal()] = 56;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr15[DocumentEntityType.SOLIDARITY_CARD.ordinal()] = 57;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr15[DocumentEntityType.PHD_STUDENT.ordinal()] = 58;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr15[DocumentEntityType.PHYSIOTHERAPIST.ordinal()] = 59;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr15[DocumentEntityType.PHARMACIST.ordinal()] = 60;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr15[DocumentEntityType.SHOOTING_LICENCE.ordinal()] = 61;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr15[DocumentEntityType.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 62;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr15[DocumentEntityType.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 63;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr15[DocumentEntityType.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 64;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr15[DocumentEntityType.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 65;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr15[DocumentEntityType.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 66;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr15[DocumentEntityType.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 67;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr15[DocumentEntityType.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 68;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr15[DocumentEntityType.TEACHER.ordinal()] = 69;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr15[DocumentEntityType.BAILIFF_CARD.ordinal()] = 70;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr15[DocumentEntityType.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 71;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr15[DocumentEntityType.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 72;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr15[DocumentEntityType.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 73;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr15[DocumentEntityType.LABORATORY_DIAGNOSTICIAN.ordinal()] = 74;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr15[DocumentEntityType.PENSIONER_MSWIA.ordinal()] = 75;
            } catch (NoSuchFieldError unused195) {
            }
            f130919o = iArr15;
            int[] iArr16 = new int[y.values().length];
            try {
                iArr16[y.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr16[y.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr16[y.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused198) {
            }
            f130920p = iArr16;
            int[] iArr17 = new int[u0.values().length];
            try {
                iArr17[u0.NOT_ISSUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr17[u0.ISSUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr17[u0.REVOKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr17[u0.SUSPENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr17[u0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused203) {
            }
            f130921q = iArr17;
            int[] iArr18 = new int[h.values().length];
            try {
                iArr18[h.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr18[h.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused205) {
            }
            try {
                iArr18[h.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr18[h.REVOKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused207) {
            }
            f130922r = iArr18;
            int[] iArr19 = new int[QrCodeSchema.a.values().length];
            try {
                iArr19[QrCodeSchema.a.QR_CODE_V10.ordinal()] = 1;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr19[QrCodeSchema.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused209) {
            }
            f130923s = iArr19;
            int[] iArr20 = new int[r.values().length];
            try {
                iArr20[r.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused210) {
            }
            try {
                iArr20[r.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused211) {
            }
            try {
                iArr20[r.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused212) {
            }
            try {
                iArr20[r.DATE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused213) {
            }
            try {
                iArr20[r.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused214) {
            }
            try {
                iArr20[r.NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused215) {
            }
            try {
                iArr20[r.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused216) {
            }
            try {
                iArr20[r.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused217) {
            }
            try {
                iArr20[r.MULTILINE_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused218) {
            }
            try {
                iArr20[r.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused219) {
            }
            f130924t = iArr20;
            int[] iArr21 = new int[MissingDocumentAttribute.a.values().length];
            try {
                iArr21[MissingDocumentAttribute.a.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused220) {
            }
            try {
                iArr21[MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused221) {
            }
            try {
                iArr21[MissingDocumentAttribute.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused222) {
            }
            f130925u = iArr21;
            int[] iArr22 = new int[l.values().length];
            try {
                iArr22[l.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused223) {
            }
            try {
                iArr22[l.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused224) {
            }
            f130926v = iArr22;
            int[] iArr23 = new int[g.values().length];
            try {
                iArr23[g.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused225) {
            }
            try {
                iArr23[g.EN.ordinal()] = 2;
            } catch (NoSuchFieldError unused226) {
            }
            try {
                iArr23[g.UK.ordinal()] = 3;
            } catch (NoSuchFieldError unused227) {
            }
            try {
                iArr23[g.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused228) {
            }
            f130927w = iArr23;
            int[] iArr24 = new int[MultiDocumentView.a.values().length];
            try {
                iArr24[MultiDocumentView.a.LEFT_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused229) {
            }
            try {
                iArr24[MultiDocumentView.a.RIGHT_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused230) {
            }
            try {
                iArr24[MultiDocumentView.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused231) {
            }
            f130928x = iArr24;
            int[] iArr25 = new int[DocumentsGroup.a.values().length];
            try {
                iArr25[DocumentsGroup.a.DESC.ordinal()] = 1;
            } catch (NoSuchFieldError unused232) {
            }
            try {
                iArr25[DocumentsGroup.a.ASC.ordinal()] = 2;
            } catch (NoSuchFieldError unused233) {
            }
            try {
                iArr25[DocumentsGroup.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused234) {
            }
            f130929y = iArr25;
            int[] iArr26 = new int[l0.values().length];
            try {
                iArr26[l0.MIDWIFE.ordinal()] = 1;
            } catch (NoSuchFieldError unused235) {
            }
            try {
                iArr26[l0.NURSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused236) {
            }
            try {
                iArr26[l0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused237) {
            }
            f130930z = iArr26;
            int[] iArr27 = new int[m0.values().length];
            try {
                iArr27[m0.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused238) {
            }
            try {
                iArr27[m0.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused239) {
            }
            try {
                iArr27[m0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused240) {
            }
            A = iArr27;
            int[] iArr28 = new int[n0.values().length];
            try {
                iArr28[n0.RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused241) {
            }
            try {
                iArr28[n0.INDIVIDUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused242) {
            }
            try {
                iArr28[n0.UNDER_SUPERVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused243) {
            }
            try {
                iArr28[n0.FIXED_TERM.ordinal()] = 4;
            } catch (NoSuchFieldError unused244) {
            }
            try {
                iArr28[n0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused245) {
            }
            B = iArr28;
        }
    }

    public static final DocumentStaticSection A(DocumentStaticSectionDto documentStaticSectionDto) {
        List<DocumentSchemaLabelDto> listA = documentStaticSectionDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(z((DocumentSchemaLabelDto) it.next()));
        }
        return new DocumentStaticSection(arrayList);
    }

    public static final IdentityDataHeader A0(DataHeaderVehicleDto dataHeaderVehicleDto) {
        return new IdentityDataHeader(dataHeaderVehicleDto.getDn(), dataHeaderVehicleDto.getSn(), dataHeaderVehicleDto.getIssuer(), dataHeaderVehicleDto.getTimestamp(), dataHeaderVehicleDto.getRequestId(), dataHeaderVehicleDto.getDataRequester(), dataHeaderVehicleDto.getDataType(), dataHeaderVehicleDto.getInternalDocumentId());
    }

    public static final DocumentTopAnnotation B(DocumentTopAnnotationDto documentTopAnnotationDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<DocumentSchemaLabelDto> listD = documentTopAnnotationDto.d();
        if (listD != null) {
            List<DocumentSchemaLabelDto> list = listD;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(z((DocumentSchemaLabelDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<DocumentSchemaLabelDto> listB = documentTopAnnotationDto.b();
        if (listB != null) {
            List<DocumentSchemaLabelDto> list2 = listB;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(z((DocumentSchemaLabelDto) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<DocumentStaticSectionDto> listC = documentTopAnnotationDto.c();
        if (listC != null) {
            List<DocumentStaticSectionDto> list3 = listC;
            arrayList3 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(A((DocumentStaticSectionDto) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        DocumentDynamicSectionDto dynamicSections = documentTopAnnotationDto.getDynamicSections();
        return new DocumentTopAnnotation(arrayList, arrayList2, arrayList3, dynamicSections != null ? q(dynamicSections) : null);
    }

    public static final MnemonicHeader B0(MnemonicHeaderContainer mnemonicHeaderContainer) {
        return new MnemonicHeader(mnemonicHeaderContainer.getTp(), mnemonicHeaderContainer.getStp(), mnemonicHeaderContainer.getVer(), mnemonicHeaderContainer.getDn(), mnemonicHeaderContainer.getSn(), mnemonicHeaderContainer.getIsr(), mnemonicHeaderContainer.getTs(), mnemonicHeaderContainer.getRId(), mnemonicHeaderContainer.getIid(), iy.c0.g(mnemonicHeaderContainer.getPe()), mnemonicHeaderContainer.getIn(), mnemonicHeaderContainer.getId());
    }

    public static final DocumentsGroup.a C(v vVar) {
        int i15 = C3251a.f130906b[vVar.ordinal()];
        if (i15 == 1) {
            return DocumentsGroup.a.DESC;
        }
        if (i15 == 2) {
            return DocumentsGroup.a.ASC;
        }
        if (i15 == 3) {
            return DocumentsGroup.a.UNKNOWN;
        }
        throw new p();
    }

    public static final StudentCardHeader C0(DataHeaderStudentDto dataHeaderStudentDto) {
        return new StudentCardHeader(dataHeaderStudentDto.getDn(), dataHeaderStudentDto.getSn(), dataHeaderStudentDto.getIssuer(), dataHeaderStudentDto.getSignDate(), dataHeaderStudentDto.getTimestamp());
    }

    public static final DocumentsGroup D(DocumentsGroupDto documentsGroupDto) {
        DocumentsGroup.a aVarC = C(documentsGroupDto.getSortOrder());
        List<DocumentSchemaLabelDto> listA = documentsGroupDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(z((DocumentSchemaLabelDto) it.next()));
        }
        return new DocumentsGroup(aVarC, arrayList);
    }

    public static final dx.i<dx.b, LabelDto> D0(DocumentConfigLabel documentConfigLabel) {
        Object objB;
        b0 b0VarJ1;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String value = documentConfigLabel.getValue();
                    if (value == null) {
                        aVar.b(new dx.b.Generic(new IllegalArgumentException("Label value cannot be null")));
                        throw new oq.g();
                    }
                    g language = documentConfigLabel.getLanguage();
                    if (language != null && (b0VarJ1 = j1(language)) != null) {
                        return new dx.i.Right(new LabelDto(b0VarJ1, value));
                    }
                    aVar.b(new dx.b.Generic(new IllegalArgumentException("Label language cannot be null")));
                    throw new oq.g();
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

    public static final r E(o24.i iVar) {
        switch (C3251a.f130909e[iVar.ordinal()]) {
            case 1:
                return r.TEXT;
            case 2:
                return r.NAME;
            case 3:
                return r.DATE;
            case 4:
                return r.DATE_TIME;
            case 5:
                return r.NUMBER;
            case 6:
                return r.NOTE;
            case 7:
                return r.ENUM;
            case 8:
                return r.BOOLEAN;
            case 9:
                return r.MULTILINE_TEXT;
            case 10:
                return r.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final AdditionalLogoDto E0(AdditionalLogo additionalLogo) {
        return new AdditionalLogoDto(additionalLogo.getFieldReference(), additionalLogo.getId());
    }

    public static final MissingDocumentAttribute.a F(c0 c0Var) {
        int i15 = C3251a.f130910f[c0Var.ordinal()];
        if (i15 == 1) {
            return MissingDocumentAttribute.a.HIDE;
        }
        if (i15 == 2) {
            return MissingDocumentAttribute.a.DEFAULT_VALUE;
        }
        if (i15 == 3) {
            return MissingDocumentAttribute.a.UNKNOWN;
        }
        throw new p();
    }

    public static final BarcodeSchemaDto F0(BarcodeSchema barcodeSchema) {
        String fieldReference = barcodeSchema.getFieldReference();
        List<DocumentSchemaLabel> listB = barcodeSchema.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(R0((DocumentSchemaLabel) it.next()));
        }
        return new BarcodeSchemaDto(fieldReference, arrayList);
    }

    public static final MissingDocumentAttribute G(MissingDocumentAttributeDto missingDocumentAttributeDto) {
        MissingDocumentAttribute.a aVarF = F(missingDocumentAttributeDto.getOnMissing());
        o24.i dataType = missingDocumentAttributeDto.getDataType();
        return new MissingDocumentAttribute(aVarF, dataType != null ? E(dataType) : null, missingDocumentAttributeDto.getDefaultValue());
    }

    public static final DocumentBottomAnnotationDto G0(DocumentBottomAnnotation documentBottomAnnotation) {
        List<DocumentBottomAnnotationSection> listA = documentBottomAnnotation.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(H0((DocumentBottomAnnotationSection) it.next()));
        }
        return new DocumentBottomAnnotationDto(arrayList);
    }

    public static final PictureSchema H(PictureSchemaDto pictureSchemaDto) {
        List listN;
        String pictureId = pictureSchemaDto.getPictureId();
        String emblemTextHexColor = pictureSchemaDto.getEmblemTextHexColor();
        List<DocumentSchemaAttributeDto> listB = pictureSchemaDto.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(u((DocumentSchemaAttributeDto) it.next()));
        }
        String sourceContainerRef = pictureSchemaDto.getSourceContainerRef();
        String attributesTitleTextHexColor = pictureSchemaDto.getAttributesTitleTextHexColor();
        String attributesValueTextHexColor = pictureSchemaDto.getAttributesValueTextHexColor();
        List<AdditionalLogoDto> listA = pictureSchemaDto.a();
        if (listA != null) {
            List<AdditionalLogoDto> list = listA;
            listN = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                listN.add(l((AdditionalLogoDto) it4.next()));
            }
        } else {
            listN = pq.v.n();
        }
        return new PictureSchema(pictureId, emblemTextHexColor, attributesValueTextHexColor, attributesTitleTextHexColor, arrayList, sourceContainerRef, listN);
    }

    public static final DocumentBottomAnnotationSectionDto H0(DocumentBottomAnnotationSection documentBottomAnnotationSection) {
        ArrayList arrayList;
        List<DocumentSchemaLabel> listA = documentBottomAnnotationSection.a();
        ArrayList arrayList2 = null;
        if (listA != null) {
            List<DocumentSchemaLabel> list = listA;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a((DocumentSchemaLabel) it.next()));
            }
        } else {
            arrayList = null;
        }
        String linkUrl = documentBottomAnnotationSection.getLinkUrl();
        List<DocumentSchemaLabel> listB = documentBottomAnnotationSection.b();
        if (listB != null) {
            List<DocumentSchemaLabel> list2 = listB;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(a((DocumentSchemaLabel) it4.next()));
            }
        }
        return new DocumentBottomAnnotationSectionDto(arrayList, linkUrl, arrayList2);
    }

    public static final QrCodeSchema.a I(x0 x0Var) {
        int i15 = C3251a.f130908d[x0Var.ordinal()];
        if (i15 == 1) {
            return QrCodeSchema.a.QR_CODE_V10;
        }
        if (i15 == 2) {
            return QrCodeSchema.a.UNKNOWN;
        }
        throw new p();
    }

    public static final DocumentDynamicSectionDto I0(DocumentDynamicSection documentDynamicSection) {
        return new DocumentDynamicSectionDto(documentDynamicSection.a(), null, null, 6, null);
    }

    public static final QrCodeSchema J(QrCodeSchemaDto qrCodeSchemaDto) {
        return new QrCodeSchema(I(qrCodeSchemaDto.getType()), qrCodeSchemaDto.getFieldReference());
    }

    public static final DocumentSchemaActionAttributeDto J0(DocumentActionAttribute documentActionAttribute) {
        String backendValue = documentActionAttribute.getActionType().getBackendValue();
        List<DocumentSchemaLabel> listB = documentActionAttribute.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(R0((DocumentSchemaLabel) it.next()));
        }
        return new DocumentSchemaActionAttributeDto(backendValue, arrayList);
    }

    public static final MultiDocumentSchema K(MultiDocumentSchemaDto multiDocumentSchemaDto) {
        DocumentsGroupDto leftTab = multiDocumentSchemaDto.getLeftTab();
        DocumentsGroup documentsGroupD = leftTab != null ? D(leftTab) : null;
        DocumentsGroupDto rightTab = multiDocumentSchemaDto.getRightTab();
        DocumentsGroup documentsGroupD2 = rightTab != null ? D(rightTab) : null;
        VerificationSelectorDto verificationSelector = multiDocumentSchemaDto.getVerificationSelector();
        return new MultiDocumentSchema(documentsGroupD, documentsGroupD2, verificationSelector != null ? O(verificationSelector) : null);
    }

    public static final DocumentSchemaAttributeDto K0(DocumentSchemaAttribute documentSchemaAttribute) {
        ArrayList arrayList;
        ArrayList arrayList2;
        o24.i iVarL0 = L0(documentSchemaAttribute.getDataType());
        List<DocumentSchemaLabel> listG = documentSchemaAttribute.g();
        ArrayList arrayList3 = new ArrayList(pq.v.y(listG, 10));
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            arrayList3.add(R0((DocumentSchemaLabel) it.next()));
        }
        MissingDocumentAttribute onMissingAttribute = documentSchemaAttribute.getOnMissingAttribute();
        ArrayList arrayList4 = null;
        MissingDocumentAttributeDto missingDocumentAttributeDtoY0 = onMissingAttribute != null ? Y0(onMissingAttribute) : null;
        List<String> listE = documentSchemaAttribute.e();
        String fieldReference = documentSchemaAttribute.getFieldReference();
        List<DocumentSchemaEnumTranslation> listC = documentSchemaAttribute.c();
        if (listC != null) {
            List<DocumentSchemaEnumTranslation> list = listC;
            ArrayList arrayList5 = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList5.add(O0((DocumentSchemaEnumTranslation) it4.next()));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        List<DocumentSchemaBooleanTranslation> listA = documentSchemaAttribute.a();
        if (listA != null) {
            List<DocumentSchemaBooleanTranslation> list2 = listA;
            ArrayList arrayList6 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList6.add(M0((DocumentSchemaBooleanTranslation) it5.next()));
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        List<l> listF = documentSchemaAttribute.f();
        if (listF != null) {
            List<l> list3 = listF;
            arrayList4 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it6 = list3.iterator();
            while (it6.hasNext()) {
                arrayList4.add(P0((l) it6.next()));
            }
        }
        return new DocumentSchemaAttributeDto(iVarL0, arrayList3, missingDocumentAttributeDtoY0, listE, fieldReference, arrayList, arrayList2, arrayList4);
    }

    public static final MultiDocumentSelectorLabel L(MultiDocumentSelectorLabelDto multiDocumentSelectorLabelDto) {
        List<LabelDto> listA = multiDocumentSelectorLabelDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(j((LabelDto) it.next()));
        }
        List<LabelDto> listA2 = multiDocumentSelectorLabelDto.a();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listA2, 10));
        Iterator<T> it4 = listA2.iterator();
        while (it4.hasNext()) {
            arrayList2.add(j((LabelDto) it4.next()));
        }
        List<LabelDto> listA3 = multiDocumentSelectorLabelDto.a();
        ArrayList arrayList3 = new ArrayList(pq.v.y(listA3, 10));
        Iterator<T> it5 = listA3.iterator();
        while (it5.hasNext()) {
            arrayList3.add(j((LabelDto) it5.next()));
        }
        return new MultiDocumentSelectorLabel(arrayList, arrayList2, arrayList3);
    }

    public static final o24.i L0(r rVar) {
        switch (C3251a.f130924t[rVar.ordinal()]) {
            case 1:
                return o24.i.TEXT;
            case 2:
                return o24.i.NAME;
            case 3:
                return o24.i.DATE;
            case 4:
                return o24.i.DATE_TIME;
            case 5:
                return o24.i.NUMBER;
            case 6:
                return o24.i.NOTE;
            case 7:
                return o24.i.ENUM;
            case 8:
                return o24.i.BOOLEAN;
            case 9:
                return o24.i.MULTILINE_TEXT;
            case 10:
                return o24.i.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final MultiDocumentView.a M(g0 g0Var) {
        int i15 = C3251a.f130912h[g0Var.ordinal()];
        if (i15 == 1) {
            return MultiDocumentView.a.LEFT_TAB;
        }
        if (i15 == 2) {
            return MultiDocumentView.a.RIGHT_TAB;
        }
        if (i15 == 3) {
            return MultiDocumentView.a.UNKNOWN;
        }
        throw new p();
    }

    public static final DocumentSchemaBooleanTranslationDto M0(DocumentSchemaBooleanTranslation documentSchemaBooleanTranslation) {
        List<DocumentSchemaLabel> listB = documentSchemaBooleanTranslation.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(R0((DocumentSchemaLabel) it.next()));
        }
        List<DocumentSchemaLabel> listA = documentSchemaBooleanTranslation.a();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList2.add(R0((DocumentSchemaLabel) it4.next()));
        }
        return new DocumentSchemaBooleanTranslationDto(arrayList, arrayList2);
    }

    public static final MultiDocumentView N(MultiDocumentViewDto multiDocumentViewDto) {
        return new MultiDocumentView(q(multiDocumentViewDto.getDynamicSections()), M(multiDocumentViewDto.getMultiDocumentGroup()));
    }

    public static final DocumentSchemaDto N0(DocumentSchema documentSchema) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String schemaId = documentSchema.getSchemaId();
        String schemaVersion = documentSchema.getSchemaVersion();
        String documentName = documentSchema.getDocumentName();
        PictureSchemaDto pictureSchemaDtoD1 = d1(documentSchema.getPicture());
        String documentPeselFieldReference = documentSchema.getDocumentPeselFieldReference();
        DocumentTopAnnotation topAnnotation = documentSchema.getTopAnnotation();
        ArrayList arrayList5 = null;
        DocumentTopAnnotationDto documentTopAnnotationDtoU0 = topAnnotation != null ? U0(topAnnotation) : null;
        QrCodeSchema qrCode = documentSchema.getQrCode();
        QrCodeSchemaDto qrCodeSchemaDtoE1 = qrCode != null ? e1(qrCode) : null;
        BarcodeSchema barcode = documentSchema.getBarcode();
        BarcodeSchemaDto barcodeSchemaDtoF0 = barcode != null ? F0(barcode) : null;
        List<DocumentSchemaAttribute> listF = documentSchema.f();
        if (listF != null) {
            List<DocumentSchemaAttribute> list = listF;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(K0((DocumentSchemaAttribute) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<DocumentSchemaLabel> listC = documentSchema.c();
        if (listC != null) {
            List<DocumentSchemaLabel> list2 = listC;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(R0((DocumentSchemaLabel) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<DocumentSchemaAttribute> listB = documentSchema.b();
        if (listB != null) {
            List<DocumentSchemaAttribute> list3 = listB;
            arrayList3 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(K0((DocumentSchemaAttribute) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        List<DocumentActionAttribute> listA = documentSchema.a();
        if (listA != null) {
            List<DocumentActionAttribute> list4 = listA;
            arrayList4 = new ArrayList(pq.v.y(list4, 10));
            Iterator<T> it6 = list4.iterator();
            while (it6.hasNext()) {
                arrayList4.add(J0((DocumentActionAttribute) it6.next()));
            }
        } else {
            arrayList4 = null;
        }
        DocumentBottomAnnotation bottomAnnotation = documentSchema.getBottomAnnotation();
        DocumentBottomAnnotationDto documentBottomAnnotationDtoG0 = bottomAnnotation != null ? G0(bottomAnnotation) : null;
        MultiDocumentView multiDocumentView = documentSchema.getMultiDocumentView();
        MultiDocumentViewDto multiDocumentViewDtoC1 = multiDocumentView != null ? c1(multiDocumentView) : null;
        List<DocumentSchemaForwardAttribute> listI = documentSchema.i();
        if (listI != null) {
            List<DocumentSchemaForwardAttribute> list5 = listI;
            arrayList5 = new ArrayList(pq.v.y(list5, 10));
            Iterator<T> it7 = list5.iterator();
            while (it7.hasNext()) {
                arrayList5.add(Q0((DocumentSchemaForwardAttribute) it7.next()));
            }
        }
        return new DocumentSchemaDto(schemaId, schemaVersion, documentName, pictureSchemaDtoD1, null, documentPeselFieldReference, arrayList5, documentTopAnnotationDtoU0, qrCodeSchemaDtoE1, barcodeSchemaDtoF0, arrayList, arrayList2, arrayList3, arrayList4, documentBottomAnnotationDtoG0, multiDocumentViewDtoC1, 16, null);
    }

    public static final VerificationSelector O(VerificationSelectorDto verificationSelectorDto) {
        return new VerificationSelector(q(verificationSelectorDto.getDynamicSections()), L(verificationSelectorDto.getLabel()));
    }

    public static final DocumentSchemaEnumTranslationDto O0(DocumentSchemaEnumTranslation documentSchemaEnumTranslation) {
        String enumValue = documentSchemaEnumTranslation.getEnumValue();
        List<DocumentSchemaLabel> listA = documentSchemaEnumTranslation.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(R0((DocumentSchemaLabel) it.next()));
        }
        return new DocumentSchemaEnumTranslationDto(enumValue, arrayList);
    }

    public static final AdvocateCardContainerData P(AdvocateCardContainerDto advocateCardContainerDto) {
        return new AdvocateCardContainerData(advocateCardContainerDto.getNumber(), advocateCardContainerDto.getMemberInstitution(), advocateCardContainerDto.getReleaseDate(), advocateCardContainerDto.getExpiredDate(), advocateCardContainerDto.getPermissionType());
    }

    public static final m P0(l lVar) {
        int i15 = C3251a.f130926v[lVar.ordinal()];
        if (i15 == 1) {
            return m.UPPERCASE;
        }
        if (i15 == 2) {
            return m.UNKNOWN;
        }
        throw new p();
    }

    public static final AdvocateCardScope Q(AdvocateCardDataDto advocateCardDataDto) {
        return new AdvocateCardScope(l1(advocateCardDataDto.getDataHeader()), P(advocateCardDataDto.getDataContainer()));
    }

    public static final DocumentSchemaForwardAttributeDto Q0(DocumentSchemaForwardAttribute documentSchemaForwardAttribute) {
        List<DocumentSchemaLabel> listA = documentSchemaForwardAttribute.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(R0((DocumentSchemaLabel) it.next()));
        }
        return new DocumentSchemaForwardAttributeDto(arrayList);
    }

    public static final DeputyCardContainerData R(DeputyCardContainerDto deputyCardContainerDto) {
        return new DeputyCardContainerData(deputyCardContainerDto.getFirstName(), deputyCardContainerDto.getSecondName(), deputyCardContainerDto.getLastName(), deputyCardContainerDto.getNumber(), deputyCardContainerDto.getNumberOfParliamentCadence(), deputyCardContainerDto.getReleaseDate());
    }

    public static final DocumentSchemaLabelDto R0(DocumentSchemaLabel documentSchemaLabel) {
        return new DocumentSchemaLabelDto(S0(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue());
    }

    public static final DeputyCardScope S(DeputyCardDataDto deputyCardDataDto) {
        return new DeputyCardScope(l1(deputyCardDataDto.getDataHeader()), R(deputyCardDataDto.getDataContainer()));
    }

    public static final q S0(g gVar) {
        int i15 = C3251a.f130927w[gVar.ordinal()];
        if (i15 == 1) {
            return q.PL;
        }
        if (i15 == 2) {
            return q.EN;
        }
        if (i15 == 3) {
            return q.UK;
        }
        if (i15 == 4) {
            return q.UNKNOWN;
        }
        throw new p();
    }

    public static final DistanceMeter T(DistanceMeterDto distanceMeterDto) {
        return new DistanceMeter(distanceMeterDto.getUnit(), distanceMeterDto.getDataImporter(), distanceMeterDto.getSaveDate(), distanceMeterDto.getValue());
    }

    public static final DocumentStaticSectionDto T0(DocumentStaticSection documentStaticSection) {
        List<DocumentSchemaLabel> listA = documentStaticSection.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(R0((DocumentSchemaLabel) it.next()));
        }
        return new DocumentStaticSectionDto(arrayList);
    }

    public static final DocumentModel U(OtherDocumentDto otherDocumentDto) {
        return new DocumentModel(otherDocumentDto.getInstitutionName(), otherDocumentDto.getDocumentType(), otherDocumentDto.getDocumentId(), otherDocumentDto.isDuplicate(), otherDocumentDto.getDistributionDate(), otherDocumentDto.getExpireDate(), otherDocumentDto.getIssueReason());
    }

    public static final DocumentTopAnnotationDto U0(DocumentTopAnnotation documentTopAnnotation) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<DocumentSchemaLabel> listD = documentTopAnnotation.d();
        if (listD != null) {
            List<DocumentSchemaLabel> list = listD;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(R0((DocumentSchemaLabel) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<DocumentSchemaLabel> listB = documentTopAnnotation.b();
        if (listB != null) {
            List<DocumentSchemaLabel> list2 = listB;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(R0((DocumentSchemaLabel) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<DocumentStaticSection> listC = documentTopAnnotation.c();
        if (listC != null) {
            List<DocumentStaticSection> list3 = listC;
            arrayList3 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(T0((DocumentStaticSection) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        DocumentDynamicSection dynamicSections = documentTopAnnotation.getDynamicSections();
        return new DocumentTopAnnotationDto(arrayList, arrayList2, arrayList3, dynamicSections != null ? I0(dynamicSections) : null);
    }

    public static final DrivingLicenceCategory V(CategoryContainer categoryContainer) {
        return new DrivingLicenceCategory(categoryContainer.getCN(), categoryContainer.getFRD(), categoryContainer.e(), categoryContainer.getED(), categoryContainer.getCS());
    }

    public static final DocumentsGroupDto V0(DocumentsGroup documentsGroup) {
        v vVarW0 = W0(documentsGroup.getSortOrder());
        List<DocumentSchemaLabel> listA = documentsGroup.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(R0((DocumentSchemaLabel) it.next()));
        }
        return new DocumentsGroupDto(vVarW0, arrayList);
    }

    public static final DrivingLicenceContainerData W(DrivingLicenceDataContainer drivingLicenceDataContainer) {
        ArrayList arrayList;
        String name = drivingLicenceDataContainer.getName();
        String surname = drivingLicenceDataContainer.getSurname();
        String secondName = drivingLicenceDataContainer.getSecondName();
        LocalDate birthday = drivingLicenceDataContainer.getBirthday();
        String birthplace = drivingLicenceDataContainer.getBirthplace();
        String ds4 = drivingLicenceDataContainer.getDS();
        String dsc = drivingLicenceDataContainer.getDSC();
        String ldId = drivingLicenceDataContainer.getLdId();
        String pn4 = drivingLicenceDataContainer.getPn();
        LocalDate rd5 = drivingLicenceDataContainer.getRD();
        List<String> listK = drivingLicenceDataContainer.k();
        List<CategoryContainer> listC = drivingLicenceDataContainer.c();
        ArrayList arrayList2 = null;
        if (listC != null) {
            List<CategoryContainer> list = listC;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(V((CategoryContainer) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<StatusChangedReasonContainer> listN = drivingLicenceDataContainer.n();
        if (listN != null) {
            List<StatusChangedReasonContainer> list2 = listN;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(Y((StatusChangedReasonContainer) it4.next()));
            }
        }
        return new DrivingLicenceContainerData(name, surname, birthday, birthplace, ds4, dsc, ldId, pn4, rd5, listK, arrayList, secondName, arrayList2, drivingLicenceDataContainer.getED());
    }

    public static final v W0(DocumentsGroup.a aVar) {
        int i15 = C3251a.f130929y[aVar.ordinal()];
        if (i15 == 1) {
            return v.DESC;
        }
        if (i15 == 2) {
            return v.ASC;
        }
        if (i15 == 3) {
            return v.UNKNOWN;
        }
        throw new p();
    }

    public static final DrivingLicenceScope X(o24.DrivingLicenceScope drivingLicenceScope) {
        return new DrivingLicenceScope(B0(drivingLicenceScope.getDh()), W(drivingLicenceScope.getDc()));
    }

    public static final c0 X0(MissingDocumentAttribute.a aVar) {
        int i15 = C3251a.f130925u[aVar.ordinal()];
        if (i15 == 1) {
            return c0.HIDE;
        }
        if (i15 == 2) {
            return c0.DEFAULT_VALUE;
        }
        if (i15 == 3) {
            return c0.UNKNOWN;
        }
        throw new p();
    }

    public static final DrivingLicenceStatusChangedReason Y(StatusChangedReasonContainer statusChangedReasonContainer) {
        return new DrivingLicenceStatusChangedReason(statusChangedReasonContainer.getCSC(), statusChangedReasonContainer.getCSD());
    }

    public static final MissingDocumentAttributeDto Y0(MissingDocumentAttribute missingDocumentAttribute) {
        c0 c0VarX0 = X0(missingDocumentAttribute.getOnMissing());
        r dataType = missingDocumentAttribute.getDataType();
        return new MissingDocumentAttributeDto(c0VarX0, dataType != null ? L0(dataType) : null, missingDocumentAttribute.getDefaultValue());
    }

    public static final FamilyCardContainerData Z(FamilyCardDataDto familyCardDataDto) {
        return new FamilyCardContainerData(familyCardDataDto.getOt(), familyCardDataDto.getCh(), familyCardDataDto.getN(), familyCardDataDto.getS(), familyCardDataDto.getSu(), familyCardDataDto.getP(), familyCardDataDto.getIcn(), familyCardDataDto.getNo(), familyCardDataDto.getED());
    }

    public static final g0 Z0(MultiDocumentView.a aVar) {
        int i15 = C3251a.f130928x[aVar.ordinal()];
        if (i15 == 1) {
            return g0.LEFT_TAB;
        }
        if (i15 == 2) {
            return g0.RIGHT_TAB;
        }
        if (i15 == 3) {
            return g0.UNKNOWN;
        }
        throw new p();
    }

    private static final o24.DocumentSchemaLabel a(DocumentSchemaLabel documentSchemaLabel) {
        return new o24.DocumentSchemaLabel(S0(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue());
    }

    public static final FamilyCardScope a0(FamilyCardScopeDto familyCardScopeDto) {
        return new FamilyCardScope(l1(familyCardScopeDto.getDataHeader()), Z(familyCardScopeDto.getDataContainer()));
    }

    public static final MultiDocumentSchemaDto a1(MultiDocumentSchema multiDocumentSchema) {
        DocumentsGroup leftTab = multiDocumentSchema.getLeftTab();
        DocumentsGroupDto documentsGroupDtoV0 = leftTab != null ? V0(leftTab) : null;
        DocumentsGroup rightTab = multiDocumentSchema.getRightTab();
        DocumentsGroupDto documentsGroupDtoV1 = rightTab != null ? V0(rightTab) : null;
        VerificationSelector verificationSelector = multiDocumentSchema.getVerificationSelector();
        return new MultiDocumentSchemaDto(documentsGroupDtoV0, documentsGroupDtoV1, verificationSelector != null ? g1(verificationSelector) : null);
    }

    public static final Document b(DocumentEntity documentEntity) {
        int parentCertificateId = documentEntity.getParentCertificateId();
        h hVarE = e(documentEntity.getStatus());
        f24.i iVarF = f(documentEntity.getType());
        String documentId = documentEntity.getDocumentId();
        LocalDate expirationDate = documentEntity.getExpirationDate();
        return new Document(documentId, parentCertificateId, iVarF, hVarE, expirationDate != null ? new fz.b.LocalDate(expirationDate) : null, documentEntity.getLastUpdateTimestamp(), documentEntity.getParentDocumentId() != null);
    }

    public static final MIdCardScope b0(PersonalDataScope9 personalDataScope9) {
        return new MIdCardScope(B0(personalDataScope9.getDh()), c0(personalDataScope9.getData()));
    }

    public static final MultiDocumentSelectorLabelDto b1(MultiDocumentSelectorLabel multiDocumentSelectorLabel) {
        ArrayList arrayList;
        List<DocumentConfigLabel> listA = multiDocumentSelectorLabel.a();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            LabelDto labelDtoA = D0((DocumentConfigLabel) it.next()).a();
            if (labelDtoA != null) {
                arrayList2.add(labelDtoA);
            }
        }
        List<DocumentConfigLabel> listB = multiDocumentSelectorLabel.b();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            LabelDto labelDtoA2 = D0((DocumentConfigLabel) it4.next()).a();
            if (labelDtoA2 != null) {
                arrayList3.add(labelDtoA2);
            }
        }
        List<DocumentConfigLabel> listC = multiDocumentSelectorLabel.c();
        if (listC != null) {
            arrayList = new ArrayList();
            Iterator<T> it5 = listC.iterator();
            while (it5.hasNext()) {
                LabelDto labelDtoA3 = D0((DocumentConfigLabel) it5.next()).a();
                if (labelDtoA3 != null) {
                    arrayList.add(labelDtoA3);
                }
            }
        } else {
            arrayList = null;
        }
        return new MultiDocumentSelectorLabelDto(arrayList3, arrayList2, arrayList);
    }

    public static final DocumentEntityStatus c(h hVar) {
        int i15 = C3251a.f130922r[hVar.ordinal()];
        if (i15 == 1) {
            return DocumentEntityStatus.ACTIVE;
        }
        if (i15 == 2) {
            return DocumentEntityStatus.INACTIVE;
        }
        if (i15 == 3) {
            return DocumentEntityStatus.EXPIRED;
        }
        if (i15 == 4) {
            return DocumentEntityStatus.REVOKED;
        }
        throw new p();
    }

    public static final MidCardScopeDataContainer c0(PersonalDataScope9DataContainer personalDataScope9DataContainer) {
        return new MidCardScopeDataContainer(d0(personalDataScope9DataContainer.getMobileIdCard()), m0(personalDataScope9DataContainer.getPersonalData()), n0(personalDataScope9DataContainer.getPersonalIdCard()));
    }

    public static final MultiDocumentViewDto c1(MultiDocumentView multiDocumentView) {
        return new MultiDocumentViewDto(I0(multiDocumentView.getDynamicSections()), Z0(multiDocumentView.getMultiDocumentGroup()));
    }

    public static final DocumentEntityType d(f24.i iVar) {
        switch (C3251a.f130918n[iVar.ordinal()]) {
            case 1:
                return DocumentEntityType.ID_CARD;
            case 2:
                return DocumentEntityType.DRIVING_LICENCE;
            case 3:
                return DocumentEntityType.VEHICLE_CARD;
            case 4:
                return DocumentEntityType.FAMILY_CARD;
            case 5:
                return DocumentEntityType.REFUGEE_CARD;
            case 6:
                return DocumentEntityType.REFUGEE_CHILD_CARD;
            case 7:
                return DocumentEntityType.STUDENT_CARD;
            case 8:
                return DocumentEntityType.RAILWAY_CARD;
            case 9:
                return DocumentEntityType.PENSIONER_CARD;
            case 10:
                return DocumentEntityType.DEPUTY_CARD;
            case 11:
                return DocumentEntityType.ADVOCATE_CARD;
            case 12:
                return DocumentEntityType.MIDWIFE_CARD;
            case 13:
                return DocumentEntityType.NURSE_CARD;
            case 14:
                return DocumentEntityType.RASKA_SENIOR_LICENCE;
            case 15:
                return DocumentEntityType.ZDUNSKOWOLSKA_RESIDENT_LICENCE;
            case 16:
                return DocumentEntityType.OLAWA_RESIDENT_LICENCE;
            case 17:
                return DocumentEntityType.OLAWA_FAMILY_LICENCE;
            case 18:
                return DocumentEntityType.OLAWA_SENIOR_LICENCE;
            case 19:
                return DocumentEntityType.ZDUNSKOWOLSKA_FAMILY_LICENCE;
            case 20:
                return DocumentEntityType.ZDUNSKOWOLSKA_SENIOR_LICENCE;
            case 21:
                return DocumentEntityType.SUCHY_LAS_FAMILY_LICENCE;
            case 22:
                return DocumentEntityType.MIEJSKA_AUGUSTOW_TOURIST_LICENCE;
            case 23:
                return DocumentEntityType.CHELM_FAMILY_LICENCE;
            case 24:
                return DocumentEntityType.CHELM_SENIOR_LICENCE;
            case 25:
                return DocumentEntityType.CHELM_RESIDENT_LICENCE;
            case 26:
                return DocumentEntityType.LODZ_SENIOR_LICENCE;
            case 27:
                return DocumentEntityType.LODZ_FAMILY_LICENCE;
            case 28:
                return DocumentEntityType.SENATOR_CARD;
            case 29:
                return DocumentEntityType.RACIBORSKA_RESIDENT_LICENCE;
            case 30:
                return DocumentEntityType.RACIBORSKA_SENIOR_LICENCE;
            case BERTags.DATE /* 31 */:
                return DocumentEntityType.RACIBORSKA_FAMILY_LICENCE;
            case 32:
                return DocumentEntityType.GIZYCKA_RESIDENT_LICENCE;
            case 33:
                return DocumentEntityType.PZPN_LICENCE;
            case 34:
                return DocumentEntityType.KOBYLKA_RESIDENT_LICENCE;
            case 35:
                return DocumentEntityType.WROCLAWSKA_SENIOR_LICENCE;
            case 36:
                return DocumentEntityType.MIEKINIA_SENIOR_LICENCE;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return DocumentEntityType.MIEKINIA_FAMILY_LICENCE;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return DocumentEntityType.TOPR_LICENCE;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return DocumentEntityType.MAZOVIA_LICENCE;
            case 40:
                return DocumentEntityType.GENERAL_COUNSEL_LICENCE;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return DocumentEntityType.OLECKO_RESIDENT_LICENCE;
            case EACTags.CURRENCY_CODE /* 42 */:
                return DocumentEntityType.BYDGOSZCZ_FAMILY_LICENCE;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return DocumentEntityType.WODZISLAW_FAMILY_LICENCE;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return DocumentEntityType.MICHALOWICE_RESIDENT_LICENCE;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return DocumentEntityType.KOLEJE_DOLNOSLASKIE_LICENCE;
            case 46:
                return DocumentEntityType.WISLA_RESIDENT_LICENCE;
            case 47:
                return DocumentEntityType.JASTRZEBIA_GORA_RESIDENT_LICENCE;
            case 48:
                return DocumentEntityType.FIREFIGHTER_OSP_LICENCE;
            case 49:
                return DocumentEntityType.DOCTOR;
            case 50:
                return DocumentEntityType.DENTIST;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return DocumentEntityType.ATTORNEY_AT_LAW;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return DocumentEntityType.TRAINEE_ATTORNEY_AT_LAW;
            case 53:
                return DocumentEntityType.CIVIL_ENGINEER;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return DocumentEntityType.TAX_ADVISOR;
            case 55:
                return DocumentEntityType.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
            case 56:
                return DocumentEntityType.AUDITOR;
            case 57:
                return DocumentEntityType.SOLIDARITY_CARD;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return DocumentEntityType.PHD_STUDENT;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return DocumentEntityType.PHYSIOTHERAPIST;
            case 60:
                return DocumentEntityType.PHARMACIST;
            case 61:
                return DocumentEntityType.SHOOTING_LICENCE;
            case 62:
                return DocumentEntityType.SPORT_SHOOTING_COMPETITOR_LICENCE;
            case 63:
                return DocumentEntityType.SPORT_SHOOTING_COACH_LICENCE;
            case 64:
                return DocumentEntityType.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
            case 65:
                return DocumentEntityType.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
            case 66:
                return DocumentEntityType.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return DocumentEntityType.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return DocumentEntityType.DISABLED_PERSON_IDENTIFICATION_CARD;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return DocumentEntityType.TEACHER;
            case 70:
                return DocumentEntityType.BAILIFF_CARD;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return DocumentEntityType.ELECTRONIC_DIPLOMA_GRADUATION;
            case 72:
                return DocumentEntityType.ELECTRONIC_DIPLOMA_PHD;
            case 73:
                return DocumentEntityType.ELECTRONIC_DIPLOMA_DSC;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return DocumentEntityType.LABORATORY_DIAGNOSTICIAN;
            case EACTags.DEPRECATED /* 75 */:
                return DocumentEntityType.PENSIONER_MSWIA;
            default:
                throw new p();
        }
    }

    public static final MobileIdCardContainer d0(o24.MobileIdCardContainer mobileIdCardContainer) {
        return new MobileIdCardContainer(mobileIdCardContainer.getNumber(), new fz.b.OffsetDateTime(mobileIdCardContainer.getValidFrom()), new fz.b.OffsetDateTime(mobileIdCardContainer.getValidTo()));
    }

    public static final PictureSchemaDto d1(PictureSchema pictureSchema) {
        String pictureId = pictureSchema.getPictureId();
        String emblemTextHexColor = pictureSchema.getEmblemTextHexColor();
        List<DocumentSchemaAttribute> listB = pictureSchema.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(K0((DocumentSchemaAttribute) it.next()));
        }
        String sourceContainerRef = pictureSchema.getSourceContainerRef();
        String attributesTitleTextHexColor = pictureSchema.getAttributesTitleTextHexColor();
        String attributesValueTextHexColor = pictureSchema.getAttributesValueTextHexColor();
        List<AdditionalLogo> listA = pictureSchema.a();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList2.add(E0((AdditionalLogo) it4.next()));
        }
        return new PictureSchemaDto(pictureId, emblemTextHexColor, arrayList, sourceContainerRef, null, attributesTitleTextHexColor, attributesValueTextHexColor, arrayList2, 16, null);
    }

    public static final h e(DocumentEntityStatus documentEntityStatus) {
        int i15 = C3251a.f130917m[documentEntityStatus.ordinal()];
        if (i15 == 1) {
            return h.ACTIVE;
        }
        if (i15 == 2) {
            return h.INACTIVE;
        }
        if (i15 == 3) {
            return h.REVOKED;
        }
        if (i15 == 4) {
            return h.EXPIRED;
        }
        throw new p();
    }

    public static final NipipCardContainerData.a e0(l0 l0Var) {
        int i15 = C3251a.f130930z[l0Var.ordinal()];
        if (i15 == 1) {
            return NipipCardContainerData.a.MIDWIFE;
        }
        if (i15 == 2) {
            return NipipCardContainerData.a.NURSE;
        }
        if (i15 == 3) {
            return NipipCardContainerData.a.UNKNOWN;
        }
        throw new p();
    }

    public static final QrCodeSchemaDto e1(QrCodeSchema qrCodeSchema) {
        return new QrCodeSchemaDto(f1(qrCodeSchema.getType()), qrCodeSchema.getFieldReference());
    }

    public static final f24.i f(DocumentEntityType documentEntityType) {
        switch (C3251a.f130919o[documentEntityType.ordinal()]) {
            case 1:
                return f24.i.ID_CARD;
            case 2:
                return f24.i.DRIVING_LICENCE;
            case 3:
                return f24.i.VEHICLE_CARD;
            case 4:
                return f24.i.FAMILY_CARD;
            case 5:
                return f24.i.REFUGEE_CARD;
            case 6:
                return f24.i.REFUGEE_CHILD_CARD;
            case 7:
                return f24.i.STUDENT_CARD;
            case 8:
                return f24.i.RAILWAY_CARD;
            case 9:
                return f24.i.PENSIONER_CARD;
            case 10:
                return f24.i.DEPUTY_CARD;
            case 11:
                return f24.i.ADVOCATE_CARD;
            case 12:
                return f24.i.MIDWIFE_CARD;
            case 13:
                return f24.i.NURSE_CARD;
            case 14:
                return f24.i.RASKA_SENIOR_LICENCE;
            case 15:
                return f24.i.ZDUNSKOWOLSKA_RESIDENT_LICENCE;
            case 16:
                return f24.i.OLAWA_RESIDENT_LICENCE;
            case 17:
                return f24.i.OLAWA_FAMILY_LICENCE;
            case 18:
                return f24.i.OLAWA_SENIOR_LICENCE;
            case 19:
                return f24.i.ZDUNSKOWOLSKA_FAMILY_LICENCE;
            case 20:
                return f24.i.ZDUNSKOWOLSKA_SENIOR_LICENCE;
            case 21:
                return f24.i.SUCHY_LAS_FAMILY_LICENCE;
            case 22:
                return f24.i.MIEJSKA_AUGUSTOW_TOURIST_LICENCE;
            case 23:
                return f24.i.CHELM_FAMILY_LICENCE;
            case 24:
                return f24.i.CHELM_SENIOR_LICENCE;
            case 25:
                return f24.i.CHELM_RESIDENT_LICENCE;
            case 26:
                return f24.i.LODZ_SENIOR_LICENCE;
            case 27:
                return f24.i.LODZ_FAMILY_LICENCE;
            case 28:
                return f24.i.SENATOR_CARD;
            case 29:
                return f24.i.RACIBORSKA_RESIDENT_LICENCE;
            case 30:
                return f24.i.RACIBORSKA_SENIOR_LICENCE;
            case BERTags.DATE /* 31 */:
                return f24.i.RACIBORSKA_FAMILY_LICENCE;
            case 32:
                return f24.i.GIZYCKA_RESIDENT_LICENCE;
            case 33:
                return f24.i.PZPN_LICENCE;
            case 34:
                return f24.i.KOBYLKA_RESIDENT_LICENCE;
            case 35:
                return f24.i.WROCLAWSKA_SENIOR_LICENCE;
            case 36:
                return f24.i.MIEKINIA_SENIOR_LICENCE;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return f24.i.MIEKINIA_FAMILY_LICENCE;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return f24.i.TOPR_LICENCE;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return f24.i.MAZOVIA_LICENCE;
            case 40:
                return f24.i.GENERAL_COUNSEL_LICENCE;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return f24.i.OLECKO_RESIDENT_LICENCE;
            case EACTags.CURRENCY_CODE /* 42 */:
                return f24.i.BYDGOSZCZ_FAMILY_LICENCE;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return f24.i.WODZISLAW_FAMILY_LICENCE;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return f24.i.MICHALOWICE_RESIDENT_LICENCE;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return f24.i.KOLEJE_DOLNOSLASKIE_LICENCE;
            case 46:
                return f24.i.WISLA_RESIDENT_LICENCE;
            case 47:
                return f24.i.FIREFIGHTER_OSP_LICENCE;
            case 48:
                return f24.i.JASTRZEBIA_GORA_RESIDENT_LICENCE;
            case 49:
                return f24.i.DOCTOR;
            case 50:
                return f24.i.DENTIST;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return f24.i.ATTORNEY_AT_LAW;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return f24.i.TRAINEE_ATTORNEY_AT_LAW;
            case 53:
                return f24.i.CIVIL_ENGINEER;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return f24.i.TAX_ADVISOR;
            case 55:
                return f24.i.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
            case 56:
                return f24.i.AUDITOR;
            case 57:
                return f24.i.SOLIDARITY_CARD;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return f24.i.PHD_STUDENT;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return f24.i.PHYSIOTHERAPIST;
            case 60:
                return f24.i.PHARMACIST;
            case 61:
                return f24.i.SHOOTING_LICENCE;
            case 62:
                return f24.i.SPORT_SHOOTING_COMPETITOR_LICENCE;
            case 63:
                return f24.i.SPORT_SHOOTING_COACH_LICENCE;
            case 64:
                return f24.i.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
            case 65:
                return f24.i.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
            case 66:
                return f24.i.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return f24.i.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return f24.i.DISABLED_PERSON_IDENTIFICATION_CARD;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return f24.i.TEACHER;
            case 70:
                return f24.i.BAILIFF_CARD;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return f24.i.ELECTRONIC_DIPLOMA_GRADUATION;
            case 72:
                return f24.i.ELECTRONIC_DIPLOMA_PHD;
            case 73:
                return f24.i.ELECTRONIC_DIPLOMA_DSC;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return f24.i.LABORATORY_DIAGNOSTICIAN;
            case EACTags.DEPRECATED /* 75 */:
                return f24.i.PENSIONER_MSWIA;
            default:
                throw new p();
        }
    }

    public static final NipipCardContainerData.b f0(m0 m0Var) {
        int i15 = C3251a.A[m0Var.ordinal()];
        if (i15 == 1) {
            return NipipCardContainerData.b.FULL;
        }
        if (i15 == 2) {
            return NipipCardContainerData.b.PARTIAL;
        }
        if (i15 == 3) {
            return NipipCardContainerData.b.UNKNOWN;
        }
        throw new p();
    }

    public static final x0 f1(QrCodeSchema.a aVar) {
        int i15 = C3251a.f130923s[aVar.ordinal()];
        if (i15 == 1) {
            return x0.QR_CODE_V10;
        }
        if (i15 == 2) {
            return x0.UNKNOWN;
        }
        throw new p();
    }

    public static final dx.i<dx.b, e> g(y yVar) {
        Object objB;
        e eVar;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C3251a.f130920p[yVar.ordinal()];
                    if (i15 == 1) {
                        eVar = e.MALE;
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Generic(new IllegalArgumentException("Cannot parse UNKNOWN to toDomain")));
                            throw new oq.g();
                        }
                        eVar = e.FEMALE;
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

    public static final NipipCardContainerData.c g0(n0 n0Var) {
        int i15 = C3251a.B[n0Var.ordinal()];
        if (i15 == 1) {
            return NipipCardContainerData.c.RANGE;
        }
        if (i15 == 2) {
            return NipipCardContainerData.c.INDIVIDUAL;
        }
        if (i15 == 3) {
            return NipipCardContainerData.c.UNDER_SUPERVISION;
        }
        if (i15 == 4) {
            return NipipCardContainerData.c.FIXED_TERM;
        }
        if (i15 == 5) {
            return NipipCardContainerData.c.UNKNOWN;
        }
        throw new p();
    }

    public static final VerificationSelectorDto g1(VerificationSelector verificationSelector) {
        return new VerificationSelectorDto(I0(verificationSelector.getDynamicSections()), b1(verificationSelector.getLabel()));
    }

    public static final f24.b h(CertificateEntityStatus certificateEntityStatus) {
        int i15 = C3251a.f130915k[certificateEntityStatus.ordinal()];
        if (i15 == 1) {
            return f24.b.ACTIVE;
        }
        if (i15 == 2) {
            return f24.b.INACTIVE;
        }
        throw new p();
    }

    public static final NipipCardContainerData h0(NipipDataContainer nipipDataContainer) {
        iy.b0 b0VarG = iy.c0.g(nipipDataContainer.getName());
        iy.b0 b0VarG2 = iy.c0.g(nipipDataContainer.getSurname());
        iy.b0 b0VarG3 = iy.c0.g(nipipDataContainer.getPesel());
        String professionalTitle = nipipDataContainer.getProfessionalTitle();
        String documentName = nipipDataContainer.getDocumentName();
        String documentNumber = nipipDataContainer.getDocumentNumber();
        String issuerName = nipipDataContainer.getIssuerName();
        LocalDate creationDate = nipipDataContainer.getCreationDate();
        NipipCardContainerData.a aVarE0 = e0(nipipDataContainer.getPwzType());
        NipipCardContainerData.b bVarF0 = f0(nipipDataContainer.getRestriction());
        String secondName = nipipDataContainer.getSecondName();
        iy.b0 b0VarG4 = secondName != null ? iy.c0.g(secondName) : null;
        n0 restrictionType = nipipDataContainer.getRestrictionType();
        return new NipipCardContainerData(b0VarG, b0VarG2, b0VarG3, professionalTitle, documentName, documentNumber, issuerName, creationDate, aVarE0, bVarF0, b0VarG4, restrictionType != null ? g0(restrictionType) : null);
    }

    public static final CertificateEntityStatus h1(f24.b bVar) {
        int i15 = C3251a.f130916l[bVar.ordinal()];
        if (i15 == 1) {
            return CertificateEntityStatus.ACTIVE;
        }
        if (i15 == 2) {
            return CertificateEntityStatus.INACTIVE;
        }
        throw new p();
    }

    public static final c i(CertificateEntityType certificateEntityType) {
        int i15 = C3251a.f130914j[certificateEntityType.ordinal()];
        if (i15 == 1) {
            return c.CITIZEN;
        }
        if (i15 == 2) {
            return c.REFUGEE;
        }
        if (i15 == 3) {
            return c.UNIVERSITY;
        }
        throw new p();
    }

    public static final NipipCardScope i0(NipipScope nipipScope) {
        return new NipipCardScope(B0(nipipScope.getDh()), h0(nipipScope.getDc()));
    }

    public static final CertificateEntityType i1(c cVar) {
        int i15 = C3251a.f130913i[cVar.ordinal()];
        if (i15 == 1) {
            return CertificateEntityType.CITIZEN;
        }
        if (i15 == 2) {
            return CertificateEntityType.REFUGEE;
        }
        if (i15 == 3) {
            return CertificateEntityType.UNIVERSITY;
        }
        throw new p();
    }

    public static final DocumentConfigLabel j(LabelDto labelDto) {
        return new DocumentConfigLabel(s(labelDto.getLanguage()), labelDto.getValue());
    }

    public static final PensionerCardContainerData j0(PensionerCardContainerDto pensionerCardContainerDto) {
        return new PensionerCardContainerData(pensionerCardContainerDto.getNumber(), pensionerCardContainerDto.getFirstName(), pensionerCardContainerDto.getSecondName(), pensionerCardContainerDto.getLastName(), pensionerCardContainerDto.getPesel(), pensionerCardContainerDto.getType(), pensionerCardContainerDto.getExpiredDate(), pensionerCardContainerDto.getDepartment());
    }

    public static final b0 j1(g gVar) {
        int i15 = C3251a.f130927w[gVar.ordinal()];
        if (i15 == 1) {
            return b0.PL;
        }
        if (i15 == 2) {
            return b0.EN;
        }
        if (i15 == 3) {
            return b0.UK;
        }
        if (i15 == 4) {
            return b0.UNKNOWN;
        }
        throw new p();
    }

    public static final DocumentScope k(DocumentScopeEntity documentScopeEntity) {
        return new DocumentScope(documentScopeEntity.getDocumentContainerId(), documentScopeEntity.getScopeName(), documentScopeEntity.getScopeData());
    }

    public static final PensionerCardScope k0(PensionerCardDataDto pensionerCardDataDto) {
        return new PensionerCardScope(l1(pensionerCardDataDto.getDataHeader()), j0(pensionerCardDataDto.getDataContainer()));
    }

    public static final RefugeeMnemonicHeader k1(DataHeaderDto dataHeaderDto) {
        int tp4 = dataHeaderDto.getTp();
        String stp = dataHeaderDto.getStp();
        String ver = dataHeaderDto.getVer();
        String dn4 = dataHeaderDto.getDn();
        String sn4 = dataHeaderDto.getSn();
        String isr = dataHeaderDto.getIsr();
        String ts4 = dataHeaderDto.getTs();
        String rId = dataHeaderDto.getRId();
        String iid = dataHeaderDto.getIid();
        String pesel = dataHeaderDto.getPesel();
        if (pesel == null) {
            pesel = "";
        }
        return new RefugeeMnemonicHeader(tp4, stp, ver, dn4, sn4, isr, ts4, rId, iid, iy.c0.g(pesel), dataHeaderDto.getInstitutionId(), dataHeaderDto.getId());
    }

    public static final AdditionalLogo l(AdditionalLogoDto additionalLogoDto) {
        return new AdditionalLogo(additionalLogoDto.getId(), additionalLogoDto.getFieldReference());
    }

    public static final PersonalAddressContainer l0(o24.PersonalAddressContainer personalAddressContainer) {
        String streetPrefix = personalAddressContainer.getStreetPrefix();
        iy.b0 b0VarG = streetPrefix != null ? iy.c0.g(streetPrefix) : null;
        String streetName = personalAddressContainer.getStreetName();
        iy.b0 b0VarG2 = streetName != null ? iy.c0.g(streetName) : null;
        String houseNumber = personalAddressContainer.getHouseNumber();
        iy.b0 b0VarG3 = houseNumber != null ? iy.c0.g(houseNumber) : null;
        String postalCode = personalAddressContainer.getPostalCode();
        iy.b0 b0VarG4 = postalCode != null ? iy.c0.g(postalCode) : null;
        String localityTerritoryCode = personalAddressContainer.getLocalityTerritoryCode();
        iy.b0 b0VarG5 = localityTerritoryCode != null ? iy.c0.g(localityTerritoryCode) : null;
        String locality = personalAddressContainer.getLocality();
        iy.b0 b0VarG6 = locality != null ? iy.c0.g(locality) : null;
        String municipality = personalAddressContainer.getMunicipality();
        iy.b0 b0VarG7 = municipality != null ? iy.c0.g(municipality) : null;
        String voivodeship = personalAddressContainer.getVoivodeship();
        iy.b0 b0VarG8 = voivodeship != null ? iy.c0.g(voivodeship) : null;
        LocalDate permanentAddressRegistrationDate = personalAddressContainer.getPermanentAddressRegistrationDate();
        fz.b.LocalDate localDate = permanentAddressRegistrationDate != null ? new fz.b.LocalDate(permanentAddressRegistrationDate) : null;
        String apartmentNumber = personalAddressContainer.getApartmentNumber();
        return new PersonalAddressContainer(b0VarG, b0VarG2, b0VarG3, b0VarG4, b0VarG5, b0VarG6, b0VarG7, b0VarG8, localDate, apartmentNumber != null ? iy.c0.g(apartmentNumber) : null);
    }

    public static final DataHeaderStandard l1(DataHeaderDto dataHeaderDto) {
        return new DataHeaderStandard(dataHeaderDto.getDn(), dataHeaderDto.getSn(), dataHeaderDto.getIsr(), dataHeaderDto.getTs(), dataHeaderDto.getRId(), dataHeaderDto.getTp(), dataHeaderDto.getStp(), dataHeaderDto.getVer(), dataHeaderDto.getIid(), dataHeaderDto.getPesel(), dataHeaderDto.getInstitutionId(), dataHeaderDto.getId());
    }

    public static final BarcodeSchema m(BarcodeSchemaDto barcodeSchemaDto) {
        String fieldReference = barcodeSchemaDto.getFieldReference();
        List<DocumentSchemaLabelDto> listB = barcodeSchemaDto.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(z((DocumentSchemaLabelDto) it.next()));
        }
        return new BarcodeSchema(fieldReference, arrayList);
    }

    public static final PersonalDataContainer m0(o24.PersonalDataContainer personalDataContainer) {
        dx.i<dx.b, e> iVarG;
        iy.b0 b0VarG = iy.c0.g(personalDataContainer.getName());
        String secondName = personalDataContainer.getSecondName();
        iy.b0 b0VarG2 = secondName != null ? iy.c0.g(secondName) : null;
        iy.b0 b0VarG3 = iy.c0.g(personalDataContainer.getSurname());
        String familyName = personalDataContainer.getFamilyName();
        iy.b0 b0VarG4 = familyName != null ? iy.c0.g(familyName) : null;
        iy.b0 b0VarG5 = iy.c0.g(personalDataContainer.getFatherName());
        String fatherFamilySurname = personalDataContainer.getFatherFamilySurname();
        iy.b0 b0VarG6 = fatherFamilySurname != null ? iy.c0.g(fatherFamilySurname) : null;
        iy.b0 b0VarG7 = iy.c0.g(personalDataContainer.getMotherName());
        String motherFamilySurname = personalDataContainer.getMotherFamilySurname();
        iy.b0 b0VarG8 = motherFamilySurname != null ? iy.c0.g(motherFamilySurname) : null;
        iy.b0 b0VarG9 = iy.c0.g(personalDataContainer.getPesel());
        iy.b0 b0Var = b0VarG4;
        iy.b0 b0Var2 = b0VarG6;
        iy.b0 b0Var3 = b0VarG8;
        fz.b.LocalDate localDate = new fz.b.LocalDate(personalDataContainer.getBirthDate());
        String birthPlace = personalDataContainer.getBirthPlace();
        PersonalAddressContainer personalAddressContainerL0 = null;
        String birthCountry = personalDataContainer.getBirthCountry();
        y gender = personalDataContainer.getGender();
        e eVarA = (gender == null || (iVarG = g(gender)) == null) ? null : iVarG.a();
        String citizenship = personalDataContainer.getCitizenship();
        o24.PersonalAddressContainer permanentAddress = personalDataContainer.getPermanentAddress();
        if (permanentAddress != null) {
            personalAddressContainerL0 = l0(permanentAddress);
        }
        return new PersonalDataContainer(b0VarG, b0VarG2, b0VarG3, b0Var, b0VarG5, b0Var2, b0VarG7, b0Var3, b0VarG9, localDate, birthPlace, birthCountry, eVarA, citizenship, personalAddressContainerL0);
    }

    public static final DocumentActionAttribute n(DocumentSchemaActionAttributeDto documentSchemaActionAttributeDto) {
        DocumentActionAttribute.a aVarA = DocumentActionAttribute.a.INSTANCE.a(documentSchemaActionAttributeDto.getActionType());
        List<DocumentSchemaLabelDto> listB = documentSchemaActionAttributeDto.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(z((DocumentSchemaLabelDto) it.next()));
        }
        return new DocumentActionAttribute(aVarA, arrayList);
    }

    public static final PersonalIdCardContainer n0(o24.PersonalIdCardContainer personalIdCardContainer) {
        iy.b0 b0VarG = iy.c0.g(personalIdCardContainer.getPicture());
        String number = personalIdCardContainer.getNumber();
        String issuer = personalIdCardContainer.getIssuer();
        LocalDate validTo = personalIdCardContainer.getValidTo();
        fz.b.LocalDate localDate = validTo != null ? new fz.b.LocalDate(validTo) : null;
        LocalDate creationDate = personalIdCardContainer.getCreationDate();
        fz.b.LocalDate localDate2 = creationDate != null ? new fz.b.LocalDate(creationDate) : null;
        LocalDate suspensionDate = personalIdCardContainer.getSuspensionDate();
        fz.b.LocalDate localDate3 = suspensionDate != null ? new fz.b.LocalDate(suspensionDate) : null;
        LocalDate revocationDate = personalIdCardContainer.getRevocationDate();
        fz.b.LocalDate localDate4 = revocationDate != null ? new fz.b.LocalDate(revocationDate) : null;
        u0 status = personalIdCardContainer.getStatus();
        return new PersonalIdCardContainer(b0VarG, number, issuer, localDate, localDate2, localDate3, localDate4, status != null ? o0(status) : null);
    }

    public static final DocumentBottomAnnotation o(DocumentBottomAnnotationDto documentBottomAnnotationDto) {
        List<DocumentBottomAnnotationSectionDto> listA = documentBottomAnnotationDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(p((DocumentBottomAnnotationSectionDto) it.next()));
        }
        return new DocumentBottomAnnotation(arrayList);
    }

    public static final i0 o0(u0 u0Var) {
        int i15 = C3251a.f130921q[u0Var.ordinal()];
        if (i15 == 1) {
            return i0.NOT_ISSUED;
        }
        if (i15 == 2) {
            return i0.ISSUED;
        }
        if (i15 == 3) {
            return i0.REVOKED;
        }
        if (i15 == 4) {
            return i0.SUSPENDED;
        }
        if (i15 == 5) {
            return i0.UNKNOWN;
        }
        throw new p();
    }

    public static final DocumentBottomAnnotationSection p(DocumentBottomAnnotationSectionDto documentBottomAnnotationSectionDto) {
        ArrayList arrayList;
        List<o24.DocumentSchemaLabel> listA = documentBottomAnnotationSectionDto.a();
        ArrayList arrayList2 = null;
        if (listA != null) {
            List<o24.DocumentSchemaLabel> list = listA;
            arrayList = new ArrayList(pq.v.y(list, 10));
            for (o24.DocumentSchemaLabel documentSchemaLabel : list) {
                arrayList.add(new DocumentSchemaLabel(r(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue()));
            }
        } else {
            arrayList = null;
        }
        String linkUrl = documentBottomAnnotationSectionDto.getLinkUrl();
        List<o24.DocumentSchemaLabel> listB = documentBottomAnnotationSectionDto.b();
        if (listB != null) {
            List<o24.DocumentSchemaLabel> list2 = listB;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            for (o24.DocumentSchemaLabel documentSchemaLabel2 : list2) {
                arrayList2.add(new DocumentSchemaLabel(r(documentSchemaLabel2.getLanguage()), documentSchemaLabel2.getValue()));
            }
        }
        return new DocumentBottomAnnotationSection(arrayList, linkUrl, arrayList2);
    }

    public static final RailwayCardContainerData p0(RailwayCardContainerDataDto railwayCardContainerDataDto) {
        String cardRelation = railwayCardContainerDataDto.getCardRelation();
        String holderType = railwayCardContainerDataDto.getHolderType();
        String batch = railwayCardContainerDataDto.getBatch();
        String number = railwayCardContainerDataDto.getNumber();
        String firstName = railwayCardContainerDataDto.getFirstName();
        String secondName = railwayCardContainerDataDto.getSecondName();
        String lastName = railwayCardContainerDataDto.getLastName();
        String pesel = railwayCardContainerDataDto.getPesel();
        String employer = railwayCardContainerDataDto.getEmployer();
        RailwayCardContainerData.a aVarA = RailwayCardContainerData.INSTANCE.a(railwayCardContainerDataDto.getOuCategory());
        if (aVarA == null) {
            aVarA = RailwayCardContainerData.a.UNKNOWN;
        }
        return new RailwayCardContainerData(cardRelation, holderType, batch, number, firstName, secondName, lastName, pesel, employer, aVarA, railwayCardContainerDataDto.getTrainClass(), railwayCardContainerDataDto.getAnnotation(), railwayCardContainerDataDto.getConcession(), railwayCardContainerDataDto.getStatus(), railwayCardContainerDataDto.getEmployerCode(), railwayCardContainerDataDto.getValidFrom(), railwayCardContainerDataDto.getExpiryDate(), railwayCardContainerDataDto.getQrCode());
    }

    public static final DocumentDynamicSection q(DocumentDynamicSectionDto documentDynamicSectionDto) {
        List<String> listC = documentDynamicSectionDto.c();
        if (listC == null) {
            listC = pq.v.n();
        }
        List<String> listA = documentDynamicSectionDto.a();
        List<String> listB = documentDynamicSectionDto.b();
        if (listB == null) {
            listB = pq.v.n();
        }
        return new DocumentDynamicSection(listC, listA, listB);
    }

    public static final RailwayCardScope q0(RailwayCardScopeDto railwayCardScopeDto) {
        return new RailwayCardScope(l1(railwayCardScopeDto.getDataHeader()), p0(railwayCardScopeDto.getDataContainer()));
    }

    public static final g r(q qVar) {
        int i15 = C3251a.f130905a[qVar.ordinal()];
        if (i15 == 1) {
            return g.PL;
        }
        if (i15 == 2) {
            return g.EN;
        }
        if (i15 == 3) {
            return g.UK;
        }
        if (i15 == 4) {
            return g.UNKNOWN;
        }
        throw new p();
    }

    public static final i24.n0 r0(RefugeeCardContainerDto refugeeCardContainerDto) {
        String birthDate = refugeeCardContainerDto.getBirthDate();
        iy.b0 b0VarG = birthDate != null ? iy.c0.g(birthDate) : null;
        String birthPlace = refugeeCardContainerDto.getBirthPlace();
        iy.b0 b0VarG2 = birthPlace != null ? iy.c0.g(birthPlace) : null;
        String birthCountry = refugeeCardContainerDto.getBirthCountry();
        iy.b0 b0VarG3 = birthCountry != null ? iy.c0.g(birthCountry) : null;
        String sex = refugeeCardContainerDto.getSex();
        iy.b0 b0VarG4 = sex != null ? iy.c0.g(sex) : null;
        String nationality = refugeeCardContainerDto.getNationality();
        iy.b0 b0VarG5 = nationality != null ? iy.c0.g(nationality) : null;
        String expiryDate = refugeeCardContainerDto.getExpiryDate();
        String refugeeStatus = refugeeCardContainerDto.getRefugeeStatus();
        iy.b0 b0VarG6 = refugeeStatus != null ? iy.c0.g(refugeeStatus) : null;
        String picture = refugeeCardContainerDto.getPicture();
        iy.b0 b0VarG7 = picture != null ? iy.c0.g(picture) : null;
        String firstName = refugeeCardContainerDto.getFirstName();
        iy.b0 b0VarG8 = firstName != null ? iy.c0.g(firstName) : null;
        String secondName = refugeeCardContainerDto.getSecondName();
        iy.b0 b0VarG9 = secondName != null ? iy.c0.g(secondName) : null;
        String surname = refugeeCardContainerDto.getSurname();
        iy.b0 b0VarG10 = surname != null ? iy.c0.g(surname) : null;
        String id5 = refugeeCardContainerDto.getId();
        String familyName = refugeeCardContainerDto.getFamilyName();
        iy.b0 b0VarG11 = familyName != null ? iy.c0.g(familyName) : null;
        String pesel = refugeeCardContainerDto.getPesel();
        return new i24.n0(b0VarG, b0VarG2, b0VarG3, b0VarG4, b0VarG5, expiryDate, b0VarG6, b0VarG7, b0VarG8, b0VarG9, b0VarG10, id5, b0VarG11, pesel != null ? iy.c0.g(pesel) : null);
    }

    public static final g s(b0 b0Var) {
        int i15 = C3251a.f130907c[b0Var.ordinal()];
        if (i15 == 1) {
            return g.PL;
        }
        if (i15 == 2) {
            return g.EN;
        }
        if (i15 == 3) {
            return g.UK;
        }
        if (i15 == 4) {
            return g.UNKNOWN;
        }
        throw new p();
    }

    public static final RefugeeCardScope s0(RefugeeCardDto refugeeCardDto) {
        return new RefugeeCardScope(k1(refugeeCardDto.getDataHeader()), r0(refugeeCardDto.getDataContainer()));
    }

    public static final DocumentSchema t(DocumentSchemaDto documentSchemaDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String schemaId = documentSchemaDto.getSchemaId();
        String schemaVersion = documentSchemaDto.getSchemaVersion();
        String documentName = documentSchemaDto.getDocumentName();
        PictureSchema pictureSchemaH = H(documentSchemaDto.getPicture());
        String documentPeselFieldReference = documentSchemaDto.getDocumentPeselFieldReference();
        DocumentTopAnnotationDto topAnnotation = documentSchemaDto.getTopAnnotation();
        ArrayList arrayList5 = null;
        DocumentTopAnnotation documentTopAnnotationB = topAnnotation != null ? B(topAnnotation) : null;
        QrCodeSchemaDto qrCode = documentSchemaDto.getQrCode();
        QrCodeSchema qrCodeSchemaJ = qrCode != null ? J(qrCode) : null;
        BarcodeSchemaDto barcode = documentSchemaDto.getBarcode();
        BarcodeSchema barcodeSchemaM = barcode != null ? m(barcode) : null;
        List<DocumentSchemaAttributeDto> listF = documentSchemaDto.f();
        if (listF != null) {
            List<DocumentSchemaAttributeDto> list = listF;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(u((DocumentSchemaAttributeDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<DocumentSchemaLabelDto> listC = documentSchemaDto.c();
        if (listC != null) {
            List<DocumentSchemaLabelDto> list2 = listC;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(z((DocumentSchemaLabelDto) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<DocumentSchemaAttributeDto> listB = documentSchemaDto.b();
        if (listB != null) {
            List<DocumentSchemaAttributeDto> list3 = listB;
            arrayList3 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(u((DocumentSchemaAttributeDto) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        List<DocumentSchemaActionAttributeDto> listA = documentSchemaDto.a();
        if (listA != null) {
            List<DocumentSchemaActionAttributeDto> list4 = listA;
            arrayList4 = new ArrayList(pq.v.y(list4, 10));
            Iterator<T> it6 = list4.iterator();
            while (it6.hasNext()) {
                arrayList4.add(n((DocumentSchemaActionAttributeDto) it6.next()));
            }
        } else {
            arrayList4 = null;
        }
        DocumentBottomAnnotationDto bottomAnnotation = documentSchemaDto.getBottomAnnotation();
        DocumentBottomAnnotation documentBottomAnnotationO = bottomAnnotation != null ? o(bottomAnnotation) : null;
        MultiDocumentViewDto multiDocumentView = documentSchemaDto.getMultiDocumentView();
        MultiDocumentView multiDocumentViewN = multiDocumentView != null ? N(multiDocumentView) : null;
        List<DocumentSchemaForwardAttributeDto> listI = documentSchemaDto.i();
        if (listI != null) {
            List<DocumentSchemaForwardAttributeDto> list5 = listI;
            arrayList5 = new ArrayList(pq.v.y(list5, 10));
            Iterator<T> it7 = list5.iterator();
            while (it7.hasNext()) {
                arrayList5.add(y((DocumentSchemaForwardAttributeDto) it7.next()));
            }
        }
        return new DocumentSchema(schemaId, schemaVersion, documentName, arrayList5, pictureSchemaH, documentPeselFieldReference, null, documentTopAnnotationB, qrCodeSchemaJ, barcodeSchemaM, arrayList, arrayList2, arrayList3, arrayList4, documentBottomAnnotationO, multiDocumentViewN, 64, null);
    }

    public static final StudentCardScope t0(StudentCardDto studentCardDto) {
        return new StudentCardScope(C0(studentCardDto.getDh()), new StudentCardContainerData(studentCardDto.getN(), studentCardDto.getS(), studentCardDto.getSu(), studentCardDto.getC(), studentCardDto.getE(), studentCardDto.getP(), studentCardDto.getPW(), studentCardDto.getPi(), studentCardDto.getB(), studentCardDto.getA(), studentCardDto.getSn(), studentCardDto.getSa(), studentCardDto.getD(), studentCardDto.getG(), studentCardDto.getDi(), studentCardDto.getSp(), studentCardDto.getEn(), studentCardDto.getDis()));
    }

    public static final DocumentSchemaAttribute u(DocumentSchemaAttributeDto documentSchemaAttributeDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        r rVarE = E(documentSchemaAttributeDto.getDataType());
        List<DocumentSchemaLabelDto> listG = documentSchemaAttributeDto.g();
        ArrayList arrayList3 = new ArrayList(pq.v.y(listG, 10));
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            arrayList3.add(z((DocumentSchemaLabelDto) it.next()));
        }
        MissingDocumentAttributeDto onMissingAttribute = documentSchemaAttributeDto.getOnMissingAttribute();
        ArrayList arrayList4 = null;
        MissingDocumentAttribute missingDocumentAttributeG = onMissingAttribute != null ? G(onMissingAttribute) : null;
        List<String> listE = documentSchemaAttributeDto.e();
        String fieldReference = documentSchemaAttributeDto.getFieldReference();
        List<DocumentSchemaEnumTranslationDto> listC = documentSchemaAttributeDto.c();
        if (listC != null) {
            List<DocumentSchemaEnumTranslationDto> list = listC;
            ArrayList arrayList5 = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList5.add(w((DocumentSchemaEnumTranslationDto) it4.next()));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        List<DocumentSchemaBooleanTranslationDto> listA = documentSchemaAttributeDto.a();
        if (listA != null) {
            List<DocumentSchemaBooleanTranslationDto> list2 = listA;
            ArrayList arrayList6 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList6.add(v((DocumentSchemaBooleanTranslationDto) it5.next()));
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        List<m> listF = documentSchemaAttributeDto.f();
        if (listF != null) {
            List<m> list3 = listF;
            arrayList4 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it6 = list3.iterator();
            while (it6.hasNext()) {
                arrayList4.add(x((m) it6.next()));
            }
        }
        return new DocumentSchemaAttribute(rVarE, missingDocumentAttributeG, arrayList3, listE, fieldReference, arrayList, arrayList2, arrayList4);
    }

    public static final TimeMeter u0(TimeMeterDto timeMeterDto) {
        return new TimeMeter(timeMeterDto.getUnit(), timeMeterDto.getDataImporter(), timeMeterDto.getSaveDate(), timeMeterDto.getValue());
    }

    public static final DocumentSchemaBooleanTranslation v(DocumentSchemaBooleanTranslationDto documentSchemaBooleanTranslationDto) {
        List<DocumentSchemaLabelDto> listB = documentSchemaBooleanTranslationDto.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(z((DocumentSchemaLabelDto) it.next()));
        }
        List<DocumentSchemaLabelDto> listA = documentSchemaBooleanTranslationDto.a();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList2.add(z((DocumentSchemaLabelDto) it4.next()));
        }
        return new DocumentSchemaBooleanTranslation(arrayList, arrayList2);
    }

    public static final VehicleDocumentContainerData v0(VehicleFullDocumentDto vehicleFullDocumentDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String make = vehicleFullDocumentDto.getMake();
        String model = vehicleFullDocumentDto.getModel();
        String registrationNumber = vehicleFullDocumentDto.getRegistrationNumber();
        String vin = vehicleFullDocumentDto.getVin();
        String productionYear = vehicleFullDocumentDto.getProductionYear();
        BigDecimal engineCapacity = vehicleFullDocumentDto.getEngineCapacity();
        BigDecimal maxPower = vehicleFullDocumentDto.getMaxPower();
        String kind = vehicleFullDocumentDto.getKind();
        Date firstRegistrationDate = vehicleFullDocumentDto.getFirstRegistrationDate();
        Date technicalExaminationActivityDate = vehicleFullDocumentDto.getTechnicalExaminationActivityDate();
        Date technicalExaminationExpireDate = vehicleFullDocumentDto.getTechnicalExaminationExpireDate();
        List<InsuranceDto> insurances = vehicleFullDocumentDto.getInsurances();
        if (insurances != null) {
            List<InsuranceDto> list = insurances;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x0((InsuranceDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<OtherDocumentDto> otherDocuments = vehicleFullDocumentDto.getOtherDocuments();
        if (otherDocuments != null) {
            List<OtherDocumentDto> list2 = otherDocuments;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(U((OtherDocumentDto) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        ArrayList arrayList3 = arrayList;
        String subKind = vehicleFullDocumentDto.getSubKind();
        TimeMeter timeMeterU0 = null;
        ArrayList arrayList4 = arrayList2;
        String vehicleCategory = vehicleFullDocumentDto.getVehicleCategory();
        String vehicleApprovalCategoryCertificate = vehicleFullDocumentDto.getVehicleApprovalCategoryCertificate();
        String purpose = vehicleFullDocumentDto.getPurpose();
        String type = vehicleFullDocumentDto.getType();
        String origin = vehicleFullDocumentDto.getOrigin();
        String strIsIdNumberStamped = vehicleFullDocumentDto.isIdNumberStamped();
        String nameplate = vehicleFullDocumentDto.getNameplate();
        String vehicleProductionMethod = vehicleFullDocumentDto.getVehicleProductionMethod();
        String kWperkg = vehicleFullDocumentDto.getKWperkg();
        String fuelType = vehicleFullDocumentDto.getFuelType();
        String firstAlternativeFuelType = vehicleFullDocumentDto.getFirstAlternativeFuelType();
        String secondAlternativeFuelType = vehicleFullDocumentDto.getSecondAlternativeFuelType();
        String strIsCatalyst = vehicleFullDocumentDto.isCatalyst();
        BigDecimal combinedFuelConsumption = vehicleFullDocumentDto.getCombinedFuelConsumption();
        BigDecimal combinedFuelConsumptionWLTP = vehicleFullDocumentDto.getCombinedFuelConsumptionWLTP();
        BigDecimal co2Emission = vehicleFullDocumentDto.getCo2Emission();
        String co2EmissionWLTP = vehicleFullDocumentDto.getCo2EmissionWLTP();
        BigDecimal maxWeight = vehicleFullDocumentDto.getMaxWeight();
        BigDecimal maxAllowedWeight = vehicleFullDocumentDto.getMaxAllowedWeight();
        BigDecimal maxLoad = vehicleFullDocumentDto.getMaxLoad();
        BigDecimal standingPlaces = vehicleFullDocumentDto.getStandingPlaces();
        BigDecimal seats = vehicleFullDocumentDto.getSeats();
        BigDecimal allPlaces = vehicleFullDocumentDto.getAllPlaces();
        BigDecimal axisQuantity = vehicleFullDocumentDto.getAxisQuantity();
        BigDecimal kerbWeight = vehicleFullDocumentDto.getKerbWeight();
        BigDecimal maxAllowedWeightOfCarSet = vehicleFullDocumentDto.getMaxAllowedWeightOfCarSet();
        BigDecimal maxWeigthOfTrailerWithBrake = vehicleFullDocumentDto.getMaxWeigthOfTrailerWithBrake();
        BigDecimal maxWeigthOfTrailerWithoutBrake = vehicleFullDocumentDto.getMaxWeigthOfTrailerWithoutBrake();
        BigDecimal wheelbase = vehicleFullDocumentDto.getWheelbase();
        BigDecimal minTrackWidth = vehicleFullDocumentDto.getMinTrackWidth();
        BigDecimal maxTrackWidth = vehicleFullDocumentDto.getMaxTrackWidth();
        BigDecimal avgTrackWidth = vehicleFullDocumentDto.getAvgTrackWidth();
        BigDecimal maxAllowedAxisEmphasis = vehicleFullDocumentDto.getMaxAllowedAxisEmphasis();
        String strIsCarHook = vehicleFullDocumentDto.isCarHook();
        BigDecimal imageCode = vehicleFullDocumentDto.getImageCode();
        Integer meterValue = vehicleFullDocumentDto.getMeterValue();
        int iIntValue = meterValue != null ? meterValue.intValue() : 0;
        String meterUnit = vehicleFullDocumentDto.getMeterUnit();
        String dataImporter = vehicleFullDocumentDto.getDataImporter();
        Date meterSavingDate = vehicleFullDocumentDto.getMeterSavingDate();
        boolean zIsEuroNorm = vehicleFullDocumentDto.isEuroNorm();
        String emissionLevelEuro = vehicleFullDocumentDto.getEmissionLevelEuro();
        DistanceMeterDto distanceMeter = vehicleFullDocumentDto.getDistanceMeter();
        DistanceMeter distanceMeterT = distanceMeter != null ? T(distanceMeter) : null;
        TimeMeterDto timeMeter = vehicleFullDocumentDto.getTimeMeter();
        if (timeMeter != null) {
            timeMeterU0 = u0(timeMeter);
        }
        return new VehicleDocumentContainerData(make, model, registrationNumber, vin, productionYear, engineCapacity, maxPower, kind, firstRegistrationDate, technicalExaminationActivityDate, technicalExaminationExpireDate, arrayList3, arrayList4, subKind, vehicleCategory, vehicleApprovalCategoryCertificate, purpose, type, origin, strIsIdNumberStamped, nameplate, vehicleProductionMethod, kWperkg, fuelType, firstAlternativeFuelType, secondAlternativeFuelType, strIsCatalyst, combinedFuelConsumption, combinedFuelConsumptionWLTP, co2Emission, co2EmissionWLTP, maxWeight, maxAllowedWeight, maxLoad, standingPlaces, seats, allPlaces, axisQuantity, kerbWeight, maxAllowedWeightOfCarSet, maxWeigthOfTrailerWithBrake, maxWeigthOfTrailerWithoutBrake, wheelbase, minTrackWidth, maxTrackWidth, avgTrackWidth, maxAllowedAxisEmphasis, strIsCarHook, imageCode, iIntValue, meterUnit, dataImporter, meterSavingDate, zIsEuroNorm, emissionLevelEuro, distanceMeterT, timeMeterU0);
    }

    public static final DocumentSchemaEnumTranslation w(DocumentSchemaEnumTranslationDto documentSchemaEnumTranslationDto) {
        String enumValue = documentSchemaEnumTranslationDto.getEnumValue();
        List<DocumentSchemaLabelDto> listA = documentSchemaEnumTranslationDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(z((DocumentSchemaLabelDto) it.next()));
        }
        return new DocumentSchemaEnumTranslation(enumValue, arrayList);
    }

    public static final VehicleDocumentScope w0(VehicleCardDataDto vehicleCardDataDto) {
        IdentityDataHeader identityDataHeaderA0 = A0(vehicleCardDataDto.getDataHeader());
        VehicleFullDocumentDto full = vehicleCardDataDto.getDocumentSets().getFULL();
        return new VehicleDocumentScope(identityDataHeaderA0, full != null ? v0(full) : null);
    }

    public static final l x(m mVar) {
        int i15 = C3251a.f130911g[mVar.ordinal()];
        if (i15 == 1) {
            return l.UPPERCASE;
        }
        if (i15 == 2) {
            return l.UNKNOWN;
        }
        throw new p();
    }

    public static final VehicleInsuranceModel x0(InsuranceDto insuranceDto) {
        return new VehicleInsuranceModel(insuranceDto.getInsuranceExpireDate(), insuranceDto.getValidInsuranceDays(), insuranceDto.getInsuranceInstitutionName(), insuranceDto.getInsuranceId(), insuranceDto.getInsuranceType(), insuranceDto.getInsuranceSignDay(), insuranceDto.getInsurancePeriod().getStartDate(), insuranceDto.getInsurancePeriod().getEndDate());
    }

    public static final DocumentSchemaForwardAttribute y(DocumentSchemaForwardAttributeDto documentSchemaForwardAttributeDto) {
        List<DocumentSchemaLabelDto> listA = documentSchemaForwardAttributeDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(z((DocumentSchemaLabelDto) it.next()));
        }
        return new DocumentSchemaForwardAttribute(arrayList);
    }

    public static final WruDocumentItem y0(WruLicenceDataContainerItemDto wruLicenceDataContainerItemDto, int i15, boolean z15) {
        String str;
        if (z15) {
            str = "wruAdditionalDocumentItemLabel_" + i15;
        } else {
            str = "wruDocumentItemLabel_" + i15;
        }
        String dataType = wruLicenceDataContainerItemDto.getDataType();
        if (dataType == null) {
            dataType = "";
        }
        String value = wruLicenceDataContainerItemDto.getValue();
        if (value == null) {
            value = "";
        }
        String label = wruLicenceDataContainerItemDto.getLabel();
        if (label == null) {
            label = "";
        }
        Label labelB = mx.b.b(label, str);
        String type = wruLicenceDataContainerItemDto.getType();
        String str2 = type == null ? "" : type;
        Boolean share = wruLicenceDataContainerItemDto.getShare();
        return new WruDocumentItem(dataType, value, labelB, str2, share != null ? share.booleanValue() : false);
    }

    public static final DocumentSchemaLabel z(DocumentSchemaLabelDto documentSchemaLabelDto) {
        return new DocumentSchemaLabel(r(documentSchemaLabelDto.getLanguage()), documentSchemaLabelDto.getValue());
    }

    public static final WruDocumentScope z0(WruLicenceDataDto wruLicenceDataDto) {
        String iid = wruLicenceDataDto.getDataHeader().getIid();
        String pesel = wruLicenceDataDto.getDataHeader().getPesel();
        if (pesel == null) {
            pesel = "";
        }
        String str = pesel;
        int tp4 = wruLicenceDataDto.getDataHeader().getTp();
        String ver = wruLicenceDataDto.getDataHeader().getVer();
        long timestamp = wruLicenceDataDto.getDataHeader().getTimestamp();
        i24.u0 u0VarA = i24.u0.INSTANCE.a(wruLicenceDataDto.getDataContainer().getTemplateType());
        String documentName = wruLicenceDataDto.getDataContainer().getDocumentName();
        String documentLogo = wruLicenceDataDto.getDataContainer().getDocumentLogo();
        String additionalDescription = wruLicenceDataDto.getDataContainer().getAdditionalDescription();
        List<WruLicenceDataContainerItemDto> commonAttributes = wruLicenceDataDto.getDataContainer().getCommonAttributes();
        ArrayList arrayList = new ArrayList(pq.v.y(commonAttributes, 10));
        int i15 = 0;
        for (Object obj : commonAttributes) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            arrayList.add(y0((WruLicenceDataContainerItemDto) obj, i15, false));
            i15 = i16;
        }
        List<WruLicenceDataContainerItemDto> additionalAttributes = wruLicenceDataDto.getDataContainer().getAdditionalAttributes();
        int i17 = 0;
        ArrayList arrayList2 = new ArrayList(pq.v.y(additionalAttributes, 10));
        for (Iterator it = additionalAttributes.iterator(); it.hasNext(); it = it) {
            Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                pq.v.x();
            }
            arrayList2.add(y0((WruLicenceDataContainerItemDto) next, i17, true));
            i17 = i18;
        }
        return new WruDocumentScope(iid, str, tp4, ver, timestamp, u0VarA, documentName, documentLogo, additionalDescription, arrayList, arrayList2, wruLicenceDataDto.getDataHeader().getDn());
    }
}
