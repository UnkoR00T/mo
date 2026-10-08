package lc2;

import fr.t;
import hl0.IdCardInvalidationInitData;
import iy.c0;
import mc2.Section;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Llc2/a;", "Lxw/f;", "Llc2/a$a;", "Lmc2/a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "c", "(Llc2/a$a;)Lmc2/a;", "a", "Lmx/c;", "b", "Lez/e;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<Params, Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: lc2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Llc2/a$a;", "", "Lhl0/b$a;", "data", "", "isIdentityTheft", "<init>", "(Lhl0/b$a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhl0/b$a;", "()Lhl0/b$a;", "b", "Z", "()Z", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdCardInvalidationInitData.ApplicantData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isIdentityTheft;

        public Params(IdCardInvalidationInitData.ApplicantData applicantData, boolean z15) {
            this.data = applicantData;
            this.isIdentityTheft = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final IdCardInvalidationInitData.ApplicantData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsIdentityTheft() {
            return this.isIdentityTheft;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.data, params.data) && this.isIdentityTheft == params.isIdentityTheft;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + Boolean.hashCode(this.isIdentityTheft);
        }

        public String toString() {
            return "Params(data=" + this.data + ", isIdentityTheft=" + this.isIdentityTheft + ')';
        }
    }

    public a(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Section b(Params params) {
        DefaultSingleCardData defaultSingleCardData;
        DefaultSingleCardData defaultSingleCardData2;
        IdCardInvalidationInitData.ApplicantData data = params.getData();
        Label labelC = this.labelProvider.c(hb2.b.T);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hb2.b.f82819x), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getFirstName(), "firstName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        String secondName = data.getSecondName();
        if (secondName != null) {
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hb2.b.L), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(secondName, "secondName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        } else {
            defaultSingleCardData = null;
        }
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hb2.b.A), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getSurname(), "surname"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hb2.b.f82807r), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getMaidenName(), "familyName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData6 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hb2.b.f82777c), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getBirthPlace(), "birthPlace"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        ez.e eVar = this.dateFormatter;
        fz.b.LocalDate birthDate = data.getBirthDate();
        fz.c cVar = fz.c.DOTTED;
        DefaultSingleCardData defaultSingleCardData7 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hb2.b.f82775b), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(eVar.d(birthDate, cVar), "birthDate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData8 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hb2.b.f82823z), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(data.getSeries()) + c0.e(data.getNumber()), "idCardSeriesAndNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        boolean isIdentityTheft = params.getIsIdentityTheft();
        Boolean boolValueOf = Boolean.valueOf(isIdentityTheft);
        if (!isIdentityTheft) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hb2.b.f82796l0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(this.dateFormatter.d(data.getIssueDate(), cVar), "issueDate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        } else {
            defaultSingleCardData2 = null;
        }
        return new Section(labelC, new CardListData(v.s(defaultSingleCardData3, defaultSingleCardData, defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData6, defaultSingleCardData7, defaultSingleCardData8, defaultSingleCardData2), null, false, null, null, 30, null));
    }
}
