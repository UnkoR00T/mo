package ja;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0005R(\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lja/k;", "", "T", "initialValue", "<init>", "(Ljava/lang/Object;)V", "data", "Loq/i0;", "b", "Lmu/b0;", "Loq/r;", "", "a", "Lmu/b0;", "state", "Lmu/g;", "Lmu/g;", "()Lmu/g;", "flow", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<oq.r<Integer, T>> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mu.g<T> flow;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements mu.g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f101001a;

        /* JADX INFO: renamed from: ja.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C2385a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f101002a;

            /* JADX INFO: renamed from: ja.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C2386a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f101003d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f101004e;

                public C2386a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f101003d = obj;
                    this.f101004e |= PKIFailureInfo.systemUnavail;
                    return C2385a.this.F(null, this);
                }
            }

            public C2385a(mu.h hVar) {
                this.f101002a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2386a c2386a;
                if (eVar instanceof C2386a) {
                    c2386a = (C2386a) eVar;
                    int i15 = c2386a.f101004e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2386a.f101004e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2386a = new C2386a(eVar);
                    }
                } else {
                    c2386a = new C2386a(eVar);
                }
                Object obj2 = c2386a.f101003d;
                Object objE = uq.b.e();
                int i16 = c2386a.f101004e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f101002a;
                    Object objD = ((oq.r) obj).d();
                    if (objD != null) {
                        c2386a.f101004e = 1;
                        if (hVar.F(objD, c2386a) == objE) {
                            return objE;
                        }
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

        public a(mu.g gVar) {
            this.f101001a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h hVar, tq.e eVar) {
            Object objA = this.f101001a.a(new C2385a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    public k(T t15) {
        mu.b0<oq.r<Integer, T>> b0VarA = mu.r0.a(new oq.r(Integer.valueOf(PKIFailureInfo.systemUnavail), t15));
        this.state = b0VarA;
        this.flow = new a(b0VarA);
    }

    public final mu.g<T> a() {
        return this.flow;
    }

    public final void b(T data) {
        mu.b0<oq.r<Integer, T>> b0Var = this.state;
        b0Var.setValue(new oq.r<>(Integer.valueOf(b0Var.getValue().c().intValue() + 1), data));
    }

    public /* synthetic */ k(Object obj, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : obj);
    }
}
