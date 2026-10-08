package l61;

import i61.ChildPassportApplicationDraft;
import java.util.concurrent.CancellationException;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ll61/v;", "", "Ll61/v$a;", "Loq/i0;", "Lk61/b;", "draftStorageRepository", "Lh61/a;", "childPassportApplicationContainersInteractor", "<init>", "(Lk61/b;Lh61/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Ll61/v$a;Ltq/e;)Ljava/lang/Object;", "a", "Lk61/b;", "b", "Lh61/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k61.b draftStorageRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h61.a childPassportApplicationContainersInteractor;

    /* JADX INFO: renamed from: l61.v$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ll61/v$a;", "Lgz/b$a;", "Li61/e;", "draft", "<init>", "(Li61/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li61/e;", "()Li61/e;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ChildPassportApplicationDraft draft;

        public Params(ChildPassportApplicationDraft eVar) {
            this.draft = eVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ChildPassportApplicationDraft getDraft() {
            return this.draft;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.draft, ((Params) other).draft);
        }

        public int hashCode() {
            return this.draft.hashCode();
        }

        public String toString() {
            return "Params(draft=" + this.draft + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f116487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116489f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f116490g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f116491h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f116492j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f116493k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f116494l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f116495m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f116496n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f116497p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f116498q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f116499r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f116500s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f116501t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f116503w;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f116501t = obj;
            this.f116503w |= PKIFailureInfo.systemUnavail;
            return v.this.d(null, this);
        }
    }

    public v(k61.b bVar, h61.a aVar) {
        this.draftStorageRepository = bVar;
        this.childPassportApplicationContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0140 A[Catch: Exception -> 0x0051, c -> 0x0054, CancellationException -> 0x0057, TryCatch #6 {Exception -> 0x0051, blocks: (B:14:0x004c, B:57:0x018b, B:58:0x018d, B:61:0x019e, B:64:0x01ac, B:48:0x0138, B:51:0x0140, B:53:0x0144, B:59:0x0198, B:60:0x019d, B:34:0x00b0, B:43:0x00fb, B:37:0x00bd, B:39:0x00ca, B:44:0x00ff), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0144 A[Catch: Exception -> 0x0051, c -> 0x0054, CancellationException -> 0x0057, TryCatch #6 {Exception -> 0x0051, blocks: (B:14:0x004c, B:57:0x018b, B:58:0x018d, B:61:0x019e, B:64:0x01ac, B:48:0x0138, B:51:0x0140, B:53:0x0144, B:59:0x0198, B:60:0x019d, B:34:0x00b0, B:43:0x00fb, B:37:0x00bd, B:39:0x00ca, B:44:0x00ff), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x018a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0198 A[Catch: Exception -> 0x0051, c -> 0x0054, CancellationException -> 0x0057, TryCatch #6 {Exception -> 0x0051, blocks: (B:14:0x004c, B:57:0x018b, B:58:0x018d, B:61:0x019e, B:64:0x01ac, B:48:0x0138, B:51:0x0140, B:53:0x0144, B:59:0x0198, B:60:0x019d, B:34:0x00b0, B:43:0x00fb, B:37:0x00bd, B:39:0x00ca, B:44:0x00ff), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        b bVar;
        Object objB;
        dx.j<dx.b> jVarA;
        Params params2;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar2;
        ex.b bVar3;
        ex.b bVar4;
        int i19;
        ex.b bVar5;
        dx.i iVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f116503w;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f116503w = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objF = bVar.f116501t;
        Object objE = uq.b.e();
        ?? r15 = bVar.f116503w;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objF);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    if (this.childPassportApplicationContainersInteractor.a()) {
                        k61.b bVar6 = this.draftStorageRepository;
                        ChildPassportApplicationDraft draft = params.getDraft();
                        bVar.f116487d = vq.j.a(params);
                        bVar.f116488e = jVarA;
                        bVar.f116489f = vq.j.a(aVar);
                        bVar.f116490g = vq.j.a(aVar);
                        bVar.f116491h = aVar;
                        bVar.f116494l = 0;
                        bVar.f116495m = 0;
                        bVar.f116496n = 0;
                        bVar.f116497p = 0;
                        bVar.f116498q = 0;
                        bVar.f116503w = 1;
                        objF = bVar6.h(draft, bVar);
                        if (objF != objE) {
                            bVar5 = aVar;
                            iVar = (dx.i) objF;
                        }
                    } else {
                        k61.b bVar7 = this.draftStorageRepository;
                        ChildPassportApplicationDraft draft2 = params.getDraft();
                        bVar.f116487d = vq.j.a(params);
                        bVar.f116488e = jVarA;
                        bVar.f116489f = vq.j.a(aVar);
                        bVar.f116490g = vq.j.a(aVar);
                        bVar.f116491h = aVar;
                        bVar.f116494l = 0;
                        bVar.f116495m = 0;
                        bVar.f116496n = 0;
                        bVar.f116497p = 0;
                        bVar.f116498q = 0;
                        bVar.f116503w = 2;
                        objF = bVar7.f(draft2, bVar);
                        if (objF != objE) {
                            params2 = params;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar2 = aVar;
                            bVar3 = bVar2;
                            bVar4 = bVar3;
                            i19 = 0;
                            iVar = (dx.i) objF;
                            if (!(iVar instanceof dx.i.Left)) {
                                bVar5 = bVar2;
                            } else {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                byte[] bArr = (byte[]) ((dx.i.Right) iVar).b();
                                h61.a aVar2 = this.childPassportApplicationContainersInteractor;
                                bVar.f116487d = vq.j.a(params2);
                                bVar.f116488e = jVarA;
                                bVar.f116489f = vq.j.a(bVar4);
                                bVar.f116490g = vq.j.a(bVar3);
                                bVar.f116491h = bVar2;
                                bVar.f116492j = vq.j.a(iVar);
                                bVar.f116493k = vq.j.a(bArr);
                                bVar.f116494l = i19;
                                bVar.f116495m = i18;
                                bVar.f116496n = i17;
                                bVar.f116497p = i16;
                                bVar.f116498q = i15;
                                bVar.f116499r = 0;
                                bVar.f116500s = 0;
                                bVar.f116503w = 3;
                                objF = aVar2.k(bArr, bVar);
                                if (objF != objE) {
                                    bVar5 = bVar2;
                                    iVar = (dx.i) objF;
                                }
                            }
                        }
                    }
                    return objE;
                }
                if (r15 != 1) {
                    try {
                        if (r15 == 2) {
                            int i26 = bVar.f116498q;
                            int i27 = bVar.f116497p;
                            int i28 = bVar.f116496n;
                            int i29 = bVar.f116495m;
                            int i35 = bVar.f116494l;
                            bVar2 = (ex.b) bVar.f116491h;
                            ex.b bVar8 = (ex.b) bVar.f116490g;
                            ex.b bVar9 = (ex.b) bVar.f116489f;
                            dx.j<dx.b> jVar = (dx.j) bVar.f116488e;
                            params2 = (Params) bVar.f116487d;
                            try {
                                oq.u.b(objF);
                                i15 = i26;
                                jVarA = jVar;
                                bVar4 = bVar9;
                                bVar3 = bVar8;
                                i19 = i35;
                                i18 = i29;
                                i17 = i28;
                                i16 = i27;
                                iVar = (dx.i) objF;
                                if (!(iVar instanceof dx.i.Left)) {
                                    if (iVar instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    byte[] bArr2 = (byte[]) ((dx.i.Right) iVar).b();
                                    h61.a aVar3 = this.childPassportApplicationContainersInteractor;
                                    bVar.f116487d = vq.j.a(params2);
                                    bVar.f116488e = jVarA;
                                    bVar.f116489f = vq.j.a(bVar4);
                                    bVar.f116490g = vq.j.a(bVar3);
                                    bVar.f116491h = bVar2;
                                    bVar.f116492j = vq.j.a(iVar);
                                    bVar.f116493k = vq.j.a(bArr2);
                                    bVar.f116494l = i19;
                                    bVar.f116495m = i18;
                                    bVar.f116496n = i17;
                                    bVar.f116497p = i16;
                                    bVar.f116498q = i15;
                                    bVar.f116499r = 0;
                                    bVar.f116500s = 0;
                                    bVar.f116503w = 3;
                                    objF = aVar3.k(bArr2, bVar);
                                    if (objF != objE) {
                                        bVar5 = bVar2;
                                    }
                                    return objE;
                                }
                                bVar5 = bVar2;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                dx.i iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        } else {
                            if (r15 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar5 = (ex.b) bVar.f116491h;
                            oq.u.b(objF);
                        }
                        iVar = (dx.i) objF;
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } else {
                    bVar5 = (ex.b) bVar.f116491h;
                    oq.u.b(objF);
                    iVar = (dx.i) objF;
                }
                bVar5.a(iVar);
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
