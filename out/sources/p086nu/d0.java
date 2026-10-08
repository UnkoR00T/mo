package p086nu;

import er.p;
import mu.h;
import oq.i0;
import ou.l0;
import p071kotlin.Metadata;
import tq.e;
import tq.i;
import uq.b;
import vq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lnu/d0;", "T", "Lmu/h;", "downstream", "Ltq/i;", "emitContext", "<init>", "(Lmu/h;Ltq/i;)V", "value", "Loq/i0;", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "a", "Ltq/i;", "", "b", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Ltq/e;", "c", "Ler/p;", "emitRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d0<T> implements h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i emitContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object countOrElement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p<T, e<? super i0>, Object> emitRef;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Loq/i0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<T, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138705e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f138706f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h<T> f138707g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h<? super T> hVar, e<? super a> eVar) {
            super(2, eVar);
            this.f138707g = hVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to nu.d0$a for r3v1 'this'  tq.e
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r3.f138705e
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                oq.u.b(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                oq.u.b(r4)
                java.lang.Object r4 = r3.f138706f
                mu.h<T> r1 = r3.f138707g
                r3.f138705e = r2
                java.lang.Object r4 = r1.F(r4, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                oq.i0 r4 = oq.i0.f148189a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.d0.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(T t15, e<? super i0> eVar) {
            return ((a) v(t15, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            a aVar = new a(this.f138707g, eVar);
            aVar.f138706f = obj;
            return aVar;
        }
    }

    public d0(h<? super T> hVar, i iVar) {
        this.emitContext = iVar;
        this.countOrElement = l0.g(iVar);
        this.emitRef = new a(hVar, null);
    }

    @Override // mu.h
    public Object F(T t15, e<? super i0> eVar) {
        Object objB = f.b(this.emitContext, t15, this.countOrElement, this.emitRef, eVar);
        return objB == b.e() ? objB : i0.f148189a;
    }
}
