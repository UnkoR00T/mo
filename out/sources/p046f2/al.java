package p046f2;

import ju.n;
import ju.p;
import oq.t;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import su.g;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR/\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lf2/al;", "", "<init>", "()V", "Lf2/xl;", "visuals", "Lf2/wl;", "d", "(Lf2/xl;Ltq/e;)Ljava/lang/Object;", "Lsu/a;", "a", "Lsu/a;", "mutex", "Lf2/nk;", "<set-?>", "b", "Lm2/a3;", "()Lf2/nk;", "c", "(Lf2/nk;)V", "currentSnackbarData", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 currentSnackbarData = c6.e(null, null, 2, null);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lf2/al$a;", "Lf2/nk;", "Lf2/xl;", "visuals", "Lju/n;", "Lf2/wl;", "continuation", "<init>", "(Lf2/xl;Lju/n;)V", "Loq/i0;", "c", "()V", "dismiss", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lf2/xl;", "()Lf2/xl;", "b", "Lju/n;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a implements nk {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final xl visuals;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final n<wl> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public a(xl xlVar, n<? super wl> nVar) {
            this.visuals = xlVar;
            this.continuation = nVar;
        }

        @Override // p046f2.nk
        /* JADX INFO: renamed from: a, reason: from getter */
        public xl getVisuals() {
            return this.visuals;
        }

        @Override // p046f2.nk
        public void c() {
            if (this.continuation.h()) {
                n<wl> nVar = this.continuation;
                t.Companion companion = t.INSTANCE;
                nVar.i(t.b(wl.ActionPerformed));
            }
        }

        @Override // p046f2.nk
        public void dismiss() {
            if (this.continuation.h()) {
                n<wl> nVar = this.continuation;
                t.Companion companion = t.INSTANCE;
                nVar.i(t.b(wl.Dismissed));
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || a.class != other.getClass()) {
                return false;
            }
            a aVar = (a) other;
            return fr.t.c(getVisuals(), aVar.getVisuals()) && fr.t.c(this.continuation, aVar.continuation);
        }

        public int hashCode() {
            return (getVisuals().hashCode() * 31) + this.continuation.hashCode();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f55220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f55221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f55222f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f55223g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f55225j;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f55223g = obj;
            this.f55225j |= PKIFailureInfo.systemUnavail;
            return al.this.d(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(nk nkVar) {
        this.currentSnackbarData.setValue(nkVar);
    }

    public final nk b() {
        return (nk) this.currentSnackbarData.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(xl xlVar, e<? super wl> eVar) throws Throwable {
        b bVar;
        su.a aVar;
        xl xlVar2;
        Throwable th4;
        su.a aVar2;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f55225j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f55225j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f55223g;
        Object objE = uq.b.e();
        int i16 = bVar.f55225j;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    aVar = this.mutex;
                    bVar.f55220d = xlVar;
                    bVar.f55221e = aVar;
                    bVar.f55225j = 1;
                    if (aVar.h(null, bVar) != objE) {
                    }
                    xlVar2 = xlVar;
                    return objE;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (su.a) bVar.f55221e;
                    try {
                        u.b(obj);
                        c(null);
                        aVar2.r(null);
                        return obj;
                    } catch (Throwable th5) {
                        th4 = th5;
                        c(null);
                        throw th4;
                    }
                }
                su.a aVar3 = (su.a) bVar.f55221e;
                xl xlVar3 = (xl) bVar.f55220d;
                u.b(obj);
                aVar = aVar3;
                xlVar2 = xlVar3;
                xlVar2 = xlVar;
                bVar.f55220d = xlVar2;
                bVar.f55221e = aVar;
                bVar.f55222f = bVar;
                bVar.f55225j = 2;
                p pVar = new p(uq.b.c(bVar), 1);
                pVar.D();
                c(new a(xlVar2, pVar));
                Object objX = pVar.x();
                if (objX == uq.b.e()) {
                    vq.g.c(bVar);
                }
                if (objX != objE) {
                    su.a aVar4 = aVar;
                    obj = objX;
                    aVar2 = aVar4;
                    c(null);
                    aVar2.r(null);
                    return obj;
                }
                xlVar2 = xlVar;
                return objE;
            } catch (Throwable th6) {
                th4 = th6;
                c(null);
                throw th4;
            }
        } catch (Throwable th7) {
            xlVar.r(null);
            throw th7;
        }
    }
}
