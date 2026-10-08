package z31;

import bl0.BEChildBirthChildData;
import bl0.BEChildBirthPlaceOfBirthOffices;
import bl0.BEChildBirthRegistrationInitial;
import bl0.m;
import bl0.s;
import er.q;
import fr.q0;
import g51.ReceiveDocumentAddressData;
import iy.b0;
import java.util.List;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\"\u0010 \u001a\u00020\r2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\nH\u0096\u0001¢\u0006\u0004\b \u0010\u000fJ\u001c\u0010!\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b!\u0010\u0011J\u0010\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020-H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010-H\u0096\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b3\u00104J\u0018\u00106\u001a\u00020\r2\u0006\u00105\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010*H\u0096\u0001¢\u0006\u0004\b8\u0010,J\u0010\u00109\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b9\u0010\u001cJ\u0012\u0010;\u001a\u0004\u0018\u00010:H\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020:H\u0096\u0001¢\u0006\u0004\b=\u0010>J\u0012\u0010@\u001a\u0004\u0018\u00010?H\u0096\u0001¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020?H\u0096\u0001¢\u0006\u0004\bB\u0010CJ\u0012\u0010E\u001a\u0004\u0018\u00010DH\u0096\u0001¢\u0006\u0004\bE\u0010FJ\u0018\u0010H\u001a\u00020\r2\u0006\u0010G\u001a\u00020DH\u0096\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010K\u001a\u00020JH\u0096\u0001¢\u0006\u0004\bK\u0010LJ\u0018\u0010O\u001a\u00020\r2\u0006\u0010N\u001a\u00020MH\u0096\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\bQ\u0010\u001cJ\u0010\u0010S\u001a\u00020RH\u0096\u0001¢\u0006\u0004\bS\u0010TJ\u0012\u0010V\u001a\u0004\u0018\u00010UH\u0096\u0001¢\u0006\u0004\bV\u0010WJ\u0018\u0010X\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020UH\u0096\u0001¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020?H\u0096\u0001¢\u0006\u0004\bZ\u0010AJ\u0012\u0010\\\u001a\u0004\u0018\u00010[H\u0096\u0001¢\u0006\u0004\b\\\u0010]J\u0018\u0010^\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020[H\u0096\u0001¢\u0006\u0004\b^\u0010_J\u0018\u0010a\u001a\u00020\r2\u0006\u0010`\u001a\u00020JH\u0096\u0001¢\u0006\u0004\ba\u0010bR\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010eR&\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030g8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR \u0010s\u001a\b\u0012\u0004\u0012\u00020n0m8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u001d\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00020t8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x¨\u0006z"}, d2 = {"Lz31/i;", "Ll00/g;", "Lz31/f;", "", "Lz31/c;", "Lyy/a;", "stateMachineFactory", "dataSourceContract", "<init>", "(Lyy/a;Lz31/c;)V", "", "Lbl0/b;", "children", "Loq/i0;", "q5", "(Ljava/util/List;)V", "f8", "()Ljava/util/List;", "Lxw/e;", "x", "()Lxw/e;", "Lbl0/d;", "data", "S2", "(Lbl0/d;)V", "A6", "()Lbl0/d;", "U1", "()V", "V0", "Lb51/a;", "parentsSections", "f2", "k8", "Lbl0/n;", "i", "()Lbl0/n;", "B7", "(Lbl0/n;)V", "", "l", "()Z", "Lbl0/s;", "r0", "()Lbl0/s;", "Lq51/a$a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37090q, "(Lq51/a$a;)V", "K1", "()Lq51/a$a;", "Lu51/a$a;", "c", "()Lu51/a$a;", "selection", "o2", "(Lbl0/s;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37092s, "X6", "Lc41/a$a;", "n5", "()Lc41/a$a;", "C5", "(Lc41/a$a;)V", "Lf41/a$a;", "C7", "()Lf41/a$a;", "W3", "(Lf41/a$a;)V", "Lbl0/m;", "b5", "()Lbl0/m;", "contactData", "H7", "(Lbl0/m;)V", "Liy/b0;", "K", "()Liy/b0;", "Lbl0/g;", "selectedMethod", "q1", "(Lbl0/g;)V", "l7", "", "s2", "()Ljava/lang/String;", "Lg51/a;", "Q", "()Lg51/a;", "F0", "(Lg51/a;)V", "Z0", "Lbl0/f;", "E4", "()Lbl0/f;", "W2", "(Lbl0/f;)V", "edorAddress", "U", "(Liy/b0;)V", "b", "Lz31/c;", "Lz31/f;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lz31/e;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends l00.g<f, Object> implements zx.d, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c dataSourceContract;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<f, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<f> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz31/e;", "action", "Lz31/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lz31/e;Lz31/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements q<e, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f232784f;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e eVar = (e) this.f232784f;
            Object objE = uq.b.e();
            int i15 = this.f232783e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<e> bVarY1 = i.this.Y1();
                this.f232784f = vq.j.a(eVar);
                this.f232783e = 1;
                if (bVarY1.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(e eVar, f fVar, tq.e<? super i0> eVar2) {
            a aVar = i.this.new a(eVar2);
            aVar.f232784f = eVar;
            return aVar.J(i0.f148189a);
        }
    }

    public i(yy.a aVar, c cVar) {
        this.dataSourceContract = cVar;
        f fVar = f.f232775a;
        this.initialState = fVar;
        this.stateMachine = aVar.a(fVar, new er.l() { // from class: z31.g
            @Override // er.l
            public final Object b(Object obj) {
                return i.j9(this.f232776a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(e9().getState(), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j9(final i iVar, v vVar) {
        vVar.c(q0.c(f.class), new er.l() { // from class: z31.h
            @Override // er.l
            public final Object b(Object obj) {
                return i.k9(this.f232777a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k9(i iVar, z zVar) {
        a aVar = iVar.new a(null);
        zVar.x(q0.c(e.class), o.CANCEL_PREVIOUS, aVar);
        return i0.f148189a;
    }

    @Override // w41.a
    public bl0.d A6() {
        return this.dataSourceContract.A6();
    }

    @Override // d51.a
    public void B7(BEChildBirthRegistrationInitial data) {
        this.dataSourceContract.B7(data);
    }

    @Override // c41.a
    public void C5(c41.a.InterfaceC0617a data) {
        this.dataSourceContract.C5(data);
    }

    @Override // f41.a
    public f41.a.Data C7() {
        return this.dataSourceContract.C7();
    }

    @Override // i41.a
    public BEChildBirthPlaceOfBirthOffices E4() {
        return this.dataSourceContract.E4();
    }

    @Override // m51.a, g51.b
    public void F0(ReceiveDocumentAddressData data) {
        this.dataSourceContract.F0(data);
    }

    @Override // q51.a
    public void H3(q51.a.Data data) {
        this.dataSourceContract.H3(data);
    }

    @Override // p41.a
    public s H5() {
        return this.dataSourceContract.H5();
    }

    @Override // s41.a
    public void H7(m contactData) {
        this.dataSourceContract.H7(contactData);
    }

    @Override // s41.a, j51.a
    public b0 K() {
        return this.dataSourceContract.K();
    }

    @Override // q51.a
    public q51.a.Data K1() {
        return this.dataSourceContract.K1();
    }

    @Override // m51.a, g51.b
    public ReceiveDocumentAddressData Q() {
        return this.dataSourceContract.Q();
    }

    @Override // w41.a
    public void S2(bl0.d data) {
        this.dataSourceContract.S2(data);
    }

    @Override // x31.a
    public void U(b0 edorAddress) {
        this.dataSourceContract.U(edorAddress);
    }

    @Override // w41.a
    public void U1() {
        this.dataSourceContract.U1();
    }

    @Override // z41.a, p41.a
    public bl0.d V0() {
        return this.dataSourceContract.V0();
    }

    @Override // i41.a
    public void W2(BEChildBirthPlaceOfBirthOffices data) {
        this.dataSourceContract.W2(data);
    }

    @Override // f41.a
    public void W3(f41.a.Data data) {
        this.dataSourceContract.W3(data);
    }

    @Override // p41.a
    public void X6() {
        this.dataSourceContract.X6();
    }

    @Override // zx.b
    public xw.b<e> Y1() {
        return this.navAction;
    }

    @Override // i41.a
    public f41.a.Data Z0() {
        return this.dataSourceContract.Z0();
    }

    @Override // s41.a
    public m b5() {
        return this.dataSourceContract.b5();
    }

    @Override // u51.a
    public u51.a.Data c() {
        return this.dataSourceContract.c();
    }

    @Override // l00.g
    protected t<f, Object> e9() {
        return this.stateMachine;
    }

    @Override // z41.a
    public void f2(List<? extends b51.a<?>> parentsSections) {
        this.dataSourceContract.f2(parentsSections);
    }

    @Override // l41.a
    public List<BEChildBirthChildData> f8() {
        return this.dataSourceContract.f8();
    }

    @Override // z41.a, q51.a, g51.b
    public BEChildBirthRegistrationInitial i() {
        return this.dataSourceContract.i();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // z41.a
    public List<b51.a<?>> k8() {
        return this.dataSourceContract.k8();
    }

    @Override // q51.a, p41.a, c41.a, f41.a, j51.a, i41.a
    public boolean l() {
        return this.dataSourceContract.l();
    }

    @Override // j51.a
    public void l7() {
        this.dataSourceContract.l7();
    }

    @Override // c41.a
    public c41.a.InterfaceC0617a n5() {
        return this.dataSourceContract.n5();
    }

    @Override // p41.a
    public void o2(s selection) {
        this.dataSourceContract.o2(selection);
    }

    @Override // j51.a
    public void q1(bl0.g selectedMethod) {
        this.dataSourceContract.q1(selectedMethod);
    }

    @Override // l41.a
    public void q5(List<BEChildBirthChildData> children) {
        this.dataSourceContract.q5(children);
    }

    @Override // q51.a, j51.a
    public s r0() {
        return this.dataSourceContract.r0();
    }

    @Override // j51.a
    public String s2() {
        return this.dataSourceContract.s2();
    }

    @Override // w41.a, z41.a, p41.a
    public xw.e x() {
        return this.dataSourceContract.x();
    }
}
