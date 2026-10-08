package s64;

import iq0.FeatureFlag;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q64.RemoteSettingsData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ls64/d;", "Lh64/d;", "Lq64/b;", "remoteSettingsLocalRepository", "<init>", "(Lq64/b;)V", "Lgz/b$a$a;", "params", "Lmu/g;", "", "Liq0/u;", "b", "(Lgz/b$a$a;)Lmu/g;", "a", "Lq64/b;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements h64.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q64.b remoteSettingsLocalRepository;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<List<? extends FeatureFlag>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f178469a;

        /* JADX INFO: renamed from: s64.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4575a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f178470a;

            /* JADX INFO: renamed from: s64.d$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4576a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f178471d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f178472e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f178473f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f178475h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f178476j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f178477k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f178478l;

                public C4576a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f178471d = obj;
                    this.f178472e |= PKIFailureInfo.systemUnavail;
                    return C4575a.this.F(null, this);
                }
            }

            public C4575a(mu.h hVar) {
                this.f178470a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4576a c4576a;
                List<FeatureFlag> listN;
                if (eVar instanceof C4576a) {
                    c4576a = (C4576a) eVar;
                    int i15 = c4576a.f178472e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4576a.f178472e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4576a = new C4576a(eVar);
                    }
                } else {
                    c4576a = new C4576a(eVar);
                }
                Object obj2 = c4576a.f178471d;
                Object objE = uq.b.e();
                int i16 = c4576a.f178472e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f178470a;
                    RemoteSettingsData remoteSettingsData = (RemoteSettingsData) obj;
                    if (remoteSettingsData == null || (listN = remoteSettingsData.b()) == null) {
                        listN = pq.v.n();
                    }
                    c4576a.f178473f = vq.j.a(obj);
                    c4576a.f178475h = vq.j.a(c4576a);
                    c4576a.f178476j = vq.j.a(obj);
                    c4576a.f178477k = vq.j.a(hVar);
                    c4576a.f178478l = 0;
                    c4576a.f178472e = 1;
                    if (hVar.F(listN, c4576a) == objE) {
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

        public a(mu.g gVar) {
            this.f178469a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends FeatureFlag>> hVar, tq.e eVar) {
            Object objA = this.f178469a.a(new C4575a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public d(q64.b bVar) {
        this.remoteSettingsLocalRepository = bVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public mu.g<List<FeatureFlag>> a(gz.b.a.C1792a params) {
        return new a(this.remoteSettingsLocalRepository.j0());
    }
}
