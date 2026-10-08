package at1;

import android.graphics.Bitmap;
import bt1.RefugeeChildStatementState;
import bt1.RefugeeChildrenListEntry;
import bt1.RefugeeDocumentBottomSheetData;
import dx.i;
import e20.k;
import er.l;
import fr.t;
import g70.ShortcutMoreData;
import g70.ShortcutMoreTransferData;
import h30.ButtonData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import l60.KeyValueData;
import mx.Label;
import mz3.z;
import n20.State;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import o20.BaseDocumentData;
import o20.p;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x40.LinkData;
import x50.NavigationButtonData;
import y30.n;
import zs1.DocumentStateData;
import zs1.o0;
import zs1.s0;
import zs1.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002=?BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b%\u0010&JQ\u00102\u001a\u0002012\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u00100\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b2\u00103J\u001f\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0002¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lat1/h;", "Lxw/f;", "Lat1/h$b;", "Lzs1/t0$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "Lp20/c;", "giloshScreenMapper", "Lat1/d;", "bottomSheetMapper", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lez/e;Lrz/a;Liy/a;Lp20/c;Lat1/d;Lu04/a;)V", "Lzs1/r0;", "documentStateData", "Lzs1/o0;", "bottomSheetState", "Ly20/b;", "animationsState", "Lzs1/s0;", "state", "Lat1/h$b$a;", "action", "Lcb4/i;", "dialogVMS", "Lzs1/t0$a$b;", "r", "(Lzs1/r0;Lzs1/o0;Ly20/b;Lzs1/s0;Lat1/h$b$a;Lcb4/i;)Lzs1/t0$a$b;", "actionHandler", "Lo20/k;", "h", "(Lzs1/s0;Lzs1/r0;Lat1/h$b$a;Ly20/b;)Lo20/k;", "", "shortName", "Ly30/n$b$b;", "selectedItem", "", "isMainDocument", "", "Lbt1/b;", "children", "dialogVMSAdapter", "Lzs1/t0$a$b$a;", "m", "(Ljava/lang/String;Lzs1/o0;Ly30/n$b$b;ZLjava/util/List;Lat1/h$b$a;Lcb4/i;)Lzs1/t0$a$b$a;", "Lmx/a;", "title", "value", "Ln50/g;", "u", "(Lmx/a;Lmx/a;)Ln50/g;", "params", "s", "(Lat1/h$b;)Lzs1/t0$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lrz/a;", "d", "Liy/a;", "e", "Lp20/c;", "f", "Lat1/d;", "g", "Lu04/a;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, t0.a> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f14478j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshScreenMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d bottomSheetMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: at1.h$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lat1/h$b;", "", "Lzs1/s0;", "state", "Ly20/b;", "animationsState", "Lat1/h$b$a;", "action", "<init>", "(Lzs1/s0;Ly20/b;Lat1/h$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzs1/s0;", "c", "()Lzs1/s0;", "b", "Ly20/b;", "()Ly20/b;", "Lat1/h$b$a;", "()Lat1/h$b$a;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f14486d = y20.b.f223429b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final s0 state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y20.b animationsState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ActionHandler action;

        /* JADX INFO: renamed from: at1.h$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b0\u0010)R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010)R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b,\u0010/R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b7\u0010)R)\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b*\u0010)R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b3\u0010/R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b&\u0010)R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b5\u0010)R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b1\u0010/¨\u00069"}, d2 = {"Lat1/h$b$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onDocumentVerificationClicked", "Lkotlin/Function1;", "", "onUrlClick", "onRestrictPeselCicked", "Lmz3/z$b;", "onUpdateDocument", "onDeleteDocument", "Ly30/n$b$b;", "onSwitchItemChanged", "Ln20/a;", "dispatchAction", "onOpenPeselBottomSheet", "", "Lg70/b;", "toMoreDialog", "closeBottomSheet", "Lbt1/a;", "onChildStatementStateChanged", "childrenStatementBottomSheetAction", "onChildrenListUpdate", "onChildClick", "<init>", "(Ler/a;Ler/a;Ler/l;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "d", "()Ler/a;", "b", "i", "c", "Ler/l;", "n", "()Ler/l;", "k", "e", "m", "f", "h", "g", "l", "j", "o", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActionHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onDocumentVerificationClicked;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final l<String, i0> onUrlClick;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onRestrictPeselCicked;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final l<z.b, i0> onUpdateDocument;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onDeleteDocument;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final l<n.Switch.EnumC5973b, i0> onSwitchItemChanged;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final l<n20.a, i0> dispatchAction;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onOpenPeselBottomSheet;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final l<List<ShortcutMoreTransferData>, i0> toMoreDialog;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> closeBottomSheet;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final l<RefugeeChildStatementState, i0> onChildStatementStateChanged;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> childrenStatementBottomSheetAction;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onChildrenListUpdate;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final l<String, i0> onChildClick;

            /* JADX WARN: Multi-variable type inference failed */
            public ActionHandler(er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar, er.a<i0> aVar3, l<? super z.b, i0> lVar2, er.a<i0> aVar4, l<? super n.Switch.EnumC5973b, i0> lVar3, l<? super n20.a, i0> lVar4, er.a<i0> aVar5, l<? super List<ShortcutMoreTransferData>, i0> lVar5, er.a<i0> aVar6, l<? super RefugeeChildStatementState, i0> lVar6, er.a<i0> aVar7, er.a<i0> aVar8, l<? super String, i0> lVar7) {
                this.onBack = aVar;
                this.onDocumentVerificationClicked = aVar2;
                this.onUrlClick = lVar;
                this.onRestrictPeselCicked = aVar3;
                this.onUpdateDocument = lVar2;
                this.onDeleteDocument = aVar4;
                this.onSwitchItemChanged = lVar3;
                this.dispatchAction = lVar4;
                this.onOpenPeselBottomSheet = aVar5;
                this.toMoreDialog = lVar5;
                this.closeBottomSheet = aVar6;
                this.onChildStatementStateChanged = lVar6;
                this.childrenStatementBottomSheetAction = aVar7;
                this.onChildrenListUpdate = aVar8;
                this.onChildClick = lVar7;
            }

            public final er.a<i0> a() {
                return this.childrenStatementBottomSheetAction;
            }

            public final er.a<i0> b() {
                return this.closeBottomSheet;
            }

            public final l<n20.a, i0> c() {
                return this.dispatchAction;
            }

            public final er.a<i0> d() {
                return this.onBack;
            }

            public final l<String, i0> e() {
                return this.onChildClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionHandler)) {
                    return false;
                }
                ActionHandler actionHandler = (ActionHandler) other;
                return t.c(this.onBack, actionHandler.onBack) && t.c(this.onDocumentVerificationClicked, actionHandler.onDocumentVerificationClicked) && t.c(this.onUrlClick, actionHandler.onUrlClick) && t.c(this.onRestrictPeselCicked, actionHandler.onRestrictPeselCicked) && t.c(this.onUpdateDocument, actionHandler.onUpdateDocument) && t.c(this.onDeleteDocument, actionHandler.onDeleteDocument) && t.c(this.onSwitchItemChanged, actionHandler.onSwitchItemChanged) && t.c(this.dispatchAction, actionHandler.dispatchAction) && t.c(this.onOpenPeselBottomSheet, actionHandler.onOpenPeselBottomSheet) && t.c(this.toMoreDialog, actionHandler.toMoreDialog) && t.c(this.closeBottomSheet, actionHandler.closeBottomSheet) && t.c(this.onChildStatementStateChanged, actionHandler.onChildStatementStateChanged) && t.c(this.childrenStatementBottomSheetAction, actionHandler.childrenStatementBottomSheetAction) && t.c(this.onChildrenListUpdate, actionHandler.onChildrenListUpdate) && t.c(this.onChildClick, actionHandler.onChildClick);
            }

            public final l<RefugeeChildStatementState, i0> f() {
                return this.onChildStatementStateChanged;
            }

            public final er.a<i0> g() {
                return this.onChildrenListUpdate;
            }

            public final er.a<i0> h() {
                return this.onDeleteDocument;
            }

            public int hashCode() {
                return (((((((((((((((((((((((((((this.onBack.hashCode() * 31) + this.onDocumentVerificationClicked.hashCode()) * 31) + this.onUrlClick.hashCode()) * 31) + this.onRestrictPeselCicked.hashCode()) * 31) + this.onUpdateDocument.hashCode()) * 31) + this.onDeleteDocument.hashCode()) * 31) + this.onSwitchItemChanged.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.onOpenPeselBottomSheet.hashCode()) * 31) + this.toMoreDialog.hashCode()) * 31) + this.closeBottomSheet.hashCode()) * 31) + this.onChildStatementStateChanged.hashCode()) * 31) + this.childrenStatementBottomSheetAction.hashCode()) * 31) + this.onChildrenListUpdate.hashCode()) * 31) + this.onChildClick.hashCode();
            }

            public final er.a<i0> i() {
                return this.onDocumentVerificationClicked;
            }

            public final er.a<i0> j() {
                return this.onOpenPeselBottomSheet;
            }

            public final er.a<i0> k() {
                return this.onRestrictPeselCicked;
            }

            public final l<n.Switch.EnumC5973b, i0> l() {
                return this.onSwitchItemChanged;
            }

            public final l<z.b, i0> m() {
                return this.onUpdateDocument;
            }

            public final l<String, i0> n() {
                return this.onUrlClick;
            }

            public final l<List<ShortcutMoreTransferData>, i0> o() {
                return this.toMoreDialog;
            }

            public String toString() {
                return "ActionHandler(onBack=" + this.onBack + ", onDocumentVerificationClicked=" + this.onDocumentVerificationClicked + ", onUrlClick=" + this.onUrlClick + ", onRestrictPeselCicked=" + this.onRestrictPeselCicked + ", onUpdateDocument=" + this.onUpdateDocument + ", onDeleteDocument=" + this.onDeleteDocument + ", onSwitchItemChanged=" + this.onSwitchItemChanged + ", dispatchAction=" + this.dispatchAction + ", onOpenPeselBottomSheet=" + this.onOpenPeselBottomSheet + ", toMoreDialog=" + this.toMoreDialog + ", closeBottomSheet=" + this.closeBottomSheet + ", onChildStatementStateChanged=" + this.onChildStatementStateChanged + ", childrenStatementBottomSheetAction=" + this.childrenStatementBottomSheetAction + ", onChildrenListUpdate=" + this.onChildrenListUpdate + ", onChildClick=" + this.onChildClick + ')';
            }
        }

        public Params(s0 s0Var, y20.b bVar, ActionHandler actionHandler) {
            this.state = s0Var;
            this.animationsState = bVar;
            this.action = actionHandler;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActionHandler getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final y20.b getAnimationsState() {
            return this.animationsState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final s0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.animationsState, params.animationsState) && t.c(this.action, params.action);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.animationsState.hashCode()) * 31) + this.action.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", animationsState=" + this.animationsState + ", action=" + this.action + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14505a;

        static {
            int[] iArr = new int[n.Switch.EnumC5973b.values().length];
            try {
                iArr[n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14505a = iArr;
        }
    }

    public h(mx.c cVar, ez.e eVar, rz.a aVar, iy.a aVar2, p20.c cVar2, d dVar, u04.a aVar3) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
        this.giloshScreenMapper = cVar2;
        this.bottomSheetMapper = dVar;
        this.commonEndpoints = aVar3;
    }

    private final BaseDocumentData h(s0 state, final DocumentStateData documentStateData, final Params.ActionHandler actionHandler, y20.b animationsState) {
        Bitmap bitmapA;
        String string;
        Object objB;
        Label labelC = this.labelProvider.c(ss1.a.M);
        int i15 = jz.a.f106785h1;
        o50.f.c cVar = o50.f.c.f142478a;
        SmallCardData smallCardData = new SmallCardData(null, labelC, null, i15, cVar, false, actionHandler.i(), 37, null);
        SmallCardData smallCardData2 = documentStateData.getShowDiiaPlPeselZoom() ? new SmallCardData(null, this.labelProvider.c(ss1.a.P), null, jz.a.f106791i0, cVar, false, actionHandler.j(), 37, null) : null;
        SmallCardData smallCardData3 = new SmallCardData(null, this.labelProvider.c(ss1.a.O), null, jz.a.f106854r0, cVar, false, actionHandler.k(), 37, null);
        if (!documentStateData.getIsMainDocument() || !documentStateData.getIsRestrictPeselAvailable()) {
            smallCardData3 = null;
        }
        SmallCardData smallCardData4 = new SmallCardData(null, this.labelProvider.c(ss1.a.C), null, jz.a.f106727a, o50.f.b.f142477a, false, actionHandler.h(), 37, null);
        if (!documentStateData.getIsMainDocument()) {
            smallCardData4 = null;
        }
        o20.l.Shortcuts shortcuts = new o20.l.Shortcuts(new ShortcutsLayoutData(v.s(smallCardData, smallCardData2, smallCardData3, smallCardData4), new ShortcutMoreData(this.labelProvider.c(ss1.a.N), actionHandler.o())));
        Label labelC2 = this.labelProvider.c(ss1.a.f183968r);
        Label labelC3 = this.labelProvider.c(ss1.a.f183970t);
        b0 birthCountry = documentStateData.getData().getScope().getData().getBirthCountry();
        DefaultSingleCardData defaultSingleCardDataU = u(labelC3, mx.b.d(birthCountry != null ? c0.e(birthCountry) : null, "DiiaDocumentBirthCountryValue"));
        Label labelC4 = this.labelProvider.c(ss1.a.f183969s);
        b0 birthPlace = documentStateData.getData().getScope().getData().getBirthPlace();
        DefaultSingleCardData defaultSingleCardDataU2 = u(labelC4, mx.b.d(birthPlace != null ? c0.e(birthPlace) : null, "DiiaDocumentBirthPlaceValue"));
        if (!documentStateData.getIsMainDocument()) {
            defaultSingleCardDataU2 = null;
        }
        Label labelC5 = this.labelProvider.c(ss1.a.f183972v);
        b0 nationality = documentStateData.getData().getScope().getData().getNationality();
        o20.l.Section section = new o20.l.Section(labelC2, v.s(defaultSingleCardDataU, defaultSingleCardDataU2, u(labelC5, mx.b.d(nationality != null ? c0.e(nationality) : null, "DiiaDocumentNationalityValue"))));
        Label labelC6 = this.labelProvider.c(ss1.a.G);
        long jA = documentStateData.getData().getScope().getDataHeader().a();
        ez.e eVar = this.dateFormatter;
        fz.b.Long r15 = new fz.b.Long(jA);
        fz.c cVar2 = fz.c.DOTTED;
        List listS = v.s(shortcuts, section, new o20.l.UpdateDataItem(labelC6, mx.b.d(eVar.d(r15, cVar2), "DiiaDocumentLastUpdateDateValue"), documentStateData.getIsMainDocument() ? this.labelProvider.c(ss1.a.H) : null, null, new er.a() { // from class: at1.e
            @Override // er.a
            public final Object a() {
                return h.l(documentStateData, actionHandler);
            }
        }, 8, null));
        p20.c cVar3 = this.giloshScreenMapper;
        State state2 = new State(state, animationsState);
        p.l lVar = p.l.f140885c;
        b0 picture = documentStateData.getData().getScope().getData().getPicture();
        if (picture != null) {
            rz.a aVar = this.bitmapDecoder;
            i iVarC = iy.a.c(this.base64Coder, c0.e(picture), null, 2, null);
            if (iVarC instanceof i.Left) {
                objB = new byte[0];
            } else {
                if (!(iVarC instanceof i.Right)) {
                    throw new oq.p();
                }
                objB = ((i.Right) iVarC).b();
            }
            bitmapA = aVar.a((byte[]) objB);
        } else {
            bitmapA = null;
        }
        boolean zE = documentStateData.getStatus().e();
        Label labelC7 = documentStateData.getStatus().e() ? this.labelProvider.c(ss1.a.I) : this.labelProvider.c(ss1.a.F);
        b0 firstName = documentStateData.getData().getScope().getData().getFirstName();
        if (firstName != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(c0.e(firstName));
            b0 secondName = documentStateData.getData().getScope().getData().getSecondName();
            if (secondName != null) {
                sb5.append(' ' + c0.e(secondName));
                i0 i0Var = i0.f148189a;
            }
            string = sb5.toString();
        } else {
            string = null;
        }
        KeyValueData keyValueData = new KeyValueData(mx.b.d(string, "DiiaDocumentNamesValue"), this.labelProvider.c(ss1.a.J), false, 4, null);
        b0 surname = documentStateData.getData().getScope().getData().getSurname();
        KeyValueData keyValueData2 = new KeyValueData(mx.b.d(surname != null ? c0.e(surname) : null, "DiiaDocumentSurnameValue"), this.labelProvider.c(ss1.a.L), false, 4, null);
        b0 birthDate = documentStateData.getData().getScope().getData().getBirthDate();
        KeyValueData keyValueData3 = new KeyValueData(mx.b.d(birthDate != null ? this.dateFormatter.d(new fz.b.String(c0.e(birthDate), fz.c.DASHED_REVERSED, false, 4, null), cVar2) : null, "DiiaDocumentBirthDateValue"), this.labelProvider.c(ss1.a.E), false, 4, null);
        b0 pesel = documentStateData.getData().getScope().getData().getPesel();
        return new BaseDocumentData(null, null, null, cVar3.b(new p20.c.Params(v.q(new u2.Flag(k.Ukraine, this.labelProvider.c(ss1.a.B)), new u2.Hologram(null, null, 3, null)), state2, lVar, bitmapA, null, null, null, zE, labelC7, this.labelProvider.c(ss1.a.D), new er.a() { // from class: at1.f
            @Override // er.a
            public final Object a() {
                return h.i(actionHandler);
            }
        }, v.q(keyValueData, keyValueData2, keyValueData3, new KeyValueData(mx.b.d(pesel != null ? c0.e(pesel) : null, "DiiaDocumentPeselValue"), this.labelProvider.c(ss1.a.K), true)), null, null, actionHandler.c(), documentStateData.getDocumentVMS(), 12400, null)), listS, null, v.e(new c30.b.c(null, null, this.labelProvider.c(ss1.a.f183974x), this.labelProvider.c(ss1.a.f183973w), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(ss1.a.f183971u), this.commonEndpoints.i(), LinkData.EnumC5775a.WEBSITE, false, actionHandler.n(), 17, null)), 51, null)), 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params.ActionHandler actionHandler) {
        actionHandler.m().b(z.b.DOWNLOAD);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(DocumentStateData documentStateData, Params.ActionHandler actionHandler) {
        if (documentStateData.getIsMainDocument()) {
            actionHandler.m().b(z.b.UPDATE);
        }
        return i0.f148189a;
    }

    private final t0.a.b.ChildrenList m(String shortName, o0 bottomSheetState, n.Switch.EnumC5973b selectedItem, boolean isMainDocument, List<RefugeeChildrenListEntry> children, final Params.ActionHandler action, cb4.i dialogVMSAdapter) {
        Label labelN;
        Label labelC = this.labelProvider.c(ss1.a.f183963m);
        Label labelC2 = this.labelProvider.c(ss1.a.f183961k);
        Label labelC3 = this.labelProvider.c(ss1.a.f183962l);
        Label labelC4 = this.labelProvider.c(ss1.a.f183954d);
        Label labelC5 = this.labelProvider.c(ss1.a.f183958h);
        Label labelC6 = this.labelProvider.c(ss1.a.f183957g);
        Label labelC7 = this.labelProvider.c(ss1.a.f183960j);
        Label labelC8 = this.labelProvider.c(ss1.a.f183959i);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ss1.a.f183954d), null, 2, null), k30.d.a.f107773a, null, action.g(), 35, null);
        n.Switch r15 = isMainDocument ? new n.Switch(new n.Switch.TabItem(this.labelProvider.c(ss1.a.f183976z), n.Switch.EnumC5973b.LEFT), new n.Switch.TabItem(this.labelProvider.c(ss1.a.f183975y), n.Switch.EnumC5973b.RIGHT), selectedItem, false, action.l(), 8, null) : null;
        er.a<i0> aVarD = action.d();
        RefugeeDocumentBottomSheetData refugeeDocumentBottomSheetDataB = this.bottomSheetMapper.b(new d.Params(bottomSheetState, action.b(), action.f(), action.a()));
        if (shortName == null || (labelN = mx.b.b(shortName, "title")) == null) {
            labelN = this.labelProvider.c(ss1.a.A).n("title");
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), action.d()), labelN, null, null, null, 28, null), null, null, null, null, 61, null);
        List<RefugeeChildrenListEntry> list = children;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (final RefugeeChildrenListEntry refugeeChildrenListEntry : list) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: at1.g
                @Override // er.a
                public final Object a() {
                    return h.q(action, refugeeChildrenListEntry);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(refugeeChildrenListEntry.getNameLabel(), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        return new t0.a.b.ChildrenList(baseScaffoldData, r15, refugeeDocumentBottomSheetDataB, dialogVMSAdapter, aVarD, labelC, labelC2, labelC4, labelC3, labelC5, labelC6, labelC7, labelC8, arrayList, buttonData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params.ActionHandler actionHandler, RefugeeChildrenListEntry refugeeChildrenListEntry) {
        actionHandler.e().b(refugeeChildrenListEntry.getBundleId());
        return i0.f148189a;
    }

    private final t0.a.b r(DocumentStateData documentStateData, o0 bottomSheetState, y20.b animationsState, s0 state, Params.ActionHandler action, cb4.i dialogVMS) {
        Label labelN;
        int i15 = c.f14505a[documentStateData.getSelectedItem().ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                return m(documentStateData.getShortName(), bottomSheetState, documentStateData.getSelectedItem(), documentStateData.getIsMainDocument(), documentStateData.d(), action, dialogVMS);
            }
            throw new oq.p();
        }
        String shortName = documentStateData.getShortName();
        if (shortName == null || (labelN = mx.b.b(shortName, "title")) == null) {
            labelN = this.labelProvider.c(ss1.a.A).n("title");
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), action.d()), labelN, null, null, null, 28, null), null, null, null, null, 61, null);
        n.Switch r15 = new n.Switch(new n.Switch.TabItem(this.labelProvider.c(ss1.a.f183976z), n.Switch.EnumC5973b.LEFT), new n.Switch.TabItem(this.labelProvider.c(ss1.a.f183975y), n.Switch.EnumC5973b.RIGHT), documentStateData.getSelectedItem(), false, action.l(), 8, null);
        if (!documentStateData.getIsMainDocument()) {
            r15 = null;
        }
        return new t0.a.b.DocumentView(baseScaffoldData, r15, this.bottomSheetMapper.b(new d.Params(bottomSheetState, action.b(), action.f(), action.a())), state instanceof s0.b.Dialog ? ((s0.b.Dialog) state).getDialog() : null, action.d(), h(state, documentStateData, action, animationsState));
    }

    private final DefaultSingleCardData u(Label title, Label value) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(title, null, null, 3, null), new n50.b.Title(n50.l.b(value, null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public t0.a b(Params params) {
        s0 state = params.getState();
        if ((state instanceof s0.f) || (state instanceof s0.d.Screen)) {
            return t0.a.c.f236914a;
        }
        if (state instanceof s0.c.Screen) {
            return r(((s0.c.Screen) state).getDocumentStateData(), o0.a.f236818a, params.getAnimationsState(), state, params.getAction(), null);
        }
        if ((state instanceof s0.e.Screen) || (state instanceof s0.e.Dialog)) {
            cb4.i dialog = null;
            DocumentStateData documentStateData = ((s0.e) state).getDocumentStateData();
            o0.a aVar = o0.a.f236818a;
            y20.b animationsState = params.getAnimationsState();
            Params.ActionHandler action = params.getAction();
            if (state instanceof s0.e.Dialog) {
                dialog = ((s0.e.Dialog) state).getDialog();
            }
            return r(documentStateData, aVar, animationsState, state, action, dialog);
        }
        boolean z15 = state instanceof s0.b.Dialog;
        if (z15 || (state instanceof s0.b.Screen)) {
            s0.b bVar = (s0.b) state;
            DocumentStateData documentStateData2 = bVar.getDocumentStateData();
            o0 bottomSheetState = bVar.getBottomSheetState();
            y20.b animationsState2 = params.getAnimationsState();
            cb4.i dialog2 = null;
            Params.ActionHandler action2 = params.getAction();
            if (z15) {
                dialog2 = ((s0.b.Dialog) state).getDialog();
            }
            return r(documentStateData2, bottomSheetState, animationsState2, state, action2, dialog2);
        }
        if (state instanceof s0.ChildrenLoader) {
            s0.ChildrenLoader childrenLoader = (s0.ChildrenLoader) state;
            return m(childrenLoader.getDocumentStateData().getShortName(), o0.a.f236818a, n.Switch.EnumC5973b.RIGHT, true, childrenLoader.getDocumentStateData().d(), params.getAction(), null);
        }
        if (state instanceof s0.e.Error) {
            return new t0.a.Error(((s0.e.Error) state).getErrorVMS());
        }
        if (state instanceof s0.d.Error) {
            return new t0.a.Error(((s0.d.Error) state).getErrorVMS());
        }
        if (state instanceof s0.b.Error) {
            return new t0.a.Error(((s0.b.Error) state).getErrorVMS());
        }
        throw new oq.p();
    }
}
