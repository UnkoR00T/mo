package nc1;

import f00.j0;
import fr.q0;
import hb1.PostOfficeBoxData;
import java.util.Map;
import mu.p0;
import oc1.CorrespondencePostOfficeBoxContractData;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001/B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030$8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lnc1/w;", "Ll00/g;", "Lnc1/h;", "", "Lnc1/i;", "Lyy/a;", "stateMachineFactory", "Lpc1/b;", "mapper", "Lqb1/b;", "validatePostOfficeBoxInfoUC", "Loc1/a;", "contract", "<init>", "(Lyy/a;Lpc1/b;Lqb1/b;Loc1/a;)V", "state", "Lnc1/i$a;", "q9", "(Lnc1/h;)Lnc1/i$a;", "b", "Lpc1/b;", "c", "Lqb1/b;", "d", "Loc1/a;", "Lnc1/h$b;", "e", "Lnc1/h$b;", "initialState", "Lxw/b;", "Lnc1/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<nc1.h, Object> implements nc1.i, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pc1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qb1.b validatePostOfficeBoxInfoUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oc1.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final nc1.h.FormDisplayed initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<nc1.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<nc1.h, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<nc1.i.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lnc1/w$a;", "Lf00/j0;", "Loc1/a;", "Lnc1/w;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<oc1.a, w> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<nc1.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f133982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f133983b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f133984a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f133985b;

            /* JADX INFO: renamed from: nc1.w$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3326a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f133986d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f133987e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f133988f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f133990h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f133991j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f133992k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f133993l;

                public C3326a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f133986d = obj;
                    this.f133987e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, w wVar) {
                this.f133984a = hVar;
                this.f133985b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3326a c3326a;
                if (eVar instanceof C3326a) {
                    c3326a = (C3326a) eVar;
                    int i15 = c3326a.f133987e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3326a.f133987e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3326a = new C3326a(eVar);
                    }
                } else {
                    c3326a = new C3326a(eVar);
                }
                Object obj2 = c3326a.f133986d;
                Object objE = uq.b.e();
                int i16 = c3326a.f133987e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f133984a;
                    nc1.i.a aVarQ9 = this.f133985b.q9((nc1.h) obj);
                    c3326a.f133988f = vq.j.a(obj);
                    c3326a.f133990h = vq.j.a(c3326a);
                    c3326a.f133991j = vq.j.a(obj);
                    c3326a.f133992k = vq.j.a(hVar);
                    c3326a.f133993l = 0;
                    c3326a.f133987e = 1;
                    if (hVar.F(aVarQ9, c3326a) == objE) {
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

        public b(mu.g gVar, w wVar) {
            this.f133982a = gVar;
            this.f133983b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super nc1.i.a> hVar, tq.e eVar) {
            Object objA = this.f133982a.a(new a(hVar, this.f133983b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnc1/a;", "<unused var>", "Lnc1/h;", "Loq/i0;", "<anonymous>", "(Lnc1/a;Lnc1/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<nc1.a, nc1.h, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133994e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f133994e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nc1.b> bVarY1 = w.this.Y1();
                nc1.b.a aVar = nc1.b.a.f133926a;
                this.f133994e = 1;
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
        public final Object w(nc1.a aVar, nc1.h hVar, tq.e<? super i0> eVar) {
            return w.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lnc1/h$b;", "it", "Lk10/l;", "Lnc1/h;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<nc1.h.FormDisplayed>, tq.e<? super k10.l<? extends nc1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133996e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f133997f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nc1.h.FormDisplayed O(PostOfficeBoxData postOfficeBoxData, nc1.h.FormDisplayed formDisplayed) {
            String city = postOfficeBoxData.getCity();
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            return formDisplayed.a(new nc1.h.Field<>(c2039b, postOfficeBoxData.getPostalCode()), new nc1.h.Field<>(c2039b, city), new nc1.h.Field<>(c2039b, postOfficeBoxData.getPostOfficeName()), new nc1.h.Field<>(c2039b, postOfficeBoxData.getBoxNumber()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f133997f;
            uq.b.e();
            if (this.f133996e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            CorrespondencePostOfficeBoxContractData correspondencePostOfficeBoxContractDataE0 = w.this.contract.E0();
            final PostOfficeBoxData postOfficeBoxData = correspondencePostOfficeBoxContractDataE0 != null ? correspondencePostOfficeBoxContractDataE0.getPostOfficeBoxData() : null;
            return postOfficeBoxData != null ? c0Var.b(new er.l() { // from class: nc1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.d.O(postOfficeBoxData, (h.FormDisplayed) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<nc1.h.FormDisplayed> c0Var, tq.e<? super k10.l<? extends nc1.h>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = w.this.new d(eVar);
            dVar.f133997f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnc1/e;", "action", "Lk10/c0;", "Lnc1/h$b;", "state", "Lk10/l;", "Lnc1/h;", "<anonymous>", "(Lnc1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnCityChanged, k10.c0<nc1.h.FormDisplayed>, tq.e<? super k10.l<? extends nc1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134000f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134001g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nc1.h.FormDisplayed O(OnCityChanged onCityChanged, nc1.h.FormDisplayed formDisplayed) {
            return nc1.h.FormDisplayed.b(formDisplayed, null, new nc1.h.Field(null, onCityChanged.getCity(), 1, null), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCityChanged onCityChanged = (OnCityChanged) this.f134000f;
            k10.c0 c0Var = (k10.c0) this.f134001g;
            uq.b.e();
            if (this.f133999e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nc1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.e.O(onCityChanged, (h.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCityChanged onCityChanged, k10.c0<nc1.h.FormDisplayed> c0Var, tq.e<? super k10.l<? extends nc1.h>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f134000f = onCityChanged;
            eVar2.f134001g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnc1/f;", "action", "Lk10/c0;", "Lnc1/h$b;", "state", "Lk10/l;", "Lnc1/h;", "<anonymous>", "(Lnc1/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OnPostOfficeCodeChanged, k10.c0<nc1.h.FormDisplayed>, tq.e<? super k10.l<? extends nc1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134002e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134003f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134004g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nc1.h.FormDisplayed O(OnPostOfficeCodeChanged onPostOfficeCodeChanged, nc1.h.FormDisplayed formDisplayed) {
            return nc1.h.FormDisplayed.b(formDisplayed, null, null, new nc1.h.Field(null, onPostOfficeCodeChanged.getPostOffice(), 1, null), null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPostOfficeCodeChanged onPostOfficeCodeChanged = (OnPostOfficeCodeChanged) this.f134003f;
            k10.c0 c0Var = (k10.c0) this.f134004g;
            uq.b.e();
            if (this.f134002e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nc1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.f.O(onPostOfficeCodeChanged, (h.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPostOfficeCodeChanged onPostOfficeCodeChanged, k10.c0<nc1.h.FormDisplayed> c0Var, tq.e<? super k10.l<? extends nc1.h>> eVar) {
            f fVar = new f(eVar);
            fVar.f134003f = onPostOfficeCodeChanged;
            fVar.f134004g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnc1/g;", "action", "Lk10/c0;", "Lnc1/h$b;", "state", "Lk10/l;", "Lnc1/h;", "<anonymous>", "(Lnc1/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OnPostalCodeChanged, k10.c0<nc1.h.FormDisplayed>, tq.e<? super k10.l<? extends nc1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134006f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134007g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nc1.h.FormDisplayed O(OnPostalCodeChanged onPostalCodeChanged, nc1.h.FormDisplayed formDisplayed) {
            return nc1.h.FormDisplayed.b(formDisplayed, new nc1.h.Field(null, onPostalCodeChanged.getPostalCode(), 1, null), null, null, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPostalCodeChanged onPostalCodeChanged = (OnPostalCodeChanged) this.f134006f;
            k10.c0 c0Var = (k10.c0) this.f134007g;
            uq.b.e();
            if (this.f134005e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nc1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.g.O(onPostalCodeChanged, (h.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPostalCodeChanged onPostalCodeChanged, k10.c0<nc1.h.FormDisplayed> c0Var, tq.e<? super k10.l<? extends nc1.h>> eVar) {
            g gVar = new g(eVar);
            gVar.f134006f = onPostalCodeChanged;
            gVar.f134007g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnc1/d;", "action", "Lk10/c0;", "Lnc1/h$b;", "state", "Lk10/l;", "Lnc1/h;", "<anonymous>", "(Lnc1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<OnBoxNumberChanged, k10.c0<nc1.h.FormDisplayed>, tq.e<? super k10.l<? extends nc1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134009f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134010g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nc1.h.FormDisplayed O(OnBoxNumberChanged onBoxNumberChanged, nc1.h.FormDisplayed formDisplayed) {
            return nc1.h.FormDisplayed.b(formDisplayed, null, null, null, new nc1.h.Field(null, onBoxNumberChanged.getBoxNumber(), 1, null), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnBoxNumberChanged onBoxNumberChanged = (OnBoxNumberChanged) this.f134009f;
            k10.c0 c0Var = (k10.c0) this.f134010g;
            uq.b.e();
            if (this.f134008e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nc1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.h.O(onBoxNumberChanged, (h.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnBoxNumberChanged onBoxNumberChanged, k10.c0<nc1.h.FormDisplayed> c0Var, tq.e<? super k10.l<? extends nc1.h>> eVar) {
            h hVar = new h(eVar);
            hVar.f134009f = onBoxNumberChanged;
            hVar.f134010g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnc1/c;", "action", "Lk10/c0;", "Lnc1/h$b;", "state", "Lk10/l;", "Lnc1/h;", "<anonymous>", "(Lnc1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<nc1.c, k10.c0<nc1.h.FormDisplayed>, tq.e<? super k10.l<? extends nc1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f134012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f134013g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f134014h;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nc1.h.FormDisplayed O(Map map, nc1.h.FormDisplayed formDisplayed) {
            nc1.h.Field<String> fieldD = formDisplayed.d();
            Object objJ = v0.j(map, g0.CITY);
            hz.b.Companion companion = hz.b.INSTANCE;
            return formDisplayed.a(nc1.h.Field.b(formDisplayed.f(), companion.a((hz.g) v0.j(map, g0.POSTAL_CODE)), null, 2, null), nc1.h.Field.b(fieldD, companion.a((hz.g) objJ), null, 2, null), nc1.h.Field.b(formDisplayed.e(), companion.a((hz.g) v0.j(map, g0.POST_OFFICE)), null, 2, null), nc1.h.Field.b(formDisplayed.c(), companion.a((hz.g) v0.j(map, g0.BOX_NUMBER)), null, 2, null));
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x011a, code lost:
        
            if (r2.F(r4, r11) == r1) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: nc1.w.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nc1.c cVar, k10.c0<nc1.h.FormDisplayed> c0Var, tq.e<? super k10.l<? extends nc1.h>> eVar) {
            i iVar = w.this.new i(eVar);
            iVar.f134014h = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    public w(yy.a aVar, pc1.b bVar, qb1.b bVar2, oc1.a aVar2) {
        this.mapper = bVar;
        this.validatePostOfficeBoxInfoUC = bVar2;
        this.contract = aVar2;
        hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
        nc1.h.FormDisplayed formDisplayed = new nc1.h.FormDisplayed(new nc1.h.Field(c2039b, ""), new nc1.h.Field(c2039b, ""), new nc1.h.Field(c2039b, ""), new nc1.h.Field(c2039b, ""));
        this.initialState = formDisplayed;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(formDisplayed, new er.l() { // from class: nc1.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.v9(this.f133974a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), q9(formDisplayed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nc1.i.a q9(nc1.h state) {
        return this.mapper.b(new pc1.b.Params(state, new er.l() { // from class: nc1.p
            @Override // er.l
            public final Object b(Object obj) {
                return w.r9(this.f133968a, (String) obj);
            }
        }, new er.l() { // from class: nc1.q
            @Override // er.l
            public final Object b(Object obj) {
                return w.s9(this.f133969a, (String) obj);
            }
        }, new er.l() { // from class: nc1.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.t9(this.f133970a, (String) obj);
            }
        }, new er.l() { // from class: nc1.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.u9(this.f133971a, (String) obj);
            }
        }, b9(nc1.c.f133929a), b9(nc1.a.f133924a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(w wVar, String str) {
        wVar.d9(new OnCityChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(w wVar, String str) {
        wVar.d9(new OnPostalCodeChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(w wVar, String str) {
        wVar.d9(new OnPostOfficeCodeChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(w wVar, String str) {
        wVar.d9(new OnBoxNumberChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(nc1.h.class), new er.l() { // from class: nc1.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.w9(this.f133972a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(nc1.h.FormDisplayed.class), new er.l() { // from class: nc1.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.x9(this.f133973a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(w wVar, k10.z zVar) {
        c cVar = wVar.new c(null);
        zVar.x(q0.c(nc1.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(w wVar, k10.z zVar) {
        zVar.A(wVar.new d(null));
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnCityChanged.class), oVar, eVar);
        zVar.v(q0.c(OnPostOfficeCodeChanged.class), oVar, new f(null));
        zVar.v(q0.c(OnPostalCodeChanged.class), oVar, new g(null));
        zVar.v(q0.c(OnBoxNumberChanged.class), oVar, new h(null));
        zVar.v(q0.c(nc1.c.class), oVar, wVar.new i(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public /* bridge */ void P5(Object obj) {
        super.P5(obj);
    }

    @Override // zx.b
    public xw.b<nc1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<nc1.h, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<nc1.i.a> getState() {
        return this.state;
    }
}
