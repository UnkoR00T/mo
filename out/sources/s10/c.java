package s10;

import android.annotation.SuppressLint;
import java.util.Set;
import oq.i0;
import oq.k;
import oq.l;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\fB\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tH\u0097@¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ls10/c;", "Ls10/a;", "", "registryFileName", "Lcz/c;", "storageFactory", "<init>", "(Ljava/lang/String;Lcz/c;)V", "fileName", "Loq/i0;", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "", "c", "(Ltq/e;)Ljava/lang/Object;", "b", "Ljava/lang/String;", "Lcz/c;", "Lcz/b;", "Loq/k;", "g", "()Lcz/b;", "fileRegistry", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f177400e = cz.b.a.b("file_registry_set");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String registryFileName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cz.c storageFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k fileRegistry = l.a(new er.a() { // from class: s10.b
        @Override // er.a
        public final Object a() {
            return c.f(this.f177398a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f177404d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f177406f;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f177404d = obj;
            this.f177406f |= PKIFailureInfo.systemUnavail;
            return c.this.c(this);
        }
    }

    /* JADX INFO: renamed from: s10.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4528c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f177407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f177408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f177409f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f177410g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f177412j;

        C4528c(e<? super C4528c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f177410g = obj;
            this.f177412j |= PKIFailureInfo.systemUnavail;
            return c.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f177413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f177414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f177415f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f177416g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f177418j;

        d(e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f177416g = obj;
            this.f177418j |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, this);
        }
    }

    public c(String str, cz.c cVar) {
        this.registryFileName = str;
        this.storageFactory = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b f(c cVar) {
        return cVar.storageFactory.a(cVar.registryFileName, cz.d.ENCRYPTED);
    }

    private final cz.b g() {
        return (cz.b) this.fileRegistry.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r4.l(r5, r2, r0) == r1) goto L21;
     */
    @Override // s10.a
    @android.annotation.SuppressLint({"ApplySharedPref"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof s10.c.d
            if (r0 == 0) goto L13
            r0 = r8
            s10.c$d r0 = (s10.c.d) r0
            int r1 = r0.f177418j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f177418j = r1
            goto L18
        L13:
            s10.c$d r0 = new s10.c$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f177416g
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f177418j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f177415f
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r7 = r0.f177414e
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r7 = r0.f177413d
            java.lang.String r7 = (java.lang.String) r7
            oq.u.b(r8)
            goto L7d
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f177413d
            java.lang.String r7 = (java.lang.String) r7
            oq.u.b(r8)
            goto L56
        L48:
            oq.u.b(r8)
            r0.f177413d = r7
            r0.f177418j = r4
            java.lang.Object r8 = r6.c(r0)
            if (r8 != r1) goto L56
            goto L7c
        L56:
            java.util.Set r8 = (java.util.Set) r8
            java.util.Set r2 = pq.e1.k(r8, r7)
            cz.b r4 = r6.g()
            java.lang.String r5 = s10.c.f177400e
            java.lang.Object r7 = vq.j.a(r7)
            r0.f177413d = r7
            java.lang.Object r7 = vq.j.a(r8)
            r0.f177414e = r7
            java.lang.Object r7 = vq.j.a(r2)
            r0.f177415f = r7
            r0.f177418j = r3
            java.lang.Object r7 = r4.l(r5, r2, r0)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s10.c.a(java.lang.String, tq.e):java.lang.Object");
    }

    @Override // s10.a
    @SuppressLint({"ApplySharedPref"})
    public Object b(e<? super i0> eVar) {
        Object objA = g().a(eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // s10.a
    public Object c(e<? super Set<String>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f177406f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f177406f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objG = bVar.f177404d;
        Object objE = uq.b.e();
        int i16 = bVar.f177406f;
        if (i16 == 0) {
            u.b(objG);
            cz.b bVarG = g();
            String str = f177400e;
            bVar.f177406f = 1;
            objG = bVarG.g(str, bVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objG);
        }
        Set set = (Set) objG;
        return set == null ? e1.e() : set;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r4.l(r5, r2, r0) == r1) goto L21;
     */
    @Override // s10.a
    @android.annotation.SuppressLint({"ApplySharedPref"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof s10.c.C4528c
            if (r0 == 0) goto L13
            r0 = r8
            s10.c$c r0 = (s10.c.C4528c) r0
            int r1 = r0.f177412j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f177412j = r1
            goto L18
        L13:
            s10.c$c r0 = new s10.c$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f177410g
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f177412j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f177409f
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r7 = r0.f177408e
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r7 = r0.f177407d
            java.lang.String r7 = (java.lang.String) r7
            oq.u.b(r8)
            goto L7d
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f177407d
            java.lang.String r7 = (java.lang.String) r7
            oq.u.b(r8)
            goto L56
        L48:
            oq.u.b(r8)
            r0.f177407d = r7
            r0.f177412j = r4
            java.lang.Object r8 = r6.c(r0)
            if (r8 != r1) goto L56
            goto L7c
        L56:
            java.util.Set r8 = (java.util.Set) r8
            java.util.Set r2 = pq.e1.m(r8, r7)
            cz.b r4 = r6.g()
            java.lang.String r5 = s10.c.f177400e
            java.lang.Object r7 = vq.j.a(r7)
            r0.f177407d = r7
            java.lang.Object r7 = vq.j.a(r8)
            r0.f177408e = r7
            java.lang.Object r7 = vq.j.a(r2)
            r0.f177409f = r7
            r0.f177412j = r3
            java.lang.Object r7 = r4.l(r5, r2, r0)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s10.c.d(java.lang.String, tq.e):java.lang.Object");
    }
}
