package se2;

import cb4.i;
import er.l;
import er.p;
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
import oq.i0;
import p071kotlin.Metadata;
import re2.Error;
import x50.NavigationButtonData;
import xw.f;
import z30.FileBottomSheetItemData;
import zd2.ThumbnailsWihName;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lse2/e;", "Lxw/f;", "Lse2/e$a;", "Lre2/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "stringId", "Lmx/a;", "l", "(I)Lmx/a;", "params", "f", "(Lse2/e$a;)Lre2/f$a;", "a", "Lmx/c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, re2.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: se2.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b'\u0010&R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b#\u0010&R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b\u001f\u0010&R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b*\u0010-R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b(\u0010-R)\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00108\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b)\u0010/¨\u00060"}, d2 = {"Lse2/e$a;", "", "Lre2/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onNextClick", "onAddFileClicked", "addPhoto", "takePhoto", "Lkotlin/Function1;", "Lo04/c;", "onDelete", "Lg30/v;", "onBottomSheetStateChanged", "Lkotlin/Function2;", "Lmx/a;", "onClickImage", "<init>", "(Lre2/e;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lre2/e;", "h", "()Lre2/e;", "b", "Ler/a;", "c", "()Ler/a;", "g", "d", "e", "f", "i", "Ler/l;", "()Ler/l;", "Ler/p;", "()Ler/p;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final re2.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddFileClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> addPhoto;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> takePhoto;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<o04.c, i0> onDelete;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onBottomSheetStateChanged;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Label, o04.c, i0> onClickImage;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(re2.e eVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, l<? super o04.c, i0> lVar, l<? super v, i0> lVar2, p<? super Label, ? super o04.c, i0> pVar) {
            this.state = eVar;
            this.onBackClick = aVar;
            this.onNextClick = aVar2;
            this.onAddFileClicked = aVar3;
            this.addPhoto = aVar4;
            this.takePhoto = aVar5;
            this.onDelete = lVar;
            this.onBottomSheetStateChanged = lVar2;
            this.onClickImage = pVar;
        }

        public final er.a<i0> a() {
            return this.addPhoto;
        }

        public final er.a<i0> b() {
            return this.onAddFileClicked;
        }

        public final er.a<i0> c() {
            return this.onBackClick;
        }

        public final l<v, i0> d() {
            return this.onBottomSheetStateChanged;
        }

        public final p<Label, o04.c, i0> e() {
            return this.onClickImage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onAddFileClicked, params.onAddFileClicked) && t.c(this.addPhoto, params.addPhoto) && t.c(this.takePhoto, params.takePhoto) && t.c(this.onDelete, params.onDelete) && t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged) && t.c(this.onClickImage, params.onClickImage);
        }

        public final l<o04.c, i0> f() {
            return this.onDelete;
        }

        public final er.a<i0> g() {
            return this.onNextClick;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final re2.e getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.onAddFileClicked.hashCode()) * 31) + this.addPhoto.hashCode()) * 31) + this.takePhoto.hashCode()) * 31) + this.onDelete.hashCode()) * 31) + this.onBottomSheetStateChanged.hashCode()) * 31) + this.onClickImage.hashCode();
        }

        public final er.a<i0> i() {
            return this.takePhoto;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onNextClick=" + this.onNextClick + ", onAddFileClicked=" + this.onAddFileClicked + ", addPhoto=" + this.addPhoto + ", takePhoto=" + this.takePhoto + ", onDelete=" + this.onDelete + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onClickImage=" + this.onClickImage + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, ThumbnailsWihName thumbnailsWihName) {
        params.f().b(thumbnailsWihName.getThumbnail());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, Label label, ThumbnailsWihName thumbnailsWihName) {
        params.e().B(label, thumbnailsWihName.getThumbnail());
        return i0.f148189a;
    }

    private final Label l(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public re2.f.a b(final Params params) {
        i dialog;
        n40.i.Image.AbstractC3255a image;
        re2.e state = params.getState();
        if (t.c(state, re2.d.f173491a)) {
            return new re2.f.a.Empty(params.c());
        }
        if (!(state instanceof re2.e.a)) {
            if (state instanceof Error) {
                return new re2.f.a.Error(params.c(), ((Error) state).getError());
            }
            throw new oq.p();
        }
        er.a<i0> aVarC = params.c();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), l(ud2.a.B), null, null, null, 28, null), null, null, null, null, 61, null);
        ButtonData buttonData = new ButtonData("onGoNextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(l(ud2.a.f197771y), null, 2, null), k30.d.a.f107773a, null, params.g(), 34, null);
        re2.e.a aVar = (re2.e.a) state;
        if (aVar instanceof re2.e.a.Screen) {
            dialog = null;
        } else {
            if (!(aVar instanceof re2.e.a.Dialog)) {
                throw new oq.p();
            }
            dialog = ((re2.e.a.Dialog) state).getDialog();
        }
        Label labelL = l(ud2.a.f197746l0);
        Label labelL2 = l(ud2.a.f197744k0);
        Label labelL3 = l(ud2.a.f197759s);
        List<ThumbnailsWihName> listE = aVar.getInitializedData().e();
        ArrayList arrayList = new ArrayList(pq.v.y(listE, 10));
        for (final ThumbnailsWihName thumbnailsWihName : listE) {
            final Label labelB = mx.b.b(thumbnailsWihName.getName(), "fileName");
            Label label = labelL;
            Label labelE = this.labelProvider.e(ud2.a.f197757r, Float.valueOf(thumbnailsWihName.getThumbnail().getOriginalMetadata().d()));
            boolean z15 = thumbnailsWihName.getBitmap() == null;
            if (z15) {
                image = n40.i.Image.AbstractC3255a.Icon.INSTANCE.a();
            } else {
                if (z15) {
                    throw new oq.p();
                }
                image = new n40.i.Image.AbstractC3255a.Image(thumbnailsWihName.getBitmap());
            }
            arrayList.add(new n40.i.Image(labelB, labelE, new er.a() { // from class: se2.c
                @Override // er.a
                public final Object a() {
                    return e.h(params, thumbnailsWihName);
                }
            }, new er.a() { // from class: se2.d
                @Override // er.a
                public final Object a() {
                    return e.i(params, labelB, thumbnailsWihName);
                }
            }, image));
            labelL = label;
        }
        return new re2.f.a.Initialized(aVarC, baseScaffoldData, buttonData, labelL, labelL2, new FilePickerData(labelL3, null, arrayList, pq.v.e(new n40.e.SelectionLimit(aVar.getInitializedData().getFileImageConfiguration().getMaxFileAmount())), params.b(), aVar.getInitializedData().getFileImageConfiguration().getMaxFileAmount()), new ModalBottomSheetData(new ModalSheetState(aVar.getInitializedData().getBottomSheetValue(), false, params.d(), 2, null), null, null, null, 14, null), pq.v.q(new FileBottomSheetItemData(jz.a.f106760e0, l(ud2.a.f197755q), params.a()), new FileBottomSheetItemData(jz.a.f106818m, l(ud2.a.f197761t), params.i())), dialog);
    }
}
