package ru;

import er.p;
import er.q;
import fr.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.i1;
import ju.k3;
import ju.n;
import ju.r;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ou.b0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\u0010B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0091@¢\u0006\u0004\b\t\u0010\nJ2\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0015\u001a\u00020\u000f\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010\u00132\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u000f*\f0\u0017R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010$\u001a\u00020\u000f2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b'\u0010(J!\u0010+\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020-2\u0006\u0010)\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b4\u0010\nJ\u0017\u00105\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b5\u0010(J\u0010\u00106\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b6\u0010\nJ\u0017\u00107\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u0010(J!\u00108\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b8\u00109J#\u0010:\u001a\u000e\u0018\u00010\u0017R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b<\u0010\nJ!\u0010>\u001a\u00020\u000f2\u0010\u0010=\u001a\f0\u0017R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010BR(\u0010E\u001a\u0014\u0012\u000e\u0012\f0\u0017R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010FR\u0016\u0010I\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010HR\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010FR\u0014\u0010L\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040M8\u0002X\u0082\u0004¨\u0006O"}, d2 = {"Lru/j;", "R", "Lju/m;", "Lru/d;", "", "Ltq/i;", "context", "<init>", "(Ltq/i;)V", "p", "(Ltq/e;)Ljava/lang/Object;", "Lru/e;", "Lkotlin/Function1;", "Ltq/e;", "block", "Loq/i0;", "a", "(Lru/e;Ler/l;)V", "Q", "Lru/g;", "Lkotlin/Function2;", "d", "(Lru/g;Ler/p;)V", "Lru/j$a;", "", "reregister", "v", "(Lru/j$a;Z)V", "Lju/i1;", "disposableHandle", "b", "(Lju/i1;)V", "Lou/b0;", "segment", "", "index", "g", "(Lou/b0;I)V", "internalResult", "f", "(Ljava/lang/Object;)V", "clauseObject", "result", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lru/m;", "y", "(Ljava/lang/Object;Ljava/lang/Object;)Lru/m;", "", "cause", "e", "(Ljava/lang/Throwable;)V", "r", "m", "A", "x", "z", "(Ljava/lang/Object;Ljava/lang/Object;)I", "s", "(Ljava/lang/Object;)Lru/j$a;", "o", "selectedClause", "n", "(Lru/j$a;)V", "Ltq/i;", "c", "()Ltq/i;", "", "Ljava/util/List;", "clauses", "Ljava/lang/Object;", "disposableHandleOrSegment", "I", "indexInSegment", "u", "()Z", "isSelected", "Liu/e;", "state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class j<R> implements ju.m, d<R>, k, k3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f176136f = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tq.i context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object disposableHandleOrSegment;
    private volatile /* synthetic */ Object state$volatile = l.f176156b;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<j<R>.a> clauses = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int indexInSegment = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object internalResult = l.f176159e;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012(\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012(\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012H\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00028\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\"R6\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R6\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"RV\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010\"R\u0016\u0010*\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/j$a;", "", "clauseObject", "Lkotlin/Function3;", "Lru/k;", "Loq/i0;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "param", "block", "", "Ltq/i;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Lru/j;Ljava/lang/Object;Ler/q;Ler/q;Ljava/lang/Object;Ljava/lang/Object;Ler/q;)V", "Lru/j;", "select", "", "e", "(Lru/j;)Z", "result", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "c", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "b", "()V", "internalResult", "a", "(Lru/k;Ljava/lang/Object;)Ler/q;", "Ljava/lang/Object;", "Ler/q;", "f", "g", "disposableHandleOrSegment", "", "h", "I", "indexInSegment", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Object clauseObject;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q<Object, k<?>, Object, i0> regFunc;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final q<Object, Object, Object, Object> processResFunc;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Object param;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Object block;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final q<k<?>, Object, Object, q<Throwable, Object, tq.i, i0>> onCancellationConstructor;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public Object disposableHandleOrSegment;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int indexInSegment = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, q<Object, ? super k<?>, Object, i0> qVar, q<Object, Object, Object, ? extends Object> qVar2, Object obj2, Object obj3, q<? super k<?>, Object, Object, ? extends q<? super Throwable, Object, ? super tq.i, i0>> qVar3) {
            this.clauseObject = obj;
            this.regFunc = qVar;
            this.processResFunc = qVar2;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = qVar3;
        }

        public final q<Throwable, Object, tq.i, i0> a(k<?> select, Object internalResult) {
            q<k<?>, Object, Object, q<Throwable, Object, tq.i, i0>> qVar = this.onCancellationConstructor;
            if (qVar != null) {
                return qVar.w(select, this.param, internalResult);
            }
            return null;
        }

        public final void b() {
            Object obj = this.disposableHandleOrSegment;
            j<R> jVar = j.this;
            if (obj instanceof b0) {
                ((b0) obj).s(this.indexInSegment, null, jVar.getContext());
                return;
            }
            i1 i1Var = obj instanceof i1 ? (i1) obj : null;
            if (i1Var != null) {
                i1Var.j();
            }
        }

        public final Object c(Object obj, tq.e<? super R> eVar) {
            Object obj2 = this.block;
            return this.param == l.i() ? ((er.l) obj2).b(eVar) : ((p) obj2).B(obj, eVar);
        }

        public final Object d(Object result) {
            return this.processResFunc.w(this.clauseObject, this.param, result);
        }

        public final boolean e(j<R> select) {
            this.regFunc.w(this.clauseObject, select, this.param);
            return ((j) select).internalResult == l.f176159e;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f176151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f176152e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j<R> f176153f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f176154g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j<R> jVar, tq.e<? super b> eVar) {
            super(eVar);
            this.f176153f = jVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f176152e = obj;
            this.f176154g |= PKIFailureInfo.systemUnavail;
            return this.f176153f.r(this);
        }
    }

    public j(tq.i iVar) {
        this.context = iVar;
    }

    private final Object A(tq.e<? super i0> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterT = t();
        while (true) {
            Object obj = atomicReferenceFieldUpdaterT.get(this);
            if (obj == l.f176156b) {
                if (androidx.concurrent.futures.b.a(t(), this, obj, pVar)) {
                    r.c(pVar, this);
                    break;
                }
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof a) {
                        pVar.T(i0.f148189a, ((a) obj).a(this, this.internalResult));
                        break;
                    }
                    throw new IllegalStateException(("unexpected state: " + obj).toString());
                }
                if (androidx.concurrent.futures.b.a(t(), this, obj, l.f176156b)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        x(it.next());
                    }
                }
            }
        }
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX == uq.b.e() ? objX : i0.f148189a;
    }

    private final void m(Object clauseObject) {
        List<j<R>.a> list = this.clauses;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).clauseObject == clauseObject) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + clauseObject).toString());
            }
        }
    }

    private final void n(j<R>.a selectedClause) {
        List<j<R>.a> list = this.clauses;
        if (list == null) {
            return;
        }
        for (j<R>.a aVar : list) {
            if (aVar != selectedClause) {
                aVar.b();
            }
        }
        f176136f.set(this, l.f176157c);
        this.internalResult = l.f176159e;
        this.clauses = null;
    }

    private final Object o(tq.e<? super R> eVar) {
        j<R>.a aVar = (a) f176136f.get(this);
        Object obj = this.internalResult;
        n(aVar);
        return aVar.c(aVar.d(obj), eVar);
    }

    static /* synthetic */ <R> Object q(j<R> jVar, tq.e<? super R> eVar) {
        return jVar.u() ? jVar.o(eVar) : jVar.r(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(tq.e<? super R> eVar) throws Throwable {
        b bVar;
        j jVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f176154g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f176154g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(this, eVar);
            }
        } else {
            bVar = new b(this, eVar);
        }
        Object obj = bVar.f176152e;
        Object objE = uq.b.e();
        int i16 = bVar.f176154g;
        if (i16 == 0) {
            u.b(obj);
            bVar.f176151d = this;
            bVar.f176154g = 1;
            if (A(bVar) != objE) {
                jVar = this;
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return obj;
        }
        j jVar2 = (j) bVar.f176151d;
        u.b(obj);
        jVar = jVar2;
        bVar.f176151d = null;
        bVar.f176154g = 2;
        Object objO = jVar.o(bVar);
        return objO == objE ? objE : objO;
    }

    private final j<R>.a s(Object clauseObject) {
        List<j<R>.a> list = this.clauses;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((a) obj2).clauseObject == clauseObject) {
                obj = obj2;
                break;
            }
        }
        j<R>.a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater t() {
        return f176136f;
    }

    private final boolean u() {
        return f176136f.get(this) instanceof a;
    }

    public static /* synthetic */ void w(j jVar, a aVar, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        jVar.v(aVar, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(Object clauseObject) {
        j<R>.a aVarS = s(clauseObject);
        aVarS.disposableHandleOrSegment = null;
        aVarS.indexInSegment = -1;
        v(aVarS, true);
    }

    private final int z(Object clauseObject, Object internalResult) {
        while (true) {
            Object obj = f176136f.get(this);
            if (obj instanceof n) {
                j<R>.a aVarS = s(clauseObject);
                if (aVarS == null) {
                    continue;
                } else {
                    q<Throwable, Object, tq.i, i0> qVarA = aVarS.a(this, internalResult);
                    if (androidx.concurrent.futures.b.a(f176136f, this, obj, aVarS)) {
                        this.internalResult = internalResult;
                        if (l.j((n) obj, qVarA)) {
                            return 0;
                        }
                        this.internalResult = l.f176159e;
                        return 2;
                    }
                }
            } else {
                if (t.c(obj, l.f176157c) || (obj instanceof a)) {
                    return 3;
                }
                if (t.c(obj, l.f176158d)) {
                    return 2;
                }
                if (t.c(obj, l.f176156b)) {
                    if (androidx.concurrent.futures.b.a(f176136f, this, obj, v.e(clauseObject))) {
                        return 1;
                    }
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj).toString());
                    }
                    if (androidx.concurrent.futures.b.a(f176136f, this, obj, v.M0((Collection) obj, clauseObject))) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // ru.d
    public void a(e eVar, er.l<? super tq.e<? super R>, ? extends Object> lVar) {
        w(this, new a(eVar.getClauseObject(), eVar.a(), eVar.c(), l.i(), lVar, eVar.b()), false, 1, null);
    }

    @Override // ru.k
    public void b(i1 disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    @Override // ru.k
    /* JADX INFO: renamed from: c, reason: from getter */
    public tq.i getContext() {
        return this.context;
    }

    @Override // ru.d
    public <Q> void d(g<? extends Q> gVar, p<? super Q, ? super tq.e<? super R>, ? extends Object> pVar) {
        w(this, new a(gVar.getClauseObject(), gVar.a(), gVar.c(), null, pVar, gVar.b()), false, 1, null);
    }

    @Override // ju.m
    public void e(Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f176136f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == l.f176157c) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, l.f176158d));
        List<j<R>.a> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.internalResult = l.f176159e;
        this.clauses = null;
    }

    @Override // ru.k
    public void f(Object internalResult) {
        this.internalResult = internalResult;
    }

    @Override // ju.k3
    public void g(b0<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // ru.k
    public boolean h(Object clauseObject, Object result) {
        return z(clauseObject, result) == 0;
    }

    public Object p(tq.e<? super R> eVar) {
        return q(this, eVar);
    }

    public final void v(j<R>.a aVar, boolean z15) {
        if (f176136f.get(this) instanceof a) {
            return;
        }
        if (!z15) {
            m(aVar.clauseObject);
        }
        if (!aVar.e(this)) {
            f176136f.set(this, aVar);
            return;
        }
        if (!z15) {
            this.clauses.add(aVar);
        }
        aVar.disposableHandleOrSegment = this.disposableHandleOrSegment;
        aVar.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    public final m y(Object clauseObject, Object result) {
        return l.a(z(clauseObject, result));
    }
}
