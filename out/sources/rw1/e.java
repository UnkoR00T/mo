package rw1;

import dx.i;
import dx.j;
import fr.t;
import iy.b0;
import iy.c0;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import q34.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0013B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lrw1/e;", "", "Lrw1/e$a;", "Lrw1/e$b;", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/z0;", "getPeselFromPersonalIdCertificate", "Lqw1/a;", "eidServicesContainersInteractor", "<init>", "(Lc54/b;Lq34/z0;Lqw1/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lrw1/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Lc54/b;", "b", "Lq34/z0;", "c", "Lqw1/a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z0 getPeselFromPersonalIdCertificate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qw1.a eidServicesContainersInteractor;

    /* JADX INFO: renamed from: rw1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrw1/e$a;", "Lgz/b$a;", "Liy/b0;", "x509Cert", "<init>", "(Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f176570b = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 x509Cert;

        public Params(b0 b0Var) {
            this.x509Cert = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getX509Cert() {
            return this.x509Cert;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.x509Cert, ((Params) other).x509Cert);
        }

        public int hashCode() {
            return this.x509Cert.hashCode();
        }

        public String toString() {
            return "Params(x509Cert=" + this.x509Cert + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lrw1/e$b;", "", "b", "a", "Lrw1/e$b$a;", "Lrw1/e$b$b;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrw1/e$b$a;", "Lrw1/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f176572a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1929433109;
            }

            public String toString() {
                return "DataCorrect";
            }
        }

        /* JADX INFO: renamed from: rw1.e$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrw1/e$b$b;", "Lrw1/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4507b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4507b f176573a = new C4507b();

            private C4507b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4507b);
            }

            public int hashCode() {
                return -863300802;
            }

            public String toString() {
                return "DataInconsistency";
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f176574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f176575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f176576f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f176577g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f176578h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f176579j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f176580k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f176581l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f176582m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f176583n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f176584p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f176585q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f176587s;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f176585q = obj;
            this.f176587s |= PKIFailureInfo.systemUnavail;
            return e.this.d(null, this);
        }
    }

    public e(c54.b bVar, z0 z0Var, qw1.a aVar) {
        this.isFeatureEnabledUseCase = bVar;
        this.getPeselFromPersonalIdCertificate = z0Var;
        this.eidServicesContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0135 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0136 A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #5 {Exception -> 0x0049, blocks: (B:13:0x0044, B:45:0x012f, B:48:0x0136, B:50:0x013a, B:52:0x0152, B:54:0x0157, B:53:0x0155, B:56:0x015b, B:57:0x0160, B:58:0x0161, B:61:0x016f, B:41:0x00eb, B:33:0x009c, B:35:0x00b1, B:37:0x00b9), top: B:77:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x013a A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #5 {Exception -> 0x0049, blocks: (B:13:0x0044, B:45:0x012f, B:48:0x0136, B:50:0x013a, B:52:0x0152, B:54:0x0157, B:53:0x0155, B:56:0x015b, B:57:0x0160, B:58:0x0161, B:61:0x016f, B:41:0x00eb, B:33:0x009c, B:35:0x00b1, B:37:0x00b9), top: B:77:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0152 A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #5 {Exception -> 0x0049, blocks: (B:13:0x0044, B:45:0x012f, B:48:0x0136, B:50:0x013a, B:52:0x0152, B:54:0x0157, B:53:0x0155, B:56:0x015b, B:57:0x0160, B:58:0x0161, B:61:0x016f, B:41:0x00eb, B:33:0x009c, B:35:0x00b1, B:37:0x00b9), top: B:77:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0155 A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #5 {Exception -> 0x0049, blocks: (B:13:0x0044, B:45:0x012f, B:48:0x0136, B:50:0x013a, B:52:0x0152, B:54:0x0157, B:53:0x0155, B:56:0x015b, B:57:0x0160, B:58:0x0161, B:61:0x016f, B:41:0x00eb, B:33:0x009c, B:35:0x00b1, B:37:0x00b9), top: B:77:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x015b A[Catch: Exception -> 0x0049, c -> 0x004c, CancellationException -> 0x004f, TryCatch #5 {Exception -> 0x0049, blocks: (B:13:0x0044, B:45:0x012f, B:48:0x0136, B:50:0x013a, B:52:0x0152, B:54:0x0157, B:53:0x0155, B:56:0x015b, B:57:0x0160, B:58:0x0161, B:61:0x016f, B:41:0x00eb, B:33:0x009c, B:35:0x00b1, B:37:0x00b9), top: B:77:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public Object d(Params params, tq.e<? super i<? extends dx.b, ? extends b>> eVar) throws Throwable {
        c cVar;
        Object objB;
        int i15;
        int i16;
        Params params2;
        int i17;
        j<dx.b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i18;
        int i19;
        String str;
        i iVar;
        Object obj;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i25 = cVar.f176587s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f176587s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objF = cVar.f176585q;
        Object objE = uq.b.e();
        ?? r15 = cVar.f176587s;
        try {
            try {
                if (r15 == 0) {
                    u.b(objF);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    if (!this.isFeatureEnabledUseCase.a(b54.c.DATA_COMPARISON_DOC_SIGNING).booleanValue()) {
                        return new i.Right(b.a.f176572a);
                    }
                    qw1.a aVar2 = this.eidServicesContainersInteractor;
                    cVar.f176574d = params;
                    cVar.f176575e = jVarA;
                    cVar.f176576f = vq.j.a(aVar);
                    cVar.f176577g = vq.j.a(aVar);
                    cVar.f176578h = aVar;
                    i17 = 0;
                    cVar.f176580k = 0;
                    cVar.f176581l = 0;
                    cVar.f176582m = 0;
                    cVar.f176583n = 0;
                    cVar.f176584p = 0;
                    cVar.f176587s = 1;
                    objF = aVar2.f(cVar);
                    if (objF != objE) {
                        params2 = params;
                        i15 = 0;
                        i16 = 0;
                        i19 = 0;
                        bVar3 = aVar;
                        bVar2 = bVar3;
                        bVar = bVar2;
                        i18 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = cVar.f176584p;
                        i15 = cVar.f176583n;
                        i16 = cVar.f176582m;
                        int i27 = cVar.f176581l;
                        int i28 = cVar.f176580k;
                        ex.b bVar4 = (ex.b) cVar.f176578h;
                        ex.b bVar5 = (ex.b) cVar.f176577g;
                        ex.b bVar6 = (ex.b) cVar.f176576f;
                        j<dx.b> jVar = (j) cVar.f176575e;
                        params2 = (Params) cVar.f176574d;
                        try {
                            u.b(objF);
                            i17 = i26;
                            jVarA = jVar;
                            bVar = bVar6;
                            bVar2 = bVar5;
                            bVar3 = bVar4;
                            i18 = i28;
                            i19 = i27;
                        } catch (ex.c e15) {
                            e = e15;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            f fVar = f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            i iVarA = r15.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof i.Right)) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) cVar.f176578h;
                        u.b(objF);
                    }
                    iVar = (i) objF;
                    if (iVar instanceof i.Left) {
                        return iVar;
                    }
                    if (iVar instanceof i.Right) {
                        throw new p();
                    }
                    if (str.contentEquals(c0.e(((z0.Result) ((i.Right) iVar).b()).getPesel()))) {
                        obj = b.a.f176572a;
                    } else {
                        obj = b.C4507b.f176573a;
                    }
                    return new i.Right(obj);
                } catch (CancellationException e18) {
                    throw e18;
                }
                String str2 = (String) bVar3.a((i) objF);
                z0.a.CertC509CertString certC509CertString = new z0.a.CertC509CertString(params2.getX509Cert());
                z0 z0Var = this.getPeselFromPersonalIdCertificate;
                cVar.f176574d = vq.j.a(params2);
                cVar.f176575e = jVarA;
                cVar.f176576f = vq.j.a(bVar);
                cVar.f176577g = vq.j.a(bVar2);
                cVar.f176578h = str2;
                cVar.f176579j = vq.j.a(certC509CertString);
                cVar.f176580k = i18;
                cVar.f176581l = i19;
                cVar.f176582m = i16;
                cVar.f176583n = i15;
                cVar.f176584p = i17;
                cVar.f176587s = 2;
                Object objC = z0Var.c(certC509CertString, cVar);
                if (objC != objE) {
                    str = str2;
                    objF = objC;
                    iVar = (i) objF;
                    if (iVar instanceof i.Left) {
                        return iVar;
                    }
                    if (iVar instanceof i.Right) {
                        throw new p();
                    }
                    if (str.contentEquals(c0.e(((z0.Result) ((i.Right) iVar).b()).getPesel()))) {
                        obj = b.a.f176572a;
                    } else {
                        obj = b.C4507b.f176573a;
                    }
                    return new i.Right(obj);
                }
                return objE;
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
