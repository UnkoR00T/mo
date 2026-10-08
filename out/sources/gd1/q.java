package gd1;

import fr.t;
import i50.BaseScaffoldData;
import jd1.OpenCompanyWizardData;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgd1/q;", "Lxw/f;", "Lgd1/q$a;", "Lfd1/c$a$c;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lgd1/q$a;)Lfd1/c$a$c;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements xw.f<Params, fd1.c.a.YourData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gd1.q$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgd1/q$a;", "", "Ljd1/a;", "openCompanyWizardData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Ljd1/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljd1/a;", "b", "()Ljd1/a;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OpenCompanyWizardData openCompanyWizardData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(OpenCompanyWizardData openCompanyWizardData, er.a<i0> aVar) {
            this.openCompanyWizardData = openCompanyWizardData;
            this.onBackAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OpenCompanyWizardData getOpenCompanyWizardData() {
            return this.openCompanyWizardData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.openCompanyWizardData, params.openCompanyWizardData) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (this.openCompanyWizardData.hashCode() * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(openCompanyWizardData=" + this.openCompanyWizardData + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public q(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fd1.c.a.YourData b(Params params) {
        return new fd1.c.a.YourData(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(ha1.a.f82515v0).n("your_data_screen_title"), null, null, null, 28, null), null, null, null, null, 61, null), new CardListData(v.s(p.c(mx.b.b(params.getOpenCompanyWizardData().getKnownUserData().getCitizenData().getFirstName(), "your_data_first_name_value"), this.labelProvider.c(ha1.a.A).n("your_data_first_name_label"), null, null, null, 28, null), p.c(mx.b.d(params.getOpenCompanyWizardData().getKnownUserData().getCitizenData().getSecondName(), "your_data_second_name_value"), this.labelProvider.c(ha1.a.f82371c0).n("your_data_second_name_label"), null, null, null, 28, null), p.c(mx.b.b(params.getOpenCompanyWizardData().getKnownUserData().getCitizenData().getSurname(), "your_data_surname_value"), this.labelProvider.c(ha1.a.L).n("your_data_surname_label"), null, null, null, 28, null), p.c(mx.b.d(params.getOpenCompanyWizardData().getKnownUserData().getCitizenData().getFamilyName(), "your_data_family_name_value"), this.labelProvider.c(ha1.a.f82507u).n("your_data_family_name_label"), null, null, null, 28, null), p.c(mx.b.b(params.getOpenCompanyWizardData().getKnownUserData().getCitizenData().getPesel(), "your_data_pesel_value"), this.labelProvider.c(ha1.a.T).n("your_data_pesel_label"), null, null, j70.a.LETTER_BY_LETTER, 12, null), p.c(mx.b.d(params.getOpenCompanyWizardData().getKnownUserData().getCitizenData().getGender(), "your_data_gender_value"), this.labelProvider.c(ha1.a.C).n("your_data_gender_label"), null, null, null, 28, null), p.c(mx.b.d(params.getOpenCompanyWizardData().getKnownUserData().getCitizenData().getBirthPlace(), "your_data_birth_place_value"), this.labelProvider.c(ha1.a.f82386e).n("your_data_birth_place_label"), null, null, null, 28, null), p.c(mx.b.d(params.getOpenCompanyWizardData().getKnownUserData().getCitizenData().getBirthDate(), "your_data_birth_date_value"), this.labelProvider.c(ha1.a.f82378d).n("your_data_birth_date_label"), null, null, null, 28, null), p.c(mx.b.d(params.getOpenCompanyWizardData().getKnownUserData().getCitizenData().getCitizenship(), "your_data_citizenship_value"), this.labelProvider.c(ha1.a.f82434k).n("your_data_citizenship_label"), null, null, null, 28, null), p.c(mx.b.b(params.getOpenCompanyWizardData().getKnownUserData().getMIdCardNumber(), "your_data_mdowod_number_value"), this.labelProvider.c(ha1.a.f82479q).n("your_data_mdowod_number_label"), null, null, null, 28, null)), null, false, null, null, 30, null), this.labelProvider.c(ha1.a.S).n("your_data_parents_data_title"), new CardListData(v.q(p.c(mx.b.d(params.getOpenCompanyWizardData().getKnownUserData().getCitizenData().getFatherName(), "your_data_father_name_value"), this.labelProvider.c(ha1.a.f82514v).n("your_data_father_name_label"), null, null, null, 28, null), p.c(mx.b.d(params.getOpenCompanyWizardData().getKnownUserData().getCitizenData().getMotherName(), "your_data_mother_name_value"), this.labelProvider.c(ha1.a.N).n("your_data_mother_name_label"), null, null, null, 28, null)), null, false, null, null, 30, null), params.a());
    }
}
