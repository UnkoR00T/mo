package z31;

import bl0.BEChildBirthChildData;
import bl0.BEChildBirthParents;
import bl0.BEChildBirthPlaceOfBirthOffices;
import bl0.BEChildBirthRegistration;
import bl0.BEChildBirthRegistrationInitial;
import bl0.m;
import bl0.s;
import g51.ReceiveDocumentAddressData;
import iy.b0;
import java.util.List;
import p071kotlin.Metadata;
import p099p31.n;
import p099p31.o;
import p099p31.p;
import p099p31.q;
import p099p31.r;
import p099p31.t;
import p099p31.u;
import pq.v;
import y41.r0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0011\u0010/\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020+H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\f2\u0006\u0010\u001a\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\fH\u0016¢\u0006\u0004\b:\u0010\u000eJ\u0017\u0010;\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b;\u0010<J\u0011\u0010=\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b=\u0010\u000bJ\u0011\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020>H\u0016¢\u0006\u0004\bA\u0010@J\u0017\u0010B\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020>H\u0016¢\u0006\u0004\bB\u0010CJ\u0011\u0010D\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bD\u0010\u0011J\u0017\u0010E\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010FJ\u001d\u0010I\u001a\u00020\f2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u0015H\u0016¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\b\u0012\u0004\u0012\u00020G0\u0015H\u0016¢\u0006\u0004\bK\u0010\u0018J\u0011\u0010L\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\bL\u0010\u0014J\u0017\u0010N\u001a\u00020\f2\u0006\u0010M\u001a\u00020\u0012H\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bT\u0010UJ!\u0010W\u001a\u00020\f2\u0010\u0010V\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u0015H\u0016¢\u0006\u0004\bW\u0010JJ\u001b\u0010X\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010\u0015H\u0016¢\u0006\u0004\bX\u0010\u0018J\u000f\u0010Y\u001a\u00020\fH\u0016¢\u0006\u0004\bY\u0010\u000eJ\u000f\u0010Z\u001a\u00020\fH\u0016¢\u0006\u0004\bZ\u0010\u000eJ\u0017\u0010\\\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020[H\u0016¢\u0006\u0004\b\\\u0010]J\u0011\u0010^\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\f2\u0006\u0010`\u001a\u00020PH\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\bd\u0010eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010f¨\u0006g"}, d2 = {"Lz31/d;", "Lz31/c;", "Lz31/a;", "dataSource", "<init>", "(Lz31/a;)V", "Lbl0/g;", "g", "()Lbl0/g;", "Lc41/a$a;", "b", "()Lc41/a$a;", "Loq/i0;", "a", "()V", "Lbl0/f;", "f", "()Lbl0/f;", "Lbl0/m;", "d", "()Lbl0/m;", "", "Lb51/a;", "e", "()Ljava/util/List;", "Lbl0/n;", "data", "B7", "(Lbl0/n;)V", "i", "()Lbl0/n;", "Lbl0/d;", "S2", "(Lbl0/d;)V", "A6", "()Lbl0/d;", "V0", "Lxw/e;", "x", "()Lxw/e;", "", "l", "()Z", "Lbl0/s;", "selection", "o2", "(Lbl0/s;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37092s, "()Lbl0/s;", "r0", "selectedMethod", "q1", "(Lbl0/g;)V", "Lq51/a$a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37090q, "(Lq51/a$a;)V", "K1", "()Lq51/a$a;", "X6", "C5", "(Lc41/a$a;)V", "n5", "Lf41/a$a;", "C7", "()Lf41/a$a;", "Z0", "W3", "(Lf41/a$a;)V", "E4", "W2", "(Lbl0/f;)V", "Lbl0/b;", "children", "q5", "(Ljava/util/List;)V", "f8", "b5", "contactData", "H7", "(Lbl0/m;)V", "Liy/b0;", "K", "()Liy/b0;", "", "s2", "()Ljava/lang/String;", "parentsSections", "f2", "k8", "U1", "l7", "Lg51/a;", "F0", "(Lg51/a;)V", "Q", "()Lg51/a;", "edorAddress", "U", "(Liy/b0;)V", "Lu51/a$a;", "c", "()Lu51/a$a;", "Lz31/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f232773b = h00.a.f79185b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a dataSource;

    public d(a aVar) {
        this.dataSource = aVar;
    }

    private final void a() {
        this.dataSource.d(p099p31.i.f152770a);
    }

    private final c41.a.InterfaceC0617a b() {
        return (c41.a.InterfaceC0617a) this.dataSource.f(p099p31.j.f152778a);
    }

    private final m d() {
        return (m) this.dataSource.f(p099p31.m.f152800a);
    }

    private final List<b51.a<?>> e() {
        return (List) this.dataSource.f(p.f152818a);
    }

    private final BEChildBirthPlaceOfBirthOffices f() {
        return (BEChildBirthPlaceOfBirthOffices) this.dataSource.f(p099p31.i.f152770a);
    }

    private final bl0.g g() {
        return (bl0.g) this.dataSource.f(r.f152829a);
    }

    @Override // w41.a
    public bl0.d A6() {
        return (bl0.d) this.dataSource.b(o.f152811a);
    }

    @Override // d51.a
    public void B7(BEChildBirthRegistrationInitial data) {
        this.dataSource.a(q.f152824a, new ChildBirthRegistrationResult(data));
    }

    @Override // c41.a
    public void C5(c41.a.InterfaceC0617a data) {
        this.dataSource.a(p099p31.j.f152778a, new ChildBirthRegistrationResult(data));
    }

    @Override // f41.a
    public f41.a.Data C7() {
        return (f41.a.Data) this.dataSource.b(p099p31.h.f152760a);
    }

    @Override // i41.a
    public BEChildBirthPlaceOfBirthOffices E4() {
        return (BEChildBirthPlaceOfBirthOffices) this.dataSource.b(p099p31.i.f152770a);
    }

    @Override // m51.a, g51.b
    public void F0(ReceiveDocumentAddressData data) {
        this.dataSource.a(t.f152841a, new ChildBirthRegistrationResult(data));
    }

    @Override // q51.a
    public void H3(q51.a.Data data) {
        this.dataSource.a(u.f152847a, new ChildBirthRegistrationResult(data));
    }

    @Override // p41.a
    public s H5() {
        return (s) this.dataSource.b(p099p31.l.f152793a);
    }

    @Override // s41.a
    public void H7(m contactData) {
        this.dataSource.a(p099p31.m.f152800a, new ChildBirthRegistrationResult(contactData));
    }

    @Override // s41.a, j51.a
    public b0 K() {
        return (b0) this.dataSource.f(n.f152805a);
    }

    @Override // q51.a
    public q51.a.Data K1() {
        return (q51.a.Data) this.dataSource.b(u.f152847a);
    }

    @Override // m51.a, g51.b
    public ReceiveDocumentAddressData Q() {
        return (ReceiveDocumentAddressData) this.dataSource.b(t.f152841a);
    }

    @Override // w41.a
    public void S2(bl0.d data) {
        this.dataSource.a(o.f152811a, new ChildBirthRegistrationResult(data));
    }

    @Override // x31.a
    public void U(b0 edorAddress) {
        this.dataSource.a(n.f152805a, new ChildBirthRegistrationResult(edorAddress));
    }

    @Override // w41.a
    public void U1() {
        this.dataSource.d(p.f152818a);
    }

    @Override // z41.a, p41.a
    public bl0.d V0() {
        return (bl0.d) this.dataSource.f(o.f152811a);
    }

    @Override // i41.a
    public void W2(BEChildBirthPlaceOfBirthOffices data) {
        this.dataSource.a(p099p31.i.f152770a, new ChildBirthRegistrationResult(data));
    }

    @Override // f41.a
    public void W3(f41.a.Data data) {
        String territorialCode = data.getTerritorialCode();
        f41.a.Data dataC7 = C7();
        if (!fr.t.c(territorialCode, dataC7 != null ? dataC7.getTerritorialCode() : null)) {
            a();
        }
        this.dataSource.a(p099p31.h.f152760a, new ChildBirthRegistrationResult(data));
    }

    @Override // p41.a
    public void X6() {
        this.dataSource.d(u.f152847a);
    }

    @Override // i41.a
    public f41.a.Data Z0() {
        return (f41.a.Data) this.dataSource.f(p099p31.h.f152760a);
    }

    @Override // s41.a
    public m b5() {
        return (m) this.dataSource.b(p099p31.m.f152800a);
    }

    @Override // u51.a
    public u51.a.Data c() {
        BEChildBirthRegistrationInitial bEChildBirthRegistrationInitialI = i();
        BEChildBirthRegistration.BEApplicantData aVarB = q31.d.b(bEChildBirthRegistrationInitialI);
        BEChildBirthParents eVarP = r0.p(e(), bEChildBirthRegistrationInitialI.getBirth().getGender());
        List<BEChildBirthChildData> listF8 = f8();
        bl0.d dVarV0 = V0();
        bl0.g gVarG = g();
        c41.a.InterfaceC0617a interfaceC0617aB = b();
        return new u51.a.Data(aVarB, eVarP, listF8, dVarV0, Z0(), interfaceC0617aB, gVarG, r0(), d(), K1(), Q(), f(), K());
    }

    @Override // z41.a
    public void f2(List<? extends b51.a<?>> parentsSections) {
        this.dataSource.a(p.f152818a, new ChildBirthRegistrationResult(parentsSections));
    }

    @Override // l41.a
    public List<BEChildBirthChildData> f8() {
        List<BEChildBirthChildData> list = (List) this.dataSource.b(p099p31.k.f152787a);
        return list == null ? v.n() : list;
    }

    @Override // z41.a, q51.a, g51.b
    public BEChildBirthRegistrationInitial i() {
        return (BEChildBirthRegistrationInitial) this.dataSource.f(q.f152824a);
    }

    @Override // z41.a
    public List<b51.a<?>> k8() {
        return (List) this.dataSource.b(p.f152818a);
    }

    @Override // q51.a, p41.a, c41.a, f41.a, j51.a, i41.a
    public boolean l() {
        return ((List) this.dataSource.f(p099p31.k.f152787a)).size() > 1;
    }

    @Override // j51.a
    public void l7() {
        this.dataSource.d(t.f152841a);
    }

    @Override // c41.a
    public c41.a.InterfaceC0617a n5() {
        return (c41.a.InterfaceC0617a) this.dataSource.b(p099p31.j.f152778a);
    }

    @Override // p41.a
    public void o2(s selection) {
        this.dataSource.a(p099p31.l.f152793a, new ChildBirthRegistrationResult(selection));
    }

    @Override // j51.a
    public void q1(bl0.g selectedMethod) {
        this.dataSource.a(r.f152829a, new ChildBirthRegistrationResult(selectedMethod));
    }

    @Override // l41.a
    public void q5(List<BEChildBirthChildData> children) {
        this.dataSource.a(p099p31.k.f152787a, new ChildBirthRegistrationResult(children));
    }

    @Override // q51.a, j51.a
    public s r0() {
        return (s) this.dataSource.f(p099p31.l.f152793a);
    }

    @Override // j51.a
    public String s2() {
        return f().getChosenCivilRegistryOffice().getName();
    }

    @Override // w41.a, z41.a, p41.a
    public xw.e x() {
        return ((BEChildBirthRegistrationInitial) this.dataSource.f(q.f152824a)).getBirth().getGender();
    }
}
