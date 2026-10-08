package j74;

import dx.i;
import dx.j;
import fu.r;
import g74.WKAuthData;
import iy.b0;
import iy.c0;
import iy.m;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096B¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c¨\u0006\u001d"}, d2 = {"Lj74/a;", "Ld74/a;", "Lg74/b;", "dataSource", "Ld74/d;", "parseJWSEForEIDUC", "Liy/a;", "base64Coder", "Liy/m;", "ecdsaTranscoder", "<init>", "(Lg74/b;Ld74/d;Liy/a;Liy/m;)V", "", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Ld74/a$a;", "params", "Ldx/i;", "Ldx/b;", "Lny/a;", "e", "(Ld74/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lg74/b;", "b", "Ld74/d;", "c", "Liy/a;", "Liy/m;", "wk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements d74.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g74.b dataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d74.d parseJWSEForEIDUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m ecdsaTranscoder;

    /* JADX INFO: renamed from: j74.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2344a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f99904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f99905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f99906f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f99907g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f99908h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f99909j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f99910k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f99911l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f99912m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f99913n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f99914p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f99915q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99916r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f99917s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f99918t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f99920w;

        C2344a(tq.e<? super C2344a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f99918t = obj;
            this.f99920w |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(g74.b bVar, d74.d dVar, iy.a aVar, m mVar) {
        this.dataSource = bVar;
        this.parseJWSEForEIDUC = dVar;
        this.base64Coder = aVar;
        this.ecdsaTranscoder = mVar;
    }

    private final String d(String str) {
        return r.w1(r.O(r.O(str, '+', '-', false, 4, null), '/', '_', false, 4, null), '=');
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [dx.j, int, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(d74.a.Params params, tq.e<? super i<? extends dx.b, ny.a>> eVar) throws Throwable {
        C2344a c2344a;
        Object objB;
        ex.b bVar;
        if (eVar instanceof C2344a) {
            c2344a = (C2344a) eVar;
            int i15 = c2344a.f99920w;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c2344a.f99920w = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c2344a = new C2344a(eVar);
            }
        } else {
            c2344a = new C2344a(eVar);
        }
        Object obj = c2344a.f99918t;
        Object objE = uq.b.e();
        ?? r15 = c2344a.f99920w;
        try {
            try {
                if (r15 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    byte[] bArr = (byte[]) aVar.a(iy.a.c(this.base64Coder, c0.e(params.getSignature()), null, 2, null));
                    byte[] bArrA = this.ecdsaTranscoder.a(bArr, 96);
                    String strD = d(iy.a.e(this.base64Coder, bArrA, null, 2, null));
                    WKAuthData wKAuthDataA = this.dataSource.a();
                    d74.d dVar = this.parseJWSEForEIDUC;
                    d74.d.Params params2 = new d74.d.Params(wKAuthDataA.getEncryptionKeyId(), wKAuthDataA.getEncryptionKey(), wKAuthDataA.getJwsTokenStructure().b(c0.g(strD)), null);
                    c2344a.f99904d = vq.j.a(params);
                    c2344a.f99905e = jVarA;
                    c2344a.f99906f = vq.j.a(aVar);
                    c2344a.f99907g = vq.j.a(aVar);
                    c2344a.f99908h = vq.j.a(bArr);
                    c2344a.f99909j = vq.j.a(bArrA);
                    c2344a.f99910k = vq.j.a(strD);
                    c2344a.f99911l = vq.j.a(wKAuthDataA);
                    c2344a.f99912m = aVar;
                    c2344a.f99913n = 0;
                    c2344a.f99914p = 0;
                    c2344a.f99915q = 0;
                    c2344a.f99916r = 0;
                    c2344a.f99917s = 0;
                    c2344a.f99920w = 1;
                    Object objC = dVar.c(params2, c2344a);
                    if (objC == objE) {
                        return objE;
                    }
                    bVar = aVar;
                    obj = objC;
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) c2344a.f99912m;
                    try {
                        u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                b0 value = ((ny.a) bVar.a((i) obj)).getValue();
                this.dataSource.clear();
                return new i.Right(ny.a.a(ny.a.b(value)));
            } catch (Exception e16) {
                px.f fVar = px.f.f163100a;
                String message = e16.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e16, px.c.a(r15));
                i iVarA = r15.a(e16);
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
        } catch (ex.c e17) {
            return new i.Left((dx.b) ex.d.a(e17));
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
