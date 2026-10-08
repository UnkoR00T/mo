package tx2;

import al0.ApplicantDataModel;
import al0.ApplicantDataResultData;
import fr.t;
import iy.c0;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ux2.Section;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u00020\u0012*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ltx2/b;", "Lxw/f;", "Ltx2/b$a;", "Lux2/a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "f", "(Ltx2/b$a;)Lux2/a;", "a", "Lmx/c;", "b", "Lez/e;", "Lal0/g;", "", "e", "(Lal0/g;)I", "titleResId", "Lal0/e$a;", "c", "(Lal0/e$a;)I", "asResId", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: tx2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ltx2/b$a;", "", "Lal0/f$a;", "data", "Lal0/g;", "ownerWithAge", "<init>", "(Lal0/f$a;Lal0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/f$a;", "()Lal0/f$a;", "b", "Lal0/g;", "()Lal0/g;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ApplicantDataResultData.BasicInfo data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final al0.g ownerWithAge;

        public Params(ApplicantDataResultData.BasicInfo basicInfo, al0.g gVar) {
            this.data = basicInfo;
            this.ownerWithAge = gVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ApplicantDataResultData.BasicInfo getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final al0.g getOwnerWithAge() {
            return this.ownerWithAge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.data, params.data) && t.c(this.ownerWithAge, params.ownerWithAge);
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.ownerWithAge.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ", ownerWithAge=" + this.ownerWithAge + ')';
        }
    }

    /* JADX INFO: renamed from: tx2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5037b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192552a;

        static {
            int[] iArr = new int[ApplicantDataModel.a.values().length];
            try {
                iArr[ApplicantDataModel.a.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApplicantDataModel.a.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApplicantDataModel.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f192552a = iArr;
        }
    }

    public b(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final int c(ApplicantDataModel.a aVar) {
        int i15 = C5037b.f192552a[aVar.ordinal()];
        if (i15 == 1) {
            return gv2.a.M;
        }
        if (i15 == 2) {
            return gv2.a.f77326x;
        }
        if (i15 == 3) {
            return gv2.a.f77279l0;
        }
        throw new p();
    }

    private final int e(al0.g gVar) {
        if (t.c(gVar, al0.g.b.f7359a)) {
            return gv2.a.f77291o0;
        }
        if (gVar instanceof al0.g.Child) {
            return gv2.a.C0;
        }
        if (gVar instanceof al0.g.Ward) {
            return gv2.a.S2;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Section b(Params params) {
        DefaultSingleCardData defaultSingleCardData;
        ApplicantDataResultData.BasicInfo data = params.getData();
        Label labelC = this.labelProvider.c(e(params.getOwnerWithAge()));
        DefaultSingleCardData defaultSingleCardData2 = null;
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.F), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(params.getData().getFirstName(), "firstName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        String secondName = params.getData().getSecondName();
        if (secondName != null) {
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77226a0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(secondName, "secondName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        } else {
            defaultSingleCardData = null;
        }
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.L), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getSurname(), "surname"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77318v), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getFamilyName(), "familyName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData6 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.T), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(data.getPesel()), "pesel"), null, null, 0, 0, j70.a.LETTER_BY_LETTER, 30, null)), null, 4, null), null, null, null, 3839, null);
        al0.g ownerWithAge = params.getOwnerWithAge();
        if (t.c(ownerWithAge, al0.g.b.f7359a)) {
            ownerWithAge = null;
        }
        if (ownerWithAge != null) {
            defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77225a), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(String.valueOf(data.getAge()), "age"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        }
        return new Section(labelC, new CardListData(v.s(defaultSingleCardData3, defaultSingleCardData, defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData6, defaultSingleCardData2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.G), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(this.labelProvider.c(c(data.getGender())), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77245e), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getPlaceOfBirth(), "placeOfBirth"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77240d), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(data.getDateOfBirth()), fz.c.DOTTED), "dateOfBirth"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77278l), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getNationality(), "nationality"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null));
    }
}
