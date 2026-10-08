package wu2;

import bu2.CompanyDetails;
import bu2.VerifiedStatus;
import h30.ButtonData;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import oq.i0;
import p071kotlin.Metadata;
import r30.CheckBoxRowData;
import w30.CheckBoxSingleData;
import xu2.SummaryElementData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwu2/f;", "Lxw/f;", "Lwu2/f$a;", "Lwu2/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lwu2/f$a;)Lwu2/d$a;", "a", "Lmx/c;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: wu2.f$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b!\u0010\u001eR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0018\u0010#¨\u0006$"}, d2 = {"Lwu2/f$a;", "", "Lwu2/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "toCompanyDetails", "toVerifierDetails", "toVerificationDate", "validateResponsibilityAccepted", "Lkotlin/Function1;", "", "checkBoxClicked", "<init>", "(Lwu2/c;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lwu2/c;", "b", "()Lwu2/c;", "Ler/a;", "c", "()Ler/a;", "e", "d", "f", "Ler/l;", "()Ler/l;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toCompanyDetails;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toVerifierDetails;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toVerificationDate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> validateResponsibilityAccepted;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> checkBoxClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.l<? super Boolean, i0> lVar) {
            this.state = state;
            this.toCompanyDetails = aVar;
            this.toVerifierDetails = aVar2;
            this.toVerificationDate = aVar3;
            this.validateResponsibilityAccepted = aVar4;
            this.checkBoxClicked = lVar;
        }

        public final er.l<Boolean, i0> a() {
            return this.checkBoxClicked;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final er.a<i0> c() {
            return this.toCompanyDetails;
        }

        public final er.a<i0> d() {
            return this.toVerificationDate;
        }

        public final er.a<i0> e() {
            return this.toVerifierDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.toCompanyDetails, params.toCompanyDetails) && fr.t.c(this.toVerifierDetails, params.toVerifierDetails) && fr.t.c(this.toVerificationDate, params.toVerificationDate) && fr.t.c(this.validateResponsibilityAccepted, params.validateResponsibilityAccepted) && fr.t.c(this.checkBoxClicked, params.checkBoxClicked);
        }

        public final er.a<i0> f() {
            return this.validateResponsibilityAccepted;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.toCompanyDetails.hashCode()) * 31) + this.toVerifierDetails.hashCode()) * 31) + this.toVerificationDate.hashCode()) * 31) + this.validateResponsibilityAccepted.hashCode()) * 31) + this.checkBoxClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", toCompanyDetails=" + this.toCompanyDetails + ", toVerifierDetails=" + this.toVerifierDetails + ", toVerificationDate=" + this.toVerificationDate + ", validateResponsibilityAccepted=" + this.validateResponsibilityAccepted + ", checkBoxClicked=" + this.checkBoxClicked + ')';
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, boolean z15) {
        params.a().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        LocalDate pickedDate;
        Label labelC = this.labelProvider.c(ut2.a.f201428t);
        CompanyDetails companyDetails = params.getState().getSummaryData().getCompanyDetails();
        List listE = companyDetails != null ? pq.v.e(new SummaryElementData(this.labelProvider.c(ut2.a.f201406i), this.labelProvider.c(ut2.a.f201394c), this.labelProvider.c(ut2.a.f201394c).o(Label.INSTANCE.d()).o(this.labelProvider.c(ut2.a.f201406i)), params.c(), new CardListData(pq.v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(ou2.a.b(companyDetails.getCompanyIdType(), this.labelProvider), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(companyDetails.getIdNumber(), "idNumber"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(ut2.a.f201410k), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(companyDetails.getName(), "name"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(ut2.a.f201390a), null, null, 3, null), new n50.b.Title(n50.l.b(ou2.a.a(companyDetails), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null))) : null;
        SummaryElementData summaryElementData = new SummaryElementData(this.labelProvider.c(ut2.a.f201395c0), this.labelProvider.c(ut2.a.f201394c), this.labelProvider.c(ut2.a.f201397d0), params.e(), new CardListData(pq.v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(ut2.a.J), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(params.getState().getSummaryData().getVerificationCheckData().getPesel(), "pesel"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(ut2.a.I), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(params.getState().getSummaryData().getVerificationCheckData().getIdNumber(), "idNumber"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null));
        SummaryElementData summaryElementData2 = new SummaryElementData(this.labelProvider.c(ut2.a.f201399e0), this.labelProvider.c(ut2.a.f201394c), this.labelProvider.c(ut2.a.f201401f0), params.e(), new CardListData(pq.v.e(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(ut2.a.f201434w), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(params.getState().getSummaryData().getVerificationCheckData().getReason(), "reason"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null));
        VerifiedStatus verifiedStatus = params.getState().getSummaryData().getVerifiedStatus();
        return new d.Data(labelC, listE, pq.v.s(summaryElementData, summaryElementData2, (verifiedStatus == null || (pickedDate = verifiedStatus.getPickedDate()) == null) ? null : new SummaryElementData(this.labelProvider.c(ut2.a.C), this.labelProvider.c(ut2.a.f201394c), this.labelProvider.c(ut2.a.f201393b0), params.d(), new CardListData(pq.v.e(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(ut2.a.f201396d), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(pickedDate.format(DateTimeFormatter.ofPattern(fz.c.DOTTED.getFormat())), "dateTitle"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null))), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ut2.a.M), null, 2, null), k30.d.a.f107773a, null, params.f(), 35, null), new CheckBoxSingleData(new CheckBoxRowData(null, params.getState().getResponsibilityAccepted(), new er.l() { // from class: wu2.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.f(params, ((Boolean) obj).booleanValue());
            }
        }, this.labelProvider.c(ut2.a.N), null, null, null, null, 241, null), params.getState().getCheckBoxValidationState() instanceof hz.b.Invalid ? new r30.b.Error(null, this.labelProvider.c(ut2.a.f201426s), 1, null) : r30.b.a.f171263a, r30.c.CONTENT_BOX, false, null, 24, null), params.getState().getCheckBoxValidationState(), this.labelProvider.c(ut2.a.f201424r));
    }
}
