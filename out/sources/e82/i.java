package e82;

import fr.t;
import java.util.Map;
import mx.Label;
import oq.r;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Le82/i;", "Lgz/b;", "Le82/i$a;", "", "Lc82/a;", "Lhz/g;", "Le82/h;", "checkViolationDescriptionUseCase", "Le82/j;", "checkViolationPhotoUseCase", "<init>", "(Le82/h;Le82/j;)V", "params", "d", "(Le82/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Le82/h;", "b", "Le82/j;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b<Params, Map<c82.a, ? extends hz.g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h checkViolationDescriptionUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j checkViolationPhotoUseCase;

    /* JADX INFO: renamed from: e82.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001f"}, d2 = {"Le82/i$a;", "Lgz/b$a;", "", "wasReported", "Lmx/a;", "office", "entityName", "description", "hasPhoto", "<init>", "(ZLmx/a;Lmx/a;Lmx/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "f", "()Z", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "e", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean wasReported;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label office;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label entityName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPhoto;

        public Params(boolean z15, Label label, Label label2, Label label3, boolean z16) {
            this.wasReported = z15;
            this.office = label;
            this.entityName = label2;
            this.description = label3;
            this.hasPhoto = z16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getEntityName() {
            return this.entityName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getHasPhoto() {
            return this.hasPhoto;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getOffice() {
            return this.office;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.wasReported == params.wasReported && t.c(this.office, params.office) && t.c(this.entityName, params.entityName) && t.c(this.description, params.description) && this.hasPhoto == params.hasPhoto;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getWasReported() {
            return this.wasReported;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.wasReported) * 31) + this.office.hashCode()) * 31) + this.entityName.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.hasPhoto);
        }

        public String toString() {
            return "Params(wasReported=" + this.wasReported + ", office=" + this.office + ", entityName=" + this.entityName + ", description=" + this.description + ", hasPhoto=" + this.hasPhoto + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f48451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f48452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f48453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f48454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f48455h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f48456j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f48458l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f48456j = obj;
            this.f48458l |= PKIFailureInfo.systemUnavail;
            return i.this.d(null, this);
        }
    }

    public i(h hVar, j jVar) {
        this.checkViolationDescriptionUseCase = hVar;
        this.checkViolationPhotoUseCase = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:35:0x011e  */
    /* JADX WARN: Code duplicated, block: B:39:0x014b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super Map<c82.a, ? extends hz.g>> eVar) throws Throwable {
        b bVar;
        r[] rVarArr;
        c82.a aVar;
        Object obj;
        int i15;
        r[] rVarArr2;
        Params params2;
        int i16;
        r[] rVarArr3;
        c82.a aVar2;
        Object objF;
        Params params3;
        c82.a aVar3;
        r[] rVarArr4;
        c82.a aVar4;
        r[] rVarArr5;
        r[] rVarArr6;
        Params params4;
        c82.a aVar5;
        r[] rVarArr7;
        r[] rVarArr8;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i17 = bVar.f48458l;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f48458l = i17 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objF2 = bVar.f48456j;
        Object objE = uq.b.e();
        int i18 = bVar.f48458l;
        int i19 = 3;
        int i25 = 2;
        int i26 = 1;
        if (i18 == 0) {
            u.b(objF2);
            rVarArr = new r[4];
            aVar = c82.a.OFFICE;
            if (params.getWasReported()) {
                h hVar = this.checkViolationDescriptionUseCase;
                h.a.c cVar = new h.a.c(params.getOffice());
                bVar.f48451d = params;
                bVar.f48452e = rVarArr;
                bVar.f48453f = rVarArr;
                bVar.f48454g = aVar;
                bVar.f48455h = 0;
                bVar.f48458l = 1;
                objF2 = hVar.f(cVar, bVar);
                if (objF2 != objE) {
                    params2 = params;
                    i16 = 0;
                    rVarArr3 = rVarArr;
                }
            } else {
                obj = hz.g.b.f86853b;
                i15 = 0;
                rVarArr2 = rVarArr;
                rVarArr2[i15] = y.a(aVar, obj);
                aVar2 = c82.a.SUBJECT;
                h hVar2 = this.checkViolationDescriptionUseCase;
                h.a.b bVar2 = new h.a.b(params.getEntityName());
                bVar.f48451d = params;
                bVar.f48452e = rVarArr;
                bVar.f48453f = rVarArr;
                bVar.f48454g = aVar2;
                bVar.f48455h = 1;
                bVar.f48458l = 2;
                objF = hVar2.f(bVar2, bVar);
                if (objF != objE) {
                    params3 = params;
                    aVar3 = aVar2;
                    objF2 = objF;
                    rVarArr4 = rVarArr;
                    rVarArr4[i26] = y.a(aVar3, objF2);
                    aVar4 = c82.a.DESCRIPTION;
                    h hVar3 = this.checkViolationDescriptionUseCase;
                    h.a.C1128a c1128a = new h.a.C1128a(params3.getDescription());
                    bVar.f48451d = params3;
                    bVar.f48452e = rVarArr;
                    bVar.f48453f = rVarArr;
                    bVar.f48454g = aVar4;
                    bVar.f48455h = 2;
                    bVar.f48458l = 3;
                    objF2 = hVar3.f(c1128a, bVar);
                    if (objF2 != objE) {
                        rVarArr5 = rVarArr;
                        rVarArr6 = rVarArr5;
                        params4 = params3;
                        rVarArr5[i25] = y.a(aVar4, objF2);
                        aVar5 = c82.a.PHOTO;
                        j jVar = this.checkViolationPhotoUseCase;
                        j.Params params5 = new j.Params(params4.getHasPhoto());
                        bVar.f48451d = vq.j.a(params4);
                        bVar.f48452e = rVarArr6;
                        bVar.f48453f = rVarArr6;
                        bVar.f48454g = aVar5;
                        bVar.f48455h = 3;
                        bVar.f48458l = 4;
                        objF2 = jVar.d(params5, bVar);
                        if (objF2 != objE) {
                            rVarArr7 = rVarArr6;
                            rVarArr8 = rVarArr7;
                            rVarArr7[i19] = y.a(aVar5, objF2);
                            return v0.l(rVarArr8);
                        }
                    }
                }
            }
            return objE;
        }
        if (i18 == 1) {
            i16 = bVar.f48455h;
            aVar = (c82.a) bVar.f48454g;
            rVarArr = (r[]) bVar.f48453f;
            rVarArr3 = (r[]) bVar.f48452e;
            params2 = (Params) bVar.f48451d;
            u.b(objF2);
        } else {
            if (i18 == 2) {
                i26 = bVar.f48455h;
                aVar3 = (c82.a) bVar.f48454g;
                rVarArr4 = (r[]) bVar.f48453f;
                rVarArr = (r[]) bVar.f48452e;
                params3 = (Params) bVar.f48451d;
                u.b(objF2);
                rVarArr4[i26] = y.a(aVar3, objF2);
                aVar4 = c82.a.DESCRIPTION;
                h hVar4 = this.checkViolationDescriptionUseCase;
                h.a.C1128a c1128a2 = new h.a.C1128a(params3.getDescription());
                bVar.f48451d = params3;
                bVar.f48452e = rVarArr;
                bVar.f48453f = rVarArr;
                bVar.f48454g = aVar4;
                bVar.f48455h = 2;
                bVar.f48458l = 3;
                objF2 = hVar4.f(c1128a2, bVar);
                if (objF2 != objE) {
                    rVarArr5 = rVarArr;
                    rVarArr6 = rVarArr5;
                    params4 = params3;
                    rVarArr5[i25] = y.a(aVar4, objF2);
                    aVar5 = c82.a.PHOTO;
                    j jVar2 = this.checkViolationPhotoUseCase;
                    j.Params params6 = new j.Params(params4.getHasPhoto());
                    bVar.f48451d = vq.j.a(params4);
                    bVar.f48452e = rVarArr6;
                    bVar.f48453f = rVarArr6;
                    bVar.f48454g = aVar5;
                    bVar.f48455h = 3;
                    bVar.f48458l = 4;
                    objF2 = jVar2.d(params6, bVar);
                    if (objF2 != objE) {
                        rVarArr7 = rVarArr6;
                        rVarArr8 = rVarArr7;
                    }
                }
                return objE;
            }
            if (i18 == 3) {
                i25 = bVar.f48455h;
                aVar4 = (c82.a) bVar.f48454g;
                rVarArr5 = (r[]) bVar.f48453f;
                rVarArr6 = (r[]) bVar.f48452e;
                params4 = (Params) bVar.f48451d;
                u.b(objF2);
                rVarArr5[i25] = y.a(aVar4, objF2);
                aVar5 = c82.a.PHOTO;
                j jVar3 = this.checkViolationPhotoUseCase;
                j.Params params7 = new j.Params(params4.getHasPhoto());
                bVar.f48451d = vq.j.a(params4);
                bVar.f48452e = rVarArr6;
                bVar.f48453f = rVarArr6;
                bVar.f48454g = aVar5;
                bVar.f48455h = 3;
                bVar.f48458l = 4;
                objF2 = jVar3.d(params7, bVar);
                if (objF2 != objE) {
                    rVarArr7 = rVarArr6;
                    rVarArr8 = rVarArr7;
                }
                return objE;
            }
            if (i18 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i19 = bVar.f48455h;
            aVar5 = (c82.a) bVar.f48454g;
            rVarArr7 = (r[]) bVar.f48453f;
            rVarArr8 = (r[]) bVar.f48452e;
            u.b(objF2);
        }
        rVarArr7[i19] = y.a(aVar5, objF2);
        return v0.l(rVarArr8);
        obj = (hz.g) objF2;
        Params params8 = params2;
        i15 = i16;
        params = params8;
        r[] rVarArr9 = rVarArr3;
        rVarArr2 = rVarArr;
        rVarArr = rVarArr9;
        rVarArr2[i15] = y.a(aVar, obj);
        aVar2 = c82.a.SUBJECT;
        h hVar5 = this.checkViolationDescriptionUseCase;
        h.a.b bVar3 = new h.a.b(params.getEntityName());
        bVar.f48451d = params;
        bVar.f48452e = rVarArr;
        bVar.f48453f = rVarArr;
        bVar.f48454g = aVar2;
        bVar.f48455h = 1;
        bVar.f48458l = 2;
        objF = hVar5.f(bVar3, bVar);
        if (objF != objE) {
            params3 = params;
            aVar3 = aVar2;
            objF2 = objF;
            rVarArr4 = rVarArr;
            rVarArr4[i26] = y.a(aVar3, objF2);
            aVar4 = c82.a.DESCRIPTION;
            h hVar6 = this.checkViolationDescriptionUseCase;
            h.a.C1128a c1128a3 = new h.a.C1128a(params3.getDescription());
            bVar.f48451d = params3;
            bVar.f48452e = rVarArr;
            bVar.f48453f = rVarArr;
            bVar.f48454g = aVar4;
            bVar.f48455h = 2;
            bVar.f48458l = 3;
            objF2 = hVar6.f(c1128a3, bVar);
            if (objF2 != objE) {
                rVarArr5 = rVarArr;
                rVarArr6 = rVarArr5;
                params4 = params3;
                rVarArr5[i25] = y.a(aVar4, objF2);
                aVar5 = c82.a.PHOTO;
                j jVar4 = this.checkViolationPhotoUseCase;
                j.Params params9 = new j.Params(params4.getHasPhoto());
                bVar.f48451d = vq.j.a(params4);
                bVar.f48452e = rVarArr6;
                bVar.f48453f = rVarArr6;
                bVar.f48454g = aVar5;
                bVar.f48455h = 3;
                bVar.f48458l = 4;
                objF2 = jVar4.d(params9, bVar);
                if (objF2 != objE) {
                    rVarArr7 = rVarArr6;
                    rVarArr8 = rVarArr7;
                    rVarArr7[i19] = y.a(aVar5, objF2);
                    return v0.l(rVarArr8);
                }
            }
        }
        return objE;
    }
}
