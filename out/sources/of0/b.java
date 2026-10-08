package of0;

import cf0.WorkerInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import mu.g;
import mu.h;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker;
import pq.v;
import tq.e;
import ub.o0;
import ub.p0;
import ub.z;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lof0/b;", "Lof0/a;", "Lub/p0;", "workManager", "<init>", "(Lub/p0;)V", "Lub/o0$c;", "Lcf0/g;", "e", "(Lub/o0$c;)Lcf0/g;", "", "taskId", "Loq/i0;", "c", "(Ljava/lang/String;)V", "Lmu/g;", "", "Lcf0/h;", "b", "()Lmu/g;", "a", "Lub/p0;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 workManager;

    /* JADX INFO: renamed from: of0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3600b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145142a;

        static {
            int[] iArr = new int[o0.c.values().length];
            try {
                iArr[o0.c.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0.c.SUCCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o0.c.ENQUEUED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o0.c.BLOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o0.c.RUNNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o0.c.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f145142a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements g<List<? extends WorkerInfo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f145143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f145144b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f145145a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f145146b;

            /* JADX INFO: renamed from: of0.b$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3601a extends d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145147d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145148e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145149f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145151h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145152j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145153k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145154l;

                public C3601a(e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145147d = obj;
                    this.f145148e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(h hVar, b bVar) {
                this.f145145a = hVar;
                this.f145146b = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, e eVar) throws Throwable {
                C3601a c3601a;
                if (eVar instanceof C3601a) {
                    c3601a = (C3601a) eVar;
                    int i15 = c3601a.f145148e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3601a.f145148e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3601a = new C3601a(eVar);
                    }
                } else {
                    c3601a = new C3601a(eVar);
                }
                Object obj2 = c3601a.f145147d;
                Object objE = uq.b.e();
                int i16 = c3601a.f145148e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f145145a;
                    List<o0> list = (List) obj;
                    ArrayList arrayList = new ArrayList(v.y(list, 10));
                    for (o0 o0Var : list) {
                        arrayList.add(new WorkerInfo(o0Var.getId(), this.f145146b.e(o0Var.getState()), o0Var.d()));
                    }
                    c3601a.f145149f = j.a(obj);
                    c3601a.f145151h = j.a(c3601a);
                    c3601a.f145152j = j.a(obj);
                    c3601a.f145153k = j.a(hVar);
                    c3601a.f145154l = 0;
                    c3601a.f145148e = 1;
                    if (hVar.F(arrayList, c3601a) == objE) {
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

        public c(g gVar, b bVar) {
            this.f145143a = gVar;
            this.f145144b = bVar;
        }

        @Override // mu.g
        public Object a(h<? super List<? extends WorkerInfo>> hVar, e eVar) {
            Object objA = this.f145143a.a(new a(hVar, this.f145144b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public b(p0 p0Var) {
        this.workManager = p0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cf0.g e(o0.c cVar) {
        switch (C3600b.f145142a[cVar.ordinal()]) {
            case 1:
                return cf0.g.FAILED;
            case 2:
                return cf0.g.SUCCEEDED;
            case 3:
                return cf0.g.ENQUEUED;
            case 4:
                return cf0.g.BLOCKED;
            case 5:
                return cf0.g.RUNNING;
            case 6:
                return cf0.g.CANCELLED;
            default:
                throw new p();
        }
    }

    @Override // of0.a
    public void a(String taskId) {
        this.workManager.a(UUID.fromString(taskId));
    }

    @Override // of0.a
    public g<List<WorkerInfo>> b() {
        return new c(this.workManager.i("AsyncToolWorkerTag"), this);
    }

    @Override // of0.a
    public void c(String taskId) {
        this.workManager.f(taskId, ub.j.REPLACE, new z.a(AsyncDownloadWorker.class).j(UUID.fromString(taskId)).a("AsyncToolWorkerTag").b());
    }
}
