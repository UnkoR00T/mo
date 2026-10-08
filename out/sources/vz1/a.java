package vz1;

import dz.e;
import fr.t;
import fu.r;
import gz1.PersonalData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.b;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.l;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import uz1.d;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u001d\u0010\u001b\u001a\u00020\u0012*\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lvz1/a;", "Lxw/f;", "Lvz1/a$a;", "Luz1/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Luz1/c$c;", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "onBackAction", "onNextAction", "Luz1/d$a$c;", "l", "(Luz1/c$c;Ler/a;Ler/a;Ler/a;)Luz1/d$a$c;", "Lgz1/b;", "", "m", "(Lgz1/b;)Ljava/lang/String;", "Lmx/a;", "c", "(Lgz1/b;)Lmx/a;", "e", "", "peselSeperated", "f", "(Lgz1/b;Z)Ljava/lang/String;", "params", "i", "(Lvz1/a$a;)Luz1/d$a;", "a", "Lmx/c;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: vz1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lvz1/a$a;", "", "Luz1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "onBackAction", "onNextAction", "<init>", "(Luz1/c;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luz1/c;", "d", "()Luz1/c;", "b", "Ler/a;", "()Ler/a;", "c", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final uz1.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        public Params(uz1.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = cVar;
            this.onCloseAction = aVar;
            this.onBackAction = aVar2;
            this.onNextAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final er.a<i0> c() {
            return this.onNextAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final uz1.c getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onNextAction, params.onNextAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onCloseAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onNextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseAction=" + this.onCloseAction + ", onBackAction=" + this.onBackAction + ", onNextAction=" + this.onNextAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(PersonalData personalData) {
        String strE = e(personalData);
        String strF = f(personalData, true);
        if (strE.length() <= 0) {
            strE = null;
        }
        return b.b(v.v0(v.q(strE, strF), ", ", null, null, 0, null, null, 62, null), "");
    }

    private final String e(PersonalData personalData) {
        String string;
        List<String> listQ = v.q(personalData.getFirstName(), personalData.getSecondName(), personalData.getSurname());
        ArrayList arrayList = new ArrayList();
        for (String str : listQ) {
            String str2 = null;
            if (str != null && (string = r.u1(str).toString()) != null && string.length() > 0) {
                str2 = string;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return v.v0(arrayList, " ", null, null, 0, null, null, 62, null);
    }

    private final String f(PersonalData personalData, boolean z15) {
        String string;
        String pesel = personalData.getPesel();
        if (pesel == null || (string = r.u1(pesel).toString()) == null) {
            return "";
        }
        if (string.length() <= 0) {
            string = null;
        }
        if (string == null) {
            return "";
        }
        if (z15) {
            string = e.g(string, 1, " ");
        }
        String str = this.labelProvider.c(fz1.a.f68973s0).getText() + ' ' + string;
        return str == null ? "" : str;
    }

    static /* synthetic */ String h(a aVar, PersonalData personalData, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return aVar.f(personalData, z15);
    }

    private final d.a.Initialized l(uz1.c.Initialized initialized, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar2), this.labelProvider.c(fz1.a.f68965o0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, aVar, 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(fz1.a.f68981w0);
        Label labelC2 = this.labelProvider.c(fz1.a.f68969q0);
        Label labelC3 = this.labelProvider.c(fz1.a.f68977u0);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(fz1.a.f68985y0), null, null, 3, null), new n50.b.Title(l.b(b.b(m(initialized.getPersonalData()), "fullNameWithPesel"), null, c(initialized.getPersonalData()), 1, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB = l.b(this.labelProvider.c(fz1.a.f68983x0), null, null, 3, null);
        Label labelB = b.b(initialized.getAvailableElectionSupport().getElectionActionName(), "electionActionName");
        j70.a aVar4 = j70.a.NORMAL;
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(l.b(labelB, aVar4, null, 2, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB2 = l.b(this.labelProvider.c(fz1.a.f68971r0), null, null, 3, null);
        String committeeSubjectDistrictName = initialized.getAvailableElectionSupport().getCommitteeSubjectDistrictName();
        if (committeeSubjectDistrictName == null) {
            committeeSubjectDistrictName = "";
        }
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB2, new n50.b.Title(l.b(b.b(committeeSubjectDistrictName, "committeeSubjectDistrictName"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        String committeeSubjectDistrictName2 = initialized.getAvailableElectionSupport().getCommitteeSubjectDistrictName();
        return new d.a.Initialized(baseScaffoldData, labelC, labelC2, labelC3, new CardListData(v.s(defaultSingleCardData, defaultSingleCardData2, !(committeeSubjectDistrictName2 == null || committeeSubjectDistrictName2.length() == 0) ? defaultSingleCardData3 : null, (initialized.getAvailableElectionSupport().getElectionActionType() == un0.e.SEJM_ELECTION || initialized.getAvailableElectionSupport().getElectionActionType() == un0.e.EUROPEAN_PARLIAMENT_ELECTION) ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(fz1.a.f68979v0), null, null, 3, null), new n50.b.Title(l.b(b.b(initialized.getCommitteeData().getCommitteeName(), "committeeName"), aVar4, null, 2, null)), null, 4, null), null, null, null, 3839, null) : null, (initialized.getAvailableElectionSupport().getElectionActionType() == un0.e.SENATE_ELECTION || initialized.getAvailableElectionSupport().getElectionActionType() == un0.e.SENATE_SUPPLEMENTARY_ELECTION || initialized.getAvailableElectionSupport().getElectionActionType() == un0.e.PRESIDENTIAL_ELECTION) ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(fz1.a.f68987z0), null, null, 3, null), new n50.b.Title(l.b(b.b(initialized.getCommitteeData().getCommitteeSubjectName(), "committeeSubjectName"), aVar4, null, 2, null)), l.b(b.b(initialized.getCommitteeData().getCommitteeName(), "committeeName"), aVar4, null, 2, null)), null, null, null, 3839, null) : null), null, false, null, null, 30, null), new c30.b.c(null, null, null, this.labelProvider.c(fz1.a.f68967p0), null, null, null, 119, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(fz1.a.f68975t0), null, 2, null), k30.d.a.f107773a, null, aVar3, 35, null));
    }

    private final String m(PersonalData personalData) {
        String strE = e(personalData);
        String strH = h(this, personalData, false, 1, null);
        if (strE.length() <= 0) {
            strE = null;
        }
        return v.v0(v.q(strE, strH), ", ", null, null, 0, null, null, 62, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        uz1.c state = params.getState();
        if (state instanceof uz1.c.b) {
            return d.a.b.f202396a;
        }
        if (state instanceof uz1.c.Initialized) {
            return l((uz1.c.Initialized) params.getState(), params.b(), params.a(), params.c());
        }
        if (state instanceof uz1.c.Error) {
            return new d.a.Error(((uz1.c.Error) params.getState()).getErrorVMS());
        }
        throw new p();
    }
}
