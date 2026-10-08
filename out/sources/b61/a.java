package b61;

import al0.s0;
import al0.z;
import cl0.BEPassportChildApplicationCountryDictionary;
import cl0.BEPassportChildApplicationOfficeDictionary;
import cl0.BEPassportChildApplicationParentData;
import cl0.PassportChildApplicationGetChildData;
import cl0.d;
import cl0.g0;
import cl0.j0;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fz.b;
import i61.ChildDataApplicationAttachmentData;
import i61.ChildDataResult;
import i61.ChildPassportApplicationDraft;
import i61.ChildPassportApplicationFaceDetectionData;
import i61.ChildPassportApplicationFile;
import i61.ChildPassportApplicationStoredPhotoData;
import i61.DataSplit;
import i61.DataSplitData;
import i61.EnterChildCheckboxes;
import i61.EnterChildValidatedData;
import i61.ParentFormData;
import i61.SummaryCheckBox;
import i61.h;
import i61.l;
import i61.q;
import i61.r;
import i61.t;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildDataApplicationAttachmentDataDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildDataEntryTypeDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationAddPhotoDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationAddressDataDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationChildDataResultDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationContactDetailsDataDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationCorrespondenceAddressDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationDMSTerytDetailDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationDataSplitDataDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationDataSplitDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationDiscountTypeDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationDocumentTypeDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationDraftDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationEnterChildValidatedDataDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationFaceDetectionDataDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationFileDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationOfficeDictionaryDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationParentFormDataDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationPassportOfficePlaceDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationPassportTypeDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationPhoneNumberDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationPickupMethodDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationReasonTypeDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationStoredFileDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationStoredMetadataDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.ChildPassportApplicationWhoAgreesDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.EnterChildCheckboxesDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.FilePickerMetadataDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.GenderDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.PassportChildApplicationCountryDictionaryDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.PassportChildApplicationGetChildDataDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.PassportChildApplicationParentDataDto;
import pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto.SummaryCheckBoxDto;
import pq.v;
import ru3.ContactDetailsData;
import st3.AddressData;
import st3.AddressTerytDetail;
import wx.FilePickerMetadata;
import wx.StoredMetadata;
import wx.k;
import xw.PhoneNumber;
import xw.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¤\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010>\u001a\u00020=*\u00020<¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010B\u001a\u00020A*\u00020@¢\u0006\u0004\bB\u0010C\u001a\u0011\u0010F\u001a\u00020E*\u00020D¢\u0006\u0004\bF\u0010G\u001a\u0011\u0010J\u001a\u00020I*\u00020H¢\u0006\u0004\bJ\u0010K\u001a\u0011\u0010N\u001a\u00020M*\u00020L¢\u0006\u0004\bN\u0010O\u001a\u0011\u0010R\u001a\u00020Q*\u00020P¢\u0006\u0004\bR\u0010S\u001a\u0011\u0010V\u001a\u00020U*\u00020T¢\u0006\u0004\bV\u0010W\u001a\u0011\u0010Z\u001a\u00020Y*\u00020X¢\u0006\u0004\bZ\u0010[\u001a\u0011\u0010^\u001a\u00020]*\u00020\\¢\u0006\u0004\b^\u0010_\u001a\u0011\u0010b\u001a\u00020a*\u00020`¢\u0006\u0004\bb\u0010c\u001a\u0011\u0010f\u001a\u00020e*\u00020d¢\u0006\u0004\bf\u0010g\u001a\u0011\u0010j\u001a\u00020i*\u00020h¢\u0006\u0004\bj\u0010k\u001a\u0011\u0010n\u001a\u00020m*\u00020l¢\u0006\u0004\bn\u0010o\u001a\u0011\u0010r\u001a\u00020q*\u00020p¢\u0006\u0004\br\u0010s\u001a\u0011\u0010v\u001a\u00020u*\u00020t¢\u0006\u0004\bv\u0010w\u001a\u0011\u0010x\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\bx\u0010y\u001a\u0011\u0010z\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\bz\u0010{\u001a\u0011\u0010|\u001a\u00020\b*\u00020\t¢\u0006\u0004\b|\u0010}\u001a\u0011\u0010~\u001a\u00020\f*\u00020\r¢\u0006\u0004\b~\u0010\u007f\u001a\u0014\u0010\u0080\u0001\u001a\u00020\u0010*\u00020\u0011¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0014\u0010\u0082\u0001\u001a\u00020\u0014*\u00020\u0015¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0014\u0010\u0084\u0001\u001a\u00020\u0018*\u00020\u0019¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0014\u0010\u0086\u0001\u001a\u00020 *\u00020!¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0014\u0010\u0088\u0001\u001a\u00020$*\u00020%¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0014\u0010\u008a\u0001\u001a\u00020\u001c*\u00020\u001d¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0014\u0010\u008c\u0001\u001a\u00020(*\u00020)¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0014\u0010\u008e\u0001\u001a\u00020,*\u00020-¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0014\u0010\u0090\u0001\u001a\u000200*\u000201¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0014\u0010\u0092\u0001\u001a\u000204*\u000205¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0014\u0010\u0094\u0001\u001a\u000208*\u000209¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0014\u0010\u0096\u0001\u001a\u00020<*\u00020=¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0014\u0010\u0098\u0001\u001a\u00020@*\u00020A¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0016\u0010\u009a\u0001\u001a\u0004\u0018\u00010D*\u00020E¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0014\u0010\u009c\u0001\u001a\u00020H*\u00020I¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0014\u0010\u009e\u0001\u001a\u00020L*\u00020M¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0014\u0010 \u0001\u001a\u00020P*\u00020Q¢\u0006\u0006\b \u0001\u0010¡\u0001\u001a\u0014\u0010¢\u0001\u001a\u00020T*\u00020U¢\u0006\u0006\b¢\u0001\u0010£\u0001\u001a\u0014\u0010¤\u0001\u001a\u00020X*\u00020Y¢\u0006\u0006\b¤\u0001\u0010¥\u0001\u001a\u0014\u0010¦\u0001\u001a\u00020\\*\u00020]¢\u0006\u0006\b¦\u0001\u0010§\u0001\u001a\u0014\u0010¨\u0001\u001a\u00020`*\u00020a¢\u0006\u0006\b¨\u0001\u0010©\u0001\u001a\u0014\u0010ª\u0001\u001a\u00020d*\u00020e¢\u0006\u0006\bª\u0001\u0010«\u0001\u001a\u0016\u0010¬\u0001\u001a\u0004\u0018\u00010h*\u00020i¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0014\u0010®\u0001\u001a\u00020l*\u00020m¢\u0006\u0006\b®\u0001\u0010¯\u0001\u001a\u0014\u0010°\u0001\u001a\u00020p*\u00020q¢\u0006\u0006\b°\u0001\u0010±\u0001\u001a\u0014\u0010²\u0001\u001a\u00020t*\u00020u¢\u0006\u0006\b²\u0001\u0010³\u0001\u001a\u0016\u0010¶\u0001\u001a\u00030µ\u0001*\u00030´\u0001¢\u0006\u0006\b¶\u0001\u0010·\u0001\u001a\u0016\u0010¸\u0001\u001a\u00030´\u0001*\u00030µ\u0001¢\u0006\u0006\b¸\u0001\u0010¹\u0001\u001a\u0016\u0010¼\u0001\u001a\u00030»\u0001*\u00030º\u0001¢\u0006\u0006\b¼\u0001\u0010½\u0001\u001a\u0016\u0010¾\u0001\u001a\u00030º\u0001*\u00030»\u0001¢\u0006\u0006\b¾\u0001\u0010¿\u0001\u001a\u0016\u0010Â\u0001\u001a\u00030Á\u0001*\u00030À\u0001¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0016\u0010Ä\u0001\u001a\u00030À\u0001*\u00030Á\u0001¢\u0006\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0016\u0010È\u0001\u001a\u00030Ç\u0001*\u00030Æ\u0001¢\u0006\u0006\bÈ\u0001\u0010É\u0001\u001a\u0016\u0010Ê\u0001\u001a\u00030Æ\u0001*\u00030Ç\u0001¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0016\u0010Î\u0001\u001a\u00030Í\u0001*\u00030Ì\u0001¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0016\u0010Ð\u0001\u001a\u00030Ì\u0001*\u00030Í\u0001¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001¨\u0006Ò\u0001"}, d2 = {"Lal0/s0;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportTypeDto;", "a", "(Lal0/s0;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportTypeDto;", "Lcl0/g0;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportOfficePlaceDto;", "f0", "(Lcl0/g0;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportOfficePlaceDto;", "Li61/t;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationWhoAgreesDto;", "k0", "(Li61/t;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationWhoAgreesDto;", "Lcl0/d;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDocumentTypeDto;", "Y", "(Lcl0/d;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDocumentTypeDto;", "Lal0/z;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/GenderDto;", "m0", "(Lal0/z;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/GenderDto;", "Lcl0/r;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationParentDataDto;", "p0", "(Lcl0/r;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationParentDataDto;", "Li61/p;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationParentFormDataDto;", "e0", "(Li61/p;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationParentFormDataDto;", "Lcl0/j0;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildDataEntryTypeDto;", "O", "(Lcl0/j0;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildDataEntryTypeDto;", "Lcl0/k0;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationGetChildDataDto;", "o0", "(Lcl0/k0;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationGetChildDataDto;", "Li61/c;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationChildDataResultDto;", "R", "(Li61/c;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationChildDataResultDto;", "Li61/m;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/EnterChildCheckboxesDto;", "l0", "(Li61/m;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/EnterChildCheckboxesDto;", "Li61/o;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationEnterChildValidatedDataDto;", "a0", "(Li61/o;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationEnterChildValidatedDataDto;", "Lwx/e;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/FilePickerMetadataDto;", "r0", "(Lwx/e;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/FilePickerMetadataDto;", "Lwx/l;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredMetadataDto;", "j0", "(Lwx/l;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredMetadataDto;", "Lwx/k;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto;", "i0", "(Lwx/k;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto;", "Li61/g;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFileDto;", "c0", "(Li61/g;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFileDto;", "Li61/h;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationReasonTypeDto;", "h0", "(Li61/h;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationReasonTypeDto;", "Li61/i;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddPhotoDto;", i.f37086m, "(Li61/i;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddPhotoDto;", "Lcl0/q;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationOfficeDictionaryDto;", "d0", "(Lcl0/q;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationOfficeDictionaryDto;", "Li61/j;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDto;", "W", "(Li61/j;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDto;", "Li61/k;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDataDto;", "V", "(Li61/k;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDataDto;", "Lxw/h;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPhoneNumberDto;", "b", "(Lxw/h;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPhoneNumberDto;", "Lru3/b;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationContactDetailsDataDto;", ip.a.f96137b, "(Lru3/b;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationContactDetailsDataDto;", "Lcl0/o;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationCountryDictionaryDto;", "n0", "(Lcl0/o;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationCountryDictionaryDto;", "Lst3/l;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDMSTerytDetailDto;", "U", "(Lst3/l;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDMSTerytDetailDto;", "Lst3/b;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddressDataDto;", "Q", "(Lst3/b;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddressDataDto;", "Li61/d;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationCorrespondenceAddressDto;", "T", "(Li61/d;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationCorrespondenceAddressDto;", "Li61/r;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPickupMethodDto;", "g0", "(Li61/r;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPickupMethodDto;", "Li61/l;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDiscountTypeDto;", "X", "(Li61/l;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDiscountTypeDto;", "Li61/e;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDraftDto;", "Z", "(Li61/e;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDraftDto;", "d", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportTypeDto;)Lal0/s0;", "i", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPassportOfficePlaceDto;)Lcl0/g0;", ip.a.f96138c, "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationWhoAgreesDto;)Li61/t;", "e", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDocumentTypeDto;)Lcl0/d;", "c", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/GenderDto;)Lal0/z;", "h", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationParentDataDto;)Lcl0/r;", "z", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationParentFormDataDto;)Li61/p;", "k", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationGetChildDataDto;)Lcl0/k0;", "n", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationChildDataResultDto;)Li61/c;", "j", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildDataEntryTypeDto;)Lcl0/j0;", "x", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/EnterChildCheckboxesDto;)Li61/m;", "y", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationEnterChildValidatedDataDto;)Li61/o;", i.f37087n, "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/FilePickerMetadataDto;)Lwx/e;", "J", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredMetadataDto;)Lwx/l;", "I", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto;)Lwx/k;", "r", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFileDto;)Li61/g;", "s", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationReasonTypeDto;)Li61/h;", "t", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddPhotoDto;)Li61/i;", "g", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationOfficeDictionaryDto;)Lcl0/q;", "u", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDto;)Li61/j;", "v", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDataDto;)Li61/k;", "K", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPhoneNumberDto;)Lxw/h;", "E", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationContactDetailsDataDto;)Lru3/b;", "f", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationCountryDictionaryDto;)Lcl0/o;", "G", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDMSTerytDetailDto;)Lst3/l;", "F", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddressDataDto;)Lst3/b;", "o", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationCorrespondenceAddressDto;)Li61/d;", "B", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationPickupMethodDto;)Li61/r;", "w", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDiscountTypeDto;)Li61/l;", "p", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDraftDto;)Li61/e;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/SummaryCheckBoxDto;", "Li61/s;", "C", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/SummaryCheckBoxDto;)Li61/s;", "q0", "(Li61/s;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/SummaryCheckBoxDto;", "Li61/b;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildDataApplicationAttachmentDataDto;", "N", "(Li61/b;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildDataApplicationAttachmentDataDto;", "m", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildDataApplicationAttachmentDataDto;)Li61/b;", "Li61/f;", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFaceDetectionDataDto;", "b0", "(Li61/f;)Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFaceDetectionDataDto;", "q", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFaceDetectionDataDto;)Li61/f;", "Li61/q;", "Ld61/a;", "M", "(Li61/q;)Ld61/a;", "A", "(Ld61/a;)Li61/q;", "Lc61/a;", "Li61/a;", "l", "(Lc61/a;)Li61/a;", i.f37094u, "(Li61/a;)Lc61/a;", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b61.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0410a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f16843c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f16844d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f16845e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f16846f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f16847g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f16848h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f16849i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f16850j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int[] f16851k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int[] f16852l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ int[] f16853m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int[] f16854n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ int[] f16855o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final /* synthetic */ int[] f16856p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ int[] f16857q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final /* synthetic */ int[] f16858r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ int[] f16859s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final /* synthetic */ int[] f16860t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ int[] f16861u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final /* synthetic */ int[] f16862v;

        static {
            int[] iArr = new int[s0.values().length];
            try {
                iArr[s0.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s0.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16841a = iArr;
            int[] iArr2 = new int[g0.values().length];
            try {
                iArr2[g0.POLAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[g0.ABROAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[g0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f16842b = iArr2;
            int[] iArr3 = new int[t.values().length];
            try {
                iArr3[t.PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[t.GUARDIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f16843c = iArr3;
            int[] iArr4 = new int[d.values().length];
            try {
                iArr4[d.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[d.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[d.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f16844d = iArr4;
            int[] iArr5 = new int[z.values().length];
            try {
                iArr5[z.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[z.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[z.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            f16845e = iArr5;
            int[] iArr6 = new int[j0.values().length];
            try {
                iArr6[j0.PICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[j0.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            f16846f = iArr6;
            int[] iArr7 = new int[h.values().length];
            try {
                iArr7[h.MEDICAL_EMERGENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr7[h.OCCUPATIONAL_EMERGENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[h.RETURN_TO_PERMANENT_PLACE_OF_RESIDENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[h.FULFILLING_THE_DUTY_OF_LEARNING_AND_SKILL_DEVELOPMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[h.WAITING_FOR_A_PASSPORT_PREPARED_IN_POLAND.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[h.FUNERAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            f16847g = iArr7;
            int[] iArr8 = new int[r.values().length];
            try {
                iArr8[r.IN_PERSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr8[r.DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            f16848h = iArr8;
            int[] iArr9 = new int[l.values().length];
            try {
                iArr9[l.SCHOOL_AGED_CHILDREN.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr9[l.KDR_OWNERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr9[l.TECHNICAL_ISSUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr9[l.CHILD_TREATED_ABROAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr9[l.TEMPORARY_PASSPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            f16849i = iArr9;
            int[] iArr10 = new int[ChildPassportApplicationPassportTypeDto.values().length];
            try {
                iArr10[ChildPassportApplicationPassportTypeDto.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr10[ChildPassportApplicationPassportTypeDto.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr10[ChildPassportApplicationPassportTypeDto.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr10[ChildPassportApplicationPassportTypeDto.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr10[ChildPassportApplicationPassportTypeDto.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused36) {
            }
            f16850j = iArr10;
            int[] iArr11 = new int[ChildPassportApplicationPassportOfficePlaceDto.values().length];
            try {
                iArr11[ChildPassportApplicationPassportOfficePlaceDto.POLAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr11[ChildPassportApplicationPassportOfficePlaceDto.ABROAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr11[ChildPassportApplicationPassportOfficePlaceDto.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused39) {
            }
            f16851k = iArr11;
            int[] iArr12 = new int[ChildPassportApplicationWhoAgreesDto.values().length];
            try {
                iArr12[ChildPassportApplicationWhoAgreesDto.PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr12[ChildPassportApplicationWhoAgreesDto.GUARDIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            f16852l = iArr12;
            int[] iArr13 = new int[ChildPassportApplicationDocumentTypeDto.values().length];
            try {
                iArr13[ChildPassportApplicationDocumentTypeDto.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr13[ChildPassportApplicationDocumentTypeDto.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr13[ChildPassportApplicationDocumentTypeDto.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            f16853m = iArr13;
            int[] iArr14 = new int[GenderDto.values().length];
            try {
                iArr14[GenderDto.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr14[GenderDto.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused46) {
            }
            f16854n = iArr14;
            int[] iArr15 = new int[ChildDataEntryTypeDto.values().length];
            try {
                iArr15[ChildDataEntryTypeDto.PICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr15[ChildDataEntryTypeDto.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            f16855o = iArr15;
            int[] iArr16 = new int[ChildPassportApplicationStoredFileDto.Type.values().length];
            try {
                iArr16[ChildPassportApplicationStoredFileDto.Type.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr16[ChildPassportApplicationStoredFileDto.Type.Regular.ordinal()] = 2;
            } catch (NoSuchFieldError unused50) {
            }
            f16856p = iArr16;
            int[] iArr17 = new int[ChildPassportApplicationReasonTypeDto.values().length];
            try {
                iArr17[ChildPassportApplicationReasonTypeDto.MEDICAL_EMERGENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr17[ChildPassportApplicationReasonTypeDto.OCCUPATIONAL_EMERGENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr17[ChildPassportApplicationReasonTypeDto.RETURN_TO_PERMANENT_PLACE_OF_RESIDENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr17[ChildPassportApplicationReasonTypeDto.FULFILLING_THE_DUTY_OF_LEARNING_AND_SKILL_DEVELOPMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr17[ChildPassportApplicationReasonTypeDto.WAITING_FOR_A_PASSPORT_PREPARED_IN_POLAND.ordinal()] = 5;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr17[ChildPassportApplicationReasonTypeDto.FUNERAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused56) {
            }
            f16857q = iArr17;
            int[] iArr18 = new int[ChildPassportApplicationPickupMethodDto.values().length];
            try {
                iArr18[ChildPassportApplicationPickupMethodDto.IN_PERSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr18[ChildPassportApplicationPickupMethodDto.DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            f16858r = iArr18;
            int[] iArr19 = new int[ChildPassportApplicationDiscountTypeDto.values().length];
            try {
                iArr19[ChildPassportApplicationDiscountTypeDto.SCHOOL_AGED_CHILDREN.ordinal()] = 1;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr19[ChildPassportApplicationDiscountTypeDto.KDR_OWNERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr19[ChildPassportApplicationDiscountTypeDto.TECHNICAL_ISSUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr19[ChildPassportApplicationDiscountTypeDto.CHILD_TREATED_ABROAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr19[ChildPassportApplicationDiscountTypeDto.TEMPORARY_PASSPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused63) {
            }
            f16859s = iArr19;
            int[] iArr20 = new int[d61.a.values().length];
            try {
                iArr20[d61.a.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr20[d61.a.TRANSFER_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused65) {
            }
            f16860t = iArr20;
            int[] iArr21 = new int[c61.a.values().length];
            try {
                iArr21[c61.a.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr21[c61.a.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr21[c61.a.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr21[c61.a.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused69) {
            }
            f16861u = iArr21;
            int[] iArr22 = new int[i61.a.values().length];
            try {
                iArr22[i61.a.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr22[i61.a.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr22[i61.a.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr22[i61.a.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused73) {
            }
            f16862v = iArr22;
        }
    }

    public static final q A(d61.a aVar) {
        int i15 = C0410a.f16860t[aVar.ordinal()];
        if (i15 == 1) {
            return q.a.f89801a;
        }
        if (i15 == 2) {
            return q.b.f89802a;
        }
        throw new p();
    }

    public static final r B(ChildPassportApplicationPickupMethodDto childPassportApplicationPickupMethodDto) {
        int i15 = C0410a.f16858r[childPassportApplicationPickupMethodDto.ordinal()];
        if (i15 == 1) {
            return r.IN_PERSON;
        }
        if (i15 == 2) {
            return r.DELIVERY;
        }
        throw new p();
    }

    public static final SummaryCheckBox C(SummaryCheckBoxDto summaryCheckBoxDto) {
        return new SummaryCheckBox(summaryCheckBoxDto.getStatementChecked());
    }

    public static final t D(ChildPassportApplicationWhoAgreesDto childPassportApplicationWhoAgreesDto) {
        int i15 = C0410a.f16852l[childPassportApplicationWhoAgreesDto.ordinal()];
        if (i15 == 1) {
            return t.PARENT;
        }
        if (i15 == 2) {
            return t.GUARDIAN;
        }
        throw new p();
    }

    public static final ContactDetailsData E(ChildPassportApplicationContactDetailsDataDto childPassportApplicationContactDetailsDataDto) {
        return new ContactDetailsData(K(childPassportApplicationContactDetailsDataDto.getPhoneNumber()), c0.g(childPassportApplicationContactDetailsDataDto.getEmailAddress()));
    }

    public static final AddressData F(ChildPassportApplicationAddressDataDto childPassportApplicationAddressDataDto) {
        AddressTerytDetail addressTerytDetailG = G(childPassportApplicationAddressDataDto.getVoivodeship());
        AddressTerytDetail addressTerytDetailG2 = G(childPassportApplicationAddressDataDto.getCounty());
        AddressTerytDetail addressTerytDetailG3 = G(childPassportApplicationAddressDataDto.getCommunity());
        AddressTerytDetail addressTerytDetailG4 = G(childPassportApplicationAddressDataDto.getCity());
        String postalCode = childPassportApplicationAddressDataDto.getPostalCode();
        ChildPassportApplicationDMSTerytDetailDto streetName = childPassportApplicationAddressDataDto.getStreetName();
        return new AddressData(addressTerytDetailG, addressTerytDetailG2, addressTerytDetailG3, addressTerytDetailG4, postalCode, streetName != null ? G(streetName) : null, childPassportApplicationAddressDataDto.getHouseNumber(), childPassportApplicationAddressDataDto.getApartmentNumber());
    }

    public static final AddressTerytDetail G(ChildPassportApplicationDMSTerytDetailDto childPassportApplicationDMSTerytDetailDto) {
        return new AddressTerytDetail(AddressTerytDetail.a.a(childPassportApplicationDMSTerytDetailDto.getId()), childPassportApplicationDMSTerytDetailDto.getName(), childPassportApplicationDMSTerytDetailDto.getDescription(), null);
    }

    public static final FilePickerMetadata H(FilePickerMetadataDto filePickerMetadataDto) {
        return new FilePickerMetadata(filePickerMetadataDto.getName(), filePickerMetadataDto.getExtension(), filePickerMetadataDto.getSizeInBytes(), filePickerMetadataDto.getUri());
    }

    public static final k I(ChildPassportApplicationStoredFileDto childPassportApplicationStoredFileDto) {
        int i15 = C0410a.f16856p[childPassportApplicationStoredFileDto.getType().ordinal()];
        if (i15 == 1) {
            return new k.Image(J(childPassportApplicationStoredFileDto.getMetadata()));
        }
        if (i15 == 2) {
            return new k.Regular(J(childPassportApplicationStoredFileDto.getMetadata()));
        }
        throw new p();
    }

    public static final StoredMetadata J(ChildPassportApplicationStoredMetadataDto childPassportApplicationStoredMetadataDto) {
        return new StoredMetadata(childPassportApplicationStoredMetadataDto.getName(), childPassportApplicationStoredMetadataDto.getExtension(), childPassportApplicationStoredMetadataDto.getSizeInBytes());
    }

    public static final PhoneNumber K(ChildPassportApplicationPhoneNumberDto childPassportApplicationPhoneNumberDto) {
        return new PhoneNumber(PhoneNumber.c.c(c0.g(childPassportApplicationPhoneNumberDto.getPrefix())), PhoneNumber.b.c(c0.g(childPassportApplicationPhoneNumberDto.getNumber())), null);
    }

    public static final c61.a L(i61.a aVar) {
        int i15 = C0410a.f16862v[aVar.ordinal()];
        if (i15 == 1) {
            return c61.a.NOT_STARTED;
        }
        if (i15 == 2) {
            return c61.a.IN_PROGRESS;
        }
        if (i15 == 3) {
            return c61.a.FAILURE;
        }
        if (i15 == 4) {
            return c61.a.SUCCESS;
        }
        throw new p();
    }

    public static final d61.a M(q qVar) {
        if (fr.t.c(qVar, q.a.f89801a)) {
            return d61.a.ONLINE;
        }
        if (fr.t.c(qVar, q.b.f89802a)) {
            return d61.a.TRANSFER_CONFIRMATION;
        }
        throw new p();
    }

    public static final ChildDataApplicationAttachmentDataDto N(ChildDataApplicationAttachmentData childDataApplicationAttachmentData) {
        ArrayList arrayList;
        List<ChildPassportApplicationFile> listA = childDataApplicationAttachmentData.a();
        if (listA != null) {
            List<ChildPassportApplicationFile> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c0((ChildPassportApplicationFile) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new ChildDataApplicationAttachmentDataDto(arrayList, childDataApplicationAttachmentData.getIsStatementChecked());
    }

    public static final ChildDataEntryTypeDto O(j0 j0Var) {
        int i15 = C0410a.f16846f[j0Var.ordinal()];
        if (i15 == 1) {
            return ChildDataEntryTypeDto.PICKER;
        }
        if (i15 == 2) {
            return ChildDataEntryTypeDto.MANUAL;
        }
        throw new p();
    }

    public static final ChildPassportApplicationAddPhotoDto P(ChildPassportApplicationStoredPhotoData childPassportApplicationStoredPhotoData) {
        return new ChildPassportApplicationAddPhotoDto(i0(childPassportApplicationStoredPhotoData.getFile()), r0(childPassportApplicationStoredPhotoData.getPickedFileMetadata()), childPassportApplicationStoredPhotoData.getIsFaceCoveringPhotoOptionChecked(), childPassportApplicationStoredPhotoData.getIsPhotoWithGlassesOptionChecked());
    }

    public static final ChildPassportApplicationAddressDataDto Q(AddressData addressData) {
        ChildPassportApplicationDMSTerytDetailDto childPassportApplicationDMSTerytDetailDtoU = U(addressData.getProvince());
        ChildPassportApplicationDMSTerytDetailDto childPassportApplicationDMSTerytDetailDtoU2 = U(addressData.getCounty());
        ChildPassportApplicationDMSTerytDetailDto childPassportApplicationDMSTerytDetailDtoU3 = U(addressData.getCommunity());
        ChildPassportApplicationDMSTerytDetailDto childPassportApplicationDMSTerytDetailDtoU4 = U(addressData.getCity());
        AddressTerytDetail street = addressData.getStreet();
        return new ChildPassportApplicationAddressDataDto(childPassportApplicationDMSTerytDetailDtoU4, childPassportApplicationDMSTerytDetailDtoU3, childPassportApplicationDMSTerytDetailDtoU2, addressData.getBuildingNumber(), addressData.getPostalCode(), childPassportApplicationDMSTerytDetailDtoU, addressData.getApartmentNumber(), street != null ? U(street) : null);
    }

    public static final ChildPassportApplicationChildDataResultDto R(ChildDataResult childDataResult) {
        PassportChildApplicationGetChildData childData = childDataResult.getChildData();
        PassportChildApplicationGetChildDataDto passportChildApplicationGetChildDataDtoO0 = childData != null ? o0(childData) : null;
        b0 birthPlaceInput = childDataResult.getBirthPlaceInput();
        return new ChildPassportApplicationChildDataResultDto(passportChildApplicationGetChildDataDtoO0, birthPlaceInput != null ? c0.e(birthPlaceInput) : null, childDataResult.getCitizenshipCheckBoxChecked());
    }

    public static final ChildPassportApplicationContactDetailsDataDto S(ContactDetailsData contactDetailsData) {
        return new ChildPassportApplicationContactDetailsDataDto(b(contactDetailsData.getPhoneNumber()), c0.e(contactDetailsData.getEmailAddress()));
    }

    public static final ChildPassportApplicationCorrespondenceAddressDto T(i61.d dVar) {
        if (dVar instanceof i61.d.Domestic) {
            return new ChildPassportApplicationCorrespondenceAddressDto(Q(((i61.d.Domestic) dVar).getAddressData()), null, 2, null);
        }
        if (dVar instanceof i61.d.Foreign) {
            return new ChildPassportApplicationCorrespondenceAddressDto(null, ((i61.d.Foreign) dVar).getAddress(), 1, null);
        }
        throw new p();
    }

    public static final ChildPassportApplicationDMSTerytDetailDto U(AddressTerytDetail addressTerytDetail) {
        return new ChildPassportApplicationDMSTerytDetailDto(addressTerytDetail.getId(), addressTerytDetail.getName(), addressTerytDetail.getDescription());
    }

    public static final ChildPassportApplicationDataSplitDataDto V(DataSplitData dataSplitData) {
        DataSplit names = dataSplitData.getNames();
        ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDtoW = names != null ? W(names) : null;
        DataSplit surname = dataSplitData.getSurname();
        ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDtoW2 = surname != null ? W(surname) : null;
        DataSplit birthPlace = dataSplitData.getBirthPlace();
        return new ChildPassportApplicationDataSplitDataDto(childPassportApplicationDataSplitDtoW, childPassportApplicationDataSplitDtoW2, birthPlace != null ? W(birthPlace) : null);
    }

    public static final ChildPassportApplicationDataSplitDto W(DataSplit dataSplit) {
        return new ChildPassportApplicationDataSplitDto(c0.e(dataSplit.getFirstLine()), c0.e(dataSplit.getSecondLine()));
    }

    public static final ChildPassportApplicationDiscountTypeDto X(l lVar) {
        int i15 = C0410a.f16849i[lVar.ordinal()];
        if (i15 == 1) {
            return ChildPassportApplicationDiscountTypeDto.SCHOOL_AGED_CHILDREN;
        }
        if (i15 == 2) {
            return ChildPassportApplicationDiscountTypeDto.KDR_OWNERS;
        }
        if (i15 == 3) {
            return ChildPassportApplicationDiscountTypeDto.TECHNICAL_ISSUE;
        }
        if (i15 == 4) {
            return ChildPassportApplicationDiscountTypeDto.CHILD_TREATED_ABROAD;
        }
        if (i15 == 5) {
            return ChildPassportApplicationDiscountTypeDto.TEMPORARY_PASSPORT;
        }
        throw new p();
    }

    public static final ChildPassportApplicationDocumentTypeDto Y(d dVar) {
        int i15 = C0410a.f16844d[dVar.ordinal()];
        if (i15 == 1) {
            return ChildPassportApplicationDocumentTypeDto.ID_CARD;
        }
        if (i15 == 2) {
            return ChildPassportApplicationDocumentTypeDto.PASSPORT;
        }
        if (i15 == 3) {
            return ChildPassportApplicationDocumentTypeDto.OTHER;
        }
        throw new p();
    }

    public static final ChildPassportApplicationDraftDto Z(ChildPassportApplicationDraft childPassportApplicationDraft) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        List<String> listH = childPassportApplicationDraft.h();
        s0 passportType = childPassportApplicationDraft.getPassportType();
        ChildPassportApplicationPassportTypeDto childPassportApplicationPassportTypeDtoA = passportType != null ? a(passportType) : null;
        g0 officePlace = childPassportApplicationDraft.getOfficePlace();
        ChildPassportApplicationPassportOfficePlaceDto childPassportApplicationPassportOfficePlaceDtoF0 = officePlace != null ? f0(officePlace) : null;
        t whoAgrees = childPassportApplicationDraft.getWhoAgrees();
        ChildPassportApplicationWhoAgreesDto childPassportApplicationWhoAgreesDtoK0 = whoAgrees != null ? k0(whoAgrees) : null;
        String pickedChildId = childPassportApplicationDraft.getPickedChildId();
        ParentFormData parentFormData = childPassportApplicationDraft.getParentFormData();
        ChildPassportApplicationParentFormDataDto childPassportApplicationParentFormDataDtoE0 = parentFormData != null ? e0(parentFormData) : null;
        ChildDataResult childData = childPassportApplicationDraft.getChildData();
        ChildPassportApplicationChildDataResultDto childPassportApplicationChildDataResultDtoR = childData != null ? R(childData) : null;
        EnterChildValidatedData enterChildValidatedData = childPassportApplicationDraft.getEnterChildValidatedData();
        ChildPassportApplicationEnterChildValidatedDataDto childPassportApplicationEnterChildValidatedDataDtoA0 = enterChildValidatedData != null ? a0(enterChildValidatedData) : null;
        EnterChildCheckboxes enterChildCheckboxes = childPassportApplicationDraft.getEnterChildCheckboxes();
        EnterChildCheckboxesDto enterChildCheckboxesDtoL0 = enterChildCheckboxes != null ? l0(enterChildCheckboxes) : null;
        List<ChildPassportApplicationFile> listE = childPassportApplicationDraft.E();
        if (listE != null) {
            List<ChildPassportApplicationFile> list = listE;
            ArrayList arrayList10 = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList10.add(c0((ChildPassportApplicationFile) it.next()));
            }
            arrayList = arrayList10;
        } else {
            arrayList = null;
        }
        h reasonType = childPassportApplicationDraft.getReasonType();
        ChildPassportApplicationReasonTypeDto childPassportApplicationReasonTypeDtoH0 = reasonType != null ? h0(reasonType) : null;
        ChildPassportApplicationStoredPhotoData photoData = childPassportApplicationDraft.getPhotoData();
        ChildPassportApplicationAddPhotoDto childPassportApplicationAddPhotoDtoP = photoData != null ? P(photoData) : null;
        List<ChildPassportApplicationFile> listX = childPassportApplicationDraft.x();
        if (listX != null) {
            List<ChildPassportApplicationFile> list2 = listX;
            arrayList2 = new ArrayList(v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(c0((ChildPassportApplicationFile) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<ChildPassportApplicationFile> listW = childPassportApplicationDraft.w();
        if (listW != null) {
            List<ChildPassportApplicationFile> list3 = listW;
            arrayList3 = new ArrayList(v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(c0((ChildPassportApplicationFile) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        BEPassportChildApplicationOfficeDictionary institutionData = childPassportApplicationDraft.getInstitutionData();
        ChildPassportApplicationOfficeDictionaryDto childPassportApplicationOfficeDictionaryDtoD0 = institutionData != null ? d0(institutionData) : null;
        DataSplitData dataSplitData = childPassportApplicationDraft.getDataSplitData();
        ChildPassportApplicationDataSplitDataDto childPassportApplicationDataSplitDataDtoV = dataSplitData != null ? V(dataSplitData) : null;
        List<ChildPassportApplicationFile> listB = childPassportApplicationDraft.B();
        ChildPassportApplicationOfficeDictionaryDto childPassportApplicationOfficeDictionaryDto = childPassportApplicationOfficeDictionaryDtoD0;
        if (listB != null) {
            List<ChildPassportApplicationFile> list4 = listB;
            arrayList4 = new ArrayList(v.y(list4, 10));
            Iterator<T> it6 = list4.iterator();
            while (it6.hasNext()) {
                arrayList4.add(c0((ChildPassportApplicationFile) it6.next()));
            }
        } else {
            arrayList4 = null;
        }
        List<ChildPassportApplicationFile> listR = childPassportApplicationDraft.r();
        if (listR != null) {
            List<ChildPassportApplicationFile> list5 = listR;
            arrayList5 = new ArrayList(v.y(list5, 10));
            Iterator<T> it7 = list5.iterator();
            while (it7.hasNext()) {
                arrayList5.add(c0((ChildPassportApplicationFile) it7.next()));
            }
        } else {
            arrayList5 = null;
        }
        ChildDataApplicationAttachmentData oldMoneyTransferAttachmentsData = childPassportApplicationDraft.getOldMoneyTransferAttachmentsData();
        ChildDataApplicationAttachmentDataDto childDataApplicationAttachmentDataDtoN = oldMoneyTransferAttachmentsData != null ? N(oldMoneyTransferAttachmentsData) : null;
        List<ChildPassportApplicationFile> listO = childPassportApplicationDraft.o();
        if (listO != null) {
            List<ChildPassportApplicationFile> list6 = listO;
            arrayList6 = new ArrayList(v.y(list6, 10));
            Iterator<T> it8 = list6.iterator();
            while (it8.hasNext()) {
                arrayList6.add(c0((ChildPassportApplicationFile) it8.next()));
            }
        } else {
            arrayList6 = null;
        }
        ContactDetailsData contactDetails = childPassportApplicationDraft.getContactDetails();
        ChildPassportApplicationContactDetailsDataDto childPassportApplicationContactDetailsDataDtoS = contactDetails != null ? S(contactDetails) : null;
        BEPassportChildApplicationCountryDictionary correspondenceCountryData = childPassportApplicationDraft.getCorrespondenceCountryData();
        PassportChildApplicationCountryDictionaryDto passportChildApplicationCountryDictionaryDtoN0 = correspondenceCountryData != null ? n0(correspondenceCountryData) : null;
        i61.d correspondenceAddress = childPassportApplicationDraft.getCorrespondenceAddress();
        ChildPassportApplicationCorrespondenceAddressDto childPassportApplicationCorrespondenceAddressDtoT = correspondenceAddress != null ? T(correspondenceAddress) : null;
        r pickupMethod = childPassportApplicationDraft.getPickupMethod();
        ChildPassportApplicationPickupMethodDto childPassportApplicationPickupMethodDtoG0 = pickupMethod != null ? g0(pickupMethod) : null;
        List<ChildPassportApplicationFile> listA = childPassportApplicationDraft.a();
        ArrayList arrayList11 = arrayList6;
        if (listA != null) {
            List<ChildPassportApplicationFile> list7 = listA;
            arrayList7 = new ArrayList(v.y(list7, 10));
            Iterator<T> it9 = list7.iterator();
            while (it9.hasNext()) {
                arrayList7.add(c0((ChildPassportApplicationFile) it9.next()));
            }
        } else {
            arrayList7 = null;
        }
        List<ChildPassportApplicationFile> listN = childPassportApplicationDraft.n();
        if (listN != null) {
            List<ChildPassportApplicationFile> list8 = listN;
            arrayList8 = new ArrayList(v.y(list8, 10));
            Iterator<T> it10 = list8.iterator();
            while (it10.hasNext()) {
                arrayList8.add(c0((ChildPassportApplicationFile) it10.next()));
            }
        } else {
            arrayList8 = null;
        }
        List<ChildPassportApplicationFile> listD = childPassportApplicationDraft.D();
        if (listD != null) {
            List<ChildPassportApplicationFile> list9 = listD;
            arrayList9 = new ArrayList(v.y(list9, 10));
            Iterator<T> it11 = list9.iterator();
            while (it11.hasNext()) {
                arrayList9.add(c0((ChildPassportApplicationFile) it11.next()));
            }
        } else {
            arrayList9 = null;
        }
        l discountTypeData = childPassportApplicationDraft.getDiscountTypeData();
        ChildPassportApplicationDiscountTypeDto childPassportApplicationDiscountTypeDtoX = discountTypeData != null ? X(discountTypeData) : null;
        SummaryCheckBox summaryCheckBox = childPassportApplicationDraft.getSummaryCheckBox();
        SummaryCheckBoxDto summaryCheckBoxDtoQ0 = summaryCheckBox != null ? q0(summaryCheckBox) : null;
        ChildPassportApplicationFaceDetectionData faceDetectionData = childPassportApplicationDraft.getFaceDetectionData();
        ChildPassportApplicationFaceDetectionDataDto childPassportApplicationFaceDetectionDataDtoB0 = faceDetectionData != null ? b0(faceDetectionData) : null;
        q paymentType = childPassportApplicationDraft.getPaymentType();
        return new ChildPassportApplicationDraftDto(listH, childPassportApplicationPassportTypeDtoA, childPassportApplicationPassportOfficePlaceDtoF0, childPassportApplicationWhoAgreesDtoK0, pickedChildId, childPassportApplicationParentFormDataDtoE0, childPassportApplicationChildDataResultDtoR, childPassportApplicationEnterChildValidatedDataDtoA0, enterChildCheckboxesDtoL0, arrayList, childPassportApplicationReasonTypeDtoH0, childPassportApplicationAddPhotoDtoP, arrayList2, arrayList3, childPassportApplicationOfficeDictionaryDto, childPassportApplicationDataSplitDataDtoV, arrayList4, arrayList5, childDataApplicationAttachmentDataDtoN, arrayList11, childPassportApplicationContactDetailsDataDtoS, passportChildApplicationCountryDictionaryDtoN0, childPassportApplicationCorrespondenceAddressDtoT, childPassportApplicationPickupMethodDtoG0, arrayList7, arrayList8, arrayList9, childPassportApplicationDiscountTypeDtoX, summaryCheckBoxDtoQ0, childPassportApplicationFaceDetectionDataDtoB0, paymentType != null ? M(paymentType) : null, childPassportApplicationDraft.getApplicationId());
    }

    public static final ChildPassportApplicationPassportTypeDto a(s0 s0Var) {
        int i15 = C0410a.f16841a[s0Var.ordinal()];
        if (i15 == 1) {
            return ChildPassportApplicationPassportTypeDto.BIOMETRIC;
        }
        if (i15 == 2) {
            return ChildPassportApplicationPassportTypeDto.TEMPORARY;
        }
        if (i15 == 3) {
            return ChildPassportApplicationPassportTypeDto.BUSINESS;
        }
        if (i15 == 4) {
            return ChildPassportApplicationPassportTypeDto.DIPLOMATIC;
        }
        if (i15 == 5) {
            return ChildPassportApplicationPassportTypeDto.UNKNOWN;
        }
        throw new p();
    }

    public static final ChildPassportApplicationEnterChildValidatedDataDto a0(EnterChildValidatedData enterChildValidatedData) {
        ChildDataEntryTypeDto childDataEntryTypeDtoO = O(enterChildValidatedData.getEntryType());
        b0 firstName = enterChildValidatedData.getFirstName();
        String strE = firstName != null ? c0.e(firstName) : null;
        b0 secondName = enterChildValidatedData.getSecondName();
        String strE2 = secondName != null ? c0.e(secondName) : null;
        b0 otherName = enterChildValidatedData.getOtherName();
        String strE3 = otherName != null ? c0.e(otherName) : null;
        b0 lastName = enterChildValidatedData.getLastName();
        String strE4 = lastName != null ? c0.e(lastName) : null;
        String strE5 = c0.e(enterChildValidatedData.getPesel());
        b.LocalDate birthDate = enterChildValidatedData.getBirthDate();
        return new ChildPassportApplicationEnterChildValidatedDataDto(childDataEntryTypeDtoO, strE, strE2, strE3, strE4, strE5, birthDate != null ? birthDate.getDate() : null, c0.e(enterChildValidatedData.getBirthPlace()));
    }

    public static final ChildPassportApplicationPhoneNumberDto b(PhoneNumber phoneNumber) {
        return new ChildPassportApplicationPhoneNumberDto(c0.e(phoneNumber.g()), c0.e(phoneNumber.h()));
    }

    public static final ChildPassportApplicationFaceDetectionDataDto b0(ChildPassportApplicationFaceDetectionData childPassportApplicationFaceDetectionData) {
        return new ChildPassportApplicationFaceDetectionDataDto(childPassportApplicationFaceDetectionData.getIdentityPhotoEnabled());
    }

    public static final z c(GenderDto genderDto) {
        int i15 = C0410a.f16854n[genderDto.ordinal()];
        if (i15 == 1) {
            return z.MALE;
        }
        if (i15 == 2) {
            return z.FEMALE;
        }
        throw new p();
    }

    public static final ChildPassportApplicationFileDto c0(ChildPassportApplicationFile childPassportApplicationFile) {
        return new ChildPassportApplicationFileDto(r0(childPassportApplicationFile.getPickedFileMetadata()), i0(childPassportApplicationFile.getStoredFile()));
    }

    public static final s0 d(ChildPassportApplicationPassportTypeDto childPassportApplicationPassportTypeDto) {
        int i15 = C0410a.f16850j[childPassportApplicationPassportTypeDto.ordinal()];
        if (i15 == 1) {
            return s0.BIOMETRIC;
        }
        if (i15 == 2) {
            return s0.TEMPORARY;
        }
        if (i15 == 3) {
            return s0.BUSINESS;
        }
        if (i15 == 4) {
            return s0.DIPLOMATIC;
        }
        if (i15 == 5) {
            return s0.UNKNOWN;
        }
        throw new p();
    }

    public static final ChildPassportApplicationOfficeDictionaryDto d0(BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary) {
        return new ChildPassportApplicationOfficeDictionaryDto(bEPassportChildApplicationOfficeDictionary.getOfficeName(), bEPassportChildApplicationOfficeDictionary.getOnlinePaymentSupported(), bEPassportChildApplicationOfficeDictionary.getUnitCode(), bEPassportChildApplicationOfficeDictionary.getUnitName());
    }

    public static final d e(ChildPassportApplicationDocumentTypeDto childPassportApplicationDocumentTypeDto) {
        int i15 = C0410a.f16853m[childPassportApplicationDocumentTypeDto.ordinal()];
        if (i15 == 1) {
            return d.ID_CARD;
        }
        if (i15 == 2) {
            return d.PASSPORT;
        }
        if (i15 == 3) {
            return d.OTHER;
        }
        throw new p();
    }

    public static final ChildPassportApplicationParentFormDataDto e0(ParentFormData parentFormData) {
        PassportChildApplicationParentDataDto passportChildApplicationParentDataDtoP0 = p0(parentFormData.getParentData());
        String strE = c0.e(parentFormData.getBirthPlaceFieldValue());
        String strE2 = c0.e(parentFormData.getIdCardSeriesAndNumberFieldValue());
        String strE3 = c0.e(parentFormData.getIdCardNameFieldValue());
        d documentType = parentFormData.getDocumentType();
        return new ChildPassportApplicationParentFormDataDto(passportChildApplicationParentDataDtoP0, strE, strE2, strE3, documentType != null ? Y(documentType) : null);
    }

    public static final BEPassportChildApplicationCountryDictionary f(PassportChildApplicationCountryDictionaryDto passportChildApplicationCountryDictionaryDto) {
        return new BEPassportChildApplicationCountryDictionary(passportChildApplicationCountryDictionaryDto.getIsoCode(), passportChildApplicationCountryDictionaryDto.getName());
    }

    public static final ChildPassportApplicationPassportOfficePlaceDto f0(g0 g0Var) {
        int i15 = C0410a.f16842b[g0Var.ordinal()];
        if (i15 == 1) {
            return ChildPassportApplicationPassportOfficePlaceDto.POLAND;
        }
        if (i15 == 2) {
            return ChildPassportApplicationPassportOfficePlaceDto.ABROAD;
        }
        if (i15 == 3) {
            return ChildPassportApplicationPassportOfficePlaceDto.UNKNOWN;
        }
        throw new p();
    }

    public static final BEPassportChildApplicationOfficeDictionary g(ChildPassportApplicationOfficeDictionaryDto childPassportApplicationOfficeDictionaryDto) {
        return new BEPassportChildApplicationOfficeDictionary(childPassportApplicationOfficeDictionaryDto.getOfficeName(), childPassportApplicationOfficeDictionaryDto.getOnlinePaymentSupported(), childPassportApplicationOfficeDictionaryDto.getUnitCode(), childPassportApplicationOfficeDictionaryDto.getUnitName());
    }

    public static final ChildPassportApplicationPickupMethodDto g0(r rVar) {
        int i15 = C0410a.f16848h[rVar.ordinal()];
        if (i15 == 1) {
            return ChildPassportApplicationPickupMethodDto.IN_PERSON;
        }
        if (i15 == 2) {
            return ChildPassportApplicationPickupMethodDto.DELIVERY;
        }
        throw new p();
    }

    public static final BEPassportChildApplicationParentData h(PassportChildApplicationParentDataDto passportChildApplicationParentDataDto) {
        b.LocalDate localDate = new b.LocalDate(passportChildApplicationParentDataDto.getDateOfBirth());
        b0 b0VarG = c0.g(passportChildApplicationParentDataDto.getFirstName());
        b0 b0VarG2 = c0.g(passportChildApplicationParentDataDto.getPesel());
        z zVarC = c(passportChildApplicationParentDataDto.getGender());
        b0 b0VarG3 = c0.g(passportChildApplicationParentDataDto.getSurname());
        String idCardSeriesAndNumber = passportChildApplicationParentDataDto.getIdCardSeriesAndNumber();
        b0 b0VarG4 = idCardSeriesAndNumber != null ? c0.g(idCardSeriesAndNumber) : null;
        String placeOfBirth = passportChildApplicationParentDataDto.getPlaceOfBirth();
        b0 b0VarG5 = placeOfBirth != null ? c0.g(placeOfBirth) : null;
        String secondName = passportChildApplicationParentDataDto.getSecondName();
        return new BEPassportChildApplicationParentData(c0.g(passportChildApplicationParentDataDto.getChecksum()), localDate, b0VarG, b0VarG2, zVarC, b0VarG3, b0VarG4, b0VarG5, secondName != null ? c0.g(secondName) : null);
    }

    public static final ChildPassportApplicationReasonTypeDto h0(h hVar) {
        switch (C0410a.f16847g[hVar.ordinal()]) {
            case 1:
                return ChildPassportApplicationReasonTypeDto.MEDICAL_EMERGENCY;
            case 2:
                return ChildPassportApplicationReasonTypeDto.OCCUPATIONAL_EMERGENCY;
            case 3:
                return ChildPassportApplicationReasonTypeDto.RETURN_TO_PERMANENT_PLACE_OF_RESIDENCE;
            case 4:
                return ChildPassportApplicationReasonTypeDto.FULFILLING_THE_DUTY_OF_LEARNING_AND_SKILL_DEVELOPMENT;
            case 5:
                return ChildPassportApplicationReasonTypeDto.WAITING_FOR_A_PASSPORT_PREPARED_IN_POLAND;
            case 6:
                return ChildPassportApplicationReasonTypeDto.FUNERAL;
            default:
                throw new p();
        }
    }

    public static final g0 i(ChildPassportApplicationPassportOfficePlaceDto childPassportApplicationPassportOfficePlaceDto) {
        int i15 = C0410a.f16851k[childPassportApplicationPassportOfficePlaceDto.ordinal()];
        if (i15 == 1) {
            return g0.POLAND;
        }
        if (i15 == 2) {
            return g0.ABROAD;
        }
        if (i15 == 3) {
            return g0.UNKNOWN;
        }
        throw new p();
    }

    public static final ChildPassportApplicationStoredFileDto i0(k kVar) {
        ChildPassportApplicationStoredFileDto.Type type;
        if (kVar instanceof k.Image) {
            type = ChildPassportApplicationStoredFileDto.Type.Image;
        } else {
            if (!(kVar instanceof k.Regular)) {
                throw new p();
            }
            type = ChildPassportApplicationStoredFileDto.Type.Regular;
        }
        return new ChildPassportApplicationStoredFileDto(type, j0(kVar.getMetadata()));
    }

    public static final j0 j(ChildDataEntryTypeDto childDataEntryTypeDto) {
        int i15 = C0410a.f16855o[childDataEntryTypeDto.ordinal()];
        if (i15 == 1) {
            return j0.PICKER;
        }
        if (i15 == 2) {
            return j0.MANUAL;
        }
        throw new p();
    }

    public static final ChildPassportApplicationStoredMetadataDto j0(StoredMetadata storedMetadata) {
        return new ChildPassportApplicationStoredMetadataDto(storedMetadata.getName(), storedMetadata.getExtension(), storedMetadata.getSizeInBytes());
    }

    public static final PassportChildApplicationGetChildData k(PassportChildApplicationGetChildDataDto passportChildApplicationGetChildDataDto) {
        j0 j0VarJ = j(passportChildApplicationGetChildDataDto.getEntryType());
        b.LocalDate localDate = new b.LocalDate(passportChildApplicationGetChildDataDto.getDateOfBirth());
        String firstName = passportChildApplicationGetChildDataDto.getFirstName();
        b0 b0VarG = firstName != null ? c0.g(firstName) : null;
        b0 b0VarC = g.c(c0.g(passportChildApplicationGetChildDataDto.getPesel()));
        String surname = passportChildApplicationGetChildDataDto.getSurname();
        b0 b0VarG2 = surname != null ? c0.g(surname) : null;
        String anotherNames = passportChildApplicationGetChildDataDto.getAnotherNames();
        b0 b0VarG3 = anotherNames != null ? c0.g(anotherNames) : null;
        String placeOfBirth = passportChildApplicationGetChildDataDto.getPlaceOfBirth();
        b0 b0VarG4 = placeOfBirth != null ? c0.g(placeOfBirth) : null;
        String secondName = passportChildApplicationGetChildDataDto.getSecondName();
        return new PassportChildApplicationGetChildData(c0.g(passportChildApplicationGetChildDataDto.getChecksum()), j0VarJ, b0VarG, secondName != null ? c0.g(secondName) : null, b0VarG3, b0VarG2, b0VarC, localDate, b0VarG4, null);
    }

    public static final ChildPassportApplicationWhoAgreesDto k0(t tVar) {
        int i15 = C0410a.f16843c[tVar.ordinal()];
        if (i15 == 1) {
            return ChildPassportApplicationWhoAgreesDto.PARENT;
        }
        if (i15 == 2) {
            return ChildPassportApplicationWhoAgreesDto.GUARDIAN;
        }
        throw new p();
    }

    public static final i61.a l(c61.a aVar) {
        int i15 = C0410a.f16861u[aVar.ordinal()];
        if (i15 == 1) {
            return i61.a.NOT_STARTED;
        }
        if (i15 == 2) {
            return i61.a.IN_PROGRESS;
        }
        if (i15 == 3) {
            return i61.a.FAILURE;
        }
        if (i15 == 4) {
            return i61.a.SUCCESS;
        }
        throw new p();
    }

    public static final EnterChildCheckboxesDto l0(EnterChildCheckboxes enterChildCheckboxes) {
        return new EnterChildCheckboxesDto(enterChildCheckboxes.getNoNameSwitchChecked(), enterChildCheckboxes.getNoLastNameSwitchChecked(), enterChildCheckboxes.getCitizenshipCheckBoxChecked());
    }

    public static final ChildDataApplicationAttachmentData m(ChildDataApplicationAttachmentDataDto childDataApplicationAttachmentDataDto) {
        ArrayList arrayList;
        List<ChildPassportApplicationFileDto> childPassportApplicationFiles = childDataApplicationAttachmentDataDto.getChildPassportApplicationFiles();
        if (childPassportApplicationFiles != null) {
            List<ChildPassportApplicationFileDto> list = childPassportApplicationFiles;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(r((ChildPassportApplicationFileDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new ChildDataApplicationAttachmentData(arrayList, childDataApplicationAttachmentDataDto.isStatementChecked());
    }

    public static final GenderDto m0(z zVar) {
        int i15 = C0410a.f16845e[zVar.ordinal()];
        if (i15 == 1) {
            return GenderDto.MALE;
        }
        if (i15 == 2) {
            return GenderDto.FEMALE;
        }
        if (i15 == 3) {
            return GenderDto.MALE;
        }
        throw new p();
    }

    public static final ChildDataResult n(ChildPassportApplicationChildDataResultDto childPassportApplicationChildDataResultDto) {
        PassportChildApplicationGetChildDataDto childData = childPassportApplicationChildDataResultDto.getChildData();
        PassportChildApplicationGetChildData passportChildApplicationGetChildDataK = childData != null ? k(childData) : null;
        String birthPlaceInput = childPassportApplicationChildDataResultDto.getBirthPlaceInput();
        return new ChildDataResult(passportChildApplicationGetChildDataK, birthPlaceInput != null ? c0.g(birthPlaceInput) : null, childPassportApplicationChildDataResultDto.getCitizenshipCheckBoxChecked());
    }

    public static final PassportChildApplicationCountryDictionaryDto n0(BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary) {
        return new PassportChildApplicationCountryDictionaryDto(bEPassportChildApplicationCountryDictionary.getIsoCode(), bEPassportChildApplicationCountryDictionary.getName());
    }

    public static final i61.d o(ChildPassportApplicationCorrespondenceAddressDto childPassportApplicationCorrespondenceAddressDto) {
        if (childPassportApplicationCorrespondenceAddressDto.getAddressData() != null) {
            ChildPassportApplicationAddressDataDto addressData = childPassportApplicationCorrespondenceAddressDto.getAddressData();
            if (addressData != null) {
                return new i61.d.Domestic(F(addressData));
            }
            return null;
        }
        String address = childPassportApplicationCorrespondenceAddressDto.getAddress();
        if (address != null) {
            return new i61.d.Foreign(address);
        }
        return null;
    }

    public static final PassportChildApplicationGetChildDataDto o0(PassportChildApplicationGetChildData passportChildApplicationGetChildData) {
        ChildDataEntryTypeDto childDataEntryTypeDtoO = O(passportChildApplicationGetChildData.getEntryType());
        LocalDate date = passportChildApplicationGetChildData.getBirthDate().getDate();
        b0 firstName = passportChildApplicationGetChildData.getFirstName();
        String strE = firstName != null ? c0.e(firstName) : null;
        String strE2 = c0.e(passportChildApplicationGetChildData.getPesel());
        b0 lastName = passportChildApplicationGetChildData.getLastName();
        String strE3 = lastName != null ? c0.e(lastName) : null;
        b0 otherName = passportChildApplicationGetChildData.getOtherName();
        String strE4 = otherName != null ? c0.e(otherName) : null;
        b0 birthPlace = passportChildApplicationGetChildData.getBirthPlace();
        String strE5 = birthPlace != null ? c0.e(birthPlace) : null;
        b0 secondName = passportChildApplicationGetChildData.getSecondName();
        return new PassportChildApplicationGetChildDataDto(childDataEntryTypeDtoO, date, strE, strE2, strE3, strE4, strE5, secondName != null ? c0.e(secondName) : null, c0.e(passportChildApplicationGetChildData.getChecksum()));
    }

    public static final ChildPassportApplicationDraft p(ChildPassportApplicationDraftDto childPassportApplicationDraftDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        List<String> destinationsBackstack = childPassportApplicationDraftDto.getDestinationsBackstack();
        ChildPassportApplicationPassportTypeDto passportType = childPassportApplicationDraftDto.getPassportType();
        s0 s0VarD = passportType != null ? d(passportType) : null;
        ChildPassportApplicationPassportOfficePlaceDto passportOfficePlace = childPassportApplicationDraftDto.getPassportOfficePlace();
        g0 g0VarI = passportOfficePlace != null ? i(passportOfficePlace) : null;
        ChildPassportApplicationWhoAgreesDto whoAgrees = childPassportApplicationDraftDto.getWhoAgrees();
        t tVarD = whoAgrees != null ? D(whoAgrees) : null;
        String pickedChildId = childPassportApplicationDraftDto.getPickedChildId();
        ChildPassportApplicationParentFormDataDto parentFormData = childPassportApplicationDraftDto.getParentFormData();
        ParentFormData parentFormDataZ = parentFormData != null ? z(parentFormData) : null;
        ChildPassportApplicationChildDataResultDto childData = childPassportApplicationDraftDto.getChildData();
        ChildDataResult childDataResultN = childData != null ? n(childData) : null;
        ChildPassportApplicationEnterChildValidatedDataDto enterChild = childPassportApplicationDraftDto.getEnterChild();
        EnterChildValidatedData enterChildValidatedDataY = enterChild != null ? y(enterChild) : null;
        EnterChildCheckboxesDto enterChildCheckboxes = childPassportApplicationDraftDto.getEnterChildCheckboxes();
        EnterChildCheckboxes enterChildCheckboxesX = enterChildCheckboxes != null ? x(enterChildCheckboxes) : null;
        List<ChildPassportApplicationFileDto> temporaryPassportReasonAttachments = childPassportApplicationDraftDto.getTemporaryPassportReasonAttachments();
        if (temporaryPassportReasonAttachments != null) {
            List<ChildPassportApplicationFileDto> list = temporaryPassportReasonAttachments;
            ArrayList arrayList10 = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList10.add(r((ChildPassportApplicationFileDto) it.next()));
            }
            arrayList = arrayList10;
        } else {
            arrayList = null;
        }
        ChildPassportApplicationReasonTypeDto reasonType = childPassportApplicationDraftDto.getReasonType();
        h hVarS = reasonType != null ? s(reasonType) : null;
        ChildPassportApplicationAddPhotoDto photo = childPassportApplicationDraftDto.getPhoto();
        ChildPassportApplicationStoredPhotoData childPassportApplicationStoredPhotoDataT = photo != null ? t(photo) : null;
        List<ChildPassportApplicationFileDto> photoGlassesAttachment = childPassportApplicationDraftDto.getPhotoGlassesAttachment();
        if (photoGlassesAttachment != null) {
            List<ChildPassportApplicationFileDto> list2 = photoGlassesAttachment;
            arrayList2 = new ArrayList(v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(r((ChildPassportApplicationFileDto) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<ChildPassportApplicationFileDto> photoFaceCoverAttachment = childPassportApplicationDraftDto.getPhotoFaceCoverAttachment();
        if (photoFaceCoverAttachment != null) {
            List<ChildPassportApplicationFileDto> list3 = photoFaceCoverAttachment;
            arrayList3 = new ArrayList(v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(r((ChildPassportApplicationFileDto) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        ChildPassportApplicationOfficeDictionaryDto institutionData = childPassportApplicationDraftDto.getInstitutionData();
        BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionaryG = institutionData != null ? g(institutionData) : null;
        ChildPassportApplicationDataSplitDataDto dataSplitData = childPassportApplicationDraftDto.getDataSplitData();
        DataSplitData dataSplitDataV = dataSplitData != null ? v(dataSplitData) : null;
        List<ChildPassportApplicationFileDto> signedConsentAttachmentsData = childPassportApplicationDraftDto.getSignedConsentAttachmentsData();
        BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary = bEPassportChildApplicationOfficeDictionaryG;
        if (signedConsentAttachmentsData != null) {
            List<ChildPassportApplicationFileDto> list4 = signedConsentAttachmentsData;
            arrayList4 = new ArrayList(v.y(list4, 10));
            Iterator<T> it6 = list4.iterator();
            while (it6.hasNext()) {
                arrayList4.add(r((ChildPassportApplicationFileDto) it6.next()));
            }
        } else {
            arrayList4 = null;
        }
        List<ChildPassportApplicationFileDto> otherParentUnableToConsentAttachmentsData = childPassportApplicationDraftDto.getOtherParentUnableToConsentAttachmentsData();
        if (otherParentUnableToConsentAttachmentsData != null) {
            List<ChildPassportApplicationFileDto> list5 = otherParentUnableToConsentAttachmentsData;
            arrayList5 = new ArrayList(v.y(list5, 10));
            Iterator<T> it7 = list5.iterator();
            while (it7.hasNext()) {
                arrayList5.add(r((ChildPassportApplicationFileDto) it7.next()));
            }
        } else {
            arrayList5 = null;
        }
        ChildDataApplicationAttachmentDataDto oldMoneyTransferAttachmentsData = childPassportApplicationDraftDto.getOldMoneyTransferAttachmentsData();
        ChildDataApplicationAttachmentData childDataApplicationAttachmentDataM = oldMoneyTransferAttachmentsData != null ? m(oldMoneyTransferAttachmentsData) : null;
        List<ChildPassportApplicationFileDto> newMoneyTransferAttachmentsData = childPassportApplicationDraftDto.getNewMoneyTransferAttachmentsData();
        if (newMoneyTransferAttachmentsData != null) {
            List<ChildPassportApplicationFileDto> list6 = newMoneyTransferAttachmentsData;
            arrayList6 = new ArrayList(v.y(list6, 10));
            Iterator<T> it8 = list6.iterator();
            while (it8.hasNext()) {
                arrayList6.add(r((ChildPassportApplicationFileDto) it8.next()));
            }
        } else {
            arrayList6 = null;
        }
        ChildPassportApplicationContactDetailsDataDto contactDetails = childPassportApplicationDraftDto.getContactDetails();
        ContactDetailsData contactDetailsDataE = contactDetails != null ? E(contactDetails) : null;
        PassportChildApplicationCountryDictionaryDto correspondenceCountry = childPassportApplicationDraftDto.getCorrespondenceCountry();
        BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionaryF = correspondenceCountry != null ? f(correspondenceCountry) : null;
        ChildPassportApplicationCorrespondenceAddressDto correspondenceAddress = childPassportApplicationDraftDto.getCorrespondenceAddress();
        i61.d dVarO = correspondenceAddress != null ? o(correspondenceAddress) : null;
        ChildPassportApplicationPickupMethodDto pickupMethod = childPassportApplicationDraftDto.getPickupMethod();
        r rVarB = pickupMethod != null ? B(pickupMethod) : null;
        List<ChildPassportApplicationFileDto> abroadTreatmentAttachmentsData = childPassportApplicationDraftDto.getAbroadTreatmentAttachmentsData();
        ArrayList arrayList11 = arrayList6;
        if (abroadTreatmentAttachmentsData != null) {
            List<ChildPassportApplicationFileDto> list7 = abroadTreatmentAttachmentsData;
            arrayList7 = new ArrayList(v.y(list7, 10));
            Iterator<T> it9 = list7.iterator();
            while (it9.hasNext()) {
                arrayList7.add(r((ChildPassportApplicationFileDto) it9.next()));
            }
        } else {
            arrayList7 = null;
        }
        List<ChildPassportApplicationFileDto> kdrAttachmentsData = childPassportApplicationDraftDto.getKdrAttachmentsData();
        if (kdrAttachmentsData != null) {
            List<ChildPassportApplicationFileDto> list8 = kdrAttachmentsData;
            arrayList8 = new ArrayList(v.y(list8, 10));
            Iterator<T> it10 = list8.iterator();
            while (it10.hasNext()) {
                arrayList8.add(r((ChildPassportApplicationFileDto) it10.next()));
            }
        } else {
            arrayList8 = null;
        }
        List<ChildPassportApplicationFileDto> technicalIssueAttachmentsData = childPassportApplicationDraftDto.getTechnicalIssueAttachmentsData();
        if (technicalIssueAttachmentsData != null) {
            List<ChildPassportApplicationFileDto> list9 = technicalIssueAttachmentsData;
            arrayList9 = new ArrayList(v.y(list9, 10));
            Iterator<T> it11 = list9.iterator();
            while (it11.hasNext()) {
                arrayList9.add(r((ChildPassportApplicationFileDto) it11.next()));
            }
        } else {
            arrayList9 = null;
        }
        ChildPassportApplicationDiscountTypeDto discountTypeData = childPassportApplicationDraftDto.getDiscountTypeData();
        l lVarW = discountTypeData != null ? w(discountTypeData) : null;
        SummaryCheckBoxDto summaryCheckbox = childPassportApplicationDraftDto.getSummaryCheckbox();
        SummaryCheckBox summaryCheckBoxC = summaryCheckbox != null ? C(summaryCheckbox) : null;
        ChildPassportApplicationFaceDetectionDataDto faceDetectionData = childPassportApplicationDraftDto.getFaceDetectionData();
        ChildPassportApplicationFaceDetectionData childPassportApplicationFaceDetectionDataQ = faceDetectionData != null ? q(faceDetectionData) : null;
        d61.a paymentType = childPassportApplicationDraftDto.getPaymentType();
        return new ChildPassportApplicationDraft(destinationsBackstack, s0VarD, g0VarI, tVarD, pickedChildId, parentFormDataZ, childDataResultN, enterChildValidatedDataY, enterChildCheckboxesX, arrayList, hVarS, childPassportApplicationStoredPhotoDataT, arrayList2, arrayList3, bEPassportChildApplicationOfficeDictionary, dataSplitDataV, arrayList4, arrayList5, childDataApplicationAttachmentDataM, arrayList11, contactDetailsDataE, bEPassportChildApplicationCountryDictionaryF, dVarO, rVarB, arrayList7, arrayList8, arrayList9, lVarW, summaryCheckBoxC, childPassportApplicationFaceDetectionDataQ, paymentType != null ? A(paymentType) : null, childPassportApplicationDraftDto.getApplicationId());
    }

    public static final PassportChildApplicationParentDataDto p0(BEPassportChildApplicationParentData bEPassportChildApplicationParentData) {
        LocalDate date = bEPassportChildApplicationParentData.getDateOfBirth().getDate();
        String strE = c0.e(bEPassportChildApplicationParentData.getFirstName());
        String strE2 = c0.e(bEPassportChildApplicationParentData.getPesel());
        GenderDto genderDtoM0 = m0(bEPassportChildApplicationParentData.getGender());
        String strE3 = c0.e(bEPassportChildApplicationParentData.getSurname());
        b0 idCardSeriesAndNumber = bEPassportChildApplicationParentData.getIdCardSeriesAndNumber();
        String strE4 = idCardSeriesAndNumber != null ? c0.e(idCardSeriesAndNumber) : null;
        b0 placeOfBirth = bEPassportChildApplicationParentData.getPlaceOfBirth();
        String strE5 = placeOfBirth != null ? c0.e(placeOfBirth) : null;
        b0 secondName = bEPassportChildApplicationParentData.getSecondName();
        return new PassportChildApplicationParentDataDto(date, strE, strE2, genderDtoM0, strE3, strE4, strE5, secondName != null ? c0.e(secondName) : null, c0.e(bEPassportChildApplicationParentData.getChecksum()));
    }

    public static final ChildPassportApplicationFaceDetectionData q(ChildPassportApplicationFaceDetectionDataDto childPassportApplicationFaceDetectionDataDto) {
        return new ChildPassportApplicationFaceDetectionData(childPassportApplicationFaceDetectionDataDto.getIdentityPhotoEnabled());
    }

    public static final SummaryCheckBoxDto q0(SummaryCheckBox summaryCheckBox) {
        return new SummaryCheckBoxDto(summaryCheckBox.getStatementChecked());
    }

    public static final ChildPassportApplicationFile r(ChildPassportApplicationFileDto childPassportApplicationFileDto) {
        return new ChildPassportApplicationFile(H(childPassportApplicationFileDto.getPickedFileMetadata()), I(childPassportApplicationFileDto.getStoredFile()));
    }

    public static final FilePickerMetadataDto r0(FilePickerMetadata filePickerMetadata) {
        return new FilePickerMetadataDto(filePickerMetadata.getName(), filePickerMetadata.getExtension(), filePickerMetadata.getSizeInBytes(), filePickerMetadata.getUri());
    }

    public static final h s(ChildPassportApplicationReasonTypeDto childPassportApplicationReasonTypeDto) {
        switch (C0410a.f16857q[childPassportApplicationReasonTypeDto.ordinal()]) {
            case 1:
                return h.MEDICAL_EMERGENCY;
            case 2:
                return h.OCCUPATIONAL_EMERGENCY;
            case 3:
                return h.RETURN_TO_PERMANENT_PLACE_OF_RESIDENCE;
            case 4:
                return h.FULFILLING_THE_DUTY_OF_LEARNING_AND_SKILL_DEVELOPMENT;
            case 5:
                return h.WAITING_FOR_A_PASSPORT_PREPARED_IN_POLAND;
            case 6:
                return h.FUNERAL;
            default:
                throw new p();
        }
    }

    public static final ChildPassportApplicationStoredPhotoData t(ChildPassportApplicationAddPhotoDto childPassportApplicationAddPhotoDto) {
        k kVarI = I(childPassportApplicationAddPhotoDto.getFile());
        if (kVarI instanceof k.Image) {
            return new ChildPassportApplicationStoredPhotoData(kVarI, H(childPassportApplicationAddPhotoDto.getPickedFileMetadata()), childPassportApplicationAddPhotoDto.isFaceCoveringPhotoOptionChecked(), childPassportApplicationAddPhotoDto.isPhotoWithGlassesOptionChecked());
        }
        if (kVarI instanceof k.Regular) {
            return null;
        }
        throw new p();
    }

    public static final DataSplit u(ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDto) {
        return new DataSplit(c0.g(childPassportApplicationDataSplitDto.getFirstLine()), c0.g(childPassportApplicationDataSplitDto.getSecondLine()));
    }

    public static final DataSplitData v(ChildPassportApplicationDataSplitDataDto childPassportApplicationDataSplitDataDto) {
        ChildPassportApplicationDataSplitDto names = childPassportApplicationDataSplitDataDto.getNames();
        DataSplit dataSplitU = names != null ? u(names) : null;
        ChildPassportApplicationDataSplitDto surname = childPassportApplicationDataSplitDataDto.getSurname();
        DataSplit dataSplitU2 = surname != null ? u(surname) : null;
        ChildPassportApplicationDataSplitDto birthPlace = childPassportApplicationDataSplitDataDto.getBirthPlace();
        return new DataSplitData(dataSplitU, dataSplitU2, birthPlace != null ? u(birthPlace) : null);
    }

    public static final l w(ChildPassportApplicationDiscountTypeDto childPassportApplicationDiscountTypeDto) {
        int i15 = C0410a.f16859s[childPassportApplicationDiscountTypeDto.ordinal()];
        if (i15 == 1) {
            return l.SCHOOL_AGED_CHILDREN;
        }
        if (i15 == 2) {
            return l.KDR_OWNERS;
        }
        if (i15 == 3) {
            return l.TECHNICAL_ISSUE;
        }
        if (i15 == 4) {
            return l.CHILD_TREATED_ABROAD;
        }
        if (i15 == 5) {
            return l.TEMPORARY_PASSPORT;
        }
        throw new p();
    }

    public static final EnterChildCheckboxes x(EnterChildCheckboxesDto enterChildCheckboxesDto) {
        return new EnterChildCheckboxes(enterChildCheckboxesDto.getNoNameSwitchChecked(), enterChildCheckboxesDto.getNoLastNameSwitchChecked(), enterChildCheckboxesDto.getCitizenshipCheckBoxChecked());
    }

    public static final EnterChildValidatedData y(ChildPassportApplicationEnterChildValidatedDataDto childPassportApplicationEnterChildValidatedDataDto) {
        j0 j0VarJ = j(childPassportApplicationEnterChildValidatedDataDto.getEntryType());
        String firstName = childPassportApplicationEnterChildValidatedDataDto.getFirstName();
        b0 b0VarG = firstName != null ? c0.g(firstName) : null;
        String secondName = childPassportApplicationEnterChildValidatedDataDto.getSecondName();
        b0 b0VarG2 = secondName != null ? c0.g(secondName) : null;
        String otherName = childPassportApplicationEnterChildValidatedDataDto.getOtherName();
        b0 b0VarG3 = otherName != null ? c0.g(otherName) : null;
        String lastName = childPassportApplicationEnterChildValidatedDataDto.getLastName();
        b0 b0VarG4 = lastName != null ? c0.g(lastName) : null;
        b0 b0VarC = g.c(c0.g(childPassportApplicationEnterChildValidatedDataDto.getPesel()));
        LocalDate birthDate = childPassportApplicationEnterChildValidatedDataDto.getBirthDate();
        return new EnterChildValidatedData(j0VarJ, b0VarG, b0VarG2, b0VarG3, b0VarG4, b0VarC, birthDate != null ? new b.LocalDate(birthDate) : null, c0.g(childPassportApplicationEnterChildValidatedDataDto.getBirthPlace()), null);
    }

    public static final ParentFormData z(ChildPassportApplicationParentFormDataDto childPassportApplicationParentFormDataDto) {
        BEPassportChildApplicationParentData bEPassportChildApplicationParentDataH = h(childPassportApplicationParentFormDataDto.getParentData());
        b0 b0VarG = c0.g(childPassportApplicationParentFormDataDto.getBirthPlaceFieldValue());
        b0 b0VarG2 = c0.g(childPassportApplicationParentFormDataDto.getIdCardSeriesAndNumberFieldValue());
        b0 b0VarG3 = c0.g(childPassportApplicationParentFormDataDto.getIdCardNameFieldValue());
        ChildPassportApplicationDocumentTypeDto documentType = childPassportApplicationParentFormDataDto.getDocumentType();
        return new ParentFormData(bEPassportChildApplicationParentDataH, b0VarG, b0VarG2, b0VarG3, documentType != null ? e(documentType) : null);
    }
}
