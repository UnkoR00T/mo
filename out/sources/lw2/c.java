package lw2;

import er.l;
import er.p;
import fr.k;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import jw2.State;
import jw2.d;
import mx.Label;
import n40.FilePickerData;
import n40.e;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import r30.CheckBoxRowData;
import u30.CheckBoxGroupData;
import wx.FileContent;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zz.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Llw2/c;", "Lxw/f;", "Llw2/c$a;", "Ljw2/d$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "f", "(Llw2/c$a;)Ljw2/d$a;", "a", "Lmx/c;", "b", "Lu04/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: lw2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b%\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b)\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b,\u0010!R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u00102R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b.\u00106R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b7\u00106R)\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u00148\u0006¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b:\u0010<R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b=\u00106R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b>\u00106R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b'\u00104\u001a\u0004\b/\u00106R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b3\u00106¨\u0006?"}, d2 = {"Llw2/c$a;", "", "Ljw2/c;", "state", "Lxw/a;", "maxPhotoSize", "", "minPhotoResolutionLongSide", "minPhotoResolutionShortSide", "Lkotlin/Function1;", "", "Loq/i0;", "onUrlClick", "Lkotlin/Function0;", "onNextClick", "", "onFaceCoveringPhotoOptionChecked", "onPhotoWithGlassesOptionChecked", "onAddImageClick", "onDeleteImageClick", "Lkotlin/Function2;", "Lmx/a;", "Lwx/c;", "onImageClick", "onScrolledToImageSection", "toIdentityPhoto", "onBack", "onClose", "<init>", "(Ljw2/c;FIILer/l;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/p;Ler/a;Ler/a;Ler/a;Ler/a;Lfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljw2/c;", "n", "()Ljw2/c;", "b", "F", "()F", "c", "I", "d", "e", "Ler/l;", "m", "()Ler/l;", "f", "Ler/a;", "j", "()Ler/a;", "g", "h", "k", "i", "Ler/p;", "()Ler/p;", "l", "o", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float maxPhotoSize;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int minPhotoResolutionLongSide;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int minPhotoResolutionShortSide;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onFaceCoveringPhotoOptionChecked;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onPhotoWithGlassesOptionChecked;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddImageClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteImageClick;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Label, FileContent, i0> onImageClick;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToImageSection;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toIdentityPhoto;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public /* synthetic */ Params(State state, float f15, int i15, int i16, l lVar, er.a aVar, l lVar2, l lVar3, er.a aVar2, er.a aVar3, p pVar, er.a aVar4, er.a aVar5, er.a aVar6, er.a aVar7, k kVar) {
            this(state, f15, i15, i16, lVar, aVar, lVar2, lVar3, aVar2, aVar3, pVar, aVar4, aVar5, aVar6, aVar7);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getMaxPhotoSize() {
            return this.maxPhotoSize;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMinPhotoResolutionLongSide() {
            return this.minPhotoResolutionLongSide;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMinPhotoResolutionShortSide() {
            return this.minPhotoResolutionShortSide;
        }

        public final er.a<i0> d() {
            return this.onAddImageClick;
        }

        public final er.a<i0> e() {
            return this.onBack;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && xw.a.d(this.maxPhotoSize, params.maxPhotoSize) && this.minPhotoResolutionLongSide == params.minPhotoResolutionLongSide && this.minPhotoResolutionShortSide == params.minPhotoResolutionShortSide && t.c(this.onUrlClick, params.onUrlClick) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onFaceCoveringPhotoOptionChecked, params.onFaceCoveringPhotoOptionChecked) && t.c(this.onPhotoWithGlassesOptionChecked, params.onPhotoWithGlassesOptionChecked) && t.c(this.onAddImageClick, params.onAddImageClick) && t.c(this.onDeleteImageClick, params.onDeleteImageClick) && t.c(this.onImageClick, params.onImageClick) && t.c(this.onScrolledToImageSection, params.onScrolledToImageSection) && t.c(this.toIdentityPhoto, params.toIdentityPhoto) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final er.a<i0> f() {
            return this.onClose;
        }

        public final er.a<i0> g() {
            return this.onDeleteImageClick;
        }

        public final l<Boolean, i0> h() {
            return this.onFaceCoveringPhotoOptionChecked;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((this.state.hashCode() * 31) + xw.a.e(this.maxPhotoSize)) * 31) + Integer.hashCode(this.minPhotoResolutionLongSide)) * 31) + Integer.hashCode(this.minPhotoResolutionShortSide)) * 31) + this.onUrlClick.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.onFaceCoveringPhotoOptionChecked.hashCode()) * 31) + this.onPhotoWithGlassesOptionChecked.hashCode()) * 31) + this.onAddImageClick.hashCode()) * 31) + this.onDeleteImageClick.hashCode()) * 31) + this.onImageClick.hashCode()) * 31) + this.onScrolledToImageSection.hashCode()) * 31) + this.toIdentityPhoto.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public final p<Label, FileContent, i0> i() {
            return this.onImageClick;
        }

        public final er.a<i0> j() {
            return this.onNextClick;
        }

        public final l<Boolean, i0> k() {
            return this.onPhotoWithGlassesOptionChecked;
        }

        public final er.a<i0> l() {
            return this.onScrolledToImageSection;
        }

        public final l<String, i0> m() {
            return this.onUrlClick;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final er.a<i0> o() {
            return this.toIdentityPhoto;
        }

        public String toString() {
            return "Params(state=" + this.state + ", maxPhotoSize=" + ((Object) xw.a.f(this.maxPhotoSize)) + ", minPhotoResolutionLongSide=" + this.minPhotoResolutionLongSide + ", minPhotoResolutionShortSide=" + this.minPhotoResolutionShortSide + ", onUrlClick=" + this.onUrlClick + ", onNextClick=" + this.onNextClick + ", onFaceCoveringPhotoOptionChecked=" + this.onFaceCoveringPhotoOptionChecked + ", onPhotoWithGlassesOptionChecked=" + this.onPhotoWithGlassesOptionChecked + ", onAddImageClick=" + this.onAddImageClick + ", onDeleteImageClick=" + this.onDeleteImageClick + ", onImageClick=" + this.onImageClick + ", onScrolledToImageSection=" + this.onScrolledToImageSection + ", toIdentityPhoto=" + this.toIdentityPhoto + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Params(State state, float f15, int i15, int i16, l<? super String, i0> lVar, er.a<i0> aVar, l<? super Boolean, i0> lVar2, l<? super Boolean, i0> lVar3, er.a<i0> aVar2, er.a<i0> aVar3, p<? super Label, ? super FileContent, i0> pVar, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, er.a<i0> aVar7) {
            this.state = state;
            this.maxPhotoSize = f15;
            this.minPhotoResolutionLongSide = i15;
            this.minPhotoResolutionShortSide = i16;
            this.onUrlClick = lVar;
            this.onNextClick = aVar;
            this.onFaceCoveringPhotoOptionChecked = lVar2;
            this.onPhotoWithGlassesOptionChecked = lVar3;
            this.onAddImageClick = aVar2;
            this.onDeleteImageClick = aVar3;
            this.onImageClick = pVar;
            this.onScrolledToImageSection = aVar4;
            this.toIdentityPhoto = aVar5;
            this.onBack = aVar6;
            this.onClose = aVar7;
        }
    }

    public c(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, c cVar, h.Image image) {
        params.i().B(cVar.labelProvider.c(gv2.a.f77293o2), image.a().getFileContent());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        if (params.getState().getIdentityPhotoEnabled()) {
            params.o().a();
        } else {
            params.d().a();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        int i15;
        int i16;
        int i17;
        List listN;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.e()), this.labelProvider.c(gv2.a.f77289n2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.f(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(gv2.a.f77301q2);
        mx.c cVar = this.labelProvider;
        boolean identityPhotoEnabled = params.getState().getIdentityPhotoEnabled();
        if (identityPhotoEnabled) {
            i15 = gv2.a.f77258g2;
        } else {
            if (identityPhotoEnabled) {
                throw new oq.p();
            }
            i15 = gv2.a.f77253f2;
        }
        Label labelC2 = cVar.c(i15);
        LinkData linkData = new LinkData(null, this.labelProvider.c(gv2.a.f77297p2), this.commonEndpoints.G(), LinkData.EnumC5775a.WEBSITE, false, params.m(), 17, null);
        mx.c cVar2 = this.labelProvider;
        boolean identityPhotoEnabled2 = params.getState().getIdentityPhotoEnabled();
        if (identityPhotoEnabled2) {
            i16 = gv2.a.D;
        } else {
            if (identityPhotoEnabled2) {
                throw new oq.p();
            }
            i16 = gv2.a.A;
        }
        Label labelC3 = cVar2.c(i16);
        boolean showImagePickerError = params.getState().getShowImagePickerError();
        Boolean boolValueOf = Boolean.valueOf(showImagePickerError);
        if (!showImagePickerError) {
            boolValueOf = null;
        }
        Label labelC4 = boolValueOf != null ? this.labelProvider.c(gv2.a.B) : null;
        final h.Image pickedFile = params.getState().getPickedFile();
        if (pickedFile != null) {
            i17 = 1;
            listN = v.e(new n40.i.Image(mx.b.b(pickedFile.a().getMetadata().getName(), "name"), this.labelProvider.e(gv2.a.C, t04.a.c(pickedFile.a().d())), params.g(), new er.a() { // from class: lw2.a
                @Override // er.a
                public final Object a() {
                    return c.h(params, this, pickedFile);
                }
            }, new n40.i.Image.AbstractC3255a.Image(pickedFile.getThumbnail())));
            if (listN == null) {
            }
            List list = listN;
            e.b.File file = new e.b.File(params.getMaxPhotoSize(), null);
            e.MinResolution minResolution = new e.MinResolution(params.getMinPhotoResolutionShortSide(), params.getMinPhotoResolutionLongSide());
            e[] eVarArr = new e[2];
            eVarArr[0] = file;
            eVarArr[i17] = minResolution;
            return new d.Data(baseScaffoldData, labelC, labelC2, linkData, new FilePickerData(labelC3, labelC4, list, v.q(eVarArr), new er.a() { // from class: lw2.b
                @Override // er.a
                public final Object a() {
                    return c.i(params);
                }
            }, 1), params.getState().getScrollToImageSection(), params.l(), this.labelProvider.c(gv2.a.f77248e2), this.labelProvider.c(gv2.a.f77243d2), new CheckBoxGroupData(v.q(new CheckBoxRowData(null, params.getState().getIsFaceCoveringPhotoOptionChecked(), params.h(), this.labelProvider.c(gv2.a.f77268i2), null, null, null, null, 241, null), new CheckBoxRowData(null, params.getState().getIsPhotoWithGlassesOptionChecked(), params.k(), this.labelProvider.c(gv2.a.f77281l2), null, null, null, null, 241, null)), null, null, r30.c.CONTENT_BOX, false, null, 54, null), new ButtonData(null, null, new k30.a.Large(false, i17, null), new k30.c.WithText(this.labelProvider.c(gv2.a.P), null, 2, null), k30.d.a.f107773a, null, params.j(), 35, null));
        }
        i17 = 1;
        listN = v.n();
        List list2 = listN;
        e.b.File file2 = new e.b.File(params.getMaxPhotoSize(), null);
        e.MinResolution minResolution2 = new e.MinResolution(params.getMinPhotoResolutionShortSide(), params.getMinPhotoResolutionLongSide());
        e[] eVarArr2 = new e[2];
        eVarArr2[0] = file2;
        eVarArr2[i17] = minResolution2;
        return new d.Data(baseScaffoldData, labelC, labelC2, linkData, new FilePickerData(labelC3, labelC4, list2, v.q(eVarArr2), new er.a() { // from class: lw2.b
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, 1), params.getState().getScrollToImageSection(), params.l(), this.labelProvider.c(gv2.a.f77248e2), this.labelProvider.c(gv2.a.f77243d2), new CheckBoxGroupData(v.q(new CheckBoxRowData(null, params.getState().getIsFaceCoveringPhotoOptionChecked(), params.h(), this.labelProvider.c(gv2.a.f77268i2), null, null, null, null, 241, null), new CheckBoxRowData(null, params.getState().getIsPhotoWithGlassesOptionChecked(), params.k(), this.labelProvider.c(gv2.a.f77281l2), null, null, null, null, 241, null)), null, null, r30.c.CONTENT_BOX, false, null, 54, null), new ButtonData(null, null, new k30.a.Large(false, i17, null), new k30.c.WithText(this.labelProvider.c(gv2.a.P), null, 2, null), k30.d.a.f107773a, null, params.j(), 35, null));
    }
}
