package o14;

import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.ProviderException;
import p071kotlin.Metadata;
import y00.c0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lo14/j;", "La14/k;", "Lui2/a;", "cryptoManager", "Ly00/c0;", "securityExceptionParser", "<init>", "(Lui2/a;Ly00/c0;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Ljava/security/KeyPair;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lui2/a;", "b", "Ly00/c0;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements a14.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ui2.a cryptoManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 securityExceptionParser;

    public j(ui2.a aVar, c0 c0Var) {
        this.cryptoManager = aVar;
        this.securityExceptionParser = c0Var;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, KeyPair>> eVar) {
        try {
            return new dx.i.Right(this.cryptoManager.a());
        } catch (InvalidParameterException e15) {
            dx.i<Exception, dx.b> iVarA = this.securityExceptionParser.a(e15);
            if (iVarA instanceof dx.i.Left) {
                return new dx.i.Left(new dx.b.Generic((Throwable) ((dx.i.Left) iVarA).b()));
            }
            if (iVarA instanceof dx.i.Right) {
                return new dx.i.Left(((dx.i.Right) iVarA).b());
            }
            throw new oq.p();
        } catch (ProviderException e16) {
            dx.i<Exception, dx.b> iVarA2 = this.securityExceptionParser.a(e16);
            if (iVarA2 instanceof dx.i.Left) {
                return new dx.i.Left(new dx.b.Generic((Throwable) ((dx.i.Left) iVarA2).b()));
            }
            if (iVarA2 instanceof dx.i.Right) {
                return new dx.i.Left(((dx.i.Right) iVarA2).b());
            }
            throw new oq.p();
        }
    }
}
