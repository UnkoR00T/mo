package a71;

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
import r30.CheckBoxRowData;
import t40.InfoRowListData;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import z61.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"La71/d;", "Lxw/f;", "La71/d$a;", "Ly61/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lb71/b;", "attachmentType", "Lmx/a;", "q", "(Lb71/b;)Lmx/a;", "i", "h", "", "m", "(Lb71/b;)I", "Lt40/b;", "l", "(Lb71/b;)Lt40/b;", "params", "r", "(La71/d$a;)Ly61/d$a;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, y61.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: a71.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b#\u0010*R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b'\u0010*R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b-\u0010*R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b,\u0010/R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b\u001f\u0010/R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b+\u0010/¨\u00061"}, d2 = {"La71/d$a;", "", "Ly61/c;", "state", "Lb71/b;", "attachmentType", "Lkotlin/Function1;", "Lz61/a$a;", "Loq/i0;", "showBottomSheet", "Lz61/e;", "onBottomSheetActionSelected", "Lg30/v;", "onBottomSheetStateChanged", "", "onStatementChecked", "Lkotlin/Function0;", "onNext", "onBack", "onClose", "<init>", "(Ly61/c;Lb71/b;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ly61/c;", "h", "()Ly61/c;", "b", "Lb71/b;", "getAttachmentType", "()Lb71/b;", "c", "Ler/l;", "g", "()Ler/l;", "d", "e", "f", "Ler/a;", "()Ler/a;", "i", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y61.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b71.b attachmentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<z61.a.SelectOption, i0> showBottomSheet;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<e, i0> onBottomSheetActionSelected;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onBottomSheetStateChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onStatementChecked;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(y61.c cVar, b71.b bVar, l<? super z61.a.SelectOption, i0> lVar, l<? super e, i0> lVar2, l<? super v, i0> lVar3, l<? super Boolean, i0> lVar4, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = cVar;
            this.attachmentType = bVar;
            this.showBottomSheet = lVar;
            this.onBottomSheetActionSelected = lVar2;
            this.onBottomSheetStateChanged = lVar3;
            this.onStatementChecked = lVar4;
            this.onNext = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<e, i0> b() {
            return this.onBottomSheetActionSelected;
        }

        public final l<v, i0> c() {
            return this.onBottomSheetStateChanged;
        }

        public final er.a<i0> d() {
            return this.onClose;
        }

        public final er.a<i0> e() {
            return this.onNext;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && this.attachmentType == params.attachmentType && t.c(this.showBottomSheet, params.showBottomSheet) && t.c(this.onBottomSheetActionSelected, params.onBottomSheetActionSelected) && t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged) && t.c(this.onStatementChecked, params.onStatementChecked) && t.c(this.onNext, params.onNext) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final l<Boolean, i0> f() {
            return this.onStatementChecked;
        }

        public final l<z61.a.SelectOption, i0> g() {
            return this.showBottomSheet;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final y61.c getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.attachmentType.hashCode()) * 31) + this.showBottomSheet.hashCode()) * 31) + this.onBottomSheetActionSelected.hashCode()) * 31) + this.onBottomSheetStateChanged.hashCode()) * 31) + this.onStatementChecked.hashCode()) * 31) + this.onNext.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", attachmentType=" + this.attachmentType + ", showBottomSheet=" + this.showBottomSheet + ", onBottomSheetActionSelected=" + this.onBottomSheetActionSelected + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onStatementChecked=" + this.onStatementChecked + ", onNext=" + this.onNext + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4013a;

        static {
            int[] iArr = new int[b71.b.values().length];
            try {
                iArr[b71.b.TEMPORARY_REASON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b71.b.OLD_APPLICATION_MONEY_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b71.b.NEW_APPLICATION_MONEY_TRANSFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b71.b.SIGNED_CONSENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b71.b.OTHER_PARENT_UNABLE_TO_CONSENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b71.b.ABROAD_TREATMENT_CONFIRMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b71.b.KDR_CONFIRMATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b71.b.TECHNICAL_ISSUE_CONFIRMATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f4013a = iArr;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label h(b71.b attachmentType) {
        switch (b.f4013a[attachmentType.ordinal()]) {
            case 1:
                return this.labelProvider.c(w51.a.O0);
            case 2:
                return this.labelProvider.c(w51.a.f210463z);
            case 3:
                return this.labelProvider.c(w51.a.f210416s);
            case 4:
                return this.labelProvider.c(w51.a.f210388o);
            case 5:
                return this.labelProvider.c(w51.a.f210451x);
            case 6:
            case 8:
                return null;
            case 7:
                return this.labelProvider.c(w51.a.f210395p);
            default:
                throw new p();
        }
    }

    private final Label i(b71.b attachmentType) {
        switch (b.f4013a[attachmentType.ordinal()]) {
            case 1:
                return this.labelProvider.c(w51.a.P0);
            case 2:
            case 3:
                return this.labelProvider.c(w51.a.A);
            case 4:
                return this.labelProvider.c(w51.a.f210381n);
            case 5:
                return this.labelProvider.c(w51.a.f210444w);
            case 6:
                return this.labelProvider.c(w51.a.I);
            case 7:
                return this.labelProvider.c(w51.a.f210402q);
            case 8:
                return this.labelProvider.c(w51.a.D);
            default:
                throw new p();
        }
    }

    private final InfoRowListData l(b71.b attachmentType) {
        switch (b.f4013a[attachmentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return null;
            case 4:
                return new InfoRowListData(pq.v.q(new t40.a.C4874a(this.labelProvider.c(w51.a.f210360k)), new t40.a.C4874a(this.labelProvider.c(w51.a.f210374m)), new t40.a.C4874a(this.labelProvider.c(w51.a.f210367l))));
            case 5:
                return new InfoRowListData(pq.v.q(new t40.a.C4874a(this.labelProvider.c(w51.a.f210423t)), new t40.a.C4874a(this.labelProvider.c(w51.a.f210437v)), new t40.a.C4874a(this.labelProvider.c(w51.a.f210430u))));
            case 6:
                return new InfoRowListData(pq.v.q(new t40.a.C4874a(this.labelProvider.c(w51.a.G)), new t40.a.C4874a(this.labelProvider.c(w51.a.H))));
            case 8:
                return new InfoRowListData(pq.v.q(new t40.a.C4874a(this.labelProvider.c(w51.a.B)), new t40.a.C4874a(this.labelProvider.c(w51.a.C))));
            default:
                throw new p();
        }
    }

    private final int m(b71.b attachmentType) {
        switch (b.f4013a[attachmentType.ordinal()]) {
            case 1:
                return 4;
            case 2:
            case 3:
                return 1;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return 2;
            default:
                throw new p();
        }
    }

    private final Label q(b71.b attachmentType) {
        switch (b.f4013a[attachmentType.ordinal()]) {
            case 1:
                return this.labelProvider.c(w51.a.Q0);
            case 2:
            case 3:
                return this.labelProvider.c(w51.a.f210325f);
            case 4:
            case 5:
                return this.labelProvider.c(w51.a.F);
            case 6:
                return this.labelProvider.c(w51.a.J);
            case 7:
                return this.labelProvider.c(w51.a.f210409r);
            case 8:
                return this.labelProvider.c(w51.a.E);
            default:
                throw new p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final Params params) {
        params.g().b(new z61.a.SelectOption(new l() { // from class: a71.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.u(params, (e) obj);
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, e eVar) {
        params.b().b(eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.c().b(v.HIDDEN);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public y61.d.a b(final Params params) {
        y61.d.a.StatementData statementData;
        r30.b error;
        y61.c state = params.getState();
        if (t.c(state, y61.c.a.b.f224441a)) {
            return y61.d.a.b.f224579a;
        }
        if (!(state instanceof y61.c.b.Presentation)) {
            if (state instanceof y61.c.a.Error) {
                return new y61.d.a.Error(((y61.c.a.Error) state).getErrorVMS());
            }
            if (state instanceof y61.c.b.Error) {
                return new y61.d.a.Error(((y61.c.b.Error) state).getErrorVMS());
            }
            throw new p();
        }
        y61.c.b.Presentation presentation = (y61.c.b.Presentation) state;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), q(presentation.getStateData().getAttachmentType()), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.d(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelI = i(presentation.getStateData().getAttachmentType());
        Label labelH = h(presentation.getStateData().getAttachmentType());
        FilePickerData filePickerData = new FilePickerData(this.labelProvider.c(w51.a.Y3), presentation.getStateData().getShowValidationError() ? this.labelProvider.c(w51.a.f210302b4) : null, presentation.getStateData().g(), pq.v.q(new n40.e.AllowedFormats(b71.a.a()), new n40.e.b.File(b71.a.b(), null), new n40.e.SelectionLimit(m(presentation.getStateData().getAttachmentType()))), new er.a() { // from class: a71.b
            @Override // er.a
            public final Object a() {
                return d.s(params);
            }
        }, m(presentation.getStateData().getAttachmentType()));
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(presentation.getStateData().getBottomSheetValue(), false, params.c(), 2, null), null, null, null, 14, null);
        z61.a bottomSheetData = presentation.getStateData().getBottomSheetData();
        z61.d.File fileB = bottomSheetData != null ? z61.c.b(bottomSheetData, this.labelProvider, new er.a() { // from class: a71.c
            @Override // er.a
            public final Object a() {
                return d.v(params);
            }
        }) : null;
        y61.c.b.StateData.StatementData statementData2 = presentation.getStateData().getStatementData();
        if (statementData2 != null) {
            Label labelC = this.labelProvider.c(w51.a.E4);
            CheckBoxRowData checkBoxRowData = new CheckBoxRowData("statementCheckBox", statementData2.getIsChecked(), params.f(), this.labelProvider.c(w51.a.f210457y), null, null, null, null, 240, null);
            boolean showValidationError = statementData2.getShowValidationError();
            if (showValidationError) {
                error = new r30.b.Error(null, this.labelProvider.c(w51.a.F4), 1, null);
            } else {
                if (showValidationError) {
                    throw new p();
                }
                error = r30.b.a.f171263a;
            }
            statementData = new y61.d.a.StatementData(labelC, new CheckBoxSingleData(checkBoxRowData, error, r30.c.CONTENT_BOX, false, null, 24, null));
        } else {
            statementData = null;
        }
        return new y61.d.a.Initialized(baseScaffoldData, labelI, labelH, filePickerData, statementData, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210365k4), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null), modalBottomSheetData, fileB, params.a(), l(presentation.getStateData().getAttachmentType()));
    }
}
