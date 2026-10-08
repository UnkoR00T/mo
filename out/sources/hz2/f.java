package hz2;

import fr.t;
import gz2.ConfirmMidSharedData;
import gz2.o;
import gz2.p;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.Locale;
import jk0.ExternalQualifiedSignatureStartResponse;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lhz2/f;", "Lxw/f;", "Lhz2/f$a;", "Lgz2/p$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lgz2/m;", "data", "Lmx/a;", "c", "(Lgz2/m;)Lmx/a;", "params", "e", "(Lhz2/f$a;)Lgz2/p$a;", "a", "Lmx/c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, p.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: hz2.f$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lhz2/f$a;", "", "Lgz2/o;", "state", "Lkotlin/Function0;", "Loq/i0;", "showDialog", "onConfirm", "onCloseAction", "onBackAction", "onNextAction", "<init>", "(Lgz2/o;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz2/o;", "f", "()Lgz2/o;", "b", "Ler/a;", "e", "()Ler/a;", "c", "d", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> showDialog;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirm;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        public Params(o oVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = oVar;
            this.showDialog = aVar;
            this.onConfirm = aVar2;
            this.onCloseAction = aVar3;
            this.onBackAction = aVar4;
            this.onNextAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final er.a<i0> c() {
            return this.onConfirm;
        }

        public final er.a<i0> d() {
            return this.onNextAction;
        }

        public final er.a<i0> e() {
            return this.showDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.showDialog, params.showDialog) && t.c(this.onConfirm, params.onConfirm) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onNextAction, params.onNextAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final o getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.showDialog.hashCode()) * 31) + this.onConfirm.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onNextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", showDialog=" + this.showDialog + ", onConfirm=" + this.onConfirm + ", onCloseAction=" + this.onCloseAction + ", onBackAction=" + this.onBackAction + ", onNextAction=" + this.onNextAction + ')';
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(ConfirmMidSharedData data) {
        StringBuilder sb5 = new StringBuilder();
        b0 name = data.getName();
        if (name != null) {
            sb5.append(c0.e(name).toUpperCase(Locale.ROOT));
        }
        b0 secondName = data.getSecondName();
        if (secondName != null) {
            sb5.append(' ' + c0.e(secondName).toUpperCase(Locale.ROOT));
        }
        return mx.b.d(sb5.toString(), "namesValue");
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p.a b(Params params) {
        String strE;
        o state = params.getState();
        if (t.c(state, o.c.f78594a) || (state instanceof o.LoadMIdCardData)) {
            return p.a.c.f78604a;
        }
        if (!(state instanceof o.Initialized)) {
            if (state instanceof o.Error) {
                return new p.a.Error(((o.Error) state).getErrorVMS());
            }
            if (t.c(state, o.b.f78593a)) {
                return new p.a.InfoPage(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(uy2.b.O), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(uy2.b.N), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(uy2.b.L)), new t40.a.C4874a(this.labelProvider.c(uy2.b.M)))), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(uy2.b.f202294h), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null), params.a());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.e()), this.labelProvider.c(uy2.b.f202323v0), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(uy2.b.f202321u0);
        Label labelC2 = this.labelProvider.c(uy2.b.f202319t0);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(uy2.b.f202311p0), null, null, 0, 0, null, 62, null);
        o.Initialized initialized = (o.Initialized) state;
        ExternalQualifiedSignatureStartResponse signatureStartResponse = initialized.getConfirmMidSharedData().getSignatureStartResponse();
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(signatureStartResponse != null ? signatureStartResponse.getProviderName() : null, "providerName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(uy2.b.f202313q0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(c(initialized.getConfirmMidSharedData()), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(uy2.b.f202315r0), null, null, 0, 0, null, 62, null);
        b0 surname = initialized.getConfirmMidSharedData().getSurname();
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d((surname == null || (strE = c0.e(surname)) == null) ? null : strE.toUpperCase(Locale.ROOT), "surnameValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel3 = new SingleCardLabel(this.labelProvider.c(uy2.b.f202317s0), null, null, 0, 0, null, 62, null);
        b0 pesel = initialized.getConfirmMidSharedData().getPesel();
        return new p.a.Initialized(baseScaffoldData, labelC, labelC2, new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel3, new n50.b.Title(new SingleCardLabel(mx.b.d(pesel != null ? c0.e(pesel) : null, "peselValue"), null, null, 0, 0, j70.a.LETTER_BY_LETTER, 30, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(uy2.b.f202286d), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
