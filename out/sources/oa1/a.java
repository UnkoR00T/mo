package oa1;

import ac4.q;
import dx.i;
import fr.t;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0016\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!¨\u0006\""}, d2 = {"Loa1/a;", "", "Loa1/a$a;", "Lma1/q;", "Lla1/a;", "interactor", "Lgy/a;", "permissionManager", "Lac4/q;", "saveFilesOnDeviceUseCase", "Lq54/a;", "localNotificationManager", "Lmx/c;", "labelProvider", "<init>", "(Lla1/a;Lgy/a;Lac4/q;Lq54/a;Lmx/c;)V", "", "fileName", "Ldx/i;", "Ldx/b;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "params", "f", "(Loa1/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lla1/a;", "b", "Lgy/a;", "c", "Lac4/q;", "d", "Lq54/a;", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final la1.a interactor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gy.a permissionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q saveFilesOnDeviceUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q54.a localNotificationManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: oa1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Loa1/a$a;", "Lgz/b$a;", "", "fileName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fileName;

        public Params(String str) {
            this.fileName = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.fileName, ((Params) other).fileName);
        }

        public int hashCode() {
            return this.fileName.hashCode();
        }

        public String toString() {
            return "Params(fileName=" + this.fileName + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f144044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f144045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f144046f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f144047g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f144048h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f144049j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f144050k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f144052m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f144050k = obj;
            this.f144052m |= PKIFailureInfo.systemUnavail;
            return a.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f144053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f144054e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f144056g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f144054e = obj;
            this.f144056g |= PKIFailureInfo.systemUnavail;
            return a.this.f(null, this);
        }
    }

    public a(la1.a aVar, gy.a aVar2, q qVar, q54.a aVar3, mx.c cVar) {
        this.interactor = aVar;
        this.permissionManager = aVar2;
        this.saveFilesOnDeviceUseCase = qVar;
        this.localNotificationManager = aVar3;
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fe, code lost:
    
        if (r5.a(r4, "application/pdf", r7, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r11, tq.e<? super dx.i<? extends dx.b, ? extends ma1.q>> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oa1.a.e(java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(Params params, tq.e<? super i<? extends dx.b, ? extends ma1.q>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f144056g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f144056g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD = cVar.f144054e;
        Object objE = uq.b.e();
        int i16 = cVar.f144056g;
        if (i16 == 0) {
            u.b(objD);
            gy.a aVar = this.permissionManager;
            gy.d dVar = gy.d.EXTERNAL_STORAGE;
            cVar.f144053d = params;
            cVar.f144056g = 1;
            objD = aVar.d(dVar, cVar);
            if (objD != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objD);
            return objD;
        }
        params = (Params) cVar.f144053d;
        u.b(objD);
        gy.c cVar2 = (gy.c) objD;
        if (!t.c(cVar2, gy.c.a.f78236a)) {
            if ((cVar2 instanceof gy.c.NotGranted) || t.c(cVar2, gy.c.C1774c.f78238a)) {
                return new i.Right(ma1.q.NOT_PERMISSION_GRANTED);
            }
            throw new p();
        }
        String fileName = params.getFileName();
        cVar.f144053d = j.a(params);
        cVar.f144056g = 2;
        Object objE2 = e(fileName, cVar);
        return objE2 == objE ? objE : objE2;
    }
}
