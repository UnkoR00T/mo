package le0;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import e20.k;
import er.l;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import g70.ShortcutMoreData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import ie0.UutCardData;
import ie0.UutCardDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l60.KeyValueData;
import me0.UutCardBottomSheetData;
import mx.Label;
import n20.State;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import ne0.p;
import ne0.q;
import o20.BaseDocumentData;
import o20.DocumentGiloshData;
import o20.s2;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import y30.n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lle0/h;", "Lxw/f;", "Lle0/h$a;", "Lne0/q$a;", "Lmx/c;", "labelProvider", "Lp20/c;", "giloshMapper", "Lez/e;", "dateFormatter", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "<init>", "(Lmx/c;Lp20/c;Lez/e;Lrz/a;Liy/a;)V", "Lie0/c;", "data", "", "Ll60/c;", "r", "(Lie0/c;)Ljava/util/List;", "params", "Lcb4/d;", "q", "(Lle0/h$a;)Lcb4/d;", "s", "Lmx/a;", "title", "value", "Ln50/g;", "I", "(Lmx/a;Lmx/a;)Ln50/g;", "u", "(Lle0/h$a;)Lne0/q$a;", "a", "Lmx/c;", "b", "Lp20/c;", "c", "Lez/e;", "d", "Lrz/a;", "e", "Liy/a;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, q.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: le0.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b.\u0010-R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b2\u0010-R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u00101R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b5\u0010-R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b7\u00101R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b$\u0010-¨\u00068"}, d2 = {"Lle0/h$a;", "", "Ln20/b;", "Lne0/p;", "state", "Lo20/s2;", "documentVMS", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Ly30/n$b$b;", "onSwitchItemChangedAction", "Lme0/d;", "onShowQrCodeClicked", "onBottomSheetClose", "Lie0/d;", "onSelectedDocument", "onDeleteDocumentClicked", "", "onVerificationAction", "onUpdateAction", "Lcb4/d;", "showDialog", "closeDialog", "<init>", "(Ln20/b;Lo20/s2;Ler/a;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;Ler/l;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "l", "()Ln20/b;", "b", "Lo20/s2;", "()Lo20/s2;", "c", "Ler/a;", "()Ler/a;", "d", "Ler/l;", "h", "()Ler/l;", "e", "g", "f", "i", "j", "k", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<p> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n.Switch.EnumC5973b, i0> onSwitchItemChangedAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<UutCardBottomSheetData, i0> onShowQrCodeClicked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBottomSheetClose;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<UutCardDocument, i0> onSelectedDocument;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteDocumentClicked;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onVerificationAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onUpdateAction;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DialogData, i0> showDialog;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeDialog;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<p> state, s2 s2Var, er.a<i0> aVar, l<? super n.Switch.EnumC5973b, i0> lVar, l<? super UutCardBottomSheetData, i0> lVar2, er.a<i0> aVar2, l<? super UutCardDocument, i0> lVar3, er.a<i0> aVar3, l<? super String, i0> lVar4, er.a<i0> aVar4, l<? super DialogData, i0> lVar5, er.a<i0> aVar5) {
            this.state = state;
            this.documentVMS = s2Var;
            this.onBackAction = aVar;
            this.onSwitchItemChangedAction = lVar;
            this.onShowQrCodeClicked = lVar2;
            this.onBottomSheetClose = aVar2;
            this.onSelectedDocument = lVar3;
            this.onDeleteDocumentClicked = aVar3;
            this.onVerificationAction = lVar4;
            this.onUpdateAction = aVar4;
            this.showDialog = lVar5;
            this.closeDialog = aVar5;
        }

        public final er.a<i0> a() {
            return this.closeDialog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final er.a<i0> d() {
            return this.onBottomSheetClose;
        }

        public final er.a<i0> e() {
            return this.onDeleteDocumentClicked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.documentVMS, params.documentVMS) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onSwitchItemChangedAction, params.onSwitchItemChangedAction) && t.c(this.onShowQrCodeClicked, params.onShowQrCodeClicked) && t.c(this.onBottomSheetClose, params.onBottomSheetClose) && t.c(this.onSelectedDocument, params.onSelectedDocument) && t.c(this.onDeleteDocumentClicked, params.onDeleteDocumentClicked) && t.c(this.onVerificationAction, params.onVerificationAction) && t.c(this.onUpdateAction, params.onUpdateAction) && t.c(this.showDialog, params.showDialog) && t.c(this.closeDialog, params.closeDialog);
        }

        public final l<UutCardDocument, i0> f() {
            return this.onSelectedDocument;
        }

        public final l<UutCardBottomSheetData, i0> g() {
            return this.onShowQrCodeClicked;
        }

        public final l<n.Switch.EnumC5973b, i0> h() {
            return this.onSwitchItemChangedAction;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.state.hashCode() * 31) + this.documentVMS.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onSwitchItemChangedAction.hashCode()) * 31) + this.onShowQrCodeClicked.hashCode()) * 31) + this.onBottomSheetClose.hashCode()) * 31) + this.onSelectedDocument.hashCode()) * 31) + this.onDeleteDocumentClicked.hashCode()) * 31) + this.onVerificationAction.hashCode()) * 31) + this.onUpdateAction.hashCode()) * 31) + this.showDialog.hashCode()) * 31) + this.closeDialog.hashCode();
        }

        public final er.a<i0> i() {
            return this.onUpdateAction;
        }

        public final l<String, i0> j() {
            return this.onVerificationAction;
        }

        public final l<DialogData, i0> k() {
            return this.showDialog;
        }

        public final State<p> l() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", documentVMS=" + this.documentVMS + ", onBackAction=" + this.onBackAction + ", onSwitchItemChangedAction=" + this.onSwitchItemChangedAction + ", onShowQrCodeClicked=" + this.onShowQrCodeClicked + ", onBottomSheetClose=" + this.onBottomSheetClose + ", onSelectedDocument=" + this.onSelectedDocument + ", onDeleteDocumentClicked=" + this.onDeleteDocumentClicked + ", onVerificationAction=" + this.onVerificationAction + ", onUpdateAction=" + this.onUpdateAction + ", showDialog=" + this.showDialog + ", closeDialog=" + this.closeDialog + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f117971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f117972b;

        static {
            int[] iArr = new int[ie0.a.values().length];
            try {
                iArr[ie0.a.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f117971a = iArr;
            int[] iArr2 = new int[v.values().length];
            try {
                iArr2[v.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[v.HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[v.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f117972b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f117973a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(614145730);
            if (p076m2.t.k()) {
                p076m2.t.o(614145730, i15, -1, "pl.gov.coi.mjunior.feature.uutcard.presentation.mapper.UutCardMapper.invoke.<anonymous> (UutCardMapper.kt:122)");
            }
            long jE = Color.INSTANCE.e();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jE);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f117974a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(2133630193);
            if (p076m2.t.k()) {
                p076m2.t.o(2133630193, i15, -1, "pl.gov.coi.mjunior.feature.uutcard.presentation.mapper.UutCardMapper.invoke.<anonymous> (UutCardMapper.kt:130)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jC);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f117975a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(-1903030753);
            if (p076m2.t.k()) {
                p076m2.t.o(-1903030753, i15, -1, "pl.gov.coi.mjunior.feature.uutcard.presentation.mapper.UutCardMapper.invoke.<anonymous> (UutCardMapper.kt:140)");
            }
            long jI = Color.INSTANCE.i();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jI);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f117976a = new f();

        f() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(1823964320);
            if (p076m2.t.k()) {
                p076m2.t.o(1823964320, i15, -1, "pl.gov.coi.mjunior.feature.uutcard.presentation.mapper.UutCardMapper.invoke.<anonymous> (UutCardMapper.kt:141)");
            }
            long jI = Color.INSTANCE.i();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(jI);
        }
    }

    public h(mx.c cVar, p20.c cVar2, ez.e eVar, rz.a aVar, iy.a aVar2) {
        this.labelProvider = cVar;
        this.giloshMapper = cVar2;
        this.dateFormatter = eVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(p pVar, Params params, h hVar) {
        p.Initialized initialized = (p.Initialized) pVar;
        if (b.f117971a[initialized.getSelectedCard().getDocumentStatus().ordinal()] == 1) {
            params.j().b(initialized.getSelectedCard().getScopeData().getData().getNumber());
        } else {
            params.k().b(hVar.s(params));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params, h hVar) {
        params.k().b(hVar.q(params));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(Params params, UutCardDocument uutCardDocument) {
        params.f().b(uutCardDocument);
        return i0.f148189a;
    }

    private final DefaultSingleCardData I(Label title, Label value) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(title, null, null, 3, null), new n50.b.Title(n50.l.b(value, null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
    }

    private final DialogData q(Params params) {
        cb4.h.b bVar = cb4.h.b.f24985a;
        mx.c cVar = this.labelProvider;
        return new DialogData(bVar, cVar.e(ge0.a.f72048w, cVar.c(ge0.a.f72049x).getText()), this.labelProvider.c(ge0.a.f72047v), new DialogButtonTextData(this.labelProvider.c(ge0.a.f72030e), null, params.e(), 2, null), new DialogButtonTextData(this.labelProvider.c(ge0.a.f72028c), null, params.a(), 2, null), null, null, 96, null);
    }

    private final List<KeyValueData> r(UutCardData data) {
        String strR = data.r();
        Locale locale = Locale.ROOT;
        KeyValueData keyValueData = new KeyValueData(mx.b.b(strR.toUpperCase(locale), "names"), this.labelProvider.c(ge0.a.f72041p), false, 4, null);
        String lastName = data.getLastName();
        KeyValueData keyValueData2 = new KeyValueData(mx.b.d(lastName != null ? lastName.toUpperCase(locale) : null, "lastName"), this.labelProvider.c(ge0.a.f72043r), false, 4, null);
        KeyValueData keyValueData3 = new KeyValueData(mx.b.b(data.getOuCategory().toUpperCase(locale), "ouCategory"), this.labelProvider.c(ge0.a.E), false, 4, null);
        KeyValueData keyValueData4 = new KeyValueData(mx.b.b(data.getTrainClass(), "trainClass"), this.labelProvider.c(ge0.a.M), false, 4, null);
        KeyValueData keyValueData5 = new KeyValueData(mx.b.d(data.getConcession(), "concession"), this.labelProvider.c(ge0.a.F), false, 4, null);
        i0 i0Var = i0.f148189a;
        return pq.v.q(keyValueData, keyValueData2, keyValueData3, keyValueData4, keyValueData5, new KeyValueData(mx.b.b(data.getBatch() + data.getNumber(), "batchNumber"), this.labelProvider.c(ge0.a.J), false, 4, null), new KeyValueData(mx.b.b(this.dateFormatter.d(new fz.b.String(data.getExpiryDate(), fz.c.BLANK_REVERSED, false, 4, null), fz.c.DOTTED), "expirationDate"), this.labelProvider.c(ge0.a.I), false, 4, null));
    }

    private final DialogData s(Params params) {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(ge0.a.f72046u), this.labelProvider.c(ge0.a.f72045t), new DialogButtonTextData(this.labelProvider.c(ge0.a.f72032g), null, params.i(), 2, null), new DialogButtonTextData(this.labelProvider.c(ge0.a.f72028c), null, params.a(), 2, null), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(n20.a aVar) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params, v vVar) {
        int i15 = b.f117972b[vVar.ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                throw new oq.p();
            }
            params.d().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, Bitmap bitmap, h hVar) {
        params.g().b(new UutCardBottomSheetData(bitmap, hVar.labelProvider.c(ge0.a.f72029d), params.d()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public q.a b(final Params params) {
        Object objB;
        final p pVarD = params.l().d();
        if ((pVarD instanceof p.Initial) || (pVarD instanceof p.DeleteDocument) || (pVarD instanceof p.Updating)) {
            return q.a.b.f135044a;
        }
        if (!(pVarD instanceof p.Initialized)) {
            if (pVarD instanceof p.b) {
                return new q.a.Error(((p.b) pVarD).getErrorVMSAdapter());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(ge0.a.f72050y), null, null, null, 28, null), null, null, null, null, 61, null);
        p.Initialized initialized = (p.Initialized) pVarD;
        n.Switch r15 = (initialized.g().isEmpty() || !initialized.getSelectedCard().getScopeData().getData().q()) ? null : new n.Switch(new n.Switch.TabItem(this.labelProvider.c(ge0.a.O), n.Switch.EnumC5973b.LEFT), new n.Switch.TabItem(this.labelProvider.c(ge0.a.N), n.Switch.EnumC5973b.RIGHT), initialized.getSelectedItem(), false, params.h(), 8, null);
        p20.c cVar = this.giloshMapper;
        List listQ = pq.v.q(new u2.Flag(k.Poland, this.labelProvider.c(ge0.a.f72035j)), new u2.Hologram(null, c.f117973a, 1, null));
        State<p> stateL = params.l();
        o20.p.q0 q0Var = o20.p.q0.f140935c;
        Bitmap imageBitmap = initialized.getSelectedCard().getScopeData().getData().q() ? initialized.getImageBitmap() : null;
        Label labelC = this.labelProvider.c(ge0.a.f72042q);
        d dVar = d.f117974a;
        Color colorM0boximpl = Color.m0boximpl(Color.INSTANCE.g());
        ie0.a documentStatus = initialized.getSelectedCard().getDocumentStatus();
        ie0.a aVar = ie0.a.ACTIVE;
        DocumentGiloshData documentGiloshDataB = cVar.b(new p20.c.Params(listQ, stateL, q0Var, imageBitmap, labelC, dVar, colorM0boximpl, documentStatus == aVar, b.f117971a[initialized.getSelectedCard().getDocumentStatus().ordinal()] == 1 ? this.labelProvider.c(ge0.a.f72040o) : this.labelProvider.c(ge0.a.f72037l), this.labelProvider.c(ge0.a.f72033h), params.i(), r(initialized.getSelectedCard().getScopeData().getData()), e.f117975a, f.f117976a, new l() { // from class: le0.a
            @Override // er.l
            public final Object b(Object obj) {
                return h.v((n20.a) obj);
            }
        }, params.getDocumentVMS(), null));
        rz.a aVar2 = this.bitmapDecoder;
        dx.i iVarC = iy.a.c(this.base64Coder, initialized.getSelectedCard().getScopeData().getData().getQrCode(), null, 2, null);
        if (iVarC instanceof dx.i.Left) {
            objB = new byte[0];
        } else {
            if (!(iVarC instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB = ((dx.i.Right) iVarC).b();
        }
        final Bitmap bitmapA = aVar2.a((byte[]) objB);
        BaseDocumentData baseDocumentData = new BaseDocumentData(null, null, null, documentGiloshDataB, pq.v.s(new o20.l.SingleCardImageButton(bitmapA, this.labelProvider.c(ge0.a.K), new er.a() { // from class: le0.b
            @Override // er.a
            public final Object a() {
                return h.z(params, bitmapA, this);
            }
        }), new o20.l.Shortcuts(new ShortcutsLayoutData(pq.v.s(new SmallCardData(null, this.labelProvider.c(ge0.a.f72044s), null, jz.a.f106785h1, o50.f.c.f142478a, false, new er.a() { // from class: le0.c
            @Override // er.a
            public final Object a() {
                return h.E(pVarD, params, this);
            }
        }, 37, null), initialized.getSelectedCard().getScopeData().getData().q() ? new SmallCardData(null, this.labelProvider.c(ge0.a.f72036k), null, jz.a.f106727a, o50.f.b.f142477a, false, new er.a() { // from class: le0.d
            @Override // er.a
            public final Object a() {
                return h.F(params, this);
            }
        }, 37, null) : null), new ShortcutMoreData(Label.INSTANCE.c(), new l() { // from class: le0.e
            @Override // er.l
            public final Object b(Object obj) {
                return h.G((List) obj);
            }
        }))), new o20.l.Section(null, pq.v.s(I(this.labelProvider.c(ge0.a.H), mx.b.b(initialized.getSelectedCard().getScopeData().getData().getEmployer(), "employer")), I(this.labelProvider.c(ge0.a.G), mx.b.b(initialized.getSelectedCard().getScopeData().getData().getEmployerCode(), "employerCode"))), 1, null), new o20.l.UpdateDataItem(this.labelProvider.c(ge0.a.f72038m), mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(initialized.getSelectedCard().getScopeData().getHeader().getTs()), fz.c.DOTTED), "lastUpdateValue"), (initialized.getSelectedCard().getScopeData().getData().q() && initialized.getSelectedCard().getDocumentStatus() == aVar) ? this.labelProvider.c(ge0.a.f72039n) : null, null, params.i(), 8, null)), null, pq.v.e(new c30.b.c(null, null, null, this.labelProvider.c(ge0.a.L), null, null, null, 119, null)), 39, null);
        List<UutCardDocument> listG = initialized.g();
        ArrayList arrayList = new ArrayList(pq.v.y(listG, 10));
        for (final UutCardDocument uutCardDocument : listG) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: le0.f
                @Override // er.a
                public final Object a() {
                    return h.H(params, uutCardDocument);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(uutCardDocument.getScopeData().getData().a(), "fullName"), null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null));
        }
        return new q.a.Initialized(baseScaffoldData, r15, baseDocumentData, arrayList, new ModalBottomSheetData(new ModalSheetState(initialized.getBottomSheetValue(), false, new l() { // from class: le0.g
            @Override // er.l
            public final Object b(Object obj) {
                return h.x(params, (v) obj);
            }
        }, 2, null), this.labelProvider.c(ge0.a.f72025a), null, null, 12, null), initialized.getBottomSheetContentData(), initialized.getDialogVMSAdapter(), params.c());
    }
}
