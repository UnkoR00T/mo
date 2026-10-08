package p115tc2;

import al0.BECommunityOffice;
import al0.BEContactDetailsData;
import cc2.OfficeSelectionResult;
import ec2.InvalidationReasonResult;
import h00.a;
import hl0.IdCardInvalidationInitData;
import hl0.IdCardInvalidationTheftDescription;
import hl0.c;
import nb2.SummaryModel;
import ob2.WelcomeData;
import oc2.TheftDescriptionResult;
import p071kotlin.Metadata;
import p119ub2.h1;
import rc2.WelcomeResult;
import vb2.ContactDetailsResult;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Ltc2/b;", "Ltc2/a;", "Ltc2/c;", "dataSource", "<init>", "(Ltc2/c;)V", "Lal0/j;", "data", "Loq/i0;", "j6", "(Lal0/j;)V", "Lob2/a;", "u4", "(Lob2/a;)V", "Lmb2/a;", "g2", "(Lmb2/a;)V", "Lhl0/d;", "W6", "(Lhl0/d;)V", "Lal0/i;", "s1", "(Lal0/i;)V", "clear", "()V", "a", "Ltc2/c;", "Lhl0/b$b;", "O3", "()Lhl0/b$b;", "requireOfficeData", "V", "()Lal0/j;", "contactDetails", "T4", "()Lhl0/d;", "theftDescriptionData", "Lhl0/c;", "d5", "()Lhl0/c;", "requireInvalidationReason", "u", "()Lal0/i;", "selectedOffice", "Lnb2/a;", "W1", "()Lnb2/a;", "requireSummaryModel", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f189467b = a.f79185b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c dataSource;

    public b(c cVar) {
        this.dataSource = cVar;
    }

    @Override // zb2.a
    public IdCardInvalidationInitData.OfficeData O3() {
        return ((WelcomeData) this.dataSource.f(h1.n.f197348b)).getInitData().getOfficeData();
    }

    @Override // oc2.a
    public IdCardInvalidationTheftDescription T4() {
        return (IdCardInvalidationTheftDescription) this.dataSource.b(h1.m.f197347b);
    }

    @Override // oc2.a
    public BEContactDetailsData V() {
        return (BEContactDetailsData) this.dataSource.b(h1.a.f197335b);
    }

    @Override // kc2.a
    public SummaryModel W1() {
        return this.dataSource.e();
    }

    @Override // oc2.a
    public void W6(IdCardInvalidationTheftDescription data) {
        this.dataSource.a(h1.m.f197347b, new TheftDescriptionResult(data));
    }

    @Override // p115tc2.a
    public void clear() {
        this.dataSource.c();
    }

    @Override // hc2.a
    public c d5() {
        return ((mb2.a) this.dataSource.f(h1.g.f197341b)).getInvalidationReason();
    }

    @Override // ec2.a
    public void g2(mb2.a data) {
        this.dataSource.a(h1.g.f197341b, new InvalidationReasonResult(data));
    }

    @Override // vb2.a
    public void j6(BEContactDetailsData data) {
        this.dataSource.a(h1.a.f197335b, new ContactDetailsResult(data));
    }

    @Override // cc2.a
    public void s1(BECommunityOffice data) {
        this.dataSource.a(h1.i.f197343b, new OfficeSelectionResult(data));
    }

    @Override // ec2.a
    public BECommunityOffice u() {
        return (BECommunityOffice) this.dataSource.b(h1.i.f197343b);
    }

    @Override // rc2.a
    public void u4(WelcomeData data) {
        this.dataSource.a(h1.n.f197348b, new WelcomeResult(data));
    }
}
