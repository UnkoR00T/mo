package b92;

import fp0.ApplicantDetails;
import fp0.SummaryData;
import j92.ViolationDescriptionResult;
import k82.ApplicantDetailsResult;
import p071kotlin.Metadata;
import q92.WasteTypeListResult;
import t82.LocationDetailsResult;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R$\u0010,\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00101¨\u00063"}, d2 = {"Lb92/k;", "Lb92/i;", "Lb92/h$a;", "dataSourceFactory", "Lfp0/k;", "initialViolationTypeTag", "<init>", "(Lb92/h$a;Lfp0/k;)V", "Lfp0/m;", "tag", "Loq/i0;", "s8", "(Lfp0/m;)V", "Lfp0/a;", "data", "d3", "(Lfp0/a;)V", "Lj92/b$a;", "J1", "(Lj92/b$a;)V", "a", "Lb92/h$a;", "b", "Lfp0/k;", "Lb92/h;", "c", "Loq/k;", "d", "()Lb92/h;", "dataSource", "Lw04/c;", "value", "Z4", "()Lw04/c;", "P8", "(Lw04/c;)V", "locationDetails", "R3", "()Lj92/b$a;", "violationDescriptionData", "v7", "()Lfp0/k;", "t3", "(Lfp0/k;)V", "violationTypeTag", "Z5", "()Lfp0/a;", "applicantDetails", "Lfp0/j;", "()Lfp0/j;", "summaryData", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.a dataSourceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fp0.k initialViolationTypeTag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k dataSource = oq.l.a(new er.a() { // from class: b92.j
        @Override // er.a
        public final Object a() {
            return k.b(this.f17637a);
        }
    });

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lb92/k$a;", "", "Lfp0/k;", "initialViolationTypeTag", "Lb92/k;", "a", "(Lfp0/k;)Lb92/k;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        k a(fp0.k initialViolationTypeTag);
    }

    public k(h.a aVar, fp0.k kVar) {
        this.dataSourceFactory = aVar;
        this.initialViolationTypeTag = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h b(k kVar) {
        return kVar.dataSourceFactory.a(kVar.initialViolationTypeTag);
    }

    private final h d() {
        return (h) this.dataSource.getValue();
    }

    @Override // j92.a
    public void J1(ViolationDescriptionResult.Data data) {
        d().a(i82.s.e.f90224b, new ViolationDescriptionResult(data));
    }

    @Override // t82.a
    public void P8(LocationDetails locationDetails) {
        d().a(i82.s.c.f90222b, new LocationDetailsResult(locationDetails));
    }

    @Override // j92.a
    public ViolationDescriptionResult.Data R3() {
        return (ViolationDescriptionResult.Data) d().b(i82.s.e.f90224b);
    }

    @Override // t82.a
    public LocationDetails Z4() {
        return (LocationDetails) d().f(i82.s.c.f90222b);
    }

    @Override // k82.a
    public ApplicantDetails Z5() {
        return (ApplicantDetails) d().b(i82.s.a.f90220b);
    }

    @Override // f92.a
    public SummaryData c() {
        return d().e();
    }

    @Override // k82.a
    public void d3(ApplicantDetails data) {
        d().a(i82.s.a.f90220b, new ApplicantDetailsResult(data));
    }

    @Override // q92.a
    public void s8(fp0.m tag) {
        d().a(i82.s.i.f90228b, new WasteTypeListResult(tag));
    }

    @Override // n92.a
    public void t3(fp0.k kVar) {
        d().i(kVar);
    }

    @Override // n92.a
    public fp0.k v7() {
        return d().getViolationTypeTag();
    }
}
