package uq;

import er.p;
import fr.w0;
import oq.i0;
import oq.u;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import tq.e;
import tq.i;
import tq.j;
import vq.g;
import vq.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aW\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"R", "T", "Lkotlin/Function2;", "Ltq/e;", "", "receiver", "completion", "d", "(Ler/p;Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "a", "(Ler/p;Ljava/lang/Object;Ltq/e;)Ltq/e;", "c", "(Ltq/e;)Ltq/e;", "b", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
public class c {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"uq/c$a", "Lvq/h;", "Loq/t;", "", "result", "J", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "b", "I", AnnotatedPrivateKey.LABEL, "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int label;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f199938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f199939d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, p pVar, Object obj) {
            super(eVar);
            this.f199938c = pVar;
            this.f199939d = obj;
        }

        @Override // vq.a
        protected Object J(Object result) throws Throwable {
            int i15 = this.label;
            if (i15 == 0) {
                this.label = 1;
                u.b(result);
                return ((p) w0.g(this.f199938c, 2)).B(this.f199939d, this);
            }
            if (i15 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            u.b(result);
            return result;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"uq/c$b", "Lvq/d;", "Loq/t;", "", "result", "J", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "d", "I", AnnotatedPrivateKey.LABEL, "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int label;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p f199941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f199942f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, i iVar, p pVar, Object obj) {
            super(eVar, iVar);
            this.f199941e = pVar;
            this.f199942f = obj;
        }

        @Override // vq.a
        protected Object J(Object result) throws Throwable {
            int i15 = this.label;
            if (i15 == 0) {
                this.label = 1;
                u.b(result);
                return ((p) w0.g(this.f199941e, 2)).B(this.f199942f, this);
            }
            if (i15 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            u.b(result);
            return result;
        }
    }

    /* JADX INFO: renamed from: uq.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"uq/c$c", "Lvq/h;", "Loq/t;", "", "result", "J", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C5202c extends h {
        C5202c(e<? super T> eVar) {
            super(eVar);
        }

        @Override // vq.a
        protected Object J(Object result) throws Throwable {
            u.b(result);
            return result;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"uq/c$d", "Lvq/d;", "Loq/t;", "", "result", "J", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends vq.d {
        d(e<? super T> eVar, i iVar) {
            super(eVar, iVar);
        }

        @Override // vq.a
        protected Object J(Object result) throws Throwable {
            u.b(result);
            return result;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> e<i0> a(p<? super R, ? super e<? super T>, ? extends Object> pVar, R r15, e<? super T> eVar) {
        e<?> eVarA = g.a(eVar);
        if (pVar instanceof vq.a) {
            return ((vq.a) pVar).v(r15, eVarA);
        }
        i iVarC = eVarA.getContext();
        return iVarC == j.f191408a ? new a(eVarA, pVar, r15) : new b(eVarA, iVarC, pVar, r15);
    }

    private static final <T> e<T> b(e<? super T> eVar) {
        i iVarC = eVar.getContext();
        return iVarC == j.f191408a ? new C5202c(eVar) : new d(eVar, iVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> e<T> c(e<? super T> eVar) {
        e<T> eVar2;
        vq.d dVar = eVar instanceof vq.d ? (vq.d) eVar : null;
        return (dVar == null || (eVar2 = (e<T>) dVar.L()) == null) ? eVar : eVar2;
    }

    public static <R, T> Object d(p<? super R, ? super e<? super T>, ? extends Object> pVar, R r15, e<? super T> eVar) {
        return ((p) w0.g(pVar, 2)).B(r15, b(g.a(eVar)));
    }
}
