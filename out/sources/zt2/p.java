package zt2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ts0.Restriction;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lzt2/p;", "", "Lgz/b$a$a;", "", "Lus0/f;", "getRestrictionUseCase", "<init>", "(Lus0/f;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lus0/f;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final us0.f getRestrictionUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f237376a;

        static {
            int[] iArr = new int[ts0.l.values().length];
            try {
                iArr[ts0.l.RESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ts0.l.UNRESTRICTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ts0.l.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f237376a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f237377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f237378e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f237380g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f237378e = obj;
            this.f237380g |= PKIFailureInfo.systemUnavail;
            return p.this.a(null, this);
        }
    }

    public p(us0.f fVar) {
        this.getRestrictionUseCase = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f237380g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f237380g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f237378e;
        Object objE = uq.b.e();
        int i16 = bVar.f237380g;
        if (i16 == 0) {
            oq.u.b(objC);
            us0.f fVar = this.getRestrictionUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            bVar.f237377d = vq.j.a(c1792a);
            bVar.f237380g = 1;
            objC = fVar.c(c1792a2, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            return bVar2 instanceof dx.b.g.c ? new dx.i.Right(vq.b.a(true)) : new dx.i.Left(bVar2);
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        int i17 = a.f237376a[((Restriction) ((dx.i.Right) iVar).b()).getStatus().ordinal()];
        if (i17 == 1 || i17 == 2) {
            return new dx.i.Right(vq.b.a(false));
        }
        if (i17 == 3) {
            return new dx.i.Left(new dx.b.Parsing(new Exception("Unknown RedirectionStatus")));
        }
        throw new oq.p();
    }
}
