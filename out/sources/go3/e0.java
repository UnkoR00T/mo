package go3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import k34.WruDocumentData;
import k34.WruDocumentItem;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lgo3/e0;", "", "Lgo3/e0$a;", "", "Lco3/q;", "Liy/e0;", "signedDataDecoder", "Liy/a;", "base64Coder", "Lgo3/x0;", "wruCommonItemsOrderUseCase", "Lq34/t;", "decodeWruDataUseCase", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Liy/e0;Liy/a;Lgo3/x0;Lq34/t;Lbo3/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lgo3/e0$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/e0;", "b", "Liy/a;", "c", "Lgo3/x0;", "Lq34/t;", "e", "Lbo3/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.e0 signedDataDecoder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x0 wruCommonItemsOrderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q34.t decodeWruDataUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: go3.e0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/e0$a;", "Lgz/b$a;", "Lk34/a0;", "scope", "<init>", "(Lk34/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/a0;", "()Lk34/a0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75379f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75380g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f75381h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f75382j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f75383k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75384l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f75385m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75386n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f75387p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f75388q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f75389r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f75391t;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75389r = obj;
            this.f75391t |= PKIFailureInfo.systemUnavail;
            return e0.this.d(null, this);
        }
    }

    public e0(iy.e0 e0Var, iy.a aVar, x0 x0Var, q34.t tVar, bo3.a aVar2) {
        this.signedDataDecoder = e0Var;
        this.base64Coder = aVar;
        this.wruCommonItemsOrderUseCase = x0Var;
        this.decodeWruDataUseCase = tVar;
        this.verificationContainersInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x013c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0172 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, LOOP:0: B:43:0x016c->B:45:0x0172, LOOP_END, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:42:0x013d, B:43:0x016c, B:45:0x0172, B:46:0x0189, B:47:0x019c, B:49:0x01a2, B:50:0x01b9, B:58:0x01d8, B:61:0x01e6, B:38:0x00e3), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a2 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, LOOP:1: B:47:0x019c->B:49:0x01a2, LOOP_END, TryCatch #1 {Exception -> 0x004f, blocks: (B:14:0x004a, B:42:0x013d, B:43:0x016c, B:45:0x0172, B:46:0x0189, B:47:0x019c, B:49:0x01a2, B:50:0x01b9, B:58:0x01d8, B:61:0x01e6, B:38:0x00e3), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:67:0x0200  */
    /* JADX WARN: Code duplicated, block: B:68:0x020e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0212  */
    /* JADX WARN: Code duplicated, block: B:73:0x021f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends co3.q>>> eVar) throws Throwable {
        b bVar;
        String message;
        dx.i iVarA;
        Object objB;
        Params params2;
        ex.b bVar2;
        ex.b bVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar4;
        dx.j<dx.b> jVar;
        int i19;
        ex.b bVar5;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it4;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f75391t;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f75391t = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        b bVar6 = bVar;
        Object objC = bVar6.f75389r;
        Object objE = uq.b.e();
        ?? r15 = bVar6.f75391t;
        try {
            try {
                try {
                    if (r15 == 0) {
                        oq.u.b(objC);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            bo3.a aVar2 = this.verificationContainersInteractor;
                            k34.a0 scope = params.getScope();
                            bVar6.f75377d = vq.j.a(params);
                            bVar6.f75378e = jVarA;
                            bVar6.f75379f = vq.j.a(aVar);
                            bVar6.f75380g = aVar;
                            bVar6.f75381h = aVar;
                            bVar6.f75384l = 0;
                            bVar6.f75385m = 0;
                            bVar6.f75386n = 0;
                            bVar6.f75387p = 0;
                            bVar6.f75388q = 0;
                            bVar6.f75391t = 1;
                            Object objV = bo3.a.v(aVar2, scope, null, bVar6, 2, null);
                            if (objV != objE) {
                                params2 = params;
                                bVar2 = aVar;
                                bVar3 = bVar2;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                bVar4 = bVar3;
                                objC = objV;
                                jVar = jVarA;
                                i19 = 0;
                                String str = (String) bVar2.a((dx.i) objC);
                                ex.b bVar7 = bVar3;
                                String strDecode = this.signedDataDecoder.decode((byte[]) bVar4.a(iy.a.c(this.base64Coder, str, null, 2, null)));
                                q34.t tVar = this.decodeWruDataUseCase;
                                q34.t.Params params3 = new q34.t.Params(strDecode);
                                bVar6.f75377d = vq.j.a(params2);
                                bVar6.f75378e = jVar;
                                bVar6.f75379f = vq.j.a(bVar7);
                                bVar6.f75380g = vq.j.a(bVar4);
                                bVar6.f75381h = bVar4;
                                bVar6.f75382j = vq.j.a(str);
                                bVar6.f75383k = vq.j.a(strDecode);
                                bVar6.f75384l = i19;
                                bVar6.f75385m = i18;
                                bVar6.f75386n = i17;
                                bVar6.f75387p = i16;
                                bVar6.f75388q = i15;
                                bVar6.f75391t = 2;
                                objC = tVar.c(params3, bVar6);
                                if (objC != objE) {
                                    bVar5 = bVar4;
                                    WruDocumentData wruDocumentData = (WruDocumentData) bVar5.a((dx.i) objC);
                                    co3.q.b bVar8 = new co3.q.b(co3.p.PICTURE);
                                    List<WruDocumentItem> listB = this.wruCommonItemsOrderUseCase.b(new x0.Params(wruDocumentData.c()));
                                    arrayList = new ArrayList(pq.v.y(listB, 10));
                                    it = listB.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(new co3.q.a(((WruDocumentItem) it.next()).getLabel().getText()));
                                    }
                                    List<WruDocumentItem> listB2 = wruDocumentData.b();
                                    arrayList2 = new ArrayList(pq.v.y(listB2, 10));
                                    it4 = listB2.iterator();
                                    while (it4.hasNext()) {
                                        arrayList2.add(new co3.q.a(((WruDocumentItem) it4.next()).getLabel().getText()));
                                    }
                                    return new dx.i.Right(pq.v.L0(pq.v.L0(pq.v.e(bVar8), arrayList), arrayList2));
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (r15 == 1) {
                        int i26 = bVar6.f75388q;
                        int i27 = bVar6.f75387p;
                        int i28 = bVar6.f75386n;
                        int i29 = bVar6.f75385m;
                        int i35 = bVar6.f75384l;
                        ex.b bVar9 = (ex.b) bVar6.f75381h;
                        bVar4 = (ex.b) bVar6.f75380g;
                        ex.b bVar10 = (ex.b) bVar6.f75379f;
                        dx.j<dx.b> jVar2 = (dx.j) bVar6.f75378e;
                        params2 = (Params) bVar6.f75377d;
                        try {
                            oq.u.b(objC);
                            i15 = i26;
                            jVar = jVar2;
                            bVar3 = bVar10;
                            bVar2 = bVar9;
                            i19 = i35;
                            i18 = i29;
                            i17 = i28;
                            i16 = i27;
                            String str2 = (String) bVar2.a((dx.i) objC);
                            ex.b bVar11 = bVar3;
                            String strDecode2 = this.signedDataDecoder.decode((byte[]) bVar4.a(iy.a.c(this.base64Coder, str2, null, 2, null)));
                            q34.t tVar2 = this.decodeWruDataUseCase;
                            q34.t.Params params4 = new q34.t.Params(strDecode2);
                            bVar6.f75377d = vq.j.a(params2);
                            bVar6.f75378e = jVar;
                            bVar6.f75379f = vq.j.a(bVar11);
                            bVar6.f75380g = vq.j.a(bVar4);
                            bVar6.f75381h = bVar4;
                            bVar6.f75382j = vq.j.a(str2);
                            bVar6.f75383k = vq.j.a(strDecode2);
                            bVar6.f75384l = i19;
                            bVar6.f75385m = i18;
                            bVar6.f75386n = i17;
                            bVar6.f75387p = i16;
                            bVar6.f75388q = i15;
                            bVar6.f75391t = 2;
                            objC = tVar2.c(params4, bVar6);
                            if (objC != objE) {
                                bVar5 = bVar4;
                            }
                            return objE;
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            r15 = jVar2;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (r15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar5 = (ex.b) bVar6.f75381h;
                    oq.u.b(objC);
                    WruDocumentData wruDocumentData2 = (WruDocumentData) bVar5.a((dx.i) objC);
                    co3.q.b bVar12 = new co3.q.b(co3.p.PICTURE);
                    List<WruDocumentItem> listB3 = this.wruCommonItemsOrderUseCase.b(new x0.Params(wruDocumentData2.c()));
                    arrayList = new ArrayList(pq.v.y(listB3, 10));
                    it = listB3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new co3.q.a(((WruDocumentItem) it.next()).getLabel().getText()));
                    }
                    List<WruDocumentItem> listB4 = wruDocumentData2.b();
                    arrayList2 = new ArrayList(pq.v.y(listB4, 10));
                    it4 = listB4.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(new co3.q.a(((WruDocumentItem) it4.next()).getLabel().getText()));
                    }
                    return new dx.i.Right(pq.v.L0(pq.v.L0(pq.v.e(bVar12), arrayList), arrayList2));
                } catch (Exception e26) {
                    e = e26;
                }
            } catch (CancellationException e27) {
                throw e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
