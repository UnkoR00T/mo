package zu3;

import er.l;
import fr.k;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import oq.p;
import oq.y;
import p071kotlin.Metadata;
import pq.e1;
import pq.v0;
import pu3.ConfirmationDocumentData;
import pu3.ImagePreviewData;
import wx.i;
import x50.NavigationButtonData;
import yu3.h;
import yu3.q0;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\"\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000f*\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lzu3/e;", "Lxw/f;", "Lzu3/e$b;", "Lyu3/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lzz/h;", "Lkotlin/Function1;", "Lpu3/e;", "Loq/i0;", "onImageClick", "Lkotlin/Function0;", "onDeleteFile", "Ln40/i;", "u", "(Lzz/h;Ler/l;Ler/a;)Ln40/i;", "params", "m", "(Lzu3/e$b;)Lyu3/h$a;", "a", "Lmx/c;", "Lwx/i;", "Lmx/a;", "l", "(Lwx/i;)Lmx/a;", "sizeInReadableFormat", "Lpu3/a$a;", "", "Lwx/d;", "i", "(Lpu3/a$a;)Ljava/util/Set;", "combined", "b", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, h.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f237863b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f237864c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzu3/e$a;", "", "<init>", "()V", "", "PICKER_FILE_TITLE_TAG", "Ljava/lang/String;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: zu3.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b(\u0010+R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b,\u0010+R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b\u001e\u0010+R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b\"\u0010+R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b&\u0010+¨\u0006-"}, d2 = {"Lzu3/e$b;", "", "Lyu3/g;", "state", "Lkotlin/Function1;", "Lg30/v;", "Loq/i0;", "onToggleBottomSheet", "Lyu3/q0;", "onPickerAction", "Lpu3/e;", "onImageClick", "Lkotlin/Function0;", "onDeleteFile", "onScrolledToPicker", "backAction", "closeAction", "nextAction", "<init>", "(Lyu3/g;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyu3/g;", "i", "()Lyu3/g;", "b", "Ler/l;", "h", "()Ler/l;", "c", "f", "d", "e", "Ler/a;", "()Ler/a;", "g", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final yu3.g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onToggleBottomSheet;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<q0, i0> onPickerAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ImagePreviewData, i0> onImageClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteFile;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToPicker;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(yu3.g gVar, l<? super v, i0> lVar, l<? super q0, i0> lVar2, l<? super ImagePreviewData, i0> lVar3, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = gVar;
            this.onToggleBottomSheet = lVar;
            this.onPickerAction = lVar2;
            this.onImageClick = lVar3;
            this.onDeleteFile = aVar;
            this.onScrolledToPicker = aVar2;
            this.backAction = aVar3;
            this.closeAction = aVar4;
            this.nextAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final er.a<i0> c() {
            return this.nextAction;
        }

        public final er.a<i0> d() {
            return this.onDeleteFile;
        }

        public final l<ImagePreviewData, i0> e() {
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
            return t.c(this.state, params.state) && t.c(this.onToggleBottomSheet, params.onToggleBottomSheet) && t.c(this.onPickerAction, params.onPickerAction) && t.c(this.onImageClick, params.onImageClick) && t.c(this.onDeleteFile, params.onDeleteFile) && t.c(this.onScrolledToPicker, params.onScrolledToPicker) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction) && t.c(this.nextAction, params.nextAction);
        }

        public final l<q0, i0> f() {
            return this.onPickerAction;
        }

        public final er.a<i0> g() {
            return this.onScrolledToPicker;
        }

        public final l<v, i0> h() {
            return this.onToggleBottomSheet;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onToggleBottomSheet.hashCode()) * 31) + this.onPickerAction.hashCode()) * 31) + this.onImageClick.hashCode()) * 31) + this.onDeleteFile.hashCode()) * 31) + this.onScrolledToPicker.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.nextAction.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final yu3.g getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onToggleBottomSheet=" + this.onToggleBottomSheet + ", onPickerAction=" + this.onPickerAction + ", onImageClick=" + this.onImageClick + ", onDeleteFile=" + this.onDeleteFile + ", onScrolledToPicker=" + this.onScrolledToPicker + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ", nextAction=" + this.nextAction + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Set<wx.d> i(ConfirmationDocumentData.Formats formats) {
        Set<wx.f> setA = formats.a();
        ArrayList arrayList = new ArrayList(pq.v.y(setA, 10));
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            arrayList.add(((wx.f) it.next()).name().toLowerCase(Locale.ROOT));
        }
        return e1.l(wx.d.INSTANCE.a(arrayList), formats.b());
    }

    private final Label l(i iVar) {
        return this.labelProvider.e(ou3.a.f150173f, t04.a.c(iVar.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.h().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.h().b(v.EXPANDED);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, q0 q0Var) {
        params.f().b(q0Var);
        return i0.f148189a;
    }

    private final n40.i u(final zz.h hVar, final l<? super ImagePreviewData, i0> lVar, er.a<i0> aVar) {
        if (hVar instanceof zz.h.Image) {
            zz.h.Image image = (zz.h.Image) hVar;
            return new n40.i.Image(mx.b.b(image.a().getMetadata().getName(), "fileTitle"), l(image.a()), aVar, new er.a() { // from class: zu3.a
                @Override // er.a
                public final Object a() {
                    return e.v(lVar, this, hVar);
                }
            }, new n40.i.Image.AbstractC3255a.Image(image.getThumbnail()));
        }
        if (!(hVar instanceof zz.h.Regular)) {
            throw new p();
        }
        zz.h.Regular regular = (zz.h.Regular) hVar;
        return new n40.i.Regular(mx.b.b(regular.a().getMetadata().c(), "fileTitle"), l(regular.a()), null, aVar, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(l lVar, e eVar, zz.h hVar) {
        lVar.b(new ImagePreviewData(eVar.labelProvider.c(ou3.a.f150175h), ((zz.h.Image) hVar).a().getFileContent()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public h.a b(final Params params) {
        yu3.g state = params.getState();
        if (state instanceof yu3.e.FullScreen) {
            return new h.a.Error(((yu3.e.FullScreen) params.getState()).getVmsAdapter());
        }
        if (!(state instanceof yu3.g.c)) {
            throw new p();
        }
        yu3.g state2 = params.getState();
        yu3.e.Dialog dialog = state2 instanceof yu3.e.Dialog ? (yu3.e.Dialog) state2 : null;
        cb4.i vmsAdapter = dialog != null ? dialog.getVmsAdapter() : null;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), ((yu3.g.c) params.getState()).getConfirmationDocumentData().getTitle(), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: zu3.b
            @Override // er.a
            public final Object a() {
                return e.q(params);
            }
        })), null, null, 53, null);
        Label header = ((yu3.g.c) params.getState()).getConfirmationDocumentData().getHeader();
        Label description = ((yu3.g.c) params.getState()).getConfirmationDocumentData().getDescription();
        Label labelC = this.labelProvider.c(ou3.a.f150169b);
        boolean isValid = ((yu3.g.c) params.getState()).getIsValid();
        Boolean boolValueOf = Boolean.valueOf(isValid);
        if (isValid) {
            boolValueOf = null;
        }
        Label labelC2 = boolValueOf != null ? this.labelProvider.c(ou3.a.f150172e) : null;
        zz.h pickedFile = ((yu3.g.c) params.getState()).getPickedFile();
        FilePickerData filePickerData = new FilePickerData(labelC, labelC2, pq.v.r(pickedFile != null ? u(pickedFile, params.e(), params.d()) : null), pq.v.q(new n40.e.AllowedFormats(i(((yu3.g.c) params.getState()).getConfirmationDocumentData().getFormats())), new n40.e.b.File(((yu3.g.c) params.getState()).getConfirmationDocumentData().getMaxSize(), null)), new er.a() { // from class: zu3.c
            @Override // er.a
            public final Object a() {
                return e.r(params);
            }
        }, ((yu3.g.c) params.getState()).getConfirmationDocumentData().getMaxAllowedFiles());
        boolean scrollToPicker = ((yu3.g.c) params.getState()).getScrollToPicker();
        er.a<i0> aVarG = params.g();
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(((yu3.g.c) params.getState()).getBottomSheetValue(), false, params.h(), 2, null), null, null, null, 14, null);
        wq.a<q0> aVarE = q0.e();
        ArrayList arrayList = new ArrayList(pq.v.y(aVarE, 10));
        for (Iterator<q0> it = aVarE.iterator(); it.hasNext(); it = it) {
            final q0 next = it.next();
            arrayList.add(new FileBottomSheetItemData(next.getIconResId(), this.labelProvider.c(next.getLabelResId()), new er.a() { // from class: zu3.d
                @Override // er.a
                public final Object a() {
                    return e.s(params, next);
                }
            }));
        }
        return new h.a.Initialized(vmsAdapter, baseScaffoldData, header, description, filePickerData, scrollToPicker, aVarG, modalBottomSheetData, arrayList, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ou3.a.f150176i), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), params.a());
    }
}
