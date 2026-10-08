package q61;

import er.l;
import er.p;
import fr.k;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import java.util.Set;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import r30.CheckBoxRowData;
import u30.CheckBoxGroupData;
import wx.FileContent;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import zz.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\r\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lq61/b;", "Lxw/f;", "Lq61/b$b;", "Lo61/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lq61/b$b;)Lo61/d$a;", "a", "Lmx/c;", "b", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, o61.d.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f165001c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: q61.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b'\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b.\u0010#R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b1\u0010#R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u00107R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u00107R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b<\u0010;R)\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\b:\u0010@\u001a\u0004\b?\u0010AR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\bB\u0010;R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\b3\u0010;R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\b4\u0010;R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\u0006¢\u0006\f\n\u0004\b)\u00109\u001a\u0004\b8\u0010;¨\u0006C"}, d2 = {"Lq61/b$b;", "", "Lo61/c;", "state", "Lxw/a;", "maxPhotoSize", "", "Lwx/d;", "allowedExtensions", "", "minPhotoResolutionLongSide", "minPhotoResolutionShortSide", "Lkotlin/Function1;", "", "Loq/i0;", "onUrlClick", "Lkotlin/Function0;", "onNextClick", "", "onFaceCoveringPhotoOptionChecked", "onPhotoWithGlassesOptionChecked", "onDeleteImageClick", "Lkotlin/Function2;", "Lmx/a;", "Lwx/c;", "onImageClick", "onScrolledToImageSection", "onAddFile", "onBack", "onClose", "<init>", "(Lo61/c;FLjava/util/Set;IILer/l;Ler/a;Ler/l;Ler/l;Ler/a;Ler/p;Ler/a;Ler/a;Ler/a;Ler/a;Lfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lo61/c;", "o", "()Lo61/c;", "b", "F", "()F", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "d", "I", "e", "f", "Ler/l;", "n", "()Ler/l;", "g", "Ler/a;", "k", "()Ler/a;", "h", "i", "l", "j", "Ler/p;", "()Ler/p;", "m", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o61.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float maxPhotoSize;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<wx.d> allowedExtensions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int minPhotoResolutionLongSide;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int minPhotoResolutionShortSide;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onFaceCoveringPhotoOptionChecked;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onPhotoWithGlassesOptionChecked;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteImageClick;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Label, FileContent, i0> onImageClick;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToImageSection;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddFile;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public /* synthetic */ Params(o61.c cVar, float f15, Set set, int i15, int i16, l lVar, er.a aVar, l lVar2, l lVar3, er.a aVar2, p pVar, er.a aVar3, er.a aVar4, er.a aVar5, er.a aVar6, k kVar) {
            this(cVar, f15, set, i15, i16, lVar, aVar, lVar2, lVar3, aVar2, pVar, aVar3, aVar4, aVar5, aVar6);
        }

        public final Set<wx.d> a() {
            return this.allowedExtensions;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getMaxPhotoSize() {
            return this.maxPhotoSize;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMinPhotoResolutionLongSide() {
            return this.minPhotoResolutionLongSide;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMinPhotoResolutionShortSide() {
            return this.minPhotoResolutionShortSide;
        }

        public final er.a<i0> e() {
            return this.onAddFile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && xw.a.d(this.maxPhotoSize, params.maxPhotoSize) && t.c(this.allowedExtensions, params.allowedExtensions) && this.minPhotoResolutionLongSide == params.minPhotoResolutionLongSide && this.minPhotoResolutionShortSide == params.minPhotoResolutionShortSide && t.c(this.onUrlClick, params.onUrlClick) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onFaceCoveringPhotoOptionChecked, params.onFaceCoveringPhotoOptionChecked) && t.c(this.onPhotoWithGlassesOptionChecked, params.onPhotoWithGlassesOptionChecked) && t.c(this.onDeleteImageClick, params.onDeleteImageClick) && t.c(this.onImageClick, params.onImageClick) && t.c(this.onScrolledToImageSection, params.onScrolledToImageSection) && t.c(this.onAddFile, params.onAddFile) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final er.a<i0> f() {
            return this.onBack;
        }

        public final er.a<i0> g() {
            return this.onClose;
        }

        public final er.a<i0> h() {
            return this.onDeleteImageClick;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((this.state.hashCode() * 31) + xw.a.e(this.maxPhotoSize)) * 31) + this.allowedExtensions.hashCode()) * 31) + Integer.hashCode(this.minPhotoResolutionLongSide)) * 31) + Integer.hashCode(this.minPhotoResolutionShortSide)) * 31) + this.onUrlClick.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.onFaceCoveringPhotoOptionChecked.hashCode()) * 31) + this.onPhotoWithGlassesOptionChecked.hashCode()) * 31) + this.onDeleteImageClick.hashCode()) * 31) + this.onImageClick.hashCode()) * 31) + this.onScrolledToImageSection.hashCode()) * 31) + this.onAddFile.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public final l<Boolean, i0> i() {
            return this.onFaceCoveringPhotoOptionChecked;
        }

        public final p<Label, FileContent, i0> j() {
            return this.onImageClick;
        }

        public final er.a<i0> k() {
            return this.onNextClick;
        }

        public final l<Boolean, i0> l() {
            return this.onPhotoWithGlassesOptionChecked;
        }

        public final er.a<i0> m() {
            return this.onScrolledToImageSection;
        }

        public final l<String, i0> n() {
            return this.onUrlClick;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final o61.c getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", maxPhotoSize=" + ((Object) xw.a.f(this.maxPhotoSize)) + ", allowedExtensions=" + this.allowedExtensions + ", minPhotoResolutionLongSide=" + this.minPhotoResolutionLongSide + ", minPhotoResolutionShortSide=" + this.minPhotoResolutionShortSide + ", onUrlClick=" + this.onUrlClick + ", onNextClick=" + this.onNextClick + ", onFaceCoveringPhotoOptionChecked=" + this.onFaceCoveringPhotoOptionChecked + ", onPhotoWithGlassesOptionChecked=" + this.onPhotoWithGlassesOptionChecked + ", onDeleteImageClick=" + this.onDeleteImageClick + ", onImageClick=" + this.onImageClick + ", onScrolledToImageSection=" + this.onScrolledToImageSection + ", onAddFile=" + this.onAddFile + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Params(o61.c cVar, float f15, Set<wx.d> set, int i15, int i16, l<? super String, i0> lVar, er.a<i0> aVar, l<? super Boolean, i0> lVar2, l<? super Boolean, i0> lVar3, er.a<i0> aVar2, p<? super Label, ? super FileContent, i0> pVar, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = cVar;
            this.maxPhotoSize = f15;
            this.allowedExtensions = set;
            this.minPhotoResolutionLongSide = i15;
            this.minPhotoResolutionShortSide = i16;
            this.onUrlClick = lVar;
            this.onNextClick = aVar;
            this.onFaceCoveringPhotoOptionChecked = lVar2;
            this.onPhotoWithGlassesOptionChecked = lVar3;
            this.onDeleteImageClick = aVar2;
            this.onImageClick = pVar;
            this.onScrolledToImageSection = aVar3;
            this.onAddFile = aVar4;
            this.onBack = aVar5;
            this.onClose = aVar6;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, b bVar, h.Image image) {
        params.j().B(bVar.labelProvider.c(w51.a.f210330f4), image.a().getFileContent());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public o61.d.a b(Params params) {
        final Params params2;
        List listN;
        o61.c state = params.getState();
        if (!(state instanceof o61.c.Presenting)) {
            if (state instanceof o61.c.Error) {
                return new o61.d.a.Error(((o61.c.Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.f()), this.labelProvider.c(w51.a.Z3), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.g(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(w51.a.f210418s1);
        Label labelC2 = this.labelProvider.c(w51.a.f210362k1);
        LinkData linkData = new LinkData(null, this.labelProvider.c(w51.a.f210411r1), "https://www.gov.pl/web/gov/zdjecie-do-dowodu-lub-paszportu", LinkData.EnumC5775a.WEBSITE, false, params.n(), 17, null);
        Label labelC3 = this.labelProvider.c(w51.a.f210316d4);
        Label labelC4 = ((o61.c.Presenting) params.getState()).getData().getShowImagePickerError() ? this.labelProvider.c(w51.a.f210302b4) : null;
        final h.Image pickedFile = ((o61.c.Presenting) params.getState()).getData().getPickedFile();
        if (pickedFile != null) {
            params2 = params;
            listN = v.e(new n40.i.Image(mx.b.b(pickedFile.a().getMetadata().getName(), "name"), this.labelProvider.e(w51.a.f210309c4, t04.a.c(pickedFile.a().d())), params.h(), new er.a() { // from class: q61.a
                @Override // er.a
                public final Object a() {
                    return b.f(params2, this, pickedFile);
                }
            }, new n40.i.Image.AbstractC3255a.Image(pickedFile.getThumbnail())));
            if (listN == null) {
            }
            return new o61.d.a.Presenting(baseScaffoldData, labelC, labelC2, linkData, new FilePickerData(labelC3, labelC4, listN, v.q(new n40.e.AllowedFormats(params2.a()), new n40.e.b.File(params2.getMaxPhotoSize(), null), new n40.e.MinResolution(params2.getMinPhotoResolutionShortSide(), params2.getMinPhotoResolutionLongSide())), params2.e(), 1), ((o61.c.Presenting) params2.getState()).getData().getScrollToImageSection(), params2.m(), this.labelProvider.c(w51.a.f210355j1), this.labelProvider.c(w51.a.f210348i1), new CheckBoxGroupData(v.q(new CheckBoxRowData(null, ((o61.c.Presenting) params2.getState()).getData().getIsFaceCoveringPhotoOptionChecked(), params2.i(), this.labelProvider.c(w51.a.f210376m1), null, null, null, null, 241, null), new CheckBoxRowData(null, ((o61.c.Presenting) params2.getState()).getData().getIsPhotoWithGlassesOptionChecked(), params2.l(), this.labelProvider.c(w51.a.f210397p1), null, null, null, null, 241, null)), null, null, r30.c.CONTENT_BOX, false, null, 54, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210365k4), null, 2, null), k30.d.a.f107773a, null, params2.k(), 35, null), params2.f());
        }
        params2 = params;
        listN = v.n();
        return new o61.d.a.Presenting(baseScaffoldData, labelC, labelC2, linkData, new FilePickerData(labelC3, labelC4, listN, v.q(new n40.e.AllowedFormats(params2.a()), new n40.e.b.File(params2.getMaxPhotoSize(), null), new n40.e.MinResolution(params2.getMinPhotoResolutionShortSide(), params2.getMinPhotoResolutionLongSide())), params2.e(), 1), ((o61.c.Presenting) params2.getState()).getData().getScrollToImageSection(), params2.m(), this.labelProvider.c(w51.a.f210355j1), this.labelProvider.c(w51.a.f210348i1), new CheckBoxGroupData(v.q(new CheckBoxRowData(null, ((o61.c.Presenting) params2.getState()).getData().getIsFaceCoveringPhotoOptionChecked(), params2.i(), this.labelProvider.c(w51.a.f210376m1), null, null, null, null, 241, null), new CheckBoxRowData(null, ((o61.c.Presenting) params2.getState()).getData().getIsPhotoWithGlassesOptionChecked(), params2.l(), this.labelProvider.c(w51.a.f210397p1), null, null, null, null, 241, null)), null, null, r30.c.CONTENT_BOX, false, null, 54, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210365k4), null, 2, null), k30.d.a.f107773a, null, params2.k(), 35, null), params2.f());
    }
}
