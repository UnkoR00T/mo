package nh1;

import ah1.DocumentsSequenceOrder;
import ch1.w0;
import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lnh1/w;", "Ll00/g;", "Lnh1/p;", "Lnh1/n;", "Lnh1/q;", "", "Lyy/a;", "stateMachineFactory", "Lnh1/d;", "mapper", "Lch1/x;", "getDocumentsOrderUseCase", "Lch1/w0;", "updateDocumentsOrderUseCase", "<init>", "(Lyy/a;Lnh1/d;Lch1/x;Lch1/w0;)V", "state", "Lnh1/q$a$a;", "p9", "(Lnh1/p;)Lnh1/q$a$a;", "b", "Lnh1/d;", "c", "Lch1/x;", "d", "Lch1/w0;", "Lnh1/p$a;", "e", "Lnh1/p$a;", "initialState", "Lxw/b;", "Lnh1/n$e;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lnh1/q$a;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<p, n> implements q, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nh1.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ch1.x getDocumentsOrderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w0 updateDocumentsOrderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p.Content initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<n.e> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<p, n> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<q.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<q.a.Screen> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f136372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f136373b;

        /* JADX INFO: renamed from: nh1.w$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3363a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f136374a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f136375b;

            /* JADX INFO: renamed from: nh1.w$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3364a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f136376d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f136377e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f136378f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f136380h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f136381j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f136382k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f136383l;

                public C3364a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f136376d = obj;
                    this.f136377e |= PKIFailureInfo.systemUnavail;
                    return C3363a.this.F(null, this);
                }
            }

            public C3363a(mu.h hVar, w wVar) {
                this.f136374a = hVar;
                this.f136375b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3364a c3364a;
                if (eVar instanceof C3364a) {
                    c3364a = (C3364a) eVar;
                    int i15 = c3364a.f136377e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3364a.f136377e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3364a = new C3364a(eVar);
                    }
                } else {
                    c3364a = new C3364a(eVar);
                }
                Object obj2 = c3364a.f136376d;
                Object objE = uq.b.e();
                int i16 = c3364a.f136377e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f136374a;
                    q.a.Screen screenP9 = this.f136375b.p9((p) obj);
                    c3364a.f136378f = vq.j.a(obj);
                    c3364a.f136380h = vq.j.a(c3364a);
                    c3364a.f136381j = vq.j.a(obj);
                    c3364a.f136382k = vq.j.a(hVar);
                    c3364a.f136383l = 0;
                    c3364a.f136377e = 1;
                    if (hVar.F(screenP9, c3364a) == objE) {
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

        public a(mu.g gVar, w wVar) {
            this.f136372a = gVar;
            this.f136373b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super q.a.Screen> hVar, tq.e eVar) {
            Object objA = this.f136372a.a(new C3363a(hVar, this.f136373b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnh1/n$a;", "<unused var>", "Lnh1/p;", "Loq/i0;", "<anonymous>", "(Lnh1/n$a;Lnh1/p;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<n.a, p, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136384e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f136384e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n.e> bVarY1 = w.this.Y1();
                n.e.a aVar = n.e.a.f136350a;
                this.f136384e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n.a aVar, p pVar, tq.e<? super i0> eVar) {
            return w.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnh1/p$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnh1/p$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136386e;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lk34/g;", "documents", "Loq/i0;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<List<? extends k34.g>, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f136388e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f136389f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ w f136390g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f136390g = wVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                List list = (List) this.f136389f;
                uq.b.e();
                if (this.f136388e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f136390g.d9(new n.LoadDocuments(list));
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(List<? extends k34.g> list, tq.e<? super i0> eVar) {
                return ((a) v(list, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f136390g, eVar);
                aVar.f136389f = obj;
                return aVar;
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f136386e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g<List<k34.g>> gVarH = w.this.getDocumentsOrderUseCase.h(gz.b.a.C1792a.f78542a);
                a aVar = new a(w.this, null);
                this.f136386e = 1;
                if (mu.i.j(gVarH, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p.Content content, tq.e<? super i0> eVar) {
            return ((c) v(content, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return w.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnh1/n$d;", "action", "Lk10/c0;", "Lnh1/p$a;", "state", "Lk10/l;", "Lnh1/p;", "<anonymous>", "(Lnh1/n$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<n.LoadDocuments, k10.c0<p.Content>, tq.e<? super k10.l<? extends p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f136393g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p.Content O(n.LoadDocuments loadDocuments, p.Content content) {
            return p.Content.b(content, loadDocuments.a(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final n.LoadDocuments loadDocuments = (n.LoadDocuments) this.f136392f;
            k10.c0 c0Var = (k10.c0) this.f136393g;
            uq.b.e();
            if (this.f136391e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nh1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.d.O(loadDocuments, (p.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n.LoadDocuments loadDocuments, k10.c0<p.Content> c0Var, tq.e<? super k10.l<? extends p>> eVar) {
            d dVar = new d(eVar);
            dVar.f136392f = loadDocuments;
            dVar.f136393g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnh1/n$b;", "action", "Lk10/c0;", "Lnh1/p$a;", "state", "Lk10/l;", "Lnh1/p;", "<anonymous>", "(Lnh1/n$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<n.DoReorder, k10.c0<p.Content>, tq.e<? super k10.l<? extends p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f136394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f136395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f136396g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f136397h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f136398j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f136399k;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p.Content O(List list, p.Content content) {
            return p.Content.b(content, list, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List list;
            n.DoReorder doReorder = (n.DoReorder) this.f136398j;
            k10.c0 c0Var = (k10.c0) this.f136399k;
            Object objE = uq.b.e();
            int i15 = this.f136397h;
            if (i15 == 0) {
                oq.u.b(obj);
                List<k34.g> listC = ((p.Content) c0Var.a()).c();
                List listA = qi1.a.a(listC, doReorder.getFromIndex(), doReorder.getToIndex());
                if (listA != null) {
                    w0 w0Var = w.this.updateDocumentsOrderUseCase;
                    List list2 = listA;
                    ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((k34.g) it.next()).getType().getReferenceName());
                    }
                    w0.Params params = new w0.Params(new DocumentsSequenceOrder(arrayList));
                    this.f136398j = vq.j.a(doReorder);
                    this.f136399k = c0Var;
                    this.f136394e = vq.j.a(listC);
                    this.f136395f = listA;
                    this.f136396g = 0;
                    this.f136397h = 1;
                    if (w0Var.c(params, this) == objE) {
                        return objE;
                    }
                    list = listA;
                }
                return c0Var.c();
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.f136395f;
            oq.u.b(obj);
            k10.l lVarB = c0Var.b(new er.l() { // from class: nh1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.e.O(list, (p.Content) obj2);
                }
            });
            if (lVarB != null) {
                return lVarB;
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n.DoReorder doReorder, k10.c0<p.Content> c0Var, tq.e<? super k10.l<? extends p>> eVar) {
            e eVar2 = w.this.new e(eVar);
            eVar2.f136398j = doReorder;
            eVar2.f136399k = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnh1/n$f;", "action", "Lk10/c0;", "Lnh1/p$a;", "state", "Lk10/l;", "Lnh1/p;", "<anonymous>", "(Lnh1/n$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<n.ShowReorderMenu, k10.c0<p.Content>, tq.e<? super k10.l<? extends p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f136403g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p.Content O(n.ShowReorderMenu showReorderMenu, p.Content content) {
            return p.Content.b(content, null, showReorderMenu.getDocumentType(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final n.ShowReorderMenu showReorderMenu = (n.ShowReorderMenu) this.f136402f;
            k10.c0 c0Var = (k10.c0) this.f136403g;
            uq.b.e();
            if (this.f136401e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nh1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.f.O(showReorderMenu, (p.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n.ShowReorderMenu showReorderMenu, k10.c0<p.Content> c0Var, tq.e<? super k10.l<? extends p>> eVar) {
            f fVar = new f(eVar);
            fVar.f136402f = showReorderMenu;
            fVar.f136403g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnh1/n$c;", "<unused var>", "Lk10/c0;", "Lnh1/p$a;", "state", "Lk10/l;", "Lnh1/p;", "<anonymous>", "(Lnh1/n$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<n.c, k10.c0<p.Content>, tq.e<? super k10.l<? extends p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f136405f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p.Content O(p.Content content) {
            return p.Content.b(content, null, null, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f136405f;
            uq.b.e();
            if (this.f136404e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nh1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.g.O((p.Content) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n.c cVar, k10.c0<p.Content> c0Var, tq.e<? super k10.l<? extends p>> eVar) {
            g gVar = new g(eVar);
            gVar.f136405f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public w(yy.a aVar, nh1.d dVar, ch1.x xVar, w0 w0Var) {
        this.mapper = dVar;
        this.getDocumentsOrderUseCase = xVar;
        this.updateDocumentsOrderUseCase = w0Var;
        p.Content content = new p.Content(pq.v.n(), null);
        this.initialState = content;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(content, new er.l() { // from class: nh1.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.t9(this.f136360a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), p9(content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q.a.Screen p9(p state) {
        return this.mapper.b(new nh1.d.Params(state, b9(n.a.f136345a), new er.p() { // from class: nh1.s
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return w.q9(this.f136361a, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, new er.l() { // from class: nh1.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.r9(this.f136362a, (rq0.b) obj);
            }
        }, b9(n.c.f136348a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(w wVar, int i15, int i16) {
        wVar.d9(new n.DoReorder(i15, i16));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(w wVar, rq0.b bVar) {
        wVar.d9(new n.ShowReorderMenu(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(p.class), new er.l() { // from class: nh1.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.u9(this.f136363a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(p.Content.class), new er.l() { // from class: nh1.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.v9(this.f136364a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(w wVar, k10.z zVar) {
        b bVar = wVar.new b(null);
        zVar.x(q0.c(n.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(w wVar, k10.z zVar) {
        zVar.C(wVar.new c(null));
        d dVar = new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(n.LoadDocuments.class), oVar, dVar);
        zVar.v(q0.c(n.DoReorder.class), oVar, wVar.new e(null));
        zVar.v(q0.c(n.ShowReorderMenu.class), oVar, new f(null));
        zVar.v(q0.c(n.c.class), oVar, new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<n.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<p, n> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<q.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(q.a aVar) {
        super.P5(aVar);
    }
}
