package yd1;

import f00.j0;
import fr.q0;
import k10.c0;
import k10.z;
import ld1.CompanyApplicationCitizenData;
import ld1.KnownUserDataModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zd1.HomeAddressContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001+B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lyd1/p;", "Ll00/g;", "Lyd1/f;", "", "Lyd1/g;", "Lyy/a;", "stateMachineFactory", "Lae1/a;", "mapper", "Lzd1/a;", "homeAddressContract", "<init>", "(Lyy/a;Lae1/a;Lzd1/a;)V", "state", "Lyd1/g$a;", "n9", "(Lyd1/f;)Lyd1/g$a;", "b", "Lae1/a;", "c", "Lzd1/a;", "Lyd1/f$b;", "d", "Lyd1/f$b;", "initialState", "Lxw/b;", "Lyd1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<yd1.f, Object> implements yd1.g, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ae1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zd1.a homeAddressContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yd1.f.b initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yd1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<yd1.f, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<yd1.g.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lyd1/p$a;", "Lf00/j0;", "Lzd1/a;", "Lyd1/p;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<zd1.a, p> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<yd1.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f226542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f226543b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f226544a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f226545b;

            /* JADX INFO: renamed from: yd1.p$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6073a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f226546d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f226547e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f226548f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f226550h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f226551j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f226552k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f226553l;

                public C6073a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f226546d = obj;
                    this.f226547e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f226544a = hVar;
                this.f226545b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6073a c6073a;
                if (eVar instanceof C6073a) {
                    c6073a = (C6073a) eVar;
                    int i15 = c6073a.f226547e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6073a.f226547e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6073a = new C6073a(eVar);
                    }
                } else {
                    c6073a = new C6073a(eVar);
                }
                Object obj2 = c6073a.f226546d;
                Object objE = uq.b.e();
                int i16 = c6073a.f226547e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f226544a;
                    yd1.g.a aVarN9 = this.f226545b.n9((yd1.f) obj);
                    c6073a.f226548f = vq.j.a(obj);
                    c6073a.f226550h = vq.j.a(c6073a);
                    c6073a.f226551j = vq.j.a(obj);
                    c6073a.f226552k = vq.j.a(hVar);
                    c6073a.f226553l = 0;
                    c6073a.f226547e = 1;
                    if (hVar.F(aVarN9, c6073a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, p pVar) {
            this.f226542a = gVar;
            this.f226543b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super yd1.g.a> hVar, tq.e eVar) {
            Object objA = this.f226542a.a(new a(hVar, this.f226543b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyd1/a;", "<unused var>", "Lyd1/f;", "Loq/i0;", "<anonymous>", "(Lyd1/a;Lyd1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<yd1.a, yd1.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226554e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f226554e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yd1.b> bVarY1 = p.this.Y1();
                yd1.b.a aVar = yd1.b.a.f226505a;
                this.f226554e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yd1.a aVar, yd1.f fVar, tq.e<? super i0> eVar) {
            return p.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyd1/f$b;", "it", "Lk10/l;", "Lyd1/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<yd1.f.b>, tq.e<? super k10.l<? extends yd1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226557f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yd1.f.DataDisplayed O(hb1.c cVar, hb1.c cVar2, yd1.f.b bVar) {
            yd1.f.c cVar3;
            if (fr.t.c(cVar2, cVar)) {
                cVar3 = yd1.f.c.PermanentAddressSelection;
            } else {
                cVar3 = hb1.d.c(cVar) ? yd1.f.c.OtherAddressSelection : yd1.f.c.NoSelection;
            }
            return new yd1.f.DataDisplayed(cVar, cVar2, cVar3, null, 8, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            CompanyApplicationCitizenData citizenData;
            c0 c0Var = (c0) this.f226557f;
            uq.b.e();
            if (this.f226556e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            HomeAddressContractData homeAddressContractDataR = p.this.homeAddressContract.r();
            final hb1.c homeAddress = homeAddressContractDataR != null ? homeAddressContractDataR.getHomeAddress() : null;
            KnownUserDataModel knownUserDataModelQ = p.this.homeAddressContract.q();
            final hb1.c cVar = new hb1.c(null, (knownUserDataModelQ == null || (citizenData = knownUserDataModelQ.getCitizenData()) == null) ? null : citizenData.getPermanentAddress(), 1, null);
            return hb1.d.b(cVar) ? c0Var.d(new er.l() { // from class: yd1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(homeAddress, cVar, (f.b) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<yd1.f.b> c0Var, tq.e<? super k10.l<? extends yd1.f>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f226557f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyd1/e;", "<unused var>", "Lk10/c0;", "Lyd1/f$a;", "state", "Lk10/l;", "Lyd1/f;", "<anonymous>", "(Lyd1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<yd1.e, c0<yd1.f.DataDisplayed>, tq.e<? super k10.l<? extends yd1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226560f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yd1.f.DataDisplayed O(yd1.f.DataDisplayed dataDisplayed) {
            return yd1.f.DataDisplayed.b(dataDisplayed, null, null, yd1.f.c.PermanentAddressSelection, hz.b.C2039b.f86846c, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f226560f;
            uq.b.e();
            if (this.f226559e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yd1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O((f.DataDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yd1.e eVar, c0<yd1.f.DataDisplayed> c0Var, tq.e<? super k10.l<? extends yd1.f>> eVar2) {
            e eVar3 = new e(eVar2);
            eVar3.f226560f = c0Var;
            return eVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyd1/d;", "<unused var>", "Lk10/c0;", "Lyd1/f$a;", "state", "Lk10/l;", "Lyd1/f;", "<anonymous>", "(Lyd1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<yd1.d, c0<yd1.f.DataDisplayed>, tq.e<? super k10.l<? extends yd1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226562f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yd1.f.DataDisplayed O(yd1.f.DataDisplayed dataDisplayed) {
            return yd1.f.DataDisplayed.b(dataDisplayed, null, null, yd1.f.c.OtherAddressSelection, hz.b.C2039b.f86846c, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f226562f;
            uq.b.e();
            if (this.f226561e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yd1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.f.O((f.DataDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yd1.d dVar, c0<yd1.f.DataDisplayed> c0Var, tq.e<? super k10.l<? extends yd1.f>> eVar) {
            f fVar = new f(eVar);
            fVar.f226562f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyd1/c;", "<unused var>", "Lk10/c0;", "Lyd1/f$a;", "state", "Lk10/l;", "Lyd1/f;", "<anonymous>", "(Lyd1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<yd1.c, c0<yd1.f.DataDisplayed>, tq.e<? super k10.l<? extends yd1.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226564f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f226566a;

            static {
                int[] iArr = new int[yd1.f.c.values().length];
                try {
                    iArr[yd1.f.c.PermanentAddressSelection.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yd1.f.c.OtherAddressSelection.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[yd1.f.c.NoSelection.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f226566a = iArr;
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yd1.f.DataDisplayed O(yd1.f.DataDisplayed dataDisplayed) {
            return yd1.f.DataDisplayed.b(dataDisplayed, null, null, null, new hz.b.Invalid(null, 1, null), 7, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
        
            if (r7.F(r2, r6) == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
        
            if (r7.F(r2, r6) == r1) goto L30;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f226564f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f226563e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L81
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto Lb1
            L23:
                oq.u.b(r7)
                java.lang.Object r7 = r0.a()
                yd1.f$a r7 = (yd1.f.DataDisplayed) r7
                yd1.f$c r7 = r7.getSelectionState()
                int[] r2 = yd1.p.g.a.f226566a
                int r7 = r7.ordinal()
                r7 = r2[r7]
                if (r7 == r4) goto L86
                if (r7 == r3) goto L4f
                r1 = 3
                if (r7 != r1) goto L49
                yd1.t r7 = new yd1.t
                r7.<init>()
                k10.l r7 = r0.b(r7)
                return r7
            L49:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            L4f:
                yd1.p r7 = yd1.p.this
                xw.b r7 = r7.Y1()
                yd1.b$b r2 = new yd1.b$b
                yd1.p r4 = yd1.p.this
                ae1.a r4 = yd1.p.l9(r4)
                java.lang.Object r5 = r0.a()
                yd1.f$a r5 = (yd1.f.DataDisplayed) r5
                hb1.c r5 = r5.getPreviouslySelectedAddress()
                if (r5 == 0) goto L6e
                st3.b r5 = r5.getTerytObject()
                goto L6f
            L6e:
                r5 = 0
            L6f:
                st3.d r4 = r4.e(r5)
                r2.<init>(r4)
                r6.f226564f = r0
                r6.f226563e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L81
                goto Lb0
            L81:
                k10.l r7 = r0.c()
                return r7
            L86:
                yd1.p r7 = yd1.p.this
                zd1.a r7 = yd1.p.k9(r7)
                zd1.b r2 = new zd1.b
                java.lang.Object r3 = r0.a()
                yd1.f$a r3 = (yd1.f.DataDisplayed) r3
                hb1.c r3 = r3.getPermanentAddress()
                r2.<init>(r3)
                r7.T2(r2)
                yd1.p r7 = yd1.p.this
                xw.b r7 = r7.Y1()
                yd1.b$c r2 = yd1.b.c.f226507a
                r6.f226564f = r0
                r6.f226563e = r4
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto Lb1
            Lb0:
                return r1
            Lb1:
                k10.l r7 = r0.c()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: yd1.p.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yd1.c cVar, c0<yd1.f.DataDisplayed> c0Var, tq.e<? super k10.l<? extends yd1.f>> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f226564f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ae1.a aVar2, zd1.a aVar3) {
        this.mapper = aVar2;
        this.homeAddressContract = aVar3;
        yd1.f.b bVar = yd1.f.b.f226515a;
        this.initialState = bVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: yd1.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.o9(this.f226535a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), n9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yd1.g.a n9(yd1.f state) {
        return this.mapper.b(new ae1.a.Params(state, b9(yd1.e.f226510a), b9(yd1.d.f226509a), b9(yd1.c.f226508a), b9(yd1.a.f226504a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(yd1.f.class), new er.l() { // from class: yd1.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.p9(this.f226532a, (z) obj);
            }
        });
        vVar.c(q0.c(yd1.f.b.class), new er.l() { // from class: yd1.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f226533a, (z) obj);
            }
        });
        vVar.c(q0.c(yd1.f.DataDisplayed.class), new er.l() { // from class: yd1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.r9(this.f226534a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(p pVar, z zVar) {
        c cVar = pVar.new c(null);
        zVar.x(q0.c(yd1.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(p pVar, z zVar) {
        zVar.A(pVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(p pVar, z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(yd1.e.class), oVar, eVar);
        zVar.v(q0.c(yd1.d.class), oVar, new f(null));
        zVar.v(q0.c(yd1.c.class), oVar, pVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public /* bridge */ void P5(Object obj) {
        super.P5(obj);
    }

    @Override // zx.b
    public xw.b<yd1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<yd1.f, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<yd1.g.a> getState() {
        return this.state;
    }
}
