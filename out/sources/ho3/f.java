package ho3;

import co3.Result;
import co3.n;
import dx.i;
import fr.k;
import fr.t;
import go3.c0;
import go3.r;
import java.util.List;
import k34.a0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lho3/f;", "", "Lho3/f$a;", "Lco3/g;", "Lgo3/c0;", "getVerificationDataUseCase", "Lgo3/a;", "checkOldDrivingLicenceExistUseCase", "Lgo3/r;", "getListVerificationDataUseCase", "Lmx/c;", "labelProvider", "<init>", "(Lgo3/c0;Lgo3/a;Lgo3/r;Lmx/c;)V", "Lho3/f$a$a$a;", "params", "Ldx/i;", "Ldx/b;", "g", "(Lho3/f$a$a$a;Ltq/e;)Ljava/lang/Object;", "Lho3/f$a$a$b;", "h", "(Lho3/f$a$a$b;Ltq/e;)Ljava/lang/Object;", "f", "(Lho3/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo3/c0;", "b", "Lgo3/a;", "c", "Lgo3/r;", "Ldx/b$c;", "d", "Ldx/b$c;", "oldDrivingLicenceError", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 getVerificationDataUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final go3.a checkOldDrivingLicenceExistUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r getListVerificationDataUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business oldDrivingLicenceError;

    /* JADX INFO: renamed from: ho3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lho3/f$a;", "Lgz/b$a;", "Lho3/f$a$a;", "paramsType", "<init>", "(Lho3/f$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lho3/f$a$a;", "()Lho3/f$a$a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC2006a paramsType;

        /* JADX INFO: renamed from: ho3.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lho3/f$a$a;", "", "<init>", "()V", "a", "b", "Lho3/f$a$a$a;", "Lho3/f$a$a$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class AbstractC2006a {

            /* JADX INFO: renamed from: ho3.f$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lho3/f$a$a$a;", "Lho3/f$a$a;", "Lk34/g;", "selectedDocument", "<init>", "(Lk34/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/g;", "()Lk34/g;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Main extends AbstractC2006a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final k34.g selectedDocument;

                public Main(k34.g gVar) {
                    super(null);
                    this.selectedDocument = gVar;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final k34.g getSelectedDocument() {
                    return this.selectedDocument;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Main) && t.c(this.selectedDocument, ((Main) other).selectedDocument);
                }

                public int hashCode() {
                    return this.selectedDocument.hashCode();
                }

                public String toString() {
                    return "Main(selectedDocument=" + this.selectedDocument + ')';
                }
            }

            /* JADX INFO: renamed from: ho3.f$a$a$b, reason: from toString */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lho3/f$a$a$b;", "Lho3/f$a$a;", "Lco3/n;", "subDocument", "Loq/r;", "Lk34/a0;", "scope", "Lwn3/c;", "verificationEntryPoint", "<init>", "(Lco3/n;Loq/r;Lwn3/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/n;", "b", "()Lco3/n;", "Loq/r;", "()Loq/r;", "c", "Lwn3/c;", "()Lwn3/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Sub extends AbstractC2006a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final n subDocument;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final oq.r<a0, a0> scope;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final wn3.c verificationEntryPoint;

                /* JADX WARN: Multi-variable type inference failed */
                public Sub(n nVar, oq.r<? extends a0, ? extends a0> rVar, wn3.c cVar) {
                    super(null);
                    this.subDocument = nVar;
                    this.scope = rVar;
                    this.verificationEntryPoint = cVar;
                }

                public final oq.r<a0, a0> a() {
                    return this.scope;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final n getSubDocument() {
                    return this.subDocument;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final wn3.c getVerificationEntryPoint() {
                    return this.verificationEntryPoint;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Sub)) {
                        return false;
                    }
                    Sub sub = (Sub) other;
                    return t.c(this.subDocument, sub.subDocument) && t.c(this.scope, sub.scope) && t.c(this.verificationEntryPoint, sub.verificationEntryPoint);
                }

                public int hashCode() {
                    int iHashCode = ((this.subDocument.hashCode() * 31) + this.scope.hashCode()) * 31;
                    wn3.c cVar = this.verificationEntryPoint;
                    return iHashCode + (cVar == null ? 0 : cVar.hashCode());
                }

                public String toString() {
                    return "Sub(subDocument=" + this.subDocument + ", scope=" + this.scope + ", verificationEntryPoint=" + this.verificationEntryPoint + ')';
                }
            }

            public /* synthetic */ AbstractC2006a(k kVar) {
                this();
            }

            private AbstractC2006a() {
            }
        }

        public Params(AbstractC2006a abstractC2006a) {
            this.paramsType = abstractC2006a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC2006a getParamsType() {
            return this.paramsType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.paramsType, ((Params) other).paramsType);
        }

        public int hashCode() {
            return this.paramsType.hashCode();
        }

        public String toString() {
            return "Params(paramsType=" + this.paramsType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f86095e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f86097g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86095e = obj;
            this.f86097g |= PKIFailureInfo.systemUnavail;
            return f.this.g(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86100f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f86102h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86100f = obj;
            this.f86102h |= PKIFailureInfo.systemUnavail;
            return f.this.h(null, this);
        }
    }

    public f(c0 c0Var, go3.a aVar, r rVar, mx.c cVar) {
        this.getVerificationDataUseCase = c0Var;
        this.checkOldDrivingLicenceExistUseCase = aVar;
        this.getListVerificationDataUseCase = rVar;
        this.oldDrivingLicenceError = new dx.b.Business(co3.a.DRIVING_LICENCE_UPDATE_REQUIRED, null, cVar.c(un3.b.f199403c1), cVar.c(un3.b.f199398b1), null, cVar.c(un3.b.f199416f), cVar.c(un3.b.f199436j), 18, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (r1 == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(ho3.f.Params.AbstractC2006a.Main r17, tq.e<? super dx.i<? extends dx.b, co3.Result>> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ho3.f.g(ho3.f$a$a$a, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    public final Object h(Params.AbstractC2006a.Sub sub, tq.e<? super i<? extends dx.b, Result>> eVar) throws Throwable {
        c cVar;
        ?? r15;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f86102h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f86102h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objE = cVar.f86100f;
        Object objE2 = uq.b.e();
        int i16 = cVar.f86102h;
        if (i16 == 0) {
            u.b(objE);
            a0 a0VarC = sub.a().c();
            if (t.c(a0VarC, a0.i.f107870a) || t.c(a0VarC, a0.x0.f107901a) || (a0VarC instanceof a0.DynamicMultiDocument)) {
                boolean isOwner = sub.getSubDocument().getIsOwner();
                r15 = isOwner;
            } else {
                r15 = 1;
            }
            r rVar = this.getListVerificationDataUseCase;
            r.Params params = new r.Params(sub.a().c(), null, r15, sub.getSubDocument(), sub.getVerificationEntryPoint());
            cVar.f86098d = j.a(sub);
            cVar.f86099e = r15;
            cVar.f86102h = 1;
            objE = rVar.e(params, cVar);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objE);
        }
        i iVar = (i) objE;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(new Result(new Result.a.Sub((List) ((i.Right) iVar).b())));
        }
        throw new p();
    }

    public Object f(Params params, tq.e<? super i<? extends dx.b, Result>> eVar) {
        Params.AbstractC2006a paramsType = params.getParamsType();
        if (paramsType instanceof Params.AbstractC2006a.Main) {
            return g((Params.AbstractC2006a.Main) params.getParamsType(), eVar);
        }
        if (paramsType instanceof Params.AbstractC2006a.Sub) {
            return h((Params.AbstractC2006a.Sub) params.getParamsType(), eVar);
        }
        throw new p();
    }
}
