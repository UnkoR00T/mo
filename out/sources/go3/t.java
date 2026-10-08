package go3;

import do3.NipipCardData;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lgo3/t;", "", "Lgo3/t$a;", "", "Lco3/q;", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Lbo3/a;)V", "", "isPartiallyRestricted", "Ldo3/c$c;", "restrictionType", "d", "(ZLdo3/c$c;)Lco3/q;", "params", "Ldx/i;", "Ldx/b;", "e", "(Lgo3/t$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbo3/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: go3.t$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/t$a;", "Lgz/b$a;", "Lk34/a0;", "scope", "<init>", "(Lk34/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/a0;", "()Lk34/a0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.a0 scope;

        public Params(k34.a0 a0Var) {
            this.scope = a0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final k34.a0 getScope() {
            return this.scope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.scope, ((Params) other).scope);
        }

        public int hashCode() {
            return this.scope.hashCode();
        }

        public String toString() {
            return "Params(scope=" + this.scope + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75705a;

        static {
            int[] iArr = new int[NipipCardData.EnumC0978c.values().length];
            try {
                iArr[NipipCardData.EnumC0978c.RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NipipCardData.EnumC0978c.INDIVIDUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NipipCardData.EnumC0978c.UNDER_SUPERVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NipipCardData.EnumC0978c.FIXED_TERM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NipipCardData.EnumC0978c.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f75705a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75708f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f75710h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75708f = obj;
            this.f75710h |= PKIFailureInfo.systemUnavail;
            return t.this.e(null, this);
        }
    }

    public t(bo3.a aVar) {
        this.verificationContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0008  */
    private final co3.q d(boolean isPartiallyRestricted, NipipCardData.EnumC0978c restrictionType) {
        boolean z15 = false;
        if (!isPartiallyRestricted) {
            int i15 = restrictionType == null ? -1 : b.f75705a[restrictionType.ordinal()];
            if (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) {
                z15 = true;
            }
        } else if (restrictionType == NipipCardData.EnumC0978c.FIXED_TERM) {
            z15 = true;
        }
        co3.q.b bVar = new co3.q.b(co3.p.PWZ_RESTRICTION_TYPE);
        if (z15) {
            return bVar;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(Params params, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends co3.q>>> eVar) throws Throwable {
        c cVar;
        NipipCardData.a aVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f75710h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f75710h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objM = cVar.f75708f;
        Object objE = uq.b.e();
        int i16 = cVar.f75710h;
        if (i16 == 0) {
            oq.u.b(objM);
            k34.a0 scope = params.getScope();
            if (fr.t.c(scope, k34.a0.h0.f107868a)) {
                aVar = NipipCardData.a.MIDWIFE;
            } else {
                if (!fr.t.c(scope, k34.a0.n0.f107881a)) {
                    return new dx.i.Left(new dx.b.Generic(new Exception("Unknown type")));
                }
                aVar = NipipCardData.a.NURSE;
            }
            bo3.a aVar2 = this.verificationContainersInteractor;
            cVar.f75706d = vq.j.a(params);
            cVar.f75707e = vq.j.a(aVar);
            cVar.f75710h = 1;
            objM = aVar2.m(aVar, cVar);
            if (objM == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objM);
        }
        dx.i iVar = (dx.i) objM;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        NipipCardData nipipCardData = (NipipCardData) ((dx.i.Right) iVar).b();
        boolean z15 = nipipCardData.getRestriction() == NipipCardData.b.PARTIAL;
        return new dx.i.Right(pq.v.s(new co3.q.b(co3.p.PICTURE), new co3.q.b(co3.p.NAMES), new co3.q.b(co3.p.SURNAME), new co3.q.b(co3.p.PWZ_PROFESSIONAL_TITLE), new co3.q.b(z15 ? co3.p.PWZ_DOCUMENT_NUMBER_PARTIAL : co3.p.PWZ_DOCUMENT_NUMBER_FULL), new co3.q.b(co3.p.PWZ_ISSUER_NAME), new co3.q.b(z15 ? co3.p.PWZ_CREATION_DATE_PARTIAL : co3.p.PWZ_CREATION_DATE_FULL), d(z15, nipipCardData.getRestrictionType())));
    }
}
