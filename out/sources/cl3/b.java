package cl3;

import iy.b0;
import p071kotlin.Metadata;
import tm3.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001aR*\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, d2 = {"Lcl3/b;", "Lcl3/a;", "Lh00/a;", "Ltm3/z;", "Lh00/b;", "Lik3/a;", "Lpl/gov/coi/mobywatel/feature/vehicleregistration/presentation/form/main/FormDataSource;", "dataSource", "<init>", "(Lh00/a;)V", "Llk3/a;", "ownerType", "Loq/i0;", "d", "(Llk3/a;)V", "Liy/b0;", "edorAddress", "U", "(Liy/b0;)V", "Lnk3/a;", "data", "f", "(Lnk3/a;)V", "Lkk3/b;", "code", "b", "(Ljava/lang/String;)V", "e", "c", "g", "a", "Lh00/a;", "()Lnk3/a;", "requireRegistrationType", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f28169b = h00.a.f79185b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h00.a<z, h00.b, ik3.a> dataSource;

    public b(h00.a<z, h00.b, ik3.a> aVar) {
        this.dataSource = aVar;
    }

    @Override // sk3.a
    public void U(b0 edorAddress) {
        this.dataSource.a(z.b.f190960c, new VehicleRegistrationResult(edorAddress));
    }

    @Override // cm3.a, zl3.a
    public nk3.a a() {
        return (nk3.a) this.dataSource.f(z.y.f190983c);
    }

    @Override // cm3.a
    public void b(String code) {
        this.dataSource.a(z.s.f190977c, new VehicleRegistrationResult(kk3.b.a(code)));
    }

    @Override // wl3.a
    public void c(String code) {
        this.dataSource.a(z.q.f190975c, new VehicleRegistrationResult(kk3.b.a(code)));
    }

    @Override // hl3.a
    public void d(lk3.a ownerType) {
        this.dataSource.a(z.j.f190968c, new VehicleRegistrationResult(ownerType));
    }

    @Override // zl3.a
    public void e(String code) {
        this.dataSource.a(z.r.f190976c, new VehicleRegistrationResult(kk3.b.a(code)));
    }

    @Override // rm3.a
    public void f(nk3.a data) {
        this.dataSource.a(z.y.f190983c, new VehicleRegistrationResult(data));
    }

    @Override // ml3.a
    public void g(String code) {
        this.dataSource.a(z.l.f190970c, new VehicleRegistrationResult(kk3.b.a(code)));
    }
}
