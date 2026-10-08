package pt;

import fr.k;
import ht.e;
import java.io.InputStream;
import oq.r;
import ot.u;
import rt.n;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends u implements sr.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f162504q = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f162505p;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final c a(zs.c cVar, n nVar, i0 i0Var, InputStream inputStream, boolean z15) {
            r<us.n, vs.a> rVarA = vs.c.a(inputStream);
            us.n nVarA = rVarA.a();
            vs.a aVarB = rVarA.b();
            if (nVarA != null) {
                return new c(cVar, nVar, i0Var, nVarA, aVarB, z15, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + vs.a.f208223h + ", actual " + aVarB + ". Please update Kotlin");
        }

        private a() {
        }
    }

    public /* synthetic */ c(zs.c cVar, n nVar, i0 i0Var, us.n nVar2, vs.a aVar, boolean z15, k kVar) {
        this(cVar, nVar, i0Var, nVar2, aVar, z15);
    }

    @Override // yr.h0, yr.m
    public String toString() {
        return "builtins package fragment for " + g() + " from " + e.s(this);
    }

    private c(zs.c cVar, n nVar, i0 i0Var, us.n nVar2, vs.a aVar, boolean z15) {
        super(cVar, nVar, i0Var, nVar2, aVar, null);
        this.f162505p = z15;
    }
}
