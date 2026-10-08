package gc4;

import ac4.r;
import er.q;
import fr.t;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lgc4/o;", "Lac4/r;", "", "Lrx/a;", "cameraManager", "<init>", "(Lrx/a;)V", "Lsx/b$a;", "params", "Lmu/g;", "Ldx/i;", "Ldx/b;", "c", "(Lsx/b$a;)Lmu/g;", "a", "Lrx/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements r<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rx.a cameraManager;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<sx.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f71884a;

        /* JADX INFO: renamed from: gc4.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1645a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f71885a;

            /* JADX INFO: renamed from: gc4.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1646a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f71886d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f71887e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f71888f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f71889g;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f71891j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f71892k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f71893l;

                public C1646a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f71886d = obj;
                    this.f71887e |= PKIFailureInfo.systemUnavail;
                    return C1645a.this.F(null, this);
                }
            }

            public C1645a(mu.h hVar) {
                this.f71885a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1646a c1646a;
                if (eVar instanceof C1646a) {
                    c1646a = (C1646a) eVar;
                    int i15 = c1646a.f71887e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1646a.f71887e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1646a = new C1646a(eVar);
                    }
                } else {
                    c1646a = new C1646a(eVar);
                }
                Object obj2 = c1646a.f71886d;
                Object objE = uq.b.e();
                int i16 = c1646a.f71887e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f71885a;
                    if (t.c((sx.c) obj, sx.c.a.f185167a)) {
                        c1646a.f71888f = vq.j.a(obj);
                        c1646a.f71889g = vq.j.a(c1646a);
                        c1646a.f71891j = vq.j.a(obj);
                        c1646a.f71892k = vq.j.a(hVar);
                        c1646a.f71893l = 0;
                        c1646a.f71887e = 1;
                        if (hVar.F(obj, c1646a) == objE) {
                            return objE;
                        }
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

        public a(mu.g gVar) {
            this.f71884a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super sx.c> hVar, tq.e eVar) {
            Object objA = this.f71884a.a(new C1645a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lmu/h;", "it", "Loq/i0;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    public static final class b extends vq.k implements q<mu.h<? super dx.i<? extends dx.b, ? extends String>>, sx.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f71895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f71896g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o f71897h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tq.e eVar, o oVar) {
            super(3, eVar);
            this.f71897h = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f71894e;
            if (i15 == 0) {
                u.b(obj);
                mu.h hVar = (mu.h) this.f71895f;
                Object obj2 = this.f71896g;
                mu.g gVarC = this.f71897h.cameraManager.c();
                this.f71895f = vq.j.a(hVar);
                this.f71896g = vq.j.a(obj2);
                this.f71894e = 1;
                if (mu.i.u(hVar, gVarC, this) == objE) {
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
        public final Object w(mu.h<? super dx.i<? extends dx.b, ? extends String>> hVar, sx.c cVar, tq.e<? super i0> eVar) {
            b bVar = new b(eVar, this.f71897h);
            bVar.f71895f = hVar;
            bVar.f71896g = cVar;
            return bVar.J(i0.f148189a);
        }
    }

    public o(rx.a aVar) {
        this.cameraManager = aVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public mu.g<dx.i<dx.b, String>> a(sx.b.Analyzer params) {
        return mu.i.d0(new a(this.cameraManager.d(params)), new b(null, this));
    }
}
