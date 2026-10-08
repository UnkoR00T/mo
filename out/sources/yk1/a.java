package yk1;

import al0.BECommunityOffice;
import al0.BEContactDetailsData;
import al1.q1;
import il0.BeChildAndParentsData;
import iy.b0;
import nk1.SummaryModel;
import ok1.WelcomeResult;
import p071kotlin.Metadata;
import pu3.ConfirmationDocumentResult;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001,B1\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R*\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u00102R\u0016\u00106\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00109\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010<\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u00105R\u0016\u0010A\u001a\u0004\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010J¨\u0006L"}, d2 = {"Lyk1/a;", "", "Lkk1/a;", "type", "Lh00/a;", "Lal1/q1;", "Lh00/b;", "Lnk1/a;", "Lpl/gov/coi/mobywatel/feature/dependentidinvalidation/presentation/main/DataSource;", "dataSource", "<init>", "(Lkk1/a;Lh00/a;)V", "Lok1/a;", "data", "Loq/i0;", "v", "(Lok1/a;)V", "Lju3/e;", "p", "(Lju3/e;)V", "Lil0/a;", "j", "(Lil0/a;)V", "Lfl0/b;", "i", "(Lfl0/b;)V", "Lil0/a$a;", "k", "(Lil0/a$a;)V", "Lil0/a$b;", "h", "(Lil0/a$b;)V", "Lpu3/d;", "n", "(Lpu3/d;)V", "Lal0/i;", "q", "(Lal0/i;)V", "Lgl0/a;", "m", "(Lgl0/a;)V", "Lal0/j;", "o", "(Lal0/j;)V", "a", "Lkk1/a;", "getType", "()Lkk1/a;", "b", "Lh00/a;", "()Lil0/a$a;", "childData", "u", "()Lal0/i;", "selectedOffice", "e", "()Lil0/a$b;", "parentsData", "d", "()Lpu3/d;", "confirmationDocumentResult", "g", "requireOffice", "l", "()Lal0/j;", "contactDetails", "Liy/b0;", "f", "()Liy/b0;", "requireUserEdorAddress", "Lju3/e$c;", "c", "()Lju3/e$c;", "requireSelectedSpecificChild", "()Lnk1/a;", "summaryModel", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements cm1.a, dl1.a, gl1.a, pl1.a, ll1.a, zl1.a, wl1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f227525c = h00.a.f79185b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kk1.a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h00.a<q1, h00.b, SummaryModel> dataSource;

    /* JADX INFO: renamed from: yk1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lyk1/a$a;", "", "Lkk1/a;", "type", "Lyk1/a;", "a", "(Lkk1/a;)Lyk1/a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC6098a {
        a a(kk1.a type);
    }

    public a(kk1.a aVar, h00.a<q1, h00.b, SummaryModel> aVar2) {
        this.type = aVar;
        this.dataSource = aVar2;
    }

    @Override // gl1.a
    public BeChildAndParentsData.ChildData a() {
        return (BeChildAndParentsData.ChildData) this.dataSource.b(q1.c.f7670c);
    }

    @Override // zl1.a
    public SummaryModel b() {
        return this.dataSource.e();
    }

    @Override // dl1.a
    public ju3.e.Specific c() {
        return (ju3.e.Specific) this.dataSource.f(q1.d.f7671c);
    }

    @Override // pl1.a
    public ConfirmationDocumentResult d() {
        return (ConfirmationDocumentResult) this.dataSource.b(q1.e.f7672c);
    }

    @Override // pl1.a
    public BeChildAndParentsData.ParentsData e() {
        return (BeChildAndParentsData.ParentsData) this.dataSource.b(q1.n.f7681c);
    }

    @Override // ll1.a
    public b0 f() {
        return ((WelcomeResult) this.dataSource.f(q1.s.f7686c)).getUserEdorAddress();
    }

    @Override // ll1.a
    public BECommunityOffice g() {
        return (BECommunityOffice) this.dataSource.f(q1.m.f7680c);
    }

    @Override // cm1.a, gl1.a, pl1.a, zl1.a, wl1.a
    public kk1.a getType() {
        return this.type;
    }

    @Override // pl1.a
    public void h(BeChildAndParentsData.ParentsData data) {
        this.dataSource.a(q1.n.f7681c, new StepResult(data));
    }

    @Override // ll1.a
    public void i(fl0.b data) {
        this.dataSource.a(q1.l.f7679c, new StepResult(data));
    }

    @Override // dl1.a
    public void j(BeChildAndParentsData data) {
        this.dataSource.a(q1.b.f7669c, new StepResult(data));
    }

    @Override // gl1.a
    public void k(BeChildAndParentsData.ChildData data) {
        this.dataSource.a(q1.c.f7670c, new StepResult(data));
    }

    public BEContactDetailsData l() {
        return (BEContactDetailsData) this.dataSource.b(q1.f.f7673c);
    }

    public void m(gl0.a data) {
        this.dataSource.a(q1.a.f7668c, new StepResult(data));
    }

    public void n(ConfirmationDocumentResult data) {
        this.dataSource.a(q1.e.f7672c, new StepResult(data));
    }

    public void o(BEContactDetailsData data) {
        this.dataSource.a(q1.f.f7673c, new StepResult(data));
    }

    public void p(ju3.e data) {
        this.dataSource.a(q1.d.f7671c, new StepResult(data));
    }

    public void q(BECommunityOffice data) {
        this.dataSource.a(q1.m.f7680c, new StepResult(data));
    }

    @Override // cm1.a
    public BECommunityOffice u() {
        return (BECommunityOffice) this.dataSource.b(q1.m.f7680c);
    }

    @Override // cm1.a
    public void v(WelcomeResult data) {
        this.dataSource.a(q1.s.f7686c, new StepResult(data));
    }
}
