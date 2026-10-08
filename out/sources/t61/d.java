package t61;

import er.l;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import s61.e;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JK\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lt61/d;", "Lxw/f;", "Lt61/d$a;", "Lr61/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lu61/c;", "attachmentType", "Lr61/b$b$c$a;", "filesData", "Lkotlin/Function1;", "Ls61/a$a;", "Loq/i0;", "showBottomSheet", "Ls61/e;", "onBottomSheetSelected", "Lr61/c$a$c$a;", "h", "(Lu61/c;Lr61/b$b$c$a;Ler/l;Ler/l;)Lr61/c$a$c$a;", "Lmx/a;", "q", "(Lu61/c;)Lmx/a;", "m", "params", "r", "(Lt61/d$a;)Lr61/c$a;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, r61.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: t61.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b'\u0010$R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b!\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b\u001d\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b%\u0010*¨\u0006+"}, d2 = {"Lt61/d$a;", "", "Lr61/b;", "state", "Lkotlin/Function1;", "Ls61/a$a;", "Loq/i0;", "showBottomSheet", "Ls61/e;", "onGlassesBottomSheetActionSelected", "onFaceCoverBottomSheetActionSelected", "Lg30/v;", "onBottomSheetStateChanged", "Lkotlin/Function0;", "onNext", "onBack", "onClose", "<init>", "(Lr61/b;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr61/b;", "h", "()Lr61/b;", "b", "Ler/l;", "g", "()Ler/l;", "c", "e", "d", "f", "Ler/a;", "()Ler/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final r61.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<s61.a.SelectOption, i0> showBottomSheet;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<e, i0> onGlassesBottomSheetActionSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<e, i0> onFaceCoverBottomSheetActionSelected;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onBottomSheetStateChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(r61.b bVar, l<? super s61.a.SelectOption, i0> lVar, l<? super e, i0> lVar2, l<? super e, i0> lVar3, l<? super v, i0> lVar4, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = bVar;
            this.showBottomSheet = lVar;
            this.onGlassesBottomSheetActionSelected = lVar2;
            this.onFaceCoverBottomSheetActionSelected = lVar3;
            this.onBottomSheetStateChanged = lVar4;
            this.onNext = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
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

        public final l<e, i0> d() {
            return this.onFaceCoverBottomSheetActionSelected;
        }

        public final l<e, i0> e() {
            return this.onGlassesBottomSheetActionSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.showBottomSheet, params.showBottomSheet) && t.c(this.onGlassesBottomSheetActionSelected, params.onGlassesBottomSheetActionSelected) && t.c(this.onFaceCoverBottomSheetActionSelected, params.onFaceCoverBottomSheetActionSelected) && t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged) && t.c(this.onNext, params.onNext) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final er.a<i0> f() {
            return this.onNext;
        }

        public final l<s61.a.SelectOption, i0> g() {
            return this.showBottomSheet;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final r61.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.showBottomSheet.hashCode()) * 31) + this.onGlassesBottomSheetActionSelected.hashCode()) * 31) + this.onFaceCoverBottomSheetActionSelected.hashCode()) * 31) + this.onBottomSheetStateChanged.hashCode()) * 31) + this.onNext.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", showBottomSheet=" + this.showBottomSheet + ", onGlassesBottomSheetActionSelected=" + this.onGlassesBottomSheetActionSelected + ", onFaceCoverBottomSheetActionSelected=" + this.onFaceCoverBottomSheetActionSelected + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onNext=" + this.onNext + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f188000a;

        static {
            int[] iArr = new int[u61.c.values().length];
            try {
                iArr[u61.c.GLASSES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u61.c.FACE_COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f188000a = iArr;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final r61.c.a.Initialized.ContentData h(u61.c attachmentType, r61.b.AbstractC4383b.StateData.FilesData filesData, final l<? super s61.a.SelectOption, i0> showBottomSheet, final l<? super e, i0> onBottomSheetSelected) {
        if (filesData != null) {
            return new r61.c.a.Initialized.ContentData(q(attachmentType), m(attachmentType), new FilePickerData(this.labelProvider.c(w51.a.Y3), filesData.getShowValidationError() ? this.labelProvider.c(w51.a.f210302b4) : null, filesData.d(), pq.v.q(new n40.e.AllowedFormats(u61.a.a()), new n40.e.b.File(u61.a.b(), null), new n40.e.SelectionLimit(2)), new er.a() { // from class: t61.a
                @Override // er.a
                public final Object a() {
                    return d.i(showBottomSheet, onBottomSheetSelected);
                }
            }, 2));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, final l lVar2) {
        lVar.b(new s61.a.SelectOption(new l() { // from class: t61.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(lVar2, (e) obj);
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l lVar, e eVar) {
        lVar.b(eVar);
        return i0.f148189a;
    }

    private final Label m(u61.c attachmentType) {
        int i15 = b.f188000a[attachmentType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(w51.a.f210390o1);
        }
        if (i15 == 2) {
            return this.labelProvider.c(w51.a.f210369l1);
        }
        throw new p();
    }

    private final Label q(u61.c attachmentType) {
        int i15 = b.f188000a[attachmentType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(w51.a.f210404q1);
        }
        if (i15 == 2) {
            return this.labelProvider.c(w51.a.f210383n1);
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.b().b(v.HIDDEN);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public r61.c.a b(Params params) {
        final Params params2;
        s61.d.File fileB;
        r61.b state = params.getState();
        if (t.c(state, r61.b.a.C4382b.f171995a)) {
            return r61.c.a.b.f172011a;
        }
        if (!(state instanceof r61.b.AbstractC4383b.Presentation)) {
            if (state instanceof r61.b.a.Error) {
                return new r61.c.a.Error(((r61.b.a.Error) state).getErrorVMS());
            }
            if (state instanceof r61.b.AbstractC4383b.Error) {
                return new r61.c.a.Error(((r61.b.AbstractC4383b.Error) state).getErrorVMS());
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(w51.a.f210341h1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        r61.b.AbstractC4383b.Presentation presentation = (r61.b.AbstractC4383b.Presentation) state;
        r61.c.a.Initialized.ContentData contentDataH = h(u61.c.FACE_COVER, presentation.getStateData().getFaceCoverData(), params.g(), params.d());
        r61.c.a.Initialized.ContentData contentDataH2 = h(u61.c.GLASSES, presentation.getStateData().getGlassesData(), params.g(), params.e());
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(presentation.getStateData().getBottomSheetValue(), false, params.b(), 2, null), null, null, null, 14, null);
        s61.a bottomSheetData = presentation.getStateData().getBottomSheetData();
        if (bottomSheetData != null) {
            params2 = params;
            fileB = s61.c.b(bottomSheetData, this.labelProvider, new er.a() { // from class: t61.c
                @Override // er.a
                public final Object a() {
                    return d.s(params2);
                }
            });
        } else {
            params2 = params;
            fileB = null;
        }
        return new r61.c.a.Initialized(baseScaffoldData, contentDataH, contentDataH2, modalBottomSheetData, fileB, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210365k4), null, 2, null), k30.d.a.f107773a, null, params2.f(), 35, null), params2.a());
    }
}
