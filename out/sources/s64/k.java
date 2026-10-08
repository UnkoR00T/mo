package s64;

import iq0.CategoryDashboardServices;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q64.RemoteSettingsData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ls64/k;", "Lh64/k;", "Lq64/b;", "remoteSettingsLocalRepository", "<init>", "(Lq64/b;)V", "Lgz/b$a$a;", "params", "Lmu/g;", "", "Liq0/o;", "b", "(Lgz/b$a$a;)Lmu/g;", "a", "Lq64/b;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements h64.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q64.b remoteSettingsLocalRepository;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<List<? extends CategoryDashboardServices>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f178507a;

        /* JADX INFO: renamed from: s64.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4577a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f178508a;

            /* JADX INFO: renamed from: s64.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4578a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f178509d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f178510e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f178511f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f178513h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f178514j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f178515k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                Object f178516l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                int f178517m;

                public C4578a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f178509d = obj;
                    this.f178510e |= PKIFailureInfo.systemUnavail;
                    return C4577a.this.F(null, this);
                }
            }

            public C4577a(mu.h hVar) {
                this.f178508a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4578a c4578a;
                if (eVar instanceof C4578a) {
                    c4578a = (C4578a) eVar;
                    int i15 = c4578a.f178510e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4578a.f178510e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4578a = new C4578a(eVar);
                    }
                } else {
                    c4578a = new C4578a(eVar);
                }
                Object obj2 = c4578a.f178509d;
                Object objE = uq.b.e();
                int i16 = c4578a.f178510e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f178508a;
                    RemoteSettingsData remoteSettingsData = (RemoteSettingsData) obj;
                    List<CategoryDashboardServices> listE = remoteSettingsData != null ? remoteSettingsData.e() : null;
                    if (listE != null) {
                        c4578a.f178511f = vq.j.a(obj);
                        c4578a.f178513h = vq.j.a(c4578a);
                        c4578a.f178514j = vq.j.a(obj);
                        c4578a.f178515k = vq.j.a(hVar);
                        c4578a.f178516l = vq.j.a(listE);
                        c4578a.f178517m = 0;
                        c4578a.f178510e = 1;
                        if (hVar.F(listE, c4578a) == objE) {
                            return objE;
                        }
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

        public a(mu.g gVar) {
            this.f178507a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends CategoryDashboardServices>> hVar, tq.e eVar) {
            Object objA = this.f178507a.a(new C4577a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public k(q64.b bVar) {
        this.remoteSettingsLocalRepository = bVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public mu.g<List<CategoryDashboardServices>> a(gz.b.a.C1792a params) {
        return new a(this.remoteSettingsLocalRepository.j0());
    }
}
