package ew1;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import dw1.j;
import e20.k;
import e40.BarCodeSingleCardData;
import er.l;
import er.p;
import fr.t;
import g70.ShortcutMoreData;
import gv1.BarcodeSchema;
import gv1.DocumentBottomAnnotation;
import gv1.DocumentBottomAnnotationSection;
import gv1.DocumentDynamicSection;
import gv1.DocumentSchema;
import gv1.DocumentSchemaAttribute;
import gv1.DocumentSchemaLabel;
import gv1.DocumentStaticSection;
import gv1.DocumentTopAnnotation;
import gv1.MissingDocumentAttribute;
import gv1.m;
import gv1.s;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import iq0.DashboardServiceEntry;
import iq0.q;
import iy.b0;
import j30.ButtonTextData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import l60.KeyValueData;
import mv1.DynamicDocumentData;
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
import pq.v;
import wv1.BitmapsByFieldReference;
import x40.LinkData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 \u0080\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002trBI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u0004\u0018\u00010\"*\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J5\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u001e2\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b+\u0010,J%\u00102\u001a\b\u0012\u0004\u0012\u0002010\u001e2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103JO\u0010@\u001a\u00020?2\f\u00106\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00108\u001a\u0002072\f\u0010:\u001a\b\u0012\u0004\u0012\u00020(092\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020(0'2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b@\u0010AJw\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010.\u001a\u00020-2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u001e2\u0006\u0010E\u001a\u00020D2\b\u00100\u001a\u0004\u0018\u00010/2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020(092\f\u0010G\u001a\b\u0012\u0004\u0012\u00020(092\f\u0010H\u001a\b\u0012\u0004\u0012\u00020(092\f\u0010I\u001a\b\u0012\u0004\u0012\u00020(09H\u0002¢\u0006\u0004\bJ\u0010KJW\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u001e2\u0006\u0010.\u001a\u00020-2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u001e2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020(092\f\u0010G\u001a\b\u0012\u0004\u0012\u00020(092\f\u0010I\u001a\b\u0012\u0004\u0012\u00020(09H\u0002¢\u0006\u0004\bM\u0010NJ%\u0010R\u001a\u0004\u0018\u00010 2\b\u0010P\u001a\u0004\u0018\u00010O2\b\u0010Q\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bR\u0010SJ\u001b\u0010V\u001a\u00020 *\u00020T2\u0006\u0010U\u001a\u00020 H\u0002¢\u0006\u0004\bV\u0010WJ\u0013\u0010X\u001a\u00020\"*\u000207H\u0002¢\u0006\u0004\bX\u0010YJ\u001b\u0010\\\u001a\u0004\u0018\u00010[2\b\u0010Z\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\\\u0010]J#\u0010`\u001a\u00020 *\u00020 2\u000e\u0010_\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010\u001eH\u0002¢\u0006\u0004\b`\u0010aJ\u001b\u0010c\u001a\u00020 *\u00020 2\u0006\u0010b\u001a\u00020^H\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020e2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bf\u0010gJ?\u0010m\u001a\u0004\u0018\u00010l2\u0006\u0010h\u001a\u00020-2\b\u0010j\u001a\u0004\u0018\u00010i2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020(092\f\u0010k\u001a\b\u0012\u0004\u0012\u00020(09H\u0002¢\u0006\u0004\bm\u0010nJ\u0018\u0010p\u001a\u00020\u00032\u0006\u0010o\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\bp\u0010qR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010|R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010\u007f¨\u0006\u0081\u0001"}, d2 = {"Lew1/e;", "Lxw/f;", "Lew1/e$b;", "Ldw1/j$a;", "Lmx/c;", "labelProvider", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "Lp20/c;", "giloshMapper", "Lev1/a;", "dynamicDocumentSchemaDecoder", "Lv20/a;", "documentValidityBannerMapper", "<init>", "(Lmx/c;Lrz/a;Liy/a;Lez/e;Lez/c;Lp20/c;Lev1/a;Lv20/a;)V", "Lgv1/q;", "topAnnotation", "Lgv1/t;", "data", "", "Lo20/l;", "F", "(Lgv1/q;Liy/b0;)Ljava/util/List;", "", "Lgv1/o;", "", "tag", "Lmx/a;", "x", "(Ljava/util/List;Ljava/lang/String;)Lmx/a;", "Lgv1/d;", "bottomAnnotation", "Lkotlin/Function1;", "Loq/i0;", "openAnnotationLink", "Lc30/b$c;", "q", "(Lgv1/d;Ler/l;)Ljava/util/List;", "Lrq0/b$b;", "documentType", "Lmv1/c;", "documentData", "Lo20/u2;", "v", "(Lrq0/b$b;Lmv1/c;)Ljava/util/List;", "Ln20/b;", "Ldw1/i;", "state", "Ldw1/i$a;", "documentState", "Lkotlin/Function0;", "updateDocumentAction", "Ln20/a;", "dispatchAction", "Lo20/s2;", "documentVMS", "Lo20/r2;", "u", "(Ln20/b;Ldw1/i$a;Ler/a;Ler/l;Lo20/s2;)Lo20/r2;", "Liq0/p;", "availableServices", "Lwv1/a;", "bitmapsByFieldReference", "onGoToSafeBusClicked", "confirmDocumentAction", "updateDocumentWithTimerAction", "deleteDocumentAction", "l", "(Lrq0/b$b;Ljava/util/List;Lwv1/a;Lmv1/c;Ler/a;Ler/a;Ler/a;Ler/a;)Ljava/util/List;", "Lo50/a;", "z", "(Lrq0/b$b;Ljava/util/List;Ler/a;Ler/a;Ler/a;)Ljava/util/List;", "Lgv1/u;", "missingAttribute", "attributeValue", "G", "(Lgv1/u;Ljava/lang/String;)Ljava/lang/String;", "Lgv1/s;", "defaultValue", "i", "(Lgv1/s;Ljava/lang/String;)Ljava/lang/String;", "E", "(Ldw1/i$a;)Lmx/a;", "hexColor", "Landroidx/compose/ui/graphics/Color;", "I", "(Ljava/lang/String;)Landroidx/compose/ui/graphics/Color;", "Lgv1/m;", "fontStyles", "h", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "style", "f", "(Ljava/lang/String;Lgv1/m;)Ljava/lang/String;", "Landroid/graphics/Bitmap;", "r", "(Lmv1/c;)Landroid/graphics/Bitmap;", "dynamicDocumentType", "Lfz/b$c;", "expirationDate", "closeExpirationDateBanner", "Lc30/b$b;", "s", "(Lrq0/b$b;Lfz/b$c;Ler/a;Ler/a;)Lc30/b$b;", "params", i.f37087n, "(Lew1/e$b;)Ldw1/j$a;", "a", "Lmx/c;", "b", "Lrz/a;", "c", "Liy/a;", "d", "Lez/e;", "e", "Lez/c;", "Lp20/c;", "g", "Lev1/a;", "Lv20/a;", "j", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, j.a> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f53858k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ev1.a dynamicDocumentSchemaDecoder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final v20.a documentValidityBannerMapper;

    /* JADX INFO: renamed from: ew1.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u000e\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b!\u0010+R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010+R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b.\u0010+R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010+R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b%\u0010+R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b)\u0010+R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b4\u0010+R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b#\u00101\u001a\u0004\b,\u00103R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010+¨\u00065"}, d2 = {"Lew1/e$b;", "", "Ln20/b;", "Ldw1/i;", "state", "Lo20/s2;", "documentVMS", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "hideSnackBarAction", "downloadDocumentAction", "updateDocumentWithTimerAction", "confirmDocumentAction", "Lkotlin/Function1;", "", "openAnnotationLink", "deleteDocumentAction", "onGoToSafeBusClicked", "Ln20/a;", "dispatchAction", "onCloseExpirationDateBanner", "<init>", "(Ln20/b;Lo20/s2;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "k", "()Ln20/b;", "b", "Lo20/s2;", "e", "()Lo20/s2;", "c", "Ler/a;", "()Ler/a;", "d", "g", "f", "l", "h", "Ler/l;", "j", "()Ler/l;", "i", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<dw1.i> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideSnackBarAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> downloadDocumentAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> updateDocumentWithTimerAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> confirmDocumentAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openAnnotationLink;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteDocumentAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToSafeBusClicked;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseExpirationDateBanner;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<dw1.i> state, s2 s2Var, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, l<? super String, i0> lVar, er.a<i0> aVar6, er.a<i0> aVar7, l<? super n20.a, i0> lVar2, er.a<i0> aVar8) {
            this.state = state;
            this.documentVMS = s2Var;
            this.closeAction = aVar;
            this.hideSnackBarAction = aVar2;
            this.downloadDocumentAction = aVar3;
            this.updateDocumentWithTimerAction = aVar4;
            this.confirmDocumentAction = aVar5;
            this.openAnnotationLink = lVar;
            this.deleteDocumentAction = aVar6;
            this.onGoToSafeBusClicked = aVar7;
            this.dispatchAction = lVar2;
            this.onCloseExpirationDateBanner = aVar8;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final er.a<i0> b() {
            return this.confirmDocumentAction;
        }

        public final er.a<i0> c() {
            return this.deleteDocumentAction;
        }

        public final l<n20.a, i0> d() {
            return this.dispatchAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.documentVMS, params.documentVMS) && t.c(this.closeAction, params.closeAction) && t.c(this.hideSnackBarAction, params.hideSnackBarAction) && t.c(this.downloadDocumentAction, params.downloadDocumentAction) && t.c(this.updateDocumentWithTimerAction, params.updateDocumentWithTimerAction) && t.c(this.confirmDocumentAction, params.confirmDocumentAction) && t.c(this.openAnnotationLink, params.openAnnotationLink) && t.c(this.deleteDocumentAction, params.deleteDocumentAction) && t.c(this.onGoToSafeBusClicked, params.onGoToSafeBusClicked) && t.c(this.dispatchAction, params.dispatchAction) && t.c(this.onCloseExpirationDateBanner, params.onCloseExpirationDateBanner);
        }

        public final er.a<i0> f() {
            return this.downloadDocumentAction;
        }

        public final er.a<i0> g() {
            return this.hideSnackBarAction;
        }

        public final er.a<i0> h() {
            return this.onCloseExpirationDateBanner;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.state.hashCode() * 31) + this.documentVMS.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.hideSnackBarAction.hashCode()) * 31) + this.downloadDocumentAction.hashCode()) * 31) + this.updateDocumentWithTimerAction.hashCode()) * 31) + this.confirmDocumentAction.hashCode()) * 31) + this.openAnnotationLink.hashCode()) * 31) + this.deleteDocumentAction.hashCode()) * 31) + this.onGoToSafeBusClicked.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.onCloseExpirationDateBanner.hashCode();
        }

        public final er.a<i0> i() {
            return this.onGoToSafeBusClicked;
        }

        public final l<String, i0> j() {
            return this.openAnnotationLink;
        }

        public final State<dw1.i> k() {
            return this.state;
        }

        public final er.a<i0> l() {
            return this.updateDocumentWithTimerAction;
        }

        public String toString() {
            return "Params(state=" + this.state + ", documentVMS=" + this.documentVMS + ", closeAction=" + this.closeAction + ", hideSnackBarAction=" + this.hideSnackBarAction + ", downloadDocumentAction=" + this.downloadDocumentAction + ", updateDocumentWithTimerAction=" + this.updateDocumentWithTimerAction + ", confirmDocumentAction=" + this.confirmDocumentAction + ", openAnnotationLink=" + this.openAnnotationLink + ", deleteDocumentAction=" + this.deleteDocumentAction + ", onGoToSafeBusClicked=" + this.onGoToSafeBusClicked + ", dispatchAction=" + this.dispatchAction + ", onCloseExpirationDateBanner=" + this.onCloseExpirationDateBanner + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f53881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f53882d;

        static {
            int[] iArr = new int[rq0.b.EnumC4479b.values().length];
            try {
                iArr[rq0.b.EnumC4479b.TAX_ADVISOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rq0.b.EnumC4479b.AUDITOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rq0.b.EnumC4479b.SOLIDARITY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rq0.b.EnumC4479b.PENSIONER_MSWIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f53879a = iArr;
            int[] iArr2 = new int[MissingDocumentAttribute.a.values().length];
            try {
                iArr2[MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MissingDocumentAttribute.a.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f53880b = iArr2;
            int[] iArr3 = new int[s.values().length];
            try {
                iArr3[s.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[s.DATE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f53881c = iArr3;
            int[] iArr4 = new int[m.values().length];
            try {
                iArr4[m.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[m.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f53882d = iArr4;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DynamicDocumentData f53884b;

        d(DynamicDocumentData dynamicDocumentData) {
            this.f53884b = dynamicDocumentData;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(-82156775);
            if (p076m2.t.k()) {
                p076m2.t.o(-82156775, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.maindocument.mapper.DynamicDocumentScreenMapper.getGiloshData.<anonymous> (DynamicDocumentScreenMapper.kt:331)");
            }
            Color colorI = e.this.I(this.f53884b.getSchema().getPicture().getAttributesValueTextHexColor());
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return colorI;
        }
    }

    /* JADX INFO: renamed from: ew1.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1273e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DynamicDocumentData f53886b;

        C1273e(DynamicDocumentData dynamicDocumentData) {
            this.f53886b = dynamicDocumentData;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(2013678776);
            if (p076m2.t.k()) {
                p076m2.t.o(2013678776, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.maindocument.mapper.DynamicDocumentScreenMapper.getGiloshData.<anonymous> (DynamicDocumentScreenMapper.kt:336)");
            }
            Color colorI = e.this.I(this.f53886b.getSchema().getPicture().getAttributesTitleTextHexColor());
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return colorI;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DynamicDocumentData f53888b;

        f(DynamicDocumentData dynamicDocumentData) {
            this.f53888b = dynamicDocumentData;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(-112457624);
            if (p076m2.t.k()) {
                p076m2.t.o(-112457624, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.maindocument.mapper.DynamicDocumentScreenMapper.getMarkingsData.<anonymous>.<anonymous> (DynamicDocumentScreenMapper.kt:229)");
            }
            Color colorI = e.this.I(this.f53888b.getSchema().getPicture().getEmblemTextHexColor());
            long jM20unboximpl = colorI != null ? colorI.m20unboximpl() : Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jM20unboximpl);
        }
    }

    public e(mx.c cVar, rz.a aVar, iy.a aVar2, ez.e eVar, ez.c cVar2, p20.c cVar3, ev1.a aVar3, v20.a aVar4) {
        this.labelProvider = cVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
        this.dateFormatter = eVar;
        this.dateConverter = cVar2;
        this.giloshMapper = cVar3;
        this.dynamicDocumentSchemaDecoder = aVar3;
        this.documentValidityBannerMapper = aVar4;
    }

    private final Label E(dw1.i.Initialized initialized) {
        DocumentSchema schema = initialized.getData().getSchema();
        String documentShortName = initialized.getDocumentShortName();
        if (documentShortName == null) {
            documentShortName = schema.getDocumentName();
        }
        return mx.b.d(documentShortName, "toolbarTitle");
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
    private final List<o20.l> F(DocumentTopAnnotation topAnnotation, b0 data) {
        List<DocumentSchemaLabel> listB;
        List<DocumentStaticSection> listC;
        List<DocumentSchemaLabel> listD;
        Label labelX;
        List<DocumentSchemaLabel> listB2;
        Label labelX2;
        List<DocumentStaticSection> listC2;
        ArrayList arrayList;
        DocumentDynamicSection dynamicSections;
        ArrayList arrayList2;
        List<String> listA;
        Iterator<T> it;
        Label labelX3;
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
                        labelX = x(listD, "title");
                    } else {
                        labelX = null;
                    }
                    listB2 = topAnnotation.b();
                    if (listB2 != null) {
                        labelX2 = x(listB2, "section");
                    } else {
                        labelX2 = null;
                    }
                    listC2 = topAnnotation.c();
                    if (listC2 != null) {
                        arrayList = new ArrayList();
                        it = listC2.iterator();
                        while (it.hasNext()) {
                            labelX3 = x(((DocumentStaticSection) it.next()).a(), "staticSection");
                            if (labelX3 != null) {
                                arrayList.add(labelX3);
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
                            String strF = ev1.a.f(this.dynamicDocumentSchemaDecoder, s.TEXT, (String) it4.next(), null, null, data, null, 44, null);
                            Label labelB = strF != null ? mx.b.b(strF, "dynamicSection") : null;
                            if (labelB != null) {
                                arrayList2.add(labelB);
                            }
                        }
                    }
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList4 = arrayList2;
                    }
                    arrayList3.add(new o20.l.TopSection(labelX, labelX2, arrayList, arrayList4));
                }
            } else {
                listD = topAnnotation.d();
                if (listD != null) {
                    labelX = x(listD, "title");
                } else {
                    labelX = null;
                }
                listB2 = topAnnotation.b();
                if (listB2 != null) {
                    labelX2 = x(listB2, "section");
                } else {
                    labelX2 = null;
                }
                listC2 = topAnnotation.c();
                if (listC2 != null) {
                    arrayList = new ArrayList();
                    it = listC2.iterator();
                    while (it.hasNext()) {
                        labelX3 = x(((DocumentStaticSection) it.next()).a(), "staticSection");
                        if (labelX3 != null) {
                            arrayList.add(labelX3);
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
                arrayList3.add(new o20.l.TopSection(labelX, labelX2, arrayList, arrayList4));
            }
        }
        return arrayList3;
    }

    private final String G(MissingDocumentAttribute missingAttribute, String attributeValue) {
        if (attributeValue == null || fu.r.t0(attributeValue)) {
            attributeValue = null;
        }
        if (attributeValue != null) {
            return attributeValue;
        }
        MissingDocumentAttribute.a onMissing = missingAttribute != null ? missingAttribute.getOnMissing() : null;
        int i15 = onMissing == null ? -1 : c.f53880b[onMissing.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                return Label.INSTANCE.b().getText();
            }
            return null;
        }
        s dataType = missingAttribute.getDataType();
        if (dataType == null) {
            return null;
        }
        String defaultValue = missingAttribute.getDefaultValue();
        if (defaultValue == null) {
            defaultValue = Label.INSTANCE.c().getText();
        }
        return i(dataType, defaultValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Color I(String hexColor) {
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

    private final String f(String str, m mVar) {
        int i15 = c.f53882d[mVar.ordinal()];
        if (i15 == 1) {
            return str.toUpperCase(Locale.ROOT);
        }
        if (i15 == 2) {
            return str;
        }
        throw new oq.p();
    }

    private final String h(String str, List<? extends m> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                str = f(str, (m) it.next());
            }
        }
        return str;
    }

    private final String i(s sVar, String str) {
        int i15 = c.f53881c[sVar.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? str : this.dateFormatter.d(new fz.b.String(str, fz.c.OFFSET_DATE_TIME_SEC, false, 4, null), fz.c.DOTTED_TIME_PLUS_DATE);
        }
        return this.dateFormatter.d(new fz.b.String(str, fz.c.DASHED_REVERSED, false, 4, null), fz.c.DOTTED);
    }

    private final List<o20.l> l(rq0.b.EnumC4479b documentType, List<DashboardServiceEntry> availableServices, BitmapsByFieldReference bitmapsByFieldReference, DynamicDocumentData documentData, er.a<i0> onGoToSafeBusClicked, er.a<i0> confirmDocumentAction, er.a<i0> updateDocumentWithTimerAction, er.a<i0> deleteDocumentAction) {
        DocumentSchema schema;
        List<DocumentSchemaAttribute> listB;
        DocumentSchema schema2;
        List<DocumentSchemaAttribute> listF;
        DefaultSingleCardData defaultSingleCardData;
        DocumentSchema schema3;
        BarcodeSchema barcode;
        Bitmap bitmap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o20.l.Shortcuts(new ShortcutsLayoutData(z(documentType, availableServices, onGoToSafeBusClicked, confirmDocumentAction, deleteDocumentAction), new ShortcutMoreData(this.labelProvider.c(dv1.a.f44642j0), new l() { // from class: ew1.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.m((List) obj);
            }
        }))));
        if (documentData != null && (schema3 = documentData.getSchema()) != null && (barcode = schema3.getBarcode()) != null && (bitmap = bitmapsByFieldReference.a().get(barcode.getFieldReference())) != null) {
            Label labelX = x(barcode.b(), "barcodeLabel");
            if (labelX == null) {
                labelX = Label.INSTANCE.b();
            }
            arrayList.add(new o20.l.Button(new CustomSingleCardData("DynamicDocumentBarCodeSingleCard", new e40.b(new BarCodeSingleCardData(labelX, new n50.i.Image(bitmap, null, null, 6, null))), null, false, null, null, false, null, 252, null)));
        }
        if (documentData != null && (schema2 = documentData.getSchema()) != null && (listF = schema2.f()) != null) {
            ArrayList arrayList2 = new ArrayList();
            int i15 = 0;
            for (Object obj : listF) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                DocumentSchemaAttribute documentSchemaAttribute = (DocumentSchemaAttribute) obj;
                String strG = G(documentSchemaAttribute.getOnMissingAttribute(), this.dynamicDocumentSchemaDecoder.c(documentSchemaAttribute.getDataType(), documentSchemaAttribute.getFieldReference(), documentSchemaAttribute.e(), documentSchemaAttribute.c(), documentData.getScope(), documentSchemaAttribute.a()));
                if (strG != null) {
                    defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentSchemaAttribute.g()), "commonAttributeTitle_" + i15), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.b(strG, "attributeValue_" + i15), null, null, 0, 0, uv1.a.a(strG, documentSchemaAttribute.getDataType()) ? j70.a.LETTER_BY_LETTER : j70.a.LOWER_CASE, 30, null)), null, 4, null), null, null, null, 3839, null);
                } else {
                    defaultSingleCardData = null;
                }
                if (defaultSingleCardData != null) {
                    arrayList2.add(defaultSingleCardData);
                }
                i15 = i16;
            }
            arrayList.add(new o20.l.Section(null, arrayList2, 1, null));
        }
        if (documentData != null && (schema = documentData.getSchema()) != null && (listB = schema.b()) != null) {
            Label labelX2 = x(documentData.getSchema().c(), "");
            if (labelX2 == null) {
                labelX2 = this.labelProvider.c(dv1.a.f44656q0).n("AdditionalAttributesTitle");
            }
            ArrayList arrayList3 = new ArrayList();
            int i17 = 0;
            for (Object obj2 : listB) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    v.x();
                }
                DocumentSchemaAttribute documentSchemaAttribute2 = (DocumentSchemaAttribute) obj2;
                String strG2 = G(documentSchemaAttribute2.getOnMissingAttribute(), this.dynamicDocumentSchemaDecoder.c(documentSchemaAttribute2.getDataType(), documentSchemaAttribute2.getFieldReference(), documentSchemaAttribute2.e(), documentSchemaAttribute2.c(), documentData.getScope(), documentSchemaAttribute2.a()));
                DefaultSingleCardData defaultSingleCardData2 = strG2 != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentSchemaAttribute2.g()), "additionalAttribute_" + i17), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(strG2, "attributeValue_" + i17), null, null, 3, null)), null, 4, null), null, null, null, 3839, null) : null;
                if (defaultSingleCardData2 != null) {
                    arrayList3.add(defaultSingleCardData2);
                }
                i17 = i18;
            }
            arrayList.add(new o20.l.Expandable(labelX2, new CardListData(arrayList3, null, false, null, null, 30, null)));
        }
        Label labelC = this.labelProvider.c(dv1.a.L);
        String strF = ev1.a.f(this.dynamicDocumentSchemaDecoder, s.TEXT, "dh.ts", null, null, documentData != null ? documentData.getScope() : null, null, 44, null);
        arrayList.add(new o20.l.UpdateDataItem(labelC, mx.b.d(strF != null ? this.dateFormatter.d(new fz.b.String(strF, fz.c.FULL_TIME_NO_SPACES, false, 4, null), fz.c.DOTTED) : null, "lastUpdateValue"), this.labelProvider.c(dv1.a.M), null, updateDocumentWithTimerAction, 8, null));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(List list) {
        return i0.f148189a;
    }

    private final List<c30.b.c> q(DocumentBottomAnnotation bottomAnnotation, l<? super String, i0> openAnnotationLink) {
        List<DocumentBottomAnnotationSection> listA;
        c30.a.Link link;
        if (bottomAnnotation == null || (listA = bottomAnnotation.a()) == null) {
            return null;
        }
        List<DocumentBottomAnnotationSection> list = listA;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            DocumentBottomAnnotationSection documentBottomAnnotationSection = (DocumentBottomAnnotationSection) obj;
            Label labelD = mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentBottomAnnotationSection.a()), "annotationBody_" + i15);
            List<DocumentSchemaLabel> listB = documentBottomAnnotationSection.b();
            if (listB != null) {
                String linkUrl = documentBottomAnnotationSection.getLinkUrl();
                link = linkUrl != null ? new c30.a.Link(new LinkData(null, mx.b.d(this.dynamicDocumentSchemaDecoder.a(listB), "annotationLink_" + i15), linkUrl, LinkData.EnumC5775a.WEBSITE, false, openAnnotationLink, 17, null)) : null;
            } else {
                link = null;
            }
            arrayList.add(new c30.b.c(null, null, null, labelD, null, null, link, 55, null));
            i15 = i16;
        }
        return arrayList;
    }

    private final Bitmap r(DynamicDocumentData documentData) {
        String mainDocumentPhoto;
        Object objB;
        String sourceContainerRef = documentData.getSchema().getPicture().getSourceContainerRef();
        if (sourceContainerRef == null || (mainDocumentPhoto = ev1.a.f(this.dynamicDocumentSchemaDecoder, s.TEXT, sourceContainerRef, null, null, documentData.getScope(), null, 44, null)) == null) {
            mainDocumentPhoto = documentData.getMainDocumentPhoto();
        }
        rz.a aVar = this.bitmapDecoder;
        dx.i iVarC = iy.a.c(this.base64Coder, mainDocumentPhoto, null, 2, null);
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

    private final c30.b.C0606b s(rq0.b.EnumC4479b dynamicDocumentType, fz.b.LocalDate expirationDate, er.a<i0> updateDocumentAction, er.a<i0> closeExpirationDateBanner) {
        LocalDate date;
        if (c.f53879a[dynamicDocumentType.ordinal()] != 3 || expirationDate == null || (date = expirationDate.getDate()) == null) {
            return null;
        }
        return this.documentValidityBannerMapper.b(new v20.a.Params(this.dateConverter.f(date), dv1.a.f44632e0, dv1.a.f44630d0, dv1.a.f44634f0, dv1.a.f44654p0, closeExpirationDateBanner, new v20.a.b.HideAfterExpiration(new ButtonTextData(null, this.labelProvider.c(dv1.a.f44641j), null, null, updateDocumentAction, 13, null))));
    }

    private final DocumentGiloshData u(State<dw1.i> state, dw1.i.Initialized documentState, er.a<i0> updateDocumentAction, l<? super n20.a, i0> dispatchAction, s2 documentVMS) {
        KeyValueData keyValueData;
        DynamicDocumentData data = documentState.getData();
        p20.c cVar = this.giloshMapper;
        List<u2> listV = v(documentState.getDynamicDocumentType(), data);
        o20.p pVarB = o20.p.INSTANCE.b(data.getSchema().getPicture().getPictureId());
        Bitmap bitmapR = r(data);
        boolean zE = documentState.getStatus().e();
        Label labelC = documentState.getStatus().e() ? this.labelProvider.c(dv1.a.N) : this.labelProvider.c(dv1.a.K);
        List<DocumentSchemaAttribute> listB = data.getSchema().getPicture().b();
        ArrayList arrayList = new ArrayList();
        Iterator it = listB.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            DocumentSchemaAttribute documentSchemaAttribute = (DocumentSchemaAttribute) next;
            String strG = G(documentSchemaAttribute.getOnMissingAttribute(), this.dynamicDocumentSchemaDecoder.c(documentSchemaAttribute.getDataType(), documentSchemaAttribute.getFieldReference(), documentSchemaAttribute.e(), documentSchemaAttribute.c(), data.getScope(), documentSchemaAttribute.a()));
            if (strG != null) {
                String strH = h(strG, documentSchemaAttribute.f());
                keyValueData = new KeyValueData(mx.b.b(strH, "attributeValue_" + i15), mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentSchemaAttribute.g()), "pictureAttribute_" + i15), uv1.a.a(strH, documentSchemaAttribute.getDataType()));
            } else {
                keyValueData = null;
            }
            if (keyValueData != null) {
                arrayList.add(keyValueData);
            }
            it = it;
            i15 = i16;
            listV = listV;
            pVarB = pVarB;
        }
        return cVar.b(new p20.c.Params(listV, state, pVarB, bitmapR, null, null, null, zE, labelC, this.labelProvider.c(dv1.a.f44641j), updateDocumentAction, arrayList, new d(data), new C1273e(data), dispatchAction, documentVMS, 112, null));
    }

    private final List<u2> v(rq0.b.EnumC4479b documentType, DynamicDocumentData documentData) {
        List listC = v.c();
        listC.add(new u2.Flag(k.Poland, this.labelProvider.c(dv1.a.F)));
        listC.add(new u2.Hologram(null, new f(documentData), 1, null));
        int i15 = c.f53879a[documentType.ordinal()];
        if (i15 == 1) {
            listC.add(new u2.Logo(c20.b.J, this.labelProvider.c(dv1.a.H)));
        } else if (i15 == 2) {
            listC.add(new u2.Logo(c20.b.F, this.labelProvider.c(dv1.a.E)));
        } else if (i15 == 3) {
            listC.add(new u2.Logo(c20.b.G, this.labelProvider.c(dv1.a.G)));
        } else if (i15 == 4) {
            listC.add(new u2.Logo(c20.b.C, this.labelProvider.c(dv1.a.D)));
        } else if (i15 == 5) {
            listC.add(new u2.Logo(c20.b.K, this.labelProvider.c(dv1.a.I)));
        }
        return v.a(listC);
    }

    private final Label x(List<DocumentSchemaLabel> list, String str) {
        String strA;
        if (list == null || (strA = this.dynamicDocumentSchemaDecoder.a(list)) == null) {
            return null;
        }
        return mx.b.b(strA, str);
    }

    private final List<SmallCardData> z(rq0.b.EnumC4479b documentType, List<DashboardServiceEntry> availableServices, er.a<i0> onGoToSafeBusClicked, er.a<i0> confirmDocumentAction, er.a<i0> deleteDocumentAction) {
        List listC = v.c();
        Label labelC = this.labelProvider.c(dv1.a.f44640i0);
        int i15 = jz.a.f106785h1;
        o50.f.c cVar = o50.f.c.f142478a;
        listC.add(new SmallCardData(null, labelC, null, i15, cVar, false, confirmDocumentAction, 37, null));
        if (documentType == rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP && q.a(availableServices, rq0.c.SAFE_BUS)) {
            listC.add(new SmallCardData(null, this.labelProvider.c(dv1.a.f44652o0), null, jz.a.C0, cVar, false, onGoToSafeBusClicked, 37, null));
        }
        listC.add(new SmallCardData(null, this.labelProvider.c(dv1.a.J), null, jz.a.f106727a, o50.f.b.f142477a, false, deleteDocumentAction, 37, null));
        return v.a(listC);
    }

    @Override // er.l
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public j.a b(Params params) {
        dw1.i iVarD = params.k().d();
        if ((iVarD instanceof dw1.i.c) || (iVarD instanceof dw1.i.Loading)) {
            return j.a.b.f44788a;
        }
        if (!(iVarD instanceof dw1.i.Initialized)) {
            throw new oq.p();
        }
        dw1.i.Initialized initialized = (dw1.i.Initialized) iVarD;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), E(initialized), null, null, null, 28, null), null, null, null, null, 61, null);
        List<o20.l> listF = F(initialized.getData().getSchema().getTopAnnotation(), initialized.getData().getScope());
        DocumentGiloshData documentGiloshDataU = u(params.k(), initialized, params.f(), params.d(), params.getDocumentVMS());
        DynamicDocumentData data = initialized.getData();
        List<o20.l> listL = l(initialized.getDynamicDocumentType(), initialized.c(), initialized.getBitmapsByFieldReference(), data, params.i(), params.b(), params.l(), params.c());
        List<c30.b.c> listQ = q(initialized.getData().getSchema().getBottomAnnotation(), params.j());
        c30.b.C0606b c0606bS = s(initialized.getDynamicDocumentType(), initialized.getData().getExpirationDate(), params.f(), params.h());
        if (!initialized.getShowExpirationDateBanner() || !initialized.getStatus().e()) {
            c0606bS = null;
        }
        return new j.a.DynamicDocumentData(new BaseDocumentData(null, baseScaffoldData, listF, documentGiloshDataU, listL, v.r(c0606bS), listQ, 1, null), params.a(), params.g());
    }
}
