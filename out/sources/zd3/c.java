package zd3;

import dx.i;
import ju.g1;
import ju.q0;
import mu.g;
import mu.h;
import mu.l0;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import vq.k;
import vy.Coordinates;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lzd3/c;", "Lzd3/b;", "Luy/d;", "gpsManager", "<init>", "(Luy/d;)V", "Lmu/g;", "Lvy/c;", "m", "()Lmu/g;", "a", "Luy/d;", "b", "Lvy/c;", "lastResult", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements zd3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uy.d gpsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Coordinates lastResult = t04.b.f186822a.b();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements g<Coordinates> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f234393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f234394b;

        /* JADX INFO: renamed from: zd3.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6314a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f234395a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f234396b;

            /* JADX INFO: renamed from: zd3.c$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6315a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f234397d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f234398e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f234399f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f234401h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f234402j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f234403k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f234404l;

                public C6315a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f234397d = obj;
                    this.f234398e |= PKIFailureInfo.systemUnavail;
                    return C6314a.this.F(null, this);
                }
            }

            public C6314a(h hVar, c cVar) {
                this.f234395a = hVar;
                this.f234396b = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6315a c6315a;
                Object objB;
                if (eVar instanceof C6315a) {
                    c6315a = (C6315a) eVar;
                    int i15 = c6315a.f234398e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6315a.f234398e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6315a = new C6315a(eVar);
                    }
                } else {
                    c6315a = new C6315a(eVar);
                }
                Object obj2 = c6315a.f234397d;
                Object objE = uq.b.e();
                int i16 = c6315a.f234398e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f234395a;
                    i iVar = (i) obj;
                    c cVar = this.f234396b;
                    if (iVar instanceof i.Left) {
                        objB = this.f234396b.lastResult;
                    } else {
                        if (!(iVar instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) iVar).b();
                    }
                    cVar.lastResult = (Coordinates) objB;
                    Coordinates coordinates = this.f234396b.lastResult;
                    c6315a.f234399f = j.a(obj);
                    c6315a.f234401h = j.a(c6315a);
                    c6315a.f234402j = j.a(obj);
                    c6315a.f234403k = j.a(hVar);
                    c6315a.f234404l = 0;
                    c6315a.f234398e = 1;
                    if (hVar.F(coordinates, c6315a) == objE) {
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

        public a(g gVar, c cVar) {
            this.f234393a = gVar;
            this.f234394b = cVar;
        }

        @Override // mu.g
        public Object a(h<? super Coordinates> hVar, tq.e eVar) {
            Object objA = this.f234393a.a(new C6314a(hVar, this.f234394b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmu/h;", "Ldx/i;", "Ldx/b;", "Lvy/c;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements er.p<h<? super i<? extends dx.b, ? extends Coordinates>>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234405e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f234405e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            Coordinates unused = c.this.lastResult;
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h<? super i<? extends dx.b, Coordinates>> hVar, tq.e<? super i0> eVar) {
            return ((b) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new b(eVar);
        }
    }

    public c(uy.d dVar) {
        this.gpsManager = dVar;
    }

    @Override // zd3.b
    public g<Coordinates> m() {
        return mu.i.a0(new a(mu.i.U(this.gpsManager.g(), new b(null)), this), q0.a(g1.b()), l0.Companion.b(l0.INSTANCE, 0L, 0L, 3, null), 1);
    }
}
