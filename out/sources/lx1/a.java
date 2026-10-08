package lx1;

import dx.i;
import dx.j;
import er.p;
import fr.t;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import ju.g1;
import ju.l0;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import tq.e;
import vq.d;
import vq.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llx1/a;", "", "Llx1/a$a;", "", "Lix1/c;", "pdfSigningManager", "<init>", "(Lix1/c;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Llx1/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lix1/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ix1.c pdfSigningManager;

    /* JADX INFO: renamed from: lx1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Llx1/a$a;", "Lgz/b$a;", "Lkx1/a;", "parameters", "", "signature", "<init>", "(Lkx1/a;[B)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkx1/a;", "()Lkx1/a;", "b", "[B", "()[B", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kx1.a parameters;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final byte[] signature;

        public Params(kx1.a aVar, byte[] bArr) {
            this.parameters = aVar;
            this.signature = bArr;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final kx1.a getParameters() {
            return this.parameters;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final byte[] getSignature() {
            return this.signature;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.parameters, params.parameters) && t.c(this.signature, params.signature);
        }

        public int hashCode() {
            return (this.parameters.hashCode() * 31) + Arrays.hashCode(this.signature);
        }

        public String toString() {
            return "Params(parameters=" + this.parameters + ", signature=" + Arrays.toString(this.signature) + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f121065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f121066f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f121067g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f121068h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f121069j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f121070k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f121071l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f121072m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f121073n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f121075q;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121073n = obj;
            this.f121075q |= PKIFailureInfo.systemUnavail;
            return a.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)[B"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<p0, e<? super byte[]>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121076e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Params f121078g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params, e<? super c> eVar) {
            super(2, eVar);
            this.f121078g = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f121076e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return a.this.pdfSigningManager.b(this.f121078g.getParameters(), this.f121078g.getSignature());
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super byte[]> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return a.this.new c(this.f121078g, eVar);
        }
    }

    public a(ix1.c cVar) {
        this.pdfSigningManager = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, lx1.a$a] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    public Object e(Params params, e<? super i<? extends dx.b, byte[]>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f121075q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f121075q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f121073n;
        Object objE = uq.b.e();
        int i16 = bVar.f121075q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        c cVar = new c(params, null);
                        bVar.f121064d = vq.j.a(params);
                        bVar.f121065e = jVarA;
                        bVar.f121066f = vq.j.a(aVar);
                        bVar.f121067g = vq.j.a(aVar);
                        bVar.f121068h = 0;
                        bVar.f121069j = 0;
                        bVar.f121070k = 0;
                        bVar.f121071l = 0;
                        bVar.f121072m = 0;
                        bVar.f121075q = 1;
                        Object objG = ju.i.g(l0VarB, cVar, bVar);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        params = jVarA;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(params));
                        i iVarA = params.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right((byte[]) obj);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }
}
