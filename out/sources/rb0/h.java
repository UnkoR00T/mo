package rb0;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import e40.BarCodeSingleCardData;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import g70.ShortcutMoreData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import iy.b0;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import l60.KeyValueData;
import mx.Label;
import n20.State;
import n3.o1;
import n30.CardListData;
import n50.BodySection;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import o20.BaseDocumentData;
import o20.DocumentGiloshData;
import o20.s2;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import qb0.ErrorDeleting;
import qb0.ErrorInitial;
import qb0.ErrorLoading;
import qb0.ErrorUpdating;
import qb0.p;
import sb0.DynamicDocumentBottomSheetData;
import vf0.MainDocumentPhotoData;
import x50.NavigationButtonData;
import yf0.BarcodeSchema;
import yf0.DocumentDynamicSection;
import yf0.DocumentSchemaAttribute;
import yf0.DocumentSchemaLabel;
import yf0.DocumentStaticSection;
import yf0.DocumentTopAnnotation;
import yf0.MissingDocumentAttribute;
import yf0.QrCodeSchema;
import yf0.n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001jBA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JO\u0010\"\u001a\u00020!2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001a0\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J1\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b+\u0010,J\u009f\u0001\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001a0\u001c2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001a0\u001c2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001a0\u001c2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002090)2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b:\u0010;J+\u0010<\u001a\u00020-2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b<\u0010=J\u001b\u0010A\u001a\u0004\u0018\u00010@2\b\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\bA\u0010BJ%\u0010F\u001a\u0004\u0018\u00010>2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010E\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\bF\u0010GJ\u001b\u0010J\u001a\u00020>*\u00020H2\u0006\u0010I\u001a\u00020>H\u0002¢\u0006\u0004\bJ\u0010KJ#\u0010N\u001a\u00020>*\u00020>2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010)H\u0002¢\u0006\u0004\bN\u0010OJ\u001b\u0010Q\u001a\u00020>*\u00020>2\u0006\u0010P\u001a\u00020LH\u0002¢\u0006\u0004\bQ\u0010RJ'\u0010W\u001a\b\u0012\u0004\u0012\u000206052\b\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ%\u0010\\\u001a\u0004\u0018\u00010[*\n\u0012\u0004\u0012\u00020Y\u0018\u00010)2\u0006\u0010Z\u001a\u00020>H\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010a\u001a\u00020`2\u0006\u0010^\u001a\u00020>2\u0006\u0010_\u001a\u00020HH\u0002¢\u0006\u0004\ba\u0010bJ\u0013\u0010c\u001a\u00020`*\u00020>H\u0002¢\u0006\u0004\bc\u0010dJ\u0013\u0010e\u001a\u00020`*\u00020UH\u0002¢\u0006\u0004\be\u0010fJ\u0018\u0010h\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\bh\u0010iR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w¨\u0006x"}, d2 = {"Lrb0/h;", "Lxw/f;", "Lrb0/h$a;", "Lqb0/p$a;", "Lmx/c;", "labelProvider", "Lrb0/j;", "dynamicDocumentSchemaDecoder", "Lp20/c;", "giloshMapper", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "<init>", "(Lmx/c;Lrb0/j;Lp20/c;Lez/e;Lez/c;Lrz/a;Liy/a;)V", "Ln20/b;", "Lqb0/k;", "state", "Lqb0/k$c;", "documentState", "Lkotlin/Function0;", "Loq/i0;", "updateDocumentAction", "Lkotlin/Function1;", "Ln20/a;", "dispatchAction", "Lo20/s2;", "documentVMS", "Lo20/r2;", "I", "(Ln20/b;Lqb0/k$c;Ler/a;Ler/l;Lo20/s2;)Lo20/r2;", "Landroid/graphics/Bitmap;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lqb0/k$c;)Landroid/graphics/Bitmap;", "confirmDocumentAction", "deleteDocumentAction", "", "Lo50/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ler/a;Ler/a;)Ljava/util/List;", "Lcb4/d;", "showDialog", "closeDialog", "Lp50/a;", "showSnackBarAction", "Lsb0/b;", "enlargeQrCode", "hideBottomSheet", "", "Lo20/l;", "x", "(Lqb0/k$c;Ler/a;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;)Ljava/util/List;", "Lo20/u2;", "J", "(Lqb0/k$c;)Ljava/util/List;", "u", "(Ler/a;Ler/a;)Lcb4/d;", "", "hexColor", "Landroidx/compose/ui/graphics/Color;", "T", "(Ljava/lang/String;)Landroidx/compose/ui/graphics/Color;", "Lyf0/o;", "missingAttribute", "attributeValue", "N", "(Lyf0/o;Ljava/lang/String;)Ljava/lang/String;", "Lyf0/n;", "defaultValue", "v", "(Lyf0/n;Ljava/lang/String;)Ljava/lang/String;", "Lyf0/i;", "fontStyles", "r", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "style", "q", "(Ljava/lang/String;Lyf0/i;)Ljava/lang/String;", "Lyf0/l;", "topAnnotation", "Liy/b0;", "data", "M", "(Lyf0/l;Liy/b0;)Ljava/util/List;", "Lyf0/j;", "tag", "Lmx/a;", "K", "(Ljava/util/List;Ljava/lang/String;)Lmx/a;", "value", "dataType", "", "s", "(Ljava/lang/String;Lyf0/n;)Z", "R", "(Ljava/lang/String;)Z", ip.a.f96137b, "(Liy/b0;)Z", "params", "O", "(Lrb0/h$a;)Lqb0/p$a;", "a", "Lmx/c;", "b", "Lrb0/j;", "c", "Lp20/c;", "d", "Lez/e;", "e", "Lez/c;", "f", "Lrz/a;", "g", "Liy/a;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, p.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j dynamicDocumentSchemaDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: rb0.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b%\u0010/R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b4\u0010/R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b-\u0010/R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u0010/R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b0\u0010/R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b8\u00103R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b6\u0010/R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b9\u00103R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b)\u0010/¨\u0006:"}, d2 = {"Lrb0/h$a;", "", "Ln20/b;", "Lqb0/k;", "state", "Lo20/s2;", "documentVMS", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lkotlin/Function1;", "Ln20/a;", "dispatchAction", "downloadDocumentAction", "confirmDocumentAction", "updateDocumentAction", "Lp50/a;", "showSnackBar", "deleteDocumentAction", "Lsb0/b;", "showBottomSheet", "hideBottomSheet", "Lcb4/d;", "showDialog", "closeDialog", "<init>", "(Ln20/b;Lo20/s2;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/l;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "l", "()Ln20/b;", "b", "Lo20/s2;", "f", "()Lo20/s2;", "c", "Ler/a;", "()Ler/a;", "d", "Ler/l;", "e", "()Ler/l;", "g", "m", "h", "k", "i", "j", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<qb0.k> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> downloadDocumentAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> confirmDocumentAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> updateDocumentAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<p50.a, i0> showSnackBar;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteDocumentAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<DynamicDocumentBottomSheetData, i0> showBottomSheet;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideBottomSheet;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<DialogData, i0> showDialog;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeDialog;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<qb0.k> state, s2 s2Var, er.a<i0> aVar, er.l<? super n20.a, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.l<? super p50.a, i0> lVar2, er.a<i0> aVar5, er.l<? super DynamicDocumentBottomSheetData, i0> lVar3, er.a<i0> aVar6, er.l<? super DialogData, i0> lVar4, er.a<i0> aVar7) {
            this.state = state;
            this.documentVMS = s2Var;
            this.backAction = aVar;
            this.dispatchAction = lVar;
            this.downloadDocumentAction = aVar2;
            this.confirmDocumentAction = aVar3;
            this.updateDocumentAction = aVar4;
            this.showSnackBar = lVar2;
            this.deleteDocumentAction = aVar5;
            this.showBottomSheet = lVar3;
            this.hideBottomSheet = aVar6;
            this.showDialog = lVar4;
            this.closeDialog = aVar7;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeDialog;
        }

        public final er.a<i0> c() {
            return this.confirmDocumentAction;
        }

        public final er.a<i0> d() {
            return this.deleteDocumentAction;
        }

        public final er.l<n20.a, i0> e() {
            return this.dispatchAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.documentVMS, params.documentVMS) && t.c(this.backAction, params.backAction) && t.c(this.dispatchAction, params.dispatchAction) && t.c(this.downloadDocumentAction, params.downloadDocumentAction) && t.c(this.confirmDocumentAction, params.confirmDocumentAction) && t.c(this.updateDocumentAction, params.updateDocumentAction) && t.c(this.showSnackBar, params.showSnackBar) && t.c(this.deleteDocumentAction, params.deleteDocumentAction) && t.c(this.showBottomSheet, params.showBottomSheet) && t.c(this.hideBottomSheet, params.hideBottomSheet) && t.c(this.showDialog, params.showDialog) && t.c(this.closeDialog, params.closeDialog);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public final er.a<i0> g() {
            return this.downloadDocumentAction;
        }

        public final er.a<i0> h() {
            return this.hideBottomSheet;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.state.hashCode() * 31) + this.documentVMS.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.downloadDocumentAction.hashCode()) * 31) + this.confirmDocumentAction.hashCode()) * 31) + this.updateDocumentAction.hashCode()) * 31) + this.showSnackBar.hashCode()) * 31) + this.deleteDocumentAction.hashCode()) * 31) + this.showBottomSheet.hashCode()) * 31) + this.hideBottomSheet.hashCode()) * 31) + this.showDialog.hashCode()) * 31) + this.closeDialog.hashCode();
        }

        public final er.l<DynamicDocumentBottomSheetData, i0> i() {
            return this.showBottomSheet;
        }

        public final er.l<DialogData, i0> j() {
            return this.showDialog;
        }

        public final er.l<p50.a, i0> k() {
            return this.showSnackBar;
        }

        public final State<qb0.k> l() {
            return this.state;
        }

        public final er.a<i0> m() {
            return this.updateDocumentAction;
        }

        public String toString() {
            return "Params(state=" + this.state + ", documentVMS=" + this.documentVMS + ", backAction=" + this.backAction + ", dispatchAction=" + this.dispatchAction + ", downloadDocumentAction=" + this.downloadDocumentAction + ", confirmDocumentAction=" + this.confirmDocumentAction + ", updateDocumentAction=" + this.updateDocumentAction + ", showSnackBar=" + this.showSnackBar + ", deleteDocumentAction=" + this.deleteDocumentAction + ", showBottomSheet=" + this.showBottomSheet + ", hideBottomSheet=" + this.hideBottomSheet + ", showDialog=" + this.showDialog + ", closeDialog=" + this.closeDialog + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f172895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f172896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f172897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f172898e;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f172894a = iArr;
            int[] iArr2 = new int[vf0.c.values().length];
            try {
                iArr2[vf0.c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[vf0.c.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[vf0.c.TO_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f172895b = iArr2;
            int[] iArr3 = new int[MissingDocumentAttribute.a.values().length];
            try {
                iArr3[MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[MissingDocumentAttribute.a.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f172896c = iArr3;
            int[] iArr4 = new int[n.values().length];
            try {
                iArr4[n.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[n.DATE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[n.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[n.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f172897d = iArr4;
            int[] iArr5 = new int[yf0.i.values().length];
            try {
                iArr5[yf0.i.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[yf0.i.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            f172898e = iArr5;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ qb0.k.DocumentDisplayed f172900b;

        c(qb0.k.DocumentDisplayed documentDisplayed) {
            this.f172900b = documentDisplayed;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(1118410074);
            if (p076m2.t.k()) {
                p076m2.t.o(1118410074, i15, -1, "pl.gov.coi.mjunior.feature.dynamicdocument.presentation.singledocument.mapper.DynamicDocumentMapper.getGiloshData.<anonymous> (DynamicDocumentMapper.kt:255)");
            }
            Color colorT = h.this.T(this.f172900b.getData().getDocumentSchema().getPicture().getAttributesValueTextHexColor());
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return colorT;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ qb0.k.DocumentDisplayed f172902b;

        d(qb0.k.DocumentDisplayed documentDisplayed) {
            this.f172902b = documentDisplayed;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(-1297030599);
            if (p076m2.t.k()) {
                p076m2.t.o(-1297030599, i15, -1, "pl.gov.coi.mjunior.feature.dynamicdocument.presentation.singledocument.mapper.DynamicDocumentMapper.getGiloshData.<anonymous> (DynamicDocumentMapper.kt:260)");
            }
            Color colorT = h.this.T(this.f172902b.getData().getDocumentSchema().getPicture().getAttributesTitleTextHexColor());
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return colorT;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ qb0.k.DocumentDisplayed f172904b;

        e(qb0.k.DocumentDisplayed documentDisplayed) {
            this.f172904b = documentDisplayed;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(1865038497);
            if (p076m2.t.k()) {
                p076m2.t.o(1865038497, i15, -1, "pl.gov.coi.mjunior.feature.dynamicdocument.presentation.singledocument.mapper.DynamicDocumentMapper.getMarkingsData.<anonymous>.<anonymous> (DynamicDocumentMapper.kt:503)");
            }
            Color colorT = h.this.T(this.f172904b.getData().getDocumentSchema().getPicture().getEmblemTextHexColor());
            long jM20unboximpl = colorT != null ? colorT.m20unboximpl() : Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jM20unboximpl);
        }
    }

    public h(mx.c cVar, j jVar, p20.c cVar2, ez.e eVar, ez.c cVar3, rz.a aVar, iy.a aVar2) {
        this.labelProvider = cVar;
        this.dynamicDocumentSchemaDecoder = jVar;
        this.giloshMapper = cVar2;
        this.dateFormatter = eVar;
        this.dateConverter = cVar3;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(qb0.k.DocumentDisplayed documentDisplayed, er.a aVar, er.l lVar, h hVar, er.a aVar2, er.a aVar3) {
        if (b.f172895b[documentDisplayed.getData().getDocumentStatus().ordinal()] == 1) {
            aVar.a();
        } else {
            lVar.b(hVar.u(aVar2, aVar3));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(h hVar, qb0.k.DocumentDisplayed documentDisplayed, er.a aVar, er.l lVar) {
        if (hVar.S(documentDisplayed.getData().getRawDocumentData())) {
            aVar.a();
        } else {
            lVar.b(new p50.a.DefaultWithIcon(hVar.labelProvider.c(mb0.a.f125237f), false, null, null, 14, null));
        }
        return i0.f148189a;
    }

    private final Bitmap H(qb0.k.DocumentDisplayed documentState) {
        String photo;
        Object objB;
        String sourceContainerRef = documentState.getData().getDocumentSchema().getPicture().getSourceContainerRef();
        if (sourceContainerRef == null || (photo = j.c(this.dynamicDocumentSchemaDecoder, n.TEXT, sourceContainerRef, null, null, documentState.getData().getRawDocumentData(), null, 44, null)) == null) {
            MainDocumentPhotoData documentPhoto = documentState.getData().getDocumentPhoto();
            photo = documentPhoto != null ? documentPhoto.getPhoto() : null;
        }
        rz.a aVar = this.bitmapDecoder;
        dx.i iVarC = iy.a.c(this.base64Coder, photo, null, 2, null);
        if (iVarC instanceof dx.i.Left) {
            objB = new byte[0];
        } else {
            if (!(iVarC instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB = ((dx.i.Right) iVarC).b();
        }
        return aVar.a((byte[]) objB);
    }

    private final DocumentGiloshData I(State<qb0.k> state, qb0.k.DocumentDisplayed documentState, er.a<i0> updateDocumentAction, er.l<? super n20.a, i0> dispatchAction, s2 documentVMS) {
        boolean z15;
        Label labelC;
        KeyValueData keyValueData;
        p20.c cVar = this.giloshMapper;
        List<u2> listJ = J(documentState);
        o20.p pVarB = o20.p.INSTANCE.b(documentState.getData().getDocumentSchema().getPicture().getPictureId());
        Bitmap bitmapH = H(documentState);
        vf0.c documentStatus = documentState.getData().getDocumentStatus();
        int[] iArr = b.f172895b;
        int i15 = iArr[documentStatus.ordinal()];
        int i16 = 0;
        if (i15 == 1) {
            z15 = true;
        } else {
            if (i15 != 2 && i15 != 3) {
                throw new oq.p();
            }
            z15 = false;
        }
        int i17 = iArr[documentState.getData().getDocumentStatus().ordinal()];
        if (i17 == 1) {
            labelC = this.labelProvider.c(mb0.a.f125247p);
        } else {
            if (i17 != 2 && i17 != 3) {
                throw new oq.p();
            }
            labelC = this.labelProvider.c(mb0.a.f125244m);
        }
        Label label = labelC;
        List<DocumentSchemaAttribute> listA = documentState.getData().getDocumentSchema().getPicture().a();
        ArrayList arrayList = new ArrayList();
        for (Iterator it = listA.iterator(); it.hasNext(); it = it) {
            Object next = it.next();
            int i18 = i16 + 1;
            if (i16 < 0) {
                pq.v.x();
            }
            DocumentSchemaAttribute documentSchemaAttribute = (DocumentSchemaAttribute) next;
            String strN = N(documentSchemaAttribute.getOnMissingAttribute(), this.dynamicDocumentSchemaDecoder.b(documentSchemaAttribute.getDataType(), documentSchemaAttribute.getFieldReference(), documentSchemaAttribute.e(), documentSchemaAttribute.c(), documentState.getData().getRawDocumentData(), documentSchemaAttribute.a()));
            if (strN != null) {
                String strR = r(strN, documentSchemaAttribute.f());
                keyValueData = new KeyValueData(mx.b.b(strR, "attributeValue_" + i16), mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentSchemaAttribute.g()), "pictureAttribute_" + i16), s(strR, documentSchemaAttribute.getDataType()));
            } else {
                keyValueData = null;
            }
            if (keyValueData != null) {
                arrayList.add(keyValueData);
            }
            i16 = i18;
            z15 = z15;
            listJ = listJ;
        }
        return cVar.b(new p20.c.Params(listJ, state, pVarB, bitmapH, null, null, null, z15, label, this.labelProvider.c(mb0.a.f125240i), updateDocumentAction, arrayList, new c(documentState), new d(documentState), dispatchAction, documentVMS, 112, null));
    }

    private final List<u2> J(qb0.k.DocumentDisplayed documentState) {
        List listC = pq.v.c();
        listC.add(new u2.Flag(e20.k.Poland, this.labelProvider.c(mb0.a.f125241j)));
        listC.add(new u2.Hologram(null, new e(documentState), 1, null));
        return pq.v.a(listC);
    }

    private final Label K(List<DocumentSchemaLabel> list, String str) {
        String strA;
        if (list == null || (strA = this.dynamicDocumentSchemaDecoder.a(list)) == null) {
            return null;
        }
        return mx.b.b(strA, str);
    }

    private final List<SmallCardData> L(er.a<i0> confirmDocumentAction, er.a<i0> deleteDocumentAction) {
        List listC = pq.v.c();
        listC.add(new SmallCardData(null, this.labelProvider.c(mb0.a.f125250s), null, jz.a.f106785h1, o50.f.c.f142478a, false, confirmDocumentAction, 37, null));
        listC.add(new SmallCardData(null, this.labelProvider.c(mb0.a.f125243l), null, jz.a.f106727a, o50.f.b.f142477a, false, deleteDocumentAction, 37, null));
        return pq.v.a(listC);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:68:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0079 A[SYNTHETIC] */
    private final List<o20.l> M(DocumentTopAnnotation topAnnotation, b0 data) {
        List<DocumentSchemaLabel> listB;
        List<DocumentStaticSection> listC;
        List<DocumentSchemaLabel> listD;
        Label labelK;
        List<DocumentSchemaLabel> listB2;
        Label labelK2;
        List<DocumentStaticSection> listC2;
        ArrayList arrayList;
        DocumentDynamicSection dynamicSections;
        ArrayList arrayList2;
        List<String> listA;
        Iterator<T> it;
        Label labelK3;
        ArrayList arrayList3 = new ArrayList();
        if (topAnnotation != null) {
            List<DocumentSchemaLabel> listD2 = topAnnotation.d();
            ArrayList arrayList4 = null;
            if ((listD2 == null || listD2.isEmpty()) && (((listB = topAnnotation.b()) == null || listB.isEmpty()) && ((listC = topAnnotation.c()) == null || listC.isEmpty()))) {
                DocumentDynamicSection dynamicSections2 = topAnnotation.getDynamicSections();
                List<String> listA2 = dynamicSections2 != null ? dynamicSections2.a() : null;
                if (listA2 != null && !listA2.isEmpty()) {
                    listD = topAnnotation.d();
                    if (listD != null) {
                        labelK = K(listD, "title");
                    } else {
                        labelK = null;
                    }
                    listB2 = topAnnotation.b();
                    if (listB2 != null) {
                        labelK2 = K(listB2, "section");
                    } else {
                        labelK2 = null;
                    }
                    listC2 = topAnnotation.c();
                    if (listC2 != null) {
                        arrayList = new ArrayList();
                        it = listC2.iterator();
                        while (it.hasNext()) {
                            labelK3 = K(((DocumentStaticSection) it.next()).a(), "staticSection");
                            if (labelK3 != null) {
                                arrayList.add(labelK3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null || arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    dynamicSections = topAnnotation.getDynamicSections();
                    if (dynamicSections != null || (listA = dynamicSections.a()) == null) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = new ArrayList();
                        Iterator<T> it4 = listA.iterator();
                        while (it4.hasNext()) {
                            String strC = j.c(this.dynamicDocumentSchemaDecoder, n.TEXT, (String) it4.next(), null, null, data, null, 44, null);
                            Label labelB = strC != null ? mx.b.b(strC, "dynamicSection") : null;
                            if (labelB != null) {
                                arrayList2.add(labelB);
                            }
                        }
                    }
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList4 = arrayList2;
                    }
                    arrayList3.add(new o20.l.TopSection(labelK, labelK2, arrayList, arrayList4));
                }
            } else {
                listD = topAnnotation.d();
                if (listD != null) {
                    labelK = K(listD, "title");
                } else {
                    labelK = null;
                }
                listB2 = topAnnotation.b();
                if (listB2 != null) {
                    labelK2 = K(listB2, "section");
                } else {
                    labelK2 = null;
                }
                listC2 = topAnnotation.c();
                if (listC2 != null) {
                    arrayList = new ArrayList();
                    it = listC2.iterator();
                    while (it.hasNext()) {
                        labelK3 = K(((DocumentStaticSection) it.next()).a(), "staticSection");
                        if (labelK3 != null) {
                            arrayList.add(labelK3);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    arrayList = null;
                } else {
                    arrayList = null;
                }
                dynamicSections = topAnnotation.getDynamicSections();
                if (dynamicSections != null) {
                    arrayList2 = null;
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    arrayList4 = arrayList2;
                }
                arrayList3.add(new o20.l.TopSection(labelK, labelK2, arrayList, arrayList4));
            }
        }
        return arrayList3;
    }

    private final String N(MissingDocumentAttribute missingAttribute, String attributeValue) {
        if (attributeValue == null || fu.r.t0(attributeValue)) {
            attributeValue = null;
        }
        if (attributeValue != null) {
            return attributeValue;
        }
        MissingDocumentAttribute.a onMissing = missingAttribute != null ? missingAttribute.getOnMissing() : null;
        int i15 = onMissing == null ? -1 : b.f172896c[onMissing.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                return Label.INSTANCE.b().getText();
            }
            return null;
        }
        n dataType = missingAttribute.getDataType();
        if (dataType == null) {
            return null;
        }
        String defaultValue = missingAttribute.getDefaultValue();
        if (defaultValue == null) {
            defaultValue = Label.INSTANCE.c().getText();
        }
        return v(dataType, defaultValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(Params params, h hVar, qb0.k kVar) {
        params.j().b(new DialogData(cb4.h.b.f24985a, hVar.labelProvider.e(mb0.a.f125255x, ((qb0.k.DocumentDisplayed) kVar).getData().getDocumentSchema().getDocumentName()), hVar.labelProvider.c(mb0.a.f125254w), new DialogButtonTextData(hVar.labelProvider.c(mb0.a.f125236e), null, params.d(), 2, null), new DialogButtonTextData(hVar.labelProvider.c(mb0.a.f125234c), null, params.b(), 2, null), null, null, 96, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(Params params, v vVar) {
        int i15 = b.f172894a[vVar.ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                throw new oq.p();
            }
            params.h().a();
        }
        return i0.f148189a;
    }

    private final boolean R(String str) {
        if (str.length() > 3) {
            for (int i15 = 0; i15 < str.length(); i15++) {
                char cCharAt = str.charAt(i15);
                if (Character.isDigit(cCharAt) || cCharAt == '/') {
                }
            }
            return true;
        }
        return false;
    }

    private final boolean S(b0 b0Var) {
        OffsetDateTime offsetDateTimePlus;
        String strC = j.c(this.dynamicDocumentSchemaDecoder, n.TEXT, "dh.ts", null, null, b0Var, null, 44, null);
        if (strC == null) {
            return true;
        }
        OffsetDateTime offsetDateTimeI = this.dateConverter.i(this.dateFormatter.d(new fz.b.String(strC, fz.c.FULL_TIME_NO_SPACES, false, 4, null), fz.c.OFFSET_DATE_TIME_SEC));
        if (offsetDateTimeI == null || (offsetDateTimePlus = offsetDateTimeI.plus(5L, (TemporalUnit) ChronoUnit.MINUTES)) == null) {
            return true;
        }
        return offsetDateTimePlus.isBefore(OffsetDateTime.now());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Color T(String hexColor) {
        dx.i left;
        Object objB;
        if (hexColor == null) {
            return null;
        }
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    left = new dx.i.Right(Color.m0boximpl(o1.b(android.graphics.Color.parseColor(hexColor))));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
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
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    left = new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                left = new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
            return (Color) left.a();
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final String q(String str, yf0.i iVar) {
        int i15 = b.f172898e[iVar.ordinal()];
        if (i15 == 1) {
            return str.toUpperCase(Locale.ROOT);
        }
        if (i15 == 2) {
            return str;
        }
        throw new oq.p();
    }

    private final String r(String str, List<? extends yf0.i> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                str = q(str, (yf0.i) it.next());
            }
        }
        return str;
    }

    private final boolean s(String value, n dataType) {
        int i15 = b.f172897d[dataType.ordinal()];
        if (i15 != 3) {
            return i15 == 4;
        }
        return R(value);
    }

    private final DialogData u(er.a<i0> updateDocumentAction, er.a<i0> closeDialog) {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(mb0.a.f125253v), this.labelProvider.c(mb0.a.f125252u), new DialogButtonTextData(this.labelProvider.c(mb0.a.f125238g), null, updateDocumentAction, 2, null), new DialogButtonTextData(this.labelProvider.c(mb0.a.f125234c), null, closeDialog, 2, null), null, null, 96, null);
    }

    private final String v(n nVar, String str) {
        int i15 = b.f172897d[nVar.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? str : this.dateFormatter.d(new fz.b.String(str, fz.c.OFFSET_DATE_TIME_SEC, false, 4, null), fz.c.DOTTED_TIME_PLUS_DATE);
        }
        return this.dateFormatter.d(new fz.b.String(str, fz.c.DASHED_REVERSED, false, 4, null), fz.c.DOTTED);
    }

    private final List<o20.l> x(final qb0.k.DocumentDisplayed documentState, final er.a<i0> confirmDocumentAction, final er.a<i0> updateDocumentAction, final er.l<? super DialogData, i0> showDialog, final er.a<i0> closeDialog, final er.l<? super p50.a, i0> showSnackBarAction, final er.l<? super DynamicDocumentBottomSheetData, i0> enlargeQrCode, final er.a<i0> hideBottomSheet, er.a<i0> deleteDocumentAction) {
        DefaultSingleCardData defaultSingleCardData;
        Bitmap bitmap;
        final Bitmap bitmap2;
        ArrayList arrayList = new ArrayList();
        QrCodeSchema qrCode = documentState.getData().getDocumentSchema().getQrCode();
        if (qrCode != null && (bitmap2 = documentState.getData().getBitmapsByFieldReference().b().get(qrCode.getFieldReference())) != null) {
            arrayList.add(new o20.l.SingleCardImageButton(bitmap2, this.labelProvider.c(mb0.a.f125239h), new er.a() { // from class: rb0.d
                @Override // er.a
                public final Object a() {
                    return h.z(enlargeQrCode, bitmap2, this, hideBottomSheet);
                }
            }));
        }
        arrayList.add(new o20.l.Shortcuts(new ShortcutsLayoutData(L(new er.a() { // from class: rb0.e
            @Override // er.a
            public final Object a() {
                return h.E(documentState, confirmDocumentAction, showDialog, this, updateDocumentAction, closeDialog);
            }
        }, deleteDocumentAction), new ShortcutMoreData(this.labelProvider.c(mb0.a.f125251t), new er.l() { // from class: rb0.f
            @Override // er.l
            public final Object b(Object obj) {
                return h.F((List) obj);
            }
        }))));
        BarcodeSchema barcode = documentState.getData().getDocumentSchema().getBarcode();
        if (barcode != null && (bitmap = documentState.getData().getBitmapsByFieldReference().a().get(barcode.getFieldReference())) != null) {
            Label labelK = K(barcode.b(), "barcodeLabel");
            if (labelK == null) {
                labelK = Label.INSTANCE.b();
            }
            arrayList.add(new o20.l.Button(new CustomSingleCardData("DynamicDocumentBarCodeSingleCard", new e40.b(new BarCodeSingleCardData(labelK, new n50.i.Image(bitmap, null, null, 6, null))), null, false, null, null, false, null, 252, null)));
        }
        List<DocumentSchemaAttribute> listD = documentState.getData().getDocumentSchema().d();
        int i15 = 0;
        if (listD != null) {
            ArrayList arrayList2 = new ArrayList();
            int i16 = 0;
            for (Object obj : listD) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    pq.v.x();
                }
                DocumentSchemaAttribute documentSchemaAttribute = (DocumentSchemaAttribute) obj;
                String strN = N(documentSchemaAttribute.getOnMissingAttribute(), this.dynamicDocumentSchemaDecoder.b(documentSchemaAttribute.getDataType(), documentSchemaAttribute.getFieldReference(), documentSchemaAttribute.e(), documentSchemaAttribute.c(), documentState.getData().getRawDocumentData(), documentSchemaAttribute.a()));
                if (strN != null) {
                    defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentSchemaAttribute.g()), "commonAttributeTitle_" + i16), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.b(strN, "attributeValue_" + i16), null, null, 0, 0, s(strN, documentSchemaAttribute.getDataType()) ? j70.a.LETTER_BY_LETTER : j70.a.LOWER_CASE, 30, null)), null, 4, null), null, null, null, 3839, null);
                } else {
                    defaultSingleCardData = null;
                }
                if (defaultSingleCardData != null) {
                    arrayList2.add(defaultSingleCardData);
                }
                i16 = i17;
            }
            arrayList.add(new o20.l.Section(null, arrayList2, 1, null));
        }
        List<DocumentSchemaAttribute> listA = documentState.getData().getDocumentSchema().a();
        if (listA != null) {
            Label labelK2 = K(documentState.getData().getDocumentSchema().b(), "");
            if (labelK2 == null) {
                labelK2 = this.labelProvider.c(mb0.a.f125242k).n("AdditionalAttributesTitle");
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listA) {
                int i18 = i15 + 1;
                if (i15 < 0) {
                    pq.v.x();
                }
                DocumentSchemaAttribute documentSchemaAttribute2 = (DocumentSchemaAttribute) obj2;
                String strN2 = N(documentSchemaAttribute2.getOnMissingAttribute(), this.dynamicDocumentSchemaDecoder.b(documentSchemaAttribute2.getDataType(), documentSchemaAttribute2.getFieldReference(), documentSchemaAttribute2.e(), documentSchemaAttribute2.c(), documentState.getData().getRawDocumentData(), documentSchemaAttribute2.a()));
                DefaultSingleCardData defaultSingleCardData2 = strN2 != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentSchemaAttribute2.g()), "additionalAttribute_" + i15), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(strN2, "attributeValue_" + i15), null, null, 3, null)), null, 4, null), null, null, null, 3839, null) : null;
                if (defaultSingleCardData2 != null) {
                    arrayList3.add(defaultSingleCardData2);
                }
                i15 = i18;
            }
            arrayList.add(new o20.l.Expandable(labelK2, new CardListData(arrayList3, null, false, null, null, 30, null)));
        }
        Label labelC = this.labelProvider.c(mb0.a.f125245n);
        String strC = j.c(this.dynamicDocumentSchemaDecoder, n.TEXT, "dh.ts", null, null, documentState.getData().getRawDocumentData(), null, 44, null);
        arrayList.add(new o20.l.UpdateDataItem(labelC, mx.b.d(strC != null ? this.dateFormatter.d(new fz.b.String(strC, fz.c.FULL_TIME_NO_SPACES, false, 4, null), fz.c.DOTTED) : null, "lastUpdateValue"), documentState.getData().getDocumentStatus() == vf0.c.ACTIVE ? this.labelProvider.c(mb0.a.f125246o) : null, null, new er.a() { // from class: rb0.g
            @Override // er.a
            public final Object a() {
                return h.G(this.f172870a, documentState, updateDocumentAction, showSnackBarAction);
            }
        }, 8, null));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(er.l lVar, Bitmap bitmap, h hVar, er.a aVar) {
        lVar.b(new DynamicDocumentBottomSheetData(bitmap, hVar.labelProvider.c(mb0.a.f125235d), aVar));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public p.a b(final Params params) {
        final qb0.k kVarD = params.l().d();
        if ((kVarD instanceof qb0.k.LoadingDocument) || (kVarD instanceof qb0.k.DeletingDocument) || (kVarD instanceof qb0.k.UpdatingDocument)) {
            return p.a.c.f165849a;
        }
        if (kVarD instanceof qb0.k.DocumentDisplayed) {
            qb0.k.DocumentDisplayed documentDisplayed = (qb0.k.DocumentDisplayed) kVarD;
            return new p.a.DynamicDocumentData(new BaseDocumentData(null, new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), mx.b.d(documentDisplayed.getData().getDocumentSchema().getDocumentName(), "toolbarTitle"), null, null, null, 28, null), null, null, null, null, 61, null), M(documentDisplayed.getData().getDocumentSchema().getTopAnnotation(), documentDisplayed.getData().getRawDocumentData()), I(params.l(), documentDisplayed, params.g(), params.e(), params.getDocumentVMS()), x(documentDisplayed, params.c(), params.m(), params.j(), params.b(), params.k(), params.i(), params.h(), new er.a() { // from class: rb0.b
                @Override // er.a
                public final Object a() {
                    return h.P(params, this, kVarD);
                }
            }), null, null, 97, null), new ModalBottomSheetData(new ModalSheetState(documentDisplayed.getBottomSheetValue(), false, new er.l() { // from class: rb0.c
                @Override // er.l
                public final Object b(Object obj) {
                    return h.Q(params, (v) obj);
                }
            }, 2, null), this.labelProvider.c(mb0.a.f125232a), null, null, 12, null), documentDisplayed.getBottomSheetContentData(), documentDisplayed.getDialogVMSAdapter(), params.a());
        }
        if (kVarD instanceof ErrorInitial) {
            return new p.a.Error(((ErrorInitial) kVarD).getErrorVMSAdapter());
        }
        if (kVarD instanceof ErrorLoading) {
            return new p.a.Error(((ErrorLoading) kVarD).getErrorVMSAdapter());
        }
        if (kVarD instanceof ErrorDeleting) {
            return new p.a.Error(((ErrorDeleting) kVarD).getErrorVMSAdapter());
        }
        if (kVarD instanceof ErrorUpdating) {
            return new p.a.Error(((ErrorUpdating) kVarD).getErrorVMSAdapter());
        }
        throw new oq.p();
    }
}
