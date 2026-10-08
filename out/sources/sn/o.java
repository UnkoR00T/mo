package sn;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class o extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f182517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.c f182518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.c f182519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private io.c f182520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private io.c f182521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f182522h;

    public enum a {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public o(n nVar, y yVar) {
        Objects.requireNonNull(nVar);
        this.f182517c = nVar;
        Objects.requireNonNull(yVar);
        d(yVar);
        this.f182518d = null;
        this.f182520f = null;
        this.f182522h = a.UNENCRYPTED;
    }

    private void g() {
        a aVar = this.f182522h;
        if (aVar != a.ENCRYPTED && aVar != a.DECRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
    }

    private void h(m mVar) throws h {
        if (!mVar.b().contains(j().v())) {
            throw new h("The " + j().v() + " algorithm is not supported by the JWE encrypter: Supported algorithms: " + mVar.b());
        }
        if (mVar.a().contains(j().B())) {
            return;
        }
        throw new h("The " + j().B() + " encryption method or key size is not supported by the JWE encrypter: Supported methods: " + mVar.a());
    }

    private void i() {
        if (this.f182522h != a.UNENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an unencrypted state");
        }
    }

    public synchronized void f(m mVar) {
        try {
            i();
            h(mVar);
            try {
                l lVarC = mVar.c(j(), b().d(), un.a.b(j()));
                if (lVarC.d() != null) {
                    this.f182517c = lVarC.d();
                }
                this.f182518d = lVarC.c();
                this.f182519e = lVarC.e();
                this.f182520f = lVarC.b();
                this.f182521g = lVarC.a();
                this.f182522h = a.ENCRYPTED;
            } catch (h e15) {
                throw e15;
            } catch (Exception e16) {
                throw new h(e16.getMessage(), e16);
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public n j() {
        return this.f182517c;
    }

    public String k() {
        g();
        StringBuilder sb5 = new StringBuilder(this.f182517c.h().toString());
        sb5.append('.');
        io.c cVar = this.f182518d;
        if (cVar != null) {
            sb5.append(cVar);
        }
        sb5.append('.');
        io.c cVar2 = this.f182519e;
        if (cVar2 != null) {
            sb5.append(cVar2);
        }
        sb5.append('.');
        sb5.append(this.f182520f);
        sb5.append('.');
        io.c cVar3 = this.f182521g;
        if (cVar3 != null) {
            sb5.append(cVar3);
        }
        return sb5.toString();
    }
}
