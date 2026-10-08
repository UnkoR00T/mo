package kc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import qc.SourceFetchResult;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001'BÃ\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u00124\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u0002\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*RA\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R9\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*RD\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010(R(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R=\u00103\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010*R!\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b0\u0010*¨\u00065"}, d2 = {"Lkc/h;", "", "", "Lrc/d;", "interceptors", "Loq/r;", "Ltc/c;", "Lmr/c;", "mappers", "Lsc/c;", "keyers", "Lkotlin/Function0;", "Lqc/j$a;", "lazyFetcherFactories", "Loc/i$a;", "lazyDecoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "data", "Lzc/n;", "options", "j", "(Ljava/lang/Object;Lzc/n;)Ljava/lang/Object;", "Lkc/s;", "imageLoader", "", "startIndex", "Lqc/j;", "m", "(Ljava/lang/Object;Lzc/n;Lkc/s;I)Loq/r;", "Lqc/o;", "result", "Loc/i;", "l", "(Lqc/o;Lzc/n;Lkc/s;I)Loq/r;", "Lkc/h$a;", "k", "()Lkc/h$a;", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "i", "c", "h", "d", "e", "f", "Loq/k;", "fetcherFactories", "decoderFactories", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<rc.d> interceptors;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<oq.r<tc.c<? extends Object, ? extends Object>, mr.c<? extends Object>>> mappers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<oq.r<sc.c<? extends Object>, mr.c<? extends Object>>> keyers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<? extends er.a<? extends List<? extends oq.r<? extends qc.j.a<? extends Object>, ? extends mr.c<? extends Object>>>>> lazyFetcherFactories;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<? extends er.a<? extends List<? extends oc.i.a>>> lazyDecoderFactories;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oq.k fetcherFactories;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oq.k decoderFactories;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u00020\u0000\"\b\b\u0000\u0010\n*\u00020\u00012\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\u0000\"\b\b\u0000\u0010\n*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0017\u001a\u00020\u0000\"\b\b\u0000\u0010\n*\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001c\u001a\u00020\u00002.\u0010\u0016\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0015\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r0\u001b0\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u00002\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001a0\u0019¢\u0006\u0004\b!\u0010\u001dJ\r\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R@\u0010,\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r0\u001b0$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R<\u0010/\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0011\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r0\u001b0$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(RH\u00102\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0015\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r0\u001b0\u001a0\u00190$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(R,\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001a0\u00190$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(¨\u00066"}, d2 = {"Lkc/h$a;", "", "Lkc/h;", "registry", "<init>", "(Lkc/h;)V", "Lrc/d;", "interceptor", "i", "(Lrc/d;)Lkc/h$a;", "T", "Ltc/c;", "mapper", "Lmr/c;", "type", "k", "(Ltc/c;Lmr/c;)Lkc/h$a;", "Lsc/c;", "keyer", "j", "(Lsc/c;Lmr/c;)Lkc/h$a;", "Lqc/j$a;", "factory", "h", "(Lqc/j$a;Lmr/c;)Lkc/h$a;", "Lkotlin/Function0;", "", "Loq/r;", "o", "(Ler/a;)Lkc/h$a;", "Loc/i$a;", "g", "(Loc/i$a;)Lkc/h$a;", "n", "p", "()Lkc/h;", "", "a", "Ljava/util/List;", "getInterceptors$coil_core", "()Ljava/util/List;", "interceptors", "b", "getMappers$coil_core", "mappers", "c", "getKeyers$coil_core", "keyers", "d", "r", "lazyFetcherFactories", "e", "q", "lazyDecoderFactories", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<rc.d> interceptors;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<oq.r<tc.c<? extends Object, ?>, mr.c<? extends Object>>> mappers;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<oq.r<sc.c<? extends Object>, mr.c<? extends Object>>> keyers;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<er.a<List<oq.r<qc.j.a<? extends Object>, mr.c<? extends Object>>>>> lazyFetcherFactories;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<er.a<List<oc.i.a>>> lazyDecoderFactories;

        public a(h hVar) {
            this.interceptors = pq.v.i1(hVar.g());
            this.mappers = pq.v.i1(hVar.i());
            this.keyers = pq.v.i1(hVar.h());
            List<oq.r<qc.j.a<? extends Object>, mr.c<? extends Object>>> listF = hVar.f();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                final oq.r rVar = (oq.r) it.next();
                arrayList.add(new er.a() { // from class: kc.d
                    @Override // er.a
                    public final Object a() {
                        return h.a.e(rVar);
                    }
                });
            }
            this.lazyFetcherFactories = arrayList;
            List<oc.i.a> listE = hVar.e();
            ArrayList arrayList2 = new ArrayList();
            for (final oc.i.a aVar : listE) {
                arrayList2.add(new er.a() { // from class: kc.e
                    @Override // er.a
                    public final Object a() {
                        return h.a.f(aVar);
                    }
                });
            }
            this.lazyDecoderFactories = arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List e(oq.r rVar) {
            return pq.v.e(rVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List f(oc.i.a aVar) {
            return pq.v.e(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List l(qc.j.a aVar, mr.c cVar) {
            return pq.v.e(oq.y.a(aVar, cVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List m(oc.i.a aVar) {
            return pq.v.e(aVar);
        }

        public final a g(final oc.i.a factory) {
            this.lazyDecoderFactories.add(new er.a() { // from class: kc.g
                @Override // er.a
                public final Object a() {
                    return h.a.m(factory);
                }
            });
            return this;
        }

        public final <T> a h(final qc.j.a<T> factory, final mr.c<T> type) {
            this.lazyFetcherFactories.add(new er.a() { // from class: kc.f
                @Override // er.a
                public final Object a() {
                    return h.a.l(factory, type);
                }
            });
            return this;
        }

        public final a i(rc.d interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        public final <T> a j(sc.c<T> keyer, mr.c<T> type) {
            this.keyers.add(oq.y.a(keyer, type));
            return this;
        }

        public final <T> a k(tc.c<T, ?> mapper, mr.c<T> type) {
            this.mappers.add(oq.y.a(mapper, type));
            return this;
        }

        public final a n(er.a<? extends List<? extends oc.i.a>> factory) {
            this.lazyDecoderFactories.add(factory);
            return this;
        }

        public final a o(er.a<? extends List<? extends oq.r<? extends qc.j.a<? extends Object>, ? extends mr.c<? extends Object>>>> factory) {
            this.lazyFetcherFactories.add(factory);
            return this;
        }

        public final h p() {
            return new h(ed.c.c(this.interceptors), ed.c.c(this.mappers), ed.c.c(this.keyers), ed.c.c(this.lazyFetcherFactories), ed.c.c(this.lazyDecoderFactories), null);
        }

        public final List<er.a<List<oc.i.a>>> q() {
            return this.lazyDecoderFactories;
        }

        public final List<er.a<List<oq.r<qc.j.a<? extends Object>, mr.c<? extends Object>>>>> r() {
            return this.lazyFetcherFactories;
        }
    }

    public /* synthetic */ h(List list, List list2, List list3, List list4, List list5, fr.k kVar) {
        this(list, list2, list3, list4, list5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(h hVar) {
        List<? extends er.a<? extends List<? extends oc.i.a>>> list = hVar.lazyDecoderFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            pq.v.D(arrayList, list.get(i15).a());
        }
        hVar.lazyDecoderFactories = pq.v.n();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(h hVar) {
        List<? extends er.a<? extends List<? extends oq.r<? extends qc.j.a<? extends Object>, ? extends mr.c<? extends Object>>>>> list = hVar.lazyFetcherFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            pq.v.D(arrayList, list.get(i15).a());
        }
        hVar.lazyFetcherFactories = pq.v.n();
        return arrayList;
    }

    public final List<oc.i.a> e() {
        return (List) this.decoderFactories.getValue();
    }

    public final List<oq.r<qc.j.a<? extends Object>, mr.c<? extends Object>>> f() {
        return (List) this.fetcherFactories.getValue();
    }

    public final List<rc.d> g() {
        return this.interceptors;
    }

    public final List<oq.r<sc.c<? extends Object>, mr.c<? extends Object>>> h() {
        return this.keyers;
    }

    public final List<oq.r<tc.c<? extends Object, ? extends Object>, mr.c<? extends Object>>> i() {
        return this.mappers;
    }

    public final Object j(Object data, Options options) {
        Object objA;
        List<oq.r<tc.c<? extends Object, ? extends Object>, mr.c<? extends Object>>> list = this.mappers;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            oq.r<tc.c<? extends Object, ? extends Object>, mr.c<? extends Object>> rVar = list.get(i15);
            tc.c<? extends Object, ? extends Object> cVarA = rVar.a();
            if (rVar.b().A(data) && (objA = cVarA.a(data, options)) != null) {
                data = objA;
            }
        }
        return data;
    }

    public final a k() {
        return new a(this);
    }

    public final oq.r<oc.i, Integer> l(SourceFetchResult result, Options options, s imageLoader, int startIndex) {
        int size = e().size();
        while (startIndex < size) {
            oc.i iVarA = e().get(startIndex).a(result, options, imageLoader);
            if (iVarA != null) {
                return oq.y.a(iVarA, Integer.valueOf(startIndex));
            }
            startIndex++;
        }
        return null;
    }

    public final oq.r<qc.j, Integer> m(Object data, Options options, s imageLoader, int startIndex) {
        qc.j jVarA;
        int size = f().size();
        while (startIndex < size) {
            oq.r<qc.j.a<? extends Object>, mr.c<? extends Object>> rVar = f().get(startIndex);
            qc.j.a<? extends Object> aVarA = rVar.a();
            if (rVar.b().A(data) && (jVarA = aVarA.a(data, options, imageLoader)) != null) {
                return oq.y.a(jVarA, Integer.valueOf(startIndex));
            }
            startIndex++;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(List<? extends rc.d> list, List<? extends oq.r<? extends tc.c<? extends Object, ? extends Object>, ? extends mr.c<? extends Object>>> list2, List<? extends oq.r<? extends sc.c<? extends Object>, ? extends mr.c<? extends Object>>> list3, List<? extends er.a<? extends List<? extends oq.r<? extends qc.j.a<? extends Object>, ? extends mr.c<? extends Object>>>>> list4, List<? extends er.a<? extends List<? extends oc.i.a>>> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.lazyFetcherFactories = list4;
        this.lazyDecoderFactories = list5;
        this.fetcherFactories = oq.l.a(new er.a() { // from class: kc.b
            @Override // er.a
            public final Object a() {
                return h.d(this.f109794a);
            }
        });
        this.decoderFactories = oq.l.a(new er.a() { // from class: kc.c
            @Override // er.a
            public final Object a() {
                return h.c(this.f109795a);
            }
        });
    }

    public h() {
        this(pq.v.n(), pq.v.n(), pq.v.n(), pq.v.n(), pq.v.n());
    }
}
