package uf3;

import d60.ScrollControllerData;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import je3.b;
import k30.d;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import r30.CheckBoxRowData;
import sf3.State;
import sf3.e;
import sv0.VehicleCollisionDescriptionParticipant;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u0018"}, d2 = {"Luf3/a;", "Lxw/f;", "Luf3/a$a;", "Lsf3/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lje3/b;", "localizationFormatter", "<init>", "(Lmx/c;Lez/e;Lje3/b;)V", "Lsv0/n0;", "", "c", "(Lsv0/n0;)Ljava/lang/String;", "params", "e", "(Luf3/a$a;)Lsf3/e$a;", "a", "Lmx/c;", "b", "Lez/e;", "Lje3/b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b localizationFormatter;

    /* JADX INFO: renamed from: uf3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u001eR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u0018\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001f\u0010\u001e¨\u0006$"}, d2 = {"Luf3/a$a;", "", "Lsf3/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onConfirm", "onReject", "onPlaceClicked", "Lkotlin/Function1;", "", "onApproveChanged", "onExitAction", "<init>", "(Lsf3/d;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsf3/d;", "f", "()Lsf3/d;", "b", "Ler/a;", "()Ler/a;", "c", "e", "d", "Ler/l;", "()Ler/l;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirm;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onReject;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPlaceClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onApproveChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super Boolean, i0> lVar, er.a<i0> aVar4) {
            this.state = state;
            this.onConfirm = aVar;
            this.onReject = aVar2;
            this.onPlaceClicked = aVar3;
            this.onApproveChanged = lVar;
            this.onExitAction = aVar4;
        }

        public final l<Boolean, i0> a() {
            return this.onApproveChanged;
        }

        public final er.a<i0> b() {
            return this.onConfirm;
        }

        public final er.a<i0> c() {
            return this.onExitAction;
        }

        public final er.a<i0> d() {
            return this.onPlaceClicked;
        }

        public final er.a<i0> e() {
            return this.onReject;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onConfirm, params.onConfirm) && t.c(this.onReject, params.onReject) && t.c(this.onPlaceClicked, params.onPlaceClicked) && t.c(this.onApproveChanged, params.onApproveChanged) && t.c(this.onExitAction, params.onExitAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onConfirm.hashCode()) * 31) + this.onReject.hashCode()) * 31) + this.onPlaceClicked.hashCode()) * 31) + this.onApproveChanged.hashCode()) * 31) + this.onExitAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onConfirm=" + this.onConfirm + ", onReject=" + this.onReject + ", onPlaceClicked=" + this.onPlaceClicked + ", onApproveChanged=" + this.onApproveChanged + ", onExitAction=" + this.onExitAction + ')';
        }
    }

    public a(c cVar, ez.e eVar, b bVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.localizationFormatter = bVar;
    }

    private final String c(VehicleCollisionDescriptionParticipant vehicleCollisionDescriptionParticipant) {
        if (vehicleCollisionDescriptionParticipant.getSecondName() == null) {
            return c0.e(vehicleCollisionDescriptionParticipant.getFirstName()) + ' ' + c0.e(vehicleCollisionDescriptionParticipant.getSurname());
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(c0.e(vehicleCollisionDescriptionParticipant.getFirstName()));
        sb5.append(' ');
        b0 secondName = vehicleCollisionDescriptionParticipant.getSecondName();
        sb5.append(secondName != null ? c0.e(secondName) : null);
        sb5.append(' ');
        sb5.append(c0.e(vehicleCollisionDescriptionParticipant.getSurname()));
        return sb5.toString();
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        c cVar = this.labelProvider;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), this.labelProvider.c(md3.b.f125847v3), null, null, null, 28, null), null, null, null, new ScrollControllerData(params.getState().d(), false, false, 6, null), 29, null);
        Label labelC = cVar.c(md3.b.f125679a3);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.Z1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(ie3.a.a(this.dateFormatter, params.getState().getData().getCollisionCreatedDescription().getDate()), "crashDate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.X2).n("perpetratorNameLabel"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c(params.getState().getData().getCollisionCreatedDescription().getPerpetrator()), "perpetratorName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.f125695c3).n("victimNameLabel"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c(params.getState().getData().getCollisionCreatedDescription().getVictim()), "victimName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        BodySection bodySection = new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.Z2).n("localizationLabel"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(this.localizationFormatter.a(c0.e(params.getState().getData().getCollisionCreatedDescription().getLocalizationDescription()), params.getState().getData().getCollisionCreatedDescription().getCoordinates()), "localization"), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.a.b bVar = k30.a.b.f107765a;
        d.a aVar = d.a.f107773a;
        CardListData cardListData = new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(md3.b.Y2), null, 2, null), aVar, null, params.d(), 35, null)), null, 2815, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(md3.b.f125775m3).n("collisionDescriptionLabel"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(params.getState().getData().getCollisionCreatedDescription().getCollisionDescription()), "collisionDescription"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
        return new e.Data(baseScaffoldData, labelC, cVar.c(md3.b.X), cardListData, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(md3.b.f125739i), null, 2, null), aVar, null, params.b(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(md3.b.S), null, 2, null), new d.Secondary(null, 1, null), null, params.e(), 35, null), new CheckBoxSingleData(new CheckBoxRowData(null, params.getState().getIsApproveSelected(), params.a(), cVar.c(md3.b.f125687b3), null, null, null, null, 241, null), params.getState().getShowError() ? new r30.b.Error(null, cVar.c(md3.b.Y), 1, null) : r30.b.a.f171263a, r30.c.CONTENT_BOX, false, sf3.b.f181351a, 8, null));
    }
}
