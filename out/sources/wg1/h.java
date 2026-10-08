package wg1;

import er.p;
import er.q;
import java.util.Set;
import ju.g1;
import ju.p0;
import ju.q0;
import mu.b0;
import mu.i;
import mu.r0;
import oq.i0;
import oq.k;
import oq.l;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lwg1/h;", "Lbh1/e;", "Lcz/c;", "persistentStorageFactory", "<init>", "(Lcz/c;)V", "Lmu/g;", "", "Lah1/g;", "a", "()Lmu/g;", "", "enabled", "Loq/i0;", "b", "(ZLtq/e;)Ljava/lang/Object;", "c", "Lju/p0;", "Lju/p0;", "repositoryScope", "Lmu/b0;", "Lmu/b0;", "airQualityWidgetStateFlow", "ePaymentsWidgetStateFlow", "Lcz/b;", "d", "Loq/k;", "j", "()Lcz/b;", "persistentStorage", "e", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements bh1.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f213266f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f213267g = cz.b.a.b("SHARED_PREFERENCES_SERVICES_WIDGET_AIR_QUALITY");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f213268h = cz.b.a.b("SHARED_PREFERENCES_SERVICES_WIDGET_EPAYMENTS");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 repositoryScope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0<Boolean> airQualityWidgetStateFlow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0<Boolean> ePaymentsWidgetStateFlow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k persistentStorage;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f213273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f213274f;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b0 b0Var;
            b0 b0Var2;
            Object objE = uq.b.e();
            int i15 = this.f213274f;
            if (i15 != 0) {
                if (i15 == 1) {
                    b0Var = (b0) this.f213273e;
                    u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b0Var2 = (b0) this.f213273e;
                    u.b(obj);
                }
                b0Var2.setValue(obj);
                return i0.f148189a;
            }
            u.b(obj);
            b0Var = h.this.airQualityWidgetStateFlow;
            cz.b bVarJ = h.this.j();
            String str = h.f213267g;
            this.f213273e = b0Var;
            this.f213274f = 1;
            obj = bVarJ.h(str, false, this);
            if (obj != objE) {
            }
            return objE;
            b0Var.setValue(obj);
            b0 b0Var3 = h.this.ePaymentsWidgetStateFlow;
            cz.b bVarJ2 = h.this.j();
            String str2 = h.f213268h;
            this.f213273e = b0Var3;
            this.f213274f = 2;
            Object objH = bVarJ2.h(str2, false, this);
            if (objH != objE) {
                b0Var2 = b0Var3;
                obj = objH;
                b0Var2.setValue(obj);
                return i0.f148189a;
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return h.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "airQualityWidgetEnabled", "ePaymentsWidgetEnabled", "", "Lah1/g;", "<anonymous>", "(ZZ)Ljava/util/Set;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<Boolean, Boolean, tq.e<? super Set<? extends ah1.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f213277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ boolean f213278g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            boolean z15 = this.f213277f;
            boolean z16 = this.f213278g;
            uq.b.e();
            if (this.f213276e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            Set setB = e1.b();
            if (z15) {
                setB.add(ah1.g.AIR_QUALITY);
            }
            if (z16) {
                setB.add(ah1.g.EPAYMENTS);
            }
            return e1.a(setB);
        }

        public final Object M(boolean z15, boolean z16, tq.e<? super Set<? extends ah1.g>> eVar) {
            c cVar = new c(eVar);
            cVar.f213277f = z15;
            cVar.f213278g = z16;
            return cVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, Boolean bool2, tq.e<? super Set<? extends ah1.g>> eVar) {
            return M(bool.booleanValue(), bool2.booleanValue(), eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f213279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f213280e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f213282g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213280e = obj;
            this.f213282g |= PKIFailureInfo.systemUnavail;
            return h.this.b(false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f213283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f213284e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f213286g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213284e = obj;
            this.f213286g |= PKIFailureInfo.systemUnavail;
            return h.this.c(false, this);
        }
    }

    public h(final cz.c cVar) {
        p0 p0VarA = q0.a(g1.b());
        this.repositoryScope = p0VarA;
        Boolean bool = Boolean.FALSE;
        this.airQualityWidgetStateFlow = r0.a(bool);
        this.ePaymentsWidgetStateFlow = r0.a(bool);
        ju.k.d(p0VarA, null, null, new a(null), 3, null);
        this.persistentStorage = l.a(new er.a() { // from class: wg1.g
            @Override // er.a
            public final Object a() {
                return h.k(cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cz.b j() {
        return (cz.b) this.persistentStorage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b k(cz.c cVar) {
        return cVar.a("shared_prefs_services_widgets", cz.d.PLAIN);
    }

    @Override // bh1.e
    public mu.g<Set<ah1.g>> a() {
        return i.k(this.airQualityWidgetStateFlow, this.ePaymentsWidgetStateFlow, new c(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bh1.e
    public Object b(boolean z15, tq.e<? super i0> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f213282g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f213282g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f213280e;
        Object objE = uq.b.e();
        int i16 = dVar.f213282g;
        if (i16 == 0) {
            u.b(obj);
            cz.b bVarJ = j();
            String str = f213267g;
            dVar.f213279d = z15;
            dVar.f213282g = 1;
            if (bVarJ.c(str, z15, dVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z15 = dVar.f213279d;
            u.b(obj);
        }
        this.airQualityWidgetStateFlow.setValue(vq.b.a(z15));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bh1.e
    public Object c(boolean z15, tq.e<? super i0> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f213286g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f213286g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f213284e;
        Object objE = uq.b.e();
        int i16 = eVar2.f213286g;
        if (i16 == 0) {
            u.b(obj);
            cz.b bVarJ = j();
            String str = f213268h;
            eVar2.f213283d = z15;
            eVar2.f213286g = 1;
            if (bVarJ.c(str, z15, eVar2) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z15 = eVar2.f213283d;
            u.b(obj);
        }
        this.ePaymentsWidgetStateFlow.setValue(vq.b.a(z15));
        return i0.f148189a;
    }
}
