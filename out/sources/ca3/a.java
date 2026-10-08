package ca3;

import fr.t;
import hz.g;
import iy.c0;
import j14.n;
import java.util.Map;
import oq.r;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import vq.j;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0001:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u0005*\u00020\u0002H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0082@¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0082@¢\u0006\u0004\b\u0011\u0010\u000fJ\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0082@¢\u0006\u0004\b\u0012\u0010\u000fJ&\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lca3/a;", "Lgz/b;", "Lca3/a$a;", "", "Llb3/a;", "Lhz/b;", "Lca3/b;", "validateGroupUC", "Lj14/a;", "checkIsEmailCorrectUC", "Lj14/n;", "checkIsPhoneNumberCorrectUC", "<init>", "(Lca3/b;Lj14/a;Lj14/n;)V", "j", "(Lca3/a$a;Ltq/e;)Ljava/lang/Object;", "i", "l", "k", "params", "h", "a", "Lca3/b;", "b", "Lj14/a;", "c", "Lj14/n;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, Map<lb3.a, ? extends hz.b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ca3.b validateGroupUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkIsEmailCorrectUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n checkIsPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: ca3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lca3/a$a;", "Lgz/b$a;", "", "email", "", "isEmailChecked", "Lxw/h;", "phoneNumber", "isPhoneNumberChecked", "<init>", "(Ljava/lang/String;ZLxw/h;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "Lxw/h;", "()Lxw/h;", "d", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f24814e = PhoneNumber.f221634d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEmailChecked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final PhoneNumber phoneNumber;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPhoneNumberChecked;

        public Params(String str, boolean z15, PhoneNumber phoneNumber, boolean z16) {
            this.email = str;
            this.isEmailChecked = z15;
            this.phoneNumber = phoneNumber;
            this.isPhoneNumberChecked = z16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PhoneNumber getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsEmailChecked() {
            return this.isEmailChecked;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsPhoneNumberChecked() {
            return this.isPhoneNumberChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.email, params.email) && this.isEmailChecked == params.isEmailChecked && t.c(this.phoneNumber, params.phoneNumber) && this.isPhoneNumberChecked == params.isPhoneNumberChecked;
        }

        public int hashCode() {
            return (((((this.email.hashCode() * 31) + Boolean.hashCode(this.isEmailChecked)) * 31) + this.phoneNumber.hashCode()) * 31) + Boolean.hashCode(this.isPhoneNumberChecked);
        }

        public String toString() {
            return "Params(email=" + this.email + ", isEmailChecked=" + this.isEmailChecked + ", phoneNumber=" + this.phoneNumber + ", isPhoneNumberChecked=" + this.isPhoneNumberChecked + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f24819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f24820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f24821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f24822g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f24823h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f24824j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f24825k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f24826l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f24828n;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f24826l = obj;
            this.f24828n |= PKIFailureInfo.systemUnavail;
            return a.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f24829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f24830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f24831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f24832g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f24834j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f24832g = obj;
            this.f24834j |= PKIFailureInfo.systemUnavail;
            return a.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f24835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f24836e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f24838g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f24836e = obj;
            this.f24838g |= PKIFailureInfo.systemUnavail;
            return a.this.j(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f24839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f24840e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f24841f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f24842g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f24844j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f24842g = obj;
            this.f24844j |= PKIFailureInfo.systemUnavail;
            return a.this.k(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f24845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f24846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f24847f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f24848g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f24850j;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f24848g = obj;
            this.f24850j |= PKIFailureInfo.systemUnavail;
            return a.this.l(null, this);
        }
    }

    public a(ca3.b bVar, j14.a aVar, n nVar) {
        this.validateGroupUC = bVar;
        this.checkIsEmailCorrectUC = aVar;
        this.checkIsPhoneNumberCorrectUC = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Params params, tq.e<? super hz.b> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f24834j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f24834j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f24832g;
        Object objE = uq.b.e();
        int i16 = cVar.f24834j;
        if (i16 == 0) {
            u.b(objC);
            Params params2 = params.getIsEmailChecked() ? params : null;
            if (params2 == null) {
                return null;
            }
            j14.a aVar = this.checkIsEmailCorrectUC;
            j14.a.Params params3 = new j14.a.Params(c0.g(params.getEmail()), false, null, 6, null);
            cVar.f24829d = j.a(params);
            cVar.f24830e = j.a(params2);
            cVar.f24831f = 0;
            cVar.f24834j = 1;
            objC = aVar.c(params3, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        return ((g) objC).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Params params, tq.e<? super hz.b> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f24838g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f24838g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objD = dVar.f24836e;
        Object objE = uq.b.e();
        int i16 = dVar.f24838g;
        if (i16 == 0) {
            u.b(objD);
            ca3.b bVar = this.validateGroupUC;
            ca3.b.Params params2 = new ca3.b.Params(params.getIsEmailChecked(), params.getIsPhoneNumberChecked());
            dVar.f24835d = j.a(params);
            dVar.f24838g = 1;
            objD = bVar.d(params2, dVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objD);
        }
        return ((g) objD).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Params params, tq.e<? super hz.b> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f24844j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f24844j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objC = eVar2.f24842g;
        Object objE = uq.b.e();
        int i16 = eVar2.f24844j;
        if (i16 == 0) {
            u.b(objC);
            Params params2 = params.getIsPhoneNumberChecked() ? params : null;
            if (params2 == null) {
                return null;
            }
            n nVar = this.checkIsPhoneNumberCorrectUC;
            n.a.CheckNumber checkNumber = new n.a.CheckNumber(params.getPhoneNumber(), false, 2, null);
            eVar2.f24839d = j.a(params);
            eVar2.f24840e = j.a(params2);
            eVar2.f24841f = 0;
            eVar2.f24844j = 1;
            objC = nVar.c(checkNumber, eVar2);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        return ((g) objC).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(Params params, tq.e<? super hz.b> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f24850j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f24850j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objC = fVar.f24848g;
        Object objE = uq.b.e();
        int i16 = fVar.f24850j;
        if (i16 == 0) {
            u.b(objC);
            Params params2 = params.getIsPhoneNumberChecked() ? params : null;
            if (params2 == null) {
                return null;
            }
            n nVar = this.checkIsPhoneNumberCorrectUC;
            n.a.CheckPrefix checkPrefix = new n.a.CheckPrefix(params.getPhoneNumber(), false, 2, null);
            fVar.f24845d = j.a(params);
            fVar.f24846e = j.a(params2);
            fVar.f24847f = 0;
            fVar.f24850j = 1;
            objC = nVar.c(checkPrefix, fVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        return ((g) objC).a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x012a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0154  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(Params params, tq.e<? super Map<lb3.a, ? extends hz.b>> eVar) throws Throwable {
        b bVar;
        Params params2;
        Params params3;
        int i15;
        lb3.a aVar;
        r[] rVarArr;
        r[] rVarArr2;
        int i16;
        lb3.a aVar2;
        int i17;
        r[] rVarArr3;
        Params params4;
        Params params5;
        lb3.a aVar3;
        Object objL;
        Object obj;
        int i18;
        r[] rVarArr4;
        lb3.a aVar4;
        lb3.a aVar5;
        r[] rVarArr5;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i19 = bVar.f24828n;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f24828n = i19 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objI = bVar.f24826l;
        Object objE = uq.b.e();
        int i25 = bVar.f24828n;
        int i26 = 3;
        int i27 = 2;
        int i28 = 1;
        if (i25 == 0) {
            u.b(objI);
            r[] rVarArr6 = new r[4];
            lb3.a aVar6 = lb3.a.Group;
            bVar.f24819d = j.a(params);
            bVar.f24820e = params;
            bVar.f24821f = rVarArr6;
            bVar.f24822g = aVar6;
            bVar.f24823h = rVarArr6;
            bVar.f24824j = 0;
            bVar.f24825k = 0;
            bVar.f24828n = 1;
            Object objJ = j(params, bVar);
            if (objJ != objE) {
                params2 = params;
                params3 = params2;
                i15 = 0;
                aVar = aVar6;
                objI = objJ;
                rVarArr = rVarArr6;
                rVarArr2 = rVarArr;
                i16 = 0;
            }
            return objE;
        }
        if (i25 == 1) {
            i15 = bVar.f24825k;
            int i29 = bVar.f24824j;
            r[] rVarArr7 = (r[]) bVar.f24823h;
            lb3.a aVar7 = (lb3.a) bVar.f24822g;
            r[] rVarArr8 = (r[]) bVar.f24821f;
            params2 = (Params) bVar.f24820e;
            params3 = (Params) bVar.f24819d;
            u.b(objI);
            i16 = i29;
            rVarArr = rVarArr8;
            aVar = aVar7;
            rVarArr2 = rVarArr7;
        } else {
            if (i25 == 2) {
                i28 = bVar.f24825k;
                i17 = bVar.f24824j;
                rVarArr = (r[]) bVar.f24823h;
                aVar2 = (lb3.a) bVar.f24822g;
                rVarArr3 = (r[]) bVar.f24821f;
                params4 = (Params) bVar.f24820e;
                params5 = (Params) bVar.f24819d;
                u.b(objI);
                rVarArr[i28] = y.a(aVar2, objI);
                aVar3 = lb3.a.PhonePrefix;
                bVar.f24819d = j.a(params5);
                bVar.f24820e = params4;
                bVar.f24821f = rVarArr3;
                bVar.f24822g = aVar3;
                bVar.f24823h = rVarArr3;
                bVar.f24824j = i17;
                bVar.f24825k = 2;
                bVar.f24828n = 3;
                objL = l(params4, bVar);
                if (objL != objE) {
                    obj = objL;
                    i18 = i17;
                    rVarArr4 = rVarArr3;
                    rVarArr3[i27] = y.a(aVar3, obj);
                    aVar4 = lb3.a.PhoneNumber;
                    bVar.f24819d = j.a(params5);
                    bVar.f24820e = j.a(params4);
                    bVar.f24821f = rVarArr4;
                    bVar.f24822g = aVar4;
                    bVar.f24823h = rVarArr4;
                    bVar.f24824j = i18;
                    bVar.f24825k = 3;
                    bVar.f24828n = 4;
                    objI = k(params4, bVar);
                    if (objI != objE) {
                        aVar5 = aVar4;
                        rVarArr5 = rVarArr4;
                    }
                }
                return objE;
            }
            if (i25 == 3) {
                i27 = bVar.f24825k;
                int i35 = bVar.f24824j;
                r[] rVarArr9 = (r[]) bVar.f24823h;
                aVar3 = (lb3.a) bVar.f24822g;
                r[] rVarArr10 = (r[]) bVar.f24821f;
                Params params6 = (Params) bVar.f24820e;
                Params params7 = (Params) bVar.f24819d;
                u.b(objI);
                params5 = params7;
                params4 = params6;
                rVarArr3 = rVarArr9;
                obj = objI;
                i18 = i35;
                rVarArr4 = rVarArr10;
                rVarArr3[i27] = y.a(aVar3, obj);
                aVar4 = lb3.a.PhoneNumber;
                bVar.f24819d = j.a(params5);
                bVar.f24820e = j.a(params4);
                bVar.f24821f = rVarArr4;
                bVar.f24822g = aVar4;
                bVar.f24823h = rVarArr4;
                bVar.f24824j = i18;
                bVar.f24825k = 3;
                bVar.f24828n = 4;
                objI = k(params4, bVar);
                if (objI != objE) {
                    aVar5 = aVar4;
                    rVarArr5 = rVarArr4;
                }
                return objE;
            }
            if (i25 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i26 = bVar.f24825k;
            rVarArr4 = (r[]) bVar.f24823h;
            aVar5 = (lb3.a) bVar.f24822g;
            rVarArr5 = (r[]) bVar.f24821f;
            u.b(objI);
        }
        rVarArr4[i26] = y.a(aVar5, objI);
        return v0.l(rVarArr5);
        rVarArr2[i15] = y.a(aVar, objI);
        lb3.a aVar8 = lb3.a.Email;
        bVar.f24819d = j.a(params3);
        bVar.f24820e = params2;
        bVar.f24821f = rVarArr;
        bVar.f24822g = aVar8;
        bVar.f24823h = rVarArr;
        bVar.f24824j = i16;
        bVar.f24825k = 1;
        bVar.f24828n = 2;
        objI = i(params2, bVar);
        if (objI != objE) {
            int i36 = i16;
            aVar2 = aVar8;
            i17 = i36;
            rVarArr3 = rVarArr;
            params4 = params2;
            params5 = params3;
            rVarArr[i28] = y.a(aVar2, objI);
            aVar3 = lb3.a.PhonePrefix;
            bVar.f24819d = j.a(params5);
            bVar.f24820e = params4;
            bVar.f24821f = rVarArr3;
            bVar.f24822g = aVar3;
            bVar.f24823h = rVarArr3;
            bVar.f24824j = i17;
            bVar.f24825k = 2;
            bVar.f24828n = 3;
            objL = l(params4, bVar);
            if (objL != objE) {
                obj = objL;
                i18 = i17;
                rVarArr4 = rVarArr3;
                rVarArr3[i27] = y.a(aVar3, obj);
                aVar4 = lb3.a.PhoneNumber;
                bVar.f24819d = j.a(params5);
                bVar.f24820e = j.a(params4);
                bVar.f24821f = rVarArr4;
                bVar.f24822g = aVar4;
                bVar.f24823h = rVarArr4;
                bVar.f24824j = i18;
                bVar.f24825k = 3;
                bVar.f24828n = 4;
                objI = k(params4, bVar);
                if (objI != objE) {
                    aVar5 = aVar4;
                    rVarArr5 = rVarArr4;
                    rVarArr4[i26] = y.a(aVar5, objI);
                    return v0.l(rVarArr5);
                }
            }
        }
        return objE;
    }
}
