package pc2;

import er.l;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import nc2.State;
import oq.i0;
import oq.p;
import oq.y;
import p071kotlin.Metadata;
import pq.e1;
import pq.v0;
import t50.TextAreaData;
import t50.s;
import x50.NavigationButtonData;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002&\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u0015\u001a\u00020\u0014*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010%\u001a\u00020\"*\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lpc2/k;", "Lxw/f;", "Lpc2/k$b;", "Lnc2/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lhz/b;", "Lt50/e;", "G", "(Lhz/b;)Lt50/e;", "Lzz/h;", "", "index", "Lkotlin/Function1;", "Ldx3/a;", "Loq/i0;", "onImageClick", "onDeleteFile", "Ln40/i;", "x", "(Lzz/h;ILer/l;Ler/l;)Ln40/i;", "params", "r", "(Lpc2/k$b;)Lnc2/d$a;", "a", "Lmx/c;", "", "Ln40/e;", "m", "()Ljava/util/List;", "fileRequirements", "Lwx/i;", "Lmx/a;", "q", "(Lwx/i;)Lmx/a;", "sizeInReadableFormat", "b", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements xw.f<Params, nc2.d.Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f154190b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f154191c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpc2/k$a;", "", "<init>", "()V", "", "PICKER_FILE_TITLE_TAG", "Ljava/lang/String;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: pc2.k$b, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b*\u0010'R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b+\u0010'R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b$\u0010'R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b \u0010.R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b/\u0010.R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b(\u0010.¨\u00060"}, d2 = {"Lpc2/k$b;", "", "Lnc2/c;", "state", "Lkotlin/Function1;", "Lnc2/a;", "Loq/i0;", "onPickerActionSelected", "Ldx3/a;", "onImageClick", "Lzz/h;", "onDeleteFileClick", "", "onDescriptionChanged", "Lg30/v;", "onBottomSheetStateChanged", "Lkotlin/Function0;", "onNextButtonClick", "onBackClick", "onScrolledToField", "onCloseClick", "<init>", "(Lnc2/c;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnc2/c;", "j", "()Lnc2/c;", "b", "Ler/l;", "h", "()Ler/l;", "c", "f", "d", "e", "g", "Ler/a;", "()Ler/a;", "i", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<nc2.a, i0> onPickerActionSelected;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<dx3.a, i0> onImageClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<zz.h, i0> onDeleteFileClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onDescriptionChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onBottomSheetStateChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super nc2.a, i0> lVar, l<? super dx3.a, i0> lVar2, l<? super zz.h, i0> lVar3, l<? super String, i0> lVar4, l<? super v, i0> lVar5, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onPickerActionSelected = lVar;
            this.onImageClick = lVar2;
            this.onDeleteFileClick = lVar3;
            this.onDescriptionChanged = lVar4;
            this.onBottomSheetStateChanged = lVar5;
            this.onNextButtonClick = aVar;
            this.onBackClick = aVar2;
            this.onScrolledToField = aVar3;
            this.onCloseClick = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final l<v, i0> b() {
            return this.onBottomSheetStateChanged;
        }

        public final er.a<i0> c() {
            return this.onCloseClick;
        }

        public final l<zz.h, i0> d() {
            return this.onDeleteFileClick;
        }

        public final l<String, i0> e() {
            return this.onDescriptionChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onPickerActionSelected, params.onPickerActionSelected) && t.c(this.onImageClick, params.onImageClick) && t.c(this.onDeleteFileClick, params.onDeleteFileClick) && t.c(this.onDescriptionChanged, params.onDescriptionChanged) && t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.onCloseClick, params.onCloseClick);
        }

        public final l<dx3.a, i0> f() {
            return this.onImageClick;
        }

        public final er.a<i0> g() {
            return this.onNextButtonClick;
        }

        public final l<nc2.a, i0> h() {
            return this.onPickerActionSelected;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.onPickerActionSelected.hashCode()) * 31) + this.onImageClick.hashCode()) * 31) + this.onDeleteFileClick.hashCode()) * 31) + this.onDescriptionChanged.hashCode()) * 31) + this.onBottomSheetStateChanged.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public final er.a<i0> i() {
            return this.onScrolledToField;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPickerActionSelected=" + this.onPickerActionSelected + ", onImageClick=" + this.onImageClick + ", onDeleteFileClick=" + this.onDeleteFileClick + ", onDescriptionChanged=" + this.onDescriptionChanged + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onNextButtonClick=" + this.onNextButtonClick + ", onBackClick=" + this.onBackClick + ", onScrolledToField=" + this.onScrolledToField + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    public k(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(l lVar, k kVar, zz.h hVar) {
        lVar.b(new dx3.a.Content(kVar.labelProvider.c(hb2.b.J), ((zz.h.Image) hVar).a().getFileContent()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(l lVar, zz.h hVar) {
        lVar.b(hVar);
        return i0.f148189a;
    }

    private final t50.e G(hz.b bVar) {
        if (t.c(bVar, hz.b.C2039b.f86846c) || t.c(bVar, hz.b.d.f86848c)) {
            return new t50.e.Default(null, 1, null);
        }
        if (bVar instanceof hz.b.Invalid) {
            return new t50.e.Error(((hz.b.Invalid) bVar).getMessage());
        }
        throw new p();
    }

    private final List<n40.e> m() {
        wx.d.Companion companion = wx.d.INSTANCE;
        return pq.v.q(new n40.e.AllowedFormats(e1.i(wx.d.j0(companion.J()), wx.d.j0(companion.u()), wx.d.j0(companion.K()))), new n40.e.b.File(hb2.a.a(), null), new n40.e.SelectionLimit(4));
    }

    private final Label q(wx.i iVar) {
        return this.labelProvider.e(hb2.b.f82815v, t04.a.c(iVar.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.b().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, nc2.a aVar) {
        params.h().b(aVar);
        params.b().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.b().b(v.EXPANDED);
        return i0.f148189a;
    }

    private final n40.i x(final zz.h hVar, int i15, final l<? super dx3.a, i0> lVar, final l<? super zz.h, i0> lVar2) {
        if (hVar instanceof zz.h.Image) {
            zz.h.Image image = (zz.h.Image) hVar;
            return new n40.i.Image(mx.b.b(image.a().getMetadata().getName(), "fileTitle_" + i15), q(image.a()), new er.a() { // from class: pc2.e
                @Override // er.a
                public final Object a() {
                    return k.z(lVar2, hVar);
                }
            }, new er.a() { // from class: pc2.f
                @Override // er.a
                public final Object a() {
                    return k.E(lVar, this, hVar);
                }
            }, new n40.i.Image.AbstractC3255a.Image(image.getThumbnail()));
        }
        if (!(hVar instanceof zz.h.Regular)) {
            throw new p();
        }
        StringBuilder sb5 = new StringBuilder();
        zz.h.Regular regular = (zz.h.Regular) hVar;
        sb5.append(regular.a().getMetadata().getName());
        sb5.append('.');
        sb5.append(regular.a().getMetadata().getExtension());
        return new n40.i.Regular(mx.b.b(sb5.toString(), "fileTitle_" + i15), q(regular.a()), null, new er.a() { // from class: pc2.g
            @Override // er.a
            public final Object a() {
                return k.F(lVar2, hVar);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(l lVar, zz.h hVar) {
        lVar.b(hVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public nc2.d.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(hb2.b.f82816v0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: pc2.h
            @Override // er.a
            public final Object a() {
                return k.s(params);
            }
        })), null, null, 53, null);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(params.getState().getBottomSheetValue(), false, params.b(), 2, null), null, null, null, 14, null);
        wq.a<nc2.a> aVarE = nc2.a.e();
        ArrayList arrayList = new ArrayList(pq.v.y(aVarE, 10));
        for (final nc2.a aVar : aVarE) {
            arrayList.add(new FileBottomSheetItemData(aVar.getIconResId(), this.labelProvider.c(aVar.getLabelResId()), new er.a() { // from class: pc2.i
                @Override // er.a
                public final Object a() {
                    return k.u(params, aVar);
                }
            }));
        }
        Label labelC = this.labelProvider.c(hb2.b.f82818w0);
        Label labelC2 = this.labelProvider.c(hb2.b.f82810s0);
        TextAreaData textAreaData = new TextAreaData(null, this.labelProvider.c(hb2.b.f82816v0), new s.Fix(0, 1, null), null, G(params.getState().d().getValidationState()), params.getState().d().d(), false, new t50.a.Visible(1500, null, 2, null), null, 0, null, null, params.e(), null, 12105, null);
        Label labelC3 = this.labelProvider.c(hb2.b.f82808r0);
        Label labelC4 = this.labelProvider.c(hb2.b.f82806q0);
        Label labelC5 = this.labelProvider.c(hb2.b.f82811t);
        List<zz.h> listE = params.getState().e();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listE, 10));
        int i15 = 0;
        for (Object obj : listE) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            arrayList2.add(x((zz.h) obj, i15, params.f(), params.d()));
            i15 = i16;
        }
        return new nc2.d.Data(baseScaffoldData, modalBottomSheetData, arrayList, labelC, labelC2, textAreaData, new nc2.d.Data.PickerSectionData(labelC3, labelC4, new FilePickerData(labelC5, null, arrayList2, m(), new er.a() { // from class: pc2.j
            @Override // er.a
            public final Object a() {
                return k.v(params);
            }
        }, 4)), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(hb2.b.D), null, 2, null), k30.d.a.f107773a, null, params.g(), 35, null), params.a(), params.getState().getScrollToField(), params.i());
    }
}
