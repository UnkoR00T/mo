package ip2;

import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import gp2.l;
import gp2.m;
import h30.ButtonData;
import hp2.e;
import i50.BaseScaffoldData;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lip2/d;", "Lxw/f;", "Lip2/d$a;", "Lgp2/m$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ljp2/b;", "Lmx/a;", "h", "(Ljp2/b;)Lmx/a;", "params", "i", "(Lip2/d$a;)Lgp2/m$a;", "a", "Lmx/c;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, m.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ip2.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010$R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b%\u0010(R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b)\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b\"\u0010-R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b*\u0010-¨\u0006."}, d2 = {"Lip2/d$a;", "", "Lgp2/l;", "state", "Ljp2/b;", "attachmentType", "Lkotlin/Function1;", "Lhp2/a$a;", "Loq/i0;", "showBottomSheet", "Lhp2/e;", "onBottomSheetActionSelected", "Lg30/v;", "onBottomSheetStateChanged", "Lkotlin/Function0;", "onNext", "onBack", "onClose", "<init>", "(Lgp2/l;Ljp2/b;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgp2/l;", "h", "()Lgp2/l;", "b", "Ljp2/b;", "()Ljp2/b;", "c", "Ler/l;", "g", "()Ler/l;", "d", "e", "f", "Ler/a;", "()Ler/a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final jp2.b attachmentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<hp2.a.SelectOption, i0> showBottomSheet;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<e, i0> onBottomSheetActionSelected;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<v, i0> onBottomSheetStateChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(l lVar, jp2.b bVar, er.l<? super hp2.a.SelectOption, i0> lVar2, er.l<? super e, i0> lVar3, er.l<? super v, i0> lVar4, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = lVar;
            this.attachmentType = bVar;
            this.showBottomSheet = lVar2;
            this.onBottomSheetActionSelected = lVar3;
            this.onBottomSheetStateChanged = lVar4;
            this.onNext = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jp2.b getAttachmentType() {
            return this.attachmentType;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final er.l<e, i0> c() {
            return this.onBottomSheetActionSelected;
        }

        public final er.l<v, i0> d() {
            return this.onBottomSheetStateChanged;
        }

        public final er.a<i0> e() {
            return this.onClose;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && this.attachmentType == params.attachmentType && t.c(this.showBottomSheet, params.showBottomSheet) && t.c(this.onBottomSheetActionSelected, params.onBottomSheetActionSelected) && t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged) && t.c(this.onNext, params.onNext) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final er.a<i0> f() {
            return this.onNext;
        }

        public final er.l<hp2.a.SelectOption, i0> g() {
            return this.showBottomSheet;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final l getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.attachmentType.hashCode()) * 31) + this.showBottomSheet.hashCode()) * 31) + this.onBottomSheetActionSelected.hashCode()) * 31) + this.onBottomSheetStateChanged.hashCode()) * 31) + this.onNext.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", attachmentType=" + this.attachmentType + ", showBottomSheet=" + this.showBottomSheet + ", onBottomSheetActionSelected=" + this.onBottomSheetActionSelected + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onNext=" + this.onNext + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96156a;

        static {
            int[] iArr = new int[jp2.b.values().length];
            try {
                iArr[jp2.b.GUARDIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jp2.b.DIPLOMATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jp2.b.MSWIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f96156a = iArr;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label h(jp2.b bVar) {
        int i15 = b.f96156a[bVar.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(bp2.a.f21051a);
        }
        if (i15 == 2 || i15 == 3) {
            return this.labelProvider.c(bp2.a.f21079l0);
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final Params params) {
        params.g().b(new hp2.a.SelectOption(new er.l() { // from class: ip2.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.m(params, (e) obj);
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, e eVar) {
        params.c().b(eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.d().b(v.HIDDEN);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public m.a b(final Params params) {
        Label labelC;
        FilePickerData filePickerData;
        hp2.d.File fileB;
        l state = params.getState();
        if (t.c(state, l.a.b.f76060a)) {
            return m.a.b.f76075a;
        }
        if (!(state instanceof l.b.Presentation)) {
            if (state instanceof l.a.Error) {
                return new m.a.Error(((l.a.Error) state).getErrorVMS());
            }
            if (state instanceof l.b.Error) {
                return new m.a.Error(((l.b.Error) state).getErrorVMS());
            }
            throw new p();
        }
        l.b.Presentation presentation = (l.b.Presentation) state;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), h(presentation.getAttachmentType()), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.e(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        int i15 = b.f96156a[params.getAttachmentType().ordinal()];
        if (i15 == 1) {
            labelC = this.labelProvider.c(bp2.a.X);
        } else if (i15 == 2) {
            labelC = this.labelProvider.c(bp2.a.V);
        } else {
            if (i15 != 3) {
                throw new p();
            }
            labelC = this.labelProvider.c(bp2.a.W);
        }
        Label labelC2 = this.labelProvider.c(bp2.a.U);
        FilePickerData filePickerData2 = new FilePickerData(this.labelProvider.c(bp2.a.f21078l), presentation.getStateData().getShowValidationError() ? this.labelProvider.c(bp2.a.f21082n) : null, presentation.getStateData().f(), pq.v.q(new n40.e.AllowedFormats(jp2.a.a()), new n40.e.b.File(jp2.a.b(), null), new n40.e.SelectionLimit(4)), new er.a() { // from class: ip2.b
            @Override // er.a
            public final Object a() {
                return d.l(params);
            }
        }, Integer.MAX_VALUE);
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(presentation.getStateData().getBottomSheetValue(), false, params.d(), 2, null), null, null, null, 14, null);
        hp2.a bottomSheetData = presentation.getStateData().getBottomSheetData();
        if (bottomSheetData != null) {
            fileB = hp2.c.b(bottomSheetData, this.labelProvider, new er.a() { // from class: ip2.c
                @Override // er.a
                public final Object a() {
                    return d.q(params);
                }
            });
            filePickerData = filePickerData2;
        } else {
            filePickerData = filePickerData2;
            fileB = null;
        }
        return new m.a.Initialized(baseScaffoldData, labelC, labelC2, filePickerData, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(bp2.a.f21096u), null, 2, null), k30.d.a.f107773a, null, params.f(), 35, null), modalBottomSheetData, fileB, params.b());
    }
}
