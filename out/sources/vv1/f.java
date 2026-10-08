package vv1;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import dx.j;
import e20.k;
import er.l;
import er.p;
import fr.t;
import g70.ShortcutMoreData;
import gv1.AdditionalLogo;
import gv1.DocumentActionAttribute;
import gv1.DocumentBottomAnnotation;
import gv1.DocumentBottomAnnotationSection;
import gv1.DocumentDynamicSection;
import gv1.DocumentSchema;
import gv1.DocumentSchemaAttribute;
import gv1.DocumentSchemaLabel;
import gv1.DocumentStaticSection;
import gv1.DocumentTopAnnotation;
import gv1.MissingDocumentAttribute;
import gv1.PictureSchema;
import gv1.QrCodeSchema;
import gv1.m;
import gv1.s;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import iq0.DashboardServiceEntry;
import iq0.q;
import iy.b0;
import iy.c0;
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
import n50.DefaultSingleCardData;
import n50.x0;
import o20.BaseDocumentData;
import o20.DocumentGiloshData;
import o20.s2;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import pq.v0;
import wv1.BitmapsByFieldReference;
import wv1.DynamicDocumentBottomSheetData;
import x40.LinkData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u0082\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002xvB9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#Jy\u00107\u001a\u0002062\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010'\u001a\u00020&2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020)0+2\u0006\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u00010\u001c2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u0002012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108Jµ\u0001\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010:\u001a\u0004\u0018\u0001092\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u001a2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010@\u001a\u00020?2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020)0(2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020)0(2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020)0+2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020)0(2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020)0(2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020)0+2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\bJ\u0010KJ+\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u001a2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u001a2\u0006\u0010N\u001a\u00020\u0014H\u0002¢\u0006\u0004\bP\u0010QJ5\u0010V\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010\u001a2\b\u0010S\u001a\u0004\u0018\u00010R2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020)0+H\u0002¢\u0006\u0004\bV\u0010WJ%\u0010[\u001a\u0004\u0018\u00010\u001c2\b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010Z\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b[\u0010\\J\u001b\u0010_\u001a\u00020\u001c*\u00020]2\u0006\u0010^\u001a\u00020\u001cH\u0002¢\u0006\u0004\b_\u0010`J\u001b\u0010c\u001a\u0004\u0018\u00010b2\b\u0010a\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bc\u0010dJ#\u0010g\u001a\u00020\u001c*\u00020\u001c2\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010\u001aH\u0002¢\u0006\u0004\bg\u0010hJW\u0010l\u001a\b\u0012\u0004\u0012\u00020k0\u001a2\u0006\u0010j\u001a\u00020i2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u001a2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020)0(2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020)0(2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\bl\u0010mJ\u001b\u0010o\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010n\u001a\u00020eH\u0002¢\u0006\u0004\bo\u0010pJ+\u0010r\u001a\u0004\u0018\u00010q2\u0006\u0010/\u001a\u00020.2\u0006\u0010N\u001a\u00020\u00142\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\br\u0010sJ\u0018\u0010t\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\bt\u0010uR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0083\u0001"}, d2 = {"Lvv1/f;", "Lxw/f;", "Lvv1/f$b;", "Lo20/k;", "Lmx/c;", "labelProvider", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "Lez/e;", "dateFormatter", "Lp20/c;", "giloshMapper", "Lev1/a;", "dynamicDocumentSchemaDecoder", "<init>", "(Lmx/c;Lrz/a;Liy/a;Lez/e;Lp20/c;Lev1/a;)V", "Lgv1/q;", "topAnnotation", "Lgv1/t;", "data", "", "Lo20/l;", "J", "(Lgv1/q;Liy/b0;)Ljava/util/List;", "", "Lgv1/o;", "", "tag", "Lmx/a;", "G", "(Ljava/util/List;Ljava/lang/String;)Lmx/a;", "params", "I", "(Lvv1/f$b;)Lmx/a;", "Ln20/b;", "state", "", "isDocumentActive", "Lkotlin/Function0;", "Loq/i0;", "updateDocumentAction", "Lkotlin/Function1;", "Ln20/a;", "dispatchAction", "Lgv1/v;", "pictureSchema", "documentPeselFieldReference", "Liy/b0;", "mainDocumentPhoto", "mainDocumentPesel", "Lo20/s2;", "documentVMS", "Lo20/r2;", "F", "(Ln20/b;ZLer/a;Ler/l;Lgv1/v;Ljava/lang/String;Liy/b0;Liy/b0;Liy/b0;Lo20/s2;)Lo20/r2;", "Lrq0/b;", "dynamicDocumentType", "Liq0/p;", "availableServices", "Lgv1/i;", "schema", "Lwv1/a;", "bitmapsByFieldReference", "confirmDocumentAction", "goToSafeBus", "Lgv1/c$a;", "onGoToDocumentsToDownload", "updateDocumentWithTimerAction", "deleteDocumentAction", "Lwv1/b;", "enlargeQrCode", "hideBottomSheet", "r", "(Lrq0/b;Ljava/util/List;Lgv1/i;Liy/b0;Lwv1/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;Ler/a;)Ljava/util/List;", "Lgv1/a;", "additionalLogos", "documentData", "Lo20/u2;", "x", "(Ljava/util/List;Liy/b0;)Ljava/util/List;", "Lgv1/d;", "bottomAnnotation", "openAnnotationLink", "Lc30/b$c;", "z", "(Lgv1/d;Ler/l;)Ljava/util/List;", "Lgv1/u;", "missingAttribute", "attributeValue", "K", "(Lgv1/u;Ljava/lang/String;)Ljava/lang/String;", "Lgv1/s;", "defaultValue", "q", "(Lgv1/s;Ljava/lang/String;)Ljava/lang/String;", "hexColor", "Landroidx/compose/ui/graphics/Color;", "N", "(Ljava/lang/String;)Landroidx/compose/ui/graphics/Color;", "Lgv1/m;", "fontStyles", "m", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "Lrq0/b$c;", "documentType", "Lo50/a;", i.f37087n, "(Lrq0/b$c;Ljava/util/List;Ler/a;Ler/a;Ler/a;)Ljava/util/List;", "style", "l", "(Ljava/lang/String;Lgv1/m;)Ljava/lang/String;", "Landroid/graphics/Bitmap;", "E", "(Lgv1/v;Liy/b0;Liy/b0;)Landroid/graphics/Bitmap;", i.f37094u, "(Lvv1/f$b;)Lo20/k;", "a", "Lmx/c;", "b", "Lrz/a;", "c", "Liy/a;", "d", "Lez/e;", "e", "Lp20/c;", "f", "Lev1/a;", "g", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, BaseDocumentData> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f208448h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ev1.a dynamicDocumentSchemaDecoder;

    /* JADX INFO: renamed from: vv1.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u0019\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u0019\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00120\u0019\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u0010=\u001a\u0004\b@\u0010?R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bA\u0010CR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b-\u0010FR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b6\u0010G\u001a\u0004\b1\u0010HR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bJ\u0010HR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bD\u0010HR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010HR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b@\u0010G\u001a\u0004\b4\u0010HR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b>\u0010G\u001a\u0004\bK\u0010HR#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u00198\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bN\u0010PR#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00198\u0006¢\u0006\f\n\u0004\bQ\u0010O\u001a\u0004\bQ\u0010PR#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00120\u00198\u0006¢\u0006\f\n\u0004\b/\u0010O\u001a\u0004\bI\u0010PR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bM\u0010G\u001a\u0004\bL\u0010HR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b:\u0010G\u001a\u0004\b8\u0010HR#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00120\u00198\u0006¢\u0006\f\n\u0004\bR\u0010O\u001a\u0004\b<\u0010P¨\u0006S"}, d2 = {"Lvv1/f$b;", "", "Ln20/b;", "state", "", "documentShortName", "Lmv1/c;", "dynamicDocument", "", "isDocumentActive", "Liy/b0;", "mainDocumentPhoto", "mainDocumentPesel", "Lo20/s2;", "documentVMS", "Lwv1/a;", "bitmapsByFieldReference", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "hideSnackBarAction", "downloadDocumentAction", "updateDocumentAction", "confirmDocumentAction", "goToSafeBus", "Lkotlin/Function1;", "Lgv1/c$a;", "onHandleActionType", "openAnnotationLink", "Lwv1/b;", "enlargeQrCode", "hideBottomSheet", "deleteDocumentAction", "Ln20/a;", "dispatchAction", "<init>", "(Ln20/b;Ljava/lang/String;Lmv1/c;ZLiy/b0;Liy/b0;Lo20/s2;Lwv1/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "q", "()Ln20/b;", "b", "Ljava/lang/String;", "f", "c", "Lmv1/c;", "i", "()Lmv1/c;", "d", "Z", "s", "()Z", "e", "Liy/b0;", "n", "()Liy/b0;", "m", "g", "Lo20/s2;", "()Lo20/s2;", "h", "Lwv1/a;", "()Lwv1/a;", "Ler/a;", "()Ler/a;", "j", "getHideSnackBarAction", "k", "l", "r", "o", "Ler/l;", "()Ler/l;", "p", "t", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<?> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentShortName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DynamicDocumentData dynamicDocument;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isDocumentActive;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 mainDocumentPhoto;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 mainDocumentPesel;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final BitmapsByFieldReference bitmapsByFieldReference;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideSnackBarAction;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> downloadDocumentAction;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> updateDocumentAction;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> confirmDocumentAction;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToSafeBus;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DocumentActionAttribute.a, i0> onHandleActionType;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openAnnotationLink;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DynamicDocumentBottomSheetData, i0> enlargeQrCode;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideBottomSheet;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteDocumentAction;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n20.a, i0> dispatchAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<?> state, String str, DynamicDocumentData dynamicDocumentData, boolean z15, b0 b0Var, b0 b0Var2, s2 s2Var, BitmapsByFieldReference bitmapsByFieldReference, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, l<? super DocumentActionAttribute.a, i0> lVar, l<? super String, i0> lVar2, l<? super DynamicDocumentBottomSheetData, i0> lVar3, er.a<i0> aVar7, er.a<i0> aVar8, l<? super n20.a, i0> lVar4) {
            this.state = state;
            this.documentShortName = str;
            this.dynamicDocument = dynamicDocumentData;
            this.isDocumentActive = z15;
            this.mainDocumentPhoto = b0Var;
            this.mainDocumentPesel = b0Var2;
            this.documentVMS = s2Var;
            this.bitmapsByFieldReference = bitmapsByFieldReference;
            this.closeAction = aVar;
            this.hideSnackBarAction = aVar2;
            this.downloadDocumentAction = aVar3;
            this.updateDocumentAction = aVar4;
            this.confirmDocumentAction = aVar5;
            this.goToSafeBus = aVar6;
            this.onHandleActionType = lVar;
            this.openAnnotationLink = lVar2;
            this.enlargeQrCode = lVar3;
            this.hideBottomSheet = aVar7;
            this.deleteDocumentAction = aVar8;
            this.dispatchAction = lVar4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BitmapsByFieldReference getBitmapsByFieldReference() {
            return this.bitmapsByFieldReference;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final er.a<i0> c() {
            return this.confirmDocumentAction;
        }

        public final er.a<i0> d() {
            return this.deleteDocumentAction;
        }

        public final l<n20.a, i0> e() {
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
            return t.c(this.state, params.state) && t.c(this.documentShortName, params.documentShortName) && t.c(this.dynamicDocument, params.dynamicDocument) && this.isDocumentActive == params.isDocumentActive && t.c(this.mainDocumentPhoto, params.mainDocumentPhoto) && t.c(this.mainDocumentPesel, params.mainDocumentPesel) && t.c(this.documentVMS, params.documentVMS) && t.c(this.bitmapsByFieldReference, params.bitmapsByFieldReference) && t.c(this.closeAction, params.closeAction) && t.c(this.hideSnackBarAction, params.hideSnackBarAction) && t.c(this.downloadDocumentAction, params.downloadDocumentAction) && t.c(this.updateDocumentAction, params.updateDocumentAction) && t.c(this.confirmDocumentAction, params.confirmDocumentAction) && t.c(this.goToSafeBus, params.goToSafeBus) && t.c(this.onHandleActionType, params.onHandleActionType) && t.c(this.openAnnotationLink, params.openAnnotationLink) && t.c(this.enlargeQrCode, params.enlargeQrCode) && t.c(this.hideBottomSheet, params.hideBottomSheet) && t.c(this.deleteDocumentAction, params.deleteDocumentAction) && t.c(this.dispatchAction, params.dispatchAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDocumentShortName() {
            return this.documentShortName;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public final er.a<i0> h() {
            return this.downloadDocumentAction;
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            String str = this.documentShortName;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.dynamicDocument.hashCode()) * 31) + Boolean.hashCode(this.isDocumentActive)) * 31;
            b0 b0Var = this.mainDocumentPhoto;
            return ((((((((((((((((((((((((((((((iHashCode2 + (b0Var != null ? b0Var.hashCode() : 0)) * 31) + this.mainDocumentPesel.hashCode()) * 31) + this.documentVMS.hashCode()) * 31) + this.bitmapsByFieldReference.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.hideSnackBarAction.hashCode()) * 31) + this.downloadDocumentAction.hashCode()) * 31) + this.updateDocumentAction.hashCode()) * 31) + this.confirmDocumentAction.hashCode()) * 31) + this.goToSafeBus.hashCode()) * 31) + this.onHandleActionType.hashCode()) * 31) + this.openAnnotationLink.hashCode()) * 31) + this.enlargeQrCode.hashCode()) * 31) + this.hideBottomSheet.hashCode()) * 31) + this.deleteDocumentAction.hashCode()) * 31) + this.dispatchAction.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final DynamicDocumentData getDynamicDocument() {
            return this.dynamicDocument;
        }

        public final l<DynamicDocumentBottomSheetData, i0> j() {
            return this.enlargeQrCode;
        }

        public final er.a<i0> k() {
            return this.goToSafeBus;
        }

        public final er.a<i0> l() {
            return this.hideBottomSheet;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final b0 getMainDocumentPesel() {
            return this.mainDocumentPesel;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final b0 getMainDocumentPhoto() {
            return this.mainDocumentPhoto;
        }

        public final l<DocumentActionAttribute.a, i0> o() {
            return this.onHandleActionType;
        }

        public final l<String, i0> p() {
            return this.openAnnotationLink;
        }

        public final State<?> q() {
            return this.state;
        }

        public final er.a<i0> r() {
            return this.updateDocumentAction;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getIsDocumentActive() {
            return this.isDocumentActive;
        }

        public String toString() {
            return "Params(state=" + this.state + ", documentShortName=" + this.documentShortName + ", dynamicDocument=" + this.dynamicDocument + ", isDocumentActive=" + this.isDocumentActive + ", mainDocumentPhoto=" + this.mainDocumentPhoto + ", mainDocumentPesel=" + this.mainDocumentPesel + ", documentVMS=" + this.documentVMS + ", bitmapsByFieldReference=" + this.bitmapsByFieldReference + ", closeAction=" + this.closeAction + ", hideSnackBarAction=" + this.hideSnackBarAction + ", downloadDocumentAction=" + this.downloadDocumentAction + ", updateDocumentAction=" + this.updateDocumentAction + ", confirmDocumentAction=" + this.confirmDocumentAction + ", goToSafeBus=" + this.goToSafeBus + ", onHandleActionType=" + this.onHandleActionType + ", openAnnotationLink=" + this.openAnnotationLink + ", enlargeQrCode=" + this.enlargeQrCode + ", hideBottomSheet=" + this.hideBottomSheet + ", deleteDocumentAction=" + this.deleteDocumentAction + ", dispatchAction=" + this.dispatchAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f208475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f208476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f208477c;

        static {
            int[] iArr = new int[MissingDocumentAttribute.a.values().length];
            try {
                iArr[MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MissingDocumentAttribute.a.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f208475a = iArr;
            int[] iArr2 = new int[s.values().length];
            try {
                iArr2[s.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[s.DATE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f208476b = iArr2;
            int[] iArr3 = new int[m.values().length];
            try {
                iArr3[m.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[m.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f208477c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PictureSchema f208479b;

        d(PictureSchema pictureSchema) {
            this.f208479b = pictureSchema;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(1400205029);
            if (p076m2.t.k()) {
                p076m2.t.o(1400205029, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.common.mapper.DynamicDocumentMapper.getGiloshData.<anonymous> (DynamicDocumentMapper.kt:221)");
            }
            Color colorN = f.this.N(this.f208479b.getEmblemTextHexColor());
            long jM20unboximpl = colorN != null ? colorN.m20unboximpl() : Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jM20unboximpl);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PictureSchema f208481b;

        e(PictureSchema pictureSchema) {
            this.f208481b = pictureSchema;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(-1053098958);
            if (p076m2.t.k()) {
                p076m2.t.o(-1053098958, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.common.mapper.DynamicDocumentMapper.getGiloshData.<anonymous> (DynamicDocumentMapper.kt:280)");
            }
            Color colorN = f.this.N(this.f208481b.getAttributesValueTextHexColor());
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return colorN;
        }
    }

    /* JADX INFO: renamed from: vv1.f$f, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5470f implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PictureSchema f208483b;

        C5470f(PictureSchema pictureSchema) {
            this.f208483b = pictureSchema;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(179032337);
            if (p076m2.t.k()) {
                p076m2.t.o(179032337, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.common.mapper.DynamicDocumentMapper.getGiloshData.<anonymous> (DynamicDocumentMapper.kt:285)");
            }
            Color colorN = f.this.N(this.f208483b.getAttributesTitleTextHexColor());
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return colorN;
        }
    }

    public f(mx.c cVar, rz.a aVar, iy.a aVar2, ez.e eVar, p20.c cVar2, ev1.a aVar3) {
        this.labelProvider = cVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
        this.dateFormatter = eVar;
        this.giloshMapper = cVar2;
        this.dynamicDocumentSchemaDecoder = aVar3;
    }

    private final Bitmap E(PictureSchema pictureSchema, b0 documentData, b0 mainDocumentPhoto) {
        String strE;
        Object objB;
        String sourceContainerRef = pictureSchema.getSourceContainerRef();
        if (sourceContainerRef == null || (strE = ev1.a.f(this.dynamicDocumentSchemaDecoder, s.TEXT, sourceContainerRef, null, null, documentData, null, 44, null)) == null) {
            strE = mainDocumentPhoto != null ? c0.e(mainDocumentPhoto) : null;
        }
        if (strE == null) {
            return null;
        }
        rz.a aVar = this.bitmapDecoder;
        dx.i iVarC = iy.a.c(this.base64Coder, strE, null, 2, null);
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

    /* JADX WARN: Code duplicated, block: B:12:0x006e  */
    private final DocumentGiloshData F(State<?> state, boolean isDocumentActive, er.a<i0> updateDocumentAction, l<? super n20.a, i0> dispatchAction, PictureSchema pictureSchema, String documentPeselFieldReference, b0 mainDocumentPhoto, b0 mainDocumentPesel, b0 data, s2 documentVMS) {
        Bitmap bitmap;
        KeyValueData keyValueData;
        b0 b0Var = data;
        p20.c cVar = this.giloshMapper;
        int i15 = 0;
        List listL0 = v.L0(v.q(new u2.Flag(k.Poland, this.labelProvider.c(dv1.a.F)), new u2.Hologram(null, new d(pictureSchema), 1, null)), x(pictureSchema.a(), b0Var));
        o20.p pVarB = o20.p.INSTANCE.b(pictureSchema.getPictureId());
        Bitmap bitmapE = E(pictureSchema, b0Var, mainDocumentPhoto);
        if (documentPeselFieldReference == null) {
            bitmap = bitmapE;
        } else {
            b0 b0VarE = this.dynamicDocumentSchemaDecoder.e(documentPeselFieldReference, b0Var);
            if (t.c(b0VarE != null ? c0.e(b0VarE) : null, c0.e(mainDocumentPesel))) {
                bitmap = bitmapE;
            } else {
                bitmap = null;
            }
        }
        Label labelC = this.labelProvider.c(dv1.a.O);
        Label labelC2 = isDocumentActive ? this.labelProvider.c(dv1.a.N) : this.labelProvider.c(dv1.a.K);
        List<DocumentSchemaAttribute> listB = pictureSchema.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            DocumentSchemaAttribute documentSchemaAttribute = (DocumentSchemaAttribute) obj;
            int i17 = i15;
            List list = listL0;
            String strK = K(documentSchemaAttribute.getOnMissingAttribute(), this.dynamicDocumentSchemaDecoder.c(documentSchemaAttribute.getDataType(), documentSchemaAttribute.getFieldReference(), documentSchemaAttribute.e(), documentSchemaAttribute.c(), b0Var, documentSchemaAttribute.a()));
            if (strK != null) {
                String strM = m(strK, documentSchemaAttribute.f());
                keyValueData = new KeyValueData(mx.b.b(strM, "attributeValue_" + i17), mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentSchemaAttribute.g()), "pictureSchemaAttributeDescription_" + i17), uv1.a.a(strM, documentSchemaAttribute.getDataType()));
            } else {
                keyValueData = null;
            }
            if (keyValueData != null) {
                arrayList.add(keyValueData);
            }
            b0Var = data;
            i15 = i16;
            listL0 = list;
        }
        return cVar.b(new p20.c.Params(listL0, state, pVarB, bitmap, labelC, null, null, isDocumentActive, labelC2, this.labelProvider.c(dv1.a.f44641j), updateDocumentAction, arrayList, new e(pictureSchema), new C5470f(pictureSchema), dispatchAction, documentVMS, 96, null));
    }

    private final Label G(List<DocumentSchemaLabel> list, String str) {
        String strA;
        if (list == null || (strA = this.dynamicDocumentSchemaDecoder.a(list)) == null) {
            return null;
        }
        return mx.b.b(strA, str);
    }

    private final List<SmallCardData> H(rq0.b.c documentType, List<DashboardServiceEntry> availableServices, er.a<i0> confirmDocumentAction, er.a<i0> goToSafeBus, er.a<i0> deleteDocumentAction) {
        List listC = v.c();
        Label labelC = this.labelProvider.c(dv1.a.f44640i0);
        int i15 = jz.a.f106785h1;
        o50.f.c cVar = o50.f.c.f142478a;
        listC.add(new SmallCardData(null, labelC, null, i15, cVar, false, confirmDocumentAction, 37, null));
        if (documentType == rq0.b.c.TEACHER && q.a(availableServices, rq0.c.SAFE_BUS)) {
            listC.add(new SmallCardData(null, this.labelProvider.c(dv1.a.f44652o0), null, jz.a.C0, cVar, false, goToSafeBus, 37, null));
        }
        listC.add(new SmallCardData(null, this.labelProvider.c(dv1.a.J), null, jz.a.f106727a, o50.f.b.f142477a, false, deleteDocumentAction, 37, null));
        return v.a(listC);
    }

    private final Label I(Params params) {
        String documentShortName = params.getDocumentShortName();
        if (documentShortName == null) {
            documentShortName = params.getDynamicDocument().getSchema().getDocumentName();
        }
        return mx.b.d(documentShortName, "topBarTitle");
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
    private final List<o20.l> J(DocumentTopAnnotation topAnnotation, b0 data) {
        List<DocumentSchemaLabel> listB;
        List<DocumentStaticSection> listC;
        List<DocumentSchemaLabel> listD;
        Label labelG;
        List<DocumentSchemaLabel> listB2;
        Label labelG2;
        List<DocumentStaticSection> listC2;
        ArrayList arrayList;
        DocumentDynamicSection dynamicSections;
        ArrayList arrayList2;
        List<String> listA;
        Iterator<T> it;
        Label labelG3;
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
                        labelG = G(listD, "title");
                    } else {
                        labelG = null;
                    }
                    listB2 = topAnnotation.b();
                    if (listB2 != null) {
                        labelG2 = G(listB2, "section");
                    } else {
                        labelG2 = null;
                    }
                    listC2 = topAnnotation.c();
                    if (listC2 != null) {
                        arrayList = new ArrayList();
                        it = listC2.iterator();
                        while (it.hasNext()) {
                            labelG3 = G(((DocumentStaticSection) it.next()).a(), "staticSection");
                            if (labelG3 != null) {
                                arrayList.add(labelG3);
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
                    arrayList3.add(new o20.l.TopSection(labelG, labelG2, arrayList, arrayList4));
                }
            } else {
                listD = topAnnotation.d();
                if (listD != null) {
                    labelG = G(listD, "title");
                } else {
                    labelG = null;
                }
                listB2 = topAnnotation.b();
                if (listB2 != null) {
                    labelG2 = G(listB2, "section");
                } else {
                    labelG2 = null;
                }
                listC2 = topAnnotation.c();
                if (listC2 != null) {
                    arrayList = new ArrayList();
                    it = listC2.iterator();
                    while (it.hasNext()) {
                        labelG3 = G(((DocumentStaticSection) it.next()).a(), "staticSection");
                        if (labelG3 != null) {
                            arrayList.add(labelG3);
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
                arrayList3.add(new o20.l.TopSection(labelG, labelG2, arrayList, arrayList4));
            }
        }
        return arrayList3;
    }

    private final String K(MissingDocumentAttribute missingAttribute, String attributeValue) {
        if (attributeValue == null || fu.r.t0(attributeValue)) {
            attributeValue = null;
        }
        if (attributeValue != null) {
            return attributeValue;
        }
        MissingDocumentAttribute.a onMissing = missingAttribute != null ? missingAttribute.getOnMissing() : null;
        int i15 = onMissing == null ? -1 : c.f208475a[onMissing.ordinal()];
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
        return q(dataType, defaultValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(Params params) {
        params.l().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Color N(String hexColor) {
        dx.i left;
        Object objB;
        if (hexColor == null) {
            return null;
        }
        j<dx.b> jVarA = xw.c.f221622a.a();
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

    private final String l(String str, m mVar) {
        int i15 = c.f208477c[mVar.ordinal()];
        if (i15 == 1) {
            return str.toUpperCase(Locale.ROOT);
        }
        if (i15 == 2) {
            return str;
        }
        throw new oq.p();
    }

    private final String m(String str, List<? extends m> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                str = l(str, (m) it.next());
            }
        }
        return str;
    }

    private final String q(s sVar, String str) {
        int i15 = c.f208476b[sVar.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? str : this.dateFormatter.d(new fz.b.String(str, fz.c.OFFSET_DATE_TIME_SEC, false, 4, null), fz.c.DOTTED_TIME_PLUS_DATE);
        }
        return this.dateFormatter.d(new fz.b.String(str, fz.c.DASHED_REVERSED, false, 4, null), fz.c.DOTTED);
    }

    private final List<o20.l> r(rq0.b dynamicDocumentType, List<DashboardServiceEntry> availableServices, DocumentSchema schema, b0 data, BitmapsByFieldReference bitmapsByFieldReference, er.a<i0> confirmDocumentAction, er.a<i0> goToSafeBus, final l<? super DocumentActionAttribute.a, i0> onGoToDocumentsToDownload, er.a<i0> updateDocumentWithTimerAction, er.a<i0> deleteDocumentAction, final l<? super DynamicDocumentBottomSheetData, i0> enlargeQrCode, final er.a<i0> hideBottomSheet) {
        DefaultSingleCardData defaultSingleCardData;
        final Bitmap bitmap;
        ArrayList arrayList = new ArrayList();
        QrCodeSchema qrCode = schema.getQrCode();
        if (qrCode != null && (bitmap = bitmapsByFieldReference.b().get(qrCode.getFieldReference())) != null) {
            arrayList.add(new o20.l.SingleCardImageButton(bitmap, this.labelProvider.c(dv1.a.f44637h), new er.a() { // from class: vv1.c
                @Override // er.a
                public final Object a() {
                    return f.s(enlargeQrCode, bitmap, this, hideBottomSheet);
                }
            }));
        }
        if (dynamicDocumentType != null) {
            if (dynamicDocumentType instanceof rq0.b.c) {
                arrayList.add(new o20.l.Shortcuts(new ShortcutsLayoutData(H((rq0.b.c) dynamicDocumentType, availableServices, confirmDocumentAction, goToSafeBus, deleteDocumentAction), new ShortcutMoreData(this.labelProvider.c(dv1.a.f44642j0), new l() { // from class: vv1.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.u((List) obj);
                    }
                }))));
            }
            i0 i0Var = i0.f148189a;
        }
        List<DocumentSchemaAttribute> listF = schema.f();
        if (listF != null) {
            ArrayList arrayList2 = new ArrayList();
            int i15 = 0;
            for (Object obj : listF) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                DocumentSchemaAttribute documentSchemaAttribute = (DocumentSchemaAttribute) obj;
                String strK = K(documentSchemaAttribute.getOnMissingAttribute(), this.dynamicDocumentSchemaDecoder.c(documentSchemaAttribute.getDataType(), documentSchemaAttribute.getFieldReference(), documentSchemaAttribute.e(), documentSchemaAttribute.c(), data, documentSchemaAttribute.a()));
                if (strK != null) {
                    defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentSchemaAttribute.g()), "commonAttributeTitle" + i15), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(strK, "attributeValue_" + i15), uv1.a.a(strK, documentSchemaAttribute.getDataType()) ? j70.a.LETTER_BY_LETTER : j70.a.LOWER_CASE, null, 2, null)), null, 4, null), null, null, null, 3839, null);
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
        List<DocumentSchemaAttribute> listB = schema.b();
        if (listB != null) {
            Label labelG = G(schema.c(), "");
            if (labelG == null) {
                labelG = this.labelProvider.c(dv1.a.f44656q0).n("AdditionalAttributesTitle");
            }
            ArrayList arrayList3 = new ArrayList();
            int i17 = 0;
            for (Object obj2 : listB) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    v.x();
                }
                DocumentSchemaAttribute documentSchemaAttribute2 = (DocumentSchemaAttribute) obj2;
                String strK2 = K(documentSchemaAttribute2.getOnMissingAttribute(), this.dynamicDocumentSchemaDecoder.c(documentSchemaAttribute2.getDataType(), documentSchemaAttribute2.getFieldReference(), documentSchemaAttribute2.e(), documentSchemaAttribute2.c(), data, documentSchemaAttribute2.a()));
                DefaultSingleCardData defaultSingleCardData2 = strK2 != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentSchemaAttribute2.g()), "additionalAttributeInfo" + i17), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(strK2, "singleCardLabel_" + i17), null, null, 3, null)), null, 4, null), null, null, null, 3839, null) : null;
                if (defaultSingleCardData2 != null) {
                    arrayList3.add(defaultSingleCardData2);
                }
                i17 = i18;
            }
            arrayList.add(new o20.l.Expandable(labelG, new CardListData(arrayList3, null, false, null, null, 30, null)));
        }
        List<DocumentActionAttribute> listA = schema.a();
        if (listA != null) {
            List<DocumentActionAttribute> list = listA;
            ArrayList arrayList4 = new ArrayList(v.y(list, 10));
            int i19 = 0;
            for (Object obj3 : list) {
                int i25 = i19 + 1;
                if (i19 < 0) {
                    v.x();
                }
                final DocumentActionAttribute documentActionAttribute = (DocumentActionAttribute) obj3;
                arrayList4.add(new DefaultSingleCardData("ActionsSectionItem" + i19, new er.a() { // from class: vv1.e
                    @Override // er.a
                    public final Object a() {
                        return f.v(onGoToDocumentsToDownload, documentActionAttribute);
                    }
                }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentActionAttribute.b()), ""), null, null, 3, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2812, null));
                i19 = i25;
            }
            arrayList.add(new o20.l.StaticList(new CardListData(arrayList4, null, false, null, null, 30, null)));
        }
        Label labelC = this.labelProvider.c(dv1.a.L);
        String strF = ev1.a.f(this.dynamicDocumentSchemaDecoder, s.TEXT, "dh.ts", null, null, data, null, 44, null);
        arrayList.add(new o20.l.UpdateDataItem(labelC, mx.b.d(strF != null ? this.dateFormatter.d(new fz.b.String(strF, fz.c.FULL_TIME_NO_SPACES, false, 4, null), fz.c.DOTTED) : null, "lastUpdateValue"), this.labelProvider.c(dv1.a.M), null, updateDocumentWithTimerAction, 8, null));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(l lVar, Bitmap bitmap, f fVar, er.a aVar) {
        lVar.b(new DynamicDocumentBottomSheetData(bitmap, fVar.labelProvider.c(dv1.a.f44629d), aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(l lVar, DocumentActionAttribute documentActionAttribute) {
        lVar.b(documentActionAttribute.getActionType());
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[SYNTHETIC] */
    private final List<u2> x(List<AdditionalLogo> additionalLogos, b0 documentData) {
        b0 b0Var;
        String id5;
        lv1.a aVarA;
        u2.Logo logo;
        ArrayList arrayList = new ArrayList();
        for (AdditionalLogo additionalLogo : additionalLogos) {
            String fieldReference = additionalLogo.getFieldReference();
            if (fieldReference != null) {
                b0Var = documentData;
                id5 = ev1.a.f(this.dynamicDocumentSchemaDecoder, s.TEXT, fieldReference, null, null, b0Var, null, 44, null);
                if (id5 == null) {
                }
                if (id5 != null) {
                    aVarA = lv1.a.INSTANCE.a(id5);
                } else {
                    aVarA = null;
                }
                logo = aVarA != null ? new u2.Logo(aVarA.getImage(), this.labelProvider.c(aVarA.getContentDescription())) : null;
                if (logo != null) {
                    arrayList.add(logo);
                }
                documentData = b0Var;
            } else {
                b0Var = documentData;
            }
            id5 = additionalLogo.getId();
            if (id5 != null) {
                aVarA = lv1.a.INSTANCE.a(id5);
            } else {
                aVarA = null;
            }
            if (aVarA != null) {
            }
            if (logo != null) {
                arrayList.add(logo);
            }
            documentData = b0Var;
        }
        return arrayList;
    }

    private final List<c30.b.c> z(DocumentBottomAnnotation bottomAnnotation, l<? super String, i0> openAnnotationLink) {
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
            Label labelD = mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentBottomAnnotationSection.a()), "bottomAnnotationSectionBody" + i15);
            List<DocumentSchemaLabel> listB = documentBottomAnnotationSection.b();
            if (listB != null) {
                String linkUrl = documentBottomAnnotationSection.getLinkUrl();
                link = linkUrl != null ? new c30.a.Link(new LinkData(null, mx.b.d(this.dynamicDocumentSchemaDecoder.a(listB), "bottomAnnotationSectionAlertLabel" + i15), linkUrl, LinkData.EnumC5775a.WEBSITE, false, openAnnotationLink, 17, null)) : null;
            } else {
                link = null;
            }
            arrayList.add(new c30.b.c(null, null, null, labelD, null, null, link, 55, null));
            i15 = i16;
        }
        return arrayList;
    }

    @Override // er.l
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public BaseDocumentData b(final Params params) {
        List<DashboardServiceEntry> listC;
        DynamicDocumentData dynamicDocument = params.getDynamicDocument();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), I(params), null, null, null, 28, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: vv1.b
            @Override // er.a
            public final Object a() {
                return f.M(params);
            }
        })), null, null, 53, null);
        List<o20.l> listJ = J(dynamicDocument.getSchema().getTopAnnotation(), dynamicDocument.getScope());
        DocumentGiloshData documentGiloshDataF = F(params.q(), params.getIsDocumentActive(), params.h(), params.e(), dynamicDocument.getSchema().getPicture(), dynamicDocument.getSchema().getDocumentPeselFieldReference(), params.getMainDocumentPhoto(), params.getMainDocumentPesel(), dynamicDocument.getScope(), params.getDocumentVMS());
        rq0.b documentType = dynamicDocument.getDocumentType();
        Object objD = params.q().d();
        if (objD instanceof gw1.c.Initialized) {
            listC = ((gw1.c.Initialized) objD).c();
        } else {
            listC = objD instanceof iw1.b.Initialized ? ((iw1.b.Initialized) objD).c() : null;
        }
        return new BaseDocumentData(null, baseScaffoldData, listJ, documentGiloshDataF, r(documentType, listC, dynamicDocument.getSchema(), dynamicDocument.getScope(), params.getBitmapsByFieldReference(), params.c(), params.k(), params.o(), params.r(), params.d(), params.j(), params.l()), null, z(dynamicDocument.getSchema().getBottomAnnotation(), params.p()), 33, null);
    }
}
