package p081n61;

import al0.AddPhotoData;
import c91.a;
import cl0.BEPassportChildApplicationCountryDictionary;
import cl0.BEPassportChildApplicationOfficeDictionary;
import cl0.PassportChildApplicationGetChildData;
import i61.ChildDataApplicationAttachmentData;
import i61.ChildDataResult;
import i61.ChildPassportApplicationFaceDetectionData;
import i61.ChildPassportApplicationFile;
import i61.DataSplit;
import i61.DataSplitData;
import i61.EnterChildCheckboxes;
import i61.EnterChildValidatedData;
import i61.ParentFormData;
import i61.SummaryCheckBox;
import ib4.c;
import iy.b0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import k10.v;
import k10.z;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import ru3.ContactDetailsData;
import ru3.ContactDetailsFormData;
import st3.AddressData;
import st3.AddressFormData;
import wx.FileContent;
import x71.ChildPassportApplicationCorrespondenceCountryData;
import y91.ChildPassportApplicationAttachmentsToSend;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¬\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 À\u00022\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004:\u0002Á\u0002B±\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100JC\u00108\u001a\u0004\u0018\u0001072\b\u00102\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u0001012\b\u00105\u001a\u0004\u0018\u0001012\b\u00106\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010>\u001a\u0004\u0018\u00010=*\u0004\u0018\u00010:2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b>\u0010?J0\u0010F\u001a\u0014\u0012\u0004\u0012\u00020D\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0@0C2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@H\u0082@¢\u0006\u0004\bF\u0010GJ\u001a\u0010I\u001a\u0004\u0018\u00010A2\u0006\u0010H\u001a\u00020EH\u0082@¢\u0006\u0004\bI\u0010JJ,\u0010K\u001a\b\u0012\u0004\u0012\u00020E0@*\u0014\u0012\u0004\u0012\u00020D\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0@0CH\u0082@¢\u0006\u0004\bK\u0010LJ\u0010\u0010N\u001a\u00020MH\u0082@¢\u0006\u0004\bN\u0010OJ\u0013\u0010R\u001a\u00020Q*\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ%\u0010X\u001a\u00020W2\u0006\u0010T\u001a\u00020D2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020M0UH\u0002¢\u0006\u0004\bX\u0010YJ\u0013\u0010\\\u001a\u00020[*\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\r\u0010_\u001a\u00020^¢\u0006\u0004\b_\u0010`J\u0015\u0010b\u001a\u00020M2\u0006\u0010a\u001a\u00020:¢\u0006\u0004\bb\u0010cJ\u000f\u0010e\u001a\u0004\u0018\u00010d¢\u0006\u0004\be\u0010fJ\u0015\u0010g\u001a\u00020M2\u0006\u0010a\u001a\u00020:¢\u0006\u0004\bg\u0010cJ\r\u0010i\u001a\u00020h¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020MH\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010o\u001a\u00020M2\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020MH\u0016¢\u0006\u0004\bq\u0010lJ\u0017\u0010s\u001a\u00020M2\u0006\u0010n\u001a\u00020rH\u0016¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00020rH\u0016¢\u0006\u0004\bu\u0010vJ\u0011\u0010x\u001a\u0004\u0018\u00010wH\u0016¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020M2\u0006\u0010n\u001a\u00020zH\u0016¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020M2\u0006\u0010}\u001a\u00020:H\u0016¢\u0006\u0004\b~\u0010cJ\u001a\u0010\u0080\u0001\u001a\u00020M2\u0006\u0010n\u001a\u00020\u007fH\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0014\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007fH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0015\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001c\u0010\u0089\u0001\u001a\u00020M2\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0013\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J%\u0010\u0091\u0001\u001a\u00020M2\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u0090\u0001\u001a\u00020PH\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J&\u0010\u0097\u0001\u001a\u00020M2\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001d\u0010\u0099\u0001\u001a\u00030\u0095\u00012\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001c\u0010\u009b\u0001\u001a\u00020M2\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0011\u0010\u009d\u0001\u001a\u00020MH\u0016¢\u0006\u0005\b\u009d\u0001\u0010lJ\u001b\u0010\u009f\u0001\u001a\u00020M2\u0007\u0010n\u001a\u00030\u009e\u0001H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0013\u0010¡\u0001\u001a\u00030\u009e\u0001H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0015\u0010¤\u0001\u001a\u0005\u0018\u00010£\u0001H\u0016¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001b\u0010¦\u0001\u001a\u00020M2\u0007\u0010n\u001a\u00030£\u0001H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0014\u0010¨\u0001\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0013\u0010«\u0001\u001a\u00030ª\u0001H\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J&\u0010¯\u0001\u001a\u00020M2\b\u0010\u0094\u0001\u001a\u00030\u00ad\u00012\b\u0010\u0096\u0001\u001a\u00030®\u0001H\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001f\u0010±\u0001\u001a\u0005\u0018\u00010®\u00012\b\u0010\u0094\u0001\u001a\u00030\u00ad\u0001H\u0016¢\u0006\u0006\b±\u0001\u0010²\u0001J\u0013\u0010³\u0001\u001a\u00030ª\u0001H\u0016¢\u0006\u0006\b³\u0001\u0010¬\u0001J\u001b\u0010µ\u0001\u001a\u00020M2\u0007\u0010n\u001a\u00030´\u0001H\u0016¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0015\u0010·\u0001\u001a\u0005\u0018\u00010´\u0001H\u0016¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u0014\u0010¹\u0001\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0006\b¹\u0001\u0010º\u0001J%\u0010¾\u0001\u001a\u00020M2\b\u0010¼\u0001\u001a\u00030»\u00012\u0007\u0010½\u0001\u001a\u00020=H\u0016¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u001d\u0010Á\u0001\u001a\u00020M2\t\u0010n\u001a\u0005\u0018\u00010À\u0001H\u0016¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u0013\u0010Ä\u0001\u001a\u00030Ã\u0001H\u0016¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001b\u0010Ç\u0001\u001a\u00020M2\u0007\u0010n\u001a\u00030Æ\u0001H\u0016¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0015\u0010É\u0001\u001a\u0005\u0018\u00010Æ\u0001H\u0016¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u0015\u0010Ë\u0001\u001a\u0005\u0018\u00010Æ\u0001H\u0016¢\u0006\u0006\bË\u0001\u0010Ê\u0001J\u001c\u0010Î\u0001\u001a\u00020M2\b\u0010Í\u0001\u001a\u00030Ì\u0001H\u0016¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u0015\u0010Ð\u0001\u001a\u0005\u0018\u00010Ì\u0001H\u0016¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u0015\u0010Ó\u0001\u001a\u0005\u0018\u00010Ò\u0001H\u0016¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u001c\u0010Ö\u0001\u001a\u00020M2\b\u0010Õ\u0001\u001a\u00030Ò\u0001H\u0016¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u0015\u0010Ù\u0001\u001a\u0005\u0018\u00010Ø\u0001H\u0016¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u0013\u0010Ü\u0001\u001a\u00030Û\u0001H\u0016¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u001c\u0010à\u0001\u001a\u00020M2\b\u0010ß\u0001\u001a\u00030Þ\u0001H\u0016¢\u0006\u0006\bà\u0001\u0010á\u0001J\u001f\u0010ã\u0001\u001a\u000f\u0012\u0004\u0012\u00020D\u0012\u0005\u0012\u00030â\u00010CH\u0016¢\u0006\u0006\bã\u0001\u0010ä\u0001J\u0019\u0010æ\u0001\u001a\t\u0012\u0005\u0012\u00030å\u00010@H\u0016¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u0015\u0010é\u0001\u001a\u0005\u0018\u00010è\u0001H\u0016¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u001b\u0010ì\u0001\u001a\u00020M2\u0007\u0010ë\u0001\u001a\u00020ZH\u0016¢\u0006\u0006\bì\u0001\u0010í\u0001J\u001a\u0010ï\u0001\u001a\u00020M2\u0007\u0010î\u0001\u001a\u00020:H\u0016¢\u0006\u0005\bï\u0001\u0010cJ\u0011\u0010ð\u0001\u001a\u00020MH\u0016¢\u0006\u0005\bð\u0001\u0010lJ\u0013\u0010ñ\u0001\u001a\u00030ª\u0001H\u0016¢\u0006\u0006\bñ\u0001\u0010¬\u0001J\u001b\u0010ó\u0001\u001a\u00020M2\u0007\u0010n\u001a\u00030ò\u0001H\u0016¢\u0006\u0006\bó\u0001\u0010ô\u0001J\u0013\u0010õ\u0001\u001a\u00030ò\u0001H\u0016¢\u0006\u0006\bõ\u0001\u0010ö\u0001J\u001e\u0010ù\u0001\u001a\u00020M2\n\u0010ø\u0001\u001a\u0005\u0018\u00010÷\u0001H\u0016¢\u0006\u0006\bù\u0001\u0010ú\u0001J\u0014\u0010û\u0001\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0006\bû\u0001\u0010ü\u0001J\u0011\u0010ý\u0001\u001a\u00020MH\u0016¢\u0006\u0005\bý\u0001\u0010lJ\u001a\u0010ÿ\u0001\u001a\u00020M2\u0007\u0010þ\u0001\u001a\u00020:H\u0016¢\u0006\u0005\bÿ\u0001\u0010cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0089\u0002R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010\u0090\u0002R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u0094\u0002R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0096\u0002R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u0016\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R\u0017\u0010¥\u0002\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0002\u0010¤\u0002R,\u0010«\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030¦\u00028\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b§\u0002\u0010¨\u0002\u001a\u0006\b©\u0002\u0010ª\u0002R'\u0010²\u0002\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00020¬\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b®\u0002\u0010¯\u0002\u001a\u0006\b°\u0002\u0010±\u0002R&\u0010¸\u0002\u001a\t\u0012\u0004\u0012\u00020\u00020³\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b´\u0002\u0010µ\u0002\u001a\u0006\b¶\u0002\u0010·\u0002R\u001a\u0010¼\u0002\u001a\u0005\u0018\u00010¹\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0002\u0010»\u0002R\u0018\u0010¿\u0002\u001a\u00030\u0087\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b½\u0002\u0010¾\u0002¨\u0006Â\u0002"}, d2 = {"Ln61/f5;", "Ll00/g;", "Ln61/c;", "Ln61/a;", "", "Lg14/a;", "getInfoFromPeselUC", "Lac4/a;", "callActionWithLoaderUseCase", "Ll61/v;", "saveChildPassportApplicationDraftUC", "Ll61/l;", "getChildPassportApplicationDraftUC", "Ld14/d;", "saveImageToStorageUseCase", "Ld14/c;", "saveFilesToStorageUseCase", "Ld14/a;", "getFileContentUseCase", "Ll61/u;", "saveChildPassportApplicationDraftTimestampUC", "Ll61/n;", "isChildPassportApplicationDraftValidUC", "Ll61/o;", "isChildPassportApplicationPaymentStartedUC", "Ll61/k;", "clearChildPassportApplicationDraftUC", "Ln61/g;", "mapper", "Ly51/a;", "clearChildPassportApplicationDraftTimestampUC", "Lib4/c;", "genericDomainErrorMapper", "Lf14/a;", "installDynamicModuleUC", "Liv2/a;", "isDocumentPhotoFeatureFlagActiveUC", "Ll61/w;", "setFaceDetectionInstallationStateUC", "Ll61/t;", "isPassportOnlinePaymentFeatureEnabledUC", "Lyy/a;", "stateMachineFactory", "Ln61/f;", "childPassportApplicationExitDialogMapper", "Ln61/a5;", "childPassportApplicationRestoreDraftDialogMapper", "<init>", "(Lg14/a;Lac4/a;Ll61/v;Ll61/l;Ld14/d;Ld14/c;Ld14/a;Ll61/u;Ll61/n;Ll61/o;Ll61/k;Ln61/g;Ly51/a;Lib4/c;Lf14/a;Liv2/a;Ll61/w;Ll61/t;Lyy/a;Ln61/f;Ln61/a5;)V", "Liy/b0;", "firstName", "secondName", "otherName", "surname", "birthPlace", "Li61/k;", "R9", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;)Li61/k;", "", "", "splitValue", "Li61/j;", "M9", "(Ljava/lang/String;I)Li61/j;", "", "Lwx/i;", "files", "Ldx/i;", "Ldx/b;", "Li61/g;", "X9", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "file", "J9", "(Li61/g;Ltq/e;)Ljava/lang/Object;", "P9", "(Ldx/i;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "W9", "(Ltq/e;)Ljava/lang/Object;", "Li61/n;", "Li61/m;", "ca", "(Li61/n;)Li61/m;", "domainError", "Lkotlin/Function0;", "retryAction", "Ljb4/b;", "T9", "(Ldx/b;Ler/a;)Ljb4/b;", "Ly91/c$b;", "Li61/s;", "da", "(Ly91/c$b;)Li61/s;", "Lz81/a;", "O9", "()Lz81/a;", "destinationRoute", "ea", "(Ljava/lang/String;)V", "Ln61/d;", "Q9", "()Ln61/d;", "V9", "Lst3/d;", "f5", "()Lst3/d;", "Z9", "()V", "Lc91/a$a;", "data", "X2", "(Lc91/a$a;)V", "r3", "Lr91/a$a;", "g1", "(Lr91/a$a;)V", "I0", "()Lr91/a$a;", "Li61/l;", "z3", "()Li61/l;", "Lda1/a$a;", "E6", "(Lda1/a$a;)V", "childId", "a0", "Li61/p;", "G4", "(Li61/p;)V", "Q6", "()Li61/p;", "Li61/t;", "n0", "()Li61/t;", "Li61/c;", "childDataResult", "S6", "(Li61/c;)V", "Lk81/a$b;", "e0", "()Lk81/a$b;", "Li61/o;", "validatedData", "formData", "h2", "(Li61/o;Li61/n;)V", "Lb71/b;", "attachmentType", "Lb71/c$a;", "attachmentsData", "b2", "(Lb71/b;Lb71/c$a;)V", "K7", "(Lb71/b;)Lb71/c$a;", "d6", "(Lb71/b;)V", "h1", "Lt91/a$a;", "Y2", "(Lt91/a$a;)V", "q7", "()Lt91/a$a;", "Lal0/b;", "U0", "()Lal0/b;", "O0", "(Lal0/b;)V", "i7", "()Ljava/lang/Integer;", "", "M5", "()Z", "Lu61/c;", "Lu61/b$a;", "v1", "(Lu61/c;Lu61/b$a;)V", "L2", "(Lu61/c;)Lu61/b$a;", "E2", "Lu81/a$a;", "d1", "(Lu81/a$a;)V", "y3", "()Lu81/a$a;", "v8", "()Li61/k;", "Ld81/b;", "type", "dataSplit", "I7", "(Ld81/b;Li61/j;)V", "Lru3/b;", "q3", "(Lru3/b;)V", "Lm71/a$a;", "L9", "()Lm71/a$a;", "Lx71/b;", "U7", "(Lx71/b;)V", "t1", "()Lx71/b;", "N8", "Li61/d;", "address", "r8", "(Li61/d;)V", "y0", "()Li61/d;", "Lo91/a$a;", "f4", "()Lo91/a$a;", "pickupMethodData", "G1", "(Lo91/a$a;)V", "Li61/d$b;", "k", "()Li61/d$b;", "Ll91/a$b;", "r2", "()Ll91/a$b;", "Ll91/a$a;", "discountTypeData", "R1", "(Ll91/a$a;)V", "Ly91/c$a;", "m0", "()Ldx/i;", "Ly91/b;", "q0", "()Ljava/util/List;", "Li61/h;", "C0", "()Li61/h;", "summaryData", "A3", "(Ly91/c$b;)V", "applicationId", "S8", "q2", "r1", "Ln81/a$a;", "k2", "(Ln81/a$a;)V", "N9", "()Ln81/a$a;", "Li61/q;", "paymentType", "Y4", "(Li61/q;)V", "m5", "()Ljava/lang/String;", "a6", "applicationNumber", "J4", "b", "Lg14/a;", "c", "Lac4/a;", "d", "Ll61/v;", "e", "Ll61/l;", "f", "Ld14/d;", "g", "Ld14/c;", "h", "Ld14/a;", "j", "Ll61/u;", "Ll61/n;", "l", "Ll61/o;", "m", "Ll61/k;", "n", "Ln61/g;", "p", "Ly51/a;", "q", "Lib4/c;", "r", "Lf14/a;", "s", "Liv2/a;", "t", "Ll61/w;", "v", "Ll61/t;", "w", "Ln61/c;", "initialState", "Lk10/t;", "x", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ln61/b;", "y", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "z", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lg71/a$a;", "S3", "()Lg71/a$a;", "childPassportInput", "l6", "()Li61/c;", "childPassportResult", "A", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f5 extends l00.g<State, a> implements l00.e, a, r91.a, da1.a, j71.a, ga1.a, k81.a, g71.a, b71.c, t91.a, p61.a, u61.b, u81.a, d81.a, m71.a, a81.a, r71.a, w71.a, x71.a, o91.a, l91.a, x61.a, i91.a, y91.c, n81.a, r81.a, f91.a, zx.d {
    public static final int B = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g14.a getInfoFromPeselUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l61.v saveChildPassportApplicationDraftUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l61.l getChildPassportApplicationDraftUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d14.d saveImageToStorageUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d14.c saveFilesToStorageUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final d14.a getFileContentUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l61.u saveChildPassportApplicationDraftTimestampUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l61.n isChildPassportApplicationDraftValidUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final l61.o isChildPassportApplicationPaymentStartedUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final l61.k clearChildPassportApplicationDraftUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p081n61.g mapper;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final y51.a clearChildPassportApplicationDraftTimestampUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final f14.a installDynamicModuleUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final iv2.a isDocumentPhotoFeatureFlagActiveUC;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final l61.w setFaceDetectionInstallationStateUC;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final l61.t isPassportOnlinePaymentFeatureEnabledUC;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, a> stateMachine;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p081n61.b> navAction;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<State> state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$g0;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$g0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<a.SavePickupMethodData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132752g;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.SavePickupMethodData savePickupMethodData, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, savePickupMethodData.getPickupMethodMethod(), null, null, null, null, null, null, null, null, null, null, null, -1048577, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SavePickupMethodData savePickupMethodData = (a.SavePickupMethodData) this.f132751f;
            k10.c0 c0Var = (k10.c0) this.f132752g;
            uq.b.e();
            if (this.f132750e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.x5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.a0.O(savePickupMethodData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SavePickupMethodData savePickupMethodData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            a0 a0Var = new a0(eVar);
            a0Var.f132751f = savePickupMethodData;
            a0Var.f132752g = c0Var;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f132754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f132755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f132756d;

        static {
            int[] iArr = new int[b71.b.values().length];
            try {
                iArr[b71.b.TEMPORARY_REASON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b71.b.SIGNED_CONSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b71.b.OTHER_PARENT_UNABLE_TO_CONSENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b71.b.OLD_APPLICATION_MONEY_TRANSFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b71.b.NEW_APPLICATION_MONEY_TRANSFER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b71.b.ABROAD_TREATMENT_CONFIRMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b71.b.KDR_CONFIRMATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b71.b.TECHNICAL_ISSUE_CONFIRMATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f132753a = iArr;
            int[] iArr2 = new int[u61.c.values().length];
            try {
                iArr2[u61.c.GLASSES.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[u61.c.FACE_COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f132754b = iArr2;
            int[] iArr3 = new int[al0.s0.values().length];
            try {
                iArr3[al0.s0.TEMPORARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[al0.s0.BIOMETRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[al0.s0.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[al0.s0.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[al0.s0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            f132755c = iArr3;
            int[] iArr4 = new int[i61.l.values().length];
            try {
                iArr4[i61.l.KDR_OWNERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[i61.l.TECHNICAL_ISSUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[i61.l.CHILD_TREATED_ABROAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[i61.l.TEMPORARY_PASSPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[i61.l.SCHOOL_AGED_CHILDREN.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            f132756d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln61/a$h;", "<unused var>", "Ln61/c;", "Loq/i0;", "<anonymous>", "(Ln61/a$h;Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<a.h, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f132757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f132758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f132759g;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006a  */
        /* JADX WARN: Code duplicated, block: B:25:0x0086  */
        /* JADX WARN: Code duplicated, block: B:27:0x008e  */
        /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
        
            if (r1.d(r2, r7) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
        
            if (r1.d(r3, r7) == r0) goto L29;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f132759g
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2e
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                java.lang.Object r0 = r7.f132757e
                tx.b$a r0 = (tx.b.a) r0
                oq.u.b(r8)
                goto Laa
            L26:
                oq.u.b(r8)
                goto L5d
            L2a:
                oq.u.b(r8)
                goto L47
            L2e:
                oq.u.b(r8)
                n61.f5 r8 = p081n61.f5.this
                l61.w r8 = p081n61.f5.z9(r8)
                l61.w$a r1 = new l61.w$a
                i61.a r6 = i61.a.IN_PROGRESS
                r1.<init>(r6)
                r7.f132759g = r5
                java.lang.Object r8 = r8.d(r1, r7)
                if (r8 != r0) goto L47
                goto La9
            L47:
                n61.f5 r8 = p081n61.f5.this
                f14.a r8 = p081n61.f5.t9(r8)
                f14.a$a r1 = new f14.a$a
                tx.a r5 = tx.a.FACE_DETECTION
                r1.<init>(r5)
                r7.f132759g = r4
                java.lang.Object r8 = r8.c(r1, r7)
                if (r8 != r0) goto L5d
                goto La9
            L5d:
                n61.f5 r1 = p081n61.f5.this
                tx.b$a r8 = (tx.b.a) r8
                tx.b$a$a r4 = tx.b.a.C5033a.f192525a
                boolean r4 = fr.t.c(r8, r4)
                r5 = 0
                if (r4 == 0) goto L86
                l61.w r1 = p081n61.f5.z9(r1)
                l61.w$a r2 = new l61.w$a
                i61.a r4 = i61.a.FAILURE
                r2.<init>(r4)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f132757e = r8
                r7.f132758f = r5
                r7.f132759g = r3
                java.lang.Object r8 = r1.d(r2, r7)
                if (r8 != r0) goto Laa
                goto La9
            L86:
                tx.b$a$b r3 = tx.b.a.C5034b.f192526a
                boolean r3 = fr.t.c(r8, r3)
                if (r3 == 0) goto Lad
                l61.w r1 = p081n61.f5.z9(r1)
                l61.w$a r3 = new l61.w$a
                i61.a r4 = i61.a.SUCCESS
                r3.<init>(r4)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f132757e = r8
                r7.f132758f = r5
                r7.f132759g = r2
                java.lang.Object r8 = r1.d(r3, r7)
                if (r8 != r0) goto Laa
            La9:
                return r0
            Laa:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            Lad:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: n61.f5.b0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.h hVar, State state, tq.e<? super oq.i0> eVar) {
            return f5.this.new b0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f132761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f132762e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f132764g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f132762e = obj;
            this.f132764g |= PKIFailureInfo.systemUnavail;
            return f5.this.J9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$x;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$x;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<a.SaveDiscountType, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132767g;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(f5 f5Var, k10.c0 c0Var, a.SaveDiscountType saveDiscountType, State state) {
            return State.b(f5Var.initialState, ((State) c0Var.a()).k(), ((State) c0Var.a()).getPassportTypeData(), ((State) c0Var.a()).getReasonData(), ((State) c0Var.a()).getTemporaryPassportReasonAttachmentsData(), ((State) c0Var.a()).getPassportOfficePlaceData(), ((State) c0Var.a()).getWhoAgreesData(), ((State) c0Var.a()).getParentFormData(), ((State) c0Var.a()).getPickedChildId(), ((State) c0Var.a()).getChildData(), ((State) c0Var.a()).getEnterChildContractData(), ((State) c0Var.a()).getDataSplitData(), ((State) c0Var.a()).getPhotoData(), ((State) c0Var.a()).getPhotoGlassesAttachment(), ((State) c0Var.a()).getPhotoFaceCoverAttachment(), ((State) c0Var.a()).getInstitutionData(), ((State) c0Var.a()).getSignedConsentAttachmentsData(), ((State) c0Var.a()).getOtherParentUnableToConsentAttachmentsData(), ((State) c0Var.a()).getCorrespondenceCountryData(), ((State) c0Var.a()).getCorrespondenceAddress(), ((State) c0Var.a()).getContactDetails(), ((State) c0Var.a()).getPickupMethod(), saveDiscountType.getDiscountTypeData(), null, null, null, null, null, null, null, null, null, null, -4194304, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SaveDiscountType saveDiscountType = (a.SaveDiscountType) this.f132766f;
            final k10.c0 c0Var = (k10.c0) this.f132767g;
            uq.b.e();
            if (this.f132765e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            l91.a.DiscountTypeData discountTypeData = ((State) c0Var.a()).getDiscountTypeData();
            if ((discountTypeData != null ? discountTypeData.getDiscountType() : null) == saveDiscountType.getDiscountTypeData().getDiscountType()) {
                return c0Var.c();
            }
            final f5 f5Var = f5.this;
            return c0Var.b(new er.l() { // from class: n61.y5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.c0.O(f5Var, c0Var, saveDiscountType, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveDiscountType saveDiscountType, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c0 c0Var2 = f5.this.new c0(eVar);
            c0Var2.f132766f = saveDiscountType;
            c0Var2.f132767g = c0Var;
            return c0Var2.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f132769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f132770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f132771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f132772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f132773h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f132774j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f132776l;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f132774j = obj;
            this.f132776l |= PKIFailureInfo.systemUnavail;
            return f5.this.P9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$a;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<p081n61.a.AttachmentsChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132779g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f132780a;

            static {
                int[] iArr = new int[b71.b.values().length];
                try {
                    iArr[b71.b.TEMPORARY_REASON.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b71.b.SIGNED_CONSENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b71.b.OTHER_PARENT_UNABLE_TO_CONSENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b71.b.OLD_APPLICATION_MONEY_TRANSFER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b71.b.NEW_APPLICATION_MONEY_TRANSFER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[b71.b.ABROAD_TREATMENT_CONFIRMATION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[b71.b.KDR_CONFIRMATION.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[b71.b.TECHNICAL_ISSUE_CONFIRMATION.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f132780a = iArr;
            }
        }

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(p081n61.a.AttachmentsChanged attachmentsChanged, State state) {
            switch (a.f132780a[attachmentsChanged.getAttachmentType().ordinal()]) {
                case 1:
                    return State.b(state, null, null, null, attachmentsChanged.getAttachmentsData(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, null);
                case 2:
                    return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, attachmentsChanged.getAttachmentsData(), new b71.c.AttachmentsData(pq.v.n(), null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -98305, null);
                case 3:
                    return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new b71.c.AttachmentsData(pq.v.n(), null, 2, null), attachmentsChanged.getAttachmentsData(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -98305, null);
                case 4:
                    return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, attachmentsChanged.getAttachmentsData(), new b71.c.AttachmentsData(pq.v.n(), null, 2, null), null, null, null, null, null, -100663297, null);
                case 5:
                    return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new b71.c.AttachmentsData(pq.v.n(), null, 2, null), attachmentsChanged.getAttachmentsData(), null, null, null, null, null, -100663297, null);
                case 6:
                    return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, attachmentsChanged.getAttachmentsData(), null, null, null, null, null, null, null, null, null, -4194305, null);
                case 7:
                    return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, attachmentsChanged.getAttachmentsData(), null, null, null, null, null, null, null, null, -8388609, null);
                case 8:
                    return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, attachmentsChanged.getAttachmentsData(), null, null, null, null, null, null, null, -16777217, null);
                default:
                    throw new oq.p();
            }
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final p081n61.a.AttachmentsChanged attachmentsChanged = (p081n61.a.AttachmentsChanged) this.f132778f;
            k10.c0 c0Var = (k10.c0) this.f132779g;
            uq.b.e();
            if (this.f132777e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.z5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.d0.O(attachmentsChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p081n61.a.AttachmentsChanged attachmentsChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d0 d0Var = new d0(eVar);
            d0Var.f132778f = attachmentsChanged;
            d0Var.f132779g = c0Var;
            return d0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f132781e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f132782f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f132783g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f132784h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f132785j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f132786k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f132787l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f132788m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f132789n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f132790p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f132791q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f132792r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f132793s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f132794t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f132795v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f132796w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f132797x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ State f132799z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(State state, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f132799z = state;
        }

        /* JADX WARN: Code duplicated, block: B:109:0x066f  */
        /* JADX WARN: Code duplicated, block: B:112:0x06c6  */
        /* JADX WARN: Code duplicated, block: B:115:0x06d2  */
        /* JADX WARN: Code duplicated, block: B:117:0x06d9  */
        /* JADX WARN: Code duplicated, block: B:120:0x072c  */
        /* JADX WARN: Code duplicated, block: B:125:0x0793  */
        /* JADX WARN: Code duplicated, block: B:128:0x07a2  */
        /* JADX WARN: Code duplicated, block: B:131:0x07b6  */
        /* JADX WARN: Code duplicated, block: B:132:0x07bd  */
        /* JADX WARN: Code duplicated, block: B:135:0x07dc  */
        /* JADX WARN: Code duplicated, block: B:138:0x07e9  */
        /* JADX WARN: Code duplicated, block: B:141:0x07f3  */
        /* JADX WARN: Code duplicated, block: B:142:0x07fa  */
        /* JADX WARN: Code duplicated, block: B:145:0x080a  */
        /* JADX WARN: Code duplicated, block: B:146:0x0811  */
        /* JADX WARN: Code duplicated, block: B:149:0x081b  */
        /* JADX WARN: Code duplicated, block: B:150:0x0822  */
        /* JADX WARN: Code duplicated, block: B:153:0x082c  */
        /* JADX WARN: Code duplicated, block: B:154:0x0835  */
        /* JADX WARN: Code duplicated, block: B:157:0x0841  */
        /* JADX WARN: Code duplicated, block: B:158:0x0846  */
        /* JADX WARN: Code duplicated, block: B:162:0x08b5  */
        /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x0370 A[PHI: r2
          0x0370: PHI (r2v6 java.lang.Object) = (r2v3 java.lang.Object), (r2v9 java.lang.Object) binds: [B:34:0x036d, B:28:0x0334] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x038c  */
        /* JADX WARN: Code duplicated, block: B:43:0x03a2 A[PHI: r2 r3
          0x03a2: PHI (r2v14 java.lang.Object) = (r2v11 java.lang.Object), (r2v19 java.lang.Object) binds: [B:41:0x039f, B:26:0x031a] A[DONT_GENERATE, DONT_INLINE]
          0x03a2: PHI (r3v12 java.util.List) = (r3v9 java.util.List), (r3v14 java.util.List) binds: [B:41:0x039f, B:26:0x031a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:46:0x03c0  */
        /* JADX WARN: Code duplicated, block: B:50:0x03d9 A[PHI: r2 r3 r4
          0x03d9: PHI (r2v24 java.lang.Object) = (r2v21 java.lang.Object), (r2v29 java.lang.Object) binds: [B:48:0x03d6, B:24:0x02f6] A[DONT_GENERATE, DONT_INLINE]
          0x03d9: PHI (r3v18 java.util.List) = (r3v15 java.util.List), (r3v22 java.util.List) binds: [B:48:0x03d6, B:24:0x02f6] A[DONT_GENERATE, DONT_INLINE]
          0x03d9: PHI (r4v15 java.util.List) = (r4v12 java.util.List), (r4v17 java.util.List) binds: [B:48:0x03d6, B:24:0x02f6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:53:0x03fa  */
        /* JADX WARN: Code duplicated, block: B:57:0x0418 A[PHI: r2 r3 r4 r5
          0x0418: PHI (r2v34 java.lang.Object) = (r2v31 java.lang.Object), (r2v39 java.lang.Object) binds: [B:55:0x0414, B:22:0x02c9] A[DONT_GENERATE, DONT_INLINE]
          0x0418: PHI (r3v26 java.util.List) = (r3v23 java.util.List), (r3v30 java.util.List) binds: [B:55:0x0414, B:22:0x02c9] A[DONT_GENERATE, DONT_INLINE]
          0x0418: PHI (r4v21 java.util.List) = (r4v18 java.util.List), (r4v25 java.util.List) binds: [B:55:0x0414, B:22:0x02c9] A[DONT_GENERATE, DONT_INLINE]
          0x0418: PHI (r5v15 java.util.List) = (r5v12 java.util.List), (r5v17 java.util.List) binds: [B:55:0x0414, B:22:0x02c9] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:60:0x043c  */
        /* JADX WARN: Code duplicated, block: B:64:0x045d A[PHI: r2 r3 r4 r5 r6
          0x045d: PHI (r2v44 java.lang.Object) = (r2v41 java.lang.Object), (r2v49 java.lang.Object) binds: [B:62:0x0459, B:20:0x0293] A[DONT_GENERATE, DONT_INLINE]
          0x045d: PHI (r3v34 java.util.List) = (r3v31 java.util.List), (r3v38 java.util.List) binds: [B:62:0x0459, B:20:0x0293] A[DONT_GENERATE, DONT_INLINE]
          0x045d: PHI (r4v29 java.util.List) = (r4v26 java.util.List), (r4v33 java.util.List) binds: [B:62:0x0459, B:20:0x0293] A[DONT_GENERATE, DONT_INLINE]
          0x045d: PHI (r5v21 java.util.List) = (r5v18 java.util.List), (r5v25 java.util.List) binds: [B:62:0x0459, B:20:0x0293] A[DONT_GENERATE, DONT_INLINE]
          0x045d: PHI (r6v15 java.util.List) = (r6v12 java.util.List), (r6v17 java.util.List) binds: [B:62:0x0459, B:20:0x0293] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:67:0x0483  */
        /* JADX WARN: Code duplicated, block: B:71:0x04a7 A[PHI: r2 r3 r4 r5 r6 r7
          0x04a7: PHI (r2v54 java.lang.Object) = (r2v51 java.lang.Object), (r2v59 java.lang.Object) binds: [B:69:0x04a3, B:18:0x0254] A[DONT_GENERATE, DONT_INLINE]
          0x04a7: PHI (r3v42 java.util.List) = (r3v39 java.util.List), (r3v46 java.util.List) binds: [B:69:0x04a3, B:18:0x0254] A[DONT_GENERATE, DONT_INLINE]
          0x04a7: PHI (r4v37 java.util.List) = (r4v34 java.util.List), (r4v41 java.util.List) binds: [B:69:0x04a3, B:18:0x0254] A[DONT_GENERATE, DONT_INLINE]
          0x04a7: PHI (r5v29 java.util.List) = (r5v26 java.util.List), (r5v33 java.util.List) binds: [B:69:0x04a3, B:18:0x0254] A[DONT_GENERATE, DONT_INLINE]
          0x04a7: PHI (r6v21 java.util.List) = (r6v18 java.util.List), (r6v25 java.util.List) binds: [B:69:0x04a3, B:18:0x0254] A[DONT_GENERATE, DONT_INLINE]
          0x04a7: PHI (r7v15 java.util.List) = (r7v12 java.util.List), (r7v17 java.util.List) binds: [B:69:0x04a3, B:18:0x0254] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:74:0x04cf  */
        /* JADX WARN: Code duplicated, block: B:78:0x04f6 A[PHI: r2 r3 r4 r5 r6 r7 r8
          0x04f6: PHI (r2v64 java.lang.Object) = (r2v61 java.lang.Object), (r2v69 java.lang.Object) binds: [B:76:0x04f2, B:16:0x020c] A[DONT_GENERATE, DONT_INLINE]
          0x04f6: PHI (r3v50 java.util.List) = (r3v47 java.util.List), (r3v54 java.util.List) binds: [B:76:0x04f2, B:16:0x020c] A[DONT_GENERATE, DONT_INLINE]
          0x04f6: PHI (r4v45 java.util.List) = (r4v42 java.util.List), (r4v49 java.util.List) binds: [B:76:0x04f2, B:16:0x020c] A[DONT_GENERATE, DONT_INLINE]
          0x04f6: PHI (r5v37 java.util.List) = (r5v34 java.util.List), (r5v41 java.util.List) binds: [B:76:0x04f2, B:16:0x020c] A[DONT_GENERATE, DONT_INLINE]
          0x04f6: PHI (r6v29 java.util.List) = (r6v26 java.util.List), (r6v33 java.util.List) binds: [B:76:0x04f2, B:16:0x020c] A[DONT_GENERATE, DONT_INLINE]
          0x04f6: PHI (r7v21 java.util.List) = (r7v18 java.util.List), (r7v25 java.util.List) binds: [B:76:0x04f2, B:16:0x020c] A[DONT_GENERATE, DONT_INLINE]
          0x04f6: PHI (r8v15 java.util.List) = (r8v12 java.util.List), (r8v17 java.util.List) binds: [B:76:0x04f2, B:16:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:81:0x0520  */
        /* JADX WARN: Code duplicated, block: B:85:0x054a A[PHI: r2 r3 r4 r5 r6 r7 r8 r9
          0x054a: PHI (r2v74 java.lang.Object) = (r2v71 java.lang.Object), (r2v79 java.lang.Object) binds: [B:83:0x0546, B:14:0x01bb] A[DONT_GENERATE, DONT_INLINE]
          0x054a: PHI (r3v58 java.util.List) = (r3v55 java.util.List), (r3v62 java.util.List) binds: [B:83:0x0546, B:14:0x01bb] A[DONT_GENERATE, DONT_INLINE]
          0x054a: PHI (r4v53 java.util.List) = (r4v50 java.util.List), (r4v57 java.util.List) binds: [B:83:0x0546, B:14:0x01bb] A[DONT_GENERATE, DONT_INLINE]
          0x054a: PHI (r5v45 java.util.List) = (r5v42 java.util.List), (r5v49 java.util.List) binds: [B:83:0x0546, B:14:0x01bb] A[DONT_GENERATE, DONT_INLINE]
          0x054a: PHI (r6v37 java.util.List) = (r6v34 java.util.List), (r6v41 java.util.List) binds: [B:83:0x0546, B:14:0x01bb] A[DONT_GENERATE, DONT_INLINE]
          0x054a: PHI (r7v29 java.util.List) = (r7v26 java.util.List), (r7v33 java.util.List) binds: [B:83:0x0546, B:14:0x01bb] A[DONT_GENERATE, DONT_INLINE]
          0x054a: PHI (r8v21 java.util.List) = (r8v18 java.util.List), (r8v25 java.util.List) binds: [B:83:0x0546, B:14:0x01bb] A[DONT_GENERATE, DONT_INLINE]
          0x054a: PHI (r9v15 java.util.List) = (r9v12 java.util.List), (r9v17 java.util.List) binds: [B:83:0x0546, B:14:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:88:0x0576  */
        /* JADX WARN: Code duplicated, block: B:92:0x05a3 A[PHI: r2 r3 r4 r5 r6 r7 r8 r9 r10
          0x05a3: PHI (r2v84 java.lang.Object) = (r2v81 java.lang.Object), (r2v89 java.lang.Object) binds: [B:90:0x059f, B:12:0x0161] A[DONT_GENERATE, DONT_INLINE]
          0x05a3: PHI (r3v66 java.util.List) = (r3v63 java.util.List), (r3v70 java.util.List) binds: [B:90:0x059f, B:12:0x0161] A[DONT_GENERATE, DONT_INLINE]
          0x05a3: PHI (r4v61 java.util.List) = (r4v58 java.util.List), (r4v65 java.util.List) binds: [B:90:0x059f, B:12:0x0161] A[DONT_GENERATE, DONT_INLINE]
          0x05a3: PHI (r5v53 java.util.List) = (r5v50 java.util.List), (r5v57 java.util.List) binds: [B:90:0x059f, B:12:0x0161] A[DONT_GENERATE, DONT_INLINE]
          0x05a3: PHI (r6v45 java.util.List) = (r6v42 java.util.List), (r6v49 java.util.List) binds: [B:90:0x059f, B:12:0x0161] A[DONT_GENERATE, DONT_INLINE]
          0x05a3: PHI (r7v37 java.util.List) = (r7v34 java.util.List), (r7v41 java.util.List) binds: [B:90:0x059f, B:12:0x0161] A[DONT_GENERATE, DONT_INLINE]
          0x05a3: PHI (r8v29 java.util.List) = (r8v26 java.util.List), (r8v33 java.util.List) binds: [B:90:0x059f, B:12:0x0161] A[DONT_GENERATE, DONT_INLINE]
          0x05a3: PHI (r9v21 java.util.List) = (r9v18 java.util.List), (r9v25 java.util.List) binds: [B:90:0x059f, B:12:0x0161] A[DONT_GENERATE, DONT_INLINE]
          0x05a3: PHI (r10v15 java.util.List) = (r10v12 java.util.List), (r10v17 java.util.List) binds: [B:90:0x059f, B:12:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:95:0x05d1  */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x05fd, code lost:
        
            if (r2 == r1) goto L32;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r52) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2392
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n61.f5.e.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return f5.this.new e(this.f132799z, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((e) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln61/a$y;", "<unused var>", "Ln61/c;", "Loq/i0;", "<anonymous>", "(Ln61/a$y;Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.q<a.y, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132800e;

        e0(tq.e<? super e0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f132800e;
            if (i15 == 0) {
                oq.u.b(obj);
                f5 f5Var = f5.this;
                this.f132800e = 1;
                if (f5Var.W9(this) == objE) {
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
        public final Object w(a.y yVar, State state, tq.e<? super oq.i0> eVar) {
            return f5.this.new e0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {
        int B;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f132802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f132803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f132804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f132805g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f132806h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f132807j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f132808k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f132809l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f132810m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f132811n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f132812p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f132813q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f132814r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f132815s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f132816t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f132817v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f132818w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f132819x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f132820y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        /* synthetic */ Object f132821z;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f132821z = obj;
            this.B |= PKIFailureInfo.systemUnavail;
            return f5.this.X9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln61/a$d;", "<unused var>", "Ln61/c;", "Loq/i0;", "<anonymous>", "(Ln61/a$d;Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<a.d, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132822e;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f132822e;
            if (i15 == 0) {
                oq.u.b(obj);
                f5 f5Var = f5.this;
                n61.b.a aVar = n61.b.a.f132454a;
                this.f132822e = 1;
                if (f5Var.F(aVar, this) == objE) {
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
        public final Object w(a.d dVar, State state, tq.e<? super oq.i0> eVar) {
            return f5.this.new f0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln61/a$l;", "<unused var>", "Ln61/c;", "Loq/i0;", "<anonymous>", "(Ln61/a$l;Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a.l, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132824e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f132824e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            f5.this.d9(new a.RestoreDraft(new p081n61.b.NavigateToDestination(n61.d.g0.f132579a)));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.l lVar, State state, tq.e<? super oq.i0> eVar) {
            return f5.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln61/a$e;", "<unused var>", "Ln61/c;", "Loq/i0;", "<anonymous>", "(Ln61/a$e;Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.q<a.e, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132826e;

        g0(tq.e<? super g0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f132826e;
            if (i15 == 0) {
                oq.u.b(obj);
                f5 f5Var = f5.this;
                this.f132826e = 1;
                if (f5Var.W9(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            f5.this.d9(a.d.f132400a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.e eVar, State state, tq.e<? super oq.i0> eVar2) {
            return f5.this.new g0(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln61/a$k0;", "<unused var>", "Ln61/c;", "Loq/i0;", "<anonymous>", "(Ln61/a$k0;Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.k0, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132828e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f132828e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            f5.this.d9(new a.RestoreDraft(new p081n61.b.NavigateToDestination(n61.d.q0.f132649a)));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.k0 k0Var, State state, tq.e<? super oq.i0> eVar) {
            return f5.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$h0;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$h0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.q<a.SaveSummaryData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132832g;

        h0(tq.e<? super h0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.SaveSummaryData saveSummaryData, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, saveSummaryData.getSummaryData(), null, null, null, null, -134217729, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SaveSummaryData saveSummaryData = (a.SaveSummaryData) this.f132831f;
            k10.c0 c0Var = (k10.c0) this.f132832g;
            uq.b.e();
            if (this.f132830e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.a6
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.h0.O(saveSummaryData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveSummaryData saveSummaryData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h0 h0Var = new h0(eVar);
            h0Var.f132831f = saveSummaryData;
            h0Var.f132832g = c0Var;
            return h0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$l0;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$l0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a.UpdateDestinationsBackstack, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132835g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.UpdateDestinationsBackstack updateDestinationsBackstack, State state) {
            return State.b(state, updateDestinationsBackstack.a(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.UpdateDestinationsBackstack updateDestinationsBackstack = (a.UpdateDestinationsBackstack) this.f132834f;
            k10.c0 c0Var = (k10.c0) this.f132835g;
            uq.b.e();
            if (this.f132833e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.g5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.i.O(updateDestinationsBackstack, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.UpdateDestinationsBackstack updateDestinationsBackstack, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f132834f = updateDestinationsBackstack;
            iVar.f132835g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$r;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.q<a.SaveApplicationId, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132837f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132838g;

        i0(tq.e<? super i0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.SaveApplicationId saveApplicationId, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, saveApplicationId.getApplicationId(), null, -1073741825, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SaveApplicationId saveApplicationId = (a.SaveApplicationId) this.f132837f;
            k10.c0 c0Var = (k10.c0) this.f132838g;
            uq.b.e();
            if (this.f132836e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.b6
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.i0.O(saveApplicationId, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveApplicationId saveApplicationId, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i0 i0Var = new i0(eVar);
            i0Var.f132837f = saveApplicationId;
            i0Var.f132838g = c0Var;
            return i0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$k;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a.PassportTypeChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132840f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132841g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(f5 f5Var, a.PassportTypeChanged passportTypeChanged, k10.c0 c0Var, State state) {
            return State.b(f5Var.initialState, ((State) c0Var.a()).k(), passportTypeChanged.getData(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.PassportTypeChanged passportTypeChanged = (a.PassportTypeChanged) this.f132840f;
            final k10.c0 c0Var = (k10.c0) this.f132841g;
            uq.b.e();
            if (this.f132839e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((State) c0Var.a()).getPassportTypeData().getPassportType() == passportTypeChanged.getData().getPassportType()) {
                return c0Var.c();
            }
            final f5 f5Var = f5.this;
            return c0Var.b(new er.l() { // from class: n61.h5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.j.O(f5Var, passportTypeChanged, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.PassportTypeChanged passportTypeChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = f5.this.new j(eVar);
            jVar.f132840f = passportTypeChanged;
            jVar.f132841g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$a0;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$a0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j0 extends vq.k implements er.q<a.SaveFaceDetectionData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132844f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132845g;

        j0(tq.e<? super j0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.SaveFaceDetectionData saveFaceDetectionData, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, saveFaceDetectionData.getFaceDetectionData(), null, null, null, -268435457, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SaveFaceDetectionData saveFaceDetectionData = (a.SaveFaceDetectionData) this.f132844f;
            k10.c0 c0Var = (k10.c0) this.f132845g;
            uq.b.e();
            if (this.f132843e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.c6
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.j0.O(saveFaceDetectionData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveFaceDetectionData saveFaceDetectionData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j0 j0Var = new j0(eVar);
            j0Var.f132844f = saveFaceDetectionData;
            j0Var.f132845g = c0Var;
            return j0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$n;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<a.ReasonChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132847f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132848g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(f5 f5Var, k10.c0 c0Var, a.ReasonChanged reasonChanged, State state) {
            return State.b(f5Var.initialState, ((State) c0Var.a()).k(), ((State) c0Var.a()).getPassportTypeData(), ((State) c0Var.a()).getReasonData().a(reasonChanged.getReasonData().getReason()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.ReasonChanged reasonChanged = (a.ReasonChanged) this.f132847f;
            final k10.c0 c0Var = (k10.c0) this.f132848g;
            uq.b.e();
            if (this.f132846e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((State) c0Var.a()).getReasonData().getReason() == reasonChanged.getReasonData().getReason()) {
                return c0Var.c();
            }
            final f5 f5Var = f5.this;
            return c0Var.b(new er.l() { // from class: n61.i5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.k.O(f5Var, c0Var, reasonChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.ReasonChanged reasonChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = f5.this.new k(eVar);
            kVar.f132847f = reasonChanged;
            kVar.f132848g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$b0;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$b0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k0 extends vq.k implements er.q<a.SaveHowToPay, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132852g;

        k0(tq.e<? super k0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.SaveHowToPay saveHowToPay, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, saveHowToPay.getPaymentType(), null, null, -536870913, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SaveHowToPay saveHowToPay = (a.SaveHowToPay) this.f132851f;
            k10.c0 c0Var = (k10.c0) this.f132852g;
            uq.b.e();
            if (this.f132850e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.d6
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.k0.O(saveHowToPay, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveHowToPay saveHowToPay, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k0 k0Var = new k0(eVar);
            k0Var.f132851f = saveHowToPay;
            k0Var.f132852g = c0Var;
            return k0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$j;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a.PassportOfficePlaceChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132854f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132855g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(f5 f5Var, k10.c0 c0Var, a.PassportOfficePlaceChanged passportOfficePlaceChanged, State state) {
            return State.b(f5Var.initialState, ((State) c0Var.a()).k(), ((State) c0Var.a()).getPassportTypeData(), ((State) c0Var.a()).getReasonData(), ((State) c0Var.a()).getTemporaryPassportReasonAttachmentsData(), passportOfficePlaceChanged.getData(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.PassportOfficePlaceChanged passportOfficePlaceChanged = (a.PassportOfficePlaceChanged) this.f132854f;
            final k10.c0 c0Var = (k10.c0) this.f132855g;
            uq.b.e();
            if (this.f132853e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((State) c0Var.a()).getPassportOfficePlaceData().getPassportOfficePlace() == passportOfficePlaceChanged.getData().getPassportOfficePlace()) {
                return c0Var.c();
            }
            final f5 f5Var = f5.this;
            return c0Var.b(new er.l() { // from class: n61.j5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.l.O(f5Var, c0Var, passportOfficePlaceChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.PassportOfficePlaceChanged passportOfficePlaceChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = f5.this.new l(eVar);
            lVar.f132854f = passportOfficePlaceChanged;
            lVar.f132855g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$s;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l0 extends vq.k implements er.q<a.SaveApplicationNumber, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132857e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132858f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132859g;

        l0(tq.e<? super l0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.SaveApplicationNumber saveApplicationNumber, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, saveApplicationNumber.getApplicationNumber(), Integer.MAX_VALUE, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SaveApplicationNumber saveApplicationNumber = (a.SaveApplicationNumber) this.f132858f;
            k10.c0 c0Var = (k10.c0) this.f132859g;
            uq.b.e();
            if (this.f132857e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.e6
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.l0.O(saveApplicationNumber, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveApplicationNumber saveApplicationNumber, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l0 l0Var = new l0(eVar);
            l0Var.f132858f = saveApplicationNumber;
            l0Var.f132859g = c0Var;
            return l0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$m0;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$m0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a.WhoAgreesChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132862g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(f5 f5Var, k10.c0 c0Var, a.WhoAgreesChanged whoAgreesChanged, State state) {
            return State.b(f5Var.initialState, ((State) c0Var.a()).k(), ((State) c0Var.a()).getPassportTypeData(), ((State) c0Var.a()).getReasonData(), ((State) c0Var.a()).getTemporaryPassportReasonAttachmentsData(), ((State) c0Var.a()).getPassportOfficePlaceData(), whoAgreesChanged.getData(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -64, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.WhoAgreesChanged whoAgreesChanged = (a.WhoAgreesChanged) this.f132861f;
            final k10.c0 c0Var = (k10.c0) this.f132862g;
            uq.b.e();
            if (this.f132860e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((State) c0Var.a()).getWhoAgreesData().getWhoAgrees() == whoAgreesChanged.getData().getWhoAgrees()) {
                return c0Var.c();
            }
            final f5 f5Var = f5.this;
            return c0Var.b(new er.l() { // from class: n61.k5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.m.O(f5Var, c0Var, whoAgreesChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.WhoAgreesChanged whoAgreesChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = f5.this.new m(eVar);
            mVar.f132861f = whoAgreesChanged;
            mVar.f132862g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln61/a$i0;", "<unused var>", "Ln61/c;", "Loq/i0;", "<anonymous>", "(Ln61/a$i0;Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m0 extends vq.k implements er.q<a.i0, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132864e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p081n61.f f132866g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(p081n61.f fVar, tq.e<? super m0> eVar) {
            super(3, eVar);
            this.f132866g = fVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f132864e;
            if (i15 == 0) {
                oq.u.b(obj);
                f5 f5Var = f5.this;
                p081n61.b.ShowDialog showDialog = new p081n61.b.ShowDialog(this.f132866g.b(new p081n61.f.Params(f5.this.b9(a.e.f132402a))));
                this.f132864e = 1;
                if (f5Var.F(showDialog, this) == objE) {
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
        public final Object w(a.i0 i0Var, State state, tq.e<? super oq.i0> eVar) {
            return f5.this.new m0(this.f132866g, eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$d0;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$d0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<a.SaveParentFormData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132869g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.SaveParentFormData saveParentFormData, State state) {
            return State.b(state, null, null, null, null, null, null, saveParentFormData.getParentFormData(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SaveParentFormData saveParentFormData = (a.SaveParentFormData) this.f132868f;
            k10.c0 c0Var = (k10.c0) this.f132869g;
            uq.b.e();
            if (this.f132867e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.l5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.n.O(saveParentFormData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveParentFormData saveParentFormData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = new n(eVar);
            nVar.f132868f = saveParentFormData;
            nVar.f132869g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$c;", "<unused var>", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n0 extends vq.k implements er.q<a.c, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132871f;

        n0(tq.e<? super n0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741825, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f132871f;
            uq.b.e();
            if (this.f132870e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.f6
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.n0.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.c cVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n0 n0Var = new n0(eVar);
            n0Var.f132871f = c0Var;
            return n0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$b;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<a.ChildIdChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132873f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132874g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.ChildIdChanged childIdChanged, State state) {
            return State.b(state, null, null, null, null, null, null, null, childIdChanged.getChildId(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.ChildIdChanged childIdChanged = (a.ChildIdChanged) this.f132873f;
            k10.c0 c0Var = (k10.c0) this.f132874g;
            uq.b.e();
            if (this.f132872e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.m5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.o.O(childIdChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.ChildIdChanged childIdChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = new o(eVar);
            oVar.f132873f = childIdChanged;
            oVar.f132874g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln61/a$j0;", "<unused var>", "Ln61/c;", "Loq/i0;", "<anonymous>", "(Ln61/a$j0;Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class o0 extends vq.k implements er.q<a.j0, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132875e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a5 f132877g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(a5 a5Var, tq.e<? super o0> eVar) {
            super(3, eVar);
            this.f132877g = a5Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f132875e;
            if (i15 == 0) {
                oq.u.b(obj);
                f5 f5Var = f5.this;
                p081n61.b.ShowDialog showDialog = new p081n61.b.ShowDialog(this.f132877g.b(new a5.Params(f5.this.b9(a.d.f132400a), f5.this.b9(a.f.f132405a), f5.this.b9(new a.RestoreDraft(null, 1, null)))));
                this.f132875e = 1;
                if (f5Var.F(showDialog, this) == objE) {
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
        public final Object w(a.j0 j0Var, State state, tq.e<? super oq.i0> eVar) {
            return f5.this.new o0(this.f132877g, eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$t;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a.SaveChildData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132880g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(f5 f5Var, k10.c0 c0Var, a.SaveChildData saveChildData, DataSplitData dataSplitData, State state) {
            return State.b(f5Var.initialState, ((State) c0Var.a()).k(), ((State) c0Var.a()).getPassportTypeData(), ((State) c0Var.a()).getReasonData(), ((State) c0Var.a()).getTemporaryPassportReasonAttachmentsData(), ((State) c0Var.a()).getPassportOfficePlaceData(), ((State) c0Var.a()).getWhoAgreesData(), ((State) c0Var.a()).getParentFormData(), ((State) c0Var.a()).getPickedChildId(), saveChildData.getChildData(), new k81.a.EnterChildContractData(null, null), dataSplitData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2048, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            PassportChildApplicationGetChildData childData;
            PassportChildApplicationGetChildData childData2;
            iy.b0 pesel;
            PassportChildApplicationGetChildData childData3;
            iy.b0 pesel2;
            final a.SaveChildData saveChildData = (a.SaveChildData) this.f132879f;
            final k10.c0 c0Var = (k10.c0) this.f132880g;
            uq.b.e();
            if (this.f132878e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            ChildDataResult childData4 = ((State) c0Var.a()).getChildData();
            final DataSplitData dataSplitDataR9 = null;
            String strE = (childData4 == null || (childData3 = childData4.getChildData()) == null || (pesel2 = childData3.getPesel()) == null) ? null : iy.c0.e(pesel2);
            ChildDataResult childData5 = saveChildData.getChildData();
            if (fr.t.c(strE, (childData5 == null || (childData2 = childData5.getChildData()) == null || (pesel = childData2.getPesel()) == null) ? null : iy.c0.e(pesel))) {
                return c0Var.c();
            }
            ChildDataResult childData6 = saveChildData.getChildData();
            if (childData6 != null && (childData = childData6.getChildData()) != null) {
                dataSplitDataR9 = f5.this.R9(childData.getFirstName(), childData.getSecondName(), childData.getOtherName(), childData.getLastName(), childData.getBirthPlace());
            }
            final f5 f5Var = f5.this;
            return c0Var.b(new er.l() { // from class: n61.n5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.p.O(f5Var, c0Var, saveChildData, dataSplitDataR9, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveChildData saveChildData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            p pVar = f5.this.new p(eVar);
            pVar.f132879f = saveChildData;
            pVar.f132880g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln61/a$f;", "<unused var>", "Ln61/c;", "Loq/i0;", "<anonymous>", "(Ln61/a$f;Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class p0 extends vq.k implements er.q<a.f, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132882e;

        p0(tq.e<? super p0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.a(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f132882e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                n61.f5 r5 = p081n61.f5.this
                y51.a r5 = p081n61.f5.o9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f132882e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                n61.f5 r5 = p081n61.f5.this
                l61.k r5 = p081n61.f5.p9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f132882e = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: n61.f5.p0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.f fVar, State state, tq.e<? super oq.i0> eVar) {
            return f5.this.new p0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln61/c;", "it", "Loq/i0;", "<anonymous>", "(Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.p<State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132884e;

        q(tq.e<? super q> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f132884e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (f5.this.isDocumentPhotoFeatureFlagActiveUC.a(gz.b.a.C1792a.f78542a).booleanValue()) {
                f5.this.d9(a.h.f132411a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super oq.i0> eVar) {
            return ((q) v(state, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return f5.this.new q(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln61/a$o;", "action", "Ln61/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln61/a$o;Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class q0 extends vq.k implements er.q<p081n61.a.RestoreDraft, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132887f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f132889e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f132890f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f132891g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f132892h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ f5 f132893j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ p081n61.a.RestoreDraft f132894k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f5 f5Var, p081n61.a.RestoreDraft restoreDraft, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f132893j = f5Var;
                this.f132894k = restoreDraft;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0085  */
            /* JADX WARN: Code duplicated, block: B:30:0x0097  */
            /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
            /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
            
                if (r7.a(r4, r6) == r0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
            
                if (r1.F(r3, r6) == r0) goto L32;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
                /*
                    r6 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r6.f132892h
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L3d
                    if (r1 == r5) goto L39
                    if (r1 == r4) goto L31
                    if (r1 == r3) goto L29
                    if (r1 != r2) goto L21
                    java.lang.Object r0 = r6.f132890f
                    i61.e r0 = (i61.ChildPassportApplicationDraft) r0
                    java.lang.Object r0 = r6.f132889e
                    i61.e r0 = (i61.ChildPassportApplicationDraft) r0
                    oq.u.b(r7)
                    goto Lc1
                L21:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L29:
                    java.lang.Object r1 = r6.f132889e
                    i61.e r1 = (i61.ChildPassportApplicationDraft) r1
                    oq.u.b(r7)
                    goto L82
                L31:
                    java.lang.Object r1 = r6.f132889e
                    i61.e r1 = (i61.ChildPassportApplicationDraft) r1
                    oq.u.b(r7)
                    goto L6f
                L39:
                    oq.u.b(r7)
                    goto L51
                L3d:
                    oq.u.b(r7)
                    n61.f5 r7 = r6.f132893j
                    l61.l r7 = p081n61.f5.q9(r7)
                    gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                    r6.f132892h = r5
                    java.lang.Object r7 = r7.a(r1, r6)
                    if (r7 != r0) goto L51
                    goto Lb2
                L51:
                    dx.i r7 = (dx.i) r7
                    java.lang.Object r7 = r7.a()
                    i61.e r7 = (i61.ChildPassportApplicationDraft) r7
                    if (r7 != 0) goto L83
                    n61.f5 r1 = r6.f132893j
                    y51.a r1 = p081n61.f5.o9(r1)
                    gz.b$a$a r5 = gz.b.a.C1792a.f78542a
                    r6.f132889e = r7
                    r6.f132892h = r4
                    java.lang.Object r1 = r1.c(r5, r6)
                    if (r1 != r0) goto L6e
                    goto Lb2
                L6e:
                    r1 = r7
                L6f:
                    n61.f5 r7 = r6.f132893j
                    l61.k r7 = p081n61.f5.p9(r7)
                    gz.b$a$a r4 = gz.b.a.C1792a.f78542a
                    r6.f132889e = r1
                    r6.f132892h = r3
                    java.lang.Object r7 = r7.a(r4, r6)
                    if (r7 != r0) goto L82
                    goto Lb2
                L82:
                    r7 = r1
                L83:
                    if (r7 == 0) goto Lc1
                    n61.f5 r1 = r6.f132893j
                    n61.a$o r3 = r6.f132894k
                    n61.a$i r4 = new n61.a$i
                    r4.<init>(r7)
                    p081n61.f5.m9(r1, r4)
                    n61.b r4 = r3.getNavigateAfterRestore()
                    if (r4 == 0) goto Lb3
                    n61.b r3 = r3.getNavigateAfterRestore()
                    java.lang.Object r4 = vq.j.a(r7)
                    r6.f132889e = r4
                    java.lang.Object r7 = vq.j.a(r7)
                    r6.f132890f = r7
                    r7 = 0
                    r6.f132891g = r7
                    r6.f132892h = r2
                    java.lang.Object r7 = r1.F(r3, r6)
                    if (r7 != r0) goto Lc1
                Lb2:
                    return r0
                Lb3:
                    java.util.List r7 = r7.h()
                    if (r7 == 0) goto Lc1
                    n61.a$p r0 = new n61.a$p
                    r0.<init>(r7)
                    p081n61.f5.m9(r1, r0)
                Lc1:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: n61.f5.q0.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f132893j, this.f132894k, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        q0(tq.e<? super q0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p081n61.a.RestoreDraft restoreDraft = (p081n61.a.RestoreDraft) this.f132887f;
            Object objE = uq.b.e();
            int i15 = this.f132886e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = f5.this.callActionWithLoaderUseCase;
                a aVar2 = new a(f5.this, restoreDraft, null);
                this.f132887f = vq.j.a(restoreDraft);
                this.f132886e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(p081n61.a.RestoreDraft restoreDraft, State state, tq.e<? super oq.i0> eVar) {
            q0 q0Var = f5.this.new q0(eVar);
            q0Var.f132887f = restoreDraft;
            return q0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$z;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$z;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<a.SaveEnterChildSetupData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132896f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132897g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, a.SaveEnterChildSetupData saveEnterChildSetupData, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, k81.a.EnterChildContractData.b(((State) c0Var.a()).getEnterChildContractData(), new k81.a.EnterChildSetupData(saveEnterChildSetupData.getData(), ((State) c0Var.a()).getWhoAgreesData().getWhoAgrees(), ((State) c0Var.a()).getPassportTypeData().getPassportType(), ((State) c0Var.a()).getPassportOfficePlaceData().getPassportOfficePlace()), null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SaveEnterChildSetupData saveEnterChildSetupData = (a.SaveEnterChildSetupData) this.f132896f;
            final k10.c0 c0Var = (k10.c0) this.f132897g;
            uq.b.e();
            if (this.f132895e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.o5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.r.O(c0Var, saveEnterChildSetupData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveEnterChildSetupData saveEnterChildSetupData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            r rVar = new r(eVar);
            rVar.f132896f = saveEnterChildSetupData;
            rVar.f132897g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$i;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r0 extends vq.k implements er.q<a.LoadRestoredData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {
        int A;
        int B;
        int C;
        int D;
        int E;
        /* synthetic */ Object F;
        /* synthetic */ Object G;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f132898e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f132899f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f132900g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f132901h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f132902j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f132903k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f132904l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f132905m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f132906n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f132907p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f132908q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f132909r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f132910s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f132911t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f132912v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f132913w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f132914x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f132915y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f132916z;

        r0(tq.e<? super r0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.LoadRestoredData loadRestoredData, List list, wx.i.Image image, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, f5 f5Var, State state) {
            List<String> listH = loadRestoredData.getData().h();
            if (listH == null) {
                listH = pq.v.n();
            }
            List<String> list11 = listH;
            a.PassportTypeData passportTypeData = new a.PassportTypeData(loadRestoredData.getData().getPassportType());
            r91.a.PassportOfficePlaceData passportOfficePlaceData = new r91.a.PassportOfficePlaceData(loadRestoredData.getData().getOfficePlace());
            da1.a.WhoAgreesData whoAgreesData = new da1.a.WhoAgreesData(loadRestoredData.getData().getWhoAgrees());
            String pickedChildId = loadRestoredData.getData().getPickedChildId();
            ParentFormData parentFormData = loadRestoredData.getData().getParentFormData();
            ChildDataResult childData = loadRestoredData.getData().getChildData();
            EnterChildValidatedData enterChildValidatedData = loadRestoredData.getData().getEnterChildValidatedData();
            iy.b0 firstName = enterChildValidatedData != null ? enterChildValidatedData.getFirstName() : null;
            EnterChildValidatedData enterChildValidatedData2 = loadRestoredData.getData().getEnterChildValidatedData();
            iy.b0 secondName = enterChildValidatedData2 != null ? enterChildValidatedData2.getSecondName() : null;
            EnterChildValidatedData enterChildValidatedData3 = loadRestoredData.getData().getEnterChildValidatedData();
            iy.b0 otherName = enterChildValidatedData3 != null ? enterChildValidatedData3.getOtherName() : null;
            EnterChildValidatedData enterChildValidatedData4 = loadRestoredData.getData().getEnterChildValidatedData();
            iy.b0 lastName = enterChildValidatedData4 != null ? enterChildValidatedData4.getLastName() : null;
            EnterChildValidatedData enterChildValidatedData5 = loadRestoredData.getData().getEnterChildValidatedData();
            iy.b0 pesel = enterChildValidatedData5 != null ? enterChildValidatedData5.getPesel() : null;
            EnterChildValidatedData enterChildValidatedData6 = loadRestoredData.getData().getEnterChildValidatedData();
            fz.b.LocalDate birthDate = enterChildValidatedData6 != null ? enterChildValidatedData6.getBirthDate() : null;
            EnterChildValidatedData enterChildValidatedData7 = loadRestoredData.getData().getEnterChildValidatedData();
            iy.b0 birthPlace = enterChildValidatedData7 != null ? enterChildValidatedData7.getBirthPlace() : null;
            EnterChildCheckboxes enterChildCheckboxes = loadRestoredData.getData().getEnterChildCheckboxes();
            boolean noNameSwitchChecked = enterChildCheckboxes != null ? enterChildCheckboxes.getNoNameSwitchChecked() : false;
            EnterChildCheckboxes enterChildCheckboxes2 = loadRestoredData.getData().getEnterChildCheckboxes();
            boolean noLastNameSwitchChecked = enterChildCheckboxes2 != null ? enterChildCheckboxes2.getNoLastNameSwitchChecked() : false;
            EnterChildCheckboxes enterChildCheckboxes3 = loadRestoredData.getData().getEnterChildCheckboxes();
            k81.a.EnterChildContractData enterChildContractData = new k81.a.EnterChildContractData(new k81.a.EnterChildSetupData(new i61.n(firstName, secondName, otherName, lastName, pesel, birthDate, birthPlace, noNameSwitchChecked, noLastNameSwitchChecked, enterChildCheckboxes3 != null ? enterChildCheckboxes3.getCitizenshipCheckBoxChecked() : false, null), loadRestoredData.getData().getWhoAgrees(), loadRestoredData.getData().getPassportType(), loadRestoredData.getData().getOfficePlace()), loadRestoredData.getData().getEnterChildValidatedData());
            b71.c.AttachmentsData attachmentsData = new b71.c.AttachmentsData(list == null ? pq.v.n() : list, null, 2, null);
            t91.a.ChildPassportApplicationReasonData childPassportApplicationReasonData = new t91.a.ChildPassportApplicationReasonData(loadRestoredData.getData().getReasonType());
            AddPhotoData addPhotoData = image != null ? new AddPhotoData(image, loadRestoredData.getData().getPhotoData().getIsFaceCoveringPhotoOptionChecked(), loadRestoredData.getData().getPhotoData().getIsPhotoWithGlassesOptionChecked()) : null;
            u61.b.AttachmentsData attachmentsData2 = new u61.b.AttachmentsData(list2 == null ? pq.v.n() : list2);
            u61.b.AttachmentsData attachmentsData3 = new u61.b.AttachmentsData(list3 == null ? pq.v.n() : list3);
            BEPassportChildApplicationOfficeDictionary institutionData = loadRestoredData.getData().getInstitutionData();
            u81.a.ChildPassportApplicationInstitutionData childPassportApplicationInstitutionData = institutionData != null ? new u81.a.ChildPassportApplicationInstitutionData(institutionData) : null;
            DataSplitData dataSplitData = loadRestoredData.getData().getDataSplitData();
            b71.c.AttachmentsData attachmentsData4 = new b71.c.AttachmentsData(list4 == null ? pq.v.n() : list4, null, 2, null);
            b71.c.AttachmentsData attachmentsData5 = new b71.c.AttachmentsData(list5 == null ? pq.v.n() : list5, null, 2, null);
            List listN = list6 == null ? pq.v.n() : list6;
            ChildDataApplicationAttachmentData oldMoneyTransferAttachmentsData = loadRestoredData.getData().getOldMoneyTransferAttachmentsData();
            b71.c.AttachmentsData attachmentsData6 = new b71.c.AttachmentsData(listN, oldMoneyTransferAttachmentsData != null ? oldMoneyTransferAttachmentsData.getIsStatementChecked() : null);
            b71.c.AttachmentsData attachmentsData7 = new b71.c.AttachmentsData(list7 == null ? pq.v.n() : list7, null, 2, null);
            ContactDetailsData contactDetails = loadRestoredData.getData().getContactDetails();
            m71.a.ChildPassportApplicationContactDetailsData childPassportApplicationContactDetailsData = contactDetails != null ? new m71.a.ChildPassportApplicationContactDetailsData(new ContactDetailsFormData(contactDetails, f5Var.mapper.b())) : null;
            BEPassportChildApplicationCountryDictionary correspondenceCountryData = loadRestoredData.getData().getCorrespondenceCountryData();
            ChildPassportApplicationCorrespondenceCountryData childPassportApplicationCorrespondenceCountryData = correspondenceCountryData != null ? new ChildPassportApplicationCorrespondenceCountryData(correspondenceCountryData) : null;
            i61.d correspondenceAddress = loadRestoredData.getData().getCorrespondenceAddress();
            i61.r pickupMethod = loadRestoredData.getData().getPickupMethod();
            o91.a.ChildPassportApplicationPickupMethodData childPassportApplicationPickupMethodData = pickupMethod != null ? new o91.a.ChildPassportApplicationPickupMethodData(pickupMethod) : null;
            b71.c.AttachmentsData attachmentsData8 = new b71.c.AttachmentsData(list8 == null ? pq.v.n() : list8, null, 2, null);
            b71.c.AttachmentsData attachmentsData9 = new b71.c.AttachmentsData(list9 == null ? pq.v.n() : list9, null, 2, null);
            b71.c.AttachmentsData attachmentsData10 = new b71.c.AttachmentsData(list10 == null ? pq.v.n() : list10, null, 2, null);
            i61.l discountTypeData = loadRestoredData.getData().getDiscountTypeData();
            l91.a.DiscountTypeData discountTypeData2 = discountTypeData != null ? new l91.a.DiscountTypeData(discountTypeData) : null;
            SummaryCheckBox summaryCheckBox = loadRestoredData.getData().getSummaryCheckBox();
            y91.c.SummaryData summaryData = summaryCheckBox != null ? new y91.c.SummaryData(summaryCheckBox.getStatementChecked()) : null;
            ChildPassportApplicationFaceDetectionData faceDetectionData = loadRestoredData.getData().getFaceDetectionData();
            return new State(list11, passportTypeData, childPassportApplicationReasonData, attachmentsData, passportOfficePlaceData, whoAgreesData, parentFormData, pickedChildId, childData, enterChildContractData, dataSplitData, addPhotoData, attachmentsData2, attachmentsData3, childPassportApplicationInstitutionData, attachmentsData4, attachmentsData5, childPassportApplicationCorrespondenceCountryData, correspondenceAddress, childPassportApplicationContactDetailsData, childPassportApplicationPickupMethodData, discountTypeData2, attachmentsData8, attachmentsData9, attachmentsData10, attachmentsData6, attachmentsData7, summaryData, faceDetectionData != null ? new n81.a.FaceDetectionData(faceDetectionData.getIdentityPhotoEnabled()) : null, loadRestoredData.getData().getPaymentType(), loadRestoredData.getData().getApplicationId(), null);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x0470  */
        /* JADX WARN: Code duplicated, block: B:52:0x04c3  */
        /* JADX WARN: Code duplicated, block: B:55:0x04c9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0751 -> B:115:0x075f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0812 -> B:130:0x0821). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x08e0 -> B:145:0x08f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x09b4 -> B:160:0x09c6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x03ae -> B:25:0x03b3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0433 -> B:38:0x0437). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x04c3 -> B:53:0x04c5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0556 -> B:68:0x055a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x05f1 -> B:83:0x05f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x069e -> B:100:0x06aa). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r34) {
            /*
                Method dump skipped, instruction units count: 2788
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n61.f5.r0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.LoadRestoredData loadRestoredData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            r0 r0Var = f5.this.new r0(eVar);
            r0Var.F = loadRestoredData;
            r0Var.G = c0Var;
            return r0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$q;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<a.SaveAllEnterChildData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132918f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132919g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.SaveAllEnterChildData saveAllEnterChildData, f5 f5Var, k10.c0 c0Var, State state) {
            EnterChildValidatedData validatedData = saveAllEnterChildData.getValidatedData();
            DataSplitData dataSplitDataR9 = f5Var.R9(validatedData.getFirstName(), validatedData.getSecondName(), validatedData.getOtherName(), validatedData.getLastName(), validatedData.getBirthPlace());
            return State.b(f5Var.initialState, ((State) c0Var.a()).k(), ((State) c0Var.a()).getPassportTypeData(), ((State) c0Var.a()).getReasonData(), ((State) c0Var.a()).getTemporaryPassportReasonAttachmentsData(), ((State) c0Var.a()).getPassportOfficePlaceData(), ((State) c0Var.a()).getWhoAgreesData(), ((State) c0Var.a()).getParentFormData(), null, null, ((State) c0Var.a()).getEnterChildContractData().a(new k81.a.EnterChildSetupData(saveAllEnterChildData.getFormData(), ((State) c0Var.a()).getWhoAgreesData().getWhoAgrees(), ((State) c0Var.a()).getPassportTypeData().getPassportType(), ((State) c0Var.a()).getPassportOfficePlaceData().getPassportOfficePlace()), saveAllEnterChildData.getValidatedData()), dataSplitDataR9, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1920, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SaveAllEnterChildData saveAllEnterChildData = (a.SaveAllEnterChildData) this.f132918f;
            final k10.c0 c0Var = (k10.c0) this.f132919g;
            uq.b.e();
            if (this.f132917e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(((State) c0Var.a()).getEnterChildContractData().getEnterChildValidatedData(), saveAllEnterChildData.getValidatedData())) {
                return c0Var.c();
            }
            final f5 f5Var = f5.this;
            return c0Var.b(new er.l() { // from class: n61.p5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.s.O(saveAllEnterChildData, f5Var, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveAllEnterChildData saveAllEnterChildData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            s sVar = f5.this.new s(eVar);
            sVar.f132918f = saveAllEnterChildData;
            sVar.f132919g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln61/a$p;", "action", "Ln61/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln61/a$p;Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s0 extends vq.k implements er.q<a.RestoreNavigation, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f132921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f132922f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f132923g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f132924h;

        s0(tq.e<? super s0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        
            if (r7.F(r2, r6) == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
        
            if (r2.F(r4, r6) == r1) goto L30;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f132924h
                n61.a$p r0 = (p081n61.a.RestoreNavigation) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f132923g
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2b
                if (r2 == r5) goto L27
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r0 = r6.f132921e
                n61.d r0 = (p081n61.d) r0
                goto L22
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                oq.u.b(r7)
                goto Laf
            L27:
                oq.u.b(r7)
                goto L41
            L2b:
                oq.u.b(r7)
                n61.f5 r7 = p081n61.f5.this
                l61.o r7 = p081n61.f5.D9(r7)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r6.f132924h = r0
                r6.f132923g = r5
                java.lang.Object r7 = r7.a(r2, r6)
                if (r7 != r1) goto L41
                goto Lae
            L41:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L61
                n61.f5 r7 = p081n61.f5.this
                n61.b$c r2 = new n61.b$c
                n61.d$g0 r3 = n61.d.g0.f132579a
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f132924h = r0
                r6.f132923g = r4
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto Laf
                goto Lae
            L61:
                java.util.List r7 = r0.a()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r7 = r7.iterator()
            L70:
                boolean r4 = r7.hasNext()
                if (r4 == 0) goto L88
                java.lang.Object r4 = r7.next()
                java.lang.String r4 = (java.lang.String) r4
                n61.d$i r5 = p081n61.d.INSTANCE
                n61.d r4 = r5.a(r4)
                if (r4 == 0) goto L70
                r2.add(r4)
                goto L70
            L88:
                java.lang.Object r7 = pq.v.z0(r2)
                n61.d r7 = (p081n61.d) r7
                if (r7 == 0) goto Laf
                n61.f5 r2 = p081n61.f5.this
                n61.b$c r4 = new n61.b$c
                r4.<init>(r7)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f132924h = r0
                java.lang.Object r7 = vq.j.a(r7)
                r6.f132921e = r7
                r7 = 0
                r6.f132922f = r7
                r6.f132923g = r3
                java.lang.Object r7 = r2.F(r4, r6)
                if (r7 != r1) goto Laf
            Lae:
                return r1
            Laf:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: n61.f5.s0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.RestoreNavigation restoreNavigation, State state, tq.e<? super oq.i0> eVar) {
            s0 s0Var = f5.this.new s0(eVar);
            s0Var.f132924h = restoreNavigation;
            return s0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$c0;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$c0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<a.SaveInstitutionData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132927f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132928g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(f5 f5Var, k10.c0 c0Var, a.SaveInstitutionData saveInstitutionData, State state) {
            return State.b(f5Var.initialState, ((State) c0Var.a()).k(), ((State) c0Var.a()).getPassportTypeData(), ((State) c0Var.a()).getReasonData(), ((State) c0Var.a()).getTemporaryPassportReasonAttachmentsData(), ((State) c0Var.a()).getPassportOfficePlaceData(), ((State) c0Var.a()).getWhoAgreesData(), ((State) c0Var.a()).getParentFormData(), ((State) c0Var.a()).getPickedChildId(), ((State) c0Var.a()).getChildData(), ((State) c0Var.a()).getEnterChildContractData(), ((State) c0Var.a()).getDataSplitData(), ((State) c0Var.a()).getPhotoData(), ((State) c0Var.a()).getPhotoGlassesAttachment(), ((State) c0Var.a()).getPhotoFaceCoverAttachment(), saveInstitutionData.getInstitutionData(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32768, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SaveInstitutionData saveInstitutionData = (a.SaveInstitutionData) this.f132927f;
            final k10.c0 c0Var = (k10.c0) this.f132928g;
            uq.b.e();
            if (this.f132926e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u81.a.ChildPassportApplicationInstitutionData institutionData = ((State) c0Var.a()).getInstitutionData();
            if (fr.t.c(institutionData != null ? institutionData.getInstitution() : null, saveInstitutionData.getInstitutionData().getInstitution())) {
                return c0Var.c();
            }
            final f5 f5Var = f5.this;
            return c0Var.b(new er.l() { // from class: n61.q5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.t.O(f5Var, c0Var, saveInstitutionData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveInstitutionData saveInstitutionData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            t tVar = f5.this.new t(eVar);
            tVar.f132927f = saveInstitutionData;
            tVar.f132928g = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln61/a$m;", "<unused var>", "Ln61/c;", "Loq/i0;", "<anonymous>", "(Ln61/a$m;Ln61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class t0 extends vq.k implements er.q<a.m, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f132930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f132931f;

        t0(tq.e<? super t0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0063 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:24:0x006d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:25:0x006f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0077  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            boolean z15;
            boolean zBooleanValue;
            Object objE = uq.b.e();
            int i15 = this.f132931f;
            if (i15 == 0) {
                oq.u.b(obj);
                l61.o oVar = f5.this.isChildPassportApplicationPaymentStartedUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f132931f = 1;
                obj = oVar.a(c1792a, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z15 = this.f132930e;
                oq.u.b(obj);
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (!z15 && zBooleanValue) {
                f5.this.d9(a.l.f132419a);
            } else if (!z15 && !zBooleanValue) {
                f5.this.d9(a.k0.f132418a);
            } else if (zBooleanValue) {
                f5.this.d9(a.j0.f132416a);
            } else {
                f5.this.d9(a.f.f132405a);
            }
            return oq.i0.f148189a;
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            l61.n nVar = f5.this.isChildPassportApplicationDraftValidUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            this.f132930e = zBooleanValue2;
            this.f132931f = 2;
            Object objA = nVar.a(c1792a2, this);
            if (objA != objE) {
                z15 = zBooleanValue2;
                obj = objA;
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (!z15) {
                    if (!z15) {
                        if (zBooleanValue) {
                            f5.this.d9(a.j0.f132416a);
                        } else {
                            f5.this.d9(a.f.f132405a);
                        }
                    } else if (zBooleanValue) {
                        f5.this.d9(a.j0.f132416a);
                    } else {
                        f5.this.d9(a.f.f132405a);
                    }
                } else if (!z15) {
                    if (zBooleanValue) {
                        f5.this.d9(a.j0.f132416a);
                    } else {
                        f5.this.d9(a.f.f132405a);
                    }
                } else if (zBooleanValue) {
                    f5.this.d9(a.j0.f132416a);
                } else {
                    f5.this.d9(a.f.f132405a);
                }
                return oq.i0.f148189a;
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.m mVar, State state, tq.e<? super oq.i0> eVar) {
            return f5.this.new t0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$f0;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$f0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<a.SavePhotoData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132934f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132935g;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.SavePhotoData savePhotoData, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, null, savePhotoData.getPhotoData(), savePhotoData.getPhotoData().getIsPhotoWithGlassesOptionChecked() ? state.getPhotoGlassesAttachment() : new u61.b.AttachmentsData(pq.v.n()), savePhotoData.getPhotoData().getIsFaceCoveringPhotoOptionChecked() ? state.getPhotoFaceCoverAttachment() : new u61.b.AttachmentsData(pq.v.n()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -14337, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SavePhotoData savePhotoData = (a.SavePhotoData) this.f132934f;
            k10.c0 c0Var = (k10.c0) this.f132935g;
            uq.b.e();
            if (this.f132933e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.r5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.u.O(savePhotoData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SavePhotoData savePhotoData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            u uVar = new u(eVar);
            uVar.f132934f = savePhotoData;
            uVar.f132935g = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$e0;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$e0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<p081n61.a.SavePhotoAttachmentsChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132938g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f132939a;

            static {
                int[] iArr = new int[u61.c.values().length];
                try {
                    iArr[u61.c.GLASSES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[u61.c.FACE_COVER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f132939a = iArr;
            }
        }

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(p081n61.a.SavePhotoAttachmentsChanged savePhotoAttachmentsChanged, State state) {
            int i15 = a.f132939a[savePhotoAttachmentsChanged.getAttachmentType().ordinal()];
            if (i15 == 1) {
                return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, savePhotoAttachmentsChanged.getAttachmentsData(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, null);
            }
            if (i15 == 2) {
                return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, savePhotoAttachmentsChanged.getAttachmentsData(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, null);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final p081n61.a.SavePhotoAttachmentsChanged savePhotoAttachmentsChanged = (p081n61.a.SavePhotoAttachmentsChanged) this.f132937f;
            k10.c0 c0Var = (k10.c0) this.f132938g;
            uq.b.e();
            if (this.f132936e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.s5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.v.O(savePhotoAttachmentsChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p081n61.a.SavePhotoAttachmentsChanged savePhotoAttachmentsChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            v vVar = new v(eVar);
            vVar.f132937f = savePhotoAttachmentsChanged;
            vVar.f132938g = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$g;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<p081n61.a.EditDataSplitData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132942g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f132943a;

            static {
                int[] iArr = new int[d81.b.values().length];
                try {
                    iArr[d81.b.NAMES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d81.b.SURNAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d81.b.BIRTH_PLACE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f132943a = iArr;
            }
        }

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(DataSplitData dataSplitData, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, dataSplitData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final DataSplitData dataSplitDataB;
            p081n61.a.EditDataSplitData editDataSplitData = (p081n61.a.EditDataSplitData) this.f132941f;
            k10.c0 c0Var = (k10.c0) this.f132942g;
            uq.b.e();
            if (this.f132940e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            DataSplitData dataSplitData = ((State) c0Var.a()).getDataSplitData();
            if (dataSplitData != null) {
                int i15 = a.f132943a[editDataSplitData.getType().ordinal()];
                if (i15 == 1) {
                    dataSplitDataB = DataSplitData.b(dataSplitData, editDataSplitData.getDataSplit(), null, null, 6, null);
                } else if (i15 == 2) {
                    dataSplitDataB = DataSplitData.b(dataSplitData, null, editDataSplitData.getDataSplit(), null, 5, null);
                } else {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                    dataSplitDataB = DataSplitData.b(dataSplitData, null, null, editDataSplitData.getDataSplit(), 3, null);
                }
                k10.l lVarB = c0Var.b(new er.l() { // from class: n61.t5
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f5.w.O(dataSplitDataB, (State) obj2);
                    }
                });
                if (lVarB != null) {
                    return lVarB;
                }
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p081n61.a.EditDataSplitData editDataSplitData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            w wVar = new w(eVar);
            wVar.f132941f = editDataSplitData;
            wVar.f132942g = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$w;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$w;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<a.SaveCorrespondenceCountryData, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132946g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(f5 f5Var, k10.c0 c0Var, a.SaveCorrespondenceCountryData saveCorrespondenceCountryData, State state) {
            return State.b(f5Var.initialState, ((State) c0Var.a()).k(), ((State) c0Var.a()).getPassportTypeData(), ((State) c0Var.a()).getReasonData(), ((State) c0Var.a()).getTemporaryPassportReasonAttachmentsData(), ((State) c0Var.a()).getPassportOfficePlaceData(), ((State) c0Var.a()).getWhoAgreesData(), ((State) c0Var.a()).getParentFormData(), ((State) c0Var.a()).getPickedChildId(), ((State) c0Var.a()).getChildData(), ((State) c0Var.a()).getEnterChildContractData(), ((State) c0Var.a()).getDataSplitData(), ((State) c0Var.a()).getPhotoData(), ((State) c0Var.a()).getPhotoGlassesAttachment(), ((State) c0Var.a()).getPhotoFaceCoverAttachment(), ((State) c0Var.a()).getInstitutionData(), ((State) c0Var.a()).getSignedConsentAttachmentsData(), ((State) c0Var.a()).getOtherParentUnableToConsentAttachmentsData(), saveCorrespondenceCountryData.getCorrespondenceCountryData(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262144, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            BEPassportChildApplicationCountryDictionary country;
            final a.SaveCorrespondenceCountryData saveCorrespondenceCountryData = (a.SaveCorrespondenceCountryData) this.f132945f;
            final k10.c0 c0Var = (k10.c0) this.f132946g;
            uq.b.e();
            if (this.f132944e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            ChildPassportApplicationCorrespondenceCountryData correspondenceCountryData = ((State) c0Var.a()).getCorrespondenceCountryData();
            if (fr.t.c((correspondenceCountryData == null || (country = correspondenceCountryData.getCountry()) == null) ? null : country.getIsoCode(), saveCorrespondenceCountryData.getCorrespondenceCountryData().getCountry().getIsoCode())) {
                return c0Var.c();
            }
            final f5 f5Var = f5.this;
            return c0Var.b(new er.l() { // from class: n61.u5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.x.O(f5Var, c0Var, saveCorrespondenceCountryData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveCorrespondenceCountryData saveCorrespondenceCountryData, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            x xVar = f5.this.new x(eVar);
            xVar.f132945f = saveCorrespondenceCountryData;
            xVar.f132946g = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$v;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<a.SaveCorrespondenceAddress, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132949f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132950g;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.SaveCorrespondenceAddress saveCorrespondenceAddress, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, saveCorrespondenceAddress.getCorrespondenceAddress(), null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SaveCorrespondenceAddress saveCorrespondenceAddress = (a.SaveCorrespondenceAddress) this.f132949f;
            k10.c0 c0Var = (k10.c0) this.f132950g;
            uq.b.e();
            if (this.f132948e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.v5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.y.O(saveCorrespondenceAddress, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveCorrespondenceAddress saveCorrespondenceAddress, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            y yVar = new y(eVar);
            yVar.f132949f = saveCorrespondenceAddress;
            yVar.f132950g = c0Var;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ln61/a$u;", "action", "Lk10/c0;", "Ln61/c;", "state", "Lk10/l;", "<anonymous>", "(Ln61/a$u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<a.SaveContactDetails, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132952f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f132953g;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(a.SaveContactDetails saveContactDetails, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, saveContactDetails.getContactDetails(), null, null, null, null, null, null, null, null, null, null, null, null, -524289, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.SaveContactDetails saveContactDetails = (a.SaveContactDetails) this.f132952f;
            k10.c0 c0Var = (k10.c0) this.f132953g;
            uq.b.e();
            if (this.f132951e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: n61.w5
                @Override // er.l
                public final Object b(Object obj2) {
                    return f5.z.O(saveContactDetails, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.SaveContactDetails saveContactDetails, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            z zVar = new z(eVar);
            zVar.f132952f = saveContactDetails;
            zVar.f132953g = c0Var;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public f5(g14.a aVar, ac4.a aVar2, l61.v vVar, l61.l lVar, d14.d dVar, d14.c cVar, d14.a aVar3, l61.u uVar, l61.n nVar, l61.o oVar, l61.k kVar, p081n61.g gVar, y51.a aVar4, ib4.c cVar2, f14.a aVar5, iv2.a aVar6, l61.w wVar, l61.t tVar, yy.a aVar7, final p081n61.f fVar, final a5 a5Var) {
        this.getInfoFromPeselUC = aVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.saveChildPassportApplicationDraftUC = vVar;
        this.getChildPassportApplicationDraftUC = lVar;
        this.saveImageToStorageUseCase = dVar;
        this.saveFilesToStorageUseCase = cVar;
        this.getFileContentUseCase = aVar3;
        this.saveChildPassportApplicationDraftTimestampUC = uVar;
        this.isChildPassportApplicationDraftValidUC = nVar;
        this.isChildPassportApplicationPaymentStartedUC = oVar;
        this.clearChildPassportApplicationDraftUC = kVar;
        this.mapper = gVar;
        this.clearChildPassportApplicationDraftTimestampUC = aVar4;
        this.genericDomainErrorMapper = cVar2;
        this.installDynamicModuleUC = aVar5;
        this.isDocumentPhotoFeatureFlagActiveUC = aVar6;
        this.setFaceDetectionInstallationStateUC = wVar;
        this.isPassportOnlinePaymentFeatureEnabledUC = tVar;
        List listN = pq.v.n();
        a.PassportTypeData passportTypeData = new a.PassportTypeData(null);
        r91.a.PassportOfficePlaceData passportOfficePlaceData = new r91.a.PassportOfficePlaceData(null);
        da1.a.WhoAgreesData whoAgreesData = new da1.a.WhoAgreesData(null);
        k81.a.EnterChildContractData enterChildContractData = new k81.a.EnterChildContractData(null, null);
        b71.c.AttachmentsData attachmentsData = new b71.c.AttachmentsData(pq.v.n(), null, 2, null);
        State state = new State(listN, passportTypeData, new t91.a.ChildPassportApplicationReasonData(null), attachmentsData, passportOfficePlaceData, whoAgreesData, null, null, null, enterChildContractData, null, null, new u61.b.AttachmentsData(pq.v.n()), new u61.b.AttachmentsData(pq.v.n()), null, new b71.c.AttachmentsData(pq.v.n(), null, 2, null), new b71.c.AttachmentsData(pq.v.n(), null, 2, null), null, null, null, null, null, new b71.c.AttachmentsData(pq.v.n(), null, 2, null), new b71.c.AttachmentsData(pq.v.n(), null, 2, null), new b71.c.AttachmentsData(pq.v.n(), null, 2, null), new b71.c.AttachmentsData(pq.v.n(), Boolean.FALSE), new b71.c.AttachmentsData(pq.v.n(), null, 2, null), null, null, null, null, null);
        this.initialState = state;
        this.stateMachine = aVar7.a(state, new er.l() { // from class: n61.b5
            @Override // er.l
            public final Object b(Object obj) {
                return f5.aa(this.f132470a, fVar, a5Var, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J9(ChildPassportApplicationFile childPassportApplicationFile, tq.e<? super wx.i> eVar) throws Throwable {
        c cVar;
        FileContent fileContent;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f132764g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f132764g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f132762e;
        Object objE = uq.b.e();
        int i16 = cVar.f132764g;
        if (i16 == 0) {
            oq.u.b(objC);
            d14.a aVar = this.getFileContentUseCase;
            d14.a.Params params = new d14.a.Params(childPassportApplicationFile.getStoredFile());
            cVar.f132761d = childPassportApplicationFile;
            cVar.f132764g = 1;
            objC = aVar.c(params, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            childPassportApplicationFile = (ChildPassportApplicationFile) cVar.f132761d;
            oq.u.b(objC);
        }
        d14.a.Result result = (d14.a.Result) ((dx.i) objC).a();
        if (result == null || (fileContent = result.getFileContent()) == null) {
            return null;
        }
        wx.k storedFile = childPassportApplicationFile.getStoredFile();
        if (storedFile instanceof wx.k.Image) {
            return new wx.i.Image(childPassportApplicationFile.getPickedFileMetadata(), fileContent);
        }
        if (storedFile instanceof wx.k.Regular) {
            return new wx.i.Regular(childPassportApplicationFile.getPickedFileMetadata(), fileContent);
        }
        throw new oq.p();
    }

    private final DataSplit M9(String str, int i15) {
        List<String> listZ1;
        if (str != null) {
            if (str.length() <= i15) {
                str = null;
            }
            if (str != null && (listZ1 = fu.r.z1(str, i15)) != null) {
                return new DataSplit(iy.c0.g(listZ1.get(0)), iy.c0.g(listZ1.get(1)));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P9(dx.i<? extends dx.b, ? extends List<ChildPassportApplicationFile>> iVar, tq.e<? super List<ChildPassportApplicationFile>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f132776l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f132776l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f132774j;
        Object objE = uq.b.e();
        int i16 = dVar.f132776l;
        if (i16 == 0) {
            oq.u.b(obj);
            if (!(iVar instanceof dx.i.Left)) {
                if (iVar instanceof dx.i.Right) {
                    return ((dx.i.Right) iVar).b();
                }
                throw new oq.p();
            }
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            Object error = new p081n61.b.Error(T9(bVar, b9(a.e.f132402a)));
            dVar.f132769d = vq.j.a(iVar);
            dVar.f132770e = vq.j.a(iVar);
            dVar.f132771f = vq.j.a(bVar);
            dVar.f132772g = 0;
            dVar.f132773h = 0;
            dVar.f132776l = 1;
            if (F(error, dVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return pq.v.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataSplitData R9(iy.b0 firstName, iy.b0 secondName, iy.b0 otherName, iy.b0 surname, iy.b0 birthPlace) {
        String strE;
        String strE2;
        String strV0 = pq.v.v0(pq.v.s(firstName, secondName, otherName), " ", null, null, 0, null, new er.l() { // from class: n61.e5
            @Override // er.l
            public final Object b(Object obj) {
                return f5.S9((b0) obj);
            }
        }, 30, null);
        String str = "";
        if (surname == null || (strE = iy.c0.e(surname)) == null) {
            strE = "";
        }
        if (birthPlace != null && (strE2 = iy.c0.e(birthPlace)) != null) {
            str = strE2;
        }
        DataSplitData dataSplitData = new DataSplitData(M9(strV0, 63), M9(strE, 63), M9(str, 40));
        if (strV0.length() > 63 || strE.length() > 63 || str.length() > 40) {
            return dataSplitData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence S9(iy.b0 b0Var) {
        return iy.c0.e(b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b T9(dx.b domainError, final er.a<oq.i0> retryAction) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: n61.d5
            @Override // er.l
            public final Object b(Object obj) {
                return f5.U9(retryAction, this, (c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(er.a aVar, f5 f5Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            aVar.a();
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            f5Var.d9(a.e.f132402a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object W9(tq.e<? super oq.i0> eVar) {
        Object objA = ac4.a.a(this.callActionWithLoaderUseCase, null, new e(getState().getValue(), null), eVar, 1, null);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8 A[Catch: Exception -> 0x028b, c -> 0x028e, CancellationException -> 0x0293, TryCatch #10 {c -> 0x028e, CancellationException -> 0x0293, Exception -> 0x028b, blocks: (B:59:0x01b2, B:61:0x01b8, B:63:0x01c8, B:91:0x0299, B:93:0x029d, B:108:0x0351, B:109:0x0356, B:110:0x0357), top: B:137:0x01b2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c8 A[Catch: Exception -> 0x028b, c -> 0x028e, CancellationException -> 0x0293, TRY_LEAVE, TryCatch #10 {c -> 0x028e, CancellationException -> 0x0293, Exception -> 0x028b, blocks: (B:59:0x01b2, B:61:0x01b8, B:63:0x01c8, B:91:0x0299, B:93:0x029d, B:108:0x0351, B:109:0x0356, B:110:0x0357), top: B:137:0x01b2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x021b  */
    /* JADX WARN: Code duplicated, block: B:67:0x021e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0236 A[Catch: Exception -> 0x0265, c -> 0x026a, CancellationException -> 0x026f, TryCatch #8 {c -> 0x026a, CancellationException -> 0x026f, Exception -> 0x0265, blocks: (B:98:0x02fe, B:100:0x0304, B:102:0x0308, B:103:0x032d, B:68:0x0230, B:70:0x0236, B:72:0x023a, B:80:0x0274, B:81:0x0279, B:82:0x027a, B:83:0x028a, B:104:0x033a, B:105:0x033f, B:106:0x0340, B:107:0x0350), top: B:138:0x02fe }] */
    /* JADX WARN: Code duplicated, block: B:72:0x023a A[Catch: Exception -> 0x0265, c -> 0x026a, CancellationException -> 0x026f, TryCatch #8 {c -> 0x026a, CancellationException -> 0x026f, Exception -> 0x0265, blocks: (B:98:0x02fe, B:100:0x0304, B:102:0x0308, B:103:0x032d, B:68:0x0230, B:70:0x0236, B:72:0x023a, B:80:0x0274, B:81:0x0279, B:82:0x027a, B:83:0x028a, B:104:0x033a, B:105:0x033f, B:106:0x0340, B:107:0x0350), top: B:138:0x02fe }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x027a A[Catch: Exception -> 0x0265, c -> 0x026a, CancellationException -> 0x026f, TryCatch #8 {c -> 0x026a, CancellationException -> 0x026f, Exception -> 0x0265, blocks: (B:98:0x02fe, B:100:0x0304, B:102:0x0308, B:103:0x032d, B:68:0x0230, B:70:0x0236, B:72:0x023a, B:80:0x0274, B:81:0x0279, B:82:0x027a, B:83:0x028a, B:104:0x033a, B:105:0x033f, B:106:0x0340, B:107:0x0350), top: B:138:0x02fe }] */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x0092: MOVE (r5 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:17:0x0092 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x023a -> B:73:0x0261). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x02f3 -> B:138:0x02fe). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object X9(java.util.List<? extends wx.i> r24, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<i61.ChildPassportApplicationFile>>> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p081n61.f5.X9(java.util.List, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(final f5 f5Var, final p081n61.f fVar, final a5 a5Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: n61.c5
            @Override // er.l
            public final Object b(Object obj) {
                return f5.ba(this.f132508a, fVar, a5Var, (z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(f5 f5Var, p081n61.f fVar, a5 a5Var, k10.z zVar) {
        zVar.C(f5Var.new q(null));
        b0 b0Var = f5Var.new b0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(a.h.class), oVar, b0Var);
        zVar.x(fr.q0.c(a.i0.class), oVar, f5Var.new m0(fVar, null));
        zVar.x(fr.q0.c(a.j0.class), oVar, f5Var.new o0(a5Var, null));
        zVar.x(fr.q0.c(a.f.class), oVar, f5Var.new p0(null));
        zVar.x(fr.q0.c(a.RestoreDraft.class), oVar, f5Var.new q0(null));
        zVar.v(fr.q0.c(a.LoadRestoredData.class), oVar, f5Var.new r0(null));
        zVar.x(fr.q0.c(a.RestoreNavigation.class), oVar, f5Var.new s0(null));
        zVar.x(fr.q0.c(a.m.class), oVar, f5Var.new t0(null));
        zVar.x(fr.q0.c(a.l.class), oVar, f5Var.new g(null));
        zVar.x(fr.q0.c(a.k0.class), oVar, f5Var.new h(null));
        zVar.v(fr.q0.c(a.UpdateDestinationsBackstack.class), oVar, new i(null));
        zVar.v(fr.q0.c(a.PassportTypeChanged.class), oVar, f5Var.new j(null));
        zVar.v(fr.q0.c(a.ReasonChanged.class), oVar, f5Var.new k(null));
        zVar.v(fr.q0.c(a.PassportOfficePlaceChanged.class), oVar, f5Var.new l(null));
        zVar.v(fr.q0.c(a.WhoAgreesChanged.class), oVar, f5Var.new m(null));
        zVar.v(fr.q0.c(a.SaveParentFormData.class), oVar, new n(null));
        zVar.v(fr.q0.c(a.ChildIdChanged.class), oVar, new o(null));
        zVar.v(fr.q0.c(a.SaveChildData.class), oVar, f5Var.new p(null));
        zVar.v(fr.q0.c(a.SaveEnterChildSetupData.class), oVar, new r(null));
        zVar.v(fr.q0.c(a.SaveAllEnterChildData.class), oVar, f5Var.new s(null));
        zVar.v(fr.q0.c(a.SaveInstitutionData.class), oVar, f5Var.new t(null));
        zVar.v(fr.q0.c(a.SavePhotoData.class), oVar, new u(null));
        zVar.v(fr.q0.c(a.SavePhotoAttachmentsChanged.class), oVar, new v(null));
        zVar.v(fr.q0.c(a.EditDataSplitData.class), oVar, new w(null));
        zVar.v(fr.q0.c(a.SaveCorrespondenceCountryData.class), oVar, f5Var.new x(null));
        zVar.v(fr.q0.c(a.SaveCorrespondenceAddress.class), oVar, new y(null));
        zVar.v(fr.q0.c(a.SaveContactDetails.class), oVar, new z(null));
        zVar.v(fr.q0.c(a.SavePickupMethodData.class), oVar, new a0(null));
        zVar.v(fr.q0.c(a.SaveDiscountType.class), oVar, f5Var.new c0(null));
        zVar.v(fr.q0.c(a.AttachmentsChanged.class), oVar, new d0(null));
        zVar.x(fr.q0.c(a.y.class), oVar, f5Var.new e0(null));
        zVar.x(fr.q0.c(a.d.class), oVar, f5Var.new f0(null));
        zVar.x(fr.q0.c(a.e.class), oVar, f5Var.new g0(null));
        zVar.v(fr.q0.c(a.SaveSummaryData.class), oVar, new h0(null));
        zVar.v(fr.q0.c(a.SaveApplicationId.class), oVar, new i0(null));
        zVar.v(fr.q0.c(a.SaveFaceDetectionData.class), oVar, new j0(null));
        zVar.v(fr.q0.c(a.SaveHowToPay.class), oVar, new k0(null));
        zVar.v(fr.q0.c(a.SaveApplicationNumber.class), oVar, new l0(null));
        zVar.v(fr.q0.c(a.c.class), oVar, new n0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnterChildCheckboxes ca(i61.n nVar) {
        return new EnterChildCheckboxes(nVar.getNoNameSwitchChecked(), nVar.getNoLastNameSwitchChecked(), nVar.getCitizenshipCheckBoxChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SummaryCheckBox da(y91.c.SummaryData summaryData) {
        return new SummaryCheckBox(summaryData.getIsStatementChecked());
    }

    @Override // y91.c
    public void A3(y91.c.SummaryData summaryData) {
        d9(new a.SaveSummaryData(summaryData));
    }

    @Override // b71.c
    public i61.h C0() {
        return getState().getValue().getReasonData().getReason();
    }

    @Override // u61.b
    public boolean E2() {
        return getState().getValue().getDataSplitData() != null;
    }

    @Override // da1.a
    public void E6(da1.a.WhoAgreesData data) {
        d9(new a.WhoAgreesChanged(data));
    }

    @Override // o91.a
    public void G1(o91.a.ChildPassportApplicationPickupMethodData pickupMethodData) {
        d9(new a.SavePickupMethodData(pickupMethodData));
    }

    @Override // ga1.a
    public void G4(ParentFormData data) {
        d9(new a.SaveParentFormData(data));
    }

    @Override // r71.a, i91.a
    public r91.a.PassportOfficePlaceData I0() {
        return getState().getValue().getPassportOfficePlaceData();
    }

    @Override // a81.a
    public void I7(d81.b type, DataSplit dataSplit) {
        d9(new a.EditDataSplitData(type, dataSplit));
    }

    @Override // f91.a
    public void J4(String applicationNumber) {
        d9(new a.SaveApplicationNumber(applicationNumber));
    }

    @Override // b71.c
    public b71.c.AttachmentsData K7(b71.b attachmentType) {
        switch (b.f132753a[attachmentType.ordinal()]) {
            case 1:
                return getState().getValue().getTemporaryPassportReasonAttachmentsData();
            case 2:
                return getState().getValue().getSignedConsentAttachmentsData();
            case 3:
                return getState().getValue().getOtherParentUnableToConsentAttachmentsData();
            case 4:
                return getState().getValue().getOldMoneyTransferAttachmentsData();
            case 5:
                return getState().getValue().getNewMoneyTransferAttachmentsData();
            case 6:
                return getState().getValue().getAbroadTreatmentAttachmentsData();
            case 7:
                return getState().getValue().getKdrAttachmentsData();
            case 8:
                return getState().getValue().getTechnicalIssueAttachmentsData();
            default:
                throw new oq.p();
        }
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(p081n61.b bVar, tq.e<? super oq.i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // u61.b
    public u61.b.AttachmentsData L2(u61.c attachmentType) {
        State value = getState().getValue();
        int i15 = b.f132754b[attachmentType.ordinal()];
        if (i15 == 1) {
            u61.b.AttachmentsData photoGlassesAttachment = value.getPhotoGlassesAttachment();
            AddPhotoData photoData = value.getPhotoData();
            if (photoData == null || !photoData.getIsPhotoWithGlassesOptionChecked()) {
                return null;
            }
            return photoGlassesAttachment;
        }
        if (i15 != 2) {
            throw new oq.p();
        }
        u61.b.AttachmentsData photoFaceCoverAttachment = value.getPhotoFaceCoverAttachment();
        AddPhotoData photoData2 = value.getPhotoData();
        if (photoData2 == null || !photoData2.getIsFaceCoveringPhotoOptionChecked()) {
            return null;
        }
        return photoFaceCoverAttachment;
    }

    public m71.a.ChildPassportApplicationContactDetailsData L9() {
        m71.a.ChildPassportApplicationContactDetailsData contactDetails = getState().getValue().getContactDetails();
        return contactDetails == null ? new m71.a.ChildPassportApplicationContactDetailsData(new ContactDetailsFormData(null, this.mapper.b())) : contactDetails;
    }

    @Override // p61.a
    public boolean M5() {
        return getState().getValue().getDataSplitData() != null;
    }

    @Override // w71.a
    public ChildPassportApplicationCorrespondenceCountryData N8() {
        return getState().getValue().getCorrespondenceCountryData();
    }

    public n81.a.FaceDetectionData N9() {
        n81.a.FaceDetectionData faceDetectionData = getState().getValue().getFaceDetectionData();
        return faceDetectionData == null ? new n81.a.FaceDetectionData(false) : faceDetectionData;
    }

    @Override // p61.a
    public void O0(AddPhotoData data) {
        d9(new a.SavePhotoData(data));
    }

    public final z81.a O9() {
        State value = getState().getValue();
        al0.s0 passportType = value.getPassportTypeData().getPassportType();
        al0.s0 s0Var = al0.s0.TEMPORARY;
        if (passportType == s0Var && value.getPassportOfficePlaceData().getPassportOfficePlace() == cl0.g0.POLAND) {
            return z81.a.TEMPORARY_PASSPORT_POLAND;
        }
        if (value.getPassportTypeData().getPassportType() == s0Var && value.getPassportOfficePlaceData().getPassportOfficePlace() == cl0.g0.ABROAD) {
            return z81.a.TEMPORARY_PASSPORT_ABROAD;
        }
        return (value.getPassportTypeData().getPassportType() == al0.s0.BIOMETRIC && value.getPassportOfficePlaceData().getPassportOfficePlace() == cl0.g0.ABROAD) ? z81.a.PASSPORT_ABROAD : z81.a.PASSPORT_POLAND;
    }

    @Override // ga1.a
    public ParentFormData Q6() {
        return getState().getValue().getParentFormData();
    }

    public final p081n61.d Q9() {
        String str = (String) pq.v.o0(getState().getValue().k(), pq.v.p(getState().getValue().k()) - 1);
        if (str != null) {
            return p081n61.d.INSTANCE.a(str);
        }
        return null;
    }

    @Override // l91.a
    public void R1(l91.a.DiscountTypeData discountTypeData) {
        d9(new a.SaveDiscountType(discountTypeData));
    }

    @Override // g71.a
    public g71.a.Input S3() {
        al0.s0 passportType;
        String pickedChildId = getState().getValue().getPickedChildId();
        if (pickedChildId == null || (passportType = getState().getValue().getPassportTypeData().getPassportType()) == null) {
            return null;
        }
        ChildDataResult childData = getState().getValue().getChildData();
        return new g71.a.Input(passportType, pickedChildId, childData != null ? childData.getBirthPlaceInput() : null);
    }

    @Override // g71.a
    public void S6(ChildDataResult childDataResult) {
        d9(new a.SaveChildData(childDataResult));
    }

    @Override // y91.c
    public void S8(String applicationId) {
        d9(new a.SaveApplicationId(applicationId));
        d9(a.y.f132436a);
    }

    @Override // p61.a
    public AddPhotoData U0() {
        return getState().getValue().getPhotoData();
    }

    @Override // w71.a
    public void U7(ChildPassportApplicationCorrespondenceCountryData data) {
        d9(new a.SaveCorrespondenceCountryData(data));
    }

    public final void V9(String destinationRoute) {
        d9(new a.UpdateDestinationsBackstack(getState().getValue().k().subList(0, getState().getValue().k().lastIndexOf(destinationRoute))));
    }

    @Override // c91.a
    public void X2(a.PassportTypeData data) {
        d9(new a.PassportTypeChanged(data));
    }

    @Override // zx.b
    public xw.b<p081n61.b> Y1() {
        return this.navAction;
    }

    @Override // t91.a
    public void Y2(t91.a.ChildPassportApplicationReasonData data) {
        d9(new a.ReasonChanged(data));
    }

    @Override // r81.a
    public void Y4(i61.q paymentType) {
        d9(new a.SaveHowToPay(paymentType));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    public void Z9() {
        d9(a.i0.f132414a);
    }

    @Override // j71.a
    public void a0(String childId) {
        d9(new a.ChildIdChanged(childId));
    }

    @Override // f91.a
    public void a6() {
        d9(a.c.f132398a);
        d9(a.y.f132436a);
    }

    @Override // b71.c
    public void b2(b71.b attachmentType, b71.c.AttachmentsData attachmentsData) {
        d9(new a.AttachmentsChanged(attachmentType, attachmentsData));
    }

    @Override // u81.a
    public void d1(u81.a.ChildPassportApplicationInstitutionData data) {
        d9(new a.SaveInstitutionData(data));
    }

    @Override // b71.c
    public void d6(b71.b attachmentType) {
        switch (b.f132753a[attachmentType.ordinal()]) {
            case 1:
                return;
            case 2:
                d9(new a.AttachmentsChanged(b71.b.OTHER_PARENT_UNABLE_TO_CONSENT, new b71.c.AttachmentsData(pq.v.n(), null, 2, null)));
                return;
            case 3:
                d9(new a.AttachmentsChanged(b71.b.SIGNED_CONSENT, new b71.c.AttachmentsData(pq.v.n(), null, 2, null)));
                return;
            case 4:
                d9(new a.AttachmentsChanged(b71.b.NEW_APPLICATION_MONEY_TRANSFER, new b71.c.AttachmentsData(pq.v.n(), null, 2, null)));
                return;
            case 5:
                d9(new a.AttachmentsChanged(b71.b.OLD_APPLICATION_MONEY_TRANSFER, new b71.c.AttachmentsData(pq.v.n(), Boolean.FALSE)));
                return;
            case 6:
                d9(new a.AttachmentsChanged(b71.b.KDR_CONFIRMATION, new b71.c.AttachmentsData(pq.v.n(), null, 2, null)));
                d9(new a.AttachmentsChanged(b71.b.TECHNICAL_ISSUE_CONFIRMATION, new b71.c.AttachmentsData(pq.v.n(), null, 2, null)));
                return;
            case 7:
                d9(new a.AttachmentsChanged(b71.b.ABROAD_TREATMENT_CONFIRMATION, new b71.c.AttachmentsData(pq.v.n(), null, 2, null)));
                d9(new a.AttachmentsChanged(b71.b.TECHNICAL_ISSUE_CONFIRMATION, new b71.c.AttachmentsData(pq.v.n(), null, 2, null)));
                return;
            case 8:
                d9(new a.AttachmentsChanged(b71.b.ABROAD_TREATMENT_CONFIRMATION, new b71.c.AttachmentsData(pq.v.n(), null, 2, null)));
                d9(new a.AttachmentsChanged(b71.b.KDR_CONFIRMATION, new b71.c.AttachmentsData(pq.v.n(), null, 2, null)));
                return;
            default:
                throw new oq.p();
        }
    }

    @Override // k81.a
    public k81.a.EnterChildSetupData e0() {
        k81.a.EnterChildSetupData enterChildSetupData = getState().getValue().getEnterChildContractData().getEnterChildSetupData();
        return new k81.a.EnterChildSetupData(enterChildSetupData != null ? enterChildSetupData.getEnterChildFormData() : null, getState().getValue().getWhoAgreesData().getWhoAgrees(), getState().getValue().getPassportTypeData().getPassportType(), getState().getValue().getPassportOfficePlaceData().getPassportOfficePlace());
    }

    @Override // l00.g
    protected k10.t<State, a> e9() {
        return this.stateMachine;
    }

    public final void ea(String destinationRoute) {
        List<String> listSubList;
        int iIndexOf = getState().getValue().k().indexOf(destinationRoute);
        if (iIndexOf >= 0 && iIndexOf < pq.v.p(getState().getValue().k())) {
            listSubList = getState().getValue().k().subList(0, iIndexOf + 1);
        } else if (iIndexOf == -1) {
            List<String> listI1 = pq.v.i1(getState().getValue().k());
            listI1.add(destinationRoute);
            listSubList = listI1;
        } else {
            listSubList = null;
        }
        if (listSubList != null) {
            d9(new a.UpdateDestinationsBackstack(listSubList));
        }
    }

    @Override // o91.a
    public o91.a.ChildPassportApplicationPickupMethodData f4() {
        return getState().getValue().getPickupMethod();
    }

    public final AddressFormData f5() {
        AddressData addressData;
        p081n61.g gVar = this.mapper;
        i61.d dVarY0 = y0();
        if (dVarY0 instanceof i61.d.Domestic) {
            addressData = ((i61.d.Domestic) dVarY0).getAddressData();
        } else {
            if (!(dVarY0 instanceof i61.d.Foreign) && dVarY0 != null) {
                throw new oq.p();
            }
            addressData = null;
        }
        return gVar.a(addressData);
    }

    @Override // r91.a
    public void g1(r91.a.PassportOfficePlaceData data) {
        d9(new a.PassportOfficePlaceChanged(data));
    }

    @Override // l00.e
    public mu.p0<State> getState() {
        return this.state;
    }

    @Override // b71.c
    public void h1() {
        d9(new a.PassportOfficePlaceChanged(new r91.a.PassportOfficePlaceData(cl0.g0.ABROAD)));
    }

    @Override // k81.a
    public void h2(EnterChildValidatedData validatedData, i61.n formData) {
        d9(new a.SaveAllEnterChildData(validatedData, formData));
    }

    @Override // p61.a
    public Integer i7() {
        PassportChildApplicationGetChildData childData;
        ChildDataResult childData2 = getState().getValue().getChildData();
        if (childData2 != null && (childData = childData2.getChildData()) != null) {
            g14.a.b bVarA = this.getInfoFromPeselUC.a(new g14.a.Params(childData.getPesel(), null));
            if (bVarA instanceof g14.a.b.Success) {
                return Integer.valueOf(((g14.a.b.Success) bVarA).getAge());
            }
            if (!fr.t.c(bVarA, g14.a.b.C1569b.f69767a) && !fr.t.c(bVarA, g14.a.b.C1568a.f69766a)) {
                throw new oq.p();
            }
        }
        return null;
    }

    @Override // o91.a
    public i61.d.Foreign k() {
        if (getState().getValue().getCorrespondenceAddress() instanceof i61.d.Foreign) {
            return (i61.d.Foreign) getState().getValue().getCorrespondenceAddress();
        }
        return null;
    }

    @Override // n81.a
    public void k2(n81.a.FaceDetectionData data) {
        d9(new a.SaveFaceDetectionData(data));
    }

    @Override // g71.a
    public ChildDataResult l6() {
        ChildDataResult childData = getState().getValue().getChildData();
        PassportChildApplicationGetChildData childData2 = childData != null ? childData.getChildData() : null;
        ChildDataResult childData3 = getState().getValue().getChildData();
        iy.b0 birthPlaceInput = childData3 != null ? childData3.getBirthPlaceInput() : null;
        ChildDataResult childData4 = getState().getValue().getChildData();
        return new ChildDataResult(childData2, birthPlaceInput, childData4 != null ? childData4.getCitizenshipCheckBoxChecked() : false);
    }

    @Override // y91.c
    public dx.i<dx.b, y91.c.SummaryContractData> m0() {
        Object objB;
        BEPassportChildApplicationOfficeDictionary institution;
        cl0.i0 enterChildValidatedData;
        BEPassportChildApplicationCountryDictionary country;
        i61.l discountType;
        wx.i.Image file;
        String strA;
        ContactDetailsFormData contactDetailsFormData;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    State value = getState().getValue();
                    u81.a.ChildPassportApplicationInstitutionData institutionData = value.getInstitutionData();
                    if (institutionData == null || (institution = institutionData.getInstitution()) == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    al0.s0 passportType = value.getPassportTypeData().getPassportType();
                    if (passportType == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    ParentFormData parentFormData = value.getParentFormData();
                    if (parentFormData == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    ChildDataResult childData = value.getChildData();
                    if ((childData == null || (enterChildValidatedData = childData.getChildData()) == null) && (enterChildValidatedData = value.getEnterChildContractData().getEnterChildValidatedData()) == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    cl0.i0 i0Var = enterChildValidatedData;
                    ChildDataResult childData2 = value.getChildData();
                    iy.b0 birthPlaceInput = childData2 != null ? childData2.getBirthPlaceInput() : null;
                    ChildPassportApplicationCorrespondenceCountryData correspondenceCountryData = value.getCorrespondenceCountryData();
                    if (correspondenceCountryData == null || (country = correspondenceCountryData.getCountry()) == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    i61.d correspondenceAddress = value.getCorrespondenceAddress();
                    if (correspondenceAddress == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    m71.a.ChildPassportApplicationContactDetailsData contactDetails = value.getContactDetails();
                    ContactDetailsData detailsData = (contactDetails == null || (contactDetailsFormData = contactDetails.getContactDetailsFormData()) == null) ? null : contactDetailsFormData.getDetailsData();
                    l91.a.DiscountTypeData discountTypeData = value.getDiscountTypeData();
                    if (discountTypeData == null || (discountType = discountTypeData.getDiscountType()) == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    i61.q paymentType = value.getPaymentType();
                    if (paymentType == null) {
                        paymentType = i61.q.b.f89802a;
                    }
                    i61.q qVar = paymentType;
                    o91.a.ChildPassportApplicationPickupMethodData pickupMethod = value.getPickupMethod();
                    i61.r pickupMethod2 = pickupMethod != null ? pickupMethod.getPickupMethod() : null;
                    List<String> listC = value.getTemporaryPassportReasonAttachmentsData().c();
                    if (listC.isEmpty()) {
                        listC = null;
                    }
                    List<String> list = listC;
                    AddPhotoData photoData = value.getPhotoData();
                    if (photoData == null || (file = photoData.getFile()) == null || (strA = wx.j.a(file)) == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    List<String> listB = value.getPhotoGlassesAttachment().b();
                    if (listB.isEmpty()) {
                        listB = null;
                    }
                    List<String> list2 = listB;
                    List<String> listB2 = value.getPhotoFaceCoverAttachment().b();
                    if (listB2.isEmpty()) {
                        listB2 = null;
                    }
                    List<String> list3 = listB2;
                    List<String> listC2 = value.getSignedConsentAttachmentsData().c();
                    if (listC2.isEmpty()) {
                        listC2 = null;
                    }
                    List<String> list4 = listC2;
                    List<String> listC3 = value.getOtherParentUnableToConsentAttachmentsData().c();
                    if (listC3.isEmpty()) {
                        listC3 = null;
                    }
                    List<String> list5 = listC3;
                    List<String> listC4 = value.getOldMoneyTransferAttachmentsData().c();
                    if (listC4.isEmpty()) {
                        listC4 = value.getNewMoneyTransferAttachmentsData().c();
                    }
                    List<String> list6 = listC4;
                    if (list6.isEmpty()) {
                        list6 = null;
                    }
                    List<String> list7 = list6;
                    List<String> listC5 = value.getTechnicalIssueAttachmentsData().c();
                    if (listC5.isEmpty()) {
                        listC5 = null;
                    }
                    List<String> list8 = listC5;
                    List<String> listC6 = value.getAbroadTreatmentAttachmentsData().c();
                    if (listC6.isEmpty()) {
                        listC6 = null;
                    }
                    List<String> list9 = listC6;
                    List<String> listC7 = value.getKdrAttachmentsData().c();
                    if (listC7.isEmpty()) {
                        listC7 = null;
                    }
                    List<String> list10 = listC7;
                    i61.t whoAgrees = value.getWhoAgreesData().getWhoAgrees();
                    if (whoAgrees == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    cl0.g0 passportOfficePlace = value.getPassportOfficePlaceData().getPassportOfficePlace();
                    if (passportOfficePlace == null) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                    DataSplitData dataSplitData = value.getDataSplitData();
                    i61.h reason = value.getReasonData().getReason();
                    boolean zIsEmpty = value.getOldMoneyTransferAttachmentsData().a().isEmpty();
                    y91.c.SummaryData summaryData = value.getSummaryData();
                    return new dx.i.Right(new y91.c.SummaryContractData(whoAgrees, passportOfficePlace, dataSplitData, reason, institution, passportType, parentFormData, i0Var, birthPlaceInput, country, correspondenceAddress, detailsData, discountType, qVar, pickupMethod2, list, strA, list2, list3, list4, list5, list7, list8, list9, list10, zIsEmpty, summaryData != null ? summaryData.getIsStatementChecked() : false, value.getApplicationId(), value.getApplicationNumber()));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
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
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    @Override // f91.a
    public String m5() {
        return getState().getValue().getApplicationId();
    }

    @Override // ga1.a
    public i61.t n0() {
        return getState().getValue().getWhoAgreesData().getWhoAgrees();
    }

    @Override // y91.c
    public List<ChildPassportApplicationAttachmentsToSend> q0() {
        List<wx.i> listN;
        State value = getState().getValue();
        List listC = pq.v.c();
        al0.s0 passportType = value.getPassportTypeData().getPassportType();
        int i15 = passportType == null ? -1 : b.f132755c[passportType.ordinal()];
        if (i15 != -1) {
            if (i15 == 1) {
                Iterator<T> it = value.getTemporaryPassportReasonAttachmentsData().a().iterator();
                while (it.hasNext()) {
                    listC.add(new ChildPassportApplicationAttachmentsToSend((wx.i) it.next(), cl0.i.TEMPORARY_PASSPORT));
                }
            } else if (i15 != 2 && i15 != 3 && i15 != 4 && i15 != 5) {
                throw new oq.p();
            }
        }
        AddPhotoData photoData = value.getPhotoData();
        if (photoData != null && photoData.getFile() != null) {
            listC.add(new ChildPassportApplicationAttachmentsToSend(value.getPhotoData().getFile(), cl0.i.IMAGE));
        }
        AddPhotoData photoData2 = value.getPhotoData();
        if (photoData2 != null && photoData2.getIsPhotoWithGlassesOptionChecked()) {
            Iterator<T> it4 = value.getPhotoGlassesAttachment().a().iterator();
            while (it4.hasNext()) {
                listC.add(new ChildPassportApplicationAttachmentsToSend((wx.i) it4.next(), cl0.i.GLASSES));
            }
        }
        AddPhotoData photoData3 = value.getPhotoData();
        if (photoData3 != null && photoData3.getIsFaceCoveringPhotoOptionChecked()) {
            Iterator<T> it5 = value.getPhotoFaceCoverAttachment().a().iterator();
            while (it5.hasNext()) {
                listC.add(new ChildPassportApplicationAttachmentsToSend((wx.i) it5.next(), cl0.i.HEAD_COVERING));
            }
        }
        Iterator<T> it6 = value.getSignedConsentAttachmentsData().a().iterator();
        while (it6.hasNext()) {
            listC.add(new ChildPassportApplicationAttachmentsToSend((wx.i) it6.next(), cl0.i.AGREEMENT));
        }
        Iterator<T> it7 = value.getOtherParentUnableToConsentAttachmentsData().a().iterator();
        while (it7.hasNext()) {
            listC.add(new ChildPassportApplicationAttachmentsToSend((wx.i) it7.next(), cl0.i.AGREEMENT));
        }
        l91.a.DiscountTypeData discountTypeData = value.getDiscountTypeData();
        i61.l discountType = discountTypeData != null ? discountTypeData.getDiscountType() : null;
        int i16 = discountType == null ? -1 : b.f132756d[discountType.ordinal()];
        if (i16 == -1) {
            listN = pq.v.n();
        } else if (i16 == 1) {
            listN = value.getKdrAttachmentsData().a();
        } else if (i16 == 2) {
            listN = value.getTechnicalIssueAttachmentsData().a();
        } else if (i16 != 3) {
            if (i16 != 4 && i16 != 5) {
                throw new oq.p();
            }
            listN = pq.v.n();
        } else {
            listN = value.getAbroadTreatmentAttachmentsData().a();
        }
        Iterator<T> it8 = listN.iterator();
        while (it8.hasNext()) {
            listC.add(new ChildPassportApplicationAttachmentsToSend((wx.i) it8.next(), cl0.i.DISCOUNT));
        }
        Iterator<T> it9 = value.getOldMoneyTransferAttachmentsData().a().iterator();
        while (it9.hasNext()) {
            listC.add(new ChildPassportApplicationAttachmentsToSend((wx.i) it9.next(), cl0.i.BANK_TRANSFER));
        }
        Iterator<T> it10 = value.getNewMoneyTransferAttachmentsData().a().iterator();
        while (it10.hasNext()) {
            listC.add(new ChildPassportApplicationAttachmentsToSend((wx.i) it10.next(), cl0.i.BANK_TRANSFER));
        }
        return pq.v.a(listC);
    }

    public void q2() {
        d9(a.h.f132411a);
    }

    @Override // m71.a
    public void q3(ContactDetailsData data) {
        d9(new a.SaveContactDetails(new m71.a.ChildPassportApplicationContactDetailsData(new ContactDetailsFormData(data, this.mapper.b()))));
    }

    @Override // t91.a
    public t91.a.ChildPassportApplicationReasonData q7() {
        return getState().getValue().getReasonData();
    }

    @Override // x61.a
    public boolean r1() {
        BEPassportChildApplicationOfficeDictionary institution;
        u81.a.ChildPassportApplicationInstitutionData institutionData = getState().getValue().getInstitutionData();
        boolean onlinePaymentSupported = (institutionData == null || (institution = institutionData.getInstitution()) == null) ? false : institution.getOnlinePaymentSupported();
        boolean zBooleanValue = this.isPassportOnlinePaymentFeatureEnabledUC.b(gz.b.a.C1792a.f78542a).booleanValue();
        boolean zContains = e1.i(l91.b.PASSPORT_POLAND, l91.b.TEMPORARY_PASSPORT_POLAND).contains(r2().getPassportTypeWithPlace());
        Set setI = e1.i(i61.l.SCHOOL_AGED_CHILDREN, i61.l.KDR_OWNERS, i61.l.TEMPORARY_PASSPORT);
        l91.a.DiscountTypeData discountTypeData = getState().getValue().getDiscountTypeData();
        return zBooleanValue && zContains && pq.v.c0(setI, discountTypeData != null ? discountTypeData.getDiscountType() : null) && onlinePaymentSupported;
    }

    @Override // l91.a
    public l91.a.PassportTypeWithPlaceData r2() {
        l91.b bVar;
        al0.s0 passportType = getState().getValue().getPassportTypeData().getPassportType();
        al0.s0 s0Var = al0.s0.TEMPORARY;
        if (passportType == s0Var && getState().getValue().getPassportOfficePlaceData().getPassportOfficePlace() == cl0.g0.POLAND) {
            bVar = l91.b.TEMPORARY_PASSPORT_POLAND;
        } else if (getState().getValue().getPassportTypeData().getPassportType() == s0Var && getState().getValue().getPassportOfficePlaceData().getPassportOfficePlace() == cl0.g0.ABROAD) {
            bVar = l91.b.TEMPORARY_PASSPORT_ABROAD;
        } else {
            bVar = (getState().getValue().getPassportTypeData().getPassportType() == al0.s0.BIOMETRIC && getState().getValue().getPassportOfficePlaceData().getPassportOfficePlace() == cl0.g0.ABROAD) ? l91.b.PASSPORT_ABROAD : l91.b.PASSPORT_POLAND;
        }
        return new l91.a.PassportTypeWithPlaceData(bVar);
    }

    @Override // c91.a
    public void r3() {
        d9(a.m.f132421a);
    }

    @Override // x71.a
    public void r8(i61.d address) {
        d9(new a.SaveCorrespondenceAddress(address));
    }

    @Override // r71.a
    public ChildPassportApplicationCorrespondenceCountryData t1() {
        return getState().getValue().getCorrespondenceCountryData();
    }

    @Override // u61.b
    public void v1(u61.c attachmentType, u61.b.AttachmentsData attachmentsData) {
        d9(new a.SavePhotoAttachmentsChanged(attachmentType, attachmentsData));
    }

    @Override // d81.a
    public DataSplitData v8() {
        return getState().getValue().getDataSplitData();
    }

    @Override // x71.a
    public i61.d y0() {
        return getState().getValue().getCorrespondenceAddress();
    }

    @Override // u81.a
    public u81.a.ChildPassportApplicationInstitutionData y3() {
        return getState().getValue().getInstitutionData();
    }

    @Override // i91.a
    public i61.l z3() {
        l91.a.DiscountTypeData discountTypeData = getState().getValue().getDiscountTypeData();
        if (discountTypeData != null) {
            return discountTypeData.getDiscountType();
        }
        return null;
    }
}
