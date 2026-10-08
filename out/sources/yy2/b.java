package yy2;

import c74.WKAuthSigningParams;
import dx.i;
import dx.j;
import fr.t;
import fu.r;
import iy.b0;
import iy.c0;
import iy.m;
import java.util.concurrent.CancellationException;
import my.JWSTokenStructure;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lyy2/b;", "", "Lyy2/b$a;", "Lny/a;", "Ld74/d;", "parseJWSEForEIDUC", "Liy/a;", "base64Coder", "Liy/m;", "ecdsaTranscoder", "<init>", "(Ld74/d;Liy/a;Liy/m;)V", "", "d", "(Ljava/lang/String;)Ljava/lang/String;", "params", "Ldx/i;", "Ldx/b;", "e", "(Lyy2/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Ld74/d;", "b", "Liy/a;", "c", "Liy/m;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d74.d parseJWSEForEIDUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m ecdsaTranscoder;

    /* JADX INFO: renamed from: yy2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lyy2/b$a;", "Lgz/b$a;", "Liy/b0;", "signatureBase64", "Lmy/f;", "jwsTokenStructure", "Lc74/b;", "signingParams", "<init>", "(Liy/b0;Lmy/f;Lc74/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "Lmy/f;", "()Lmy/f;", "c", "Lc74/b;", "()Lc74/b;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 signatureBase64;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final JWSTokenStructure jwsTokenStructure;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final WKAuthSigningParams signingParams;

        public Params(b0 b0Var, JWSTokenStructure jWSTokenStructure, WKAuthSigningParams wKAuthSigningParams) {
            this.signatureBase64 = b0Var;
            this.jwsTokenStructure = jWSTokenStructure;
            this.signingParams = wKAuthSigningParams;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final JWSTokenStructure getJwsTokenStructure() {
            return this.jwsTokenStructure;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getSignatureBase64() {
            return this.signatureBase64;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final WKAuthSigningParams getSigningParams() {
            return this.signingParams;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.signatureBase64, params.signatureBase64) && t.c(this.jwsTokenStructure, params.jwsTokenStructure) && t.c(this.signingParams, params.signingParams);
        }

        public int hashCode() {
            return (((this.signatureBase64.hashCode() * 31) + this.jwsTokenStructure.hashCode()) * 31) + this.signingParams.hashCode();
        }

        public String toString() {
            return "Params(signatureBase64=" + this.signatureBase64 + ", jwsTokenStructure=" + this.jwsTokenStructure + ", signingParams=" + this.signingParams + ')';
        }
    }

    /* JADX INFO: renamed from: yy2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C6204b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f230797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f230799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f230800g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f230801h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f230802j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f230803k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f230804l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f230805m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f230806n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f230807p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f230808q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f230809r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f230810s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f230812v;

        C6204b(tq.e<? super C6204b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f230810s = obj;
            this.f230812v |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, this);
        }
    }

    public b(d74.d dVar, iy.a aVar, m mVar) {
        this.parseJWSEForEIDUC = dVar;
        this.base64Coder = aVar;
        this.ecdsaTranscoder = mVar;
    }

    private final String d(String str) {
        return r.w1(r.O(r.O(str, '+', '-', false, 4, null), '/', '_', false, 4, null), '=');
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public Object e(Params params, tq.e<? super i<? extends dx.b, ny.a>> eVar) throws Throwable {
        C6204b c6204b;
        Object objB;
        ex.b bVar;
        if (eVar instanceof C6204b) {
            c6204b = (C6204b) eVar;
            int i15 = c6204b.f230812v;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c6204b.f230812v = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c6204b = new C6204b(eVar);
            }
        } else {
            c6204b = new C6204b(eVar);
        }
        Object obj = c6204b.f230810s;
        ?? E = uq.b.e();
        int i16 = c6204b.f230812v;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        byte[] bArr = (byte[]) aVar.a(iy.a.c(this.base64Coder, c0.e(params.getSignatureBase64()), null, 2, null));
                        byte[] bArrA = this.ecdsaTranscoder.a(bArr, 96);
                        String strD = d(iy.a.e(this.base64Coder, bArrA, null, 2, null));
                        d74.d dVar = this.parseJWSEForEIDUC;
                        d74.d.Params params2 = new d74.d.Params(params.getSigningParams().getEncryptionKeyId(), params.getSigningParams().getEncryptionKey(), params.getJwsTokenStructure().b(c0.g(strD)), null);
                        c6204b.f230797d = vq.j.a(params);
                        c6204b.f230798e = jVarA;
                        c6204b.f230799f = vq.j.a(aVar);
                        c6204b.f230800g = vq.j.a(aVar);
                        c6204b.f230801h = vq.j.a(bArr);
                        c6204b.f230802j = vq.j.a(bArrA);
                        c6204b.f230803k = vq.j.a(strD);
                        c6204b.f230804l = aVar;
                        c6204b.f230805m = 0;
                        c6204b.f230806n = 0;
                        c6204b.f230807p = 0;
                        c6204b.f230808q = 0;
                        c6204b.f230809r = 0;
                        c6204b.f230812v = 1;
                        Object objC = dVar.c(params2, c6204b);
                        if (objC == E) {
                            return E;
                        }
                        obj = objC;
                        bVar = aVar;
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        i iVarA = E.a(e);
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
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) c6204b.f230804l;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new i.Right(ny.a.a(ny.a.b(((ny.a) bVar.a((i) obj)).getValue())));
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }
}
