package zt3;

import bh0.BETerytDetail;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressFormVMSSetupData;
import st3.AddressTerytDetail;
import tt3.AddressSearchData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004Bs\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(J,\u0010.\u001a\b\u0012\u0004\u0012\u00020!0-2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020!0)2\u0006\u0010,\u001a\u00020+H\u0082@¢\u0006\u0004\b.\u0010/J#\u00100\u001a\b\u0012\u0004\u0012\u00020!0-2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020!0)H\u0002¢\u0006\u0004\b0\u00101J$\u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204022\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b5\u0010%J\u0017\u00107\u001a\u00020!2\u0006\u00106\u001a\u00020!H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\u0002H\u0002¢\u0006\u0004\b:\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR&\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030X8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R \u0010*\u001a\b\u0012\u0004\u0012\u0002090^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010g\u001a\u0004\u0018\u00010d*\u00020c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006h"}, d2 = {"Lzt3/d0;", "Ll00/g;", "Lzt3/f;", "Lzt3/a;", "Lzt3/g;", "Lyy/a;", "stateMachineFactory", "Lau3/m;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lxt3/d;", "restoreTerytDetailsUseCase", "Lch0/d;", "getProvincesUseCase", "Lch0/c;", "getCountiesUseCase", "Lch0/b;", "getCommunitiesUseCase", "Lch0/a;", "getCitiesUseCase", "Lch0/f;", "getStreetsUseCase", "Lib4/c;", "genericDomainErrorMapper", "Ldz/c;", "postCodeFormatter", "Lbu3/b;", "modeFactory", "Lst3/g;", "adapter", "<init>", "(Lyy/a;Lau3/m;Lac4/a;Lxt3/d;Lch0/d;Lch0/c;Lch0/b;Lch0/a;Lch0/f;Lib4/c;Ldz/c;Lbu3/b;Lst3/g;)V", "Lzt3/f$a;", "stateSnapshot", "Loq/i0;", "na", "(Lzt3/f$a;Ltq/e;)Ljava/lang/Object;", "Lst3/b;", "P9", "(Lzt3/f$a;)Lst3/b;", "Lk10/c0;", "state", "", "cleanWhiteSpace", "Lk10/l;", "oa", "(Lk10/c0;ZLtq/e;)Ljava/lang/Object;", "ea", "(Lk10/c0;)Lk10/l;", "", "Lzt3/m1;", "Lhz/g;", "ma", "form", "da", "(Lzt3/f$a;)Lzt3/f$a;", "Lzt3/g$b;", "S9", "(Lzt3/f;)Lzt3/g$b;", "b", "Lau3/m;", "c", "Lac4/a;", "d", "Lxt3/d;", "e", "Lch0/d;", "f", "Lch0/c;", "g", "Lch0/b;", "h", "Lch0/a;", "j", "Lch0/f;", "k", "Lib4/c;", "l", "Ldz/c;", "m", "Lst3/g;", "Q9", "()Lst3/g;", "Lzt3/f$b;", "n", "Lzt3/f$b;", "initialState", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "Lzt3/c;", "Lbh0/a;", "R9", "(Lzt3/c;)Lbh0/a;", "selectedItem", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 extends l00.g<zt3.f, zt3.a> implements zt3.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final au3.m mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xt3.d restoreTerytDetailsUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ch0.d getProvincesUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ch0.c getCountiesUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ch0.b getCommunitiesUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ch0.a getCitiesUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ch0.f getStreetsUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final dz.c postCodeFormatter;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final st3.g adapter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final zt3.f.Setup initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<zt3.f, zt3.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<zt3.g.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237455e;

        /* JADX INFO: renamed from: zt3.d0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C6411a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d0 f237457a;

            C6411a(d0 d0Var) {
                this.f237457a = d0Var;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(st3.g.a aVar, tq.e<? super oq.i0> eVar) {
                if (aVar instanceof st3.g.a.c) {
                    this.f237457a.d9(new zt3.a.ValidateState(this.f237457a.getAdapter().getSetupData().getCleanWhiteSpace()));
                } else if (aVar instanceof st3.g.a.C4759a) {
                    this.f237457a.d9(zt3.a.o.f237414a);
                } else {
                    if (!fr.t.c(aVar, st3.g.a.b.f184305a)) {
                        throw new oq.p();
                    }
                    this.f237457a.d9(zt3.a.q.f237417a);
                }
                return oq.i0.f148189a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f237455e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<st3.g.a> bVarE = d0.this.getAdapter().e();
                C6411a c6411a = new C6411a(d0.this);
                this.f237455e = 1;
                if (bVarE.a(c6411a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return d0.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((a) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<zt3.g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f237458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f237459b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f237460a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f237461b;

            /* JADX INFO: renamed from: zt3.d0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6412a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f237462d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f237463e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f237464f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f237466h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f237467j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f237468k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f237469l;

                public C6412a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f237462d = obj;
                    this.f237463e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, d0 d0Var) {
                this.f237460a = hVar;
                this.f237461b = d0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6412a c6412a;
                if (eVar instanceof C6412a) {
                    c6412a = (C6412a) eVar;
                    int i15 = c6412a.f237463e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6412a.f237463e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6412a = new C6412a(eVar);
                    }
                } else {
                    c6412a = new C6412a(eVar);
                }
                Object obj2 = c6412a.f237462d;
                Object objE = uq.b.e();
                int i16 = c6412a.f237463e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f237460a;
                    zt3.g.Data bVarS9 = this.f237461b.S9((zt3.f) obj);
                    c6412a.f237464f = vq.j.a(obj);
                    c6412a.f237466h = vq.j.a(c6412a);
                    c6412a.f237467j = vq.j.a(obj);
                    c6412a.f237468k = vq.j.a(hVar);
                    c6412a.f237469l = 0;
                    c6412a.f237463e = 1;
                    if (hVar.F(bVarS9, c6412a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, d0 d0Var) {
            this.f237458a = gVar;
            this.f237459b = d0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super zt3.g.Data> hVar, tq.e eVar) {
            Object objA = this.f237458a.a(new a(hVar, this.f237459b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzt3/f$b;", "it", "Loq/i0;", "<anonymous>", "(Lzt3/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<zt3.f.Setup, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237470e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f237470e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            AddressFormVMSSetupData addressFormVMSSetupDataA = d0.this.getAdapter().getSetupData();
            AddressFormVMSSetupData.a formData = addressFormVMSSetupDataA.getFormData();
            if (formData == null) {
                d0.this.d9(new zt3.a.FetchInitialData(addressFormVMSSetupDataA.getMode()));
                return oq.i0.f148189a;
            }
            d0.this.d9(new zt3.a.RestoreForm(addressFormVMSSetupDataA.getMode(), formData));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(zt3.f.Setup setup, tq.e<? super oq.i0> eVar) {
            return ((c) v(setup, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return d0.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$a;", "action", "Lk10/c0;", "Lzt3/f$b;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<zt3.a.FetchInitialData, k10.c0<zt3.f.Setup>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237474g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lzt3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends zt3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f237476e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d0 f237477f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ zt3.a.FetchInitialData f237478g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<zt3.f.Setup> f237479h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, zt3.a.FetchInitialData fetchInitialData, k10.c0<zt3.f.Setup> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f237477f = d0Var;
                this.f237478g = fetchInitialData;
                this.f237479h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final zt3.f.Form V(k10.c0 c0Var, List list, zt3.f.Setup setup) {
                zt3.f.Form form = new zt3.f.Form(((zt3.f.Setup) c0Var.a()).getMode(), null, null, null, 6, null);
                return zt3.f.Form.c(form, null, AddressState.b(form.getAddressState(), DropDown.b(form.getAddressState().getProvince(), null, list, null, null, 13, null), null, null, null, null, null, null, null, 254, null), null, null, 13, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f237476e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ch0.d dVar = this.f237477f.getProvincesUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f237476e = 1;
                    obj = dVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                d0 d0Var = this.f237477f;
                zt3.a.FetchInitialData fetchInitialData = this.f237478g;
                final k10.c0<zt3.f.Setup> c0Var = this.f237479h;
                if (iVar instanceof dx.i.Left) {
                    d0Var.d9(new zt3.a.OnError((dx.b) ((dx.i.Left) iVar).b(), fetchInitialData, d0Var.b9(zt3.a.b.f237399a)));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: zt3.e0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.d.a.V(c0Var, list, (f.Setup) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f237477f, this.f237478g, this.f237479h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends zt3.f>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zt3.a.FetchInitialData fetchInitialData = (zt3.a.FetchInitialData) this.f237473f;
            k10.c0 c0Var = (k10.c0) this.f237474g;
            Object objE = uq.b.e();
            int i15 = this.f237472e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, fetchInitialData, c0Var, null);
            this.f237473f = vq.j.a(fetchInitialData);
            this.f237474g = vq.j.a(c0Var);
            this.f237472e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.FetchInitialData fetchInitialData, k10.c0<zt3.f.Setup> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            d dVar = d0.this.new d(eVar);
            dVar.f237473f = fetchInitialData;
            dVar.f237474g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$p;", "action", "Lk10/c0;", "Lzt3/f$b;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<zt3.a.RestoreForm, k10.c0<zt3.f.Setup>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237481f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237482g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lzt3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends zt3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f237484e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d0 f237485f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ zt3.a.RestoreForm f237486g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<zt3.f.Setup> f237487h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, zt3.a.RestoreForm restoreForm, k10.c0<zt3.f.Setup> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f237485f = d0Var;
                this.f237486g = restoreForm;
                this.f237487h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final zt3.f.Form V(k10.c0 c0Var, xt3.d.Result bVar, d0 d0Var, zt3.a.RestoreForm restoreForm, zt3.f.Setup setup) {
                AddressState addressState = new AddressState(null, null, null, null, null, null, null, null, GF2Field.MASK, null);
                zt3.f.Form form = new zt3.f.Form(((zt3.f.Setup) c0Var.a()).getMode(), null, null, null, 6, null);
                DropDown dropDownB = DropDown.b(addressState.getProvince(), null, bVar.getProvincesResult().a(), bVar.getProvincesResult().getState(), null, 9, null);
                DropDown dropDownB2 = DropDown.b(addressState.getCounty(), null, bVar.getCountiesResult().a(), bVar.getCountiesResult().getState(), null, 9, null);
                DropDown dropDownB3 = DropDown.b(addressState.getCommunity(), null, bVar.getCommunitiesResult().a(), bVar.getCommunitiesResult().getState(), null, 9, null);
                DropDown dropDownB4 = DropDown.b(addressState.getCity(), null, bVar.getCitiesResult().a(), bVar.getCitiesResult().getState(), null, 9, null);
                dz.c cVar = d0Var.postCodeFormatter;
                String postalCode = restoreForm.getFormData().getPostalCode();
                if (postalCode == null) {
                    postalCode = "";
                }
                Regular regular = new Regular(null, cVar.a(postalCode), 1, null);
                DropDown dropDownB5 = DropDown.b(addressState.getStreet(), null, bVar.getStreetResult().a(), bVar.getStreetResult().getState(), null, 9, null);
                String buildingNumber = restoreForm.getFormData().getBuildingNumber();
                if (buildingNumber == null) {
                    buildingNumber = "";
                }
                Regular regular2 = new Regular(null, buildingNumber, 1, null);
                String apartmentNumber = restoreForm.getFormData().getApartmentNumber();
                return zt3.f.Form.c(form, null, addressState.a(dropDownB, dropDownB2, dropDownB3, dropDownB4, regular, dropDownB5, regular2, new Regular(null, apartmentNumber != null ? apartmentNumber : "", 1, null)), null, null, 13, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f237484e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    xt3.d dVar = this.f237485f.restoreTerytDetailsUseCase;
                    String province = this.f237486g.getFormData().getProvince();
                    String strB = province != null ? wt3.a.b(province) : null;
                    String county = this.f237486g.getFormData().getCounty();
                    String strB2 = county != null ? wt3.a.b(county) : null;
                    String community = this.f237486g.getFormData().getCommunity();
                    String strB3 = community != null ? wt3.a.b(community) : null;
                    String city = this.f237486g.getFormData().getCity();
                    String strB4 = city != null ? wt3.a.b(city) : null;
                    String street = this.f237486g.getFormData().getStreet();
                    xt3.d.a aVar = new xt3.d.a(strB, strB2, strB3, strB4, street != null ? wt3.a.b(street) : null, null);
                    this.f237484e = 1;
                    obj = dVar.l(aVar, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                final d0 d0Var = this.f237485f;
                final zt3.a.RestoreForm restoreForm = this.f237486g;
                final k10.c0<zt3.f.Setup> c0Var = this.f237487h;
                if (iVar instanceof dx.i.Left) {
                    d0Var.d9(new zt3.a.OnError((dx.b) ((dx.i.Left) iVar).b(), restoreForm, d0Var.b9(zt3.a.b.f237399a)));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final xt3.d.Result bVar = (xt3.d.Result) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: zt3.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.e.a.V(c0Var, bVar, d0Var, restoreForm, (f.Setup) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f237485f, this.f237486g, this.f237487h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends zt3.f>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zt3.a.RestoreForm restoreForm = (zt3.a.RestoreForm) this.f237481f;
            k10.c0 c0Var = (k10.c0) this.f237482g;
            Object objE = uq.b.e();
            int i15 = this.f237480e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, restoreForm, c0Var, null);
            this.f237481f = vq.j.a(restoreForm);
            this.f237482g = vq.j.a(c0Var);
            this.f237480e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.RestoreForm restoreForm, k10.c0<zt3.f.Setup> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            e eVar2 = d0.this.new e(eVar);
            eVar2.f237481f = restoreForm;
            eVar2.f237482g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzt3/a$b;", "<unused var>", "Lzt3/f;", "Loq/i0;", "<anonymous>", "(Lzt3/a$b;Lzt3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<zt3.a.b, zt3.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237488e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f237488e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<st3.g.b> bVarD = d0.this.getAdapter().d();
                st3.g.b.a aVar = st3.g.b.a.f184307a;
                this.f237488e = 1;
                if (bVarD.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.b bVar, zt3.f fVar, tq.e<? super oq.i0> eVar) {
            return d0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzt3/a$j;", "action", "Lzt3/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzt3/a$j;Lzt3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<zt3.a.OnError, zt3.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237491f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(zt3.a.OnError onError, d0 d0Var, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    onError.c().a();
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    d0Var.d9(onError.getAction());
                }
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zt3.a.OnError onError = (zt3.a.OnError) this.f237491f;
            Object objE = uq.b.e();
            int i15 = this.f237490e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<st3.g.b> bVarD = d0.this.getAdapter().d();
                ib4.c cVar = d0.this.genericDomainErrorMapper;
                dx.b domainError = onError.getDomainError();
                final d0 d0Var = d0.this;
                st3.g.b.GoToError goToError = new st3.g.b.GoToError(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: zt3.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.g.O(onError, d0Var, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f237491f = vq.j.a(onError);
                this.f237490e = 1;
                if (bVarD.F(goToError, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.OnError onError, zt3.f fVar, tq.e<? super oq.i0> eVar) {
            g gVar = d0.this.new g(eVar);
            gVar.f237491f = onError;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$k;", "action", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<zt3.a.OnPostalCodeChanged, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237494f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237495g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zt3.f.Form O(zt3.a.OnPostalCodeChanged onPostalCodeChanged, zt3.f.Form form) {
            return zt3.f.Form.c(form, null, AddressState.b(form.getAddressState(), null, null, null, null, form.getAddressState().getPostalCode().a(hz.b.d.f86848c, onPostalCodeChanged.getPostalCode()), null, null, null, 239, null), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zt3.a.OnPostalCodeChanged onPostalCodeChanged = (zt3.a.OnPostalCodeChanged) this.f237494f;
            k10.c0 c0Var = (k10.c0) this.f237495g;
            uq.b.e();
            if (this.f237493e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zt3.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.h.O(onPostalCodeChanged, (f.Form) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.OnPostalCodeChanged onPostalCodeChanged, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            h hVar = new h(eVar);
            hVar.f237494f = onPostalCodeChanged;
            hVar.f237495g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$e;", "action", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<zt3.a.OnBuildingNumberChanged, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237496e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237497f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237498g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zt3.f.Form O(zt3.a.OnBuildingNumberChanged onBuildingNumberChanged, zt3.f.Form form) {
            return zt3.f.Form.c(form, null, AddressState.b(form.getAddressState(), null, null, null, null, null, null, form.getAddressState().getBuildingNumber().a(hz.b.d.f86848c, onBuildingNumberChanged.getBuildingNumber()), null, 191, null), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zt3.a.OnBuildingNumberChanged onBuildingNumberChanged = (zt3.a.OnBuildingNumberChanged) this.f237497f;
            k10.c0 c0Var = (k10.c0) this.f237498g;
            uq.b.e();
            if (this.f237496e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zt3.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.i.O(onBuildingNumberChanged, (f.Form) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.OnBuildingNumberChanged onBuildingNumberChanged, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            i iVar = new i(eVar);
            iVar.f237497f = onBuildingNumberChanged;
            iVar.f237498g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$d;", "action", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<zt3.a.OnApartmentNumberChanged, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237501g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zt3.f.Form O(zt3.a.OnApartmentNumberChanged onApartmentNumberChanged, zt3.f.Form form) {
            return zt3.f.Form.c(form, null, AddressState.b(form.getAddressState(), null, null, null, null, null, null, null, form.getAddressState().getApartmentNumber().a(hz.b.d.f86848c, onApartmentNumberChanged.getApartmentNumber()), CertificateBody.profileType, null), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zt3.a.OnApartmentNumberChanged onApartmentNumberChanged = (zt3.a.OnApartmentNumberChanged) this.f237500f;
            k10.c0 c0Var = (k10.c0) this.f237501g;
            uq.b.e();
            if (this.f237499e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zt3.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.j.O(onApartmentNumberChanged, (f.Form) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.OnApartmentNumberChanged onApartmentNumberChanged, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            j jVar = new j(eVar);
            jVar.f237500f = onApartmentNumberChanged;
            jVar.f237501g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$r;", "action", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<zt3.a.ValidateState, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237504g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zt3.a.ValidateState validateState = (zt3.a.ValidateState) this.f237503f;
            k10.c0 c0Var = (k10.c0) this.f237504g;
            Object objE = uq.b.e();
            int i15 = this.f237502e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            d0 d0Var = d0.this;
            boolean cleanWhiteSpace = validateState.getCleanWhiteSpace();
            this.f237503f = vq.j.a(validateState);
            this.f237504g = vq.j.a(c0Var);
            this.f237502e = 1;
            Object objOa = d0Var.oa(c0Var, cleanWhiteSpace, this);
            return objOa == objE ? objE : objOa;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.ValidateState validateState, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            k kVar = d0.this.new k(eVar);
            kVar.f237503f = validateState;
            kVar.f237504g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$q;", "action", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<zt3.a.q, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237507f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f237507f;
            uq.b.e();
            if (this.f237506e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return d0.this.ea(c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.q qVar, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            l lVar = d0.this.new l(eVar);
            lVar.f237507f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$o;", "<unused var>", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<zt3.a.o, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237510f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zt3.f.Form O(zt3.f.Form form) {
            AddressState addressState = form.getAddressState();
            DropDown province = form.getAddressState().getProvince();
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            return zt3.f.Form.c(form, null, addressState.a(DropDown.b(province, c2039b, null, null, null, 14, null), DropDown.b(form.getAddressState().getCounty(), c2039b, null, null, null, 14, null), DropDown.b(form.getAddressState().getCommunity(), c2039b, null, null, null, 14, null), DropDown.b(form.getAddressState().getCity(), c2039b, null, null, null, 14, null), Regular.b(form.getAddressState().getPostalCode(), c2039b, null, 2, null), DropDown.b(form.getAddressState().getStreet(), c2039b, null, null, null, 14, null), Regular.b(form.getAddressState().getBuildingNumber(), c2039b, null, 2, null), Regular.b(form.getAddressState().getApartmentNumber(), c2039b, null, 2, null)), null, null, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f237510f;
            uq.b.e();
            if (this.f237509e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zt3.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.m.O((f.Form) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.o oVar, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            m mVar = new m(eVar);
            mVar.f237510f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$m;", "<unused var>", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<zt3.a.m, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237512f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zt3.f.Form O(zt3.f.Form form) {
            return zt3.f.Form.c(form, null, null, null, null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f237512f;
            uq.b.e();
            if (this.f237511e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zt3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.n.O((f.Form) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.m mVar, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            n nVar = new n(eVar);
            nVar.f237512f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzt3/f$a;", "state", "Loq/i0;", "<anonymous>", "(Lzt3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.p<zt3.f.Form, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237514f;

        o(tq.e<? super o> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zt3.f.Form form = (zt3.f.Form) this.f237514f;
            Object objE = uq.b.e();
            int i15 = this.f237513e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                this.f237514f = vq.j.a(form);
                this.f237513e = 1;
                if (d0Var.na(form, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(zt3.f.Form form, tq.e<? super oq.i0> eVar) {
            return ((o) v(form, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            o oVar = d0.this.new o(eVar);
            oVar.f237514f = obj;
            return oVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$l;", "action", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<zt3.a.OnProvinceSelected, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237517f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237518g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lzt3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends zt3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f237520e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d0 f237521f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ zt3.a.OnProvinceSelected f237522g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<zt3.f.Form> f237523h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, zt3.a.OnProvinceSelected onProvinceSelected, k10.c0<zt3.f.Form> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f237521f = d0Var;
                this.f237522g = onProvinceSelected;
                this.f237523h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 X() {
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final zt3.f.Form Y(zt3.a.OnProvinceSelected onProvinceSelected, List list, zt3.f.Form form) {
                return zt3.f.Form.c(form, null, AddressState.b(form.getAddressState(), DropDown.b(form.getAddressState().getProvince(), hz.b.d.f86848c, null, new zt3.d.Enabled(onProvinceSelected.getProvince()), null, 10, null), new DropDown(form.getAddressState().getCounty().getValidationState(), list, new zt3.d.Enabled(null, 1, null), form.getAddressState().getCounty().getFieldType()), new DropDown(form.getAddressState().getCommunity().getValidationState(), null, null, form.getAddressState().getCommunity().getFieldType(), 6, null), new DropDown(form.getAddressState().getCity().getValidationState(), null, null, form.getAddressState().getCity().getFieldType(), 6, null), null, new DropDown(form.getAddressState().getStreet().getValidationState(), null, null, form.getAddressState().getStreet().getFieldType(), 6, null), null, null, 208, null), null, m1.PROVINCE, 5, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f237520e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ch0.c cVar = this.f237521f.getCountiesUseCase;
                    ch0.c.Params params = new ch0.c.Params(this.f237522g.getProvince().getId(), null);
                    this.f237520e = 1;
                    obj = cVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                d0 d0Var = this.f237521f;
                final zt3.a.OnProvinceSelected onProvinceSelected = this.f237522g;
                k10.c0<zt3.f.Form> c0Var = this.f237523h;
                if (iVar instanceof dx.i.Left) {
                    d0Var.d9(new zt3.a.OnError((dx.b) ((dx.i.Left) iVar).b(), onProvinceSelected, new er.a() { // from class: zt3.m0
                        @Override // er.a
                        public final Object a() {
                            return d0.p.a.X();
                        }
                    }));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.b(new er.l() { // from class: zt3.n0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.p.a.Y(onProvinceSelected, list, (f.Form) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f237521f, this.f237522g, this.f237523h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends zt3.f>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zt3.a.OnProvinceSelected onProvinceSelected = (zt3.a.OnProvinceSelected) this.f237517f;
            k10.c0 c0Var = (k10.c0) this.f237518g;
            Object objE = uq.b.e();
            int i15 = this.f237516e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (fr.t.c(onProvinceSelected.getProvince(), d0.this.R9(((zt3.f.Form) c0Var.a()).getAddressState().getProvince()))) {
                    return c0Var.c();
                }
                ac4.a aVar = d0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(d0.this, onProvinceSelected, c0Var, null);
                this.f237517f = vq.j.a(onProvinceSelected);
                this.f237518g = vq.j.a(c0Var);
                this.f237516e = 1;
                obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return (k10.l) obj;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.OnProvinceSelected onProvinceSelected, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            p pVar = d0.this.new p(eVar);
            pVar.f237517f = onProvinceSelected;
            pVar.f237518g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$i;", "action", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<zt3.a.OnCountySelected, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237526g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lzt3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends zt3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f237528e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d0 f237529f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<zt3.f.Form> f237530g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ zt3.a.OnCountySelected f237531h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, k10.c0<zt3.f.Form> c0Var, zt3.a.OnCountySelected onCountySelected, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f237529f = d0Var;
                this.f237530g = c0Var;
                this.f237531h = onCountySelected;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 X() {
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final zt3.f.Form Y(zt3.a.OnCountySelected onCountySelected, List list, zt3.f.Form form) {
                return zt3.f.Form.c(form, null, AddressState.b(form.getAddressState(), null, DropDown.b(form.getAddressState().getCounty(), hz.b.d.f86848c, null, new zt3.d.Enabled(onCountySelected.getCounty()), null, 10, null), new DropDown(form.getAddressState().getCommunity().getValidationState(), list, new zt3.d.Enabled(null, 1, null), form.getAddressState().getCommunity().getFieldType()), new DropDown(form.getAddressState().getCity().getValidationState(), null, null, form.getAddressState().getCity().getFieldType(), 6, null), null, new DropDown(form.getAddressState().getStreet().getValidationState(), null, null, form.getAddressState().getStreet().getFieldType(), 6, null), null, null, 209, null), null, m1.COUNTY, 5, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f237528e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ch0.b bVar = this.f237529f.getCommunitiesUseCase;
                    ch0.b.Params params = new ch0.b.Params(this.f237529f.R9(this.f237530g.a().getAddressState().getProvince()).getId(), this.f237531h.getCounty().getId(), null);
                    this.f237528e = 1;
                    obj = bVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                d0 d0Var = this.f237529f;
                final zt3.a.OnCountySelected onCountySelected = this.f237531h;
                k10.c0<zt3.f.Form> c0Var = this.f237530g;
                if (iVar instanceof dx.i.Left) {
                    d0Var.d9(new zt3.a.OnError((dx.b) ((dx.i.Left) iVar).b(), onCountySelected, new er.a() { // from class: zt3.o0
                        @Override // er.a
                        public final Object a() {
                            return d0.q.a.X();
                        }
                    }));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.b(new er.l() { // from class: zt3.p0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.q.a.Y(onCountySelected, list, (f.Form) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f237529f, this.f237530g, this.f237531h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends zt3.f>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zt3.a.OnCountySelected onCountySelected = (zt3.a.OnCountySelected) this.f237525f;
            k10.c0 c0Var = (k10.c0) this.f237526g;
            Object objE = uq.b.e();
            int i15 = this.f237524e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (fr.t.c(onCountySelected.getCounty(), d0.this.R9(((zt3.f.Form) c0Var.a()).getAddressState().getCounty()))) {
                    return c0Var.c();
                }
                ac4.a aVar = d0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(d0.this, c0Var, onCountySelected, null);
                this.f237525f = vq.j.a(onCountySelected);
                this.f237526g = vq.j.a(c0Var);
                this.f237524e = 1;
                obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return (k10.l) obj;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.OnCountySelected onCountySelected, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            q qVar = d0.this.new q(eVar);
            qVar.f237525f = onCountySelected;
            qVar.f237526g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$h;", "action", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<zt3.a.OnCommunitySelected, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237534g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lzt3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends zt3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f237536e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d0 f237537f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<zt3.f.Form> f237538g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ zt3.a.OnCommunitySelected f237539h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, k10.c0<zt3.f.Form> c0Var, zt3.a.OnCommunitySelected onCommunitySelected, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f237537f = d0Var;
                this.f237538g = c0Var;
                this.f237539h = onCommunitySelected;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 X() {
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final zt3.f.Form Y(zt3.a.OnCommunitySelected onCommunitySelected, List list, zt3.f.Form form) {
                return zt3.f.Form.c(form, null, AddressState.b(form.getAddressState(), null, null, DropDown.b(form.getAddressState().getCommunity(), hz.b.d.f86848c, null, new zt3.d.Enabled(onCommunitySelected.getCommunity()), null, 10, null), new DropDown(form.getAddressState().getCity().getValidationState(), list, new zt3.d.Enabled(null, 1, null), form.getAddressState().getCity().getFieldType()), null, new DropDown(form.getAddressState().getStreet().getValidationState(), null, null, form.getAddressState().getStreet().getFieldType(), 6, null), null, null, Primes.SMALL_FACTOR_LIMIT, null), null, m1.COMMUNITY, 5, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f237536e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ch0.a aVar = this.f237537f.getCitiesUseCase;
                    ch0.a.Params params = new ch0.a.Params(this.f237537f.R9(this.f237538g.a().getAddressState().getProvince()).getId(), this.f237537f.R9(this.f237538g.a().getAddressState().getCounty()).getId(), this.f237539h.getCommunity().getId(), null);
                    this.f237536e = 1;
                    obj = aVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                d0 d0Var = this.f237537f;
                final zt3.a.OnCommunitySelected onCommunitySelected = this.f237539h;
                k10.c0<zt3.f.Form> c0Var = this.f237538g;
                if (iVar instanceof dx.i.Left) {
                    d0Var.d9(new zt3.a.OnError((dx.b) ((dx.i.Left) iVar).b(), onCommunitySelected, new er.a() { // from class: zt3.q0
                        @Override // er.a
                        public final Object a() {
                            return d0.r.a.X();
                        }
                    }));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.b(new er.l() { // from class: zt3.r0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.r.a.Y(onCommunitySelected, list, (f.Form) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f237537f, this.f237538g, this.f237539h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends zt3.f>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zt3.a.OnCommunitySelected onCommunitySelected = (zt3.a.OnCommunitySelected) this.f237533f;
            k10.c0 c0Var = (k10.c0) this.f237534g;
            Object objE = uq.b.e();
            int i15 = this.f237532e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (fr.t.c(onCommunitySelected.getCommunity(), d0.this.R9(((zt3.f.Form) c0Var.a()).getAddressState().getCommunity()))) {
                    return c0Var.c();
                }
                ac4.a aVar = d0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(d0.this, c0Var, onCommunitySelected, null);
                this.f237533f = vq.j.a(onCommunitySelected);
                this.f237534g = vq.j.a(c0Var);
                this.f237532e = 1;
                obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return (k10.l) obj;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.OnCommunitySelected onCommunitySelected, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            r rVar = d0.this.new r(eVar);
            rVar.f237533f = onCommunitySelected;
            rVar.f237534g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$g;", "action", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<zt3.a.OnCitySelected, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237542g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lzt3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends zt3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f237544e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d0 f237545f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ zt3.a.OnCitySelected f237546g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<zt3.f.Form> f237547h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, zt3.a.OnCitySelected onCitySelected, k10.c0<zt3.f.Form> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f237545f = d0Var;
                this.f237546g = onCitySelected;
                this.f237547h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 X() {
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final zt3.f.Form Y(zt3.a.OnCitySelected onCitySelected, List list, zt3.f.Form form) {
                zt3.d enabled;
                AddressState addressState = form.getAddressState();
                DropDown dropDownB = DropDown.b(form.getAddressState().getCity(), hz.b.d.f86848c, null, new zt3.d.Enabled(onCitySelected.getCity()), null, 10, null);
                int size = list.size();
                if (size != 0) {
                    enabled = size != 1 ? new zt3.d.Enabled(null, 1, null) : new zt3.d.Enabled((BETerytDetail) pq.v.l0(list));
                } else {
                    enabled = zt3.d.C6410d.f237440a;
                }
                return zt3.f.Form.c(form, null, AddressState.b(addressState, null, null, null, dropDownB, null, new DropDown(form.getAddressState().getStreet().getValidationState(), list, enabled, form.getAddressState().getStreet().getFieldType()), null, null, 215, null), null, m1.CITY, 5, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f237544e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ch0.f fVar = this.f237545f.getStreetsUseCase;
                    ch0.f.Params params = new ch0.f.Params(this.f237546g.getCity().getId(), null);
                    this.f237544e = 1;
                    obj = fVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                d0 d0Var = this.f237545f;
                final zt3.a.OnCitySelected onCitySelected = this.f237546g;
                k10.c0<zt3.f.Form> c0Var = this.f237547h;
                if (iVar instanceof dx.i.Left) {
                    d0Var.d9(new zt3.a.OnError((dx.b) ((dx.i.Left) iVar).b(), onCitySelected, new er.a() { // from class: zt3.t0
                        @Override // er.a
                        public final Object a() {
                            return d0.s.a.X();
                        }
                    }));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.b(new er.l() { // from class: zt3.u0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.s.a.Y(onCitySelected, list, (f.Form) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f237545f, this.f237546g, this.f237547h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends zt3.f>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zt3.f.Form O(zt3.a.OnCitySelected onCitySelected, zt3.f.Form form) {
            return zt3.f.Form.c(form, null, AddressState.b(form.getAddressState(), null, null, null, DropDown.b(form.getAddressState().getCity(), hz.b.d.f86848c, null, new zt3.d.Enabled(onCitySelected.getCity()), null, 10, null), null, null, null, null, 247, null), null, m1.CITY, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zt3.a.OnCitySelected onCitySelected = (zt3.a.OnCitySelected) this.f237541f;
            k10.c0 c0Var = (k10.c0) this.f237542g;
            Object objE = uq.b.e();
            int i15 = this.f237540e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            if (fr.t.c(onCitySelected.getCity(), d0.this.R9(((zt3.f.Form) c0Var.a()).getAddressState().getCity()))) {
                return c0Var.c();
            }
            if (!((zt3.f.Form) c0Var.a()).getMode().e()) {
                return c0Var.b(new er.l() { // from class: zt3.s0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.s.O(onCitySelected, (f.Form) obj2);
                    }
                });
            }
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, onCitySelected, c0Var, null);
            this.f237541f = vq.j.a(onCitySelected);
            this.f237542g = vq.j.a(c0Var);
            this.f237540e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.OnCitySelected onCitySelected, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            s sVar = d0.this.new s(eVar);
            sVar.f237541f = onCitySelected;
            sVar.f237542g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$n;", "action", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<zt3.a.OnStreetSelected, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237549f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237550g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zt3.f.Form O(zt3.a.OnStreetSelected onStreetSelected, zt3.f.Form form) {
            return zt3.f.Form.c(form, null, AddressState.b(form.getAddressState(), null, null, null, null, null, DropDown.b(form.getAddressState().getStreet(), hz.b.d.f86848c, null, new zt3.d.Enabled(onStreetSelected.getStreet()), null, 10, null), null, null, 223, null), null, m1.STREET, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zt3.a.OnStreetSelected onStreetSelected = (zt3.a.OnStreetSelected) this.f237549f;
            k10.c0 c0Var = (k10.c0) this.f237550g;
            uq.b.e();
            if (this.f237548e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return fr.t.c(onStreetSelected.getStreet(), d0.this.R9(((zt3.f.Form) c0Var.a()).getAddressState().getStreet())) ? c0Var.c() : c0Var.b(new er.l() { // from class: zt3.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.t.O(onStreetSelected, (f.Form) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.OnStreetSelected onStreetSelected, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            t tVar = d0.this.new t(eVar);
            tVar.f237549f = onStreetSelected;
            tVar.f237550g = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzt3/a$f;", "action", "Lk10/c0;", "Lzt3/f$a;", "state", "Lk10/l;", "Lzt3/f;", "<anonymous>", "(Lzt3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<zt3.a.OnChangeStreetFieldVisibility, k10.c0<zt3.f.Form>, tq.e<? super k10.l<? extends zt3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237553f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237554g;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zt3.f.Form O(zt3.a.OnChangeStreetFieldVisibility onChangeStreetFieldVisibility, zt3.f.Form form) {
            zt3.d enabled;
            AddressState addressState = form.getAddressState();
            DropDown street = addressState.getStreet();
            boolean show = onChangeStreetFieldVisibility.getShow();
            if (show) {
                enabled = new zt3.d.Enabled(null, 1, null);
            } else {
                if (show) {
                    throw new oq.p();
                }
                enabled = zt3.d.c.f237439a;
            }
            return zt3.f.Form.c(form, null, AddressState.b(addressState, null, null, null, null, null, DropDown.b(street, hz.b.d.f86848c, null, enabled, null, 10, null), null, null, 223, null), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zt3.a.OnChangeStreetFieldVisibility onChangeStreetFieldVisibility = (zt3.a.OnChangeStreetFieldVisibility) this.f237553f;
            k10.c0 c0Var = (k10.c0) this.f237554g;
            uq.b.e();
            if (this.f237552e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zt3.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.u.O(onChangeStreetFieldVisibility, (f.Form) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.OnChangeStreetFieldVisibility onChangeStreetFieldVisibility, k10.c0<zt3.f.Form> c0Var, tq.e<? super k10.l<? extends zt3.f>> eVar) {
            u uVar = new u(eVar);
            uVar.f237553f = onChangeStreetFieldVisibility;
            uVar.f237554g = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzt3/a$c;", "action", "Lzt3/f$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzt3/a$c;Lzt3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<zt3.a.GoToSearch, zt3.f.Form, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f237555e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f237556f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zt3.a.GoToSearch goToSearch = (zt3.a.GoToSearch) this.f237556f;
            Object objE = uq.b.e();
            int i15 = this.f237555e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<st3.g.b> bVarD = d0.this.getAdapter().d();
                st3.g.b.GoToSearch goToSearch2 = new st3.g.b.GoToSearch(goToSearch.getModel());
                this.f237556f = vq.j.a(goToSearch);
                this.f237555e = 1;
                if (bVarD.F(goToSearch2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zt3.a.GoToSearch goToSearch, zt3.f.Form form, tq.e<? super oq.i0> eVar) {
            v vVar = d0.this.new v(eVar);
            vVar.f237556f = goToSearch;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class w extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f237558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f237559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f237560f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f237561g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f237562h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f237563j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f237564k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f237566m;

        w(tq.e<? super w> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f237564k = obj;
            this.f237566m |= PKIFailureInfo.systemUnavail;
            return d0.this.oa(null, false, this);
        }
    }

    public d0(yy.a aVar, au3.m mVar, ac4.a aVar2, xt3.d dVar, ch0.d dVar2, ch0.c cVar, ch0.b bVar, ch0.a aVar3, ch0.f fVar, ib4.c cVar2, dz.c cVar3, bu3.b bVar2, st3.g gVar) {
        this.mapper = mVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.restoreTerytDetailsUseCase = dVar;
        this.getProvincesUseCase = dVar2;
        this.getCountiesUseCase = cVar;
        this.getCommunitiesUseCase = bVar;
        this.getCitiesUseCase = aVar3;
        this.getStreetsUseCase = fVar;
        this.genericDomainErrorMapper = cVar2;
        this.postCodeFormatter = cVar3;
        this.adapter = gVar;
        zt3.f.Setup setup = new zt3.f.Setup(bVar2.a(gVar.getSetupData().getMode()));
        this.initialState = setup;
        this.stateMachine = aVar.a(setup, new er.l() { // from class: zt3.t
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ga(this.f237656a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), S9(setup));
        i00.a.a(this, new a(null));
    }

    private final AddressData P9(zt3.f.Form stateSnapshot) {
        AddressTerytDetail addressTerytDetailA;
        AddressTerytDetail addressTerytDetailA2;
        AddressTerytDetail addressTerytDetailA3;
        AddressTerytDetail addressTerytDetailA4;
        BETerytDetail bETerytDetailR9 = R9(stateSnapshot.getAddressState().getProvince());
        if (bETerytDetailR9 == null || (addressTerytDetailA = wt3.a.a(bETerytDetailR9)) == null) {
            addressTerytDetailA = a1.a();
        }
        BETerytDetail bETerytDetailR10 = R9(stateSnapshot.getAddressState().getCounty());
        if (bETerytDetailR10 == null || (addressTerytDetailA2 = wt3.a.a(bETerytDetailR10)) == null) {
            addressTerytDetailA2 = a1.a();
        }
        BETerytDetail bETerytDetailR11 = R9(stateSnapshot.getAddressState().getCommunity());
        if (bETerytDetailR11 == null || (addressTerytDetailA3 = wt3.a.a(bETerytDetailR11)) == null) {
            addressTerytDetailA3 = a1.a();
        }
        BETerytDetail bETerytDetailR12 = R9(stateSnapshot.getAddressState().getCity());
        if (bETerytDetailR12 == null || (addressTerytDetailA4 = wt3.a.a(bETerytDetailR12)) == null) {
            addressTerytDetailA4 = a1.a();
        }
        String value = stateSnapshot.getAddressState().getPostalCode().getValue();
        BETerytDetail bETerytDetailR13 = R9(stateSnapshot.getAddressState().getStreet());
        return new AddressData(addressTerytDetailA, addressTerytDetailA2, addressTerytDetailA3, addressTerytDetailA4, value, bETerytDetailR13 != null ? wt3.a.a(bETerytDetailR13) : null, stateSnapshot.getAddressState().getBuildingNumber().getValue(), stateSnapshot.getAddressState().getApartmentNumber().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BETerytDetail R9(DropDown dropDown) {
        zt3.d state = dropDown.getState();
        zt3.d.Enabled enabled = state instanceof zt3.d.Enabled ? (zt3.d.Enabled) state : null;
        if (enabled != null) {
            return enabled.getSelected();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zt3.g.Data S9(zt3.f state) {
        return this.mapper.b(new au3.m.Params(state, new er.l() { // from class: zt3.w
            @Override // er.l
            public final Object b(Object obj) {
                return d0.T9(this.f237662a, (BETerytDetail) obj);
            }
        }, new er.l() { // from class: zt3.x
            @Override // er.l
            public final Object b(Object obj) {
                return d0.U9(this.f237664a, (BETerytDetail) obj);
            }
        }, new er.l() { // from class: zt3.y
            @Override // er.l
            public final Object b(Object obj) {
                return d0.V9(this.f237665a, (BETerytDetail) obj);
            }
        }, new er.l() { // from class: zt3.z
            @Override // er.l
            public final Object b(Object obj) {
                return d0.W9(this.f237667a, (BETerytDetail) obj);
            }
        }, new er.l() { // from class: zt3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.X9(this.f237419a, (AddressSearchData) obj);
            }
        }, new er.l() { // from class: zt3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.Y9(this.f237429a, (String) obj);
            }
        }, new er.l() { // from class: zt3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.Z9(this.f237436a, (BETerytDetail) obj);
            }
        }, new er.l() { // from class: zt3.l
            @Override // er.l
            public final Object b(Object obj) {
                return d0.aa(this.f237625a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: zt3.m
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ba(this.f237632a, (String) obj);
            }
        }, new er.l() { // from class: zt3.n
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ca(this.f237643a, (String) obj);
            }
        }, b9(zt3.a.m.f237412a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(d0 d0Var, BETerytDetail bETerytDetail) {
        d0Var.d9(new zt3.a.OnProvinceSelected(bETerytDetail));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(d0 d0Var, BETerytDetail bETerytDetail) {
        d0Var.d9(new zt3.a.OnCountySelected(bETerytDetail));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(d0 d0Var, BETerytDetail bETerytDetail) {
        d0Var.d9(new zt3.a.OnCommunitySelected(bETerytDetail));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(d0 d0Var, BETerytDetail bETerytDetail) {
        d0Var.d9(new zt3.a.OnCitySelected(bETerytDetail));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(d0 d0Var, AddressSearchData addressSearchData) {
        d0Var.d9(new zt3.a.GoToSearch(addressSearchData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(d0 d0Var, String str) {
        d0Var.d9(new zt3.a.OnPostalCodeChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(d0 d0Var, BETerytDetail bETerytDetail) {
        d0Var.d9(new zt3.a.OnStreetSelected(bETerytDetail));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(d0 d0Var, boolean z15) {
        d0Var.d9(new zt3.a.OnChangeStreetFieldVisibility(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(d0 d0Var, String str) {
        d0Var.d9(new zt3.a.OnBuildingNumberChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(d0 d0Var, String str) {
        d0Var.d9(new zt3.a.OnApartmentNumberChanged(str));
        return oq.i0.f148189a;
    }

    private final zt3.f.Form da(zt3.f.Form form) {
        return zt3.f.Form.c(form, null, AddressState.b(form.getAddressState(), null, null, null, null, Regular.b(form.getAddressState().getPostalCode(), null, dz.e.e(form.getAddressState().getPostalCode().getValue()), 1, null), null, Regular.b(form.getAddressState().getBuildingNumber(), null, dz.e.e(form.getAddressState().getBuildingNumber().getValue()), 1, null), Regular.b(form.getAddressState().getApartmentNumber(), null, dz.e.e(form.getAddressState().getApartmentNumber().getValue()), 1, null), 47, null), null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<zt3.f.Form> ea(k10.c0<zt3.f.Form> state) {
        final m1 m1Var;
        zt3.f.Form formA = state.a();
        if (formA.getAddressState().getProvince().getValidationState() instanceof hz.b.Invalid) {
            m1Var = m1.PROVINCE;
        } else if (formA.getAddressState().getCounty().getValidationState() instanceof hz.b.Invalid) {
            m1Var = m1.COUNTY;
        } else if (formA.getAddressState().getCommunity().getValidationState() instanceof hz.b.Invalid) {
            m1Var = m1.COMMUNITY;
        } else if (formA.getAddressState().getCity().getValidationState() instanceof hz.b.Invalid) {
            m1Var = m1.CITY;
        } else if (formA.getAddressState().getPostalCode().getValidationState() instanceof hz.b.Invalid) {
            m1Var = m1.POSTAL_CODE;
        } else if (formA.getAddressState().getStreet().getValidationState() instanceof hz.b.Invalid) {
            m1Var = m1.STREET;
        } else if (formA.getAddressState().getBuildingNumber().getValidationState() instanceof hz.b.Invalid) {
            m1Var = m1.BUILDING_NUMBER;
        } else {
            m1Var = formA.getAddressState().getApartmentNumber().getValidationState() instanceof hz.b.Invalid ? m1.APARTMENT_NUMBER : null;
        }
        return state.b(new er.l() { // from class: zt3.s
            @Override // er.l
            public final Object b(Object obj) {
                return d0.fa(m1Var, (f.Form) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zt3.f.Form fa(m1 m1Var, zt3.f.Form form) {
        return zt3.f.Form.c(form, null, null, m1Var, null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(final d0 d0Var, k10.v vVar) {
        vVar.c(fr.q0.c(zt3.f.Setup.class), new er.l() { // from class: zt3.k
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ha(this.f237621a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(zt3.f.class), new er.l() { // from class: zt3.u
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ia(this.f237657a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(zt3.f.Form.class), new er.l() { // from class: zt3.v
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ja(this.f237660a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(d0 d0Var, k10.z zVar) {
        zVar.C(d0Var.new c(null));
        d dVar = d0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(zt3.a.FetchInitialData.class), oVar, dVar);
        zVar.v(fr.q0.c(zt3.a.RestoreForm.class), oVar, d0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(d0 d0Var, k10.z zVar) {
        f fVar = d0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(zt3.a.b.class), oVar, fVar);
        zVar.x(fr.q0.c(zt3.a.OnError.class), oVar, d0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(final d0 d0Var, k10.z zVar) {
        zVar.N(new er.l() { // from class: zt3.o
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ka((f.Form) obj);
            }
        }, new er.l() { // from class: zt3.p
            @Override // er.l
            public final Object b(Object obj) {
                return d0.la(this.f237646a, (k10.x) obj);
            }
        });
        p pVar = d0Var.new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(zt3.a.OnProvinceSelected.class), oVar, pVar);
        zVar.v(fr.q0.c(zt3.a.OnCountySelected.class), oVar, d0Var.new q(null));
        zVar.v(fr.q0.c(zt3.a.OnCommunitySelected.class), oVar, d0Var.new r(null));
        zVar.v(fr.q0.c(zt3.a.OnCitySelected.class), oVar, d0Var.new s(null));
        zVar.v(fr.q0.c(zt3.a.OnStreetSelected.class), oVar, d0Var.new t(null));
        zVar.v(fr.q0.c(zt3.a.OnChangeStreetFieldVisibility.class), oVar, new u(null));
        zVar.x(fr.q0.c(zt3.a.GoToSearch.class), oVar, d0Var.new v(null));
        zVar.v(fr.q0.c(zt3.a.OnPostalCodeChanged.class), oVar, new h(null));
        zVar.v(fr.q0.c(zt3.a.OnBuildingNumberChanged.class), oVar, new i(null));
        zVar.v(fr.q0.c(zt3.a.OnApartmentNumberChanged.class), oVar, new j(null));
        zVar.v(fr.q0.c(zt3.a.ValidateState.class), oVar, d0Var.new k(null));
        zVar.v(fr.q0.c(zt3.a.q.class), oVar, d0Var.new l(null));
        zVar.v(fr.q0.c(zt3.a.o.class), oVar, new m(null));
        zVar.v(fr.q0.c(zt3.a.m.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ka(zt3.f.Form form) {
        return form.getAddressState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 la(d0 d0Var, k10.x xVar) {
        xVar.C(d0Var.new o(null));
        return oq.i0.f148189a;
    }

    private final Object ma(zt3.f.Form form, tq.e<? super Map<m1, ? extends hz.g>> eVar) {
        Object objA = form.getMode().a(form.getAddressState(), eVar);
        return objA == uq.b.e() ? objA : (Map) objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object na(zt3.f.Form form, tq.e<? super oq.i0> eVar) {
        Object objF = this.adapter.getState().F(new st3.g.c.Content(P9(form)), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x0133  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object oa(k10.c0<zt3.f.Form> c0Var, boolean z15, tq.e<? super k10.l<zt3.f.Form>> eVar) throws Throwable {
        w wVar;
        zt3.f.Form formDa;
        int i15;
        Object objMa;
        d0 d0Var;
        xw.b<st3.g.b> bVarD;
        st3.g.b.Validated validated;
        k10.c0<zt3.f.Form> c0Var2;
        final zt3.f.Form form;
        k10.c0<zt3.f.Form> c0Var3;
        final zt3.f.Form form2;
        final Map map;
        if (eVar instanceof w) {
            wVar = (w) eVar;
            int i16 = wVar.f237566m;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                wVar.f237566m = i16 - PKIFailureInfo.systemUnavail;
            } else {
                wVar = new w(eVar);
            }
        } else {
            wVar = new w(eVar);
        }
        Object obj = wVar.f237564k;
        Object objE = uq.b.e();
        int i17 = wVar.f237566m;
        if (i17 == 0) {
            oq.u.b(obj);
            formDa = z15 ? da(c0Var.a()) : c0Var.a();
            wVar.f237558d = c0Var;
            wVar.f237559e = this;
            wVar.f237560f = formDa;
            wVar.f237562h = z15;
            i15 = 0;
            wVar.f237563j = 0;
            wVar.f237566m = 1;
            objMa = ma(formDa, wVar);
            if (objMa != objE) {
                d0Var = this;
            }
            return objE;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                form = (zt3.f.Form) wVar.f237560f;
                c0Var2 = (k10.c0) wVar.f237558d;
                oq.u.b(obj);
                return c0Var2.b(new er.l() { // from class: zt3.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.pa(form, (f.Form) obj2);
                    }
                });
            }
            if (i17 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) wVar.f237561g;
            form2 = (zt3.f.Form) wVar.f237560f;
            c0Var3 = (k10.c0) wVar.f237558d;
            oq.u.b(obj);
            return c0Var3.b(new er.l() { // from class: zt3.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.qa(form2, map, (f.Form) obj2);
                }
            });
        }
        int i18 = wVar.f237563j;
        z15 = wVar.f237562h;
        zt3.f.Form form3 = (zt3.f.Form) wVar.f237560f;
        d0 d0Var2 = (d0) wVar.f237559e;
        k10.c0<zt3.f.Form> c0Var4 = (k10.c0) wVar.f237558d;
        oq.u.b(obj);
        i15 = i18;
        c0Var = c0Var4;
        d0Var = d0Var2;
        objMa = obj;
        formDa = form3;
        Map map2 = (Map) objMa;
        if (map2.isEmpty()) {
            bVarD = d0Var.adapter.d();
            validated = new st3.g.b.Validated(new st3.k.ValidWithResult(d0Var.P9(formDa)));
            wVar.f237558d = c0Var;
            wVar.f237559e = vq.j.a(d0Var);
            wVar.f237560f = formDa;
            wVar.f237561g = vq.j.a(map2);
            wVar.f237562h = z15;
            wVar.f237563j = i15;
            wVar.f237566m = 2;
            if (bVarD.F(validated, wVar) != objE) {
                c0Var2 = c0Var;
                form = formDa;
                return c0Var2.b(new er.l() { // from class: zt3.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.pa(form, (f.Form) obj2);
                    }
                });
            }
        } else {
            Iterator it = map2.entrySet().iterator();
            while (it.hasNext()) {
                if (!(((Map.Entry) it.next()).getValue() instanceof hz.g.b)) {
                    xw.b<st3.g.b> bVarD2 = d0Var.adapter.d();
                    st3.g.b.Validated validated2 = new st3.g.b.Validated(new st3.k.NotValid(d0Var.P9(formDa)));
                    wVar.f237558d = c0Var;
                    wVar.f237559e = vq.j.a(d0Var);
                    wVar.f237560f = formDa;
                    wVar.f237561g = map2;
                    wVar.f237562h = z15;
                    wVar.f237563j = i15;
                    wVar.f237566m = 3;
                    if (bVarD2.F(validated2, wVar) != objE) {
                        c0Var3 = c0Var;
                        form2 = formDa;
                        map = map2;
                        return c0Var3.b(new er.l() { // from class: zt3.r
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return d0.qa(form2, map, (f.Form) obj2);
                            }
                        });
                    }
                }
            }
            bVarD = d0Var.adapter.d();
            validated = new st3.g.b.Validated(new st3.k.ValidWithResult(d0Var.P9(formDa)));
            wVar.f237558d = c0Var;
            wVar.f237559e = vq.j.a(d0Var);
            wVar.f237560f = formDa;
            wVar.f237561g = vq.j.a(map2);
            wVar.f237562h = z15;
            wVar.f237563j = i15;
            wVar.f237566m = 2;
            if (bVarD.F(validated, wVar) != objE) {
                c0Var2 = c0Var;
                form = formDa;
                return c0Var2.b(new er.l() { // from class: zt3.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.pa(form, (f.Form) obj2);
                    }
                });
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zt3.f.Form pa(zt3.f.Form form, zt3.f.Form form2) {
        return form;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zt3.f.Form qa(zt3.f.Form form, Map map, zt3.f.Form form2) {
        return zt3.f.Form.c(form2, null, form2.getAddressState().a(DropDown.b(form2.getAddressState().getProvince(), ra(map, m1.PROVINCE), null, null, null, 14, null), DropDown.b(form2.getAddressState().getCounty(), ra(map, m1.COUNTY), null, null, null, 14, null), DropDown.b(form2.getAddressState().getCommunity(), ra(map, m1.COMMUNITY), null, null, null, 14, null), DropDown.b(form2.getAddressState().getCity(), ra(map, m1.CITY), null, null, null, 14, null), form2.getAddressState().getPostalCode().a(ra(map, m1.POSTAL_CODE), form.getAddressState().getPostalCode().getValue()), DropDown.b(form2.getAddressState().getStreet(), ra(map, m1.STREET), null, null, null, 14, null), form2.getAddressState().getBuildingNumber().a(ra(map, m1.BUILDING_NUMBER), form.getAddressState().getBuildingNumber().getValue()), form2.getAddressState().getApartmentNumber().a(ra(map, m1.APARTMENT_NUMBER), form.getAddressState().getApartmentNumber().getValue())), null, null, 13, null);
    }

    private static final hz.b ra(Map<m1, ? extends hz.g> map, m1 m1Var) {
        if (!map.containsKey(m1Var)) {
            return hz.b.d.f86848c;
        }
        return hz.b.INSTANCE.a((hz.g) pq.v0.j(map, m1Var));
    }

    /* JADX INFO: renamed from: Q9, reason: from getter */
    public final st3.g getAdapter() {
        return this.adapter;
    }

    @Override // l00.g
    protected k10.t<zt3.f, zt3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<zt3.g.Data> getState() {
        return this.state;
    }
}
