package mu;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lmu/a;", "T", "Lmu/g;", "", "<init>", "()V", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "d", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T> implements g<T> {

    /* JADX INFO: renamed from: mu.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C3165a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f128159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<T> f128160f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f128161g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3165a(a<T> aVar, tq.e<? super C3165a> eVar) {
            super(eVar);
            this.f128160f = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128159e = obj;
            this.f128161g |= PKIFailureInfo.systemUnavail;
            return this.f128160f.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mu.g
    public final Object a(h<? super T> hVar, tq.e<? super oq.i0> eVar) throws Throwable {
        C3165a c3165a;
        Throwable th4;
        p086nu.w wVar;
        if (eVar instanceof C3165a) {
            c3165a = (C3165a) eVar;
            int i15 = c3165a.f128161g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3165a.f128161g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3165a = new C3165a(this, eVar);
            }
        } else {
            c3165a = new C3165a(this, eVar);
        }
        Object obj = c3165a.f128159e;
        Object objE = uq.b.e();
        int i16 = c3165a.f128161g;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (p086nu.w) c3165a.f128158d;
            try {
                oq.u.b(obj);
                wVar.K();
                return oq.i0.f148189a;
            } catch (Throwable th5) {
                th4 = th5;
                wVar.K();
                throw th4;
            }
        }
        oq.u.b(obj);
        p086nu.w wVar2 = new p086nu.w(hVar, c3165a.getContext());
        try {
            c3165a.f128158d = wVar2;
            c3165a.f128161g = 1;
            if (d(wVar2, c3165a) == objE) {
                return objE;
            }
            wVar = wVar2;
            wVar.K();
            return oq.i0.f148189a;
        } catch (Throwable th6) {
            th4 = th6;
            wVar = wVar2;
            wVar.K();
            throw th4;
        }
    }

    public abstract Object d(h<? super T> hVar, tq.e<? super oq.i0> eVar);
}
