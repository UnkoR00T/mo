package b44;

import dx.i;
import er.p;
import fr0.DocumentConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lr.m;
import mu.g;
import mu.h;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lb44/f;", "Lr34/f;", "Lz34/a;", "repository", "<init>", "(Lz34/a;)V", "Lgz/b$a$a;", "params", "Lmu/g;", "", "Lrq0/b;", "Lfr0/g;", "b", "(Lgz/b$a$a;)Lmu/g;", "a", "Lz34/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements r34.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z34.a repository;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements g<Map<rq0.b, ? extends DocumentConfig>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f16549a;

        /* JADX INFO: renamed from: b44.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0394a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f16550a;

            /* JADX INFO: renamed from: b44.f$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0395a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f16551d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f16552e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f16553f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f16555h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f16556j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f16557k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f16558l;

                public C0395a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f16551d = obj;
                    this.f16552e |= PKIFailureInfo.systemUnavail;
                    return C0394a.this.F(null, this);
                }
            }

            public C0394a(h hVar) {
                this.f16550a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0395a c0395a;
                if (eVar instanceof C0395a) {
                    c0395a = (C0395a) eVar;
                    int i15 = c0395a.f16552e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0395a.f16552e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0395a = new C0395a(eVar);
                    }
                } else {
                    c0395a = new C0395a(eVar);
                }
                Object obj2 = c0395a.f16551d;
                Object objE = uq.b.e();
                int i16 = c0395a.f16552e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f16550a;
                    List list = (List) obj;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(list, 10)), 16));
                    for (T t15 : list) {
                        linkedHashMap.put(((DocumentConfig) t15).getType(), t15);
                    }
                    c0395a.f16553f = j.a(obj);
                    c0395a.f16555h = j.a(c0395a);
                    c0395a.f16556j = j.a(obj);
                    c0395a.f16557k = j.a(hVar);
                    c0395a.f16558l = 0;
                    c0395a.f16552e = 1;
                    if (hVar.F(linkedHashMap, c0395a) == objE) {
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

        public a(g gVar) {
            this.f16549a = gVar;
        }

        @Override // mu.g
        public Object a(h<? super Map<rq0.b, ? extends DocumentConfig>> hVar, tq.e eVar) {
            Object objA = this.f16549a.a(new C0394a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmu/h;", "", "Lfr0/g;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<h<? super List<? extends DocumentConfig>>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16559e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f16559e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            v.n();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h<? super List<DocumentConfig>> hVar, tq.e<? super i0> eVar) {
            return ((b) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(eVar);
        }
    }

    public f(z34.a aVar) {
        this.repository = aVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g<Map<rq0.b, DocumentConfig>> a(gz.b.a.C1792a params) {
        Object objB;
        i<dx.b, g<List<DocumentConfig>>> iVarA = this.repository.a();
        if (iVarA instanceof i.Left) {
            objB = mu.i.I(new b(null));
        } else {
            if (!(iVarA instanceof i.Right)) {
                throw new oq.p();
            }
            objB = ((i.Right) iVarA).b();
        }
        return new a((g) objB);
    }
}
