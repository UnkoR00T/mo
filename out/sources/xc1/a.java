package xc1;

import fr.t;
import h30.ButtonData;
import k30.d;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import st3.AddressFormData;
import vc1.b;
import vc1.c;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lxc1/a;", "Lxw/f;", "Lxc1/a$a;", "Lvc1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lst3/d;", "e", "()Lst3/d;", "params", "c", "(Lxc1/a$a;)Lvc1/c$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: xc1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lxc1/a$a;", "", "Lvc1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "nextAction", "backAction", "<init>", "(Lvc1/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvc1/b;", "c", "()Lvc1/b;", "b", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        public Params(b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.nextAction = aVar;
            this.backAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.nextAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getState() {
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
            return t.c(this.state, params.state) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ')';
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        b state = params.getState();
        if (!(state instanceof b.DataDisplayed)) {
            if (t.c(state, b.C5383b.f206037a)) {
                return c.a.b.f206046a;
            }
            throw new p();
        }
        c30.b.e eVar = new c30.b.e(null, null, null, this.labelProvider.c(ha1.a.f82447l4), null, null, null, 119, null);
        Label labelC = this.labelProvider.c(ha1.a.f82439k4);
        Label labelC2 = this.labelProvider.c(ha1.a.S);
        b.DataDisplayed dataDisplayed = (b.DataDisplayed) state;
        return new c.a.DataDisplayed(eVar, labelC, new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.A), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(dataDisplayed.getData().getCitizenData().getFirstName(), "firstName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.f82371c0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(dataDisplayed.getData().getCitizenData().getSecondName(), "secondName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.L), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(dataDisplayed.getData().getCitizenData().getSurname(), "surname"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.f82507u), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(dataDisplayed.getData().getCitizenData().getFamilyName(), "familyName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.T), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(dataDisplayed.getData().getCitizenData().getPesel(), "pesel"), null, null, 0, 0, j70.a.LETTER_BY_LETTER, 30, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.C), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(dataDisplayed.getData().getCitizenData().getGender(), "gender"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.f82386e), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(dataDisplayed.getData().getCitizenData().getBirthPlace(), "birthPlace"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.f82378d), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(dataDisplayed.getData().getCitizenData().getBirthDate(), "birthDate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.f82434k), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(dataDisplayed.getData().getCitizenData().getCitizenship(), "citizenship"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.f82479q), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(dataDisplayed.getData().getMIdCardNumber(), "physicalIdSerialNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null), labelC2, new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.f82514v), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(dataDisplayed.getData().getCitizenData().getFatherName(), "fatherName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.N), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(dataDisplayed.getData().getCitizenData().getMotherName(), "motherName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), d.a.f107773a, null, params.b(), 35, null), params.a());
    }

    public final AddressFormData e() {
        return new AddressFormData(null, false, null, this.labelProvider.c(ha1.a.S1), null, new st3.a.Info(this.labelProvider.c(ha1.a.P1)), null, 85, null);
    }
}
