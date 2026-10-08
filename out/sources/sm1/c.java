package sm1;

import al0.IdCardSuspensionChildData;
import al0.ParentOrGuardData;
import al0.c0;
import fr.t;
import iy.b0;
import oq.p;
import p071kotlin.Metadata;
import pu3.ConfirmationDocumentResult;
import py3.OfficeSelectionData;
import qm1.WelcomeResult;
import ru3.ContactDetailsData;
import um1.l1;
import wn1.SummaryModel;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsm1/c;", "Lh00/a;", "Lum1/l1;", "", "Lwn1/a;", "Lpl/gov/coi/mobywatel/feature/dependentidsuspension/presentation/main/DataSource;", "<init>", "()V", "Lhn1/b;", "chosenChild", "Lal0/d0;", "g", "(Lhn1/b;)Lal0/d0;", "Lgl0/c;", "h", "(Lhn1/b;)Lgl0/c;", "i", "()Lwn1/a;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends h00.a<l1, Object, SummaryModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f182373c = h00.a.f79185b;

    private final IdCardSuspensionChildData g(hn1.b chosenChild) {
        if (t.c(chosenChild, hn1.b.a.f85853a) || chosenChild == null) {
            return (IdCardSuspensionChildData) f(l1.b.f199123c);
        }
        if (!(chosenChild instanceof hn1.b.Specific)) {
            throw new p();
        }
        hn1.b.Specific specific = (hn1.b.Specific) chosenChild;
        b0 firstName = specific.getData().getFirstName();
        b0 secondName = specific.getData().getSecondName();
        return new IdCardSuspensionChildData(firstName, specific.getData().getPesel(), specific.getData().getSurname(), secondName, specific.getData().getSeriesAndNumber(), null);
    }

    private final gl0.c h(hn1.b chosenChild) {
        if (t.c(chosenChild, hn1.b.a.f85853a)) {
            return gl0.c.a.WithoutParentization;
        }
        if (chosenChild instanceof hn1.b.Specific) {
            return gl0.c.a.Parentization;
        }
        if (chosenChild == null) {
            return gl0.c.b.f73564a;
        }
        throw new p();
    }

    @Override // h00.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public SummaryModel e() {
        hn1.b bVar = (hn1.b) b(l1.c.f199124c);
        WelcomeResult welcomeResult = (WelcomeResult) f(l1.p.f199137c);
        OfficeSelectionData.Office office = (OfficeSelectionData.Office) f(l1.k.f199132c);
        c0 c0Var = (c0) f(l1.d.f199125c);
        ParentOrGuardData parentOrGuardData = welcomeResult.getParentOrGuardData();
        IdCardSuspensionChildData idCardSuspensionChildDataG = g(bVar);
        eu3.a aVar = (eu3.a) f(l1.a.f199122c);
        ContactDetailsData contactDetailsData = (ContactDetailsData) f(l1.f.f199127c);
        ConfirmationDocumentResult confirmationDocumentResult = (ConfirmationDocumentResult) b(l1.e.f199126c);
        return new SummaryModel(c0Var, parentOrGuardData, idCardSuspensionChildDataG, office, aVar, contactDetailsData, confirmationDocumentResult != null ? confirmationDocumentResult.getDocument() : null, h(bVar), welcomeResult.getUserEdorAddress());
    }
}
