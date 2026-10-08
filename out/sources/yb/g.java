package yb;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import dc.q;
import er.p;
import ju.d2;
import ju.p0;
import ju.z0;
import lu.w;
import lu.z;
import oq.i0;
import oq.u;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import ub.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lyb/g;", "Lzb/e;", "Landroid/net/ConnectivityManager;", "connManager", "", "timeoutMs", "<init>", "(Landroid/net/ConnectivityManager;J)V", "Lub/d;", CryptoServicesPermission.CONSTRAINTS, "Lmu/g;", "Lyb/b;", "a", "(Lub/d;)Lmu/g;", "Lcc/i0;", "workSpec", "", "b", "(Lcc/i0;)Z", "Landroid/net/ConnectivityManager;", "J", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements zb.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long timeoutMs;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/w;", "Lyb/b;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements p<w<? super b>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f225924f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ub.d f225925g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ g f225926h;

        /* JADX INFO: renamed from: yb.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C6052a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f225927e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ g f225928f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ w<b> f225929g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C6052a(g gVar, w<? super b> wVar, tq.e<? super C6052a> eVar) {
                super(2, eVar);
                this.f225928f = gVar;
                this.f225929g = wVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f225927e;
                if (i15 == 0) {
                    u.b(obj);
                    long j15 = this.f225928f.timeoutMs;
                    this.f225927e = 1;
                    if (z0.b(j15, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                ub.w.e().a(m.f225949a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.f225928f.timeoutMs + " ms");
                this.f225929g.d(new b.ConstraintsNotMet(7));
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C6052a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C6052a(this.f225928f, this.f225929g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ub.d dVar, g gVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f225925g = dVar;
            this.f225926h = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(d2 d2Var, w wVar, b bVar) {
            d2.a.a(d2Var, null, 1, null);
            wVar.d(bVar);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(er.a aVar) {
            aVar.a();
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f225923e;
            if (i15 == 0) {
                u.b(obj);
                final w wVar = (w) this.f225924f;
                NetworkRequest networkRequestD = this.f225925g.d();
                if (networkRequestD == null) {
                    networkRequestD = q.a(this.f225925g.getRequiredNetworkType());
                }
                if (networkRequestD == null) {
                    z.a.a(wVar.H(), null, 1, null);
                    return i0.f148189a;
                }
                final d2 d2VarD = ju.k.d(wVar, null, null, new C6052a(this.f225926h, wVar, null), 3, null);
                er.l<? super b, i0> lVar = new er.l() { // from class: yb.e
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g.a.V(d2VarD, wVar, (b) obj2);
                    }
                };
                final er.a<i0> aVarB = Build.VERSION.SDK_INT >= 30 ? k.f225937a.b(this.f225926h.connManager, networkRequestD, lVar) : d.INSTANCE.b(this.f225926h.connManager, networkRequestD, lVar);
                er.a aVar = new er.a() { // from class: yb.f
                    @Override // er.a
                    public final Object a() {
                        return g.a.X(aVarB);
                    }
                };
                this.f225923e = 1;
                if (lu.u.b(wVar, aVar, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(w<? super b> wVar, tq.e<? super i0> eVar) {
            return ((a) v(wVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f225925g, this.f225926h, eVar);
            aVar.f225924f = obj;
            return aVar;
        }
    }

    public g(ConnectivityManager connectivityManager, long j15) {
        this.connManager = connectivityManager;
        this.timeoutMs = j15;
    }

    @Override // zb.e
    public mu.g<b> a(ub.d constraints) {
        return mu.i.e(new a(constraints, this, null));
    }

    @Override // zb.e
    public boolean b(cc.i0 workSpec) {
        return (workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.d() == null && workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.getRequiredNetworkType() == x.NOT_REQUIRED) ? false : true;
    }

    public /* synthetic */ g(ConnectivityManager connectivityManager, long j15, int i15, fr.k kVar) {
        this(connectivityManager, (i15 & 2) != 0 ? 1000L : j15);
    }
}
