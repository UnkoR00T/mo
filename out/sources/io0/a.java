package io0;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import eo0.AdditionalServiceActivationDates;
import eo0.AddressData;
import eo0.AgreementData;
import eo0.BEAdditionalInformationUrl;
import eo0.BEDictionaryAdditionalInformation;
import eo0.CountryDictionary;
import eo0.DeliveryMessageDetails;
import eo0.DeliveryMessageDetailsAttachment;
import eo0.DeliveryMessageDetailsEvidence;
import eo0.Directory;
import eo0.DirectoryResponse;
import eo0.DraftDetails;
import eo0.EdeliveryDraftMessageResponse;
import eo0.EmptyState;
import eo0.EpuapApplicationType;
import eo0.FileDto;
import eo0.ForwardDetails;
import eo0.OAuthConfiguration;
import eo0.OwnerAddress;
import eo0.Recipient;
import eo0.RecipientAddress;
import eo0.RecipientInfo;
import eo0.RecipientResult;
import eo0.SearchAddressResult;
import eo0.SendEdeliveryDraftMessageResponse;
import eo0.UrlData;
import eo0.WelcomeTextData;
import eo0.b1;
import eo0.e;
import eo0.g0;
import eo0.j;
import eo0.p0;
import eo0.r;
import eo0.r0;
import eo0.t;
import eo0.u0;
import eo0.y;
import fo0.DeliveryMessageAddress;
import fo0.MessageLabel;
import fo0.Status;
import fo0.f;
import iy.c0;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo0.AdditionalInformationResponseDto;
import jo0.AdditionalInformationUrlDtoDto;
import jo0.AddressDtoDto;
import jo0.AgreementsContentDtoDto;
import jo0.AgreementsResponseDto;
import jo0.ApplicationTypeDictionaryDto;
import jo0.ApplicationTypeLabelDtoDto;
import jo0.BaeSearchAdditionalServiceOwDtoDto;
import jo0.BaeSearchDataDtoDto;
import jo0.BaeSearchDtoDto;
import jo0.BaeSearchResponseDto;
import jo0.CountriesDictionaryDtoDto;
import jo0.CountryDictionaryDtoDto;
import jo0.DeleteEdeliveryMessagesRequestDto;
import jo0.DeliveryAddressDtoDto;
import jo0.DeliveryMessageAddressDataDtoDto;
import jo0.DeliveryMessageDetailsAttachmentDtoDto;
import jo0.DeliveryMessageDetailsDtoDto;
import jo0.DeliveryMessageDtoDto;
import jo0.DeliveryStatusDtoDto;
import jo0.DictionaryAdditionalInformationDtoDto;
import jo0.DirectoriesResponseDto;
import jo0.DirectoryDtoDto;
import jo0.EdeliveryDraftMessageRequestDto;
import jo0.EdeliveryDraftMessageResponseDto;
import jo0.EmptyStateDtoDto;
import jo0.EmptyStateUrlDtoDto;
import jo0.ForwardDetailsDtoDto;
import jo0.LabelDtoDto;
import jo0.MessageEvidenceDtoDto;
import jo0.MessagesResponseDto;
import jo0.OfficialIdDto;
import jo0.OrganizationAddressDtoDto;
import jo0.OrganizationDtoDto;
import jo0.OrganizationWarningDtoDto;
import jo0.OwnerAddressResponseDto;
import jo0.ReceiptTextDtoDto;
import jo0.RecipientEdaDtoDto;
import jo0.SendEdeliveryDraftMessageResponseDto;
import jo0.SendEdeliveryMessageAddressDataDtoDto;
import jo0.WebViewSettingsDtoDto;
import jo0.WelcomeTextDtoDto;
import jo0.a1;
import jo0.b2;
import jo0.c;
import jo0.f1;
import jo0.g;
import jo0.h;
import jo0.h0;
import jo0.k;
import jo0.m1;
import jo0.o1;
import jo0.q1;
import jo0.w0;
import jo0.y0;
import jo0.z0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import wx.DomainFile;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000À\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\u0002*\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u0004\u0018\u00010!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0001*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0013\u00106\u001a\u000205*\u000204H\u0002¢\u0006\u0004\b6\u00107\u001a\u0013\u0010:\u001a\u000209*\u000208H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0013\u0010>\u001a\u00020=*\u00020<H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0013\u0010B\u001a\u00020A*\u00020@H\u0002¢\u0006\u0004\bB\u0010C\u001a\u0011\u0010F\u001a\u00020E*\u00020D¢\u0006\u0004\bF\u0010G\u001a\u0011\u0010J\u001a\u00020I*\u00020H¢\u0006\u0004\bJ\u0010K\u001a\u0011\u0010N\u001a\u00020M*\u00020L¢\u0006\u0004\bN\u0010O\u001a\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u0001*\u00020P¢\u0006\u0004\bR\u0010S\u001a\u0011\u0010V\u001a\u00020U*\u00020T¢\u0006\u0004\bV\u0010W\u001a\u0013\u0010Z\u001a\u00020Y*\u00020XH\u0002¢\u0006\u0004\bZ\u0010[\u001a\u0013\u0010^\u001a\u00020]*\u00020\\H\u0002¢\u0006\u0004\b^\u0010_\u001a\u0013\u0010b\u001a\u00020a*\u00020`H\u0002¢\u0006\u0004\bb\u0010c\u001a\u0013\u0010f\u001a\u00020e*\u00020dH\u0002¢\u0006\u0004\bf\u0010g\u001a\u001f\u0010i\u001a\u00020Q*\u00020h2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bi\u0010j\u001a\u0011\u0010m\u001a\u00020l*\u00020k¢\u0006\u0004\bm\u0010n\u001a\u0011\u0010q\u001a\u00020p*\u00020o¢\u0006\u0004\bq\u0010r\u001a\u0011\u0010u\u001a\u00020t*\u00020s¢\u0006\u0004\bu\u0010v\u001a\u0011\u0010y\u001a\u00020x*\u00020w¢\u0006\u0004\by\u0010z\u001a\u0011\u0010}\u001a\u00020|*\u00020{¢\u0006\u0004\b}\u0010~\u001a\u0017\u0010\u0081\u0001\u001a\u00030\u0080\u0001*\u0004\u0018\u00010\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u0001*\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u001c\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u0001*\u00030\u0087\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0016\u0010\u008d\u0001\u001a\u00030\u008c\u0001*\u00030\u008b\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0016\u0010\u0091\u0001\u001a\u00030\u0090\u0001*\u00030\u008f\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u0001*\u00030\u0093\u0001H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0016\u0010\u0099\u0001\u001a\u00030\u0098\u0001*\u00030\u0097\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u001c\u0010\u009d\u0001\u001a\t\u0012\u0005\u0012\u00030\u009c\u00010\u0001*\u00030\u009b\u0001¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0016\u0010¡\u0001\u001a\u00030 \u0001*\u00030\u009f\u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001\u001a\u0018\u0010¥\u0001\u001a\u00030¤\u0001*\u00030£\u0001H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001\u001a\u0018\u0010©\u0001\u001a\u00030¨\u0001*\u00030§\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001\u001a\u001c\u0010\u00ad\u0001\u001a\u00030¬\u0001*\t\u0012\u0005\u0012\u00030«\u00010\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0016\u0010±\u0001\u001a\u00030°\u0001*\u00030¯\u0001¢\u0006\u0006\b±\u0001\u0010²\u0001\u001a\u0018\u0010µ\u0001\u001a\u00030´\u0001*\u00030³\u0001H\u0002¢\u0006\u0006\bµ\u0001\u0010¶\u0001\u001a$\u0010¸\u0001\u001a\t\u0012\u0005\u0012\u00030·\u00010\u0001*\t\u0012\u0005\u0012\u00030 \u00010\u0001H\u0002¢\u0006\u0006\b¸\u0001\u0010¹\u0001\u001a\u0016\u0010¼\u0001\u001a\u00030»\u0001*\u00030º\u0001¢\u0006\u0006\b¼\u0001\u0010½\u0001\u001a\u0016\u0010À\u0001\u001a\u00030¿\u0001*\u00030¾\u0001¢\u0006\u0006\bÀ\u0001\u0010Á\u0001¨\u0006Â\u0001"}, d2 = {"Ljo0/s;", "", "Leo0/n0;", i.f37086m, "(Ljo0/s;)Ljava/util/List;", "Ljo0/p;", "Ljo0/n1;", "recipientInfo", "", "nextPageId", "x", "(Ljo0/p;Ljo0/n1;Ljava/lang/String;)Leo0/n0;", "Ljo0/e;", "Leo0/t0;", "A", "(Ljo0/e;)Leo0/t0;", "Leo0/m0;", "w", "(Ljo0/n1;)Leo0/m0;", "Ljo0/b2;", "message", "Leo0/b1;", "F", "(Ljo0/b2;Ljava/lang/String;)Leo0/b1;", "Ljo0/o;", "Leo0/a;", "b", "(Ljo0/o;)Leo0/a;", "Ljo0/q1;", "Leo0/u0;", "B", "(Ljo0/q1;)Leo0/u0;", "Ljo0/c1;", "Leo0/r0;", "z", "(Ljo0/c1;)Leo0/r0;", "Ljo0/b;", "Leo0/h;", "N", "(Ljo0/b;)Ljava/util/List;", "Ljo0/c;", "Leo0/f;", "g", "(Ljo0/c;)Leo0/f;", "Ljo0/d;", "Leo0/g;", "h", "(Ljo0/d;)Leo0/g;", "Ljo0/j1;", "Leo0/j0;", "t", "(Ljo0/j1;)Leo0/j0;", "Ljo0/y;", "Leo0/b;", "c", "(Ljo0/y;)Leo0/b;", "Ljo0/h;", "Leo0/c;", "d", "(Ljo0/h;)Leo0/c;", "Ljo0/n0;", "Leo0/z;", "q", "(Ljo0/n0;)Leo0/z;", "Ljo0/g;", "Leo0/p;", "l", "(Ljo0/g;)Leo0/p;", "Leo0/d0;", "Lwx/a;", ip.a.f96137b, "(Leo0/d0;)Lwx/a;", "Ljo0/f0;", "Leo0/s;", "n", "(Ljo0/f0;)Leo0/s;", "Ljo0/g0;", "Leo0/q;", "m", "(Ljo0/g0;)Leo0/q;", "Ljo0/b1;", "Lfo0/c;", "R", "(Ljo0/b1;)Ljava/util/List;", "Ljo0/b0;", "Leo0/m;", "i", "(Ljo0/b0;)Leo0/m;", "Ljo0/a0;", "Leo0/n;", "j", "(Ljo0/a0;)Leo0/n;", "Ljo0/x0;", "Leo0/o;", "k", "(Ljo0/x0;)Leo0/o;", "Ljo0/o0;", "Leo0/a1;", "E", "(Ljo0/o0;)Leo0/a1;", "Ljo0/h0;", "Leo0/t;", "o", "(Ljo0/h0;)Leo0/t;", "Ljo0/c0;", i.f37087n, "(Ljo0/c0;Ljava/lang/String;)Lfo0/c;", "Ljo0/l1;", "Lfo0/h;", i.f37094u, "(Ljo0/l1;)Lfo0/h;", "Ljo0/a1;", "Lfo0/g;", "K", "(Ljo0/a1;)Lfo0/g;", "Ljo0/w0;", "Lfo0/f;", "J", "(Ljo0/w0;)Lfo0/f;", "Ljo0/d0;", "Lfo0/i;", "M", "(Ljo0/d0;)Lfo0/i;", "Ljo0/z0;", "Lfo0/a;", "G", "(Ljo0/z0;)Lfo0/a;", "Ljo0/y0;", "Leo0/y0;", ip.a.f96138c, "(Ljo0/y0;)Leo0/y0;", "Ljo0/z;", "Lfo0/d;", "I", "(Ljo0/z;)Lfo0/d;", "Ljo0/l;", "Leo0/a0;", "O", "(Ljo0/l;)Ljava/util/List;", "Ljo0/k;", "Leo0/a0$a;", "r", "(Ljo0/k;)Leo0/a0$a;", "Ljo0/j;", "Leo0/e;", "f", "(Ljo0/j;)Leo0/e;", "Ljo0/i;", "Leo0/d;", "e", "(Ljo0/i;)Leo0/d;", "Ljo0/c2;", "Leo0/h0;", "s", "(Ljo0/c2;)Leo0/h0;", "Ljo0/u;", "Leo0/l;", "Q", "(Ljo0/u;)Ljava/util/List;", "Ljo0/e1;", "Leo0/k0;", "u", "(Ljo0/e1;)Leo0/k0;", "Ljo0/f1;", "Leo0/p0;", "y", "(Ljo0/f1;)Leo0/p0;", "Ljo0/d1;", "Leo0/l0;", "v", "(Ljo0/d1;)Leo0/l0;", "Leo0/g0;", "Ljo0/x;", "a", "(Ljava/util/List;)Ljo0/x;", "Leo0/v;", "Ljo0/l0;", "V", "(Leo0/v;)Ljo0/l0;", "Leo0/f0;", "Ljo0/s0;", "W", "(Leo0/f0;)Ljo0/s0;", "Ljo0/t1;", "U", "(Ljava/util/List;)Ljava/util/List;", "Ljo0/s1;", "Leo0/x0;", "C", "(Ljo0/s1;)Leo0/x0;", "Ljo0/m0;", "Leo0/w;", "p", "(Ljo0/m0;)Leo0/w;", "electronicdeliveryservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: io0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2245a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f96015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f96016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f96017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f96018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f96019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f96020g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f96021h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f96022i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f96023j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int[] f96024k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int[] f96025l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ int[] f96026m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int[] f96027n;

        static {
            int[] iArr = new int[b2.values().length];
            try {
                iArr[b2.NOT_BLOCK_WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b2.BLOCK_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b2.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f96014a = iArr;
            int[] iArr2 = new int[q1.values().length];
            try {
                iArr2[q1.CORRESPONDENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[q1.HEADQUARTERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[q1.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f96015b = iArr2;
            int[] iArr3 = new int[o1.values().length];
            try {
                iArr3[o1.PESEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[o1.REGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[o1.KRS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[o1.NIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[o1.UE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[o1.KPP_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[o1.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            f96016c = iArr3;
            int[] iArr4 = new int[c.values().length];
            try {
                iArr4[c.RECIPIENT_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[c.MESSAGE_TYPE_MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[c.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            f96017d = iArr4;
            int[] iArr5 = new int[h.values().length];
            try {
                iArr5[h.E_PUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[h.E_PUAP_AND_E_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[h.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            f96018e = iArr5;
            int[] iArr6 = new int[g.values().length];
            try {
                iArr6[g.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[g.RESERVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[g.CLOSED_RECOVERABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[g.CLOSED_UNRECOVERABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[g.STRUCK_OFF.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[g.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused25) {
            }
            f96019f = iArr6;
            int[] iArr7 = new int[h0.values().length];
            try {
                iArr7[h0.TRASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr7[h0.INBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr7[h0.SENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr7[h0.DRAFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[h0.CUSTOM_DEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr7[h0.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[h0.OUTBOX.ordinal()] = 7;
            } catch (NoSuchFieldError unused32) {
            }
            f96020g = iArr7;
            int[] iArr8 = new int[m1.values().length];
            try {
                iArr8[m1.INFORMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr8[m1.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr8[m1.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            f96021h = iArr8;
            int[] iArr9 = new int[a1.values().length];
            try {
                iArr9[a1.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr9[a1.EVIDENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr9[a1.STUB.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr9[a1.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused39) {
            }
            f96022i = iArr9;
            int[] iArr10 = new int[w0.values().length];
            try {
                iArr10[w0.INBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr10[w0.DRAFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr10[w0.SENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr10[w0.TRASH.ordinal()] = 4;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr10[w0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused44) {
            }
            f96023j = iArr10;
            int[] iArr11 = new int[z0.values().length];
            try {
                iArr11[z0.VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr11[z0.COMMISSIONED.ordinal()] = 2;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr11[z0.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr11[z0.TRANSMITTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr11[z0.SENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr11[z0.PENDING.ordinal()] = 6;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr11[z0.DELIVERED.ordinal()] = 7;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr11[z0.UNDELIVERED.ordinal()] = 8;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr11[z0.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused53) {
            }
            f96024k = iArr11;
            int[] iArr12 = new int[y0.values().length];
            try {
                iArr12[y0.E_PUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr12[y0.E_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            f96025l = iArr12;
            int[] iArr13 = new int[k.values().length];
            try {
                iArr13[k.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr13[k.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr13[k.COMPLAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr13[k.CLAIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr13[k.APPEAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr13[k.INFORMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr13[k.NOTIFICATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr13[k.OPINION.ordinal()] = 8;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr13[k.DECISION.ordinal()] = 9;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr13[k.RESOLUTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr13[k.CALL.ordinal()] = 11;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr13[k.CERTIFICATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr13[k.OTHER.ordinal()] = 13;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr13[k.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused69) {
            }
            f96026m = iArr13;
            int[] iArr14 = new int[f1.values().length];
            try {
                iArr14[f1.E_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr14[f1.E_PUAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr14[f1.E_PUAP_AND_E_DELIVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr14[f1.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused73) {
            }
            f96027n = iArr14;
        }
    }

    public static final SearchAddressResult A(AddressDtoDto addressDtoDto) {
        return new SearchAddressResult(B(addressDtoDto.getAddressType()), addressDtoDto.getBuildingNumber(), addressDtoDto.getCity(), addressDtoDto.getPostalCode(), addressDtoDto.getFlatNumber(), addressDtoDto.getStreet());
    }

    public static final u0 B(q1 q1Var) {
        int i15 = C2245a.f96015b[q1Var.ordinal()];
        if (i15 == 1) {
            return u0.CORRESPONDENCE;
        }
        if (i15 == 2) {
            return u0.HEADQUARTERS;
        }
        if (i15 == 3) {
            return u0.UNKNOWN;
        }
        throw new p();
    }

    public static final SendEdeliveryDraftMessageResponse C(SendEdeliveryDraftMessageResponseDto sendEdeliveryDraftMessageResponseDto) {
        return new SendEdeliveryDraftMessageResponse(sendEdeliveryDraftMessageResponseDto.getWarning());
    }

    public static final eo0.y0 D(y0 y0Var) {
        int i15 = y0Var == null ? -1 : C2245a.f96025l[y0Var.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? eo0.y0.UNKNOWN : eo0.y0.E_DELIVERY;
        }
        return eo0.y0.E_PUAP;
    }

    private static final UrlData E(EmptyStateUrlDtoDto emptyStateUrlDtoDto) {
        return new UrlData(emptyStateUrlDtoDto.getTitle(), emptyStateUrlDtoDto.getValue());
    }

    public static final b1 F(b2 b2Var, String str) {
        int i15 = C2245a.f96014a[b2Var.ordinal()];
        if (i15 == 1) {
            return new b1.NotBlocking(str);
        }
        if (i15 == 2) {
            return new b1.Blocking(str);
        }
        if (i15 == 3) {
            return null;
        }
        throw new p();
    }

    public static final fo0.a G(z0 z0Var) {
        switch (C2245a.f96024k[z0Var.ordinal()]) {
            case 1:
                return fo0.a.VERIFICATION;
            case 2:
                return fo0.a.COMMISSIONED;
            case 3:
                return fo0.a.REJECTED;
            case 4:
                return fo0.a.TRANSMITTED;
            case 5:
                return fo0.a.SENT;
            case 6:
                return fo0.a.PENDING;
            case 7:
                return fo0.a.DELIVERED;
            case 8:
                return fo0.a.UNDELIVERED;
            case 9:
                return fo0.a.UNKNOWN;
            default:
                throw new p();
        }
    }

    private static final fo0.c H(DeliveryMessageDtoDto deliveryMessageDtoDto, String str) {
        ArrayList arrayList;
        List listN;
        String messageLocation;
        String strB = g0.b(deliveryMessageDtoDto.getMessageId());
        String subject = deliveryMessageDtoDto.getSubject();
        boolean opened = deliveryMessageDtoDto.getOpened();
        DeliveryMessageAddressDataDtoDto from = deliveryMessageDtoDto.getFrom();
        DeliveryMessageAddress deliveryMessageAddressI = from != null ? I(from) : null;
        List<DeliveryMessageAddressDataDtoDto> listO = deliveryMessageDtoDto.o();
        if (listO != null) {
            List<DeliveryMessageAddressDataDtoDto> list = listO;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(I((DeliveryMessageAddressDataDtoDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        eo0.y0 y0VarD = D(deliveryMessageDtoDto.getSourceSystem());
        DeliveryStatusDtoDto deliveryStatus = deliveryMessageDtoDto.getDeliveryStatus();
        Status statusM = deliveryStatus != null ? M(deliveryStatus) : null;
        String caseId = deliveryMessageDtoDto.getCaseId();
        String strB2 = caseId != null ? j.b(caseId) : null;
        String threadId = deliveryMessageDtoDto.getThreadId();
        String strA = threadId != null ? fo0.j.a(threadId) : null;
        OffsetDateTime submissionDate = deliveryMessageDtoDto.getSubmissionDate();
        OffsetDateTime receiptDate = deliveryMessageDtoDto.getReceiptDate();
        List<LabelDtoDto> listE = deliveryMessageDtoDto.e();
        if (listE != null) {
            listN = new ArrayList();
            for (LabelDtoDto labelDtoDto : listE) {
                w0 labelType = labelDtoDto.getLabelType();
                MessageLabel messageLabel = (labelType == null || (messageLocation = labelDtoDto.getMessageLocation()) == null) ? null : new MessageLabel(J(labelType), messageLocation);
                if (messageLabel != null) {
                    listN.add(messageLabel);
                }
            }
        } else {
            listN = v.n();
        }
        String correlationId = deliveryMessageDtoDto.getCorrelationId();
        String strA2 = correlationId != null ? fo0.b.a(correlationId) : null;
        fo0.g gVarK = K(deliveryMessageDtoDto.getType());
        boolean receiptConfirmation = deliveryMessageDtoDto.getReceiptConfirmation();
        ReceiptTextDtoDto receiptText = deliveryMessageDtoDto.getReceiptText();
        return new fo0.c(strB, subject, opened, deliveryMessageAddressI, arrayList, y0VarD, statusM, strB2, strA, submissionDate, receiptDate, listN, strA2, gVarK, receiptConfirmation, receiptText != null ? L(receiptText) : null, str, null);
    }

    private static final DeliveryMessageAddress I(DeliveryMessageAddressDataDtoDto deliveryMessageAddressDataDtoDto) {
        return new DeliveryMessageAddress(deliveryMessageAddressDataDtoDto.getAddress(), deliveryMessageAddressDataDtoDto.getName());
    }

    public static final f J(w0 w0Var) {
        int i15 = C2245a.f96023j[w0Var.ordinal()];
        if (i15 == 1) {
            return f.INBOX;
        }
        if (i15 == 2) {
            return f.DRAFT;
        }
        if (i15 == 3) {
            return f.SENT;
        }
        if (i15 == 4) {
            return f.TRASH;
        }
        if (i15 == 5) {
            return f.UNKNOWN;
        }
        throw new p();
    }

    public static final fo0.g K(a1 a1Var) {
        int i15 = C2245a.f96022i[a1Var.ordinal()];
        if (i15 == 1) {
            return fo0.g.MESSAGE;
        }
        if (i15 == 2) {
            return fo0.g.EVIDENCE;
        }
        if (i15 == 3) {
            return fo0.g.STUB;
        }
        if (i15 == 4) {
            return fo0.g.UNKNOWN;
        }
        throw new p();
    }

    public static final fo0.h L(ReceiptTextDtoDto receiptTextDtoDto) {
        int i15 = C2245a.f96021h[receiptTextDtoDto.getStatus().ordinal()];
        if (i15 == 1) {
            return new fo0.h.Information(receiptTextDtoDto.getValue());
        }
        if (i15 == 2) {
            return new fo0.h.Warning(receiptTextDtoDto.getValue());
        }
        if (i15 == 3) {
            return new fo0.h.Unknown(receiptTextDtoDto.getValue());
        }
        throw new p();
    }

    public static final Status M(DeliveryStatusDtoDto deliveryStatusDtoDto) {
        return new Status(G(deliveryStatusDtoDto.getCode()), deliveryStatusDtoDto.getStatusDescription(), deliveryStatusDtoDto.getDisplayValue());
    }

    public static final List<BEDictionaryAdditionalInformation> N(AdditionalInformationResponseDto additionalInformationResponseDto) {
        List<DictionaryAdditionalInformationDtoDto> listA = additionalInformationResponseDto.a();
        if (listA == null) {
            return v.n();
        }
        List<DictionaryAdditionalInformationDtoDto> list = listA;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (DictionaryAdditionalInformationDtoDto dictionaryAdditionalInformationDtoDto : list) {
            String body = dictionaryAdditionalInformationDtoDto.getBody();
            eo0.f fVarG = g(dictionaryAdditionalInformationDtoDto.getType());
            String title = dictionaryAdditionalInformationDtoDto.getTitle();
            AdditionalInformationUrlDtoDto url = dictionaryAdditionalInformationDtoDto.getUrl();
            arrayList.add(new BEDictionaryAdditionalInformation(body, fVarG, title, url != null ? h(url) : null));
        }
        return arrayList;
    }

    public static final List<EpuapApplicationType> O(ApplicationTypeDictionaryDto applicationTypeDictionaryDto) {
        EpuapApplicationType.a aVarR;
        String label;
        List<ApplicationTypeLabelDtoDto> listA = applicationTypeDictionaryDto.a();
        if (listA == null) {
            return v.n();
        }
        ArrayList arrayList = new ArrayList();
        for (ApplicationTypeLabelDtoDto applicationTypeLabelDtoDto : listA) {
            k applicationType = applicationTypeLabelDtoDto.getApplicationType();
            EpuapApplicationType epuapApplicationType = null;
            if (applicationType != null && (aVarR = r(applicationType)) != null && (label = applicationTypeLabelDtoDto.getLabel()) != null) {
                epuapApplicationType = new EpuapApplicationType(aVarR, label);
            }
            if (epuapApplicationType != null) {
                arrayList.add(epuapApplicationType);
            }
        }
        return arrayList;
    }

    public static final List<RecipientResult> P(BaeSearchResponseDto baeSearchResponseDto) {
        List<BaeSearchDtoDto> listA = baeSearchResponseDto.a();
        if (listA == null) {
            return v.n();
        }
        ArrayList arrayList = new ArrayList();
        for (BaeSearchDtoDto baeSearchDtoDto : listA) {
            BaeSearchDataDtoDto baeSearchData = baeSearchDtoDto.getBaeSearchData();
            RecipientResult recipientResultX = baeSearchData != null ? x(baeSearchData, baeSearchDtoDto.getRecipientEda(), baeSearchResponseDto.getNextPageId()) : null;
            if (recipientResultX != null) {
                arrayList.add(recipientResultX);
            }
        }
        return arrayList;
    }

    public static final List<CountryDictionary> Q(CountriesDictionaryDtoDto countriesDictionaryDtoDto) {
        List<CountryDictionaryDtoDto> listA = countriesDictionaryDtoDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (CountryDictionaryDtoDto countryDictionaryDtoDto : listA) {
            arrayList.add(new CountryDictionary(countryDictionaryDtoDto.getCountryCode(), countryDictionaryDtoDto.getName()));
        }
        return arrayList;
    }

    public static final List<fo0.c> R(MessagesResponseDto messagesResponseDto) {
        List<DeliveryMessageDtoDto> listA = messagesResponseDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(H((DeliveryMessageDtoDto) it.next(), messagesResponseDto.getNextPageId()));
        }
        return arrayList;
    }

    public static final DomainFile S(FileDto fileDto) {
        return new DomainFile(fileDto.getInputStream(), fileDto.getFileName());
    }

    static /* synthetic */ fo0.c T(DeliveryMessageDtoDto deliveryMessageDtoDto, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = null;
        }
        return H(deliveryMessageDtoDto, str);
    }

    private static final List<SendEdeliveryMessageAddressDataDtoDto> U(List<Recipient> list) {
        ArrayList arrayList = new ArrayList();
        for (Recipient recipient : list) {
            String deliveryAddress = recipient.getDeliveryAddress();
            SendEdeliveryMessageAddressDataDtoDto sendEdeliveryMessageAddressDataDtoDto = deliveryAddress != null ? new SendEdeliveryMessageAddressDataDtoDto(deliveryAddress, recipient.getFullName()) : null;
            if (sendEdeliveryMessageAddressDataDtoDto != null) {
                arrayList.add(sendEdeliveryMessageAddressDataDtoDto);
            }
        }
        return arrayList;
    }

    public static final EdeliveryDraftMessageRequestDto V(eo0.v vVar) {
        String subject = vVar.getSubject();
        List<SendEdeliveryMessageAddressDataDtoDto> listU = U(vVar.f());
        String caseId = vVar.getCaseId();
        if (caseId == null) {
            caseId = null;
        }
        String threadId = vVar.getThreadId();
        String str = threadId == null ? null : threadId;
        String textBody = vVar.getTextBody();
        ForwardDetails forwardDetails = vVar.getForwardDetails();
        return new EdeliveryDraftMessageRequestDto(caseId, forwardDetails != null ? W(forwardDetails) : null, subject, textBody, str, listU);
    }

    private static final ForwardDetailsDtoDto W(ForwardDetails forwardDetails) {
        List<y> listA = forwardDetails.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((y) it.next()).getValue());
        }
        return new ForwardDetailsDtoDto(arrayList, forwardDetails.getDirectoryId(), forwardDetails.getMessageId());
    }

    public static final DeleteEdeliveryMessagesRequestDto a(List<g0> list) {
        List<g0> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((g0) it.next()).getValue());
        }
        return new DeleteEdeliveryMessagesRequestDto(arrayList);
    }

    public static final AdditionalServiceActivationDates b(BaeSearchAdditionalServiceOwDtoDto baeSearchAdditionalServiceOwDtoDto) {
        if (baeSearchAdditionalServiceOwDtoDto.getActivationDate() == null && baeSearchAdditionalServiceOwDtoDto.getResignationDate() == null) {
            return null;
        }
        LocalDate activationDate = baeSearchAdditionalServiceOwDtoDto.getActivationDate();
        fz.b.LocalDate localDate = activationDate != null ? new fz.b.LocalDate(activationDate) : null;
        LocalDate resignationDate = baeSearchAdditionalServiceOwDtoDto.getResignationDate();
        return new AdditionalServiceActivationDates(localDate, resignationDate != null ? new fz.b.LocalDate(resignationDate) : null);
    }

    private static final AddressData c(DeliveryAddressDtoDto deliveryAddressDtoDto) {
        String address = deliveryAddressDtoDto.getAddress();
        return new AddressData(address != null ? c0.g(address) : null, deliveryAddressDtoDto.getEpuapId(), l(deliveryAddressDtoDto.getStatus()), d(deliveryAddressDtoDto.getAddressType()));
    }

    private static final eo0.c d(h hVar) {
        int i15 = C2245a.f96018e[hVar.ordinal()];
        if (i15 == 1) {
            return eo0.c.E_PUAP;
        }
        if (i15 == 2) {
            return eo0.c.E_PUAP_AND_E_DELIVERY;
        }
        if (i15 == 3) {
            return eo0.c.UNKNOWN;
        }
        throw new p();
    }

    private static final AgreementData e(AgreementsContentDtoDto agreementsContentDtoDto) {
        return new AgreementData(agreementsContentDtoDto.getFull(), agreementsContentDtoDto.getShorten());
    }

    public static final e f(AgreementsResponseDto agreementsResponseDto) throws Exception {
        AgreementData agreementDataE;
        if (agreementsResponseDto.getAccepted()) {
            return e.a.f52266a;
        }
        AgreementsContentDtoDto agreementsContent = agreementsResponseDto.getAgreementsContent();
        if (agreementsContent == null || (agreementDataE = e(agreementsContent)) == null) {
            throw new Exception();
        }
        WelcomeTextDtoDto welcomeText = agreementsResponseDto.getWelcomeText();
        return new e.NotAccepted(welcomeText != null ? new WelcomeTextData(welcomeText.getDescription(), welcomeText.a()) : null, agreementDataE);
    }

    public static final eo0.f g(c cVar) {
        int i15 = C2245a.f96017d[cVar.ordinal()];
        if (i15 == 1) {
            return eo0.f.RECIPIENT_MESSAGE;
        }
        if (i15 == 2) {
            return eo0.f.MESSAGE_TYPE_MESSAGE;
        }
        if (i15 == 3) {
            return eo0.f.UNKNOWN;
        }
        throw new p();
    }

    public static final BEAdditionalInformationUrl h(AdditionalInformationUrlDtoDto additionalInformationUrlDtoDto) {
        return new BEAdditionalInformationUrl(additionalInformationUrlDtoDto.getTitle(), additionalInformationUrlDtoDto.getValue());
    }

    public static final DeliveryMessageDetails i(DeliveryMessageDetailsDtoDto deliveryMessageDetailsDtoDto) {
        List listN;
        List listN2;
        fo0.c cVarT = T(deliveryMessageDetailsDtoDto.getDeliveryMessageDto(), null, 1, null);
        String textBody = deliveryMessageDetailsDtoDto.getTextBody();
        List<DeliveryMessageDetailsAttachmentDtoDto> listB = deliveryMessageDetailsDtoDto.b();
        if (listB != null) {
            List<DeliveryMessageDetailsAttachmentDtoDto> list = listB;
            listN = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listN.add(j((DeliveryMessageDetailsAttachmentDtoDto) it.next()));
            }
        } else {
            listN = v.n();
        }
        List list2 = listN;
        List<MessageEvidenceDtoDto> listD = deliveryMessageDetailsDtoDto.d();
        if (listD != null) {
            List<MessageEvidenceDtoDto> list3 = listD;
            listN2 = new ArrayList(v.y(list3, 10));
            Iterator<T> it4 = list3.iterator();
            while (it4.hasNext()) {
                listN2.add(k((MessageEvidenceDtoDto) it4.next()));
            }
        } else {
            listN2 = v.n();
        }
        return new DeliveryMessageDetails(cVarT, textBody, list2, listN2, deliveryMessageDetailsDtoDto.getAttachmentSumTooBigToDownload());
    }

    private static final DeliveryMessageDetailsAttachment j(DeliveryMessageDetailsAttachmentDtoDto deliveryMessageDetailsAttachmentDtoDto) {
        return new DeliveryMessageDetailsAttachment(y.b(deliveryMessageDetailsAttachmentDtoDto.getAttachmentId()), deliveryMessageDetailsAttachmentDtoDto.getFilename(), deliveryMessageDetailsAttachmentDtoDto.getFileSize(), deliveryMessageDetailsAttachmentDtoDto.getTooBigToDownload(), null);
    }

    private static final DeliveryMessageDetailsEvidence k(MessageEvidenceDtoDto messageEvidenceDtoDto) {
        return new DeliveryMessageDetailsEvidence(messageEvidenceDtoDto.getDescription(), eo0.c0.b(messageEvidenceDtoDto.getId()), null);
    }

    private static final eo0.p l(g gVar) {
        switch (C2245a.f96019f[gVar.ordinal()]) {
            case 1:
                return eo0.p.ACTIVE;
            case 2:
                return eo0.p.RESERVED;
            case 3:
                return eo0.p.CLOSED_RECOVERABLE;
            case 4:
                return eo0.p.CLOSED_UNRECOVERABLE;
            case 5:
                return eo0.p.STRUCK_OFF;
            case 6:
                return eo0.p.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final Directory m(DirectoryDtoDto directoryDtoDto) {
        return new Directory(r.b(directoryDtoDto.getId()), directoryDtoDto.getDisplayName(), o(directoryDtoDto.getType()), null);
    }

    public static final DirectoryResponse n(DirectoriesResponseDto directoriesResponseDto) {
        List<DirectoryDtoDto> listA = directoriesResponseDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(m((DirectoryDtoDto) it.next()));
        }
        return new DirectoryResponse(arrayList, directoriesResponseDto.getFaq());
    }

    private static final t o(h0 h0Var) {
        switch (C2245a.f96020g[h0Var.ordinal()]) {
            case 1:
                return t.TRASH;
            case 2:
                return t.INBOX;
            case 3:
                return t.SENT;
            case 4:
                return t.DRAFT;
            case 5:
                return t.CUSTOM_DEFINED;
            case 6:
                return t.UNKNOWN;
            case 7:
                return t.OUTBOX;
            default:
                throw new p();
        }
    }

    public static final EdeliveryDraftMessageResponse p(EdeliveryDraftMessageResponseDto edeliveryDraftMessageResponseDto) {
        List listN;
        String strB = g0.b(edeliveryDraftMessageResponseDto.getMessageId());
        List<DeliveryMessageDetailsAttachmentDtoDto> listA = edeliveryDraftMessageResponseDto.a();
        if (listA != null) {
            List<DeliveryMessageDetailsAttachmentDtoDto> list = listA;
            listN = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listN.add(j((DeliveryMessageDetailsAttachmentDtoDto) it.next()));
            }
        } else {
            listN = v.n();
        }
        return new EdeliveryDraftMessageResponse(new DraftDetails(strB, listN, null));
    }

    private static final EmptyState q(EmptyStateDtoDto emptyStateDtoDto) {
        String title = emptyStateDtoDto.getTitle();
        String body = emptyStateDtoDto.getBody();
        EmptyStateUrlDtoDto url = emptyStateDtoDto.getUrl();
        return new EmptyState(title, body, url != null ? E(url) : null);
    }

    public static final EpuapApplicationType.a r(k kVar) {
        switch (C2245a.f96026m[kVar.ordinal()]) {
            case 1:
                return EpuapApplicationType.a.APPLICATION;
            case 2:
                return EpuapApplicationType.a.REQUEST;
            case 3:
                return EpuapApplicationType.a.COMPLAINT;
            case 4:
                return EpuapApplicationType.a.CLAIM;
            case 5:
                return EpuapApplicationType.a.APPEAL;
            case 6:
                return EpuapApplicationType.a.INFORMATION;
            case 7:
                return EpuapApplicationType.a.NOTIFICATION;
            case 8:
                return EpuapApplicationType.a.OPINION;
            case 9:
                return EpuapApplicationType.a.DECISION;
            case 10:
                return EpuapApplicationType.a.RESOLUTION;
            case 11:
                return EpuapApplicationType.a.CALL;
            case 12:
                return EpuapApplicationType.a.CERTIFICATE;
            case 13:
                return EpuapApplicationType.a.OTHER;
            case 14:
                return EpuapApplicationType.a.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final OAuthConfiguration s(WebViewSettingsDtoDto webViewSettingsDtoDto) {
        return new OAuthConfiguration(webViewSettingsDtoDto.getEdorUrl(), webViewSettingsDtoDto.getMlpzUrl(), webViewSettingsDtoDto.getSsoUrl(), webViewSettingsDtoDto.getIamOwTokenUrl(), webViewSettingsDtoDto.getIamCentralTokenUrl());
    }

    public static final OwnerAddress t(OwnerAddressResponseDto ownerAddressResponseDto) throws ParseException {
        if (ownerAddressResponseDto.getOwnerAddress() == null && ownerAddressResponseDto.getEmptyState() == null) {
            throw new ParseException("OwnerAddress cannot be empty", 0);
        }
        DeliveryAddressDtoDto ownerAddress = ownerAddressResponseDto.getOwnerAddress();
        AddressData addressDataC = ownerAddress != null ? c(ownerAddress) : null;
        EmptyStateDtoDto emptyState = ownerAddressResponseDto.getEmptyState();
        return new OwnerAddress(addressDataC, emptyState != null ? q(emptyState) : null);
    }

    public static final Recipient u(OrganizationDtoDto organizationDtoDto) {
        String warningMessage;
        b2 warningType;
        String fullName = organizationDtoDto.getFullName();
        p0 p0VarY = y(organizationDtoDto.getRecipientType());
        OrganizationAddressDtoDto address = organizationDtoDto.getAddress();
        b1 b1VarF = null;
        RecipientAddress recipientAddressV = address != null ? v(address) : null;
        String deliveryAddress = organizationDtoDto.getDeliveryAddress();
        String epuapAddress = organizationDtoDto.getEpuapAddress();
        String krs = organizationDtoDto.getKrs();
        String nip = organizationDtoDto.getNip();
        String regon = organizationDtoDto.getRegon();
        OrganizationWarningDtoDto warning = organizationDtoDto.getWarning();
        if (warning != null && (warningMessage = warning.getWarningMessage()) != null && (warningType = organizationDtoDto.getWarning().getWarningType()) != null) {
            b1VarF = F(warningType, warningMessage);
        }
        return new Recipient(fullName, p0VarY, recipientAddressV, deliveryAddress, epuapAddress, krs, nip, regon, b1VarF);
    }

    private static final RecipientAddress v(OrganizationAddressDtoDto organizationAddressDtoDto) {
        return new RecipientAddress(organizationAddressDtoDto.getBuildingNumber(), organizationAddressDtoDto.getFlatNumber(), organizationAddressDtoDto.getLocality(), organizationAddressDtoDto.getPostalCode(), organizationAddressDtoDto.getStreet());
    }

    public static final RecipientInfo w(RecipientEdaDtoDto recipientEdaDtoDto) {
        b2 warningType;
        LocalDate dateOfEnteringToBAE = recipientEdaDtoDto.getDateOfEnteringToBAE();
        b1 b1VarF = null;
        fz.b.LocalDate localDate = dateOfEnteringToBAE != null ? new fz.b.LocalDate(dateOfEnteringToBAE) : null;
        LocalDate dateOfRemovalFromBAE = recipientEdaDtoDto.getDateOfRemovalFromBAE();
        fz.b.LocalDate localDate2 = dateOfRemovalFromBAE != null ? new fz.b.LocalDate(dateOfRemovalFromBAE) : null;
        String serviceCategoryDescription = recipientEdaDtoDto.getServiceCategoryDescription();
        String recipientEda = recipientEdaDtoDto.getRecipientEda();
        BaeSearchAdditionalServiceOwDtoDto additionalServiceOw = recipientEdaDtoDto.getAdditionalServiceOw();
        AdditionalServiceActivationDates additionalServiceActivationDatesB = additionalServiceOw != null ? b(additionalServiceOw) : null;
        String warningMessage = recipientEdaDtoDto.getWarningMessage();
        if (warningMessage != null && (warningType = recipientEdaDtoDto.getWarningType()) != null) {
            b1VarF = F(warningType, warningMessage);
        }
        return new RecipientInfo(recipientEda, localDate, localDate2, serviceCategoryDescription, b1VarF, additionalServiceActivationDatesB);
    }

    public static final RecipientResult x(BaeSearchDataDtoDto baeSearchDataDtoDto, RecipientEdaDtoDto recipientEdaDtoDto, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<AddressDtoDto> listA = baeSearchDataDtoDto.a();
        if (listA != null) {
            List<AddressDtoDto> list = listA;
            ArrayList arrayList3 = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(A((AddressDtoDto) it.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<OfficialIdDto> listC = baeSearchDataDtoDto.c();
        if (listC != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it4 = listC.iterator();
            while (it4.hasNext()) {
                r0 r0VarZ = z((OfficialIdDto) it4.next());
                if (r0VarZ != null) {
                    arrayList4.add(r0VarZ);
                }
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        return new RecipientResult(arrayList, baeSearchDataDtoDto.getFullName(), arrayList2, recipientEdaDtoDto != null ? w(recipientEdaDtoDto) : null, str);
    }

    private static final p0 y(f1 f1Var) {
        int i15 = C2245a.f96027n[f1Var.ordinal()];
        if (i15 == 1) {
            return p0.E_DELIVERY;
        }
        if (i15 == 2) {
            return p0.E_PUAP;
        }
        if (i15 == 3) {
            return p0.E_PUAP_AND_E_DELIVERY;
        }
        if (i15 == 4) {
            return p0.UNKNOWN;
        }
        throw new p();
    }

    public static final r0 z(OfficialIdDto officialIdDto) {
        String id5 = officialIdDto.getId();
        if (id5 == null) {
            return null;
        }
        o1 referenceRegistry = officialIdDto.getReferenceRegistry();
        switch (referenceRegistry == null ? -1 : C2245a.f96016c[referenceRegistry.ordinal()]) {
            case -1:
            case 7:
                return new r0.Unknown(id5);
            case 0:
            default:
                throw new p();
            case 1:
                return new r0.Pesel(id5);
            case 2:
                return new r0.Regon(id5);
            case 3:
                return new r0.Krs(id5);
            case 4:
                return new r0.Nip(id5);
            case 5:
                return new r0.Ue(id5);
            case 6:
                return new r0.KppId(id5);
        }
    }
}
