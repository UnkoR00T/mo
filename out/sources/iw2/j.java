package iw2;

import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import gw2.State;
import gw2.UploaderState;
import gw2.o;
import gw2.p;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;
import pq.v0;
import wx.FileContent;
import x50.NavigationButtonData;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00022*B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJq\u0010\u0019\u001a\u00020\u0018*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001f\u001a\u00020\u001e*\u00020\u001b2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020\u0010*\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0$*\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u00020,*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0018\u00101\u001a\u00020,*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u00063"}, d2 = {"Liw2/j;", "Lxw/f;", "Liw2/j$b;", "Lgw2/p$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lgw2/l;", "Lg30/v;", "I", "(Lgw2/l;)Lg30/v;", "Lgw2/n;", "Lgw2/o;", "type", "Lkotlin/Function2;", "Lmx/a;", "Lwx/c;", "Loq/i0;", "onImageClick", "Lkotlin/Function1;", "onDeleteFileClicked", "onAddFileClick", "onBringIntoViewRequestHandled", "Lgw2/p$b;", "M", "(Lgw2/n;Lgw2/o;Ler/p;Ler/l;Ler/l;Ler/l;)Lgw2/p$b;", "Lzz/h;", "Lkotlin/Function0;", "onDeleteFile", "Ln40/i;", "J", "(Lzz/h;Ler/p;Ler/a;)Ln40/i;", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(F)Lmx/a;", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ln40/i;)Ljava/util/List;", "params", "v", "(Liw2/j$b;)Lgw2/p$a;", "a", "Lmx/c;", "", "u", "(Lgw2/o;)I", "titleResId", "s", "descriptionResId", "b", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, p.Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f97449b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f97450c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<wx.d> f97451d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liw2/j$a;", "", "<init>", "()V", "", "MAX_ALLOWED_FILES", "I", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: iw2.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\t\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b)\u0010,R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b%\u0010,R)\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b1\u0010(R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b!\u00100R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b-\u00100¨\u00062"}, d2 = {"Liw2/j$b;", "", "Lgw2/m;", "state", "Lkotlin/Function2;", "Lmx/a;", "Lwx/c;", "Loq/i0;", "onImageClick", "Lkotlin/Function1;", "Lgw2/o;", "onDeleteFileClick", "Lkotlin/Function0;", "onNextButtonClick", "onBringIntoViewRequestHandled", "Lgw2/l;", "onBottomSheetStateChanged", "Lcx2/a;", "onPickerActionSelected", "onBack", "onClose", "<init>", "(Lgw2/m;Ler/p;Ler/l;Ler/a;Ler/l;Ler/l;Ler/p;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgw2/m;", "i", "()Lgw2/m;", "b", "Ler/p;", "f", "()Ler/p;", "c", "Ler/l;", "e", "()Ler/l;", "d", "Ler/a;", "g", "()Ler/a;", "h", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<Label, FileContent, i0> onImageClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<o, i0> onDeleteFileClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<o, i0> onBringIntoViewRequestHandled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<gw2.l, i0> onBottomSheetStateChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<o, cx2.a, i0> onPickerActionSelected;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.p<? super Label, ? super FileContent, i0> pVar, er.l<? super o, i0> lVar, er.a<i0> aVar, er.l<? super o, i0> lVar2, er.l<? super gw2.l, i0> lVar3, er.p<? super o, ? super cx2.a, i0> pVar2, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onImageClick = pVar;
            this.onDeleteFileClick = lVar;
            this.onNextButtonClick = aVar;
            this.onBringIntoViewRequestHandled = lVar2;
            this.onBottomSheetStateChanged = lVar3;
            this.onPickerActionSelected = pVar2;
            this.onBack = aVar2;
            this.onClose = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.l<gw2.l, i0> b() {
            return this.onBottomSheetStateChanged;
        }

        public final er.l<o, i0> c() {
            return this.onBringIntoViewRequestHandled;
        }

        public final er.a<i0> d() {
            return this.onClose;
        }

        public final er.l<o, i0> e() {
            return this.onDeleteFileClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onImageClick, params.onImageClick) && t.c(this.onDeleteFileClick, params.onDeleteFileClick) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onBringIntoViewRequestHandled, params.onBringIntoViewRequestHandled) && t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged) && t.c(this.onPickerActionSelected, params.onPickerActionSelected) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final er.p<Label, FileContent, i0> f() {
            return this.onImageClick;
        }

        public final er.a<i0> g() {
            return this.onNextButtonClick;
        }

        public final er.p<o, cx2.a, i0> h() {
            return this.onPickerActionSelected;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onImageClick.hashCode()) * 31) + this.onDeleteFileClick.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onBringIntoViewRequestHandled.hashCode()) * 31) + this.onBottomSheetStateChanged.hashCode()) * 31) + this.onPickerActionSelected.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onImageClick=" + this.onImageClick + ", onDeleteFileClick=" + this.onDeleteFileClick + ", onNextButtonClick=" + this.onNextButtonClick + ", onBringIntoViewRequestHandled=" + this.onBringIntoViewRequestHandled + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onPickerActionSelected=" + this.onPickerActionSelected + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97462a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.COVERING_FACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.GLASSES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f97462a = iArr;
        }
    }

    static {
        wx.d.Companion companion = wx.d.INSTANCE;
        f97451d = e1.i(wx.d.j0(companion.J()), wx.d.j0(companion.v()), wx.d.j0(companion.u()), wx.d.j0(companion.K()));
    }

    public j(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, o oVar, cx2.a aVar) {
        params.h().B(oVar, aVar);
        params.b().b(gw2.l.a.f78005a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params, o oVar) {
        params.b().b(new gw2.l.Visible(oVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params params, o oVar) {
        params.b().b(new gw2.l.Visible(oVar));
        return i0.f148189a;
    }

    private final List<n40.i> H(n40.i iVar) {
        List<n40.i> listE;
        return (iVar == null || (listE = v.e(iVar)) == null) ? v.n() : listE;
    }

    private final g30.v I(gw2.l lVar) {
        if (t.c(lVar, gw2.l.a.f78005a)) {
            return g30.v.HIDDEN;
        }
        if (lVar instanceof gw2.l.Visible) {
            return g30.v.EXPANDED;
        }
        throw new oq.p();
    }

    private final n40.i J(final zz.h hVar, final er.p<? super Label, ? super FileContent, i0> pVar, er.a<i0> aVar) {
        if (hVar instanceof zz.h.Image) {
            zz.h.Image image = (zz.h.Image) hVar;
            return new n40.i.Image(mx.b.b(image.a().getMetadata().getName(), "fileTitle"), L(image.a().d()), aVar, new er.a() { // from class: iw2.d
                @Override // er.a
                public final Object a() {
                    return j.K(pVar, this, hVar);
                }
            }, new n40.i.Image.AbstractC3255a.Image(image.getThumbnail()));
        }
        if (!(hVar instanceof zz.h.Regular)) {
            throw new oq.p();
        }
        zz.h.Regular regular = (zz.h.Regular) hVar;
        return new n40.i.Regular(mx.b.b(regular.a().getMetadata().getName(), "fileTitle"), L(regular.a().d()), null, aVar, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(er.p pVar, j jVar, zz.h hVar) {
        pVar.B(jVar.labelProvider.c(gv2.a.f77293o2), ((zz.h.Image) hVar).a().getFileContent());
        return i0.f148189a;
    }

    private final Label L(float f15) {
        return this.labelProvider.e(gv2.a.C, t04.a.c(f15));
    }

    private final p.FilePickerSectionData M(UploaderState uploaderState, final o oVar, er.p<? super Label, ? super FileContent, i0> pVar, final er.l<? super o, i0> lVar, final er.l<? super o, i0> lVar2, final er.l<? super o, i0> lVar3) {
        mx.c cVar = this.labelProvider;
        Label labelC = cVar.c(u(oVar));
        Label labelC2 = cVar.c(s(oVar));
        Label labelC3 = cVar.c(gv2.a.f77330y);
        boolean isValid = uploaderState.getIsValid();
        Boolean boolValueOf = Boolean.valueOf(isValid);
        if (isValid) {
            boolValueOf = null;
        }
        Label labelC4 = boolValueOf != null ? cVar.c(gv2.a.B) : null;
        zz.h pickedFile = uploaderState.getPickedFile();
        return new p.FilePickerSectionData(labelC, labelC2, new FilePickerData(labelC3, labelC4, H(pickedFile != null ? J(pickedFile, pVar, new er.a() { // from class: iw2.a
            @Override // er.a
            public final Object a() {
                return j.N(lVar, oVar);
            }
        }) : null), v.q(new n40.e.AllowedFormats(f97451d), new n40.e.b.File(nv2.a.a(), null)), new er.a() { // from class: iw2.b
            @Override // er.a
            public final Object a() {
                return j.O(lVar2, oVar);
            }
        }, 1), uploaderState.getBringIntoViewRequest(), new er.a() { // from class: iw2.c
            @Override // er.a
            public final Object a() {
                return j.P(lVar3, oVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(er.l lVar, o oVar) {
        lVar.b(oVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(er.l lVar, o oVar) {
        lVar.b(oVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(er.l lVar, o oVar) {
        lVar.b(oVar);
        return i0.f148189a;
    }

    private final int s(o oVar) {
        int i15 = c.f97462a[oVar.ordinal()];
        if (i15 == 1) {
            return gv2.a.f77263h2;
        }
        if (i15 == 2) {
            return gv2.a.f77277k2;
        }
        throw new oq.p();
    }

    private final int u(o oVar) {
        int i15 = c.f97462a[oVar.ordinal()];
        if (i15 == 1) {
            return gv2.a.f77273j2;
        }
        if (i15 == 2) {
            return gv2.a.f77285m2;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params) {
        params.b().b(gw2.l.a.f78005a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, g30.v vVar) {
        if (vVar == g30.v.HIDDEN) {
            params.b().b(gw2.l.a.f78005a);
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public p.Data b(final Params params) {
        List listN;
        j jVar;
        p.FilePickerSectionData filePickerSectionDataM;
        final o uploaderType;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gv2.a.f77315u0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.d(), 6, null)), null, 20, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: iw2.e
            @Override // er.a
            public final Object a() {
                return j.x(params);
            }
        })), null, null, 53, null);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(I(params.getState().getBottomSheetState()), false, new er.l() { // from class: iw2.f
            @Override // er.l
            public final Object b(Object obj) {
                return j.z(params, (g30.v) obj);
            }
        }, 2, null), null, null, null, 14, null);
        gw2.l bottomSheetState = params.getState().getBottomSheetState();
        gw2.l.Visible visible = bottomSheetState instanceof gw2.l.Visible ? (gw2.l.Visible) bottomSheetState : null;
        if (visible == null || (uploaderType = visible.getUploaderType()) == null) {
            listN = null;
        } else {
            wq.a<cx2.a> aVarE = cx2.a.e();
            listN = new ArrayList(v.y(aVarE, 10));
            for (final cx2.a aVar : aVarE) {
                listN.add(new FileBottomSheetItemData(aVar.getIconResId(), this.labelProvider.c(aVar.getLabelResId()), new er.a() { // from class: iw2.g
                    @Override // er.a
                    public final Object a() {
                        return j.E(params, uploaderType, aVar);
                    }
                }));
            }
        }
        if (listN == null) {
            listN = v.n();
        }
        List list = listN;
        UploaderState coveringFaceState = params.getState().getCoveringFaceState();
        if (!coveringFaceState.getIsEnabled()) {
            coveringFaceState = null;
        }
        p.FilePickerSectionData filePickerSectionDataM2 = coveringFaceState != null ? M(coveringFaceState, o.COVERING_FACE, params.f(), params.e(), new er.l() { // from class: iw2.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.F(params, (o) obj);
            }
        }, params.c()) : null;
        UploaderState glassesState = params.getState().getGlassesState();
        UploaderState uploaderState = glassesState.getIsEnabled() ? glassesState : null;
        if (uploaderState != null) {
            jVar = this;
            filePickerSectionDataM = M(uploaderState, o.GLASSES, params.f(), params.e(), new er.l() { // from class: iw2.i
                @Override // er.l
                public final Object b(Object obj) {
                    return j.G(params, (o) obj);
                }
            }, params.c());
        } else {
            jVar = this;
            filePickerSectionDataM = null;
        }
        return new p.Data(baseScaffoldData, modalBottomSheetData, list, filePickerSectionDataM2, filePickerSectionDataM, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(jVar.labelProvider.c(gv2.a.I), null, 2, null), k30.d.a.f107773a, null, params.g(), 35, null), params.a());
    }
}
