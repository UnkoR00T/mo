package gr3;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import cb4.DialogData;
import cr3.WruDocumentData;
import cr3.WruDocumentItem;
import e40.BarCodeSingleCardData;
import er.l;
import er.p;
import f40.LabelButtonImageSingleCardData;
import fr.t;
import fr3.AdditionalParametersBitmaps;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import g70.ShortcutMoreData;
import h30.ButtonData;
import h70.ShortcutsLayoutData;
import hr3.DocumentAdditionalSectionData;
import hr3.DocumentLogoScreenData;
import hr3.DocumentMainCardScreenData;
import hr3.WruDocumentScreenData;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import l60.KeyValueData;
import mx.Label;
import n20.State;
import n30.CardListData;
import n50.BodySection;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import o50.SmallCardData;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.r;
import w20.DocumentGiloshData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 [2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002USB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ·\u0001\u0010*\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001c0!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010&\u001a\u00020%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001c0!H\u0002¢\u0006\u0004\b*\u0010+J#\u0010/\u001a\b\u0012\u0004\u0012\u00020-0,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002¢\u0006\u0004\b/\u00100JM\u00109\u001a\b\u0012\u0004\u0012\u0002080,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u0001032\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u000203H\u0002¢\u0006\u0004\b9\u0010:JO\u0010=\u001a\b\u0012\u0004\u0012\u00020<0,2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001c0!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001eH\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020?2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\bE\u0010FJ%\u0010J\u001a\u00020I2\u0006\u0010G\u001a\u00020\u00142\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001eH\u0002¢\u0006\u0004\bJ\u0010KJ\u0013\u0010L\u001a\u000201*\u00020\u0010H\u0002¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u0004\u0018\u00010?*\u00020\u0010H\u0002¢\u0006\u0004\bN\u0010OJ\u0018\u0010Q\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\bQ\u0010RR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"Lgr3/k;", "Lxw/f;", "Lgr3/k$b;", "Lfr3/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Luy/a;", "accelerometerManager", "Lgr3/b;", "wruDialogMapper", "<init>", "(Lmx/c;Lez/e;Luy/a;Lgr3/b;)V", "Lcr3/e;", "localDocumentData", "Ly20/b;", "animationsState", "Lcr3/b;", "documentStatus", "Landroid/graphics/Bitmap;", "documentLogoBitmap", "userPhotoBitmap", "Lfr3/b;", "additionalParametersBitmaps", "Lkotlin/Function2;", "", "Lcb4/d;", "Loq/i0;", "onVerifyButtonClick", "Lkotlin/Function0;", "onRefreshDocument", "onShowDeletionDialog", "Lkotlin/Function1;", "Lhr3/e;", "showBottomSheet", "hideBottomSheet", "Ljava/time/OffsetDateTime;", "currentDateTime", "Ln20/a;", "dispatchAction", "Lhr3/f;", "J", "(Lcr3/e;Ly20/b;Lcr3/b;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lfr3/b;Ler/p;Ler/a;Ler/a;Ler/l;Ler/a;Ljava/time/OffsetDateTime;Ler/l;)Lhr3/f;", "", "Lcr3/f;", "commonParameters", "N", "(Ljava/util/List;)Ljava/util/List;", "", "isDocumentValid", "", "userFirstName", "userSecondName", "userSurname", "userPesel", "Ll60/c;", "I", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "additionalParameters", "Ln50/k;", "F", "(Ljava/util/List;Lfr3/b;Ler/l;Ler/a;)Ljava/util/List;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "info", "Ln50/g;", "u", "(Lmx/a;Lmx/a;)Ln50/g;", "s", "(Ljava/time/OffsetDateTime;)Lmx/a;", "value", "onHideBottomSheet", "Lhr3/e$b;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Landroid/graphics/Bitmap;Ler/a;)Lhr3/e$b;", "r", "(Ly20/b;)Z", "q", "(Ly20/b;)Lmx/a;", "params", "v", "(Lgr3/k$b;)Lfr3/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Luy/a;", "d", "Lgr3/b;", "e", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements xw.f<Params, fr3.d.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f76583f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uy.a accelerometerManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b wruDialogMapper;

    /* JADX INFO: renamed from: gr3.k$b, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b*\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b+\u0010&R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b\u001f\u0010-R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b.\u0010-R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b#\u0010&¨\u0006/"}, d2 = {"Lgr3/k$b;", "", "Ln20/b;", "Lfr3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function2;", "", "Lcb4/d;", "onVerifyButtonClick", "onRefreshDocument", "onShowDeletionDialog", "Lkotlin/Function1;", "Ln20/a;", "dispatchAction", "Lhr3/e;", "showBottomSheet", "hideBottomSheet", "<init>", "(Ln20/b;Ler/a;Ler/p;Ler/a;Ler/a;Ler/l;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "h", "()Ln20/b;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/p;", "f", "()Ler/p;", "d", "e", "Ler/l;", "()Ler/l;", "g", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f76588i = State.f130742c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<fr3.c> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Integer, DialogData, i0> onVerifyButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRefreshDocument;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShowDeletionDialog;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<hr3.e, i0> showBottomSheet;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideBottomSheet;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<fr3.c> state, er.a<i0> aVar, p<? super Integer, ? super DialogData, i0> pVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super n20.a, i0> lVar, l<? super hr3.e, i0> lVar2, er.a<i0> aVar4) {
            this.state = state;
            this.onBack = aVar;
            this.onVerifyButtonClick = pVar;
            this.onRefreshDocument = aVar2;
            this.onShowDeletionDialog = aVar3;
            this.dispatchAction = lVar;
            this.showBottomSheet = lVar2;
            this.hideBottomSheet = aVar4;
        }

        public final l<n20.a, i0> a() {
            return this.dispatchAction;
        }

        public final er.a<i0> b() {
            return this.hideBottomSheet;
        }

        public final er.a<i0> c() {
            return this.onBack;
        }

        public final er.a<i0> d() {
            return this.onRefreshDocument;
        }

        public final er.a<i0> e() {
            return this.onShowDeletionDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onVerifyButtonClick, params.onVerifyButtonClick) && t.c(this.onRefreshDocument, params.onRefreshDocument) && t.c(this.onShowDeletionDialog, params.onShowDeletionDialog) && t.c(this.dispatchAction, params.dispatchAction) && t.c(this.showBottomSheet, params.showBottomSheet) && t.c(this.hideBottomSheet, params.hideBottomSheet);
        }

        public final p<Integer, DialogData, i0> f() {
            return this.onVerifyButtonClick;
        }

        public final l<hr3.e, i0> g() {
            return this.showBottomSheet;
        }

        public final State<fr3.c> h() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onVerifyButtonClick.hashCode()) * 31) + this.onRefreshDocument.hashCode()) * 31) + this.onShowDeletionDialog.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.showBottomSheet.hashCode()) * 31) + this.hideBottomSheet.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onVerifyButtonClick=" + this.onVerifyButtonClick + ", onRefreshDocument=" + this.onRefreshDocument + ", onShowDeletionDialog=" + this.onShowDeletionDialog + ", dispatchAction=" + this.dispatchAction + ", showBottomSheet=" + this.showBottomSheet + ", hideBottomSheet=" + this.hideBottomSheet + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f76598b;

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
            f76597a = iArr;
            int[] iArr2 = new int[cr3.c.values().length];
            try {
                iArr2[cr3.c.SENATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[cr3.c.PZPN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f76598b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WruDocumentData f76599a;

        d(WruDocumentData wruDocumentData) {
            this.f76599a = wruDocumentData;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(19427906);
            if (p076m2.t.k()) {
                p076m2.t.o(19427906, i15, -1, "pl.gov.coi.mobywatel.feature.wru.presentation.screens.wru.mapper.WruScreenMapper.mapToWruDocumentScreenData.<anonymous> (WruScreenMapper.kt:202)");
            }
            cr3.c templateType = this.f76599a.getScope().getTemplateType();
            Color colorM0boximpl = null;
            if (templateType != cr3.c.PZPN) {
                templateType = null;
            }
            if (templateType == null) {
                rVar.X(-1043726023);
                rVar.R();
            } else {
                rVar.X(-1043726022);
                long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
                rVar.R();
                colorM0boximpl = Color.m0boximpl(secondary);
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return colorM0boximpl;
        }
    }

    public k(mx.c cVar, ez.e eVar, uy.a aVar, b bVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.accelerometerManager = aVar;
        this.wruDialogMapper = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, v vVar) {
        int i15 = c.f76597a[vVar.ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                throw new oq.p();
            }
            params.b().a();
        }
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x013b A[Catch: Exception -> 0x00d1, c -> 0x00d4, CancellationException -> 0x00d7, TryCatch #3 {Exception -> 0x00d1, blocks: (B:8:0x002a, B:16:0x004a, B:18:0x0052, B:20:0x005c, B:22:0x006a, B:45:0x01a5, B:29:0x00da, B:30:0x00ee, B:31:0x00ef, B:32:0x0103, B:39:0x013b, B:33:0x0104, B:36:0x010d, B:37:0x0133, B:40:0x014c, B:42:0x0156, B:44:0x0164, B:46:0x01ab, B:47:0x01bf, B:48:0x01c0, B:49:0x01d4, B:50:0x01d5, B:53:0x01e3), top: B:81:0x002a }] */
    private final List<n50.k> F(List<WruDocumentItem> additionalParameters, AdditionalParametersBitmaps additionalParametersBitmaps, final l<? super hr3.e, i0> showBottomSheet, final er.a<i0> hideBottomSheet) {
        dx.i left;
        Object objB;
        Object objB2;
        Object customSingleCardData;
        if (additionalParameters == null) {
            return pq.v.n();
        }
        List<WruDocumentItem> list = additionalParameters;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        for (WruDocumentItem wruDocumentItem : list) {
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    ex.a aVar = new ex.a();
                    String dataType = wruDocumentItem.getDataType();
                    int iHashCode = dataType.hashCode();
                    if (iHashCode != -943038791) {
                        if (iHashCode != 2090926) {
                            if (iHashCode == 1310753099 && dataType.equals("QR_CODE")) {
                                if (wruDocumentItem.getValue().length() == 0) {
                                    aVar.b(new dx.b.Parsing(new Exception("QR_CODE has empty value")));
                                    throw new oq.g();
                                }
                                Bitmap bitmap = additionalParametersBitmaps.b().get(wruDocumentItem.getValue());
                                if (bitmap == null) {
                                    aVar.b(new dx.b.Parsing(new Exception("QR_CODE has no bitmap")));
                                    throw new oq.g();
                                }
                                final Bitmap bitmap2 = bitmap;
                                customSingleCardData = new CustomSingleCardData("qrCodeCard", new f40.b(new LabelButtonImageSingleCardData(wruDocumentItem.getLabel(), new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(yq3.b.f228735s), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: gr3.g
                                    @Override // er.a
                                    public final Object a() {
                                        return k.G(this.f76575a, bitmap2, hideBottomSheet, showBottomSheet);
                                    }
                                }, 35, null), new n50.i.Image(bitmap2, null, null, 6, null))), null, false, null, null, false, null, 252, null);
                            } else {
                                customSingleCardData = u(mx.b.d(wruDocumentItem.getValue(), "value"), wruDocumentItem.getLabel());
                            }
                        } else if (dataType.equals("DATE")) {
                            customSingleCardData = u(mx.b.d(this.dateFormatter.d(new fz.b.String(wruDocumentItem.getValue(), fz.c.DASHED_REVERSED, false, 4, null), fz.c.DOTTED), "dateOfIssue"), wruDocumentItem.getLabel());
                        } else {
                            customSingleCardData = u(mx.b.d(wruDocumentItem.getValue(), "value"), wruDocumentItem.getLabel());
                        }
                    } else if (!dataType.equals("BAR_CODE")) {
                        customSingleCardData = u(mx.b.d(wruDocumentItem.getValue(), "value"), wruDocumentItem.getLabel());
                    } else {
                        if (wruDocumentItem.getValue().length() == 0) {
                            aVar.b(new dx.b.Parsing(new Exception("BAR_CODE has empty value")));
                            throw new oq.g();
                        }
                        Bitmap bitmap3 = additionalParametersBitmaps.a().get(wruDocumentItem.getValue());
                        if (bitmap3 == null) {
                            aVar.b(new dx.b.Parsing(new Exception("BAR_CODE has no bitmap")));
                            throw new oq.g();
                        }
                        customSingleCardData = new CustomSingleCardData("barCodeCard", new e40.b(new BarCodeSingleCardData(wruDocumentItem.getLabel(), new n50.i.Image(bitmap3, mx.b.b(wruDocumentItem.getValue(), "value"), null, 4, null))), null, false, null, null, false, null, 252, null);
                    }
                    left = new dx.i.Right(customSingleCardData);
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
                try {
                    left = new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (CancellationException e18) {
                throw e18;
            }
            if (left instanceof dx.i.Left) {
                objB2 = u(Label.INSTANCE.b(), wruDocumentItem.getLabel());
            } else {
                if (!(left instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB2 = ((dx.i.Right) left).b();
            }
            arrayList.add((n50.k) objB2);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(k kVar, Bitmap bitmap, er.a aVar, l lVar) {
        lVar.b(kVar.H(bitmap, aVar));
        return i0.f148189a;
    }

    private final hr3.e.Expanded H(Bitmap value, er.a<i0> onHideBottomSheet) {
        return new hr3.e.Expanded(value, this.labelProvider.c(yq3.b.f228720d), onHideBottomSheet);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final List<KeyValueData> I(List<WruDocumentItem> commonParameters, boolean isDocumentValid, String userFirstName, String userSecondName, String userSurname, String userPesel) {
        Label labelD;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(userFirstName);
        sb5.append(" ");
        sb5.append(userSecondName == null ? new String() : userSecondName);
        String string = sb5.toString();
        List<WruDocumentItem> listN = N(commonParameters);
        ArrayList<WruDocumentItem> arrayList = new ArrayList();
        Iterator<T> it = listN.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (t.c(((WruDocumentItem) next).getType(), "VALID_TO") ? isDocumentValid : true) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, 10));
        for (WruDocumentItem wruDocumentItem : arrayList) {
            String type = wruDocumentItem.getType();
            switch (type.hashCode()) {
                case -1135010629:
                    if (type.equals("SURNAME")) {
                        labelD = mx.b.d(fu.r.P(userSurname, "-", "-\n", false, 4, null), "surname");
                    } else {
                        labelD = mx.b.d(wruDocumentItem.getValue(), "value");
                    }
                    break;
                case -638617154:
                    if (type.equals("VALID_TO")) {
                        labelD = wruDocumentItem.getValue().length() == 0 ? this.labelProvider.c(yq3.b.f228738v) : mx.b.d(this.dateFormatter.d(new fz.b.String(wruDocumentItem.getValue(), fz.c.DASHED_REVERSED, false, 4, null), fz.c.DOTTED), "validTo");
                    } else {
                        labelD = mx.b.d(wruDocumentItem.getValue(), "value");
                    }
                    break;
                case 2388619:
                    if (type.equals("NAME")) {
                        labelD = mx.b.d(string, "name");
                    } else {
                        labelD = mx.b.d(wruDocumentItem.getValue(), "value");
                    }
                    break;
                case 76019237:
                    if (type.equals("PESEL")) {
                        labelD = mx.b.d(userPesel, "pesel");
                        break;
                    }
                default:
                    labelD = mx.b.d(wruDocumentItem.getValue(), "value");
                    break;
            }
            arrayList2.add(new KeyValueData(labelD, wruDocumentItem.getLabel(), false, 4, null));
        }
        return arrayList2;
    }

    private final WruDocumentScreenData J(final WruDocumentData localDocumentData, y20.b animationsState, cr3.b documentStatus, Bitmap documentLogoBitmap, Bitmap userPhotoBitmap, AdditionalParametersBitmaps additionalParametersBitmaps, final p<? super Integer, ? super DialogData, i0> onVerifyButtonClick, final er.a<i0> onRefreshDocument, er.a<i0> onShowDeletionDialog, l<? super hr3.e, i0> showBottomSheet, er.a<i0> hideBottomSheet, OffsetDateTime currentDateTime, final l<? super n20.a, i0> dispatchAction) {
        int i15;
        boolean zE = documentStatus.e();
        List<KeyValueData> listI = I(localDocumentData.getScope().c(), zE, localDocumentData.getUserDocumentData().getFirstName(), localDocumentData.getUserDocumentData().getSecondName(), localDocumentData.getUserDocumentData().getSurname(), localDocumentData.getUserDocumentData().getPesel());
        Label labelD = mx.b.d(this.dateFormatter.d(new fz.b.Long(localDocumentData.getScope().getLastUpdate()), fz.c.DOTTED), "lastUpdate");
        List<n50.k> listF = F(localDocumentData.getScope().b(), additionalParametersBitmaps, showBottomSheet, hideBottomSheet);
        Label labelS = s(currentDateTime);
        DocumentLogoScreenData documentLogoScreenData = new DocumentLogoScreenData(localDocumentData.getScope().getDocumentName(), localDocumentData.getScope().getAdditionalDescription(), documentLogoBitmap);
        cr3.c templateType = localDocumentData.getScope().getTemplateType();
        int[] iArr = c.f76598b;
        int i16 = iArr[templateType.ordinal()];
        if (i16 != 1) {
            i15 = i16 != 2 ? c20.b.f22692l2 : yq3.a.f228715a;
        } else {
            i15 = yq3.a.f228716b;
        }
        int i17 = iArr[localDocumentData.getScope().getTemplateType().ordinal()];
        Integer numValueOf = (i17 == 1 || i17 == 2) ? null : Integer.valueOf(c20.b.f22696m2);
        mu.g<Float> gVarW = this.accelerometerManager.w();
        d dVar = new d(localDocumentData);
        Label labelC = zE ? this.labelProvider.c(yq3.b.f228729m) : this.labelProvider.c(yq3.b.f228727k);
        DocumentGiloshData.a aVar = new DocumentGiloshData.a(listI);
        cr3.c templateType2 = localDocumentData.getScope().getTemplateType();
        if (!(templateType2 == cr3.c.PZPN)) {
            templateType2 = null;
        }
        return new WruDocumentScreenData(labelS, documentLogoScreenData, new DocumentMainCardScreenData(i15, numValueOf, userPhotoBitmap, gVarW, dVar, zE, labelC, aVar, templateType2 != null ? Color.m0boximpl(Color.INSTANCE.i()) : null, r(animationsState), q(animationsState), new er.a() { // from class: gr3.d
            @Override // er.a
            public final Object a() {
                return k.K(dispatchAction);
            }
        }, null), new ShortcutsLayoutData(pq.v.s(new SmallCardData(null, this.labelProvider.c(yq3.b.f228730n), null, jz.a.f106785h1, o50.f.c.f142478a, false, new er.a() { // from class: gr3.e
            @Override // er.a
            public final Object a() {
                return k.L(onVerifyButtonClick, localDocumentData, this, onRefreshDocument);
            }
        }, 37, null), new SmallCardData(null, this.labelProvider.c(yq3.b.f228726j), null, jz.a.f106727a, o50.f.b.f142477a, false, onShowDeletionDialog, 37, null)), new ShortcutMoreData(this.labelProvider.c(yq3.b.f228731o), new l() { // from class: gr3.f
            @Override // er.l
            public final Object b(Object obj) {
                return k.M((List) obj);
            }
        })), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yq3.b.f228728l), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(labelD, null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(yq3.b.f228722f), this.labelProvider.c(yq3.b.f228718b)), k30.d.a.f107773a, null, onRefreshDocument, 35, null)), null, 2815, null), new DocumentAdditionalSectionData(this.labelProvider.c(yq3.b.f228736t), new CardListData(listF, null, false, null, null, 30, null)), c70.a.f23835a.a().m(), this.labelProvider.c(yq3.b.f228725i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(l lVar) {
        lVar.b(y20.a.f223428a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(p pVar, WruDocumentData wruDocumentData, k kVar, er.a aVar) {
        pVar.B(Integer.valueOf(wruDocumentData.getScope().getLicenceCode()), kVar.wruDialogMapper.b(new gr3.c.Refresh(aVar)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(List list) {
        return i0.f148189a;
    }

    private final List<WruDocumentItem> N(List<WruDocumentItem> commonParameters) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        List<WruDocumentItem> list = commonParameters;
        Iterator<T> it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(((WruDocumentItem) next).getType(), "NAME"));
        WruDocumentItem wruDocumentItem = (WruDocumentItem) next;
        Iterator<T> it4 = list.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!t.c(((WruDocumentItem) next2).getType(), "SURNAME"));
        WruDocumentItem wruDocumentItem2 = (WruDocumentItem) next2;
        Iterator<T> it5 = list.iterator();
        do {
            if (!it5.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it5.next();
        } while (!t.c(((WruDocumentItem) next3).getType(), "PESEL"));
        WruDocumentItem wruDocumentItem3 = (WruDocumentItem) next3;
        Iterator<T> it6 = list.iterator();
        do {
            if (!it6.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it6.next();
        } while (!t.c(((WruDocumentItem) next4).getType(), "VALID_TO"));
        WruDocumentItem wruDocumentItem4 = (WruDocumentItem) next4;
        for (Object obj2 : list) {
            if (t.c(((WruDocumentItem) obj2).getType(), "DOCUMENT_NUMBER")) {
                obj = obj2;
                break;
            }
        }
        return pq.v.s(wruDocumentItem, wruDocumentItem2, wruDocumentItem3, wruDocumentItem4, (WruDocumentItem) obj);
    }

    private final Label q(y20.b bVar) {
        Label labelC;
        if (bVar instanceof y20.b.AnimationsDisabled) {
            labelC = this.labelProvider.c(yq3.b.f228724h);
        } else {
            if (!(bVar instanceof y20.b.AnimationsEnabled)) {
                throw new oq.p();
            }
            labelC = this.labelProvider.c(yq3.b.f228723g);
        }
        if (bVar.getToggleEnabled()) {
            return labelC;
        }
        return null;
    }

    private final boolean r(y20.b bVar) {
        return bVar instanceof y20.b.AnimationsEnabled;
    }

    private final Label s(OffsetDateTime currentDateTime) {
        return this.labelProvider.e(yq3.b.f228732p, this.dateFormatter.d(new fz.b.OffsetDateTime(currentDateTime), fz.c.DOTTED_TIME_PLUS_DATE));
    }

    private final DefaultSingleCardData u(Label label, Label info) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(info, null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(label, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params, int i15, DialogData dialogData) {
        params.f().B(Integer.valueOf(i15), dialogData);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, hr3.e eVar) {
        params.g().b(eVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public fr3.d.a b(final Params params) {
        Label labelN;
        fr3.c cVarD = params.h().d();
        if (t.c(cVarD, fr3.c.a.f66586a) || (cVarD instanceof fr3.c.C1487c)) {
            return fr3.d.a.C1488a.f66596a;
        }
        if (!(cVarD instanceof fr3.c.Initialized)) {
            throw new oq.p();
        }
        fr3.c.Initialized initialized = (fr3.c.Initialized) cVarD;
        String shortName = initialized.getShortName();
        if (shortName == null || (labelN = mx.b.b(shortName, "title")) == null) {
            labelN = this.labelProvider.c(yq3.b.f228737u).n("title");
        }
        return new fr3.d.a.Initialized(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), labelN, null, null, null, 28, null), null, null, null, null, 61, null), new ModalBottomSheetData(new ModalSheetState(initialized.getIsBottomSheetVisible() ? v.EXPANDED : v.HIDDEN, false, new l() { // from class: gr3.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.E(params, (v) obj);
            }
        }, 2, null), this.labelProvider.c(yq3.b.f228717a), null, null, 12, null), J(initialized.getLocalDocumentData(), params.h().getAnimationsState(), initialized.getDocumentStatus(), initialized.getDocumentLogoBitmap(), initialized.getUserPhotoBitmap(), initialized.getAdditionalParametersBitmaps(), new p() { // from class: gr3.h
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return k.x(params, ((Integer) obj).intValue(), (DialogData) obj2);
            }
        }, params.d(), params.e(), new l() { // from class: gr3.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.z(params, (hr3.e) obj);
            }
        }, params.b(), initialized.getCurrentDateTime(), params.a()), params.c());
    }
}
