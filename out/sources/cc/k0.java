package cc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcc/j0;", "Lju/l0;", "dispatcher", "", "tag", "Lmu/g;", "", "Lub/o0;", "b", "(Lcc/j0;Lju/l0;Ljava/lang/String;)Lmu/g;", "Lcc/i0$c;", "a", "(Lmu/g;Lju/l0;)Lmu/g;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k0 {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements mu.g<List<? extends ub.o0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f25084a;

        /* JADX INFO: renamed from: cc.k0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0670a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f25085a;

            /* JADX INFO: renamed from: cc.k0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0671a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f25086d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f25087e;

                public C0671a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f25086d = obj;
                    this.f25087e |= PKIFailureInfo.systemUnavail;
                    return C0670a.this.F(null, this);
                }
            }

            public C0670a(mu.h hVar) {
                this.f25085a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0671a c0671a;
                if (eVar instanceof C0671a) {
                    c0671a = (C0671a) eVar;
                    int i15 = c0671a.f25087e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0671a.f25087e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0671a = new C0671a(eVar);
                    }
                } else {
                    c0671a = new C0671a(eVar);
                }
                Object obj2 = c0671a.f25086d;
                Object objE = uq.b.e();
                int i16 = c0671a.f25087e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f25085a;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((i0.WorkInfoPojo) it.next()).e());
                    }
                    c0671a.f25087e = 1;
                    if (hVar.F(arrayList, c0671a) == objE) {
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

        public a(mu.g gVar) {
            this.f25084a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends ub.o0>> hVar, tq.e eVar) {
            Object objA = this.f25084a.a(new C0670a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    public static final mu.g<List<ub.o0>> a(mu.g<? extends List<i0.WorkInfoPojo>> gVar, ju.l0 l0Var) {
        return mu.i.M(mu.i.p(new a(gVar)), l0Var);
    }

    public static final mu.g<List<ub.o0>> b(j0 j0Var, ju.l0 l0Var, String str) {
        return a(j0Var.n(str), l0Var);
    }
}
