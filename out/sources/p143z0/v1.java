package p143z0;

import er.l;
import er.p;
import eu.h;
import eu.j;
import ju.d2;
import ju.g2;
import ju.p0;
import ju.q0;
import lu.g;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p076m2.n2;
import tq.e;
import vq.i;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Llu/g;", "a", "(Llu/g;Ltq/e;)Ljava/lang/Object;", "E", "Lkotlin/Function0;", "builderAction", "Leu/h;", "b", "(Ler/a;)Leu/h;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class a<T> extends k implements p<p0, e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231760f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g<T> f231761g;

        /* JADX INFO: renamed from: z0.v1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C6223a extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f231762e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f231763f;

            C6223a(e<? super C6223a> eVar) {
                super(2, eVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 O(long j15) {
                return i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                p0 p0Var;
                Object objE = uq.b.e();
                int i15 = this.f231762e;
                if (i15 == 0) {
                    u.b(obj);
                    p0Var = (p0) this.f231763f;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p0Var = (p0) this.f231763f;
                    u.b(obj);
                }
                while (g2.n(p0Var.getCoroutineContext())) {
                    l lVar = new l() { // from class: z0.u1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v1.a.C6223a.O(((Long) obj2).longValue());
                        }
                    };
                    this.f231763f = p0Var;
                    this.f231762e = 1;
                    if (n2.c(lVar, this) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((C6223a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                C6223a c6223a = new C6223a(eVar);
                c6223a.f231763f = obj;
                return c6223a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g<T> gVar, e<? super a> eVar) {
            super(2, eVar);
            this.f231761g = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [ju.d2] */
        /* JADX WARN: Type inference failed for: r1v3, types: [ju.d2] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            ?? r15 = this.f231759e;
            try {
                if (r15 == 0) {
                    u.b(obj);
                    d2 d2VarD = ju.k.d((p0) this.f231760f, null, null, new C6223a(null), 3, null);
                    g<T> gVar = this.f231761g;
                    this.f231760f = d2VarD;
                    this.f231759e = 1;
                    obj = gVar.a(this);
                    r15 = d2VarD;
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d2 d2Var = (d2) this.f231760f;
                    u.b(obj);
                    r15 = d2Var;
                }
                d2.a.a(r15, null, 1, null);
                return obj;
            } catch (Throwable th4) {
                d2.a.a(r15, null, 1, null);
                throw th4;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super T> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            a aVar = new a(this.f231761g, eVar);
            aVar.f231760f = obj;
            return aVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Leu/j;", "Loq/i0;", "<anonymous>", "(Leu/j;)V"}, k = 3, mv = {2, 1, 0})
    static final class b<E> extends i implements p<j<? super E>, e<? super i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f231764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f231765d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f231766e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.a<E> f231767f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.a<? extends E> aVar, e<? super b> eVar) {
            super(2, eVar);
            this.f231767f = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002d  */
        /* JADX WARN: Code duplicated, block: B:13:0x0039 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x003a  */
        /* JADX WARN: Code duplicated, block: B:16:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:15:0x003b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:15:0x003b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x003d
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f231765d
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r4.f231764c
                java.lang.Object r3 = r4.f231766e
                eu.j r3 = (eu.j) r3
                oq.u.b(r5)
                goto L3b
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1d:
                oq.u.b(r5)
                java.lang.Object r5 = r4.f231766e
                eu.j r5 = (eu.j) r5
                r3 = r5
            L25:
                er.a<E> r5 = r4.f231767f
                java.lang.Object r1 = r5.a()
                if (r1 == 0) goto L3a
                r4.f231766e = r3
                r4.f231764c = r1
                r4.f231765d = r2
                java.lang.Object r5 = r3.a(r1, r4)
                if (r5 != r0) goto L3b
                return r0
            L3a:
                r1 = 0
            L3b:
                if (r1 != 0) goto L25
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.v1.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(j<? super E> jVar, e<? super i0> eVar) {
            return ((b) v(jVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = new b(this.f231767f, eVar);
            bVar.f231766e = obj;
            return bVar;
        }
    }

    public static final <T> Object a(g<T> gVar, e<? super T> eVar) {
        return q0.e(new a(gVar, null), eVar);
    }

    public static final <E> h<E> b(er.a<? extends E> aVar) {
        return eu.k.b(new b(aVar, null));
    }
}
