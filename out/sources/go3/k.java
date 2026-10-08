package go3;

import eo3.DocumentSchemaAttribute;
import eo3.DocumentSchemaForwardAttribute;
import eo3.DynamicDocumentSchema;
import eo3.DynamicSection;
import eo3.TopAnnotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.l1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\u001c\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lgo3/k;", "", "Lgo3/k$b;", "", "Lco3/q;", "Lbo3/a;", "verificationContainersInteractor", "Lq34/l1;", "isDocumentStoredByIdUC", "<init>", "(Lbo3/a;Lq34/l1;)V", "Leo3/l;", "schema", "", "rawData", "d", "(Leo3/l;Ljava/lang/String;)Ljava/util/List;", "Leo3/g;", "forwardAttributes", "e", "(Ljava/util/List;)Ljava/util/List;", "params", "Ldx/i;", "Ldx/b;", "f", "(Lgo3/k$b;Ltq/e;)Ljava/lang/Object;", "a", "Lbo3/a;", "b", "Lq34/l1;", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements gz.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f75504c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f75505d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l1 isDocumentStoredByIdUC;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgo3/k$a;", "", "<init>", "()V", "", "DOT_SEPARATOR", "Ljava/lang/String;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: go3.k$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgo3/k$b;", "Lgz/b$a;", "Lk34/a0;", "scope", "Lwn3/c;", "entryPoint", "<init>", "(Lk34/a0;Lwn3/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/a0;", "b", "()Lk34/a0;", "Lwn3/c;", "()Lwn3/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.a0 scope;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn3.c entryPoint;

        public Params(k34.a0 a0Var, wn3.c cVar) {
            this.scope = a0Var;
            this.entryPoint = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final wn3.c getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final k34.a0 getScope() {
            return this.scope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.scope, params.scope) && fr.t.c(this.entryPoint, params.entryPoint);
        }

        public int hashCode() {
            int iHashCode = this.scope.hashCode() * 31;
            wn3.c cVar = this.entryPoint;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "Params(scope=" + this.scope + ", entryPoint=" + this.entryPoint + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f75512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75513g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f75514h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f75516k;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75514h = obj;
            this.f75516k |= PKIFailureInfo.systemUnavail;
            return k.this.f(null, this);
        }
    }

    public k(bo3.a aVar, l1 l1Var) {
        this.verificationContainersInteractor = aVar;
        this.isDocumentStoredByIdUC = l1Var;
    }

    private final List<co3.q> d(DynamicDocumentSchema schema, String rawData) {
        Collection collectionN;
        Collection collectionN2;
        DynamicSection dynamicSections;
        List<DocumentSchemaAttribute> listB = schema.b();
        co3.q.b bVar = null;
        if (listB != null) {
            List<DocumentSchemaAttribute> listU = this.verificationContainersInteractor.u(listB, iy.c0.g(rawData));
            collectionN = new ArrayList();
            Iterator<T> it = listU.iterator();
            while (it.hasNext()) {
                String strZ = this.verificationContainersInteractor.z(((DocumentSchemaAttribute) it.next()).g());
                co3.q.a aVar = strZ != null ? new co3.q.a(strZ) : null;
                if (aVar != null) {
                    collectionN.add(aVar);
                }
            }
        } else {
            collectionN = pq.v.n();
        }
        List<DocumentSchemaAttribute> listA = schema.a();
        if (listA != null) {
            List<DocumentSchemaAttribute> listU2 = this.verificationContainersInteractor.u(listA, iy.c0.g(rawData));
            collectionN2 = new ArrayList();
            Iterator<T> it4 = listU2.iterator();
            while (it4.hasNext()) {
                String strZ2 = this.verificationContainersInteractor.z(((DocumentSchemaAttribute) it4.next()).g());
                co3.q.a aVar2 = strZ2 != null ? new co3.q.a(strZ2) : null;
                if (aVar2 != null) {
                    collectionN2.add(aVar2);
                }
            }
        } else {
            collectionN2 = pq.v.n();
        }
        List<DocumentSchemaAttribute> listU3 = this.verificationContainersInteractor.u(schema.getPicture().a(), iy.c0.g(rawData));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it5 = listU3.iterator();
        while (it5.hasNext()) {
            String strZ3 = this.verificationContainersInteractor.z(((DocumentSchemaAttribute) it5.next()).g());
            co3.q.a aVar3 = strZ3 != null ? new co3.q.a(strZ3) : null;
            if (aVar3 != null) {
                arrayList.add(aVar3);
            }
        }
        TopAnnotation topAnnotation = schema.getTopAnnotation();
        if (topAnnotation != null && (dynamicSections = topAnnotation.getDynamicSections()) != null) {
            List<String> listA2 = dynamicSections.a();
            if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
                Iterator<T> it6 = listA2.iterator();
                while (it6.hasNext()) {
                    if (this.verificationContainersInteractor.x((String) pq.v.x0(fu.r.V0((String) it6.next(), new String[]{"."}, false, 0, 6, null)), rawData)) {
                        bVar = new co3.q.b(co3.p.ANNOTATION);
                        break;
                    }
                }
            }
        }
        List listC = pq.v.c();
        listC.addAll(arrayList);
        listC.addAll(collectionN);
        listC.addAll(collectionN2);
        if (bVar != null) {
            listC.add(bVar);
        }
        return pq.v.a(listC);
    }

    private final List<co3.q> e(List<DocumentSchemaForwardAttribute> forwardAttributes) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = forwardAttributes.iterator();
        while (it.hasNext()) {
            String strZ = this.verificationContainersInteractor.z(((DocumentSchemaForwardAttribute) it.next()).a());
            co3.q.a aVar = strZ != null ? new co3.q.a(strZ) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0142 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x0147  */
    /* JADX WARN: Code duplicated, block: B:60:0x0166  */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX WARN: Code duplicated, block: B:67:0x0190  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (r11 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:
    
        if (r11 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0139, code lost:
    
        if (r11 == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(go3.k.Params r10, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<? extends co3.q>>> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go3.k.f(go3.k$b, tq.e):java.lang.Object");
    }
}
