package b33;

import a50.RadioButtonData;
import androidx.compose.ui.graphics.Color;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import cb4.i;
import d60.ScrollControllerData;
import d60.j;
import er.l;
import er.p;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import t50.TextAreaData;
import t50.s;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import z23.b0;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb33/g;", "Lxw/f;", "Lb33/g$a;", "Lz23/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "m", "(Lb33/g$a;)Lz23/e$a;", "a", "Lmx/c;", "b", "Lez/e;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, z23.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: b33.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b!\u0010-R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b.\u0010-R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010-R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b1\u0010-R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b)\u0010(R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b/\u0010-R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b3\u0010-R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b2\u0010-R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b+\u0010-R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b%\u0010-¨\u00064"}, d2 = {"Lb33/g$a;", "", "Lz23/d;", "state", "Lkotlin/Function1;", "Lk23/f;", "Loq/i0;", "onDateAnswerSelect", "", "onDescriptionChange", "Lkotlin/Function0;", "onAddAttachmentClick", "onTakePhoto", "onPickPhoto", "onPickFile", "Lg30/v;", "onBottomSheetStateChanged", "onDateClick", "onTimeClick", "onNextClick", "onClose", "onBack", "<init>", "(Lz23/d;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz23/d;", "m", "()Lz23/d;", "b", "Ler/l;", "e", "()Ler/l;", "c", "g", "d", "Ler/a;", "()Ler/a;", "k", "f", "j", "i", "h", "l", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final z23.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<k23.f, i0> onDateAnswerSelect;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onDescriptionChange;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddAttachmentClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTakePhoto;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPickPhoto;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPickFile;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onBottomSheetStateChanged;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDateClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTimeClick;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(z23.d dVar, l<? super k23.f, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, l<? super v, i0> lVar3, er.a<i0> aVar5, er.a<i0> aVar6, er.a<i0> aVar7, er.a<i0> aVar8, er.a<i0> aVar9) {
            this.state = dVar;
            this.onDateAnswerSelect = lVar;
            this.onDescriptionChange = lVar2;
            this.onAddAttachmentClick = aVar;
            this.onTakePhoto = aVar2;
            this.onPickPhoto = aVar3;
            this.onPickFile = aVar4;
            this.onBottomSheetStateChanged = lVar3;
            this.onDateClick = aVar5;
            this.onTimeClick = aVar6;
            this.onNextClick = aVar7;
            this.onClose = aVar8;
            this.onBack = aVar9;
        }

        public final er.a<i0> a() {
            return this.onAddAttachmentClick;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final l<v, i0> c() {
            return this.onBottomSheetStateChanged;
        }

        public final er.a<i0> d() {
            return this.onClose;
        }

        public final l<k23.f, i0> e() {
            return this.onDateAnswerSelect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onDateAnswerSelect, params.onDateAnswerSelect) && t.c(this.onDescriptionChange, params.onDescriptionChange) && t.c(this.onAddAttachmentClick, params.onAddAttachmentClick) && t.c(this.onTakePhoto, params.onTakePhoto) && t.c(this.onPickPhoto, params.onPickPhoto) && t.c(this.onPickFile, params.onPickFile) && t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged) && t.c(this.onDateClick, params.onDateClick) && t.c(this.onTimeClick, params.onTimeClick) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onClose, params.onClose) && t.c(this.onBack, params.onBack);
        }

        public final er.a<i0> f() {
            return this.onDateClick;
        }

        public final l<String, i0> g() {
            return this.onDescriptionChange;
        }

        public final er.a<i0> h() {
            return this.onNextClick;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.state.hashCode() * 31) + this.onDateAnswerSelect.hashCode()) * 31) + this.onDescriptionChange.hashCode()) * 31) + this.onAddAttachmentClick.hashCode()) * 31) + this.onTakePhoto.hashCode()) * 31) + this.onPickPhoto.hashCode()) * 31) + this.onPickFile.hashCode()) * 31) + this.onBottomSheetStateChanged.hashCode()) * 31) + this.onDateClick.hashCode()) * 31) + this.onTimeClick.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onBack.hashCode();
        }

        public final er.a<i0> i() {
            return this.onPickFile;
        }

        public final er.a<i0> j() {
            return this.onPickPhoto;
        }

        public final er.a<i0> k() {
            return this.onTakePhoto;
        }

        public final er.a<i0> l() {
            return this.onTimeClick;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final z23.d getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onDateAnswerSelect=" + this.onDateAnswerSelect + ", onDescriptionChange=" + this.onDescriptionChange + ", onAddAttachmentClick=" + this.onAddAttachmentClick + ", onTakePhoto=" + this.onTakePhoto + ", onPickPhoto=" + this.onPickPhoto + ", onPickFile=" + this.onPickFile + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onDateClick=" + this.onDateClick + ", onTimeClick=" + this.onTimeClick + ", onNextClick=" + this.onNextClick + ", onClose=" + this.onClose + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16410a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1576998332);
            if (p076m2.t.k()) {
                p076m2.t.o(1576998332, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.details.mapper.DetailsScreenMapper.invoke.<anonymous>.<anonymous> (DetailsScreenMapper.kt:85)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public g(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.i().a();
        params.c().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.j().a();
        params.c().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.k().a();
        params.c().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.e().b(k23.f.YES);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.e().b(k23.f.NO);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(z23.d dVar, Params params) {
        v bottomSheetValue = ((z23.d.a) dVar).getData().getBottomSheetValue();
        v vVar = v.HIDDEN;
        if (bottomSheetValue != vVar) {
            params.c().b(vVar);
        } else {
            params.b().a();
        }
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x035b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0364  */
    /* JADX WARN: Code duplicated, block: B:51:0x0368  */
    /* JADX WARN: Code duplicated, block: B:52:0x0376  */
    /* JADX WARN: Code duplicated, block: B:54:0x037e  */
    /* JADX WARN: Code duplicated, block: B:57:0x03ba  */
    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public z23.e.a b(final Params params) {
        b50.d.c cVar;
        b50.d error;
        hz.b descriptionValidation;
        t50.e.Default r15;
        t50.e error2;
        final z23.d state = params.getState();
        if (t.c(state, z23.d.b.f232646a)) {
            return z23.e.a.b.f232666a;
        }
        if (state instanceof z23.d.LoadingError) {
            return new z23.e.a.Error(((z23.d.LoadingError) state).getErrorVMSAdapter());
        }
        if (!(state instanceof z23.d.a)) {
            throw new oq.p();
        }
        mx.c cVar2 = this.labelProvider;
        z23.d state2 = params.getState();
        z23.d.a.Dialog dialog = state2 instanceof z23.d.a.Dialog ? (z23.d.a.Dialog) state2 : null;
        i dialogVMSAdapter = dialog != null ? dialog.getDialogVMSAdapter() : null;
        j<z23.c> jVarK = ((z23.d.a) params.getState()).getData().k();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), cVar2.c(h23.b.C0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f16410a, null, params.d(), 4, null)), null, 20, null), null, null, null, new ScrollControllerData(((z23.d.a) params.getState()).getData().k(), false, false, 6, null), 29, null);
        Label labelC = cVar2.c(h23.b.B0);
        Label labelC2 = cVar2.c(h23.b.A0);
        z23.d.a aVar = (z23.d.a) state;
        FilePickerData filePickerData = new FilePickerData(cVar2.c(h23.b.f80187w), null, aVar.getData().j(), pq.v.q(new n40.e.AllowedFormats(b0.INSTANCE.a()), new n40.e.b.File(xw.a.b(1.0E7f), null), new n40.e.SelectionLimit(aVar.getData().getMaxAttachments())), params.a(), aVar.getData().getMaxAttachments());
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(aVar.getData().getBottomSheetValue(), false, params.c(), 2, null), null, null, null, 14, null);
        List listQ = pq.v.q(new FileBottomSheetItemData(jz.a.f106760e0, cVar2.c(h23.b.f80187w), new er.a() { // from class: b33.a
            @Override // er.a
            public final Object a() {
                return g.q(params);
            }
        }), new FileBottomSheetItemData(jz.a.f106760e0, cVar2.c(h23.b.f80190x), new er.a() { // from class: b33.b
            @Override // er.a
            public final Object a() {
                return g.r(params);
            }
        }), new FileBottomSheetItemData(jz.a.f106818m, cVar2.c(h23.b.f80196z), new er.a() { // from class: b33.c
            @Override // er.a
            public final Object a() {
                return g.s(params);
            }
        }));
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar2.c(h23.b.H), null, 2, null), k30.d.a.f107773a, null, params.h(), 35, null);
        Label labelC3 = cVar2.c(h23.b.f80188w0);
        z23.c cVar3 = z23.c.ANSWER;
        RadioButtonItemData radioButtonItemData = new RadioButtonItemData(false, ((z23.d.a) params.getState()).getData().getSelectedDateAnswer() == k23.f.YES, false, 5, null);
        Label labelC4 = cVar2.c(h23.b.f80131d0);
        Label labelC5 = cVar2.c(h23.b.f80166p);
        fz.b.LocalDate selectedDate = ((z23.d.a) params.getState()).getData().getSelectedDate();
        InputDateTimeData inputDateTimeData = new InputDateTimeData("detailsDateInput", labelC5, selectedDate != null ? this.dateFormatter.d(selectedDate, fz.c.DOTTED) : null, InputDateTimeData.b.C5303a.f203783c, ((z23.d.a) params.getState()).getData().getDateValidation(), null, null, null, false, null, params.f(), 992, null);
        Label labelC6 = cVar2.c(h23.b.D);
        fz.b.OffsetTime selectedTime = ((z23.d.a) params.getState()).getData().getSelectedTime();
        List listQ2 = pq.v.q(new RadioButtonRow(radioButtonItemData, new er.a() { // from class: b33.d
            @Override // er.a
            public final Object a() {
                return g.u(params);
            }
        }, labelC4, null, new a33.b(inputDateTimeData, new InputDateTimeData("detailsTimeInput", labelC6, selectedTime != null ? this.dateFormatter.d(selectedTime, fz.c.ONLY_HOUR) : null, InputDateTimeData.b.c.f203785c, ((z23.d.a) params.getState()).getData().getTimeValidation(), null, null, null, false, null, params.l(), 992, null)), 8, null), new RadioButtonRow(new RadioButtonItemData(false, ((z23.d.a) params.getState()).getData().getSelectedDateAnswer() == k23.f.NO, false, 5, null), new er.a() { // from class: b33.e
            @Override // er.a
            public final Object a() {
                return g.v(params);
            }
        }, cVar2.c(h23.b.I), null, null, 24, null));
        b50.e.a aVar2 = b50.e.a.f16684a;
        hz.b answerValidation = ((z23.d.a) params.getState()).getData().getAnswerValidation();
        if (!(answerValidation instanceof hz.b.d)) {
            if (answerValidation instanceof hz.b.Invalid) {
                error = new b50.d.Error(((hz.b.Invalid) answerValidation).getMessage());
            } else {
                if (!t.c(answerValidation, hz.b.C2039b.f86846c)) {
                    throw new oq.p();
                }
                cVar = b50.d.c.f16683a;
            }
            RadioButtonData radioButtonData = new RadioButtonData(listQ2, aVar2, error, null, null, null, cVar3, 56, null);
            Label labelC7 = cVar2.c(h23.b.f80197z0);
            s.Fix fix = new s.Fix(0, 1, null);
            Label labelC8 = cVar2.c(h23.b.f80194y0);
            String description = ((z23.d.a) params.getState()).getData().getDescription();
            l<String, i0> lVarG = params.g();
            t50.a.Visible visible = new t50.a.Visible(500, null, 2, null);
            descriptionValidation = ((z23.d.a) params.getState()).getData().getDescriptionValidation();
            if (descriptionValidation instanceof hz.b.d) {
                if (descriptionValidation instanceof hz.b.Invalid) {
                    error2 = new t50.e.Error(((hz.b.Invalid) descriptionValidation).getMessage());
                } else {
                    if (t.c(descriptionValidation, hz.b.C2039b.f86846c)) {
                        throw new oq.p();
                    }
                    r15 = new t50.e.Default(null, 1, null);
                }
                return new z23.e.a.Displayed(dialogVMSAdapter, jVarK, baseScaffoldData, labelC3, radioButtonData, labelC, labelC2, filePickerData, modalBottomSheetData, listQ, labelC7, new TextAreaData("detailsDescription", labelC8, fix, null, error2, description, false, visible, null, 0, null, z23.c.DESCRIPTION, lVarG, null, 10056, null), buttonData, new er.a() { // from class: b33.f
                    @Override // er.a
                    public final Object a() {
                        return g.x(state, params);
                    }
                });
            }
            r15 = new t50.e.Default(null, 1, null);
            error2 = r15;
            return new z23.e.a.Displayed(dialogVMSAdapter, jVarK, baseScaffoldData, labelC3, radioButtonData, labelC, labelC2, filePickerData, modalBottomSheetData, listQ, labelC7, new TextAreaData("detailsDescription", labelC8, fix, null, error2, description, false, visible, null, 0, null, z23.c.DESCRIPTION, lVarG, null, 10056, null), buttonData, new er.a() { // from class: b33.f
                @Override // er.a
                public final Object a() {
                    return g.x(state, params);
                }
            });
        }
        cVar = b50.d.c.f16683a;
        error = cVar;
        RadioButtonData radioButtonData2 = new RadioButtonData(listQ2, aVar2, error, null, null, null, cVar3, 56, null);
        Label labelC9 = cVar2.c(h23.b.f80197z0);
        s.Fix fix2 = new s.Fix(0, 1, null);
        Label labelC10 = cVar2.c(h23.b.f80194y0);
        String description2 = ((z23.d.a) params.getState()).getData().getDescription();
        l<String, i0> lVarG2 = params.g();
        t50.a.Visible visible2 = new t50.a.Visible(500, null, 2, null);
        descriptionValidation = ((z23.d.a) params.getState()).getData().getDescriptionValidation();
        if (descriptionValidation instanceof hz.b.d) {
            if (descriptionValidation instanceof hz.b.Invalid) {
                error2 = new t50.e.Error(((hz.b.Invalid) descriptionValidation).getMessage());
            } else {
                if (t.c(descriptionValidation, hz.b.C2039b.f86846c)) {
                    throw new oq.p();
                }
                r15 = new t50.e.Default(null, 1, null);
            }
            return new z23.e.a.Displayed(dialogVMSAdapter, jVarK, baseScaffoldData, labelC3, radioButtonData2, labelC, labelC2, filePickerData, modalBottomSheetData, listQ, labelC9, new TextAreaData("detailsDescription", labelC10, fix2, null, error2, description2, false, visible2, null, 0, null, z23.c.DESCRIPTION, lVarG2, null, 10056, null), buttonData, new er.a() { // from class: b33.f
                @Override // er.a
                public final Object a() {
                    return g.x(state, params);
                }
            });
        }
        r15 = new t50.e.Default(null, 1, null);
        error2 = r15;
        return new z23.e.a.Displayed(dialogVMSAdapter, jVarK, baseScaffoldData, labelC3, radioButtonData2, labelC, labelC2, filePickerData, modalBottomSheetData, listQ, labelC9, new TextAreaData("detailsDescription", labelC10, fix2, null, error2, description2, false, visible2, null, 0, null, z23.c.DESCRIPTION, lVarG2, null, 10056, null), buttonData, new er.a() { // from class: b33.f
            @Override // er.a
            public final Object a() {
                return g.x(state, params);
            }
        });
    }
}
