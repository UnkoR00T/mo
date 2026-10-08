package gg1;

import fr.t;
import i50.BaseScaffoldData;
import ld1.CompanyApplicationCitizenData;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgg1/n;", "Lxw/f;", "Lgg1/n$a;", "Lfg1/n$a$d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lgg1/n$a;)Lfg1/n$a$d;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements xw.f<Params, fg1.n.a.UserData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gg1.n$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lgg1/n$a;", "", "Lld1/e;", "citizenData", "", "mIdCardNumber", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Lld1/e;Ljava/lang/String;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lld1/e;", "()Lld1/e;", "b", "Ljava/lang/String;", "c", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CompanyApplicationCitizenData citizenData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mIdCardNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(CompanyApplicationCitizenData companyApplicationCitizenData, String str, er.a<i0> aVar) {
            this.citizenData = companyApplicationCitizenData;
            this.mIdCardNumber = str;
            this.onBackAction = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CompanyApplicationCitizenData getCitizenData() {
            return this.citizenData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMIdCardNumber() {
            return this.mIdCardNumber;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.citizenData, params.citizenData) && t.c(this.mIdCardNumber, params.mIdCardNumber) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((this.citizenData.hashCode() * 31) + this.mIdCardNumber.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(citizenData=" + this.citizenData + ", mIdCardNumber=" + this.mIdCardNumber + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public n(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fg1.n.a.UserData b(Params params) {
        return new fg1.n.a.UserData(new BaseScaffoldData(null, new x50.i.Small(null, this.labelProvider.c(ha1.a.f82515v0).n("user_data_screen_title"), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 21, null), null, null, null, null, 61, null), new fg1.n.a.SummarySectionData(null, new CardListData(v.s(m.b(mx.b.b(params.getCitizenData().getFirstName(), "user_data_first_name_value"), this.labelProvider.c(ha1.a.A).n("user_data_first_name_label"), null, null, null, 28, null), m.b(mx.b.d(params.getCitizenData().getSecondName(), "user_data_second_name_value"), this.labelProvider.c(ha1.a.f82371c0).n("user_data_second_name_label"), null, null, null, 28, null), m.b(mx.b.b(params.getCitizenData().getSurname(), "user_data_surname_value"), this.labelProvider.c(ha1.a.L).n("user_data_surname_label"), null, null, null, 28, null), m.b(mx.b.d(params.getCitizenData().getFamilyName(), "user_data_family_name_value"), this.labelProvider.c(ha1.a.f82507u).n("user_data_family_name_label"), null, null, null, 28, null), m.b(mx.b.b(params.getCitizenData().getPesel(), "user_data_pesel_value"), this.labelProvider.c(ha1.a.T).n("user_data_pesel_label"), null, null, j70.a.LETTER_BY_LETTER, 12, null), m.b(mx.b.d(params.getCitizenData().getGender(), "user_data_gender_value"), this.labelProvider.c(ha1.a.C).n("user_data_gender_label"), null, null, null, 28, null), m.b(mx.b.d(params.getCitizenData().getBirthPlace(), "user_data_birth_place_value"), this.labelProvider.c(ha1.a.f82386e).n("user_data_birth_place_label"), null, null, null, 28, null), m.b(mx.b.d(params.getCitizenData().getBirthDate(), "user_data_birth_date_value"), this.labelProvider.c(ha1.a.f82378d).n("user_data_birth_date_label"), null, null, null, 28, null), m.b(mx.b.d(params.getCitizenData().getCitizenship(), "user_data_citizenship_value"), this.labelProvider.c(ha1.a.f82434k).n("user_data_citizenship_label"), null, null, null, 28, null), m.b(mx.b.b(params.getMIdCardNumber(), "user_data_mdowod_number_value"), this.labelProvider.c(ha1.a.f82479q).n("user_data_mdowod_number_label"), null, null, null, 28, null)), null, false, null, null, 30, null)), new fg1.n.a.SummarySectionData(this.labelProvider.c(ha1.a.S).n("user_data_parents_data_title"), new CardListData(v.q(m.b(mx.b.d(params.getCitizenData().getFatherName(), "user_data_father_name_value"), this.labelProvider.c(ha1.a.f82514v).n("user_data_father_name_label"), null, null, null, 28, null), m.b(mx.b.d(params.getCitizenData().getMotherName(), "user_data_mother_name_value"), this.labelProvider.c(ha1.a.N).n("user_data_mother_name_label"), null, null, null, 28, null)), null, false, null, null, 30, null)), params.c());
    }
}
