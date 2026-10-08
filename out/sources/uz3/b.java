package uz3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lz3.WorkerInfo;
import mu.g;
import mu.h;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker;
import pq.v;
import tq.e;
import ub.o0;
import ub.p0;
import ub.z;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Luz3/b;", "Luz3/a;", "Lub/p0;", "workManager", "<init>", "(Lub/p0;)V", "Lub/o0$c;", "Llz3/j;", "e", "(Lub/o0$c;)Llz3/j;", "", "taskId", "Loq/i0;", "c", "(Ljava/lang/String;)V", "Lmu/g;", "", "Llz3/l;", "b", "()Lmu/g;", "a", "Lub/p0;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 workManager;

    /* JADX INFO: renamed from: uz3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5269b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202469a;

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
            f202469a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements g<List<? extends WorkerInfo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f202470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f202471b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f202472a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f202473b;

            /* JADX INFO: renamed from: uz3.b$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5270a extends d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f202474d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f202475e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f202476f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f202478h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f202479j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f202480k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f202481l;

                public C5270a(e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f202474d = obj;
                    this.f202475e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(h hVar, b bVar) {
                this.f202472a = hVar;
                this.f202473b = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, e eVar) throws Throwable {
                C5270a c5270a;
                if (eVar instanceof C5270a) {
                    c5270a = (C5270a) eVar;
                    int i15 = c5270a.f202475e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5270a.f202475e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5270a = new C5270a(eVar);
                    }
                } else {
                    c5270a = new C5270a(eVar);
                }
                Object obj2 = c5270a.f202474d;
                Object objE = uq.b.e();
                int i16 = c5270a.f202475e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f202472a;
                    List<o0> list = (List) obj;
                    ArrayList arrayList = new ArrayList(v.y(list, 10));
                    for (o0 o0Var : list) {
                        arrayList.add(new WorkerInfo(o0Var.getId(), this.f202473b.e(o0Var.getState()), o0Var.d()));
                    }
                    c5270a.f202476f = j.a(obj);
                    c5270a.f202478h = j.a(c5270a);
                    c5270a.f202479j = j.a(obj);
                    c5270a.f202480k = j.a(hVar);
                    c5270a.f202481l = 0;
                    c5270a.f202475e = 1;
                    if (hVar.F(arrayList, c5270a) == objE) {
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
            this.f202470a = gVar;
            this.f202471b = bVar;
        }

        @Override // mu.g
        public Object a(h<? super List<? extends WorkerInfo>> hVar, e eVar) {
            Object objA = this.f202470a.a(new a(hVar, this.f202471b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public b(p0 p0Var) {
        this.workManager = p0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lz3.j e(o0.c cVar) {
        switch (C5269b.f202469a[cVar.ordinal()]) {
            case 1:
                return lz3.j.FAILED;
            case 2:
                return lz3.j.SUCCEEDED;
            case 3:
                return lz3.j.ENQUEUED;
            case 4:
                return lz3.j.BLOCKED;
            case 5:
                return lz3.j.RUNNING;
            case 6:
                return lz3.j.CANCELLED;
            default:
                throw new p();
        }
    }

    @Override // uz3.a
    public void a(String taskId) {
        this.workManager.a(UUID.fromString(taskId));
    }

    @Override // uz3.a
    public g<List<WorkerInfo>> b() {
        return new c(this.workManager.i("AsyncDownloadWorker"), this);
    }

    @Override // uz3.a
    public void c(String taskId) {
        this.workManager.f(taskId, ub.j.REPLACE, new z.a(AsyncDownloadDocumentsWorker.class).j(UUID.fromString(taskId)).a("AsyncDownloadWorker").b());
    }
}
