package sm1;

import al0.IdCardSuspensionChildData;
import al0.c0;
import an1.ChildDataResult;
import ao1.WelcomeWizardResult;
import en1.ChooseActionResult;
import hn1.ChooseChildResult;
import iy.b0;
import jn1.ConfirmationDocumentResultWrapper;
import kn1.ContactDetailsDataResult;
import nn1.OfficeResult;
import p071kotlin.Metadata;
import pu3.ConfirmationDocumentResult;
import py3.OfficeSelectionData;
import qm1.WelcomeResult;
import ru3.ContactDetailsData;
import um1.l1;
import wm1.CertDeliveryResult;
import wn1.SummaryModel;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R*\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010-\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010,R\u0016\u00100\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00106\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u00107R\u0014\u0010:\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00105R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lsm1/b;", "", "Lh00/a;", "Lum1/l1;", "Lwn1/a;", "Lpl/gov/coi/mobywatel/feature/dependentidsuspension/presentation/main/DataSource;", "dataSource", "Lmm1/a;", "type", "<init>", "(Lh00/a;Lmm1/a;)V", "Lal0/c0;", "action", "Loq/i0;", "k", "(Lal0/c0;)V", "Lqm1/a;", "data", "i", "(Lqm1/a;)V", "Lal0/d0;", "h", "(Lal0/d0;)V", "Lpu3/d;", "o", "(Lpu3/d;)V", "Lru3/b;", "p", "(Lru3/b;)V", "Leu3/a;", "n", "(Leu3/a;)V", "Lpy3/b$b;", "e", "(Lpy3/b$b;)V", "Lhn1/b;", "j", "(Lhn1/b;)V", "a", "Lh00/a;", "b", "Lmm1/a;", "getType", "()Lmm1/a;", "()Lal0/d0;", "childData", "d", "()Lpu3/d;", "confirmationDocumentResult", "m", "()Lru3/b;", "contactDetailsData", "l", "()Lpy3/b$b;", "office", "()Lal0/c0;", "requireAction", "g", "requireOffice", "Liy/b0;", "f", "()Liy/b0;", "requireUserEdorAddress", "c", "()Lwn1/a;", "summaryData", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements cn1.a, yn1.a, ym1.a, gn1.a, mn1.a, rn1.a, un1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f182370c = h00.a.f79185b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h00.a<l1, Object, SummaryModel> dataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mm1.a type;

    public b(h00.a<l1, Object, SummaryModel> aVar, mm1.a aVar2) {
        this.dataSource = aVar;
        this.type = aVar2;
    }

    @Override // ym1.a
    public IdCardSuspensionChildData a() {
        return (IdCardSuspensionChildData) this.dataSource.b(l1.b.f199123c);
    }

    @Override // gn1.a, rn1.a
    public c0 b() {
        return (c0) this.dataSource.f(l1.d.f199125c);
    }

    @Override // un1.a
    public SummaryModel c() {
        return this.dataSource.e();
    }

    @Override // ym1.a
    public ConfirmationDocumentResult d() {
        return (ConfirmationDocumentResult) this.dataSource.b(l1.e.f199126c);
    }

    @Override // mn1.a
    public void e(OfficeSelectionData.Office data) {
        this.dataSource.a(l1.k.f199132c, new OfficeResult(data));
    }

    @Override // gn1.a
    public b0 f() {
        return ((WelcomeResult) this.dataSource.f(l1.p.f199137c)).getUserEdorAddress();
    }

    @Override // gn1.a
    public OfficeSelectionData.Office g() {
        return (OfficeSelectionData.Office) this.dataSource.f(l1.k.f199132c);
    }

    @Override // cn1.a, yn1.a, ym1.a, un1.a
    public mm1.a getType() {
        return this.type;
    }

    @Override // ym1.a
    public void h(IdCardSuspensionChildData data) {
        this.dataSource.a(l1.b.f199123c, new ChildDataResult(data));
    }

    @Override // yn1.a
    public void i(WelcomeResult data) {
        this.dataSource.a(l1.p.f199137c, new WelcomeWizardResult(data));
    }

    @Override // gn1.a
    public void j(hn1.b data) {
        this.dataSource.a(l1.c.f199124c, new ChooseChildResult(data));
    }

    @Override // cn1.a
    public void k(c0 action) {
        this.dataSource.a(l1.d.f199125c, new ChooseActionResult(action));
    }

    @Override // cn1.a
    public OfficeSelectionData.Office l() {
        return (OfficeSelectionData.Office) this.dataSource.b(l1.k.f199132c);
    }

    public ContactDetailsData m() {
        return (ContactDetailsData) this.dataSource.b(l1.f.f199127c);
    }

    public void n(eu3.a data) {
        this.dataSource.a(l1.a.f199122c, new CertDeliveryResult(data));
    }

    public void o(ConfirmationDocumentResult data) {
        this.dataSource.a(l1.e.f199126c, new ConfirmationDocumentResultWrapper(data));
    }

    public void p(ContactDetailsData data) {
        this.dataSource.a(l1.f.f199127c, new ContactDetailsDataResult(data));
    }
}
