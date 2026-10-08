package cn3;

import bn3.VehicleDocumentContainerData;
import bn3.VehicleDocumentData;
import bn3.VehicleDocumentsFullData;
import dx.i;
import dx.j;
import fr.t;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcn3/a;", "", "Lcn3/a$a;", "Lbn3/h;", "Lzm3/a;", "vehiclesContainersInteractor", "<init>", "(Lzm3/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lcn3/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lzm3/a;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zm3.a vehiclesContainersInteractor;

    /* JADX INFO: renamed from: cn3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcn3/a$a;", "Lgz/b$a;", "", "registrationNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String registrationNumber;

        public Params(String str) {
            this.registrationNumber = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRegistrationNumber() {
            return this.registrationNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.registrationNumber, ((Params) other).registrationNumber);
        }

        public int hashCode() {
            return this.registrationNumber.hashCode();
        }

        public String toString() {
            return "Params(registrationNumber=" + this.registrationNumber + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f28401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f28402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f28403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f28404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28405h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28406j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f28407k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f28408l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f28409m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f28410n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f28411p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f28413r;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f28411p = obj;
            this.f28413r |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(zm3.a aVar) {
        this.vehiclesContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [dx.j, int, java.lang.Object] */
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
    public Object d(Params params, e<? super i<? extends dx.b, VehicleDocumentData>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.b bVar2;
        Params params2;
        ex.b bVar3;
        Object obj;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f28413r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f28413r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj2 = bVar.f28411p;
        Object objE = uq.b.e();
        ?? r15 = bVar.f28413r;
        try {
            try {
                if (r15 == 0) {
                    u.b(obj2);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    zm3.a aVar2 = this.vehiclesContainersInteractor;
                    bVar.f28401d = params;
                    bVar.f28402e = jVarA;
                    bVar.f28403f = vq.j.a(aVar);
                    bVar.f28404g = aVar;
                    bVar.f28405h = aVar;
                    bVar.f28406j = 0;
                    bVar.f28407k = 0;
                    bVar.f28408l = 0;
                    bVar.f28409m = 0;
                    bVar.f28410n = 0;
                    bVar.f28413r = 1;
                    Object objF = aVar2.f(bVar);
                    if (objF == objE) {
                        return objE;
                    }
                    bVar2 = aVar;
                    obj2 = objF;
                    params2 = params;
                    bVar3 = bVar2;
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar3 = (ex.b) bVar.f28405h;
                    bVar2 = (ex.b) bVar.f28404g;
                    params2 = (Params) bVar.f28401d;
                    try {
                        u.b(obj2);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                Object right = (i) obj2;
                if (!(right instanceof i.Left)) {
                    if (!(right instanceof i.Right)) {
                        throw new p();
                    }
                    Iterator<T> it = ((VehicleDocumentsFullData) ((i.Right) right).b()).a().iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        String registrationNumber = params2.getRegistrationNumber();
                        VehicleDocumentContainerData data = ((VehicleDocumentData) next).getScope().getData();
                        if (t.c(registrationNumber, data != null ? data.getRegistrationNumber() : null)) {
                            obj = next;
                            break;
                        }
                    }
                    VehicleDocumentData vehicleDocumentData = (VehicleDocumentData) obj;
                    if (vehicleDocumentData == null) {
                        bVar2.b(new dx.b.Generic(new Exception("Data not found")));
                        throw new g();
                    }
                    right = new i.Right(vehicleDocumentData);
                }
                return new i.Right((VehicleDocumentData) bVar3.a(right));
            } catch (Exception e16) {
                f fVar = f.f163100a;
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
