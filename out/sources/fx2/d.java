package fx2;

import dx2.State;
import er.l;
import fr.k;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Set;
import mx.Label;
import n40.FilePickerData;
import n40.e;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.e1;
import wx.i;
import x50.NavigationButtonData;
import xw.f;
import z30.FileBottomSheetItemData;
import zz.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001c\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000f*\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lfx2/d;", "Lxw/f;", "Lfx2/d$b;", "Ldx2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lzz/h;", "Lkotlin/Function1;", "Ldx3/a;", "Loq/i0;", "onImageClick", "Lkotlin/Function0;", "onDeleteFile", "Ln40/i;", "q", "(Lzz/h;Ler/l;Ler/a;)Ln40/i;", "params", "i", "(Lfx2/d$b;)Ldx2/c$a;", "a", "Lmx/c;", "Lwx/i;", "Lmx/a;", "h", "(Lwx/i;)Lmx/a;", "sizeInReadableFormat", "b", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, dx2.c.Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f68680b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f68681c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<wx.d> f68682d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfx2/d$a;", "", "<init>", "()V", "", "MAX_ALLOWED_FILES", "I", "", "PICKER_FILE_TITLE_TAG", "Ljava/lang/String;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: fx2.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b'\u0010*R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010*R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b+\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b\u001e\u0010*R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b%\u0010*¨\u0006-"}, d2 = {"Lfx2/d$b;", "", "Ldx2/b;", "state", "Lkotlin/Function1;", "Lg30/v;", "Loq/i0;", "onBottomSheetStateChanged", "Lcx2/a;", "onPickerActionSelected", "Ldx3/a;", "onImageClick", "Lkotlin/Function0;", "onDeleteFileClick", "onScrolledToPicker", "onNextButtonClick", "onBack", "onClose", "<init>", "(Ldx2/b;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx2/b;", "i", "()Ldx2/b;", "b", "Ler/l;", "()Ler/l;", "c", "g", "d", "e", "Ler/a;", "()Ler/a;", "f", "h", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onBottomSheetStateChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<cx2.a, i0> onPickerActionSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<dx3.a, i0> onImageClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteFileClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToPicker;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super v, i0> lVar, l<? super cx2.a, i0> lVar2, l<? super dx3.a, i0> lVar3, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = state;
            this.onBottomSheetStateChanged = lVar;
            this.onPickerActionSelected = lVar2;
            this.onImageClick = lVar3;
            this.onDeleteFileClick = aVar;
            this.onScrolledToPicker = aVar2;
            this.onNextButtonClick = aVar3;
            this.onBack = aVar4;
            this.onClose = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<v, i0> b() {
            return this.onBottomSheetStateChanged;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        public final er.a<i0> d() {
            return this.onDeleteFileClick;
        }

        public final l<dx3.a, i0> e() {
            return this.onImageClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged) && t.c(this.onPickerActionSelected, params.onPickerActionSelected) && t.c(this.onImageClick, params.onImageClick) && t.c(this.onDeleteFileClick, params.onDeleteFileClick) && t.c(this.onScrolledToPicker, params.onScrolledToPicker) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final er.a<i0> f() {
            return this.onNextButtonClick;
        }

        public final l<cx2.a, i0> g() {
            return this.onPickerActionSelected;
        }

        public final er.a<i0> h() {
            return this.onScrolledToPicker;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onBottomSheetStateChanged.hashCode()) * 31) + this.onPickerActionSelected.hashCode()) * 31) + this.onImageClick.hashCode()) * 31) + this.onDeleteFileClick.hashCode()) * 31) + this.onScrolledToPicker.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onPickerActionSelected=" + this.onPickerActionSelected + ", onImageClick=" + this.onImageClick + ", onDeleteFileClick=" + this.onDeleteFileClick + ", onScrolledToPicker=" + this.onScrolledToPicker + ", onNextButtonClick=" + this.onNextButtonClick + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    static {
        wx.d.Companion companion = wx.d.INSTANCE;
        f68682d = e1.i(wx.d.j0(companion.J()), wx.d.j0(companion.v()), wx.d.j0(companion.u()), wx.d.j0(companion.K()));
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label h(i iVar) {
        return this.labelProvider.e(gv2.a.C, t04.a.c(iVar.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, cx2.a aVar) {
        params.g().b(aVar);
        params.b().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.b().b(v.EXPANDED);
        return i0.f148189a;
    }

    private final n40.i q(final h hVar, final l<? super dx3.a, i0> lVar, er.a<i0> aVar) {
        if (hVar instanceof h.Image) {
            h.Image image = (h.Image) hVar;
            return new n40.i.Image(mx.b.b(image.a().getMetadata().getName(), "fileTitle"), h(image.a()), aVar, new er.a() { // from class: fx2.a
                @Override // er.a
                public final Object a() {
                    return d.r(lVar, this, hVar);
                }
            }, new n40.i.Image.AbstractC3255a.Image(image.getThumbnail()));
        }
        if (!(hVar instanceof h.Regular)) {
            throw new p();
        }
        h.Regular regular = (h.Regular) hVar;
        return new n40.i.Regular(mx.b.b(regular.a().getMetadata().getName(), "fileTitle"), h(regular.a()), null, aVar, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(l lVar, d dVar, h hVar) {
        lVar.b(new dx3.a.Content(dVar.labelProvider.c(gv2.a.f77293o2), ((h.Image) hVar).a().getFileContent()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public dx2.c.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gv2.a.L1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(params.getState().getBottomSheetValue(), false, params.b(), 2, null), null, null, null, 14, null);
        wq.a<cx2.a> aVarE = cx2.a.e();
        ArrayList arrayList = new ArrayList(pq.v.y(aVarE, 10));
        for (final cx2.a aVar : aVarE) {
            arrayList.add(new FileBottomSheetItemData(aVar.getIconResId(), this.labelProvider.c(aVar.getLabelResId()), new er.a() { // from class: fx2.b
                @Override // er.a
                public final Object a() {
                    return d.l(params, aVar);
                }
            }));
        }
        Label labelC = this.labelProvider.c(gv2.a.M1);
        Label labelC2 = this.labelProvider.c(gv2.a.K1);
        Label labelC3 = this.labelProvider.c(gv2.a.f77330y);
        boolean isValid = params.getState().getIsValid();
        Boolean boolValueOf = Boolean.valueOf(isValid);
        if (isValid) {
            boolValueOf = null;
        }
        Label labelC4 = boolValueOf != null ? this.labelProvider.c(gv2.a.B) : null;
        h pickedFile = params.getState().getPickedFile();
        return new dx2.c.Data(baseScaffoldData, modalBottomSheetData, arrayList, labelC, labelC2, new FilePickerData(labelC3, labelC4, pq.v.r(pickedFile != null ? q(pickedFile, params.e(), params.d()) : null), pq.v.q(new e.AllowedFormats(f68682d), new e.b.File(nv2.a.b(), null)), new er.a() { // from class: fx2.c
            @Override // er.a
            public final Object a() {
                return d.m(params);
            }
        }, 1), params.getState().getScrollToPicker(), params.h(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gv2.a.I), null, 2, null), k30.d.a.f107773a, null, params.f(), 35, null), params.a());
    }
}
