package p115tc2;

import al0.BECommunityOffice;
import al0.BEContactDetailsData;
import er.l;
import er.q;
import fr.q0;
import hl0.IdCardInvalidationInitData;
import hl0.IdCardInvalidationTheftDescription;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import l00.e;
import l00.g;
import mu.h;
import mu.p0;
import nb2.SummaryModel;
import ob2.WelcomeData;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.d;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00032\u00020\u00032\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R,\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030'8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0010\u001a\u0004\b*\u0010+R \u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00107\u001a\b\u0012\u0004\u0012\u00020\u00030.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b088\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b6\u00109\u0012\u0004\b<\u0010\u0010\u001a\u0004\b:\u0010;R\u0016\u0010?\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0016\u0010J\u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0016\u0010M\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Ltc2/n;", "Ll00/g;", "Ltc2/h;", "", "Ltc2/a;", "Lyy/a;", "stateMachineFactory", "dataSourceContract", "<init>", "(Lyy/a;Ltc2/a;)V", "state", "Ltc2/i;", "k9", "(Ltc2/h;)Ltc2/i;", "Loq/i0;", "j9", "()V", "clear", "Lob2/a;", "data", "u4", "(Lob2/a;)V", "Lmb2/a;", "g2", "(Lmb2/a;)V", "Lal0/i;", "s1", "(Lal0/i;)V", "Lal0/j;", "j6", "(Lal0/j;)V", "Lhl0/d;", "W6", "(Lhl0/d;)V", "b", "Ltc2/a;", "c", "Ltc2/h;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Ltc2/f;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "f", "g", "nestedNavAction", "Lmu/p0;", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "u", "()Lal0/i;", "selectedOffice", "Lhl0/b$b;", "O3", "()Lhl0/b$b;", "requireOfficeData", "Lhl0/c;", "d5", "()Lhl0/c;", "requireInvalidationReason", "T4", "()Lhl0/d;", "theftDescriptionData", "V", "()Lal0/j;", "contactDetails", "Lnb2/a;", "W1", "()Lnb2/a;", "requireSummaryModel", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends g<h, Object> implements e, zx.b, p115tc2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p115tc2.a dataSourceContract;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<h, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<f> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<Object> nestedNavAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<i> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f189487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f189488b;

        /* JADX INFO: renamed from: tc2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4925a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f189489a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f189490b;

            /* JADX INFO: renamed from: tc2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4926a extends d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f189491d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f189492e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f189493f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f189495h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f189496j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f189497k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f189498l;

                public C4926a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f189491d = obj;
                    this.f189492e |= PKIFailureInfo.systemUnavail;
                    return C4925a.this.F(null, this);
                }
            }

            public C4925a(h hVar, n nVar) {
                this.f189489a = hVar;
                this.f189490b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4926a c4926a;
                if (eVar instanceof C4926a) {
                    c4926a = (C4926a) eVar;
                    int i15 = c4926a.f189492e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4926a.f189492e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4926a = new C4926a(eVar);
                    }
                } else {
                    c4926a = new C4926a(eVar);
                }
                Object obj2 = c4926a.f189491d;
                Object objE = uq.b.e();
                int i16 = c4926a.f189492e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f189489a;
                    i iVarK9 = this.f189490b.k9((h) obj);
                    c4926a.f189493f = j.a(obj);
                    c4926a.f189495h = j.a(c4926a);
                    c4926a.f189496j = j.a(obj);
                    c4926a.f189497k = j.a(hVar);
                    c4926a.f189498l = 0;
                    c4926a.f189492e = 1;
                    if (hVar.F(iVarK9, c4926a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, n nVar) {
            this.f189487a = gVar;
            this.f189488b = nVar;
        }

        @Override // mu.g
        public Object a(h<? super i> hVar, tq.e eVar) {
            Object objA = this.f189487a.a(new C4925a(hVar, this.f189488b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltc2/e;", "<unused var>", "Ltc2/h;", "Loq/i0;", "<anonymous>", "(Ltc2/e;Ltc2/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements q<e, h, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189499e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f189499e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<f> bVarY1 = n.this.Y1();
                f.a aVar = f.a.f189473a;
                this.f189499e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(e eVar, h hVar, tq.e<? super i0> eVar2) {
            return n.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltc2/d;", "<unused var>", "Ltc2/h;", "Loq/i0;", "<anonymous>", "(Ltc2/d;Ltc2/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements q<d, h, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189501e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f189501e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<Object> bVarG = n.this.g();
                g gVar = g.f189474a;
                this.f189501e = 1;
                if (bVarG.F(gVar, this) == objE) {
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
        public final Object w(d dVar, h hVar, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, p115tc2.a aVar2) {
        this.dataSourceContract = aVar2;
        h hVar = h.f189475a;
        this.initialState = hVar;
        this.stateMachine = aVar.a(hVar, new l() { // from class: tc2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f189479a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.nestedNavAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(hVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i k9(h state) {
        return i.f189476a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final n nVar, v vVar) {
        vVar.c(q0.c(h.class), new l() { // from class: tc2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f189480a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(e.class), oVar, bVar);
        zVar.x(q0.c(d.class), oVar, nVar.new c(null));
        return i0.f148189a;
    }

    @Override // zb2.a
    public IdCardInvalidationInitData.OfficeData O3() {
        return this.dataSourceContract.O3();
    }

    @Override // oc2.a
    public IdCardInvalidationTheftDescription T4() {
        return this.dataSourceContract.T4();
    }

    @Override // oc2.a
    public BEContactDetailsData V() {
        return this.dataSourceContract.V();
    }

    @Override // kc2.a
    public SummaryModel W1() {
        return this.dataSourceContract.W1();
    }

    @Override // oc2.a
    public void W6(IdCardInvalidationTheftDescription data) {
        this.dataSourceContract.W6(data);
    }

    @Override // zx.b
    public xw.b<f> Y1() {
        return this.navAction;
    }

    @Override // p115tc2.a
    public void clear() {
        this.dataSourceContract.clear();
    }

    @Override // hc2.a
    public hl0.c d5() {
        return this.dataSourceContract.d5();
    }

    @Override // l00.g
    protected t<h, Object> e9() {
        return this.stateMachine;
    }

    public xw.b<Object> g() {
        return this.nestedNavAction;
    }

    @Override // ec2.a
    public void g2(mb2.a data) {
        this.dataSourceContract.g2(data);
    }

    @Override // vb2.a
    public void j6(BEContactDetailsData data) {
        this.dataSourceContract.j6(data);
    }

    public void j9() {
        d9(e.f189472a);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // cc2.a
    public void s1(BECommunityOffice data) {
        this.dataSourceContract.s1(data);
    }

    @Override // ec2.a
    public BECommunityOffice u() {
        return this.dataSourceContract.u();
    }

    @Override // rc2.a
    public void u4(WelcomeData data) {
        this.dataSourceContract.u4(data);
    }
}
