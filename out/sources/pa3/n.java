package pa3;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import ia3.SummaryData;
import java.util.List;
import ka3.Error;
import ka3.p;
import mx.Label;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import y93.TripDetailsEditableData;
import z93.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lpa3/n;", "Lxw/f;", "Lpa3/n$a;", "Lka3/p$a;", "Lmx/c;", "labelProvider", "Lpa3/e;", "mainCardMapper", "Lpa3/h;", "reporterMapper", "Lpa3/g;", "participantsMapper", "Lpa3/j;", "stagesMapper", "Lpa3/b;", "contactDetailsMapper", "Lpa3/k;", "statementMapper", "Lpa3/a;", "buttonSectionMapper", "<init>", "(Lmx/c;Lpa3/e;Lpa3/h;Lpa3/g;Lpa3/j;Lpa3/b;Lpa3/k;Lpa3/a;)V", "params", "e", "(Lpa3/n$a;)Lka3/p$a;", "a", "Lmx/c;", "b", "Lpa3/e;", "c", "Lpa3/h;", "d", "Lpa3/g;", "Lpa3/j;", "f", "Lpa3/b;", "g", "Lpa3/k;", "h", "Lpa3/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements xw.f<Params, p.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e mainCardMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h reporterMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g participantsMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j stagesMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b contactDetailsMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k statementMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a buttonSectionMapper;

    /* JADX INFO: renamed from: pa3.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\f\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001e\u0010(R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b\"\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b*\u0010(R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b)\u0010.R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b&\u0010(R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b0\u0010.R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b/\u0010.R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b,\u0010(¨\u00061"}, d2 = {"Lpa3/n$a;", "", "Lka3/k;", "state", "", "showDownloadButton", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onClose", "onNext", "onEditClick", "Lkotlin/Function1;", "Lz93/s;", "onDownloadConfirmationClick", "onDeleteClick", "", "onStatementLinkClicked", "onStatementChecked", "onScrolledToError", "<init>", "(Lka3/k;ZLer/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lka3/k;", "k", "()Lka3/k;", "b", "Z", "j", "()Z", "c", "Ler/a;", "()Ler/a;", "d", "e", "f", "g", "Ler/l;", "()Ler/l;", "h", "i", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ka3.k state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showDownloadButton;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEditClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<s, i0> onDownloadConfirmationClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onStatementLinkClicked;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onStatementChecked;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToError;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ka3.k kVar, boolean z15, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.l<? super s, i0> lVar, er.a<i0> aVar5, er.l<? super String, i0> lVar2, er.l<? super Boolean, i0> lVar3, er.a<i0> aVar6) {
            this.state = kVar;
            this.showDownloadButton = z15;
            this.onBack = aVar;
            this.onClose = aVar2;
            this.onNext = aVar3;
            this.onEditClick = aVar4;
            this.onDownloadConfirmationClick = lVar;
            this.onDeleteClick = aVar5;
            this.onStatementLinkClicked = lVar2;
            this.onStatementChecked = lVar3;
            this.onScrolledToError = aVar6;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onDeleteClick;
        }

        public final er.l<s, i0> d() {
            return this.onDownloadConfirmationClick;
        }

        public final er.a<i0> e() {
            return this.onEditClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && this.showDownloadButton == params.showDownloadButton && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onNext, params.onNext) && t.c(this.onEditClick, params.onEditClick) && t.c(this.onDownloadConfirmationClick, params.onDownloadConfirmationClick) && t.c(this.onDeleteClick, params.onDeleteClick) && t.c(this.onStatementLinkClicked, params.onStatementLinkClicked) && t.c(this.onStatementChecked, params.onStatementChecked) && t.c(this.onScrolledToError, params.onScrolledToError);
        }

        public final er.a<i0> f() {
            return this.onNext;
        }

        public final er.a<i0> g() {
            return this.onScrolledToError;
        }

        public final er.l<Boolean, i0> h() {
            return this.onStatementChecked;
        }

        public int hashCode() {
            return (((((((((((((((((((this.state.hashCode() * 31) + Boolean.hashCode(this.showDownloadButton)) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onNext.hashCode()) * 31) + this.onEditClick.hashCode()) * 31) + this.onDownloadConfirmationClick.hashCode()) * 31) + this.onDeleteClick.hashCode()) * 31) + this.onStatementLinkClicked.hashCode()) * 31) + this.onStatementChecked.hashCode()) * 31) + this.onScrolledToError.hashCode();
        }

        public final er.l<String, i0> i() {
            return this.onStatementLinkClicked;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getShowDownloadButton() {
            return this.showDownloadButton;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final ka3.k getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", showDownloadButton=" + this.showDownloadButton + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onNext=" + this.onNext + ", onEditClick=" + this.onEditClick + ", onDownloadConfirmationClick=" + this.onDownloadConfirmationClick + ", onDeleteClick=" + this.onDeleteClick + ", onStatementLinkClicked=" + this.onStatementLinkClicked + ", onStatementChecked=" + this.onStatementChecked + ", onScrolledToError=" + this.onScrolledToError + ')';
        }
    }

    public n(mx.c cVar, e eVar, h hVar, g gVar, j jVar, b bVar, k kVar, a aVar) {
        this.labelProvider = cVar;
        this.mainCardMapper = eVar;
        this.reporterMapper = hVar;
        this.participantsMapper = gVar;
        this.stagesMapper = jVar;
        this.contactDetailsMapper = bVar;
        this.statementMapper = kVar;
        this.buttonSectionMapper = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, ka3.k kVar) {
        params.d().b(s.a(((ka3.k.a) kVar).getDetailsData().getTripUuid()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p.a b(final Params params) {
        int i15;
        int i16;
        final ka3.k state = params.getState();
        if (state instanceof Error) {
            return new p.a.Error(((Error) state).getErrorVMSAdapter());
        }
        if (state instanceof ka3.Error) {
            return new p.a.Error(((ka3.Error) state).getErrorVMSAdapter());
        }
        if (state instanceof ka3.Error) {
            return new p.a.Error(((ka3.Error) state).getErrorVMSAdapter());
        }
        if (state instanceof ka3.k.a) {
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(r93.a.f172460a1), null, null, null, 28, null), null, null, null, null, 61, null);
            ka3.k.a aVar = (ka3.k.a) state;
            CustomSingleCardData customSingleCardDataB = this.mainCardMapper.b(new e.Params(aVar.getDetailsData().getTripType(), aVar.getDetailsData().d()));
            TripDetailsEditableData detailsData = aVar.getDetailsData();
            List listS = v.s(this.reporterMapper.b(new h.Params(detailsData.getPersonalData(), detailsData.getContactDetails())), this.participantsMapper.b(new g.Params(detailsData.getChosenParticipantsData(), detailsData.getPersonalData())), this.stagesMapper.b(new j.Params(detailsData.d())), this.contactDetailsMapper.b(new b.Params(detailsData.getContactDetails())));
            List<DefaultSingleCardData> listB = this.buttonSectionMapper.b(new a.Params(params.getShowDownloadButton(), params.e(), new er.a() { // from class: pa3.m
                @Override // er.a
                public final Object a() {
                    return n.f(params, state);
                }
            }, params.c()));
            ka3.k state2 = params.getState();
            ka3.k.a.InterfaceC2614a interfaceC2614a = state2 instanceof ka3.k.a.InterfaceC2614a ? (ka3.k.a.InterfaceC2614a) state2 : null;
            return new p.a.InitializedDetails(baseScaffoldData, customSingleCardDataB, listS, listB, interfaceC2614a != null ? interfaceC2614a.getDialogVmsAdapter() : null, params.a());
        }
        if (!(state instanceof ka3.k.c)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(r93.a.R0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        mx.c cVar = this.labelProvider;
        ka3.k.c cVar2 = (ka3.k.c) state;
        mb3.a tripContext = cVar2.getTripContext();
        if (tripContext instanceof mb3.a.Edit) {
            i15 = r93.a.L0;
        } else {
            if (!(tripContext instanceof mb3.a.C3081a)) {
                throw new oq.p();
            }
            i15 = r93.a.f172479h;
        }
        Label labelC = cVar.c(i15);
        Label labelC2 = this.labelProvider.c(r93.a.K0);
        CustomSingleCardData customSingleCardDataB2 = this.mainCardMapper.b(new e.Params(null, cVar2.getSummaryData().d(), 1, null));
        SummaryData summaryData = cVar2.getSummaryData();
        List listS2 = v.s(this.reporterMapper.b(new h.Params(summaryData.getPersonalData(), summaryData.getContactDetails())), this.participantsMapper.b(new g.Params(summaryData.getChosenParticipantsData(), summaryData.getPersonalData())), this.stagesMapper.b(new j.Params(summaryData.d())), this.contactDetailsMapper.b(new b.Params(summaryData.getContactDetails())));
        p.a.InitializedSummary.Statement statementB = this.statementMapper.b(new k.Params(cVar2.getStatementData(), params.i(), params.h(), params.g()));
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.d.a aVar2 = k30.d.a.f107773a;
        mx.c cVar3 = this.labelProvider;
        mb3.a tripContext2 = cVar2.getTripContext();
        if (t.c(tripContext2, mb3.a.C3081a.f125261a)) {
            i16 = r93.a.R;
        } else {
            if (!(tripContext2 instanceof mb3.a.Edit)) {
                throw new oq.p();
            }
            i16 = r93.a.P;
        }
        return new p.a.InitializedSummary(baseScaffoldData2, labelC, labelC2, customSingleCardDataB2, listS2, statementB, new ButtonData(null, null, large, new k30.c.WithText(cVar3.c(i16), null, 2, null), aVar2, null, params.f(), 35, null));
    }
}
