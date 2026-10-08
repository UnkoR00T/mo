package ng0;

import fr.q0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import ju.g1;
import ju.p0;
import lg0.EncryptedScope;
import oq.i0;
import org.bouncycastle.cms.CMSSignedData;
import p071kotlin.Metadata;
import pq.v0;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0013B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lng0/c;", "", "Lng0/c$a;", "Lng0/c$b;", "Liy/j;", "cmsManager", "Liy/a;", "base64Coder", "Lay/j;", "jsonSerializer", "<init>", "(Liy/j;Liy/a;Lay/j;)V", "params", "Ldx/i;", "Ldx/b;", "g", "(Lng0/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/j;", "b", "Liy/a;", "c", "Lay/j;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.j cmsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: ng0.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lng0/c$a;", "Lgz/b$a;", "", "scopesData", "Lry/c;", "certificateKeyPair", "<init>", "(Ljava/lang/String;Lry/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lry/c;", "()Lry/c;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String scopesData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertKeyPair certificateKeyPair;

        public Params(String str, CertKeyPair certKeyPair) {
            this.scopesData = str;
            this.certificateKeyPair = certKeyPair;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CertKeyPair getCertificateKeyPair() {
            return this.certificateKeyPair;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScopesData() {
            return this.scopesData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.scopesData, params.scopesData) && fr.t.c(this.certificateKeyPair, params.certificateKeyPair);
        }

        public int hashCode() {
            return (this.scopesData.hashCode() * 31) + this.certificateKeyPair.hashCode();
        }

        public String toString() {
            return "Params(scopesData=" + this.scopesData + ", certificateKeyPair=" + this.certificateKeyPair + ')';
        }
    }

    /* JADX INFO: renamed from: ng0.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lng0/c$b;", "", "", "", "Lorg/bouncycastle/cms/CMSSignedData;", "mapOfScopes", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, CMSSignedData> mapOfScopes;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(Map<String, ? extends CMSSignedData> map) {
            this.mapOfScopes = map;
        }

        public final Map<String, CMSSignedData> a() {
            return this.mapOfScopes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && fr.t.c(this.mapOfScopes, ((Result) other).mapOfScopes);
        }

        public int hashCode() {
            return this.mapOfScopes.hashCode();
        }

        public String toString() {
            return "Result(mapOfScopes=" + this.mapOfScopes + ')';
        }
    }

    /* JADX INFO: renamed from: ng0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lng0/c$b;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C3355c extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Result>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135974e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Params f135976g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3355c(Params params, tq.e<? super C3355c> eVar) {
            super(2, eVar);
            this.f135976g = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f135974e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c cVar = c.this;
            Params params = this.f135976g;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        ex.a aVar = new ex.a();
                        List<EncryptedScope> list = (List) cVar.jsonSerializer.a(new String(cVar.cmsManager.b((byte[]) aVar.a(iy.a.c(cVar.base64Coder, params.getScopesData(), null, 2, null)), new CertKeyPair(params.getCertificateKeyPair().getCertificate(), params.getCertificateKeyPair().getPrivateKey())), fu.d.UTF_8), q0.o(List.class, mr.r.INSTANCE.d(q0.n(EncryptedScope.class))));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(list, 10)), 16));
                        for (EncryptedScope encryptedScope : list) {
                            oq.r rVarA = oq.y.a(encryptedScope.getId(), new CMSSignedData((byte[]) aVar.a(iy.a.c(cVar.base64Coder, encryptedScope.getContent(), null, 2, null))));
                            linkedHashMap.put(rVarA.c(), rVarA.d());
                        }
                        return new dx.i.Right(new Result(linkedHashMap));
                    } catch (Exception e15) {
                        px.f fVar = px.f.f163100a;
                        String message = e15.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e15, px.c.a(jVarA));
                        Object objA = jVarA.a(e15);
                        if (objA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                        } else {
                            if (!(objA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) objA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (CancellationException e18) {
                throw e18;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Result>> eVar) {
            return ((C3355c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new C3355c(this.f135976g, eVar);
        }
    }

    public c(iy.j jVar, iy.a aVar, ay.j jVar2) {
        this.cmsManager = jVar;
        this.base64Coder = aVar;
        this.jsonSerializer = jVar2;
    }

    public Object g(Params params, tq.e<? super dx.i<? extends dx.b, Result>> eVar) {
        return ju.i.g(g1.b(), new C3355c(params, null), eVar);
    }
}
