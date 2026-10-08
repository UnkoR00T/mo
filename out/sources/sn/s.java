package sn;

import java.text.ParseException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class s extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f182559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f182560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.c f182561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<b> f182562f;

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ sn.a f182563a;

        a(sn.a aVar) {
            this.f182563a = aVar;
        }
    }

    public enum b {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    public s(r rVar, y yVar) {
        AtomicReference<b> atomicReference = new AtomicReference<>();
        this.f182562f = atomicReference;
        Objects.requireNonNull(rVar);
        this.f182559c = rVar;
        Objects.requireNonNull(yVar);
        d(yVar);
        this.f182560d = f();
        this.f182561e = null;
        atomicReference.set(b.UNSIGNED);
    }

    private String f() {
        if (this.f182559c.v()) {
            return j().h().toString() + '.' + b().c().toString();
        }
        return j().h().toString() + '.' + b().toString();
    }

    private void g(u uVar) throws h {
        if (uVar.b().contains(j().t())) {
            return;
        }
        throw new h("The " + j().t() + " algorithm is not allowed or supported by the JWS signer: Supported algorithms: " + uVar.b());
    }

    private void h() {
        if (this.f182562f.get() != b.SIGNED && this.f182562f.get() != b.VERIFIED) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
    }

    private void i() {
        if (this.f182562f.get() != b.UNSIGNED) {
            throw new IllegalStateException("The JWS object must be in an unsigned state");
        }
    }

    public static s n(String str) throws ParseException {
        io.c[] cVarArrE = i.e(str);
        if (cVarArrE.length == 3) {
            return new s(cVarArrE[0], cVarArrE[1], cVarArrE[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    public r j() {
        return this.f182559c;
    }

    public byte[] k() {
        return this.f182560d.getBytes(io.m.f93605a);
    }

    public b m() {
        return this.f182562f.get();
    }

    public String o() {
        return p(false);
    }

    public String p(boolean z15) {
        h();
        if (!z15) {
            return this.f182560d + '.' + this.f182561e.toString();
        }
        return this.f182559c.h().toString() + ".." + this.f182561e.toString();
    }

    public synchronized void r(u uVar) {
        i();
        g(uVar);
        try {
            try {
                this.f182561e = uVar.a(j(), k());
                this.f182562f.set(b.SIGNED);
            } catch (sn.a e15) {
                throw new sn.a(e15.getMessage(), e15.a(), new a(e15));
            }
        } catch (h e16) {
            throw e16;
        } catch (Exception e17) {
            throw new h(e17.getMessage(), e17);
        }
    }

    public s(io.c cVar, io.c cVar2, io.c cVar3) {
        this(cVar, new y(cVar2), cVar3);
    }

    public s(io.c cVar, y yVar, io.c cVar2) throws ParseException {
        AtomicReference<b> atomicReference = new AtomicReference<>();
        this.f182562f = atomicReference;
        try {
            this.f182559c = r.w(cVar);
            Objects.requireNonNull(yVar);
            d(yVar);
            this.f182560d = f();
            if (!cVar2.toString().trim().isEmpty()) {
                this.f182561e = cVar2;
                atomicReference.set(b.SIGNED);
                if (j().v()) {
                    c(cVar, yVar.c(), cVar2);
                    return;
                } else {
                    c(cVar, new io.c(""), cVar2);
                    return;
                }
            }
            throw new ParseException("The signature must not be empty", 0);
        } catch (ParseException e15) {
            throw new ParseException("Invalid JWS header: " + e15.getMessage(), 0);
        }
    }
}
